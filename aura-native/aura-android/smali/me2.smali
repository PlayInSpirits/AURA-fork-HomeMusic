.class public final synthetic Lme2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Loe2;


# direct methods
.method public synthetic constructor <init>(Loe2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lme2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lme2;->o:Loe2;

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
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lme2;->n:I

    .line 4
    .line 5
    const-string v2, "serverViewModel"

    .line 6
    .line 7
    const/16 v3, 0x8

    .line 8
    .line 9
    const-string v4, ""

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const-string v6, "serverList"

    .line 13
    .line 14
    const/4 v7, 0x0

    .line 15
    iget-object v0, v0, Lme2;->o:Loe2;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lkc1;->X()Lnc1;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1}, Landroid/app/Activity;->finish()V

    .line 25
    .line 26
    .line 27
    new-instance v1, Landroid/content/Intent;

    .line 28
    .line 29
    invoke-virtual {v0}, Lkc1;->X()Lnc1;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-class v3, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 34
    .line 35
    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 36
    .line 37
    .line 38
    const-string v2, "LOGIN_ACTIVITY_INTENT"

    .line 39
    .line 40
    const-string v3, "open_legacy_login_fragment"

    .line 41
    .line 42
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lkc1;->g0(Landroid/content/Intent;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_0
    iget-object v1, v0, Loe2;->l0:Lpc1;

    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    iget-object v1, v1, Lpc1;->g:Landroid/widget/TextView;

    .line 55
    .line 56
    check-cast v1, Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 57
    .line 58
    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    iget-object v2, v0, Loe2;->l0:Lpc1;

    .line 63
    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v1, v2, Lpc1;->f:Landroid/view/View;

    .line 70
    .line 71
    check-cast v1, Lcom/google/android/material/textfield/TextInputLayout;

    .line 72
    .line 73
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 74
    .line 75
    .line 76
    iget-object v1, v0, Loe2;->l0:Lpc1;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-object v1, v1, Lpc1;->e:Landroid/widget/TextView;

    .line 82
    .line 83
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 84
    .line 85
    iget-object v2, v0, Loe2;->n0:Ljava/util/ArrayList;

    .line 86
    .line 87
    if-eqz v2, :cond_1

    .line 88
    .line 89
    iget v0, v0, Loe2;->o0:I

    .line 90
    .line 91
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Lcom/eddyizm/tempus/model/Server;

    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/eddyizm/tempus/model/Server;->getClientCert()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-nez v0, :cond_0

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    move-object v4, v0

    .line 105
    :goto_0
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_1
    invoke-static {v6}, Lh12;->Q(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v5

    .line 113
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    iget-object v1, v2, Lpc1;->f:Landroid/view/View;

    .line 117
    .line 118
    check-cast v1, Lcom/google/android/material/textfield/TextInputLayout;

    .line 119
    .line 120
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 121
    .line 122
    .line 123
    iget-object v0, v0, Loe2;->l0:Lpc1;

    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iget-object v0, v0, Lpc1;->e:Landroid/widget/TextView;

    .line 129
    .line 130
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 131
    .line 132
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 133
    .line 134
    .line 135
    :goto_1
    return-void

    .line 136
    :pswitch_1
    iget-object v1, v0, Loe2;->l0:Lpc1;

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    iget-object v1, v1, Lpc1;->q:Landroid/view/View;

    .line 142
    .line 143
    check-cast v1, Lcom/google/android/material/button/MaterialButton;

    .line 144
    .line 145
    invoke-virtual {v1, v7}, Landroid/view/View;->setEnabled(Z)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Lkc1;->n()Landroid/content/Context;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    const v2, 0x7f130291

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v2}, Lkc1;->s(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-static {v1, v2, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 164
    .line 165
    .line 166
    iget-object v1, v0, Loe2;->n0:Ljava/util/ArrayList;

    .line 167
    .line 168
    if-eqz v1, :cond_4

    .line 169
    .line 170
    iget v2, v0, Loe2;->o0:I

    .line 171
    .line 172
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    check-cast v1, Lcom/eddyizm/tempus/model/Server;

    .line 177
    .line 178
    sget-object v2, Lcom/eddyizm/tempus/App;->n:Lcom/eddyizm/tempus/App;

    .line 179
    .line 180
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getAddress()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getUsername()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getPassword()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->isLowSecurity()Z

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    new-instance v6, Lc12;

    .line 197
    .line 198
    const/16 v7, 0xa

    .line 199
    .line 200
    invoke-direct {v6, v7}, Lc12;-><init>(I)V

    .line 201
    .line 202
    .line 203
    iput-object v2, v6, Lc12;->o:Ljava/lang/Object;

    .line 204
    .line 205
    iput-object v3, v6, Lc12;->p:Ljava/lang/Object;

    .line 206
    .line 207
    invoke-virtual {v6, v4, v5, v1, v5}, Lc12;->j(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 208
    .line 209
    .line 210
    new-instance v1, Lpn4;

    .line 211
    .line 212
    invoke-direct {v1, v6}, Lpn4;-><init>(Lc12;)V

    .line 213
    .line 214
    .line 215
    new-instance v2, Lhg3;

    .line 216
    .line 217
    const/16 v3, 0x1a

    .line 218
    .line 219
    invoke-direct {v2, v3, v0}, Lhg3;-><init>(ILjava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    iget-object v0, v1, Lpn4;->c:Lgp3;

    .line 223
    .line 224
    if-nez v0, :cond_3

    .line 225
    .line 226
    new-instance v0, Lgp3;

    .line 227
    .line 228
    const/16 v3, 0x15

    .line 229
    .line 230
    invoke-direct {v0, v1, v3}, Lgp3;-><init>(Lpn4;I)V

    .line 231
    .line 232
    .line 233
    iput-object v0, v1, Lpn4;->c:Lgp3;

    .line 234
    .line 235
    :cond_3
    iget-object v0, v1, Lpn4;->c:Lgp3;

    .line 236
    .line 237
    invoke-virtual {v0}, Lgp3;->u()Lretrofit2/Call;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    new-instance v1, Lrm2;

    .line 242
    .line 243
    const/16 v3, 0x17

    .line 244
    .line 245
    invoke-direct {v1, v3, v2}, Lrm2;-><init>(ILjava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    invoke-interface {v0, v1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 249
    .line 250
    .line 251
    return-void

    .line 252
    :cond_4
    invoke-static {v6}, Lh12;->Q(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    throw v5

    .line 256
    :pswitch_2
    iget-object v1, v0, Loe2;->l0:Lpc1;

    .line 257
    .line 258
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    iget-object v1, v1, Lpc1;->j:Landroid/view/View;

    .line 262
    .line 263
    check-cast v1, Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 264
    .line 265
    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    iget-object v2, v0, Loe2;->l0:Lpc1;

    .line 270
    .line 271
    if-eqz v1, :cond_7

    .line 272
    .line 273
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    iget-object v1, v2, Lpc1;->i:Landroid/view/View;

    .line 277
    .line 278
    check-cast v1, Lcom/google/android/material/textfield/TextInputLayout;

    .line 279
    .line 280
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 281
    .line 282
    .line 283
    iget-object v1, v0, Loe2;->l0:Lpc1;

    .line 284
    .line 285
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    iget-object v1, v1, Lpc1;->h:Landroid/widget/TextView;

    .line 289
    .line 290
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 291
    .line 292
    iget-object v2, v0, Loe2;->n0:Ljava/util/ArrayList;

    .line 293
    .line 294
    if-eqz v2, :cond_6

    .line 295
    .line 296
    iget v0, v0, Loe2;->o0:I

    .line 297
    .line 298
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    check-cast v0, Lcom/eddyizm/tempus/model/Server;

    .line 303
    .line 304
    invoke-virtual {v0}, Lcom/eddyizm/tempus/model/Server;->getLocalAddress()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    if-nez v0, :cond_5

    .line 309
    .line 310
    goto :goto_2

    .line 311
    :cond_5
    move-object v4, v0

    .line 312
    :goto_2
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 313
    .line 314
    .line 315
    goto :goto_3

    .line 316
    :cond_6
    invoke-static {v6}, Lh12;->Q(Ljava/lang/String;)V

    .line 317
    .line 318
    .line 319
    throw v5

    .line 320
    :cond_7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    iget-object v1, v2, Lpc1;->i:Landroid/view/View;

    .line 324
    .line 325
    check-cast v1, Lcom/google/android/material/textfield/TextInputLayout;

    .line 326
    .line 327
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 328
    .line 329
    .line 330
    iget-object v0, v0, Loe2;->l0:Lpc1;

    .line 331
    .line 332
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    iget-object v0, v0, Lpc1;->h:Landroid/widget/TextView;

    .line 336
    .line 337
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 338
    .line 339
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 340
    .line 341
    .line 342
    :goto_3
    return-void

    .line 343
    :pswitch_3
    const v1, 0x7f130283

    .line 344
    .line 345
    .line 346
    invoke-virtual {v0, v1}, Lkc1;->s(I)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 351
    .line 352
    .line 353
    const v3, 0x7f130288

    .line 354
    .line 355
    .line 356
    invoke-virtual {v0, v3}, Lkc1;->s(I)Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v3

    .line 360
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    iget-object v4, v0, Loe2;->l0:Lpc1;

    .line 364
    .line 365
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    iget-object v4, v4, Lpc1;->k:Landroid/view/View;

    .line 369
    .line 370
    check-cast v4, Lcom/google/android/material/textfield/TextInputEditText;

    .line 371
    .line 372
    invoke-virtual {v4}, Lhg;->getText()Landroid/text/Editable;

    .line 373
    .line 374
    .line 375
    move-result-object v4

    .line 376
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v4

    .line 380
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 381
    .line 382
    .line 383
    move-result v4

    .line 384
    iget-object v8, v0, Loe2;->l0:Lpc1;

    .line 385
    .line 386
    if-nez v4, :cond_8

    .line 387
    .line 388
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    iget-object v0, v8, Lpc1;->k:Landroid/view/View;

    .line 392
    .line 393
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 394
    .line 395
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    .line 396
    .line 397
    .line 398
    goto/16 :goto_6

    .line 399
    .line 400
    :cond_8
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    iget-object v4, v8, Lpc1;->o:Landroid/view/View;

    .line 404
    .line 405
    check-cast v4, Lcom/google/android/material/textfield/TextInputEditText;

    .line 406
    .line 407
    invoke-virtual {v4}, Lhg;->getText()Landroid/text/Editable;

    .line 408
    .line 409
    .line 410
    move-result-object v4

    .line 411
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v4

    .line 415
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 416
    .line 417
    .line 418
    move-result v4

    .line 419
    iget-object v8, v0, Loe2;->l0:Lpc1;

    .line 420
    .line 421
    if-nez v4, :cond_9

    .line 422
    .line 423
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    iget-object v0, v8, Lpc1;->o:Landroid/view/View;

    .line 427
    .line 428
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 429
    .line 430
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    .line 431
    .line 432
    .line 433
    goto/16 :goto_6

    .line 434
    .line 435
    :cond_9
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    iget-object v4, v8, Lpc1;->l:Landroid/widget/TextView;

    .line 439
    .line 440
    check-cast v4, Lcom/google/android/material/textfield/TextInputEditText;

    .line 441
    .line 442
    invoke-virtual {v4}, Lhg;->getText()Landroid/text/Editable;

    .line 443
    .line 444
    .line 445
    move-result-object v4

    .line 446
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 447
    .line 448
    .line 449
    move-result-object v4

    .line 450
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 451
    .line 452
    .line 453
    move-result v4

    .line 454
    iget-object v8, v0, Loe2;->l0:Lpc1;

    .line 455
    .line 456
    if-nez v4, :cond_a

    .line 457
    .line 458
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    iget-object v0, v8, Lpc1;->l:Landroid/widget/TextView;

    .line 462
    .line 463
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 464
    .line 465
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    .line 466
    .line 467
    .line 468
    goto/16 :goto_6

    .line 469
    .line 470
    :cond_a
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    iget-object v4, v8, Lpc1;->n:Landroid/view/View;

    .line 474
    .line 475
    check-cast v4, Lcom/google/android/material/textfield/TextInputEditText;

    .line 476
    .line 477
    invoke-virtual {v4}, Lhg;->getText()Landroid/text/Editable;

    .line 478
    .line 479
    .line 480
    move-result-object v4

    .line 481
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v4

    .line 485
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 486
    .line 487
    .line 488
    move-result v4

    .line 489
    iget-object v8, v0, Loe2;->l0:Lpc1;

    .line 490
    .line 491
    if-nez v4, :cond_b

    .line 492
    .line 493
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    iget-object v0, v8, Lpc1;->n:Landroid/view/View;

    .line 497
    .line 498
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 499
    .line 500
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    .line 501
    .line 502
    .line 503
    goto/16 :goto_6

    .line 504
    .line 505
    :cond_b
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 506
    .line 507
    .line 508
    iget-object v4, v8, Lpc1;->n:Landroid/view/View;

    .line 509
    .line 510
    check-cast v4, Lcom/google/android/material/textfield/TextInputEditText;

    .line 511
    .line 512
    invoke-virtual {v4}, Lhg;->getText()Landroid/text/Editable;

    .line 513
    .line 514
    .line 515
    move-result-object v4

    .line 516
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 517
    .line 518
    .line 519
    move-result-object v4

    .line 520
    invoke-static {v4}, Loe2;->k0(Ljava/lang/String;)Z

    .line 521
    .line 522
    .line 523
    move-result v4

    .line 524
    iget-object v8, v0, Loe2;->l0:Lpc1;

    .line 525
    .line 526
    if-nez v4, :cond_c

    .line 527
    .line 528
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 529
    .line 530
    .line 531
    iget-object v0, v8, Lpc1;->n:Landroid/view/View;

    .line 532
    .line 533
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 534
    .line 535
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    .line 536
    .line 537
    .line 538
    goto/16 :goto_6

    .line 539
    .line 540
    :cond_c
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    iget-object v4, v8, Lpc1;->j:Landroid/view/View;

    .line 544
    .line 545
    check-cast v4, Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 546
    .line 547
    invoke-virtual {v4}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 548
    .line 549
    .line 550
    move-result v4

    .line 551
    if-eqz v4, :cond_d

    .line 552
    .line 553
    iget-object v4, v0, Loe2;->l0:Lpc1;

    .line 554
    .line 555
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 556
    .line 557
    .line 558
    iget-object v4, v4, Lpc1;->h:Landroid/widget/TextView;

    .line 559
    .line 560
    check-cast v4, Lcom/google/android/material/textfield/TextInputEditText;

    .line 561
    .line 562
    invoke-virtual {v4}, Lhg;->getText()Landroid/text/Editable;

    .line 563
    .line 564
    .line 565
    move-result-object v4

    .line 566
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 567
    .line 568
    .line 569
    move-result-object v4

    .line 570
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 571
    .line 572
    .line 573
    move-result v4

    .line 574
    if-nez v4, :cond_d

    .line 575
    .line 576
    iget-object v0, v0, Loe2;->l0:Lpc1;

    .line 577
    .line 578
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 579
    .line 580
    .line 581
    iget-object v0, v0, Lpc1;->h:Landroid/widget/TextView;

    .line 582
    .line 583
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 584
    .line 585
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    .line 586
    .line 587
    .line 588
    goto/16 :goto_6

    .line 589
    .line 590
    :cond_d
    iget-object v1, v0, Loe2;->l0:Lpc1;

    .line 591
    .line 592
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    iget-object v1, v1, Lpc1;->j:Landroid/view/View;

    .line 596
    .line 597
    check-cast v1, Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 598
    .line 599
    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 600
    .line 601
    .line 602
    move-result v1

    .line 603
    if-eqz v1, :cond_e

    .line 604
    .line 605
    iget-object v1, v0, Loe2;->l0:Lpc1;

    .line 606
    .line 607
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 608
    .line 609
    .line 610
    iget-object v1, v1, Lpc1;->h:Landroid/widget/TextView;

    .line 611
    .line 612
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 613
    .line 614
    invoke-virtual {v1}, Lhg;->getText()Landroid/text/Editable;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object v1

    .line 622
    invoke-static {v1}, Loe2;->k0(Ljava/lang/String;)Z

    .line 623
    .line 624
    .line 625
    move-result v1

    .line 626
    if-nez v1, :cond_e

    .line 627
    .line 628
    iget-object v0, v0, Loe2;->l0:Lpc1;

    .line 629
    .line 630
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 631
    .line 632
    .line 633
    iget-object v0, v0, Lpc1;->h:Landroid/widget/TextView;

    .line 634
    .line 635
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 636
    .line 637
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    .line 638
    .line 639
    .line 640
    goto/16 :goto_6

    .line 641
    .line 642
    :cond_e
    iget v1, v0, Loe2;->o0:I

    .line 643
    .line 644
    iget-object v3, v0, Loe2;->n0:Ljava/util/ArrayList;

    .line 645
    .line 646
    const/4 v4, 0x1

    .line 647
    if-nez v1, :cond_10

    .line 648
    .line 649
    if-eqz v3, :cond_f

    .line 650
    .line 651
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 652
    .line 653
    .line 654
    move-result v1

    .line 655
    add-int/2addr v1, v4

    .line 656
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v1

    .line 660
    :goto_4
    move-object v9, v1

    .line 661
    goto :goto_5

    .line 662
    :cond_f
    invoke-static {v6}, Lh12;->Q(Ljava/lang/String;)V

    .line 663
    .line 664
    .line 665
    throw v5

    .line 666
    :cond_10
    if-eqz v3, :cond_14

    .line 667
    .line 668
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v1

    .line 672
    check-cast v1, Lcom/eddyizm/tempus/model/Server;

    .line 673
    .line 674
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getServerId()Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    move-result-object v1

    .line 678
    goto :goto_4

    .line 679
    :goto_5
    new-instance v8, Lcom/eddyizm/tempus/model/Server;

    .line 680
    .line 681
    iget-object v1, v0, Loe2;->l0:Lpc1;

    .line 682
    .line 683
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 684
    .line 685
    .line 686
    iget-object v1, v1, Lpc1;->k:Landroid/view/View;

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
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 695
    .line 696
    .line 697
    move-result-object v10

    .line 698
    iget-object v1, v0, Loe2;->l0:Lpc1;

    .line 699
    .line 700
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 701
    .line 702
    .line 703
    iget-object v1, v1, Lpc1;->o:Landroid/view/View;

    .line 704
    .line 705
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 706
    .line 707
    invoke-virtual {v1}, Lhg;->getText()Landroid/text/Editable;

    .line 708
    .line 709
    .line 710
    move-result-object v1

    .line 711
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 712
    .line 713
    .line 714
    move-result-object v11

    .line 715
    iget-object v1, v0, Loe2;->l0:Lpc1;

    .line 716
    .line 717
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 718
    .line 719
    .line 720
    iget-object v1, v1, Lpc1;->l:Landroid/widget/TextView;

    .line 721
    .line 722
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 723
    .line 724
    invoke-virtual {v1}, Lhg;->getText()Landroid/text/Editable;

    .line 725
    .line 726
    .line 727
    move-result-object v1

    .line 728
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 729
    .line 730
    .line 731
    move-result-object v12

    .line 732
    iget-object v1, v0, Loe2;->l0:Lpc1;

    .line 733
    .line 734
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 735
    .line 736
    .line 737
    iget-object v1, v1, Lpc1;->n:Landroid/view/View;

    .line 738
    .line 739
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 740
    .line 741
    invoke-virtual {v1}, Lhg;->getText()Landroid/text/Editable;

    .line 742
    .line 743
    .line 744
    move-result-object v1

    .line 745
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 746
    .line 747
    .line 748
    move-result-object v13

    .line 749
    iget-object v1, v0, Loe2;->l0:Lpc1;

    .line 750
    .line 751
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 752
    .line 753
    .line 754
    iget-object v1, v1, Lpc1;->h:Landroid/widget/TextView;

    .line 755
    .line 756
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 757
    .line 758
    invoke-virtual {v1}, Lhg;->getText()Landroid/text/Editable;

    .line 759
    .line 760
    .line 761
    move-result-object v1

    .line 762
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object v14

    .line 766
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 767
    .line 768
    .line 769
    move-result-wide v15

    .line 770
    iget-object v1, v0, Loe2;->l0:Lpc1;

    .line 771
    .line 772
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 773
    .line 774
    .line 775
    iget-object v1, v1, Lpc1;->m:Landroid/widget/Button;

    .line 776
    .line 777
    check-cast v1, Lcom/google/android/material/materialswitch/MaterialSwitch;

    .line 778
    .line 779
    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 780
    .line 781
    .line 782
    move-result v17

    .line 783
    iget-object v1, v0, Loe2;->l0:Lpc1;

    .line 784
    .line 785
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 786
    .line 787
    .line 788
    iget-object v1, v1, Lpc1;->e:Landroid/widget/TextView;

    .line 789
    .line 790
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 791
    .line 792
    invoke-virtual {v1}, Lhg;->getText()Landroid/text/Editable;

    .line 793
    .line 794
    .line 795
    move-result-object v1

    .line 796
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 797
    .line 798
    .line 799
    move-result-object v18

    .line 800
    invoke-direct/range {v8 .. v18}, Lcom/eddyizm/tempus/model/Server;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;)V

    .line 801
    .line 802
    .line 803
    iget v1, v0, Loe2;->o0:I

    .line 804
    .line 805
    iget-object v3, v0, Loe2;->m0:Lta4;

    .line 806
    .line 807
    if-nez v1, :cond_12

    .line 808
    .line 809
    if-eqz v3, :cond_11

    .line 810
    .line 811
    iget-object v1, v3, Lta4;->c:Lpz1;

    .line 812
    .line 813
    new-instance v2, Loa4;

    .line 814
    .line 815
    iget-object v1, v1, Lpz1;->o:Ljava/lang/Object;

    .line 816
    .line 817
    check-cast v1, Lna4;

    .line 818
    .line 819
    invoke-direct {v2, v1, v8, v4}, Loa4;-><init>(Lna4;Lcom/eddyizm/tempus/model/Server;I)V

    .line 820
    .line 821
    .line 822
    new-instance v1, Ljava/lang/Thread;

    .line 823
    .line 824
    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 828
    .line 829
    .line 830
    invoke-virtual {v0}, Lkc1;->n()Landroid/content/Context;

    .line 831
    .line 832
    .line 833
    move-result-object v1

    .line 834
    const v2, 0x7f130292

    .line 835
    .line 836
    .line 837
    invoke-virtual {v0, v2}, Lkc1;->s(I)Ljava/lang/String;

    .line 838
    .line 839
    .line 840
    move-result-object v2

    .line 841
    invoke-static {v1, v2, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 842
    .line 843
    .line 844
    move-result-object v1

    .line 845
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 846
    .line 847
    .line 848
    invoke-virtual {v0}, Loe2;->j0()V

    .line 849
    .line 850
    .line 851
    goto :goto_6

    .line 852
    :cond_11
    invoke-static {v2}, Lh12;->Q(Ljava/lang/String;)V

    .line 853
    .line 854
    .line 855
    throw v5

    .line 856
    :cond_12
    if-eqz v3, :cond_13

    .line 857
    .line 858
    iget-object v1, v3, Lta4;->c:Lpz1;

    .line 859
    .line 860
    new-instance v2, Loa4;

    .line 861
    .line 862
    iget-object v1, v1, Lpz1;->o:Ljava/lang/Object;

    .line 863
    .line 864
    check-cast v1, Lna4;

    .line 865
    .line 866
    const/4 v3, 0x2

    .line 867
    invoke-direct {v2, v1, v8, v3}, Loa4;-><init>(Lna4;Lcom/eddyizm/tempus/model/Server;I)V

    .line 868
    .line 869
    .line 870
    new-instance v1, Ljava/lang/Thread;

    .line 871
    .line 872
    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 873
    .line 874
    .line 875
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 876
    .line 877
    .line 878
    invoke-virtual {v0}, Lkc1;->n()Landroid/content/Context;

    .line 879
    .line 880
    .line 881
    move-result-object v1

    .line 882
    const v2, 0x7f130294

    .line 883
    .line 884
    .line 885
    invoke-virtual {v0, v2}, Lkc1;->s(I)Ljava/lang/String;

    .line 886
    .line 887
    .line 888
    move-result-object v2

    .line 889
    invoke-static {v1, v2, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 890
    .line 891
    .line 892
    move-result-object v1

    .line 893
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 894
    .line 895
    .line 896
    invoke-virtual {v0}, Loe2;->j0()V

    .line 897
    .line 898
    .line 899
    :goto_6
    return-void

    .line 900
    :cond_13
    invoke-static {v2}, Lh12;->Q(Ljava/lang/String;)V

    .line 901
    .line 902
    .line 903
    throw v5

    .line 904
    :cond_14
    invoke-static {v6}, Lh12;->Q(Ljava/lang/String;)V

    .line 905
    .line 906
    .line 907
    throw v5

    .line 908
    :pswitch_4
    iget-object v1, v0, Loe2;->m0:Lta4;

    .line 909
    .line 910
    if-eqz v1, :cond_16

    .line 911
    .line 912
    iget-object v2, v0, Loe2;->n0:Ljava/util/ArrayList;

    .line 913
    .line 914
    if-eqz v2, :cond_15

    .line 915
    .line 916
    iget v3, v0, Loe2;->o0:I

    .line 917
    .line 918
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 919
    .line 920
    .line 921
    move-result-object v2

    .line 922
    check-cast v2, Lcom/eddyizm/tempus/model/Server;

    .line 923
    .line 924
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 925
    .line 926
    .line 927
    iget-object v1, v1, Lta4;->c:Lpz1;

    .line 928
    .line 929
    new-instance v3, Loa4;

    .line 930
    .line 931
    iget-object v1, v1, Lpz1;->o:Ljava/lang/Object;

    .line 932
    .line 933
    check-cast v1, Lna4;

    .line 934
    .line 935
    invoke-direct {v3, v1, v2, v7}, Loa4;-><init>(Lna4;Lcom/eddyizm/tempus/model/Server;I)V

    .line 936
    .line 937
    .line 938
    new-instance v1, Ljava/lang/Thread;

    .line 939
    .line 940
    invoke-direct {v1, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 941
    .line 942
    .line 943
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 944
    .line 945
    .line 946
    invoke-virtual {v0}, Loe2;->j0()V

    .line 947
    .line 948
    .line 949
    invoke-virtual {v0}, Lkc1;->n()Landroid/content/Context;

    .line 950
    .line 951
    .line 952
    move-result-object v1

    .line 953
    const v2, 0x7f130293

    .line 954
    .line 955
    .line 956
    invoke-virtual {v0, v2}, Lkc1;->s(I)Ljava/lang/String;

    .line 957
    .line 958
    .line 959
    move-result-object v0

    .line 960
    invoke-static {v1, v0, v7}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 961
    .line 962
    .line 963
    move-result-object v0

    .line 964
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 965
    .line 966
    .line 967
    return-void

    .line 968
    :cond_15
    invoke-static {v6}, Lh12;->Q(Ljava/lang/String;)V

    .line 969
    .line 970
    .line 971
    throw v5

    .line 972
    :cond_16
    invoke-static {v2}, Lh12;->Q(Ljava/lang/String;)V

    .line 973
    .line 974
    .line 975
    throw v5

    .line 976
    nop

    .line 977
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
