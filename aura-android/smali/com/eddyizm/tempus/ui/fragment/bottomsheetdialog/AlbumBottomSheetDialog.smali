.class public Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;
.super Lzt;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public B0:Lcom/eddyizm/tempus/viewmodel/b;

.field public C0:Lj7;

.field public D0:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

.field public E0:Landroid/widget/TextView;

.field public F0:Ljava/util/List;

.field public G0:Ljava/util/List;

.field public H0:Z

.field public I0:Lbl2;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lzt;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->F0:Ljava/util/List;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->G0:Ljava/util/List;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->H0:Z

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .line 1
    const p3, 0x7f0d0020

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
    if-eqz p2, :cond_7

    .line 12
    .line 13
    const-string p3, "ALBUM_OBJECT"

    .line 14
    .line 15
    invoke-virtual {p2, p3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    check-cast p2, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 22
    .line 23
    if-nez p2, :cond_0

    .line 24
    .line 25
    goto/16 :goto_2

    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-virtual {p2}, Ll70;->d()Le75;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    invoke-static {p2}, Lgh0;->r(Lf75;)Lb75;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-static {p2, v1}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    new-instance v2, Lbq4;

    .line 44
    .line 45
    invoke-direct {v2, p3, v1, p2}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 46
    .line 47
    .line 48
    const-class p2, Lcom/eddyizm/tempus/viewmodel/b;

    .line 49
    .line 50
    invoke-static {p2}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {p2}, Li30;->b()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    const/4 v1, 0x0

    .line 59
    const-string v3, "Local and anonymous classes can not be ViewModels"

    .line 60
    .line 61
    if-eqz p3, :cond_6

    .line 62
    .line 63
    const-string v4, "androidx.lifecycle.ViewModelProvider.DefaultKey:"

    .line 64
    .line 65
    invoke-virtual {v4, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    invoke-virtual {v2, p2, p3}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    check-cast p2, Lcom/eddyizm/tempus/viewmodel/b;

    .line 74
    .line 75
    iput-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->B0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 76
    .line 77
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-virtual {p2}, Ll70;->d()Le75;

    .line 82
    .line 83
    .line 84
    move-result-object p3

    .line 85
    invoke-static {p2}, Lgh0;->r(Lf75;)Lb75;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-static {p2, v2}, Lb11;->e(Lnc1;Lb75;)Ltf0;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    new-instance v5, Lbq4;

    .line 94
    .line 95
    invoke-direct {v5, p3, v2, p2}, Lbq4;-><init>(Le75;Lb75;Ltf0;)V

    .line 96
    .line 97
    .line 98
    const-class p2, Lj7;

    .line 99
    .line 100
    invoke-static {p2}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-virtual {p2}, Li30;->b()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    if-eqz p3, :cond_5

    .line 109
    .line 110
    invoke-virtual {v4, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p3

    .line 114
    invoke-virtual {v5, p2, p3}, Lbq4;->l(Li30;Ljava/lang/String;)Lx65;

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    check-cast p2, Lj7;

    .line 119
    .line 120
    iput-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->C0:Lj7;

    .line 121
    .line 122
    iget-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 123
    .line 124
    iput-object p3, p2, Lj7;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 125
    .line 126
    const p2, 0x7f0a0443

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    check-cast p2, Landroid/view/ViewGroup;

    .line 134
    .line 135
    invoke-static {p2}, Lq05;->u(Landroid/view/ViewGroup;)V

    .line 136
    .line 137
    .line 138
    const p2, 0x7f0a00a9

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    check-cast p2, Landroid/widget/ImageView;

    .line 146
    .line 147
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 148
    .line 149
    .line 150
    move-result-object p3

    .line 151
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->C0:Lj7;

    .line 152
    .line 153
    iget-object v2, v2, Lj7;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 154
    .line 155
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getCoverArtId()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-static {p3}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    if-eqz v2, :cond_1

    .line 164
    .line 165
    invoke-static {}, Lud3;->t()I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    invoke-static {v1, v2}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    :cond_1
    const/4 v4, 0x2

    .line 174
    invoke-static {p3, v2, v4, v3, v1}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 175
    .line 176
    .line 177
    move-result-object p3

    .line 178
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-virtual {p3, v1}, Lvz3;->T(Lxv0;)Lvz3;

    .line 183
    .line 184
    .line 185
    move-result-object p3

    .line 186
    invoke-static {}, Lud3;->R()Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-eqz v1, :cond_2

    .line 191
    .line 192
    invoke-virtual {p3}, Llq;->l()Llq;

    .line 193
    .line 194
    .line 195
    move-result-object p3

    .line 196
    check-cast p3, Lvz3;

    .line 197
    .line 198
    :cond_2
    invoke-virtual {p3, p2}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 199
    .line 200
    .line 201
    const p2, 0x7f0a00bf

    .line 202
    .line 203
    .line 204
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    check-cast p2, Landroid/widget/TextView;

    .line 209
    .line 210
    iget-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->C0:Lj7;

    .line 211
    .line 212
    iget-object p3, p3, Lj7;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 213
    .line 214
    invoke-virtual {p3}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getName()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p3

    .line 218
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 219
    .line 220
    .line 221
    const/4 p3, 0x1

    .line 222
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setSelected(Z)V

    .line 223
    .line 224
    .line 225
    const p2, 0x7f0a00a3

    .line 226
    .line 227
    .line 228
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 229
    .line 230
    .line 231
    move-result-object p2

    .line 232
    check-cast p2, Landroid/widget/TextView;

    .line 233
    .line 234
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->C0:Lj7;

    .line 235
    .line 236
    iget-object v1, v1, Lj7;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 237
    .line 238
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getArtist()Ljava/lang/String;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 243
    .line 244
    .line 245
    const p2, 0x7f0a0135

    .line 246
    .line 247
    .line 248
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 249
    .line 250
    .line 251
    move-result-object p2

    .line 252
    check-cast p2, Landroid/widget/ToggleButton;

    .line 253
    .line 254
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->C0:Lj7;

    .line 255
    .line 256
    iget-object v1, v1, Lj7;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 257
    .line 258
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->C0:Lj7;

    .line 263
    .line 264
    iget-object v2, v2, Lj7;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 265
    .line 266
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getStarred()Ljava/util/Date;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    if-eqz v2, :cond_3

    .line 271
    .line 272
    move v2, p3

    .line 273
    goto :goto_0

    .line 274
    :cond_3
    move v2, v0

    .line 275
    :goto_0
    invoke-static {v4, v1, v2}, Ln61;->f(ILjava/lang/String;Z)Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    invoke-virtual {p2, v1}, Landroid/widget/ToggleButton;->setChecked(Z)V

    .line 280
    .line 281
    .line 282
    new-instance v1, Ly6;

    .line 283
    .line 284
    const/4 v2, 0x3

    .line 285
    invoke-direct {v1, p0, v2}, Ly6;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;I)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 289
    .line 290
    .line 291
    const p2, 0x7f0a0466

    .line 292
    .line 293
    .line 294
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 295
    .line 296
    .line 297
    move-result-object p2

    .line 298
    check-cast p2, Landroid/widget/TextView;

    .line 299
    .line 300
    new-instance v1, Ly6;

    .line 301
    .line 302
    const/4 v2, 0x4

    .line 303
    invoke-direct {v1, p0, v2}, Ly6;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;I)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 307
    .line 308
    .line 309
    const p2, 0x7f0a0467

    .line 310
    .line 311
    .line 312
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 313
    .line 314
    .line 315
    move-result-object p2

    .line 316
    check-cast p2, Landroid/widget/TextView;

    .line 317
    .line 318
    new-instance v1, Ly6;

    .line 319
    .line 320
    const/4 v2, 0x5

    .line 321
    invoke-direct {v1, p0, v2}, Ly6;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;I)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 325
    .line 326
    .line 327
    const p2, 0x7f0a0464

    .line 328
    .line 329
    .line 330
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 331
    .line 332
    .line 333
    move-result-object p2

    .line 334
    check-cast p2, Landroid/widget/TextView;

    .line 335
    .line 336
    new-instance v1, Ly6;

    .line 337
    .line 338
    const/4 v2, 0x6

    .line 339
    invoke-direct {v1, p0, v2}, Ly6;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;I)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 343
    .line 344
    .line 345
    const p2, 0x7f0a0093

    .line 346
    .line 347
    .line 348
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 349
    .line 350
    .line 351
    move-result-object p2

    .line 352
    check-cast p2, Landroid/widget/TextView;

    .line 353
    .line 354
    new-instance v1, Ly6;

    .line 355
    .line 356
    const/4 v3, 0x7

    .line 357
    invoke-direct {v1, p0, v3}, Ly6;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;I)V

    .line 358
    .line 359
    .line 360
    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 361
    .line 362
    .line 363
    const p2, 0x7f0a01c3

    .line 364
    .line 365
    .line 366
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 367
    .line 368
    .line 369
    move-result-object p2

    .line 370
    check-cast p2, Landroid/widget/TextView;

    .line 371
    .line 372
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->C0:Lj7;

    .line 373
    .line 374
    invoke-virtual {v1}, Lj7;->c()Lk03;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 379
    .line 380
    .line 381
    move-result-object v3

    .line 382
    new-instance v4, Lf7;

    .line 383
    .line 384
    invoke-direct {v4, v0, p0, p2}, Lf7;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v1, v3, v4}, Lad2;->e(Lba2;La83;)V

    .line 388
    .line 389
    .line 390
    const p2, 0x7f0a0091

    .line 391
    .line 392
    .line 393
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 394
    .line 395
    .line 396
    move-result-object p2

    .line 397
    check-cast p2, Landroid/widget/TextView;

    .line 398
    .line 399
    new-instance v1, Ly6;

    .line 400
    .line 401
    const/16 v3, 0x8

    .line 402
    .line 403
    invoke-direct {v1, p0, v3}, Ly6;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;I)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 407
    .line 408
    .line 409
    const p2, 0x7f0a0518

    .line 410
    .line 411
    .line 412
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 413
    .line 414
    .line 415
    move-result-object p2

    .line 416
    check-cast p2, Landroid/widget/TextView;

    .line 417
    .line 418
    iput-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->E0:Landroid/widget/TextView;

    .line 419
    .line 420
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->C0:Lj7;

    .line 421
    .line 422
    invoke-virtual {p2}, Lj7;->c()Lk03;

    .line 423
    .line 424
    .line 425
    move-result-object p2

    .line 426
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    new-instance v4, Lb7;

    .line 431
    .line 432
    invoke-direct {v4, p0, v2}, Lb7;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;I)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {p2, v1, v4}, Lad2;->e(Lba2;La83;)V

    .line 436
    .line 437
    .line 438
    const p2, 0x7f0a027a

    .line 439
    .line 440
    .line 441
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 442
    .line 443
    .line 444
    move-result-object p2

    .line 445
    check-cast p2, Landroid/widget/TextView;

    .line 446
    .line 447
    new-instance v1, Ly6;

    .line 448
    .line 449
    invoke-direct {v1, p0, v0}, Ly6;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;I)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 453
    .line 454
    .line 455
    const p2, 0x7f0a0576

    .line 456
    .line 457
    .line 458
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 459
    .line 460
    .line 461
    move-result-object p2

    .line 462
    check-cast p2, Landroid/widget/TextView;

    .line 463
    .line 464
    new-instance v1, Ly6;

    .line 465
    .line 466
    invoke-direct {v1, p0, p3}, Ly6;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;I)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {p2, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 470
    .line 471
    .line 472
    invoke-static {}, Lud3;->V()Z

    .line 473
    .line 474
    .line 475
    move-result p0

    .line 476
    if-eqz p0, :cond_4

    .line 477
    .line 478
    goto :goto_1

    .line 479
    :cond_4
    move v0, v3

    .line 480
    :goto_1
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 481
    .line 482
    .line 483
    return-object p1

    .line 484
    :cond_5
    invoke-static {v3}, Lkf2;->n(Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    return-object v1

    .line 488
    :cond_6
    invoke-static {v3}, Lkf2;->n(Ljava/lang/String;)V

    .line 489
    .line 490
    .line 491
    return-object v1

    .line 492
    :cond_7
    :goto_2
    invoke-virtual {p0}, Lzt;->n0()V

    .line 493
    .line 494
    .line 495
    return-object p1
.end method

.method public final R()V
    .locals 9

    .line 1
    invoke-super {p0}, Lpp0;->R()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

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
    iput-object v7, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->I0:Lbl2;

    .line 90
    .line 91
    :cond_1
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->I0:Lbl2;

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
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

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
    new-instance p2, La0;

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    invoke-direct {p2, v0, p0}, La0;-><init>(ILjava/lang/Object;)V

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

.method public final o0()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->E0:Landroid/widget/TextView;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->F0:Ljava/util/List;

    .line 7
    .line 8
    const/16 v1, 0x8

    .line 9
    .line 10
    if-eqz v0, :cond_7

    .line 11
    .line 12
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-static {}, Lud3;->o()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/4 v2, 0x0

    .line 24
    if-nez v0, :cond_5

    .line 25
    .line 26
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->G0:Ljava/util/List;

    .line 27
    .line 28
    if-eqz v0, :cond_4

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v3}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    new-instance v4, Lc7;

    .line 53
    .line 54
    invoke-direct {v4, v3}, Lc7;-><init>(Leu0;)V

    .line 55
    .line 56
    .line 57
    invoke-interface {v0, v4}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->E0:Landroid/widget/TextView;

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_4
    :goto_0
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->E0:Landroid/widget/TextView;

    .line 74
    .line 75
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_5
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->F0:Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    new-instance v3, Lc7;

    .line 86
    .line 87
    invoke-direct {v3, v2}, Lc7;-><init>(I)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v0, v3}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->E0:Landroid/widget/TextView;

    .line 95
    .line 96
    if-eqz v0, :cond_6

    .line 97
    .line 98
    move v1, v2

    .line 99
    :cond_6
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_7
    :goto_1
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->E0:Landroid/widget/TextView;

    .line 104
    .line 105
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 106
    .line 107
    .line 108
    return-void
.end method
