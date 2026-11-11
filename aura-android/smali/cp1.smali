.class public Lcp1;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ClickCallback;


# instance fields
.field public A0:Ls6;

.field public B0:Lb8;

.field public C0:Luc4;

.field public D0:Lej;

.field public E0:Luc4;

.field public F0:Lbl2;

.field public G0:Lzd0;

.field public H0:Landroid/view/View;

.field public I0:Z

.field public l0:Ltc1;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Lcom/eddyizm/tempus/viewmodel/b;

.field public o0:Lvf2;

.field public p0:Lli3;

.field public q0:Lvq0;

.field public r0:Ls6;

.field public s0:Lvi;

.field public t0:Lvi;

.field public u0:Lni4;

.field public v0:Lni4;

.field public w0:Ls6;

.field public x0:Lb8;

.field public y0:Ls6;

.field public z0:Ls6;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lkc1;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcp1;->H0:Landroid/view/View;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcp1;->I0:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 76

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lkc1;->l()Lnc1;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 8
    .line 9
    iput-object v1, v0, Lcp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 10
    .line 11
    const v1, 0x7f0d0070

    .line 12
    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    move-object/from16 v3, p1

    .line 16
    .line 17
    move-object/from16 v4, p2

    .line 18
    .line 19
    invoke-virtual {v3, v1, v4, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const v3, 0x7f0a0097

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    const/4 v4, 0x0

    .line 31
    if-eqz v6, :cond_4

    .line 32
    .line 33
    const v3, 0x7f0a0098

    .line 34
    .line 35
    .line 36
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    if-eqz v7, :cond_4

    .line 41
    .line 42
    const v3, 0x7f0a0099

    .line 43
    .line 44
    .line 45
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    if-eqz v8, :cond_4

    .line 50
    .line 51
    const v3, 0x7f0a010f

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    move-object v9, v5

    .line 59
    check-cast v9, Landroidx/recyclerview/widget/RecyclerView;

    .line 60
    .line 61
    if-eqz v9, :cond_4

    .line 62
    .line 63
    const v3, 0x7f0a0110

    .line 64
    .line 65
    .line 66
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    move-object v10, v5

    .line 71
    check-cast v10, Landroid/widget/TextView;

    .line 72
    .line 73
    if-eqz v10, :cond_4

    .line 74
    .line 75
    const v3, 0x7f0a0170

    .line 76
    .line 77
    .line 78
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    move-object v11, v5

    .line 83
    check-cast v11, Landroidx/recyclerview/widget/RecyclerView;

    .line 84
    .line 85
    if-eqz v11, :cond_4

    .line 86
    .line 87
    const v3, 0x7f0a01bb

    .line 88
    .line 89
    .line 90
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    move-object v12, v5

    .line 95
    check-cast v12, Landroidx/recyclerview/widget/RecyclerView;

    .line 96
    .line 97
    if-eqz v12, :cond_4

    .line 98
    .line 99
    const v3, 0x7f0a01bc

    .line 100
    .line 101
    .line 102
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    move-object v13, v5

    .line 107
    check-cast v13, Landroid/widget/TextView;

    .line 108
    .line 109
    if-eqz v13, :cond_4

    .line 110
    .line 111
    const v3, 0x7f0a01bd

    .line 112
    .line 113
    .line 114
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    move-object v14, v5

    .line 119
    check-cast v14, Landroid/widget/TextView;

    .line 120
    .line 121
    if-eqz v14, :cond_4

    .line 122
    .line 123
    move-object v5, v1

    .line 124
    check-cast v5, Landroidx/core/widget/NestedScrollView;

    .line 125
    .line 126
    const v3, 0x7f0a027f

    .line 127
    .line 128
    .line 129
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 130
    .line 131
    .line 132
    move-result-object v15

    .line 133
    check-cast v15, Landroid/widget/TextView;

    .line 134
    .line 135
    if-eqz v15, :cond_4

    .line 136
    .line 137
    const v3, 0x7f0a0280

    .line 138
    .line 139
    .line 140
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 141
    .line 142
    .line 143
    move-result-object v16

    .line 144
    check-cast v16, Landroid/widget/TextView;

    .line 145
    .line 146
    if-eqz v16, :cond_4

    .line 147
    .line 148
    const v3, 0x7f0a02b1

    .line 149
    .line 150
    .line 151
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 152
    .line 153
    .line 154
    move-result-object v16

    .line 155
    check-cast v16, Landroid/widget/LinearLayout;

    .line 156
    .line 157
    if-eqz v16, :cond_4

    .line 158
    .line 159
    const v3, 0x7f0a02b2

    .line 160
    .line 161
    .line 162
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 163
    .line 164
    .line 165
    move-result-object v17

    .line 166
    check-cast v17, Landroid/widget/LinearLayout;

    .line 167
    .line 168
    if-eqz v17, :cond_4

    .line 169
    .line 170
    const v3, 0x7f0a02b3

    .line 171
    .line 172
    .line 173
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 174
    .line 175
    .line 176
    move-result-object v18

    .line 177
    check-cast v18, Landroid/widget/LinearLayout;

    .line 178
    .line 179
    if-eqz v18, :cond_4

    .line 180
    .line 181
    const v3, 0x7f0a02b4

    .line 182
    .line 183
    .line 184
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 185
    .line 186
    .line 187
    move-result-object v19

    .line 188
    check-cast v19, Landroid/widget/LinearLayout;

    .line 189
    .line 190
    if-eqz v19, :cond_4

    .line 191
    .line 192
    const v3, 0x7f0a02b5

    .line 193
    .line 194
    .line 195
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 196
    .line 197
    .line 198
    move-result-object v20

    .line 199
    check-cast v20, Landroid/widget/LinearLayout;

    .line 200
    .line 201
    if-eqz v20, :cond_4

    .line 202
    .line 203
    const v3, 0x7f0a02b6

    .line 204
    .line 205
    .line 206
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 207
    .line 208
    .line 209
    move-result-object v21

    .line 210
    check-cast v21, Landroid/widget/LinearLayout;

    .line 211
    .line 212
    if-eqz v21, :cond_4

    .line 213
    .line 214
    const v3, 0x7f0a02b7

    .line 215
    .line 216
    .line 217
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 218
    .line 219
    .line 220
    move-result-object v22

    .line 221
    check-cast v22, Landroid/widget/LinearLayout;

    .line 222
    .line 223
    if-eqz v22, :cond_4

    .line 224
    .line 225
    const v3, 0x7f0a02b8

    .line 226
    .line 227
    .line 228
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 229
    .line 230
    .line 231
    move-result-object v23

    .line 232
    check-cast v23, Landroid/widget/LinearLayout;

    .line 233
    .line 234
    if-eqz v23, :cond_4

    .line 235
    .line 236
    const v3, 0x7f0a02bc

    .line 237
    .line 238
    .line 239
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 240
    .line 241
    .line 242
    move-result-object v24

    .line 243
    check-cast v24, Landroid/widget/LinearLayout;

    .line 244
    .line 245
    if-eqz v24, :cond_4

    .line 246
    .line 247
    const v3, 0x7f0a02be

    .line 248
    .line 249
    .line 250
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 251
    .line 252
    .line 253
    move-result-object v25

    .line 254
    check-cast v25, Landroid/widget/LinearLayout;

    .line 255
    .line 256
    if-eqz v25, :cond_4

    .line 257
    .line 258
    const v3, 0x7f0a02bf

    .line 259
    .line 260
    .line 261
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 262
    .line 263
    .line 264
    move-result-object v26

    .line 265
    check-cast v26, Landroid/widget/LinearLayout;

    .line 266
    .line 267
    if-eqz v26, :cond_4

    .line 268
    .line 269
    const v3, 0x7f0a02c1

    .line 270
    .line 271
    .line 272
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 273
    .line 274
    .line 275
    move-result-object v27

    .line 276
    check-cast v27, Landroid/widget/Button;

    .line 277
    .line 278
    if-eqz v27, :cond_4

    .line 279
    .line 280
    const v3, 0x7f0a02c4

    .line 281
    .line 282
    .line 283
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 284
    .line 285
    .line 286
    move-result-object v28

    .line 287
    check-cast v28, Landroid/widget/LinearLayout;

    .line 288
    .line 289
    if-eqz v28, :cond_4

    .line 290
    .line 291
    const v3, 0x7f0a02c5

    .line 292
    .line 293
    .line 294
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 295
    .line 296
    .line 297
    move-result-object v29

    .line 298
    check-cast v29, Lcom/google/android/material/button/MaterialButton;

    .line 299
    .line 300
    if-eqz v29, :cond_4

    .line 301
    .line 302
    const v3, 0x7f0a02c6

    .line 303
    .line 304
    .line 305
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 306
    .line 307
    .line 308
    move-result-object v30

    .line 309
    check-cast v30, Lcom/google/android/material/card/MaterialCardView;

    .line 310
    .line 311
    if-eqz v30, :cond_4

    .line 312
    .line 313
    const v3, 0x7f0a02c7

    .line 314
    .line 315
    .line 316
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 317
    .line 318
    .line 319
    move-result-object v31

    .line 320
    check-cast v31, Lcom/google/android/material/button/MaterialButton;

    .line 321
    .line 322
    if-eqz v31, :cond_4

    .line 323
    .line 324
    const v3, 0x7f0a02c8

    .line 325
    .line 326
    .line 327
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 328
    .line 329
    .line 330
    move-result-object v32

    .line 331
    check-cast v32, Landroid/widget/TextView;

    .line 332
    .line 333
    if-eqz v32, :cond_4

    .line 334
    .line 335
    const v3, 0x7f0a02c9

    .line 336
    .line 337
    .line 338
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 339
    .line 340
    .line 341
    move-result-object v32

    .line 342
    check-cast v32, Landroid/widget/TextView;

    .line 343
    .line 344
    if-eqz v32, :cond_4

    .line 345
    .line 346
    const v3, 0x7f0a02ca

    .line 347
    .line 348
    .line 349
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 350
    .line 351
    .line 352
    move-result-object v32

    .line 353
    check-cast v32, Landroid/widget/TextView;

    .line 354
    .line 355
    if-eqz v32, :cond_4

    .line 356
    .line 357
    const v3, 0x7f0a02cb

    .line 358
    .line 359
    .line 360
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 361
    .line 362
    .line 363
    move-result-object v33

    .line 364
    check-cast v33, Lcom/google/android/material/button/MaterialButton;

    .line 365
    .line 366
    if-eqz v33, :cond_4

    .line 367
    .line 368
    const v3, 0x7f0a02cc

    .line 369
    .line 370
    .line 371
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 372
    .line 373
    .line 374
    move-result-object v34

    .line 375
    check-cast v34, Lcom/google/android/material/card/MaterialCardView;

    .line 376
    .line 377
    if-eqz v34, :cond_4

    .line 378
    .line 379
    const v3, 0x7f0a02cd

    .line 380
    .line 381
    .line 382
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 383
    .line 384
    .line 385
    move-result-object v35

    .line 386
    check-cast v35, Lcom/google/android/material/button/MaterialButton;

    .line 387
    .line 388
    if-eqz v35, :cond_4

    .line 389
    .line 390
    const v3, 0x7f0a02ce

    .line 391
    .line 392
    .line 393
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 394
    .line 395
    .line 396
    move-result-object v36

    .line 397
    check-cast v36, Landroid/widget/TextView;

    .line 398
    .line 399
    if-eqz v36, :cond_4

    .line 400
    .line 401
    const v3, 0x7f0a02cf

    .line 402
    .line 403
    .line 404
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 405
    .line 406
    .line 407
    move-result-object v36

    .line 408
    check-cast v36, Landroid/widget/TextView;

    .line 409
    .line 410
    if-eqz v36, :cond_4

    .line 411
    .line 412
    const v3, 0x7f0a02d0

    .line 413
    .line 414
    .line 415
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 416
    .line 417
    .line 418
    move-result-object v36

    .line 419
    check-cast v36, Landroid/widget/TextView;

    .line 420
    .line 421
    if-eqz v36, :cond_4

    .line 422
    .line 423
    const v3, 0x7f0a02d1

    .line 424
    .line 425
    .line 426
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 427
    .line 428
    .line 429
    move-result-object v37

    .line 430
    check-cast v37, Lcom/google/android/material/button/MaterialButton;

    .line 431
    .line 432
    if-eqz v37, :cond_4

    .line 433
    .line 434
    const v3, 0x7f0a02d2

    .line 435
    .line 436
    .line 437
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 438
    .line 439
    .line 440
    move-result-object v38

    .line 441
    check-cast v38, Lcom/google/android/material/card/MaterialCardView;

    .line 442
    .line 443
    if-eqz v38, :cond_4

    .line 444
    .line 445
    const v3, 0x7f0a02d3

    .line 446
    .line 447
    .line 448
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 449
    .line 450
    .line 451
    move-result-object v39

    .line 452
    check-cast v39, Lcom/google/android/material/button/MaterialButton;

    .line 453
    .line 454
    if-eqz v39, :cond_4

    .line 455
    .line 456
    const v3, 0x7f0a02d4

    .line 457
    .line 458
    .line 459
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 460
    .line 461
    .line 462
    move-result-object v40

    .line 463
    check-cast v40, Landroid/widget/TextView;

    .line 464
    .line 465
    if-eqz v40, :cond_4

    .line 466
    .line 467
    const v3, 0x7f0a02d5

    .line 468
    .line 469
    .line 470
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 471
    .line 472
    .line 473
    move-result-object v40

    .line 474
    check-cast v40, Landroid/widget/TextView;

    .line 475
    .line 476
    if-eqz v40, :cond_4

    .line 477
    .line 478
    const v3, 0x7f0a02d6

    .line 479
    .line 480
    .line 481
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 482
    .line 483
    .line 484
    move-result-object v40

    .line 485
    check-cast v40, Landroid/widget/TextView;

    .line 486
    .line 487
    if-eqz v40, :cond_4

    .line 488
    .line 489
    const v3, 0x7f0a03a0

    .line 490
    .line 491
    .line 492
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 493
    .line 494
    .line 495
    move-result-object v41

    .line 496
    check-cast v41, Landroidx/recyclerview/widget/RecyclerView;

    .line 497
    .line 498
    if-eqz v41, :cond_4

    .line 499
    .line 500
    const v3, 0x7f0a03a1

    .line 501
    .line 502
    .line 503
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 504
    .line 505
    .line 506
    move-result-object v42

    .line 507
    check-cast v42, Landroid/widget/TextView;

    .line 508
    .line 509
    if-eqz v42, :cond_4

    .line 510
    .line 511
    const v3, 0x7f0a03a2

    .line 512
    .line 513
    .line 514
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 515
    .line 516
    .line 517
    move-result-object v43

    .line 518
    check-cast v43, Landroid/widget/TextView;

    .line 519
    .line 520
    if-eqz v43, :cond_4

    .line 521
    .line 522
    const v3, 0x7f0a03a3

    .line 523
    .line 524
    .line 525
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 526
    .line 527
    .line 528
    move-result-object v44

    .line 529
    check-cast v44, Landroid/widget/TextView;

    .line 530
    .line 531
    if-eqz v44, :cond_4

    .line 532
    .line 533
    const v3, 0x7f0a041c

    .line 534
    .line 535
    .line 536
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 537
    .line 538
    .line 539
    move-result-object v44

    .line 540
    check-cast v44, Landroidx/recyclerview/widget/RecyclerView;

    .line 541
    .line 542
    if-eqz v44, :cond_4

    .line 543
    .line 544
    const v3, 0x7f0a045a

    .line 545
    .line 546
    .line 547
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 548
    .line 549
    .line 550
    move-result-object v45

    .line 551
    check-cast v45, Landroidx/recyclerview/widget/RecyclerView;

    .line 552
    .line 553
    if-eqz v45, :cond_4

    .line 554
    .line 555
    const v3, 0x7f0a045b

    .line 556
    .line 557
    .line 558
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 559
    .line 560
    .line 561
    move-result-object v46

    .line 562
    check-cast v46, Landroid/widget/LinearLayout;

    .line 563
    .line 564
    if-eqz v46, :cond_4

    .line 565
    .line 566
    const v3, 0x7f0a045c

    .line 567
    .line 568
    .line 569
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 570
    .line 571
    .line 572
    move-result-object v47

    .line 573
    check-cast v47, Landroid/widget/TextView;

    .line 574
    .line 575
    if-eqz v47, :cond_4

    .line 576
    .line 577
    const v3, 0x7f0a04a4

    .line 578
    .line 579
    .line 580
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 581
    .line 582
    .line 583
    move-result-object v47

    .line 584
    check-cast v47, Landroid/widget/TextView;

    .line 585
    .line 586
    if-eqz v47, :cond_4

    .line 587
    .line 588
    const v3, 0x7f0a0504

    .line 589
    .line 590
    .line 591
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 592
    .line 593
    .line 594
    move-result-object v48

    .line 595
    check-cast v48, Landroidx/recyclerview/widget/RecyclerView;

    .line 596
    .line 597
    if-eqz v48, :cond_4

    .line 598
    .line 599
    const v3, 0x7f0a0505

    .line 600
    .line 601
    .line 602
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 603
    .line 604
    .line 605
    move-result-object v49

    .line 606
    check-cast v49, Landroid/widget/TextView;

    .line 607
    .line 608
    if-eqz v49, :cond_4

    .line 609
    .line 610
    const v3, 0x7f0a0510

    .line 611
    .line 612
    .line 613
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 614
    .line 615
    .line 616
    move-result-object v50

    .line 617
    check-cast v50, Landroidx/recyclerview/widget/RecyclerView;

    .line 618
    .line 619
    if-eqz v50, :cond_4

    .line 620
    .line 621
    const v3, 0x7f0a0511

    .line 622
    .line 623
    .line 624
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 625
    .line 626
    .line 627
    move-result-object v51

    .line 628
    check-cast v51, Landroid/widget/TextView;

    .line 629
    .line 630
    if-eqz v51, :cond_4

    .line 631
    .line 632
    const v3, 0x7f0a0512

    .line 633
    .line 634
    .line 635
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 636
    .line 637
    .line 638
    move-result-object v52

    .line 639
    check-cast v52, Landroid/widget/TextView;

    .line 640
    .line 641
    if-eqz v52, :cond_4

    .line 642
    .line 643
    const v3, 0x7f0a0513

    .line 644
    .line 645
    .line 646
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 647
    .line 648
    .line 649
    move-result-object v53

    .line 650
    check-cast v53, Landroidx/recyclerview/widget/RecyclerView;

    .line 651
    .line 652
    if-eqz v53, :cond_4

    .line 653
    .line 654
    const v3, 0x7f0a0514

    .line 655
    .line 656
    .line 657
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 658
    .line 659
    .line 660
    move-result-object v54

    .line 661
    check-cast v54, Landroid/widget/TextView;

    .line 662
    .line 663
    if-eqz v54, :cond_4

    .line 664
    .line 665
    const v3, 0x7f0a0515

    .line 666
    .line 667
    .line 668
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 669
    .line 670
    .line 671
    move-result-object v55

    .line 672
    check-cast v55, Landroid/widget/TextView;

    .line 673
    .line 674
    if-eqz v55, :cond_4

    .line 675
    .line 676
    const v3, 0x7f0a057a

    .line 677
    .line 678
    .line 679
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 680
    .line 681
    .line 682
    move-result-object v56

    .line 683
    check-cast v56, Landroidx/recyclerview/widget/RecyclerView;

    .line 684
    .line 685
    if-eqz v56, :cond_4

    .line 686
    .line 687
    const v3, 0x7f0a057b

    .line 688
    .line 689
    .line 690
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 691
    .line 692
    .line 693
    move-result-object v57

    .line 694
    check-cast v57, Landroid/widget/LinearLayout;

    .line 695
    .line 696
    if-eqz v57, :cond_4

    .line 697
    .line 698
    const v3, 0x7f0a057c

    .line 699
    .line 700
    .line 701
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 702
    .line 703
    .line 704
    move-result-object v58

    .line 705
    check-cast v58, Landroid/widget/TextView;

    .line 706
    .line 707
    if-eqz v58, :cond_4

    .line 708
    .line 709
    const v3, 0x7f0a0585

    .line 710
    .line 711
    .line 712
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 713
    .line 714
    .line 715
    move-result-object v59

    .line 716
    check-cast v59, Landroid/widget/TextView;

    .line 717
    .line 718
    if-eqz v59, :cond_4

    .line 719
    .line 720
    const v3, 0x7f0a0586

    .line 721
    .line 722
    .line 723
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 724
    .line 725
    .line 726
    move-result-object v59

    .line 727
    check-cast v59, Landroidx/recyclerview/widget/RecyclerView;

    .line 728
    .line 729
    if-eqz v59, :cond_4

    .line 730
    .line 731
    const v3, 0x7f0a0587

    .line 732
    .line 733
    .line 734
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 735
    .line 736
    .line 737
    move-result-object v60

    .line 738
    check-cast v60, Landroid/widget/TextView;

    .line 739
    .line 740
    if-eqz v60, :cond_4

    .line 741
    .line 742
    const v3, 0x7f0a05b7

    .line 743
    .line 744
    .line 745
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 746
    .line 747
    .line 748
    move-result-object v61

    .line 749
    check-cast v61, Landroidx/recyclerview/widget/RecyclerView;

    .line 750
    .line 751
    if-eqz v61, :cond_4

    .line 752
    .line 753
    const v3, 0x7f0a05b8

    .line 754
    .line 755
    .line 756
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 757
    .line 758
    .line 759
    move-result-object v62

    .line 760
    check-cast v62, Landroid/widget/LinearLayout;

    .line 761
    .line 762
    if-eqz v62, :cond_4

    .line 763
    .line 764
    const v3, 0x7f0a05b9

    .line 765
    .line 766
    .line 767
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 768
    .line 769
    .line 770
    move-result-object v63

    .line 771
    check-cast v63, Landroid/widget/TextView;

    .line 772
    .line 773
    if-eqz v63, :cond_4

    .line 774
    .line 775
    const v3, 0x7f0a05ba

    .line 776
    .line 777
    .line 778
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 779
    .line 780
    .line 781
    move-result-object v64

    .line 782
    check-cast v64, Landroid/widget/TextView;

    .line 783
    .line 784
    if-eqz v64, :cond_4

    .line 785
    .line 786
    const v3, 0x7f0a05bb

    .line 787
    .line 788
    .line 789
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 790
    .line 791
    .line 792
    move-result-object v65

    .line 793
    check-cast v65, Landroidx/recyclerview/widget/RecyclerView;

    .line 794
    .line 795
    if-eqz v65, :cond_4

    .line 796
    .line 797
    const v3, 0x7f0a05bc

    .line 798
    .line 799
    .line 800
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 801
    .line 802
    .line 803
    move-result-object v66

    .line 804
    check-cast v66, Landroid/widget/LinearLayout;

    .line 805
    .line 806
    if-eqz v66, :cond_4

    .line 807
    .line 808
    const v3, 0x7f0a05bd

    .line 809
    .line 810
    .line 811
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 812
    .line 813
    .line 814
    move-result-object v67

    .line 815
    check-cast v67, Landroid/widget/TextView;

    .line 816
    .line 817
    if-eqz v67, :cond_4

    .line 818
    .line 819
    const v3, 0x7f0a05be

    .line 820
    .line 821
    .line 822
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 823
    .line 824
    .line 825
    move-result-object v68

    .line 826
    check-cast v68, Landroid/widget/TextView;

    .line 827
    .line 828
    if-eqz v68, :cond_4

    .line 829
    .line 830
    const v3, 0x7f0a05bf

    .line 831
    .line 832
    .line 833
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 834
    .line 835
    .line 836
    move-result-object v69

    .line 837
    check-cast v69, Landroidx/recyclerview/widget/RecyclerView;

    .line 838
    .line 839
    if-eqz v69, :cond_4

    .line 840
    .line 841
    const v3, 0x7f0a05c0

    .line 842
    .line 843
    .line 844
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 845
    .line 846
    .line 847
    move-result-object v70

    .line 848
    check-cast v70, Landroid/widget/LinearLayout;

    .line 849
    .line 850
    if-eqz v70, :cond_4

    .line 851
    .line 852
    const v3, 0x7f0a05c1

    .line 853
    .line 854
    .line 855
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 856
    .line 857
    .line 858
    move-result-object v71

    .line 859
    check-cast v71, Landroid/widget/TextView;

    .line 860
    .line 861
    if-eqz v71, :cond_4

    .line 862
    .line 863
    const v3, 0x7f0a05c2

    .line 864
    .line 865
    .line 866
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 867
    .line 868
    .line 869
    move-result-object v72

    .line 870
    check-cast v72, Landroid/widget/TextView;

    .line 871
    .line 872
    if-eqz v72, :cond_4

    .line 873
    .line 874
    const v3, 0x7f0a0623

    .line 875
    .line 876
    .line 877
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 878
    .line 879
    .line 880
    move-result-object v73

    .line 881
    check-cast v73, Landroidx/recyclerview/widget/RecyclerView;

    .line 882
    .line 883
    if-eqz v73, :cond_4

    .line 884
    .line 885
    const v3, 0x7f0a064f

    .line 886
    .line 887
    .line 888
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 889
    .line 890
    .line 891
    move-result-object v74

    .line 892
    check-cast v74, Landroidx/constraintlayout/widget/Guideline;

    .line 893
    .line 894
    if-eqz v74, :cond_4

    .line 895
    .line 896
    const v3, 0x7f0a0650

    .line 897
    .line 898
    .line 899
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 900
    .line 901
    .line 902
    move-result-object v74

    .line 903
    check-cast v74, Landroidx/constraintlayout/widget/Guideline;

    .line 904
    .line 905
    if-eqz v74, :cond_4

    .line 906
    .line 907
    const v3, 0x7f0a0651

    .line 908
    .line 909
    .line 910
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 911
    .line 912
    .line 913
    move-result-object v74

    .line 914
    check-cast v74, Landroidx/constraintlayout/widget/Guideline;

    .line 915
    .line 916
    if-eqz v74, :cond_4

    .line 917
    .line 918
    const v3, 0x7f0a0670

    .line 919
    .line 920
    .line 921
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 922
    .line 923
    .line 924
    move-result-object v74

    .line 925
    check-cast v74, Landroidx/recyclerview/widget/RecyclerView;

    .line 926
    .line 927
    if-eqz v74, :cond_4

    .line 928
    .line 929
    move-object/from16 v75, v4

    .line 930
    .line 931
    new-instance v4, Ltc1;

    .line 932
    .line 933
    move-object/from16 v1, v75

    .line 934
    .line 935
    invoke-direct/range {v4 .. v74}, Ltc1;-><init>(Landroidx/core/widget/NestedScrollView;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/Button;Landroid/widget/LinearLayout;Lcom/google/android/material/button/MaterialButton;Lcom/google/android/material/card/MaterialCardView;Lcom/google/android/material/button/MaterialButton;Landroid/widget/TextView;Lcom/google/android/material/button/MaterialButton;Lcom/google/android/material/card/MaterialCardView;Lcom/google/android/material/button/MaterialButton;Landroid/widget/TextView;Lcom/google/android/material/button/MaterialButton;Lcom/google/android/material/card/MaterialCardView;Lcom/google/android/material/button/MaterialButton;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 936
    .line 937
    .line 938
    iput-object v4, v0, Lcp1;->l0:Ltc1;

    .line 939
    .line 940
    iget-object v3, v0, Lcp1;->l0:Ltc1;

    .line 941
    .line 942
    iget-object v3, v3, Ltc1;->a:Landroidx/core/widget/NestedScrollView;

    .line 943
    .line 944
    invoke-virtual {v0}, Lkc1;->X()Lnc1;

    .line 945
    .line 946
    .line 947
    move-result-object v4

    .line 948
    invoke-virtual {v4}, Ll70;->d()Le75;

    .line 949
    .line 950
    .line 951
    move-result-object v5

    .line 952
    invoke-static {v4}, Lgh0;->r(Lf75;)Lb75;

    .line 953
    .line 954
    .line 955
    move-result-object v6

    .line 956
    invoke-static {v4, v6}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 957
    .line 958
    .line 959
    move-result-object v4

    .line 960
    new-instance v7, Lbq4;

    .line 961
    .line 962
    invoke-direct {v7, v5, v6, v4}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 963
    .line 964
    .line 965
    const-class v4, Lcom/eddyizm/tempus/viewmodel/b;

    .line 966
    .line 967
    invoke-static {v4}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 968
    .line 969
    .line 970
    move-result-object v4

    .line 971
    invoke-virtual {v4}, Li30;->b()Ljava/lang/String;

    .line 972
    .line 973
    .line 974
    move-result-object v5

    .line 975
    const-string v6, "Local and anonymous classes can not be ViewModels"

    .line 976
    .line 977
    if-eqz v5, :cond_3

    .line 978
    .line 979
    const-string v8, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 980
    .line 981
    invoke-virtual {v8, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 982
    .line 983
    .line 984
    move-result-object v5

    .line 985
    invoke-virtual {v7, v4, v5}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 986
    .line 987
    .line 988
    move-result-object v4

    .line 989
    check-cast v4, Lcom/eddyizm/tempus/viewmodel/b;

    .line 990
    .line 991
    iput-object v4, v0, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 992
    .line 993
    invoke-virtual {v0}, Lkc1;->X()Lnc1;

    .line 994
    .line 995
    .line 996
    move-result-object v4

    .line 997
    invoke-virtual {v4}, Ll70;->d()Le75;

    .line 998
    .line 999
    .line 1000
    move-result-object v5

    .line 1001
    invoke-static {v4}, Lgh0;->r(Lf75;)Lb75;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v7

    .line 1005
    invoke-static {v4, v7}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v4

    .line 1009
    new-instance v9, Lbq4;

    .line 1010
    .line 1011
    invoke-direct {v9, v5, v7, v4}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 1012
    .line 1013
    .line 1014
    const-class v4, Lvf2;

    .line 1015
    .line 1016
    invoke-static {v4}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v4

    .line 1020
    invoke-virtual {v4}, Li30;->b()Ljava/lang/String;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v5

    .line 1024
    if-eqz v5, :cond_2

    .line 1025
    .line 1026
    invoke-virtual {v8, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1027
    .line 1028
    .line 1029
    move-result-object v5

    .line 1030
    invoke-virtual {v9, v4, v5}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v4

    .line 1034
    check-cast v4, Lvf2;

    .line 1035
    .line 1036
    iput-object v4, v0, Lcp1;->o0:Lvf2;

    .line 1037
    .line 1038
    invoke-virtual {v0}, Lkc1;->X()Lnc1;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v4

    .line 1042
    invoke-virtual {v4}, Ll70;->d()Le75;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v5

    .line 1046
    invoke-static {v4}, Lgh0;->r(Lf75;)Lb75;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v7

    .line 1050
    invoke-static {v4, v7}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v4

    .line 1054
    new-instance v9, Lbq4;

    .line 1055
    .line 1056
    invoke-direct {v9, v5, v7, v4}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 1057
    .line 1058
    .line 1059
    const-class v4, Lli3;

    .line 1060
    .line 1061
    invoke-static {v4}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v4

    .line 1065
    invoke-virtual {v4}, Li30;->b()Ljava/lang/String;

    .line 1066
    .line 1067
    .line 1068
    move-result-object v5

    .line 1069
    if-eqz v5, :cond_1

    .line 1070
    .line 1071
    invoke-virtual {v8, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v5

    .line 1075
    invoke-virtual {v9, v4, v5}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v4

    .line 1079
    check-cast v4, Lli3;

    .line 1080
    .line 1081
    iput-object v4, v0, Lcp1;->p0:Lli3;

    .line 1082
    .line 1083
    iget-object v4, v0, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 1084
    .line 1085
    invoke-virtual {v4}, Lcom/eddyizm/tempus/viewmodel/b;->e()Z

    .line 1086
    .line 1087
    .line 1088
    iget-object v4, v0, Lcp1;->l0:Ltc1;

    .line 1089
    .line 1090
    iget-object v4, v4, Ltc1;->j:Landroid/widget/TextView;

    .line 1091
    .line 1092
    new-instance v5, Lyo1;

    .line 1093
    .line 1094
    invoke-direct {v5, v0, v2}, Lyo1;-><init>(Lcp1;I)V

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 1098
    .line 1099
    .line 1100
    iget-object v4, v0, Lcp1;->l0:Ltc1;

    .line 1101
    .line 1102
    iget-object v4, v4, Ltc1;->i:Landroid/widget/TextView;

    .line 1103
    .line 1104
    new-instance v5, Lgo1;

    .line 1105
    .line 1106
    const/4 v6, 0x4

    .line 1107
    invoke-direct {v5, v0, v6}, Lgo1;-><init>(Lcp1;I)V

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1111
    .line 1112
    .line 1113
    iget-object v4, v0, Lcp1;->l0:Ltc1;

    .line 1114
    .line 1115
    iget-object v4, v4, Ltc1;->d0:Landroid/widget/TextView;

    .line 1116
    .line 1117
    new-instance v5, Lyo1;

    .line 1118
    .line 1119
    const/16 v7, 0x8

    .line 1120
    .line 1121
    invoke-direct {v5, v0, v7}, Lyo1;-><init>(Lcp1;I)V

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 1125
    .line 1126
    .line 1127
    iget-object v4, v0, Lcp1;->l0:Ltc1;

    .line 1128
    .line 1129
    iget-object v4, v4, Ltc1;->S:Landroid/widget/TextView;

    .line 1130
    .line 1131
    new-instance v5, Lyo1;

    .line 1132
    .line 1133
    const/16 v8, 0x9

    .line 1134
    .line 1135
    invoke-direct {v5, v0, v8}, Lyo1;-><init>(Lcp1;I)V

    .line 1136
    .line 1137
    .line 1138
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 1139
    .line 1140
    .line 1141
    iget-object v4, v0, Lcp1;->l0:Ltc1;

    .line 1142
    .line 1143
    iget-object v4, v4, Ltc1;->f:Landroid/widget/TextView;

    .line 1144
    .line 1145
    new-instance v5, Lyo1;

    .line 1146
    .line 1147
    const/16 v9, 0xa

    .line 1148
    .line 1149
    invoke-direct {v5, v0, v9}, Lyo1;-><init>(Lcp1;I)V

    .line 1150
    .line 1151
    .line 1152
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 1153
    .line 1154
    .line 1155
    iget-object v4, v0, Lcp1;->l0:Ltc1;

    .line 1156
    .line 1157
    iget-object v4, v4, Ltc1;->o0:Landroid/widget/TextView;

    .line 1158
    .line 1159
    new-instance v5, Lgo1;

    .line 1160
    .line 1161
    const/4 v9, 0x5

    .line 1162
    invoke-direct {v5, v0, v9}, Lgo1;-><init>(Lcp1;I)V

    .line 1163
    .line 1164
    .line 1165
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1166
    .line 1167
    .line 1168
    iget-object v4, v0, Lcp1;->l0:Ltc1;

    .line 1169
    .line 1170
    iget-object v4, v4, Ltc1;->g0:Landroid/widget/TextView;

    .line 1171
    .line 1172
    new-instance v5, Lgo1;

    .line 1173
    .line 1174
    const/4 v10, 0x6

    .line 1175
    invoke-direct {v5, v0, v10}, Lgo1;-><init>(Lcp1;I)V

    .line 1176
    .line 1177
    .line 1178
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1179
    .line 1180
    .line 1181
    iget-object v4, v0, Lcp1;->l0:Ltc1;

    .line 1182
    .line 1183
    iget-object v4, v4, Ltc1;->k0:Landroid/widget/TextView;

    .line 1184
    .line 1185
    new-instance v5, Lgo1;

    .line 1186
    .line 1187
    const/4 v11, 0x7

    .line 1188
    invoke-direct {v5, v0, v11}, Lgo1;-><init>(Lcp1;I)V

    .line 1189
    .line 1190
    .line 1191
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1192
    .line 1193
    .line 1194
    iget-object v4, v0, Lcp1;->l0:Ltc1;

    .line 1195
    .line 1196
    iget-object v4, v4, Ltc1;->U:Landroid/widget/TextView;

    .line 1197
    .line 1198
    new-instance v5, Lgo1;

    .line 1199
    .line 1200
    invoke-direct {v5, v0, v7}, Lgo1;-><init>(Lcp1;I)V

    .line 1201
    .line 1202
    .line 1203
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1204
    .line 1205
    .line 1206
    iget-object v4, v0, Lcp1;->l0:Ltc1;

    .line 1207
    .line 1208
    iget-object v4, v4, Ltc1;->Q:Landroid/widget/TextView;

    .line 1209
    .line 1210
    new-instance v5, Lgo1;

    .line 1211
    .line 1212
    invoke-direct {v5, v0, v8}, Lgo1;-><init>(Lcp1;I)V

    .line 1213
    .line 1214
    .line 1215
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1216
    .line 1217
    .line 1218
    iget-object v4, v0, Lcp1;->l0:Ltc1;

    .line 1219
    .line 1220
    iget-object v4, v4, Ltc1;->X:Landroid/widget/TextView;

    .line 1221
    .line 1222
    new-instance v5, Lgo1;

    .line 1223
    .line 1224
    const/4 v7, 0x1

    .line 1225
    invoke-direct {v5, v0, v7}, Lgo1;-><init>(Lcp1;I)V

    .line 1226
    .line 1227
    .line 1228
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1229
    .line 1230
    .line 1231
    iget-object v4, v0, Lcp1;->l0:Ltc1;

    .line 1232
    .line 1233
    iget-object v4, v4, Ltc1;->L:Landroid/widget/TextView;

    .line 1234
    .line 1235
    new-instance v5, Lgo1;

    .line 1236
    .line 1237
    const/4 v8, 0x2

    .line 1238
    invoke-direct {v5, v0, v8}, Lgo1;-><init>(Lcp1;I)V

    .line 1239
    .line 1240
    .line 1241
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1242
    .line 1243
    .line 1244
    iget-object v4, v0, Lcp1;->l0:Ltc1;

    .line 1245
    .line 1246
    iget-object v4, v4, Ltc1;->p0:Landroid/widget/TextView;

    .line 1247
    .line 1248
    new-instance v5, Lyo1;

    .line 1249
    .line 1250
    invoke-direct {v5, v0, v7}, Lyo1;-><init>(Lcp1;I)V

    .line 1251
    .line 1252
    .line 1253
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 1254
    .line 1255
    .line 1256
    iget-object v4, v0, Lcp1;->l0:Ltc1;

    .line 1257
    .line 1258
    iget-object v4, v4, Ltc1;->h0:Landroid/widget/TextView;

    .line 1259
    .line 1260
    new-instance v5, Lyo1;

    .line 1261
    .line 1262
    invoke-direct {v5, v0, v8}, Lyo1;-><init>(Lcp1;I)V

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 1266
    .line 1267
    .line 1268
    iget-object v4, v0, Lcp1;->l0:Ltc1;

    .line 1269
    .line 1270
    iget-object v4, v4, Ltc1;->l0:Landroid/widget/TextView;

    .line 1271
    .line 1272
    new-instance v5, Lyo1;

    .line 1273
    .line 1274
    const/4 v8, 0x3

    .line 1275
    invoke-direct {v5, v0, v8}, Lyo1;-><init>(Lcp1;I)V

    .line 1276
    .line 1277
    .line 1278
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 1279
    .line 1280
    .line 1281
    iget-object v4, v0, Lcp1;->l0:Ltc1;

    .line 1282
    .line 1283
    iget-object v4, v4, Ltc1;->Y:Landroid/widget/TextView;

    .line 1284
    .line 1285
    new-instance v5, Lyo1;

    .line 1286
    .line 1287
    invoke-direct {v5, v0, v6}, Lyo1;-><init>(Lcp1;I)V

    .line 1288
    .line 1289
    .line 1290
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 1291
    .line 1292
    .line 1293
    iget-object v4, v0, Lcp1;->l0:Ltc1;

    .line 1294
    .line 1295
    iget-object v4, v4, Ltc1;->M:Landroid/widget/TextView;

    .line 1296
    .line 1297
    new-instance v5, Lyo1;

    .line 1298
    .line 1299
    invoke-direct {v5, v0, v9}, Lyo1;-><init>(Lcp1;I)V

    .line 1300
    .line 1301
    .line 1302
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 1303
    .line 1304
    .line 1305
    iget-object v4, v0, Lcp1;->l0:Ltc1;

    .line 1306
    .line 1307
    iget-object v4, v4, Ltc1;->V:Landroid/widget/TextView;

    .line 1308
    .line 1309
    new-instance v5, Lyo1;

    .line 1310
    .line 1311
    invoke-direct {v5, v0, v10}, Lyo1;-><init>(Lcp1;I)V

    .line 1312
    .line 1313
    .line 1314
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 1315
    .line 1316
    .line 1317
    iget-object v4, v0, Lcp1;->l0:Ltc1;

    .line 1318
    .line 1319
    iget-object v4, v4, Ltc1;->b0:Landroid/widget/TextView;

    .line 1320
    .line 1321
    new-instance v5, Lyo1;

    .line 1322
    .line 1323
    invoke-direct {v5, v0, v11}, Lyo1;-><init>(Lcp1;I)V

    .line 1324
    .line 1325
    .line 1326
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 1327
    .line 1328
    .line 1329
    iget-object v4, v0, Lcp1;->l0:Ltc1;

    .line 1330
    .line 1331
    iget-object v4, v4, Ltc1;->k:Landroid/widget/TextView;

    .line 1332
    .line 1333
    new-instance v5, Lgo1;

    .line 1334
    .line 1335
    invoke-direct {v5, v0, v8}, Lgo1;-><init>(Lcp1;I)V

    .line 1336
    .line 1337
    .line 1338
    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1339
    .line 1340
    .line 1341
    iget-object v4, v0, Lcp1;->l0:Ltc1;

    .line 1342
    .line 1343
    iget-object v4, v4, Ltc1;->q:Landroid/widget/LinearLayout;

    .line 1344
    .line 1345
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v5

    .line 1349
    invoke-static {v5}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v5

    .line 1353
    const v6, 0x7f0d0089

    .line 1354
    .line 1355
    .line 1356
    invoke-virtual {v5, v6, v4, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v4

    .line 1360
    const v5, 0x7f0a02e7

    .line 1361
    .line 1362
    .line 1363
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v5

    .line 1367
    new-instance v6, Lgo1;

    .line 1368
    .line 1369
    invoke-direct {v6, v0, v2}, Lgo1;-><init>(Lcp1;I)V

    new-instance v7, Lapp/homemusic/AURAWaveToggleClickListener;
    invoke-direct {v7, v6}, Lapp/homemusic/AURAWaveToggleClickListener;-><init>(Landroid/view/View$OnClickListener;)V

    .line 1370
    .line 1371
    .line 1372
    invoke-virtual {v5, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v8, Lapp/homemusic/AURAWaveCircleTouchListener;
    invoke-direct {v8}, Lapp/homemusic/AURAWaveCircleTouchListener;-><init>()V
    invoke-virtual {v5, v8}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    invoke-static {v5}, Lapp/homemusic/AURAWaveToggleClickListener;->syncIcon(Landroid/view/View;)V

    .line 1373
    .line 1374
    .line 1375
    const v5, 0x7f0a02d8

    .line 1376
    .line 1377
    .line 1378
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v5

    .line 1382
    new-instance v6, Lho1;

    .line 1383
    .line 1384
    invoke-direct {v6, v0, v4, v2}, Lho1;-><init>(Lcp1;Landroid/view/View;I)V

    .line 1385
    .line 1386
    .line 1387
    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1388
    .line 1389
    .line 1390
    const v2, 0x7f0a02d9

    .line 1391
    .line 1392
    .line 1393
    invoke-virtual {v4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v2

    .line 1397
    new-instance v5, Lho1;

    .line 1398
    .line 1399
    invoke-direct {v5, v0, v4, v7}, Lho1;-><init>(Lcp1;Landroid/view/View;I)V

    .line 1400
    .line 1401
    .line 1402
    invoke-virtual {v2, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1403
    .line 1404
    .line 1405
    invoke-static {v4, v1}, Lud3;->E0(Landroid/view/View;Lcom/eddyizm/tempus/homemusic/HubMixToday;)V

    .line 1406
    .line 1407
    .line 1408
    iput-object v4, v0, Lcp1;->H0:Landroid/view/View;

    .line 1409
    .line 1410
    iget-object v1, v0, Lcp1;->H0:Landroid/view/View;

    .line 1411
    .line 1412
    if-eqz v1, :cond_0

    .line 1413
    .line 1414
    iget-object v1, v0, Lcp1;->l0:Ltc1;

    .line 1415
    .line 1416
    iget-object v1, v1, Ltc1;->q:Landroid/widget/LinearLayout;

    .line 1417
    .line 1418
    iget-object v2, v0, Lcp1;->H0:Landroid/view/View;

    .line 1419
    .line 1420
    iget-object v0, v0, Lcp1;->l0:Ltc1;

    .line 1421
    .line 1422
    iget-object v0, v0, Ltc1;->D:Lcom/google/android/material/card/MaterialCardView;

    .line 1423
    .line 1424
    const/4 v0, 0x0
    invoke-virtual {v1, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V
    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;
    move-result-object v14
    const v15, 0x7f0a0263
    invoke-virtual {v14, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;
    move-result-object v14
    if-eqz v14, :cond_aura_animation_done
    invoke-virtual {v14}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
    move-result-object v14
    instance-of v15, v14, Landroid/graphics/drawable/AnimationDrawable;
    if-eqz v15, :cond_aura_animation_done
    check-cast v14, Landroid/graphics/drawable/AnimationDrawable;
    invoke-virtual {v14}, Landroid/graphics/drawable/AnimationDrawable;->start()V
    :cond_aura_animation_done

    .line 1430
    .line 1431
    .line 1432
    :cond_0
    return-object v3

    .line 1433
    :cond_1
    invoke-static {v6}, Lkf2;->n(Ljava/lang/String;)V

    .line 1434
    .line 1435
    .line 1436
    return-object v1

    .line 1437
    :cond_2
    invoke-static {v6}, Lkf2;->n(Ljava/lang/String;)V

    .line 1438
    .line 1439
    .line 1440
    return-object v1

    .line 1441
    :cond_3
    invoke-static {v6}, Lkf2;->n(Ljava/lang/String;)V

    .line 1442
    .line 1443
    .line 1444
    return-object v1

    .line 1445
    :cond_4
    move-object/from16 v75, v4

    .line 1446
    .line 1447
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v0

    .line 1451
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v0

    .line 1455
    const-string v1, "Missing required view with ID: "

    .line 1456
    .line 1457
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v0

    .line 1461
    invoke-static {v0}, Lnz2;->n(Ljava/lang/String;)V

    .line 1462
    .line 1463
    .line 1464
    return-object v75
.end method

.method public final J()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcp1;->l0:Ltc1;

    .line 6
    .line 7
    iput-object v0, p0, Lcp1;->H0:Landroid/view/View;

    .line 8
    .line 9
    return-void
.end method

.method public final P()V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lzo1;

    .line 10
    .line 11
    const/4 v2, 0x7

    .line 12
    invoke-direct {v1, p0, v2}, Lzo1;-><init>(Lcp1;I)V

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
    new-instance v0, Landroid/os/Handler;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v1, Lzo1;

    .line 26
    .line 27
    const/4 v4, 0x2

    .line 28
    invoke-direct {v1, p0, v4}, Lzo1;-><init>(Lcp1;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Lcp1;->H0:Landroid/view/View;

    .line 35
    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    sget-object v1, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 40
    .line 41
    new-instance v2, Lk6;

    .line 42
    .line 43
    const/16 v3, 0x1a

    .line 44
    .line 45
    invoke-direct {v2, v3, p0, v0}, Lk6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    iget-object v0, p0, Lcp1;->v0:Lni4;

    .line 52
    .line 53
    if-eqz v0, :cond_1

    .line 54
    .line 55
    iget-object v1, p0, Lcp1;->F0:Lbl2;

    .line 56
    .line 57
    iput-object v1, v0, Lni4;->A:Lbl2;

    .line 58
    .line 59
    :cond_1
    iget-object v0, p0, Lcp1;->u0:Lni4;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    iget-object p0, p0, Lcp1;->F0:Lbl2;

    .line 64
    .line 65
    iput-object p0, v0, Lni4;->A:Lbl2;

    .line 66
    .line 67
    :cond_2
    return-void
.end method

.method public final R()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    new-instance v3, Lcb4;

    .line 9
    .line 10
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Landroid/content/ComponentName;

    .line 15
    .line 16
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

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
    invoke-direct {v3, v0, v1}, Lcb4;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V

    .line 26
    .line 27
    .line 28
    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 29
    .line 30
    new-instance v5, Laj2;

    .line 31
    .line 32
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lf35;->x()Landroid/os/Looper;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    new-instance v7, Lbl2;

    .line 40
    .line 41
    invoke-direct {v7, v6}, Lbl2;-><init>(Landroid/os/Looper;)V

    .line 42
    .line 43
    .line 44
    iget-object v0, v3, Lcb4;->a:Lbb4;

    .line 45
    .line 46
    invoke-interface {v0}, Lbb4;->e()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    new-instance v0, Lxc5;

    .line 53
    .line 54
    new-instance v1, Lx7;

    .line 55
    .line 56
    invoke-direct {v1, v2}, Lx7;-><init>(Landroid/content/Context;)V

    .line 57
    .line 58
    .line 59
    new-instance v8, Lfi0;

    .line 60
    .line 61
    invoke-direct {v8, v1}, Lfi0;-><init>(Lx7;)V

    .line 62
    .line 63
    .line 64
    const/4 v1, 0x4

    .line 65
    invoke-direct {v0, v1, v8}, Lxc5;-><init>(ILjava/lang/Object;)V

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
    new-instance v1, Lbj2;

    .line 73
    .line 74
    invoke-direct/range {v1 .. v8}, Lsk2;-><init>(Landroid/content/Context;Lcb4;Landroid/os/Bundle;Lqk2;Landroid/os/Looper;Lbl2;Lxc5;)V

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
    invoke-static {v7, v1, v0}, Lb11;->w(Lbl2;Lbj2;Landroid/os/Handler;)V

    .line 83
    .line 84
    .line 85
    iput-object v7, p0, Lcp1;->F0:Lbl2;

    .line 86
    .line 87
    iget-object v0, p0, Lcp1;->G0:Lzd0;

    .line 88
    .line 89
    if-eqz v0, :cond_1

    .line 90
    .line 91
    iput-object v7, v0, Lzd0;->s:Ljava/lang/Object;

    .line 92
    .line 93
    :cond_1
    iget-object v0, p0, Lcp1;->p0:Lli3;

    .line 94
    .line 95
    invoke-static {v7, v0}, Lbo2;->j(Lbl2;Lli3;)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p0, Lcp1;->p0:Lli3;

    .line 99
    .line 100
    iget-object v0, v0, Lli3;->b:Lk03;

    .line 101
    .line 102
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    new-instance v2, Lxo1;

    .line 107
    .line 108
    const/16 v3, 0x11

    .line 109
    .line 110
    invoke-direct {v2, p0, v3}, Lxo1;-><init>(Lcp1;I)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v1, v2}, Lad2;->e(Lba2;La83;)V

    .line 114
    .line 115
    .line 116
    iget-object v0, p0, Lcp1;->p0:Lli3;

    .line 117
    .line 118
    iget-object v0, v0, Lli3;->c:Lk03;

    .line 119
    .line 120
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    new-instance v2, Lxo1;

    .line 125
    .line 126
    const/16 v3, 0x12

    .line 127
    .line 128
    invoke-direct {v2, p0, v3}, Lxo1;-><init>(Lcp1;I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v1, v2}, Lad2;->e(Lba2;La83;)V

    .line 132
    .line 133
    .line 134
    iget-object v0, p0, Lcp1;->p0:Lli3;

    .line 135
    .line 136
    iget-object v0, v0, Lli3;->b:Lk03;

    .line 137
    .line 138
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    new-instance v2, Lxo1;

    .line 143
    .line 144
    const/4 v3, 0x0

    .line 145
    invoke-direct {v2, p0, v3}, Lxo1;-><init>(Lcp1;I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0, v1, v2}, Lad2;->e(Lba2;La83;)V

    .line 149
    .line 150
    .line 151
    iget-object v0, p0, Lcp1;->p0:Lli3;

    .line 152
    .line 153
    iget-object v0, v0, Lli3;->c:Lk03;

    .line 154
    .line 155
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    new-instance v2, Lxo1;

    .line 160
    .line 161
    const/4 v3, 0x2

    .line 162
    invoke-direct {v2, p0, v3}, Lxo1;-><init>(Lcp1;I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v1, v2}, Lad2;->e(Lba2;La83;)V

    .line 166
    .line 167
    .line 168
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcp1;->F0:Lbl2;

    .line 2
    .line 3
    invoke-static {v0}, Lsk2;->Z0(Ljava/util/concurrent/Future;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 8
    .line 9
    return-void
.end method

.method public final T(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 23

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    invoke-static {}, Lud3;->X()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v6, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/eddyizm/tempus/viewmodel/b;->c:Lxi4;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/4 v0, -0x1

    .line 18
    invoke-static {v0, v6, v6}, Lxi4;->s(IZZ)Lk03;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    new-instance v3, Lap1;

    .line 27
    .line 28
    invoke-direct {v3, v2, v6}, Lap1;-><init>(Lcp1;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1, v3}, Lad2;->e(Lba2;La83;)V

    .line 32
    .line 33
    .line 34
    :cond_0
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 35
    .line 36
    iget-object v0, v0, Ltc1;->G:Lcom/google/android/material/button/MaterialButton;

    .line 37
    .line 38
    new-instance v1, Lgo1;

    .line 39
    .line 40
    const/16 v7, 0xf

    .line 41
    .line 42
    invoke-direct {v1, v2, v7}, Lgo1;-><init>(Lcp1;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 49
    .line 50
    iget-object v0, v0, Ltc1;->I:Lcom/google/android/material/button/MaterialButton;

    .line 51
    .line 52
    new-instance v1, Li4;

    .line 53
    .line 54
    const/4 v8, 0x4

    .line 55
    invoke-direct {v1, v8, v2}, Li4;-><init>(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 59
    .line 60
    .line 61
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const-string v1, "sync_starred_albums_for_offline_use"

    .line 73
    .line 74
    invoke-interface {v0, v1, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    const/16 v9, 0x14

    .line 79
    .line 80
    const/4 v10, 0x1

    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 84
    .line 85
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-object v3, v0, Lcom/eddyizm/tempus/viewmodel/b;->r:Lk03;

    .line 90
    .line 91
    invoke-virtual {v3}, Lad2;->d()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    if-nez v4, :cond_1

    .line 96
    .line 97
    iget-object v0, v0, Lcom/eddyizm/tempus/viewmodel/b;->d:Lrv2;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-static {v9, v10}, Lrv2;->o(IZ)Lk03;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    new-instance v4, Lg7;

    .line 107
    .line 108
    invoke-direct {v4, v3, v6}, Lg7;-><init>(Lk03;I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v1, v4}, Lad2;->e(Lba2;La83;)V

    .line 112
    .line 113
    .line 114
    :cond_1
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    new-instance v1, Lap1;

    .line 119
    .line 120
    invoke-direct {v1, v2, v10}, Lap1;-><init>(Lcp1;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v3, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 124
    .line 125
    .line 126
    :cond_2
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 127
    .line 128
    iget-object v0, v0, Ltc1;->y:Lcom/google/android/material/button/MaterialButton;

    .line 129
    .line 130
    new-instance v1, Lgo1;

    .line 131
    .line 132
    const/16 v3, 0xa

    .line 133
    .line 134
    invoke-direct {v1, v2, v3}, Lgo1;-><init>(Lcp1;I)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 138
    .line 139
    .line 140
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 141
    .line 142
    iget-object v0, v0, Ltc1;->A:Lcom/google/android/material/button/MaterialButton;

    .line 143
    .line 144
    new-instance v1, Lgo1;

    .line 145
    .line 146
    const/16 v11, 0xb

    .line 147
    .line 148
    invoke-direct {v1, v2, v11}, Lgo1;-><init>(Lcp1;I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 152
    .line 153
    .line 154
    invoke-static {}, Lud3;->W()Z

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    const/4 v12, 0x3

    .line 159
    if-eqz v0, :cond_4

    .line 160
    .line 161
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 162
    .line 163
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    iget-object v4, v0, Lcom/eddyizm/tempus/viewmodel/b;->s:Lk03;

    .line 168
    .line 169
    invoke-virtual {v4}, Lad2;->d()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    if-nez v5, :cond_3

    .line 174
    .line 175
    iget-object v0, v0, Lcom/eddyizm/tempus/viewmodel/b;->e:Lpa;

    .line 176
    .line 177
    invoke-virtual {v0, v9, v10}, Lpa;->y(IZ)Lk03;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    new-instance v5, Lg7;

    .line 182
    .line 183
    invoke-direct {v5, v4, v6}, Lg7;-><init>(Lk03;I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v1, v5}, Lad2;->e(Lba2;La83;)V

    .line 187
    .line 188
    .line 189
    :cond_3
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    new-instance v1, Lap1;

    .line 194
    .line 195
    invoke-direct {v1, v2, v12}, Lap1;-><init>(Lcp1;I)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v4, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 199
    .line 200
    .line 201
    :cond_4
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 202
    .line 203
    iget-object v0, v0, Ltc1;->C:Lcom/google/android/material/button/MaterialButton;

    .line 204
    .line 205
    new-instance v1, Lgo1;

    .line 206
    .line 207
    const/16 v4, 0xd

    .line 208
    .line 209
    invoke-direct {v1, v2, v4}, Lgo1;-><init>(Lcp1;I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 213
    .line 214
    .line 215
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 216
    .line 217
    iget-object v0, v0, Ltc1;->E:Lcom/google/android/material/button/MaterialButton;

    .line 218
    .line 219
    new-instance v1, Lgo1;

    .line 220
    .line 221
    const/16 v13, 0xe

    .line 222
    .line 223
    invoke-direct {v1, v2, v13}, Lgo1;-><init>(Lcp1;I)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 227
    .line 228
    .line 229
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 230
    .line 231
    const-string v1, "HOME_SECTOR_DISCOVERY"

    .line 232
    .line 233
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/viewmodel/b;->d(Ljava/lang/String;)Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    const/4 v14, 0x0

    .line 238
    if-eqz v0, :cond_5

    .line 239
    .line 240
    goto :goto_0

    .line 241
    :cond_5
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 242
    .line 243
    iget-object v0, v0, Ltc1;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 244
    .line 245
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 246
    .line 247
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 248
    .line 249
    .line 250
    invoke-direct {v1, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 254
    .line 255
    .line 256
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 257
    .line 258
    iget-object v0, v0, Ltc1;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 259
    .line 260
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 261
    .line 262
    .line 263
    new-instance v0, Lvq0;

    .line 264
    .line 265
    invoke-direct {v0, v2}, Lvq0;-><init>(Lcp1;)V

    .line 266
    .line 267
    .line 268
    iput-object v0, v2, Lcp1;->q0:Lvq0;

    .line 269
    .line 270
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 271
    .line 272
    iget-object v1, v1, Ltc1;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 273
    .line 274
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 275
    .line 276
    .line 277
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 278
    .line 279
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    iget-object v5, v0, Lcom/eddyizm/tempus/viewmodel/b;->l:Lk03;

    .line 284
    .line 285
    invoke-virtual {v5}, Lad2;->d()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v15

    .line 289
    if-nez v15, :cond_6

    .line 290
    .line 291
    iget-object v15, v0, Lcom/eddyizm/tempus/viewmodel/b;->c:Lxi4;

    .line 292
    .line 293
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-static {v3, v14, v14}, Lxi4;->q(ILjava/lang/Integer;Ljava/lang/Integer;)Lk03;

    .line 297
    .line 298
    .line 299
    move-result-object v15

    .line 300
    invoke-virtual {v0, v5}, Lcom/eddyizm/tempus/viewmodel/b;->h(Lk03;)Lmp1;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-virtual {v15, v1, v0}, Lad2;->e(Lba2;La83;)V

    .line 305
    .line 306
    .line 307
    :cond_6
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    new-instance v1, Lxo1;

    .line 312
    .line 313
    const/4 v15, 0x7

    .line 314
    invoke-direct {v1, v2, v15}, Lxo1;-><init>(Lcp1;I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v5, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 318
    .line 319
    .line 320
    :goto_0
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 321
    .line 322
    const-string v1, "HOME_SECTOR_CONTINUE_LISTENING"

    .line 323
    .line 324
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/viewmodel/b;->d(Ljava/lang/String;)Z

    .line 325
    .line 326
    .line 327
    move-result v0

    .line 328
    const/16 v15, 0x8

    .line 329
    .line 330
    if-eqz v0, :cond_7

    .line 331
    .line 332
    goto/16 :goto_2

    .line 333
    .line 334
    :cond_7
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 335
    .line 336
    iget-object v0, v0, Ltc1;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 337
    .line 338
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 339
    .line 340
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 341
    .line 342
    .line 343
    invoke-direct {v1, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 347
    .line 348
    .line 349
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 350
    .line 351
    iget-object v0, v0, Ltc1;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 352
    .line 353
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 354
    .line 355
    .line 356
    new-instance v0, Lzd0;

    .line 357
    .line 358
    iget-object v1, v2, Lcp1;->F0:Lbl2;

    .line 359
    .line 360
    invoke-direct {v0}, Lzd0;-><init>()V

    .line 361
    .line 362
    .line 363
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 364
    .line 365
    iput-object v5, v0, Lzd0;->r:Ljava/util/List;

    .line 366
    .line 367
    iput-object v1, v0, Lzd0;->s:Ljava/lang/Object;

    .line 368
    .line 369
    iput-object v0, v2, Lcp1;->G0:Lzd0;

    .line 370
    .line 371
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 372
    .line 373
    iget-object v1, v1, Ltc1;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 374
    .line 375
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 376
    .line 377
    .line 378
    invoke-static {}, Lud3;->A()Ljava/util/Map;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    check-cast v0, Ljava/lang/Iterable;

    .line 387
    .line 388
    new-instance v1, Ljb2;

    .line 389
    .line 390
    invoke-direct {v1, v10}, Ljb2;-><init>(I)V

    .line 391
    .line 392
    .line 393
    invoke-static {v0, v1}, Lq40;->K0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    iget-object v5, v2, Lcp1;->l0:Ltc1;

    .line 402
    .line 403
    if-eqz v1, :cond_8

    .line 404
    .line 405
    iget-object v0, v5, Ltc1;->m:Landroid/widget/LinearLayout;

    .line 406
    .line 407
    invoke-virtual {v0, v15}, Landroid/view/View;->setVisibility(I)V

    .line 408
    .line 409
    .line 410
    goto :goto_1

    .line 411
    :cond_8
    iget-object v1, v5, Ltc1;->m:Landroid/widget/LinearLayout;

    .line 412
    .line 413
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 414
    .line 415
    .line 416
    iget-object v1, v2, Lcp1;->G0:Lzd0;

    .line 417
    .line 418
    iput-object v0, v1, Lzd0;->r:Ljava/util/List;

    .line 419
    .line 420
    invoke-virtual {v1}, Ldw3;->d()V

    .line 421
    .line 422
    .line 423
    :goto_1
    new-instance v0, Lvs3;

    .line 424
    .line 425
    invoke-direct {v0}, Lvs3;-><init>()V

    .line 426
    .line 427
    .line 428
    new-instance v0, Lzo1;

    .line 429
    .line 430
    invoke-direct {v0, v2, v12}, Lzo1;-><init>(Lcp1;I)V

    .line 431
    .line 432
    .line 433
    invoke-static {v6}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    invoke-virtual {v1}, Lpn4;->b()Lrm3;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    const-string v5, "BookmarksClient"

    .line 445
    .line 446
    const-string v13, "getBookmarks()"

    .line 447
    .line 448
    invoke-static {v5, v13}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 449
    .line 450
    .line 451
    iget-object v5, v1, Lrm3;->o:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast v5, Lmt;

    .line 454
    .line 455
    iget-object v1, v1, Lrm3;->n:Ljava/lang/Object;

    .line 456
    .line 457
    check-cast v1, Lpn4;

    .line 458
    .line 459
    invoke-virtual {v1}, Lpn4;->f()Ljava/util/HashMap;

    .line 460
    .line 461
    .line 462
    move-result-object v1

    .line 463
    invoke-interface {v5, v1}, Lmt;->c(Ljava/util/Map;)Lretrofit2/Call;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    new-instance v5, Lrm2;

    .line 468
    .line 469
    invoke-direct {v5, v3, v0}, Lrm2;-><init>(ILjava/lang/Object;)V

    .line 470
    .line 471
    .line 472
    invoke-interface {v1, v5}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 473
    .line 474
    .line 475
    :goto_2
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 476
    .line 477
    const-string v1, "HOME_SECTOR_MADE_FOR_YOU"

    .line 478
    .line 479
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/viewmodel/b;->d(Ljava/lang/String;)Z

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    if-eqz v0, :cond_9

    .line 484
    .line 485
    goto :goto_3

    .line 486
    :cond_9
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 487
    .line 488
    iget-object v0, v0, Ltc1;->c0:Landroidx/recyclerview/widget/RecyclerView;

    .line 489
    .line 490
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 491
    .line 492
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 493
    .line 494
    .line 495
    invoke-direct {v1, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 499
    .line 500
    .line 501
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 502
    .line 503
    iget-object v0, v0, Ltc1;->c0:Landroidx/recyclerview/widget/RecyclerView;

    .line 504
    .line 505
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 506
    .line 507
    .line 508
    new-instance v0, Ls6;

    .line 509
    .line 510
    invoke-direct {v0, v2}, Ls6;-><init>(Lcp1;)V

    .line 511
    .line 512
    .line 513
    iput-object v0, v2, Lcp1;->r0:Ls6;

    .line 514
    .line 515
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 516
    .line 517
    iget-object v1, v1, Ltc1;->c0:Landroidx/recyclerview/widget/RecyclerView;

    .line 518
    .line 519
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 520
    .line 521
    .line 522
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 523
    .line 524
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    iget-object v5, v0, Lcom/eddyizm/tempus/viewmodel/b;->n:Lk03;

    .line 529
    .line 530
    invoke-virtual {v5}, Lad2;->d()Ljava/lang/Object;

    .line 531
    .line 532
    .line 533
    move-result-object v13

    .line 534
    if-nez v13, :cond_a

    .line 535
    .line 536
    iget-object v0, v0, Lcom/eddyizm/tempus/viewmodel/b;->c:Lxi4;

    .line 537
    .line 538
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 539
    .line 540
    .line 541
    invoke-static {v3, v10, v10}, Lxi4;->s(IZZ)Lk03;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    new-instance v13, Lg7;

    .line 546
    .line 547
    invoke-direct {v13, v5, v6}, Lg7;-><init>(Lk03;I)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v0, v1, v13}, Lad2;->e(Lba2;La83;)V

    .line 551
    .line 552
    .line 553
    :cond_a
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 554
    .line 555
    .line 556
    move-result-object v0

    .line 557
    new-instance v1, Lxo1;

    .line 558
    .line 559
    const/16 v13, 0x9

    .line 560
    .line 561
    invoke-direct {v1, v2, v13}, Lxo1;-><init>(Lcp1;I)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v5, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 565
    .line 566
    .line 567
    new-instance v0, Lxg0;

    .line 568
    .line 569
    invoke-direct {v0, v6}, Lxg0;-><init>(I)V

    .line 570
    .line 571
    .line 572
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 573
    .line 574
    iget-object v1, v1, Ltc1;->c0:Landroidx/recyclerview/widget/RecyclerView;

    .line 575
    .line 576
    invoke-virtual {v0, v1}, Lxg0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 577
    .line 578
    .line 579
    :goto_3
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 580
    .line 581
    const-string v1, "HOME_SECTOR_RADIO_STATION"

    .line 582
    .line 583
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/viewmodel/b;->d(Ljava/lang/String;)Z

    .line 584
    .line 585
    .line 586
    move-result v0

    .line 587
    if-eqz v0, :cond_b

    .line 588
    .line 589
    goto :goto_4

    .line 590
    :cond_b
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 591
    .line 592
    iget-object v0, v0, Ltc1;->R:Landroidx/recyclerview/widget/RecyclerView;

    .line 593
    .line 594
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 595
    .line 596
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 597
    .line 598
    .line 599
    invoke-direct {v1, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 603
    .line 604
    .line 605
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 606
    .line 607
    iget-object v0, v0, Ltc1;->R:Landroidx/recyclerview/widget/RecyclerView;

    .line 608
    .line 609
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 610
    .line 611
    .line 612
    new-instance v0, Lvi;

    .line 613
    .line 614
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 615
    .line 616
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 617
    .line 618
    invoke-direct {v0, v2, v1, v5}, Lvi;-><init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 619
    .line 620
    .line 621
    iput-object v0, v2, Lcp1;->s0:Lvi;

    .line 622
    .line 623
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 624
    .line 625
    iget-object v1, v1, Ltc1;->R:Landroidx/recyclerview/widget/RecyclerView;

    .line 626
    .line 627
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 628
    .line 629
    .line 630
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 631
    .line 632
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 633
    .line 634
    .line 635
    move-result-object v1

    .line 636
    iget-object v5, v0, Lcom/eddyizm/tempus/viewmodel/b;->o:Lk03;

    .line 637
    .line 638
    invoke-virtual {v5}, Lad2;->d()Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v13

    .line 642
    if-nez v13, :cond_c

    .line 643
    .line 644
    iget-object v0, v0, Lcom/eddyizm/tempus/viewmodel/b;->e:Lpa;

    .line 645
    .line 646
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 647
    .line 648
    .line 649
    new-instance v13, Lk03;

    .line 650
    .line 651
    invoke-direct {v13}, Lad2;-><init>()V

    .line 652
    .line 653
    .line 654
    invoke-static {v6}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 655
    .line 656
    .line 657
    move-result-object v16

    .line 658
    invoke-virtual/range {v16 .. v16}, Lpn4;->a()Lxc5;

    .line 659
    .line 660
    .line 661
    move-result-object v16

    .line 662
    invoke-virtual/range {v16 .. v16}, Lxc5;->s()Lretrofit2/Call;

    .line 663
    .line 664
    .line 665
    move-result-object v12

    .line 666
    new-instance v7, Lr8;

    .line 667
    .line 668
    invoke-direct {v7, v0, v13, v10}, Lr8;-><init>(Ljava/lang/Object;Lk03;I)V

    .line 669
    .line 670
    .line 671
    invoke-interface {v12, v7}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 672
    .line 673
    .line 674
    new-instance v0, Lg7;

    .line 675
    .line 676
    invoke-direct {v0, v5, v6}, Lg7;-><init>(Lk03;I)V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v13, v1, v0}, Lad2;->e(Lba2;La83;)V

    .line 680
    .line 681
    .line 682
    :cond_c
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    new-instance v1, Lxo1;

    .line 687
    .line 688
    invoke-direct {v1, v2, v4}, Lxo1;-><init>(Lcp1;I)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v5, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 692
    .line 693
    .line 694
    new-instance v0, Lxg0;

    .line 695
    .line 696
    invoke-direct {v0, v6}, Lxg0;-><init>(I)V

    .line 697
    .line 698
    .line 699
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 700
    .line 701
    iget-object v1, v1, Ltc1;->R:Landroidx/recyclerview/widget/RecyclerView;

    .line 702
    .line 703
    invoke-virtual {v0, v1}, Lxg0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 704
    .line 705
    .line 706
    :goto_4
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 707
    .line 708
    const-string v1, "HOME_SECTOR_BEST_OF"

    .line 709
    .line 710
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/viewmodel/b;->d(Ljava/lang/String;)Z

    .line 711
    .line 712
    .line 713
    move-result v0

    .line 714
    if-eqz v0, :cond_d

    .line 715
    .line 716
    goto :goto_5

    .line 717
    :cond_d
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 718
    .line 719
    iget-object v0, v0, Ltc1;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 720
    .line 721
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 722
    .line 723
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 724
    .line 725
    .line 726
    invoke-direct {v1, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 727
    .line 728
    .line 729
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 730
    .line 731
    .line 732
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 733
    .line 734
    iget-object v0, v0, Ltc1;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 735
    .line 736
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 737
    .line 738
    .line 739
    new-instance v0, Lvi;

    .line 740
    .line 741
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 742
    .line 743
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 744
    .line 745
    invoke-direct {v0, v2, v1, v4}, Lvi;-><init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 746
    .line 747
    .line 748
    iput-object v0, v2, Lcp1;->t0:Lvi;

    .line 749
    .line 750
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 751
    .line 752
    iget-object v1, v1, Ltc1;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 753
    .line 754
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 755
    .line 756
    .line 757
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 758
    .line 759
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 760
    .line 761
    .line 762
    move-result-object v1

    .line 763
    iget-object v4, v0, Lcom/eddyizm/tempus/viewmodel/b;->p:Lk03;

    .line 764
    .line 765
    invoke-virtual {v4}, Lad2;->d()Ljava/lang/Object;

    .line 766
    .line 767
    .line 768
    move-result-object v5

    .line 769
    if-nez v5, :cond_e

    .line 770
    .line 771
    iget-object v0, v0, Lcom/eddyizm/tempus/viewmodel/b;->e:Lpa;

    .line 772
    .line 773
    invoke-virtual {v0, v9, v10}, Lpa;->y(IZ)Lk03;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    new-instance v5, Lg7;

    .line 778
    .line 779
    invoke-direct {v5, v4, v6}, Lg7;-><init>(Lk03;I)V

    .line 780
    .line 781
    .line 782
    invoke-virtual {v0, v1, v5}, Lad2;->e(Lba2;La83;)V

    .line 783
    .line 784
    .line 785
    :cond_e
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    new-instance v1, Lxo1;

    .line 790
    .line 791
    invoke-direct {v1, v2, v3}, Lxo1;-><init>(Lcp1;I)V

    .line 792
    .line 793
    .line 794
    invoke-virtual {v4, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 795
    .line 796
    .line 797
    new-instance v0, Lxg0;

    .line 798
    .line 799
    invoke-direct {v0, v6}, Lxg0;-><init>(I)V

    .line 800
    .line 801
    .line 802
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 803
    .line 804
    iget-object v1, v1, Ltc1;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 805
    .line 806
    invoke-virtual {v0, v1}, Lxg0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 807
    .line 808
    .line 809
    :goto_5
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 810
    .line 811
    const-string v1, "HOME_SECTOR_STARRED_TRACKS"

    .line 812
    .line 813
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/viewmodel/b;->d(Ljava/lang/String;)Z

    .line 814
    .line 815
    .line 816
    move-result v0

    .line 817
    const v7, 0x7f07032e

    .line 818
    .line 819
    .line 820
    const v12, 0x7f0705f5

    .line 821
    .line 822
    .line 823
    const v13, 0x7f06036c

    .line 824
    .line 825
    .line 826
    if-eqz v0, :cond_f

    .line 827
    .line 828
    goto/16 :goto_6

    .line 829
    .line 830
    :cond_f
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 831
    .line 832
    iget-object v0, v0, Ltc1;->m0:Landroidx/recyclerview/widget/RecyclerView;

    .line 833
    .line 834
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 835
    .line 836
    .line 837
    new-instance v0, Lni4;

    .line 838
    .line 839
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 840
    .line 841
    .line 842
    move-result-object v1

    .line 843
    const/4 v4, 0x0

    .line 844
    const/4 v5, 0x0

    .line 845
    const/4 v3, 0x1

    .line 846
    invoke-direct/range {v0 .. v5}, Lni4;-><init>(Lle1;Lcom/eddyizm/tempus/interfaces/ClickCallback;ZZLcom/eddyizm/tempus/subsonic/models/AlbumID3;)V

    .line 847
    .line 848
    .line 849
    iput-object v0, v2, Lcp1;->u0:Lni4;

    .line 850
    .line 851
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 852
    .line 853
    iget-object v1, v1, Ltc1;->m0:Landroidx/recyclerview/widget/RecyclerView;

    .line 854
    .line 855
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 856
    .line 857
    .line 858
    iget-object v0, v2, Lcp1;->u0:Lni4;

    .line 859
    .line 860
    iget-object v1, v2, Lcp1;->F0:Lbl2;

    .line 861
    .line 862
    iput-object v1, v0, Lni4;->A:Lbl2;

    .line 863
    .line 864
    invoke-virtual {v2}, Lcp1;->h0()V

    .line 865
    .line 866
    .line 867
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 868
    .line 869
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 870
    .line 871
    .line 872
    move-result-object v1

    .line 873
    iget-object v3, v0, Lcom/eddyizm/tempus/viewmodel/b;->q:Lk03;

    .line 874
    .line 875
    invoke-virtual {v3}, Lad2;->d()Ljava/lang/Object;

    .line 876
    .line 877
    .line 878
    move-result-object v4

    .line 879
    if-nez v4, :cond_10

    .line 880
    .line 881
    iget-object v0, v0, Lcom/eddyizm/tempus/viewmodel/b;->c:Lxi4;

    .line 882
    .line 883
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 884
    .line 885
    .line 886
    invoke-static {v9, v10, v10}, Lxi4;->s(IZZ)Lk03;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    new-instance v4, Lg7;

    .line 891
    .line 892
    invoke-direct {v4, v3, v6}, Lg7;-><init>(Lk03;I)V

    .line 893
    .line 894
    .line 895
    invoke-virtual {v0, v1, v4}, Lad2;->e(Lba2;La83;)V

    .line 896
    .line 897
    .line 898
    :cond_10
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 899
    .line 900
    .line 901
    move-result-object v0

    .line 902
    new-instance v1, Lxo1;

    .line 903
    .line 904
    invoke-direct {v1, v2, v15}, Lxo1;-><init>(Lcp1;I)V

    .line 905
    .line 906
    .line 907
    invoke-virtual {v3, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 908
    .line 909
    .line 910
    new-instance v0, Lxg0;

    .line 911
    .line 912
    invoke-direct {v0, v10}, Lxg0;-><init>(I)V

    .line 913
    .line 914
    .line 915
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 916
    .line 917
    iget-object v1, v1, Ltc1;->m0:Landroidx/recyclerview/widget/RecyclerView;

    .line 918
    .line 919
    invoke-virtual {v0, v1}, Lxg0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 920
    .line 921
    .line 922
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 923
    .line 924
    iget-object v0, v0, Ltc1;->m0:Landroidx/recyclerview/widget/RecyclerView;

    .line 925
    .line 926
    new-instance v17, Ljs0;

    .line 927
    .line 928
    invoke-virtual {v2}, Lkc1;->r()Landroid/content/res/Resources;

    .line 929
    .line 930
    .line 931
    move-result-object v1

    .line 932
    invoke-virtual {v1, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 933
    .line 934
    .line 935
    move-result v18

    .line 936
    invoke-virtual {v2}, Lkc1;->r()Landroid/content/res/Resources;

    .line 937
    .line 938
    .line 939
    move-result-object v1

    .line 940
    invoke-virtual {v1, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 941
    .line 942
    .line 943
    move-result v1

    .line 944
    mul-int/lit8 v19, v1, 0x4

    .line 945
    .line 946
    invoke-virtual {v2}, Lkc1;->r()Landroid/content/res/Resources;

    .line 947
    .line 948
    .line 949
    move-result-object v1

    .line 950
    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 951
    .line 952
    .line 953
    move-result v20

    .line 954
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 955
    .line 956
    .line 957
    move-result-object v1

    .line 958
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 959
    .line 960
    .line 961
    move-result-object v1

    .line 962
    invoke-virtual {v1, v13, v14}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 963
    .line 964
    .line 965
    move-result v21

    .line 966
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 967
    .line 968
    .line 969
    move-result-object v1

    .line 970
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 971
    .line 972
    .line 973
    move-result-object v1

    .line 974
    invoke-virtual {v1, v13, v14}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 975
    .line 976
    .line 977
    move-result v22

    .line 978
    invoke-direct/range {v17 .. v22}, Ljs0;-><init>(IIIII)V

    .line 979
    .line 980
    .line 981
    move-object/from16 v1, v17

    .line 982
    .line 983
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->i(Lkw3;)V

    .line 984
    .line 985
    .line 986
    :goto_6
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 987
    .line 988
    const-string v1, "HOME_SECTOR_STARRED_ALBUMS"

    .line 989
    .line 990
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/viewmodel/b;->d(Ljava/lang/String;)Z

    .line 991
    .line 992
    .line 993
    move-result v0

    .line 994
    if-eqz v0, :cond_11

    .line 995
    .line 996
    goto :goto_7

    .line 997
    :cond_11
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 998
    .line 999
    iget-object v0, v0, Ltc1;->e0:Landroidx/recyclerview/widget/RecyclerView;

    .line 1000
    .line 1001
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 1002
    .line 1003
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1004
    .line 1005
    .line 1006
    invoke-direct {v1, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 1013
    .line 1014
    .line 1015
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v1

    .line 1019
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v1

    .line 1023
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 1024
    .line 1025
    const/high16 v3, 0x41800000    # 16.0f

    .line 1026
    .line 1027
    mul-float/2addr v3, v1

    .line 1028
    float-to-int v3, v3

    .line 1029
    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    .line 1030
    .line 1031
    .line 1032
    move-result v4

    .line 1033
    const/high16 v5, 0x41000000    # 8.0f

    .line 1034
    .line 1035
    mul-float/2addr v5, v1

    .line 1036
    float-to-int v1, v5

    .line 1037
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 1038
    .line 1039
    .line 1040
    move-result v5

    .line 1041
    invoke-virtual {v0, v3, v4, v1, v5}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 1042
    .line 1043
    .line 1044
    new-instance v1, Ls6;

    .line 1045
    .line 1046
    invoke-direct {v1, v2}, Ls6;-><init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;)V

    .line 1047
    .line 1048
    .line 1049
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 1050
    .line 1051
    .line 1052
    new-instance v3, Lxg0;

    .line 1053
    .line 1054
    invoke-direct {v3, v6}, Lxg0;-><init>(I)V

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual {v3, v0}, Lxg0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 1058
    .line 1059
    .line 1060
    iput-object v1, v2, Lcp1;->w0:Ls6;

    .line 1061
    .line 1062
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 1063
    .line 1064
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v1

    .line 1068
    iget-object v3, v0, Lcom/eddyizm/tempus/viewmodel/b;->r:Lk03;

    .line 1069
    .line 1070
    invoke-virtual {v3}, Lad2;->d()Ljava/lang/Object;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v4

    .line 1074
    if-nez v4, :cond_12

    .line 1075
    .line 1076
    iget-object v0, v0, Lcom/eddyizm/tempus/viewmodel/b;->d:Lrv2;

    .line 1077
    .line 1078
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1079
    .line 1080
    .line 1081
    invoke-static {v9, v10}, Lrv2;->o(IZ)Lk03;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v0

    .line 1085
    new-instance v4, Lg7;

    .line 1086
    .line 1087
    invoke-direct {v4, v3, v6}, Lg7;-><init>(Lk03;I)V

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v0, v1, v4}, Lad2;->e(Lba2;La83;)V

    .line 1091
    .line 1092
    .line 1093
    :cond_12
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v0

    .line 1097
    new-instance v1, Lxo1;

    .line 1098
    .line 1099
    const/16 v4, 0x16

    .line 1100
    .line 1101
    invoke-direct {v1, v2, v4}, Lxo1;-><init>(Lcp1;I)V

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual {v3, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 1105
    .line 1106
    .line 1107
    :goto_7
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 1108
    .line 1109
    const-string v1, "HOME_SECTOR_STARRED_ARTISTS"

    .line 1110
    .line 1111
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/viewmodel/b;->d(Ljava/lang/String;)Z

    .line 1112
    .line 1113
    .line 1114
    move-result v0

    .line 1115
    if-eqz v0, :cond_13

    .line 1116
    .line 1117
    goto/16 :goto_8

    .line 1118
    .line 1119
    :cond_13
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 1120
    .line 1121
    iget-object v0, v0, Ltc1;->i0:Landroidx/recyclerview/widget/RecyclerView;

    .line 1122
    .line 1123
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 1124
    .line 1125
    .line 1126
    new-instance v0, Lb8;

    .line 1127
    .line 1128
    invoke-direct {v0, v2, v10}, Lb8;-><init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;I)V

    .line 1129
    .line 1130
    .line 1131
    iput-object v0, v2, Lcp1;->x0:Lb8;

    .line 1132
    .line 1133
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 1134
    .line 1135
    iget-object v1, v1, Ltc1;->i0:Landroidx/recyclerview/widget/RecyclerView;

    .line 1136
    .line 1137
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 1138
    .line 1139
    .line 1140
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 1141
    .line 1142
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v1

    .line 1146
    iget-object v3, v0, Lcom/eddyizm/tempus/viewmodel/b;->s:Lk03;

    .line 1147
    .line 1148
    invoke-virtual {v3}, Lad2;->d()Ljava/lang/Object;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v4

    .line 1152
    if-nez v4, :cond_14

    .line 1153
    .line 1154
    iget-object v0, v0, Lcom/eddyizm/tempus/viewmodel/b;->e:Lpa;

    .line 1155
    .line 1156
    invoke-virtual {v0, v9, v10}, Lpa;->y(IZ)Lk03;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v0

    .line 1160
    new-instance v4, Lg7;

    .line 1161
    .line 1162
    invoke-direct {v4, v3, v6}, Lg7;-><init>(Lk03;I)V

    .line 1163
    .line 1164
    .line 1165
    invoke-virtual {v0, v1, v4}, Lad2;->e(Lba2;La83;)V

    .line 1166
    .line 1167
    .line 1168
    :cond_14
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v0

    .line 1172
    new-instance v1, Lxo1;

    .line 1173
    .line 1174
    invoke-direct {v1, v2, v10}, Lxo1;-><init>(Lcp1;I)V

    .line 1175
    .line 1176
    .line 1177
    invoke-virtual {v3, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 1178
    .line 1179
    .line 1180
    new-instance v0, Lxg0;

    .line 1181
    .line 1182
    invoke-direct {v0, v10}, Lxg0;-><init>(I)V

    .line 1183
    .line 1184
    .line 1185
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 1186
    .line 1187
    iget-object v1, v1, Ltc1;->i0:Landroidx/recyclerview/widget/RecyclerView;

    .line 1188
    .line 1189
    invoke-virtual {v0, v1}, Lxg0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 1190
    .line 1191
    .line 1192
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 1193
    .line 1194
    iget-object v0, v0, Ltc1;->i0:Landroidx/recyclerview/widget/RecyclerView;

    .line 1195
    .line 1196
    new-instance v17, Ljs0;

    .line 1197
    .line 1198
    invoke-virtual {v2}, Lkc1;->r()Landroid/content/res/Resources;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v1

    .line 1202
    invoke-virtual {v1, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1203
    .line 1204
    .line 1205
    move-result v18

    .line 1206
    invoke-virtual {v2}, Lkc1;->r()Landroid/content/res/Resources;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v1

    .line 1210
    invoke-virtual {v1, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1211
    .line 1212
    .line 1213
    move-result v1

    .line 1214
    mul-int/lit8 v19, v1, 0x4

    .line 1215
    .line 1216
    invoke-virtual {v2}, Lkc1;->r()Landroid/content/res/Resources;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v1

    .line 1220
    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1221
    .line 1222
    .line 1223
    move-result v20

    .line 1224
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v1

    .line 1228
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v1

    .line 1232
    invoke-virtual {v1, v13, v14}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 1233
    .line 1234
    .line 1235
    move-result v21

    .line 1236
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v1

    .line 1240
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v1

    .line 1244
    invoke-virtual {v1, v13, v14}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 1245
    .line 1246
    .line 1247
    move-result v22

    .line 1248
    invoke-direct/range {v17 .. v22}, Ljs0;-><init>(IIIII)V

    .line 1249
    .line 1250
    .line 1251
    move-object/from16 v1, v17

    .line 1252
    .line 1253
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->i(Lkw3;)V

    .line 1254
    .line 1255
    .line 1256
    :goto_8
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 1257
    .line 1258
    const-string v1, "HOME_SECTOR_MOST_PLAYED"

    .line 1259
    .line 1260
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/viewmodel/b;->d(Ljava/lang/String;)Z

    .line 1261
    .line 1262
    .line 1263
    move-result v0

    .line 1264
    if-eqz v0, :cond_15

    .line 1265
    .line 1266
    goto :goto_9

    .line 1267
    :cond_15
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 1268
    .line 1269
    iget-object v0, v0, Ltc1;->K:Landroidx/recyclerview/widget/RecyclerView;

    .line 1270
    .line 1271
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 1272
    .line 1273
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 1274
    .line 1275
    .line 1276
    invoke-direct {v1, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 1277
    .line 1278
    .line 1279
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 1280
    .line 1281
    .line 1282
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 1283
    .line 1284
    iget-object v0, v0, Ltc1;->K:Landroidx/recyclerview/widget/RecyclerView;

    .line 1285
    .line 1286
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 1287
    .line 1288
    .line 1289
    new-instance v0, Ls6;

    .line 1290
    .line 1291
    invoke-direct {v0, v2}, Ls6;-><init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;)V

    .line 1292
    .line 1293
    .line 1294
    iput-object v0, v2, Lcp1;->A0:Ls6;

    .line 1295
    .line 1296
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 1297
    .line 1298
    iget-object v1, v1, Ltc1;->K:Landroidx/recyclerview/widget/RecyclerView;

    .line 1299
    .line 1300
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 1301
    .line 1302
    .line 1303
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 1304
    .line 1305
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v1

    .line 1309
    iget-object v3, v0, Lcom/eddyizm/tempus/viewmodel/b;->t:Lk03;

    .line 1310
    .line 1311
    invoke-virtual {v3}, Lad2;->d()Ljava/lang/Object;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v4

    .line 1315
    if-nez v4, :cond_16

    .line 1316
    .line 1317
    iget-object v4, v0, Lcom/eddyizm/tempus/viewmodel/b;->d:Lrv2;

    .line 1318
    .line 1319
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1320
    .line 1321
    .line 1322
    const-string v4, "frequent"

    .line 1323
    .line 1324
    invoke-static {v4, v9, v14, v14}, Lrv2;->m(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)Lk03;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v4

    .line 1328
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/viewmodel/b;->h(Lk03;)Lmp1;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v0

    .line 1332
    invoke-virtual {v4, v1, v0}, Lad2;->e(Lba2;La83;)V

    .line 1333
    .line 1334
    .line 1335
    :cond_16
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v0

    .line 1339
    new-instance v1, Lxo1;

    .line 1340
    .line 1341
    invoke-direct {v1, v2, v8}, Lxo1;-><init>(Lcp1;I)V

    .line 1342
    .line 1343
    .line 1344
    invoke-virtual {v3, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 1345
    .line 1346
    .line 1347
    new-instance v0, Lxg0;

    .line 1348
    .line 1349
    invoke-direct {v0, v6}, Lxg0;-><init>(I)V

    .line 1350
    .line 1351
    .line 1352
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 1353
    .line 1354
    iget-object v1, v1, Ltc1;->K:Landroidx/recyclerview/widget/RecyclerView;

    .line 1355
    .line 1356
    invoke-virtual {v0, v1}, Lxg0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 1357
    .line 1358
    .line 1359
    :goto_9
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 1360
    .line 1361
    const-string v1, "HOME_SECTOR_LAST_PLAYED"

    .line 1362
    .line 1363
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/viewmodel/b;->d(Ljava/lang/String;)Z

    .line 1364
    .line 1365
    .line 1366
    move-result v0

    .line 1367
    if-eqz v0, :cond_17

    .line 1368
    .line 1369
    goto :goto_a

    .line 1370
    :cond_17
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 1371
    .line 1372
    iget-object v0, v0, Ltc1;->W:Landroidx/recyclerview/widget/RecyclerView;

    .line 1373
    .line 1374
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 1375
    .line 1376
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 1377
    .line 1378
    .line 1379
    invoke-direct {v1, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 1380
    .line 1381
    .line 1382
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 1383
    .line 1384
    .line 1385
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 1386
    .line 1387
    iget-object v0, v0, Ltc1;->W:Landroidx/recyclerview/widget/RecyclerView;

    .line 1388
    .line 1389
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 1390
    .line 1391
    .line 1392
    new-instance v0, Ls6;

    .line 1393
    .line 1394
    invoke-direct {v0, v2}, Ls6;-><init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;)V

    .line 1395
    .line 1396
    .line 1397
    iput-object v0, v2, Lcp1;->z0:Ls6;

    .line 1398
    .line 1399
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 1400
    .line 1401
    iget-object v1, v1, Ltc1;->W:Landroidx/recyclerview/widget/RecyclerView;

    .line 1402
    .line 1403
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 1404
    .line 1405
    .line 1406
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 1407
    .line 1408
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v1

    .line 1412
    iget-object v3, v0, Lcom/eddyizm/tempus/viewmodel/b;->u:Lk03;

    .line 1413
    .line 1414
    invoke-virtual {v3}, Lad2;->d()Ljava/lang/Object;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v4

    .line 1418
    if-nez v4, :cond_18

    .line 1419
    .line 1420
    iget-object v4, v0, Lcom/eddyizm/tempus/viewmodel/b;->d:Lrv2;

    .line 1421
    .line 1422
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1423
    .line 1424
    .line 1425
    const-string v4, "recent"

    .line 1426
    .line 1427
    invoke-static {v4, v9, v14, v14}, Lrv2;->m(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)Lk03;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v4

    .line 1431
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/viewmodel/b;->h(Lk03;)Lmp1;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v0

    .line 1435
    invoke-virtual {v4, v1, v0}, Lad2;->e(Lba2;La83;)V

    .line 1436
    .line 1437
    .line 1438
    :cond_18
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v0

    .line 1442
    new-instance v1, Lxo1;

    .line 1443
    .line 1444
    invoke-direct {v1, v2, v11}, Lxo1;-><init>(Lcp1;I)V

    .line 1445
    .line 1446
    .line 1447
    invoke-virtual {v3, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 1448
    .line 1449
    .line 1450
    new-instance v0, Lxg0;

    .line 1451
    .line 1452
    invoke-direct {v0, v6}, Lxg0;-><init>(I)V

    .line 1453
    .line 1454
    .line 1455
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 1456
    .line 1457
    iget-object v1, v1, Ltc1;->W:Landroidx/recyclerview/widget/RecyclerView;

    .line 1458
    .line 1459
    invoke-virtual {v0, v1}, Lxg0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 1460
    .line 1461
    .line 1462
    :goto_a
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 1463
    .line 1464
    const-string v1, "HOME_SECTOR_NEW_RELEASES"

    .line 1465
    .line 1466
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/viewmodel/b;->d(Ljava/lang/String;)Z

    .line 1467
    .line 1468
    .line 1469
    move-result v0

    .line 1470
    if-eqz v0, :cond_19

    .line 1471
    .line 1472
    goto/16 :goto_b

    .line 1473
    .line 1474
    :cond_19
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 1475
    .line 1476
    iget-object v0, v0, Ltc1;->N:Landroidx/recyclerview/widget/RecyclerView;

    .line 1477
    .line 1478
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 1479
    .line 1480
    .line 1481
    new-instance v0, Lb8;

    .line 1482
    .line 1483
    invoke-direct {v0, v2, v6}, Lb8;-><init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;I)V

    .line 1484
    .line 1485
    .line 1486
    iput-object v0, v2, Lcp1;->B0:Lb8;

    .line 1487
    .line 1488
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 1489
    .line 1490
    iget-object v1, v1, Ltc1;->N:Landroidx/recyclerview/widget/RecyclerView;

    .line 1491
    .line 1492
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 1493
    .line 1494
    .line 1495
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 1496
    .line 1497
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v1

    .line 1501
    iget-object v3, v0, Lcom/eddyizm/tempus/viewmodel/b;->m:Lk03;

    .line 1502
    .line 1503
    invoke-virtual {v3}, Lad2;->d()Ljava/lang/Object;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v4

    .line 1507
    if-nez v4, :cond_1a

    .line 1508
    .line 1509
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/viewmodel/b;->f(Lle1;)V

    .line 1510
    .line 1511
    .line 1512
    :cond_1a
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v0

    .line 1516
    new-instance v1, Lxo1;

    .line 1517
    .line 1518
    const/4 v4, 0x5

    .line 1519
    invoke-direct {v1, v2, v4}, Lxo1;-><init>(Lcp1;I)V

    .line 1520
    .line 1521
    .line 1522
    invoke-virtual {v3, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 1523
    .line 1524
    .line 1525
    new-instance v0, Lxg0;

    .line 1526
    .line 1527
    invoke-direct {v0, v10}, Lxg0;-><init>(I)V

    .line 1528
    .line 1529
    .line 1530
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 1531
    .line 1532
    iget-object v1, v1, Ltc1;->N:Landroidx/recyclerview/widget/RecyclerView;

    .line 1533
    .line 1534
    invoke-virtual {v0, v1}, Lxg0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 1535
    .line 1536
    .line 1537
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 1538
    .line 1539
    iget-object v0, v0, Ltc1;->N:Landroidx/recyclerview/widget/RecyclerView;

    .line 1540
    .line 1541
    new-instance v17, Ljs0;

    .line 1542
    .line 1543
    invoke-virtual {v2}, Lkc1;->r()Landroid/content/res/Resources;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v1

    .line 1547
    invoke-virtual {v1, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1548
    .line 1549
    .line 1550
    move-result v18

    .line 1551
    invoke-virtual {v2}, Lkc1;->r()Landroid/content/res/Resources;

    .line 1552
    .line 1553
    .line 1554
    move-result-object v1

    .line 1555
    invoke-virtual {v1, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1556
    .line 1557
    .line 1558
    move-result v1

    .line 1559
    mul-int/lit8 v19, v1, 0x4

    .line 1560
    .line 1561
    invoke-virtual {v2}, Lkc1;->r()Landroid/content/res/Resources;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v1

    .line 1565
    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1566
    .line 1567
    .line 1568
    move-result v20

    .line 1569
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v1

    .line 1573
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1574
    .line 1575
    .line 1576
    move-result-object v1

    .line 1577
    invoke-virtual {v1, v13, v14}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 1578
    .line 1579
    .line 1580
    move-result v21

    .line 1581
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v1

    .line 1585
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v1

    .line 1589
    invoke-virtual {v1, v13, v14}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 1590
    .line 1591
    .line 1592
    move-result v22

    .line 1593
    invoke-direct/range {v17 .. v22}, Ljs0;-><init>(IIIII)V

    .line 1594
    .line 1595
    .line 1596
    move-object/from16 v1, v17

    .line 1597
    .line 1598
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->i(Lkw3;)V

    .line 1599
    .line 1600
    .line 1601
    :goto_b
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 1602
    .line 1603
    const-string v1, "HOME_SECTOR_FLASHBACK"

    .line 1604
    .line 1605
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/viewmodel/b;->d(Ljava/lang/String;)Z

    .line 1606
    .line 1607
    .line 1608
    move-result v0

    .line 1609
    if-eqz v0, :cond_1b

    .line 1610
    .line 1611
    goto :goto_c

    .line 1612
    :cond_1b
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 1613
    .line 1614
    iget-object v0, v0, Ltc1;->r0:Landroidx/recyclerview/widget/RecyclerView;

    .line 1615
    .line 1616
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 1617
    .line 1618
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 1619
    .line 1620
    .line 1621
    invoke-direct {v1, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 1622
    .line 1623
    .line 1624
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 1625
    .line 1626
    .line 1627
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 1628
    .line 1629
    iget-object v0, v0, Ltc1;->r0:Landroidx/recyclerview/widget/RecyclerView;

    .line 1630
    .line 1631
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 1632
    .line 1633
    .line 1634
    new-instance v0, Luc4;

    .line 1635
    .line 1636
    invoke-direct {v0, v2, v10}, Luc4;-><init>(Lcp1;I)V

    .line 1637
    .line 1638
    .line 1639
    iput-object v0, v2, Lcp1;->C0:Luc4;

    .line 1640
    .line 1641
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 1642
    .line 1643
    iget-object v1, v1, Ltc1;->r0:Landroidx/recyclerview/widget/RecyclerView;

    .line 1644
    .line 1645
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 1646
    .line 1647
    .line 1648
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 1649
    .line 1650
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 1651
    .line 1652
    .line 1653
    move-result-object v1

    .line 1654
    iget-object v3, v0, Lcom/eddyizm/tempus/viewmodel/b;->v:Lk03;

    .line 1655
    .line 1656
    invoke-virtual {v3}, Lad2;->d()Ljava/lang/Object;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v4

    .line 1660
    if-nez v4, :cond_1c

    .line 1661
    .line 1662
    iget-object v4, v0, Lcom/eddyizm/tempus/viewmodel/b;->d:Lrv2;

    .line 1663
    .line 1664
    invoke-virtual {v4}, Lrv2;->n()Lk03;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v4

    .line 1668
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/viewmodel/b;->h(Lk03;)Lmp1;

    .line 1669
    .line 1670
    .line 1671
    move-result-object v0

    .line 1672
    invoke-virtual {v4, v1, v0}, Lad2;->e(Lba2;La83;)V

    .line 1673
    .line 1674
    .line 1675
    :cond_1c
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v0

    .line 1679
    new-instance v1, Lxo1;

    .line 1680
    .line 1681
    const/16 v4, 0x10

    .line 1682
    .line 1683
    invoke-direct {v1, v2, v4}, Lxo1;-><init>(Lcp1;I)V

    .line 1684
    .line 1685
    .line 1686
    invoke-virtual {v3, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 1687
    .line 1688
    .line 1689
    new-instance v0, Lxg0;

    .line 1690
    .line 1691
    invoke-direct {v0, v6}, Lxg0;-><init>(I)V

    .line 1692
    .line 1693
    .line 1694
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 1695
    .line 1696
    iget-object v1, v1, Ltc1;->r0:Landroidx/recyclerview/widget/RecyclerView;

    .line 1697
    .line 1698
    invoke-virtual {v0, v1}, Lxg0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 1699
    .line 1700
    .line 1701
    :goto_c
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 1702
    .line 1703
    const-string v1, "HOME_SECTOR_RECENTLY_ADDED"

    .line 1704
    .line 1705
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/viewmodel/b;->d(Ljava/lang/String;)Z

    .line 1706
    .line 1707
    .line 1708
    move-result v0

    .line 1709
    if-eqz v0, :cond_1d

    .line 1710
    .line 1711
    goto :goto_d

    .line 1712
    :cond_1d
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 1713
    .line 1714
    iget-object v0, v0, Ltc1;->T:Landroidx/recyclerview/widget/RecyclerView;

    .line 1715
    .line 1716
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 1717
    .line 1718
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 1719
    .line 1720
    .line 1721
    invoke-direct {v1, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 1722
    .line 1723
    .line 1724
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 1725
    .line 1726
    .line 1727
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 1728
    .line 1729
    iget-object v0, v0, Ltc1;->T:Landroidx/recyclerview/widget/RecyclerView;

    .line 1730
    .line 1731
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 1732
    .line 1733
    .line 1734
    new-instance v0, Ls6;

    .line 1735
    .line 1736
    invoke-direct {v0, v2}, Ls6;-><init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;)V

    .line 1737
    .line 1738
    .line 1739
    iput-object v0, v2, Lcp1;->y0:Ls6;

    .line 1740
    .line 1741
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 1742
    .line 1743
    iget-object v1, v1, Ltc1;->T:Landroidx/recyclerview/widget/RecyclerView;

    .line 1744
    .line 1745
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 1746
    .line 1747
    .line 1748
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 1749
    .line 1750
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v1

    .line 1754
    iget-object v3, v0, Lcom/eddyizm/tempus/viewmodel/b;->w:Lk03;

    .line 1755
    .line 1756
    invoke-virtual {v3}, Lad2;->d()Ljava/lang/Object;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v4

    .line 1760
    if-nez v4, :cond_1e

    .line 1761
    .line 1762
    iget-object v4, v0, Lcom/eddyizm/tempus/viewmodel/b;->d:Lrv2;

    .line 1763
    .line 1764
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1765
    .line 1766
    .line 1767
    const-string v4, "newest"

    .line 1768
    .line 1769
    invoke-static {v4, v9, v14, v14}, Lrv2;->m(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)Lk03;

    .line 1770
    .line 1771
    .line 1772
    move-result-object v4

    .line 1773
    invoke-virtual {v0, v3}, Lcom/eddyizm/tempus/viewmodel/b;->h(Lk03;)Lmp1;

    .line 1774
    .line 1775
    .line 1776
    move-result-object v0

    .line 1777
    invoke-virtual {v4, v1, v0}, Lad2;->e(Lba2;La83;)V

    .line 1778
    .line 1779
    .line 1780
    :cond_1e
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 1781
    .line 1782
    .line 1783
    move-result-object v0

    .line 1784
    new-instance v1, Lxo1;

    .line 1785
    .line 1786
    const/16 v4, 0xf

    .line 1787
    .line 1788
    invoke-direct {v1, v2, v4}, Lxo1;-><init>(Lcp1;I)V

    .line 1789
    .line 1790
    .line 1791
    invoke-virtual {v3, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 1792
    .line 1793
    .line 1794
    new-instance v0, Lxg0;

    .line 1795
    .line 1796
    invoke-direct {v0, v6}, Lxg0;-><init>(I)V

    .line 1797
    .line 1798
    .line 1799
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 1800
    .line 1801
    iget-object v1, v1, Ltc1;->T:Landroidx/recyclerview/widget/RecyclerView;

    .line 1802
    .line 1803
    invoke-virtual {v0, v1}, Lxg0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 1804
    .line 1805
    .line 1806
    :goto_d
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 1807
    .line 1808
    const-string v1, "HOME_SECTOR_TOP_SONGS"

    .line 1809
    .line 1810
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/viewmodel/b;->d(Ljava/lang/String;)Z

    .line 1811
    .line 1812
    .line 1813
    move-result v0

    .line 1814
    if-eqz v0, :cond_1f

    .line 1815
    .line 1816
    goto/16 :goto_e

    .line 1817
    .line 1818
    :cond_1f
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 1819
    .line 1820
    iget-object v0, v0, Ltc1;->q0:Landroidx/recyclerview/widget/RecyclerView;

    .line 1821
    .line 1822
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 1823
    .line 1824
    .line 1825
    new-instance v0, Lni4;

    .line 1826
    .line 1827
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 1828
    .line 1829
    .line 1830
    move-result-object v1

    .line 1831
    const/4 v4, 0x0

    .line 1832
    const/4 v5, 0x0

    .line 1833
    const/4 v3, 0x1

    .line 1834
    invoke-direct/range {v0 .. v5}, Lni4;-><init>(Lle1;Lcom/eddyizm/tempus/interfaces/ClickCallback;ZZLcom/eddyizm/tempus/subsonic/models/AlbumID3;)V

    .line 1835
    .line 1836
    .line 1837
    iput-object v0, v2, Lcp1;->v0:Lni4;

    .line 1838
    .line 1839
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 1840
    .line 1841
    iget-object v1, v1, Ltc1;->q0:Landroidx/recyclerview/widget/RecyclerView;

    .line 1842
    .line 1843
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 1844
    .line 1845
    .line 1846
    iget-object v0, v2, Lcp1;->v0:Lni4;

    .line 1847
    .line 1848
    iget-object v1, v2, Lcp1;->F0:Lbl2;

    .line 1849
    .line 1850
    iput-object v1, v0, Lni4;->A:Lbl2;

    .line 1851
    .line 1852
    invoke-virtual {v2}, Lcp1;->i0()V

    .line 1853
    .line 1854
    .line 1855
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 1856
    .line 1857
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v1

    .line 1861
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1862
    .line 1863
    .line 1864
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 1865
    .line 1866
    .line 1867
    move-result-object v3

    .line 1868
    invoke-static {}, Lud3;->E()Ljava/lang/String;

    .line 1869
    .line 1870
    .line 1871
    move-result-object v21

    .line 1872
    const/4 v4, 0x3

    .line 1873
    invoke-virtual {v3, v4}, Ljava/util/Calendar;->get(I)I

    .line 1874
    .line 1875
    .line 1876
    move-result v5

    .line 1877
    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 1878
    .line 1879
    .line 1880
    move-result-wide v19

    .line 1881
    sub-int/2addr v5, v10

    .line 1882
    invoke-virtual {v3, v4, v5}, Ljava/util/Calendar;->set(II)V

    .line 1883
    .line 1884
    .line 1885
    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 1886
    .line 1887
    .line 1888
    move-result-wide v17

    .line 1889
    iget-object v3, v0, Lcom/eddyizm/tempus/viewmodel/b;->f:Lzh0;

    .line 1890
    .line 1891
    iget-object v3, v3, Lzh0;->o:Ljava/lang/Object;

    .line 1892
    .line 1893
    check-cast v3, Lr20;

    .line 1894
    .line 1895
    iget-object v4, v3, Lr20;->o:Ljava/lang/Object;

    .line 1896
    .line 1897
    check-cast v4, Ls24;

    .line 1898
    .line 1899
    invoke-virtual {v4}, Ls24;->i()Ls12;

    .line 1900
    .line 1901
    .line 1902
    move-result-object v4

    .line 1903
    const-string v5, "chronology"

    .line 1904
    .line 1905
    filled-new-array {v5}, [Ljava/lang/String;

    .line 1906
    .line 1907
    .line 1908
    move-result-object v5

    .line 1909
    new-instance v15, Lp20;

    .line 1910
    .line 1911
    move-object/from16 v16, v3

    .line 1912
    .line 1913
    invoke-direct/range {v15 .. v21}, Lp20;-><init>(Lr20;JJLjava/lang/String;)V

    .line 1914
    .line 1915
    .line 1916
    invoke-virtual {v4, v5, v15}, Ls12;->a([Ljava/lang/String;Lif1;)Lt24;

    .line 1917
    .line 1918
    .line 1919
    move-result-object v3

    .line 1920
    iget-object v0, v0, Lcom/eddyizm/tempus/viewmodel/b;->x:Lk03;

    .line 1921
    .line 1922
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1923
    .line 1924
    .line 1925
    new-instance v4, Lg7;

    .line 1926
    .line 1927
    invoke-direct {v4, v0, v6}, Lg7;-><init>(Lk03;I)V

    .line 1928
    .line 1929
    .line 1930
    invoke-virtual {v3, v1, v4}, Lad2;->e(Lba2;La83;)V

    .line 1931
    .line 1932
    .line 1933
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 1934
    .line 1935
    .line 1936
    move-result-object v1

    .line 1937
    new-instance v3, Lxo1;

    .line 1938
    .line 1939
    const/16 v4, 0xe

    .line 1940
    .line 1941
    invoke-direct {v3, v2, v4}, Lxo1;-><init>(Lcp1;I)V

    .line 1942
    .line 1943
    .line 1944
    invoke-virtual {v0, v1, v3}, Lad2;->e(Lba2;La83;)V

    .line 1945
    .line 1946
    .line 1947
    new-instance v0, Lxg0;

    .line 1948
    .line 1949
    invoke-direct {v0, v10}, Lxg0;-><init>(I)V

    .line 1950
    .line 1951
    .line 1952
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 1953
    .line 1954
    iget-object v1, v1, Ltc1;->q0:Landroidx/recyclerview/widget/RecyclerView;

    .line 1955
    .line 1956
    invoke-virtual {v0, v1}, Lxg0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 1957
    .line 1958
    .line 1959
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 1960
    .line 1961
    iget-object v0, v0, Ltc1;->q0:Landroidx/recyclerview/widget/RecyclerView;

    .line 1962
    .line 1963
    new-instance v15, Ljs0;

    .line 1964
    .line 1965
    invoke-virtual {v2}, Lkc1;->r()Landroid/content/res/Resources;

    .line 1966
    .line 1967
    .line 1968
    move-result-object v1

    .line 1969
    invoke-virtual {v1, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1970
    .line 1971
    .line 1972
    move-result v16

    .line 1973
    invoke-virtual {v2}, Lkc1;->r()Landroid/content/res/Resources;

    .line 1974
    .line 1975
    .line 1976
    move-result-object v1

    .line 1977
    invoke-virtual {v1, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1978
    .line 1979
    .line 1980
    move-result v1

    .line 1981
    mul-int/lit8 v17, v1, 0x4

    .line 1982
    .line 1983
    invoke-virtual {v2}, Lkc1;->r()Landroid/content/res/Resources;

    .line 1984
    .line 1985
    .line 1986
    move-result-object v1

    .line 1987
    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1988
    .line 1989
    .line 1990
    move-result v18

    .line 1991
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 1992
    .line 1993
    .line 1994
    move-result-object v1

    .line 1995
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1996
    .line 1997
    .line 1998
    move-result-object v1

    .line 1999
    invoke-virtual {v1, v13, v14}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 2000
    .line 2001
    .line 2002
    move-result v19

    .line 2003
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 2004
    .line 2005
    .line 2006
    move-result-object v1

    .line 2007
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2008
    .line 2009
    .line 2010
    move-result-object v1

    .line 2011
    invoke-virtual {v1, v13, v14}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 2012
    .line 2013
    .line 2014
    move-result v20

    .line 2015
    invoke-direct/range {v15 .. v20}, Ljs0;-><init>(IIIII)V

    .line 2016
    .line 2017
    .line 2018
    invoke-virtual {v0, v15}, Landroidx/recyclerview/widget/RecyclerView;->i(Lkw3;)V

    .line 2019
    .line 2020
    .line 2021
    :goto_e
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 2022
    .line 2023
    const-string v1, "HOME_SECTOR_PINNED_PLAYLISTS"

    .line 2024
    .line 2025
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/viewmodel/b;->d(Ljava/lang/String;)Z

    .line 2026
    .line 2027
    .line 2028
    move-result v0

    .line 2029
    if-eqz v0, :cond_20

    .line 2030
    .line 2031
    goto :goto_f

    .line 2032
    :cond_20
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 2033
    .line 2034
    iget-object v0, v0, Ltc1;->O:Landroidx/recyclerview/widget/RecyclerView;

    .line 2035
    .line 2036
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 2037
    .line 2038
    .line 2039
    new-instance v0, Lej;

    .line 2040
    .line 2041
    invoke-direct {v0, v2}, Lej;-><init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;)V

    .line 2042
    .line 2043
    .line 2044
    iput-object v0, v2, Lcp1;->D0:Lej;

    .line 2045
    .line 2046
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 2047
    .line 2048
    iget-object v1, v1, Ltc1;->O:Landroidx/recyclerview/widget/RecyclerView;

    .line 2049
    .line 2050
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 2051
    .line 2052
    .line 2053
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 2054
    .line 2055
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 2056
    .line 2057
    .line 2058
    iget-object v0, v0, Lcom/eddyizm/tempus/viewmodel/b;->B:Llu2;

    .line 2059
    .line 2060
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 2061
    .line 2062
    .line 2063
    move-result-object v1

    .line 2064
    new-instance v3, Lxo1;

    .line 2065
    .line 2066
    const/4 v4, 0x3

    .line 2067
    invoke-direct {v3, v2, v4}, Lxo1;-><init>(Lcp1;I)V

    .line 2068
    .line 2069
    .line 2070
    invoke-virtual {v0, v1, v3}, Lad2;->e(Lba2;La83;)V

    .line 2071
    .line 2072
    .line 2073
    new-instance v0, Lxg0;

    .line 2074
    .line 2075
    invoke-direct {v0, v10}, Lxg0;-><init>(I)V

    .line 2076
    .line 2077
    .line 2078
    iget-object v1, v2, Lcp1;->l0:Ltc1;

    .line 2079
    .line 2080
    iget-object v1, v1, Ltc1;->O:Landroidx/recyclerview/widget/RecyclerView;

    .line 2081
    .line 2082
    invoke-virtual {v0, v1}, Lxg0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 2083
    .line 2084
    .line 2085
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 2086
    .line 2087
    iget-object v0, v0, Ltc1;->O:Landroidx/recyclerview/widget/RecyclerView;

    .line 2088
    .line 2089
    new-instance v15, Ljs0;

    .line 2090
    .line 2091
    invoke-virtual {v2}, Lkc1;->r()Landroid/content/res/Resources;

    .line 2092
    .line 2093
    .line 2094
    move-result-object v1

    .line 2095
    invoke-virtual {v1, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 2096
    .line 2097
    .line 2098
    move-result v16

    .line 2099
    invoke-virtual {v2}, Lkc1;->r()Landroid/content/res/Resources;

    .line 2100
    .line 2101
    .line 2102
    move-result-object v1

    .line 2103
    invoke-virtual {v1, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 2104
    .line 2105
    .line 2106
    move-result v1

    .line 2107
    mul-int/lit8 v17, v1, 0x4

    .line 2108
    .line 2109
    invoke-virtual {v2}, Lkc1;->r()Landroid/content/res/Resources;

    .line 2110
    .line 2111
    .line 2112
    move-result-object v1

    .line 2113
    invoke-virtual {v1, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 2114
    .line 2115
    .line 2116
    move-result v18

    .line 2117
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 2118
    .line 2119
    .line 2120
    move-result-object v1

    .line 2121
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2122
    .line 2123
    .line 2124
    move-result-object v1

    .line 2125
    invoke-virtual {v1, v13, v14}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 2126
    .line 2127
    .line 2128
    move-result v19

    .line 2129
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 2130
    .line 2131
    .line 2132
    move-result-object v1

    .line 2133
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2134
    .line 2135
    .line 2136
    move-result-object v1

    .line 2137
    invoke-virtual {v1, v13, v14}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 2138
    .line 2139
    .line 2140
    move-result v20

    .line 2141
    invoke-direct/range {v15 .. v20}, Ljs0;-><init>(IIIII)V

    .line 2142
    .line 2143
    .line 2144
    invoke-virtual {v0, v15}, Landroidx/recyclerview/widget/RecyclerView;->i(Lkw3;)V

    .line 2145
    .line 2146
    .line 2147
    :goto_f
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 2148
    .line 2149
    const-string v1, "HOME_SECTOR_SHARED"

    .line 2150
    .line 2151
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/viewmodel/b;->d(Ljava/lang/String;)Z

    .line 2152
    .line 2153
    .line 2154
    move-result v0

    .line 2155
    const/16 v1, 0xc

    .line 2156
    .line 2157
    if-eqz v0, :cond_21

    .line 2158
    .line 2159
    goto/16 :goto_10

    .line 2160
    .line 2161
    :cond_21
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 2162
    .line 2163
    iget-object v0, v0, Ltc1;->Z:Landroidx/recyclerview/widget/RecyclerView;

    .line 2164
    .line 2165
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 2166
    .line 2167
    .line 2168
    new-instance v0, Luc4;

    .line 2169
    .line 2170
    invoke-direct {v0, v2, v6}, Luc4;-><init>(Lcp1;I)V

    .line 2171
    .line 2172
    .line 2173
    iput-object v0, v2, Lcp1;->E0:Luc4;

    .line 2174
    .line 2175
    iget-object v3, v2, Lcp1;->l0:Ltc1;

    .line 2176
    .line 2177
    iget-object v3, v3, Ltc1;->Z:Landroidx/recyclerview/widget/RecyclerView;

    .line 2178
    .line 2179
    invoke-virtual {v3, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 2180
    .line 2181
    .line 2182
    invoke-static {}, Lud3;->V()Z

    .line 2183
    .line 2184
    .line 2185
    move-result v0

    .line 2186
    if-eqz v0, :cond_23

    .line 2187
    .line 2188
    iget-object v0, v2, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 2189
    .line 2190
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 2191
    .line 2192
    .line 2193
    move-result-object v3

    .line 2194
    iget-object v4, v0, Lcom/eddyizm/tempus/viewmodel/b;->C:Lk03;

    .line 2195
    .line 2196
    invoke-virtual {v4}, Lad2;->d()Ljava/lang/Object;

    .line 2197
    .line 2198
    .line 2199
    move-result-object v5

    .line 2200
    if-nez v5, :cond_22

    .line 2201
    .line 2202
    iget-object v0, v0, Lcom/eddyizm/tempus/viewmodel/b;->i:Lhh3;

    .line 2203
    .line 2204
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2205
    .line 2206
    .line 2207
    invoke-static {}, Lhh3;->m()Lk03;

    .line 2208
    .line 2209
    .line 2210
    move-result-object v0

    .line 2211
    new-instance v5, Lg7;

    .line 2212
    .line 2213
    invoke-direct {v5, v4, v6}, Lg7;-><init>(Lk03;I)V

    .line 2214
    .line 2215
    .line 2216
    invoke-virtual {v0, v3, v5}, Lad2;->e(Lba2;La83;)V

    .line 2217
    .line 2218
    .line 2219
    :cond_22
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 2220
    .line 2221
    .line 2222
    move-result-object v0

    .line 2223
    new-instance v3, Lxo1;

    .line 2224
    .line 2225
    invoke-direct {v3, v2, v1}, Lxo1;-><init>(Lcp1;I)V

    .line 2226
    .line 2227
    .line 2228
    invoke-virtual {v4, v0, v3}, Lad2;->e(Lba2;La83;)V

    .line 2229
    .line 2230
    .line 2231
    :cond_23
    new-instance v0, Lxg0;

    .line 2232
    .line 2233
    invoke-direct {v0, v10}, Lxg0;-><init>(I)V

    .line 2234
    .line 2235
    .line 2236
    iget-object v3, v2, Lcp1;->l0:Ltc1;

    .line 2237
    .line 2238
    iget-object v3, v3, Ltc1;->Z:Landroidx/recyclerview/widget/RecyclerView;

    .line 2239
    .line 2240
    invoke-virtual {v0, v3}, Lxg0;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 2241
    .line 2242
    .line 2243
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 2244
    .line 2245
    iget-object v0, v0, Ltc1;->Z:Landroidx/recyclerview/widget/RecyclerView;

    .line 2246
    .line 2247
    new-instance v15, Ljs0;

    .line 2248
    .line 2249
    invoke-virtual {v2}, Lkc1;->r()Landroid/content/res/Resources;

    .line 2250
    .line 2251
    .line 2252
    move-result-object v3

    .line 2253
    invoke-virtual {v3, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 2254
    .line 2255
    .line 2256
    move-result v16

    .line 2257
    invoke-virtual {v2}, Lkc1;->r()Landroid/content/res/Resources;

    .line 2258
    .line 2259
    .line 2260
    move-result-object v3

    .line 2261
    invoke-virtual {v3, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 2262
    .line 2263
    .line 2264
    move-result v3

    .line 2265
    mul-int/lit8 v17, v3, 0x4

    .line 2266
    .line 2267
    invoke-virtual {v2}, Lkc1;->r()Landroid/content/res/Resources;

    .line 2268
    .line 2269
    .line 2270
    move-result-object v3

    .line 2271
    invoke-virtual {v3, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 2272
    .line 2273
    .line 2274
    move-result v18

    .line 2275
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 2276
    .line 2277
    .line 2278
    move-result-object v3

    .line 2279
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2280
    .line 2281
    .line 2282
    move-result-object v3

    .line 2283
    invoke-virtual {v3, v13, v14}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 2284
    .line 2285
    .line 2286
    move-result v19

    .line 2287
    invoke-virtual {v2}, Lkc1;->Z()Landroid/content/Context;

    .line 2288
    .line 2289
    .line 2290
    move-result-object v3

    .line 2291
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2292
    .line 2293
    .line 2294
    move-result-object v3

    .line 2295
    invoke-virtual {v3, v13, v14}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 2296
    .line 2297
    .line 2298
    move-result v20

    .line 2299
    invoke-direct/range {v15 .. v20}, Ljs0;-><init>(IIIII)V

    .line 2300
    .line 2301
    .line 2302
    invoke-virtual {v0, v15}, Landroidx/recyclerview/widget/RecyclerView;->i(Lkw3;)V

    .line 2303
    .line 2304
    .line 2305
    :goto_10
    new-instance v0, Landroid/os/Handler;

    .line 2306
    .line 2307
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 2308
    .line 2309
    .line 2310
    new-instance v3, Lzo1;

    .line 2311
    .line 2312
    invoke-direct {v3, v2, v10}, Lzo1;-><init>(Lcp1;I)V

    .line 2313
    .line 2314
    .line 2315
    const-wide/16 v4, 0x1388

    .line 2316
    .line 2317
    invoke-virtual {v0, v3, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 2318
    .line 2319
    .line 2320
    iget-object v0, v2, Lcp1;->l0:Ltc1;

    .line 2321
    .line 2322
    iget-object v0, v0, Ltc1;->w:Landroid/widget/Button;

    .line 2323
    .line 2324
    new-instance v3, Lgo1;

    .line 2325
    .line 2326
    invoke-direct {v3, v2, v1}, Lgo1;-><init>(Lcp1;I)V

    .line 2327
    .line 2328
    .line 2329
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2330
    .line 2331
    .line 2332
    iget-object v0, v2, Lcp1;->o0:Lvf2;

    .line 2333
    .line 2334
    iget-object v0, v0, Lvf2;->d:Lk03;

    .line 2335
    .line 2336
    invoke-virtual {v2}, Lkc1;->v()Lle1;

    .line 2337
    .line 2338
    .line 2339
    move-result-object v1

    .line 2340
    new-instance v3, Lxo1;

    .line 2341
    .line 2342
    const/4 v4, 0x6

    .line 2343
    invoke-direct {v3, v2, v4}, Lxo1;-><init>(Lcp1;I)V

    .line 2344
    .line 2345
    .line 2346
    invoke-virtual {v0, v1, v3}, Lad2;->e(Lba2;La83;)V

    .line 2347
    .line 2348
    .line 2349
    invoke-virtual {v2}, Lcp1;->j0()V

    .line 2350
    .line 2351
    .line 2352
    return-void
.end method

.method public final h0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcp1;->u0:Lni4;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcp1;->p0:Lli3;

    .line 6
    .line 7
    iget-object v0, v0, Lli3;->b:Lk03;

    .line 8
    .line 9
    invoke-virtual {v0}, Lad2;->d()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p0, Lcp1;->p0:Lli3;

    .line 16
    .line 17
    iget-object v1, v1, Lli3;->c:Lk03;

    .line 18
    .line 19
    invoke-virtual {v1}, Lad2;->d()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/Boolean;

    .line 24
    .line 25
    iget-object p0, p0, Lcp1;->u0:Lni4;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v1, 0x0

    .line 38
    :goto_0
    invoke-virtual {p0, v0, v1}, Lni4;->s(Ljava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public final i0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcp1;->v0:Lni4;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcp1;->p0:Lli3;

    .line 6
    .line 7
    iget-object v0, v0, Lli3;->b:Lk03;

    .line 8
    .line 9
    invoke-virtual {v0}, Lad2;->d()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p0, Lcp1;->p0:Lli3;

    .line 16
    .line 17
    iget-object v1, v1, Lli3;->c:Lk03;

    .line 18
    .line 19
    invoke-virtual {v1}, Lad2;->d()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Ljava/lang/Boolean;

    .line 24
    .line 25
    iget-object p0, p0, Lcp1;->v0:Lni4;

    .line 26
    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v1, 0x0

    .line 38
    :goto_0
    invoke-virtual {p0, v0, v1}, Lni4;->s(Ljava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void
.end method

.method public final j0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcp1;->l0:Ltc1;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 6
    .line 7
    iget-object v1, v1, Lcom/eddyizm/tempus/viewmodel/b;->D:Ljava/util/List;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-boolean v1, p0, Lcp1;->I0:Z

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const/4 v1, 0x1

    .line 18
    iput-boolean v1, p0, Lcp1;->I0:Z

    .line 19
    .line 20
    iget-object v0, v0, Ltc1;->q:Landroid/widget/LinearLayout;

    .line 21
    .line 22
    new-instance v1, Lzo1;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v1, p0, v2}, Lzo1;-><init>(Lcp1;I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 29
    .line 30
    .line 31
    :cond_2
    :goto_0
    return-void
.end method

.method public final onAlbumClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lgb;->x(Landroid/view/View;)Lv23;

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
    invoke-virtual {p0, v0, p1, v1}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onAlbumLongClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lgb;->x(Landroid/view/View;)Lv23;

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
    invoke-virtual {p0, v0, p1, v1}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onArtistClick(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    const-string v0, "MEDIA_MIX"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const-string v2, "ARTIST_OBJECT"

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 22
    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    goto/16 :goto_0

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    new-instance v2, Lk6;

    .line 34
    .line 35
    const/16 v3, 0x1b

    .line 36
    .line 37
    invoke-direct {v2, v3, p0, p1}, Lk6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    sget-object p0, Lcom/eddyizm/tempus/homemusic/b;->a:Ljava/lang/ref/WeakReference;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {}, Lcx;->h()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_1

    .line 53
    .line 54
    invoke-virtual {v2}, Lk6;->run()V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    const-string p0, "nd_artist_id"

    .line 59
    .line 60
    invoke-static {p0, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    const-string p1, "radio"

    .line 68
    .line 69
    invoke-static {v0, p0, v2, p1}, Lcom/eddyizm/tempus/homemusic/b;->l(Lcom/eddyizm/tempus/ui/activity/MainActivity;Ljava/util/Map;Lk6;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_2
    const-string v0, "MEDIA_BEST_OF"

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_5

    .line 80
    .line 81
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_5

    .line 86
    .line 87
    invoke-virtual {p1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 92
    .line 93
    if-nez p1, :cond_3

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    iget-object v0, p0, Lcp1;->F0:Lbl2;

    .line 97
    .line 98
    if-eqz v0, :cond_4

    .line 99
    .line 100
    iget-object v0, p0, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    new-instance v1, Lk03;

    .line 106
    .line 107
    invoke-direct {v1}, Lad2;-><init>()V

    .line 108
    .line 109
    .line 110
    iget-object v2, v0, Lcom/eddyizm/tempus/viewmodel/b;->e:Lpa;

    .line 111
    .line 112
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    const/16 v2, 0xa

    .line 120
    .line 121
    invoke-static {v2, v3}, Lpa;->z(ILjava/lang/String;)Lk03;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    new-instance v3, Lnp1;

    .line 126
    .line 127
    invoke-direct {v3, v0, v1, p1}, Lnp1;-><init>(Lcom/eddyizm/tempus/viewmodel/b;Lk03;Lcom/eddyizm/tempus/subsonic/models/ArtistID3;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2, v3}, Lad2;->f(La83;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    new-instance v0, Lxo1;

    .line 138
    .line 139
    const/16 v2, 0x13

    .line 140
    .line 141
    invoke-direct {v0, p0, v2}, Lxo1;-><init>(Lcp1;I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1, p1, v0}, Lad2;->e(Lba2;La83;)V

    .line 145
    .line 146
    .line 147
    :cond_4
    :goto_0
    return-void

    .line 148
    :cond_5
    invoke-virtual {p0}, Lkc1;->a0()Landroid/view/View;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-static {p0}, Lgb;->x(Landroid/view/View;)Lv23;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    const v0, 0x7f0a00e2

    .line 157
    .line 158
    .line 159
    const/4 v1, 0x0

    .line 160
    invoke-virtual {p0, v0, p1, v1}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 161
    .line 162
    .line 163
    return-void
.end method

.method public final onArtistLongClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lgb;->x(Landroid/view/View;)Lv23;

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
    invoke-virtual {p0, v0, p1, v1}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onMediaClick(Landroid/os/Bundle;)V
    .locals 7

    .line 1
    const-string v0, "MEDIA_MIX"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "TRACK_OBJECT"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 17
    .line 18
    iget-object v0, p0, Lcp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 19
    .line 20
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 21
    .line 22
    iget-object v0, v0, Lzg5;->n:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lau;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lau;->d(Z)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcp1;->F0:Lbl2;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    new-array v0, v1, [Z

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    aput-boolean v1, v0, v1

    .line 37
    .line 38
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const v3, 0x7f13008c

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v3, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 50
    .line 51
    .line 52
    iget-object v2, p0, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 53
    .line 54
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    iget-object v4, v2, Lcom/eddyizm/tempus/viewmodel/b;->y:Lk03;

    .line 59
    .line 60
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 61
    .line 62
    invoke-virtual {v4, v5}, Lad2;->k(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object v2, v2, Lcom/eddyizm/tempus/viewmodel/b;->c:Lxi4;

    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    sget-object v5, Lfb0;->p:Lfb0;

    .line 72
    .line 73
    const/16 v6, 0x14

    .line 74
    .line 75
    invoke-virtual {v2, p1, v5, v6}, Lxi4;->o(Ljava/lang/String;Lfb0;I)Lk03;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    new-instance v2, Lg7;

    .line 80
    .line 81
    invoke-direct {v2, v4, v1}, Lg7;-><init>(Lk03;I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v3, v2}, Lad2;->e(Lba2;La83;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    new-instance v1, Lf7;

    .line 92
    .line 93
    const/4 v2, 0x2

    .line 94
    invoke-direct {v1, v2, p0, v0}, Lf7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4, p1, v1}, Lad2;->e(Lba2;La83;)V

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    const-string v0, "MEDIA_CHRONOLOGY"

    .line 102
    .line 103
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    const-string v2, "ITEM_POSITION"

    .line 108
    .line 109
    const-string v3, "TRACKS_OBJECT"

    .line 110
    .line 111
    if-eqz v0, :cond_1

    .line 112
    .line 113
    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iget-object v3, p0, Lcp1;->F0:Lbl2;

    .line 118
    .line 119
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    invoke-static {v3, v0, p1}, Lbo2;->o(Lic2;Ljava/util/List;I)V

    .line 124
    .line 125
    .line 126
    iget-object p1, p0, Lcp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 127
    .line 128
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 129
    .line 130
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast p1, Lau;

    .line 133
    .line 134
    invoke-virtual {p1, v1}, Lau;->d(Z)V

    .line 135
    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_1
    iget-object v0, p0, Lcp1;->F0:Lbl2;

    .line 139
    .line 140
    invoke-virtual {p1, v3}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    invoke-static {v0, v3, p1}, Lbo2;->o(Lic2;Ljava/util/List;I)V

    .line 149
    .line 150
    .line 151
    iget-object p1, p0, Lcp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 152
    .line 153
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 154
    .line 155
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p1, Lau;

    .line 158
    .line 159
    invoke-virtual {p1, v1}, Lau;->d(Z)V

    .line 160
    .line 161
    .line 162
    :cond_2
    :goto_0
    iget-object p1, p0, Lcp1;->v0:Lni4;

    .line 163
    .line 164
    invoke-virtual {p1}, Ldw3;->d()V

    .line 165
    .line 166
    .line 167
    iget-object p0, p0, Lcp1;->u0:Lni4;

    .line 168
    .line 169
    invoke-virtual {p0}, Ldw3;->d()V

    .line 170
    .line 171
    .line 172
    return-void
.end method

.method public final onMediaLongClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lgb;->x(Landroid/view/View;)Lv23;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a0595

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, p1, v1}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onPlaylistClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lgb;->x(Landroid/view/View;)Lv23;

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
    invoke-virtual {p0, v0, p1, v1}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onPlaylistLongClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lgb;->x(Landroid/view/View;)Lv23;

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
    invoke-virtual {p0, v0, p1, v1}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onShareClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "share_object"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Share;

    .line 8
    .line 9
    new-instance v0, Landroid/content/Intent;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Share;->getUrl()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v1, "android.intent.action.VIEW"

    .line 20
    .line 21
    invoke-direct {v0, v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 22
    .line 23
    .line 24
    const/high16 p1, 0x10000000

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p0, p1}, Lkc1;->g0(Landroid/content/Intent;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final onShareLongClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lgb;->x(Landroid/view/View;)Lv23;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const v0, 0x7f0a0570

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p0, v0, p1, v1}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final onYearClick(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lkc1;->a0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lgb;->x(Landroid/view/View;)Lv23;

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
    invoke-virtual {p0, v0, p1, v1}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
