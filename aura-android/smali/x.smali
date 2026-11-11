.class public final synthetic Lx;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 12
    iput p1, p0, Lx;->n:I

    iput-object p2, p0, Lx;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 11
    iput p1, p0, Lx;->n:I

    iput-object p2, p0, Lx;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lzg5;Lpu0;Lfx3;)V
    .locals 0

    .line 1
    const/16 p1, 0xb

    .line 2
    .line 3
    iput p1, p0, Lx;->n:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p3, p0, Lx;->o:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lx;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ldl3;

    .line 12
    .line 13
    check-cast p1, Ljava/lang/String;

    .line 14
    .line 15
    iget-object p0, p0, Ldl3;->c:Lmm3;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lmm3;->e(Ljava/lang/String;)Lt24;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :pswitch_0
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 25
    .line 26
    check-cast p1, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getKind()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v2, "progress"

    .line 36
    .line 37
    invoke-static {v0, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getPlaybackId()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getPlaybackId()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v0, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getDeviceId()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getDeviceId()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-static {v0, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_0

    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getAccount()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getAccount()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-static {v0, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_0

    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getTs()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const/16 v2, 0xf

    .line 90
    .line 91
    invoke-static {v2, v0}, Lqm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getTs()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-static {v2, v4}, Lqm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-eqz v0, :cond_0

    .line 108
    .line 109
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getListenedMs()Ljava/lang/Long;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    if-eqz v0, :cond_0

    .line 114
    .line 115
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getListenedMs()Ljava/lang/Long;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 120
    .line 121
    .line 122
    move-result-wide v4

    .line 123
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getListenedMs()Ljava/lang/Long;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 128
    .line 129
    .line 130
    move-result-wide p0

    .line 131
    cmp-long p0, v4, p0

    .line 132
    .line 133
    if-gtz p0, :cond_0

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_0
    move v1, v3

    .line 137
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0

    .line 142
    :pswitch_1
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p0, Lgd3;

    .line 145
    .line 146
    check-cast p1, Ljava/lang/Float;

    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    iget-object p0, p0, Lgd3;->b:Llm0;

    .line 153
    .line 154
    invoke-virtual {p0}, Lad3;->p()I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    if-eqz v0, :cond_1

    .line 159
    .line 160
    invoke-virtual {p0}, Lad3;->p()I

    .line 161
    .line 162
    .line 163
    move-result v0

    .line 164
    int-to-float v0, v0

    .line 165
    div-float/2addr p1, v0

    .line 166
    goto :goto_1

    .line 167
    :cond_1
    const/4 p1, 0x0

    .line 168
    :goto_1
    invoke-static {p1}, Lji2;->L(F)I

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    invoke-virtual {p0}, Lad3;->k()I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    add-int/2addr v0, p1

    .line 177
    invoke-virtual {p0, v0}, Lad3;->j(I)I

    .line 178
    .line 179
    .line 180
    move-result p1

    .line 181
    iget-object p0, p0, Lad3;->q:Lwd3;

    .line 182
    .line 183
    invoke-virtual {p0, p1}, Lwd3;->h(I)V

    .line 184
    .line 185
    .line 186
    sget-object p0, Lj15;->a:Lj15;

    .line 187
    .line 188
    return-object p0

    .line 189
    :pswitch_2
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast p0, Lq03;

    .line 192
    .line 193
    check-cast p1, Lbx2;

    .line 194
    .line 195
    invoke-virtual {p0, p1}, Lq03;->a(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 199
    .line 200
    return-object p0

    .line 201
    :pswitch_3
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast p0, Ln13;

    .line 204
    .line 205
    check-cast p1, Ljava/lang/Throwable;

    .line 206
    .line 207
    invoke-virtual {p0, v2}, Ln13;->f(Ljava/lang/Object;)V

    .line 208
    .line 209
    .line 210
    sget-object p0, Lj15;->a:Lj15;

    .line 211
    .line 212
    return-object p0

    .line 213
    :pswitch_4
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast p0, Lug2;

    .line 216
    .line 217
    check-cast p1, Ljava/lang/Integer;

    .line 218
    .line 219
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    invoke-virtual {p0, p1}, Lug2;->b(I)Lsg2;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    return-object p0

    .line 228
    :pswitch_5
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast p0, Lx44;

    .line 231
    .line 232
    if-eqz p0, :cond_2

    .line 233
    .line 234
    invoke-interface {p0, p1}, Lx44;->b(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    :cond_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    return-object p0

    .line 243
    :pswitch_6
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast p0, Ll82;

    .line 246
    .line 247
    check-cast p1, Lyr0;

    .line 248
    .line 249
    new-instance p1, La82;

    .line 250
    .line 251
    const/4 v0, 0x2

    .line 252
    invoke-direct {p1, v0, p0}, La82;-><init>(ILjava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    return-object p1

    .line 256
    :pswitch_7
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 257
    .line 258
    check-cast p0, Lb82;

    .line 259
    .line 260
    check-cast p1, Lyr0;

    .line 261
    .line 262
    new-instance p1, La82;

    .line 263
    .line 264
    invoke-direct {p1, v3, p0}, La82;-><init>(ILjava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    return-object p1

    .line 268
    :pswitch_8
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast p0, Lh62;

    .line 271
    .line 272
    check-cast p1, Lv52;

    .line 273
    .line 274
    iget-object v0, p0, Lh62;->B0:Landroidx/preference/Preference;

    .line 275
    .line 276
    const-string v1, "controlledDevice"

    .line 277
    .line 278
    if-eqz v0, :cond_8

    .line 279
    .line 280
    iget-boolean v3, p1, Lv52;->a:Z

    .line 281
    .line 282
    invoke-virtual {v0, v3}, Landroidx/preference/Preference;->A(Z)V

    .line 283
    .line 284
    .line 285
    iget-object v0, p0, Lh62;->C0:Landroidx/preference/Preference;

    .line 286
    .line 287
    if-eqz v0, :cond_7

    .line 288
    .line 289
    iget-boolean v3, p1, Lv52;->a:Z

    .line 290
    .line 291
    invoke-virtual {v0, v3}, Landroidx/preference/Preference;->A(Z)V

    .line 292
    .line 293
    .line 294
    iget-object v0, p0, Lh62;->B0:Landroidx/preference/Preference;

    .line 295
    .line 296
    if-eqz v0, :cond_6

    .line 297
    .line 298
    iget-boolean v1, p1, Lv52;->b:Z

    .line 299
    .line 300
    iget-object v3, p1, Lv52;->c:Ljava/lang/String;

    .line 301
    .line 302
    if-eqz v1, :cond_3

    .line 303
    .line 304
    goto :goto_3

    .line 305
    :cond_3
    iget p1, p1, Lv52;->r:I

    .line 306
    .line 307
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 308
    .line 309
    .line 310
    move-result-object v1

    .line 311
    if-eqz p1, :cond_4

    .line 312
    .line 313
    move-object v2, v1

    .line 314
    :cond_4
    if-eqz v2, :cond_5

    .line 315
    .line 316
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 317
    .line 318
    .line 319
    move-result p1

    .line 320
    goto :goto_2

    .line 321
    :cond_5
    const p1, 0x7f1302b0

    .line 322
    .line 323
    .line 324
    :goto_2
    invoke-virtual {p0, p1}, Lkc1;->s(I)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    filled-new-array {v3, p1}, [Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    const v1, 0x7f1302b7

    .line 333
    .line 334
    .line 335
    invoke-virtual {p0, v1, p1}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    :goto_3
    invoke-virtual {v0, v3}, Landroidx/preference/Preference;->x(Ljava/lang/CharSequence;)V

    .line 343
    .line 344
    .line 345
    sget-object p0, Lj15;->a:Lj15;

    .line 346
    .line 347
    return-object p0

    .line 348
    :cond_6
    invoke-static {v1}, Lh12;->Q(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    throw v2

    .line 352
    :cond_7
    const-string p0, "releaseControl"

    .line 353
    .line 354
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    throw v2

    .line 358
    :cond_8
    invoke-static {v1}, Lh12;->Q(Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    throw v2

    .line 362
    :pswitch_9
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 363
    .line 364
    check-cast p0, Lqi3;

    .line 365
    .line 366
    check-cast p1, Ljava/lang/Integer;

    .line 367
    .line 368
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 369
    .line 370
    .line 371
    move-result p1

    .line 372
    sget-boolean v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 373
    .line 374
    invoke-interface {p0, p1}, Lqi3;->Y(I)Lgn2;

    .line 375
    .line 376
    .line 377
    move-result-object p0

    .line 378
    iget-object p0, p0, Lgn2;->a:Ljava/lang/String;

    .line 379
    .line 380
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    return-object p0

    .line 384
    :pswitch_a
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;

    .line 387
    .line 388
    check-cast p1, Ljava/lang/String;

    .line 389
    .line 390
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->h0()V

    .line 391
    .line 392
    .line 393
    sget-object p0, Lj15;->a:Lj15;

    .line 394
    .line 395
    return-object p0

    .line 396
    :pswitch_b
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 397
    .line 398
    check-cast p0, Lcom/eddyizm/tempus/viewmodel/b;

    .line 399
    .line 400
    check-cast p1, Ljava/lang/String;

    .line 401
    .line 402
    iget-object p0, p0, Lcom/eddyizm/tempus/viewmodel/b;->h:Lmm3;

    .line 403
    .line 404
    iget-object p0, p0, Lmm3;->b:Lml3;

    .line 405
    .line 406
    iget-object v0, p0, Lml3;->a:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast v0, Ls24;

    .line 409
    .line 410
    invoke-virtual {v0}, Ls24;->i()Ls12;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    const-string v1, "playlist"

    .line 415
    .line 416
    const-string v2, "pinned_playlist"

    .line 417
    .line 418
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    new-instance v2, Lil3;

    .line 423
    .line 424
    invoke-direct {v2, p0, p1, v3}, Lil3;-><init>(Lml3;Ljava/lang/String;I)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v0, v1, v2}, Ls12;->a([Ljava/lang/String;Lif1;)Lt24;

    .line 428
    .line 429
    .line 430
    move-result-object p0

    .line 431
    return-object p0

    .line 432
    :pswitch_c
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 433
    .line 434
    move-object v0, p0

    .line 435
    check-cast v0, Lfo1;

    .line 436
    .line 437
    check-cast p1, Ljava/util/List;

    .line 438
    .line 439
    if-nez p1, :cond_9

    .line 440
    .line 441
    sget-object p1, Lu01;->n:Lu01;

    .line 442
    .line 443
    :cond_9
    iput-object p1, v0, Lfo1;->j:Ljava/lang/Object;

    .line 444
    .line 445
    iget-object p0, v0, Lfo1;->c:Ljava/lang/Object;

    .line 446
    .line 447
    check-cast p0, Luc1;

    .line 448
    .line 449
    iget-object v1, p0, Luc1;->z:Lcom/google/android/material/textfield/TextInputEditText;

    .line 450
    .line 451
    iget-object v3, p0, Luc1;->r:Lcom/google/android/material/textfield/TextInputEditText;

    .line 452
    .line 453
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 454
    .line 455
    .line 456
    move-result-object v4

    .line 457
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 458
    .line 459
    .line 460
    move-result p0

    .line 461
    if-nez p0, :cond_a

    .line 462
    .line 463
    goto :goto_4

    .line 464
    :cond_a
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v2

    .line 468
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 469
    .line 470
    .line 471
    move-result p0

    .line 472
    if-nez p0, :cond_b

    .line 473
    .line 474
    goto :goto_4

    .line 475
    :cond_b
    move-object p0, v2

    .line 476
    check-cast p0, Lcom/eddyizm/tempus/model/Server;

    .line 477
    .line 478
    invoke-virtual {p0}, Lcom/eddyizm/tempus/model/Server;->getTimestamp()J

    .line 479
    .line 480
    .line 481
    move-result-wide p0

    .line 482
    :cond_c
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v5

    .line 486
    move-object v6, v5

    .line 487
    check-cast v6, Lcom/eddyizm/tempus/model/Server;

    .line 488
    .line 489
    invoke-virtual {v6}, Lcom/eddyizm/tempus/model/Server;->getTimestamp()J

    .line 490
    .line 491
    .line 492
    move-result-wide v6

    .line 493
    cmp-long v8, p0, v6

    .line 494
    .line 495
    if-gez v8, :cond_d

    .line 496
    .line 497
    move-object v2, v5

    .line 498
    move-wide p0, v6

    .line 499
    :cond_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 500
    .line 501
    .line 502
    move-result v5

    .line 503
    if-nez v5, :cond_c

    .line 504
    .line 505
    :goto_4
    check-cast v2, Lcom/eddyizm/tempus/model/Server;

    .line 506
    .line 507
    if-nez v2, :cond_e

    .line 508
    .line 509
    goto :goto_5

    .line 510
    :cond_e
    iget-object p0, v0, Lfo1;->d:Ljava/io/Serializable;

    .line 511
    .line 512
    check-cast p0, Lco1;

    .line 513
    .line 514
    sget-object p1, Lco1;->n:Lco1;

    .line 515
    .line 516
    if-ne p0, p1, :cond_f

    .line 517
    .line 518
    invoke-virtual {v3}, Lhg;->getText()Landroid/text/Editable;

    .line 519
    .line 520
    .line 521
    move-result-object p0

    .line 522
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object p0

    .line 526
    const-string p1, "http://192.168.1.129:4533"

    .line 527
    .line 528
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 529
    .line 530
    .line 531
    move-result p0

    .line 532
    if-eqz p0, :cond_f

    .line 533
    .line 534
    invoke-virtual {v2}, Lcom/eddyizm/tempus/model/Server;->getAddress()Ljava/lang/String;

    .line 535
    .line 536
    .line 537
    move-result-object p0

    .line 538
    invoke-virtual {v3, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 539
    .line 540
    .line 541
    :cond_f
    invoke-virtual {v1}, Lhg;->getText()Landroid/text/Editable;

    .line 542
    .line 543
    .line 544
    move-result-object p0

    .line 545
    if-eqz p0, :cond_10

    .line 546
    .line 547
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 548
    .line 549
    .line 550
    move-result p0

    .line 551
    if-nez p0, :cond_11

    .line 552
    .line 553
    :cond_10
    invoke-virtual {v2}, Lcom/eddyizm/tempus/model/Server;->getUsername()Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object p0

    .line 557
    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 558
    .line 559
    .line 560
    :cond_11
    :goto_5
    sget-object p0, Lj15;->a:Lj15;

    .line 561
    .line 562
    return-object p0

    .line 563
    :pswitch_d
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 564
    .line 565
    check-cast p0, Lgk1;

    .line 566
    .line 567
    check-cast p1, Li35;

    .line 568
    .line 569
    invoke-virtual {p0, p1}, Lgk1;->g(Li35;)V

    .line 570
    .line 571
    .line 572
    iget-object p0, p0, Lgk1;->i:Lif1;

    .line 573
    .line 574
    if-eqz p0, :cond_12

    .line 575
    .line 576
    invoke-interface {p0, p1}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 577
    .line 578
    .line 579
    :cond_12
    sget-object p0, Lj15;->a:Lj15;

    .line 580
    .line 581
    return-object p0

    .line 582
    :pswitch_e
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 583
    .line 584
    check-cast p0, Lvj1;

    .line 585
    .line 586
    check-cast p1, Lsv0;

    .line 587
    .line 588
    invoke-interface {p1}, Lsv0;->O()Li61;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    invoke-virtual {v0}, Li61;->g()Ljz;

    .line 593
    .line 594
    .line 595
    move-result-object v0

    .line 596
    iget-object p0, p0, Lvj1;->q:Lwf1;

    .line 597
    .line 598
    if-eqz p0, :cond_13

    .line 599
    .line 600
    invoke-interface {p1}, Lsv0;->O()Li61;

    .line 601
    .line 602
    .line 603
    move-result-object p1

    .line 604
    iget-object p1, p1, Li61;->p:Ljava/lang/Object;

    .line 605
    .line 606
    check-cast p1, Lsj1;

    .line 607
    .line 608
    invoke-interface {p0, v0, p1}, Lwf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    :cond_13
    sget-object p0, Lj15;->a:Lj15;

    .line 612
    .line 613
    return-object p0

    .line 614
    :pswitch_f
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 615
    .line 616
    check-cast p0, Law;

    .line 617
    .line 618
    sget-object p1, Lj15;->a:Lj15;

    .line 619
    .line 620
    sget-object v0, Lzi1;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 621
    .line 622
    invoke-virtual {v0, v3, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 623
    .line 624
    .line 625
    move-result v0

    .line 626
    if-eqz v0, :cond_14

    .line 627
    .line 628
    invoke-interface {p0, p1}, Ly94;->d(Ljava/lang/Object;)Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    :cond_14
    return-object p1

    .line 632
    :pswitch_10
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 633
    .line 634
    check-cast p0, Lia1;

    .line 635
    .line 636
    check-cast p1, Lm05;

    .line 637
    .line 638
    iget-object v2, p1, Lm05;->b:Lgb1;

    .line 639
    .line 640
    iget v3, p1, Lm05;->c:I

    .line 641
    .line 642
    iget v4, p1, Lm05;->d:I

    .line 643
    .line 644
    iget-object v5, p1, Lm05;->e:Ljava/lang/Object;

    .line 645
    .line 646
    new-instance v0, Lm05;

    .line 647
    .line 648
    const/4 v1, 0x0

    .line 649
    invoke-direct/range {v0 .. v5}, Lm05;-><init>(Lvk0;Lgb1;IILjava/lang/Object;)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {p0, v0}, Lia1;->a(Lm05;)Ln05;

    .line 653
    .line 654
    .line 655
    move-result-object p0

    .line 656
    iget-object p0, p0, Ln05;->n:Ljava/lang/Object;

    .line 657
    .line 658
    return-object p0

    .line 659
    :pswitch_11
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 660
    .line 661
    check-cast p0, Lfx3;

    .line 662
    .line 663
    check-cast p1, Lpu0;

    .line 664
    .line 665
    iget-boolean v0, p1, Lcx2;->A:Z

    .line 666
    .line 667
    if-nez v0, :cond_15

    .line 668
    .line 669
    sget-object p0, Lqx4;->o:Lqx4;

    .line 670
    .line 671
    goto :goto_7

    .line 672
    :cond_15
    iget-object v0, p1, Lpu0;->C:Lpu0;

    .line 673
    .line 674
    if-nez v0, :cond_16

    .line 675
    .line 676
    goto :goto_6

    .line 677
    :cond_16
    const-string v0, "DragAndDropTarget self reference must be null at the start of a drag and drop session"

    .line 678
    .line 679
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 680
    .line 681
    .line 682
    :goto_6
    iput-object v2, p1, Lpu0;->C:Lpu0;

    .line 683
    .line 684
    iget-boolean p1, p0, Lfx3;->n:Z

    .line 685
    .line 686
    iput-boolean p1, p0, Lfx3;->n:Z

    .line 687
    .line 688
    sget-object p0, Lqx4;->n:Lqx4;

    .line 689
    .line 690
    :goto_7
    return-object p0

    .line 691
    :pswitch_12
    sget-object v0, Lqx4;->n:Lqx4;

    .line 692
    .line 693
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 694
    .line 695
    check-cast p0, Lzg5;

    .line 696
    .line 697
    check-cast p1, Lpu0;

    .line 698
    .line 699
    iget-object v1, p1, Lcx2;->n:Lcx2;

    .line 700
    .line 701
    iget-boolean v1, v1, Lcx2;->A:Z

    .line 702
    .line 703
    if-nez v1, :cond_17

    .line 704
    .line 705
    sget-object v0, Lqx4;->o:Lqx4;

    .line 706
    .line 707
    goto :goto_9

    .line 708
    :cond_17
    iget-object v1, p1, Lpu0;->C:Lpu0;

    .line 709
    .line 710
    if-eqz v1, :cond_19

    .line 711
    .line 712
    new-instance v3, Lx;

    .line 713
    .line 714
    const/16 v4, 0xa

    .line 715
    .line 716
    invoke-direct {v3, v4, p0}, Lx;-><init>(ILjava/lang/Object;)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v3, v1}, Lx;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object p0

    .line 723
    if-eq p0, v0, :cond_18

    .line 724
    .line 725
    goto :goto_8

    .line 726
    :cond_18
    invoke-static {v1, v3}, Lgh0;->J(Lrx4;Lif1;)V

    .line 727
    .line 728
    .line 729
    :cond_19
    :goto_8
    iput-object v2, p1, Lpu0;->C:Lpu0;

    .line 730
    .line 731
    iput-object v2, p1, Lpu0;->B:Lpu0;

    .line 732
    .line 733
    :goto_9
    return-object v0

    .line 734
    :pswitch_13
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 735
    .line 736
    check-cast p0, Led5;

    .line 737
    .line 738
    check-cast p1, Lx34;

    .line 739
    .line 740
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 741
    .line 742
    .line 743
    invoke-virtual {p0}, Led5;->call()Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    move-result-object p0

    .line 747
    return-object p0

    .line 748
    :pswitch_14
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 749
    .line 750
    check-cast p0, Lh80;

    .line 751
    .line 752
    check-cast p1, Lmf3;

    .line 753
    .line 754
    iget-object p1, p0, Lh80;->w:Lvc;

    .line 755
    .line 756
    if-nez p1, :cond_1a

    .line 757
    .line 758
    new-instance p1, Lvc;

    .line 759
    .line 760
    iget-object v0, p0, Lh80;->a:Landroid/view/View;

    .line 761
    .line 762
    invoke-direct {p1, v0}, Lvc;-><init>(Landroid/view/View;)V

    .line 763
    .line 764
    .line 765
    iput-object p1, p0, Lh80;->w:Lvc;

    .line 766
    .line 767
    :cond_1a
    return-object p1

    .line 768
    :pswitch_15
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 769
    .line 770
    check-cast p0, Landroid/os/CancellationSignal;

    .line 771
    .line 772
    check-cast p1, Ljava/lang/Throwable;

    .line 773
    .line 774
    if-eqz p1, :cond_1b

    .line 775
    .line 776
    invoke-virtual {p0}, Landroid/os/CancellationSignal;->cancel()V

    .line 777
    .line 778
    .line 779
    :cond_1b
    sget-object p0, Lj15;->a:Lj15;

    .line 780
    .line 781
    return-object p0

    .line 782
    :pswitch_16
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 783
    .line 784
    check-cast p0, Landroid/content/res/Resources;

    .line 785
    .line 786
    check-cast p1, Li94;

    .line 787
    .line 788
    invoke-static {p1, p0}, Lxl;->z(Li94;Landroid/content/res/Resources;)Z

    .line 789
    .line 790
    .line 791
    move-result p0

    .line 792
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 793
    .line 794
    .line 795
    move-result-object p0

    .line 796
    return-object p0

    .line 797
    :pswitch_17
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 798
    .line 799
    check-cast p0, Le02;

    .line 800
    .line 801
    check-cast p1, Li94;

    .line 802
    .line 803
    iget p1, p1, Li94;->f:I

    .line 804
    .line 805
    invoke-virtual {p0, p1}, Le02;->a(I)Z

    .line 806
    .line 807
    .line 808
    move-result p0

    .line 809
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 810
    .line 811
    .line 812
    move-result-object p0

    .line 813
    return-object p0

    .line 814
    :pswitch_18
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 815
    .line 816
    check-cast p0, Lma;

    .line 817
    .line 818
    move-object v4, p1

    .line 819
    check-cast v4, Laf2;

    .line 820
    .line 821
    iget-object p0, p0, Lma;->C:Lra;

    .line 822
    .line 823
    invoke-virtual {p0}, Lra;->getInsetsListener()Lxz1;

    .line 824
    .line 825
    .line 826
    move-result-object p1

    .line 827
    iget-object p1, p1, Lxz1;->t:Lwd3;

    .line 828
    .line 829
    invoke-virtual {p1}, Lwd3;->g()I

    .line 830
    .line 831
    .line 832
    move-result p1

    .line 833
    if-lez p1, :cond_1f

    .line 834
    .line 835
    sget-object p1, Lyb5;->a:Li03;

    .line 836
    .line 837
    iput-boolean v1, v4, Laf2;->n:Z

    .line 838
    .line 839
    iget-object p1, v4, Laf2;->q:Lcf2;

    .line 840
    .line 841
    invoke-virtual {p1}, Lcf2;->e0()Lq62;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    iget-wide v1, v4, Laf2;->o:J

    .line 846
    .line 847
    const-wide v5, 0x7fffffff7fffffffL

    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    invoke-static {v1, v2, v5, v6}, Lg02;->a(JJ)Z

    .line 853
    .line 854
    .line 855
    move-result v1

    .line 856
    if-eqz v1, :cond_1c

    .line 857
    .line 858
    const-wide/16 v1, 0x0

    .line 859
    .line 860
    invoke-interface {v0, v1, v2}, Lq62;->q(J)J

    .line 861
    .line 862
    .line 863
    move-result-wide v1

    .line 864
    invoke-static {v1, v2}, Lji2;->K(J)J

    .line 865
    .line 866
    .line 867
    move-result-wide v1

    .line 868
    iput-wide v1, v4, Laf2;->o:J

    .line 869
    .line 870
    invoke-interface {v0}, Lq62;->k()J

    .line 871
    .line 872
    .line 873
    move-result-wide v1

    .line 874
    iput-wide v1, v4, Laf2;->p:J

    .line 875
    .line 876
    :cond_1c
    invoke-virtual {p1}, Lcf2;->g0()Lc72;

    .line 877
    .line 878
    .line 879
    move-result-object p1

    .line 880
    iget-object p1, p1, Lc72;->R:Lf72;

    .line 881
    .line 882
    invoke-virtual {p1}, Lf72;->b()V

    .line 883
    .line 884
    .line 885
    invoke-interface {v0}, Lq62;->k()J

    .line 886
    .line 887
    .line 888
    move-result-wide v0

    .line 889
    invoke-virtual {p0}, Lra;->getInsetsListener()Lxz1;

    .line 890
    .line 891
    .line 892
    move-result-object p1

    .line 893
    iget-object p1, p1, Lxz1;->s:Lw03;

    .line 894
    .line 895
    const/16 v2, 0x20

    .line 896
    .line 897
    shr-long v5, v0, v2

    .line 898
    .line 899
    long-to-int v8, v5

    .line 900
    const-wide v5, 0xffffffffL

    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    and-long/2addr v0, v5

    .line 906
    long-to-int v9, v0

    .line 907
    sget-object v0, Lyb5;->b:[Lwb5;

    .line 908
    .line 909
    array-length v1, v0

    .line 910
    move v2, v3

    .line 911
    :goto_a
    if-ge v2, v1, :cond_1e

    .line 912
    .line 913
    aget-object v10, v0, v2

    .line 914
    .line 915
    invoke-virtual {p1, v10}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 916
    .line 917
    .line 918
    move-result-object v5

    .line 919
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    move-object v11, v5

    .line 923
    check-cast v11, Ljc5;

    .line 924
    .line 925
    move-object v5, v10

    .line 926
    check-cast v5, Lxb5;

    .line 927
    .line 928
    iget-object v5, v5, Lxb5;->c:Ljz1;

    .line 929
    .line 930
    iget-wide v6, v11, Ljc5;->h:J

    .line 931
    .line 932
    invoke-static/range {v4 .. v9}, Lyb5;->a(Laf2;Ljz1;JII)V

    .line 933
    .line 934
    .line 935
    iget-object v5, v11, Ljc5;->b:Lzd3;

    .line 936
    .line 937
    invoke-virtual {v5}, Lzd3;->getValue()Ljava/lang/Object;

    .line 938
    .line 939
    .line 940
    move-result-object v5

    .line 941
    check-cast v5, Ljava/lang/Boolean;

    .line 942
    .line 943
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 944
    .line 945
    .line 946
    move-result v5

    .line 947
    if-eqz v5, :cond_1d

    .line 948
    .line 949
    iget-object v5, v11, Ljc5;->f:Ljz1;

    .line 950
    .line 951
    iget-wide v6, v11, Ljc5;->j:J

    .line 952
    .line 953
    invoke-static/range {v4 .. v9}, Lyb5;->a(Laf2;Ljz1;JII)V

    .line 954
    .line 955
    .line 956
    iget-object v5, v11, Ljc5;->g:Ljz1;

    .line 957
    .line 958
    iget-wide v6, v11, Ljc5;->k:J

    .line 959
    .line 960
    invoke-static/range {v4 .. v9}, Lyb5;->a(Laf2;Ljz1;JII)V

    .line 961
    .line 962
    .line 963
    :cond_1d
    check-cast v10, Lxb5;

    .line 964
    .line 965
    iget-object v5, v10, Lxb5;->d:Ljz1;

    .line 966
    .line 967
    iget-wide v6, v11, Ljc5;->i:J

    .line 968
    .line 969
    invoke-static/range {v4 .. v9}, Lyb5;->a(Laf2;Ljz1;JII)V

    .line 970
    .line 971
    .line 972
    add-int/lit8 v2, v2, 0x1

    .line 973
    .line 974
    goto :goto_a

    .line 975
    :cond_1e
    invoke-virtual {p0}, Lra;->getInsetsListener()Lxz1;

    .line 976
    .line 977
    .line 978
    move-result-object p1

    .line 979
    iget-object p1, p1, Lxz1;->u:Lq03;

    .line 980
    .line 981
    invoke-virtual {p1}, Lq03;->i()Z

    .line 982
    .line 983
    .line 984
    move-result v0

    .line 985
    if-eqz v0, :cond_1f

    .line 986
    .line 987
    invoke-virtual {p0}, Lra;->getInsetsListener()Lxz1;

    .line 988
    .line 989
    .line 990
    move-result-object p0

    .line 991
    iget-object p0, p0, Lxz1;->v:Lrh4;

    .line 992
    .line 993
    iget-object v0, p1, Lq03;->a:[Ljava/lang/Object;

    .line 994
    .line 995
    iget p1, p1, Lq03;->b:I

    .line 996
    .line 997
    :goto_b
    if-ge v3, p1, :cond_1f

    .line 998
    .line 999
    aget-object v1, v0, v3

    .line 1000
    .line 1001
    check-cast v1, Lb13;

    .line 1002
    .line 1003
    invoke-virtual {p0, v3}, Lrh4;->get(I)Ljava/lang/Object;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v2

    .line 1007
    check-cast v2, Ljz1;

    .line 1008
    .line 1009
    invoke-interface {v1}, Lkl4;->getValue()Ljava/lang/Object;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v1

    .line 1013
    check-cast v1, Landroid/graphics/Rect;

    .line 1014
    .line 1015
    invoke-virtual {v2}, Ljz1;->b()Lrp1;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v5

    .line 1019
    iget v6, v1, Landroid/graphics/Rect;->left:I

    .line 1020
    .line 1021
    int-to-float v6, v6

    .line 1022
    invoke-virtual {v4, v5, v6}, Laf2;->a(Lrp1;F)V

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {v2}, Ljz1;->d()Lrp1;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v5

    .line 1029
    iget v6, v1, Landroid/graphics/Rect;->top:I

    .line 1030
    .line 1031
    int-to-float v6, v6

    .line 1032
    invoke-virtual {v4, v5, v6}, Laf2;->a(Lrp1;F)V

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual {v2}, Ljz1;->c()Lrp1;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v5

    .line 1039
    iget v6, v1, Landroid/graphics/Rect;->right:I

    .line 1040
    .line 1041
    int-to-float v6, v6

    .line 1042
    invoke-virtual {v4, v5, v6}, Laf2;->a(Lrp1;F)V

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v2}, Ljz1;->a()Lrp1;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v2

    .line 1049
    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    .line 1050
    .line 1051
    int-to-float v1, v1

    .line 1052
    invoke-virtual {v4, v2, v1}, Laf2;->a(Lrp1;F)V

    .line 1053
    .line 1054
    .line 1055
    add-int/lit8 v3, v3, 0x1

    .line 1056
    .line 1057
    goto :goto_b

    .line 1058
    :cond_1f
    sget-object p0, Lj15;->a:Lj15;

    .line 1059
    .line 1060
    return-object p0

    .line 1061
    :pswitch_19
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 1062
    .line 1063
    check-cast p0, Lo91;

    .line 1064
    .line 1065
    check-cast p1, Lba1;

    .line 1066
    .line 1067
    iget p0, p0, Lo91;->a:I

    .line 1068
    .line 1069
    invoke-virtual {p1, p0}, Lba1;->y0(I)Z

    .line 1070
    .line 1071
    .line 1072
    move-result p0

    .line 1073
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1074
    .line 1075
    .line 1076
    move-result-object p0

    .line 1077
    return-object p0

    .line 1078
    :pswitch_1a
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 1079
    .line 1080
    check-cast p0, Ld72;

    .line 1081
    .line 1082
    check-cast p1, Lk9;

    .line 1083
    .line 1084
    invoke-interface {p1}, Lk9;->n()I

    .line 1085
    .line 1086
    .line 1087
    move-result v0

    .line 1088
    const v1, 0x7fffffff

    .line 1089
    .line 1090
    .line 1091
    if-ne v0, v1, :cond_20

    .line 1092
    .line 1093
    goto/16 :goto_f

    .line 1094
    .line 1095
    :cond_20
    invoke-interface {p1}, Lk9;->a()Ld72;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v0

    .line 1099
    iget-boolean v0, v0, Ld72;->b:Z

    .line 1100
    .line 1101
    if-eqz v0, :cond_21

    .line 1102
    .line 1103
    invoke-interface {p1}, Lk9;->y()V

    .line 1104
    .line 1105
    .line 1106
    :cond_21
    invoke-interface {p1}, Lk9;->a()Ld72;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v0

    .line 1110
    iget-object v0, v0, Ld72;->g:Ljava/util/HashMap;

    .line 1111
    .line 1112
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v0

    .line 1116
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v0

    .line 1120
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1121
    .line 1122
    .line 1123
    move-result v1

    .line 1124
    if-eqz v1, :cond_22

    .line 1125
    .line 1126
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v1

    .line 1130
    check-cast v1, Ljava/util/Map$Entry;

    .line 1131
    .line 1132
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v2

    .line 1136
    check-cast v2, Lpp1;

    .line 1137
    .line 1138
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v1

    .line 1142
    check-cast v1, Ljava/lang/Number;

    .line 1143
    .line 1144
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1145
    .line 1146
    .line 1147
    move-result v1

    .line 1148
    invoke-interface {p1}, Lk9;->c()Liz1;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v3

    .line 1152
    invoke-virtual {p0, v2, v1, v3}, Ld72;->a(Lpp1;ILf63;)V

    .line 1153
    .line 1154
    .line 1155
    goto :goto_c

    .line 1156
    :cond_22
    invoke-interface {p1}, Lk9;->c()Liz1;

    .line 1157
    .line 1158
    .line 1159
    move-result-object p1

    .line 1160
    iget-object p1, p1, Lf63;->J:Lf63;

    .line 1161
    .line 1162
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1163
    .line 1164
    .line 1165
    :goto_d
    iget-object v0, p0, Ld72;->a:Lk9;

    .line 1166
    .line 1167
    invoke-interface {v0}, Lk9;->c()Liz1;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v0

    .line 1171
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1172
    .line 1173
    .line 1174
    move-result v0

    .line 1175
    if-nez v0, :cond_24

    .line 1176
    .line 1177
    invoke-virtual {p0, p1}, Ld72;->b(Lf63;)Ljava/util/Map;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v0

    .line 1181
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v0

    .line 1185
    check-cast v0, Ljava/lang/Iterable;

    .line 1186
    .line 1187
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v0

    .line 1191
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1192
    .line 1193
    .line 1194
    move-result v1

    .line 1195
    if-eqz v1, :cond_23

    .line 1196
    .line 1197
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v1

    .line 1201
    check-cast v1, Lpp1;

    .line 1202
    .line 1203
    invoke-virtual {p0, p1, v1}, Ld72;->c(Lf63;Lpp1;)I

    .line 1204
    .line 1205
    .line 1206
    move-result v2

    .line 1207
    invoke-virtual {p0, v1, v2, p1}, Ld72;->a(Lpp1;ILf63;)V

    .line 1208
    .line 1209
    .line 1210
    goto :goto_e

    .line 1211
    :cond_23
    iget-object p1, p1, Lf63;->J:Lf63;

    .line 1212
    .line 1213
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1214
    .line 1215
    .line 1216
    goto :goto_d

    .line 1217
    :cond_24
    :goto_f
    sget-object p0, Lj15;->a:Lj15;

    .line 1218
    .line 1219
    return-object p0

    .line 1220
    :pswitch_1b
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 1221
    .line 1222
    check-cast p0, Lnf3;

    .line 1223
    .line 1224
    check-cast p1, Ljava/util/Map$Entry;

    .line 1225
    .line 1226
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1227
    .line 1228
    .line 1229
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1230
    .line 1231
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 1232
    .line 1233
    .line 1234
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v1

    .line 1238
    const-string v2, "(this Map)"

    .line 1239
    .line 1240
    if-ne v1, p0, :cond_25

    .line 1241
    .line 1242
    move-object v1, v2

    .line 1243
    goto :goto_10

    .line 1244
    :cond_25
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v1

    .line 1248
    :goto_10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1249
    .line 1250
    .line 1251
    const/16 v1, 0x3d

    .line 1252
    .line 1253
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1254
    .line 1255
    .line 1256
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1257
    .line 1258
    .line 1259
    move-result-object p1

    .line 1260
    if-ne p1, p0, :cond_26

    .line 1261
    .line 1262
    goto :goto_11

    .line 1263
    :cond_26
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v2

    .line 1267
    :goto_11
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1268
    .line 1269
    .line 1270
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1271
    .line 1272
    .line 1273
    move-result-object p0

    .line 1274
    return-object p0

    .line 1275
    :pswitch_1c
    iget-object p0, p0, Lx;->o:Ljava/lang/Object;

    .line 1276
    .line 1277
    check-cast p0, Ly;

    .line 1278
    .line 1279
    if-ne p1, p0, :cond_27

    .line 1280
    .line 1281
    const-string p0, "(this Collection)"

    .line 1282
    .line 1283
    goto :goto_12

    .line 1284
    :cond_27
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1285
    .line 1286
    .line 1287
    move-result-object p0

    .line 1288
    :goto_12
    return-object p0

    .line 1289
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
