.class public Lcom/eddyizm/tempus/ui/fragment/LoginFragment;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/ClickCallback;


# instance fields
.field public l0:Lml3;

.field public m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

.field public n0:Lse2;

.field public o0:Lzd0;


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
    return-void
.end method

.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v0}, Lkc1;->l()Lnc1;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    check-cast v3, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 12
    .line 13
    iput-object v3, v0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const v3, 0x7f0d0073

    .line 19
    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-virtual {v1, v3, v2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const v5, 0x7f0a0292

    .line 27
    .line 28
    .line 29
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    move-object v9, v6

    .line 34
    check-cast v9, Landroid/widget/LinearLayout;

    .line 35
    .line 36
    const-string v7, "Missing required view with ID: "

    .line 37
    .line 38
    if-eqz v9, :cond_4

    .line 39
    .line 40
    const v5, 0x7f0a0293

    .line 41
    .line 42
    .line 43
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    move-object v10, v8

    .line 48
    check-cast v10, Lcom/google/android/material/textfield/TextInputEditText;

    .line 49
    .line 50
    if-eqz v10, :cond_4

    .line 51
    .line 52
    const v5, 0x7f0a0294

    .line 53
    .line 54
    .line 55
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    move-object v11, v8

    .line 60
    check-cast v11, Lcom/google/android/material/textfield/TextInputLayout;

    .line 61
    .line 62
    if-eqz v11, :cond_4

    .line 63
    .line 64
    const v5, 0x7f0a0295

    .line 65
    .line 66
    .line 67
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    move-object v12, v8

    .line 72
    check-cast v12, Lcom/google/android/material/textfield/TextInputEditText;

    .line 73
    .line 74
    if-eqz v12, :cond_4

    .line 75
    .line 76
    const v5, 0x7f0a0296

    .line 77
    .line 78
    .line 79
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    move-object v13, v8

    .line 84
    check-cast v13, Lcom/google/android/material/textfield/TextInputLayout;

    .line 85
    .line 86
    if-eqz v13, :cond_4

    .line 87
    .line 88
    const v5, 0x7f0a0297

    .line 89
    .line 90
    .line 91
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    move-object v14, v8

    .line 96
    check-cast v14, Lcom/google/android/material/button/MaterialButton;

    .line 97
    .line 98
    if-eqz v14, :cond_4

    .line 99
    .line 100
    const v5, 0x7f0a0298

    .line 101
    .line 102
    .line 103
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    move-object v15, v8

    .line 108
    check-cast v15, Landroid/widget/TextView;

    .line 109
    .line 110
    if-eqz v15, :cond_4

    .line 111
    .line 112
    const v5, 0x7f0a0299

    .line 113
    .line 114
    .line 115
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    move-object/from16 v16, v8

    .line 120
    .line 121
    check-cast v16, Lcom/google/android/material/button/MaterialButton;

    .line 122
    .line 123
    if-eqz v16, :cond_4

    .line 124
    .line 125
    const v5, 0x7f0a029a

    .line 126
    .line 127
    .line 128
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 129
    .line 130
    .line 131
    move-result-object v8

    .line 132
    move-object/from16 v17, v8

    .line 133
    .line 134
    check-cast v17, Landroid/widget/TextView;

    .line 135
    .line 136
    if-eqz v17, :cond_4

    .line 137
    .line 138
    const v5, 0x7f0a029b

    .line 139
    .line 140
    .line 141
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 142
    .line 143
    .line 144
    move-result-object v8

    .line 145
    move-object/from16 v18, v8

    .line 146
    .line 147
    check-cast v18, Lcom/google/android/material/textfield/TextInputEditText;

    .line 148
    .line 149
    if-eqz v18, :cond_4

    .line 150
    .line 151
    const v5, 0x7f0a029c

    .line 152
    .line 153
    .line 154
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    move-object/from16 v19, v8

    .line 159
    .line 160
    check-cast v19, Lcom/google/android/material/textfield/TextInputEditText;

    .line 161
    .line 162
    if-eqz v19, :cond_4

    .line 163
    .line 164
    const v5, 0x7f0a029d

    .line 165
    .line 166
    .line 167
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    move-object/from16 v20, v8

    .line 172
    .line 173
    check-cast v20, Lcom/google/android/material/textfield/TextInputLayout;

    .line 174
    .line 175
    if-eqz v20, :cond_4

    .line 176
    .line 177
    const v5, 0x7f0a029e

    .line 178
    .line 179
    .line 180
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 181
    .line 182
    .line 183
    move-result-object v8

    .line 184
    move-object/from16 v21, v8

    .line 185
    .line 186
    check-cast v21, Lcom/google/android/material/textfield/TextInputLayout;

    .line 187
    .line 188
    if-eqz v21, :cond_4

    .line 189
    .line 190
    const v5, 0x7f0a029f

    .line 191
    .line 192
    .line 193
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    move-object/from16 v22, v8

    .line 198
    .line 199
    check-cast v22, Lcom/google/android/material/button/MaterialButton;

    .line 200
    .line 201
    if-eqz v22, :cond_4

    .line 202
    .line 203
    const v5, 0x7f0a02a0

    .line 204
    .line 205
    .line 206
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 207
    .line 208
    .line 209
    move-result-object v8

    .line 210
    move-object/from16 v23, v8

    .line 211
    .line 212
    check-cast v23, Lcom/google/android/material/progressindicator/LinearProgressIndicator;

    .line 213
    .line 214
    if-eqz v23, :cond_4

    .line 215
    .line 216
    const v5, 0x7f0a02a1

    .line 217
    .line 218
    .line 219
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 220
    .line 221
    .line 222
    move-result-object v8

    .line 223
    move-object/from16 v24, v8

    .line 224
    .line 225
    check-cast v24, Lcom/google/android/material/button/MaterialButton;

    .line 226
    .line 227
    if-eqz v24, :cond_4

    .line 228
    .line 229
    move-object v8, v3

    .line 230
    check-cast v8, Landroid/widget/ScrollView;

    .line 231
    .line 232
    const v5, 0x7f0a02a3

    .line 233
    .line 234
    .line 235
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 236
    .line 237
    .line 238
    move-result-object v25

    .line 239
    move-object/from16 v26, v25

    .line 240
    .line 241
    check-cast v26, Lcom/google/android/material/textfield/TextInputEditText;

    .line 242
    .line 243
    if-eqz v26, :cond_4

    .line 244
    .line 245
    const v5, 0x7f0a02a4

    .line 246
    .line 247
    .line 248
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 249
    .line 250
    .line 251
    move-result-object v25

    .line 252
    move-object/from16 v27, v25

    .line 253
    .line 254
    check-cast v27, Landroid/widget/TextView;

    .line 255
    .line 256
    if-eqz v27, :cond_4

    .line 257
    .line 258
    const v5, 0x7f0a02a5

    .line 259
    .line 260
    .line 261
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 262
    .line 263
    .line 264
    move-result-object v25

    .line 265
    move-object/from16 v28, v25

    .line 266
    .line 267
    check-cast v28, Landroid/widget/TextView;

    .line 268
    .line 269
    if-eqz v28, :cond_4

    .line 270
    .line 271
    const v5, 0x7f0a02a6

    .line 272
    .line 273
    .line 274
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 275
    .line 276
    .line 277
    move-result-object v25

    .line 278
    move-object/from16 v29, v25

    .line 279
    .line 280
    check-cast v29, Lcom/google/android/material/textfield/TextInputLayout;

    .line 281
    .line 282
    if-eqz v29, :cond_4

    .line 283
    .line 284
    const v5, 0x7f0a02a7

    .line 285
    .line 286
    .line 287
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 288
    .line 289
    .line 290
    move-result-object v25

    .line 291
    move-object/from16 v30, v25

    .line 292
    .line 293
    check-cast v30, Landroid/widget/LinearLayout;

    .line 294
    .line 295
    if-eqz v30, :cond_4

    .line 296
    .line 297
    const v5, 0x7f0a02a8

    .line 298
    .line 299
    .line 300
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 301
    .line 302
    .line 303
    move-result-object v25

    .line 304
    move-object/from16 v31, v25

    .line 305
    .line 306
    check-cast v31, Landroid/widget/LinearLayout;

    .line 307
    .line 308
    if-eqz v31, :cond_4

    .line 309
    .line 310
    const v5, 0x7f0a02a9

    .line 311
    .line 312
    .line 313
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 314
    .line 315
    .line 316
    move-result-object v25

    .line 317
    move-object/from16 v32, v25

    .line 318
    .line 319
    check-cast v32, Landroid/widget/TextView;

    .line 320
    .line 321
    if-eqz v32, :cond_4

    .line 322
    .line 323
    const v5, 0x7f0a02aa

    .line 324
    .line 325
    .line 326
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 327
    .line 328
    .line 329
    move-result-object v25

    .line 330
    move-object/from16 v33, v25

    .line 331
    .line 332
    check-cast v33, Lcom/google/android/material/button/MaterialButton;

    .line 333
    .line 334
    if-eqz v33, :cond_4

    .line 335
    .line 336
    const v5, 0x7f0a02ab

    .line 337
    .line 338
    .line 339
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 340
    .line 341
    .line 342
    move-result-object v25

    .line 343
    move-object/from16 v34, v25

    .line 344
    .line 345
    check-cast v34, Lcom/google/android/material/textfield/TextInputEditText;

    .line 346
    .line 347
    if-eqz v34, :cond_4

    .line 348
    .line 349
    const v5, 0x7f0a02ac

    .line 350
    .line 351
    .line 352
    invoke-static {v3, v5}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 353
    .line 354
    .line 355
    move-result-object v25

    .line 356
    move-object/from16 v35, v25

    .line 357
    .line 358
    check-cast v35, Lcom/google/android/material/textfield/TextInputLayout;

    .line 359
    .line 360
    if-eqz v35, :cond_4

    .line 361
    .line 362
    move-object/from16 v25, v7

    .line 363
    .line 364
    new-instance v7, Luc1;

    .line 365
    .line 366
    move-object/from16 v3, v25

    .line 367
    .line 368
    move-object/from16 v25, v8

    .line 369
    .line 370
    invoke-direct/range {v7 .. v35}, Luc1;-><init>(Landroid/widget/ScrollView;Landroid/widget/LinearLayout;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/button/MaterialButton;Landroid/widget/TextView;Lcom/google/android/material/button/MaterialButton;Landroid/widget/TextView;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/textfield/TextInputLayout;Lcom/google/android/material/button/MaterialButton;Lcom/google/android/material/progressindicator/LinearProgressIndicator;Lcom/google/android/material/button/MaterialButton;Landroid/widget/ScrollView;Lcom/google/android/material/textfield/TextInputEditText;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/google/android/material/textfield/TextInputLayout;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroid/widget/TextView;Lcom/google/android/material/button/MaterialButton;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputLayout;)V

    .line 371
    .line 372
    .line 373
    move-object v14, v7

    .line 374
    move-object v7, v8

    .line 375
    move-object/from16 v8, v18

    .line 376
    .line 377
    move-object/from16 v5, v19

    .line 378
    .line 379
    move-object/from16 v9, v26

    .line 380
    .line 381
    move-object/from16 v11, v27

    .line 382
    .line 383
    move-object/from16 v13, v34

    .line 384
    .line 385
    new-instance v15, Lfo1;

    .line 386
    .line 387
    invoke-direct {v15, v0, v14}, Lfo1;-><init>(Lcom/eddyizm/tempus/ui/fragment/LoginFragment;Luc1;)V

    .line 388
    .line 389
    .line 390
    const/16 p3, 0x0

    .line 391
    .line 392
    new-instance v6, Lmj0;

    .line 393
    .line 394
    const/16 v4, 0x1c

    .line 395
    .line 396
    invoke-direct {v6, v4}, Lmj0;-><init>(I)V

    .line 397
    .line 398
    .line 399
    sget-object v4, Lj65;->a:Ljava/util/WeakHashMap;

    .line 400
    .line 401
    invoke-static {v7, v6}, La65;->c(Landroid/view/View;Lr83;)V

    .line 402
    .line 403
    .line 404
    const-string v4, "http://192.168.1.129:4533"

    .line 405
    .line 406
    invoke-virtual {v9, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 407
    .line 408
    .line 409
    new-instance v4, Leo1;

    .line 410
    .line 411
    const/4 v6, 0x0

    .line 412
    invoke-direct {v4, v15, v6}, Leo1;-><init>(Lfo1;I)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v9, v4}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 416
    .line 417
    .line 418
    new-instance v4, Lxn1;

    .line 419
    .line 420
    const/4 v6, 0x5

    .line 421
    invoke-direct {v4, v15, v6}, Lxn1;-><init>(Lfo1;I)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v11, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 425
    .line 426
    .line 427
    filled-new-array {v10, v13, v8, v5}, [Lcom/google/android/material/textfield/TextInputEditText;

    .line 428
    .line 429
    .line 430
    move-result-object v4

    .line 431
    invoke-static {v4}, Lgb;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 432
    .line 433
    .line 434
    move-result-object v4

    .line 435
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 436
    .line 437
    .line 438
    move-result-object v4

    .line 439
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 440
    .line 441
    .line 442
    move-result v6

    .line 443
    const/4 v7, 0x2

    .line 444
    if-eqz v6, :cond_0

    .line 445
    .line 446
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v6

    .line 450
    check-cast v6, Lcom/google/android/material/textfield/TextInputEditText;

    .line 451
    .line 452
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    new-instance v10, Leo1;

    .line 456
    .line 457
    invoke-direct {v10, v15, v7}, Leo1;-><init>(Lfo1;I)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v6, v10}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 461
    .line 462
    .line 463
    goto :goto_0

    .line 464
    :cond_0
    new-instance v4, Leo1;

    .line 465
    .line 466
    const/4 v6, 0x1

    .line 467
    invoke-direct {v4, v15, v6}, Leo1;-><init>(Lfo1;I)V

    .line 468
    .line 469
    .line 470
    invoke-virtual {v12, v4}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 471
    .line 472
    .line 473
    new-instance v4, Lbo1;

    .line 474
    .line 475
    const/4 v10, 0x0

    .line 476
    invoke-direct {v4, v15, v10}, Lbo1;-><init>(Lfo1;I)V

    .line 477
    .line 478
    .line 479
    new-instance v11, Lzn1;

    .line 480
    .line 481
    invoke-direct {v11, v10, v4}, Lzn1;-><init>(ILjava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12, v11}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 485
    .line 486
    .line 487
    new-instance v4, Lbo1;

    .line 488
    .line 489
    invoke-direct {v4, v15, v6}, Lbo1;-><init>(Lfo1;I)V

    .line 490
    .line 491
    .line 492
    new-instance v11, Lzn1;

    .line 493
    .line 494
    invoke-direct {v11, v10, v4}, Lzn1;-><init>(ILjava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v9, v11}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 498
    .line 499
    .line 500
    new-instance v4, Lbo1;

    .line 501
    .line 502
    invoke-direct {v4, v15, v7}, Lbo1;-><init>(Lfo1;I)V

    .line 503
    .line 504
    .line 505
    new-instance v9, Lzn1;

    .line 506
    .line 507
    invoke-direct {v9, v10, v4}, Lzn1;-><init>(ILjava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v8, v9}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 511
    .line 512
    .line 513
    new-instance v4, Lbo1;

    .line 514
    .line 515
    const/4 v8, 0x3

    .line 516
    invoke-direct {v4, v15, v8}, Lbo1;-><init>(Lfo1;I)V

    .line 517
    .line 518
    .line 519
    new-instance v9, Lzn1;

    .line 520
    .line 521
    invoke-direct {v9, v10, v4}, Lzn1;-><init>(ILjava/lang/Object;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 525
    .line 526
    .line 527
    new-instance v4, Lxn1;

    .line 528
    .line 529
    const/4 v5, 0x6

    .line 530
    invoke-direct {v4, v15, v5}, Lxn1;-><init>(Lfo1;I)V

    .line 531
    .line 532
    .line 533
    iget-object v5, v14, Luc1;->o:Lcom/google/android/material/button/MaterialButton;

    .line 534
    .line 535
    invoke-virtual {v5, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 536
    .line 537
    .line 538
    new-instance v4, Lxn1;

    .line 539
    .line 540
    invoke-direct {v4, v15, v10}, Lxn1;-><init>(Lfo1;I)V

    .line 541
    .line 542
    .line 543
    iget-object v5, v14, Luc1;->v:Landroid/widget/LinearLayout;

    .line 544
    .line 545
    invoke-virtual {v5, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 546
    .line 547
    .line 548
    new-instance v4, Lxn1;

    .line 549
    .line 550
    invoke-direct {v4, v15, v6}, Lxn1;-><init>(Lfo1;I)V

    .line 551
    .line 552
    .line 553
    iget-object v5, v14, Luc1;->y:Lcom/google/android/material/button/MaterialButton;

    .line 554
    .line 555
    invoke-virtual {v5, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 556
    .line 557
    .line 558
    new-instance v4, Lxn1;

    .line 559
    .line 560
    invoke-direct {v4, v15, v7}, Lxn1;-><init>(Lfo1;I)V

    .line 561
    .line 562
    .line 563
    iget-object v5, v14, Luc1;->g:Lcom/google/android/material/button/MaterialButton;

    .line 564
    .line 565
    invoke-virtual {v5, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 566
    .line 567
    .line 568
    new-instance v4, Lxn1;

    .line 569
    .line 570
    invoke-direct {v4, v15, v8}, Lxn1;-><init>(Lfo1;I)V

    .line 571
    .line 572
    .line 573
    iget-object v5, v14, Luc1;->q:Lcom/google/android/material/button/MaterialButton;

    .line 574
    .line 575
    invoke-virtual {v5, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 576
    .line 577
    .line 578
    new-instance v4, Lxn1;

    .line 579
    .line 580
    const/4 v5, 0x4

    .line 581
    invoke-direct {v4, v15, v5}, Lxn1;-><init>(Lfo1;I)V

    .line 582
    .line 583
    .line 584
    iget-object v5, v14, Luc1;->i:Lcom/google/android/material/button/MaterialButton;

    .line 585
    .line 586
    invoke-virtual {v5, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 587
    .line 588
    .line 589
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 590
    .line 591
    .line 592
    move-result-object v4

    .line 593
    invoke-virtual {v4}, Lcom/eddyizm/tempus/database/AppDatabase;->G()Lna4;

    .line 594
    .line 595
    .line 596
    move-result-object v4

    .line 597
    iget-object v4, v4, Lna4;->n:Ljava/lang/Object;

    .line 598
    .line 599
    check-cast v4, Ls24;

    .line 600
    .line 601
    invoke-virtual {v4}, Ls24;->i()Ls12;

    .line 602
    .line 603
    .line 604
    move-result-object v4

    .line 605
    const-string v5, "server"

    .line 606
    .line 607
    filled-new-array {v5}, [Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object v8

    .line 611
    new-instance v9, Lo54;

    .line 612
    .line 613
    const/16 v10, 0xe

    .line 614
    .line 615
    invoke-direct {v9, v10}, Lo54;-><init>(I)V

    .line 616
    .line 617
    .line 618
    invoke-virtual {v4, v8, v9}, Ls12;->a([Ljava/lang/String;Lif1;)Lt24;

    .line 619
    .line 620
    .line 621
    move-result-object v4

    .line 622
    invoke-virtual {v0}, Lkc1;->v()Lle1;

    .line 623
    .line 624
    .line 625
    move-result-object v8

    .line 626
    new-instance v9, Lx;

    .line 627
    .line 628
    const/16 v11, 0x10

    .line 629
    .line 630
    invoke-direct {v9, v11, v15}, Lx;-><init>(ILjava/lang/Object;)V

    .line 631
    .line 632
    .line 633
    new-instance v11, Lwd1;

    .line 634
    .line 635
    invoke-direct {v11, v9, v7}, Lwd1;-><init>(Lif1;I)V

    .line 636
    .line 637
    .line 638
    invoke-virtual {v4, v8, v11}, Lad2;->e(Lba2;La83;)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v0}, Lkc1;->X()Lnc1;

    .line 642
    .line 643
    .line 644
    move-result-object v4

    .line 645
    invoke-virtual {v4}, Ll70;->i()La93;

    .line 646
    .line 647
    .line 648
    move-result-object v4

    .line 649
    invoke-virtual {v0}, Lkc1;->v()Lle1;

    .line 650
    .line 651
    .line 652
    move-result-object v7

    .line 653
    iget-object v8, v15, Lfo1;->k:Ljava/lang/Object;

    .line 654
    .line 655
    check-cast v8, Lbd1;

    .line 656
    .line 657
    invoke-virtual {v4, v7, v8}, La93;->a(Lba2;Lv83;)V

    .line 658
    .line 659
    .line 660
    sget-object v4, Lco1;->n:Lco1;

    .line 661
    .line 662
    invoke-virtual {v15, v4}, Lfo1;->s(Lco1;)V

    .line 663
    .line 664
    .line 665
    iget-object v4, v14, Luc1;->a:Landroid/widget/ScrollView;

    .line 666
    .line 667
    if-eqz v4, :cond_1

    .line 668
    .line 669
    return-object v4

    .line 670
    :cond_1
    invoke-virtual {v0}, Lkc1;->X()Lnc1;

    .line 671
    .line 672
    .line 673
    move-result-object v4

    .line 674
    invoke-virtual {v4}, Ll70;->d()Le75;

    .line 675
    .line 676
    .line 677
    move-result-object v7

    .line 678
    invoke-static {v4}, Lgh0;->r(Lf75;)Lb75;

    .line 679
    .line 680
    .line 681
    move-result-object v8

    .line 682
    invoke-static {v4, v8}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 683
    .line 684
    .line 685
    move-result-object v4

    .line 686
    new-instance v9, Lbq4;

    .line 687
    .line 688
    invoke-direct {v9, v7, v8, v4}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 689
    .line 690
    .line 691
    const-class v4, Lse2;

    .line 692
    .line 693
    invoke-static {v4}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 694
    .line 695
    .line 696
    move-result-object v4

    .line 697
    invoke-virtual {v4}, Li30;->b()Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v7

    .line 701
    if-eqz v7, :cond_3

    .line 702
    .line 703
    const-string v8, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 704
    .line 705
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v7

    .line 709
    invoke-virtual {v9, v4, v7}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 710
    .line 711
    .line 712
    move-result-object v4

    .line 713
    check-cast v4, Lse2;

    .line 714
    .line 715
    iput-object v4, v0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->n0:Lse2;

    .line 716
    .line 717
    const v4, 0x7f0d0078

    .line 718
    .line 719
    .line 720
    const/4 v7, 0x0

    .line 721
    invoke-virtual {v1, v4, v2, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 722
    .line 723
    .line 724
    move-result-object v1

    .line 725
    const v2, 0x7f0a00da

    .line 726
    .line 727
    .line 728
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 729
    .line 730
    .line 731
    move-result-object v4

    .line 732
    move-object v13, v4

    .line 733
    check-cast v13, Lcom/google/android/material/appbar/AppBarLayout;

    .line 734
    .line 735
    if-eqz v13, :cond_2

    .line 736
    .line 737
    const v2, 0x7f0a041b

    .line 738
    .line 739
    .line 740
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 741
    .line 742
    .line 743
    move-result-object v4

    .line 744
    move-object v14, v4

    .line 745
    check-cast v14, Lcom/google/android/material/button/MaterialButton;

    .line 746
    .line 747
    if-eqz v14, :cond_2

    .line 748
    .line 749
    const v2, 0x7f0a0421

    .line 750
    .line 751
    .line 752
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 753
    .line 754
    .line 755
    move-result-object v4

    .line 756
    move-object v15, v4

    .line 757
    check-cast v15, Landroid/widget/TextView;

    .line 758
    .line 759
    if-eqz v15, :cond_2

    .line 760
    .line 761
    const v2, 0x7f0a055c

    .line 762
    .line 763
    .line 764
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 765
    .line 766
    .line 767
    move-result-object v4

    .line 768
    move-object/from16 v16, v4

    .line 769
    .line 770
    check-cast v16, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 771
    .line 772
    if-eqz v16, :cond_2

    .line 773
    .line 774
    const v2, 0x7f0a055d

    .line 775
    .line 776
    .line 777
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 778
    .line 779
    .line 780
    move-result-object v4

    .line 781
    move-object/from16 v17, v4

    .line 782
    .line 783
    check-cast v17, Landroidx/recyclerview/widget/RecyclerView;

    .line 784
    .line 785
    if-eqz v17, :cond_2

    .line 786
    .line 787
    const v2, 0x7f0a061b

    .line 788
    .line 789
    .line 790
    invoke-static {v1, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 791
    .line 792
    .line 793
    move-result-object v4

    .line 794
    move-object/from16 v18, v4

    .line 795
    .line 796
    check-cast v18, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 797
    .line 798
    if-eqz v18, :cond_2

    .line 799
    .line 800
    new-instance v11, Lml3;

    .line 801
    .line 802
    move-object v12, v1

    .line 803
    check-cast v12, Landroid/widget/LinearLayout;

    .line 804
    .line 805
    invoke-direct/range {v11 .. v18}, Lml3;-><init>(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    .line 806
    .line 807
    .line 808
    move-object/from16 v4, v18

    .line 809
    .line 810
    iput-object v11, v0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->l0:Lml3;

    .line 811
    .line 812
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 813
    .line 814
    invoke-virtual {v1, v4}, Ldf;->o(Landroidx/appcompat/widget/Toolbar;)V

    .line 815
    .line 816
    .line 817
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->l0:Lml3;

    .line 818
    .line 819
    iget-object v1, v1, Lml3;->a:Ljava/lang/Object;

    .line 820
    .line 821
    check-cast v1, Lcom/google/android/material/appbar/AppBarLayout;

    .line 822
    .line 823
    new-instance v2, Lu7;

    .line 824
    .line 825
    const/4 v3, 0x7

    .line 826
    invoke-direct {v2, v3, v0}, Lu7;-><init>(ILkc1;)V

    .line 827
    .line 828
    .line 829
    invoke-virtual {v1, v2}, Lcom/google/android/material/appbar/AppBarLayout;->a(Laf;)V

    .line 830
    .line 831
    .line 832
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->l0:Lml3;

    .line 833
    .line 834
    iget-object v1, v1, Lml3;->e:Ljava/lang/Object;

    .line 835
    .line 836
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 837
    .line 838
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 839
    .line 840
    invoke-virtual {v0}, Lkc1;->Z()Landroid/content/Context;

    .line 841
    .line 842
    .line 843
    invoke-direct {v2, v6}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 844
    .line 845
    .line 846
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 847
    .line 848
    .line 849
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->l0:Lml3;

    .line 850
    .line 851
    iget-object v1, v1, Lml3;->e:Ljava/lang/Object;

    .line 852
    .line 853
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 854
    .line 855
    invoke-virtual {v1, v6}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 856
    .line 857
    .line 858
    new-instance v1, Lzd0;

    .line 859
    .line 860
    invoke-direct {v1, v0}, Lzd0;-><init>(Lcom/eddyizm/tempus/ui/fragment/LoginFragment;)V

    .line 861
    .line 862
    .line 863
    iput-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->o0:Lzd0;

    .line 864
    .line 865
    iget-object v2, v0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->l0:Lml3;

    .line 866
    .line 867
    iget-object v2, v2, Lml3;->e:Ljava/lang/Object;

    .line 868
    .line 869
    check-cast v2, Landroidx/recyclerview/widget/RecyclerView;

    .line 870
    .line 871
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 872
    .line 873
    .line 874
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->n0:Lse2;

    .line 875
    .line 876
    iget-object v1, v1, Lse2;->c:Lpz1;

    .line 877
    .line 878
    iget-object v1, v1, Lpz1;->o:Ljava/lang/Object;

    .line 879
    .line 880
    check-cast v1, Lna4;

    .line 881
    .line 882
    iget-object v1, v1, Lna4;->n:Ljava/lang/Object;

    .line 883
    .line 884
    check-cast v1, Ls24;

    .line 885
    .line 886
    invoke-virtual {v1}, Ls24;->i()Ls12;

    .line 887
    .line 888
    .line 889
    move-result-object v1

    .line 890
    filled-new-array {v5}, [Ljava/lang/String;

    .line 891
    .line 892
    .line 893
    move-result-object v2

    .line 894
    new-instance v3, Lo54;

    .line 895
    .line 896
    invoke-direct {v3, v10}, Lo54;-><init>(I)V

    .line 897
    .line 898
    .line 899
    invoke-virtual {v1, v2, v3}, Ls12;->a([Ljava/lang/String;Lif1;)Lt24;

    .line 900
    .line 901
    .line 902
    move-result-object v1

    .line 903
    invoke-virtual {v0}, Lkc1;->v()Lle1;

    .line 904
    .line 905
    .line 906
    move-result-object v2

    .line 907
    new-instance v3, Ld8;

    .line 908
    .line 909
    invoke-direct {v3, v10, v0}, Ld8;-><init>(ILjava/lang/Object;)V

    .line 910
    .line 911
    .line 912
    invoke-virtual {v1, v2, v3}, Lad2;->e(Lba2;La83;)V

    .line 913
    .line 914
    .line 915
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->l0:Lml3;

    .line 916
    .line 917
    iget-object v1, v1, Lml3;->b:Ljava/lang/Object;

    .line 918
    .line 919
    check-cast v1, Lcom/google/android/material/button/MaterialButton;

    .line 920
    .line 921
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 922
    .line 923
    .line 924
    move-result-object v1

    .line 925
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 926
    .line 927
    iget v2, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 928
    .line 929
    iget-object v3, v0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->l0:Lml3;

    .line 930
    .line 931
    iget-object v3, v3, Lml3;->b:Ljava/lang/Object;

    .line 932
    .line 933
    check-cast v3, Lcom/google/android/material/button/MaterialButton;

    .line 934
    .line 935
    new-instance v4, Lq31;

    .line 936
    .line 937
    invoke-direct {v4, v2, v6, v1}, Lq31;-><init>(IILjava/lang/Object;)V

    .line 938
    .line 939
    .line 940
    sget-object v1, Lj65;->a:Ljava/util/WeakHashMap;

    .line 941
    .line 942
    invoke-static {v3, v4}, La65;->c(Landroid/view/View;Lr83;)V

    .line 943
    .line 944
    .line 945
    iget-object v1, v0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->l0:Lml3;

    .line 946
    .line 947
    iget-object v1, v1, Lml3;->b:Ljava/lang/Object;

    .line 948
    .line 949
    check-cast v1, Lcom/google/android/material/button/MaterialButton;

    .line 950
    .line 951
    new-instance v2, Lp6;

    .line 952
    .line 953
    const/16 v3, 0x18

    .line 954
    .line 955
    invoke-direct {v2, v3, v0}, Lp6;-><init>(ILjava/lang/Object;)V

    .line 956
    .line 957
    .line 958
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 959
    .line 960
    .line 961
    return-object v12

    .line 962
    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 967
    .line 968
    .line 969
    move-result-object v0

    .line 970
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 971
    .line 972
    .line 973
    move-result-object v0

    .line 974
    invoke-static {v0}, Lnz2;->n(Ljava/lang/String;)V

    .line 975
    .line 976
    .line 977
    return-object p3

    .line 978
    :cond_3
    const-string v0, "Local and anonymous classes can not be ViewModels"

    .line 979
    .line 980
    invoke-static {v0}, Lkf2;->n(Ljava/lang/String;)V

    .line 981
    .line 982
    .line 983
    return-object p3

    .line 984
    :cond_4
    move-object v0, v7

    .line 985
    const/16 p3, 0x0

    .line 986
    .line 987
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 988
    .line 989
    .line 990
    move-result-object v1

    .line 991
    invoke-virtual {v1, v5}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 992
    .line 993
    .line 994
    move-result-object v1

    .line 995
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 996
    .line 997
    .line 998
    move-result-object v0

    .line 999
    invoke-static {v0}, Lnz2;->n(Ljava/lang/String;)V

    .line 1000
    .line 1001
    .line 1002
    return-object p3
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
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->l0:Lml3;

    .line 6
    .line 7
    return-void
.end method

.method public final N(Landroid/view/MenuItem;)Z
    .locals 1

    .line 1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const v0, 0x7f0a0035

    .line 6
    .line 7
    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    new-instance p1, Lra4;

    .line 11
    .line 12
    invoke-direct {p1}, Lra4;-><init>()V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 16
    .line 17
    invoke-virtual {p0}, Lnc1;->k()Lmd1;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const/4 v0, 0x0

    .line 22
    invoke-virtual {p1, p0, v0}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public final onServerClick(Landroid/os/Bundle;)V
    .locals 10

    .line 1
    const-string v0, "server_object"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/eddyizm/tempus/model/Server;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/Server;->getServerId()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/Server;->getAddress()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/Server;->getLocalAddress()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/Server;->getUsername()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/Server;->getPassword()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/Server;->isLowSecurity()Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/Server;->getClientCert()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {}, Lud3;->u()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    invoke-static {v6, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    const/4 v8, 0x0

    .line 46
    const/4 v9, 0x1

    .line 47
    if-nez v7, :cond_1

    .line 48
    .line 49
    invoke-static {v6, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v6

    .line 53
    if-eqz v6, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move v6, v8

    .line 57
    goto :goto_1

    .line 58
    :cond_1
    :goto_0
    move v6, v9

    .line 59
    :goto_1
    invoke-static {v0}, Lud3;->w0(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-static {v1}, Lud3;->v0(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v2}, Lud3;->n0(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    if-nez v6, :cond_2

    .line 69
    .line 70
    invoke-static {v1}, Lud3;->m0(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    invoke-static {v3}, Lud3;->D0(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v4}, Lud3;->q0(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v5}, Lud3;->o0(Z)V

    .line 80
    .line 81
    .line 82
    invoke-static {p1}, Lud3;->h0(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-static {v9}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 86
    .line 87
    .line 88
    new-instance p1, Lie2;

    .line 89
    .line 90
    invoke-direct {p1, p0}, Lie2;-><init>(Lcom/eddyizm/tempus/ui/fragment/LoginFragment;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v8}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    iget-object v0, p0, Lpn4;->c:Lgp3;

    .line 98
    .line 99
    if-nez v0, :cond_3

    .line 100
    .line 101
    new-instance v0, Lgp3;

    .line 102
    .line 103
    const/16 v1, 0x15

    .line 104
    .line 105
    invoke-direct {v0, p0, v1}, Lgp3;-><init>(Lpn4;I)V

    .line 106
    .line 107
    .line 108
    iput-object v0, p0, Lpn4;->c:Lgp3;

    .line 109
    .line 110
    :cond_3
    iget-object p0, p0, Lpn4;->c:Lgp3;

    .line 111
    .line 112
    invoke-virtual {p0}, Lgp3;->u()Lretrofit2/Call;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    new-instance v0, Lrm2;

    .line 117
    .line 118
    const/16 v1, 0x17

    .line 119
    .line 120
    invoke-direct {v0, v1, p1}, Lrm2;-><init>(ILjava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {p0, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 124
    .line 125
    .line 126
    return-void
.end method

.method public final onServerLongClick(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance v0, Lra4;

    .line 2
    .line 3
    invoke-direct {v0}, Lra4;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 10
    .line 11
    invoke-virtual {p0}, Lnc1;->k()Lmd1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-virtual {v0, p0, p1}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
