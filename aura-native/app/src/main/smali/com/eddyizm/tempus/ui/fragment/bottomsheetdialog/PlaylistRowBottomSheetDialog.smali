.class public Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;
.super Ldefpackage/zt;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final B0:Ldefpackage/mm3;

.field public C0:Lcom/eddyizm/tempus/subsonic/models/Playlist;

.field public D0:Ldefpackage/f9;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldefpackage/zt;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldefpackage/mm3;

    .line 5
    .line 6
    invoke-direct {v0}, Ldefpackage/mm3;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->B0:Ldefpackage/mm3;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    .line 1
    const p3, 0x7f0d0024

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object p2, p0, Ldefpackage/kc1;->s:Landroid/os/Bundle;

    .line 10
    .line 11
    if-eqz p2, :cond_3

    .line 12
    .line 13
    const-string p3, "PLAYLIST_OBJECT"

    .line 14
    .line 15
    invoke-virtual {p2, p3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 22
    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    goto/16 :goto_1

    .line 26
    .line 27
    :cond_0
    const p2, 0x7f0a04a8

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    check-cast p2, Landroid/widget/ImageView;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object p3

    .line 40
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getCoverArtId()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {p3}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Ldefpackage/c04;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    invoke-static {}, Ldefpackage/ud3;->t()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    invoke-static {v3, v1}, Ldefpackage/wg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    const/4 v3, 0x0

    .line 62
    :goto_0
    const/4 v4, 0x6

    .line 63
    invoke-static {p3, v1, v4, v2, v3}, Ldefpackage/b11;->g(Landroid/content/Context;Ljava/lang/String;ILdefpackage/c04;Ljava/lang/String;)Ldefpackage/vz3;

    .line 64
    .line 65
    .line 66
    move-result-object p3

    .line 67
    invoke-static {}, Ldefpackage/xv0;->b()Ldefpackage/xv0;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {p3, v1}, Ldefpackage/vz3;->T(Ldefpackage/xv0;)Ldefpackage/vz3;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    invoke-static {}, Ldefpackage/ud3;->R()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-eqz v1, :cond_2

    .line 80
    .line 81
    invoke-virtual {p3}, Ldefpackage/lq;->l()Ldefpackage/lq;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    check-cast p3, Ldefpackage/vz3;

    .line 86
    .line 87
    :cond_2
    invoke-virtual {p3, p2}, Ldefpackage/vz3;->K(Landroid/widget/ImageView;)V

    .line 88
    .line 89
    .line 90
    const p2, 0x7f0a04c7

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    check-cast p2, Landroid/widget/TextView;

    .line 98
    .line 99
    iget-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 100
    .line 101
    invoke-virtual {p3}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p3

    .line 105
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 106
    .line 107
    .line 108
    const/4 p3, 0x1

    .line 109
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setSelected(Z)V

    .line 110
    .line 111
    .line 112
    const p2, 0x7f0a04a7

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    check-cast p2, Landroid/widget/TextView;

    .line 120
    .line 121
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 126
    .line 127
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getSongCount()I

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 136
    .line 137
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getDuration()J

    .line 138
    .line 139
    .line 140
    move-result-wide v5

    .line 141
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    invoke-static {v3, v0}, Ldefpackage/e03;->h(Ljava/lang/Long;Z)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    filled-new-array {v2, v3}, [Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    const v3, 0x7f1303ef

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, v3, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 161
    .line 162
    .line 163
    const p2, 0x7f0a0468

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    new-instance v1, Ldefpackage/nm3;

    .line 171
    .line 172
    invoke-direct {v1, p0, v0}, Ldefpackage/nm3;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;I)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 176
    .line 177
    .line 178
    const p2, 0x7f0a0469

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    new-instance v0, Ldefpackage/nm3;

    .line 186
    .line 187
    const/4 v1, 0x3

    .line 188
    invoke-direct {v0, p0, v1}, Ldefpackage/nm3;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;I)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 192
    .line 193
    .line 194
    const p2, 0x7f0a0463

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 198
    .line 199
    .line 200
    move-result-object p2

    .line 201
    new-instance v0, Ldefpackage/nm3;

    .line 202
    .line 203
    const/4 v2, 0x4

    .line 204
    invoke-direct {v0, p0, v2}, Ldefpackage/nm3;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;I)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 208
    .line 209
    .line 210
    const p2, 0x7f0a0092

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    new-instance v0, Ldefpackage/nm3;

    .line 218
    .line 219
    const/4 v2, 0x5

    .line 220
    invoke-direct {v0, p0, v2}, Ldefpackage/nm3;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 224
    .line 225
    .line 226
    const p2, 0x7f0a01c2

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    new-instance v0, Ldefpackage/nm3;

    .line 234
    .line 235
    invoke-direct {v0, p0, v4}, Ldefpackage/nm3;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;I)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 239
    .line 240
    .line 241
    const p2, 0x7f0a01e5

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 245
    .line 246
    .line 247
    move-result-object p2

    .line 248
    new-instance v0, Ldefpackage/nm3;

    .line 249
    .line 250
    const/4 v2, 0x7

    .line 251
    invoke-direct {v0, p0, v2}, Ldefpackage/nm3;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;I)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 255
    .line 256
    .line 257
    const p2, 0x7f0a01e4

    .line 258
    .line 259
    .line 260
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    new-instance v0, Ldefpackage/nm3;

    .line 265
    .line 266
    const/16 v2, 0x8

    .line 267
    .line 268
    invoke-direct {v0, p0, v2}, Ldefpackage/nm3;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;I)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 272
    .line 273
    .line 274
    const p2, 0x7f0a0459

    .line 275
    .line 276
    .line 277
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 278
    .line 279
    .line 280
    move-result-object p2

    .line 281
    const v0, 0x7f0a0648

    .line 282
    .line 283
    .line 284
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->B0:Ldefpackage/mm3;

    .line 289
    .line 290
    iget-object v2, v2, Ldefpackage/mm3;->a:Ldefpackage/hg3;

    .line 291
    .line 292
    iget-object v2, v2, Ldefpackage/hg3;->o:Ljava/lang/Object;

    .line 293
    .line 294
    check-cast v2, Ldefpackage/s24;

    .line 295
    .line 296
    invoke-virtual {v2}, Ldefpackage/s24;->i()Ldefpackage/s12;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    const-string v3, "pinned_playlist"

    .line 301
    .line 302
    filled-new-array {v3}, [Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    new-instance v4, Ldefpackage/k52;

    .line 307
    .line 308
    const/16 v5, 0x1a

    .line 309
    .line 310
    invoke-direct {v4, v5}, Ldefpackage/k52;-><init>(I)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2, v3, v4}, Ldefpackage/s12;->a([Ljava/lang/String;Ldefpackage/if1;)Ldefpackage/t24;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    invoke-virtual {p0}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    new-instance v4, Ldefpackage/z6;

    .line 322
    .line 323
    invoke-direct {v4, p0, p2, v0, v1}, Ldefpackage/z6;-><init>(Ldefpackage/zt;Ljava/lang/Object;Landroid/view/KeyEvent$Callback;I)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {v2, v3, v4}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 327
    .line 328
    .line 329
    new-instance v1, Ldefpackage/nm3;

    .line 330
    .line 331
    const/16 v2, 0x9

    .line 332
    .line 333
    invoke-direct {v1, p0, v2}, Ldefpackage/nm3;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;I)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 337
    .line 338
    .line 339
    new-instance p2, Ldefpackage/nm3;

    .line 340
    .line 341
    invoke-direct {p2, p0, p3}, Ldefpackage/nm3;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;I)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 345
    .line 346
    .line 347
    const p2, 0x7f0a019e

    .line 348
    .line 349
    .line 350
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 351
    .line 352
    .line 353
    move-result-object p2

    .line 354
    new-instance p3, Ldefpackage/nm3;

    .line 355
    .line 356
    const/4 v0, 0x2

    .line 357
    invoke-direct {p3, p0, v0}, Ldefpackage/nm3;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;I)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 361
    .line 362
    .line 363
    return-object p1

    .line 364
    :cond_3
    :goto_1
    invoke-virtual {p0}, Ldefpackage/zt;->n0()V

    .line 365
    .line 366
    .line 367
    return-object p1
