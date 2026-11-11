.class public final synthetic Lq6;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lq6;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Lq6;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 8

    .line 1
    iget p1, p0, Lq6;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    const-string v2, "ALBUM_OBJECT"

    .line 6
    .line 7
    const-string v3, "ARTIST_OBJECT"

    .line 8
    .line 9
    const-string v4, "TRACK_OBJECT"

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    iget-object p0, p0, Lq6;->o:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch p1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p0, Lmi4;

    .line 18
    .line 19
    iget-object p1, p0, Lmi4;->v:Lni4;

    .line 20
    .line 21
    iget-object p1, p1, Lni4;->B:Lrm3;

    .line 22
    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Lmi4;->t()Z

    .line 26
    .line 27
    .line 28
    move-result v5

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p0}, Lmi4;->s()V

    .line 31
    .line 32
    .line 33
    :goto_0
    return v5

    .line 34
    :pswitch_0
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;

    .line 35
    .line 36
    new-instance p1, Landroid/os/Bundle;

    .line 37
    .line 38
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 39
    .line 40
    .line 41
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->D0:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 42
    .line 43
    invoke-virtual {p1, v4, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 44
    .line 45
    .line 46
    new-instance v0, Lou3;

    .line 47
    .line 48
    invoke-direct {v0}, Lou3;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, p1}, Lkc1;->c0(Landroid/os/Bundle;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1}, Lnc1;->k()Lmd1;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {v0, p1, v1}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Lzt;->h0()V

    .line 66
    .line 67
    .line 68
    return v5

    .line 69
    :pswitch_1
    check-cast p0, Lxd4;

    .line 70
    .line 71
    new-instance p1, Landroid/os/Bundle;

    .line 72
    .line 73
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lxd4;->v:Ls6;

    .line 77
    .line 78
    iget-object v1, v0, Ls6;->r:Ljava/util/List;

    .line 79
    .line 80
    invoke-virtual {p0}, Lcx3;->c()I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, Landroid/os/Parcelable;

    .line 89
    .line 90
    invoke-virtual {p1, v4, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 91
    .line 92
    .line 93
    iget-object p0, v0, Ls6;->t:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 94
    .line 95
    check-cast p0, Lcp1;

    .line 96
    .line 97
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onMediaLongClick(Landroid/os/Bundle;)V

    .line 98
    .line 99
    .line 100
    return v5

    .line 101
    :pswitch_2
    check-cast p0, Ltc4;

    .line 102
    .line 103
    invoke-virtual {p0}, Ltc4;->s()V

    .line 104
    .line 105
    .line 106
    return v5

    .line 107
    :pswitch_3
    check-cast p0, Lra4;

    .line 108
    .line 109
    iget-object p1, p0, Lra4;->C0:Lse2;

    .line 110
    .line 111
    iget-object v1, p1, Lse2;->c:Lpz1;

    .line 112
    .line 113
    iget-object p1, p1, Lse2;->d:Lcom/eddyizm/tempus/model/Server;

    .line 114
    .line 115
    if-eqz p1, :cond_1

    .line 116
    .line 117
    new-instance v2, Loa4;

    .line 118
    .line 119
    iget-object v1, v1, Lpz1;->o:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v1, Lna4;

    .line 122
    .line 123
    invoke-direct {v2, v1, p1, v0}, Loa4;-><init>(Lna4;Lcom/eddyizm/tempus/model/Server;I)V

    .line 124
    .line 125
    .line 126
    new-instance p1, Ljava/lang/Thread;

    .line 127
    .line 128
    invoke-direct {p1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 132
    .line 133
    .line 134
    :cond_1
    iget-object p0, p0, Lpp0;->w0:Landroid/app/Dialog;

    .line 135
    .line 136
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 140
    .line 141
    .line 142
    return v5

    .line 143
    :pswitch_4
    check-cast p0, Lla4;

    .line 144
    .line 145
    new-instance p1, Landroid/os/Bundle;

    .line 146
    .line 147
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 148
    .line 149
    .line 150
    iget-object v0, p0, Lla4;->v:Lzd0;

    .line 151
    .line 152
    iget-object v1, v0, Lzd0;->r:Ljava/util/List;

    .line 153
    .line 154
    invoke-virtual {p0}, Lcx3;->c()I

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    check-cast p0, Landroid/os/Parcelable;

    .line 163
    .line 164
    const-string v1, "server_object"

    .line 165
    .line 166
    invoke-virtual {p1, v1, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 167
    .line 168
    .line 169
    iget-object p0, v0, Lzd0;->s:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;

    .line 172
    .line 173
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onServerLongClick(Landroid/os/Bundle;)V

    .line 174
    .line 175
    .line 176
    return v5

    .line 177
    :pswitch_5
    check-cast p0, Ldn3;

    .line 178
    .line 179
    invoke-virtual {p0}, Ldn3;->t()Z

    .line 180
    .line 181
    .line 182
    move-result p0

    .line 183
    return p0

    .line 184
    :pswitch_6
    check-cast p0, Lzm3;

    .line 185
    .line 186
    invoke-virtual {p0}, Lzm3;->s()V

    .line 187
    .line 188
    .line 189
    return v5

    .line 190
    :pswitch_7
    check-cast p0, Lvm3;

    .line 191
    .line 192
    new-instance p1, Landroid/os/Bundle;

    .line 193
    .line 194
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 195
    .line 196
    .line 197
    iget-object v0, p0, Lvm3;->v:Lej;

    .line 198
    .line 199
    iget-object v1, v0, Lej;->r:Ljava/util/List;

    .line 200
    .line 201
    invoke-virtual {p0}, Lcx3;->c()I

    .line 202
    .line 203
    .line 204
    move-result p0

    .line 205
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    check-cast p0, Landroid/os/Parcelable;

    .line 210
    .line 211
    const-string v1, "PODCAST_CHANNEL_OBJECT"

    .line 212
    .line 213
    invoke-virtual {p1, v1, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 214
    .line 215
    .line 216
    iget-object p0, v0, Lej;->t:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 217
    .line 218
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;

    .line 219
    .line 220
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onPodcastChannelLongClick(Landroid/os/Bundle;)V

    .line 221
    .line 222
    .line 223
    return v5

    .line 224
    :pswitch_8
    check-cast p0, Lyl3;

    .line 225
    .line 226
    invoke-virtual {p0}, Lyl3;->s()V

    .line 227
    .line 228
    .line 229
    return v5

    .line 230
    :pswitch_9
    check-cast p0, Lxi3;

    .line 231
    .line 232
    iget-object p0, p0, Lxi3;->o0:Lns3;

    .line 233
    .line 234
    iget-object p0, p0, Lns3;->q:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast p0, Lae1;

    .line 237
    .line 238
    iget-object p0, p0, Lae1;->e:Landroid/view/View;

    .line 239
    .line 240
    check-cast p0, Landroid/widget/ImageButton;

    .line 241
    .line 242
    const/16 p1, 0x8

    .line 243
    .line 244
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 245
    .line 246
    .line 247
    return v5

    .line 248
    :pswitch_a
    check-cast p0, Lyz2;

    .line 249
    .line 250
    iget-object p1, p0, Lyz2;->v:Lzd0;

    .line 251
    .line 252
    iget-object v1, p1, Lzd0;->r:Ljava/util/List;

    .line 253
    .line 254
    invoke-virtual {p0}, Lcx3;->c()I

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 263
    .line 264
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->isDir()Z

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    if-nez v1, :cond_2

    .line 269
    .line 270
    new-instance v0, Landroid/os/Bundle;

    .line 271
    .line 272
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 273
    .line 274
    .line 275
    iget-object v1, p1, Lzd0;->r:Ljava/util/List;

    .line 276
    .line 277
    invoke-virtual {p0}, Lcx3;->c()I

    .line 278
    .line 279
    .line 280
    move-result p0

    .line 281
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    check-cast p0, Landroid/os/Parcelable;

    .line 286
    .line 287
    invoke-virtual {v0, v4, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 288
    .line 289
    .line 290
    iget-object p0, p1, Lzd0;->s:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;

    .line 293
    .line 294
    invoke-interface {p0, v0}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onMediaLongClick(Landroid/os/Bundle;)V

    .line 295
    .line 296
    .line 297
    move v0, v5

    .line 298
    :cond_2
    return v0

    .line 299
    :pswitch_b
    check-cast p0, Loe2;

    .line 300
    .line 301
    iget-object p1, p0, Loe2;->n0:Ljava/util/ArrayList;

    .line 302
    .line 303
    if-eqz p1, :cond_5

    .line 304
    .line 305
    iget v0, p0, Loe2;->o0:I

    .line 306
    .line 307
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p1

    .line 311
    check-cast p1, Lcom/eddyizm/tempus/model/Server;

    .line 312
    .line 313
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/Server;->getServerName()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/Server;->getUsername()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/Server;->getPassword()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/Server;->getAddress()Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/Server;->getLocalAddress()Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    if-nez v4, :cond_3

    .line 334
    .line 335
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/Server;->getAddress()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    :cond_3
    invoke-virtual {p1}, Lcom/eddyizm/tempus/model/Server;->getClientCert()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object p1

    .line 343
    if-nez p1, :cond_4

    .line 344
    .line 345
    const-string p1, ""

    .line 346
    .line 347
    :cond_4
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 348
    .line 349
    .line 350
    move-result-object v6

    .line 351
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 355
    .line 356
    .line 357
    move-result-object v6

    .line 358
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 362
    .line 363
    .line 364
    move-result-object v6

    .line 365
    const-string v7, "server"

    .line 366
    .line 367
    invoke-interface {v6, v7, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 368
    .line 369
    .line 370
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 371
    .line 372
    .line 373
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 381
    .line 382
    .line 383
    move-result-object v0

    .line 384
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    const-string v6, "user"

    .line 392
    .line 393
    invoke-interface {v0, v6, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 394
    .line 395
    .line 396
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 397
    .line 398
    .line 399
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 411
    .line 412
    .line 413
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    const-string v1, "password"

    .line 418
    .line 419
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 420
    .line 421
    .line 422
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 423
    .line 424
    .line 425
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    const-string v1, "in_use_server_address"

    .line 444
    .line 445
    invoke-interface {v0, v1, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 446
    .line 447
    .line 448
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 449
    .line 450
    .line 451
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    const-string v1, "local_address"

    .line 470
    .line 471
    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 472
    .line 473
    .line 474
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 475
    .line 476
    .line 477
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 489
    .line 490
    .line 491
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    const-string v1, "client_cert"

    .line 496
    .line 497
    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 498
    .line 499
    .line 500
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 501
    .line 502
    .line 503
    invoke-static {v5}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 504
    .line 505
    .line 506
    new-instance p1, Lmm3;

    .line 507
    .line 508
    invoke-direct {p1}, Lmm3;-><init>()V

    .line 509
    .line 510
    .line 511
    invoke-virtual {p1}, Lmm3;->h()V

    .line 512
    .line 513
    .line 514
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 515
    .line 516
    .line 517
    move-result-object p1

    .line 518
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 519
    .line 520
    .line 521
    new-instance p1, Landroid/content/Intent;

    .line 522
    .line 523
    invoke-virtual {p0}, Lkc1;->n()Landroid/content/Context;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    const-class v1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 528
    .line 529
    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {p0, p1}, Lkc1;->g0(Landroid/content/Intent;)V

    .line 533
    .line 534
    .line 535
    return v5

    .line 536
    :cond_5
    const-string p0, "serverList"

    .line 537
    .line 538
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 539
    .line 540
    .line 541
    throw v1

    .line 542
    :pswitch_c
    check-cast p0, Lz02;

    .line 543
    .line 544
    invoke-virtual {p0}, Lz02;->s()V

    .line 545
    .line 546
    .line 547
    return v5

    .line 548
    :pswitch_d
    check-cast p0, Lhp1;

    .line 549
    .line 550
    iget-object p1, p0, Lhp1;->n0:Liu3;

    .line 551
    .line 552
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 553
    .line 554
    .line 555
    move-result-object p0

    .line 556
    invoke-virtual {p1, p0}, Liu3;->c(Lle1;)Lk03;

    .line 557
    .line 558
    .line 559
    return v5

    .line 560
    :pswitch_e
    check-cast p0, Let0;

    .line 561
    .line 562
    invoke-virtual {p0}, Let0;->s()Z

    .line 563
    .line 564
    .line 565
    move-result p0

    .line 566
    return p0

    .line 567
    :pswitch_f
    check-cast p0, Luq0;

    .line 568
    .line 569
    new-instance p1, Landroid/os/Bundle;

    .line 570
    .line 571
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 572
    .line 573
    .line 574
    iget-object v0, p0, Luq0;->v:Lvq0;

    .line 575
    .line 576
    iget-object v1, v0, Lvq0;->r:Ljava/util/List;

    .line 577
    .line 578
    invoke-virtual {p0}, Lcx3;->c()I

    .line 579
    .line 580
    .line 581
    move-result p0

    .line 582
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 583
    .line 584
    .line 585
    move-result-object p0

    .line 586
    check-cast p0, Landroid/os/Parcelable;

    .line 587
    .line 588
    invoke-virtual {p1, v4, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 589
    .line 590
    .line 591
    iget-object p0, v0, Lvq0;->q:Lcp1;

    .line 592
    .line 593
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onMediaLongClick(Landroid/os/Bundle;)V

    .line 594
    .line 595
    .line 596
    return v5

    .line 597
    :pswitch_10
    check-cast p0, Ljj;

    .line 598
    .line 599
    invoke-virtual {p0}, Ljj;->s()Z

    .line 600
    .line 601
    .line 602
    return v5

    .line 603
    :pswitch_11
    check-cast p0, Ldj;

    .line 604
    .line 605
    new-instance p1, Landroid/os/Bundle;

    .line 606
    .line 607
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 608
    .line 609
    .line 610
    iget-object v0, p0, Ldj;->v:Lej;

    .line 611
    .line 612
    iget-object v1, v0, Lej;->r:Ljava/util/List;

    .line 613
    .line 614
    invoke-virtual {p0}, Lcx3;->c()I

    .line 615
    .line 616
    .line 617
    move-result p0

    .line 618
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object p0

    .line 622
    check-cast p0, Landroid/os/Parcelable;

    .line 623
    .line 624
    invoke-virtual {p1, v3, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 625
    .line 626
    .line 627
    iget-object p0, v0, Lej;->t:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 628
    .line 629
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;

    .line 630
    .line 631
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onArtistLongClick(Landroid/os/Bundle;)V

    .line 632
    .line 633
    .line 634
    return v5

    .line 635
    :pswitch_12
    check-cast p0, Lcj;

    .line 636
    .line 637
    new-instance p1, Landroid/os/Bundle;

    .line 638
    .line 639
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 640
    .line 641
    .line 642
    iget-object v0, p0, Lcj;->v:Ls6;

    .line 643
    .line 644
    iget-object v1, v0, Ls6;->r:Ljava/util/List;

    .line 645
    .line 646
    invoke-virtual {p0}, Lcx3;->c()I

    .line 647
    .line 648
    .line 649
    move-result p0

    .line 650
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object p0

    .line 654
    check-cast p0, Landroid/os/Parcelable;

    .line 655
    .line 656
    invoke-virtual {p1, v3, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 657
    .line 658
    .line 659
    iget-object p0, v0, Ls6;->t:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 660
    .line 661
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;

    .line 662
    .line 663
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onArtistLongClick(Landroid/os/Bundle;)V

    .line 664
    .line 665
    .line 666
    return v5

    .line 667
    :pswitch_13
    check-cast p0, Lui;

    .line 668
    .line 669
    new-instance p1, Landroid/os/Bundle;

    .line 670
    .line 671
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 672
    .line 673
    .line 674
    iget-object v0, p0, Lui;->v:Lvi;

    .line 675
    .line 676
    iget-object v1, v0, Lvi;->u:Ljava/util/List;

    .line 677
    .line 678
    invoke-virtual {p0}, Lcx3;->c()I

    .line 679
    .line 680
    .line 681
    move-result p0

    .line 682
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object p0

    .line 686
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 687
    .line 688
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->strippedForNav()Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 689
    .line 690
    .line 691
    move-result-object p0

    .line 692
    invoke-virtual {p1, v3, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 693
    .line 694
    .line 695
    iget-object p0, v0, Lvi;->q:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 696
    .line 697
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onArtistLongClick(Landroid/os/Bundle;)V

    .line 698
    .line 699
    .line 700
    return v5

    .line 701
    :pswitch_14
    check-cast p0, La8;

    .line 702
    .line 703
    invoke-virtual {p0}, La8;->s()V

    .line 704
    .line 705
    .line 706
    return v5

    .line 707
    :pswitch_15
    check-cast p0, Lp7;

    .line 708
    .line 709
    new-instance p1, Landroid/os/Bundle;

    .line 710
    .line 711
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 712
    .line 713
    .line 714
    iget-object v0, p0, Lp7;->v:Lq7;

    .line 715
    .line 716
    iget-object v1, v0, Lq7;->s:Ljava/util/List;

    .line 717
    .line 718
    invoke-virtual {p0}, Lcx3;->c()I

    .line 719
    .line 720
    .line 721
    move-result p0

    .line 722
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 723
    .line 724
    .line 725
    move-result-object p0

    .line 726
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 727
    .line 728
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->strippedForNav()Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 729
    .line 730
    .line 731
    move-result-object p0

    .line 732
    invoke-virtual {p1, v2, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 733
    .line 734
    .line 735
    iget-object p0, v0, Lq7;->u:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 736
    .line 737
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;

    .line 738
    .line 739
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onAlbumLongClick(Landroid/os/Bundle;)V

    .line 740
    .line 741
    .line 742
    return v5

    .line 743
    :pswitch_16
    check-cast p0, Lk7;

    .line 744
    .line 745
    new-instance p1, Landroid/os/Bundle;

    .line 746
    .line 747
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 748
    .line 749
    .line 750
    iget-object v0, p0, Lk7;->v:Ll7;

    .line 751
    .line 752
    iget-object v1, v0, Ll7;->r:Ljava/util/List;

    .line 753
    .line 754
    invoke-virtual {p0}, Lcx3;->c()I

    .line 755
    .line 756
    .line 757
    move-result p0

    .line 758
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    move-result-object p0

    .line 762
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 763
    .line 764
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->strippedForNav()Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 765
    .line 766
    .line 767
    move-result-object p0

    .line 768
    invoke-virtual {p1, v2, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 769
    .line 770
    .line 771
    iget-object p0, v0, Ll7;->q:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 772
    .line 773
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onAlbumLongClick(Landroid/os/Bundle;)V

    .line 774
    .line 775
    .line 776
    return v5

    .line 777
    :pswitch_17
    check-cast p0, Lr6;

    .line 778
    .line 779
    new-instance p1, Landroid/os/Bundle;

    .line 780
    .line 781
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 782
    .line 783
    .line 784
    iget-object v0, p0, Lr6;->v:Ls6;

    .line 785
    .line 786
    iget-object v1, v0, Ls6;->r:Ljava/util/List;

    .line 787
    .line 788
    invoke-virtual {p0}, Lcx3;->c()I

    .line 789
    .line 790
    .line 791
    move-result p0

    .line 792
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object p0

    .line 796
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 797
    .line 798
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->strippedForNav()Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 799
    .line 800
    .line 801
    move-result-object p0

    .line 802
    invoke-virtual {p1, v2, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 803
    .line 804
    .line 805
    iget-object p0, v0, Ls6;->t:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 806
    .line 807
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onAlbumLongClick(Landroid/os/Bundle;)V

    .line 808
    .line 809
    .line 810
    return v5

    .line 811
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
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
