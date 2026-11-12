.class public final Ll94;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Lc72;

.field public final b:Lx01;

.field public final c:Le02;

.field public final d:Lq03;


# direct methods
.method public constructor <init>(Lc72;Lx01;Li03;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll94;->a:Lc72;

    .line 5
    .line 6
    iput-object p2, p0, Ll94;->b:Lx01;

    .line 7
    .line 8
    iput-object p3, p0, Ll94;->c:Le02;

    .line 9
    .line 10
    new-instance p1, Lq03;

    .line 11
    .line 12
    const/4 p2, 0x2

    .line 13
    invoke-direct {p1, p2}, Lq03;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Ll94;->d:Lq03;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()Li94;
    .locals 4

    .line 1
    new-instance v0, Le94;

    .line 2
    .line 3
    invoke-direct {v0}, Le94;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Li94;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    iget-object v3, p0, Ll94;->b:Lx01;

    .line 10
    .line 11
    iget-object p0, p0, Ll94;->a:Lc72;

    .line 12
    .line 13
    invoke-direct {v1, v3, v2, p0, v0}, Li94;-><init>(Lcx2;ZLc72;Le94;)V

    .line 14
    .line 15
    .line 16
    return-object v1
.end method

.method public final b(Lc72;Le94;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-object v0, v0, Ll94;->d:Lq03;

    .line 6
    .line 7
    iget-object v2, v0, Lq03;->a:[Ljava/lang/Object;

    .line 8
    .line 9
    iget v0, v0, Lq03;->b:I

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v3

    .line 13
    :goto_0
    if-ge v4, v0, :cond_23

    .line 14
    .line 15
    aget-object v5, v2, v4

    .line 16
    .line 17
    check-cast v5, Ly9;

    .line 18
    .line 19
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual/range {p1 .. p1}, Lc72;->v()Le94;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    move-object/from16 v7, p1

    .line 27
    .line 28
    iget v8, v7, Lc72;->o:I

    .line 29
    .line 30
    iget-object v9, v5, Ly9;->n:Lqr2;

    .line 31
    .line 32
    iget-object v10, v5, Ly9;->p:Lra;

    .line 33
    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    sget-object v12, Ln94;->r:Lp94;

    .line 37
    .line 38
    iget-object v13, v1, Le94;->n:Lw03;

    .line 39
    .line 40
    invoke-virtual {v13, v12}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v12

    .line 44
    if-nez v12, :cond_0

    .line 45
    .line 46
    const/4 v12, 0x0

    .line 47
    :cond_0
    check-cast v12, Lmb;

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    const/4 v12, 0x0

    .line 51
    :goto_1
    if-eqz v6, :cond_3

    .line 52
    .line 53
    sget-object v13, Ln94;->r:Lp94;

    .line 54
    .line 55
    iget-object v14, v6, Le94;->n:Lw03;

    .line 56
    .line 57
    invoke-virtual {v14, v13}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v13

    .line 61
    if-nez v13, :cond_2

    .line 62
    .line 63
    const/4 v13, 0x0

    .line 64
    :cond_2
    check-cast v13, Lmb;

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    const/4 v13, 0x0

    .line 68
    :goto_2
    sget-object v14, Lfz0;->O:Lmb;

    .line 69
    .line 70
    invoke-static {v13, v14}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v15

    .line 74
    const/4 v11, 0x1

    .line 75
    if-eqz v15, :cond_4

    .line 76
    .line 77
    invoke-static {v12, v14}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    if-nez v12, :cond_1e

    .line 82
    .line 83
    invoke-virtual {v9, v10, v8, v3}, Lqr2;->p(Landroid/view/View;IZ)V

    .line 84
    .line 85
    .line 86
    goto/16 :goto_d

    .line 87
    .line 88
    :cond_4
    invoke-static {v12, v14}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v12

    .line 92
    if-eqz v12, :cond_5

    .line 93
    .line 94
    invoke-static {v13, v14}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v12

    .line 98
    if-nez v12, :cond_5

    .line 99
    .line 100
    invoke-virtual {v9, v10, v8, v11}, Lqr2;->p(Landroid/view/View;IZ)V

    .line 101
    .line 102
    .line 103
    :cond_5
    if-eqz v1, :cond_7

    .line 104
    .line 105
    sget-object v12, Ln94;->C:Lp94;

    .line 106
    .line 107
    iget-object v14, v1, Le94;->n:Lw03;

    .line 108
    .line 109
    invoke-virtual {v14, v12}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v12

    .line 113
    if-nez v12, :cond_6

    .line 114
    .line 115
    const/4 v12, 0x0

    .line 116
    :cond_6
    check-cast v12, Lhe;

    .line 117
    .line 118
    if-eqz v12, :cond_7

    .line 119
    .line 120
    iget-object v12, v12, Lhe;->o:Ljava/lang/String;

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_7
    const/4 v12, 0x0

    .line 124
    :goto_3
    if-eqz v6, :cond_9

    .line 125
    .line 126
    sget-object v14, Ln94;->C:Lp94;

    .line 127
    .line 128
    iget-object v15, v6, Le94;->n:Lw03;

    .line 129
    .line 130
    invoke-virtual {v15, v14}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v14

    .line 134
    if-nez v14, :cond_8

    .line 135
    .line 136
    const/4 v14, 0x0

    .line 137
    :cond_8
    check-cast v14, Lhe;

    .line 138
    .line 139
    if-eqz v14, :cond_9

    .line 140
    .line 141
    iget-object v14, v14, Lhe;->o:Ljava/lang/String;

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_9
    const/4 v14, 0x0

    .line 145
    :goto_4
    if-eq v12, v14, :cond_e

    .line 146
    .line 147
    if-nez v12, :cond_a

    .line 148
    .line 149
    invoke-virtual {v9, v10, v8, v11}, Lqr2;->p(Landroid/view/View;IZ)V

    .line 150
    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_a
    if-nez v14, :cond_b

    .line 154
    .line 155
    invoke-virtual {v9, v10, v8, v3}, Lqr2;->p(Landroid/view/View;IZ)V

    .line 156
    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_b
    sget-object v12, Lfz0;->P:Lmb;

    .line 160
    .line 161
    invoke-static {v13, v12}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v12

    .line 165
    if-eqz v12, :cond_e

    .line 166
    .line 167
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 168
    .line 169
    .line 170
    move-result v12

    .line 171
    const/16 v15, 0x1388

    .line 172
    .line 173
    if-gt v12, v15, :cond_c

    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_c
    const/16 v12, 0x1387

    .line 177
    .line 178
    invoke-virtual {v14, v12}, Ljava/lang/String;->charAt(I)C

    .line 179
    .line 180
    .line 181
    move-result v16

    .line 182
    invoke-static/range {v16 .. v16}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 183
    .line 184
    .line 185
    move-result v16

    .line 186
    if-eqz v16, :cond_d

    .line 187
    .line 188
    invoke-virtual {v14, v15}, Ljava/lang/String;->charAt(I)C

    .line 189
    .line 190
    .line 191
    move-result v16

    .line 192
    invoke-static/range {v16 .. v16}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 193
    .line 194
    .line 195
    move-result v16

    .line 196
    if-eqz v16, :cond_d

    .line 197
    .line 198
    invoke-static {v12, v14}, Lqm4;->I0(ILjava/lang/String;)Ljava/lang/CharSequence;

    .line 199
    .line 200
    .line 201
    move-result-object v14

    .line 202
    goto :goto_5

    .line 203
    :cond_d
    invoke-static {v15, v14}, Lqm4;->I0(ILjava/lang/String;)Ljava/lang/CharSequence;

    .line 204
    .line 205
    .line 206
    move-result-object v14

    .line 207
    :goto_5
    invoke-static {v14}, Ltn;->g(Ljava/lang/CharSequence;)Landroid/view/autofill/AutofillValue;

    .line 208
    .line 209
    .line 210
    move-result-object v12

    .line 211
    invoke-virtual {v9}, Lqr2;->k()Landroid/view/autofill/AutofillManager;

    .line 212
    .line 213
    .line 214
    move-result-object v14

    .line 215
    invoke-static {v14, v10, v8, v12}, Lgm0;->v(Landroid/view/autofill/AutofillManager;Lra;ILandroid/view/autofill/AutofillValue;)V

    .line 216
    .line 217
    .line 218
    :cond_e
    :goto_6
    if-eqz v1, :cond_10

    .line 219
    .line 220
    sget-object v12, Ln94;->H:Lp94;

    .line 221
    .line 222
    iget-object v14, v1, Le94;->n:Lw03;

    .line 223
    .line 224
    invoke-virtual {v14, v12}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v12

    .line 228
    if-nez v12, :cond_f

    .line 229
    .line 230
    const/4 v12, 0x0

    .line 231
    :cond_f
    check-cast v12, Lqu4;

    .line 232
    .line 233
    goto :goto_7

    .line 234
    :cond_10
    const/4 v12, 0x0

    .line 235
    :goto_7
    if-eqz v6, :cond_12

    .line 236
    .line 237
    sget-object v14, Ln94;->H:Lp94;

    .line 238
    .line 239
    iget-object v15, v6, Le94;->n:Lw03;

    .line 240
    .line 241
    invoke-virtual {v15, v14}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v14

    .line 245
    if-nez v14, :cond_11

    .line 246
    .line 247
    const/4 v14, 0x0

    .line 248
    :cond_11
    check-cast v14, Lqu4;

    .line 249
    .line 250
    goto :goto_8

    .line 251
    :cond_12
    const/4 v14, 0x0

    .line 252
    :goto_8
    if-eq v12, v14, :cond_17

    .line 253
    .line 254
    if-nez v12, :cond_13

    .line 255
    .line 256
    invoke-virtual {v9, v10, v8, v11}, Lqr2;->p(Landroid/view/View;IZ)V

    .line 257
    .line 258
    .line 259
    goto :goto_a

    .line 260
    :cond_13
    if-nez v14, :cond_14

    .line 261
    .line 262
    invoke-virtual {v9, v10, v8, v3}, Lqr2;->p(Landroid/view/View;IZ)V

    .line 263
    .line 264
    .line 265
    goto :goto_a

    .line 266
    :cond_14
    sget-object v12, Lfz0;->Q:Lmb;

    .line 267
    .line 268
    invoke-static {v13, v12}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v12

    .line 272
    if-eqz v12, :cond_17

    .line 273
    .line 274
    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    .line 275
    .line 276
    .line 277
    move-result v12

    .line 278
    if-eqz v12, :cond_16

    .line 279
    .line 280
    if-eq v12, v11, :cond_15

    .line 281
    .line 282
    const/4 v12, 0x0

    .line 283
    goto :goto_9

    .line 284
    :cond_15
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 285
    .line 286
    goto :goto_9

    .line 287
    :cond_16
    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 288
    .line 289
    :goto_9
    if-eqz v12, :cond_17

    .line 290
    .line 291
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 292
    .line 293
    .line 294
    move-result v12

    .line 295
    invoke-static {v12}, Ltn;->h(Z)Landroid/view/autofill/AutofillValue;

    .line 296
    .line 297
    .line 298
    move-result-object v12

    .line 299
    invoke-virtual {v9}, Lqr2;->k()Landroid/view/autofill/AutofillManager;

    .line 300
    .line 301
    .line 302
    move-result-object v13

    .line 303
    invoke-static {v13, v10, v8, v12}, Lgm0;->v(Landroid/view/autofill/AutofillManager;Lra;ILandroid/view/autofill/AutofillValue;)V

    .line 304
    .line 305
    .line 306
    :cond_17
    :goto_a
    if-eqz v1, :cond_19

    .line 307
    .line 308
    sget-object v12, Ln94;->s:Lp94;

    .line 309
    .line 310
    iget-object v13, v1, Le94;->n:Lw03;

    .line 311
    .line 312
    invoke-virtual {v13, v12}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v12

    .line 316
    if-nez v12, :cond_18

    .line 317
    .line 318
    const/4 v12, 0x0

    .line 319
    :cond_18
    check-cast v12, Lwb;

    .line 320
    .line 321
    goto :goto_b

    .line 322
    :cond_19
    const/4 v12, 0x0

    .line 323
    :goto_b
    if-eqz v6, :cond_1b

    .line 324
    .line 325
    sget-object v13, Ln94;->s:Lp94;

    .line 326
    .line 327
    iget-object v14, v6, Le94;->n:Lw03;

    .line 328
    .line 329
    invoke-virtual {v14, v13}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v13

    .line 333
    if-nez v13, :cond_1a

    .line 334
    .line 335
    const/4 v13, 0x0

    .line 336
    :cond_1a
    check-cast v13, Lwb;

    .line 337
    .line 338
    goto :goto_c

    .line 339
    :cond_1b
    const/4 v13, 0x0

    .line 340
    :goto_c
    invoke-static {v12, v13}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v14

    .line 344
    if-nez v14, :cond_1e

    .line 345
    .line 346
    if-nez v12, :cond_1c

    .line 347
    .line 348
    invoke-virtual {v9, v10, v8, v11}, Lqr2;->p(Landroid/view/View;IZ)V

    .line 349
    .line 350
    .line 351
    goto :goto_d

    .line 352
    :cond_1c
    if-nez v13, :cond_1d

    .line 353
    .line 354
    invoke-virtual {v9, v10, v8, v3}, Lqr2;->p(Landroid/view/View;IZ)V

    .line 355
    .line 356
    .line 357
    goto :goto_d

    .line 358
    :cond_1d
    iget-object v12, v13, Lwb;->a:Landroid/view/autofill/AutofillValue;

    .line 359
    .line 360
    invoke-virtual {v9}, Lqr2;->k()Landroid/view/autofill/AutofillManager;

    .line 361
    .line 362
    .line 363
    move-result-object v9

    .line 364
    invoke-static {v9, v10, v8, v12}, Lgm0;->v(Landroid/view/autofill/AutofillManager;Lra;ILandroid/view/autofill/AutofillValue;)V

    .line 365
    .line 366
    .line 367
    :cond_1e
    :goto_d
    if-eqz v1, :cond_1f

    .line 368
    .line 369
    iget-object v9, v1, Le94;->n:Lw03;

    .line 370
    .line 371
    sget-object v10, Ln94;->q:Lp94;

    .line 372
    .line 373
    invoke-virtual {v9, v10}, Lw03;->b(Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v9

    .line 377
    if-ne v9, v11, :cond_1f

    .line 378
    .line 379
    move v9, v11

    .line 380
    goto :goto_e

    .line 381
    :cond_1f
    move v9, v3

    .line 382
    :goto_e
    if-eqz v6, :cond_20

    .line 383
    .line 384
    iget-object v6, v6, Le94;->n:Lw03;

    .line 385
    .line 386
    sget-object v10, Ln94;->q:Lp94;

    .line 387
    .line 388
    invoke-virtual {v6, v10}, Lw03;->b(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v6

    .line 392
    if-ne v6, v11, :cond_20

    .line 393
    .line 394
    goto :goto_f

    .line 395
    :cond_20
    move v11, v3

    .line 396
    :goto_f
    if-eq v9, v11, :cond_22

    .line 397
    .line 398
    iget-object v5, v5, Ly9;->t:Lj03;

    .line 399
    .line 400
    if-eqz v11, :cond_21

    .line 401
    .line 402
    invoke-virtual {v5, v8}, Lj03;->a(I)Z

    .line 403
    .line 404
    .line 405
    goto :goto_10

    .line 406
    :cond_21
    invoke-virtual {v5, v8}, Lj03;->f(I)Z

    .line 407
    .line 408
    .line 409
    :cond_22
    :goto_10
    add-int/lit8 v4, v4, 0x1

    .line 410
    .line 411
    goto/16 :goto_0

    .line 412
    .line 413
    :cond_23
    return-void
.end method
