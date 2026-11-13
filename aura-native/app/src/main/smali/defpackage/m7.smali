.class public final synthetic Ldefpackage/m7;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/m7;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget p0, p0, Ldefpackage/m7;->a:I

    .line 2
    .line 3
    const-string v0, ""

    .line 4
    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ldefpackage/d64;

    .line 11
    .line 12
    iget-boolean p0, p1, Ldefpackage/d64;->c:Z

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    const-wide/high16 p0, 0x4059000000000000L    # 100.0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-wide/16 p0, 0x0

    .line 20
    .line 21
    :goto_0
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, Ldefpackage/d64;

    .line 27
    .line 28
    invoke-static {p1}, Ldefpackage/tv1;->C(Ldefpackage/d64;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    iget-boolean p1, p1, Ldefpackage/d64;->c:Z

    .line 33
    .line 34
    if-eqz p0, :cond_2

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    const-wide p0, 0x4056800000000000L    # 90.0

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-wide/high16 p0, 0x4039000000000000L    # 25.0

    .line 45
    .line 46
    :goto_1
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    goto :goto_3

    .line 51
    :cond_2
    if-eqz p1, :cond_3

    .line 52
    .line 53
    const-wide/high16 p0, 0x4054000000000000L    # 80.0

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_3
    const-wide/high16 p0, 0x4044000000000000L    # 40.0

    .line 57
    .line 58
    :goto_2
    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    :goto_3
    return-object p0

    .line 63
    :pswitch_1
    check-cast p1, Ldefpackage/d64;

    .line 64
    .line 65
    iget-object p0, p1, Ldefpackage/d64;->g:Ldefpackage/tu4;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_2
    check-cast p1, Ldefpackage/d64;

    .line 69
    .line 70
    iget-object p0, p1, Ldefpackage/d64;->h:Ldefpackage/tu4;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_3
    check-cast p1, Lcom/eddyizm/tempus/model/Chronology;

    .line 74
    .line 75
    return-object p1

    .line 76
    :pswitch_4
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Genre;

    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Genre;->getGenre()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :pswitch_5
    check-cast p1, Ljava/lang/Double;

    .line 84
    .line 85
    return-object p1

    .line 86
    :pswitch_6
    check-cast p1, Lcom/eddyizm/tempus/model/Download;

    .line 87
    .line 88
    return-object p1

    .line 89
    :pswitch_7
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getGenre()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    return-object p0

    .line 96
    :pswitch_8
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 97
    .line 98
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :pswitch_9
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0

    .line 110
    :pswitch_a
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 111
    .line 112
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    return-object p0

    .line 117
    :pswitch_b
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    return-object p0

    .line 124
    :pswitch_c
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 125
    .line 126
    check-cast p1, Lcom/eddyizm/tempus/model/Download;

    .line 127
    .line 128
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/Download;->getPlaylistId()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    return-object p0

    .line 133
    :pswitch_d
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 134
    .line 135
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getYear()Ljava/lang/Integer;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    return-object p0

    .line 140
    :pswitch_e
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 141
    .line 142
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getReleaseTypes()Ljava/util/List;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    const/4 v0, 0x0

    .line 147
    if-eqz p0, :cond_4

    .line 148
    .line 149
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-nez v1, :cond_4

    .line 154
    .line 155
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    if-eqz v1, :cond_4

    .line 160
    .line 161
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    check-cast p0, Ljava/lang/String;

    .line 166
    .line 167
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-nez v1, :cond_4

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_4
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getSongCount()Ljava/lang/Integer;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    if-eqz p0, :cond_5

    .line 187
    .line 188
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getSongCount()Ljava/lang/Integer;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    :cond_5
    const/16 p0, 0x8

    .line 197
    .line 198
    if-lt v0, p0, :cond_6

    .line 199
    .line 200
    const-string p0, "album"

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :cond_6
    const/4 p0, 0x2

    .line 204
    if-gt v0, p0, :cond_7

    .line 205
    .line 206
    const-string p0, "single"

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_7
    const-string p0, "ep"

    .line 210
    .line 211
    :goto_4
    return-object p0

    .line 212
    :pswitch_f
    check-cast p1, Lcom/eddyizm/tempus/model/Download;

    .line 213
    .line 214
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    return-object p0

    .line 219
    :pswitch_10
    new-instance p0, Ljava/util/ArrayList;

    .line 220
    .line 221
    check-cast p1, Ljava/util/TreeSet;

    .line 222
    .line 223
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 224
    .line 225
    .line 226
    return-object p0

    .line 227
    :pswitch_11
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 228
    .line 229
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getStarred()Ljava/util/Date;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    return-object p0

    .line 234
    :pswitch_12
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 235
    .line 236
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getAlbumCount()I

    .line 237
    .line 238
    .line 239
    move-result p0

    .line 240
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    return-object p0

    .line 245
    :pswitch_13
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 246
    .line 247
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    return-object p0

    .line 252
    :pswitch_14
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 253
    .line 254
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getCreated()Ljava/util/Date;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    return-object p0

    .line 259
    :pswitch_15
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 260
    .line 261
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getStarred()Ljava/util/Date;

    .line 262
    .line 263
    .line 264
    move-result-object p0

    .line 265
    return-object p0

    .line 266
    :pswitch_16
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 267
    .line 268
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getName()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    return-object p0

    .line 273
    :pswitch_17
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 274
    .line 275
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getPlayCount()Ljava/lang/Long;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    if-eqz p0, :cond_8

    .line 280
    .line 281
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getPlayCount()Ljava/lang/Long;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 286
    .line 287
    .line 288
    move-result-wide v1

    .line 289
    :cond_8
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    return-object p0

    .line 294
    :pswitch_18
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 295
    .line 296
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getPlayed()Ljava/util/Date;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    if-eqz p0, :cond_9

    .line 301
    .line 302
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getPlayed()Ljava/util/Date;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    goto :goto_5

    .line 307
    :cond_9
    new-instance p0, Ljava/util/Date;

    .line 308
    .line 309
    invoke-direct {p0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 310
    .line 311
    .line 312
    :goto_5
    return-object p0

    .line 313
    :pswitch_19
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 314
    .line 315
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getCreated()Ljava/util/Date;

    .line 316
    .line 317
    .line 318
    move-result-object p0

    .line 319
    if-eqz p0, :cond_a

    .line 320
    .line 321
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getCreated()Ljava/util/Date;

    .line 322
    .line 323
    .line 324
    move-result-object p0

    .line 325
    goto :goto_6

    .line 326
    :cond_a
    new-instance p0, Ljava/util/Date;

    .line 327
    .line 328
    invoke-direct {p0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 329
    .line 330
    .line 331
    :goto_6
    return-object p0

    .line 332
    :pswitch_1a
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 333
    .line 334
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getYear()I

    .line 335
    .line 336
    .line 337
    move-result p0

    .line 338
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 339
    .line 340
    .line 341
    move-result-object p0

    .line 342
    return-object p0

    .line 343
    :pswitch_1b
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 344
    .line 345
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getArtist()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object p0

    .line 349
    if-eqz p0, :cond_b

    .line 350
    .line 351
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getArtist()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    :cond_b
    return-object v0

    .line 356
    :pswitch_1c
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 357
    .line 358
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getName()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    if-eqz p0, :cond_c

    .line 363
    .line 364
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getName()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    :cond_c
    return-object v0

    .line 369
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
