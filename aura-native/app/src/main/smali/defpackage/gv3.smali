.class public final Ldefpackage/gv3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/r34;


# instance fields
.field public A:Ldefpackage/o34;

.field public final B:Ldefpackage/ii;

.field public final n:Ldefpackage/gr4;

.field public final o:Ldefpackage/dv3;

.field public final p:I

.field public final q:I

.field public final r:I

.field public final s:I

.field public final t:Z

.field public final u:Z

.field public final v:Ldefpackage/f6;

.field public final w:Ldefpackage/rm2;

.field public final x:Ldefpackage/hy;

.field public y:Ldefpackage/x7;

.field public z:Ldefpackage/s34;


# direct methods
.method public constructor <init>(Ldefpackage/gr4;Ldefpackage/dv3;IIIIZZLdefpackage/f6;Ldefpackage/rm2;Ldefpackage/hy;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Ldefpackage/gv3;->n:Ldefpackage/gr4;

    .line 20
    .line 21
    iput-object p2, p0, Ldefpackage/gv3;->o:Ldefpackage/dv3;

    .line 22
    .line 23
    iput p3, p0, Ldefpackage/gv3;->p:I

    .line 24
    .line 25
    iput p4, p0, Ldefpackage/gv3;->q:I

    .line 26
    .line 27
    iput p5, p0, Ldefpackage/gv3;->r:I

    .line 28
    .line 29
    iput p6, p0, Ldefpackage/gv3;->s:I

    .line 30
    .line 31
    iput-boolean p7, p0, Ldefpackage/gv3;->t:Z

    .line 32
    .line 33
    iput-boolean p8, p0, Ldefpackage/gv3;->u:Z

    .line 34
    .line 35
    iput-object p9, p0, Ldefpackage/gv3;->v:Ldefpackage/f6;

    .line 36
    .line 37
    iput-object p10, p0, Ldefpackage/gv3;->w:Ldefpackage/rm2;

    .line 38
    .line 39
    iput-object p11, p0, Ldefpackage/gv3;->x:Ldefpackage/hy;

    .line 40
    .line 41
    new-instance p1, Ldefpackage/ii;

    .line 42
    .line 43
    invoke-direct {p1}, Ldefpackage/ii;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Ldefpackage/gv3;->B:Ldefpackage/ii;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final a()Ldefpackage/x90;
    .locals 12

    .line 1
    iget-object v0, p0, Ldefpackage/gv3;->A:Ldefpackage/o34;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-object v1, p0, Ldefpackage/gv3;->A:Ldefpackage/o34;

    .line 7
    .line 8
    invoke-virtual {p0, v0, v1}, Ldefpackage/gv3;->b(Ldefpackage/o34;Ljava/util/ArrayList;)Ldefpackage/x90;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    iget-object v0, p0, Ldefpackage/gv3;->y:Ldefpackage/x7;

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget v2, v0, Ldefpackage/x7;->o:I

    .line 18
    .line 19
    iget-object v3, v0, Ldefpackage/x7;->p:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v3, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-ge v2, v3, :cond_2

    .line 28
    .line 29
    iget v2, v0, Ldefpackage/x7;->o:I

    .line 30
    .line 31
    iget-object v3, v0, Ldefpackage/x7;->p:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-ge v2, v4, :cond_1

    .line 40
    .line 41
    iget v2, v0, Ldefpackage/x7;->o:I

    .line 42
    .line 43
    add-int/lit8 v4, v2, 0x1

    .line 44
    .line 45
    iput v4, v0, Ldefpackage/x7;->o:I

    .line 46
    .line 47
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ldefpackage/o34;

    .line 52
    .line 53
    invoke-virtual {p0, v0, v1}, Ldefpackage/gv3;->b(Ldefpackage/o34;Ljava/util/ArrayList;)Ldefpackage/x90;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0

    .line 58
    :cond_1
    invoke-static {}, Ldefpackage/tb4;->k()V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_2
    iget-object v0, p0, Ldefpackage/gv3;->z:Ldefpackage/s34;

    .line 63
    .line 64
    if-nez v0, :cond_3

    .line 65
    .line 66
    new-instance v0, Ldefpackage/s34;

    .line 67
    .line 68
    iget-object v2, p0, Ldefpackage/gv3;->v:Ldefpackage/f6;

    .line 69
    .line 70
    iget-object v3, p0, Ldefpackage/gv3;->w:Ldefpackage/rm2;

    .line 71
    .line 72
    iget-object v4, p0, Ldefpackage/gv3;->x:Ldefpackage/hy;

    .line 73
    .line 74
    iget-boolean v5, p0, Ldefpackage/gv3;->u:Z

    .line 75
    .line 76
    invoke-direct {v0, v2, v3, v4, v5}, Ldefpackage/s34;-><init>(Ldefpackage/f6;Ldefpackage/rm2;Ldefpackage/hy;Z)V

    .line 77
    .line 78
    .line 79
    iput-object v0, p0, Ldefpackage/gv3;->z:Ldefpackage/s34;

    .line 80
    .line 81
    :cond_3
    invoke-virtual {v0}, Ldefpackage/s34;->a()Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_1f

    .line 86
    .line 87
    invoke-virtual {v0}, Ldefpackage/s34;->a()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_1e

    .line 92
    .line 93
    new-instance v2, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    :cond_4
    iget v3, v0, Ldefpackage/s34;->f:I

    .line 99
    .line 100
    iget-object v4, v0, Ldefpackage/s34;->e:Ljava/util/List;

    .line 101
    .line 102
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-ge v3, v4, :cond_1a

    .line 107
    .line 108
    iget-object v3, v0, Ldefpackage/s34;->a:Ldefpackage/f6;

    .line 109
    .line 110
    const-string v4, "No route to "

    .line 111
    .line 112
    iget v5, v0, Ldefpackage/s34;->f:I

    .line 113
    .line 114
    iget-object v6, v0, Ldefpackage/s34;->e:Ljava/util/List;

    .line 115
    .line 116
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 117
    .line 118
    .line 119
    move-result v6

    .line 120
    if-ge v5, v6, :cond_19

    .line 121
    .line 122
    iget-object v5, v0, Ldefpackage/s34;->e:Ljava/util/List;

    .line 123
    .line 124
    iget v6, v0, Ldefpackage/s34;->f:I

    .line 125
    .line 126
    add-int/lit8 v7, v6, 0x1

    .line 127
    .line 128
    iput v7, v0, Ldefpackage/s34;->f:I

    .line 129
    .line 130
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v5

    .line 134
    check-cast v5, Ljava/net/Proxy;

    .line 135
    .line 136
    iget-object v6, v0, Ldefpackage/s34;->c:Ldefpackage/hy;

    .line 137
    .line 138
    new-instance v7, Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 141
    .line 142
    .line 143
    iput-object v7, v0, Ldefpackage/s34;->g:Ljava/util/List;

    .line 144
    .line 145
    invoke-virtual {v5}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 146
    .line 147
    .line 148
    move-result-object v8

    .line 149
    sget-object v9, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 150
    .line 151
    if-eq v8, v9, :cond_8

    .line 152
    .line 153
    invoke-virtual {v5}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    sget-object v9, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 158
    .line 159
    if-ne v8, v9, :cond_5

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_5
    invoke-virtual {v5}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    instance-of v9, v8, Ljava/net/InetSocketAddress;

    .line 167
    .line 168
    if-eqz v9, :cond_7

    .line 169
    .line 170
    check-cast v8, Ljava/net/InetSocketAddress;

    .line 171
    .line 172
    invoke-virtual {v8}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 173
    .line 174
    .line 175
    move-result-object v9

    .line 176
    if-nez v9, :cond_6

    .line 177
    .line 178
    invoke-virtual {v8}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v9

    .line 182
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_6
    invoke-virtual {v9}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v9

    .line 190
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    :goto_0
    invoke-virtual {v8}, Ljava/net/InetSocketAddress;->getPort()I

    .line 194
    .line 195
    .line 196
    move-result v8

    .line 197
    goto :goto_2

    .line 198
    :cond_7
    const-string p0, "Proxy.address() is not an InetSocketAddress: "

    .line 199
    .line 200
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {v0, p0}, Ldefpackage/nz2;->l(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    return-object v1

    .line 208
    :cond_8
    :goto_1
    iget-object v8, v3, Ldefpackage/f6;->h:Ldefpackage/gr1;

    .line 209
    .line 210
    iget-object v9, v8, Ldefpackage/gr1;->d:Ljava/lang/String;

    .line 211
    .line 212
    iget v8, v8, Ldefpackage/gr1;->e:I

    .line 213
    .line 214
    :goto_2
    const/4 v10, 0x1

    .line 215
    if-gt v10, v8, :cond_18

    .line 216
    .line 217
    const/high16 v10, 0x10000

    .line 218
    .line 219
    if-ge v8, v10, :cond_18

    .line 220
    .line 221
    invoke-virtual {v5}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 222
    .line 223
    .line 224
    move-result-object v4

    .line 225
    sget-object v10, Ljava/net/Proxy$Type;->SOCKS:Ljava/net/Proxy$Type;

    .line 226
    .line 227
    if-ne v4, v10, :cond_9

    .line 228
    .line 229
    invoke-static {v9, v8}, Ljava/net/InetSocketAddress;->createUnresolved(Ljava/lang/String;I)Ljava/net/InetSocketAddress;

    .line 230
    .line 231
    .line 232
    move-result-object v3

    .line 233
    invoke-virtual {v7, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    goto/16 :goto_9

    .line 237
    .line 238
    :cond_9
    sget-object v4, Ldefpackage/ue5;->a:Ldefpackage/ux3;

    .line 239
    .line 240
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    sget-object v4, Ldefpackage/ue5;->a:Ldefpackage/ux3;

    .line 244
    .line 245
    invoke-virtual {v4, v9}, Ldefpackage/ux3;->a(Ljava/lang/String;)Z

    .line 246
    .line 247
    .line 248
    move-result v4

    .line 249
    if-eqz v4, :cond_a

    .line 250
    .line 251
    invoke-static {v9}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    invoke-static {v3}, Ldefpackage/gb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    goto :goto_3

    .line 260
    :cond_a
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    iget-object v4, v3, Ldefpackage/f6;->a:Ldefpackage/fz0;

    .line 264
    .line 265
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    :try_start_0
    invoke-static {v9}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    invoke-static {v4}, Ldefpackage/ti;->r0([Ljava/lang/Object;)Ljava/util/List;

    .line 276
    .line 277
    .line 278
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 279
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 280
    .line 281
    .line 282
    move-result v6

    .line 283
    if-nez v6, :cond_17

    .line 284
    .line 285
    move-object v3, v4

    .line 286
    :goto_3
    iget-boolean v4, v0, Ldefpackage/s34;->d:Z

    .line 287
    .line 288
    if-eqz v4, :cond_13

    .line 289
    .line 290
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 291
    .line 292
    .line 293
    move-result v4

    .line 294
    const/4 v6, 0x2

    .line 295
    if-ge v4, v6, :cond_b

    .line 296
    .line 297
    goto/16 :goto_7

    .line 298
    .line 299
    :cond_b
    new-instance v4, Ljava/util/ArrayList;

    .line 300
    .line 301
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 302
    .line 303
    .line 304
    new-instance v6, Ljava/util/ArrayList;

    .line 305
    .line 306
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 307
    .line 308
    .line 309
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 310
    .line 311
    .line 312
    move-result-object v9

    .line 313
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 314
    .line 315
    .line 316
    move-result v10

    .line 317
    if-eqz v10, :cond_d

    .line 318
    .line 319
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v10

    .line 323
    move-object v11, v10

    .line 324
    check-cast v11, Ljava/net/InetAddress;

    .line 325
    .line 326
    instance-of v11, v11, Ljava/net/Inet6Address;

    .line 327
    .line 328
    if-eqz v11, :cond_c

    .line 329
    .line 330
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    goto :goto_4

    .line 334
    :cond_c
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    goto :goto_4

    .line 338
    :cond_d
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 339
    .line 340
    .line 341
    move-result v9

    .line 342
    if-nez v9, :cond_13

    .line 343
    .line 344
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 345
    .line 346
    .line 347
    move-result v9

    .line 348
    if-eqz v9, :cond_e

    .line 349
    .line 350
    goto :goto_7

    .line 351
    :cond_e
    sget-object v3, Ldefpackage/xe5;->a:[B

    .line 352
    .line 353
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 354
    .line 355
    .line 356
    move-result-object v4

    .line 357
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 358
    .line 359
    .line 360
    move-result-object v6

    .line 361
    invoke-static {}, Ldefpackage/gb;->r()Ldefpackage/qb2;

    .line 362
    .line 363
    .line 364
    move-result-object v9

    .line 365
    :cond_f
    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 366
    .line 367
    .line 368
    move-result v3

    .line 369
    if-nez v3, :cond_11

    .line 370
    .line 371
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 372
    .line 373
    .line 374
    move-result v3

    .line 375
    if-eqz v3, :cond_10

    .line 376
    .line 377
    goto :goto_6

    .line 378
    :cond_10
    invoke-static {v9}, Ldefpackage/gb;->f(Ldefpackage/qb2;)Ldefpackage/qb2;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    goto :goto_7

    .line 383
    :cond_11
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 384
    .line 385
    .line 386
    move-result v3

    .line 387
    if-eqz v3, :cond_12

    .line 388
    .line 389
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v3

    .line 393
    invoke-virtual {v9, v3}, Ldefpackage/qb2;->add(Ljava/lang/Object;)Z

    .line 394
    .line 395
    .line 396
    :cond_12
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 397
    .line 398
    .line 399
    move-result v3

    .line 400
    if-eqz v3, :cond_f

    .line 401
    .line 402
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v3

    .line 406
    invoke-virtual {v9, v3}, Ldefpackage/qb2;->add(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    goto :goto_5

    .line 410
    :cond_13
    :goto_7
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 411
    .line 412
    .line 413
    move-result-object v3

    .line 414
    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 415
    .line 416
    .line 417
    move-result v4

    .line 418
    if-eqz v4, :cond_14

    .line 419
    .line 420
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v4

    .line 424
    check-cast v4, Ljava/net/InetAddress;

    .line 425
    .line 426
    new-instance v6, Ljava/net/InetSocketAddress;

    .line 427
    .line 428
    invoke-direct {v6, v4, v8}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    goto :goto_8

    .line 435
    :cond_14
    :goto_9
    iget-object v3, v0, Ldefpackage/s34;->g:Ljava/util/List;

    .line 436
    .line 437
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 438
    .line 439
    .line 440
    move-result-object v3

    .line 441
    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 442
    .line 443
    .line 444
    move-result v4

    .line 445
    if-eqz v4, :cond_16

    .line 446
    .line 447
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v4

    .line 451
    check-cast v4, Ljava/net/InetSocketAddress;

    .line 452
    .line 453
    new-instance v6, Ldefpackage/o34;

    .line 454
    .line 455
    iget-object v7, v0, Ldefpackage/s34;->a:Ldefpackage/f6;

    .line 456
    .line 457
    invoke-direct {v6, v7, v5, v4}, Ldefpackage/o34;-><init>(Ldefpackage/f6;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V

    .line 458
    .line 459
    .line 460
    iget-object v4, v0, Ldefpackage/s34;->b:Ldefpackage/rm2;

    .line 461
    .line 462
    monitor-enter v4

    .line 463
    :try_start_1
    iget-object v7, v4, Ldefpackage/rm2;->o:Ljava/lang/Object;

    .line 464
    .line 465
    check-cast v7, Ljava/util/LinkedHashSet;

    .line 466
    .line 467
    invoke-interface {v7, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 471
    monitor-exit v4

    .line 472
    if-eqz v7, :cond_15

    .line 473
    .line 474
    iget-object v4, v0, Ldefpackage/s34;->h:Ljava/util/ArrayList;

    .line 475
    .line 476
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 477
    .line 478
    .line 479
    goto :goto_a

    .line 480
    :cond_15
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    goto :goto_a

    .line 484
    :catchall_0
    move-exception p0

    .line 485
    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 486
    throw p0

    .line 487
    :cond_16
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 488
    .line 489
    .line 490
    move-result v3

    .line 491
    if-nez v3, :cond_4

    .line 492
    .line 493
    goto :goto_b

    .line 494
    :cond_17
    new-instance p0, Ljava/net/UnknownHostException;

    .line 495
    .line 496
    iget-object v0, v3, Ldefpackage/f6;->a:Ldefpackage/fz0;

    .line 497
    .line 498
    new-instance v1, Ljava/lang/StringBuilder;

    .line 499
    .line 500
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 504
    .line 505
    .line 506
    const-string v0, " returned no addresses for "

    .line 507
    .line 508
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    invoke-direct {p0, v0}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    throw p0

    .line 522
    :catch_0
    move-exception p0

    .line 523
    new-instance v0, Ljava/net/UnknownHostException;

    .line 524
    .line 525
    const-string v1, "Broken system behaviour for dns lookup of "

    .line 526
    .line 527
    invoke-virtual {v1, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v1

    .line 531
    invoke-direct {v0, v1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 535
    .line 536
    .line 537
    throw v0

    .line 538
    :cond_18
    new-instance p0, Ljava/net/SocketException;

    .line 539
    .line 540
    new-instance v0, Ljava/lang/StringBuilder;

    .line 541
    .line 542
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 546
    .line 547
    .line 548
    const/16 v1, 0x3a

    .line 549
    .line 550
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 551
    .line 552
    .line 553
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 554
    .line 555
    .line 556
    const-string v1, "; port is out of range"

    .line 557
    .line 558
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 559
    .line 560
    .line 561
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    invoke-direct {p0, v0}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    throw p0

    .line 569
    :cond_19
    new-instance p0, Ljava/net/SocketException;

    .line 570
    .line 571
    iget-object v1, v3, Ldefpackage/f6;->h:Ldefpackage/gr1;

    .line 572
    .line 573
    iget-object v1, v1, Ldefpackage/gr1;->d:Ljava/lang/String;

    .line 574
    .line 575
    const-string v2, "; exhausted proxy configurations: "

    .line 576
    .line 577
    iget-object v0, v0, Ldefpackage/s34;->e:Ljava/util/List;

    .line 578
    .line 579
    new-instance v3, Ljava/lang/StringBuilder;

    .line 580
    .line 581
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 585
    .line 586
    .line 587
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 591
    .line 592
    .line 593
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    invoke-direct {p0, v0}, Ljava/net/SocketException;-><init>(Ljava/lang/String;)V

    .line 598
    .line 599
    .line 600
    throw p0

    .line 601
    :cond_1a
    :goto_b
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 602
    .line 603
    .line 604
    move-result v3

    .line 605
    if-eqz v3, :cond_1b

    .line 606
    .line 607
    iget-object v3, v0, Ldefpackage/s34;->h:Ljava/util/ArrayList;

    .line 608
    .line 609
    invoke-static {v3, v2}, Ldefpackage/v40;->n0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 610
    .line 611
    .line 612
    iget-object v0, v0, Ldefpackage/s34;->h:Ljava/util/ArrayList;

    .line 613
    .line 614
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 615
    .line 616
    .line 617
    :cond_1b
    new-instance v0, Ldefpackage/x7;

    .line 618
    .line 619
    invoke-direct {v0, v2}, Ldefpackage/x7;-><init>(Ljava/util/ArrayList;)V

    .line 620
    .line 621
    .line 622
    iput-object v0, p0, Ldefpackage/gv3;->y:Ldefpackage/x7;

    .line 623
    .line 624
    iget-object v3, p0, Ldefpackage/gv3;->x:Ldefpackage/hy;

    .line 625
    .line 626
    invoke-virtual {v3}, Ldefpackage/hy;->m()Z

    .line 627
    .line 628
    .line 629
    move-result v3

    .line 630
    if-nez v3, :cond_1d

    .line 631
    .line 632
    iget v3, v0, Ldefpackage/x7;->o:I

    .line 633
    .line 634
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 635
    .line 636
    .line 637
    move-result v4

    .line 638
    if-ge v3, v4, :cond_1c

    .line 639
    .line 640
    iget v1, v0, Ldefpackage/x7;->o:I

    .line 641
    .line 642
    add-int/lit8 v3, v1, 0x1

    .line 643
    .line 644
    iput v3, v0, Ldefpackage/x7;->o:I

    .line 645
    .line 646
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    check-cast v0, Ldefpackage/o34;

    .line 651
    .line 652
    invoke-virtual {p0, v0, v2}, Ldefpackage/gv3;->b(Ldefpackage/o34;Ljava/util/ArrayList;)Ldefpackage/x90;

    .line 653
    .line 654
    .line 655
    move-result-object p0

    .line 656
    return-object p0

    .line 657
    :cond_1c
    invoke-static {}, Ldefpackage/tb4;->k()V

    .line 658
    .line 659
    .line 660
    return-object v1

    .line 661
    :cond_1d
    const-string p0, "Canceled"

    .line 662
    .line 663
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 664
    .line 665
    .line 666
    return-object v1

    .line 667
    :cond_1e
    invoke-static {}, Ldefpackage/tb4;->k()V

    .line 668
    .line 669
    .line 670
    return-object v1

    .line 671
    :cond_1f
    const-string p0, "exhausted all routes"

    .line 672
    .line 673
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 674
    .line 675
    .line 676
    return-object v1
.end method

.method public final b(Ldefpackage/o34;Ljava/util/ArrayList;)Ldefpackage/x90;
    .locals 28

    .line 1
    move-object/from16 v9, p0

    .line 2
    .line 3
    move-object/from16 v10, p1

    .line 4
    .line 5
    sget-object v0, Ldefpackage/pr3;->t:Ldefpackage/pr3;

    .line 6
    .line 7
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v1, v10, Ldefpackage/o34;->a:Ldefpackage/f6;

    .line 11
    .line 12
    iget-object v2, v1, Ldefpackage/f6;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 13
    .line 14
    if-nez v2, :cond_2

    .line 15
    .line 16
    iget-object v1, v1, Ldefpackage/f6;->j:Ljava/util/List;

    .line 17
    .line 18
    sget-object v2, Ldefpackage/ma0;->f:Ldefpackage/ma0;

    .line 19
    .line 20
    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v1, v10, Ldefpackage/o34;->a:Ldefpackage/f6;

    .line 27
    .line 28
    iget-object v1, v1, Ldefpackage/f6;->h:Ldefpackage/gr1;

    .line 29
    .line 30
    iget-object v1, v1, Ldefpackage/gr1;->d:Ljava/lang/String;

    .line 31
    .line 32
    sget-object v2, Ldefpackage/qg3;->a:Ldefpackage/qg3;

    .line 33
    .line 34
    sget-object v2, Ldefpackage/qg3;->a:Ldefpackage/qg3;

    .line 35
    .line 36
    invoke-virtual {v2, v1}, Ldefpackage/qg3;->h(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    new-instance v0, Ljava/net/UnknownServiceException;

    .line 44
    .line 45
    const-string v2, "CLEARTEXT communication to "

    .line 46
    .line 47
    const-string v3, " not permitted by network security policy"

    .line 48
    .line 49
    invoke-static {v2, v1, v3}, Ldefpackage/xa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-direct {v0, v1}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :cond_1
    new-instance v0, Ljava/net/UnknownServiceException;

    .line 58
    .line 59
    const-string v1, "CLEARTEXT communication not enabled for client"

    .line 60
    .line 61
    invoke-direct {v0, v1}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :cond_2
    iget-object v1, v1, Ldefpackage/f6;->i:Ljava/util/List;

    .line 66
    .line 67
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-nez v1, :cond_6

    .line 72
    .line 73
    :goto_0
    iget-object v1, v10, Ldefpackage/o34;->b:Ljava/net/Proxy;

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    sget-object v2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 80
    .line 81
    const/4 v3, 0x0

    .line 82
    if-eq v1, v2, :cond_3

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    iget-object v1, v10, Ldefpackage/o34;->a:Ldefpackage/f6;

    .line 86
    .line 87
    iget-object v2, v1, Ldefpackage/f6;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 88
    .line 89
    if-nez v2, :cond_5

    .line 90
    .line 91
    iget-object v1, v1, Ldefpackage/f6;->i:Ljava/util/List;

    .line 92
    .line 93
    invoke-interface {v1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    :goto_1
    move-object v12, v3

    .line 101
    goto :goto_3

    .line 102
    :cond_5
    :goto_2
    new-instance v0, Ldefpackage/nz3;

    .line 103
    .line 104
    invoke-direct {v0}, Ldefpackage/nz3;-><init>()V

    .line 105
    .line 106
    .line 107
    iget-object v1, v10, Ldefpackage/o34;->a:Ldefpackage/f6;

    .line 108
    .line 109
    iget-object v1, v1, Ldefpackage/f6;->h:Ldefpackage/gr1;

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iput-object v1, v0, Ldefpackage/nz3;->a:Ldefpackage/gr1;

    .line 115
    .line 116
    const-string v1, "CONNECT"

    .line 117
    .line 118
    invoke-virtual {v0, v1, v3}, Ldefpackage/nz3;->b(Ljava/lang/String;Ldefpackage/tz3;)V

    .line 119
    .line 120
    .line 121
    iget-object v1, v10, Ldefpackage/o34;->a:Ldefpackage/f6;

    .line 122
    .line 123
    iget-object v2, v1, Ldefpackage/f6;->h:Ldefpackage/gr1;

    .line 124
    .line 125
    const/4 v3, 0x1

    .line 126
    invoke-static {v2, v3}, Ldefpackage/ze5;->j(Ldefpackage/gr1;Z)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    const-string v3, "Host"

    .line 131
    .line 132
    invoke-virtual {v0, v3, v2}, Ldefpackage/nz3;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const-string v2, "Proxy-Connection"

    .line 136
    .line 137
    const-string v3, "Keep-Alive"

    .line 138
    .line 139
    invoke-virtual {v0, v2, v3}, Ldefpackage/nz3;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    const-string v2, "User-Agent"

    .line 143
    .line 144
    const-string v3, "okhttp/5.0.0-alpha.14"

    .line 145
    .line 146
    invoke-virtual {v0, v2, v3}, Ldefpackage/nz3;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    new-instance v12, Ldefpackage/oz3;

    .line 150
    .line 151
    invoke-direct {v12, v0}, Ldefpackage/oz3;-><init>(Ldefpackage/nz3;)V

    .line 152
    .line 153
    .line 154
    sget-object v18, Ldefpackage/xe5;->e:Ldefpackage/fv3;

    .line 155
    .line 156
    sget-object v27, Ldefpackage/gq1;->q:Ldefpackage/gq1;

    .line 157
    .line 158
    new-instance v0, Ldefpackage/sl1;

    .line 159
    .line 160
    invoke-direct {v0}, Ldefpackage/sl1;-><init>()V

    .line 161
    .line 162
    .line 163
    sget-object v13, Ldefpackage/pr3;->q:Ldefpackage/pr3;

    .line 164
    .line 165
    const-string v2, "Proxy-Authenticate"

    .line 166
    .line 167
    invoke-static {v2}, Ldefpackage/e35;->G(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    const-string v3, "OkHttp-Preemptive"

    .line 171
    .line 172
    invoke-static {v3, v2}, Ldefpackage/e35;->H(Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v2}, Ldefpackage/sl1;->e(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    invoke-static {v0, v2, v3}, Ldefpackage/e35;->p(Ldefpackage/sl1;Ljava/lang/String;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0}, Ldefpackage/sl1;->c()Ldefpackage/tl1;

    .line 182
    .line 183
    .line 184
    move-result-object v17

    .line 185
    new-instance v11, Ldefpackage/k14;

    .line 186
    .line 187
    const-string v14, "Preemptive Authenticate"

    .line 188
    .line 189
    const/16 v15, 0x197

    .line 190
    .line 191
    const/16 v16, 0x0

    .line 192
    .line 193
    const/16 v19, 0x0

    .line 194
    .line 195
    const/16 v20, 0x0

    .line 196
    .line 197
    const/16 v21, 0x0

    .line 198
    .line 199
    const-wide/16 v22, -0x1

    .line 200
    .line 201
    const/16 v26, 0x0

    .line 202
    .line 203
    move-wide/from16 v24, v22

    .line 204
    .line 205
    invoke-direct/range {v11 .. v27}, Ldefpackage/k14;-><init>(Ldefpackage/oz3;Ldefpackage/pr3;Ljava/lang/String;ILdefpackage/jl1;Ldefpackage/tl1;Ldefpackage/n14;Ldefpackage/k14;Ldefpackage/k14;Ldefpackage/k14;JJLdefpackage/y10;Ldefpackage/gf1;)V

    .line 206
    .line 207
    .line 208
    iget-object v0, v1, Ldefpackage/f6;->f:Ldefpackage/fz0;

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    :goto_3
    new-instance v0, Ldefpackage/x90;

    .line 214
    .line 215
    iget-object v1, v9, Ldefpackage/gv3;->n:Ldefpackage/gr4;

    .line 216
    .line 217
    iget-object v2, v9, Ldefpackage/gv3;->o:Ldefpackage/dv3;

    .line 218
    .line 219
    iget v3, v9, Ldefpackage/gv3;->p:I

    .line 220
    .line 221
    iget v4, v9, Ldefpackage/gv3;->q:I

    .line 222
    .line 223
    iget v5, v9, Ldefpackage/gv3;->r:I

    .line 224
    .line 225
    iget v6, v9, Ldefpackage/gv3;->s:I

    .line 226
    .line 227
    iget-boolean v7, v9, Ldefpackage/gv3;->t:Z

    .line 228
    .line 229
    iget-object v8, v9, Ldefpackage/gv3;->x:Ldefpackage/hy;

    .line 230
    .line 231
    const/4 v13, -0x1

    .line 232
    const/4 v14, 0x0

    .line 233
    move-object/from16 v11, p2

    .line 234
    .line 235
    invoke-direct/range {v0 .. v14}, Ldefpackage/x90;-><init>(Ldefpackage/gr4;Ldefpackage/dv3;IIIIZLdefpackage/hy;Ldefpackage/gv3;Ldefpackage/o34;Ljava/util/List;Ldefpackage/oz3;IZ)V

    .line 236
    .line 237
    .line 238
    return-object v0

    .line 239
    :cond_6
    new-instance v0, Ljava/net/UnknownServiceException;

    .line 240
    .line 241
    const-string v1, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    .line 242
    .line 243
    invoke-direct {v0, v1}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    throw v0
.end method

.method public final c(Ldefpackage/x90;Ljava/util/List;)Ldefpackage/c24;
    .locals 10

    .line 1
    iget-object v0, p0, Ldefpackage/gv3;->o:Ldefpackage/dv3;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/gv3;->x:Ldefpackage/hy;

    .line 4
    .line 5
    invoke-virtual {v1}, Ldefpackage/hy;->l()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Ldefpackage/gv3;->v:Ldefpackage/f6;

    .line 10
    .line 11
    iget-object v3, p0, Ldefpackage/gv3;->x:Ldefpackage/hy;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1}, Ldefpackage/x90;->c()Z

    .line 18
    .line 19
    .line 20
    move-result v6

    .line 21
    if-eqz v6, :cond_0

    .line 22
    .line 23
    move v6, v5

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v6, v4

    .line 26
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, Ldefpackage/dv3;->f:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    const/4 v8, 0x0

    .line 46
    if-eqz v7, :cond_6

    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    check-cast v7, Ldefpackage/cv3;

    .line 53
    .line 54
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    monitor-enter v7

    .line 58
    if-eqz v6, :cond_3

    .line 59
    .line 60
    :try_start_0
    iget-object v9, v7, Ldefpackage/cv3;->l:Ldefpackage/rq1;

    .line 61
    .line 62
    if-eqz v9, :cond_2

    .line 63
    .line 64
    move v9, v5

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    move v9, v4

    .line 67
    :goto_2
    if-nez v9, :cond_3

    .line 68
    .line 69
    :goto_3
    move v9, v4

    .line 70
    goto :goto_4

    .line 71
    :catchall_0
    move-exception p0

    .line 72
    goto :goto_5

    .line 73
    :cond_3
    invoke-virtual {v7, v2, p2}, Ldefpackage/cv3;->f(Ldefpackage/f6;Ljava/util/List;)Z

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-nez v9, :cond_4

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    invoke-virtual {v3, v7}, Ldefpackage/hy;->a(Ldefpackage/cv3;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 81
    .line 82
    .line 83
    move v9, v5

    .line 84
    :goto_4
    monitor-exit v7

    .line 85
    if-eqz v9, :cond_1

    .line 86
    .line 87
    invoke-virtual {v7, v1}, Ldefpackage/cv3;->g(Z)Z

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    if-eqz v9, :cond_5

    .line 92
    .line 93
    goto :goto_6

    .line 94
    :cond_5
    monitor-enter v7

    .line 95
    :try_start_1
    iput-boolean v5, v7, Ldefpackage/cv3;->m:Z

    .line 96
    .line 97
    invoke-virtual {v3}, Ldefpackage/hy;->o()Ljava/net/Socket;

    .line 98
    .line 99
    .line 100
    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 101
    monitor-exit v7

    .line 102
    if-eqz v8, :cond_1

    .line 103
    .line 104
    invoke-static {v8}, Ldefpackage/ze5;->c(Ljava/net/Socket;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :catchall_1
    move-exception p0

    .line 109
    monitor-exit v7

    .line 110
    throw p0

    .line 111
    :goto_5
    monitor-exit v7

    .line 112
    throw p0

    .line 113
    :cond_6
    move-object v7, v8

    .line 114
    :goto_6
    if-nez v7, :cond_7

    .line 115
    .line 116
    return-object v8

    .line 117
    :cond_7
    if-eqz p1, :cond_8

    .line 118
    .line 119
    iget-object p2, p1, Ldefpackage/x90;->j:Ldefpackage/o34;

    .line 120
    .line 121
    iput-object p2, p0, Ldefpackage/gv3;->A:Ldefpackage/o34;

    .line 122
    .line 123
    iget-object p1, p1, Ldefpackage/x90;->q:Ljava/net/Socket;

    .line 124
    .line 125
    if-eqz p1, :cond_8

    .line 126
    .line 127
    invoke-static {p1}, Ldefpackage/ze5;->c(Ljava/net/Socket;)V

    .line 128
    .line 129
    .line 130
    :cond_8
    iget-object p1, p0, Ldefpackage/gv3;->x:Ldefpackage/hy;

    .line 131
    .line 132
    invoke-virtual {p1, v7}, Ldefpackage/hy;->e(Ldefpackage/cv3;)V

    .line 133
    .line 134
    .line 135
    iget-object p0, p0, Ldefpackage/gv3;->x:Ldefpackage/hy;

    .line 136
    .line 137
    invoke-virtual {p0, v7}, Ldefpackage/hy;->f(Ldefpackage/cv3;)V

    .line 138
    .line 139
    .line 140
    new-instance p0, Ldefpackage/c24;

    .line 141
    .line 142
    invoke-direct {p0, v7}, Ldefpackage/c24;-><init>(Ldefpackage/cv3;)V

    .line 143
    .line 144
    .line 145
    return-object p0
.end method

.method public final f(Ldefpackage/gr1;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/gv3;->v:Ldefpackage/f6;

    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/f6;->h:Ldefpackage/gr1;

    .line 7
    .line 8
    iget v0, p1, Ldefpackage/gr1;->e:I

    .line 9
    .line 10
    iget v1, p0, Ldefpackage/gr1;->e:I

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    iget-object p1, p1, Ldefpackage/gr1;->d:Ljava/lang/String;

    .line 15
    .line 16
    iget-object p0, p0, Ldefpackage/gr1;->d:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {p1, p0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    const/4 p0, 0x1

    .line 25
    return p0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public final isCanceled()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/gv3;->x:Ldefpackage/hy;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/hy;->m()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final m(Ldefpackage/cv3;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/gv3;->B:Ldefpackage/ii;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/ii;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    iget-object v0, p0, Ldefpackage/gv3;->A:Ldefpackage/o34;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    if-eqz p1, :cond_5

    .line 17
    .line 18
    monitor-enter p1

    .line 19
    :try_start_0
    iget v0, p1, Ldefpackage/cv3;->o:I

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    iget-boolean v0, p1, Ldefpackage/cv3;->m:Z

    .line 26
    .line 27
    if-nez v0, :cond_3

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_3
    iget-object v0, p1, Ldefpackage/cv3;->d:Ldefpackage/o34;

    .line 31
    .line 32
    iget-object v0, v0, Ldefpackage/o34;->a:Ldefpackage/f6;

    .line 33
    .line 34
    iget-object v0, v0, Ldefpackage/f6;->h:Ldefpackage/gr1;

    .line 35
    .line 36
    iget-object v3, p0, Ldefpackage/gv3;->v:Ldefpackage/f6;

    .line 37
    .line 38
    iget-object v3, v3, Ldefpackage/f6;->h:Ldefpackage/gr1;

    .line 39
    .line 40
    invoke-static {v0, v3}, Ldefpackage/ze5;->a(Ldefpackage/gr1;Ldefpackage/gr1;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_4

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_4
    iget-object v2, p1, Ldefpackage/cv3;->d:Ldefpackage/o34;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    :goto_0
    monitor-exit p1

    .line 50
    if-eqz v2, :cond_5

    .line 51
    .line 52
    iput-object v2, p0, Ldefpackage/gv3;->A:Ldefpackage/o34;

    .line 53
    .line 54
    return v1

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    monitor-exit p1

    .line 57
    throw p0

    .line 58
    :cond_5
    iget-object p1, p0, Ldefpackage/gv3;->y:Ldefpackage/x7;

    .line 59
    .line 60
    if-eqz p1, :cond_6

    .line 61
    .line 62
    iget v0, p1, Ldefpackage/x7;->o:I

    .line 63
    .line 64
    iget-object p1, p1, Ldefpackage/x7;->p:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    if-ge v0, p1, :cond_6

    .line 73
    .line 74
    return v1

    .line 75
    :cond_6
    iget-object p0, p0, Ldefpackage/gv3;->z:Ldefpackage/s34;

    .line 76
    .line 77
    if-nez p0, :cond_7

    .line 78
    .line 79
    :goto_1
    return v1

    .line 80
    :cond_7
    invoke-virtual {p0}, Ldefpackage/s34;->a()Z

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    return p0
.end method

.method public final n()Ldefpackage/f6;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/gv3;->v:Ldefpackage/f6;

    .line 2
    .line 3
    return-object p0
.end method

.method public final v()Ldefpackage/ii;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/gv3;->B:Ldefpackage/ii;

    .line 2
    .line 3
    return-object p0
.end method

.method public final w()Ldefpackage/q34;
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/gv3;->x:Ldefpackage/hy;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/hy;->c()Ldefpackage/cv3;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    :cond_0
    :goto_0
    move-object v2, v1

    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_1
    iget-object v2, p0, Ldefpackage/gv3;->x:Ldefpackage/hy;

    .line 14
    .line 15
    invoke-virtual {v2}, Ldefpackage/hy;->l()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v0, v2}, Ldefpackage/cv3;->g(Z)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    monitor-enter v0

    .line 24
    iget-boolean v3, v0, Ldefpackage/cv3;->m:Z

    .line 25
    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    xor-int/2addr v3, v2

    .line 30
    :try_start_0
    iput-boolean v2, v0, Ldefpackage/cv3;->m:Z

    .line 31
    .line 32
    iget-object v2, p0, Ldefpackage/gv3;->x:Ldefpackage/hy;

    .line 33
    .line 34
    invoke-virtual {v2}, Ldefpackage/hy;->o()Ljava/net/Socket;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    goto :goto_2

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    goto/16 :goto_4

    .line 41
    .line 42
    :cond_2
    const/4 v2, 0x0

    .line 43
    if-nez v3, :cond_4

    .line 44
    .line 45
    iget-object v3, v0, Ldefpackage/cv3;->d:Ldefpackage/o34;

    .line 46
    .line 47
    iget-object v3, v3, Ldefpackage/o34;->a:Ldefpackage/f6;

    .line 48
    .line 49
    iget-object v3, v3, Ldefpackage/f6;->h:Ldefpackage/gr1;

    .line 50
    .line 51
    invoke-virtual {p0, v3}, Ldefpackage/gv3;->f(Ldefpackage/gr1;)Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-nez v3, :cond_3

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    move v3, v2

    .line 59
    move-object v2, v1

    .line 60
    goto :goto_2

    .line 61
    :cond_4
    :goto_1
    iget-object v3, p0, Ldefpackage/gv3;->x:Ldefpackage/hy;

    .line 62
    .line 63
    invoke-virtual {v3}, Ldefpackage/hy;->o()Ljava/net/Socket;

    .line 64
    .line 65
    .line 66
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    move-object v5, v3

    .line 68
    move v3, v2

    .line 69
    move-object v2, v5

    .line 70
    :goto_2
    monitor-exit v0

    .line 71
    iget-object v4, p0, Ldefpackage/gv3;->x:Ldefpackage/hy;

    .line 72
    .line 73
    invoke-virtual {v4}, Ldefpackage/hy;->c()Ldefpackage/cv3;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    if-eqz v4, :cond_6

    .line 78
    .line 79
    if-nez v2, :cond_5

    .line 80
    .line 81
    new-instance v2, Ldefpackage/c24;

    .line 82
    .line 83
    invoke-direct {v2, v0}, Ldefpackage/c24;-><init>(Ldefpackage/cv3;)V

    .line 84
    .line 85
    .line 86
    goto :goto_3

    .line 87
    :cond_5
    const-string p0, "Check failed."

    .line 88
    .line 89
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-object v1

    .line 93
    :cond_6
    if-eqz v2, :cond_7

    .line 94
    .line 95
    invoke-static {v2}, Ldefpackage/ze5;->c(Ljava/net/Socket;)V

    .line 96
    .line 97
    .line 98
    :cond_7
    iget-object v0, p0, Ldefpackage/gv3;->x:Ldefpackage/hy;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, Ldefpackage/gv3;->x:Ldefpackage/hy;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    if-eqz v2, :cond_8

    .line 109
    .line 110
    iget-object v0, p0, Ldefpackage/gv3;->x:Ldefpackage/hy;

    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_8
    if-eqz v3, :cond_0

    .line 117
    .line 118
    iget-object v0, p0, Ldefpackage/gv3;->x:Ldefpackage/hy;

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    goto :goto_0

    .line 124
    :goto_3
    if-eqz v2, :cond_9

    .line 125
    .line 126
    return-object v2

    .line 127
    :cond_9
    invoke-virtual {p0, v1, v1}, Ldefpackage/gv3;->c(Ldefpackage/x90;Ljava/util/List;)Ldefpackage/c24;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    if-eqz v0, :cond_a

    .line 132
    .line 133
    return-object v0

    .line 134
    :cond_a
    iget-object v0, p0, Ldefpackage/gv3;->B:Ldefpackage/ii;

    .line 135
    .line 136
    invoke-virtual {v0}, Ldefpackage/ii;->isEmpty()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-nez v0, :cond_b

    .line 141
    .line 142
    iget-object p0, p0, Ldefpackage/gv3;->B:Ldefpackage/ii;

    .line 143
    .line 144
    invoke-virtual {p0}, Ldefpackage/ii;->removeFirst()Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    check-cast p0, Ldefpackage/q34;

    .line 149
    .line 150
    return-object p0

    .line 151
    :cond_b
    invoke-virtual {p0}, Ldefpackage/gv3;->a()Ldefpackage/x90;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iget-object v1, v0, Ldefpackage/x90;->k:Ljava/util/List;

    .line 156
    .line 157
    invoke-virtual {p0, v0, v1}, Ldefpackage/gv3;->c(Ldefpackage/x90;Ljava/util/List;)Ldefpackage/c24;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    if-eqz p0, :cond_c

    .line 162
    .line 163
    return-object p0

    .line 164
    :cond_c
    return-object v0

    .line 165
    :goto_4
    monitor-exit v0

    .line 166
    throw p0
.end method
