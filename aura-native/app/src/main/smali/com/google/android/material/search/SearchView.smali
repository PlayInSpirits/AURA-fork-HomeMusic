.class public Lcom/google/android/material/search/SearchView;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/ce0;
.implements Ldefpackage/zg2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/search/SearchView$Behavior;
    }
.end annotation


# static fields
.field public static final synthetic Q:I


# instance fields
.field public final A:Z

.field public final B:Ldefpackage/lo;

.field public final C:Ldefpackage/qp4;

.field public final D:Z

.field public final E:Ldefpackage/nz0;

.field public final F:Ljava/util/LinkedHashSet;

.field public G:Lcom/google/android/material/search/SearchBar;

.field public H:I

.field public I:Z

.field public J:Z

.field public K:Z

.field public final L:I

.field public M:Z

.field public N:Z

.field public O:Ldefpackage/y74;

.field public P:Ljava/util/HashMap;

.field public final n:Landroid/view/View;

.field public final o:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

.field public final p:Landroid/view/View;

.field public final q:Landroid/view/View;

.field public final r:Landroid/widget/FrameLayout;

.field public final s:Landroid/widget/FrameLayout;

.field public final t:Lcom/google/android/material/appbar/MaterialToolbar;

.field public final u:Landroidx/appcompat/widget/Toolbar;

.field public final v:Landroid/widget/TextView;

.field public final w:Landroid/widget/EditText;

.field public final x:Landroid/widget/ImageButton;

.field public final y:Landroid/view/View;

