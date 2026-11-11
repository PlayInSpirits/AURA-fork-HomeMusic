.class public final synthetic Li8;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Li8;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Li8;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Li8;->p:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 5

    .line 1
    iget p1, p0, Li8;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    const v2, 0x7f13007a

    .line 6
    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    iget-object v4, p0, Li8;->p:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p0, p0, Li8;->o:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch p1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p0, Luv4;

    .line 17
    .line 18
    check-cast v4, Lik;

    .line 19
    .line 20
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-static {p1, v4}, Ll93;->t(Landroid/content/Context;Lik;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object v0, v4, Lik;->d:Ljava/lang/String;

    .line 32
    .line 33
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p0, v2, v0}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p1, p0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 46
    .line 47
    .line 48
    return v3

    .line 49
    :pswitch_0
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;

    .line 50
    .line 51
    check-cast v4, Lik;

    .line 52
    .line 53
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1, v4}, Ll93;->t(Landroid/content/Context;Lik;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget-object v0, v4, Lik;->d:Ljava/lang/String;

    .line 65
    .line 66
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {p0, v2, v0}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-static {p1, p0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 79
    .line 80
    .line 81
    return v3

    .line 82
    :pswitch_1
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 83
    .line 84
    check-cast v4, Landroid/widget/TextView;

    .line 85
    .line 86
    invoke-virtual {v4}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-nez v0, :cond_0

    .line 95
    .line 96
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    const-string v4, "clipboard"

    .line 101
    .line 102
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Landroid/content/ClipboardManager;

    .line 107
    .line 108
    const v4, 0x7f130056

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0, v4}, Lkc1;->s(I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    invoke-static {v4, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-virtual {v0, v4}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p0, v2, p1}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-static {v0, p0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 139
    .line 140
    .line 141
    :cond_0
    return v3

    .line 142
    :pswitch_2
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 143
    .line 144
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 145
    .line 146
    new-instance p1, Landroid/os/Bundle;

    .line 147
    .line 148
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 149
    .line 150
    .line 151
    const-string v1, "TRACK_OBJECT"

    .line 152
    .line 153
    invoke-virtual {p1, v1, v4}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 154
    .line 155
    .line 156
    new-instance v1, Lou3;

    .line 157
    .line 158
    invoke-direct {v1}, Lou3;-><init>()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, p1}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    invoke-virtual {p0}, Lnc1;->k()Lmd1;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-virtual {v1, p0, v0}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    return v3

    .line 176
    :pswitch_3
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 177
    .line 178
    check-cast v4, Lik;

    .line 179
    .line 180
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-static {p1, v4}, Ll93;->t(Landroid/content/Context;Lik;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    iget-object v0, v4, Lik;->d:Ljava/lang/String;

    .line 192
    .line 193
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-virtual {p0, v2, v0}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-static {p1, p0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 202
    .line 203
    .line 204
    move-result-object p0

    .line 205
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 206
    .line 207
    .line 208
    return v3

    .line 209
    :pswitch_4
    check-cast p0, Lq7;

    .line 210
    .line 211
    check-cast v4, Lmo1;

    .line 212
    .line 213
    iget-object p0, p0, Lq7;->u:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 214
    .line 215
    new-instance p1, Landroid/os/Bundle;

    .line 216
    .line 217
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 218
    .line 219
    .line 220
    iget-object v0, v4, Lmo1;->x:Lq7;

    .line 221
    .line 222
    iget-object v0, v0, Lq7;->t:Ljava/util/List;

    .line 223
    .line 224
    invoke-virtual {v4}, Lcx3;->c()I

    .line 225
    .line 226
    .line 227
    move-result v1

    .line 228
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    check-cast v0, Landroid/os/Parcelable;

    .line 233
    .line 234
    const-string v1, "PLAYLIST_OBJECT"

    .line 235
    .line 236
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 237
    .line 238
    .line 239
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onPlaylistLongClick(Landroid/os/Bundle;)V

    .line 240
    .line 241
    .line 242
    return v3

    .line 243
    :pswitch_5
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;

    .line 244
    .line 245
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 246
    .line 247
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getYear()I

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    if-gtz p1, :cond_1

    .line 252
    .line 253
    goto :goto_0

    .line 254
    :cond_1
    const-string v0, "year"

    .line 255
    .line 256
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object p1

    .line 260
    invoke-static {v0, p1}, Ll93;->h(Ljava/lang/String;Ljava/lang/String;)Lik;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    :goto_0
    if-eqz v0, :cond_2

    .line 265
    .line 266
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-static {p1, v0}, Ll93;->t(Landroid/content/Context;Lik;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    iget-object v0, v0, Lik;->d:Ljava/lang/String;

    .line 278
    .line 279
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-virtual {p0, v2, v0}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object p0

    .line 287
    invoke-static {p1, p0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 292
    .line 293
    .line 294
    :cond_2
    return v3

    .line 295
    :pswitch_6
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;

    .line 296
    .line 297
    check-cast v4, Lik;

    .line 298
    .line 299
    if-eqz v4, :cond_3

    .line 300
    .line 301
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    invoke-static {p1, v4}, Ll93;->t(Landroid/content/Context;Lik;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    iget-object v0, v4, Lik;->d:Ljava/lang/String;

    .line 313
    .line 314
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    invoke-virtual {p0, v2, v0}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    invoke-static {p1, p0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 323
    .line 324
    .line 325
    move-result-object p0

    .line 326
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 327
    .line 328
    .line 329
    move v1, v3

    .line 330
    :cond_3
    return v1

    .line 331
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
