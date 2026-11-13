.class public final synthetic Ldefpackage/dt0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/et0;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/et0;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/dt0;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/dt0;->o:Ldefpackage/et0;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 10

    .line 1
    iget p1, p0, Ldefpackage/dt0;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/dt0;->o:Ldefpackage/et0;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ldefpackage/et0;->s()Z

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    new-instance p1, Landroid/os/Bundle;

    .line 13
    .line 14
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Ldefpackage/et0;->v:Ldefpackage/ft0;

    .line 18
    .line 19
    iget-object v1, v0, Ldefpackage/ft0;->r:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v2, v0, Ldefpackage/ft0;->q:Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    const-string v4, "download_type_genre"

    .line 31
    .line 32
    const-string v5, "download_type_album"

    .line 33
    .line 34
    const-string v6, "download_type_playlist"

    .line 35
    .line 36
    const-string v7, "download_type_year"

    .line 37
    .line 38
    const-string v8, "download_type_artist"

    .line 39
    .line 40
    const/4 v9, -0x1

    .line 41
    sparse-switch v3, :sswitch_data_0

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :sswitch_0
    const-string v3, "download_type_track"

    .line 46
    .line 47
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-nez v1, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const/4 v9, 0x5

    .line 55
    goto :goto_0

    .line 56
    :sswitch_1
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-nez v1, :cond_1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    const/4 v9, 0x4

    .line 64
    goto :goto_0

    .line 65
    :sswitch_2
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-nez v1, :cond_2

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    const/4 v9, 0x3

    .line 73
    goto :goto_0

    .line 74
    :sswitch_3
    invoke-virtual {v1, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-nez v1, :cond_3

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_3
    const/4 v9, 0x2

    .line 82
    goto :goto_0

    .line 83
    :sswitch_4
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_4

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_4
    const/4 v9, 0x1

    .line 91
    goto :goto_0

    .line 92
    :sswitch_5
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    if-nez v1, :cond_5

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_5
    const/4 v9, 0x0

    .line 100
    :goto_0
    packed-switch v9, :pswitch_data_1

    .line 101
    .line 102
    .line 103
    goto/16 :goto_1

    .line 104
    .line 105
    :pswitch_1
    new-instance v1, Ljava/util/ArrayList;

    .line 106
    .line 107
    iget-object v0, v0, Ldefpackage/ft0;->w:Ljava/util/List;

    .line 108
    .line 109
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 110
    .line 111
    .line 112
    const-string v0, "TRACKS_OBJECT"

    .line 113
    .line 114
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 115
    .line 116
    .line 117
    const-string v0, "ITEM_POSITION"

    .line 118
    .line 119
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    invoke-virtual {p1, v0, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v2, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onMediaClick(Landroid/os/Bundle;)V

    .line 127
    .line 128
    .line 129
    goto/16 :goto_1

    .line 130
    .line 131
    :pswitch_2
    iget-object v0, v0, Ldefpackage/ft0;->w:Ljava/util/List;

    .line 132
    .line 133
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 142
    .line 143
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getGenre()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-virtual {p1, v4, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    invoke-interface {v2, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onGenreClick(Landroid/os/Bundle;)V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :pswitch_3
    iget-object v0, v0, Ldefpackage/ft0;->w:Ljava/util/List;

    .line 155
    .line 156
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 165
    .line 166
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    invoke-virtual {p1, v5, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-interface {v2, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onAlbumClick(Landroid/os/Bundle;)V

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :pswitch_4
    iget-object v1, v0, Ldefpackage/ft0;->w:Ljava/util/List;

    .line 178
    .line 179
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    instance-of v1, v1, Lcom/eddyizm/tempus/model/Download;

    .line 188
    .line 189
    if-eqz v1, :cond_6

    .line 190
    .line 191
    iget-object v0, v0, Ldefpackage/ft0;->w:Ljava/util/List;

    .line 192
    .line 193
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 194
    .line 195
    .line 196
    move-result p0

    .line 197
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    check-cast p0, Lcom/eddyizm/tempus/model/Download;

    .line 202
    .line 203
    invoke-virtual {p0}, Lcom/eddyizm/tempus/model/Download;->getPlaylistId()Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    invoke-virtual {p1, v6, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-interface {v2, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onPlaylistClick(Landroid/os/Bundle;)V

    .line 211
    .line 212
    .line 213
    goto :goto_1

    .line 214
    :pswitch_5
    iget-object v0, v0, Ldefpackage/ft0;->w:Ljava/util/List;

    .line 215
    .line 216
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 217
    .line 218
    .line 219
    move-result p0

    .line 220
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 225
    .line 226
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getYear()Ljava/lang/Integer;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    invoke-virtual {p0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    invoke-virtual {p1, v7, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    invoke-interface {v2, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onYearClick(Landroid/os/Bundle;)V

    .line 238
    .line 239
    .line 240
    goto :goto_1

    .line 241
    :pswitch_6
    iget-object v0, v0, Ldefpackage/ft0;->w:Ljava/util/List;

    .line 242
    .line 243
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 244
    .line 245
    .line 246
    move-result p0

    .line 247
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object p0

    .line 251
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 252
    .line 253
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    invoke-virtual {p1, v8, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-interface {v2, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onArtistClick(Landroid/os/Bundle;)V

    .line 261
    .line 262
    .line 263
    :cond_6
    :goto_1
    return-void

    .line 264
    nop

    .line 265
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    :sswitch_data_0
    .sparse-switch
        -0x7eb7cd4b -> :sswitch_5
        -0x380820d5 -> :sswitch_4
        0x944b1c0 -> :sswitch_3
        0x35b50541 -> :sswitch_2
        0x36069055 -> :sswitch_1
        0x36c3781d -> :sswitch_0
    .end sparse-switch

    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
