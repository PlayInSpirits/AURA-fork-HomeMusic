.class public final Ldefpackage/et0;
.super Ldefpackage/cx3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Ldefpackage/lv4;

.field public final synthetic v:Ldefpackage/ft0;


# direct methods
.method public constructor <init>(Ldefpackage/ft0;Ldefpackage/lv4;)V
    .locals 3

    .line 1
    iput-object p1, p0, Ldefpackage/et0;->v:Ldefpackage/ft0;

    .line 2
    .line 3
    iget-object p1, p2, Ldefpackage/lv4;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Ldefpackage/cx3;-><init>(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Ldefpackage/et0;->u:Ldefpackage/lv4;

    .line 11
    .line 12
    iget-object v0, p2, Ldefpackage/lv4;->s:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Landroid/widget/TextView;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p2, Ldefpackage/lv4;->r:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Landroid/widget/TextView;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Ldefpackage/dt0;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-direct {v0, p0, v2}, Ldefpackage/dt0;-><init>(Ldefpackage/et0;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Ldefpackage/q6;

    .line 37
    .line 38
    const/16 v2, 0x9

    .line 39
    .line 40
    invoke-direct {v0, v2, p0}, Ldefpackage/q6;-><init>(ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p2, Ldefpackage/lv4;->q:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p1, Landroid/widget/FrameLayout;

    .line 49
    .line 50
    new-instance p2, Ldefpackage/dt0;

    .line 51
    .line 52
    invoke-direct {p2, p0, v1}, Ldefpackage/dt0;-><init>(Ldefpackage/et0;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final s()Z
    .locals 15

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, p0, Ldefpackage/et0;->v:Ldefpackage/ft0;

    .line 12
    .line 13
    iget-object v3, v2, Ldefpackage/ft0;->q:Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;

    .line 14
    .line 15
    iget-object v4, v2, Ldefpackage/ft0;->r:Ljava/lang/String;

    .line 16
    .line 17
    const-string v5, "download_type_track"

    .line 18
    .line 19
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/4 v6, 0x1

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    iget-object v0, v2, Ldefpackage/ft0;->w:Ljava/util/List;

    .line 27
    .line 28
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    check-cast p0, Landroid/os/Parcelable;

    .line 37
    .line 38
    const-string v0, "TRACK_OBJECT"

    .line 39
    .line 40
    invoke-virtual {v1, v0, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {v3, v1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onMediaLongClick(Landroid/os/Bundle;)V

    .line 44
    .line 45
    .line 46
    return v6

    .line 47
    :cond_0
    iget-object v4, v2, Ldefpackage/ft0;->r:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const-string v8, "download_type_genre"

    .line 57
    .line 58
    const-string v9, "download_type_album"

    .line 59
    .line 60
    const-string v10, "download_type_playlist"

    .line 61
    .line 62
    const-string v11, "download_type_year"

    .line 63
    .line 64
    const/4 v12, 0x0

    .line 65
    const-string v13, "download_type_artist"

    .line 66
    .line 67
    const/4 v14, -0x1

    .line 68
    sparse-switch v7, :sswitch_data_0

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :sswitch_0
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-nez v4, :cond_1

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_1
    const/4 v14, 0x5

    .line 80
    goto :goto_0

    .line 81
    :sswitch_1
    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-nez v4, :cond_2

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    const/4 v14, 0x4

    .line 89
    goto :goto_0

    .line 90
    :sswitch_2
    invoke-virtual {v4, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-nez v4, :cond_3

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_3
    const/4 v14, 0x3

    .line 98
    goto :goto_0

    .line 99
    :sswitch_3
    invoke-virtual {v4, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-nez v4, :cond_4

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    const/4 v14, 0x2

    .line 107
    goto :goto_0

    .line 108
    :sswitch_4
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    if-nez v4, :cond_5

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_5
    move v14, v6

    .line 116
    goto :goto_0

    .line 117
    :sswitch_5
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-nez v4, :cond_6

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_6
    move v14, v12

    .line 125
    :goto_0
    packed-switch v14, :pswitch_data_0

    .line 126
    .line 127
    .line 128
    goto/16 :goto_1

    .line 129
    .line 130
    :pswitch_0
    iget-object v2, v2, Ldefpackage/ft0;->w:Ljava/util/List;

    .line 131
    .line 132
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 141
    .line 142
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    goto/16 :goto_1

    .line 146
    .line 147
    :pswitch_1
    iget-object v4, v2, Ldefpackage/ft0;->w:Ljava/util/List;

    .line 148
    .line 149
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 158
    .line 159
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getGenre()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    iget-object v2, v2, Ldefpackage/ft0;->u:Ljava/util/List;

    .line 164
    .line 165
    invoke-static {v8, v4, v2}, Ldefpackage/ft0;->q(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 170
    .line 171
    .line 172
    goto/16 :goto_1

    .line 173
    .line 174
    :pswitch_2
    iget-object v4, v2, Ldefpackage/ft0;->w:Ljava/util/List;

    .line 175
    .line 176
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 177
    .line 178
    .line 179
    move-result v5

    .line 180
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v4

    .line 184
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 185
    .line 186
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v4

    .line 190
    iget-object v2, v2, Ldefpackage/ft0;->u:Ljava/util/List;

    .line 191
    .line 192
    invoke-static {v9, v4, v2}, Ldefpackage/ft0;->q(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 197
    .line 198
    .line 199
    goto :goto_1

    .line 200
    :pswitch_3
    iget-object v4, v2, Ldefpackage/ft0;->w:Ljava/util/List;

    .line 201
    .line 202
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    instance-of v4, v4, Lcom/eddyizm/tempus/model/Download;

    .line 211
    .line 212
    if-eqz v4, :cond_7

    .line 213
    .line 214
    iget-object v4, v2, Ldefpackage/ft0;->w:Ljava/util/List;

    .line 215
    .line 216
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 217
    .line 218
    .line 219
    move-result v5

    .line 220
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    check-cast v4, Lcom/eddyizm/tempus/model/Download;

    .line 225
    .line 226
    invoke-virtual {v4}, Lcom/eddyizm/tempus/model/Download;->getPlaylistId()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    iget-object v2, v2, Ldefpackage/ft0;->u:Ljava/util/List;

    .line 231
    .line 232
    invoke-static {v10, v4, v2}, Ldefpackage/ft0;->q(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 237
    .line 238
    .line 239
    goto :goto_1

    .line 240
    :pswitch_4
    iget-object v4, v2, Ldefpackage/ft0;->w:Ljava/util/List;

    .line 241
    .line 242
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 243
    .line 244
    .line 245
    move-result v5

    .line 246
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 251
    .line 252
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getYear()Ljava/lang/Integer;

    .line 253
    .line 254
    .line 255
    move-result-object v4

    .line 256
    invoke-virtual {v4}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    iget-object v2, v2, Ldefpackage/ft0;->u:Ljava/util/List;

    .line 261
    .line 262
    invoke-static {v11, v4, v2}, Ldefpackage/ft0;->q(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 267
    .line 268
    .line 269
    goto :goto_1

    .line 270
    :pswitch_5
    iget-object v4, v2, Ldefpackage/ft0;->w:Ljava/util/List;

    .line 271
    .line 272
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 273
    .line 274
    .line 275
    move-result v5

    .line 276
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v4

    .line 280
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 281
    .line 282
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    iget-object v2, v2, Ldefpackage/ft0;->u:Ljava/util/List;

    .line 287
    .line 288
    invoke-static {v13, v4, v2}, Ldefpackage/ft0;->q(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 293
    .line 294
    .line 295
    :cond_7
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    if-eqz v2, :cond_8

    .line 300
    .line 301
    return v12

    .line 302
    :cond_8
    new-instance v2, Ljava/util/ArrayList;

    .line 303
    .line 304
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 305
    .line 306
    .line 307
    const-string v0, "download_group"

    .line 308
    .line 309
    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 310
    .line 311
    .line 312
    iget-object p0, p0, Ldefpackage/et0;->u:Ldefpackage/lv4;

    .line 313
    .line 314
    iget-object v0, p0, Ldefpackage/lv4;->s:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v0, Landroid/widget/TextView;

    .line 317
    .line 318
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    const-string v2, "download_group_title"

    .line 327
    .line 328
    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    iget-object p0, p0, Ldefpackage/lv4;->r:Ljava/lang/Object;

    .line 332
    .line 333
    check-cast p0, Landroid/widget/TextView;

    .line 334
    .line 335
    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 336
    .line 337
    .line 338
    move-result-object p0

    .line 339
    invoke-interface {p0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    const-string v0, "download_group_subtitle"

    .line 344
    .line 345
    invoke-virtual {v1, v0, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    invoke-interface {v3, v1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onDownloadGroupLongClick(Landroid/os/Bundle;)V

    .line 349
    .line 350
    .line 351
    return v6

    .line 352
    nop

    .line 353
    :sswitch_data_0
    .sparse-switch
        -0x7eb7cd4b -> :sswitch_5
        -0x380820d5 -> :sswitch_4
        0x944b1c0 -> :sswitch_3
        0x35b50541 -> :sswitch_2
        0x36069055 -> :sswitch_1
        0x36c3781d -> :sswitch_0
    .end sparse-switch

    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
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
