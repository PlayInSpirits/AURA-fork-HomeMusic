.class public final Ld64;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Lol1;

.field public final b:I

.field public final c:Z

.field public final d:D

.field public final e:Ltu4;

.field public final f:Ltu4;

.field public final g:Ltu4;

.field public final h:Ltu4;

.field public final i:Ltu4;

.field public final j:Ltu4;


# direct methods
.method public constructor <init>(Lol1;ZD)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-wide v2, v1, Lol1;->a:D

    .line 6
    .line 7
    iget-wide v4, v1, Lol1;->b:D

    .line 8
    .line 9
    invoke-static {v2, v3, v4, v5}, Ltu4;->a(DD)Ltu4;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-wide v3, v1, Lol1;->a:D

    .line 14
    .line 15
    iget-wide v5, v1, Lol1;->b:D

    .line 16
    .line 17
    const-wide/high16 v7, 0x4040000000000000L    # 32.0

    .line 18
    .line 19
    sub-double v7, v5, v7

    .line 20
    .line 21
    const-wide/high16 v9, 0x3fe0000000000000L    # 0.5

    .line 22
    .line 23
    mul-double/2addr v5, v9

    .line 24
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->max(DD)D

    .line 25
    .line 26
    .line 27
    move-result-wide v5

    .line 28
    invoke-static {v3, v4, v5, v6}, Ltu4;->a(DD)Ltu4;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    new-instance v4, Lss0;

    .line 33
    .line 34
    invoke-direct {v4, v1}, Lss0;-><init>(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-wide v5, v1, Lol1;->a:D

    .line 38
    .line 39
    invoke-static {v5, v6}, Ljava/lang/Math;->round(D)J

    .line 40
    .line 41
    .line 42
    move-result-wide v5

    .line 43
    long-to-int v5, v5

    .line 44
    invoke-virtual {v4}, Lss0;->y()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    check-cast v6, Lol1;

    .line 53
    .line 54
    invoke-virtual {v4, v6}, Lss0;->A(Lol1;)D

    .line 55
    .line 56
    .line 57
    move-result-wide v7

    .line 58
    new-instance v9, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    const/4 v13, 0x0

    .line 67
    const-wide/16 v14, 0x0

    .line 68
    .line 69
    :goto_0
    const/16 v10, 0x168

    .line 70
    .line 71
    if-ge v13, v10, :cond_1

    .line 72
    .line 73
    add-int v11, v5, v13

    .line 74
    .line 75
    rem-int/2addr v11, v10

    .line 76
    if-gez v11, :cond_0

    .line 77
    .line 78
    add-int/lit16 v11, v11, 0x168

    .line 79
    .line 80
    :cond_0
    invoke-virtual {v4}, Lss0;->y()Ljava/util/List;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    check-cast v10, Lol1;

    .line 89
    .line 90
    invoke-virtual {v4, v10}, Lss0;->A(Lol1;)D

    .line 91
    .line 92
    .line 93
    move-result-wide v10

    .line 94
    sub-double v7, v10, v7

    .line 95
    .line 96
    invoke-static {v7, v8}, Ljava/lang/Math;->abs(D)D

    .line 97
    .line 98
    .line 99
    move-result-wide v7

    .line 100
    add-double/2addr v14, v7

    .line 101
    add-int/lit8 v13, v13, 0x1

    .line 102
    .line 103
    move-wide v7, v10

    .line 104
    goto :goto_0

    .line 105
    :cond_1
    const-wide/high16 v7, 0x4018000000000000L    # 6.0

    .line 106
    .line 107
    div-double/2addr v14, v7

    .line 108
    invoke-virtual {v4, v6}, Lss0;->A(Lol1;)D

    .line 109
    .line 110
    .line 111
    move-result-wide v6

    .line 112
    const/4 v11, 0x1

    .line 113
    const-wide/16 v16, 0x0

    .line 114
    .line 115
    :goto_1
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 116
    .line 117
    .line 118
    move-result v13

    .line 119
    const/4 v8, 0x6

    .line 120
    if-ge v13, v8, :cond_7

    .line 121
    .line 122
    add-int v13, v5, v11

    .line 123
    .line 124
    rem-int/2addr v13, v10

    .line 125
    if-gez v13, :cond_2

    .line 126
    .line 127
    add-int/lit16 v13, v13, 0x168

    .line 128
    .line 129
    :cond_2
    invoke-virtual {v4}, Lss0;->y()Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v12

    .line 133
    invoke-interface {v12, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v12

    .line 137
    check-cast v12, Lol1;

    .line 138
    .line 139
    invoke-virtual {v4, v12}, Lss0;->A(Lol1;)D

    .line 140
    .line 141
    .line 142
    move-result-wide v18

    .line 143
    sub-double v6, v18, v6

    .line 144
    .line 145
    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    .line 146
    .line 147
    .line 148
    move-result-wide v6

    .line 149
    add-double v16, v6, v16

    .line 150
    .line 151
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 152
    .line 153
    .line 154
    move-result v6

    .line 155
    int-to-double v6, v6

    .line 156
    mul-double/2addr v6, v14

    .line 157
    cmpl-double v6, v16, v6

    .line 158
    .line 159
    if-ltz v6, :cond_3

    .line 160
    .line 161
    const/4 v6, 0x1

    .line 162
    goto :goto_2

    .line 163
    :cond_3
    const/4 v6, 0x0

    .line 164
    :goto_2
    const/4 v7, 0x1

    .line 165
    :goto_3
    if-eqz v6, :cond_5

    .line 166
    .line 167
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 168
    .line 169
    .line 170
    move-result v6

    .line 171
    if-ge v6, v8, :cond_5

    .line 172
    .line 173
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    add-int/2addr v6, v7

    .line 181
    move-object v13, v9

    .line 182
    int-to-double v8, v6

    .line 183
    mul-double/2addr v8, v14

    .line 184
    cmpl-double v6, v16, v8

    .line 185
    .line 186
    if-ltz v6, :cond_4

    .line 187
    .line 188
    const/4 v6, 0x1

    .line 189
    goto :goto_4

    .line 190
    :cond_4
    const/4 v6, 0x0

    .line 191
    :goto_4
    add-int/lit8 v7, v7, 0x1

    .line 192
    .line 193
    move-object v9, v13

    .line 194
    const/4 v8, 0x6

    .line 195
    goto :goto_3

    .line 196
    :cond_5
    move-object v13, v9

    .line 197
    add-int/lit8 v11, v11, 0x1

    .line 198
    .line 199
    if-le v11, v10, :cond_6

    .line 200
    .line 201
    :goto_5
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    const/4 v5, 0x6

    .line 206
    if-ge v4, v5, :cond_8

    .line 207
    .line 208
    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    goto :goto_5

    .line 212
    :cond_6
    move-object v9, v13

    .line 213
    move-wide/from16 v6, v18

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_7
    move-object v13, v9

    .line 217
    :cond_8
    new-instance v4, Ljava/util/ArrayList;

    .line 218
    .line 219
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    .line 226
    .line 227
    invoke-static {v5, v6}, Ljava/lang/Math;->floor(D)D

    .line 228
    .line 229
    .line 230
    move-result-wide v5

    .line 231
    double-to-int v5, v5

    .line 232
    const/4 v6, 0x1

    .line 233
    :goto_6
    add-int/lit8 v7, v5, 0x1

    .line 234
    .line 235
    if-ge v6, v7, :cond_b

    .line 236
    .line 237
    rsub-int/lit8 v7, v6, 0x0

    .line 238
    .line 239
    :goto_7
    if-gez v7, :cond_9

    .line 240
    .line 241
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 242
    .line 243
    .line 244
    move-result v8

    .line 245
    add-int/2addr v7, v8

    .line 246
    goto :goto_7

    .line 247
    :cond_9
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 248
    .line 249
    .line 250
    move-result v8

    .line 251
    if-lt v7, v8, :cond_a

    .line 252
    .line 253
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 254
    .line 255
    .line 256
    move-result v8

    .line 257
    rem-int/2addr v7, v8

    .line 258
    :cond_a
    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v7

    .line 262
    check-cast v7, Lol1;

    .line 263
    .line 264
    const/4 v8, 0x0

    .line 265
    invoke-virtual {v4, v8, v7}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 266
    .line 267
    .line 268
    add-int/lit8 v6, v6, 0x1

    .line 269
    .line 270
    goto :goto_6

    .line 271
    :cond_b
    rsub-int/lit8 v5, v5, 0x3

    .line 272
    .line 273
    const/4 v8, 0x1

    .line 274
    :goto_8
    if-ge v8, v5, :cond_e

    .line 275
    .line 276
    move v6, v8

    .line 277
    :goto_9
    if-gez v6, :cond_c

    .line 278
    .line 279
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 280
    .line 281
    .line 282
    move-result v7

    .line 283
    add-int/2addr v6, v7

    .line 284
    goto :goto_9

    .line 285
    :cond_c
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 286
    .line 287
    .line 288
    move-result v7

    .line 289
    if-lt v6, v7, :cond_d

    .line 290
    .line 291
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 292
    .line 293
    .line 294
    move-result v7

    .line 295
    rem-int/2addr v6, v7

    .line 296
    :cond_d
    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v6

    .line 300
    check-cast v6, Lol1;

    .line 301
    .line 302
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    add-int/lit8 v8, v8, 0x1

    .line 306
    .line 307
    goto :goto_8

    .line 308
    :cond_e
    const/4 v5, 0x2

    .line 309
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v4

    .line 313
    check-cast v4, Lol1;

    .line 314
    .line 315
    invoke-static {v4}, Lvr1;->q(Lol1;)Lol1;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    new-instance v5, Ltu4;

    .line 320
    .line 321
    iget-wide v6, v4, Lol1;->a:D

    .line 322
    .line 323
    iget-wide v8, v4, Lol1;->b:D

    .line 324
    .line 325
    invoke-direct {v5, v6, v7, v8, v9}, Ltu4;-><init>(DD)V

    .line 326
    .line 327
    .line 328
    iget-wide v6, v1, Lol1;->a:D

    .line 329
    .line 330
    iget-wide v8, v1, Lol1;->b:D

    .line 331
    .line 332
    const-wide/high16 v10, 0x4020000000000000L    # 8.0

    .line 333
    .line 334
    div-double/2addr v8, v10

    .line 335
    invoke-static {v6, v7, v8, v9}, Ltu4;->a(DD)Ltu4;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    iget-wide v6, v1, Lol1;->a:D

    .line 340
    .line 341
    iget-wide v8, v1, Lol1;->b:D

    .line 342
    .line 343
    div-double/2addr v8, v10

    .line 344
    const-wide/high16 v10, 0x4010000000000000L    # 4.0

    .line 345
    .line 346
    add-double/2addr v8, v10

    .line 347
    invoke-static {v6, v7, v8, v9}, Ltu4;->a(DD)Ltu4;

    .line 348
    .line 349
    .line 350
    move-result-object v6

    .line 351
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 352
    .line 353
    .line 354
    iput-object v1, v0, Ld64;->a:Lol1;

    .line 355
    .line 356
    const/4 v1, 0x7

    .line 357
    iput v1, v0, Ld64;->b:I

    .line 358
    .line 359
    move/from16 v1, p2

    .line 360
    .line 361
    iput-boolean v1, v0, Ld64;->c:Z

    .line 362
    .line 363
    move-wide/from16 v7, p3

    .line 364
    .line 365
    iput-wide v7, v0, Ld64;->d:D

    .line 366
    .line 367
    iput-object v2, v0, Ld64;->e:Ltu4;

    .line 368
    .line 369
    iput-object v3, v0, Ld64;->f:Ltu4;

    .line 370
    .line 371
    iput-object v5, v0, Ld64;->g:Ltu4;

    .line 372
    .line 373
    iput-object v4, v0, Ld64;->h:Ltu4;

    .line 374
    .line 375
    iput-object v6, v0, Ld64;->i:Ltu4;

    .line 376
    .line 377
    const-wide/high16 v1, 0x4039000000000000L    # 25.0

    .line 378
    .line 379
    const-wide/high16 v3, 0x4055000000000000L    # 84.0

    .line 380
    .line 381
    invoke-static {v1, v2, v3, v4}, Ltu4;->a(DD)Ltu4;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    iput-object v1, v0, Ld64;->j:Ltu4;

    .line 386
    .line 387
    return-void
.end method
