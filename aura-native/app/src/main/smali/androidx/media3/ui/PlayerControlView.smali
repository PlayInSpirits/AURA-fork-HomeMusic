.class public Landroidx/media3/ui/PlayerControlView;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final U0:[F


# instance fields
.field public final A:Ldefpackage/gj3;

.field public final A0:Landroid/graphics/drawable/Drawable;

.field public final B:Ldefpackage/cj3;

.field public final B0:Ljava/lang/String;

.field public final C:Ldefpackage/cj3;

.field public final C0:Ljava/lang/String;

.field public final D:Ldefpackage/zg5;

.field public D0:Ldefpackage/qi3;

.field public final E:Landroid/widget/PopupWindow;

.field public E0:Z

.field public final F:I

.field public F0:Z

.field public final G:Landroid/widget/ImageView;

.field public G0:Z

.field public final H:Landroid/widget/ImageView;

.field public H0:Z

.field public final I:Landroid/widget/ImageView;

.field public I0:Z

.field public final J:Landroid/view/View;

.field public J0:Z

.field public final K:Landroid/view/View;

.field public K0:I

.field public final L:Landroid/widget/TextView;

.field public L0:Z

.field public final M:Landroid/widget/TextView;

.field public M0:I

.field public final N:Landroid/widget/ImageView;

.field public N0:I

.field public final O:Landroid/widget/ImageView;

.field public O0:[J

.field public final P:Landroid/widget/ImageView;

.field public P0:[Z

.field public final Q:Landroid/widget/ImageView;

.field public final Q0:[J

.field public final R:Landroid/widget/ImageView;

.field public final R0:[Z

.field public final S:Landroid/widget/ImageView;

.field public S0:J

.field public final T:Landroid/view/View;

.field public T0:Z

.field public final U:Landroid/view/View;

.field public final V:Landroid/view/View;

.field public final W:Landroid/widget/TextView;

.field public final a0:Landroid/widget/TextView;

.field public final b0:Landroidx/media3/ui/DefaultTimeBar;

.field public final c0:Ljava/lang/StringBuilder;

.field public final d0:Ljava/util/Formatter;

.field public final e0:Ldefpackage/zt4;

.field public final f0:Ldefpackage/bu4;

.field public final g0:Ldefpackage/qa1;

.field public final h0:Landroid/graphics/drawable/Drawable;

.field public final i0:Landroid/graphics/drawable/Drawable;

.field public final j0:Landroid/graphics/drawable/Drawable;

.field public final k0:Landroid/graphics/drawable/Drawable;

.field public final l0:Landroid/graphics/drawable/Drawable;

.field public final m0:Ljava/lang/String;

.field public final n:Ldefpackage/qj3;

.field public final n0:Ljava/lang/String;

.field public final o:Landroid/content/res/Resources;

.field public final o0:Ljava/lang/String;

.field public final p:Landroid/os/Handler;

.field public final p0:Landroid/graphics/drawable/Drawable;

.field public final q:Ldefpackage/dj3;

.field public final q0:Landroid/graphics/drawable/Drawable;

.field public final r:Ljava/lang/Class;

.field public final r0:F

.field public final s:Ljava/lang/reflect/Method;

.field public final s0:F

.field public final t:Ljava/lang/reflect/Method;

.field public final t0:Ljava/lang/String;

.field public final u:Ljava/lang/Class;

.field public final u0:Ljava/lang/String;

.field public final v:Ljava/lang/reflect/Method;

.field public final v0:Landroid/graphics/drawable/Drawable;

.field public final w:Ljava/lang/reflect/Method;

.field public final w0:Landroid/graphics/drawable/Drawable;

.field public final x:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final x0:Ljava/lang/String;

.field public final y:Landroidx/recyclerview/widget/RecyclerView;

.field public final y0:Ljava/lang/String;

.field public final z:Ldefpackage/jj3;

.field public final z0:Landroid/graphics/drawable/Drawable;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "media3.ui"

    .line 2
    .line 3
    invoke-static {v0}, Ldefpackage/hn2;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x7

    .line 7
    new-array v0, v0, [F

    .line 8
    .line 9
    fill-array-data v0, :array_0

    .line 10
    .line 11
    .line 12
    sput-object v0, Landroidx/media3/ui/PlayerControlView;->U0:[F

    .line 13
    .line 14
    return-void

    .line 15
    :array_0
    .array-data 4
        0x3e800000    # 0.25f
        0x3f000000    # 0.5f
        0x3f400000    # 0.75f
        0x3f800000    # 1.0f
        0x3fa00000    # 1.25f
        0x3fc00000    # 1.5f
        0x40000000    # 2.0f
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1658
    invoke-direct {p0, p1, v0}, Landroidx/media3/ui/PlayerControlView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 1656
    invoke-direct {p0, p1, p2, v0}, Landroidx/media3/ui/PlayerControlView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 1657
    invoke-direct {p0, p1, p2, p3, p2}, Landroidx/media3/ui/PlayerControlView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;)V
    .locals 48

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v5, p4

    .line 4
    .line 5
    const-string v1, "isScrubbingModeEnabled"

    .line 6
    .line 7
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    const-string v3, "setScrubbingModeEnabled"

    .line 10
    .line 11
    invoke-direct/range {p0 .. p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 12
    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    iput-boolean v7, v0, Landroidx/media3/ui/PlayerControlView;->H0:Z

    .line 16
    .line 17
    const/16 v4, 0x1388

    .line 18
    .line 19
    iput v4, v0, Landroidx/media3/ui/PlayerControlView;->K0:I

    .line 20
    .line 21
    const/4 v8, 0x0

    .line 22
    iput v8, v0, Landroidx/media3/ui/PlayerControlView;->N0:I

    .line 23
    .line 24
    const/16 v4, 0xc8

    .line 25
    .line 26
    iput v4, v0, Landroidx/media3/ui/PlayerControlView;->M0:I

    .line 27
    .line 28
    const v10, 0x7f0d0059

    .line 29
    .line 30
    .line 31
    const v11, 0x7f0800ee

    .line 32
    .line 33
    .line 34
    const v12, 0x7f0800ed

    .line 35
    .line 36
    .line 37
    const v13, 0x7f0800ea

    .line 38
    .line 39
    .line 40
    const v14, 0x7f0800f7

    .line 41
    .line 42
    .line 43
    const v15, 0x7f0800ef

    .line 44
    .line 45
    .line 46
    const v4, 0x7f0800f8

    .line 47
    .line 48
    .line 49
    if-eqz v5, :cond_0

    .line 50
    .line 51
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    sget-object v9, Ldefpackage/pt3;->b:[I

    .line 56
    .line 57
    move/from16 v6, p3

    .line 58
    .line 59
    invoke-virtual {v7, v5, v9, v6, v8}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    const/4 v7, 0x6

    .line 64
    :try_start_0
    invoke-virtual {v6, v7, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 65
    .line 66
    .line 67
    move-result v10

    .line 68
    const/16 v7, 0xc

    .line 69
    .line 70
    invoke-virtual {v6, v7, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 71
    .line 72
    .line 73
    move-result v11

    .line 74
    const/16 v7, 0xb

    .line 75
    .line 76
    invoke-virtual {v6, v7, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 77
    .line 78
    .line 79
    move-result v12

    .line 80
    const/16 v7, 0xa

    .line 81
    .line 82
    invoke-virtual {v6, v7, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 83
    .line 84
    .line 85
    move-result v13

    .line 86
    const/4 v7, 0x7

    .line 87
    invoke-virtual {v6, v7, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 88
    .line 89
    .line 90
    move-result v14

    .line 91
    const/16 v7, 0xf

    .line 92
    .line 93
    invoke-virtual {v6, v7, v15}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 94
    .line 95
    .line 96
    move-result v15

    .line 97
    const/16 v7, 0x14

    .line 98
    .line 99
    invoke-virtual {v6, v7, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    const/16 v7, 0x9

    .line 104
    .line 105
    const v9, 0x7f0800e9

    .line 106
    .line 107
    .line 108
    invoke-virtual {v6, v7, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    const v8, 0x7f0800e8

    .line 113
    .line 114
    .line 115
    const/16 v9, 0x8

    .line 116
    .line 117
    invoke-virtual {v6, v9, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    const/16 v9, 0x11

    .line 122
    .line 123
    move-object/from16 v26, v2

    .line 124
    .line 125
    const v2, 0x7f0800f1

    .line 126
    .line 127
    .line 128
    invoke-virtual {v6, v9, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    const/16 v9, 0x12

    .line 133
    .line 134
    move/from16 p3, v2

    .line 135
    .line 136
    const v2, 0x7f0800f2

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6, v9, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    const/16 v9, 0x10

    .line 144
    .line 145
    move/from16 v17, v2

    .line 146
    .line 147
    const v2, 0x7f0800f0

    .line 148
    .line 149
    .line 150
    invoke-virtual {v6, v9, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    const/16 v9, 0x23

    .line 155
    .line 156
    move/from16 v18, v2

    .line 157
    .line 158
    const v2, 0x7f0800f6

    .line 159
    .line 160
    .line 161
    invoke-virtual {v6, v9, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    const/16 v9, 0x22

    .line 166
    .line 167
    move/from16 v19, v2

    .line 168
    .line 169
    const v2, 0x7f0800f5

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6, v9, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    const/16 v9, 0x25

    .line 177
    .line 178
    move/from16 v20, v2

    .line 179
    .line 180
    const v2, 0x7f0800fb

    .line 181
    .line 182
    .line 183
    invoke-virtual {v6, v9, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 184
    .line 185
    .line 186
    move-result v2

    .line 187
    const/16 v9, 0x24

    .line 188
    .line 189
    move/from16 v21, v2

    .line 190
    .line 191
    const v2, 0x7f0800fa

    .line 192
    .line 193
    .line 194
    invoke-virtual {v6, v9, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    const/16 v9, 0x2a

    .line 199
    .line 200
    move/from16 v22, v2

    .line 201
    .line 202
    const v2, 0x7f0800fc

    .line 203
    .line 204
    .line 205
    invoke-virtual {v6, v9, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    iget v9, v0, Landroidx/media3/ui/PlayerControlView;->K0:I

    .line 210
    .line 211
    move/from16 v23, v2

    .line 212
    .line 213
    const/16 v2, 0x20

    .line 214
    .line 215
    invoke-virtual {v6, v2, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    iput v2, v0, Landroidx/media3/ui/PlayerControlView;->K0:I

    .line 220
    .line 221
    iget v2, v0, Landroidx/media3/ui/PlayerControlView;->N0:I

    .line 222
    .line 223
    const/16 v9, 0x13

    .line 224
    .line 225
    invoke-virtual {v6, v9, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 226
    .line 227
    .line 228
    move-result v2

    .line 229
    iput v2, v0, Landroidx/media3/ui/PlayerControlView;->N0:I

    .line 230
    .line 231
    const/16 v2, 0x1d

    .line 232
    .line 233
    const/4 v9, 0x1

    .line 234
    invoke-virtual {v6, v2, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 235
    .line 236
    .line 237
    move-result v24

    .line 238
    const/16 v2, 0x1a

    .line 239
    .line 240
    invoke-virtual {v6, v2, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 241
    .line 242
    .line 243
    move-result v27

    .line 244
    const/16 v2, 0x1c

    .line 245
    .line 246
    invoke-virtual {v6, v2, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    move/from16 v28, v2

    .line 251
    .line 252
    const/16 v2, 0x1b

    .line 253
    .line 254
    invoke-virtual {v6, v2, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    const/16 v9, 0x1e

    .line 259
    .line 260
    move/from16 v29, v2

    .line 261
    .line 262
    const/4 v2, 0x0

    .line 263
    invoke-virtual {v6, v9, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 264
    .line 265
    .line 266
    move-result v9

    .line 267
    move/from16 v30, v4

    .line 268
    .line 269
    const/16 v4, 0x1f

    .line 270
    .line 271
    invoke-virtual {v6, v4, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    move/from16 v31, v4

    .line 276
    .line 277
    const/16 v4, 0x21

    .line 278
    .line 279
    invoke-virtual {v6, v4, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    move/from16 v32, v4

    .line 284
    .line 285
    const/16 v4, 0x27

    .line 286
    .line 287
    invoke-virtual {v6, v4, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 288
    .line 289
    .line 290
    move-result v4

    .line 291
    iput-boolean v4, v0, Landroidx/media3/ui/PlayerControlView;->L0:Z

    .line 292
    .line 293
    iget v2, v0, Landroidx/media3/ui/PlayerControlView;->M0:I

    .line 294
    .line 295
    const/16 v4, 0x26

    .line 296
    .line 297
    invoke-virtual {v6, v4, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 298
    .line 299
    .line 300
    move-result v2

    .line 301
    invoke-virtual {v0, v2}, Landroidx/media3/ui/PlayerControlView;->setTimeBarMinUpdateInterval(I)V

    .line 302
    .line 303
    .line 304
    const/4 v2, 0x2

    .line 305
    const/4 v4, 0x1

    .line 306
    invoke-virtual {v6, v2, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 307
    .line 308
    .line 309
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 310
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 311
    .line 312
    .line 313
    move/from16 v36, v2

    .line 314
    .line 315
    move v2, v10

    .line 316
    move v6, v12

    .line 317
    move/from16 v33, v13

    .line 318
    .line 319
    move/from16 v34, v14

    .line 320
    .line 321
    move/from16 v35, v15

    .line 322
    .line 323
    move/from16 v15, v17

    .line 324
    .line 325
    move/from16 v12, v23

    .line 326
    .line 327
    move/from16 v10, v30

    .line 328
    .line 329
    move/from16 v14, p3

    .line 330
    .line 331
    move v13, v8

    .line 332
    move/from16 p3, v11

    .line 333
    .line 334
    move/from16 v8, v32

    .line 335
    .line 336
    move v11, v7

    .line 337
    move/from16 v7, v31

    .line 338
    .line 339
    goto :goto_0

    .line 340
    :catchall_0
    move-exception v0

    .line 341
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 342
    .line 343
    .line 344
    throw v0

    .line 345
    :cond_0
    move-object/from16 v26, v2

    .line 346
    .line 347
    const v2, 0x7f0800fc

    .line 348
    .line 349
    .line 350
    const v8, 0x7f0800e8

    .line 351
    .line 352
    .line 353
    const v9, 0x7f0800e9

    .line 354
    .line 355
    .line 356
    const v17, 0x7f0800f1

    .line 357
    .line 358
    .line 359
    const v18, 0x7f0800f2

    .line 360
    .line 361
    .line 362
    const v19, 0x7f0800f0

    .line 363
    .line 364
    .line 365
    const v20, 0x7f0800f6

    .line 366
    .line 367
    .line 368
    const v21, 0x7f0800f5

    .line 369
    .line 370
    .line 371
    const v22, 0x7f0800fb

    .line 372
    .line 373
    .line 374
    const v23, 0x7f0800fa

    .line 375
    .line 376
    .line 377
    move/from16 p3, v11

    .line 378
    .line 379
    move v6, v12

    .line 380
    move/from16 v33, v13

    .line 381
    .line 382
    move/from16 v34, v14

    .line 383
    .line 384
    move/from16 v35, v15

    .line 385
    .line 386
    move/from16 v14, v17

    .line 387
    .line 388
    move/from16 v15, v18

    .line 389
    .line 390
    move/from16 v18, v19

    .line 391
    .line 392
    move/from16 v19, v20

    .line 393
    .line 394
    move/from16 v20, v21

    .line 395
    .line 396
    move/from16 v21, v22

    .line 397
    .line 398
    move/from16 v22, v23

    .line 399
    .line 400
    const/4 v7, 0x0

    .line 401
    const/16 v24, 0x1

    .line 402
    .line 403
    const/16 v27, 0x1

    .line 404
    .line 405
    const/16 v28, 0x1

    .line 406
    .line 407
    const/16 v29, 0x1

    .line 408
    .line 409
    const/16 v36, 0x1

    .line 410
    .line 411
    move v12, v2

    .line 412
    move v13, v8

    .line 413
    move v11, v9

    .line 414
    move v2, v10

    .line 415
    const/4 v8, 0x0

    .line 416
    const/4 v9, 0x0

    .line 417
    move v10, v4

    .line 418
    :goto_0
    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    invoke-virtual {v4, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 423
    .line 424
    .line 425
    const/high16 v2, 0x40000

    .line 426
    .line 427
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 428
    .line 429
    .line 430
    new-instance v2, Ldefpackage/dj3;

    .line 431
    .line 432
    invoke-direct {v2, v0}, Ldefpackage/dj3;-><init>(Landroidx/media3/ui/PlayerControlView;)V

    .line 433
    .line 434
    .line 435
    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->q:Ldefpackage/dj3;

    .line 436
    .line 437
    new-instance v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 438
    .line 439
    invoke-direct {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 440
    .line 441
    .line 442
    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->x:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 443
    .line 444
    new-instance v2, Ldefpackage/zt4;

    .line 445
    .line 446
    invoke-direct {v2}, Ldefpackage/zt4;-><init>()V

    .line 447
    .line 448
    .line 449
    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->e0:Ldefpackage/zt4;

    .line 450
    .line 451
    new-instance v2, Ldefpackage/bu4;

    .line 452
    .line 453
    invoke-direct {v2}, Ldefpackage/bu4;-><init>()V

    .line 454
    .line 455
    .line 456
    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->f0:Ldefpackage/bu4;

    .line 457
    .line 458
    new-instance v2, Ljava/lang/StringBuilder;

    .line 459
    .line 460
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 461
    .line 462
    .line 463
    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->c0:Ljava/lang/StringBuilder;

    .line 464
    .line 465
    new-instance v4, Ljava/util/Formatter;

    .line 466
    .line 467
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 468
    .line 469
    .line 470
    move-result-object v5

    .line 471
    invoke-direct {v4, v2, v5}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    .line 472
    .line 473
    .line 474
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->d0:Ljava/util/Formatter;

    .line 475
    .line 476
    const/4 v2, 0x0

    .line 477
    new-array v4, v2, [J

    .line 478
    .line 479
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->O0:[J

    .line 480
    .line 481
    new-array v4, v2, [Z

    .line 482
    .line 483
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->P0:[Z

    .line 484
    .line 485
    new-array v4, v2, [J

    .line 486
    .line 487
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->Q0:[J

    .line 488
    .line 489
    new-array v4, v2, [Z

    .line 490
    .line 491
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->R0:[Z

    .line 492
    .line 493
    new-instance v2, Ldefpackage/qa1;

    .line 494
    .line 495
    const/16 v4, 0x1a

    .line 496
    .line 497
    invoke-direct {v2, v4, v0}, Ldefpackage/qa1;-><init>(ILjava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->g0:Ldefpackage/qa1;

    .line 501
    .line 502
    const/4 v2, 0x0

    .line 503
    :try_start_1
    const-class v4, Landroidx/media3/exoplayer/ExoPlayer;

    .line 504
    .line 505
    sget v5, Landroidx/media3/exoplayer/ExoPlayer;->a:I
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 506
    .line 507
    :try_start_2
    filled-new-array/range {v26 .. v26}, [Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    move-result-object v5

    .line 511
    invoke-virtual {v4, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 512
    .line 513
    .line 514
    move-result-object v5
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_0

    .line 515
    :try_start_3
    invoke-virtual {v4, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 516
    .line 517
    .line 518
    move-result-object v17
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_2

    .line 519
    move-object/from16 v2, v17

    .line 520
    .line 521
    goto :goto_1

    .line 522
    :catch_0
    move-object v5, v2

    .line 523
    goto :goto_1

    .line 524
    :catch_1
    move-object v4, v2

    .line 525
    move-object v5, v4

    .line 526
    :catch_2
    :goto_1
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->r:Ljava/lang/Class;

    .line 527
    .line 528
    iput-object v5, v0, Landroidx/media3/ui/PlayerControlView;->s:Ljava/lang/reflect/Method;

    .line 529
    .line 530
    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->t:Ljava/lang/reflect/Method;

    .line 531
    .line 532
    :try_start_4
    const-string v2, "androidx.media3.transformer.CompositionPlayer"

    .line 533
    .line 534
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 535
    .line 536
    .line 537
    move-result-object v2
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_4

    .line 538
    :try_start_5
    filled-new-array/range {v26 .. v26}, [Ljava/lang/Class;

    .line 539
    .line 540
    .line 541
    move-result-object v4

    .line 542
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 543
    .line 544
    .line 545
    move-result-object v3
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_3

    .line 546
    const/4 v4, 0x0

    .line 547
    :try_start_6
    invoke-virtual {v2, v1, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 548
    .line 549
    .line 550
    move-result-object v1
    :try_end_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Ljava/lang/NoSuchMethodException; {:try_start_6 .. :try_end_6} :catch_5

    .line 551
    goto :goto_3

    .line 552
    :catch_3
    const/4 v4, 0x0

    .line 553
    move-object v3, v4

    .line 554
    goto :goto_2

    .line 555
    :catch_4
    const/4 v4, 0x0

    .line 556
    move-object v2, v4

    .line 557
    move-object v3, v2

    .line 558
    :catch_5
    :goto_2
    move-object v1, v4

    .line 559
    :goto_3
    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->u:Ljava/lang/Class;

    .line 560
    .line 561
    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->v:Ljava/lang/reflect/Method;

    .line 562
    .line 563
    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->w:Ljava/lang/reflect/Method;

    .line 564
    .line 565
    const v1, 0x7f0a0210

    .line 566
    .line 567
    .line 568
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    check-cast v1, Landroid/widget/TextView;

    .line 573
    .line 574
    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->W:Landroid/widget/TextView;

    .line 575
    .line 576
    const v1, 0x7f0a0225

    .line 577
    .line 578
    .line 579
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 580
    .line 581
    .line 582
    move-result-object v1

    .line 583
    check-cast v1, Landroid/widget/TextView;

    .line 584
    .line 585
    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->a0:Landroid/widget/TextView;

    .line 586
    .line 587
    const v1, 0x7f0a0231

    .line 588
    .line 589
    .line 590
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    check-cast v1, Landroid/widget/ImageView;

    .line 595
    .line 596
    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->Q:Landroid/widget/ImageView;

    .line 597
    .line 598
    if-eqz v1, :cond_1

    .line 599
    .line 600
    iget-object v2, v0, Landroidx/media3/ui/PlayerControlView;->q:Ldefpackage/dj3;

    .line 601
    .line 602
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 603
    .line 604
    .line 605
    :cond_1
    const v1, 0x7f0a0216

    .line 606
    .line 607
    .line 608
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    check-cast v1, Landroid/widget/ImageView;

    .line 613
    .line 614
    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->R:Landroid/widget/ImageView;

    .line 615
    .line 616
    new-instance v2, Ldefpackage/p6;

    .line 617
    .line 618
    const/16 v3, 0x1d

    .line 619
    .line 620
    invoke-direct {v2, v3, v0}, Ldefpackage/p6;-><init>(ILjava/lang/Object;)V

    .line 621
    .line 622
    .line 623
    if-nez v1, :cond_2

    .line 624
    .line 625
    const/16 v5, 0x8

    .line 626
    .line 627
    goto :goto_4

    .line 628
    :cond_2
    const/16 v5, 0x8

    .line 629
    .line 630
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 634
    .line 635
    .line 636
    :goto_4
    const v1, 0x7f0a021c

    .line 637
    .line 638
    .line 639
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 640
    .line 641
    .line 642
    move-result-object v1

    .line 643
    check-cast v1, Landroid/widget/ImageView;

    .line 644
    .line 645
    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->S:Landroid/widget/ImageView;

    .line 646
    .line 647
    new-instance v2, Ldefpackage/p6;

    .line 648
    .line 649
    invoke-direct {v2, v3, v0}, Ldefpackage/p6;-><init>(ILjava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    if-nez v1, :cond_3

    .line 653
    .line 654
    goto :goto_5

    .line 655
    :cond_3
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 659
    .line 660
    .line 661
    :goto_5
    const v1, 0x7f0a022c

    .line 662
    .line 663
    .line 664
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->T:Landroid/view/View;

    .line 669
    .line 670
    if-eqz v1, :cond_4

    .line 671
    .line 672
    iget-object v2, v0, Landroidx/media3/ui/PlayerControlView;->q:Ldefpackage/dj3;

    .line 673
    .line 674
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 675
    .line 676
    .line 677
    :cond_4
    const v1, 0x7f0a0224

    .line 678
    .line 679
    .line 680
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 681
    .line 682
    .line 683
    move-result-object v1

    .line 684
    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->U:Landroid/view/View;

    .line 685
    .line 686
    if-eqz v1, :cond_5

    .line 687
    .line 688
    iget-object v2, v0, Landroidx/media3/ui/PlayerControlView;->q:Ldefpackage/dj3;

    .line 689
    .line 690
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 691
    .line 692
    .line 693
    :cond_5
    const v1, 0x7f0a0206

    .line 694
    .line 695
    .line 696
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 697
    .line 698
    .line 699
    move-result-object v1

    .line 700
    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->V:Landroid/view/View;

    .line 701
    .line 702
    if-eqz v1, :cond_6

    .line 703
    .line 704
    iget-object v2, v0, Landroidx/media3/ui/PlayerControlView;->q:Ldefpackage/dj3;

    .line 705
    .line 706
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 707
    .line 708
    .line 709
    :cond_6
    const v1, 0x7f0a0227

    .line 710
    .line 711
    .line 712
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 713
    .line 714
    .line 715
    move-result-object v2

    .line 716
    check-cast v2, Landroidx/media3/ui/DefaultTimeBar;

    .line 717
    .line 718
    const v3, 0x7f0a0228

    .line 719
    .line 720
    .line 721
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 722
    .line 723
    .line 724
    move-result-object v3

    .line 725
    if-eqz v2, :cond_7

    .line 726
    .line 727
    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->b0:Landroidx/media3/ui/DefaultTimeBar;

    .line 728
    .line 729
    move/from16 v37, p3

    .line 730
    .line 731
    move/from16 v38, v6

    .line 732
    .line 733
    move/from16 v23, v8

    .line 734
    .line 735
    move/from16 v39, v18

    .line 736
    .line 737
    move/from16 v40, v19

    .line 738
    .line 739
    move/from16 v41, v20

    .line 740
    .line 741
    move/from16 v42, v21

    .line 742
    .line 743
    move/from16 v43, v22

    .line 744
    .line 745
    move/from16 v44, v24

    .line 746
    .line 747
    move/from16 v45, v27

    .line 748
    .line 749
    move/from16 v46, v28

    .line 750
    .line 751
    move/from16 v47, v29

    .line 752
    .line 753
    goto/16 :goto_6

    .line 754
    .line 755
    :cond_7
    if-eqz v3, :cond_8

    .line 756
    .line 757
    move v2, v1

    .line 758
    new-instance v1, Landroidx/media3/ui/DefaultTimeBar;

    .line 759
    .line 760
    move-object v5, v4

    .line 761
    const/4 v4, 0x0

    .line 762
    move/from16 v16, v6

    .line 763
    .line 764
    const v6, 0x7f140150

    .line 765
    .line 766
    .line 767
    move-object/from16 v17, v3

    .line 768
    .line 769
    const/4 v3, 0x0

    .line 770
    move/from16 v37, p3

    .line 771
    .line 772
    move-object/from16 v5, p4

    .line 773
    .line 774
    move/from16 v23, v8

    .line 775
    .line 776
    move/from16 v38, v16

    .line 777
    .line 778
    move/from16 v39, v18

    .line 779
    .line 780
    move/from16 v40, v19

    .line 781
    .line 782
    move/from16 v41, v20

    .line 783
    .line 784
    move/from16 v42, v21

    .line 785
    .line 786
    move/from16 v43, v22

    .line 787
    .line 788
    move/from16 v44, v24

    .line 789
    .line 790
    move/from16 v45, v27

    .line 791
    .line 792
    move/from16 v46, v28

    .line 793
    .line 794
    move/from16 v47, v29

    .line 795
    .line 796
    move v8, v2

    .line 797
    move-object/from16 v2, p1

    .line 798
    .line 799
    invoke-direct/range {v1 .. v6}, Landroidx/media3/ui/DefaultTimeBar;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILandroid/util/AttributeSet;I)V

    .line 800
    .line 801
    .line 802
    invoke-virtual {v1, v8}, Landroid/view/View;->setId(I)V

    .line 803
    .line 804
    .line 805
    invoke-virtual/range {v17 .. v17}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 806
    .line 807
    .line 808
    move-result-object v2

    .line 809
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 810
    .line 811
    .line 812
    invoke-virtual/range {v17 .. v17}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 813
    .line 814
    .line 815
    move-result-object v2

    .line 816
    check-cast v2, Landroid/view/ViewGroup;

    .line 817
    .line 818
    move-object/from16 v3, v17

    .line 819
    .line 820
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 821
    .line 822
    .line 823
    move-result v4

    .line 824
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v2, v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 828
    .line 829
    .line 830
    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->b0:Landroidx/media3/ui/DefaultTimeBar;

    .line 831
    .line 832
    const/4 v4, 0x0

    .line 833
    goto :goto_6

    .line 834
    :cond_8
    move/from16 v37, p3

    .line 835
    .line 836
    move/from16 v38, v6

    .line 837
    .line 838
    move/from16 v23, v8

    .line 839
    .line 840
    move/from16 v39, v18

    .line 841
    .line 842
    move/from16 v40, v19

    .line 843
    .line 844
    move/from16 v41, v20

    .line 845
    .line 846
    move/from16 v42, v21

    .line 847
    .line 848
    move/from16 v43, v22

    .line 849
    .line 850
    move/from16 v44, v24

    .line 851
    .line 852
    move/from16 v45, v27

    .line 853
    .line 854
    move/from16 v46, v28

    .line 855
    .line 856
    move/from16 v47, v29

    .line 857
    .line 858
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->b0:Landroidx/media3/ui/DefaultTimeBar;

    .line 859
    .line 860
    :goto_6
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->b0:Landroidx/media3/ui/DefaultTimeBar;

    .line 861
    .line 862
    if-eqz v1, :cond_9

    .line 863
    .line 864
    iget-object v2, v0, Landroidx/media3/ui/PlayerControlView;->q:Ldefpackage/dj3;

    .line 865
    .line 866
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 867
    .line 868
    .line 869
    iget-object v1, v1, Landroidx/media3/ui/DefaultTimeBar;->K:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 870
    .line 871
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 872
    .line 873
    .line 874
    :cond_9
    invoke-static {v4}, Ldefpackage/f35;->p(Ldefpackage/nk2;)Landroid/os/Handler;

    .line 875
    .line 876
    .line 877
    move-result-object v1

    .line 878
    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->p:Landroid/os/Handler;

    .line 879
    .line 880
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 881
    .line 882
    .line 883
    move-result-object v1

    .line 884
    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->o:Landroid/content/res/Resources;

    .line 885
    .line 886
    const v2, 0x7f0a0223

    .line 887
    .line 888
    .line 889
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 890
    .line 891
    .line 892
    move-result-object v2

    .line 893
    check-cast v2, Landroid/widget/ImageView;

    .line 894
    .line 895
    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->I:Landroid/widget/ImageView;

    .line 896
    .line 897
    if-eqz v2, :cond_a

    .line 898
    .line 899
    iget-object v3, v0, Landroidx/media3/ui/PlayerControlView;->q:Ldefpackage/dj3;

    .line 900
    .line 901
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 902
    .line 903
    .line 904
    :cond_a
    const v2, 0x7f0a0226

    .line 905
    .line 906
    .line 907
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 908
    .line 909
    .line 910
    move-result-object v2

    .line 911
    check-cast v2, Landroid/widget/ImageView;

    .line 912
    .line 913
    iput-object v2, v0, Landroidx/media3/ui/PlayerControlView;->G:Landroid/widget/ImageView;

    .line 914
    .line 915
    if-eqz v2, :cond_b

    .line 916
    .line 917
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 918
    .line 919
    .line 920
    move-result-object v3

    .line 921
    move/from16 v4, v35

    .line 922
    .line 923
    invoke-virtual {v1, v4, v3}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 924
    .line 925
    .line 926
    move-result-object v3

    .line 927
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 928
    .line 929
    .line 930
    iget-object v3, v0, Landroidx/media3/ui/PlayerControlView;->q:Ldefpackage/dj3;

    .line 931
    .line 932
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 933
    .line 934
    .line 935
    :cond_b
    const v3, 0x7f0a021d

    .line 936
    .line 937
    .line 938
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 939
    .line 940
    .line 941
    move-result-object v3

    .line 942
    check-cast v3, Landroid/widget/ImageView;

    .line 943
    .line 944
    iput-object v3, v0, Landroidx/media3/ui/PlayerControlView;->H:Landroid/widget/ImageView;

    .line 945
    .line 946
    if-eqz v3, :cond_c

    .line 947
    .line 948
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 949
    .line 950
    .line 951
    move-result-object v4

    .line 952
    move/from16 v5, v33

    .line 953
    .line 954
    invoke-virtual {v1, v5, v4}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 955
    .line 956
    .line 957
    move-result-object v4

    .line 958
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 959
    .line 960
    .line 961
    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->q:Ldefpackage/dj3;

    .line 962
    .line 963
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 964
    .line 965
    .line 966
    :cond_c
    sget-object v4, Ldefpackage/g14;->a:Ljava/lang/ThreadLocal;

    .line 967
    .line 968
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->isRestricted()Z

    .line 969
    .line 970
    .line 971
    move-result v4

    .line 972
    if-eqz v4, :cond_d

    .line 973
    .line 974
    const/4 v4, 0x0

    .line 975
    goto :goto_7

    .line 976
    :cond_d
    new-instance v26, Landroid/util/TypedValue;

    .line 977
    .line 978
    invoke-direct/range {v26 .. v26}, Landroid/util/TypedValue;-><init>()V

    .line 979
    .line 980
    .line 981
    const/16 v29, 0x0

    .line 982
    .line 983
    const/16 v30, 0x0

    .line 984
    .line 985
    const v25, 0x7f09000a

    .line 986
    .line 987
    .line 988
    const/16 v27, 0x0

    .line 989
    .line 990
    const/16 v28, 0x0

    .line 991
    .line 992
    move-object/from16 v24, p1

    .line 993
    .line 994
    invoke-static/range {v24 .. v30}, Ldefpackage/g14;->a(Landroid/content/Context;ILandroid/util/TypedValue;ILdefpackage/au0;ZZ)Landroid/graphics/Typeface;

    .line 995
    .line 996
    .line 997
    move-result-object v4

    .line 998
    :goto_7
    const v5, 0x7f0a022a

    .line 999
    .line 1000
    .line 1001
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v5

    .line 1005
    check-cast v5, Landroid/widget/ImageView;

    .line 1006
    .line 1007
    const v6, 0x7f0a022b

    .line 1008
    .line 1009
    .line 1010
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v6

    .line 1014
    check-cast v6, Landroid/widget/TextView;

    .line 1015
    .line 1016
    if-eqz v5, :cond_e

    .line 1017
    .line 1018
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v6

    .line 1022
    invoke-virtual {v1, v10, v6}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v6

    .line 1026
    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1027
    .line 1028
    .line 1029
    iput-object v5, v0, Landroidx/media3/ui/PlayerControlView;->K:Landroid/view/View;

    .line 1030
    .line 1031
    const/4 v5, 0x0

    .line 1032
    iput-object v5, v0, Landroidx/media3/ui/PlayerControlView;->M:Landroid/widget/TextView;

    .line 1033
    .line 1034
    goto :goto_8

    .line 1035
    :cond_e
    const/4 v5, 0x0

    .line 1036
    if-eqz v6, :cond_f

    .line 1037
    .line 1038
    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1039
    .line 1040
    .line 1041
    iput-object v6, v0, Landroidx/media3/ui/PlayerControlView;->M:Landroid/widget/TextView;

    .line 1042
    .line 1043
    iput-object v6, v0, Landroidx/media3/ui/PlayerControlView;->K:Landroid/view/View;

    .line 1044
    .line 1045
    goto :goto_8

    .line 1046
    :cond_f
    iput-object v5, v0, Landroidx/media3/ui/PlayerControlView;->M:Landroid/widget/TextView;

    .line 1047
    .line 1048
    iput-object v5, v0, Landroidx/media3/ui/PlayerControlView;->K:Landroid/view/View;

    .line 1049
    .line 1050
    :goto_8
    iget-object v5, v0, Landroidx/media3/ui/PlayerControlView;->K:Landroid/view/View;

    .line 1051
    .line 1052
    if-eqz v5, :cond_10

    .line 1053
    .line 1054
    iget-object v6, v0, Landroidx/media3/ui/PlayerControlView;->q:Ldefpackage/dj3;

    .line 1055
    .line 1056
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1057
    .line 1058
    .line 1059
    :cond_10
    const v5, 0x7f0a0214

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v5

    .line 1066
    check-cast v5, Landroid/widget/ImageView;

    .line 1067
    .line 1068
    const v6, 0x7f0a0215

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v6

    .line 1075
    check-cast v6, Landroid/widget/TextView;

    .line 1076
    .line 1077
    if-eqz v5, :cond_11

    .line 1078
    .line 1079
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v4

    .line 1083
    move/from16 v6, v34

    .line 1084
    .line 1085
    invoke-virtual {v1, v6, v4}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v4

    .line 1089
    invoke-virtual {v5, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1090
    .line 1091
    .line 1092
    iput-object v5, v0, Landroidx/media3/ui/PlayerControlView;->J:Landroid/view/View;

    .line 1093
    .line 1094
    const/4 v5, 0x0

    .line 1095
    iput-object v5, v0, Landroidx/media3/ui/PlayerControlView;->L:Landroid/widget/TextView;

    .line 1096
    .line 1097
    goto :goto_9

    .line 1098
    :cond_11
    const/4 v5, 0x0

    .line 1099
    if-eqz v6, :cond_12

    .line 1100
    .line 1101
    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1102
    .line 1103
    .line 1104
    iput-object v6, v0, Landroidx/media3/ui/PlayerControlView;->L:Landroid/widget/TextView;

    .line 1105
    .line 1106
    iput-object v6, v0, Landroidx/media3/ui/PlayerControlView;->J:Landroid/view/View;

    .line 1107
    .line 1108
    goto :goto_9

    .line 1109
    :cond_12
    iput-object v5, v0, Landroidx/media3/ui/PlayerControlView;->L:Landroid/widget/TextView;

    .line 1110
    .line 1111
    iput-object v5, v0, Landroidx/media3/ui/PlayerControlView;->J:Landroid/view/View;

    .line 1112
    .line 1113
    :goto_9
    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->J:Landroid/view/View;

    .line 1114
    .line 1115
    if-eqz v4, :cond_13

    .line 1116
    .line 1117
    iget-object v5, v0, Landroidx/media3/ui/PlayerControlView;->q:Ldefpackage/dj3;

    .line 1118
    .line 1119
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1120
    .line 1121
    .line 1122
    :cond_13
    const v4, 0x7f0a0229

    .line 1123
    .line 1124
    .line 1125
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v4

    .line 1129
    check-cast v4, Landroid/widget/ImageView;

    .line 1130
    .line 1131
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->N:Landroid/widget/ImageView;

    .line 1132
    .line 1133
    if-eqz v4, :cond_14

    .line 1134
    .line 1135
    iget-object v5, v0, Landroidx/media3/ui/PlayerControlView;->q:Ldefpackage/dj3;

    .line 1136
    .line 1137
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1138
    .line 1139
    .line 1140
    :cond_14
    const v5, 0x7f0a022e

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v5

    .line 1147
    check-cast v5, Landroid/widget/ImageView;

    .line 1148
    .line 1149
    iput-object v5, v0, Landroidx/media3/ui/PlayerControlView;->O:Landroid/widget/ImageView;

    .line 1150
    .line 1151
    if-eqz v5, :cond_15

    .line 1152
    .line 1153
    iget-object v6, v0, Landroidx/media3/ui/PlayerControlView;->q:Ldefpackage/dj3;

    .line 1154
    .line 1155
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1156
    .line 1157
    .line 1158
    :cond_15
    const v6, 0x7f0b000b

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getInteger(I)I

    .line 1162
    .line 1163
    .line 1164
    move-result v6

    .line 1165
    int-to-float v6, v6

    .line 1166
    const/high16 v8, 0x42c80000    # 100.0f

    .line 1167
    .line 1168
    div-float/2addr v6, v8

    .line 1169
    iput v6, v0, Landroidx/media3/ui/PlayerControlView;->r0:F

    .line 1170
    .line 1171
    const v6, 0x7f0b000a

    .line 1172
    .line 1173
    .line 1174
    invoke-virtual {v1, v6}, Landroid/content/res/Resources;->getInteger(I)I

    .line 1175
    .line 1176
    .line 1177
    move-result v6

    .line 1178
    int-to-float v6, v6

    .line 1179
    div-float/2addr v6, v8

    .line 1180
    iput v6, v0, Landroidx/media3/ui/PlayerControlView;->s0:F

    .line 1181
    .line 1182
    const v6, 0x7f0a0237

    .line 1183
    .line 1184
    .line 1185
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v6

    .line 1189
    check-cast v6, Landroid/widget/ImageView;

    .line 1190
    .line 1191
    iput-object v6, v0, Landroidx/media3/ui/PlayerControlView;->P:Landroid/widget/ImageView;

    .line 1192
    .line 1193
    if-eqz v6, :cond_16

    .line 1194
    .line 1195
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v8

    .line 1199
    invoke-virtual {v1, v12, v8}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v8

    .line 1203
    invoke-virtual {v6, v8}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1204
    .line 1205
    .line 1206
    const/4 v8, 0x0

    .line 1207
    invoke-virtual {v0, v6, v8}, Landroidx/media3/ui/PlayerControlView;->j(Landroid/view/View;Z)V

    .line 1208
    .line 1209
    .line 1210
    :cond_16
    new-instance v8, Ldefpackage/qj3;

    .line 1211
    .line 1212
    invoke-direct {v8, v0}, Ldefpackage/qj3;-><init>(Landroidx/media3/ui/PlayerControlView;)V

    .line 1213
    .line 1214
    .line 1215
    iput-object v8, v0, Landroidx/media3/ui/PlayerControlView;->n:Ldefpackage/qj3;

    .line 1216
    .line 1217
    move/from16 v10, v36

    .line 1218
    .line 1219
    iput-boolean v10, v8, Ldefpackage/qj3;->D:Z

    .line 1220
    .line 1221
    const v10, 0x7f130122

    .line 1222
    .line 1223
    .line 1224
    invoke-virtual {v1, v10}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v10

    .line 1228
    const v12, 0x7f0800f9

    .line 1229
    .line 1230
    .line 1231
    move-object/from16 p3, v4

    .line 1232
    .line 1233
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v4

    .line 1237
    invoke-virtual {v1, v12, v4}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v4

    .line 1241
    const v12, 0x7f130143

    .line 1242
    .line 1243
    .line 1244
    invoke-virtual {v1, v12}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v12

    .line 1248
    filled-new-array {v10, v12}, [Ljava/lang/String;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v10

    .line 1252
    const v12, 0x7f0800e5

    .line 1253
    .line 1254
    .line 1255
    move-object/from16 p4, v6

    .line 1256
    .line 1257
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v6

    .line 1261
    invoke-virtual {v1, v12, v6}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v6

    .line 1265
    filled-new-array {v4, v6}, [Landroid/graphics/drawable/Drawable;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v4

    .line 1269
    new-instance v6, Ldefpackage/jj3;

    .line 1270
    .line 1271
    invoke-direct {v6, v0, v10, v4}, Ldefpackage/jj3;-><init>(Landroidx/media3/ui/PlayerControlView;[Ljava/lang/String;[Landroid/graphics/drawable/Drawable;)V

    .line 1272
    .line 1273
    .line 1274
    iput-object v6, v0, Landroidx/media3/ui/PlayerControlView;->z:Ldefpackage/jj3;

    .line 1275
    .line 1276
    const v4, 0x7f070340

    .line 1277
    .line 1278
    .line 1279
    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1280
    .line 1281
    .line 1282
    move-result v4

    .line 1283
    iput v4, v0, Landroidx/media3/ui/PlayerControlView;->F:I

    .line 1284
    .line 1285
    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v4

    .line 1289
    const v10, 0x7f0d005b

    .line 1290
    .line 1291
    .line 1292
    const/4 v12, 0x0

    .line 1293
    invoke-virtual {v4, v10, v12}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v4

    .line 1297
    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    .line 1298
    .line 1299
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->y:Landroidx/recyclerview/widget/RecyclerView;

    .line 1300
    .line 1301
    invoke-virtual {v4, v6}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldefpackage/dw3;)V

    .line 1302
    .line 1303
    .line 1304
    new-instance v6, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 1305
    .line 1306
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1307
    .line 1308
    .line 1309
    const/4 v10, 0x1

    .line 1310
    invoke-direct {v6, v10}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 1311
    .line 1312
    .line 1313
    invoke-virtual {v4, v6}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 1314
    .line 1315
    .line 1316
    new-instance v6, Landroid/widget/PopupWindow;

    .line 1317
    .line 1318
    const/4 v12, -0x2

    .line 1319
    invoke-direct {v6, v4, v12, v12, v10}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    .line 1320
    .line 1321
    .line 1322
    iput-object v6, v0, Landroidx/media3/ui/PlayerControlView;->E:Landroid/widget/PopupWindow;

    .line 1323
    .line 1324
    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->q:Ldefpackage/dj3;

    .line 1325
    .line 1326
    invoke-virtual {v6, v4}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 1327
    .line 1328
    .line 1329
    iput-boolean v10, v0, Landroidx/media3/ui/PlayerControlView;->T0:Z

    .line 1330
    .line 1331
    new-instance v4, Ldefpackage/zg5;

    .line 1332
    .line 1333
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v6

    .line 1337
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 1338
    .line 1339
    .line 1340
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1341
    .line 1342
    .line 1343
    iput-object v6, v4, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 1344
    .line 1345
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->D:Ldefpackage/zg5;

    .line 1346
    .line 1347
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v4

    .line 1351
    move/from16 v6, v42

    .line 1352
    .line 1353
    invoke-virtual {v1, v6, v4}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v4

    .line 1357
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->v0:Landroid/graphics/drawable/Drawable;

    .line 1358
    .line 1359
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v4

    .line 1363
    move/from16 v6, v43

    .line 1364
    .line 1365
    invoke-virtual {v1, v6, v4}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v4

    .line 1369
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->w0:Landroid/graphics/drawable/Drawable;

    .line 1370
    .line 1371
    const v4, 0x7f130115

    .line 1372
    .line 1373
    .line 1374
    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1375
    .line 1376
    .line 1377
    move-result-object v4

    .line 1378
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->x0:Ljava/lang/String;

    .line 1379
    .line 1380
    const v4, 0x7f130114

    .line 1381
    .line 1382
    .line 1383
    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v4

    .line 1387
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->y0:Ljava/lang/String;

    .line 1388
    .line 1389
    new-instance v4, Ldefpackage/cj3;

    .line 1390
    .line 1391
    const/4 v10, 0x1

    .line 1392
    invoke-direct {v4, v0, v10}, Ldefpackage/cj3;-><init>(Landroidx/media3/ui/PlayerControlView;I)V

    .line 1393
    .line 1394
    .line 1395
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->B:Ldefpackage/cj3;

    .line 1396
    .line 1397
    new-instance v4, Ldefpackage/cj3;

    .line 1398
    .line 1399
    const/4 v6, 0x0

    .line 1400
    invoke-direct {v4, v0, v6}, Ldefpackage/cj3;-><init>(Landroidx/media3/ui/PlayerControlView;I)V

    .line 1401
    .line 1402
    .line 1403
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->C:Ldefpackage/cj3;

    .line 1404
    .line 1405
    new-instance v4, Ldefpackage/gj3;

    .line 1406
    .line 1407
    const v10, 0x7f030012

    .line 1408
    .line 1409
    .line 1410
    invoke-virtual {v1, v10}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v10

    .line 1414
    sget-object v12, Landroidx/media3/ui/PlayerControlView;->U0:[F

    .line 1415
    .line 1416
    invoke-direct {v4, v0, v10, v12}, Ldefpackage/gj3;-><init>(Landroidx/media3/ui/PlayerControlView;[Ljava/lang/String;[F)V

    .line 1417
    .line 1418
    .line 1419
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->A:Ldefpackage/gj3;

    .line 1420
    .line 1421
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1422
    .line 1423
    .line 1424
    move-result-object v4

    .line 1425
    move/from16 v10, v37

    .line 1426
    .line 1427
    invoke-virtual {v1, v10, v4}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v4

    .line 1431
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->h0:Landroid/graphics/drawable/Drawable;

    .line 1432
    .line 1433
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1434
    .line 1435
    .line 1436
    move-result-object v4

    .line 1437
    move/from16 v12, v38

    .line 1438
    .line 1439
    invoke-virtual {v1, v12, v4}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v4

    .line 1443
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->i0:Landroid/graphics/drawable/Drawable;

    .line 1444
    .line 1445
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v4

    .line 1449
    invoke-virtual {v1, v11, v4}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v4

    .line 1453
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->z0:Landroid/graphics/drawable/Drawable;

    .line 1454
    .line 1455
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v4

    .line 1459
    invoke-virtual {v1, v13, v4}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v4

    .line 1463
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->A0:Landroid/graphics/drawable/Drawable;

    .line 1464
    .line 1465
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v4

    .line 1469
    invoke-virtual {v1, v14, v4}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1470
    .line 1471
    .line 1472
    move-result-object v4

    .line 1473
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->j0:Landroid/graphics/drawable/Drawable;

    .line 1474
    .line 1475
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v4

    .line 1479
    invoke-virtual {v1, v15, v4}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1480
    .line 1481
    .line 1482
    move-result-object v4

    .line 1483
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->k0:Landroid/graphics/drawable/Drawable;

    .line 1484
    .line 1485
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1486
    .line 1487
    .line 1488
    move-result-object v4

    .line 1489
    move/from16 v10, v39

    .line 1490
    .line 1491
    invoke-virtual {v1, v10, v4}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v4

    .line 1495
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->l0:Landroid/graphics/drawable/Drawable;

    .line 1496
    .line 1497
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v4

    .line 1501
    move/from16 v10, v40

    .line 1502
    .line 1503
    invoke-virtual {v1, v10, v4}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v4

    .line 1507
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->p0:Landroid/graphics/drawable/Drawable;

    .line 1508
    .line 1509
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 1510
    .line 1511
    .line 1512
    move-result-object v4

    .line 1513
    move/from16 v10, v41

    .line 1514
    .line 1515
    invoke-virtual {v1, v10, v4}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v4

    .line 1519
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->q0:Landroid/graphics/drawable/Drawable;

    .line 1520
    .line 1521
    const v4, 0x7f130119

    .line 1522
    .line 1523
    .line 1524
    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v4

    .line 1528
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->B0:Ljava/lang/String;

    .line 1529
    .line 1530
    const v4, 0x7f130118

    .line 1531
    .line 1532
    .line 1533
    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v4

    .line 1537
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->C0:Ljava/lang/String;

    .line 1538
    .line 1539
    const v4, 0x7f130125

    .line 1540
    .line 1541
    .line 1542
    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v4

    .line 1546
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->m0:Ljava/lang/String;

    .line 1547
    .line 1548
    const v4, 0x7f130126

    .line 1549
    .line 1550
    .line 1551
    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v4

    .line 1555
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->n0:Ljava/lang/String;

    .line 1556
    .line 1557
    const v4, 0x7f130124

    .line 1558
    .line 1559
    .line 1560
    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v4

    .line 1564
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->o0:Ljava/lang/String;

    .line 1565
    .line 1566
    const v4, 0x7f13012c

    .line 1567
    .line 1568
    .line 1569
    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v4

    .line 1573
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->t0:Ljava/lang/String;

    .line 1574
    .line 1575
    const v4, 0x7f13012b

    .line 1576
    .line 1577
    .line 1578
    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1579
    .line 1580
    .line 1581
    move-result-object v1

    .line 1582
    iput-object v1, v0, Landroidx/media3/ui/PlayerControlView;->u0:Ljava/lang/String;

    .line 1583
    .line 1584
    const v1, 0x7f0a0208

    .line 1585
    .line 1586
    .line 1587
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1588
    .line 1589
    .line 1590
    move-result-object v1

    .line 1591
    check-cast v1, Landroid/view/ViewGroup;

    .line 1592
    .line 1593
    const/4 v10, 0x1

    .line 1594
    invoke-virtual {v8, v1, v10}, Ldefpackage/qj3;->h(Landroid/view/View;Z)V

    .line 1595
    .line 1596
    .line 1597
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->J:Landroid/view/View;

    .line 1598
    .line 1599
    move/from16 v4, v45

    .line 1600
    .line 1601
    invoke-virtual {v8, v1, v4}, Ldefpackage/qj3;->h(Landroid/view/View;Z)V

    .line 1602
    .line 1603
    .line 1604
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->K:Landroid/view/View;

    .line 1605
    .line 1606
    move/from16 v4, v44

    .line 1607
    .line 1608
    invoke-virtual {v8, v1, v4}, Ldefpackage/qj3;->h(Landroid/view/View;Z)V

    .line 1609
    .line 1610
    .line 1611
    move/from16 v1, v46

    .line 1612
    .line 1613
    invoke-virtual {v8, v2, v1}, Ldefpackage/qj3;->h(Landroid/view/View;Z)V

    .line 1614
    .line 1615
    .line 1616
    move/from16 v1, v47

    .line 1617
    .line 1618
    invoke-virtual {v8, v3, v1}, Ldefpackage/qj3;->h(Landroid/view/View;Z)V

    .line 1619
    .line 1620
    .line 1621
    invoke-virtual {v8, v5, v9}, Ldefpackage/qj3;->h(Landroid/view/View;Z)V

    .line 1622
    .line 1623
    .line 1624
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->Q:Landroid/widget/ImageView;

    .line 1625
    .line 1626
    invoke-virtual {v8, v1, v7}, Ldefpackage/qj3;->h(Landroid/view/View;Z)V

    .line 1627
    .line 1628
    .line 1629
    move-object/from16 v2, p4

    .line 1630
    .line 1631
    move/from16 v1, v23

    .line 1632
    .line 1633
    invoke-virtual {v8, v2, v1}, Ldefpackage/qj3;->h(Landroid/view/View;Z)V

    .line 1634
    .line 1635
    .line 1636
    iget v1, v0, Landroidx/media3/ui/PlayerControlView;->N0:I

    .line 1637
    .line 1638
    if-eqz v1, :cond_17

    .line 1639
    .line 1640
    const/4 v6, 0x1

    .line 1641
    :cond_17
    move-object/from16 v4, p3

    .line 1642
    .line 1643
    invoke-virtual {v8, v4, v6}, Ldefpackage/qj3;->h(Landroid/view/View;Z)V

    .line 1644
    .line 1645
    .line 1646
    new-instance v1, Ldefpackage/cs1;

    .line 1647
    .line 1648
    const/4 v10, 0x1

    .line 1649
    invoke-direct {v1, v10, v0}, Ldefpackage/cs1;-><init>(ILjava/lang/Object;)V

    .line 1650
    .line 1651
    .line 1652
    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 1653
    .line 1654
    .line 1655
    return-void
.end method

.method public static a(Landroidx/media3/ui/PlayerControlView;Ldefpackage/qi3;J)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->I0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    const/16 v0, 0x11

    .line 6
    .line 7
    invoke-interface {p1, v0}, Ldefpackage/qi3;->S0(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_3

    .line 12
    .line 13
    const/16 v0, 0xa

    .line 14
    .line 15
    invoke-interface {p1, v0}, Ldefpackage/qi3;->S0(I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    invoke-interface {p1}, Ldefpackage/qi3;->x0()Ldefpackage/cu4;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ldefpackage/cu4;->o()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v2, 0x0

    .line 30
    :goto_0
    iget-object v3, p0, Landroidx/media3/ui/PlayerControlView;->f0:Ldefpackage/bu4;

    .line 31
    .line 32
    const-wide/16 v4, 0x0

    .line 33
    .line 34
    invoke-virtual {v0, v2, v3, v4, v5}, Ldefpackage/cu4;->m(ILdefpackage/bu4;J)Ldefpackage/bu4;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    iget-wide v3, v3, Ldefpackage/bu4;->l:J

    .line 39
    .line 40
    invoke-static {v3, v4}, Ldefpackage/f35;->i0(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v3

    .line 44
    cmp-long v5, p2, v3

    .line 45
    .line 46
    if-gez v5, :cond_0

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    add-int/lit8 v5, v1, -0x1

    .line 50
    .line 51
    if-ne v2, v5, :cond_1

    .line 52
    .line 53
    move-wide p2, v3

    .line 54
    :goto_1
    invoke-interface {p1, v2, p2, p3}, Ldefpackage/qi3;->n(IJ)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_1
    sub-long/2addr p2, v3

    .line 59
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    const/4 v0, 0x5

    .line 63
    invoke-interface {p1, v0}, Ldefpackage/qi3;->S0(I)Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    if-eqz v0, :cond_3

    .line 68
    .line 69
    invoke-interface {p1, p2, p3}, Ldefpackage/qi3;->O(J)V

    .line 70
    .line 71
    .line 72
    :cond_3
    :goto_2
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->n()V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public static synthetic b(Landroidx/media3/ui/PlayerControlView;F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/media3/ui/PlayerControlView;->setPlaybackSpeed(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static c(Ldefpackage/qi3;Ldefpackage/bu4;)Z
    .locals 8

    .line 1
    const/16 v0, 0x11

    .line 2
    .line 3
    invoke-interface {p0, v0}, Ldefpackage/qi3;->S0(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-interface {p0}, Ldefpackage/qi3;->x0()Ldefpackage/cu4;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Ldefpackage/cu4;->o()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-le v0, v2, :cond_4

    .line 21
    .line 22
    const/16 v3, 0x64

    .line 23
    .line 24
    if-le v0, v3, :cond_1

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move v3, v1

    .line 28
    :goto_0
    if-ge v3, v0, :cond_3

    .line 29
    .line 30
    const-wide/16 v4, 0x0

    .line 31
    .line 32
    invoke-virtual {p0, v3, p1, v4, v5}, Ldefpackage/cu4;->m(ILdefpackage/bu4;J)Ldefpackage/bu4;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    iget-wide v4, v4, Ldefpackage/bu4;->l:J

    .line 37
    .line 38
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    cmp-long v4, v4, v6

    .line 44
    .line 45
    if-nez v4, :cond_2

    .line 46
    .line 47
    return v1

    .line 48
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    return v2

    .line 52
    :cond_4
    :goto_1
    return v1
.end method

.method private setPlaybackSpeed(F)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/16 v1, 0xd

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ldefpackage/qi3;->S0(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 15
    .line 16
    invoke-interface {p0}, Ldefpackage/qi3;->i()Ldefpackage/qh3;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Ldefpackage/qh3;

    .line 21
    .line 22
    iget v0, v0, Ldefpackage/qh3;->b:F

    .line 23
    .line 24
    invoke-direct {v1, p1, v0}, Ldefpackage/qh3;-><init>(FF)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0, v1}, Ldefpackage/qi3;->d(Ldefpackage/qh3;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final d(Ldefpackage/dw3;Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->y:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldefpackage/dw3;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->p()V

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerControlView;->T0:Z

    .line 11
    .line 12
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView;->E:Landroid/widget/PopupWindow;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->T0:Z

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getWidth()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    sub-int/2addr v0, v1

    .line 29
    iget p0, p0, Landroidx/media3/ui/PlayerControlView;->F:I

    .line 30
    .line 31
    sub-int/2addr v0, p0

    .line 32
    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getHeight()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    neg-int v1, v1

    .line 37
    sub-int/2addr v1, p0

    .line 38
    invoke-virtual {p1, p2, v0, v1}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 12

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_9

    .line 9
    .line 10
    const/16 v3, 0x58

    .line 11
    .line 12
    const/16 v4, 0x57

    .line 13
    .line 14
    const/16 v5, 0x7f

    .line 15
    .line 16
    const/16 v6, 0x7e

    .line 17
    .line 18
    const/16 v7, 0x4f

    .line 19
    .line 20
    const/16 v8, 0x55

    .line 21
    .line 22
    const/16 v9, 0x59

    .line 23
    .line 24
    const/16 v10, 0x5a

    .line 25
    .line 26
    if-eq v0, v10, :cond_0

    .line 27
    .line 28
    if-eq v0, v9, :cond_0

    .line 29
    .line 30
    if-eq v0, v8, :cond_0

    .line 31
    .line 32
    if-eq v0, v7, :cond_0

    .line 33
    .line 34
    if-eq v0, v6, :cond_0

    .line 35
    .line 36
    if-eq v0, v5, :cond_0

    .line 37
    .line 38
    if-eq v0, v4, :cond_0

    .line 39
    .line 40
    if-ne v0, v3, :cond_9

    .line 41
    .line 42
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 43
    .line 44
    .line 45
    move-result v11

    .line 46
    if-nez v11, :cond_a

    .line 47
    .line 48
    if-ne v0, v10, :cond_1

    .line 49
    .line 50
    invoke-interface {v1}, Ldefpackage/qi3;->g()I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    const/4 p1, 0x4

    .line 55
    if-eq p0, p1, :cond_a

    .line 56
    .line 57
    const/16 p0, 0xc

    .line 58
    .line 59
    invoke-interface {v1, p0}, Ldefpackage/qi3;->S0(I)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_a

    .line 64
    .line 65
    invoke-interface {v1}, Ldefpackage/qi3;->I0()V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_0

    .line 69
    .line 70
    :cond_1
    if-ne v0, v9, :cond_2

    .line 71
    .line 72
    const/16 v9, 0xb

    .line 73
    .line 74
    invoke-interface {v1, v9}, Ldefpackage/qi3;->S0(I)Z

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    if-eqz v9, :cond_2

    .line 79
    .line 80
    invoke-interface {v1}, Ldefpackage/qi3;->J0()V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-nez p1, :cond_a

    .line 89
    .line 90
    if-eq v0, v7, :cond_7

    .line 91
    .line 92
    if-eq v0, v8, :cond_7

    .line 93
    .line 94
    if-eq v0, v4, :cond_6

    .line 95
    .line 96
    if-eq v0, v3, :cond_5

    .line 97
    .line 98
    if-eq v0, v6, :cond_4

    .line 99
    .line 100
    if-eq v0, v5, :cond_3

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_3
    sget-object p0, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 104
    .line 105
    invoke-interface {v1, v2}, Ldefpackage/qi3;->S0(I)Z

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    if-eqz p0, :cond_a

    .line 110
    .line 111
    invoke-interface {v1}, Ldefpackage/qi3;->c()V

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_4
    invoke-static {v1}, Ldefpackage/f35;->I(Ldefpackage/qi3;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_5
    const/4 p0, 0x7

    .line 120
    invoke-interface {v1, p0}, Ldefpackage/qi3;->S0(I)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    if-eqz p0, :cond_a

    .line 125
    .line 126
    invoke-interface {v1}, Ldefpackage/qi3;->S()V

    .line 127
    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_6
    const/16 p0, 0x9

    .line 131
    .line 132
    invoke-interface {v1, p0}, Ldefpackage/qi3;->S0(I)Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-eqz p0, :cond_a

    .line 137
    .line 138
    invoke-interface {v1}, Ldefpackage/qi3;->H0()V

    .line 139
    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_7
    iget-boolean p0, p0, Landroidx/media3/ui/PlayerControlView;->H0:Z

    .line 143
    .line 144
    invoke-static {v1, p0}, Ldefpackage/f35;->d0(Ldefpackage/qi3;Z)Z

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    if-eqz p0, :cond_8

    .line 149
    .line 150
    invoke-static {v1}, Ldefpackage/f35;->I(Ldefpackage/qi3;)Z

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_8
    invoke-interface {v1, v2}, Ldefpackage/qi3;->S0(I)Z

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    if-eqz p0, :cond_a

    .line 159
    .line 160
    invoke-interface {v1}, Ldefpackage/qi3;->c()V

    .line 161
    .line 162
    .line 163
    goto :goto_0

    .line 164
    :cond_9
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 165
    .line 166
    .line 167
    move-result p0

    .line 168
    if-eqz p0, :cond_b

    .line 169
    .line 170
    :cond_a
    :goto_0
    return v2

    .line 171
    :cond_b
    const/4 p0, 0x0

    .line 172
    return p0
.end method

.method public final e(Ldefpackage/jw4;I)Ldefpackage/gy3;
    .locals 23

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "initialCapacity"

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    invoke-static {v2, v1}, Ldefpackage/uc5;->f(ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    new-array v1, v2, [Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v3, v0, Ldefpackage/jw4;->a:Ldefpackage/yw1;

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    :goto_0
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    if-ge v5, v7, :cond_21

    .line 20
    .line 21
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    check-cast v7, Ldefpackage/iw4;

    .line 26
    .line 27
    iget-object v8, v7, Ldefpackage/iw4;->b:Ldefpackage/sv4;

    .line 28
    .line 29
    iget v8, v8, Ldefpackage/sv4;->c:I

    .line 30
    .line 31
    move/from16 v9, p2

    .line 32
    .line 33
    if-eq v8, v9, :cond_0

    .line 34
    .line 35
    :goto_1
    move-object/from16 v11, p0

    .line 36
    .line 37
    move-object/from16 v16, v3

    .line 38
    .line 39
    goto/16 :goto_19

    .line 40
    .line 41
    :cond_0
    const/4 v8, 0x0

    .line 42
    :goto_2
    iget v10, v7, Ldefpackage/iw4;->a:I

    .line 43
    .line 44
    if-ge v8, v10, :cond_20

    .line 45
    .line 46
    iget-object v10, v7, Ldefpackage/iw4;->d:[I

    .line 47
    .line 48
    aget v10, v10, v8

    .line 49
    .line 50
    if-eq v10, v2, :cond_1

    .line 51
    .line 52
    :goto_3
    move-object/from16 v11, p0

    .line 53
    .line 54
    move-object/from16 v16, v3

    .line 55
    .line 56
    move-object/from16 v17, v7

    .line 57
    .line 58
    goto/16 :goto_18

    .line 59
    .line 60
    :cond_1
    invoke-virtual {v7, v8}, Ldefpackage/iw4;->a(I)Ldefpackage/tb1;

    .line 61
    .line 62
    .line 63
    move-result-object v10

    .line 64
    iget v11, v10, Ldefpackage/tb1;->e:I

    .line 65
    .line 66
    iget v12, v10, Ldefpackage/tb1;->j:I

    .line 67
    .line 68
    const/4 v13, 0x2

    .line 69
    and-int/2addr v11, v13

    .line 70
    if-eqz v11, :cond_2

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_2
    move-object/from16 v11, p0

    .line 74
    .line 75
    iget-object v14, v11, Landroidx/media3/ui/PlayerControlView;->D:Ldefpackage/zg5;

    .line 76
    .line 77
    iget-object v15, v14, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v15, Landroid/content/res/Resources;

    .line 80
    .line 81
    iget-object v2, v14, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, Landroid/content/res/Resources;

    .line 84
    .line 85
    iget-object v4, v10, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 86
    .line 87
    iget v13, v10, Ldefpackage/tb1;->F:I

    .line 88
    .line 89
    move-object/from16 v16, v3

    .line 90
    .line 91
    iget v3, v10, Ldefpackage/tb1;->v:I

    .line 92
    .line 93
    move-object/from16 v17, v4

    .line 94
    .line 95
    iget v4, v10, Ldefpackage/tb1;->u:I

    .line 96
    .line 97
    move/from16 v18, v6

    .line 98
    .line 99
    iget-object v6, v10, Ldefpackage/tb1;->k:Ljava/lang/String;

    .line 100
    .line 101
    move-object/from16 v19, v6

    .line 102
    .line 103
    invoke-static/range {v17 .. v17}, Ldefpackage/lw2;->h(Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v6

    .line 107
    move-object/from16 v17, v7

    .line 108
    .line 109
    const/4 v7, -0x1

    .line 110
    if-eq v6, v7, :cond_3

    .line 111
    .line 112
    goto :goto_a

    .line 113
    :cond_3
    if-nez v19, :cond_5

    .line 114
    .line 115
    :cond_4
    const/16 v21, 0x0

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_5
    invoke-static/range {v19 .. v19}, Ldefpackage/f35;->e0(Ljava/lang/String;)[Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    array-length v9, v6

    .line 123
    const/4 v7, 0x0

    .line 124
    :goto_4
    if-ge v7, v9, :cond_4

    .line 125
    .line 126
    aget-object v21, v6, v7

    .line 127
    .line 128
    invoke-static/range {v21 .. v21}, Ldefpackage/lw2;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v21

    .line 132
    if-eqz v21, :cond_6

    .line 133
    .line 134
    invoke-static/range {v21 .. v21}, Ldefpackage/lw2;->l(Ljava/lang/String;)Z

    .line 135
    .line 136
    .line 137
    move-result v22

    .line 138
    if-eqz v22, :cond_6

    .line 139
    .line 140
    goto :goto_5

    .line 141
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :goto_5
    if-eqz v21, :cond_8

    .line 145
    .line 146
    :cond_7
    :goto_6
    const/4 v6, 0x2

    .line 147
    goto :goto_a

    .line 148
    :cond_8
    if-nez v19, :cond_a

    .line 149
    .line 150
    :cond_9
    const/4 v6, 0x0

    .line 151
    goto :goto_8

    .line 152
    :cond_a
    invoke-static/range {v19 .. v19}, Ldefpackage/f35;->e0(Ljava/lang/String;)[Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    array-length v7, v6

    .line 157
    const/4 v9, 0x0

    .line 158
    :goto_7
    if-ge v9, v7, :cond_9

    .line 159
    .line 160
    aget-object v19, v6, v9

    .line 161
    .line 162
    invoke-static/range {v19 .. v19}, Ldefpackage/lw2;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v19

    .line 166
    if-eqz v19, :cond_b

    .line 167
    .line 168
    invoke-static/range {v19 .. v19}, Ldefpackage/lw2;->i(Ljava/lang/String;)Z

    .line 169
    .line 170
    .line 171
    move-result v21

    .line 172
    if-eqz v21, :cond_b

    .line 173
    .line 174
    move-object/from16 v6, v19

    .line 175
    .line 176
    goto :goto_8

    .line 177
    :cond_b
    add-int/lit8 v9, v9, 0x1

    .line 178
    .line 179
    goto :goto_7

    .line 180
    :goto_8
    if-eqz v6, :cond_d

    .line 181
    .line 182
    :cond_c
    :goto_9
    const/4 v6, 0x1

    .line 183
    goto :goto_a

    .line 184
    :cond_d
    const/4 v6, -0x1

    .line 185
    if-ne v4, v6, :cond_7

    .line 186
    .line 187
    if-eq v3, v6, :cond_e

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_e
    if-ne v13, v6, :cond_c

    .line 191
    .line 192
    iget v7, v10, Ldefpackage/tb1;->G:I

    .line 193
    .line 194
    if-eq v7, v6, :cond_f

    .line 195
    .line 196
    goto :goto_9

    .line 197
    :cond_f
    const/4 v6, -0x1

    .line 198
    :goto_a
    const v9, 0x7f13013a

    .line 199
    .line 200
    .line 201
    const-string v19, ""

    .line 202
    .line 203
    const/4 v7, 0x2

    .line 204
    const v20, 0x49742400    # 1000000.0f

    .line 205
    .line 206
    .line 207
    if-ne v6, v7, :cond_13

    .line 208
    .line 209
    invoke-virtual {v14, v10}, Ldefpackage/zg5;->o(Ldefpackage/tb1;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    const/4 v7, -0x1

    .line 214
    if-eq v4, v7, :cond_11

    .line 215
    .line 216
    if-ne v3, v7, :cond_10

    .line 217
    .line 218
    goto :goto_b

    .line 219
    :cond_10
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 220
    .line 221
    .line 222
    move-result-object v4

    .line 223
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    filled-new-array {v4, v3}, [Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    const v4, 0x7f13013c

    .line 232
    .line 233
    .line 234
    invoke-virtual {v15, v4, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    goto :goto_c

    .line 239
    :cond_11
    :goto_b
    move-object/from16 v3, v19

    .line 240
    .line 241
    :goto_c
    if-ne v12, v7, :cond_12

    .line 242
    .line 243
    :goto_d
    move-object/from16 v2, v19

    .line 244
    .line 245
    goto :goto_e

    .line 246
    :cond_12
    int-to-float v4, v12

    .line 247
    div-float v4, v4, v20

    .line 248
    .line 249
    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    invoke-virtual {v2, v9, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v19

    .line 261
    goto :goto_d

    .line 262
    :goto_e
    filled-new-array {v6, v3, v2}, [Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    invoke-virtual {v14, v2}, Ldefpackage/zg5;->x([Ljava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    goto/16 :goto_14

    .line 271
    .line 272
    :cond_13
    const/4 v3, 0x1

    .line 273
    if-ne v6, v3, :cond_1b

    .line 274
    .line 275
    invoke-virtual {v14, v10}, Ldefpackage/zg5;->n(Ldefpackage/tb1;)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    const/4 v6, -0x1

    .line 280
    if-eq v13, v6, :cond_19

    .line 281
    .line 282
    if-ge v13, v3, :cond_14

    .line 283
    .line 284
    goto :goto_10

    .line 285
    :cond_14
    if-eq v13, v3, :cond_18

    .line 286
    .line 287
    const/4 v7, 0x2

    .line 288
    if-eq v13, v7, :cond_17

    .line 289
    .line 290
    const/4 v3, 0x6

    .line 291
    if-eq v13, v3, :cond_16

    .line 292
    .line 293
    const/4 v3, 0x7

    .line 294
    if-eq v13, v3, :cond_16

    .line 295
    .line 296
    const/16 v3, 0x8

    .line 297
    .line 298
    if-eq v13, v3, :cond_15

    .line 299
    .line 300
    const v3, 0x7f130145

    .line 301
    .line 302
    .line 303
    invoke-virtual {v15, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v3

    .line 307
    :goto_f
    const/4 v6, -0x1

    .line 308
    goto :goto_11

    .line 309
    :cond_15
    const v3, 0x7f130147

    .line 310
    .line 311
    .line 312
    invoke-virtual {v15, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v3

    .line 316
    goto :goto_f

    .line 317
    :cond_16
    const v3, 0x7f130146

    .line 318
    .line 319
    .line 320
    invoke-virtual {v15, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    goto :goto_f

    .line 325
    :cond_17
    const v3, 0x7f130144

    .line 326
    .line 327
    .line 328
    invoke-virtual {v15, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    goto :goto_f

    .line 333
    :cond_18
    const v3, 0x7f13013b

    .line 334
    .line 335
    .line 336
    invoke-virtual {v15, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v3

    .line 340
    goto :goto_f

    .line 341
    :cond_19
    :goto_10
    move-object/from16 v3, v19

    .line 342
    .line 343
    goto :goto_f

    .line 344
    :goto_11
    if-ne v12, v6, :cond_1a

    .line 345
    .line 346
    :goto_12
    move-object/from16 v2, v19

    .line 347
    .line 348
    goto :goto_13

    .line 349
    :cond_1a
    int-to-float v6, v12

    .line 350
    div-float v6, v6, v20

    .line 351
    .line 352
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 353
    .line 354
    .line 355
    move-result-object v6

    .line 356
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v6

    .line 360
    invoke-virtual {v2, v9, v6}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v19

    .line 364
    goto :goto_12

    .line 365
    :goto_13
    filled-new-array {v4, v3, v2}, [Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    invoke-virtual {v14, v2}, Ldefpackage/zg5;->x([Ljava/lang/String;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    goto :goto_14

    .line 374
    :cond_1b
    invoke-virtual {v14, v10}, Ldefpackage/zg5;->n(Ldefpackage/tb1;)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v2

    .line 378
    :goto_14
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 379
    .line 380
    .line 381
    move-result v3

    .line 382
    if-nez v3, :cond_1c

    .line 383
    .line 384
    goto :goto_16

    .line 385
    :cond_1c
    iget-object v2, v10, Ldefpackage/tb1;->d:Ljava/lang/String;

    .line 386
    .line 387
    if-eqz v2, :cond_1e

    .line 388
    .line 389
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v3

    .line 393
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 394
    .line 395
    .line 396
    move-result v3

    .line 397
    if-eqz v3, :cond_1d

    .line 398
    .line 399
    goto :goto_15

    .line 400
    :cond_1d
    const v3, 0x7f130149

    .line 401
    .line 402
    .line 403
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    invoke-virtual {v15, v3, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    goto :goto_16

    .line 412
    :cond_1e
    :goto_15
    const v2, 0x7f130148

    .line 413
    .line 414
    .line 415
    invoke-virtual {v15, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    :goto_16
    new-instance v3, Ldefpackage/lj3;

    .line 420
    .line 421
    invoke-direct {v3, v0, v5, v8, v2}, Ldefpackage/lj3;-><init>(Ldefpackage/jw4;IILjava/lang/String;)V

    .line 422
    .line 423
    .line 424
    array-length v2, v1

    .line 425
    add-int/lit8 v6, v18, 0x1

    .line 426
    .line 427
    invoke-static {v2, v6}, Ldefpackage/qw1;->b(II)I

    .line 428
    .line 429
    .line 430
    move-result v2

    .line 431
    array-length v4, v1

    .line 432
    if-gt v2, v4, :cond_1f

    .line 433
    .line 434
    goto :goto_17

    .line 435
    :cond_1f
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    :goto_17
    aput-object v3, v1, v18

    .line 440
    .line 441
    :goto_18
    add-int/lit8 v8, v8, 0x1

    .line 442
    .line 443
    move/from16 v9, p2

    .line 444
    .line 445
    move-object/from16 v3, v16

    .line 446
    .line 447
    move-object/from16 v7, v17

    .line 448
    .line 449
    const/4 v2, 0x4

    .line 450
    goto/16 :goto_2

    .line 451
    .line 452
    :cond_20
    move/from16 v18, v6

    .line 453
    .line 454
    goto/16 :goto_1

    .line 455
    .line 456
    :goto_19
    add-int/lit8 v5, v5, 0x1

    .line 457
    .line 458
    move-object/from16 v3, v16

    .line 459
    .line 460
    const/4 v2, 0x4

    .line 461
    goto/16 :goto_0

    .line 462
    .line 463
    :cond_21
    invoke-static {v6, v1}, Ldefpackage/yw1;->i(I[Ljava/lang/Object;)Ldefpackage/gy3;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    return-object v0
.end method

.method public final f(Ldefpackage/qi3;)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->u:Ljava/lang/Class;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final g(Ldefpackage/qi3;)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->r:Ljava/lang/Class;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public getPlayer()Ldefpackage/qi3;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRepeatToggleModes()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/ui/PlayerControlView;->N0:I

    .line 2
    .line 3
    return p0
.end method

.method public getShowShuffleButton()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->n:Ldefpackage/qj3;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->O:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ldefpackage/qj3;->b(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public getShowSubtitleButton()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->n:Ldefpackage/qj3;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->Q:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ldefpackage/qj3;->b(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public getShowTimeoutMs()I
    .locals 0

    .line 1
    iget p0, p0, Landroidx/media3/ui/PlayerControlView;->K0:I

    .line 2
    .line 3
    return p0
.end method

.method public getShowVrButton()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->n:Ldefpackage/qj3;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->P:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ldefpackage/qj3;->b(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final h(Ldefpackage/qi3;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerControlView;->g(Ldefpackage/qi3;)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->t:Ljava/lang/reflect/Method;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    check-cast v1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception p0

    .line 31
    goto :goto_1

    .line 32
    :catch_1
    move-exception p0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    :goto_0
    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerControlView;->f(Ldefpackage/qi3;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->w:Ljava/lang/reflect/Method;

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    check-cast p0, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 55
    .line 56
    .line 57
    move-result p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    if-eqz p0, :cond_2

    .line 59
    .line 60
    :cond_1
    const/4 p0, 0x1

    .line 61
    return p0

    .line 62
    :cond_2
    return v0

    .line 63
    :goto_1
    invoke-static {p0}, Ldefpackage/er1;->m(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    return v0
.end method

.method public final i()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

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

.method public final j(Landroid/view/View;Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 5
    .line 6
    .line 7
    if-eqz p2, :cond_1

    .line 8
    .line 9
    iget p0, p0, Landroidx/media3/ui/PlayerControlView;->r0:F

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    iget p0, p0, Landroidx/media3/ui/PlayerControlView;->s0:F

    .line 13
    .line 14
    :goto_0
    invoke-virtual {p1, p0}, Landroid/view/View;->setAlpha(F)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final k()V
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->F0:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_4

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-boolean v1, p0, Landroidx/media3/ui/PlayerControlView;->G0:Z

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->f0:Ldefpackage/bu4;

    .line 22
    .line 23
    invoke-static {v0, v1}, Landroidx/media3/ui/PlayerControlView;->c(Ldefpackage/qi3;Ldefpackage/bu4;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    const/16 v1, 0xa

    .line 30
    .line 31
    invoke-interface {v0, v1}, Ldefpackage/qi3;->S0(I)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x5

    .line 37
    invoke-interface {v0, v1}, Ldefpackage/qi3;->S0(I)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    :goto_0
    const/4 v2, 0x7

    .line 42
    invoke-interface {v0, v2}, Ldefpackage/qi3;->S0(I)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const/16 v3, 0xb

    .line 47
    .line 48
    invoke-interface {v0, v3}, Ldefpackage/qi3;->S0(I)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const/16 v4, 0xc

    .line 53
    .line 54
    invoke-interface {v0, v4}, Ldefpackage/qi3;->S0(I)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    const/16 v5, 0x9

    .line 59
    .line 60
    invoke-interface {v0, v5}, Ldefpackage/qi3;->S0(I)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    const/4 v1, 0x0

    .line 66
    move v0, v1

    .line 67
    move v2, v0

    .line 68
    move v3, v2

    .line 69
    move v4, v3

    .line 70
    :goto_1
    iget-object v5, p0, Landroidx/media3/ui/PlayerControlView;->o:Landroid/content/res/Resources;

    .line 71
    .line 72
    iget-object v6, p0, Landroidx/media3/ui/PlayerControlView;->K:Landroid/view/View;

    .line 73
    .line 74
    const-wide/16 v7, 0x3e8

    .line 75
    .line 76
    if-eqz v3, :cond_5

    .line 77
    .line 78
    iget-object v9, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 79
    .line 80
    if-eqz v9, :cond_3

    .line 81
    .line 82
    invoke-interface {v9}, Ldefpackage/qi3;->O0()J

    .line 83
    .line 84
    .line 85
    move-result-wide v9

    .line 86
    goto :goto_2

    .line 87
    :cond_3
    const-wide/16 v9, 0x1388

    .line 88
    .line 89
    :goto_2
    div-long/2addr v9, v7

    .line 90
    long-to-int v9, v9

    .line 91
    iget-object v10, p0, Landroidx/media3/ui/PlayerControlView;->M:Landroid/widget/TextView;

    .line 92
    .line 93
    if-eqz v10, :cond_4

    .line 94
    .line 95
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v11

    .line 99
    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    .line 101
    .line 102
    :cond_4
    if-eqz v6, :cond_5

    .line 103
    .line 104
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object v10

    .line 108
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v10

    .line 112
    const v11, 0x7f120002

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5, v11, v9, v10}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    invoke-virtual {v6, v9}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 120
    .line 121
    .line 122
    :cond_5
    iget-object v9, p0, Landroidx/media3/ui/PlayerControlView;->J:Landroid/view/View;

    .line 123
    .line 124
    if-eqz v4, :cond_8

    .line 125
    .line 126
    iget-object v10, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 127
    .line 128
    if-eqz v10, :cond_6

    .line 129
    .line 130
    invoke-interface {v10}, Ldefpackage/qi3;->X()J

    .line 131
    .line 132
    .line 133
    move-result-wide v10

    .line 134
    goto :goto_3

    .line 135
    :cond_6
    const-wide/16 v10, 0x3a98

    .line 136
    .line 137
    :goto_3
    div-long/2addr v10, v7

    .line 138
    long-to-int v7, v10

    .line 139
    iget-object v8, p0, Landroidx/media3/ui/PlayerControlView;->L:Landroid/widget/TextView;

    .line 140
    .line 141
    if-eqz v8, :cond_7

    .line 142
    .line 143
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v10

    .line 147
    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 148
    .line 149
    .line 150
    :cond_7
    if-eqz v9, :cond_8

    .line 151
    .line 152
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object v8

    .line 156
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    const v10, 0x7f120001

    .line 161
    .line 162
    .line 163
    invoke-virtual {v5, v10, v7, v8}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    invoke-virtual {v9, v5}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 168
    .line 169
    .line 170
    :cond_8
    iget-object v5, p0, Landroidx/media3/ui/PlayerControlView;->G:Landroid/widget/ImageView;

    .line 171
    .line 172
    invoke-virtual {p0, v5, v2}, Landroidx/media3/ui/PlayerControlView;->j(Landroid/view/View;Z)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0, v6, v3}, Landroidx/media3/ui/PlayerControlView;->j(Landroid/view/View;Z)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p0, v9, v4}, Landroidx/media3/ui/PlayerControlView;->j(Landroid/view/View;Z)V

    .line 179
    .line 180
    .line 181
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->H:Landroid/widget/ImageView;

    .line 182
    .line 183
    invoke-virtual {p0, v2, v0}, Landroidx/media3/ui/PlayerControlView;->j(Landroid/view/View;Z)V

    .line 184
    .line 185
    .line 186
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->b0:Landroidx/media3/ui/DefaultTimeBar;

    .line 187
    .line 188
    if-eqz p0, :cond_9

    .line 189
    .line 190
    invoke-virtual {p0, v1}, Landroidx/media3/ui/DefaultTimeBar;->setEnabled(Z)V

    .line 191
    .line 192
    .line 193
    :cond_9
    :goto_4
    return-void
.end method

.method public final l()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->F0:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_3

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->I:Landroid/widget/ImageView;

    .line 13
    .line 14
    if-eqz v0, :cond_5

    .line 15
    .line 16
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 17
    .line 18
    iget-boolean v2, p0, Landroidx/media3/ui/PlayerControlView;->H0:Z

    .line 19
    .line 20
    invoke-static {v1, v2}, Ldefpackage/f35;->d0(Ldefpackage/qi3;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->h0:Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->i0:Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    :goto_0
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const v1, 0x7f130121

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    const v1, 0x7f130120

    .line 38
    .line 39
    .line 40
    :goto_1
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 41
    .line 42
    .line 43
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->o:Landroid/content/res/Resources;

    .line 44
    .line 45
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    invoke-interface {v1, v2}, Ldefpackage/qi3;->S0(I)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_3

    .line 62
    .line 63
    const/16 v3, 0x11

    .line 64
    .line 65
    invoke-interface {v1, v3}, Ldefpackage/qi3;->S0(I)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_4

    .line 70
    .line 71
    invoke-interface {v1}, Ldefpackage/qi3;->x0()Ldefpackage/cu4;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {v1}, Ldefpackage/cu4;->p()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-nez v1, :cond_3

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_3
    const/4 v2, 0x0

    .line 83
    :cond_4
    :goto_2
    invoke-virtual {p0, v0, v2}, Landroidx/media3/ui/PlayerControlView;->j(Landroid/view/View;Z)V

    .line 84
    .line 85
    .line 86
    :cond_5
    :goto_3
    return-void
.end method

.method public final m()V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-interface {v0}, Ldefpackage/qi3;->i()Ldefpackage/qh3;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget v0, v0, Ldefpackage/qh3;->a:F

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 14
    .line 15
    .line 16
    move v3, v1

    .line 17
    move v4, v3

    .line 18
    :goto_0
    iget-object v5, p0, Landroidx/media3/ui/PlayerControlView;->A:Ldefpackage/gj3;

    .line 19
    .line 20
    iget-object v6, v5, Ldefpackage/gj3;->r:[F

    .line 21
    .line 22
    array-length v7, v6

    .line 23
    if-ge v3, v7, :cond_2

    .line 24
    .line 25
    aget v5, v6, v3

    .line 26
    .line 27
    sub-float v5, v0, v5

    .line 28
    .line 29
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    cmpg-float v6, v5, v2

    .line 34
    .line 35
    if-gez v6, :cond_1

    .line 36
    .line 37
    move v4, v3

    .line 38
    move v2, v5

    .line 39
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    iput v4, v5, Ldefpackage/gj3;->s:I

    .line 43
    .line 44
    iget-object v0, v5, Ldefpackage/gj3;->q:[Ljava/lang/String;

    .line 45
    .line 46
    aget-object v0, v0, v4

    .line 47
    .line 48
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->z:Ldefpackage/jj3;

    .line 49
    .line 50
    iget-object v3, v2, Ldefpackage/jj3;->r:[Ljava/lang/String;

    .line 51
    .line 52
    aput-object v0, v3, v1

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    invoke-virtual {v2, v0}, Ldefpackage/jj3;->p(I)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-nez v3, :cond_3

    .line 60
    .line 61
    invoke-virtual {v2, v1}, Ldefpackage/jj3;->p(I)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_4

    .line 66
    .line 67
    :cond_3
    move v1, v0

    .line 68
    :cond_4
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->T:Landroid/view/View;

    .line 69
    .line 70
    invoke-virtual {p0, v0, v1}, Landroidx/media3/ui/PlayerControlView;->j(Landroid/view/View;Z)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final n()V
    .locals 15

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->F0:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/16 v1, 0x10

    .line 18
    .line 19
    invoke-interface {v0, v1}, Ldefpackage/qi3;->S0(I)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    iget-wide v1, p0, Landroidx/media3/ui/PlayerControlView;->S0:J

    .line 26
    .line 27
    invoke-interface {v0}, Ldefpackage/qi3;->Z()J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    add-long/2addr v3, v1

    .line 32
    iget-wide v1, p0, Landroidx/media3/ui/PlayerControlView;->S0:J

    .line 33
    .line 34
    invoke-interface {v0}, Ldefpackage/qi3;->F0()J

    .line 35
    .line 36
    .line 37
    move-result-wide v5

    .line 38
    add-long/2addr v5, v1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const-wide/16 v3, 0x0

    .line 41
    .line 42
    move-wide v5, v3

    .line 43
    :goto_0
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->a0:Landroid/widget/TextView;

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    iget-boolean v2, p0, Landroidx/media3/ui/PlayerControlView;->J0:Z

    .line 48
    .line 49
    if-nez v2, :cond_2

    .line 50
    .line 51
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->c0:Ljava/lang/StringBuilder;

    .line 52
    .line 53
    iget-object v7, p0, Landroidx/media3/ui/PlayerControlView;->d0:Ljava/util/Formatter;

    .line 54
    .line 55
    invoke-static {v2, v7, v3, v4}, Ldefpackage/f35;->F(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 60
    .line 61
    .line 62
    :cond_2
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->b0:Landroidx/media3/ui/DefaultTimeBar;

    .line 63
    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    invoke-virtual {v1, v3, v4}, Landroidx/media3/ui/DefaultTimeBar;->setPosition(J)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v0}, Landroidx/media3/ui/PlayerControlView;->h(Ldefpackage/qi3;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_3

    .line 74
    .line 75
    move-wide v5, v3

    .line 76
    :cond_3
    invoke-virtual {v1, v5, v6}, Landroidx/media3/ui/DefaultTimeBar;->setBufferedPosition(J)V

    .line 77
    .line 78
    .line 79
    :cond_4
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->g0:Ldefpackage/qa1;

    .line 80
    .line 81
    invoke-virtual {p0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 82
    .line 83
    .line 84
    const/4 v5, 0x1

    .line 85
    if-nez v0, :cond_5

    .line 86
    .line 87
    move v6, v5

    .line 88
    goto :goto_1

    .line 89
    :cond_5
    invoke-interface {v0}, Ldefpackage/qi3;->g()I

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    :goto_1
    const-wide/16 v7, 0x3e8

    .line 94
    .line 95
    if-eqz v0, :cond_8

    .line 96
    .line 97
    invoke-interface {v0}, Ldefpackage/qi3;->h0()Z

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    if-eqz v9, :cond_8

    .line 102
    .line 103
    if-eqz v1, :cond_6

    .line 104
    .line 105
    invoke-virtual {v1}, Landroidx/media3/ui/DefaultTimeBar;->getPreferredUpdateDelay()J

    .line 106
    .line 107
    .line 108
    move-result-wide v5

    .line 109
    goto :goto_2

    .line 110
    :cond_6
    move-wide v5, v7

    .line 111
    :goto_2
    rem-long/2addr v3, v7

    .line 112
    sub-long v3, v7, v3

    .line 113
    .line 114
    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 115
    .line 116
    .line 117
    move-result-wide v3

    .line 118
    invoke-interface {v0}, Ldefpackage/qi3;->i()Ldefpackage/qh3;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    iget v0, v0, Ldefpackage/qh3;->a:F

    .line 123
    .line 124
    const/4 v1, 0x0

    .line 125
    cmpl-float v1, v0, v1

    .line 126
    .line 127
    if-lez v1, :cond_7

    .line 128
    .line 129
    long-to-float v1, v3

    .line 130
    div-float/2addr v1, v0

    .line 131
    float-to-long v7, v1

    .line 132
    :cond_7
    move-wide v9, v7

    .line 133
    iget v0, p0, Landroidx/media3/ui/PlayerControlView;->M0:I

    .line 134
    .line 135
    int-to-long v11, v0

    .line 136
    const-wide/16 v13, 0x3e8

    .line 137
    .line 138
    invoke-static/range {v9 .. v14}, Ldefpackage/f35;->k(JJJ)J

    .line 139
    .line 140
    .line 141
    move-result-wide v0

    .line 142
    invoke-virtual {p0, v2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_8
    const/4 v0, 0x4

    .line 147
    if-eq v6, v0, :cond_9

    .line 148
    .line 149
    if-eq v6, v5, :cond_9

    .line 150
    .line 151
    invoke-virtual {p0, v2, v7, v8}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 152
    .line 153
    .line 154
    :cond_9
    :goto_3
    return-void
.end method

.method public final o()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->F0:Z

    .line 8
    .line 9
    if-eqz v0, :cond_7

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->N:Landroid/widget/ImageView;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget v1, p0, Landroidx/media3/ui/PlayerControlView;->N0:I

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0, v0, v2}, Landroidx/media3/ui/PlayerControlView;->j(Landroid/view/View;Z)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 26
    .line 27
    iget-object v3, p0, Landroidx/media3/ui/PlayerControlView;->m0:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v4, p0, Landroidx/media3/ui/PlayerControlView;->j0:Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    if-eqz v1, :cond_6

    .line 32
    .line 33
    const/16 v5, 0xf

    .line 34
    .line 35
    invoke-interface {v1, v5}, Ldefpackage/qi3;->S0(I)Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    if-nez v5, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const/4 v2, 0x1

    .line 43
    invoke-virtual {p0, v0, v2}, Landroidx/media3/ui/PlayerControlView;->j(Landroid/view/View;Z)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v1}, Ldefpackage/qi3;->h()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_5

    .line 51
    .line 52
    if-eq v1, v2, :cond_4

    .line 53
    .line 54
    const/4 v2, 0x2

    .line 55
    if-eq v1, v2, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->l0:Landroid/graphics/drawable/Drawable;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 61
    .line 62
    .line 63
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->o0:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v0, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_4
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->k0:Landroid/graphics/drawable/Drawable;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 72
    .line 73
    .line 74
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->n0:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v0, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_5
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_6
    :goto_0
    invoke-virtual {p0, v0, v2}, Landroidx/media3/ui/PlayerControlView;->j(Landroid/view/View;Z)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 94
    .line 95
    .line 96
    :cond_7
    :goto_1
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->n:Ldefpackage/qj3;

    .line 5
    .line 6
    iget-object v1, v0, Ldefpackage/qj3;->a:Landroidx/media3/ui/PlayerControlView;

    .line 7
    .line 8
    iget-object v2, v0, Ldefpackage/qj3;->y:Ldefpackage/cs1;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    iput-boolean v1, p0, Landroidx/media3/ui/PlayerControlView;->F0:Z

    .line 15
    .line 16
    iget v1, v0, Ldefpackage/qj3;->A:I

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    iget-object v1, v0, Ldefpackage/qj3;->a:Landroidx/media3/ui/PlayerControlView;

    .line 21
    .line 22
    invoke-virtual {v1}, Landroidx/media3/ui/PlayerControlView;->i()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Ldefpackage/qj3;->g()V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->l()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->k()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->o()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->q()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->s()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->m()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->r()V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->n:Ldefpackage/qj3;

    .line 5
    .line 6
    iget-object v1, v0, Ldefpackage/qj3;->a:Landroidx/media3/ui/PlayerControlView;

    .line 7
    .line 8
    iget-object v2, v0, Ldefpackage/qj3;->y:Ldefpackage/cs1;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-boolean v1, p0, Landroidx/media3/ui/PlayerControlView;->F0:Z

    .line 15
    .line 16
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->g0:Ldefpackage/qa1;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ldefpackage/qj3;->f()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->n:Ldefpackage/qj3;

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/qj3;->b:Landroid/view/View;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    sub-int/2addr p4, p2

    .line 11
    sub-int/2addr p5, p3

    .line 12
    const/4 p1, 0x0

    .line 13
    invoke-virtual {p0, p1, p1, p4, p5}, Landroid/view/View;->layout(IIII)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final p()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->y:Landroidx/recyclerview/widget/RecyclerView;

    .line 3
    .line 4
    invoke-virtual {v1, v0, v0}, Landroid/view/View;->measure(II)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v2, p0, Landroidx/media3/ui/PlayerControlView;->F:I

    .line 12
    .line 13
    mul-int/lit8 v3, v2, 0x2

    .line 14
    .line 15
    sub-int/2addr v0, v3

    .line 16
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v3, p0, Landroidx/media3/ui/PlayerControlView;->E:Landroid/widget/PopupWindow;

    .line 25
    .line 26
    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    mul-int/lit8 v2, v2, 0x2

    .line 34
    .line 35
    sub-int/2addr p0, v2

    .line 36
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    invoke-virtual {v3, p0}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final q()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_6

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerControlView;->F0:Z

    .line 8
    .line 9
    if-eqz v0, :cond_6

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->O:Landroid/widget/ImageView;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 17
    .line 18
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->n:Ldefpackage/qj3;

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ldefpackage/qj3;->b(Landroid/view/View;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0, v0, v3}, Landroidx/media3/ui/PlayerControlView;->j(Landroid/view/View;Z)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->u0:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v4, p0, Landroidx/media3/ui/PlayerControlView;->q0:Landroid/graphics/drawable/Drawable;

    .line 34
    .line 35
    if-eqz v1, :cond_5

    .line 36
    .line 37
    const/16 v5, 0xe

    .line 38
    .line 39
    invoke-interface {v1, v5}, Ldefpackage/qi3;->S0(I)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-nez v5, :cond_2

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 v3, 0x1

    .line 47
    invoke-virtual {p0, v0, v3}, Landroidx/media3/ui/PlayerControlView;->j(Landroid/view/View;Z)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v1}, Ldefpackage/qi3;->D0()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_3

    .line 55
    .line 56
    iget-object v4, p0, Landroidx/media3/ui/PlayerControlView;->p0:Landroid/graphics/drawable/Drawable;

    .line 57
    .line 58
    :cond_3
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v1}, Ldefpackage/qi3;->D0()Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-eqz v1, :cond_4

    .line 66
    .line 67
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->t0:Ljava/lang/String;

    .line 68
    .line 69
    :cond_4
    invoke-virtual {v0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_5
    :goto_0
    invoke-virtual {p0, v0, v3}, Landroidx/media3/ui/PlayerControlView;->j(Landroid/view/View;Z)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    :cond_6
    :goto_1
    return-void
.end method

.method public final r()V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-boolean v2, v0, Landroidx/media3/ui/PlayerControlView;->G0:Z

    .line 9
    .line 10
    iget-object v3, v0, Landroidx/media3/ui/PlayerControlView;->f0:Ldefpackage/bu4;

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x1

    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    invoke-static {v1, v3}, Landroidx/media3/ui/PlayerControlView;->c(Ldefpackage/qi3;Ldefpackage/bu4;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    move v2, v5

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move v2, v4

    .line 25
    :goto_0
    iput-boolean v2, v0, Landroidx/media3/ui/PlayerControlView;->I0:Z

    .line 26
    .line 27
    const-wide/16 v6, 0x0

    .line 28
    .line 29
    iput-wide v6, v0, Landroidx/media3/ui/PlayerControlView;->S0:J

    .line 30
    .line 31
    const/16 v2, 0x11

    .line 32
    .line 33
    invoke-interface {v1, v2}, Ldefpackage/qi3;->S0(I)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    invoke-interface {v1}, Ldefpackage/qi3;->x0()Ldefpackage/cu4;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    sget-object v2, Ldefpackage/cu4;->a:Ldefpackage/yt4;

    .line 45
    .line 46
    :goto_1
    invoke-virtual {v2}, Ldefpackage/cu4;->p()Z

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    if-nez v8, :cond_13

    .line 56
    .line 57
    invoke-interface {v1}, Ldefpackage/qi3;->o0()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    iget-boolean v8, v0, Landroidx/media3/ui/PlayerControlView;->I0:Z

    .line 62
    .line 63
    if-eqz v8, :cond_3

    .line 64
    .line 65
    move v11, v4

    .line 66
    goto :goto_2

    .line 67
    :cond_3
    move v11, v1

    .line 68
    :goto_2
    if-eqz v8, :cond_4

    .line 69
    .line 70
    invoke-virtual {v2}, Ldefpackage/cu4;->o()I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    sub-int/2addr v8, v5

    .line 75
    goto :goto_3

    .line 76
    :cond_4
    move v8, v1

    .line 77
    :goto_3
    move v14, v4

    .line 78
    move-wide v12, v6

    .line 79
    :goto_4
    if-gt v11, v8, :cond_6

    .line 80
    .line 81
    move-wide v15, v6

    .line 82
    if-ne v11, v1, :cond_5

    .line 83
    .line 84
    invoke-static {v12, v13}, Ldefpackage/f35;->i0(J)J

    .line 85
    .line 86
    .line 87
    move-result-wide v6

    .line 88
    iput-wide v6, v0, Landroidx/media3/ui/PlayerControlView;->S0:J

    .line 89
    .line 90
    :cond_5
    invoke-virtual {v2, v11, v3}, Ldefpackage/cu4;->n(ILdefpackage/bu4;)V

    .line 91
    .line 92
    .line 93
    iget-wide v6, v3, Ldefpackage/bu4;->l:J

    .line 94
    .line 95
    cmp-long v6, v6, v9

    .line 96
    .line 97
    if-nez v6, :cond_7

    .line 98
    .line 99
    iget-boolean v1, v0, Landroidx/media3/ui/PlayerControlView;->I0:Z

    .line 100
    .line 101
    xor-int/2addr v1, v5

    .line 102
    invoke-static {v1}, Ldefpackage/rr2;->w(Z)V

    .line 103
    .line 104
    .line 105
    :cond_6
    move v2, v5

    .line 106
    goto/16 :goto_c

    .line 107
    .line 108
    :cond_7
    iget v6, v3, Ldefpackage/bu4;->m:I

    .line 109
    .line 110
    :goto_5
    iget v7, v3, Ldefpackage/bu4;->n:I

    .line 111
    .line 112
    if-gt v6, v7, :cond_12

    .line 113
    .line 114
    iget-object v7, v0, Landroidx/media3/ui/PlayerControlView;->e0:Ldefpackage/zt4;

    .line 115
    .line 116
    invoke-virtual {v2, v6, v7, v4}, Ldefpackage/cu4;->f(ILdefpackage/zt4;Z)Ldefpackage/zt4;

    .line 117
    .line 118
    .line 119
    move-wide/from16 v17, v9

    .line 120
    .line 121
    iget-object v9, v7, Ldefpackage/zt4;->g:Ldefpackage/z5;

    .line 122
    .line 123
    iget v10, v9, Ldefpackage/z5;->d:I

    .line 124
    .line 125
    iget v9, v9, Ldefpackage/z5;->a:I

    .line 126
    .line 127
    :goto_6
    if-ge v10, v9, :cond_11

    .line 128
    .line 129
    invoke-virtual {v7, v10}, Ldefpackage/zt4;->d(I)J

    .line 130
    .line 131
    .line 132
    move-result-wide v19

    .line 133
    const-wide/high16 v21, -0x8000000000000000L

    .line 134
    .line 135
    cmp-long v21, v19, v21

    .line 136
    .line 137
    if-nez v21, :cond_a

    .line 138
    .line 139
    iget-wide v4, v7, Ldefpackage/zt4;->d:J

    .line 140
    .line 141
    cmp-long v19, v4, v17

    .line 142
    .line 143
    if-nez v19, :cond_9

    .line 144
    .line 145
    :cond_8
    move/from16 v16, v1

    .line 146
    .line 147
    move-object/from16 v24, v2

    .line 148
    .line 149
    const/4 v2, 0x1

    .line 150
    goto/16 :goto_b

    .line 151
    .line 152
    :cond_9
    move-wide/from16 v19, v4

    .line 153
    .line 154
    :cond_a
    iget-wide v4, v7, Ldefpackage/zt4;->e:J

    .line 155
    .line 156
    add-long v19, v19, v4

    .line 157
    .line 158
    cmp-long v4, v19, v15

    .line 159
    .line 160
    if-ltz v4, :cond_8

    .line 161
    .line 162
    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->O0:[J

    .line 163
    .line 164
    array-length v5, v4

    .line 165
    if-ne v14, v5, :cond_c

    .line 166
    .line 167
    array-length v5, v4

    .line 168
    if-nez v5, :cond_b

    .line 169
    .line 170
    const/4 v5, 0x1

    .line 171
    goto :goto_7

    .line 172
    :cond_b
    array-length v5, v4

    .line 173
    mul-int/lit8 v5, v5, 0x2

    .line 174
    .line 175
    :goto_7
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->O0:[J

    .line 180
    .line 181
    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->P0:[Z

    .line 182
    .line 183
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    iput-object v4, v0, Landroidx/media3/ui/PlayerControlView;->P0:[Z

    .line 188
    .line 189
    :cond_c
    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->O0:[J

    .line 190
    .line 191
    add-long v19, v12, v19

    .line 192
    .line 193
    invoke-static/range {v19 .. v20}, Ldefpackage/f35;->i0(J)J

    .line 194
    .line 195
    .line 196
    move-result-wide v19

    .line 197
    aput-wide v19, v4, v14

    .line 198
    .line 199
    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->P0:[Z

    .line 200
    .line 201
    iget-object v5, v7, Ldefpackage/zt4;->g:Ldefpackage/z5;

    .line 202
    .line 203
    invoke-virtual {v5, v10}, Ldefpackage/z5;->a(I)Ldefpackage/x5;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    iget v15, v5, Ldefpackage/x5;->b:I

    .line 208
    .line 209
    move/from16 v16, v1

    .line 210
    .line 211
    const/4 v1, -0x1

    .line 212
    if-ne v15, v1, :cond_d

    .line 213
    .line 214
    move-object/from16 v24, v2

    .line 215
    .line 216
    const/4 v2, 0x1

    .line 217
    const/16 v22, 0x1

    .line 218
    .line 219
    goto :goto_a

    .line 220
    :cond_d
    const/4 v1, 0x0

    .line 221
    :goto_8
    if-ge v1, v15, :cond_10

    .line 222
    .line 223
    move/from16 v23, v1

    .line 224
    .line 225
    iget-object v1, v5, Ldefpackage/x5;->f:[I

    .line 226
    .line 227
    aget v1, v1, v23

    .line 228
    .line 229
    move-object/from16 v24, v2

    .line 230
    .line 231
    const/4 v2, 0x1

    .line 232
    if-eqz v1, :cond_f

    .line 233
    .line 234
    if-ne v1, v2, :cond_e

    .line 235
    .line 236
    goto :goto_9

    .line 237
    :cond_e
    add-int/lit8 v1, v23, 0x1

    .line 238
    .line 239
    move-object/from16 v2, v24

    .line 240
    .line 241
    goto :goto_8

    .line 242
    :cond_f
    :goto_9
    move/from16 v22, v2

    .line 243
    .line 244
    goto :goto_a

    .line 245
    :cond_10
    move-object/from16 v24, v2

    .line 246
    .line 247
    const/4 v2, 0x1

    .line 248
    const/16 v22, 0x0

    .line 249
    .line 250
    :goto_a
    xor-int/lit8 v1, v22, 0x1

    .line 251
    .line 252
    aput-boolean v1, v4, v14

    .line 253
    .line 254
    add-int/lit8 v14, v14, 0x1

    .line 255
    .line 256
    :goto_b
    add-int/lit8 v10, v10, 0x1

    .line 257
    .line 258
    move v5, v2

    .line 259
    move/from16 v1, v16

    .line 260
    .line 261
    move-object/from16 v2, v24

    .line 262
    .line 263
    const/4 v4, 0x0

    .line 264
    const-wide/16 v15, 0x0

    .line 265
    .line 266
    goto/16 :goto_6

    .line 267
    .line 268
    :cond_11
    move/from16 v16, v1

    .line 269
    .line 270
    move-object/from16 v24, v2

    .line 271
    .line 272
    move v2, v5

    .line 273
    add-int/lit8 v6, v6, 0x1

    .line 274
    .line 275
    move-wide/from16 v9, v17

    .line 276
    .line 277
    move-object/from16 v2, v24

    .line 278
    .line 279
    const/4 v4, 0x0

    .line 280
    const-wide/16 v15, 0x0

    .line 281
    .line 282
    goto/16 :goto_5

    .line 283
    .line 284
    :cond_12
    move/from16 v16, v1

    .line 285
    .line 286
    move-object/from16 v24, v2

    .line 287
    .line 288
    move v2, v5

    .line 289
    move-wide/from16 v17, v9

    .line 290
    .line 291
    iget-wide v4, v3, Ldefpackage/bu4;->l:J

    .line 292
    .line 293
    add-long/2addr v12, v4

    .line 294
    add-int/lit8 v11, v11, 0x1

    .line 295
    .line 296
    move v5, v2

    .line 297
    move-object/from16 v2, v24

    .line 298
    .line 299
    const/4 v4, 0x0

    .line 300
    const-wide/16 v6, 0x0

    .line 301
    .line 302
    goto/16 :goto_4

    .line 303
    .line 304
    :goto_c
    move-wide v6, v12

    .line 305
    goto :goto_e

    .line 306
    :cond_13
    move v2, v5

    .line 307
    move-wide/from16 v17, v9

    .line 308
    .line 309
    const/16 v3, 0x10

    .line 310
    .line 311
    invoke-interface {v1, v3}, Ldefpackage/qi3;->S0(I)Z

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    if-eqz v3, :cond_14

    .line 316
    .line 317
    invoke-interface {v1}, Ldefpackage/qi3;->x()J

    .line 318
    .line 319
    .line 320
    move-result-wide v3

    .line 321
    cmp-long v1, v3, v17

    .line 322
    .line 323
    if-eqz v1, :cond_14

    .line 324
    .line 325
    invoke-static {v3, v4}, Ldefpackage/f35;->Q(J)J

    .line 326
    .line 327
    .line 328
    move-result-wide v6

    .line 329
    :goto_d
    const/4 v14, 0x0

    .line 330
    goto :goto_e

    .line 331
    :cond_14
    const-wide/16 v6, 0x0

    .line 332
    .line 333
    goto :goto_d

    .line 334
    :goto_e
    invoke-static {v6, v7}, Ldefpackage/f35;->i0(J)J

    .line 335
    .line 336
    .line 337
    move-result-wide v3

    .line 338
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->W:Landroid/widget/TextView;

    .line 339
    .line 340
    if-eqz v1, :cond_15

    .line 341
    .line 342
    iget-object v5, v0, Landroidx/media3/ui/PlayerControlView;->c0:Ljava/lang/StringBuilder;

    .line 343
    .line 344
    iget-object v6, v0, Landroidx/media3/ui/PlayerControlView;->d0:Ljava/util/Formatter;

    .line 345
    .line 346
    invoke-static {v5, v6, v3, v4}, Ldefpackage/f35;->F(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v5

    .line 350
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 351
    .line 352
    .line 353
    :cond_15
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->b0:Landroidx/media3/ui/DefaultTimeBar;

    .line 354
    .line 355
    if-eqz v1, :cond_19

    .line 356
    .line 357
    invoke-virtual {v1, v3, v4}, Landroidx/media3/ui/DefaultTimeBar;->setDuration(J)V

    .line 358
    .line 359
    .line 360
    iget-object v3, v0, Landroidx/media3/ui/PlayerControlView;->Q0:[J

    .line 361
    .line 362
    array-length v4, v3

    .line 363
    add-int v5, v14, v4

    .line 364
    .line 365
    iget-object v6, v0, Landroidx/media3/ui/PlayerControlView;->O0:[J

    .line 366
    .line 367
    array-length v7, v6

    .line 368
    if-le v5, v7, :cond_16

    .line 369
    .line 370
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 371
    .line 372
    .line 373
    move-result-object v6

    .line 374
    iput-object v6, v0, Landroidx/media3/ui/PlayerControlView;->O0:[J

    .line 375
    .line 376
    iget-object v6, v0, Landroidx/media3/ui/PlayerControlView;->P0:[Z

    .line 377
    .line 378
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([ZI)[Z

    .line 379
    .line 380
    .line 381
    move-result-object v6

    .line 382
    iput-object v6, v0, Landroidx/media3/ui/PlayerControlView;->P0:[Z

    .line 383
    .line 384
    :cond_16
    iget-object v6, v0, Landroidx/media3/ui/PlayerControlView;->O0:[J

    .line 385
    .line 386
    const/4 v7, 0x0

    .line 387
    invoke-static {v3, v7, v6, v14, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 388
    .line 389
    .line 390
    iget-object v3, v0, Landroidx/media3/ui/PlayerControlView;->R0:[Z

    .line 391
    .line 392
    iget-object v6, v0, Landroidx/media3/ui/PlayerControlView;->P0:[Z

    .line 393
    .line 394
    invoke-static {v3, v7, v6, v14, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 395
    .line 396
    .line 397
    iget-object v3, v0, Landroidx/media3/ui/PlayerControlView;->O0:[J

    .line 398
    .line 399
    iget-object v4, v0, Landroidx/media3/ui/PlayerControlView;->P0:[Z

    .line 400
    .line 401
    if-eqz v5, :cond_18

    .line 402
    .line 403
    if-eqz v3, :cond_17

    .line 404
    .line 405
    if-eqz v4, :cond_17

    .line 406
    .line 407
    goto :goto_f

    .line 408
    :cond_17
    move v2, v7

    .line 409
    :cond_18
    :goto_f
    invoke-static {v2}, Ldefpackage/rr2;->l(Z)V

    .line 410
    .line 411
    .line 412
    iput v5, v1, Landroidx/media3/ui/DefaultTimeBar;->c0:I

    .line 413
    .line 414
    iput-object v3, v1, Landroidx/media3/ui/DefaultTimeBar;->d0:[J

    .line 415
    .line 416
    iput-object v4, v1, Landroidx/media3/ui/DefaultTimeBar;->e0:[Z

    .line 417
    .line 418
    invoke-virtual {v1}, Landroidx/media3/ui/DefaultTimeBar;->e()V

    .line 419
    .line 420
    .line 421
    :cond_19
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerControlView;->n()V

    .line 422
    .line 423
    .line 424
    return-void
.end method

.method public final s()V
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->B:Ldefpackage/cj3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 7
    .line 8
    iput-object v1, v0, Ldefpackage/cj3;->q:Ljava/util/List;

    .line 9
    .line 10
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->C:Ldefpackage/cj3;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iput-object v1, v2, Ldefpackage/cj3;->q:Ljava/util/List;

    .line 16
    .line 17
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 18
    .line 19
    iget-object v3, p0, Landroidx/media3/ui/PlayerControlView;->Q:Landroid/widget/ImageView;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x1

    .line 23
    if-eqz v1, :cond_6

    .line 24
    .line 25
    const/16 v6, 0x1e

    .line 26
    .line 27
    invoke-interface {v1, v6}, Ldefpackage/qi3;->S0(I)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_6

    .line 32
    .line 33
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 34
    .line 35
    const/16 v6, 0x1d

    .line 36
    .line 37
    invoke-interface {v1, v6}, Ldefpackage/qi3;->S0(I)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_0

    .line 42
    .line 43
    goto/16 :goto_2

    .line 44
    .line 45
    :cond_0
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 46
    .line 47
    invoke-interface {v1}, Ldefpackage/qi3;->e0()Ldefpackage/jw4;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p0, v1, v5}, Landroidx/media3/ui/PlayerControlView;->e(Ldefpackage/jw4;I)Ldefpackage/gy3;

    .line 52
    .line 53
    .line 54
    move-result-object v6

    .line 55
    iput-object v6, v2, Ldefpackage/cj3;->q:Ljava/util/List;

    .line 56
    .line 57
    iget-object v7, v2, Ldefpackage/cj3;->t:Landroidx/media3/ui/PlayerControlView;

    .line 58
    .line 59
    iget-object v8, v7, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 60
    .line 61
    iget-object v9, v7, Landroidx/media3/ui/PlayerControlView;->z:Ldefpackage/jj3;

    .line 62
    .line 63
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-interface {v8}, Ldefpackage/qi3;->E0()Ldefpackage/cw4;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    if-eqz v10, :cond_1

    .line 75
    .line 76
    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    const v6, 0x7f130142

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    iget-object v6, v9, Ldefpackage/jj3;->r:[Ljava/lang/String;

    .line 88
    .line 89
    aput-object v2, v6, v5

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_1
    invoke-virtual {v2, v8}, Ldefpackage/cj3;->p(Ldefpackage/cw4;)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_2

    .line 97
    .line 98
    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    const v6, 0x7f130141

    .line 103
    .line 104
    .line 105
    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    iget-object v6, v9, Ldefpackage/jj3;->r:[Ljava/lang/String;

    .line 110
    .line 111
    aput-object v2, v6, v5

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_2
    move v2, v4

    .line 115
    :goto_0
    iget v7, v6, Ldefpackage/gy3;->q:I

    .line 116
    .line 117
    if-ge v2, v7, :cond_4

    .line 118
    .line 119
    invoke-virtual {v6, v2}, Ldefpackage/gy3;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    check-cast v7, Ldefpackage/lj3;

    .line 124
    .line 125
    iget-object v8, v7, Ldefpackage/lj3;->a:Ldefpackage/iw4;

    .line 126
    .line 127
    iget v10, v7, Ldefpackage/lj3;->b:I

    .line 128
    .line 129
    iget-object v8, v8, Ldefpackage/iw4;->e:[Z

    .line 130
    .line 131
    aget-boolean v8, v8, v10

    .line 132
    .line 133
    if-eqz v8, :cond_3

    .line 134
    .line 135
    iget-object v2, v7, Ldefpackage/lj3;->c:Ljava/lang/String;

    .line 136
    .line 137
    iget-object v6, v9, Ldefpackage/jj3;->r:[Ljava/lang/String;

    .line 138
    .line 139
    aput-object v2, v6, v5

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_4
    :goto_1
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->n:Ldefpackage/qj3;

    .line 146
    .line 147
    invoke-virtual {v2, v3}, Ldefpackage/qj3;->b(Landroid/view/View;)Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-eqz v2, :cond_5

    .line 152
    .line 153
    const/4 v2, 0x3

    .line 154
    invoke-virtual {p0, v1, v2}, Landroidx/media3/ui/PlayerControlView;->e(Ldefpackage/jw4;I)Ldefpackage/gy3;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v0, v1}, Ldefpackage/cj3;->q(Ljava/util/List;)V

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_5
    sget-object v1, Ldefpackage/gy3;->r:Ldefpackage/gy3;

    .line 163
    .line 164
    invoke-virtual {v0, v1}, Ldefpackage/cj3;->q(Ljava/util/List;)V

    .line 165
    .line 166
    .line 167
    :cond_6
    :goto_2
    invoke-virtual {v0}, Ldefpackage/cj3;->a()I

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-lez v0, :cond_7

    .line 172
    .line 173
    move v0, v5

    .line 174
    goto :goto_3

    .line 175
    :cond_7
    move v0, v4

    .line 176
    :goto_3
    invoke-virtual {p0, v3, v0}, Landroidx/media3/ui/PlayerControlView;->j(Landroid/view/View;Z)V

    .line 177
    .line 178
    .line 179
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->z:Ldefpackage/jj3;

    .line 180
    .line 181
    invoke-virtual {v0, v5}, Ldefpackage/jj3;->p(I)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-nez v1, :cond_8

    .line 186
    .line 187
    invoke-virtual {v0, v4}, Ldefpackage/jj3;->p(I)Z

    .line 188
    .line 189
    .line 190
    move-result v0

    .line 191
    if-eqz v0, :cond_9

    .line 192
    .line 193
    :cond_8
    move v4, v5

    .line 194
    :cond_9
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->T:Landroid/view/View;

    .line 195
    .line 196
    invoke-virtual {p0, v0, v4}, Landroidx/media3/ui/PlayerControlView;->j(Landroid/view/View;Z)V

    .line 197
    .line 198
    .line 199
    return-void
.end method

.method public setAnimationEnabled(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->n:Ldefpackage/qj3;

    .line 2
    .line 3
    iput-boolean p1, p0, Ldefpackage/qj3;->D:Z

    .line 4
    .line 5
    return-void
.end method

.method public setMediaRouteButtonViewProvider(Ldefpackage/v75;)V
    .locals 3

    .line 1
    const v0, 0x7f0a021a

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    const/16 p0, 0x8

    .line 13
    .line 14
    invoke-virtual {v0, p0}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/view/ViewGroup;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-interface {p1}, Ldefpackage/v75;->a()Ldefpackage/ic2;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v2, Ldefpackage/yc5;

    .line 31
    .line 32
    invoke-direct {v2, p0, v0, v1}, Ldefpackage/yc5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->p:Landroid/os/Handler;

    .line 36
    .line 37
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    new-instance v0, Ldefpackage/ym;

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-direct {v0, p0, v1}, Ldefpackage/ym;-><init>(Landroid/os/Handler;I)V

    .line 44
    .line 45
    .line 46
    new-instance p0, Ldefpackage/lg1;

    .line 47
    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-direct {p0, v1, p1, v2}, Ldefpackage/lg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p1, p0, v0}, Ldefpackage/ic2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    const-string p0, "The media route button placeholder has no parent view."

    .line 57
    .line 58
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_2
    const-string p0, "The media route button placeholder is missing."

    .line 63
    .line 64
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public setOnFullScreenModeChangedListener(Ldefpackage/ej3;)V
    .locals 5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    move v2, v1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move v2, v0

    .line 8
    :goto_0
    const/16 v3, 0x8

    .line 9
    .line 10
    iget-object v4, p0, Landroidx/media3/ui/PlayerControlView;->R:Landroid/widget/ImageView;

    .line 11
    .line 12
    if-nez v4, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    if-eqz v2, :cond_2

    .line 16
    .line 17
    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_2
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    :goto_1
    if-eqz p1, :cond_3

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_3
    move v1, v0

    .line 28
    :goto_2
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->S:Landroid/widget/ImageView;

    .line 29
    .line 30
    if-nez p0, :cond_4

    .line 31
    .line 32
    return-void

    .line 33
    :cond_4
    if-eqz v1, :cond_5

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_5
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public setPlayer(Ldefpackage/qi3;)V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    move v0, v3

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move v0, v2

    .line 16
    :goto_0
    invoke-static {v0}, Ldefpackage/rr2;->w(Z)V

    .line 17
    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-interface {p1}, Ldefpackage/qi3;->U0()Landroid/os/Looper;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-ne v0, v1, :cond_2

    .line 30
    .line 31
    :cond_1
    move v2, v3

    .line 32
    :cond_2
    invoke-static {v2}, Ldefpackage/rr2;->l(Z)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 36
    .line 37
    if-ne v0, p1, :cond_3

    .line 38
    .line 39
    return-void

    .line 40
    :cond_3
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->q:Ldefpackage/dj3;

    .line 41
    .line 42
    if-eqz v0, :cond_4

    .line 43
    .line 44
    invoke-interface {v0, v1}, Ldefpackage/qi3;->r0(Ldefpackage/oi3;)V

    .line 45
    .line 46
    .line 47
    :cond_4
    iput-object p1, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 48
    .line 49
    if-eqz p1, :cond_5

    .line 50
    .line 51
    invoke-interface {p1, v1}, Ldefpackage/qi3;->v(Ldefpackage/oi3;)V

    .line 52
    .line 53
    .line 54
    :cond_5
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->l()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->k()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->o()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->q()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->s()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->m()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->r()V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public setProgressUpdateListener(Ldefpackage/hj3;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setRepeatToggleModes(I)V
    .locals 4

    .line 1
    iput p1, p0, Landroidx/media3/ui/PlayerControlView;->N0:I

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    const/16 v3, 0xf

    .line 10
    .line 11
    invoke-interface {v0, v3}, Ldefpackage/qi3;->S0(I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 18
    .line 19
    invoke-interface {v0}, Ldefpackage/qi3;->h()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 28
    .line 29
    invoke-interface {v0, v1}, Ldefpackage/qi3;->p0(I)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v3, 0x2

    .line 34
    if-ne p1, v2, :cond_1

    .line 35
    .line 36
    if-ne v0, v3, :cond_1

    .line 37
    .line 38
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 39
    .line 40
    invoke-interface {v0, v2}, Ldefpackage/qi3;->p0(I)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    if-ne p1, v3, :cond_2

    .line 45
    .line 46
    if-ne v0, v2, :cond_2

    .line 47
    .line 48
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 49
    .line 50
    invoke-interface {v0, v3}, Ldefpackage/qi3;->p0(I)V

    .line 51
    .line 52
    .line 53
    :cond_2
    :goto_0
    if-eqz p1, :cond_3

    .line 54
    .line 55
    move v1, v2

    .line 56
    :cond_3
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView;->n:Ldefpackage/qj3;

    .line 57
    .line 58
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->N:Landroid/widget/ImageView;

    .line 59
    .line 60
    invoke-virtual {p1, v0, v1}, Ldefpackage/qj3;->h(Landroid/view/View;Z)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->o()V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public setShowFastForwardButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->n:Ldefpackage/qj3;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->J:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Ldefpackage/qj3;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->k()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowMultiWindowTimeBar(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerControlView;->G0:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->r()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setShowNextButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->n:Ldefpackage/qj3;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->H:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Ldefpackage/qj3;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->k()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowPlayButtonIfPlaybackIsSuppressed(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerControlView;->H0:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->l()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setShowPreviousButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->n:Ldefpackage/qj3;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->G:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Ldefpackage/qj3;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->k()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowRewindButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->n:Ldefpackage/qj3;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->K:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Ldefpackage/qj3;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->k()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowShuffleButton(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->n:Ldefpackage/qj3;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->O:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Ldefpackage/qj3;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerControlView;->q()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setShowSubtitleButton(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->n:Ldefpackage/qj3;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->Q:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, p0, p1}, Ldefpackage/qj3;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setShowTimeoutMs(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/media3/ui/PlayerControlView;->K0:I

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->n:Ldefpackage/qj3;

    .line 4
    .line 5
    iget p1, p0, Ldefpackage/qj3;->A:I

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Ldefpackage/qj3;->a:Landroidx/media3/ui/PlayerControlView;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/media3/ui/PlayerControlView;->i()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Ldefpackage/qj3;->g()V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public setShowVrButton(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->n:Ldefpackage/qj3;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->P:Landroid/widget/ImageView;

    .line 4
    .line 5
    invoke-virtual {v0, p0, p1}, Ldefpackage/qj3;->h(Landroid/view/View;Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setTimeBarMinUpdateInterval(I)V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    const/16 v1, 0x3e8

    .line 4
    .line 5
    invoke-static {p1, v0, v1}, Ldefpackage/f35;->j(III)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    iput p1, p0, Landroidx/media3/ui/PlayerControlView;->M0:I

    .line 10
    .line 11
    return-void
.end method

.method public setTimeBarScrubbingEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerControlView;->L0:Z

    .line 2
    .line 3
    return-void
.end method

.method public setVrButtonListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->P:Landroid/widget/ImageView;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    invoke-virtual {p0, v0, p1}, Landroidx/media3/ui/PlayerControlView;->j(Landroid/view/View;Z)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method
