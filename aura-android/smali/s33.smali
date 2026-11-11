.class public abstract Ls33;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final n:Ll33;

.field public final o:Lqt;

.field public final p:Lo33;

.field public q:Lno4;

.field public r:Lq33;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 11

    .line 1
    invoke-static {p1, p2, p3, p4}, Lsu3;->H(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    .line 7
    .line 8
    new-instance p1, Lo33;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p1, Lo33;->o:Z

    .line 15
    .line 16
    iput-object p1, p0, Ls33;->p:Lo33;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const/16 v7, 0xc

    .line 23
    .line 24
    const/16 v8, 0xa

    .line 25
    .line 26
    filled-new-array {v7, v8}, [I

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    sget-object v3, Lht3;->J:[I

    .line 31
    .line 32
    move-object v2, p2

    .line 33
    move v4, p3

    .line 34
    move v5, p4

    .line 35
    invoke-static/range {v1 .. v6}, Luc5;->E(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Ljv3;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    new-instance p3, Ll33;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object p4

    .line 45
    invoke-virtual {p0}, Ls33;->getMaxItemCount()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-direct {p3, v1, p4, v3}, Ll33;-><init>(Landroid/content/Context;Ljava/lang/Class;I)V

    .line 50
    .line 51
    .line 52
    iput-object p3, p0, Ls33;->n:Ll33;

    .line 53
    .line 54
    new-instance p4, Lqt;

    .line 55
    .line 56
    invoke-direct {p4, v1}, Lqt;-><init>(Landroid/content/Context;)V

    .line 57
    .line 58
    .line 59
    iput-object p4, p0, Ls33;->o:Lqt;

    .line 60
    .line 61
    iput-object p4, p1, Lo33;->n:Lqt;

    .line 62
    .line 63
    const/4 v3, 0x1

    .line 64
    iput v3, p1, Lo33;->p:I

    .line 65
    .line 66
    invoke-virtual {p4, p1}, Lm33;->setPresenter(Lo33;)V

    .line 67
    .line 68
    .line 69
    iget-object v6, p3, Lqu2;->a:Landroid/content/Context;

    .line 70
    .line 71
    invoke-virtual {p3, p1, v6}, Lqu2;->b(Lgv2;Landroid/content/Context;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    iget-object v6, p1, Lo33;->n:Lqt;

    .line 78
    .line 79
    iput-object p3, v6, Lm33;->R:Lqu2;

    .line 80
    .line 81
    iget-object v6, p2, Ljv3;->o:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v6, Landroid/content/res/TypedArray;

    .line 84
    .line 85
    const/4 v9, 0x6

    .line 86
    invoke-virtual {v6, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    if-eqz v10, :cond_0

    .line 91
    .line 92
    invoke-virtual {p2, v9}, Ljv3;->b(I)Landroid/content/res/ColorStateList;

    .line 93
    .line 94
    .line 95
    move-result-object v9

    .line 96
    invoke-virtual {p4, v9}, Lm33;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_0
    invoke-virtual {p4}, Lm33;->c()Landroid/content/res/ColorStateList;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    invoke-virtual {p4, v9}, Lm33;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 105
    .line 106
    .line 107
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 108
    .line 109
    .line 110
    move-result-object v9

    .line 111
    const v10, 0x7f070596

    .line 112
    .line 113
    .line 114
    invoke-virtual {v9, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 115
    .line 116
    .line 117
    move-result v9

    .line 118
    const/4 v10, 0x5

    .line 119
    invoke-virtual {v6, v10, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 120
    .line 121
    .line 122
    move-result v9

    .line 123
    invoke-virtual {p0, v9}, Ls33;->setItemIconSize(I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v6, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    if-eqz v9, :cond_1

    .line 131
    .line 132
    invoke-virtual {v6, v7, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    invoke-virtual {p0, v9}, Ls33;->setItemTextAppearanceInactive(I)V

    .line 137
    .line 138
    .line 139
    :cond_1
    invoke-virtual {v6, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 140
    .line 141
    .line 142
    move-result v9

    .line 143
    if-eqz v9, :cond_2

    .line 144
    .line 145
    invoke-virtual {v6, v8, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 146
    .line 147
    .line 148
    move-result v8

    .line 149
    invoke-virtual {p0, v8}, Ls33;->setItemTextAppearanceActive(I)V

    .line 150
    .line 151
    .line 152
    :cond_2
    const/16 v8, 0xb

    .line 153
    .line 154
    invoke-virtual {v6, v8, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    invoke-virtual {p0, v8}, Ls33;->setItemTextAppearanceActiveBoldEnabled(Z)V

    .line 159
    .line 160
    .line 161
    const/16 v8, 0xd

    .line 162
    .line 163
    invoke-virtual {v6, v8}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 164
    .line 165
    .line 166
    move-result v9

    .line 167
    if-eqz v9, :cond_3

    .line 168
    .line 169
    invoke-virtual {p2, v8}, Ljv3;->b(I)Landroid/content/res/ColorStateList;

    .line 170
    .line 171
    .line 172
    move-result-object v8

    .line 173
    invoke-virtual {p0, v8}, Ls33;->setItemTextColor(Landroid/content/res/ColorStateList;)V

    .line 174
    .line 175
    .line 176
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 177
    .line 178
    .line 179
    move-result-object v8

    .line 180
    if-eqz v8, :cond_4

    .line 181
    .line 182
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 183
    .line 184
    .line 185
    move-result-object v8

    .line 186
    instance-of v8, v8, Landroid/graphics/drawable/ColorDrawable;

    .line 187
    .line 188
    if-eqz v8, :cond_6

    .line 189
    .line 190
    :cond_4
    invoke-static {v1, v2, v4, v5}, Lbc4;->c(Landroid/content/Context;Landroid/util/AttributeSet;II)Lzc1;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    invoke-virtual {v2}, Lzc1;->a()Lbc4;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    new-instance v4, Lfi2;

    .line 199
    .line 200
    invoke-direct {v4}, Lfi2;-><init>()V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    instance-of v8, v5, Landroid/graphics/drawable/ColorDrawable;

    .line 208
    .line 209
    if-eqz v8, :cond_5

    .line 210
    .line 211
    check-cast v5, Landroid/graphics/drawable/ColorDrawable;

    .line 212
    .line 213
    invoke-virtual {v5}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    invoke-static {v5}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    invoke-virtual {v4, v5}, Lfi2;->m(Landroid/content/res/ColorStateList;)V

    .line 222
    .line 223
    .line 224
    :cond_5
    invoke-virtual {v4, v1}, Lfi2;->j(Landroid/content/Context;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v4, v2}, Lfi2;->setShapeAppearanceModel(Lbc4;)V

    .line 228
    .line 229
    .line 230
    sget-object v2, Lj65;->a:Ljava/util/WeakHashMap;

    .line 231
    .line 232
    invoke-virtual {p0, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 233
    .line 234
    .line 235
    :cond_6
    const/16 v2, 0x8

    .line 236
    .line 237
    invoke-virtual {v6, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    if-eqz v4, :cond_7

    .line 242
    .line 243
    invoke-virtual {v6, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 244
    .line 245
    .line 246
    move-result v2

    .line 247
    invoke-virtual {p0, v2}, Ls33;->setItemPaddingTop(I)V

    .line 248
    .line 249
    .line 250
    :cond_7
    const/4 v2, 0x7

    .line 251
    invoke-virtual {v6, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 252
    .line 253
    .line 254
    move-result v4

    .line 255
    if-eqz v4, :cond_8

    .line 256
    .line 257
    invoke-virtual {v6, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    invoke-virtual {p0, v2}, Ls33;->setItemPaddingBottom(I)V

    .line 262
    .line 263
    .line 264
    :cond_8
    invoke-virtual {v6, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    if-eqz v2, :cond_9

    .line 269
    .line 270
    invoke-virtual {v6, v0, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    invoke-virtual {p0, v2}, Ls33;->setActiveIndicatorLabelPadding(I)V

    .line 275
    .line 276
    .line 277
    :cond_9
    const/4 v2, 0x2

    .line 278
    invoke-virtual {v6, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 279
    .line 280
    .line 281
    move-result v4

    .line 282
    if-eqz v4, :cond_a

    .line 283
    .line 284
    invoke-virtual {v6, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    int-to-float v4, v4

    .line 289
    invoke-virtual {p0, v4}, Ls33;->setElevation(F)V

    .line 290
    .line 291
    .line 292
    :cond_a
    invoke-static {v1, p2, v3}, Lh12;->r(Landroid/content/Context;Ljv3;I)Landroid/content/res/ColorStateList;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 301
    .line 302
    .line 303
    move-result-object v5

    .line 304
    invoke-virtual {v5, v4}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 305
    .line 306
    .line 307
    const/16 v4, 0xe

    .line 308
    .line 309
    const/4 v5, -0x1

    .line 310
    invoke-virtual {v6, v4, v5}, Landroid/content/res/TypedArray;->getInteger(II)I

    .line 311
    .line 312
    .line 313
    move-result v4

    .line 314
    invoke-virtual {p0, v4}, Ls33;->setLabelVisibilityMode(I)V

    .line 315
    .line 316
    .line 317
    const/4 v4, 0x4

    .line 318
    invoke-virtual {v6, v4, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 319
    .line 320
    .line 321
    move-result v5

    .line 322
    if-eqz v5, :cond_b

    .line 323
    .line 324
    invoke-virtual {p4, v5}, Lm33;->setItemBackgroundRes(I)V

    .line 325
    .line 326
    .line 327
    goto :goto_1

    .line 328
    :cond_b
    const/16 v5, 0x9

    .line 329
    .line 330
    invoke-static {v1, p2, v5}, Lh12;->r(Landroid/content/Context;Ljv3;I)Landroid/content/res/ColorStateList;

    .line 331
    .line 332
    .line 333
    move-result-object v5

    .line 334
    invoke-virtual {p0, v5}, Ls33;->setItemRippleColor(Landroid/content/res/ColorStateList;)V

    .line 335
    .line 336
    .line 337
    :goto_1
    const/4 v5, 0x3

    .line 338
    invoke-virtual {v6, v5, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 339
    .line 340
    .line 341
    move-result v8

    .line 342
    if-eqz v8, :cond_c

    .line 343
    .line 344
    invoke-virtual {p0, v3}, Ls33;->setItemActiveIndicatorEnabled(Z)V

    .line 345
    .line 346
    .line 347
    sget-object v9, Lht3;->I:[I

    .line 348
    .line 349
    invoke-virtual {v1, v8, v9}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 350
    .line 351
    .line 352
    move-result-object v8

    .line 353
    invoke-virtual {v8, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 354
    .line 355
    .line 356
    move-result v9

    .line 357
    invoke-virtual {p0, v9}, Ls33;->setItemActiveIndicatorWidth(I)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v8, v0, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 361
    .line 362
    .line 363
    move-result v9

    .line 364
    invoke-virtual {p0, v9}, Ls33;->setItemActiveIndicatorHeight(I)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v8, v5, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    .line 368
    .line 369
    .line 370
    move-result v5

    .line 371
    invoke-virtual {p0, v5}, Ls33;->setItemActiveIndicatorMarginHorizontal(I)V

    .line 372
    .line 373
    .line 374
    invoke-static {v1, v8, v2}, Lh12;->s(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    invoke-virtual {p0, v2}, Ls33;->setItemActiveIndicatorColor(Landroid/content/res/ColorStateList;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v8, v4, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 382
    .line 383
    .line 384
    move-result v2

    .line 385
    invoke-static {v1, v2, v0}, Lbc4;->a(Landroid/content/Context;II)Lzc1;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    invoke-virtual {v1}, Lzc1;->a()Lbc4;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    invoke-virtual {p0, v1}, Ls33;->setItemActiveIndicatorShapeAppearance(Lbc4;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v8}, Landroid/content/res/TypedArray;->recycle()V

    .line 397
    .line 398
    .line 399
    :cond_c
    const/16 v1, 0xf

    .line 400
    .line 401
    invoke-virtual {v6, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 402
    .line 403
    .line 404
    move-result v2

    .line 405
    if-eqz v2, :cond_d

    .line 406
    .line 407
    invoke-virtual {v6, v1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 408
    .line 409
    .line 410
    move-result v1

    .line 411
    iput-boolean v3, p1, Lo33;->o:Z

    .line 412
    .line 413
    invoke-direct {p0}, Ls33;->getMenuInflater()Landroid/view/MenuInflater;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    invoke-virtual {v2, v1, p3}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 418
    .line 419
    .line 420
    iput-boolean v0, p1, Lo33;->o:Z

    .line 421
    .line 422
    invoke-virtual {p1, v3}, Lo33;->c(Z)V

    .line 423
    .line 424
    .line 425
    :cond_d
    invoke-virtual {p2}, Ljv3;->g()V

    .line 426
    .line 427
    .line 428
    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 429
    .line 430
    .line 431
    new-instance p1, Lsi1;

    .line 432
    .line 433
    check-cast p0, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 434
    .line 435
    invoke-direct {p1, v7, p0}, Lsi1;-><init>(ILjava/lang/Object;)V

    .line 436
    .line 437
    .line 438
    iput-object p1, p3, Lqu2;->e:Lou2;

    .line 439
    .line 440
    return-void
.end method

.method private getMenuInflater()Landroid/view/MenuInflater;
    .locals 2

    .line 1
    iget-object v0, p0, Ls33;->q:Lno4;

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
    iput-object v0, p0, Ls33;->q:Lno4;

    .line 15
    .line 16
    :cond_0
    iget-object p0, p0, Ls33;->q:Lno4;

    .line 17
    .line 18
    return-object p0
.end method


# virtual methods
.method public getActiveIndicatorLabelPadding()I
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm33;->getActiveIndicatorLabelPadding()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getItemActiveIndicatorColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm33;->getItemActiveIndicatorColor()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getItemActiveIndicatorHeight()I
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm33;->getItemActiveIndicatorHeight()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getItemActiveIndicatorMarginHorizontal()I
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm33;->getItemActiveIndicatorMarginHorizontal()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getItemActiveIndicatorShapeAppearance()Lbc4;
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm33;->getItemActiveIndicatorShapeAppearance()Lbc4;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getItemActiveIndicatorWidth()I
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm33;->getItemActiveIndicatorWidth()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getItemBackground()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm33;->getItemBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getItemBackgroundResource()I
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm33;->getItemBackgroundRes()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getItemIconSize()I
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm33;->getItemIconSize()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getItemIconTintList()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm33;->getIconTintList()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getItemPaddingBottom()I
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm33;->getItemPaddingBottom()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getItemPaddingTop()I
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm33;->getItemPaddingTop()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getItemRippleColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm33;->getItemRippleColor()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getItemTextAppearanceActive()I
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm33;->getItemTextAppearanceActive()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getItemTextAppearanceInactive()I
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm33;->getItemTextAppearanceInactive()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getItemTextColor()Landroid/content/res/ColorStateList;
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm33;->getItemTextColor()Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getLabelVisibilityMode()I
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm33;->getLabelVisibilityMode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public abstract getMaxItemCount()I
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->n:Ll33;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMenuView()Liv2;
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPresenter()Lo33;
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->p:Lo33;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSelectedItemId()I
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0}, Lm33;->getSelectedItemId()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lji2;->P(Landroid/view/ViewGroup;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lr33;

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
    check-cast p1, Lr33;

    .line 10
    .line 11
    iget-object v0, p1, Lk;->n:Landroid/os/Parcelable;

    .line 12
    .line 13
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Ls33;->n:Ll33;

    .line 17
    .line 18
    iget-object p1, p1, Lr33;->p:Landroid/os/Bundle;

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
    new-instance v1, Lr33;

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
    iput-object v0, v1, Lr33;->p:Landroid/os/Bundle;

    .line 16
    .line 17
    iget-object p0, p0, Ls33;->n:Ll33;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lqu2;->v(Landroid/os/Bundle;)V

    .line 20
    .line 21
    .line 22
    return-object v1
.end method

.method public setActiveIndicatorLabelPadding(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lm33;->setActiveIndicatorLabelPadding(I)V

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
    invoke-static {p0, p1}, Lji2;->N(Landroid/view/ViewGroup;F)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setItemActiveIndicatorColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lm33;->setItemActiveIndicatorColor(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorEnabled(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lm33;->setItemActiveIndicatorEnabled(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorHeight(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lm33;->setItemActiveIndicatorHeight(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorMarginHorizontal(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lm33;->setItemActiveIndicatorMarginHorizontal(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorShapeAppearance(Lbc4;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lm33;->setItemActiveIndicatorShapeAppearance(Lbc4;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemActiveIndicatorWidth(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lm33;->setItemActiveIndicatorWidth(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lm33;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemBackgroundResource(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lm33;->setItemBackgroundRes(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemIconSize(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lm33;->setItemIconSize(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemIconSizeRes(I)V
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
    invoke-virtual {p0, p1}, Ls33;->setItemIconSize(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setItemIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lm33;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemPaddingBottom(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lm33;->setItemPaddingBottom(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemPaddingTop(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lm33;->setItemPaddingTop(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemRippleColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lm33;->setItemRippleColor(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemTextAppearanceActive(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lm33;->setItemTextAppearanceActive(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemTextAppearanceActiveBoldEnabled(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lm33;->setItemTextAppearanceActiveBoldEnabled(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemTextAppearanceInactive(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lm33;->setItemTextAppearanceInactive(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setItemTextColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lm33;->setItemTextColor(Landroid/content/res/ColorStateList;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setLabelVisibilityMode(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Ls33;->o:Lqt;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm33;->getLabelVisibilityMode()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eq v1, p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lm33;->setLabelVisibilityMode(I)V

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Ls33;->p:Lo33;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    invoke-virtual {p0, p1}, Lo33;->c(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public setOnItemReselectedListener(Lp33;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setOnItemSelectedListener(Lq33;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls33;->r:Lq33;

    .line 2
    .line 3
    return-void
.end method

.method public setSelectedItemId(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Ls33;->n:Ll33;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lqu2;->findItem(I)Landroid/view/MenuItem;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Ls33;->p:Lo33;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, p0, v1}, Lqu2;->q(Landroid/view/MenuItem;Lgv2;I)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    invoke-interface {p1, p0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method
