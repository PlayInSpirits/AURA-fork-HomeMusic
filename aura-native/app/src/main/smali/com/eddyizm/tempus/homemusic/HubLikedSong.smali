.class public final Lcom/eddyizm/tempus/homemusic/HubLikedSong;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private album:Ljava/lang/String;
    .annotation runtime Ldefpackage/ka4;
        value = "album_title"
    .end annotation
.end field

.field private albumId:Ljava/lang/String;
    .annotation runtime Ldefpackage/ka4;
        value = "nd_album_id"
    .end annotation
.end field

.field private artist:Ljava/lang/String;

.field private artistId:Ljava/lang/String;
    .annotation runtime Ldefpackage/ka4;
        value = "nd_artist_id"
    .end annotation
.end field

.field private coverUrl:Ljava/lang/String;
    .annotation runtime Ldefpackage/ka4;
        value = "cover_url"
    .end annotation
.end field

.field private disc:Ljava/lang/Integer;
    .annotation runtime Ldefpackage/ka4;
        value = "disc_no"
    .end annotation
.end field

.field private duration:Ljava/lang/Double;
    .annotation runtime Ldefpackage/ka4;
        value = "duration_s"
    .end annotation
.end field

.field private ref:Ljava/lang/String;

.field private songId:Ljava/lang/String;
    .annotation runtime Ldefpackage/ka4;
        value = "nd_song_id"
    .end annotation
.end field

.field private title:Ljava/lang/String;

