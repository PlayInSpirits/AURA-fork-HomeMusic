.class public final synthetic Ldefpackage/k6;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 13
    iput p1, p0, Ldefpackage/k6;->n:I

    iput-object p2, p0, Ldefpackage/k6;->o:Ljava/lang/Object;

    iput-object p3, p0, Ldefpackage/k6;->p:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/ArrayList;Ldefpackage/pj4;Ldefpackage/xm0;)V
    .locals 0

    .line 1
    const/16 p3, 0x14

    .line 2
    .line 3
    iput p3, p0, Ldefpackage/k6;->n:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p2, p0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ldefpackage/k6;->n:I

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const/4 v4, -0x1

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x1

    .line 10
    const/4 v7, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Ldefpackage/fx3;

    .line 17
    .line 18
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 19
    .line 20
    move-object v2, v0

    .line 21
    check-cast v2, Ljava/lang/String;

    .line 22
    .line 23
    sget-object v0, Ldefpackage/ur1;->a:Ljava/util/concurrent/ExecutorService;

    .line 24
    .line 25
    iget-boolean v0, v1, Ldefpackage/fx3;->n:Z

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-static {v2}, Ldefpackage/ur1;->d(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    :try_start_0
    invoke-static {}, Ldefpackage/rs1;->f()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v2}, Ldefpackage/rr1;->x(Ljava/lang/String;)Ljava/util/Map;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Ljava/lang/Iterable;

    .line 46
    .line 47
    invoke-static {v1}, Ldefpackage/q40;->v0(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    check-cast v1, Ljava/util/Map$Entry;

    .line 52
    .line 53
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Ljava/lang/String;

    .line 58
    .line 59
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    check-cast v1, Ljava/lang/String;

    .line 64
    .line 65
    new-instance v4, Ldefpackage/qs0;

    .line 66
    .line 67
    invoke-direct {v4, v3, v1, v0, v6}, Ldefpackage/qs0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Ldefpackage/or1;

    .line 71
    .line 72
    const/16 v1, 0x13

    .line 73
    .line 74
    invoke-direct {v0, v1}, Ldefpackage/or1;-><init>(I)V

    .line 75
    .line 76
    .line 77
    invoke-static {v4, v0}, Ldefpackage/rr1;->d(Ldefpackage/if1;Ldefpackage/if1;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catch_0
    move-exception v0

    .line 82
    const-string v1, "HubDislikes"

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    new-instance v3, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v4, "undislike "

    .line 91
    .line 92
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    const-string v4, ": "

    .line 99
    .line 100
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-static {v1, v0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    invoke-static {v2}, Ldefpackage/ur1;->d(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :goto_0
    return-void

    .line 117
    :pswitch_0
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v1, Ljava/lang/String;

    .line 120
    .line 121
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast v0, Ldefpackage/ic2;

    .line 124
    .line 125
    :try_start_1
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    check-cast v0, Ldefpackage/bj2;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :catchall_0
    move-exception v0

    .line 133
    new-instance v2, Ldefpackage/s14;

    .line 134
    .line 135
    invoke-direct {v2, v0}, Ldefpackage/s14;-><init>(Ljava/lang/Throwable;)V

    .line 136
    .line 137
    .line 138
    move-object v0, v2

    .line 139
    :goto_1
    nop

    .line 140
    instance-of v2, v0, Ldefpackage/s14;

    .line 141
    .line 142
    if-eqz v2, :cond_1

    .line 143
    .line 144
    move-object v0, v5

    .line 145
    :cond_1
    check-cast v0, Ldefpackage/bj2;

    .line 146
    .line 147
    if-nez v0, :cond_2

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_2
    invoke-virtual {v0}, Ldefpackage/sk2;->a()Ldefpackage/gn2;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    if-eqz v2, :cond_3

    .line 155
    .line 156
    iget-object v5, v2, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 157
    .line 158
    :cond_3
    invoke-static {v5, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-nez v1, :cond_4

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_4
    invoke-virtual {v0}, Ldefpackage/sk2;->f0()Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-eqz v1, :cond_5

    .line 170
    .line 171
    invoke-virtual {v0}, Ldefpackage/sk2;->c0()V

    .line 172
    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_5
    invoke-virtual {v0}, Ldefpackage/sk2;->c()V

    .line 176
    .line 177
    .line 178
    :goto_2
    return-void

    .line 179
    :pswitch_1
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v1, Ldefpackage/cp1;

    .line 182
    .line 183
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 186
    .line 187
    iget-object v2, v1, Ldefpackage/cp1;->l0:Ldefpackage/tc1;

    .line 188
    .line 189
    if-eqz v2, :cond_7

    .line 190
    .line 191
    invoke-virtual {v1}, Ldefpackage/kc1;->y()Z

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    if-nez v2, :cond_6

    .line 196
    .line 197
    goto :goto_3

    .line 198
    :cond_6
    iget-object v2, v1, Ldefpackage/cp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 199
    .line 200
    iget-object v2, v2, Lcom/eddyizm/tempus/ui/activity/MainActivity;->R:Ldefpackage/qp4;

    .line 201
    .line 202
    iget-object v2, v2, Ldefpackage/qp4;->c:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v2, Landroid/widget/FrameLayout;

    .line 205
    .line 206
    sget-object v3, Ldefpackage/qg4;->E:[I

    .line 207
    .line 208
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    const v4, 0x7f130058

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-static {v2, v3, v7}, Ldefpackage/qg4;->h(Landroid/view/View;Ljava/lang/CharSequence;I)Ldefpackage/qg4;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    iget-object v3, v1, Ldefpackage/cp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 224
    .line 225
    invoke-virtual {v3}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->u()Landroid/widget/FrameLayout;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    invoke-virtual {v2, v3}, Ldefpackage/fr;->e(Landroid/widget/FrameLayout;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2}, Ldefpackage/qg4;->j()V

    .line 233
    .line 234
    .line 235
    iget-object v2, v1, Ldefpackage/cp1;->F0:Ldefpackage/bl2;

    .line 236
    .line 237
    if-eqz v2, :cond_7

    .line 238
    .line 239
    iget-object v2, v1, Ldefpackage/cp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 240
    .line 241
    invoke-virtual {v1}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    iget-object v4, v2, Lcom/eddyizm/tempus/viewmodel/b;->z:Ldefpackage/k03;

    .line 246
    .line 247
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 248
    .line 249
    invoke-virtual {v4, v5}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    iget-object v2, v2, Lcom/eddyizm/tempus/viewmodel/b;->e:Ldefpackage/pa;

    .line 253
    .line 254
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    const/16 v2, 0xa

    .line 262
    .line 263
    invoke-static {v2, v0}, Ldefpackage/pa;->z(ILjava/lang/String;)Ldefpackage/k03;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    new-instance v2, Ldefpackage/g7;

    .line 268
    .line 269
    invoke-direct {v2, v4, v7}, Ldefpackage/g7;-><init>(Ldefpackage/k03;I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v0, v3, v2}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v1}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    new-instance v2, Ldefpackage/xo1;

    .line 280
    .line 281
    const/16 v3, 0x15

    .line 282
    .line 283
    invoke-direct {v2, v1, v3}, Ldefpackage/xo1;-><init>(Ldefpackage/cp1;I)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v4, v0, v2}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 287
    .line 288
    .line 289
    :cond_7
    :goto_3
    return-void

    .line 290
    :pswitch_2
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v1, Ldefpackage/cp1;

    .line 293
    .line 294
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 295
    .line 296
    move-object v2, v0

    .line 297
    check-cast v2, Landroid/view/View;

    .line 298
    .line 299
    :try_start_2
    new-instance v0, Ldefpackage/or1;

    .line 300
    .line 301
    invoke-direct {v0, v7}, Ldefpackage/or1;-><init>(I)V

    .line 302
    .line 303
    .line 304
    new-instance v3, Ldefpackage/or1;

    .line 305
    .line 306
    invoke-direct {v3, v6}, Ldefpackage/or1;-><init>(I)V

    .line 307
    .line 308
    .line 309
    invoke-static {v0, v3}, Ldefpackage/rr1;->d(Ldefpackage/if1;Ldefpackage/if1;)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubMixToday;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 314
    .line 315
    goto :goto_4

    .line 316
    :catchall_1
    move-exception v0

    .line 317
    new-instance v3, Ldefpackage/s14;

    .line 318
    .line 319
    invoke-direct {v3, v0}, Ldefpackage/s14;-><init>(Ljava/lang/Throwable;)V

    .line 320
    .line 321
    .line 322
    move-object v0, v3

    .line 323
    :goto_4
    invoke-static {v0}, Ldefpackage/bb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    if-eqz v3, :cond_8

    .line 328
    .line 329
    const-string v4, "HomeMixCards"

    .line 330
    .line 331
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    new-instance v6, Ljava/lang/StringBuilder;

    .line 336
    .line 337
    const-string v7, "mix: "

    .line 338
    .line 339
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    invoke-static {v4, v3}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 350
    .line 351
    .line 352
    :cond_8
    instance-of v3, v0, Ldefpackage/s14;

    .line 353
    .line 354
    if-eqz v3, :cond_9

    .line 355
    .line 356
    goto :goto_5

    .line 357
    :cond_9
    move-object v5, v0

    .line 358
    :goto_5
    check-cast v5, Lcom/eddyizm/tempus/homemusic/HubMixToday;

    .line 359
    .line 360
    sget-object v0, Ldefpackage/io1;->b:Landroid/os/Handler;

    .line 361
    .line 362
    new-instance v3, Ldefpackage/v6;

    .line 363
    .line 364
    const/16 v4, 0xd

    .line 365
    .line 366
    invoke-direct {v3, v1, v5, v2, v4}, Ldefpackage/v6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v0, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 370
    .line 371
    .line 372
    return-void

    .line 373
    :pswitch_3
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v1, Ldefpackage/ln1;

    .line 376
    .line 377
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v0, Ldefpackage/nm1;

    .line 380
    .line 381
    iget-object v1, v1, Ldefpackage/ln1;->p:Ldefpackage/om1;

    .line 382
    .line 383
    iget-object v0, v0, Ldefpackage/nm1;->m:Landroid/net/Uri;

    .line 384
    .line 385
    iget-object v1, v1, Ldefpackage/om1;->o:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast v1, Ldefpackage/pm1;

    .line 388
    .line 389
    iget-object v1, v1, Ldefpackage/pm1;->o:Ldefpackage/al0;

    .line 390
    .line 391
    iget-object v1, v1, Ldefpackage/al0;->q:Ljava/util/HashMap;

    .line 392
    .line 393
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    check-cast v0, Ldefpackage/zk0;

    .line 398
    .line 399
    invoke-virtual {v0, v6}, Ldefpackage/zk0;->d(Z)V

    .line 400
    .line 401
    .line 402
    return-void

    .line 403
    :pswitch_4
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 404
    .line 405
    move-object v8, v1

    .line 406
    check-cast v8, Ldefpackage/i41;

    .line 407
    .line 408
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast v0, Ldefpackage/n41;

    .line 411
    .line 412
    iget v1, v8, Ldefpackage/i41;->K:I

    .line 413
    .line 414
    iget v5, v0, Ldefpackage/n41;->b:I

    .line 415
    .line 416
    sub-int/2addr v1, v5

    .line 417
    iput v1, v8, Ldefpackage/i41;->K:I

    .line 418
    .line 419
    iget-boolean v5, v0, Ldefpackage/n41;->e:Z

    .line 420
    .line 421
    if-eqz v5, :cond_a

    .line 422
    .line 423
    iget v5, v0, Ldefpackage/n41;->c:I

    .line 424
    .line 425
    iput v5, v8, Ldefpackage/i41;->L:I

    .line 426
    .line 427
    iput-boolean v6, v8, Ldefpackage/i41;->M:Z

    .line 428
    .line 429
    :cond_a
    if-nez v1, :cond_16

    .line 430
    .line 431
    iget-object v1, v0, Ldefpackage/n41;->f:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast v1, Ldefpackage/ph3;

    .line 434
    .line 435
    iget-object v1, v1, Ldefpackage/ph3;->a:Ldefpackage/cu4;

    .line 436
    .line 437
    iget-object v5, v8, Ldefpackage/i41;->p0:Ldefpackage/ph3;

    .line 438
    .line 439
    iget-object v5, v5, Ldefpackage/ph3;->a:Ldefpackage/cu4;

    .line 440
    .line 441
    invoke-virtual {v5}, Ldefpackage/cu4;->p()Z

    .line 442
    .line 443
    .line 444
    move-result v5

    .line 445
    if-nez v5, :cond_b

    .line 446
    .line 447
    invoke-virtual {v1}, Ldefpackage/cu4;->p()Z

    .line 448
    .line 449
    .line 450
    move-result v5

    .line 451
    if-eqz v5, :cond_b

    .line 452
    .line 453
    iput v4, v8, Ldefpackage/i41;->q0:I

    .line 454
    .line 455
    iput-wide v2, v8, Ldefpackage/i41;->r0:J

    .line 456
    .line 457
    :cond_b
    invoke-virtual {v1}, Ldefpackage/cu4;->p()Z

    .line 458
    .line 459
    .line 460
    move-result v2

    .line 461
    if-nez v2, :cond_d

    .line 462
    .line 463
    move-object v2, v1

    .line 464
    check-cast v2, Ldefpackage/tm3;

    .line 465
    .line 466
    iget-object v2, v2, Ldefpackage/tm3;->k:[Ldefpackage/cu4;

    .line 467
    .line 468
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 473
    .line 474
    .line 475
    move-result v3

    .line 476
    iget-object v5, v8, Ldefpackage/i41;->q:Ljava/util/ArrayList;

    .line 477
    .line 478
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 479
    .line 480
    .line 481
    move-result v5

    .line 482
    if-ne v3, v5, :cond_c

    .line 483
    .line 484
    move v3, v6

    .line 485
    goto :goto_6

    .line 486
    :cond_c
    move v3, v7

    .line 487
    :goto_6
    invoke-static {v3}, Ldefpackage/rr2;->w(Z)V

    .line 488
    .line 489
    .line 490
    move v3, v7

    .line 491
    :goto_7
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 492
    .line 493
    .line 494
    move-result v5

    .line 495
    if-ge v3, v5, :cond_d

    .line 496
    .line 497
    iget-object v5, v8, Ldefpackage/i41;->q:Ljava/util/ArrayList;

    .line 498
    .line 499
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v5

    .line 503
    check-cast v5, Ldefpackage/f41;

    .line 504
    .line 505
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v9

    .line 509
    check-cast v9, Ldefpackage/cu4;

    .line 510
    .line 511
    iput-object v9, v5, Ldefpackage/f41;->c:Ldefpackage/cu4;

    .line 512
    .line 513
    add-int/lit8 v3, v3, 0x1

    .line 514
    .line 515
    goto :goto_7

    .line 516
    :cond_d
    iget-boolean v2, v8, Ldefpackage/i41;->M:Z

    .line 517
    .line 518
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    if-eqz v2, :cond_15

    .line 524
    .line 525
    iget-object v2, v0, Ldefpackage/n41;->f:Ljava/lang/Object;

    .line 526
    .line 527
    check-cast v2, Ldefpackage/ph3;

    .line 528
    .line 529
    iget-object v2, v2, Ldefpackage/ph3;->a:Ldefpackage/cu4;

    .line 530
    .line 531
    invoke-virtual {v2}, Ldefpackage/cu4;->p()Z

    .line 532
    .line 533
    .line 534
    move-result v2

    .line 535
    if-eqz v2, :cond_e

    .line 536
    .line 537
    iget-object v2, v8, Ldefpackage/i41;->p0:Ldefpackage/ph3;

    .line 538
    .line 539
    iget-object v2, v2, Ldefpackage/ph3;->a:Ldefpackage/cu4;

    .line 540
    .line 541
    invoke-virtual {v2}, Ldefpackage/cu4;->p()Z

    .line 542
    .line 543
    .line 544
    move-result v2

    .line 545
    if-eqz v2, :cond_e

    .line 546
    .line 547
    move v2, v6

    .line 548
    goto :goto_8

    .line 549
    :cond_e
    move v2, v7

    .line 550
    :goto_8
    iget-object v3, v0, Ldefpackage/n41;->f:Ljava/lang/Object;

    .line 551
    .line 552
    check-cast v3, Ldefpackage/ph3;

    .line 553
    .line 554
    iget-object v3, v3, Ldefpackage/ph3;->b:Ldefpackage/mt2;

    .line 555
    .line 556
    iget-object v5, v8, Ldefpackage/i41;->p0:Ldefpackage/ph3;

    .line 557
    .line 558
    iget-object v5, v5, Ldefpackage/ph3;->b:Ldefpackage/mt2;

    .line 559
    .line 560
    invoke-virtual {v3, v5}, Ldefpackage/mt2;->equals(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-result v3

    .line 564
    iget-object v5, v0, Ldefpackage/n41;->f:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast v5, Ldefpackage/ph3;

    .line 567
    .line 568
    iget-wide v11, v5, Ldefpackage/ph3;->d:J

    .line 569
    .line 570
    iget-object v5, v8, Ldefpackage/i41;->p0:Ldefpackage/ph3;

    .line 571
    .line 572
    iget-wide v13, v5, Ldefpackage/ph3;->s:J

    .line 573
    .line 574
    cmp-long v5, v11, v13

    .line 575
    .line 576
    if-nez v5, :cond_f

    .line 577
    .line 578
    move v5, v6

    .line 579
    goto :goto_9

    .line 580
    :cond_f
    move v5, v7

    .line 581
    :goto_9
    if-nez v2, :cond_10

    .line 582
    .line 583
    if-eqz v3, :cond_11

    .line 584
    .line 585
    if-nez v5, :cond_10

    .line 586
    .line 587
    goto :goto_a

    .line 588
    :cond_10
    move v6, v7

    .line 589
    :cond_11
    :goto_a
    if-eqz v6, :cond_14

    .line 590
    .line 591
    invoke-virtual {v8}, Ldefpackage/i41;->o0()I

    .line 592
    .line 593
    .line 594
    move-result v4

    .line 595
    invoke-virtual {v1}, Ldefpackage/cu4;->p()Z

    .line 596
    .line 597
    .line 598
    move-result v2

    .line 599
    if-nez v2, :cond_13

    .line 600
    .line 601
    iget-object v2, v0, Ldefpackage/n41;->f:Ljava/lang/Object;

    .line 602
    .line 603
    check-cast v2, Ldefpackage/ph3;

    .line 604
    .line 605
    iget-object v2, v2, Ldefpackage/ph3;->b:Ldefpackage/mt2;

    .line 606
    .line 607
    invoke-virtual {v2}, Ldefpackage/mt2;->b()Z

    .line 608
    .line 609
    .line 610
    move-result v2

    .line 611
    if-eqz v2, :cond_12

    .line 612
    .line 613
    goto :goto_b

    .line 614
    :cond_12
    iget-object v2, v0, Ldefpackage/n41;->f:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast v2, Ldefpackage/ph3;

    .line 617
    .line 618
    iget-object v3, v2, Ldefpackage/ph3;->b:Ldefpackage/mt2;

    .line 619
    .line 620
    iget-wide v9, v2, Ldefpackage/ph3;->d:J

    .line 621
    .line 622
    iget-object v2, v3, Ldefpackage/mt2;->a:Ljava/lang/Object;

    .line 623
    .line 624
    iget-object v3, v8, Ldefpackage/i41;->p:Ldefpackage/zt4;

    .line 625
    .line 626
    invoke-virtual {v1, v2, v3}, Ldefpackage/cu4;->g(Ljava/lang/Object;Ldefpackage/zt4;)Ldefpackage/zt4;

    .line 627
    .line 628
    .line 629
    iget-wide v1, v3, Ldefpackage/zt4;->e:J

    .line 630
    .line 631
    add-long/2addr v9, v1

    .line 632
    goto :goto_c

    .line 633
    :cond_13
    :goto_b
    iget-object v1, v0, Ldefpackage/n41;->f:Ljava/lang/Object;

    .line 634
    .line 635
    check-cast v1, Ldefpackage/ph3;

    .line 636
    .line 637
    iget-wide v1, v1, Ldefpackage/ph3;->d:J

    .line 638
    .line 639
    move-wide v9, v1

    .line 640
    :cond_14
    :goto_c
    move v15, v4

    .line 641
    move v11, v6

    .line 642
    :goto_d
    move-wide v13, v9

    .line 643
    goto :goto_e

    .line 644
    :cond_15
    move v15, v4

    .line 645
    move v11, v7

    .line 646
    goto :goto_d

    .line 647
    :goto_e
    iput-boolean v7, v8, Ldefpackage/i41;->M:Z

    .line 648
    .line 649
    iget-object v0, v0, Ldefpackage/n41;->f:Ljava/lang/Object;

    .line 650
    .line 651
    move-object v9, v0

    .line 652
    check-cast v9, Ldefpackage/ph3;

    .line 653
    .line 654
    iget v12, v8, Ldefpackage/i41;->L:I

    .line 655
    .line 656
    const/16 v16, 0x0

    .line 657
    .line 658
    const/4 v10, 0x1

    .line 659
    invoke-virtual/range {v8 .. v16}, Ldefpackage/i41;->x1(Ldefpackage/ph3;IZIJIZ)V

    .line 660
    .line 661
    .line 662
    :cond_16
    return-void

    .line 663
    :pswitch_5
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 664
    .line 665
    check-cast v1, Ljava/util/function/IntConsumer;

    .line 666
    .line 667
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 668
    .line 669
    check-cast v0, Ljava/util/List;

    .line 670
    .line 671
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 672
    .line 673
    .line 674
    move-result v0

    .line 675
    invoke-interface {v1, v0}, Ljava/util/function/IntConsumer;->accept(I)V

    .line 676
    .line 677
    .line 678
    return-void

    .line 679
    :pswitch_6
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 680
    .line 681
    check-cast v1, Ldefpackage/ut0;

    .line 682
    .line 683
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 684
    .line 685
    check-cast v0, Ldefpackage/vt0;

    .line 686
    .line 687
    iget-object v1, v1, Ldefpackage/ut0;->b:Ldefpackage/lt0;

    .line 688
    .line 689
    iget-object v1, v1, Ldefpackage/lt0;->l:Ljava/util/List;

    .line 690
    .line 691
    invoke-static {v0, v1}, Ldefpackage/vt0;->a(Ldefpackage/vt0;Ljava/util/List;)V

    .line 692
    .line 693
    .line 694
    return-void

    .line 695
    :pswitch_7
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 696
    .line 697
    check-cast v1, Ldefpackage/gp3;

    .line 698
    .line 699
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 700
    .line 701
    check-cast v0, Ldefpackage/s55;

    .line 702
    .line 703
    iget-object v1, v1, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v1, Ldefpackage/tn0;

    .line 706
    .line 707
    iget-object v1, v1, Ldefpackage/tn0;->h:Ldefpackage/q55;

    .line 708
    .line 709
    invoke-interface {v1, v0}, Ldefpackage/q55;->a(Ldefpackage/s55;)V

    .line 710
    .line 711
    .line 712
    return-void

    .line 713
    :pswitch_8
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 714
    .line 715
    check-cast v1, Ljava/util/ArrayList;

    .line 716
    .line 717
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 718
    .line 719
    check-cast v0, Ldefpackage/pj4;

    .line 720
    .line 721
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 722
    .line 723
    .line 724
    move-result v2

    .line 725
    if-eqz v2, :cond_17

    .line 726
    .line 727
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 728
    .line 729
    .line 730
    iget-object v1, v0, Ldefpackage/pj4;->c:Ldefpackage/kc1;

    .line 731
    .line 732
    iget-object v1, v1, Ldefpackage/kc1;->T:Landroid/view/View;

    .line 733
    .line 734
    iget v0, v0, Ldefpackage/pj4;->a:I

    .line 735
    .line 736
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 737
    .line 738
    .line 739
    invoke-static {v1, v0}, Ldefpackage/f34;->a(Landroid/view/View;I)V

    .line 740
    .line 741
    .line 742
    :cond_17
    return-void

    .line 743
    :pswitch_9
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 744
    .line 745
    check-cast v1, Ldefpackage/zk0;

    .line 746
    .line 747
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 748
    .line 749
    check-cast v0, Landroid/net/Uri;

    .line 750
    .line 751
    iput-boolean v7, v1, Ldefpackage/zk0;->v:Z

    .line 752
    .line 753
    invoke-virtual {v1, v0}, Ldefpackage/zk0;->e(Landroid/net/Uri;)V

    .line 754
    .line 755
    .line 756
    return-void

    .line 757
    :pswitch_a
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 758
    .line 759
    check-cast v1, Ldefpackage/jk0;

    .line 760
    .line 761
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 762
    .line 763
    check-cast v0, Ldefpackage/tb1;

    .line 764
    .line 765
    iget-object v2, v1, Ldefpackage/jk0;->q:Ldefpackage/kk0;

    .line 766
    .line 767
    iget v3, v2, Ldefpackage/kk0;->p:I

    .line 768
    .line 769
    if-eqz v3, :cond_19

    .line 770
    .line 771
    iget-boolean v3, v1, Ldefpackage/jk0;->p:Z

    .line 772
    .line 773
    if-eqz v3, :cond_18

    .line 774
    .line 775
    goto :goto_f

    .line 776
    :cond_18
    iget-object v3, v2, Ldefpackage/kk0;->t:Landroid/os/Looper;

    .line 777
    .line 778
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 779
    .line 780
    .line 781
    iget-object v4, v1, Ldefpackage/jk0;->n:Ldefpackage/sw0;

    .line 782
    .line 783
    invoke-virtual {v2, v3, v4, v0, v7}, Ldefpackage/kk0;->g(Landroid/os/Looper;Ldefpackage/sw0;Ldefpackage/tb1;Z)Ldefpackage/pw0;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    iput-object v0, v1, Ldefpackage/jk0;->o:Ldefpackage/pw0;

    .line 788
    .line 789
    iget-object v0, v2, Ldefpackage/kk0;->n:Ljava/util/Set;

    .line 790
    .line 791
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 792
    .line 793
    .line 794
    :cond_19
    :goto_f
    return-void

    .line 795
    :pswitch_b
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 796
    .line 797
    check-cast v1, Ldefpackage/ye4;

    .line 798
    .line 799
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 800
    .line 801
    check-cast v0, Ljava/lang/String;

    .line 802
    .line 803
    iget-object v2, v1, Ldefpackage/ye4;->n:Lcom/google/android/material/textfield/TextInputLayout;

    .line 804
    .line 805
    iget-object v3, v1, Ldefpackage/ye4;->p:Ljava/text/SimpleDateFormat;

    .line 806
    .line 807
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 808
    .line 809
    .line 810
    move-result-object v4

    .line 811
    const v5, 0x7f13038f

    .line 812
    .line 813
    .line 814
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 815
    .line 816
    .line 817
    move-result-object v5

    .line 818
    const v6, 0x7f130391

    .line 819
    .line 820
    .line 821
    invoke-virtual {v4, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 822
    .line 823
    .line 824
    move-result-object v6

    .line 825
    const/16 v7, 0x20

    .line 826
    .line 827
    const/16 v8, 0xa0

    .line 828
    .line 829
    invoke-virtual {v0, v7, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    move-result-object v0

    .line 837
    invoke-static {v6, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    const v6, 0x7f130390

    .line 842
    .line 843
    .line 844
    invoke-virtual {v4, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 845
    .line 846
    .line 847
    move-result-object v4

    .line 848
    new-instance v6, Ljava/util/Date;

    .line 849
    .line 850
    invoke-static {}, Ldefpackage/a35;->d()Ljava/util/Calendar;

    .line 851
    .line 852
    .line 853
    move-result-object v9

    .line 854
    invoke-virtual {v9}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 855
    .line 856
    .line 857
    move-result-wide v9

    .line 858
    invoke-direct {v6, v9, v10}, Ljava/util/Date;-><init>(J)V

    .line 859
    .line 860
    .line 861
    invoke-virtual {v3, v6}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 862
    .line 863
    .line 864
    move-result-object v3

    .line 865
    invoke-virtual {v3, v7, v8}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 866
    .line 867
    .line 868
    move-result-object v3

    .line 869
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v3

    .line 873
    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v3

    .line 877
    new-instance v4, Ljava/lang/StringBuilder;

    .line 878
    .line 879
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 880
    .line 881
    .line 882
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 883
    .line 884
    .line 885
    const-string v5, "\n"

    .line 886
    .line 887
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 888
    .line 889
    .line 890
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 891
    .line 892
    .line 893
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 894
    .line 895
    .line 896
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 897
    .line 898
    .line 899
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v0

    .line 903
    invoke-virtual {v2, v0}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 904
    .line 905
    .line 906
    iget-object v0, v1, Ldefpackage/ye4;->x:Ldefpackage/ze4;

    .line 907
    .line 908
    iget-object v2, v1, Ldefpackage/ye4;->w:Lcom/google/android/material/textfield/TextInputLayout;

    .line 909
    .line 910
    invoke-virtual {v2}, Lcom/google/android/material/textfield/TextInputLayout;->getError()Ljava/lang/CharSequence;

    .line 911
    .line 912
    .line 913
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 914
    .line 915
    .line 916
    iget-object v0, v1, Ldefpackage/ye4;->v:Ldefpackage/wh2;

    .line 917
    .line 918
    invoke-virtual {v0}, Ldefpackage/wh2;->a()V

    .line 919
    .line 920
    .line 921
    return-void

    .line 922
    :pswitch_c
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 923
    .line 924
    check-cast v1, Ljava/util/List;

    .line 925
    .line 926
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 927
    .line 928
    check-cast v0, Ldefpackage/xb0;

    .line 929
    .line 930
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 931
    .line 932
    .line 933
    move-result-object v1

    .line 934
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 935
    .line 936
    .line 937
    move-result v2

    .line 938
    if-eqz v2, :cond_1b

    .line 939
    .line 940
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v2

    .line 944
    check-cast v2, Ldefpackage/hp;

    .line 945
    .line 946
    iget-object v3, v0, Ldefpackage/xb0;->e:Ljava/lang/Object;

    .line 947
    .line 948
    iget-object v4, v2, Ldefpackage/hp;->a:Ldefpackage/ip;

    .line 949
    .line 950
    invoke-virtual {v4, v3}, Ldefpackage/ip;->e(Ljava/lang/Object;)Z

    .line 951
    .line 952
    .line 953
    move-result v3

    .line 954
    if-eqz v3, :cond_1a

    .line 955
    .line 956
    new-instance v3, Ldefpackage/sc0;

    .line 957
    .line 958
    invoke-virtual {v4}, Ldefpackage/ip;->d()I

    .line 959
    .line 960
    .line 961
    move-result v4

    .line 962
    invoke-direct {v3, v4}, Ldefpackage/sc0;-><init>(I)V

    .line 963
    .line 964
    .line 965
    goto :goto_11

    .line 966
    :cond_1a
    sget-object v3, Ldefpackage/rc0;->a:Ldefpackage/rc0;

    .line 967
    .line 968
    :goto_11
    iget-object v2, v2, Ldefpackage/hp;->b:Ldefpackage/rq3;

    .line 969
    .line 970
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 971
    .line 972
    .line 973
    invoke-virtual {v2, v3}, Ldefpackage/rq3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 974
    .line 975
    .line 976
    goto :goto_10

    .line 977
    :cond_1b
    return-void

    .line 978
    :pswitch_d
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 979
    .line 980
    check-cast v1, Ldefpackage/nc1;

    .line 981
    .line 982
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 983
    .line 984
    check-cast v0, Ldefpackage/a93;

    .line 985
    .line 986
    iget-object v2, v1, Ldefpackage/k70;->n:Ldefpackage/ea2;

    .line 987
    .line 988
    new-instance v3, Ldefpackage/d70;

    .line 989
    .line 990
    invoke-direct {v3, v7, v0, v1}, Ldefpackage/d70;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 991
    .line 992
    .line 993
    invoke-virtual {v2, v3}, Ldefpackage/ea2;->a(Ldefpackage/aa2;)V

    .line 994
    .line 995
    .line 996
    return-void

    .line 997
    :pswitch_e
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 998
    .line 999
    check-cast v1, Ljava/lang/String;

    .line 1000
    .line 1001
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 1002
    .line 1003
    check-cast v0, Ldefpackage/vz;

    .line 1004
    .line 1005
    sget-object v2, Ldefpackage/b00;->a:Ldefpackage/b00;

    .line 1006
    .line 1007
    invoke-static {}, Ldefpackage/b00;->b()Ldefpackage/kd3;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v3

    .line 1011
    if-eqz v3, :cond_1c

    .line 1012
    .line 1013
    iget-object v3, v3, Ldefpackage/kd3;->n:Ljava/lang/Object;

    .line 1014
    .line 1015
    check-cast v3, Ljava/lang/String;

    .line 1016
    .line 1017
    goto :goto_12

    .line 1018
    :cond_1c
    move-object v3, v5

    .line 1019
    :goto_12
    invoke-static {v3, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1020
    .line 1021
    .line 1022
    move-result v1

    .line 1023
    if-eqz v1, :cond_1f

    .line 1024
    .line 1025
    monitor-enter v2

    .line 1026
    :try_start_3
    sget-object v1, Ldefpackage/b00;->f:Ljava/util/LinkedHashMap;

    .line 1027
    .line 1028
    iget-object v3, v0, Ldefpackage/vz;->f:Ljava/lang/String;

    .line 1029
    .line 1030
    invoke-interface {v1, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v1

    .line 1034
    check-cast v1, Ldefpackage/a00;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 1035
    .line 1036
    monitor-exit v2

    .line 1037
    if-eqz v1, :cond_1d

    .line 1038
    .line 1039
    iget-object v1, v1, Ldefpackage/a00;->c:Ldefpackage/l61;

    .line 1040
    .line 1041
    invoke-static {v1}, Ldefpackage/n61;->a(Ldefpackage/l61;)V

    .line 1042
    .line 1043
    .line 1044
    :cond_1d
    iget-object v1, v0, Ldefpackage/vz;->c:Ljava/lang/String;

    .line 1045
    .line 1046
    const-string v2, "hub:"

    .line 1047
    .line 1048
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v1

    .line 1052
    iget-boolean v2, v0, Ldefpackage/vz;->e:Z

    .line 1053
    .line 1054
    invoke-static {v6, v1, v2}, Ldefpackage/n61;->f(ILjava/lang/String;Z)Z

    .line 1055
    .line 1056
    .line 1057
    move-result v1

    .line 1058
    iget-boolean v2, v0, Ldefpackage/vz;->d:Z

    .line 1059
    .line 1060
    if-eqz v2, :cond_1e

    .line 1061
    .line 1062
    if-eqz v1, :cond_1e

    .line 1063
    .line 1064
    const-string v2, "hm:hub-download"

    .line 1065
    .line 1066
    const-string v3, "ref"

    .line 1067
    .line 1068
    iget-object v4, v0, Ldefpackage/vz;->c:Ljava/lang/String;

    .line 1069
    .line 1070
    new-instance v6, Ldefpackage/kd3;

    .line 1071
    .line 1072
    invoke-direct {v6, v3, v4}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1073
    .line 1074
    .line 1075
    const-string v3, "star"

    .line 1076
    .line 1077
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1078
    .line 1079
    new-instance v7, Ldefpackage/kd3;

    .line 1080
    .line 1081
    invoke-direct {v7, v3, v4}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1082
    .line 1083
    .line 1084
    filled-new-array {v6, v7}, [Ldefpackage/kd3;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v3

    .line 1088
    invoke-static {v3}, Ldefpackage/lg2;->X([Ldefpackage/kd3;)Ljava/util/Map;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v3

    .line 1092
    sget-object v4, Ldefpackage/rr1;->c:Ldefpackage/nk1;

    .line 1093
    .line 1094
    sget-object v6, Ldefpackage/hw;->g:Landroid/webkit/WebView;

    .line 1095
    .line 1096
    if-eqz v6, :cond_1e

    .line 1097
    .line 1098
    invoke-virtual {v4, v2}, Ldefpackage/nk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v2

    .line 1102
    invoke-virtual {v4, v3}, Ldefpackage/nk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v3

    .line 1106
    const-string v4, "window.dispatchEvent(new CustomEvent("

    .line 1107
    .line 1108
    const-string v7, ", {detail: "

    .line 1109
    .line 1110
    const-string v8, "}));"

    .line 1111
    .line 1112
    invoke-static {v4, v2, v7, v3, v8}, Ldefpackage/f34;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v2

    .line 1116
    invoke-virtual {v6, v2, v5}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 1117
    .line 1118
    .line 1119
    :cond_1e
    const-string v2, "hm:hub-favorite"

    .line 1120
    .line 1121
    const-string v3, "ref"

    .line 1122
    .line 1123
    iget-object v0, v0, Ldefpackage/vz;->c:Ljava/lang/String;

    .line 1124
    .line 1125
    new-instance v4, Ldefpackage/kd3;

    .line 1126
    .line 1127
    invoke-direct {v4, v3, v0}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1128
    .line 1129
    .line 1130
    const-string v0, "star"

    .line 1131
    .line 1132
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v1

    .line 1136
    new-instance v3, Ldefpackage/kd3;

    .line 1137
    .line 1138
    invoke-direct {v3, v0, v1}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1139
    .line 1140
    .line 1141
    filled-new-array {v4, v3}, [Ldefpackage/kd3;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v0

    .line 1145
    invoke-static {v0}, Ldefpackage/lg2;->X([Ldefpackage/kd3;)Ljava/util/Map;

    .line 1146
    .line 1147
    .line 1148
    move-result-object v0

    .line 1149
    sget-object v1, Ldefpackage/rr1;->c:Ldefpackage/nk1;

    .line 1150
    .line 1151
    sget-object v3, Ldefpackage/hw;->g:Landroid/webkit/WebView;

    .line 1152
    .line 1153
    if-eqz v3, :cond_1f

    .line 1154
    .line 1155
    invoke-virtual {v1, v2}, Ldefpackage/nk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v2

    .line 1159
    invoke-virtual {v1, v0}, Ldefpackage/nk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v0

    .line 1163
    const-string v1, "window.dispatchEvent(new CustomEvent("

    .line 1164
    .line 1165
    const-string v4, ", {detail: "

    .line 1166
    .line 1167
    const-string v6, "}));"

    .line 1168
    .line 1169
    invoke-static {v1, v2, v4, v0, v6}, Ldefpackage/f34;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v0

    .line 1173
    invoke-virtual {v3, v0, v5}, Landroid/webkit/WebView;->evaluateJavascript(Ljava/lang/String;Landroid/webkit/ValueCallback;)V

    .line 1174
    .line 1175
    .line 1176
    goto :goto_13

    .line 1177
    :catchall_2
    move-exception v0

    .line 1178
    monitor-exit v2

    .line 1179
    throw v0

    .line 1180
    :cond_1f
    :goto_13
    return-void

    .line 1181
    :pswitch_f
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 1182
    .line 1183
    check-cast v1, Ldefpackage/sc5;

    .line 1184
    .line 1185
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 1186
    .line 1187
    check-cast v0, Ljava/util/UUID;

    .line 1188
    .line 1189
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v0

    .line 1193
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1194
    .line 1195
    .line 1196
    invoke-static {v1, v0}, Ldefpackage/wr1;->h(Ldefpackage/sc5;Ljava/lang/String;)V

    .line 1197
    .line 1198
    .line 1199
    return-void

    .line 1200
    :pswitch_10
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 1201
    .line 1202
    check-cast v1, Ldefpackage/au;

    .line 1203
    .line 1204
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 1205
    .line 1206
    check-cast v0, Ldefpackage/vf2;

    .line 1207
    .line 1208
    iput-object v5, v1, Ldefpackage/au;->g:Ljava/lang/Object;

    .line 1209
    .line 1210
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1211
    .line 1212
    .line 1213
    invoke-static {}, Ldefpackage/vf2;->c()Z

    .line 1214
    .line 1215
    .line 1216
    move-result v0

    .line 1217
    invoke-virtual {v1, v0}, Ldefpackage/au;->d(Z)V

    .line 1218
    .line 1219
    .line 1220
    return-void

    .line 1221
    :pswitch_11
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 1222
    .line 1223
    check-cast v1, Ldefpackage/pq;

    .line 1224
    .line 1225
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 1226
    .line 1227
    check-cast v0, Ldefpackage/kn2;

    .line 1228
    .line 1229
    invoke-virtual {v1, v0, v7}, Ldefpackage/pq;->f(Ldefpackage/kn2;Z)V

    .line 1230
    .line 1231
    .line 1232
    return-void

    .line 1233
    :pswitch_12
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 1234
    .line 1235
    move-object v9, v1

    .line 1236
    check-cast v9, Lcom/eddyizm/tempus/service/MediaService;

    .line 1237
    .line 1238
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 1239
    .line 1240
    move-object v10, v0

    .line 1241
    check-cast v10, Ldefpackage/qi3;

    .line 1242
    .line 1243
    :goto_14
    invoke-static {}, Ldefpackage/ra0;->b()Z

    .line 1244
    .line 1245
    .line 1246
    move-result v0

    .line 1247
    if-eqz v0, :cond_21

    .line 1248
    .line 1249
    iget-boolean v0, v9, Lcom/eddyizm/tempus/service/MediaService;->D:Z

    .line 1250
    .line 1251
    if-eqz v0, :cond_20

    .line 1252
    .line 1253
    goto/16 :goto_19

    .line 1254
    .line 1255
    :cond_20
    const-wide/16 v0, 0x19

    .line 1256
    .line 1257
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    .line 1258
    .line 1259
    .line 1260
    goto :goto_14

    .line 1261
    :cond_21
    invoke-static {}, Ldefpackage/ud3;->u()Ljava/lang/String;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v11

    .line 1265
    new-instance v0, Ldefpackage/vs3;

    .line 1266
    .line 1267
    invoke-direct {v0}, Ldefpackage/vs3;-><init>()V

    .line 1268
    .line 1269
    .line 1270
    invoke-virtual {v0}, Ldefpackage/vs3;->b()Ljava/util/List;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v1

    .line 1274
    if-eqz v1, :cond_29

    .line 1275
    .line 1276
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 1277
    .line 1278
    .line 1279
    move-result v6

    .line 1280
    if-eqz v6, :cond_22

    .line 1281
    .line 1282
    goto/16 :goto_19

    .line 1283
    .line 1284
    :cond_22
    invoke-static {v1}, Ldefpackage/gi1;->M(Ljava/util/List;)Ljava/util/ArrayList;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v12

    .line 1288
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1289
    .line 1290
    .line 1291
    move-result v1

    .line 1292
    if-eqz v1, :cond_23

    .line 1293
    .line 1294
    goto :goto_19

    .line 1295
    :cond_23
    :try_start_4
    invoke-virtual {v0}, Ldefpackage/vs3;->a()Lcom/eddyizm/tempus/model/Queue;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v5
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 1299
    :catch_1
    new-instance v13, Ldefpackage/hx3;

    .line 1300
    .line 1301
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 1302
    .line 1303
    .line 1304
    new-instance v14, Ldefpackage/ix3;

    .line 1305
    .line 1306
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 1307
    .line 1308
    .line 1309
    if-eqz v5, :cond_28

    .line 1310
    .line 1311
    invoke-virtual {v5}, Lcom/eddyizm/tempus/model/Queue;->getId()Ljava/lang/String;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v0

    .line 1315
    :goto_15
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 1316
    .line 1317
    .line 1318
    move-result v1

    .line 1319
    if-ge v7, v1, :cond_25

    .line 1320
    .line 1321
    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v1

    .line 1325
    check-cast v1, Ldefpackage/gn2;

    .line 1326
    .line 1327
    iget-object v1, v1, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 1328
    .line 1329
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1330
    .line 1331
    .line 1332
    move-result v1

    .line 1333
    if-eqz v1, :cond_24

    .line 1334
    .line 1335
    move v4, v7

    .line 1336
    goto :goto_16

    .line 1337
    :cond_24
    add-int/lit8 v7, v7, 0x1

    .line 1338
    .line 1339
    goto :goto_15

    .line 1340
    :cond_25
    :goto_16
    if-ltz v4, :cond_28

    .line 1341
    .line 1342
    iput v4, v13, Ldefpackage/hx3;->n:I

    .line 1343
    .line 1344
    sget-object v0, Ldefpackage/bo2;->a:Ljava/lang/ref/WeakReference;

    .line 1345
    .line 1346
    invoke-virtual {v5}, Lcom/eddyizm/tempus/model/Queue;->getId()Ljava/lang/String;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v0

    .line 1350
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1351
    .line 1352
    .line 1353
    invoke-static {}, Ldefpackage/ud3;->A()Ljava/util/Map;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v1

    .line 1357
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v0

    .line 1361
    check-cast v0, Ldefpackage/sp3;

    .line 1362
    .line 1363
    if-eqz v0, :cond_26

    .line 1364
    .line 1365
    iget-wide v0, v0, Ldefpackage/sp3;->b:J

    .line 1366
    .line 1367
    goto :goto_17

    .line 1368
    :cond_26
    move-wide v0, v2

    .line 1369
    :goto_17
    cmp-long v4, v0, v2

    .line 1370
    .line 1371
    if-eqz v4, :cond_27

    .line 1372
    .line 1373
    goto :goto_18

    .line 1374
    :cond_27
    invoke-virtual {v5}, Lcom/eddyizm/tempus/model/Queue;->getPlayingChanged()J

    .line 1375
    .line 1376
    .line 1377
    move-result-wide v0

    .line 1378
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 1379
    .line 1380
    .line 1381
    move-result-wide v0

    .line 1382
    :goto_18
    iput-wide v0, v14, Ldefpackage/ix3;->n:J

    .line 1383
    .line 1384
    :cond_28
    iget-object v0, v9, Lcom/eddyizm/tempus/service/MediaService;->B:Landroid/os/Handler;

    .line 1385
    .line 1386
    new-instance v8, Ldefpackage/up;

    .line 1387
    .line 1388
    const/4 v15, 0x0

    .line 1389
    invoke-direct/range {v8 .. v15}, Ldefpackage/up;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1390
    .line 1391
    .line 1392
    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1393
    .line 1394
    .line 1395
    :cond_29
    :goto_19
    return-void

    .line 1396
    :pswitch_13
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 1397
    .line 1398
    check-cast v1, Ldefpackage/c6;

    .line 1399
    .line 1400
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 1401
    .line 1402
    check-cast v0, Ldefpackage/ij0;

    .line 1403
    .line 1404
    iget-object v2, v1, Ldefpackage/c6;->f:Ljava/lang/Object;

    .line 1405
    .line 1406
    invoke-virtual {v0, v2}, Ldefpackage/ij0;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v0

    .line 1410
    iput-object v0, v1, Ldefpackage/c6;->f:Ljava/lang/Object;

    .line 1411
    .line 1412
    new-instance v2, Ldefpackage/wo;

    .line 1413
    .line 1414
    invoke-direct {v2, v1, v0, v6}, Ldefpackage/wo;-><init>(Ldefpackage/c6;Ljava/lang/Object;I)V

    .line 1415
    .line 1416
    .line 1417
    iget-object v0, v1, Ldefpackage/c6;->c:Ljava/lang/Object;

    .line 1418
    .line 1419
    check-cast v0, Ldefpackage/yp4;

    .line 1420
    .line 1421
    iget-object v1, v0, Ldefpackage/yp4;->a:Landroid/os/Handler;

    .line 1422
    .line 1423
    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v1

    .line 1427
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 1428
    .line 1429
    .line 1430
    move-result-object v1

    .line 1431
    invoke-virtual {v1}, Ljava/lang/Thread;->isAlive()Z

    .line 1432
    .line 1433
    .line 1434
    move-result v1

    .line 1435
    if-nez v1, :cond_2a

    .line 1436
    .line 1437
    goto :goto_1a

    .line 1438
    :cond_2a
    invoke-virtual {v0, v2}, Ldefpackage/yp4;->d(Ljava/lang/Runnable;)V

    .line 1439
    .line 1440
    .line 1441
    :goto_1a
    return-void

    .line 1442
    :pswitch_14
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 1443
    .line 1444
    check-cast v1, Ldefpackage/bq4;

    .line 1445
    .line 1446
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 1447
    .line 1448
    check-cast v0, Landroid/media/AudioDeviceInfo;

    .line 1449
    .line 1450
    iget-object v2, v1, Ldefpackage/bq4;->q:Ljava/lang/Object;

    .line 1451
    .line 1452
    check-cast v2, Ldefpackage/wm;

    .line 1453
    .line 1454
    if-nez v2, :cond_2b

    .line 1455
    .line 1456
    goto :goto_1b

    .line 1457
    :cond_2b
    iget-object v1, v1, Ldefpackage/bq4;->o:Ljava/lang/Object;

    .line 1458
    .line 1459
    check-cast v1, Ldefpackage/zh0;

    .line 1460
    .line 1461
    iget-object v1, v1, Ldefpackage/zh0;->o:Ljava/lang/Object;

    .line 1462
    .line 1463
    check-cast v1, Ldefpackage/dn;

    .line 1464
    .line 1465
    iget-object v1, v1, Ldefpackage/dn;->h:Ldefpackage/ql;

    .line 1466
    .line 1467
    if-eqz v1, :cond_2d

    .line 1468
    .line 1469
    iget-object v2, v1, Ldefpackage/ql;->h:Landroid/media/AudioDeviceInfo;

    .line 1470
    .line 1471
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1472
    .line 1473
    .line 1474
    move-result v2

    .line 1475
    if-eqz v2, :cond_2c

    .line 1476
    .line 1477
    goto :goto_1b

    .line 1478
    :cond_2c
    iput-object v0, v1, Ldefpackage/ql;->h:Landroid/media/AudioDeviceInfo;

    .line 1479
    .line 1480
    iget-object v2, v1, Ldefpackage/ql;->a:Landroid/content/Context;

    .line 1481
    .line 1482
    iget-object v3, v1, Ldefpackage/ql;->i:Ldefpackage/il;

    .line 1483
    .line 1484
    invoke-static {v2, v3, v0}, Ldefpackage/nl;->b(Landroid/content/Context;Ldefpackage/il;Landroid/media/AudioDeviceInfo;)Ldefpackage/nl;

    .line 1485
    .line 1486
    .line 1487
    move-result-object v0

    .line 1488
    invoke-virtual {v1, v0}, Ldefpackage/ql;->a(Ldefpackage/nl;)V

    .line 1489
    .line 1490
    .line 1491
    :cond_2d
    :goto_1b
    return-void

    .line 1492
    :pswitch_15
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 1493
    .line 1494
    check-cast v1, Ldefpackage/bq4;

    .line 1495
    .line 1496
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 1497
    .line 1498
    check-cast v0, Landroid/media/AudioRouting;

    .line 1499
    .line 1500
    invoke-interface {v0}, Landroid/media/AudioRouting;->getRoutedDevice()Landroid/media/AudioDeviceInfo;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v0

    .line 1504
    if-eqz v0, :cond_2e

    .line 1505
    .line 1506
    iget-object v2, v1, Ldefpackage/bq4;->p:Ljava/lang/Object;

    .line 1507
    .line 1508
    check-cast v2, Landroid/os/Handler;

    .line 1509
    .line 1510
    new-instance v3, Ldefpackage/k6;

    .line 1511
    .line 1512
    const/16 v4, 0x8

    .line 1513
    .line 1514
    invoke-direct {v3, v4, v1, v0}, Ldefpackage/k6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1515
    .line 1516
    .line 1517
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1518
    .line 1519
    .line 1520
    :cond_2e
    return-void

    .line 1521
    :pswitch_16
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 1522
    .line 1523
    check-cast v1, Ldefpackage/xc5;

    .line 1524
    .line 1525
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 1526
    .line 1527
    check-cast v0, Ldefpackage/h40;

    .line 1528
    .line 1529
    iget-object v1, v1, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 1530
    .line 1531
    check-cast v1, Ldefpackage/qm;

    .line 1532
    .line 1533
    sget-object v2, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 1534
    .line 1535
    invoke-interface {v1, v0}, Ldefpackage/qm;->K(Ldefpackage/h40;)V

    .line 1536
    .line 1537
    .line 1538
    return-void

    .line 1539
    :pswitch_17
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 1540
    .line 1541
    check-cast v1, Ldefpackage/xc5;

    .line 1542
    .line 1543
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 1544
    .line 1545
    check-cast v0, Ljava/lang/String;

    .line 1546
    .line 1547
    iget-object v1, v1, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 1548
    .line 1549
    check-cast v1, Ldefpackage/qm;

    .line 1550
    .line 1551
    sget-object v2, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 1552
    .line 1553
    invoke-interface {v1, v0}, Ldefpackage/qm;->q(Ljava/lang/String;)V

    .line 1554
    .line 1555
    .line 1556
    return-void

    .line 1557
    :pswitch_18
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 1558
    .line 1559
    check-cast v1, Landroid/content/Context;

    .line 1560
    .line 1561
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 1562
    .line 1563
    check-cast v0, Ldefpackage/q90;

    .line 1564
    .line 1565
    const-string v2, "audio"

    .line 1566
    .line 1567
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v1

    .line 1571
    check-cast v1, Landroid/media/AudioManager;

    .line 1572
    .line 1573
    sput-object v1, Ldefpackage/xl;->a:Landroid/media/AudioManager;

    .line 1574
    .line 1575
    invoke-virtual {v0}, Ldefpackage/q90;->d()Z

    .line 1576
    .line 1577
    .line 1578
    return-void

    .line 1579
    :pswitch_19
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 1580
    .line 1581
    check-cast v1, Ldefpackage/yk;

    .line 1582
    .line 1583
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 1584
    .line 1585
    check-cast v0, Ldefpackage/ws1;

    .line 1586
    .line 1587
    iget-object v2, v1, Ldefpackage/yk;->s:Ljava/lang/Object;

    .line 1588
    .line 1589
    check-cast v2, Ldefpackage/ck2;

    .line 1590
    .line 1591
    invoke-interface {v2}, Ldefpackage/ck2;->j()V

    .line 1592
    .line 1593
    .line 1594
    iget-object v1, v1, Ldefpackage/yk;->r:Ljava/lang/Object;

    .line 1595
    .line 1596
    check-cast v1, Ldefpackage/cl;

    .line 1597
    .line 1598
    iget-object v2, v1, Ldefpackage/cl;->a:Ljava/lang/Object;

    .line 1599
    .line 1600
    monitor-enter v2

    .line 1601
    :try_start_5
    invoke-virtual {v1}, Ldefpackage/cl;->b()V

    .line 1602
    .line 1603
    .line 1604
    invoke-virtual {v0}, Ldefpackage/ws1;->run()V

    .line 1605
    .line 1606
    .line 1607
    monitor-exit v2

    .line 1608
    return-void

    .line 1609
    :catchall_3
    move-exception v0

    .line 1610
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 1611
    throw v0

    .line 1612
    :pswitch_1a
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 1613
    .line 1614
    check-cast v1, Ldefpackage/ia4;

    .line 1615
    .line 1616
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 1617
    .line 1618
    check-cast v0, Ljava/lang/Runnable;

    .line 1619
    .line 1620
    :try_start_6
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 1621
    .line 1622
    .line 1623
    invoke-virtual {v1}, Ldefpackage/ia4;->a()V

    .line 1624
    .line 1625
    .line 1626
    return-void

    .line 1627
    :catchall_4
    move-exception v0

    .line 1628
    invoke-virtual {v1}, Ldefpackage/ia4;->a()V

    .line 1629
    .line 1630
    .line 1631
    throw v0

    .line 1632
    :pswitch_1b
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 1633
    .line 1634
    check-cast v1, Ldefpackage/lb;

    .line 1635
    .line 1636
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 1637
    .line 1638
    check-cast v0, Landroid/util/LongSparseArray;

    .line 1639
    .line 1640
    invoke-static {v1, v0}, Ldefpackage/uo;->p(Ldefpackage/lb;Landroid/util/LongSparseArray;)V

    .line 1641
    .line 1642
    .line 1643
    return-void

    .line 1644
    :pswitch_1c
    iget-object v1, v0, Ldefpackage/k6;->o:Ljava/lang/Object;

    .line 1645
    .line 1646
    check-cast v1, Ldefpackage/g60;

    .line 1647
    .line 1648
    iget-object v0, v0, Ldefpackage/k6;->p:Ljava/lang/Object;

    .line 1649
    .line 1650
    check-cast v0, Ldefpackage/rw1;

    .line 1651
    .line 1652
    invoke-virtual {v1, v0}, Ldefpackage/g60;->q(Ldefpackage/rw1;)V

    .line 1653
    .line 1654
    .line 1655
    return-void

    .line 1656
    nop

    .line 1657
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
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
