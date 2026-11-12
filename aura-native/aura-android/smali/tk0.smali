.class public final Ltk0;
.super Lep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public final synthetic o:I

.field public p:Lgx3;

.field public q:I

.field public final synthetic r:F

.field public s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;

.field public final synthetic u:Lq64;


# direct methods
.method public constructor <init>(FLuk0;Lc74;Lvd0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ltk0;->o:I

    .line 17
    iput p1, p0, Ltk0;->r:F

    iput-object p2, p0, Ltk0;->t:Ljava/lang/Object;

    iput-object p3, p0, Ltk0;->u:Lq64;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lep4;-><init>(ILvd0;)V

    return-void
.end method

.method public constructor <init>(Lwg4;FLif1;Lq64;Lvd0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ltk0;->o:I

    .line 3
    .line 4
    iput-object p1, p0, Ltk0;->s:Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, Ltk0;->r:F

    .line 7
    .line 8
    iput-object p3, p0, Ltk0;->t:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, Ltk0;->u:Lq64;

    .line 11
    .line 12
    const/4 p1, 0x2

    .line 13
    invoke-direct {p0, p1, p5}, Lep4;-><init>(ILvd0;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvd0;)Lvd0;
    .locals 7

    .line 1
    iget p1, p0, Ltk0;->o:I

    .line 2
    .line 3
    iget-object v0, p0, Ltk0;->t:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v1, Ltk0;

    .line 9
    .line 10
    iget-object p1, p0, Ltk0;->s:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v2, p1

    .line 13
    check-cast v2, Lwg4;

    .line 14
    .line 15
    move-object v4, v0

    .line 16
    check-cast v4, Lif1;

    .line 17
    .line 18
    iget-object v5, p0, Ltk0;->u:Lq64;

    .line 19
    .line 20
    iget v3, p0, Ltk0;->r:F

    .line 21
    .line 22
    move-object v6, p2

    .line 23
    invoke-direct/range {v1 .. v6}, Ltk0;-><init>(Lwg4;FLif1;Lq64;Lvd0;)V

    .line 24
    .line 25
    .line 26
    return-object v1

    .line 27
    :pswitch_0
    move-object v6, p2

    .line 28
    new-instance p1, Ltk0;

    .line 29
    .line 30
    check-cast v0, Luk0;

    .line 31
    .line 32
    iget-object p2, p0, Ltk0;->u:Lq64;

    .line 33
    .line 34
    check-cast p2, Lc74;

    .line 35
    .line 36
    iget p0, p0, Ltk0;->r:F

    .line 37
    .line 38
    invoke-direct {p1, p0, v0, p2, v6}, Ltk0;-><init>(FLuk0;Lc74;Lvd0;)V

    .line 39
    .line 40
    .line 41
    return-object p1

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Ltk0;->o:I

    .line 2
    .line 3
    sget-object v1, Lj15;->a:Lj15;

    .line 4
    .line 5
    check-cast p1, Lwe0;

    .line 6
    .line 7
    check-cast p2, Lvd0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Ltk0;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ltk0;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Ltk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Ltk0;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ltk0;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Ltk0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget v0, v5, Ltk0;->o:I

    .line 4
    .line 5
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    sget-object v7, Lxe0;->n:Lxe0;

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    iget v2, v5, Ltk0;->r:F

    .line 11
    .line 12
    iget-object v3, v5, Ltk0;->t:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v9, 0x1

    .line 15
    const/4 v10, 0x0

    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object v11, v3

    .line 20
    check-cast v11, Lif1;

    .line 21
    .line 22
    iget-object v0, v5, Ltk0;->s:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lwg4;

    .line 25
    .line 26
    iget-object v12, v0, Lwg4;->a:Lrf2;

    .line 27
    .line 28
    iget v3, v5, Ltk0;->q:I

    .line 29
    .line 30
    const/4 v13, 0x2

    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    if-eq v3, v9, :cond_1

    .line 34
    .line 35
    if-ne v3, v13, :cond_0

    .line 36
    .line 37
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    move-object/from16 v14, p1

    .line 41
    .line 42
    goto/16 :goto_8

    .line 43
    .line 44
    :cond_0
    invoke-static {v1}, Lkf2;->o(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 v14, 0x0

    .line 48
    goto/16 :goto_8

    .line 49
    .line 50
    :cond_1
    iget-object v1, v5, Ltk0;->p:Lgx3;

    .line 51
    .line 52
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move/from16 v16, v6

    .line 56
    .line 57
    move-object v14, v7

    .line 58
    move-object v6, v1

    .line 59
    move-object/from16 v1, p1

    .line 60
    .line 61
    goto/16 :goto_2

    .line 62
    .line 63
    :cond_2
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    iget-object v1, v0, Lwg4;->b:Lui0;

    .line 67
    .line 68
    new-instance v3, Lna4;

    .line 69
    .line 70
    iget-object v1, v1, Lui0;->a:Lrm2;

    .line 71
    .line 72
    invoke-direct {v3, v1}, Lna4;-><init>(Lrm2;)V

    .line 73
    .line 74
    .line 75
    new-instance v1, Lzd;

    .line 76
    .line 77
    invoke-direct {v1, v6}, Lzd;-><init>(F)V

    .line 78
    .line 79
    .line 80
    new-instance v4, Lzd;

    .line 81
    .line 82
    invoke-direct {v4, v2}, Lzd;-><init>(F)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, v1, v4}, Lna4;->D(Lce;Lce;)Lce;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, Lzd;

    .line 90
    .line 91
    iget v1, v1, Lzd;->a:F

    .line 92
    .line 93
    iget-object v3, v12, Lrf2;->n:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v3, Llm0;

    .line 96
    .line 97
    iget-object v4, v3, Lad3;->m:Lzd3;

    .line 98
    .line 99
    invoke-virtual {v3}, Lad3;->o()I

    .line 100
    .line 101
    .line 102
    move-result v14

    .line 103
    invoke-virtual {v4}, Lzd3;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v15

    .line 107
    check-cast v15, Lqc3;

    .line 108
    .line 109
    iget v15, v15, Lqc3;->c:I

    .line 110
    .line 111
    add-int/2addr v15, v14

    .line 112
    if-nez v15, :cond_3

    .line 113
    .line 114
    move v1, v6

    .line 115
    move/from16 v16, v1

    .line 116
    .line 117
    move-object v14, v7

    .line 118
    goto :goto_1

    .line 119
    :cond_3
    cmpg-float v14, v2, v6

    .line 120
    .line 121
    iget v13, v3, Lad3;->e:I

    .line 122
    .line 123
    if-gez v14, :cond_4

    .line 124
    .line 125
    add-int/lit8 v13, v13, 0x1

    .line 126
    .line 127
    :cond_4
    int-to-float v14, v15

    .line 128
    div-float/2addr v1, v14

    .line 129
    float-to-int v1, v1

    .line 130
    add-int/2addr v1, v13

    .line 131
    invoke-virtual {v3}, Llm0;->n()I

    .line 132
    .line 133
    .line 134
    move-result v14

    .line 135
    invoke-static {v1, v10, v14}, Lgb;->m(III)I

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    invoke-virtual {v3}, Lad3;->o()I

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4}, Lzd3;->getValue()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    check-cast v4, Lqc3;

    .line 147
    .line 148
    iget v4, v4, Lqc3;->c:I

    .line 149
    .line 150
    move/from16 v16, v6

    .line 151
    .line 152
    move-object v14, v7

    .line 153
    int-to-long v6, v13

    .line 154
    const-wide/16 v17, 0x1

    .line 155
    .line 156
    sub-long v19, v6, v17

    .line 157
    .line 158
    const-wide/16 v21, 0x0

    .line 159
    .line 160
    cmp-long v4, v19, v21

    .line 161
    .line 162
    if-gez v4, :cond_5

    .line 163
    .line 164
    move-wide/from16 v8, v21

    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_5
    move-wide/from16 v8, v19

    .line 168
    .line 169
    :goto_0
    long-to-int v4, v8

    .line 170
    add-long v6, v6, v17

    .line 171
    .line 172
    const-wide/32 v8, 0x7fffffff

    .line 173
    .line 174
    .line 175
    cmp-long v17, v6, v8

    .line 176
    .line 177
    if-lez v17, :cond_6

    .line 178
    .line 179
    move-wide v6, v8

    .line 180
    :cond_6
    long-to-int v6, v6

    .line 181
    invoke-static {v1, v4, v6}, Lgb;->m(III)I

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    invoke-virtual {v3}, Llm0;->n()I

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    invoke-static {v1, v10, v3}, Lgb;->m(III)I

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    sub-int/2addr v1, v13

    .line 194
    mul-int/2addr v1, v15

    .line 195
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    sub-int/2addr v1, v15

    .line 200
    if-gez v1, :cond_7

    .line 201
    .line 202
    move v1, v10

    .line 203
    :cond_7
    if-nez v1, :cond_8

    .line 204
    .line 205
    int-to-float v1, v1

    .line 206
    goto :goto_1

    .line 207
    :cond_8
    int-to-float v1, v1

    .line 208
    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    .line 209
    .line 210
    .line 211
    move-result v3

    .line 212
    mul-float/2addr v3, v1

    .line 213
    move v1, v3

    .line 214
    :goto_1
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    if-eqz v3, :cond_9

    .line 219
    .line 220
    const-string v3, "calculateApproachOffset returned NaN. Please use a valid value."

    .line 221
    .line 222
    invoke-static {v3}, Lfz1;->c(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    :cond_9
    new-instance v6, Lgx3;

    .line 226
    .line 227
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 228
    .line 229
    .line 230
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 231
    .line 232
    .line 233
    move-result v1

    .line 234
    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    mul-float/2addr v2, v1

    .line 239
    iput v2, v6, Lgx3;->n:F

    .line 240
    .line 241
    new-instance v1, Ljava/lang/Float;

    .line 242
    .line 243
    invoke-direct {v1, v2}, Ljava/lang/Float;-><init>(F)V

    .line 244
    .line 245
    .line 246
    invoke-interface {v11, v1}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    iget v2, v6, Lgx3;->n:F

    .line 250
    .line 251
    new-instance v4, Ltg4;

    .line 252
    .line 253
    invoke-direct {v4, v6, v11, v10}, Ltg4;-><init>(Lgx3;Lif1;I)V

    .line 254
    .line 255
    .line 256
    iput-object v6, v5, Ltk0;->p:Lgx3;

    .line 257
    .line 258
    const/4 v1, 0x1

    .line 259
    iput v1, v5, Ltk0;->q:I

    .line 260
    .line 261
    iget-object v1, v5, Ltk0;->u:Lq64;

    .line 262
    .line 263
    iget v3, v5, Ltk0;->r:F

    .line 264
    .line 265
    invoke-static/range {v0 .. v5}, Lwg4;->b(Lwg4;Lq64;FFLtg4;Lwd0;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    if-ne v1, v14, :cond_a

    .line 270
    .line 271
    goto/16 :goto_8

    .line 272
    .line 273
    :cond_a
    :goto_2
    check-cast v1, Lxd;

    .line 274
    .line 275
    invoke-virtual {v1}, Lxd;->a()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v2

    .line 279
    check-cast v2, Ljava/lang/Number;

    .line 280
    .line 281
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    iget-object v3, v12, Lrf2;->n:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v3, Llm0;

    .line 288
    .line 289
    invoke-virtual {v3}, Lad3;->m()Lqc3;

    .line 290
    .line 291
    .line 292
    move-result-object v4

    .line 293
    iget-object v4, v4, Lqc3;->n:Lrv2;

    .line 294
    .line 295
    invoke-virtual {v3}, Lad3;->m()Lqc3;

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    iget-object v7, v7, Lqc3;->a:Ljava/util/List;

    .line 300
    .line 301
    invoke-interface {v7}, Ljava/util/Collection;->size()I

    .line 302
    .line 303
    .line 304
    move-result v8

    .line 305
    const/high16 v15, -0x800000    # Float.NEGATIVE_INFINITY

    .line 306
    .line 307
    const/high16 v17, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 308
    .line 309
    :goto_3
    if-ge v10, v8, :cond_d

    .line 310
    .line 311
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v18

    .line 315
    const/high16 p1, -0x800000    # Float.NEGATIVE_INFINITY

    .line 316
    .line 317
    move-object/from16 v9, v18

    .line 318
    .line 319
    check-cast v9, Lxi2;

    .line 320
    .line 321
    invoke-virtual {v3}, Lad3;->m()Lqc3;

    .line 322
    .line 323
    .line 324
    move-result-object v18

    .line 325
    invoke-static/range {v18 .. v18}, Lte5;->x(Lqc3;)I

    .line 326
    .line 327
    .line 328
    const/high16 v18, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 329
    .line 330
    invoke-virtual {v3}, Lad3;->m()Lqc3;

    .line 331
    .line 332
    .line 333
    move-result-object v13

    .line 334
    iget v13, v13, Lqc3;->f:I

    .line 335
    .line 336
    invoke-virtual {v3}, Lad3;->m()Lqc3;

    .line 337
    .line 338
    .line 339
    move-result-object v13

    .line 340
    iget v13, v13, Lqc3;->d:I

    .line 341
    .line 342
    invoke-virtual {v3}, Lad3;->m()Lqc3;

    .line 343
    .line 344
    .line 345
    move-result-object v13

    .line 346
    iget v13, v13, Lqc3;->b:I

    .line 347
    .line 348
    iget v9, v9, Lxi2;->l:I

    .line 349
    .line 350
    invoke-virtual {v3}, Llm0;->n()I

    .line 351
    .line 352
    .line 353
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    int-to-float v9, v9

    .line 357
    sub-float v9, v9, v16

    .line 358
    .line 359
    cmpg-float v13, v9, v16

    .line 360
    .line 361
    if-gtz v13, :cond_b

    .line 362
    .line 363
    cmpl-float v13, v9, v15

    .line 364
    .line 365
    if-lez v13, :cond_b

    .line 366
    .line 367
    move v15, v9

    .line 368
    :cond_b
    cmpl-float v13, v9, v16

    .line 369
    .line 370
    if-ltz v13, :cond_c

    .line 371
    .line 372
    cmpg-float v13, v9, v17

    .line 373
    .line 374
    if-gez v13, :cond_c

    .line 375
    .line 376
    move/from16 v17, v9

    .line 377
    .line 378
    :cond_c
    add-int/lit8 v10, v10, 0x1

    .line 379
    .line 380
    goto :goto_3

    .line 381
    :cond_d
    const/high16 p1, -0x800000    # Float.NEGATIVE_INFINITY

    .line 382
    .line 383
    const/high16 v18, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 384
    .line 385
    cmpg-float v4, v15, p1

    .line 386
    .line 387
    if-nez v4, :cond_e

    .line 388
    .line 389
    move/from16 v15, v17

    .line 390
    .line 391
    :cond_e
    cmpg-float v4, v17, v18

    .line 392
    .line 393
    if-nez v4, :cond_f

    .line 394
    .line 395
    move/from16 v17, v15

    .line 396
    .line 397
    :cond_f
    invoke-virtual {v3}, Lad3;->c()Z

    .line 398
    .line 399
    .line 400
    move-result v4

    .line 401
    if-nez v4, :cond_11

    .line 402
    .line 403
    invoke-static {v3, v2}, Lxl;->A(Lad3;F)Z

    .line 404
    .line 405
    .line 406
    move-result v4

    .line 407
    if-eqz v4, :cond_10

    .line 408
    .line 409
    move/from16 v15, v16

    .line 410
    .line 411
    move/from16 v17, v15

    .line 412
    .line 413
    goto :goto_4

    .line 414
    :cond_10
    move/from16 v17, v16

    .line 415
    .line 416
    :cond_11
    :goto_4
    invoke-virtual {v3}, Lad3;->b()Z

    .line 417
    .line 418
    .line 419
    move-result v4

    .line 420
    if-nez v4, :cond_13

    .line 421
    .line 422
    invoke-static {v3, v2}, Lxl;->A(Lad3;F)Z

    .line 423
    .line 424
    .line 425
    move-result v3

    .line 426
    if-nez v3, :cond_12

    .line 427
    .line 428
    move/from16 v3, v16

    .line 429
    .line 430
    move v15, v3

    .line 431
    goto :goto_5

    .line 432
    :cond_12
    move/from16 v15, v16

    .line 433
    .line 434
    :cond_13
    move/from16 v3, v17

    .line 435
    .line 436
    :goto_5
    iget-object v4, v12, Lrf2;->o:Ljava/lang/Object;

    .line 437
    .line 438
    check-cast v4, Lgc3;

    .line 439
    .line 440
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 441
    .line 442
    .line 443
    move-result-object v2

    .line 444
    invoke-static {v15}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 445
    .line 446
    .line 447
    move-result-object v7

    .line 448
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 449
    .line 450
    .line 451
    move-result-object v8

    .line 452
    invoke-virtual {v4, v2, v7, v8}, Lgc3;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    check-cast v2, Ljava/lang/Number;

    .line 457
    .line 458
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 459
    .line 460
    .line 461
    move-result v2

    .line 462
    cmpg-float v4, v2, v15

    .line 463
    .line 464
    if-nez v4, :cond_14

    .line 465
    .line 466
    goto :goto_6

    .line 467
    :cond_14
    cmpg-float v4, v2, v3

    .line 468
    .line 469
    if-nez v4, :cond_15

    .line 470
    .line 471
    goto :goto_6

    .line 472
    :cond_15
    cmpg-float v4, v2, v16

    .line 473
    .line 474
    if-nez v4, :cond_16

    .line 475
    .line 476
    goto :goto_6

    .line 477
    :cond_16
    new-instance v4, Ljava/lang/StringBuilder;

    .line 478
    .line 479
    const-string v7, "Final Snapping Offset Should Be one of "

    .line 480
    .line 481
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 485
    .line 486
    .line 487
    const-string v7, ", "

    .line 488
    .line 489
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    const-string v3, " or 0.0"

    .line 496
    .line 497
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 501
    .line 502
    .line 503
    move-result-object v3

    .line 504
    invoke-static {v3}, Lfz1;->c(Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    :goto_6
    cmpg-float v3, v2, v18

    .line 508
    .line 509
    if-nez v3, :cond_17

    .line 510
    .line 511
    goto :goto_7

    .line 512
    :cond_17
    cmpg-float v3, v2, p1

    .line 513
    .line 514
    if-nez v3, :cond_18

    .line 515
    .line 516
    :goto_7
    move/from16 v2, v16

    .line 517
    .line 518
    :cond_18
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 519
    .line 520
    .line 521
    move-result v3

    .line 522
    if-eqz v3, :cond_19

    .line 523
    .line 524
    const-string v3, "calculateSnapOffset returned NaN. Please use a valid value."

    .line 525
    .line 526
    invoke-static {v3}, Lfz1;->c(Ljava/lang/String;)V

    .line 527
    .line 528
    .line 529
    :cond_19
    iput v2, v6, Lgx3;->n:F

    .line 530
    .line 531
    const/16 v3, 0x1e

    .line 532
    .line 533
    move/from16 v4, v16

    .line 534
    .line 535
    invoke-static {v1, v4, v4, v3}, Lj51;->p(Lxd;FFI)Lxd;

    .line 536
    .line 537
    .line 538
    move-result-object v3

    .line 539
    iget-object v4, v0, Lwg4;->c:Lck4;

    .line 540
    .line 541
    new-instance v0, Ltg4;

    .line 542
    .line 543
    const/4 v1, 0x1

    .line 544
    invoke-direct {v0, v6, v11, v1}, Ltg4;-><init>(Lgx3;Lif1;I)V

    .line 545
    .line 546
    .line 547
    const/4 v6, 0x0

    .line 548
    iput-object v6, v5, Ltk0;->p:Lgx3;

    .line 549
    .line 550
    const/4 v1, 0x2

    .line 551
    iput v1, v5, Ltk0;->q:I

    .line 552
    .line 553
    move-object v1, v0

    .line 554
    iget-object v0, v5, Ltk0;->u:Lq64;

    .line 555
    .line 556
    move-object v5, v1

    .line 557
    move v1, v2

    .line 558
    move-object/from16 v6, p0

    .line 559
    .line 560
    invoke-static/range {v0 .. v6}, Lsu3;->d(Lq64;FFLxd;Lck4;Lif1;Lwd0;)Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    if-ne v0, v14, :cond_1a

    .line 565
    .line 566
    goto :goto_8

    .line 567
    :cond_1a
    move-object v14, v0

    .line 568
    :goto_8
    return-object v14

    .line 569
    :pswitch_0
    move-object v14, v7

    .line 570
    const/4 v6, 0x0

    .line 571
    iget v0, v5, Ltk0;->q:I

    .line 572
    .line 573
    if-eqz v0, :cond_1c

    .line 574
    .line 575
    const/4 v4, 0x1

    .line 576
    if-ne v0, v4, :cond_1b

    .line 577
    .line 578
    iget-object v0, v5, Ltk0;->s:Ljava/lang/Object;

    .line 579
    .line 580
    check-cast v0, Lxd;

    .line 581
    .line 582
    iget-object v1, v5, Ltk0;->p:Lgx3;

    .line 583
    .line 584
    :try_start_0
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1

    .line 585
    .line 586
    .line 587
    goto :goto_9

    .line 588
    :cond_1b
    invoke-static {v1}, Lkf2;->o(Ljava/lang/String;)V

    .line 589
    .line 590
    .line 591
    move-object v7, v6

    .line 592
    goto :goto_a

    .line 593
    :cond_1c
    invoke-static/range {p1 .. p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 594
    .line 595
    .line 596
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 597
    .line 598
    .line 599
    move-result v0

    .line 600
    const/high16 v1, 0x3f800000    # 1.0f

    .line 601
    .line 602
    cmpl-float v0, v0, v1

    .line 603
    .line 604
    if-lez v0, :cond_1e

    .line 605
    .line 606
    new-instance v1, Lgx3;

    .line 607
    .line 608
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 609
    .line 610
    .line 611
    iput v2, v1, Lgx3;->n:F

    .line 612
    .line 613
    new-instance v0, Lgx3;

    .line 614
    .line 615
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 616
    .line 617
    .line 618
    const/16 v4, 0x1c

    .line 619
    .line 620
    const/4 v6, 0x0

    .line 621
    invoke-static {v6, v2, v4}, Lj51;->a(FFI)Lxd;

    .line 622
    .line 623
    .line 624
    move-result-object v2

    .line 625
    :try_start_1
    check-cast v3, Luk0;

    .line 626
    .line 627
    iget-object v4, v3, Luk0;->a:Lui0;

    .line 628
    .line 629
    iget-object v6, v5, Ltk0;->u:Lq64;

    .line 630
    .line 631
    check-cast v6, Lc74;

    .line 632
    .line 633
    new-instance v7, Ldd0;

    .line 634
    .line 635
    invoke-direct {v7, v0, v6, v1, v3}, Ldd0;-><init>(Lgx3;Lc74;Lgx3;Luk0;)V

    .line 636
    .line 637
    .line 638
    iput-object v1, v5, Ltk0;->p:Lgx3;

    .line 639
    .line 640
    iput-object v2, v5, Ltk0;->s:Ljava/lang/Object;

    .line 641
    .line 642
    const/4 v0, 0x1

    .line 643
    iput v0, v5, Ltk0;->q:I

    .line 644
    .line 645
    invoke-static {v2, v4, v10, v7, v5}, Lj51;->g(Lxd;Lui0;ZLif1;Lwd0;)Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    .line 649
    if-ne v0, v14, :cond_1d

    .line 650
    .line 651
    move-object v7, v14

    .line 652
    goto :goto_a

    .line 653
    :catch_0
    move-object v0, v2

    .line 654
    :catch_1
    invoke-virtual {v0}, Lxd;->a()Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    check-cast v0, Ljava/lang/Number;

    .line 659
    .line 660
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 661
    .line 662
    .line 663
    move-result v0

    .line 664
    iput v0, v1, Lgx3;->n:F

    .line 665
    .line 666
    :cond_1d
    :goto_9
    iget v2, v1, Lgx3;->n:F

    .line 667
    .line 668
    :cond_1e
    new-instance v7, Ljava/lang/Float;

    .line 669
    .line 670
    invoke-direct {v7, v2}, Ljava/lang/Float;-><init>(F)V

    .line 671
    .line 672
    .line 673
    :goto_a
    return-object v7

    .line 674
    nop

    .line 675
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