.field private track:Ljava/lang/Integer;
    .annotation runtime Ldefpackage/ka4;
        value = "track_no"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final child(Ljava/lang/String;J)Lcom/eddyizm/tempus/subsonic/models/Child;
    .locals 45

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->songId:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    move-object v5, v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v5, 0x0

    .line 19
    :goto_0
    iget-object v1, v0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->coverUrl:Ljava/lang/String;

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const-string v6, "/"

    .line 26
    .line 27
    invoke-static {v1, v6, v4}, Ldefpackage/xm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-eqz v6, :cond_2

    .line 32
    .line 33
    new-array v6, v3, [C

    .line 34
    .line 35
    const/16 v7, 0x2f

    .line 36
    .line 37
    aput-char v7, v6, v4

    .line 38
    .line 39
    move-object/from16 v7, p1

    .line 40
    .line 41
    invoke-static {v7, v6}, Ldefpackage/qm4;->L0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    new-instance v7, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    goto :goto_1

    .line 61
    :cond_1
    const/4 v1, 0x0

    .line 62
    :cond_2
    :goto_1
    if-eqz v5, :cond_3

    .line 63
    .line 64
    move v6, v4

    .line 65
    new-instance v4, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 66
    .line 67
    const/16 v41, 0x7

    .line 68
    .line 69
    const/16 v42, 0x0

    .line 70
    .line 71
    move v7, v6

    .line 72
    const/4 v6, 0x0

    .line 73
    move v8, v7

    .line 74
    const/4 v7, 0x0

    .line 75
    move v9, v8

    .line 76
    const/4 v8, 0x0

    .line 77
    move v10, v9

    .line 78
    const/4 v9, 0x0

    .line 79
    move v11, v10

    .line 80
    const/4 v10, 0x0

    .line 81
    move v12, v11

    .line 82
    const/4 v11, 0x0

    .line 83
    move v13, v12

    .line 84
    const/4 v12, 0x0

    .line 85
    move v14, v13

    .line 86
    const/4 v13, 0x0

    .line 87
    move v15, v14

    .line 88
    const/4 v14, 0x0

    .line 89
    move/from16 v16, v15

    .line 90
    .line 91
    const/4 v15, 0x0

    .line 92
    move/from16 v17, v16

    .line 93
    .line 94
    const/16 v16, 0x0

    .line 95
    .line 96
    move/from16 v18, v17

    .line 97
    .line 98
    const/16 v17, 0x0

    .line 99
    .line 100
    move/from16 v19, v18

    .line 101
    .line 102
    const/16 v18, 0x0

    .line 103
    .line 104
    move/from16 v20, v19

    .line 105
    .line 106
    const/16 v19, 0x0

    .line 107
    .line 108
    move/from16 v21, v20

    .line 109
    .line 110
    const/16 v20, 0x0

    .line 111
    .line 112
    move/from16 v22, v21

    .line 113
    .line 114
    const/16 v21, 0x0

    .line 115
    .line 116
    move/from16 v23, v22

    .line 117
    .line 118
    const/16 v22, 0x0

    .line 119
    .line 120
    move/from16 v24, v23

    .line 121
    .line 122
    const/16 v23, 0x0

    .line 123
    .line 124
    move/from16 v25, v24

    .line 125
    .line 126
    const/16 v24, 0x0

    .line 127
    .line 128
    move/from16 v26, v25

    .line 129
    .line 130
    const/16 v25, 0x0

    .line 131
    .line 132
    move/from16 v27, v26

    .line 133
    .line 134
    const/16 v26, 0x0

    .line 135
    .line 136
    move/from16 v28, v27

    .line 137
    .line 138
    const/16 v27, 0x0

    .line 139
    .line 140
    move/from16 v29, v28

    .line 141
    .line 142
    const/16 v28, 0x0

    .line 143
    .line 144
    move/from16 v30, v29

    .line 145
    .line 146
    const/16 v29, 0x0

    .line 147
    .line 148
    move/from16 v31, v30

    .line 149
    .line 150
    const/16 v30, 0x0

    .line 151
    .line 152
    move/from16 v32, v31

    .line 153
    .line 154
    const/16 v31, 0x0

    .line 155
    .line 156
    move/from16 v33, v32

    .line 157
    .line 158
    const/16 v32, 0x0

    .line 159
    .line 160
    move/from16 v34, v33

    .line 161
    .line 162
    const/16 v33, 0x0

    .line 163
    .line 164
    move/from16 v35, v34

    .line 165
    .line 166
    const/16 v34, 0x0

    .line 167
    .line 168
    move/from16 v36, v35

    .line 169
    .line 170
    const/16 v35, 0x0

    .line 171
    .line 172
    move/from16 v37, v36

    .line 173
    .line 174
    const/16 v36, 0x0

    .line 175
    .line 176
    move/from16 v38, v37

    .line 177
    .line 178
    const/16 v37, 0x0

    .line 179
    .line 180
    move/from16 v39, v38

    .line 181
    .line 182
    const/16 v38, 0x0

    .line 183
    .line 184
    move/from16 v40, v39

    .line 185
    .line 186
    const/16 v39, 0x0

    .line 187
    .line 188
    move/from16 v43, v40

    .line 189
    .line 190
    const/16 v40, -0x2

    .line 191
    .line 192
    move/from16 v2, v43

    .line 193
    .line 194
    const/16 v44, 0x0

    .line 195
    .line 196
    invoke-direct/range {v4 .. v42}, Lcom/eddyizm/tempus/subsonic/models/Child;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;Ljava/lang/String;IILdefpackage/xj0;)V

    .line 197
    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_3
    move v2, v4

    .line 201
    const/16 v44, 0x0

    .line 202
    .line 203
    sget-object v4, Ldefpackage/ot1;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 204
    .line 205
    new-instance v4, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;

    .line 206
    .line 207
    invoke-direct {v4}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;-><init>()V

    .line 208
    .line 209
    .line 210
    iget-object v6, v0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->ref:Ljava/lang/String;

    .line 211
    .line 212
    invoke-virtual {v4, v6}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->setRef(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    iget-object v6, v0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->title:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {v4, v6}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->setTitle(Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    iget-object v6, v0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->artist:Ljava/lang/String;

    .line 221
    .line 222
    invoke-virtual {v4, v6}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->setArtist(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    iget-object v6, v0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->album:Ljava/lang/String;

    .line 226
    .line 227
    invoke-virtual {v4, v6}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->setAlbum(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4, v1}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->setCoverUrl(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    iget-object v6, v0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->duration:Ljava/lang/Double;

    .line 234
    .line 235
    invoke-virtual {v4, v6}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->setDurationS(Ljava/lang/Double;)V

    .line 236
    .line 237
    .line 238
    invoke-static {v4}, Ldefpackage/ot1;->b(Lcom/eddyizm/tempus/homemusic/HubTracks$Item;)Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    if-nez v4, :cond_4

    .line 243
    .line 244
    return-object v44

    .line 245
    :cond_4
    :goto_2
    iget-object v6, v0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->title:Ljava/lang/String;

    .line 246
    .line 247
    invoke-virtual {v4, v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTitle(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    iget-object v6, v0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->artist:Ljava/lang/String;

    .line 251
    .line 252
    invoke-virtual {v4, v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->setArtist(Ljava/lang/String;)V

    .line 253
    .line 254
    .line 255
    iget-object v6, v0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->album:Ljava/lang/String;

    .line 256
    .line 257
    invoke-virtual {v4, v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbum(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    iget-object v6, v0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->albumId:Ljava/lang/String;

    .line 261
    .line 262
    invoke-virtual {v4, v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbumId(Ljava/lang/String;)V

    .line 263
    .line 264
    .line 265
    iget-object v6, v0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->artistId:Ljava/lang/String;

    .line 266
    .line 267
    invoke-virtual {v4, v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->setArtistId(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    if-eqz v5, :cond_5

    .line 271
    .line 272
    iget-object v5, v0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->coverUrl:Ljava/lang/String;

    .line 273
    .line 274
    if-eqz v5, :cond_5

    .line 275
    .line 276
    const-string v6, "/api/nd/cover/"

    .line 277
    .line 278
    invoke-static {v5, v6, v2}, Ldefpackage/xm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    if-ne v2, v3, :cond_5

    .line 283
    .line 284
    iget-object v1, v0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->coverUrl:Ljava/lang/String;

    .line 285
    .line 286
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    invoke-static {v1, v6}, Ldefpackage/qm4;->F0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    const/16 v2, 0x3f

    .line 294
    .line 295
    invoke-static {v1, v2}, Ldefpackage/qm4;->H0(Ljava/lang/String;C)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v1

    .line 299
    sget-object v2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 300
    .line 301
    invoke-virtual {v2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    invoke-static {v1, v2}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    :cond_5
    invoke-virtual {v4, v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->setCoverArtId(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    iget-object v1, v0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->duration:Ljava/lang/Double;

    .line 313
    .line 314
    if-eqz v1, :cond_6

    .line 315
    .line 316
    invoke-virtual {v1}, Ljava/lang/Double;->doubleValue()D

    .line 317
    .line 318
    .line 319
    move-result-wide v1

    .line 320
    double-to-int v1, v1

    .line 321
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    goto :goto_3

    .line 326
    :cond_6
    move-object/from16 v2, v44

    .line 327
    .line 328
    :goto_3
    invoke-virtual {v4, v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDuration(Ljava/lang/Integer;)V

    .line 329
    .line 330
    .line 331
    iget-object v1, v0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->track:Ljava/lang/Integer;

    .line 332
    .line 333
    invoke-virtual {v4, v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTrack(Ljava/lang/Integer;)V

    .line 334
    .line 335
    .line 336
    iget-object v0, v0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->disc:Ljava/lang/Integer;

    .line 337
    .line 338
    invoke-virtual {v4, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setDiscNumber(Ljava/lang/Integer;)V

    .line 339
    .line 340
    .line 341
    new-instance v0, Ljava/util/Date;

    .line 342
    .line 343
    move-wide/from16 v1, p2

    .line 344
    .line 345
    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v4, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setStarred(Ljava/util/Date;)V

    .line 349
    .line 350
    .line 351
    return-object v4
.end method

.method public final getAlbum()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->album:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAlbumId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->albumId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getArtist()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->artist:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getArtistId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->artistId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCoverUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->coverUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDisc()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->disc:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDuration()Ljava/lang/Double;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->duration:Ljava/lang/Double;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getRef()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->ref:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSongId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->songId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTrack()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->track:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setAlbum(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->album:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setAlbumId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->albumId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setArtist(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->artist:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setArtistId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->artistId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setCoverUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->coverUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setDisc(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->disc:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setDuration(Ljava/lang/Double;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->duration:Ljava/lang/Double;

    .line 2
    .line 3
    return-void
.end method

.method public final setRef(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->ref:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setSongId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->songId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setTrack(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubLikedSong;->track:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method
