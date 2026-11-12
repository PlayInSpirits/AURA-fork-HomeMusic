.class public final Len3;
.super Ldw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final q:Lcom/eddyizm/tempus/interfaces/ClickCallback;

.field public r:Ljava/util/List;

.field public s:Ljava/util/List;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Len3;->q:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 5
    .line 6
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 7
    .line 8
    iput-object p1, p0, Len3;->r:Ljava/util/List;

    .line 9
    .line 10
    iput-object p1, p0, Len3;->s:Ljava/util/List;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Len3;->r:Ljava/util/List;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public final b(I)J
    .locals 0

    .line 1
    int-to-long p0, p1

    .line 2
    return-wide p0
.end method

.method public final c(I)I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final g(Lcx3;I)V
    .locals 8

    .line 1
    check-cast p1, Ldn3;

    .line 2
    .line 3
    iget-object p0, p0, Len3;->r:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;

    .line 10
    .line 11
    new-instance p2, Ljava/text/SimpleDateFormat;

    .line 12
    .line 13
    const-string v0, "MMM d"

    .line 14
    .line 15
    invoke-direct {p2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p1, Lcx3;->a:Landroid/view/View;

    .line 19
    .line 20
    iget-object p1, p1, Ldn3;->u:Lw12;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getPublishDate()Ljava/util/Date;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {p2, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const p2, 0x7f130420

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    :goto_0
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getDuration()Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    int-to-long v2, v2

    .line 55
    sget-object v4, Le03;->a:Ljava/util/regex/Pattern;

    .line 56
    .line 57
    const-wide/16 v4, 0x3c

    .line 58
    .line 59
    div-long/2addr v2, v4

    .line 60
    cmp-long v6, v2, v4

    .line 61
    .line 62
    if-gez v6, :cond_1

    .line 63
    .line 64
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    const-string v3, "%01d min"

    .line 77
    .line 78
    invoke-static {v4, v3, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    goto :goto_1

    .line 83
    :cond_1
    div-long v6, v2, v4

    .line 84
    .line 85
    rem-long/2addr v2, v4

    .line 86
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    filled-new-array {v5, v2}, [Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    const-string v3, "%d h %02d min"

    .line 103
    .line 104
    invoke-static {v4, v3, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    goto :goto_1

    .line 109
    :cond_2
    const v2, 0x7f130421

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    :goto_1
    const v3, 0x7f13041f

    .line 117
    .line 118
    .line 119
    filled-new-array {p2, v2}, [Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-virtual {v1, v3, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    iget-object v1, p1, Lw12;->g:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v1, Landroid/widget/TextView;

    .line 130
    .line 131
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getTitle()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 136
    .line 137
    .line 138
    iget-object v1, p1, Lw12;->f:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v1, Landroid/widget/TextView;

    .line 141
    .line 142
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getArtist()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 147
    .line 148
    .line 149
    iget-object v1, p1, Lw12;->e:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v1, Landroid/widget/TextView;

    .line 152
    .line 153
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 154
    .line 155
    .line 156
    iget-object p2, p1, Lw12;->d:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast p2, Landroid/widget/TextView;

    .line 159
    .line 160
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getDescription()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    sget-object v2, Le03;->a:Ljava/util/regex/Pattern;

    .line 165
    .line 166
    if-eqz v1, :cond_3

    .line 167
    .line 168
    const/16 v2, 0x3f

    .line 169
    .line 170
    invoke-static {v1, v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    goto :goto_2

    .line 179
    :cond_3
    const-string v1, ""

    .line 180
    .line 181
    :goto_2
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getCoverArtId()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-static {p2}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    if-eqz v0, :cond_4

    .line 197
    .line 198
    invoke-static {}, Lud3;->t()I

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    invoke-static {v2, v0}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    goto :goto_3

    .line 207
    :cond_4
    const/4 v2, 0x0

    .line 208
    :goto_3
    const/4 v3, 0x7

    .line 209
    invoke-static {p2, v0, v3, v1, v2}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-virtual {p2, v0}, Lvz3;->T(Lxv0;)Lvz3;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    invoke-static {}, Lud3;->R()Z

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    if-eqz v0, :cond_5

    .line 226
    .line 227
    invoke-virtual {p2}, Llq;->l()Llq;

    .line 228
    .line 229
    .line 230
    move-result-object p2

    .line 231
    check-cast p2, Lvz3;

    .line 232
    .line 233
    :cond_5
    iget-object v0, p1, Lw12;->c:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v0, Landroid/widget/ImageView;

    .line 236
    .line 237
    invoke-virtual {p2, v0}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 238
    .line 239
    .line 240
    iget-object p2, p1, Lw12;->j:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast p2, Landroid/widget/Button;

    .line 243
    .line 244
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getStatus()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    const-string v1, "completed"

    .line 249
    .line 250
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    invoke-virtual {p2, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 255
    .line 256
    .line 257
    iget-object p2, p1, Lw12;->i:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast p2, Landroid/widget/Button;

    .line 260
    .line 261
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getStatus()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    const/16 v2, 0x8

    .line 270
    .line 271
    const/4 v3, 0x0

    .line 272
    if-eqz v0, :cond_6

    .line 273
    .line 274
    move v0, v3

    .line 275
    goto :goto_4

    .line 276
    :cond_6
    move v0, v2

    .line 277
    :goto_4
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 278
    .line 279
    .line 280
    iget-object p1, p1, Lw12;->h:Ljava/lang/Object;

    .line 281
    .line 282
    check-cast p1, Landroid/widget/Button;

    .line 283
    .line 284
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getStatus()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result p0

    .line 292
    if-eqz p0, :cond_7

    .line 293
    .line 294
    goto :goto_5

    .line 295
    :cond_7
    move v2, v3

    .line 296
    :goto_5
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 297
    .line 298
    .line 299
    return-void
.end method

.method public final i(Landroid/view/ViewGroup;I)Lcx3;
    .locals 12

    .line 1
    const p2, 0x7f0d009b

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {p1, p2, p1, v0}, Lb11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const p2, 0x7f0a04da

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v3, v0

    .line 17
    check-cast v3, Landroid/widget/ImageView;

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    const p2, 0x7f0a04db

    .line 22
    .line 23
    .line 24
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move-object v4, v0

    .line 29
    check-cast v4, Landroid/widget/TextView;

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    const p2, 0x7f0a04dc

    .line 34
    .line 35
    .line 36
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    move-object v5, v0

    .line 41
    check-cast v5, Landroid/widget/Button;

    .line 42
    .line 43
    if-eqz v5, :cond_0

    .line 44
    .line 45
    const p2, 0x7f0a04e0

    .line 46
    .line 47
    .line 48
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    move-object v6, v0

    .line 53
    check-cast v6, Landroid/widget/Button;

    .line 54
    .line 55
    if-eqz v6, :cond_0

    .line 56
    .line 57
    const p2, 0x7f0a04e1

    .line 58
    .line 59
    .line 60
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    move-object v7, v0

    .line 65
    check-cast v7, Landroid/widget/Button;

    .line 66
    .line 67
    if-eqz v7, :cond_0

    .line 68
    .line 69
    const p2, 0x7f0a04e2

    .line 70
    .line 71
    .line 72
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    move-object v8, v0

    .line 77
    check-cast v8, Landroid/widget/TextView;

    .line 78
    .line 79
    if-eqz v8, :cond_0

    .line 80
    .line 81
    const p2, 0x7f0a04e3

    .line 82
    .line 83
    .line 84
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    move-object v9, v0

    .line 89
    check-cast v9, Landroid/widget/TextView;

    .line 90
    .line 91
    if-eqz v9, :cond_0

    .line 92
    .line 93
    const p2, 0x7f0a04e4

    .line 94
    .line 95
    .line 96
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    move-object v10, v0

    .line 101
    check-cast v10, Landroid/widget/TextView;

    .line 102
    .line 103
    if-eqz v10, :cond_0

    .line 104
    .line 105
    const p2, 0x7f0a04e6

    .line 106
    .line 107
    .line 108
    invoke-static {p1, p2}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 109
    .line 110
    .line 111
    move-result-object v11

    .line 112
    if-eqz v11, :cond_0

    .line 113
    .line 114
    new-instance v1, Lw12;

    .line 115
    .line 116
    move-object v2, p1

    .line 117
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 118
    .line 119
    invoke-direct/range {v1 .. v11}, Lw12;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/Button;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;)V

    .line 120
    .line 121
    .line 122
    new-instance p1, Ldn3;

    .line 123
    .line 124
    invoke-direct {p1, p0, v1}, Ldn3;-><init>(Len3;Lw12;)V

    .line 125
    .line 126
    .line 127
    return-object p1

    .line 128
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    const-string p1, "Missing required view with ID: "

    .line 137
    .line 138
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    const/4 p0, 0x0

    .line 146
    return-object p0
.end method

.method public final p(Ljava/util/List;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 4
    .line 5
    iput-object p1, p0, Len3;->s:Ljava/util/List;

    .line 6
    .line 7
    iput-object p1, p0, Len3;->r:Ljava/util/List;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance v0, Lc7;

    .line 15
    .line 16
    const/16 v1, 0x11

    .line 17
    .line 18
    invoke-direct {v0, v1}, Lc7;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Ljava/util/List;

    .line 34
    .line 35
    iput-object p1, p0, Len3;->s:Ljava/util/List;

    .line 36
    .line 37
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    new-instance v0, Lc7;

    .line 42
    .line 43
    const/16 v1, 0x12

    .line 44
    .line 45
    invoke-direct {v0, v1}, Lc7;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Ljava/util/List;

    .line 61
    .line 62
    iput-object p1, p0, Len3;->r:Ljava/util/List;

    .line 63
    .line 64
    :goto_0
    invoke-virtual {p0}, Ldw3;->d()V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final q(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Len3;->s:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 6
    .line 7
    iput-object v0, p0, Len3;->s:Ljava/util/List;

    .line 8
    .line 9
    :cond_0
    const-string v0, "PODCAST_FILTER_BY_ALL"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_2

    .line 16
    .line 17
    const-string v0, "PODCAST_FILTER_BY_DOWNLOAD"

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iget-object p1, p0, Len3;->s:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v0, Lc7;

    .line 33
    .line 34
    const/16 v1, 0x13

    .line 35
    .line 36
    invoke-direct {v0, v1}, Lc7;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Ljava/util/List;

    .line 52
    .line 53
    iput-object p1, p0, Len3;->r:Ljava/util/List;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    iget-object p1, p0, Len3;->s:Ljava/util/List;

    .line 57
    .line 58
    iput-object p1, p0, Len3;->r:Ljava/util/List;

    .line 59
    .line 60
    :goto_0
    iget-object p1, p0, Len3;->r:Ljava/util/List;

    .line 61
    .line 62
    if-nez p1, :cond_3

    .line 63
    .line 64
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 65
    .line 66
    iput-object p1, p0, Len3;->r:Ljava/util/List;

    .line 67
    .line 68
    :cond_3
    invoke-virtual {p0}, Ldw3;->d()V

    .line 69
    .line 70
    .line 71
    return-void
.end method
