.class public final Lel0;
.super Lkp;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public A:I

.field public B:J

.field public C:J

.field public final r:Z

.field public final s:I

.field public final t:I

.field public final u:Lqr2;

.field public final v:Lqr2;

.field public w:Lii0;

.field public x:Ljava/net/HttpURLConnection;

.field public y:Ljava/io/InputStream;

.field public z:Z


# direct methods
.method public constructor <init>(IIZLqr2;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lkp;-><init>(Z)V

    .line 3
    .line 4
    .line 5
    iput p1, p0, Lel0;->s:I

    .line 6
    .line 7
    iput p2, p0, Lel0;->t:I

    .line 8
    .line 9
    iput-boolean p3, p0, Lel0;->r:Z

    .line 10
    .line 11
    iput-object p4, p0, Lel0;->u:Lqr2;

    .line 12
    .line 13
    new-instance p1, Lqr2;

    .line 14
    .line 15
    const/16 p2, 0xa

    .line 16
    .line 17
    invoke-direct {p1, p2}, Lqr2;-><init>(I)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lel0;->v:Lqr2;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final b(Lii0;)J
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iput-object v0, v1, Lel0;->w:Lii0;

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    iput-wide v2, v1, Lel0;->C:J

    .line 10
    .line 11
    iput-wide v2, v1, Lel0;->B:J

    .line 12
    .line 13
    invoke-virtual/range {p0 .. p1}, Lkp;->q(Lii0;)V

    .line 14
    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-virtual {v5}, Ljava/lang/Thread;->getId()J

    .line 22
    .line 23
    .line 24
    move-result-wide v5

    .line 25
    long-to-int v5, v5

    .line 26
    invoke-static {v5}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual/range {p0 .. p1}, Lel0;->u(Lii0;)Ljava/net/HttpURLConnection;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    iget-wide v6, v0, Lii0;->g:J

    .line 34
    .line 35
    iget-wide v8, v0, Lii0;->f:J

    .line 36
    .line 37
    iput-object v5, v1, Lel0;->x:Ljava/net/HttpURLConnection;

    .line 38
    .line 39
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 40
    .line 41
    .line 42
    move-result v10

    .line 43
    iput v10, v1, Lel0;->A:I

    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_6

    .line 46
    .line 47
    .line 48
    iget v10, v1, Lel0;->A:I

    .line 49
    .line 50
    const-string v11, "Content-Range"

    .line 51
    .line 52
    const/16 v12, 0xc8

    .line 53
    .line 54
    const-wide/16 v13, -0x1

    .line 55
    .line 56
    if-lt v10, v12, :cond_0

    .line 57
    .line 58
    const/16 v15, 0x12b

    .line 59
    .line 60
    if-le v10, v15, :cond_1

    .line 61
    .line 62
    :cond_0
    move-wide/from16 v16, v2

    .line 63
    .line 64
    move-object v12, v5

    .line 65
    move-wide/from16 v18, v13

    .line 66
    .line 67
    goto/16 :goto_7

    .line 68
    .line 69
    :cond_1
    invoke-virtual {v5}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    iget v10, v1, Lel0;->A:I

    .line 73
    .line 74
    if-ne v10, v12, :cond_2

    .line 75
    .line 76
    cmp-long v10, v8, v2

    .line 77
    .line 78
    if-eqz v10, :cond_2

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_2
    move-wide v8, v2

    .line 82
    :goto_0
    const-string v10, "Content-Encoding"

    .line 83
    .line 84
    invoke-virtual {v5, v10}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    const-string v12, "gzip"

    .line 89
    .line 90
    invoke-virtual {v12, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    if-nez v10, :cond_9

    .line 95
    .line 96
    cmp-long v12, v6, v13

    .line 97
    .line 98
    if-eqz v12, :cond_3

    .line 99
    .line 100
    iput-wide v6, v1, Lel0;->B:J

    .line 101
    .line 102
    move-object v12, v5

    .line 103
    goto/16 :goto_4

    .line 104
    .line 105
    :cond_3
    const-string v6, "Content-Length"

    .line 106
    .line 107
    invoke-virtual {v5, v6}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-virtual {v5, v11}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    sget-object v11, Lir1;->a:Ljava/util/regex/Pattern;

    .line 116
    .line 117
    const-string v11, "Inconsistent headers ["

    .line 118
    .line 119
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 120
    .line 121
    .line 122
    move-result v12

    .line 123
    const-string v15, "]"

    .line 124
    .line 125
    move-wide/from16 v16, v2

    .line 126
    .line 127
    const-string v2, "HttpUtil"

    .line 128
    .line 129
    if-nez v12, :cond_4

    .line 130
    .line 131
    :try_start_1
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 132
    .line 133
    .line 134
    move-result-wide v18
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 135
    move-wide/from16 v24, v18

    .line 136
    .line 137
    move-wide/from16 v18, v13

    .line 138
    .line 139
    move-wide/from16 v13, v24

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :catch_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v12, "Unexpected Content-Length ["

    .line 145
    .line 146
    invoke-direct {v3, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v3

    .line 159
    invoke-static {v2, v3}, Ll93;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    :cond_4
    move-wide/from16 v18, v13

    .line 163
    .line 164
    :goto_1
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    if-nez v3, :cond_6

    .line 169
    .line 170
    sget-object v3, Lir1;->a:Ljava/util/regex/Pattern;

    .line 171
    .line 172
    invoke-virtual {v3, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    .line 177
    .line 178
    .line 179
    move-result v12

    .line 180
    if-eqz v12, :cond_6

    .line 181
    .line 182
    const/4 v12, 0x2

    .line 183
    :try_start_2
    invoke-virtual {v3, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v12

    .line 187
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-static {v12}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 191
    .line 192
    .line 193
    move-result-wide v20

    .line 194
    invoke-virtual {v3, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 202
    .line 203
    .line 204
    move-result-wide v22
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 205
    sub-long v20, v20, v22

    .line 206
    .line 207
    const-wide/16 v22, 0x1

    .line 208
    .line 209
    move-object v12, v5

    .line 210
    add-long v4, v20, v22

    .line 211
    .line 212
    cmp-long v16, v13, v16

    .line 213
    .line 214
    if-gez v16, :cond_5

    .line 215
    .line 216
    move-wide v13, v4

    .line 217
    goto :goto_2

    .line 218
    :cond_5
    cmp-long v16, v13, v4

    .line 219
    .line 220
    if-eqz v16, :cond_7

    .line 221
    .line 222
    :try_start_3
    new-instance v3, Ljava/lang/StringBuilder;

    .line 223
    .line 224
    invoke-direct {v3, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    const-string v6, "] ["

    .line 231
    .line 232
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    invoke-static {v2, v3}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-static {v13, v14, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 249
    .line 250
    .line 251
    move-result-wide v13
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_2

    .line 252
    goto :goto_2

    .line 253
    :catch_1
    move-object v12, v5

    .line 254
    :catch_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 255
    .line 256
    const-string v4, "Unexpected Content-Range ["

    .line 257
    .line 258
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {v3, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    invoke-static {v2, v3}, Ll93;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    .line 273
    .line 274
    goto :goto_2

    .line 275
    :cond_6
    move-object v12, v5

    .line 276
    :cond_7
    :goto_2
    cmp-long v2, v13, v18

    .line 277
    .line 278
    if-eqz v2, :cond_8

    .line 279
    .line 280
    sub-long/2addr v13, v8

    .line 281
    goto :goto_3

    .line 282
    :cond_8
    move-wide/from16 v13, v18

    .line 283
    .line 284
    :goto_3
    iput-wide v13, v1, Lel0;->B:J

    .line 285
    .line 286
    goto :goto_4

    .line 287
    :cond_9
    move-object v12, v5

    .line 288
    iput-wide v6, v1, Lel0;->B:J

    .line 289
    .line 290
    :goto_4
    const/16 v2, 0x7d0

    .line 291
    .line 292
    :try_start_4
    invoke-virtual {v12}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    iput-object v3, v1, Lel0;->y:Ljava/io/InputStream;

    .line 297
    .line 298
    if-eqz v10, :cond_a

    .line 299
    .line 300
    new-instance v3, Ljava/util/zip/GZIPInputStream;

    .line 301
    .line 302
    iget-object v4, v1, Lel0;->y:Ljava/io/InputStream;

    .line 303
    .line 304
    invoke-direct {v3, v4}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    .line 305
    .line 306
    .line 307
    iput-object v3, v1, Lel0;->y:Ljava/io/InputStream;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 308
    .line 309
    :cond_a
    const/4 v3, 0x1

    .line 310
    goto :goto_5

    .line 311
    :catch_3
    move-exception v0

    .line 312
    const/4 v3, 0x1

    .line 313
    goto :goto_6

    .line 314
    :goto_5
    iput-boolean v3, v1, Lel0;->z:Z

    .line 315
    .line 316
    invoke-virtual/range {p0 .. p1}, Lkp;->r(Lii0;)V

    .line 317
    .line 318
    .line 319
    :try_start_5
    invoke-virtual {v1, v8, v9}, Lel0;->w(J)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 320
    .line 321
    .line 322
    iget-wide v0, v1, Lel0;->B:J

    .line 323
    .line 324
    return-wide v0

    .line 325
    :catch_4
    move-exception v0

    .line 326
    invoke-virtual {v1}, Lel0;->s()V

    .line 327
    .line 328
    .line 329
    instance-of v1, v0, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;

    .line 330
    .line 331
    if-eqz v1, :cond_b

    .line 332
    .line 333
    check-cast v0, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;

    .line 334
    .line 335
    throw v0

    .line 336
    :cond_b
    new-instance v1, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;

    .line 337
    .line 338
    const/4 v3, 0x1

    .line 339
    invoke-direct {v1, v0, v2, v3}, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;-><init>(Ljava/io/IOException;II)V

    .line 340
    .line 341
    .line 342
    throw v1

    .line 343
    :goto_6
    invoke-virtual {v1}, Lel0;->s()V

    .line 344
    .line 345
    .line 346
    new-instance v1, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;

    .line 347
    .line 348
    invoke-direct {v1, v0, v2, v3}, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;-><init>(Ljava/io/IOException;II)V

    .line 349
    .line 350
    .line 351
    throw v1

    .line 352
    :goto_7
    invoke-virtual {v12}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    iget v4, v1, Lel0;->A:I

    .line 357
    .line 358
    const/16 v5, 0x1a0

    .line 359
    .line 360
    if-ne v4, v5, :cond_f

    .line 361
    .line 362
    invoke-virtual {v12, v11}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    sget-object v10, Lir1;->a:Ljava/util/regex/Pattern;

    .line 367
    .line 368
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 369
    .line 370
    .line 371
    move-result v10

    .line 372
    if-eqz v10, :cond_c

    .line 373
    .line 374
    move-wide/from16 v10, v18

    .line 375
    .line 376
    const/4 v3, 0x1

    .line 377
    goto :goto_8

    .line 378
    :cond_c
    sget-object v10, Lir1;->b:Ljava/util/regex/Pattern;

    .line 379
    .line 380
    invoke-virtual {v10, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 381
    .line 382
    .line 383
    move-result-object v4

    .line 384
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->matches()Z

    .line 385
    .line 386
    .line 387
    move-result v10

    .line 388
    const/4 v3, 0x1

    .line 389
    if-eqz v10, :cond_d

    .line 390
    .line 391
    invoke-virtual {v4, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v4

    .line 395
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 399
    .line 400
    .line 401
    move-result-wide v10

    .line 402
    goto :goto_8

    .line 403
    :cond_d
    move-wide/from16 v10, v18

    .line 404
    .line 405
    :goto_8
    cmp-long v4, v8, v10

    .line 406
    .line 407
    if-nez v4, :cond_f

    .line 408
    .line 409
    iput-boolean v3, v1, Lel0;->z:Z

    .line 410
    .line 411
    invoke-virtual/range {p0 .. p1}, Lkp;->r(Lii0;)V

    .line 412
    .line 413
    .line 414
    cmp-long v0, v6, v18

    .line 415
    .line 416
    if-eqz v0, :cond_e

    .line 417
    .line 418
    return-wide v6

    .line 419
    :cond_e
    return-wide v16

    .line 420
    :cond_f
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    if-eqz v0, :cond_10

    .line 425
    .line 426
    :try_start_6
    invoke-static {v0}, Lxw;->b(Ljava/io/InputStream;)[B

    .line 427
    .line 428
    .line 429
    goto :goto_9

    .line 430
    :cond_10
    sget-object v0, Lf35;->a:Ljava/lang/String;
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_5

    .line 431
    .line 432
    goto :goto_9

    .line 433
    :catch_5
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 434
    .line 435
    :goto_9
    invoke-virtual {v1}, Lel0;->s()V

    .line 436
    .line 437
    .line 438
    iget v0, v1, Lel0;->A:I

    .line 439
    .line 440
    if-ne v0, v5, :cond_11

    .line 441
    .line 442
    new-instance v0, Landroidx/media3/datasource/DataSourceException;

    .line 443
    .line 444
    const/16 v3, 0x7d8

    .line 445
    .line 446
    invoke-direct {v0, v3}, Landroidx/media3/datasource/DataSourceException;-><init>(I)V

    .line 447
    .line 448
    .line 449
    goto :goto_a

    .line 450
    :cond_11
    const/4 v0, 0x0

    .line 451
    :goto_a
    new-instance v3, Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException;

    .line 452
    .line 453
    iget v1, v1, Lel0;->A:I

    .line 454
    .line 455
    invoke-direct {v3, v1, v0, v2}, Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException;-><init>(ILandroidx/media3/datasource/DataSourceException;Ljava/util/Map;)V

    .line 456
    .line 457
    .line 458
    throw v3

    .line 459
    :catch_6
    move-exception v0

    .line 460
    invoke-virtual {v1}, Lel0;->s()V

    .line 461
    .line 462
    .line 463
    const/4 v3, 0x1

    .line 464
    invoke-static {v0, v3}, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;->a(Ljava/io/IOException;I)Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    throw v0
.end method

.method public final close()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    iget-object v2, p0, Lel0;->y:Ljava/io/InputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    :try_start_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception v2

    .line 12
    goto :goto_1

    .line 13
    :catch_0
    move-exception v2

    .line 14
    :try_start_2
    new-instance v3, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;

    .line 15
    .line 16
    sget-object v4, Lf35;->a:Ljava/lang/String;

    .line 17
    .line 18
    const/16 v4, 0x7d0

    .line 19
    .line 20
    const/4 v5, 0x3

    .line 21
    invoke-direct {v3, v2, v4, v5}, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;-><init>(Ljava/io/IOException;II)V

    .line 22
    .line 23
    .line 24
    throw v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 25
    :cond_0
    :goto_0
    iput-object v1, p0, Lel0;->y:Ljava/io/InputStream;

    .line 26
    .line 27
    invoke-virtual {p0}, Lel0;->s()V

    .line 28
    .line 29
    .line 30
    iget-boolean v2, p0, Lel0;->z:Z

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    iput-boolean v0, p0, Lel0;->z:Z

    .line 35
    .line 36
    invoke-virtual {p0}, Lkp;->p()V

    .line 37
    .line 38
    .line 39
    :cond_1
    iput-object v1, p0, Lel0;->x:Ljava/net/HttpURLConnection;

    .line 40
    .line 41
    iput-object v1, p0, Lel0;->w:Lii0;

    .line 42
    .line 43
    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :goto_1
    iput-object v1, p0, Lel0;->y:Ljava/io/InputStream;

    .line 48
    .line 49
    invoke-virtual {p0}, Lel0;->s()V

    .line 50
    .line 51
    .line 52
    iget-boolean v3, p0, Lel0;->z:Z

    .line 53
    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    iput-boolean v0, p0, Lel0;->z:Z

    .line 57
    .line 58
    invoke-virtual {p0}, Lkp;->p()V

    .line 59
    .line 60
    .line 61
    :cond_2
    iput-object v1, p0, Lel0;->x:Ljava/net/HttpURLConnection;

    .line 62
    .line 63
    iput-object v1, p0, Lel0;->w:Lii0;

    .line 64
    .line 65
    invoke-static {}, Landroid/net/TrafficStats;->clearThreadStatsTag()V

    .line 66
    .line 67
    .line 68
    throw v2
.end method

.method public final j()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object p0, p0, Lel0;->x:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Lly3;->t:Lly3;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance v0, Ldl0;

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/net/URLConnection;->getHeaderFields()Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-direct {v0, p0}, Ldl0;-><init>(Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final m()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lel0;->x:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/net/URL;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_0
    iget-object p0, p0, Lel0;->w:Lii0;

    .line 19
    .line 20
    if-eqz p0, :cond_1

    .line 21
    .line 22
    iget-object p0, p0, Lii0;->a:Landroid/net/Uri;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_1
    const/4 p0, 0x0

    .line 26
    return-object p0
.end method

.method public final read([BII)I
    .locals 6

    .line 1
    if-nez p3, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    :try_start_0
    iget-wide v0, p0, Lel0;->B:J

    .line 6
    .line 7
    const-wide/16 v2, -0x1

    .line 8
    .line 9
    cmp-long v2, v0, v2

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    iget-wide v4, p0, Lel0;->C:J

    .line 15
    .line 16
    sub-long/2addr v0, v4

    .line 17
    const-wide/16 v4, 0x0

    .line 18
    .line 19
    cmp-long v2, v0, v4

    .line 20
    .line 21
    if-nez v2, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    int-to-long v4, p3

    .line 25
    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    long-to-int p3, v0

    .line 30
    :cond_2
    iget-object v0, p0, Lel0;->y:Ljava/io/InputStream;

    .line 31
    .line 32
    sget-object v1, Lf35;->a:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-ne p1, v3, :cond_3

    .line 39
    .line 40
    :goto_0
    return v3

    .line 41
    :cond_3
    iget-wide p2, p0, Lel0;->C:J

    .line 42
    .line 43
    int-to-long v0, p1

    .line 44
    add-long/2addr p2, v0

    .line 45
    iput-wide p2, p0, Lel0;->C:J

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Lkp;->o(I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    return p1

    .line 51
    :catch_0
    move-exception p0

    .line 52
    sget-object p1, Lf35;->a:Ljava/lang/String;

    .line 53
    .line 54
    const/4 p1, 0x2

    .line 55
    invoke-static {p0, p1}, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;->a(Ljava/io/IOException;I)Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    throw p0
.end method

.method public final s()V
    .locals 2

    .line 1
    iget-object p0, p0, Lel0;->x:Ljava/net/HttpURLConnection;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :catch_0
    move-exception p0

    .line 10
    const-string v0, "DefaultHttpDataSource"

    .line 11
    .line 12
    const-string v1, "Unexpected error while disconnecting"

    .line 13
    .line 14
    invoke-static {v0, v1, p0}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final t(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;
    .locals 3

    .line 1
    const/16 v0, 0x7d1

    .line 2
    .line 3
    if-eqz p2, :cond_4

    .line 4
    .line 5
    :try_start_0
    new-instance v1, Ljava/net/URL;

    .line 6
    .line 7
    invoke-direct {v1, p1, p2}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    const-string v2, "https"

    .line 15
    .line 16
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    const-string v2, "http"

    .line 23
    .line 24
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance p0, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;

    .line 32
    .line 33
    const-string p1, "Unsupported protocol redirect: "

    .line 34
    .line 35
    invoke-static {p1, p2}, Lxa3;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-direct {p0, v0, p1}, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;-><init>(ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p0

    .line 43
    :cond_1
    :goto_0
    iget-boolean p0, p0, Lel0;->r:Z

    .line 44
    .line 45
    if-nez p0, :cond_3

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p2, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    if-eqz p0, :cond_2

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_2
    new-instance p0, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    new-instance v1, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    const-string v2, "Disallowed cross-protocol redirect ("

    .line 67
    .line 68
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string p1, " to "

    .line 75
    .line 76
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string p1, ")"

    .line 83
    .line 84
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-direct {p0, v0, p1}, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;-><init>(ILjava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p0

    .line 95
    :cond_3
    :goto_1
    return-object v1

    .line 96
    :catch_0
    move-exception p0

    .line 97
    new-instance p1, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;

    .line 98
    .line 99
    const/4 p2, 0x1

    .line 100
    invoke-direct {p1, p0, v0, p2}, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;-><init>(Ljava/io/IOException;II)V

    .line 101
    .line 102
    .line 103
    throw p1

    .line 104
    :cond_4
    new-instance p0, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;

    .line 105
    .line 106
    const-string p1, "Null location redirect"

    .line 107
    .line 108
    invoke-direct {p0, v0, p1}, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;-><init>(ILjava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p0
.end method

.method public final u(Lii0;)Ljava/net/HttpURLConnection;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v11, p1

    .line 4
    .line 5
    new-instance v1, Ljava/net/URL;

    .line 6
    .line 7
    iget-object v2, v11, Lii0;->a:Landroid/net/Uri;

    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget v2, v11, Lii0;->c:I

    .line 17
    .line 18
    iget-object v3, v11, Lii0;->d:[B

    .line 19
    .line 20
    iget-wide v4, v11, Lii0;->f:J

    .line 21
    .line 22
    iget-wide v6, v11, Lii0;->g:J

    .line 23
    .line 24
    iget v8, v11, Lii0;->i:I

    .line 25
    .line 26
    const/4 v12, 0x1

    .line 27
    and-int/2addr v8, v12

    .line 28
    const/4 v9, 0x0

    .line 29
    if-ne v8, v12, :cond_0

    .line 30
    .line 31
    move v8, v12

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v8, v9

    .line 34
    :goto_0
    iget-boolean v10, v0, Lel0;->r:Z

    .line 35
    .line 36
    if-nez v10, :cond_1

    .line 37
    .line 38
    const/4 v9, 0x1

    .line 39
    iget-object v10, v11, Lii0;->e:Ljava/util/Map;

    .line 40
    .line 41
    invoke-virtual/range {v0 .. v10}, Lel0;->v(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    return-object v0

    .line 46
    :cond_1
    :goto_1
    add-int/lit8 v13, v9, 0x1

    .line 47
    .line 48
    const/16 v0, 0x14

    .line 49
    .line 50
    if-gt v9, v0, :cond_7

    .line 51
    .line 52
    const/4 v9, 0x0

    .line 53
    iget-object v10, v11, Lii0;->e:Ljava/util/Map;

    .line 54
    .line 55
    move-object/from16 v0, p0

    .line 56
    .line 57
    invoke-virtual/range {v0 .. v10}, Lel0;->v(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 62
    .line 63
    .line 64
    move-result v10

    .line 65
    const-string v14, "Location"

    .line 66
    .line 67
    invoke-virtual {v9, v14}, Ljava/net/URLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v14

    .line 71
    const/16 v15, 0x12e

    .line 72
    .line 73
    if-eq v2, v12, :cond_2

    .line 74
    .line 75
    const/4 v12, 0x3

    .line 76
    if-ne v2, v12, :cond_3

    .line 77
    .line 78
    :cond_2
    const/16 v12, 0x12c

    .line 79
    .line 80
    if-eq v10, v12, :cond_6

    .line 81
    .line 82
    const/16 v12, 0x12d

    .line 83
    .line 84
    if-eq v10, v12, :cond_6

    .line 85
    .line 86
    if-eq v10, v15, :cond_6

    .line 87
    .line 88
    const/16 v12, 0x12f

    .line 89
    .line 90
    if-eq v10, v12, :cond_6

    .line 91
    .line 92
    const/16 v12, 0x133

    .line 93
    .line 94
    if-eq v10, v12, :cond_6

    .line 95
    .line 96
    const/16 v12, 0x134

    .line 97
    .line 98
    if-ne v10, v12, :cond_3

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_3
    const/4 v3, 0x2

    .line 102
    if-ne v2, v3, :cond_5

    .line 103
    .line 104
    const/16 v12, 0x12c

    .line 105
    .line 106
    if-eq v10, v12, :cond_4

    .line 107
    .line 108
    const/16 v12, 0x12d

    .line 109
    .line 110
    if-eq v10, v12, :cond_4

    .line 111
    .line 112
    if-eq v10, v15, :cond_4

    .line 113
    .line 114
    const/16 v12, 0x12f

    .line 115
    .line 116
    if-ne v10, v12, :cond_5

    .line 117
    .line 118
    :cond_4
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v1, v14}, Lel0;->t(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    const/4 v2, 0x0

    .line 126
    move-object v3, v2

    .line 127
    const/4 v2, 0x1

    .line 128
    goto :goto_3

    .line 129
    :cond_5
    return-object v9

    .line 130
    :cond_6
    :goto_2
    invoke-virtual {v9}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v1, v14}, Lel0;->t(Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    :goto_3
    move v9, v13

    .line 138
    const/4 v12, 0x1

    .line 139
    goto :goto_1

    .line 140
    :cond_7
    new-instance v0, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;

    .line 141
    .line 142
    new-instance v1, Ljava/net/NoRouteToHostException;

    .line 143
    .line 144
    const-string v2, "Too many redirects: "

    .line 145
    .line 146
    invoke-static {v13, v2}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-direct {v1, v2}, Ljava/net/NoRouteToHostException;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    const/16 v2, 0x7d1

    .line 154
    .line 155
    const/4 v3, 0x1

    .line 156
    invoke-direct {v0, v1, v2, v3}, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;-><init>(Ljava/io/IOException;II)V

    .line 157
    .line 158
    .line 159
    throw v0
.end method

.method public final v(Ljava/net/URL;I[BJJZZLjava/util/Map;)Ljava/net/HttpURLConnection;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/net/HttpURLConnection;

    .line 6
    .line 7
    iget v0, p0, Lel0;->s:I

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 10
    .line 11
    .line 12
    iget v0, p0, Lel0;->t:I

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 15
    .line 16
    .line 17
    new-instance v0, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lel0;->u:Lqr2;

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v1}, Lqr2;->n()Ljava/util/Map;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object p0, p0, Lel0;->v:Lqr2;

    .line 34
    .line 35
    invoke-virtual {p0}, Lqr2;->n()Ljava/util/Map;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p10}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result p10

    .line 57
    if-eqz p10, :cond_1

    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p10

    .line 63
    check-cast p10, Ljava/util/Map$Entry;

    .line 64
    .line 65
    invoke-interface {p10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Ljava/lang/String;

    .line 70
    .line 71
    invoke-interface {p10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p10

    .line 75
    check-cast p10, Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {p1, v0, p10}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    sget-object p0, Lir1;->a:Ljava/util/regex/Pattern;

    .line 82
    .line 83
    const-wide/16 v0, 0x0

    .line 84
    .line 85
    cmp-long p0, p4, v0

    .line 86
    .line 87
    const/4 p10, 0x0

    .line 88
    const-wide/16 v0, -0x1

    .line 89
    .line 90
    if-nez p0, :cond_2

    .line 91
    .line 92
    cmp-long p0, p6, v0

    .line 93
    .line 94
    if-nez p0, :cond_2

    .line 95
    .line 96
    move-object p0, p10

    .line 97
    goto :goto_1

    .line 98
    :cond_2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    const-string v2, "bytes="

    .line 101
    .line 102
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v2, "-"

    .line 109
    .line 110
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    cmp-long v0, p6, v0

    .line 114
    .line 115
    if-eqz v0, :cond_3

    .line 116
    .line 117
    add-long/2addr p4, p6

    .line 118
    const-wide/16 p6, 0x1

    .line 119
    .line 120
    sub-long/2addr p4, p6

    .line 121
    invoke-virtual {p0, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    :cond_3
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    :goto_1
    if-eqz p0, :cond_4

    .line 129
    .line 130
    const-string p4, "Range"

    .line 131
    .line 132
    invoke-virtual {p1, p4, p0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    :cond_4
    if-eqz p8, :cond_5

    .line 136
    .line 137
    const-string p0, "gzip"

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_5
    const-string p0, "identity"

    .line 141
    .line 142
    :goto_2
    const-string p4, "Accept-Encoding"

    .line 143
    .line 144
    invoke-virtual {p1, p4, p0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, p9}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 148
    .line 149
    .line 150
    const/4 p0, 0x1

    .line 151
    if-eqz p3, :cond_6

    .line 152
    .line 153
    move p4, p0

    .line 154
    goto :goto_3

    .line 155
    :cond_6
    const/4 p4, 0x0

    .line 156
    :goto_3
    invoke-virtual {p1, p4}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 157
    .line 158
    .line 159
    sget p4, Lii0;->j:I

    .line 160
    .line 161
    if-eq p2, p0, :cond_9

    .line 162
    .line 163
    const/4 p0, 0x2

    .line 164
    if-eq p2, p0, :cond_8

    .line 165
    .line 166
    const/4 p0, 0x3

    .line 167
    if-ne p2, p0, :cond_7

    .line 168
    .line 169
    const-string p0, "HEAD"

    .line 170
    .line 171
    goto :goto_4

    .line 172
    :cond_7
    invoke-static {}, Ltb4;->a()V

    .line 173
    .line 174
    .line 175
    return-object p10

    .line 176
    :cond_8
    const-string p0, "POST"

    .line 177
    .line 178
    goto :goto_4

    .line 179
    :cond_9
    const-string p0, "GET"

    .line 180
    .line 181
    :goto_4
    invoke-virtual {p1, p0}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    if-eqz p3, :cond_a

    .line 185
    .line 186
    array-length p0, p3

    .line 187
    invoke-virtual {p1, p0}, Ljava/net/HttpURLConnection;->setFixedLengthStreamingMode(I)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    invoke-virtual {p0, p3}, Ljava/io/OutputStream;->write([B)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V

    .line 201
    .line 202
    .line 203
    return-object p1

    .line 204
    :cond_a
    invoke-virtual {p1}, Ljava/net/URLConnection;->connect()V

    .line 205
    .line 206
    .line 207
    return-object p1
.end method

.method public final w(J)V
    .locals 6

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    const/16 v2, 0x1000

    .line 9
    .line 10
    new-array v2, v2, [B

    .line 11
    .line 12
    :goto_0
    cmp-long v3, p1, v0

    .line 13
    .line 14
    if-lez v3, :cond_3

    .line 15
    .line 16
    const-wide/16 v3, 0x1000

    .line 17
    .line 18
    invoke-static {p1, p2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    long-to-int v3, v3

    .line 23
    iget-object v4, p0, Lel0;->y:Ljava/io/InputStream;

    .line 24
    .line 25
    sget-object v5, Lf35;->a:Ljava/lang/String;

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    invoke-virtual {v4, v2, v5, v3}, Ljava/io/InputStream;->read([BII)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v4}, Ljava/lang/Thread;->isInterrupted()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-nez v4, :cond_2

    .line 41
    .line 42
    const/4 v4, -0x1

    .line 43
    if-eq v3, v4, :cond_1

    .line 44
    .line 45
    int-to-long v4, v3

    .line 46
    sub-long/2addr p1, v4

    .line 47
    invoke-virtual {p0, v3}, Lkp;->o(I)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    new-instance p0, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;

    .line 52
    .line 53
    invoke-direct {p0}, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;-><init>()V

    .line 54
    .line 55
    .line 56
    throw p0

    .line 57
    :cond_2
    new-instance p0, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;

    .line 58
    .line 59
    new-instance p1, Ljava/io/InterruptedIOException;

    .line 60
    .line 61
    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    .line 62
    .line 63
    .line 64
    const/16 p2, 0x7d0

    .line 65
    .line 66
    const/4 v0, 0x1

    .line 67
    invoke-direct {p0, p1, p2, v0}, Landroidx/media3/datasource/HttpDataSource$HttpDataSourceException;-><init>(Ljava/io/IOException;II)V

    .line 68
    .line 69
    .line 70
    throw p0

    .line 71
    :cond_3
    :goto_1
    return-void
.end method
