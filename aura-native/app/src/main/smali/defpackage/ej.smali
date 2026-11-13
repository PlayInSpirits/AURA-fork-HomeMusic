.class public final Ldefpackage/ej;
.super Ldefpackage/dw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/widget/Filterable;


# instance fields
.field public final synthetic q:I

.field public r:Ljava/util/List;

.field public s:Ljava/util/ArrayList;

.field public final t:Lcom/eddyizm/tempus/interfaces/ClickCallback;

.field public final u:Landroid/widget/Filter;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Ldefpackage/ej;->q:I

    .line 31
    invoke-direct {p0}, Ldefpackage/dw3;-><init>()V

    .line 32
    new-instance v0, Ldefpackage/o7;

    const/4 v1, 0x7

    invoke-direct {v0, p0, v1}, Ldefpackage/o7;-><init>(Ldefpackage/dw3;I)V

    iput-object v0, p0, Ldefpackage/ej;->u:Landroid/widget/Filter;

    .line 33
    iput-object p1, p0, Ldefpackage/ej;->t:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 34
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ldefpackage/ej;->r:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Ldefpackage/ej;->q:I

    .line 27
    invoke-direct {p0}, Ldefpackage/dw3;-><init>()V

    .line 28
    new-instance v0, Ldefpackage/o7;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Ldefpackage/o7;-><init>(Ldefpackage/dw3;I)V

    iput-object v0, p0, Ldefpackage/ej;->u:Landroid/widget/Filter;

    .line 29
    iput-object p1, p0, Ldefpackage/ej;->t:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 30
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ldefpackage/ej;->r:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Ldefpackage/ej;->q:I

    .line 23
    invoke-direct {p0}, Ldefpackage/dw3;-><init>()V

    .line 24
    new-instance v0, Ldefpackage/o7;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Ldefpackage/o7;-><init>(Ldefpackage/dw3;I)V

    iput-object v0, p0, Ldefpackage/ej;->u:Landroid/widget/Filter;

    .line 25
    iput-object p1, p0, Ldefpackage/ej;->t:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 26
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ldefpackage/ej;->r:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;)V
    .locals 2

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Ldefpackage/ej;->q:I

    .line 3
    .line 4
    invoke-direct {p0}, Ldefpackage/dw3;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v0, Ldefpackage/o7;

    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, Ldefpackage/o7;-><init>(Ldefpackage/dw3;I)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ldefpackage/ej;->u:Landroid/widget/Filter;

    .line 15
    .line 16
    iput-object p1, p0, Ldefpackage/ej;->t:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 17
    .line 18
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 19
    .line 20
    iput-object p1, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/ej;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_0
    iget-object p0, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0

    .line 20
    :pswitch_1
    iget-object p0, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    .line 27
    :pswitch_2
    iget-object p0, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 28
    .line 29
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(I)J
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/ej;->q:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ldefpackage/dw3;->b(I)J

    .line 7
    .line 8
    .line 9
    move-result-wide p0

    .line 10
    return-wide p0

    .line 11
    :sswitch_0
    int-to-long p0, p1

    .line 12
    return-wide p0

    .line 13
    :sswitch_1
    int-to-long p0, p1

    .line 14
    return-wide p0

    .line 15
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x3 -> :sswitch_0
    .end sparse-switch
.end method

