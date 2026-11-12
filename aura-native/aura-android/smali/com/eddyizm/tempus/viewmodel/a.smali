.class public Lcom/eddyizm/tempus/viewmodel/a;
.super Lhd;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public c:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 0

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
    iput-object p1, p0, Lcom/eddyizm/tempus/viewmodel/a;->c:Ljava/util/List;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final c()Ljava/util/List;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/viewmodel/a;->c:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lcom/eddyizm/tempus/viewmodel/a;->c:Ljava/util/List;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-static {}, Lud3;->r()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-static {}, Lud3;->r()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "null"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    new-instance v0, Lnk1;

    .line 33
    .line 34
    invoke-direct {v0}, Lnk1;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lud3;->r()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    new-instance v2, Lcom/eddyizm/tempus/viewmodel/HomeRearrangementViewModel$1;

    .line 42
    .line 43
    invoke-direct {v2}, Lcom/google/common/reflect/TypeToken;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2}, Lcom/google/common/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v0, v1, v2}, Lnk1;->f(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Ljava/util/List;

    .line 55
    .line 56
    iput-object v0, p0, Lcom/eddyizm/tempus/viewmodel/a;->c:Ljava/util/List;

    .line 57
    .line 58
    goto/16 :goto_0

    .line 59
    .line 60
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    new-instance v1, Lcom/eddyizm/tempus/model/HomeSector;

    .line 66
    .line 67
    iget-object v2, p0, Lhd;->b:Landroid/app/Application;

    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    const v3, 0x7f130183

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    const-string v4, "HOME_SECTOR_DISCOVERY"

    .line 80
    .line 81
    const/4 v5, 0x1

    .line 82
    invoke-direct {v1, v4, v3, v5, v5}, Lcom/eddyizm/tempus/model/HomeSector;-><init>(Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    new-instance v1, Lcom/eddyizm/tempus/model/HomeSector;

    .line 89
    .line 90
    const v3, 0x7f130182

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    const-string v4, "HOME_SECTOR_CONTINUE_LISTENING"

    .line 98
    .line 99
    const/4 v6, 0x2

    .line 100
    invoke-direct {v1, v4, v3, v5, v6}, Lcom/eddyizm/tempus/model/HomeSector;-><init>(Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    new-instance v1, Lcom/eddyizm/tempus/model/HomeSector;

    .line 107
    .line 108
    const v3, 0x7f13018c

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    const-string v4, "HOME_SECTOR_MADE_FOR_YOU"

    .line 116
    .line 117
    invoke-direct {v1, v4, v3, v5, v6}, Lcom/eddyizm/tempus/model/HomeSector;-><init>(Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    new-instance v1, Lcom/eddyizm/tempus/model/HomeSector;

    .line 124
    .line 125
    const v3, 0x7f130181

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    const/4 v4, 0x3

    .line 133
    const-string v6, "HOME_SECTOR_BEST_OF"

    .line 134
    .line 135
    invoke-direct {v1, v6, v3, v5, v4}, Lcom/eddyizm/tempus/model/HomeSector;-><init>(Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    new-instance v1, Lcom/eddyizm/tempus/model/HomeSector;

    .line 142
    .line 143
    const v3, 0x7f130194

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    const/4 v4, 0x4

    .line 151
    const-string v6, "HOME_SECTOR_RADIO_STATION"

    .line 152
    .line 153
    invoke-direct {v1, v6, v3, v5, v4}, Lcom/eddyizm/tempus/model/HomeSector;-><init>(Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    new-instance v1, Lcom/eddyizm/tempus/model/HomeSector;

    .line 160
    .line 161
    const v3, 0x7f13019e

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    const/4 v4, 0x5

    .line 169
    const-string v6, "HOME_SECTOR_TOP_SONGS"

    .line 170
    .line 171
    invoke-direct {v1, v6, v3, v5, v4}, Lcom/eddyizm/tempus/model/HomeSector;-><init>(Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    new-instance v1, Lcom/eddyizm/tempus/model/HomeSector;

    .line 178
    .line 179
    const v3, 0x7f13019c

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v3

    .line 186
    const/4 v4, 0x6

    .line 187
    const-string v6, "HOME_SECTOR_STARRED_TRACKS"

    .line 188
    .line 189
    invoke-direct {v1, v6, v3, v5, v4}, Lcom/eddyizm/tempus/model/HomeSector;-><init>(Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    new-instance v1, Lcom/eddyizm/tempus/model/HomeSector;

    .line 196
    .line 197
    const v3, 0x7f130198

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    const/4 v4, 0x7

    .line 205
    const-string v6, "HOME_SECTOR_STARRED_ALBUMS"

    .line 206
    .line 207
    invoke-direct {v1, v6, v3, v5, v4}, Lcom/eddyizm/tempus/model/HomeSector;-><init>(Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    new-instance v1, Lcom/eddyizm/tempus/model/HomeSector;

    .line 214
    .line 215
    const v3, 0x7f13019a

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    const/16 v4, 0x8

    .line 223
    .line 224
    const-string v6, "HOME_SECTOR_STARRED_ARTISTS"

    .line 225
    .line 226
    invoke-direct {v1, v6, v3, v5, v4}, Lcom/eddyizm/tempus/model/HomeSector;-><init>(Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    new-instance v1, Lcom/eddyizm/tempus/model/HomeSector;

    .line 233
    .line 234
    const v3, 0x7f13018f

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v3

    .line 241
    const/16 v4, 0x9

    .line 242
    .line 243
    const-string v6, "HOME_SECTOR_NEW_RELEASES"

    .line 244
    .line 245
    invoke-direct {v1, v6, v3, v5, v4}, Lcom/eddyizm/tempus/model/HomeSector;-><init>(Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    new-instance v1, Lcom/eddyizm/tempus/model/HomeSector;

    .line 252
    .line 253
    const v3, 0x7f130185

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    const/16 v4, 0xa

    .line 261
    .line 262
    const-string v6, "HOME_SECTOR_FLASHBACK"

    .line 263
    .line 264
    invoke-direct {v1, v6, v3, v5, v4}, Lcom/eddyizm/tempus/model/HomeSector;-><init>(Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    new-instance v1, Lcom/eddyizm/tempus/model/HomeSector;

    .line 271
    .line 272
    const v3, 0x7f13018d

    .line 273
    .line 274
    .line 275
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    const/16 v4, 0xb

    .line 280
    .line 281
    const-string v6, "HOME_SECTOR_MOST_PLAYED"

    .line 282
    .line 283
    invoke-direct {v1, v6, v3, v5, v4}, Lcom/eddyizm/tempus/model/HomeSector;-><init>(Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    new-instance v1, Lcom/eddyizm/tempus/model/HomeSector;

    .line 290
    .line 291
    const v3, 0x7f130188

    .line 292
    .line 293
    .line 294
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    const/16 v4, 0xc

    .line 299
    .line 300
    const-string v6, "HOME_SECTOR_LAST_PLAYED"

    .line 301
    .line 302
    invoke-direct {v1, v6, v3, v5, v4}, Lcom/eddyizm/tempus/model/HomeSector;-><init>(Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    new-instance v1, Lcom/eddyizm/tempus/model/HomeSector;

    .line 309
    .line 310
    const v3, 0x7f130195

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    const/16 v4, 0xd

    .line 318
    .line 319
    const-string v6, "HOME_SECTOR_RECENTLY_ADDED"

    .line 320
    .line 321
    invoke-direct {v1, v6, v3, v5, v4}, Lcom/eddyizm/tempus/model/HomeSector;-><init>(Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    new-instance v1, Lcom/eddyizm/tempus/model/HomeSector;

    .line 328
    .line 329
    const v3, 0x7f130191

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    const/16 v4, 0xe

    .line 337
    .line 338
    const-string v6, "HOME_SECTOR_PINNED_PLAYLISTS"

    .line 339
    .line 340
    invoke-direct {v1, v6, v3, v5, v4}, Lcom/eddyizm/tempus/model/HomeSector;-><init>(Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    new-instance v1, Lcom/eddyizm/tempus/model/HomeSector;

    .line 347
    .line 348
    const v3, 0x7f130197

    .line 349
    .line 350
    .line 351
    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    const/16 v3, 0xf

    .line 356
    .line 357
    const-string v4, "HOME_SECTOR_SHARED"

    .line 358
    .line 359
    invoke-direct {v1, v4, v2, v5, v3}, Lcom/eddyizm/tempus/model/HomeSector;-><init>(Ljava/lang/String;Ljava/lang/String;ZI)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    iput-object v0, p0, Lcom/eddyizm/tempus/viewmodel/a;->c:Ljava/util/List;

    .line 366
    .line 367
    :goto_0
    iget-object p0, p0, Lcom/eddyizm/tempus/viewmodel/a;->c:Ljava/util/List;

    .line 368
    .line 369
    return-object p0
.end method
