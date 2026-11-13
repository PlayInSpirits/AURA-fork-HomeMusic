.class public final Ldefpackage/h61;
.super Ldefpackage/si0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/h61;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final k(Ldefpackage/z34;Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget p0, p0, Ldefpackage/h61;->g:I

    .line 2
    .line 3
    const/4 v0, 0x7

    .line 4
    const/4 v1, 0x2

    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x5

    .line 8
    const/4 v5, 0x6

    .line 9
    const/4 v6, 0x1

    .line 10
    packed-switch p0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast p2, Lcom/eddyizm/tempus/model/Server;

    .line 14
    .line 15
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Server;->getServerId()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    invoke-interface {p1, v6}, Ldefpackage/z34;->e(I)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Server;->getServerId()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-interface {p1, v6, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Server;->getServerName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    if-nez p0, :cond_1

    .line 37
    .line 38
    invoke-interface {p1, v1}, Ldefpackage/z34;->e(I)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Server;->getServerName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-interface {p1, v1, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    :goto_1
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Server;->getUsername()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    if-nez p0, :cond_2

    .line 54
    .line 55
    invoke-interface {p1, v2}, Ldefpackage/z34;->e(I)V

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_2
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Server;->getUsername()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-interface {p1, v2, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :goto_2
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Server;->getPassword()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    if-nez p0, :cond_3

    .line 71
    .line 72
    invoke-interface {p1, v3}, Ldefpackage/z34;->e(I)V

    .line 73
    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_3
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Server;->getPassword()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-interface {p1, v3, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :goto_3
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Server;->getAddress()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-nez p0, :cond_4

    .line 88
    .line 89
    invoke-interface {p1, v4}, Ldefpackage/z34;->e(I)V

    .line 90
    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_4
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Server;->getAddress()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-interface {p1, v4, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 98
    .line 99
    .line 100
    :goto_4
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Server;->getLocalAddress()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    if-nez p0, :cond_5

    .line 105
    .line 106
    invoke-interface {p1, v5}, Ldefpackage/z34;->e(I)V

    .line 107
    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_5
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Server;->getLocalAddress()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-interface {p1, v5, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 115
    .line 116
    .line 117
    :goto_5
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Server;->getTimestamp()J

    .line 118
    .line 119
    .line 120
    move-result-wide v1

    .line 121
    invoke-interface {p1, v0, v1, v2}, Ldefpackage/z34;->c(IJ)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Server;->isLowSecurity()Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    const/16 v0, 0x8

    .line 129
    .line 130
    int-to-long v1, p0

    .line 131
    invoke-interface {p1, v0, v1, v2}, Ldefpackage/z34;->c(IJ)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Server;->getClientCert()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    const/16 v0, 0x9

    .line 139
    .line 140
    if-nez p0, :cond_6

    .line 141
    .line 142
    invoke-interface {p1, v0}, Ldefpackage/z34;->e(I)V

    .line 143
    .line 144
    .line 145
    goto :goto_6

    .line 146
    :cond_6
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Server;->getClientCert()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-interface {p1, v0, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 151
    .line 152
    .line 153
    :goto_6
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Server;->getServerId()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    const/16 v0, 0xa

    .line 158
    .line 159
    if-nez p0, :cond_7

    .line 160
    .line 161
    invoke-interface {p1, v0}, Ldefpackage/z34;->e(I)V

    .line 162
    .line 163
    .line 164
    goto :goto_7

    .line 165
    :cond_7
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Server;->getServerId()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    invoke-interface {p1, v0, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 170
    .line 171
    .line 172
    :goto_7
    return-void

    .line 173
    :pswitch_0
    check-cast p2, Lcom/eddyizm/tempus/model/Server;

    .line 174
    .line 175
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Server;->getServerId()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    if-nez p0, :cond_8

    .line 180
    .line 181
    invoke-interface {p1, v6}, Ldefpackage/z34;->e(I)V

    .line 182
    .line 183
    .line 184
    goto :goto_8

    .line 185
    :cond_8
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Server;->getServerId()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    invoke-interface {p1, v6, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 190
    .line 191
    .line 192
    :goto_8
    return-void

    .line 193
    :pswitch_1
    check-cast p2, Lcom/eddyizm/tempus/model/RecentSearch;

    .line 194
    .line 195
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/RecentSearch;->getSearch()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    if-nez p0, :cond_9

    .line 200
    .line 201
    invoke-interface {p1, v6}, Ldefpackage/z34;->e(I)V

    .line 202
    .line 203
    .line 204
    goto :goto_9

    .line 205
    :cond_9
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/RecentSearch;->getSearch()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    invoke-interface {p1, v6, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 210
    .line 211
    .line 212
    :goto_9
    return-void

    .line 213
    :pswitch_2
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 214
    .line 215
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    if-nez p0, :cond_a

    .line 220
    .line 221
    invoke-interface {p1, v6}, Ldefpackage/z34;->e(I)V

    .line 222
    .line 223
    .line 224
    goto :goto_a

    .line 225
    :cond_a
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    invoke-interface {p1, v6, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 230
    .line 231
    .line 232
    :goto_a
    return-void

    .line 233
    :pswitch_3
    check-cast p2, Lcom/eddyizm/tempus/model/InternetRadioStationCache;

    .line 234
    .line 235
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getId()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    if-nez p0, :cond_b

    .line 240
    .line 241
    invoke-interface {p1, v6}, Ldefpackage/z34;->e(I)V

    .line 242
    .line 243
    .line 244
    goto :goto_b

    .line 245
    :cond_b
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getId()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    invoke-interface {p1, v6, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 250
    .line 251
    .line 252
    :goto_b
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getName()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    if-nez p0, :cond_c

    .line 257
    .line 258
    invoke-interface {p1, v1}, Ldefpackage/z34;->e(I)V

    .line 259
    .line 260
    .line 261
    goto :goto_c

    .line 262
    :cond_c
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getName()Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    invoke-interface {p1, v1, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 267
    .line 268
    .line 269
    :goto_c
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getStreamUrl()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    if-nez p0, :cond_d

    .line 274
    .line 275
    invoke-interface {p1, v2}, Ldefpackage/z34;->e(I)V

    .line 276
    .line 277
    .line 278
    goto :goto_d

    .line 279
    :cond_d
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getStreamUrl()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object p0

    .line 283
    invoke-interface {p1, v2, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 284
    .line 285
    .line 286
    :goto_d
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getHomePageUrl()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    if-nez p0, :cond_e

    .line 291
    .line 292
    invoke-interface {p1, v3}, Ldefpackage/z34;->e(I)V

    .line 293
    .line 294
    .line 295
    goto :goto_e

    .line 296
    :cond_e
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getHomePageUrl()Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    invoke-interface {p1, v3, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 301
    .line 302
    .line 303
    :goto_e
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getSource()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object p0

    .line 307
    if-nez p0, :cond_f

    .line 308
    .line 309
    invoke-interface {p1, v4}, Ldefpackage/z34;->e(I)V

    .line 310
    .line 311
    .line 312
    goto :goto_f

    .line 313
    :cond_f
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getSource()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object p0

    .line 317
    invoke-interface {p1, v4, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 318
    .line 319
    .line 320
    :goto_f
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getCoverArtUrl()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    if-nez p0, :cond_10

    .line 325
    .line 326
    invoke-interface {p1, v5}, Ldefpackage/z34;->e(I)V

    .line 327
    .line 328
    .line 329
    goto :goto_10

    .line 330
    :cond_10
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getCoverArtUrl()Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    invoke-interface {p1, v5, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 335
    .line 336
    .line 337
    :goto_10
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getId()Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    if-nez p0, :cond_11

    .line 342
    .line 343
    invoke-interface {p1, v0}, Ldefpackage/z34;->e(I)V

    .line 344
    .line 345
    .line 346
    goto :goto_11

    .line 347
    :cond_11
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->getId()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object p0

    .line 351
    invoke-interface {p1, v0, p0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 352
    .line 353
    .line 354
    :goto_11
    return-void

    .line 355
    :pswitch_4
    check-cast p2, Lcom/eddyizm/tempus/model/Favorite;

    .line 356
    .line 357
    invoke-virtual {p2}, Lcom/eddyizm/tempus/model/Favorite;->getTimestamp()J

    .line 358
    .line 359
    .line 360
    move-result-wide v0

    .line 361
    invoke-interface {p1, v6, v0, v1}, Ldefpackage/z34;->c(IJ)V

    .line 362
    .line 363
    .line 364
    return-void

    .line 365
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r()Ljava/lang/String;
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/h61;->g:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "UPDATE OR ABORT `server` SET `id` = ?,`server_name` = ?,`username` = ?,`password` = ?,`address` = ?,`local_address` = ?,`timestamp` = ?,`low_security` = ?,`client_cert` = ? WHERE `id` = ?"

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    const-string p0, "DELETE FROM `server` WHERE `id` = ?"

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    const-string p0, "DELETE FROM `recent_search` WHERE `search` = ?"

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    const-string p0, "DELETE FROM `playlist` WHERE `id` = ?"

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    const-string p0, "UPDATE OR ABORT `internet_radio_station_cache` SET `id` = ?,`name` = ?,`stream_url` = ?,`home_page_url` = ?,`source` = ?,`cover_art_url` = ? WHERE `id` = ?"

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    const-string p0, "DELETE FROM `favorite` WHERE `timestamp` = ?"

    .line 22
    .line 23
    return-object p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
