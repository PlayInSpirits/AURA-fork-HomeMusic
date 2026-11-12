.class public final Lf25;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final c:Ljava/util/List;

.field public static final d:Lhu2;


# instance fields
.field public final a:Lo83;

.field public final b:Lrp4;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "urn:schemas-upnp-org:device:MediaRenderer:1"

    .line 2
    .line 3
    const-string v1, "urn:schemas-upnp-org:service:AVTransport:1"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lgb;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lf25;->c:Ljava/util/List;

    .line 14
    .line 15
    const-string v0, "text/xml; charset=utf-8"

    .line 16
    .line 17
    invoke-static {v0}, Lve5;->a(Ljava/lang/String;)Lhu2;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lf25;->d:Lhu2;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    new-instance v0, Ln83;

    .line 2
    .line 3
    invoke-direct {v0}, Ln83;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, 0x5

    .line 7
    .line 8
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2, v3}, Ln83;->b(JLjava/util/concurrent/TimeUnit;)V

    .line 11
    .line 12
    .line 13
    const-wide/16 v1, 0x3c

    .line 14
    .line 15
    invoke-static {v1, v2, v3}, Lze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iput v1, v0, Ln83;->z:I

    .line 20
    .line 21
    const-wide/16 v1, 0xa

    .line 22
    .line 23
    invoke-static {v1, v2, v3}, Lze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    iput v1, v0, Ln83;->A:I

    .line 28
    .line 29
    new-instance v1, Lo83;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Lo83;-><init>(Ln83;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lf25;->a:Lo83;

    .line 38
    .line 39
    new-instance v0, Le25;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-direct {v0, v1, p0}, Le25;-><init>(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance v1, Lrp4;

    .line 46
    .line 47
    invoke-direct {v1, v0}, Lrp4;-><init>(Lgf1;)V

    .line 48
    .line 49
    .line 50
    iput-object v1, p0, Lf25;->b:Lrp4;

    .line 51
    .line 52
    return-void
.end method

.method public static a(Lf25;)Ljava/util/List;
    .locals 26

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v1, "UpnpControlPoint"

    .line 5
    .line 6
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    :try_start_0
    new-instance v4, Ljava/net/DatagramSocket;

    .line 13
    .line 14
    invoke-direct {v4}, Ljava/net/DatagramSocket;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 15
    .line 16
    .line 17
    :try_start_1
    const-string v0, "239.255.255.250"

    .line 18
    .line 19
    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sget-object v5, Lf25;->c:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    if-eqz v6, :cond_0

    .line 34
    .line 35
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    check-cast v6, Ljava/lang/String;

    .line 40
    .line 41
    new-instance v7, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v8, "M-SEARCH * HTTP/1.1\r\nHOST: 239.255.255.250:1900\r\nMAN: \"ssdp:discover\"\r\nMX: 2\r\nST: "

    .line 47
    .line 48
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v6, "\r\n\r\n"

    .line 55
    .line 56
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    sget-object v7, Lw10;->a:Ljava/nio/charset/Charset;

    .line 64
    .line 65
    invoke-virtual {v6, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    new-instance v7, Ljava/net/DatagramPacket;

    .line 73
    .line 74
    array-length v8, v6

    .line 75
    new-instance v9, Ljava/net/InetSocketAddress;

    .line 76
    .line 77
    const/16 v10, 0x76c

    .line 78
    .line 79
    invoke-direct {v9, v0, v10}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 80
    .line 81
    .line 82
    invoke-direct {v7, v6, v8, v9}, Ljava/net/DatagramPacket;-><init>([BILjava/net/SocketAddress;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, v7}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :catchall_0
    move-exception v0

    .line 90
    goto :goto_4

    .line 91
    :catch_0
    move-exception v0

    .line 92
    goto :goto_3

    .line 93
    :cond_0
    const/16 v0, 0x2000

    .line 94
    .line 95
    new-array v5, v0, [B

    .line 96
    .line 97
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 98
    .line 99
    .line 100
    move-result-wide v6

    .line 101
    const-wide/16 v12, 0xbb8

    .line 102
    .line 103
    add-long/2addr v6, v12

    .line 104
    :cond_1
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 105
    .line 106
    .line 107
    move-result-wide v8

    .line 108
    cmp-long v8, v8, v6

    .line 109
    .line 110
    if-gez v8, :cond_2

    .line 111
    .line 112
    new-instance v14, Ljava/net/DatagramPacket;

    .line 113
    .line 114
    invoke-direct {v14, v5, v0}, Ljava/net/DatagramPacket;-><init>([BI)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 115
    .line 116
    .line 117
    :try_start_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 118
    .line 119
    .line 120
    move-result-wide v8

    .line 121
    sub-long v8, v6, v8

    .line 122
    .line 123
    const-wide/16 v10, 0x1

    .line 124
    .line 125
    invoke-static/range {v8 .. v13}, Lgb;->n(JJJ)J

    .line 126
    .line 127
    .line 128
    move-result-wide v8

    .line 129
    long-to-int v8, v8

    .line 130
    invoke-virtual {v4, v8}, Ljava/net/DatagramSocket;->setSoTimeout(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v4, v14}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 134
    .line 135
    .line 136
    :try_start_3
    invoke-virtual {v14}, Ljava/net/DatagramPacket;->getData()[B

    .line 137
    .line 138
    .line 139
    move-result-object v8

    .line 140
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v14}, Ljava/net/DatagramPacket;->getLength()I

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    new-instance v10, Ljava/lang/String;

    .line 148
    .line 149
    sget-object v11, Lw10;->a:Ljava/nio/charset/Charset;

    .line 150
    .line 151
    invoke-direct {v10, v8, v3, v9, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 152
    .line 153
    .line 154
    invoke-static {v10}, Lud3;->Z(Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    if-eqz v8, :cond_1

    .line 159
    .line 160
    invoke-interface {v2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :catch_1
    :cond_2
    :goto_2
    invoke-virtual {v4}, Ljava/net/DatagramSocket;->close()V

    .line 165
    .line 166
    .line 167
    goto :goto_5

    .line 168
    :goto_3
    :try_start_4
    const-string v5, "search failed"

    .line 169
    .line 170
    invoke-static {v1, v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 171
    .line 172
    .line 173
    goto :goto_2

    .line 174
    :goto_4
    invoke-virtual {v4}, Ljava/net/DatagramSocket;->close()V

    .line 175
    .line 176
    .line 177
    throw v0

    .line 178
    :catch_2
    move-exception v0

    .line 179
    const-string v4, "cannot open a socket to search"

    .line 180
    .line 181
    invoke-static {v1, v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 182
    .line 183
    .line 184
    :goto_5
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    sget-object v1, Lu01;->n:Lu01;

    .line 189
    .line 190
    if-eqz v0, :cond_3

    .line 191
    .line 192
    goto/16 :goto_1a

    .line 193
    .line 194
    :cond_3
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    const/16 v4, 0x8

    .line 199
    .line 200
    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    :try_start_5
    new-instance v0, Ljava/util/ArrayList;

    .line 209
    .line 210
    const/16 v5, 0xa

    .line 211
    .line 212
    invoke-static {v2, v5}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 213
    .line 214
    .line 215
    move-result v6

    .line 216
    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 217
    .line 218
    .line 219
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result v6

    .line 227
    if-eqz v6, :cond_4

    .line 228
    .line 229
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v6

    .line 233
    check-cast v6, Ljava/lang/String;

    .line 234
    .line 235
    new-instance v7, Lei0;

    .line 236
    .line 237
    const/4 v8, 0x3

    .line 238
    move-object/from16 v9, p0

    .line 239
    .line 240
    invoke-direct {v7, v8, v6, v9}, Lei0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    goto :goto_6

    .line 247
    :catchall_1
    move-exception v0

    .line 248
    goto/16 :goto_1b

    .line 249
    .line 250
    :cond_4
    invoke-interface {v4, v0}, Ljava/util/concurrent/ExecutorService;->invokeAll(Ljava/util/Collection;)Ljava/util/List;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    new-instance v2, Ljava/util/ArrayList;

    .line 258
    .line 259
    invoke-static {v0, v5}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 260
    .line 261
    .line 262
    move-result v5

    .line 263
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 264
    .line 265
    .line 266
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 271
    .line 272
    .line 273
    move-result v5

    .line 274
    if-eqz v5, :cond_5

    .line 275
    .line 276
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    check-cast v5, Ljava/util/concurrent/Future;

    .line 281
    .line 282
    invoke-interface {v5}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v5

    .line 286
    check-cast v5, Lkd3;

    .line 287
    .line 288
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 289
    .line 290
    .line 291
    goto :goto_7

    .line 292
    :cond_5
    invoke-interface {v4}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 293
    .line 294
    .line 295
    new-instance v4, Ljava/util/ArrayList;

    .line 296
    .line 297
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 298
    .line 299
    .line 300
    new-instance v5, Ljava/util/HashSet;

    .line 301
    .line 302
    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 306
    .line 307
    .line 308
    move-result v6

    .line 309
    move v0, v3

    .line 310
    :goto_8
    if-ge v0, v6, :cond_1c

    .line 311
    .line 312
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v7

    .line 316
    add-int/lit8 v8, v0, 0x1

    .line 317
    .line 318
    check-cast v7, Lkd3;

    .line 319
    .line 320
    iget-object v0, v7, Lkd3;->n:Ljava/lang/Object;

    .line 321
    .line 322
    move-object v15, v0

    .line 323
    check-cast v15, Ljava/lang/String;

    .line 324
    .line 325
    iget-object v0, v7, Lkd3;->o:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v0, Ljava/lang/String;

    .line 328
    .line 329
    if-eqz v0, :cond_1b

    .line 330
    .line 331
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    :try_start_6
    invoke-static {}, Ljavax/xml/parsers/DocumentBuilderFactory;->newInstance()Ljavax/xml/parsers/DocumentBuilderFactory;

    .line 335
    .line 336
    .line 337
    move-result-object v7

    .line 338
    invoke-virtual {v7, v3}, Ljavax/xml/parsers/DocumentBuilderFactory;->setNamespaceAware(Z)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v7}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;

    .line 342
    .line 343
    .line 344
    move-result-object v7

    .line 345
    new-instance v9, Lorg/xml/sax/InputSource;

    .line 346
    .line 347
    new-instance v10, Ljava/io/StringReader;

    .line 348
    .line 349
    invoke-direct {v10, v0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    invoke-direct {v9, v10}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/Reader;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v7, v9}, Ljavax/xml/parsers/DocumentBuilder;->parse(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-interface {v0}, Lorg/w3c/dom/Document;->getDocumentElement()Lorg/w3c/dom/Element;

    .line 360
    .line 361
    .line 362
    move-result-object v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    .line 363
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    const-string v7, "URLBase"

    .line 367
    .line 368
    invoke-static {v0, v7}, Lsu3;->p(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 369
    .line 370
    .line 371
    move-result-object v7

    .line 372
    invoke-static {v7}, Lq40;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v7

    .line 376
    check-cast v7, Lorg/w3c/dom/Element;

    .line 377
    .line 378
    const/16 v16, 0x0

    .line 379
    .line 380
    if-eqz v7, :cond_7

    .line 381
    .line 382
    invoke-interface {v7}, Lorg/w3c/dom/Node;->getTextContent()Ljava/lang/String;

    .line 383
    .line 384
    .line 385
    move-result-object v7

    .line 386
    if-eqz v7, :cond_7

    .line 387
    .line 388
    invoke-static {v7}, Lqm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 389
    .line 390
    .line 391
    move-result-object v7

    .line 392
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v7

    .line 396
    if-eqz v7, :cond_7

    .line 397
    .line 398
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 399
    .line 400
    .line 401
    move-result v9

    .line 402
    if-lez v9, :cond_6

    .line 403
    .line 404
    goto :goto_9

    .line 405
    :cond_6
    move-object/from16 v7, v16

    .line 406
    .line 407
    :goto_9
    if-eqz v7, :cond_7

    .line 408
    .line 409
    goto :goto_a

    .line 410
    :cond_7
    move-object v7, v15

    .line 411
    :goto_a
    new-instance v9, Ljava/util/ArrayList;

    .line 412
    .line 413
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 414
    .line 415
    .line 416
    const-string v10, "device"

    .line 417
    .line 418
    invoke-interface {v0, v10}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    invoke-interface {v0}, Lorg/w3c/dom/NodeList;->getLength()I

    .line 423
    .line 424
    .line 425
    move-result v10

    .line 426
    move v11, v3

    .line 427
    :goto_b
    if-ge v11, v10, :cond_17

    .line 428
    .line 429
    invoke-interface {v0, v11}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    .line 430
    .line 431
    .line 432
    move-result-object v12

    .line 433
    instance-of v13, v12, Lorg/w3c/dom/Element;

    .line 434
    .line 435
    if-eqz v13, :cond_8

    .line 436
    .line 437
    check-cast v12, Lorg/w3c/dom/Element;

    .line 438
    .line 439
    goto :goto_c

    .line 440
    :cond_8
    move-object/from16 v12, v16

    .line 441
    .line 442
    :goto_c
    if-nez v12, :cond_9

    .line 443
    .line 444
    move-object/from16 p0, v0

    .line 445
    .line 446
    move-object/from16 v18, v1

    .line 447
    .line 448
    move-object/from16 v19, v2

    .line 449
    .line 450
    move/from16 v17, v3

    .line 451
    .line 452
    move/from16 v22, v6

    .line 453
    .line 454
    move-object v0, v9

    .line 455
    move v1, v10

    .line 456
    move v3, v11

    .line 457
    goto/16 :goto_17

    .line 458
    .line 459
    :cond_9
    new-instance v14, Ljava/util/HashMap;

    .line 460
    .line 461
    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    .line 462
    .line 463
    .line 464
    const-string v13, "serviceList"

    .line 465
    .line 466
    invoke-static {v12, v13}, Lsu3;->p(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 467
    .line 468
    .line 469
    move-result-object v13

    .line 470
    new-instance v3, Ljava/util/ArrayList;

    .line 471
    .line 472
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 473
    .line 474
    .line 475
    move-object/from16 p0, v0

    .line 476
    .line 477
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 478
    .line 479
    .line 480
    move-result v0

    .line 481
    move-object/from16 v18, v1

    .line 482
    .line 483
    const/4 v1, 0x0

    .line 484
    :goto_d
    if-ge v1, v0, :cond_e

    .line 485
    .line 486
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v19

    .line 490
    add-int/lit8 v1, v1, 0x1

    .line 491
    .line 492
    check-cast v19, Lorg/w3c/dom/Element;

    .line 493
    .line 494
    move/from16 v20, v0

    .line 495
    .line 496
    new-instance v0, Ljava/util/ArrayList;

    .line 497
    .line 498
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 499
    .line 500
    .line 501
    move/from16 v21, v1

    .line 502
    .line 503
    invoke-interface/range {v19 .. v19}, Lorg/w3c/dom/Node;->getChildNodes()Lorg/w3c/dom/NodeList;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    move-object/from16 v19, v2

    .line 508
    .line 509
    invoke-interface {v1}, Lorg/w3c/dom/NodeList;->getLength()I

    .line 510
    .line 511
    .line 512
    move-result v2

    .line 513
    move/from16 v22, v6

    .line 514
    .line 515
    const/4 v6, 0x0

    .line 516
    :goto_e
    if-ge v6, v2, :cond_d

    .line 517
    .line 518
    move/from16 v23, v2

    .line 519
    .line 520
    invoke-interface {v1, v6}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    .line 521
    .line 522
    .line 523
    move-result-object v2

    .line 524
    move-object/from16 v24, v1

    .line 525
    .line 526
    instance-of v1, v2, Lorg/w3c/dom/Element;

    .line 527
    .line 528
    if-eqz v1, :cond_a

    .line 529
    .line 530
    check-cast v2, Lorg/w3c/dom/Element;

    .line 531
    .line 532
    goto :goto_f

    .line 533
    :cond_a
    move-object/from16 v2, v16

    .line 534
    .line 535
    :goto_f
    if-nez v2, :cond_b

    .line 536
    .line 537
    move/from16 v25, v6

    .line 538
    .line 539
    goto :goto_10

    .line 540
    :cond_b
    invoke-interface {v2}, Lorg/w3c/dom/Element;->getTagName()Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    move/from16 v25, v6

    .line 548
    .line 549
    const/16 v6, 0x3a

    .line 550
    .line 551
    invoke-static {v1, v6}, Lqm4;->E0(Ljava/lang/String;C)Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    const-string v6, "service"

    .line 556
    .line 557
    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    move-result v1

    .line 561
    if-eqz v1, :cond_c

    .line 562
    .line 563
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 564
    .line 565
    .line 566
    :cond_c
    :goto_10
    add-int/lit8 v6, v25, 0x1

    .line 567
    .line 568
    move/from16 v2, v23

    .line 569
    .line 570
    move-object/from16 v1, v24

    .line 571
    .line 572
    goto :goto_e

    .line 573
    :cond_d
    invoke-static {v0, v3}, Lv40;->n0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 574
    .line 575
    .line 576
    move-object/from16 v2, v19

    .line 577
    .line 578
    move/from16 v0, v20

    .line 579
    .line 580
    move/from16 v1, v21

    .line 581
    .line 582
    move/from16 v6, v22

    .line 583
    .line 584
    goto :goto_d

    .line 585
    :cond_e
    move-object/from16 v19, v2

    .line 586
    .line 587
    move/from16 v22, v6

    .line 588
    .line 589
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 590
    .line 591
    .line 592
    move-result v0

    .line 593
    const/4 v1, 0x0

    .line 594
    :cond_f
    :goto_11
    if-ge v1, v0, :cond_14

    .line 595
    .line 596
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 597
    .line 598
    .line 599
    move-result-object v2

    .line 600
    add-int/lit8 v1, v1, 0x1

    .line 601
    .line 602
    check-cast v2, Lorg/w3c/dom/Element;

    .line 603
    .line 604
    const-string v6, "serviceType"

    .line 605
    .line 606
    invoke-interface {v2, v6}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    .line 607
    .line 608
    .line 609
    move-result-object v6

    .line 610
    invoke-interface {v6}, Lorg/w3c/dom/NodeList;->getLength()I

    .line 611
    .line 612
    .line 613
    move-result v13

    .line 614
    if-nez v13, :cond_10

    .line 615
    .line 616
    move-object/from16 v6, v16

    .line 617
    .line 618
    goto :goto_12

    .line 619
    :cond_10
    const/4 v13, 0x0

    .line 620
    invoke-interface {v6, v13}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    .line 621
    .line 622
    .line 623
    move-result-object v6

    .line 624
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getTextContent()Ljava/lang/String;

    .line 625
    .line 626
    .line 627
    move-result-object v6

    .line 628
    :goto_12
    if-eqz v6, :cond_f

    .line 629
    .line 630
    invoke-static {v6}, Lqm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 631
    .line 632
    .line 633
    move-result-object v6

    .line 634
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 635
    .line 636
    .line 637
    move-result-object v6

    .line 638
    if-nez v6, :cond_11

    .line 639
    .line 640
    goto :goto_11

    .line 641
    :cond_11
    const-string v13, "controlURL"

    .line 642
    .line 643
    invoke-interface {v2, v13}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    .line 644
    .line 645
    .line 646
    move-result-object v2

    .line 647
    invoke-interface {v2}, Lorg/w3c/dom/NodeList;->getLength()I

    .line 648
    .line 649
    .line 650
    move-result v13

    .line 651
    if-nez v13, :cond_12

    .line 652
    .line 653
    move-object/from16 v2, v16

    .line 654
    .line 655
    const/4 v13, 0x0

    .line 656
    goto :goto_13

    .line 657
    :cond_12
    const/4 v13, 0x0

    .line 658
    invoke-interface {v2, v13}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    .line 659
    .line 660
    .line 661
    move-result-object v2

    .line 662
    invoke-interface {v2}, Lorg/w3c/dom/Node;->getTextContent()Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v2

    .line 666
    :goto_13
    if-eqz v2, :cond_f

    .line 667
    .line 668
    invoke-static {v2}, Lqm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 669
    .line 670
    .line 671
    move-result-object v2

    .line 672
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v2

    .line 676
    if-eqz v2, :cond_f

    .line 677
    .line 678
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 679
    .line 680
    .line 681
    move-result v17

    .line 682
    if-lez v17, :cond_13

    .line 683
    .line 684
    goto :goto_14

    .line 685
    :cond_13
    move-object/from16 v2, v16

    .line 686
    .line 687
    :goto_14
    if-eqz v2, :cond_f

    .line 688
    .line 689
    :try_start_7
    new-instance v13, Ljava/net/URI;

    .line 690
    .line 691
    invoke-direct {v13, v7}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 692
    .line 693
    .line 694
    invoke-virtual {v13, v2}, Ljava/net/URI;->resolve(Ljava/lang/String;)Ljava/net/URI;

    .line 695
    .line 696
    .line 697
    move-result-object v2

    .line 698
    invoke-virtual {v2}, Ljava/net/URI;->toString()Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v2
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 702
    goto :goto_15

    .line 703
    :catch_3
    move-object/from16 v2, v16

    .line 704
    .line 705
    :goto_15
    if-eqz v2, :cond_f

    .line 706
    .line 707
    invoke-virtual {v14, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    goto :goto_11

    .line 711
    :cond_14
    invoke-virtual {v14}, Ljava/util/HashMap;->isEmpty()Z

    .line 712
    .line 713
    .line 714
    move-result v0

    .line 715
    if-eqz v0, :cond_15

    .line 716
    .line 717
    move-object v0, v9

    .line 718
    move v1, v10

    .line 719
    move v3, v11

    .line 720
    move-object/from16 v9, v16

    .line 721
    .line 722
    const/16 v17, 0x0

    .line 723
    .line 724
    goto :goto_16

    .line 725
    :cond_15
    move-object v0, v9

    .line 726
    new-instance v9, Lg25;

    .line 727
    .line 728
    const-string v1, "UDN"

    .line 729
    .line 730
    invoke-static {v12, v1}, Lsu3;->A(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    move-result-object v1

    .line 734
    const-string v2, "friendlyName"

    .line 735
    .line 736
    invoke-static {v12, v2}, Lsu3;->A(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    .line 737
    .line 738
    .line 739
    move-result-object v2

    .line 740
    const-string v3, "manufacturer"

    .line 741
    .line 742
    invoke-static {v12, v3}, Lsu3;->A(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    move-result-object v3

    .line 746
    const-string v6, "modelName"

    .line 747
    .line 748
    invoke-static {v12, v6}, Lsu3;->A(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object v13

    .line 752
    move v12, v10

    .line 753
    move-object v10, v1

    .line 754
    move v1, v12

    .line 755
    move-object v12, v3

    .line 756
    move v3, v11

    .line 757
    const/16 v17, 0x0

    .line 758
    .line 759
    move-object v11, v2

    .line 760
    invoke-direct/range {v9 .. v15}, Lg25;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)V

    .line 761
    .line 762
    .line 763
    :goto_16
    if-eqz v9, :cond_16

    .line 764
    .line 765
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 766
    .line 767
    .line 768
    :cond_16
    :goto_17
    add-int/lit8 v11, v3, 0x1

    .line 769
    .line 770
    move-object v9, v0

    .line 771
    move v10, v1

    .line 772
    move/from16 v3, v17

    .line 773
    .line 774
    move-object/from16 v1, v18

    .line 775
    .line 776
    move-object/from16 v2, v19

    .line 777
    .line 778
    move/from16 v6, v22

    .line 779
    .line 780
    move-object/from16 v0, p0

    .line 781
    .line 782
    goto/16 :goto_b

    .line 783
    .line 784
    :cond_17
    move-object/from16 v18, v1

    .line 785
    .line 786
    move-object/from16 v19, v2

    .line 787
    .line 788
    move/from16 v17, v3

    .line 789
    .line 790
    move/from16 v22, v6

    .line 791
    .line 792
    move-object v0, v9

    .line 793
    goto :goto_18

    .line 794
    :catch_4
    move-exception v0

    .line 795
    move-object/from16 v18, v1

    .line 796
    .line 797
    move-object/from16 v19, v2

    .line 798
    .line 799
    move/from16 v17, v3

    .line 800
    .line 801
    move/from16 v22, v6

    .line 802
    .line 803
    const-string v1, "unparseable description from "

    .line 804
    .line 805
    invoke-virtual {v1, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 806
    .line 807
    .line 808
    move-result-object v1

    .line 809
    const-string v2, "UpnpDevice"

    .line 810
    .line 811
    invoke-static {v2, v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 812
    .line 813
    .line 814
    move-object/from16 v9, v18

    .line 815
    .line 816
    :goto_18
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 817
    .line 818
    .line 819
    move-result-object v0

    .line 820
    :cond_18
    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 821
    .line 822
    .line 823
    move-result v1

    .line 824
    if-eqz v1, :cond_1a

    .line 825
    .line 826
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 827
    .line 828
    .line 829
    move-result-object v1

    .line 830
    check-cast v1, Lg25;

    .line 831
    .line 832
    iget-object v2, v1, Lg25;->e:Ljava/util/HashMap;

    .line 833
    .line 834
    const-string v3, "urn:schemas-upnp-org:service:AVTransport:1"

    .line 835
    .line 836
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 837
    .line 838
    .line 839
    move-result-object v2

    .line 840
    check-cast v2, Ljava/lang/String;

    .line 841
    .line 842
    iget-object v3, v1, Lg25;->a:Ljava/lang/String;

    .line 843
    .line 844
    if-eqz v2, :cond_18

    .line 845
    .line 846
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 847
    .line 848
    .line 849
    move-result v2

    .line 850
    if-lez v2, :cond_19

    .line 851
    .line 852
    invoke-virtual {v5, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 853
    .line 854
    .line 855
    move-result v2

    .line 856
    if-eqz v2, :cond_18

    .line 857
    .line 858
    :cond_19
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 859
    .line 860
    .line 861
    goto :goto_19

    .line 862
    :cond_1a
    move v0, v8

    .line 863
    move/from16 v3, v17

    .line 864
    .line 865
    move-object/from16 v1, v18

    .line 866
    .line 867
    move-object/from16 v2, v19

    .line 868
    .line 869
    move/from16 v6, v22

    .line 870
    .line 871
    goto/16 :goto_8

    .line 872
    .line 873
    :cond_1b
    move v0, v8

    .line 874
    goto/16 :goto_8

    .line 875
    .line 876
    :cond_1c
    move-object v1, v4

    .line 877
    :goto_1a
    return-object v1

    .line 878
    :goto_1b
    invoke-interface {v4}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 879
    .line 880
    .line 881
    throw v0
.end method

.method public static d(Lg25;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lg25;->e:Ljava/util/HashMap;

    .line 2
    .line 3
    const-string v1, "urn:schemas-upnp-org:service:AVTransport:1"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/String;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Lcom/eddyizm/tempus/upnp/UpnpException;

    .line 15
    .line 16
    iget-object p0, p0, Lg25;->b:Ljava/lang/String;

    .line 17
    .line 18
    const-string v1, "no AVTransport on "

    .line 19
    .line 20
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const/16 v1, 0x1f5

    .line 25
    .line 26
    invoke-direct {v0, v1, p0}, Lcom/eddyizm/tempus/upnp/UpnpException;-><init>(ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0
.end method


# virtual methods
.method public final b(Lg25;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lf25;->d(Lg25;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 v0, 0x1

    .line 9
    :goto_0
    const/4 v1, 0x3

    .line 10
    if-ge v0, v1, :cond_2

    .line 11
    .line 12
    :try_start_0
    const-string v1, "Play"

    .line 13
    .line 14
    const-string v2, "InstanceID"

    .line 15
    .line 16
    const-string v3, "0"

    .line 17
    .line 18
    new-instance v4, Lkd3;

    .line 19
    .line 20
    invoke-direct {v4, v2, v3}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    const-string v2, "Speed"

    .line 24
    .line 25
    const-string v3, "1"

    .line 26
    .line 27
    new-instance v5, Lkd3;

    .line 28
    .line 29
    invoke-direct {v5, v2, v3}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    filled-new-array {v4, v5}, [Lkd3;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-static {v2}, Lgb;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {p0, p1, v1, v2}, Lf25;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;
    :try_end_0
    .catch Lcom/eddyizm/tempus/upnp/UpnpException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :catch_0
    move-exception v1

    .line 45
    const/16 v2, 0x1f5

    .line 46
    .line 47
    iget v3, v1, Lcom/eddyizm/tempus/upnp/UpnpException;->n:I

    .line 48
    .line 49
    if-eq v3, v2, :cond_0

    .line 50
    .line 51
    const/16 v2, 0x2bd

    .line 52
    .line 53
    if-ne v3, v2, :cond_1

    .line 54
    .line 55
    :cond_0
    const/4 v2, 0x2

    .line 56
    if-eq v0, v2, :cond_1

    .line 57
    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v2, "play refused with "

    .line 61
    .line 62
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v2, ", asking again in 1000ms"

    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    const-string v2, "UpnpControlPoint"

    .line 78
    .line 79
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    .line 81
    .line 82
    const-wide/16 v1, 0x3e8

    .line 83
    .line 84
    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    .line 85
    .line 86
    .line 87
    add-int/lit8 v0, v0, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    throw v1

    .line 91
    :cond_2
    :goto_1
    return-void
.end method

.method public final c(Lg25;)Ljava/util/Map;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lf25;->d(Lg25;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, Lkd3;

    .line 9
    .line 10
    const-string v1, "InstanceID"

    .line 11
    .line 12
    const-string v2, "0"

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "GetPositionInfo"

    .line 22
    .line 23
    invoke-virtual {p0, p1, v1, v0}, Lf25;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public final e(Lg25;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lf25;->d(Lg25;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, Lkd3;

    .line 9
    .line 10
    const-string v1, "InstanceID"

    .line 11
    .line 12
    const-string v2, "0"

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Lkd3;

    .line 18
    .line 19
    const-string v2, "Unit"

    .line 20
    .line 21
    const-string v3, "REL_TIME"

    .line 22
    .line 23
    invoke-direct {v1, v2, v3}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    new-instance v2, Lkd3;

    .line 27
    .line 28
    const-string v3, "Target"

    .line 29
    .line 30
    invoke-direct {v2, v3, p2}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    filled-new-array {v0, v1, v2}, [Lkd3;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-static {p2}, Lgb;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    const-string v0, "Seek"

    .line 42
    .line 43
    invoke-virtual {p0, p1, v0, p2}, Lf25;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final f(Lg25;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lf25;->d(Lg25;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance v0, Lkd3;

    .line 12
    .line 13
    const-string v1, "InstanceID"

    .line 14
    .line 15
    const-string v2, "0"

    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lkd3;

    .line 21
    .line 22
    const-string v2, "CurrentURI"

    .line 23
    .line 24
    invoke-direct {v1, v2, p2}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance p2, Lkd3;

    .line 28
    .line 29
    const-string v2, "CurrentURIMetaData"

    .line 30
    .line 31
    invoke-direct {p2, v2, p3}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    filled-new-array {v0, v1, p2}, [Lkd3;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-static {p2}, Lgb;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    const-string p3, "SetAVTransportURI"

    .line 43
    .line 44
    invoke-virtual {p0, p1, p3, p2}, Lf25;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final g(Lg25;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lf25;->d(Lg25;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance v0, Lkd3;

    .line 12
    .line 13
    const-string v1, "InstanceID"

    .line 14
    .line 15
    const-string v2, "0"

    .line 16
    .line 17
    invoke-direct {v0, v1, v2}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lkd3;

    .line 21
    .line 22
    const-string v2, "NextURI"

    .line 23
    .line 24
    invoke-direct {v1, v2, p2}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    new-instance p2, Lkd3;

    .line 28
    .line 29
    const-string v2, "NextURIMetaData"

    .line 30
    .line 31
    invoke-direct {p2, v2, p3}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    filled-new-array {v0, v1, p2}, [Lkd3;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-static {p2}, Lgb;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    const-string p3, "SetNextAVTransportURI"

    .line 43
    .line 44
    invoke-virtual {p0, p1, p3, p2}, Lf25;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;
    .locals 6

    .line 1
    new-instance v4, Lo54;

    .line 2
    .line 3
    const/16 v0, 0x16

    .line 4
    .line 5
    invoke-direct {v4, v0}, Lo54;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const/16 v5, 0x1e

    .line 9
    .line 10
    const-string v1, ""

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    move-object v0, p3

    .line 15
    invoke-static/range {v0 .. v5}, Lq40;->B0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lif1;I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    const/4 v0, 0x4

    .line 20
    const-string v1, "urn:schemas-upnp-org:service:AVTransport:1"

    .line 21
    .line 22
    filled-new-array {p2, v1, p3, p2}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    invoke-static {p3, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    const-string v0, "<?xml version=\"1.0\"?><s:Envelope xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\" s:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\"><s:Body><u:%s xmlns:u=\"%s\">%s</u:%s></s:Body></s:Envelope>"

    .line 31
    .line 32
    invoke-static {v0, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    new-instance v0, Lnz3;

    .line 37
    .line 38
    invoke-direct {v0}, Lnz3;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, p1}, Lnz3;->d(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const-string p1, "\""

    .line 45
    .line 46
    const-string v1, "\"urn:schemas-upnp-org:service:AVTransport:1#"

    .line 47
    .line 48
    invoke-static {v1, p2, p1}, Lxa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iget-object v1, v0, Lnz3;->c:Lsl1;

    .line 53
    .line 54
    const-string v2, "SOAPAction"

    .line 55
    .line 56
    invoke-virtual {v1, v2, p1}, Lsl1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sget-object p1, Ltz3;->Companion:Lsz3;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    sget-object p1, Lf25;->d:Lhu2;

    .line 65
    .line 66
    invoke-static {p3, p1}, Lsz3;->b(Ljava/lang/String;Lhu2;)Lwe5;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const-string p3, "POST"

    .line 71
    .line 72
    invoke-virtual {v0, p3, p1}, Lnz3;->b(Ljava/lang/String;Ltz3;)V

    .line 73
    .line 74
    .line 75
    new-instance p1, Loz3;

    .line 76
    .line 77
    invoke-direct {p1, v0}, Loz3;-><init>(Lnz3;)V

    .line 78
    .line 79
    .line 80
    iget-object p0, p0, Lf25;->a:Lo83;

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    new-instance p3, Lbv3;

    .line 86
    .line 87
    invoke-direct {p3, p0, p1}, Lbv3;-><init>(Lo83;Loz3;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p3}, Lbv3;->c()Lk14;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    :try_start_0
    iget-object p1, p0, Lk14;->t:Ln14;

    .line 95
    .line 96
    if-eqz p1, :cond_0

    .line 97
    .line 98
    invoke-virtual {p1}, Ln14;->string()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    goto :goto_0

    .line 103
    :catchall_0
    move-exception v0

    .line 104
    move-object p1, v0

    .line 105
    goto :goto_2

    .line 106
    :cond_0
    const/4 p1, 0x0

    .line 107
    :goto_0
    const-string p3, ""

    .line 108
    .line 109
    if-nez p1, :cond_1

    .line 110
    .line 111
    move-object p1, p3

    .line 112
    :cond_1
    :try_start_1
    iget-boolean v0, p0, Lk14;->C:Z

    .line 113
    .line 114
    if-nez v0, :cond_4

    .line 115
    .line 116
    iget p2, p0, Lk14;->q:I

    .line 117
    .line 118
    invoke-static {p1, p3}, Lud3;->e0(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    const-string v0, "errorCode"

    .line 123
    .line 124
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, Ljava/lang/String;

    .line 129
    .line 130
    if-eqz v0, :cond_2

    .line 131
    .line 132
    invoke-static {v0}, Lxm4;->l0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    if-eqz v0, :cond_2

    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    :cond_2
    new-instance v0, Lcom/eddyizm/tempus/upnp/UpnpException;

    .line 143
    .line 144
    const-string v1, "errorDescription"

    .line 145
    .line 146
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    check-cast p1, Ljava/lang/String;

    .line 151
    .line 152
    if-nez p1, :cond_3

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_3
    move-object p3, p1

    .line 156
    :goto_1
    invoke-direct {v0, p2, p3}, Lcom/eddyizm/tempus/upnp/UpnpException;-><init>(ILjava/lang/String;)V

    .line 157
    .line 158
    .line 159
    throw v0

    .line 160
    :cond_4
    invoke-static {p1, p2}, Lud3;->e0(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    .line 161
    .line 162
    .line 163
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 164
    invoke-virtual {p0}, Lk14;->close()V

    .line 165
    .line 166
    .line 167
    return-object p1

    .line 168
    :goto_2
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 169
    :catchall_1
    move-exception v0

    .line 170
    move-object p2, v0

    .line 171
    invoke-static {p0, p1}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 172
    .line 173
    .line 174
    throw p2
.end method
