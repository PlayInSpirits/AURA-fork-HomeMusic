.class public final Li4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Li4;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Li4;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Li4;->n:I

    .line 6
    .line 7
    const-string v4, "Ignoring attempt to update routes for a non-available connected route: "

    .line 8
    .line 9
    const-string v5, "AxMediaRouter"

    .line 10
    .line 11
    const-string v6, "There is no currently selected dynamic group route."

    .line 12
    .line 13
    const-string v7, "route must not be null"

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x2

    .line 17
    const/4 v10, 0x0

    .line 18
    const/4 v11, 0x1

    .line 19
    iget-object v12, v0, Li4;->o:Ljava/lang/Object;

    .line 20
    .line 21
    packed-switch v2, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    check-cast v12, Landroidx/appcompat/widget/Toolbar;

    .line 25
    .line 26
    iget-object v0, v12, Landroidx/appcompat/widget/Toolbar;->c0:Lyu4;

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v8, v0, Lyu4;->o:Ltu2;

    .line 32
    .line 33
    :goto_0
    if-eqz v8, :cond_1

    .line 34
    .line 35
    invoke-virtual {v8}, Ltu2;->collapseActionView()Z

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void

    .line 39
    :pswitch_0
    check-cast v12, Landroidx/preference/Preference;

    .line 40
    .line 41
    invoke-virtual {v12, v1}, Landroidx/preference/Preference;->s(Landroid/view/View;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_1
    move-object v0, v1

    .line 46
    check-cast v0, Lcom/google/android/material/internal/NavigationMenuItemView;

    .line 47
    .line 48
    check-cast v12, Ll43;

    .line 49
    .line 50
    iget-object v1, v12, Ll43;->r:Ld43;

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    iput-boolean v11, v1, Ld43;->s:Z

    .line 55
    .line 56
    :cond_2
    invoke-virtual {v0}, Lcom/google/android/material/internal/NavigationMenuItemView;->getItemData()Ltu2;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object v1, v12, Ll43;->p:Lqu2;

    .line 61
    .line 62
    invoke-virtual {v1, v0, v12, v10}, Lqu2;->q(Landroid/view/MenuItem;Lgv2;I)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    invoke-virtual {v0}, Ltu2;->isCheckable()Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_3

    .line 73
    .line 74
    if-eqz v1, :cond_3

    .line 75
    .line 76
    iget-object v1, v12, Ll43;->r:Ld43;

    .line 77
    .line 78
    invoke-virtual {v1, v0}, Ld43;->q(Ltu2;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    move v11, v10

    .line 83
    :goto_1
    iget-object v0, v12, Ll43;->r:Ld43;

    .line 84
    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    iput-boolean v10, v0, Ld43;->s:Z

    .line 88
    .line 89
    :cond_4
    if-eqz v11, :cond_5

    .line 90
    .line 91
    invoke-virtual {v12, v10}, Ll43;->c(Z)V

    .line 92
    .line 93
    .line 94
    :cond_5
    return-void

    .line 95
    :pswitch_2
    move-object v0, v1

    .line 96
    check-cast v0, Lk33;

    .line 97
    .line 98
    invoke-virtual {v0}, Lk33;->getItemData()Ltu2;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    check-cast v12, Lqt;

    .line 103
    .line 104
    iget-object v1, v12, Lm33;->R:Lqu2;

    .line 105
    .line 106
    iget-object v2, v12, Lm33;->Q:Lo33;

    .line 107
    .line 108
    invoke-virtual {v1, v0, v2, v10}, Lqu2;->q(Landroid/view/MenuItem;Lgv2;I)Z

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    if-nez v1, :cond_6

    .line 113
    .line 114
    invoke-virtual {v0, v11}, Ltu2;->setChecked(Z)Landroid/view/MenuItem;

    .line 115
    .line 116
    .line 117
    :cond_6
    return-void

    .line 118
    :pswitch_3
    check-cast v12, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;

    .line 119
    .line 120
    iget-object v0, v12, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->r:Landroid/graphics/drawable/AnimationDrawable;

    .line 121
    .line 122
    iget-object v2, v12, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->q:Landroid/graphics/drawable/AnimationDrawable;

    .line 123
    .line 124
    iget-boolean v3, v12, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->u:Z

    .line 125
    .line 126
    xor-int/lit8 v4, v3, 0x1

    .line 127
    .line 128
    iput-boolean v4, v12, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->u:Z

    .line 129
    .line 130
    if-nez v3, :cond_7

    .line 131
    .line 132
    invoke-virtual {v12, v2}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 136
    .line 137
    .line 138
    iget-object v0, v12, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->t:Ljava/lang/String;

    .line 139
    .line 140
    invoke-virtual {v12, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_7
    invoke-virtual {v12, v0}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 148
    .line 149
    .line 150
    iget-object v0, v12, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->s:Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v12, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 153
    .line 154
    .line 155
    :goto_2
    iget-object v0, v12, Landroidx/mediarouter/app/MediaRouteExpandCollapseButton;->v:Landroid/view/View$OnClickListener;

    .line 156
    .line 157
    if-eqz v0, :cond_8

    .line 158
    .line 159
    invoke-interface {v0, v1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 160
    .line 161
    .line 162
    :cond_8
    return-void

    .line 163
    :pswitch_4
    check-cast v12, Liq2;

    .line 164
    .line 165
    iget-object v0, v12, Ldq2;->u:Lwq2;

    .line 166
    .line 167
    invoke-virtual {v12, v0}, Liq2;->u(Lwq2;)Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    xor-int/lit8 v1, v0, 0x1

    .line 172
    .line 173
    iget-object v2, v12, Ldq2;->u:Lwq2;

    .line 174
    .line 175
    invoke-virtual {v2}, Lwq2;->e()Z

    .line 176
    .line 177
    .line 178
    move-result v2

    .line 179
    iget-object v8, v12, Liq2;->H:Ljq2;

    .line 180
    .line 181
    if-nez v0, :cond_10

    .line 182
    .line 183
    iget-object v4, v8, Ljq2;->z:Llq2;

    .line 184
    .line 185
    iget-object v4, v4, Llq2;->t:Lyq2;

    .line 186
    .line 187
    iget-object v13, v12, Ldq2;->u:Lwq2;

    .line 188
    .line 189
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    if-eqz v13, :cond_f

    .line 193
    .line 194
    invoke-static {}, Lyq2;->b()V

    .line 195
    .line 196
    .line 197
    invoke-static {}, Lyq2;->c()Lui1;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    iget-object v7, v4, Lui1;->c:Lwq2;

    .line 202
    .line 203
    invoke-virtual {v7}, Lwq2;->a()Ltq2;

    .line 204
    .line 205
    .line 206
    move-result-object v7

    .line 207
    if-nez v7, :cond_9

    .line 208
    .line 209
    const-string v4, "Ignoring attempt to add a member route to a selected non-group route"

    .line 210
    .line 211
    invoke-static {v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 212
    .line 213
    .line 214
    goto/16 :goto_3

    .line 215
    .line 216
    :cond_9
    invoke-virtual {v7, v13}, Ltq2;->n(Lwq2;)Z

    .line 217
    .line 218
    .line 219
    move-result v14

    .line 220
    if-nez v14, :cond_a

    .line 221
    .line 222
    new-instance v4, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    const-string v6, "Ignoring attempt to add a non-groupable member route: "

    .line 225
    .line 226
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    invoke-static {v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 237
    .line 238
    .line 239
    goto/16 :goto_3

    .line 240
    .line 241
    :cond_a
    iget-object v14, v7, Lwq2;->v:Ljava/util/ArrayList;

    .line 242
    .line 243
    invoke-static {v14}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 244
    .line 245
    .line 246
    move-result-object v14

    .line 247
    invoke-interface {v14, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v14

    .line 251
    if-eqz v14, :cond_b

    .line 252
    .line 253
    new-instance v4, Ljava/lang/StringBuilder;

    .line 254
    .line 255
    const-string v6, "Ignoring attempt to add an existing member route: "

    .line 256
    .line 257
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v4

    .line 267
    invoke-static {v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 268
    .line 269
    .line 270
    goto/16 :goto_3

    .line 271
    .line 272
    :cond_b
    invoke-virtual {v7}, Lwq2;->g()Z

    .line 273
    .line 274
    .line 275
    move-result v14

    .line 276
    if-eqz v14, :cond_d

    .line 277
    .line 278
    iget-object v4, v4, Lui1;->d:Loq2;

    .line 279
    .line 280
    instance-of v5, v4, Lnq2;

    .line 281
    .line 282
    if-eqz v5, :cond_c

    .line 283
    .line 284
    check-cast v4, Lnq2;

    .line 285
    .line 286
    iget-object v5, v13, Lwq2;->b:Ljava/lang/String;

    .line 287
    .line 288
    invoke-virtual {v4, v5}, Lnq2;->m(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    goto/16 :goto_3

    .line 292
    .line 293
    :cond_c
    invoke-static {v6}, Lkf2;->o(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    goto/16 :goto_a

    .line 297
    .line 298
    :cond_d
    invoke-virtual {v7}, Ltq2;->m()Z

    .line 299
    .line 300
    .line 301
    move-result v6

    .line 302
    if-eqz v6, :cond_e

    .line 303
    .line 304
    invoke-virtual {v4}, Lui1;->e()V

    .line 305
    .line 306
    .line 307
    new-instance v4, Ljava/lang/StringBuilder;

    .line 308
    .line 309
    const-string v6, "Ignoring attempt to add a route to a non-available connected route: "

    .line 310
    .line 311
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v4

    .line 321
    invoke-static {v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 322
    .line 323
    .line 324
    goto/16 :goto_3

    .line 325
    .line 326
    :cond_e
    new-instance v4, Ljava/lang/StringBuilder;

    .line 327
    .line 328
    const-string v6, "Ignoring attempt to add a route to an unsupported group route:"

    .line 329
    .line 330
    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v4

    .line 340
    invoke-static {v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 341
    .line 342
    .line 343
    goto/16 :goto_3

    .line 344
    .line 345
    :cond_f
    invoke-static {v7}, Lnz2;->n(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    goto/16 :goto_a

    .line 349
    .line 350
    :cond_10
    iget-object v13, v8, Ljq2;->z:Llq2;

    .line 351
    .line 352
    iget-object v13, v13, Llq2;->t:Lyq2;

    .line 353
    .line 354
    iget-object v14, v12, Ldq2;->u:Lwq2;

    .line 355
    .line 356
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 357
    .line 358
    .line 359
    if-eqz v14, :cond_22

    .line 360
    .line 361
    invoke-static {}, Lyq2;->b()V

    .line 362
    .line 363
    .line 364
    invoke-static {}, Lyq2;->c()Lui1;

    .line 365
    .line 366
    .line 367
    move-result-object v7

    .line 368
    iget-object v13, v7, Lui1;->c:Lwq2;

    .line 369
    .line 370
    invoke-virtual {v13}, Lwq2;->a()Ltq2;

    .line 371
    .line 372
    .line 373
    move-result-object v13

    .line 374
    if-nez v13, :cond_11

    .line 375
    .line 376
    const-string v4, "Ignoring attempt to remove a member route from a selected non-group route"

    .line 377
    .line 378
    invoke-static {v5, v4}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 379
    .line 380
    .line 381
    goto/16 :goto_3

    .line 382
    .line 383
    :cond_11
    iget-object v15, v13, Ltq2;->x:Loi;

    .line 384
    .line 385
    iget-object v3, v14, Lwq2;->c:Ljava/lang/String;

    .line 386
    .line 387
    invoke-virtual {v15, v3}, Lyd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v3

    .line 391
    check-cast v3, Lmq2;

    .line 392
    .line 393
    if-eqz v3, :cond_17

    .line 394
    .line 395
    iget-boolean v3, v3, Lmq2;->c:Z

    .line 396
    .line 397
    if-eqz v3, :cond_17

    .line 398
    .line 399
    iget-object v3, v13, Lwq2;->v:Ljava/util/ArrayList;

    .line 400
    .line 401
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    invoke-interface {v3, v14}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    move-result v3

    .line 409
    if-nez v3, :cond_12

    .line 410
    .line 411
    new-instance v3, Ljava/lang/StringBuilder;

    .line 412
    .line 413
    const-string v4, "Ignoring attempt to remove a non-in-group member route: "

    .line 414
    .line 415
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v3

    .line 425
    invoke-static {v5, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 426
    .line 427
    .line 428
    goto :goto_3

    .line 429
    :cond_12
    iget-object v3, v13, Lwq2;->v:Ljava/util/ArrayList;

    .line 430
    .line 431
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 432
    .line 433
    .line 434
    move-result-object v3

    .line 435
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 436
    .line 437
    .line 438
    move-result v3

    .line 439
    if-gt v3, v11, :cond_13

    .line 440
    .line 441
    const-string v3, "Ignoring attempt to remove the last member route."

    .line 442
    .line 443
    invoke-static {v5, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 444
    .line 445
    .line 446
    goto :goto_3

    .line 447
    :cond_13
    invoke-virtual {v13}, Lwq2;->g()Z

    .line 448
    .line 449
    .line 450
    move-result v3

    .line 451
    if-eqz v3, :cond_15

    .line 452
    .line 453
    iget-object v3, v7, Lui1;->d:Loq2;

    .line 454
    .line 455
    instance-of v4, v3, Lnq2;

    .line 456
    .line 457
    if-eqz v4, :cond_14

    .line 458
    .line 459
    check-cast v3, Lnq2;

    .line 460
    .line 461
    iget-object v4, v14, Lwq2;->b:Ljava/lang/String;

    .line 462
    .line 463
    invoke-virtual {v3, v4}, Lnq2;->n(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    goto :goto_3

    .line 467
    :cond_14
    invoke-static {v6}, Lkf2;->o(Ljava/lang/String;)V

    .line 468
    .line 469
    .line 470
    goto/16 :goto_a

    .line 471
    .line 472
    :cond_15
    invoke-virtual {v13}, Ltq2;->m()Z

    .line 473
    .line 474
    .line 475
    move-result v3

    .line 476
    if-eqz v3, :cond_16

    .line 477
    .line 478
    invoke-virtual {v7}, Lui1;->e()V

    .line 479
    .line 480
    .line 481
    new-instance v3, Ljava/lang/StringBuilder;

    .line 482
    .line 483
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v3

    .line 493
    invoke-static {v5, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 494
    .line 495
    .line 496
    goto :goto_3

    .line 497
    :cond_16
    new-instance v3, Ljava/lang/StringBuilder;

    .line 498
    .line 499
    const-string v4, "Ignoring attempt to remove a route from an unsupported group route:"

    .line 500
    .line 501
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v3

    .line 511
    invoke-static {v5, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 512
    .line 513
    .line 514
    goto :goto_3

    .line 515
    :cond_17
    new-instance v3, Ljava/lang/StringBuilder;

    .line 516
    .line 517
    const-string v4, "Ignoring attempt to remove a non-unselectable member route: "

    .line 518
    .line 519
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v3

    .line 529
    invoke-static {v5, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 530
    .line 531
    .line 532
    :goto_3
    xor-int/lit8 v3, v2, 0x1

    .line 533
    .line 534
    invoke-virtual {v12, v1, v3}, Liq2;->v(ZZ)V

    .line 535
    .line 536
    .line 537
    if-eqz v2, :cond_19

    .line 538
    .line 539
    iget-object v2, v8, Ljq2;->z:Llq2;

    .line 540
    .line 541
    iget-object v2, v2, Llq2;->w:Lwq2;

    .line 542
    .line 543
    iget-object v2, v2, Lwq2;->v:Ljava/util/ArrayList;

    .line 544
    .line 545
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 546
    .line 547
    .line 548
    move-result-object v2

    .line 549
    iget-object v3, v12, Ldq2;->u:Lwq2;

    .line 550
    .line 551
    iget-object v3, v3, Lwq2;->v:Ljava/util/ArrayList;

    .line 552
    .line 553
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 554
    .line 555
    .line 556
    move-result-object v3

    .line 557
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 558
    .line 559
    .line 560
    move-result-object v3

    .line 561
    :cond_18
    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 562
    .line 563
    .line 564
    move-result v4

    .line 565
    if-eqz v4, :cond_19

    .line 566
    .line 567
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v4

    .line 571
    check-cast v4, Lwq2;

    .line 572
    .line 573
    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 574
    .line 575
    .line 576
    move-result v5

    .line 577
    if-eq v5, v1, :cond_18

    .line 578
    .line 579
    iget-object v5, v8, Ljq2;->z:Llq2;

    .line 580
    .line 581
    iget-object v5, v5, Llq2;->J:Ljava/util/HashMap;

    .line 582
    .line 583
    iget-object v4, v4, Lwq2;->c:Ljava/lang/String;

    .line 584
    .line 585
    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v4

    .line 589
    check-cast v4, Ldq2;

    .line 590
    .line 591
    instance-of v5, v4, Liq2;

    .line 592
    .line 593
    if-eqz v5, :cond_18

    .line 594
    .line 595
    check-cast v4, Liq2;

    .line 596
    .line 597
    invoke-virtual {v4, v1, v11}, Liq2;->v(ZZ)V

    .line 598
    .line 599
    .line 600
    goto :goto_4

    .line 601
    :cond_19
    iget-object v2, v8, Ljq2;->z:Llq2;

    .line 602
    .line 603
    iget-object v3, v12, Ldq2;->u:Lwq2;

    .line 604
    .line 605
    iget-object v4, v2, Llq2;->w:Lwq2;

    .line 606
    .line 607
    iget-object v4, v4, Lwq2;->v:Ljava/util/ArrayList;

    .line 608
    .line 609
    invoke-static {v4}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 610
    .line 611
    .line 612
    move-result-object v4

    .line 613
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 614
    .line 615
    .line 616
    move-result v5

    .line 617
    invoke-static {v11, v5}, Ljava/lang/Math;->max(II)I

    .line 618
    .line 619
    .line 620
    move-result v5

    .line 621
    invoke-virtual {v3}, Lwq2;->e()Z

    .line 622
    .line 623
    .line 624
    move-result v6

    .line 625
    if-eqz v6, :cond_1c

    .line 626
    .line 627
    iget-object v3, v3, Lwq2;->v:Ljava/util/ArrayList;

    .line 628
    .line 629
    invoke-static {v3}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 630
    .line 631
    .line 632
    move-result-object v3

    .line 633
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 634
    .line 635
    .line 636
    move-result-object v3

    .line 637
    :cond_1a
    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 638
    .line 639
    .line 640
    move-result v6

    .line 641
    if-eqz v6, :cond_1e

    .line 642
    .line 643
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v6

    .line 647
    check-cast v6, Lwq2;

    .line 648
    .line 649
    invoke-interface {v4, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 650
    .line 651
    .line 652
    move-result v6

    .line 653
    if-eq v6, v1, :cond_1a

    .line 654
    .line 655
    if-nez v0, :cond_1b

    .line 656
    .line 657
    move v6, v11

    .line 658
    goto :goto_6

    .line 659
    :cond_1b
    const/4 v6, -0x1

    .line 660
    :goto_6
    add-int/2addr v5, v6

    .line 661
    goto :goto_5

    .line 662
    :cond_1c
    if-nez v0, :cond_1d

    .line 663
    .line 664
    move v3, v11

    .line 665
    goto :goto_7

    .line 666
    :cond_1d
    const/4 v3, -0x1

    .line 667
    :goto_7
    add-int/2addr v5, v3

    .line 668
    :cond_1e
    iget-boolean v0, v2, Llq2;->f0:Z

    .line 669
    .line 670
    if-eqz v0, :cond_1f

    .line 671
    .line 672
    iget-object v0, v2, Llq2;->w:Lwq2;

    .line 673
    .line 674
    iget-object v0, v0, Lwq2;->v:Ljava/util/ArrayList;

    .line 675
    .line 676
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 681
    .line 682
    .line 683
    move-result v0

    .line 684
    if-le v0, v11, :cond_1f

    .line 685
    .line 686
    move v0, v11

    .line 687
    goto :goto_8

    .line 688
    :cond_1f
    move v0, v10

    .line 689
    :goto_8
    iget-boolean v1, v2, Llq2;->f0:Z

    .line 690
    .line 691
    if-eqz v1, :cond_20

    .line 692
    .line 693
    if-lt v5, v9, :cond_20

    .line 694
    .line 695
    goto :goto_9

    .line 696
    :cond_20
    move v11, v10

    .line 697
    :goto_9
    if-eq v0, v11, :cond_23

    .line 698
    .line 699
    iget-object v0, v2, Llq2;->G:Landroidx/recyclerview/widget/RecyclerView;

    .line 700
    .line 701
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Lcx3;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    instance-of v1, v0, Lfq2;

    .line 706
    .line 707
    if-eqz v1, :cond_23

    .line 708
    .line 709
    check-cast v0, Lfq2;

    .line 710
    .line 711
    iget-object v1, v0, Lcx3;->a:Landroid/view/View;

    .line 712
    .line 713
    if-eqz v11, :cond_21

    .line 714
    .line 715
    iget v10, v0, Lfq2;->z:I

    .line 716
    .line 717
    :cond_21
    invoke-virtual {v8, v1, v10}, Ljq2;->p(Landroid/view/View;I)V

    .line 718
    .line 719
    .line 720
    goto :goto_a

    .line 721
    :cond_22
    invoke-static {v7}, Lnz2;->n(Ljava/lang/String;)V

    .line 722
    .line 723
    .line 724
    :cond_23
    :goto_a
    return-void

    .line 725
    :pswitch_5
    check-cast v12, Leq2;

    .line 726
    .line 727
    iget-object v0, v12, Leq2;->A:Ljq2;

    .line 728
    .line 729
    iget-object v0, v0, Ljq2;->z:Llq2;

    .line 730
    .line 731
    iget-object v0, v0, Llq2;->t:Lyq2;

    .line 732
    .line 733
    iget-object v1, v12, Leq2;->z:Lwq2;

    .line 734
    .line 735
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 736
    .line 737
    .line 738
    if-eqz v1, :cond_2b

    .line 739
    .line 740
    invoke-static {}, Lyq2;->b()V

    .line 741
    .line 742
    .line 743
    invoke-static {}, Lyq2;->c()Lui1;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    iget-object v2, v0, Lui1;->c:Lwq2;

    .line 748
    .line 749
    invoke-virtual {v2}, Lwq2;->a()Ltq2;

    .line 750
    .line 751
    .line 752
    move-result-object v2

    .line 753
    if-nez v2, :cond_24

    .line 754
    .line 755
    const-string v0, "Ignoring attempt to transfer for a selected non-group route"

    .line 756
    .line 757
    invoke-static {v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 758
    .line 759
    .line 760
    goto/16 :goto_c

    .line 761
    .line 762
    :cond_24
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 763
    .line 764
    .line 765
    move-result-object v1

    .line 766
    new-instance v3, Ljava/util/ArrayList;

    .line 767
    .line 768
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 769
    .line 770
    .line 771
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 772
    .line 773
    .line 774
    move-result-object v1

    .line 775
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 776
    .line 777
    .line 778
    move-result v7

    .line 779
    if-eqz v7, :cond_26

    .line 780
    .line 781
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    move-result-object v7

    .line 785
    check-cast v7, Lwq2;

    .line 786
    .line 787
    iget-object v8, v2, Ltq2;->x:Loi;

    .line 788
    .line 789
    iget-object v9, v7, Lwq2;->c:Ljava/lang/String;

    .line 790
    .line 791
    invoke-virtual {v8, v9}, Lyd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v8

    .line 795
    check-cast v8, Lmq2;

    .line 796
    .line 797
    if-eqz v8, :cond_25

    .line 798
    .line 799
    iget-boolean v8, v8, Lmq2;->e:Z

    .line 800
    .line 801
    if-eqz v8, :cond_25

    .line 802
    .line 803
    iget-object v7, v7, Lwq2;->b:Ljava/lang/String;

    .line 804
    .line 805
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 806
    .line 807
    .line 808
    goto :goto_b

    .line 809
    :cond_25
    new-instance v8, Ljava/lang/StringBuilder;

    .line 810
    .line 811
    const-string v9, "Ignoring attempt to update the group with a non-transferable route: "

    .line 812
    .line 813
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 814
    .line 815
    .line 816
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 817
    .line 818
    .line 819
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 820
    .line 821
    .line 822
    move-result-object v7

    .line 823
    invoke-static {v5, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 824
    .line 825
    .line 826
    goto :goto_b

    .line 827
    :cond_26
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 828
    .line 829
    .line 830
    move-result v1

    .line 831
    if-eqz v1, :cond_27

    .line 832
    .line 833
    const-string v0, "Ignoring attempt to update the group with non-transferable routes"

    .line 834
    .line 835
    invoke-static {v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 836
    .line 837
    .line 838
    goto :goto_c

    .line 839
    :cond_27
    invoke-virtual {v2}, Lwq2;->g()Z

    .line 840
    .line 841
    .line 842
    move-result v1

    .line 843
    if-eqz v1, :cond_29

    .line 844
    .line 845
    iget-object v0, v0, Lui1;->d:Loq2;

    .line 846
    .line 847
    instance-of v1, v0, Lnq2;

    .line 848
    .line 849
    if-eqz v1, :cond_28

    .line 850
    .line 851
    check-cast v0, Lnq2;

    .line 852
    .line 853
    invoke-virtual {v0, v3}, Lnq2;->o(Ljava/util/ArrayList;)V

    .line 854
    .line 855
    .line 856
    goto :goto_c

    .line 857
    :cond_28
    invoke-static {v6}, Lkf2;->o(Ljava/lang/String;)V

    .line 858
    .line 859
    .line 860
    goto :goto_d

    .line 861
    :cond_29
    invoke-virtual {v2}, Ltq2;->m()Z

    .line 862
    .line 863
    .line 864
    move-result v1

    .line 865
    if-eqz v1, :cond_2a

    .line 866
    .line 867
    invoke-virtual {v0}, Lui1;->e()V

    .line 868
    .line 869
    .line 870
    new-instance v0, Ljava/lang/StringBuilder;

    .line 871
    .line 872
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 873
    .line 874
    .line 875
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 876
    .line 877
    .line 878
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 879
    .line 880
    .line 881
    move-result-object v0

    .line 882
    invoke-static {v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 883
    .line 884
    .line 885
    goto :goto_c

    .line 886
    :cond_2a
    new-instance v0, Ljava/lang/StringBuilder;

    .line 887
    .line 888
    const-string v1, "Ignoring attempt to update routes for an unsupported group route:"

    .line 889
    .line 890
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 891
    .line 892
    .line 893
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 894
    .line 895
    .line 896
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    move-result-object v0

    .line 900
    invoke-static {v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 901
    .line 902
    .line 903
    :goto_c
    iget-object v0, v12, Leq2;->v:Landroid/widget/ImageView;

    .line 904
    .line 905
    const/4 v1, 0x4

    .line 906
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 907
    .line 908
    .line 909
    iget-object v0, v12, Leq2;->w:Landroid/widget/ProgressBar;

    .line 910
    .line 911
    invoke-virtual {v0, v10}, Landroid/view/View;->setVisibility(I)V

    .line 912
    .line 913
    .line 914
    goto :goto_d

    .line 915
    :cond_2b
    invoke-static {v7}, Lnz2;->n(Ljava/lang/String;)V

    .line 916
    .line 917
    .line 918
    :goto_d
    return-void

    .line 919
    :pswitch_6
    check-cast v12, Ldq2;

    .line 920
    .line 921
    iget-object v0, v12, Ldq2;->x:Llq2;

    .line 922
    .line 923
    iget-object v2, v0, Llq2;->K:Lwq2;

    .line 924
    .line 925
    if-eqz v2, :cond_2c

    .line 926
    .line 927
    iget-object v2, v0, Llq2;->F:Lzk;

    .line 928
    .line 929
    invoke-virtual {v2, v9}, Landroid/os/Handler;->removeMessages(I)V

    .line 930
    .line 931
    .line 932
    :cond_2c
    iget-object v2, v12, Ldq2;->u:Lwq2;

    .line 933
    .line 934
    iput-object v2, v0, Llq2;->K:Lwq2;

    .line 935
    .line 936
    invoke-virtual {v1}, Landroid/view/View;->isActivated()Z

    .line 937
    .line 938
    .line 939
    move-result v1

    .line 940
    xor-int/lit8 v2, v1, 0x1

    .line 941
    .line 942
    if-nez v1, :cond_2d

    .line 943
    .line 944
    goto :goto_e

    .line 945
    :cond_2d
    iget-object v1, v0, Llq2;->L:Ljava/util/HashMap;

    .line 946
    .line 947
    iget-object v3, v12, Ldq2;->u:Lwq2;

    .line 948
    .line 949
    iget-object v3, v3, Lwq2;->c:Ljava/lang/String;

    .line 950
    .line 951
    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 952
    .line 953
    .line 954
    move-result-object v1

    .line 955
    check-cast v1, Ljava/lang/Integer;

    .line 956
    .line 957
    if-nez v1, :cond_2e

    .line 958
    .line 959
    move v10, v11

    .line 960
    goto :goto_e

    .line 961
    :cond_2e
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 962
    .line 963
    .line 964
    move-result v1

    .line 965
    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    .line 966
    .line 967
    .line 968
    move-result v1

    .line 969
    move v10, v1

    .line 970
    :goto_e
    invoke-virtual {v12, v2}, Ldq2;->t(Z)V

    .line 971
    .line 972
    .line 973
    iget-object v1, v12, Ldq2;->w:Landroidx/mediarouter/app/MediaRouteVolumeSlider;

    .line 974
    .line 975
    invoke-virtual {v1, v10}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 976
    .line 977
    .line 978
    iget-object v1, v12, Ldq2;->u:Lwq2;

    .line 979
    .line 980
    invoke-virtual {v1, v10}, Lwq2;->j(I)V

    .line 981
    .line 982
    .line 983
    iget-object v0, v0, Llq2;->F:Lzk;

    .line 984
    .line 985
    const-wide/16 v1, 0x1f4

    .line 986
    .line 987
    invoke-virtual {v0, v9, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 988
    .line 989
    .line 990
    return-void

    .line 991
    :pswitch_7
    check-cast v12, Laq2;

    .line 992
    .line 993
    invoke-virtual {v12}, Ldg;->dismiss()V

    .line 994
    .line 995
    .line 996
    return-void

    .line 997
    :pswitch_8
    check-cast v12, Lnh2;

    .line 998
    .line 999
    iget v0, v12, Lnh2;->q0:I

    .line 1000
    .line 1001
    if-ne v0, v9, :cond_2f

    .line 1002
    .line 1003
    invoke-virtual {v12, v11}, Lnh2;->j0(I)V

    .line 1004
    .line 1005
    .line 1006
    goto :goto_f

    .line 1007
    :cond_2f
    if-ne v0, v11, :cond_30

    .line 1008
    .line 1009
    invoke-virtual {v12, v9}, Lnh2;->j0(I)V

    .line 1010
    .line 1011
    .line 1012
    :cond_30
    :goto_f
    return-void

    .line 1013
    :pswitch_9
    check-cast v12, Lcp1;

    .line 1014
    .line 1015
    iget-object v1, v12, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 1016
    .line 1017
    iget-object v1, v1, Lcom/eddyizm/tempus/viewmodel/b;->c:Lxi4;

    .line 1018
    .line 1019
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1020
    .line 1021
    .line 1022
    const/4 v1, -0x1

    .line 1023
    invoke-static {v1, v10, v10}, Lxi4;->s(IZZ)Lk03;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v1

    .line 1027
    invoke-virtual {v12}, Lkc1;->v()Lle1;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v2

    .line 1031
    new-instance v3, Lnp0;

    .line 1032
    .line 1033
    invoke-direct {v3, v11, v0}, Lnp0;-><init>(ILjava/lang/Object;)V

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v1, v2, v3}, Lad2;->e(Lba2;La83;)V

    .line 1037
    .line 1038
    .line 1039
    return-void

    .line 1040
    :pswitch_a
    check-cast v12, Lyt;

    .line 1041
    .line 1042
    iget-boolean v0, v12, Lyt;->x:Z

    .line 1043
    .line 1044
    if-eqz v0, :cond_32

    .line 1045
    .line 1046
    invoke-virtual {v12}, Landroid/app/Dialog;->isShowing()Z

    .line 1047
    .line 1048
    .line 1049
    move-result v0

    .line 1050
    if-eqz v0, :cond_32

    .line 1051
    .line 1052
    iget-boolean v0, v12, Lyt;->z:Z

    .line 1053
    .line 1054
    if-nez v0, :cond_31

    .line 1055
    .line 1056
    invoke-virtual {v12}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v0

    .line 1060
    const v1, 0x101035b

    .line 1061
    .line 1062
    .line 1063
    filled-new-array {v1}, [I

    .line 1064
    .line 1065
    .line 1066
    move-result-object v1

    .line 1067
    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 1068
    .line 1069
    .line 1070
    move-result-object v0

    .line 1071
    invoke-virtual {v0, v10, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 1072
    .line 1073
    .line 1074
    move-result v1

    .line 1075
    iput-boolean v1, v12, Lyt;->y:Z

    .line 1076
    .line 1077
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 1078
    .line 1079
    .line 1080
    iput-boolean v11, v12, Lyt;->z:Z

    .line 1081
    .line 1082
    :cond_31
    iget-boolean v0, v12, Lyt;->y:Z

    .line 1083
    .line 1084
    if-eqz v0, :cond_32

    .line 1085
    .line 1086
    invoke-virtual {v12}, Lyt;->cancel()V

    .line 1087
    .line 1088
    .line 1089
    :cond_32
    return-void

    .line 1090
    :pswitch_b
    check-cast v12, Ld9;

    .line 1091
    .line 1092
    iget-object v0, v12, Ld9;->i:Landroid/widget/Button;

    .line 1093
    .line 1094
    if-ne v1, v0, :cond_33

    .line 1095
    .line 1096
    iget-object v0, v12, Ld9;->k:Landroid/os/Message;

    .line 1097
    .line 1098
    if-eqz v0, :cond_33

    .line 1099
    .line 1100
    invoke-static {v0}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v8

    .line 1104
    goto :goto_10

    .line 1105
    :cond_33
    iget-object v0, v12, Ld9;->l:Landroid/widget/Button;

    .line 1106
    .line 1107
    if-ne v1, v0, :cond_34

    .line 1108
    .line 1109
    iget-object v0, v12, Ld9;->n:Landroid/os/Message;

    .line 1110
    .line 1111
    if-eqz v0, :cond_34

    .line 1112
    .line 1113
    invoke-static {v0}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v8

    .line 1117
    goto :goto_10

    .line 1118
    :cond_34
    iget-object v0, v12, Ld9;->o:Landroid/widget/Button;

    .line 1119
    .line 1120
    if-ne v1, v0, :cond_35

    .line 1121
    .line 1122
    iget-object v0, v12, Ld9;->q:Landroid/os/Message;

    .line 1123
    .line 1124
    if-eqz v0, :cond_35

    .line 1125
    .line 1126
    invoke-static {v0}, Landroid/os/Message;->obtain(Landroid/os/Message;)Landroid/os/Message;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v8

    .line 1130
    :cond_35
    :goto_10
    if-eqz v8, :cond_36

    .line 1131
    .line 1132
    invoke-virtual {v8}, Landroid/os/Message;->sendToTarget()V

    .line 1133
    .line 1134
    .line 1135
    :cond_36
    iget-object v0, v12, Ld9;->F:Lb9;

    .line 1136
    .line 1137
    iget-object v1, v12, Ld9;->b:Lf9;

    .line 1138
    .line 1139
    invoke-virtual {v0, v11, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v0

    .line 1143
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 1144
    .line 1145
    .line 1146
    return-void

    .line 1147
    :pswitch_c
    check-cast v12, Lk4;

    .line 1148
    .line 1149
    iget-object v0, v12, Lk4;->b:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 1150
    .line 1151
    const v1, 0x800003

    .line 1152
    .line 1153
    .line 1154
    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->h(I)I

    .line 1155
    .line 1156
    .line 1157
    move-result v2

    .line 1158
    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->f(I)Landroid/view/View;

    .line 1159
    .line 1160
    .line 1161
    move-result-object v1

    .line 1162
    if-eqz v1, :cond_37

    .line 1163
    .line 1164
    invoke-static {v1}, Landroidx/drawerlayout/widget/DrawerLayout;->o(Landroid/view/View;)Z

    .line 1165
    .line 1166
    .line 1167
    move-result v10

    .line 1168
    :cond_37
    if-eqz v10, :cond_38

    .line 1169
    .line 1170
    if-eq v2, v9, :cond_38

    .line 1171
    .line 1172
    invoke-virtual {v0}, Landroidx/drawerlayout/widget/DrawerLayout;->d()V

    .line 1173
    .line 1174
    .line 1175
    goto :goto_11

    .line 1176
    :cond_38
    if-eq v2, v11, :cond_39

    .line 1177
    .line 1178
    invoke-virtual {v0}, Landroidx/drawerlayout/widget/DrawerLayout;->q()V

    .line 1179
    .line 1180
    .line 1181
    :cond_39
    :goto_11
    return-void

    .line 1182
    :pswitch_d
    check-cast v12, Ld5;

    .line 1183
    .line 1184
    invoke-virtual {v12}, Ld5;->a()V

    .line 1185
    .line 1186
    .line 1187
    return-void

    .line 1188
    nop

    .line 1189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
