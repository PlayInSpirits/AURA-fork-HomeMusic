.class public final synthetic Ltk3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lwk3;


# direct methods
.method public synthetic constructor <init>(Lwk3;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltk3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ltk3;->o:Lwk3;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    iget v0, p0, Ltk3;->n:I

    .line 2
    .line 3
    sget-object v1, Lgq0;->n:Lgq0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "PlayerQueueFragment"

    .line 7
    .line 8
    iget-object p0, p0, Ltk3;->o:Lwk3;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    :try_start_0
    iget-object v0, p0, Lwk3;->v0:Lbl2;

    .line 14
    .line 15
    invoke-virtual {v0}, Lu0;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lbj2;

    .line 20
    .line 21
    invoke-static {}, Lu52;->c()Lv52;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    iget-boolean v4, v4, Lv52;->a:Z

    .line 26
    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    invoke-static {}, Lu52;->c()Lv52;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget v0, v0, Lv52;->o:I

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catch_0
    move-exception v0

    .line 37
    goto/16 :goto_3

    .line 38
    .line 39
    :cond_0
    invoke-virtual {v0}, Lsk2;->o0()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    :goto_0
    add-int/lit8 v0, v0, 0x1

    .line 44
    .line 45
    iget-object v4, p0, Lwk3;->w0:Lyk3;

    .line 46
    .line 47
    iget-object v4, v4, Lyk3;->s:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    add-int/lit8 v4, v4, -0x1

    .line 54
    .line 55
    if-ge v0, v4, :cond_4

    .line 56
    .line 57
    new-instance v5, Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 60
    .line 61
    .line 62
    move v6, v0

    .line 63
    :goto_1
    if-gt v6, v4, :cond_1

    .line 64
    .line 65
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    add-int/lit8 v6, v6, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    :goto_2
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    const/4 v7, 0x2

    .line 80
    if-lt v6, v7, :cond_2

    .line 81
    .line 82
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 83
    .line 84
    .line 85
    move-result-wide v6

    .line 86
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    int-to-double v8, v8

    .line 91
    mul-double/2addr v6, v8

    .line 92
    double-to-int v6, v6

    .line 93
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    check-cast v7, Ljava/lang/Integer;

    .line 98
    .line 99
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v7

    .line 103
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 107
    .line 108
    .line 109
    move-result-wide v8

    .line 110
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    int-to-double v10, v6

    .line 115
    mul-double/2addr v8, v10

    .line 116
    double-to-int v6, v8

    .line 117
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v8

    .line 121
    check-cast v8, Ljava/lang/Integer;

    .line 122
    .line 123
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    iget-object v6, p0, Lwk3;->w0:Lyk3;

    .line 131
    .line 132
    iget-object v6, v6, Lyk3;->s:Ljava/util/List;

    .line 133
    .line 134
    invoke-static {v6, v7, v8}, Ljava/util/Collections;->swap(Ljava/util/List;II)V

    .line 135
    .line 136
    .line 137
    iget-object v6, p0, Lwk3;->l0:Llv4;

    .line 138
    .line 139
    iget-object v6, v6, Llv4;->t:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v6, Landroidx/recyclerview/widget/RecyclerView;

    .line 142
    .line 143
    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ldw3;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    iget-object v6, v6, Ldw3;->n:Lew3;

    .line 148
    .line 149
    invoke-virtual {v6, v7, v8}, Lew3;->c(II)V

    .line 150
    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_2
    iget-object v5, p0, Lwk3;->v0:Lbl2;

    .line 154
    .line 155
    iget-object v6, p0, Lwk3;->w0:Lyk3;

    .line 156
    .line 157
    iget-object v6, v6, Lyk3;->s:Ljava/util/List;

    .line 158
    .line 159
    sget-object v7, Lbo2;->a:Ljava/lang/ref/WeakReference;

    .line 160
    .line 161
    const-string v7, "reorder"

    .line 162
    .line 163
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    const-wide/16 v8, 0x0

    .line 167
    .line 168
    invoke-static {v6, v7, v2, v8, v9}, Lu52;->r(Ljava/util/List;Ljava/lang/String;IJ)Z

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-eqz v2, :cond_3

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :cond_3
    if-eqz v5, :cond_4

    .line 176
    .line 177
    new-instance v2, Lvn2;

    .line 178
    .line 179
    invoke-direct {v2, v5, v6, v0, v4}, Lvn2;-><init>(Lbl2;Ljava/util/List;II)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v5, v2, v1}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 183
    .line 184
    .line 185
    goto :goto_4

    .line 186
    :goto_3
    const-string v1, "Error shuffling queue"

    .line 187
    .line 188
    invoke-static {v3, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 189
    .line 190
    .line 191
    :cond_4
    :goto_4
    invoke-virtual {p0}, Lwk3;->k0()V

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :pswitch_0
    iget-object v0, p0, Lwk3;->l0:Llv4;

    .line 196
    .line 197
    if-nez v0, :cond_5

    .line 198
    .line 199
    goto :goto_6

    .line 200
    :cond_5
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    sget-object v1, Lj65;->a:Ljava/util/WeakHashMap;

    .line 213
    .line 214
    invoke-static {v0}, Lb65;->a(Landroid/view/View;)Lpb5;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    if-nez v0, :cond_6

    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_6
    const/16 v1, 0x207

    .line 222
    .line 223
    iget-object v0, v0, Lpb5;->a:Lmb5;

    .line 224
    .line 225
    invoke-virtual {v0, v1}, Lmb5;->h(I)Lvz1;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    iget v2, v0, Lvz1;->d:I

    .line 230
    .line 231
    :goto_5
    iget-object v0, p0, Lwk3;->l0:Llv4;

    .line 232
    .line 233
    iget-object v0, v0, Llv4;->t:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 236
    .line 237
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    iget-object v3, p0, Lwk3;->l0:Llv4;

    .line 242
    .line 243
    iget-object v3, v3, Llv4;->t:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    .line 246
    .line 247
    invoke-virtual {v3}, Landroid/view/View;->getPaddingTop()I

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    iget-object p0, p0, Lwk3;->l0:Llv4;

    .line 252
    .line 253
    iget-object p0, p0, Llv4;->t:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 256
    .line 257
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 258
    .line 259
    .line 260
    move-result p0

    .line 261
    invoke-virtual {v0, v1, v3, p0, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 262
    .line 263
    .line 264
    :goto_6
    return-void

    .line 265
    :pswitch_1
    :try_start_1
    iget-object v0, p0, Lwk3;->v0:Lbl2;

    .line 266
    .line 267
    invoke-virtual {v0}, Lu0;->get()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    check-cast v0, Lbj2;

    .line 272
    .line 273
    invoke-static {}, Lu52;->c()Lv52;

    .line 274
    .line 275
    .line 276
    move-result-object v2

    .line 277
    iget-boolean v2, v2, Lv52;->a:Z

    .line 278
    .line 279
    if-eqz v2, :cond_7

    .line 280
    .line 281
    invoke-static {}, Lu52;->c()Lv52;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    iget v0, v0, Lv52;->o:I

    .line 286
    .line 287
    goto :goto_7

    .line 288
    :catch_1
    move-exception v0

    .line 289
    goto :goto_9

    .line 290
    :cond_7
    invoke-virtual {v0}, Lsk2;->o0()I

    .line 291
    .line 292
    .line 293
    move-result v0

    .line 294
    :goto_7
    add-int/lit8 v6, v0, 0x1

    .line 295
    .line 296
    iget-object v0, p0, Lwk3;->w0:Lyk3;

    .line 297
    .line 298
    iget-object v0, v0, Lyk3;->s:Ljava/util/List;

    .line 299
    .line 300
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 301
    .line 302
    .line 303
    move-result v7

    .line 304
    iget-object v5, p0, Lwk3;->v0:Lbl2;

    .line 305
    .line 306
    iget-object v0, p0, Lwk3;->w0:Lyk3;

    .line 307
    .line 308
    iget-object v8, v0, Lyk3;->s:Ljava/util/List;

    .line 309
    .line 310
    sget-object v0, Lbo2;->a:Ljava/lang/ref/WeakReference;

    .line 311
    .line 312
    const-string v0, "remove"

    .line 313
    .line 314
    invoke-static {v0, v6, v7}, Lu52;->q(Ljava/lang/String;II)Z

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    if-eqz v0, :cond_8

    .line 319
    .line 320
    goto :goto_8

    .line 321
    :cond_8
    if-eqz v5, :cond_9

    .line 322
    .line 323
    new-instance v4, Lvn2;

    .line 324
    .line 325
    const/4 v9, 0x0

    .line 326
    invoke-direct/range {v4 .. v9}, Lvn2;-><init>(Lbl2;IILjava/util/List;I)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v5, v4, v1}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 330
    .line 331
    .line 332
    :cond_9
    :goto_8
    iget-object v0, p0, Lwk3;->l0:Llv4;

    .line 333
    .line 334
    iget-object v0, v0, Llv4;->t:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 337
    .line 338
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ldw3;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    sub-int/2addr v7, v6

    .line 343
    iget-object v0, v0, Ldw3;->n:Lew3;

    .line 344
    .line 345
    invoke-virtual {v0, v6, v7}, Lew3;->f(II)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 346
    .line 347
    .line 348
    goto :goto_a

    .line 349
    :goto_9
    const-string v1, "Error clearing queue"

    .line 350
    .line 351
    invoke-static {v3, v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 352
    .line 353
    .line 354
    :goto_a
    invoke-virtual {p0}, Lwk3;->k0()V

    .line 355
    .line 356
    .line 357
    return-void

    .line 358
    :pswitch_2
    iget-object p0, p0, Lwk3;->w0:Lyk3;

    .line 359
    .line 360
    if-eqz p0, :cond_a

    .line 361
    .line 362
    invoke-virtual {p0}, Ldw3;->d()V

    .line 363
    .line 364
    .line 365
    :cond_a
    return-void

    .line 366
    :pswitch_3
    iget-object p0, p0, Lwk3;->w0:Lyk3;

    .line 367
    .line 368
    if-eqz p0, :cond_b

    .line 369
    .line 370
    invoke-virtual {p0}, Ldw3;->d()V

    .line 371
    .line 372
    .line 373
    :cond_b
    return-void

    .line 374
    :pswitch_4
    iget-boolean v0, p0, Lwk3;->s0:Z

    .line 375
    .line 376
    if-eqz v0, :cond_c

    .line 377
    .line 378
    invoke-virtual {p0}, Lwk3;->k0()V

    .line 379
    .line 380
    .line 381
    :cond_c
    return-void

    .line 382
    :pswitch_5
    :try_start_2
    invoke-static {}, Lu52;->c()Lv52;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    iget-boolean v0, v0, Lv52;->a:Z

    .line 387
    .line 388
    if-eqz v0, :cond_d

    .line 389
    .line 390
    invoke-static {}, Lu52;->c()Lv52;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    iget v0, v0, Lv52;->o:I

    .line 395
    .line 396
    :goto_b
    int-to-long v0, v0

    .line 397
    goto :goto_c

    .line 398
    :catch_2
    move-exception v0

    .line 399
    move-object p0, v0

    .line 400
    goto :goto_d

    .line 401
    :cond_d
    iget-object v0, p0, Lwk3;->v0:Lbl2;

    .line 402
    .line 403
    invoke-virtual {v0}, Lu0;->get()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    check-cast v0, Lbj2;

    .line 408
    .line 409
    invoke-virtual {v0}, Lsk2;->o0()I

    .line 410
    .line 411
    .line 412
    move-result v0

    .line 413
    goto :goto_b

    .line 414
    :goto_c
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    new-instance v4, Lmm;

    .line 419
    .line 420
    const/4 v5, 0x5

    .line 421
    invoke-direct {v4, p0, v0, v1, v5}, Lmm;-><init>(Ljava/lang/Object;JI)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v2, v4}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 425
    .line 426
    .line 427
    goto :goto_e

    .line 428
    :goto_d
    const-string v0, "Failed to get mediaBrowserListenableFuture in onResume"

    .line 429
    .line 430
    invoke-static {v3, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 431
    .line 432
    .line 433
    :goto_e
    return-void

    .line 434
    nop

    .line 435
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
