.class public final Lzd0;
.super Ldw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic q:I

.field public r:Ljava/util/List;

.field public s:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lzd0;->q:I

    invoke-direct {p0}, Ldw3;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lzd0;->q:I

    .line 28
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 29
    iput-object p1, p0, Lzd0;->s:Ljava/lang/Object;

    .line 30
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lzd0;->r:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lzd0;->q:I

    .line 19
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 20
    iput-object p1, p0, Lzd0;->s:Ljava/lang/Object;

    .line 21
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lzd0;->r:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/ui/fragment/LoginFragment;)V
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    iput v0, p0, Lzd0;->q:I

    .line 4
    .line 5
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lzd0;->s:Ljava/lang/Object;

    .line 9
    .line 10
    new-instance p1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lzd0;->r:Ljava/util/List;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lzd0;->q:I

    .line 31
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 32
    iput-object p1, p0, Lzd0;->s:Ljava/lang/Object;

    .line 33
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lzd0;->r:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lfl3;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lzd0;->q:I

    .line 25
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 26
    iput-object p1, p0, Lzd0;->s:Ljava/lang/Object;

    .line 27
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lzd0;->r:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lgp1;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lzd0;->q:I

    .line 22
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 23
    iput-object p1, p0, Lzd0;->s:Ljava/lang/Object;

    .line 24
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lzd0;->r:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lhp1;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lzd0;->q:I

    .line 34
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 35
    iput-object p1, p0, Lzd0;->s:Ljava/lang/Object;

    .line 36
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Lzd0;->r:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lss2;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lzd0;->q:I

    .line 37
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 38
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Lzd0;->r:Ljava/util/List;

    .line 39
    iput-object p1, p0, Lzd0;->s:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lzd0;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lzd0;->r:Ljava/util/List;

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
    iget-object p0, p0, Lzd0;->r:Ljava/util/List;

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
    iget-object p0, p0, Lzd0;->r:Ljava/util/List;

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
    iget-object p0, p0, Lzd0;->r:Ljava/util/List;

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
    :pswitch_3
    iget-object p0, p0, Lzd0;->r:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    return p0

    .line 41
    :pswitch_4
    iget-object p0, p0, Lzd0;->r:Ljava/util/List;

    .line 42
    .line 43
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    return p0

    .line 48
    :pswitch_5
    iget-object p0, p0, Lzd0;->r:Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    return p0

    .line 55
    :pswitch_6
    iget-object p0, p0, Lzd0;->r:Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    return p0

    .line 62
    :pswitch_7
    iget-object p0, p0, Lzd0;->r:Ljava/util/List;

    .line 63
    .line 64
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    return p0

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final g(Lcx3;I)V
    .locals 12

    .line 1
    iget v0, p0, Lzd0;->q:I

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Lla4;

    .line 13
    .line 14
    iget-object p0, p0, Lzd0;->r:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Lcom/eddyizm/tempus/model/Server;

    .line 21
    .line 22
    iget-object p1, p1, Lla4;->u:Li61;

    .line 23
    .line 24
    iget-object p2, p1, Li61;->q:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p2, Landroid/widget/TextView;

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/eddyizm/tempus/model/Server;->getServerName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p1, Li61;->p:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Landroid/widget/TextView;

    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/eddyizm/tempus/model/Server;->getAddress()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_0
    check-cast p1, Ldu3;

    .line 48
    .line 49
    iget-object v0, p0, Lzd0;->r:Ljava/util/List;

    .line 50
    .line 51
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    check-cast p2, Lcom/eddyizm/tempus/radiobrowser/RadioBrowserStation;

    .line 56
    .line 57
    iget-object v0, p1, Ldu3;->u:Lna4;

    .line 58
    .line 59
    iget-object p1, p1, Lcx3;->a:Landroid/view/View;

    .line 60
    .line 61
    iget-object v1, v0, Lna4;->q:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v1, Landroid/widget/TextView;

    .line 64
    .line 65
    iget-object v3, p2, Lcom/eddyizm/tempus/radiobrowser/RadioBrowserStation;->name:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    new-instance v1, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    iget-object v3, p2, Lcom/eddyizm/tempus/radiobrowser/RadioBrowserStation;->country:Ljava/lang/String;

    .line 76
    .line 77
    if-eqz v3, :cond_0

    .line 78
    .line 79
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-nez v3, :cond_0

    .line 84
    .line 85
    iget-object v3, p2, Lcom/eddyizm/tempus/radiobrowser/RadioBrowserStation;->country:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    :cond_0
    iget-object v3, p2, Lcom/eddyizm/tempus/radiobrowser/RadioBrowserStation;->codec:Ljava/lang/String;

    .line 91
    .line 92
    const-string v5, " \u00b7 "

    .line 93
    .line 94
    if-eqz v3, :cond_2

    .line 95
    .line 96
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-nez v3, :cond_2

    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    if-lez v3, :cond_1

    .line 107
    .line 108
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    :cond_1
    iget-object v3, p2, Lcom/eddyizm/tempus/radiobrowser/RadioBrowserStation;->codec:Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    :cond_2
    iget v3, p2, Lcom/eddyizm/tempus/radiobrowser/RadioBrowserStation;->bitrate:I

    .line 117
    .line 118
    if-lez v3, :cond_4

    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-lez v3, :cond_3

    .line 125
    .line 126
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    :cond_3
    iget v3, p2, Lcom/eddyizm/tempus/radiobrowser/RadioBrowserStation;->bitrate:I

    .line 130
    .line 131
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    const-string v3, " kbps"

    .line 135
    .line 136
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    :cond_4
    iget-object v3, v0, Lna4;->p:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v3, Landroid/widget/TextView;

    .line 142
    .line 143
    iget-object v5, v0, Lna4;->n:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v5, Lcom/google/android/material/button/MaterialButton;

    .line 146
    .line 147
    iget-object v0, v0, Lna4;->o:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, Landroid/widget/ImageView;

    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 156
    .line 157
    .line 158
    iget-object v1, p2, Lcom/eddyizm/tempus/radiobrowser/RadioBrowserStation;->favicon:Ljava/lang/String;

    .line 159
    .line 160
    if-eqz v1, :cond_5

    .line 161
    .line 162
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result v3

    .line 166
    if-nez v3, :cond_5

    .line 167
    .line 168
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    invoke-static {v3}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-virtual {v3, v1}, Lc04;->t(Ljava/lang/String;)Lvz3;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-static {v2, p1, v1}, Lwg0;->a(ILandroid/content/Context;Ljava/lang/String;)Lg04;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    invoke-virtual {v3, p1}, Lvz3;->G(Llq;)Lvz3;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    invoke-virtual {p1, v0}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 193
    .line 194
    .line 195
    goto :goto_0

    .line 196
    :cond_5
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 197
    .line 198
    .line 199
    :goto_0
    const p1, 0x7f13043e

    .line 200
    .line 201
    .line 202
    invoke-virtual {v5, p1}, Landroid/widget/TextView;->setText(I)V

    .line 203
    .line 204
    .line 205
    new-instance p1, Lj8;

    .line 206
    .line 207
    const/16 v0, 0x15

    .line 208
    .line 209
    invoke-direct {p1, v0, p0, p2}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v5, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :pswitch_1
    check-cast p1, Lzm3;

    .line 217
    .line 218
    iget-object p0, p0, Lzd0;->r:Ljava/util/List;

    .line 219
    .line 220
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;

    .line 225
    .line 226
    iget-object p2, p1, Lzm3;->u:Lz40;

    .line 227
    .line 228
    iget-object v0, p2, Lz40;->r:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v0, Landroid/widget/TextView;

    .line 231
    .line 232
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;->getTitle()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 237
    .line 238
    .line 239
    iget-object v0, p2, Lz40;->p:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v0, Landroid/widget/TextView;

    .line 242
    .line 243
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;->getDescription()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    sget-object v2, Le03;->a:Ljava/util/regex/Pattern;

    .line 248
    .line 249
    if-eqz v1, :cond_6

    .line 250
    .line 251
    const/16 v2, 0x3f

    .line 252
    .line 253
    invoke-static {v1, v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v1

    .line 261
    goto :goto_1

    .line 262
    :cond_6
    const-string v1, ""

    .line 263
    .line 264
    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 265
    .line 266
    .line 267
    iget-object p1, p1, Lcx3;->a:Landroid/view/View;

    .line 268
    .line 269
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 270
    .line 271
    .line 272
    move-result-object p1

    .line 273
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;->getCoverArtId()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    if-eqz p0, :cond_7

    .line 282
    .line 283
    invoke-static {}, Lud3;->t()I

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    invoke-static {v1, p0}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    :cond_7
    const/4 v1, 0x7

    .line 292
    invoke-static {p1, p0, v1, v0, v4}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 297
    .line 298
    .line 299
    move-result-object p1

    .line 300
    invoke-virtual {p0, p1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    invoke-static {}, Lud3;->R()Z

    .line 305
    .line 306
    .line 307
    move-result p1

    .line 308
    if-eqz p1, :cond_8

    .line 309
    .line 310
    invoke-virtual {p0}, Llq;->l()Llq;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    check-cast p0, Lvz3;

    .line 315
    .line 316
    :cond_8
    iget-object p1, p2, Lz40;->o:Ljava/lang/Object;

    .line 317
    .line 318
    check-cast p1, Landroid/widget/ImageView;

    .line 319
    .line 320
    invoke-virtual {p0, p1}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 321
    .line 322
    .line 323
    return-void

    .line 324
    :pswitch_2
    check-cast p1, Lol3;

    .line 325
    .line 326
    iget-object p0, p0, Lzd0;->r:Ljava/util/List;

    .line 327
    .line 328
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object p0

    .line 332
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 333
    .line 334
    iget-object p2, p1, Lol3;->u:Llv4;

    .line 335
    .line 336
    iget-object v0, p2, Llv4;->t:Ljava/lang/Object;

    .line 337
    .line 338
    check-cast v0, Landroid/widget/TextView;

    .line 339
    .line 340
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v2

    .line 344
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 345
    .line 346
    .line 347
    iget-object v0, p2, Llv4;->p:Ljava/lang/Object;

    .line 348
    .line 349
    check-cast v0, Landroid/widget/TextView;

    .line 350
    .line 351
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 356
    .line 357
    .line 358
    iget-object v0, p2, Llv4;->q:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v0, Landroid/widget/TextView;

    .line 361
    .line 362
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDuration()Ljava/lang/Integer;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    invoke-static {v2}, Le03;->g(Ljava/lang/Integer;)Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 371
    .line 372
    .line 373
    iget-object p1, p1, Lcx3;->a:Landroid/view/View;

    .line 374
    .line 375
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 376
    .line 377
    .line 378
    move-result-object p1

    .line 379
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 380
    .line 381
    .line 382
    move-result-object p0

    .line 383
    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    if-eqz p0, :cond_9

    .line 388
    .line 389
    invoke-static {}, Lud3;->t()I

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    invoke-static {v2, p0}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v4

    .line 397
    :cond_9
    invoke-static {p1, p0, v1, v0, v4}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 398
    .line 399
    .line 400
    move-result-object p0

    .line 401
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    invoke-virtual {p0, p1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 406
    .line 407
    .line 408
    move-result-object p0

    .line 409
    invoke-static {}, Lud3;->R()Z

    .line 410
    .line 411
    .line 412
    move-result p1

    .line 413
    if-eqz p1, :cond_a

    .line 414
    .line 415
    invoke-virtual {p0}, Llq;->l()Llq;

    .line 416
    .line 417
    .line 418
    move-result-object p0

    .line 419
    check-cast p0, Lvz3;

    .line 420
    .line 421
    :cond_a
    iget-object p1, p2, Llv4;->o:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast p1, Landroid/widget/ImageView;

    .line 424
    .line 425
    invoke-virtual {p0, p1}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 426
    .line 427
    .line 428
    return-void

    .line 429
    :pswitch_3
    check-cast p1, Lnl3;

    .line 430
    .line 431
    iget-object p0, p0, Lzd0;->r:Ljava/util/List;

    .line 432
    .line 433
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object p0

    .line 437
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 438
    .line 439
    iget-object p2, p1, Lnl3;->u:Lz05;

    .line 440
    .line 441
    iget-object v0, p2, Lz05;->q:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v0, Landroid/widget/TextView;

    .line 444
    .line 445
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v1

    .line 449
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 450
    .line 451
    .line 452
    iget-object p2, p2, Lz05;->p:Ljava/lang/Object;

    .line 453
    .line 454
    check-cast p2, Landroid/widget/TextView;

    .line 455
    .line 456
    iget-object p1, p1, Lcx3;->a:Landroid/view/View;

    .line 457
    .line 458
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 459
    .line 460
    .line 461
    move-result-object p1

    .line 462
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getSongCount()I

    .line 463
    .line 464
    .line 465
    move-result v0

    .line 466
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getDuration()J

    .line 471
    .line 472
    .line 473
    move-result-wide v1

    .line 474
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 475
    .line 476
    .line 477
    move-result-object p0

    .line 478
    invoke-static {p0, v3}, Le03;->h(Ljava/lang/Long;Z)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object p0

    .line 482
    filled-new-array {v0, p0}, [Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object p0

    .line 486
    const v0, 0x7f1303ef

    .line 487
    .line 488
    .line 489
    invoke-virtual {p1, v0, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object p0

    .line 493
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 494
    .line 495
    .line 496
    return-void

    .line 497
    :pswitch_4
    check-cast p1, Lyz2;

    .line 498
    .line 499
    iget-object p0, p0, Lzd0;->r:Ljava/util/List;

    .line 500
    .line 501
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object p0

    .line 505
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 506
    .line 507
    iget-object p2, p1, Lyz2;->u:Lz12;

    .line 508
    .line 509
    iget-object v0, p2, Lz12;->e:Landroid/widget/TextView;

    .line 510
    .line 511
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 516
    .line 517
    .line 518
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->isDir()Z

    .line 519
    .line 520
    .line 521
    move-result v0

    .line 522
    const/4 v2, 0x5

    .line 523
    if-eqz v0, :cond_b

    .line 524
    .line 525
    move v1, v2

    .line 526
    :cond_b
    iget-object p1, p1, Lcx3;->a:Landroid/view/View;

    .line 527
    .line 528
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 529
    .line 530
    .line 531
    move-result-object p1

    .line 532
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 537
    .line 538
    .line 539
    move-result-object v5

    .line 540
    if-eqz v0, :cond_c

    .line 541
    .line 542
    invoke-static {}, Lud3;->t()I

    .line 543
    .line 544
    .line 545
    move-result v6

    .line 546
    invoke-static {v6, v0}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v6

    .line 550
    goto :goto_2

    .line 551
    :cond_c
    move-object v6, v4

    .line 552
    :goto_2
    invoke-static {p1, v0, v1, v5, v6}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 553
    .line 554
    .line 555
    move-result-object p1

    .line 556
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    invoke-virtual {p1, v0}, Lvz3;->T(Lxv0;)Lvz3;

    .line 561
    .line 562
    .line 563
    move-result-object p1

    .line 564
    invoke-static {}, Lud3;->R()Z

    .line 565
    .line 566
    .line 567
    move-result v0

    .line 568
    if-eqz v0, :cond_d

    .line 569
    .line 570
    invoke-virtual {p1}, Llq;->l()Llq;

    .line 571
    .line 572
    .line 573
    move-result-object p1

    .line 574
    check-cast p1, Lvz3;

    .line 575
    .line 576
    :cond_d
    iget-object v0, p2, Lz12;->b:Landroid/widget/ImageView;

    .line 577
    .line 578
    iget-object v1, p2, Lz12;->c:Landroid/widget/ImageView;

    .line 579
    .line 580
    invoke-virtual {p1, v0}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->isDir()Z

    .line 584
    .line 585
    .line 586
    move-result p1

    .line 587
    const/4 v0, 0x4

    .line 588
    if-eqz p1, :cond_e

    .line 589
    .line 590
    move p1, v3

    .line 591
    goto :goto_3

    .line 592
    :cond_e
    move p1, v0

    .line 593
    :goto_3
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 594
    .line 595
    .line 596
    iget-object p1, p2, Lz12;->d:Landroid/widget/ImageView;

    .line 597
    .line 598
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->isDir()Z

    .line 599
    .line 600
    .line 601
    move-result p2

    .line 602
    if-eqz p2, :cond_f

    .line 603
    .line 604
    move p2, v3

    .line 605
    goto :goto_4

    .line 606
    :cond_f
    move p2, v0

    .line 607
    :goto_4
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 608
    .line 609
    .line 610
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->isDir()Z

    .line 611
    .line 612
    .line 613
    move-result p1

    .line 614
    sget-object p2, Lko1;->p:Lko1;

    .line 615
    .line 616
    sget-object v5, Lko1;->n:Lko1;

    .line 617
    .line 618
    if-eqz p1, :cond_11

    .line 619
    .line 620
    :cond_10
    :goto_5
    move-object p0, v5

    .line 621
    goto :goto_7

    .line 622
    :cond_11
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 623
    .line 624
    .line 625
    move-result-object p1

    .line 626
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    invoke-static {}, Lud3;->o()Ljava/lang/String;

    .line 630
    .line 631
    .line 632
    move-result-object v6

    .line 633
    if-eqz v6, :cond_12

    .line 634
    .line 635
    invoke-static {p0}, Lg51;->e(Lcom/eddyizm/tempus/subsonic/models/Child;)Landroid/net/Uri;

    .line 636
    .line 637
    .line 638
    move-result-object p0

    .line 639
    if-eqz p0, :cond_10

    .line 640
    .line 641
    :goto_6
    move-object p0, p2

    .line 642
    goto :goto_7

    .line 643
    :cond_12
    invoke-static {p1}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 644
    .line 645
    .line 646
    move-result-object p1

    .line 647
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object p0

    .line 651
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 652
    .line 653
    .line 654
    invoke-static {p0}, Leu0;->c(Ljava/lang/String;)Ljava/lang/Integer;

    .line 655
    .line 656
    .line 657
    move-result-object p0

    .line 658
    if-eqz p0, :cond_10

    .line 659
    .line 660
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 661
    .line 662
    .line 663
    move-result p1

    .line 664
    if-eq p1, v0, :cond_10

    .line 665
    .line 666
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 667
    .line 668
    .line 669
    move-result p1

    .line 670
    if-ne p1, v2, :cond_13

    .line 671
    .line 672
    goto :goto_5

    .line 673
    :cond_13
    const/4 p1, 0x3

    .line 674
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 675
    .line 676
    .line 677
    move-result p0

    .line 678
    if-ne p0, p1, :cond_14

    .line 679
    .line 680
    goto :goto_6

    .line 681
    :cond_14
    sget-object p0, Lko1;->o:Lko1;

    .line 682
    .line 683
    :goto_7
    if-ne p0, v5, :cond_15

    .line 684
    .line 685
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {v1, v3, v3, v3, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 692
    .line 693
    .line 694
    move-result-object p0

    .line 695
    const p1, 0x7f0801fd

    .line 696
    .line 697
    .line 698
    invoke-virtual {p0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 699
    .line 700
    .line 701
    move-result-object p0

    .line 702
    invoke-virtual {v1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 703
    .line 704
    .line 705
    invoke-virtual {v1, v4}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 706
    .line 707
    .line 708
    goto :goto_a

    .line 709
    :cond_15
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 710
    .line 711
    .line 712
    move-result-object p1

    .line 713
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 714
    .line 715
    .line 716
    move-result-object p1

    .line 717
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 718
    .line 719
    const/high16 v0, 0x40000000    # 2.0f

    .line 720
    .line 721
    mul-float/2addr v0, p1

    .line 722
    float-to-int p1, v0

    .line 723
    invoke-virtual {v1, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 724
    .line 725
    .line 726
    invoke-virtual {v1, p1, p1, p1, p1}, Landroid/view/View;->setPadding(IIII)V

    .line 727
    .line 728
    .line 729
    if-ne p0, p2, :cond_16

    .line 730
    .line 731
    const p1, 0x7f080159

    .line 732
    .line 733
    .line 734
    goto :goto_8

    .line 735
    :cond_16
    const p1, 0x7f08015b

    .line 736
    .line 737
    .line 738
    :goto_8
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 739
    .line 740
    .line 741
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 742
    .line 743
    .line 744
    move-result-object p1

    .line 745
    if-ne p0, p2, :cond_17

    .line 746
    .line 747
    const p0, 0x7f1301a6

    .line 748
    .line 749
    .line 750
    goto :goto_9

    .line 751
    :cond_17
    const p0, 0x7f1301a7

    .line 752
    .line 753
    .line 754
    :goto_9
    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    move-result-object p0

    .line 758
    invoke-virtual {v1, p0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 762
    .line 763
    .line 764
    :goto_a
    return-void

    .line 765
    :pswitch_5
    check-cast p1, Lz02;

    .line 766
    .line 767
    iget-object p0, p0, Lzd0;->r:Ljava/util/List;

    .line 768
    .line 769
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    move-result-object p0

    .line 773
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;

    .line 774
    .line 775
    iget-object p2, p1, Lz02;->u:Llv4;

    .line 776
    .line 777
    iget-object p1, p1, Lcx3;->a:Landroid/view/View;

    .line 778
    .line 779
    iget-object v0, p2, Llv4;->t:Ljava/lang/Object;

    .line 780
    .line 781
    check-cast v0, Landroid/widget/TextView;

    .line 782
    .line 783
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getName()Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v1

    .line 787
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 788
    .line 789
    .line 790
    iget-object v0, p2, Llv4;->s:Ljava/lang/Object;

    .line 791
    .line 792
    check-cast v0, Landroid/widget/TextView;

    .line 793
    .line 794
    iget-object v1, p2, Llv4;->p:Ljava/lang/Object;

    .line 795
    .line 796
    check-cast v1, Landroid/widget/TextView;

    .line 797
    .line 798
    iget-object p2, p2, Llv4;->q:Ljava/lang/Object;

    .line 799
    .line 800
    check-cast p2, Landroid/widget/ImageView;

    .line 801
    .line 802
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getStreamUrl()Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v5

    .line 806
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 807
    .line 808
    .line 809
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getId()Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v0

    .line 813
    if-eqz v0, :cond_18

    .line 814
    .line 815
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getId()Ljava/lang/String;

    .line 816
    .line 817
    .line 818
    move-result-object v0

    .line 819
    const-string v5, "local_"

    .line 820
    .line 821
    invoke-virtual {v0, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 822
    .line 823
    .line 824
    move-result v0

    .line 825
    if-eqz v0, :cond_18

    .line 826
    .line 827
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 828
    .line 829
    .line 830
    goto :goto_b

    .line 831
    :cond_18
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 832
    .line 833
    .line 834
    :goto_b
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getId()Ljava/lang/String;

    .line 835
    .line 836
    .line 837
    move-result-object v0

    .line 838
    if-eqz v0, :cond_19

    .line 839
    .line 840
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getId()Ljava/lang/String;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    invoke-static {v0}, Lxt3;->e(Ljava/lang/String;)Ljava/io/File;

    .line 845
    .line 846
    .line 847
    move-result-object v0

    .line 848
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 849
    .line 850
    .line 851
    move-result v1

    .line 852
    if-eqz v1, :cond_19

    .line 853
    .line 854
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 855
    .line 856
    .line 857
    move-result-object v1

    .line 858
    invoke-static {v1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 859
    .line 860
    .line 861
    move-result-object v1

    .line 862
    invoke-virtual {v1, v0}, Lc04;->s(Ljava/io/File;)Lvz3;

    .line 863
    .line 864
    .line 865
    move-result-object v1

    .line 866
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 867
    .line 868
    .line 869
    move-result-object p1

    .line 870
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getId()Ljava/lang/String;

    .line 871
    .line 872
    .line 873
    move-result-object p0

    .line 874
    invoke-static {v2, p1, p0}, Lwg0;->a(ILandroid/content/Context;Ljava/lang/String;)Lg04;

    .line 875
    .line 876
    .line 877
    move-result-object p0

    .line 878
    invoke-virtual {v1, p0}, Lvz3;->G(Llq;)Lvz3;

    .line 879
    .line 880
    .line 881
    move-result-object p0

    .line 882
    new-instance p1, Ls73;

    .line 883
    .line 884
    invoke-virtual {v0}, Ljava/io/File;->lastModified()J

    .line 885
    .line 886
    .line 887
    move-result-wide v0

    .line 888
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    invoke-direct {p1, v0}, Ls73;-><init>(Ljava/lang/Object;)V

    .line 893
    .line 894
    .line 895
    invoke-virtual {p0, p1}, Llq;->w(Lf42;)Llq;

    .line 896
    .line 897
    .line 898
    move-result-object p0

    .line 899
    check-cast p0, Lvz3;

    .line 900
    .line 901
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 902
    .line 903
    .line 904
    move-result-object p1

    .line 905
    invoke-virtual {p0, p1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 906
    .line 907
    .line 908
    move-result-object p0

    .line 909
    invoke-virtual {p0, p2}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 910
    .line 911
    .line 912
    goto/16 :goto_c

    .line 913
    .line 914
    :cond_19
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getCoverArt()Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v0

    .line 918
    if-eqz v0, :cond_1c

    .line 919
    .line 920
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getCoverArt()Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v0

    .line 924
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 925
    .line 926
    .line 927
    move-result v0

    .line 928
    if-nez v0, :cond_1c

    .line 929
    .line 930
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 931
    .line 932
    .line 933
    move-result-object p1

    .line 934
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getCoverArt()Ljava/lang/String;

    .line 935
    .line 936
    .line 937
    move-result-object p0

    .line 938
    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 939
    .line 940
    .line 941
    move-result-object v0

    .line 942
    if-eqz p0, :cond_1a

    .line 943
    .line 944
    invoke-static {}, Lud3;->t()I

    .line 945
    .line 946
    .line 947
    move-result v1

    .line 948
    invoke-static {v1, p0}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 949
    .line 950
    .line 951
    move-result-object v4

    .line 952
    :cond_1a
    invoke-static {p1, p0, v2, v0, v4}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 953
    .line 954
    .line 955
    move-result-object p0

    .line 956
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 957
    .line 958
    .line 959
    move-result-object p1

    .line 960
    invoke-virtual {p0, p1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 961
    .line 962
    .line 963
    move-result-object p0

    .line 964
    invoke-static {}, Lud3;->R()Z

    .line 965
    .line 966
    .line 967
    move-result p1

    .line 968
    if-eqz p1, :cond_1b

    .line 969
    .line 970
    invoke-virtual {p0}, Llq;->l()Llq;

    .line 971
    .line 972
    .line 973
    move-result-object p0

    .line 974
    check-cast p0, Lvz3;

    .line 975
    .line 976
    :cond_1b
    invoke-virtual {p0, p2}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 977
    .line 978
    .line 979
    goto :goto_c

    .line 980
    :cond_1c
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getHomePageUrl()Ljava/lang/String;

    .line 981
    .line 982
    .line 983
    move-result-object p0

    .line 984
    if-eqz p0, :cond_1d

    .line 985
    .line 986
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 987
    .line 988
    .line 989
    move-result v0

    .line 990
    if-nez v0, :cond_1d

    .line 991
    .line 992
    invoke-static {p0}, Le03;->n(Ljava/lang/String;)Z

    .line 993
    .line 994
    .line 995
    move-result v0

    .line 996
    if-eqz v0, :cond_1d

    .line 997
    .line 998
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 999
    .line 1000
    .line 1001
    move-result-object v0

    .line 1002
    invoke-static {v0}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v0

    .line 1006
    invoke-virtual {v0, p0}, Lc04;->t(Ljava/lang/String;)Lvz3;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v0

    .line 1010
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1011
    .line 1012
    .line 1013
    move-result-object p1

    .line 1014
    invoke-static {v2, p1, p0}, Lwg0;->a(ILandroid/content/Context;Ljava/lang/String;)Lg04;

    .line 1015
    .line 1016
    .line 1017
    move-result-object p0

    .line 1018
    invoke-virtual {v0, p0}, Lvz3;->G(Llq;)Lvz3;

    .line 1019
    .line 1020
    .line 1021
    move-result-object p0

    .line 1022
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 1023
    .line 1024
    .line 1025
    move-result-object p1

    .line 1026
    invoke-virtual {p0, p1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 1027
    .line 1028
    .line 1029
    move-result-object p0

    .line 1030
    invoke-virtual {p0, p2}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 1031
    .line 1032
    .line 1033
    goto :goto_c

    .line 1034
    :cond_1d
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1035
    .line 1036
    .line 1037
    move-result-object p0

    .line 1038
    invoke-static {p0}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 1039
    .line 1040
    .line 1041
    move-result-object p0

    .line 1042
    invoke-virtual {p0, v4}, Lc04;->t(Ljava/lang/String;)Lvz3;

    .line 1043
    .line 1044
    .line 1045
    move-result-object p0

    .line 1046
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1047
    .line 1048
    .line 1049
    move-result-object p1

    .line 1050
    invoke-static {v2, p1, v4}, Lwg0;->a(ILandroid/content/Context;Ljava/lang/String;)Lg04;

    .line 1051
    .line 1052
    .line 1053
    move-result-object p1

    .line 1054
    invoke-virtual {p0, p1}, Lvz3;->G(Llq;)Lvz3;

    .line 1055
    .line 1056
    .line 1057
    move-result-object p0

    .line 1058
    invoke-virtual {p0, p2}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 1059
    .line 1060
    .line 1061
    :goto_c
    return-void

    .line 1062
    :pswitch_6
    check-cast p1, Ldh1;

    .line 1063
    .line 1064
    iget-object p0, p0, Lzd0;->r:Ljava/util/List;

    .line 1065
    .line 1066
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1067
    .line 1068
    .line 1069
    move-result-object p0

    .line 1070
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Genre;

    .line 1071
    .line 1072
    iget-object p1, p1, Ldh1;->u:Lrm3;

    .line 1073
    .line 1074
    iget-object p1, p1, Lrm3;->o:Ljava/lang/Object;

    .line 1075
    .line 1076
    check-cast p1, Landroid/widget/TextView;

    .line 1077
    .line 1078
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Genre;->getGenre()Ljava/lang/String;

    .line 1079
    .line 1080
    .line 1081
    move-result-object p0

    .line 1082
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1083
    .line 1084
    .line 1085
    return-void

    .line 1086
    :pswitch_7
    check-cast p1, Lyd0;

    .line 1087
    .line 1088
    iget-object p0, p0, Lzd0;->r:Ljava/util/List;

    .line 1089
    .line 1090
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1091
    .line 1092
    .line 1093
    move-result-object p0

    .line 1094
    check-cast p0, Lsp3;

    .line 1095
    .line 1096
    iget-object p2, p1, Lyd0;->u:Lz40;

    .line 1097
    .line 1098
    iget-object v0, p2, Lz40;->r:Ljava/lang/Object;

    .line 1099
    .line 1100
    check-cast v0, Landroid/widget/TextView;

    .line 1101
    .line 1102
    iget-object v1, p2, Lz40;->p:Ljava/lang/Object;

    .line 1103
    .line 1104
    check-cast v1, Landroid/widget/ImageView;

    .line 1105
    .line 1106
    iget-object v2, p0, Lsp3;->c:Ljava/lang/String;

    .line 1107
    .line 1108
    iget-object v3, p0, Lsp3;->g:Ljava/lang/String;

    .line 1109
    .line 1110
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1111
    .line 1112
    .line 1113
    iget-object v0, p2, Lz40;->o:Ljava/lang/Object;

    .line 1114
    .line 1115
    check-cast v0, Landroid/widget/TextView;

    .line 1116
    .line 1117
    iget-object v2, p0, Lsp3;->d:Ljava/lang/String;

    .line 1118
    .line 1119
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1120
    .line 1121
    .line 1122
    iget-object p2, p2, Lz40;->q:Ljava/lang/Object;

    .line 1123
    .line 1124
    check-cast p2, Landroid/widget/TextView;

    .line 1125
    .line 1126
    iget-object p1, p1, Lcx3;->a:Landroid/view/View;

    .line 1127
    .line 1128
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v0

    .line 1132
    iget-wide v4, p0, Lsp3;->b:J

    .line 1133
    .line 1134
    const-wide/16 v6, 0x3e8

    .line 1135
    .line 1136
    div-long/2addr v4, v6

    .line 1137
    const-wide/16 v6, 0xe10

    .line 1138
    .line 1139
    div-long v8, v4, v6

    .line 1140
    .line 1141
    rem-long v6, v4, v6

    .line 1142
    .line 1143
    const-wide/16 v10, 0x3c

    .line 1144
    .line 1145
    div-long/2addr v6, v10

    .line 1146
    rem-long/2addr v4, v10

    .line 1147
    const-wide/16 v10, 0x0

    .line 1148
    .line 1149
    cmp-long p0, v8, v10

    .line 1150
    .line 1151
    if-lez p0, :cond_1e

    .line 1152
    .line 1153
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1154
    .line 1155
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1156
    .line 1157
    .line 1158
    move-result-object v2

    .line 1159
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v6

    .line 1163
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v4

    .line 1167
    filled-new-array {v2, v6, v4}, [Ljava/lang/Object;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v2

    .line 1171
    const-string v4, "%d:%02d:%02d"

    .line 1172
    .line 1173
    invoke-static {p0, v4, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1174
    .line 1175
    .line 1176
    move-result-object p0

    .line 1177
    goto :goto_d

    .line 1178
    :cond_1e
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1179
    .line 1180
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v2

    .line 1184
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v4

    .line 1188
    filled-new-array {v2, v4}, [Ljava/lang/Object;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v2

    .line 1192
    const-string v4, "%d:%02d"

    .line 1193
    .line 1194
    invoke-static {p0, v4, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1195
    .line 1196
    .line 1197
    move-result-object p0

    .line 1198
    :goto_d
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 1199
    .line 1200
    .line 1201
    move-result-object p0

    .line 1202
    const v2, 0x7f13016b

    .line 1203
    .line 1204
    .line 1205
    invoke-virtual {v0, v2, p0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1206
    .line 1207
    .line 1208
    move-result-object p0

    .line 1209
    invoke-virtual {p2, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1210
    .line 1211
    .line 1212
    if-eqz v3, :cond_20

    .line 1213
    .line 1214
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1215
    .line 1216
    .line 1217
    move-result-object p0

    .line 1218
    invoke-static {p0}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 1219
    .line 1220
    .line 1221
    move-result-object p1

    .line 1222
    invoke-static {}, Lud3;->t()I

    .line 1223
    .line 1224
    .line 1225
    move-result p2

    .line 1226
    invoke-static {p2, v3}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 1227
    .line 1228
    .line 1229
    move-result-object p2

    .line 1230
    const/4 v0, 0x2

    .line 1231
    invoke-static {p0, v3, v0, p1, p2}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 1232
    .line 1233
    .line 1234
    move-result-object p0

    .line 1235
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 1236
    .line 1237
    .line 1238
    move-result-object p1

    .line 1239
    invoke-virtual {p0, p1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 1240
    .line 1241
    .line 1242
    move-result-object p0

    .line 1243
    invoke-static {}, Lud3;->R()Z

    .line 1244
    .line 1245
    .line 1246
    move-result p1

    .line 1247
    if-eqz p1, :cond_1f

    .line 1248
    .line 1249
    invoke-virtual {p0}, Llq;->l()Llq;

    .line 1250
    .line 1251
    .line 1252
    move-result-object p0

    .line 1253
    check-cast p0, Lvz3;

    .line 1254
    .line 1255
    :cond_1f
    invoke-virtual {p0, v1}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 1256
    .line 1257
    .line 1258
    goto :goto_e

    .line 1259
    :cond_20
    const p0, 0x7f080202

    .line 1260
    .line 1261
    .line 1262
    invoke-virtual {v1, p0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 1263
    .line 1264
    .line 1265
    :goto_e
    return-void

    .line 1266
    nop

    .line 1267
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final i(Landroid/view/ViewGroup;I)Lcx3;
    .locals 11

    .line 1
    iget p2, p0, Lzd0;->q:I

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
    const p2, 0x7f0d00b3

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p2, p1, v2}, Lb11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const p2, 0x7f0a0558

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    move-object v5, v2

    .line 25
    check-cast v5, Landroid/widget/TextView;

    .line 26
    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    const p2, 0x7f0a0563

    .line 30
    .line 31
    .line 32
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    move-object v6, v2

    .line 37
    check-cast v6, Landroid/widget/TextView;

    .line 38
    .line 39
    if-eqz v6, :cond_0

    .line 40
    .line 41
    new-instance v3, Li61;

    .line 42
    .line 43
    move-object v4, p1

    .line 44
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 45
    .line 46
    const/4 v8, 0x7

    .line 47
    const/4 v7, 0x0

    .line 48
    invoke-direct/range {v3 .. v8}, Li61;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 49
    .line 50
    .line 51
    new-instance v0, Lla4;

    .line 52
    .line 53
    invoke-direct {v0, p0, v3}, Lla4;-><init>(Lzd0;Li61;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :goto_0
    return-object v0

    .line 73
    :pswitch_0
    const p0, 0x7f0d00b6

    .line 74
    .line 75
    .line 76
    invoke-static {p1, p0, p1, v2}, Lb11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    const p1, 0x7f0a0090

    .line 81
    .line 82
    .line 83
    invoke-static {p0, p1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    move-object v4, p2

    .line 88
    check-cast v4, Lcom/google/android/material/button/MaterialButton;

    .line 89
    .line 90
    if-eqz v4, :cond_1

    .line 91
    .line 92
    const p1, 0x7f0a05c9

    .line 93
    .line 94
    .line 95
    invoke-static {p0, p1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    move-object v5, p2

    .line 100
    check-cast v5, Landroid/widget/ImageView;

    .line 101
    .line 102
    if-eqz v5, :cond_1

    .line 103
    .line 104
    const p1, 0x7f0a05ca

    .line 105
    .line 106
    .line 107
    invoke-static {p0, p1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    move-object v6, p2

    .line 112
    check-cast v6, Landroid/widget/TextView;

    .line 113
    .line 114
    if-eqz v6, :cond_1

    .line 115
    .line 116
    const p1, 0x7f0a05cd

    .line 117
    .line 118
    .line 119
    invoke-static {p0, p1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    move-object v7, p2

    .line 124
    check-cast v7, Landroid/widget/TextView;

    .line 125
    .line 126
    if-eqz v7, :cond_1

    .line 127
    .line 128
    new-instance v2, Lna4;

    .line 129
    .line 130
    move-object v3, p0

    .line 131
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 132
    .line 133
    invoke-direct/range {v2 .. v7}, Lna4;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    .line 134
    .line 135
    .line 136
    new-instance v0, Ldu3;

    .line 137
    .line 138
    invoke-direct {v0, v3}, Lcx3;-><init>(Landroid/view/View;)V

    .line 139
    .line 140
    .line 141
    iput-object v2, v0, Ldu3;->u:Lna4;

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    :goto_1
    return-object v0

    .line 160
    :pswitch_1
    const p2, 0x7f0d00a5

    .line 161
    .line 162
    .line 163
    invoke-static {p1, p2, p1, v2}, Lb11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    const p2, 0x7f0a04ce

    .line 168
    .line 169
    .line 170
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    move-object v5, v2

    .line 175
    check-cast v5, Landroid/widget/ImageView;

    .line 176
    .line 177
    if-eqz v5, :cond_2

    .line 178
    .line 179
    const p2, 0x7f0a04d0

    .line 180
    .line 181
    .line 182
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    move-object v6, v2

    .line 187
    check-cast v6, Landroid/widget/TextView;

    .line 188
    .line 189
    if-eqz v6, :cond_2

    .line 190
    .line 191
    const p2, 0x7f0a04d2

    .line 192
    .line 193
    .line 194
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    move-object v7, v2

    .line 199
    check-cast v7, Landroid/widget/ImageView;

    .line 200
    .line 201
    if-eqz v7, :cond_2

    .line 202
    .line 203
    const p2, 0x7f0a04d6

    .line 204
    .line 205
    .line 206
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    move-object v8, v2

    .line 211
    check-cast v8, Landroid/widget/TextView;

    .line 212
    .line 213
    if-eqz v8, :cond_2

    .line 214
    .line 215
    new-instance v3, Lz40;

    .line 216
    .line 217
    move-object v4, p1

    .line 218
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 219
    .line 220
    invoke-direct/range {v3 .. v8}, Lz40;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V

    .line 221
    .line 222
    .line 223
    new-instance v0, Lzm3;

    .line 224
    .line 225
    invoke-direct {v0, p0, v3}, Lzm3;-><init>(Lzd0;Lz40;)V

    .line 226
    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    :goto_2
    return-object v0

    .line 245
    :pswitch_2
    const p2, 0x7f0d00a4

    .line 246
    .line 247
    .line 248
    invoke-static {p1, p2, p1, v2}, Lb11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    const p2, 0x7f0a04ad

    .line 253
    .line 254
    .line 255
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 256
    .line 257
    .line 258
    move-result-object v2

    .line 259
    move-object v5, v2

    .line 260
    check-cast v5, Landroid/widget/TextView;

    .line 261
    .line 262
    if-eqz v5, :cond_3

    .line 263
    .line 264
    const p2, 0x7f0a04b2

    .line 265
    .line 266
    .line 267
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    move-object v6, v2

    .line 272
    check-cast v6, Landroid/widget/ImageView;

    .line 273
    .line 274
    if-eqz v6, :cond_3

    .line 275
    .line 276
    const p2, 0x7f0a04b3

    .line 277
    .line 278
    .line 279
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    move-object v7, v2

    .line 284
    check-cast v7, Landroid/widget/TextView;

    .line 285
    .line 286
    if-eqz v7, :cond_3

    .line 287
    .line 288
    const p2, 0x7f0a04b4

    .line 289
    .line 290
    .line 291
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    move-object v8, v2

    .line 296
    check-cast v8, Landroid/widget/ImageView;

    .line 297
    .line 298
    if-eqz v8, :cond_3

    .line 299
    .line 300
    const p2, 0x7f0a04b5

    .line 301
    .line 302
    .line 303
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    move-object v9, v2

    .line 308
    check-cast v9, Landroid/widget/ImageView;

    .line 309
    .line 310
    if-eqz v9, :cond_3

    .line 311
    .line 312
    const p2, 0x7f0a04b6

    .line 313
    .line 314
    .line 315
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    move-object v10, v2

    .line 320
    check-cast v10, Landroid/widget/TextView;

    .line 321
    .line 322
    if-eqz v10, :cond_3

    .line 323
    .line 324
    const p2, 0x7f0a04fd

    .line 325
    .line 326
    .line 327
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 328
    .line 329
    .line 330
    move-result-object v2

    .line 331
    check-cast v2, Landroid/widget/TextView;

    .line 332
    .line 333
    if-eqz v2, :cond_3

    .line 334
    .line 335
    new-instance v3, Llv4;

    .line 336
    .line 337
    move-object v4, p1

    .line 338
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 339
    .line 340
    invoke-direct/range {v3 .. v10}, Llv4;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    .line 341
    .line 342
    .line 343
    new-instance v0, Lol3;

    .line 344
    .line 345
    invoke-direct {v0, p0, v3}, Lol3;-><init>(Lzd0;Llv4;)V

    .line 346
    .line 347
    .line 348
    goto :goto_3

    .line 349
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 350
    .line 351
    .line 352
    move-result-object p0

    .line 353
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object p0

    .line 357
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object p0

    .line 361
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    :goto_3
    return-object v0

    .line 365
    :pswitch_3
    const p2, 0x7f0d00a3

    .line 366
    .line 367
    .line 368
    invoke-static {p1, p2, p1, v2}, Lb11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 369
    .line 370
    .line 371
    move-result-object p1

    .line 372
    const p2, 0x7f0a04b0

    .line 373
    .line 374
    .line 375
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    check-cast v2, Landroid/widget/TextView;

    .line 380
    .line 381
    if-eqz v2, :cond_4

    .line 382
    .line 383
    const p2, 0x7f0a04b7

    .line 384
    .line 385
    .line 386
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    check-cast v3, Landroid/widget/TextView;

    .line 391
    .line 392
    if-eqz v3, :cond_4

    .line 393
    .line 394
    new-instance p2, Lz05;

    .line 395
    .line 396
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 397
    .line 398
    const/4 v0, 0x6

    .line 399
    invoke-direct {p2, p1, v2, v3, v0}, Lz05;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 400
    .line 401
    .line 402
    new-instance v0, Lnl3;

    .line 403
    .line 404
    invoke-direct {v0, p0, p2}, Lnl3;-><init>(Lzd0;Lz05;)V

    .line 405
    .line 406
    .line 407
    goto :goto_4

    .line 408
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 409
    .line 410
    .line 411
    move-result-object p0

    .line 412
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object p0

    .line 416
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object p0

    .line 420
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 421
    .line 422
    .line 423
    :goto_4
    return-object v0

    .line 424
    :pswitch_4
    const p2, 0x7f0d00af

    .line 425
    .line 426
    .line 427
    invoke-static {p1, p2, p1, v2}, Lb11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 428
    .line 429
    .line 430
    move-result-object p1

    .line 431
    const p2, 0x7f0a03ff

    .line 432
    .line 433
    .line 434
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 435
    .line 436
    .line 437
    move-result-object v2

    .line 438
    move-object v5, v2

    .line 439
    check-cast v5, Landroid/widget/ImageView;

    .line 440
    .line 441
    if-eqz v5, :cond_5

    .line 442
    .line 443
    const p2, 0x7f0a0400

    .line 444
    .line 445
    .line 446
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    move-object v6, v2

    .line 451
    check-cast v6, Landroid/widget/ImageView;

    .line 452
    .line 453
    if-eqz v6, :cond_5

    .line 454
    .line 455
    const p2, 0x7f0a0401

    .line 456
    .line 457
    .line 458
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    move-object v7, v2

    .line 463
    check-cast v7, Landroid/widget/ImageView;

    .line 464
    .line 465
    if-eqz v7, :cond_5

    .line 466
    .line 467
    const p2, 0x7f0a0402

    .line 468
    .line 469
    .line 470
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 471
    .line 472
    .line 473
    move-result-object v2

    .line 474
    move-object v8, v2

    .line 475
    check-cast v8, Landroid/widget/TextView;

    .line 476
    .line 477
    if-eqz v8, :cond_5

    .line 478
    .line 479
    new-instance v3, Lz12;

    .line 480
    .line 481
    move-object v4, p1

    .line 482
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 483
    .line 484
    invoke-direct/range {v3 .. v8}, Lz12;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    .line 485
    .line 486
    .line 487
    new-instance v0, Lyz2;

    .line 488
    .line 489
    invoke-direct {v0, p0, v3}, Lyz2;-><init>(Lzd0;Lz12;)V

    .line 490
    .line 491
    .line 492
    goto :goto_5

    .line 493
    :cond_5
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 494
    .line 495
    .line 496
    move-result-object p0

    .line 497
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object p0

    .line 501
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object p0

    .line 505
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    :goto_5
    return-object v0

    .line 509
    :pswitch_5
    const p2, 0x7f0d009a

    .line 510
    .line 511
    .line 512
    invoke-static {p1, p2, p1, v2}, Lb11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 513
    .line 514
    .line 515
    move-result-object p1

    .line 516
    const p2, 0x7f0a017b

    .line 517
    .line 518
    .line 519
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 520
    .line 521
    .line 522
    move-result-object v4

    .line 523
    if-eqz v4, :cond_6

    .line 524
    .line 525
    const p2, 0x7f0a0314

    .line 526
    .line 527
    .line 528
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 529
    .line 530
    .line 531
    move-result-object v2

    .line 532
    move-object v5, v2

    .line 533
    check-cast v5, Landroid/widget/ImageView;

    .line 534
    .line 535
    if-eqz v5, :cond_6

    .line 536
    .line 537
    const p2, 0x7f0a0317

    .line 538
    .line 539
    .line 540
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    move-object v6, v2

    .line 545
    check-cast v6, Landroid/widget/TextView;

    .line 546
    .line 547
    if-eqz v6, :cond_6

    .line 548
    .line 549
    const p2, 0x7f0a0318

    .line 550
    .line 551
    .line 552
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 553
    .line 554
    .line 555
    move-result-object v2

    .line 556
    move-object v7, v2

    .line 557
    check-cast v7, Landroid/widget/ImageView;

    .line 558
    .line 559
    if-eqz v7, :cond_6

    .line 560
    .line 561
    const p2, 0x7f0a031f

    .line 562
    .line 563
    .line 564
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 565
    .line 566
    .line 567
    move-result-object v2

    .line 568
    move-object v8, v2

    .line 569
    check-cast v8, Landroid/widget/TextView;

    .line 570
    .line 571
    if-eqz v8, :cond_6

    .line 572
    .line 573
    const p2, 0x7f0a0320

    .line 574
    .line 575
    .line 576
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    move-object v9, v2

    .line 581
    check-cast v9, Landroid/widget/TextView;

    .line 582
    .line 583
    if-eqz v9, :cond_6

    .line 584
    .line 585
    new-instance v2, Llv4;

    .line 586
    .line 587
    move-object v3, p1

    .line 588
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 589
    .line 590
    invoke-direct/range {v2 .. v9}, Llv4;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V

    .line 591
    .line 592
    .line 593
    new-instance v0, Lz02;

    .line 594
    .line 595
    invoke-direct {v0, p0, v2}, Lz02;-><init>(Lzd0;Llv4;)V

    .line 596
    .line 597
    .line 598
    goto :goto_6

    .line 599
    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 600
    .line 601
    .line 602
    move-result-object p0

    .line 603
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object p0

    .line 607
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 608
    .line 609
    .line 610
    move-result-object p0

    .line 611
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 612
    .line 613
    .line 614
    :goto_6
    return-object v0

    .line 615
    :pswitch_6
    const p2, 0x7f0d00ae

    .line 616
    .line 617
    .line 618
    invoke-static {p1, p2, p1, v2}, Lb11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 619
    .line 620
    .line 621
    move-result-object p1

    .line 622
    const p2, 0x7f0a0146

    .line 623
    .line 624
    .line 625
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 626
    .line 627
    .line 628
    move-result-object v3

    .line 629
    check-cast v3, Landroidx/cardview/widget/CardView;

    .line 630
    .line 631
    if-eqz v3, :cond_7

    .line 632
    .line 633
    const p2, 0x7f0a026e

    .line 634
    .line 635
    .line 636
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 637
    .line 638
    .line 639
    move-result-object v3

    .line 640
    check-cast v3, Landroid/widget/TextView;

    .line 641
    .line 642
    if-eqz v3, :cond_7

    .line 643
    .line 644
    new-instance p2, Lrm3;

    .line 645
    .line 646
    check-cast p1, Landroid/widget/LinearLayout;

    .line 647
    .line 648
    invoke-direct {p2, p1, v3, v2}, Lrm3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 649
    .line 650
    .line 651
    new-instance v0, Ldh1;

    .line 652
    .line 653
    invoke-direct {v0, p0, p2}, Ldh1;-><init>(Lzd0;Lrm3;)V

    .line 654
    .line 655
    .line 656
    goto :goto_7

    .line 657
    :cond_7
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 658
    .line 659
    .line 660
    move-result-object p0

    .line 661
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object p0

    .line 665
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 666
    .line 667
    .line 668
    move-result-object p0

    .line 669
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 670
    .line 671
    .line 672
    :goto_7
    return-object v0

    .line 673
    :pswitch_7
    const p2, 0x7f0d0097

    .line 674
    .line 675
    .line 676
    invoke-static {p1, p2, p1, v2}, Lb11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 677
    .line 678
    .line 679
    move-result-object p1

    .line 680
    const p2, 0x7f0a016e

    .line 681
    .line 682
    .line 683
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 684
    .line 685
    .line 686
    move-result-object v2

    .line 687
    move-object v5, v2

    .line 688
    check-cast v5, Landroid/widget/TextView;

    .line 689
    .line 690
    if-eqz v5, :cond_8

    .line 691
    .line 692
    const p2, 0x7f0a016f

    .line 693
    .line 694
    .line 695
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 696
    .line 697
    .line 698
    move-result-object v2

    .line 699
    move-object v6, v2

    .line 700
    check-cast v6, Landroid/widget/ImageView;

    .line 701
    .line 702
    if-eqz v6, :cond_8

    .line 703
    .line 704
    const p2, 0x7f0a0171

    .line 705
    .line 706
    .line 707
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 708
    .line 709
    .line 710
    move-result-object v2

    .line 711
    move-object v7, v2

    .line 712
    check-cast v7, Landroid/widget/TextView;

    .line 713
    .line 714
    if-eqz v7, :cond_8

    .line 715
    .line 716
    const p2, 0x7f0a0172

    .line 717
    .line 718
    .line 719
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 720
    .line 721
    .line 722
    move-result-object v2

    .line 723
    move-object v8, v2

    .line 724
    check-cast v8, Landroid/widget/TextView;

    .line 725
    .line 726
    if-eqz v8, :cond_8

    .line 727
    .line 728
    new-instance v3, Lz40;

    .line 729
    .line 730
    move-object v4, p1

    .line 731
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 732
    .line 733
    invoke-direct/range {v3 .. v8}, Lz40;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/widget/TextView;)V

    .line 734
    .line 735
    .line 736
    new-instance v0, Lyd0;

    .line 737
    .line 738
    invoke-direct {v0, p0, v3}, Lyd0;-><init>(Lzd0;Lz40;)V

    .line 739
    .line 740
    .line 741
    goto :goto_8

    .line 742
    :cond_8
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 743
    .line 744
    .line 745
    move-result-object p0

    .line 746
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 747
    .line 748
    .line 749
    move-result-object p0

    .line 750
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    move-result-object p0

    .line 754
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 755
    .line 756
    .line 757
    :goto_8
    return-object v0

    .line 758
    nop

    .line 759
    :pswitch_data_0
    .packed-switch 0x0
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
