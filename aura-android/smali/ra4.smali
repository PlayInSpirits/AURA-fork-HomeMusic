.class public Lra4;
.super Lpp0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public B0:Ley;

.field public C0:Lse2;

.field public D0:Ljava/lang/String;

.field public E0:Ljava/lang/String;

.field public F0:Ljava/lang/String;

.field public G0:Ljava/lang/String;

.field public H0:Ljava/lang/String;

.field public I0:Z

.field public J0:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lpp0;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lra4;->I0:Z

    .line 6
    .line 7
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
    iput-object v0, p0, Lra4;->B0:Ley;

    .line 6
    .line 7
    return-void
.end method

.method public final R()V
    .locals 5

    .line 1
    invoke-super {p0}, Lpp0;->R()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkc1;->s:Landroid/os/Bundle;

    .line 5
    .line 6
    iget-object v1, p0, Lra4;->C0:Lse2;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lkc1;->Y()Landroid/os/Bundle;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v2, "server_object"

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/eddyizm/tempus/model/Server;

    .line 21
    .line 22
    iput-object v0, v1, Lse2;->d:Lcom/eddyizm/tempus/model/Server;

    .line 23
    .line 24
    iget-object v0, p0, Lra4;->C0:Lse2;

    .line 25
    .line 26
    iget-object v0, v0, Lse2;->d:Lcom/eddyizm/tempus/model/Server;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    iget-object v1, p0, Lra4;->B0:Ley;

    .line 31
    .line 32
    iget-object v1, v1, Ley;->f:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/eddyizm/tempus/model/Server;->getServerName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lra4;->B0:Ley;

    .line 44
    .line 45
    iget-object v0, v0, Ley;->h:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 48
    .line 49
    iget-object v1, p0, Lra4;->C0:Lse2;

    .line 50
    .line 51
    iget-object v1, v1, Lse2;->d:Lcom/eddyizm/tempus/model/Server;

    .line 52
    .line 53
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getUsername()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lra4;->B0:Ley;

    .line 61
    .line 62
    iget-object v0, v0, Ley;->e:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 65
    .line 66
    const-string v1, ""

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    .line 70
    .line 71
    iget-object v0, p0, Lra4;->B0:Ley;

    .line 72
    .line 73
    iget-object v0, v0, Ley;->g:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 76
    .line 77
    iget-object v1, p0, Lra4;->C0:Lse2;

    .line 78
    .line 79
    iget-object v1, v1, Lse2;->d:Lcom/eddyizm/tempus/model/Server;

    .line 80
    .line 81
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getAddress()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Lra4;->B0:Ley;

    .line 89
    .line 90
    iget-object v0, v0, Ley;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 93
    .line 94
    iget-object v1, p0, Lra4;->C0:Lse2;

    .line 95
    .line 96
    iget-object v1, v1, Lse2;->d:Lcom/eddyizm/tempus/model/Server;

    .line 97
    .line 98
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getLocalAddress()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 103
    .line 104
    .line 105
    iget-object v0, p0, Lra4;->B0:Ley;

    .line 106
    .line 107
    iget-object v0, v0, Ley;->d:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, Landroid/widget/CheckBox;

    .line 110
    .line 111
    iget-object v1, p0, Lra4;->C0:Lse2;

    .line 112
    .line 113
    iget-object v1, v1, Lse2;->d:Lcom/eddyizm/tempus/model/Server;

    .line 114
    .line 115
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->isLowSecurity()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 120
    .line 121
    .line 122
    iget-object v0, p0, Lra4;->B0:Ley;

    .line 123
    .line 124
    iget-object v0, v0, Ley;->b:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 127
    .line 128
    iget-object v1, p0, Lra4;->C0:Lse2;

    .line 129
    .line 130
    iget-object v1, v1, Lse2;->d:Lcom/eddyizm/tempus/model/Server;

    .line 131
    .line 132
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getClientCert()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_0
    const/4 v0, 0x0

    .line 141
    iput-object v0, v1, Lse2;->d:Lcom/eddyizm/tempus/model/Server;

    .line 142
    .line 143
    :cond_1
    :goto_0
    iget-object v0, p0, Lpp0;->w0:Landroid/app/Dialog;

    .line 144
    .line 145
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    check-cast v0, Lf9;

    .line 149
    .line 150
    const/4 v1, -0x1

    .line 151
    invoke-virtual {v0, v1}, Lf9;->i(I)Landroid/widget/Button;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    new-instance v2, Lpa4;

    .line 156
    .line 157
    const/4 v3, 0x1

    .line 158
    invoke-direct {v2, p0, v3}, Lpa4;-><init>(Lra4;I)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 162
    .line 163
    .line 164
    const/4 v1, -0x3

    .line 165
    invoke-virtual {v0, v1}, Lf9;->i(I)Landroid/widget/Button;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    new-instance v3, Lpa4;

    .line 170
    .line 171
    const/4 v4, 0x2

    .line 172
    invoke-direct {v3, p0, v4}, Lpa4;-><init>(Lra4;I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v1}, Lf9;->i(I)Landroid/widget/Button;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    new-instance v1, Lq6;

    .line 183
    .line 184
    const/16 v2, 0x14

    .line 185
    .line 186
    invoke-direct {v1, v2, p0}, Lq6;-><init>(ILjava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 190
    .line 191
    .line 192
    return-void
.end method

.method public final j0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 13

    .line 1
    invoke-virtual {p0}, Lkc1;->o()Landroid/view/LayoutInflater;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const v0, 0x7f0d004c

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
    const v0, 0x7f0a0157

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Lcom/google/android/material/textfield/TextInputLayout;

    .line 22
    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    const v0, 0x7f0a0158

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    move-object v6, v3

    .line 33
    check-cast v6, Lcom/google/android/material/textfield/TextInputEditText;

    .line 34
    .line 35
    if-eqz v6, :cond_1

    .line 36
    .line 37
    const v0, 0x7f0a02bd

    .line 38
    .line 39
    .line 40
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Landroidx/core/widget/NestedScrollView;

    .line 45
    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    const v0, 0x7f0a0348

    .line 49
    .line 50
    .line 51
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    move-object v7, v3

    .line 56
    check-cast v7, Lcom/google/android/material/textfield/TextInputEditText;

    .line 57
    .line 58
    if-eqz v7, :cond_1

    .line 59
    .line 60
    const v0, 0x7f0a034b

    .line 61
    .line 62
    .line 63
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    move-object v8, v3

    .line 68
    check-cast v8, Landroid/widget/CheckBox;

    .line 69
    .line 70
    if-eqz v8, :cond_1

    .line 71
    .line 72
    const v0, 0x7f0a044f

    .line 73
    .line 74
    .line 75
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    move-object v9, v3

    .line 80
    check-cast v9, Lcom/google/android/material/textfield/TextInputEditText;

    .line 81
    .line 82
    if-eqz v9, :cond_1

    .line 83
    .line 84
    const v0, 0x7f0a0563

    .line 85
    .line 86
    .line 87
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    move-object v10, v3

    .line 92
    check-cast v10, Lcom/google/android/material/textfield/TextInputEditText;

    .line 93
    .line 94
    if-eqz v10, :cond_1

    .line 95
    .line 96
    const v0, 0x7f0a0568

    .line 97
    .line 98
    .line 99
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    move-object v11, v3

    .line 104
    check-cast v11, Lcom/google/android/material/textfield/TextInputEditText;

    .line 105
    .line 106
    if-eqz v11, :cond_1

    .line 107
    .line 108
    const v0, 0x7f0a064d

    .line 109
    .line 110
    .line 111
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    move-object v12, v3

    .line 116
    check-cast v12, Lcom/google/android/material/textfield/TextInputEditText;

    .line 117
    .line 118
    if-eqz v12, :cond_1

    .line 119
    .line 120
    new-instance v4, Ley;

    .line 121
    .line 122
    move-object v5, p1

    .line 123
    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 124
    .line 125
    invoke-direct/range {v4 .. v12}, Ley;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputEditText;Landroid/widget/CheckBox;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputEditText;Lcom/google/android/material/textfield/TextInputEditText;)V

    .line 126
    .line 127
    .line 128
    iput-object v4, p0, Lra4;->B0:Ley;

    .line 129
    .line 130
    new-instance p1, Lpa4;

    .line 131
    .line 132
    invoke-direct {p1, p0, v2}, Lpa4;-><init>(Lra4;I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v6, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p1}, Ll70;->d()Le75;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {p1}, Lgh0;->r(Lf75;)Lb75;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-static {p1, v3}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    new-instance v4, Lbq4;

    .line 155
    .line 156
    invoke-direct {v4, v0, v3, p1}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 157
    .line 158
    .line 159
    const-class p1, Lse2;

    .line 160
    .line 161
    invoke-static {p1}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {p1}, Li30;->b()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    if-eqz v0, :cond_0

    .line 170
    .line 171
    const-string v1, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 172
    .line 173
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {v4, p1, v0}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    check-cast p1, Lse2;

    .line 182
    .line 183
    iput-object p1, p0, Lra4;->C0:Lse2;

    .line 184
    .line 185
    new-instance p1, Lvg2;

    .line 186
    .line 187
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-direct {p1, v0, v2}, Lvg2;-><init>(Landroid/content/Context;I)V

    .line 192
    .line 193
    .line 194
    iget-object p0, p0, Lra4;->B0:Ley;

    .line 195
    .line 196
    iget-object p0, p0, Ley;->a:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 199
    .line 200
    invoke-virtual {p1, p0}, Lvg2;->q(Landroid/view/View;)Lvg2;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    const p1, 0x7f130463

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0, p1}, Lvg2;->p(I)V

    .line 208
    .line 209
    .line 210
    new-instance p1, Lwr;

    .line 211
    .line 212
    const/4 v0, 0x3

    .line 213
    invoke-direct {p1, v0}, Lwr;-><init>(I)V

    .line 214
    .line 215
    .line 216
    const v1, 0x7f130461

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0, v1, p1}, Lvg2;->k(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 220
    .line 221
    .line 222
    new-instance p1, Lwr;

    .line 223
    .line 224
    invoke-direct {p1, v0}, Lwr;-><init>(I)V

    .line 225
    .line 226
    .line 227
    const v0, 0x7f130462

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0, v0, p1}, Lvg2;->l(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    new-instance p1, Lwr;

    .line 235
    .line 236
    const/16 v0, 0xb

    .line 237
    .line 238
    invoke-direct {p1, v0}, Lwr;-><init>(I)V

    .line 239
    .line 240
    .line 241
    const v0, 0x7f130460

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0, v0, p1}, Lvg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    invoke-virtual {p0}, Lvg2;->create()Lf9;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    return-object p0

    .line 253
    :cond_0
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 254
    .line 255
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    return-object v1

    .line 259
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p0

    .line 267
    const-string p1, "Missing required view with ID: "

    .line 268
    .line 269
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    return-object v1
.end method
