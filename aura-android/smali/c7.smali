.class public final synthetic Lc7;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 9
    iput p1, p0, Lc7;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Leu0;)V
    .locals 0

    .line 1
    const/16 p1, 0xa

    .line 2
    .line 3
    iput p1, p0, Lc7;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    iget p0, p0, Lc7;->a:I

    .line 2
    .line 3
    const-string v0, "completed"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Integer;

    .line 11
    .line 12
    invoke-static {p1}, Ljava/util/Objects;->nonNull(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :pswitch_0
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 18
    .line 19
    invoke-static {p1}, Ljava/util/Objects;->nonNull(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :pswitch_1
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getStatus()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_0

    .line 37
    .line 38
    move v1, v2

    .line 39
    :cond_0
    return v1

    .line 40
    :pswitch_2
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;

    .line 41
    .line 42
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getStatus()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0

    .line 51
    :pswitch_3
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;

    .line 52
    .line 53
    invoke-static {p1}, Ljava/util/Objects;->nonNull(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    return p0

    .line 58
    :pswitch_4
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-eqz p0, :cond_1

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    const-string v3, "min_star_rating"

    .line 86
    .line 87
    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-ge p0, v0, :cond_2

    .line 92
    .line 93
    :cond_1
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    if-nez p0, :cond_3

    .line 98
    .line 99
    :cond_2
    move v1, v2

    .line 100
    :cond_3
    return v1

    .line 101
    :pswitch_5
    check-cast p1, Lcom/eddyizm/tempus/model/HomeSector;

    .line 102
    .line 103
    const-string p0, "HOME_SECTOR_CONTINUE_LISTENING"

    .line 104
    .line 105
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/HomeSector;->getId()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    return p0

    .line 114
    :pswitch_6
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;

    .line 115
    .line 116
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getStatus()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    return p0

    .line 125
    :pswitch_7
    check-cast p1, Lns0;

    .line 126
    .line 127
    iget-object p0, p1, Lns0;->a:Ltt0;

    .line 128
    .line 129
    iget-object p0, p0, Ltt0;->t:[B

    .line 130
    .line 131
    sget-object p1, Leu0;->c:[B

    .line 132
    .line 133
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    xor-int/2addr p0, v2

    .line 138
    return p0

    .line 139
    :pswitch_8
    check-cast p1, Lns0;

    .line 140
    .line 141
    iget-object p0, p1, Lns0;->a:Ltt0;

    .line 142
    .line 143
    iget-object p0, p0, Ltt0;->t:[B

    .line 144
    .line 145
    sget-object v0, Leu0;->c:[B

    .line 146
    .line 147
    invoke-static {p0, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 148
    .line 149
    .line 150
    move-result p0

    .line 151
    if-nez p0, :cond_5

    .line 152
    .line 153
    iget p0, p1, Lns0;->b:I

    .line 154
    .line 155
    if-eqz p0, :cond_4

    .line 156
    .line 157
    const/4 p1, 0x2

    .line 158
    if-eq p0, p1, :cond_4

    .line 159
    .line 160
    const/4 p1, 0x7

    .line 161
    if-ne p0, p1, :cond_5

    .line 162
    .line 163
    :cond_4
    move v1, v2

    .line 164
    :cond_5
    return v1

    .line 165
    :pswitch_9
    check-cast p1, Lns0;

    .line 166
    .line 167
    sget p0, Lcom/eddyizm/tempus/service/DownloaderService;->w:F

    .line 168
    .line 169
    iget-object p0, p1, Lns0;->a:Ltt0;

    .line 170
    .line 171
    iget-object p0, p0, Ltt0;->t:[B

    .line 172
    .line 173
    sget-object p1, Leu0;->c:[B

    .line 174
    .line 175
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 176
    .line 177
    .line 178
    move-result p0

    .line 179
    xor-int/2addr p0, v2

    .line 180
    return p0

    .line 181
    :pswitch_a
    check-cast p1, Lgn2;

    .line 182
    .line 183
    iget-object p0, p1, Lgn2;->a:Ljava/lang/String;

    .line 184
    .line 185
    invoke-static {p0}, Leu0;->d(Ljava/lang/String;)Z

    .line 186
    .line 187
    .line 188
    move-result p0

    .line 189
    return p0

    .line 190
    :pswitch_b
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 191
    .line 192
    invoke-static {p1}, Lg51;->e(Lcom/eddyizm/tempus/subsonic/models/Child;)Landroid/net/Uri;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    if-nez p0, :cond_6

    .line 197
    .line 198
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    sget-object p1, Li51;->b:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 203
    .line 204
    invoke-virtual {p1, p0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result p0

    .line 208
    if-nez p0, :cond_6

    .line 209
    .line 210
    move v1, v2

    .line 211
    :cond_6
    return v1

    .line 212
    :pswitch_c
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 213
    .line 214
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getYear()Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    invoke-static {p0}, Ljava/util/Objects;->nonNull(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result p0

    .line 222
    return p0

    .line 223
    :pswitch_d
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 224
    .line 225
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getGenre()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object p0

    .line 229
    invoke-static {p0}, Ljava/util/Objects;->nonNull(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result p0

    .line 233
    return p0

    .line 234
    :pswitch_e
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 235
    .line 236
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    invoke-static {p0}, Ljava/util/Objects;->nonNull(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result p0

    .line 244
    return p0

    .line 245
    :pswitch_f
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 246
    .line 247
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    invoke-static {p0}, Ljava/util/Objects;->nonNull(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result p0

    .line 255
    return p0

    .line 256
    :pswitch_10
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 257
    .line 258
    instance-of p0, p1, Lcom/eddyizm/tempus/model/Download;

    .line 259
    .line 260
    if-eqz p0, :cond_7

    .line 261
    .line 262
    check-cast p1, Lcom/eddyizm/tempus/model/Download;

    .line 263
    .line 264
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/Download;->getPlaylistId()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    if-eqz p0, :cond_7

    .line 269
    .line 270
    move v1, v2

    .line 271
    :cond_7
    return v1

    .line 272
    :pswitch_11
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 273
    .line 274
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    invoke-static {p0}, Ljava/util/Objects;->nonNull(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    move-result p0

    .line 282
    return p0

    .line 283
    :pswitch_12
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 284
    .line 285
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->isDir()Z

    .line 286
    .line 287
    .line 288
    move-result p0

    .line 289
    xor-int/2addr p0, v2

    .line 290
    return p0

    .line 291
    :pswitch_13
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 292
    .line 293
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->isDir()Z

    .line 294
    .line 295
    .line 296
    move-result p0

    .line 297
    xor-int/2addr p0, v2

    .line 298
    return p0

    .line 299
    :pswitch_14
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 300
    .line 301
    invoke-static {p1}, Lg51;->e(Lcom/eddyizm/tempus/subsonic/models/Child;)Landroid/net/Uri;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    if-eqz p0, :cond_8

    .line 306
    .line 307
    move v1, v2

    .line 308
    :cond_8
    return v1

    .line 309
    :pswitch_data_0
    .packed-switch 0x0
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
