.class public final synthetic Lau3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Leu3;


# direct methods
.method public synthetic constructor <init>(Leu3;I)V
    .locals 0

    .line 1
    iput p2, p0, Lau3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lau3;->o:Leu3;

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
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lau3;->n:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/16 v3, 0xb

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/16 v5, 0x8

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    const-string v7, ""

    .line 13
    .line 14
    const/4 v8, 0x1

    .line 15
    iget-object v0, v0, Lau3;->o:Leu3;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, Leu3;->J0:Lw12;

    .line 21
    .line 22
    iget-object v1, v1, Lw12;->k:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 25
    .line 26
    invoke-virtual {v1}, Lhg;->getText()Landroid/text/Editable;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v2, v0, Leu3;->J0:Lw12;

    .line 42
    .line 43
    iget-object v2, v2, Lw12;->e:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v2, Lcom/google/android/material/textfield/TextInputEditText;

    .line 46
    .line 47
    invoke-virtual {v2}, Lhg;->getText()Landroid/text/Editable;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    iget-object v2, v0, Leu3;->J0:Lw12;

    .line 54
    .line 55
    iget-object v2, v2, Lw12;->e:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v2, Lcom/google/android/material/textfield/TextInputEditText;

    .line 58
    .line 59
    invoke-virtual {v2}, Lhg;->getText()Landroid/text/Editable;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    if-eqz v2, :cond_1

    .line 76
    .line 77
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    if-eqz v2, :cond_1

    .line 82
    .line 83
    iget-object v1, v0, Leu3;->J0:Lw12;

    .line 84
    .line 85
    iget-object v1, v1, Lw12;->k:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 88
    .line 89
    const v2, 0x7f130439

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v2}, Lkc1;->s(I)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_1
    iget-object v2, v0, Leu3;->J0:Lw12;

    .line 101
    .line 102
    if-eqz v2, :cond_2

    .line 103
    .line 104
    iget-object v2, v2, Lw12;->g:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v2, Landroid/widget/ListView;

    .line 107
    .line 108
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 109
    .line 110
    .line 111
    :cond_2
    invoke-virtual {v0, v1, v7}, Leu3;->n0(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :goto_0
    return-void

    .line 115
    :pswitch_0
    iget-object v0, v0, Leu3;->I0:Landroid/widget/PopupWindow;

    .line 116
    .line 117
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :pswitch_1
    iget-object v1, v0, Leu3;->I0:Landroid/widget/PopupWindow;

    .line 122
    .line 123
    if-eqz v1, :cond_3

    .line 124
    .line 125
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    if-eqz v1, :cond_3

    .line 130
    .line 131
    iget-object v0, v0, Leu3;->I0:Landroid/widget/PopupWindow;

    .line 132
    .line 133
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 134
    .line 135
    .line 136
    goto/16 :goto_2

    .line 137
    .line 138
    :cond_3
    invoke-virtual {v0}, Lkc1;->o()Landroid/view/LayoutInflater;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    const v5, 0x7f0d0117

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v5, v4, v6}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    const v4, 0x7f0a04e8

    .line 150
    .line 151
    .line 152
    invoke-static {v1, v4}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    move-object v11, v5

    .line 157
    check-cast v11, Lcom/google/android/material/button/MaterialButton;

    .line 158
    .line 159
    if-eqz v11, :cond_5

    .line 160
    .line 161
    const v4, 0x7f0a04e9

    .line 162
    .line 163
    .line 164
    invoke-static {v1, v4}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    move-object v12, v5

    .line 169
    check-cast v12, Lcom/google/android/material/textfield/TextInputEditText;

    .line 170
    .line 171
    if-eqz v12, :cond_5

    .line 172
    .line 173
    const v4, 0x7f0a04ea

    .line 174
    .line 175
    .line 176
    invoke-static {v1, v4}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    move-object v13, v5

    .line 181
    check-cast v13, Lcom/google/android/material/textfield/TextInputLayout;

    .line 182
    .line 183
    if-eqz v13, :cond_5

    .line 184
    .line 185
    const v4, 0x7f0a04eb

    .line 186
    .line 187
    .line 188
    invoke-static {v1, v4}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    move-object v14, v5

    .line 193
    check-cast v14, Landroid/widget/ListView;

    .line 194
    .line 195
    if-eqz v14, :cond_5

    .line 196
    .line 197
    const v4, 0x7f0a04ec

    .line 198
    .line 199
    .line 200
    invoke-static {v1, v4}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    move-object v15, v5

    .line 205
    check-cast v15, Landroid/widget/TextView;

    .line 206
    .line 207
    if-eqz v15, :cond_5

    .line 208
    .line 209
    const v4, 0x7f0a04ed

    .line 210
    .line 211
    .line 212
    invoke-static {v1, v4}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 213
    .line 214
    .line 215
    move-result-object v5

    .line 216
    move-object/from16 v16, v5

    .line 217
    .line 218
    check-cast v16, Landroid/widget/ProgressBar;

    .line 219
    .line 220
    if-eqz v16, :cond_5

    .line 221
    .line 222
    const v4, 0x7f0a04ee

    .line 223
    .line 224
    .line 225
    invoke-static {v1, v4}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 226
    .line 227
    .line 228
    move-result-object v5

    .line 229
    move-object/from16 v17, v5

    .line 230
    .line 231
    check-cast v17, Landroidx/recyclerview/widget/RecyclerView;

    .line 232
    .line 233
    if-eqz v17, :cond_5

    .line 234
    .line 235
    const v4, 0x7f0a04ef

    .line 236
    .line 237
    .line 238
    invoke-static {v1, v4}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 239
    .line 240
    .line 241
    move-result-object v5

    .line 242
    move-object/from16 v18, v5

    .line 243
    .line 244
    check-cast v18, Lcom/google/android/material/button/MaterialButton;

    .line 245
    .line 246
    if-eqz v18, :cond_5

    .line 247
    .line 248
    const v4, 0x7f0a04f0

    .line 249
    .line 250
    .line 251
    invoke-static {v1, v4}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    move-object/from16 v19, v5

    .line 256
    .line 257
    check-cast v19, Lcom/google/android/material/textfield/TextInputEditText;

    .line 258
    .line 259
    if-eqz v19, :cond_5

    .line 260
    .line 261
    const v4, 0x7f0a04f1

    .line 262
    .line 263
    .line 264
    invoke-static {v1, v4}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 265
    .line 266
    .line 267
    move-result-object v5

    .line 268
    check-cast v5, Lcom/google/android/material/textfield/TextInputLayout;

    .line 269
    .line 270
    if-eqz v5, :cond_5

    .line 271
    .line 272
    new-instance v9, Lw12;

    .line 273
    .line 274
    move-object v10, v1

    .line 275
    check-cast v10, Landroid/widget/LinearLayout;

    .line 276
    .line 277
    invoke-direct/range {v9 .. v19}, Lw12;-><init>(Landroid/widget/LinearLayout;Lcom/google/android/material/button/MaterialButton;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputLayout;Landroid/widget/ListView;Landroid/widget/TextView;Landroid/widget/ProgressBar;Landroidx/recyclerview/widget/RecyclerView;Lcom/google/android/material/button/MaterialButton;Lcom/google/android/material/textfield/TextInputEditText;)V

    .line 278
    .line 279
    .line 280
    iput-object v9, v0, Leu3;->J0:Lw12;

    .line 281
    .line 282
    new-instance v1, Lzd0;

    .line 283
    .line 284
    new-instance v4, Lss2;

    .line 285
    .line 286
    invoke-direct {v4, v3, v0}, Lss2;-><init>(ILjava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    invoke-direct {v1, v4}, Lzd0;-><init>(Lss2;)V

    .line 290
    .line 291
    .line 292
    iput-object v1, v0, Leu3;->L0:Lzd0;

    .line 293
    .line 294
    iget-object v1, v0, Leu3;->J0:Lw12;

    .line 295
    .line 296
    iget-object v1, v1, Lw12;->i:Ljava/lang/Object;

    .line 297
    .line 298
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 299
    .line 300
    new-instance v3, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 301
    .line 302
    invoke-virtual {v0}, Lkc1;->Z()Landroid/content/Context;

    .line 303
    .line 304
    .line 305
    invoke-direct {v3, v8}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Lmw3;)V

    .line 309
    .line 310
    .line 311
    iget-object v1, v0, Leu3;->J0:Lw12;

    .line 312
    .line 313
    iget-object v1, v1, Lw12;->i:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 316
    .line 317
    iget-object v3, v0, Leu3;->L0:Lzd0;

    .line 318
    .line 319
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ldw3;)V

    .line 320
    .line 321
    .line 322
    iget-object v1, v0, Leu3;->J0:Lw12;

    .line 323
    .line 324
    iget-object v1, v1, Lw12;->k:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 327
    .line 328
    iget-object v3, v0, Leu3;->B0:Lup0;

    .line 329
    .line 330
    iget-object v3, v3, Lup0;->f:Landroid/view/View;

    .line 331
    .line 332
    check-cast v3, Lcom/google/android/material/textfield/TextInputEditText;

    .line 333
    .line 334
    invoke-virtual {v3}, Lhg;->getText()Landroid/text/Editable;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 339
    .line 340
    .line 341
    new-instance v1, Landroid/widget/ArrayAdapter;

    .line 342
    .line 343
    invoke-virtual {v0}, Lkc1;->Z()Landroid/content/Context;

    .line 344
    .line 345
    .line 346
    move-result-object v3

    .line 347
    const v4, 0x7f0d0095

    .line 348
    .line 349
    .line 350
    invoke-direct {v1, v3, v4}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I)V

    .line 351
    .line 352
    .line 353
    iput-object v1, v0, Leu3;->M0:Landroid/widget/ArrayAdapter;

    .line 354
    .line 355
    iget-object v3, v0, Leu3;->J0:Lw12;

    .line 356
    .line 357
    iget-object v3, v3, Lw12;->g:Ljava/lang/Object;

    .line 358
    .line 359
    check-cast v3, Landroid/widget/ListView;

    .line 360
    .line 361
    invoke-virtual {v3, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 362
    .line 363
    .line 364
    iget-object v1, v0, Leu3;->J0:Lw12;

    .line 365
    .line 366
    iget-object v1, v1, Lw12;->g:Ljava/lang/Object;

    .line 367
    .line 368
    check-cast v1, Landroid/widget/ListView;

    .line 369
    .line 370
    new-instance v3, Lne2;

    .line 371
    .line 372
    invoke-direct {v3, v8, v0}, Lne2;-><init>(ILkc1;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v1, v3}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 376
    .line 377
    .line 378
    iget-object v1, v0, Leu3;->J0:Lw12;

    .line 379
    .line 380
    iget-object v1, v1, Lw12;->e:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 383
    .line 384
    new-instance v3, Lpn1;

    .line 385
    .line 386
    invoke-direct {v3, v8, v0}, Lpn1;-><init>(ILjava/lang/Object;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 390
    .line 391
    .line 392
    iget-object v1, v0, Leu3;->J0:Lw12;

    .line 393
    .line 394
    iget-object v1, v1, Lw12;->e:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 397
    .line 398
    new-instance v3, Lzt3;

    .line 399
    .line 400
    invoke-direct {v3, v0, v6}, Lzt3;-><init>(Leu3;I)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 404
    .line 405
    .line 406
    iget-object v1, v0, Leu3;->J0:Lw12;

    .line 407
    .line 408
    iget-object v1, v1, Lw12;->f:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast v1, Lcom/google/android/material/textfield/TextInputLayout;

    .line 411
    .line 412
    new-instance v3, Lau3;

    .line 413
    .line 414
    invoke-direct {v3, v0, v6}, Lau3;-><init>(Leu3;I)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v1, v3}, Lcom/google/android/material/textfield/TextInputLayout;->setEndIconOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v0}, Leu3;->p0()V

    .line 421
    .line 422
    .line 423
    iget-object v1, v0, Leu3;->J0:Lw12;

    .line 424
    .line 425
    iget-object v1, v1, Lw12;->k:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 428
    .line 429
    new-instance v3, Lzt3;

    .line 430
    .line 431
    invoke-direct {v3, v0, v8}, Lzt3;-><init>(Leu3;I)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 435
    .line 436
    .line 437
    iget-object v1, v0, Leu3;->K0:Ljava/util/ArrayList;

    .line 438
    .line 439
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 440
    .line 441
    .line 442
    move-result v1

    .line 443
    if-nez v1, :cond_4

    .line 444
    .line 445
    goto :goto_1

    .line 446
    :cond_4
    invoke-static {}, Lvt3;->a()Lvt3;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 451
    .line 452
    .line 453
    const-string v3, "RadioBrowserClient"

    .line 454
    .line 455
    const-string v4, "getCountries"

    .line 456
    .line 457
    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 458
    .line 459
    .line 460
    iget-object v1, v1, Lvt3;->a:Lwt3;

    .line 461
    .line 462
    invoke-interface {v1}, Lwt3;->a()Lretrofit2/Call;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    new-instance v3, Lsi1;

    .line 467
    .line 468
    const/16 v4, 0x12

    .line 469
    .line 470
    invoke-direct {v3, v4, v0}, Lsi1;-><init>(ILjava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    invoke-interface {v1, v3}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 474
    .line 475
    .line 476
    :goto_1
    iget-object v1, v0, Leu3;->J0:Lw12;

    .line 477
    .line 478
    iget-object v1, v1, Lw12;->c:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast v1, Lcom/google/android/material/button/MaterialButton;

    .line 481
    .line 482
    new-instance v3, Lau3;

    .line 483
    .line 484
    const/4 v4, 0x3

    .line 485
    invoke-direct {v3, v0, v4}, Lau3;-><init>(Leu3;I)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 489
    .line 490
    .line 491
    iget-object v1, v0, Leu3;->J0:Lw12;

    .line 492
    .line 493
    iget-object v1, v1, Lw12;->j:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast v1, Lcom/google/android/material/button/MaterialButton;

    .line 496
    .line 497
    new-instance v3, Lau3;

    .line 498
    .line 499
    const/4 v4, 0x4

    .line 500
    invoke-direct {v3, v0, v4}, Lau3;-><init>(Leu3;I)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 504
    .line 505
    .line 506
    new-instance v1, Landroid/graphics/Rect;

    .line 507
    .line 508
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v0}, Lkc1;->X()Lnc1;

    .line 512
    .line 513
    .line 514
    move-result-object v3

    .line 515
    invoke-virtual {v3}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 516
    .line 517
    .line 518
    move-result-object v3

    .line 519
    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 520
    .line 521
    .line 522
    move-result-object v3

    .line 523
    invoke-virtual {v3, v1}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v0}, Lkc1;->r()Landroid/content/res/Resources;

    .line 527
    .line 528
    .line 529
    move-result-object v3

    .line 530
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 531
    .line 532
    .line 533
    move-result-object v3

    .line 534
    iget v3, v3, Landroid/util/DisplayMetrics;->density:F

    .line 535
    .line 536
    const/high16 v4, 0x41800000    # 16.0f

    .line 537
    .line 538
    mul-float/2addr v3, v4

    .line 539
    float-to-int v3, v3

    .line 540
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 541
    .line 542
    .line 543
    move-result v5

    .line 544
    mul-int/2addr v3, v2

    .line 545
    sub-int/2addr v5, v3

    .line 546
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 547
    .line 548
    .line 549
    move-result v1

    .line 550
    int-to-double v1, v1

    .line 551
    const-wide v9, 0x3fe3333333333333L    # 0.6

    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    mul-double/2addr v1, v9

    .line 557
    double-to-int v1, v1

    .line 558
    new-instance v2, Landroid/widget/PopupWindow;

    .line 559
    .line 560
    iget-object v3, v0, Leu3;->J0:Lw12;

    .line 561
    .line 562
    iget-object v3, v3, Lw12;->b:Ljava/lang/Object;

    .line 563
    .line 564
    check-cast v3, Landroid/widget/LinearLayout;

    .line 565
    .line 566
    invoke-direct {v2, v3, v5, v1, v8}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    .line 567
    .line 568
    .line 569
    iput-object v2, v0, Leu3;->I0:Landroid/widget/PopupWindow;

    .line 570
    .line 571
    invoke-virtual {v2, v8}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 572
    .line 573
    .line 574
    iget-object v1, v0, Leu3;->I0:Landroid/widget/PopupWindow;

    .line 575
    .line 576
    invoke-virtual {v1, v4}, Landroid/widget/PopupWindow;->setElevation(F)V

    .line 577
    .line 578
    .line 579
    iget-object v1, v0, Leu3;->I0:Landroid/widget/PopupWindow;

    .line 580
    .line 581
    invoke-virtual {v1, v8}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 582
    .line 583
    .line 584
    iget-object v1, v0, Leu3;->I0:Landroid/widget/PopupWindow;

    .line 585
    .line 586
    invoke-virtual {v1, v8}, Landroid/widget/PopupWindow;->setClippingEnabled(Z)V

    .line 587
    .line 588
    .line 589
    iget-object v1, v0, Leu3;->I0:Landroid/widget/PopupWindow;

    .line 590
    .line 591
    new-instance v2, Lyt3;

    .line 592
    .line 593
    invoke-direct {v2, v0}, Lyt3;-><init>(Leu3;)V

    .line 594
    .line 595
    .line 596
    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 597
    .line 598
    .line 599
    iget-object v1, v0, Leu3;->I0:Landroid/widget/PopupWindow;

    .line 600
    .line 601
    iget-object v2, v0, Leu3;->B0:Lup0;

    .line 602
    .line 603
    iget-object v2, v2, Lup0;->a:Landroid/view/ViewGroup;

    .line 604
    .line 605
    check-cast v2, Landroid/widget/LinearLayout;

    .line 606
    .line 607
    const/16 v3, 0x11

    .line 608
    .line 609
    invoke-virtual {v1, v2, v3, v6, v6}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 610
    .line 611
    .line 612
    iget-object v1, v0, Leu3;->J0:Lw12;

    .line 613
    .line 614
    iget-object v1, v1, Lw12;->k:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 617
    .line 618
    invoke-virtual {v1}, Lhg;->getText()Landroid/text/Editable;

    .line 619
    .line 620
    .line 621
    move-result-object v1

    .line 622
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v1

    .line 633
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 634
    .line 635
    .line 636
    move-result v2

    .line 637
    if-nez v2, :cond_6

    .line 638
    .line 639
    invoke-virtual {v0, v1, v7}, Leu3;->n0(Ljava/lang/String;Ljava/lang/String;)V

    .line 640
    .line 641
    .line 642
    goto :goto_2

    .line 643
    :cond_5
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 644
    .line 645
    .line 646
    move-result-object v0

    .line 647
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    const-string v1, "Missing required view with ID: "

    .line 652
    .line 653
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    invoke-static {v0}, Lnz2;->n(Ljava/lang/String;)V

    .line 658
    .line 659
    .line 660
    :cond_6
    :goto_2
    return-void

    .line 661
    :pswitch_2
    iget-object v1, v0, Leu3;->B0:Lup0;

    .line 662
    .line 663
    iget-object v1, v1, Lup0;->f:Landroid/view/View;

    .line 664
    .line 665
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 666
    .line 667
    invoke-virtual {v1}, Lhg;->getText()Landroid/text/Editable;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    move-result-object v1

    .line 678
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v1

    .line 682
    iput-object v1, v0, Leu3;->E0:Ljava/lang/String;

    .line 683
    .line 684
    iget-object v1, v0, Leu3;->B0:Lup0;

    .line 685
    .line 686
    iget-object v1, v1, Lup0;->g:Landroid/view/View;

    .line 687
    .line 688
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 689
    .line 690
    invoke-virtual {v1}, Lhg;->getText()Landroid/text/Editable;

    .line 691
    .line 692
    .line 693
    move-result-object v1

    .line 694
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 698
    .line 699
    .line 700
    move-result-object v1

    .line 701
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 702
    .line 703
    .line 704
    move-result-object v1

    .line 705
    iput-object v1, v0, Leu3;->F0:Ljava/lang/String;

    .line 706
    .line 707
    iget-object v1, v0, Leu3;->B0:Lup0;

    .line 708
    .line 709
    iget-object v1, v1, Lup0;->e:Landroid/view/View;

    .line 710
    .line 711
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 712
    .line 713
    invoke-virtual {v1}, Lhg;->getText()Landroid/text/Editable;

    .line 714
    .line 715
    .line 716
    move-result-object v1

    .line 717
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v1

    .line 728
    iput-object v1, v0, Leu3;->G0:Ljava/lang/String;

    .line 729
    .line 730
    iget-object v1, v0, Leu3;->B0:Lup0;

    .line 731
    .line 732
    iget-object v1, v1, Lup0;->d:Landroid/view/View;

    .line 733
    .line 734
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 735
    .line 736
    invoke-virtual {v1}, Lhg;->getText()Landroid/text/Editable;

    .line 737
    .line 738
    .line 739
    move-result-object v1

    .line 740
    if-eqz v1, :cond_7

    .line 741
    .line 742
    iget-object v1, v0, Leu3;->B0:Lup0;

    .line 743
    .line 744
    iget-object v1, v1, Lup0;->d:Landroid/view/View;

    .line 745
    .line 746
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 747
    .line 748
    invoke-virtual {v1}, Lhg;->getText()Landroid/text/Editable;

    .line 749
    .line 750
    .line 751
    move-result-object v1

    .line 752
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 753
    .line 754
    .line 755
    move-result-object v1

    .line 756
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 757
    .line 758
    .line 759
    move-result-object v7

    .line 760
    :cond_7
    iput-object v7, v0, Leu3;->H0:Ljava/lang/String;

    .line 761
    .line 762
    iget-object v1, v0, Leu3;->E0:Ljava/lang/String;

    .line 763
    .line 764
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 765
    .line 766
    .line 767
    move-result v1

    .line 768
    const v5, 0x7f130112

    .line 769
    .line 770
    .line 771
    if-eqz v1, :cond_8

    .line 772
    .line 773
    iget-object v1, v0, Leu3;->B0:Lup0;

    .line 774
    .line 775
    iget-object v1, v1, Lup0;->f:Landroid/view/View;

    .line 776
    .line 777
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 778
    .line 779
    invoke-virtual {v0, v5}, Lkc1;->s(I)Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    .line 784
    .line 785
    .line 786
    goto/16 :goto_7

    .line 787
    .line 788
    :cond_8
    iget-object v1, v0, Leu3;->F0:Ljava/lang/String;

    .line 789
    .line 790
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 791
    .line 792
    .line 793
    move-result v1

    .line 794
    if-eqz v1, :cond_9

    .line 795
    .line 796
    iget-object v1, v0, Leu3;->B0:Lup0;

    .line 797
    .line 798
    iget-object v1, v1, Lup0;->g:Landroid/view/View;

    .line 799
    .line 800
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 801
    .line 802
    invoke-virtual {v0, v5}, Lkc1;->s(I)Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v0

    .line 806
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    .line 807
    .line 808
    .line 809
    goto/16 :goto_7

    .line 810
    .line 811
    :cond_9
    iget-object v1, v0, Leu3;->C0:Lgu3;

    .line 812
    .line 813
    iget-object v5, v1, Lgu3;->d:Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;

    .line 814
    .line 815
    iget-object v7, v1, Lgu3;->c:Lhh3;

    .line 816
    .line 817
    iget-object v9, v1, Lgu3;->f:Lk03;

    .line 818
    .line 819
    iget-object v10, v1, Lgu3;->g:Lk03;

    .line 820
    .line 821
    iget-object v15, v0, Leu3;->E0:Ljava/lang/String;

    .line 822
    .line 823
    iget-object v14, v0, Leu3;->F0:Ljava/lang/String;

    .line 824
    .line 825
    iget-object v11, v0, Leu3;->G0:Ljava/lang/String;

    .line 826
    .line 827
    const-string v12, "InternetRadioClient"

    .line 828
    .line 829
    if-nez v5, :cond_d

    .line 830
    .line 831
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    .line 832
    .line 833
    .line 834
    move-result v3

    .line 835
    if-eqz v3, :cond_a

    .line 836
    .line 837
    move-object v3, v4

    .line 838
    goto :goto_3

    .line 839
    :cond_a
    iget-object v3, v0, Leu3;->G0:Ljava/lang/String;

    .line 840
    .line 841
    :goto_3
    iget-object v5, v0, Leu3;->H0:Ljava/lang/String;

    .line 842
    .line 843
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 844
    .line 845
    .line 846
    move-result v5

    .line 847
    if-eqz v5, :cond_b

    .line 848
    .line 849
    move-object v0, v4

    .line 850
    goto :goto_4

    .line 851
    :cond_b
    iget-object v0, v0, Leu3;->H0:Ljava/lang/String;

    .line 852
    .line 853
    :goto_4
    invoke-virtual {v10, v4}, Lad2;->k(Ljava/lang/Object;)V

    .line 854
    .line 855
    .line 856
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 857
    .line 858
    invoke-virtual {v9, v4}, Lad2;->k(Ljava/lang/Object;)V

    .line 859
    .line 860
    .line 861
    iget-boolean v4, v1, Lgu3;->e:Z

    .line 862
    .line 863
    if-eqz v4, :cond_c

    .line 864
    .line 865
    new-instance v4, Lfu3;

    .line 866
    .line 867
    invoke-direct {v4, v1, v2}, Lfu3;-><init>(Lgu3;I)V

    .line 868
    .line 869
    .line 870
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 871
    .line 872
    .line 873
    new-instance v1, Ljava/lang/Thread;

    .line 874
    .line 875
    new-instance v11, Lmr;

    .line 876
    .line 877
    move-object/from16 v16, v4

    .line 878
    .line 879
    move-object v13, v14

    .line 880
    move-object v12, v15

    .line 881
    move-object v15, v0

    .line 882
    move-object v14, v3

    .line 883
    invoke-direct/range {v11 .. v16}, Lmr;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfu3;)V

    .line 884
    .line 885
    .line 886
    invoke-direct {v1, v11}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 887
    .line 888
    .line 889
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 890
    .line 891
    .line 892
    goto/16 :goto_7

    .line 893
    .line 894
    :cond_c
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 895
    .line 896
    .line 897
    invoke-static {v6}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    invoke-virtual {v0}, Lpn4;->d()Lxc5;

    .line 902
    .line 903
    .line 904
    move-result-object v0

    .line 905
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 906
    .line 907
    .line 908
    const-string v2, "createInternetRadioStation()"

    .line 909
    .line 910
    invoke-static {v12, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 911
    .line 912
    .line 913
    iget-object v2, v0, Lxc5;->p:Ljava/lang/Object;

    .line 914
    .line 915
    check-cast v2, Lx02;

    .line 916
    .line 917
    iget-object v0, v0, Lxc5;->o:Ljava/lang/Object;

    .line 918
    .line 919
    check-cast v0, Lpn4;

    .line 920
    .line 921
    invoke-virtual {v0}, Lpn4;->f()Ljava/util/HashMap;

    .line 922
    .line 923
    .line 924
    move-result-object v0

    .line 925
    invoke-interface {v2, v0, v14, v15, v3}, Lx02;->d(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    new-instance v2, Lpz1;

    .line 930
    .line 931
    const/16 v3, 0x10

    .line 932
    .line 933
    invoke-direct {v2, v3, v1}, Lpz1;-><init>(ILjava/lang/Object;)V

    .line 934
    .line 935
    .line 936
    invoke-interface {v0, v2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 937
    .line 938
    .line 939
    goto/16 :goto_7

    .line 940
    .line 941
    :cond_d
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    .line 942
    .line 943
    .line 944
    move-result v2

    .line 945
    if-eqz v2, :cond_e

    .line 946
    .line 947
    move-object/from16 v16, v4

    .line 948
    .line 949
    goto :goto_5

    .line 950
    :cond_e
    iget-object v2, v0, Leu3;->G0:Ljava/lang/String;

    .line 951
    .line 952
    move-object/from16 v16, v2

    .line 953
    .line 954
    :goto_5
    iget-object v2, v0, Leu3;->H0:Ljava/lang/String;

    .line 955
    .line 956
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 957
    .line 958
    .line 959
    move-result v2

    .line 960
    if-eqz v2, :cond_f

    .line 961
    .line 962
    move-object v0, v4

    .line 963
    goto :goto_6

    .line 964
    :cond_f
    iget-object v0, v0, Leu3;->H0:Ljava/lang/String;

    .line 965
    .line 966
    :goto_6
    iget-object v2, v1, Lgu3;->d:Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;

    .line 967
    .line 968
    if-eqz v2, :cond_12

    .line 969
    .line 970
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getId()Ljava/lang/String;

    .line 971
    .line 972
    .line 973
    move-result-object v2

    .line 974
    if-nez v2, :cond_10

    .line 975
    .line 976
    goto :goto_7

    .line 977
    :cond_10
    invoke-virtual {v10, v4}, Lad2;->k(Ljava/lang/Object;)V

    .line 978
    .line 979
    .line 980
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 981
    .line 982
    invoke-virtual {v9, v2}, Lad2;->k(Ljava/lang/Object;)V

    .line 983
    .line 984
    .line 985
    iget-boolean v2, v1, Lgu3;->e:Z

    .line 986
    .line 987
    iget-object v4, v1, Lgu3;->d:Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;

    .line 988
    .line 989
    if-eqz v2, :cond_11

    .line 990
    .line 991
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getId()Ljava/lang/String;

    .line 992
    .line 993
    .line 994
    move-result-object v12

    .line 995
    new-instance v2, Lfu3;

    .line 996
    .line 997
    invoke-direct {v2, v1, v8}, Lfu3;-><init>(Lgu3;I)V

    .line 998
    .line 999
    .line 1000
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1001
    .line 1002
    .line 1003
    new-instance v1, Ljava/lang/Thread;

    .line 1004
    .line 1005
    new-instance v11, Lup;

    .line 1006
    .line 1007
    move-object/from16 v17, v2

    .line 1008
    .line 1009
    move-object v13, v15

    .line 1010
    move-object/from16 v15, v16

    .line 1011
    .line 1012
    move-object/from16 v16, v0

    .line 1013
    .line 1014
    invoke-direct/range {v11 .. v17}, Lup;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfu3;)V

    .line 1015
    .line 1016
    .line 1017
    invoke-direct {v1, v11}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 1021
    .line 1022
    .line 1023
    goto :goto_7

    .line 1024
    :cond_11
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getId()Ljava/lang/String;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v13

    .line 1028
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1029
    .line 1030
    .line 1031
    invoke-static {v6}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v0

    .line 1035
    invoke-virtual {v0}, Lpn4;->d()Lxc5;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v0

    .line 1039
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1040
    .line 1041
    .line 1042
    const-string v2, "updateInternetRadioStation()"

    .line 1043
    .line 1044
    invoke-static {v12, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1045
    .line 1046
    .line 1047
    iget-object v2, v0, Lxc5;->p:Ljava/lang/Object;

    .line 1048
    .line 1049
    move-object v11, v2

    .line 1050
    check-cast v11, Lx02;

    .line 1051
    .line 1052
    iget-object v0, v0, Lxc5;->o:Ljava/lang/Object;

    .line 1053
    .line 1054
    check-cast v0, Lpn4;

    .line 1055
    .line 1056
    invoke-virtual {v0}, Lpn4;->f()Ljava/util/HashMap;

    .line 1057
    .line 1058
    .line 1059
    move-result-object v12

    .line 1060
    invoke-interface/range {v11 .. v16}, Lx02;->b(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v0

    .line 1064
    new-instance v2, Lrm2;

    .line 1065
    .line 1066
    invoke-direct {v2, v3, v1}, Lrm2;-><init>(ILjava/lang/Object;)V

    .line 1067
    .line 1068
    .line 1069
    invoke-interface {v0, v2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 1070
    .line 1071
    .line 1072
    :cond_12
    :goto_7
    return-void

    .line 1073
    :pswitch_3
    iget-object v1, v0, Leu3;->J0:Lw12;

    .line 1074
    .line 1075
    iget-object v1, v1, Lw12;->e:Ljava/lang/Object;

    .line 1076
    .line 1077
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 1078
    .line 1079
    invoke-virtual {v1}, Lhg;->getText()Landroid/text/Editable;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v1

    .line 1083
    if-eqz v1, :cond_13

    .line 1084
    .line 1085
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 1086
    .line 1087
    .line 1088
    move-result v1

    .line 1089
    if-lez v1, :cond_13

    .line 1090
    .line 1091
    iget-object v1, v0, Leu3;->J0:Lw12;

    .line 1092
    .line 1093
    iget-object v1, v1, Lw12;->e:Ljava/lang/Object;

    .line 1094
    .line 1095
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 1096
    .line 1097
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1098
    .line 1099
    .line 1100
    iget-object v0, v0, Leu3;->J0:Lw12;

    .line 1101
    .line 1102
    iget-object v0, v0, Lw12;->e:Ljava/lang/Object;

    .line 1103
    .line 1104
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 1105
    .line 1106
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 1107
    .line 1108
    .line 1109
    goto :goto_8

    .line 1110
    :cond_13
    iget-object v1, v0, Leu3;->J0:Lw12;

    .line 1111
    .line 1112
    iget-object v1, v1, Lw12;->g:Ljava/lang/Object;

    .line 1113
    .line 1114
    check-cast v1, Landroid/widget/ListView;

    .line 1115
    .line 1116
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 1117
    .line 1118
    .line 1119
    move-result v1

    .line 1120
    iget-object v2, v0, Leu3;->J0:Lw12;

    .line 1121
    .line 1122
    if-nez v1, :cond_14

    .line 1123
    .line 1124
    if-eqz v2, :cond_15

    .line 1125
    .line 1126
    iget-object v0, v2, Lw12;->g:Ljava/lang/Object;

    .line 1127
    .line 1128
    check-cast v0, Landroid/widget/ListView;

    .line 1129
    .line 1130
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1131
    .line 1132
    .line 1133
    goto :goto_8

    .line 1134
    :cond_14
    iget-object v1, v2, Lw12;->e:Ljava/lang/Object;

    .line 1135
    .line 1136
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 1137
    .line 1138
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 1139
    .line 1140
    .line 1141
    invoke-virtual {v0, v7}, Leu3;->o0(Ljava/lang/String;)V

    .line 1142
    .line 1143
    .line 1144
    :cond_15
    :goto_8
    return-void

    .line 1145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
