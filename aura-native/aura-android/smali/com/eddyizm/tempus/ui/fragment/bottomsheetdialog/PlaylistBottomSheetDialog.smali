.class public Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistBottomSheetDialog;
.super Lzt;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public B0:Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

.field public C0:Lbl2;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lzt;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 5

    .line 1
    const p3, 0x7f0d0023

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p2, p0, Lkc1;->s:Landroid/os/Bundle;

    .line 10
    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    const-string p3, "PLAYLIST_OBJECT"

    .line 14
    .line 15
    invoke-virtual {p2, p3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistBottomSheetDialog;->B0:Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 22
    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    goto/16 :goto_1

    .line 26
    .line 27
    :cond_0
    const p2, 0x7f0a0443

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    check-cast p2, Landroid/view/ViewGroup;

    .line 35
    .line 36
    invoke-static {p2}, Lq05;->u(Landroid/view/ViewGroup;)V

    .line 37
    .line 38
    .line 39
    const p2, 0x7f0a04a8

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    check-cast p2, Landroid/widget/ImageView;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistBottomSheetDialog;->B0:Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getCoverArtId()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {p3}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    if-eqz v1, :cond_1

    .line 63
    .line 64
    invoke-static {}, Lud3;->t()I

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    invoke-static {v3, v1}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    goto :goto_0

    .line 73
    :cond_1
    const/4 v3, 0x0

    .line 74
    :goto_0
    const/4 v4, 0x6

    .line 75
    invoke-static {p3, v1, v4, v2, v3}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 76
    .line 77
    .line 78
    move-result-object p3

    .line 79
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {p3, v1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 84
    .line 85
    .line 86
    move-result-object p3

    .line 87
    invoke-static {}, Lud3;->R()Z

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_2

    .line 92
    .line 93
    invoke-virtual {p3}, Llq;->l()Llq;

    .line 94
    .line 95
    .line 96
    move-result-object p3

    .line 97
    check-cast p3, Lvz3;

    .line 98
    .line 99
    :cond_2
    invoke-virtual {p3, p2}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 100
    .line 101
    .line 102
    const p2, 0x7f0a04c7

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    check-cast p2, Landroid/widget/TextView;

    .line 110
    .line 111
    iget-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistBottomSheetDialog;->B0:Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 112
    .line 113
    invoke-virtual {p3}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p3

    .line 117
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    .line 119
    .line 120
    const/4 p3, 0x1

    .line 121
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setSelected(Z)V

    .line 122
    .line 123
    .line 124
    const p2, 0x7f0a04a7

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    check-cast p2, Landroid/widget/TextView;

    .line 132
    .line 133
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistBottomSheetDialog;->B0:Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 138
    .line 139
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getSongCount()I

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistBottomSheetDialog;->B0:Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 148
    .line 149
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getDuration()J

    .line 150
    .line 151
    .line 152
    move-result-wide v3

    .line 153
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    invoke-static {v3, v0}, Le03;->h(Ljava/lang/Long;Z)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    const v3, 0x7f1303ef

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, v3, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 173
    .line 174
    .line 175
    const p2, 0x7f0a0464

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 179
    .line 180
    .line 181
    move-result-object p2

    .line 182
    check-cast p2, Landroid/widget/TextView;

    .line 183
    .line 184
    new-instance v1, Lbl3;

    .line 185
    .line 186
    invoke-direct {v1, p0, v0}, Lbl3;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistBottomSheetDialog;I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 190
    .line 191
    .line 192
    const p2, 0x7f0a0093

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 196
    .line 197
    .line 198
    move-result-object p2

    .line 199
    check-cast p2, Landroid/widget/TextView;

    .line 200
    .line 201
    new-instance v0, Lbl3;

    .line 202
    .line 203
    invoke-direct {v0, p0, p3}, Lbl3;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistBottomSheetDialog;I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 207
    .line 208
    .line 209
    return-object p1

    .line 210
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lzt;->n0()V

    .line 211
    .line 212
    .line 213
    return-object p1
.end method

.method public final R()V
    .locals 9

    .line 1
    invoke-super {p0}, Lpp0;->R()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistBottomSheetDialog;->B0:Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    new-instance v3, Lcb4;

    .line 13
    .line 14
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Landroid/content/ComponentName;

    .line 19
    .line 20
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const-class v5, Lcom/eddyizm/tempus/service/MediaService;

    .line 25
    .line 26
    invoke-direct {v1, v4, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v3, v0, v1}, Lcb4;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V

    .line 30
    .line 31
    .line 32
    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 33
    .line 34
    new-instance v5, Laj2;

    .line 35
    .line 36
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lf35;->x()Landroid/os/Looper;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    new-instance v7, Lbl2;

    .line 44
    .line 45
    invoke-direct {v7, v6}, Lbl2;-><init>(Landroid/os/Looper;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, v3, Lcb4;->a:Lbb4;

    .line 49
    .line 50
    invoke-interface {v0}, Lbb4;->e()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    new-instance v0, Lxc5;

    .line 57
    .line 58
    new-instance v1, Lx7;

    .line 59
    .line 60
    invoke-direct {v1, v2}, Lx7;-><init>(Landroid/content/Context;)V

    .line 61
    .line 62
    .line 63
    new-instance v8, Lfi0;

    .line 64
    .line 65
    invoke-direct {v8, v1}, Lfi0;-><init>(Lx7;)V

    .line 66
    .line 67
    .line 68
    const/4 v1, 0x4

    .line 69
    invoke-direct {v0, v1, v8}, Lxc5;-><init>(ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :goto_0
    move-object v8, v0

    .line 73
    goto :goto_1

    .line 74
    :cond_0
    const/4 v0, 0x0

    .line 75
    goto :goto_0

    .line 76
    :goto_1
    new-instance v1, Lbj2;

    .line 77
    .line 78
    invoke-direct/range {v1 .. v8}, Lsk2;-><init>(Landroid/content/Context;Lcb4;Landroid/os/Bundle;Lqk2;Landroid/os/Looper;Lbl2;Lxc5;)V

    .line 79
    .line 80
    .line 81
    new-instance v0, Landroid/os/Handler;

    .line 82
    .line 83
    invoke-direct {v0, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v7, v1, v0}, Lb11;->w(Lbl2;Lbj2;Landroid/os/Handler;)V

    .line 87
    .line 88
    .line 89
    iput-object v7, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistBottomSheetDialog;->C0:Lbl2;

    .line 90
    .line 91
    :cond_1
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistBottomSheetDialog;->C0:Lbl2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lsk2;->Z0(Ljava/util/concurrent/Future;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-super {p0}, Lpp0;->S()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final T(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method
