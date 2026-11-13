.class public final synthetic Ldefpackage/so1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/av4;


# instance fields
.field public final synthetic n:Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

.field public final synthetic o:Ldefpackage/rm3;

.field public final synthetic p:Ldefpackage/ni4;

.field public final synthetic q:Z

.field public final synthetic r:Ldefpackage/si4;

.field public final synthetic s:Landroid/content/Context;

.field public final synthetic t:Ldefpackage/ei4;

.field public final synthetic u:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;Ldefpackage/rm3;Ldefpackage/ni4;ZLdefpackage/si4;Landroid/content/Context;Ldefpackage/ei4;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/so1;->n:Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/so1;->o:Ldefpackage/rm3;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/so1;->p:Ldefpackage/ni4;

    .line 9
    .line 10
    iput-boolean p4, p0, Ldefpackage/so1;->q:Z

    .line 11
    .line 12
    iput-object p5, p0, Ldefpackage/so1;->r:Ldefpackage/si4;

    .line 13
    .line 14
    iput-object p6, p0, Ldefpackage/so1;->s:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p7, p0, Ldefpackage/so1;->t:Ldefpackage/ei4;

    .line 17
    .line 18
    iput-object p8, p0, Ldefpackage/so1;->u:Ljava/lang/String;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 13

    .line 1
    iget-object v0, p0, Ldefpackage/so1;->o:Ldefpackage/rm3;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    iget-object v2, p0, Ldefpackage/so1;->t:Ldefpackage/ei4;

    .line 8
    .line 9
    iget-object v2, v2, Ldefpackage/ei4;->b:Ldefpackage/kc1;

    .line 10
    .line 11
    check-cast v2, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

    .line 12
    .line 13
    iget-object v3, p0, Ldefpackage/so1;->p:Ldefpackage/ni4;

    .line 14
    .line 15
    invoke-static {v0, v3}, Ldefpackage/jz4;->g(Ldefpackage/rm3;Ldefpackage/ni4;)Ljava/util/ArrayList;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    new-instance v5, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    const/4 v7, 0x0

    .line 29
    move v8, v7

    .line 30
    :cond_0
    :goto_0
    if-ge v8, v6, :cond_1

    .line 31
    .line 32
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v9

    .line 36
    add-int/lit8 v8, v8, 0x1

    .line 37
    .line 38
    move-object v10, v9

    .line 39
    check-cast v10, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 40
    .line 41
    invoke-virtual {v10}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v10

    .line 45
    invoke-static {v10}, Ldefpackage/ot1;->c(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v10

    .line 49
    if-nez v10, :cond_0

    .line 50
    .line 51
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    iget-object v6, p0, Ldefpackage/so1;->n:Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

    .line 56
    .line 57
    invoke-virtual {v6}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    instance-of v9, v8, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 62
    .line 63
    const/4 v10, 0x0

    .line 64
    if-eqz v9, :cond_2

    .line 65
    .line 66
    check-cast v8, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    move-object v8, v10

    .line 70
    :goto_1
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    const v11, 0x7f0a02de

    .line 75
    .line 76
    .line 77
    const/4 v12, 0x1

    .line 78
    if-ne v9, v11, :cond_9

    .line 79
    .line 80
    iget-object p0, v3, Ldefpackage/ni4;->v:Ldefpackage/pk;

    .line 81
    .line 82
    iget-object p0, p0, Ldefpackage/pk;->f:Ljava/util/List;

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    if-nez p1, :cond_6

    .line 92
    .line 93
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_3

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_5

    .line 109
    .line 110
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 115
    .line 116
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-nez v2, :cond_4

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :cond_5
    :goto_2
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    if-eqz p1, :cond_7

    .line 139
    .line 140
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 145
    .line 146
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_6
    :goto_4
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    if-eqz p1, :cond_7

    .line 163
    .line 164
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 169
    .line 170
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    goto :goto_5

    .line 178
    :cond_7
    iget-object p0, v0, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast p0, Ldefpackage/vo1;

    .line 181
    .line 182
    if-eqz p0, :cond_8

    .line 183
    .line 184
    invoke-virtual {p0}, Ldefpackage/vo1;->invoke()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    :cond_8
    return v12

    .line 188
    :cond_9
    const v1, 0x7f0a02e0

    .line 189
    .line 190
    .line 191
    iget-object v11, p0, Ldefpackage/so1;->s:Landroid/content/Context;

    .line 192
    .line 193
    if-ne v9, v1, :cond_f

    .line 194
    .line 195
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    if-eqz p1, :cond_a

    .line 200
    .line 201
    goto :goto_7

    .line 202
    :cond_a
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    move v1, v7

    .line 207
    :cond_b
    if-ge v1, p1, :cond_e

    .line 208
    .line 209
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    add-int/lit8 v1, v1, 0x1

    .line 214
    .line 215
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 216
    .line 217
    invoke-static {v2}, Ldefpackage/jz4;->C(Lcom/eddyizm/tempus/subsonic/models/Child;)Z

    .line 218
    .line 219
    .line 220
    move-result v2

    .line 221
    if-nez v2, :cond_b

    .line 222
    .line 223
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    new-instance p0, Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    :cond_c
    :goto_6
    if-ge v7, p1, :cond_d

    .line 236
    .line 237
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    add-int/lit8 v7, v7, 0x1

    .line 242
    .line 243
    move-object v2, v1

    .line 244
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 245
    .line 246
    invoke-static {v2}, Ldefpackage/jz4;->C(Lcom/eddyizm/tempus/subsonic/models/Child;)Z

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    if-nez v2, :cond_c

    .line 251
    .line 252
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    goto :goto_6

    .line 256
    :cond_d
    invoke-static {v11, p0, v12}, Ldefpackage/jz4;->J(Landroid/content/Context;Ljava/util/List;Z)V

    .line 257
    .line 258
    .line 259
    goto :goto_8

    .line 260
    :cond_e
    :goto_7
    iget-boolean p1, p0, Ldefpackage/so1;->q:Z

    .line 261
    .line 262
    iget-object p0, p0, Ldefpackage/so1;->r:Ldefpackage/si4;

    .line 263
    .line 264
    invoke-static {v6, v3, v4, p1, p0}, Ldefpackage/jz4;->P(Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;Ldefpackage/ni4;Ljava/util/List;ZLdefpackage/si4;)V

    .line 265
    .line 266
    .line 267
    :goto_8
    invoke-virtual {v0}, Ldefpackage/rm3;->z()V

    .line 268
    .line 269
    .line 270
    return v12

    .line 271
    :cond_f
    const v1, 0x7f0a02e1

    .line 272
    .line 273
    .line 274
    if-ne v9, v1, :cond_11

    .line 275
    .line 276
    iget-object p1, v2, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->q0:Ldefpackage/bl2;

    .line 277
    .line 278
    iget-object p0, p0, Ldefpackage/so1;->u:Ljava/lang/String;

    .line 279
    .line 280
    invoke-static {p1, v4, v7, p0}, Ldefpackage/bo2;->q(Ldefpackage/ic2;Ljava/util/List;ILjava/lang/String;)V

    .line 281
    .line 282
    .line 283
    if-eqz v8, :cond_10

    .line 284
    .line 285
    iget-object p0, v8, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Ldefpackage/zg5;

    .line 286
    .line 287
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast p0, Ldefpackage/au;

    .line 290
    .line 291
    invoke-virtual {p0, v12}, Ldefpackage/au;->d(Z)V

    .line 292
    .line 293
    .line 294
    :cond_10
    invoke-virtual {v0}, Ldefpackage/rm3;->z()V

    .line 295
    .line 296
    .line 297
    return v12

    .line 298
    :cond_11
    const p0, 0x7f0a02e2

    .line 299
    .line 300
    .line 301
    if-eq v9, p0, :cond_1a

    .line 302
    .line 303
    const v1, 0x7f0a02e4

    .line 304
    .line 305
    .line 306
    if-ne v9, v1, :cond_12

    .line 307
    .line 308
    goto/16 :goto_b

    .line 309
    .line 310
    :cond_12
    const p0, 0x7f0a02e3

    .line 311
    .line 312
    .line 313
    if-ne v9, p0, :cond_13

    .line 314
    .line 315
    new-instance p0, Ldefpackage/fl3;

    .line 316
    .line 317
    invoke-direct {p0}, Ldefpackage/fl3;-><init>()V

    .line 318
    .line 319
    .line 320
    new-instance p1, Landroid/os/Bundle;

    .line 321
    .line 322
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 323
    .line 324
    .line 325
    new-instance v1, Ljava/util/ArrayList;

    .line 326
    .line 327
    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 328
    .line 329
    .line 330
    const-string v2, "TRACKS_OBJECT"

    .line 331
    .line 332
    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {p0, p1}, Ldefpackage/kc1;->c0(Landroid/os/Bundle;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v6}, Ldefpackage/kc1;->q()Ldefpackage/ld1;

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    invoke-virtual {p0, p1, v10}, Ldefpackage/pp0;->m0(Ldefpackage/ld1;Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0}, Ldefpackage/rm3;->z()V

    .line 346
    .line 347
    .line 348
    return v12

    .line 349
    :cond_13
    const p0, 0x7f0a02df

    .line 350
    .line 351
    .line 352
    if-ne v9, p0, :cond_16

    .line 353
    .line 354
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    new-instance p0, Ljava/util/ArrayList;

    .line 358
    .line 359
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 363
    .line 364
    .line 365
    move-result p1

    .line 366
    :cond_14
    :goto_9
    if-ge v7, p1, :cond_15

    .line 367
    .line 368
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    add-int/lit8 v7, v7, 0x1

    .line 373
    .line 374
    move-object v2, v1

    .line 375
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 376
    .line 377
    invoke-static {v11, v2}, Ldefpackage/jz4;->D(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;)Z

    .line 378
    .line 379
    .line 380
    move-result v2

    .line 381
    if-nez v2, :cond_14

    .line 382
    .line 383
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    goto :goto_9

    .line 387
    :cond_15
    invoke-static {v11, p0}, Ldefpackage/jz4;->p(Landroid/content/Context;Ljava/util/ArrayList;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v0}, Ldefpackage/rm3;->z()V

    .line 391
    .line 392
    .line 393
    return v12

    .line 394
    :cond_16
    const p0, 0x7f0a02e5

    .line 395
    .line 396
    .line 397
    if-ne v9, p0, :cond_19

    .line 398
    .line 399
    new-instance p0, Ljava/util/ArrayList;

    .line 400
    .line 401
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 405
    .line 406
    .line 407
    move-result p1

    .line 408
    move v1, v7

    .line 409
    :cond_17
    :goto_a
    if-ge v1, p1, :cond_18

    .line 410
    .line 411
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v2

    .line 415
    add-int/lit8 v1, v1, 0x1

    .line 416
    .line 417
    move-object v3, v2

    .line 418
    check-cast v3, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 419
    .line 420
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 421
    .line 422
    .line 423
    invoke-static {v11, v3}, Ldefpackage/jz4;->D(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;)Z

    .line 424
    .line 425
    .line 426
    move-result v3

    .line 427
    if-eqz v3, :cond_17

    .line 428
    .line 429
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    goto :goto_a

    .line 433
    :cond_18
    new-instance p1, Ldefpackage/vg2;

    .line 434
    .line 435
    invoke-direct {p1, v11, v7}, Ldefpackage/vg2;-><init>(Landroid/content/Context;I)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v11}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 439
    .line 440
    .line 441
    move-result-object v1

    .line 442
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 443
    .line 444
    .line 445
    move-result v2

    .line 446
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 447
    .line 448
    .line 449
    move-result v3

    .line 450
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 451
    .line 452
    .line 453
    move-result-object v3

    .line 454
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v3

    .line 458
    const v4, 0x7f120007

    .line 459
    .line 460
    .line 461
    invoke-virtual {v1, v4, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    invoke-virtual {p1, v1}, Ldefpackage/vg2;->o(Ljava/lang/CharSequence;)Ldefpackage/vg2;

    .line 466
    .line 467
    .line 468
    move-result-object p1

    .line 469
    const v1, 0x7f130205

    .line 470
    .line 471
    .line 472
    invoke-virtual {p1, v1}, Ldefpackage/vg2;->i(I)V

    .line 473
    .line 474
    .line 475
    new-instance v1, Ldefpackage/rn1;

    .line 476
    .line 477
    invoke-direct {v1, v11, p0, v0, v12}, Ldefpackage/rn1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 478
    .line 479
    .line 480
    const p0, 0x7f130206

    .line 481
    .line 482
    .line 483
    invoke-virtual {p1, p0, v1}, Ldefpackage/vg2;->l(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/vg2;

    .line 484
    .line 485
    .line 486
    move-result-object p0

    .line 487
    const p1, 0x7f13019f

    .line 488
    .line 489
    .line 490
    invoke-virtual {p0, p1, v10}, Ldefpackage/vg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/vg2;

    .line 491
    .line 492
    .line 493
    move-result-object p0

    .line 494
    invoke-virtual {p0}, Ldefpackage/e9;->h()Ldefpackage/f9;

    .line 495
    .line 496
    .line 497
    return v12

    .line 498
    :cond_19
    return v7

    .line 499
    :cond_1a
    :goto_b
    iget-object v1, v2, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->q0:Ldefpackage/bl2;

    .line 500
    .line 501
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 502
    .line 503
    .line 504
    move-result p1

    .line 505
    if-ne p1, p0, :cond_1b

    .line 506
    .line 507
    move v7, v12

    .line 508
    :cond_1b
    invoke-static {v1, v4, v7}, Ldefpackage/bo2;->e(Ldefpackage/ic2;Ljava/util/List;Z)V

    .line 509
    .line 510
    .line 511
    if-eqz v8, :cond_1c

    .line 512
    .line 513
    iget-object p0, v8, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Ldefpackage/zg5;

    .line 514
    .line 515
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 516
    .line 517
    check-cast p0, Ldefpackage/au;

    .line 518
    .line 519
    invoke-virtual {p0, v12}, Ldefpackage/au;->d(Z)V

    .line 520
    .line 521
    .line 522
    :cond_1c
    invoke-virtual {v0}, Ldefpackage/rm3;->z()V

    .line 523
    .line 524
    .line 525
    return v12
.end method
