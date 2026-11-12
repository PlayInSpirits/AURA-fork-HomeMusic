.class public final synthetic Ly6;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;I)V
    .locals 0

    .line 1
    iput p2, p0, Ly6;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ly6;->o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;

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
    iget p1, p0, Ly6;->n:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/4 v1, 0x1

    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, Ly6;->o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->C0:Lj7;

    .line 12
    .line 13
    invoke-virtual {p1}, Lj7;->c()Lk03;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, Lb7;

    .line 22
    .line 23
    invoke-direct {v2, p0, v0}, Lb7;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v1, v2}, Lad2;->e(Lba2;La83;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->C0:Lj7;

    .line 31
    .line 32
    invoke-virtual {p1}, Lj7;->c()Lk03;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, Lb7;

    .line 41
    .line 42
    const/4 v2, 0x5

    .line 43
    invoke-direct {v1, p0, v2}, Lb7;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_1
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->C0:Lj7;

    .line 51
    .line 52
    invoke-virtual {p1}, Lj7;->c()Lk03;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    new-instance v1, Lb7;

    .line 61
    .line 62
    invoke-direct {v1, p0, v2}, Lb7;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_2
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {p1}, Lrv2;->l(Ljava/lang/String;)Lk03;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    new-instance v1, Lb7;

    .line 84
    .line 85
    const/4 v2, 0x3

    .line 86
    invoke-direct {v1, p0, v2}, Lb7;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :pswitch_3
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 98
    .line 99
    if-nez p1, :cond_0

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_0
    iget-object v3, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->P:Lbl2;

    .line 103
    .line 104
    if-nez v3, :cond_1

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    iput-boolean v1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->H0:Z

    .line 108
    .line 109
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    const v4, 0x7f13008c

    .line 114
    .line 115
    .line 116
    invoke-static {v1, v4, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 121
    .line 122
    .line 123
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->C0:Lj7;

    .line 124
    .line 125
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 126
    .line 127
    iget-object v5, v1, Lj7;->h:Lk03;

    .line 128
    .line 129
    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 130
    .line 131
    invoke-virtual {v5, v6}, Lad2;->k(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    iget-object v1, v1, Lj7;->c:Lrv2;

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    new-instance v1, Lxi4;

    .line 140
    .line 141
    invoke-direct {v1, v0}, Lxi4;-><init>(I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    sget-object v4, Lfb0;->o:Lfb0;

    .line 149
    .line 150
    const/16 v6, 0x1e

    .line 151
    .line 152
    invoke-virtual {v1, v0, v4, v6}, Lxi4;->o(Ljava/lang/String;Lfb0;I)Lk03;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    new-instance v1, Lg7;

    .line 157
    .line 158
    invoke-direct {v1, v5, v2}, Lg7;-><init>(Lk03;I)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, p1, v1}, Lad2;->e(Lba2;La83;)V

    .line 162
    .line 163
    .line 164
    new-instance v0, Lz6;

    .line 165
    .line 166
    invoke-direct {v0, p0, v3, p1, v2}, Lz6;-><init>(Lzt;Ljava/lang/Object;Landroid/view/KeyEvent$Callback;I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v5, p1, v0}, Lad2;->e(Lba2;La83;)V

    .line 170
    .line 171
    .line 172
    :goto_0
    return-void

    .line 173
    :pswitch_4
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->C0:Lj7;

    .line 174
    .line 175
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    iget-object v3, p1, Lj7;->e:Ld34;

    .line 180
    .line 181
    iget-object v4, p1, Lj7;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 182
    .line 183
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    iget-object v5, p1, Lj7;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 188
    .line 189
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getStarred()Ljava/util/Date;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    if-eqz v5, :cond_2

    .line 194
    .line 195
    move v5, v1

    .line 196
    goto :goto_1

    .line 197
    :cond_2
    move v5, v2

    .line 198
    :goto_1
    invoke-static {v0, v4, v5}, Ln61;->f(ILjava/lang/String;Z)Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    const/4 v4, 0x0

    .line 203
    if-eqz v0, :cond_4

    .line 204
    .line 205
    invoke-static {}, Lhw;->t()Z

    .line 206
    .line 207
    .line 208
    move-result p0

    .line 209
    iget-object v0, p1, Lj7;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 210
    .line 211
    if-eqz p0, :cond_3

    .line 212
    .line 213
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    invoke-virtual {v3, v4, p0, v2, v4}, Ld34;->J(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 218
    .line 219
    .line 220
    iget-object p0, p1, Lj7;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 221
    .line 222
    invoke-virtual {p0, v4}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->setStarred(Ljava/util/Date;)V

    .line 223
    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_3
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    new-instance v0, Lh7;

    .line 231
    .line 232
    invoke-direct {v0, p1, v2}, Lh7;-><init>(Lj7;I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-static {v4, p0, v4, v0}, Ld34;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/interfaces/StarCallback;)V

    .line 239
    .line 240
    .line 241
    iget-object p0, p1, Lj7;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 242
    .line 243
    invoke-virtual {p0, v4}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->setStarred(Ljava/util/Date;)V

    .line 244
    .line 245
    .line 246
    goto :goto_2

    .line 247
    :cond_4
    invoke-static {}, Lhw;->t()Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    iget-object v5, p1, Lj7;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 252
    .line 253
    if-eqz v0, :cond_5

    .line 254
    .line 255
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    invoke-virtual {v3, v4, p0, v1, v4}, Ld34;->J(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 260
    .line 261
    .line 262
    iget-object p0, p1, Lj7;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 263
    .line 264
    new-instance p1, Ljava/util/Date;

    .line 265
    .line 266
    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->setStarred(Ljava/util/Date;)V

    .line 270
    .line 271
    .line 272
    goto :goto_2

    .line 273
    :cond_5
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    new-instance v5, Lh7;

    .line 278
    .line 279
    invoke-direct {v5, p1, v1}, Lh7;-><init>(Lj7;I)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    invoke-static {v4, v0, v4, v5}, Ld34;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/interfaces/StarCallback;)V

    .line 286
    .line 287
    .line 288
    iget-object v0, p1, Lj7;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 289
    .line 290
    new-instance v1, Ljava/util/Date;

    .line 291
    .line 292
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->setStarred(Ljava/util/Date;)V

    .line 296
    .line 297
    .line 298
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 303
    .line 304
    .line 305
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    const-string v1, "sync_starred_albums_for_offline_use"

    .line 310
    .line 311
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    if-eqz v0, :cond_6

    .line 316
    .line 317
    iget-object p1, p1, Lj7;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 318
    .line 319
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    invoke-static {p1}, Lrv2;->l(Ljava/lang/String;)Lk03;

    .line 324
    .line 325
    .line 326
    move-result-object p1

    .line 327
    new-instance v0, Li7;

    .line 328
    .line 329
    invoke-direct {v0, p0, p1, v2}, Li7;-><init>(Ljava/lang/Object;Lk03;I)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {p1, v0}, Lad2;->f(La83;)V

    .line 333
    .line 334
    .line 335
    :cond_6
    :goto_2
    return-void

    .line 336
    :pswitch_5
    invoke-static {}, Lud3;->o()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->F0:Ljava/util/List;

    .line 341
    .line 342
    if-nez p1, :cond_7

    .line 343
    .line 344
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    new-instance v0, Lhu3;

    .line 349
    .line 350
    const/4 v1, 0x6

    .line 351
    invoke-direct {v0, v1}, Lhu3;-><init>(I)V

    .line 352
    .line 353
    .line 354
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    check-cast p1, Ljava/util/List;

    .line 367
    .line 368
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-static {v0}, Lau0;->w(Landroid/content/Context;)Leu0;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->G0:Ljava/util/List;

    .line 377
    .line 378
    invoke-virtual {v0, v1, p1}, Leu0;->f(Ljava/util/List;Ljava/util/List;)V

    .line 379
    .line 380
    .line 381
    goto :goto_3

    .line 382
    :cond_7
    new-instance p1, Le7;

    .line 383
    .line 384
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 385
    .line 386
    .line 387
    invoke-interface {v0, p1}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 388
    .line 389
    .line 390
    :goto_3
    invoke-virtual {p0}, Lzt;->h0()V

    .line 391
    .line 392
    .line 393
    return-void

    .line 394
    :pswitch_6
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->C0:Lj7;

    .line 395
    .line 396
    iget-object v0, p1, Lj7;->f:Lhh3;

    .line 397
    .line 398
    iget-object v2, p1, Lj7;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 399
    .line 400
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    iget-object p1, p1, Lj7;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 405
    .line 406
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getName()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object p1

    .line 410
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    invoke-static {v2, p1}, Lhh3;->h(Ljava/lang/String;Ljava/lang/String;)Lk03;

    .line 414
    .line 415
    .line 416
    move-result-object p1

    .line 417
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    new-instance v2, Lb7;

    .line 422
    .line 423
    invoke-direct {v2, p0, v1}, Lb7;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;I)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {p1, v0, v2}, Lad2;->e(Lba2;La83;)V

    .line 427
    .line 428
    .line 429
    return-void

    .line 430
    :pswitch_7
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->C0:Lj7;

    .line 431
    .line 432
    iget-object v0, p1, Lj7;->d:Lpa;

    .line 433
    .line 434
    iget-object p1, p1, Lj7;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 435
    .line 436
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getArtistId()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object p1

    .line 440
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    invoke-static {p1}, Lpa;->v(Ljava/lang/String;)Lk03;

    .line 444
    .line 445
    .line 446
    move-result-object p1

    .line 447
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    new-instance v1, Lb7;

    .line 452
    .line 453
    const/4 v2, 0x4

    .line 454
    invoke-direct {v1, p0, v2}, Lb7;-><init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;I)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {p1, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 458
    .line 459
    .line 460
    return-void

    .line 461
    :pswitch_data_0
    .packed-switch 0x0
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
