.class public final Lre2;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public l0:Lzc1;


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
    iget-object p0, p0, Lkc1;->s:Landroid/os/Bundle;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-string p1, "single_page_mode"

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const p3, 0x7f0d007d

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
    const p2, 0x7f0a013e

    .line 13
    .line 14
    .line 15
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    check-cast p3, Lcom/google/android/material/card/MaterialCardView;

    .line 20
    .line 21
    if-eqz p3, :cond_3

    .line 22
    .line 23
    const p2, 0x7f0a013f

    .line 24
    .line 25
    .line 26
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Lcom/google/android/material/card/MaterialCardView;

    .line 31
    .line 32
    if-eqz v1, :cond_3

    .line 33
    .line 34
    const p2, 0x7f0a0140

    .line 35
    .line 36
    .line 37
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Lcom/google/android/material/card/MaterialCardView;

    .line 42
    .line 43
    if-eqz v2, :cond_3

    .line 44
    .line 45
    const p2, 0x7f0a0141

    .line 46
    .line 47
    .line 48
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Lcom/google/android/material/card/MaterialCardView;

    .line 53
    .line 54
    if-eqz v3, :cond_3

    .line 55
    .line 56
    const p2, 0x7f0a0142

    .line 57
    .line 58
    .line 59
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Lcom/google/android/material/card/MaterialCardView;

    .line 64
    .line 65
    if-eqz v4, :cond_3

    .line 66
    .line 67
    const p2, 0x7f0a0143

    .line 68
    .line 69
    .line 70
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    check-cast v5, Lcom/google/android/material/card/MaterialCardView;

    .line 75
    .line 76
    if-eqz v5, :cond_3

    .line 77
    .line 78
    const p2, 0x7f0a0144

    .line 79
    .line 80
    .line 81
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    check-cast v6, Lcom/google/android/material/card/MaterialCardView;

    .line 86
    .line 87
    if-eqz v6, :cond_3

    .line 88
    .line 89
    const p2, 0x7f0a0145

    .line 90
    .line 91
    .line 92
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    check-cast v7, Lcom/google/android/material/card/MaterialCardView;

    .line 97
    .line 98
    if-eqz v7, :cond_3

    .line 99
    .line 100
    const p2, 0x7f0a0152

    .line 101
    .line 102
    .line 103
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    check-cast v8, Landroid/widget/LinearLayout;

    .line 108
    .line 109
    if-eqz v8, :cond_3

    .line 110
    .line 111
    const p2, 0x7f0a0153

    .line 112
    .line 113
    .line 114
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    check-cast v8, Landroid/widget/TextView;

    .line 119
    .line 120
    if-eqz v8, :cond_3

    .line 121
    .line 122
    const p2, 0x7f0a019b

    .line 123
    .line 124
    .line 125
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    check-cast v8, Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 130
    .line 131
    if-eqz v8, :cond_3

    .line 132
    .line 133
    move-object p2, p1

    .line 134
    check-cast p2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 135
    .line 136
    const v9, 0x7f0a034f

    .line 137
    .line 138
    .line 139
    invoke-static {p1, v9}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 140
    .line 141
    .line 142
    move-result-object v10

    .line 143
    check-cast v10, Landroid/widget/LinearLayout;

    .line 144
    .line 145
    if-eqz v10, :cond_2

    .line 146
    .line 147
    const v9, 0x7f0a060a

    .line 148
    .line 149
    .line 150
    invoke-static {p1, v9}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 151
    .line 152
    .line 153
    move-result-object v10

    .line 154
    check-cast v10, Landroid/widget/AutoCompleteTextView;

    .line 155
    .line 156
    if-eqz v10, :cond_2

    .line 157
    .line 158
    const v9, 0x7f0a060b

    .line 159
    .line 160
    .line 161
    invoke-static {p1, v9}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    check-cast v11, Lcom/google/android/material/textfield/TextInputLayout;

    .line 166
    .line 167
    if-eqz v11, :cond_2

    .line 168
    .line 169
    const v9, 0x7f0a063d

    .line 170
    .line 171
    .line 172
    invoke-static {p1, v9}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 173
    .line 174
    .line 175
    move-result-object v11

    .line 176
    check-cast v11, Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 177
    .line 178
    if-eqz v11, :cond_2

    .line 179
    .line 180
    new-instance p1, Lzc1;

    .line 181
    .line 182
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 183
    .line 184
    .line 185
    iput-object p2, p1, Lzc1;->a:Ljava/lang/Object;

    .line 186
    .line 187
    iput-object p3, p1, Lzc1;->b:Ljava/lang/Object;

    .line 188
    .line 189
    iput-object v1, p1, Lzc1;->c:Ljava/lang/Object;

    .line 190
    .line 191
    iput-object v2, p1, Lzc1;->d:Ljava/lang/Object;

    .line 192
    .line 193
    iput-object v3, p1, Lzc1;->e:Ljava/lang/Object;

    .line 194
    .line 195
    iput-object v4, p1, Lzc1;->f:Ljava/lang/Object;

    .line 196
    .line 197
    iput-object v5, p1, Lzc1;->g:Ljava/lang/Object;

    .line 198
    .line 199
    iput-object v6, p1, Lzc1;->h:Ljava/lang/Object;

    .line 200
    .line 201
    iput-object v7, p1, Lzc1;->i:Ljava/lang/Object;

    .line 202
    .line 203
    iput-object v8, p1, Lzc1;->j:Ljava/lang/Object;

    .line 204
    .line 205
    iput-object v10, p1, Lzc1;->l:Ljava/lang/Object;

    .line 206
    .line 207
    iput-object v11, p1, Lzc1;->k:Ljava/lang/Object;

    .line 208
    .line 209
    iput-object p1, p0, Lre2;->l0:Lzc1;

    .line 210
    .line 211
    const-string p1, "dark_theme_black"

    .line 212
    .line 213
    invoke-static {p1, v0}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    const/4 p2, 0x1

    .line 218
    if-eqz p1, :cond_0

    .line 219
    .line 220
    iget-object p1, p0, Lre2;->l0:Lzc1;

    .line 221
    .line 222
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    iget-object p1, p1, Lzc1;->k:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast p1, Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 228
    .line 229
    invoke-virtual {p1, p2}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 230
    .line 231
    .line 232
    :cond_0
    iget-object p1, p0, Lre2;->l0:Lzc1;

    .line 233
    .line 234
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    iget-object p1, p1, Lzc1;->k:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast p1, Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 240
    .line 241
    new-instance p3, Lpe2;

    .line 242
    .line 243
    invoke-direct {p3, p0, v0}, Lpe2;-><init>(Lre2;I)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 247
    .line 248
    .line 249
    iget-object p1, p0, Lre2;->l0:Lzc1;

    .line 250
    .line 251
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    iget-object p1, p1, Lzc1;->j:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast p1, Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 257
    .line 258
    invoke-static {}, Lud3;->S()Z

    .line 259
    .line 260
    .line 261
    move-result p3

    .line 262
    invoke-virtual {p1, p3}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 263
    .line 264
    .line 265
    iget-object p1, p0, Lre2;->l0:Lzc1;

    .line 266
    .line 267
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    iget-object p1, p1, Lzc1;->j:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast p1, Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 273
    .line 274
    new-instance p3, Lpe2;

    .line 275
    .line 276
    const/4 v1, 0x5

    .line 277
    invoke-direct {p3, p0, v1}, Lpe2;-><init>(Lre2;I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p0}, Lkc1;->r()Landroid/content/res/Resources;

    .line 284
    .line 285
    .line 286
    move-result-object p1

    .line 287
    const p3, 0x7f030033

    .line 288
    .line 289
    .line 290
    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    invoke-static {p1}, Lti;->r0([Ljava/lang/Object;)Ljava/util/List;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    invoke-virtual {p0}, Lkc1;->r()Landroid/content/res/Resources;

    .line 302
    .line 303
    .line 304
    move-result-object p3

    .line 305
    const v1, 0x7f030034

    .line 306
    .line 307
    .line 308
    invoke-virtual {p3, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object p3

    .line 312
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    new-instance v1, Landroid/widget/ArrayAdapter;

    .line 316
    .line 317
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    const v3, 0x109000a

    .line 322
    .line 323
    .line 324
    invoke-direct {v1, v2, v3, p1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 325
    .line 326
    .line 327
    iget-object v2, p0, Lre2;->l0:Lzc1;

    .line 328
    .line 329
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    iget-object v2, v2, Lzc1;->l:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast v2, Landroid/widget/AutoCompleteTextView;

    .line 335
    .line 336
    invoke-virtual {v2, v1}, Landroid/widget/AutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2, v0}, Landroid/widget/AutoCompleteTextView;->setThreshold(I)V

    .line 340
    .line 341
    .line 342
    new-instance v3, Lfa;

    .line 343
    .line 344
    const/16 v4, 0xd

    .line 345
    .line 346
    invoke-direct {v3, v4, v1, v2}, Lfa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 347
    .line 348
    .line 349
    new-instance v1, Lp6;

    .line 350
    .line 351
    const/16 v4, 0x19

    .line 352
    .line 353
    invoke-direct {v1, v4, v3}, Lp6;-><init>(ILjava/lang/Object;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v2, v1}, Landroid/widget/AutoCompleteTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 357
    .line 358
    .line 359
    new-instance v1, Lp30;

    .line 360
    .line 361
    const/4 v4, 0x3

    .line 362
    invoke-direct {v1, v4, v3}, Lp30;-><init>(ILjava/lang/Object;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v2, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 366
    .line 367
    .line 368
    invoke-static {}, Lud3;->H()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    invoke-static {p3, v1}, Lti;->m0([Ljava/lang/Object;Ljava/lang/Object;)I

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    const/4 v3, -0x1

    .line 377
    if-eq v1, v3, :cond_1

    .line 378
    .line 379
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 380
    .line 381
    .line 382
    move-result v3

    .line 383
    if-ge v1, v3, :cond_1

    .line 384
    .line 385
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    check-cast p1, Ljava/lang/String;

    .line 390
    .line 391
    goto :goto_0

    .line 392
    :cond_1
    invoke-static {}, Lud3;->H()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object p1

    .line 396
    :goto_0
    invoke-virtual {v2, p1, v0}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;Z)V

    .line 397
    .line 398
    .line 399
    new-instance p1, Lqe2;

    .line 400
    .line 401
    invoke-direct {p1, p3, p0}, Lqe2;-><init>([Ljava/lang/String;Lre2;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v2, p1}, Landroid/widget/AutoCompleteTextView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 405
    .line 406
    .line 407
    iget-object p1, p0, Lre2;->l0:Lzc1;

    .line 408
    .line 409
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    iget-object p1, p1, Lzc1;->f:Ljava/lang/Object;

    .line 413
    .line 414
    check-cast p1, Lcom/google/android/material/card/MaterialCardView;

    .line 415
    .line 416
    new-instance p3, Lpe2;

    .line 417
    .line 418
    const/4 v0, 0x6

    .line 419
    invoke-direct {p3, p0, v0}, Lpe2;-><init>(Lre2;I)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 423
    .line 424
    .line 425
    iget-object p1, p0, Lre2;->l0:Lzc1;

    .line 426
    .line 427
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 428
    .line 429
    .line 430
    iget-object p1, p1, Lzc1;->d:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast p1, Lcom/google/android/material/card/MaterialCardView;

    .line 433
    .line 434
    new-instance p3, Lpe2;

    .line 435
    .line 436
    const/4 v0, 0x7

    .line 437
    invoke-direct {p3, p0, v0}, Lpe2;-><init>(Lre2;I)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 441
    .line 442
    .line 443
    iget-object p1, p0, Lre2;->l0:Lzc1;

    .line 444
    .line 445
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    iget-object p1, p1, Lzc1;->e:Ljava/lang/Object;

    .line 449
    .line 450
    check-cast p1, Lcom/google/android/material/card/MaterialCardView;

    .line 451
    .line 452
    new-instance p3, Lpe2;

    .line 453
    .line 454
    const/16 v0, 0x8

    .line 455
    .line 456
    invoke-direct {p3, p0, v0}, Lpe2;-><init>(Lre2;I)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 460
    .line 461
    .line 462
    iget-object p1, p0, Lre2;->l0:Lzc1;

    .line 463
    .line 464
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    iget-object p1, p1, Lzc1;->e:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast p1, Lcom/google/android/material/card/MaterialCardView;

    .line 470
    .line 471
    new-instance p3, Lpe2;

    .line 472
    .line 473
    const/16 v0, 0x9

    .line 474
    .line 475
    invoke-direct {p3, p0, v0}, Lpe2;-><init>(Lre2;I)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 479
    .line 480
    .line 481
    iget-object p1, p0, Lre2;->l0:Lzc1;

    .line 482
    .line 483
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 484
    .line 485
    .line 486
    iget-object p1, p1, Lzc1;->c:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast p1, Lcom/google/android/material/card/MaterialCardView;

    .line 489
    .line 490
    new-instance p3, Lpe2;

    .line 491
    .line 492
    const/16 v0, 0xa

    .line 493
    .line 494
    invoke-direct {p3, p0, v0}, Lpe2;-><init>(Lre2;I)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 498
    .line 499
    .line 500
    iget-object p1, p0, Lre2;->l0:Lzc1;

    .line 501
    .line 502
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    iget-object p1, p1, Lzc1;->g:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast p1, Lcom/google/android/material/card/MaterialCardView;

    .line 508
    .line 509
    new-instance p3, Lpe2;

    .line 510
    .line 511
    invoke-direct {p3, p0, p2}, Lpe2;-><init>(Lre2;I)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {p1, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 515
    .line 516
    .line 517
    iget-object p1, p0, Lre2;->l0:Lzc1;

    .line 518
    .line 519
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    iget-object p1, p1, Lzc1;->b:Ljava/lang/Object;

    .line 523
    .line 524
    check-cast p1, Lcom/google/android/material/card/MaterialCardView;

    .line 525
    .line 526
    new-instance p2, Lpe2;

    .line 527
    .line 528
    const/4 p3, 0x2

    .line 529
    invoke-direct {p2, p0, p3}, Lpe2;-><init>(Lre2;I)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 533
    .line 534
    .line 535
    iget-object p1, p0, Lre2;->l0:Lzc1;

    .line 536
    .line 537
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 538
    .line 539
    .line 540
    iget-object p1, p1, Lzc1;->i:Ljava/lang/Object;

    .line 541
    .line 542
    check-cast p1, Lcom/google/android/material/card/MaterialCardView;

    .line 543
    .line 544
    new-instance p2, Lpe2;

    .line 545
    .line 546
    invoke-direct {p2, p0, v4}, Lpe2;-><init>(Lre2;I)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 550
    .line 551
    .line 552
    iget-object p1, p0, Lre2;->l0:Lzc1;

    .line 553
    .line 554
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 555
    .line 556
    .line 557
    iget-object p1, p1, Lzc1;->h:Ljava/lang/Object;

    .line 558
    .line 559
    check-cast p1, Lcom/google/android/material/card/MaterialCardView;

    .line 560
    .line 561
    new-instance p2, Lpe2;

    .line 562
    .line 563
    const/4 p3, 0x4

    .line 564
    invoke-direct {p2, p0, p3}, Lpe2;-><init>(Lre2;I)V

    .line 565
    .line 566
    .line 567
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 568
    .line 569
    .line 570
    iget-object p0, p0, Lre2;->l0:Lzc1;

    .line 571
    .line 572
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    iget-object p0, p0, Lzc1;->a:Ljava/lang/Object;

    .line 576
    .line 577
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 578
    .line 579
    return-object p0

    .line 580
    :cond_2
    move p2, v9

    .line 581
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 582
    .line 583
    .line 584
    move-result-object p0

    .line 585
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object p0

    .line 589
    const-string p1, "Missing required view with ID: "

    .line 590
    .line 591
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 592
    .line 593
    .line 594
    move-result-object p0

    .line 595
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 596
    .line 597
    .line 598
    const/4 p0, 0x0

    .line 599
    return-object p0
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
    iput-object v0, p0, Lre2;->l0:Lzc1;

    .line 6
    .line 7
    return-void
.end method

.method public final T(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lud3;->m()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const-string p2, "DYNAMIC"

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    if-nez p2, :cond_2

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-nez p2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const-string p2, "HEX:"

    .line 24
    .line 25
    invoke-static {p1, p2}, Lqm4;->z0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const/4 p2, 0x0

    .line 30
    const-string v0, "#"

    .line 31
    .line 32
    invoke-static {p1, v0, p2}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-eqz p2, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    goto :goto_1

    .line 52
    :cond_2
    :goto_0
    const-string p1, "#B5076B"

    .line 53
    .line 54
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    :goto_1
    iget-object p0, p0, Lre2;->l0:Lzc1;

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object p0, p0, Lzc1;->f:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p0, Lcom/google/android/material/card/MaterialCardView;

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Lcom/google/android/material/card/MaterialCardView;->setCardBackgroundColor(I)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final h0(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "color_accent"

    .line 17
    .line 18
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    check-cast p1, Ldf;

    .line 33
    .line 34
    invoke-static {p1}, Ljz4;->r(Ldf;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    if-eqz p0, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/app/Activity;->recreate()V

    .line 44
    .line 45
    .line 46
    :cond_0
    return-void
.end method
