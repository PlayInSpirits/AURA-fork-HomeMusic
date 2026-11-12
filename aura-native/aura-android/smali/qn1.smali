.class public abstract Lqn1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Lux3;

.field public static final b:Lux3;

.field public static final c:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 34

    .line 1
    new-instance v0, Lux3;

    .line 2
    .line 3
    const-string v1, "\\p{Mn}+"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lux3;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lqn1;->a:Lux3;

    .line 9
    .line 10
    new-instance v0, Lux3;

    .line 11
    .line 12
    const-string v1, "[^\\p{L}\\p{N}]+"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lux3;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lqn1;->b:Lux3;

    .line 18
    .line 19
    const/16 v0, 0x430

    .line 20
    .line 21
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, Lkd3;

    .line 26
    .line 27
    const-string v2, "a"

    .line 28
    .line 29
    invoke-direct {v1, v0, v2}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const/16 v0, 0x431

    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v2, Lkd3;

    .line 39
    .line 40
    const-string v3, "b"

    .line 41
    .line 42
    invoke-direct {v2, v0, v3}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const/16 v0, 0x432

    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    new-instance v3, Lkd3;

    .line 52
    .line 53
    const-string v4, "v"

    .line 54
    .line 55
    invoke-direct {v3, v0, v4}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    const/16 v0, 0x433

    .line 59
    .line 60
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    new-instance v4, Lkd3;

    .line 65
    .line 66
    const-string v5, "g"

    .line 67
    .line 68
    invoke-direct {v4, v0, v5}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    const/16 v0, 0x434

    .line 72
    .line 73
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    new-instance v5, Lkd3;

    .line 78
    .line 79
    const-string v6, "d"

    .line 80
    .line 81
    invoke-direct {v5, v0, v6}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    const/16 v0, 0x435

    .line 85
    .line 86
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    new-instance v6, Lkd3;

    .line 91
    .line 92
    const-string v7, "e"

    .line 93
    .line 94
    invoke-direct {v6, v0, v7}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    const/16 v0, 0x436

    .line 98
    .line 99
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    new-instance v8, Lkd3;

    .line 104
    .line 105
    const-string v9, "zh"

    .line 106
    .line 107
    invoke-direct {v8, v0, v9}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    const/16 v0, 0x437

    .line 111
    .line 112
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    move-object v9, v8

    .line 117
    new-instance v8, Lkd3;

    .line 118
    .line 119
    const-string v10, "z"

    .line 120
    .line 121
    invoke-direct {v8, v0, v10}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    const/16 v0, 0x438

    .line 125
    .line 126
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    move-object v10, v9

    .line 131
    new-instance v9, Lkd3;

    .line 132
    .line 133
    const-string v11, "i"

    .line 134
    .line 135
    invoke-direct {v9, v0, v11}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    const/16 v0, 0x439

    .line 139
    .line 140
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    move-object v12, v10

    .line 145
    new-instance v10, Lkd3;

    .line 146
    .line 147
    invoke-direct {v10, v0, v11}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    const/16 v0, 0x43a

    .line 151
    .line 152
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    new-instance v11, Lkd3;

    .line 157
    .line 158
    const-string v13, "k"

    .line 159
    .line 160
    invoke-direct {v11, v0, v13}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    const/16 v0, 0x43b

    .line 164
    .line 165
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    move-object v13, v12

    .line 170
    new-instance v12, Lkd3;

    .line 171
    .line 172
    const-string v14, "l"

    .line 173
    .line 174
    invoke-direct {v12, v0, v14}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    const/16 v0, 0x43c

    .line 178
    .line 179
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    move-object v14, v13

    .line 184
    new-instance v13, Lkd3;

    .line 185
    .line 186
    const-string v15, "m"

    .line 187
    .line 188
    invoke-direct {v13, v0, v15}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    const/16 v0, 0x43d

    .line 192
    .line 193
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    move-object v15, v14

    .line 198
    new-instance v14, Lkd3;

    .line 199
    .line 200
    move-object/from16 v16, v1

    .line 201
    .line 202
    const-string v1, "n"

    .line 203
    .line 204
    invoke-direct {v14, v0, v1}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 205
    .line 206
    .line 207
    const/16 v0, 0x43e

    .line 208
    .line 209
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    move-object v1, v15

    .line 214
    new-instance v15, Lkd3;

    .line 215
    .line 216
    move-object/from16 v17, v1

    .line 217
    .line 218
    const-string v1, "o"

    .line 219
    .line 220
    invoke-direct {v15, v0, v1}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    const/16 v0, 0x43f

    .line 224
    .line 225
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    new-instance v1, Lkd3;

    .line 230
    .line 231
    move-object/from16 v18, v2

    .line 232
    .line 233
    const-string v2, "p"

    .line 234
    .line 235
    invoke-direct {v1, v0, v2}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 236
    .line 237
    .line 238
    const/16 v0, 0x440

    .line 239
    .line 240
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    new-instance v2, Lkd3;

    .line 245
    .line 246
    move-object/from16 v19, v1

    .line 247
    .line 248
    const-string v1, "r"

    .line 249
    .line 250
    invoke-direct {v2, v0, v1}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    const/16 v0, 0x441

    .line 254
    .line 255
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    new-instance v1, Lkd3;

    .line 260
    .line 261
    move-object/from16 v20, v2

    .line 262
    .line 263
    const-string v2, "s"

    .line 264
    .line 265
    invoke-direct {v1, v0, v2}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    const/16 v0, 0x442

    .line 269
    .line 270
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    new-instance v2, Lkd3;

    .line 275
    .line 276
    move-object/from16 v21, v1

    .line 277
    .line 278
    const-string v1, "t"

    .line 279
    .line 280
    invoke-direct {v2, v0, v1}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 281
    .line 282
    .line 283
    const/16 v0, 0x443

    .line 284
    .line 285
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    new-instance v1, Lkd3;

    .line 290
    .line 291
    move-object/from16 v22, v2

    .line 292
    .line 293
    const-string v2, "u"

    .line 294
    .line 295
    invoke-direct {v1, v0, v2}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    const/16 v0, 0x444

    .line 299
    .line 300
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    new-instance v2, Lkd3;

    .line 305
    .line 306
    move-object/from16 v23, v1

    .line 307
    .line 308
    const-string v1, "f"

    .line 309
    .line 310
    invoke-direct {v2, v0, v1}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    const/16 v0, 0x445

    .line 314
    .line 315
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    new-instance v1, Lkd3;

    .line 320
    .line 321
    move-object/from16 v24, v2

    .line 322
    .line 323
    const-string v2, "h"

    .line 324
    .line 325
    invoke-direct {v1, v0, v2}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    const/16 v0, 0x446

    .line 329
    .line 330
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    new-instance v2, Lkd3;

    .line 335
    .line 336
    move-object/from16 v25, v1

    .line 337
    .line 338
    const-string v1, "c"

    .line 339
    .line 340
    invoke-direct {v2, v0, v1}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    const/16 v0, 0x447

    .line 344
    .line 345
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    new-instance v1, Lkd3;

    .line 350
    .line 351
    move-object/from16 v26, v2

    .line 352
    .line 353
    const-string v2, "ch"

    .line 354
    .line 355
    invoke-direct {v1, v0, v2}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    const/16 v0, 0x448

    .line 359
    .line 360
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    new-instance v2, Lkd3;

    .line 365
    .line 366
    move-object/from16 v27, v1

    .line 367
    .line 368
    const-string v1, "sh"

    .line 369
    .line 370
    invoke-direct {v2, v0, v1}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    const/16 v0, 0x449

    .line 374
    .line 375
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    move-object/from16 v28, v2

    .line 380
    .line 381
    new-instance v2, Lkd3;

    .line 382
    .line 383
    invoke-direct {v2, v0, v1}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 384
    .line 385
    .line 386
    const/16 v0, 0x44a

    .line 387
    .line 388
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    new-instance v1, Lkd3;

    .line 393
    .line 394
    move-object/from16 v29, v2

    .line 395
    .line 396
    const-string v2, ""

    .line 397
    .line 398
    invoke-direct {v1, v0, v2}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 399
    .line 400
    .line 401
    const/16 v0, 0x44b

    .line 402
    .line 403
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    move-object/from16 v30, v1

    .line 408
    .line 409
    new-instance v1, Lkd3;

    .line 410
    .line 411
    move-object/from16 v31, v3

    .line 412
    .line 413
    const-string v3, "y"

    .line 414
    .line 415
    invoke-direct {v1, v0, v3}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    const/16 v0, 0x44c

    .line 419
    .line 420
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    new-instance v3, Lkd3;

    .line 425
    .line 426
    invoke-direct {v3, v0, v2}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 427
    .line 428
    .line 429
    const/16 v0, 0x44d

    .line 430
    .line 431
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    new-instance v2, Lkd3;

    .line 436
    .line 437
    invoke-direct {v2, v0, v7}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    const/16 v0, 0x44e

    .line 441
    .line 442
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    new-instance v7, Lkd3;

    .line 447
    .line 448
    move-object/from16 v32, v1

    .line 449
    .line 450
    const-string v1, "yu"

    .line 451
    .line 452
    invoke-direct {v7, v0, v1}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 453
    .line 454
    .line 455
    const/16 v0, 0x44f

    .line 456
    .line 457
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    new-instance v1, Lkd3;

    .line 462
    .line 463
    move-object/from16 v33, v2

    .line 464
    .line 465
    const-string v2, "ya"

    .line 466
    .line 467
    invoke-direct {v1, v0, v2}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 468
    .line 469
    .line 470
    move-object/from16 v2, v32

    .line 471
    .line 472
    move-object/from16 v32, v1

    .line 473
    .line 474
    move-object/from16 v1, v16

    .line 475
    .line 476
    move-object/from16 v16, v19

    .line 477
    .line 478
    move-object/from16 v19, v22

    .line 479
    .line 480
    move-object/from16 v22, v25

    .line 481
    .line 482
    move-object/from16 v25, v28

    .line 483
    .line 484
    move-object/from16 v28, v2

    .line 485
    .line 486
    move-object/from16 v2, v29

    .line 487
    .line 488
    move-object/from16 v29, v3

    .line 489
    .line 490
    move-object/from16 v3, v31

    .line 491
    .line 492
    move-object/from16 v31, v7

    .line 493
    .line 494
    move-object/from16 v7, v17

    .line 495
    .line 496
    move-object/from16 v17, v20

    .line 497
    .line 498
    move-object/from16 v20, v23

    .line 499
    .line 500
    move-object/from16 v23, v26

    .line 501
    .line 502
    move-object/from16 v26, v2

    .line 503
    .line 504
    move-object/from16 v2, v18

    .line 505
    .line 506
    move-object/from16 v18, v21

    .line 507
    .line 508
    move-object/from16 v21, v24

    .line 509
    .line 510
    move-object/from16 v24, v27

    .line 511
    .line 512
    move-object/from16 v27, v30

    .line 513
    .line 514
    move-object/from16 v30, v33

    .line 515
    .line 516
    filled-new-array/range {v1 .. v32}, [Lkd3;

    .line 517
    .line 518
    .line 519
    move-result-object v0

    .line 520
    invoke-static {v0}, Llg2;->X([Lkd3;)Ljava/util/Map;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    sput-object v0, Lqn1;->c:Ljava/util/Map;

    .line 525
    .line 526
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lqn1;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 v0, 0x1

    .line 9
    new-array v1, v0, [C

    .line 10
    .line 11
    const/16 v2, 0x20

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    aput-char v2, v1, v3

    .line 15
    .line 16
    invoke-static {p1, v1}, Lqm4;->D0(Ljava/lang/String;[C)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    move-object v4, v2

    .line 40
    check-cast v4, Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-lez v4, :cond_0

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_2

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    invoke-static {p0}, Lqn1;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {p0}, Lqn1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_3

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    move v4, v3

    .line 79
    :cond_4
    if-ge v4, v2, :cond_8

    .line 80
    .line 81
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    add-int/lit8 v4, v4, 0x1

    .line 86
    .line 87
    check-cast v5, Ljava/lang/String;

    .line 88
    .line 89
    invoke-static {p0, v5}, Lqm4;->o0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v5

    .line 93
    if-nez v5, :cond_4

    .line 94
    .line 95
    new-instance p0, Ljava/util/ArrayList;

    .line 96
    .line 97
    const/16 v2, 0xa

    .line 98
    .line 99
    invoke-static {v1, v2}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    invoke-direct {p0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    move v4, v3

    .line 111
    :goto_1
    if-ge v4, v2, :cond_5

    .line 112
    .line 113
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    add-int/lit8 v4, v4, 0x1

    .line 118
    .line 119
    check-cast v5, Ljava/lang/String;

    .line 120
    .line 121
    invoke-static {v5}, Lqn1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-virtual {p0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_5
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-eqz v1, :cond_6

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_6
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    move v2, v3

    .line 141
    :cond_7
    if-ge v2, v1, :cond_8

    .line 142
    .line 143
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    add-int/lit8 v2, v2, 0x1

    .line 148
    .line 149
    check-cast v4, Ljava/lang/String;

    .line 150
    .line 151
    invoke-static {p1, v4}, Lqm4;->o0(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    if-nez v4, :cond_7

    .line 156
    .line 157
    return v3

    .line 158
    :cond_8
    :goto_2
    return v0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/16 v0, 0x451

    .line 11
    .line 12
    const/16 v1, 0x435

    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/16 v0, 0x439

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    sget-object v2, Ljava/text/Normalizer$Form;->NFD:Ljava/text/Normalizer$Form;

    .line 32
    .line 33
    invoke-static {p0, v2}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    sget-object v2, Lqn1;->a:Lux3;

    .line 41
    .line 42
    iget-object v2, v2, Lux3;->n:Ljava/util/regex/Pattern;

    .line 43
    .line 44
    invoke-virtual {v2, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const-string v2, ""

    .line 49
    .line 50
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    sget-object v0, Lqn1;->b:Lux3;

    .line 65
    .line 66
    iget-object v0, v0, Lux3;->n:Ljava/util/regex/Pattern;

    .line 67
    .line 68
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    const-string v0, " "

    .line 73
    .line 74
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-static {p0}, Lqm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    sget-object v4, Lqn1;->c:Ljava/util/Map;

    .line 18
    .line 19
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    check-cast v4, Ljava/lang/String;

    .line 28
    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    :cond_0
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    add-int/lit8 v2, v2, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method
