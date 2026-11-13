.class public final synthetic Ldefpackage/pl3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/sl3;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/sl3;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/pl3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/pl3;->o:Ldefpackage/sl3;

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
    .locals 8

    .line 1
    iget p1, p0, Ldefpackage/pl3;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/pl3;->o:Ldefpackage/sl3;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Ldefpackage/sl3;->E0:Ldefpackage/hd;

    .line 9
    .line 10
    check-cast p1, Ldefpackage/wl3;

    .line 11
    .line 12
    iget-object v0, p1, Ldefpackage/wl3;->d:Ldefpackage/hh3;

    .line 13
    .line 14
    iget-object v1, p1, Ldefpackage/wl3;->f:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object p1, p1, Ldefpackage/wl3;->f:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {v1, p1}, Ldefpackage/hh3;->h(Ljava/lang/String;Ljava/lang/String;)Ldefpackage/k03;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v1, Ldefpackage/d8;

    .line 38
    .line 39
    const/16 v2, 0x13

    .line 40
    .line 41
    invoke-direct {v1, v2, p0}, Ldefpackage/d8;-><init>(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0, v1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_0
    iget-object p1, p0, Ldefpackage/sl3;->E0:Ldefpackage/hd;

    .line 49
    .line 50
    check-cast p1, Ldefpackage/wl3;

    .line 51
    .line 52
    new-instance v0, Ldefpackage/pz1;

    .line 53
    .line 54
    const/16 v1, 0xc

    .line 55
    .line 56
    invoke-direct {v0, v1, p0}, Ldefpackage/pz1;-><init>(ILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p0, p1, Ldefpackage/wl3;->f:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 60
    .line 61
    if-eqz p0, :cond_0

    .line 62
    .line 63
    iget-object p1, p1, Ldefpackage/wl3;->c:Ldefpackage/mm3;

    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {p1, p0, v0}, Ldefpackage/mm3;->b(Ljava/lang/String;Ldefpackage/lm3;)V

    .line 70
    .line 71
    .line 72
    :cond_0
    return-void

    .line 73
    :pswitch_1
    iget-object p1, p0, Ldefpackage/sl3;->D0:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast p1, Ldefpackage/c12;

    .line 76
    .line 77
    iget-object p1, p1, Ldefpackage/c12;->p:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 80
    .line 81
    invoke-virtual {p1}, Ldefpackage/hg;->getText()Landroid/text/Editable;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iput-object p1, p0, Ldefpackage/sl3;->C0:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_1

    .line 103
    .line 104
    iget-object p1, p0, Ldefpackage/sl3;->D0:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p1, Ldefpackage/c12;

    .line 107
    .line 108
    iget-object p1, p1, Ldefpackage/c12;->p:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 111
    .line 112
    const v0, 0x7f130112

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v0}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    .line 120
    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_1
    new-instance v5, Ldefpackage/om1;

    .line 124
    .line 125
    const/16 p1, 0x11

    .line 126
    .line 127
    invoke-direct {v5, p1, p0}, Ldefpackage/om1;-><init>(ILjava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    iget-object v0, p0, Ldefpackage/sl3;->E0:Ldefpackage/hd;

    .line 131
    .line 132
    check-cast v0, Ldefpackage/wl3;

    .line 133
    .line 134
    iget-object v1, v0, Ldefpackage/wl3;->e:Ljava/util/ArrayList;

    .line 135
    .line 136
    move-object v2, v1

    .line 137
    iget-object v1, v0, Ldefpackage/wl3;->c:Ldefpackage/mm3;

    .line 138
    .line 139
    const/4 v4, 0x0

    .line 140
    if-eqz v2, :cond_2

    .line 141
    .line 142
    iget-object p0, p0, Ldefpackage/sl3;->C0:Ljava/lang/String;

    .line 143
    .line 144
    new-instance v2, Ljava/util/ArrayList;

    .line 145
    .line 146
    iget-object v0, v0, Ldefpackage/wl3;->e:Ljava/util/ArrayList;

    .line 147
    .line 148
    new-instance v3, Ldefpackage/nz2;

    .line 149
    .line 150
    const/16 v6, 0xe

    .line 151
    .line 152
    invoke-direct {v3, v6}, Ldefpackage/nz2;-><init>(I)V

    .line 153
    .line 154
    .line 155
    invoke-static {v3, v0}, Ldefpackage/hw;->P(Ldefpackage/eg1;Ljava/util/List;)Ljava/util/AbstractList;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    const/4 v0, 0x0

    .line 166
    invoke-static {v0}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    invoke-virtual {v3}, Ldefpackage/pn4;->g()Ldefpackage/rm3;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    const-string v6, "BrowsingClient"

    .line 178
    .line 179
    const-string v7, "createPlaylist()"

    .line 180
    .line 181
    invoke-static {v6, v7}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 182
    .line 183
    .line 184
    iget-object v6, v3, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v6, Ldefpackage/qm3;

    .line 187
    .line 188
    iget-object v3, v3, Ldefpackage/rm3;->n:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v3, Ldefpackage/pn4;

    .line 191
    .line 192
    invoke-virtual {v3}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-interface {v6, v3, v4, p0, v2}, Ldefpackage/qm3;->a(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)Lretrofit2/Call;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    new-instance v2, Ldefpackage/hd5;

    .line 201
    .line 202
    invoke-direct {v2, v1, v5, v0, p1}, Ldefpackage/hd5;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 203
    .line 204
    .line 205
    invoke-interface {p0, v2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 206
    .line 207
    .line 208
    goto :goto_0

    .line 209
    :cond_2
    iget-object p1, v0, Ldefpackage/wl3;->f:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 210
    .line 211
    if-eqz p1, :cond_3

    .line 212
    .line 213
    iget-object v3, p0, Ldefpackage/sl3;->C0:Ljava/lang/String;

    .line 214
    .line 215
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    new-instance p0, Ljava/lang/Thread;

    .line 223
    .line 224
    new-instance v0, Ldefpackage/mr;

    .line 225
    .line 226
    const/16 v6, 0xa

    .line 227
    .line 228
    invoke-direct/range {v0 .. v6}, Ldefpackage/mr;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 229
    .line 230
    .line 231
    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 235
    .line 236
    .line 237
    :cond_3
    :goto_0
    return-void

    .line 238
    nop

    .line 239
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
