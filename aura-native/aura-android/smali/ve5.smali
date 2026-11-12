.class public abstract Lve5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Lux3;

.field public static final b:Lux3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lux3;

    .line 2
    .line 3
    const-string v1, "([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lux3;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lve5;->a:Lux3;

    .line 9
    .line 10
    new-instance v0, Lux3;

    .line 11
    .line 12
    const-string v1, ";\\s*(?:([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&\'*+.^_`{|}~]+)|\"([^\"]*)\"))?"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lux3;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lve5;->b:Lux3;

    .line 18
    .line 19
    return-void
.end method

.method public static final a(Ljava/lang/String;)Lhu2;
    .locals 13

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lxe5;->a:[B

    .line 5
    .line 6
    sget-object v0, Lve5;->a:Lux3;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lux3;->n:Ljava/util/regex/Pattern;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->find(I)Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x0

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    move-object v2, v3

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v2, Ljv3;

    .line 31
    .line 32
    invoke-direct {v2, v0, p0}, Ljv3;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    if-nez v2, :cond_1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    iget-object v0, v2, Ljv3;->n:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ljava/util/regex/Matcher;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    invoke-static {v4, v0}, Lgb;->g0(II)Lj02;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget v0, v0, Lh02;->n:I

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    :goto_1
    move-object v2, v3

    .line 59
    :cond_2
    const/16 v0, 0x22

    .line 60
    .line 61
    if-eqz v2, :cond_f

    .line 62
    .line 63
    iget-object v4, v2, Ljv3;->p:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v4, Ltg2;

    .line 66
    .line 67
    if-nez v4, :cond_3

    .line 68
    .line 69
    new-instance v4, Ltg2;

    .line 70
    .line 71
    invoke-direct {v4, v2}, Ltg2;-><init>(Ljv3;)V

    .line 72
    .line 73
    .line 74
    iput-object v4, v2, Ljv3;->p:Ljava/lang/Object;

    .line 75
    .line 76
    :cond_3
    iget-object v4, v2, Ljv3;->p:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v4, Ltg2;

    .line 79
    .line 80
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    const/4 v5, 0x1

    .line 84
    invoke-virtual {v4, v5}, Ltg2;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Ljava/lang/String;

    .line 89
    .line 90
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 91
    .line 92
    invoke-virtual {v4, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object v7, v2, Ljv3;->p:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v7, Ltg2;

    .line 102
    .line 103
    if-nez v7, :cond_4

    .line 104
    .line 105
    new-instance v7, Ltg2;

    .line 106
    .line 107
    invoke-direct {v7, v2}, Ltg2;-><init>(Ljv3;)V

    .line 108
    .line 109
    .line 110
    iput-object v7, v2, Ljv3;->p:Ljava/lang/Object;

    .line 111
    .line 112
    :cond_4
    iget-object v7, v2, Ljv3;->p:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v7, Ltg2;

    .line 115
    .line 116
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    const/4 v8, 0x2

    .line 120
    invoke-virtual {v7, v8}, Ltg2;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    check-cast v7, Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {v7, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    new-instance v7, Ljava/util/ArrayList;

    .line 134
    .line 135
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 136
    .line 137
    .line 138
    iget-object v2, v2, Ljv3;->n:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v2, Ljava/util/regex/Matcher;

    .line 141
    .line 142
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->start()I

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->end()I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    invoke-static {v9, v2}, Lgb;->g0(II)Lj02;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    iget v2, v2, Lh02;->o:I

    .line 155
    .line 156
    :goto_2
    add-int/2addr v2, v5

    .line 157
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 158
    .line 159
    .line 160
    move-result v9

    .line 161
    if-ge v2, v9, :cond_e

    .line 162
    .line 163
    sget-object v9, Lve5;->b:Lux3;

    .line 164
    .line 165
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    iget-object v9, v9, Lux3;->n:Ljava/util/regex/Pattern;

    .line 169
    .line 170
    invoke-virtual {v9, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v9, v2}, Ljava/util/regex/Matcher;->find(I)Z

    .line 178
    .line 179
    .line 180
    move-result v10

    .line 181
    if-nez v10, :cond_5

    .line 182
    .line 183
    move-object v10, v3

    .line 184
    goto :goto_3

    .line 185
    :cond_5
    new-instance v10, Ljv3;

    .line 186
    .line 187
    invoke-direct {v10, v9, p0}, Ljv3;-><init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V

    .line 188
    .line 189
    .line 190
    :goto_3
    if-nez v10, :cond_6

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_6
    iget-object v9, v10, Ljv3;->n:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v9, Ljava/util/regex/Matcher;

    .line 196
    .line 197
    invoke-virtual {v9}, Ljava/util/regex/Matcher;->start()I

    .line 198
    .line 199
    .line 200
    move-result v11

    .line 201
    invoke-virtual {v9}, Ljava/util/regex/Matcher;->end()I

    .line 202
    .line 203
    .line 204
    move-result v9

    .line 205
    invoke-static {v11, v9}, Lgb;->g0(II)Lj02;

    .line 206
    .line 207
    .line 208
    move-result-object v9

    .line 209
    iget v9, v9, Lh02;->n:I

    .line 210
    .line 211
    if-eq v9, v2, :cond_7

    .line 212
    .line 213
    :goto_4
    move-object v10, v3

    .line 214
    :cond_7
    if-eqz v10, :cond_d

    .line 215
    .line 216
    iget-object v2, v10, Ljv3;->n:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v2, Ljava/util/regex/Matcher;

    .line 219
    .line 220
    iget-object v9, v10, Ljv3;->o:Ljava/lang/Object;

    .line 221
    .line 222
    check-cast v9, Lug2;

    .line 223
    .line 224
    invoke-virtual {v9, v5}, Lug2;->b(I)Lsg2;

    .line 225
    .line 226
    .line 227
    move-result-object v10

    .line 228
    if-eqz v10, :cond_8

    .line 229
    .line 230
    iget-object v10, v10, Lsg2;->a:Ljava/lang/String;

    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_8
    move-object v10, v3

    .line 234
    :goto_5
    if-nez v10, :cond_9

    .line 235
    .line 236
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->start()I

    .line 237
    .line 238
    .line 239
    move-result v9

    .line 240
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->end()I

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    invoke-static {v9, v2}, Lgb;->g0(II)Lj02;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    iget v2, v2, Lh02;->o:I

    .line 249
    .line 250
    goto :goto_2

    .line 251
    :cond_9
    invoke-virtual {v9, v8}, Lug2;->b(I)Lsg2;

    .line 252
    .line 253
    .line 254
    move-result-object v11

    .line 255
    if-eqz v11, :cond_a

    .line 256
    .line 257
    iget-object v11, v11, Lsg2;->a:Ljava/lang/String;

    .line 258
    .line 259
    goto :goto_6

    .line 260
    :cond_a
    move-object v11, v3

    .line 261
    :goto_6
    if-nez v11, :cond_b

    .line 262
    .line 263
    const/4 v11, 0x3

    .line 264
    invoke-virtual {v9, v11}, Lug2;->b(I)Lsg2;

    .line 265
    .line 266
    .line 267
    move-result-object v9

    .line 268
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    iget-object v11, v9, Lsg2;->a:Ljava/lang/String;

    .line 272
    .line 273
    goto :goto_7

    .line 274
    :cond_b
    const-string v9, "\'"

    .line 275
    .line 276
    invoke-static {v11, v9, v1}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 277
    .line 278
    .line 279
    move-result v12

    .line 280
    if-eqz v12, :cond_c

    .line 281
    .line 282
    invoke-static {v11, v9, v1}, Lxm4;->e0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 283
    .line 284
    .line 285
    move-result v9

    .line 286
    if-eqz v9, :cond_c

    .line 287
    .line 288
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 289
    .line 290
    .line 291
    move-result v9

    .line 292
    if-le v9, v8, :cond_c

    .line 293
    .line 294
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 295
    .line 296
    .line 297
    move-result v9

    .line 298
    sub-int/2addr v9, v5

    .line 299
    invoke-virtual {v11, v5, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v11

    .line 303
    :cond_c
    :goto_7
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->start()I

    .line 310
    .line 311
    .line 312
    move-result v9

    .line 313
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->end()I

    .line 314
    .line 315
    .line 316
    move-result v2

    .line 317
    invoke-static {v9, v2}, Lgb;->g0(II)Lj02;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    iget v2, v2, Lh02;->o:I

    .line 322
    .line 323
    goto/16 :goto_2

    .line 324
    .line 325
    :cond_d
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    new-instance v2, Ljava/lang/StringBuilder;

    .line 330
    .line 331
    const-string v3, "Parameter is not formatted correctly: \""

    .line 332
    .line 333
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    const-string v1, "\" for: \""

    .line 340
    .line 341
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 355
    .line 356
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object p0

    .line 360
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    throw v0

    .line 364
    :cond_e
    new-instance v0, Lhu2;

    .line 365
    .line 366
    new-array v1, v1, [Ljava/lang/String;

    .line 367
    .line 368
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    check-cast v1, [Ljava/lang/String;

    .line 373
    .line 374
    invoke-direct {v0, p0, v4, v6, v1}, Lhu2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    return-object v0

    .line 378
    :cond_f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 379
    .line 380
    new-instance v2, Ljava/lang/StringBuilder;

    .line 381
    .line 382
    const-string v3, "No subtype found for: \""

    .line 383
    .line 384
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    invoke-direct {v1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    throw v1
.end method
