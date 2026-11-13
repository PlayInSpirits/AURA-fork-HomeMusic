.class public Lcom/google/android/material/search/SearchBar;
.super Landroidx/appcompat/widget/Toolbar;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/search/SearchBar$ScrollingViewBehavior;
    }
.end annotation


# static fields
.field public static final synthetic z0:I


# instance fields
.field public final k0:Landroid/widget/TextView;

.field public final l0:Z

.field public final m0:Z

.field public final n0:Ldefpackage/hh3;

.field public final o0:Landroid/graphics/drawable/Drawable;

.field public final p0:Z

.field public final q0:Z

.field public r0:Landroid/view/View;

.field public final s0:Ljava/lang/Integer;

.field public t0:Landroid/graphics/drawable/Drawable;

.field public u0:I

.field public v0:Z

.field public final w0:Ldefpackage/fi2;

.field public final x0:Landroid/view/accessibility/AccessibilityManager;

.field public final y0:Ldefpackage/ss2;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 417
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/search/SearchBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f040352

    .line 416
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/search/SearchBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 16

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
    const v7, 0x7f140444

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
    invoke-direct {v0, v1, v2, v4}, Landroidx/appcompat/widget/Toolbar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 17
    .line 18
    .line 19
    const/4 v8, -0x1

    .line 20
    iput v8, v0, Lcom/google/android/material/search/SearchBar;->u0:I

    .line 21
    .line 22
    new-instance v1, Ldefpackage/ss2;

    .line 23
    .line 24
    const/16 v3, 0xd

    .line 25
    .line 26
    invoke-direct {v1, v3, v0}, Ldefpackage/ss2;-><init>(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iput-object v1, v0, Lcom/google/android/material/search/SearchBar;->y0:Ldefpackage/ss2;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-string v3, "title"

    .line 39
    .line 40
    const-string v5, "http://schemas.android.com/apk/res-auto"

    .line 41
    .line 42
    invoke-interface {v2, v5, v3}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    const/4 v6, 0x0

    .line 47
    if-nez v3, :cond_a

    .line 48
    .line 49
    const-string v3, "subtitle"

    .line 50
    .line 51
    invoke-interface {v2, v5, v3}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    if-nez v3, :cond_9

    .line 56
    .line 57
    :goto_0
    invoke-virtual {v0}, Lcom/google/android/material/search/SearchBar;->getDefaultNavigationIconResource()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-static {v1, v3}, Ldefpackage/zz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    iput-object v9, v0, Lcom/google/android/material/search/SearchBar;->o0:Landroid/graphics/drawable/Drawable;

    .line 66
    .line 67
    new-instance v3, Ldefpackage/hh3;

    .line 68
    .line 69
    const/16 v5, 0x18

    .line 70
    .line 71
    invoke-direct {v3, v5}, Ldefpackage/hh3;-><init>(I)V

    .line 72
    .line 73
    .line 74
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 75
    .line 76
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 77
    .line 78
    .line 79
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 80
    .line 81
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 82
    .line 83
    .line 84
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 85
    .line 86
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 87
    .line 88
    .line 89
    iput-object v3, v0, Lcom/google/android/material/search/SearchBar;->n0:Ldefpackage/hh3;

    .line 90
    .line 91
    const v5, 0x7f140444

    .line 92
    .line 93
    .line 94
    const/4 v10, 0x0

    .line 95
    new-array v6, v10, [I

    .line 96
    .line 97
    sget-object v3, Ldefpackage/ht3;->N:[I

    .line 98
    .line 99
    invoke-static/range {v1 .. v6}, Ldefpackage/uc5;->D(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-static {v1, v2, v4, v7}, Ldefpackage/bc4;->c(Landroid/content/Context;Landroid/util/AttributeSet;II)Ldefpackage/zc1;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {v2}, Ldefpackage/zc1;->a()Ldefpackage/bc4;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    const/4 v4, 0x3

    .line 112
    invoke-virtual {v3, v4, v10}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    const/4 v5, 0x6

    .line 117
    const/4 v6, 0x0

    .line 118
    invoke-virtual {v3, v5, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    const/4 v7, 0x4

    .line 123
    const/4 v11, 0x1

    .line 124
    invoke-virtual {v3, v7, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 125
    .line 126
    .line 127
    move-result v7

    .line 128
    iput-boolean v7, v0, Lcom/google/android/material/search/SearchBar;->m0:Z

    .line 129
    .line 130
    const/4 v7, 0x5

    .line 131
    invoke-virtual {v3, v7, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 132
    .line 133
    .line 134
    move-result v12

    .line 135
    iput-boolean v12, v0, Lcom/google/android/material/search/SearchBar;->v0:Z

    .line 136
    .line 137
    const/16 v12, 0x8

    .line 138
    .line 139
    invoke-virtual {v3, v12, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 140
    .line 141
    .line 142
    move-result v12

    .line 143
    const/4 v13, 0x7

    .line 144
    invoke-virtual {v3, v13, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 145
    .line 146
    .line 147
    move-result v13

    .line 148
    iput-boolean v13, v0, Lcom/google/android/material/search/SearchBar;->q0:Z

    .line 149
    .line 150
    const/16 v13, 0xc

    .line 151
    .line 152
    invoke-virtual {v3, v13, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 153
    .line 154
    .line 155
    move-result v13

    .line 156
    iput-boolean v13, v0, Lcom/google/android/material/search/SearchBar;->p0:Z

    .line 157
    .line 158
    const/16 v13, 0x9

    .line 159
    .line 160
    invoke-virtual {v3, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 161
    .line 162
    .line 163
    move-result v14

    .line 164
    if-eqz v14, :cond_1

    .line 165
    .line 166
    invoke-virtual {v3, v13, v8}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 167
    .line 168
    .line 169
    move-result v13

    .line 170
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v13

    .line 174
    iput-object v13, v0, Lcom/google/android/material/search/SearchBar;->s0:Ljava/lang/Integer;

    .line 175
    .line 176
    :cond_1
    invoke-virtual {v3, v10, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 177
    .line 178
    .line 179
    move-result v13

    .line 180
    invoke-virtual {v3, v11}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v14

    .line 184
    const/4 v15, 0x2

    .line 185
    invoke-virtual {v3, v15}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v15

    .line 189
    move/from16 p1, v6

    .line 190
    .line 191
    const/16 v6, 0xb

    .line 192
    .line 193
    const/high16 v7, -0x40800000    # -1.0f

    .line 194
    .line 195
    invoke-virtual {v3, v6, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 196
    .line 197
    .line 198
    move-result v6

    .line 199
    const/16 v7, 0xa

    .line 200
    .line 201
    invoke-virtual {v3, v7, v10}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 202
    .line 203
    .line 204
    move-result v7

    .line 205
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 206
    .line 207
    .line 208
    if-nez v12, :cond_3

    .line 209
    .line 210
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    .line 211
    .line 212
    .line 213
    move-result-object v3

    .line 214
    if-nez v3, :cond_2

    .line 215
    .line 216
    goto :goto_1

    .line 217
    :cond_2
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    .line 218
    .line 219
    .line 220
    move-result-object v9

    .line 221
    :goto_1
    invoke-virtual {v0, v9}, Lcom/google/android/material/search/SearchBar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 222
    .line 223
    .line 224
    invoke-direct {v0, v11}, Lcom/google/android/material/search/SearchBar;->setNavigationIconDecorative(Z)V

    .line 225
    .line 226
    .line 227
    :cond_3
    invoke-virtual {v0, v11}, Landroid/view/View;->setClickable(Z)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0, v11}, Landroid/view/View;->setFocusable(Z)V

    .line 231
    .line 232
    .line 233
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    const v3, 0x7f0d0103

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1, v3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 241
    .line 242
    .line 243
    iput-boolean v11, v0, Lcom/google/android/material/search/SearchBar;->l0:Z

    .line 244
    .line 245
    const v1, 0x7f0a0435

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    check-cast v1, Landroid/widget/TextView;

    .line 253
    .line 254
    iput-object v1, v0, Lcom/google/android/material/search/SearchBar;->k0:Landroid/widget/TextView;

    .line 255
    .line 256
    sget-object v3, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 257
    .line 258
    invoke-virtual {v0, v5}, Lcom/google/android/material/search/SearchBar;->setElevation(F)V

    .line 259
    .line 260
    .line 261
    if-eq v13, v8, :cond_4

    .line 262
    .line 263
    invoke-virtual {v1, v13}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 264
    .line 265
    .line 266
    :cond_4
    invoke-virtual {v0, v14}, Lcom/google/android/material/search/SearchBar;->setText(Ljava/lang/CharSequence;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0, v15}, Lcom/google/android/material/search/SearchBar;->setHint(Ljava/lang/CharSequence;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    if-nez v3, :cond_5

    .line 277
    .line 278
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 283
    .line 284
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    const v8, 0x7f07049e

    .line 289
    .line 290
    .line 291
    invoke-virtual {v3, v8}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 296
    .line 297
    .line 298
    :cond_5
    new-instance v1, Ldefpackage/fi2;

    .line 299
    .line 300
    invoke-direct {v1, v2}, Ldefpackage/fi2;-><init>(Ldefpackage/bc4;)V

    .line 301
    .line 302
    .line 303
    iput-object v1, v0, Lcom/google/android/material/search/SearchBar;->w0:Ldefpackage/fi2;

    .line 304
    .line 305
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    invoke-virtual {v1, v2}, Ldefpackage/fi2;->j(Landroid/content/Context;)V

    .line 310
    .line 311
    .line 312
    iget-object v1, v0, Lcom/google/android/material/search/SearchBar;->w0:Ldefpackage/fi2;

    .line 313
    .line 314
    invoke-virtual {v1, v5}, Ldefpackage/fi2;->l(F)V

    .line 315
    .line 316
    .line 317
    cmpl-float v1, v6, p1

    .line 318
    .line 319
    if-ltz v1, :cond_6

    .line 320
    .line 321
    iget-object v1, v0, Lcom/google/android/material/search/SearchBar;->w0:Ldefpackage/fi2;

    .line 322
    .line 323
    invoke-virtual {v1, v6}, Ldefpackage/fi2;->r(F)V

    .line 324
    .line 325
    .line 326
    invoke-static {v7}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-virtual {v1, v2}, Ldefpackage/fi2;->q(Landroid/content/res/ColorStateList;)V

    .line 331
    .line 332
    .line 333
    :cond_6
    const v1, 0x7f040112

    .line 334
    .line 335
    .line 336
    invoke-static {v0, v1}, Ldefpackage/g12;->t(Landroid/view/View;I)I

    .line 337
    .line 338
    .line 339
    move-result v1

    .line 340
    iget-object v2, v0, Lcom/google/android/material/search/SearchBar;->w0:Ldefpackage/fi2;

    .line 341
    .line 342
    invoke-static {v4}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    invoke-virtual {v2, v3}, Ldefpackage/fi2;->m(Landroid/content/res/ColorStateList;)V

    .line 347
    .line 348
    .line 349
    new-instance v2, Landroid/graphics/drawable/RippleDrawable;

    .line 350
    .line 351
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    iget-object v3, v0, Lcom/google/android/material/search/SearchBar;->w0:Ldefpackage/fi2;

    .line 356
    .line 357
    invoke-direct {v2, v1, v3, v3}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    const-string v2, "accessibility"

    .line 368
    .line 369
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    .line 374
    .line 375
    iput-object v1, v0, Lcom/google/android/material/search/SearchBar;->x0:Landroid/view/accessibility/AccessibilityManager;

    .line 376
    .line 377
    if-eqz v1, :cond_8

    .line 378
    .line 379
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 380
    .line 381
    .line 382
    move-result v2

    .line 383
    if-eqz v2, :cond_7

    .line 384
    .line 385
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityManager;->isTouchExplorationEnabled()Z

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    if-eqz v1, :cond_7

    .line 390
    .line 391
    invoke-virtual {v0, v11}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 392
    .line 393
    .line 394
    :cond_7
    new-instance v1, Ldefpackage/bc;

    .line 395
    .line 396
    const/4 v2, 0x5

    .line 397
    invoke-direct {v1, v2, v0}, Ldefpackage/bc;-><init>(ILjava/lang/Object;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 401
    .line 402
    .line 403
    :cond_8
    return-void

    .line 404
    :cond_9
    const-string v0, "SearchBar does not support subtitle. Use hint or text instead."

    .line 405
    .line 406
    invoke-static {v0}, Ldefpackage/er1;->l(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    throw v6

    .line 410
    :cond_a
    const-string v0, "SearchBar does not support title. Use hint or text instead."

    .line 411
    .line 412
    invoke-static {v0}, Ldefpackage/er1;->l(Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    throw v6
.end method

.method private setNavigationIconDecorative(Z)V
    .locals 2

    .line 1
    invoke-static {p0}, Ldefpackage/gb;->F(Landroidx/appcompat/widget/Toolbar;)Landroid/widget/ImageButton;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    xor-int/lit8 v1, p1, 0x1

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 11
    .line 12
    .line 13
    xor-int/lit8 v1, p1, 0x1

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iput-object v1, p0, Lcom/google/android/material/search/SearchBar;->t0:Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    :cond_1
    if-eqz p1, :cond_2

    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    goto :goto_0

    .line 30
    :cond_2
    iget-object p0, p0, Lcom/google/android/material/search/SearchBar;->t0:Landroid/graphics/drawable/Drawable;

    .line 31
    .line 32
    :goto_0
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/search/SearchBar;->l0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/google/android/material/search/SearchBar;->r0:Landroid/view/View;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    instance-of v0, p1, Landroidx/appcompat/widget/ActionMenuView;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iput-object p1, p0, Lcom/google/android/material/search/SearchBar;->r0:Landroid/view/View;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public getCenterView()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchBar;->r0:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCompatElevation()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchBar;->w0:Ldefpackage/fi2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, v0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 6
    .line 7
    iget p0, p0, Ldefpackage/ei2;->m:F

    .line 8
    .line 9
    return p0

    .line 10
    :cond_0
    sget-object v0, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getElevation()F

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public getCornerSize()F
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchBar;->w0:Ldefpackage/fi2;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/fi2;->h()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getDefaultMarginVerticalResource()I
    .locals 0

    .line 1
    const p0, 0x7f07049b

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public getDefaultNavigationIconResource()I
    .locals 0

    .line 1
    const p0, 0x7f080217

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public getHint()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchBar;->k0:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getMenuResId()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/search/SearchBar;->u0:I

    .line 2
    .line 3
    return p0
.end method

.method public getStrokeColor()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchBar;->w0:Ldefpackage/fi2;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ei2;->d:Landroid/content/res/ColorStateList;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public getStrokeWidth()F
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchBar;->w0:Ldefpackage/fi2;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/fi2;->n:Ldefpackage/ei2;

    .line 4
    .line 5
    iget p0, p0, Ldefpackage/ei2;->j:F

    .line 6
    .line 7
    return p0
.end method

.method public getText()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchBar;->k0:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getTextView()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchBar;->k0:Landroid/widget/TextView;

    .line 2
    .line 3
    return-object p0
.end method

.method public final m(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ldefpackage/qu2;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Ldefpackage/qu2;

    .line 11
    .line 12
    invoke-virtual {v2}, Ldefpackage/qu2;->y()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-super {p0, p1}, Landroidx/appcompat/widget/Toolbar;->m(I)V

    .line 16
    .line 17
    .line 18
    iput p1, p0, Lcom/google/android/material/search/SearchBar;->u0:I

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    check-cast v0, Ldefpackage/qu2;

    .line 23
    .line 24
    invoke-virtual {v0}, Ldefpackage/qu2;->x()V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroidx/appcompat/widget/Toolbar;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/google/android/material/search/SearchBar;->w0:Ldefpackage/fi2;

    .line 5
    .line 6
    invoke-static {p0, v0}, Ldefpackage/ji2;->O(Landroid/view/View;Ldefpackage/fi2;)V

    .line 7
    .line 8
    .line 9
    iget-boolean v0, p0, Lcom/google/android/material/search/SearchBar;->m0:Z

    .line 10
    .line 11
    if-eqz v0, :cond_4

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    instance-of v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 18
    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const v1, 0x7f07049a

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchBar;->getDefaultMarginVerticalResource()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 45
    .line 46
    iget v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 47
    .line 48
    if-nez v3, :cond_0

    .line 49
    .line 50
    move v3, v1

    .line 51
    :cond_0
    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 52
    .line 53
    iget v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 54
    .line 55
    if-nez v3, :cond_1

    .line 56
    .line 57
    move v3, v0

    .line 58
    :cond_1
    iput v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 59
    .line 60
    iget v3, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 61
    .line 62
    if-nez v3, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    move v1, v3

    .line 66
    :goto_0
    iput v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 67
    .line 68
    iget v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 69
    .line 70
    if-nez v1, :cond_3

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    move v0, v1

    .line 74
    :goto_1
    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 75
    .line 76
    :cond_4
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchBar;->x()V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    .line 3
    .line 4
    const-class v0, Landroid/widget/EditText;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClassName(Ljava/lang/CharSequence;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchBar;->getText()Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 22
    .line 23
    const/16 v3, 0x1a

    .line 24
    .line 25
    if-lt v2, v3, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchBar;->getHint()Ljava/lang/CharSequence;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {p1, v2}, Ldefpackage/rg3;->l(Landroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1, v1}, Ldefpackage/rg3;->m(Landroid/view/accessibility/AccessibilityNodeInfo;Z)V

    .line 35
    .line 36
    .line 37
    :cond_0
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchBar;->getHint()Ljava/lang/CharSequence;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :cond_1
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setText(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 2

    .line 1
    invoke-super/range {p0 .. p5}, Landroidx/appcompat/widget/Toolbar;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lcom/google/android/material/search/SearchBar;->r0:Landroid/view/View;

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    div-int/lit8 p2, p2, 0x2

    .line 18
    .line 19
    div-int/lit8 p3, p1, 0x2

    .line 20
    .line 21
    sub-int/2addr p2, p3

    .line 22
    add-int/2addr p1, p2

    .line 23
    iget-object p3, p0, Lcom/google/android/material/search/SearchBar;->r0:Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {p3}, Landroid/view/View;->getMeasuredHeight()I

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 30
    .line 31
    .line 32
    move-result p4

    .line 33
    div-int/lit8 p4, p4, 0x2

    .line 34
    .line 35
    div-int/lit8 p5, p3, 0x2

    .line 36
    .line 37
    sub-int/2addr p4, p5

    .line 38
    add-int/2addr p3, p4

    .line 39
    iget-object p5, p0, Lcom/google/android/material/search/SearchBar;->r0:Landroid/view/View;

    .line 40
    .line 41
    sget-object v0, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    const/4 v1, 0x1

    .line 48
    if-ne v0, v1, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    sub-int/2addr v0, p1

    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    sub-int/2addr p0, p2

    .line 60
    invoke-virtual {p5, v0, p4, p0, p3}, Landroid/view/View;->layout(IIII)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_1
    invoke-virtual {p5, p2, p4, p1, p3}, Landroid/view/View;->layout(IIII)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final onMeasure(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/appcompat/widget/Toolbar;->onMeasure(II)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/material/search/SearchBar;->r0:Landroid/view/View;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->measure(II)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Ldefpackage/j74;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroidx/appcompat/widget/Toolbar;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Ldefpackage/j74;

    .line 10
    .line 11
    iget-object v0, p1, Ldefpackage/k;->n:Landroid/os/Parcelable;

    .line 12
    .line 13
    invoke-super {p0, v0}, Landroidx/appcompat/widget/Toolbar;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p1, Ldefpackage/j74;->p:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/google/android/material/search/SearchBar;->setText(Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/j74;

    .line 2
    .line 3
    invoke-super {p0}, Landroidx/appcompat/widget/Toolbar;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Ldefpackage/k;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchBar;->getText()Ljava/lang/CharSequence;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :goto_0
    iput-object p0, v0, Ldefpackage/j74;->p:Ljava/lang/String;

    .line 23
    .line 24
    return-object v0
.end method

.method public setCenterView(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchBar;->r0:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/google/android/material/search/SearchBar;->r0:Landroid/view/View;

    .line 10
    .line 11
    :cond_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public setDefaultScrollFlagsEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/search/SearchBar;->v0:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchBar;->x()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setElevation(F)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setElevation(F)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/google/android/material/search/SearchBar;->w0:Ldefpackage/fi2;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ldefpackage/fi2;->l(F)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public setHint(I)V
    .locals 0

    .line 7
    iget-object p0, p0, Lcom/google/android/material/search/SearchBar;->k0:Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setHint(I)V

    return-void
.end method

.method public setHint(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchBar;->k0:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setNavigationIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/search/SearchBar;->p0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/search/SearchBar;->s0:Ljava/lang/Integer;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/search/SearchBar;->o0:Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    if-ne p1, v0, :cond_2

    .line 20
    .line 21
    const v0, 0x7f040126

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    const v0, 0x7f040124

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-static {p0, v0}, Ldefpackage/g12;->t(Landroid/view/View;I)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    :goto_1
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 37
    .line 38
    .line 39
    :cond_3
    :goto_2
    invoke-super {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/search/SearchBar;->q0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-super {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    .line 8
    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_1
    const/4 p1, 0x0

    .line 14
    :goto_0
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchBar;->setNavigationIconDecorative(Z)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public setOnLoadAnimationFadeInEnabled(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchBar;->n0:Ldefpackage/hh3;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setStrokeColor(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchBar;->getStrokeColor()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/android/material/search/SearchBar;->w0:Ldefpackage/fi2;

    .line 8
    .line 9
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Ldefpackage/fi2;->q(Landroid/content/res/ColorStateList;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setStrokeWidth(F)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchBar;->getStrokeWidth()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    cmpl-float v0, v0, p1

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lcom/google/android/material/search/SearchBar;->w0:Ldefpackage/fi2;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ldefpackage/fi2;->r(F)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setText(I)V
    .locals 0

    .line 7
    iget-object p0, p0, Lcom/google/android/material/search/SearchBar;->k0:Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public setText(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchBar;->k0:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final x()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v0, v0, Ldefpackage/ze;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ldefpackage/ze;

    .line 14
    .line 15
    iget-boolean p0, p0, Lcom/google/android/material/search/SearchBar;->v0:Z

    .line 16
    .line 17
    const/16 v1, 0x35

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    iget p0, v0, Ldefpackage/ze;->a:I

    .line 22
    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    iput v1, v0, Ldefpackage/ze;->a:I

    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    iget p0, v0, Ldefpackage/ze;->a:I

    .line 29
    .line 30
    if-ne p0, v1, :cond_1

    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    iput p0, v0, Ldefpackage/ze;->a:I

    .line 34
    .line 35
    :cond_1
    return-void
.end method
