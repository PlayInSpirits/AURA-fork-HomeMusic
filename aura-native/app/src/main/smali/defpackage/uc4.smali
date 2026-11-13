.class public final Ldefpackage/uc4;
.super Ldefpackage/dw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic q:I

.field public final r:Ldefpackage/cp1;

.field public s:Ljava/util/List;


# direct methods
.method public constructor <init>(Ldefpackage/cp1;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/uc4;->q:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ldefpackage/dw3;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ldefpackage/uc4;->r:Ldefpackage/cp1;

    .line 10
    .line 11
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 12
    .line 13
    iput-object p1, p0, Ldefpackage/uc4;->s:Ljava/util/List;

    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    invoke-direct {p0}, Ldefpackage/dw3;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Ldefpackage/uc4;->r:Ldefpackage/cp1;

    .line 20
    .line 21
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 22
    .line 23
    iput-object p1, p0, Ldefpackage/uc4;->s:Ljava/util/List;

    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/uc4;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/uc4;->s:Ljava/util/List;

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
    iget-object p0, p0, Ldefpackage/uc4;->s:Ljava/util/List;

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

.method public final g(Ldefpackage/cx3;I)V
    .locals 4

    .line 1
    iget v0, p0, Ldefpackage/uc4;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ldefpackage/he5;

    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/uc4;->s:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iget-object p1, p1, Ldefpackage/he5;->u:Ldefpackage/wo0;

    .line 21
    .line 22
    iget-object p1, p1, Ldefpackage/wo0;->o:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Landroid/widget/TextView;

    .line 25
    .line 26
    invoke-static {p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_0
    check-cast p1, Ldefpackage/tc4;

    .line 35
    .line 36
    iget-object p0, p0, Ldefpackage/uc4;->s:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Share;

    .line 43
    .line 44
    iget-object p2, p1, Ldefpackage/tc4;->u:Ldefpackage/x12;

    .line 45
    .line 46
    iget-object v0, p2, Ldefpackage/x12;->e:Landroid/widget/TextView;

    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Share;->getDescription()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p2, Ldefpackage/x12;->c:Landroid/widget/TextView;

    .line 56
    .line 57
    iget-object p1, p1, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Share;->getExpires()Ljava/util/Date;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {v2}, Ldefpackage/g12;->x(Ljava/util/Date;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    const v3, 0x7f130525

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v3, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Share;->getEntries()Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-eqz v0, :cond_2

    .line 90
    .line 91
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Share;->getEntries()Ljava/util/List;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_2

    .line 100
    .line 101
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Share;->getEntries()Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    const/4 v0, 0x0

    .line 110
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 115
    .line 116
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p1}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Ldefpackage/c04;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    if-eqz p0, :cond_0

    .line 125
    .line 126
    invoke-static {}, Ldefpackage/ud3;->t()I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    invoke-static {v1, p0}, Ldefpackage/wg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    goto :goto_0

    .line 135
    :cond_0
    const/4 v1, 0x0

    .line 136
    :goto_0
    const/4 v2, 0x2

    .line 137
    invoke-static {p1, p0, v2, v0, v1}, Ldefpackage/b11;->g(Landroid/content/Context;Ljava/lang/String;ILdefpackage/c04;Ljava/lang/String;)Ldefpackage/vz3;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-static {}, Ldefpackage/xv0;->b()Ldefpackage/xv0;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p0, p1}, Ldefpackage/vz3;->T(Ldefpackage/xv0;)Ldefpackage/vz3;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-static {}, Ldefpackage/ud3;->R()Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-eqz p1, :cond_1

    .line 154
    .line 155
    invoke-virtual {p0}, Ldefpackage/lq;->l()Ldefpackage/lq;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    check-cast p0, Ldefpackage/vz3;

    .line 160
    .line 161
    :cond_1
    iget-object p1, p2, Ldefpackage/x12;->b:Landroid/widget/ImageView;

    .line 162
    .line 163
    invoke-virtual {p0, p1}, Ldefpackage/vz3;->K(Landroid/widget/ImageView;)V

    .line 164
    .line 165
    .line 166
    :cond_2
    return-void

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Landroid/view/ViewGroup;I)Ldefpackage/cx3;
    .locals 9

    .line 1
    iget p2, p0, Ldefpackage/uc4;->q:I

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
    const p2, 0x7f0d009d

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p2, p1, v2}, Ldefpackage/b11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const p2, 0x7f0a0146

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Landroidx/cardview/widget/CardView;

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    const p2, 0x7f0a066e

    .line 29
    .line 30
    .line 31
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Landroid/widget/TextView;

    .line 36
    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    new-instance p2, Ldefpackage/wo0;

    .line 40
    .line 41
    check-cast p1, Landroid/widget/LinearLayout;

    .line 42
    .line 43
    invoke-direct {p2, p1, v2}, Ldefpackage/wo0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Ldefpackage/he5;

    .line 47
    .line 48
    invoke-direct {v0, p0, p2}, Ldefpackage/he5;-><init>(Ldefpackage/uc4;Ldefpackage/wo0;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :goto_0
    return-object v0

    .line 68
    :pswitch_0
    const p2, 0x7f0d00a6

    .line 69
    .line 70
    .line 71
    invoke-static {p1, p2, p1, v2}, Ldefpackage/b11;->i(Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    const p2, 0x7f0a0571

    .line 76
    .line 77
    .line 78
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    move-object v5, v2

    .line 83
    check-cast v5, Landroid/widget/FrameLayout;

    .line 84
    .line 85
    if-eqz v5, :cond_1

    .line 86
    .line 87
    const p2, 0x7f0a0572

    .line 88
    .line 89
    .line 90
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    move-object v6, v2

    .line 95
    check-cast v6, Landroid/widget/ImageView;

    .line 96
    .line 97
    if-eqz v6, :cond_1

    .line 98
    .line 99
    const p2, 0x7f0a0575

    .line 100
    .line 101
    .line 102
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    move-object v7, v2

    .line 107
    check-cast v7, Landroid/widget/TextView;

    .line 108
    .line 109
    if-eqz v7, :cond_1

    .line 110
    .line 111
    const p2, 0x7f0a0577

    .line 112
    .line 113
    .line 114
    invoke-static {p1, p2}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    move-object v8, v2

    .line 119
    check-cast v8, Landroid/widget/TextView;

    .line 120
    .line 121
    if-eqz v8, :cond_1

    .line 122
    .line 123
    new-instance v3, Ldefpackage/x12;

    .line 124
    .line 125
    move-object v4, p1

    .line 126
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 127
    .line 128
    invoke-direct/range {v3 .. v8}, Ldefpackage/x12;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/FrameLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 129
    .line 130
    .line 131
    new-instance v0, Ldefpackage/tc4;

    .line 132
    .line 133
    invoke-direct {v0, p0, v3}, Ldefpackage/tc4;-><init>(Ldefpackage/uc4;Ldefpackage/x12;)V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :goto_1
    return-object v0

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
