.class public final Lca1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final o:Lca1;

.field public static final p:Lca1;

.field public static final q:Lca1;

.field public static final r:Lca1;

.field public static final s:Lca1;

.field public static final t:Lca1;

.field public static final u:Lca1;

.field public static final v:Lca1;

.field public static final synthetic w:Lca1;


# instance fields
.field public final synthetic n:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lca1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lca1;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lca1;->o:Lca1;

    .line 8
    .line 9
    new-instance v0, Lca1;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Lca1;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lca1;->p:Lca1;

    .line 16
    .line 17
    new-instance v0, Lca1;

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    invoke-direct {v0, v1}, Lca1;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lca1;->q:Lca1;

    .line 24
    .line 25
    new-instance v0, Lca1;

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    invoke-direct {v0, v1}, Lca1;-><init>(I)V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lca1;->r:Lca1;

    .line 32
    .line 33
    new-instance v0, Lca1;

    .line 34
    .line 35
    const/4 v1, 0x4

    .line 36
    invoke-direct {v0, v1}, Lca1;-><init>(I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lca1;->s:Lca1;

    .line 40
    .line 41
    new-instance v0, Lca1;

    .line 42
    .line 43
    const/4 v1, 0x5

    .line 44
    invoke-direct {v0, v1}, Lca1;-><init>(I)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lca1;->t:Lca1;

    .line 48
    .line 49
    new-instance v0, Lca1;

    .line 50
    .line 51
    const/4 v1, 0x6

    .line 52
    invoke-direct {v0, v1}, Lca1;-><init>(I)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lca1;->u:Lca1;

    .line 56
    .line 57
    new-instance v0, Lca1;

    .line 58
    .line 59
    const/4 v1, 0x7

    .line 60
    invoke-direct {v0, v1}, Lca1;-><init>(I)V

    .line 61
    .line 62
    .line 63
    sput-object v0, Lca1;->v:Lca1;

    .line 64
    .line 65
    new-instance v0, Lca1;

    .line 66
    .line 67
    const/16 v1, 0x8

    .line 68
    .line 69
    invoke-direct {v0, v1}, Lca1;-><init>(I)V

    .line 70
    .line 71
    .line 72
    sput-object v0, Lca1;->w:Lca1;

    .line 73
    .line 74
    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lca1;->n:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 7

    .line 1
    iget p0, p0, Lca1;->n:I

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    const-string v1, ""

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch p0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Lh52;

    .line 12
    .line 13
    iget-object p0, p1, Lh52;->a:Ljava/lang/String;

    .line 14
    .line 15
    check-cast p2, Lh52;

    .line 16
    .line 17
    iget-object p1, p2, Lh52;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {p0, p1}, Lfu;->l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :pswitch_0
    check-cast p1, Lkd3;

    .line 25
    .line 26
    iget-object p0, p1, Lkd3;->o:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Ljava/lang/String;

    .line 29
    .line 30
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    check-cast p2, Lkd3;

    .line 40
    .line 41
    iget-object p2, p2, Lkd3;->o:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p2, Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p2, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {p0, p1}, Lfu;->l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    return p0

    .line 57
    :pswitch_1
    check-cast p1, Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;->getProvenance()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    const-string p1, "own"

    .line 64
    .line 65
    invoke-static {p0, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    xor-int/2addr p0, v2

    .line 70
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p2, Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;

    .line 75
    .line 76
    invoke-virtual {p2}, Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;->getProvenance()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-static {p2, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    xor-int/2addr p1, v2

    .line 85
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-static {p0, p1}, Lfu;->l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    return p0

    .line 94
    :pswitch_2
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 95
    .line 96
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getName()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    if-eqz p0, :cond_0

    .line 101
    .line 102
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 103
    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_0
    move-object p0, v1

    .line 116
    :goto_0
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 117
    .line 118
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getName()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    if-eqz p1, :cond_1

    .line 123
    .line 124
    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 125
    .line 126
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    :cond_1
    invoke-static {p0, v1}, Lfu;->l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    return p0

    .line 141
    :pswitch_3
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Artist;

    .line 142
    .line 143
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Artist;->getName()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    if-eqz p0, :cond_2

    .line 148
    .line 149
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 150
    .line 151
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_2
    move-object p0, v1

    .line 163
    :goto_1
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/Artist;

    .line 164
    .line 165
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Artist;->getName()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    if-eqz p1, :cond_3

    .line 170
    .line 171
    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 172
    .line 173
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    :cond_3
    invoke-static {p0, v1}, Lfu;->l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 184
    .line 185
    .line 186
    move-result p0

    .line 187
    return p0

    .line 188
    :pswitch_4
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 189
    .line 190
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    if-eqz p0, :cond_4

    .line 195
    .line 196
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 197
    .line 198
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_4
    move-object p0, v1

    .line 210
    :goto_2
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 211
    .line 212
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    if-eqz p1, :cond_5

    .line 217
    .line 218
    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 219
    .line 220
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    :cond_5
    invoke-static {p0, v1}, Lfu;->l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 231
    .line 232
    .line 233
    move-result p0

    .line 234
    return p0

    .line 235
    :pswitch_5
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 236
    .line 237
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    if-eqz p0, :cond_6

    .line 242
    .line 243
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 244
    .line 245
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    goto :goto_3

    .line 256
    :cond_6
    move-object p0, v1

    .line 257
    :goto_3
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 258
    .line 259
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    if-eqz p1, :cond_7

    .line 264
    .line 265
    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 266
    .line 267
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    :cond_7
    invoke-static {p0, v1}, Lfu;->l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 278
    .line 279
    .line 280
    move-result p0

    .line 281
    return p0

    .line 282
    :pswitch_6
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 283
    .line 284
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getCreated()Ljava/util/Date;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 289
    .line 290
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getCreated()Ljava/util/Date;

    .line 291
    .line 292
    .line 293
    move-result-object p1

    .line 294
    invoke-static {p0, p1}, Lfu;->l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 295
    .line 296
    .line 297
    move-result p0

    .line 298
    return p0

    .line 299
    :pswitch_7
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 300
    .line 301
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getYear()I

    .line 302
    .line 303
    .line 304
    move-result p0

    .line 305
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 310
    .line 311
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getYear()I

    .line 312
    .line 313
    .line 314
    move-result p1

    .line 315
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    invoke-static {p0, p1}, Lfu;->l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 320
    .line 321
    .line 322
    move-result p0

    .line 323
    return p0

    .line 324
    :pswitch_8
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 325
    .line 326
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getYear()I

    .line 327
    .line 328
    .line 329
    move-result p0

    .line 330
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 335
    .line 336
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getYear()I

    .line 337
    .line 338
    .line 339
    move-result p1

    .line 340
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    invoke-static {p0, p1}, Lfu;->l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 345
    .line 346
    .line 347
    move-result p0

    .line 348
    return p0

    .line 349
    :pswitch_9
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 350
    .line 351
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getArtist()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object p0

    .line 355
    if-eqz p0, :cond_8

    .line 356
    .line 357
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 358
    .line 359
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    goto :goto_4

    .line 370
    :cond_8
    move-object p0, v1

    .line 371
    :goto_4
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 372
    .line 373
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getArtist()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object p1

    .line 377
    if-eqz p1, :cond_9

    .line 378
    .line 379
    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 380
    .line 381
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    invoke-virtual {p1, p2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    :cond_9
    invoke-static {p0, v1}, Lfu;->l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 392
    .line 393
    .line 394
    move-result p0

    .line 395
    return p0

    .line 396
    :pswitch_a
    check-cast p1, Lxg1;

    .line 397
    .line 398
    check-cast p2, Lxg1;

    .line 399
    .line 400
    iget-object p0, p1, Lxg1;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 401
    .line 402
    if-nez p0, :cond_a

    .line 403
    .line 404
    move v1, v2

    .line 405
    goto :goto_5

    .line 406
    :cond_a
    move v1, v3

    .line 407
    :goto_5
    iget-object v4, p2, Lxg1;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 408
    .line 409
    if-nez v4, :cond_b

    .line 410
    .line 411
    move v4, v2

    .line 412
    goto :goto_6

    .line 413
    :cond_b
    move v4, v3

    .line 414
    :goto_6
    if-eq v1, v4, :cond_c

    .line 415
    .line 416
    if-nez p0, :cond_11

    .line 417
    .line 418
    goto :goto_7

    .line 419
    :cond_c
    iget-boolean p0, p1, Lxg1;->a:Z

    .line 420
    .line 421
    iget-boolean v1, p2, Lxg1;->a:Z

    .line 422
    .line 423
    if-eq p0, v1, :cond_e

    .line 424
    .line 425
    if-eqz p0, :cond_d

    .line 426
    .line 427
    goto :goto_8

    .line 428
    :cond_d
    :goto_7
    move v0, v2

    .line 429
    goto :goto_8

    .line 430
    :cond_e
    iget p0, p2, Lxg1;->b:I

    .line 431
    .line 432
    iget v0, p1, Lxg1;->b:I

    .line 433
    .line 434
    sub-int v0, p0, v0

    .line 435
    .line 436
    if-eqz v0, :cond_f

    .line 437
    .line 438
    goto :goto_8

    .line 439
    :cond_f
    iget p0, p1, Lxg1;->c:I

    .line 440
    .line 441
    iget p1, p2, Lxg1;->c:I

    .line 442
    .line 443
    sub-int v0, p0, p1

    .line 444
    .line 445
    if-eqz v0, :cond_10

    .line 446
    .line 447
    goto :goto_8

    .line 448
    :cond_10
    move v0, v3

    .line 449
    :cond_11
    :goto_8
    return v0

    .line 450
    :pswitch_b
    check-cast p1, Lwp0;

    .line 451
    .line 452
    check-cast p2, Lwp0;

    .line 453
    .line 454
    iget p0, p1, Lwp0;->a:I

    .line 455
    .line 456
    iget p1, p2, Lwp0;->a:I

    .line 457
    .line 458
    sub-int/2addr p0, p1

    .line 459
    return p0

    .line 460
    :pswitch_c
    check-cast p1, Lc72;

    .line 461
    .line 462
    check-cast p2, Lc72;

    .line 463
    .line 464
    iget p0, p1, Lc72;->B:I

    .line 465
    .line 466
    iget v0, p2, Lc72;->B:I

    .line 467
    .line 468
    invoke-static {p0, v0}, Lh12;->j(II)I

    .line 469
    .line 470
    .line 471
    move-result p0

    .line 472
    if-eqz p0, :cond_12

    .line 473
    .line 474
    goto :goto_9

    .line 475
    :cond_12
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 476
    .line 477
    .line 478
    move-result p0

    .line 479
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 480
    .line 481
    .line 482
    move-result p1

    .line 483
    invoke-static {p0, p1}, Lh12;->j(II)I

    .line 484
    .line 485
    .line 486
    move-result p0

    .line 487
    :goto_9
    return p0

    .line 488
    :pswitch_d
    check-cast p1, Landroid/view/View;

    .line 489
    .line 490
    check-cast p2, Landroid/view/View;

    .line 491
    .line 492
    sget-object p0, Lj65;->a:Ljava/util/WeakHashMap;

    .line 493
    .line 494
    invoke-virtual {p1}, Landroid/view/View;->getZ()F

    .line 495
    .line 496
    .line 497
    move-result p0

    .line 498
    invoke-virtual {p2}, Landroid/view/View;->getZ()F

    .line 499
    .line 500
    .line 501
    move-result p1

    .line 502
    cmpl-float p2, p0, p1

    .line 503
    .line 504
    if-lez p2, :cond_13

    .line 505
    .line 506
    goto :goto_a

    .line 507
    :cond_13
    cmpg-float p0, p0, p1

    .line 508
    .line 509
    if-gez p0, :cond_14

    .line 510
    .line 511
    move v0, v2

    .line 512
    goto :goto_a

    .line 513
    :cond_14
    move v0, v3

    .line 514
    :goto_a
    return v0

    .line 515
    :pswitch_e
    check-cast p1, Lj50;

    .line 516
    .line 517
    check-cast p2, Lj50;

    .line 518
    .line 519
    iget-short p0, p1, Lj50;->c:S

    .line 520
    .line 521
    iget-short p1, p2, Lj50;->c:S

    .line 522
    .line 523
    sub-int/2addr p0, p1

    .line 524
    return p0

    .line 525
    :pswitch_f
    check-cast p1, Ly40;

    .line 526
    .line 527
    check-cast p2, Ly40;

    .line 528
    .line 529
    invoke-virtual {p2}, Ly40;->b()I

    .line 530
    .line 531
    .line 532
    move-result p0

    .line 533
    invoke-virtual {p1}, Ly40;->b()I

    .line 534
    .line 535
    .line 536
    move-result p1

    .line 537
    sub-int/2addr p0, p1

    .line 538
    return p0

    .line 539
    :pswitch_10
    check-cast p1, Ljava/lang/String;

    .line 540
    .line 541
    check-cast p2, Ljava/lang/String;

    .line 542
    .line 543
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 550
    .line 551
    .line 552
    move-result p0

    .line 553
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 554
    .line 555
    .line 556
    move-result v1

    .line 557
    invoke-static {p0, v1}, Ljava/lang/Math;->min(II)I

    .line 558
    .line 559
    .line 560
    move-result p0

    .line 561
    const/4 v1, 0x4

    .line 562
    :goto_b
    if-ge v1, p0, :cond_16

    .line 563
    .line 564
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 565
    .line 566
    .line 567
    move-result v4

    .line 568
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    .line 569
    .line 570
    .line 571
    move-result v5

    .line 572
    if-eq v4, v5, :cond_15

    .line 573
    .line 574
    invoke-static {v4, v5}, Lh12;->j(II)I

    .line 575
    .line 576
    .line 577
    move-result p0

    .line 578
    if-gez p0, :cond_17

    .line 579
    .line 580
    goto :goto_c

    .line 581
    :cond_15
    add-int/lit8 v1, v1, 0x1

    .line 582
    .line 583
    goto :goto_b

    .line 584
    :cond_16
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 585
    .line 586
    .line 587
    move-result p0

    .line 588
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 589
    .line 590
    .line 591
    move-result p1

    .line 592
    if-eq p0, p1, :cond_18

    .line 593
    .line 594
    if-ge p0, p1, :cond_17

    .line 595
    .line 596
    goto :goto_c

    .line 597
    :cond_17
    move v0, v2

    .line 598
    goto :goto_c

    .line 599
    :cond_18
    move v0, v3

    .line 600
    :goto_c
    return v0

    .line 601
    :pswitch_11
    check-cast p1, Lge;

    .line 602
    .line 603
    iget p0, p1, Lge;->b:I

    .line 604
    .line 605
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 606
    .line 607
    .line 608
    move-result-object p0

    .line 609
    check-cast p2, Lge;

    .line 610
    .line 611
    iget p1, p2, Lge;->b:I

    .line 612
    .line 613
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 614
    .line 615
    .line 616
    move-result-object p1

    .line 617
    invoke-static {p0, p1}, Lfu;->l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 618
    .line 619
    .line 620
    move-result p0

    .line 621
    return p0

    .line 622
    :pswitch_12
    check-cast p1, Lge;

    .line 623
    .line 624
    iget p0, p1, Lge;->b:I

    .line 625
    .line 626
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 627
    .line 628
    .line 629
    move-result-object p0

    .line 630
    check-cast p2, Lge;

    .line 631
    .line 632
    iget p1, p2, Lge;->b:I

    .line 633
    .line 634
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 635
    .line 636
    .line 637
    move-result-object p1

    .line 638
    invoke-static {p0, p1}, Lfu;->l(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 639
    .line 640
    .line 641
    move-result p0

    .line 642
    return p0

    .line 643
    :pswitch_13
    check-cast p1, [I

    .line 644
    .line 645
    check-cast p2, [I

    .line 646
    .line 647
    aget p0, p1, v3

    .line 648
    .line 649
    aget p1, p2, v3

    .line 650
    .line 651
    sub-int/2addr p0, p1

    .line 652
    return p0

    .line 653
    :pswitch_14
    check-cast p1, Lcom/google/android/gms/common/api/Scope;

    .line 654
    .line 655
    check-cast p2, Lcom/google/android/gms/common/api/Scope;

    .line 656
    .line 657
    iget-object p0, p1, Lcom/google/android/gms/common/api/Scope;->o:Ljava/lang/String;

    .line 658
    .line 659
    iget-object p1, p2, Lcom/google/android/gms/common/api/Scope;->o:Ljava/lang/String;

    .line 660
    .line 661
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 662
    .line 663
    .line 664
    move-result p0

    .line 665
    return p0

    .line 666
    :pswitch_15
    check-cast p1, Lkd3;

    .line 667
    .line 668
    check-cast p2, Lkd3;

    .line 669
    .line 670
    iget-object p0, p1, Lkd3;->n:Ljava/lang/Object;

    .line 671
    .line 672
    check-cast p0, Lwv3;

    .line 673
    .line 674
    iget p0, p0, Lwv3;->b:F

    .line 675
    .line 676
    iget-object v0, p2, Lkd3;->n:Ljava/lang/Object;

    .line 677
    .line 678
    check-cast v0, Lwv3;

    .line 679
    .line 680
    iget v0, v0, Lwv3;->b:F

    .line 681
    .line 682
    invoke-static {p0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 683
    .line 684
    .line 685
    move-result p0

    .line 686
    if-eqz p0, :cond_19

    .line 687
    .line 688
    goto :goto_d

    .line 689
    :cond_19
    iget-object p0, p1, Lkd3;->n:Ljava/lang/Object;

    .line 690
    .line 691
    check-cast p0, Lwv3;

    .line 692
    .line 693
    iget p0, p0, Lwv3;->d:F

    .line 694
    .line 695
    iget-object p1, p2, Lkd3;->n:Ljava/lang/Object;

    .line 696
    .line 697
    check-cast p1, Lwv3;

    .line 698
    .line 699
    iget p1, p1, Lwv3;->d:F

    .line 700
    .line 701
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 702
    .line 703
    .line 704
    move-result p0

    .line 705
    :goto_d
    return p0

    .line 706
    :pswitch_16
    check-cast p1, Li94;

    .line 707
    .line 708
    check-cast p2, Li94;

    .line 709
    .line 710
    invoke-virtual {p1}, Li94;->h()Lwv3;

    .line 711
    .line 712
    .line 713
    move-result-object p0

    .line 714
    invoke-virtual {p2}, Li94;->h()Lwv3;

    .line 715
    .line 716
    .line 717
    move-result-object p1

    .line 718
    iget p2, p1, Lwv3;->c:F

    .line 719
    .line 720
    iget v0, p0, Lwv3;->c:F

    .line 721
    .line 722
    invoke-static {p2, v0}, Ljava/lang/Float;->compare(FF)I

    .line 723
    .line 724
    .line 725
    move-result p2

    .line 726
    if-eqz p2, :cond_1a

    .line 727
    .line 728
    goto :goto_e

    .line 729
    :cond_1a
    iget p2, p0, Lwv3;->b:F

    .line 730
    .line 731
    iget v0, p1, Lwv3;->b:F

    .line 732
    .line 733
    invoke-static {p2, v0}, Ljava/lang/Float;->compare(FF)I

    .line 734
    .line 735
    .line 736
    move-result p2

    .line 737
    if-eqz p2, :cond_1b

    .line 738
    .line 739
    goto :goto_e

    .line 740
    :cond_1b
    iget p2, p0, Lwv3;->d:F

    .line 741
    .line 742
    iget v0, p1, Lwv3;->d:F

    .line 743
    .line 744
    invoke-static {p2, v0}, Ljava/lang/Float;->compare(FF)I

    .line 745
    .line 746
    .line 747
    move-result p2

    .line 748
    if-eqz p2, :cond_1c

    .line 749
    .line 750
    goto :goto_e

    .line 751
    :cond_1c
    iget p1, p1, Lwv3;->a:F

    .line 752
    .line 753
    iget p0, p0, Lwv3;->a:F

    .line 754
    .line 755
    invoke-static {p1, p0}, Ljava/lang/Float;->compare(FF)I

    .line 756
    .line 757
    .line 758
    move-result p2

    .line 759
    :goto_e
    return p2

    .line 760
    :pswitch_17
    check-cast p1, Lc72;

    .line 761
    .line 762
    check-cast p2, Lc72;

    .line 763
    .line 764
    iget p0, p2, Lc72;->B:I

    .line 765
    .line 766
    iget v0, p1, Lc72;->B:I

    .line 767
    .line 768
    invoke-static {p0, v0}, Lh12;->j(II)I

    .line 769
    .line 770
    .line 771
    move-result p0

    .line 772
    if-eqz p0, :cond_1d

    .line 773
    .line 774
    goto :goto_f

    .line 775
    :cond_1d
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 776
    .line 777
    .line 778
    move-result p0

    .line 779
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 780
    .line 781
    .line 782
    move-result p1

    .line 783
    invoke-static {p0, p1}, Lh12;->j(II)I

    .line 784
    .line 785
    .line 786
    move-result p0

    .line 787
    :goto_f
    return p0

    .line 788
    :pswitch_18
    check-cast p1, Lwq2;

    .line 789
    .line 790
    check-cast p2, Lwq2;

    .line 791
    .line 792
    iget-object p0, p1, Lwq2;->d:Ljava/lang/String;

    .line 793
    .line 794
    iget-object p1, p2, Lwq2;->d:Ljava/lang/String;

    .line 795
    .line 796
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 797
    .line 798
    .line 799
    move-result p0

    .line 800
    return p0

    .line 801
    :pswitch_19
    check-cast p1, Lwq2;

    .line 802
    .line 803
    check-cast p2, Lwq2;

    .line 804
    .line 805
    iget-object p0, p1, Lwq2;->d:Ljava/lang/String;

    .line 806
    .line 807
    iget-object p1, p2, Lwq2;->d:Ljava/lang/String;

    .line 808
    .line 809
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 810
    .line 811
    .line 812
    move-result p0

    .line 813
    return p0

    .line 814
    :pswitch_1a
    check-cast p1, Lwq2;

    .line 815
    .line 816
    check-cast p2, Lwq2;

    .line 817
    .line 818
    iget-object p0, p1, Lwq2;->d:Ljava/lang/String;

    .line 819
    .line 820
    iget-object p1, p2, Lwq2;->d:Ljava/lang/String;

    .line 821
    .line 822
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    .line 823
    .line 824
    .line 825
    move-result p0

    .line 826
    return p0

    .line 827
    :pswitch_1b
    check-cast p1, Li94;

    .line 828
    .line 829
    check-cast p2, Li94;

    .line 830
    .line 831
    invoke-virtual {p1}, Li94;->h()Lwv3;

    .line 832
    .line 833
    .line 834
    move-result-object p0

    .line 835
    invoke-virtual {p2}, Li94;->h()Lwv3;

    .line 836
    .line 837
    .line 838
    move-result-object p1

    .line 839
    iget p2, p0, Lwv3;->a:F

    .line 840
    .line 841
    iget v0, p1, Lwv3;->a:F

    .line 842
    .line 843
    invoke-static {p2, v0}, Ljava/lang/Float;->compare(FF)I

    .line 844
    .line 845
    .line 846
    move-result p2

    .line 847
    if-eqz p2, :cond_1e

    .line 848
    .line 849
    goto :goto_10

    .line 850
    :cond_1e
    iget p2, p0, Lwv3;->b:F

    .line 851
    .line 852
    iget v0, p1, Lwv3;->b:F

    .line 853
    .line 854
    invoke-static {p2, v0}, Ljava/lang/Float;->compare(FF)I

    .line 855
    .line 856
    .line 857
    move-result p2

    .line 858
    if-eqz p2, :cond_1f

    .line 859
    .line 860
    goto :goto_10

    .line 861
    :cond_1f
    iget p2, p0, Lwv3;->d:F

    .line 862
    .line 863
    iget v0, p1, Lwv3;->d:F

    .line 864
    .line 865
    invoke-static {p2, v0}, Ljava/lang/Float;->compare(FF)I

    .line 866
    .line 867
    .line 868
    move-result p2

    .line 869
    if-eqz p2, :cond_20

    .line 870
    .line 871
    goto :goto_10

    .line 872
    :cond_20
    iget p0, p0, Lwv3;->c:F

    .line 873
    .line 874
    iget p1, p1, Lwv3;->c:F

    .line 875
    .line 876
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 877
    .line 878
    .line 879
    move-result p2

    .line 880
    :goto_10
    return p2

    .line 881
    :pswitch_1c
    check-cast p1, Lba1;

    .line 882
    .line 883
    check-cast p2, Lba1;

    .line 884
    .line 885
    invoke-static {p1}, Lte5;->B(Lba1;)Z

    .line 886
    .line 887
    .line 888
    move-result p0

    .line 889
    if-eqz p0, :cond_2c

    .line 890
    .line 891
    invoke-static {p2}, Lte5;->B(Lba1;)Z

    .line 892
    .line 893
    .line 894
    move-result p0

    .line 895
    if-nez p0, :cond_21

    .line 896
    .line 897
    goto/16 :goto_15

    .line 898
    .line 899
    :cond_21
    invoke-static {p1}, Lj51;->O(Leo0;)Lc72;

    .line 900
    .line 901
    .line 902
    move-result-object p0

    .line 903
    invoke-static {p2}, Lj51;->O(Leo0;)Lc72;

    .line 904
    .line 905
    .line 906
    move-result-object p1

    .line 907
    invoke-static {p0, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 908
    .line 909
    .line 910
    move-result p2

    .line 911
    if-eqz p2, :cond_22

    .line 912
    .line 913
    goto/16 :goto_14

    .line 914
    .line 915
    :cond_22
    const/16 p2, 0x10

    .line 916
    .line 917
    new-array v0, p2, [Lc72;

    .line 918
    .line 919
    move v1, v3

    .line 920
    :goto_11
    if-eqz p0, :cond_25

    .line 921
    .line 922
    add-int/lit8 v4, v1, 0x1

    .line 923
    .line 924
    array-length v5, v0

    .line 925
    if-ge v5, v4, :cond_23

    .line 926
    .line 927
    array-length v5, v0

    .line 928
    mul-int/lit8 v6, v5, 0x2

    .line 929
    .line 930
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    .line 931
    .line 932
    .line 933
    move-result v4

    .line 934
    new-array v4, v4, [Ljava/lang/Object;

    .line 935
    .line 936
    invoke-static {v0, v3, v4, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 937
    .line 938
    .line 939
    move-object v0, v4

    .line 940
    :cond_23
    if-eqz v1, :cond_24

    .line 941
    .line 942
    const/4 v4, 0x0

    .line 943
    add-int/2addr v4, v2

    .line 944
    add-int/lit8 v5, v1, 0x0

    .line 945
    .line 946
    invoke-static {v0, v3, v0, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 947
    .line 948
    .line 949
    :cond_24
    aput-object p0, v0, v3

    .line 950
    .line 951
    add-int/lit8 v1, v1, 0x1

    .line 952
    .line 953
    invoke-virtual {p0}, Lc72;->t()Lc72;

    .line 954
    .line 955
    .line 956
    move-result-object p0

    .line 957
    goto :goto_11

    .line 958
    :cond_25
    new-array p0, p2, [Lc72;

    .line 959
    .line 960
    move p2, v3

    .line 961
    :goto_12
    if-eqz p1, :cond_28

    .line 962
    .line 963
    add-int/lit8 v4, p2, 0x1

    .line 964
    .line 965
    array-length v5, p0

    .line 966
    if-ge v5, v4, :cond_26

    .line 967
    .line 968
    array-length v5, p0

    .line 969
    mul-int/lit8 v6, v5, 0x2

    .line 970
    .line 971
    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    .line 972
    .line 973
    .line 974
    move-result v4

    .line 975
    new-array v4, v4, [Ljava/lang/Object;

    .line 976
    .line 977
    invoke-static {p0, v3, v4, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 978
    .line 979
    .line 980
    move-object p0, v4

    .line 981
    :cond_26
    if-eqz p2, :cond_27

    .line 982
    .line 983
    const/4 v4, 0x0

    .line 984
    add-int/2addr v4, v2

    .line 985
    add-int/lit8 v5, p2, 0x0

    .line 986
    .line 987
    invoke-static {p0, v3, p0, v4, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 988
    .line 989
    .line 990
    :cond_27
    aput-object p1, p0, v3

    .line 991
    .line 992
    add-int/lit8 p2, p2, 0x1

    .line 993
    .line 994
    invoke-virtual {p1}, Lc72;->t()Lc72;

    .line 995
    .line 996
    .line 997
    move-result-object p1

    .line 998
    goto :goto_12

    .line 999
    :cond_28
    sub-int/2addr v1, v2

    .line 1000
    sub-int/2addr p2, v2

    .line 1001
    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    .line 1002
    .line 1003
    .line 1004
    move-result p1

    .line 1005
    if-ltz p1, :cond_2a

    .line 1006
    .line 1007
    move p2, v3

    .line 1008
    :goto_13
    aget-object v1, v0, p2

    .line 1009
    .line 1010
    aget-object v2, p0, p2

    .line 1011
    .line 1012
    invoke-static {v1, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1013
    .line 1014
    .line 1015
    move-result v1

    .line 1016
    if-nez v1, :cond_29

    .line 1017
    .line 1018
    aget-object p1, v0, p2

    .line 1019
    .line 1020
    check-cast p1, Lc72;

    .line 1021
    .line 1022
    invoke-virtual {p1}, Lc72;->u()I

    .line 1023
    .line 1024
    .line 1025
    move-result p1

    .line 1026
    aget-object p0, p0, p2

    .line 1027
    .line 1028
    check-cast p0, Lc72;

    .line 1029
    .line 1030
    invoke-virtual {p0}, Lc72;->u()I

    .line 1031
    .line 1032
    .line 1033
    move-result p0

    .line 1034
    invoke-static {p1, p0}, Lh12;->j(II)I

    .line 1035
    .line 1036
    .line 1037
    move-result v0

    .line 1038
    goto :goto_16

    .line 1039
    :cond_29
    if-eq p2, p1, :cond_2a

    .line 1040
    .line 1041
    add-int/lit8 p2, p2, 0x1

    .line 1042
    .line 1043
    goto :goto_13

    .line 1044
    :cond_2a
    const-string p0, "Could not find a common ancestor between the two FocusModifiers."

    .line 1045
    .line 1046
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 1047
    .line 1048
    .line 1049
    :cond_2b
    :goto_14
    move v0, v3

    .line 1050
    goto :goto_16

    .line 1051
    :cond_2c
    :goto_15
    invoke-static {p1}, Lte5;->B(Lba1;)Z

    .line 1052
    .line 1053
    .line 1054
    move-result p0

    .line 1055
    if-eqz p0, :cond_2d

    .line 1056
    .line 1057
    goto :goto_16

    .line 1058
    :cond_2d
    invoke-static {p2}, Lte5;->B(Lba1;)Z

    .line 1059
    .line 1060
    .line 1061
    move-result p0

    .line 1062
    if-eqz p0, :cond_2b

    .line 1063
    .line 1064
    move v0, v2

    .line 1065
    :goto_16
    return v0

    .line 1066
    nop

    .line 1067
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
