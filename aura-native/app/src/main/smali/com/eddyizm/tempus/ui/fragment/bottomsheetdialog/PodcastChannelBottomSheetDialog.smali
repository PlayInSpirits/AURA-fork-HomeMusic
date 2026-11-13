.class public Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PodcastChannelBottomSheetDialog;
.super Ldefpackage/zt;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public B0:Ldefpackage/um3;

.field public C0:Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;

.field public D0:Ldefpackage/bl2;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldefpackage/zt;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 4

    .line 1
    const p3, 0x7f0d0025

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
    iget-object p2, p0, Ldefpackage/kc1;->s:Landroid/os/Bundle;

    .line 10
    .line 11
    if-eqz p2, :cond_4

    .line 12
    .line 13
    const-string p3, "PODCAST_CHANNEL_OBJECT"

    .line 14
    .line 15
    invoke-virtual {p2, p3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PodcastChannelBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;

    .line 22
    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    goto/16 :goto_0

    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p2}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    invoke-static {p2}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {p2, v0}, Ldefpackage/b11;->e(Ldefpackage/nc1;Ldefpackage/b75;)Ldefpackage/tf0;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    new-instance v1, Ldefpackage/bq4;

    .line 44
    .line 45
    invoke-direct {v1, p3, v0, p2}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 46
    .line 47
    .line 48
    const-class p2, Ldefpackage/um3;

    .line 49
    .line 50
    invoke-static {p2}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p2}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    const/4 v0, 0x0

    .line 59
    if-eqz p3, :cond_3

    .line 60
    .line 61
    const-string v2, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 62
    .line 63
    invoke-virtual {v2, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    invoke-virtual {v1, p2, p3}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    check-cast p2, Ldefpackage/um3;

    .line 72
    .line 73
    iput-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PodcastChannelBottomSheetDialog;->B0:Ldefpackage/um3;

    .line 74
    .line 75
    iget-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PodcastChannelBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;

    .line 76
    .line 77
    iput-object p3, p2, Ldefpackage/um3;->d:Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;

    .line 78
    .line 79
    const p2, 0x7f0a04da

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    check-cast p2, Landroid/widget/ImageView;

    .line 87
    .line 88
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PodcastChannelBottomSheetDialog;->B0:Ldefpackage/um3;

    .line 93
    .line 94
    iget-object v1, v1, Ldefpackage/um3;->d:Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;

    .line 95
    .line 96
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;->getCoverArtId()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-static {p3}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Ldefpackage/c04;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    if-eqz v1, :cond_1

    .line 105
    .line 106
    invoke-static {}, Ldefpackage/ud3;->t()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    invoke-static {v0, v1}, Ldefpackage/wg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    :cond_1
    const/4 v3, 0x7

    .line 115
    invoke-static {p3, v1, v3, v2, v0}, Ldefpackage/b11;->g(Landroid/content/Context;Ljava/lang/String;ILdefpackage/c04;Ljava/lang/String;)Ldefpackage/vz3;

    .line 116
    .line 117
    .line 118
    move-result-object p3

    .line 119
    invoke-static {}, Ldefpackage/xv0;->b()Ldefpackage/xv0;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {p3, v0}, Ldefpackage/vz3;->T(Ldefpackage/xv0;)Ldefpackage/vz3;

    .line 124
    .line 125
    .line 126
    move-result-object p3

    .line 127
    invoke-static {}, Ldefpackage/ud3;->R()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_2

    .line 132
    .line 133
    invoke-virtual {p3}, Ldefpackage/lq;->l()Ldefpackage/lq;

    .line 134
    .line 135
    .line 136
    move-result-object p3

    .line 137
    check-cast p3, Ldefpackage/vz3;

    .line 138
    .line 139
    :cond_2
    invoke-virtual {p3, p2}, Ldefpackage/vz3;->K(Landroid/widget/ImageView;)V

    .line 140
    .line 141
    .line 142
    const p2, 0x7f0a04e5

    .line 143
    .line 144
    .line 145
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    check-cast p2, Landroid/widget/TextView;

    .line 150
    .line 151
    iget-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PodcastChannelBottomSheetDialog;->B0:Ldefpackage/um3;

    .line 152
    .line 153
    iget-object p3, p3, Ldefpackage/um3;->d:Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;

    .line 154
    .line 155
    invoke-virtual {p3}, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;->getTitle()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p3

    .line 159
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 160
    .line 161
    .line 162
    const p2, 0x7f0a01a0

    .line 163
    .line 164
    .line 165
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    check-cast p2, Landroid/widget/TextView;

    .line 170
    .line 171
    new-instance p3, Ldefpackage/bj3;

    .line 172
    .line 173
    const/16 v0, 0x9

    .line 174
    .line 175
    invoke-direct {p3, v0, p0}, Ldefpackage/bj3;-><init>(ILjava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 179
    .line 180
    .line 181
    return-object p1

    .line 182
    :cond_3
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 183
    .line 184
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    return-object v0

    .line 188
    :cond_4
    :goto_0
    invoke-virtual {p0}, Ldefpackage/zt;->n0()V

    .line 189
    .line 190
    .line 191
    return-object p1
.end method

.method public final R()V
    .locals 9

    .line 1
    invoke-super {p0}, Ldefpackage/pp0;->R()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PodcastChannelBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    new-instance v3, Ldefpackage/cb4;

    .line 13
    .line 14
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Landroid/content/ComponentName;

    .line 19
    .line 20
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

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
    invoke-direct {v3, v0, v1}, Ldefpackage/cb4;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V

    .line 30
    .line 31
    .line 32
    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 33
    .line 34
    new-instance v5, Ldefpackage/aj2;

    .line 35
    .line 36
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Ldefpackage/f35;->x()Landroid/os/Looper;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    new-instance v7, Ldefpackage/bl2;

    .line 44
    .line 45
    invoke-direct {v7, v6}, Ldefpackage/bl2;-><init>(Landroid/os/Looper;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, v3, Ldefpackage/cb4;->a:Ldefpackage/bb4;

    .line 49
    .line 50
    invoke-interface {v0}, Ldefpackage/bb4;->e()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    new-instance v0, Ldefpackage/xc5;

    .line 57
    .line 58
    new-instance v1, Ldefpackage/x7;

    .line 59
    .line 60
    invoke-direct {v1, v2}, Ldefpackage/x7;-><init>(Landroid/content/Context;)V

    .line 61
    .line 62
    .line 63
    new-instance v8, Ldefpackage/fi0;

    .line 64
    .line 65
    invoke-direct {v8, v1}, Ldefpackage/fi0;-><init>(Ldefpackage/x7;)V

    .line 66
    .line 67
    .line 68
    const/4 v1, 0x4

    .line 69
    invoke-direct {v0, v1, v8}, Ldefpackage/xc5;-><init>(ILjava/lang/Object;)V

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
    new-instance v1, Ldefpackage/bj2;

    .line 77
    .line 78
    invoke-direct/range {v1 .. v8}, Ldefpackage/sk2;-><init>(Landroid/content/Context;Ldefpackage/cb4;Landroid/os/Bundle;Ldefpackage/qk2;Landroid/os/Looper;Ldefpackage/bl2;Ldefpackage/xc5;)V

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
    invoke-static {v7, v1, v0}, Ldefpackage/b11;->w(Ldefpackage/bl2;Ldefpackage/bj2;Landroid/os/Handler;)V

    .line 87
    .line 88
    .line 89
    iput-object v7, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PodcastChannelBottomSheetDialog;->D0:Ldefpackage/bl2;

    .line 90
    .line 91
    :cond_1
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PodcastChannelBottomSheetDialog;->D0:Ldefpackage/bl2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Ldefpackage/sk2;->Z0(Ljava/util/concurrent/Future;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-super {p0}, Ldefpackage/pp0;->S()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