.method public final g(Ldefpackage/cx3;I)V
    .locals 6

    .line 1
    iget v0, p0, Ldefpackage/ej;->q:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Ldefpackage/vm3;

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;

    .line 16
    .line 17
    iget-object p2, p1, Ldefpackage/vm3;->u:Ldefpackage/jv3;

    .line 18
    .line 19
    iget-object v0, p2, Ldefpackage/jv3;->p:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;->getTitle()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p1, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;->getCoverArtId()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Ldefpackage/c04;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz p0, :cond_0

    .line 45
    .line 46
    invoke-static {}, Ldefpackage/ud3;->t()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-static {v1, p0}, Ldefpackage/wg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :cond_0
    const/4 v2, 0x7

    .line 55
    invoke-static {p1, p0, v2, v0, v1}, Ldefpackage/b11;->g(Landroid/content/Context;Ljava/lang/String;ILdefpackage/c04;Ljava/lang/String;)Ldefpackage/vz3;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {}, Ldefpackage/xv0;->b()Ldefpackage/xv0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p0, p1}, Ldefpackage/vz3;->T(Ldefpackage/xv0;)Ldefpackage/vz3;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {}, Ldefpackage/ud3;->R()Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_1

    .line 72
    .line 73
    invoke-virtual {p0}, Ldefpackage/lq;->l()Ldefpackage/lq;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, Ldefpackage/vz3;

    .line 78
    .line 79
    :cond_1
    iget-object p1, p2, Ldefpackage/jv3;->o:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p1, Landroid/widget/ImageView;

    .line 82
    .line 83
    invoke-virtual {p0, p1}, Ldefpackage/vz3;->K(Landroid/widget/ImageView;)V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :pswitch_0
    check-cast p1, Ldefpackage/yl3;

    .line 88
    .line 89
    iget-object p0, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 90
    .line 91
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 96
    .line 97
    iget-object p2, p1, Ldefpackage/yl3;->u:Ldefpackage/x12;

    .line 98
    .line 99
    iget-object v0, p2, Ldefpackage/x12;->e:Landroid/widget/TextView;

    .line 100
    .line 101
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    .line 107
    .line 108
    iget-object v0, p2, Ldefpackage/x12;->c:Landroid/widget/TextView;

    .line 109
    .line 110
    iget-object p1, p1, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 111
    .line 112
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getSongCount()I

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getDuration()J

    .line 125
    .line 126
    .line 127
    move-result-wide v4

    .line 128
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    const/4 v5, 0x0

    .line 133
    invoke-static {v4, v5}, Ldefpackage/e03;->h(Ljava/lang/Long;Z)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    const v4, 0x7f1303ef

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2, v4, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getCoverArtId()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Ldefpackage/c04;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    if-eqz p0, :cond_2

    .line 164
    .line 165
    invoke-static {}, Ldefpackage/ud3;->t()I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    invoke-static {v1, p0}, Ldefpackage/wg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    :cond_2
    const/4 v2, 0x6

    .line 174
    invoke-static {p1, p0, v2, v0, v1}, Ldefpackage/b11;->g(Landroid/content/Context;Ljava/lang/String;ILdefpackage/c04;Ljava/lang/String;)Ldefpackage/vz3;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-static {}, Ldefpackage/xv0;->b()Ldefpackage/xv0;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    invoke-virtual {p0, p1}, Ldefpackage/vz3;->T(Ldefpackage/xv0;)Ldefpackage/vz3;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    invoke-static {}, Ldefpackage/ud3;->R()Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    if-eqz p1, :cond_3

    .line 191
    .line 192
    invoke-virtual {p0}, Ldefpackage/lq;->l()Ldefpackage/lq;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    check-cast p0, Ldefpackage/vz3;

    .line 197
    .line 198
    :cond_3
    iget-object p1, p2, Ldefpackage/x12;->b:Landroid/widget/ImageView;

    .line 199
    .line 200
    invoke-virtual {p0, p1}, Ldefpackage/vz3;->K(Landroid/widget/ImageView;)V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :pswitch_1
    check-cast p1, Ldefpackage/eh1;

    .line 205
    .line 206
    iget-object p0, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 207
    .line 208
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object p0

    .line 212
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Genre;

    .line 213
    .line 214
    iget-object p1, p1, Ldefpackage/eh1;->u:Ldefpackage/ie1;

    .line 215
    .line 216
    iget-object p1, p1, Ldefpackage/ie1;->b:Landroid/widget/TextView;

    .line 217
    .line 218
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Genre;->getGenre()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 223
    .line 224
    .line 225
    return-void

    .line 226
    :pswitch_2
    check-cast p1, Ldefpackage/dj;

    .line 227
    .line 228
    iget-object p0, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 229
    .line 230
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 235
    .line 236
    iget-object p2, p1, Ldefpackage/dj;->u:Ldefpackage/r20;

    .line 237
    .line 238
    iget-object v0, p2, Ldefpackage/r20;->q:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v0, Landroid/widget/TextView;

    .line 241
    .line 242
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 247
    .line 248
    .line 249
    iget-object p1, p1, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 250
    .line 251
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 252
    .line 253
    .line 254
    move-result-object p1

    .line 255
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getCoverArtId()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Ldefpackage/c04;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    if-eqz p0, :cond_4

    .line 264
    .line 265
    invoke-static {}, Ldefpackage/ud3;->t()I

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    invoke-static {v1, p0}, Ldefpackage/wg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    :cond_4
    const/4 v2, 0x3

    .line 274
    invoke-static {p1, p0, v2, v0, v1}, Ldefpackage/b11;->g(Landroid/content/Context;Ljava/lang/String;ILdefpackage/c04;Ljava/lang/String;)Ldefpackage/vz3;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    invoke-static {}, Ldefpackage/xv0;->b()Ldefpackage/xv0;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    invoke-virtual {p0, p1}, Ldefpackage/vz3;->T(Ldefpackage/xv0;)Ldefpackage/vz3;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    invoke-static {}, Ldefpackage/ud3;->R()Z

    .line 287
    .line 288
    .line 289
    move-result p1

    .line 290
    if-eqz p1, :cond_5

    .line 291
    .line 292
    invoke-virtual {p0}, Ldefpackage/lq;->l()Ldefpackage/lq;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    check-cast p0, Ldefpackage/vz3;

    .line 297
    .line 298
    :cond_5
    iget-object p1, p2, Ldefpackage/r20;->p:Ljava/lang/Object;

    .line 299
    .line 300
    check-cast p1, Landroid/widget/ImageView;

    .line 301
    .line 302
    invoke-virtual {p0, p1}, Ldefpackage/vz3;->K(Landroid/widget/ImageView;)V

    .line 303
    .line 304
    .line 305
    return-void

    .line 306
    nop

    .line 307
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getFilter()Landroid/widget/Filter;
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/ej;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/ej;->u:Landroid/widget/Filter;

    .line 7
    .line 8
    check-cast p0, Ldefpackage/o7;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Ldefpackage/ej;->u:Landroid/widget/Filter;

    .line 12
    .line 13
    check-cast p0, Ldefpackage/o7;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_1
    iget-object p0, p0, Ldefpackage/ej;->u:Landroid/widget/Filter;

    .line 17
    .line 18
    check-cast p0, Ldefpackage/o7;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_2
    iget-object p0, p0, Ldefpackage/ej;->u:Landroid/widget/Filter;

    .line 22
    .line 23
    check-cast p0, Ldefpackage/o7;

    .line 24
    .line 25
    return-object p0

    .line 26
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Landroid/view/ViewGroup;I)Ldefpackage/cx3;
    .locals 9

    .line 1
    iget p2, p0, Ldefpackage/ej;->q:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, "Missing required view with ID: "

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    packed-switch p2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    const p2, 0x7f0d0096

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p2, p1, v2}, Ldefpackage/b11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const p2, 0x7f0a04cc

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Landroid/widget/ImageView;

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    const p2, 0x7f0a04d5

    .line 29
    .line 30
    .line 31
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Landroid/widget/TextView;

    .line 36
    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    new-instance p2, Ldefpackage/jv3;

    .line 40
    .line 41
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 42
    .line 43
    invoke-direct {p2, p1, v2, v3}, Ldefpackage/jv3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Ldefpackage/vm3;

    .line 47
    .line 48
    invoke-direct {v0, p0, p2}, Ldefpackage/vm3;-><init>(Ldefpackage/ej;Ldefpackage/jv3;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :goto_0
    return-object v0

    .line 68
    :pswitch_0
    const p2, 0x7f0d00a2

    .line 69
    .line 70
    .line 71
    invoke-static {p1, p2, p1, v2}, Ldefpackage/b11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    const p2, 0x7f0a04a8

    .line 76
    .line 77
    .line 78
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    move-object v5, v2

    .line 83
    check-cast v5, Landroid/widget/ImageView;

    .line 84
    .line 85
    if-eqz v5, :cond_1

    .line 86
    .line 87
    const p2, 0x7f0a04bc

    .line 88
    .line 89
    .line 90
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    move-object v6, v2

    .line 95
    check-cast v6, Landroid/widget/FrameLayout;

    .line 96
    .line 97
    if-eqz v6, :cond_1

    .line 98
    .line 99
    const p2, 0x7f0a04c6

    .line 100
    .line 101
    .line 102
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    move-object v7, v2

    .line 107
    check-cast v7, Landroid/widget/TextView;

    .line 108
    .line 109
    if-eqz v7, :cond_1

    .line 110
    .line 111
    const p2, 0x7f0a04c7

    .line 112
    .line 113
    .line 114
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    move-object v8, v2

    .line 119
    check-cast v8, Landroid/widget/TextView;

    .line 120
    .line 121
    if-eqz v8, :cond_1

    .line 122
    .line 123
    new-instance v3, Ldefpackage/x12;

    .line 124
    .line 125
    move-object v4, p1

    .line 126
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 127
    .line 128
    invoke-direct/range {v3 .. v8}, Ldefpackage/x12;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/FrameLayout;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 129
    .line 130
    .line 131
    new-instance v0, Ldefpackage/yl3;

    .line 132
    .line 133
    invoke-direct {v0, p0, v3}, Ldefpackage/yl3;-><init>(Ldefpackage/ej;Ldefpackage/x12;)V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :goto_1
    return-object v0

    .line 153
    :pswitch_1
    const p2, 0x7f0d00ad

    .line 154
    .line 155
    .line 156
    invoke-static {p1, p2, p1, v2}, Ldefpackage/b11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    const p2, 0x7f0a0146

    .line 161
    .line 162
    .line 163
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    check-cast v2, Landroidx/cardview/widget/CardView;

    .line 168
    .line 169
    if-eqz v2, :cond_2

    .line 170
    .line 171
    const p2, 0x7f0a026e

    .line 172
    .line 173
    .line 174
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 175
    .line 176
    .line 177
    move-result-object v2

    .line 178
    check-cast v2, Landroid/widget/TextView;

    .line 179
    .line 180
    if-eqz v2, :cond_2

    .line 181
    .line 182
    new-instance p2, Ldefpackage/ie1;

    .line 183
    .line 184
    check-cast p1, Landroid/widget/LinearLayout;

    .line 185
    .line 186
    invoke-direct {p2, p1, v2}, Ldefpackage/ie1;-><init>(Landroid/widget/LinearLayout;Landroid/widget/TextView;)V

    .line 187
    .line 188
    .line 189
    new-instance v0, Ldefpackage/eh1;

    .line 190
    .line 191
    invoke-direct {v0, p0, p2}, Ldefpackage/eh1;-><init>(Ldefpackage/ej;Ldefpackage/ie1;)V

    .line 192
    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    :goto_2
    return-object v0

    .line 211
    :pswitch_2
    const p2, 0x7f0d00ac

    .line 212
    .line 213
    .line 214
    invoke-static {p1, p2, p1, v2}, Ldefpackage/b11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    const p2, 0x7f0a00e4

    .line 219
    .line 220
    .line 221
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 222
    .line 223
    .line 224
    move-result-object v2

    .line 225
    move-object v5, v2

    .line 226
    check-cast v5, Landroid/widget/ImageView;

    .line 227
    .line 228
    if-eqz v5, :cond_3

    .line 229
    .line 230
    const p2, 0x7f0a00ef

    .line 231
    .line 232
    .line 233
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    move-object v6, v2

    .line 238
    check-cast v6, Landroid/widget/TextView;

    .line 239
    .line 240
    if-eqz v6, :cond_3

    .line 241
    .line 242
    new-instance v3, Ldefpackage/r20;

    .line 243
    .line 244
    move-object v4, p1

    .line 245
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 246
    .line 247
    const/4 v8, 0x7

    .line 248
    const/4 v7, 0x0

    .line 249
    invoke-direct/range {v3 .. v8}, Ldefpackage/r20;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 250
    .line 251
    .line 252
    new-instance v0, Ldefpackage/dj;

    .line 253
    .line 254
    invoke-direct {v0, p0, v3}, Ldefpackage/dj;-><init>(Ldefpackage/ej;Ldefpackage/r20;)V

    .line 255
    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object p0

    .line 266
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object p0

    .line 270
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    :goto_3
    return-object v0

    .line 274
    nop

    .line 275
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public p(Ljava/util/List;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Ldefpackage/ej;->s:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public q(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    sparse-switch v0, :sswitch_data_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :sswitch_0
    const-string v0, "ARTIST_ORDER_BY_NAME"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x2

    .line 20
    goto :goto_0

    .line 21
    :sswitch_1
    const-string v0, "ARTIST_ORDER_BY_RANDOM"

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v1, 0x1

    .line 31
    goto :goto_0

    .line 32
    :sswitch_2
    const-string v0, "ARTIST_ORDER_BY_ALBUM_COUNT"

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-nez p1, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const/4 v1, 0x0

    .line 42
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :pswitch_0
    iget-object p1, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 47
    .line 48
    new-instance v0, Ldefpackage/m7;

    .line 49
    .line 50
    const/16 v1, 0x9

    .line 51
    .line 52
    invoke-direct {v0, v1}, Ldefpackage/m7;-><init>(I)V

    .line 53
    .line 54
    .line 55
    sget-object v1, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    .line 56
    .line 57
    invoke-static {v0, v1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {p1, v0}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :pswitch_1
    iget-object p1, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 66
    .line 67
    invoke-static {p1}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :pswitch_2
    iget-object p1, p0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 72
    .line 73
    new-instance v0, Ldefpackage/m7;

    .line 74
    .line 75
    const/16 v1, 0xa

    .line 76
    .line 77
    invoke-direct {v0, v1}, Ldefpackage/m7;-><init>(I)V

    .line 78
    .line 79
    .line 80
    invoke-static {v0}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-interface {v0}, Ljava/util/Comparator;->reversed()Ljava/util/Comparator;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-interface {p1, v0}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    .line 89
    .line 90
    .line 91
    :goto_1
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :sswitch_data_0
    .sparse-switch
        -0x3a7691c0 -> :sswitch_2
        0x21c2b0e2 -> :sswitch_1
        0x6186c66a -> :sswitch_0
    .end sparse-switch

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
