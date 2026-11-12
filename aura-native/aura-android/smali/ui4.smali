.class public Lui4;
.super Lhd;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final c:Lxi4;

.field public final d:Lpa;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Lcom/eddyizm/tempus/subsonic/models/Genre;

.field public h:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

.field public i:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

.field public j:Lk03;

.field public k:Ljava/util/ArrayList;

.field public l:Ljava/util/ArrayList;

.field public m:I

.field public final n:I

.field public final o:I


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lhd;-><init>(Landroid/app/Application;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lui4;->k:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lui4;->l:Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iput p1, p0, Lui4;->m:I

    .line 20
    .line 21
    const/16 p1, 0x1f4

    .line 22
    .line 23
    iput p1, p0, Lui4;->n:I

    .line 24
    .line 25
    iput p1, p0, Lui4;->o:I

    .line 26
    .line 27
    new-instance p1, Lxi4;

    .line 28
    .line 29
    const/4 v0, 0x2

    .line 30
    invoke-direct {p1, v0}, Lxi4;-><init>(I)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lui4;->c:Lxi4;

    .line 34
    .line 35
    new-instance p1, Lpa;

    .line 36
    .line 37
    const/16 v0, 0xc

    .line 38
    .line 39
    invoke-direct {p1, v0}, Lpa;-><init>(I)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lui4;->d:Lpa;

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final c()Lk03;
    .locals 13

    .line 1
    new-instance v0, Lk03;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, Lad2;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lui4;->j:Lk03;

    .line 12
    .line 13
    iget-object v0, p0, Lui4;->e:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x4

    .line 23
    const/4 v3, 0x3

    .line 24
    const/4 v4, 0x1

    .line 25
    const/4 v5, -0x1

    .line 26
    sparse-switch v1, :sswitch_data_0

    .line 27
    .line 28
    .line 29
    :goto_0
    move v0, v5

    .line 30
    goto :goto_1

    .line 31
    :sswitch_0
    const-string v1, "MEDIA_BY_YEAR"

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v0, v2

    .line 41
    goto :goto_1

    .line 42
    :sswitch_1
    const-string v1, "MEDIA_BY_GENRES"

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move v0, v3

    .line 52
    goto :goto_1

    .line 53
    :sswitch_2
    const-string v1, "MEDIA_BY_ARTIST"

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    const/4 v0, 0x2

    .line 63
    goto :goto_1

    .line 64
    :sswitch_3
    const-string v1, "MEDIA_STARRED"

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_3

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    move v0, v4

    .line 74
    goto :goto_1

    .line 75
    :sswitch_4
    const-string v1, "MEDIA_BY_GENRE"

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_4

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_4
    const/4 v0, 0x0

    .line 85
    :goto_1
    const-string v1, "BrowsingClient"

    .line 86
    .line 87
    const/4 v10, 0x0

    .line 88
    iget-object v6, p0, Lui4;->c:Lxi4;

    .line 89
    .line 90
    packed-switch v0, :pswitch_data_0

    .line 91
    .line 92
    .line 93
    goto/16 :goto_3

    .line 94
    .line 95
    :pswitch_0
    iget v0, p0, Lui4;->m:I

    .line 96
    .line 97
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iget v1, p0, Lui4;->m:I

    .line 102
    .line 103
    add-int/lit8 v1, v1, 0xa

    .line 104
    .line 105
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget v2, p0, Lui4;->n:I

    .line 113
    .line 114
    invoke-static {v2, v0, v1}, Lxi4;->q(ILjava/lang/Integer;Ljava/lang/Integer;)Lk03;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iput-object v0, p0, Lui4;->j:Lk03;

    .line 119
    .line 120
    goto/16 :goto_3

    .line 121
    .line 122
    :pswitch_1
    iget-object v0, p0, Lui4;->k:Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    new-instance v2, Lk03;

    .line 128
    .line 129
    invoke-direct {v2}, Lad2;-><init>()V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    move v5, v10

    .line 137
    :goto_2
    if-ge v5, v4, :cond_5

    .line 138
    .line 139
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    add-int/lit8 v5, v5, 0x1

    .line 144
    .line 145
    move-object v8, v6

    .line 146
    check-cast v8, Ljava/lang/String;

    .line 147
    .line 148
    invoke-static {v10}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    invoke-virtual {v6}, Lpn4;->a()Lxc5;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    const-string v7, "getSongsByGenre()"

    .line 160
    .line 161
    invoke-static {v1, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 162
    .line 163
    .line 164
    iget-object v7, v6, Lxc5;->p:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v7, Lw8;

    .line 167
    .line 168
    iget-object v6, v6, Lxc5;->o:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v6, Lpn4;

    .line 171
    .line 172
    invoke-virtual {v6}, Lpn4;->f()Ljava/util/HashMap;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    invoke-static {}, Lud3;->k()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v11

    .line 180
    const/16 v9, 0x1f4

    .line 181
    .line 182
    move-object v12, v7

    .line 183
    move-object v7, v6

    .line 184
    move-object v6, v12

    .line 185
    invoke-interface/range {v6 .. v11}, Lw8;->e(Ljava/util/Map;Ljava/lang/String;IILjava/lang/String;)Lretrofit2/Call;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    new-instance v7, Lr8;

    .line 190
    .line 191
    invoke-direct {v7, v2, v3}, Lr8;-><init>(Lk03;I)V

    .line 192
    .line 193
    .line 194
    invoke-interface {v6, v7}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 195
    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_5
    iput-object v2, p0, Lui4;->j:Lk03;

    .line 199
    .line 200
    goto :goto_3

    .line 201
    :pswitch_2
    iget-object v0, p0, Lui4;->h:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 202
    .line 203
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    iget-object v1, p0, Lui4;->d:Lpa;

    .line 208
    .line 209
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    const/16 v1, 0x32

    .line 213
    .line 214
    invoke-static {v1, v0}, Lpa;->z(ILjava/lang/String;)Lk03;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    iput-object v0, p0, Lui4;->j:Lk03;

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :pswitch_3
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-static {v5, v10, v4}, Lxi4;->s(IZZ)Lk03;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    iput-object v0, p0, Lui4;->j:Lk03;

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :pswitch_4
    move-object v0, v6

    .line 232
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    const/16 v3, 0xbb8

    .line 237
    .line 238
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    iget-object v3, p0, Lui4;->g:Lcom/eddyizm/tempus/subsonic/models/Genre;

    .line 243
    .line 244
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Genre;->getGenre()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v8

    .line 248
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    new-instance v0, Lk03;

    .line 252
    .line 253
    invoke-direct {v0}, Lad2;-><init>()V

    .line 254
    .line 255
    .line 256
    invoke-static {v10}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    invoke-virtual {v3}, Lpn4;->a()Lxc5;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    const-string v4, "getRandomSongs()"

    .line 268
    .line 269
    invoke-static {v1, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 270
    .line 271
    .line 272
    iget-object v1, v3, Lxc5;->p:Ljava/lang/Object;

    .line 273
    .line 274
    check-cast v1, Lw8;

    .line 275
    .line 276
    iget-object v3, v3, Lxc5;->o:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast v3, Lpn4;

    .line 279
    .line 280
    invoke-virtual {v3}, Lpn4;->f()Ljava/util/HashMap;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    invoke-static {}, Lud3;->k()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v9

    .line 288
    iget v5, p0, Lui4;->o:I

    .line 289
    .line 290
    move-object v3, v1

    .line 291
    invoke-interface/range {v3 .. v9}, Lw8;->a(Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lretrofit2/Call;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    new-instance v3, Lck;

    .line 296
    .line 297
    invoke-direct {v3, v0, v2}, Lck;-><init>(Lk03;I)V

    .line 298
    .line 299
    .line 300
    invoke-interface {v1, v3}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 301
    .line 302
    .line 303
    iput-object v0, p0, Lui4;->j:Lk03;

    .line 304
    .line 305
    :goto_3
    iget-object p0, p0, Lui4;->j:Lk03;

    .line 306
    .line 307
    return-object p0

    .line 308
    nop

    .line 309
    :sswitch_data_0
    .sparse-switch
        -0x684a2a6a -> :sswitch_4
        -0xe5e209c -> :sswitch_3
        0x55819574 -> :sswitch_2
        0x5f04dd7d -> :sswitch_1
        0x7889e9aa -> :sswitch_0
    .end sparse-switch

    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
