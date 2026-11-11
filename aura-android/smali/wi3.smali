.class public final synthetic Lwi3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;II)V
    .locals 0

    .line 1
    iput p4, p0, Lwi3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lwi3;->p:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lwi3;->q:Ljava/lang/Object;

    .line 6
    .line 7
    iput p3, p0, Lwi3;->o:I

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 10

    .line 1
    iget p1, p0, Lwi3;->n:I

    .line 2
    .line 3
    iget-object v0, p0, Lwi3;->q:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v1, p0, Lwi3;->p:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v1, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;

    .line 11
    .line 12
    move-object v5, v0

    .line 13
    check-cast v5, Ljava/lang/String;

    .line 14
    .line 15
    iget-object v6, v1, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 16
    .line 17
    invoke-virtual {v1}, Lkc1;->X()Lnc1;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    move-object v3, p1

    .line 22
    check-cast v3, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 23
    .line 24
    invoke-virtual {v1}, Lzt;->h0()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Ll70;->d()Le75;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {v3}, Lgh0;->r(Lf75;)Lb75;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v3}, Lgh0;->q(Lf75;)Ltf0;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance v2, Lbq4;

    .line 46
    .line 47
    invoke-direct {v2, p1, v0, v1}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 48
    .line 49
    .line 50
    const-class p1, Lim3;

    .line 51
    .line 52
    invoke-static {p1}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p1}, Li30;->b()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    const-string v1, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 63
    .line 64
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {v2, p1, v0}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    move-object v4, p1

    .line 73
    check-cast v4, Lim3;

    .line 74
    .line 75
    new-instance v2, Lew4;

    .line 76
    .line 77
    const/4 v8, 0x5

    .line 78
    iget v7, p0, Lwi3;->o:I

    .line 79
    .line 80
    invoke-direct/range {v2 .. v8}, Lew4;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;II)V

    .line 81
    .line 82
    .line 83
    move-object v3, v4

    .line 84
    iget-object p0, v3, Lim3;->j:Lk03;

    .line 85
    .line 86
    invoke-virtual {p0}, Lad2;->d()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    move-object v6, p1

    .line 91
    check-cast v6, Ljava/util/List;

    .line 92
    .line 93
    iget-object p1, v3, Lim3;->f:Ljava/lang/String;

    .line 94
    .line 95
    if-nez p1, :cond_1

    .line 96
    .line 97
    iget-object p1, v3, Lim3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 98
    .line 99
    if-eqz p1, :cond_1

    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_1

    .line 110
    .line 111
    if-eqz v6, :cond_1

    .line 112
    .line 113
    if-ltz v7, :cond_1

    .line 114
    .line 115
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-lt v7, p1, :cond_0

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_0
    iput-object v5, v3, Lim3;->f:Ljava/lang/String;

    .line 123
    .line 124
    iget p1, v3, Lim3;->h:I

    .line 125
    .line 126
    add-int/lit8 p1, p1, 0x1

    .line 127
    .line 128
    iput p1, v3, Lim3;->h:I

    .line 129
    .line 130
    iput p1, v3, Lim3;->i:I

    .line 131
    .line 132
    new-instance v4, Ljava/util/ArrayList;

    .line 133
    .line 134
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    move-object v9, p1

    .line 142
    check-cast v9, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 143
    .line 144
    invoke-virtual {p0, v4}, Lad2;->k(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    iget-object p0, v3, Lim3;->c:Lmm3;

    .line 148
    .line 149
    move-object v8, v2

    .line 150
    new-instance v2, Lhq1;

    .line 151
    .line 152
    invoke-direct/range {v2 .. v9}, Lhq1;-><init>(Lim3;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/List;ILew4;Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    move-object v4, v5

    .line 159
    new-instance v5, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    invoke-virtual {v5, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    new-instance p1, Ljava/lang/Thread;

    .line 172
    .line 173
    move-object v6, v2

    .line 174
    new-instance v2, Lt6;

    .line 175
    .line 176
    const/16 v7, 0x1b

    .line 177
    .line 178
    move-object v3, p0

    .line 179
    invoke-direct/range {v2 .. v7}, Lt6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 180
    .line 181
    .line 182
    invoke-direct {p1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 186
    .line 187
    .line 188
    goto :goto_1

    .line 189
    :cond_1
    :goto_0
    invoke-virtual {v2}, Lew4;->o()V

    .line 190
    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_2
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 194
    .line 195
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    :goto_1
    return-void

    .line 199
    :pswitch_0
    check-cast v1, Lnp0;

    .line 200
    .line 201
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;

    .line 202
    .line 203
    iget-object p1, v1, Lnp0;->b:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast p1, Lxi3;

    .line 206
    .line 207
    iget-object v1, p1, Lxi3;->q0:Lbl2;

    .line 208
    .line 209
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->getEntries()Ljava/util/List;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    const-string v2, "queue"

    .line 214
    .line 215
    iget p0, p0, Lwi3;->o:I

    .line 216
    .line 217
    invoke-static {v1, v0, p0, v2}, Lbo2;->q(Lic2;Ljava/util/List;ILjava/lang/String;)V

    .line 218
    .line 219
    .line 220
    iget-object p0, p1, Lxi3;->o0:Lns3;

    .line 221
    .line 222
    iget-object p0, p0, Lns3;->q:Ljava/lang/Object;

    .line 223
    .line 224
    check-cast p0, Lae1;

    .line 225
    .line 226
    iget-object p0, p0, Lae1;->e:Landroid/view/View;

    .line 227
    .line 228
    check-cast p0, Landroid/widget/ImageButton;

    .line 229
    .line 230
    const/16 p1, 0x8

    .line 231
    .line 232
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    nop

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
