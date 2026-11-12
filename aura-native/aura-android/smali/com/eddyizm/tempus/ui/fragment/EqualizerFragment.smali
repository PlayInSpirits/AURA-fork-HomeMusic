.class public final Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public l0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public m0:Landroid/view/View;

.field public n0:Lwo0;

.field public o0:Landroid/widget/LinearLayout;

.field public p0:Landroid/widget/Switch;

.field public q0:Landroid/widget/Button;

.field public r0:Landroid/widget/Space;

.field public final s0:Ljava/util/ArrayList;

.field public t0:Z

.field public final u0:Lv9;

.field public final v0:Ly11;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lkc1;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->s0:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Lv9;

    .line 12
    .line 13
    const/4 v1, 0x5

    .line 14
    invoke-direct {v0, v1, p0}, Lv9;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->u0:Lv9;

    .line 18
    .line 19
    new-instance v0, Ly11;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-direct {v0, v1, p0}, Ly11;-><init>(ILkc1;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->v0:Ly11;

    .line 26
    .line 27
    return-void
.end method

.method public static final h0(Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;)V
    .locals 21

    .line 1
    move-object/from16 v4, p0

    .line 2
    .line 3
    iget-object v0, v4, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->n0:Lwo0;

    .line 4
    .line 5
    iget-object v1, v4, Lkc1;->T:Landroid/view/View;

    .line 6
    .line 7
    const/4 v6, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const v2, 0x7f0a01fb

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/widget/LinearLayout;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v1, v6

    .line 21
    :goto_0
    iget-object v2, v4, Lkc1;->T:Landroid/view/View;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    const v3, 0x7f0a0201

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move-object v2, v6

    .line 34
    :goto_1
    const-string v3, "safeSpace"

    .line 35
    .line 36
    const-string v7, "eqBandsContainer"

    .line 37
    .line 38
    const-string v8, "resetButton"

    .line 39
    .line 40
    const/4 v9, 0x0

    .line 41
    const/16 v10, 0x8

    .line 42
    .line 43
    if-eqz v0, :cond_17

    .line 44
    .line 45
    iget-object v5, v0, Lwo0;->n:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v5, Lv11;

    .line 48
    .line 49
    invoke-interface {v5}, Lv11;->b()S

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-nez v5, :cond_2

    .line 54
    .line 55
    goto/16 :goto_9

    .line 56
    .line 57
    :cond_2
    if-eqz v1, :cond_3

    .line 58
    .line 59
    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 60
    .line 61
    .line 62
    :cond_3
    if-eqz v2, :cond_4

    .line 63
    .line 64
    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    .line 65
    .line 66
    .line 67
    :cond_4
    iget-object v1, v4, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->q0:Landroid/widget/Button;

    .line 68
    .line 69
    if-eqz v1, :cond_16

    .line 70
    .line 71
    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 72
    .line 73
    .line 74
    iget-object v1, v4, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->o0:Landroid/widget/LinearLayout;

    .line 75
    .line 76
    if-eqz v1, :cond_15

    .line 77
    .line 78
    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 79
    .line 80
    .line 81
    iget-object v1, v4, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->r0:Landroid/widget/Space;

    .line 82
    .line 83
    if-eqz v1, :cond_14

    .line 84
    .line 85
    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 86
    .line 87
    .line 88
    iget-object v1, v4, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->p0:Landroid/widget/Switch;

    .line 89
    .line 90
    const-string v2, "eqSwitch"

    .line 91
    .line 92
    if-eqz v1, :cond_13

    .line 93
    .line 94
    invoke-virtual {v1, v6}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 95
    .line 96
    .line 97
    iget-object v1, v4, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->p0:Landroid/widget/Switch;

    .line 98
    .line 99
    if-eqz v1, :cond_12

    .line 100
    .line 101
    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    invoke-virtual {v4, v1}, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->l0(Z)V

    .line 106
    .line 107
    .line 108
    iget-object v1, v4, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->p0:Landroid/widget/Switch;

    .line 109
    .line 110
    if-eqz v1, :cond_11

    .line 111
    .line 112
    new-instance v2, Lw11;

    .line 113
    .line 114
    invoke-direct {v2, v9, v0, v4}, Lw11;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 118
    .line 119
    .line 120
    iget-object v11, v4, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->s0:Ljava/util/ArrayList;

    .line 121
    .line 122
    iget-object v2, v4, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->n0:Lwo0;

    .line 123
    .line 124
    if-nez v2, :cond_6

    .line 125
    .line 126
    :cond_5
    move-object/from16 v17, v6

    .line 127
    .line 128
    goto/16 :goto_8

    .line 129
    .line 130
    :cond_6
    iget-object v0, v2, Lwo0;->n:Ljava/lang/Object;

    .line 131
    .line 132
    move-object v12, v0

    .line 133
    check-cast v12, Lv11;

    .line 134
    .line 135
    iget-object v0, v4, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->o0:Landroid/widget/LinearLayout;

    .line 136
    .line 137
    if-eqz v0, :cond_10

    .line 138
    .line 139
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v11}, Ljava/util/ArrayList;->clear()V

    .line 143
    .line 144
    .line 145
    invoke-interface {v12}, Lv11;->b()S

    .line 146
    .line 147
    .line 148
    move-result v13

    .line 149
    invoke-interface {v12}, Lv11;->d()[S

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    const/4 v14, 0x1

    .line 154
    if-nez v0, :cond_7

    .line 155
    .line 156
    const/4 v0, 0x2

    .line 157
    new-array v0, v0, [S

    .line 158
    .line 159
    const/16 v1, -0x5dc

    .line 160
    .line 161
    aput-short v1, v0, v9

    .line 162
    .line 163
    const/16 v1, 0x5dc

    .line 164
    .line 165
    aput-short v1, v0, v14

    .line 166
    .line 167
    :cond_7
    aget-short v1, v0, v9

    .line 168
    .line 169
    div-int/lit8 v1, v1, 0x64

    .line 170
    .line 171
    aget-short v0, v0, v14

    .line 172
    .line 173
    div-int/lit8 v15, v0, 0x64

    .line 174
    .line 175
    invoke-static {v13}, Lud3;->q(S)[S

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    move v3, v9

    .line 180
    :goto_2
    if-ge v3, v13, :cond_5

    .line 181
    .line 182
    int-to-short v5, v3

    .line 183
    invoke-interface {v12, v5}, Lv11;->n(S)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v16

    .line 187
    if-eqz v16, :cond_8

    .line 188
    .line 189
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    .line 190
    .line 191
    .line 192
    move-result v16

    .line 193
    move/from16 v14, v16

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_8
    move v14, v9

    .line 197
    :goto_3
    new-instance v6, Landroid/widget/LinearLayout;

    .line 198
    .line 199
    invoke-virtual {v4}, Lkc1;->Z()Landroid/content/Context;

    .line 200
    .line 201
    .line 202
    move-result-object v10

    .line 203
    invoke-direct {v6, v10}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v6, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 207
    .line 208
    .line 209
    new-instance v10, Landroid/widget/LinearLayout$LayoutParams;

    .line 210
    .line 211
    const/4 v9, -0x1

    .line 212
    move/from16 v18, v1

    .line 213
    .line 214
    const/4 v1, -0x2

    .line 215
    invoke-direct {v10, v9, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 219
    .line 220
    .line 221
    move-result-object v9

    .line 222
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 226
    .line 227
    .line 228
    move-result-object v9

    .line 229
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 230
    .line 231
    .line 232
    move-result-object v9

    .line 233
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 234
    .line 235
    const/high16 v19, 0x41800000    # 16.0f

    .line 236
    .line 237
    mul-float v9, v9, v19

    .line 238
    .line 239
    float-to-int v9, v9

    .line 240
    iput v9, v10, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 241
    .line 242
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 243
    .line 244
    .line 245
    move-result-object v9

    .line 246
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 250
    .line 251
    .line 252
    move-result-object v9

    .line 253
    invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 254
    .line 255
    .line 256
    move-result-object v9

    .line 257
    iget v9, v9, Landroid/util/DisplayMetrics;->density:F

    .line 258
    .line 259
    mul-float v9, v9, v19

    .line 260
    .line 261
    float-to-int v9, v9

    .line 262
    iput v9, v10, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 263
    .line 264
    invoke-virtual {v6, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 265
    .line 266
    .line 267
    const/4 v9, 0x0

    .line 268
    const/16 v10, 0x8

    .line 269
    .line 270
    invoke-virtual {v6, v9, v10, v9, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 271
    .line 272
    .line 273
    new-instance v10, Landroid/widget/TextView;

    .line 274
    .line 275
    invoke-virtual {v4}, Lkc1;->Z()Landroid/content/Context;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    move-object/from16 v20, v2

    .line 280
    .line 281
    const v2, 0x7f140163

    .line 282
    .line 283
    .line 284
    const/4 v4, 0x0

    .line 285
    invoke-direct {v10, v1, v4, v9, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 286
    .line 287
    .line 288
    const/16 v1, 0x3e8

    .line 289
    .line 290
    if-lt v14, v1, :cond_a

    .line 291
    .line 292
    rem-int/lit16 v1, v14, 0x3e8

    .line 293
    .line 294
    if-nez v1, :cond_9

    .line 295
    .line 296
    div-int/lit16 v14, v14, 0x3e8

    .line 297
    .line 298
    new-instance v1, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 304
    .line 305
    .line 306
    const-string v4, " kHz"

    .line 307
    .line 308
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    const/4 v9, 0x1

    .line 316
    goto :goto_4

    .line 317
    :cond_9
    int-to-float v1, v14

    .line 318
    const/high16 v4, 0x447a0000    # 1000.0f

    .line 319
    .line 320
    div-float/2addr v1, v4

    .line 321
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    const/4 v9, 0x1

    .line 330
    invoke-static {v1, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    const-string v4, "%.1f kHz"

    .line 335
    .line 336
    invoke-static {v4, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    goto :goto_4

    .line 341
    :cond_a
    const/4 v9, 0x1

    .line 342
    new-instance v1, Ljava/lang/StringBuilder;

    .line 343
    .line 344
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    const-string v4, " Hz"

    .line 351
    .line 352
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    :goto_4
    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 360
    .line 361
    .line 362
    const v1, 0x800003

    .line 363
    .line 364
    .line 365
    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 366
    .line 367
    .line 368
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 369
    .line 370
    const/high16 v4, 0x40000000    # 2.0f

    .line 371
    .line 372
    const/4 v9, -0x2

    .line 373
    const/4 v14, 0x0

    .line 374
    invoke-direct {v1, v14, v9, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v10, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 378
    .line 379
    .line 380
    invoke-virtual {v6, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 381
    .line 382
    .line 383
    if-ltz v3, :cond_b

    .line 384
    .line 385
    array-length v1, v0

    .line 386
    if-ge v3, v1, :cond_b

    .line 387
    .line 388
    aget-short v1, v0, v3

    .line 389
    .line 390
    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    goto :goto_5

    .line 395
    :cond_b
    const/4 v1, 0x0

    .line 396
    :goto_5
    if-eqz v1, :cond_c

    .line 397
    .line 398
    :goto_6
    invoke-virtual {v1}, Ljava/lang/Short;->shortValue()S

    .line 399
    .line 400
    .line 401
    move-result v1

    .line 402
    goto :goto_7

    .line 403
    :cond_c
    invoke-interface {v12, v5}, Lv11;->z(S)Ljava/lang/Short;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    if-eqz v1, :cond_d

    .line 408
    .line 409
    goto :goto_6

    .line 410
    :cond_d
    const/4 v1, 0x0

    .line 411
    :goto_7
    div-int/lit8 v1, v1, 0x64

    .line 412
    .line 413
    move v9, v3

    .line 414
    move v3, v5

    .line 415
    new-instance v5, Landroid/widget/TextView;

    .line 416
    .line 417
    invoke-virtual/range {p0 .. p0}, Lkc1;->Z()Landroid/content/Context;

    .line 418
    .line 419
    .line 420
    move-result-object v10

    .line 421
    const/4 v4, 0x0

    .line 422
    const/4 v14, 0x0

    .line 423
    invoke-direct {v5, v10, v4, v14, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 424
    .line 425
    .line 426
    invoke-static {v1}, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->j0(I)Ljava/lang/String;

    .line 427
    .line 428
    .line 429
    move-result-object v2

    .line 430
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 431
    .line 432
    .line 433
    const/16 v2, 0xc

    .line 434
    .line 435
    invoke-virtual {v5, v2, v14, v14, v14}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 436
    .line 437
    .line 438
    const v2, 0x800005

    .line 439
    .line 440
    .line 441
    invoke-virtual {v5, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 442
    .line 443
    .line 444
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 445
    .line 446
    const/high16 v4, 0x40000000    # 2.0f

    .line 447
    .line 448
    const/4 v10, -0x2

    .line 449
    invoke-direct {v2, v14, v10, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v5, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 453
    .line 454
    .line 455
    new-instance v2, Landroid/widget/SeekBar;

    .line 456
    .line 457
    invoke-virtual/range {p0 .. p0}, Lkc1;->Z()Landroid/content/Context;

    .line 458
    .line 459
    .line 460
    move-result-object v4

    .line 461
    invoke-direct {v2, v4}, Landroid/widget/SeekBar;-><init>(Landroid/content/Context;)V

    .line 462
    .line 463
    .line 464
    sub-int v4, v15, v18

    .line 465
    .line 466
    invoke-virtual {v2, v4}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 467
    .line 468
    .line 469
    sub-int v1, v1, v18

    .line 470
    .line 471
    invoke-virtual {v2, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 472
    .line 473
    .line 474
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 475
    .line 476
    const/high16 v4, 0x40c00000    # 6.0f

    .line 477
    .line 478
    invoke-direct {v1, v14, v10, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 482
    .line 483
    .line 484
    move-object v1, v0

    .line 485
    new-instance v0, Lz11;

    .line 486
    .line 487
    move-object/from16 v4, p0

    .line 488
    .line 489
    move-object v14, v2

    .line 490
    move v10, v9

    .line 491
    move-object/from16 v2, v20

    .line 492
    .line 493
    move-object v9, v1

    .line 494
    move/from16 v1, v18

    .line 495
    .line 496
    invoke-direct/range {v0 .. v5}, Lz11;-><init>(ILwo0;SLcom/eddyizm/tempus/ui/fragment/EqualizerFragment;Landroid/widget/TextView;)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v14, v0}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 500
    .line 501
    .line 502
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    invoke-virtual {v6, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v6, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 509
    .line 510
    .line 511
    iget-object v0, v4, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->o0:Landroid/widget/LinearLayout;

    .line 512
    .line 513
    if-eqz v0, :cond_e

    .line 514
    .line 515
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 516
    .line 517
    .line 518
    add-int/lit8 v3, v10, 0x1

    .line 519
    .line 520
    move-object v0, v9

    .line 521
    const/4 v6, 0x0

    .line 522
    const/4 v9, 0x0

    .line 523
    const/16 v10, 0x8

    .line 524
    .line 525
    const/4 v14, 0x1

    .line 526
    goto/16 :goto_2

    .line 527
    .line 528
    :cond_e
    invoke-static {v7}, Lh12;->Q(Ljava/lang/String;)V

    .line 529
    .line 530
    .line 531
    const/16 v17, 0x0

    .line 532
    .line 533
    throw v17

    .line 534
    :goto_8
    iget-object v0, v4, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->q0:Landroid/widget/Button;

    .line 535
    .line 536
    if-eqz v0, :cond_f

    .line 537
    .line 538
    new-instance v1, Lx11;

    .line 539
    .line 540
    const/4 v14, 0x0

    .line 541
    invoke-direct {v1, v4, v14}, Lx11;-><init>(Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;I)V

    .line 542
    .line 543
    .line 544
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 545
    .line 546
    .line 547
    return-void

    .line 548
    :cond_f
    invoke-static {v8}, Lh12;->Q(Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    throw v17

    .line 552
    :cond_10
    move-object/from16 v17, v6

    .line 553
    .line 554
    invoke-static {v7}, Lh12;->Q(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    throw v17

    .line 558
    :cond_11
    move-object/from16 v17, v6

    .line 559
    .line 560
    invoke-static {v2}, Lh12;->Q(Ljava/lang/String;)V

    .line 561
    .line 562
    .line 563
    throw v17

    .line 564
    :cond_12
    move-object/from16 v17, v6

    .line 565
    .line 566
    invoke-static {v2}, Lh12;->Q(Ljava/lang/String;)V

    .line 567
    .line 568
    .line 569
    throw v17

    .line 570
    :cond_13
    move-object/from16 v17, v6

    .line 571
    .line 572
    invoke-static {v2}, Lh12;->Q(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    throw v17

    .line 576
    :cond_14
    move-object/from16 v17, v6

    .line 577
    .line 578
    invoke-static {v3}, Lh12;->Q(Ljava/lang/String;)V

    .line 579
    .line 580
    .line 581
    throw v17

    .line 582
    :cond_15
    move-object/from16 v17, v6

    .line 583
    .line 584
    invoke-static {v7}, Lh12;->Q(Ljava/lang/String;)V

    .line 585
    .line 586
    .line 587
    throw v17

    .line 588
    :cond_16
    move-object/from16 v17, v6

    .line 589
    .line 590
    invoke-static {v8}, Lh12;->Q(Ljava/lang/String;)V

    .line 591
    .line 592
    .line 593
    throw v17

    .line 594
    :cond_17
    :goto_9
    const/16 v10, 0x8

    .line 595
    .line 596
    if-eqz v2, :cond_18

    .line 597
    .line 598
    invoke-virtual {v2, v10}, Landroid/view/View;->setVisibility(I)V

    .line 599
    .line 600
    .line 601
    :cond_18
    iget-object v0, v4, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->q0:Landroid/widget/Button;

    .line 602
    .line 603
    if-eqz v0, :cond_1c

    .line 604
    .line 605
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 606
    .line 607
    .line 608
    iget-object v0, v4, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->o0:Landroid/widget/LinearLayout;

    .line 609
    .line 610
    if-eqz v0, :cond_1b

    .line 611
    .line 612
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 613
    .line 614
    .line 615
    iget-object v0, v4, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->r0:Landroid/widget/Space;

    .line 616
    .line 617
    if-eqz v0, :cond_1a

    .line 618
    .line 619
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 620
    .line 621
    .line 622
    if-eqz v1, :cond_19

    .line 623
    .line 624
    const/4 v14, 0x0

    .line 625
    invoke-virtual {v1, v14}, Landroid/view/View;->setVisibility(I)V

    .line 626
    .line 627
    .line 628
    :cond_19
    return-void

    .line 629
    :cond_1a
    invoke-static {v3}, Lh12;->Q(Ljava/lang/String;)V

    .line 630
    .line 631
    .line 632
    const/16 v17, 0x0

    .line 633
    .line 634
    throw v17

    .line 635
    :cond_1b
    const/16 v17, 0x0

    .line 636
    .line 637
    invoke-static {v7}, Lh12;->Q(Ljava/lang/String;)V

    .line 638
    .line 639
    .line 640
    throw v17

    .line 641
    :cond_1c
    const/16 v17, 0x0

    .line 642
    .line 643
    invoke-static {v8}, Lh12;->Q(Ljava/lang/String;)V

    .line 644
    .line 645
    .line 646
    throw v17
.end method

.method public static final i0(Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->n0:Lwo0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-object v0, v0, Lwo0;->n:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lv11;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->p0:Landroid/widget/Switch;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const-string v3, "eqSwitch"

    .line 14
    .line 15
    if-eqz v1, :cond_5

    .line 16
    .line 17
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const-string v5, "equalizer_enabled"

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    invoke-virtual {v1, v4}, Landroid/widget/Switch;->setChecked(Z)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->p0:Landroid/widget/Switch;

    .line 39
    .line 40
    if-eqz v1, :cond_4

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-virtual {p0, v1}, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->l0(Z)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v0}, Lv11;->b()S

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-interface {v0}, Lv11;->d()[S

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    if-nez v2, :cond_1

    .line 58
    .line 59
    const/4 v2, 0x2

    .line 60
    new-array v2, v2, [S

    .line 61
    .line 62
    const/16 v3, -0x5dc

    .line 63
    .line 64
    aput-short v3, v2, v6

    .line 65
    .line 66
    const/16 v3, 0x5dc

    .line 67
    .line 68
    const/4 v4, 0x1

    .line 69
    aput-short v3, v2, v4

    .line 70
    .line 71
    :cond_1
    aget-short v2, v2, v6

    .line 72
    .line 73
    div-int/lit8 v2, v2, 0x64

    .line 74
    .line 75
    invoke-static {v1}, Lud3;->q(S)[S

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    :goto_0
    if-ge v6, v1, :cond_3

    .line 80
    .line 81
    aget-short v4, v3, v6

    .line 82
    .line 83
    div-int/lit8 v4, v4, 0x64

    .line 84
    .line 85
    int-to-short v5, v6

    .line 86
    mul-int/lit8 v7, v4, 0x64

    .line 87
    .line 88
    int-to-short v7, v7

    .line 89
    invoke-interface {v0, v5, v7}, Lv11;->v(SS)V

    .line 90
    .line 91
    .line 92
    iget-object v5, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->s0:Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-static {v5, v6}, Lq40;->y0(Ljava/util/List;I)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    check-cast v5, Landroid/widget/SeekBar;

    .line 99
    .line 100
    if-eqz v5, :cond_2

    .line 101
    .line 102
    sub-int/2addr v4, v2

    .line 103
    invoke-virtual {v5, v4}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 104
    .line 105
    .line 106
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_3
    :goto_1
    return-void

    .line 110
    :cond_4
    invoke-static {v3}, Lh12;->Q(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw v2

    .line 114
    :cond_5
    invoke-static {v3}, Lh12;->Q(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw v2
.end method

.method public static j0(I)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, " dB"

    .line 2
    .line 3
    if-lez p0, :cond_0

    .line 4
    .line 5
    const-string v1, "+"

    .line 6
    .line 7
    invoke-static {p0, v1, v0}, Lb11;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method


# virtual methods
.method public final E(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Lkc1;->E(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 12
    .line 13
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->l0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 14
    .line 15
    return-void
.end method

.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const p3, 0x7f0d006c

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->m0:Landroid/view/View;

    .line 16
    .line 17
    const p2, 0x7f0a01ff

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    check-cast p1, Landroid/widget/Switch;

    .line 28
    .line 29
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->p0:Landroid/widget/Switch;

    .line 30
    .line 31
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    const-string p3, "equalizer_enabled"

    .line 43
    .line 44
    invoke-interface {p2, p3, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    invoke-virtual {p1, p2}, Landroid/widget/Switch;->setChecked(Z)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->p0:Landroid/widget/Switch;

    .line 52
    .line 53
    const/4 p2, 0x0

    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/widget/Switch;->jumpDrawablesToCurrentState()V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->m0:Landroid/view/View;

    .line 60
    .line 61
    const-string p3, "root"

    .line 62
    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    const v0, 0x7f0a0202

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 76
    .line 77
    new-instance v0, Lx11;

    .line 78
    .line 79
    const/4 v1, 0x1

    .line 80
    invoke-direct {v0, p0, v1}, Lx11;-><init>(Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->m0:Landroid/view/View;

    .line 87
    .line 88
    if-eqz p0, :cond_0

    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_0
    invoke-static {p3}, Lh12;->Q(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p2

    .line 95
    :cond_1
    invoke-static {p3}, Lh12;->Q(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p2

    .line 99
    :cond_2
    const-string p0, "eqSwitch"

    .line 100
    .line 101
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p2
.end method

.method public final R()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    new-instance v1, Landroid/content/Intent;

    .line 5
    .line 6
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const-class v3, Lcom/eddyizm/tempus/service/MediaService;

    .line 11
    .line 12
    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 13
    .line 14
    .line 15
    const-string v2, "com.eddyizm.tempus.service.BIND_EQUALIZER"

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->v0:Ly11;

    .line 25
    .line 26
    invoke-virtual {v2, v1, v3, v0}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 27
    .line 28
    .line 29
    iget-boolean v1, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->t0:Z

    .line 30
    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    new-instance v2, Landroid/content/IntentFilter;

    .line 38
    .line 39
    const-string v3, "com.eddyizm.tempus.service.EQUALIZER_UPDATED"

    .line 40
    .line 41
    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 45
    .line 46
    const/16 v4, 0x21

    .line 47
    .line 48
    iget-object v5, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->u0:Lv9;

    .line 49
    .line 50
    const/4 v6, 0x4

    .line 51
    if-lt v3, v4, :cond_0

    .line 52
    .line 53
    invoke-static {v1, v5, v2, v6}, Lr50;->j(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    const/16 v4, 0x1a

    .line 58
    .line 59
    if-lt v3, v4, :cond_1

    .line 60
    .line 61
    invoke-static {v1, v5, v2, v6}, Lr50;->i(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-static {v1}, Lud3;->d0(Landroid/content/Context;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    const/4 v4, 0x0

    .line 70
    invoke-virtual {v1, v5, v2, v3, v4}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/String;Landroid/os/Handler;)Landroid/content/Intent;

    .line 71
    .line 72
    .line 73
    :goto_0
    iput-boolean v0, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->t0:Z

    .line 74
    .line 75
    :cond_2
    return-void
.end method

.method public final S()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->v0:Ly11;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->n0:Lwo0;

    .line 15
    .line 16
    iget-boolean v2, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->t0:Z

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    :try_start_0
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->u0:Lv9;

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    :catch_0
    const/4 v2, 0x0

    .line 30
    iput-boolean v2, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->t0:Z

    .line 31
    .line 32
    :cond_0
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->l0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 33
    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->I(Z)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    const-string p0, "activity"

    .line 41
    .line 42
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v1
.end method

.method public final T(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const p2, 0x7f0a01f5

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    check-cast p2, Landroid/widget/LinearLayout;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->o0:Landroid/widget/LinearLayout;

    .line 17
    .line 18
    const p2, 0x7f0a01fe

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    check-cast p2, Landroid/widget/Button;

    .line 29
    .line 30
    iput-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->q0:Landroid/widget/Button;

    .line 31
    .line 32
    const p2, 0x7f0a01fa

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    check-cast p1, Landroid/widget/Space;

    .line 43
    .line 44
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->r0:Landroid/widget/Space;

    .line 45
    .line 46
    return-void
.end method

.method public final k0()V
    .locals 5

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->n0:Lwo0;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p0, p0, Lwo0;->n:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lv11;

    .line 9
    .line 10
    invoke-interface {p0}, Lv11;->b()S

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    new-array v1, v0, [S

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    move v3, v2

    .line 18
    :goto_0
    if-ge v3, v0, :cond_2

    .line 19
    .line 20
    int-to-short v4, v3

    .line 21
    invoke-interface {p0, v4}, Lv11;->z(S)Ljava/lang/Short;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    if-eqz v4, :cond_1

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/Short;->shortValue()S

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v4, v2

    .line 33
    :goto_1
    aput-short v4, v1, v3

    .line 34
    .line 35
    add-int/lit8 v3, v3, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    invoke-static {v1}, Lud3;->k0([S)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final l0(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->q0:Landroid/widget/Button;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->s0:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    if-ge v1, v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    add-int/lit8 v1, v1, 0x1

    .line 22
    .line 23
    check-cast v2, Landroid/widget/SeekBar;

    .line 24
    .line 25
    invoke-virtual {v2, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void

    .line 30
    :cond_1
    const-string p0, "resetButton"

    .line 31
    .line 32
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    throw p0
.end method
