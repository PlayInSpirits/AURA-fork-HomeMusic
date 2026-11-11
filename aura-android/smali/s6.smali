.class public final Ls6;
.super Ldw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic q:I

.field public r:Ljava/util/List;

.field public s:I

.field public final t:Lcom/eddyizm/tempus/interfaces/ClickCallback;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Ls6;->q:I

    .line 22
    invoke-direct {p0}, Ldw3;-><init>()V

    const/16 v0, 0x190

    .line 23
    iput v0, p0, Ls6;->s:I

    .line 24
    iput-object p1, p0, Ls6;->t:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 25
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ls6;->r:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ls6;->q:I

    .line 3
    .line 4
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 5
    .line 6
    .line 7
    const/16 v0, 0x190

    .line 8
    .line 9
    iput v0, p0, Ls6;->s:I

    .line 10
    .line 11
    iput-object p1, p0, Ls6;->t:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 12
    .line 13
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 14
    .line 15
    iput-object p1, p0, Ls6;->r:Ljava/util/List;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lcp1;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Ls6;->q:I

    .line 18
    invoke-direct {p0}, Ldw3;-><init>()V

    const/16 v0, 0x190

    .line 19
    iput v0, p0, Ls6;->s:I

    .line 20
    iput-object p1, p0, Ls6;->t:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 21
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ls6;->r:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Ls6;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ls6;->r:Ljava/util/List;

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
    iget-object p0, p0, Ls6;->r:Ljava/util/List;

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
    iget-object p0, p0, Ls6;->r:Ljava/util/List;

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Lcx3;I)V
    .locals 4

    .line 1
    iget v0, p0, Ls6;->q:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Lxd4;

    .line 8
    .line 9
    iget-object v0, p1, Lxd4;->u:Lqp4;

    .line 10
    .line 11
    iget-object v2, v0, Lqp4;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Landroid/widget/ImageView;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget v3, p0, Ls6;->s:I

    .line 20
    .line 21
    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 22
    .line 23
    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 24
    .line 25
    iget-object v3, v0, Lqp4;->c:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, Landroid/widget/ImageView;

    .line 28
    .line 29
    invoke-virtual {v3, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Ls6;->r:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 39
    .line 40
    iget-object p2, v0, Lqp4;->b:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p2, Landroid/widget/TextView;

    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, p1, Lcx3;->a:Landroid/view/View;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    if-eqz p0, :cond_0

    .line 66
    .line 67
    invoke-static {}, Lud3;->t()I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    invoke-static {v1, p0}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    :cond_0
    const/16 v2, 0x9

    .line 76
    .line 77
    invoke-static {p1, p0, v2, p2, v1}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p0, p1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-static {}, Lud3;->R()Z

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-eqz p1, :cond_1

    .line 94
    .line 95
    invoke-virtual {p0}, Llq;->l()Llq;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, Lvz3;

    .line 100
    .line 101
    :cond_1
    iget-object p1, v0, Lqp4;->c:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p1, Landroid/widget/ImageView;

    .line 104
    .line 105
    invoke-virtual {p0, p1}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :pswitch_0
    check-cast p1, Lcj;

    .line 110
    .line 111
    iget-object v0, p1, Lcj;->u:Lns3;

    .line 112
    .line 113
    iget-object v2, v0, Lns3;->p:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v2, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 116
    .line 117
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    iget v3, p0, Ls6;->s:I

    .line 122
    .line 123
    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 124
    .line 125
    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 126
    .line 127
    iget-object v3, v0, Lns3;->p:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v3, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 130
    .line 131
    invoke-virtual {v3, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 132
    .line 133
    .line 134
    iget-object p0, p0, Ls6;->r:Ljava/util/List;

    .line 135
    .line 136
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 141
    .line 142
    iget-object p2, v0, Lns3;->q:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p2, Landroid/widget/TextView;

    .line 145
    .line 146
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 151
    .line 152
    .line 153
    iget-object p1, p1, Lcx3;->a:Landroid/view/View;

    .line 154
    .line 155
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getCoverArtId()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    if-eqz p0, :cond_2

    .line 168
    .line 169
    invoke-static {}, Lud3;->t()I

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    invoke-static {v1, p0}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    :cond_2
    const/4 v2, 0x3

    .line 178
    invoke-static {p1, p0, v2, p2, v1}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-virtual {p0, p1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-static {}, Lud3;->R()Z

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    if-eqz p1, :cond_3

    .line 195
    .line 196
    invoke-virtual {p0}, Llq;->l()Llq;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    check-cast p0, Lvz3;

    .line 201
    .line 202
    :cond_3
    iget-object p1, v0, Lns3;->p:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast p1, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 205
    .line 206
    invoke-virtual {p0, p1}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    :pswitch_1
    check-cast p1, Lr6;

    .line 211
    .line 212
    iget-object v0, p1, Lr6;->u:Lbq4;

    .line 213
    .line 214
    iget-object v2, v0, Lbq4;->o:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast v2, Landroid/widget/ImageView;

    .line 217
    .line 218
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    iget v3, p0, Ls6;->s:I

    .line 223
    .line 224
    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 225
    .line 226
    iput v3, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 227
    .line 228
    iget-object v3, v0, Lbq4;->o:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v3, Landroid/widget/ImageView;

    .line 231
    .line 232
    invoke-virtual {v3, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 233
    .line 234
    .line 235
    iget-object p0, p0, Ls6;->r:Ljava/util/List;

    .line 236
    .line 237
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 242
    .line 243
    iget-object p2, v0, Lbq4;->p:Ljava/lang/Object;

    .line 244
    .line 245
    check-cast p2, Landroid/widget/TextView;

    .line 246
    .line 247
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getName()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 252
    .line 253
    .line 254
    iget-object p2, v0, Lbq4;->q:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast p2, Landroid/widget/TextView;

    .line 257
    .line 258
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getArtist()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 263
    .line 264
    .line 265
    iget-object p1, p1, Lcx3;->a:Landroid/view/View;

    .line 266
    .line 267
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 268
    .line 269
    .line 270
    move-result-object p1

    .line 271
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getCoverArtId()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 276
    .line 277
    .line 278
    move-result-object p2

    .line 279
    if-eqz p0, :cond_4

    .line 280
    .line 281
    invoke-static {}, Lud3;->t()I

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    invoke-static {v1, p0}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    :cond_4
    const/4 v2, 0x2

    .line 290
    invoke-static {p1, p0, v2, p2, v1}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    invoke-virtual {p0, p1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    invoke-static {}, Lud3;->R()Z

    .line 303
    .line 304
    .line 305
    move-result p1

    .line 306
    if-eqz p1, :cond_5

    .line 307
    .line 308
    invoke-virtual {p0}, Llq;->l()Llq;

    .line 309
    .line 310
    .line 311
    move-result-object p0

    .line 312
    check-cast p0, Lvz3;

    .line 313
    .line 314
    :cond_5
    iget-object p1, v0, Lbq4;->o:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast p1, Landroid/widget/ImageView;

    .line 317
    .line 318
    invoke-virtual {p0, p1}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 319
    .line 320
    .line 321
    return-void

    .line 322
    nop

    .line 323
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Landroid/view/ViewGroup;I)Lcx3;
    .locals 5

    .line 1
    iget p2, p0, Ls6;->q:I

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
    const p2, 0x7f0d009c

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p2, p1, v2}, Lb11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const v2, 0x7f0a0618

    .line 18
    .line 19
    .line 20
    invoke-static {p2, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Landroid/widget/TextView;

    .line 25
    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    const v2, 0x7f0a0626

    .line 29
    .line 30
    .line 31
    invoke-static {p2, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Landroid/widget/ImageView;

    .line 36
    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    new-instance v0, Lqp4;

    .line 40
    .line 41
    check-cast p2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 42
    .line 43
    invoke-direct {v0, p2, v3, v4}, Lqp4;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/ImageView;)V

    .line 44
    .line 45
    .line 46
    invoke-static {}, Lut4;->c()Lut4;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {p2, v1}, Lut4;->b(Landroid/content/Context;)V

    .line 55
    .line 56
    .line 57
    invoke-static {}, Lut4;->c()Lut4;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p2, p1}, Lut4;->d(Landroid/content/Context;)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    iput p1, p0, Ls6;->s:I

    .line 70
    .line 71
    new-instance p1, Lxd4;

    .line 72
    .line 73
    invoke-direct {p1, p0, v0}, Lxd4;-><init>(Ls6;Lqp4;)V

    .line 74
    .line 75
    .line 76
    move-object v0, p1

    .line 77
    goto :goto_0

    .line 78
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :goto_0
    return-object v0

    .line 94
    :pswitch_0
    const p2, 0x7f0d0093

    .line 95
    .line 96
    .line 97
    invoke-static {p1, p2, p1, v2}, Lb11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    const v2, 0x7f0a00e8

    .line 102
    .line 103
    .line 104
    invoke-static {p2, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    check-cast v3, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 109
    .line 110
    if-eqz v3, :cond_1

    .line 111
    .line 112
    const v2, 0x7f0a00ef

    .line 113
    .line 114
    .line 115
    invoke-static {p2, v2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    check-cast v4, Landroid/widget/TextView;

    .line 120
    .line 121
    if-eqz v4, :cond_1

    .line 122
    .line 123
    new-instance v0, Lns3;

    .line 124
    .line 125
    check-cast p2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 126
    .line 127
    const/4 v1, 0x5

    .line 128
    invoke-direct {v0, p2, v3, v4, v1}, Lns3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 129
    .line 130
    .line 131
    invoke-static {}, Lut4;->c()Lut4;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-virtual {p2, v1}, Lut4;->b(Landroid/content/Context;)V

    .line 140
    .line 141
    .line 142
    invoke-static {}, Lut4;->c()Lut4;

    .line 143
    .line 144
    .line 145
    move-result-object p2

    .line 146
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {p2, p1}, Lut4;->d(Landroid/content/Context;)I

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    iput p1, p0, Ls6;->s:I

    .line 155
    .line 156
    new-instance p1, Lcj;

    .line 157
    .line 158
    invoke-direct {p1, p0, v0}, Lcj;-><init>(Ls6;Lns3;)V

    .line 159
    .line 160
    .line 161
    move-object v0, p1

    .line 162
    goto :goto_1

    .line 163
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    :goto_1
    return-object v0

    .line 179
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    invoke-static {p2, p1}, Lbq4;->m(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lbq4;

    .line 188
    .line 189
    .line 190
    move-result-object p2

    .line 191
    invoke-static {}, Lut4;->c()Lut4;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 196
    .line 197
    .line 198
    move-result-object v1

    .line 199
    invoke-virtual {v0, v1}, Lut4;->b(Landroid/content/Context;)V

    .line 200
    .line 201
    .line 202
    invoke-static {}, Lut4;->c()Lut4;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-virtual {v0, p1}, Lut4;->d(Landroid/content/Context;)I

    .line 211
    .line 212
    .line 213
    move-result p1

    .line 214
    iput p1, p0, Ls6;->s:I

    .line 215
    .line 216
    new-instance p1, Lr6;

    .line 217
    .line 218
    invoke-direct {p1, p0, p2}, Lr6;-><init>(Ls6;Lbq4;)V

    .line 219
    .line 220
    .line 221
    return-object p1

    .line 222
    nop

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public p(Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls6;->r:Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldw3;->d()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
