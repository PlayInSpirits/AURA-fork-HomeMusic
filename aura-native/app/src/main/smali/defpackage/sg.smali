.class public final Ldefpackage/sg;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/sg;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/sg;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 9

    .line 1
    iget v0, p0, Ldefpackage/sg;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Ldefpackage/sg;->o:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v3, Ldefpackage/wk4;

    .line 11
    .line 12
    iget-object p0, v3, Ldefpackage/wk4;->u:Ldefpackage/ev2;

    .line 13
    .line 14
    invoke-virtual {v3}, Ldefpackage/wk4;->b()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iget-boolean v0, p0, Ldefpackage/bc2;->L:Z

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    iget-object v0, v3, Ldefpackage/wk4;->z:Landroid/view/View;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p0}, Ldefpackage/bc2;->f()V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :goto_0
    invoke-virtual {v3}, Ldefpackage/wk4;->dismiss()V

    .line 40
    .line 41
    .line 42
    :cond_2
    :goto_1
    return-void

    .line 43
    :pswitch_0
    check-cast v3, Lcom/google/android/material/navigation/NavigationView;

    .line 44
    .line 45
    iget-object p0, v3, Lcom/google/android/material/navigation/NavigationView;->y:[I

    .line 46
    .line 47
    invoke-virtual {v3, p0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 48
    .line 49
    .line 50
    aget v0, p0, v1

    .line 51
    .line 52
    if-nez v0, :cond_3

    .line 53
    .line 54
    move v0, v1

    .line 55
    goto :goto_2

    .line 56
    :cond_3
    move v0, v2

    .line 57
    :goto_2
    iget-object v4, v3, Lcom/google/android/material/navigation/NavigationView;->v:Ldefpackage/l43;

    .line 58
    .line 59
    iget-boolean v5, v4, Ldefpackage/l43;->K:Z

    .line 60
    .line 61
    if-eq v5, v0, :cond_6

    .line 62
    .line 63
    iput-boolean v0, v4, Ldefpackage/l43;->K:Z

    .line 64
    .line 65
    iget-object v5, v4, Ldefpackage/l43;->o:Landroid/widget/LinearLayout;

    .line 66
    .line 67
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-lez v5, :cond_4

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_4
    iget-boolean v5, v4, Ldefpackage/l43;->K:Z

    .line 75
    .line 76
    if-eqz v5, :cond_5

    .line 77
    .line 78
    iget v5, v4, Ldefpackage/l43;->M:I

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_5
    :goto_3
    move v5, v2

    .line 82
    :goto_4
    iget-object v4, v4, Ldefpackage/l43;->n:Lcom/google/android/material/internal/NavigationMenuView;

    .line 83
    .line 84
    invoke-virtual {v4}, Landroid/view/View;->getPaddingBottom()I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    invoke-virtual {v4, v2, v5, v2, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 89
    .line 90
    .line 91
    :cond_6
    if-eqz v0, :cond_7

    .line 92
    .line 93
    iget-boolean v0, v3, Lcom/google/android/material/navigation/NavigationView;->B:Z

    .line 94
    .line 95
    if-eqz v0, :cond_7

    .line 96
    .line 97
    move v0, v1

    .line 98
    goto :goto_5

    .line 99
    :cond_7
    move v0, v2

    .line 100
    :goto_5
    invoke-virtual {v3, v0}, Ldefpackage/f64;->setDrawTopInsetForeground(Z)V

    .line 101
    .line 102
    .line 103
    aget v0, p0, v2

    .line 104
    .line 105
    if-eqz v0, :cond_9

    .line 106
    .line 107
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 108
    .line 109
    .line 110
    move-result v4

    .line 111
    add-int/2addr v4, v0

    .line 112
    if-nez v4, :cond_8

    .line 113
    .line 114
    goto :goto_6

    .line 115
    :cond_8
    move v0, v2

    .line 116
    goto :goto_7

    .line 117
    :cond_9
    :goto_6
    move v0, v1

    .line 118
    :goto_7
    invoke-virtual {v3, v0}, Ldefpackage/f64;->setDrawLeftInsetForeground(Z)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    :goto_8
    instance-of v4, v0, Landroid/content/ContextWrapper;

    .line 126
    .line 127
    if-eqz v4, :cond_b

    .line 128
    .line 129
    instance-of v4, v0, Landroid/app/Activity;

    .line 130
    .line 131
    if-eqz v4, :cond_a

    .line 132
    .line 133
    check-cast v0, Landroid/app/Activity;

    .line 134
    .line 135
    goto :goto_9

    .line 136
    :cond_a
    check-cast v0, Landroid/content/ContextWrapper;

    .line 137
    .line 138
    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    goto :goto_8

    .line 143
    :cond_b
    const/4 v0, 0x0

    .line 144
    :goto_9
    if-eqz v0, :cond_11

    .line 145
    .line 146
    invoke-static {v0}, Ldefpackage/ya4;->u(Landroid/content/Context;)Landroid/graphics/Rect;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    sub-int/2addr v5, v6

    .line 159
    aget v6, p0, v1

    .line 160
    .line 161
    if-ne v5, v6, :cond_c

    .line 162
    .line 163
    move v5, v1

    .line 164
    goto :goto_a

    .line 165
    :cond_c
    move v5, v2

    .line 166
    :goto_a
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {v0}, Landroid/view/Window;->getNavigationBarColor()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    invoke-static {v0}, Landroid/graphics/Color;->alpha(I)I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-eqz v0, :cond_d

    .line 179
    .line 180
    move v0, v1

    .line 181
    goto :goto_b

    .line 182
    :cond_d
    move v0, v2

    .line 183
    :goto_b
    if-eqz v5, :cond_e

    .line 184
    .line 185
    if-eqz v0, :cond_e

    .line 186
    .line 187
    iget-boolean v0, v3, Lcom/google/android/material/navigation/NavigationView;->C:Z

    .line 188
    .line 189
    if-eqz v0, :cond_e

    .line 190
    .line 191
    move v0, v1

    .line 192
    goto :goto_c

    .line 193
    :cond_e
    move v0, v2

    .line 194
    :goto_c
    invoke-virtual {v3, v0}, Ldefpackage/f64;->setDrawBottomInsetForeground(Z)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 198
    .line 199
    .line 200
    move-result v0

    .line 201
    aget v5, p0, v2

    .line 202
    .line 203
    if-eq v0, v5, :cond_10

    .line 204
    .line 205
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    sub-int/2addr v0, v4

    .line 214
    aget p0, p0, v2

    .line 215
    .line 216
    if-ne v0, p0, :cond_f

    .line 217
    .line 218
    goto :goto_d

    .line 219
    :cond_f
    move v1, v2

    .line 220
    :cond_10
    :goto_d
    invoke-virtual {v3, v1}, Ldefpackage/f64;->setDrawRightInsetForeground(Z)V

    .line 221
    .line 222
    .line 223
    :cond_11
    return-void

    .line 224
    :pswitch_1
    check-cast v3, Ldefpackage/qp2;

    .line 225
    .line 226
    iget-object v0, v3, Ldefpackage/qp2;->R:Landroidx/mediarouter/app/OverlayListView;

    .line 227
    .line 228
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 233
    .line 234
    .line 235
    iget-object p0, v3, Ldefpackage/qp2;->U:Ljava/util/HashSet;

    .line 236
    .line 237
    if-eqz p0, :cond_14

    .line 238
    .line 239
    invoke-virtual {p0}, Ljava/util/HashSet;->size()I

    .line 240
    .line 241
    .line 242
    move-result p0

    .line 243
    if-eqz p0, :cond_14

    .line 244
    .line 245
    new-instance p0, Ldefpackage/gp2;

    .line 246
    .line 247
    invoke-direct {p0, v2, v3}, Ldefpackage/gp2;-><init>(ILjava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    iget-object v0, v3, Ldefpackage/qp2;->R:Landroidx/mediarouter/app/OverlayListView;

    .line 251
    .line 252
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    move v4, v2

    .line 257
    :goto_e
    iget-object v5, v3, Ldefpackage/qp2;->R:Landroidx/mediarouter/app/OverlayListView;

    .line 258
    .line 259
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    .line 260
    .line 261
    .line 262
    move-result v5

    .line 263
    if-ge v2, v5, :cond_15

    .line 264
    .line 265
    iget-object v5, v3, Ldefpackage/qp2;->R:Landroidx/mediarouter/app/OverlayListView;

    .line 266
    .line 267
    invoke-virtual {v5, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    add-int v6, v0, v2

    .line 272
    .line 273
    iget-object v7, v3, Ldefpackage/qp2;->S:Ldefpackage/pp2;

    .line 274
    .line 275
    invoke-virtual {v7, v6}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v6

    .line 279
    check-cast v6, Ldefpackage/wq2;

    .line 280
    .line 281
    iget-object v7, v3, Ldefpackage/qp2;->U:Ljava/util/HashSet;

    .line 282
    .line 283
    invoke-virtual {v7, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v6

    .line 287
    if-eqz v6, :cond_13

    .line 288
    .line 289
    new-instance v6, Landroid/view/animation/AlphaAnimation;

    .line 290
    .line 291
    const/4 v7, 0x0

    .line 292
    const/high16 v8, 0x3f800000    # 1.0f

    .line 293
    .line 294
    invoke-direct {v6, v7, v8}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    .line 295
    .line 296
    .line 297
    iget v7, v3, Ldefpackage/qp2;->u0:I

    .line 298
    .line 299
    int-to-long v7, v7

    .line 300
    invoke-virtual {v6, v7, v8}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v6, v1}, Landroid/view/animation/Animation;->setFillEnabled(Z)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v6, v1}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 307
    .line 308
    .line 309
    if-nez v4, :cond_12

    .line 310
    .line 311
    invoke-virtual {v6, p0}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 312
    .line 313
    .line 314
    move v4, v1

    .line 315
    :cond_12
    invoke-virtual {v5}, Landroid/view/View;->clearAnimation()V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v5, v6}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 319
    .line 320
    .line 321
    :cond_13
    add-int/lit8 v2, v2, 0x1

    .line 322
    .line 323
    goto :goto_e

    .line 324
    :cond_14
    invoke-virtual {v3, v1}, Ldefpackage/qp2;->n(Z)V

    .line 325
    .line 326
    .line 327
    :cond_15
    return-void

    .line 328
    :pswitch_2
    check-cast v3, Lcom/skydoves/colorpickerview/ColorPickerView;

    .line 329
    .line 330
    invoke-virtual {v3}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 335
    .line 336
    .line 337
    iget-object p0, v3, Lcom/skydoves/colorpickerview/ColorPickerView;->G:Ldefpackage/hg3;

    .line 338
    .line 339
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    if-eqz v0, :cond_16

    .line 344
    .line 345
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    instance-of v0, v0, Landroid/view/ViewGroup;

    .line 350
    .line 351
    if-eqz v0, :cond_16

    .line 352
    .line 353
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    check-cast v0, Landroid/view/ViewGroup;

    .line 358
    .line 359
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 360
    .line 361
    .line 362
    :cond_16
    invoke-virtual {v3}, Lcom/skydoves/colorpickerview/ColorPickerView;->getPreferenceName()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    if-eqz v0, :cond_18

    .line 367
    .line 368
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    iget-object v0, p0, Ldefpackage/hg3;->o:Ljava/lang/Object;

    .line 372
    .line 373
    check-cast v0, Landroid/content/SharedPreferences;

    .line 374
    .line 375
    invoke-virtual {v3}, Lcom/skydoves/colorpickerview/ColorPickerView;->getPreferenceName()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    const-string v4, "_COLOR"

    .line 380
    .line 381
    const/4 v5, -0x1

    .line 382
    if-eqz v2, :cond_17

    .line 383
    .line 384
    invoke-virtual {v3}, Lcom/skydoves/colorpickerview/ColorPickerView;->getPreferenceName()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    new-instance v6, Ljava/lang/StringBuilder;

    .line 389
    .line 390
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 394
    .line 395
    .line 396
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v6

    .line 403
    invoke-interface {v0, v6, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 404
    .line 405
    .line 406
    move-result v6

    .line 407
    invoke-virtual {v3, v6}, Lcom/skydoves/colorpickerview/ColorPickerView;->setPureColor(I)V

    .line 408
    .line 409
    .line 410
    new-instance v6, Landroid/graphics/Point;

    .line 411
    .line 412
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 413
    .line 414
    .line 415
    move-result v7

    .line 416
    div-int/lit8 v7, v7, 0x2

    .line 417
    .line 418
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 419
    .line 420
    .line 421
    move-result v8

    .line 422
    div-int/lit8 v8, v8, 0x2

    .line 423
    .line 424
    invoke-direct {v6, v7, v8}, Landroid/graphics/Point;-><init>(II)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {p0, v2, v6}, Ldefpackage/hg3;->D(Ljava/lang/String;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 428
    .line 429
    .line 430
    move-result-object v7

    .line 431
    iget v7, v7, Landroid/graphics/Point;->x:I

    .line 432
    .line 433
    invoke-virtual {p0, v2, v6}, Ldefpackage/hg3;->D(Ljava/lang/String;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 434
    .line 435
    .line 436
    move-result-object p0

    .line 437
    iget p0, p0, Landroid/graphics/Point;->y:I

    .line 438
    .line 439
    new-instance v6, Ljava/lang/StringBuilder;

    .line 440
    .line 441
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    invoke-interface {v0, v2, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 455
    .line 456
    .line 457
    move-result v2

    .line 458
    iput v2, v3, Lcom/skydoves/colorpickerview/ColorPickerView;->n:I

    .line 459
    .line 460
    iput v2, v3, Lcom/skydoves/colorpickerview/ColorPickerView;->o:I

    .line 461
    .line 462
    new-instance v2, Landroid/graphics/Point;

    .line 463
    .line 464
    invoke-direct {v2, v7, p0}, Landroid/graphics/Point;-><init>(II)V

    .line 465
    .line 466
    .line 467
    iput-object v2, v3, Lcom/skydoves/colorpickerview/ColorPickerView;->p:Landroid/graphics/Point;

    .line 468
    .line 469
    invoke-virtual {v3, v7, p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->i(II)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v3}, Lcom/skydoves/colorpickerview/ColorPickerView;->getColor()I

    .line 473
    .line 474
    .line 475
    move-result p0

    .line 476
    invoke-virtual {v3, p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->a(I)V

    .line 477
    .line 478
    .line 479
    iget-object p0, v3, Lcom/skydoves/colorpickerview/ColorPickerView;->p:Landroid/graphics/Point;

    .line 480
    .line 481
    invoke-virtual {v3, p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->f(Landroid/graphics/Point;)V

    .line 482
    .line 483
    .line 484
    :cond_17
    invoke-virtual {v3}, Lcom/skydoves/colorpickerview/ColorPickerView;->getPreferenceName()Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object p0

    .line 488
    new-instance v2, Ljava/lang/StringBuilder;

    .line 489
    .line 490
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 491
    .line 492
    .line 493
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 494
    .line 495
    .line 496
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 497
    .line 498
    .line 499
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object p0

    .line 503
    invoke-interface {v0, p0, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 504
    .line 505
    .line 506
    move-result p0

    .line 507
    iget-object v0, v3, Lcom/skydoves/colorpickerview/ColorPickerView;->q:Landroid/widget/ImageView;

    .line 508
    .line 509
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    instance-of v0, v0, Ldefpackage/b50;

    .line 514
    .line 515
    if-eqz v0, :cond_19

    .line 516
    .line 517
    if-eq p0, v5, :cond_19

    .line 518
    .line 519
    new-instance v0, Ldefpackage/g50;

    .line 520
    .line 521
    invoke-direct {v0, v3, p0, v1}, Ldefpackage/g50;-><init>(Lcom/skydoves/colorpickerview/ColorPickerView;II)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v3, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 525
    .line 526
    .line 527
    goto :goto_f

    .line 528
    :cond_18
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 529
    .line 530
    .line 531
    move-result p0

    .line 532
    div-int/lit8 p0, p0, 0x2

    .line 533
    .line 534
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 535
    .line 536
    .line 537
    move-result v0

    .line 538
    div-int/lit8 v0, v0, 0x2

    .line 539
    .line 540
    new-instance v1, Landroid/graphics/Point;

    .line 541
    .line 542
    invoke-direct {v1, p0, v0}, Landroid/graphics/Point;-><init>(II)V

    .line 543
    .line 544
    .line 545
    invoke-static {v3, v1}, Ldefpackage/kb4;->z(Lcom/skydoves/colorpickerview/ColorPickerView;Landroid/graphics/Point;)Landroid/graphics/Point;

    .line 546
    .line 547
    .line 548
    move-result-object p0

    .line 549
    iget v0, p0, Landroid/graphics/Point;->x:I

    .line 550
    .line 551
    int-to-float v0, v0

    .line 552
    iget v1, p0, Landroid/graphics/Point;->y:I

    .line 553
    .line 554
    int-to-float v1, v1

    .line 555
    invoke-virtual {v3, v0, v1}, Lcom/skydoves/colorpickerview/ColorPickerView;->d(FF)I

    .line 556
    .line 557
    .line 558
    move-result v0

    .line 559
    iput v0, v3, Lcom/skydoves/colorpickerview/ColorPickerView;->n:I

    .line 560
    .line 561
    iput v0, v3, Lcom/skydoves/colorpickerview/ColorPickerView;->o:I

    .line 562
    .line 563
    new-instance v0, Landroid/graphics/Point;

    .line 564
    .line 565
    iget v1, p0, Landroid/graphics/Point;->x:I

    .line 566
    .line 567
    iget v2, p0, Landroid/graphics/Point;->y:I

    .line 568
    .line 569
    invoke-direct {v0, v1, v2}, Landroid/graphics/Point;-><init>(II)V

    .line 570
    .line 571
    .line 572
    iput-object v0, v3, Lcom/skydoves/colorpickerview/ColorPickerView;->p:Landroid/graphics/Point;

    .line 573
    .line 574
    iget v0, p0, Landroid/graphics/Point;->x:I

    .line 575
    .line 576
    iget p0, p0, Landroid/graphics/Point;->y:I

    .line 577
    .line 578
    invoke-virtual {v3, v0, p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->i(II)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v3}, Lcom/skydoves/colorpickerview/ColorPickerView;->getColor()I

    .line 582
    .line 583
    .line 584
    move-result p0

    .line 585
    invoke-virtual {v3, p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->a(I)V

    .line 586
    .line 587
    .line 588
    iget-object p0, v3, Lcom/skydoves/colorpickerview/ColorPickerView;->p:Landroid/graphics/Point;

    .line 589
    .line 590
    invoke-virtual {v3, p0}, Lcom/skydoves/colorpickerview/ColorPickerView;->f(Landroid/graphics/Point;)V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v3}, Lcom/skydoves/colorpickerview/ColorPickerView;->e()Z

    .line 594
    .line 595
    .line 596
    :cond_19
    :goto_f
    return-void

    .line 597
    :pswitch_3
    check-cast v3, Ldefpackage/uz;

    .line 598
    .line 599
    iget-object p0, v3, Ldefpackage/uz;->u:Ljava/util/ArrayList;

    .line 600
    .line 601
    invoke-virtual {v3}, Ldefpackage/uz;->b()Z

    .line 602
    .line 603
    .line 604
    move-result v0

    .line 605
    if-eqz v0, :cond_1c

    .line 606
    .line 607
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 608
    .line 609
    .line 610
    move-result v0

    .line 611
    if-lez v0, :cond_1c

    .line 612
    .line 613
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    check-cast v0, Ldefpackage/tz;

    .line 618
    .line 619
    iget-object v0, v0, Ldefpackage/tz;->a:Ldefpackage/ev2;

    .line 620
    .line 621
    iget-boolean v0, v0, Ldefpackage/bc2;->L:Z

    .line 622
    .line 623
    if-nez v0, :cond_1c

    .line 624
    .line 625
    iget-object v0, v3, Ldefpackage/uz;->B:Landroid/view/View;

    .line 626
    .line 627
    if-eqz v0, :cond_1b

    .line 628
    .line 629
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 630
    .line 631
    .line 632
    move-result v0

    .line 633
    if-nez v0, :cond_1a

    .line 634
    .line 635
    goto :goto_11

    .line 636
    :cond_1a
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 637
    .line 638
    .line 639
    move-result v0

    .line 640
    :goto_10
    if-ge v2, v0, :cond_1c

    .line 641
    .line 642
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    add-int/lit8 v2, v2, 0x1

    .line 647
    .line 648
    check-cast v1, Ldefpackage/tz;

    .line 649
    .line 650
    iget-object v1, v1, Ldefpackage/tz;->a:Ldefpackage/ev2;

    .line 651
    .line 652
    invoke-virtual {v1}, Ldefpackage/bc2;->f()V

    .line 653
    .line 654
    .line 655
    goto :goto_10

    .line 656
    :cond_1b
    :goto_11
    invoke-virtual {v3}, Ldefpackage/uz;->dismiss()V

    .line 657
    .line 658
    .line 659
    :cond_1c
    return-void

    .line 660
    :pswitch_4
    check-cast v3, Ldefpackage/yg;

    .line 661
    .line 662
    iget-object p0, v3, Ldefpackage/yg;->T:Ldefpackage/bh;

    .line 663
    .line 664
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 665
    .line 666
    .line 667
    move-result v0

    .line 668
    if-eqz v0, :cond_1d

    .line 669
    .line 670
    iget-object v0, v3, Ldefpackage/yg;->R:Landroid/graphics/Rect;

    .line 671
    .line 672
    invoke-virtual {p0, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 673
    .line 674
    .line 675
    move-result p0

    .line 676
    if-eqz p0, :cond_1d

    .line 677
    .line 678
    invoke-virtual {v3}, Ldefpackage/yg;->s()V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v3}, Ldefpackage/bc2;->f()V

    .line 682
    .line 683
    .line 684
    goto :goto_12

    .line 685
    :cond_1d
    invoke-virtual {v3}, Ldefpackage/bc2;->dismiss()V

    .line 686
    .line 687
    .line 688
    :goto_12
    return-void

    .line 689
    :pswitch_5
    check-cast v3, Ldefpackage/bh;

    .line 690
    .line 691
    invoke-virtual {v3}, Ldefpackage/bh;->getInternalPopup()Ldefpackage/ah;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    invoke-interface {v0}, Ldefpackage/ah;->b()Z

    .line 696
    .line 697
    .line 698
    move-result v0

    .line 699
    if-nez v0, :cond_1e

    .line 700
    .line 701
    iget-object v0, v3, Ldefpackage/bh;->s:Ldefpackage/ah;

    .line 702
    .line 703
    invoke-virtual {v3}, Landroid/view/View;->getTextDirection()I

    .line 704
    .line 705
    .line 706
    move-result v1

    .line 707
    invoke-virtual {v3}, Landroid/view/View;->getTextAlignment()I

    .line 708
    .line 709
    .line 710
    move-result v2

    .line 711
    invoke-interface {v0, v1, v2}, Ldefpackage/ah;->n(II)V

    .line 712
    .line 713
    .line 714
    :cond_1e
    invoke-virtual {v3}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 715
    .line 716
    .line 717
    move-result-object v0

    .line 718
    if-eqz v0, :cond_1f

    .line 719
    .line 720
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 721
    .line 722
    .line 723
    :cond_1f
    return-void

    .line 724
    nop

    .line 725
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
