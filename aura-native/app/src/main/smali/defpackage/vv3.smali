.class public final Ldefpackage/vv3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/w92;


# instance fields
.field public final synthetic n:I

.field public final o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/vv3;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/vv3;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ldefpackage/ba2;Ldefpackage/q92;)V
    .locals 9

    .line 1
    iget v0, p0, Ldefpackage/vv3;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object v4, p0, Ldefpackage/vv3;->o:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v0, Ldefpackage/q92;->ON_CREATE:Ldefpackage/q92;

    .line 12
    .line 13
    if-ne p2, v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Ldefpackage/ba2;->h()Ldefpackage/ea2;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1, p0}, Ldefpackage/ea2;->f(Ldefpackage/aa2;)V

    .line 20
    .line 21
    .line 22
    check-cast v4, Ldefpackage/f54;

    .line 23
    .line 24
    invoke-virtual {v4}, Ldefpackage/f54;->b()V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-string p0, "Next event must be ON_CREATE, it was "

    .line 29
    .line 30
    invoke-static {p2, p0}, Ldefpackage/nz2;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    return-void

    .line 34
    :pswitch_0
    check-cast v4, Ldefpackage/de1;

    .line 35
    .line 36
    invoke-virtual {v4, v2}, Ldefpackage/de1;->b(Z)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_1
    sget-object p0, Ldefpackage/q92;->ON_STOP:Ldefpackage/q92;

    .line 41
    .line 42
    if-ne p2, p0, :cond_1

    .line 43
    .line 44
    check-cast v4, Ldefpackage/kc1;

    .line 45
    .line 46
    iget-object p0, v4, Ldefpackage/kc1;->T:Landroid/view/View;

    .line 47
    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/view/View;->cancelPendingInputEvents()V

    .line 51
    .line 52
    .line 53
    :cond_1
    return-void

    .line 54
    :pswitch_2
    check-cast v4, Ldefpackage/tp0;

    .line 55
    .line 56
    sget-object v0, Ldefpackage/sp0;->a:[I

    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    aget p2, v0, p2

    .line 63
    .line 64
    if-eq p2, v1, :cond_d

    .line 65
    .line 66
    const/4 v0, 0x2

    .line 67
    if-eq p2, v0, :cond_a

    .line 68
    .line 69
    const/4 v0, 0x3

    .line 70
    if-eq p2, v0, :cond_6

    .line 71
    .line 72
    const/4 v0, 0x4

    .line 73
    if-eq p2, v0, :cond_2

    .line 74
    .line 75
    goto/16 :goto_5

    .line 76
    .line 77
    :cond_2
    check-cast p1, Ldefpackage/pp0;

    .line 78
    .line 79
    invoke-virtual {v4}, Ldefpackage/t43;->b()Ldefpackage/d23;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    iget-object p2, p2, Ldefpackage/d23;->f:Ldefpackage/vu3;

    .line 84
    .line 85
    iget-object p2, p2, Ldefpackage/vu3;->n:Ldefpackage/nl4;

    .line 86
    .line 87
    invoke-virtual {p2}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    check-cast p2, Ljava/lang/Iterable;

    .line 92
    .line 93
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_4

    .line 102
    .line 103
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    move-object v1, v0

    .line 108
    check-cast v1, Ldefpackage/a23;

    .line 109
    .line 110
    iget-object v1, v1, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 111
    .line 112
    iget-object v2, p1, Ldefpackage/kc1;->L:Ljava/lang/String;

    .line 113
    .line 114
    invoke-static {v1, v2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_3

    .line 119
    .line 120
    move-object v3, v0

    .line 121
    goto :goto_1

    .line 122
    :cond_4
    check-cast v3, Ldefpackage/a23;

    .line 123
    .line 124
    if-eqz v3, :cond_5

    .line 125
    .line 126
    invoke-virtual {v4}, Ldefpackage/t43;->b()Ldefpackage/d23;

    .line 127
    .line 128
    .line 129
    move-result-object p2

    .line 130
    invoke-virtual {p2, v3}, Ldefpackage/d23;->b(Ldefpackage/a23;)V

    .line 131
    .line 132
    .line 133
    :cond_5
    iget-object p1, p1, Ldefpackage/kc1;->c0:Ldefpackage/ea2;

    .line 134
    .line 135
    invoke-virtual {p1, p0}, Ldefpackage/ea2;->f(Ldefpackage/aa2;)V

    .line 136
    .line 137
    .line 138
    goto/16 :goto_5

    .line 139
    .line 140
    :cond_6
    check-cast p1, Ldefpackage/pp0;

    .line 141
    .line 142
    invoke-virtual {p1}, Ldefpackage/pp0;->k0()Landroid/app/Dialog;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    if-nez p0, :cond_11

    .line 151
    .line 152
    invoke-virtual {v4}, Ldefpackage/t43;->b()Ldefpackage/d23;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    iget-object p0, p0, Ldefpackage/d23;->e:Ldefpackage/vu3;

    .line 157
    .line 158
    iget-object p0, p0, Ldefpackage/vu3;->n:Ldefpackage/nl4;

    .line 159
    .line 160
    invoke-virtual {p0}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    check-cast p0, Ljava/util/List;

    .line 165
    .line 166
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 167
    .line 168
    .line 169
    move-result p2

    .line 170
    invoke-interface {p0, p2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    :cond_7
    invoke-interface {p2}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    if-eqz v0, :cond_8

    .line 179
    .line 180
    invoke-interface {p2}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    check-cast v0, Ldefpackage/a23;

    .line 185
    .line 186
    iget-object v0, v0, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 187
    .line 188
    iget-object v1, p1, Ldefpackage/kc1;->L:Ljava/lang/String;

    .line 189
    .line 190
    invoke-static {v0, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    if-eqz v0, :cond_7

    .line 195
    .line 196
    invoke-interface {p2}, Ljava/util/ListIterator;->nextIndex()I

    .line 197
    .line 198
    .line 199
    move-result p2

    .line 200
    goto :goto_2

    .line 201
    :cond_8
    const/4 p2, -0x1

    .line 202
    :goto_2
    invoke-static {p0, p2}, Ldefpackage/q40;->y0(Ljava/util/List;I)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    check-cast v0, Ldefpackage/a23;

    .line 207
    .line 208
    invoke-static {p0}, Ldefpackage/q40;->D0(Ljava/util/List;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    invoke-static {p0, v0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result p0

    .line 216
    if-nez p0, :cond_9

    .line 217
    .line 218
    new-instance p0, Ljava/lang/StringBuilder;

    .line 219
    .line 220
    const-string v1, "Dialog "

    .line 221
    .line 222
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    const-string p1, " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog"

    .line 229
    .line 230
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    const-string p1, "DialogFragmentNavigator"

    .line 238
    .line 239
    invoke-static {p1, p0}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 240
    .line 241
    .line 242
    :cond_9
    if-eqz v0, :cond_11

    .line 243
    .line 244
    invoke-virtual {v4, p2, v0, v2}, Ldefpackage/tp0;->l(ILdefpackage/a23;Z)V

    .line 245
    .line 246
    .line 247
    goto/16 :goto_5

    .line 248
    .line 249
    :cond_a
    check-cast p1, Ldefpackage/pp0;

    .line 250
    .line 251
    invoke-virtual {v4}, Ldefpackage/t43;->b()Ldefpackage/d23;

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    iget-object p0, p0, Ldefpackage/d23;->f:Ldefpackage/vu3;

    .line 256
    .line 257
    iget-object p0, p0, Ldefpackage/vu3;->n:Ldefpackage/nl4;

    .line 258
    .line 259
    invoke-virtual {p0}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    check-cast p0, Ljava/lang/Iterable;

    .line 264
    .line 265
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    :cond_b
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 270
    .line 271
    .line 272
    move-result p2

    .line 273
    if-eqz p2, :cond_c

    .line 274
    .line 275
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object p2

    .line 279
    move-object v0, p2

    .line 280
    check-cast v0, Ldefpackage/a23;

    .line 281
    .line 282
    iget-object v0, v0, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 283
    .line 284
    iget-object v1, p1, Ldefpackage/kc1;->L:Ljava/lang/String;

    .line 285
    .line 286
    invoke-static {v0, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v0

    .line 290
    if-eqz v0, :cond_b

    .line 291
    .line 292
    move-object v3, p2

    .line 293
    goto :goto_3

    .line 294
    :cond_c
    check-cast v3, Ldefpackage/a23;

    .line 295
    .line 296
    if-eqz v3, :cond_11

    .line 297
    .line 298
    invoke-virtual {v4}, Ldefpackage/t43;->b()Ldefpackage/d23;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    invoke-virtual {p0, v3}, Ldefpackage/d23;->b(Ldefpackage/a23;)V

    .line 303
    .line 304
    .line 305
    goto :goto_5

    .line 306
    :cond_d
    check-cast p1, Ldefpackage/pp0;

    .line 307
    .line 308
    invoke-virtual {v4}, Ldefpackage/t43;->b()Ldefpackage/d23;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    iget-object p0, p0, Ldefpackage/d23;->e:Ldefpackage/vu3;

    .line 313
    .line 314
    iget-object p0, p0, Ldefpackage/vu3;->n:Ldefpackage/nl4;

    .line 315
    .line 316
    invoke-virtual {p0}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    check-cast p0, Ljava/lang/Iterable;

    .line 321
    .line 322
    instance-of p2, p0, Ljava/util/Collection;

    .line 323
    .line 324
    if-eqz p2, :cond_e

    .line 325
    .line 326
    move-object p2, p0

    .line 327
    check-cast p2, Ljava/util/Collection;

    .line 328
    .line 329
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 330
    .line 331
    .line 332
    move-result p2

    .line 333
    if-eqz p2, :cond_e

    .line 334
    .line 335
    goto :goto_4

    .line 336
    :cond_e
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 337
    .line 338
    .line 339
    move-result-object p0

    .line 340
    :cond_f
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 341
    .line 342
    .line 343
    move-result p2

    .line 344
    if-eqz p2, :cond_10

    .line 345
    .line 346
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object p2

    .line 350
    check-cast p2, Ldefpackage/a23;

    .line 351
    .line 352
    iget-object p2, p2, Ldefpackage/a23;->s:Ljava/lang/String;

    .line 353
    .line 354
    iget-object v0, p1, Ldefpackage/kc1;->L:Ljava/lang/String;

    .line 355
    .line 356
    invoke-static {p2, v0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result p2

    .line 360
    if-eqz p2, :cond_f

    .line 361
    .line 362
    goto :goto_5

    .line 363
    :cond_10
    :goto_4
    invoke-virtual {p1}, Ldefpackage/pp0;->h0()V

    .line 364
    .line 365
    .line 366
    :cond_11
    :goto_5
    return-void

    .line 367
    :pswitch_3
    new-instance p0, Ljava/util/HashMap;

    .line 368
    .line 369
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 370
    .line 371
    .line 372
    check-cast v4, [Ldefpackage/ah1;

    .line 373
    .line 374
    array-length p0, v4

    .line 375
    if-gtz p0, :cond_13

    .line 376
    .line 377
    array-length p0, v4

    .line 378
    if-gtz p0, :cond_12

    .line 379
    .line 380
    return-void

    .line 381
    :cond_12
    aget-object p0, v4, v2

    .line 382
    .line 383
    throw v3

    .line 384
    :cond_13
    aget-object p0, v4, v2

    .line 385
    .line 386
    throw v3

    .line 387
    :pswitch_4
    check-cast v4, Ldefpackage/nc1;

    .line 388
    .line 389
    iget-object p1, v4, Ldefpackage/l70;->r:Ldefpackage/e75;

    .line 390
    .line 391
    if-nez p1, :cond_15

    .line 392
    .line 393
    invoke-virtual {v4}, Landroid/app/Activity;->getLastNonConfigurationInstance()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object p1

    .line 397
    check-cast p1, Ldefpackage/h70;

    .line 398
    .line 399
    if-eqz p1, :cond_14

    .line 400
    .line 401
    iget-object p1, p1, Ldefpackage/h70;->a:Ldefpackage/e75;

    .line 402
    .line 403
    iput-object p1, v4, Ldefpackage/l70;->r:Ldefpackage/e75;

    .line 404
    .line 405
    :cond_14
    iget-object p1, v4, Ldefpackage/l70;->r:Ldefpackage/e75;

    .line 406
    .line 407
    if-nez p1, :cond_15

    .line 408
    .line 409
    new-instance p1, Ldefpackage/e75;

    .line 410
    .line 411
    invoke-direct {p1}, Ldefpackage/e75;-><init>()V

    .line 412
    .line 413
    .line 414
    iput-object p1, v4, Ldefpackage/l70;->r:Ldefpackage/e75;

    .line 415
    .line 416
    :cond_15
    iget-object p1, v4, Ldefpackage/k70;->n:Ldefpackage/ea2;

    .line 417
    .line 418
    invoke-virtual {p1, p0}, Ldefpackage/ea2;->f(Ldefpackage/aa2;)V

    .line 419
    .line 420
    .line 421
    return-void

    .line 422
    :pswitch_5
    check-cast v4, Ldefpackage/j54;

    .line 423
    .line 424
    sget-object v0, Ldefpackage/q92;->ON_CREATE:Ldefpackage/q92;

    .line 425
    .line 426
    if-ne p2, v0, :cond_1d

    .line 427
    .line 428
    invoke-interface {p1}, Ldefpackage/ba2;->h()Ldefpackage/ea2;

    .line 429
    .line 430
    .line 431
    move-result-object p1

    .line 432
    invoke-virtual {p1, p0}, Ldefpackage/ea2;->f(Ldefpackage/aa2;)V

    .line 433
    .line 434
    .line 435
    invoke-interface {v4}, Ldefpackage/j54;->f()Ldefpackage/rm3;

    .line 436
    .line 437
    .line 438
    move-result-object p0

    .line 439
    const-string p1, "androidx.savedstate.Restarter"

    .line 440
    .line 441
    invoke-virtual {p0, p1}, Ldefpackage/rm3;->A(Ljava/lang/String;)Landroid/os/Bundle;

    .line 442
    .line 443
    .line 444
    move-result-object p0

    .line 445
    if-nez p0, :cond_16

    .line 446
    .line 447
    goto/16 :goto_8

    .line 448
    .line 449
    :cond_16
    const-string p1, "classes_to_restore"

    .line 450
    .line 451
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 452
    .line 453
    .line 454
    move-result-object p0

    .line 455
    if-eqz p0, :cond_1b

    .line 456
    .line 457
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 458
    .line 459
    .line 460
    move-result p1

    .line 461
    move p2, v2

    .line 462
    :cond_17
    :goto_6
    if-ge p2, p1, :cond_1c

    .line 463
    .line 464
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    add-int/lit8 p2, p2, 0x1

    .line 469
    .line 470
    check-cast v0, Ljava/lang/String;

    .line 471
    .line 472
    const-string v5, "Class "

    .line 473
    .line 474
    :try_start_0
    const-class v6, Ldefpackage/vv3;

    .line 475
    .line 476
    invoke-virtual {v6}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 477
    .line 478
    .line 479
    move-result-object v6

    .line 480
    invoke-static {v0, v2, v6}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    move-result-object v6

    .line 484
    const-class v7, Ldefpackage/h54;

    .line 485
    .line 486
    invoke-virtual {v6, v7}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    move-result-object v6

    .line 490
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 491
    .line 492
    .line 493
    :try_start_1
    invoke-virtual {v6, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 494
    .line 495
    .line 496
    move-result-object v5
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 497
    invoke-virtual {v5, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 498
    .line 499
    .line 500
    :try_start_2
    invoke-virtual {v5, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object v5

    .line 504
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    check-cast v5, Ldefpackage/h54;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 508
    .line 509
    instance-of v0, v4, Ldefpackage/f75;

    .line 510
    .line 511
    if-eqz v0, :cond_1a

    .line 512
    .line 513
    move-object v0, v4

    .line 514
    check-cast v0, Ldefpackage/f75;

    .line 515
    .line 516
    invoke-interface {v0}, Ldefpackage/f75;->d()Ldefpackage/e75;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    invoke-interface {v4}, Ldefpackage/j54;->f()Ldefpackage/rm3;

    .line 521
    .line 522
    .line 523
    move-result-object v5

    .line 524
    iget-object v6, v0, Ldefpackage/e75;->a:Ljava/util/LinkedHashMap;

    .line 525
    .line 526
    iget-object v0, v0, Ldefpackage/e75;->a:Ljava/util/LinkedHashMap;

    .line 527
    .line 528
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 529
    .line 530
    .line 531
    move-result-object v6

    .line 532
    check-cast v6, Ljava/lang/Iterable;

    .line 533
    .line 534
    invoke-static {v6}, Ldefpackage/q40;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 535
    .line 536
    .line 537
    move-result-object v6

    .line 538
    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 539
    .line 540
    .line 541
    move-result-object v6

    .line 542
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 543
    .line 544
    .line 545
    move-result v7

    .line 546
    if-eqz v7, :cond_19

    .line 547
    .line 548
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v7

    .line 552
    invoke-virtual {v0, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    move-result-object v7

    .line 556
    check-cast v7, Ldefpackage/x65;

    .line 557
    .line 558
    if-nez v7, :cond_18

    .line 559
    .line 560
    goto :goto_7

    .line 561
    :cond_18
    invoke-interface {v4}, Ldefpackage/ba2;->h()Ldefpackage/ea2;

    .line 562
    .line 563
    .line 564
    move-result-object v8

    .line 565
    invoke-static {v7, v5, v8}, Ldefpackage/te5;->c(Ldefpackage/x65;Ldefpackage/rm3;Ldefpackage/ea2;)V

    .line 566
    .line 567
    .line 568
    goto :goto_7

    .line 569
    :cond_19
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 570
    .line 571
    .line 572
    move-result-object v0

    .line 573
    check-cast v0, Ljava/lang/Iterable;

    .line 574
    .line 575
    invoke-static {v0}, Ldefpackage/q40;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    check-cast v0, Ljava/util/Collection;

    .line 580
    .line 581
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 582
    .line 583
    .line 584
    move-result v0

    .line 585
    if-nez v0, :cond_17

    .line 586
    .line 587
    invoke-virtual {v5}, Ldefpackage/rm3;->P()V

    .line 588
    .line 589
    .line 590
    goto/16 :goto_6

    .line 591
    .line 592
    :cond_1a
    const-string p0, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: "

    .line 593
    .line 594
    invoke-static {v4, p0}, Ldefpackage/nz2;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 595
    .line 596
    .line 597
    goto :goto_8

    .line 598
    :catch_0
    move-exception p0

    .line 599
    const-string p1, "Failed to instantiate "

    .line 600
    .line 601
    invoke-static {p1, v0}, Ldefpackage/xa3;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 602
    .line 603
    .line 604
    move-result-object p1

    .line 605
    invoke-static {p1, p0}, Ldefpackage/nz2;->s(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 606
    .line 607
    .line 608
    goto :goto_8

    .line 609
    :catch_1
    move-exception p0

    .line 610
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 611
    .line 612
    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object p2

    .line 616
    new-instance v0, Ljava/lang/StringBuilder;

    .line 617
    .line 618
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 619
    .line 620
    .line 621
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 622
    .line 623
    .line 624
    const-string p2, " must have default constructor in order to be automatically recreated"

    .line 625
    .line 626
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 627
    .line 628
    .line 629
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object p2

    .line 633
    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 634
    .line 635
    .line 636
    throw p1

    .line 637
    :catch_2
    move-exception p0

    .line 638
    const-string p1, " wasn\'t found"

    .line 639
    .line 640
    invoke-static {v5, v0, p1}, Ldefpackage/xa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object p1

    .line 644
    invoke-static {p1, p0}, Ldefpackage/nz2;->s(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 645
    .line 646
    .line 647
    goto :goto_8

    .line 648
    :cond_1b
    const-string p0, "SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""

    .line 649
    .line 650
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 651
    .line 652
    .line 653
    :cond_1c
    :goto_8
    return-void

    .line 654
    :cond_1d
    new-instance p0, Ljava/lang/AssertionError;

    .line 655
    .line 656
    const-string p1, "Next event must be ON_CREATE"

    .line 657
    .line 658
    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 659
    .line 660
    .line 661
    throw p0

    .line 662
    nop

    .line 663
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
