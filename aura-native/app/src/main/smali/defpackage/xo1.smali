.class public final synthetic Ldefpackage/xo1;
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
    iput p2, p0, Ldefpackage/xo1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/xo1;->b:Ldefpackage/cp1;

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
    .locals 6

    .line 1
    iget v0, p0, Ldefpackage/xo1;->a:I

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const/4 v3, 0x1

    .line 7
    const/16 v4, 0x8

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    iget-object p0, p0, Ldefpackage/xo1;->b:Ldefpackage/cp1;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Ljava/util/List;

    .line 16
    .line 17
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    iget-object p0, v0, Ldefpackage/tc1;->f0:Landroid/widget/LinearLayout;

    .line 24
    .line 25
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget-object v0, v0, Ldefpackage/tc1;->f0:Landroid/widget/LinearLayout;

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    move v4, v5

    .line 40
    :cond_1
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 41
    .line 42
    .line 43
    :cond_2
    iget-object p0, p0, Ldefpackage/cp1;->w0:Ldefpackage/s6;

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Ldefpackage/s6;->p(Ljava/util/List;)V

    .line 46
    .line 47
    .line 48
    :cond_3
    :goto_0
    return-void

    .line 49
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 50
    .line 51
    invoke-static {p1}, Ldefpackage/e03;->o(Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    if-eqz p1, :cond_4

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_4

    .line 61
    .line 62
    iget-object v0, p0, Ldefpackage/cp1;->F0:Ldefpackage/bl2;

    .line 63
    .line 64
    invoke-static {v0, p1, v5}, Ldefpackage/bo2;->o(Ldefpackage/ic2;Ljava/util/List;I)V

    .line 65
    .line 66
    .line 67
    iget-object p0, p0, Ldefpackage/cp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 68
    .line 69
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Ldefpackage/zg5;

    .line 70
    .line 71
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p0, Ldefpackage/au;

    .line 74
    .line 75
    invoke-virtual {p0, v3}, Ldefpackage/au;->d(Z)V

    .line 76
    .line 77
    .line 78
    :cond_4
    return-void

    .line 79
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 80
    .line 81
    invoke-static {p1}, Ldefpackage/e03;->o(Ljava/util/List;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_5

    .line 89
    .line 90
    iget-object v0, p0, Ldefpackage/cp1;->F0:Ldefpackage/bl2;

    .line 91
    .line 92
    invoke-static {v0, p1, v5}, Ldefpackage/bo2;->o(Ldefpackage/ic2;Ljava/util/List;I)V

    .line 93
    .line 94
    .line 95
    iget-object p0, p0, Ldefpackage/cp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 96
    .line 97
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Ldefpackage/zg5;

    .line 98
    .line 99
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p0, Ldefpackage/au;

    .line 102
    .line 103
    invoke-virtual {p0, v3}, Ldefpackage/au;->d(Z)V

    .line 104
    .line 105
    .line 106
    :cond_5
    return-void

    .line 107
    :pswitch_2
    check-cast p1, Ljava/util/List;

    .line 108
    .line 109
    invoke-static {p1}, Ldefpackage/e03;->o(Ljava/util/List;)V

    .line 110
    .line 111
    .line 112
    if-eqz p1, :cond_6

    .line 113
    .line 114
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-nez v0, :cond_6

    .line 119
    .line 120
    iget-object v0, p0, Ldefpackage/cp1;->F0:Ldefpackage/bl2;

    .line 121
    .line 122
    invoke-static {v0, p1, v5}, Ldefpackage/bo2;->o(Ldefpackage/ic2;Ljava/util/List;I)V

    .line 123
    .line 124
    .line 125
    iget-object p0, p0, Ldefpackage/cp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 126
    .line 127
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Ldefpackage/zg5;

    .line 128
    .line 129
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast p0, Ldefpackage/au;

    .line 132
    .line 133
    invoke-virtual {p0, v3}, Ldefpackage/au;->d(Z)V

    .line 134
    .line 135
    .line 136
    :cond_6
    return-void

    .line 137
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 138
    .line 139
    iget-object v0, p0, Ldefpackage/cp1;->u0:Ldefpackage/ni4;

    .line 140
    .line 141
    if-eqz v0, :cond_8

    .line 142
    .line 143
    iget-object v0, p0, Ldefpackage/cp1;->p0:Ldefpackage/li3;

    .line 144
    .line 145
    iget-object v0, v0, Ldefpackage/li3;->b:Ldefpackage/k03;

    .line 146
    .line 147
    invoke-virtual {v0}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    check-cast v0, Ljava/lang/String;

    .line 152
    .line 153
    iget-object p0, p0, Ldefpackage/cp1;->u0:Ldefpackage/ni4;

    .line 154
    .line 155
    if-eqz p1, :cond_7

    .line 156
    .line 157
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-eqz p1, :cond_7

    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_7
    move v3, v5

    .line 165
    :goto_1
    invoke-virtual {p0, v0, v3}, Ldefpackage/ni4;->s(Ljava/lang/String;Z)V

    .line 166
    .line 167
    .line 168
    :cond_8
    return-void

    .line 169
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 170
    .line 171
    iget-object v0, p0, Ldefpackage/cp1;->u0:Ldefpackage/ni4;

    .line 172
    .line 173
    if-eqz v0, :cond_a

    .line 174
    .line 175
    iget-object v0, p0, Ldefpackage/cp1;->p0:Ldefpackage/li3;

    .line 176
    .line 177
    iget-object v0, v0, Ldefpackage/li3;->c:Ldefpackage/k03;

    .line 178
    .line 179
    invoke-virtual {v0}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    check-cast v0, Ljava/lang/Boolean;

    .line 184
    .line 185
    iget-object p0, p0, Ldefpackage/cp1;->u0:Ldefpackage/ni4;

    .line 186
    .line 187
    if-eqz v0, :cond_9

    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-eqz v0, :cond_9

    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_9
    move v3, v5

    .line 197
    :goto_2
    invoke-virtual {p0, p1, v3}, Ldefpackage/ni4;->s(Ljava/lang/String;Z)V

    .line 198
    .line 199
    .line 200
    :cond_a
    return-void

    .line 201
    :pswitch_5
    check-cast p1, Ljava/util/List;

    .line 202
    .line 203
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 204
    .line 205
    if-nez p1, :cond_b

    .line 206
    .line 207
    if-eqz v0, :cond_e

    .line 208
    .line 209
    iget-object p0, v0, Ldefpackage/tc1;->o:Landroid/widget/LinearLayout;

    .line 210
    .line 211
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 212
    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_b
    if-eqz v0, :cond_d

    .line 216
    .line 217
    iget-object v0, v0, Ldefpackage/tc1;->o:Landroid/widget/LinearLayout;

    .line 218
    .line 219
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    if-nez v1, :cond_c

    .line 224
    .line 225
    move v4, v5

    .line 226
    :cond_c
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 227
    .line 228
    .line 229
    :cond_d
    iget-object p0, p0, Ldefpackage/cp1;->C0:Ldefpackage/uc4;

    .line 230
    .line 231
    iput-object p1, p0, Ldefpackage/uc4;->s:Ljava/util/List;

    .line 232
    .line 233
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 234
    .line 235
    .line 236
    :cond_e
    :goto_3
    return-void

    .line 237
    :pswitch_6
    check-cast p1, Ljava/util/List;

    .line 238
    .line 239
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 240
    .line 241
    if-nez p1, :cond_f

    .line 242
    .line 243
    if-eqz v0, :cond_12

    .line 244
    .line 245
    iget-object p0, v0, Ldefpackage/tc1;->u:Landroid/widget/LinearLayout;

    .line 246
    .line 247
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 248
    .line 249
    .line 250
    goto :goto_4

    .line 251
    :cond_f
    if-eqz v0, :cond_11

    .line 252
    .line 253
    iget-object v0, v0, Ldefpackage/tc1;->u:Landroid/widget/LinearLayout;

    .line 254
    .line 255
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    if-nez v1, :cond_10

    .line 260
    .line 261
    move v4, v5

    .line 262
    :cond_10
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 263
    .line 264
    .line 265
    :cond_11
    iget-object p0, p0, Ldefpackage/cp1;->y0:Ldefpackage/s6;

    .line 266
    .line 267
    invoke-virtual {p0, p1}, Ldefpackage/s6;->p(Ljava/util/List;)V

    .line 268
    .line 269
    .line 270
    :cond_12
    :goto_4
    return-void

    .line 271
    :pswitch_7
    check-cast p1, Ljava/util/List;

    .line 272
    .line 273
    if-eqz p1, :cond_17

    .line 274
    .line 275
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-eqz v0, :cond_13

    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_13
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 283
    .line 284
    if-eqz v0, :cond_14

    .line 285
    .line 286
    iget-object v0, v0, Ldefpackage/tc1;->p:Landroid/widget/LinearLayout;

    .line 287
    .line 288
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 289
    .line 290
    .line 291
    :cond_14
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 292
    .line 293
    if-eqz v0, :cond_15

    .line 294
    .line 295
    iget-object v0, v0, Ldefpackage/tc1;->c:Landroid/view/View;

    .line 296
    .line 297
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 298
    .line 299
    .line 300
    :cond_15
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 301
    .line 302
    if-eqz v0, :cond_16

    .line 303
    .line 304
    iget-object v0, v0, Ldefpackage/tc1;->q0:Landroidx/recyclerview/widget/RecyclerView;

    .line 305
    .line 306
    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 307
    .line 308
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 309
    .line 310
    .line 311
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 312
    .line 313
    .line 314
    move-result v3

    .line 315
    invoke-static {v3, v2}, Ldefpackage/g12;->y(II)I

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    invoke-direct {v1, v2, v5}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(II)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 323
    .line 324
    .line 325
    :cond_16
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    new-instance v0, Ldefpackage/m7;

    .line 330
    .line 331
    const/16 v1, 0x19

    .line 332
    .line 333
    invoke-direct {v0, v1}, Ldefpackage/m7;-><init>(I)V

    .line 334
    .line 335
    .line 336
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    check-cast p1, Ljava/util/List;

    .line 349
    .line 350
    iget-object v0, p0, Ldefpackage/cp1;->v0:Ldefpackage/ni4;

    .line 351
    .line 352
    invoke-virtual {v0, p1}, Ldefpackage/ni4;->r(Ljava/util/List;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {p0}, Ldefpackage/cp1;->i0()V

    .line 356
    .line 357
    .line 358
    goto :goto_6

    .line 359
    :cond_17
    :goto_5
    iget-object p1, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 360
    .line 361
    if-eqz p1, :cond_18

    .line 362
    .line 363
    iget-object p1, p1, Ldefpackage/tc1;->p:Landroid/widget/LinearLayout;

    .line 364
    .line 365
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 366
    .line 367
    .line 368
    :cond_18
    iget-object p0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 369
    .line 370
    if-eqz p0, :cond_19

    .line 371
    .line 372
    iget-object p0, p0, Ldefpackage/tc1;->c:Landroid/view/View;

    .line 373
    .line 374
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 375
    .line 376
    .line 377
    :cond_19
    :goto_6
    return-void

    .line 378
    :pswitch_8
    check-cast p1, Ljava/util/List;

    .line 379
    .line 380
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 381
    .line 382
    if-nez p1, :cond_1a

    .line 383
    .line 384
    if-eqz v0, :cond_1f

    .line 385
    .line 386
    iget-object p0, v0, Ldefpackage/tc1;->t:Landroid/widget/LinearLayout;

    .line 387
    .line 388
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 389
    .line 390
    .line 391
    goto :goto_8

    .line 392
    :cond_1a
    if-eqz v0, :cond_1c

    .line 393
    .line 394
    iget-object v0, v0, Ldefpackage/tc1;->t:Landroid/widget/LinearLayout;

    .line 395
    .line 396
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 397
    .line 398
    .line 399
    move-result v1

    .line 400
    if-nez v1, :cond_1b

    .line 401
    .line 402
    move v1, v5

    .line 403
    goto :goto_7

    .line 404
    :cond_1b
    move v1, v4

    .line 405
    :goto_7
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 406
    .line 407
    .line 408
    :cond_1c
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 409
    .line 410
    if-eqz v0, :cond_1e

    .line 411
    .line 412
    iget-object v0, v0, Ldefpackage/tc1;->d:Landroid/view/View;

    .line 413
    .line 414
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 415
    .line 416
    .line 417
    move-result v1

    .line 418
    if-nez v1, :cond_1d

    .line 419
    .line 420
    move v4, v5

    .line 421
    :cond_1d
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 422
    .line 423
    .line 424
    :cond_1e
    iget-object p0, p0, Ldefpackage/cp1;->s0:Ldefpackage/vi;

    .line 425
    .line 426
    iput-object p1, p0, Ldefpackage/vi;->u:Ljava/util/List;

    .line 427
    .line 428
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 429
    .line 430
    .line 431
    :cond_1f
    :goto_8
    return-void

    .line 432
    :pswitch_9
    check-cast p1, Ljava/util/List;

    .line 433
    .line 434
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 435
    .line 436
    if-nez p1, :cond_20

    .line 437
    .line 438
    if-eqz v0, :cond_24

    .line 439
    .line 440
    iget-object p0, v0, Ldefpackage/tc1;->a0:Landroid/widget/LinearLayout;

    .line 441
    .line 442
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 443
    .line 444
    .line 445
    goto :goto_9

    .line 446
    :cond_20
    if-eqz v0, :cond_22

    .line 447
    .line 448
    iget-object v0, v0, Ldefpackage/tc1;->a0:Landroid/widget/LinearLayout;

    .line 449
    .line 450
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 451
    .line 452
    .line 453
    move-result v2

    .line 454
    if-nez v2, :cond_21

    .line 455
    .line 456
    move v4, v5

    .line 457
    :cond_21
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 458
    .line 459
    .line 460
    :cond_22
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 461
    .line 462
    if-eqz v0, :cond_23

    .line 463
    .line 464
    iget-object v0, v0, Ldefpackage/tc1;->Z:Landroidx/recyclerview/widget/RecyclerView;

    .line 465
    .line 466
    new-instance v2, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 467
    .line 468
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 469
    .line 470
    .line 471
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 472
    .line 473
    .line 474
    move-result v3

    .line 475
    invoke-static {v3, v1}, Ldefpackage/g12;->y(II)I

    .line 476
    .line 477
    .line 478
    move-result v1

    .line 479
    invoke-direct {v2, v1, v5}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(II)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 483
    .line 484
    .line 485
    :cond_23
    iget-object p0, p0, Ldefpackage/cp1;->E0:Ldefpackage/uc4;

    .line 486
    .line 487
    iput-object p1, p0, Ldefpackage/uc4;->s:Ljava/util/List;

    .line 488
    .line 489
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 490
    .line 491
    .line 492
    :cond_24
    :goto_9
    return-void

    .line 493
    :pswitch_a
    check-cast p1, Ljava/util/List;

    .line 494
    .line 495
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 496
    .line 497
    if-nez p1, :cond_25

    .line 498
    .line 499
    if-eqz v0, :cond_28

    .line 500
    .line 501
    iget-object p0, v0, Ldefpackage/tc1;->v:Landroid/widget/LinearLayout;

    .line 502
    .line 503
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 504
    .line 505
    .line 506
    goto :goto_a

    .line 507
    :cond_25
    if-eqz v0, :cond_27

    .line 508
    .line 509
    iget-object v0, v0, Ldefpackage/tc1;->v:Landroid/widget/LinearLayout;

    .line 510
    .line 511
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 512
    .line 513
    .line 514
    move-result v1

    .line 515
    if-nez v1, :cond_26

    .line 516
    .line 517
    move v4, v5

    .line 518
    :cond_26
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 519
    .line 520
    .line 521
    :cond_27
    iget-object p0, p0, Ldefpackage/cp1;->z0:Ldefpackage/s6;

    .line 522
    .line 523
    invoke-virtual {p0, p1}, Ldefpackage/s6;->p(Ljava/util/List;)V

    .line 524
    .line 525
    .line 526
    :cond_28
    :goto_a
    return-void

    .line 527
    :pswitch_b
    check-cast p1, Ljava/util/List;

    .line 528
    .line 529
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 530
    .line 531
    if-nez p1, :cond_29

    .line 532
    .line 533
    if-eqz v0, :cond_2c

    .line 534
    .line 535
    iget-object p0, v0, Ldefpackage/tc1;->l:Landroid/widget/LinearLayout;

    .line 536
    .line 537
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 538
    .line 539
    .line 540
    goto :goto_b

    .line 541
    :cond_29
    if-eqz v0, :cond_2b

    .line 542
    .line 543
    iget-object v0, v0, Ldefpackage/tc1;->l:Landroid/widget/LinearLayout;

    .line 544
    .line 545
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 546
    .line 547
    .line 548
    move-result v1

    .line 549
    if-nez v1, :cond_2a

    .line 550
    .line 551
    move v4, v5

    .line 552
    :cond_2a
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 553
    .line 554
    .line 555
    :cond_2b
    iget-object p0, p0, Ldefpackage/cp1;->t0:Ldefpackage/vi;

    .line 556
    .line 557
    iput-object p1, p0, Ldefpackage/vi;->u:Ljava/util/List;

    .line 558
    .line 559
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 560
    .line 561
    .line 562
    :cond_2c
    :goto_b
    return-void

    .line 563
    :pswitch_c
    check-cast p1, Ljava/util/List;

    .line 564
    .line 565
    invoke-static {p1}, Ldefpackage/e03;->o(Ljava/util/List;)V

    .line 566
    .line 567
    .line 568
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 569
    .line 570
    if-nez p1, :cond_2d

    .line 571
    .line 572
    if-eqz v0, :cond_30

    .line 573
    .line 574
    iget-object p0, v0, Ldefpackage/tc1;->x:Landroid/widget/LinearLayout;

    .line 575
    .line 576
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 577
    .line 578
    .line 579
    goto :goto_c

    .line 580
    :cond_2d
    if-eqz v0, :cond_2f

    .line 581
    .line 582
    iget-object v0, v0, Ldefpackage/tc1;->x:Landroid/widget/LinearLayout;

    .line 583
    .line 584
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 585
    .line 586
    .line 587
    move-result v1

    .line 588
    if-nez v1, :cond_2e

    .line 589
    .line 590
    move v4, v5

    .line 591
    :cond_2e
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 592
    .line 593
    .line 594
    :cond_2f
    iget-object p0, p0, Ldefpackage/cp1;->r0:Ldefpackage/s6;

    .line 595
    .line 596
    iput-object p1, p0, Ldefpackage/s6;->r:Ljava/util/List;

    .line 597
    .line 598
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 599
    .line 600
    .line 601
    :cond_30
    :goto_c
    return-void

    .line 602
    :pswitch_d
    check-cast p1, Ljava/util/List;

    .line 603
    .line 604
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 605
    .line 606
    if-nez p1, :cond_31

    .line 607
    .line 608
    if-eqz v0, :cond_35

    .line 609
    .line 610
    iget-object p0, v0, Ldefpackage/tc1;->n0:Landroid/widget/LinearLayout;

    .line 611
    .line 612
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 613
    .line 614
    .line 615
    goto :goto_d

    .line 616
    :cond_31
    if-eqz v0, :cond_33

    .line 617
    .line 618
    iget-object v0, v0, Ldefpackage/tc1;->n0:Landroid/widget/LinearLayout;

    .line 619
    .line 620
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 621
    .line 622
    .line 623
    move-result v1

    .line 624
    if-nez v1, :cond_32

    .line 625
    .line 626
    move v4, v5

    .line 627
    :cond_32
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 628
    .line 629
    .line 630
    :cond_33
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 631
    .line 632
    if-eqz v0, :cond_34

    .line 633
    .line 634
    iget-object v0, v0, Ldefpackage/tc1;->m0:Landroidx/recyclerview/widget/RecyclerView;

    .line 635
    .line 636
    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 637
    .line 638
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 639
    .line 640
    .line 641
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 642
    .line 643
    .line 644
    move-result v3

    .line 645
    invoke-static {v3, v2}, Ldefpackage/g12;->y(II)I

    .line 646
    .line 647
    .line 648
    move-result v2

    .line 649
    invoke-direct {v1, v2, v5}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(II)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 653
    .line 654
    .line 655
    :cond_34
    iget-object v0, p0, Ldefpackage/cp1;->u0:Ldefpackage/ni4;

    .line 656
    .line 657
    invoke-virtual {v0, p1}, Ldefpackage/ni4;->r(Ljava/util/List;)V

    .line 658
    .line 659
    .line 660
    invoke-virtual {p0}, Ldefpackage/cp1;->h0()V

    .line 661
    .line 662
    .line 663
    :cond_35
    :goto_d
    return-void

    .line 664
    :pswitch_e
    check-cast p1, Ljava/util/List;

    .line 665
    .line 666
    invoke-static {p1}, Ldefpackage/e03;->o(Ljava/util/List;)V

    .line 667
    .line 668
    .line 669
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 670
    .line 671
    if-nez p1, :cond_36

    .line 672
    .line 673
    if-eqz v0, :cond_39

    .line 674
    .line 675
    iget-object p0, v0, Ldefpackage/tc1;->n:Landroid/widget/LinearLayout;

    .line 676
    .line 677
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 678
    .line 679
    .line 680
    goto :goto_e

    .line 681
    :cond_36
    if-eqz v0, :cond_38

    .line 682
    .line 683
    iget-object v0, v0, Ldefpackage/tc1;->n:Landroid/widget/LinearLayout;

    .line 684
    .line 685
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 686
    .line 687
    .line 688
    move-result v1

    .line 689
    if-nez v1, :cond_37

    .line 690
    .line 691
    move v4, v5

    .line 692
    :cond_37
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 693
    .line 694
    .line 695
    :cond_38
    iget-object p0, p0, Ldefpackage/cp1;->q0:Ldefpackage/vq0;

    .line 696
    .line 697
    iput-object p1, p0, Ldefpackage/vq0;->r:Ljava/util/List;

    .line 698
    .line 699
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 700
    .line 701
    .line 702
    :cond_39
    :goto_e
    return-void

    .line 703
    :pswitch_f
    check-cast p1, Ljava/lang/String;

    .line 704
    .line 705
    iget-object p1, p0, Ldefpackage/cp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 706
    .line 707
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 708
    .line 709
    .line 710
    move-result-object p0

    .line 711
    invoke-virtual {p1}, Lcom/eddyizm/tempus/viewmodel/b;->e()Z

    .line 712
    .line 713
    .line 714
    move-result v0

    .line 715
    iget-object v2, p1, Lcom/eddyizm/tempus/viewmodel/b;->d:Ldefpackage/rv2;

    .line 716
    .line 717
    if-nez v0, :cond_3a

    .line 718
    .line 719
    goto/16 :goto_f

    .line 720
    .line 721
    :cond_3a
    const-string v0, "HOME_SECTOR_DISCOVERY"

    .line 722
    .line 723
    invoke-virtual {p1, v0}, Lcom/eddyizm/tempus/viewmodel/b;->d(Ljava/lang/String;)Z

    .line 724
    .line 725
    .line 726
    move-result v0

    .line 727
    const/4 v3, 0x0

    .line 728
    if-nez v0, :cond_3b

    .line 729
    .line 730
    iget-object v0, p1, Lcom/eddyizm/tempus/viewmodel/b;->c:Ldefpackage/xi4;

    .line 731
    .line 732
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 733
    .line 734
    .line 735
    invoke-static {v1, v3, v3}, Ldefpackage/xi4;->q(ILjava/lang/Integer;Ljava/lang/Integer;)Ldefpackage/k03;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    iget-object v1, p1, Lcom/eddyizm/tempus/viewmodel/b;->l:Ldefpackage/k03;

    .line 740
    .line 741
    invoke-virtual {p1, v1}, Lcom/eddyizm/tempus/viewmodel/b;->h(Ldefpackage/k03;)Ldefpackage/mp1;

    .line 742
    .line 743
    .line 744
    move-result-object v1

    .line 745
    invoke-virtual {v0, p0, v1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 746
    .line 747
    .line 748
    :cond_3b
    const-string v0, "HOME_SECTOR_NEW_RELEASES"

    .line 749
    .line 750
    invoke-virtual {p1, v0}, Lcom/eddyizm/tempus/viewmodel/b;->d(Ljava/lang/String;)Z

    .line 751
    .line 752
    .line 753
    move-result v0

    .line 754
    if-nez v0, :cond_3c

    .line 755
    .line 756
    invoke-virtual {p1, p0}, Lcom/eddyizm/tempus/viewmodel/b;->f(Ldefpackage/le1;)V

    .line 757
    .line 758
    .line 759
    :cond_3c
    const-string v0, "HOME_SECTOR_MOST_PLAYED"

    .line 760
    .line 761
    invoke-virtual {p1, v0}, Lcom/eddyizm/tempus/viewmodel/b;->d(Ljava/lang/String;)Z

    .line 762
    .line 763
    .line 764
    move-result v0

    .line 765
    const/16 v1, 0x14

    .line 766
    .line 767
    if-nez v0, :cond_3d

    .line 768
    .line 769
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 770
    .line 771
    .line 772
    const-string v0, "frequent"

    .line 773
    .line 774
    invoke-static {v0, v1, v3, v3}, Ldefpackage/rv2;->m(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)Ldefpackage/k03;

    .line 775
    .line 776
    .line 777
    move-result-object v0

    .line 778
    iget-object v4, p1, Lcom/eddyizm/tempus/viewmodel/b;->t:Ldefpackage/k03;

    .line 779
    .line 780
    invoke-virtual {p1, v4}, Lcom/eddyizm/tempus/viewmodel/b;->h(Ldefpackage/k03;)Ldefpackage/mp1;

    .line 781
    .line 782
    .line 783
    move-result-object v4

    .line 784
    invoke-virtual {v0, p0, v4}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 785
    .line 786
    .line 787
    :cond_3d
    const-string v0, "HOME_SECTOR_LAST_PLAYED"

    .line 788
    .line 789
    invoke-virtual {p1, v0}, Lcom/eddyizm/tempus/viewmodel/b;->d(Ljava/lang/String;)Z

    .line 790
    .line 791
    .line 792
    move-result v0

    .line 793
    if-nez v0, :cond_3e

    .line 794
    .line 795
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 796
    .line 797
    .line 798
    const-string v0, "recent"

    .line 799
    .line 800
    invoke-static {v0, v1, v3, v3}, Ldefpackage/rv2;->m(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)Ldefpackage/k03;

    .line 801
    .line 802
    .line 803
    move-result-object v0

    .line 804
    iget-object v4, p1, Lcom/eddyizm/tempus/viewmodel/b;->u:Ldefpackage/k03;

    .line 805
    .line 806
    invoke-virtual {p1, v4}, Lcom/eddyizm/tempus/viewmodel/b;->h(Ldefpackage/k03;)Ldefpackage/mp1;

    .line 807
    .line 808
    .line 809
    move-result-object v4

    .line 810
    invoke-virtual {v0, p0, v4}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 811
    .line 812
    .line 813
    :cond_3e
    const-string v0, "HOME_SECTOR_RECENTLY_ADDED"

    .line 814
    .line 815
    invoke-virtual {p1, v0}, Lcom/eddyizm/tempus/viewmodel/b;->d(Ljava/lang/String;)Z

    .line 816
    .line 817
    .line 818
    move-result v0

    .line 819
    if-nez v0, :cond_3f

    .line 820
    .line 821
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 822
    .line 823
    .line 824
    const-string v0, "newest"

    .line 825
    .line 826
    invoke-static {v0, v1, v3, v3}, Ldefpackage/rv2;->m(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;)Ldefpackage/k03;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    iget-object v1, p1, Lcom/eddyizm/tempus/viewmodel/b;->w:Ldefpackage/k03;

    .line 831
    .line 832
    invoke-virtual {p1, v1}, Lcom/eddyizm/tempus/viewmodel/b;->h(Ldefpackage/k03;)Ldefpackage/mp1;

    .line 833
    .line 834
    .line 835
    move-result-object v1

    .line 836
    invoke-virtual {v0, p0, v1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 837
    .line 838
    .line 839
    :cond_3f
    const-string v0, "HOME_SECTOR_FLASHBACK"

    .line 840
    .line 841
    invoke-virtual {p1, v0}, Lcom/eddyizm/tempus/viewmodel/b;->d(Ljava/lang/String;)Z

    .line 842
    .line 843
    .line 844
    move-result v0

    .line 845
    if-nez v0, :cond_40

    .line 846
    .line 847
    invoke-virtual {v2}, Ldefpackage/rv2;->n()Ldefpackage/k03;

    .line 848
    .line 849
    .line 850
    move-result-object v0

    .line 851
    iget-object v1, p1, Lcom/eddyizm/tempus/viewmodel/b;->v:Ldefpackage/k03;

    .line 852
    .line 853
    invoke-virtual {p1, v1}, Lcom/eddyizm/tempus/viewmodel/b;->h(Ldefpackage/k03;)Ldefpackage/mp1;

    .line 854
    .line 855
    .line 856
    move-result-object p1

    .line 857
    invoke-virtual {v0, p0, p1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 858
    .line 859
    .line 860
    :cond_40
    :goto_f
    return-void

    .line 861
    :pswitch_10
    check-cast p1, Ljava/util/List;

    .line 862
    .line 863
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 864
    .line 865
    if-nez p1, :cond_41

    .line 866
    .line 867
    if-eqz v0, :cond_45

    .line 868
    .line 869
    iget-object p0, v0, Ldefpackage/tc1;->s:Landroid/widget/LinearLayout;

    .line 870
    .line 871
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 872
    .line 873
    .line 874
    goto :goto_10

    .line 875
    :cond_41
    if-eqz v0, :cond_43

    .line 876
    .line 877
    iget-object v0, v0, Ldefpackage/tc1;->s:Landroid/widget/LinearLayout;

    .line 878
    .line 879
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 880
    .line 881
    .line 882
    move-result v1

    .line 883
    if-nez v1, :cond_42

    .line 884
    .line 885
    move v4, v5

    .line 886
    :cond_42
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 887
    .line 888
    .line 889
    :cond_43
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 890
    .line 891
    if-eqz v0, :cond_44

    .line 892
    .line 893
    iget-object v0, v0, Ldefpackage/tc1;->N:Landroidx/recyclerview/widget/RecyclerView;

    .line 894
    .line 895
    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 896
    .line 897
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 898
    .line 899
    .line 900
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 901
    .line 902
    .line 903
    move-result v3

    .line 904
    invoke-static {v3, v2}, Ldefpackage/g12;->y(II)I

    .line 905
    .line 906
    .line 907
    move-result v2

    .line 908
    invoke-direct {v1, v2, v5}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(II)V

    .line 909
    .line 910
    .line 911
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 912
    .line 913
    .line 914
    :cond_44
    iget-object p0, p0, Ldefpackage/cp1;->B0:Ldefpackage/b8;

    .line 915
    .line 916
    iput-object p1, p0, Ldefpackage/b8;->s:Ljava/util/List;

    .line 917
    .line 918
    iget-object p1, p0, Ldefpackage/b8;->v:Landroid/widget/Filter;

    .line 919
    .line 920
    check-cast p1, Ldefpackage/o7;

    .line 921
    .line 922
    iget-object v0, p0, Ldefpackage/b8;->u:Ljava/lang/String;

    .line 923
    .line 924
    invoke-virtual {p1, v0}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 925
    .line 926
    .line 927
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 928
    .line 929
    .line 930
    :cond_45
    :goto_10
    return-void

    .line 931
    :pswitch_11
    check-cast p1, Ljava/util/List;

    .line 932
    .line 933
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 934
    .line 935
    if-nez p1, :cond_46

    .line 936
    .line 937
    if-eqz v0, :cond_49

    .line 938
    .line 939
    iget-object p0, v0, Ldefpackage/tc1;->r:Landroid/widget/LinearLayout;

    .line 940
    .line 941
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 942
    .line 943
    .line 944
    goto :goto_11

    .line 945
    :cond_46
    if-eqz v0, :cond_48

    .line 946
    .line 947
    iget-object v0, v0, Ldefpackage/tc1;->r:Landroid/widget/LinearLayout;

    .line 948
    .line 949
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 950
    .line 951
    .line 952
    move-result v1

    .line 953
    if-nez v1, :cond_47

    .line 954
    .line 955
    move v4, v5

    .line 956
    :cond_47
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 957
    .line 958
    .line 959
    :cond_48
    iget-object p0, p0, Ldefpackage/cp1;->A0:Ldefpackage/s6;

    .line 960
    .line 961
    invoke-virtual {p0, p1}, Ldefpackage/s6;->p(Ljava/util/List;)V

    .line 962
    .line 963
    .line 964
    :cond_49
    :goto_11
    return-void

    .line 965
    :pswitch_12
    check-cast p1, Ljava/util/List;

    .line 966
    .line 967
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 968
    .line 969
    if-nez p1, :cond_4a

    .line 970
    .line 971
    if-eqz v0, :cond_4e

    .line 972
    .line 973
    iget-object p0, v0, Ldefpackage/tc1;->P:Landroid/widget/LinearLayout;

    .line 974
    .line 975
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 976
    .line 977
    .line 978
    goto :goto_12

    .line 979
    :cond_4a
    if-eqz v0, :cond_4c

    .line 980
    .line 981
    iget-object v0, v0, Ldefpackage/tc1;->P:Landroid/widget/LinearLayout;

    .line 982
    .line 983
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 984
    .line 985
    .line 986
    move-result v1

    .line 987
    if-nez v1, :cond_4b

    .line 988
    .line 989
    move v4, v5

    .line 990
    :cond_4b
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 991
    .line 992
    .line 993
    :cond_4c
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 994
    .line 995
    if-eqz v0, :cond_4d

    .line 996
    .line 997
    iget-object v0, v0, Ldefpackage/tc1;->O:Landroidx/recyclerview/widget/RecyclerView;

    .line 998
    .line 999
    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 1000
    .line 1001
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 1002
    .line 1003
    .line 1004
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 1005
    .line 1006
    .line 1007
    move-result v3

    .line 1008
    invoke-static {v3, v2}, Ldefpackage/g12;->y(II)I

    .line 1009
    .line 1010
    .line 1011
    move-result v2

    .line 1012
    invoke-direct {v1, v2, v5}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(II)V

    .line 1013
    .line 1014
    .line 1015
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 1016
    .line 1017
    .line 1018
    :cond_4d
    iget-object p0, p0, Ldefpackage/cp1;->D0:Ldefpackage/ej;

    .line 1019
    .line 1020
    invoke-virtual {p0, p1}, Ldefpackage/ej;->p(Ljava/util/List;)V

    .line 1021
    .line 1022
    .line 1023
    :cond_4e
    :goto_12
    return-void

    .line 1024
    :pswitch_13
    check-cast p1, Ljava/lang/Boolean;

    .line 1025
    .line 1026
    iget-object v0, p0, Ldefpackage/cp1;->v0:Ldefpackage/ni4;

    .line 1027
    .line 1028
    if-eqz v0, :cond_50

    .line 1029
    .line 1030
    iget-object v0, p0, Ldefpackage/cp1;->p0:Ldefpackage/li3;

    .line 1031
    .line 1032
    iget-object v0, v0, Ldefpackage/li3;->b:Ldefpackage/k03;

    .line 1033
    .line 1034
    invoke-virtual {v0}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v0

    .line 1038
    check-cast v0, Ljava/lang/String;

    .line 1039
    .line 1040
    iget-object p0, p0, Ldefpackage/cp1;->v0:Ldefpackage/ni4;

    .line 1041
    .line 1042
    if-eqz p1, :cond_4f

    .line 1043
    .line 1044
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1045
    .line 1046
    .line 1047
    move-result p1

    .line 1048
    if-eqz p1, :cond_4f

    .line 1049
    .line 1050
    goto :goto_13

    .line 1051
    :cond_4f
    move v3, v5

    .line 1052
    :goto_13
    invoke-virtual {p0, v0, v3}, Ldefpackage/ni4;->s(Ljava/lang/String;Z)V

    .line 1053
    .line 1054
    .line 1055
    :cond_50
    return-void

    .line 1056
    :pswitch_14
    check-cast p1, Ljava/util/List;

    .line 1057
    .line 1058
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 1059
    .line 1060
    if-nez p1, :cond_51

    .line 1061
    .line 1062
    if-eqz v0, :cond_57

    .line 1063
    .line 1064
    iget-object p0, v0, Ldefpackage/tc1;->j0:Landroid/widget/LinearLayout;

    .line 1065
    .line 1066
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1067
    .line 1068
    .line 1069
    goto :goto_15

    .line 1070
    :cond_51
    if-eqz v0, :cond_53

    .line 1071
    .line 1072
    iget-object v0, v0, Ldefpackage/tc1;->j0:Landroid/widget/LinearLayout;

    .line 1073
    .line 1074
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1075
    .line 1076
    .line 1077
    move-result v1

    .line 1078
    if-nez v1, :cond_52

    .line 1079
    .line 1080
    move v1, v5

    .line 1081
    goto :goto_14

    .line 1082
    :cond_52
    move v1, v4

    .line 1083
    :goto_14
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1084
    .line 1085
    .line 1086
    :cond_53
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 1087
    .line 1088
    if-eqz v0, :cond_55

    .line 1089
    .line 1090
    iget-object v0, v0, Ldefpackage/tc1;->b:Landroid/view/View;

    .line 1091
    .line 1092
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 1093
    .line 1094
    .line 1095
    move-result v1

    .line 1096
    if-nez v1, :cond_54

    .line 1097
    .line 1098
    move v4, v5

    .line 1099
    :cond_54
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1100
    .line 1101
    .line 1102
    :cond_55
    iget-object v0, p0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 1103
    .line 1104
    if-eqz v0, :cond_56

    .line 1105
    .line 1106
    iget-object v0, v0, Ldefpackage/tc1;->i0:Landroidx/recyclerview/widget/RecyclerView;

    .line 1107
    .line 1108
    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 1109
    .line 1110
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 1111
    .line 1112
    .line 1113
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 1114
    .line 1115
    .line 1116
    move-result v3

    .line 1117
    invoke-static {v3, v2}, Ldefpackage/g12;->y(II)I

    .line 1118
    .line 1119
    .line 1120
    move-result v2

    .line 1121
    invoke-direct {v1, v2, v5}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(II)V

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ldefpackage/mw3;)V

    .line 1125
    .line 1126
    .line 1127
    :cond_56
    iget-object p0, p0, Ldefpackage/cp1;->x0:Ldefpackage/b8;

    .line 1128
    .line 1129
    iput-object p1, p0, Ldefpackage/b8;->s:Ljava/util/List;

    .line 1130
    .line 1131
    iget-object p1, p0, Ldefpackage/b8;->v:Landroid/widget/Filter;

    .line 1132
    .line 1133
    check-cast p1, Ldefpackage/o7;

    .line 1134
    .line 1135
    iget-object v0, p0, Ldefpackage/b8;->u:Ljava/lang/String;

    .line 1136
    .line 1137
    invoke-virtual {p1, v0}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;)V

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 1141
    .line 1142
    .line 1143
    :cond_57
    :goto_15
    return-void

    .line 1144
    :pswitch_15
    check-cast p1, Ljava/lang/String;

    .line 1145
    .line 1146
    iget-object v0, p0, Ldefpackage/cp1;->v0:Ldefpackage/ni4;

    .line 1147
    .line 1148
    if-eqz v0, :cond_59

    .line 1149
    .line 1150
    iget-object v0, p0, Ldefpackage/cp1;->p0:Ldefpackage/li3;

    .line 1151
    .line 1152
    iget-object v0, v0, Ldefpackage/li3;->c:Ldefpackage/k03;

    .line 1153
    .line 1154
    invoke-virtual {v0}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v0

    .line 1158
    check-cast v0, Ljava/lang/Boolean;

    .line 1159
    .line 1160
    iget-object p0, p0, Ldefpackage/cp1;->v0:Ldefpackage/ni4;

    .line 1161
    .line 1162
    if-eqz v0, :cond_58

    .line 1163
    .line 1164
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1165
    .line 1166
    .line 1167
    move-result v0

    .line 1168
    if-eqz v0, :cond_58

    .line 1169
    .line 1170
    goto :goto_16

    .line 1171
    :cond_58
    move v3, v5

    .line 1172
    :goto_16
    invoke-virtual {p0, p1, v3}, Ldefpackage/ni4;->s(Ljava/lang/String;Z)V

    .line 1173
    .line 1174
    .line 1175
    :cond_59
    return-void

    .line 1176
    nop

    .line 1177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
