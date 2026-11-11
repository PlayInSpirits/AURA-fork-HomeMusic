.class public final Lqj3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public A:I

.field public B:Z

.field public C:Z

.field public D:Z

.field public final a:Landroidx/media3/ui/PlayerControlView;

.field public final b:Landroid/view/View;

.field public final c:Landroid/view/ViewGroup;

.field public final d:Landroid/view/ViewGroup;

.field public final e:Landroid/view/ViewGroup;

.field public final f:Landroid/view/ViewGroup;

.field public final g:Landroid/view/ViewGroup;

.field public final h:Landroid/view/ViewGroup;

.field public final i:Landroid/view/ViewGroup;

.field public final j:Landroid/view/ViewGroup;

.field public final k:Landroid/view/View;

.field public final l:Landroid/view/View;

.field public final m:Landroid/animation/AnimatorSet;

.field public final n:Landroid/animation/AnimatorSet;

.field public final o:Landroid/animation/AnimatorSet;

.field public final p:Landroid/animation/AnimatorSet;

.field public final q:Landroid/animation/AnimatorSet;

.field public final r:Landroid/animation/ValueAnimator;

.field public final s:Landroid/animation/ValueAnimator;

.field public final t:Lmj3;

.field public final u:Lmj3;

.field public final v:Lmj3;

.field public final w:Lmj3;

.field public final x:Lmj3;

.field public final y:Lcs1;

