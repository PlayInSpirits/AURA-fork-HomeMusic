.class public Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;
.super Lzt;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public B0:Lcom/eddyizm/tempus/viewmodel/b;

.field public C0:Lii4;

.field public D0:Lcom/eddyizm/tempus/subsonic/models/Child;

.field public E0:Z

.field public F0:Landroid/widget/TextView;

.field public G0:Landroid/widget/TextView;

.field public H0:Lcom/google/android/material/chip/ChipGroup;

.field public I0:Lcom/google/android/material/chip/Chip;

.field public J0:Lcom/google/android/material/chip/Chip;

.field public K0:Lcom/google/android/material/chip/Chip;

.field public L0:Lik;

.field public M0:Lik;

.field public N0:Z

.field public O0:Lbl2;


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
    iput-boolean v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->N0:Z

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 11

    .line 1
    const p3, 0x7f0d0028

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
    if-eqz p2, :cond_1d

    .line 12
    .line 13
    const-string p3, "TRACK_OBJECT"

    .line 14
    .line 15
    invoke-virtual {p2, p3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    check-cast p3, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 20
    .line 21
    iput-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 22
    .line 23
    if-nez p3, :cond_0

    .line 24
    .line 25
    goto/16 :goto_13

    .line 26
    .line 27
    :cond_0
    const-string p3, "homemusic_song_sheet_from_player"

    .line 28
    .line 29
    invoke-virtual {p2, p3, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    iput-boolean p2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->E0:Z

    .line 34
    .line 35
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {p2}, Ll70;->d()Le75;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    invoke-static {p2}, Lgh0;->r(Lf75;)Lb75;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-static {p2, v1}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    new-instance v2, Lbq4;

    .line 52
    .line 53
    invoke-direct {v2, p3, v1, p2}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 54
    .line 55
    .line 56
    const-class p2, Lcom/eddyizm/tempus/viewmodel/b;

    .line 57
    .line 58
    invoke-static {p2}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-virtual {p2}, Li30;->b()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    const/4 v1, 0x0

    .line 67
    const-string v3, "Local and anonymous classes can not be ViewModels"

    .line 68
    .line 69
    if-eqz p3, :cond_1c

    .line 70
    .line 71
    const-string v4, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 72
    .line 73
    invoke-virtual {v4, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    invoke-virtual {v2, p2, p3}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    check-cast p2, Lcom/eddyizm/tempus/viewmodel/b;

    .line 82
    .line 83
    iput-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->B0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 84
    .line 85
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-virtual {p2}, Ll70;->d()Le75;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    invoke-static {p2}, Lgh0;->r(Lf75;)Lb75;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-static {p2, v2}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 98
    .line 99
    .line 100
    move-result-object p2

    .line 101
    new-instance v5, Lbq4;

    .line 102
    .line 103
    invoke-direct {v5, p3, v2, p2}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 104
    .line 105
    .line 106
    const-class p2, Lii4;

    .line 107
    .line 108
    invoke-static {p2}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-virtual {p2}, Li30;->b()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p3

    .line 116
    if-eqz p3, :cond_1b

    .line 117
    .line 118
    invoke-virtual {v4, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p3

    .line 122
    invoke-virtual {v5, p2, p3}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    check-cast p2, Lii4;

    .line 127
    .line 128
    iput-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->C0:Lii4;

    .line 129
    .line 130
    iget-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 131
    .line 132
    iput-object p3, p2, Lii4;->h:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 133
    .line 134
    const p2, 0x7f0a0443

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    check-cast p2, Landroid/view/ViewGroup;

    .line 142
    .line 143
    invoke-static {p2}, Lq05;->u(Landroid/view/ViewGroup;)V

    .line 144
    .line 145
    .line 146
    const p2, 0x7f0a0599

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    check-cast p2, Landroid/widget/ImageView;

    .line 154
    .line 155
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 156
    .line 157
    .line 158
    move-result-object p3

    .line 159
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->C0:Lii4;

    .line 160
    .line 161
    iget-object v2, v2, Lii4;->h:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 162
    .line 163
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-static {p3}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    if-eqz v2, :cond_1

    .line 172
    .line 173
    invoke-static {}, Lud3;->t()I

    .line 174
    .line 175
    .line 176
    move-result v4

    .line 177
    invoke-static {v4, v2}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    goto :goto_0

    .line 182
    :cond_1
    move-object v4, v1

    .line 183
    :goto_0
    const/16 v5, 0x9

    .line 184
    .line 185
    invoke-static {p3, v2, v5, v3, v4}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 186
    .line 187
    .line 188
    move-result-object p3

    .line 189
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 190
    .line 191
    .line 192
    move-result-object v2

    .line 193
    invoke-virtual {p3, v2}, Lvz3;->T(Lxv0;)Lvz3;

    .line 194
    .line 195
    .line 196
    move-result-object p3

    .line 197
    invoke-static {}, Lud3;->R()Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    if-eqz v2, :cond_2

    .line 202
    .line 203
    invoke-virtual {p3}, Llq;->l()Llq;

    .line 204
    .line 205
    .line 206
    move-result-object p3

    .line 207
    check-cast p3, Lvz3;

    .line 208
    .line 209
    :cond_2
    invoke-virtual {p3, p2}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 210
    .line 211
    .line 212
    const p3, 0x7f0a05a0

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 216
    .line 217
    .line 218
    move-result-object p3

    .line 219
    check-cast p3, Landroid/widget/TextView;

    .line 220
    .line 221
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->C0:Lii4;

    .line 222
    .line 223
    iget-object v2, v2, Lii4;->h:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 224
    .line 225
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v2

    .line 229
    invoke-virtual {p3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 230
    .line 231
    .line 232
    const/4 v2, 0x1

    .line 233
    invoke-virtual {p3, v2}, Landroid/widget/TextView;->setSelected(Z)V

    .line 234
    .line 235
    .line 236
    const v3, 0x7f0a0597

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 240
    .line 241
    .line 242
    move-result-object v3

    .line 243
    check-cast v3, Landroid/widget/TextView;

    .line 244
    .line 245
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->C0:Lii4;

    .line 246
    .line 247
    iget-object v4, v4, Lii4;->h:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 248
    .line 249
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 254
    .line 255
    .line 256
    const v4, 0x7f0a00fe

    .line 257
    .line 258
    .line 259
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 260
    .line 261
    .line 262
    move-result-object v4

    .line 263
    check-cast v4, Lcom/google/android/material/chip/ChipGroup;

    .line 264
    .line 265
    iput-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->H0:Lcom/google/android/material/chip/ChipGroup;

    .line 266
    .line 267
    const v4, 0x7f0a00ff

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    check-cast v4, Lcom/google/android/material/chip/Chip;

    .line 275
    .line 276
    iput-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->I0:Lcom/google/android/material/chip/Chip;

    .line 277
    .line 278
    const v4, 0x7f0a00fc

    .line 279
    .line 280
    .line 281
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    check-cast v4, Lcom/google/android/material/chip/Chip;

    .line 286
    .line 287
    iput-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->J0:Lcom/google/android/material/chip/Chip;

    .line 288
    .line 289
    const v4, 0x7f0a00fd

    .line 290
    .line 291
    .line 292
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 293
    .line 294
    .line 295
    move-result-object v4

    .line 296
    check-cast v4, Lcom/google/android/material/chip/Chip;

    .line 297
    .line 298
    iput-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->K0:Lcom/google/android/material/chip/Chip;

    .line 299
    .line 300
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->I0:Lcom/google/android/material/chip/Chip;

    .line 301
    .line 302
    iget-object v6, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 303
    .line 304
    invoke-virtual {v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 305
    .line 306
    .line 307
    move-result-object v6

    .line 308
    const-string v7, "song"

    .line 309
    .line 310
    invoke-virtual {p0, v4, v7, v6}, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->o0(Lcom/google/android/material/chip/Chip;Ljava/lang/String;Ljava/lang/String;)Lik;

    .line 311
    .line 312
    .line 313
    move-result-object v4

    .line 314
    iput-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->L0:Lik;

    .line 315
    .line 316
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->J0:Lcom/google/android/material/chip/Chip;

    .line 317
    .line 318
    iget-object v6, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 319
    .line 320
    invoke-virtual {v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v6

    .line 324
    const-string v7, "album"

    .line 325
    .line 326
    invoke-virtual {p0, v4, v7, v6}, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->o0(Lcom/google/android/material/chip/Chip;Ljava/lang/String;Ljava/lang/String;)Lik;

    .line 327
    .line 328
    .line 329
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->K0:Lcom/google/android/material/chip/Chip;

    .line 330
    .line 331
    iget-object v6, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 332
    .line 333
    invoke-virtual {v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v6

    .line 337
    const-string v7, "artist"

    .line 338
    .line 339
    invoke-virtual {p0, v4, v7, v6}, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->o0(Lcom/google/android/material/chip/Chip;Ljava/lang/String;Ljava/lang/String;)Lik;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    iput-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->M0:Lik;

    .line 344
    .line 345
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->H0:Lcom/google/android/material/chip/ChipGroup;

    .line 346
    .line 347
    const/16 v6, 0x8

    .line 348
    .line 349
    if-nez v4, :cond_3

    .line 350
    .line 351
    goto :goto_4

    .line 352
    :cond_3
    move v4, v0

    .line 353
    :goto_1
    iget-object v7, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->H0:Lcom/google/android/material/chip/ChipGroup;

    .line 354
    .line 355
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    .line 356
    .line 357
    .line 358
    move-result v7

    .line 359
    if-ge v4, v7, :cond_5

    .line 360
    .line 361
    iget-object v7, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->H0:Lcom/google/android/material/chip/ChipGroup;

    .line 362
    .line 363
    invoke-virtual {v7, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 364
    .line 365
    .line 366
    move-result-object v7

    .line 367
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 368
    .line 369
    .line 370
    move-result v7

    .line 371
    if-nez v7, :cond_4

    .line 372
    .line 373
    move v4, v2

    .line 374
    goto :goto_2

    .line 375
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 376
    .line 377
    goto :goto_1

    .line 378
    :cond_5
    move v4, v0

    .line 379
    :goto_2
    iget-object v7, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->H0:Lcom/google/android/material/chip/ChipGroup;

    .line 380
    .line 381
    if-eqz v4, :cond_6

    .line 382
    .line 383
    move v4, v0

    .line 384
    goto :goto_3

    .line 385
    :cond_6
    move v4, v6

    .line 386
    :goto_3
    invoke-virtual {v7, v4}, Landroid/view/View;->setVisibility(I)V

    .line 387
    .line 388
    .line 389
    :goto_4
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->L0:Lik;

    .line 390
    .line 391
    invoke-virtual {p0, p2, v4}, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->p0(Landroid/view/View;Lik;)V

    .line 392
    .line 393
    .line 394
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->L0:Lik;

    .line 395
    .line 396
    invoke-virtual {p0, p3, p2}, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->p0(Landroid/view/View;Lik;)V

    .line 397
    .line 398
    .line 399
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->M0:Lik;

    .line 400
    .line 401
    if-eqz p2, :cond_7

    .line 402
    .line 403
    goto :goto_5

    .line 404
    :cond_7
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->L0:Lik;

    .line 405
    .line 406
    :goto_5
    invoke-virtual {p0, v3, p2}, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->p0(Landroid/view/View;Lik;)V

    .line 407
    .line 408
    .line 409
    const p2, 0x7f0a0135

    .line 410
    .line 411
    .line 412
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 413
    .line 414
    .line 415
    move-result-object p3

    .line 416
    check-cast p3, Landroid/widget/ToggleButton;

    .line 417
    .line 418
    new-instance v3, Lei4;

    .line 419
    .line 420
    invoke-direct {v3, v0, p0}, Lei4;-><init>(ILkc1;)V

    .line 421
    .line 422
    .line 423
    invoke-static {p3, v3}, Lot1;->f(Landroid/widget/ToggleButton;Ljava/util/function/Supplier;)V

    .line 424
    .line 425
    .line 426
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->C0:Lii4;

    .line 427
    .line 428
    iget-object v3, v3, Lii4;->h:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 429
    .line 430
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v3

    .line 434
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->C0:Lii4;

    .line 435
    .line 436
    iget-object v4, v4, Lii4;->h:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 437
    .line 438
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getStarred()Ljava/util/Date;

    .line 439
    .line 440
    .line 441
    move-result-object v4

    .line 442
    if-eqz v4, :cond_8

    .line 443
    .line 444
    move v4, v2

    .line 445
    goto :goto_6

    .line 446
    :cond_8
    move v4, v0

    .line 447
    :goto_6
    invoke-static {v2, v3, v4}, Ln61;->f(ILjava/lang/String;Z)Z

    .line 448
    .line 449
    .line 450
    move-result v3

    .line 451
    invoke-virtual {p3, v3}, Landroid/widget/ToggleButton;->setChecked(Z)V

    .line 452
    .line 453
    .line 454
    new-instance v3, Lci4;

    .line 455
    .line 456
    invoke-direct {v3, p0, v6}, Lci4;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;I)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {p3, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 460
    .line 461
    .line 462
    new-instance v3, Lq6;

    .line 463
    .line 464
    const/16 v4, 0x17

    .line 465
    .line 466
    invoke-direct {v3, v4, p0}, Lq6;-><init>(ILjava/lang/Object;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {p3, v3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 470
    .line 471
    .line 472
    const p3, 0x7f0a0466

    .line 473
    .line 474
    .line 475
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 476
    .line 477
    .line 478
    move-result-object p3

    .line 479
    check-cast p3, Landroid/widget/TextView;

    .line 480
    .line 481
    new-instance v3, Lci4;

    .line 482
    .line 483
    invoke-direct {v3, p0, v5}, Lci4;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;I)V

    .line 484
    .line 485
    .line 486
    invoke-virtual {p3, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 487
    .line 488
    .line 489
    const p3, 0x7f0a0464

    .line 490
    .line 491
    .line 492
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 493
    .line 494
    .line 495
    move-result-object p3

    .line 496
    check-cast p3, Landroid/widget/TextView;

    .line 497
    .line 498
    new-instance v3, Lci4;

    .line 499
    .line 500
    invoke-direct {v3, p0, v0}, Lci4;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;I)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {p3, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 504
    .line 505
    .line 506
    const p3, 0x7f0a0093

    .line 507
    .line 508
    .line 509
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 510
    .line 511
    .line 512
    move-result-object p3

    .line 513
    check-cast p3, Landroid/widget/TextView;

    .line 514
    .line 515
    new-instance v3, Lci4;

    .line 516
    .line 517
    invoke-direct {v3, p0, v2}, Lci4;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;I)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {p3, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 521
    .line 522
    .line 523
    const p3, 0x7f0a0509

    .line 524
    .line 525
    .line 526
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 527
    .line 528
    .line 529
    move-result-object p3

    .line 530
    check-cast p3, Landroid/widget/TextView;

    .line 531
    .line 532
    new-instance v3, Lci4;

    .line 533
    .line 534
    const/4 v4, 0x2

    .line 535
    invoke-direct {v3, p0, v4}, Lci4;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;I)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {p3, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 539
    .line 540
    .line 541
    iget-object p3, p0, Lkc1;->s:Landroid/os/Bundle;

    .line 542
    .line 543
    if-eqz p3, :cond_9

    .line 544
    .line 545
    const-string v3, "PLAYLIST_ID"

    .line 546
    .line 547
    invoke-virtual {p3, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v3

    .line 551
    goto :goto_7

    .line 552
    :cond_9
    move-object v3, v1

    .line 553
    :goto_7
    if-eqz p3, :cond_a

    .line 554
    .line 555
    const-string v4, "PLAYLIST_NAME"

    .line 556
    .line 557
    invoke-virtual {p3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 558
    .line 559
    .line 560
    move-result-object v4

    .line 561
    goto :goto_8

    .line 562
    :cond_a
    move-object v4, v1

    .line 563
    :goto_8
    const/4 v7, -0x1

    .line 564
    if-eqz p3, :cond_b

    .line 565
    .line 566
    const-string v8, "ITEM_POSITION"

    .line 567
    .line 568
    invoke-virtual {p3, v8, v7}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 569
    .line 570
    .line 571
    move-result p3

    .line 572
    goto :goto_9

    .line 573
    :cond_b
    move p3, v7

    .line 574
    :goto_9
    const v8, 0x7f0a01c7

    .line 575
    .line 576
    .line 577
    invoke-virtual {p1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 578
    .line 579
    .line 580
    move-result-object v9

    .line 581
    check-cast v9, Landroid/widget/TextView;

    .line 582
    .line 583
    iput-object v9, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->F0:Landroid/widget/TextView;

    .line 584
    .line 585
    new-instance v10, Let1;

    .line 586
    .line 587
    invoke-direct {v10, p0, v3, v4, v2}, Let1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v9, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 591
    .line 592
    .line 593
    const v4, 0x7f0a051a

    .line 594
    .line 595
    .line 596
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 597
    .line 598
    .line 599
    move-result-object v4

    .line 600
    check-cast v4, Landroid/widget/TextView;

    .line 601
    .line 602
    iput-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->G0:Landroid/widget/TextView;

    .line 603
    .line 604
    new-instance v9, Lci4;

    .line 605
    .line 606
    const/4 v10, 0x3

    .line 607
    invoke-direct {v9, p0, v10}, Lci4;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;I)V

    .line 608
    .line 609
    .line 610
    invoke-virtual {v4, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 611
    .line 612
    .line 613
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->q0()V

    .line 614
    .line 615
    .line 616
    const v4, 0x7f0a0519

    .line 617
    .line 618
    .line 619
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 620
    .line 621
    .line 622
    move-result-object v4

    .line 623
    check-cast v4, Landroid/widget/TextView;

    .line 624
    .line 625
    if-eqz v3, :cond_c

    .line 626
    .line 627
    if-eq p3, v7, :cond_c

    .line 628
    .line 629
    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 630
    .line 631
    .line 632
    new-instance v7, Lwi3;

    .line 633
    .line 634
    invoke-direct {v7, p0, v3, p3, v2}, Lwi3;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 635
    .line 636
    .line 637
    invoke-virtual {v4, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 638
    .line 639
    .line 640
    :cond_c
    const p3, 0x7f0a02dd

    .line 641
    .line 642
    .line 643
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 644
    .line 645
    .line 646
    move-result-object p3

    .line 647
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 648
    .line 649
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 650
    .line 651
    .line 652
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 653
    .line 654
    .line 655
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object v4

    .line 659
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getStarred()Ljava/util/Date;

    .line 660
    .line 661
    .line 662
    move-result-object v7

    .line 663
    if-eqz v7, :cond_d

    .line 664
    .line 665
    move v7, v2

    .line 666
    goto :goto_a

    .line 667
    :cond_d
    move v7, v0

    .line 668
    :goto_a
    invoke-static {v2, v4, v7}, Ln61;->f(ILjava/lang/String;Z)Z

    .line 669
    .line 670
    .line 671
    move-result v4

    .line 672
    iget-object v7, p0, Lkc1;->s:Landroid/os/Bundle;

    .line 673
    .line 674
    if-eqz v7, :cond_e

    .line 675
    .line 676
    const-string v9, "homemusic_song_sheet_from_liked"

    .line 677
    .line 678
    invoke-virtual {v7, v9}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 679
    .line 680
    .line 681
    move-result v7

    .line 682
    if-ne v7, v2, :cond_e

    .line 683
    .line 684
    move v7, v2

    .line 685
    goto :goto_b

    .line 686
    :cond_e
    move v7, v0

    .line 687
    :goto_b
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v9

    .line 691
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 692
    .line 693
    .line 694
    if-eqz v7, :cond_f

    .line 695
    .line 696
    if-eqz v4, :cond_f

    .line 697
    .line 698
    invoke-static {v9}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 699
    .line 700
    .line 701
    move-result v4

    .line 702
    if-nez v4, :cond_f

    .line 703
    .line 704
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 705
    .line 706
    .line 707
    new-instance v4, Lj8;

    .line 708
    .line 709
    const/16 v7, 0xb

    .line 710
    .line 711
    invoke-direct {v4, v7, p0, v3}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 712
    .line 713
    .line 714
    invoke-virtual {p3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 715
    .line 716
    .line 717
    goto :goto_c

    .line 718
    :cond_f
    invoke-virtual {p3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 719
    .line 720
    .line 721
    :goto_c
    const p3, 0x7f0a02d7

    .line 722
    .line 723
    .line 724
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 725
    .line 726
    .line 727
    move-result-object p3

    .line 728
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 729
    .line 730
    new-instance v4, Lbi4;

    .line 731
    .line 732
    invoke-direct {v4, p0, v2}, Lbi4;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;I)V

    .line 733
    .line 734
    .line 735
    sget-object v7, Lur1;->a:Ljava/util/concurrent/ExecutorService;

    .line 736
    .line 737
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 738
    .line 739
    .line 740
    if-nez p3, :cond_10

    .line 741
    .line 742
    goto :goto_d

    .line 743
    :cond_10
    invoke-static {v3}, Lur1;->b(Lcom/eddyizm/tempus/subsonic/models/Child;)Z

    .line 744
    .line 745
    .line 746
    move-result v7

    .line 747
    if-nez v7, :cond_11

    .line 748
    .line 749
    invoke-virtual {p3, v6}, Landroid/view/View;->setVisibility(I)V

    .line 750
    .line 751
    .line 752
    goto :goto_d

    .line 753
    :cond_11
    invoke-virtual {p3, v0}, Landroid/view/View;->setVisibility(I)V

    .line 754
    .line 755
    .line 756
    new-instance v7, Lsr1;

    .line 757
    .line 758
    invoke-direct {v7, v4, v3}, Lsr1;-><init>(Lbi4;Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {p3, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 762
    .line 763
    .line 764
    :goto_d
    const p3, 0x7f0a02e8

    .line 765
    .line 766
    .line 767
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 768
    .line 769
    .line 770
    move-result-object p3

    .line 771
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 772
    .line 773
    new-instance v4, Lbi4;

    .line 774
    .line 775
    invoke-direct {v4, p0, v2}, Lbi4;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;I)V

    .line 776
    .line 777
    .line 778
    iget-boolean v7, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->E0:Z

    .line 779
    .line 780
    sget-object v9, Lcom/eddyizm/tempus/homemusic/b;->a:Ljava/lang/ref/WeakReference;

    .line 781
    .line 782
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 783
    .line 784
    .line 785
    invoke-static {p3, v3, v4, v0, v7}, Lcom/eddyizm/tempus/homemusic/b;->d(Landroid/view/View;Lcom/eddyizm/tempus/subsonic/models/Child;Ljava/lang/Runnable;ZZ)V

    .line 786
    .line 787
    .line 788
    const p3, 0x7f0a02e6

    .line 789
    .line 790
    .line 791
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 792
    .line 793
    .line 794
    move-result-object p3

    .line 795
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 796
    .line 797
    new-instance v4, Lbi4;

    .line 798
    .line 799
    invoke-direct {v4, p0, v2}, Lbi4;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;I)V

    .line 800
    .line 801
    .line 802
    iget-boolean v7, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->E0:Z

    .line 803
    .line 804
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 805
    .line 806
    .line 807
    invoke-static {p3, v3, v4, v2, v7}, Lcom/eddyizm/tempus/homemusic/b;->d(Landroid/view/View;Lcom/eddyizm/tempus/subsonic/models/Child;Ljava/lang/Runnable;ZZ)V

    .line 808
    .line 809
    .line 810
    const p3, 0x7f0a0091

    .line 811
    .line 812
    .line 813
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 814
    .line 815
    .line 816
    move-result-object p3

    .line 817
    check-cast p3, Landroid/widget/TextView;

    .line 818
    .line 819
    new-instance v3, Lci4;

    .line 820
    .line 821
    const/4 v4, 0x4

    .line 822
    invoke-direct {v3, p0, v4}, Lci4;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;I)V

    .line 823
    .line 824
    .line 825
    invoke-virtual {p3, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 826
    .line 827
    .line 828
    const p3, 0x7f0a0279

    .line 829
    .line 830
    .line 831
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 832
    .line 833
    .line 834
    move-result-object p3

    .line 835
    check-cast p3, Landroid/widget/TextView;

    .line 836
    .line 837
    new-instance v3, Lci4;

    .line 838
    .line 839
    const/4 v4, 0x5

    .line 840
    invoke-direct {v3, p0, v4}, Lci4;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;I)V

    .line 841
    .line 842
    .line 843
    invoke-virtual {p3, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 844
    .line 845
    .line 846
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->C0:Lii4;

    .line 847
    .line 848
    iget-object v3, v3, Lii4;->h:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 849
    .line 850
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 851
    .line 852
    .line 853
    move-result-object v3

    .line 854
    if-eqz v3, :cond_12

    .line 855
    .line 856
    move v3, v0

    .line 857
    goto :goto_e

    .line 858
    :cond_12
    move v3, v6

    .line 859
    :goto_e
    invoke-virtual {p3, v3}, Landroid/view/View;->setVisibility(I)V

    .line 860
    .line 861
    .line 862
    const p3, 0x7f0a027a

    .line 863
    .line 864
    .line 865
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 866
    .line 867
    .line 868
    move-result-object p3

    .line 869
    check-cast p3, Landroid/widget/TextView;

    .line 870
    .line 871
    new-instance v3, Lci4;

    .line 872
    .line 873
    const/4 v4, 0x6

    .line 874
    invoke-direct {v3, p0, v4}, Lci4;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;I)V

    .line 875
    .line 876
    .line 877
    invoke-virtual {p3, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 878
    .line 879
    .line 880
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->C0:Lii4;

    .line 881
    .line 882
    iget-object v3, v3, Lii4;->h:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 883
    .line 884
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v3

    .line 888
    if-eqz v3, :cond_13

    .line 889
    .line 890
    move v3, v0

    .line 891
    goto :goto_f

    .line 892
    :cond_13
    move v3, v6

    .line 893
    :goto_f
    invoke-virtual {p3, v3}, Landroid/view/View;->setVisibility(I)V

    .line 894
    .line 895
    .line 896
    const p3, 0x7f0a0576

    .line 897
    .line 898
    .line 899
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 900
    .line 901
    .line 902
    move-result-object p3

    .line 903
    check-cast p3, Landroid/widget/TextView;

    .line 904
    .line 905
    new-instance v3, Lci4;

    .line 906
    .line 907
    const/4 v4, 0x7

    .line 908
    invoke-direct {v3, p0, v4}, Lci4;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;I)V

    .line 909
    .line 910
    .line 911
    invoke-virtual {p3, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 912
    .line 913
    .line 914
    invoke-static {}, Lud3;->V()Z

    .line 915
    .line 916
    .line 917
    move-result v3

    .line 918
    if-eqz v3, :cond_14

    .line 919
    .line 920
    move v3, v0

    .line 921
    goto :goto_10

    .line 922
    :cond_14
    move v3, v6

    .line 923
    :goto_10
    invoke-virtual {p3, v3}, Landroid/view/View;->setVisibility(I)V

    .line 924
    .line 925
    .line 926
    iget-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 927
    .line 928
    new-instance v3, Lbi4;

    .line 929
    .line 930
    invoke-direct {v3, p0, v2}, Lbi4;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;I)V

    .line 931
    .line 932
    .line 933
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 934
    .line 935
    .line 936
    invoke-virtual {p3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    move-result-object p0

    .line 940
    invoke-static {p0}, Lot1;->c(Ljava/lang/String;)Z

    .line 941
    .line 942
    .line 943
    move-result p0

    .line 944
    if-nez p0, :cond_15

    .line 945
    .line 946
    goto :goto_12

    .line 947
    :cond_15
    new-array p0, v5, [I

    .line 948
    .line 949
    fill-array-data p0, :array_0

    .line 950
    .line 951
    .line 952
    move v4, v0

    .line 953
    :goto_11
    if-ge v4, v5, :cond_17

    .line 954
    .line 955
    aget v7, p0, v4

    .line 956
    .line 957
    invoke-virtual {p1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 958
    .line 959
    .line 960
    move-result-object v7

    .line 961
    if-eqz v7, :cond_16

    .line 962
    .line 963
    invoke-virtual {v7, v6}, Landroid/view/View;->setVisibility(I)V

    .line 964
    .line 965
    .line 966
    :cond_16
    add-int/lit8 v4, v4, 0x1

    .line 967
    .line 968
    goto :goto_11

    .line 969
    :cond_17
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 970
    .line 971
    .line 972
    move-result-object p0

    .line 973
    if-eqz p0, :cond_18

    .line 974
    .line 975
    new-instance v4, Ltr1;

    .line 976
    .line 977
    invoke-direct {v4, p3, v2}, Ltr1;-><init>(Lcom/eddyizm/tempus/subsonic/models/Child;I)V

    .line 978
    .line 979
    .line 980
    invoke-virtual {p0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 981
    .line 982
    .line 983
    :cond_18
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 984
    .line 985
    .line 986
    move-result-object p0

    .line 987
    if-eqz p0, :cond_19

    .line 988
    .line 989
    invoke-virtual {p0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 990
    .line 991
    .line 992
    :cond_19
    invoke-virtual {p1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 993
    .line 994
    .line 995
    move-result-object p0

    .line 996
    check-cast p0, Landroid/widget/TextView;

    .line 997
    .line 998
    if-eqz p0, :cond_1a

    .line 999
    .line 1000
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1001
    .line 1002
    .line 1003
    const p2, 0x7f1301b3

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setText(I)V

    .line 1007
    .line 1008
    .line 1009
    new-instance p2, Lsr1;

    .line 1010
    .line 1011
    invoke-direct {p2, p3, v3}, Lsr1;-><init>(Lcom/eddyizm/tempus/subsonic/models/Child;Lbi4;)V

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {p0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1015
    .line 1016
    .line 1017
    :cond_1a
    :goto_12
    return-object p1

    .line 1018
    :cond_1b
    invoke-static {v3}, Lkf2;->n(Ljava/lang/String;)V

    .line 1019
    .line 1020
    .line 1021
    return-object v1

    .line 1022
    :cond_1c
    invoke-static {v3}, Lkf2;->n(Ljava/lang/String;)V

    .line 1023
    .line 1024
    .line 1025
    return-object v1

    .line 1026
    :cond_1d
    :goto_13
    invoke-virtual {p0}, Lzt;->n0()V

    .line 1027
    .line 1028
    .line 1029
    return-object p1

    .line 1030
    nop

    .line 1031
    :array_0
    .array-data 4
        0x7f0a0466
        0x7f0a0509
        0x7f0a051a
        0x7f0a0091
        0x7f0a0279
        0x7f0a027a
        0x7f0a0576
        0x7f0a0519
        0x7f0a00fe
    .end array-data
.end method

.method public final R()V
    .locals 9

    .line 1
    invoke-super {p0}, Lpp0;->R()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

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
    iput-object v7, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->O0:Lbl2;

    .line 90
    .line 91
    :cond_1
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->O0:Lbl2;

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

.method public final T(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance p2, Lbi4;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p2, p0, v0}, Lbi4;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;I)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Lg51;->d:Lk03;

    .line 16
    .line 17
    new-instance v0, Ld8;

    .line 18
    .line 19
    const/16 v1, 0xf

    .line 20
    .line 21
    invoke-direct {v0, v1, p2}, Ld8;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, v0}, Lad2;->e(Lba2;La83;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final o0(Lcom/google/android/material/chip/Chip;Ljava/lang/String;Ljava/lang/String;)Lik;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const-string v1, ""

    .line 6
    .line 7
    const/16 v2, 0x8

    .line 8
    .line 9
    if-eqz p3, :cond_9

    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/String;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-eqz v3, :cond_1

    .line 16
    .line 17
    goto/16 :goto_2

    .line 18
    .line 19
    :cond_1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x1

    .line 25
    const/4 v6, -0x1

    .line 26
    sparse-switch v3, :sswitch_data_0

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :sswitch_0
    const-string v3, "playlist"

    .line 31
    .line 32
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-nez v3, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    const/4 v6, 0x5

    .line 40
    goto :goto_0

    .line 41
    :sswitch_1
    const-string v3, "genre"

    .line 42
    .line 43
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-nez v3, :cond_3

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    const/4 v6, 0x4

    .line 51
    goto :goto_0

    .line 52
    :sswitch_2
    const-string v3, "album"

    .line 53
    .line 54
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-nez v3, :cond_4

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_4
    const/4 v6, 0x3

    .line 62
    goto :goto_0

    .line 63
    :sswitch_3
    const-string v3, "year"

    .line 64
    .line 65
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-nez v3, :cond_5

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_5
    const/4 v6, 0x2

    .line 73
    goto :goto_0

    .line 74
    :sswitch_4
    const-string v3, "song"

    .line 75
    .line 76
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-nez v3, :cond_6

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_6
    move v6, v5

    .line 84
    goto :goto_0

    .line 85
    :sswitch_5
    const-string v3, "artist"

    .line 86
    .line 87
    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    if-nez v3, :cond_7

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_7
    move v6, v4

    .line 95
    :goto_0
    packed-switch v6, :pswitch_data_0

    .line 96
    .line 97
    .line 98
    const v3, 0x7f130086

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :pswitch_0
    const v3, 0x7f130084

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :pswitch_1
    const v3, 0x7f130083

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :pswitch_2
    const v3, 0x7f130081

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :pswitch_3
    const v3, 0x7f130087

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :pswitch_4
    const v3, 0x7f130085

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :pswitch_5
    const v3, 0x7f130082

    .line 123
    .line 124
    .line 125
    :goto_1
    invoke-virtual {p0, v3}, Lkc1;->s(I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-static {p2, p3}, Ll93;->h(Ljava/lang/String;Ljava/lang/String;)Lik;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    if-nez p2, :cond_8

    .line 134
    .line 135
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 145
    .line 146
    .line 147
    return-object v0

    .line 148
    :cond_8
    iget-object v0, p2, Lik;->d:Ljava/lang/String;

    .line 149
    .line 150
    filled-new-array {v3, v0}, [Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    const v1, 0x7f130078

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0, v1, v0}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 165
    .line 166
    .line 167
    new-instance v0, Lfi4;

    .line 168
    .line 169
    invoke-direct {v0, p0, p2, v5}, Lfi4;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;Lik;I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 173
    .line 174
    .line 175
    new-instance v0, Lyj3;

    .line 176
    .line 177
    invoke-direct {v0, p0, p2, p3, v5}, Lyj3;-><init>(Lkc1;Lik;Ljava/lang/String;I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 181
    .line 182
    .line 183
    return-object p2

    .line 184
    :cond_9
    :goto_2
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 194
    .line 195
    .line 196
    return-object v0

    .line 197
    :sswitch_data_0
    .sparse-switch
        -0x53fd20b9 -> :sswitch_5
        0x35f515 -> :sswitch_4
        0x38883d -> :sswitch_3
        0x5897e6f -> :sswitch_2
        0x5db0983 -> :sswitch_1
        0x700681d2 -> :sswitch_0
    .end sparse-switch

    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final p0(Landroid/view/View;Lik;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    invoke-static {p1}, Ll93;->p(Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->setClickable(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/view/View;->setLongClickable(Z)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const/4 v1, 0x1

    .line 22
    invoke-virtual {p1, v1}, Landroid/view/View;->setClickable(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/view/View;->setLongClickable(Z)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, Ll93;->g(Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    new-instance v1, Lfi4;

    .line 32
    .line 33
    invoke-direct {v1, p0, p2, v0}, Lfi4;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;Lik;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 37
    .line 38
    .line 39
    new-instance v0, Li8;

    .line 40
    .line 41
    const/4 v1, 0x6

    .line 42
    invoke-direct {v0, v1, p0, p2}, Li8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final q0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->F0:Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->G0:Landroid/widget/TextView;

    .line 6
    .line 7
    if-eqz v0, :cond_7

    .line 8
    .line 9
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_3

    .line 14
    :cond_0
    invoke-static {}, Lud3;->o()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/16 v1, 0x8

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-nez v0, :cond_3

    .line 22
    .line 23
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 32
    .line 33
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {v3}, Leu0;->d(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->F0:Landroid/widget/TextView;

    .line 45
    .line 46
    if-eqz v0, :cond_1

    .line 47
    .line 48
    move v4, v1

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move v4, v2

    .line 51
    :goto_0
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->G0:Landroid/widget/TextView;

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    move v1, v2

    .line 59
    :cond_2
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_3
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 64
    .line 65
    invoke-static {v0}, Lg51;->e(Lcom/eddyizm/tempus/subsonic/models/Child;)Landroid/net/Uri;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    const/4 v0, 0x1

    .line 72
    goto :goto_1

    .line 73
    :cond_4
    move v0, v2

    .line 74
    :goto_1
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->F0:Landroid/widget/TextView;

    .line 75
    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    move v4, v1

    .line 79
    goto :goto_2

    .line 80
    :cond_5
    move v4, v2

    .line 81
    :goto_2
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 82
    .line 83
    .line 84
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->G0:Landroid/widget/TextView;

    .line 85
    .line 86
    if-eqz v0, :cond_6

    .line 87
    .line 88
    move v1, v2

    .line 89
    :cond_6
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 90
    .line 91
    .line 92
    :cond_7
    :goto_3
    return-void
.end method
