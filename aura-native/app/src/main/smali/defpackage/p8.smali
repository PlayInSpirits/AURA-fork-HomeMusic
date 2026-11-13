.class public final Ldefpackage/p8;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lretrofit2/Callback;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/k03;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/k03;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/p8;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/p8;->o:Ldefpackage/k03;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final a(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final c(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final d(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget p1, p0, Ldefpackage/p8;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object p0, p0, Ldefpackage/p8;->o:Ldefpackage/k03;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    :pswitch_0
    return-void

    .line 10
    :pswitch_1
    const-string p1, "QueueRepository"

    .line 11
    .line 12
    const-string v1, "Failed to get play queue"

    .line 13
    .line 14
    invoke-static {p1, v1, p2}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_2
    invoke-static {v0}, Ldefpackage/kb4;->L(Ljava/util/List;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_3
    invoke-virtual {p0, v0}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :pswitch_4
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 2

    .line 1
    iget p1, p0, Ldefpackage/p8;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object p0, p0, Ldefpackage/p8;->o:Ldefpackage/k03;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getLyrics()Lcom/eddyizm/tempus/subsonic/models/Lyrics;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getLyrics()Lcom/eddyizm/tempus/subsonic/models/Lyrics;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Lyrics;->getValue()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_0
    return-void

    .line 59
    :pswitch_0
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-eqz p1, :cond_1

    .line 70
    .line 71
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getShares()Lcom/eddyizm/tempus/subsonic/models/Shares;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-eqz p1, :cond_1

    .line 86
    .line 87
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 92
    .line 93
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getShares()Lcom/eddyizm/tempus/subsonic/models/Shares;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Shares;->getShares()Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    if-eqz p1, :cond_1

    .line 106
    .line 107
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 112
    .line 113
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getShares()Lcom/eddyizm/tempus/subsonic/models/Shares;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Shares;->getShares()Ljava/util/List;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_1
    return-void

    .line 129
    :pswitch_1
    new-instance p1, Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-eqz v0, :cond_5

    .line 139
    .line 140
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    if-eqz v0, :cond_5

    .line 145
    .line 146
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 151
    .line 152
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getSearchResult3()Lcom/eddyizm/tempus/subsonic/models/SearchResult3;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    if-eqz v0, :cond_5

    .line 161
    .line 162
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    check-cast v0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 167
    .line 168
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getSearchResult3()Lcom/eddyizm/tempus/subsonic/models/SearchResult3;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SearchResult3;->getArtists()Ljava/util/List;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    if-eqz v0, :cond_2

    .line 181
    .line 182
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    check-cast v0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 187
    .line 188
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getSearchResult3()Lcom/eddyizm/tempus/subsonic/models/SearchResult3;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SearchResult3;->getArtists()Ljava/util/List;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-eqz v1, :cond_2

    .line 209
    .line 210
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 215
    .line 216
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    goto :goto_0

    .line 224
    :cond_2
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    check-cast v0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 229
    .line 230
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getSearchResult3()Lcom/eddyizm/tempus/subsonic/models/SearchResult3;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SearchResult3;->getAlbums()Ljava/util/List;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    if-eqz v0, :cond_3

    .line 243
    .line 244
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    check-cast v0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 249
    .line 250
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getSearchResult3()Lcom/eddyizm/tempus/subsonic/models/SearchResult3;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SearchResult3;->getAlbums()Ljava/util/List;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-eqz v1, :cond_3

    .line 271
    .line 272
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 277
    .line 278
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getName()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    goto :goto_1

    .line 286
    :cond_3
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    check-cast v0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 291
    .line 292
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getSearchResult3()Lcom/eddyizm/tempus/subsonic/models/SearchResult3;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SearchResult3;->getSongs()Ljava/util/List;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    if-eqz v0, :cond_4

    .line 305
    .line 306
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object p2

    .line 310
    check-cast p2, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 311
    .line 312
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 313
    .line 314
    .line 315
    move-result-object p2

    .line 316
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getSearchResult3()Lcom/eddyizm/tempus/subsonic/models/SearchResult3;

    .line 317
    .line 318
    .line 319
    move-result-object p2

    .line 320
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SearchResult3;->getSongs()Ljava/util/List;

    .line 321
    .line 322
    .line 323
    move-result-object p2

    .line 324
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 325
    .line 326
    .line 327
    move-result-object p2

    .line 328
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 329
    .line 330
    .line 331
    move-result v0

    .line 332
    if-eqz v0, :cond_4

    .line 333
    .line 334
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 339
    .line 340
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 345
    .line 346
    .line 347
    goto :goto_2

    .line 348
    :cond_4
    new-instance p2, Ljava/util/LinkedHashSet;

    .line 349
    .line 350
    invoke-direct {p2, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 351
    .line 352
    .line 353
    new-instance p1, Ljava/util/ArrayList;

    .line 354
    .line 355
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    :cond_5
    return-void

    .line 362
    :pswitch_2
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 363
    .line 364
    .line 365
    move-result p1

    .line 366
    const-string v1, "QueueRepository"

    .line 367
    .line 368
    if-eqz p1, :cond_7

    .line 369
    .line 370
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object p1

    .line 374
    if-eqz p1, :cond_7

    .line 375
    .line 376
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object p1

    .line 380
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 381
    .line 382
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 383
    .line 384
    .line 385
    move-result-object p1

    .line 386
    if-eqz p1, :cond_7

    .line 387
    .line 388
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object p1

    .line 392
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 393
    .line 394
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 395
    .line 396
    .line 397
    move-result-object p1

    .line 398
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getPlayQueue()Lcom/eddyizm/tempus/subsonic/models/PlayQueue;

    .line 399
    .line 400
    .line 401
    move-result-object p1

    .line 402
    if-eqz p1, :cond_7

    .line 403
    .line 404
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object p1

    .line 408
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 409
    .line 410
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 411
    .line 412
    .line 413
    move-result-object p1

    .line 414
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getPlayQueue()Lcom/eddyizm/tempus/subsonic/models/PlayQueue;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    new-instance p2, Ljava/lang/StringBuilder;

    .line 419
    .line 420
    const-string v0, "Server returned play queue with "

    .line 421
    .line 422
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->getEntries()Ljava/util/List;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    if-eqz v0, :cond_6

    .line 430
    .line 431
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->getEntries()Ljava/util/List;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 436
    .line 437
    .line 438
    move-result v0

    .line 439
    goto :goto_3

    .line 440
    :cond_6
    const/4 v0, 0x0

    .line 441
    :goto_3
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 442
    .line 443
    .line 444
    const-string v0, " items"

    .line 445
    .line 446
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 447
    .line 448
    .line 449
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object p2

    .line 453
    invoke-static {v1, p2}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 454
    .line 455
    .line 456
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 457
    .line 458
    .line 459
    goto :goto_4

    .line 460
    :cond_7
    const-string p1, "Server returned no play queue"

    .line 461
    .line 462
    invoke-static {v1, p1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 463
    .line 464
    .line 465
    invoke-virtual {p0, v0}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    :goto_4
    return-void

    .line 469
    :pswitch_3
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 470
    .line 471
    .line 472
    move-result p1

    .line 473
    if-eqz p1, :cond_8

    .line 474
    .line 475
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object p1

    .line 479
    if-eqz p1, :cond_8

    .line 480
    .line 481
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object p1

    .line 485
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 486
    .line 487
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 488
    .line 489
    .line 490
    move-result-object p1

    .line 491
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getMusicFolders()Lcom/eddyizm/tempus/subsonic/models/MusicFolders;

    .line 492
    .line 493
    .line 494
    move-result-object p1

    .line 495
    if-eqz p1, :cond_8

    .line 496
    .line 497
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object p1

    .line 501
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 502
    .line 503
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 504
    .line 505
    .line 506
    move-result-object p1

    .line 507
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getMusicFolders()Lcom/eddyizm/tempus/subsonic/models/MusicFolders;

    .line 508
    .line 509
    .line 510
    move-result-object p1

    .line 511
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/MusicFolders;->getMusicFolders()Ljava/util/List;

    .line 512
    .line 513
    .line 514
    move-result-object p1

    .line 515
    invoke-static {p1}, Ldefpackage/kb4;->L(Ljava/util/List;)Ljava/util/List;

    .line 516
    .line 517
    .line 518
    move-result-object p1

    .line 519
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 520
    .line 521
    .line 522
    goto :goto_5

    .line 523
    :cond_8
    invoke-static {v0}, Ldefpackage/kb4;->L(Ljava/util/List;)Ljava/util/List;

    .line 524
    .line 525
    .line 526
    move-result-object p1

    .line 527
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 528
    .line 529
    .line 530
    :goto_5
    return-void

    .line 531
    :pswitch_4
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object p1

    .line 535
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 536
    .line 537
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 538
    .line 539
    .line 540
    move-result p2

    .line 541
    if-eqz p2, :cond_a

    .line 542
    .line 543
    if-eqz p1, :cond_a

    .line 544
    .line 545
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 546
    .line 547
    .line 548
    move-result-object p2

    .line 549
    if-eqz p2, :cond_a

    .line 550
    .line 551
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 552
    .line 553
    .line 554
    move-result-object p1

    .line 555
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getArtist()Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;

    .line 556
    .line 557
    .line 558
    move-result-object p2

    .line 559
    sget-object v1, Lcom/eddyizm/tempus/subsonic/models/ResponseStatus;->OK:Ljava/lang/String;

    .line 560
    .line 561
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getStatus()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object p1

    .line 565
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 566
    .line 567
    .line 568
    move-result p1

    .line 569
    if-eqz p1, :cond_9

    .line 570
    .line 571
    if-eqz p2, :cond_9

    .line 572
    .line 573
    invoke-virtual {p0, p2}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 574
    .line 575
    .line 576
    goto :goto_6

    .line 577
    :cond_9
    invoke-virtual {p0, v0}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 578
    .line 579
    .line 580
    goto :goto_6

    .line 581
    :cond_a
    invoke-virtual {p0, v0}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 582
    .line 583
    .line 584
    :goto_6
    return-void

    .line 585
    :pswitch_5
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 586
    .line 587
    .line 588
    move-result p1

    .line 589
    if-eqz p1, :cond_b

    .line 590
    .line 591
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object p1

    .line 595
    if-eqz p1, :cond_b

    .line 596
    .line 597
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 598
    .line 599
    .line 600
    move-result-object p1

    .line 601
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 602
    .line 603
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 604
    .line 605
    .line 606
    move-result-object p1

    .line 607
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getAlbum()Lcom/eddyizm/tempus/subsonic/models/AlbumWithSongsID3;

    .line 608
    .line 609
    .line 610
    move-result-object p1

    .line 611
    if-eqz p1, :cond_b

    .line 612
    .line 613
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object p1

    .line 617
    check-cast p1, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 618
    .line 619
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 620
    .line 621
    .line 622
    move-result-object p1

    .line 623
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getAlbum()Lcom/eddyizm/tempus/subsonic/models/AlbumWithSongsID3;

    .line 624
    .line 625
    .line 626
    move-result-object p1

    .line 627
    invoke-virtual {p0, p1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 628
    .line 629
    .line 630
    :cond_b
    return-void

    .line 631
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
