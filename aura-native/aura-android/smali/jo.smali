.class public final synthetic Ljo;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 14
    iput p4, p0, Ljo;->n:I

    iput-object p1, p0, Ljo;->o:Ljava/lang/Object;

    iput-object p2, p0, Ljo;->p:Ljava/lang/Object;

    iput-object p3, p0, Ljo;->q:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lrg1;Lw00;Lhg4;Ljy2;)V
    .locals 0

    .line 1
    const/4 p4, 0x3

    .line 2
    iput p4, p0, Ljo;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ljo;->o:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Ljo;->p:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Ljo;->q:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget v0, p0, Ljo;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    sget-object v4, Lj15;->a:Lj15;

    .line 7
    .line 8
    iget-object v5, p0, Ljo;->q:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v6, p0, Ljo;->p:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object p0, p0, Ljo;->o:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p0, Lb0;

    .line 18
    .line 19
    check-cast v6, Lbc;

    .line 20
    .line 21
    check-cast v5, Lk65;

    .line 22
    .line 23
    invoke-virtual {p0, v6}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0}, Lwr1;->A(Landroid/view/View;)Lho3;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iget-object p0, p0, Lho3;->a:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    return-object v4

    .line 36
    :pswitch_0
    check-cast p0, Lmg1;

    .line 37
    .line 38
    check-cast v6, Llg4;

    .line 39
    .line 40
    check-cast v5, Lwa3;

    .line 41
    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    invoke-virtual {v6, p0}, Llg4;->c(Lmg1;)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    iget v0, v6, Llg4;->t:I

    .line 49
    .line 50
    sub-int/2addr p0, v0

    .line 51
    invoke-virtual {v6, p0}, Llg4;->a(I)V

    .line 52
    .line 53
    .line 54
    :cond_0
    iget p0, v6, Llg4;->t:I

    .line 55
    .line 56
    invoke-static {v6, v3, p0, v3}, Lgh0;->d(Llg4;Ljava/lang/Integer;ILjava/lang/Integer;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {p0}, Lq40;->D0(Ljava/util/List;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Ld80;

    .line 65
    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    iget-object v0, v0, Ld80;->b:Ljava/lang/Integer;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move-object v0, v3

    .line 72
    :goto_0
    invoke-interface {v5, v0}, Lwa3;->c(Ljava/lang/Integer;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-eqz v4, :cond_2

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    invoke-static {v1}, Lq40;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    check-cast v4, Ld80;

    .line 90
    .line 91
    invoke-static {v1, v2}, Lq40;->u0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    iget v2, v4, Ld80;->a:I

    .line 96
    .line 97
    new-instance v4, Ld80;

    .line 98
    .line 99
    invoke-direct {v4, v2, v3, v0}, Ld80;-><init>(ILgb;Ljava/lang/Integer;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v4}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {v0, v1}, Lq40;->G0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    :cond_3
    :goto_1
    new-instance v0, Lc80;

    .line 111
    .line 112
    invoke-static {p0, v1}, Lq40;->G0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-interface {v5}, Lwa3;->g()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    invoke-direct {v0, p0, v1}, Lc80;-><init>(Ljava/util/List;Z)V

    .line 121
    .line 122
    .line 123
    return-object v0

    .line 124
    :pswitch_1
    check-cast p0, Lif1;

    .line 125
    .line 126
    check-cast v6, Lf63;

    .line 127
    .line 128
    check-cast v5, Lfx3;

    .line 129
    .line 130
    sget-object v0, Lf63;->j0:Lb24;

    .line 131
    .line 132
    invoke-interface {p0, v0}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    iget-object p0, v6, Lf63;->W:Lac4;

    .line 136
    .line 137
    iget-object v3, v0, Lb24;->v:Lac4;

    .line 138
    .line 139
    invoke-static {p0, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    iget-boolean v3, v6, Lf63;->Z:Z

    .line 144
    .line 145
    iget-boolean v7, v0, Lb24;->w:Z

    .line 146
    .line 147
    if-eq v3, v7, :cond_4

    .line 148
    .line 149
    move v1, v2

    .line 150
    :cond_4
    iget-object v3, v0, Lb24;->v:Lac4;

    .line 151
    .line 152
    iget-wide v7, v0, Lb24;->x:J

    .line 153
    .line 154
    iget-object v9, v0, Lb24;->A:Lr62;

    .line 155
    .line 156
    iget-object v10, v0, Lb24;->z:Loo0;

    .line 157
    .line 158
    invoke-interface {v3, v7, v8, v9, v10}, Lac4;->a(JLr62;Loo0;)Lya4;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    iput-object v3, v0, Lb24;->C:Lya4;

    .line 163
    .line 164
    iget-object v7, v6, Lf63;->Y:Lwv3;

    .line 165
    .line 166
    invoke-virtual {v3}, Lya4;->s()Lwv3;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-static {v7, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v3

    .line 174
    xor-int/lit8 v7, v3, 0x1

    .line 175
    .line 176
    iput-boolean v7, v5, Lfx3;->n:Z

    .line 177
    .line 178
    if-eqz p0, :cond_5

    .line 179
    .line 180
    if-nez v1, :cond_5

    .line 181
    .line 182
    if-nez v3, :cond_a

    .line 183
    .line 184
    :cond_5
    iget-object v3, v0, Lb24;->v:Lac4;

    .line 185
    .line 186
    iput-object v3, v6, Lf63;->W:Lac4;

    .line 187
    .line 188
    iget-boolean v3, v0, Lb24;->w:Z

    .line 189
    .line 190
    iput-boolean v3, v6, Lf63;->Z:Z

    .line 191
    .line 192
    iget-object v3, v0, Lb24;->C:Lya4;

    .line 193
    .line 194
    sget-object v5, Lwv3;->e:Lwv3;

    .line 195
    .line 196
    if-eqz v3, :cond_6

    .line 197
    .line 198
    invoke-virtual {v3}, Lya4;->s()Lwv3;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    if-nez v3, :cond_7

    .line 203
    .line 204
    :cond_6
    move-object v3, v5

    .line 205
    :cond_7
    iput-object v3, v6, Lf63;->Y:Lwv3;

    .line 206
    .line 207
    iget-object v0, v0, Lb24;->C:Lya4;

    .line 208
    .line 209
    if-eqz v0, :cond_8

    .line 210
    .line 211
    invoke-virtual {v0}, Lya4;->s()Lwv3;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    if-eqz v0, :cond_8

    .line 216
    .line 217
    invoke-static {v0}, Lrr2;->Q(Lwv3;)Lk02;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    new-instance v5, Lwv3;

    .line 222
    .line 223
    iget v3, v0, Lk02;->a:I

    .line 224
    .line 225
    int-to-float v3, v3

    .line 226
    iget v7, v0, Lk02;->b:I

    .line 227
    .line 228
    int-to-float v7, v7

    .line 229
    iget v8, v0, Lk02;->c:I

    .line 230
    .line 231
    int-to-float v8, v8

    .line 232
    iget v0, v0, Lk02;->d:I

    .line 233
    .line 234
    int-to-float v0, v0

    .line 235
    invoke-direct {v5, v3, v7, v8, v0}, Lwv3;-><init>(FFFF)V

    .line 236
    .line 237
    .line 238
    :cond_8
    iput-object v5, v6, Lf63;->X:Lwv3;

    .line 239
    .line 240
    iget-boolean v0, v6, Lf63;->a0:Z

    .line 241
    .line 242
    if-eqz v0, :cond_a

    .line 243
    .line 244
    if-nez v1, :cond_9

    .line 245
    .line 246
    iget-boolean v0, v6, Lf63;->Z:Z

    .line 247
    .line 248
    if-eqz v0, :cond_a

    .line 249
    .line 250
    if-nez p0, :cond_a

    .line 251
    .line 252
    :cond_9
    iget-object p0, v6, Lf63;->H:Lc72;

    .line 253
    .line 254
    invoke-virtual {p0}, Lc72;->E()V

    .line 255
    .line 256
    .line 257
    :cond_a
    iput-boolean v2, v6, Lf63;->a0:Z

    .line 258
    .line 259
    return-object v4

    .line 260
    :pswitch_2
    check-cast p0, Lwf1;

    .line 261
    .line 262
    check-cast v6, Ljx3;

    .line 263
    .line 264
    check-cast v5, Lrp1;

    .line 265
    .line 266
    iget-object v0, v6, Ljx3;->n:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v0, Lcf2;

    .line 269
    .line 270
    iget-object v2, v0, Lcf2;->z:Lw03;

    .line 271
    .line 272
    if-nez v2, :cond_b

    .line 273
    .line 274
    sget-object v2, Lv54;->a:[J

    .line 275
    .line 276
    new-instance v2, Lw03;

    .line 277
    .line 278
    invoke-direct {v2}, Lw03;-><init>()V

    .line 279
    .line 280
    .line 281
    iput-object v2, v0, Lcf2;->z:Lw03;

    .line 282
    .line 283
    :cond_b
    invoke-virtual {v2, v5}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    .line 285
    .line 286
    move-result-object v3

    .line 287
    if-nez v3, :cond_c

    .line 288
    .line 289
    new-instance v3, Laf2;

    .line 290
    .line 291
    invoke-direct {v3, v0}, Laf2;-><init>(Lcf2;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v2, v5, v3}, Lw03;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 295
    .line 296
    .line 297
    :cond_c
    check-cast v3, Laf2;

    .line 298
    .line 299
    iput-boolean v1, v3, Laf2;->n:Z

    .line 300
    .line 301
    invoke-interface {p0, v3, v5}, Lwf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    return-object v4

    .line 305
    :pswitch_3
    check-cast p0, Lb13;

    .line 306
    .line 307
    check-cast v6, Lb13;

    .line 308
    .line 309
    check-cast v5, Lgf1;

    .line 310
    .line 311
    new-instance v0, Llc3;

    .line 312
    .line 313
    invoke-interface {p0}, Lkl4;->getValue()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    check-cast p0, Lyf1;

    .line 318
    .line 319
    invoke-interface {v6}, Lkl4;->getValue()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    check-cast v1, Lif1;

    .line 324
    .line 325
    invoke-interface {v5}, Lgf1;->invoke()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    check-cast v2, Ljava/lang/Number;

    .line 330
    .line 331
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 332
    .line 333
    .line 334
    move-result v2

    .line 335
    invoke-direct {v0, p0, v1, v2}, Llc3;-><init>(Lyf1;Lif1;I)V

    .line 336
    .line 337
    .line 338
    return-object v0

    .line 339
    :pswitch_4
    check-cast p0, Lfo1;

    .line 340
    .line 341
    check-cast v6, Ljava/lang/String;

    .line 342
    .line 343
    check-cast v5, Ljava/lang/String;

    .line 344
    .line 345
    iput-object v6, p0, Lfo1;->f:Ljava/lang/Object;

    .line 346
    .line 347
    iput-object v5, p0, Lfo1;->g:Ljava/lang/Object;

    .line 348
    .line 349
    iget-object v0, p0, Lfo1;->c:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v0, Luc1;

    .line 352
    .line 353
    iget-object v0, v0, Luc1;->z:Lcom/google/android/material/textfield/TextInputEditText;

    .line 354
    .line 355
    if-nez v5, :cond_d

    .line 356
    .line 357
    const-string v5, ""

    .line 358
    .line 359
    :cond_d
    const/16 v2, 0x40

    .line 360
    .line 361
    invoke-static {v5, v2}, Lqm4;->H0(Ljava/lang/String;C)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 366
    .line 367
    invoke-virtual {v2, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v2

    .line 371
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    new-instance v3, Ljava/lang/StringBuilder;

    .line 375
    .line 376
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 380
    .line 381
    .line 382
    move-result v5

    .line 383
    :goto_2
    if-ge v1, v5, :cond_10

    .line 384
    .line 385
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 386
    .line 387
    .line 388
    move-result v6

    .line 389
    invoke-static {v6}, Ljava/lang/Character;->isLetterOrDigit(C)Z

    .line 390
    .line 391
    .line 392
    move-result v7

    .line 393
    if-nez v7, :cond_e

    .line 394
    .line 395
    const-string v7, "._-"

    .line 396
    .line 397
    invoke-static {v7, v6}, Lqm4;->n0(Ljava/lang/CharSequence;C)Z

    .line 398
    .line 399
    .line 400
    move-result v7

    .line 401
    if-eqz v7, :cond_f

    .line 402
    .line 403
    :cond_e
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 404
    .line 405
    .line 406
    :cond_f
    add-int/lit8 v1, v1, 0x1

    .line 407
    .line 408
    goto :goto_2

    .line 409
    :cond_10
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    const/16 v2, 0x20

    .line 414
    .line 415
    invoke-static {v2, v1}, Lqm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 420
    .line 421
    .line 422
    sget-object v0, Lco1;->p:Lco1;

    .line 423
    .line 424
    invoke-virtual {p0, v0}, Lfo1;->s(Lco1;)V

    .line 425
    .line 426
    .line 427
    return-object v4

    .line 428
    :pswitch_5
    check-cast p0, Lrg1;

    .line 429
    .line 430
    check-cast v6, Lw00;

    .line 431
    .line 432
    check-cast v5, Lhg4;

    .line 433
    .line 434
    iget-object v2, p0, Lrg1;->M:Lk80;

    .line 435
    .line 436
    iget-object v4, v2, Lk80;->b:Lw00;

    .line 437
    .line 438
    :try_start_0
    iput-object v6, v2, Lk80;->b:Lw00;

    .line 439
    .line 440
    iget-object v6, p0, Lrg1;->G:Lhg4;

    .line 441
    .line 442
    iget-object v7, p0, Lrg1;->o:[I

    .line 443
    .line 444
    iget-object v8, p0, Lrg1;->v:Li03;

    .line 445
    .line 446
    iput-object v3, p0, Lrg1;->o:[I

    .line 447
    .line 448
    iput-object v3, p0, Lrg1;->v:Li03;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 449
    .line 450
    :try_start_1
    iput-object v5, p0, Lrg1;->G:Lhg4;

    .line 451
    .line 452
    iget-boolean v5, v2, Lk80;->e:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 453
    .line 454
    :try_start_2
    iput-boolean v1, v2, Lk80;->e:Z

    .line 455
    .line 456
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 457
    :catchall_0
    move-exception v0

    .line 458
    :try_start_3
    iput-boolean v5, v2, Lk80;->e:Z

    .line 459
    .line 460
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 461
    :catchall_1
    move-exception v0

    .line 462
    :try_start_4
    iput-object v6, p0, Lrg1;->G:Lhg4;

    .line 463
    .line 464
    iput-object v7, p0, Lrg1;->o:[I

    .line 465
    .line 466
    iput-object v8, p0, Lrg1;->v:Li03;

    .line 467
    .line 468
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 469
    :catchall_2
    move-exception v0

    .line 470
    move-object p0, v0

    .line 471
    iput-object v4, v2, Lk80;->b:Lw00;

    .line 472
    .line 473
    throw p0

    .line 474
    :pswitch_6
    check-cast p0, Lgd0;

    .line 475
    .line 476
    move-object v0, v6

    .line 477
    check-cast v0, Lb25;

    .line 478
    .line 479
    move-object v12, v5

    .line 480
    check-cast v12, Lfv;

    .line 481
    .line 482
    iget-object v13, p0, Lgd0;->G:Lzg5;

    .line 483
    .line 484
    :goto_3
    iget-object v5, v13, Lzg5;->n:Ljava/lang/Object;

    .line 485
    .line 486
    check-cast v5, Lf13;

    .line 487
    .line 488
    iget v6, v5, Lf13;->p:I

    .line 489
    .line 490
    if-eqz v6, :cond_13

    .line 491
    .line 492
    if-eqz v6, :cond_12

    .line 493
    .line 494
    add-int/lit8 v6, v6, -0x1

    .line 495
    .line 496
    iget-object v5, v5, Lf13;->n:[Ljava/lang/Object;

    .line 497
    .line 498
    aget-object v5, v5, v6

    .line 499
    .line 500
    check-cast v5, Lcd0;

    .line 501
    .line 502
    iget-object v5, v5, Lcd0;->a:Lav;

    .line 503
    .line 504
    invoke-virtual {v5}, Lav;->invoke()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v5

    .line 508
    move-object v6, v5

    .line 509
    check-cast v6, Lwv3;

    .line 510
    .line 511
    if-nez v6, :cond_11

    .line 512
    .line 513
    move-object v5, p0

    .line 514
    move p0, v2

    .line 515
    goto :goto_4

    .line 516
    :cond_11
    const-wide/16 v9, 0x0

    .line 517
    .line 518
    const/4 v11, 0x3

    .line 519
    const-wide/16 v7, 0x0

    .line 520
    .line 521
    move-object v5, p0

    .line 522
    invoke-static/range {v5 .. v11}, Lgd0;->s0(Lgd0;Lwv3;JJI)Z

    .line 523
    .line 524
    .line 525
    move-result p0

    .line 526
    :goto_4
    if-eqz p0, :cond_14

    .line 527
    .line 528
    iget-object p0, v13, Lzg5;->n:Ljava/lang/Object;

    .line 529
    .line 530
    check-cast p0, Lf13;

    .line 531
    .line 532
    iget v6, p0, Lf13;->p:I

    .line 533
    .line 534
    sub-int/2addr v6, v2

    .line 535
    invoke-virtual {p0, v6}, Lf13;->k(I)Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object p0

    .line 539
    check-cast p0, Lcd0;

    .line 540
    .line 541
    iget-object p0, p0, Lcd0;->b:Lcz;

    .line 542
    .line 543
    invoke-virtual {p0, v4}, Lcz;->resumeWith(Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    move-object p0, v5

    .line 547
    goto :goto_3

    .line 548
    :cond_12
    const-string p0, "MutableVector is empty."

    .line 549
    .line 550
    invoke-static {p0}, Lkf2;->m(Ljava/lang/String;)V

    .line 551
    .line 552
    .line 553
    goto :goto_5

    .line 554
    :cond_13
    move-object v5, p0

    .line 555
    :cond_14
    iget-boolean p0, v5, Lgd0;->H:Z

    .line 556
    .line 557
    if-eqz p0, :cond_15

    .line 558
    .line 559
    iget-object p0, v5, Lgd0;->F:Lx64;

    .line 560
    .line 561
    invoke-virtual {p0}, Lx64;->invoke()Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object p0

    .line 565
    move-object v6, p0

    .line 566
    check-cast v6, Lwv3;

    .line 567
    .line 568
    if-eqz v6, :cond_15

    .line 569
    .line 570
    const-wide/16 v9, 0x0

    .line 571
    .line 572
    const/4 v11, 0x3

    .line 573
    const-wide/16 v7, 0x0

    .line 574
    .line 575
    invoke-static/range {v5 .. v11}, Lgd0;->s0(Lgd0;Lwv3;JJI)Z

    .line 576
    .line 577
    .line 578
    move-result p0

    .line 579
    if-ne p0, v2, :cond_15

    .line 580
    .line 581
    iput-boolean v1, v5, Lgd0;->H:Z

    .line 582
    .line 583
    :cond_15
    const-wide/16 v1, 0x0

    .line 584
    .line 585
    invoke-static {v5, v12, v1, v2}, Lgd0;->q0(Lgd0;Lfv;J)F

    .line 586
    .line 587
    .line 588
    move-result p0

    .line 589
    iput p0, v0, Lb25;->e:F

    .line 590
    .line 591
    move-object v3, v4

    .line 592
    :goto_5
    return-object v3

    .line 593
    :pswitch_7
    check-cast p0, Lcv;

    .line 594
    .line 595
    check-cast v6, Lf63;

    .line 596
    .line 597
    check-cast v5, Lfa;

    .line 598
    .line 599
    invoke-static {p0, v6, v5}, Lcv;->q0(Lcv;Lf63;Lfa;)Lwv3;

    .line 600
    .line 601
    .line 602
    move-result-object v8

    .line 603
    if-eqz v8, :cond_17

    .line 604
    .line 605
    iget-object v7, p0, Lcv;->B:Lgd0;

    .line 606
    .line 607
    iget-wide v0, v7, Lgd0;->I:J

    .line 608
    .line 609
    const-wide/16 v2, -0x1

    .line 610
    .line 611
    invoke-static {v0, v1, v2, v3}, Ln02;->a(JJ)Z

    .line 612
    .line 613
    .line 614
    move-result p0

    .line 615
    if-eqz p0, :cond_16

    .line 616
    .line 617
    const-string p0, "Expected BringIntoViewRequester to not be used before parents are placed."

    .line 618
    .line 619
    invoke-static {p0}, Lfz1;->c(Ljava/lang/String;)V

    .line 620
    .line 621
    .line 622
    :cond_16
    invoke-virtual {v7}, Lgd0;->r0()J

    .line 623
    .line 624
    .line 625
    move-result-wide v9

    .line 626
    const-wide/16 v11, 0x0

    .line 627
    .line 628
    invoke-virtual/range {v7 .. v12}, Lgd0;->u0(Lwv3;JJ)J

    .line 629
    .line 630
    .line 631
    move-result-wide v0

    .line 632
    const-wide v2, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    xor-long/2addr v0, v2

    .line 638
    invoke-virtual {v8, v0, v1}, Lwv3;->f(J)Lwv3;

    .line 639
    .line 640
    .line 641
    move-result-object v3

    .line 642
    :cond_17
    return-object v3

    .line 643
    :pswitch_8
    check-cast p0, Lko;

    .line 644
    .line 645
    check-cast v6, Lz40;

    .line 646
    .line 647
    check-cast v5, Lhx3;

    .line 648
    .line 649
    invoke-virtual {p0}, Lko;->a()V

    .line 650
    .line 651
    .line 652
    iget-object p0, v6, Lz40;->p:Ljava/lang/Object;

    .line 653
    .line 654
    check-cast p0, Lfl;

    .line 655
    .line 656
    iget v0, v5, Lhx3;->n:I

    .line 657
    .line 658
    :cond_18
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 659
    .line 660
    .line 661
    move-result v1

    .line 662
    ushr-int/lit8 v2, v1, 0x1b

    .line 663
    .line 664
    and-int/lit8 v2, v2, 0xf

    .line 665
    .line 666
    if-ne v2, v0, :cond_19

    .line 667
    .line 668
    add-int/lit8 v2, v1, -0x1

    .line 669
    .line 670
    goto :goto_6

    .line 671
    :cond_19
    move v2, v1

    .line 672
    :goto_6
    invoke-virtual {p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 673
    .line 674
    .line 675
    move-result v1

    .line 676
    if-eqz v1, :cond_18

    .line 677
    .line 678
    return-object v4

    .line 679
    :pswitch_data_0
    .packed-switch 0x0
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
