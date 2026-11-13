.class public final synthetic Ldefpackage/uj3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/a83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/uj3;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/uj3;->b:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 12

    .line 1
    iget v0, p0, Ldefpackage/uj3;->a:I

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    iget-object p0, p0, Ldefpackage/uj3;->b:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/util/List;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->m0()V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    check-cast p1, Ldefpackage/v52;

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->m0()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_1
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->u0:Landroid/widget/TextView;

    .line 26
    .line 27
    new-instance v2, Ldefpackage/j8;

    .line 28
    .line 29
    const/16 v3, 0x10

    .line 30
    .line 31
    invoke-direct {v2, v3, p0, p1}, Ldefpackage/j8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->u0:Landroid/widget/TextView;

    .line 38
    .line 39
    if-nez p1, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    new-instance v0, Ldefpackage/i8;

    .line 43
    .line 44
    invoke-direct {v0, v1, p0, p1}, Ldefpackage/i8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    :goto_0
    return-void

    .line 51
    :pswitch_2
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 52
    .line 53
    if-eqz p1, :cond_f

    .line 54
    .line 55
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-boolean v0, v0, Ldefpackage/v52;->a:Z

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iget-object v1, v1, Ldefpackage/v52;->x:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_2

    .line 78
    .line 79
    goto/16 :goto_a

    .line 80
    .line 81
    :cond_2
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->p0:Landroid/widget/ToggleButton;

    .line 82
    .line 83
    const/4 v1, 0x1

    .line 84
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->r0:Ldefpackage/pu3;

    .line 88
    .line 89
    iput-object p1, v0, Ldefpackage/pu3;->f:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 90
    .line 91
    const/4 v2, 0x0

    .line 92
    iput-object v2, v0, Ldefpackage/pu3;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 93
    .line 94
    iput-object v2, v0, Ldefpackage/pu3;->h:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 95
    .line 96
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->p0:Landroid/widget/ToggleButton;

    .line 97
    .line 98
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getStarred()Ljava/util/Date;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    const/4 v5, 0x0

    .line 107
    if-eqz v4, :cond_3

    .line 108
    .line 109
    move v4, v1

    .line 110
    goto :goto_1

    .line 111
    :cond_3
    move v4, v5

    .line 112
    :goto_1
    invoke-static {v1, v3, v4}, Ldefpackage/n61;->f(ILjava/lang/String;Z)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    invoke-virtual {v0, v3}, Landroid/widget/ToggleButton;->setChecked(Z)V

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->p0:Landroid/widget/ToggleButton;

    .line 120
    .line 121
    new-instance v3, Ldefpackage/j8;

    .line 122
    .line 123
    const/16 v4, 0x11

    .line 124
    .line 125
    invoke-direct {v3, v4, p0, p1}, Ldefpackage/j8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 129
    .line 130
    .line 131
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Ldefpackage/i61;

    .line 132
    .line 133
    iget-object v0, v0, Ldefpackage/i61;->o:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, Landroid/widget/LinearLayout;

    .line 136
    .line 137
    sget-object v3, Ldefpackage/ur1;->a:Ljava/util/concurrent/ExecutorService;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    const v3, 0x7f0a02dc

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    if-nez v4, :cond_c

    .line 150
    .line 151
    const v4, 0x7f0a0135

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    if-nez v4, :cond_4

    .line 159
    .line 160
    goto/16 :goto_6

    .line 161
    .line 162
    :cond_4
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    instance-of v7, v6, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 167
    .line 168
    if-eqz v7, :cond_5

    .line 169
    .line 170
    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_5
    move-object v6, v2

    .line 174
    :goto_2
    if-nez v6, :cond_6

    .line 175
    .line 176
    goto/16 :goto_6

    .line 177
    .line 178
    :cond_6
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    new-instance v7, Landroid/widget/ImageButton;

    .line 183
    .line 184
    invoke-direct {v7, v0}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v7, v3}, Landroid/view/View;->setId(I)V

    .line 188
    .line 189
    .line 190
    const v3, 0x7f1301a3

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v3

    .line 197
    invoke-virtual {v7, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 198
    .line 199
    .line 200
    const v3, 0x7f080157

    .line 201
    .line 202
    .line 203
    invoke-virtual {v7, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 204
    .line 205
    .line 206
    sget-object v3, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 207
    .line 208
    invoke-virtual {v7, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 209
    .line 210
    .line 211
    new-instance v3, Landroid/util/TypedValue;

    .line 212
    .line 213
    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    const v9, 0x101045c

    .line 221
    .line 222
    .line 223
    invoke-virtual {v8, v9, v3, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 224
    .line 225
    .line 226
    iget v1, v3, Landroid/util/TypedValue;->resourceId:I

    .line 227
    .line 228
    invoke-virtual {v7, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v7, v5, v5, v5, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 239
    .line 240
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 249
    .line 250
    const/high16 v3, 0x41800000    # 16.0f

    .line 251
    .line 252
    mul-float/2addr v3, v0

    .line 253
    float-to-int v0, v3

    .line 254
    new-instance v3, Ldefpackage/mb0;

    .line 255
    .line 256
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 257
    .line 258
    .line 259
    move-result-object v8

    .line 260
    iget v8, v8, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 261
    .line 262
    invoke-direct {v3, v1, v8}, Ldefpackage/mb0;-><init>(II)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    iput v1, v3, Ldefpackage/mb0;->i:I

    .line 270
    .line 271
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 272
    .line 273
    .line 274
    move-result v1

    .line 275
    iput v1, v3, Ldefpackage/mb0;->l:I

    .line 276
    .line 277
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    iput v1, v3, Ldefpackage/mb0;->u:I

    .line 282
    .line 283
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getChildCount()I

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    move v1, v5

    .line 291
    :goto_3
    if-ge v1, v0, :cond_a

    .line 292
    .line 293
    invoke-virtual {v6, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 298
    .line 299
    .line 300
    move-result-object v9

    .line 301
    instance-of v10, v9, Ldefpackage/mb0;

    .line 302
    .line 303
    if-eqz v10, :cond_7

    .line 304
    .line 305
    check-cast v9, Ldefpackage/mb0;

    .line 306
    .line 307
    goto :goto_4

    .line 308
    :cond_7
    move-object v9, v2

    .line 309
    :goto_4
    if-nez v9, :cond_8

    .line 310
    .line 311
    goto :goto_5

    .line 312
    :cond_8
    iget v10, v9, Ldefpackage/mb0;->u:I

    .line 313
    .line 314
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 315
    .line 316
    .line 317
    move-result v11

    .line 318
    if-ne v10, v11, :cond_9

    .line 319
    .line 320
    invoke-virtual {v7}, Landroid/view/View;->getId()I

    .line 321
    .line 322
    .line 323
    move-result v10

    .line 324
    iput v10, v9, Ldefpackage/mb0;->u:I

    .line 325
    .line 326
    invoke-virtual {v8, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 327
    .line 328
    .line 329
    :cond_9
    :goto_5
    add-int/lit8 v1, v1, 0x1

    .line 330
    .line 331
    goto :goto_3

    .line 332
    :cond_a
    invoke-virtual {v6, v7, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 333
    .line 334
    .line 335
    move-object v2, v7

    .line 336
    :goto_6
    if-nez v2, :cond_b

    .line 337
    .line 338
    goto :goto_8

    .line 339
    :cond_b
    move-object v4, v2

    .line 340
    :cond_c
    invoke-static {p1}, Ldefpackage/ur1;->b(Lcom/eddyizm/tempus/subsonic/models/Child;)Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    if-eqz v0, :cond_d

    .line 345
    .line 346
    move v0, v5

    .line 347
    goto :goto_7

    .line 348
    :cond_d
    const/16 v0, 0x8

    .line 349
    .line 350
    :goto_7
    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 351
    .line 352
    .line 353
    new-instance v0, Ldefpackage/tr1;

    .line 354
    .line 355
    invoke-direct {v0, p1, v5}, Ldefpackage/tr1;-><init>(Lcom/eddyizm/tempus/subsonic/models/Child;I)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 359
    .line 360
    .line 361
    :goto_8
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->p0:Landroid/widget/ToggleButton;

    .line 362
    .line 363
    new-instance v1, Ldefpackage/i8;

    .line 364
    .line 365
    const/4 v2, 0x4

    .line 366
    invoke-direct {v1, v2, p0, p1}, Ldefpackage/i8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->s0:Landroid/widget/RatingBar;

    .line 377
    .line 378
    if-eqz v0, :cond_e

    .line 379
    .line 380
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 381
    .line 382
    .line 383
    move-result v0

    .line 384
    int-to-float v0, v0

    .line 385
    invoke-virtual {v1, v0}, Landroid/widget/RatingBar;->setRating(F)V

    .line 386
    .line 387
    .line 388
    goto :goto_9

    .line 389
    :cond_e
    const/4 v0, 0x0

    .line 390
    invoke-virtual {v1, v0}, Landroid/widget/RatingBar;->setRating(F)V

    .line 391
    .line 392
    .line 393
    :goto_9
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->s0:Landroid/widget/RatingBar;

    .line 394
    .line 395
    new-instance v1, Ldefpackage/ak3;

    .line 396
    .line 397
    invoke-direct {v1, p0, p1}, Ldefpackage/ak3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v0, v1}, Landroid/widget/RatingBar;->setOnRatingBarChangeListener(Landroid/widget/RatingBar$OnRatingBarChangeListener;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {p0}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    if-eqz v0, :cond_f

    .line 408
    .line 409
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->L0:Ldefpackage/aj3;

    .line 410
    .line 411
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 412
    .line 413
    .line 414
    move-result-object p0

    .line 415
    invoke-virtual {v0, p0, p1}, Ldefpackage/aj3;->f(Ldefpackage/ba2;Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 416
    .line 417
    .line 418
    :cond_f
    :goto_a
    return-void

    .line 419
    :pswitch_3
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 420
    .line 421
    if-eqz p1, :cond_11

    .line 422
    .line 423
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->t0:Landroid/widget/TextView;

    .line 424
    .line 425
    new-instance v2, Ldefpackage/j8;

    .line 426
    .line 427
    const/16 v3, 0x12

    .line 428
    .line 429
    invoke-direct {v2, v3, p0, p1}, Ldefpackage/j8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 433
    .line 434
    .line 435
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->t0:Landroid/widget/TextView;

    .line 436
    .line 437
    if-nez p1, :cond_10

    .line 438
    .line 439
    goto :goto_b

    .line 440
    :cond_10
    new-instance v0, Ldefpackage/i8;

    .line 441
    .line 442
    invoke-direct {v0, v1, p0, p1}, Ldefpackage/i8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 446
    .line 447
    .line 448
    :cond_11
    :goto_b
    return-void

    .line 449
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
