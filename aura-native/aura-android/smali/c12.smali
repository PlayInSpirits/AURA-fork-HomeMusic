.class public Lc12;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lj4;
.implements Lnz1;


# instance fields
.field public final synthetic n:I

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lc12;->n:I

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    new-instance v0, Lw03;

    invoke-direct {v0}, Lw03;-><init>()V

    iput-object v0, p0, Lc12;->o:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 27
    iput p1, p0, Lc12;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroidx/appcompat/widget/Toolbar;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lc12;->n:I

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Lc12;->o:Ljava/lang/Object;

    .line 42
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lc12;->p:Ljava/lang/Object;

    .line 43
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationContentDescription()Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Lc12;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/database/AppDatabase_Impl;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lc12;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lc12;->o:Ljava/lang/Object;

    .line 8
    .line 9
    new-instance p1, Lq20;

    .line 10
    .line 11
    const/4 v0, 0x4

    .line 12
    invoke-direct {p1, v0}, Lq20;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lc12;->p:Ljava/lang/Object;

    .line 16
    .line 17
    new-instance p1, Lh61;

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-direct {p1, v0}, Lh61;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lc12;->q:Ljava/lang/Object;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/ui/activity/MainActivity;)V
    .locals 2

    const/4 v0, 0x2

    iput v0, p0, Lc12;->n:I

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    new-instance v0, Lpa;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lpa;-><init>(I)V

    iput-object v0, p0, Lc12;->p:Ljava/lang/Object;

    .line 30
    new-instance v0, Lmm3;

    invoke-direct {v0}, Lmm3;-><init>()V

    iput-object v0, p0, Lc12;->q:Ljava/lang/Object;

    .line 31
    iput-object p1, p0, Lc12;->o:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 26
    iput p4, p0, Lc12;->n:I

    iput-object p1, p0, Lc12;->o:Ljava/lang/Object;

    iput-object p2, p0, Lc12;->p:Ljava/lang/Object;

    iput-object p3, p0, Lc12;->q:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lc12;->n:I

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    new-instance v0, Lrm3;

    .line 36
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object v0, p0, Lc12;->p:Ljava/lang/Object;

    .line 38
    iput-object v0, p0, Lc12;->q:Ljava/lang/Object;

    .line 39
    iput-object p1, p0, Lc12;->o:Ljava/lang/Object;

    return-void
.end method

.method public static f(Landroid/view/View;)Lc12;
    .locals 4

    .line 1
    const v0, 0x7f0a0329

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const v0, 0x7f0a032a

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    const v0, 0x7f0a032b

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    new-instance v0, Lc12;

    .line 29
    .line 30
    check-cast p0, Landroid/widget/LinearLayout;

    .line 31
    .line 32
    const/4 p0, 0x7

    .line 33
    invoke-direct {v0, v1, v2, v3, p0}, Lc12;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    const-string v0, "Missing required view with ID: "

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return-object p0
.end method


# virtual methods
.method public a()Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, Lc12;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/net/Uri;

    .line 4
    .line 5
    return-object p0
.end method

.method public b()V
    .locals 0

    .line 1
    return-void
.end method

.method public c()Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, Lc12;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/net/Uri;

    .line 4
    .line 5
    return-object p0
.end method

.method public d()Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public e()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public g(ILandroid/os/Bundle;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lc12;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 4
    .line 5
    new-instance v1, Lgk;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, p2, v2}, Lgk;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public getDescription()Landroid/content/ClipDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lc12;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/content/ClipDescription;

    .line 4
    .line 5
    return-object p0
.end method

