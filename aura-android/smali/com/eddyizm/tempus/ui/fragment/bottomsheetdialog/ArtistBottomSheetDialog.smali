.class public Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;
.super Lzt;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public B0:Lbj;

.field public C0:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

.field public D0:Lbl2;

.field public E0:Z

.field public F0:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lzt;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->E0:Z

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-boolean v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->F0:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    .line 1
    const p3, 0x7f0d0021

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
    iget-object p2, p0, Lkc1;->s:Landroid/os/Bundle;

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    const-string p3, "ARTIST_OBJECT"

    .line 14
    .line 15
    invoke-virtual {p2, p3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 22
    .line 23
    if-nez p2, :cond_1

    .line 24
    .line 25
    :cond_0
    move-object v1, p0

    .line 26
    goto/16 :goto_1

    .line 27
    .line 28
    :cond_1
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->strippedForNav()Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    iput-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 33
    .line 34
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p2}, Ll70;->d()Le75;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    invoke-static {p2}, Lgh0;->r(Lf75;)Lb75;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {p2, v1}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    new-instance v2, Lbq4;

    .line 51
    .line 52
    invoke-direct {v2, p3, v1, p2}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 53
    .line 54
    .line 55
    const-class p2, Lbj;

    .line 56
    .line 57
    invoke-static {p2}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-virtual {p2}, Li30;->b()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    const/4 v1, 0x0

    .line 66
    if-eqz p3, :cond_6

    .line 67
    .line 68
    const-string v3, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 69
    .line 70
    invoke-virtual {v3, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p3

    .line 74
    invoke-virtual {v2, p2, p3}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    check-cast p2, Lbj;

    .line 79
    .line 80
    iput-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->B0:Lbj;

    .line 81
    .line 82
    iget-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 83
    .line 84
    iput-object p3, p2, Lbj;->g:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 85
    .line 86
    iput-object v1, p2, Lbj;->f:Lk03;

    .line 87
    .line 88
    const p2, 0x7f0a0443

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    check-cast p2, Landroid/view/ViewGroup;

    .line 96
    .line 97
    invoke-static {p2}, Lq05;->u(Landroid/view/ViewGroup;)V

    .line 98
    .line 99
    .line 100
    const p2, 0x7f0a00e8

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    check-cast p2, Landroid/widget/ImageView;

    .line 108
    .line 109
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 110
    .line 111
    .line 112
    move-result-object p3

    .line 113
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->B0:Lbj;

    .line 114
    .line 115
    iget-object v2, v2, Lbj;->g:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 116
    .line 117
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getCoverArtId()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    invoke-static {p3}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    if-eqz v2, :cond_2

    .line 126
    .line 127
    invoke-static {}, Lud3;->t()I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    invoke-static {v1, v2}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    :cond_2
    const/4 v4, 0x3

    .line 136
    invoke-static {p3, v2, v4, v3, v1}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 137
    .line 138
    .line 139
    move-result-object p3

    .line 140
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    invoke-virtual {p3, v1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 145
    .line 146
    .line 147
    move-result-object p3

    .line 148
    invoke-static {}, Lud3;->R()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-eqz v1, :cond_3

    .line 153
    .line 154
    invoke-virtual {p3}, Llq;->l()Llq;

    .line 155
    .line 156
    .line 157
    move-result-object p3

    .line 158
    check-cast p3, Lvz3;

    .line 159
    .line 160
    :cond_3
    invoke-virtual {p3, p2}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 161
    .line 162
    .line 163
    const p2, 0x7f0a05a0

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    check-cast p2, Landroid/widget/TextView;

    .line 171
    .line 172
    iget-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->B0:Lbj;

    .line 173
    .line 174
    iget-object p3, p3, Lbj;->g:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 175
    .line 176
    invoke-virtual {p3}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p3

    .line 180
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 181
    .line 182
    .line 183
    const/4 p3, 0x1

    .line 184
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setSelected(Z)V

    .line 185
    .line 186
    .line 187
    const p2, 0x7f0a0135

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 191
    .line 192
    .line 193
    move-result-object p2

    .line 194
    check-cast p2, Landroid/widget/ToggleButton;

    .line 195
    .line 196
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->B0:Lbj;

    .line 197
    .line 198
    iget-object v1, v1, Lbj;->g:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 199
    .line 200
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->B0:Lbj;

    .line 205
    .line 206
    iget-object v2, v2, Lbj;->g:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 207
    .line 208
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getStarred()Ljava/util/Date;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    if-eqz v2, :cond_4

    .line 213
    .line 214
    move v2, p3

    .line 215
    goto :goto_0

    .line 216
    :cond_4
    move v2, v0

    .line 217
    :goto_0
    invoke-static {v4, v1, v2}, Ln61;->f(ILjava/lang/String;Z)Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    invoke-virtual {p2, v1}, Landroid/widget/ToggleButton;->setChecked(Z)V

    .line 222
    .line 223
    .line 224
    new-instance v1, Lwi;

    .line 225
    .line 226
    invoke-direct {v1, p0, v0}, Lwi;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 230
    .line 231
    .line 232
    const p2, 0x7f0a02e6

    .line 233
    .line 234
    .line 235
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 236
    .line 237
    .line 238
    move-result-object p2

    .line 239
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 240
    .line 241
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    const/4 v2, 0x2

    .line 246
    if-eqz v1, :cond_5

    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-nez v3, :cond_5

    .line 257
    .line 258
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 259
    .line 260
    .line 261
    new-instance v0, Lj8;

    .line 262
    .line 263
    invoke-direct {v0, v2, p0, v1}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 267
    .line 268
    .line 269
    :cond_5
    const p2, 0x7f0a0466

    .line 270
    .line 271
    .line 272
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 273
    .line 274
    .line 275
    move-result-object p2

    .line 276
    check-cast p2, Landroid/widget/TextView;

    .line 277
    .line 278
    new-instance v0, Lwi;

    .line 279
    .line 280
    invoke-direct {v0, p0, p3}, Lwi;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;I)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 284
    .line 285
    .line 286
    const p2, 0x7f0a0467

    .line 287
    .line 288
    .line 289
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 290
    .line 291
    .line 292
    move-result-object p2

    .line 293
    check-cast p2, Landroid/widget/TextView;

    .line 294
    .line 295
    new-instance p3, Lwi;

    .line 296
    .line 297
    invoke-direct {p3, p0, v2}, Lwi;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;I)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 301
    .line 302
    .line 303
    const p2, 0x7f0a0464

    .line 304
    .line 305
    .line 306
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 307
    .line 308
    .line 309
    move-result-object p2

    .line 310
    move-object v2, p2

    .line 311
    check-cast v2, Landroid/widget/TextView;

    .line 312
    .line 313
    const p2, 0x7f0a0093

    .line 314
    .line 315
    .line 316
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 317
    .line 318
    .line 319
    move-result-object p2

    .line 320
    move-object v3, p2

    .line 321
    check-cast v3, Landroid/widget/TextView;

    .line 322
    .line 323
    const p2, 0x7f0a0091

    .line 324
    .line 325
    .line 326
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 327
    .line 328
    .line 329
    move-result-object p2

    .line 330
    move-object v4, p2

    .line 331
    check-cast v4, Landroid/widget/TextView;

    .line 332
    .line 333
    new-instance v5, Lt6;

    .line 334
    .line 335
    move-object v0, v5

    .line 336
    const/4 v5, 0x1

    .line 337
    move-object v1, p0

    .line 338
    invoke-direct/range {v0 .. v5}, Lt6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 339
    .line 340
    .line 341
    move-object v5, v0

    .line 342
    new-instance v0, Lxi;

    .line 343
    .line 344
    const/4 v6, 0x0

    .line 345
    invoke-direct/range {v0 .. v6}, Lxi;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lt6;I)V

    .line 346
    .line 347
    .line 348
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 349
    .line 350
    .line 351
    new-instance v0, Lxi;

    .line 352
    .line 353
    const/4 v6, 0x1

    .line 354
    invoke-direct/range {v0 .. v6}, Lxi;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lt6;I)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 358
    .line 359
    .line 360
    new-instance v0, Lxi;

    .line 361
    .line 362
    const/4 v6, 0x2

    .line 363
    invoke-direct/range {v0 .. v6}, Lxi;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lt6;I)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 367
    .line 368
    .line 369
    return-object p1

    .line 370
    :cond_6
    const-string p0, "Local and anonymous classes can not be ViewModels"

    .line 371
    .line 372
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    return-object v1

    .line 376
    :goto_1
    invoke-virtual {v1}, Lzt;->n0()V

    .line 377
    .line 378
    .line 379
    return-object p1
