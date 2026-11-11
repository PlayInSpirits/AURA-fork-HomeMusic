.class public final Lcom/eddyizm/tempus/homemusic/HubFavoriteSnapshot;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private albumIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lka4;
        value = "album_ids"
    .end annotation
.end field

.field private artistIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lka4;
        value = "artist_ids"
    .end annotation
.end field

.field private refs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private songIds:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lka4;
        value = "song_ids"
    .end annotation
.end field

.field private subjects:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;",
            ">;"
        }
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
.method public final getAlbumIds()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSnapshot;->albumIds:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getArtistIds()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSnapshot;->artistIds:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getRefs()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSnapshot;->refs:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSongIds()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSnapshot;->songIds:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSubjects()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSnapshot;->subjects:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setAlbumIds(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSnapshot;->albumIds:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setArtistIds(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSnapshot;->artistIds:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setRefs(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSnapshot;->refs:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setSongIds(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSnapshot;->songIds:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setSubjects(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSnapshot;->subjects:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final states()Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm61;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSnapshot;->subjects:Ljava/util/List;

    .line 7
    .line 8
    sget-object v2, Lu01;->n:Lu01;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    move-object v1, v2

    .line 13
    :cond_0
    new-instance v3, Lca1;

    .line 14
    .line 15
    const/16 v4, 0x1b

    .line 16
    .line 17
    invoke-direct {v3, v4}, Lca1;-><init>(I)V

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v3}, Lq40;->K0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const-string v4, "hub:"

    .line 33
    .line 34
    const/4 v5, 0x3

    .line 35
    const/4 v6, 0x2

    .line 36
    const/4 v7, 0x1

    .line 37
    if-eqz v3, :cond_c

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;

    .line 44
    .line 45
    invoke-virtual {v3}, Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;->getTargetType()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    if-eqz v8, :cond_1

    .line 50
    .line 51
    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v9

    .line 55
    const v10, -0x53fd20b9

    .line 56
    .line 57
    .line 58
    if-eq v9, v10, :cond_5

    .line 59
    .line 60
    const v5, 0x5897e6f

    .line 61
    .line 62
    .line 63
    if-eq v9, v5, :cond_3

    .line 64
    .line 65
    const v5, 0x697f14b

    .line 66
    .line 67
    .line 68
    if-eq v9, v5, :cond_2

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    const-string v5, "track"

    .line 72
    .line 73
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-eqz v5, :cond_1

    .line 78
    .line 79
    move v5, v7

    .line 80
    goto :goto_1

    .line 81
    :cond_3
    const-string v5, "album"

    .line 82
    .line 83
    invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-nez v5, :cond_4

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    move v5, v6

    .line 91
    goto :goto_1

    .line 92
    :cond_5
    const-string v6, "artist"

    .line 93
    .line 94
    invoke-virtual {v8, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v6

    .line 98
    if-nez v6, :cond_6

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_6
    :goto_1
    invoke-virtual {v3}, Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;->getAliases()Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    if-nez v6, :cond_7

    .line 106
    .line 107
    move-object v6, v2

    .line 108
    :cond_7
    invoke-virtual {v3}, Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;->getRef()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    const-string v8, "ref:"

    .line 113
    .line 114
    const/4 v9, 0x0

    .line 115
    if-eqz v7, :cond_8

    .line 116
    .line 117
    invoke-virtual {v8, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v7

    .line 121
    goto :goto_2

    .line 122
    :cond_8
    move-object v7, v9

    .line 123
    :goto_2
    invoke-virtual {v3}, Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;->getNdId()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    const-string v11, "nd:"

    .line 128
    .line 129
    if-eqz v10, :cond_9

    .line 130
    .line 131
    invoke-virtual {v11, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v9

    .line 135
    :cond_9
    filled-new-array {v7, v9}, [Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    invoke-static {v7}, Lti;->i0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    invoke-static {v6, v7}, Lq40;->G0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 144
    .line 145
    .line 146
    move-result-object v6

    .line 147
    invoke-static {v6}, Lq40;->t0(Ljava/util/ArrayList;)Ljava/util/List;

    .line 148
    .line 149
    .line 150
    move-result-object v6

    .line 151
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    :cond_a
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 156
    .line 157
    .line 158
    move-result v7

    .line 159
    if-eqz v7, :cond_1

    .line 160
    .line 161
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    check-cast v7, Ljava/lang/String;

    .line 166
    .line 167
    const/4 v9, 0x0

    .line 168
    invoke-static {v7, v8, v9}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 169
    .line 170
    .line 171
    move-result v10

    .line 172
    if-eqz v10, :cond_b

    .line 173
    .line 174
    invoke-static {v7, v8}, Lqm4;->z0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v7

    .line 178
    invoke-virtual {v4, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    goto :goto_4

    .line 183
    :cond_b
    invoke-static {v7, v11, v9}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 184
    .line 185
    .line 186
    move-result v9

    .line 187
    if-eqz v9, :cond_a

    .line 188
    .line 189
    invoke-static {v7, v11}, Lqm4;->z0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v7

    .line 193
    :goto_4
    new-instance v9, Lm61;

    .line 194
    .line 195
    invoke-virtual {v3}, Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;->getLiked()Z

    .line 196
    .line 197
    .line 198
    move-result v10

    .line 199
    invoke-direct {v9, v5, v7, v10}, Lm61;-><init>(ILjava/lang/String;Z)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_c
    iget-object v1, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSnapshot;->songIds:Ljava/util/List;

    .line 207
    .line 208
    if-nez v1, :cond_d

    .line 209
    .line 210
    move-object v1, v2

    .line 211
    :cond_d
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    if-eqz v3, :cond_e

    .line 220
    .line 221
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    check-cast v3, Ljava/lang/String;

    .line 226
    .line 227
    new-instance v8, Lm61;

    .line 228
    .line 229
    invoke-direct {v8, v7, v3, v7}, Lm61;-><init>(ILjava/lang/String;Z)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    goto :goto_5

    .line 236
    :cond_e
    iget-object v1, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSnapshot;->albumIds:Ljava/util/List;

    .line 237
    .line 238
    if-nez v1, :cond_f

    .line 239
    .line 240
    move-object v1, v2

    .line 241
    :cond_f
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 246
    .line 247
    .line 248
    move-result v3

    .line 249
    if-eqz v3, :cond_10

    .line 250
    .line 251
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    check-cast v3, Ljava/lang/String;

    .line 256
    .line 257
    new-instance v8, Lm61;

    .line 258
    .line 259
    invoke-direct {v8, v6, v3, v7}, Lm61;-><init>(ILjava/lang/String;Z)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_10
    iget-object v1, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSnapshot;->artistIds:Ljava/util/List;

    .line 267
    .line 268
    if-nez v1, :cond_11

    .line 269
    .line 270
    move-object v1, v2

    .line 271
    :cond_11
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    if-eqz v3, :cond_12

    .line 280
    .line 281
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    check-cast v3, Ljava/lang/String;

    .line 286
    .line 287
    new-instance v6, Lm61;

    .line 288
    .line 289
    invoke-direct {v6, v5, v3, v7}, Lm61;-><init>(ILjava/lang/String;Z)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    goto :goto_7

    .line 296
    :cond_12
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSnapshot;->refs:Ljava/util/List;

    .line 297
    .line 298
    if-nez p0, :cond_13

    .line 299
    .line 300
    goto :goto_8

    .line 301
    :cond_13
    move-object v2, p0

    .line 302
    :goto_8
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    :goto_9
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    if-eqz v1, :cond_14

    .line 311
    .line 312
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    check-cast v1, Ljava/lang/String;

    .line 317
    .line 318
    new-instance v2, Lm61;

    .line 319
    .line 320
    invoke-static {v4, v1}, Lxa3;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    invoke-direct {v2, v7, v1, v7}, Lm61;-><init>(ILjava/lang/String;Z)V

    .line 325
    .line 326
    .line 327
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    goto :goto_9

    .line 331
    :cond_14
    return-object v0
.end method
