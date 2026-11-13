.class public final Ldefpackage/tx3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/cz4;


# instance fields
.field public final n:Ldefpackage/mf4;

.field public final o:I

.field public final p:Ldefpackage/u21;

.field public final q:Ljava/util/List;


# direct methods
.method public constructor <init>(Ldefpackage/mf4;ILdefpackage/u21;Ldefpackage/p40;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/tx3;->n:Ldefpackage/mf4;

    .line 5
    .line 6
    iput p2, p0, Ldefpackage/tx3;->o:I

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/tx3;->p:Ldefpackage/u21;

    .line 9
    .line 10
    iput-object p5, p0, Ldefpackage/tx3;->q:Ljava/util/List;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/nk1;Lcom/google/gson/reflect/TypeToken;)Ldefpackage/bz4;
    .locals 4

    .line 1
    invoke-virtual {p2}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return-object p0

    .line 15
    :cond_0
    iget-object v1, p0, Ldefpackage/tx3;->q:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v1}, Ldefpackage/fu;->x(Ljava/util/List;)V

    .line 18
    .line 19
    .line 20
    sget-object v1, Ldefpackage/ox3;->a:Ldefpackage/hw;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ldefpackage/hw;->u(Ljava/lang/Class;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    new-instance v1, Ldefpackage/sx3;

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    invoke-virtual {p0, p1, p2, v0, v2}, Ldefpackage/tx3;->b(Ldefpackage/nk1;Lcom/google/gson/reflect/TypeToken;Ljava/lang/Class;Z)Ljava/util/LinkedHashMap;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-direct {v1, v0, p0}, Ldefpackage/sx3;-><init>(Ljava/lang/Class;Ljava/util/LinkedHashMap;)V

    .line 36
    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_1
    iget-object v1, p0, Ldefpackage/tx3;->n:Ldefpackage/mf4;

    .line 40
    .line 41
    invoke-virtual {v1, p2}, Ldefpackage/mf4;->e(Lcom/google/gson/reflect/TypeToken;)Ldefpackage/o73;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    new-instance v2, Ldefpackage/rx3;

    .line 46
    .line 47
    const/4 v3, 0x0

    .line 48
    invoke-virtual {p0, p1, p2, v0, v3}, Ldefpackage/tx3;->b(Ldefpackage/nk1;Lcom/google/gson/reflect/TypeToken;Ljava/lang/Class;Z)Ljava/util/LinkedHashMap;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-direct {v2, v1, p0}, Ldefpackage/rx3;-><init>(Ldefpackage/o73;Ljava/util/LinkedHashMap;)V

    .line 53
    .line 54
    .line 55
    return-object v2
.end method

.method public final b(Ldefpackage/nk1;Lcom/google/gson/reflect/TypeToken;Ljava/lang/Class;Z)Ljava/util/LinkedHashMap;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v9, p1

    .line 4
    .line 5
    new-instance v13, Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-direct {v13}, Ljava/util/LinkedHashMap;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Class;->isInterface()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    goto/16 :goto_d

    .line 17
    .line 18
    :cond_0
    move-object/from16 v14, p2

    .line 19
    .line 20
    move-object/from16 v15, p3

    .line 21
    .line 22
    :goto_0
    const-class v1, Ljava/lang/Object;

    .line 23
    .line 24
    if-eq v15, v1, :cond_14

    .line 25
    .line 26
    invoke-virtual {v15}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    move-object/from16 v2, p3

    .line 31
    .line 32
    if-eq v15, v2, :cond_1

    .line 33
    .line 34
    array-length v3, v1

    .line 35
    if-lez v3, :cond_1

    .line 36
    .line 37
    iget-object v3, v0, Ldefpackage/tx3;->q:Ljava/util/List;

    .line 38
    .line 39
    invoke-static {v3}, Ldefpackage/fu;->x(Ljava/util/List;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    array-length v3, v1

    .line 43
    const/4 v4, 0x0

    .line 44
    move v5, v4

    .line 45
    :goto_1
    if-ge v5, v3, :cond_13

    .line 46
    .line 47
    move v6, v3

    .line 48
    aget-object v3, v1, v5

    .line 49
    .line 50
    const/4 v7, 0x1

    .line 51
    invoke-virtual {v0, v3, v7}, Ldefpackage/tx3;->c(Ljava/lang/reflect/Field;Z)Z

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    invoke-virtual {v0, v3, v4}, Ldefpackage/tx3;->c(Ljava/lang/reflect/Field;Z)Z

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    if-nez v8, :cond_2

    .line 60
    .line 61
    if-nez v10, :cond_2

    .line 62
    .line 63
    move-object/from16 v18, v1

    .line 64
    .line 65
    move/from16 v25, v4

    .line 66
    .line 67
    move/from16 v21, v5

    .line 68
    .line 69
    move/from16 v23, v6

    .line 70
    .line 71
    goto/16 :goto_c

    .line 72
    .line 73
    :cond_2
    const-class v11, Ldefpackage/ka4;

    .line 74
    .line 75
    const/16 v16, 0x0

    .line 76
    .line 77
    if-eqz p4, :cond_3

    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    invoke-static {v12}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 84
    .line 85
    .line 86
    move-result v12

    .line 87
    if-eqz v12, :cond_4

    .line 88
    .line 89
    move v10, v4

    .line 90
    :cond_3
    move-object/from16 v12, v16

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    sget-object v12, Ldefpackage/ox3;->a:Ldefpackage/hw;

    .line 94
    .line 95
    invoke-virtual {v12, v15, v3}, Ldefpackage/hw;->h(Ljava/lang/Class;Ljava/lang/reflect/Field;)Ljava/lang/reflect/Method;

    .line 96
    .line 97
    .line 98
    move-result-object v12

    .line 99
    invoke-static {v12}, Ldefpackage/ox3;->e(Ljava/lang/reflect/AccessibleObject;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v11}, Ljava/lang/reflect/Method;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 103
    .line 104
    .line 105
    move-result-object v17

    .line 106
    if-eqz v17, :cond_6

    .line 107
    .line 108
    invoke-virtual {v3, v11}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 109
    .line 110
    .line 111
    move-result-object v17

    .line 112
    if-eqz v17, :cond_5

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_5
    invoke-static {v12, v4}, Ldefpackage/ox3;->d(Ljava/lang/reflect/AccessibleObject;Z)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    new-instance v1, Lcom/google/gson/JsonIOException;

    .line 120
    .line 121
    const-string v2, "@SerializedName on "

    .line 122
    .line 123
    const-string v3, " is not supported"

    .line 124
    .line 125
    invoke-static {v2, v0, v3}, Ldefpackage/xa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    throw v1

    .line 133
    :cond_6
    :goto_2
    if-nez v12, :cond_7

    .line 134
    .line 135
    invoke-static {v3}, Ldefpackage/ox3;->e(Ljava/lang/reflect/AccessibleObject;)V

    .line 136
    .line 137
    .line 138
    :cond_7
    invoke-virtual {v14}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    move/from16 v17, v7

    .line 143
    .line 144
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getGenericType()Ljava/lang/reflect/Type;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    move-object/from16 v18, v1

    .line 149
    .line 150
    new-instance v1, Ljava/util/HashMap;

    .line 151
    .line 152
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 153
    .line 154
    .line 155
    invoke-static {v4, v15, v7, v1}, Ldefpackage/gb;->Y(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 156
    .line 157
    .line 158
    move-result-object v19

    .line 159
    invoke-virtual {v3, v11}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    check-cast v1, Ldefpackage/ka4;

    .line 164
    .line 165
    if-nez v1, :cond_8

    .line 166
    .line 167
    iget v1, v0, Ldefpackage/tx3;->o:I

    .line 168
    .line 169
    const/16 v4, 0x5f

    .line 170
    .line 171
    packed-switch v1, :pswitch_data_0

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    const/16 v4, 0x2e

    .line 179
    .line 180
    invoke-static {v1, v4}, Ldefpackage/b11;->a(Ljava/lang/String;C)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 185
    .line 186
    invoke-virtual {v1, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    goto :goto_3

    .line 191
    :pswitch_0
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    const/16 v4, 0x2d

    .line 196
    .line 197
    invoke-static {v1, v4}, Ldefpackage/b11;->a(Ljava/lang/String;C)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v1

    .line 201
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 202
    .line 203
    invoke-virtual {v1, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    goto :goto_3

    .line 208
    :pswitch_1
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    invoke-static {v1, v4}, Ldefpackage/b11;->a(Ljava/lang/String;C)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 217
    .line 218
    invoke-virtual {v1, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    goto :goto_3

    .line 223
    :pswitch_2
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    invoke-static {v1, v4}, Ldefpackage/b11;->a(Ljava/lang/String;C)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 232
    .line 233
    invoke-virtual {v1, v4}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    goto :goto_3

    .line 238
    :pswitch_3
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    const/16 v4, 0x20

    .line 243
    .line 244
    invoke-static {v1, v4}, Ldefpackage/b11;->a(Ljava/lang/String;C)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-static {v1}, Ldefpackage/b11;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    goto :goto_3

    .line 253
    :pswitch_4
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-static {v1}, Ldefpackage/b11;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    goto :goto_3

    .line 262
    :pswitch_5
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    :goto_3
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    goto :goto_4

    .line 271
    :cond_8
    invoke-interface {v1}, Ldefpackage/ka4;->value()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v4

    .line 275
    invoke-interface {v1}, Ldefpackage/ka4;->alternate()[Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    array-length v7, v1

    .line 280
    if-nez v7, :cond_9

    .line 281
    .line 282
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 283
    .line 284
    .line 285
    move-result-object v1

    .line 286
    goto :goto_4

    .line 287
    :cond_9
    new-instance v7, Ljava/util/ArrayList;

    .line 288
    .line 289
    array-length v11, v1

    .line 290
    add-int/lit8 v11, v11, 0x1

    .line 291
    .line 292
    invoke-direct {v7, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    invoke-static {v7, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-object v1, v7

    .line 302
    :goto_4
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 303
    .line 304
    .line 305
    move-result v4

    .line 306
    move-object/from16 v11, v16

    .line 307
    .line 308
    const/4 v7, 0x0

    .line 309
    :goto_5
    if-ge v7, v4, :cond_11

    .line 310
    .line 311
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v20

    .line 315
    check-cast v20, Ljava/lang/String;

    .line 316
    .line 317
    if-eqz v7, :cond_a

    .line 318
    .line 319
    const/4 v8, 0x0

    .line 320
    :cond_a
    move/from16 v21, v5

    .line 321
    .line 322
    move v5, v10

    .line 323
    invoke-static/range {v19 .. v19}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    .line 324
    .line 325
    .line 326
    move-result-object v10

    .line 327
    invoke-virtual {v10}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    move-result-object v22

    .line 331
    if-eqz v22, :cond_b

    .line 332
    .line 333
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Class;->isPrimitive()Z

    .line 334
    .line 335
    .line 336
    move-result v22

    .line 337
    if-eqz v22, :cond_b

    .line 338
    .line 339
    move-object/from16 v22, v11

    .line 340
    .line 341
    move/from16 v11, v17

    .line 342
    .line 343
    goto :goto_6

    .line 344
    :cond_b
    move-object/from16 v22, v11

    .line 345
    .line 346
    const/4 v11, 0x0

    .line 347
    :goto_6
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 348
    .line 349
    .line 350
    move-result v23

    .line 351
    invoke-static/range {v23 .. v23}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 352
    .line 353
    .line 354
    move-result v24

    .line 355
    if-eqz v24, :cond_c

    .line 356
    .line 357
    invoke-static/range {v23 .. v23}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 358
    .line 359
    .line 360
    move-result v23

    .line 361
    if-eqz v23, :cond_c

    .line 362
    .line 363
    move/from16 v23, v6

    .line 364
    .line 365
    move-object v6, v12

    .line 366
    move/from16 v12, v17

    .line 367
    .line 368
    :goto_7
    move-object/from16 v24, v1

    .line 369
    .line 370
    goto :goto_8

    .line 371
    :cond_c
    move/from16 v23, v6

    .line 372
    .line 373
    move-object v6, v12

    .line 374
    const/4 v12, 0x0

    .line 375
    goto :goto_7

    .line 376
    :goto_8
    const-class v1, Ldefpackage/e32;

    .line 377
    .line 378
    invoke-virtual {v3, v1}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 379
    .line 380
    .line 381
    move-result-object v1

    .line 382
    check-cast v1, Ldefpackage/e32;

    .line 383
    .line 384
    if-eqz v1, :cond_d

    .line 385
    .line 386
    iget-object v2, v0, Ldefpackage/tx3;->n:Ldefpackage/mf4;

    .line 387
    .line 388
    invoke-static {v2, v9, v10, v1}, Ldefpackage/p40;->b(Ldefpackage/mf4;Ldefpackage/nk1;Lcom/google/gson/reflect/TypeToken;Ldefpackage/e32;)Ldefpackage/bz4;

    .line 389
    .line 390
    .line 391
    move-result-object v1

    .line 392
    goto :goto_9

    .line 393
    :cond_d
    move-object/from16 v1, v16

    .line 394
    .line 395
    :goto_9
    move v2, v7

    .line 396
    if-eqz v1, :cond_e

    .line 397
    .line 398
    move/from16 v7, v17

    .line 399
    .line 400
    goto :goto_a

    .line 401
    :cond_e
    const/4 v7, 0x0

    .line 402
    :goto_a
    if-nez v1, :cond_f

    .line 403
    .line 404
    invoke-virtual {v9, v10}, Ldefpackage/nk1;->g(Lcom/google/gson/reflect/TypeToken;)Ldefpackage/bz4;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    :cond_f
    new-instance v25, Ldefpackage/px3;

    .line 409
    .line 410
    move-object/from16 v0, v20

    .line 411
    .line 412
    move/from16 v20, v2

    .line 413
    .line 414
    move-object v2, v0

    .line 415
    move-object/from16 v0, v22

    .line 416
    .line 417
    move/from16 v22, v17

    .line 418
    .line 419
    move/from16 v17, v4

    .line 420
    .line 421
    move v4, v8

    .line 422
    move-object v8, v1

    .line 423
    move-object/from16 v1, v25

    .line 424
    .line 425
    const/16 v25, 0x0

    .line 426
    .line 427
    invoke-direct/range {v1 .. v12}, Ldefpackage/px3;-><init>(Ljava/lang/String;Ljava/lang/reflect/Field;ZZLjava/lang/reflect/Method;ZLdefpackage/bz4;Ldefpackage/nk1;Lcom/google/gson/reflect/TypeToken;ZZ)V

    .line 428
    .line 429
    .line 430
    invoke-interface {v13, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    move-object v11, v1

    .line 435
    check-cast v11, Ldefpackage/px3;

    .line 436
    .line 437
    if-nez v0, :cond_10

    .line 438
    .line 439
    goto :goto_b

    .line 440
    :cond_10
    move-object v11, v0

    .line 441
    :goto_b
    add-int/lit8 v7, v20, 0x1

    .line 442
    .line 443
    move-object/from16 v0, p0

    .line 444
    .line 445
    move-object/from16 v9, p1

    .line 446
    .line 447
    move-object/from16 v2, p3

    .line 448
    .line 449
    move v8, v4

    .line 450
    move v10, v5

    .line 451
    move-object v12, v6

    .line 452
    move/from16 v4, v17

    .line 453
    .line 454
    move/from16 v5, v21

    .line 455
    .line 456
    move/from16 v17, v22

    .line 457
    .line 458
    move/from16 v6, v23

    .line 459
    .line 460
    move-object/from16 v1, v24

    .line 461
    .line 462
    goto/16 :goto_5

    .line 463
    .line 464
    :cond_11
    move/from16 v21, v5

    .line 465
    .line 466
    move/from16 v23, v6

    .line 467
    .line 468
    move-object v0, v11

    .line 469
    const/16 v25, 0x0

    .line 470
    .line 471
    if-nez v0, :cond_12

    .line 472
    .line 473
    :goto_c
    add-int/lit8 v5, v21, 0x1

    .line 474
    .line 475
    move-object/from16 v0, p0

    .line 476
    .line 477
    move-object/from16 v9, p1

    .line 478
    .line 479
    move-object/from16 v2, p3

    .line 480
    .line 481
    move-object/from16 v1, v18

    .line 482
    .line 483
    move/from16 v3, v23

    .line 484
    .line 485
    move/from16 v4, v25

    .line 486
    .line 487
    goto/16 :goto_1

    .line 488
    .line 489
    :cond_12
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 490
    .line 491
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    iget-object v4, v0, Ldefpackage/px3;->a:Ljava/lang/String;

    .line 496
    .line 497
    iget-object v0, v0, Ldefpackage/px3;->b:Ljava/lang/reflect/Field;

    .line 498
    .line 499
    invoke-static {v0}, Ldefpackage/ox3;->c(Ljava/lang/reflect/Field;)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    invoke-static {v3}, Ldefpackage/ox3;->c(Ljava/lang/reflect/Field;)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v3

    .line 507
    new-instance v5, Ljava/lang/StringBuilder;

    .line 508
    .line 509
    const-string v6, "Class "

    .line 510
    .line 511
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    const-string v2, " declares multiple JSON fields named \'"

    .line 518
    .line 519
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 520
    .line 521
    .line 522
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    const-string v2, "\'; conflict is caused by fields "

    .line 526
    .line 527
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 528
    .line 529
    .line 530
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 531
    .line 532
    .line 533
    const-string v0, " and "

    .line 534
    .line 535
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 536
    .line 537
    .line 538
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v0

    .line 545
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 546
    .line 547
    .line 548
    throw v1

    .line 549
    :cond_13
    invoke-virtual {v14}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    invoke-virtual {v15}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    new-instance v2, Ljava/util/HashMap;

    .line 558
    .line 559
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 560
    .line 561
    .line 562
    invoke-static {v0, v15, v1, v2}, Ldefpackage/gb;->Y(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/HashMap;)Ljava/lang/reflect/Type;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    invoke-static {v0}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/reflect/Type;)Lcom/google/gson/reflect/TypeToken;

    .line 567
    .line 568
    .line 569
    move-result-object v14

    .line 570
    invoke-virtual {v14}, Lcom/google/gson/reflect/TypeToken;->getRawType()Ljava/lang/Class;

    .line 571
    .line 572
    .line 573
    move-result-object v15

    .line 574
    move-object/from16 v0, p0

    .line 575
    .line 576
    move-object/from16 v9, p1

    .line 577
    .line 578
    goto/16 :goto_0

    .line 579
    .line 580
    :cond_14
    :goto_d
    return-object v13

    .line 581
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ljava/lang/reflect/Field;Z)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Ldefpackage/tx3;->p:Ldefpackage/u21;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Ldefpackage/u21;->c(Ljava/lang/Class;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_6

    .line 15
    .line 16
    invoke-virtual {p0, p2}, Ldefpackage/u21;->b(Z)V

    .line 17
    .line 18
    .line 19
    const/16 v0, 0x88

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    and-int/2addr v0, v1

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->isSynthetic()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {p1}, Ldefpackage/u21;->c(Ljava/lang/Class;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    if-eqz p2, :cond_3

    .line 48
    .line 49
    iget-object p0, p0, Ldefpackage/u21;->n:Ljava/util/List;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    iget-object p0, p0, Ldefpackage/u21;->o:Ljava/util/List;

    .line 53
    .line 54
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-nez p1, :cond_5

    .line 59
    .line 60
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_4

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_4
    invoke-static {p0}, Ldefpackage/xa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    throw p0

    .line 76
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 77
    return p0

    .line 78
    :cond_6
    :goto_2
    const/4 p0, 0x0

    .line 79
    return p0
.end method
