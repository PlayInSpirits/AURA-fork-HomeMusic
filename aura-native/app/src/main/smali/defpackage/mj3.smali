.class public final synthetic Ldefpackage/mj3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/qj3;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/qj3;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/mj3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/mj3;->o:Ldefpackage/qj3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 11

    .line 1
    iget v0, p0, Ldefpackage/mj3;->n:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x1

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x2

    .line 8
    iget-object p0, p0, Ldefpackage/mj3;->o:Ldefpackage/qj3;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v5}, Ldefpackage/qj3;->i(I)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    iget-object v0, p0, Ldefpackage/qj3;->m:Landroid/animation/AnimatorSet;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Ldefpackage/qj3;->v:Ldefpackage/mj3;

    .line 23
    .line 24
    const-wide/16 v1, 0x7d0

    .line 25
    .line 26
    invoke-virtual {p0, v0, v1, v2}, Ldefpackage/qj3;->e(Ljava/lang/Runnable;J)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    iget-object p0, p0, Ldefpackage/qj3;->n:Landroid/animation/AnimatorSet;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->start()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_2
    iget-object p0, p0, Ldefpackage/qj3;->o:Landroid/animation/AnimatorSet;

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/animation/AnimatorSet;->start()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_3
    iget-object v0, p0, Ldefpackage/qj3;->s:Landroid/animation/ValueAnimator;

    .line 43
    .line 44
    iget-object v1, p0, Ldefpackage/qj3;->l:Landroid/view/View;

    .line 45
    .line 46
    iget-object v2, p0, Ldefpackage/qj3;->a:Landroidx/media3/ui/PlayerControlView;

    .line 47
    .line 48
    iget-object v6, p0, Ldefpackage/qj3;->h:Landroid/view/ViewGroup;

    .line 49
    .line 50
    iget-object v7, p0, Ldefpackage/qj3;->g:Landroid/view/ViewGroup;

    .line 51
    .line 52
    if-eqz v7, :cond_8

    .line 53
    .line 54
    if-nez v6, :cond_0

    .line 55
    .line 56
    goto/16 :goto_5

    .line 57
    .line 58
    :cond_0
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    invoke-virtual {v2}, Landroid/view/View;->getPaddingLeft()I

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    sub-int/2addr v8, v9

    .line 67
    invoke-virtual {v2}, Landroid/view/View;->getPaddingRight()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    sub-int/2addr v8, v2

    .line 72
    :goto_0
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-le v2, v3, :cond_1

    .line 77
    .line 78
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    sub-int/2addr v2, v5

    .line 83
    invoke-virtual {v6, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    invoke-virtual {v6, v2}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v7, v9, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    if-eqz v1, :cond_2

    .line 95
    .line 96
    const/16 v2, 0x8

    .line 97
    .line 98
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 99
    .line 100
    .line 101
    :cond_2
    iget-object v2, p0, Ldefpackage/qj3;->j:Landroid/view/ViewGroup;

    .line 102
    .line 103
    invoke-static {v2}, Ldefpackage/qj3;->c(Landroid/view/View;)I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    sub-int/2addr v5, v3

    .line 112
    move v9, v4

    .line 113
    :goto_1
    if-ge v9, v5, :cond_3

    .line 114
    .line 115
    invoke-virtual {v7, v9}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    invoke-static {v10}, Ldefpackage/qj3;->c(Landroid/view/View;)I

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    add-int/2addr v2, v10

    .line 124
    add-int/lit8 v9, v9, 0x1

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    if-le v2, v8, :cond_7

    .line 128
    .line 129
    if-eqz v1, :cond_4

    .line 130
    .line 131
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 132
    .line 133
    .line 134
    invoke-static {v1}, Ldefpackage/qj3;->c(Landroid/view/View;)I

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    add-int/2addr v2, p0

    .line 139
    :cond_4
    new-instance p0, Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 142
    .line 143
    .line 144
    move v0, v4

    .line 145
    :goto_2
    if-ge v0, v5, :cond_6

    .line 146
    .line 147
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-static {v1}, Ldefpackage/qj3;->c(Landroid/view/View;)I

    .line 152
    .line 153
    .line 154
    move-result v9

    .line 155
    sub-int/2addr v2, v9

    .line 156
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    if-gt v2, v8, :cond_5

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_6
    :goto_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-nez v0, :cond_8

    .line 170
    .line 171
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    invoke-virtual {v7, v4, v0}, Landroid/view/ViewGroup;->removeViews(II)V

    .line 176
    .line 177
    .line 178
    :goto_4
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    if-ge v4, v0, :cond_8

    .line 183
    .line 184
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    sub-int/2addr v0, v3

    .line 189
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    check-cast v1, Landroid/view/View;

    .line 194
    .line 195
    invoke-virtual {v6, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 196
    .line 197
    .line 198
    add-int/lit8 v4, v4, 0x1

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_7
    iget-object v1, p0, Ldefpackage/qj3;->i:Landroid/view/ViewGroup;

    .line 202
    .line 203
    if-eqz v1, :cond_8

    .line 204
    .line 205
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    if-nez v1, :cond_8

    .line 210
    .line 211
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    if-nez v1, :cond_8

    .line 216
    .line 217
    iget-object p0, p0, Ldefpackage/qj3;->r:Landroid/animation/ValueAnimator;

    .line 218
    .line 219
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->cancel()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 223
    .line 224
    .line 225
    :cond_8
    :goto_5
    return-void

    .line 226
    :pswitch_4
    iget-object v0, p0, Ldefpackage/qj3;->k:Landroid/view/View;

    .line 227
    .line 228
    iget-object v5, p0, Ldefpackage/qj3;->f:Landroid/view/ViewGroup;

    .line 229
    .line 230
    if-eqz v5, :cond_a

    .line 231
    .line 232
    iget-boolean v6, p0, Ldefpackage/qj3;->B:Z

    .line 233
    .line 234
    if-eqz v6, :cond_9

    .line 235
    .line 236
    move v6, v4

    .line 237
    goto :goto_6

    .line 238
    :cond_9
    move v6, v2

    .line 239
    :goto_6
    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 240
    .line 241
    .line 242
    :cond_a
    if-eqz v0, :cond_12

    .line 243
    .line 244
    iget-object v5, p0, Ldefpackage/qj3;->a:Landroidx/media3/ui/PlayerControlView;

    .line 245
    .line 246
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    const v6, 0x7f070351

    .line 251
    .line 252
    .line 253
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 254
    .line 255
    .line 256
    move-result v5

    .line 257
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    check-cast v6, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 262
    .line 263
    if-eqz v6, :cond_c

    .line 264
    .line 265
    iget-boolean v7, p0, Ldefpackage/qj3;->B:Z

    .line 266
    .line 267
    if-eqz v7, :cond_b

    .line 268
    .line 269
    move v5, v4

    .line 270
    :cond_b
    iput v5, v6, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 271
    .line 272
    invoke-virtual {v0, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 273
    .line 274
    .line 275
    :cond_c
    instance-of v5, v0, Landroidx/media3/ui/DefaultTimeBar;

    .line 276
    .line 277
    if-eqz v5, :cond_12

    .line 278
    .line 279
    check-cast v0, Landroidx/media3/ui/DefaultTimeBar;

    .line 280
    .line 281
    iget-object v5, v0, Landroidx/media3/ui/DefaultTimeBar;->n:Landroid/graphics/Rect;

    .line 282
    .line 283
    iget-object v6, v0, Landroidx/media3/ui/DefaultTimeBar;->R:Landroid/animation/ValueAnimator;

    .line 284
    .line 285
    iget-boolean v7, p0, Ldefpackage/qj3;->B:Z

    .line 286
    .line 287
    const/4 v8, 0x0

    .line 288
    if-eqz v7, :cond_e

    .line 289
    .line 290
    invoke-virtual {v6}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    if-eqz v1, :cond_d

    .line 295
    .line 296
    invoke-virtual {v6}, Landroid/animation/ValueAnimator;->cancel()V

    .line 297
    .line 298
    .line 299
    :cond_d
    iput-boolean v3, v0, Landroidx/media3/ui/DefaultTimeBar;->T:Z

    .line 300
    .line 301
    iput v8, v0, Landroidx/media3/ui/DefaultTimeBar;->S:F

    .line 302
    .line 303
    invoke-virtual {v0, v5}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    .line 304
    .line 305
    .line 306
    goto :goto_7

    .line 307
    :cond_e
    iget v7, p0, Ldefpackage/qj3;->A:I

    .line 308
    .line 309
    if-ne v7, v3, :cond_10

    .line 310
    .line 311
    invoke-virtual {v6}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 312
    .line 313
    .line 314
    move-result v1

    .line 315
    if-eqz v1, :cond_f

    .line 316
    .line 317
    invoke-virtual {v6}, Landroid/animation/ValueAnimator;->cancel()V

    .line 318
    .line 319
    .line 320
    :cond_f
    iput-boolean v4, v0, Landroidx/media3/ui/DefaultTimeBar;->T:Z

    .line 321
    .line 322
    iput v8, v0, Landroidx/media3/ui/DefaultTimeBar;->S:F

    .line 323
    .line 324
    invoke-virtual {v0, v5}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    .line 325
    .line 326
    .line 327
    goto :goto_7

    .line 328
    :cond_10
    if-eq v7, v1, :cond_12

    .line 329
    .line 330
    invoke-virtual {v6}, Landroid/animation/ValueAnimator;->isStarted()Z

    .line 331
    .line 332
    .line 333
    move-result v1

    .line 334
    if-eqz v1, :cond_11

    .line 335
    .line 336
    invoke-virtual {v6}, Landroid/animation/ValueAnimator;->cancel()V

    .line 337
    .line 338
    .line 339
    :cond_11
    iput-boolean v4, v0, Landroidx/media3/ui/DefaultTimeBar;->T:Z

    .line 340
    .line 341
    const/high16 v1, 0x3f800000    # 1.0f

    .line 342
    .line 343
    iput v1, v0, Landroidx/media3/ui/DefaultTimeBar;->S:F

    .line 344
    .line 345
    invoke-virtual {v0, v5}, Landroid/view/View;->invalidate(Landroid/graphics/Rect;)V

    .line 346
    .line 347
    .line 348
    :cond_12
    :goto_7
    iget-object v0, p0, Ldefpackage/qj3;->z:Ljava/util/ArrayList;

    .line 349
    .line 350
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 351
    .line 352
    .line 353
    move-result v1

    .line 354
    move v3, v4

    .line 355
    :goto_8
    if-ge v3, v1, :cond_14

    .line 356
    .line 357
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v5

    .line 361
    add-int/lit8 v3, v3, 0x1

    .line 362
    .line 363
    check-cast v5, Landroid/view/View;

    .line 364
    .line 365
    iget-boolean v6, p0, Ldefpackage/qj3;->B:Z

    .line 366
    .line 367
    if-eqz v6, :cond_13

    .line 368
    .line 369
    invoke-static {v5}, Ldefpackage/qj3;->j(Landroid/view/View;)Z

    .line 370
    .line 371
    .line 372
    move-result v6

    .line 373
    if-eqz v6, :cond_13

    .line 374
    .line 375
    move v6, v2

    .line 376
    goto :goto_9

    .line 377
    :cond_13
    move v6, v4

    .line 378
    :goto_9
    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 379
    .line 380
    .line 381
    goto :goto_8

    .line 382
    :cond_14
    return-void

    .line 383
    :pswitch_5
    iget-boolean v0, p0, Ldefpackage/qj3;->D:Z

    .line 384
    .line 385
    if-nez v0, :cond_15

    .line 386
    .line 387
    invoke-virtual {p0, v4}, Ldefpackage/qj3;->i(I)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {p0}, Ldefpackage/qj3;->g()V

    .line 391
    .line 392
    .line 393
    goto :goto_b

    .line 394
    :cond_15
    iget v0, p0, Ldefpackage/qj3;->A:I

    .line 395
    .line 396
    if-eq v0, v3, :cond_18

    .line 397
    .line 398
    if-eq v0, v5, :cond_17

    .line 399
    .line 400
    if-eq v0, v1, :cond_16

    .line 401
    .line 402
    if-eq v0, v2, :cond_19

    .line 403
    .line 404
    goto :goto_a

    .line 405
    :cond_16
    iput-boolean v3, p0, Ldefpackage/qj3;->C:Z

    .line 406
    .line 407
    goto :goto_a

    .line 408
    :cond_17
    iget-object v0, p0, Ldefpackage/qj3;->q:Landroid/animation/AnimatorSet;

    .line 409
    .line 410
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 411
    .line 412
    .line 413
    goto :goto_a

    .line 414
    :cond_18
    iget-object v0, p0, Ldefpackage/qj3;->p:Landroid/animation/AnimatorSet;

    .line 415
    .line 416
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 417
    .line 418
    .line 419
    :goto_a
    invoke-virtual {p0}, Ldefpackage/qj3;->g()V

    .line 420
    .line 421
    .line 422
    :cond_19
    :goto_b
    return-void

    .line 423
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
