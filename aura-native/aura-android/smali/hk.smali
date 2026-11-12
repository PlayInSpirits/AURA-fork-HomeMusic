.class public final Lhk;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lk03;

.field public final synthetic c:Lc12;


# direct methods
.method public synthetic constructor <init>(Lc12;Lk03;I)V
    .locals 0

    .line 1
    iput p3, p0, Lhk;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lhk;->c:Lc12;

    .line 4
    .line 5
    iput-object p2, p0, Lhk;->b:Lk03;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget v0, p0, Lhk;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lhk;->b:Lk03;

    .line 5
    .line 6
    iget-object v3, p0, Lhk;->c:Lc12;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 12
    .line 13
    invoke-virtual {v2, p0}, Lad2;->j(La83;)V

    .line 14
    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    iget-object p0, v3, Lc12;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 21
    .line 22
    const p1, 0x7f13007e

    .line 23
    .line 24
    .line 25
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance p0, Landroid/os/Bundle;

    .line 34
    .line 35
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v0, "PLAYLIST_OBJECT"

    .line 39
    .line 40
    invoke-virtual {p0, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 41
    .line 42
    .line 43
    const p1, 0x7f0a04a0

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3, p1, p0}, Lc12;->g(ILandroid/os/Bundle;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    return-void

    .line 50
    :pswitch_0
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 51
    .line 52
    invoke-virtual {v2, p0}, Lad2;->j(La83;)V

    .line 53
    .line 54
    .line 55
    if-nez p1, :cond_1

    .line 56
    .line 57
    iget-object p0, v3, Lc12;->o:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 60
    .line 61
    const p1, 0x7f13007d

    .line 62
    .line 63
    .line 64
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_1
    new-instance p0, Landroid/os/Bundle;

    .line 73
    .line 74
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 75
    .line 76
    .line 77
    const-string v0, "ARTIST_OBJECT"

    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->strippedForNav()Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p0, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 84
    .line 85
    .line 86
    const p1, 0x7f0a00e2

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, p1, p0}, Lc12;->g(ILandroid/os/Bundle;)V

    .line 90
    .line 91
    .line 92
    :goto_1
    return-void

    .line 93
    :pswitch_1
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 94
    .line 95
    invoke-virtual {v2, p0}, Lad2;->j(La83;)V

    .line 96
    .line 97
    .line 98
    if-nez p1, :cond_2

    .line 99
    .line 100
    iget-object p0, v3, Lc12;->o:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 103
    .line 104
    const p1, 0x7f13007c

    .line 105
    .line 106
    .line 107
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 112
    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_2
    new-instance p0, Landroid/os/Bundle;

    .line 116
    .line 117
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 118
    .line 119
    .line 120
    const-string v0, "ALBUM_OBJECT"

    .line 121
    .line 122
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->strippedForNav()Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    invoke-virtual {p0, v0, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 127
    .line 128
    .line 129
    const p1, 0x7f0a009f

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, p1, p0}, Lc12;->g(ILandroid/os/Bundle;)V

    .line 133
    .line 134
    .line 135
    :goto_2
    return-void

    .line 136
    :pswitch_2
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 137
    .line 138
    invoke-virtual {v2, p0}, Lad2;->j(La83;)V

    .line 139
    .line 140
    .line 141
    iget-object p0, v3, Lc12;->o:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 144
    .line 145
    if-nez p1, :cond_3

    .line 146
    .line 147
    const p1, 0x7f13007f

    .line 148
    .line 149
    .line 150
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Ll70;->d()Le75;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-static {p0}, Lgh0;->r(Lf75;)Lb75;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-static {p0}, Lgh0;->q(Lf75;)Ltf0;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    new-instance v3, Lbq4;

    .line 180
    .line 181
    invoke-direct {v3, v0, v1, v2}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 182
    .line 183
    .line 184
    const-class v0, Lii4;

    .line 185
    .line 186
    invoke-static {v0}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {v0}, Li30;->b()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    if-eqz v1, :cond_4

    .line 195
    .line 196
    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 197
    .line 198
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-virtual {v3, v0, v1}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    check-cast v0, Lii4;

    .line 207
    .line 208
    iput-object p1, v0, Lii4;->h:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 209
    .line 210
    new-instance v0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;

    .line 211
    .line 212
    invoke-direct {v0}, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;-><init>()V

    .line 213
    .line 214
    .line 215
    new-instance v1, Landroid/os/Bundle;

    .line 216
    .line 217
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 218
    .line 219
    .line 220
    const-string v2, "TRACK_OBJECT"

    .line 221
    .line 222
    invoke-virtual {v1, v2, p1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, v1}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0}, Lnc1;->k()Lmd1;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    const/4 p1, 0x0

    .line 233
    invoke-virtual {v0, p0, p1}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    goto :goto_3

    .line 237
    :cond_4
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 238
    .line 239
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 240
    .line 241
    .line 242
    :goto_3
    return-void

    .line 243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
