.class public final Ldefpackage/sl3;
.super Ldefpackage/pp0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic B0:I

.field public C0:Ljava/lang/String;

.field public D0:Ljava/lang/Object;

.field public E0:Ldefpackage/hd;

.field public final F0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/sl3;->B0:I

    .line 2
    .line 3
    invoke-direct {p0}, Ldefpackage/pp0;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/sl3;->F0:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final J()V
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/sl3;->B0:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ldefpackage/pp0;->J()V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Ldefpackage/sl3;->D0:Ljava/lang/Object;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-super {p0}, Ldefpackage/pp0;->J()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Ldefpackage/sl3;->D0:Ljava/lang/Object;

    .line 18
    .line 19
    return-void

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final R()V
    .locals 5

    .line 1
    iget v0, p0, Ldefpackage/sl3;->B0:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-super {p0}, Ldefpackage/pp0;->R()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Ldefpackage/pp0;->w0:Landroid/app/Dialog;

    .line 11
    .line 12
    check-cast v0, Ldefpackage/f9;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ldefpackage/f9;->i(I)Landroid/widget/Button;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Ldefpackage/bj3;

    .line 21
    .line 22
    const/16 v2, 0xc

    .line 23
    .line 24
    invoke-direct {v1, v2, p0}, Ldefpackage/bj3;-><init>(ILjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void

    .line 31
    :pswitch_0
    invoke-super {p0}, Ldefpackage/pp0;->R()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Ldefpackage/kc1;->Y()Landroid/os/Bundle;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v2, "TRACKS_OBJECT"

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/4 v3, 0x0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    iget-object v0, p0, Ldefpackage/sl3;->E0:Ldefpackage/hd;

    .line 48
    .line 49
    check-cast v0, Ldefpackage/wl3;

    .line 50
    .line 51
    invoke-virtual {p0}, Ldefpackage/kc1;->Y()Landroid/os/Bundle;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v4, v2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    iput-object v2, v0, Ldefpackage/wl3;->e:Ljava/util/ArrayList;

    .line 60
    .line 61
    iget-object v0, p0, Ldefpackage/sl3;->E0:Ldefpackage/hd;

    .line 62
    .line 63
    check-cast v0, Ldefpackage/wl3;

    .line 64
    .line 65
    invoke-virtual {v0, v3}, Ldefpackage/wl3;->c(Lcom/eddyizm/tempus/subsonic/models/Playlist;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    invoke-virtual {p0}, Ldefpackage/kc1;->Y()Landroid/os/Bundle;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const-string v2, "PLAYLIST_OBJECT"

    .line 74
    .line 75
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    iget-object v0, p0, Ldefpackage/sl3;->E0:Ldefpackage/hd;

    .line 82
    .line 83
    check-cast v0, Ldefpackage/wl3;

    .line 84
    .line 85
    iput-object v3, v0, Ldefpackage/wl3;->e:Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-virtual {p0}, Ldefpackage/kc1;->Y()Landroid/os/Bundle;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    invoke-virtual {v3, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 96
    .line 97
    invoke-virtual {v0, v2}, Ldefpackage/wl3;->c(Lcom/eddyizm/tempus/subsonic/models/Playlist;)V

    .line 98
    .line 99
    .line 100
    iget-object v0, p0, Ldefpackage/sl3;->E0:Ldefpackage/hd;

    .line 101
    .line 102
    check-cast v0, Ldefpackage/wl3;

    .line 103
    .line 104
    iget-object v0, v0, Ldefpackage/wl3;->f:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 105
    .line 106
    if-eqz v0, :cond_2

    .line 107
    .line 108
    iget-object v2, p0, Ldefpackage/sl3;->D0:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v2, Ldefpackage/c12;

    .line 111
    .line 112
    iget-object v2, v2, Ldefpackage/c12;->p:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v2, Lcom/google/android/material/textfield/TextInputEditText;

    .line 115
    .line 116
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 121
    .line 122
    .line 123
    :cond_2
    :goto_0
    iget-object v0, p0, Ldefpackage/pp0;->w0:Landroid/app/Dialog;

    .line 124
    .line 125
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    check-cast v0, Ldefpackage/f9;

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ldefpackage/f9;->i(I)Landroid/widget/Button;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    new-instance v2, Ldefpackage/pl3;

    .line 135
    .line 136
    const/4 v3, 0x0

    .line 137
    invoke-direct {v2, p0, v3}, Ldefpackage/pl3;-><init>(Ldefpackage/sl3;I)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 141
    .line 142
    .line 143
    const/4 v1, -0x3

    .line 144
    invoke-virtual {v0, v1}, Ldefpackage/f9;->i(I)Landroid/widget/Button;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iget-object v1, p0, Ldefpackage/sl3;->E0:Ldefpackage/hd;

    .line 149
    .line 150
    check-cast v1, Ldefpackage/wl3;

    .line 151
    .line 152
    iget-object v1, v1, Ldefpackage/wl3;->f:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 153
    .line 154
    const/16 v2, 0x8

    .line 155
    .line 156
    if-nez v1, :cond_3

    .line 157
    .line 158
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_3
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 163
    .line 164
    .line 165
    new-instance v1, Ldefpackage/pl3;

    .line 166
    .line 167
    const/4 v4, 0x1

    .line 168
    invoke-direct {v1, p0, v4}, Ldefpackage/pl3;-><init>(Ldefpackage/sl3;I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 172
    .line 173
    .line 174
    :goto_1
    iget-object v0, p0, Ldefpackage/sl3;->D0:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v0, Ldefpackage/c12;

    .line 177
    .line 178
    iget-object v0, v0, Ldefpackage/c12;->q:Ljava/lang/Object;

    .line 179
    .line 180
    check-cast v0, Landroid/widget/FrameLayout;

    .line 181
    .line 182
    new-instance v1, Ldefpackage/pl3;

    .line 183
    .line 184
    const/4 v4, 0x2

    .line 185
    invoke-direct {v1, p0, v4}, Ldefpackage/pl3;-><init>(Ldefpackage/sl3;I)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 189
    .line 190
    .line 191
    iget-object p0, p0, Ldefpackage/sl3;->D0:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast p0, Ldefpackage/c12;

    .line 194
    .line 195
    iget-object p0, p0, Ldefpackage/c12;->q:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast p0, Landroid/widget/FrameLayout;

    .line 198
    .line 199
    invoke-static {}, Ldefpackage/ud3;->V()Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-eqz v0, :cond_4

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_4
    move v3, v2

    .line 207
    :goto_2
    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 10

    .line 1
    iget p1, p0, Ldefpackage/sl3;->B0:I

    .line 2
    .line 3
    const-string v0, "Missing required view with ID: "

    .line 4
    .line 5
    const-string v1, "Local and anonymous classes can not be ViewModels"

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const-string v3, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 9
    .line 10
    const/4 v4, 0x6

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch p1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ldefpackage/kc1;->o()Landroid/view/LayoutInflater;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const v7, 0x7f0d0049

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v7, v6, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    const v7, 0x7f0a04d4

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v7}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    check-cast v8, Lcom/google/android/material/textfield/TextInputEditText;

    .line 35
    .line 36
    if-eqz v8, :cond_1

    .line 37
    .line 38
    new-instance v0, Ldefpackage/hd5;

    .line 39
    .line 40
    check-cast p1, Landroid/widget/LinearLayout;

    .line 41
    .line 42
    invoke-direct {v0, v4, p1, v8}, Ldefpackage/hd5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Ldefpackage/sl3;->D0:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {p1}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-static {p1, v4}, Ldefpackage/b11;->e(Ldefpackage/nc1;Ldefpackage/b75;)Ldefpackage/tf0;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    new-instance v7, Ldefpackage/bq4;

    .line 64
    .line 65
    invoke-direct {v7, v0, v4, p1}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 66
    .line 67
    .line 68
    const-class p1, Ldefpackage/xm3;

    .line 69
    .line 70
    invoke-static {p1}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p1}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    if-eqz v0, :cond_0

    .line 79
    .line 80
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v7, p1, v0}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    check-cast p1, Ldefpackage/xm3;

    .line 89
    .line 90
    iput-object p1, p0, Ldefpackage/sl3;->E0:Ldefpackage/hd;

    .line 91
    .line 92
    new-instance p1, Ldefpackage/vg2;

    .line 93
    .line 94
    invoke-virtual {p0}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-direct {p1, v0, v5}, Ldefpackage/vg2;-><init>(Landroid/content/Context;I)V

    .line 99
    .line 100
    .line 101
    iget-object p0, p0, Ldefpackage/sl3;->D0:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p0, Ldefpackage/hd5;

    .line 104
    .line 105
    iget-object p0, p0, Ldefpackage/hd5;->o:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p0, Landroid/widget/LinearLayout;

    .line 108
    .line 109
    invoke-virtual {p1, p0}, Ldefpackage/vg2;->q(Landroid/view/View;)Ldefpackage/vg2;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    const p1, 0x7f130416

    .line 114
    .line 115
    .line 116
    invoke-virtual {p0, p1}, Ldefpackage/vg2;->p(I)V

    .line 117
    .line 118
    .line 119
    new-instance p1, Ldefpackage/wr;

    .line 120
    .line 121
    invoke-direct {p1, v2}, Ldefpackage/wr;-><init>(I)V

    .line 122
    .line 123
    .line 124
    const v0, 0x7f13042b

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0, v0, p1}, Ldefpackage/vg2;->l(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/vg2;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    new-instance p1, Ldefpackage/wr;

    .line 132
    .line 133
    const/16 v0, 0x8

    .line 134
    .line 135
    invoke-direct {p1, v0}, Ldefpackage/wr;-><init>(I)V

    .line 136
    .line 137
    .line 138
    const v0, 0x7f130429

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v0, p1}, Ldefpackage/vg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/vg2;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-virtual {p0}, Ldefpackage/vg2;->create()Ldefpackage/f9;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    goto :goto_0

    .line 150
    :cond_0
    invoke-static {v1}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-virtual {p0, v7}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    :goto_0
    return-object v6

    .line 170
    :pswitch_0
    invoke-virtual {p0}, Ldefpackage/kc1;->o()Landroid/view/LayoutInflater;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    const v7, 0x7f0d0048

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, v7, v6, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    const v7, 0x7f0a04be

    .line 182
    .line 183
    .line 184
    invoke-static {p1, v7}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    check-cast v8, Lcom/google/android/material/textfield/TextInputEditText;

    .line 189
    .line 190
    if-eqz v8, :cond_3

    .line 191
    .line 192
    const v7, 0x7f0a04c3

    .line 193
    .line 194
    .line 195
    invoke-static {p1, v7}, Ldefpackage/uo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 196
    .line 197
    .line 198
    move-result-object v9

    .line 199
    check-cast v9, Landroid/widget/FrameLayout;

    .line 200
    .line 201
    if-eqz v9, :cond_3

    .line 202
    .line 203
    new-instance v0, Ldefpackage/c12;

    .line 204
    .line 205
    check-cast p1, Landroid/widget/LinearLayout;

    .line 206
    .line 207
    const/4 v7, 0x4

    .line 208
    invoke-direct {v0, p1, v8, v9, v7}, Ldefpackage/c12;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 209
    .line 210
    .line 211
    iput-object v0, p0, Ldefpackage/sl3;->D0:Ljava/lang/Object;

    .line 212
    .line 213
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    invoke-virtual {p1}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-static {p1}, Ldefpackage/gh0;->r(Ldefpackage/f75;)Ldefpackage/b75;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    invoke-static {p1, v7}, Ldefpackage/b11;->e(Ldefpackage/nc1;Ldefpackage/b75;)Ldefpackage/tf0;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    new-instance v8, Ldefpackage/bq4;

    .line 230
    .line 231
    invoke-direct {v8, v0, v7, p1}, Ldefpackage/bq4;-><init>(Ldefpackage/e75;Ldefpackage/b75;Ldefpackage/tf0;)V

    .line 232
    .line 233
    .line 234
    const-class p1, Ldefpackage/wl3;

    .line 235
    .line 236
    invoke-static {p1}, Ldefpackage/kx3;->a(Ljava/lang/Class;)Ldefpackage/i30;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-virtual {p1}, Ldefpackage/i30;->b()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    if-eqz v0, :cond_2

    .line 245
    .line 246
    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-virtual {v8, p1, v0}, Ldefpackage/bq4;->l(Ldefpackage/i30;Ljava/lang/String;)Ldefpackage/x65;

    .line 251
    .line 252
    .line 253
    move-result-object p1

    .line 254
    check-cast p1, Ldefpackage/wl3;

    .line 255
    .line 256
    iput-object p1, p0, Ldefpackage/sl3;->E0:Ldefpackage/hd;

    .line 257
    .line 258
    new-instance p1, Ldefpackage/vg2;

    .line 259
    .line 260
    invoke-virtual {p0}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-direct {p1, v0, v5}, Ldefpackage/vg2;-><init>(Landroid/content/Context;I)V

    .line 265
    .line 266
    .line 267
    iget-object p0, p0, Ldefpackage/sl3;->D0:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast p0, Ldefpackage/c12;

    .line 270
    .line 271
    iget-object p0, p0, Ldefpackage/c12;->o:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast p0, Landroid/widget/LinearLayout;

    .line 274
    .line 275
    invoke-virtual {p1, p0}, Ldefpackage/vg2;->q(Landroid/view/View;)Ldefpackage/vg2;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    const p1, 0x7f1303f0

    .line 280
    .line 281
    .line 282
    invoke-virtual {p0, p1}, Ldefpackage/vg2;->p(I)V

    .line 283
    .line 284
    .line 285
    new-instance p1, Ldefpackage/wr;

    .line 286
    .line 287
    invoke-direct {p1, v2}, Ldefpackage/wr;-><init>(I)V

    .line 288
    .line 289
    .line 290
    const v0, 0x7f1303fb

    .line 291
    .line 292
    .line 293
    invoke-virtual {p0, v0, p1}, Ldefpackage/vg2;->l(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/vg2;

    .line 294
    .line 295
    .line 296
    move-result-object p0

    .line 297
    new-instance p1, Ldefpackage/wr;

    .line 298
    .line 299
    invoke-direct {p1, v4}, Ldefpackage/wr;-><init>(I)V

    .line 300
    .line 301
    .line 302
    const v0, 0x7f1303fa

    .line 303
    .line 304
    .line 305
    invoke-virtual {p0, v0, p1}, Ldefpackage/vg2;->k(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 306
    .line 307
    .line 308
    new-instance p1, Ldefpackage/wr;

    .line 309
    .line 310
    const/4 v0, 0x7

    .line 311
    invoke-direct {p1, v0}, Ldefpackage/wr;-><init>(I)V

    .line 312
    .line 313
    .line 314
    const v0, 0x7f1303f9

    .line 315
    .line 316
    .line 317
    invoke-virtual {p0, v0, p1}, Ldefpackage/vg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Ldefpackage/vg2;

    .line 318
    .line 319
    .line 320
    move-result-object p0

    .line 321
    invoke-virtual {p0}, Ldefpackage/vg2;->create()Ldefpackage/f9;

    .line 322
    .line 323
    .line 324
    move-result-object v6

    .line 325
    goto :goto_1

    .line 326
    :cond_2
    invoke-static {v1}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    goto :goto_1

    .line 330
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    invoke-virtual {p0, v7}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 335
    .line 336
    .line 337
    move-result-object p0

    .line 338
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object p0

    .line 342
    invoke-static {p0}, Ldefpackage/nz2;->n(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    :goto_1
    return-object v6

    .line 346
    nop

    .line 347
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
