.class public final Lnk1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/lang/ThreadLocal;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;

.field public final c:Lmf4;

.field public final d:Lp40;

.field public final e:Ljava/util/List;

.field public final f:Z

.field public final g:Z


# direct methods
.method public constructor <init>()V
    .locals 12

    .line 392
    sget-object v1, Lu21;->p:Lu21;

    .line 393
    sget-object v3, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 394
    sget-object v8, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 v9, 0x1

    const/4 v10, 0x2

    const/4 v2, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x1

    move-object v11, v8

    move-object v0, p0

    .line 395
    invoke-direct/range {v0 .. v11}, Lnk1;-><init>(Lu21;ILjava/util/Map;ZZZILjava/util/List;IILjava/util/List;)V

    return-void
.end method

.method public constructor <init>(Lu21;ILjava/util/Map;ZZZILjava/util/List;IILjava/util/List;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lnk1;->a:Ljava/lang/ThreadLocal;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lnk1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    move-object v0, p3

    .line 19
    move p3, p2

    .line 20
    new-instance p2, Lmf4;

    .line 21
    .line 22
    invoke-direct {p2, v0, p6, p11}, Lmf4;-><init>(Ljava/util/Map;ZLjava/util/List;)V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Lnk1;->c:Lmf4;

    .line 26
    .line 27
    iput-boolean p4, p0, Lnk1;->f:Z

    .line 28
    .line 29
    iput-boolean p5, p0, Lnk1;->g:Z

    .line 30
    .line 31
    new-instance v0, Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 34
    .line 35
    .line 36
    sget-object p4, Lhz4;->A:Ldz4;

    .line 37
    .line 38
    invoke-virtual {v0, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    const/4 p4, 0x1

    .line 42
    if-ne p9, p4, :cond_0

    .line 43
    .line 44
    sget-object p5, Lw73;->c:Lv73;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    new-instance p5, Lv73;

    .line 48
    .line 49
    invoke-direct {p5, p9}, Lv73;-><init>(I)V

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, p8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 59
    .line 60
    .line 61
    sget-object p5, Lhz4;->p:Ldz4;

    .line 62
    .line 63
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    sget-object p5, Lhz4;->g:Lez4;

    .line 67
    .line 68
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    sget-object p5, Lhz4;->d:Lez4;

    .line 72
    .line 73
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    sget-object p5, Lhz4;->e:Lez4;

    .line 77
    .line 78
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    sget-object p5, Lhz4;->f:Lez4;

    .line 82
    .line 83
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    const/4 p5, 0x2

    .line 87
    if-ne p7, p4, :cond_1

    .line 88
    .line 89
    sget-object p6, Lhz4;->k:Llk1;

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_1
    new-instance p6, Llk1;

    .line 93
    .line 94
    invoke-direct {p6, p5}, Llk1;-><init>(I)V

    .line 95
    .line 96
    .line 97
    :goto_1
    new-instance p7, Lez4;

    .line 98
    .line 99
    sget-object p8, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 100
    .line 101
    const-class p9, Ljava/lang/Long;

    .line 102
    .line 103
    invoke-direct {p7, p8, p9, p6}, Lez4;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lbz4;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, p7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    new-instance p7, Llk1;

    .line 110
    .line 111
    const/4 p8, 0x0

    .line 112
    invoke-direct {p7, p8}, Llk1;-><init>(I)V

    .line 113
    .line 114
    .line 115
    new-instance p9, Lez4;

    .line 116
    .line 117
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 118
    .line 119
    const-class v2, Ljava/lang/Double;

    .line 120
    .line 121
    invoke-direct {p9, v1, v2, p7}, Lez4;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lbz4;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0, p9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    new-instance p7, Llk1;

    .line 128
    .line 129
    invoke-direct {p7, p4}, Llk1;-><init>(I)V

    .line 130
    .line 131
    .line 132
    new-instance p9, Lez4;

    .line 133
    .line 134
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 135
    .line 136
    const-class v2, Ljava/lang/Float;

    .line 137
    .line 138
    invoke-direct {p9, v1, v2, p7}, Lez4;-><init>(Ljava/lang/Class;Ljava/lang/Class;Lbz4;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, p9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    if-ne p10, p5, :cond_2

    .line 145
    .line 146
    sget-object p7, Ln73;->b:Lm73;

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_2
    new-instance p7, Ln73;

    .line 150
    .line 151
    invoke-direct {p7, p10}, Ln73;-><init>(I)V

    .line 152
    .line 153
    .line 154
    new-instance p9, Lm73;

    .line 155
    .line 156
    invoke-direct {p9, p7, p8}, Lm73;-><init>(Lbz4;I)V

    .line 157
    .line 158
    .line 159
    move-object p7, p9

    .line 160
    :goto_2
    invoke-virtual {v0, p7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 161
    .line 162
    .line 163
    sget-object p7, Lhz4;->h:Ldz4;

    .line 164
    .line 165
    invoke-virtual {v0, p7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    sget-object p7, Lhz4;->i:Ldz4;

    .line 169
    .line 170
    invoke-virtual {v0, p7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    new-instance p7, Lek4;

    .line 174
    .line 175
    invoke-direct {p7, p6, p4}, Lek4;-><init>(Lbz4;I)V

    .line 176
    .line 177
    .line 178
    new-instance p9, Lek4;

    .line 179
    .line 180
    const/4 p10, 0x3

    .line 181
    invoke-direct {p9, p7, p10}, Lek4;-><init>(Lbz4;I)V

    .line 182
    .line 183
    .line 184
    new-instance p7, Ldz4;

    .line 185
    .line 186
    const-class v1, Ljava/util/concurrent/atomic/AtomicLong;

    .line 187
    .line 188
    invoke-direct {p7, v1, p9, p8}, Ldz4;-><init>(Ljava/lang/Object;Lbz4;I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0, p7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    new-instance p7, Lek4;

    .line 195
    .line 196
    invoke-direct {p7, p6, p5}, Lek4;-><init>(Lbz4;I)V

    .line 197
    .line 198
    .line 199
    new-instance p6, Lek4;

    .line 200
    .line 201
    invoke-direct {p6, p7, p10}, Lek4;-><init>(Lbz4;I)V

    .line 202
    .line 203
    .line 204
    new-instance p7, Ldz4;

    .line 205
    .line 206
    const-class p9, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 207
    .line 208
    invoke-direct {p7, p9, p6, p8}, Ldz4;-><init>(Ljava/lang/Object;Lbz4;I)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, p7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    sget-object p6, Lhz4;->j:Ldz4;

    .line 215
    .line 216
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    sget-object p6, Lhz4;->l:Lez4;

    .line 220
    .line 221
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    sget-object p6, Lhz4;->q:Ldz4;

    .line 225
    .line 226
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    sget-object p6, Lhz4;->r:Ldz4;

    .line 230
    .line 231
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    sget-object p6, Lhz4;->m:Llk1;

    .line 235
    .line 236
    new-instance p7, Ldz4;

    .line 237
    .line 238
    const-class p9, Ljava/math/BigDecimal;

    .line 239
    .line 240
    invoke-direct {p7, p9, p6, p8}, Ldz4;-><init>(Ljava/lang/Object;Lbz4;I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, p7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    sget-object p6, Lhz4;->n:Llk1;

    .line 247
    .line 248
    new-instance p7, Ldz4;

    .line 249
    .line 250
    const-class p9, Ljava/math/BigInteger;

    .line 251
    .line 252
    invoke-direct {p7, p9, p6, p8}, Ldz4;-><init>(Ljava/lang/Object;Lbz4;I)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0, p7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    sget-object p6, Lhz4;->o:Llk1;

    .line 259
    .line 260
    new-instance p7, Ldz4;

    .line 261
    .line 262
    const-class p9, Lq72;

    .line 263
    .line 264
    invoke-direct {p7, p9, p6, p8}, Ldz4;-><init>(Ljava/lang/Object;Lbz4;I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, p7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    sget-object p6, Lhz4;->s:Ldz4;

    .line 271
    .line 272
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    sget-object p6, Lhz4;->t:Ldz4;

    .line 276
    .line 277
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    sget-object p6, Lhz4;->v:Ldz4;

    .line 281
    .line 282
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    sget-object p6, Lhz4;->w:Ldz4;

    .line 286
    .line 287
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    sget-object p6, Lhz4;->y:Ldz4;

    .line 291
    .line 292
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    sget-object p6, Lhz4;->u:Ldz4;

    .line 296
    .line 297
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 298
    .line 299
    .line 300
    sget-object p6, Lhz4;->b:Ldz4;

    .line 301
    .line 302
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    sget-object p6, Ldk4;->e:Lri;

    .line 306
    .line 307
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 308
    .line 309
    .line 310
    sget-object p6, Lhz4;->x:Lm73;

    .line 311
    .line 312
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    sget-boolean p6, Lgk4;->a:Z

    .line 316
    .line 317
    if-eqz p6, :cond_3

    .line 318
    .line 319
    sget-object p6, Lgk4;->e:Lri;

    .line 320
    .line 321
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    sget-object p6, Lgk4;->d:Lri;

    .line 325
    .line 326
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    sget-object p6, Lgk4;->f:Lri;

    .line 330
    .line 331
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    :cond_3
    sget-object p6, Lsi;->d:Lri;

    .line 335
    .line 336
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    sget-object p6, Lhz4;->a:Ldz4;

    .line 340
    .line 341
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    new-instance p6, Lp40;

    .line 345
    .line 346
    invoke-direct {p6, p2, p8}, Lp40;-><init>(Lmf4;I)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    new-instance p6, Lp40;

    .line 353
    .line 354
    invoke-direct {p6, p2, p5}, Lp40;-><init>(Lmf4;I)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    new-instance p5, Lp40;

    .line 361
    .line 362
    invoke-direct {p5, p2, p4}, Lp40;-><init>(Lmf4;I)V

    .line 363
    .line 364
    .line 365
    iput-object p5, p0, Lnk1;->d:Lp40;

    .line 366
    .line 367
    invoke-virtual {v0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    sget-object p4, Lhz4;->B:Lri;

    .line 371
    .line 372
    invoke-virtual {v0, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-object p4, p1

    .line 376
    new-instance p1, Ltx3;

    .line 377
    .line 378
    move-object p6, p11

    .line 379
    invoke-direct/range {p1 .. p6}, Ltx3;-><init>(Lmf4;ILu21;Lp40;Ljava/util/List;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    iput-object p1, p0, Lnk1;->e:Ljava/util/List;

    .line 390
    .line 391
    return-void
.end method

.method public static a(D)V
    .locals 2

    .line 1
    invoke-static {p0, p1}, Ljava/lang/Double;->isNaN(D)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, Ljava/lang/Double;->isInfinite(D)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    new-instance v1, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p0, " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method."

    .line 25
    .line 26
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v0
.end method


# virtual methods
.method public final b(Lh32;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    new-instance v0, Ln32;

    .line 6
    .line 7
    sget-object v1, Ln32;->G:Lm32;

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ll32;-><init>(Ljava/io/Reader;)V

    .line 10
    .line 11
    .line 12
    const/16 v1, 0x20

    .line 13
    .line 14
    new-array v2, v1, [Ljava/lang/Object;

    .line 15
    .line 16
    iput-object v2, v0, Ln32;->C:[Ljava/lang/Object;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    iput v2, v0, Ln32;->D:I

    .line 20
    .line 21
    new-array v2, v1, [Ljava/lang/String;

    .line 22
    .line 23
    iput-object v2, v0, Ln32;->E:[Ljava/lang/String;

    .line 24
    .line 25
    new-array v1, v1, [I

    .line 26
    .line 27
    iput-object v1, v0, Ln32;->F:[I

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Ln32;->s0(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0, p2}, Lnk1;->c(Ll32;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method

.method public final c(Ll32;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-string v0, "AssertionError (GSON 2.10.1): "

    .line 2
    .line 3
    iget-boolean v1, p1, Ll32;->o:Z

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iput-boolean v2, p1, Ll32;->o:Z

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p1}, Ll32;->e0()I

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {p0, p2}, Lnk1;->g(Lcom/google/gson/reflect/TypeToken;)Lbz4;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0, p1}, Lbz4;->a(Ll32;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    iput-boolean v1, p1, Ll32;->o:Z

    .line 21
    .line 22
    return-object p0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_4

    .line 25
    :catch_0
    move-exception p0

    .line 26
    goto :goto_0

    .line 27
    :catch_1
    move-exception p0

    .line 28
    goto :goto_1

    .line 29
    :catch_2
    move-exception p0

    .line 30
    goto :goto_2

    .line 31
    :catch_3
    move-exception p0

    .line 32
    goto :goto_3

    .line 33
    :goto_0
    :try_start_1
    new-instance p2, Ljava/lang/AssertionError;

    .line 34
    .line 35
    new-instance v2, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-direct {p2, v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    throw p2

    .line 55
    :goto_1
    new-instance p2, Lcom/google/gson/JsonSyntaxException;

    .line 56
    .line 57
    invoke-direct {p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    throw p2

    .line 61
    :goto_2
    new-instance p2, Lcom/google/gson/JsonSyntaxException;

    .line 62
    .line 63
    invoke-direct {p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    :goto_3
    if-eqz v2, :cond_0

    .line 68
    .line 69
    iput-boolean v1, p1, Ll32;->o:Z

    .line 70
    .line 71
    const/4 p0, 0x0

    .line 72
    return-object p0

    .line 73
    :cond_0
    :try_start_2
    new-instance p2, Lcom/google/gson/JsonSyntaxException;

    .line 74
    .line 75
    invoke-direct {p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 79
    :goto_4
    iput-boolean v1, p1, Ll32;->o:Z

    .line 80
    .line 81
    throw p0
.end method

.method public final d(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/google/gson/reflect/TypeToken;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, p2, v0}, Lnk1;->e(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p1}, Lsu3;->I(Ljava/lang/Class;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1, p0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final e(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    new-instance v0, Ljava/io/StringReader;

    .line 6
    .line 7
    invoke-direct {v0, p1}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Ll32;

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ll32;-><init>(Ljava/io/Reader;)V

    .line 13
    .line 14
    .line 15
    iget-boolean v0, p0, Lnk1;->g:Z

    .line 16
    .line 17
    iput-boolean v0, p1, Ll32;->o:Z

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2}, Lnk1;->c(Ll32;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    :try_start_0
    invoke-virtual {p1}, Ll32;->e0()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    const/16 p2, 0xa

    .line 30
    .line 31
    if-ne p1, p2, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    new-instance p0, Lcom/google/gson/JsonSyntaxException;

    .line 35
    .line 36
    const-string p1, "JSON document was not fully consumed."

    .line 37
    .line 38
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw p0
    :try_end_0
    .catch Lcom/google/gson/stream/MalformedJsonException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    :catch_0
    move-exception p0

    .line 43
    new-instance p1, Lcom/google/gson/JsonIOException;

    .line 44
    .line 45
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :catch_1
    move-exception p0

    .line 50
    new-instance p1, Lcom/google/gson/JsonSyntaxException;

    .line 51
    .line 52
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    :goto_0
    return-object p0
.end method

.method public final f(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p2}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p0, p1, p2}, Lnk1;->e(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final g(Lcom/google/gson/reflect/TypeToken;)Lbz4;
    .locals 9

    .line 1
    const-string v0, "type must not be null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lnk1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Lbz4;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    return-object v1

    .line 17
    :cond_0
    iget-object v1, p0, Lnk1;->a:Ljava/lang/ThreadLocal;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/util/Map;

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    new-instance v2, Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    check-cast v3, Lbz4;

    .line 42
    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    return-object v3

    .line 46
    :cond_2
    const/4 v3, 0x0

    .line 47
    :goto_0
    :try_start_0
    new-instance v4, Lmk1;

    .line 48
    .line 49
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    iput-object v5, v4, Lmk1;->a:Lbz4;

    .line 54
    .line 55
    invoke-interface {v2, p1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    iget-object v6, p0, Lnk1;->e:Ljava/util/List;

    .line 59
    .line 60
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v6

    .line 64
    move-object v7, v5

    .line 65
    :cond_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v8

    .line 69
    if-eqz v8, :cond_5

    .line 70
    .line 71
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    check-cast v7, Lcz4;

    .line 76
    .line 77
    invoke-interface {v7, p0, p1}, Lcz4;->a(Lnk1;Lcom/google/gson/reflect/TypeToken;)Lbz4;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    if-eqz v7, :cond_3

    .line 82
    .line 83
    iget-object p0, v4, Lmk1;->a:Lbz4;

    .line 84
    .line 85
    if-nez p0, :cond_4

    .line 86
    .line 87
    iput-object v7, v4, Lmk1;->a:Lbz4;

    .line 88
    .line 89
    invoke-interface {v2, p1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception p0

    .line 94
    goto :goto_2

    .line 95
    :cond_4
    new-instance p0, Ljava/lang/AssertionError;

    .line 96
    .line 97
    const-string p1, "Delegate is already set"

    .line 98
    .line 99
    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    :cond_5
    :goto_1
    if-eqz v3, :cond_6

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 106
    .line 107
    .line 108
    :cond_6
    if-eqz v7, :cond_8

    .line 109
    .line 110
    if-eqz v3, :cond_7

    .line 111
    .line 112
    invoke-virtual {v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 113
    .line 114
    .line 115
    :cond_7
    return-object v7

    .line 116
    :cond_8
    const-string p0, "GSON (2.10.1) cannot handle "

    .line 117
    .line 118
    invoke-static {p1, p0}, Lmj0;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    return-object v5

    .line 122
    :goto_2
    if-eqz v3, :cond_9

    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 125
    .line 126
    .line 127
    :cond_9
    throw p0
.end method

.method public final h(Lcz4;Lcom/google/gson/reflect/TypeToken;)Lbz4;
    .locals 3

    .line 1
    iget-object v0, p0, Lnk1;->e:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lnk1;->d:Lp40;

    .line 10
    .line 11
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_3

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lcz4;

    .line 27
    .line 28
    if-nez v1, :cond_2

    .line 29
    .line 30
    if-ne v2, p1, :cond_1

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    invoke-interface {v2, p0, p2}, Lcz4;->a(Lnk1;Lcom/google/gson/reflect/TypeToken;)Lbz4;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    return-object v2

    .line 41
    :cond_3
    const-string p0, "GSON cannot serialize "

    .line 42
    .line 43
    invoke-static {p2, p0}, Lmj0;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    return-object p0
.end method

.method public final i(Ljava/io/Writer;)Lq32;
    .locals 1

    .line 1
    new-instance v0, Lq32;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lq32;-><init>(Ljava/io/Writer;)V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, Lnk1;->f:Z

    .line 7
    .line 8
    iput-boolean p1, v0, Lq32;->s:Z

    .line 9
    .line 10
    iget-boolean p0, p0, Lnk1;->g:Z

    .line 11
    .line 12
    iput-boolean p0, v0, Lq32;->r:Z

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    iput-boolean p0, v0, Lq32;->u:Z

    .line 16
    .line 17
    return-object v0
.end method

.method public final j(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Ljava/io/StringWriter;

    .line 4
    .line 5
    invoke-direct {p1}, Ljava/io/StringWriter;-><init>()V

    .line 6
    .line 7
    .line 8
    :try_start_0
    invoke-virtual {p0, p1}, Lnk1;->i(Ljava/io/Writer;)Lq32;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, v0}, Lnk1;->k(Lq32;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :catch_0
    move-exception p0

    .line 21
    new-instance p1, Lcom/google/gson/JsonIOException;

    .line 22
    .line 23
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    throw p1

    .line 27
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    new-instance v1, Ljava/io/StringWriter;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/io/StringWriter;-><init>()V

    .line 34
    .line 35
    .line 36
    :try_start_1
    invoke-virtual {p0, v1}, Lnk1;->i(Ljava/io/Writer;)Lq32;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {p0, p1, v0, v2}, Lnk1;->l(Ljava/lang/Object;Ljava/lang/Class;Lq32;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :catch_1
    move-exception p0

    .line 49
    new-instance p1, Lcom/google/gson/JsonIOException;

    .line 50
    .line 51
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    throw p1
.end method

.method public final k(Lq32;)V
    .locals 6

    .line 1
    sget-object v0, Li32;->n:Li32;

    .line 2
    .line 3
    const-string v1, "AssertionError (GSON 2.10.1): "

    .line 4
    .line 5
    iget-boolean v2, p1, Lq32;->r:Z

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iput-boolean v3, p1, Lq32;->r:Z

    .line 9
    .line 10
    iget-boolean v3, p1, Lq32;->s:Z

    .line 11
    .line 12
    iget-boolean p0, p0, Lnk1;->f:Z

    .line 13
    .line 14
    iput-boolean p0, p1, Lq32;->s:Z

    .line 15
    .line 16
    iget-boolean p0, p1, Lq32;->u:Z

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    iput-boolean v4, p1, Lq32;->u:Z

    .line 20
    .line 21
    :try_start_0
    sget-object v4, Lhz4;->a:Ldz4;

    .line 22
    .line 23
    invoke-static {p1, v0}, Llk1;->d(Lq32;Lh32;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    iput-boolean v2, p1, Lq32;->r:Z

    .line 27
    .line 28
    iput-boolean v3, p1, Lq32;->s:Z

    .line 29
    .line 30
    iput-boolean p0, p1, Lq32;->u:Z

    .line 31
    .line 32
    return-void

    .line 33
    :catch_0
    move-exception v0

    .line 34
    goto :goto_0

    .line 35
    :catch_1
    move-exception v0

    .line 36
    goto :goto_1

    .line 37
    :goto_0
    :try_start_1
    new-instance v4, Ljava/lang/AssertionError;

    .line 38
    .line 39
    new-instance v5, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-direct {v4, v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    throw v4

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    goto :goto_2

    .line 61
    :goto_1
    new-instance v1, Lcom/google/gson/JsonIOException;

    .line 62
    .line 63
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
    :goto_2
    iput-boolean v2, p1, Lq32;->r:Z

    .line 68
    .line 69
    iput-boolean v3, p1, Lq32;->s:Z

    .line 70
    .line 71
    iput-boolean p0, p1, Lq32;->u:Z

    .line 72
    .line 73
    throw v0
.end method

.method public final l(Ljava/lang/Object;Ljava/lang/Class;Lq32;)V
    .locals 4

    .line 1
    const-string v0, "AssertionError (GSON 2.10.1): "

    .line 2
    .line 3
    invoke-static {p2}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p0, p2}, Lnk1;->g(Lcom/google/gson/reflect/TypeToken;)Lbz4;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    iget-boolean v1, p3, Lq32;->r:Z

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    iput-boolean v2, p3, Lq32;->r:Z

    .line 15
    .line 16
    iget-boolean v2, p3, Lq32;->s:Z

    .line 17
    .line 18
    iget-boolean p0, p0, Lnk1;->f:Z

    .line 19
    .line 20
    iput-boolean p0, p3, Lq32;->s:Z

    .line 21
    .line 22
    iget-boolean p0, p3, Lq32;->u:Z

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    iput-boolean v3, p3, Lq32;->u:Z

    .line 26
    .line 27
    :try_start_0
    invoke-virtual {p2, p3, p1}, Lbz4;->b(Lq32;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    iput-boolean v1, p3, Lq32;->r:Z

    .line 31
    .line 32
    iput-boolean v2, p3, Lq32;->s:Z

    .line 33
    .line 34
    iput-boolean p0, p3, Lq32;->u:Z

    .line 35
    .line 36
    return-void

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    goto :goto_0

    .line 39
    :catch_0
    move-exception p1

    .line 40
    :try_start_1
    new-instance p2, Ljava/lang/AssertionError;

    .line 41
    .line 42
    new-instance v3, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-direct {p2, v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    throw p2

    .line 62
    :catch_1
    move-exception p1

    .line 63
    new-instance p2, Lcom/google/gson/JsonIOException;

    .line 64
    .line 65
    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    :goto_0
    iput-boolean v1, p3, Lq32;->r:Z

    .line 70
    .line 71
    iput-boolean v2, p3, Lq32;->s:Z

    .line 72
    .line 73
    iput-boolean p0, p3, Lq32;->u:Z

    .line 74
    .line 75
    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "{serializeNulls:false,factories:"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lnk1;->e:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ",instanceCreators:"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lnk1;->c:Lmf4;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, "}"

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method