.end method

.method public final J()V
    .locals 1

    .line 1
    invoke-super {p0}, Ldefpackage/pp0;->J()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->D0:Ldefpackage/f9;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->D0:Ldefpackage/f9;

    .line 15
    .line 16
    invoke-virtual {v0}, Ldefpackage/dg;->dismiss()V

    .line 17
    .line 18
    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->D0:Ldefpackage/f9;

    .line 21
    .line 22
    return-void
.end method

.method public final o0(Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 2
    .line 3
    new-instance v1, Ldefpackage/lg1;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->B0:Ldefpackage/mm3;

    .line 6
    .line 7
    iget-object v3, v2, Ldefpackage/mm3;->b:Ldefpackage/ml3;

    .line 8
    .line 9
    const/16 v4, 0x15

    .line 10
    .line 11
    invoke-direct {v1, v4, v3, v0}, Ldefpackage/lg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Ljava/lang/Thread;

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v0, Ljava/lang/Thread;

    .line 31
    .line 32
    new-instance v1, Ldefpackage/jm3;

    .line 33
    .line 34
    const/4 v3, 0x1

    .line 35
    invoke-direct {v1, v2, p1, v3}, Ldefpackage/jm3;-><init>(Ldefpackage/mm3;Ljava/lang/String;I)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    new-instance v0, Ljava/lang/Thread;

    .line 50
    .line 51
    new-instance v1, Ldefpackage/jm3;

    .line 52
    .line 53
    const/4 v3, 0x0

    .line 54
    invoke-direct {v1, v2, p1, v3}, Ldefpackage/jm3;-><init>(Ldefpackage/mm3;Ljava/lang/String;I)V

    .line 55
    .line 56
    .line 57
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 61
    .line 62
    .line 63
    :goto_0
    invoke-virtual {p0}, Ldefpackage/zt;->h0()V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final p0(Ljava/util/function/BiConsumer;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Ldefpackage/kc1;->q()Ldefpackage/ld1;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v1, v1, Ldefpackage/ld1;->y:Ldefpackage/kc1;

    .line 15
    .line 16
    if-eqz v1, :cond_2

    .line 17
    .line 18
    iget-object v2, v1, Ldefpackage/kc1;->T:Landroid/view/View;

    .line 19
    .line 20
    if-nez v2, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {p0}, Ldefpackage/zt;->h0()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ldefpackage/kc1;->v()Ldefpackage/le1;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    new-instance v2, Ldefpackage/xd0;

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    invoke-direct {v2, v3, p1, v0}, Ldefpackage/xd0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    new-instance p1, Ldefpackage/mm3;

    .line 43
    .line 44
    invoke-direct {p1}, Ldefpackage/mm3;-><init>()V

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    invoke-virtual {p1, p0, v3, v0}, Ldefpackage/mm3;->c(Ljava/lang/String;ZLjava/lang/Runnable;)Ldefpackage/k03;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    new-instance p1, Ldefpackage/i7;

    .line 53
    .line 54
    invoke-direct {p1, v3, p0, v2}, Ldefpackage/i7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v1, p1}, Ldefpackage/ad2;->e(Ldefpackage/ba2;Ldefpackage/a83;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    :goto_0
    return-void
.end method
