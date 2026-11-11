.class public final Lvq0;
.super Ldw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final q:Lcp1;

.field public r:Ljava/util/List;

.field public s:I

.field public t:I


# direct methods
.method public constructor <init>(Lcp1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldw3;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x320

    .line 5
    .line 6
    iput v0, p0, Lvq0;->s:I

    .line 7
    .line 8
    const/16 v0, 0x190

    .line 9
    .line 10
    iput v0, p0, Lvq0;->t:I

    .line 11
    .line 12
    iput-object p1, p0, Lvq0;->q:Lcp1;

    .line 13
    .line 14
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 15
    .line 16
    iput-object p1, p0, Lvq0;->r:Ljava/util/List;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Lvq0;->r:Ljava/util/List;

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
    .locals 3

    .line 1
    check-cast p1, Luq0;

    .line 2
    .line 3
    iget-object v0, p1, Luq0;->u:Lna4;

    .line 4
    .line 5
    iget-object v1, v0, Lna4;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/widget/ImageView;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, p0, Lvq0;->s:I

    .line 14
    .line 15
    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 16
    .line 17
    iget v2, p0, Lvq0;->t:I

    .line 18
    .line 19
    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 20
    .line 21
    iget-object v2, v0, Lna4;->p:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Landroid/widget/ImageView;

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lvq0;->r:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 35
    .line 36
    iget-object p2, v0, Lna4;->q:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p2, Landroid/widget/TextView;

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    iget-object p2, v0, Lna4;->o:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p2, Landroid/widget/TextView;

    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p1, Lcx3;->a:Landroid/view/View;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 69
    .line 70
    .line 71
    move-result-object p2

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
    goto :goto_0

    .line 83
    :cond_0
    const/4 v1, 0x0

    .line 84
    :goto_0
    const/16 v2, 0x9

    .line 85
    .line 86
    invoke-static {p1, p0, v2, p2, v1}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-virtual {p0, p1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-static {}, Lud3;->R()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_1

    .line 103
    .line 104
    invoke-virtual {p0}, Llq;->l()Llq;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    check-cast p0, Lvz3;

    .line 109
    .line 110
    :cond_1
    iget-object p1, v0, Lna4;->p:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p1, Landroid/widget/ImageView;

    .line 113
    .line 114
    invoke-virtual {p0, p1}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public final i(Landroid/view/ViewGroup;I)Lcx3;
    .locals 6

    .line 1
    const p2, 0x7f0d0098

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
    const v0, 0x7f0a00ab

    .line 10
    .line 11
    .line 12
    invoke-static {p2, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Landroid/widget/TextView;

    .line 17
    .line 18
    if-eqz v1, :cond_6

    .line 19
    .line 20
    const v0, 0x7f0a01ba

    .line 21
    .line 22
    .line 23
    invoke-static {p2, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Landroid/widget/ImageView;

    .line 28
    .line 29
    if-eqz v2, :cond_6

    .line 30
    .line 31
    const v0, 0x7f0a0613

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
    if-eqz v3, :cond_6

    .line 41
    .line 42
    new-instance v0, Lna4;

    .line 43
    .line 44
    check-cast p2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 45
    .line 46
    invoke-direct {v0, p2, v1, v2, v3}, Lna4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

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
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iget v2, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 69
    .line 70
    int-to-float v2, v2

    .line 71
    iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 72
    .line 73
    int-to-float v1, v1

    .line 74
    invoke-static {}, Lud3;->I()I

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    const/4 v4, 0x6

    .line 79
    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    const/4 v5, 0x2

    .line 84
    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    .line 85
    .line 86
    .line 87
    move-result v3

    .line 88
    const/4 v5, 0x3

    .line 89
    if-eq v3, v5, :cond_3

    .line 90
    .line 91
    const/4 v5, 0x4

    .line 92
    if-eq v3, v5, :cond_2

    .line 93
    .line 94
    const/4 v5, 0x5

    .line 95
    if-eq v3, v5, :cond_1

    .line 96
    .line 97
    if-eq v3, v4, :cond_0

    .line 98
    .line 99
    const/high16 v3, 0x3f800000    # 1.0f

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_0
    const/high16 v3, 0x40000000    # 2.0f

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_1
    const/high16 v3, 0x3fe00000    # 1.75f

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_2
    const/high16 v3, 0x3fc00000    # 1.5f

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_3
    const/high16 v3, 0x3fa00000    # 1.25f

    .line 112
    .line 113
    :goto_0
    invoke-static {v2, v1}, Ljava/lang/Math;->min(FF)F

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    div-float/2addr v1, v3

    .line 118
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    add-int/lit8 v1, v1, -0x32

    .line 123
    .line 124
    iput v1, p2, Lut4;->f:I

    .line 125
    .line 126
    int-to-float v1, v1

    .line 127
    const v2, 0x3f19999a    # 0.6f

    .line 128
    .line 129
    .line 130
    mul-float/2addr v1, v2

    .line 131
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    iput v1, p2, Lut4;->g:I

    .line 136
    .line 137
    const/4 v1, 0x1

    .line 138
    iput-boolean v1, p2, Lut4;->j:Z

    .line 139
    .line 140
    invoke-static {}, Lut4;->c()Lut4;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    iget-boolean v2, p2, Lut4;->j:Z

    .line 149
    .line 150
    if-nez v2, :cond_4

    .line 151
    .line 152
    invoke-virtual {p2, v1}, Lut4;->b(Landroid/content/Context;)V

    .line 153
    .line 154
    .line 155
    :cond_4
    iget p2, p2, Lut4;->f:I

    .line 156
    .line 157
    iput p2, p0, Lvq0;->s:I

    .line 158
    .line 159
    invoke-static {}, Lut4;->c()Lut4;

    .line 160
    .line 161
    .line 162
    move-result-object p2

    .line 163
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    iget-boolean v1, p2, Lut4;->j:Z

    .line 168
    .line 169
    if-nez v1, :cond_5

    .line 170
    .line 171
    invoke-virtual {p2, p1}, Lut4;->b(Landroid/content/Context;)V

    .line 172
    .line 173
    .line 174
    :cond_5
    iget p1, p2, Lut4;->g:I

    .line 175
    .line 176
    iput p1, p0, Lvq0;->t:I

    .line 177
    .line 178
    new-instance p1, Luq0;

    .line 179
    .line 180
    invoke-direct {p1, p0, v0}, Luq0;-><init>(Lvq0;Lna4;)V

    .line 181
    .line 182
    .line 183
    return-object p1

    .line 184
    :cond_6
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    const-string p1, "Missing required view with ID: "

    .line 193
    .line 194
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    const/4 p0, 0x0

    .line 202
    return-object p0
.end method

.method public final l(Lcx3;)V
    .locals 2

    .line 1
    check-cast p1, Luq0;

    .line 2
    .line 3
    iget-object p0, p1, Luq0;->u:Lna4;

    .line 4
    .line 5
    iget-object p0, p0, Lna4;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/widget/ImageView;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-wide/16 v0, 0x4e20

    .line 14
    .line 15
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-wide/16 v0, 0xa

    .line 20
    .line 21
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewPropertyAnimator;->setStartDelay(J)Landroid/view/ViewPropertyAnimator;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance p1, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 26
    .line 27
    invoke-direct {p1}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const p1, 0x3fb33333    # 1.4f

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final m(Lcx3;)V
    .locals 0

    .line 1
    check-cast p1, Luq0;

    .line 2
    .line 3
    iget-object p0, p1, Luq0;->u:Lna4;

    .line 4
    .line 5
    iget-object p0, p0, Lna4;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Landroid/widget/ImageView;

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 14
    .line 15
    .line 16
    return-void
.end method
