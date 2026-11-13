.class public final Ldefpackage/np0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/a83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/np0;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/np0;->b:Ljava/lang/Object;

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
    .locals 9

    .line 1
    iget v0, p0, Ldefpackage/np0;->a:I

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, -0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    iget-object v6, p0, Ldefpackage/np0;->b:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/util/List;

    .line 15
    .line 16
    check-cast v6, Ldefpackage/cl4;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    iget-object v0, v6, Ldefpackage/cl4;->d:Ldefpackage/k03;

    .line 27
    .line 28
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    new-instance v1, Ldefpackage/xj;

    .line 32
    .line 33
    invoke-direct {v1, v0, v3}, Ldefpackage/xj;-><init>(Ldefpackage/k03;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v6, p1, v1}, Ldefpackage/cl4;->c(Ljava/util/List;Ldefpackage/xj;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-object p1, v6, Ldefpackage/cl4;->d:Ldefpackage/k03;

    .line 41
    .line 42
    new-instance v0, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1, v0}, Ldefpackage/ad2;->i(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :goto_0
    iget-object p1, v6, Ldefpackage/cl4;->c:Ldefpackage/pa;

    .line 51
    .line 52
    invoke-virtual {p1, v4, v5}, Ldefpackage/pa;->y(IZ)Ldefpackage/k03;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1, p0}, Ldefpackage/ad2;->j(Ldefpackage/a83;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 61
    .line 62
    check-cast v6, Ldefpackage/bl4;

    .line 63
    .line 64
    if-eqz p1, :cond_1

    .line 65
    .line 66
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_1

    .line 71
    .line 72
    iget-object v0, v6, Ldefpackage/bl4;->d:Ldefpackage/k03;

    .line 73
    .line 74
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    new-instance v1, Ldefpackage/xj;

    .line 78
    .line 79
    const/4 v2, 0x2

    .line 80
    invoke-direct {v1, v0, v2}, Ldefpackage/xj;-><init>(Ldefpackage/k03;I)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v6, p1, v1}, Ldefpackage/bl4;->c(Ljava/util/List;Ldefpackage/xj;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_1
    iget-object p1, v6, Ldefpackage/bl4;->d:Ldefpackage/k03;

    .line 88
    .line 89
    new-instance v0, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v0}, Ldefpackage/ad2;->i(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :goto_1
    iget-object p1, v6, Ldefpackage/bl4;->c:Ldefpackage/rv2;

    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-static {v4, v5}, Ldefpackage/rv2;->o(IZ)Ldefpackage/k03;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p1, p0}, Ldefpackage/ad2;->j(Ldefpackage/a83;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :pswitch_1
    check-cast p1, Ljava/util/List;

    .line 111
    .line 112
    check-cast v6, Ldefpackage/vb4;

    .line 113
    .line 114
    const-string p0, "active_music_folder_id"

    .line 115
    .line 116
    invoke-virtual {v6, p0}, Ldefpackage/kp3;->h0(Ljava/lang/String;)Landroidx/preference/Preference;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    check-cast p0, Landroidx/preference/ListPreference;

    .line 121
    .line 122
    if-eqz p0, :cond_7

    .line 123
    .line 124
    if-nez p1, :cond_2

    .line 125
    .line 126
    goto/16 :goto_4

    .line 127
    .line 128
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 129
    .line 130
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 131
    .line 132
    .line 133
    new-instance v1, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 136
    .line 137
    .line 138
    const v3, 0x7f1304c4

    .line 139
    .line 140
    .line 141
    invoke-virtual {v6, v3}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    const-string v3, "default"

    .line 149
    .line 150
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    new-instance v4, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    if-eqz v7, :cond_5

    .line 167
    .line 168
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    check-cast v7, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;

    .line 173
    .line 174
    invoke-virtual {v7}, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;->getId()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    if-nez v8, :cond_3

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_3
    invoke-virtual {v7}, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;->getId()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    invoke-virtual {v7}, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;->getName()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    if-eqz v8, :cond_4

    .line 193
    .line 194
    invoke-virtual {v7}, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;->getName()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    goto :goto_3

    .line 199
    :cond_4
    invoke-virtual {v7}, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;->getId()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    :goto_3
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    invoke-virtual {v7}, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;->getId()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    goto :goto_2

    .line 214
    :cond_5
    new-array p1, v5, [Ljava/lang/CharSequence;

    .line 215
    .line 216
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    check-cast p1, [Ljava/lang/CharSequence;

    .line 221
    .line 222
    invoke-virtual {p0, p1}, Landroidx/preference/ListPreference;->G([Ljava/lang/CharSequence;)V

    .line 223
    .line 224
    .line 225
    new-array p1, v5, [Ljava/lang/CharSequence;

    .line 226
    .line 227
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    check-cast p1, [Ljava/lang/CharSequence;

    .line 232
    .line 233
    iput-object p1, p0, Landroidx/preference/ListPreference;->i0:[Ljava/lang/CharSequence;

    .line 234
    .line 235
    invoke-static {}, Ldefpackage/ud3;->k()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    if-eqz p1, :cond_6

    .line 240
    .line 241
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-nez v0, :cond_6

    .line 246
    .line 247
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    if-nez p1, :cond_6

    .line 252
    .line 253
    invoke-virtual {p0, v3}, Landroidx/preference/ListPreference;->H(Ljava/lang/String;)V

    .line 254
    .line 255
    .line 256
    iget-object p1, v6, Ldefpackage/vb4;->v0:Ldefpackage/vf2;

    .line 257
    .line 258
    invoke-virtual {p1, v2}, Ldefpackage/vf2;->d(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    :cond_6
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    iput-object p1, v6, Ldefpackage/vb4;->C0:Ljava/lang/Integer;

    .line 270
    .line 271
    invoke-virtual {v6}, Ldefpackage/vb4;->l0()V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v6, p0}, Ldefpackage/vb4;->s0(Landroidx/preference/ListPreference;)V

    .line 275
    .line 276
    .line 277
    :cond_7
    :goto_4
    return-void

    .line 278
    :pswitch_2
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;

    .line 279
    .line 280
    check-cast v6, Ldefpackage/xi3;

    .line 281
    .line 282
    iget-object v0, v6, Ldefpackage/xi3;->p0:Ldefpackage/aj3;

    .line 283
    .line 284
    invoke-virtual {v0}, Ldefpackage/aj3;->c()Ldefpackage/k03;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-virtual {v0, p0}, Ldefpackage/ad2;->j(Ldefpackage/a83;)V

    .line 289
    .line 290
    .line 291
    iget-object v0, v6, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 292
    .line 293
    if-eqz v0, :cond_a

    .line 294
    .line 295
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    iget-boolean v0, v0, Ldefpackage/v52;->a:Z

    .line 300
    .line 301
    if-eqz v0, :cond_8

    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_8
    if-eqz p1, :cond_9

    .line 305
    .line 306
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->getEntries()Ljava/util/List;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    if-eqz v0, :cond_9

    .line 311
    .line 312
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->getEntries()Ljava/util/List;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    if-nez v0, :cond_9

    .line 321
    .line 322
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->getEntries()Ljava/util/List;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 327
    .line 328
    .line 329
    move-result v0

    .line 330
    invoke-static {v5, v0}, Ljava/util/stream/IntStream;->range(II)Ljava/util/stream/IntStream;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    new-instance v1, Ldefpackage/vi3;

    .line 335
    .line 336
    invoke-direct {v1, p1}, Ldefpackage/vi3;-><init>(Lcom/eddyizm/tempus/subsonic/models/PlayQueue;)V

    .line 337
    .line 338
    .line 339
    invoke-interface {v0, v1}, Ljava/util/stream/IntStream;->filter(Ljava/util/function/IntPredicate;)Ljava/util/stream/IntStream;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-interface {v0}, Ljava/util/stream/IntStream;->findFirst()Ljava/util/OptionalInt;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-virtual {v0, v4}, Ljava/util/OptionalInt;->orElse(I)I

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    if-eq v0, v4, :cond_a

    .line 352
    .line 353
    iget-object v1, v6, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 354
    .line 355
    iget-object v1, v1, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v1, Ldefpackage/ae1;

    .line 358
    .line 359
    iget-object v1, v1, Ldefpackage/ae1;->e:Landroid/view/View;

    .line 360
    .line 361
    check-cast v1, Landroid/widget/ImageButton;

    .line 362
    .line 363
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 364
    .line 365
    .line 366
    iget-object v1, v6, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 367
    .line 368
    iget-object v1, v1, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 369
    .line 370
    check-cast v1, Ldefpackage/ae1;

    .line 371
    .line 372
    iget-object v1, v1, Ldefpackage/ae1;->e:Landroid/view/View;

    .line 373
    .line 374
    check-cast v1, Landroid/widget/ImageButton;

    .line 375
    .line 376
    new-instance v2, Ldefpackage/wi3;

    .line 377
    .line 378
    invoke-direct {v2, p0, p1, v0, v5}, Ldefpackage/wi3;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 382
    .line 383
    .line 384
    goto :goto_5

    .line 385
    :cond_9
    iget-object p0, v6, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 386
    .line 387
    iget-object p0, p0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast p0, Ldefpackage/ae1;

    .line 390
    .line 391
    iget-object p0, p0, Ldefpackage/ae1;->e:Landroid/view/View;

    .line 392
    .line 393
    check-cast p0, Landroid/widget/ImageButton;

    .line 394
    .line 395
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 396
    .line 397
    .line 398
    iget-object p0, v6, Ldefpackage/xi3;->o0:Ldefpackage/ns3;

    .line 399
    .line 400
    iget-object p0, p0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast p0, Ldefpackage/ae1;

    .line 403
    .line 404
    iget-object p0, p0, Ldefpackage/ae1;->e:Landroid/view/View;

    .line 405
    .line 406
    check-cast p0, Landroid/widget/ImageButton;

    .line 407
    .line 408
    invoke-virtual {p0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 409
    .line 410
    .line 411
    :cond_a
    :goto_5
    return-void

    .line 412
    :pswitch_3
    check-cast p1, Ljava/util/List;

    .line 413
    .line 414
    check-cast v6, Ldefpackage/i4;

    .line 415
    .line 416
    iget-object v0, v6, Ldefpackage/i4;->o:Ljava/lang/Object;

    .line 417
    .line 418
    check-cast v0, Ldefpackage/cp1;

    .line 419
    .line 420
    if-eqz p1, :cond_f

    .line 421
    .line 422
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 423
    .line 424
    .line 425
    move-result v2

    .line 426
    if-nez v2, :cond_f

    .line 427
    .line 428
    invoke-static {}, Ldefpackage/ud3;->o()Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    if-nez v2, :cond_c

    .line 433
    .line 434
    invoke-virtual {v0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    invoke-static {v2}, Ldefpackage/au0;->w(Landroid/content/Context;)Ldefpackage/eu0;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 443
    .line 444
    .line 445
    move-result-object p1

    .line 446
    move v3, v5

    .line 447
    :cond_b
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 448
    .line 449
    .line 450
    move-result v4

    .line 451
    if-eqz v4, :cond_e

    .line 452
    .line 453
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v4

    .line 457
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 458
    .line 459
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v6

    .line 463
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    invoke-static {v6}, Ldefpackage/eu0;->d(Ljava/lang/String;)Z

    .line 467
    .line 468
    .line 469
    move-result v6

    .line 470
    if-nez v6, :cond_b

    .line 471
    .line 472
    invoke-static {v4}, Ldefpackage/gi1;->G(Lcom/eddyizm/tempus/subsonic/models/Child;)Ldefpackage/gn2;

    .line 473
    .line 474
    .line 475
    move-result-object v6

    .line 476
    new-instance v7, Lcom/eddyizm/tempus/model/Download;

    .line 477
    .line 478
    invoke-direct {v7, v4}, Lcom/eddyizm/tempus/model/Download;-><init>(Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 479
    .line 480
    .line 481
    invoke-virtual {v2, v6, v7, v5}, Ldefpackage/eu0;->b(Ldefpackage/gn2;Lcom/eddyizm/tempus/model/Download;Z)Z

    .line 482
    .line 483
    .line 484
    add-int/lit8 v3, v3, 0x1

    .line 485
    .line 486
    goto :goto_6

    .line 487
    :cond_c
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 488
    .line 489
    .line 490
    move-result-object p1

    .line 491
    move v3, v5

    .line 492
    :cond_d
    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 493
    .line 494
    .line 495
    move-result v2

    .line 496
    if-eqz v2, :cond_e

    .line 497
    .line 498
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v2

    .line 502
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 503
    .line 504
    invoke-static {v2}, Ldefpackage/g51;->e(Lcom/eddyizm/tempus/subsonic/models/Child;)Landroid/net/Uri;

    .line 505
    .line 506
    .line 507
    move-result-object v4

    .line 508
    if-nez v4, :cond_d

    .line 509
    .line 510
    invoke-virtual {v0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 511
    .line 512
    .line 513
    move-result-object v4

    .line 514
    invoke-static {v4, v2}, Ldefpackage/i51;->a(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 515
    .line 516
    .line 517
    add-int/lit8 v3, v3, 0x1

    .line 518
    .line 519
    goto :goto_7

    .line 520
    :cond_e
    if-lez v3, :cond_f

    .line 521
    .line 522
    invoke-virtual {v0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 523
    .line 524
    .line 525
    move-result-object p1

    .line 526
    invoke-virtual {v0}, Ldefpackage/kc1;->r()Landroid/content/res/Resources;

    .line 527
    .line 528
    .line 529
    move-result-object v2

    .line 530
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 531
    .line 532
    .line 533
    move-result-object v4

    .line 534
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v4

    .line 538
    const v6, 0x7f120010

    .line 539
    .line 540
    .line 541
    invoke-virtual {v2, v6, v3, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    invoke-static {p1, v2, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 546
    .line 547
    .line 548
    move-result-object p1

    .line 549
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 550
    .line 551
    .line 552
    :cond_f
    iget-object p1, v0, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 553
    .line 554
    iget-object p1, p1, Ldefpackage/tc1;->H:Lcom/google/android/material/card/MaterialCardView;

    .line 555
    .line 556
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v0}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 560
    .line 561
    .line 562
    move-result-object p1

    .line 563
    if-eqz p1, :cond_10

    .line 564
    .line 565
    invoke-virtual {v0}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 566
    .line 567
    .line 568
    move-result-object p1

    .line 569
    new-instance v0, Ldefpackage/qa1;

    .line 570
    .line 571
    const/4 v1, 0x6

    .line 572
    invoke-direct {v0, v1, p0}, Ldefpackage/qa1;-><init>(ILjava/lang/Object;)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 576
    .line 577
    .line 578
    :cond_10
    return-void

    .line 579
    :pswitch_4
    check-cast p1, Ldefpackage/ba2;

    .line 580
    .line 581
    check-cast v6, Ldefpackage/pp0;

    .line 582
    .line 583
    if-eqz p1, :cond_13

    .line 584
    .line 585
    iget-boolean p1, v6, Ldefpackage/pp0;->s0:Z

    .line 586
    .line 587
    if-eqz p1, :cond_13

    .line 588
    .line 589
    invoke-virtual {v6}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 590
    .line 591
    .line 592
    move-result-object p1

    .line 593
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    if-nez v0, :cond_12

    .line 598
    .line 599
    iget-object v0, v6, Ldefpackage/pp0;->w0:Landroid/app/Dialog;

    .line 600
    .line 601
    if-eqz v0, :cond_13

    .line 602
    .line 603
    invoke-static {v3}, Ldefpackage/ld1;->I(I)Z

    .line 604
    .line 605
    .line 606
    move-result v0

    .line 607
    if-eqz v0, :cond_11

    .line 608
    .line 609
    new-instance v0, Ljava/lang/StringBuilder;

    .line 610
    .line 611
    const-string v1, "DialogFragment "

    .line 612
    .line 613
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 617
    .line 618
    .line 619
    const-string p0, " setting the content view on "

    .line 620
    .line 621
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 622
    .line 623
    .line 624
    iget-object p0, v6, Ldefpackage/pp0;->w0:Landroid/app/Dialog;

    .line 625
    .line 626
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 627
    .line 628
    .line 629
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object p0

    .line 633
    const-string v0, "FragmentManager"

    .line 634
    .line 635
    invoke-static {v0, p0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 636
    .line 637
    .line 638
    :cond_11
    iget-object p0, v6, Ldefpackage/pp0;->w0:Landroid/app/Dialog;

    .line 639
    .line 640
    invoke-virtual {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 641
    .line 642
    .line 643
    goto :goto_8

    .line 644
    :cond_12
    const-string p0, "DialogFragment can not be attached to a container view"

    .line 645
    .line 646
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    :cond_13
    :goto_8
    return-void

    .line 650
    nop

    .line 651
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
