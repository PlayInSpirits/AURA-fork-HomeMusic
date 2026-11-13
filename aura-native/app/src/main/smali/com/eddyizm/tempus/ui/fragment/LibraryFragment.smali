.class public Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;
.super Ldefpackage/kc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ClickCallback;


# instance fields
.field public l0:Ldefpackage/xc1;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Ldefpackage/om1;

.field public o0:Ldefpackage/n92;

.field public p0:Ldefpackage/vf2;

.field public q0:Ldefpackage/s6;

.field public r0:Ldefpackage/vi;

.field public s0:Ldefpackage/zd0;

.field public t0:Ldefpackage/q7;

.field public u0:Lcom/google/android/material/appbar/MaterialToolbar;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldefpackage/kc1;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 10
    .line 11
    iget-object v1, v1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Ldefpackage/om1;

    .line 12
    .line 13
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->n0:Ldefpackage/om1;

    .line 14
    .line 15
    const v1, 0x7f0d0077

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    move-object/from16 v3, p1

    .line 20
    .line 21
    move-object/from16 v4, p2

    .line 22
    .line 23
    invoke-virtual {v3, v1, v4, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const v3, 0x7f0a00a7

    .line 28
    .line 29
    .line 30
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    move-object v7, v4

    .line 35
    check-cast v7, Landroid/widget/LinearLayout;

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    if-eqz v7, :cond_2

    .line 39
    .line 40
    const v3, 0x7f0a00a8

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    move-object v8, v5

    .line 48
    check-cast v8, Landroid/widget/TextView;

    .line 49
    .line 50
    if-eqz v8, :cond_2

    .line 51
    .line 52
    const v3, 0x7f0a00ba

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    move-object v9, v5

    .line 60
    check-cast v9, Landroidx/recyclerview/widget/RecyclerView;

    .line 61
    .line 62
    if-eqz v9, :cond_2

    .line 63
    .line 64
    const v3, 0x7f0a00e6

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    move-object v10, v5

    .line 72
    check-cast v10, Landroid/widget/LinearLayout;

    .line 73
    .line 74
    if-eqz v10, :cond_2

    .line 75
    .line 76
    const v3, 0x7f0a00e7

    .line 77
    .line 78
    .line 79
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    move-object v11, v5

    .line 84
    check-cast v11, Landroid/widget/TextView;

    .line 85
    .line 86
    if-eqz v11, :cond_2

    .line 87
    .line 88
    const v3, 0x7f0a00f9

    .line 89
    .line 90
    .line 91
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    move-object v12, v5

    .line 96
    check-cast v12, Landroidx/recyclerview/widget/RecyclerView;

    .line 97
    .line 98
    if-eqz v12, :cond_2

    .line 99
    .line 100
    const v3, 0x7f0a0264

    .line 101
    .line 102
    .line 103
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    check-cast v5, Landroidx/core/widget/NestedScrollView;

    .line 108
    .line 109
    if-eqz v5, :cond_2

    .line 110
    .line 111
    const v3, 0x7f0a0269

    .line 112
    .line 113
    .line 114
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    move-object v13, v5

    .line 119
    check-cast v13, Landroid/widget/LinearLayout;

    .line 120
    .line 121
    if-eqz v13, :cond_2

    .line 122
    .line 123
    const v3, 0x7f0a026a

    .line 124
    .line 125
    .line 126
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    move-object v14, v5

    .line 131
    check-cast v14, Landroid/widget/TextView;

    .line 132
    .line 133
    if-eqz v14, :cond_2

    .line 134
    .line 135
    const v3, 0x7f0a0270

    .line 136
    .line 137
    .line 138
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 139
    .line 140
    .line 141
    move-result-object v5

    .line 142
    move-object v15, v5

    .line 143
    check-cast v15, Landroidx/recyclerview/widget/RecyclerView;

    .line 144
    .line 145
    if-eqz v15, :cond_2

    .line 146
    .line 147
    const v3, 0x7f0a0339

    .line 148
    .line 149
    .line 150
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    move-object/from16 v16, v5

    .line 155
    .line 156
    check-cast v16, Landroid/widget/LinearLayout;

    .line 157
    .line 158
    if-eqz v16, :cond_2

    .line 159
    .line 160
    const v3, 0x7f0a033a

    .line 161
    .line 162
    .line 163
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 164
    .line 165
    .line 166
    move-result-object v5

    .line 167
    move-object/from16 v17, v5

    .line 168
    .line 169
    check-cast v17, Landroid/widget/LinearLayout;

    .line 170
    .line 171
    if-eqz v17, :cond_2

    .line 172
    .line 173
    const v3, 0x7f0a033b

    .line 174
    .line 175
    .line 176
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    move-object/from16 v18, v5

    .line 181
    .line 182
    check-cast v18, Landroid/widget/LinearLayout;

    .line 183
    .line 184
    if-eqz v18, :cond_2

    .line 185
    .line 186
    const v3, 0x7f0a033c

    .line 187
    .line 188
    .line 189
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    move-object/from16 v19, v5

    .line 194
    .line 195
    check-cast v19, Landroid/widget/TextView;

    .line 196
    .line 197
    if-eqz v19, :cond_2

    .line 198
    .line 199
    const v3, 0x7f0a033d

    .line 200
    .line 201
    .line 202
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    move-object/from16 v20, v5

    .line 207
    .line 208
    check-cast v20, Landroid/widget/LinearLayout;

    .line 209
    .line 210
    if-eqz v20, :cond_2

    .line 211
    .line 212
    const v3, 0x7f0a033e

    .line 213
    .line 214
    .line 215
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    check-cast v5, Landroid/widget/LinearLayout;

    .line 220
    .line 221
    if-eqz v5, :cond_2

    .line 222
    .line 223
    const v3, 0x7f0a033f

    .line 224
    .line 225
    .line 226
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 227
    .line 228
    .line 229
    move-result-object v5

    .line 230
    move-object/from16 v21, v5

    .line 231
    .line 232
    check-cast v21, Landroid/widget/LinearLayout;

    .line 233
    .line 234
    if-eqz v21, :cond_2

    .line 235
    .line 236
    const v3, 0x7f0a0340

    .line 237
    .line 238
    .line 239
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 240
    .line 241
    .line 242
    move-result-object v5

    .line 243
    move-object/from16 v22, v5

    .line 244
    .line 245
    check-cast v22, Landroid/widget/LinearLayout;

    .line 246
    .line 247
    if-eqz v22, :cond_2

    .line 248
    .line 249
    const v3, 0x7f0a0404

    .line 250
    .line 251
    .line 252
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 253
    .line 254
    .line 255
    move-result-object v5

    .line 256
    move-object/from16 v23, v5

    .line 257
    .line 258
    check-cast v23, Landroid/widget/TextView;

    .line 259
    .line 260
    if-eqz v23, :cond_2

    .line 261
    .line 262
    const v3, 0x7f0a0406

    .line 263
    .line 264
    .line 265
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    move-object/from16 v24, v5

    .line 270
    .line 271
    check-cast v24, Landroidx/recyclerview/widget/RecyclerView;

    .line 272
    .line 273
    if-eqz v24, :cond_2

    .line 274
    .line 275
    const v3, 0x7f0a04a3

    .line 276
    .line 277
    .line 278
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 279
    .line 280
    .line 281
    move-result-object v5

    .line 282
    move-object/from16 v25, v5

    .line 283
    .line 284
    check-cast v25, Landroid/widget/LinearLayout;

    .line 285
    .line 286
    if-eqz v25, :cond_2

    .line 287
    .line 288
    const v3, 0x7f0a04a4

    .line 289
    .line 290
    .line 291
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 292
    .line 293
    .line 294
    move-result-object v5

    .line 295
    move-object/from16 v26, v5

    .line 296
    .line 297
    check-cast v26, Landroid/widget/TextView;

    .line 298
    .line 299
    if-eqz v26, :cond_2

    .line 300
    .line 301
    const v3, 0x7f0a04c2

    .line 302
    .line 303
    .line 304
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 305
    .line 306
    .line 307
    move-result-object v5

    .line 308
    move-object/from16 v27, v5

    .line 309
    .line 310
    check-cast v27, Landroidx/recyclerview/widget/RecyclerView;

    .line 311
    .line 312
    if-eqz v27, :cond_2

    .line 313
    .line 314
    const v3, 0x7f0a05dc

    .line 315
    .line 316
    .line 317
    invoke-static {v1, v3}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    move-object/from16 v28, v5

    .line 322
    .line 323
    check-cast v28, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 324
    .line 325
    if-eqz v28, :cond_2

    .line 326
    .line 327
    new-instance v5, Ldefpackage/xc1;

    .line 328
    .line 329
    move-object v6, v1

    .line 330
    check-cast v6, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 331
    .line 332
    invoke-direct/range {v5 .. v28}, Ldefpackage/xc1;-><init>(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V

    .line 333
    .line 334
    .line 335
    iput-object v5, v0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 336
    .line 337
    invoke-virtual {v0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    invoke-virtual {v1}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    invoke-static {v1}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 346
    .line 347
    .line 348
    move-result-object v5

    .line 349
    invoke-static {v1, v5}, Ldefpackage/b11;->e(Ldefpackage/nc1;Ldefpackage/b75;)Ldefpackage/tf0;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    new-instance v7, Ldefpackage/bq4;

    .line 354
    .line 355
    invoke-direct {v7, v3, v5, v1}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 356
    .line 357
    .line 358
    const-class v1, Ldefpackage/n92;

    .line 359
    .line 360
    invoke-static {v1}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    invoke-virtual {v1}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    const-string v5, "Local and anonymous classes can not be ViewModels"

    .line 369
    .line 370
    if-eqz v3, :cond_1

    .line 371
    .line 372
    const-string v8, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 373
    .line 374
    invoke-virtual {v8, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v3

    .line 378
    invoke-virtual {v7, v1, v3}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    check-cast v1, Ldefpackage/n92;

    .line 383
    .line 384
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->o0:Ldefpackage/n92;

    .line 385
    .line 386
    invoke-virtual {v0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    invoke-virtual {v1}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    invoke-static {v1}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 395
    .line 396
    .line 397
    move-result-object v7

    .line 398
    invoke-static {v1, v7}, Ldefpackage/b11;->e(Ldefpackage/nc1;Ldefpackage/b75;)Ldefpackage/tf0;

    .line 399
    .line 400
    .line 401
    move-result-object v1

    .line 402
    new-instance v9, Ldefpackage/bq4;

    .line 403
    .line 404
    invoke-direct {v9, v3, v7, v1}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 405
    .line 406
    .line 407
    const-class v1, Ldefpackage/vf2;

    .line 408
    .line 409
    invoke-static {v1}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    invoke-virtual {v1}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    if-eqz v3, :cond_0

    .line 418
    .line 419
    invoke-virtual {v8, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 420
    .line 421
    .line 422
    move-result-object v3

    .line 423
    invoke-virtual {v9, v1, v3}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 424
    .line 425
    .line 426
    move-result-object v1

    .line 427
    check-cast v1, Ldefpackage/vf2;

    .line 428
    .line 429
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->p0:Ldefpackage/vf2;

    .line 430
    .line 431
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->o0:Ldefpackage/n92;

    .line 432
    .line 433
    invoke-virtual {v1}, Ldefpackage/n92;->c()Z

    .line 434
    .line 435
    .line 436
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 437
    .line 438
    iget-object v1, v1, Ldefpackage/xc1;->o:Landroid/widget/LinearLayout;

    .line 439
    .line 440
    sget-object v3, Ldefpackage/wn1;->a:Ldefpackage/k03;

    .line 441
    .line 442
    new-instance v3, Ldefpackage/tn1;

    .line 443
    .line 444
    invoke-direct {v3, v0, v2}, Ldefpackage/tn1;-><init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 448
    .line 449
    .line 450
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 451
    .line 452
    iget-object v1, v1, Ldefpackage/xc1;->r:Landroid/widget/TextView;

    .line 453
    .line 454
    new-instance v3, Ldefpackage/tn1;

    .line 455
    .line 456
    const/16 v4, 0x9

    .line 457
    .line 458
    invoke-direct {v3, v0, v4}, Ldefpackage/tn1;-><init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 462
    .line 463
    .line 464
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 465
    .line 466
    iget-object v1, v1, Ldefpackage/xc1;->c:Landroid/widget/TextView;

    .line 467
    .line 468
    new-instance v3, Ldefpackage/tn1;

    .line 469
    .line 470
    const/4 v4, 0x3

    .line 471
    invoke-direct {v3, v0, v4}, Ldefpackage/tn1;-><init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 475
    .line 476
    .line 477
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 478
    .line 479
    iget-object v1, v1, Ldefpackage/xc1;->f:Landroid/widget/TextView;

    .line 480
    .line 481
    new-instance v3, Ldefpackage/tn1;

    .line 482
    .line 483
    const/4 v5, 0x4

    .line 484
    invoke-direct {v3, v0, v5}, Ldefpackage/tn1;-><init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 488
    .line 489
    .line 490
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 491
    .line 492
    iget-object v1, v1, Ldefpackage/xc1;->i:Landroid/widget/TextView;

    .line 493
    .line 494
    new-instance v3, Ldefpackage/tn1;

    .line 495
    .line 496
    const/4 v5, 0x5

    .line 497
    invoke-direct {v3, v0, v5}, Ldefpackage/tn1;-><init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V

    .line 498
    .line 499
    .line 500
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 501
    .line 502
    .line 503
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 504
    .line 505
    iget-object v1, v1, Ldefpackage/xc1;->t:Landroid/widget/TextView;

    .line 506
    .line 507
    new-instance v3, Ldefpackage/tn1;

    .line 508
    .line 509
    const/4 v5, 0x6

    .line 510
    invoke-direct {v3, v0, v5}, Ldefpackage/tn1;-><init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 514
    .line 515
    .line 516
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 517
    .line 518
    iget-object v1, v1, Ldefpackage/xc1;->b:Landroid/widget/LinearLayout;

    .line 519
    .line 520
    new-instance v3, Ldefpackage/k92;

    .line 521
    .line 522
    const/4 v5, 0x1

    .line 523
    invoke-direct {v3, v0, v5}, Ldefpackage/k92;-><init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 527
    .line 528
    .line 529
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 530
    .line 531
    iget-object v1, v1, Ldefpackage/xc1;->b:Landroid/widget/LinearLayout;

    .line 532
    .line 533
    new-instance v3, Ldefpackage/tn1;

    .line 534
    .line 535
    const/4 v7, 0x7

    .line 536
    invoke-direct {v3, v0, v7}, Ldefpackage/tn1;-><init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 540
    .line 541
    .line 542
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 543
    .line 544
    iget-object v1, v1, Ldefpackage/xc1;->e:Landroid/widget/LinearLayout;

    .line 545
    .line 546
    new-instance v3, Ldefpackage/k92;

    .line 547
    .line 548
    const/4 v7, 0x2

    .line 549
    invoke-direct {v3, v0, v7}, Ldefpackage/k92;-><init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 553
    .line 554
    .line 555
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 556
    .line 557
    iget-object v1, v1, Ldefpackage/xc1;->e:Landroid/widget/LinearLayout;

    .line 558
    .line 559
    new-instance v3, Ldefpackage/tn1;

    .line 560
    .line 561
    const/16 v8, 0x8

    .line 562
    .line 563
    invoke-direct {v3, v0, v8}, Ldefpackage/tn1;-><init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 567
    .line 568
    .line 569
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 570
    .line 571
    iget-object v1, v1, Ldefpackage/xc1;->h:Landroid/widget/LinearLayout;

    .line 572
    .line 573
    new-instance v3, Ldefpackage/k92;

    .line 574
    .line 575
    invoke-direct {v3, v0, v4}, Ldefpackage/k92;-><init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V

    .line 576
    .line 577
    .line 578
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 579
    .line 580
    .line 581
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 582
    .line 583
    iget-object v1, v1, Ldefpackage/xc1;->h:Landroid/widget/LinearLayout;

    .line 584
    .line 585
    new-instance v3, Ldefpackage/tn1;

    .line 586
    .line 587
    invoke-direct {v3, v0, v5}, Ldefpackage/tn1;-><init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 591
    .line 592
    .line 593
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 594
    .line 595
    iget-object v1, v1, Ldefpackage/xc1;->s:Landroid/widget/LinearLayout;

    .line 596
    .line 597
    new-instance v3, Ldefpackage/k92;

    .line 598
    .line 599
    invoke-direct {v3, v0, v2}, Ldefpackage/k92;-><init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 603
    .line 604
    .line 605
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 606
    .line 607
    iget-object v1, v1, Ldefpackage/xc1;->s:Landroid/widget/LinearLayout;

    .line 608
    .line 609
    new-instance v2, Ldefpackage/tn1;

    .line 610
    .line 611
    invoke-direct {v2, v0, v7}, Ldefpackage/tn1;-><init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 615
    .line 616
    .line 617
    return-object v6

    .line 618
    :cond_0
    invoke-static {v5}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    return-object v4

    .line 622
    :cond_1
    invoke-static {v5}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 623
    .line 624
    .line 625
    return-object v4

    .line 626
    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    const-string v1, "Missing required view with ID: "

    .line 635
    .line 636
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 637
    .line 638
    .line 639
    move-result-object v0

    .line 640
    invoke-static {v0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 641
    .line 642
    .line 643
    return-object v4
.end method

.method public final J()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 6
    .line 7
    return-void
.end method

.method public final P()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Ldefpackage/l92;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v1, p0, v2}, Ldefpackage/l92;-><init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V

    .line 13
    .line 14
    .line 15
    const-wide/16 v2, 0x64

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 21
    .line 22
    iget-object p0, p0, Ldefpackage/xc1;->n:Landroid/widget/TextView;

    .line 23
    .line 24
    new-instance v0, Ldefpackage/d7;

    .line 25
    .line 26
    const/4 v1, 0x4

    .line 27
    invoke-direct {v0, v1, p0}, Ldefpackage/d7;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Ldefpackage/wn1;->a(Ljava/util/function/Consumer;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final R()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->J()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final T(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 9

    .line 1
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 2
    .line 3
    iget-object p1, p1, Ldefpackage/xc1;->a:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 4
    .line 5
    const p2, 0x7f0a061b

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 13
    .line 14
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->u0:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 15
    .line 16
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 17
    .line 18
    invoke-virtual {p2, p1}, Ldefpackage/df;->o(Landroidx/appcompat/widget/Toolbar;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->n0:Ldefpackage/om1;

    .line 22
    .line 23
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 24
    .line 25
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->u0:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 26
    .line 27
    invoke-virtual {p1, p2, v0}, Ldefpackage/om1;->n(Ldefpackage/df;Lcom/google/android/material/appbar/MaterialToolbar;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->u0:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getOverflowIcon()Landroid/graphics/drawable/Drawable;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    const v0, 0x7f06036c

    .line 48
    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-virtual {p2, v0, v1}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    invoke-virtual {p1, p2}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 59
    .line 60
    iget-object p1, p1, Ldefpackage/xc1;->p:Landroid/widget/LinearLayout;

    .line 61
    .line 62
    const/16 p2, 0x8

    .line 63
    .line 64
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 68
    .line 69
    iget-object p1, p1, Ldefpackage/xc1;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 70
    .line 71
    new-instance p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 72
    .line 73
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    const/4 v0, 0x0

    .line 77
    invoke-direct {p2, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 84
    .line 85
    iget-object p1, p1, Ldefpackage/xc1;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 86
    .line 87
    const/4 p2, 0x1

    .line 88
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 89
    .line 90
    .line 91
    new-instance p1, Ldefpackage/s6;

    .line 92
    .line 93
    invoke-direct {p1, p0}, Ldefpackage/s6;-><init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;)V

    .line 94
    .line 95
    .line 96
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->q0:Ldefpackage/s6;

    .line 97
    .line 98
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 99
    .line 100
    iget-object v2, v2, Ldefpackage/xc1;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 101
    .line 102
    invoke-virtual {v2, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldefpackage/dw3;)V

    .line 103
    .line 104
    .line 105
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->o0:Ldefpackage/n92;

    .line 106
    .line 107
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    iget-object v3, p1, Ldefpackage/n92;->j:Ldefpackage/k03;

    .line 112
    .line 113
    invoke-virtual {v3}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    const/16 v5, 0xa

    .line 118
    .line 119
    if-nez v4, :cond_0

    .line 120
    .line 121
    iget-object v4, p1, Ldefpackage/n92;->d:Ldefpackage/rv2;

    .line 122
    .line 123
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    const-string v4, "random"

    .line 127
    .line 128
    invoke-static {v4, v5, v1, v1}, Ldefpackage/rv2;->m(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)Ldefpackage/k03;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    iget v4, p1, Ldefpackage/n92;->n:I

    .line 133
    .line 134
    new-instance v6, Ldefpackage/mp1;

    .line 135
    .line 136
    invoke-direct {v6, p1, v4, v3, p2}, Ldefpackage/mp1;-><init>(Ldefpackage/hd;ILdefpackage/k03;I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v2, v6}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 140
    .line 141
    .line 142
    :cond_0
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    new-instance v1, Ldefpackage/j92;

    .line 147
    .line 148
    const/4 v2, 0x4

    .line 149
    invoke-direct {v1, p0, v2}, Ldefpackage/j92;-><init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3, p1, v1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 153
    .line 154
    .line 155
    new-instance p1, Ldefpackage/xg0;

    .line 156
    .line 157
    invoke-direct {p1, v0}, Ldefpackage/xg0;-><init>(I)V

    .line 158
    .line 159
    .line 160
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 161
    .line 162
    iget-object v1, v1, Ldefpackage/xc1;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 163
    .line 164
    invoke-virtual {p1, v1}, Ldefpackage/xg0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 165
    .line 166
    .line 167
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 168
    .line 169
    iget-object p1, p1, Ldefpackage/xc1;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 170
    .line 171
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 172
    .line 173
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 174
    .line 175
    .line 176
    invoke-direct {v1, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 180
    .line 181
    .line 182
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 183
    .line 184
    iget-object p1, p1, Ldefpackage/xc1;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 185
    .line 186
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 187
    .line 188
    .line 189
    new-instance p1, Ldefpackage/vi;

    .line 190
    .line 191
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 192
    .line 193
    invoke-direct {p1, p0, v1, v1}, Ldefpackage/vi;-><init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 194
    .line 195
    .line 196
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->r0:Ldefpackage/vi;

    .line 197
    .line 198
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 199
    .line 200
    iget-object v1, v1, Ldefpackage/xc1;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 201
    .line 202
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldefpackage/dw3;)V

    .line 203
    .line 204
    .line 205
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->o0:Ldefpackage/n92;

    .line 206
    .line 207
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 208
    .line 209
    .line 210
    move-result-object v1

    .line 211
    iget-object v2, p1, Ldefpackage/n92;->k:Ldefpackage/k03;

    .line 212
    .line 213
    invoke-virtual {v2}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v3

    .line 217
    const/4 v4, 0x3

    .line 218
    if-nez v3, :cond_1

    .line 219
    .line 220
    iget-object v3, p1, Ldefpackage/n92;->e:Ldefpackage/pa;

    .line 221
    .line 222
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    new-instance v6, Ldefpackage/k03;

    .line 226
    .line 227
    invoke-direct {v6}, Ldefpackage/ad2;-><init>()V

    .line 228
    .line 229
    .line 230
    invoke-static {v0}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 231
    .line 232
    .line 233
    move-result-object v7

    .line 234
    invoke-virtual {v7}, Ldefpackage/pn4;->c()Ldefpackage/gp3;

    .line 235
    .line 236
    .line 237
    move-result-object v7

    .line 238
    invoke-virtual {v7}, Ldefpackage/gp3;->j()Lretrofit2/Call;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    new-instance v8, Ldefpackage/qr2;

    .line 243
    .line 244
    invoke-direct {v8, v4, v3, v6}, Ldefpackage/qr2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    invoke-interface {v7, v8}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 248
    .line 249
    .line 250
    iget v3, p1, Ldefpackage/n92;->n:I

    .line 251
    .line 252
    new-instance v7, Ldefpackage/mp1;

    .line 253
    .line 254
    invoke-direct {v7, p1, v3, v2, p2}, Ldefpackage/mp1;-><init>(Ldefpackage/hd;ILdefpackage/k03;I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v6, v1, v7}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 258
    .line 259
    .line 260
    :cond_1
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    new-instance v1, Ldefpackage/j92;

    .line 265
    .line 266
    invoke-direct {v1, p0, v4}, Ldefpackage/j92;-><init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v2, p1, v1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 270
    .line 271
    .line 272
    new-instance p1, Ldefpackage/xg0;

    .line 273
    .line 274
    invoke-direct {p1, v0}, Ldefpackage/xg0;-><init>(I)V

    .line 275
    .line 276
    .line 277
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 278
    .line 279
    iget-object v1, v1, Ldefpackage/xc1;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 280
    .line 281
    invoke-virtual {p1, v1}, Ldefpackage/xg0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 282
    .line 283
    .line 284
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 285
    .line 286
    iget-object p1, p1, Ldefpackage/xc1;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 287
    .line 288
    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 289
    .line 290
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 291
    .line 292
    .line 293
    invoke-direct {v1, v4, v0}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(II)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 297
    .line 298
    .line 299
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 300
    .line 301
    iget-object p1, p1, Ldefpackage/xc1;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 302
    .line 303
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 304
    .line 305
    .line 306
    new-instance p1, Ldefpackage/zd0;

    .line 307
    .line 308
    invoke-direct {p1, p0}, Ldefpackage/zd0;-><init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;)V

    .line 309
    .line 310
    .line 311
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->s0:Ldefpackage/zd0;

    .line 312
    .line 313
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 314
    .line 315
    iget-object v1, v1, Ldefpackage/xc1;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 316
    .line 317
    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldefpackage/dw3;)V

    .line 318
    .line 319
    .line 320
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->o0:Ldefpackage/n92;

    .line 321
    .line 322
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    iget-object v2, p1, Ldefpackage/n92;->l:Ldefpackage/k03;

    .line 327
    .line 328
    invoke-virtual {v2}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    if-nez v3, :cond_2

    .line 333
    .line 334
    iget-object p1, p1, Ldefpackage/n92;->f:Ldefpackage/y41;

    .line 335
    .line 336
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    const/16 p1, 0xf

    .line 340
    .line 341
    invoke-static {p1, p2}, Ldefpackage/y41;->j(IZ)Ldefpackage/k03;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    new-instance v3, Ldefpackage/g7;

    .line 346
    .line 347
    invoke-direct {v3, v2, v0}, Ldefpackage/g7;-><init>(Ldefpackage/k03;I)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {p1, v1, v3}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 351
    .line 352
    .line 353
    :cond_2
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 354
    .line 355
    .line 356
    move-result-object p1

    .line 357
    new-instance v1, Ldefpackage/j92;

    .line 358
    .line 359
    invoke-direct {v1, p0, p2}, Ldefpackage/j92;-><init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2, p1, v1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 363
    .line 364
    .line 365
    new-instance p1, Ldefpackage/xg0;

    .line 366
    .line 367
    invoke-direct {p1, v0}, Ldefpackage/xg0;-><init>(I)V

    .line 368
    .line 369
    .line 370
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 371
    .line 372
    iget-object v1, v1, Ldefpackage/xc1;->j:Landroidx/recyclerview/widget/RecyclerView;

    .line 373
    .line 374
    invoke-virtual {p1, v1}, Ldefpackage/xg0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 375
    .line 376
    .line 377
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 378
    .line 379
    iget-object p1, p1, Ldefpackage/xc1;->u:Landroidx/recyclerview/widget/RecyclerView;

    .line 380
    .line 381
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 382
    .line 383
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 384
    .line 385
    .line 386
    invoke-direct {v1, v0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 404
    .line 405
    const/high16 v2, 0x41800000    # 16.0f

    .line 406
    .line 407
    mul-float/2addr v2, v1

    .line 408
    float-to-int v1, v2

    .line 409
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 410
    .line 411
    .line 412
    move-result v2

    .line 413
    invoke-virtual {p1}, Landroid/view/View;->getPaddingEnd()I

    .line 414
    .line 415
    .line 416
    move-result v3

    .line 417
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 418
    .line 419
    .line 420
    move-result v4

    .line 421
    invoke-virtual {p1, v1, v2, v3, v4}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 422
    .line 423
    .line 424
    new-instance v1, Ldefpackage/q7;

    .line 425
    .line 426
    invoke-direct {v1, p0, v0}, Ldefpackage/q7;-><init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;Z)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldefpackage/dw3;)V

    .line 430
    .line 431
    .line 432
    new-instance v2, Ldefpackage/xg0;

    .line 433
    .line 434
    invoke-direct {v2, v0}, Ldefpackage/xg0;-><init>(I)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v2, p1}, Ldefpackage/xg0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 438
    .line 439
    .line 440
    iput-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->t0:Ldefpackage/q7;

    .line 441
    .line 442
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->o0:Ldefpackage/n92;

    .line 443
    .line 444
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 445
    .line 446
    .line 447
    move-result-object v1

    .line 448
    iget-object v2, p1, Ldefpackage/n92;->i:Ldefpackage/k03;

    .line 449
    .line 450
    invoke-virtual {v2}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v3

    .line 454
    if-nez v3, :cond_3

    .line 455
    .line 456
    iget-object p1, p1, Ldefpackage/n92;->g:Ldefpackage/mm3;

    .line 457
    .line 458
    invoke-virtual {p1, v5, p2}, Ldefpackage/mm3;->d(IZ)Ldefpackage/k03;

    .line 459
    .line 460
    .line 461
    move-result-object p1

    .line 462
    new-instance p2, Ldefpackage/g7;

    .line 463
    .line 464
    invoke-direct {p2, v2, v0}, Ldefpackage/g7;-><init>(Ldefpackage/k03;I)V

    .line 465
    .line 466
    .line 467
    invoke-virtual {p1, v1, p2}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 468
    .line 469
    .line 470
    :cond_3
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 471
    .line 472
    .line 473
    move-result-object p1

    .line 474
    new-instance p2, Ldefpackage/j92;

    .line 475
    .line 476
    invoke-direct {p2, p0, v0}, Ldefpackage/j92;-><init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v2, p1, p2}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 480
    .line 481
    .line 482
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->l0:Ldefpackage/xc1;

    .line 483
    .line 484
    iget-object p1, p1, Ldefpackage/xc1;->v:Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    .line 485
    .line 486
    new-instance p2, Ldefpackage/cn;

    .line 487
    .line 488
    const/16 v0, 0x14

    .line 489
    .line 490
    invoke-direct {p2, v0, p0}, Ldefpackage/cn;-><init>(ILjava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    invoke-virtual {p1, p2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setOnRefreshListener(Ldefpackage/np4;)V

    .line 494
    .line 495
    .line 496
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->p0:Ldefpackage/vf2;

    .line 497
    .line 498
    iget-object p1, p1, Ldefpackage/vf2;->d:Ldefpackage/k03;

    .line 499
    .line 500
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 501
    .line 502
    .line 503
    move-result-object p2

    .line 504
    new-instance v0, Ldefpackage/j92;

    .line 505
    .line 506
    const/4 v1, 0x2

    .line 507
    invoke-direct {v0, p0, v1}, Ldefpackage/j92;-><init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {p1, p2, v0}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 511
    .line 512
    .line 513
    return-void
.end method

.method public final h0(Lcom/eddyizm/tempus/subsonic/models/MusicFolder;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;->getName()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p1, v0

    .line 10
    :goto_0
    new-instance v1, Ldefpackage/l92;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v1, p0, v2}, Ldefpackage/l92;-><init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V

    .line 14
    .line 15
    .line 16
    new-instance v2, Ldefpackage/l92;

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    invoke-direct {v2, p0, v3}, Ldefpackage/l92;-><init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V

    .line 20
    .line 21
    .line 22
    sget-object v3, Ldefpackage/wn1;->a:Ldefpackage/k03;

    .line 23
    .line 24
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    invoke-static {p1}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-nez v4, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move-object p1, v0

    .line 38
    :goto_1
    if-nez p1, :cond_3

    .line 39
    .line 40
    :cond_2
    const p1, 0x7f1302f2

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    :cond_3
    new-instance v4, Ldefpackage/vg2;

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    invoke-direct {v4, v3, v5}, Ldefpackage/vg2;-><init>(Landroid/content/Context;I)V

    .line 54
    .line 55
    .line 56
    const v6, 0x7f1301ab

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, v6}, Ldefpackage/vg2;->p(I)V

    .line 60
    .line 61
    .line 62
    const-string v6, "\u00ab"

    .line 63
    .line 64
    const-string v7, "\u00bb"

    .line 65
    .line 66
    invoke-static {v6, p1, v7}, Ldefpackage/xa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const v6, 0x7f1301aa

    .line 75
    .line 76
    .line 77
    invoke-virtual {v3, v6, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iget-object v3, v4, Ldefpackage/e9;->a:Ldefpackage/a9;

    .line 82
    .line 83
    iput-object p1, v3, Ldefpackage/a9;->f:Ljava/lang/CharSequence;

    .line 84
    .line 85
    new-instance p1, Ldefpackage/rn1;

    .line 86
    .line 87
    invoke-direct {p1, v1, p0, v2, v5}, Ldefpackage/rn1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 88
    .line 89
    .line 90
    const p0, 0x7f1301a9

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, p0, p1}, Ldefpackage/vg2;->l(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/vg2;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    const p1, 0x7f13019f

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, p1, v0}, Ldefpackage/vg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/vg2;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {p0}, Ldefpackage/e9;->h()Ldefpackage/f9;

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final onAlbumClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Ldefpackage/gb;->x(Landroid/view/View;)Ldefpackage/v23;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a009f

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, p1, v1}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onAlbumLongClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Ldefpackage/gb;->x(Landroid/view/View;)Ldefpackage/v23;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a009b

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, p1, v1}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onArtistClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Ldefpackage/gb;->x(Landroid/view/View;)Ldefpackage/v23;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a00e2

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, p1, v1}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onArtistLongClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Ldefpackage/gb;->x(Landroid/view/View;)Ldefpackage/v23;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a00df

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, p1, v1}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onGenreClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Ldefpackage/gb;->x(Landroid/view/View;)Ldefpackage/v23;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a0596

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, p1, v1}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onMusicFolderClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Ldefpackage/gb;->x(Landroid/view/View;)Ldefpackage/v23;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a0307

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, p1, v1}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onMusicFolderLongClick(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "MUSIC_FOLDER_OBJECT"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->h0(Lcom/eddyizm/tempus/subsonic/models/MusicFolder;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final onPlaylistClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Ldefpackage/gb;->x(Landroid/view/View;)Ldefpackage/v23;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a04a0

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, p1, v1}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onPlaylistLongClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Ldefpackage/gb;->x(Landroid/view/View;)Ldefpackage/v23;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a04a1

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, p1, v1}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
