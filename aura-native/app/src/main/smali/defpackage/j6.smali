.class public final Ldefpackage/j6;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/ci0;


# instance fields
.field public final synthetic n:I

.field public final o:Ldefpackage/ci0;

.field public final p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;

.field public r:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldefpackage/ci0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ldefpackage/j6;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ldefpackage/j6;->o:Ldefpackage/ci0;

    .line 8
    .line 9
    new-instance p1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Ldefpackage/j6;->p:Ljava/lang/Object;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Ldefpackage/ci0;[B[B)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ldefpackage/j6;->n:I

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Ldefpackage/j6;->o:Ldefpackage/ci0;

    .line 19
    iput-object p2, p0, Ldefpackage/j6;->p:Ljava/lang/Object;

    .line 20
    iput-object p3, p0, Ldefpackage/j6;->q:Ljava/lang/Object;

    return-void
.end method

.method public static o(Ldefpackage/ii0;Ljava/lang/String;Z)Ldefpackage/ii0;
    .locals 3

    .line 1
    invoke-static {}, Ldefpackage/rr1;->c()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ldefpackage/ii0;->a:Landroid/net/Uri;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "homemusic-hub"

    .line 12
    .line 13
    invoke-static {v1, v2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const-string v2, "UTF-8"

    .line 18
    .line 19
    invoke-static {p1, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const-string v2, ""

    .line 24
    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    const-string p2, "&q=mobile"

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object p2, v2

    .line 31
    :goto_0
    if-eqz v1, :cond_1

    .line 32
    .line 33
    const-string v2, "&full=1"

    .line 34
    .line 35
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, "/api/listen/stream?ref="

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    new-instance p2, Ljava/util/HashMap;

    .line 62
    .line 63
    iget-object v0, p0, Ldefpackage/ii0;->e:Ljava/util/Map;

    .line 64
    .line 65
    invoke-direct {p2, v0}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 66
    .line 67
    .line 68
    :try_start_0
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0, p1}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    goto :goto_1

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    new-instance v1, Ldefpackage/s14;

    .line 79
    .line 80
    invoke-direct {v1, v0}, Ldefpackage/s14;-><init>(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    move-object v0, v1

    .line 84
    :goto_1
    nop

    .line 85
    instance-of v1, v0, Ldefpackage/s14;

    .line 86
    .line 87
    if-eqz v1, :cond_2

    .line 88
    .line 89
    const/4 v0, 0x0

    .line 90
    :cond_2
    check-cast v0, Ljava/lang/String;

    .line 91
    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    const-string v1, "Cookie"

    .line 95
    .line 96
    invoke-virtual {p2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    :cond_3
    invoke-virtual {p0}, Ldefpackage/ii0;->a()Ldefpackage/hi0;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iput-object p1, p0, Ldefpackage/hi0;->a:Landroid/net/Uri;

    .line 108
    .line 109
    iput-object p2, p0, Ldefpackage/hi0;->e:Ljava/util/Map;

    .line 110
    .line 111
    invoke-virtual {p0}, Ldefpackage/hi0;->a()Ldefpackage/ii0;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0
.end method


# virtual methods
.method public final b(Ldefpackage/ii0;)J
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget v0, v1, Ldefpackage/j6;->n:I

    .line 6
    .line 7
    iget-object v3, v1, Ldefpackage/j6;->p:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, v1, Ldefpackage/j6;->o:Ldefpackage/ci0;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    const/4 v6, 0x1

    .line 15
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v8, v2, Ldefpackage/ii0;->h:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v0, v2, Ldefpackage/ii0;->a:Landroid/net/Uri;

    .line 25
    .line 26
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v9

    .line 30
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Ldefpackage/jp1;->a()Z

    .line 34
    .line 35
    .line 36
    move-result v10

    .line 37
    const/4 v11, 0x0

    .line 38
    if-eqz v8, :cond_1

    .line 39
    .line 40
    invoke-virtual {v8, v9}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v9

    .line 44
    if-eqz v9, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const-string v9, "|mobile"

    .line 48
    .line 49
    invoke-static {v8, v9, v11}, Ldefpackage/xm4;->e0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    :cond_1
    :goto_0
    invoke-virtual {v0}, Landroid/net/Uri;->getLastPathSegment()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v9

    .line 57
    iget-wide v12, v2, Ldefpackage/ii0;->f:J

    .line 58
    .line 59
    const-string v14, " key="

    .line 60
    .line 61
    const-string v15, " light="

    .line 62
    .line 63
    const-string v11, "open "

    .line 64
    .line 65
    invoke-static {v11, v9, v14, v8, v15}, Ldefpackage/b11;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string v11, " at "

    .line 73
    .line 74
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v9, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    const-string v11, "HubTracks"

    .line 85
    .line 86
    invoke-static {v11, v9}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    const-string v12, "homemusic-hub"

    .line 94
    .line 95
    invoke-static {v9, v12}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    if-nez v9, :cond_2

    .line 100
    .line 101
    if-eqz v10, :cond_2

    .line 102
    .line 103
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v13

    .line 107
    invoke-static {v13}, Ldefpackage/uo;->x(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v13

    .line 111
    goto :goto_1

    .line 112
    :cond_2
    const/4 v13, 0x0

    .line 113
    :goto_1
    if-nez v9, :cond_3

    .line 114
    .line 115
    if-nez v13, :cond_3

    .line 116
    .line 117
    iput-object v4, v1, Ldefpackage/j6;->q:Ljava/lang/Object;

    .line 118
    .line 119
    invoke-interface {v4, v2}, Ldefpackage/ci0;->b(Ldefpackage/ii0;)J

    .line 120
    .line 121
    .line 122
    move-result-wide v0

    .line 123
    goto/16 :goto_e

    .line 124
    .line 125
    :cond_3
    new-instance v14, Ldefpackage/qr2;

    .line 126
    .line 127
    const/16 v15, 0xa

    .line 128
    .line 129
    invoke-direct {v14, v15}, Ldefpackage/qr2;-><init>(I)V

    .line 130
    .line 131
    .line 132
    new-instance v15, Ldefpackage/el0;

    .line 133
    .line 134
    const/16 v12, 0x3a98

    .line 135
    .line 136
    const v5, 0xafc8

    .line 137
    .line 138
    .line 139
    invoke-direct {v15, v12, v5, v6, v14}, Ldefpackage/el0;-><init>(IIZLdefpackage/qr2;)V

    .line 140
    .line 141
    .line 142
    check-cast v3, Ljava/util/ArrayList;

    .line 143
    .line 144
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    const/4 v12, 0x0

    .line 149
    :goto_2
    if-ge v12, v5, :cond_4

    .line 150
    .line 151
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v14

    .line 155
    add-int/lit8 v12, v12, 0x1

    .line 156
    .line 157
    check-cast v14, Ldefpackage/rw4;

    .line 158
    .line 159
    invoke-virtual {v15, v14}, Ldefpackage/kp;->c(Ldefpackage/rw4;)V

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_4
    iput-object v15, v1, Ldefpackage/j6;->q:Ljava/lang/Object;

    .line 164
    .line 165
    if-eqz v13, :cond_6

    .line 166
    .line 167
    const-string v0, "nd:"

    .line 168
    .line 169
    invoke-virtual {v0, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    :cond_5
    :goto_3
    move-object v3, v0

    .line 174
    goto :goto_4

    .line 175
    :cond_6
    const-string v3, "ref"

    .line 176
    .line 177
    invoke-virtual {v0, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    if-nez v0, :cond_5

    .line 182
    .line 183
    const-string v0, ""

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :goto_4
    const v5, 0x7f1301ac

    .line 187
    .line 188
    .line 189
    :try_start_0
    invoke-static {v2, v3, v10}, Ldefpackage/j6;->o(Ldefpackage/ii0;Ljava/lang/String;Z)Ldefpackage/ii0;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-virtual {v15, v0}, Ldefpackage/el0;->b(Ldefpackage/ii0;)J

    .line 194
    .line 195
    .line 196
    move-result-wide v16
    :try_end_0
    .catch Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 197
    goto :goto_6

    .line 198
    :catch_0
    move-exception v0

    .line 199
    goto/16 :goto_c

    .line 200
    .line 201
    :catch_1
    move-exception v0

    .line 202
    iget v12, v0, Landroidx/media3/datasource/HttpDataSource$InvalidResponseCodeException;->p:I

    .line 203
    .line 204
    if-eqz v9, :cond_8

    .line 205
    .line 206
    const/16 v14, 0x1f7

    .line 207
    .line 208
    if-eq v12, v14, :cond_7

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_7
    :try_start_1
    new-instance v6, Ljava/io/IOException;

    .line 212
    .line 213
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 214
    .line 215
    .line 216
    move-result-object v9

    .line 217
    invoke-virtual {v9, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    invoke-direct {v6, v5, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 222
    .line 223
    .line 224
    throw v6

    .line 225
    :cond_8
    :goto_5
    const/16 v14, 0x191

    .line 226
    .line 227
    if-ne v12, v14, :cond_12

    .line 228
    .line 229
    invoke-virtual {v15}, Ldefpackage/el0;->close()V

    .line 230
    .line 231
    .line 232
    invoke-static {}, Ldefpackage/rr1;->h()Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 233
    .line 234
    .line 235
    invoke-static {v2, v3, v10}, Ldefpackage/j6;->o(Ldefpackage/ii0;Ljava/lang/String;Z)Ldefpackage/ii0;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-virtual {v15, v0}, Ldefpackage/el0;->b(Ldefpackage/ii0;)J

    .line 240
    .line 241
    .line 242
    move-result-wide v16

    .line 243
    :goto_6
    if-eqz v9, :cond_c

    .line 244
    .line 245
    invoke-virtual {v15}, Ldefpackage/el0;->j()Ljava/util/Map;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    check-cast v0, Ljava/lang/Iterable;

    .line 254
    .line 255
    instance-of v9, v0, Ljava/util/Collection;

    .line 256
    .line 257
    if-eqz v9, :cond_9

    .line 258
    .line 259
    move-object v9, v0

    .line 260
    check-cast v9, Ljava/util/Collection;

    .line 261
    .line 262
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 263
    .line 264
    .line 265
    move-result v9

    .line 266
    if-eqz v9, :cond_9

    .line 267
    .line 268
    goto :goto_8

    .line 269
    :cond_9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    :cond_a
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 274
    .line 275
    .line 276
    move-result v9

    .line 277
    if-eqz v9, :cond_c

    .line 278
    .line 279
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v9

    .line 283
    check-cast v9, Ljava/util/Map$Entry;

    .line 284
    .line 285
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v12

    .line 289
    check-cast v12, Ljava/lang/String;

    .line 290
    .line 291
    const-string v14, "X-HomeMusic-Listen-Kind"

    .line 292
    .line 293
    invoke-static {v12, v14, v6}, Ldefpackage/xm4;->f0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 294
    .line 295
    .line 296
    move-result v12

    .line 297
    if-eqz v12, :cond_a

    .line 298
    .line 299
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v9

    .line 303
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 304
    .line 305
    .line 306
    check-cast v9, Ljava/util/List;

    .line 307
    .line 308
    invoke-static {v9}, Ldefpackage/q40;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v9

    .line 312
    const-string v12, "preview"

    .line 313
    .line 314
    invoke-static {v9, v12}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v9

    .line 318
    if-nez v9, :cond_b

    .line 319
    .line 320
    goto :goto_7

    .line 321
    :cond_b
    new-instance v0, Ljava/io/IOException;

    .line 322
    .line 323
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 324
    .line 325
    .line 326
    move-result-object v6

    .line 327
    invoke-virtual {v6, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v5

    .line 331
    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    throw v0

    .line 335
    :cond_c
    :goto_8
    if-eqz v10, :cond_11

    .line 336
    .line 337
    invoke-virtual {v15}, Ldefpackage/el0;->j()Ljava/util/Map;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    check-cast v0, Ljava/lang/Iterable;

    .line 346
    .line 347
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 352
    .line 353
    .line 354
    move-result v5

    .line 355
    if-eqz v5, :cond_e

    .line 356
    .line 357
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v5

    .line 361
    move-object v9, v5

    .line 362
    check-cast v9, Ljava/util/Map$Entry;

    .line 363
    .line 364
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v9

    .line 368
    check-cast v9, Ljava/lang/String;

    .line 369
    .line 370
    const-string v10, "X-HomeMusic-Variant"

    .line 371
    .line 372
    invoke-static {v9, v10, v6}, Ldefpackage/xm4;->f0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 373
    .line 374
    .line 375
    move-result v9

    .line 376
    if-eqz v9, :cond_d

    .line 377
    .line 378
    goto :goto_9

    .line 379
    :cond_e
    const/4 v5, 0x0

    .line 380
    :goto_9
    check-cast v5, Ljava/util/Map$Entry;

    .line 381
    .line 382
    if-eqz v5, :cond_f

    .line 383
    .line 384
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    check-cast v0, Ljava/util/List;

    .line 389
    .line 390
    if-eqz v0, :cond_f

    .line 391
    .line 392
    invoke-static {v0}, Ldefpackage/q40;->x0(Ljava/util/List;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    check-cast v0, Ljava/lang/String;

    .line 397
    .line 398
    if-eqz v0, :cond_f

    .line 399
    .line 400
    invoke-static {v0}, Ldefpackage/qm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    goto :goto_a

    .line 409
    :cond_f
    const/4 v0, 0x0

    .line 410
    :goto_a
    const-string v5, "original-pending"

    .line 411
    .line 412
    invoke-static {v0, v5}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    move-result v0

    .line 416
    if-eqz v0, :cond_11

    .line 417
    .line 418
    if-nez v8, :cond_10

    .line 419
    .line 420
    goto :goto_b

    .line 421
    :cond_10
    iput-object v8, v1, Ldefpackage/j6;->r:Ljava/lang/Object;

    .line 422
    .line 423
    sget-object v0, Ldefpackage/ot1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 424
    .line 425
    sget-object v5, Ldefpackage/nt1;->n:Ldefpackage/nt1;

    .line 426
    .line 427
    new-instance v5, Ldefpackage/j61;

    .line 428
    .line 429
    const/4 v6, 0x2

    .line 430
    invoke-direct {v5, v6}, Ldefpackage/j61;-><init>(I)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {v0, v8, v7, v5}, Ljava/util/concurrent/ConcurrentHashMap;->merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    :cond_11
    :goto_b
    move-wide/from16 v0, v16

    .line 437
    .line 438
    goto :goto_e

    .line 439
    :cond_12
    throw v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 440
    :goto_c
    if-eqz v13, :cond_14

    .line 441
    .line 442
    new-instance v5, Ljava/lang/StringBuilder;

    .line 443
    .line 444
    const-string v6, "the Hub does not give "

    .line 445
    .line 446
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 447
    .line 448
    .line 449
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    const-string v3, ", Navidrome does: "

    .line 453
    .line 454
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 455
    .line 456
    .line 457
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    invoke-static {v11, v0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 465
    .line 466
    .line 467
    invoke-virtual {v15}, Ldefpackage/el0;->close()V

    .line 468
    .line 469
    .line 470
    iput-object v4, v1, Ldefpackage/j6;->q:Ljava/lang/Object;

    .line 471
    .line 472
    if-nez v8, :cond_13

    .line 473
    .line 474
    goto :goto_d

    .line 475
    :cond_13
    iput-object v8, v1, Ldefpackage/j6;->r:Ljava/lang/Object;

    .line 476
    .line 477
    sget-object v0, Ldefpackage/ot1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 478
    .line 479
    sget-object v1, Ldefpackage/nt1;->n:Ldefpackage/nt1;

    .line 480
    .line 481
    new-instance v1, Ldefpackage/j61;

    .line 482
    .line 483
    const/4 v6, 0x2

    .line 484
    invoke-direct {v1, v6}, Ldefpackage/j61;-><init>(I)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v0, v8, v7, v1}, Ljava/util/concurrent/ConcurrentHashMap;->merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    :goto_d
    invoke-interface {v4, v2}, Ldefpackage/ci0;->b(Ldefpackage/ii0;)J

    .line 491
    .line 492
    .line 493
    move-result-wide v0

    .line 494
    :goto_e
    return-wide v0

    .line 495
    :cond_14
    invoke-virtual {v15}, Ldefpackage/el0;->close()V

    .line 496
    .line 497
    .line 498
    const/4 v2, 0x0

    .line 499
    iput-object v2, v1, Ldefpackage/j6;->q:Ljava/lang/Object;

    .line 500
    .line 501
    throw v0

    .line 502
    :pswitch_0
    const-wide/16 v5, 0x0

    .line 503
    .line 504
    :try_start_2
    const-string v0, "AES/CBC/PKCS7Padding"

    .line 505
    .line 506
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 507
    .line 508
    .line 509
    move-result-object v0
    :try_end_2
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_2 .. :try_end_2} :catch_4

    .line 510
    new-instance v7, Ljavax/crypto/spec/SecretKeySpec;

    .line 511
    .line 512
    check-cast v3, [B

    .line 513
    .line 514
    const-string v8, "AES"

    .line 515
    .line 516
    invoke-direct {v7, v3, v8}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 517
    .line 518
    .line 519
    new-instance v3, Ljavax/crypto/spec/IvParameterSpec;

    .line 520
    .line 521
    iget-object v8, v1, Ldefpackage/j6;->q:Ljava/lang/Object;

    .line 522
    .line 523
    check-cast v8, [B

    .line 524
    .line 525
    invoke-direct {v3, v8}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 526
    .line 527
    .line 528
    const/4 v8, 0x2

    .line 529
    :try_start_3
    invoke-virtual {v0, v8, v7, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_3
    .catch Ljava/security/InvalidKeyException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_3 .. :try_end_3} :catch_2

    .line 530
    .line 531
    .line 532
    new-instance v3, Ldefpackage/gi0;

    .line 533
    .line 534
    invoke-direct {v3, v4, v2}, Ldefpackage/gi0;-><init>(Ldefpackage/ci0;Ldefpackage/ii0;)V

    .line 535
    .line 536
    .line 537
    new-instance v2, Ljavax/crypto/CipherInputStream;

    .line 538
    .line 539
    invoke-direct {v2, v3, v0}, Ljavax/crypto/CipherInputStream;-><init>(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V

    .line 540
    .line 541
    .line 542
    iput-object v2, v1, Ldefpackage/j6;->r:Ljava/lang/Object;

    .line 543
    .line 544
    invoke-virtual {v3}, Ldefpackage/gi0;->b()V

    .line 545
    .line 546
    .line 547
    const-wide/16 v5, -0x1

    .line 548
    .line 549
    goto :goto_11

    .line 550
    :catch_2
    move-exception v0

    .line 551
    goto :goto_f

    .line 552
    :catch_3
    move-exception v0

    .line 553
    :goto_f
    invoke-static {v0}, Ldefpackage/er1;->m(Ljava/lang/Throwable;)V

    .line 554
    .line 555
    .line 556
    goto :goto_11

    .line 557
    :catch_4
    move-exception v0

    .line 558
    goto :goto_10

    .line 559
    :catch_5
    move-exception v0

    .line 560
    :goto_10
    invoke-static {v0}, Ldefpackage/er1;->m(Ljava/lang/Throwable;)V

    .line 561
    .line 562
    .line 563
    :goto_11
    return-wide v5

    .line 564
    nop

    .line 565
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ldefpackage/rw4;)V
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/j6;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/j6;->o:Ldefpackage/ci0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-interface {v1, p1}, Ldefpackage/ci0;->c(Ldefpackage/rw4;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Ldefpackage/j6;->p:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-interface {v1, p1}, Ldefpackage/ci0;->c(Ldefpackage/rw4;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final close()V
    .locals 4

    .line 1
    iget v0, p0, Ldefpackage/j6;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Ldefpackage/j6;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ldefpackage/ci0;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ldefpackage/ci0;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    :goto_0
    iput-object v1, p0, Ldefpackage/j6;->q:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v0, p0, Ldefpackage/j6;->r:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    sget-object v2, Ldefpackage/ot1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    invoke-static {v0}, Ldefpackage/ot1;->a(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    iput-object v1, p0, Ldefpackage/j6;->r:Ljava/lang/Object;

    .line 33
    .line 34
    return-void

    .line 35
    :goto_1
    iput-object v1, p0, Ldefpackage/j6;->q:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v2, p0, Ldefpackage/j6;->r:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Ljava/lang/String;

    .line 40
    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    sget-object v3, Ldefpackage/ot1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 44
    .line 45
    invoke-static {v2}, Ldefpackage/ot1;->a(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    iput-object v1, p0, Ldefpackage/j6;->r:Ljava/lang/Object;

    .line 49
    .line 50
    throw v0

    .line 51
    :pswitch_0
    iget-object v0, p0, Ldefpackage/j6;->r:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Ljavax/crypto/CipherInputStream;

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    iput-object v1, p0, Ldefpackage/j6;->r:Ljava/lang/Object;

    .line 58
    .line 59
    iget-object p0, p0, Ldefpackage/j6;->o:Ldefpackage/ci0;

    .line 60
    .line 61
    invoke-interface {p0}, Ldefpackage/ci0;->close()V

    .line 62
    .line 63
    .line 64
    :cond_3
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j()Ljava/util/Map;
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/j6;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/j6;->q:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ldefpackage/ci0;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Ldefpackage/ci0;->j()Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    :cond_0
    sget-object p0, Ldefpackage/v01;->n:Ldefpackage/v01;

    .line 19
    .line 20
    :cond_1
    return-object p0

    .line 21
    :pswitch_0
    iget-object p0, p0, Ldefpackage/j6;->o:Ldefpackage/ci0;

    .line 22
    .line 23
    invoke-interface {p0}, Ldefpackage/ci0;->j()Ljava/util/Map;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m()Landroid/net/Uri;
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/j6;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/j6;->q:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ldefpackage/ci0;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Ldefpackage/ci0;->m()Landroid/net/Uri;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    :goto_0
    return-object p0

    .line 19
    :pswitch_0
    iget-object p0, p0, Ldefpackage/j6;->o:Ldefpackage/ci0;

    .line 20
    .line 21
    invoke-interface {p0}, Ldefpackage/ci0;->m()Landroid/net/Uri;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final read([BII)I
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/j6;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/j6;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ldefpackage/ci0;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-interface {p0, p1, p2, p3}, Ldefpackage/wh0;->read([BII)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string p0, "not opened"

    .line 21
    .line 22
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    :goto_0
    return p0

    .line 27
    :pswitch_0
    iget-object v0, p0, Ldefpackage/j6;->r:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Ljavax/crypto/CipherInputStream;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Ldefpackage/j6;->r:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Ljavax/crypto/CipherInputStream;

    .line 37
    .line 38
    invoke-virtual {p0, p1, p2, p3}, Ljavax/crypto/CipherInputStream;->read([BII)I

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-gez p0, :cond_1

    .line 43
    .line 44
    const/4 p0, -0x1

    .line 45
    :cond_1
    return p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
