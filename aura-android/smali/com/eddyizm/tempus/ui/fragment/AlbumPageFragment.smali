.class public Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ClickCallback;


# instance fields
.field public l0:Lpc1;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Ln8;

.field public o0:Lli3;

.field public p0:Lni4;

.field public q0:Lbl2;

.field public r0:Lk03;

.field public s0:Lg8;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkc1;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final F(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lkc1;->F(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lkc1;->d0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final G(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 0

    .line 1
    const/high16 p0, 0x7f0f0000

    .line 2
    .line 3
    invoke-virtual {p2, p0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 24

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
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 10
    .line 11
    const v1, 0x7f0d0063

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
    const v3, 0x7f0a00a2

    .line 24
    .line 25
    .line 26
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    move-object v7, v4

    .line 31
    check-cast v7, Landroid/widget/TextView;

    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    if-eqz v7, :cond_c

    .line 35
    .line 36
    const v3, 0x7f0a00a4

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    check-cast v5, Landroid/widget/TextView;

    .line 44
    .line 45
    if-eqz v5, :cond_c

    .line 46
    .line 47
    const v3, 0x7f0a00a9

    .line 48
    .line 49
    .line 50
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    move-object v8, v5

    .line 55
    check-cast v8, Landroid/widget/ImageView;

    .line 56
    .line 57
    if-eqz v8, :cond_c

    .line 58
    .line 59
    const v3, 0x7f0a00aa

    .line 60
    .line 61
    .line 62
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    move-object v9, v5

    .line 67
    check-cast v9, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 68
    .line 69
    if-eqz v9, :cond_c

    .line 70
    .line 71
    const v3, 0x7f0a00ac

    .line 72
    .line 73
    .line 74
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    move-object v10, v5

    .line 79
    check-cast v10, Landroid/widget/TextView;

    .line 80
    .line 81
    if-eqz v10, :cond_c

    .line 82
    .line 83
    const v3, 0x7f0a00ad

    .line 84
    .line 85
    .line 86
    invoke-static {v1, v3}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    check-cast v5, Landroidx/core/widget/NestedScrollView;

    .line 91
    .line 92
    const v5, 0x7f0a00ae

    .line 93
    .line 94
    .line 95
    invoke-static {v1, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    check-cast v6, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 100
    .line 101
    if-eqz v6, :cond_b

    .line 102
    .line 103
    const v5, 0x7f0a00b4

    .line 104
    .line 105
    .line 106
    invoke-static {v1, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    move-object v11, v6

    .line 111
    check-cast v11, Landroid/widget/TextView;

    .line 112
    .line 113
    if-eqz v11, :cond_b

    .line 114
    .line 115
    const v5, 0x7f0a00b5

    .line 116
    .line 117
    .line 118
    invoke-static {v1, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    move-object v12, v6

    .line 123
    check-cast v12, Landroid/widget/TextView;

    .line 124
    .line 125
    if-eqz v12, :cond_b

    .line 126
    .line 127
    const v5, 0x7f0a00b6

    .line 128
    .line 129
    .line 130
    invoke-static {v1, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    move-object v13, v6

    .line 135
    check-cast v13, Landroid/widget/FrameLayout;

    .line 136
    .line 137
    if-eqz v13, :cond_b

    .line 138
    .line 139
    const v5, 0x7f0a00b7

    .line 140
    .line 141
    .line 142
    invoke-static {v1, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    check-cast v6, Landroid/widget/LinearLayout;

    .line 147
    .line 148
    if-eqz v6, :cond_b

    .line 149
    .line 150
    const v5, 0x7f0a00b8

    .line 151
    .line 152
    .line 153
    invoke-static {v1, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    move-object v14, v6

    .line 158
    check-cast v14, Landroid/widget/Button;

    .line 159
    .line 160
    if-eqz v14, :cond_b

    .line 161
    .line 162
    const v5, 0x7f0a00b9

    .line 163
    .line 164
    .line 165
    invoke-static {v1, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    move-object v15, v6

    .line 170
    check-cast v15, Landroid/widget/Button;

    .line 171
    .line 172
    if-eqz v15, :cond_b

    .line 173
    .line 174
    const v5, 0x7f0a00bb

    .line 175
    .line 176
    .line 177
    invoke-static {v1, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 178
    .line 179
    .line 180
    move-result-object v6

    .line 181
    move-object/from16 v16, v6

    .line 182
    .line 183
    check-cast v16, Landroid/widget/TextView;

    .line 184
    .line 185
    if-eqz v16, :cond_b

    .line 186
    .line 187
    const v5, 0x7f0a00bc

    .line 188
    .line 189
    .line 190
    invoke-static {v1, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    move-object/from16 v17, v6

    .line 195
    .line 196
    check-cast v17, Landroid/widget/TextView;

    .line 197
    .line 198
    if-eqz v17, :cond_b

    .line 199
    .line 200
    const v5, 0x7f0a00be

    .line 201
    .line 202
    .line 203
    invoke-static {v1, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    move-object/from16 v18, v6

    .line 208
    .line 209
    check-cast v18, Landroid/widget/TextView;

    .line 210
    .line 211
    if-eqz v18, :cond_b

    .line 212
    .line 213
    const v5, 0x7f0a00d1

    .line 214
    .line 215
    .line 216
    invoke-static {v1, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    move-object/from16 v19, v6

    .line 221
    .line 222
    check-cast v19, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 223
    .line 224
    if-eqz v19, :cond_b

    .line 225
    .line 226
    const v5, 0x7f0a00da

    .line 227
    .line 228
    .line 229
    invoke-static {v1, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    check-cast v6, Lcom/google/android/material/appbar/AppBarLayout;

    .line 234
    .line 235
    if-eqz v6, :cond_b

    .line 236
    .line 237
    const v5, 0x7f0a011c

    .line 238
    .line 239
    .line 240
    invoke-static {v1, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 241
    .line 242
    .line 243
    move-result-object v20

    .line 244
    if-eqz v20, :cond_b

    .line 245
    .line 246
    const v5, 0x7f0a0135

    .line 247
    .line 248
    .line 249
    invoke-static {v1, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    check-cast v6, Landroid/widget/ToggleButton;

    .line 254
    .line 255
    if-eqz v6, :cond_a

    .line 256
    .line 257
    const v6, 0x7f0a059e

    .line 258
    .line 259
    .line 260
    invoke-static {v1, v6}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 261
    .line 262
    .line 263
    move-result-object v21

    .line 264
    check-cast v21, Landroidx/recyclerview/widget/RecyclerView;

    .line 265
    .line 266
    if-eqz v21, :cond_9

    .line 267
    .line 268
    const v6, 0x7f0a064b

    .line 269
    .line 270
    .line 271
    invoke-static {v1, v6}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 272
    .line 273
    .line 274
    move-result-object v22

    .line 275
    if-eqz v22, :cond_9

    .line 276
    .line 277
    move/from16 v23, v5

    .line 278
    .line 279
    new-instance v5, Lpc1;

    .line 280
    .line 281
    move-object v6, v1

    .line 282
    check-cast v6, Landroid/widget/LinearLayout;

    .line 283
    .line 284
    move/from16 v1, v23

    .line 285
    .line 286
    invoke-direct/range {v5 .. v22}, Lpc1;-><init>(Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/FrameLayout;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/google/android/material/appbar/MaterialToolbar;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;)V

    .line 287
    .line 288
    .line 289
    iput-object v5, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 290
    .line 291
    invoke-virtual {v0}, Lkc1;->X()Lnc1;

    .line 292
    .line 293
    .line 294
    move-result-object v5

    .line 295
    invoke-virtual {v5}, Ll70;->d()Le75;

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    invoke-static {v5}, Lgh0;->r(Lf75;)Lb75;

    .line 300
    .line 301
    .line 302
    move-result-object v8

    .line 303
    invoke-static {v5, v8}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 304
    .line 305
    .line 306
    move-result-object v5

    .line 307
    new-instance v9, Lbq4;

    .line 308
    .line 309
    invoke-direct {v9, v7, v8, v5}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 310
    .line 311
    .line 312
    const-class v5, Ln8;

    .line 313
    .line 314
    invoke-static {v5}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    invoke-virtual {v5}, Li30;->b()Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object v7

    .line 322
    const-string v8, "Local and anonymous classes can not be ViewModels"

    .line 323
    .line 324
    if-eqz v7, :cond_8

    .line 325
    .line 326
    const-string v10, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 327
    .line 328
    invoke-virtual {v10, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v7

    .line 332
    invoke-virtual {v9, v5, v7}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 333
    .line 334
    .line 335
    move-result-object v5

    .line 336
    check-cast v5, Ln8;

    .line 337
    .line 338
    iput-object v5, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->n0:Ln8;

    .line 339
    .line 340
    invoke-virtual {v0}, Lkc1;->X()Lnc1;

    .line 341
    .line 342
    .line 343
    move-result-object v5

    .line 344
    invoke-virtual {v5}, Ll70;->d()Le75;

    .line 345
    .line 346
    .line 347
    move-result-object v7

    .line 348
    invoke-static {v5}, Lgh0;->r(Lf75;)Lb75;

    .line 349
    .line 350
    .line 351
    move-result-object v9

    .line 352
    invoke-static {v5, v9}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    new-instance v11, Lbq4;

    .line 357
    .line 358
    invoke-direct {v11, v7, v9, v5}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 359
    .line 360
    .line 361
    const-class v5, Lli3;

    .line 362
    .line 363
    invoke-static {v5}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 364
    .line 365
    .line 366
    move-result-object v5

    .line 367
    invoke-virtual {v5}, Li30;->b()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v7

    .line 371
    if-eqz v7, :cond_7

    .line 372
    .line 373
    invoke-virtual {v10, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v7

    .line 377
    invoke-virtual {v11, v5, v7}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 378
    .line 379
    .line 380
    move-result-object v5

    .line 381
    check-cast v5, Lli3;

    .line 382
    .line 383
    iput-object v5, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->o0:Lli3;

    .line 384
    .line 385
    iget-object v5, v0, Lkc1;->s:Landroid/os/Bundle;

    .line 386
    .line 387
    if-nez v5, :cond_0

    .line 388
    .line 389
    const-string v1, "AlbumPageFragment"

    .line 390
    .line 391
    const-string v2, "Arguments are null after process restoration."

    .line 392
    .line 393
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 394
    .line 395
    .line 396
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 397
    .line 398
    if-eqz v0, :cond_1

    .line 399
    .line 400
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 401
    .line 402
    if-eqz v0, :cond_1

    .line 403
    .line 404
    invoke-virtual {v0}, Lv23;->o()V

    .line 405
    .line 406
    .line 407
    return-object v6

    .line 408
    :cond_0
    const-string v7, "ALBUM_OBJECT"

    .line 409
    .line 410
    invoke-virtual {v5, v7}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 411
    .line 412
    .line 413
    move-result-object v5

    .line 414
    check-cast v5, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 415
    .line 416
    if-nez v5, :cond_2

    .line 417
    .line 418
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 419
    .line 420
    if-eqz v0, :cond_1

    .line 421
    .line 422
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 423
    .line 424
    if-eqz v0, :cond_1

    .line 425
    .line 426
    invoke-virtual {v0}, Lv23;->o()V

    .line 427
    .line 428
    .line 429
    :cond_1
    return-object v6

    .line 430
    :cond_2
    iget-object v7, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->n0:Ln8;

    .line 431
    .line 432
    invoke-virtual {v0}, Lkc1;->v()Lle1;

    .line 433
    .line 434
    .line 435
    move-result-object v8

    .line 436
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v9

    .line 443
    iput-object v9, v7, Ln8;->f:Ljava/lang/String;

    .line 444
    .line 445
    iget-object v9, v7, Ln8;->h:Lk03;

    .line 446
    .line 447
    invoke-virtual {v9, v5}, Lad2;->i(Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getArtistId()Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v9

    .line 454
    iput-object v9, v7, Ln8;->g:Ljava/lang/String;

    .line 455
    .line 456
    iget-object v9, v7, Ln8;->c:Lrv2;

    .line 457
    .line 458
    iget-object v10, v7, Ln8;->f:Ljava/lang/String;

    .line 459
    .line 460
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    invoke-static {v10}, Lrv2;->l(Ljava/lang/String;)Lk03;

    .line 464
    .line 465
    .line 466
    move-result-object v9

    .line 467
    iput-object v9, v7, Ln8;->i:Lk03;

    .line 468
    .line 469
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v9

    .line 473
    invoke-static {v9}, Lrv2;->j(Ljava/lang/String;)Lk03;

    .line 474
    .line 475
    .line 476
    move-result-object v9

    .line 477
    new-instance v10, Ld8;

    .line 478
    .line 479
    const/4 v11, 0x2

    .line 480
    invoke-direct {v10, v11, v7}, Ld8;-><init>(ILjava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v9, v8, v10}, Lad2;->e(Lba2;La83;)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {v6, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    check-cast v1, Landroid/widget/ToggleButton;

    .line 491
    .line 492
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v7

    .line 496
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getStarred()Ljava/util/Date;

    .line 497
    .line 498
    .line 499
    move-result-object v5

    .line 500
    const/4 v8, 0x1

    .line 501
    if-eqz v5, :cond_3

    .line 502
    .line 503
    move v5, v8

    .line 504
    goto :goto_0

    .line 505
    :cond_3
    move v5, v2

    .line 506
    :goto_0
    invoke-static {v11, v7, v5}, Ln61;->f(ILjava/lang/String;Z)Z

    .line 507
    .line 508
    .line 509
    move-result v5

    .line 510
    invoke-virtual {v1, v5}, Landroid/widget/ToggleButton;->setChecked(Z)V

    .line 511
    .line 512
    .line 513
    new-instance v5, Lk8;

    .line 514
    .line 515
    const/4 v7, 0x3

    .line 516
    invoke-direct {v5, v0, v7}, Lk8;-><init>(Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;I)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v1, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 520
    .line 521
    .line 522
    iget-object v5, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->n0:Ln8;

    .line 523
    .line 524
    iget-object v5, v5, Ln8;->h:Lk03;

    .line 525
    .line 526
    invoke-virtual {v0}, Lkc1;->v()Lle1;

    .line 527
    .line 528
    .line 529
    move-result-object v9

    .line 530
    new-instance v10, Ld8;

    .line 531
    .line 532
    invoke-direct {v10, v8, v1}, Ld8;-><init>(ILjava/lang/Object;)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v5, v9, v10}, Lad2;->e(Lba2;La83;)V

    .line 536
    .line 537
    .line 538
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 539
    .line 540
    iget-object v5, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 541
    .line 542
    iget-object v5, v5, Lpc1;->n:Landroid/view/View;

    .line 543
    .line 544
    check-cast v5, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 545
    .line 546
    invoke-virtual {v1, v5}, Ldf;->o(Landroidx/appcompat/widget/Toolbar;)V

    .line 547
    .line 548
    .line 549
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 550
    .line 551
    invoke-virtual {v1}, Ldf;->n()Ll93;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    if-eqz v1, :cond_4

    .line 556
    .line 557
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 558
    .line 559
    invoke-virtual {v1}, Ldf;->n()Ll93;

    .line 560
    .line 561
    .line 562
    move-result-object v1

    .line 563
    invoke-virtual {v1, v8}, Ll93;->f0(Z)V

    .line 564
    .line 565
    .line 566
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 567
    .line 568
    invoke-virtual {v1}, Ldf;->n()Ll93;

    .line 569
    .line 570
    .line 571
    move-result-object v1

    .line 572
    invoke-virtual {v1}, Ll93;->g0()V

    .line 573
    .line 574
    .line 575
    :cond_4
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->n0:Ln8;

    .line 576
    .line 577
    iget-object v1, v1, Ln8;->h:Lk03;

    .line 578
    .line 579
    invoke-virtual {v0}, Lkc1;->v()Lle1;

    .line 580
    .line 581
    .line 582
    move-result-object v5

    .line 583
    new-instance v9, Lg8;

    .line 584
    .line 585
    const/4 v10, 0x7

    .line 586
    invoke-direct {v9, v0, v10}, Lg8;-><init>(Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;I)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v1, v5, v9}, Lad2;->e(Lba2;La83;)V

    .line 590
    .line 591
    .line 592
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 593
    .line 594
    iget-object v1, v1, Lpc1;->n:Landroid/view/View;

    .line 595
    .line 596
    check-cast v1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 597
    .line 598
    new-instance v5, Lk8;

    .line 599
    .line 600
    invoke-direct {v5, v0, v2}, Lk8;-><init>(Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;I)V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v1, v5}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 604
    .line 605
    .line 606
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 607
    .line 608
    iget-object v1, v1, Lpc1;->n:Landroid/view/View;

    .line 609
    .line 610
    check-cast v1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 611
    .line 612
    invoke-virtual {v1}, Landroidx/appcompat/widget/Toolbar;->getOverflowIcon()Landroid/graphics/drawable/Drawable;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    invoke-virtual {v0}, Lkc1;->Z()Landroid/content/Context;

    .line 620
    .line 621
    .line 622
    move-result-object v5

    .line 623
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 624
    .line 625
    .line 626
    move-result-object v5

    .line 627
    const v9, 0x7f06036c

    .line 628
    .line 629
    .line 630
    invoke-virtual {v5, v9, v4}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    .line 631
    .line 632
    .line 633
    move-result v4

    .line 634
    invoke-virtual {v1, v4}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 635
    .line 636
    .line 637
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 638
    .line 639
    iget-object v1, v1, Lpc1;->k:Landroid/view/View;

    .line 640
    .line 641
    check-cast v1, Landroid/widget/FrameLayout;

    .line 642
    .line 643
    new-instance v4, Lk8;

    .line 644
    .line 645
    invoke-direct {v4, v0, v8}, Lk8;-><init>(Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;I)V

    .line 646
    .line 647
    .line 648
    invoke-virtual {v1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 649
    .line 650
    .line 651
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 656
    .line 657
    .line 658
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 659
    .line 660
    .line 661
    move-result-object v1

    .line 662
    const-string v4, "album_detail"

    .line 663
    .line 664
    invoke-interface {v1, v4, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 665
    .line 666
    .line 667
    move-result v1

    .line 668
    if-eqz v1, :cond_5

    .line 669
    .line 670
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 671
    .line 672
    iget-object v1, v1, Lpc1;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 673
    .line 674
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 675
    .line 676
    .line 677
    :cond_5
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 678
    .line 679
    iget-object v1, v1, Lpc1;->c:Landroid/widget/TextView;

    .line 680
    .line 681
    new-instance v4, Lk8;

    .line 682
    .line 683
    invoke-direct {v4, v0, v11}, Lk8;-><init>(Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;I)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 687
    .line 688
    .line 689
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->n0:Ln8;

    .line 690
    .line 691
    iget-object v4, v1, Ln8;->c:Lrv2;

    .line 692
    .line 693
    iget-object v1, v1, Ln8;->f:Ljava/lang/String;

    .line 694
    .line 695
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 696
    .line 697
    .line 698
    new-instance v4, Lk03;

    .line 699
    .line 700
    invoke-direct {v4}, Lad2;-><init>()V

    .line 701
    .line 702
    .line 703
    invoke-static {v2}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 704
    .line 705
    .line 706
    move-result-object v5

    .line 707
    invoke-virtual {v5}, Lpn4;->c()Lgp3;

    .line 708
    .line 709
    .line 710
    move-result-object v5

    .line 711
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 712
    .line 713
    .line 714
    const-string v9, "BrowsingClient"

    .line 715
    .line 716
    const-string v10, "getAlbumInfo2()"

    .line 717
    .line 718
    invoke-static {v9, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 719
    .line 720
    .line 721
    iget-object v9, v5, Lgp3;->p:Ljava/lang/Object;

    .line 722
    .line 723
    check-cast v9, Lov;

    .line 724
    .line 725
    iget-object v5, v5, Lgp3;->o:Ljava/lang/Object;

    .line 726
    .line 727
    check-cast v5, Lpn4;

    .line 728
    .line 729
    invoke-virtual {v5}, Lpn4;->f()Ljava/util/HashMap;

    .line 730
    .line 731
    .line 732
    move-result-object v5

    .line 733
    invoke-interface {v9, v5, v1}, Lov;->d(Ljava/util/Map;Ljava/lang/String;)Lretrofit2/Call;

    .line 734
    .line 735
    .line 736
    move-result-object v1

    .line 737
    new-instance v5, Lq8;

    .line 738
    .line 739
    invoke-direct {v5, v4, v2}, Lq8;-><init>(Lk03;I)V

    .line 740
    .line 741
    .line 742
    invoke-interface {v1, v5}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 743
    .line 744
    .line 745
    invoke-virtual {v0}, Lkc1;->v()Lle1;

    .line 746
    .line 747
    .line 748
    move-result-object v1

    .line 749
    new-instance v5, Lg8;

    .line 750
    .line 751
    invoke-direct {v5, v0, v8}, Lg8;-><init>(Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;I)V

    .line 752
    .line 753
    .line 754
    invoke-virtual {v4, v1, v5}, Lad2;->e(Lba2;La83;)V

    .line 755
    .line 756
    .line 757
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->n0:Ln8;

    .line 758
    .line 759
    iget-object v1, v1, Ln8;->i:Lk03;

    .line 760
    .line 761
    invoke-virtual {v0}, Lkc1;->v()Lle1;

    .line 762
    .line 763
    .line 764
    move-result-object v4

    .line 765
    new-instance v5, Lg8;

    .line 766
    .line 767
    invoke-direct {v5, v0, v11}, Lg8;-><init>(Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;I)V

    .line 768
    .line 769
    .line 770
    invoke-virtual {v1, v4, v5}, Lad2;->e(Lba2;La83;)V

    .line 771
    .line 772
    .line 773
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->n0:Ln8;

    .line 774
    .line 775
    iget-object v1, v1, Ln8;->h:Lk03;

    .line 776
    .line 777
    invoke-virtual {v0}, Lkc1;->v()Lle1;

    .line 778
    .line 779
    .line 780
    move-result-object v4

    .line 781
    new-instance v5, Lg8;

    .line 782
    .line 783
    const/16 v9, 0x8

    .line 784
    .line 785
    invoke-direct {v5, v0, v9}, Lg8;-><init>(Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;I)V

    .line 786
    .line 787
    .line 788
    invoke-virtual {v1, v4, v5}, Lad2;->e(Lba2;La83;)V

    .line 789
    .line 790
    .line 791
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 792
    .line 793
    iget-object v1, v1, Lpc1;->q:Landroid/view/View;

    .line 794
    .line 795
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 796
    .line 797
    new-instance v4, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 798
    .line 799
    invoke-virtual {v0}, Lkc1;->Z()Landroid/content/Context;

    .line 800
    .line 801
    .line 802
    invoke-direct {v4, v8}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 803
    .line 804
    .line 805
    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 806
    .line 807
    .line 808
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 809
    .line 810
    iget-object v1, v1, Lpc1;->q:Landroid/view/View;

    .line 811
    .line 812
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 813
    .line 814
    invoke-virtual {v1, v8}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 815
    .line 816
    .line 817
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 818
    .line 819
    iget-object v1, v1, Lpc1;->q:Landroid/view/View;

    .line 820
    .line 821
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 822
    .line 823
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setClipToPadding(Z)V

    .line 824
    .line 825
    .line 826
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 827
    .line 828
    iget-object v1, v1, Lpc1;->q:Landroid/view/View;

    .line 829
    .line 830
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 831
    .line 832
    new-instance v4, La0;

    .line 833
    .line 834
    invoke-direct {v4, v7, v0}, La0;-><init>(ILjava/lang/Object;)V

    .line 835
    .line 836
    .line 837
    invoke-virtual {v1, v4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 838
    .line 839
    .line 840
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 841
    .line 842
    iget-object v1, v1, Lpc1;->b:Landroid/view/View;

    .line 843
    .line 844
    check-cast v1, Landroid/widget/LinearLayout;

    .line 845
    .line 846
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 847
    .line 848
    .line 849
    move-result-object v1

    .line 850
    if-eqz v1, :cond_6

    .line 851
    .line 852
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 853
    .line 854
    iget-object v1, v1, Lpc1;->b:Landroid/view/View;

    .line 855
    .line 856
    check-cast v1, Landroid/widget/LinearLayout;

    .line 857
    .line 858
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 859
    .line 860
    .line 861
    move-result-object v1

    .line 862
    check-cast v1, Landroidx/core/widget/NestedScrollView;

    .line 863
    .line 864
    iget-object v3, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 865
    .line 866
    iget-object v3, v3, Lpc1;->q:Landroid/view/View;

    .line 867
    .line 868
    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    .line 869
    .line 870
    new-instance v4, Ll8;

    .line 871
    .line 872
    invoke-direct {v4, v1, v2}, Ll8;-><init>(Landroidx/core/widget/NestedScrollView;I)V

    .line 873
    .line 874
    .line 875
    invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/RecyclerView;->j(Lrw3;)V

    .line 876
    .line 877
    .line 878
    :cond_6
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->n0:Ln8;

    .line 879
    .line 880
    iget-object v1, v1, Ln8;->h:Lk03;

    .line 881
    .line 882
    invoke-virtual {v0}, Lkc1;->v()Lle1;

    .line 883
    .line 884
    .line 885
    move-result-object v2

    .line 886
    new-instance v3, Lg8;

    .line 887
    .line 888
    const/4 v4, 0x6

    .line 889
    invoke-direct {v3, v0, v4}, Lg8;-><init>(Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;I)V

    .line 890
    .line 891
    .line 892
    invoke-virtual {v1, v2, v3}, Lad2;->e(Lba2;La83;)V

    .line 893
    .line 894
    .line 895
    return-object v6

    .line 896
    :cond_7
    invoke-static {v8}, Lkf2;->n(Ljava/lang/String;)V

    .line 897
    .line 898
    .line 899
    return-object v4

    .line 900
    :cond_8
    invoke-static {v8}, Lkf2;->n(Ljava/lang/String;)V

    .line 901
    .line 902
    .line 903
    return-object v4

    .line 904
    :cond_9
    move v3, v6

    .line 905
    goto :goto_1

    .line 906
    :cond_a
    move/from16 v23, v5

    .line 907
    .line 908
    move/from16 v3, v23

    .line 909
    .line 910
    goto :goto_1

    .line 911
    :cond_b
    move v3, v5

    .line 912
    :cond_c
    :goto_1
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 913
    .line 914
    .line 915
    move-result-object v0

    .line 916
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 917
    .line 918
    .line 919
    move-result-object v0

    .line 920
    const-string v1, "Missing required view with ID: "

    .line 921
    .line 922
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 923
    .line 924
    .line 925
    move-result-object v0

    .line 926
    invoke-static {v0}, Lnz2;->n(Ljava/lang/String;)V

    .line 927
    .line 928
    .line 929
    return-object v4
.end method

.method public final J()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->i0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Lpc1;

    .line 9
    .line 10
    return-void
.end method

.method public final N(Landroid/view/MenuItem;)Z
    .locals 5

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x7f0a0082

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x1

    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    new-instance p1, Landroid/os/Bundle;

    .line 13
    .line 14
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->n0:Ln8;

    .line 18
    .line 19
    iget-object v0, v0, Ln8;->h:Lk03;

    .line 20
    .line 21
    invoke-virtual {v0}, Lad2;->d()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 26
    .line 27
    const-string v1, "ALBUM_OBJECT"

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->strippedForNav()Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Lou3;

    .line 37
    .line 38
    invoke-direct {v0}, Lou3;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Lnc1;->k()Lmd1;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-virtual {v0, p0, v2}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return v3

    .line 56
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    const v1, 0x7f0a0053

    .line 61
    .line 62
    .line 63
    const/4 v4, 0x0

    .line 64
    if-ne v0, v1, :cond_3

    .line 65
    .line 66
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->n0:Ln8;

    .line 67
    .line 68
    iget-object p1, p1, Ln8;->i:Lk03;

    .line 69
    .line 70
    invoke-virtual {p1}, Lad2;->d()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Ljava/util/List;

    .line 75
    .line 76
    if-eqz p1, :cond_a

    .line 77
    .line 78
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_1

    .line 83
    .line 84
    goto/16 :goto_1

    .line 85
    .line 86
    :cond_1
    invoke-static {}, Lud3;->o()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    if-nez v0, :cond_2

    .line 91
    .line 92
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {p0}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {p1}, Lgi1;->H(Ljava/util/List;)Ljava/util/ArrayList;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    new-instance v1, Lhu3;

    .line 109
    .line 110
    const/4 v2, 0x6

    .line 111
    invoke-direct {v1, v2}, Lhu3;-><init>(I)V

    .line 112
    .line 113
    .line 114
    invoke-interface {p1, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-interface {p1, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    check-cast p1, Ljava/util/List;

    .line 127
    .line 128
    invoke-virtual {p0, v0, p1, v4}, Leu0;->a(Ljava/util/ArrayList;Ljava/util/List;Z)I

    .line 129
    .line 130
    .line 131
    return v3

    .line 132
    :cond_2
    new-instance v0, Ld7;

    .line 133
    .line 134
    invoke-direct {v0, v3, p0}, Ld7;-><init>(ILjava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-interface {p1, v0}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 138
    .line 139
    .line 140
    return v3

    .line 141
    :cond_3
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    const v1, 0x7f0a0036

    .line 146
    .line 147
    .line 148
    if-ne v0, v1, :cond_5

    .line 149
    .line 150
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->n0:Ln8;

    .line 151
    .line 152
    iget-object p1, p1, Ln8;->i:Lk03;

    .line 153
    .line 154
    invoke-virtual {p1}, Lad2;->d()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    check-cast p1, Ljava/util/List;

    .line 159
    .line 160
    if-eqz p1, :cond_a

    .line 161
    .line 162
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-eqz v0, :cond_4

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_4
    new-instance v0, Landroid/os/Bundle;

    .line 170
    .line 171
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 172
    .line 173
    .line 174
    new-instance v1, Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 177
    .line 178
    .line 179
    const-string p1, "TRACKS_OBJECT"

    .line 180
    .line 181
    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 182
    .line 183
    .line 184
    new-instance p1, Lfl3;

    .line 185
    .line 186
    invoke-direct {p1}, Lfl3;-><init>()V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, v0}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    invoke-virtual {p0}, Lnc1;->k()Lmd1;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-virtual {p1, p0, v2}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    return v3

    .line 204
    :cond_5
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    const v1, 0x7f0a007e

    .line 209
    .line 210
    .line 211
    if-eq v0, v1, :cond_7

    .line 212
    .line 213
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    const v2, 0x7f0a0037

    .line 218
    .line 219
    .line 220
    if-ne v0, v2, :cond_6

    .line 221
    .line 222
    goto :goto_0

    .line 223
    :cond_6
    return v4

    .line 224
    :cond_7
    :goto_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    if-ne p1, v1, :cond_8

    .line 229
    .line 230
    move v4, v3

    .line 231
    :cond_8
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->n0:Ln8;

    .line 232
    .line 233
    iget-object p1, p1, Ln8;->i:Lk03;

    .line 234
    .line 235
    invoke-virtual {p1}, Lad2;->d()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    check-cast p1, Ljava/util/List;

    .line 240
    .line 241
    if-eqz p1, :cond_a

    .line 242
    .line 243
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 244
    .line 245
    .line 246
    move-result v0

    .line 247
    if-eqz v0, :cond_9

    .line 248
    .line 249
    goto :goto_1

    .line 250
    :cond_9
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->q0:Lbl2;

    .line 251
    .line 252
    invoke-static {v0, p1, v4}, Lbo2;->e(Lic2;Ljava/util/List;Z)V

    .line 253
    .line 254
    .line 255
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 256
    .line 257
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 258
    .line 259
    iget-object p0, p0, Lzg5;->n:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast p0, Lau;

    .line 262
    .line 263
    invoke-virtual {p0, v3}, Lau;->d(Z)V

    .line 264
    .line 265
    .line 266
    :cond_a
    :goto_1
    return v3
.end method

.method public final P()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lkc1;->R:Z

    .line 3
    .line 4
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->p0:Lni4;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->q0:Lbl2;

    .line 9
    .line 10
    iput-object p0, v0, Lni4;->A:Lbl2;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final R()V
    .locals 10

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
    const/4 v9, 0x4

    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    new-instance v0, Lxc5;

    .line 54
    .line 55
    new-instance v1, Lx7;

    .line 56
    .line 57
    invoke-direct {v1, v2}, Lx7;-><init>(Landroid/content/Context;)V

    .line 58
    .line 59
    .line 60
    new-instance v8, Lfi0;

    .line 61
    .line 62
    invoke-direct {v8, v1}, Lfi0;-><init>(Lx7;)V

    .line 63
    .line 64
    .line 65
    invoke-direct {v0, v9, v8}, Lxc5;-><init>(ILjava/lang/Object;)V

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
    iput-object v7, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->q0:Lbl2;

    .line 86
    .line 87
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->o0:Lli3;

    .line 88
    .line 89
    invoke-static {v7, v0}, Lbo2;->j(Lbl2;Lli3;)V

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->o0:Lli3;

    .line 93
    .line 94
    iget-object v0, v0, Lli3;->b:Lk03;

    .line 95
    .line 96
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    new-instance v2, Lg8;

    .line 101
    .line 102
    const/4 v3, 0x0

    .line 103
    invoke-direct {v2, p0, v3}, Lg8;-><init>(Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v1, v2}, Lad2;->e(Lba2;La83;)V

    .line 107
    .line 108
    .line 109
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->o0:Lli3;

    .line 110
    .line 111
    iget-object v0, v0, Lli3;->c:Lk03;

    .line 112
    .line 113
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    new-instance v2, Lg8;

    .line 118
    .line 119
    invoke-direct {v2, p0, v9}, Lg8;-><init>(Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, v1, v2}, Lad2;->e(Lba2;La83;)V

    .line 123
    .line 124
    .line 125
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->q0:Lbl2;

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

.method public final h0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->p0:Lni4;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->o0:Lli3;

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
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->o0:Lli3;

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
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->p0:Lni4;

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
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->r0:Lk03;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->s0:Lg8;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lad2;->j(La83;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->r0:Lk03;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->s0:Lg8;

    .line 16
    .line 17
    return-void
.end method

.method public final onMediaClick(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->q0:Lbl2;

    .line 2
    .line 3
    const-string v1, "TRACKS_OBJECT"

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "ITEM_POSITION"

    .line 10
    .line 11
    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const-string v2, "album"

    .line 16
    .line 17
    invoke-static {v0, v1, p1, v2}, Lbo2;->q(Lic2;Ljava/util/List;ILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 21
    .line 22
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 23
    .line 24
    iget-object p0, p0, Lzg5;->n:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lau;

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    invoke-virtual {p0, p1}, Lau;->d(Z)V

    .line 30
    .line 31
    .line 32
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
