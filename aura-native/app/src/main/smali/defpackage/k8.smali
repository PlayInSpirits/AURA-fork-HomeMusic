.class public final synthetic Ldefpackage/k8;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/k8;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/k8;->o:Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    iget p1, p0, Ldefpackage/k8;->n:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/4 v1, 0x1

    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, Ldefpackage/k8;->o:Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->n0:Ldefpackage/n8;

    .line 12
    .line 13
    iget-object p1, p0, Ldefpackage/n8;->e:Ldefpackage/d34;

    .line 14
    .line 15
    iget-object v3, p0, Ldefpackage/n8;->h:Ldefpackage/k03;

    .line 16
    .line 17
    invoke-virtual {v3}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 22
    .line 23
    if-nez v4, :cond_0

    .line 24
    .line 25
    goto/16 :goto_1

    .line 26
    .line 27
    :cond_0
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getStarred()Ljava/util/Date;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    if-eqz v6, :cond_1

    .line 36
    .line 37
    move v6, v1

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move v6, v2

    .line 40
    :goto_0
    invoke-static {v0, v5, v6}, Ldefpackage/n61;->f(ILjava/lang/String;Z)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v5, 0x0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-static {}, Ldefpackage/hw;->t()Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p1, v5, p0, v2, v5}, Ldefpackage/d34;->J(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, v5}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->setStarred(Ljava/util/Date;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, v4}, Ldefpackage/ad2;->i(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-instance v1, Ldefpackage/m8;

    .line 72
    .line 73
    invoke-direct {v1, p0, v4, v2}, Ldefpackage/m8;-><init>(Ldefpackage/n8;Lcom/eddyizm/tempus/subsonic/models/AlbumID3;I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-static {v5, v0, v5, v1}, Ldefpackage/d34;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/interfaces/StarCallback;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4, v5}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->setStarred(Ljava/util/Date;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, v4}, Ldefpackage/ad2;->i(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    invoke-static {}, Ldefpackage/hw;->t()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p1, v5, p0, v1, v5}, Ldefpackage/d34;->J(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 100
    .line 101
    .line 102
    new-instance p0, Ljava/util/Date;

    .line 103
    .line 104
    invoke-direct {p0}, Ljava/util/Date;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4, p0}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->setStarred(Ljava/util/Date;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, v4}, Ldefpackage/ad2;->i(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_4
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    new-instance v2, Ldefpackage/m8;

    .line 119
    .line 120
    invoke-direct {v2, p0, v4, v1}, Ldefpackage/m8;-><init>(Ldefpackage/n8;Lcom/eddyizm/tempus/subsonic/models/AlbumID3;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-static {v5, v0, v5, v2}, Ldefpackage/d34;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/interfaces/StarCallback;)V

    .line 127
    .line 128
    .line 129
    new-instance p0, Ljava/util/Date;

    .line 130
    .line 131
    invoke-direct {p0}, Ljava/util/Date;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v4, p0}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->setStarred(Ljava/util/Date;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v3, v4}, Ldefpackage/ad2;->i(Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    :goto_1
    return-void

    .line 141
    :pswitch_0
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->i0()V

    .line 142
    .line 143
    .line 144
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->n0:Ldefpackage/n8;

    .line 145
    .line 146
    iget-object v0, p1, Ldefpackage/n8;->d:Ldefpackage/pa;

    .line 147
    .line 148
    iget-object p1, p1, Ldefpackage/n8;->g:Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    new-instance v0, Ldefpackage/k03;

    .line 154
    .line 155
    invoke-direct {v0}, Ldefpackage/ad2;-><init>()V

    .line 156
    .line 157
    .line 158
    invoke-static {v2}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {v2}, Ldefpackage/pn4;->c()Ldefpackage/gp3;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-virtual {v2, p1}, Ldefpackage/gp3;->i(Ljava/lang/String;)Lretrofit2/Call;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    new-instance v2, Ldefpackage/p8;

    .line 171
    .line 172
    invoke-direct {v2, v0, v1}, Ldefpackage/p8;-><init>(Ldefpackage/k03;I)V

    .line 173
    .line 174
    .line 175
    invoke-interface {p1, v2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 176
    .line 177
    .line 178
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->r0:Ldefpackage/k03;

    .line 179
    .line 180
    new-instance p1, Ldefpackage/g8;

    .line 181
    .line 182
    const/4 v1, 0x5

    .line 183
    invoke-direct {p1, p0, v1}, Ldefpackage/g8;-><init>(Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;I)V

    .line 184
    .line 185
    .line 186
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->s0:Ldefpackage/g8;

    .line 187
    .line 188
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->s0:Ldefpackage/g8;

    .line 193
    .line 194
    invoke-virtual {v0, p1, p0}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :pswitch_1
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Ldefpackage/pc1;

    .line 199
    .line 200
    iget-object p1, p1, Ldefpackage/pc1;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 201
    .line 202
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 203
    .line 204
    .line 205
    move-result p1

    .line 206
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Ldefpackage/pc1;

    .line 207
    .line 208
    const/16 v3, 0x8

    .line 209
    .line 210
    if-ne p1, v3, :cond_5

    .line 211
    .line 212
    iget-object p1, v1, Ldefpackage/pc1;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 213
    .line 214
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 215
    .line 216
    .line 217
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Ldefpackage/pc1;

    .line 218
    .line 219
    iget-object p0, p0, Ldefpackage/pc1;->e:Landroid/widget/TextView;

    .line 220
    .line 221
    const p1, 0x7fffffff

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 225
    .line 226
    .line 227
    goto :goto_2

    .line 228
    :cond_5
    iget-object p1, v1, Ldefpackage/pc1;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 229
    .line 230
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 231
    .line 232
    .line 233
    move-result p1

    .line 234
    if-nez p1, :cond_6

    .line 235
    .line 236
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Ldefpackage/pc1;

    .line 237
    .line 238
    iget-object p1, p1, Ldefpackage/pc1;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 239
    .line 240
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 241
    .line 242
    .line 243
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->l0:Ldefpackage/pc1;

    .line 244
    .line 245
    iget-object p0, p0, Ldefpackage/pc1;->e:Landroid/widget/TextView;

    .line 246
    .line 247
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 248
    .line 249
    .line 250
    :cond_6
    :goto_2
    return-void

    .line 251
    :pswitch_2
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 252
    .line 253
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Ldefpackage/v23;

    .line 254
    .line 255
    invoke-virtual {p0}, Ldefpackage/v23;->o()V

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
