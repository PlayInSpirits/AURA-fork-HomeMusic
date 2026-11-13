.class public final synthetic Ldefpackage/j8;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/j8;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/j8;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Ldefpackage/j8;->p:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 14

    .line 1
    iget v0, p0, Ldefpackage/j8;->n:I

    .line 2
    .line 3
    const-string v1, "android.intent.action.VIEW"

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const/16 v3, 0xa

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    iget-object v7, p0, Ldefpackage/j8;->p:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object p0, p0, Ldefpackage/j8;->o:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p0, Ldefpackage/uv4;

    .line 19
    .line 20
    check-cast v7, Ldefpackage/ik;

    .line 21
    .line 22
    invoke-virtual {p0, v4, v5}, Ldefpackage/pp0;->i0(ZZ)V

    .line 23
    .line 24
    .line 25
    const-string p1, "song"

    .line 26
    .line 27
    iget-object v0, v7, Ldefpackage/ik;->c:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    xor-int/2addr p1, v4

    .line 34
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 39
    .line 40
    invoke-virtual {p0, v7, p1}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->F(Ldefpackage/ik;Z)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_0
    check-cast p0, Ldefpackage/zk4;

    .line 45
    .line 46
    check-cast v7, Ldefpackage/f9;

    .line 47
    .line 48
    invoke-static {v5}, Ldefpackage/ud3;->A0(Z)V

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, Ldefpackage/zk4;->D0:Ljava/lang/Runnable;

    .line 52
    .line 53
    check-cast p0, Ldefpackage/rb4;

    .line 54
    .line 55
    if-eqz p0, :cond_0

    .line 56
    .line 57
    invoke-virtual {p0}, Ldefpackage/rb4;->run()V

    .line 58
    .line 59
    .line 60
    :cond_0
    invoke-virtual {v7}, Ldefpackage/dg;->dismiss()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_1
    check-cast p0, Ldefpackage/zk4;

    .line 65
    .line 66
    check-cast v7, Ldefpackage/f9;

    .line 67
    .line 68
    const-string p1, "sync_starred_artists_for_offline_use"

    .line 69
    .line 70
    invoke-static {p1, v5}, Ldefpackage/xa3;->t(Ljava/lang/String;Z)V

    .line 71
    .line 72
    .line 73
    iget-object p0, p0, Ldefpackage/zk4;->D0:Ljava/lang/Runnable;

    .line 74
    .line 75
    check-cast p0, Ldefpackage/rb4;

    .line 76
    .line 77
    if-eqz p0, :cond_1

    .line 78
    .line 79
    invoke-virtual {p0}, Ldefpackage/rb4;->run()V

    .line 80
    .line 81
    .line 82
    :cond_1
    invoke-virtual {v7}, Ldefpackage/dg;->dismiss()V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :pswitch_2
    check-cast p0, Ldefpackage/zk4;

    .line 87
    .line 88
    check-cast v7, Ldefpackage/f9;

    .line 89
    .line 90
    invoke-static {v5}, Ldefpackage/ud3;->z0(Z)V

    .line 91
    .line 92
    .line 93
    iget-object p0, p0, Ldefpackage/zk4;->D0:Ljava/lang/Runnable;

    .line 94
    .line 95
    check-cast p0, Ldefpackage/rb4;

    .line 96
    .line 97
    if-eqz p0, :cond_2

    .line 98
    .line 99
    invoke-virtual {p0}, Ldefpackage/rb4;->run()V

    .line 100
    .line 101
    .line 102
    :cond_2
    invoke-virtual {v7}, Ldefpackage/dg;->dismiss()V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_3
    check-cast p0, Ldefpackage/qg4;

    .line 107
    .line 108
    check-cast v7, Landroid/view/View$OnClickListener;

    .line 109
    .line 110
    invoke-interface {v7, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0, v4}, Ldefpackage/fr;->a(I)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_4
    check-cast p0, Ldefpackage/sa4;

    .line 118
    .line 119
    check-cast v7, Ldefpackage/f9;

    .line 120
    .line 121
    invoke-virtual {p0}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    check-cast p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 126
    .line 127
    if-eqz p0, :cond_3

    .line 128
    .line 129
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->H()V

    .line 130
    .line 131
    .line 132
    :cond_3
    invoke-virtual {v7}, Ldefpackage/dg;->dismiss()V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :pswitch_5
    check-cast p0, Ldefpackage/zd0;

    .line 137
    .line 138
    check-cast v7, Lcom/eddyizm/tempus/radiobrowser/RadioBrowserStation;

    .line 139
    .line 140
    iget-object p0, p0, Ldefpackage/zd0;->s:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast p0, Ldefpackage/ss2;

    .line 143
    .line 144
    iget-object p0, p0, Ldefpackage/ss2;->o:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast p0, Ldefpackage/eu3;

    .line 147
    .line 148
    iget-object p1, v7, Lcom/eddyizm/tempus/radiobrowser/RadioBrowserStation;->urlResolved:Ljava/lang/String;

    .line 149
    .line 150
    if-eqz p1, :cond_4

    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_4
    iget-object p1, v7, Lcom/eddyizm/tempus/radiobrowser/RadioBrowserStation;->url:Ljava/lang/String;

    .line 154
    .line 155
    :goto_0
    iget-object v0, p0, Ldefpackage/eu3;->B0:Ldefpackage/up0;

    .line 156
    .line 157
    iget-object v0, v0, Ldefpackage/up0;->f:Landroid/view/View;

    .line 158
    .line 159
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 160
    .line 161
    iget-object v1, v7, Lcom/eddyizm/tempus/radiobrowser/RadioBrowserStation;->name:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    .line 165
    .line 166
    iget-object v0, p0, Ldefpackage/eu3;->B0:Ldefpackage/up0;

    .line 167
    .line 168
    iget-object v0, v0, Ldefpackage/up0;->g:Landroid/view/View;

    .line 169
    .line 170
    check-cast v0, Lcom/google/android/material/textfield/TextInputEditText;

    .line 171
    .line 172
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 173
    .line 174
    .line 175
    iget-object p1, p0, Ldefpackage/eu3;->B0:Ldefpackage/up0;

    .line 176
    .line 177
    iget-object p1, p1, Ldefpackage/up0;->e:Landroid/view/View;

    .line 178
    .line 179
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 180
    .line 181
    iget-object v0, v7, Lcom/eddyizm/tempus/radiobrowser/RadioBrowserStation;->homepage:Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 184
    .line 185
    .line 186
    iget-object p1, v7, Lcom/eddyizm/tempus/radiobrowser/RadioBrowserStation;->favicon:Ljava/lang/String;

    .line 187
    .line 188
    if-eqz p1, :cond_5

    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 191
    .line 192
    .line 193
    move-result p1

    .line 194
    if-nez p1, :cond_5

    .line 195
    .line 196
    iget-object v6, v7, Lcom/eddyizm/tempus/radiobrowser/RadioBrowserStation;->favicon:Ljava/lang/String;

    .line 197
    .line 198
    :cond_5
    iget-object p1, p0, Ldefpackage/eu3;->B0:Ldefpackage/up0;

    .line 199
    .line 200
    iget-object p1, p1, Ldefpackage/up0;->d:Landroid/view/View;

    .line 201
    .line 202
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 203
    .line 204
    invoke-virtual {p1, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 205
    .line 206
    .line 207
    iget-object p0, p0, Ldefpackage/eu3;->I0:Landroid/widget/PopupWindow;

    .line 208
    .line 209
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 210
    .line 211
    .line 212
    return-void

    .line 213
    :pswitch_6
    check-cast p0, Ldefpackage/yk3;

    .line 214
    .line 215
    check-cast v7, Ldefpackage/xk3;

    .line 216
    .line 217
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    iget-boolean p1, p1, Ldefpackage/v52;->a:Z

    .line 222
    .line 223
    if-eqz p1, :cond_9

    .line 224
    .line 225
    invoke-virtual {v7}, Ldefpackage/cx3;->c()I

    .line 226
    .line 227
    .line 228
    move-result p0

    .line 229
    const/4 p1, -0x1

    .line 230
    if-ne p0, p1, :cond_6

    .line 231
    .line 232
    goto :goto_2

    .line 233
    :cond_6
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    iget v0, p1, Ldefpackage/v52;->o:I

    .line 238
    .line 239
    if-ne p0, v0, :cond_8

    .line 240
    .line 241
    iget-boolean p0, p1, Ldefpackage/v52;->k:Z

    .line 242
    .line 243
    if-eqz p0, :cond_7

    .line 244
    .line 245
    const-string p0, "pause"

    .line 246
    .line 247
    goto :goto_1

    .line 248
    :cond_7
    const-string p0, "play"

    .line 249
    .line 250
    :goto_1
    const-wide/16 v0, 0x0

    .line 251
    .line 252
    invoke-static {p0, v0, v1}, Ldefpackage/u52;->a(Ljava/lang/String;J)V

    .line 253
    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_8
    const-string p1, "select"

    .line 257
    .line 258
    invoke-static {p1, p0, p0}, Ldefpackage/u52;->q(Ljava/lang/String;II)Z

    .line 259
    .line 260
    .line 261
    goto :goto_2

    .line 262
    :cond_9
    iget-object p1, p0, Ldefpackage/yk3;->r:Ldefpackage/bl2;

    .line 263
    .line 264
    new-instance v0, Ldefpackage/ur2;

    .line 265
    .line 266
    invoke-direct {v0, v3, p0, v7}, Ldefpackage/ur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    sget-object p0, Ldefpackage/gq0;->n:Ldefpackage/gq0;

    .line 270
    .line 271
    invoke-virtual {p1, v0, p0}, Ldefpackage/u0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 272
    .line 273
    .line 274
    :goto_2
    return-void

    .line 275
    :pswitch_7
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 276
    .line 277
    check-cast v7, Ldefpackage/do2;

    .line 278
    .line 279
    new-instance p1, Ldefpackage/uv4;

    .line 280
    .line 281
    invoke-direct {p1, v7}, Ldefpackage/uv4;-><init>(Ldefpackage/do2;)V

    .line 282
    .line 283
    .line 284
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->K0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 285
    .line 286
    invoke-virtual {p0}, Ldefpackage/nc1;->k()Ldefpackage/md1;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    invoke-virtual {p1, p0, v6}, Ldefpackage/pp0;->m0(Ldefpackage/ld1;Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    return-void

    .line 294
    :pswitch_8
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 295
    .line 296
    check-cast v7, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 297
    .line 298
    new-instance p1, Landroid/os/Bundle;

    .line 299
    .line 300
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 301
    .line 302
    .line 303
    const-string v0, "ALBUM_OBJECT"

    .line 304
    .line 305
    invoke-virtual {p1, v0, v7}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 306
    .line 307
    .line 308
    invoke-static {p0}, Ldefpackage/q05;->l(Ldefpackage/kc1;)Ldefpackage/v23;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    const v1, 0x7f0a009f

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0, v1, p1, v6}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 316
    .line 317
    .line 318
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->K0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 319
    .line 320
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->q()V

    .line 321
    .line 322
    .line 323
    return-void

    .line 324
    :pswitch_9
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 325
    .line 326
    check-cast v7, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 327
    .line 328
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->L0:Ldefpackage/aj3;

    .line 329
    .line 330
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    invoke-virtual {p1, p0, v7}, Ldefpackage/aj3;->h(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 335
    .line 336
    .line 337
    return-void

    .line 338
    :pswitch_a
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 339
    .line 340
    check-cast v7, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 341
    .line 342
    new-instance p1, Landroid/os/Bundle;

    .line 343
    .line 344
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 345
    .line 346
    .line 347
    const-string v0, "ARTIST_OBJECT"

    .line 348
    .line 349
    invoke-virtual {p1, v0, v7}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 350
    .line 351
    .line 352
    invoke-static {p0}, Ldefpackage/q05;->l(Ldefpackage/kc1;)Ldefpackage/v23;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    const v1, 0x7f0a00e2

    .line 357
    .line 358
    .line 359
    invoke-virtual {v0, v1, p1, v6}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 360
    .line 361
    .line 362
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->K0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 363
    .line 364
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->q()V

    .line 365
    .line 366
    .line 367
    return-void

    .line 368
    :pswitch_b
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 369
    .line 370
    check-cast v7, Ldefpackage/bj2;

    .line 371
    .line 372
    new-instance p1, Ldefpackage/xf4;

    .line 373
    .line 374
    invoke-direct {p1}, Ldefpackage/xf4;-><init>()V

    .line 375
    .line 376
    .line 377
    new-instance v0, Ldefpackage/pz1;

    .line 378
    .line 379
    invoke-direct {v0, p0, v7}, Ldefpackage/pz1;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;Ldefpackage/bj2;)V

    .line 380
    .line 381
    .line 382
    iput-object v0, p1, Ldefpackage/xf4;->B0:Ldefpackage/pz1;

    .line 383
    .line 384
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 385
    .line 386
    .line 387
    move-result-object p0

    .line 388
    invoke-virtual {p0}, Ldefpackage/nc1;->k()Ldefpackage/md1;

    .line 389
    .line 390
    .line 391
    move-result-object p0

    .line 392
    invoke-virtual {p1, p0, v6}, Ldefpackage/pp0;->m0(Ldefpackage/ld1;Ljava/lang/String;)V

    .line 393
    .line 394
    .line 395
    return-void

    .line 396
    :pswitch_c
    check-cast p0, Ldefpackage/ad2;

    .line 397
    .line 398
    check-cast v7, Landroid/view/View;

    .line 399
    .line 400
    invoke-virtual {p0}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object p0

    .line 404
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 405
    .line 406
    if-eqz p0, :cond_e

    .line 407
    .line 408
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 409
    .line 410
    .line 411
    move-result-object p1

    .line 412
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object p0

    .line 419
    sget-object v0, Lcom/eddyizm/tempus/homemusic/a;->a:Ljava/lang/ref/WeakReference;

    .line 420
    .line 421
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    sget-object v0, Lcom/eddyizm/tempus/homemusic/a;->b:Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 425
    .line 426
    if-nez v0, :cond_a

    .line 427
    .line 428
    goto :goto_3

    .line 429
    :cond_a
    invoke-virtual {v0, p0}, Lcom/eddyizm/tempus/homemusic/SmartSession;->isRec(Ljava/lang/String;)Z

    .line 430
    .line 431
    .line 432
    move-result v1

    .line 433
    if-nez v1, :cond_b

    .line 434
    .line 435
    goto :goto_3

    .line 436
    :cond_b
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 437
    .line 438
    .line 439
    move-result-object p1

    .line 440
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->h()Ldefpackage/qi3;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    if-eqz v1, :cond_d

    .line 445
    .line 446
    invoke-interface {v1}, Ldefpackage/qi3;->a()Ldefpackage/gn2;

    .line 447
    .line 448
    .line 449
    move-result-object v2

    .line 450
    if-eqz v2, :cond_c

    .line 451
    .line 452
    iget-object v6, v2, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 453
    .line 454
    :cond_c
    invoke-static {v6, p0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v2

    .line 458
    if-eqz v2, :cond_d

    .line 459
    .line 460
    invoke-interface {v1}, Ldefpackage/qi3;->f0()Z

    .line 461
    .line 462
    .line 463
    move-result v2

    .line 464
    if-eqz v2, :cond_d

    .line 465
    .line 466
    invoke-interface {v1}, Ldefpackage/qi3;->c0()V

    .line 467
    .line 468
    .line 469
    :cond_d
    sget-object v1, Ldefpackage/io1;->a:Ljava/util/concurrent/ExecutorService;

    .line 470
    .line 471
    new-instance v2, Ldefpackage/ct1;

    .line 472
    .line 473
    invoke-direct {v2, v0, p0, p1, v4}, Ldefpackage/ct1;-><init>(Lcom/eddyizm/tempus/homemusic/SmartSession;Ljava/lang/String;Landroid/content/Context;I)V

    .line 474
    .line 475
    .line 476
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 477
    .line 478
    .line 479
    :cond_e
    :goto_3
    return-void

    .line 480
    :pswitch_d
    check-cast p0, Landroid/view/View;

    .line 481
    .line 482
    check-cast v7, Ldefpackage/wj3;

    .line 483
    .line 484
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 485
    .line 486
    .line 487
    move-result-object p0

    .line 488
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 489
    .line 490
    .line 491
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->h()Ldefpackage/qi3;

    .line 492
    .line 493
    .line 494
    move-result-object p1

    .line 495
    if-nez p1, :cond_f

    .line 496
    .line 497
    invoke-virtual {v7}, Ldefpackage/wj3;->get()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object p0

    .line 501
    check-cast p0, Ldefpackage/qi3;

    .line 502
    .line 503
    if-eqz p0, :cond_23

    .line 504
    .line 505
    invoke-interface {p0}, Ldefpackage/qi3;->D0()Z

    .line 506
    .line 507
    .line 508
    move-result p1

    .line 509
    xor-int/2addr p1, v4

    .line 510
    invoke-interface {p0, p1}, Ldefpackage/qi3;->s(Z)V

    .line 511
    .line 512
    .line 513
    goto/16 :goto_d

    .line 514
    .line 515
    :cond_f
    sget-boolean v0, Lcom/eddyizm/tempus/homemusic/a;->d:Z

    .line 516
    .line 517
    if-eqz v0, :cond_10

    .line 518
    .line 519
    goto/16 :goto_d

    .line 520
    .line 521
    :cond_10
    invoke-interface {p1}, Ldefpackage/qi3;->D0()Z

    .line 522
    .line 523
    .line 524
    move-result v0

    .line 525
    sget-object v1, Lcom/eddyizm/tempus/homemusic/a;->b:Lcom/eddyizm/tempus/homemusic/SmartSession;

    .line 526
    .line 527
    if-eqz v1, :cond_11

    .line 528
    .line 529
    move v1, v4

    .line 530
    goto :goto_4

    .line 531
    :cond_11
    move v1, v5

    .line 532
    :goto_4
    sget-object v7, Ldefpackage/od4;->n:Ldefpackage/hh3;

    .line 533
    .line 534
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 535
    .line 536
    .line 537
    sget-object v7, Ldefpackage/od4;->o:Ldefpackage/od4;

    .line 538
    .line 539
    sget-object v8, Ldefpackage/od4;->p:Ldefpackage/od4;

    .line 540
    .line 541
    sget-object v9, Ldefpackage/od4;->q:Ldefpackage/od4;

    .line 542
    .line 543
    if-eqz v1, :cond_12

    .line 544
    .line 545
    move-object v0, v9

    .line 546
    goto :goto_5

    .line 547
    :cond_12
    if-eqz v0, :cond_13

    .line 548
    .line 549
    move-object v0, v8

    .line 550
    goto :goto_5

    .line 551
    :cond_13
    move-object v0, v7

    .line 552
    :goto_5
    invoke-static {p1}, Lcom/eddyizm/tempus/homemusic/a;->i(Ldefpackage/qi3;)Ljava/lang/String;

    .line 553
    .line 554
    .line 555
    move-result-object v1

    .line 556
    if-eqz v1, :cond_14

    .line 557
    .line 558
    move v1, v4

    .line 559
    goto :goto_6

    .line 560
    :cond_14
    move v1, v5

    .line 561
    :goto_6
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 562
    .line 563
    .line 564
    move-result v10

    .line 565
    if-eqz v10, :cond_17

    .line 566
    .line 567
    if-eq v10, v4, :cond_16

    .line 568
    .line 569
    if-ne v10, v2, :cond_15

    .line 570
    .line 571
    goto :goto_7

    .line 572
    :cond_15
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 573
    .line 574
    .line 575
    goto/16 :goto_d

    .line 576
    .line 577
    :cond_16
    if-eqz v1, :cond_18

    .line 578
    .line 579
    move-object v7, v9

    .line 580
    goto :goto_7

    .line 581
    :cond_17
    move-object v7, v8

    .line 582
    :cond_18
    :goto_7
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 583
    .line 584
    .line 585
    move-result v1

    .line 586
    if-eqz v1, :cond_21

    .line 587
    .line 588
    if-eq v1, v4, :cond_20

    .line 589
    .line 590
    if-ne v1, v2, :cond_1f

    .line 591
    .line 592
    invoke-static {v4}, Ldefpackage/ud3;->y0(Z)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 596
    .line 597
    .line 598
    move-result-object p0

    .line 599
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    invoke-static {p1}, Lcom/eddyizm/tempus/homemusic/a;->i(Ldefpackage/qi3;)Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v8

    .line 606
    invoke-static {p1}, Lcom/eddyizm/tempus/homemusic/a;->e(Ldefpackage/qi3;)Ljava/util/ArrayList;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    invoke-interface {p1}, Ldefpackage/qi3;->o0()I

    .line 611
    .line 612
    .line 613
    move-result v1

    .line 614
    if-eqz v8, :cond_1e

    .line 615
    .line 616
    if-ltz v1, :cond_1e

    .line 617
    .line 618
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 619
    .line 620
    .line 621
    move-result v2

    .line 622
    if-ge v1, v2, :cond_1e

    .line 623
    .line 624
    new-instance p1, Ljava/util/ArrayList;

    .line 625
    .line 626
    invoke-static {v0, v3}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 627
    .line 628
    .line 629
    move-result v2

    .line 630
    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 634
    .line 635
    .line 636
    move-result v2

    .line 637
    move v7, v5

    .line 638
    :goto_8
    if-ge v7, v2, :cond_19

    .line 639
    .line 640
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v9

    .line 644
    add-int/lit8 v7, v7, 0x1

    .line 645
    .line 646
    check-cast v9, Ldefpackage/gn2;

    .line 647
    .line 648
    iget-object v9, v9, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 649
    .line 650
    invoke-virtual {p1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    goto :goto_8

    .line 654
    :cond_19
    new-instance v2, Ljava/util/ArrayList;

    .line 655
    .line 656
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 657
    .line 658
    .line 659
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 660
    .line 661
    .line 662
    move-result v7

    .line 663
    move v9, v5

    .line 664
    :cond_1a
    :goto_9
    if-ge v9, v7, :cond_1b

    .line 665
    .line 666
    invoke-virtual {p1, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v10

    .line 670
    add-int/lit8 v9, v9, 0x1

    .line 671
    .line 672
    move-object v11, v10

    .line 673
    check-cast v11, Ljava/lang/String;

    .line 674
    .line 675
    sget-object v12, Ldefpackage/rs1;->a:Ldefpackage/rs1;

    .line 676
    .line 677
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 678
    .line 679
    .line 680
    invoke-static {v11}, Ldefpackage/rs1;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 681
    .line 682
    .line 683
    move-result-object v11

    .line 684
    invoke-virtual {v11, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 685
    .line 686
    .line 687
    move-result v11

    .line 688
    if-eqz v11, :cond_1a

    .line 689
    .line 690
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 691
    .line 692
    .line 693
    goto :goto_9

    .line 694
    :cond_1b
    sget-object p1, Lcom/eddyizm/tempus/homemusic/SmartContexts;->INSTANCE:Lcom/eddyizm/tempus/homemusic/SmartContexts;

    .line 695
    .line 696
    new-instance v9, Ljava/util/ArrayList;

    .line 697
    .line 698
    invoke-static {v2, v3}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 699
    .line 700
    .line 701
    move-result v3

    .line 702
    invoke-direct {v9, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 703
    .line 704
    .line 705
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 706
    .line 707
    .line 708
    move-result v3

    .line 709
    :goto_a
    if-ge v5, v3, :cond_1c

    .line 710
    .line 711
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v7

    .line 715
    add-int/lit8 v5, v5, 0x1

    .line 716
    .line 717
    check-cast v7, Ljava/lang/String;

    .line 718
    .line 719
    invoke-virtual {p1, v7}, Lcom/eddyizm/tempus/homemusic/SmartContexts;->hubId(Ljava/lang/String;)Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v7

    .line 723
    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 724
    .line 725
    .line 726
    goto :goto_a

    .line 727
    :cond_1c
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object p1

    .line 731
    check-cast p1, Ldefpackage/gn2;

    .line 732
    .line 733
    iget-object p1, p1, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 734
    .line 735
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 736
    .line 737
    .line 738
    move-result v0

    .line 739
    if-eqz v0, :cond_1d

    .line 740
    .line 741
    move-object v10, p1

    .line 742
    goto :goto_b

    .line 743
    :cond_1d
    move-object v10, v6

    .line 744
    :goto_b
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 745
    .line 746
    .line 747
    move-result-object v12

    .line 748
    const p0, 0x7f130241

    .line 749
    .line 750
    .line 751
    invoke-static {v12, p0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 752
    .line 753
    .line 754
    move-result-object p0

    .line 755
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 756
    .line 757
    .line 758
    sput-boolean v4, Lcom/eddyizm/tempus/homemusic/a;->d:Z

    .line 759
    .line 760
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->c()V

    .line 761
    .line 762
    .line 763
    sget-object p0, Ldefpackage/io1;->a:Ljava/util/concurrent/ExecutorService;

    .line 764
    .line 765
    new-instance v7, Ldefpackage/up;

    .line 766
    .line 767
    const-string v11, "player"

    .line 768
    .line 769
    const/4 v13, 0x0

    .line 770
    invoke-direct/range {v7 .. v13}, Ldefpackage/up;-><init>(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;)V

    .line 771
    .line 772
    .line 773
    invoke-interface {p0, v7}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 774
    .line 775
    .line 776
    goto :goto_c

    .line 777
    :cond_1e
    const v0, 0x7f130243

    .line 778
    .line 779
    .line 780
    invoke-static {p0, v0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 781
    .line 782
    .line 783
    move-result-object p0

    .line 784
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 785
    .line 786
    .line 787
    invoke-interface {p1, v5}, Ldefpackage/qi3;->s(Z)V

    .line 788
    .line 789
    .line 790
    goto :goto_c

    .line 791
    :cond_1f
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 792
    .line 793
    .line 794
    goto :goto_d

    .line 795
    :cond_20
    invoke-interface {p1, v4}, Ldefpackage/qi3;->s(Z)V

    .line 796
    .line 797
    .line 798
    goto :goto_c

    .line 799
    :cond_21
    if-ne v0, v9, :cond_22

    .line 800
    .line 801
    invoke-static {p1}, Lcom/eddyizm/tempus/homemusic/a;->g(Ldefpackage/qi3;)V

    .line 802
    .line 803
    .line 804
    :cond_22
    invoke-interface {p1, v5}, Ldefpackage/qi3;->s(Z)V

    .line 805
    .line 806
    .line 807
    invoke-static {v5}, Ldefpackage/ud3;->y0(Z)V

    .line 808
    .line 809
    .line 810
    :goto_c
    invoke-static {}, Lcom/eddyizm/tempus/homemusic/a;->c()V

    .line 811
    .line 812
    .line 813
    :cond_23
    :goto_d
    return-void

    .line 814
    :pswitch_e
    check-cast p0, Ldefpackage/fx3;

    .line 815
    .line 816
    check-cast v7, Ljava/lang/String;

    .line 817
    .line 818
    sget-object p1, Ldefpackage/ur1;->a:Ljava/util/concurrent/ExecutorService;

    .line 819
    .line 820
    new-instance v0, Ldefpackage/k6;

    .line 821
    .line 822
    const/16 v1, 0x1d

    .line 823
    .line 824
    invoke-direct {v0, v1, p0, v7}, Ldefpackage/k6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 825
    .line 826
    .line 827
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 828
    .line 829
    .line 830
    return-void

    .line 831
    :pswitch_f
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;

    .line 832
    .line 833
    check-cast v7, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 834
    .line 835
    invoke-virtual {p0}, Ldefpackage/kc1;->q()Ldefpackage/ld1;

    .line 836
    .line 837
    .line 838
    move-result-object p1

    .line 839
    invoke-virtual {p0}, Ldefpackage/zt;->h0()V

    .line 840
    .line 841
    .line 842
    new-instance p0, Landroid/os/Bundle;

    .line 843
    .line 844
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 845
    .line 846
    .line 847
    const-string v0, "TRACK_OBJECT"

    .line 848
    .line 849
    invoke-virtual {p0, v0, v7}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 850
    .line 851
    .line 852
    const-string v0, "homemusic_remove_from_liked"

    .line 853
    .line 854
    invoke-virtual {p1, v0, p0}, Ldefpackage/ld1;->Z(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 855
    .line 856
    .line 857
    return-void

    .line 858
    :pswitch_10
    check-cast p0, Ldefpackage/q7;

    .line 859
    .line 860
    check-cast v7, Ldefpackage/mo1;

    .line 861
    .line 862
    iget-object p0, p0, Ldefpackage/q7;->u:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 863
    .line 864
    new-instance p1, Landroid/os/Bundle;

    .line 865
    .line 866
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 867
    .line 868
    .line 869
    iget-object v0, v7, Ldefpackage/mo1;->x:Ldefpackage/q7;

    .line 870
    .line 871
    iget-object v0, v0, Ldefpackage/q7;->t:Ljava/util/List;

    .line 872
    .line 873
    invoke-virtual {v7}, Ldefpackage/cx3;->c()I

    .line 874
    .line 875
    .line 876
    move-result v1

    .line 877
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    check-cast v0, Landroid/os/Parcelable;

    .line 882
    .line 883
    const-string v1, "PLAYLIST_OBJECT"

    .line 884
    .line 885
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 886
    .line 887
    .line 888
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onPlaylistClick(Landroid/os/Bundle;)V

    .line 889
    .line 890
    .line 891
    return-void

    .line 892
    :pswitch_11
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;

    .line 893
    .line 894
    check-cast v7, Landroid/os/Bundle;

    .line 895
    .line 896
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->n0:Ldefpackage/f71;

    .line 897
    .line 898
    iget-object p1, p1, Ldefpackage/f71;->d:Ljava/util/ArrayList;

    .line 899
    .line 900
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 901
    .line 902
    .line 903
    move-result p1

    .line 904
    if-le p1, v4, :cond_24

    .line 905
    .line 906
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->l0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 907
    .line 908
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Ldefpackage/v23;

    .line 909
    .line 910
    const p1, 0x7f0a0058

    .line 911
    .line 912
    .line 913
    invoke-virtual {p0, p1, v7, v6}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 914
    .line 915
    .line 916
    goto :goto_e

    .line 917
    :cond_24
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 918
    .line 919
    .line 920
    move-result-object p1

    .line 921
    const v0, 0x7f130150

    .line 922
    .line 923
    .line 924
    invoke-virtual {p0, v0}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 925
    .line 926
    .line 927
    move-result-object p0

    .line 928
    invoke-static {p1, p0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 929
    .line 930
    .line 931
    move-result-object p0

    .line 932
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 933
    .line 934
    .line 935
    :goto_e
    return-void

    .line 936
    :pswitch_12
    check-cast p0, Ldefpackage/jo0;

    .line 937
    .line 938
    check-cast v7, Ldefpackage/f9;

    .line 939
    .line 940
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 941
    .line 942
    .line 943
    move-result-object p0

    .line 944
    new-instance p1, Ljava/lang/Thread;

    .line 945
    .line 946
    new-instance v0, Ldefpackage/lf;

    .line 947
    .line 948
    invoke-direct {v0, p0, v2}, Ldefpackage/lf;-><init>(Landroid/content/Context;I)V

    .line 949
    .line 950
    .line 951
    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 952
    .line 953
    .line 954
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 955
    .line 956
    .line 957
    invoke-virtual {v7}, Ldefpackage/dg;->dismiss()V

    .line 958
    .line 959
    .line 960
    return-void

    .line 961
    :pswitch_13
    check-cast p0, Lcat/ereza/customactivityoncrash/activity/DefaultErrorActivity;

    .line 962
    .line 963
    check-cast v7, Ldefpackage/oz;

    .line 964
    .line 965
    sget p1, Lcat/ereza/customactivityoncrash/activity/DefaultErrorActivity;->N:I

    .line 966
    .line 967
    invoke-static {p0, v7}, Ldefpackage/sg0;->d(Landroid/app/Activity;Ldefpackage/oz;)V

    .line 968
    .line 969
    .line 970
    return-void

    .line 971
    :pswitch_14
    check-cast p0, Ldefpackage/f50;

    .line 972
    .line 973
    check-cast v7, Ldefpackage/jx3;

    .line 974
    .line 975
    new-instance p1, Landroid/os/Bundle;

    .line 976
    .line 977
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 978
    .line 979
    .line 980
    iget-object v0, v7, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 981
    .line 982
    check-cast v0, Ljava/lang/String;

    .line 983
    .line 984
    const-string v1, "color_key"

    .line 985
    .line 986
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 987
    .line 988
    .line 989
    invoke-virtual {p0}, Ldefpackage/kc1;->q()Ldefpackage/ld1;

    .line 990
    .line 991
    .line 992
    move-result-object v0

    .line 993
    const-string v1, "dialog_result_key"

    .line 994
    .line 995
    invoke-virtual {v0, v1, p1}, Ldefpackage/ld1;->Z(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 996
    .line 997
    .line 998
    invoke-virtual {p0, v5, v5}, Ldefpackage/pp0;->i0(ZZ)V

    .line 999
    .line 1000
    .line 1001
    return-void

    .line 1002
    :pswitch_15
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;

    .line 1003
    .line 1004
    check-cast v7, Ljava/lang/String;

    .line 1005
    .line 1006
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 1007
    .line 1008
    const-string p1, "artist_page"

    .line 1009
    .line 1010
    invoke-static {p0, v7, p1}, Lcom/eddyizm/tempus/homemusic/b;->m(Lcom/eddyizm/tempus/ui/activity/MainActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 1011
    .line 1012
    .line 1013
    return-void

    .line 1014
    :pswitch_16
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;

    .line 1015
    .line 1016
    check-cast v7, Lcom/eddyizm/tempus/subsonic/models/ArtistInfo2;

    .line 1017
    .line 1018
    new-instance p1, Landroid/content/Intent;

    .line 1019
    .line 1020
    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual {v7}, Lcom/eddyizm/tempus/subsonic/models/ArtistInfoBase;->getLastFmUrl()Ljava/lang/String;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v0

    .line 1027
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v0

    .line 1031
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 1032
    .line 1033
    .line 1034
    invoke-virtual {p0, p1}, Ldefpackage/kc1;->g0(Landroid/content/Intent;)V

    .line 1035
    .line 1036
    .line 1037
    return-void

    .line 1038
    :pswitch_17
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;

    .line 1039
    .line 1040
    check-cast v7, Ljava/util/List;

    .line 1041
    .line 1042
    const p1, 0x7f13006c

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {p0, p1}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 1046
    .line 1047
    .line 1048
    move-result-object p1

    .line 1049
    const-string v0, "ALBUM_LIST_TITLE"

    .line 1050
    .line 1051
    invoke-static {v0, p1}, Ldefpackage/b11;->h(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 1052
    .line 1053
    .line 1054
    move-result-object p1

    .line 1055
    new-instance v0, Ljava/util/ArrayList;

    .line 1056
    .line 1057
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 1058
    .line 1059
    .line 1060
    move-result v1

    .line 1061
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 1062
    .line 1063
    .line 1064
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v1

    .line 1068
    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1069
    .line 1070
    .line 1071
    move-result v2

    .line 1072
    if-eqz v2, :cond_25

    .line 1073
    .line 1074
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v2

    .line 1078
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 1079
    .line 1080
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->strippedForNav()Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v2

    .line 1084
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1085
    .line 1086
    .line 1087
    goto :goto_f

    .line 1088
    :cond_25
    const-string v1, "ALBUMS_OBJECT"

    .line 1089
    .line 1090
    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {p0}, Ldefpackage/kc1;->a0()Landroid/view/View;

    .line 1094
    .line 1095
    .line 1096
    move-result-object p0

    .line 1097
    invoke-static {p0}, Ldefpackage/gb;->x(Landroid/view/View;)Ldefpackage/v23;

    .line 1098
    .line 1099
    .line 1100
    move-result-object p0

    .line 1101
    const v0, 0x7f0a009d

    .line 1102
    .line 1103
    .line 1104
    invoke-virtual {p0, v0, p1, v6}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 1105
    .line 1106
    .line 1107
    return-void

    .line 1108
    :pswitch_18
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;

    .line 1109
    .line 1110
    check-cast v7, Ljava/lang/String;

    .line 1111
    .line 1112
    invoke-virtual {p0}, Ldefpackage/kc1;->l()Ldefpackage/nc1;

    .line 1113
    .line 1114
    .line 1115
    move-result-object p1

    .line 1116
    check-cast p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 1117
    .line 1118
    invoke-virtual {p0}, Ldefpackage/zt;->h0()V

    .line 1119
    .line 1120
    .line 1121
    if-eqz p1, :cond_26

    .line 1122
    .line 1123
    const-string p0, "artist_menu"

    .line 1124
    .line 1125
    invoke-static {p1, v7, p0}, Lcom/eddyizm/tempus/homemusic/b;->m(Lcom/eddyizm/tempus/ui/activity/MainActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 1126
    .line 1127
    .line 1128
    :cond_26
    return-void

    .line 1129
    :pswitch_19
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;

    .line 1130
    .line 1131
    check-cast v7, Lcom/eddyizm/tempus/subsonic/models/AlbumInfo;

    .line 1132
    .line 1133
    new-instance p1, Landroid/content/Intent;

    .line 1134
    .line 1135
    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1136
    .line 1137
    .line 1138
    invoke-virtual {v7}, Lcom/eddyizm/tempus/subsonic/models/AlbumInfo;->getLastFmUrl()Ljava/lang/String;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v0

    .line 1142
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v0

    .line 1146
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 1147
    .line 1148
    .line 1149
    invoke-virtual {p0, p1}, Ldefpackage/kc1;->g0(Landroid/content/Intent;)V

    .line 1150
    .line 1151
    .line 1152
    return-void

    .line 1153
    :pswitch_1a
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;

    .line 1154
    .line 1155
    check-cast v7, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 1156
    .line 1157
    invoke-virtual {v7}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getYear()I

    .line 1158
    .line 1159
    .line 1160
    move-result p1

    .line 1161
    if-gtz p1, :cond_27

    .line 1162
    .line 1163
    goto :goto_10

    .line 1164
    :cond_27
    const-string v0, "year"

    .line 1165
    .line 1166
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1167
    .line 1168
    .line 1169
    move-result-object p1

    .line 1170
    invoke-static {v0, p1}, Ldefpackage/l93;->h(Ljava/lang/String;Ljava/lang/String;)Ldefpackage/ik;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v6

    .line 1174
    :goto_10
    if-eqz v6, :cond_28

    .line 1175
    .line 1176
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 1177
    .line 1178
    invoke-virtual {p0, v6, v4}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->F(Ldefpackage/ik;Z)V

    .line 1179
    .line 1180
    .line 1181
    :cond_28
    return-void

    .line 1182
    nop

    .line 1183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1a
        :pswitch_19
        :pswitch_18
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
