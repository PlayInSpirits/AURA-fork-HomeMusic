.class public final Ldefpackage/gp;
.super Ldefpackage/q42;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/gf1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 13
    iput p1, p0, Ldefpackage/gp;->n:I

    iput-object p2, p0, Ldefpackage/gp;->o:Ljava/lang/Object;

    iput-object p3, p0, Ldefpackage/gp;->p:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ldefpackage/q42;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Ldefpackage/a23;Ldefpackage/d23;Ldefpackage/rd1;Ldefpackage/kc1;)V
    .locals 0

    .line 1
    const/4 p1, 0x3

    .line 2
    iput p1, p0, Ldefpackage/gp;->n:I

    .line 3
    .line 4
    iput-object p2, p0, Ldefpackage/gp;->o:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p4, p0, Ldefpackage/gp;->p:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-direct {p0, p1}, Ldefpackage/q42;-><init>(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Ldefpackage/d23;Ldefpackage/a23;Z)V
    .locals 0

    const/4 p3, 0x7

    iput p3, p0, Ldefpackage/gp;->n:I

    .line 14
    iput-object p1, p0, Ldefpackage/gp;->o:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/gp;->p:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ldefpackage/q42;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Ldefpackage/gp;->n:I

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/gp;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ldefpackage/d23;

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/gp;->p:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ldefpackage/a23;

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ldefpackage/d23;->e(Ldefpackage/a23;)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    iget-object v0, p0, Ldefpackage/gp;->o:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Ldefpackage/mq1;

    .line 24
    .line 25
    iget-object p0, p0, Ldefpackage/gp;->p:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Ldefpackage/pb4;

    .line 28
    .line 29
    new-instance v2, Ldefpackage/jx3;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iget-object v0, v0, Ldefpackage/mq1;->o:Ldefpackage/rq1;

    .line 35
    .line 36
    iget-object v3, v0, Ldefpackage/rq1;->J:Ldefpackage/zq1;

    .line 37
    .line 38
    monitor-enter v3

    .line 39
    :try_start_0
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 40
    :try_start_1
    iget-object v4, v0, Ldefpackage/rq1;->E:Ldefpackage/pb4;

    .line 41
    .line 42
    new-instance v5, Ldefpackage/pb4;

    .line 43
    .line 44
    invoke-direct {v5}, Ldefpackage/pb4;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    move v7, v6

    .line 52
    :goto_0
    const/16 v8, 0xa

    .line 53
    .line 54
    const/4 v9, 0x1

    .line 55
    if-ge v7, v8, :cond_1

    .line 56
    .line 57
    shl-int v8, v9, v7

    .line 58
    .line 59
    iget v9, v4, Ldefpackage/pb4;->a:I

    .line 60
    .line 61
    and-int/2addr v8, v9

    .line 62
    if-eqz v8, :cond_0

    .line 63
    .line 64
    iget-object v8, v4, Ldefpackage/pb4;->b:[I

    .line 65
    .line 66
    aget v8, v8, v7

    .line 67
    .line 68
    invoke-virtual {v5, v7, v8}, Ldefpackage/pb4;->b(II)V

    .line 69
    .line 70
    .line 71
    :cond_0
    add-int/lit8 v7, v7, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    move v7, v6

    .line 75
    :goto_1
    if-ge v7, v8, :cond_3

    .line 76
    .line 77
    shl-int v10, v9, v7

    .line 78
    .line 79
    iget v11, p0, Ldefpackage/pb4;->a:I

    .line 80
    .line 81
    and-int/2addr v10, v11

    .line 82
    if-eqz v10, :cond_2

    .line 83
    .line 84
    iget-object v10, p0, Ldefpackage/pb4;->b:[I

    .line 85
    .line 86
    aget v10, v10, v7

    .line 87
    .line 88
    invoke-virtual {v5, v7, v10}, Ldefpackage/pb4;->b(II)V

    .line 89
    .line 90
    .line 91
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    iput-object v5, v2, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 95
    .line 96
    invoke-virtual {v5}, Ldefpackage/pb4;->a()I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    int-to-long v7, p0

    .line 101
    invoke-virtual {v4}, Ldefpackage/pb4;->a()I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    int-to-long v4, p0

    .line 106
    sub-long/2addr v7, v4

    .line 107
    const-wide/16 v4, 0x0

    .line 108
    .line 109
    cmp-long p0, v7, v4

    .line 110
    .line 111
    if-eqz p0, :cond_5

    .line 112
    .line 113
    iget-object v4, v0, Ldefpackage/rq1;->o:Ljava/util/LinkedHashMap;

    .line 114
    .line 115
    invoke-interface {v4}, Ljava/util/Map;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    if-eqz v4, :cond_4

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_4
    iget-object v4, v0, Ldefpackage/rq1;->o:Ljava/util/LinkedHashMap;

    .line 123
    .line 124
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 125
    .line 126
    .line 127
    move-result-object v4

    .line 128
    new-array v5, v6, [Ldefpackage/yq1;

    .line 129
    .line 130
    invoke-interface {v4, v5}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    check-cast v4, [Ldefpackage/yq1;

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :catchall_0
    move-exception p0

    .line 138
    goto :goto_6

    .line 139
    :cond_5
    :goto_2
    const/4 v4, 0x0

    .line 140
    :goto_3
    iget-object v5, v2, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v5, Ldefpackage/pb4;

    .line 143
    .line 144
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    iput-object v5, v0, Ldefpackage/rq1;->E:Ldefpackage/pb4;

    .line 148
    .line 149
    iget-object v5, v0, Ldefpackage/rq1;->w:Ldefpackage/fr4;

    .line 150
    .line 151
    new-instance v9, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    .line 155
    .line 156
    iget-object v10, v0, Ldefpackage/rq1;->p:Ljava/lang/String;

    .line 157
    .line 158
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    const-string v10, " onSettings"

    .line 162
    .line 163
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    new-instance v10, Ldefpackage/gp;

    .line 171
    .line 172
    invoke-direct {v10, v1, v0, v2}, Ldefpackage/gp;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 173
    .line 174
    .line 175
    invoke-static {v5, v9, v10}, Ldefpackage/fr4;->c(Ldefpackage/fr4;Ljava/lang/String;Ldefpackage/gf1;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 176
    .line 177
    .line 178
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 179
    :try_start_3
    iget-object v1, v0, Ldefpackage/rq1;->J:Ldefpackage/zq1;

    .line 180
    .line 181
    iget-object v2, v2, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v2, Ldefpackage/pb4;

    .line 184
    .line 185
    invoke-virtual {v1, v2}, Ldefpackage/zq1;->b(Ldefpackage/pb4;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 186
    .line 187
    .line 188
    goto :goto_4

    .line 189
    :catchall_1
    move-exception p0

    .line 190
    goto :goto_7

    .line 191
    :catch_0
    move-exception v1

    .line 192
    :try_start_4
    invoke-virtual {v0, v1}, Ldefpackage/rq1;->f(Ljava/io/IOException;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 193
    .line 194
    .line 195
    :goto_4
    monitor-exit v3

    .line 196
    if-eqz v4, :cond_7

    .line 197
    .line 198
    array-length v0, v4

    .line 199
    :goto_5
    if-ge v6, v0, :cond_7

    .line 200
    .line 201
    aget-object v1, v4, v6

    .line 202
    .line 203
    monitor-enter v1

    .line 204
    :try_start_5
    iget-wide v2, v1, Ldefpackage/yq1;->e:J

    .line 205
    .line 206
    add-long/2addr v2, v7

    .line 207
    iput-wide v2, v1, Ldefpackage/yq1;->e:J

    .line 208
    .line 209
    if-lez p0, :cond_6

    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 212
    .line 213
    .line 214
    :cond_6
    monitor-exit v1

    .line 215
    add-int/lit8 v6, v6, 0x1

    .line 216
    .line 217
    goto :goto_5

    .line 218
    :catchall_2
    move-exception p0

    .line 219
    monitor-exit v1

    .line 220
    throw p0

    .line 221
    :cond_7
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 222
    .line 223
    return-object p0

    .line 224
    :goto_6
    :try_start_6
    monitor-exit v0

    .line 225
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 226
    :goto_7
    monitor-exit v3

    .line 227
    throw p0

    .line 228
    :pswitch_1
    :try_start_7
    iget-object v0, p0, Ldefpackage/gp;->o:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v0, Ldefpackage/rq1;

    .line 231
    .line 232
    iget-object v0, v0, Ldefpackage/rq1;->n:Ldefpackage/kq1;

    .line 233
    .line 234
    iget-object v2, p0, Ldefpackage/gp;->p:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v2, Ldefpackage/yq1;

    .line 237
    .line 238
    invoke-virtual {v0, v2}, Ldefpackage/kq1;->d(Ldefpackage/yq1;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1

    .line 239
    .line 240
    .line 241
    goto :goto_8

    .line 242
    :catch_1
    move-exception v0

    .line 243
    sget-object v2, Ldefpackage/qg3;->a:Ldefpackage/qg3;

    .line 244
    .line 245
    sget-object v2, Ldefpackage/qg3;->a:Ldefpackage/qg3;

    .line 246
    .line 247
    new-instance v3, Ljava/lang/StringBuilder;

    .line 248
    .line 249
    const-string v4, "Http2Connection.Listener failure for "

    .line 250
    .line 251
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    iget-object v4, p0, Ldefpackage/gp;->o:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v4, Ldefpackage/rq1;

    .line 257
    .line 258
    iget-object v4, v4, Ldefpackage/rq1;->p:Ljava/lang/String;

    .line 259
    .line 260
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object v3

    .line 267
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    invoke-static {v3, v1, v0}, Ldefpackage/qg3;->i(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 271
    .line 272
    .line 273
    iget-object p0, p0, Ldefpackage/gp;->p:Ljava/lang/Object;

    .line 274
    .line 275
    check-cast p0, Ldefpackage/yq1;

    .line 276
    .line 277
    :try_start_8
    sget-object v1, Ldefpackage/b21;->q:Ldefpackage/b21;

    .line 278
    .line 279
    invoke-virtual {p0, v1, v0}, Ldefpackage/yq1;->c(Ldefpackage/b21;Ljava/io/IOException;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    .line 280
    .line 281
    .line 282
    :catch_2
    :goto_8
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 283
    .line 284
    return-object p0

    .line 285
    :pswitch_2
    iget-object v0, p0, Ldefpackage/gp;->o:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v0, Ldefpackage/rq1;

    .line 288
    .line 289
    iget-object v1, v0, Ldefpackage/rq1;->n:Ldefpackage/kq1;

    .line 290
    .line 291
    iget-object p0, p0, Ldefpackage/gp;->p:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast p0, Ldefpackage/jx3;

    .line 294
    .line 295
    iget-object p0, p0, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 296
    .line 297
    check-cast p0, Ldefpackage/pb4;

    .line 298
    .line 299
    invoke-virtual {v1, v0, p0}, Ldefpackage/kq1;->c(Ldefpackage/rq1;Ldefpackage/pb4;)V

    .line 300
    .line 301
    .line 302
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 303
    .line 304
    return-object p0

    .line 305
    :pswitch_3
    iget-object v0, p0, Ldefpackage/gp;->o:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v0, Ldefpackage/d23;

    .line 308
    .line 309
    iget-object p0, p0, Ldefpackage/gp;->p:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast p0, Ldefpackage/kc1;

    .line 312
    .line 313
    iget-object v1, v0, Ldefpackage/d23;->f:Ldefpackage/vu3;

    .line 314
    .line 315
    iget-object v1, v1, Ldefpackage/vu3;->n:Ldefpackage/nl4;

    .line 316
    .line 317
    invoke-virtual {v1}, Ldefpackage/nl4;->getValue()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    check-cast v1, Ljava/lang/Iterable;

    .line 322
    .line 323
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    if-eqz v2, :cond_9

    .line 332
    .line 333
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    check-cast v2, Ldefpackage/a23;

    .line 338
    .line 339
    invoke-static {}, Ldefpackage/rd1;->n()Z

    .line 340
    .line 341
    .line 342
    move-result v3

    .line 343
    if-eqz v3, :cond_8

    .line 344
    .line 345
    const-string v3, "FragmentNavigator"

    .line 346
    .line 347
    new-instance v4, Ljava/lang/StringBuilder;

    .line 348
    .line 349
    const-string v5, "Marking transition complete for entry "

    .line 350
    .line 351
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    const-string v5, " due to fragment "

    .line 358
    .line 359
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    const-string v5, " viewmodel being cleared"

    .line 366
    .line 367
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    invoke-static {v3, v4}, Landroid/util/Ldefpackage/og;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 375
    .line 376
    .line 377
    :cond_8
    invoke-virtual {v0, v2}, Ldefpackage/d23;->b(Ldefpackage/a23;)V

    .line 378
    .line 379
    .line 380
    goto :goto_9

    .line 381
    :cond_9
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 382
    .line 383
    return-object p0

    .line 384
    :pswitch_4
    iget-object v0, p0, Ldefpackage/gp;->o:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast v0, Ljava/lang/String;

    .line 387
    .line 388
    iget-object p0, p0, Ldefpackage/gp;->p:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast p0, Ldefpackage/sc5;

    .line 391
    .line 392
    iget-object v2, p0, Ldefpackage/sc5;->c:Landroidx/work/impl/WorkDatabase;

    .line 393
    .line 394
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    new-instance v3, Ldefpackage/v6;

    .line 398
    .line 399
    invoke-direct {v3, v2, v0, p0, v1}, Ldefpackage/v6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v2, v3}, Ldefpackage/s24;->s(Ljava/lang/Runnable;)V

    .line 403
    .line 404
    .line 405
    iget-object v0, p0, Ldefpackage/sc5;->b:Ldefpackage/r90;

    .line 406
    .line 407
    iget-object p0, p0, Ldefpackage/sc5;->e:Ljava/util/List;

    .line 408
    .line 409
    invoke-static {v0, v2, p0}, Ldefpackage/c64;->b(Ldefpackage/r90;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 410
    .line 411
    .line 412
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 413
    .line 414
    return-object p0

    .line 415
    :pswitch_5
    iget-object v0, p0, Ldefpackage/gp;->o:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v0, Ldefpackage/sc5;

    .line 418
    .line 419
    iget-object v1, v0, Ldefpackage/sc5;->c:Landroidx/work/impl/WorkDatabase;

    .line 420
    .line 421
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    iget-object p0, p0, Ldefpackage/gp;->p:Ljava/lang/Object;

    .line 425
    .line 426
    check-cast p0, Ljava/util/UUID;

    .line 427
    .line 428
    new-instance v2, Ldefpackage/k6;

    .line 429
    .line 430
    const/16 v3, 0xd

    .line 431
    .line 432
    invoke-direct {v2, v3, v0, p0}, Ldefpackage/k6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v1, v2}, Ldefpackage/s24;->s(Ljava/lang/Runnable;)V

    .line 436
    .line 437
    .line 438
    iget-object p0, v0, Ldefpackage/sc5;->b:Ldefpackage/r90;

    .line 439
    .line 440
    iget-object v1, v0, Ldefpackage/sc5;->c:Landroidx/work/impl/WorkDatabase;

    .line 441
    .line 442
    iget-object v0, v0, Ldefpackage/sc5;->e:Ljava/util/List;

    .line 443
    .line 444
    invoke-static {p0, v1, v0}, Ldefpackage/c64;->b(Ldefpackage/r90;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 445
    .line 446
    .line 447
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 448
    .line 449
    return-object p0

    .line 450
    :pswitch_6
    iget-object v0, p0, Ldefpackage/gp;->o:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v0, Ldefpackage/ip;

    .line 453
    .line 454
    iget-object v0, v0, Ldefpackage/ip;->a:Ldefpackage/xb0;

    .line 455
    .line 456
    iget-object p0, p0, Ldefpackage/gp;->p:Ljava/lang/Object;

    .line 457
    .line 458
    check-cast p0, Ldefpackage/hp;

    .line 459
    .line 460
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    iget-object v1, v0, Ldefpackage/xb0;->c:Ljava/lang/Object;

    .line 464
    .line 465
    monitor-enter v1

    .line 466
    :try_start_9
    iget-object v2, v0, Ldefpackage/xb0;->d:Ljava/util/LinkedHashSet;

    .line 467
    .line 468
    invoke-virtual {v2, p0}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result p0

    .line 472
    if-eqz p0, :cond_a

    .line 473
    .line 474
    iget-object p0, v0, Ldefpackage/xb0;->d:Ljava/util/LinkedHashSet;

    .line 475
    .line 476
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 477
    .line 478
    .line 479
    move-result p0

    .line 480
    if-eqz p0, :cond_a

    .line 481
    .line 482
    invoke-virtual {v0}, Ldefpackage/xb0;->d()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    .line 483
    .line 484
    .line 485
    goto :goto_a

    .line 486
    :catchall_3
    move-exception p0

    .line 487
    goto :goto_b

    .line 488
    :cond_a
    :goto_a
    monitor-exit v1

    .line 489
    sget-object p0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 490
    .line 491
    return-object p0

    .line 492
    :goto_b
    monitor-exit v1

    .line 493
    throw p0

    .line 494
    nop

    .line 495
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