.field public final z:Lcom/google/android/material/internal/TouchObserverFrameLayout;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 457
    invoke-direct {p0, p1, v0}, Lcom/google/android/material/search/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f040354

    .line 456
    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/material/search/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 17

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
    const v1, 0x7f140446

    .line 8
    .line 9
    .line 10
    move-object/from16 v3, p1

    .line 11
    .line 12
    invoke-static {v3, v2, v4, v1}, Ldefpackage/su3;->H(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-direct {v0, v1, v2, v4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 17
    .line 18
    .line 19
    new-instance v1, Ldefpackage/qp4;

    .line 20
    .line 21
    invoke-direct {v1, v0, v0}, Ldefpackage/qp4;-><init>(Ldefpackage/zg2;Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    iput-object v1, v0, Lcom/google/android/material/search/SearchView;->C:Ldefpackage/qp4;

    .line 25
    .line 26
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v1, v0, Lcom/google/android/material/search/SearchView;->F:Ljava/util/LinkedHashSet;

    .line 32
    .line 33
    const/16 v7, 0x10

    .line 34
    .line 35
    iput v7, v0, Lcom/google/android/material/search/SearchView;->H:I

    .line 36
    .line 37
    sget-object v1, Ldefpackage/y74;->o:Ldefpackage/y74;

    .line 38
    .line 39
    iput-object v1, v0, Lcom/google/android/material/search/SearchView;->O:Ldefpackage/y74;

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const/4 v8, 0x0

    .line 46
    new-array v6, v8, [I

    .line 47
    .line 48
    sget-object v3, Ldefpackage/ht3;->O:[I

    .line 49
    .line 50
    const v5, 0x7f140446

    .line 51
    .line 52
    .line 53
    invoke-static/range {v1 .. v6}, Ldefpackage/uc5;->D(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    const/16 v3, 0xb

    .line 58
    .line 59
    invoke-virtual {v2, v3, v8}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    iput v3, v0, Lcom/google/android/material/search/SearchView;->L:I

    .line 64
    .line 65
    const/4 v3, -0x1

    .line 66
    invoke-virtual {v2, v7, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-virtual {v2, v8, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    const/4 v6, 0x3

    .line 75
    invoke-virtual {v2, v6}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    const/4 v7, 0x4

    .line 80
    invoke-virtual {v2, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    const/16 v10, 0x18

    .line 85
    .line 86
    invoke-virtual {v2, v10}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v10

    .line 90
    const/16 v11, 0x1b

    .line 91
    .line 92
    invoke-virtual {v2, v11, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 93
    .line 94
    .line 95
    move-result v11

    .line 96
    const/16 v12, 0x8

    .line 97
    .line 98
    const/4 v13, 0x1

    .line 99
    invoke-virtual {v2, v12, v13}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    iput-boolean v12, v0, Lcom/google/android/material/search/SearchView;->I:Z

    .line 104
    .line 105
    const/4 v12, 0x7

    .line 106
    invoke-virtual {v2, v12, v13}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 107
    .line 108
    .line 109
    move-result v12

    .line 110
    iput-boolean v12, v0, Lcom/google/android/material/search/SearchView;->J:Z

    .line 111
    .line 112
    const/16 v12, 0x11

    .line 113
    .line 114
    invoke-virtual {v2, v12, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 115
    .line 116
    .line 117
    move-result v12

    .line 118
    const/16 v14, 0x9

    .line 119
    .line 120
    invoke-virtual {v2, v14, v13}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 121
    .line 122
    .line 123
    move-result v15

    .line 124
    iput-boolean v15, v0, Lcom/google/android/material/search/SearchView;->K:Z

    .line 125
    .line 126
    const/16 v15, 0xa

    .line 127
    .line 128
    invoke-virtual {v2, v15, v13}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 129
    .line 130
    .line 131
    move-result v15

    .line 132
    iput-boolean v15, v0, Lcom/google/android/material/search/SearchView;->D:Z

    .line 133
    .line 134
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 135
    .line 136
    .line 137
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    const v15, 0x7f0d0104

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v15, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 145
    .line 146
    .line 147
    iput-boolean v13, v0, Lcom/google/android/material/search/SearchView;->A:Z

    .line 148
    .line 149
    const v2, 0x7f0a043e

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    iput-object v2, v0, Lcom/google/android/material/search/SearchView;->n:Landroid/view/View;

    .line 157
    .line 158
    const v2, 0x7f0a043d

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    check-cast v2, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 166
    .line 167
    iput-object v2, v0, Lcom/google/android/material/search/SearchView;->o:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 168
    .line 169
    const v13, 0x7f0a0436

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 173
    .line 174
    .line 175
    move-result-object v13

    .line 176
    iput-object v13, v0, Lcom/google/android/material/search/SearchView;->p:Landroid/view/View;

    .line 177
    .line 178
    const v13, 0x7f0a0440

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 182
    .line 183
    .line 184
    move-result-object v13

    .line 185
    iput-object v13, v0, Lcom/google/android/material/search/SearchView;->q:Landroid/view/View;

    .line 186
    .line 187
    const v15, 0x7f0a043c

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 191
    .line 192
    .line 193
    move-result-object v15

    .line 194
    check-cast v15, Landroid/widget/FrameLayout;

    .line 195
    .line 196
    iput-object v15, v0, Lcom/google/android/material/search/SearchView;->r:Landroid/widget/FrameLayout;

    .line 197
    .line 198
    const v15, 0x7f0a0442

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 202
    .line 203
    .line 204
    move-result-object v15

    .line 205
    check-cast v15, Landroid/widget/FrameLayout;

    .line 206
    .line 207
    iput-object v15, v0, Lcom/google/android/material/search/SearchView;->s:Landroid/widget/FrameLayout;

    .line 208
    .line 209
    const v15, 0x7f0a0441

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 213
    .line 214
    .line 215
    move-result-object v15

    .line 216
    check-cast v15, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 217
    .line 218
    iput-object v15, v0, Lcom/google/android/material/search/SearchView;->t:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 219
    .line 220
    const v14, 0x7f0a043a

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 224
    .line 225
    .line 226
    move-result-object v14

    .line 227
    check-cast v14, Landroidx/appcompat/widget/Toolbar;

    .line 228
    .line 229
    iput-object v14, v0, Lcom/google/android/material/search/SearchView;->u:Landroidx/appcompat/widget/Toolbar;

    .line 230
    .line 231
    const v14, 0x7f0a043f

    .line 232
    .line 233
    .line 234
    invoke-virtual {v0, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 235
    .line 236
    .line 237
    move-result-object v14

    .line 238
    check-cast v14, Landroid/widget/TextView;

    .line 239
    .line 240
    iput-object v14, v0, Lcom/google/android/material/search/SearchView;->v:Landroid/widget/TextView;

    .line 241
    .line 242
    const v14, 0x7f0a043b

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 246
    .line 247
    .line 248
    move-result-object v14

    .line 249
    check-cast v14, Landroid/widget/EditText;

    .line 250
    .line 251
    iput-object v14, v0, Lcom/google/android/material/search/SearchView;->w:Landroid/widget/EditText;

    .line 252
    .line 253
    const v7, 0x7f0a0437

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 257
    .line 258
    .line 259
    move-result-object v7

    .line 260
    check-cast v7, Landroid/widget/ImageButton;

    .line 261
    .line 262
    iput-object v7, v0, Lcom/google/android/material/search/SearchView;->x:Landroid/widget/ImageButton;

    .line 263
    .line 264
    const v8, 0x7f0a0439

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 268
    .line 269
    .line 270
    move-result-object v8

    .line 271
    iput-object v8, v0, Lcom/google/android/material/search/SearchView;->y:Landroid/view/View;

    .line 272
    .line 273
    const v3, 0x7f0a0438

    .line 274
    .line 275
    .line 276
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 277
    .line 278
    .line 279
    move-result-object v3

    .line 280
    check-cast v3, Lcom/google/android/material/internal/TouchObserverFrameLayout;

    .line 281
    .line 282
    iput-object v3, v0, Lcom/google/android/material/search/SearchView;->z:Lcom/google/android/material/internal/TouchObserverFrameLayout;

    .line 283
    .line 284
    move/from16 v16, v11

    .line 285
    .line 286
    new-instance v11, Ldefpackage/lo;

    .line 287
    .line 288
    invoke-direct {v11, v0}, Ldefpackage/lo;-><init>(Lcom/google/android/material/search/SearchView;)V

    .line 289
    .line 290
    .line 291
    iput-object v11, v0, Lcom/google/android/material/search/SearchView;->B:Ldefpackage/lo;

    .line 292
    .line 293
    new-instance v11, Ldefpackage/nz0;

    .line 294
    .line 295
    invoke-direct {v11, v1}, Ldefpackage/nz0;-><init>(Landroid/content/Context;)V

    .line 296
    .line 297
    .line 298
    iput-object v11, v0, Lcom/google/android/material/search/SearchView;->E:Ldefpackage/nz0;

    .line 299
    .line 300
    new-instance v1, Ldefpackage/p74;

    .line 301
    .line 302
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 306
    .line 307
    .line 308
    invoke-direct {v0}, Lcom/google/android/material/search/SearchView;->getOverlayElevation()F

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    invoke-direct {v0, v1}, Lcom/google/android/material/search/SearchView;->setUpBackgroundViewElevationOverlay(F)V

    .line 313
    .line 314
    .line 315
    invoke-direct {v0, v4}, Lcom/google/android/material/search/SearchView;->setUpHeaderLayout(I)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0, v10}, Lcom/google/android/material/search/SearchView;->setSearchPrefixText(Ljava/lang/CharSequence;)V

    .line 319
    .line 320
    .line 321
    const/4 v1, -0x1

    .line 322
    if-eq v5, v1, :cond_0

    .line 323
    .line 324
    invoke-virtual {v14, v5}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 325
    .line 326
    .line 327
    :cond_0
    invoke-virtual {v14, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v14, v9}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 331
    .line 332
    .line 333
    if-eqz v12, :cond_1

    .line 334
    .line 335
    const/4 v1, 0x0

    .line 336
    invoke-virtual {v15, v1}, Lcom/google/android/material/appbar/MaterialToolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 337
    .line 338
    .line 339
    goto :goto_0

    .line 340
    :cond_1
    new-instance v1, Ldefpackage/n74;

    .line 341
    .line 342
    const/4 v2, 0x2

    .line 343
    invoke-direct {v1, v0, v2}, Ldefpackage/n74;-><init>(Lcom/google/android/material/search/SearchView;I)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v15, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 347
    .line 348
    .line 349
    if-eqz v16, :cond_3

    .line 350
    .line 351
    new-instance v1, Ldefpackage/dw0;

    .line 352
    .line 353
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 354
    .line 355
    .line 356
    move-result-object v2

    .line 357
    invoke-direct {v1, v2}, Ldefpackage/dw0;-><init>(Landroid/content/Context;)V

    .line 358
    .line 359
    .line 360
    const v2, 0x7f040124

    .line 361
    .line 362
    .line 363
    invoke-static {v0, v2}, Ldefpackage/g12;->t(Landroid/view/View;I)I

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    iget-object v4, v1, Ldefpackage/dw0;->a:Landroid/graphics/Paint;

    .line 368
    .line 369
    invoke-virtual {v4}, Landroid/graphics/Paint;->getColor()I

    .line 370
    .line 371
    .line 372
    move-result v5

    .line 373
    if-eq v2, v5, :cond_2

    .line 374
    .line 375
    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 379
    .line 380
    .line 381
    :cond_2
    invoke-virtual {v15, v1}, Lcom/google/android/material/appbar/MaterialToolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 382
    .line 383
    .line 384
    :cond_3
    :goto_0
    new-instance v1, Ldefpackage/n74;

    .line 385
    .line 386
    const/4 v2, 0x0

    .line 387
    invoke-direct {v1, v0, v2}, Ldefpackage/n74;-><init>(Lcom/google/android/material/search/SearchView;I)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v7, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 391
    .line 392
    .line 393
    new-instance v1, Ldefpackage/pn1;

    .line 394
    .line 395
    const/4 v2, 0x4

    .line 396
    invoke-direct {v1, v2, v0}, Ldefpackage/pn1;-><init>(ILjava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v14, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 400
    .line 401
    .line 402
    new-instance v1, Ldefpackage/s7;

    .line 403
    .line 404
    const/16 v2, 0x9

    .line 405
    .line 406
    invoke-direct {v1, v2, v0}, Ldefpackage/s7;-><init>(ILjava/lang/Object;)V

    .line 407
    .line 408
    .line 409
    invoke-virtual {v3, v1}, Lcom/google/android/material/internal/TouchObserverFrameLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 410
    .line 411
    .line 412
    new-instance v1, Ldefpackage/o74;

    .line 413
    .line 414
    invoke-direct {v1, v0}, Ldefpackage/o74;-><init>(Lcom/google/android/material/search/SearchView;)V

    .line 415
    .line 416
    .line 417
    invoke-static {v15, v1}, Ldefpackage/vr1;->k(Landroid/view/View;Ldefpackage/b85;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 425
    .line 426
    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 427
    .line 428
    iget v3, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 429
    .line 430
    new-instance v4, Ldefpackage/zl2;

    .line 431
    .line 432
    invoke-direct {v4, v2, v3, v1}, Ldefpackage/zl2;-><init>(IILjava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    sget-object v1, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 436
    .line 437
    invoke-static {v8, v4}, Ldefpackage/a65;->c(Landroid/view/View;Ldefpackage/r83;)V

    .line 438
    .line 439
    .line 440
    invoke-direct {v0}, Lcom/google/android/material/search/SearchView;->getStatusBarHeight()I

    .line 441
    .line 442
    .line 443
    move-result v1

    .line 444
    invoke-direct {v0, v1}, Lcom/google/android/material/search/SearchView;->setUpStatusBarSpacer(I)V

    .line 445
    .line 446
    .line 447
    new-instance v1, Ldefpackage/o74;

    .line 448
    .line 449
    invoke-direct {v1, v0}, Ldefpackage/o74;-><init>(Lcom/google/android/material/search/SearchView;)V

    .line 450
    .line 451
    .line 452
    invoke-static {v13, v1}, Ldefpackage/a65;->c(Landroid/view/View;Ldefpackage/r83;)V

    .line 453
    .line 454
    .line 455
    return-void
.end method

.method public static synthetic e(Lcom/google/android/material/search/SearchView;Ldefpackage/pb5;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ldefpackage/pb5;->d()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchView;->setUpStatusBarSpacer(I)V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Lcom/google/android/material/search/SearchView;->N:Z

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    if-lez p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchView;->setStatusBarSpacerEnabledInternal(Z)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method

.method private getActivityWindow()Landroid/view/Window;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    instance-of v0, p0, Landroid/app/Activity;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    check-cast p0, Landroid/app/Activity;

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    check-cast p0, Landroid/content/ContextWrapper;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move-object p0, v1

    .line 25
    :goto_1
    if-nez p0, :cond_2

    .line 26
    .line 27
    return-object v1

    .line 28
    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method private getOverlayElevation()F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->G:Lcom/google/android/material/search/SearchBar;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/material/search/SearchBar;->getCompatElevation()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const v0, 0x7f0704a1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimension(I)F

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method private getStatusBarHeight()I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "dimen"

    .line 6
    .line 7
    const-string v2, "android"

    .line 8
    .line 9
    const-string v3, "status_bar_height"

    .line 10
    .line 11
    invoke-virtual {v0, v3, v1, v2}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method private setStatusBarSpacerEnabledInternal(Z)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/16 p1, 0x8

    .line 6
    .line 7
    :goto_0
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->q:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private setUpBackgroundViewElevationOverlay(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->E:Ldefpackage/nz0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lcom/google/android/material/search/SearchView;->p:Landroid/view/View;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget p0, p0, Lcom/google/android/material/search/SearchView;->L:I

    .line 11
    .line 12
    invoke-virtual {v0, p0, p1}, Ldefpackage/nz0;->b(IF)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-virtual {v1, p0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 17
    .line 18
    .line 19
    :cond_1
    :goto_0
    return-void
.end method

.method private setUpHeaderLayout(I)V
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p1, v0, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->r:Landroid/widget/FrameLayout;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, p1, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method private setUpStatusBarSpacer(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->q:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 8
    .line 9
    if-eq v0, p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->B:Ldefpackage/lo;

    .line 9
    .line 10
    iget-object v1, v0, Ldefpackage/lo;->m:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ldefpackage/ci2;

    .line 13
    .line 14
    iget-object v2, v1, Ldefpackage/yg2;->f:Ldefpackage/oo;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    iput-object v3, v1, Ldefpackage/yg2;->f:Ldefpackage/oo;

    .line 18
    .line 19
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 20
    .line 21
    const/16 v4, 0x22

    .line 22
    .line 23
    if-lt v1, v4, :cond_2

    .line 24
    .line 25
    iget-object v1, p0, Lcom/google/android/material/search/SearchView;->G:Lcom/google/android/material/search/SearchBar;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0}, Ldefpackage/lo;->j()Landroid/animation/AnimatorSet;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->getTotalDuration()J

    .line 36
    .line 37
    .line 38
    move-result-wide v1

    .line 39
    iget-object p0, v0, Ldefpackage/lo;->m:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Ldefpackage/ci2;

    .line 42
    .line 43
    iget-object v4, v0, Ldefpackage/lo;->o:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v4, Lcom/google/android/material/search/SearchBar;

    .line 46
    .line 47
    invoke-virtual {p0, v4}, Ldefpackage/ci2;->b(Landroid/view/View;)Landroid/animation/AnimatorSet;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v4, v1, v2}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4}, Landroid/animation/AnimatorSet;->start()V

    .line 55
    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    iput v1, p0, Ldefpackage/ci2;->i:F

    .line 59
    .line 60
    iput-object v3, p0, Ldefpackage/ci2;->j:Landroid/graphics/Rect;

    .line 61
    .line 62
    iput-object v3, p0, Ldefpackage/ci2;->k:Landroid/graphics/Rect;

    .line 63
    .line 64
    iget-object p0, v0, Ldefpackage/lo;->n:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p0, Landroid/animation/AnimatorSet;

    .line 67
    .line 68
    if-eqz p0, :cond_1

    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    invoke-virtual {v0, p0}, Ldefpackage/lo;->c(Z)Landroid/animation/AnimatorSet;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->start()V

    .line 76
    .line 77
    .line 78
    iget-object p0, v0, Ldefpackage/lo;->n:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p0, Landroid/animation/AnimatorSet;

    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->resume()V

    .line 83
    .line 84
    .line 85
    :cond_1
    iput-object v3, v0, Ldefpackage/lo;->n:Ljava/lang/Object;

    .line 86
    .line 87
    return-void

    .line 88
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->g()V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/search/SearchView;->A:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->z:Lcom/google/android/material/internal/TouchObserverFrameLayout;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final b(Ldefpackage/oo;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/android/material/search/SearchView;->i()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_c

    .line 10
    .line 11
    iget-object v2, v0, Lcom/google/android/material/search/SearchView;->G:Lcom/google/android/material/search/SearchBar;

    .line 12
    .line 13
    if-eqz v2, :cond_c

    .line 14
    .line 15
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 v3, 0x22

    .line 18
    .line 19
    if-ge v2, v3, :cond_0

    .line 20
    .line 21
    goto/16 :goto_3

    .line 22
    .line 23
    :cond_0
    iget-object v0, v0, Lcom/google/android/material/search/SearchView;->B:Ldefpackage/lo;

    .line 24
    .line 25
    iget-object v2, v0, Ldefpackage/lo;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v2, Lcom/google/android/material/search/SearchView;

    .line 28
    .line 29
    iget v3, v1, Ldefpackage/oo;->c:F

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    cmpg-float v5, v3, v4

    .line 33
    .line 34
    if-gtz v5, :cond_1

    .line 35
    .line 36
    goto/16 :goto_3

    .line 37
    .line 38
    :cond_1
    iget-object v5, v0, Ldefpackage/lo;->m:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v5, Ldefpackage/ci2;

    .line 41
    .line 42
    iget-object v6, v0, Ldefpackage/lo;->o:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v6, Lcom/google/android/material/search/SearchBar;

    .line 45
    .line 46
    invoke-virtual {v6}, Lcom/google/android/material/search/SearchBar;->getCornerSize()F

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    iget-object v8, v5, Ldefpackage/yg2;->f:Ldefpackage/oo;

    .line 51
    .line 52
    if-nez v8, :cond_2

    .line 53
    .line 54
    const-string v8, "MaterialBackHelper"

    .line 55
    .line 56
    const-string v9, "Must call startBackProgress() before updateBackProgress()"

    .line 57
    .line 58
    invoke-static {v8, v9}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    :cond_2
    iget-object v8, v5, Ldefpackage/yg2;->f:Ldefpackage/oo;

    .line 62
    .line 63
    iput-object v1, v5, Ldefpackage/yg2;->f:Ldefpackage/oo;

    .line 64
    .line 65
    const/4 v9, 0x0

    .line 66
    if-nez v8, :cond_3

    .line 67
    .line 68
    goto/16 :goto_2

    .line 69
    .line 70
    :cond_3
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    const/4 v10, 0x4

    .line 75
    if-eq v8, v10, :cond_4

    .line 76
    .line 77
    invoke-virtual {v6, v10}, Landroid/view/View;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    :cond_4
    iget v6, v1, Ldefpackage/oo;->d:I

    .line 81
    .line 82
    const/4 v8, 0x1

    .line 83
    if-nez v6, :cond_5

    .line 84
    .line 85
    move v6, v8

    .line 86
    goto :goto_0

    .line 87
    :cond_5
    move v6, v9

    .line 88
    :goto_0
    iget v1, v1, Ldefpackage/oo;->b:F

    .line 89
    .line 90
    iget v10, v5, Ldefpackage/ci2;->g:F

    .line 91
    .line 92
    iget-object v11, v5, Ldefpackage/yg2;->b:Landroid/view/View;

    .line 93
    .line 94
    invoke-virtual {v11}, Landroid/view/View;->getWidth()I

    .line 95
    .line 96
    .line 97
    move-result v12

    .line 98
    int-to-float v12, v12

    .line 99
    invoke-virtual {v11}, Landroid/view/View;->getHeight()I

    .line 100
    .line 101
    .line 102
    move-result v13

    .line 103
    int-to-float v13, v13

    .line 104
    cmpg-float v14, v12, v4

    .line 105
    .line 106
    if-lez v14, :cond_8

    .line 107
    .line 108
    cmpg-float v14, v13, v4

    .line 109
    .line 110
    if-gtz v14, :cond_6

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_6
    const/high16 v14, 0x3f800000    # 1.0f

    .line 114
    .line 115
    const v15, 0x3f666666    # 0.9f

    .line 116
    .line 117
    .line 118
    invoke-static {v14, v15, v3}, Ldefpackage/yd;->a(FFF)F

    .line 119
    .line 120
    .line 121
    move-result v14

    .line 122
    mul-float/2addr v15, v12

    .line 123
    sub-float/2addr v12, v15

    .line 124
    const/high16 v15, 0x40000000    # 2.0f

    .line 125
    .line 126
    div-float/2addr v12, v15

    .line 127
    sub-float/2addr v12, v10

    .line 128
    invoke-static {v4, v12}, Ljava/lang/Math;->max(FF)F

    .line 129
    .line 130
    .line 131
    move-result v12

    .line 132
    invoke-static {v4, v12, v3}, Ldefpackage/yd;->a(FFF)F

    .line 133
    .line 134
    .line 135
    move-result v12

    .line 136
    if-eqz v6, :cond_7

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_7
    const/4 v8, -0x1

    .line 140
    :goto_1
    int-to-float v6, v8

    .line 141
    mul-float/2addr v12, v6

    .line 142
    mul-float v6, v14, v13

    .line 143
    .line 144
    sub-float v6, v13, v6

    .line 145
    .line 146
    div-float/2addr v6, v15

    .line 147
    sub-float/2addr v6, v10

    .line 148
    invoke-static {v4, v6}, Ljava/lang/Math;->max(FF)F

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    iget v8, v5, Ldefpackage/ci2;->h:F

    .line 153
    .line 154
    invoke-static {v6, v8}, Ljava/lang/Math;->min(FF)F

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    iget v8, v5, Ldefpackage/ci2;->i:F

    .line 159
    .line 160
    sub-float/2addr v1, v8

    .line 161
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    div-float/2addr v8, v13

    .line 166
    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    invoke-static {v4, v6, v8}, Ldefpackage/yd;->a(FFF)F

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    mul-float/2addr v4, v1

    .line 175
    invoke-virtual {v11, v14}, Landroid/view/View;->setScaleX(F)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v11, v14}, Landroid/view/View;->setScaleY(F)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v11, v12}, Landroid/view/View;->setTranslationX(F)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v11, v4}, Landroid/view/View;->setTranslationY(F)V

    .line 185
    .line 186
    .line 187
    instance-of v1, v11, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 188
    .line 189
    if-eqz v1, :cond_8

    .line 190
    .line 191
    move-object v12, v11

    .line 192
    check-cast v12, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 193
    .line 194
    invoke-virtual {v5}, Ldefpackage/ci2;->c()I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    int-to-float v1, v1

    .line 199
    invoke-static {v1, v7, v3}, Ldefpackage/yd;->a(FFF)F

    .line 200
    .line 201
    .line 202
    move-result v17

    .line 203
    invoke-virtual {v12}, Landroid/view/View;->getLeft()I

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    int-to-float v13, v1

    .line 208
    invoke-virtual {v12}, Landroid/view/View;->getTop()I

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    int-to-float v14, v1

    .line 213
    invoke-virtual {v12}, Landroid/view/View;->getRight()I

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    int-to-float v15, v1

    .line 218
    invoke-virtual {v12}, Landroid/view/View;->getBottom()I

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    int-to-float v1, v1

    .line 223
    move/from16 v16, v1

    .line 224
    .line 225
    invoke-virtual/range {v12 .. v17}, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;->a(FFFFF)V

    .line 226
    .line 227
    .line 228
    :cond_8
    :goto_2
    iget-object v1, v0, Ldefpackage/lo;->n:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v1, Landroid/animation/AnimatorSet;

    .line 231
    .line 232
    if-nez v1, :cond_b

    .line 233
    .line 234
    invoke-virtual {v2}, Lcom/google/android/material/search/SearchView;->h()Z

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    if-eqz v1, :cond_9

    .line 239
    .line 240
    invoke-virtual {v2}, Lcom/google/android/material/search/SearchView;->f()V

    .line 241
    .line 242
    .line 243
    :cond_9
    iget-boolean v1, v2, Lcom/google/android/material/search/SearchView;->I:Z

    .line 244
    .line 245
    if-nez v1, :cond_a

    .line 246
    .line 247
    goto :goto_3

    .line 248
    :cond_a
    new-instance v1, Landroid/animation/AnimatorSet;

    .line 249
    .line 250
    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, v1}, Ldefpackage/lo;->b(Landroid/animation/AnimatorSet;)V

    .line 254
    .line 255
    .line 256
    const-wide/16 v2, 0xfa

    .line 257
    .line 258
    invoke-virtual {v1, v2, v3}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 259
    .line 260
    .line 261
    sget-object v2, Ldefpackage/yd;->b:Ldefpackage/a61;

    .line 262
    .line 263
    invoke-static {v9, v2}, Ldefpackage/d24;->a(ZLandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    invoke-virtual {v1, v2}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 268
    .line 269
    .line 270
    iput-object v1, v0, Ldefpackage/lo;->n:Ljava/lang/Object;

    .line 271
    .line 272
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->start()V

    .line 273
    .line 274
    .line 275
    iget-object v0, v0, Ldefpackage/lo;->n:Ljava/lang/Object;

    .line 276
    .line 277
    check-cast v0, Landroid/animation/AnimatorSet;

    .line 278
    .line 279
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->pause()V

    .line 280
    .line 281
    .line 282
    return-void

    .line 283
    :cond_b
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->getDuration()J

    .line 284
    .line 285
    .line 286
    move-result-wide v4

    .line 287
    long-to-float v0, v4

    .line 288
    mul-float/2addr v3, v0

    .line 289
    float-to-long v2, v3

    .line 290
    invoke-static {v1, v2, v3}, Ldefpackage/rg3;->g(Landroid/animation/AnimatorSet;J)V

    .line 291
    .line 292
    .line 293
    :cond_c
    :goto_3
    return-void
.end method

.method public final c(Ldefpackage/oo;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->G:Lcom/google/android/material/search/SearchBar;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->B:Ldefpackage/lo;

    .line 13
    .line 14
    iget-object v0, p0, Ldefpackage/lo;->m:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ldefpackage/ci2;

    .line 17
    .line 18
    iget-object p0, p0, Ldefpackage/lo;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lcom/google/android/material/search/SearchBar;

    .line 21
    .line 22
    iput-object p1, v0, Ldefpackage/yg2;->f:Ldefpackage/oo;

    .line 23
    .line 24
    iget p1, p1, Ldefpackage/oo;->b:F

    .line 25
    .line 26
    iget-object v1, v0, Ldefpackage/yg2;->b:Landroid/view/View;

    .line 27
    .line 28
    new-instance v2, Landroid/graphics/Rect;

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    invoke-direct {v2, v3, v4, v5, v6}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 47
    .line 48
    .line 49
    iput-object v2, v0, Ldefpackage/ci2;->j:Landroid/graphics/Rect;

    .line 50
    .line 51
    if-eqz p0, :cond_1

    .line 52
    .line 53
    invoke-static {v1, p0}, Ldefpackage/vr1;->c(Landroid/view/View;Landroid/view/View;)Landroid/graphics/Rect;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    iput-object p0, v0, Ldefpackage/ci2;->k:Landroid/graphics/Rect;

    .line 58
    .line 59
    :cond_1
    iput p1, v0, Ldefpackage/ci2;->i:F

    .line 60
    .line 61
    :cond_2
    :goto_0
    return-void
.end method

.method public final d()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_4

    .line 6
    .line 7
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->G:Lcom/google/android/material/search/SearchBar;

    .line 8
    .line 9
    if-eqz v0, :cond_4

    .line 10
    .line 11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const/16 v1, 0x22

    .line 14
    .line 15
    if-ge v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->B:Ldefpackage/lo;

    .line 19
    .line 20
    iget-object v0, p0, Ldefpackage/lo;->m:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ldefpackage/ci2;

    .line 23
    .line 24
    iget-object v1, p0, Ldefpackage/lo;->o:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lcom/google/android/material/search/SearchBar;

    .line 27
    .line 28
    invoke-virtual {v0}, Ldefpackage/yg2;->a()Ldefpackage/oo;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const/4 v3, 0x0

    .line 33
    if-nez v2, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {v0, v1}, Ldefpackage/ci2;->b(Landroid/view/View;)Landroid/animation/AnimatorSet;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v2, v0, Ldefpackage/yg2;->b:Landroid/view/View;

    .line 41
    .line 42
    instance-of v4, v2, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 43
    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    check-cast v2, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 47
    .line 48
    invoke-virtual {v2}, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;->getCornerRadius()F

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    invoke-virtual {v0}, Ldefpackage/ci2;->c()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    int-to-float v5, v5

    .line 57
    const/4 v6, 0x2

    .line 58
    new-array v6, v6, [F

    .line 59
    .line 60
    const/4 v7, 0x0

    .line 61
    aput v4, v6, v7

    .line 62
    .line 63
    const/4 v4, 0x1

    .line 64
    aput v5, v6, v4

    .line 65
    .line 66
    invoke-static {v6}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    new-instance v6, Ldefpackage/cn0;

    .line 71
    .line 72
    const/4 v8, 0x4

    .line 73
    invoke-direct {v6, v8, v2}, Ldefpackage/cn0;-><init>(ILjava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v5, v6}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 77
    .line 78
    .line 79
    new-array v2, v4, [Landroid/animation/Animator;

    .line 80
    .line 81
    aput-object v5, v2, v7

    .line 82
    .line 83
    invoke-virtual {v1, v2}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 84
    .line 85
    .line 86
    :cond_2
    iget v2, v0, Ldefpackage/yg2;->e:I

    .line 87
    .line 88
    int-to-long v4, v2

    .line 89
    invoke-virtual {v1, v4, v5}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->start()V

    .line 93
    .line 94
    .line 95
    const/4 v1, 0x0

    .line 96
    iput v1, v0, Ldefpackage/ci2;->i:F

    .line 97
    .line 98
    iput-object v3, v0, Ldefpackage/ci2;->j:Landroid/graphics/Rect;

    .line 99
    .line 100
    iput-object v3, v0, Ldefpackage/ci2;->k:Landroid/graphics/Rect;

    .line 101
    .line 102
    :goto_0
    iget-object v0, p0, Ldefpackage/lo;->n:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, Landroid/animation/AnimatorSet;

    .line 105
    .line 106
    if-eqz v0, :cond_3

    .line 107
    .line 108
    invoke-static {v0}, Ldefpackage/rg3;->f(Landroid/animation/AnimatorSet;)V

    .line 109
    .line 110
    .line 111
    :cond_3
    iput-object v3, p0, Ldefpackage/lo;->n:Ljava/lang/Object;

    .line 112
    .line 113
    :cond_4
    :goto_1
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/m74;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Ldefpackage/m74;-><init>(Lcom/google/android/material/search/SearchView;I)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->w:Landroid/widget/EditText;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final g()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->O:Ldefpackage/y74;

    .line 2
    .line 3
    sget-object v1, Ldefpackage/y74;->o:Ldefpackage/y74;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->O:Ldefpackage/y74;

    .line 12
    .line 13
    sget-object v1, Ldefpackage/y74;->n:Ldefpackage/y74;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->B:Ldefpackage/lo;

    .line 23
    .line 24
    invoke-virtual {p0}, Ldefpackage/lo;->j()Landroid/animation/AnimatorSet;

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
.end method

.method public getBackHelper()Ldefpackage/ci2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->B:Ldefpackage/lo;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/lo;->m:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ldefpackage/ci2;

    .line 6
    .line 7
    return-object p0
.end method

.method public getBehavior()Ldefpackage/de0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldefpackage/de0;"
        }
    .end annotation

    .line 1
    new-instance p0, Lcom/google/android/material/search/SearchView$Behavior;

    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView$Behavior;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public getCurrentTransitionState()Ldefpackage/y74;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->O:Ldefpackage/y74;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDefaultNavigationIconResource()I
    .locals 0

    .line 1
    const p0, 0x7f080109

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public getEditText()Landroid/widget/EditText;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->w:Landroid/widget/EditText;

    .line 2
    .line 3
    return-object p0
.end method

.method public getHint()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->w:Landroid/widget/EditText;

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

.method public getSearchPrefix()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->v:Landroid/widget/TextView;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSearchPrefixText()Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->v:Landroid/widget/TextView;

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

.method public getSoftInputMode()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/material/search/SearchView;->H:I

    .line 2
    .line 3
    return p0
.end method

.method public getText()Landroid/text/Editable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->w:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getToolbar()Landroidx/appcompat/widget/Toolbar;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->t:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/google/android/material/search/SearchView;->H:I

    .line 2
    .line 3
    const/16 v0, 0x30

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final i()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->O:Ldefpackage/y74;

    .line 2
    .line 3
    sget-object v1, Ldefpackage/y74;->o:Ldefpackage/y74;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->O:Ldefpackage/y74;

    .line 12
    .line 13
    sget-object v0, Ldefpackage/y74;->n:Ldefpackage/y74;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 25
    return p0
.end method

.method public final j()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/search/SearchView;->K:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ldefpackage/m74;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p0, v1}, Ldefpackage/m74;-><init>(Lcom/google/android/material/search/SearchView;I)V

    .line 9
    .line 10
    .line 11
    const-wide/16 v1, 0x64

    .line 12
    .line 13
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->w:Landroid/widget/EditText;

    .line 14
    .line 15
    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final k(Ldefpackage/y74;Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->O:Ldefpackage/y74;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    sget-object v1, Ldefpackage/y74;->o:Ldefpackage/y74;

    .line 12
    .line 13
    sget-object v2, Ldefpackage/y74;->q:Ldefpackage/y74;

    .line 14
    .line 15
    if-eqz p2, :cond_2

    .line 16
    .line 17
    if-ne p1, v2, :cond_1

    .line 18
    .line 19
    const/4 p2, 0x1

    .line 20
    invoke-virtual {p0, p2}, Lcom/google/android/material/search/SearchView;->setModalForAccessibility(Z)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    if-ne p1, v1, :cond_2

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/google/android/material/search/SearchView;->setModalForAccessibility(Z)V

    .line 27
    .line 28
    .line 29
    :cond_2
    :goto_0
    iput-object p1, p0, Lcom/google/android/material/search/SearchView;->O:Ldefpackage/y74;

    .line 30
    .line 31
    new-instance p2, Ljava/util/LinkedHashSet;

    .line 32
    .line 33
    iget-object v3, p0, Lcom/google/android/material/search/SearchView;->F:Ljava/util/LinkedHashSet;

    .line 34
    .line 35
    invoke-direct {p2, v3}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-nez v3, :cond_5

    .line 47
    .line 48
    iget-object p2, p0, Lcom/google/android/material/search/SearchView;->G:Lcom/google/android/material/search/SearchBar;

    .line 49
    .line 50
    if-eqz p2, :cond_4

    .line 51
    .line 52
    iget-boolean p2, p0, Lcom/google/android/material/search/SearchView;->D:Z

    .line 53
    .line 54
    if-eqz p2, :cond_4

    .line 55
    .line 56
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->C:Ldefpackage/qp4;

    .line 61
    .line 62
    if-eqz p2, :cond_3

    .line 63
    .line 64
    iget-object p1, p0, Ldefpackage/qp4;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Ldefpackage/ah2;

    .line 67
    .line 68
    if-eqz p1, :cond_4

    .line 69
    .line 70
    iget-object p2, p0, Ldefpackage/qp4;->b:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p2, Ldefpackage/zg2;

    .line 73
    .line 74
    iget-object p0, p0, Ldefpackage/qp4;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, Landroid/view/View;

    .line 77
    .line 78
    invoke-virtual {p1, p2, p0, v0}, Ldefpackage/ah2;->b(Ldefpackage/zg2;Landroid/view/View;Z)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_3
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_4

    .line 87
    .line 88
    iget-object p1, p0, Ldefpackage/qp4;->a:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p1, Ldefpackage/ah2;

    .line 91
    .line 92
    if-eqz p1, :cond_4

    .line 93
    .line 94
    iget-object p0, p0, Ldefpackage/qp4;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p0, Landroid/view/View;

    .line 97
    .line 98
    invoke-virtual {p1, p0}, Ldefpackage/ah2;->c(Landroid/view/View;)V

    .line 99
    .line 100
    .line 101
    :cond_4
    :goto_1
    return-void

    .line 102
    :cond_5
    invoke-static {p2}, Ldefpackage/xa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    throw p0
.end method

.method public final l()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->O:Ldefpackage/y74;

    .line 2
    .line 3
    sget-object v1, Ldefpackage/y74;->q:Ldefpackage/y74;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_7

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->O:Ldefpackage/y74;

    .line 12
    .line 13
    sget-object v1, Ldefpackage/y74;->p:Ldefpackage/y74;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto/16 :goto_2

    .line 22
    .line 23
    :cond_0
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->B:Ldefpackage/lo;

    .line 24
    .line 25
    iget-object v0, p0, Ldefpackage/lo;->a:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lcom/google/android/material/search/SearchView;

    .line 28
    .line 29
    iget-object v2, p0, Ldefpackage/lo;->o:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Lcom/google/android/material/search/SearchBar;

    .line 32
    .line 33
    iget-object v3, p0, Ldefpackage/lo;->c:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v3, Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 36
    .line 37
    const/4 v4, 0x4

    .line 38
    if-eqz v2, :cond_5

    .line 39
    .line 40
    iget-object v2, p0, Ldefpackage/lo;->i:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v2, Landroid/widget/EditText;

    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/google/android/material/search/SearchView;->h()Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/google/android/material/search/SearchView;->j()V

    .line 51
    .line 52
    .line 53
    :cond_1
    invoke-virtual {v0, v1}, Lcom/google/android/material/search/SearchView;->setTransitionState(Ldefpackage/y74;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, p0, Ldefpackage/lo;->g:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Landroidx/appcompat/widget/Toolbar;

    .line 59
    .line 60
    invoke-virtual {v1}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    if-eqz v5, :cond_2

    .line 65
    .line 66
    invoke-interface {v5}, Landroid/view/Menu;->clear()V

    .line 67
    .line 68
    .line 69
    :cond_2
    iget-object v5, p0, Ldefpackage/lo;->o:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v5, Lcom/google/android/material/search/SearchBar;

    .line 72
    .line 73
    invoke-virtual {v5}, Lcom/google/android/material/search/SearchBar;->getMenuResId()I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    const/4 v6, -0x1

    .line 78
    const/4 v7, 0x0

    .line 79
    if-eq v5, v6, :cond_4

    .line 80
    .line 81
    iget-boolean v0, v0, Lcom/google/android/material/search/SearchView;->J:Z

    .line 82
    .line 83
    if-eqz v0, :cond_4

    .line 84
    .line 85
    iget-object v0, p0, Ldefpackage/lo;->o:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, Lcom/google/android/material/search/SearchBar;

    .line 88
    .line 89
    invoke-virtual {v0}, Lcom/google/android/material/search/SearchBar;->getMenuResId()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/Toolbar;->m(I)V

    .line 94
    .line 95
    .line 96
    invoke-static {v1}, Ldefpackage/gb;->y(Landroidx/appcompat/widget/Toolbar;)Landroidx/appcompat/widget/ActionMenuView;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    move v5, v7

    .line 103
    :goto_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    if-ge v5, v6, :cond_3

    .line 108
    .line 109
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    invoke-virtual {v6, v7}, Landroid/view/View;->setClickable(Z)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v6, v7}, Landroid/view/View;->setFocusable(Z)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v6, v7}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 120
    .line 121
    .line 122
    add-int/lit8 v5, v5, 0x1

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :cond_3
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_4
    const/16 v0, 0x8

    .line 130
    .line 131
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 132
    .line 133
    .line 134
    :goto_1
    iget-object v0, p0, Ldefpackage/lo;->o:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast v0, Lcom/google/android/material/search/SearchBar;

    .line 137
    .line 138
    invoke-virtual {v0}, Lcom/google/android/material/search/SearchBar;->getText()Ljava/lang/CharSequence;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    invoke-virtual {v2, v0}, Landroid/widget/EditText;->setSelection(I)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 157
    .line 158
    .line 159
    new-instance v0, Ldefpackage/b84;

    .line 160
    .line 161
    invoke-direct {v0, p0, v7}, Ldefpackage/b84;-><init>(Ldefpackage/lo;I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v3, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_5
    invoke-virtual {v0}, Lcom/google/android/material/search/SearchView;->h()Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    if-eqz v1, :cond_6

    .line 173
    .line 174
    new-instance v1, Ldefpackage/m74;

    .line 175
    .line 176
    const/4 v2, 0x3

    .line 177
    invoke-direct {v1, v0, v2}, Ldefpackage/m74;-><init>(Lcom/google/android/material/search/SearchView;I)V

    .line 178
    .line 179
    .line 180
    const-wide/16 v5, 0x96

    .line 181
    .line 182
    invoke-virtual {v0, v1, v5, v6}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 183
    .line 184
    .line 185
    :cond_6
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 186
    .line 187
    .line 188
    new-instance v0, Ldefpackage/b84;

    .line 189
    .line 190
    const/4 v1, 0x1

    .line 191
    invoke-direct {v0, p0, v1}, Ldefpackage/b84;-><init>(Ldefpackage/lo;I)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 195
    .line 196
    .line 197
    :cond_7
    :goto_2
    return-void
.end method

.method public final m(Landroid/view/ViewGroup;Z)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_4

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-ne v1, p0, :cond_0

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_0
    iget-object v2, p0, Lcom/google/android/material/search/SearchView;->o:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    check-cast v1, Landroid/view/ViewGroup;

    .line 28
    .line 29
    invoke-virtual {p0, v1, p2}, Lcom/google/android/material/search/SearchView;->m(Landroid/view/ViewGroup;Z)V

    .line 30
    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    iget-object v2, p0, Lcom/google/android/material/search/SearchView;->P:Ljava/util/HashMap;

    .line 34
    .line 35
    if-nez p2, :cond_2

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    iget-object v2, p0, Lcom/google/android/material/search/SearchView;->P:Ljava/util/HashMap;

    .line 46
    .line 47
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Ljava/lang/Integer;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    sget-object v3, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getImportantForAccessibility()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v2, v1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    sget-object v2, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 75
    .line 76
    const/4 v2, 0x4

    .line 77
    invoke-virtual {v1, v2}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 78
    .line 79
    .line 80
    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    return-void
.end method

.method public final n()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->t:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 2
    .line 3
    invoke-static {v0}, Ldefpackage/gb;->F(Landroidx/appcompat/widget/Toolbar;)Landroid/widget/ImageButton;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->o:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p0, 0x0

    .line 21
    :goto_0
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    instance-of v1, v0, Ldefpackage/dw0;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    move-object v1, v0

    .line 30
    check-cast v1, Ldefpackage/dw0;

    .line 31
    .line 32
    int-to-float v2, p0

    .line 33
    invoke-virtual {v1, v2}, Ldefpackage/dw0;->setProgress(F)V

    .line 34
    .line 35
    .line 36
    :cond_2
    instance-of v1, v0, Ldefpackage/v51;

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    check-cast v0, Ldefpackage/v51;

    .line 41
    .line 42
    int-to-float p0, p0

    .line 43
    invoke-virtual {v0, p0}, Ldefpackage/v51;->a(F)V

    .line 44
    .line 45
    .line 46
    :cond_3
    :goto_1
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Ldefpackage/ji2;->P(Landroid/view/ViewGroup;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final onFinishInflate()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView;->getActivityWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->softInputMode:I

    .line 15
    .line 16
    iput v0, p0, Lcom/google/android/material/search/SearchView;->H:I

    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Ldefpackage/w74;

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
    check-cast p1, Ldefpackage/w74;

    .line 10
    .line 11
    iget-object v0, p1, Ldefpackage/k;->n:Landroid/os/Parcelable;

    .line 12
    .line 13
    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p1, Ldefpackage/w74;->p:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/google/android/material/search/SearchView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    .line 20
    .line 21
    iget p1, p1, Ldefpackage/w74;->q:I

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/android/material/search/SearchView;->setVisible(Z)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/w74;

    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Ldefpackage/k;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->getText()Landroid/text/Editable;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :goto_0
    iput-object v1, v0, Ldefpackage/w74;->p:Ljava/lang/String;

    .line 23
    .line 24
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->o:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    iput p0, v0, Ldefpackage/w74;->q:I

    .line 31
    .line 32
    return-object v0
.end method

.method public setAnimatedNavigationIcon(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/search/SearchView;->I:Z

    .line 2
    .line 3
    return-void
.end method

.method public setAutoShowKeyboard(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/search/SearchView;->K:Z

    .line 2
    .line 3
    return-void
.end method

.method public setElevation(F)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setElevation(F)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchView;->setUpBackgroundViewElevationOverlay(F)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setHint(I)V
    .locals 0

    .line 7
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->w:Landroid/widget/EditText;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setHint(I)V

    return-void
.end method

.method public setHint(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->w:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setMenuItemsAnimated(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/search/SearchView;->J:Z

    .line 2
    .line 3
    return-void
.end method

.method public setModalForAccessibility(Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/view/ViewGroup;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    new-instance v1, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Lcom/google/android/material/search/SearchView;->P:Ljava/util/HashMap;

    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0, v0, p1}, Lcom/google/android/material/search/SearchView;->m(Landroid/view/ViewGroup;Z)V

    .line 21
    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    iput-object p1, p0, Lcom/google/android/material/search/SearchView;->P:Ljava/util/HashMap;

    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public setOnMenuItemClickListener(Ldefpackage/av4;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->t:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/Toolbar;->setOnMenuItemClickListener(Ldefpackage/av4;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setSearchPrefixText(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->v:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/16 p1, 0x8

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public setStatusBarSpacerEnabled(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/google/android/material/search/SearchView;->N:Z

    .line 3
    .line 4
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchView;->setStatusBarSpacerEnabledInternal(Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public setText(I)V
    .locals 0

    .line 7
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->w:Landroid/widget/EditText;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public setText(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->w:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setToolbarTouchscreenBlocksFocus(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->t:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setTouchscreenBlocksFocus(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setTransitionState(Ldefpackage/y74;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/google/android/material/search/SearchView;->k(Ldefpackage/y74;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public setUseWindowInsetsController(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/google/android/material/search/SearchView;->M:Z

    .line 2
    .line 3
    return-void
.end method

.method public setVisible(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->o:Lcom/google/android/material/internal/ClippableRoundedCornerLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    move v1, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v1, v3

    .line 14
    :goto_0
    if-eqz p1, :cond_1

    .line 15
    .line 16
    move v4, v3

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    const/16 v4, 0x8

    .line 19
    .line 20
    :goto_1
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->n()V

    .line 24
    .line 25
    .line 26
    if-eqz p1, :cond_2

    .line 27
    .line 28
    sget-object v0, Ldefpackage/y74;->q:Ldefpackage/y74;

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_2
    sget-object v0, Ldefpackage/y74;->o:Ldefpackage/y74;

    .line 32
    .line 33
    :goto_2
    if-eq v1, p1, :cond_3

    .line 34
    .line 35
    goto :goto_3

    .line 36
    :cond_3
    move v2, v3

    .line 37
    :goto_3
    invoke-virtual {p0, v0, v2}, Lcom/google/android/material/search/SearchView;->k(Ldefpackage/y74;Z)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public setupWithSearchBar(Lcom/google/android/material/search/SearchBar;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lcom/google/android/material/search/SearchView;->G:Lcom/google/android/material/search/SearchBar;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/material/search/SearchView;->B:Ldefpackage/lo;

    .line 4
    .line 5
    iput-object p1, v0, Ldefpackage/lo;->o:Ljava/lang/Object;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    new-instance v0, Ldefpackage/n74;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, p0, v1}, Ldefpackage/n74;-><init>(Lcom/google/android/material/search/SearchView;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    .line 17
    .line 18
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 19
    .line 20
    const/16 v1, 0x22

    .line 21
    .line 22
    if-lt v0, v1, :cond_0

    .line 23
    .line 24
    :try_start_0
    new-instance v0, Ldefpackage/m74;

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    invoke-direct {v0, p0, v1}, Ldefpackage/m74;-><init>(Lcom/google/android/material/search/SearchView;I)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v0}, Ldefpackage/v22;->f(Lcom/google/android/material/search/SearchBar;Ldefpackage/m74;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/google/android/material/search/SearchView;->w:Landroid/widget/EditText;

    .line 34
    .line 35
    invoke-static {p1}, Ldefpackage/v22;->e(Landroid/widget/EditText;)V
    :try_end_0
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    .line 37
    .line 38
    :catch_0
    :cond_0
    iget-object p1, p0, Lcom/google/android/material/search/SearchView;->t:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 39
    .line 40
    if-nez p1, :cond_1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    instance-of v0, v0, Ldefpackage/dw0;

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->getDefaultNavigationIconResource()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v1, p0, Lcom/google/android/material/search/SearchView;->G:Lcom/google/android/material/search/SearchBar;

    .line 57
    .line 58
    if-nez v1, :cond_3

    .line 59
    .line 60
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(I)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v1, v0}, Ldefpackage/zz1;->r(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {p1}, Lcom/google/android/material/appbar/MaterialToolbar;->getNavigationIconTint()Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    if-eqz v1, :cond_4

    .line 81
    .line 82
    invoke-virtual {p1}, Lcom/google/android/material/appbar/MaterialToolbar;->getNavigationIconTint()Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 91
    .line 92
    .line 93
    :cond_4
    new-instance v1, Ldefpackage/v51;

    .line 94
    .line 95
    iget-object v2, p0, Lcom/google/android/material/search/SearchView;->G:Lcom/google/android/material/search/SearchBar;

    .line 96
    .line 97
    invoke-virtual {v2}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-direct {v1, v2, v0}, Ldefpackage/v51;-><init>(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v1}, Lcom/google/android/material/appbar/MaterialToolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/google/android/material/search/SearchView;->n()V

    .line 108
    .line 109
    .line 110
    :goto_0
    invoke-direct {p0}, Lcom/google/android/material/search/SearchView;->getOverlayElevation()F

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    invoke-direct {p0, p1}, Lcom/google/android/material/search/SearchView;->setUpBackgroundViewElevationOverlay(F)V

    .line 115
    .line 116
    .line 117
    return-void
.end method
