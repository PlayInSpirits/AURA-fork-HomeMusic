.class public final Ll7;
.super Ldw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final q:Lcom/eddyizm/tempus/interfaces/ClickCallback;

.field public r:Ljava/util/List;

.field public final s:Z

.field public t:I


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x190

    .line 5
    .line 6
    iput v0, p0, Ll7;->t:I

    .line 7
    .line 8
    iput-object p1, p0, Ll7;->q:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 9
    .line 10
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 11
    .line 12
    iput-object p1, p0, Ll7;->r:Ljava/util/List;

    .line 13
    .line 14
    iput-boolean p2, p0, Ll7;->s:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Ll7;->r:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final g(Lcx3;I)V
    .locals 6

    .line 1
    check-cast p1, Lk7;

    .line 2
    .line 3
    iget-object v0, p1, Lk7;->u:Lbq4;

    .line 4
    .line 5
    iget-object v1, v0, Lbq4;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, p0, Ll7;->t:I

    .line 14
    .line 15
    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 16
    .line 17
    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 18
    .line 19
    iget-object v2, v0, Lbq4;->o:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 22
    .line 23
    iget-object v3, v0, Lbq4;->q:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Landroid/widget/TextView;

    .line 26
    .line 27
    iget-object v4, v0, Lbq4;->p:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Landroid/widget/TextView;

    .line 30
    .line 31
    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 32
    .line 33
    .line 34
    iget-object v1, p0, Ll7;->r:Ljava/util/List;

    .line 35
    .line 36
    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 41
    .line 42
    const-string v1, "album_year_visible"

    .line 43
    .line 44
    const/4 v2, 0x0

    .line 45
    invoke-static {v1, v2}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_0

    .line 50
    .line 51
    new-instance v1, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v5, " ("

    .line 64
    .line 65
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getYear()I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v5, ")"

    .line 76
    .line 77
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    .line 94
    .line 95
    :goto_0
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getArtist()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 100
    .line 101
    .line 102
    iget-boolean p0, p0, Ll7;->s:Z

    .line 103
    .line 104
    if-eqz p0, :cond_1

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_1
    const/16 v2, 0x8

    .line 108
    .line 109
    :goto_1
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 110
    .line 111
    .line 112
    iget-object p0, p1, Lcx3;->a:Landroid/view/View;

    .line 113
    .line 114
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getCoverArtId()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-static {p0}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    if-eqz p1, :cond_2

    .line 127
    .line 128
    invoke-static {}, Lud3;->t()I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    invoke-static {v1, p1}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    goto :goto_2

    .line 137
    :cond_2
    const/4 v1, 0x0

    .line 138
    :goto_2
    const/4 v2, 0x2

    .line 139
    invoke-static {p0, p1, v2, p2, v1}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-virtual {p0, p1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-static {}, Lud3;->R()Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-eqz p1, :cond_3

    .line 156
    .line 157
    invoke-virtual {p0}, Llq;->l()Llq;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    check-cast p0, Lvz3;

    .line 162
    .line 163
    :cond_3
    iget-object p1, v0, Lbq4;->o:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast p1, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 166
    .line 167
    invoke-virtual {p0, p1}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 168
    .line 169
    .line 170
    return-void
.end method

.method public final i(Landroid/view/ViewGroup;I)Lcx3;
    .locals 4

    .line 1
    const p2, 0x7f0d0092

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {p1, p2, p1, v0}, Lb11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const v0, 0x7f0a00a9

    .line 10
    .line 11
    .line 12
    invoke-static {p2, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    const v0, 0x7f0a00b4

    .line 21
    .line 22
    .line 23
    invoke-static {p2, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Landroid/widget/TextView;

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    const v0, 0x7f0a00ef

    .line 32
    .line 33
    .line 34
    invoke-static {p2, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Landroid/widget/TextView;

    .line 39
    .line 40
    if-eqz v3, :cond_0

    .line 41
    .line 42
    new-instance v0, Lbq4;

    .line 43
    .line 44
    check-cast p2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 45
    .line 46
    invoke-direct {v0, p2, v1, v2, v3}, Lbq4;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lut4;->c()Lut4;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {p2, v1}, Lut4;->b(Landroid/content/Context;)V

    .line 58
    .line 59
    .line 60
    invoke-static {}, Lut4;->c()Lut4;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-virtual {p2, p1}, Lut4;->d(Landroid/content/Context;)I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    iput p1, p0, Ll7;->t:I

    .line 73
    .line 74
    new-instance p1, Lk7;

    .line 75
    .line 76
    invoke-direct {p1, p0, v0}, Lk7;-><init>(Ll7;Lbq4;)V

    .line 77
    .line 78
    .line 79
    return-object p1

    .line 80
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    const-string p1, "Missing required view with ID: "

    .line 89
    .line 90
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    const/4 p0, 0x0

    .line 98
    return-object p0
.end method
