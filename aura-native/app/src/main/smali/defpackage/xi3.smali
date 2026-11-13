.class public Ldefpackage/xi3;
.super Ldefpackage/kc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public l0:Z

.field public m0:Ljava/lang/String;

.field public n0:Ljava/lang/String;

.field public o0:Ldefpackage/ns3;

.field public p0:Ldefpackage/aj3;

.field public q0:Ldefpackage/bl2;

.field public r0:Landroid/os/Handler;

.field public s0:Ldefpackage/ur2;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldefpackage/kc1;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Ldefpackage/xi3;->l0:Z

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Ldefpackage/xi3;->m0:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v0, p0, Ldefpackage/xi3;->n0:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const v1, 0x7f0d007f

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    move-object/from16 v3, p1

    .line 8
    .line 9
    move-object/from16 v4, p2

    .line 10
    .line 11
    invoke-virtual {v3, v1, v4, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const v3, 0x7f0a0479

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    const/4 v5, 0x0

    .line 23
    const-string v6, "Missing required view with ID: "

    .line 24
    .line 25
    if-eqz v4, :cond_6

    .line 26
    .line 27
    check-cast v4, Landroidx/viewpager2/widget/ViewPager2;

    .line 28
    .line 29
    new-instance v3, Ldefpackage/om1;

    .line 30
    .line 31
    const/16 v7, 0x10

    .line 32
    .line 33
    invoke-direct {v3, v7, v4}, Ldefpackage/om1;-><init>(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    const v4, 0x7f0a047e

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v4}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    if-eqz v7, :cond_5

    .line 44
    .line 45
    const v4, 0x7f0a045d

    .line 46
    .line 47
    .line 48
    invoke-static {v7, v4}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v10

    .line 52
    if-eqz v10, :cond_4

    .line 53
    .line 54
    const v4, 0x7f0a045e

    .line 55
    .line 56
    .line 57
    invoke-static {v7, v4}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v11

    .line 61
    if-eqz v11, :cond_4

    .line 62
    .line 63
    const v4, 0x7f0a047b

    .line 64
    .line 65
    .line 66
    invoke-static {v7, v4}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v8

    .line 70
    move-object v12, v8

    .line 71
    check-cast v12, Landroid/widget/ImageButton;

    .line 72
    .line 73
    if-eqz v12, :cond_4

    .line 74
    .line 75
    const v4, 0x7f0a047c

    .line 76
    .line 77
    .line 78
    invoke-static {v7, v4}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    move-object v13, v8

    .line 83
    check-cast v13, Landroid/widget/ToggleButton;

    .line 84
    .line 85
    if-eqz v13, :cond_4

    .line 86
    .line 87
    const v4, 0x7f0a047d

    .line 88
    .line 89
    .line 90
    invoke-static {v7, v4}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    move-object v14, v8

    .line 95
    check-cast v14, Landroid/widget/ImageButton;

    .line 96
    .line 97
    if-eqz v14, :cond_4

    .line 98
    .line 99
    const v4, 0x7f0a047f

    .line 100
    .line 101
    .line 102
    invoke-static {v7, v4}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    move-object v15, v8

    .line 107
    check-cast v15, Landroid/widget/TextView;

    .line 108
    .line 109
    if-eqz v15, :cond_4

    .line 110
    .line 111
    const v4, 0x7f0a0480

    .line 112
    .line 113
    .line 114
    invoke-static {v7, v4}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    move-object/from16 v16, v8

    .line 119
    .line 120
    check-cast v16, Landroid/widget/ImageView;

    .line 121
    .line 122
    if-eqz v16, :cond_4

    .line 123
    .line 124
    const v4, 0x7f0a0481

    .line 125
    .line 126
    .line 127
    invoke-static {v7, v4}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    move-object/from16 v17, v8

    .line 132
    .line 133
    check-cast v17, Landroid/widget/TextView;

    .line 134
    .line 135
    if-eqz v17, :cond_4

    .line 136
    .line 137
    const v4, 0x7f0a0482

    .line 138
    .line 139
    .line 140
    invoke-static {v7, v4}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    move-object/from16 v18, v8

    .line 145
    .line 146
    check-cast v18, Landroid/widget/ImageButton;

    .line 147
    .line 148
    if-eqz v18, :cond_4

    .line 149
    .line 150
    const v4, 0x7f0a0483

    .line 151
    .line 152
    .line 153
    invoke-static {v7, v4}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    move-object/from16 v19, v8

    .line 158
    .line 159
    check-cast v19, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 160
    .line 161
    if-eqz v19, :cond_4

    .line 162
    .line 163
    const v4, 0x7f0a0484

    .line 164
    .line 165
    .line 166
    invoke-static {v7, v4}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    move-object/from16 v20, v8

    .line 171
    .line 172
    check-cast v20, Landroid/widget/ImageButton;

    .line 173
    .line 174
    if-eqz v20, :cond_4

    .line 175
    .line 176
    const v4, 0x7f0a0485

    .line 177
    .line 178
    .line 179
    invoke-static {v7, v4}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 180
    .line 181
    .line 182
    move-result-object v8

    .line 183
    move-object/from16 v21, v8

    .line 184
    .line 185
    check-cast v21, Landroid/widget/SeekBar;

    .line 186
    .line 187
    if-eqz v21, :cond_4

    .line 188
    .line 189
    new-instance v8, Ldefpackage/ae1;

    .line 190
    .line 191
    move-object v9, v7

    .line 192
    check-cast v9, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 193
    .line 194
    invoke-direct/range {v8 .. v21}, Ldefpackage/ae1;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Landroid/widget/ImageButton;Landroid/widget/ToggleButton;Landroid/widget/ImageButton;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageButton;Landroidx/appcompat/widget/AppCompatImageButton;Landroid/widget/ImageButton;Landroid/widget/SeekBar;)V

    .line 195
    .line 196
    .line 197
    new-instance v4, Ldefpackage/ns3;

    .line 198
    .line 199
    check-cast v1, Landroid/widget/FrameLayout;

    .line 200
    .line 201
    const/4 v6, 0x4

    .line 202
    invoke-direct {v4, v1, v3, v8, v6}, Ldefpackage/ns3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 203
    .line 204
    .line 205
    iput-object v4, v0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 206
    .line 207
    invoke-virtual {v0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    invoke-virtual {v3}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    invoke-static {v3}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    invoke-static {v3, v7}, Ldefpackage/b11;->e(Ldefpackage/nc1;Ldefpackage/b75;)Ldefpackage/tf0;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    new-instance v8, Ldefpackage/bq4;

    .line 224
    .line 225
    invoke-direct {v8, v4, v7, v3}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 226
    .line 227
    .line 228
    const-class v3, Ldefpackage/aj3;

    .line 229
    .line 230
    invoke-static {v3}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    invoke-virtual {v3}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    if-eqz v4, :cond_3

    .line 239
    .line 240
    const-string v5, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 241
    .line 242
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    invoke-virtual {v8, v3, v4}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    check-cast v3, Ldefpackage/aj3;

    .line 251
    .line 252
    iput-object v3, v0, Ldefpackage/xi3;->p0:Ldefpackage/aj3;

    .line 253
    .line 254
    iget-object v3, v0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 255
    .line 256
    iget-object v3, v3, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast v3, Ldefpackage/ae1;

    .line 259
    .line 260
    iget-object v3, v3, Ldefpackage/ae1;->k:Landroid/view/View;

    .line 261
    .line 262
    check-cast v3, Landroidx/appcompat/widget/AppCompatImageButton;

    .line 263
    .line 264
    new-instance v4, Ldefpackage/ti3;

    .line 265
    .line 266
    invoke-direct {v4, v0, v6}, Ldefpackage/ti3;-><init>(Ldefpackage/xi3;I)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 270
    .line 271
    .line 272
    iget-object v3, v0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 273
    .line 274
    iget-object v3, v3, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v3, Ldefpackage/ae1;

    .line 277
    .line 278
    iget-object v3, v3, Ldefpackage/ae1;->b:Landroid/view/ViewGroup;

    .line 279
    .line 280
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 281
    .line 282
    new-instance v4, Ldefpackage/ti3;

    .line 283
    .line 284
    const/4 v5, 0x5

    .line 285
    invoke-direct {v4, v0, v5}, Ldefpackage/ti3;-><init>(Ldefpackage/xi3;I)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 289
    .line 290
    .line 291
    iget-object v3, v0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 292
    .line 293
    iget-object v3, v3, Ldefpackage/ns3;->p:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v3, Ldefpackage/om1;

    .line 296
    .line 297
    iget-object v3, v3, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v3, Landroidx/viewpager2/widget/ViewPager2;

    .line 300
    .line 301
    const/4 v4, 0x1

    .line 302
    invoke-virtual {v3, v4}, Landroidx/viewpager2/widget/ViewPager2;->setOrientation(I)V

    .line 303
    .line 304
    .line 305
    iget-object v3, v0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 306
    .line 307
    iget-object v3, v3, Ldefpackage/ns3;->p:Ljava/lang/Object;

    .line 308
    .line 309
    check-cast v3, Ldefpackage/om1;

    .line 310
    .line 311
    iget-object v3, v3, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v3, Landroidx/viewpager2/widget/ViewPager2;

    .line 314
    .line 315
    new-instance v5, Ldefpackage/ck3;

    .line 316
    .line 317
    invoke-direct {v5, v0}, Ldefpackage/ck3;-><init>(Ldefpackage/xi3;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v3, v5}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Ldefpackage/dw3;)V

    .line 321
    .line 322
    .line 323
    invoke-static {}, Ldefpackage/ud3;->Y()Z

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    const/4 v5, 0x2

    .line 328
    if-eqz v3, :cond_0

    .line 329
    .line 330
    iget-object v3, v0, Ldefpackage/xi3;->p0:Ldefpackage/aj3;

    .line 331
    .line 332
    invoke-virtual {v3}, Ldefpackage/aj3;->c()Ldefpackage/k03;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    new-instance v6, Ldefpackage/np0;

    .line 337
    .line 338
    invoke-direct {v6, v5, v0}, Ldefpackage/np0;-><init>(ILjava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v3, v6}, Ldefpackage/ad2;->f(Ldefpackage/a83;)V

    .line 342
    .line 343
    .line 344
    iget-object v3, v0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 345
    .line 346
    iget-object v3, v3, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v3, Ldefpackage/ae1;

    .line 349
    .line 350
    iget-object v3, v3, Ldefpackage/ae1;->e:Landroid/view/View;

    .line 351
    .line 352
    check-cast v3, Landroid/widget/ImageButton;

    .line 353
    .line 354
    new-instance v6, Ldefpackage/q6;

    .line 355
    .line 356
    const/16 v7, 0xe

    .line 357
    .line 358
    invoke-direct {v6, v7, v0}, Ldefpackage/q6;-><init>(ILjava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v3, v6}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 362
    .line 363
    .line 364
    new-instance v3, Landroid/os/Handler;

    .line 365
    .line 366
    invoke-direct {v3}, Landroid/os/Handler;-><init>()V

    .line 367
    .line 368
    .line 369
    new-instance v6, Ldefpackage/ri3;

    .line 370
    .line 371
    invoke-direct {v6, v0, v4}, Ldefpackage/ri3;-><init>(Ldefpackage/xi3;I)V

    .line 372
    .line 373
    .line 374
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 382
    .line 383
    .line 384
    move-result-object v4

    .line 385
    const-string v7, "queue_syncing_countdown"

    .line 386
    .line 387
    const-string v8, "5"

    .line 388
    .line 389
    invoke-interface {v4, v7, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 390
    .line 391
    .line 392
    move-result-object v4

    .line 393
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 397
    .line 398
    .line 399
    move-result v4

    .line 400
    int-to-long v7, v4

    .line 401
    const-wide/16 v9, 0x3e8

    .line 402
    .line 403
    mul-long/2addr v7, v9

    .line 404
    invoke-virtual {v3, v6, v7, v8}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 405
    .line 406
    .line 407
    :cond_0
    sget-object v3, Ldefpackage/u52;->b:Ldefpackage/k03;

    .line 408
    .line 409
    invoke-virtual {v0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 410
    .line 411
    .line 412
    move-result-object v4

    .line 413
    new-instance v6, Ldefpackage/si3;

    .line 414
    .line 415
    invoke-direct {v6, v0, v2}, Ldefpackage/si3;-><init>(Ldefpackage/xi3;I)V

    .line 416
    .line 417
    .line 418
    invoke-virtual {v3, v4, v6}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v0}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    instance-of v2, v2, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 426
    .line 427
    if-eqz v2, :cond_2

    .line 428
    .line 429
    invoke-virtual {v0}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 430
    .line 431
    .line 432
    move-result-object v2

    .line 433
    check-cast v2, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 434
    .line 435
    iget-object v2, v2, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Ldefpackage/zg5;

    .line 436
    .line 437
    if-eqz v2, :cond_2

    .line 438
    .line 439
    iget-object v2, v2, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast v2, Ldefpackage/au;

    .line 442
    .line 443
    iget-boolean v3, v2, Ldefpackage/au;->a:Z

    .line 444
    .line 445
    if-nez v3, :cond_1

    .line 446
    .line 447
    iget-object v2, v2, Ldefpackage/au;->b:Ljava/lang/Object;

    .line 448
    .line 449
    check-cast v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 450
    .line 451
    iget v2, v2, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:I

    .line 452
    .line 453
    const/4 v3, 0x3

    .line 454
    if-eq v2, v3, :cond_1

    .line 455
    .line 456
    if-ne v2, v5, :cond_2

    .line 457
    .line 458
    :cond_1
    iget-object v2, v0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 459
    .line 460
    iget-object v2, v2, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 461
    .line 462
    check-cast v2, Ldefpackage/ae1;

    .line 463
    .line 464
    iget-object v2, v2, Ldefpackage/ae1;->b:Landroid/view/ViewGroup;

    .line 465
    .line 466
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 467
    .line 468
    const/4 v3, 0x0

    .line 469
    invoke-virtual {v2, v3}, Landroid/view/View;->setAlpha(F)V

    .line 470
    .line 471
    .line 472
    iget-object v0, v0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 473
    .line 474
    iget-object v0, v0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v0, Ldefpackage/ae1;

    .line 477
    .line 478
    iget-object v0, v0, Ldefpackage/ae1;->b:Landroid/view/ViewGroup;

    .line 479
    .line 480
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 481
    .line 482
    const/16 v2, 0x8

    .line 483
    .line 484
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 485
    .line 486
    .line 487
    :cond_2
    return-object v1

    .line 488
    :cond_3
    const-string v0, "Local and anonymous classes can not be ViewModels"

    .line 489
    .line 490
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    return-object v5

    .line 494
    :cond_4
    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    invoke-static {v0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    return-object v5

    .line 510
    :cond_5
    move v3, v4

    .line 511
    :cond_6
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    invoke-static {v0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 524
    .line 525
    .line 526
    return-object v5
.end method

.method public final J()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/xi3;->r0:Landroid/os/Handler;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Ldefpackage/xi3;->s0:Ldefpackage/ur2;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Ldefpackage/xi3;->l0:Z

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Ldefpackage/xi3;->m0:Ljava/lang/String;

    .line 18
    .line 19
    iput-object v0, p0, Ldefpackage/xi3;->n0:Ljava/lang/String;

    .line 20
    .line 21
    iput-object v0, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 22
    .line 23
    return-void
.end method

.method public final R()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    new-instance v3, Ldefpackage/cb4;

    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Landroid/content/ComponentName;

    .line 15
    .line 16
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    const-class v5, Lcom/eddyizm/tempus/service/MediaService;

    .line 21
    .line 22
    invoke-direct {v1, v4, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v3, v0, v1}, Ldefpackage/cb4;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V

    .line 26
    .line 27
    .line 28
    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 29
    .line 30
    new-instance v5, Ldefpackage/aj2;

    .line 31
    .line 32
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Ldefpackage/f35;->x()Landroid/os/Looper;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    new-instance v7, Ldefpackage/bl2;

    .line 40
    .line 41
    invoke-direct {v7, v6}, Ldefpackage/bl2;-><init>(Landroid/os/Looper;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, v3, Ldefpackage/cb4;->a:Ldefpackage/bb4;

    .line 45
    .line 46
    invoke-interface {v0}, Ldefpackage/bb4;->e()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    new-instance v0, Ldefpackage/xc5;

    .line 53
    .line 54
    new-instance v1, Ldefpackage/x7;

    .line 55
    .line 56
    invoke-direct {v1, v2}, Ldefpackage/x7;-><init>(Landroid/content/Context;)V

    .line 57
    .line 58
    .line 59
    new-instance v8, Ldefpackage/fi0;

    .line 60
    .line 61
    invoke-direct {v8, v1}, Ldefpackage/fi0;-><init>(Ldefpackage/x7;)V

    .line 62
    .line 63
    .line 64
    const/4 v1, 0x4

    .line 65
    invoke-direct {v0, v1, v8}, Ldefpackage/xc5;-><init>(ILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    :goto_0
    move-object v8, v0

    .line 69
    goto :goto_1

    .line 70
    :cond_0
    const/4 v0, 0x0

    .line 71
    goto :goto_0

    .line 72
    :goto_1
    new-instance v1, Ldefpackage/bj2;

    .line 73
    .line 74
    invoke-direct/range {v1 .. v8}, Ldefpackage/sk2;-><init>(Landroid/content/Context;Ldefpackage/cb4;Landroid/os/Bundle;Ldefpackage/qk2;Landroid/os/Looper;Ldefpackage/bl2;Ldefpackage/xc5;)V

    .line 75
    .line 76
    .line 77
    new-instance v0, Landroid/os/Handler;

    .line 78
    .line 79
    invoke-direct {v0, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 80
    .line 81
    .line 82
    invoke-static {v7, v1, v0}, Ldefpackage/b11;->w(Ldefpackage/bl2;Ldefpackage/bj2;Landroid/os/Handler;)V

    .line 83
    .line 84
    .line 85
    iput-object v7, p0, Ldefpackage/xi3;->q0:Ldefpackage/bl2;

    .line 86
    .line 87
    new-instance v0, Ldefpackage/ri3;

    .line 88
    .line 89
    const/4 v1, 0x0

    .line 90
    invoke-direct {v0, p0, v1}, Ldefpackage/ri3;-><init>(Ldefpackage/xi3;I)V

    .line 91
    .line 92
    .line 93
    sget-object p0, Ldefpackage/gq0;->n:Ldefpackage/gq0;

    .line 94
    .line 95
    invoke-virtual {v7, v0, p0}, Ldefpackage/u0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/xi3;->q0:Ldefpackage/bl2;

    .line 2
    .line 3
    invoke-static {v0}, Ldefpackage/sk2;->Z0(Ljava/util/concurrent/Future;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 8
    .line 9
    return-void
.end method

.method public final h0(J)V
    .locals 2

    .line 1
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Ldefpackage/v52;->a:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 10
    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p0, p0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ldefpackage/ae1;

    .line 17
    .line 18
    iget-object p0, p0, Ldefpackage/ae1;->m:Landroid/view/View;

    .line 19
    .line 20
    check-cast p0, Landroid/widget/SeekBar;

    .line 21
    .line 22
    const-wide/16 v0, 0x3e8

    .line 23
    .line 24
    div-long/2addr p1, v0

    .line 25
    long-to-int p1, p1

    .line 26
    invoke-virtual {p0, p1}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    return-void
.end method

.method public final i0(Z)V
    .locals 1

    .line 1
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Ldefpackage/v52;->a:Z

    .line 6
    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object v0, v0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ldefpackage/ae1;

    .line 17
    .line 18
    iget-object v0, v0, Ldefpackage/ae1;->j:Landroid/view/View;

    .line 19
    .line 20
    check-cast v0, Landroid/widget/ImageButton;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 26
    .line 27
    iget-object p0, p0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p0, Ldefpackage/ae1;

    .line 30
    .line 31
    iget-object p0, p0, Ldefpackage/ae1;->j:Landroid/view/View;

    .line 32
    .line 33
    check-cast p0, Landroid/widget/ImageButton;

    .line 34
    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    const/high16 p1, 0x3f800000    # 1.0f

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const p1, 0x3e99999a    # 0.3f

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_1
    return-void
.end method

.method public final j0(Ldefpackage/bj2;)V
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Ldefpackage/xi3;->r0:Landroid/os/Handler;

    .line 7
    .line 8
    new-instance v0, Ldefpackage/ur2;

    .line 9
    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    invoke-direct {v0, v1, p0, p1}, Ldefpackage/ur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Ldefpackage/xi3;->s0:Ldefpackage/ur2;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ldefpackage/xi3;->k0(Ldefpackage/bj2;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ldefpackage/sk2;->K0()Ldefpackage/do2;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p0, v0}, Ldefpackage/xi3;->l0(Ldefpackage/do2;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ldefpackage/sk2;->x()J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    invoke-virtual {p0, v0, v1}, Ldefpackage/xi3;->h0(J)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Ldefpackage/sk2;->h0()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-virtual {p0, v0}, Ldefpackage/xi3;->m0(Z)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 42
    .line 43
    iget-object v0, v0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Ldefpackage/ae1;

    .line 46
    .line 47
    iget-object v0, v0, Ldefpackage/ae1;->f:Landroid/view/View;

    .line 48
    .line 49
    check-cast v0, Landroid/widget/ToggleButton;

    .line 50
    .line 51
    new-instance v1, Ldefpackage/ti3;

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    invoke-direct {v1, p0, v2}, Ldefpackage/ti3;-><init>(Ldefpackage/xi3;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 61
    .line 62
    iget-object v0, v0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Ldefpackage/ae1;

    .line 65
    .line 66
    iget-object v0, v0, Ldefpackage/ae1;->j:Landroid/view/View;

    .line 67
    .line 68
    check-cast v0, Landroid/widget/ImageButton;

    .line 69
    .line 70
    new-instance v1, Ldefpackage/ti3;

    .line 71
    .line 72
    const/4 v2, 0x1

    .line 73
    invoke-direct {v1, p0, v2}, Ldefpackage/ti3;-><init>(Ldefpackage/xi3;I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 80
    .line 81
    iget-object v0, v0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Ldefpackage/ae1;

    .line 84
    .line 85
    iget-object v0, v0, Ldefpackage/ae1;->l:Landroid/view/View;

    .line 86
    .line 87
    check-cast v0, Landroid/widget/ImageButton;

    .line 88
    .line 89
    new-instance v1, Ldefpackage/ti3;

    .line 90
    .line 91
    const/4 v2, 0x2

    .line 92
    invoke-direct {v1, p0, v2}, Ldefpackage/ti3;-><init>(Ldefpackage/xi3;I)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 99
    .line 100
    iget-object v0, v0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Ldefpackage/ae1;

    .line 103
    .line 104
    iget-object v0, v0, Ldefpackage/ae1;->g:Landroid/view/View;

    .line 105
    .line 106
    check-cast v0, Landroid/widget/ImageButton;

    .line 107
    .line 108
    new-instance v1, Ldefpackage/ti3;

    .line 109
    .line 110
    const/4 v2, 0x3

    .line 111
    invoke-direct {v1, p0, v2}, Ldefpackage/ti3;-><init>(Ldefpackage/xi3;I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Ldefpackage/sk2;->f0()Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    invoke-virtual {p0, v0}, Ldefpackage/xi3;->i0(Z)V

    .line 122
    .line 123
    .line 124
    new-instance v0, Ldefpackage/ui3;

    .line 125
    .line 126
    invoke-direct {v0, p0, p1}, Ldefpackage/ui3;-><init>(Ldefpackage/xi3;Ldefpackage/bj2;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, v0}, Ldefpackage/sk2;->v(Ldefpackage/oi3;)V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public final k0(Ldefpackage/bj2;)V
    .locals 5

    .line 1
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Ldefpackage/v52;->a:Z

    .line 6
    .line 7
    if-nez v0, :cond_4

    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_1

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p1}, Ldefpackage/sk2;->K0()Ldefpackage/do2;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget-object v0, v0, Ldefpackage/do2;->I:Landroid/os/Bundle;

    .line 20
    .line 21
    if-eqz v0, :cond_4

    .line 22
    .line 23
    invoke-virtual {p1}, Ldefpackage/sk2;->K0()Ldefpackage/do2;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object p1, p1, Ldefpackage/do2;->I:Landroid/os/Bundle;

    .line 28
    .line 29
    const-string v0, "type"

    .line 30
    .line 31
    const-string v1, "music"

    .line 32
    .line 33
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    const v2, -0x182c7cfc

    .line 42
    .line 43
    .line 44
    const/16 v3, 0x8

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    if-eq v0, v2, :cond_2

    .line 48
    .line 49
    const v2, 0x636ee25

    .line 50
    .line 51
    .line 52
    if-eq v0, v2, :cond_1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    const-string v0, "podcast"

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    iget-object p1, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 69
    .line 70
    iget-object p1, p1, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p1, Ldefpackage/ae1;

    .line 73
    .line 74
    iget-object p1, p1, Ldefpackage/ae1;->g:Landroid/view/View;

    .line 75
    .line 76
    check-cast p1, Landroid/widget/ImageButton;

    .line 77
    .line 78
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 82
    .line 83
    iget-object p1, p1, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p1, Ldefpackage/ae1;

    .line 86
    .line 87
    iget-object p1, p1, Ldefpackage/ae1;->l:Landroid/view/View;

    .line 88
    .line 89
    check-cast p1, Landroid/widget/ImageButton;

    .line 90
    .line 91
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 92
    .line 93
    .line 94
    iget-object p0, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 95
    .line 96
    iget-object p0, p0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p0, Ldefpackage/ae1;

    .line 99
    .line 100
    iget-object p0, p0, Ldefpackage/ae1;->j:Landroid/view/View;

    .line 101
    .line 102
    check-cast p0, Landroid/widget/ImageButton;

    .line 103
    .line 104
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_3
    :goto_0
    iget-object p1, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 109
    .line 110
    iget-object p1, p1, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p1, Ldefpackage/ae1;

    .line 113
    .line 114
    iget-object p1, p1, Ldefpackage/ae1;->g:Landroid/view/View;

    .line 115
    .line 116
    check-cast p1, Landroid/widget/ImageButton;

    .line 117
    .line 118
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 119
    .line 120
    .line 121
    iget-object p1, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 122
    .line 123
    iget-object p1, p1, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast p1, Ldefpackage/ae1;

    .line 126
    .line 127
    iget-object p1, p1, Ldefpackage/ae1;->l:Landroid/view/View;

    .line 128
    .line 129
    check-cast p1, Landroid/widget/ImageButton;

    .line 130
    .line 131
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 132
    .line 133
    .line 134
    iget-object p0, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 135
    .line 136
    iget-object p0, p0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast p0, Ldefpackage/ae1;

    .line 139
    .line 140
    iget-object p0, p0, Ldefpackage/ae1;->j:Landroid/view/View;

    .line 141
    .line 142
    check-cast p0, Landroid/widget/ImageButton;

    .line 143
    .line 144
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 145
    .line 146
    .line 147
    :cond_4
    :goto_1
    return-void
.end method

.method public final l0(Ldefpackage/do2;)V
    .locals 13

    .line 1
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Ldefpackage/v52;->a:Z

    .line 6
    .line 7
    if-nez v0, :cond_14

    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_a

    .line 14
    .line 15
    :cond_0
    iget-object v0, p1, Ldefpackage/do2;->I:Landroid/os/Bundle;

    .line 16
    .line 17
    iget-object v1, p1, Ldefpackage/do2;->m:Landroid/net/Uri;

    .line 18
    .line 19
    iget-object p1, p1, Ldefpackage/do2;->b:Ljava/lang/CharSequence;

    .line 20
    .line 21
    if-eqz v0, :cond_14

    .line 22
    .line 23
    iget-object v2, p0, Ldefpackage/xi3;->p0:Ldefpackage/aj3;

    .line 24
    .line 25
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const-string v4, "type"

    .line 30
    .line 31
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const-string v6, "id"

    .line 36
    .line 37
    invoke-virtual {v0, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-virtual {v2, v3, v5, v7}, Ldefpackage/aj3;->i(Ldefpackage/le1;Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, Ldefpackage/xi3;->p0:Ldefpackage/aj3;

    .line 45
    .line 46
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    const-string v7, "albumId"

    .line 55
    .line 56
    invoke-virtual {v0, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    iget-object v8, v2, Ldefpackage/aj3;->o:Ldefpackage/k03;

    .line 61
    .line 62
    const-string v9, "music"

    .line 63
    .line 64
    const-string v10, "podcast"

    .line 65
    .line 66
    const/4 v11, 0x0

    .line 67
    if-eqz v5, :cond_3

    .line 68
    .line 69
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v12

    .line 73
    if-nez v12, :cond_2

    .line 74
    .line 75
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-nez v5, :cond_1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    iget-object v2, v2, Ldefpackage/aj3;->d:Ldefpackage/rv2;

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-static {v7}, Ldefpackage/rv2;->j(Ljava/lang/String;)Ldefpackage/k03;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    new-instance v5, Ldefpackage/g7;

    .line 95
    .line 96
    const/4 v7, 0x1

    .line 97
    invoke-direct {v5, v8, v7}, Ldefpackage/g7;-><init>(Ldefpackage/k03;I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v3, v5}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_2
    invoke-virtual {v8, v11}, Ldefpackage/ad2;->i(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :cond_3
    :goto_0
    iget-object v2, p0, Ldefpackage/xi3;->p0:Ldefpackage/aj3;

    .line 108
    .line 109
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    const-string v7, "artistId"

    .line 118
    .line 119
    invoke-virtual {v0, v7}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    iget-object v8, v2, Ldefpackage/aj3;->p:Ldefpackage/k03;

    .line 124
    .line 125
    if-eqz v5, :cond_6

    .line 126
    .line 127
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    if-nez v10, :cond_5

    .line 132
    .line 133
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-nez v5, :cond_4

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_4
    iget-object v2, v2, Ldefpackage/aj3;->e:Ldefpackage/pa;

    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-static {v7}, Ldefpackage/pa;->v(Ljava/lang/String;)Ldefpackage/k03;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    new-instance v5, Ldefpackage/g7;

    .line 153
    .line 154
    const/4 v7, 0x2

    .line 155
    invoke-direct {v5, v8, v7}, Ldefpackage/g7;-><init>(Ldefpackage/k03;I)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, v3, v5}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_5
    invoke-virtual {v8, v11}, Ldefpackage/ad2;->i(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    :cond_6
    :goto_1
    iget-object v2, p0, Ldefpackage/xi3;->p0:Ldefpackage/aj3;

    .line 166
    .line 167
    const-string v3, "description"

    .line 168
    .line 169
    invoke-virtual {v0, v3, v11}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v3

    .line 173
    iget-object v2, v2, Ldefpackage/aj3;->m:Ldefpackage/k03;

    .line 174
    .line 175
    invoke-virtual {v2, v3}, Ldefpackage/ad2;->i(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    const-string v3, "radio"

    .line 183
    .line 184
    invoke-static {v2, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    const/16 v5, 0x8

    .line 189
    .line 190
    const/4 v7, 0x0

    .line 191
    const-string v8, ""

    .line 192
    .line 193
    if-eqz v2, :cond_d

    .line 194
    .line 195
    if-eqz p1, :cond_7

    .line 196
    .line 197
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    goto :goto_2

    .line 202
    :cond_7
    move-object p1, v8

    .line 203
    :goto_2
    const-string v2, "stationName"

    .line 204
    .line 205
    invoke-virtual {v0, v2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    const-string v2, "radioArtist"

    .line 210
    .line 211
    invoke-virtual {v0, v2, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    const-string v6, "radioTitle"

    .line 216
    .line 217
    invoke-virtual {v0, v6, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 222
    .line 223
    .line 224
    move-result v8

    .line 225
    if-nez v8, :cond_8

    .line 226
    .line 227
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 228
    .line 229
    .line 230
    move-result v8

    .line 231
    if-nez v8, :cond_8

    .line 232
    .line 233
    const-string v8, " - "

    .line 234
    .line 235
    invoke-static {v2, v8, v6}, Ldefpackage/b11;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v2

    .line 239
    goto :goto_3

    .line 240
    :cond_8
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 241
    .line 242
    .line 243
    move-result v8

    .line 244
    if-nez v8, :cond_9

    .line 245
    .line 246
    move-object v2, v6

    .line 247
    goto :goto_3

    .line 248
    :cond_9
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 249
    .line 250
    .line 251
    move-result v6

    .line 252
    if-nez v6, :cond_a

    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_a
    move-object v2, p1

    .line 256
    :goto_3
    iget-object v6, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 257
    .line 258
    iget-object v6, v6, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v6, Ldefpackage/ae1;

    .line 261
    .line 262
    iget-object v6, v6, Ldefpackage/ae1;->i:Landroid/view/View;

    .line 263
    .line 264
    check-cast v6, Landroid/widget/TextView;

    .line 265
    .line 266
    invoke-virtual {v6, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 267
    .line 268
    .line 269
    iget-object v6, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 270
    .line 271
    iget-object v6, v6, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v6, Ldefpackage/ae1;

    .line 274
    .line 275
    iget-object v6, v6, Ldefpackage/ae1;->a:Landroid/widget/TextView;

    .line 276
    .line 277
    invoke-virtual {v6, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 278
    .line 279
    .line 280
    iget-object v6, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 281
    .line 282
    iget-object v6, v6, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v6, Ldefpackage/ae1;

    .line 285
    .line 286
    iget-object v6, v6, Ldefpackage/ae1;->i:Landroid/view/View;

    .line 287
    .line 288
    check-cast v6, Landroid/widget/TextView;

    .line 289
    .line 290
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    if-nez v2, :cond_b

    .line 295
    .line 296
    move v2, v7

    .line 297
    goto :goto_4

    .line 298
    :cond_b
    move v2, v5

    .line 299
    :goto_4
    invoke-virtual {v6, v2}, Landroid/view/View;->setVisibility(I)V

    .line 300
    .line 301
    .line 302
    iget-object v2, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 303
    .line 304
    iget-object v2, v2, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast v2, Ldefpackage/ae1;

    .line 307
    .line 308
    iget-object v2, v2, Ldefpackage/ae1;->a:Landroid/widget/TextView;

    .line 309
    .line 310
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 311
    .line 312
    .line 313
    move-result p1

    .line 314
    if-nez p1, :cond_c

    .line 315
    .line 316
    goto :goto_5

    .line 317
    :cond_c
    move v7, v5

    .line 318
    :goto_5
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 319
    .line 320
    .line 321
    goto/16 :goto_9

    .line 322
    .line 323
    :cond_d
    iget-object v2, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 324
    .line 325
    iget-object v2, v2, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v2, Ldefpackage/ae1;

    .line 328
    .line 329
    iget-object v2, v2, Ldefpackage/ae1;->i:Landroid/view/View;

    .line 330
    .line 331
    check-cast v2, Landroid/widget/TextView;

    .line 332
    .line 333
    const-string v9, "title"

    .line 334
    .line 335
    invoke-virtual {v0, v9}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v10

    .line 339
    invoke-virtual {v2, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 340
    .line 341
    .line 342
    iget-object v2, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 343
    .line 344
    iget-object v2, v2, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v2, Ldefpackage/ae1;

    .line 347
    .line 348
    iget-object v2, v2, Ldefpackage/ae1;->a:Landroid/widget/TextView;

    .line 349
    .line 350
    if-eqz p1, :cond_e

    .line 351
    .line 352
    goto :goto_6

    .line 353
    :cond_e
    move-object p1, v8

    .line 354
    :goto_6
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 355
    .line 356
    .line 357
    iget-object p1, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 358
    .line 359
    iget-object p1, p1, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast p1, Ldefpackage/ae1;

    .line 362
    .line 363
    iget-object p1, p1, Ldefpackage/ae1;->a:Landroid/widget/TextView;

    .line 364
    .line 365
    invoke-virtual {v0, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    invoke-static {p1, v2}, Ldefpackage/fu;->p(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    iget-object p1, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 373
    .line 374
    iget-object p1, p1, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast p1, Ldefpackage/ae1;

    .line 377
    .line 378
    iget-object p1, p1, Ldefpackage/ae1;->i:Landroid/view/View;

    .line 379
    .line 380
    check-cast p1, Landroid/widget/TextView;

    .line 381
    .line 382
    invoke-virtual {v0, v9}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    if-eqz v2, :cond_f

    .line 387
    .line 388
    invoke-virtual {v0, v9}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    invoke-static {v2, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v2

    .line 396
    if-nez v2, :cond_f

    .line 397
    .line 398
    move v2, v7

    .line 399
    goto :goto_7

    .line 400
    :cond_f
    move v2, v5

    .line 401
    :goto_7
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 402
    .line 403
    .line 404
    iget-object p1, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 405
    .line 406
    iget-object p1, p1, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast p1, Ldefpackage/ae1;

    .line 409
    .line 410
    iget-object p1, p1, Ldefpackage/ae1;->a:Landroid/widget/TextView;

    .line 411
    .line 412
    const-string v2, "artist"

    .line 413
    .line 414
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v6

    .line 418
    if-eqz v6, :cond_10

    .line 419
    .line 420
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    invoke-static {v2, v8}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v2

    .line 428
    if-nez v2, :cond_10

    .line 429
    .line 430
    goto :goto_8

    .line 431
    :cond_10
    move v7, v5

    .line 432
    :goto_8
    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 433
    .line 434
    .line 435
    :goto_9
    invoke-virtual {v0, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object p1

    .line 439
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 440
    .line 441
    .line 442
    move-result p1

    .line 443
    const-string v2, "coverArtId"

    .line 444
    .line 445
    if-eqz p1, :cond_11

    .line 446
    .line 447
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 448
    .line 449
    .line 450
    move-result-object p1

    .line 451
    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Ldefpackage/c04;

    .line 452
    .line 453
    .line 454
    move-result-object p1

    .line 455
    invoke-virtual {p1, v1}, Ldefpackage/c04;->r(Landroid/net/Uri;)Ldefpackage/vz3;

    .line 456
    .line 457
    .line 458
    move-result-object p1

    .line 459
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 460
    .line 461
    .line 462
    move-result-object v3

    .line 463
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v0

    .line 467
    invoke-static {v5, v3, v0}, Ldefpackage/wg0;->a(ILandroid/content/Context;Ljava/lang/String;)Ldefpackage/g04;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    invoke-virtual {p1, v0}, Ldefpackage/vz3;->G(Ldefpackage/lq;)Ldefpackage/vz3;

    .line 472
    .line 473
    .line 474
    move-result-object p1

    .line 475
    invoke-static {p1, v1}, Ldefpackage/xt3;->a(Ldefpackage/vz3;Landroid/net/Uri;)Ldefpackage/vz3;

    .line 476
    .line 477
    .line 478
    move-result-object p1

    .line 479
    iget-object p0, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 480
    .line 481
    iget-object p0, p0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 482
    .line 483
    check-cast p0, Ldefpackage/ae1;

    .line 484
    .line 485
    iget-object p0, p0, Ldefpackage/ae1;->h:Landroid/view/View;

    .line 486
    .line 487
    check-cast p0, Landroid/widget/ImageView;

    .line 488
    .line 489
    invoke-virtual {p1, p0}, Ldefpackage/vz3;->K(Landroid/widget/ImageView;)V

    .line 490
    .line 491
    .line 492
    return-void

    .line 493
    :cond_11
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 494
    .line 495
    .line 496
    move-result-object p1

    .line 497
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Ldefpackage/c04;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    if-eqz v0, :cond_12

    .line 506
    .line 507
    invoke-static {}, Ldefpackage/ud3;->t()I

    .line 508
    .line 509
    .line 510
    move-result v2

    .line 511
    invoke-static {v2, v0}, Ldefpackage/wg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v11

    .line 515
    :cond_12
    const/16 v2, 0x9

    .line 516
    .line 517
    invoke-static {p1, v0, v2, v1, v11}, Ldefpackage/b11;->g(Landroid/content/Context;Ljava/lang/String;ILdefpackage/c04;Ljava/lang/String;)Ldefpackage/vz3;

    .line 518
    .line 519
    .line 520
    move-result-object p1

    .line 521
    invoke-static {}, Ldefpackage/xv0;->b()Ldefpackage/xv0;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    invoke-virtual {p1, v0}, Ldefpackage/vz3;->T(Ldefpackage/xv0;)Ldefpackage/vz3;

    .line 526
    .line 527
    .line 528
    move-result-object p1

    .line 529
    invoke-static {}, Ldefpackage/ud3;->R()Z

    .line 530
    .line 531
    .line 532
    move-result v0

    .line 533
    if-eqz v0, :cond_13

    .line 534
    .line 535
    invoke-virtual {p1}, Ldefpackage/lq;->l()Ldefpackage/lq;

    .line 536
    .line 537
    .line 538
    move-result-object p1

    .line 539
    check-cast p1, Ldefpackage/vz3;

    .line 540
    .line 541
    :cond_13
    iget-object p0, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 542
    .line 543
    iget-object p0, p0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 544
    .line 545
    check-cast p0, Ldefpackage/ae1;

    .line 546
    .line 547
    iget-object p0, p0, Ldefpackage/ae1;->h:Landroid/view/View;

    .line 548
    .line 549
    check-cast p0, Landroid/widget/ImageView;

    .line 550
    .line 551
    invoke-virtual {p1, p0}, Ldefpackage/vz3;->K(Landroid/widget/ImageView;)V

    .line 552
    .line 553
    .line 554
    :cond_14
    :goto_a
    return-void
.end method

.method public final m0(Z)V
    .locals 3

    .line 1
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Ldefpackage/v52;->a:Z

    .line 6
    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, v0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Ldefpackage/ae1;

    .line 17
    .line 18
    iget-object v0, v0, Ldefpackage/ae1;->f:Landroid/view/View;

    .line 19
    .line 20
    check-cast v0, Landroid/widget/ToggleButton;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Landroid/widget/ToggleButton;->setChecked(Z)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Ldefpackage/xi3;->r0:Landroid/os/Handler;

    .line 26
    .line 27
    iget-object p0, p0, Ldefpackage/xi3;->s0:Ldefpackage/ur2;

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    const-wide/16 v1, 0x3e8

    .line 32
    .line 33
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_1
    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    :goto_0
    return-void
.end method

.method public final n0(Ldefpackage/bj2;)V
    .locals 6

    .line 1
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Ldefpackage/v52;->a:Z

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    const-wide/16 v2, 0x3e8

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    iget-object p0, p0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ldefpackage/ae1;

    .line 19
    .line 20
    iget-object p0, p0, Ldefpackage/ae1;->m:Landroid/view/View;

    .line 21
    .line 22
    check-cast p0, Landroid/widget/SeekBar;

    .line 23
    .line 24
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    invoke-virtual {p1, v4, v5}, Ldefpackage/v52;->b(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v4

    .line 36
    div-long/2addr v4, v2

    .line 37
    long-to-int p1, v4

    .line 38
    invoke-virtual {p0, p1, v1}, Landroid/widget/ProgressBar;->setProgress(IZ)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    if-eqz p0, :cond_1

    .line 43
    .line 44
    iget-object p0, p0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, Ldefpackage/ae1;

    .line 47
    .line 48
    iget-object p0, p0, Ldefpackage/ae1;->m:Landroid/view/View;

    .line 49
    .line 50
    check-cast p0, Landroid/widget/SeekBar;

    .line 51
    .line 52
    invoke-virtual {p1}, Ldefpackage/sk2;->M0()J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    div-long/2addr v4, v2

    .line 57
    long-to-int p1, v4

    .line 58
    invoke-virtual {p0, p1, v1}, Landroid/widget/ProgressBar;->setProgress(IZ)V

    .line 59
    .line 60
    .line 61
    :cond_1
    return-void
.end method
