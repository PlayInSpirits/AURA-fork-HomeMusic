.class public Lou3;
.super Lpp0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public B0:Lwo0;

.field public C0:Lpu3;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lpp0;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final J()V
    .locals 1

    .line 1
    invoke-super {p0}, Lpp0;->J()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lou3;->B0:Lwo0;

    .line 6
    .line 7
    return-void
.end method

.method public final R()V
    .locals 4

    .line 1
    invoke-super {p0}, Lpp0;->R()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lkc1;->Y()Landroid/os/Bundle;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "TRACK_OBJECT"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lou3;->C0:Lpu3;

    .line 18
    .line 19
    invoke-virtual {p0}, Lkc1;->Y()Landroid/os/Bundle;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 28
    .line 29
    iput-object v1, v0, Lpu3;->f:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 30
    .line 31
    iput-object v2, v0, Lpu3;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 32
    .line 33
    iput-object v2, v0, Lpu3;->h:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-virtual {p0}, Lkc1;->Y()Landroid/os/Bundle;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    const-string v1, "ALBUM_OBJECT"

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    iget-object v0, p0, Lou3;->C0:Lpu3;

    .line 49
    .line 50
    invoke-virtual {p0}, Lkc1;->Y()Landroid/os/Bundle;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v3, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 59
    .line 60
    iput-object v2, v0, Lpu3;->f:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 61
    .line 62
    iput-object v1, v0, Lpu3;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 63
    .line 64
    iput-object v2, v0, Lpu3;->h:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_1
    invoke-virtual {p0}, Lkc1;->Y()Landroid/os/Bundle;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const-string v1, "ARTIST_OBJECT"

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    iget-object v0, p0, Lou3;->C0:Lpu3;

    .line 80
    .line 81
    invoke-virtual {p0}, Lkc1;->Y()Landroid/os/Bundle;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v3, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 90
    .line 91
    iput-object v2, v0, Lpu3;->f:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 92
    .line 93
    iput-object v2, v0, Lpu3;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 94
    .line 95
    iput-object v1, v0, Lpu3;->h:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 96
    .line 97
    :cond_2
    :goto_0
    iget-object v0, p0, Lou3;->C0:Lpu3;

    .line 98
    .line 99
    iget-object v1, v0, Lpu3;->f:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 100
    .line 101
    if-eqz v1, :cond_3

    .line 102
    .line 103
    iget-object v0, v0, Lpu3;->c:Lxi4;

    .line 104
    .line 105
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-static {v1}, Lxi4;->r(Ljava/lang/String;)Lk03;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    new-instance v1, Lnu3;

    .line 117
    .line 118
    const/4 v2, 0x0

    .line 119
    invoke-direct {v1, p0, v2}, Lnu3;-><init>(Lou3;I)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0, p0, v1}, Lad2;->e(Lba2;La83;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_3
    iget-object v1, v0, Lpu3;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 127
    .line 128
    if-eqz v1, :cond_4

    .line 129
    .line 130
    iget-object v0, v0, Lpu3;->d:Lrv2;

    .line 131
    .line 132
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-static {v1}, Lrv2;->j(Ljava/lang/String;)Lk03;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    new-instance v1, Lnu3;

    .line 144
    .line 145
    const/4 v2, 0x1

    .line 146
    invoke-direct {v1, p0, v2}, Lnu3;-><init>(Lou3;I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0, p0, v1}, Lad2;->e(Lba2;La83;)V

    .line 150
    .line 151
    .line 152
    return-void

    .line 153
    :cond_4
    iget-object v1, v0, Lpu3;->h:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 154
    .line 155
    if-eqz v1, :cond_5

    .line 156
    .line 157
    iget-object v0, v0, Lpu3;->e:Lpa;

    .line 158
    .line 159
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-static {v1}, Lpa;->v(Ljava/lang/String;)Lk03;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    new-instance v1, Lnu3;

    .line 171
    .line 172
    const/4 v2, 0x2

    .line 173
    invoke-direct {v1, p0, v2}, Lnu3;-><init>(Lou3;I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, p0, v1}, Lad2;->e(Lba2;La83;)V

    .line 177
    .line 178
    .line 179
    :cond_5
    return-void
.end method

.method public final j0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lkc1;->o()Landroid/view/LayoutInflater;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const v0, 0x7f0d004b

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const v0, 0x7f0a050a

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Landroid/widget/RatingBar;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    new-instance v0, Lwo0;

    .line 26
    .line 27
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 28
    .line 29
    invoke-direct {v0, p1, v3}, Lwo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lou3;->B0:Lwo0;

    .line 33
    .line 34
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ll70;->d()Le75;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {p1}, Lgh0;->r(Lf75;)Lb75;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-static {p1, v3}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    new-instance v4, Lbq4;

    .line 51
    .line 52
    invoke-direct {v4, v0, v3, p1}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 53
    .line 54
    .line 55
    const-class p1, Lpu3;

    .line 56
    .line 57
    invoke-static {p1}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, Li30;->b()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-eqz v0, :cond_0

    .line 66
    .line 67
    const-string v1, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 68
    .line 69
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v4, p1, v0}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, Lpu3;

    .line 78
    .line 79
    iput-object p1, p0, Lou3;->C0:Lpu3;

    .line 80
    .line 81
    new-instance p1, Lvg2;

    .line 82
    .line 83
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-direct {p1, v0, v2}, Lvg2;-><init>(Landroid/content/Context;I)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Lou3;->B0:Lwo0;

    .line 91
    .line 92
    iget-object v0, v0, Lwo0;->n:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 95
    .line 96
    invoke-virtual {p1, v0}, Lvg2;->q(Landroid/view/View;)Lvg2;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    const v0, 0x7f130446

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v0}, Lvg2;->p(I)V

    .line 104
    .line 105
    .line 106
    new-instance v0, Lwr;

    .line 107
    .line 108
    const/16 v1, 0xa

    .line 109
    .line 110
    invoke-direct {v0, v1}, Lwr;-><init>(I)V

    .line 111
    .line 112
    .line 113
    const v1, 0x7f130444

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1, v1, v0}, Lvg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    new-instance v0, Lvr;

    .line 121
    .line 122
    const/4 v1, 0x7

    .line 123
    invoke-direct {v0, v1, p0}, Lvr;-><init>(ILjava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    const p0, 0x7f130445

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, p0, v0}, Lvg2;->l(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-virtual {p0}, Lvg2;->create()Lf9;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    return-object p0

    .line 138
    :cond_0
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 139
    .line 140
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return-object v1

    .line 144
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    const-string p1, "Missing required view with ID: "

    .line 153
    .line 154
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    return-object v1
.end method
