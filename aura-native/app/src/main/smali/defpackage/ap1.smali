.class public final Ldefpackage/ap1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/a83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ldefpackage/cp1;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/cp1;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/ap1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/ap1;->b:Ldefpackage/cp1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 10

    .line 1
    iget v0, p0, Ldefpackage/ap1;->a:I

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, -0x1

    .line 5
    const v3, 0x7f120010

    .line 6
    .line 7
    .line 8
    const/16 v4, 0x8

    .line 9
    .line 10
    iget-object v5, p0, Ldefpackage/ap1;->b:Ldefpackage/cp1;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, Ljava/util/List;

    .line 17
    .line 18
    if-eqz p1, :cond_4

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_4

    .line 25
    .line 26
    invoke-static {}, Ldefpackage/ud3;->o()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v5}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, Ldefpackage/au0;->w(Landroid/content/Context;)Ldefpackage/eu0;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    move v1, v6

    .line 45
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 56
    .line 57
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-static {v7}, Ldefpackage/eu0;->d(Ljava/lang/String;)Z

    .line 65
    .line 66
    .line 67
    move-result v7

    .line 68
    if-nez v7, :cond_0

    .line 69
    .line 70
    invoke-static {v2}, Ldefpackage/gi1;->G(Lcom/eddyizm/tempus/subsonic/models/Child;)Ldefpackage/gn2;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    new-instance v8, Lcom/eddyizm/tempus/model/Download;

    .line 75
    .line 76
    invoke-direct {v8, v2}, Lcom/eddyizm/tempus/model/Download;-><init>(Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v7, v8, v6}, Ldefpackage/eu0;->b(Ldefpackage/gn2;Lcom/eddyizm/tempus/model/Download;Z)Z

    .line 80
    .line 81
    .line 82
    add-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    move v1, v6

    .line 90
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_3

    .line 95
    .line 96
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 101
    .line 102
    invoke-static {v0}, Ldefpackage/g51;->e(Lcom/eddyizm/tempus/subsonic/models/Child;)Landroid/net/Uri;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    if-nez v2, :cond_2

    .line 107
    .line 108
    invoke-virtual {v5}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-static {v2, v0}, Ldefpackage/i51;->a(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 113
    .line 114
    .line 115
    add-int/lit8 v1, v1, 0x1

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_3
    if-lez v1, :cond_4

    .line 119
    .line 120
    invoke-virtual {v5}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {v5}, Ldefpackage/kc1;->r()Landroid/content/res/Resources;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {v0, v3, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-static {p1, v0, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 145
    .line 146
    .line 147
    :cond_4
    iget-object p1, v5, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 148
    .line 149
    iget-object p1, p1, Ldefpackage/tc1;->D:Lcom/google/android/material/card/MaterialCardView;

    .line 150
    .line 151
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v5}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    if-eqz p1, :cond_5

    .line 159
    .line 160
    invoke-virtual {v5}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    new-instance v0, Ldefpackage/qa1;

    .line 165
    .line 166
    const/16 v1, 0x9

    .line 167
    .line 168
    invoke-direct {v0, v1, p0}, Ldefpackage/qa1;-><init>(ILjava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 172
    .line 173
    .line 174
    :cond_5
    return-void

    .line 175
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 176
    .line 177
    if-eqz p1, :cond_6

    .line 178
    .line 179
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 180
    .line 181
    .line 182
    move-result p0

    .line 183
    if-nez p0, :cond_6

    .line 184
    .line 185
    iget-object p0, v5, Ldefpackage/cp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 186
    .line 187
    iget-object p0, p0, Lcom/eddyizm/tempus/viewmodel/b;->k:Ldefpackage/cl4;

    .line 188
    .line 189
    iget-object v0, p0, Ldefpackage/cl4;->c:Ldefpackage/pa;

    .line 190
    .line 191
    invoke-virtual {v0, v2, v6}, Ldefpackage/pa;->y(IZ)Ldefpackage/k03;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    new-instance v2, Ldefpackage/np0;

    .line 196
    .line 197
    invoke-direct {v2, v1, p0}, Ldefpackage/np0;-><init>(ILjava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v2}, Ldefpackage/ad2;->f(Ldefpackage/a83;)V

    .line 201
    .line 202
    .line 203
    iget-object p0, p0, Ldefpackage/cl4;->d:Ldefpackage/k03;

    .line 204
    .line 205
    invoke-virtual {v5}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    new-instance v1, Ldefpackage/bp1;

    .line 210
    .line 211
    const/4 v2, 0x1

    .line 212
    invoke-direct {v1, v5, p1, v2}, Ldefpackage/bp1;-><init>(Ldefpackage/cp1;Ljava/util/List;I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0, v0, v1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 216
    .line 217
    .line 218
    :cond_6
    return-void

    .line 219
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 220
    .line 221
    if-eqz p1, :cond_b

    .line 222
    .line 223
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-nez v0, :cond_b

    .line 228
    .line 229
    invoke-static {}, Ldefpackage/ud3;->o()Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    if-nez v0, :cond_8

    .line 234
    .line 235
    invoke-virtual {v5}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-static {v0}, Ldefpackage/au0;->w(Landroid/content/Context;)Ldefpackage/eu0;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object p1

    .line 247
    move v1, v6

    .line 248
    :cond_7
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    if-eqz v2, :cond_a

    .line 253
    .line 254
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 259
    .line 260
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v7

    .line 264
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    invoke-static {v7}, Ldefpackage/eu0;->d(Ljava/lang/String;)Z

    .line 268
    .line 269
    .line 270
    move-result v7

    .line 271
    if-nez v7, :cond_7

    .line 272
    .line 273
    invoke-static {v2}, Ldefpackage/gi1;->G(Lcom/eddyizm/tempus/subsonic/models/Child;)Ldefpackage/gn2;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    new-instance v8, Lcom/eddyizm/tempus/model/Download;

    .line 278
    .line 279
    invoke-direct {v8, v2}, Lcom/eddyizm/tempus/model/Download;-><init>(Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0, v7, v8, v6}, Ldefpackage/eu0;->b(Ldefpackage/gn2;Lcom/eddyizm/tempus/model/Download;Z)Z

    .line 283
    .line 284
    .line 285
    add-int/lit8 v1, v1, 0x1

    .line 286
    .line 287
    goto :goto_2

    .line 288
    :cond_8
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    move v1, v6

    .line 293
    :cond_9
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    if-eqz v0, :cond_a

    .line 298
    .line 299
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 304
    .line 305
    invoke-static {v0}, Ldefpackage/g51;->e(Lcom/eddyizm/tempus/subsonic/models/Child;)Landroid/net/Uri;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    if-nez v2, :cond_9

    .line 310
    .line 311
    invoke-virtual {v5}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    invoke-static {v2, v0}, Ldefpackage/i51;->a(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 316
    .line 317
    .line 318
    add-int/lit8 v1, v1, 0x1

    .line 319
    .line 320
    goto :goto_3

    .line 321
    :cond_a
    if-lez v1, :cond_b

    .line 322
    .line 323
    invoke-virtual {v5}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    invoke-virtual {v5}, Ldefpackage/kc1;->r()Landroid/content/res/Resources;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-virtual {v0, v3, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-static {p1, v0, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 344
    .line 345
    .line 346
    move-result-object p1

    .line 347
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 348
    .line 349
    .line 350
    :cond_b
    iget-object p1, v5, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 351
    .line 352
    iget-object p1, p1, Ldefpackage/tc1;->z:Lcom/google/android/material/card/MaterialCardView;

    .line 353
    .line 354
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v5}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 358
    .line 359
    .line 360
    move-result-object p1

    .line 361
    if-eqz p1, :cond_c

    .line 362
    .line 363
    invoke-virtual {v5}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 364
    .line 365
    .line 366
    move-result-object p1

    .line 367
    new-instance v0, Ldefpackage/qa1;

    .line 368
    .line 369
    const/4 v1, 0x7

    .line 370
    invoke-direct {v0, v1, p0}, Ldefpackage/qa1;-><init>(ILjava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 374
    .line 375
    .line 376
    :cond_c
    return-void

    .line 377
    :pswitch_2
    check-cast p1, Ljava/util/List;

    .line 378
    .line 379
    if-eqz p1, :cond_d

    .line 380
    .line 381
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 382
    .line 383
    .line 384
    move-result p0

    .line 385
    if-nez p0, :cond_d

    .line 386
    .line 387
    iget-object p0, v5, Ldefpackage/cp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 388
    .line 389
    iget-object p0, p0, Lcom/eddyizm/tempus/viewmodel/b;->j:Ldefpackage/bl4;

    .line 390
    .line 391
    iget-object v0, p0, Ldefpackage/bl4;->c:Ldefpackage/rv2;

    .line 392
    .line 393
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    invoke-static {v2, v6}, Ldefpackage/rv2;->o(IZ)Ldefpackage/k03;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    new-instance v1, Ldefpackage/np0;

    .line 401
    .line 402
    const/4 v2, 0x4

    .line 403
    invoke-direct {v1, v2, p0}, Ldefpackage/np0;-><init>(ILjava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v0, v1}, Ldefpackage/ad2;->f(Ldefpackage/a83;)V

    .line 407
    .line 408
    .line 409
    iget-object p0, p0, Ldefpackage/bl4;->d:Ldefpackage/k03;

    .line 410
    .line 411
    invoke-virtual {v5}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    new-instance v1, Ldefpackage/bp1;

    .line 416
    .line 417
    invoke-direct {v1, v5, p1, v6}, Ldefpackage/bp1;-><init>(Ldefpackage/cp1;Ljava/util/List;I)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {p0, v0, v1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 421
    .line 422
    .line 423
    :cond_d
    return-void

    .line 424
    :pswitch_3
    check-cast p1, Ljava/util/List;

    .line 425
    .line 426
    if-eqz p1, :cond_16

    .line 427
    .line 428
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 429
    .line 430
    .line 431
    move-result v0

    .line 432
    if-nez v0, :cond_16

    .line 433
    .line 434
    new-instance v0, Ljava/util/ArrayList;

    .line 435
    .line 436
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 437
    .line 438
    .line 439
    invoke-static {}, Ldefpackage/ud3;->o()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    const/4 v3, 0x3

    .line 444
    if-nez v2, :cond_f

    .line 445
    .line 446
    invoke-virtual {v5}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    invoke-static {v2}, Ldefpackage/au0;->w(Landroid/content/Context;)Ldefpackage/eu0;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 455
    .line 456
    .line 457
    move-result-object p1

    .line 458
    move v7, v6

    .line 459
    :cond_e
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 460
    .line 461
    .line 462
    move-result v8

    .line 463
    if-eqz v8, :cond_11

    .line 464
    .line 465
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v8

    .line 469
    check-cast v8, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 470
    .line 471
    invoke-virtual {v8}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v9

    .line 475
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    invoke-static {v9}, Ldefpackage/eu0;->d(Ljava/lang/String;)Z

    .line 479
    .line 480
    .line 481
    move-result v9

    .line 482
    if-nez v9, :cond_e

    .line 483
    .line 484
    add-int/lit8 v7, v7, 0x1

    .line 485
    .line 486
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 487
    .line 488
    .line 489
    move-result v9

    .line 490
    if-ge v9, v3, :cond_e

    .line 491
    .line 492
    invoke-virtual {v8}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v8

    .line 496
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    goto :goto_4

    .line 500
    :cond_f
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 501
    .line 502
    .line 503
    move-result-object p1

    .line 504
    move v7, v6

    .line 505
    :cond_10
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 506
    .line 507
    .line 508
    move-result v2

    .line 509
    if-eqz v2, :cond_11

    .line 510
    .line 511
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 516
    .line 517
    invoke-static {v2}, Ldefpackage/g51;->e(Lcom/eddyizm/tempus/subsonic/models/Child;)Landroid/net/Uri;

    .line 518
    .line 519
    .line 520
    move-result-object v8

    .line 521
    if-nez v8, :cond_10

    .line 522
    .line 523
    add-int/lit8 v7, v7, 0x1

    .line 524
    .line 525
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 526
    .line 527
    .line 528
    move-result v8

    .line 529
    if-ge v8, v3, :cond_10

    .line 530
    .line 531
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 532
    .line 533
    .line 534
    move-result-object v2

    .line 535
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    goto :goto_5

    .line 539
    :cond_11
    iget-object p1, v5, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 540
    .line 541
    if-lez v7, :cond_15

    .line 542
    .line 543
    iget-object p1, p1, Ldefpackage/tc1;->H:Lcom/google/android/material/card/MaterialCardView;

    .line 544
    .line 545
    invoke-virtual {p1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 546
    .line 547
    .line 548
    new-instance p1, Ljava/lang/StringBuilder;

    .line 549
    .line 550
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 554
    .line 555
    .line 556
    move-result v2

    .line 557
    if-nez v2, :cond_13

    .line 558
    .line 559
    new-instance v2, Ljava/lang/StringBuilder;

    .line 560
    .line 561
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 569
    .line 570
    .line 571
    move-result v4

    .line 572
    if-eqz v4, :cond_12

    .line 573
    .line 574
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v4

    .line 578
    check-cast v4, Ljava/lang/CharSequence;

    .line 579
    .line 580
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 581
    .line 582
    .line 583
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 584
    .line 585
    .line 586
    move-result v4

    .line 587
    if-eqz v4, :cond_12

    .line 588
    .line 589
    const-string v4, ", "

    .line 590
    .line 591
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 592
    .line 593
    .line 594
    goto :goto_6

    .line 595
    :cond_12
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 600
    .line 601
    .line 602
    if-le v7, v3, :cond_13

    .line 603
    .line 604
    const-string v0, "..."

    .line 605
    .line 606
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 607
    .line 608
    .line 609
    :cond_13
    invoke-virtual {v5}, Ldefpackage/kc1;->r()Landroid/content/res/Resources;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 614
    .line 615
    .line 616
    move-result-object v2

    .line 617
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v2

    .line 621
    const v3, 0x7f120005

    .line 622
    .line 623
    .line 624
    invoke-virtual {v0, v3, v7, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v0

    .line 628
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    .line 629
    .line 630
    .line 631
    move-result v2

    .line 632
    iget-object v3, v5, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 633
    .line 634
    if-lez v2, :cond_14

    .line 635
    .line 636
    iget-object v2, v3, Ldefpackage/tc1;->J:Landroid/widget/TextView;

    .line 637
    .line 638
    new-instance v3, Ljava/lang/StringBuilder;

    .line 639
    .line 640
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 641
    .line 642
    .line 643
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object p1

    .line 647
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 648
    .line 649
    .line 650
    const-string p1, "\n"

    .line 651
    .line 652
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 653
    .line 654
    .line 655
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 656
    .line 657
    .line 658
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object p1

    .line 662
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 663
    .line 664
    .line 665
    goto :goto_7

    .line 666
    :cond_14
    iget-object p1, v3, Ldefpackage/tc1;->J:Landroid/widget/TextView;

    .line 667
    .line 668
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 669
    .line 670
    .line 671
    :goto_7
    invoke-virtual {v5}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 672
    .line 673
    .line 674
    move-result-object p1

    .line 675
    if-eqz p1, :cond_16

    .line 676
    .line 677
    invoke-virtual {v5}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 678
    .line 679
    .line 680
    move-result-object p1

    .line 681
    new-instance v0, Ldefpackage/qa1;

    .line 682
    .line 683
    invoke-direct {v0, v1, p0}, Ldefpackage/qa1;-><init>(ILjava/lang/Object;)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 687
    .line 688
    .line 689
    goto :goto_8

    .line 690
    :cond_15
    iget-object p0, p1, Ldefpackage/tc1;->H:Lcom/google/android/material/card/MaterialCardView;

    .line 691
    .line 692
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 693
    .line 694
    .line 695
    :cond_16
    :goto_8
    return-void

    .line 696
    nop

    .line 697
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
