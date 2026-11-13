.class public abstract Ldefpackage/d25;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ldefpackage/ux3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/ux3;

    .line 2
    .line 3
    const-string v1, "[0-9a-f]{64}"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldefpackage/ux3;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ldefpackage/d25;->a:Ldefpackage/ux3;

    .line 9
    .line 10
    return-void
.end method

.method public static a(I[B)J
    .locals 8

    .line 1
    add-int/lit8 v0, p0, 0x7

    .line 2
    .line 3
    aget-byte v1, p1, v0

    .line 4
    .line 5
    and-int/lit8 v1, v1, 0x7f

    .line 6
    .line 7
    int-to-long v1, v1

    .line 8
    const/4 v3, 0x6

    .line 9
    :goto_0
    const/4 v4, -0x1

    .line 10
    if-ge v4, v3, :cond_0

    .line 11
    .line 12
    const/16 v4, 0x8

    .line 13
    .line 14
    shl-long/2addr v1, v4

    .line 15
    add-int v4, p0, v3

    .line 16
    .line 17
    aget-byte v4, p1, v4

    .line 18
    .line 19
    int-to-long v4, v4

    .line 20
    const-wide/16 v6, 0xff

    .line 21
    .line 22
    and-long/2addr v4, v6

    .line 23
    or-long/2addr v1, v4

    .line 24
    add-int/lit8 v3, v3, -0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    aget-byte p0, p1, v0

    .line 28
    .line 29
    and-int/lit16 p0, p0, 0x80

    .line 30
    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    return-wide v1

    .line 34
    :cond_1
    const-string p0, "Negative patch header"

    .line 35
    .line 36
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-wide/16 p0, 0x0

    .line 40
    .line 41
    return-wide p0
.end method

.method public static b(Ljava/io/File;Ljava/io/File;Ljava/io/File;Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;Lcom/eddyizm/tempus/homemusic/HubUpdateFile;)V
    .locals 16

    .line 1
    const-string v0, "apk"

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    invoke-static {v1, v0}, Ldefpackage/d25;->e(Lcom/eddyizm/tempus/homemusic/HubUpdateFile;Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_8

    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getSize()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    const-wide/32 v4, 0x2000000

    .line 16
    .line 17
    .line 18
    cmp-long v0, v2, v4

    .line 19
    .line 20
    if-gtz v0, :cond_8

    .line 21
    .line 22
    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->length()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    const-wide/16 v6, 0x1

    .line 27
    .line 28
    cmp-long v0, v6, v2

    .line 29
    .line 30
    if-gtz v0, :cond_7

    .line 31
    .line 32
    const-wide/32 v6, 0x2000001

    .line 33
    .line 34
    .line 35
    cmp-long v0, v2, v6

    .line 36
    .line 37
    if-gez v0, :cond_7

    .line 38
    .line 39
    invoke-static/range {p0 .. p0}, Ldefpackage/d25;->d(Ljava/io/File;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual/range {p3 .. p3}, Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;->getBaseSha256()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_7

    .line 52
    .line 53
    invoke-virtual/range {p1 .. p1}, Ljava/io/File;->length()J

    .line 54
    .line 55
    .line 56
    move-result-wide v2

    .line 57
    invoke-virtual/range {p3 .. p3}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getSize()J

    .line 58
    .line 59
    .line 60
    move-result-wide v6

    .line 61
    cmp-long v0, v2, v6

    .line 62
    .line 63
    if-nez v0, :cond_6

    .line 64
    .line 65
    invoke-virtual/range {p3 .. p3}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getSize()J

    .line 66
    .line 67
    .line 68
    move-result-wide v2

    .line 69
    const-wide/32 v6, 0x1000000

    .line 70
    .line 71
    .line 72
    cmp-long v0, v2, v6

    .line 73
    .line 74
    if-gtz v0, :cond_6

    .line 75
    .line 76
    invoke-static/range {p1 .. p1}, Ldefpackage/d25;->d(Ljava/io/File;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual/range {p3 .. p3}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getSha256()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_5

    .line 89
    .line 90
    invoke-static/range {p1 .. p1}, Ldefpackage/ji2;->F(Ljava/io/File;)[B

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getSize()J

    .line 95
    .line 96
    .line 97
    move-result-wide v2

    .line 98
    array-length v6, v0

    .line 99
    const/16 v7, 0x20

    .line 100
    .line 101
    if-lt v6, v7, :cond_4

    .line 102
    .line 103
    const/4 v6, 0x0

    .line 104
    const/16 v8, 0x8

    .line 105
    .line 106
    invoke-static {v0, v6, v8}, Ldefpackage/ti;->d0([BII)[B

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    const-string v9, "BSDIFF40"

    .line 111
    .line 112
    sget-object v10, Ldefpackage/w10;->a:Ljava/nio/charset/Charset;

    .line 113
    .line 114
    invoke-virtual {v9, v10}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    invoke-static {v6, v9}, Ljava/util/Arrays;->equals([B[B)Z

    .line 122
    .line 123
    .line 124
    move-result v6

    .line 125
    if-eqz v6, :cond_4

    .line 126
    .line 127
    invoke-static {v8, v0}, Ldefpackage/d25;->a(I[B)J

    .line 128
    .line 129
    .line 130
    move-result-wide v8

    .line 131
    const/16 v6, 0x10

    .line 132
    .line 133
    invoke-static {v6, v0}, Ldefpackage/d25;->a(I[B)J

    .line 134
    .line 135
    .line 136
    move-result-wide v10

    .line 137
    const/16 v6, 0x18

    .line 138
    .line 139
    invoke-static {v6, v0}, Ldefpackage/d25;->a(I[B)J

    .line 140
    .line 141
    .line 142
    move-result-wide v12

    .line 143
    const-wide/16 v14, 0x0

    .line 144
    .line 145
    cmp-long v6, v2, v14

    .line 146
    .line 147
    if-lez v6, :cond_3

    .line 148
    .line 149
    cmp-long v4, v2, v4

    .line 150
    .line 151
    if-gtz v4, :cond_3

    .line 152
    .line 153
    cmp-long v2, v12, v2

    .line 154
    .line 155
    if-nez v2, :cond_3

    .line 156
    .line 157
    const-wide/16 v2, 0x4

    .line 158
    .line 159
    cmp-long v4, v8, v2

    .line 160
    .line 161
    if-ltz v4, :cond_3

    .line 162
    .line 163
    cmp-long v4, v10, v2

    .line 164
    .line 165
    if-ltz v4, :cond_3

    .line 166
    .line 167
    array-length v4, v0

    .line 168
    int-to-long v4, v4

    .line 169
    const-wide/16 v12, 0x20

    .line 170
    .line 171
    sub-long/2addr v4, v12

    .line 172
    cmp-long v4, v8, v4

    .line 173
    .line 174
    if-gtz v4, :cond_3

    .line 175
    .line 176
    array-length v4, v0

    .line 177
    int-to-long v4, v4

    .line 178
    sub-long/2addr v4, v12

    .line 179
    sub-long/2addr v4, v8

    .line 180
    cmp-long v4, v10, v4

    .line 181
    .line 182
    if-gtz v4, :cond_3

    .line 183
    .line 184
    array-length v4, v0

    .line 185
    int-to-long v4, v4

    .line 186
    sub-long/2addr v4, v12

    .line 187
    sub-long/2addr v4, v8

    .line 188
    sub-long/2addr v4, v10

    .line 189
    cmp-long v2, v4, v2

    .line 190
    .line 191
    if-ltz v2, :cond_3

    .line 192
    .line 193
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    long-to-int v3, v8

    .line 198
    add-int/2addr v3, v7

    .line 199
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    long-to-int v5, v10

    .line 204
    add-int/2addr v3, v5

    .line 205
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    filled-new-array {v2, v4, v3}, [Ljava/lang/Integer;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-static {v2}, Ldefpackage/gb;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    if-eqz v3, :cond_1

    .line 226
    .line 227
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    check-cast v3, Ljava/lang/Number;

    .line 232
    .line 233
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 234
    .line 235
    .line 236
    move-result v3

    .line 237
    aget-byte v4, v0, v3

    .line 238
    .line 239
    const/16 v5, 0x42

    .line 240
    .line 241
    if-ne v4, v5, :cond_0

    .line 242
    .line 243
    add-int/lit8 v4, v3, 0x1

    .line 244
    .line 245
    aget-byte v4, v0, v4

    .line 246
    .line 247
    const/16 v5, 0x5a

    .line 248
    .line 249
    if-ne v4, v5, :cond_0

    .line 250
    .line 251
    add-int/lit8 v4, v3, 0x2

    .line 252
    .line 253
    aget-byte v4, v0, v4

    .line 254
    .line 255
    const/16 v5, 0x68

    .line 256
    .line 257
    if-ne v4, v5, :cond_0

    .line 258
    .line 259
    add-int/lit8 v3, v3, 0x3

    .line 260
    .line 261
    aget-byte v3, v0, v3

    .line 262
    .line 263
    const/16 v4, 0x31

    .line 264
    .line 265
    if-gt v4, v3, :cond_0

    .line 266
    .line 267
    const/16 v4, 0x3a

    .line 268
    .line 269
    if-ge v3, v4, :cond_0

    .line 270
    .line 271
    goto :goto_0

    .line 272
    :cond_0
    const-string v0, "Unsupported patch compression"

    .line 273
    .line 274
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    return-void

    .line 278
    :cond_1
    :try_start_0
    new-instance v2, Ljava/io/FileOutputStream;

    .line 279
    .line 280
    move-object/from16 v3, p2

    .line 281
    .line 282
    invoke-direct {v2, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 283
    .line 284
    .line 285
    :try_start_1
    invoke-static/range {p0 .. p0}, Ldefpackage/ji2;->F(Ljava/io/File;)[B

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    invoke-static {v4, v0, v2}, Ldefpackage/hw;->G([B[BLjava/io/FileOutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 290
    .line 291
    .line 292
    :try_start_2
    invoke-virtual {v2}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 293
    .line 294
    .line 295
    invoke-virtual {v3}, Ljava/io/File;->length()J

    .line 296
    .line 297
    .line 298
    move-result-wide v4

    .line 299
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getSize()J

    .line 300
    .line 301
    .line 302
    move-result-wide v6

    .line 303
    cmp-long v0, v4, v6

    .line 304
    .line 305
    if-nez v0, :cond_2

    .line 306
    .line 307
    invoke-static {v3}, Ldefpackage/d25;->d(Ljava/io/File;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getSha256()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    if-eqz v0, :cond_2

    .line 320
    .line 321
    return-void

    .line 322
    :cond_2
    const-string v0, "\u041f\u043e\u0432\u0440\u0435\u0436\u0434\u0451\u043d\u043d\u044b\u0439 APK"

    .line 323
    .line 324
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 325
    .line 326
    .line 327
    return-void

    .line 328
    :catchall_0
    move-exception v0

    .line 329
    move-object v1, v0

    .line 330
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 331
    :catchall_1
    move-exception v0

    .line 332
    :try_start_4
    invoke-static {v2, v1}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 333
    .line 334
    .line 335
    throw v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 336
    :catch_0
    move-exception v0

    .line 337
    new-instance v1, Ljava/io/IOException;

    .line 338
    .line 339
    const-string v2, "\u041e\u0431\u043d\u043e\u0432\u043b\u0435\u043d\u0438\u0435 \u043d\u0435 \u043f\u0440\u0438\u043c\u0435\u043d\u0438\u043b\u043e\u0441\u044c"

    .line 340
    .line 341
    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 342
    .line 343
    .line 344
    throw v1

    .line 345
    :catch_1
    move-exception v0

    .line 346
    throw v0

    .line 347
    :cond_3
    const-string v0, "Invalid patch sizes"

    .line 348
    .line 349
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    return-void

    .line 353
    :cond_4
    const-string v0, "Invalid patch header"

    .line 354
    .line 355
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    return-void

    .line 359
    :cond_5
    const-string v0, "\u041a\u043e\u043d\u0442\u0440\u043e\u043b\u044c\u043d\u0430\u044f \u0441\u0443\u043c\u043c\u0430 \u043d\u0435 \u0441\u043e\u0432\u043f\u0430\u043b\u0430"

    .line 360
    .line 361
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    return-void

    .line 365
    :cond_6
    const-string v0, "\u041d\u0435\u0432\u0435\u0440\u043d\u044b\u0439 \u0440\u0430\u0437\u043c\u0435\u0440 \u043e\u0431\u043d\u043e\u0432\u043b\u0435\u043d\u0438\u044f"

    .line 366
    .line 367
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    return-void

    .line 371
    :cond_7
    const-string v0, "\u0411\u0430\u0437\u0430 \u043e\u0431\u043d\u043e\u0432\u043b\u0435\u043d\u0438\u044f \u0438\u0437\u043c\u0435\u043d\u0438\u043b\u0430\u0441\u044c"

    .line 372
    .line 373
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    return-void

    .line 377
    :cond_8
    const-string v0, "Invalid target description"

    .line 378
    .line 379
    invoke-static {v0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    return-void
.end method

.method public static c(Lcom/eddyizm/tempus/homemusic/HubAppRelease;Ljava/lang/String;)Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getFull()Lcom/eddyizm/tempus/homemusic/HubUpdateFile;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "apk"

    .line 6
    .line 7
    invoke-static {v0, v1}, Ldefpackage/d25;->e(Lcom/eddyizm/tempus/homemusic/HubUpdateFile;Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_8

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getSize()J

    .line 18
    .line 19
    .line 20
    move-result-wide v3

    .line 21
    const-wide/32 v5, 0x2000000

    .line 22
    .line 23
    .line 24
    cmp-long v1, v3, v5

    .line 25
    .line 26
    if-lez v1, :cond_0

    .line 27
    .line 28
    goto/16 :goto_2

    .line 29
    .line 30
    :cond_0
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->getPatches()Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-nez p0, :cond_1

    .line 35
    .line 36
    sget-object p0, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 37
    .line 38
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    :cond_2
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eqz v3, :cond_3

    .line 52
    .line 53
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    move-object v4, v3

    .line 58
    check-cast v4, Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;

    .line 59
    .line 60
    invoke-virtual {v4}, Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;->getFormat()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    const-string v6, "bsdiff40-v1"

    .line 65
    .line 66
    invoke-static {v5, v6}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    if-eqz v5, :cond_2

    .line 71
    .line 72
    invoke-virtual {v4}, Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;->getBaseVersionCode()J

    .line 73
    .line 74
    .line 75
    move-result-wide v5

    .line 76
    const-wide/16 v7, 0x2b

    .line 77
    .line 78
    cmp-long v5, v5, v7

    .line 79
    .line 80
    if-nez v5, :cond_2

    .line 81
    .line 82
    invoke-virtual {v4}, Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;->getBaseSha256()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-static {v5, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-eqz v5, :cond_2

    .line 91
    .line 92
    const-string v5, "patch"

    .line 93
    .line 94
    invoke-static {v4, v5}, Ldefpackage/d25;->e(Lcom/eddyizm/tempus/homemusic/HubUpdateFile;Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-eqz v5, :cond_2

    .line 99
    .line 100
    invoke-virtual {v4}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getSize()J

    .line 101
    .line 102
    .line 103
    move-result-wide v4

    .line 104
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getSize()J

    .line 105
    .line 106
    .line 107
    move-result-wide v6

    .line 108
    cmp-long v4, v4, v6

    .line 109
    .line 110
    if-gez v4, :cond_2

    .line 111
    .line 112
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    if-nez p1, :cond_4

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    if-nez p1, :cond_5

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_5
    move-object p1, v2

    .line 139
    check-cast p1, Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;

    .line 140
    .line 141
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getSize()J

    .line 142
    .line 143
    .line 144
    move-result-wide v0

    .line 145
    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    move-object v3, p1

    .line 150
    check-cast v3, Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;

    .line 151
    .line 152
    invoke-virtual {v3}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getSize()J

    .line 153
    .line 154
    .line 155
    move-result-wide v3

    .line 156
    cmp-long v5, v0, v3

    .line 157
    .line 158
    if-lez v5, :cond_7

    .line 159
    .line 160
    move-object v2, p1

    .line 161
    move-wide v0, v3

    .line 162
    :cond_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    if-nez p1, :cond_6

    .line 167
    .line 168
    :goto_1
    check-cast v2, Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;

    .line 169
    .line 170
    :cond_8
    :goto_2
    return-object v2
.end method

.method public static d(Ljava/io/File;)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v0, "SHA-256"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/io/FileInputStream;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 10
    .line 11
    .line 12
    const/high16 p0, 0x10000

    .line 13
    .line 14
    :try_start_0
    new-array p0, p0, [B

    .line 15
    .line 16
    :goto_0
    invoke-virtual {v1, p0}, Ljava/io/FileInputStream;->read([B)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    if-ltz v2, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0, p0, v3, v2}, Ljava/security/MessageDigest;->update([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_2

    .line 29
    :cond_0
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v1, ""

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 47
    .line 48
    .line 49
    array-length v2, p0

    .line 50
    move v4, v3

    .line 51
    :goto_1
    if-ge v3, v2, :cond_2

    .line 52
    .line 53
    aget-byte v5, p0, v3

    .line 54
    .line 55
    const/4 v6, 0x1

    .line 56
    add-int/2addr v4, v6

    .line 57
    if-le v4, v6, :cond_1

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 60
    .line 61
    .line 62
    :cond_1
    invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    const-string v6, "%02x"

    .line 75
    .line 76
    invoke-static {v6, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 81
    .line 82
    .line 83
    add-int/lit8 v3, v3, 0x1

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    :goto_2
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 95
    :catchall_1
    move-exception v0

    .line 96
    invoke-static {v1, p0}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    throw v0
.end method

.method public static e(Lcom/eddyizm/tempus/homemusic/HubUpdateFile;Ljava/lang/String;)Z
    .locals 5

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getSize()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    cmp-long v0, v0, v2

    .line 10
    .line 11
    if-lez v0, :cond_5

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getSize()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    const-string v2, "apk"

    .line 18
    .line 19
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    const-wide/32 v3, 0x8000000

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-wide/32 v3, 0x1000000

    .line 30
    .line 31
    .line 32
    :goto_0
    cmp-long v0, v0, v3

    .line 33
    .line 34
    if-lez v0, :cond_1

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getSha256()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    sget-object v1, Ldefpackage/d25;->a:Ldefpackage/ux3;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Ldefpackage/ux3;->a(Ljava/lang/String;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_3

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_3
    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_4
    const-string v2, "bsdiff"

    .line 61
    .line 62
    :goto_1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/HubUpdateFile;->getUrl()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    const-string v1, "-"

    .line 67
    .line 68
    const-string v3, "."

    .line 69
    .line 70
    const-string v4, "/app/artifacts/"

    .line 71
    .line 72
    invoke-static {v4, p1, v1, v0, v3}, Ldefpackage/b11;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p0, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    return p0

    .line 88
    :cond_5
    :goto_2
    const/4 p0, 0x0

    .line 89
    return p0
.end method
