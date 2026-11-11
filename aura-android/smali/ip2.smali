.class public final Lip2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic n:Z

.field public final synthetic o:Lqp2;


# direct methods
.method public constructor <init>(Lqp2;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lip2;->o:Lqp2;

    .line 5
    .line 6
    iput-boolean p2, p0, Lip2;->n:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lip2;->o:Lqp2;

    .line 4
    .line 5
    iget-object v2, v1, Lqp2;->G:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2, v0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 12
    .line 13
    .line 14
    iget-boolean v2, v1, Lqp2;->r0:Z

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    iput-boolean v3, v1, Lqp2;->s0:Z

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v2, v1, Lqp2;->w:Lwq2;

    .line 23
    .line 24
    iget-object v4, v1, Lqp2;->N:Landroid/widget/LinearLayout;

    .line 25
    .line 26
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    iget v4, v4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 31
    .line 32
    iget-object v5, v1, Lqp2;->N:Landroid/widget/LinearLayout;

    .line 33
    .line 34
    const/4 v6, -0x1

    .line 35
    invoke-static {v5, v6}, Lqp2;->r(Landroid/view/View;I)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lqp2;->l()Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-virtual {v1, v5}, Lqp2;->x(Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    invoke-virtual {v5}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-virtual {v6}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    iget v6, v6, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 62
    .line 63
    const/high16 v7, 0x40000000    # 2.0f

    .line 64
    .line 65
    invoke-static {v6, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    const/4 v7, 0x0

    .line 70
    invoke-virtual {v5, v6, v7}, Landroid/view/View;->measure(II)V

    .line 71
    .line 72
    .line 73
    iget-object v6, v1, Lqp2;->N:Landroid/widget/LinearLayout;

    .line 74
    .line 75
    invoke-static {v6, v4}, Lqp2;->r(Landroid/view/View;I)V

    .line 76
    .line 77
    .line 78
    iget-object v4, v1, Lqp2;->H:Landroid/widget/ImageView;

    .line 79
    .line 80
    invoke-virtual {v4}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    instance-of v4, v4, Landroid/graphics/drawable/BitmapDrawable;

    .line 85
    .line 86
    if-eqz v4, :cond_2

    .line 87
    .line 88
    iget-object v4, v1, Lqp2;->H:Landroid/widget/ImageView;

    .line 89
    .line 90
    invoke-virtual {v4}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    check-cast v4, Landroid/graphics/drawable/BitmapDrawable;

    .line 95
    .line 96
    invoke-virtual {v4}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    if-eqz v4, :cond_2

    .line 101
    .line 102
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 107
    .line 108
    .line 109
    move-result v8

    .line 110
    invoke-virtual {v1, v6, v8}, Lqp2;->o(II)I

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    iget-object v8, v1, Lqp2;->H:Landroid/widget/ImageView;

    .line 115
    .line 116
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-lt v9, v4, :cond_1

    .line 125
    .line 126
    sget-object v4, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_1
    sget-object v4, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 130
    .line 131
    :goto_0
    invoke-virtual {v8, v4}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_2
    move v6, v7

    .line 136
    :goto_1
    invoke-virtual {v1}, Lqp2;->l()Z

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    invoke-virtual {v1, v4}, Lqp2;->p(Z)I

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    iget-object v8, v1, Lqp2;->T:Ljava/util/ArrayList;

    .line 145
    .line 146
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 147
    .line 148
    .line 149
    move-result v8

    .line 150
    invoke-virtual {v1}, Lqp2;->q()Z

    .line 151
    .line 152
    .line 153
    move-result v9

    .line 154
    if-eqz v9, :cond_3

    .line 155
    .line 156
    iget v9, v1, Lqp2;->b0:I

    .line 157
    .line 158
    iget-object v10, v2, Lwq2;->v:Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-static {v10}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 165
    .line 166
    .line 167
    move-result v10

    .line 168
    mul-int/2addr v10, v9

    .line 169
    goto :goto_2

    .line 170
    :cond_3
    move v10, v7

    .line 171
    :goto_2
    if-lez v8, :cond_4

    .line 172
    .line 173
    iget v8, v1, Lqp2;->d0:I

    .line 174
    .line 175
    add-int/2addr v10, v8

    .line 176
    :cond_4
    iget v8, v1, Lqp2;->c0:I

    .line 177
    .line 178
    invoke-static {v10, v8}, Ljava/lang/Math;->min(II)I

    .line 179
    .line 180
    .line 181
    move-result v8

    .line 182
    iget-boolean v9, v1, Lqp2;->q0:Z

    .line 183
    .line 184
    if-eqz v9, :cond_5

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_5
    move v8, v7

    .line 188
    :goto_3
    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    .line 189
    .line 190
    .line 191
    move-result v9

    .line 192
    add-int/2addr v9, v4

    .line 193
    new-instance v10, Landroid/graphics/Rect;

    .line 194
    .line 195
    invoke-direct {v10}, Landroid/graphics/Rect;-><init>()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v5, v10}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 199
    .line 200
    .line 201
    iget-object v5, v1, Lqp2;->F:Landroid/widget/LinearLayout;

    .line 202
    .line 203
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    iget-object v11, v1, Lqp2;->G:Landroid/widget/FrameLayout;

    .line 208
    .line 209
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 210
    .line 211
    .line 212
    move-result v11

    .line 213
    sub-int/2addr v5, v11

    .line 214
    invoke-virtual {v10}, Landroid/graphics/Rect;->height()I

    .line 215
    .line 216
    .line 217
    move-result v11

    .line 218
    sub-int/2addr v11, v5

    .line 219
    const/16 v5, 0x8

    .line 220
    .line 221
    if-lez v6, :cond_6

    .line 222
    .line 223
    if-gt v9, v11, :cond_6

    .line 224
    .line 225
    iget-object v4, v1, Lqp2;->H:Landroid/widget/ImageView;

    .line 226
    .line 227
    invoke-virtual {v4, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 228
    .line 229
    .line 230
    iget-object v4, v1, Lqp2;->H:Landroid/widget/ImageView;

    .line 231
    .line 232
    invoke-static {v4, v6}, Lqp2;->r(Landroid/view/View;I)V

    .line 233
    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_6
    iget-object v6, v1, Lqp2;->R:Landroidx/mediarouter/app/OverlayListView;

    .line 237
    .line 238
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    iget v6, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 243
    .line 244
    iget-object v9, v1, Lqp2;->N:Landroid/widget/LinearLayout;

    .line 245
    .line 246
    invoke-virtual {v9}, Landroid/view/View;->getMeasuredHeight()I

    .line 247
    .line 248
    .line 249
    move-result v9

    .line 250
    add-int/2addr v9, v6

    .line 251
    iget-object v6, v1, Lqp2;->G:Landroid/widget/FrameLayout;

    .line 252
    .line 253
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    if-lt v9, v6, :cond_7

    .line 258
    .line 259
    iget-object v6, v1, Lqp2;->H:Landroid/widget/ImageView;

    .line 260
    .line 261
    invoke-virtual {v6, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 262
    .line 263
    .line 264
    :cond_7
    add-int v9, v8, v4

    .line 265
    .line 266
    move v6, v7

    .line 267
    :goto_4
    invoke-virtual {v1}, Lqp2;->l()Z

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    if-eqz v4, :cond_8

    .line 272
    .line 273
    if-gt v9, v11, :cond_8

    .line 274
    .line 275
    iget-object v4, v1, Lqp2;->O:Landroid/widget/RelativeLayout;

    .line 276
    .line 277
    invoke-virtual {v4, v7}, Landroid/view/View;->setVisibility(I)V

    .line 278
    .line 279
    .line 280
    goto :goto_5

    .line 281
    :cond_8
    iget-object v4, v1, Lqp2;->O:Landroid/widget/RelativeLayout;

    .line 282
    .line 283
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 284
    .line 285
    .line 286
    :goto_5
    iget-object v4, v1, Lqp2;->O:Landroid/widget/RelativeLayout;

    .line 287
    .line 288
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 289
    .line 290
    .line 291
    move-result v4

    .line 292
    if-nez v4, :cond_9

    .line 293
    .line 294
    move v4, v3

    .line 295
    goto :goto_6

    .line 296
    :cond_9
    move v4, v7

    .line 297
    :goto_6
    invoke-virtual {v1, v4}, Lqp2;->x(Z)V

    .line 298
    .line 299
    .line 300
    iget-object v4, v1, Lqp2;->O:Landroid/widget/RelativeLayout;

    .line 301
    .line 302
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    if-nez v4, :cond_a

    .line 307
    .line 308
    move v4, v3

    .line 309
    goto :goto_7

    .line 310
    :cond_a
    move v4, v7

    .line 311
    :goto_7
    invoke-virtual {v1, v4}, Lqp2;->p(Z)I

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    .line 316
    .line 317
    .line 318
    move-result v5

    .line 319
    add-int/2addr v5, v4

    .line 320
    if-le v5, v11, :cond_b

    .line 321
    .line 322
    sub-int/2addr v5, v11

    .line 323
    sub-int/2addr v8, v5

    .line 324
    goto :goto_8

    .line 325
    :cond_b
    move v11, v5

    .line 326
    :goto_8
    iget-object v5, v1, Lqp2;->N:Landroid/widget/LinearLayout;

    .line 327
    .line 328
    invoke-virtual {v5}, Landroid/view/View;->clearAnimation()V

    .line 329
    .line 330
    .line 331
    iget-object v5, v1, Lqp2;->R:Landroidx/mediarouter/app/OverlayListView;

    .line 332
    .line 333
    invoke-virtual {v5}, Landroid/view/View;->clearAnimation()V

    .line 334
    .line 335
    .line 336
    iget-object v5, v1, Lqp2;->G:Landroid/widget/FrameLayout;

    .line 337
    .line 338
    invoke-virtual {v5}, Landroid/view/View;->clearAnimation()V

    .line 339
    .line 340
    .line 341
    iget-object v5, v1, Lqp2;->N:Landroid/widget/LinearLayout;

    .line 342
    .line 343
    iget-boolean v0, v0, Lip2;->n:Z

    .line 344
    .line 345
    if-eqz v0, :cond_c

    .line 346
    .line 347
    invoke-virtual {v1, v5, v4}, Lqp2;->k(Landroid/view/View;I)V

    .line 348
    .line 349
    .line 350
    iget-object v4, v1, Lqp2;->R:Landroidx/mediarouter/app/OverlayListView;

    .line 351
    .line 352
    invoke-virtual {v1, v4, v8}, Lqp2;->k(Landroid/view/View;I)V

    .line 353
    .line 354
    .line 355
    iget-object v4, v1, Lqp2;->G:Landroid/widget/FrameLayout;

    .line 356
    .line 357
    invoke-virtual {v1, v4, v11}, Lqp2;->k(Landroid/view/View;I)V

    .line 358
    .line 359
    .line 360
    goto :goto_9

    .line 361
    :cond_c
    invoke-static {v5, v4}, Lqp2;->r(Landroid/view/View;I)V

    .line 362
    .line 363
    .line 364
    iget-object v4, v1, Lqp2;->R:Landroidx/mediarouter/app/OverlayListView;

    .line 365
    .line 366
    invoke-static {v4, v8}, Lqp2;->r(Landroid/view/View;I)V

    .line 367
    .line 368
    .line 369
    iget-object v4, v1, Lqp2;->G:Landroid/widget/FrameLayout;

    .line 370
    .line 371
    invoke-static {v4, v11}, Lqp2;->r(Landroid/view/View;I)V

    .line 372
    .line 373
    .line 374
    :goto_9
    iget-object v4, v1, Lqp2;->E:Landroid/widget/FrameLayout;

    .line 375
    .line 376
    invoke-virtual {v10}, Landroid/graphics/Rect;->height()I

    .line 377
    .line 378
    .line 379
    move-result v5

    .line 380
    invoke-static {v4, v5}, Lqp2;->r(Landroid/view/View;I)V

    .line 381
    .line 382
    .line 383
    iget-object v2, v2, Lwq2;->v:Ljava/util/ArrayList;

    .line 384
    .line 385
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 390
    .line 391
    .line 392
    move-result v4

    .line 393
    iget-object v5, v1, Lqp2;->T:Ljava/util/ArrayList;

    .line 394
    .line 395
    if-eqz v4, :cond_d

    .line 396
    .line 397
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 398
    .line 399
    .line 400
    iget-object v0, v1, Lqp2;->S:Lpp2;

    .line 401
    .line 402
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 403
    .line 404
    .line 405
    return-void

    .line 406
    :cond_d
    new-instance v4, Ljava/util/HashSet;

    .line 407
    .line 408
    invoke-direct {v4, v5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 409
    .line 410
    .line 411
    new-instance v5, Ljava/util/HashSet;

    .line 412
    .line 413
    invoke-direct {v5, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result v4

    .line 420
    if-eqz v4, :cond_e

    .line 421
    .line 422
    iget-object v0, v1, Lqp2;->S:Lpp2;

    .line 423
    .line 424
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 425
    .line 426
    .line 427
    return-void

    .line 428
    :cond_e
    if-eqz v0, :cond_f

    .line 429
    .line 430
    iget-object v5, v1, Lqp2;->R:Landroidx/mediarouter/app/OverlayListView;

    .line 431
    .line 432
    iget-object v6, v1, Lqp2;->S:Lpp2;

    .line 433
    .line 434
    new-instance v8, Ljava/util/HashMap;

    .line 435
    .line 436
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v5}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 440
    .line 441
    .line 442
    move-result v9

    .line 443
    move v10, v7

    .line 444
    :goto_a
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    .line 445
    .line 446
    .line 447
    move-result v11

    .line 448
    if-ge v10, v11, :cond_10

    .line 449
    .line 450
    add-int v11, v9, v10

    .line 451
    .line 452
    invoke-virtual {v6, v11}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v11

    .line 456
    invoke-virtual {v5, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 457
    .line 458
    .line 459
    move-result-object v12

    .line 460
    new-instance v13, Landroid/graphics/Rect;

    .line 461
    .line 462
    invoke-virtual {v12}, Landroid/view/View;->getLeft()I

    .line 463
    .line 464
    .line 465
    move-result v14

    .line 466
    invoke-virtual {v12}, Landroid/view/View;->getTop()I

    .line 467
    .line 468
    .line 469
    move-result v15

    .line 470
    invoke-virtual {v12}, Landroid/view/View;->getRight()I

    .line 471
    .line 472
    .line 473
    move-result v4

    .line 474
    invoke-virtual {v12}, Landroid/view/View;->getBottom()I

    .line 475
    .line 476
    .line 477
    move-result v12

    .line 478
    invoke-direct {v13, v14, v15, v4, v12}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v8, v11, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    add-int/lit8 v10, v10, 0x1

    .line 485
    .line 486
    goto :goto_a

    .line 487
    :cond_f
    const/4 v8, 0x0

    .line 488
    :cond_10
    if-eqz v0, :cond_11

    .line 489
    .line 490
    iget-object v4, v1, Lqp2;->x:Landroid/content/Context;

    .line 491
    .line 492
    iget-object v5, v1, Lqp2;->R:Landroidx/mediarouter/app/OverlayListView;

    .line 493
    .line 494
    iget-object v6, v1, Lqp2;->S:Lpp2;

    .line 495
    .line 496
    new-instance v9, Ljava/util/HashMap;

    .line 497
    .line 498
    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v5}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    .line 502
    .line 503
    .line 504
    move-result v10

    .line 505
    move v11, v7

    .line 506
    :goto_b
    invoke-virtual {v5}, Landroid/view/ViewGroup;->getChildCount()I

    .line 507
    .line 508
    .line 509
    move-result v12

    .line 510
    if-ge v11, v12, :cond_12

    .line 511
    .line 512
    add-int v12, v10, v11

    .line 513
    .line 514
    invoke-virtual {v6, v12}, Landroid/widget/ArrayAdapter;->getItem(I)Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v12

    .line 518
    invoke-virtual {v5, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 519
    .line 520
    .line 521
    move-result-object v13

    .line 522
    invoke-virtual {v13}, Landroid/view/View;->getWidth()I

    .line 523
    .line 524
    .line 525
    move-result v14

    .line 526
    invoke-virtual {v13}, Landroid/view/View;->getHeight()I

    .line 527
    .line 528
    .line 529
    move-result v15

    .line 530
    sget-object v3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 531
    .line 532
    invoke-static {v14, v15, v3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 533
    .line 534
    .line 535
    move-result-object v3

    .line 536
    new-instance v14, Landroid/graphics/Canvas;

    .line 537
    .line 538
    invoke-direct {v14, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v13, v14}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 542
    .line 543
    .line 544
    new-instance v13, Landroid/graphics/drawable/BitmapDrawable;

    .line 545
    .line 546
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 547
    .line 548
    .line 549
    move-result-object v14

    .line 550
    invoke-direct {v13, v14, v3}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v9, v12, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    add-int/lit8 v11, v11, 0x1

    .line 557
    .line 558
    const/4 v3, 0x1

    .line 559
    goto :goto_b

    .line 560
    :cond_11
    const/4 v9, 0x0

    .line 561
    :cond_12
    iget-object v3, v1, Lqp2;->T:Ljava/util/ArrayList;

    .line 562
    .line 563
    new-instance v4, Ljava/util/HashSet;

    .line 564
    .line 565
    invoke-direct {v4, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v4, v3}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    .line 569
    .line 570
    .line 571
    iput-object v4, v1, Lqp2;->U:Ljava/util/HashSet;

    .line 572
    .line 573
    iget-object v3, v1, Lqp2;->T:Ljava/util/ArrayList;

    .line 574
    .line 575
    new-instance v4, Ljava/util/HashSet;

    .line 576
    .line 577
    invoke-direct {v4, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 578
    .line 579
    .line 580
    invoke-virtual {v4, v2}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    .line 581
    .line 582
    .line 583
    iput-object v4, v1, Lqp2;->V:Ljava/util/HashSet;

    .line 584
    .line 585
    iget-object v2, v1, Lqp2;->T:Ljava/util/ArrayList;

    .line 586
    .line 587
    iget-object v3, v1, Lqp2;->U:Ljava/util/HashSet;

    .line 588
    .line 589
    invoke-virtual {v2, v7, v3}, Ljava/util/ArrayList;->addAll(ILjava/util/Collection;)Z

    .line 590
    .line 591
    .line 592
    iget-object v2, v1, Lqp2;->T:Ljava/util/ArrayList;

    .line 593
    .line 594
    iget-object v3, v1, Lqp2;->V:Ljava/util/HashSet;

    .line 595
    .line 596
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 597
    .line 598
    .line 599
    iget-object v2, v1, Lqp2;->S:Lpp2;

    .line 600
    .line 601
    invoke-virtual {v2}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 602
    .line 603
    .line 604
    if-eqz v0, :cond_13

    .line 605
    .line 606
    iget-boolean v0, v1, Lqp2;->q0:Z

    .line 607
    .line 608
    if-eqz v0, :cond_13

    .line 609
    .line 610
    iget-object v0, v1, Lqp2;->U:Ljava/util/HashSet;

    .line 611
    .line 612
    invoke-virtual {v0}, Ljava/util/HashSet;->size()I

    .line 613
    .line 614
    .line 615
    move-result v0

    .line 616
    iget-object v2, v1, Lqp2;->V:Ljava/util/HashSet;

    .line 617
    .line 618
    invoke-virtual {v2}, Ljava/util/HashSet;->size()I

    .line 619
    .line 620
    .line 621
    move-result v2

    .line 622
    add-int/2addr v2, v0

    .line 623
    if-lez v2, :cond_13

    .line 624
    .line 625
    iget-object v0, v1, Lqp2;->R:Landroidx/mediarouter/app/OverlayListView;

    .line 626
    .line 627
    invoke-virtual {v0, v7}, Landroid/view/View;->setEnabled(Z)V

    .line 628
    .line 629
    .line 630
    iget-object v0, v1, Lqp2;->R:Landroidx/mediarouter/app/OverlayListView;

    .line 631
    .line 632
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 633
    .line 634
    .line 635
    const/4 v0, 0x1

    .line 636
    iput-boolean v0, v1, Lqp2;->r0:Z

    .line 637
    .line 638
    iget-object v0, v1, Lqp2;->R:Landroidx/mediarouter/app/OverlayListView;

    .line 639
    .line 640
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    new-instance v2, Lkp2;

    .line 645
    .line 646
    invoke-direct {v2, v1, v8, v9}, Lkp2;-><init>(Lqp2;Ljava/util/HashMap;Ljava/util/HashMap;)V

    .line 647
    .line 648
    .line 649
    invoke-virtual {v0, v2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 650
    .line 651
    .line 652
    return-void

    .line 653
    :cond_13
    const/4 v0, 0x0

    .line 654
    iput-object v0, v1, Lqp2;->U:Ljava/util/HashSet;

    .line 655
    .line 656
    iput-object v0, v1, Lqp2;->V:Ljava/util/HashSet;

    .line 657
    .line 658
    return-void
.end method
