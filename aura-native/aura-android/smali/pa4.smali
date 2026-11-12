.class public final synthetic Lpa4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lra4;


# direct methods
.method public synthetic constructor <init>(Lra4;I)V
    .locals 0

    .line 1
    iput p2, p0, Lpa4;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lpa4;->o:Lra4;

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
    .locals 11

    .line 1
    iget p1, p0, Lpa4;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object p0, p0, Lpa4;->o:Lra4;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const p1, 0x7f130458

    .line 15
    .line 16
    .line 17
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_0
    iget-object p1, p0, Lra4;->B0:Ley;

    .line 26
    .line 27
    iget-object p1, p1, Ley;->f:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 30
    .line 31
    invoke-virtual {p1}, Lhg;->getText()Landroid/text/Editable;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lra4;->D0:Ljava/lang/String;

    .line 47
    .line 48
    iget-object p1, p0, Lra4;->B0:Ley;

    .line 49
    .line 50
    iget-object p1, p1, Ley;->h:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 53
    .line 54
    invoke-virtual {p1}, Lhg;->getText()Landroid/text/Editable;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, Lra4;->E0:Ljava/lang/String;

    .line 70
    .line 71
    iget-object p1, p0, Lra4;->B0:Ley;

    .line 72
    .line 73
    iget-object p1, p1, Ley;->d:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, Landroid/widget/CheckBox;

    .line 76
    .line 77
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    iget-object v2, p0, Lra4;->B0:Ley;

    .line 82
    .line 83
    if-eqz p1, :cond_0

    .line 84
    .line 85
    iget-object p1, v2, Ley;->e:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 88
    .line 89
    invoke-virtual {p1}, Lhg;->getText()Landroid/text/Editable;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    sget-object v2, Le03;->a:Ljava/util/regex/Pattern;

    .line 101
    .line 102
    new-instance v2, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    const-string v3, "enc:"

    .line 105
    .line 106
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/String;->chars()Ljava/util/stream/IntStream;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    new-instance v3, Lc03;

    .line 114
    .line 115
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-interface {p1, v3}, Ljava/util/stream/IntStream;->mapToObj(Ljava/util/function/IntFunction;)Ljava/util/stream/Stream;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-static {}, Ljava/util/stream/Collectors;->joining()Ljava/util/stream/Collector;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-interface {p1, v3}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    check-cast p1, Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    goto :goto_0

    .line 140
    :cond_0
    iget-object p1, v2, Ley;->e:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 143
    .line 144
    invoke-virtual {p1}, Lhg;->getText()Landroid/text/Editable;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    :goto_0
    iput-object p1, p0, Lra4;->F0:Ljava/lang/String;

    .line 156
    .line 157
    iget-object p1, p0, Lra4;->B0:Ley;

    .line 158
    .line 159
    iget-object p1, p1, Ley;->g:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 162
    .line 163
    invoke-virtual {p1}, Lhg;->getText()Landroid/text/Editable;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    if-eqz p1, :cond_2

    .line 168
    .line 169
    iget-object p1, p0, Lra4;->B0:Ley;

    .line 170
    .line 171
    iget-object p1, p1, Ley;->g:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 174
    .line 175
    invoke-virtual {p1}, Lhg;->getText()Landroid/text/Editable;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    move v3, v1

    .line 192
    :goto_1
    if-ge v3, v2, :cond_2

    .line 193
    .line 194
    invoke-virtual {p1, v3}, Ljava/lang/String;->codePointAt(I)I

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    invoke-static {v4}, Ljava/lang/Character;->isWhitespace(I)Z

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    if-nez v5, :cond_1

    .line 203
    .line 204
    iget-object p1, p0, Lra4;->B0:Ley;

    .line 205
    .line 206
    iget-object p1, p1, Ley;->g:Ljava/lang/Object;

    .line 207
    .line 208
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 209
    .line 210
    invoke-virtual {p1}, Lhg;->getText()Landroid/text/Editable;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p1

    .line 222
    goto :goto_2

    .line 223
    :cond_1
    invoke-static {v4}, Ljava/lang/Character;->charCount(I)I

    .line 224
    .line 225
    .line 226
    move-result v4

    .line 227
    add-int/2addr v3, v4

    .line 228
    goto :goto_1

    .line 229
    :cond_2
    move-object p1, v0

    .line 230
    :goto_2
    iput-object p1, p0, Lra4;->G0:Ljava/lang/String;

    .line 231
    .line 232
    iget-object p1, p0, Lra4;->B0:Ley;

    .line 233
    .line 234
    iget-object p1, p1, Ley;->c:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 237
    .line 238
    invoke-virtual {p1}, Lhg;->getText()Landroid/text/Editable;

    .line 239
    .line 240
    .line 241
    move-result-object p1

    .line 242
    if-eqz p1, :cond_4

    .line 243
    .line 244
    iget-object p1, p0, Lra4;->B0:Ley;

    .line 245
    .line 246
    iget-object p1, p1, Ley;->c:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 249
    .line 250
    invoke-virtual {p1}, Lhg;->getText()Landroid/text/Editable;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object p1

    .line 258
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p1

    .line 262
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    move v3, v1

    .line 267
    :goto_3
    if-ge v3, v2, :cond_4

    .line 268
    .line 269
    invoke-virtual {p1, v3}, Ljava/lang/String;->codePointAt(I)I

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    invoke-static {v4}, Ljava/lang/Character;->isWhitespace(I)Z

    .line 274
    .line 275
    .line 276
    move-result v5

    .line 277
    if-nez v5, :cond_3

    .line 278
    .line 279
    iget-object p1, p0, Lra4;->B0:Ley;

    .line 280
    .line 281
    iget-object p1, p1, Ley;->c:Ljava/lang/Object;

    .line 282
    .line 283
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 284
    .line 285
    invoke-virtual {p1}, Lhg;->getText()Landroid/text/Editable;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    goto :goto_4

    .line 298
    :cond_3
    invoke-static {v4}, Ljava/lang/Character;->charCount(I)I

    .line 299
    .line 300
    .line 301
    move-result v4

    .line 302
    add-int/2addr v3, v4

    .line 303
    goto :goto_3

    .line 304
    :cond_4
    move-object p1, v0

    .line 305
    :goto_4
    iput-object p1, p0, Lra4;->H0:Ljava/lang/String;

    .line 306
    .line 307
    iget-object p1, p0, Lra4;->B0:Ley;

    .line 308
    .line 309
    iget-object p1, p1, Ley;->d:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast p1, Landroid/widget/CheckBox;

    .line 312
    .line 313
    invoke-virtual {p1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 314
    .line 315
    .line 316
    move-result p1

    .line 317
    iput-boolean p1, p0, Lra4;->I0:Z

    .line 318
    .line 319
    iget-object p1, p0, Lra4;->B0:Ley;

    .line 320
    .line 321
    iget-object p1, p1, Ley;->b:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 324
    .line 325
    invoke-virtual {p1}, Lhg;->getText()Landroid/text/Editable;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    if-eqz p1, :cond_6

    .line 330
    .line 331
    iget-object p1, p0, Lra4;->B0:Ley;

    .line 332
    .line 333
    iget-object p1, p1, Ley;->b:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 336
    .line 337
    invoke-virtual {p1}, Lhg;->getText()Landroid/text/Editable;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object p1

    .line 345
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 350
    .line 351
    .line 352
    move-result v2

    .line 353
    :goto_5
    if-ge v1, v2, :cond_6

    .line 354
    .line 355
    invoke-virtual {p1, v1}, Ljava/lang/String;->codePointAt(I)I

    .line 356
    .line 357
    .line 358
    move-result v3

    .line 359
    invoke-static {v3}, Ljava/lang/Character;->isWhitespace(I)Z

    .line 360
    .line 361
    .line 362
    move-result v4

    .line 363
    if-nez v4, :cond_5

    .line 364
    .line 365
    iget-object p1, p0, Lra4;->B0:Ley;

    .line 366
    .line 367
    iget-object p1, p1, Ley;->b:Ljava/lang/Object;

    .line 368
    .line 369
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 370
    .line 371
    invoke-virtual {p1}, Lhg;->getText()Landroid/text/Editable;

    .line 372
    .line 373
    .line 374
    move-result-object p1

    .line 375
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object p1

    .line 379
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    goto :goto_6

    .line 384
    :cond_5
    invoke-static {v3}, Ljava/lang/Character;->charCount(I)I

    .line 385
    .line 386
    .line 387
    move-result v3

    .line 388
    add-int/2addr v1, v3

    .line 389
    goto :goto_5

    .line 390
    :cond_6
    :goto_6
    iput-object v0, p0, Lra4;->J0:Ljava/lang/String;

    .line 391
    .line 392
    iget-object p1, p0, Lra4;->D0:Ljava/lang/String;

    .line 393
    .line 394
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 395
    .line 396
    .line 397
    move-result p1

    .line 398
    const v0, 0x7f130112

    .line 399
    .line 400
    .line 401
    if-eqz p1, :cond_7

    .line 402
    .line 403
    iget-object p1, p0, Lra4;->B0:Ley;

    .line 404
    .line 405
    iget-object p1, p1, Ley;->f:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 408
    .line 409
    invoke-virtual {p0, v0}, Lkc1;->s(I)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object p0

    .line 413
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    .line 414
    .line 415
    .line 416
    goto/16 :goto_9

    .line 417
    .line 418
    :cond_7
    iget-object p1, p0, Lra4;->E0:Ljava/lang/String;

    .line 419
    .line 420
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 421
    .line 422
    .line 423
    move-result p1

    .line 424
    if-eqz p1, :cond_8

    .line 425
    .line 426
    iget-object p1, p0, Lra4;->B0:Ley;

    .line 427
    .line 428
    iget-object p1, p1, Ley;->h:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 431
    .line 432
    invoke-virtual {p0, v0}, Lkc1;->s(I)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object p0

    .line 436
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    .line 437
    .line 438
    .line 439
    goto/16 :goto_9

    .line 440
    .line 441
    :cond_8
    iget-object p1, p0, Lra4;->G0:Ljava/lang/String;

    .line 442
    .line 443
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 444
    .line 445
    .line 446
    move-result p1

    .line 447
    if-eqz p1, :cond_9

    .line 448
    .line 449
    iget-object p1, p0, Lra4;->B0:Ley;

    .line 450
    .line 451
    iget-object p1, p1, Ley;->g:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 454
    .line 455
    invoke-virtual {p0, v0}, Lkc1;->s(I)Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object p0

    .line 459
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    .line 460
    .line 461
    .line 462
    goto/16 :goto_9

    .line 463
    .line 464
    :cond_9
    iget-object p1, p0, Lra4;->H0:Ljava/lang/String;

    .line 465
    .line 466
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 467
    .line 468
    .line 469
    move-result p1

    .line 470
    const v0, 0x7f130113

    .line 471
    .line 472
    .line 473
    const-string v1, "^https?://(.*)"

    .line 474
    .line 475
    if-nez p1, :cond_a

    .line 476
    .line 477
    iget-object p1, p0, Lra4;->H0:Ljava/lang/String;

    .line 478
    .line 479
    invoke-virtual {p1, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 480
    .line 481
    .line 482
    move-result p1

    .line 483
    if-nez p1, :cond_a

    .line 484
    .line 485
    iget-object p1, p0, Lra4;->B0:Ley;

    .line 486
    .line 487
    iget-object p1, p1, Ley;->c:Ljava/lang/Object;

    .line 488
    .line 489
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 490
    .line 491
    invoke-virtual {p0, v0}, Lkc1;->s(I)Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object p0

    .line 495
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    .line 496
    .line 497
    .line 498
    goto :goto_9

    .line 499
    :cond_a
    iget-object p1, p0, Lra4;->G0:Ljava/lang/String;

    .line 500
    .line 501
    invoke-virtual {p1, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    .line 502
    .line 503
    .line 504
    move-result p1

    .line 505
    if-nez p1, :cond_b

    .line 506
    .line 507
    iget-object p1, p0, Lra4;->B0:Ley;

    .line 508
    .line 509
    iget-object p1, p1, Ley;->g:Ljava/lang/Object;

    .line 510
    .line 511
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 512
    .line 513
    invoke-virtual {p0, v0}, Lkc1;->s(I)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object p0

    .line 517
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    .line 518
    .line 519
    .line 520
    goto :goto_9

    .line 521
    :cond_b
    iget-object p1, p0, Lra4;->C0:Lse2;

    .line 522
    .line 523
    iget-object p1, p1, Lse2;->d:Lcom/eddyizm/tempus/model/Server;

    .line 524
    .line 525
    if-eqz p1, :cond_c

    .line 526
    .line 527
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/Server;->getServerId()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object p1

    .line 531
    :goto_7
    move-object v1, p1

    .line 532
    goto :goto_8

    .line 533
    :cond_c
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 534
    .line 535
    .line 536
    move-result-object p1

    .line 537
    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 538
    .line 539
    .line 540
    move-result-object p1

    .line 541
    goto :goto_7

    .line 542
    :goto_8
    iget-object p1, p0, Lra4;->C0:Lse2;

    .line 543
    .line 544
    new-instance v0, Lcom/eddyizm/tempus/model/Server;

    .line 545
    .line 546
    iget-object v2, p0, Lra4;->D0:Ljava/lang/String;

    .line 547
    .line 548
    iget-object v3, p0, Lra4;->E0:Ljava/lang/String;

    .line 549
    .line 550
    iget-object v4, p0, Lra4;->F0:Ljava/lang/String;

    .line 551
    .line 552
    iget-object v5, p0, Lra4;->G0:Ljava/lang/String;

    .line 553
    .line 554
    iget-object v6, p0, Lra4;->H0:Ljava/lang/String;

    .line 555
    .line 556
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 557
    .line 558
    .line 559
    move-result-wide v7

    .line 560
    iget-boolean v9, p0, Lra4;->I0:Z

    .line 561
    .line 562
    iget-object v10, p0, Lra4;->J0:Ljava/lang/String;

    .line 563
    .line 564
    invoke-direct/range {v0 .. v10}, Lcom/eddyizm/tempus/model/Server;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;)V

    .line 565
    .line 566
    .line 567
    iget-object p1, p1, Lse2;->c:Lpz1;

    .line 568
    .line 569
    new-instance v1, Loa4;

    .line 570
    .line 571
    iget-object p1, p1, Lpz1;->o:Ljava/lang/Object;

    .line 572
    .line 573
    check-cast p1, Lna4;

    .line 574
    .line 575
    const/4 v2, 0x1

    .line 576
    invoke-direct {v1, p1, v0, v2}, Loa4;-><init>(Lna4;Lcom/eddyizm/tempus/model/Server;I)V

    .line 577
    .line 578
    .line 579
    new-instance p1, Ljava/lang/Thread;

    .line 580
    .line 581
    invoke-direct {p1, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 585
    .line 586
    .line 587
    iget-object p0, p0, Lpp0;->w0:Landroid/app/Dialog;

    .line 588
    .line 589
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 593
    .line 594
    .line 595
    :goto_9
    return-void

    .line 596
    :pswitch_1
    iget-object p1, p0, Lra4;->B0:Ley;

    .line 597
    .line 598
    iget-object p1, p1, Ley;->b:Ljava/lang/Object;

    .line 599
    .line 600
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 601
    .line 602
    invoke-virtual {p1}, Lhg;->getText()Landroid/text/Editable;

    .line 603
    .line 604
    .line 605
    move-result-object p1

    .line 606
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 607
    .line 608
    .line 609
    move-result p1

    .line 610
    if-eqz p1, :cond_d

    .line 611
    .line 612
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 613
    .line 614
    .line 615
    move-result-object v1

    .line 616
    new-instance v2, Lqa4;

    .line 617
    .line 618
    invoke-direct {v2, p0}, Lqa4;-><init>(Lra4;)V

    .line 619
    .line 620
    .line 621
    const/4 v5, 0x0

    .line 622
    const/4 v6, 0x0

    .line 623
    const/4 v3, 0x0

    .line 624
    const/4 v4, 0x0

    .line 625
    invoke-static/range {v1 .. v6}, Landroid/security/KeyChain;->choosePrivateKeyAlias(Landroid/app/Activity;Landroid/security/KeyChainAliasCallback;[Ljava/lang/String;[Ljava/security/Principal;Landroid/net/Uri;Ljava/lang/String;)V

    .line 626
    .line 627
    .line 628
    goto :goto_a

    .line 629
    :cond_d
    iget-object p0, p0, Lra4;->B0:Ley;

    .line 630
    .line 631
    iget-object p0, p0, Ley;->b:Ljava/lang/Object;

    .line 632
    .line 633
    check-cast p0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 634
    .line 635
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 636
    .line 637
    .line 638
    :goto_a
    return-void

    .line 639
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
