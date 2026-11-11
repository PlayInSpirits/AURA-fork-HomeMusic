.class public final Lq7;
.super Ldw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/widget/Filterable;


# instance fields
.field public final synthetic q:I

.field public final r:Z

.field public s:Ljava/util/List;

.field public t:Ljava/util/List;

.field public final u:Lcom/eddyizm/tempus/interfaces/ClickCallback;

.field public v:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/interfaces/ClickCallback;Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lq7;->q:I

    .line 26
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 27
    iput-object p1, p0, Lq7;->u:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 28
    iput-boolean p2, p0, Lq7;->r:Z

    .line 29
    sget-object p1, Lu01;->n:Lu01;

    iput-object p1, p0, Lq7;->s:Ljava/util/List;

    .line 30
    iput-object p1, p0, Lq7;->t:Ljava/util/List;

    .line 31
    const-string p1, ""

    iput-object p1, p0, Lq7;->v:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lq7;->q:I

    .line 3
    .line 4
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lo7;

    .line 8
    .line 9
    invoke-direct {v1, p0, v0}, Lo7;-><init>(Ldw3;I)V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, Lq7;->v:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object p1, p0, Lq7;->u:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 15
    .line 16
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 17
    .line 18
    iput-object p1, p0, Lq7;->s:Ljava/util/List;

    .line 19
    .line 20
    iput-object p1, p0, Lq7;->t:Ljava/util/List;

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lq7;->r:Z

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Lq7;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lq7;->t:Ljava/util/List;

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
    iget-object p0, p0, Lq7;->s:Ljava/util/List;

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
    iget v0, p0, Lq7;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ldw3;->b(I)J

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
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Lcx3;I)V
    .locals 6

    .line 1
    iget v0, p0, Lq7;->q:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    check-cast p1, Lmo1;

    .line 8
    .line 9
    iget-object p0, p0, Lq7;->t:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 16
    .line 17
    iget-object p2, p1, Lcx3;->a:Landroid/view/View;

    .line 18
    .line 19
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v2, p1, Lmo1;->v:Landroid/widget/TextView;

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    .line 31
    .line 32
    iget-object v2, p1, Lmo1;->w:Landroid/widget/TextView;

    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getSongCount()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getSongCount()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    const v5, 0x7f12000a

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v5, v3, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getCoverArtId()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {p2}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-eqz p0, :cond_0

    .line 73
    .line 74
    invoke-static {}, Lud3;->t()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    invoke-static {v1, p0}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    :cond_0
    const/4 v2, 0x6

    .line 83
    invoke-static {p2, p0, v2, v0, v1}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    invoke-virtual {p0, p2}, Lvz3;->T(Lxv0;)Lvz3;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-static {}, Lud3;->R()Z

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    if-eqz p2, :cond_1

    .line 100
    .line 101
    invoke-virtual {p0}, Llq;->l()Llq;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    check-cast p0, Lvz3;

    .line 106
    .line 107
    :cond_1
    iget-object p1, p1, Lmo1;->u:Landroid/widget/ImageView;

    .line 108
    .line 109
    invoke-virtual {p0, p1}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :pswitch_0
    check-cast p1, Lp7;

    .line 114
    .line 115
    iget-object v0, p0, Lq7;->s:Ljava/util/List;

    .line 116
    .line 117
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 122
    .line 123
    iget-object v0, p1, Lp7;->u:Lss0;

    .line 124
    .line 125
    iget-object v2, v0, Lss0;->p:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v2, Landroid/widget/TextView;

    .line 128
    .line 129
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getName()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 134
    .line 135
    .line 136
    iget-object v2, v0, Lss0;->q:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v2, Landroid/widget/TextView;

    .line 139
    .line 140
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getArtist()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 145
    .line 146
    .line 147
    iget-object v2, v0, Lss0;->q:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v2, Landroid/widget/TextView;

    .line 150
    .line 151
    iget-boolean p0, p0, Lq7;->r:Z

    .line 152
    .line 153
    if-eqz p0, :cond_2

    .line 154
    .line 155
    const/4 p0, 0x0

    .line 156
    goto :goto_0

    .line 157
    :cond_2
    const/16 p0, 0x8

    .line 158
    .line 159
    :goto_0
    invoke-virtual {v2, p0}, Landroid/view/View;->setVisibility(I)V

    .line 160
    .line 161
    .line 162
    iget-object p0, p1, Lcx3;->a:Landroid/view/View;

    .line 163
    .line 164
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getCoverArtId()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-static {p0}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    if-eqz p1, :cond_3

    .line 177
    .line 178
    invoke-static {}, Lud3;->t()I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    invoke-static {v1, p1}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    :cond_3
    const/4 v2, 0x2

    .line 187
    invoke-static {p0, p1, v2, p2, v1}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    invoke-virtual {p0, p1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-static {}, Lud3;->R()Z

    .line 200
    .line 201
    .line 202
    move-result p1

    .line 203
    if-eqz p1, :cond_4

    .line 204
    .line 205
    invoke-virtual {p0}, Llq;->l()Llq;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    check-cast p0, Lvz3;

    .line 210
    .line 211
    :cond_4
    iget-object p1, v0, Lss0;->o:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast p1, Landroid/widget/ImageView;

    .line 214
    .line 215
    invoke-virtual {p0, p1}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getFilter()Landroid/widget/Filter;
    .locals 2

    .line 1
    iget v0, p0, Lq7;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lo7;

    .line 7
    .line 8
    const/4 v1, 0x6

    .line 9
    invoke-direct {v0, p0, v1}, Lo7;-><init>(Ldw3;I)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :pswitch_0
    iget-object p0, p0, Lq7;->v:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lo7;

    .line 16
    .line 17
    return-object p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Landroid/view/ViewGroup;I)Lcx3;
    .locals 7

    .line 1
    iget p2, p0, Lq7;->q:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iget-boolean v0, p0, Lq7;->r:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-static {p2, p1}, Lss0;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lss0;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    new-instance v0, Lmo1;

    .line 23
    .line 24
    iget-object p2, p1, Lss0;->n:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v2, p2

    .line 27
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 28
    .line 29
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    iget-object p2, p1, Lss0;->o:Ljava/lang/Object;

    .line 33
    .line 34
    move-object v3, p2

    .line 35
    check-cast v3, Landroid/widget/ImageView;

    .line 36
    .line 37
    iget-object p2, p1, Lss0;->p:Ljava/lang/Object;

    .line 38
    .line 39
    move-object v4, p2

    .line 40
    check-cast v4, Landroid/widget/TextView;

    .line 41
    .line 42
    iget-object p1, p1, Lss0;->q:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v5, p1

    .line 45
    check-cast v5, Landroid/widget/TextView;

    .line 46
    .line 47
    move-object v1, p0

    .line 48
    invoke-direct/range {v0 .. v5}, Lmo1;-><init>(Lq7;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move-object v1, p0

    .line 53
    invoke-static {p2, p1}, Lbq4;->m(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lbq4;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    iget-object p2, p0, Lbq4;->o:Ljava/lang/Object;

    .line 58
    .line 59
    move-object v4, p2

    .line 60
    check-cast v4, Landroid/widget/ImageView;

    .line 61
    .line 62
    invoke-static {}, Lut4;->c()Lut4;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-virtual {p2, p1}, Lut4;->d(Landroid/content/Context;)I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    iput p1, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 79
    .line 80
    iput p1, p2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 81
    .line 82
    invoke-virtual {v4, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 83
    .line 84
    .line 85
    move-object v2, v1

    .line 86
    new-instance v1, Lmo1;

    .line 87
    .line 88
    iget-object p1, p0, Lbq4;->n:Ljava/lang/Object;

    .line 89
    .line 90
    move-object v3, p1

    .line 91
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-object p1, p0, Lbq4;->p:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v5, p1

    .line 99
    check-cast v5, Landroid/widget/TextView;

    .line 100
    .line 101
    iget-object p0, p0, Lbq4;->q:Ljava/lang/Object;

    .line 102
    .line 103
    move-object v6, p0

    .line 104
    check-cast v6, Landroid/widget/TextView;

    .line 105
    .line 106
    invoke-direct/range {v1 .. v6}, Lmo1;-><init>(Lq7;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 107
    .line 108
    .line 109
    move-object v0, v1

    .line 110
    :goto_0
    return-object v0

    .line 111
    :pswitch_0
    move-object v1, p0

    .line 112
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0, p1}, Lss0;->C(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lss0;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    new-instance p1, Lp7;

    .line 125
    .line 126
    invoke-direct {p1, v1, p0}, Lp7;-><init>(Lq7;Lss0;)V

    .line 127
    .line 128
    .line 129
    return-object p1

    .line 130
    nop

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
