.class public final Lfy2;
.super Lep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public o:Lfx3;

.field public p:Lfx3;

.field public q:I

.field public r:I

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:Lgx3;

.field public final synthetic u:Ljx3;

.field public final synthetic v:Ljx3;

.field public final synthetic w:F

.field public final synthetic x:Lhy2;

.field public final synthetic y:F

.field public final synthetic z:Lg74;


# direct methods
.method public constructor <init>(Lgx3;Ljx3;Ljx3;FLhy2;FLg74;Lvd0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lfy2;->t:Lgx3;

    .line 2
    .line 3
    iput-object p2, p0, Lfy2;->u:Ljx3;

    .line 4
    .line 5
    iput-object p3, p0, Lfy2;->v:Ljx3;

    .line 6
    .line 7
    iput p4, p0, Lfy2;->w:F

    .line 8
    .line 9
    iput-object p5, p0, Lfy2;->x:Lhy2;

    .line 10
    .line 11
    iput p6, p0, Lfy2;->y:F

    .line 12
    .line 13
    iput-object p7, p0, Lfy2;->z:Lg74;

    .line 14
    .line 15
    const/4 p1, 0x2

    .line 16
    invoke-direct {p0, p1, p8}, Lep4;-><init>(ILvd0;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvd0;)Lvd0;
    .locals 9

    .line 1
    new-instance v0, Lfy2;

    .line 2
    .line 3
    iget v6, p0, Lfy2;->y:F

    .line 4
    .line 5
    iget-object v7, p0, Lfy2;->z:Lg74;

    .line 6
    .line 7
    iget-object v1, p0, Lfy2;->t:Lgx3;

    .line 8
    .line 9
    iget-object v2, p0, Lfy2;->u:Ljx3;

    .line 10
    .line 11
    iget-object v3, p0, Lfy2;->v:Ljx3;

    .line 12
    .line 13
    iget v4, p0, Lfy2;->w:F

    .line 14
    .line 15
    iget-object v5, p0, Lfy2;->x:Lhy2;

    .line 16
    .line 17
    move-object v8, p2

    .line 18
    invoke-direct/range {v0 .. v8}, Lfy2;-><init>(Lgx3;Ljx3;Ljx3;FLhy2;FLg74;Lvd0;)V

    .line 19
    .line 20
    .line 21
    iput-object p1, v0, Lfy2;->s:Ljava/lang/Object;

    .line 22
    .line 23
    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Le74;

    .line 2
    .line 3
    check-cast p2, Lvd0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lfy2;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lfy2;

    .line 10
    .line 11
    sget-object p1, Lj15;->a:Lj15;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lfy2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v7, p0

    .line 2
    .line 3
    iget v0, v7, Lfy2;->r:I

    .line 4
    .line 5
    iget-object v1, v7, Lfy2;->v:Ljx3;

    .line 6
    .line 7
    const/4 v8, 0x0

    .line 8
    iget-object v2, v7, Lfy2;->x:Lhy2;

    .line 9
    .line 10
    iget-object v4, v7, Lfy2;->t:Lgx3;

    .line 11
    .line 12
    const/4 v9, 0x3

    .line 13
    const/4 v10, 0x2

    .line 14
    const/4 v11, 0x1

    .line 15
    iget-object v12, v7, Lfy2;->u:Ljx3;

    .line 16
    .line 17
    sget-object v13, Lxe0;->n:Lxe0;

    .line 18
    .line 19
    if-eqz v0, :cond_3

    .line 20
    .line 21
    if-eq v0, v11, :cond_2

    .line 22
    .line 23
    if-eq v0, v10, :cond_1

    .line 24
    .line 25
    if-ne v0, v9, :cond_0

    .line 26
    .line 27
    iget-object v0, v7, Lfy2;->p:Lfx3;

    .line 28
    .line 29
    iget-object v3, v7, Lfy2;->o:Lfx3;

    .line 30
    .line 31
    iget-object v5, v7, Lfy2;->s:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v5, Le74;

    .line 34
    .line 35
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    move-object v6, v3

    .line 39
    move-object/from16 v17, v4

    .line 40
    .line 41
    move-object v14, v5

    .line 42
    move v11, v9

    .line 43
    move-object v4, v12

    .line 44
    move-object/from16 v3, p1

    .line 45
    .line 46
    goto/16 :goto_3

    .line 47
    .line 48
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v8

    .line 54
    :cond_1
    iget v0, v7, Lfy2;->q:I

    .line 55
    .line 56
    iget-object v3, v7, Lfy2;->o:Lfx3;

    .line 57
    .line 58
    iget-object v5, v7, Lfy2;->s:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v5, Le74;

    .line 61
    .line 62
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    move-object/from16 v16, v1

    .line 66
    .line 67
    move-object v9, v3

    .line 68
    move-object/from16 v17, v4

    .line 69
    .line 70
    move-object v14, v5

    .line 71
    move-object v5, v7

    .line 72
    move-object v7, v2

    .line 73
    goto/16 :goto_2

    .line 74
    .line 75
    :cond_2
    iget-object v0, v7, Lfy2;->p:Lfx3;

    .line 76
    .line 77
    iget-object v3, v7, Lfy2;->o:Lfx3;

    .line 78
    .line 79
    iget-object v5, v7, Lfy2;->s:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v5, Le74;

    .line 82
    .line 83
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    move v6, v11

    .line 87
    move v11, v9

    .line 88
    move v9, v6

    .line 89
    move-object v6, v3

    .line 90
    move-object/from16 v17, v4

    .line 91
    .line 92
    move-object v14, v5

    .line 93
    move-object v4, v12

    .line 94
    move-object/from16 v3, p1

    .line 95
    .line 96
    goto/16 :goto_7

    .line 97
    .line 98
    :cond_3
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iget-object v0, v7, Lfy2;->s:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Le74;

    .line 104
    .line 105
    new-instance v3, Lfx3;

    .line 106
    .line 107
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 108
    .line 109
    .line 110
    iput-boolean v11, v3, Lfx3;->n:Z

    .line 111
    .line 112
    move-object v14, v0

    .line 113
    move-object v6, v3

    .line 114
    :goto_0
    iget-boolean v0, v6, Lfx3;->n:Z

    .line 115
    .line 116
    sget-object v15, Lj15;->a:Lj15;

    .line 117
    .line 118
    if-eqz v0, :cond_c

    .line 119
    .line 120
    const/4 v0, 0x0

    .line 121
    iput-boolean v0, v6, Lfx3;->n:Z

    .line 122
    .line 123
    iget v0, v4, Lgx3;->n:F

    .line 124
    .line 125
    iget-object v3, v12, Ljx3;->n:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v3, Lxd;

    .line 128
    .line 129
    iget-object v3, v3, Lxd;->n:Lzd3;

    .line 130
    .line 131
    invoke-virtual {v3}, Lzd3;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    check-cast v3, Ljava/lang/Number;

    .line 136
    .line 137
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    sub-float/2addr v0, v3

    .line 142
    iget-object v3, v1, Ljx3;->n:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v3, Lcy2;

    .line 145
    .line 146
    iget-boolean v3, v3, Lcy2;->c:Z

    .line 147
    .line 148
    if-nez v3, :cond_4

    .line 149
    .line 150
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    iget v5, v7, Lfy2;->w:F

    .line 155
    .line 156
    cmpg-float v3, v3, v5

    .line 157
    .line 158
    if-gez v3, :cond_5

    .line 159
    .line 160
    :cond_4
    move-object/from16 v17, v4

    .line 161
    .line 162
    move v11, v9

    .line 163
    move-object v4, v12

    .line 164
    goto/16 :goto_5

    .line 165
    .line 166
    :cond_5
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    mul-float/2addr v0, v5

    .line 171
    invoke-virtual {v2, v14, v0}, Lhy2;->G(Le74;F)F

    .line 172
    .line 173
    .line 174
    iget-object v3, v12, Ljx3;->n:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v3, Lxd;

    .line 177
    .line 178
    iget-object v5, v3, Lxd;->n:Lzd3;

    .line 179
    .line 180
    invoke-virtual {v5}, Lzd3;->getValue()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v5

    .line 184
    check-cast v5, Ljava/lang/Number;

    .line 185
    .line 186
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    add-float/2addr v5, v0

    .line 191
    const/4 v0, 0x0

    .line 192
    const/16 v11, 0x1e

    .line 193
    .line 194
    invoke-static {v3, v5, v0, v11}, Lj51;->p(Lxd;FFI)Lxd;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    iput-object v0, v12, Ljx3;->n:Ljava/lang/Object;

    .line 199
    .line 200
    iget v3, v4, Lgx3;->n:F

    .line 201
    .line 202
    iget-object v0, v0, Lxd;->n:Lzd3;

    .line 203
    .line 204
    invoke-virtual {v0}, Lzd3;->getValue()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    check-cast v0, Ljava/lang/Number;

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    sub-float/2addr v3, v0

    .line 215
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    iget v3, v7, Lfy2;->y:F

    .line 220
    .line 221
    div-float/2addr v0, v3

    .line 222
    invoke-static {v0}, Lji2;->L(F)I

    .line 223
    .line 224
    .line 225
    move-result v0

    .line 226
    const/16 v3, 0x64

    .line 227
    .line 228
    if-le v0, v3, :cond_6

    .line 229
    .line 230
    move v11, v3

    .line 231
    goto :goto_1

    .line 232
    :cond_6
    move v11, v0

    .line 233
    :goto_1
    iget-object v0, v12, Ljx3;->n:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v0, Lxd;

    .line 236
    .line 237
    iget v3, v4, Lgx3;->n:F

    .line 238
    .line 239
    move v5, v3

    .line 240
    move-object v3, v1

    .line 241
    new-instance v1, Ley2;

    .line 242
    .line 243
    move/from16 v16, v5

    .line 244
    .line 245
    iget-object v5, v7, Lfy2;->z:Lg74;

    .line 246
    .line 247
    move/from16 v9, v16

    .line 248
    .line 249
    invoke-direct/range {v1 .. v6}, Ley2;-><init>(Lhy2;Ljx3;Lgx3;Lg74;Lfx3;)V

    .line 250
    .line 251
    .line 252
    move-object/from16 v16, v3

    .line 253
    .line 254
    move-object/from16 v17, v4

    .line 255
    .line 256
    iput-object v14, v7, Lfy2;->s:Ljava/lang/Object;

    .line 257
    .line 258
    iput-object v6, v7, Lfy2;->o:Lfx3;

    .line 259
    .line 260
    iput-object v8, v7, Lfy2;->p:Lfx3;

    .line 261
    .line 262
    iput v11, v7, Lfy2;->q:I

    .line 263
    .line 264
    iput v10, v7, Lfy2;->r:I

    .line 265
    .line 266
    new-instance v3, Lgx3;

    .line 267
    .line 268
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 269
    .line 270
    .line 271
    iget-object v4, v0, Lxd;->n:Lzd3;

    .line 272
    .line 273
    invoke-virtual {v4}, Lzd3;->getValue()Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v4

    .line 277
    check-cast v4, Ljava/lang/Number;

    .line 278
    .line 279
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    iput v4, v3, Lgx3;->n:F

    .line 284
    .line 285
    new-instance v4, Ljava/lang/Float;

    .line 286
    .line 287
    invoke-direct {v4, v9}, Ljava/lang/Float;-><init>(F)V

    .line 288
    .line 289
    .line 290
    sget-object v5, Lsy0;->b:Lmj0;

    .line 291
    .line 292
    invoke-static {v11, v5, v10}, Lau0;->T(ILry0;I)Lyy4;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    move-object v9, v4

    .line 297
    new-instance v4, Lry1;

    .line 298
    .line 299
    invoke-direct {v4, v3, v2, v14, v1}, Lry1;-><init>(Lgx3;Lhy2;Le74;Ley2;)V

    .line 300
    .line 301
    .line 302
    const/4 v3, 0x1

    .line 303
    move-object v1, v7

    .line 304
    move-object v7, v2

    .line 305
    move-object v2, v5

    .line 306
    move-object v5, v1

    .line 307
    move-object v1, v9

    .line 308
    invoke-static/range {v0 .. v5}, Lj51;->h(Lxd;Ljava/lang/Float;Lwd;ZLif1;Lwd0;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    if-ne v0, v13, :cond_7

    .line 313
    .line 314
    move-object v15, v0

    .line 315
    :cond_7
    if-ne v15, v13, :cond_8

    .line 316
    .line 317
    goto/16 :goto_6

    .line 318
    .line 319
    :cond_8
    move-object v9, v6

    .line 320
    move v0, v11

    .line 321
    :goto_2
    iget-boolean v1, v9, Lfx3;->n:Z

    .line 322
    .line 323
    if-nez v1, :cond_a

    .line 324
    .line 325
    const-wide/16 v1, 0x32

    .line 326
    .line 327
    int-to-long v3, v0

    .line 328
    sub-long/2addr v1, v3

    .line 329
    iput-object v14, v5, Lfy2;->s:Ljava/lang/Object;

    .line 330
    .line 331
    iput-object v9, v5, Lfy2;->o:Lfx3;

    .line 332
    .line 333
    iput-object v9, v5, Lfy2;->p:Lfx3;

    .line 334
    .line 335
    const/4 v11, 0x3

    .line 336
    iput v11, v5, Lfy2;->r:I

    .line 337
    .line 338
    iget-object v3, v5, Lfy2;->z:Lg74;

    .line 339
    .line 340
    move-object v0, v7

    .line 341
    move-object v4, v12

    .line 342
    move-object v7, v5

    .line 343
    move-wide v5, v1

    .line 344
    move-object/from16 v1, v16

    .line 345
    .line 346
    move-object/from16 v2, v17

    .line 347
    .line 348
    invoke-static/range {v0 .. v7}, Lhy2;->F(Lhy2;Ljx3;Lgx3;Lg74;Ljx3;JLwd0;)Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v3

    .line 352
    move-object v2, v0

    .line 353
    if-ne v3, v13, :cond_9

    .line 354
    .line 355
    goto :goto_6

    .line 356
    :cond_9
    move-object v0, v9

    .line 357
    move-object v6, v0

    .line 358
    :goto_3
    check-cast v3, Ljava/lang/Boolean;

    .line 359
    .line 360
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 361
    .line 362
    .line 363
    move-result v3

    .line 364
    iput-boolean v3, v0, Lfx3;->n:Z

    .line 365
    .line 366
    move-object v12, v4

    .line 367
    move v9, v11

    .line 368
    move-object/from16 v4, v17

    .line 369
    .line 370
    :goto_4
    const/4 v11, 0x1

    .line 371
    goto/16 :goto_0

    .line 372
    .line 373
    :cond_a
    move-object v2, v7

    .line 374
    move-object v7, v5

    .line 375
    move-object v6, v9

    .line 376
    move-object/from16 v1, v16

    .line 377
    .line 378
    move-object/from16 v4, v17

    .line 379
    .line 380
    const/4 v9, 0x3

    .line 381
    goto :goto_4

    .line 382
    :goto_5
    invoke-virtual {v2, v14, v0}, Lhy2;->G(Le74;F)F

    .line 383
    .line 384
    .line 385
    iput-object v14, v7, Lfy2;->s:Ljava/lang/Object;

    .line 386
    .line 387
    iput-object v6, v7, Lfy2;->o:Lfx3;

    .line 388
    .line 389
    iput-object v6, v7, Lfy2;->p:Lfx3;

    .line 390
    .line 391
    const/4 v9, 0x1

    .line 392
    iput v9, v7, Lfy2;->r:I

    .line 393
    .line 394
    iget-object v3, v7, Lfy2;->z:Lg74;

    .line 395
    .line 396
    move-object v0, v6

    .line 397
    const-wide/16 v5, 0x32

    .line 398
    .line 399
    move-object v12, v0

    .line 400
    move-object v0, v2

    .line 401
    move-object/from16 v2, v17

    .line 402
    .line 403
    invoke-static/range {v0 .. v7}, Lhy2;->F(Lhy2;Ljx3;Lgx3;Lg74;Ljx3;JLwd0;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v3

    .line 407
    move-object v2, v0

    .line 408
    if-ne v3, v13, :cond_b

    .line 409
    .line 410
    :goto_6
    return-object v13

    .line 411
    :cond_b
    move-object v0, v12

    .line 412
    move-object v6, v0

    .line 413
    :goto_7
    check-cast v3, Ljava/lang/Boolean;

    .line 414
    .line 415
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    iput-boolean v3, v0, Lfx3;->n:Z

    .line 420
    .line 421
    move v7, v11

    .line 422
    move v11, v9

    .line 423
    move v9, v7

    .line 424
    move-object/from16 v7, p0

    .line 425
    .line 426
    move-object v12, v4

    .line 427
    move-object/from16 v4, v17

    .line 428
    .line 429
    goto/16 :goto_0

    .line 430
    .line 431
    :cond_c
    return-object v15
.end method
