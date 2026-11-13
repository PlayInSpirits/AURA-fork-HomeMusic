.class public final Ldefpackage/u90;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/r02;


# static fields
.field public static final b:Ldefpackage/u90;


# instance fields
.field public final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/u90;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldefpackage/u90;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldefpackage/u90;->b:Ldefpackage/u90;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/u90;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/ev3;)Ldefpackage/k14;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v0, v0, Ldefpackage/u90;->a:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    const-string v5, "Connection"

    .line 14
    .line 15
    const-string v6, "close"

    .line 16
    .line 17
    const-string v7, "HTTP "

    .line 18
    .line 19
    iget-object v8, v1, Ldefpackage/ev3;->d:Ldefpackage/y10;

    .line 20
    .line 21
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v0, v8, Ldefpackage/y10;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, Ldefpackage/bv3;

    .line 27
    .line 28
    iget-object v9, v8, Ldefpackage/y10;->f:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v9, Ldefpackage/r21;

    .line 31
    .line 32
    iget-object v1, v1, Ldefpackage/ev3;->e:Ldefpackage/oz3;

    .line 33
    .line 34
    iget-object v10, v1, Ldefpackage/oz3;->d:Ldefpackage/tz3;

    .line 35
    .line 36
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 37
    .line 38
    .line 39
    move-result-wide v11

    .line 40
    :try_start_0
    invoke-interface {v9, v1}, Ldefpackage/r21;->b(Ldefpackage/oz3;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_5

    .line 41
    .line 42
    .line 43
    :try_start_1
    iget-object v13, v1, Ldefpackage/oz3;->b:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v13}, Ldefpackage/gb;->T(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result v13

    .line 49
    if-eqz v13, :cond_4

    .line 50
    .line 51
    if-eqz v10, :cond_4

    .line 52
    .line 53
    const-string v13, "100-continue"

    .line 54
    .line 55
    const-string v14, "Expect"

    .line 56
    .line 57
    iget-object v15, v1, Ldefpackage/oz3;->c:Ldefpackage/tl1;

    .line 58
    .line 59
    invoke-virtual {v15, v14}, Ldefpackage/tl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v14

    .line 63
    invoke-virtual {v13, v14}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v13
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 67
    if-eqz v13, :cond_0

    .line 68
    .line 69
    :try_start_2
    invoke-interface {v9}, Ldefpackage/r21;->g()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 70
    .line 71
    .line 72
    :try_start_3
    invoke-virtual {v8, v2}, Ldefpackage/y10;->j(Z)Ldefpackage/j14;

    .line 73
    .line 74
    .line 75
    move-result-object v13

    .line 76
    goto :goto_0

    .line 77
    :catch_0
    move-exception v0

    .line 78
    move-object v13, v4

    .line 79
    goto/16 :goto_3

    .line 80
    .line 81
    :catch_1
    move-exception v0

    .line 82
    invoke-virtual {v8, v0}, Ldefpackage/y10;->l(Ljava/io/IOException;)V

    .line 83
    .line 84
    .line 85
    throw v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    .line 86
    :cond_0
    move-object v13, v4

    .line 87
    :goto_0
    if-nez v13, :cond_2

    .line 88
    .line 89
    :try_start_4
    invoke-virtual {v10}, Ldefpackage/tz3;->isDuplex()Z

    .line 90
    .line 91
    .line 92
    move-result v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 93
    if-eqz v0, :cond_1

    .line 94
    .line 95
    :try_start_5
    invoke-interface {v9}, Ldefpackage/r21;->g()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 96
    .line 97
    .line 98
    :try_start_6
    invoke-virtual {v8, v1, v2}, Ldefpackage/y10;->c(Ldefpackage/oz3;Z)Ldefpackage/o21;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    new-instance v2, Ldefpackage/wu3;

    .line 103
    .line 104
    invoke-direct {v2, v0}, Ldefpackage/wu3;-><init>(Ldefpackage/of4;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v10, v2}, Ldefpackage/tz3;->writeTo(Ldefpackage/ew;)V

    .line 108
    .line 109
    .line 110
    goto :goto_2

    .line 111
    :catch_2
    move-exception v0

    .line 112
    goto :goto_3

    .line 113
    :catch_3
    move-exception v0

    .line 114
    invoke-virtual {v8, v0}, Ldefpackage/y10;->l(Ljava/io/IOException;)V

    .line 115
    .line 116
    .line 117
    throw v0

    .line 118
    :cond_1
    invoke-virtual {v8, v1, v3}, Ldefpackage/y10;->c(Ldefpackage/oz3;Z)Ldefpackage/o21;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    new-instance v2, Ldefpackage/wu3;

    .line 123
    .line 124
    invoke-direct {v2, v0}, Ldefpackage/wu3;-><init>(Ldefpackage/of4;)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v10, v2}, Ldefpackage/tz3;->writeTo(Ldefpackage/ew;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2}, Ldefpackage/wu3;->close()V

    .line 131
    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_2
    invoke-virtual {v0, v8, v2, v3, v4}, Ldefpackage/bv3;->f(Ldefpackage/y10;ZZLjava/io/IOException;)Ljava/io/IOException;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v8}, Ldefpackage/y10;->e()Ldefpackage/cv3;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    iget-object v0, v0, Ldefpackage/cv3;->l:Ldefpackage/rq1;

    .line 142
    .line 143
    if-eqz v0, :cond_3

    .line 144
    .line 145
    goto :goto_1

    .line 146
    :cond_3
    move v2, v3

    .line 147
    :goto_1
    if-nez v2, :cond_5

    .line 148
    .line 149
    invoke-interface {v9}, Ldefpackage/r21;->h()Ldefpackage/q21;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-interface {v0}, Ldefpackage/q21;->a()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_2

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_4
    :try_start_7
    invoke-virtual {v0, v8, v2, v3, v4}, Ldefpackage/bv3;->f(Ldefpackage/y10;ZZLjava/io/IOException;)Ljava/io/IOException;
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    .line 158
    .line 159
    .line 160
    move-object v13, v4

    .line 161
    :cond_5
    :goto_2
    if-eqz v10, :cond_6

    .line 162
    .line 163
    :try_start_8
    invoke-virtual {v10}, Ldefpackage/tz3;->isDuplex()Z

    .line 164
    .line 165
    .line 166
    move-result v0
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    .line 167
    if-nez v0, :cond_7

    .line 168
    .line 169
    :cond_6
    :try_start_9
    invoke-interface {v9}, Ldefpackage/r21;->c()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_4

    .line 170
    .line 171
    .line 172
    :cond_7
    move-object v2, v4

    .line 173
    goto :goto_4

    .line 174
    :catch_4
    move-exception v0

    .line 175
    :try_start_a
    invoke-virtual {v8, v0}, Ldefpackage/y10;->l(Ljava/io/IOException;)V

    .line 176
    .line 177
    .line 178
    throw v0
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2

    .line 179
    :catch_5
    move-exception v0

    .line 180
    :try_start_b
    invoke-virtual {v8, v0}, Ldefpackage/y10;->l(Ljava/io/IOException;)V

    .line 181
    .line 182
    .line 183
    throw v0
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_0

    .line 184
    :goto_3
    instance-of v2, v0, Lokhttp3/internal/http2/ConnectionShutdownException;

    .line 185
    .line 186
    if-nez v2, :cond_14

    .line 187
    .line 188
    iget-boolean v2, v8, Ldefpackage/y10;->c:Z

    .line 189
    .line 190
    if-eqz v2, :cond_13

    .line 191
    .line 192
    move-object v2, v0

    .line 193
    :goto_4
    if-nez v13, :cond_8

    .line 194
    .line 195
    :try_start_c
    invoke-virtual {v8, v3}, Ldefpackage/y10;->j(Z)Ldefpackage/j14;

    .line 196
    .line 197
    .line 198
    move-result-object v13

    .line 199
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    goto :goto_5

    .line 203
    :catch_6
    move-exception v0

    .line 204
    goto/16 :goto_9

    .line 205
    .line 206
    :cond_8
    :goto_5
    iput-object v1, v13, Ldefpackage/j14;->a:Ldefpackage/oz3;

    .line 207
    .line 208
    invoke-virtual {v8}, Ldefpackage/y10;->e()Ldefpackage/cv3;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    iget-object v0, v0, Ldefpackage/cv3;->g:Ldefpackage/jl1;

    .line 213
    .line 214
    iput-object v0, v13, Ldefpackage/j14;->e:Ldefpackage/jl1;

    .line 215
    .line 216
    iput-wide v11, v13, Ldefpackage/j14;->k:J

    .line 217
    .line 218
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 219
    .line 220
    .line 221
    move-result-wide v14

    .line 222
    iput-wide v14, v13, Ldefpackage/j14;->l:J

    .line 223
    .line 224
    invoke-virtual {v13}, Ldefpackage/j14;->a()Ldefpackage/k14;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    iget v10, v0, Ldefpackage/k14;->q:I

    .line 229
    .line 230
    const/16 v13, 0x64

    .line 231
    .line 232
    if-ne v10, v13, :cond_9

    .line 233
    .line 234
    goto :goto_6

    .line 235
    :cond_9
    const/16 v13, 0x66

    .line 236
    .line 237
    if-gt v13, v10, :cond_a

    .line 238
    .line 239
    const/16 v13, 0xc8

    .line 240
    .line 241
    if-ge v10, v13, :cond_a

    .line 242
    .line 243
    :goto_6
    invoke-virtual {v8, v3}, Ldefpackage/y10;->j(Z)Ldefpackage/j14;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    iput-object v1, v0, Ldefpackage/j14;->a:Ldefpackage/oz3;

    .line 251
    .line 252
    invoke-virtual {v8}, Ldefpackage/y10;->e()Ldefpackage/cv3;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    iget-object v1, v1, Ldefpackage/cv3;->g:Ldefpackage/jl1;

    .line 257
    .line 258
    iput-object v1, v0, Ldefpackage/j14;->e:Ldefpackage/jl1;

    .line 259
    .line 260
    iput-wide v11, v0, Ldefpackage/j14;->k:J

    .line 261
    .line 262
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 263
    .line 264
    .line 265
    move-result-wide v10

    .line 266
    iput-wide v10, v0, Ldefpackage/j14;->l:J

    .line 267
    .line 268
    invoke-virtual {v0}, Ldefpackage/j14;->a()Ldefpackage/k14;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    iget v10, v0, Ldefpackage/k14;->q:I

    .line 273
    .line 274
    :cond_a
    invoke-virtual {v0}, Ldefpackage/k14;->f()Ldefpackage/j14;

    .line 275
    .line 276
    .line 277
    move-result-object v1
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_6

    .line 278
    :try_start_d
    const-string v3, "Content-Type"

    .line 279
    .line 280
    iget-object v11, v0, Ldefpackage/k14;->s:Ldefpackage/tl1;

    .line 281
    .line 282
    invoke-virtual {v11, v3}, Ldefpackage/tl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v3

    .line 286
    if-nez v3, :cond_b

    .line 287
    .line 288
    move-object v12, v4

    .line 289
    goto :goto_7

    .line 290
    :cond_b
    move-object v12, v3

    .line 291
    :goto_7
    invoke-interface {v9, v0}, Ldefpackage/r21;->d(Ldefpackage/k14;)J

    .line 292
    .line 293
    .line 294
    move-result-wide v13

    .line 295
    invoke-interface {v9, v0}, Ldefpackage/r21;->a(Ldefpackage/k14;)Ldefpackage/ej4;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    new-instance v3, Ldefpackage/p21;

    .line 300
    .line 301
    invoke-direct {v3, v8, v0, v13, v14}, Ldefpackage/p21;-><init>(Ldefpackage/y10;Ldefpackage/ej4;J)V

    .line 302
    .line 303
    .line 304
    new-instance v11, Ldefpackage/fv3;

    .line 305
    .line 306
    new-instance v15, Ldefpackage/xu3;

    .line 307
    .line 308
    invoke-direct {v15, v3}, Ldefpackage/xu3;-><init>(Ldefpackage/ej4;)V

    .line 309
    .line 310
    .line 311
    const/16 v16, 0x0

    .line 312
    .line 313
    invoke-direct/range {v11 .. v16}, Ldefpackage/fv3;-><init>(Ljava/lang/Object;JLdefpackage/fw;I)V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_7

    .line 314
    .line 315
    .line 316
    :try_start_e
    iput-object v11, v1, Ldefpackage/j14;->g:Ldefpackage/n14;

    .line 317
    .line 318
    invoke-virtual {v1}, Ldefpackage/j14;->a()Ldefpackage/k14;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    iget-object v1, v0, Ldefpackage/k14;->n:Ldefpackage/oz3;

    .line 323
    .line 324
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    iget-object v1, v1, Ldefpackage/oz3;->c:Ldefpackage/tl1;

    .line 328
    .line 329
    invoke-virtual {v1, v5}, Ldefpackage/tl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v1

    .line 333
    invoke-virtual {v6, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    if-nez v1, :cond_d

    .line 338
    .line 339
    iget-object v1, v0, Ldefpackage/k14;->s:Ldefpackage/tl1;

    .line 340
    .line 341
    invoke-virtual {v1, v5}, Ldefpackage/tl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    if-nez v1, :cond_c

    .line 346
    .line 347
    goto :goto_8

    .line 348
    :cond_c
    move-object v4, v1

    .line 349
    :goto_8
    invoke-virtual {v6, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    if-eqz v1, :cond_e

    .line 354
    .line 355
    :cond_d
    invoke-interface {v9}, Ldefpackage/r21;->h()Ldefpackage/q21;

    .line 356
    .line 357
    .line 358
    move-result-object v1

    .line 359
    invoke-interface {v1}, Ldefpackage/q21;->a()V

    .line 360
    .line 361
    .line 362
    :cond_e
    const/16 v1, 0xcc

    .line 363
    .line 364
    if-eq v10, v1, :cond_f

    .line 365
    .line 366
    const/16 v1, 0xcd

    .line 367
    .line 368
    if-ne v10, v1, :cond_10

    .line 369
    .line 370
    :cond_f
    iget-object v1, v0, Ldefpackage/k14;->t:Ldefpackage/n14;

    .line 371
    .line 372
    invoke-virtual {v1}, Ldefpackage/n14;->contentLength()J

    .line 373
    .line 374
    .line 375
    move-result-wide v3

    .line 376
    const-wide/16 v5, 0x0

    .line 377
    .line 378
    cmp-long v1, v3, v5

    .line 379
    .line 380
    if-gtz v1, :cond_11

    .line 381
    .line 382
    :cond_10
    return-object v0

    .line 383
    :cond_11
    new-instance v1, Ljava/net/ProtocolException;

    .line 384
    .line 385
    new-instance v3, Ljava/lang/StringBuilder;

    .line 386
    .line 387
    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 391
    .line 392
    .line 393
    const-string v4, " had non-zero Content-Length: "

    .line 394
    .line 395
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 396
    .line 397
    .line 398
    iget-object v0, v0, Ldefpackage/k14;->t:Ldefpackage/n14;

    .line 399
    .line 400
    invoke-virtual {v0}, Ldefpackage/n14;->contentLength()J

    .line 401
    .line 402
    .line 403
    move-result-wide v4

    .line 404
    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 408
    .line 409
    .line 410
    move-result-object v0

    .line 411
    invoke-direct {v1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    throw v1

    .line 415
    :catch_7
    move-exception v0

    .line 416
    invoke-virtual {v8, v0}, Ldefpackage/y10;->l(Ljava/io/IOException;)V

    .line 417
    .line 418
    .line 419
    throw v0
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_6

    .line 420
    :goto_9
    if-eqz v2, :cond_12

    .line 421
    .line 422
    invoke-static {v2, v0}, Ldefpackage/j51;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 423
    .line 424
    .line 425
    throw v2

    .line 426
    :cond_12
    throw v0

    .line 427
    :cond_13
    throw v0

    .line 428
    :cond_14
    throw v0

    .line 429
    :pswitch_0
    iget-object v5, v1, Ldefpackage/ev3;->a:Ldefpackage/bv3;

    .line 430
    .line 431
    monitor-enter v5

    .line 432
    :try_start_f
    iget-boolean v0, v5, Ldefpackage/bv3;->z:Z

    .line 433
    .line 434
    if-eqz v0, :cond_19

    .line 435
    .line 436
    iget-boolean v0, v5, Ldefpackage/bv3;->y:Z

    .line 437
    .line 438
    if-nez v0, :cond_18

    .line 439
    .line 440
    iget-boolean v0, v5, Ldefpackage/bv3;->x:Z
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_1

    .line 441
    .line 442
    if-nez v0, :cond_17

    .line 443
    .line 444
    monitor-exit v5

    .line 445
    iget-object v0, v5, Ldefpackage/bv3;->t:Ldefpackage/s21;

    .line 446
    .line 447
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    invoke-interface {v0}, Ldefpackage/s21;->a()Ldefpackage/cv3;

    .line 451
    .line 452
    .line 453
    move-result-object v6

    .line 454
    iget-object v7, v5, Ldefpackage/bv3;->n:Ldefpackage/o83;

    .line 455
    .line 456
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 460
    .line 461
    .line 462
    iget v8, v1, Ldefpackage/ev3;->g:I

    .line 463
    .line 464
    iget-object v9, v6, Ldefpackage/cv3;->f:Ljava/net/Socket;

    .line 465
    .line 466
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 467
    .line 468
    .line 469
    iget-object v10, v6, Ldefpackage/cv3;->i:Ldefpackage/fw;

    .line 470
    .line 471
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    iget-object v11, v6, Ldefpackage/cv3;->j:Ldefpackage/ew;

    .line 475
    .line 476
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    iget-object v12, v6, Ldefpackage/cv3;->l:Ldefpackage/rq1;

    .line 480
    .line 481
    if-eqz v12, :cond_15

    .line 482
    .line 483
    new-instance v8, Ldefpackage/sq1;

    .line 484
    .line 485
    invoke-direct {v8, v7, v6, v1, v12}, Ldefpackage/sq1;-><init>(Ldefpackage/o83;Ldefpackage/cv3;Ldefpackage/ev3;Ldefpackage/rq1;)V

    .line 486
    .line 487
    .line 488
    goto :goto_a

    .line 489
    :cond_15
    invoke-virtual {v9, v8}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 490
    .line 491
    .line 492
    invoke-interface {v10}, Ldefpackage/ej4;->timeout()Ldefpackage/fu4;

    .line 493
    .line 494
    .line 495
    move-result-object v9

    .line 496
    int-to-long v12, v8

    .line 497
    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 498
    .line 499
    invoke-virtual {v9, v12, v13, v8}, Ldefpackage/fu4;->g(JLjava/util/concurrent/TimeUnit;)Ldefpackage/fu4;

    .line 500
    .line 501
    .line 502
    invoke-interface {v11}, Ldefpackage/of4;->timeout()Ldefpackage/fu4;

    .line 503
    .line 504
    .line 505
    move-result-object v9

    .line 506
    iget v12, v1, Ldefpackage/ev3;->h:I

    .line 507
    .line 508
    int-to-long v12, v12

    .line 509
    invoke-virtual {v9, v12, v13, v8}, Ldefpackage/fu4;->g(JLjava/util/concurrent/TimeUnit;)Ldefpackage/fu4;

    .line 510
    .line 511
    .line 512
    new-instance v8, Ldefpackage/hq1;

    .line 513
    .line 514
    invoke-direct {v8, v7, v6, v10, v11}, Ldefpackage/hq1;-><init>(Ldefpackage/o83;Ldefpackage/q21;Ldefpackage/fw;Ldefpackage/ew;)V

    .line 515
    .line 516
    .line 517
    :goto_a
    new-instance v6, Ldefpackage/y10;

    .line 518
    .line 519
    invoke-direct {v6, v5, v0, v8}, Ldefpackage/y10;-><init>(Ldefpackage/bv3;Ldefpackage/s21;Ldefpackage/r21;)V

    .line 520
    .line 521
    .line 522
    iput-object v6, v5, Ldefpackage/bv3;->w:Ldefpackage/y10;

    .line 523
    .line 524
    iput-object v6, v5, Ldefpackage/bv3;->B:Ldefpackage/y10;

    .line 525
    .line 526
    monitor-enter v5

    .line 527
    :try_start_10
    iput-boolean v2, v5, Ldefpackage/bv3;->x:Z

    .line 528
    .line 529
    iput-boolean v2, v5, Ldefpackage/bv3;->y:Z
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_0

    .line 530
    .line 531
    monitor-exit v5

    .line 532
    iget-boolean v0, v5, Ldefpackage/bv3;->A:Z

    .line 533
    .line 534
    if-nez v0, :cond_16

    .line 535
    .line 536
    const/16 v0, 0x3d

    .line 537
    .line 538
    invoke-static {v1, v3, v6, v4, v0}, Ldefpackage/ev3;->a(Ldefpackage/ev3;ILdefpackage/y10;Ldefpackage/oz3;I)Ldefpackage/ev3;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    iget-object v1, v1, Ldefpackage/ev3;->e:Ldefpackage/oz3;

    .line 543
    .line 544
    invoke-virtual {v0, v1}, Ldefpackage/ev3;->b(Ldefpackage/oz3;)Ldefpackage/k14;

    .line 545
    .line 546
    .line 547
    move-result-object v4

    .line 548
    goto :goto_b

    .line 549
    :cond_16
    const-string v0, "Canceled"

    .line 550
    .line 551
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 552
    .line 553
    .line 554
    :goto_b
    return-object v4

    .line 555
    :catchall_0
    move-exception v0

    .line 556
    monitor-exit v5

    .line 557
    throw v0

    .line 558
    :cond_17
    :try_start_11
    const-string v0, "Check failed."

    .line 559
    .line 560
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 561
    .line 562
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 563
    .line 564
    .line 565
    throw v1

    .line 566
    :catchall_1
    move-exception v0

    .line 567
    goto :goto_c

    .line 568
    :cond_18
    const-string v0, "Check failed."

    .line 569
    .line 570
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 571
    .line 572
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    throw v1

    .line 576
    :cond_19
    const-string v0, "released"

    .line 577
    .line 578
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 579
    .line 580
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 581
    .line 582
    .line 583
    throw v1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_1

    .line 584
    :goto_c
    monitor-exit v5

    .line 585
    throw v0

    .line 586
    nop

    .line 587
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
