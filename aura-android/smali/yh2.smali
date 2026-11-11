.class public final synthetic Lyh2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ltv1;


# direct methods
.method public synthetic constructor <init>(Ltv1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyh2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lyh2;->b:Ltv1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lyh2;->a:I

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    const/16 v3, 0x19

    .line 7
    .line 8
    const/16 v4, 0x18

    .line 9
    .line 10
    const-wide/16 v7, 0x0

    .line 11
    .line 12
    const-wide/high16 v9, 0x4012000000000000L    # 4.5

    .line 13
    .line 14
    const-wide/high16 v11, 0x4024000000000000L    # 10.0

    .line 15
    .line 16
    const-wide v13, 0x4056800000000000L    # 90.0

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    const/16 v15, 0x1a

    .line 22
    .line 23
    const/16 v16, 0x2

    .line 24
    .line 25
    const/4 v5, 0x1

    .line 26
    iget-object v0, v0, Lyh2;->b:Ltv1;

    .line 27
    .line 28
    packed-switch v1, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    move-object/from16 v1, p1

    .line 32
    .line 33
    check-cast v1, Ld64;

    .line 34
    .line 35
    invoke-virtual {v0}, Ltv1;->x()Lgy0;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    return-object v0

    .line 40
    :pswitch_0
    move-object/from16 v1, p1

    .line 41
    .line 42
    check-cast v1, Ld64;

    .line 43
    .line 44
    new-instance v2, Luu4;

    .line 45
    .line 46
    invoke-virtual {v0}, Ltv1;->x()Lgy0;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iget-boolean v1, v1, Ld64;->c:Z

    .line 51
    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move/from16 v5, v16

    .line 56
    .line 57
    :goto_0
    invoke-direct {v2, v0, v5}, Luu4;-><init>(Lgy0;I)V

    .line 58
    .line 59
    .line 60
    return-object v2

    .line 61
    :pswitch_1
    move-object/from16 v1, p1

    .line 62
    .line 63
    check-cast v1, Ld64;

    .line 64
    .line 65
    invoke-virtual {v0}, Ltv1;->F()Lgy0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    return-object v0

    .line 70
    :pswitch_2
    move-object/from16 v1, p1

    .line 71
    .line 72
    check-cast v1, Ld64;

    .line 73
    .line 74
    invoke-static {v1}, Ltv1;->B(Ld64;)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-nez v2, :cond_2

    .line 79
    .line 80
    iget-boolean v0, v1, Ld64;->c:Z

    .line 81
    .line 82
    if-eqz v0, :cond_1

    .line 83
    .line 84
    move-wide v11, v13

    .line 85
    :cond_1
    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    goto :goto_1

    .line 90
    :cond_2
    invoke-virtual {v0}, Ltv1;->F()Lgy0;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget-object v0, v0, Lgy0;->c:Ljava/util/function/Function;

    .line 95
    .line 96
    invoke-interface {v0, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, Ljava/lang/Double;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 103
    .line 104
    .line 105
    move-result-wide v0

    .line 106
    invoke-static {v0, v1, v9, v10}, Lgy0;->b(DD)D

    .line 107
    .line 108
    .line 109
    move-result-wide v0

    .line 110
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    :goto_1
    return-object v0

    .line 115
    :pswitch_3
    move-object/from16 v1, p1

    .line 116
    .line 117
    check-cast v1, Ld64;

    .line 118
    .line 119
    invoke-virtual {v0}, Ltv1;->G()Lgy0;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    return-object v0

    .line 124
    :pswitch_4
    move-object/from16 v1, p1

    .line 125
    .line 126
    check-cast v1, Ld64;

    .line 127
    .line 128
    invoke-static {v1}, Ltv1;->C(Ld64;)Z

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    iget-boolean v3, v1, Ld64;->c:Z

    .line 133
    .line 134
    if-eqz v2, :cond_4

    .line 135
    .line 136
    if-eqz v3, :cond_3

    .line 137
    .line 138
    move-wide v5, v7

    .line 139
    goto :goto_2

    .line 140
    :cond_3
    const-wide/high16 v5, 0x4059000000000000L    # 100.0

    .line 141
    .line 142
    :goto_2
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    goto :goto_3

    .line 147
    :cond_4
    invoke-static {v1}, Ltv1;->B(Ld64;)Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-nez v2, :cond_6

    .line 152
    .line 153
    if-eqz v3, :cond_5

    .line 154
    .line 155
    move-wide v11, v13

    .line 156
    :cond_5
    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    goto :goto_3

    .line 161
    :cond_6
    invoke-virtual {v0}, Ltv1;->G()Lgy0;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    iget-object v0, v0, Lgy0;->c:Ljava/util/function/Function;

    .line 166
    .line 167
    invoke-interface {v0, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    check-cast v0, Ljava/lang/Double;

    .line 172
    .line 173
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 174
    .line 175
    .line 176
    move-result-wide v0

    .line 177
    invoke-static {v0, v1, v9, v10}, Lgy0;->b(DD)D

    .line 178
    .line 179
    .line 180
    move-result-wide v0

    .line 181
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    :goto_3
    return-object v0

    .line 186
    :pswitch_5
    move-object/from16 v1, p1

    .line 187
    .line 188
    check-cast v1, Ld64;

    .line 189
    .line 190
    new-instance v1, Lm7;

    .line 191
    .line 192
    const/16 v2, 0x1b

    .line 193
    .line 194
    invoke-direct {v1, v2}, Lm7;-><init>(I)V

    .line 195
    .line 196
    .line 197
    new-instance v2, Lm7;

    .line 198
    .line 199
    const/16 v3, 0x1c

    .line 200
    .line 201
    invoke-direct {v2, v3}, Lm7;-><init>(I)V

    .line 202
    .line 203
    .line 204
    new-instance v3, Lbi2;

    .line 205
    .line 206
    invoke-direct {v3, v0, v15}, Lbi2;-><init>(Ltv1;I)V

    .line 207
    .line 208
    .line 209
    new-instance v4, Lyh2;

    .line 210
    .line 211
    invoke-direct {v4, v0, v5}, Lyh2;-><init>(Ltv1;I)V

    .line 212
    .line 213
    .line 214
    invoke-static {v1, v2, v3, v4}, Lgy0;->c(Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;)Lgy0;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    return-object v0

    .line 219
    :pswitch_6
    move-object/from16 v1, p1

    .line 220
    .line 221
    check-cast v1, Ld64;

    .line 222
    .line 223
    new-instance v2, Luu4;

    .line 224
    .line 225
    invoke-virtual {v0}, Ltv1;->F()Lgy0;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    iget-boolean v1, v1, Ld64;->c:Z

    .line 230
    .line 231
    if-eqz v1, :cond_7

    .line 232
    .line 233
    goto :goto_4

    .line 234
    :cond_7
    move/from16 v5, v16

    .line 235
    .line 236
    :goto_4
    invoke-direct {v2, v0, v5}, Luu4;-><init>(Lgy0;I)V

    .line 237
    .line 238
    .line 239
    return-object v2

    .line 240
    :pswitch_7
    move-object/from16 v1, p1

    .line 241
    .line 242
    check-cast v1, Ld64;

    .line 243
    .line 244
    new-instance v1, Lai2;

    .line 245
    .line 246
    invoke-direct {v1, v4}, Lai2;-><init>(I)V

    .line 247
    .line 248
    .line 249
    new-instance v4, Lai2;

    .line 250
    .line 251
    invoke-direct {v4, v3}, Lai2;-><init>(I)V

    .line 252
    .line 253
    .line 254
    new-instance v3, Lbi2;

    .line 255
    .line 256
    invoke-direct {v3, v0, v15}, Lbi2;-><init>(Ltv1;I)V

    .line 257
    .line 258
    .line 259
    new-instance v5, Lyh2;

    .line 260
    .line 261
    invoke-direct {v5, v0, v2}, Lyh2;-><init>(Ltv1;I)V

    .line 262
    .line 263
    .line 264
    invoke-static {v1, v4, v3, v5}, Lgy0;->c(Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;)Lgy0;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    return-object v0

    .line 269
    :pswitch_8
    move-object/from16 v1, p1

    .line 270
    .line 271
    check-cast v1, Ld64;

    .line 272
    .line 273
    invoke-virtual {v0}, Ltv1;->E()Lgy0;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    return-object v0

    .line 278
    :pswitch_9
    move-object/from16 v1, p1

    .line 279
    .line 280
    check-cast v1, Ld64;

    .line 281
    .line 282
    invoke-static {v1}, Ltv1;->B(Ld64;)Z

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    if-eqz v2, :cond_8

    .line 287
    .line 288
    invoke-virtual {v0}, Ltv1;->E()Lgy0;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    iget-object v0, v0, Lgy0;->c:Ljava/util/function/Function;

    .line 293
    .line 294
    invoke-interface {v0, v1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    check-cast v0, Ljava/lang/Double;

    .line 299
    .line 300
    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    .line 301
    .line 302
    .line 303
    move-result-wide v0

    .line 304
    invoke-static {v0, v1, v9, v10}, Lgy0;->b(DD)D

    .line 305
    .line 306
    .line 307
    move-result-wide v0

    .line 308
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    goto :goto_6

    .line 313
    :cond_8
    iget v0, v1, Ld64;->b:I

    .line 314
    .line 315
    iget-boolean v1, v1, Ld64;->c:Z

    .line 316
    .line 317
    if-ne v0, v5, :cond_a

    .line 318
    .line 319
    if-eqz v1, :cond_9

    .line 320
    .line 321
    move-wide v5, v7

    .line 322
    goto :goto_5

    .line 323
    :cond_9
    const-wide/high16 v5, 0x4059000000000000L    # 100.0

    .line 324
    .line 325
    :goto_5
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    goto :goto_6

    .line 330
    :cond_a
    if-eqz v1, :cond_b

    .line 331
    .line 332
    move-wide v11, v13

    .line 333
    :cond_b
    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    :goto_6
    return-object v0

    .line 338
    :pswitch_a
    move-object/from16 v1, p1

    .line 339
    .line 340
    check-cast v1, Ld64;

    .line 341
    .line 342
    new-instance v1, Lbi2;

    .line 343
    .line 344
    const/4 v3, 0x5

    .line 345
    invoke-direct {v1, v3}, Lbi2;-><init>(I)V

    .line 346
    .line 347
    .line 348
    new-instance v3, Lbi2;

    .line 349
    .line 350
    invoke-direct {v3, v2}, Lbi2;-><init>(I)V

    .line 351
    .line 352
    .line 353
    new-instance v2, Lbi2;

    .line 354
    .line 355
    invoke-direct {v2, v0, v15}, Lbi2;-><init>(Ltv1;I)V

    .line 356
    .line 357
    .line 358
    new-instance v4, Lyh2;

    .line 359
    .line 360
    const/16 v5, 0xd

    .line 361
    .line 362
    invoke-direct {v4, v0, v5}, Lyh2;-><init>(Ltv1;I)V

    .line 363
    .line 364
    .line 365
    invoke-static {v1, v3, v2, v4}, Lgy0;->c(Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;)Lgy0;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    return-object v0

    .line 370
    :pswitch_b
    move-object/from16 v1, p1

    .line 371
    .line 372
    check-cast v1, Ld64;

    .line 373
    .line 374
    new-instance v1, Lbi2;

    .line 375
    .line 376
    invoke-direct {v1, v4}, Lbi2;-><init>(I)V

    .line 377
    .line 378
    .line 379
    new-instance v2, Lbi2;

    .line 380
    .line 381
    invoke-direct {v2, v3}, Lbi2;-><init>(I)V

    .line 382
    .line 383
    .line 384
    new-instance v3, Lbi2;

    .line 385
    .line 386
    invoke-direct {v3, v0, v15}, Lbi2;-><init>(Ltv1;I)V

    .line 387
    .line 388
    .line 389
    new-instance v4, Lyh2;

    .line 390
    .line 391
    const/4 v5, 0x0

    .line 392
    invoke-direct {v4, v0, v5}, Lyh2;-><init>(Ltv1;I)V

    .line 393
    .line 394
    .line 395
    invoke-static {v1, v2, v3, v4}, Lgy0;->c(Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;Ljava/util/function/Function;)Lgy0;

    .line 396
    .line 397
    .line 398
    move-result-object v0

    .line 399
    return-object v0

    .line 400
    :pswitch_c
    move-object/from16 v1, p1

    .line 401
    .line 402
    check-cast v1, Ld64;

    .line 403
    .line 404
    new-instance v2, Luu4;

    .line 405
    .line 406
    invoke-virtual {v0}, Ltv1;->G()Lgy0;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    iget-boolean v1, v1, Ld64;->c:Z

    .line 411
    .line 412
    if-eqz v1, :cond_c

    .line 413
    .line 414
    goto :goto_7

    .line 415
    :cond_c
    move/from16 v5, v16

    .line 416
    .line 417
    :goto_7
    invoke-direct {v2, v0, v5}, Luu4;-><init>(Lgy0;I)V

    .line 418
    .line 419
    .line 420
    return-object v2

    .line 421
    :pswitch_d
    move-object/from16 v1, p1

    .line 422
    .line 423
    check-cast v1, Ld64;

    .line 424
    .line 425
    new-instance v2, Luu4;

    .line 426
    .line 427
    invoke-virtual {v0}, Ltv1;->E()Lgy0;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    iget-boolean v1, v1, Ld64;->c:Z

    .line 432
    .line 433
    if-eqz v1, :cond_d

    .line 434
    .line 435
    goto :goto_8

    .line 436
    :cond_d
    move/from16 v5, v16

    .line 437
    .line 438
    :goto_8
    invoke-direct {v2, v0, v5}, Luu4;-><init>(Lgy0;I)V

    .line 439
    .line 440
    .line 441
    return-object v2

    .line 442
    nop

    .line 443
    :pswitch_data_0
    .packed-switch 0x0
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
