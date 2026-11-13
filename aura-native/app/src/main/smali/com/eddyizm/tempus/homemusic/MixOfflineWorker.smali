.class public final Lcom/eddyizm/tempus/homemusic/MixOfflineWorker;
.super Landroidx/work/Worker;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final e:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/eddyizm/tempus/homemusic/MixOfflineWorker;->e:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
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
    invoke-direct {p0, p1, p2}, Landroidx/work/Worker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d()Ldefpackage/nc2;
    .locals 3

    .line 1
    const-string v0, "homemusic_mix_offline"

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v0, v1}, Ldefpackage/xa3;->u(Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_3

    .line 9
    .line 10
    invoke-static {}, Ldefpackage/pt0;->c()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {}, Ldefpackage/ud3;->o()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-instance p0, Ldefpackage/mc2;

    .line 24
    .line 25
    invoke-direct {p0}, Ldefpackage/mc2;-><init>()V

    .line 26
    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_1
    invoke-static {}, Ldefpackage/jp1;->b()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    new-instance p0, Ldefpackage/lc2;

    .line 36
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_2
    :try_start_0
    sget-object v0, Lcom/eddyizm/tempus/homemusic/MixOfflineWorker;->e:Ljava/lang/Object;

    .line 42
    .line 43
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    :try_start_1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/MixOfflineWorker;->e()Ldefpackage/nc2;

    .line 45
    .line 46
    .line 47
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    :try_start_2
    monitor-exit v0

    .line 49
    return-object p0

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    monitor-exit v0

    .line 52
    throw p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 53
    :catch_0
    move-exception p0

    .line 54
    const-string v0, "MixOffline"

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v2, "mix download: "

    .line 63
    .line 64
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {v0, p0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 75
    .line 76
    .line 77
    new-instance p0, Ldefpackage/lc2;

    .line 78
    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_3
    :goto_0
    new-instance p0, Ldefpackage/mc2;

    .line 84
    .line 85
    invoke-direct {p0}, Ldefpackage/mc2;-><init>()V

    .line 86
    .line 87
    .line 88
    return-object p0
.end method

.method public final e()Ldefpackage/nc2;
    .locals 21

    .line 1
    new-instance v0, Ldefpackage/or1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ldefpackage/or1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v2, Ldefpackage/or1;

    .line 8
    .line 9
    const/4 v3, 0x1

    .line 10
    invoke-direct {v2, v3}, Ldefpackage/or1;-><init>(I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v2}, Ldefpackage/rr1;->d(Ldefpackage/if1;Ldefpackage/if1;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubMixToday;

    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/HubMixToday;->getMix()Lcom/eddyizm/tempus/homemusic/HubMix;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    new-instance v0, Ldefpackage/mc2;

    .line 26
    .line 27
    invoke-direct {v0}, Ldefpackage/mc2;-><init>()V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :cond_0
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/HubMix;->getNdPlaylistId()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    if-eqz v2, :cond_28

    .line 36
    .line 37
    invoke-static {v2}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-nez v4, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v2, 0x0

    .line 45
    :goto_0
    if-nez v2, :cond_2

    .line 46
    .line 47
    goto/16 :goto_16

    .line 48
    .line 49
    :cond_2
    invoke-static {v1}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-virtual {v4}, Ldefpackage/pn4;->g()Ldefpackage/rm3;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-virtual {v6, v2}, Ldefpackage/rm3;->F(Ljava/lang/String;)Lretrofit2/Call;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-interface {v2}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 70
    .line 71
    if-eqz v2, :cond_4

    .line 72
    .line 73
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    if-eqz v2, :cond_4

    .line 78
    .line 79
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getPlaylist()Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-eqz v2, :cond_4

    .line 84
    .line 85
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;->getEntries()Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    new-instance v6, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    if-eqz v7, :cond_5

    .line 105
    .line 106
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    move-object v8, v7

    .line 111
    check-cast v8, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 112
    .line 113
    invoke-virtual {v8}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v8

    .line 117
    invoke-static {v8}, Ldefpackage/ot1;->c(Ljava/lang/String;)Z

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    if-nez v8, :cond_3

    .line 122
    .line 123
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_4
    const/4 v6, 0x0

    .line 128
    :cond_5
    if-nez v6, :cond_6

    .line 129
    .line 130
    sget-object v6, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 131
    .line 132
    :cond_6
    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result v2

    .line 136
    if-eqz v2, :cond_7

    .line 137
    .line 138
    new-instance v0, Ldefpackage/mc2;

    .line 139
    .line 140
    invoke-direct {v0}, Ldefpackage/mc2;-><init>()V

    .line 141
    .line 142
    .line 143
    return-object v0

    .line 144
    :cond_7
    invoke-virtual {v4}, Ldefpackage/pn4;->a()Ldefpackage/xc5;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {v2}, Ldefpackage/xc5;->s()Lretrofit2/Call;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-interface {v2}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-virtual {v2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    check-cast v2, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 161
    .line 162
    if-eqz v2, :cond_27

    .line 163
    .line 164
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    if-eqz v2, :cond_27

    .line 169
    .line 170
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getStarred2()Lcom/eddyizm/tempus/subsonic/models/Starred2;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    if-eqz v2, :cond_27

    .line 175
    .line 176
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Starred2;->getSongs()Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    if-eqz v2, :cond_27

    .line 181
    .line 182
    new-instance v4, Ljava/util/ArrayList;

    .line 183
    .line 184
    const/16 v7, 0xa

    .line 185
    .line 186
    invoke-static {v2, v7}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 187
    .line 188
    .line 189
    move-result v8

    .line 190
    invoke-direct {v4, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 191
    .line 192
    .line 193
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v8

    .line 201
    if-eqz v8, :cond_8

    .line 202
    .line 203
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    check-cast v8, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 208
    .line 209
    invoke-virtual {v8}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    goto :goto_2

    .line 217
    :cond_8
    invoke-static {v4}, Ldefpackage/q40;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    move-object/from16 v4, p0

    .line 222
    .line 223
    iget-object v8, v4, Ldefpackage/oc2;->a:Landroid/content/Context;

    .line 224
    .line 225
    invoke-static {v8}, Ldefpackage/au0;->w(Landroid/content/Context;)Ldefpackage/eu0;

    .line 226
    .line 227
    .line 228
    move-result-object v9

    .line 229
    invoke-static {}, Ldefpackage/gi1;->E()Ldefpackage/ow2;

    .line 230
    .line 231
    .line 232
    move-result-object v10

    .line 233
    iget-object v11, v10, Ldefpackage/ow2;->b:Ljava/util/Set;

    .line 234
    .line 235
    new-instance v12, Ljava/util/ArrayList;

    .line 236
    .line 237
    invoke-static {v6, v7}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 238
    .line 239
    .line 240
    move-result v13

    .line 241
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 242
    .line 243
    .line 244
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 245
    .line 246
    .line 247
    move-result-object v13

    .line 248
    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v14

    .line 252
    if-eqz v14, :cond_9

    .line 253
    .line 254
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v14

    .line 258
    check-cast v14, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 259
    .line 260
    invoke-virtual {v14}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v14

    .line 264
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    goto :goto_3

    .line 268
    :cond_9
    check-cast v11, Ljava/lang/Iterable;

    .line 269
    .line 270
    invoke-static {v12, v11}, Ldefpackage/q40;->G0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 271
    .line 272
    .line 273
    move-result-object v13

    .line 274
    new-instance v14, Ljava/util/ArrayList;

    .line 275
    .line 276
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 280
    .line 281
    .line 282
    move-result v15

    .line 283
    :cond_a
    :goto_4
    if-ge v1, v15, :cond_b

    .line 284
    .line 285
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v5

    .line 289
    add-int/lit8 v1, v1, 0x1

    .line 290
    .line 291
    move-object/from16 v18, v5

    .line 292
    .line 293
    check-cast v18, Ljava/lang/String;

    .line 294
    .line 295
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    invoke-static/range {v18 .. v18}, Ldefpackage/eu0;->d(Ljava/lang/String;)Z

    .line 299
    .line 300
    .line 301
    move-result v18

    .line 302
    if-eqz v18, :cond_a

    .line 303
    .line 304
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    goto :goto_4

    .line 308
    :cond_b
    invoke-static {v14}, Ldefpackage/q40;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    invoke-virtual {v0}, Lcom/eddyizm/tempus/homemusic/HubMix;->getId()J

    .line 313
    .line 314
    .line 315
    move-result-wide v13

    .line 316
    invoke-static {v12}, Ldefpackage/q40;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 317
    .line 318
    .line 319
    move-result-object v5

    .line 320
    new-instance v15, Ljava/util/ArrayList;

    .line 321
    .line 322
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 323
    .line 324
    .line 325
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 326
    .line 327
    .line 328
    move-result-object v18

    .line 329
    :goto_5
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->hasNext()Z

    .line 330
    .line 331
    .line 332
    move-result v19

    .line 333
    if-eqz v19, :cond_d

    .line 334
    .line 335
    invoke-interface/range {v18 .. v18}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v7

    .line 339
    move-object v3, v7

    .line 340
    check-cast v3, Ljava/lang/String;

    .line 341
    .line 342
    invoke-interface {v5, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v20

    .line 346
    if-nez v20, :cond_c

    .line 347
    .line 348
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v3

    .line 352
    if-nez v3, :cond_c

    .line 353
    .line 354
    invoke-virtual {v15, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 355
    .line 356
    .line 357
    :cond_c
    const/4 v3, 0x1

    .line 358
    const/16 v7, 0xa

    .line 359
    .line 360
    goto :goto_5

    .line 361
    :cond_d
    new-instance v2, Ljava/util/ArrayList;

    .line 362
    .line 363
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 364
    .line 365
    .line 366
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 367
    .line 368
    .line 369
    move-result-object v3

    .line 370
    :cond_e
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 371
    .line 372
    .line 373
    move-result v7

    .line 374
    if-eqz v7, :cond_f

    .line 375
    .line 376
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v7

    .line 380
    move-object v11, v7

    .line 381
    check-cast v11, Ljava/lang/String;

    .line 382
    .line 383
    invoke-interface {v5, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v11

    .line 387
    if-eqz v11, :cond_e

    .line 388
    .line 389
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    goto :goto_6

    .line 393
    :cond_f
    move-object v7, v2

    .line 394
    iget-wide v2, v10, Ldefpackage/ow2;->a:J

    .line 395
    .line 396
    cmp-long v2, v2, v13

    .line 397
    .line 398
    if-nez v2, :cond_10

    .line 399
    .line 400
    iget-object v2, v10, Ldefpackage/ow2;->c:Ljava/util/Set;

    .line 401
    .line 402
    goto :goto_7

    .line 403
    :cond_10
    sget-object v2, Ldefpackage/z01;->n:Ldefpackage/z01;

    .line 404
    .line 405
    :goto_7
    new-instance v3, Ljava/util/ArrayList;

    .line 406
    .line 407
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 411
    .line 412
    .line 413
    move-result v5

    .line 414
    const/4 v10, 0x0

    .line 415
    :goto_8
    if-ge v10, v5, :cond_12

    .line 416
    .line 417
    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v11

    .line 421
    add-int/lit8 v10, v10, 0x1

    .line 422
    .line 423
    move-object/from16 v18, v0

    .line 424
    .line 425
    move-object v0, v11

    .line 426
    check-cast v0, Ljava/lang/String;

    .line 427
    .line 428
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    move-result v20

    .line 432
    if-nez v20, :cond_11

    .line 433
    .line 434
    invoke-interface {v2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 435
    .line 436
    .line 437
    move-result v0

    .line 438
    if-nez v0, :cond_11

    .line 439
    .line 440
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    :cond_11
    move-object/from16 v0, v18

    .line 444
    .line 445
    goto :goto_8

    .line 446
    :cond_12
    move-object/from16 v18, v0

    .line 447
    .line 448
    invoke-static {v3}, Ldefpackage/q40;->t0(Ljava/util/ArrayList;)Ljava/util/List;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    new-instance v3, Ldefpackage/ow2;

    .line 453
    .line 454
    invoke-static {v7}, Ldefpackage/q40;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    invoke-direct {v3, v13, v14, v0, v2}, Ldefpackage/ow2;-><init>(JLjava/util/Set;Ljava/util/Set;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v18 .. v18}, Lcom/eddyizm/tempus/homemusic/HubMix;->getId()J

    .line 462
    .line 463
    .line 464
    move-result-wide v10

    .line 465
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 466
    .line 467
    .line 468
    move-result v2

    .line 469
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 470
    .line 471
    .line 472
    move-result v5

    .line 473
    invoke-interface {v0}, Ljava/util/Set;->size()I

    .line 474
    .line 475
    .line 476
    move-result v0

    .line 477
    new-instance v7, Ljava/lang/StringBuilder;

    .line 478
    .line 479
    const-string v12, "mix "

    .line 480
    .line 481
    invoke-direct {v7, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v7, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 485
    .line 486
    .line 487
    const-string v10, ": download "

    .line 488
    .line 489
    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 490
    .line 491
    .line 492
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 493
    .line 494
    .line 495
    const-string v2, ", remove "

    .line 496
    .line 497
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 498
    .line 499
    .line 500
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 501
    .line 502
    .line 503
    const-string v2, ", kept "

    .line 504
    .line 505
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 506
    .line 507
    .line 508
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 509
    .line 510
    .line 511
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    const-string v2, "MixOffline"

    .line 516
    .line 517
    invoke-static {v2, v0}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 518
    .line 519
    .line 520
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 521
    .line 522
    .line 523
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    invoke-virtual {v0}, Lcom/eddyizm/tempus/database/AppDatabase;->w()Ldefpackage/ss0;

    .line 528
    .line 529
    .line 530
    move-result-object v5

    .line 531
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 532
    .line 533
    .line 534
    move-result v7

    .line 535
    const/4 v0, 0x0

    .line 536
    :goto_9
    if-ge v0, v7, :cond_14

    .line 537
    .line 538
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v10

    .line 542
    add-int/lit8 v11, v0, 0x1

    .line 543
    .line 544
    check-cast v10, Ljava/lang/String;

    .line 545
    .line 546
    new-instance v0, Ldefpackage/pb0;

    .line 547
    .line 548
    const/4 v12, 0x1

    .line 549
    invoke-direct {v0, v5, v10, v12}, Ldefpackage/pb0;-><init>(Ljava/lang/Object;Ljava/lang/String;I)V

    .line 550
    .line 551
    .line 552
    new-instance v10, Ljava/lang/Thread;

    .line 553
    .line 554
    invoke-direct {v10, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v10}, Ljava/lang/Thread;->start()V

    .line 558
    .line 559
    .line 560
    :try_start_0
    invoke-virtual {v10}, Ljava/lang/Thread;->join()V

    .line 561
    .line 562
    .line 563
    iget-object v0, v0, Ldefpackage/pb0;->q:Ljava/lang/Object;

    .line 564
    .line 565
    check-cast v0, Lcom/eddyizm/tempus/model/Download;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 566
    .line 567
    goto :goto_a

    .line 568
    :catch_0
    move-exception v0

    .line 569
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 570
    .line 571
    .line 572
    const/4 v0, 0x0

    .line 573
    :goto_a
    if-nez v0, :cond_13

    .line 574
    .line 575
    :goto_b
    move v0, v11

    .line 576
    goto :goto_9

    .line 577
    :cond_13
    invoke-static {v0}, Ldefpackage/gi1;->G(Lcom/eddyizm/tempus/subsonic/models/Child;)Ldefpackage/gn2;

    .line 578
    .line 579
    .line 580
    move-result-object v10

    .line 581
    invoke-virtual {v9, v10, v0}, Ldefpackage/eu0;->e(Ldefpackage/gn2;Lcom/eddyizm/tempus/model/Download;)V

    .line 582
    .line 583
    .line 584
    goto :goto_b

    .line 585
    :cond_14
    invoke-static {v3}, Ldefpackage/gi1;->V(Ldefpackage/ow2;)V

    .line 586
    .line 587
    .line 588
    const/16 v5, 0xa

    .line 589
    .line 590
    invoke-static {v6, v5}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 591
    .line 592
    .line 593
    move-result v0

    .line 594
    invoke-static {v0}, Ldefpackage/lg2;->W(I)I

    .line 595
    .line 596
    .line 597
    move-result v0

    .line 598
    const/16 v5, 0x10

    .line 599
    .line 600
    if-ge v0, v5, :cond_15

    .line 601
    .line 602
    move v0, v5

    .line 603
    :cond_15
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 604
    .line 605
    invoke-direct {v5, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 606
    .line 607
    .line 608
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 613
    .line 614
    .line 615
    move-result v6

    .line 616
    if-eqz v6, :cond_16

    .line 617
    .line 618
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v6

    .line 622
    move-object v7, v6

    .line 623
    check-cast v7, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 624
    .line 625
    invoke-virtual {v7}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v7

    .line 629
    invoke-interface {v5, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    goto :goto_c

    .line 633
    :cond_16
    const/4 v6, 0x0

    .line 634
    invoke-virtual {v8, v6}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    if-nez v0, :cond_17

    .line 639
    .line 640
    invoke-virtual {v8}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 641
    .line 642
    .line 643
    move-result-object v0

    .line 644
    :cond_17
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 649
    .line 650
    .line 651
    move-result v7

    .line 652
    if-eqz v7, :cond_26

    .line 653
    .line 654
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v7

    .line 658
    check-cast v7, Ljava/lang/String;

    .line 659
    .line 660
    invoke-virtual {v5, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v8

    .line 664
    check-cast v8, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 665
    .line 666
    if-nez v8, :cond_19

    .line 667
    .line 668
    :cond_18
    const/4 v8, 0x1

    .line 669
    goto :goto_d

    .line 670
    :cond_19
    invoke-virtual {v4}, Ldefpackage/oc2;->b()Z

    .line 671
    .line 672
    .line 673
    move-result v10

    .line 674
    if-nez v10, :cond_25

    .line 675
    .line 676
    invoke-static {}, Ldefpackage/jp1;->b()Z

    .line 677
    .line 678
    .line 679
    move-result v10

    .line 680
    if-eqz v10, :cond_1a

    .line 681
    .line 682
    goto/16 :goto_15

    .line 683
    .line 684
    :cond_1a
    sget-object v10, Ldefpackage/eu0;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 685
    .line 686
    invoke-virtual {v10, v7}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    move-result v10

    .line 690
    if-nez v10, :cond_18

    .line 691
    .line 692
    invoke-virtual {v0}, Ljava/io/File;->getUsableSpace()J

    .line 693
    .line 694
    .line 695
    move-result-wide v10

    .line 696
    invoke-virtual {v8}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSize()Ljava/lang/Long;

    .line 697
    .line 698
    .line 699
    move-result-object v12

    .line 700
    if-eqz v12, :cond_1b

    .line 701
    .line 702
    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    .line 703
    .line 704
    .line 705
    move-result-wide v12

    .line 706
    goto :goto_e

    .line 707
    :cond_1b
    const-wide/16 v12, 0x0

    .line 708
    .line 709
    :goto_e
    sub-long/2addr v10, v12

    .line 710
    const-wide v12, 0x80000000L

    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    cmp-long v10, v10, v12

    .line 716
    .line 717
    if-ltz v10, :cond_24

    .line 718
    .line 719
    iget-object v10, v3, Ldefpackage/ow2;->b:Ljava/util/Set;

    .line 720
    .line 721
    invoke-static {v10, v7}, Ldefpackage/kb4;->Q(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 722
    .line 723
    .line 724
    move-result-object v10

    .line 725
    iget-object v11, v3, Ldefpackage/ow2;->c:Ljava/util/Set;

    .line 726
    .line 727
    invoke-static {v11, v7}, Ldefpackage/kb4;->Q(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 728
    .line 729
    .line 730
    move-result-object v11

    .line 731
    new-instance v12, Ldefpackage/ow2;

    .line 732
    .line 733
    iget-wide v13, v3, Ldefpackage/ow2;->a:J

    .line 734
    .line 735
    invoke-direct {v12, v13, v14, v10, v11}, Ldefpackage/ow2;-><init>(JLjava/util/Set;Ljava/util/Set;)V

    .line 736
    .line 737
    .line 738
    invoke-static {v12}, Ldefpackage/gi1;->V(Ldefpackage/ow2;)V

    .line 739
    .line 740
    .line 741
    invoke-static {v8}, Ldefpackage/gi1;->G(Lcom/eddyizm/tempus/subsonic/models/Child;)Ldefpackage/gn2;

    .line 742
    .line 743
    .line 744
    move-result-object v3

    .line 745
    new-instance v10, Lcom/eddyizm/tempus/model/Download;

    .line 746
    .line 747
    invoke-direct {v10, v8}, Lcom/eddyizm/tempus/model/Download;-><init>(Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 748
    .line 749
    .line 750
    const/4 v8, 0x1

    .line 751
    invoke-virtual {v9, v3, v10, v8}, Ldefpackage/eu0;->b(Ldefpackage/gn2;Lcom/eddyizm/tempus/model/Download;Z)Z

    .line 752
    .line 753
    .line 754
    move-result v3

    .line 755
    if-nez v3, :cond_1c

    .line 756
    .line 757
    new-instance v0, Ldefpackage/lc2;

    .line 758
    .line 759
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 760
    .line 761
    .line 762
    return-object v0

    .line 763
    :cond_1c
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 764
    .line 765
    .line 766
    move-result-wide v10

    .line 767
    const-wide/32 v13, 0x493e0

    .line 768
    .line 769
    .line 770
    add-long/2addr v10, v13

    .line 771
    :goto_f
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 772
    .line 773
    .line 774
    move-result-wide v13

    .line 775
    cmp-long v3, v13, v10

    .line 776
    .line 777
    if-gez v3, :cond_22

    .line 778
    .line 779
    invoke-static {v7}, Ldefpackage/eu0;->c(Ljava/lang/String;)Ljava/lang/Integer;

    .line 780
    .line 781
    .line 782
    move-result-object v3

    .line 783
    if-nez v3, :cond_1d

    .line 784
    .line 785
    goto :goto_10

    .line 786
    :cond_1d
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 787
    .line 788
    .line 789
    move-result v8

    .line 790
    const/4 v13, 0x3

    .line 791
    if-eq v8, v13, :cond_21

    .line 792
    .line 793
    :goto_10
    if-nez v3, :cond_1e

    .line 794
    .line 795
    goto :goto_11

    .line 796
    :cond_1e
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 797
    .line 798
    .line 799
    move-result v3

    .line 800
    const/4 v8, 0x4

    .line 801
    if-ne v3, v8, :cond_1f

    .line 802
    .line 803
    goto :goto_12

    .line 804
    :cond_1f
    :goto_11
    invoke-virtual {v4}, Ldefpackage/oc2;->b()Z

    .line 805
    .line 806
    .line 807
    move-result v3

    .line 808
    if-nez v3, :cond_22

    .line 809
    .line 810
    invoke-static {}, Ldefpackage/jp1;->b()Z

    .line 811
    .line 812
    .line 813
    move-result v3

    .line 814
    if-eqz v3, :cond_20

    .line 815
    .line 816
    goto :goto_13

    .line 817
    :cond_20
    const-wide/16 v13, 0x3e8

    .line 818
    .line 819
    invoke-static {v13, v14}, Ljava/lang/Thread;->sleep(J)V

    .line 820
    .line 821
    .line 822
    goto :goto_f

    .line 823
    :cond_21
    :goto_12
    move-object v3, v12

    .line 824
    goto/16 :goto_d

    .line 825
    .line 826
    :cond_22
    :goto_13
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 827
    .line 828
    .line 829
    move-result-object v0

    .line 830
    invoke-virtual {v0}, Lcom/eddyizm/tempus/database/AppDatabase;->w()Ldefpackage/ss0;

    .line 831
    .line 832
    .line 833
    move-result-object v0

    .line 834
    new-instance v1, Ldefpackage/pb0;

    .line 835
    .line 836
    const/4 v8, 0x1

    .line 837
    invoke-direct {v1, v0, v7, v8}, Ldefpackage/pb0;-><init>(Ljava/lang/Object;Ljava/lang/String;I)V

    .line 838
    .line 839
    .line 840
    new-instance v0, Ljava/lang/Thread;

    .line 841
    .line 842
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 843
    .line 844
    .line 845
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 846
    .line 847
    .line 848
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V

    .line 849
    .line 850
    .line 851
    iget-object v0, v1, Ldefpackage/pb0;->q:Ljava/lang/Object;

    .line 852
    .line 853
    check-cast v0, Lcom/eddyizm/tempus/model/Download;
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 854
    .line 855
    move-object v5, v0

    .line 856
    goto :goto_14

    .line 857
    :catch_1
    move-exception v0

    .line 858
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 859
    .line 860
    .line 861
    move-object v5, v6

    .line 862
    :goto_14
    if-eqz v5, :cond_23

    .line 863
    .line 864
    invoke-static {v5}, Ldefpackage/gi1;->G(Lcom/eddyizm/tempus/subsonic/models/Child;)Ldefpackage/gn2;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    invoke-virtual {v9, v0, v5}, Ldefpackage/eu0;->e(Ldefpackage/gn2;Lcom/eddyizm/tempus/model/Download;)V

    .line 869
    .line 870
    .line 871
    :cond_23
    iget-object v0, v12, Ldefpackage/ow2;->b:Ljava/util/Set;

    .line 872
    .line 873
    invoke-static {v0, v7}, Ldefpackage/kb4;->K(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 874
    .line 875
    .line 876
    move-result-object v1

    .line 877
    iget-object v0, v12, Ldefpackage/ow2;->c:Ljava/util/Set;

    .line 878
    .line 879
    invoke-static {v0, v7}, Ldefpackage/kb4;->K(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 880
    .line 881
    .line 882
    move-result-object v13

    .line 883
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 884
    .line 885
    .line 886
    move-result-object v0

    .line 887
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 888
    .line 889
    .line 890
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 891
    .line 892
    .line 893
    move-result-object v0

    .line 894
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 895
    .line 896
    .line 897
    move-result-object v0

    .line 898
    iget-wide v2, v12, Ldefpackage/ow2;->a:J

    .line 899
    .line 900
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 901
    .line 902
    .line 903
    move-result-object v7

    .line 904
    const/4 v5, 0x0

    .line 905
    const/16 v6, 0x3e

    .line 906
    .line 907
    const-string v2, ","

    .line 908
    .line 909
    const/4 v3, 0x0

    .line 910
    const/4 v4, 0x0

    .line 911
    invoke-static/range {v1 .. v6}, Ldefpackage/q40;->B0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldefpackage/if1;I)Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v1

    .line 915
    const/16 v17, 0x0

    .line 916
    .line 917
    const/16 v18, 0x3e

    .line 918
    .line 919
    const-string v14, ","

    .line 920
    .line 921
    const/4 v15, 0x0

    .line 922
    const/16 v16, 0x0

    .line 923
    .line 924
    invoke-static/range {v13 .. v18}, Ldefpackage/q40;->B0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldefpackage/if1;I)Ljava/lang/String;

    .line 925
    .line 926
    .line 927
    move-result-object v2

    .line 928
    filled-new-array {v7, v1, v2}, [Ljava/lang/String;

    .line 929
    .line 930
    .line 931
    move-result-object v1

    .line 932
    invoke-static {v1}, Ldefpackage/gb;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 933
    .line 934
    .line 935
    move-result-object v2

    .line 936
    const/4 v6, 0x0

    .line 937
    const/16 v7, 0x3e

    .line 938
    .line 939
    const-string v3, "\n"

    .line 940
    .line 941
    invoke-static/range {v2 .. v7}, Ldefpackage/q40;->B0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldefpackage/if1;I)Ljava/lang/String;

    .line 942
    .line 943
    .line 944
    move-result-object v1

    .line 945
    const-string v2, "homemusic_mix_offline_state"

    .line 946
    .line 947
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 948
    .line 949
    .line 950
    move-result-object v0

    .line 951
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 952
    .line 953
    .line 954
    new-instance v0, Ldefpackage/lc2;

    .line 955
    .line 956
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 957
    .line 958
    .line 959
    return-object v0

    .line 960
    :cond_24
    const-string v0, "mix: no room left"

    .line 961
    .line 962
    invoke-static {v2, v0}, Landroid/util/Ldefpackage/og;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 963
    .line 964
    .line 965
    new-instance v0, Ldefpackage/mc2;

    .line 966
    .line 967
    invoke-direct {v0}, Ldefpackage/mc2;-><init>()V

    .line 968
    .line 969
    .line 970
    return-object v0

    .line 971
    :cond_25
    :goto_15
    new-instance v0, Ldefpackage/lc2;

    .line 972
    .line 973
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 974
    .line 975
    .line 976
    return-object v0

    .line 977
    :cond_26
    new-instance v0, Ldefpackage/mc2;

    .line 978
    .line 979
    invoke-direct {v0}, Ldefpackage/mc2;-><init>()V

    .line 980
    .line 981
    .line 982
    return-object v0

    .line 983
    :cond_27
    new-instance v0, Ldefpackage/lc2;

    .line 984
    .line 985
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 986
    .line 987
    .line 988
    return-object v0

    .line 989
    :cond_28
    :goto_16
    new-instance v0, Ldefpackage/mc2;

    .line 990
    .line 991
    invoke-direct {v0}, Ldefpackage/mc2;-><init>()V

    .line 992
    .line 993
    .line 994
    return-object v0
.end method
