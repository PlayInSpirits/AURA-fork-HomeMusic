.class public final Ldefpackage/b8;
.super Ldefpackage/dw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/widget/Filterable;


# instance fields
.field public final synthetic q:I

.field public final r:Lcom/eddyizm/tempus/interfaces/ClickCallback;

.field public s:Ljava/util/List;

.field public t:Ljava/util/List;

.field public u:Ljava/lang/String;

.field public final v:Landroid/widget/Filter;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;I)V
    .locals 2

    .line 1
    iput p2, p0, Ldefpackage/b8;->q:I

    .line 2
    .line 3
    const-string v0, ""

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ldefpackage/dw3;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance p2, Ldefpackage/o7;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {p2, p0, v1}, Ldefpackage/o7;-><init>(Ldefpackage/dw3;I)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Ldefpackage/b8;->v:Landroid/widget/Filter;

    .line 18
    .line 19
    iput-object p1, p0, Ldefpackage/b8;->r:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 20
    .line 21
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 22
    .line 23
    iput-object p1, p0, Ldefpackage/b8;->t:Ljava/util/List;

    .line 24
    .line 25
    iput-object p1, p0, Ldefpackage/b8;->s:Ljava/util/List;

    .line 26
    .line 27
    iput-object v0, p0, Ldefpackage/b8;->u:Ljava/lang/String;

    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    invoke-direct {p0}, Ldefpackage/dw3;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance p2, Ldefpackage/o7;

    .line 34
    .line 35
    const/4 v1, 0x3

    .line 36
    invoke-direct {p2, p0, v1}, Ldefpackage/o7;-><init>(Ldefpackage/dw3;I)V

    .line 37
    .line 38
    .line 39
    iput-object p2, p0, Ldefpackage/b8;->v:Landroid/widget/Filter;

    .line 40
    .line 41
    iput-object p1, p0, Ldefpackage/b8;->r:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 42
    .line 43
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 44
    .line 45
    iput-object p1, p0, Ldefpackage/b8;->t:Ljava/util/List;

    .line 46
    .line 47
    iput-object p1, p0, Ldefpackage/b8;->s:Ljava/util/List;

    .line 48
    .line 49
    iput-object v0, p0, Ldefpackage/b8;->u:Ljava/lang/String;

    .line 50
    .line 51
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/b8;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/b8;->t:Ljava/util/List;

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
    iget-object p0, p0, Ldefpackage/b8;->t:Ljava/util/List;

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
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(I)J
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/b8;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

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
    :pswitch_0
    int-to-long p0, p1

    .line 12
    return-wide p0

    .line 13
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public c(I)I
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/b8;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ldefpackage/dw3;->c(I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ldefpackage/cx3;I)V
    .locals 4

    .line 1
    iget v0, p0, Ldefpackage/b8;->q:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Ldefpackage/jj;

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/b8;->t:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 16
    .line 17
    iget-object p2, p1, Ldefpackage/jj;->u:Ldefpackage/x12;

    .line 18
    .line 19
    iget-object v0, p2, Ldefpackage/x12;->e:Landroid/widget/TextView;

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getAlbumCount()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-lez v0, :cond_0

    .line 33
    .line 34
    iget-object v0, p2, Ldefpackage/x12;->c:Landroid/widget/TextView;

    .line 35
    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v3, "Album count: "

    .line 39
    .line 40
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getAlbumCount()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    iget-object v0, p2, Ldefpackage/x12;->c:Landroid/widget/TextView;

    .line 59
    .line 60
    const/16 v2, 0x8

    .line 61
    .line 62
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 63
    .line 64
    .line 65
    :goto_0
    iget-object p1, p1, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getCoverArtId()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Ldefpackage/c04;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    if-eqz p0, :cond_1

    .line 80
    .line 81
    invoke-static {}, Ldefpackage/ud3;->t()I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-static {v1, p0}, Ldefpackage/wg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    :cond_1
    const/4 v2, 0x3

    .line 90
    invoke-static {p1, p0, v2, v0, v1}, Ldefpackage/b11;->g(Landroid/content/Context;Ljava/lang/String;ILdefpackage/c04;Ljava/lang/String;)Ldefpackage/vz3;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {}, Ldefpackage/xv0;->b()Ldefpackage/xv0;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p0, p1}, Ldefpackage/vz3;->T(Ldefpackage/xv0;)Ldefpackage/vz3;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {}, Ldefpackage/ud3;->R()Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_2

    .line 107
    .line 108
    invoke-virtual {p0}, Ldefpackage/lq;->l()Ldefpackage/lq;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    check-cast p0, Ldefpackage/vz3;

    .line 113
    .line 114
    :cond_2
    iget-object p1, p2, Ldefpackage/x12;->b:Landroid/widget/ImageView;

    .line 115
    .line 116
    invoke-virtual {p0, p1}, Ldefpackage/vz3;->K(Landroid/widget/ImageView;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :pswitch_0
    check-cast p1, Ldefpackage/a8;

    .line 121
    .line 122
    iget-object p0, p0, Ldefpackage/b8;->t:Ljava/util/List;

    .line 123
    .line 124
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 129
    .line 130
    iget-object p2, p1, Ldefpackage/a8;->u:Ldefpackage/x12;

    .line 131
    .line 132
    iget-object v0, p2, Ldefpackage/x12;->e:Landroid/widget/TextView;

    .line 133
    .line 134
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getName()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 139
    .line 140
    .line 141
    iget-object v0, p2, Ldefpackage/x12;->c:Landroid/widget/TextView;

    .line 142
    .line 143
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getArtist()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 148
    .line 149
    .line 150
    iget-object p1, p1, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 151
    .line 152
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getCoverArtId()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Ldefpackage/c04;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    if-eqz p0, :cond_3

    .line 165
    .line 166
    invoke-static {}, Ldefpackage/ud3;->t()I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    invoke-static {v1, p0}, Ldefpackage/wg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    :cond_3
    const/4 v2, 0x2

    .line 175
    invoke-static {p1, p0, v2, v0, v1}, Ldefpackage/b11;->g(Landroid/content/Context;Ljava/lang/String;ILdefpackage/c04;Ljava/lang/String;)Ldefpackage/vz3;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-static {}, Ldefpackage/xv0;->b()Ldefpackage/xv0;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    invoke-virtual {p0, p1}, Ldefpackage/vz3;->T(Ldefpackage/xv0;)Ldefpackage/vz3;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-static {}, Ldefpackage/ud3;->R()Z

    .line 188
    .line 189
    .line 190
    move-result p1

    .line 191
    if-eqz p1, :cond_4

    .line 192
    .line 193
    invoke-virtual {p0}, Ldefpackage/lq;->l()Ldefpackage/lq;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    check-cast p0, Ldefpackage/vz3;

    .line 198
    .line 199
    :cond_4
    iget-object p1, p2, Ldefpackage/x12;->b:Landroid/widget/ImageView;

    .line 200
    .line 201
    invoke-virtual {p0, p1}, Ldefpackage/vz3;->K(Landroid/widget/ImageView;)V

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getFilter()Landroid/widget/Filter;
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/b8;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/b8;->v:Landroid/widget/Filter;

    .line 7
    .line 8
    check-cast p0, Ldefpackage/o7;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Ldefpackage/b8;->v:Landroid/widget/Filter;

    .line 12
    .line 13
    check-cast p0, Ldefpackage/o7;

    .line 14
    .line 15
    return-object p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Landroid/view/ViewGroup;I)Ldefpackage/cx3;
    .locals 9

    .line 1
    iget p2, p0, Ldefpackage/b8;->q:I

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
    const p2, 0x7f0d009f

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p2, p1, v2}, Ldefpackage/b11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const p2, 0x7f0a00e8

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    move-object v5, v2

    .line 25
    check-cast v5, Landroid/widget/ImageView;

    .line 26
    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    const p2, 0x7f0a00ea

    .line 30
    .line 31
    .line 32
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

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
    const p2, 0x7f0a00ee

    .line 42
    .line 43
    .line 44
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    move-object v7, v2

    .line 49
    check-cast v7, Landroid/widget/FrameLayout;

    .line 50
    .line 51
    if-eqz v7, :cond_0

    .line 52
    .line 53
    const p2, 0x7f0a00f0

    .line 54
    .line 55
    .line 56
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    move-object v8, v2

    .line 61
    check-cast v8, Landroid/widget/TextView;

    .line 62
    .line 63
    if-eqz v8, :cond_0

    .line 64
    .line 65
    new-instance v3, Ldefpackage/x12;

    .line 66
    .line 67
    move-object v4, p1

    .line 68
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 69
    .line 70
    invoke-direct/range {v3 .. v8}, Ldefpackage/x12;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/FrameLayout;Landroid/widget/TextView;)V

    .line 71
    .line 72
    .line 73
    new-instance v0, Ldefpackage/jj;

    .line 74
    .line 75
    invoke-direct {v0, p0, v3}, Ldefpackage/jj;-><init>(Ldefpackage/b8;Ldefpackage/x12;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :goto_0
    return-object v0

    .line 95
    :pswitch_0
    const p2, 0x7f0d009e

    .line 96
    .line 97
    .line 98
    invoke-static {p1, p2, p1, v2}, Ldefpackage/b11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const p2, 0x7f0a00a3

    .line 103
    .line 104
    .line 105
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    move-object v5, v2

    .line 110
    check-cast v5, Landroid/widget/TextView;

    .line 111
    .line 112
    if-eqz v5, :cond_1

    .line 113
    .line 114
    const p2, 0x7f0a00a9

    .line 115
    .line 116
    .line 117
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    move-object v6, v2

    .line 122
    check-cast v6, Landroid/widget/ImageView;

    .line 123
    .line 124
    if-eqz v6, :cond_1

    .line 125
    .line 126
    const p2, 0x7f0a00b3

    .line 127
    .line 128
    .line 129
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    move-object v7, v2

    .line 134
    check-cast v7, Landroid/widget/FrameLayout;

    .line 135
    .line 136
    if-eqz v7, :cond_1

    .line 137
    .line 138
    const p2, 0x7f0a00bf

    .line 139
    .line 140
    .line 141
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    move-object v8, v2

    .line 146
    check-cast v8, Landroid/widget/TextView;

    .line 147
    .line 148
    if-eqz v8, :cond_1

    .line 149
    .line 150
    new-instance v3, Ldefpackage/x12;

    .line 151
    .line 152
    move-object v4, p1

    .line 153
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 154
    .line 155
    invoke-direct/range {v3 .. v8}, Ldefpackage/x12;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/FrameLayout;Landroid/widget/TextView;)V

    .line 156
    .line 157
    .line 158
    new-instance v0, Ldefpackage/a8;

    .line 159
    .line 160
    invoke-direct {v0, p0, v3}, Ldefpackage/a8;-><init>(Ldefpackage/b8;Ldefpackage/x12;)V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    :goto_1
    return-object v0

    .line 180
    nop

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Ljava/lang/String;)V
    .locals 5

    .line 1
    iget v0, p0, Ldefpackage/b8;->q:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, -0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    sparse-switch v0, :sswitch_data_0

    .line 15
    .line 16
    .line 17
    :goto_0
    move v1, v4

    .line 18
    goto :goto_1

    .line 19
    :sswitch_0
    const-string v0, "ARTIST_ORDER_BY_NAME"

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :sswitch_1
    const-string v0, "ARTIST_ORDER_BY_MOST_RECENTLY_STARRED"

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v1, v2

    .line 38
    goto :goto_1

    .line 39
    :sswitch_2
    const-string v0, "ARTIST_ORDER_BY_LEAST_RECENTLY_STARRED"

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move v1, v3

    .line 49
    :cond_2
    :goto_1
    const/16 p1, 0xb

    .line 50
    .line 51
    packed-switch v1, :pswitch_data_1

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :pswitch_0
    iget-object p1, p0, Ldefpackage/b8;->t:Ljava/util/List;

    .line 56
    .line 57
    new-instance v0, Ldefpackage/m7;

    .line 58
    .line 59
    const/16 v1, 0x9

    .line 60
    .line 61
    invoke-direct {v0, v1}, Ldefpackage/m7;-><init>(I)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-interface {p1, v0}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :pswitch_1
    iget-object v0, p0, Ldefpackage/b8;->t:Ljava/util/List;

    .line 73
    .line 74
    new-instance v1, Ldefpackage/m7;

    .line 75
    .line 76
    invoke-direct {v1, p1}, Ldefpackage/m7;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-static {}, Ljava/util/Comparator;->reverseOrder()Ljava/util/Comparator;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-static {p1}, Ljava/util/Comparator;->nullsLast(Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {v1, p1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-interface {v0, p1}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :pswitch_2
    iget-object v0, p0, Ldefpackage/b8;->t:Ljava/util/List;

    .line 96
    .line 97
    new-instance v1, Ldefpackage/m7;

    .line 98
    .line 99
    invoke-direct {v1, p1}, Ldefpackage/m7;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-static {}, Ljava/util/Comparator;->naturalOrder()Ljava/util/Comparator;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-static {p1}, Ljava/util/Comparator;->nullsLast(Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-static {v1, p1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-interface {v0, p1}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    .line 115
    .line 116
    .line 117
    :goto_2
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    sparse-switch v0, :sswitch_data_1

    .line 126
    .line 127
    .line 128
    :goto_3
    move v1, v4

    .line 129
    goto :goto_4

    .line 130
    :sswitch_3
    const-string v0, "ALBUM_ORDER_BY_MOST_RECENTLY_STARRED"

    .line 131
    .line 132
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-nez p1, :cond_5

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :sswitch_4
    const-string v0, "ALBUM_ORDER_BY_LEAST_RECENTLY_STARRED"

    .line 140
    .line 141
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    if-nez p1, :cond_3

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_3
    move v1, v2

    .line 149
    goto :goto_4

    .line 150
    :sswitch_5
    const-string v0, "ALBUM_ORDER_BY_NAME"

    .line 151
    .line 152
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    if-nez p1, :cond_4

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_4
    move v1, v3

    .line 160
    :cond_5
    :goto_4
    const/4 p1, 0x7

    .line 161
    packed-switch v1, :pswitch_data_2

    .line 162
    .line 163
    .line 164
    goto :goto_5

    .line 165
    :pswitch_4
    iget-object v0, p0, Ldefpackage/b8;->t:Ljava/util/List;

    .line 166
    .line 167
    new-instance v1, Ldefpackage/m7;

    .line 168
    .line 169
    invoke-direct {v1, p1}, Ldefpackage/m7;-><init>(I)V

    .line 170
    .line 171
    .line 172
    invoke-static {}, Ljava/util/Comparator;->reverseOrder()Ljava/util/Comparator;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-static {p1}, Ljava/util/Comparator;->nullsLast(Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-static {v1, p1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-interface {v0, p1}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    .line 185
    .line 186
    .line 187
    goto :goto_5

    .line 188
    :pswitch_5
    iget-object v0, p0, Ldefpackage/b8;->t:Ljava/util/List;

    .line 189
    .line 190
    new-instance v1, Ldefpackage/m7;

    .line 191
    .line 192
    invoke-direct {v1, p1}, Ldefpackage/m7;-><init>(I)V

    .line 193
    .line 194
    .line 195
    invoke-static {}, Ljava/util/Comparator;->naturalOrder()Ljava/util/Comparator;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    invoke-static {p1}, Ljava/util/Comparator;->nullsLast(Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    invoke-static {v1, p1}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    invoke-interface {v0, p1}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    .line 208
    .line 209
    .line 210
    goto :goto_5

    .line 211
    :pswitch_6
    iget-object p1, p0, Ldefpackage/b8;->t:Ljava/util/List;

    .line 212
    .line 213
    new-instance v0, Ldefpackage/m7;

    .line 214
    .line 215
    const/4 v1, 0x6

    .line 216
    invoke-direct {v0, v1}, Ldefpackage/m7;-><init>(I)V

    .line 217
    .line 218
    .line 219
    invoke-static {v0}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    invoke-interface {p1, v0}, Ljava/util/List;->sort(Ljava/util/Comparator;)V

    .line 224
    .line 225
    .line 226
    :goto_5
    invoke-virtual {p0}, Ldefpackage/dw3;->d()V

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    nop

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
    .end packed-switch

    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    :sswitch_data_0
    .sparse-switch
        -0x619421e3 -> :sswitch_2
        -0x5d62d7fb -> :sswitch_1
        0x6186c66a -> :sswitch_0
    .end sparse-switch

    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    :sswitch_data_1
    .sparse-switch
        -0x21f1748e -> :sswitch_5
        0x31bf7125 -> :sswitch_4
        0x4c8713fd -> :sswitch_3
    .end sparse-switch

    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method
