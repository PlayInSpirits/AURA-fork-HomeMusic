.class public final synthetic Lrn1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lrn1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lrn1;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lrn1;->p:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lrn1;->q:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    .line 1
    iget v0, p0, Lrn1;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lrn1;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Landroid/content/SharedPreferences;

    .line 11
    .line 12
    iget-object p2, p0, Lrn1;->p:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p2, Lh62;

    .line 15
    .line 16
    iget-object p0, p0, Lrn1;->q:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ljava/lang/String;

    .line 19
    .line 20
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    sget-boolean v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 25
    .line 26
    iget-object v0, p2, Lh62;->t0:Landroid/content/Context;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-static {v0}, Lkb4;->a0(Landroid/content/Context;)Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0, p0}, Lkb4;->K(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "trusted"

    .line 39
    .line 40
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putStringSet(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v1, "peer-"

    .line 47
    .line 48
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-interface {p1, p0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p2}, Lh62;->o0()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_0
    const-string p0, "app"

    .line 70
    .line 71
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v2

    .line 75
    :pswitch_0
    iget-object v0, p0, Lrn1;->o:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Landroid/app/Activity;

    .line 78
    .line 79
    iget-object v1, p0, Lrn1;->p:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v1, Lcom/eddyizm/tempus/homemusic/HubAppRelease;

    .line 82
    .line 83
    iget-object p0, p0, Lrn1;->q:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p0, Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;

    .line 86
    .line 87
    invoke-static {v0, v1, p0, p1, p2}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->c(Landroid/app/Activity;Lcom/eddyizm/tempus/homemusic/HubAppRelease;Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;Landroid/content/DialogInterface;I)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :pswitch_1
    iget-object p1, p0, Lrn1;->o:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast p1, Landroid/content/Context;

    .line 94
    .line 95
    iget-object p2, p0, Lrn1;->p:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p2, Ljava/util/ArrayList;

    .line 98
    .line 99
    iget-object p0, p0, Lrn1;->q:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p0, Lrm3;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-eqz v0, :cond_1

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_1
    invoke-static {}, Lud3;->o()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    if-nez v0, :cond_3

    .line 118
    .line 119
    invoke-static {p1}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-static {p2}, Lgi1;->H(Ljava/util/List;)Ljava/util/ArrayList;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    new-instance v2, Ljava/util/ArrayList;

    .line 128
    .line 129
    const/16 v3, 0xa

    .line 130
    .line 131
    invoke-static {p2, v3}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    :goto_0
    if-ge v1, v3, :cond_2

    .line 143
    .line 144
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    add-int/lit8 v1, v1, 0x1

    .line 149
    .line 150
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 151
    .line 152
    new-instance v5, Lcom/eddyizm/tempus/model/Download;

    .line 153
    .line 154
    invoke-direct {v5, v4}, Lcom/eddyizm/tempus/model/Download;-><init>(Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    goto :goto_0

    .line 161
    :cond_2
    invoke-virtual {p1, v0, v2}, Leu0;->f(Ljava/util/List;Ljava/util/List;)V

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_3
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    :goto_1
    if-ge v1, p1, :cond_4

    .line 170
    .line 171
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    add-int/lit8 v1, v1, 0x1

    .line 176
    .line 177
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 178
    .line 179
    invoke-static {v0}, Lg51;->b(Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 180
    .line 181
    .line 182
    goto :goto_1

    .line 183
    :cond_4
    :goto_2
    invoke-virtual {p0}, Lrm3;->z()V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :pswitch_2
    iget-object p1, p0, Lrn1;->o:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast p1, Ll92;

    .line 190
    .line 191
    iget-object p2, p0, Lrn1;->p:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast p2, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;

    .line 194
    .line 195
    iget-object p0, p0, Lrn1;->q:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast p0, Ll92;

    .line 198
    .line 199
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    const-string v3, "music_directory_section_visibility"

    .line 215
    .line 216
    invoke-interface {v0, v3, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1}, Ll92;->run()V

    .line 224
    .line 225
    .line 226
    iget-object p1, p2, Lkc1;->T:Landroid/view/View;

    .line 227
    .line 228
    if-nez p1, :cond_5

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_5
    invoke-virtual {p2}, Lkc1;->l()Lnc1;

    .line 232
    .line 233
    .line 234
    move-result-object p2

    .line 235
    instance-of v0, p2, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 236
    .line 237
    if-eqz v0, :cond_6

    .line 238
    .line 239
    check-cast p2, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 240
    .line 241
    goto :goto_3

    .line 242
    :cond_6
    move-object p2, v2

    .line 243
    :goto_3
    sget-object v0, Lqg4;->E:[I

    .line 244
    .line 245
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    const v3, 0x7f1301a8

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-static {p1, v0, v1}, Lqg4;->h(Landroid/view/View;Ljava/lang/CharSequence;I)Lqg4;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    if-eqz p2, :cond_7

    .line 261
    .line 262
    invoke-virtual {p2}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->u()Landroid/widget/FrameLayout;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    :cond_7
    invoke-virtual {p1, v2}, Lfr;->e(Landroid/widget/FrameLayout;)V

    .line 267
    .line 268
    .line 269
    new-instance p2, Lp6;

    .line 270
    .line 271
    const/16 v0, 0x11

    .line 272
    .line 273
    invoke-direct {p2, v0, p0}, Lp6;-><init>(ILjava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    const p0, 0x7f130248

    .line 277
    .line 278
    .line 279
    invoke-virtual {p1, p0, p2}, Lqg4;->i(ILandroid/view/View$OnClickListener;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {p1}, Lqg4;->j()V

    .line 283
    .line 284
    .line 285
    :goto_4
    return-void

    .line 286
    nop

    .line 287
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