.method public h()Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lc12;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public i(Lik;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lc12;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, p1, Lik;->d:Ljava/lang/String;

    .line 9
    .line 10
    iget-object p1, p1, Lik;->c:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const/4 v3, 0x3

    .line 20
    const/4 v4, 0x2

    .line 21
    const/4 v5, 0x1

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v7, -0x1

    .line 24
    sparse-switch v2, :sswitch_data_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :sswitch_0
    const-string v2, "playlist"

    .line 29
    .line 30
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v7, 0x5

    .line 38
    goto :goto_0

    .line 39
    :sswitch_1
    const-string v2, "genre"

    .line 40
    .line 41
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/4 v7, 0x4

    .line 49
    goto :goto_0

    .line 50
    :sswitch_2
    const-string v2, "album"

    .line 51
    .line 52
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-nez p1, :cond_3

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    move v7, v3

    .line 60
    goto :goto_0

    .line 61
    :sswitch_3
    const-string v2, "year"

    .line 62
    .line 63
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez p1, :cond_4

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_4
    move v7, v4

    .line 71
    goto :goto_0

    .line 72
    :sswitch_4
    const-string v2, "song"

    .line 73
    .line 74
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-nez p1, :cond_5

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_5
    move v7, v5

    .line 82
    goto :goto_0

    .line 83
    :sswitch_5
    const-string v2, "artist"

    .line 84
    .line 85
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-nez p1, :cond_6

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_6
    move v7, v6

    .line 93
    :goto_0
    const p1, 0x7f0a0596

    .line 94
    .line 95
    .line 96
    const v2, 0x7f130080

    .line 97
    .line 98
    .line 99
    packed-switch v7, :pswitch_data_0

    .line 100
    .line 101
    .line 102
    invoke-static {v0, v2, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :pswitch_0
    iget-object p1, p0, Lc12;->q:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p1, Lmm3;

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    new-instance v2, Lk03;

    .line 118
    .line 119
    invoke-direct {v2}, Lad2;-><init>()V

    .line 120
    .line 121
    .line 122
    invoke-static {v6}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-virtual {v4}, Lpn4;->g()Lrm3;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {v4, v1}, Lrm3;->F(Ljava/lang/String;)Lretrofit2/Call;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    new-instance v5, Li61;

    .line 135
    .line 136
    const/16 v6, 0x9

    .line 137
    .line 138
    invoke-direct {v5, p1, v2, v1, v6}, Li61;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v4, v5}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 142
    .line 143
    .line 144
    new-instance p1, Lhk;

    .line 145
    .line 146
    invoke-direct {p1, p0, v2, v3}, Lhk;-><init>(Lc12;Lk03;I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2, v0, p1}, Lad2;->e(Lba2;La83;)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :pswitch_1
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 158
    .line 159
    .line 160
    move-result v3

    .line 161
    if-eqz v3, :cond_7

    .line 162
    .line 163
    invoke-static {v0, v2, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :cond_7
    new-instance v0, Lcom/eddyizm/tempus/subsonic/models/Genre;

    .line 172
    .line 173
    invoke-direct {v0}, Lcom/eddyizm/tempus/subsonic/models/Genre;-><init>()V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/subsonic/models/Genre;->setGenre(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v0, v6}, Lcom/eddyizm/tempus/subsonic/models/Genre;->setSongCount(I)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v6}, Lcom/eddyizm/tempus/subsonic/models/Genre;->setAlbumCount(I)V

    .line 183
    .line 184
    .line 185
    new-instance v1, Landroid/os/Bundle;

    .line 186
    .line 187
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 188
    .line 189
    .line 190
    const-string v2, "GENRE_OBJECT"

    .line 191
    .line 192
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 193
    .line 194
    .line 195
    const-string v0, "MEDIA_BY_GENRE"

    .line 196
    .line 197
    invoke-virtual {v1, v0, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0, p1, v1}, Lc12;->g(ILandroid/os/Bundle;)V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :pswitch_2
    invoke-static {v1}, Lrv2;->j(Ljava/lang/String;)Lk03;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    new-instance v1, Lhk;

    .line 209
    .line 210
    invoke-direct {v1, p0, p1, v5}, Lhk;-><init>(Lc12;Lk03;I)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 214
    .line 215
    .line 216
    return-void

    .line 217
    :pswitch_3
    const-string v3, "MEDIA_BY_YEAR"

    .line 218
    .line 219
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 224
    .line 225
    .line 226
    move-result v1

    .line 227
    new-instance v4, Landroid/os/Bundle;

    .line 228
    .line 229
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 230
    .line 231
    .line 232
    const-string v5, "year_object"

    .line 233
    .line 234
    invoke-virtual {v4, v5, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v4, v3, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p0, p1, v4}, Lc12;->g(ILandroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :catch_0
    invoke-static {v0, v2, v6}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 249
    .line 250
    .line 251
    return-void

    .line 252
    :pswitch_4
    invoke-static {v1}, Lxi4;->r(Ljava/lang/String;)Lk03;

    .line 253
    .line 254
    .line 255
    move-result-object p1

    .line 256
    new-instance v1, Lhk;

    .line 257
    .line 258
    invoke-direct {v1, p0, p1, v6}, Lhk;-><init>(Lc12;Lk03;I)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p1, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 262
    .line 263
    .line 264
    return-void

    .line 265
    :pswitch_5
    iget-object p1, p0, Lc12;->p:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast p1, Lpa;

    .line 268
    .line 269
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    invoke-static {v1}, Lpa;->v(Ljava/lang/String;)Lk03;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    new-instance v1, Lhk;

    .line 277
    .line 278
    invoke-direct {v1, p0, p1, v4}, Lhk;-><init>(Lc12;Lk03;I)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 282
    .line 283
    .line 284
    return-void

    .line 285
    :sswitch_data_0
    .sparse-switch
        -0x53fd20b9 -> :sswitch_5
        0x35f515 -> :sswitch_4
        0x38883d -> :sswitch_3
        0x5897e6f -> :sswitch_2
        0x5db0983 -> :sswitch_1
        0x700681d2 -> :sswitch_0
    .end sparse-switch

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
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
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

.method public j(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 8

    .line 1
    const/16 v0, 0xa

    .line 2
    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    new-instance v1, Li61;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Li61;-><init>(I)V

    .line 8
    .line 9
    .line 10
    if-eqz p3, :cond_0

    .line 11
    .line 12
    iput-object p1, v1, Li61;->o:Ljava/lang/Object;

    .line 13
    .line 14
    goto :goto_4

    .line 15
    :cond_0
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    invoke-virtual {p3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    iput-object p3, v1, Li61;->p:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-static {p1}, Lxa3;->i(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object p3, v1, Li61;->p:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p3, Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    :try_start_0
    const-string p3, "MD5"

    .line 41
    .line 42
    invoke-static {p3}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p3, p1}, Ljava/security/MessageDigest;->update([B)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p3}, Ljava/security/MessageDigest;->digest()[B

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    new-instance p3, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    array-length v2, p1

    .line 63
    const/4 v3, 0x0

    .line 64
    move v4, v3

    .line 65
    :goto_0
    if-ge v4, v2, :cond_2

    .line 66
    .line 67
    aget-byte v5, p1, v4

    .line 68
    .line 69
    new-instance v6, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    and-int/lit16 v5, v5, 0xff

    .line 72
    .line 73
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-direct {v6, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    :goto_1
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->length()I

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    const/4 v7, 0x2

    .line 85
    if-ge v5, v7, :cond_1

    .line 86
    .line 87
    const-string v5, "0"

    .line 88
    .line 89
    invoke-virtual {v6, v3, v5}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :catch_0
    move-exception p1

    .line 94
    goto :goto_2

    .line 95
    :cond_1
    invoke-virtual {p3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    add-int/lit8 v4, v4, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    goto :goto_3

    .line 106
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 107
    .line 108
    .line 109
    const-string p1, ""

    .line 110
    .line 111
    :goto_3
    iput-object p1, v1, Li61;->q:Ljava/lang/Object;

    .line 112
    .line 113
    :goto_4
    iput-object v1, p0, Lc12;->q:Ljava/lang/Object;

    .line 114
    .line 115
    :cond_3
    if-eqz p2, :cond_4

    .line 116
    .line 117
    if-eqz p4, :cond_4

    .line 118
    .line 119
    new-instance p1, Li61;

    .line 120
    .line 121
    invoke-direct {p1, v0}, Li61;-><init>(I)V

    .line 122
    .line 123
    .line 124
    iput-object p2, p1, Li61;->q:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object p4, p1, Li61;->p:Ljava/lang/Object;

    .line 127
    .line 128
    iput-object p1, p0, Lc12;->q:Ljava/lang/Object;

    .line 129
    .line 130
    :cond_4
    return-void
.end method

.method public k()V
    .locals 3

    .line 1
    iget-object v0, p0, Lc12;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lw03;

    .line 4
    .line 5
    iget-object v1, p0, Lc12;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lw03;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Ljava/util/List;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, Lc12;->q:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lgf1;

    .line 20
    .line 21
    invoke-interface {v2, p0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    :cond_0
    if-eqz v2, :cond_2

    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-virtual {v0, v1, v2}, Lw03;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    :goto_0
    return-void
.end method

.method public q(Landroid/graphics/drawable/Drawable;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc12;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lc12;->u(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public t()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lc12;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Lc12;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const/16 v1, 0x20

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lc12;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x7b

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lc12;->p:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Lrm3;

    .line 33
    .line 34
    iget-object p0, p0, Lrm3;->o:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Lrm3;

    .line 37
    .line 38
    const-string v1, ""

    .line 39
    .line 40
    :goto_0
    if-eqz p0, :cond_1

    .line 41
    .line 42
    iget-object v2, p0, Lrm3;->n:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    if-eqz v2, :cond_0

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_0

    .line 58
    .line 59
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v1}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    const/4 v3, 0x1

    .line 72
    sub-int/2addr v2, v3

    .line 73
    invoke-virtual {v0, v1, v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    :goto_1
    iget-object p0, p0, Lrm3;->o:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p0, Lrm3;

    .line 83
    .line 84
    const-string v1, ", "

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    const/16 p0, 0x7d

    .line 88
    .line 89
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public u(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc12;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lc12;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljava/lang/CharSequence;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/Toolbar;->setNavigationContentDescription(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
