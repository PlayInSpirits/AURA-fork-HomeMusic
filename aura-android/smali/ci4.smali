.class public final synthetic Lci4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;I)V
    .locals 0

    .line 1
    iput p2, p0, Lci4;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lci4;->o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;

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
    iget p1, p0, Lci4;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object p0, p0, Lci4;->o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v0, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->P:Lbl2;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    const-string p0, "SongBottomSheetDialog"

    .line 25
    .line 26
    const-string p1, "MediaBrowser Future is null in MainActivity"

    .line 27
    .line 28
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iput-boolean v2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->N0:Z

    .line 33
    .line 34
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const v3, 0x7f13008c

    .line 39
    .line 40
    .line 41
    invoke-static {v2, v3, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v2}, Landroid/widget/Toast;->show()V

    .line 46
    .line 47
    .line 48
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->C0:Lii4;

    .line 49
    .line 50
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 51
    .line 52
    iget-object v4, v2, Lii4;->i:Lk03;

    .line 53
    .line 54
    sget-object v5, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 55
    .line 56
    invoke-virtual {v4, v5}, Lad2;->k(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object v2, v2, Lii4;->c:Lxi4;

    .line 60
    .line 61
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    sget-object v5, Lfb0;->p:Lfb0;

    .line 66
    .line 67
    const/16 v6, 0x1e

    .line 68
    .line 69
    invoke-virtual {v2, v3, v5, v6}, Lxi4;->o(Ljava/lang/String;Lfb0;I)Lk03;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    new-instance v3, Lg7;

    .line 74
    .line 75
    invoke-direct {v3, v4, v1}, Lg7;-><init>(Lk03;I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, p1, v3}, Lad2;->e(Lba2;La83;)V

    .line 79
    .line 80
    .line 81
    new-instance v1, Lz6;

    .line 82
    .line 83
    const/4 v2, 0x4

    .line 84
    invoke-direct {v1, p0, v0, p1, v2}, Lz6;-><init>(Lzt;Ljava/lang/Object;Landroid/view/KeyEvent$Callback;I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v4, p1, v1}, Lad2;->e(Lba2;La83;)V

    .line 88
    .line 89
    .line 90
    :goto_0
    return-void

    .line 91
    :pswitch_0
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->C0:Lii4;

    .line 92
    .line 93
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    iget-object v3, p1, Lii4;->f:Ld34;

    .line 98
    .line 99
    iget-object v4, p1, Lii4;->h:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 100
    .line 101
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    iget-object v5, p1, Lii4;->h:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 106
    .line 107
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->getStarred()Ljava/util/Date;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    if-eqz v5, :cond_2

    .line 112
    .line 113
    move v5, v2

    .line 114
    goto :goto_1

    .line 115
    :cond_2
    move v5, v1

    .line 116
    :goto_1
    invoke-static {v2, v4, v5}, Ln61;->f(ILjava/lang/String;Z)Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-eqz v4, :cond_4

    .line 121
    .line 122
    invoke-static {}, Lhw;->t()Z

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    iget-object v2, p1, Lii4;->h:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 127
    .line 128
    if-eqz p0, :cond_3

    .line 129
    .line 130
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {v3, p0, v0, v1, v0}, Ld34;->J(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setStarred(Ljava/util/Date;)V

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :cond_3
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    new-instance v4, Lhi4;

    .line 146
    .line 147
    invoke-direct {v4, p1, v2, v1}, Lhi4;-><init>(Lii4;Lcom/eddyizm/tempus/subsonic/models/Child;I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-static {p0, v0, v0, v4}, Ld34;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/interfaces/StarCallback;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setStarred(Ljava/util/Date;)V

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_4
    invoke-static {}, Lhw;->t()Z

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    iget-object v5, p1, Lii4;->h:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 165
    .line 166
    if-eqz v4, :cond_5

    .line 167
    .line 168
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-virtual {v3, p0, v0, v2, v0}, Ld34;->J(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 173
    .line 174
    .line 175
    new-instance p0, Ljava/util/Date;

    .line 176
    .line 177
    invoke-direct {p0}, Ljava/util/Date;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v5, p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->setStarred(Ljava/util/Date;)V

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_5
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v4

    .line 188
    new-instance v6, Lhi4;

    .line 189
    .line 190
    invoke-direct {v6, p1, v5, v2}, Lhi4;-><init>(Lii4;Lcom/eddyizm/tempus/subsonic/models/Child;I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-static {v4, v0, v0, v6}, Ld34;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/interfaces/StarCallback;)V

    .line 197
    .line 198
    .line 199
    new-instance p1, Ljava/util/Date;

    .line 200
    .line 201
    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v5, p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->setStarred(Ljava/util/Date;)V

    .line 205
    .line 206
    .line 207
    invoke-static {}, Lud3;->X()Z

    .line 208
    .line 209
    .line 210
    move-result p1

    .line 211
    if-eqz p1, :cond_6

    .line 212
    .line 213
    invoke-static {}, Lud3;->o()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    if-nez p1, :cond_6

    .line 218
    .line 219
    invoke-static {p0}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    invoke-static {v5}, Lgi1;->G(Lcom/eddyizm/tempus/subsonic/models/Child;)Lgn2;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    new-instance v0, Lcom/eddyizm/tempus/model/Download;

    .line 228
    .line 229
    invoke-direct {v0, v5}, Lcom/eddyizm/tempus/model/Download;-><init>(Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {p0, p1, v0, v1}, Leu0;->b(Lgn2;Lcom/eddyizm/tempus/model/Download;Z)Z

    .line 233
    .line 234
    .line 235
    :cond_6
    :goto_2
    return-void

    .line 236
    :pswitch_1
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->C0:Lii4;

    .line 237
    .line 238
    iget-object v0, p1, Lii4;->g:Lhh3;

    .line 239
    .line 240
    iget-object v2, p1, Lii4;->h:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 241
    .line 242
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    iget-object p1, p1, Lii4;->h:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 247
    .line 248
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    invoke-static {v2, p1}, Lhh3;->h(Ljava/lang/String;Ljava/lang/String;)Lk03;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    new-instance v2, Ldi4;

    .line 264
    .line 265
    invoke-direct {v2, p0, v1}, Ldi4;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;I)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p1, v0, v2}, Lad2;->e(Lba2;La83;)V

    .line 269
    .line 270
    .line 271
    return-void

    .line 272
    :pswitch_2
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->C0:Lii4;

    .line 273
    .line 274
    iget-object v0, p1, Lii4;->e:Lpa;

    .line 275
    .line 276
    iget-object p1, p1, Lii4;->h:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 277
    .line 278
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    invoke-static {p1}, Lpa;->v(Ljava/lang/String;)Lk03;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    new-instance v1, Ldi4;

    .line 294
    .line 295
    const/4 v2, 0x2

    .line 296
    invoke-direct {v1, p0, v2}, Ldi4;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;I)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {p1, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 300
    .line 301
    .line 302
    return-void

    .line 303
    :pswitch_3
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->C0:Lii4;

    .line 304
    .line 305
    iget-object v0, p1, Lii4;->d:Lrv2;

    .line 306
    .line 307
    iget-object p1, p1, Lii4;->h:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 308
    .line 309
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    invoke-static {p1}, Lrv2;->j(Ljava/lang/String;)Lk03;

    .line 317
    .line 318
    .line 319
    move-result-object p1

    .line 320
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    new-instance v1, Ldi4;

    .line 325
    .line 326
    invoke-direct {v1, p0, v2}, Ldi4;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;I)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {p1, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 330
    .line 331
    .line 332
    return-void

    .line 333
    :pswitch_4
    new-instance p1, Landroid/os/Bundle;

    .line 334
    .line 335
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 336
    .line 337
    .line 338
    new-instance v1, Ljava/util/ArrayList;

    .line 339
    .line 340
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 341
    .line 342
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 347
    .line 348
    .line 349
    const-string v2, "TRACKS_OBJECT"

    .line 350
    .line 351
    invoke-virtual {p1, v2, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 352
    .line 353
    .line 354
    new-instance v1, Lfl3;

    .line 355
    .line 356
    invoke-direct {v1}, Lfl3;-><init>()V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v1, p1}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    invoke-virtual {p1}, Lnc1;->k()Lmd1;

    .line 367
    .line 368
    .line 369
    move-result-object p1

    .line 370
    invoke-virtual {v1, p1, v0}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {p0}, Lzt;->h0()V

    .line 374
    .line 375
    .line 376
    return-void

    .line 377
    :pswitch_5
    invoke-static {}, Lud3;->o()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object p1

    .line 381
    if-nez p1, :cond_7

    .line 382
    .line 383
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 384
    .line 385
    .line 386
    move-result-object p1

    .line 387
    invoke-static {p1}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 388
    .line 389
    .line 390
    move-result-object p1

    .line 391
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 392
    .line 393
    invoke-static {v0}, Lgi1;->G(Lcom/eddyizm/tempus/subsonic/models/Child;)Lgn2;

    .line 394
    .line 395
    .line 396
    move-result-object v0

    .line 397
    new-instance v1, Lcom/eddyizm/tempus/model/Download;

    .line 398
    .line 399
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 400
    .line 401
    invoke-direct {v1, v2}, Lcom/eddyizm/tempus/model/Download;-><init>(Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {p1, v0, v1}, Leu0;->e(Lgn2;Lcom/eddyizm/tempus/model/Download;)V

    .line 405
    .line 406
    .line 407
    goto :goto_3

    .line 408
    :cond_7
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 409
    .line 410
    invoke-static {p1}, Lg51;->b(Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 411
    .line 412
    .line 413
    :goto_3
    invoke-virtual {p0}, Lzt;->h0()V

    .line 414
    .line 415
    .line 416
    return-void

    .line 417
    :pswitch_6
    new-instance p1, Landroid/os/Bundle;

    .line 418
    .line 419
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 420
    .line 421
    .line 422
    const-string v1, "TRACK_OBJECT"

    .line 423
    .line 424
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 425
    .line 426
    invoke-virtual {p1, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 427
    .line 428
    .line 429
    new-instance v1, Lou3;

    .line 430
    .line 431
    invoke-direct {v1}, Lou3;-><init>()V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v1, p1}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 438
    .line 439
    .line 440
    move-result-object p1

    .line 441
    invoke-virtual {p1}, Lnc1;->k()Lmd1;

    .line 442
    .line 443
    .line 444
    move-result-object p1

    .line 445
    invoke-virtual {v1, p1, v0}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    invoke-virtual {p0}, Lzt;->h0()V

    .line 449
    .line 450
    .line 451
    return-void

    .line 452
    :pswitch_7
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->O0:Lbl2;

    .line 453
    .line 454
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 455
    .line 456
    invoke-static {p1, v0, v1}, Lbo2;->f(Lbl2;Lcom/eddyizm/tempus/subsonic/models/Child;Z)V

    .line 457
    .line 458
    .line 459
    iget-boolean p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->E0:Z

    .line 460
    .line 461
    if-nez p1, :cond_8

    .line 462
    .line 463
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 464
    .line 465
    .line 466
    move-result-object p1

    .line 467
    check-cast p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 468
    .line 469
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 470
    .line 471
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 472
    .line 473
    check-cast p1, Lau;

    .line 474
    .line 475
    invoke-virtual {p1, v2}, Lau;->d(Z)V

    .line 476
    .line 477
    .line 478
    :cond_8
    invoke-virtual {p0}, Lzt;->h0()V

    .line 479
    .line 480
    .line 481
    return-void

    .line 482
    :pswitch_8
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->O0:Lbl2;

    .line 483
    .line 484
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 485
    .line 486
    invoke-static {p1, v0, v2}, Lbo2;->f(Lbl2;Lcom/eddyizm/tempus/subsonic/models/Child;Z)V

    .line 487
    .line 488
    .line 489
    iget-boolean p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->E0:Z

    .line 490
    .line 491
    if-nez p1, :cond_9

    .line 492
    .line 493
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 494
    .line 495
    .line 496
    move-result-object p1

    .line 497
    check-cast p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 498
    .line 499
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 500
    .line 501
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast p1, Lau;

    .line 504
    .line 505
    invoke-virtual {p1, v2}, Lau;->d(Z)V

    .line 506
    .line 507
    .line 508
    :cond_9
    invoke-virtual {p0}, Lzt;->h0()V

    .line 509
    .line 510
    .line 511
    return-void

    .line 512
    nop

    .line 513
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