.field public final z:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Landroidx/media3/ui/PlayerControlView;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v1, v0, Lqj3;->a:Landroidx/media3/ui/PlayerControlView;

    .line 9
    .line 10
    new-instance v2, Lmj3;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-direct {v2, v0, v3}, Lmj3;-><init>(Lqj3;I)V

    .line 14
    .line 15
    .line 16
    iput-object v2, v0, Lqj3;->t:Lmj3;

    .line 17
    .line 18
    new-instance v2, Lmj3;

    .line 19
    .line 20
    const/4 v4, 0x3

    .line 21
    invoke-direct {v2, v0, v4}, Lmj3;-><init>(Lqj3;I)V

    .line 22
    .line 23
    .line 24
    iput-object v2, v0, Lqj3;->u:Lmj3;

    .line 25
    .line 26
    new-instance v2, Lmj3;

    .line 27
    .line 28
    const/4 v5, 0x4

    .line 29
    invoke-direct {v2, v0, v5}, Lmj3;-><init>(Lqj3;I)V

    .line 30
    .line 31
    .line 32
    iput-object v2, v0, Lqj3;->v:Lmj3;

    .line 33
    .line 34
    new-instance v2, Lmj3;

    .line 35
    .line 36
    const/4 v6, 0x5

    .line 37
    invoke-direct {v2, v0, v6}, Lmj3;-><init>(Lqj3;I)V

    .line 38
    .line 39
    .line 40
    iput-object v2, v0, Lqj3;->w:Lmj3;

    .line 41
    .line 42
    new-instance v2, Lmj3;

    .line 43
    .line 44
    const/4 v7, 0x6

    .line 45
    invoke-direct {v2, v0, v7}, Lmj3;-><init>(Lqj3;I)V

    .line 46
    .line 47
    .line 48
    iput-object v2, v0, Lqj3;->x:Lmj3;

    .line 49
    .line 50
    new-instance v2, Lcs1;

    .line 51
    .line 52
    const/4 v7, 0x2

    .line 53
    invoke-direct {v2, v7, v0}, Lcs1;-><init>(ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iput-object v2, v0, Lqj3;->y:Lcs1;

    .line 57
    .line 58
    const/4 v2, 0x1

    .line 59
    iput-boolean v2, v0, Lqj3;->D:Z

    .line 60
    .line 61
    iput v3, v0, Lqj3;->A:I

    .line 62
    .line 63
    new-instance v8, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object v8, v0, Lqj3;->z:Ljava/util/ArrayList;

    .line 69
    .line 70
    const v8, 0x7f0a0235

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    check-cast v8, Landroid/view/ViewGroup;

    .line 78
    .line 79
    iput-object v8, v0, Lqj3;->c:Landroid/view/ViewGroup;

    .line 80
    .line 81
    const v8, 0x7f0a020f

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    iput-object v8, v0, Lqj3;->b:Landroid/view/View;

    .line 89
    .line 90
    const v8, 0x7f0a020a

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    check-cast v8, Landroid/view/ViewGroup;

    .line 98
    .line 99
    iput-object v8, v0, Lqj3;->d:Landroid/view/ViewGroup;

    .line 100
    .line 101
    const v8, 0x7f0a021b

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    check-cast v8, Landroid/view/ViewGroup;

    .line 109
    .line 110
    iput-object v8, v0, Lqj3;->f:Landroid/view/ViewGroup;

    .line 111
    .line 112
    const v8, 0x7f0a0208

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    check-cast v8, Landroid/view/ViewGroup;

    .line 120
    .line 121
    iput-object v8, v0, Lqj3;->e:Landroid/view/ViewGroup;

    .line 122
    .line 123
    const v9, 0x7f0a0234

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    check-cast v9, Landroid/view/ViewGroup;

    .line 131
    .line 132
    iput-object v9, v0, Lqj3;->j:Landroid/view/ViewGroup;

    .line 133
    .line 134
    const v9, 0x7f0a0227

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    iput-object v9, v0, Lqj3;->k:Landroid/view/View;

    .line 142
    .line 143
    const v10, 0x7f0a0207

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 147
    .line 148
    .line 149
    move-result-object v10

    .line 150
    check-cast v10, Landroid/view/ViewGroup;

    .line 151
    .line 152
    iput-object v10, v0, Lqj3;->g:Landroid/view/ViewGroup;

    .line 153
    .line 154
    const v10, 0x7f0a0212

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 158
    .line 159
    .line 160
    move-result-object v10

    .line 161
    check-cast v10, Landroid/view/ViewGroup;

    .line 162
    .line 163
    iput-object v10, v0, Lqj3;->h:Landroid/view/ViewGroup;

    .line 164
    .line 165
    const v10, 0x7f0a0213

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 169
    .line 170
    .line 171
    move-result-object v10

    .line 172
    check-cast v10, Landroid/view/ViewGroup;

    .line 173
    .line 174
    iput-object v10, v0, Lqj3;->i:Landroid/view/ViewGroup;

    .line 175
    .line 176
    const v10, 0x7f0a021f

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 180
    .line 181
    .line 182
    move-result-object v10

    .line 183
    iput-object v10, v0, Lqj3;->l:Landroid/view/View;

    .line 184
    .line 185
    const v11, 0x7f0a021e

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 189
    .line 190
    .line 191
    move-result-object v11

    .line 192
    if-eqz v10, :cond_0

    .line 193
    .line 194
    if-eqz v11, :cond_0

    .line 195
    .line 196
    new-instance v12, Lbj3;

    .line 197
    .line 198
    invoke-direct {v12, v4, v0}, Lbj3;-><init>(ILjava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v10, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 202
    .line 203
    .line 204
    new-instance v10, Lbj3;

    .line 205
    .line 206
    invoke-direct {v10, v4, v0}, Lbj3;-><init>(ILjava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v11, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 210
    .line 211
    .line 212
    :cond_0
    new-array v10, v7, [F

    .line 213
    .line 214
    fill-array-data v10, :array_0

    .line 215
    .line 216
    .line 217
    invoke-static {v10}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 218
    .line 219
    .line 220
    move-result-object v10

    .line 221
    new-instance v11, Landroid/view/animation/LinearInterpolator;

    .line 222
    .line 223
    invoke-direct {v11}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v10, v11}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 227
    .line 228
    .line 229
    new-instance v11, Lnj3;

    .line 230
    .line 231
    invoke-direct {v11, v0, v4}, Lnj3;-><init>(Lqj3;I)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v10, v11}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 235
    .line 236
    .line 237
    new-instance v11, Loj3;

    .line 238
    .line 239
    invoke-direct {v11, v0, v3}, Loj3;-><init>(Lqj3;I)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v10, v11}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 243
    .line 244
    .line 245
    new-array v11, v7, [F

    .line 246
    .line 247
    fill-array-data v11, :array_1

    .line 248
    .line 249
    .line 250
    invoke-static {v11}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 251
    .line 252
    .line 253
    move-result-object v11

    .line 254
    new-instance v12, Landroid/view/animation/LinearInterpolator;

    .line 255
    .line 256
    invoke-direct {v12}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v11, v12}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 260
    .line 261
    .line 262
    new-instance v12, Lnj3;

    .line 263
    .line 264
    invoke-direct {v12, v0, v3}, Lnj3;-><init>(Lqj3;I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v11, v12}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 268
    .line 269
    .line 270
    new-instance v12, Loj3;

    .line 271
    .line 272
    invoke-direct {v12, v0, v2}, Loj3;-><init>(Lqj3;I)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v11, v12}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 279
    .line 280
    .line 281
    move-result-object v12

    .line 282
    const v13, 0x7f070348

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getDimension(I)F

    .line 286
    .line 287
    .line 288
    move-result v14

    .line 289
    const v15, 0x7f07034d

    .line 290
    .line 291
    .line 292
    invoke-virtual {v12, v15}, Landroid/content/res/Resources;->getDimension(I)F

    .line 293
    .line 294
    .line 295
    move-result v15

    .line 296
    sub-float/2addr v14, v15

    .line 297
    invoke-virtual {v12, v13}, Landroid/content/res/Resources;->getDimension(I)F

    .line 298
    .line 299
    .line 300
    move-result v12

    .line 301
    new-instance v13, Landroid/animation/AnimatorSet;

    .line 302
    .line 303
    invoke-direct {v13}, Landroid/animation/AnimatorSet;-><init>()V

    .line 304
    .line 305
    .line 306
    iput-object v13, v0, Lqj3;->m:Landroid/animation/AnimatorSet;

    .line 307
    .line 308
    const-wide/16 v5, 0xfa

    .line 309
    .line 310
    invoke-virtual {v13, v5, v6}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 311
    .line 312
    .line 313
    new-instance v15, Lpj3;

    .line 314
    .line 315
    invoke-direct {v15, v0, v1, v3}, Lpj3;-><init>(Lqj3;Landroidx/media3/ui/PlayerControlView;I)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v13, v15}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v13, v10}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    const/4 v13, 0x0

    .line 326
    invoke-static {v9, v13, v14}, Lqj3;->d(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 327
    .line 328
    .line 329
    move-result-object v15

    .line 330
    invoke-virtual {v3, v15}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    invoke-static {v8, v13, v14}, Lqj3;->d(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 335
    .line 336
    .line 337
    move-result-object v15

    .line 338
    invoke-virtual {v3, v15}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 339
    .line 340
    .line 341
    new-instance v3, Landroid/animation/AnimatorSet;

    .line 342
    .line 343
    invoke-direct {v3}, Landroid/animation/AnimatorSet;-><init>()V

    .line 344
    .line 345
    .line 346
    iput-object v3, v0, Lqj3;->n:Landroid/animation/AnimatorSet;

    .line 347
    .line 348
    invoke-virtual {v3, v5, v6}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 349
    .line 350
    .line 351
    new-instance v15, Lpj3;

    .line 352
    .line 353
    invoke-direct {v15, v0, v1, v2}, Lpj3;-><init>(Lqj3;Landroidx/media3/ui/PlayerControlView;I)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v3, v15}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 357
    .line 358
    .line 359
    invoke-static {v9, v14, v12}, Lqj3;->d(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 360
    .line 361
    .line 362
    move-result-object v15

    .line 363
    invoke-virtual {v3, v15}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    invoke-static {v8, v14, v12}, Lqj3;->d(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 368
    .line 369
    .line 370
    move-result-object v15

    .line 371
    invoke-virtual {v3, v15}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 372
    .line 373
    .line 374
    new-instance v3, Landroid/animation/AnimatorSet;

    .line 375
    .line 376
    invoke-direct {v3}, Landroid/animation/AnimatorSet;-><init>()V

    .line 377
    .line 378
    .line 379
    iput-object v3, v0, Lqj3;->o:Landroid/animation/AnimatorSet;

    .line 380
    .line 381
    invoke-virtual {v3, v5, v6}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 382
    .line 383
    .line 384
    new-instance v15, Lpj3;

    .line 385
    .line 386
    invoke-direct {v15, v0, v1, v7}, Lpj3;-><init>(Lqj3;Landroidx/media3/ui/PlayerControlView;I)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v3, v15}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v3, v10}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    invoke-static {v9, v13, v12}, Lqj3;->d(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    invoke-virtual {v1, v3}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 401
    .line 402
    .line 403
    move-result-object v1

    .line 404
    invoke-static {v8, v13, v12}, Lqj3;->d(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 405
    .line 406
    .line 407
    move-result-object v3

    .line 408
    invoke-virtual {v1, v3}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 409
    .line 410
    .line 411
    new-instance v1, Landroid/animation/AnimatorSet;

    .line 412
    .line 413
    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 414
    .line 415
    .line 416
    iput-object v1, v0, Lqj3;->p:Landroid/animation/AnimatorSet;

    .line 417
    .line 418
    invoke-virtual {v1, v5, v6}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 419
    .line 420
    .line 421
    new-instance v3, Loj3;

    .line 422
    .line 423
    invoke-direct {v3, v0, v7}, Loj3;-><init>(Lqj3;I)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v1, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v1, v11}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 430
    .line 431
    .line 432
    move-result-object v1

    .line 433
    invoke-static {v9, v14, v13}, Lqj3;->d(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 434
    .line 435
    .line 436
    move-result-object v3

    .line 437
    invoke-virtual {v1, v3}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    invoke-static {v8, v14, v13}, Lqj3;->d(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 442
    .line 443
    .line 444
    move-result-object v3

    .line 445
    invoke-virtual {v1, v3}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 446
    .line 447
    .line 448
    new-instance v1, Landroid/animation/AnimatorSet;

    .line 449
    .line 450
    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 451
    .line 452
    .line 453
    iput-object v1, v0, Lqj3;->q:Landroid/animation/AnimatorSet;

    .line 454
    .line 455
    invoke-virtual {v1, v5, v6}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 456
    .line 457
    .line 458
    new-instance v3, Loj3;

    .line 459
    .line 460
    invoke-direct {v3, v0, v4}, Loj3;-><init>(Lqj3;I)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v1, v3}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v1, v11}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    invoke-static {v9, v12, v13}, Lqj3;->d(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    invoke-virtual {v1, v3}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    invoke-static {v8, v12, v13}, Lqj3;->d(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;

    .line 479
    .line 480
    .line 481
    move-result-object v3

    .line 482
    invoke-virtual {v1, v3}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 483
    .line 484
    .line 485
    new-array v1, v7, [F

    .line 486
    .line 487
    fill-array-data v1, :array_2

    .line 488
    .line 489
    .line 490
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 491
    .line 492
    .line 493
    move-result-object v1

    .line 494
    iput-object v1, v0, Lqj3;->r:Landroid/animation/ValueAnimator;

    .line 495
    .line 496
    invoke-virtual {v1, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 497
    .line 498
    .line 499
    new-instance v3, Lnj3;

    .line 500
    .line 501
    invoke-direct {v3, v0, v2}, Lnj3;-><init>(Lqj3;I)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v1, v3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 505
    .line 506
    .line 507
    new-instance v2, Loj3;

    .line 508
    .line 509
    const/4 v15, 0x4

    .line 510
    invoke-direct {v2, v0, v15}, Loj3;-><init>(Lqj3;I)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 514
    .line 515
    .line 516
    new-array v1, v7, [F

    .line 517
    .line 518
    fill-array-data v1, :array_3

    .line 519
    .line 520
    .line 521
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    iput-object v1, v0, Lqj3;->s:Landroid/animation/ValueAnimator;

    .line 526
    .line 527
    invoke-virtual {v1, v5, v6}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 528
    .line 529
    .line 530
    new-instance v2, Lnj3;

    .line 531
    .line 532
    invoke-direct {v2, v0, v7}, Lnj3;-><init>(Lqj3;I)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 536
    .line 537
    .line 538
    new-instance v2, Loj3;

    .line 539
    .line 540
    const/4 v3, 0x5

    .line 541
    invoke-direct {v2, v0, v3}, Loj3;-><init>(Lqj3;I)V

    .line 542
    .line 543
    .line 544
    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 545
    .line 546
    .line 547
    return-void

    .line 548
    nop

    .line 549
    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data

    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    :array_1
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    :array_2
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    :array_3
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public static c(Landroid/view/View;)I
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    instance-of v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    check-cast p0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 18
    .line 19
    iget v1, p0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 20
    .line 21
    iget p0, p0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 22
    .line 23
    add-int/2addr v1, p0

    .line 24
    add-int/2addr v1, v0

    .line 25
    return v1

    .line 26
    :cond_1
    return v0
.end method

.method public static d(Landroid/view/View;FF)Landroid/animation/ObjectAnimator;
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [F

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    aput p1, v0, v1

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    aput p2, v0, p1

    .line 9
    .line 10
    const-string p1, "translationY"

    .line 11
    .line 12
    invoke-static {p0, p1, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static j(Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const v0, 0x7f0a0208

    .line 6
    .line 7
    .line 8
    if-eq p0, v0, :cond_1

    .line 9
    .line 10
    const v0, 0x7f0a021a

    .line 11
    .line 12
    .line 13
    if-eq p0, v0, :cond_1

    .line 14
    .line 15
    const v0, 0x7f0a0226

    .line 16
    .line 17
    .line 18
    if-eq p0, v0, :cond_1

    .line 19
    .line 20
    const v0, 0x7f0a021d

    .line 21
    .line 22
    .line 23
    if-eq p0, v0, :cond_1

    .line 24
    .line 25
    const v0, 0x7f0a022a

    .line 26
    .line 27
    .line 28
    if-eq p0, v0, :cond_1

    .line 29
    .line 30
    const v0, 0x7f0a022b

    .line 31
    .line 32
    .line 33
    if-eq p0, v0, :cond_1

    .line 34
    .line 35
    const v0, 0x7f0a0214

    .line 36
    .line 37
    .line 38
    if-eq p0, v0, :cond_1

    .line 39
    .line 40
    const v0, 0x7f0a0215

    .line 41
    .line 42
    .line 43
    if-ne p0, v0, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 p0, 0x0

    .line 47
    return p0

    .line 48
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 49
    return p0
.end method


# virtual methods
.method public final a(F)V
    .locals 4

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    iget-object v1, p0, Lqj3;->i:Landroid/view/ViewGroup;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    int-to-float v2, v2

    .line 12
    sub-float v3, v0, p1

    .line 13
    .line 14
    mul-float/2addr v3, v2

    .line 15
    float-to-int v2, v3

    .line 16
    int-to-float v2, v2

    .line 17
    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationX(F)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v1, p0, Lqj3;->j:Landroid/view/ViewGroup;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    sub-float v2, v0, p1

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 27
    .line 28
    .line 29
    :cond_1
    iget-object p0, p0, Lqj3;->g:Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    sub-float/2addr v0, p1

    .line 34
    invoke-virtual {p0, v0}, Landroid/view/View;->setAlpha(F)V

    .line 35
    .line 36
    .line 37
    :cond_2
    return-void
.end method

.method public final b(Landroid/view/View;)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lqj3;->z:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final e(Ljava/lang/Runnable;J)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p2, v0

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lqj3;->a:Landroidx/media3/ui/PlayerControlView;

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lqj3;->x:Lmj3;

    .line 2
    .line 3
    iget-object v1, p0, Lqj3;->a:Landroidx/media3/ui/PlayerControlView;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lqj3;->u:Lmj3;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lqj3;->w:Lmj3;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lqj3;->v:Lmj3;

    .line 19
    .line 20
    invoke-virtual {v1, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final g()V
    .locals 4

    .line 1
    iget v0, p0, Lqj3;->A:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p0}, Lqj3;->f()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lqj3;->a:Landroidx/media3/ui/PlayerControlView;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerControlView;->getShowTimeoutMs()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_3

    .line 17
    .line 18
    iget-boolean v1, p0, Lqj3;->D:Z

    .line 19
    .line 20
    if-nez v1, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Lqj3;->x:Lmj3;

    .line 23
    .line 24
    int-to-long v2, v0

    .line 25
    invoke-virtual {p0, v1, v2, v3}, Lqj3;->e(Ljava/lang/Runnable;J)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget v1, p0, Lqj3;->A:I

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-ne v1, v2, :cond_2

    .line 33
    .line 34
    iget-object v0, p0, Lqj3;->v:Lmj3;

    .line 35
    .line 36
    const-wide/16 v1, 0x7d0

    .line 37
    .line 38
    invoke-virtual {p0, v0, v1, v2}, Lqj3;->e(Ljava/lang/Runnable;J)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    iget-object v1, p0, Lqj3;->w:Lmj3;

    .line 43
    .line 44
    int-to-long v2, v0

    .line 45
    invoke-virtual {p0, v1, v2, v3}, Lqj3;->e(Ljava/lang/Runnable;J)V

    .line 46
    .line 47
    .line 48
    :cond_3
    :goto_0
    return-void
.end method

.method public final h(Landroid/view/View;Z)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lqj3;->z:Ljava/util/ArrayList;

    .line 5
    .line 6
    if-nez p2, :cond_1

    .line 7
    .line 8
    const/16 p0, 0x8

    .line 9
    .line 10
    invoke-virtual {p1, p0}, Landroid/view/View;->setVisibility(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    iget-boolean p0, p0, Lqj3;->B:Z

    .line 18
    .line 19
    if-eqz p0, :cond_2

    .line 20
    .line 21
    invoke-static {p1}, Lqj3;->j(Landroid/view/View;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    const/4 p0, 0x4

    .line 28
    invoke-virtual {p1, p0}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    const/4 p0, 0x0

    .line 33
    invoke-virtual {p1, p0}, Landroid/view/View;->setVisibility(I)V

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final i(I)V
    .locals 2

    .line 1
    iget v0, p0, Lqj3;->A:I

    .line 2
    .line 3
    iput p1, p0, Lqj3;->A:I

    .line 4
    .line 5
    iget-object p0, p0, Lqj3;->a:Landroidx/media3/ui/PlayerControlView;

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-ne p1, v1, :cond_0

    .line 9
    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    if-ne v0, v1, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    if-eq v0, p1, :cond_4

    .line 23
    .line 24
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView;->x:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-eqz p1, :cond_3

    .line 42
    .line 43
    invoke-static {}, Lkf2;->k()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    throw p0

    .line 52
    :cond_4
    :goto_1
    return-void
.end method
