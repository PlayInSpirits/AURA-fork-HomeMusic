.class public final Lus0;
.super Lpp0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic B0:I

.field public final C0:Lcom/eddyizm/tempus/interfaces/DialogClickCallback;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/interfaces/DialogClickCallback;I)V
    .locals 0

    .line 1
    iput p2, p0, Lus0;->B0:I

    .line 2
    .line 3
    invoke-direct {p0}, Lpp0;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lus0;->C0:Lcom/eddyizm/tempus/interfaces/DialogClickCallback;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final P()V
    .locals 6

    .line 1
    iget v0, p0, Lus0;->B0:I

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, -0x1

    .line 6
    const/4 v4, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iput-boolean v4, p0, Lkc1;->R:Z

    .line 11
    .line 12
    iget-object v0, p0, Lpp0;->w0:Landroid/app/Dialog;

    .line 13
    .line 14
    check-cast v0, Lf9;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0, v3}, Lf9;->i(I)Landroid/widget/Button;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    new-instance v5, Lkm4;

    .line 23
    .line 24
    invoke-direct {v5, p0, v0, v2}, Lkm4;-><init>(Lus0;Lf9;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lf9;->i(I)Landroid/widget/Button;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    new-instance v2, Lkm4;

    .line 35
    .line 36
    invoke-direct {v2, p0, v0, v4}, Lkm4;-><init>(Lus0;Lf9;I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void

    .line 43
    :pswitch_0
    iput-boolean v4, p0, Lkc1;->R:Z

    .line 44
    .line 45
    iget-object v0, p0, Lpp0;->w0:Landroid/app/Dialog;

    .line 46
    .line 47
    check-cast v0, Lf9;

    .line 48
    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    invoke-virtual {v0, v3}, Lf9;->i(I)Landroid/widget/Button;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    new-instance v5, Lwt0;

    .line 56
    .line 57
    invoke-direct {v5, p0, v0, v2}, Lwt0;-><init>(Lus0;Lf9;I)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Lf9;->i(I)Landroid/widget/Button;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    new-instance v2, Lwt0;

    .line 68
    .line 69
    invoke-direct {v2, p0, v0, v4}, Lwt0;-><init>(Lus0;Lf9;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 73
    .line 74
    .line 75
    const/4 v1, -0x3

    .line 76
    invoke-virtual {v0, v1}, Lf9;->i(I)Landroid/widget/Button;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    new-instance v2, Lwt0;

    .line 81
    .line 82
    const/4 v3, 0x2

    .line 83
    invoke-direct {v2, p0, v0, v3}, Lwt0;-><init>(Lus0;Lf9;I)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 87
    .line 88
    .line 89
    :cond_1
    return-void

    .line 90
    :pswitch_1
    iput-boolean v4, p0, Lkc1;->R:Z

    .line 91
    .line 92
    iget-object v0, p0, Lpp0;->w0:Landroid/app/Dialog;

    .line 93
    .line 94
    check-cast v0, Lf9;

    .line 95
    .line 96
    if-eqz v0, :cond_2

    .line 97
    .line 98
    invoke-virtual {v0, v3}, Lf9;->i(I)Landroid/widget/Button;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    new-instance v5, Lts0;

    .line 103
    .line 104
    invoke-direct {v5, p0, v0, v2}, Lts0;-><init>(Lus0;Lf9;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Lf9;->i(I)Landroid/widget/Button;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    new-instance v2, Lts0;

    .line 115
    .line 116
    invoke-direct {v2, p0, v0, v4}, Lts0;-><init>(Lus0;Lf9;I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 120
    .line 121
    .line 122
    :cond_2
    return-void

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final j0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 4

    .line 1
    iget p1, p0, Lus0;->B0:I

    .line 2
    .line 3
    const-string v0, "rootView"

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lkc1;->o()Landroid/view/LayoutInflater;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const v3, 0x7f0d0052

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v3, v2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    check-cast p1, Landroid/widget/LinearLayout;

    .line 24
    .line 25
    new-instance v0, Lvg2;

    .line 26
    .line 27
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-direct {v0, p0, v1}, Lvg2;-><init>(Landroid/content/Context;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p1}, Lvg2;->q(Landroid/view/View;)Lvg2;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    const p1, 0x7f13055d

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1}, Lvg2;->p(I)V

    .line 42
    .line 43
    .line 44
    const p1, 0x7f13055e

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1, v2}, Lvg2;->l(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const p1, 0x7f13055f

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1, v2}, Lvg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0}, Lvg2;->create()Lf9;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-static {v0}, Lnz2;->n(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :goto_0
    return-object v2

    .line 67
    :pswitch_0
    invoke-virtual {p0}, Lkc1;->o()Landroid/view/LayoutInflater;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    const v3, 0x7f0d0042

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v3, v2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-eqz p1, :cond_1

    .line 79
    .line 80
    check-cast p1, Landroid/widget/LinearLayout;

    .line 81
    .line 82
    new-instance v0, Lvg2;

    .line 83
    .line 84
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-direct {v0, p0, v1}, Lvg2;-><init>(Landroid/content/Context;I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, p1}, Lvg2;->q(Landroid/view/View;)Lvg2;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    const p1, 0x7f1300ef

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0, p1}, Lvg2;->p(I)V

    .line 99
    .line 100
    .line 101
    const p1, 0x7f1300f1

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, p1, v2}, Lvg2;->l(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    const p1, 0x7f1300f2

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, p1, v2}, Lvg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    const p1, 0x7f1300f0

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, p1, v2}, Lvg2;->k(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Lvg2;->create()Lf9;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    goto :goto_1

    .line 126
    :cond_1
    invoke-static {v0}, Lnz2;->n(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    :goto_1
    return-object v2

    .line 130
    :pswitch_1
    invoke-virtual {p0}, Lkc1;->o()Landroid/view/LayoutInflater;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    const v3, 0x7f0d0041

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, v3, v2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    if-eqz p1, :cond_2

    .line 142
    .line 143
    check-cast p1, Landroid/widget/LinearLayout;

    .line 144
    .line 145
    new-instance v0, Lvg2;

    .line 146
    .line 147
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-direct {v0, p0, v1}, Lvg2;-><init>(Landroid/content/Context;I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, p1}, Lvg2;->q(Landroid/view/View;)Lvg2;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    const p1, 0x7f1300e3

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0, p1}, Lvg2;->p(I)V

    .line 162
    .line 163
    .line 164
    const p1, 0x7f1300e1

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0, p1, v2}, Lvg2;->l(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    const p1, 0x7f1300e0

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0, p1, v2}, Lvg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 175
    .line 176
    .line 177
    move-result-object p0

    .line 178
    invoke-virtual {p0}, Lvg2;->create()Lf9;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    goto :goto_2

    .line 183
    :cond_2
    invoke-static {v0}, Lnz2;->n(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    :goto_2
    return-object v2

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