.end method

.method public final R()V
    .locals 9

    .line 1
    invoke-super {p0}, Lpp0;->R()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    new-instance v3, Lcb4;

    .line 13
    .line 14
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Landroid/content/ComponentName;

    .line 19
    .line 20
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const-class v5, Lcom/eddyizm/tempus/service/MediaService;

    .line 25
    .line 26
    invoke-direct {v1, v4, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 27
    .line 28
    .line 29
    invoke-direct {v3, v0, v1}, Lcb4;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V

    .line 30
    .line 31
    .line 32
    sget-object v4, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 33
    .line 34
    new-instance v5, Laj2;

    .line 35
    .line 36
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lf35;->x()Landroid/os/Looper;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    new-instance v7, Lbl2;

    .line 44
    .line 45
    invoke-direct {v7, v6}, Lbl2;-><init>(Landroid/os/Looper;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, v3, Lcb4;->a:Lbb4;

    .line 49
    .line 50
    invoke-interface {v0}, Lbb4;->e()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    new-instance v0, Lxc5;

    .line 57
    .line 58
    new-instance v1, Lx7;

    .line 59
    .line 60
    invoke-direct {v1, v2}, Lx7;-><init>(Landroid/content/Context;)V

    .line 61
    .line 62
    .line 63
    new-instance v8, Lfi0;

    .line 64
    .line 65
    invoke-direct {v8, v1}, Lfi0;-><init>(Lx7;)V

    .line 66
    .line 67
    .line 68
    const/4 v1, 0x4

    .line 69
    invoke-direct {v0, v1, v8}, Lxc5;-><init>(ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    :goto_0
    move-object v8, v0

    .line 73
    goto :goto_1

    .line 74
    :cond_0
    const/4 v0, 0x0

    .line 75
    goto :goto_0

    .line 76
    :goto_1
    new-instance v1, Lbj2;

    .line 77
    .line 78
    invoke-direct/range {v1 .. v8}, Lsk2;-><init>(Landroid/content/Context;Lcb4;Landroid/os/Bundle;Lqk2;Landroid/os/Looper;Lbl2;Lxc5;)V

    .line 79
    .line 80
    .line 81
    new-instance v0, Landroid/os/Handler;

    .line 82
    .line 83
    invoke-direct {v0, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 84
    .line 85
    .line 86
    invoke-static {v7, v1, v0}, Lb11;->w(Lbl2;Lbj2;Landroid/os/Handler;)V

    .line 87
    .line 88
    .line 89
    iput-object v7, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->D0:Lbl2;

    .line 90
    .line 91
    :cond_1
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->D0:Lbl2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lsk2;->Z0(Ljava/util/concurrent/Future;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-super {p0}, Lpp0;->S()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
