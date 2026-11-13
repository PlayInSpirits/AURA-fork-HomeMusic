.class public Lcom/google/android/material/textfield/TextInputLayout;
.super Landroid/widget/LinearLayout;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final N0:[[I


# instance fields
.field public A:Ldefpackage/gs4;

.field public A0:Landroid/content/res/ColorStateList;

.field public B:Ldefpackage/mh;

.field public B0:I

.field public C:I

.field public C0:I

.field public D:I

.field public D0:I

.field public E:Ljava/lang/CharSequence;

.field public E0:I

.field public F:Z

.field public F0:I

.field public G:Ldefpackage/mh;

.field public G0:Z

.field public H:Landroid/content/res/ColorStateList;

.field public final H0:Ldefpackage/k40;

.field public I:I

.field public I0:Z

.field public J:Ldefpackage/u51;

.field public J0:Z

.field public K:Ldefpackage/u51;

.field public K0:Landroid/animation/ValueAnimator;

.field public L:Landroid/content/res/ColorStateList;

.field public L0:Z

.field public M:Landroid/content/res/ColorStateList;

.field public M0:Z

.field public N:Landroid/content/res/ColorStateList;

.field public O:Landroid/content/res/ColorStateList;

.field public P:Z

.field public Q:Ljava/lang/CharSequence;

.field public R:Z

.field public S:Ldefpackage/fi2;

.field public T:Ldefpackage/fi2;

.field public U:Landroid/graphics/drawable/StateListDrawable;

.field public V:Z

.field public W:Ldefpackage/fi2;

.field public a0:Ldefpackage/fi2;

.field public b0:Ldefpackage/bc4;

.field public c0:Z

.field public final d0:I

.field public e0:I

.field public f0:I

.field public g0:I

.field public h0:I

.field public i0:I

.field public j0:I

.field public k0:I

.field public final l0:Landroid/graphics/Rect;

.field public final m0:Landroid/graphics/Rect;

.field public final n:Landroid/widget/FrameLayout;

.field public final n0:Landroid/graphics/RectF;

.field public final o:Ldefpackage/el4;

.field public o0:Landroid/graphics/Typeface;

.field public final p:Ldefpackage/g11;

.field public p0:Landroid/graphics/drawable/ColorDrawable;

.field public q:Landroid/widget/EditText;

.field public q0:I

.field public r:Ljava/lang/CharSequence;

.field public final r0:Ljava/util/LinkedHashSet;

.field public s:I

.field public s0:Landroid/graphics/drawable/ColorDrawable;

.field public t:I

.field public t0:I

.field public u:I

.field public u0:Landroid/graphics/drawable/Drawable;

.field public v:I

.field public v0:Landroid/content/res/ColorStateList;

.field public final w:Ldefpackage/cy1;

.field public w0:Landroid/content/res/ColorStateList;

.field public x:Z

.field public x0:I

.field public y:I

.field public y0:I

.field public z:Z

.field public z0:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const v0, 0x10100a7

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    new-array v1, v1, [I

    .line 10
    .line 11
    filled-new-array {v0, v1}, [[I

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcom/google/android/material/textfield/TextInputLayout;->N0:[[I

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 893
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/textfield/TextInputLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f040549

    .line 892
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/textfield/TextInputLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 20

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
    const v7, 0x7f1403c1

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    invoke-static {v1, v2, v4, v7}, Ldefpackage/su3;->H(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {v0, v1, v2, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 17
    .line 18
    .line 19
    const/4 v8, -0x1

    .line 20
    iput v8, v0, Lcom/google/android/material/textfield/TextInputLayout;->s:I

    .line 21
    .line 22
    iput v8, v0, Lcom/google/android/material/textfield/TextInputLayout;->t:I

    .line 23
    .line 24
    iput v8, v0, Lcom/google/android/material/textfield/TextInputLayout;->u:I

    .line 25
    .line 26
    iput v8, v0, Lcom/google/android/material/textfield/TextInputLayout;->v:I

    .line 27
    .line 28
    new-instance v1, Ldefpackage/cy1;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Ldefpackage/cy1;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    .line 31
    .line 32
    .line 33
    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->w:Ldefpackage/cy1;

    .line 34
    .line 35
    new-instance v1, Ldefpackage/tb4;

    .line 36
    .line 37
    const/4 v9, 0x4

    .line 38
    invoke-direct {v1, v9}, Ldefpackage/tb4;-><init>(I)V

    .line 39
    .line 40
    .line 41
    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->A:Ldefpackage/gs4;

    .line 42
    .line 43
    new-instance v1, Landroid/graphics/Rect;

    .line 44
    .line 45
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->l0:Landroid/graphics/Rect;

    .line 49
    .line 50
    new-instance v1, Landroid/graphics/Rect;

    .line 51
    .line 52
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->m0:Landroid/graphics/Rect;

    .line 56
    .line 57
    new-instance v1, Landroid/graphics/RectF;

    .line 58
    .line 59
    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->n0:Landroid/graphics/RectF;

    .line 63
    .line 64
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 65
    .line 66
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->r0:Ljava/util/LinkedHashSet;

    .line 70
    .line 71
    new-instance v1, Ldefpackage/k40;

    .line 72
    .line 73
    invoke-direct {v1, v0}, Ldefpackage/k40;-><init>(Landroid/view/ViewGroup;)V

    .line 74
    .line 75
    .line 76
    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->H0:Ldefpackage/k40;

    .line 77
    .line 78
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    const/4 v10, 0x1

    .line 83
    invoke-virtual {v0, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 84
    .line 85
    .line 86
    const/4 v11, 0x0

    .line 87
    invoke-virtual {v0, v11}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->setAddStatesFromChildren(Z)V

    .line 91
    .line 92
    .line 93
    new-instance v12, Landroid/widget/FrameLayout;

    .line 94
    .line 95
    invoke-direct {v12, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 96
    .line 97
    .line 98
    iput-object v12, v0, Lcom/google/android/material/textfield/TextInputLayout;->n:Landroid/widget/FrameLayout;

    .line 99
    .line 100
    invoke-virtual {v12, v10}, Landroid/view/ViewGroup;->setAddStatesFromChildren(Z)V

    .line 101
    .line 102
    .line 103
    sget-object v5, Ldefpackage/yd;->a:Landroid/view/animation/LinearInterpolator;

    .line 104
    .line 105
    iput-object v5, v1, Ldefpackage/k40;->W:Landroid/animation/TimeInterpolator;

    .line 106
    .line 107
    invoke-virtual {v1, v11}, Ldefpackage/k40;->i(Z)V

    .line 108
    .line 109
    .line 110
    iput-object v5, v1, Ldefpackage/k40;->V:Landroid/animation/TimeInterpolator;

    .line 111
    .line 112
    invoke-virtual {v1, v11}, Ldefpackage/k40;->i(Z)V

    .line 113
    .line 114
    .line 115
    const v5, 0x800033

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, v5}, Ldefpackage/k40;->l(I)V

    .line 119
    .line 120
    .line 121
    const/16 v13, 0x16

    .line 122
    .line 123
    const/16 v14, 0x14

    .line 124
    .line 125
    const/16 v15, 0x28

    .line 126
    .line 127
    const/16 v1, 0x2d

    .line 128
    .line 129
    const/16 v5, 0x31

    .line 130
    .line 131
    filled-new-array {v13, v14, v15, v1, v5}, [I

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    move/from16 v16, v1

    .line 136
    .line 137
    move-object v1, v3

    .line 138
    sget-object v3, Ldefpackage/ht3;->X:[I

    .line 139
    .line 140
    move/from16 v17, v5

    .line 141
    .line 142
    const v5, 0x7f1403c1

    .line 143
    .line 144
    .line 145
    move/from16 v14, v16

    .line 146
    .line 147
    move/from16 v13, v17

    .line 148
    .line 149
    invoke-static/range {v1 .. v6}, Ldefpackage/uc5;->E(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Ldefpackage/jv3;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    new-instance v5, Ldefpackage/el4;

    .line 154
    .line 155
    invoke-direct {v5, v0, v3}, Ldefpackage/el4;-><init>(Lcom/google/android/material/textfield/TextInputLayout;Ldefpackage/jv3;)V

    .line 156
    .line 157
    .line 158
    iput-object v5, v0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 159
    .line 160
    iget-object v6, v3, Ldefpackage/jv3;->o:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v6, Landroid/content/res/TypedArray;

    .line 163
    .line 164
    const/16 v14, 0x30

    .line 165
    .line 166
    invoke-virtual {v6, v14, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 167
    .line 168
    .line 169
    move-result v14

    .line 170
    iput-boolean v14, v0, Lcom/google/android/material/textfield/TextInputLayout;->P:Z

    .line 171
    .line 172
    invoke-virtual {v6, v9}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 173
    .line 174
    .line 175
    move-result-object v9

    .line 176
    invoke-virtual {v0, v9}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 177
    .line 178
    .line 179
    const/16 v9, 0x2f

    .line 180
    .line 181
    invoke-virtual {v6, v9, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    iput-boolean v9, v0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Z

    .line 186
    .line 187
    const/16 v9, 0x2a

    .line 188
    .line 189
    invoke-virtual {v6, v9, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 190
    .line 191
    .line 192
    move-result v9

    .line 193
    iput-boolean v9, v0, Lcom/google/android/material/textfield/TextInputLayout;->I0:Z

    .line 194
    .line 195
    const/4 v9, 0x6

    .line 196
    invoke-virtual {v6, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 197
    .line 198
    .line 199
    move-result v14

    .line 200
    if-eqz v14, :cond_0

    .line 201
    .line 202
    invoke-virtual {v6, v9, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 203
    .line 204
    .line 205
    move-result v9

    .line 206
    invoke-virtual {v0, v9}, Lcom/google/android/material/textfield/TextInputLayout;->setMinEms(I)V

    .line 207
    .line 208
    .line 209
    goto :goto_0

    .line 210
    :cond_0
    const/4 v9, 0x3

    .line 211
    invoke-virtual {v6, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 212
    .line 213
    .line 214
    move-result v14

    .line 215
    if-eqz v14, :cond_1

    .line 216
    .line 217
    invoke-virtual {v6, v9, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 218
    .line 219
    .line 220
    move-result v9

    .line 221
    invoke-virtual {v0, v9}, Lcom/google/android/material/textfield/TextInputLayout;->setMinWidth(I)V

    .line 222
    .line 223
    .line 224
    :cond_1
    :goto_0
    const/4 v9, 0x5

    .line 225
    invoke-virtual {v6, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 226
    .line 227
    .line 228
    move-result v14

    .line 229
    const/4 v15, 0x2

    .line 230
    if-eqz v14, :cond_2

    .line 231
    .line 232
    invoke-virtual {v6, v9, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 233
    .line 234
    .line 235
    move-result v9

    .line 236
    invoke-virtual {v0, v9}, Lcom/google/android/material/textfield/TextInputLayout;->setMaxEms(I)V

    .line 237
    .line 238
    .line 239
    goto :goto_1

    .line 240
    :cond_2
    invoke-virtual {v6, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 241
    .line 242
    .line 243
    move-result v9

    .line 244
    if-eqz v9, :cond_3

    .line 245
    .line 246
    invoke-virtual {v6, v15, v8}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 247
    .line 248
    .line 249
    move-result v9

    .line 250
    invoke-virtual {v0, v9}, Lcom/google/android/material/textfield/TextInputLayout;->setMaxWidth(I)V

    .line 251
    .line 252
    .line 253
    :cond_3
    :goto_1
    invoke-static {v1, v2, v4, v7}, Ldefpackage/bc4;->c(Landroid/content/Context;Landroid/util/AttributeSet;II)Ldefpackage/zc1;

    .line 254
    .line 255
    .line 256
    move-result-object v2

    .line 257
    invoke-virtual {v2}, Ldefpackage/zc1;->a()Ldefpackage/bc4;

    .line 258
    .line 259
    .line 260
    move-result-object v2

    .line 261
    iput-object v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 262
    .line 263
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    const v4, 0x7f0705d0

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->d0:I

    .line 275
    .line 276
    const/16 v2, 0x9

    .line 277
    .line 278
    invoke-virtual {v6, v2, v11}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->f0:I

    .line 283
    .line 284
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    const v4, 0x7f0705d1

    .line 289
    .line 290
    .line 291
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    const/16 v4, 0x10

    .line 296
    .line 297
    invoke-virtual {v6, v4, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->h0:I

    .line 302
    .line 303
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    const v4, 0x7f0705d2

    .line 308
    .line 309
    .line 310
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 311
    .line 312
    .line 313
    move-result v2

    .line 314
    const/16 v4, 0x11

    .line 315
    .line 316
    invoke-virtual {v6, v4, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 317
    .line 318
    .line 319
    move-result v2

    .line 320
    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->i0:I

    .line 321
    .line 322
    iget v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->h0:I

    .line 323
    .line 324
    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 325
    .line 326
    const/16 v2, 0xd

    .line 327
    .line 328
    const/high16 v4, -0x40800000    # -1.0f

    .line 329
    .line 330
    invoke-virtual {v6, v2, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 331
    .line 332
    .line 333
    move-result v2

    .line 334
    const/16 v7, 0xc

    .line 335
    .line 336
    invoke-virtual {v6, v7, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 337
    .line 338
    .line 339
    move-result v7

    .line 340
    const/16 v9, 0xa

    .line 341
    .line 342
    invoke-virtual {v6, v9, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 343
    .line 344
    .line 345
    move-result v9

    .line 346
    const/16 v14, 0xb

    .line 347
    .line 348
    invoke-virtual {v6, v14, v4}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 349
    .line 350
    .line 351
    move-result v4

    .line 352
    iget-object v14, v0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 353
    .line 354
    invoke-virtual {v14}, Ldefpackage/bc4;->g()Ldefpackage/zc1;

    .line 355
    .line 356
    .line 357
    move-result-object v14

    .line 358
    const/16 v18, 0x0

    .line 359
    .line 360
    cmpl-float v19, v2, v18

    .line 361
    .line 362
    if-ltz v19, :cond_4

    .line 363
    .line 364
    new-instance v15, Ldefpackage/m;

    .line 365
    .line 366
    invoke-direct {v15, v2}, Ldefpackage/m;-><init>(F)V

    .line 367
    .line 368
    .line 369
    iput-object v15, v14, Ldefpackage/zc1;->e:Ljava/lang/Object;

    .line 370
    .line 371
    :cond_4
    cmpl-float v2, v7, v18

    .line 372
    .line 373
    if-ltz v2, :cond_5

    .line 374
    .line 375
    new-instance v2, Ldefpackage/m;

    .line 376
    .line 377
    invoke-direct {v2, v7}, Ldefpackage/m;-><init>(F)V

    .line 378
    .line 379
    .line 380
    iput-object v2, v14, Ldefpackage/zc1;->f:Ljava/lang/Object;

    .line 381
    .line 382
    :cond_5
    cmpl-float v2, v9, v18

    .line 383
    .line 384
    if-ltz v2, :cond_6

    .line 385
    .line 386
    new-instance v2, Ldefpackage/m;

    .line 387
    .line 388
    invoke-direct {v2, v9}, Ldefpackage/m;-><init>(F)V

    .line 389
    .line 390
    .line 391
    iput-object v2, v14, Ldefpackage/zc1;->g:Ljava/lang/Object;

    .line 392
    .line 393
    :cond_6
    cmpl-float v2, v4, v18

    .line 394
    .line 395
    if-ltz v2, :cond_7

    .line 396
    .line 397
    new-instance v2, Ldefpackage/m;

    .line 398
    .line 399
    invoke-direct {v2, v4}, Ldefpackage/m;-><init>(F)V

    .line 400
    .line 401
    .line 402
    iput-object v2, v14, Ldefpackage/zc1;->h:Ljava/lang/Object;

    .line 403
    .line 404
    :cond_7
    invoke-virtual {v14}, Ldefpackage/zc1;->a()Ldefpackage/bc4;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    iput-object v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 409
    .line 410
    const/4 v2, 0x7

    .line 411
    invoke-static {v1, v3, v2}, Ldefpackage/h12;->r(Landroid/content/Context;Ldefpackage/jv3;I)Landroid/content/res/ColorStateList;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    if-eqz v2, :cond_9

    .line 416
    .line 417
    invoke-virtual {v2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 418
    .line 419
    .line 420
    move-result v4

    .line 421
    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->B0:I

    .line 422
    .line 423
    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->k0:I

    .line 424
    .line 425
    invoke-virtual {v2}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 426
    .line 427
    .line 428
    move-result v4

    .line 429
    const v7, 0x1010367

    .line 430
    .line 431
    .line 432
    const v9, -0x101009e

    .line 433
    .line 434
    .line 435
    if-eqz v4, :cond_8

    .line 436
    .line 437
    filled-new-array {v9}, [I

    .line 438
    .line 439
    .line 440
    move-result-object v4

    .line 441
    invoke-virtual {v2, v4, v8}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 442
    .line 443
    .line 444
    move-result v4

    .line 445
    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->C0:I

    .line 446
    .line 447
    const v4, 0x101009c

    .line 448
    .line 449
    .line 450
    const v9, 0x101009e

    .line 451
    .line 452
    .line 453
    filled-new-array {v4, v9}, [I

    .line 454
    .line 455
    .line 456
    move-result-object v4

    .line 457
    invoke-virtual {v2, v4, v8}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 458
    .line 459
    .line 460
    move-result v4

    .line 461
    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->D0:I

    .line 462
    .line 463
    filled-new-array {v7, v9}, [I

    .line 464
    .line 465
    .line 466
    move-result-object v4

    .line 467
    invoke-virtual {v2, v4, v8}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 468
    .line 469
    .line 470
    move-result v2

    .line 471
    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->E0:I

    .line 472
    .line 473
    goto :goto_2

    .line 474
    :cond_8
    iget v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->B0:I

    .line 475
    .line 476
    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->D0:I

    .line 477
    .line 478
    const v2, 0x7f06032f

    .line 479
    .line 480
    .line 481
    invoke-static {v1, v2}, Ldefpackage/ud3;->n(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    filled-new-array {v9}, [I

    .line 486
    .line 487
    .line 488
    move-result-object v4

    .line 489
    invoke-virtual {v2, v4, v8}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 490
    .line 491
    .line 492
    move-result v4

    .line 493
    iput v4, v0, Lcom/google/android/material/textfield/TextInputLayout;->C0:I

    .line 494
    .line 495
    filled-new-array {v7}, [I

    .line 496
    .line 497
    .line 498
    move-result-object v4

    .line 499
    invoke-virtual {v2, v4, v8}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 500
    .line 501
    .line 502
    move-result v2

    .line 503
    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->E0:I

    .line 504
    .line 505
    goto :goto_2

    .line 506
    :cond_9
    iput v11, v0, Lcom/google/android/material/textfield/TextInputLayout;->k0:I

    .line 507
    .line 508
    iput v11, v0, Lcom/google/android/material/textfield/TextInputLayout;->B0:I

    .line 509
    .line 510
    iput v11, v0, Lcom/google/android/material/textfield/TextInputLayout;->C0:I

    .line 511
    .line 512
    iput v11, v0, Lcom/google/android/material/textfield/TextInputLayout;->D0:I

    .line 513
    .line 514
    iput v11, v0, Lcom/google/android/material/textfield/TextInputLayout;->E0:I

    .line 515
    .line 516
    :goto_2
    invoke-virtual {v6, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 517
    .line 518
    .line 519
    move-result v2

    .line 520
    if-eqz v2, :cond_a

    .line 521
    .line 522
    invoke-virtual {v3, v10}, Ldefpackage/jv3;->b(I)Landroid/content/res/ColorStateList;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    iput-object v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->w0:Landroid/content/res/ColorStateList;

    .line 527
    .line 528
    iput-object v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->v0:Landroid/content/res/ColorStateList;

    .line 529
    .line 530
    :cond_a
    const/16 v2, 0xe

    .line 531
    .line 532
    invoke-static {v1, v3, v2}, Ldefpackage/h12;->r(Landroid/content/Context;Ldefpackage/jv3;I)Landroid/content/res/ColorStateList;

    .line 533
    .line 534
    .line 535
    move-result-object v4

    .line 536
    invoke-virtual {v6, v2, v11}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 537
    .line 538
    .line 539
    move-result v2

    .line 540
    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->z0:I

    .line 541
    .line 542
    const v2, 0x7f06034a

    .line 543
    .line 544
    .line 545
    invoke-virtual {v1, v2}, Landroid/content/Context;->getColor(I)I

    .line 546
    .line 547
    .line 548
    move-result v2

    .line 549
    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->x0:I

    .line 550
    .line 551
    const v2, 0x7f06034b

    .line 552
    .line 553
    .line 554
    invoke-virtual {v1, v2}, Landroid/content/Context;->getColor(I)I

    .line 555
    .line 556
    .line 557
    move-result v2

    .line 558
    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->F0:I

    .line 559
    .line 560
    const v2, 0x7f06034e

    .line 561
    .line 562
    .line 563
    invoke-virtual {v1, v2}, Landroid/content/Context;->getColor(I)I

    .line 564
    .line 565
    .line 566
    move-result v2

    .line 567
    iput v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->y0:I

    .line 568
    .line 569
    if-eqz v4, :cond_b

    .line 570
    .line 571
    invoke-virtual {v0, v4}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxStrokeColorStateList(Landroid/content/res/ColorStateList;)V

    .line 572
    .line 573
    .line 574
    :cond_b
    const/16 v2, 0xf

    .line 575
    .line 576
    invoke-virtual {v6, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 577
    .line 578
    .line 579
    move-result v4

    .line 580
    if-eqz v4, :cond_c

    .line 581
    .line 582
    invoke-static {v1, v3, v2}, Ldefpackage/h12;->r(Landroid/content/Context;Ldefpackage/jv3;I)Landroid/content/res/ColorStateList;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxStrokeErrorColor(Landroid/content/res/ColorStateList;)V

    .line 587
    .line 588
    .line 589
    :cond_c
    invoke-virtual {v6, v13, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 590
    .line 591
    .line 592
    move-result v1

    .line 593
    if-eq v1, v8, :cond_d

    .line 594
    .line 595
    invoke-virtual {v6, v13, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 596
    .line 597
    .line 598
    move-result v1

    .line 599
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setHintTextAppearance(I)V

    .line 600
    .line 601
    .line 602
    :cond_d
    const/16 v1, 0x18

    .line 603
    .line 604
    invoke-virtual {v3, v1}, Ldefpackage/jv3;->b(I)Landroid/content/res/ColorStateList;

    .line 605
    .line 606
    .line 607
    move-result-object v1

    .line 608
    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->N:Landroid/content/res/ColorStateList;

    .line 609
    .line 610
    const/16 v1, 0x19

    .line 611
    .line 612
    invoke-virtual {v3, v1}, Ldefpackage/jv3;->b(I)Landroid/content/res/ColorStateList;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/content/res/ColorStateList;

    .line 617
    .line 618
    const/16 v1, 0x28

    .line 619
    .line 620
    invoke-virtual {v6, v1, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 621
    .line 622
    .line 623
    move-result v1

    .line 624
    const/16 v2, 0x23

    .line 625
    .line 626
    invoke-virtual {v6, v2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 627
    .line 628
    .line 629
    move-result-object v2

    .line 630
    const/16 v4, 0x22

    .line 631
    .line 632
    invoke-virtual {v6, v4, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 633
    .line 634
    .line 635
    move-result v4

    .line 636
    const/16 v7, 0x24

    .line 637
    .line 638
    invoke-virtual {v6, v7, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 639
    .line 640
    .line 641
    move-result v7

    .line 642
    const/16 v14, 0x2d

    .line 643
    .line 644
    invoke-virtual {v6, v14, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 645
    .line 646
    .line 647
    move-result v9

    .line 648
    const/16 v13, 0x2c

    .line 649
    .line 650
    invoke-virtual {v6, v13, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 651
    .line 652
    .line 653
    move-result v13

    .line 654
    const/16 v14, 0x2b

    .line 655
    .line 656
    invoke-virtual {v6, v14}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 657
    .line 658
    .line 659
    move-result-object v14

    .line 660
    const/16 v15, 0x39

    .line 661
    .line 662
    invoke-virtual {v6, v15, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 663
    .line 664
    .line 665
    move-result v15

    .line 666
    const/16 v10, 0x38

    .line 667
    .line 668
    invoke-virtual {v6, v10}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    .line 669
    .line 670
    .line 671
    move-result-object v10

    .line 672
    const/16 v8, 0x12

    .line 673
    .line 674
    invoke-virtual {v6, v8, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 675
    .line 676
    .line 677
    move-result v8

    .line 678
    const/16 v11, 0x13

    .line 679
    .line 680
    move-object/from16 p2, v14

    .line 681
    .line 682
    const/4 v14, -0x1

    .line 683
    invoke-virtual {v6, v11, v14}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 684
    .line 685
    .line 686
    move-result v11

    .line 687
    invoke-virtual {v0, v11}, Lcom/google/android/material/textfield/TextInputLayout;->setCounterMaxLength(I)V

    .line 688
    .line 689
    .line 690
    const/4 v11, 0x0

    .line 691
    const/16 v14, 0x16

    .line 692
    .line 693
    invoke-virtual {v6, v14, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 694
    .line 695
    .line 696
    move-result v14

    .line 697
    iput v14, v0, Lcom/google/android/material/textfield/TextInputLayout;->D:I

    .line 698
    .line 699
    const/16 v14, 0x14

    .line 700
    .line 701
    invoke-virtual {v6, v14, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 702
    .line 703
    .line 704
    move-result v14

    .line 705
    iput v14, v0, Lcom/google/android/material/textfield/TextInputLayout;->C:I

    .line 706
    .line 707
    const/16 v14, 0x8

    .line 708
    .line 709
    invoke-virtual {v6, v14, v11}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 710
    .line 711
    .line 712
    move-result v14

    .line 713
    invoke-virtual {v0, v14}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxBackgroundMode(I)V

    .line 714
    .line 715
    .line 716
    invoke-virtual {v0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorContentDescription(Ljava/lang/CharSequence;)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v0, v4}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorAccessibilityLiveRegion(I)V

    .line 720
    .line 721
    .line 722
    iget v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->C:I

    .line 723
    .line 724
    invoke-virtual {v0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setCounterOverflowTextAppearance(I)V

    .line 725
    .line 726
    .line 727
    invoke-virtual {v0, v9}, Lcom/google/android/material/textfield/TextInputLayout;->setHelperTextTextAppearance(I)V

    .line 728
    .line 729
    .line 730
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorTextAppearance(I)V

    .line 731
    .line 732
    .line 733
    iget v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->D:I

    .line 734
    .line 735
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setCounterTextAppearance(I)V

    .line 736
    .line 737
    .line 738
    invoke-virtual {v0, v10}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderText(Ljava/lang/CharSequence;)V

    .line 739
    .line 740
    .line 741
    invoke-virtual {v0, v15}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextAppearance(I)V

    .line 742
    .line 743
    .line 744
    const/16 v1, 0x29

    .line 745
    .line 746
    invoke-virtual {v6, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 747
    .line 748
    .line 749
    move-result v2

    .line 750
    if-eqz v2, :cond_e

    .line 751
    .line 752
    invoke-virtual {v3, v1}, Ldefpackage/jv3;->b(I)Landroid/content/res/ColorStateList;

    .line 753
    .line 754
    .line 755
    move-result-object v1

    .line 756
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorTextColor(Landroid/content/res/ColorStateList;)V

    .line 757
    .line 758
    .line 759
    :cond_e
    const/16 v1, 0x2e

    .line 760
    .line 761
    invoke-virtual {v6, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 762
    .line 763
    .line 764
    move-result v2

    .line 765
    if-eqz v2, :cond_f

    .line 766
    .line 767
    invoke-virtual {v3, v1}, Ldefpackage/jv3;->b(I)Landroid/content/res/ColorStateList;

    .line 768
    .line 769
    .line 770
    move-result-object v1

    .line 771
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setHelperTextColor(Landroid/content/res/ColorStateList;)V

    .line 772
    .line 773
    .line 774
    :cond_f
    const/16 v1, 0x32

    .line 775
    .line 776
    invoke-virtual {v6, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 777
    .line 778
    .line 779
    move-result v2

    .line 780
    if-eqz v2, :cond_10

    .line 781
    .line 782
    invoke-virtual {v3, v1}, Ldefpackage/jv3;->b(I)Landroid/content/res/ColorStateList;

    .line 783
    .line 784
    .line 785
    move-result-object v1

    .line 786
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setHintTextColor(Landroid/content/res/ColorStateList;)V

    .line 787
    .line 788
    .line 789
    :cond_10
    const/16 v1, 0x17

    .line 790
    .line 791
    invoke-virtual {v6, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 792
    .line 793
    .line 794
    move-result v2

    .line 795
    if-eqz v2, :cond_11

    .line 796
    .line 797
    invoke-virtual {v3, v1}, Ldefpackage/jv3;->b(I)Landroid/content/res/ColorStateList;

    .line 798
    .line 799
    .line 800
    move-result-object v1

    .line 801
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setCounterTextColor(Landroid/content/res/ColorStateList;)V

    .line 802
    .line 803
    .line 804
    :cond_11
    const/16 v1, 0x15

    .line 805
    .line 806
    invoke-virtual {v6, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 807
    .line 808
    .line 809
    move-result v2

    .line 810
    if-eqz v2, :cond_12

    .line 811
    .line 812
    invoke-virtual {v3, v1}, Ldefpackage/jv3;->b(I)Landroid/content/res/ColorStateList;

    .line 813
    .line 814
    .line 815
    move-result-object v1

    .line 816
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setCounterOverflowTextColor(Landroid/content/res/ColorStateList;)V

    .line 817
    .line 818
    .line 819
    :cond_12
    const/16 v1, 0x3a

    .line 820
    .line 821
    invoke-virtual {v6, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 822
    .line 823
    .line 824
    move-result v2

    .line 825
    if-eqz v2, :cond_13

    .line 826
    .line 827
    invoke-virtual {v3, v1}, Ldefpackage/jv3;->b(I)Landroid/content/res/ColorStateList;

    .line 828
    .line 829
    .line 830
    move-result-object v1

    .line 831
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextColor(Landroid/content/res/ColorStateList;)V

    .line 832
    .line 833
    .line 834
    :cond_13
    new-instance v1, Ldefpackage/g11;

    .line 835
    .line 836
    invoke-direct {v1, v0, v3}, Ldefpackage/g11;-><init>(Lcom/google/android/material/textfield/TextInputLayout;Ldefpackage/jv3;)V

    .line 837
    .line 838
    .line 839
    iput-object v1, v0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 840
    .line 841
    const/4 v2, 0x1

    .line 842
    const/4 v11, 0x0

    .line 843
    invoke-virtual {v6, v11, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 844
    .line 845
    .line 846
    move-result v4

    .line 847
    invoke-virtual {v3}, Ldefpackage/jv3;->g()V

    .line 848
    .line 849
    .line 850
    const/4 v3, 0x2

    .line 851
    invoke-virtual {v0, v3}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 852
    .line 853
    .line 854
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 855
    .line 856
    const/16 v6, 0x1a

    .line 857
    .line 858
    if-lt v3, v6, :cond_14

    .line 859
    .line 860
    if-lt v3, v6, :cond_14

    .line 861
    .line 862
    invoke-static {v0, v2}, Ldefpackage/d65;->b(Landroid/view/View;I)V

    .line 863
    .line 864
    .line 865
    :cond_14
    invoke-virtual {v12, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 866
    .line 867
    .line 868
    invoke-virtual {v12, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 869
    .line 870
    .line 871
    invoke-virtual {v0, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 872
    .line 873
    .line 874
    invoke-virtual {v0, v4}, Lcom/google/android/material/textfield/TextInputLayout;->setEnabled(Z)V

    .line 875
    .line 876
    .line 877
    invoke-virtual {v0, v13}, Lcom/google/android/material/textfield/TextInputLayout;->setHelperTextEnabled(Z)V

    .line 878
    .line 879
    .line 880
    invoke-virtual {v0, v7}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    .line 881
    .line 882
    .line 883
    invoke-virtual {v0, v8}, Lcom/google/android/material/textfield/TextInputLayout;->setCounterEnabled(Z)V

    .line 884
    .line 885
    .line 886
    move-object/from16 v1, p2

    .line 887
    .line 888
    invoke-virtual {v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setHelperText(Ljava/lang/CharSequence;)V

    .line 889
    .line 890
    .line 891
    return-void
.end method

.method private getEditTextBoxBackground()Landroid/graphics/drawable/Drawable;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 2
    .line 3
    instance-of v1, v0, Landroid/widget/AutoCompleteTextView;

    .line 4
    .line 5
    if-eqz v1, :cond_3

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/widget/TextView;->getInputType()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_0

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 16
    .line 17
    const v1, 0x7f040112

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Ldefpackage/g12;->t(Landroid/view/View;I)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:I

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    const/4 v3, 0x2

    .line 28
    const v4, 0x3dcccccd    # 0.1f

    .line 29
    .line 30
    .line 31
    sget-object v5, Lcom/google/android/material/textfield/TextInputLayout;->N0:[[I

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ldefpackage/fi2;

    .line 40
    .line 41
    const v6, 0x7f04013b

    .line 42
    .line 43
    .line 44
    const-string v7, "TextInputLayout"

    .line 45
    .line 46
    invoke-static {v6, v1, v7}, Ldefpackage/g12;->r(ILandroid/content/Context;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    new-instance v6, Ldefpackage/fi2;

    .line 51
    .line 52
    iget-object v7, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 53
    .line 54
    iget-object v7, v7, Ldefpackage/ei2;->a:Ldefpackage/bc4;

    .line 55
    .line 56
    invoke-direct {v6, v7}, Ldefpackage/fi2;-><init>(Ldefpackage/bc4;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v4, v1}, Ldefpackage/g12;->H(IFI)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    const/4 v4, 0x0

    .line 64
    filled-new-array {v0, v4}, [I

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    new-instance v8, Landroid/content/res/ColorStateList;

    .line 69
    .line 70
    invoke-direct {v8, v5, v7}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v6, v8}, Ldefpackage/fi2;->m(Landroid/content/res/ColorStateList;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v6, v1}, Ldefpackage/fi2;->setTint(I)V

    .line 77
    .line 78
    .line 79
    filled-new-array {v0, v1}, [I

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    new-instance v1, Landroid/content/res/ColorStateList;

    .line 84
    .line 85
    invoke-direct {v1, v5, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 86
    .line 87
    .line 88
    new-instance v0, Ldefpackage/fi2;

    .line 89
    .line 90
    iget-object v5, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 91
    .line 92
    iget-object v5, v5, Ldefpackage/ei2;->a:Ldefpackage/bc4;

    .line 93
    .line 94
    invoke-direct {v0, v5}, Ldefpackage/fi2;-><init>(Ldefpackage/bc4;)V

    .line 95
    .line 96
    .line 97
    const/4 v5, -0x1

    .line 98
    invoke-virtual {v0, v5}, Ldefpackage/fi2;->setTint(I)V

    .line 99
    .line 100
    .line 101
    new-instance v5, Landroid/graphics/drawable/RippleDrawable;

    .line 102
    .line 103
    invoke-direct {v5, v1, v6, v0}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 104
    .line 105
    .line 106
    new-array v0, v3, [Landroid/graphics/drawable/Drawable;

    .line 107
    .line 108
    aput-object v5, v0, v4

    .line 109
    .line 110
    aput-object p0, v0, v2

    .line 111
    .line 112
    new-instance p0, Landroid/graphics/drawable/LayerDrawable;

    .line 113
    .line 114
    invoke-direct {p0, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 115
    .line 116
    .line 117
    return-object p0

    .line 118
    :cond_1
    if-ne v1, v2, :cond_2

    .line 119
    .line 120
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ldefpackage/fi2;

    .line 121
    .line 122
    iget p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->k0:I

    .line 123
    .line 124
    invoke-static {v0, v4, p0}, Ldefpackage/g12;->H(IFI)I

    .line 125
    .line 126
    .line 127
    move-result v0

    .line 128
    filled-new-array {v0, p0}, [I

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    new-instance v0, Landroid/content/res/ColorStateList;

    .line 133
    .line 134
    invoke-direct {v0, v5, p0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 135
    .line 136
    .line 137
    new-instance p0, Landroid/graphics/drawable/RippleDrawable;

    .line 138
    .line 139
    invoke-direct {p0, v0, v1, v1}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 140
    .line 141
    .line 142
    return-object p0

    .line 143
    :cond_2
    const/4 p0, 0x0

    .line 144
    return-object p0

    .line 145
    :cond_3
    :goto_0
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ldefpackage/fi2;

    .line 146
    .line 147
    return-object p0
.end method

.method private getOrCreateFilledDropDownMenuBackground()Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Landroid/graphics/drawable/StateListDrawable;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Landroid/graphics/drawable/StateListDrawable;

    .line 11
    .line 12
    const v1, 0x10100aa

    .line 13
    .line 14
    .line 15
    filled-new-array {v1}, [I

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getOrCreateOutlinedDropDownMenuBackground()Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Landroid/graphics/drawable/StateListDrawable;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    new-array v2, v1, [I

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->f(Z)Ldefpackage/fi2;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v2, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->U:Landroid/graphics/drawable/StateListDrawable;

    .line 39
    .line 40
    return-object p0
.end method

.method private getOrCreateOutlinedDropDownMenuBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Ldefpackage/fi2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->f(Z)Ldefpackage/fi2;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Ldefpackage/fi2;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->T:Ldefpackage/fi2;

    .line 13
    .line 14
    return-object p0
.end method

.method public static k(Landroid/view/ViewGroup;Z)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 13
    .line 14
    .line 15
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    check-cast v2, Landroid/view/ViewGroup;

    .line 20
    .line 21
    invoke-static {v2, p1}, Lcom/google/android/material/textfield/TextInputLayout;->k(Landroid/view/ViewGroup;Z)V

    .line 22
    .line 23
    .line 24
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    return-void
.end method

.method private setEditText(Landroid/widget/EditText;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 2
    .line 3
    if-nez v0, :cond_f

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEndIconMode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x3

    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    instance-of v0, p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const-string v0, "TextInputLayout"

    .line 17
    .line 18
    const-string v1, "EditText added is not a TextInputEditText. Please switch to using that class instead."

    .line 19
    .line 20
    invoke-static {v0, v1}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 21
    .line 22
    .line 23
    :cond_0
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 24
    .line 25
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->s:I

    .line 26
    .line 27
    const/4 v1, -0x1

    .line 28
    if-eq v0, v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setMinEms(I)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->u:I

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setMinWidth(I)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->t:I

    .line 40
    .line 41
    if-eq v0, v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setMaxEms(I)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->v:I

    .line 48
    .line 49
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setMaxWidth(I)V

    .line 50
    .line 51
    .line 52
    :goto_1
    const/4 v0, 0x0

    .line 53
    iput-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->V:Z

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->i()V

    .line 56
    .line 57
    .line 58
    new-instance v1, Ldefpackage/fs4;

    .line 59
    .line 60
    invoke-direct {v1, p0}, Ldefpackage/fs4;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setTextInputAccessibilityDelegate(Ldefpackage/fs4;)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 67
    .line 68
    invoke-virtual {v1}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->H0:Ldefpackage/k40;

    .line 73
    .line 74
    invoke-virtual {v2, v1}, Ldefpackage/k40;->m(Landroid/graphics/Typeface;)Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    invoke-virtual {v2, v1}, Ldefpackage/k40;->o(Landroid/graphics/Typeface;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v3, :cond_3

    .line 83
    .line 84
    if-eqz v1, :cond_4

    .line 85
    .line 86
    :cond_3
    invoke-virtual {v2, v0}, Ldefpackage/k40;->i(Z)V

    .line 87
    .line 88
    .line 89
    :cond_4
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 90
    .line 91
    invoke-virtual {v1}, Landroid/widget/TextView;->getTextSize()F

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    iget v3, v2, Ldefpackage/k40;->l:F

    .line 96
    .line 97
    cmpl-float v3, v3, v1

    .line 98
    .line 99
    if-eqz v3, :cond_5

    .line 100
    .line 101
    iput v1, v2, Ldefpackage/k40;->l:F

    .line 102
    .line 103
    invoke-virtual {v2, v0}, Ldefpackage/k40;->i(Z)V

    .line 104
    .line 105
    .line 106
    :cond_5
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 107
    .line 108
    invoke-virtual {v1}, Landroid/widget/TextView;->getLetterSpacing()F

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    iget v3, v2, Ldefpackage/k40;->g0:F

    .line 113
    .line 114
    cmpl-float v3, v3, v1

    .line 115
    .line 116
    if-eqz v3, :cond_6

    .line 117
    .line 118
    iput v1, v2, Ldefpackage/k40;->g0:F

    .line 119
    .line 120
    invoke-virtual {v2, v0}, Ldefpackage/k40;->i(Z)V

    .line 121
    .line 122
    .line 123
    :cond_6
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 124
    .line 125
    invoke-virtual {v1}, Landroid/widget/TextView;->getGravity()I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    and-int/lit8 v3, v1, -0x71

    .line 130
    .line 131
    or-int/lit8 v3, v3, 0x30

    .line 132
    .line 133
    invoke-virtual {v2, v3}, Ldefpackage/k40;->l(I)V

    .line 134
    .line 135
    .line 136
    iget v3, v2, Ldefpackage/k40;->j:I

    .line 137
    .line 138
    if-eq v3, v1, :cond_7

    .line 139
    .line 140
    iput v1, v2, Ldefpackage/k40;->j:I

    .line 141
    .line 142
    invoke-virtual {v2, v0}, Ldefpackage/k40;->i(Z)V

    .line 143
    .line 144
    .line 145
    :cond_7
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 146
    .line 147
    new-instance v2, Ldefpackage/pn1;

    .line 148
    .line 149
    const/4 v3, 0x5

    .line 150
    invoke-direct {v2, v3, p0}, Ldefpackage/pn1;-><init>(ILjava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 154
    .line 155
    .line 156
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->v0:Landroid/content/res/ColorStateList;

    .line 157
    .line 158
    if-nez v1, :cond_8

    .line 159
    .line 160
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 161
    .line 162
    invoke-virtual {v1}, Landroid/widget/TextView;->getHintTextColors()Landroid/content/res/ColorStateList;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    iput-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->v0:Landroid/content/res/ColorStateList;

    .line 167
    .line 168
    :cond_8
    iget-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->P:Z

    .line 169
    .line 170
    const/4 v2, 0x1

    .line 171
    if-eqz v1, :cond_a

    .line 172
    .line 173
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->Q:Ljava/lang/CharSequence;

    .line 174
    .line 175
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-eqz v1, :cond_9

    .line 180
    .line 181
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 182
    .line 183
    invoke-virtual {v1}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    iput-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->r:Ljava/lang/CharSequence;

    .line 188
    .line 189
    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 190
    .line 191
    .line 192
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 193
    .line 194
    const/4 v3, 0x0

    .line 195
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 196
    .line 197
    .line 198
    :cond_9
    iput-boolean v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->R:Z

    .line 199
    .line 200
    :cond_a
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 201
    .line 202
    const/16 v3, 0x1d

    .line 203
    .line 204
    if-lt v1, v3, :cond_b

    .line 205
    .line 206
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->p()V

    .line 207
    .line 208
    .line 209
    :cond_b
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 210
    .line 211
    if-eqz v1, :cond_c

    .line 212
    .line 213
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 214
    .line 215
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->n(Landroid/text/Editable;)V

    .line 220
    .line 221
    .line 222
    :cond_c
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->r()V

    .line 223
    .line 224
    .line 225
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Ldefpackage/cy1;

    .line 226
    .line 227
    invoke-virtual {v1}, Ldefpackage/cy1;->b()V

    .line 228
    .line 229
    .line 230
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 231
    .line 232
    invoke-virtual {v1}, Landroid/view/View;->bringToFront()V

    .line 233
    .line 234
    .line 235
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 236
    .line 237
    invoke-virtual {v1}, Landroid/view/View;->bringToFront()V

    .line 238
    .line 239
    .line 240
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->r0:Ljava/util/LinkedHashSet;

    .line 241
    .line 242
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    if-eqz v4, :cond_d

    .line 251
    .line 252
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    check-cast v4, Ldefpackage/f11;

    .line 257
    .line 258
    invoke-virtual {v4, p0}, Ldefpackage/f11;->a(Lcom/google/android/material/textfield/TextInputLayout;)V

    .line 259
    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_d
    invoke-virtual {v1}, Ldefpackage/g11;->l()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    if-nez v1, :cond_e

    .line 270
    .line 271
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 272
    .line 273
    .line 274
    :cond_e
    invoke-virtual {p0, v0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->u(ZZ)V

    .line 275
    .line 276
    .line 277
    return-void

    .line 278
    :cond_f
    const-string p0, "We already have an EditText, can only have one"

    .line 279
    .line 280
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    return-void
.end method

.method private setHintInternal(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->Q:Ljava/lang/CharSequence;

    .line 2
    .line 3
    invoke-static {p1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->Q:Ljava/lang/CharSequence;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->H0:Ldefpackage/k40;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object v1, v0, Ldefpackage/k40;->G:Ljava/lang/CharSequence;

    .line 16
    .line 17
    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    :cond_0
    iput-object p1, v0, Ldefpackage/k40;->G:Ljava/lang/CharSequence;

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    iput-object p1, v0, Ldefpackage/k40;->H:Ljava/lang/CharSequence;

    .line 27
    .line 28
    iget-object v1, v0, Ldefpackage/k40;->K:Landroid/graphics/Bitmap;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 33
    .line 34
    .line 35
    iput-object p1, v0, Ldefpackage/k40;->K:Landroid/graphics/Bitmap;

    .line 36
    .line 37
    :cond_1
    const/4 p1, 0x0

    .line 38
    invoke-virtual {v0, p1}, Ldefpackage/k40;->i(Z)V

    .line 39
    .line 40
    .line 41
    :cond_2
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->G0:Z

    .line 42
    .line 43
    if-nez p1, :cond_3

    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->j()V

    .line 46
    .line 47
    .line 48
    :cond_3
    return-void
.end method

.method private setPlaceholderTextEnabled(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:Ldefpackage/mh;

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->n:Landroid/widget/FrameLayout;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:Ldefpackage/mh;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    if-eqz v0, :cond_2

    .line 25
    .line 26
    const/16 v1, 0x8

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    :cond_2
    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:Ldefpackage/mh;

    .line 33
    .line 34
    :cond_3
    :goto_0
    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Z

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->H0:Ldefpackage/k40;

    .line 2
    .line 3
    iget v1, v0, Ldefpackage/k40;->b:F

    .line 4
    .line 5
    cmpl-float v1, v1, p1

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->K0:Landroid/animation/ValueAnimator;

    .line 11
    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    new-instance v1, Landroid/animation/ValueAnimator;

    .line 15
    .line 16
    invoke-direct {v1}, Landroid/animation/ValueAnimator;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->K0:Landroid/animation/ValueAnimator;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const v3, 0x7f04039f

    .line 26
    .line 27
    .line 28
    sget-object v4, Ldefpackage/yd;->b:Ldefpackage/a61;

    .line 29
    .line 30
    invoke-static {v2, v3, v4}, Ldefpackage/g12;->O(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->K0:Landroid/animation/ValueAnimator;

    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const v3, 0x7f040395

    .line 44
    .line 45
    .line 46
    const/16 v4, 0xa7

    .line 47
    .line 48
    invoke-static {v2, v3, v4}, Ldefpackage/g12;->N(Landroid/content/Context;II)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    int-to-long v2, v2

    .line 53
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->K0:Landroid/animation/ValueAnimator;

    .line 57
    .line 58
    new-instance v2, Ldefpackage/qq;

    .line 59
    .line 60
    const/4 v3, 0x7

    .line 61
    invoke-direct {v2, v3, p0}, Ldefpackage/qq;-><init>(ILjava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->K0:Landroid/animation/ValueAnimator;

    .line 68
    .line 69
    iget v0, v0, Ldefpackage/k40;->b:F

    .line 70
    .line 71
    const/4 v2, 0x2

    .line 72
    new-array v2, v2, [F

    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    aput v0, v2, v3

    .line 76
    .line 77
    const/4 v0, 0x1

    .line 78
    aput p1, v2, v0

    .line 79
    .line 80
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 81
    .line 82
    .line 83
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->K0:Landroid/animation/ValueAnimator;

    .line 84
    .line 85
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/widget/EditText;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    .line 6
    .line 7
    invoke-direct {p2, p3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    .line 9
    .line 10
    iget v0, p2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 11
    .line 12
    and-int/lit8 v0, v0, -0x71

    .line 13
    .line 14
    or-int/lit8 v0, v0, 0x10

    .line 15
    .line 16
    iput v0, p2, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 17
    .line 18
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->n:Landroid/widget/FrameLayout;

    .line 19
    .line 20
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->t()V

    .line 27
    .line 28
    .line 29
    check-cast p1, Landroid/widget/EditText;

    .line 30
    .line 31
    invoke-direct {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setEditText(Landroid/widget/EditText;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ldefpackage/fi2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, v0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 7
    .line 8
    iget-object v1, v1, Ldefpackage/ei2;->a:Ldefpackage/bc4;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 11
    .line 12
    if-eq v1, v2, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ldefpackage/fi2;->setShapeAppearanceModel(Ldefpackage/bc4;)V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:I

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    const/4 v2, -0x1

    .line 21
    if-ne v0, v1, :cond_2

    .line 22
    .line 23
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 24
    .line 25
    if-le v0, v2, :cond_2

    .line 26
    .line 27
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->j0:I

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ldefpackage/fi2;

    .line 32
    .line 33
    int-to-float v0, v0

    .line 34
    invoke-virtual {v3, v0}, Ldefpackage/fi2;->r(F)V

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v3, v0}, Ldefpackage/fi2;->q(Landroid/content/res/ColorStateList;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->k0:I

    .line 45
    .line 46
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:I

    .line 47
    .line 48
    const/4 v3, 0x1

    .line 49
    if-ne v1, v3, :cond_3

    .line 50
    .line 51
    const/4 v0, 0x0

    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    const v3, 0x7f04013b

    .line 57
    .line 58
    .line 59
    invoke-static {v1, v3, v0}, Ldefpackage/g12;->s(Landroid/content/Context;II)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->k0:I

    .line 64
    .line 65
    invoke-static {v1, v0}, Ldefpackage/v50;->g(II)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    :cond_3
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->k0:I

    .line 70
    .line 71
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ldefpackage/fi2;

    .line 72
    .line 73
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v1, v0}, Ldefpackage/fi2;->m(Landroid/content/res/ColorStateList;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->W:Ldefpackage/fi2;

    .line 81
    .line 82
    if-eqz v0, :cond_7

    .line 83
    .line 84
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->a0:Ldefpackage/fi2;

    .line 85
    .line 86
    if-nez v1, :cond_4

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_4
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 90
    .line 91
    if-le v1, v2, :cond_6

    .line 92
    .line 93
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->j0:I

    .line 94
    .line 95
    if-eqz v1, :cond_6

    .line 96
    .line 97
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 98
    .line 99
    invoke-virtual {v1}, Landroid/view/View;->isFocused()Z

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    if-eqz v1, :cond_5

    .line 104
    .line 105
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->x0:I

    .line 106
    .line 107
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    goto :goto_0

    .line 112
    :cond_5
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->j0:I

    .line 113
    .line 114
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    :goto_0
    invoke-virtual {v0, v1}, Ldefpackage/fi2;->m(Landroid/content/res/ColorStateList;)V

    .line 119
    .line 120
    .line 121
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->a0:Ldefpackage/fi2;

    .line 122
    .line 123
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->j0:I

    .line 124
    .line 125
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v0, v1}, Ldefpackage/fi2;->m(Landroid/content/res/ColorStateList;)V

    .line 130
    .line 131
    .line 132
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 133
    .line 134
    .line 135
    :cond_7
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->s()V

    .line 136
    .line 137
    .line 138
    return-void
.end method

.method public final c()I
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->P:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:I

    .line 8
    .line 9
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->H0:Ldefpackage/k40;

    .line 10
    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    if-eq v0, v2, :cond_1

    .line 15
    .line 16
    return v1

    .line 17
    :cond_1
    invoke-virtual {p0}, Ldefpackage/k40;->e()F

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    const/high16 v0, 0x40000000    # 2.0f

    .line 22
    .line 23
    div-float/2addr p0, v0

    .line 24
    :goto_0
    float-to-int p0, p0

    .line 25
    return p0

    .line 26
    :cond_2
    invoke-virtual {p0}, Ldefpackage/k40;->e()F

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    goto :goto_0
.end method

.method public final d()Ldefpackage/u51;
    .locals 4

    .line 1
    new-instance v0, Ldefpackage/u51;

    .line 2
    .line 3
    invoke-direct {v0}, Ldefpackage/l85;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const v2, 0x7f040397

    .line 11
    .line 12
    .line 13
    const/16 v3, 0x57

    .line 14
    .line 15
    invoke-static {v1, v2, v3}, Ldefpackage/g12;->N(Landroid/content/Context;II)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    int-to-long v1, v1

    .line 20
    iput-wide v1, v0, Ldefpackage/dx4;->p:J

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const v1, 0x7f0403a1

    .line 27
    .line 28
    .line 29
    sget-object v2, Ldefpackage/yd;->a:Landroid/view/animation/LinearInterpolator;

    .line 30
    .line 31
    invoke-static {p0, v1, v2}, Ldefpackage/g12;->O(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    iput-object p0, v0, Ldefpackage/dx4;->q:Landroid/animation/TimeInterpolator;

    .line 36
    .line 37
    return-object v0
.end method

.method public final dispatchProvideAutofillStructure(Landroid/view/ViewStructure;I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->dispatchProvideAutofillStructure(Landroid/view/ViewStructure;I)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->r:Ljava/lang/CharSequence;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    iget-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->R:Z

    .line 15
    .line 16
    iput-boolean v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->R:Z

    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 23
    .line 24
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->r:Ljava/lang/CharSequence;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    :try_start_0
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->dispatchProvideAutofillStructure(Landroid/view/ViewStructure;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 35
    .line 36
    .line 37
    iput-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->R:Z

    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 42
    .line 43
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    iput-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->R:Z

    .line 47
    .line 48
    throw p1

    .line 49
    :cond_1
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getAutofillId()Landroid/view/autofill/AutofillId;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p1, v0}, Landroid/view/ViewStructure;->setAutofillId(Landroid/view/autofill/AutofillId;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p1, p2}, Landroid/widget/LinearLayout;->onProvideAutofillStructure(Landroid/view/ViewStructure;I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1, p2}, Landroid/widget/LinearLayout;->onProvideAutofillVirtualStructure(Landroid/view/ViewStructure;I)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->n:Landroid/widget/FrameLayout;

    .line 63
    .line 64
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-virtual {p1, v1}, Landroid/view/ViewStructure;->setChildCount(I)V

    .line 69
    .line 70
    .line 71
    :goto_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-ge v2, v1, :cond_3

    .line 76
    .line 77
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {p1, v2}, Landroid/view/ViewStructure;->newChild(I)Landroid/view/ViewStructure;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v1, v3, p2}, Landroid/view/View;->dispatchProvideAutofillStructure(Landroid/view/ViewStructure;I)V

    .line 86
    .line 87
    .line 88
    iget-object v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 89
    .line 90
    if-ne v1, v4, :cond_2

    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getHint()Ljava/lang/CharSequence;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    invoke-virtual {v3, v1}, Landroid/view/ViewStructure;->setHint(Ljava/lang/CharSequence;)V

    .line 97
    .line 98
    .line 99
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_3
    return-void
.end method

.method public final dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->M0:Z

    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/View;->dispatchRestoreInstanceState(Landroid/util/SparseArray;)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->M0:Z

    .line 9
    .line 10
    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->P:Z

    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->H0:Ldefpackage/k40;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1, p1}, Ldefpackage/k40;->d(Landroid/graphics/Canvas;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->a0:Ldefpackage/fi2;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->W:Ldefpackage/fi2;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ldefpackage/fi2;->draw(Landroid/graphics/Canvas;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->a0:Ldefpackage/fi2;

    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->W:Ldefpackage/fi2;

    .line 39
    .line 40
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget v1, v1, Ldefpackage/k40;->b:F

    .line 45
    .line 46
    invoke-virtual {v2}, Landroid/graphics/Rect;->centerX()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    iget v4, v2, Landroid/graphics/Rect;->left:I

    .line 51
    .line 52
    invoke-static {v3, v1, v4}, Ldefpackage/yd;->c(IFI)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    iput v4, v0, Landroid/graphics/Rect;->left:I

    .line 57
    .line 58
    iget v2, v2, Landroid/graphics/Rect;->right:I

    .line 59
    .line 60
    invoke-static {v3, v1, v2}, Ldefpackage/yd;->c(IFI)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    iput v1, v0, Landroid/graphics/Rect;->right:I

    .line 65
    .line 66
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->a0:Ldefpackage/fi2;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Ldefpackage/fi2;->draw(Landroid/graphics/Canvas;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    return-void
.end method

.method public final drawableStateChanged()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->L0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->L0:Z

    .line 8
    .line 9
    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getDrawableState()[I

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x0

    .line 17
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->H0:Ldefpackage/k40;

    .line 18
    .line 19
    if-eqz v3, :cond_3

    .line 20
    .line 21
    iput-object v1, v3, Ldefpackage/k40;->R:[I

    .line 22
    .line 23
    iget-object v1, v3, Ldefpackage/k40;->o:Landroid/content/res/ColorStateList;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    :cond_1
    iget-object v1, v3, Ldefpackage/k40;->n:Landroid/content/res/ColorStateList;

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    :cond_2
    invoke-virtual {v3, v2}, Ldefpackage/k40;->i(Z)V

    .line 44
    .line 45
    .line 46
    move v1, v0

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    move v1, v2

    .line 49
    :goto_0
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 50
    .line 51
    if-eqz v3, :cond_5

    .line 52
    .line 53
    sget-object v3, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_4

    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_4

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    move v0, v2

    .line 69
    :goto_1
    invoke-virtual {p0, v0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->u(ZZ)V

    .line 70
    .line 71
    .line 72
    :cond_5
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->r()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->x()V

    .line 76
    .line 77
    .line 78
    if-eqz v1, :cond_6

    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 81
    .line 82
    .line 83
    :cond_6
    iput-boolean v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->L0:Z

    .line 84
    .line 85
    return-void
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->P:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->Q:Ljava/lang/CharSequence;

    .line 6
    .line 7
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ldefpackage/fi2;

    .line 14
    .line 15
    instance-of p0, p0, Ldefpackage/eh0;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final f(Z)Ldefpackage/fi2;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const v2, 0x7f0705b7

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    int-to-float v1, v1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    move v2, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v2, 0x0

    .line 20
    :goto_0
    iget-object v3, v0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 21
    .line 22
    instance-of v4, v3, Ldefpackage/xg2;

    .line 23
    .line 24
    if-eqz v4, :cond_1

    .line 25
    .line 26
    check-cast v3, Ldefpackage/xg2;

    .line 27
    .line 28
    invoke-virtual {v3}, Ldefpackage/xg2;->getPopupElevation()F

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    const v4, 0x7f070415

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    int-to-float v3, v3

    .line 45
    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const v5, 0x7f070578

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    new-instance v5, Ldefpackage/m34;

    .line 57
    .line 58
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    new-instance v6, Ldefpackage/m34;

    .line 62
    .line 63
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    new-instance v7, Ldefpackage/m34;

    .line 67
    .line 68
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 69
    .line 70
    .line 71
    new-instance v8, Ldefpackage/m34;

    .line 72
    .line 73
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 74
    .line 75
    .line 76
    new-instance v9, Ldefpackage/fz0;

    .line 77
    .line 78
    const/4 v10, 0x0

    .line 79
    invoke-direct {v9, v10}, Ldefpackage/fz0;-><init>(I)V

    .line 80
    .line 81
    .line 82
    new-instance v11, Ldefpackage/fz0;

    .line 83
    .line 84
    invoke-direct {v11, v10}, Ldefpackage/fz0;-><init>(I)V

    .line 85
    .line 86
    .line 87
    new-instance v12, Ldefpackage/fz0;

    .line 88
    .line 89
    invoke-direct {v12, v10}, Ldefpackage/fz0;-><init>(I)V

    .line 90
    .line 91
    .line 92
    new-instance v13, Ldefpackage/fz0;

    .line 93
    .line 94
    invoke-direct {v13, v10}, Ldefpackage/fz0;-><init>(I)V

    .line 95
    .line 96
    .line 97
    new-instance v14, Ldefpackage/m;

    .line 98
    .line 99
    invoke-direct {v14, v2}, Ldefpackage/m;-><init>(F)V

    .line 100
    .line 101
    .line 102
    new-instance v15, Ldefpackage/m;

    .line 103
    .line 104
    invoke-direct {v15, v2}, Ldefpackage/m;-><init>(F)V

    .line 105
    .line 106
    .line 107
    new-instance v2, Ldefpackage/m;

    .line 108
    .line 109
    invoke-direct {v2, v1}, Ldefpackage/m;-><init>(F)V

    .line 110
    .line 111
    .line 112
    new-instance v10, Ldefpackage/m;

    .line 113
    .line 114
    invoke-direct {v10, v1}, Ldefpackage/m;-><init>(F)V

    .line 115
    .line 116
    .line 117
    new-instance v1, Ldefpackage/bc4;

    .line 118
    .line 119
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 120
    .line 121
    .line 122
    iput-object v5, v1, Ldefpackage/bc4;->a:Ldefpackage/su3;

    .line 123
    .line 124
    iput-object v6, v1, Ldefpackage/bc4;->b:Ldefpackage/su3;

    .line 125
    .line 126
    iput-object v7, v1, Ldefpackage/bc4;->c:Ldefpackage/su3;

    .line 127
    .line 128
    iput-object v8, v1, Ldefpackage/bc4;->d:Ldefpackage/su3;

    .line 129
    .line 130
    iput-object v14, v1, Ldefpackage/bc4;->e:Ldefpackage/ke0;

    .line 131
    .line 132
    iput-object v15, v1, Ldefpackage/bc4;->f:Ldefpackage/ke0;

    .line 133
    .line 134
    iput-object v10, v1, Ldefpackage/bc4;->g:Ldefpackage/ke0;

    .line 135
    .line 136
    iput-object v2, v1, Ldefpackage/bc4;->h:Ldefpackage/ke0;

    .line 137
    .line 138
    iput-object v9, v1, Ldefpackage/bc4;->i:Ldefpackage/fz0;

    .line 139
    .line 140
    iput-object v11, v1, Ldefpackage/bc4;->j:Ldefpackage/fz0;

    .line 141
    .line 142
    iput-object v12, v1, Ldefpackage/bc4;->k:Ldefpackage/fz0;

    .line 143
    .line 144
    iput-object v13, v1, Ldefpackage/bc4;->l:Ldefpackage/fz0;

    .line 145
    .line 146
    iget-object v2, v0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 147
    .line 148
    instance-of v5, v2, Ldefpackage/xg2;

    .line 149
    .line 150
    if-eqz v5, :cond_2

    .line 151
    .line 152
    check-cast v2, Ldefpackage/xg2;

    .line 153
    .line 154
    invoke-virtual {v2}, Ldefpackage/xg2;->getDropDownBackgroundTintList()Landroid/content/res/ColorStateList;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    goto :goto_2

    .line 159
    :cond_2
    const/4 v2, 0x0

    .line 160
    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    if-nez v2, :cond_3

    .line 165
    .line 166
    sget-object v2, Ldefpackage/fi2;->J:Landroid/graphics/Paint;

    .line 167
    .line 168
    const-class v2, Ldefpackage/fi2;

    .line 169
    .line 170
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    const v5, 0x7f04013b

    .line 175
    .line 176
    .line 177
    invoke-static {v5, v0, v2}, Ldefpackage/g12;->r(ILandroid/content/Context;Ljava/lang/String;)I

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    :cond_3
    new-instance v5, Ldefpackage/fi2;

    .line 186
    .line 187
    invoke-direct {v5}, Ldefpackage/fi2;-><init>()V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v5, v0}, Ldefpackage/fi2;->j(Landroid/content/Context;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v5, v2}, Ldefpackage/fi2;->m(Landroid/content/res/ColorStateList;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v5, v3}, Ldefpackage/fi2;->l(F)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v5, v1}, Ldefpackage/fi2;->setShapeAppearanceModel(Ldefpackage/bc4;)V

    .line 200
    .line 201
    .line 202
    iget-object v0, v5, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 203
    .line 204
    iget-object v1, v0, Ldefpackage/ei2;->g:Landroid/graphics/Rect;

    .line 205
    .line 206
    if-nez v1, :cond_4

    .line 207
    .line 208
    new-instance v1, Landroid/graphics/Rect;

    .line 209
    .line 210
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 211
    .line 212
    .line 213
    iput-object v1, v0, Ldefpackage/ei2;->g:Landroid/graphics/Rect;

    .line 214
    .line 215
    :cond_4
    iget-object v0, v5, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 216
    .line 217
    iget-object v0, v0, Ldefpackage/ei2;->g:Landroid/graphics/Rect;

    .line 218
    .line 219
    const/4 v1, 0x0

    .line 220
    invoke-virtual {v0, v1, v4, v1, v4}, Landroid/graphics/Rect;->set(IIII)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v5}, Ldefpackage/fi2;->invalidateSelf()V

    .line 224
    .line 225
    .line 226
    return-object v5
.end method

.method public final g(IZ)I
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getPrefixText()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 10
    .line 11
    invoke-virtual {p0}, Ldefpackage/el4;->a()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    :goto_0
    add-int/2addr p0, p1

    .line 16
    return p0

    .line 17
    :cond_0
    if-eqz p2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getSuffixText()Ljava/lang/CharSequence;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 26
    .line 27
    invoke-virtual {p0}, Ldefpackage/g11;->b()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundPaddingLeft()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    goto :goto_0
.end method

.method public getBaseline()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getBaseline()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    add-int/2addr v1, v0

    .line 14
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->c()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    add-int/2addr p0, v1

    .line 19
    return p0

    .line 20
    :cond_0
    invoke-super {p0}, Landroid/widget/LinearLayout;->getBaseline()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public getBoxBackground()Ldefpackage/fi2;
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {}, Ldefpackage/tb4;->a()V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_1
    :goto_0
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ldefpackage/fi2;

    .line 16
    .line 17
    return-object p0
.end method

.method public getBoxBackgroundColor()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->k0:I

    .line 2
    .line 3
    return p0
.end method

.method public getBoxBackgroundMode()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:I

    .line 2
    .line 3
    return p0
.end method

.method public getBoxCollapsedPaddingTop()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->f0:I

    .line 2
    .line 3
    return p0
.end method

.method public getBoxCornerRadiusBottomEnd()F
    .locals 2

    .line 1
    invoke-static {p0}, Ldefpackage/vr1;->z(Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->n0:Landroid/graphics/RectF;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v1, Ldefpackage/bc4;->h:Ldefpackage/ke0;

    .line 12
    .line 13
    invoke-interface {v0, p0}, Ldefpackage/ke0;->a(Landroid/graphics/RectF;)F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    iget-object v0, v1, Ldefpackage/bc4;->g:Ldefpackage/ke0;

    .line 19
    .line 20
    invoke-interface {v0, p0}, Ldefpackage/ke0;->a(Landroid/graphics/RectF;)F

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public getBoxCornerRadiusBottomStart()F
    .locals 2

    .line 1
    invoke-static {p0}, Ldefpackage/vr1;->z(Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->n0:Landroid/graphics/RectF;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v1, Ldefpackage/bc4;->g:Ldefpackage/ke0;

    .line 12
    .line 13
    invoke-interface {v0, p0}, Ldefpackage/ke0;->a(Landroid/graphics/RectF;)F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    iget-object v0, v1, Ldefpackage/bc4;->h:Ldefpackage/ke0;

    .line 19
    .line 20
    invoke-interface {v0, p0}, Ldefpackage/ke0;->a(Landroid/graphics/RectF;)F

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public getBoxCornerRadiusTopEnd()F
    .locals 2

    .line 1
    invoke-static {p0}, Ldefpackage/vr1;->z(Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->n0:Landroid/graphics/RectF;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v1, Ldefpackage/bc4;->e:Ldefpackage/ke0;

    .line 12
    .line 13
    invoke-interface {v0, p0}, Ldefpackage/ke0;->a(Landroid/graphics/RectF;)F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    iget-object v0, v1, Ldefpackage/bc4;->f:Ldefpackage/ke0;

    .line 19
    .line 20
    invoke-interface {v0, p0}, Ldefpackage/ke0;->a(Landroid/graphics/RectF;)F

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public getBoxCornerRadiusTopStart()F
    .locals 2

    .line 1
    invoke-static {p0}, Ldefpackage/vr1;->z(Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->n0:Landroid/graphics/RectF;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v1, Ldefpackage/bc4;->f:Ldefpackage/ke0;

    .line 12
    .line 13
    invoke-interface {v0, p0}, Ldefpackage/ke0;->a(Landroid/graphics/RectF;)F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :cond_0
    iget-object v0, v1, Ldefpackage/bc4;->e:Ldefpackage/ke0;

    .line 19
    .line 20
    invoke-interface {v0, p0}, Ldefpackage/ke0;->a(Landroid/graphics/RectF;)F

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0
.end method

.method public getBoxStrokeColor()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z0:I

    .line 2
    .line 3
    return p0
.end method

.method public getBoxStrokeErrorColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getBoxStrokeWidth()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->h0:I

    .line 2
    .line 3
    return p0
.end method

.method public getBoxStrokeWidthFocused()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:I

    .line 2
    .line 3
    return p0
.end method

.method public getCounterMaxLength()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:I

    .line 2
    .line 3
    return p0
.end method

.method public getCounterOverflowDescription()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public getCounterOverflowTextColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->M:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCounterTextColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->L:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCursorColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->N:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCursorErrorColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDefaultHintTextColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->v0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getEditText()Landroid/widget/EditText;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 2
    .line 3
    return-object p0
.end method

.method public getEndIconContentDescription()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getEndIconDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getEndIconMinSize()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iget p0, p0, Ldefpackage/g11;->z:I

    .line 4
    .line 5
    return p0
.end method

.method public getEndIconMode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iget p0, p0, Ldefpackage/g11;->v:I

    .line 4
    .line 5
    return p0
.end method

.method public getEndIconScaleType()Landroid/widget/ImageView$ScaleType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/g11;->A:Landroid/widget/ImageView$ScaleType;

    .line 4
    .line 5
    return-object p0
.end method

.method public getEndIconView()Lcom/google/android/material/internal/CheckableImageButton;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    return-object p0
.end method

.method public getError()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Ldefpackage/cy1;

    .line 2
    .line 3
    iget-boolean v0, p0, Ldefpackage/cy1;->q:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/cy1;->p:Ljava/lang/CharSequence;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public getErrorAccessibilityLiveRegion()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Ldefpackage/cy1;

    .line 2
    .line 3
    iget p0, p0, Ldefpackage/cy1;->t:I

    .line 4
    .line 5
    return p0
.end method

.method public getErrorContentDescription()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Ldefpackage/cy1;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/cy1;->s:Ljava/lang/CharSequence;

    .line 4
    .line 5
    return-object p0
.end method

.method public getErrorCurrentTextColors()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Ldefpackage/cy1;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/cy1;->r:Ldefpackage/mh;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, -0x1

    .line 13
    return p0
.end method

.method public getErrorIconDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/g11;->p:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getHelperText()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Ldefpackage/cy1;

    .line 2
    .line 3
    iget-boolean v0, p0, Ldefpackage/cy1;->x:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/cy1;->w:Ljava/lang/CharSequence;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return-object p0
.end method

.method public getHelperTextCurrentTextColor()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Ldefpackage/cy1;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/cy1;->y:Ldefpackage/mh;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, -0x1

    .line 13
    return p0
.end method

.method public getHint()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->P:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->Q:Ljava/lang/CharSequence;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public final getHintCollapsedTextHeight()F
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->H0:Ldefpackage/k40;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/k40;->e()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getHintCurrentCollapsedTextColor()I
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->H0:Ldefpackage/k40;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/k40;->o:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ldefpackage/k40;->f(Landroid/content/res/ColorStateList;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public getHintTextColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getLengthCounter()Ldefpackage/gs4;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Ldefpackage/gs4;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMaxEms()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->t:I

    .line 2
    .line 3
    return p0
.end method

.method public getMaxWidth()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->v:I

    .line 2
    .line 3
    return p0
.end method

.method public getMinEms()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->s:I

    .line 2
    .line 3
    return p0
.end method

.method public getMinWidth()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->u:I

    .line 2
    .line 3
    return p0
.end method

.method public getPasswordVisibilityToggleContentDescription()Ljava/lang/CharSequence;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getPasswordVisibilityToggleDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getPlaceholderText()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->E:Ljava/lang/CharSequence;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0
.end method

.method public getPlaceholderTextAppearance()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->I:I

    .line 2
    .line 3
    return p0
.end method

.method public getPlaceholderTextColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->H:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPrefixText()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/el4;->p:Ljava/lang/CharSequence;

    .line 4
    .line 5
    return-object p0
.end method

.method public getPrefixTextColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/el4;->o:Ldefpackage/mh;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getPrefixTextView()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/el4;->o:Ldefpackage/mh;

    .line 4
    .line 5
    return-object p0
.end method

.method public getShapeAppearanceModel()Ldefpackage/bc4;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 2
    .line 3
    return-object p0
.end method

.method public getStartIconContentDescription()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/el4;->q:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getStartIconDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/el4;->q:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getStartIconMinSize()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 2
    .line 3
    iget p0, p0, Ldefpackage/el4;->t:I

    .line 4
    .line 5
    return p0
.end method

.method public getStartIconScaleType()Landroid/widget/ImageView$ScaleType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/el4;->u:Landroid/widget/ImageView$ScaleType;

    .line 4
    .line 5
    return-object p0
.end method

.method public getSuffixText()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/g11;->C:Ljava/lang/CharSequence;

    .line 4
    .line 5
    return-object p0
.end method

.method public getSuffixTextColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/g11;->D:Ldefpackage/mh;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getSuffixTextView()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/g11;->D:Ldefpackage/mh;

    .line 4
    .line 5
    return-object p0
.end method

.method public getTypeface()Landroid/graphics/Typeface;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Landroid/graphics/Typeface;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(IZ)I
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getSuffixText()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 10
    .line 11
    invoke-virtual {p0}, Ldefpackage/g11;->b()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    :goto_0
    sub-int/2addr p1, p0

    .line 16
    return p1

    .line 17
    :cond_0
    if-eqz p2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getPrefixText()Ljava/lang/CharSequence;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    if-eqz p2, :cond_1

    .line 24
    .line 25
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 26
    .line 27
    invoke-virtual {p0}, Ldefpackage/el4;->a()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundPaddingRight()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    goto :goto_0
.end method

.method public final i()V
    .locals 8

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    if-eq v0, v2, :cond_3

    .line 9
    .line 10
    if-ne v0, v1, :cond_2

    .line 11
    .line 12
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->P:Z

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ldefpackage/fi2;

    .line 17
    .line 18
    instance-of v0, v0, Ldefpackage/eh0;

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 23
    .line 24
    sget v4, Ldefpackage/eh0;->L:I

    .line 25
    .line 26
    new-instance v4, Ldefpackage/dh0;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v0, Ldefpackage/bc4;

    .line 32
    .line 33
    invoke-direct {v0}, Ldefpackage/bc4;-><init>()V

    .line 34
    .line 35
    .line 36
    :goto_0
    new-instance v5, Landroid/graphics/RectF;

    .line 37
    .line 38
    invoke-direct {v5}, Landroid/graphics/RectF;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-direct {v4, v0, v5}, Ldefpackage/dh0;-><init>(Ldefpackage/bc4;Landroid/graphics/RectF;)V

    .line 42
    .line 43
    .line 44
    new-instance v0, Ldefpackage/eh0;

    .line 45
    .line 46
    invoke-direct {v0, v4}, Ldefpackage/fi2;-><init>(Ldefpackage/ei2;)V

    .line 47
    .line 48
    .line 49
    iput-object v4, v0, Ldefpackage/eh0;->K:Ldefpackage/dh0;

    .line 50
    .line 51
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ldefpackage/fi2;

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    new-instance v0, Ldefpackage/fi2;

    .line 55
    .line 56
    iget-object v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 57
    .line 58
    invoke-direct {v0, v4}, Ldefpackage/fi2;-><init>(Ldefpackage/bc4;)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ldefpackage/fi2;

    .line 62
    .line 63
    :goto_1
    iput-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->W:Ldefpackage/fi2;

    .line 64
    .line 65
    iput-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->a0:Ldefpackage/fi2;

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    iget p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:I

    .line 74
    .line 75
    const-string v1, " is illegal; only @BoxBackgroundMode constants are supported."

    .line 76
    .line 77
    invoke-static {v0, p0, v1}, Ldefpackage/f34;->i(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_3
    new-instance v0, Ldefpackage/fi2;

    .line 86
    .line 87
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 88
    .line 89
    invoke-direct {v0, v3}, Ldefpackage/fi2;-><init>(Ldefpackage/bc4;)V

    .line 90
    .line 91
    .line 92
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ldefpackage/fi2;

    .line 93
    .line 94
    new-instance v0, Ldefpackage/fi2;

    .line 95
    .line 96
    invoke-direct {v0}, Ldefpackage/fi2;-><init>()V

    .line 97
    .line 98
    .line 99
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->W:Ldefpackage/fi2;

    .line 100
    .line 101
    new-instance v0, Ldefpackage/fi2;

    .line 102
    .line 103
    invoke-direct {v0}, Ldefpackage/fi2;-><init>()V

    .line 104
    .line 105
    .line 106
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->a0:Ldefpackage/fi2;

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    iput-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ldefpackage/fi2;

    .line 110
    .line 111
    iput-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->W:Ldefpackage/fi2;

    .line 112
    .line 113
    iput-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->a0:Ldefpackage/fi2;

    .line 114
    .line 115
    :goto_2
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->s()V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->x()V

    .line 119
    .line 120
    .line 121
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:I

    .line 122
    .line 123
    const/high16 v3, 0x40000000    # 2.0f

    .line 124
    .line 125
    if-ne v0, v2, :cond_6

    .line 126
    .line 127
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 140
    .line 141
    cmpl-float v0, v0, v3

    .line 142
    .line 143
    if-ltz v0, :cond_5

    .line 144
    .line 145
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    const v4, 0x7f0704fa

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->f0:I

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {v0}, Ldefpackage/h12;->z(Landroid/content/Context;)Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-eqz v0, :cond_6

    .line 168
    .line 169
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    const v4, 0x7f0704f9

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->f0:I

    .line 181
    .line 182
    :cond_6
    :goto_3
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 183
    .line 184
    if-eqz v0, :cond_9

    .line 185
    .line 186
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:I

    .line 187
    .line 188
    if-eq v0, v2, :cond_7

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    iget v0, v0, Landroid/content/res/Configuration;->fontScale:F

    .line 204
    .line 205
    cmpl-float v0, v0, v3

    .line 206
    .line 207
    if-ltz v0, :cond_8

    .line 208
    .line 209
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 210
    .line 211
    sget-object v3, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 212
    .line 213
    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    const v5, 0x7f0704f8

    .line 222
    .line 223
    .line 224
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    iget-object v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 229
    .line 230
    invoke-virtual {v5}, Landroid/view/View;->getPaddingEnd()I

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    const v7, 0x7f0704f7

    .line 239
    .line 240
    .line 241
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    invoke-virtual {v0, v3, v4, v5, v6}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 246
    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    invoke-static {v0}, Ldefpackage/h12;->z(Landroid/content/Context;)Z

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    if-eqz v0, :cond_9

    .line 258
    .line 259
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 260
    .line 261
    sget-object v3, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 262
    .line 263
    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    .line 264
    .line 265
    .line 266
    move-result v3

    .line 267
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 268
    .line 269
    .line 270
    move-result-object v4

    .line 271
    const v5, 0x7f0704f6

    .line 272
    .line 273
    .line 274
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    iget-object v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 279
    .line 280
    invoke-virtual {v5}, Landroid/view/View;->getPaddingEnd()I

    .line 281
    .line 282
    .line 283
    move-result v5

    .line 284
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 285
    .line 286
    .line 287
    move-result-object v6

    .line 288
    const v7, 0x7f0704f5

    .line 289
    .line 290
    .line 291
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 292
    .line 293
    .line 294
    move-result v6

    .line 295
    invoke-virtual {v0, v3, v4, v5, v6}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 296
    .line 297
    .line 298
    :cond_9
    :goto_4
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:I

    .line 299
    .line 300
    if-eqz v0, :cond_a

    .line 301
    .line 302
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->t()V

    .line 303
    .line 304
    .line 305
    :cond_a
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 306
    .line 307
    instance-of v3, v0, Landroid/widget/AutoCompleteTextView;

    .line 308
    .line 309
    if-nez v3, :cond_b

    .line 310
    .line 311
    goto :goto_5

    .line 312
    :cond_b
    check-cast v0, Landroid/widget/AutoCompleteTextView;

    .line 313
    .line 314
    invoke-virtual {v0}, Landroid/widget/AutoCompleteTextView;->getDropDownBackground()Landroid/graphics/drawable/Drawable;

    .line 315
    .line 316
    .line 317
    move-result-object v3

    .line 318
    if-nez v3, :cond_d

    .line 319
    .line 320
    iget v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:I

    .line 321
    .line 322
    if-ne v3, v1, :cond_c

    .line 323
    .line 324
    invoke-direct {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getOrCreateOutlinedDropDownMenuBackground()Landroid/graphics/drawable/Drawable;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    invoke-virtual {v0, p0}, Landroid/widget/AutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 329
    .line 330
    .line 331
    return-void

    .line 332
    :cond_c
    if-ne v3, v2, :cond_d

    .line 333
    .line 334
    invoke-direct {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getOrCreateFilledDropDownMenuBackground()Landroid/graphics/drawable/Drawable;

    .line 335
    .line 336
    .line 337
    move-result-object p0

    .line 338
    invoke-virtual {v0, p0}, Landroid/widget/AutoCompleteTextView;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 339
    .line 340
    .line 341
    :cond_d
    :goto_5
    return-void
.end method

.method public final j()V
    .locals 12

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_a

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/widget/TextView;->getGravity()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->H0:Ldefpackage/k40;

    .line 22
    .line 23
    iget-object v3, v2, Ldefpackage/k40;->G:Ljava/lang/CharSequence;

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ldefpackage/k40;->b(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    iput-boolean v3, v2, Ldefpackage/k40;->I:Z

    .line 30
    .line 31
    iget-object v4, v2, Ldefpackage/k40;->h:Landroid/graphics/Rect;

    .line 32
    .line 33
    const/high16 v5, 0x40000000    # 2.0f

    .line 34
    .line 35
    const/4 v6, 0x1

    .line 36
    const/4 v7, 0x5

    .line 37
    const v8, 0x800005

    .line 38
    .line 39
    .line 40
    const/16 v9, 0x11

    .line 41
    .line 42
    if-eq v1, v9, :cond_6

    .line 43
    .line 44
    and-int/lit8 v10, v1, 0x7

    .line 45
    .line 46
    if-ne v10, v6, :cond_1

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_1
    and-int v10, v1, v8

    .line 50
    .line 51
    if-eq v10, v8, :cond_4

    .line 52
    .line 53
    and-int/lit8 v10, v1, 0x5

    .line 54
    .line 55
    if-ne v10, v7, :cond_2

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    if-eqz v3, :cond_3

    .line 59
    .line 60
    iget v3, v4, Landroid/graphics/Rect;->right:I

    .line 61
    .line 62
    int-to-float v3, v3

    .line 63
    iget v10, v2, Ldefpackage/k40;->j0:F

    .line 64
    .line 65
    :goto_0
    sub-float/2addr v3, v10

    .line 66
    goto :goto_4

    .line 67
    :cond_3
    iget v3, v4, Landroid/graphics/Rect;->left:I

    .line 68
    .line 69
    :goto_1
    int-to-float v3, v3

    .line 70
    goto :goto_4

    .line 71
    :cond_4
    :goto_2
    if-eqz v3, :cond_5

    .line 72
    .line 73
    iget v3, v4, Landroid/graphics/Rect;->left:I

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_5
    iget v3, v4, Landroid/graphics/Rect;->right:I

    .line 77
    .line 78
    int-to-float v3, v3

    .line 79
    iget v10, v2, Ldefpackage/k40;->j0:F

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_6
    :goto_3
    int-to-float v3, v0

    .line 83
    div-float/2addr v3, v5

    .line 84
    iget v10, v2, Ldefpackage/k40;->j0:F

    .line 85
    .line 86
    div-float/2addr v10, v5

    .line 87
    goto :goto_0

    .line 88
    :goto_4
    iget v10, v4, Landroid/graphics/Rect;->left:I

    .line 89
    .line 90
    int-to-float v10, v10

    .line 91
    invoke-static {v3, v10}, Ljava/lang/Math;->max(FF)F

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    iget-object v10, p0, Lcom/google/android/material/textfield/TextInputLayout;->n0:Landroid/graphics/RectF;

    .line 96
    .line 97
    iput v3, v10, Landroid/graphics/RectF;->left:F

    .line 98
    .line 99
    iget v11, v4, Landroid/graphics/Rect;->top:I

    .line 100
    .line 101
    int-to-float v11, v11

    .line 102
    iput v11, v10, Landroid/graphics/RectF;->top:F

    .line 103
    .line 104
    if-eq v1, v9, :cond_c

    .line 105
    .line 106
    and-int/lit8 v9, v1, 0x7

    .line 107
    .line 108
    if-ne v9, v6, :cond_7

    .line 109
    .line 110
    goto :goto_8

    .line 111
    :cond_7
    and-int v0, v1, v8

    .line 112
    .line 113
    if-eq v0, v8, :cond_a

    .line 114
    .line 115
    and-int/lit8 v0, v1, 0x5

    .line 116
    .line 117
    if-ne v0, v7, :cond_8

    .line 118
    .line 119
    goto :goto_7

    .line 120
    :cond_8
    iget-boolean v0, v2, Ldefpackage/k40;->I:Z

    .line 121
    .line 122
    if-eqz v0, :cond_9

    .line 123
    .line 124
    iget v0, v4, Landroid/graphics/Rect;->right:I

    .line 125
    .line 126
    :goto_5
    int-to-float v0, v0

    .line 127
    goto :goto_9

    .line 128
    :cond_9
    iget v0, v2, Ldefpackage/k40;->j0:F

    .line 129
    .line 130
    :goto_6
    add-float/2addr v0, v3

    .line 131
    goto :goto_9

    .line 132
    :cond_a
    :goto_7
    iget-boolean v0, v2, Ldefpackage/k40;->I:Z

    .line 133
    .line 134
    if-eqz v0, :cond_b

    .line 135
    .line 136
    iget v0, v2, Ldefpackage/k40;->j0:F

    .line 137
    .line 138
    goto :goto_6

    .line 139
    :cond_b
    iget v0, v4, Landroid/graphics/Rect;->right:I

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_c
    :goto_8
    int-to-float v0, v0

    .line 143
    div-float/2addr v0, v5

    .line 144
    iget v1, v2, Ldefpackage/k40;->j0:F

    .line 145
    .line 146
    div-float/2addr v1, v5

    .line 147
    add-float/2addr v0, v1

    .line 148
    :goto_9
    iget v1, v4, Landroid/graphics/Rect;->right:I

    .line 149
    .line 150
    int-to-float v1, v1

    .line 151
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    iput v0, v10, Landroid/graphics/RectF;->right:F

    .line 156
    .line 157
    iget v0, v4, Landroid/graphics/Rect;->top:I

    .line 158
    .line 159
    int-to-float v0, v0

    .line 160
    invoke-virtual {v2}, Ldefpackage/k40;->e()F

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    add-float/2addr v1, v0

    .line 165
    iput v1, v10, Landroid/graphics/RectF;->bottom:F

    .line 166
    .line 167
    invoke-virtual {v10}, Landroid/graphics/RectF;->width()F

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    const/4 v1, 0x0

    .line 172
    cmpg-float v0, v0, v1

    .line 173
    .line 174
    if-lez v0, :cond_e

    .line 175
    .line 176
    invoke-virtual {v10}, Landroid/graphics/RectF;->height()F

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    cmpg-float v0, v0, v1

    .line 181
    .line 182
    if-gtz v0, :cond_d

    .line 183
    .line 184
    goto :goto_a

    .line 185
    :cond_d
    iget v0, v10, Landroid/graphics/RectF;->left:F

    .line 186
    .line 187
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->d0:I

    .line 188
    .line 189
    int-to-float v1, v1

    .line 190
    sub-float/2addr v0, v1

    .line 191
    iput v0, v10, Landroid/graphics/RectF;->left:F

    .line 192
    .line 193
    iget v0, v10, Landroid/graphics/RectF;->right:F

    .line 194
    .line 195
    add-float/2addr v0, v1

    .line 196
    iput v0, v10, Landroid/graphics/RectF;->right:F

    .line 197
    .line 198
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    neg-int v0, v0

    .line 203
    int-to-float v0, v0

    .line 204
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    neg-int v1, v1

    .line 209
    int-to-float v1, v1

    .line 210
    invoke-virtual {v10}, Landroid/graphics/RectF;->height()F

    .line 211
    .line 212
    .line 213
    move-result v2

    .line 214
    div-float/2addr v2, v5

    .line 215
    sub-float/2addr v1, v2

    .line 216
    iget v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 217
    .line 218
    int-to-float v2, v2

    .line 219
    add-float/2addr v1, v2

    .line 220
    invoke-virtual {v10, v0, v1}, Landroid/graphics/RectF;->offset(FF)V

    .line 221
    .line 222
    .line 223
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ldefpackage/fi2;

    .line 224
    .line 225
    check-cast p0, Ldefpackage/eh0;

    .line 226
    .line 227
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    iget v0, v10, Landroid/graphics/RectF;->left:F

    .line 231
    .line 232
    iget v1, v10, Landroid/graphics/RectF;->top:F

    .line 233
    .line 234
    iget v2, v10, Landroid/graphics/RectF;->right:F

    .line 235
    .line 236
    iget v3, v10, Landroid/graphics/RectF;->bottom:F

    .line 237
    .line 238
    invoke-virtual {p0, v0, v1, v2, v3}, Ldefpackage/eh0;->v(FFFF)V

    .line 239
    .line 240
    .line 241
    :cond_e
    :goto_a
    return-void
.end method

.method public final l(Ldefpackage/mh;I)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    invoke-virtual {p2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 9
    .line 10
    .line 11
    move-result p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    const v0, -0xff01

    .line 13
    .line 14
    .line 15
    if-ne p2, v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void

    .line 19
    :catch_0
    :goto_0
    const p2, 0x7f1401f9

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const p2, 0x7f060058

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p2}, Landroid/content/Context;->getColor(I)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final m()Z
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Ldefpackage/cy1;

    .line 2
    .line 3
    iget v0, p0, Ldefpackage/cy1;->o:I

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Ldefpackage/cy1;->r:Ldefpackage/mh;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Ldefpackage/cy1;->p:Ljava/lang/CharSequence;

    .line 13
    .line 14
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    return v1

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public final n(Landroid/text/Editable;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Ldefpackage/gs4;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/tb4;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move p1, v0

    .line 17
    :goto_0
    iget-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Z

    .line 18
    .line 19
    iget v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:I

    .line 20
    .line 21
    const/4 v3, -0x1

    .line 22
    const/4 v4, 0x0

    .line 23
    if-ne v2, v3, :cond_1

    .line 24
    .line 25
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 26
    .line 27
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 35
    .line 36
    invoke-virtual {p1, v4}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    iput-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Z

    .line 40
    .line 41
    goto/16 :goto_5

    .line 42
    .line 43
    :cond_1
    const/4 v3, 0x1

    .line 44
    if-le p1, v2, :cond_2

    .line 45
    .line 46
    move v2, v3

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move v2, v0

    .line 49
    :goto_1
    iput-boolean v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Z

    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iget-object v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 56
    .line 57
    iget v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:I

    .line 58
    .line 59
    iget-boolean v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Z

    .line 60
    .line 61
    if-eqz v7, :cond_3

    .line 62
    .line 63
    const v7, 0x7f1300ab

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    const v7, 0x7f1300aa

    .line 68
    .line 69
    .line 70
    :goto_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    filled-new-array {v8, v6}, [Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-virtual {v2, v7, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v5, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 87
    .line 88
    .line 89
    iget-boolean v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Z

    .line 90
    .line 91
    if-eq v1, v2, :cond_4

    .line 92
    .line 93
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->o()V

    .line 94
    .line 95
    .line 96
    :cond_4
    sget-object v2, Ldefpackage/js;->b:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    invoke-static {v2}, Landroid/text/TextUtils;->getLayoutDirectionFromLocale(Ljava/util/Locale;)I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-ne v2, v3, :cond_5

    .line 107
    .line 108
    sget-object v2, Ldefpackage/js;->e:Ldefpackage/js;

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_5
    sget-object v2, Ldefpackage/js;->d:Ldefpackage/js;

    .line 112
    .line 113
    :goto_3
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 114
    .line 115
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    iget v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:I

    .line 124
    .line 125
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    filled-new-array {p1, v6}, [Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    const v6, 0x7f1300ac

    .line 134
    .line 135
    .line 136
    invoke-virtual {v5, v6, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    sget-object v5, Ldefpackage/vr4;->a:Ldefpackage/xk0;

    .line 144
    .line 145
    if-nez p1, :cond_6

    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_6
    invoke-virtual {v2, p1}, Ldefpackage/js;->c(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-virtual {p1}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    :goto_4
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 157
    .line 158
    .line 159
    :goto_5
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 160
    .line 161
    if-eqz p1, :cond_7

    .line 162
    .line 163
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Z

    .line 164
    .line 165
    if-eq v1, p1, :cond_7

    .line 166
    .line 167
    invoke-virtual {p0, v0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->u(ZZ)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->x()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->r()V

    .line 174
    .line 175
    .line 176
    :cond_7
    return-void
.end method

.method public final o()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->C:I

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->D:I

    .line 13
    .line 14
    :goto_0
    invoke-virtual {p0, v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->l(Ldefpackage/mh;I)V

    .line 15
    .line 16
    .line 17
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Z

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->L:Landroid/content/res/ColorStateList;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 26
    .line 27
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Z

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->M:Landroid/content/res/ColorStateList;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->H0:Ldefpackage/k40;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ldefpackage/k40;->h(Landroid/content/res/Configuration;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 6

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/LinearLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 5
    .line 6
    if-eqz p1, :cond_c

    .line 7
    .line 8
    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->l0:Landroid/graphics/Rect;

    .line 9
    .line 10
    invoke-static {p0, p1, p2}, Ldefpackage/ep0;->a(Landroid/view/ViewGroup;Landroid/view/View;Landroid/graphics/Rect;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->W:Ldefpackage/fi2;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget p3, p2, Landroid/graphics/Rect;->bottom:I

    .line 18
    .line 19
    iget p4, p0, Lcom/google/android/material/textfield/TextInputLayout;->h0:I

    .line 20
    .line 21
    sub-int p4, p3, p4

    .line 22
    .line 23
    iget p5, p2, Landroid/graphics/Rect;->left:I

    .line 24
    .line 25
    iget v0, p2, Landroid/graphics/Rect;->right:I

    .line 26
    .line 27
    invoke-virtual {p1, p5, p4, v0, p3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->a0:Ldefpackage/fi2;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iget p3, p2, Landroid/graphics/Rect;->bottom:I

    .line 35
    .line 36
    iget p4, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:I

    .line 37
    .line 38
    sub-int p4, p3, p4

    .line 39
    .line 40
    iget p5, p2, Landroid/graphics/Rect;->left:I

    .line 41
    .line 42
    iget v0, p2, Landroid/graphics/Rect;->right:I

    .line 43
    .line 44
    invoke-virtual {p1, p5, p4, v0, p3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 45
    .line 46
    .line 47
    :cond_1
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->P:Z

    .line 48
    .line 49
    if-eqz p1, :cond_c

    .line 50
    .line 51
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/widget/TextView;->getTextSize()F

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    iget-object p3, p0, Lcom/google/android/material/textfield/TextInputLayout;->H0:Ldefpackage/k40;

    .line 58
    .line 59
    iget p4, p3, Ldefpackage/k40;->l:F

    .line 60
    .line 61
    cmpl-float p4, p4, p1

    .line 62
    .line 63
    const/4 p5, 0x0

    .line 64
    if-eqz p4, :cond_2

    .line 65
    .line 66
    iput p1, p3, Ldefpackage/k40;->l:F

    .line 67
    .line 68
    invoke-virtual {p3, p5}, Ldefpackage/k40;->i(Z)V

    .line 69
    .line 70
    .line 71
    :cond_2
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 72
    .line 73
    invoke-virtual {p1}, Landroid/widget/TextView;->getGravity()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    and-int/lit8 p4, p1, -0x71

    .line 78
    .line 79
    or-int/lit8 p4, p4, 0x30

    .line 80
    .line 81
    invoke-virtual {p3, p4}, Ldefpackage/k40;->l(I)V

    .line 82
    .line 83
    .line 84
    iget p4, p3, Ldefpackage/k40;->j:I

    .line 85
    .line 86
    if-eq p4, p1, :cond_3

    .line 87
    .line 88
    iput p1, p3, Ldefpackage/k40;->j:I

    .line 89
    .line 90
    invoke-virtual {p3, p5}, Ldefpackage/k40;->i(Z)V

    .line 91
    .line 92
    .line 93
    :cond_3
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 94
    .line 95
    if-eqz p1, :cond_b

    .line 96
    .line 97
    invoke-static {p0}, Ldefpackage/vr1;->z(Landroid/view/View;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    iget p4, p2, Landroid/graphics/Rect;->bottom:I

    .line 102
    .line 103
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->m0:Landroid/graphics/Rect;

    .line 104
    .line 105
    iput p4, v0, Landroid/graphics/Rect;->bottom:I

    .line 106
    .line 107
    iget p4, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:I

    .line 108
    .line 109
    iget v1, p2, Landroid/graphics/Rect;->left:I

    .line 110
    .line 111
    const/4 v2, 0x1

    .line 112
    if-eq p4, v2, :cond_5

    .line 113
    .line 114
    const/4 v3, 0x2

    .line 115
    if-eq p4, v3, :cond_4

    .line 116
    .line 117
    invoke-virtual {p0, v1, p1}, Lcom/google/android/material/textfield/TextInputLayout;->g(IZ)I

    .line 118
    .line 119
    .line 120
    move-result p4

    .line 121
    iput p4, v0, Landroid/graphics/Rect;->left:I

    .line 122
    .line 123
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 124
    .line 125
    .line 126
    move-result p4

    .line 127
    iput p4, v0, Landroid/graphics/Rect;->top:I

    .line 128
    .line 129
    iget p4, p2, Landroid/graphics/Rect;->right:I

    .line 130
    .line 131
    invoke-virtual {p0, p4, p1}, Lcom/google/android/material/textfield/TextInputLayout;->h(IZ)I

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    iput p1, v0, Landroid/graphics/Rect;->right:I

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_4
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 139
    .line 140
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    .line 141
    .line 142
    .line 143
    move-result p1

    .line 144
    add-int/2addr p1, v1

    .line 145
    iput p1, v0, Landroid/graphics/Rect;->left:I

    .line 146
    .line 147
    iget p1, p2, Landroid/graphics/Rect;->top:I

    .line 148
    .line 149
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->c()I

    .line 150
    .line 151
    .line 152
    move-result p4

    .line 153
    sub-int/2addr p1, p4

    .line 154
    iput p1, v0, Landroid/graphics/Rect;->top:I

    .line 155
    .line 156
    iget p1, p2, Landroid/graphics/Rect;->right:I

    .line 157
    .line 158
    iget-object p4, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 159
    .line 160
    invoke-virtual {p4}, Landroid/view/View;->getPaddingRight()I

    .line 161
    .line 162
    .line 163
    move-result p4

    .line 164
    sub-int/2addr p1, p4

    .line 165
    iput p1, v0, Landroid/graphics/Rect;->right:I

    .line 166
    .line 167
    goto :goto_0

    .line 168
    :cond_5
    invoke-virtual {p0, v1, p1}, Lcom/google/android/material/textfield/TextInputLayout;->g(IZ)I

    .line 169
    .line 170
    .line 171
    move-result p4

    .line 172
    iput p4, v0, Landroid/graphics/Rect;->left:I

    .line 173
    .line 174
    iget p4, p2, Landroid/graphics/Rect;->top:I

    .line 175
    .line 176
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->f0:I

    .line 177
    .line 178
    add-int/2addr p4, v1

    .line 179
    iput p4, v0, Landroid/graphics/Rect;->top:I

    .line 180
    .line 181
    iget p4, p2, Landroid/graphics/Rect;->right:I

    .line 182
    .line 183
    invoke-virtual {p0, p4, p1}, Lcom/google/android/material/textfield/TextInputLayout;->h(IZ)I

    .line 184
    .line 185
    .line 186
    move-result p1

    .line 187
    iput p1, v0, Landroid/graphics/Rect;->right:I

    .line 188
    .line 189
    :goto_0
    iget p1, v0, Landroid/graphics/Rect;->left:I

    .line 190
    .line 191
    iget p4, v0, Landroid/graphics/Rect;->top:I

    .line 192
    .line 193
    iget v1, v0, Landroid/graphics/Rect;->right:I

    .line 194
    .line 195
    iget v3, v0, Landroid/graphics/Rect;->bottom:I

    .line 196
    .line 197
    iget-object v4, p3, Ldefpackage/k40;->h:Landroid/graphics/Rect;

    .line 198
    .line 199
    iget v5, v4, Landroid/graphics/Rect;->left:I

    .line 200
    .line 201
    if-ne v5, p1, :cond_6

    .line 202
    .line 203
    iget v5, v4, Landroid/graphics/Rect;->top:I

    .line 204
    .line 205
    if-ne v5, p4, :cond_6

    .line 206
    .line 207
    iget v5, v4, Landroid/graphics/Rect;->right:I

    .line 208
    .line 209
    if-ne v5, v1, :cond_6

    .line 210
    .line 211
    iget v5, v4, Landroid/graphics/Rect;->bottom:I

    .line 212
    .line 213
    if-ne v5, v3, :cond_6

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_6
    invoke-virtual {v4, p1, p4, v1, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 217
    .line 218
    .line 219
    iput-boolean v2, p3, Ldefpackage/k40;->S:Z

    .line 220
    .line 221
    :goto_1
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 222
    .line 223
    if-eqz p1, :cond_a

    .line 224
    .line 225
    iget-object p1, p3, Ldefpackage/k40;->U:Landroid/text/TextPaint;

    .line 226
    .line 227
    iget p4, p3, Ldefpackage/k40;->l:F

    .line 228
    .line 229
    invoke-virtual {p1, p4}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 230
    .line 231
    .line 232
    iget-object p4, p3, Ldefpackage/k40;->z:Landroid/graphics/Typeface;

    .line 233
    .line 234
    invoke-virtual {p1, p4}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 235
    .line 236
    .line 237
    iget p4, p3, Ldefpackage/k40;->g0:F

    .line 238
    .line 239
    invoke-virtual {p1, p4}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p1}, Landroid/graphics/Paint;->ascent()F

    .line 243
    .line 244
    .line 245
    move-result p1

    .line 246
    neg-float p1, p1

    .line 247
    iget p4, p2, Landroid/graphics/Rect;->left:I

    .line 248
    .line 249
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 250
    .line 251
    invoke-virtual {v1}, Landroid/widget/TextView;->getCompoundPaddingLeft()I

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    add-int/2addr v1, p4

    .line 256
    iput v1, v0, Landroid/graphics/Rect;->left:I

    .line 257
    .line 258
    iget p4, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:I

    .line 259
    .line 260
    if-ne p4, v2, :cond_7

    .line 261
    .line 262
    iget-object p4, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 263
    .line 264
    invoke-virtual {p4}, Landroid/widget/TextView;->getMinLines()I

    .line 265
    .line 266
    .line 267
    move-result p4

    .line 268
    if-gt p4, v2, :cond_7

    .line 269
    .line 270
    invoke-virtual {p2}, Landroid/graphics/Rect;->centerY()I

    .line 271
    .line 272
    .line 273
    move-result p4

    .line 274
    int-to-float p4, p4

    .line 275
    const/high16 v1, 0x40000000    # 2.0f

    .line 276
    .line 277
    div-float v1, p1, v1

    .line 278
    .line 279
    sub-float/2addr p4, v1

    .line 280
    float-to-int p4, p4

    .line 281
    goto :goto_2

    .line 282
    :cond_7
    iget p4, p2, Landroid/graphics/Rect;->top:I

    .line 283
    .line 284
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 285
    .line 286
    invoke-virtual {v1}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    add-int/2addr p4, v1

    .line 291
    :goto_2
    iput p4, v0, Landroid/graphics/Rect;->top:I

    .line 292
    .line 293
    iget p4, p2, Landroid/graphics/Rect;->right:I

    .line 294
    .line 295
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 296
    .line 297
    invoke-virtual {v1}, Landroid/widget/TextView;->getCompoundPaddingRight()I

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    sub-int/2addr p4, v1

    .line 302
    iput p4, v0, Landroid/graphics/Rect;->right:I

    .line 303
    .line 304
    iget p4, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:I

    .line 305
    .line 306
    if-ne p4, v2, :cond_8

    .line 307
    .line 308
    iget-object p4, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 309
    .line 310
    invoke-virtual {p4}, Landroid/widget/TextView;->getMinLines()I

    .line 311
    .line 312
    .line 313
    move-result p4

    .line 314
    if-gt p4, v2, :cond_8

    .line 315
    .line 316
    iget p2, v0, Landroid/graphics/Rect;->top:I

    .line 317
    .line 318
    int-to-float p2, p2

    .line 319
    add-float/2addr p2, p1

    .line 320
    float-to-int p1, p2

    .line 321
    goto :goto_3

    .line 322
    :cond_8
    iget p1, p2, Landroid/graphics/Rect;->bottom:I

    .line 323
    .line 324
    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 325
    .line 326
    invoke-virtual {p2}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    .line 327
    .line 328
    .line 329
    move-result p2

    .line 330
    sub-int/2addr p1, p2

    .line 331
    :goto_3
    iput p1, v0, Landroid/graphics/Rect;->bottom:I

    .line 332
    .line 333
    iget p2, v0, Landroid/graphics/Rect;->left:I

    .line 334
    .line 335
    iget p4, v0, Landroid/graphics/Rect;->top:I

    .line 336
    .line 337
    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 338
    .line 339
    iget-object v1, p3, Ldefpackage/k40;->g:Landroid/graphics/Rect;

    .line 340
    .line 341
    iget v3, v1, Landroid/graphics/Rect;->left:I

    .line 342
    .line 343
    if-ne v3, p2, :cond_9

    .line 344
    .line 345
    iget v3, v1, Landroid/graphics/Rect;->top:I

    .line 346
    .line 347
    if-ne v3, p4, :cond_9

    .line 348
    .line 349
    iget v3, v1, Landroid/graphics/Rect;->right:I

    .line 350
    .line 351
    if-ne v3, v0, :cond_9

    .line 352
    .line 353
    iget v3, v1, Landroid/graphics/Rect;->bottom:I

    .line 354
    .line 355
    if-ne v3, p1, :cond_9

    .line 356
    .line 357
    goto :goto_4

    .line 358
    :cond_9
    invoke-virtual {v1, p2, p4, v0, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 359
    .line 360
    .line 361
    iput-boolean v2, p3, Ldefpackage/k40;->S:Z

    .line 362
    .line 363
    :goto_4
    invoke-virtual {p3, p5}, Ldefpackage/k40;->i(Z)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->e()Z

    .line 367
    .line 368
    .line 369
    move-result p1

    .line 370
    if-eqz p1, :cond_c

    .line 371
    .line 372
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->G0:Z

    .line 373
    .line 374
    if-nez p1, :cond_c

    .line 375
    .line 376
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->j()V

    .line 377
    .line 378
    .line 379
    return-void

    .line 380
    :cond_a
    invoke-static {}, Ldefpackage/tb4;->a()V

    .line 381
    .line 382
    .line 383
    return-void

    .line 384
    :cond_b
    invoke-static {}, Ldefpackage/tb4;->a()V

    .line 385
    .line 386
    .line 387
    :cond_c
    return-void
.end method

.method public final onMeasure(II)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 5
    .line 6
    const/4 p2, 0x1

    .line 7
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-static {p1, v2}, Ljava/lang/Math;->max(II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-ge v2, p1, :cond_1

    .line 34
    .line 35
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 36
    .line 37
    invoke-virtual {v1, p1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 38
    .line 39
    .line 40
    move v1, p2

    .line 41
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->q()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez v1, :cond_2

    .line 46
    .line 47
    if-eqz p1, :cond_3

    .line 48
    .line 49
    :cond_2
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 50
    .line 51
    new-instance v1, Ldefpackage/es4;

    .line 52
    .line 53
    invoke-direct {v1, p0, p2}, Ldefpackage/es4;-><init>(Lcom/google/android/material/textfield/TextInputLayout;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 57
    .line 58
    .line 59
    :cond_3
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:Ldefpackage/mh;

    .line 60
    .line 61
    if-eqz p1, :cond_4

    .line 62
    .line 63
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 64
    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/widget/TextView;->getGravity()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:Ldefpackage/mh;

    .line 72
    .line 73
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 74
    .line 75
    .line 76
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:Ldefpackage/mh;

    .line 77
    .line 78
    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 79
    .line 80
    invoke-virtual {p2}, Landroid/widget/TextView;->getCompoundPaddingLeft()I

    .line 81
    .line 82
    .line 83
    move-result p2

    .line 84
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 85
    .line 86
    invoke-virtual {v1}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 91
    .line 92
    invoke-virtual {v2}, Landroid/widget/TextView;->getCompoundPaddingRight()I

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 97
    .line 98
    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    invoke-virtual {p1, p2, v1, v2, p0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 103
    .line 104
    .line 105
    :cond_4
    invoke-virtual {v0}, Ldefpackage/g11;->l()V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Ldefpackage/hs4;

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
    check-cast p1, Ldefpackage/hs4;

    .line 10
    .line 11
    iget-object v0, p1, Ldefpackage/k;->n:Landroid/os/Parcelable;

    .line 12
    .line 13
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p1, Ldefpackage/hs4;->p:Ljava/lang/CharSequence;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    iget-boolean p1, p1, Ldefpackage/hs4;->q:Z

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    new-instance p1, Ldefpackage/es4;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-direct {p1, p0, v0}, Ldefpackage/es4;-><init>(Lcom/google/android/material/textfield/TextInputLayout;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public final onRtlPropertiesChanged(I)V
    .locals 13

    .line 1
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onRtlPropertiesChanged(I)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->c0:Z

    .line 10
    .line 11
    if-eq v0, p1, :cond_1

    .line 12
    .line 13
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 14
    .line 15
    iget-object p1, p1, Ldefpackage/bc4;->e:Ldefpackage/ke0;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->n0:Landroid/graphics/RectF;

    .line 18
    .line 19
    invoke-interface {p1, v1}, Ldefpackage/ke0;->a(Landroid/graphics/RectF;)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 24
    .line 25
    iget-object v2, v2, Ldefpackage/bc4;->f:Ldefpackage/ke0;

    .line 26
    .line 27
    invoke-interface {v2, v1}, Ldefpackage/ke0;->a(Landroid/graphics/RectF;)F

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 32
    .line 33
    iget-object v3, v3, Ldefpackage/bc4;->h:Ldefpackage/ke0;

    .line 34
    .line 35
    invoke-interface {v3, v1}, Ldefpackage/ke0;->a(Landroid/graphics/RectF;)F

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    iget-object v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 40
    .line 41
    iget-object v4, v4, Ldefpackage/bc4;->g:Ldefpackage/ke0;

    .line 42
    .line 43
    invoke-interface {v4, v1}, Ldefpackage/ke0;->a(Landroid/graphics/RectF;)F

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget-object v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 48
    .line 49
    iget-object v5, v4, Ldefpackage/bc4;->a:Ldefpackage/su3;

    .line 50
    .line 51
    iget-object v6, v4, Ldefpackage/bc4;->b:Ldefpackage/su3;

    .line 52
    .line 53
    iget-object v7, v4, Ldefpackage/bc4;->d:Ldefpackage/su3;

    .line 54
    .line 55
    iget-object v4, v4, Ldefpackage/bc4;->c:Ldefpackage/su3;

    .line 56
    .line 57
    new-instance v8, Ldefpackage/fz0;

    .line 58
    .line 59
    const/4 v9, 0x0

    .line 60
    invoke-direct {v8, v9}, Ldefpackage/fz0;-><init>(I)V

    .line 61
    .line 62
    .line 63
    new-instance v9, Ldefpackage/fz0;

    .line 64
    .line 65
    const/4 v10, 0x0

    .line 66
    invoke-direct {v9, v10}, Ldefpackage/fz0;-><init>(I)V

    .line 67
    .line 68
    .line 69
    new-instance v10, Ldefpackage/fz0;

    .line 70
    .line 71
    const/4 v11, 0x0

    .line 72
    invoke-direct {v10, v11}, Ldefpackage/fz0;-><init>(I)V

    .line 73
    .line 74
    .line 75
    new-instance v11, Ldefpackage/fz0;

    .line 76
    .line 77
    const/4 v12, 0x0

    .line 78
    invoke-direct {v11, v12}, Ldefpackage/fz0;-><init>(I)V

    .line 79
    .line 80
    .line 81
    new-instance v12, Ldefpackage/m;

    .line 82
    .line 83
    invoke-direct {v12, v2}, Ldefpackage/m;-><init>(F)V

    .line 84
    .line 85
    .line 86
    new-instance v2, Ldefpackage/m;

    .line 87
    .line 88
    invoke-direct {v2, p1}, Ldefpackage/m;-><init>(F)V

    .line 89
    .line 90
    .line 91
    new-instance p1, Ldefpackage/m;

    .line 92
    .line 93
    invoke-direct {p1, v1}, Ldefpackage/m;-><init>(F)V

    .line 94
    .line 95
    .line 96
    new-instance v1, Ldefpackage/m;

    .line 97
    .line 98
    invoke-direct {v1, v3}, Ldefpackage/m;-><init>(F)V

    .line 99
    .line 100
    .line 101
    new-instance v3, Ldefpackage/bc4;

    .line 102
    .line 103
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 104
    .line 105
    .line 106
    iput-object v6, v3, Ldefpackage/bc4;->a:Ldefpackage/su3;

    .line 107
    .line 108
    iput-object v5, v3, Ldefpackage/bc4;->b:Ldefpackage/su3;

    .line 109
    .line 110
    iput-object v7, v3, Ldefpackage/bc4;->c:Ldefpackage/su3;

    .line 111
    .line 112
    iput-object v4, v3, Ldefpackage/bc4;->d:Ldefpackage/su3;

    .line 113
    .line 114
    iput-object v12, v3, Ldefpackage/bc4;->e:Ldefpackage/ke0;

    .line 115
    .line 116
    iput-object v2, v3, Ldefpackage/bc4;->f:Ldefpackage/ke0;

    .line 117
    .line 118
    iput-object v1, v3, Ldefpackage/bc4;->g:Ldefpackage/ke0;

    .line 119
    .line 120
    iput-object p1, v3, Ldefpackage/bc4;->h:Ldefpackage/ke0;

    .line 121
    .line 122
    iput-object v8, v3, Ldefpackage/bc4;->i:Ldefpackage/fz0;

    .line 123
    .line 124
    iput-object v9, v3, Ldefpackage/bc4;->j:Ldefpackage/fz0;

    .line 125
    .line 126
    iput-object v10, v3, Ldefpackage/bc4;->k:Ldefpackage/fz0;

    .line 127
    .line 128
    iput-object v11, v3, Ldefpackage/bc4;->l:Ldefpackage/fz0;

    .line 129
    .line 130
    iput-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->c0:Z

    .line 131
    .line 132
    invoke-virtual {p0, v3}, Lcom/google/android/material/textfield/TextInputLayout;->setShapeAppearanceModel(Ldefpackage/bc4;)V

    .line 133
    .line 134
    .line 135
    :cond_1
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
    new-instance v1, Ldefpackage/hs4;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Ldefpackage/k;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->m()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getError()Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, v1, Ldefpackage/hs4;->p:Ljava/lang/CharSequence;

    .line 21
    .line 22
    :cond_0
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 23
    .line 24
    iget v0, p0, Ldefpackage/g11;->v:I

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget-object p0, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 29
    .line 30
    iget-boolean p0, p0, Lcom/google/android/material/internal/CheckableImageButton;->q:Z

    .line 31
    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 p0, 0x0

    .line 37
    :goto_0
    iput-boolean p0, v1, Ldefpackage/hs4;->q:Z

    .line 38
    .line 39
    return-object v1
.end method

.method public final p()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->N:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const v1, 0x7f040111

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Ldefpackage/zz1;->D(Landroid/content/Context;I)Landroid/util/TypedValue;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    :cond_1
    move-object v0, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget v3, v1, Landroid/util/TypedValue;->resourceId:I

    .line 23
    .line 24
    if-eqz v3, :cond_3

    .line 25
    .line 26
    invoke-static {v0, v3}, Ldefpackage/ud3;->n(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    goto :goto_0

    .line 31
    :cond_3
    iget v0, v1, Landroid/util/TypedValue;->data:I

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_0
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 40
    .line 41
    if-eqz v1, :cond_7

    .line 42
    .line 43
    invoke-static {v1}, Ldefpackage/lm4;->e(Landroid/widget/EditText;)Landroid/graphics/drawable/Drawable;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-nez v1, :cond_4

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_4
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 51
    .line 52
    invoke-static {v1}, Ldefpackage/lm4;->e(Landroid/widget/EditText;)Landroid/graphics/drawable/Drawable;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->m()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-nez v2, :cond_5

    .line 61
    .line 62
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 63
    .line 64
    if-eqz v2, :cond_6

    .line 65
    .line 66
    iget-boolean v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Z

    .line 67
    .line 68
    if-eqz v2, :cond_6

    .line 69
    .line 70
    :cond_5
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/content/res/ColorStateList;

    .line 71
    .line 72
    if-eqz p0, :cond_6

    .line 73
    .line 74
    move-object v0, p0

    .line 75
    :cond_6
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 76
    .line 77
    .line 78
    :cond_7
    :goto_1
    return-void
.end method

.method public final q()Z
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getStartIconDrawable()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x2

    .line 13
    const/4 v4, 0x3

    .line 14
    const/4 v5, 0x1

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getPrefixText()Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_4

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getPrefixTextView()Landroid/widget/TextView;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_4

    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    if-lez v6, :cond_4

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 46
    .line 47
    invoke-virtual {v6}, Landroid/view/View;->getPaddingLeft()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    sub-int/2addr v0, v6

    .line 52
    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->p0:Landroid/graphics/drawable/ColorDrawable;

    .line 53
    .line 54
    if-eqz v6, :cond_2

    .line 55
    .line 56
    iget v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->q0:I

    .line 57
    .line 58
    if-eq v6, v0, :cond_3

    .line 59
    .line 60
    :cond_2
    new-instance v6, Landroid/graphics/drawable/ColorDrawable;

    .line 61
    .line 62
    invoke-direct {v6}, Landroid/graphics/drawable/ColorDrawable;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->p0:Landroid/graphics/drawable/ColorDrawable;

    .line 66
    .line 67
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q0:I

    .line 68
    .line 69
    invoke-virtual {v6, v1, v1, v0, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 70
    .line 71
    .line 72
    :cond_3
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    aget-object v6, v0, v1

    .line 79
    .line 80
    iget-object v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->p0:Landroid/graphics/drawable/ColorDrawable;

    .line 81
    .line 82
    if-eq v6, v7, :cond_5

    .line 83
    .line 84
    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 85
    .line 86
    aget-object v8, v0, v5

    .line 87
    .line 88
    aget-object v9, v0, v3

    .line 89
    .line 90
    aget-object v0, v0, v4

    .line 91
    .line 92
    invoke-virtual {v6, v7, v8, v9, v0}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_4
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p0:Landroid/graphics/drawable/ColorDrawable;

    .line 97
    .line 98
    if-eqz v0, :cond_5

    .line 99
    .line 100
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 101
    .line 102
    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 107
    .line 108
    aget-object v7, v0, v5

    .line 109
    .line 110
    aget-object v8, v0, v3

    .line 111
    .line 112
    aget-object v0, v0, v4

    .line 113
    .line 114
    invoke-virtual {v6, v2, v7, v8, v0}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 115
    .line 116
    .line 117
    iput-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->p0:Landroid/graphics/drawable/ColorDrawable;

    .line 118
    .line 119
    :goto_0
    move v0, v5

    .line 120
    goto :goto_1

    .line 121
    :cond_5
    move v0, v1

    .line 122
    :goto_1
    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 123
    .line 124
    invoke-virtual {v6}, Ldefpackage/g11;->d()Z

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    if-nez v7, :cond_7

    .line 129
    .line 130
    iget v7, v6, Ldefpackage/g11;->v:I

    .line 131
    .line 132
    if-eqz v7, :cond_6

    .line 133
    .line 134
    invoke-virtual {v6}, Ldefpackage/g11;->c()Z

    .line 135
    .line 136
    .line 137
    move-result v7

    .line 138
    if-nez v7, :cond_7

    .line 139
    .line 140
    :cond_6
    iget-object v7, v6, Ldefpackage/g11;->C:Ljava/lang/CharSequence;

    .line 141
    .line 142
    if-eqz v7, :cond_d

    .line 143
    .line 144
    :cond_7
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredWidth()I

    .line 145
    .line 146
    .line 147
    move-result v7

    .line 148
    if-lez v7, :cond_d

    .line 149
    .line 150
    iget-object v7, v6, Ldefpackage/g11;->D:Ldefpackage/mh;

    .line 151
    .line 152
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    iget-object v8, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 157
    .line 158
    invoke-virtual {v8}, Landroid/view/View;->getPaddingRight()I

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    sub-int/2addr v7, v8

    .line 163
    invoke-virtual {v6}, Ldefpackage/g11;->d()Z

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    if-eqz v8, :cond_8

    .line 168
    .line 169
    iget-object v2, v6, Ldefpackage/g11;->p:Lcom/google/android/material/internal/CheckableImageButton;

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_8
    iget v8, v6, Ldefpackage/g11;->v:I

    .line 173
    .line 174
    if-eqz v8, :cond_9

    .line 175
    .line 176
    invoke-virtual {v6}, Ldefpackage/g11;->c()Z

    .line 177
    .line 178
    .line 179
    move-result v8

    .line 180
    if-eqz v8, :cond_9

    .line 181
    .line 182
    iget-object v2, v6, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 183
    .line 184
    :cond_9
    :goto_2
    if-eqz v2, :cond_a

    .line 185
    .line 186
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    add-int/2addr v6, v7

    .line 191
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 196
    .line 197
    invoke-virtual {v2}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    add-int v7, v2, v6

    .line 202
    .line 203
    :cond_a
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 204
    .line 205
    invoke-virtual {v2}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->s0:Landroid/graphics/drawable/ColorDrawable;

    .line 210
    .line 211
    if-eqz v6, :cond_b

    .line 212
    .line 213
    iget v8, p0, Lcom/google/android/material/textfield/TextInputLayout;->t0:I

    .line 214
    .line 215
    if-eq v8, v7, :cond_b

    .line 216
    .line 217
    iput v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->t0:I

    .line 218
    .line 219
    invoke-virtual {v6, v1, v1, v7, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 220
    .line 221
    .line 222
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 223
    .line 224
    aget-object v1, v2, v1

    .line 225
    .line 226
    aget-object v3, v2, v5

    .line 227
    .line 228
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->s0:Landroid/graphics/drawable/ColorDrawable;

    .line 229
    .line 230
    aget-object v2, v2, v4

    .line 231
    .line 232
    invoke-virtual {v0, v1, v3, p0, v2}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 233
    .line 234
    .line 235
    return v5

    .line 236
    :cond_b
    if-nez v6, :cond_c

    .line 237
    .line 238
    new-instance v6, Landroid/graphics/drawable/ColorDrawable;

    .line 239
    .line 240
    invoke-direct {v6}, Landroid/graphics/drawable/ColorDrawable;-><init>()V

    .line 241
    .line 242
    .line 243
    iput-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->s0:Landroid/graphics/drawable/ColorDrawable;

    .line 244
    .line 245
    iput v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->t0:I

    .line 246
    .line 247
    invoke-virtual {v6, v1, v1, v7, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 248
    .line 249
    .line 250
    :cond_c
    aget-object v3, v2, v3

    .line 251
    .line 252
    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->s0:Landroid/graphics/drawable/ColorDrawable;

    .line 253
    .line 254
    if-eq v3, v6, :cond_f

    .line 255
    .line 256
    iput-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->u0:Landroid/graphics/drawable/Drawable;

    .line 257
    .line 258
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 259
    .line 260
    aget-object v0, v2, v1

    .line 261
    .line 262
    aget-object v1, v2, v5

    .line 263
    .line 264
    aget-object v2, v2, v4

    .line 265
    .line 266
    invoke-virtual {p0, v0, v1, v6, v2}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 267
    .line 268
    .line 269
    return v5

    .line 270
    :cond_d
    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->s0:Landroid/graphics/drawable/ColorDrawable;

    .line 271
    .line 272
    if-eqz v6, :cond_f

    .line 273
    .line 274
    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 275
    .line 276
    invoke-virtual {v6}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    .line 277
    .line 278
    .line 279
    move-result-object v6

    .line 280
    aget-object v3, v6, v3

    .line 281
    .line 282
    iget-object v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->s0:Landroid/graphics/drawable/ColorDrawable;

    .line 283
    .line 284
    if-ne v3, v7, :cond_e

    .line 285
    .line 286
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 287
    .line 288
    aget-object v1, v6, v1

    .line 289
    .line 290
    aget-object v3, v6, v5

    .line 291
    .line 292
    iget-object v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->u0:Landroid/graphics/drawable/Drawable;

    .line 293
    .line 294
    aget-object v4, v6, v4

    .line 295
    .line 296
    invoke-virtual {v0, v1, v3, v7, v4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 297
    .line 298
    .line 299
    goto :goto_3

    .line 300
    :cond_e
    move v5, v0

    .line 301
    :goto_3
    iput-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->s0:Landroid/graphics/drawable/ColorDrawable;

    .line 302
    .line 303
    return v5

    .line 304
    :cond_f
    return v0
.end method

.method public final r()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    iget v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:I

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    sget-object v1, Ldefpackage/aw0;->a:[I

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->m()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getErrorCurrentTextColors()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 34
    .line 35
    invoke-static {p0, v1}, Ldefpackage/fg;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    iget-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Z

    .line 44
    .line 45
    if-eqz v1, :cond_3

    .line 46
    .line 47
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 48
    .line 49
    if-eqz v1, :cond_3

    .line 50
    .line 51
    invoke-virtual {v1}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 56
    .line 57
    invoke-static {p0, v1}, Ldefpackage/fg;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_3
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->clearColorFilter()V

    .line 66
    .line 67
    .line 68
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 71
    .line 72
    .line 73
    :cond_4
    :goto_0
    return-void
.end method

.method public final s()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ldefpackage/fi2;

    .line 6
    .line 7
    if-eqz v1, :cond_2

    .line 8
    .line 9
    iget-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->V:Z

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    :cond_0
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:I

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 25
    .line 26
    invoke-direct {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditTextBoxBackground()Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    sget-object v2, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    iput-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->V:Z

    .line 37
    .line 38
    :cond_2
    :goto_0
    return-void
.end method

.method public setBoxBackgroundColor(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->k0:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->k0:I

    .line 6
    .line 7
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->B0:I

    .line 8
    .line 9
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->D0:I

    .line 10
    .line 11
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->E0:I

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->b()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setBoxBackgroundColorResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Landroid/content/Context;->getColor(I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxBackgroundColor(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setBoxBackgroundColorStateList(Landroid/content/res/ColorStateList;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->B0:I

    .line 6
    .line 7
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->k0:I

    .line 8
    .line 9
    const v0, -0x101009e

    .line 10
    .line 11
    .line 12
    filled-new-array {v0}, [I

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, -0x1

    .line 17
    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->C0:I

    .line 22
    .line 23
    const v0, 0x101009c

    .line 24
    .line 25
    .line 26
    const v2, 0x101009e

    .line 27
    .line 28
    .line 29
    filled-new-array {v0, v2}, [I

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->D0:I

    .line 38
    .line 39
    const v0, 0x1010367

    .line 40
    .line 41
    .line 42
    filled-new-array {v0, v2}, [I

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->E0:I

    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->b()V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public setBoxBackgroundMode(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:I

    .line 7
    .line 8
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->i()V

    .line 13
    .line 14
    .line 15
    :cond_1
    :goto_0
    return-void
.end method

.method public setBoxCollapsedPaddingTop(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->f0:I

    .line 2
    .line 3
    return-void
.end method

.method public setBoxCornerFamily(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/bc4;->g()Ldefpackage/zc1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 8
    .line 9
    iget-object v1, v1, Ldefpackage/bc4;->e:Ldefpackage/ke0;

    .line 10
    .line 11
    invoke-static {p1}, Ldefpackage/ji2;->v(I)Ldefpackage/su3;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iput-object v2, v0, Ldefpackage/zc1;->a:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object v1, v0, Ldefpackage/zc1;->e:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 20
    .line 21
    iget-object v1, v1, Ldefpackage/bc4;->f:Ldefpackage/ke0;

    .line 22
    .line 23
    invoke-static {p1}, Ldefpackage/ji2;->v(I)Ldefpackage/su3;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iput-object v2, v0, Ldefpackage/zc1;->b:Ljava/lang/Object;

    .line 28
    .line 29
    iput-object v1, v0, Ldefpackage/zc1;->f:Ljava/lang/Object;

    .line 30
    .line 31
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 32
    .line 33
    iget-object v1, v1, Ldefpackage/bc4;->h:Ldefpackage/ke0;

    .line 34
    .line 35
    invoke-static {p1}, Ldefpackage/ji2;->v(I)Ldefpackage/su3;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iput-object v2, v0, Ldefpackage/zc1;->d:Ljava/lang/Object;

    .line 40
    .line 41
    iput-object v1, v0, Ldefpackage/zc1;->h:Ljava/lang/Object;

    .line 42
    .line 43
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 44
    .line 45
    iget-object v1, v1, Ldefpackage/bc4;->g:Ldefpackage/ke0;

    .line 46
    .line 47
    invoke-static {p1}, Ldefpackage/ji2;->v(I)Ldefpackage/su3;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    iput-object p1, v0, Ldefpackage/zc1;->c:Ljava/lang/Object;

    .line 52
    .line 53
    iput-object v1, v0, Ldefpackage/zc1;->g:Ljava/lang/Object;

    .line 54
    .line 55
    invoke-virtual {v0}, Ldefpackage/zc1;->a()Ldefpackage/bc4;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->b()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public setBoxStrokeColor(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z0:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z0:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->x()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setBoxStrokeColorStateList(Landroid/content/res/ColorStateList;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->isStateful()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x0:I

    .line 12
    .line 13
    const v0, -0x101009e

    .line 14
    .line 15
    .line 16
    filled-new-array {v0}, [I

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, -0x1

    .line 21
    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->F0:I

    .line 26
    .line 27
    const v0, 0x1010367

    .line 28
    .line 29
    .line 30
    const v2, 0x101009e

    .line 31
    .line 32
    .line 33
    filled-new-array {v0, v2}, [I

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y0:I

    .line 42
    .line 43
    const v0, 0x101009c

    .line 44
    .line 45
    .line 46
    filled-new-array {v0, v2}, [I

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z0:I

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z0:I

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eq v0, v1, :cond_1

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z0:I

    .line 70
    .line 71
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->x()V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public setBoxStrokeErrorColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->A0:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->x()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setBoxStrokeWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->h0:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->x()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setBoxStrokeWidthFocused(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->x()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setBoxStrokeWidthFocusedResource(I)V
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
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxStrokeWidthFocused(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setBoxStrokeWidthResource(I)V
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
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setBoxStrokeWidth(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setCounterEnabled(Z)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_4

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Ldefpackage/cy1;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz p1, :cond_2

    .line 10
    .line 11
    new-instance v3, Ldefpackage/mh;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-direct {v3, v4, v2}, Ldefpackage/mh;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 18
    .line 19
    .line 20
    iput-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 21
    .line 22
    const v4, 0x7f0a0602

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, v4}, Landroid/view/View;->setId(I)V

    .line 26
    .line 27
    .line 28
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Landroid/graphics/Typeface;

    .line 29
    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    iget-object v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 33
    .line 34
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 41
    .line 42
    .line 43
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 44
    .line 45
    invoke-virtual {v1, v3, v0}, Ldefpackage/cy1;->a(Ldefpackage/mh;I)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    const v3, 0x7f0705d3

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->o()V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 74
    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 78
    .line 79
    if-nez v0, :cond_1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    :goto_0
    invoke-virtual {p0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->n(Landroid/text/Editable;)V

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 91
    .line 92
    invoke-virtual {v1, v3, v0}, Ldefpackage/cy1;->g(Ldefpackage/mh;I)V

    .line 93
    .line 94
    .line 95
    iput-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 96
    .line 97
    :cond_3
    :goto_1
    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Z

    .line 98
    .line 99
    :cond_4
    return-void
.end method

.method public setCounterMaxLength(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    if-lez p1, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:I

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, -0x1

    .line 11
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->y:I

    .line 12
    .line 13
    :goto_0
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->x:Z

    .line 14
    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :goto_1
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->n(Landroid/text/Editable;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    return-void
.end method

.method public setCounterOverflowTextAppearance(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->C:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->C:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->o()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setCounterOverflowTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->M:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->M:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->o()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setCounterTextAppearance(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->D:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->D:I

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->o()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setCounterTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->L:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->L:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->o()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setCursorColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->N:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->N:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->p()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setCursorErrorColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->O:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->m()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Z

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void

    .line 23
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->p()V

    .line 24
    .line 25
    .line 26
    :cond_2
    return-void
.end method

.method public setDefaultHintTextColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->v0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->w0:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-virtual {p0, p1, p1}, Lcom/google/android/material/textfield/TextInputLayout;->u(ZZ)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public setEnabled(Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->k(Landroid/view/ViewGroup;Z)V

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setEndIconActivated(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/view/View;->setActivated(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setEndIconCheckable(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/google/android/material/internal/CheckableImageButton;->setCheckable(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setEndIconContentDescription(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    iget-object p0, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eq v0, p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public setEndIconContentDescription(Ljava/lang/CharSequence;)V
    .locals 1

    .line 27
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 28
    iget-object p0, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    if-eq v0, p1, :cond_0

    .line 30
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public setEndIconDrawable(I)V
    .locals 3

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0, p1}, Ldefpackage/zz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    iget-object v0, p0, Ldefpackage/g11;->n:Lcom/google/android/material/textfield/TextInputLayout;

    .line 16
    .line 17
    iget-object v1, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 20
    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, Ldefpackage/g11;->x:Landroid/content/res/ColorStateList;

    .line 25
    .line 26
    iget-object v2, p0, Ldefpackage/g11;->y:Landroid/graphics/PorterDuff$Mode;

    .line 27
    .line 28
    invoke-static {v0, v1, p1, v2}, Ldefpackage/au0;->b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Ldefpackage/g11;->x:Landroid/content/res/ColorStateList;

    .line 32
    .line 33
    invoke-static {v0, v1, p0}, Ldefpackage/au0;->Q(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public setEndIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 37
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    iget-object v0, p0, Ldefpackage/g11;->n:Lcom/google/android/material/textfield/TextInputLayout;

    .line 38
    iget-object v1, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    invoke-virtual {v1, p1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz p1, :cond_0

    .line 39
    iget-object p1, p0, Ldefpackage/g11;->x:Landroid/content/res/ColorStateList;

    iget-object v2, p0, Ldefpackage/g11;->y:Landroid/graphics/PorterDuff$Mode;

    invoke-static {v0, v1, p1, v2}, Ldefpackage/au0;->b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 40
    iget-object p0, p0, Ldefpackage/g11;->x:Landroid/content/res/ColorStateList;

    invoke-static {v0, v1, p0}, Ldefpackage/au0;->Q(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    :cond_0
    return-void
.end method

.method public setEndIconMinSize(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    if-ltz p1, :cond_1

    .line 4
    .line 5
    iget v0, p0, Ldefpackage/g11;->z:I

    .line 6
    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    iput p1, p0, Ldefpackage/g11;->z:I

    .line 10
    .line 11
    iget-object v0, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/view/View;->setMinimumWidth(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Ldefpackage/g11;->p:Lcom/google/android/material/internal/CheckableImageButton;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Landroid/view/View;->setMinimumWidth(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void

    .line 28
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const-string p0, "endIconSize cannot be less than 0"

    .line 32
    .line 33
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public setEndIconMode(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldefpackage/g11;->f(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setEndIconOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/g11;->B:Landroid/view/View$OnLongClickListener;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p0}, Ldefpackage/au0;->R(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setEndIconOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/g11;->B:Landroid/view/View$OnLongClickListener;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1}, Ldefpackage/au0;->R(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setEndIconScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/g11;->A:Landroid/widget/ImageView$ScaleType;

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/g11;->p:Lcom/google/android/material/internal/CheckableImageButton;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setEndIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/g11;->x:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/g11;->x:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/g11;->n:Lcom/google/android/material/textfield/TextInputLayout;

    .line 10
    .line 11
    iget-object v1, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/g11;->y:Landroid/graphics/PorterDuff$Mode;

    .line 14
    .line 15
    invoke-static {v0, v1, p1, p0}, Ldefpackage/au0;->b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setEndIconTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/g11;->y:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/g11;->y:Landroid/graphics/PorterDuff$Mode;

    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/g11;->n:Lcom/google/android/material/textfield/TextInputLayout;

    .line 10
    .line 11
    iget-object v1, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/g11;->x:Landroid/content/res/ColorStateList;

    .line 14
    .line 15
    invoke-static {v0, v1, p0, p1}, Ldefpackage/au0;->b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setEndIconVisible(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldefpackage/g11;->g(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setError(Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Ldefpackage/cy1;

    .line 2
    .line 3
    iget-boolean v1, v0, Ldefpackage/cy1;->q:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p0, v2}, Lcom/google/android/material/textfield/TextInputLayout;->setErrorEnabled(Z)V

    .line 16
    .line 17
    .line 18
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-nez p0, :cond_3

    .line 23
    .line 24
    invoke-virtual {v0}, Ldefpackage/cy1;->c()V

    .line 25
    .line 26
    .line 27
    iput-object p1, v0, Ldefpackage/cy1;->p:Ljava/lang/CharSequence;

    .line 28
    .line 29
    iget-object p0, v0, Ldefpackage/cy1;->r:Ldefpackage/mh;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    iget p0, v0, Ldefpackage/cy1;->n:I

    .line 35
    .line 36
    if-eq p0, v2, :cond_2

    .line 37
    .line 38
    iput v2, v0, Ldefpackage/cy1;->o:I

    .line 39
    .line 40
    :cond_2
    iget v1, v0, Ldefpackage/cy1;->o:I

    .line 41
    .line 42
    iget-object v2, v0, Ldefpackage/cy1;->r:Ldefpackage/mh;

    .line 43
    .line 44
    invoke-virtual {v0, v2, p1}, Ldefpackage/cy1;->h(Ldefpackage/mh;Ljava/lang/CharSequence;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    invoke-virtual {v0, p0, v1, p1}, Ldefpackage/cy1;->i(IIZ)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_3
    invoke-virtual {v0}, Ldefpackage/cy1;->f()V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public setErrorAccessibilityLiveRegion(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Ldefpackage/cy1;

    .line 2
    .line 3
    iput p1, p0, Ldefpackage/cy1;->t:I

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/cy1;->r:Ldefpackage/mh;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    sget-object v0, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/view/View;->setAccessibilityLiveRegion(I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setErrorContentDescription(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Ldefpackage/cy1;

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/cy1;->s:Ljava/lang/CharSequence;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/cy1;->r:Ldefpackage/mh;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setErrorEnabled(Z)V
    .locals 4

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Ldefpackage/cy1;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/cy1;->h:Lcom/google/android/material/textfield/TextInputLayout;

    .line 4
    .line 5
    iget-boolean v1, p0, Ldefpackage/cy1;->q:Z

    .line 6
    .line 7
    if-ne v1, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0}, Ldefpackage/cy1;->c()V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz p1, :cond_6

    .line 16
    .line 17
    new-instance v0, Ldefpackage/mh;

    .line 18
    .line 19
    iget-object v3, p0, Ldefpackage/cy1;->g:Landroid/content/Context;

    .line 20
    .line 21
    invoke-direct {v0, v3, v2}, Ldefpackage/mh;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Ldefpackage/cy1;->r:Ldefpackage/mh;

    .line 25
    .line 26
    const v2, 0x7f0a0603

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v2}, Landroid/view/View;->setId(I)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Ldefpackage/cy1;->r:Ldefpackage/mh;

    .line 33
    .line 34
    const/4 v2, 0x5

    .line 35
    invoke-virtual {v0, v2}, Landroid/view/View;->setTextAlignment(I)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Ldefpackage/cy1;->B:Landroid/graphics/Typeface;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    iget-object v2, p0, Ldefpackage/cy1;->r:Ldefpackage/mh;

    .line 43
    .line 44
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    iget v0, p0, Ldefpackage/cy1;->u:I

    .line 48
    .line 49
    iput v0, p0, Ldefpackage/cy1;->u:I

    .line 50
    .line 51
    iget-object v2, p0, Ldefpackage/cy1;->r:Ldefpackage/mh;

    .line 52
    .line 53
    if-eqz v2, :cond_2

    .line 54
    .line 55
    iget-object v3, p0, Ldefpackage/cy1;->h:Lcom/google/android/material/textfield/TextInputLayout;

    .line 56
    .line 57
    invoke-virtual {v3, v2, v0}, Lcom/google/android/material/textfield/TextInputLayout;->l(Ldefpackage/mh;I)V

    .line 58
    .line 59
    .line 60
    :cond_2
    iget-object v0, p0, Ldefpackage/cy1;->v:Landroid/content/res/ColorStateList;

    .line 61
    .line 62
    iput-object v0, p0, Ldefpackage/cy1;->v:Landroid/content/res/ColorStateList;

    .line 63
    .line 64
    iget-object v2, p0, Ldefpackage/cy1;->r:Ldefpackage/mh;

    .line 65
    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 71
    .line 72
    .line 73
    :cond_3
    iget-object v0, p0, Ldefpackage/cy1;->s:Ljava/lang/CharSequence;

    .line 74
    .line 75
    iput-object v0, p0, Ldefpackage/cy1;->s:Ljava/lang/CharSequence;

    .line 76
    .line 77
    iget-object v2, p0, Ldefpackage/cy1;->r:Ldefpackage/mh;

    .line 78
    .line 79
    if-eqz v2, :cond_4

    .line 80
    .line 81
    invoke-virtual {v2, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    iget v0, p0, Ldefpackage/cy1;->t:I

    .line 85
    .line 86
    iput v0, p0, Ldefpackage/cy1;->t:I

    .line 87
    .line 88
    iget-object v2, p0, Ldefpackage/cy1;->r:Ldefpackage/mh;

    .line 89
    .line 90
    if-eqz v2, :cond_5

    .line 91
    .line 92
    sget-object v3, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 93
    .line 94
    invoke-virtual {v2, v0}, Landroid/view/View;->setAccessibilityLiveRegion(I)V

    .line 95
    .line 96
    .line 97
    :cond_5
    iget-object v0, p0, Ldefpackage/cy1;->r:Ldefpackage/mh;

    .line 98
    .line 99
    const/4 v2, 0x4

    .line 100
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, Ldefpackage/cy1;->r:Ldefpackage/mh;

    .line 104
    .line 105
    invoke-virtual {p0, v0, v1}, Ldefpackage/cy1;->a(Ldefpackage/mh;I)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_6
    invoke-virtual {p0}, Ldefpackage/cy1;->f()V

    .line 110
    .line 111
    .line 112
    iget-object v3, p0, Ldefpackage/cy1;->r:Ldefpackage/mh;

    .line 113
    .line 114
    invoke-virtual {p0, v3, v1}, Ldefpackage/cy1;->g(Ldefpackage/mh;I)V

    .line 115
    .line 116
    .line 117
    iput-object v2, p0, Ldefpackage/cy1;->r:Ldefpackage/mh;

    .line 118
    .line 119
    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->r()V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->x()V

    .line 123
    .line 124
    .line 125
    :goto_0
    iput-boolean p1, p0, Ldefpackage/cy1;->q:Z

    .line 126
    .line 127
    return-void
.end method

.method public setErrorIconDrawable(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0, p1}, Ldefpackage/zz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    invoke-virtual {p0, p1}, Ldefpackage/g11;->h(Landroid/graphics/drawable/Drawable;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Ldefpackage/g11;->n:Lcom/google/android/material/textfield/TextInputLayout;

    .line 19
    .line 20
    iget-object v0, p0, Ldefpackage/g11;->p:Lcom/google/android/material/internal/CheckableImageButton;

    .line 21
    .line 22
    iget-object p0, p0, Ldefpackage/g11;->q:Landroid/content/res/ColorStateList;

    .line 23
    .line 24
    invoke-static {p1, v0, p0}, Ldefpackage/au0;->Q(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public setErrorIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 28
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    invoke-virtual {p0, p1}, Ldefpackage/g11;->h(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setErrorIconOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/g11;->p:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/g11;->s:Landroid/view/View$OnLongClickListener;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p0}, Ldefpackage/au0;->R(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setErrorIconOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/g11;->s:Landroid/view/View$OnLongClickListener;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/g11;->p:Lcom/google/android/material/internal/CheckableImageButton;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1}, Ldefpackage/au0;->R(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setErrorIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/g11;->q:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/g11;->q:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/g11;->n:Lcom/google/android/material/textfield/TextInputLayout;

    .line 10
    .line 11
    iget-object v1, p0, Ldefpackage/g11;->p:Lcom/google/android/material/internal/CheckableImageButton;

    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/g11;->r:Landroid/graphics/PorterDuff$Mode;

    .line 14
    .line 15
    invoke-static {v0, v1, p1, p0}, Ldefpackage/au0;->b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setErrorIconTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/g11;->r:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/g11;->r:Landroid/graphics/PorterDuff$Mode;

    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/g11;->n:Lcom/google/android/material/textfield/TextInputLayout;

    .line 10
    .line 11
    iget-object v1, p0, Ldefpackage/g11;->p:Lcom/google/android/material/internal/CheckableImageButton;

    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/g11;->q:Landroid/content/res/ColorStateList;

    .line 14
    .line 15
    invoke-static {v0, v1, p0, p1}, Ldefpackage/au0;->b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setErrorTextAppearance(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Ldefpackage/cy1;

    .line 2
    .line 3
    iput p1, p0, Ldefpackage/cy1;->u:I

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/cy1;->r:Ldefpackage/mh;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/cy1;->h:Lcom/google/android/material/textfield/TextInputLayout;

    .line 10
    .line 11
    invoke-virtual {p0, v0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->l(Ldefpackage/mh;I)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setErrorTextColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Ldefpackage/cy1;

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/cy1;->v:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/cy1;->r:Ldefpackage/mh;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setExpandedHintEnabled(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->I0:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->I0:Z

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-virtual {p0, p1, p1}, Lcom/google/android/material/textfield/TextInputLayout;->u(ZZ)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setHelperText(Ljava/lang/CharSequence;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Ldefpackage/cy1;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-boolean p1, v1, Ldefpackage/cy1;->x:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setHelperTextEnabled(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :cond_1
    iget-boolean v0, v1, Ldefpackage/cy1;->x:Z

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHelperTextEnabled(Z)V

    .line 24
    .line 25
    .line 26
    :cond_2
    invoke-virtual {v1}, Ldefpackage/cy1;->c()V

    .line 27
    .line 28
    .line 29
    iput-object p1, v1, Ldefpackage/cy1;->w:Ljava/lang/CharSequence;

    .line 30
    .line 31
    iget-object p0, v1, Ldefpackage/cy1;->y:Ldefpackage/mh;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    iget p0, v1, Ldefpackage/cy1;->n:I

    .line 37
    .line 38
    const/4 v0, 0x2

    .line 39
    if-eq p0, v0, :cond_3

    .line 40
    .line 41
    iput v0, v1, Ldefpackage/cy1;->o:I

    .line 42
    .line 43
    :cond_3
    iget v0, v1, Ldefpackage/cy1;->o:I

    .line 44
    .line 45
    iget-object v2, v1, Ldefpackage/cy1;->y:Ldefpackage/mh;

    .line 46
    .line 47
    invoke-virtual {v1, v2, p1}, Ldefpackage/cy1;->h(Ldefpackage/mh;Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-virtual {v1, p0, v0, p1}, Ldefpackage/cy1;->i(IIZ)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public setHelperTextColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Ldefpackage/cy1;

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/cy1;->A:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/cy1;->y:Ldefpackage/mh;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setHelperTextEnabled(Z)V
    .locals 7

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Ldefpackage/cy1;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/cy1;->h:Lcom/google/android/material/textfield/TextInputLayout;

    .line 4
    .line 5
    iget-boolean v1, p0, Ldefpackage/cy1;->x:Z

    .line 6
    .line 7
    if-ne v1, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0}, Ldefpackage/cy1;->c()V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-eqz p1, :cond_4

    .line 16
    .line 17
    new-instance v0, Ldefpackage/mh;

    .line 18
    .line 19
    iget-object v3, p0, Ldefpackage/cy1;->g:Landroid/content/Context;

    .line 20
    .line 21
    invoke-direct {v0, v3, v1}, Ldefpackage/mh;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Ldefpackage/cy1;->y:Ldefpackage/mh;

    .line 25
    .line 26
    const v1, 0x7f0a0604

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Ldefpackage/cy1;->y:Ldefpackage/mh;

    .line 33
    .line 34
    const/4 v1, 0x5

    .line 35
    invoke-virtual {v0, v1}, Landroid/view/View;->setTextAlignment(I)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Ldefpackage/cy1;->B:Landroid/graphics/Typeface;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    iget-object v1, p0, Ldefpackage/cy1;->y:Ldefpackage/mh;

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    iget-object v0, p0, Ldefpackage/cy1;->y:Ldefpackage/mh;

    .line 48
    .line 49
    const/4 v1, 0x4

    .line 50
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, Ldefpackage/cy1;->y:Ldefpackage/mh;

    .line 54
    .line 55
    invoke-virtual {v0, v2}, Landroid/view/View;->setAccessibilityLiveRegion(I)V

    .line 56
    .line 57
    .line 58
    iget v0, p0, Ldefpackage/cy1;->z:I

    .line 59
    .line 60
    iput v0, p0, Ldefpackage/cy1;->z:I

    .line 61
    .line 62
    iget-object v1, p0, Ldefpackage/cy1;->y:Ldefpackage/mh;

    .line 63
    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 67
    .line 68
    .line 69
    :cond_2
    iget-object v0, p0, Ldefpackage/cy1;->A:Landroid/content/res/ColorStateList;

    .line 70
    .line 71
    iput-object v0, p0, Ldefpackage/cy1;->A:Landroid/content/res/ColorStateList;

    .line 72
    .line 73
    iget-object v1, p0, Ldefpackage/cy1;->y:Ldefpackage/mh;

    .line 74
    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    iget-object v0, p0, Ldefpackage/cy1;->y:Ldefpackage/mh;

    .line 83
    .line 84
    invoke-virtual {p0, v0, v2}, Ldefpackage/cy1;->a(Ldefpackage/mh;I)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Ldefpackage/cy1;->y:Ldefpackage/mh;

    .line 88
    .line 89
    new-instance v1, Ldefpackage/by1;

    .line 90
    .line 91
    invoke-direct {v1, p0}, Ldefpackage/by1;-><init>(Ldefpackage/cy1;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1}, Landroid/view/View;->setAccessibilityDelegate(Landroid/view/View$AccessibilityDelegate;)V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_4
    invoke-virtual {p0}, Ldefpackage/cy1;->c()V

    .line 99
    .line 100
    .line 101
    iget v3, p0, Ldefpackage/cy1;->n:I

    .line 102
    .line 103
    const/4 v4, 0x2

    .line 104
    if-ne v3, v4, :cond_5

    .line 105
    .line 106
    const/4 v4, 0x0

    .line 107
    iput v4, p0, Ldefpackage/cy1;->o:I

    .line 108
    .line 109
    :cond_5
    iget v4, p0, Ldefpackage/cy1;->o:I

    .line 110
    .line 111
    iget-object v5, p0, Ldefpackage/cy1;->y:Ldefpackage/mh;

    .line 112
    .line 113
    const-string v6, ""

    .line 114
    .line 115
    invoke-virtual {p0, v5, v6}, Ldefpackage/cy1;->h(Ldefpackage/mh;Ljava/lang/CharSequence;)Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    invoke-virtual {p0, v3, v4, v5}, Ldefpackage/cy1;->i(IIZ)V

    .line 120
    .line 121
    .line 122
    iget-object v3, p0, Ldefpackage/cy1;->y:Ldefpackage/mh;

    .line 123
    .line 124
    invoke-virtual {p0, v3, v2}, Ldefpackage/cy1;->g(Ldefpackage/mh;I)V

    .line 125
    .line 126
    .line 127
    iput-object v1, p0, Ldefpackage/cy1;->y:Ldefpackage/mh;

    .line 128
    .line 129
    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->r()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->x()V

    .line 133
    .line 134
    .line 135
    :goto_0
    iput-boolean p1, p0, Ldefpackage/cy1;->x:Z

    .line 136
    .line 137
    return-void
.end method

.method public setHelperTextTextAppearance(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Ldefpackage/cy1;

    .line 2
    .line 3
    iput p1, p0, Ldefpackage/cy1;->z:I

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/cy1;->y:Ldefpackage/mh;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setHint(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setHint(Ljava/lang/CharSequence;)V
    .locals 1

    .line 17
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->P:Z

    if-eqz v0, :cond_0

    .line 18
    invoke-direct {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setHintInternal(Ljava/lang/CharSequence;)V

    const/16 p1, 0x800

    .line 19
    invoke-virtual {p0, p1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    :cond_0
    return-void
.end method

.method public setHintAnimationEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Z

    .line 2
    .line 3
    return-void
.end method

.method public setHintEnabled(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->P:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_4

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->P:Z

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->R:Z

    .line 12
    .line 13
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->Q:Ljava/lang/CharSequence;

    .line 14
    .line 15
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 34
    .line 35
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->Q:Ljava/lang/CharSequence;

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    :cond_0
    invoke-direct {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setHintInternal(Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_3

    .line 55
    .line 56
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->Q:Ljava/lang/CharSequence;

    .line 57
    .line 58
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_2

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setHint(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 70
    .line 71
    .line 72
    :cond_3
    const/4 p1, 0x1

    .line 73
    iput-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->R:Z

    .line 74
    .line 75
    :goto_0
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 76
    .line 77
    if-eqz p1, :cond_4

    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->t()V

    .line 80
    .line 81
    .line 82
    :cond_4
    return-void
.end method

.method public setHintTextAppearance(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->H0:Ldefpackage/k40;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ldefpackage/k40;->k(I)V

    .line 4
    .line 5
    .line 6
    iget-object p1, v0, Ldefpackage/k40;->o:Landroid/content/res/ColorStateList;

    .line 7
    .line 8
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->w0:Landroid/content/res/ColorStateList;

    .line 9
    .line 10
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-virtual {p0, p1, p1}, Lcom/google/android/material/textfield/TextInputLayout;->u(ZZ)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->t()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public setHintTextColor(Landroid/content/res/ColorStateList;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->v0:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->H0:Ldefpackage/k40;

    .line 11
    .line 12
    iget-object v2, v0, Ldefpackage/k40;->o:Landroid/content/res/ColorStateList;

    .line 13
    .line 14
    if-eq v2, p1, :cond_0

    .line 15
    .line 16
    iput-object p1, v0, Ldefpackage/k40;->o:Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ldefpackage/k40;->i(Z)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->w0:Landroid/content/res/ColorStateList;

    .line 22
    .line 23
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 24
    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, v1, v1}, Lcom/google/android/material/textfield/TextInputLayout;->u(ZZ)V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public setLengthCounter(Ldefpackage/gs4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Ldefpackage/gs4;

    .line 2
    .line 3
    return-void
.end method

.method public setMaxEms(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->t:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMaxEms(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public setMaxWidth(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->v:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMaxWidth(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public setMaxWidthResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setMaxWidth(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setMinEms(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->s:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMinEms(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public setMinWidth(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->u:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    if-eq p1, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMinWidth(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public setMinWidthResource(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setMinWidth(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setPasswordVisibilityToggleContentDescription(I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    iget-object p0, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public setPasswordVisibilityToggleContentDescription(Ljava/lang/CharSequence;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 21
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 22
    iget-object p0, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 23
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setPasswordVisibilityToggleDrawable(I)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0, p1}, Ldefpackage/zz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    iget-object p0, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public setPasswordVisibilityToggleDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 21
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 22
    iget-object p0, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 23
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setPasswordVisibilityToggleEnabled(Z)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget v0, p0, Ldefpackage/g11;->v:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ldefpackage/g11;->f(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    if-nez p1, :cond_1

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-virtual {p0, p1}, Ldefpackage/g11;->f(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setPasswordVisibilityToggleTintList(Landroid/content/res/ColorStateList;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/g11;->x:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/g11;->n:Lcom/google/android/material/textfield/TextInputLayout;

    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/g11;->y:Landroid/graphics/PorterDuff$Mode;

    .line 10
    .line 11
    invoke-static {v0, v1, p1, p0}, Ldefpackage/au0;->b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setPasswordVisibilityToggleTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/g11;->y:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/g11;->n:Lcom/google/android/material/textfield/TextInputLayout;

    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/g11;->x:Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    invoke-static {v0, v1, p0, p1}, Ldefpackage/au0;->b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public setPlaceholderText(Ljava/lang/CharSequence;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:Ldefpackage/mh;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Ldefpackage/mh;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-direct {v0, v2, v1}, Ldefpackage/mh;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:Ldefpackage/mh;

    .line 16
    .line 17
    const v2, 0x7f0a0605

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, Landroid/view/View;->setId(I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:Ldefpackage/mh;

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-virtual {v0, v2}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->d()Ldefpackage/u51;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Ldefpackage/u51;

    .line 34
    .line 35
    const-wide/16 v2, 0x43

    .line 36
    .line 37
    iput-wide v2, v0, Ldefpackage/dx4;->o:J

    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->d()Ldefpackage/u51;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iput-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Ldefpackage/u51;

    .line 44
    .line 45
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->I:I

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextAppearance(I)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->H:Landroid/content/res/ColorStateList;

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextColor(Landroid/content/res/ColorStateList;)V

    .line 53
    .line 54
    .line 55
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    const/4 p1, 0x0

    .line 62
    invoke-direct {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextEnabled(Z)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Z

    .line 67
    .line 68
    if-nez v0, :cond_2

    .line 69
    .line 70
    const/4 v0, 0x1

    .line 71
    invoke-direct {p0, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setPlaceholderTextEnabled(Z)V

    .line 72
    .line 73
    .line 74
    :cond_2
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->E:Ljava/lang/CharSequence;

    .line 75
    .line 76
    :goto_0
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 77
    .line 78
    if-nez p1, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :goto_1
    invoke-virtual {p0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->v(Landroid/text/Editable;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public setPlaceholderTextAppearance(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->I:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:Ldefpackage/mh;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setPlaceholderTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->H:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->H:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:Ldefpackage/mh;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setPrefixText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v0, p1

    .line 15
    :goto_0
    iput-object v0, p0, Ldefpackage/el4;->p:Ljava/lang/CharSequence;

    .line 16
    .line 17
    iget-object v0, p0, Ldefpackage/el4;->o:Ldefpackage/mh;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ldefpackage/el4;->e()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public setPrefixTextAppearance(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/el4;->o:Ldefpackage/mh;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setPrefixTextColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/el4;->o:Ldefpackage/mh;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setShapeAppearanceModel(Ldefpackage/bc4;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ldefpackage/fi2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, v0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 6
    .line 7
    iget-object v0, v0, Ldefpackage/ei2;->a:Ldefpackage/bc4;

    .line 8
    .line 9
    if-eq v0, p1, :cond_0

    .line 10
    .line 11
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->b0:Ldefpackage/bc4;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->b()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setStartIconCheckable(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/el4;->q:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/google/android/material/internal/CheckableImageButton;->setCheckable(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setStartIconContentDescription(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setStartIconContentDescription(Ljava/lang/CharSequence;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setStartIconContentDescription(Ljava/lang/CharSequence;)V
    .locals 1

    .line 17
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 18
    iget-object p0, p0, Ldefpackage/el4;->q:Lcom/google/android/material/internal/CheckableImageButton;

    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    move-result-object v0

    if-eq v0, p1, :cond_0

    .line 20
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public setStartIconDrawable(I)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p1}, Ldefpackage/zz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setStartIconDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setStartIconDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 17
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    invoke-virtual {p0, p1}, Ldefpackage/el4;->b(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setStartIconMinSize(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 2
    .line 3
    if-ltz p1, :cond_1

    .line 4
    .line 5
    iget v0, p0, Ldefpackage/el4;->t:I

    .line 6
    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    iput p1, p0, Ldefpackage/el4;->t:I

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/el4;->q:Lcom/google/android/material/internal/CheckableImageButton;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/view/View;->setMinimumWidth(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    const-string p0, "startIconSize cannot be less than 0"

    .line 24
    .line 25
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public setStartIconOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/el4;->q:Lcom/google/android/material/internal/CheckableImageButton;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/el4;->v:Landroid/view/View$OnLongClickListener;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, p0}, Ldefpackage/au0;->R(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setStartIconOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/el4;->v:Landroid/view/View$OnLongClickListener;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/el4;->q:Lcom/google/android/material/internal/CheckableImageButton;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p0, p1}, Ldefpackage/au0;->R(Lcom/google/android/material/internal/CheckableImageButton;Landroid/view/View$OnLongClickListener;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setStartIconScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/el4;->u:Landroid/widget/ImageView$ScaleType;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/el4;->q:Lcom/google/android/material/internal/CheckableImageButton;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setStartIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/el4;->r:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/el4;->r:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/el4;->n:Lcom/google/android/material/textfield/TextInputLayout;

    .line 10
    .line 11
    iget-object v1, p0, Ldefpackage/el4;->q:Lcom/google/android/material/internal/CheckableImageButton;

    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/el4;->s:Landroid/graphics/PorterDuff$Mode;

    .line 14
    .line 15
    invoke-static {v0, v1, p1, p0}, Ldefpackage/au0;->b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setStartIconTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/el4;->s:Landroid/graphics/PorterDuff$Mode;

    .line 4
    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/el4;->s:Landroid/graphics/PorterDuff$Mode;

    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/el4;->n:Lcom/google/android/material/textfield/TextInputLayout;

    .line 10
    .line 11
    iget-object v1, p0, Ldefpackage/el4;->q:Lcom/google/android/material/internal/CheckableImageButton;

    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/el4;->r:Landroid/content/res/ColorStateList;

    .line 14
    .line 15
    invoke-static {v0, v1, p0, p1}, Ldefpackage/au0;->b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setStartIconVisible(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldefpackage/el4;->c(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setSuffixText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v0, p1

    .line 15
    :goto_0
    iput-object v0, p0, Ldefpackage/g11;->C:Ljava/lang/CharSequence;

    .line 16
    .line 17
    iget-object v0, p0, Ldefpackage/g11;->D:Ldefpackage/mh;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ldefpackage/g11;->m()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public setSuffixTextAppearance(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/g11;->D:Ldefpackage/mh;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setSuffixTextColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/g11;->D:Ldefpackage/mh;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setTextInputAccessibilityDelegate(Ldefpackage/fs4;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-static {p0, p1}, Ldefpackage/j65;->o(Landroid/view/View;Ldefpackage/z2;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Landroid/graphics/Typeface;

    .line 2
    .line 3
    if-eq p1, v0, :cond_4

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->o0:Landroid/graphics/Typeface;

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->H0:Ldefpackage/k40;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ldefpackage/k40;->m(Landroid/graphics/Typeface;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {v0, p1}, Ldefpackage/k40;->o(Landroid/graphics/Typeface;)Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    :cond_0
    const/4 v1, 0x0

    .line 22
    invoke-virtual {v0, v1}, Ldefpackage/k40;->i(Z)V

    .line 23
    .line 24
    .line 25
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Ldefpackage/cy1;

    .line 26
    .line 27
    iget-object v1, v0, Ldefpackage/cy1;->B:Landroid/graphics/Typeface;

    .line 28
    .line 29
    if-eq p1, v1, :cond_3

    .line 30
    .line 31
    iput-object p1, v0, Ldefpackage/cy1;->B:Landroid/graphics/Typeface;

    .line 32
    .line 33
    iget-object v1, v0, Ldefpackage/cy1;->r:Ldefpackage/mh;

    .line 34
    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    iget-object v0, v0, Ldefpackage/cy1;->y:Ldefpackage/mh;

    .line 41
    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 45
    .line 46
    .line 47
    :cond_3
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 48
    .line 49
    if-eqz p0, :cond_4

    .line 50
    .line 51
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 52
    .line 53
    .line 54
    :cond_4
    return-void
.end method

.method public final t()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->n:Landroid/widget/FrameLayout;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->c()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    iget v2, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 19
    .line 20
    if-eq p0, v2, :cond_0

    .line 21
    .line 22
    iput p0, v1, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final u(ZZ)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    move v1, v3

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v1, v2

    .line 24
    :goto_0
    iget-object v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 25
    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    invoke-virtual {v4}, Landroid/view/View;->hasFocus()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    move v4, v3

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v4, v2

    .line 37
    :goto_1
    iget-object v5, p0, Lcom/google/android/material/textfield/TextInputLayout;->v0:Landroid/content/res/ColorStateList;

    .line 38
    .line 39
    iget-object v6, p0, Lcom/google/android/material/textfield/TextInputLayout;->H0:Ldefpackage/k40;

    .line 40
    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    invoke-virtual {v6, v5}, Ldefpackage/k40;->j(Landroid/content/res/ColorStateList;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    const/4 v5, 0x0

    .line 47
    if-nez v0, :cond_4

    .line 48
    .line 49
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->v0:Landroid/content/res/ColorStateList;

    .line 50
    .line 51
    iget v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->F0:I

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    const v8, -0x101009e

    .line 56
    .line 57
    .line 58
    filled-new-array {v8}, [I

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    invoke-virtual {v0, v8, v7}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    :cond_3
    invoke-static {v7}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v6, v0}, Ldefpackage/k40;->j(Landroid/content/res/ColorStateList;)V

    .line 71
    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->m()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_6

    .line 79
    .line 80
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w:Ldefpackage/cy1;

    .line 81
    .line 82
    iget-object v0, v0, Ldefpackage/cy1;->r:Ldefpackage/mh;

    .line 83
    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    invoke-virtual {v0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    goto :goto_2

    .line 91
    :cond_5
    move-object v0, v5

    .line 92
    :goto_2
    invoke-virtual {v6, v0}, Ldefpackage/k40;->j(Landroid/content/res/ColorStateList;)V

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_6
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Z

    .line 97
    .line 98
    if-eqz v0, :cond_7

    .line 99
    .line 100
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 101
    .line 102
    if-eqz v0, :cond_7

    .line 103
    .line 104
    invoke-virtual {v0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v6, v0}, Ldefpackage/k40;->j(Landroid/content/res/ColorStateList;)V

    .line 109
    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_7
    if-eqz v4, :cond_8

    .line 113
    .line 114
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->w0:Landroid/content/res/ColorStateList;

    .line 115
    .line 116
    if-eqz v0, :cond_8

    .line 117
    .line 118
    iget-object v7, v6, Ldefpackage/k40;->o:Landroid/content/res/ColorStateList;

    .line 119
    .line 120
    if-eq v7, v0, :cond_8

    .line 121
    .line 122
    iput-object v0, v6, Ldefpackage/k40;->o:Landroid/content/res/ColorStateList;

    .line 123
    .line 124
    invoke-virtual {v6, v2}, Ldefpackage/k40;->i(Z)V

    .line 125
    .line 126
    .line 127
    :cond_8
    :goto_3
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 128
    .line 129
    iget-object v7, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 130
    .line 131
    if-nez v1, :cond_f

    .line 132
    .line 133
    iget-boolean v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->I0:Z

    .line 134
    .line 135
    if-eqz v1, :cond_f

    .line 136
    .line 137
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_9

    .line 142
    .line 143
    if-eqz v4, :cond_9

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_9
    if-nez p2, :cond_a

    .line 147
    .line 148
    iget-boolean p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->G0:Z

    .line 149
    .line 150
    if-nez p2, :cond_10

    .line 151
    .line 152
    :cond_a
    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->K0:Landroid/animation/ValueAnimator;

    .line 153
    .line 154
    if-eqz p2, :cond_b

    .line 155
    .line 156
    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 157
    .line 158
    .line 159
    move-result p2

    .line 160
    if-eqz p2, :cond_b

    .line 161
    .line 162
    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->K0:Landroid/animation/ValueAnimator;

    .line 163
    .line 164
    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->cancel()V

    .line 165
    .line 166
    .line 167
    :cond_b
    const/4 p2, 0x0

    .line 168
    if-eqz p1, :cond_c

    .line 169
    .line 170
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Z

    .line 171
    .line 172
    if-eqz p1, :cond_c

    .line 173
    .line 174
    invoke-virtual {p0, p2}, Lcom/google/android/material/textfield/TextInputLayout;->a(F)V

    .line 175
    .line 176
    .line 177
    goto :goto_4

    .line 178
    :cond_c
    invoke-virtual {v6, p2}, Ldefpackage/k40;->p(F)V

    .line 179
    .line 180
    .line 181
    :goto_4
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->e()Z

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    if-eqz p1, :cond_d

    .line 186
    .line 187
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ldefpackage/fi2;

    .line 188
    .line 189
    check-cast p1, Ldefpackage/eh0;

    .line 190
    .line 191
    iget-object p1, p1, Ldefpackage/eh0;->K:Ldefpackage/dh0;

    .line 192
    .line 193
    iget-object p1, p1, Ldefpackage/dh0;->r:Landroid/graphics/RectF;

    .line 194
    .line 195
    invoke-virtual {p1}, Landroid/graphics/RectF;->isEmpty()Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    if-nez p1, :cond_d

    .line 200
    .line 201
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->e()Z

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    if-eqz p1, :cond_d

    .line 206
    .line 207
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ldefpackage/fi2;

    .line 208
    .line 209
    check-cast p1, Ldefpackage/eh0;

    .line 210
    .line 211
    invoke-virtual {p1, p2, p2, p2, p2}, Ldefpackage/eh0;->v(FFFF)V

    .line 212
    .line 213
    .line 214
    :cond_d
    iput-boolean v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->G0:Z

    .line 215
    .line 216
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:Ldefpackage/mh;

    .line 217
    .line 218
    if-eqz p1, :cond_e

    .line 219
    .line 220
    iget-boolean p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Z

    .line 221
    .line 222
    if-eqz p2, :cond_e

    .line 223
    .line 224
    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 225
    .line 226
    .line 227
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->n:Landroid/widget/FrameLayout;

    .line 228
    .line 229
    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Ldefpackage/u51;

    .line 230
    .line 231
    invoke-static {p1, p2}, Ldefpackage/ix4;->a(Landroid/view/ViewGroup;Ldefpackage/dx4;)V

    .line 232
    .line 233
    .line 234
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:Ldefpackage/mh;

    .line 235
    .line 236
    const/4 p1, 0x4

    .line 237
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 238
    .line 239
    .line 240
    :cond_e
    iput-boolean v3, v7, Ldefpackage/el4;->w:Z

    .line 241
    .line 242
    invoke-virtual {v7}, Ldefpackage/el4;->e()V

    .line 243
    .line 244
    .line 245
    iput-boolean v3, v0, Ldefpackage/g11;->E:Z

    .line 246
    .line 247
    invoke-virtual {v0}, Ldefpackage/g11;->m()V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :cond_f
    :goto_5
    if-nez p2, :cond_11

    .line 252
    .line 253
    iget-boolean p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->G0:Z

    .line 254
    .line 255
    if-eqz p2, :cond_10

    .line 256
    .line 257
    goto :goto_6

    .line 258
    :cond_10
    return-void

    .line 259
    :cond_11
    :goto_6
    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->K0:Landroid/animation/ValueAnimator;

    .line 260
    .line 261
    if-eqz p2, :cond_12

    .line 262
    .line 263
    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->isRunning()Z

    .line 264
    .line 265
    .line 266
    move-result p2

    .line 267
    if-eqz p2, :cond_12

    .line 268
    .line 269
    iget-object p2, p0, Lcom/google/android/material/textfield/TextInputLayout;->K0:Landroid/animation/ValueAnimator;

    .line 270
    .line 271
    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->cancel()V

    .line 272
    .line 273
    .line 274
    :cond_12
    const/high16 p2, 0x3f800000    # 1.0f

    .line 275
    .line 276
    if-eqz p1, :cond_13

    .line 277
    .line 278
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->J0:Z

    .line 279
    .line 280
    if-eqz p1, :cond_13

    .line 281
    .line 282
    invoke-virtual {p0, p2}, Lcom/google/android/material/textfield/TextInputLayout;->a(F)V

    .line 283
    .line 284
    .line 285
    goto :goto_7

    .line 286
    :cond_13
    invoke-virtual {v6, p2}, Ldefpackage/k40;->p(F)V

    .line 287
    .line 288
    .line 289
    :goto_7
    iput-boolean v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->G0:Z

    .line 290
    .line 291
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->e()Z

    .line 292
    .line 293
    .line 294
    move-result p1

    .line 295
    if-eqz p1, :cond_14

    .line 296
    .line 297
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->j()V

    .line 298
    .line 299
    .line 300
    :cond_14
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 301
    .line 302
    if-nez p1, :cond_15

    .line 303
    .line 304
    goto :goto_8

    .line 305
    :cond_15
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 306
    .line 307
    .line 308
    move-result-object v5

    .line 309
    :goto_8
    invoke-virtual {p0, v5}, Lcom/google/android/material/textfield/TextInputLayout;->v(Landroid/text/Editable;)V

    .line 310
    .line 311
    .line 312
    iput-boolean v2, v7, Ldefpackage/el4;->w:Z

    .line 313
    .line 314
    invoke-virtual {v7}, Ldefpackage/el4;->e()V

    .line 315
    .line 316
    .line 317
    iput-boolean v2, v0, Ldefpackage/g11;->E:Z

    .line 318
    .line 319
    invoke-virtual {v0}, Ldefpackage/g11;->m()V

    .line 320
    .line 321
    .line 322
    return-void
.end method

.method public final v(Landroid/text/Editable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A:Ldefpackage/gs4;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/tb4;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move p1, v0

    .line 17
    :goto_0
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->n:Landroid/widget/FrameLayout;

    .line 18
    .line 19
    if-nez p1, :cond_1

    .line 20
    .line 21
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->G0:Z

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:Ldefpackage/mh;

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    iget-boolean p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Z

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->E:Ljava/lang/CharSequence;

    .line 34
    .line 35
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-nez p1, :cond_2

    .line 40
    .line 41
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:Ldefpackage/mh;

    .line 42
    .line 43
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->E:Ljava/lang/CharSequence;

    .line 44
    .line 45
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->J:Ldefpackage/u51;

    .line 49
    .line 50
    invoke-static {v1, p1}, Ldefpackage/ix4;->a(Landroid/view/ViewGroup;Ldefpackage/dx4;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:Ldefpackage/mh;

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:Ldefpackage/mh;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/View;->bringToFront()V

    .line 61
    .line 62
    .line 63
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->E:Ljava/lang/CharSequence;

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Landroid/view/View;->announceForAccessibility(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_1
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:Ldefpackage/mh;

    .line 70
    .line 71
    if-eqz p1, :cond_2

    .line 72
    .line 73
    iget-boolean v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->F:Z

    .line 74
    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    const/4 v0, 0x0

    .line 78
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Lcom/google/android/material/textfield/TextInputLayout;->K:Ldefpackage/u51;

    .line 82
    .line 83
    invoke-static {v1, p1}, Ldefpackage/ix4;->a(Landroid/view/ViewGroup;Ldefpackage/dx4;)V

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, Lcom/google/android/material/textfield/TextInputLayout;->G:Ldefpackage/mh;

    .line 87
    .line 88
    const/4 p1, 0x4

    .line 89
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 90
    .line 91
    .line 92
    :cond_2
    return-void
.end method

.method public final w(ZZ)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->A0:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->A0:Landroid/content/res/ColorStateList;

    .line 8
    .line 9
    const v2, 0x1010367

    .line 10
    .line 11
    .line 12
    const v3, 0x101009e

    .line 13
    .line 14
    .line 15
    filled-new-array {v2, v3}, [I

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v1, v2, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget-object v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->A0:Landroid/content/res/ColorStateList;

    .line 24
    .line 25
    const v4, 0x10102fe

    .line 26
    .line 27
    .line 28
    filled-new-array {v4, v3}, [I

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v2, v3, v0}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    iput v2, p0, Lcom/google/android/material/textfield/TextInputLayout;->j0:I

    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    if-eqz p2, :cond_1

    .line 42
    .line 43
    iput v1, p0, Lcom/google/android/material/textfield/TextInputLayout;->j0:I

    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->j0:I

    .line 47
    .line 48
    return-void
.end method

.method public final x()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ldefpackage/fi2;

    .line 2
    .line 3
    if-eqz v0, :cond_16

    .line 4
    .line 5
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:I

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_6

    .line 10
    .line 11
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x1

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v0, v1

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    :goto_0
    move v0, v2

    .line 33
    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->isHovered()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_3

    .line 38
    .line 39
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->q:Landroid/widget/EditText;

    .line 40
    .line 41
    if-eqz v3, :cond_4

    .line 42
    .line 43
    invoke-virtual {v3}, Landroid/view/View;->isHovered()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eqz v3, :cond_4

    .line 48
    .line 49
    :cond_3
    move v1, v2

    .line 50
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_5

    .line 55
    .line 56
    iget v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->F0:I

    .line 57
    .line 58
    iput v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->j0:I

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_5
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->m()Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_7

    .line 66
    .line 67
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->A0:Landroid/content/res/ColorStateList;

    .line 68
    .line 69
    if-eqz v3, :cond_6

    .line 70
    .line 71
    invoke-virtual {p0, v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->w(ZZ)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_6
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getErrorCurrentTextColors()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    iput v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->j0:I

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_7
    iget-boolean v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->z:Z

    .line 83
    .line 84
    if-eqz v3, :cond_9

    .line 85
    .line 86
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->B:Ldefpackage/mh;

    .line 87
    .line 88
    if-eqz v3, :cond_9

    .line 89
    .line 90
    iget-object v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->A0:Landroid/content/res/ColorStateList;

    .line 91
    .line 92
    if-eqz v4, :cond_8

    .line 93
    .line 94
    invoke-virtual {p0, v0, v1}, Lcom/google/android/material/textfield/TextInputLayout;->w(ZZ)V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_8
    invoke-virtual {v3}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 99
    .line 100
    .line 101
    move-result v3

    .line 102
    iput v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->j0:I

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_9
    if-eqz v0, :cond_a

    .line 106
    .line 107
    iget v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->z0:I

    .line 108
    .line 109
    iput v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->j0:I

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_a
    if-eqz v1, :cond_b

    .line 113
    .line 114
    iget v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->y0:I

    .line 115
    .line 116
    iput v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->j0:I

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_b
    iget v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->x0:I

    .line 120
    .line 121
    iput v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->j0:I

    .line 122
    .line 123
    :goto_2
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 124
    .line 125
    const/16 v4, 0x1d

    .line 126
    .line 127
    if-lt v3, v4, :cond_c

    .line 128
    .line 129
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->p()V

    .line 130
    .line 131
    .line 132
    :cond_c
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->p:Ldefpackage/g11;

    .line 133
    .line 134
    iget-object v4, v3, Ldefpackage/g11;->n:Lcom/google/android/material/textfield/TextInputLayout;

    .line 135
    .line 136
    iget-object v5, v3, Ldefpackage/g11;->t:Lcom/google/android/material/internal/CheckableImageButton;

    .line 137
    .line 138
    iget-object v6, v3, Ldefpackage/g11;->n:Lcom/google/android/material/textfield/TextInputLayout;

    .line 139
    .line 140
    invoke-virtual {v3}, Ldefpackage/g11;->k()V

    .line 141
    .line 142
    .line 143
    iget-object v7, v3, Ldefpackage/g11;->p:Lcom/google/android/material/internal/CheckableImageButton;

    .line 144
    .line 145
    iget-object v8, v3, Ldefpackage/g11;->q:Landroid/content/res/ColorStateList;

    .line 146
    .line 147
    invoke-static {v6, v7, v8}, Ldefpackage/au0;->Q(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    .line 148
    .line 149
    .line 150
    iget-object v7, v3, Ldefpackage/g11;->x:Landroid/content/res/ColorStateList;

    .line 151
    .line 152
    invoke-static {v6, v5, v7}, Ldefpackage/au0;->Q(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3}, Ldefpackage/g11;->a()Ldefpackage/h11;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    instance-of v6, v6, Ldefpackage/ix0;

    .line 160
    .line 161
    if-eqz v6, :cond_e

    .line 162
    .line 163
    invoke-virtual {v4}, Lcom/google/android/material/textfield/TextInputLayout;->m()Z

    .line 164
    .line 165
    .line 166
    move-result v6

    .line 167
    if-eqz v6, :cond_d

    .line 168
    .line 169
    invoke-virtual {v5}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 170
    .line 171
    .line 172
    move-result-object v6

    .line 173
    if-eqz v6, :cond_d

    .line 174
    .line 175
    invoke-virtual {v5}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    invoke-virtual {v3}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-virtual {v4}, Lcom/google/android/material/textfield/TextInputLayout;->getErrorCurrentTextColors()I

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v5, v3}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 191
    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_d
    iget-object v6, v3, Ldefpackage/g11;->x:Landroid/content/res/ColorStateList;

    .line 195
    .line 196
    iget-object v3, v3, Ldefpackage/g11;->y:Landroid/graphics/PorterDuff$Mode;

    .line 197
    .line 198
    invoke-static {v4, v5, v6, v3}, Ldefpackage/au0;->b(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)V

    .line 199
    .line 200
    .line 201
    :cond_e
    :goto_3
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->o:Ldefpackage/el4;

    .line 202
    .line 203
    iget-object v4, v3, Ldefpackage/el4;->n:Lcom/google/android/material/textfield/TextInputLayout;

    .line 204
    .line 205
    iget-object v5, v3, Ldefpackage/el4;->q:Lcom/google/android/material/internal/CheckableImageButton;

    .line 206
    .line 207
    iget-object v3, v3, Ldefpackage/el4;->r:Landroid/content/res/ColorStateList;

    .line 208
    .line 209
    invoke-static {v4, v5, v3}, Ldefpackage/au0;->Q(Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/internal/CheckableImageButton;Landroid/content/res/ColorStateList;)V

    .line 210
    .line 211
    .line 212
    iget v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:I

    .line 213
    .line 214
    const/4 v4, 0x2

    .line 215
    if-ne v3, v4, :cond_11

    .line 216
    .line 217
    iget v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 218
    .line 219
    if-eqz v0, :cond_f

    .line 220
    .line 221
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    if-eqz v4, :cond_f

    .line 226
    .line 227
    iget v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->i0:I

    .line 228
    .line 229
    iput v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_f
    iget v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->h0:I

    .line 233
    .line 234
    iput v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 235
    .line 236
    :goto_4
    iget v4, p0, Lcom/google/android/material/textfield/TextInputLayout;->g0:I

    .line 237
    .line 238
    if-eq v4, v3, :cond_11

    .line 239
    .line 240
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->e()Z

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    if-eqz v3, :cond_11

    .line 245
    .line 246
    iget-boolean v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->G0:Z

    .line 247
    .line 248
    if-nez v3, :cond_11

    .line 249
    .line 250
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->e()Z

    .line 251
    .line 252
    .line 253
    move-result v3

    .line 254
    if-eqz v3, :cond_10

    .line 255
    .line 256
    iget-object v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->S:Ldefpackage/fi2;

    .line 257
    .line 258
    check-cast v3, Ldefpackage/eh0;

    .line 259
    .line 260
    const/4 v4, 0x0

    .line 261
    invoke-virtual {v3, v4, v4, v4, v4}, Ldefpackage/eh0;->v(FFFF)V

    .line 262
    .line 263
    .line 264
    :cond_10
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->j()V

    .line 265
    .line 266
    .line 267
    :cond_11
    iget v3, p0, Lcom/google/android/material/textfield/TextInputLayout;->e0:I

    .line 268
    .line 269
    if-ne v3, v2, :cond_15

    .line 270
    .line 271
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    if-nez v2, :cond_12

    .line 276
    .line 277
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->C0:I

    .line 278
    .line 279
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->k0:I

    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_12
    if-eqz v1, :cond_13

    .line 283
    .line 284
    if-nez v0, :cond_13

    .line 285
    .line 286
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->E0:I

    .line 287
    .line 288
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->k0:I

    .line 289
    .line 290
    goto :goto_5

    .line 291
    :cond_13
    if-eqz v0, :cond_14

    .line 292
    .line 293
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->D0:I

    .line 294
    .line 295
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->k0:I

    .line 296
    .line 297
    goto :goto_5

    .line 298
    :cond_14
    iget v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->B0:I

    .line 299
    .line 300
    iput v0, p0, Lcom/google/android/material/textfield/TextInputLayout;->k0:I

    .line 301
    .line 302
    :cond_15
    :goto_5
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->b()V

    .line 303
    .line 304
    .line 305
    :cond_16
    :goto_6
    return-void
.end method
