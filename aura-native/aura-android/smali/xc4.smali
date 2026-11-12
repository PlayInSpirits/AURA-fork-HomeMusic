.class public Lxc4;
.super Lpp0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public B0:Lns3;

.field public C0:Lcom/eddyizm/tempus/viewmodel/b;

.field public D0:Lrc4;

.field public E0:Lxh2;

.field public F0:Ljava/lang/String;

.field public G0:Ljava/lang/String;

.field public H0:J


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
    iput-object v0, p0, Lxc4;->B0:Lns3;

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
    iget-object v0, p0, Lxc4;->D0:Lrc4;

    .line 5
    .line 6
    iget-object v0, v0, Lrc4;->d:Lcom/eddyizm/tempus/subsonic/models/Share;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lxc4;->B0:Lns3;

    .line 11
    .line 12
    iget-object v1, v1, Lns3;->p:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Share;->getDescription()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, p0, Lxc4;->D0:Lrc4;

    .line 24
    .line 25
    iget-object v0, v0, Lrc4;->d:Lcom/eddyizm/tempus/subsonic/models/Share;

    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Share;->getExpires()Ljava/util/Date;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    iput-wide v0, p0, Lxc4;->H0:J

    .line 36
    .line 37
    iget-object v0, p0, Lxc4;->B0:Lns3;

    .line 38
    .line 39
    iget-object v0, v0, Lns3;->q:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 42
    .line 43
    new-instance v1, Ljava/util/Date;

    .line 44
    .line 45
    iget-wide v2, p0, Lxc4;->H0:J

    .line 46
    .line 47
    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    .line 48
    .line 49
    .line 50
    invoke-static {v1}, Lg12;->x(Ljava/util/Date;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lxc4;->B0:Lns3;

    .line 58
    .line 59
    iget-object v0, v0, Lns3;->q:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    invoke-virtual {v0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lxc4;->B0:Lns3;

    .line 68
    .line 69
    iget-object v0, v0, Lns3;->q:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 72
    .line 73
    const/4 v2, 0x0

    .line 74
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lxc4;->B0:Lns3;

    .line 78
    .line 79
    iget-object v0, v0, Lns3;->q:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 82
    .line 83
    new-instance v2, Lvc4;

    .line 84
    .line 85
    invoke-direct {v2, p0, v1}, Lvc4;-><init>(Lxc4;I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 89
    .line 90
    .line 91
    iget-object v0, p0, Lpp0;->w0:Landroid/app/Dialog;

    .line 92
    .line 93
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    check-cast v0, Lf9;

    .line 97
    .line 98
    const/4 v1, -0x1

    .line 99
    invoke-virtual {v0, v1}, Lf9;->i(I)Landroid/widget/Button;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    new-instance v1, Lvc4;

    .line 104
    .line 105
    const/4 v2, 0x1

    .line 106
    invoke-direct {v1, p0, v2}, Lvc4;-><init>(Lxc4;I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final j0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 6

    .line 1
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Ll70;->d()Le75;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p1}, Lgh0;->r(Lf75;)Lb75;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {p1, v1}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v2, Lbq4;

    .line 18
    .line 19
    invoke-direct {v2, v0, v1, p1}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 20
    .line 21
    .line 22
    const-class p1, Lcom/eddyizm/tempus/viewmodel/b;

    .line 23
    .line 24
    invoke-static {p1}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Li30;->b()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v1, 0x0

    .line 33
    const-string v3, "Local and anonymous classes can not be ViewModels"

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    const-string v4, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 38
    .line 39
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {v2, p1, v0}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    check-cast p1, Lcom/eddyizm/tempus/viewmodel/b;

    .line 48
    .line 49
    iput-object p1, p0, Lxc4;->C0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 50
    .line 51
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Ll70;->d()Le75;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {p1}, Lgh0;->r(Lf75;)Lb75;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {p1, v2}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    new-instance v5, Lbq4;

    .line 68
    .line 69
    invoke-direct {v5, v0, v2, p1}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 70
    .line 71
    .line 72
    const-class p1, Lrc4;

    .line 73
    .line 74
    invoke-static {p1}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Li30;->b()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    if-eqz v0, :cond_1

    .line 83
    .line 84
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v5, p1, v0}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    check-cast p1, Lrc4;

    .line 93
    .line 94
    iput-object p1, p0, Lxc4;->D0:Lrc4;

    .line 95
    .line 96
    invoke-virtual {p0}, Lkc1;->o()Landroid/view/LayoutInflater;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    const v0, 0x7f0d004e

    .line 101
    .line 102
    .line 103
    const/4 v2, 0x0

    .line 104
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    const v0, 0x7f0a0573

    .line 109
    .line 110
    .line 111
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    check-cast v3, Lcom/google/android/material/textfield/TextInputEditText;

    .line 116
    .line 117
    if-eqz v3, :cond_0

    .line 118
    .line 119
    const v0, 0x7f0a0574

    .line 120
    .line 121
    .line 122
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    check-cast v4, Lcom/google/android/material/textfield/TextInputEditText;

    .line 127
    .line 128
    if-eqz v4, :cond_0

    .line 129
    .line 130
    new-instance v0, Lns3;

    .line 131
    .line 132
    check-cast p1, Landroid/widget/LinearLayout;

    .line 133
    .line 134
    const/4 v1, 0x3

    .line 135
    invoke-direct {v0, p1, v3, v4, v1}, Lns3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 136
    .line 137
    .line 138
    iput-object v0, p0, Lxc4;->B0:Lns3;

    .line 139
    .line 140
    new-instance p1, Lvg2;

    .line 141
    .line 142
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-direct {p1, v0, v2}, Lvg2;-><init>(Landroid/content/Context;I)V

    .line 147
    .line 148
    .line 149
    iget-object p0, p0, Lxc4;->B0:Lns3;

    .line 150
    .line 151
    iget-object p0, p0, Lns3;->o:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast p0, Landroid/widget/LinearLayout;

    .line 154
    .line 155
    invoke-virtual {p1, p0}, Lvg2;->q(Landroid/view/View;)Lvg2;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    const p1, 0x7f13052b

    .line 160
    .line 161
    .line 162
    invoke-virtual {p0, p1}, Lvg2;->p(I)V

    .line 163
    .line 164
    .line 165
    new-instance p1, Lwr;

    .line 166
    .line 167
    invoke-direct {p1, v1}, Lwr;-><init>(I)V

    .line 168
    .line 169
    .line 170
    const v0, 0x7f13052a

    .line 171
    .line 172
    .line 173
    invoke-virtual {p0, v0, p1}, Lvg2;->l(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    new-instance p1, Lwr;

    .line 178
    .line 179
    const/16 v0, 0xd

    .line 180
    .line 181
    invoke-direct {p1, v0}, Lwr;-><init>(I)V

    .line 182
    .line 183
    .line 184
    const v0, 0x7f130529

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0, v0, p1}, Lvg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    invoke-virtual {p0}, Lvg2;->create()Lf9;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    return-object p0

    .line 196
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    const-string p1, "Missing required view with ID: "

    .line 205
    .line 206
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    return-object v1

    .line 214
    :cond_1
    invoke-static {v3}, Lkf2;->n(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    return-object v1

    .line 218
    :cond_2
    invoke-static {v3}, Lkf2;->n(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    return-object v1
.end method
