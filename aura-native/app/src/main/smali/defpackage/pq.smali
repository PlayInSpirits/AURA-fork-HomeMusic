.class public final Ldefpackage/pq;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lcom/eddyizm/tempus/service/MediaService;

.field public final c:Ldefpackage/j60;

.field public final d:Ldefpackage/j60;

.field public final e:Ldefpackage/j60;

.field public final f:Ldefpackage/j60;

.field public final g:Ldefpackage/j60;

.field public final h:Ldefpackage/j60;

.field public final i:Ldefpackage/j60;

.field public final j:Ldefpackage/j60;

.field public final k:Ldefpackage/j60;

.field public final l:Ldefpackage/j60;

.field public final m:Ldefpackage/j60;

.field public final n:Ldefpackage/j60;

.field public final o:Ldefpackage/oq;

.field public p:Ldefpackage/kn2;

.field public final q:Landroid/os/Handler;

.field public final r:Ldefpackage/mq;

.field public final s:Ldefpackage/wa4;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/eddyizm/tempus/service/MediaService;)V
    .locals 13

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/pq;->a:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/pq;->b:Lcom/eddyizm/tempus/service/MediaService;

    .line 7
    .line 8
    new-instance p2, Ldefpackage/i60;

    .line 9
    .line 10
    const v0, 0xfe044

    .line 11
    .line 12
    .line 13
    invoke-direct {p2, v0}, Ldefpackage/i60;-><init>(I)V

    .line 14
    .line 15
    .line 16
    const v0, 0x7f13012c

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p2, Ldefpackage/i60;->f:Ljava/lang/CharSequence;

    .line 24
    .line 25
    new-instance v0, Ldefpackage/va4;

    .line 26
    .line 27
    sget-object v1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 28
    .line 29
    const-string v2, "android.media3.session.demo.SHUFFLE_ON"

    .line 30
    .line 31
    invoke-direct {v0, v2, v1}, Ldefpackage/va4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2, v0}, Ldefpackage/i60;->d(Ldefpackage/va4;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x6

    .line 38
    filled-new-array {v0}, [I

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {p2, v2}, Ldefpackage/i60;->f([I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p2}, Ldefpackage/i60;->a()Ldefpackage/j60;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    iput-object v3, p0, Ldefpackage/pq;->c:Ldefpackage/j60;

    .line 50
    .line 51
    new-instance p2, Ldefpackage/i60;

    .line 52
    .line 53
    const v2, 0xe043

    .line 54
    .line 55
    .line 56
    invoke-direct {p2, v2}, Ldefpackage/i60;-><init>(I)V

    .line 57
    .line 58
    .line 59
    const v2, 0x7f13012b

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iput-object v2, p2, Ldefpackage/i60;->f:Ljava/lang/CharSequence;

    .line 67
    .line 68
    new-instance v2, Ldefpackage/va4;

    .line 69
    .line 70
    const-string v4, "android.media3.session.demo.SHUFFLE_OFF"

    .line 71
    .line 72
    invoke-direct {v2, v4, v1}, Ldefpackage/va4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p2, v2}, Ldefpackage/i60;->d(Ldefpackage/va4;)V

    .line 76
    .line 77
    .line 78
    filled-new-array {v0}, [I

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {p2, v2}, Ldefpackage/i60;->f([I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2}, Ldefpackage/i60;->a()Ldefpackage/j60;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    iput-object v4, p0, Ldefpackage/pq;->d:Ldefpackage/j60;

    .line 90
    .line 91
    new-instance p2, Ldefpackage/i60;

    .line 92
    .line 93
    const v2, 0xfe040

    .line 94
    .line 95
    .line 96
    invoke-direct {p2, v2}, Ldefpackage/i60;-><init>(I)V

    .line 97
    .line 98
    .line 99
    const v2, 0x7f130125

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    iput-object v2, p2, Ldefpackage/i60;->f:Ljava/lang/CharSequence;

    .line 107
    .line 108
    new-instance v2, Ldefpackage/va4;

    .line 109
    .line 110
    const-string v5, "android.media3.session.demo.REPEAT_OFF"

    .line 111
    .line 112
    invoke-direct {v2, v5, v1}, Ldefpackage/va4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2, v2}, Ldefpackage/i60;->d(Ldefpackage/va4;)V

    .line 116
    .line 117
    .line 118
    filled-new-array {v0}, [I

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-virtual {p2, v2}, Ldefpackage/i60;->f([I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p2}, Ldefpackage/i60;->a()Ldefpackage/j60;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    iput-object v5, p0, Ldefpackage/pq;->e:Ldefpackage/j60;

    .line 130
    .line 131
    new-instance p2, Ldefpackage/i60;

    .line 132
    .line 133
    const v2, 0xe041

    .line 134
    .line 135
    .line 136
    invoke-direct {p2, v2}, Ldefpackage/i60;-><init>(I)V

    .line 137
    .line 138
    .line 139
    const v2, 0x7f130126

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    iput-object v2, p2, Ldefpackage/i60;->f:Ljava/lang/CharSequence;

    .line 147
    .line 148
    new-instance v2, Ldefpackage/va4;

    .line 149
    .line 150
    const-string v6, "android.media3.session.demo.REPEAT_ONE"

    .line 151
    .line 152
    invoke-direct {v2, v6, v1}, Ldefpackage/va4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p2, v2}, Ldefpackage/i60;->d(Ldefpackage/va4;)V

    .line 156
    .line 157
    .line 158
    filled-new-array {v0}, [I

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {p2, v2}, Ldefpackage/i60;->f([I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p2}, Ldefpackage/i60;->a()Ldefpackage/j60;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    iput-object v6, p0, Ldefpackage/pq;->f:Ldefpackage/j60;

    .line 170
    .line 171
    new-instance p2, Ldefpackage/i60;

    .line 172
    .line 173
    const v2, 0xe040

    .line 174
    .line 175
    .line 176
    invoke-direct {p2, v2}, Ldefpackage/i60;-><init>(I)V

    .line 177
    .line 178
    .line 179
    const v2, 0x7f130124

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    iput-object v2, p2, Ldefpackage/i60;->f:Ljava/lang/CharSequence;

    .line 187
    .line 188
    new-instance v2, Ldefpackage/va4;

    .line 189
    .line 190
    const-string v7, "android.media3.session.demo.REPEAT_ALL"

    .line 191
    .line 192
    invoke-direct {v2, v7, v1}, Ldefpackage/va4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {p2, v2}, Ldefpackage/i60;->d(Ldefpackage/va4;)V

    .line 196
    .line 197
    .line 198
    filled-new-array {v0}, [I

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-virtual {p2, v2}, Ldefpackage/i60;->f([I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p2}, Ldefpackage/i60;->a()Ldefpackage/j60;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    iput-object v7, p0, Ldefpackage/pq;->g:Ldefpackage/j60;

    .line 210
    .line 211
    new-instance p2, Ldefpackage/i60;

    .line 212
    .line 213
    const/4 v2, 0x0

    .line 214
    invoke-direct {p2, v2}, Ldefpackage/i60;-><init>(I)V

    .line 215
    .line 216
    .line 217
    const v8, 0x7f13011b

    .line 218
    .line 219
    .line 220
    invoke-virtual {p1, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v8

    .line 224
    iput-object v8, p2, Ldefpackage/i60;->f:Ljava/lang/CharSequence;

    .line 225
    .line 226
    new-instance v8, Ldefpackage/va4;

    .line 227
    .line 228
    const-string v9, "android.media3.session.demo.HEART_ON"

    .line 229
    .line 230
    invoke-direct {v8, v9, v1}, Ldefpackage/va4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p2, v8}, Ldefpackage/i60;->d(Ldefpackage/va4;)V

    .line 234
    .line 235
    .line 236
    const v8, 0x7f080128

    .line 237
    .line 238
    .line 239
    iput v8, p2, Ldefpackage/i60;->d:I

    .line 240
    .line 241
    filled-new-array {v0}, [I

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    invoke-virtual {p2, v8}, Ldefpackage/i60;->f([I)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p2}, Ldefpackage/i60;->a()Ldefpackage/j60;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    iput-object v8, p0, Ldefpackage/pq;->h:Ldefpackage/j60;

    .line 253
    .line 254
    new-instance p2, Ldefpackage/i60;

    .line 255
    .line 256
    invoke-direct {p2, v2}, Ldefpackage/i60;-><init>(I)V

    .line 257
    .line 258
    .line 259
    const v9, 0x7f13011a

    .line 260
    .line 261
    .line 262
    invoke-virtual {p1, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v9

    .line 266
    iput-object v9, p2, Ldefpackage/i60;->f:Ljava/lang/CharSequence;

    .line 267
    .line 268
    new-instance v9, Ldefpackage/va4;

    .line 269
    .line 270
    const-string v10, "android.media3.session.demo.HEART_OFF"

    .line 271
    .line 272
    invoke-direct {v9, v10, v1}, Ldefpackage/va4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p2, v9}, Ldefpackage/i60;->d(Ldefpackage/va4;)V

    .line 276
    .line 277
    .line 278
    const v9, 0x7f080129

    .line 279
    .line 280
    .line 281
    iput v9, p2, Ldefpackage/i60;->d:I

    .line 282
    .line 283
    filled-new-array {v0}, [I

    .line 284
    .line 285
    .line 286
    move-result-object v9

    .line 287
    invoke-virtual {p2, v9}, Ldefpackage/i60;->f([I)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p2}, Ldefpackage/i60;->a()Ldefpackage/j60;

    .line 291
    .line 292
    .line 293
    move-result-object v9

    .line 294
    iput-object v9, p0, Ldefpackage/pq;->i:Ldefpackage/j60;

    .line 295
    .line 296
    new-instance p2, Ldefpackage/i60;

    .line 297
    .line 298
    invoke-direct {p2, v2}, Ldefpackage/i60;-><init>(I)V

    .line 299
    .line 300
    .line 301
    const v10, 0x7f1300a9

    .line 302
    .line 303
    .line 304
    invoke-virtual {p1, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object p1

    .line 308
    iput-object p1, p2, Ldefpackage/i60;->f:Ljava/lang/CharSequence;

    .line 309
    .line 310
    new-instance p1, Ldefpackage/va4;

    .line 311
    .line 312
    const-string v10, "android.media3.session.demo.HEART_LOADING"

    .line 313
    .line 314
    invoke-direct {p1, v10, v1}, Ldefpackage/va4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {p2, p1}, Ldefpackage/i60;->d(Ldefpackage/va4;)V

    .line 318
    .line 319
    .line 320
    const p1, 0x7f080110

    .line 321
    .line 322
    .line 323
    iput p1, p2, Ldefpackage/i60;->d:I

    .line 324
    .line 325
    filled-new-array {v0}, [I

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    invoke-virtual {p2, p1}, Ldefpackage/i60;->f([I)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {p2}, Ldefpackage/i60;->a()Ldefpackage/j60;

    .line 333
    .line 334
    .line 335
    move-result-object v10

    .line 336
    new-instance p1, Ldefpackage/i60;

    .line 337
    .line 338
    invoke-direct {p1, v2}, Ldefpackage/i60;-><init>(I)V

    .line 339
    .line 340
    .line 341
    const-string p2, "instantmix on"

    .line 342
    .line 343
    iput-object p2, p1, Ldefpackage/i60;->f:Ljava/lang/CharSequence;

    .line 344
    .line 345
    new-instance p2, Ldefpackage/va4;

    .line 346
    .line 347
    const-string v11, "android.media3.session.demo.INSTANT_MIX_ON"

    .line 348
    .line 349
    invoke-direct {p2, v11, v1}, Ldefpackage/va4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {p1, p2}, Ldefpackage/i60;->d(Ldefpackage/va4;)V

    .line 353
    .line 354
    .line 355
    const p2, 0x7f080160

    .line 356
    .line 357
    .line 358
    iput p2, p1, Ldefpackage/i60;->d:I

    .line 359
    .line 360
    filled-new-array {v0}, [I

    .line 361
    .line 362
    .line 363
    move-result-object p2

    .line 364
    invoke-virtual {p1, p2}, Ldefpackage/i60;->f([I)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {p1}, Ldefpackage/i60;->a()Ldefpackage/j60;

    .line 368
    .line 369
    .line 370
    move-result-object v11

    .line 371
    iput-object v11, p0, Ldefpackage/pq;->j:Ldefpackage/j60;

    .line 372
    .line 373
    new-instance p1, Ldefpackage/i60;

    .line 374
    .line 375
    invoke-direct {p1, v2}, Ldefpackage/i60;-><init>(I)V

    .line 376
    .line 377
    .line 378
    const-string p2, "instantmix off"

    .line 379
    .line 380
    iput-object p2, p1, Ldefpackage/i60;->f:Ljava/lang/CharSequence;

    .line 381
    .line 382
    new-instance p2, Ldefpackage/va4;

    .line 383
    .line 384
    const-string v12, "android.media3.session.demo.INSTANT_MIX_OFF"

    .line 385
    .line 386
    invoke-direct {p2, v12, v1}, Ldefpackage/va4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {p1, p2}, Ldefpackage/i60;->d(Ldefpackage/va4;)V

    .line 390
    .line 391
    .line 392
    const p2, 0x7f08025d

    .line 393
    .line 394
    .line 395
    iput p2, p1, Ldefpackage/i60;->d:I

    .line 396
    .line 397
    filled-new-array {v0}, [I

    .line 398
    .line 399
    .line 400
    move-result-object p2

    .line 401
    invoke-virtual {p1, p2}, Ldefpackage/i60;->f([I)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {p1}, Ldefpackage/i60;->a()Ldefpackage/j60;

    .line 405
    .line 406
    .line 407
    move-result-object v12

    .line 408
    iput-object v12, p0, Ldefpackage/pq;->k:Ldefpackage/j60;

    .line 409
    .line 410
    new-instance p1, Ldefpackage/i60;

    .line 411
    .line 412
    const p2, 0xe045

    .line 413
    .line 414
    .line 415
    invoke-direct {p1, p2}, Ldefpackage/i60;-><init>(I)V

    .line 416
    .line 417
    .line 418
    const/4 p2, 0x7

    .line 419
    invoke-virtual {p1, p2}, Ldefpackage/i60;->c(I)V

    .line 420
    .line 421
    .line 422
    const-string p2, "Previous"

    .line 423
    .line 424
    iput-object p2, p1, Ldefpackage/i60;->f:Ljava/lang/CharSequence;

    .line 425
    .line 426
    invoke-virtual {p1}, Ldefpackage/i60;->a()Ldefpackage/j60;

    .line 427
    .line 428
    .line 429
    move-result-object p1

    .line 430
    iput-object p1, p0, Ldefpackage/pq;->l:Ldefpackage/j60;

    .line 431
    .line 432
    new-instance p1, Ldefpackage/i60;

    .line 433
    .line 434
    const p2, 0xe037

    .line 435
    .line 436
    .line 437
    invoke-direct {p1, p2}, Ldefpackage/i60;-><init>(I)V

    .line 438
    .line 439
    .line 440
    const/4 p2, 0x1

    .line 441
    invoke-virtual {p1, p2}, Ldefpackage/i60;->c(I)V

    .line 442
    .line 443
    .line 444
    const-string p2, "Play/Pause"

    .line 445
    .line 446
    iput-object p2, p1, Ldefpackage/i60;->f:Ljava/lang/CharSequence;

    .line 447
    .line 448
    invoke-virtual {p1}, Ldefpackage/i60;->a()Ldefpackage/j60;

    .line 449
    .line 450
    .line 451
    move-result-object p1

    .line 452
    iput-object p1, p0, Ldefpackage/pq;->m:Ldefpackage/j60;

    .line 453
    .line 454
    new-instance p1, Ldefpackage/i60;

    .line 455
    .line 456
    const p2, 0xe044

    .line 457
    .line 458
    .line 459
    invoke-direct {p1, p2}, Ldefpackage/i60;-><init>(I)V

    .line 460
    .line 461
    .line 462
    const/16 p2, 0x8

    .line 463
    .line 464
    invoke-virtual {p1, p2}, Ldefpackage/i60;->c(I)V

    .line 465
    .line 466
    .line 467
    const-string p2, "Next"

    .line 468
    .line 469
    iput-object p2, p1, Ldefpackage/i60;->f:Ljava/lang/CharSequence;

    .line 470
    .line 471
    invoke-virtual {p1}, Ldefpackage/i60;->a()Ldefpackage/j60;

    .line 472
    .line 473
    .line 474
    move-result-object p1

    .line 475
    iput-object p1, p0, Ldefpackage/pq;->n:Ldefpackage/j60;

    .line 476
    .line 477
    filled-new-array/range {v3 .. v12}, [Ldefpackage/j60;

    .line 478
    .line 479
    .line 480
    move-result-object p1

    .line 481
    invoke-static {p1}, Ldefpackage/gb;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 482
    .line 483
    .line 484
    move-result-object p1

    .line 485
    new-instance p2, Ldefpackage/oq;

    .line 486
    .line 487
    invoke-direct {p2, p0}, Ldefpackage/oq;-><init>(Ldefpackage/pq;)V

    .line 488
    .line 489
    .line 490
    iput-object p2, p0, Ldefpackage/pq;->o:Ldefpackage/oq;

    .line 491
    .line 492
    new-instance p2, Landroid/os/Handler;

    .line 493
    .line 494
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-direct {p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 499
    .line 500
    .line 501
    iput-object p2, p0, Ldefpackage/pq;->q:Landroid/os/Handler;

    .line 502
    .line 503
    new-instance p2, Ldefpackage/mq;

    .line 504
    .line 505
    invoke-direct {p2, p0, v2}, Ldefpackage/mq;-><init>(Ldefpackage/pq;I)V

    .line 506
    .line 507
    .line 508
    iput-object p2, p0, Ldefpackage/pq;->r:Ldefpackage/mq;

    .line 509
    .line 510
    sget-object p2, Ldefpackage/dr2;->e:Ldefpackage/wa4;

    .line 511
    .line 512
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    new-instance v0, Ljava/util/HashSet;

    .line 516
    .line 517
    iget-object p2, p2, Ldefpackage/wa4;->a:Ldefpackage/jx1;

    .line 518
    .line 519
    invoke-direct {v0, p2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 520
    .line 521
    .line 522
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 523
    .line 524
    .line 525
    move-result-object p1

    .line 526
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 527
    .line 528
    .line 529
    move-result p2

    .line 530
    if-eqz p2, :cond_1

    .line 531
    .line 532
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object p2

    .line 536
    check-cast p2, Ldefpackage/j60;

    .line 537
    .line 538
    iget-object p2, p2, Ldefpackage/j60;->a:Ldefpackage/va4;

    .line 539
    .line 540
    if-eqz p2, :cond_0

    .line 541
    .line 542
    invoke-virtual {v0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    goto :goto_0

    .line 546
    :cond_1
    new-instance p1, Ldefpackage/wa4;

    .line 547
    .line 548
    invoke-direct {p1, v0}, Ldefpackage/wa4;-><init>(Ljava/util/HashSet;)V

    .line 549
    .line 550
    .line 551
    iput-object p1, p0, Ldefpackage/pq;->s:Ldefpackage/wa4;

    .line 552
    .line 553
    return-void
.end method

.method public static c(Ldefpackage/qi3;)Z
    .locals 4

    .line 1
    invoke-interface {p0}, Ldefpackage/qi3;->a()Ldefpackage/gn2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-interface {p0}, Ldefpackage/qi3;->K0()Ldefpackage/do2;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object p0, p0, Ldefpackage/do2;->i:Ldefpackage/lu3;

    .line 14
    .line 15
    instance-of v2, p0, Ldefpackage/vl1;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    check-cast p0, Ldefpackage/vl1;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move-object p0, v3

    .line 24
    :goto_0
    const/4 v2, 0x1

    .line 25
    if-eqz p0, :cond_2

    .line 26
    .line 27
    iget-boolean p0, p0, Ldefpackage/vl1;->c:Z

    .line 28
    .line 29
    if-ne p0, v2, :cond_2

    .line 30
    .line 31
    move v1, v2

    .line 32
    :cond_2
    iget-object p0, v0, Ldefpackage/gn2;->d:Ldefpackage/do2;

    .line 33
    .line 34
    iget-object p0, p0, Ldefpackage/do2;->I:Landroid/os/Bundle;

    .line 35
    .line 36
    if-eqz p0, :cond_3

    .line 37
    .line 38
    const-string v3, "type"

    .line 39
    .line 40
    invoke-virtual {p0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    :cond_3
    const-string p0, "music"

    .line 45
    .line 46
    invoke-static {v3, p0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-nez p0, :cond_4

    .line 51
    .line 52
    return v1

    .line 53
    :cond_4
    iget-object p0, v0, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v2, p0, v1}, Ldefpackage/n61;->f(ILjava/lang/String;Z)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    return p0
.end method


# virtual methods
.method public final a(Ldefpackage/qi3;Z)Ldefpackage/yw1;
    .locals 7

    .line 1
    iget-object v0, p0, Ldefpackage/pq;->m:Ldefpackage/j60;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/pq;->n:Ldefpackage/j60;

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/pq;->l:Ldefpackage/j60;

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ldefpackage/j60;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ldefpackage/gb;->Q([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v2, "[shuffleID]"

    .line 21
    .line 22
    const-string v3, "[instantMixID]"

    .line 23
    .line 24
    const-string v4, "[heartID]"

    .line 25
    .line 26
    const-string v5, "[repeatID]"

    .line 27
    .line 28
    filled-new-array {v4, v5, v2, v3}, [Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2}, Ldefpackage/gb;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-string v3, "custom_command_first_button"

    .line 37
    .line 38
    invoke-static {v3, v4}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    const-string v4, "custom_command_second_button"

    .line 43
    .line 44
    invoke-static {v4, v5}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-static {v3}, Ldefpackage/ti;->i0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-static {v3}, Ldefpackage/q40;->t0(Ljava/util/ArrayList;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    new-instance v4, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_1

    .line 74
    .line 75
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    move-object v6, v5

    .line 80
    check-cast v6, Ljava/lang/String;

    .line 81
    .line 82
    invoke-interface {v3, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    if-nez v6, :cond_0

    .line 87
    .line 88
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-eqz v3, :cond_3

    .line 101
    .line 102
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    check-cast v3, Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {p0, v3, p1, p2}, Ldefpackage/pq;->b(Ljava/lang/String;Ldefpackage/qi3;Z)Ldefpackage/j60;

    .line 109
    .line 110
    .line 111
    move-result-object v3

    .line 112
    if-eqz v3, :cond_2

    .line 113
    .line 114
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_3
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    const/4 v3, 0x0

    .line 123
    :cond_4
    :goto_2
    if-ge v3, v2, :cond_5

    .line 124
    .line 125
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    add-int/lit8 v3, v3, 0x1

    .line 130
    .line 131
    check-cast v5, Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {p0, v5, p1, p2}, Ldefpackage/pq;->b(Ljava/lang/String;Ldefpackage/qi3;Z)Ldefpackage/j60;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    if-eqz v5, :cond_4

    .line 138
    .line 139
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_5
    invoke-static {v1}, Ldefpackage/yw1;->k(Ljava/util/Collection;)Ldefpackage/yw1;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 151
    .line 152
    .line 153
    invoke-static {v0}, Ldefpackage/yw1;->k(Ljava/util/Collection;)Ldefpackage/yw1;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    return-object p0
.end method

.method public final b(Ljava/lang/String;Ldefpackage/qi3;Z)Ldefpackage/j60;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :sswitch_0
    const-string v0, "[heartID]"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-interface {p2}, Ldefpackage/qi3;->a()Ldefpackage/gn2;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_7

    .line 23
    .line 24
    if-eqz p3, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-static {p2}, Ldefpackage/pq;->c(Ldefpackage/qi3;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    iget-object p0, p0, Ldefpackage/pq;->h:Ldefpackage/j60;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_2
    iget-object p0, p0, Ldefpackage/pq;->i:Ldefpackage/j60;

    .line 37
    .line 38
    return-object p0

    .line 39
    :sswitch_1
    const-string p2, "[instantMixID]"

    .line 40
    .line 41
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_3

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    sget-object p1, Ldefpackage/bo2;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_4

    .line 55
    .line 56
    iget-object p0, p0, Ldefpackage/pq;->j:Ldefpackage/j60;

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_4
    iget-object p0, p0, Ldefpackage/pq;->k:Ldefpackage/j60;

    .line 60
    .line 61
    return-object p0

    .line 62
    :sswitch_2
    const-string p3, "[shuffleID]"

    .line 63
    .line 64
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_5

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_5
    invoke-interface {p2}, Ldefpackage/qi3;->D0()Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_6

    .line 76
    .line 77
    iget-object p0, p0, Ldefpackage/pq;->d:Ldefpackage/j60;

    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_6
    iget-object p0, p0, Ldefpackage/pq;->c:Ldefpackage/j60;

    .line 81
    .line 82
    return-object p0

    .line 83
    :sswitch_3
    const-string p3, "[repeatID]"

    .line 84
    .line 85
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-nez p1, :cond_8

    .line 90
    .line 91
    :cond_7
    :goto_0
    const/4 p0, 0x0

    .line 92
    return-object p0

    .line 93
    :cond_8
    invoke-interface {p2}, Ldefpackage/qi3;->h()I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    const/4 p2, 0x1

    .line 98
    if-eq p1, p2, :cond_a

    .line 99
    .line 100
    const/4 p2, 0x2

    .line 101
    if-eq p1, p2, :cond_9

    .line 102
    .line 103
    iget-object p0, p0, Ldefpackage/pq;->e:Ldefpackage/j60;

    .line 104
    .line 105
    return-object p0

    .line 106
    :cond_9
    iget-object p0, p0, Ldefpackage/pq;->g:Ldefpackage/j60;

    .line 107
    .line 108
    return-object p0

    .line 109
    :cond_a
    iget-object p0, p0, Ldefpackage/pq;->f:Ldefpackage/j60;

    .line 110
    .line 111
    return-object p0

    .line 112
    nop

    .line 113
    :sswitch_data_0
    .sparse-switch
        -0x50f486d4 -> :sswitch_3
        0x27eacfa4 -> :sswitch_2
        0x5253978c -> :sswitch_1
        0x72a571f7 -> :sswitch_0
    .end sparse-switch
.end method

.method public final d(Ldefpackage/kn2;Ldefpackage/fr2;Ljava/util/List;)Ldefpackage/mw1;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const-string p0, "BaseSessionCallback"

    .line 11
    .line 12
    const-string p1, "onAddMediaItems"

    .line 13
    .line 14
    invoke-static {p0, p1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    new-instance p0, Ljava/util/ArrayList;

    .line 18
    .line 19
    const/16 p1, 0xa

    .line 20
    .line 21
    invoke-static {p3, p1}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 26
    .line 27
    .line 28
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-eqz p2, :cond_3

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    check-cast p2, Ldefpackage/gn2;

    .line 43
    .line 44
    iget-object p3, p2, Ldefpackage/gn2;->d:Ldefpackage/do2;

    .line 45
    .line 46
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p3}, Ldefpackage/do2;->a()Ldefpackage/co2;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iget-object v1, p3, Ldefpackage/do2;->b:Ljava/lang/CharSequence;

    .line 54
    .line 55
    if-nez v1, :cond_2

    .line 56
    .line 57
    iget-object p3, p3, Ldefpackage/do2;->I:Landroid/os/Bundle;

    .line 58
    .line 59
    if-eqz p3, :cond_0

    .line 60
    .line 61
    const-string v1, "uri"

    .line 62
    .line 63
    invoke-virtual {p3, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    :goto_1
    move-object v1, p3

    .line 68
    goto :goto_2

    .line 69
    :cond_0
    const/4 p3, 0x0

    .line 70
    goto :goto_1

    .line 71
    :goto_2
    if-eqz v1, :cond_1

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_1
    const-string v1, ""

    .line 75
    .line 76
    :cond_2
    :goto_3
    iput-object v1, v0, Ldefpackage/co2;->b:Ljava/lang/CharSequence;

    .line 77
    .line 78
    new-instance p3, Ldefpackage/do2;

    .line 79
    .line 80
    invoke-direct {p3, v0}, Ldefpackage/do2;-><init>(Ldefpackage/co2;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p2}, Ldefpackage/gn2;->a()Ldefpackage/tm2;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iget-object p2, p2, Ldefpackage/gn2;->f:Ldefpackage/cn2;

    .line 88
    .line 89
    iget-object p2, p2, Ldefpackage/cn2;->a:Landroid/net/Uri;

    .line 90
    .line 91
    iput-object p2, v0, Ldefpackage/tm2;->b:Landroid/net/Uri;

    .line 92
    .line 93
    iput-object p3, v0, Ldefpackage/tm2;->k:Ldefpackage/do2;

    .line 94
    .line 95
    const-string p2, "audio"

    .line 96
    .line 97
    iput-object p2, v0, Ldefpackage/tm2;->c:Ljava/lang/String;

    .line 98
    .line 99
    invoke-virtual {v0}, Ldefpackage/tm2;->a()Ldefpackage/gn2;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_3
    new-instance p1, Ldefpackage/mw1;

    .line 108
    .line 109
    invoke-direct {p1, p0}, Ldefpackage/mw1;-><init>(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    return-object p1
.end method

.method public final e(Ldefpackage/kn2;Ldefpackage/fr2;Ljava/lang/String;Ldefpackage/lu3;)Ldefpackage/ic2;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    check-cast p4, Ldefpackage/vl1;

    .line 14
    .line 15
    iget-boolean v4, p4, Ldefpackage/vl1;->c:Z

    .line 16
    .line 17
    invoke-static {p3}, Ldefpackage/ot1;->c(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    const/4 p4, 0x0

    .line 22
    if-eqz p2, :cond_0

    .line 23
    .line 24
    sget-object p1, Ldefpackage/io1;->b:Landroid/os/Handler;

    .line 25
    .line 26
    new-instance p2, Ldefpackage/bs1;

    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    iget-object p0, p0, Ldefpackage/pq;->a:Landroid/content/Context;

    .line 30
    .line 31
    invoke-direct {p2, p0, p3, v4, v0}, Ldefpackage/bs1;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 35
    .line 36
    .line 37
    new-instance p0, Ldefpackage/ab4;

    .line 38
    .line 39
    invoke-direct {p0, p4}, Ldefpackage/ab4;-><init>(I)V

    .line 40
    .line 41
    .line 42
    new-instance p1, Ldefpackage/mw1;

    .line 43
    .line 44
    invoke-direct {p1, p0}, Ldefpackage/mw1;-><init>(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_0
    invoke-virtual {p1}, Ldefpackage/kn2;->a()Ldefpackage/qi3;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-interface {p2}, Ldefpackage/qi3;->Q0()I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    invoke-static {p4, p2}, Ldefpackage/gb;->g0(II)Ldefpackage/j02;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    .line 61
    .line 62
    const/16 v1, 0xa

    .line 63
    .line 64
    invoke-static {p2, v1}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Ldefpackage/h02;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    :goto_0
    move-object v1, p2

    .line 76
    check-cast v1, Ldefpackage/i02;

    .line 77
    .line 78
    iget-boolean v1, v1, Ldefpackage/i02;->p:Z

    .line 79
    .line 80
    if-eqz v1, :cond_1

    .line 81
    .line 82
    move-object v1, p2

    .line 83
    check-cast v1, Ldefpackage/b02;

    .line 84
    .line 85
    invoke-virtual {v1}, Ldefpackage/b02;->nextInt()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    invoke-virtual {p1}, Ldefpackage/kn2;->a()Ldefpackage/qi3;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-interface {v2, v1}, Ldefpackage/qi3;->Y(I)Ldefpackage/gn2;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    move v1, p4

    .line 106
    :cond_2
    const/4 v2, 0x0

    .line 107
    if-ge v1, p2, :cond_3

    .line 108
    .line 109
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    add-int/lit8 v1, v1, 0x1

    .line 114
    .line 115
    move-object v5, v3

    .line 116
    check-cast v5, Ldefpackage/gn2;

    .line 117
    .line 118
    iget-object v5, v5, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 119
    .line 120
    invoke-static {v5, p3}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eqz v5, :cond_2

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    move-object v3, v2

    .line 128
    :goto_1
    check-cast v3, Ldefpackage/gn2;

    .line 129
    .line 130
    if-eqz v3, :cond_6

    .line 131
    .line 132
    iget-object p2, v3, Ldefpackage/gn2;->d:Ldefpackage/do2;

    .line 133
    .line 134
    iget-object p2, p2, Ldefpackage/do2;->I:Landroid/os/Bundle;

    .line 135
    .line 136
    if-eqz p2, :cond_4

    .line 137
    .line 138
    const-string v0, "type"

    .line 139
    .line 140
    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    goto :goto_2

    .line 145
    :cond_4
    move-object p2, v2

    .line 146
    :goto_2
    const-string v0, "music"

    .line 147
    .line 148
    invoke-static {p2, v0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result p2

    .line 152
    if-eqz p2, :cond_5

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :cond_5
    move-object v3, v2

    .line 156
    :goto_3
    if-eqz v3, :cond_6

    .line 157
    .line 158
    const/4 p2, 0x1

    .line 159
    invoke-static {p2, p3, v4}, Ldefpackage/n61;->g(ILjava/lang/String;Z)Ldefpackage/l61;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    move-object v1, p2

    .line 164
    goto :goto_4

    .line 165
    :cond_6
    move-object v1, v2

    .line 166
    :goto_4
    const-string p2, "MediaAnnotationClient"

    .line 167
    .line 168
    if-eqz v4, :cond_7

    .line 169
    .line 170
    invoke-static {p4}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 171
    .line 172
    .line 173
    move-result-object p4

    .line 174
    invoke-virtual {p4}, Ldefpackage/pn4;->e()Ldefpackage/gp3;

    .line 175
    .line 176
    .line 177
    move-result-object p4

    .line 178
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    const-string v0, "star()"

    .line 182
    .line 183
    invoke-static {p2, v0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 184
    .line 185
    .line 186
    iget-object p2, p4, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast p2, Ldefpackage/zi2;

    .line 189
    .line 190
    iget-object p4, p4, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 191
    .line 192
    check-cast p4, Ldefpackage/pn4;

    .line 193
    .line 194
    invoke-virtual {p4}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 195
    .line 196
    .line 197
    move-result-object p4

    .line 198
    invoke-interface {p2, p4, p3, v2, v2}, Ldefpackage/zi2;->c(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    .line 199
    .line 200
    .line 201
    move-result-object p2

    .line 202
    goto :goto_5

    .line 203
    :cond_7
    invoke-static {p4}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 204
    .line 205
    .line 206
    move-result-object p4

    .line 207
    invoke-virtual {p4}, Ldefpackage/pn4;->e()Ldefpackage/gp3;

    .line 208
    .line 209
    .line 210
    move-result-object p4

    .line 211
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    const-string v0, "unstar()"

    .line 215
    .line 216
    invoke-static {p2, v0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 217
    .line 218
    .line 219
    iget-object p2, p4, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast p2, Ldefpackage/zi2;

    .line 222
    .line 223
    iget-object p4, p4, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast p4, Ldefpackage/pn4;

    .line 226
    .line 227
    invoke-virtual {p4}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 228
    .line 229
    .line 230
    move-result-object p4

    .line 231
    invoke-interface {p2, p4, p3, v2, v2}, Ldefpackage/zi2;->b(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    .line 232
    .line 233
    .line 234
    move-result-object p2

    .line 235
    :goto_5
    new-instance v6, Ldefpackage/lb4;

    .line 236
    .line 237
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 238
    .line 239
    .line 240
    new-instance v0, Ldefpackage/nq;

    .line 241
    .line 242
    move-object v5, p0

    .line 243
    move-object v2, p1

    .line 244
    move-object v3, p3

    .line 245
    invoke-direct/range {v0 .. v6}, Ldefpackage/nq;-><init>(Ldefpackage/l61;Ldefpackage/kn2;Ljava/lang/String;ZLdefpackage/pq;Ldefpackage/lb4;)V

    .line 246
    .line 247
    .line 248
    invoke-interface {p2, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 249
    .line 250
    .line 251
    return-object v6
.end method

.method public final f(Ldefpackage/kn2;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Ldefpackage/kn2;->a:Ldefpackage/tn2;

    .line 5
    .line 6
    invoke-virtual {v0}, Ldefpackage/tn2;->g()Ldefpackage/fr2;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p1}, Ldefpackage/kn2;->a()Ldefpackage/qi3;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1, p2}, Ldefpackage/pq;->a(Ldefpackage/qi3;Z)Ldefpackage/yw1;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, Ldefpackage/yw1;->k(Ljava/util/Collection;)Ldefpackage/yw1;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    iget-object p1, v0, Ldefpackage/tn2;->h:Ldefpackage/ls2;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ldefpackage/tn2;->k(Ldefpackage/fr2;)Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    iput-object p0, p1, Ldefpackage/ls2;->x:Ldefpackage/yw1;

    .line 37
    .line 38
    invoke-virtual {p1}, Ldefpackage/ls2;->O()V

    .line 39
    .line 40
    .line 41
    iget-object p2, v0, Ldefpackage/tn2;->s:Ldefpackage/al3;

    .line 42
    .line 43
    invoke-virtual {p1, p2}, Ldefpackage/ls2;->P(Ldefpackage/al3;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    new-instance p1, Ldefpackage/vr2;

    .line 47
    .line 48
    invoke-direct {p1, p0}, Ldefpackage/vr2;-><init>(Ldefpackage/yw1;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1, p1}, Ldefpackage/tn2;->d(Ldefpackage/fr2;Ldefpackage/yr2;)Ldefpackage/ic2;

    .line 52
    .line 53
    .line 54
    return-void
.end method
