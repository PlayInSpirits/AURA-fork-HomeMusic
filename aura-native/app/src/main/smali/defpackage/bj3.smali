.class public final synthetic Ldefpackage/bj3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/bj3;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/bj3;->o:Ljava/lang/Object;

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
    .locals 11

    .line 1
    iget v0, p0, Ldefpackage/bj3;->n:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    const-string v2, "PodcastClient"

    .line 6
    .line 7
    const/4 v3, -0x1

    .line 8
    const/4 v4, 0x1

    .line 9
    const/4 v5, 0x0

    .line 10
    iget-object p0, p0, Ldefpackage/bj3;->o:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, Ldefpackage/he5;

    .line 16
    .line 17
    const-string p1, "MEDIA_BY_YEAR"

    .line 18
    .line 19
    invoke-static {p1, p1}, Ldefpackage/b11;->h(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v0, p0, Ldefpackage/he5;->v:Ldefpackage/uc4;

    .line 24
    .line 25
    iget-object v1, v0, Ldefpackage/uc4;->s:Ljava/util/List;

    .line 26
    .line 27
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    const-string v1, "year_object"

    .line 42
    .line 43
    invoke-virtual {p1, v1, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 44
    .line 45
    .line 46
    iget-object p0, v0, Ldefpackage/uc4;->r:Ldefpackage/cp1;

    .line 47
    .line 48
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onYearClick(Landroid/os/Bundle;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_0
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;

    .line 53
    .line 54
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;->p0:Ljava/util/ArrayList;

    .line 55
    .line 56
    new-instance v1, Landroid/widget/PopupMenu;

    .line 57
    .line 58
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-direct {v1, v2, p1}, Landroid/widget/PopupMenu;-><init>(Landroid/content/Context;Landroid/view/View;)V

    .line 63
    .line 64
    .line 65
    invoke-static {}, Ldefpackage/ud3;->k()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-nez p1, :cond_0

    .line 70
    .line 71
    move v2, v5

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    move v2, v3

    .line 74
    :goto_0
    invoke-virtual {v1}, Landroid/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    const v7, 0x7f1304c4

    .line 79
    .line 80
    .line 81
    invoke-interface {v6, v4, v5, v5, v7}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 82
    .line 83
    .line 84
    move v6, v5

    .line 85
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    if-ge v6, v7, :cond_4

    .line 90
    .line 91
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    check-cast v7, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;

    .line 96
    .line 97
    invoke-virtual {v7}, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;->getId()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    if-nez v8, :cond_1

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_1
    invoke-virtual {v7}, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;->getName()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    if-eqz v8, :cond_2

    .line 109
    .line 110
    invoke-virtual {v7}, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;->getName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    goto :goto_2

    .line 115
    :cond_2
    invoke-virtual {v7}, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;->getId()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    :goto_2
    invoke-virtual {v1}, Landroid/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    .line 120
    .line 121
    .line 122
    move-result-object v9

    .line 123
    add-int/lit8 v10, v6, 0x1

    .line 124
    .line 125
    invoke-interface {v9, v4, v10, v10, v8}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v7}, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;->getId()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    invoke-virtual {v7, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v7

    .line 136
    if-eqz v7, :cond_3

    .line 137
    .line 138
    move v2, v10

    .line 139
    :cond_3
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_4
    invoke-virtual {v1}, Landroid/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-interface {p1, v4, v4, v4}, Landroid/view/Menu;->setGroupCheckable(IZZ)V

    .line 147
    .line 148
    .line 149
    if-eq v2, v3, :cond_5

    .line 150
    .line 151
    invoke-virtual {v1}, Landroid/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    invoke-interface {p1, v2}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    invoke-interface {p1, v4}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 160
    .line 161
    .line 162
    :cond_5
    new-instance p1, Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 168
    .line 169
    .line 170
    move-result v2

    .line 171
    :goto_4
    if-ge v5, v2, :cond_6

    .line 172
    .line 173
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    add-int/lit8 v5, v5, 0x1

    .line 178
    .line 179
    check-cast v3, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;

    .line 180
    .line 181
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/MusicFolder;->getId()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v3

    .line 185
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_6
    new-instance v0, Ldefpackage/ev4;

    .line 190
    .line 191
    invoke-direct {v0, p0, p1}, Ldefpackage/ev4;-><init>(Lcom/eddyizm/tempus/ui/fragment/ToolbarFragment;Ljava/util/ArrayList;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, v0}, Landroid/widget/PopupMenu;->setOnMenuItemClickListener(Landroid/widget/PopupMenu$OnMenuItemClickListener;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1}, Landroid/widget/PopupMenu;->show()V

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :pswitch_1
    check-cast p0, Ldefpackage/xd4;

    .line 202
    .line 203
    new-instance p1, Landroid/os/Bundle;

    .line 204
    .line 205
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 206
    .line 207
    .line 208
    iget-object v0, p0, Ldefpackage/xd4;->v:Ldefpackage/s6;

    .line 209
    .line 210
    iget-object v1, v0, Ldefpackage/s6;->r:Ljava/util/List;

    .line 211
    .line 212
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 213
    .line 214
    .line 215
    move-result p0

    .line 216
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    check-cast p0, Landroid/os/Parcelable;

    .line 221
    .line 222
    const-string v1, "TRACK_OBJECT"

    .line 223
    .line 224
    invoke-virtual {p1, v1, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 225
    .line 226
    .line 227
    const-string p0, "MEDIA_MIX"

    .line 228
    .line 229
    invoke-virtual {p1, p0, v4}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 230
    .line 231
    .line 232
    iget-object p0, v0, Ldefpackage/s6;->t:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 233
    .line 234
    check-cast p0, Ldefpackage/cp1;

    .line 235
    .line 236
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onMediaClick(Landroid/os/Bundle;)V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    :pswitch_2
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/SettingsFragment;

    .line 241
    .line 242
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/SettingsFragment;->l0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 243
    .line 244
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Ldefpackage/v23;

    .line 245
    .line 246
    invoke-virtual {p0}, Ldefpackage/v23;->o()V

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :pswitch_3
    check-cast p0, Ldefpackage/la4;

    .line 251
    .line 252
    new-instance p1, Landroid/os/Bundle;

    .line 253
    .line 254
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 255
    .line 256
    .line 257
    iget-object v0, p0, Ldefpackage/la4;->v:Ldefpackage/zd0;

    .line 258
    .line 259
    iget-object v1, v0, Ldefpackage/zd0;->r:Ljava/util/List;

    .line 260
    .line 261
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 262
    .line 263
    .line 264
    move-result p0

    .line 265
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    check-cast p0, Landroid/os/Parcelable;

    .line 270
    .line 271
    const-string v1, "server_object"

    .line 272
    .line 273
    invoke-virtual {p1, v1, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 274
    .line 275
    .line 276
    iget-object p0, v0, Ldefpackage/zd0;->s:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;

    .line 279
    .line 280
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onServerClick(Landroid/os/Bundle;)V

    .line 281
    .line 282
    .line 283
    return-void

    .line 284
    :pswitch_4
    check-cast p0, Ldefpackage/sl3;

    .line 285
    .line 286
    iget-object p1, p0, Ldefpackage/sl3;->D0:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast p1, Ldefpackage/hd5;

    .line 289
    .line 290
    iget-object p1, p1, Ldefpackage/hd5;->p:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 293
    .line 294
    invoke-virtual {p1}, Ldefpackage/hg;->getText()Landroid/text/Editable;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object p1

    .line 305
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    iput-object p1, p0, Ldefpackage/sl3;->C0:Ljava/lang/String;

    .line 310
    .line 311
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 312
    .line 313
    .line 314
    move-result p1

    .line 315
    if-eqz p1, :cond_7

    .line 316
    .line 317
    iget-object p1, p0, Ldefpackage/sl3;->D0:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast p1, Ldefpackage/hd5;

    .line 320
    .line 321
    iget-object p1, p1, Ldefpackage/hd5;->p:Ljava/lang/Object;

    .line 322
    .line 323
    check-cast p1, Lcom/google/android/material/textfield/TextInputEditText;

    .line 324
    .line 325
    const v0, 0x7f130112

    .line 326
    .line 327
    .line 328
    invoke-virtual {p0, v0}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object p0

    .line 332
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setError(Ljava/lang/CharSequence;)V

    .line 333
    .line 334
    .line 335
    goto :goto_5

    .line 336
    :cond_7
    iget-object p1, p0, Ldefpackage/sl3;->E0:Ldefpackage/hd;

    .line 337
    .line 338
    check-cast p1, Ldefpackage/xm3;

    .line 339
    .line 340
    iget-object v0, p0, Ldefpackage/sl3;->C0:Ljava/lang/String;

    .line 341
    .line 342
    iget-object v1, p1, Ldefpackage/xm3;->e:Ldefpackage/k03;

    .line 343
    .line 344
    const/4 v3, 0x0

    .line 345
    invoke-virtual {v1, v3}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    iget-object v1, p1, Ldefpackage/xm3;->d:Ldefpackage/k03;

    .line 349
    .line 350
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 351
    .line 352
    invoke-virtual {v1, v3}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    iget-object v1, p1, Ldefpackage/xm3;->c:Ldefpackage/hh3;

    .line 356
    .line 357
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    invoke-static {v5}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 361
    .line 362
    .line 363
    move-result-object v1

    .line 364
    invoke-virtual {v1}, Ldefpackage/pn4;->h()Ldefpackage/wo0;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    const-string v3, "createPodcastChannel()"

    .line 372
    .line 373
    invoke-static {v2, v3}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 374
    .line 375
    .line 376
    iget-object v2, v1, Ldefpackage/wo0;->o:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast v2, Ldefpackage/hn3;

    .line 379
    .line 380
    iget-object v1, v1, Ldefpackage/wo0;->n:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v1, Ldefpackage/pn4;

    .line 383
    .line 384
    invoke-virtual {v1}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    invoke-interface {v2, v1, v0}, Ldefpackage/hn3;->d(Ljava/util/Map;Ljava/lang/String;)Lretrofit2/Call;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    new-instance v1, Ldefpackage/om1;

    .line 393
    .line 394
    const/16 v2, 0x13

    .line 395
    .line 396
    invoke-direct {v1, v2, p1}, Ldefpackage/om1;-><init>(ILjava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    invoke-interface {v0, v1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 400
    .line 401
    .line 402
    iget-object p1, p0, Ldefpackage/sl3;->F0:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast p1, Lcom/eddyizm/tempus/interfaces/PodcastCallback;

    .line 405
    .line 406
    invoke-interface {p1}, Lcom/eddyizm/tempus/interfaces/PodcastCallback;->onDismiss()V

    .line 407
    .line 408
    .line 409
    iget-object p0, p0, Ldefpackage/pp0;->w0:Landroid/app/Dialog;

    .line 410
    .line 411
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 415
    .line 416
    .line 417
    :goto_5
    return-void

    .line 418
    :pswitch_5
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;

    .line 419
    .line 420
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->h0(Landroid/view/View;)V

    .line 421
    .line 422
    .line 423
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 424
    .line 425
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Ldefpackage/v23;

    .line 426
    .line 427
    invoke-virtual {p0}, Ldefpackage/v23;->o()V

    .line 428
    .line 429
    .line 430
    return-void

    .line 431
    :pswitch_6
    check-cast p0, Ldefpackage/vm3;

    .line 432
    .line 433
    new-instance p1, Landroid/os/Bundle;

    .line 434
    .line 435
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 436
    .line 437
    .line 438
    iget-object v0, p0, Ldefpackage/vm3;->v:Ldefpackage/ej;

    .line 439
    .line 440
    iget-object v1, v0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 441
    .line 442
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 443
    .line 444
    .line 445
    move-result p0

    .line 446
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object p0

    .line 450
    check-cast p0, Landroid/os/Parcelable;

    .line 451
    .line 452
    const-string v1, "PODCAST_CHANNEL_OBJECT"

    .line 453
    .line 454
    invoke-virtual {p1, v1, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 455
    .line 456
    .line 457
    iget-object p0, v0, Ldefpackage/ej;->t:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 458
    .line 459
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelCatalogueFragment;

    .line 460
    .line 461
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onPodcastChannelClick(Landroid/os/Bundle;)V

    .line 462
    .line 463
    .line 464
    return-void

    .line 465
    :pswitch_7
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PodcastChannelBottomSheetDialog;

    .line 466
    .line 467
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PodcastChannelBottomSheetDialog;->B0:Ldefpackage/um3;

    .line 468
    .line 469
    iget-object v0, p1, Ldefpackage/um3;->d:Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;

    .line 470
    .line 471
    if-eqz v0, :cond_8

    .line 472
    .line 473
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;->getId()Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    if-eqz v0, :cond_8

    .line 478
    .line 479
    iget-object v0, p1, Ldefpackage/um3;->c:Ldefpackage/hh3;

    .line 480
    .line 481
    iget-object v1, p1, Ldefpackage/um3;->d:Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;

    .line 482
    .line 483
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/PodcastChannel;->getId()Ljava/lang/String;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    invoke-static {v5}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    invoke-virtual {v0}, Ldefpackage/pn4;->h()Ldefpackage/wo0;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    const-string v3, "deletePodcastChannel()"

    .line 502
    .line 503
    invoke-static {v2, v3}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 504
    .line 505
    .line 506
    iget-object v2, v0, Ldefpackage/wo0;->o:Ljava/lang/Object;

    .line 507
    .line 508
    check-cast v2, Ldefpackage/hn3;

    .line 509
    .line 510
    iget-object v0, v0, Ldefpackage/wo0;->n:Ljava/lang/Object;

    .line 511
    .line 512
    check-cast v0, Ldefpackage/pn4;

    .line 513
    .line 514
    invoke-virtual {v0}, Ldefpackage/pn4;->f()Ljava/util/HashMap;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    invoke-interface {v2, v0, v1}, Ldefpackage/hn3;->a(Ljava/util/Map;Ljava/lang/String;)Lretrofit2/Call;

    .line 519
    .line 520
    .line 521
    move-result-object v0

    .line 522
    new-instance v1, Ldefpackage/si1;

    .line 523
    .line 524
    const/16 v2, 0x10

    .line 525
    .line 526
    invoke-direct {v1, v2, p1}, Ldefpackage/si1;-><init>(ILjava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    invoke-interface {v0, v1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 530
    .line 531
    .line 532
    :cond_8
    invoke-virtual {p0}, Ldefpackage/zt;->h0()V

    .line 533
    .line 534
    .line 535
    return-void

    .line 536
    :pswitch_8
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;

    .line 537
    .line 538
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    const-string v1, "input_method"

    .line 543
    .line 544
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 549
    .line 550
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 551
    .line 552
    .line 553
    move-result-object p1

    .line 554
    invoke-virtual {v0, p1, v5}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 555
    .line 556
    .line 557
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 558
    .line 559
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Ldefpackage/v23;

    .line 560
    .line 561
    invoke-virtual {p0}, Ldefpackage/v23;->o()V

    .line 562
    .line 563
    .line 564
    return-void

    .line 565
    :pswitch_9
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;

    .line 566
    .line 567
    invoke-static {p0}, Ldefpackage/q05;->l(Ldefpackage/kc1;)Ldefpackage/v23;

    .line 568
    .line 569
    .line 570
    move-result-object p0

    .line 571
    invoke-virtual {p0}, Ldefpackage/v23;->o()V

    .line 572
    .line 573
    .line 574
    return-void

    .line 575
    :pswitch_a
    check-cast p0, Ldefpackage/ol3;

    .line 576
    .line 577
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 578
    .line 579
    .line 580
    move-result p1

    .line 581
    if-eq p1, v3, :cond_b

    .line 582
    .line 583
    iget-object p0, p0, Ldefpackage/ol3;->v:Ldefpackage/zd0;

    .line 584
    .line 585
    iget-object p0, p0, Ldefpackage/zd0;->s:Ljava/lang/Object;

    .line 586
    .line 587
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;

    .line 588
    .line 589
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->m0:Ldefpackage/wl3;

    .line 590
    .line 591
    iget-boolean v1, v0, Ldefpackage/wl3;->i:Z

    .line 592
    .line 593
    if-eqz v1, :cond_9

    .line 594
    .line 595
    goto :goto_6

    .line 596
    :cond_9
    iget-object v0, v0, Ldefpackage/wl3;->g:Ldefpackage/k03;

    .line 597
    .line 598
    invoke-virtual {v0}, Ldefpackage/ad2;->d()Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    check-cast v0, Ljava/util/List;

    .line 603
    .line 604
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 612
    .line 613
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->n0:Ldefpackage/zd0;

    .line 614
    .line 615
    iget-object v1, v1, Ldefpackage/dw3;->n:Ldefpackage/ew3;

    .line 616
    .line 617
    invoke-virtual {v1, p1, v4}, Ldefpackage/ew3;->f(II)V

    .line 618
    .line 619
    .line 620
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 621
    .line 622
    .line 623
    move-result-object v1

    .line 624
    check-cast v1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 625
    .line 626
    iget-object v2, v1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->R:Ldefpackage/qp4;

    .line 627
    .line 628
    if-nez v2, :cond_a

    .line 629
    .line 630
    goto :goto_6

    .line 631
    :cond_a
    new-array v3, v4, [Z

    .line 632
    .line 633
    aput-boolean v5, v3, v5

    .line 634
    .line 635
    iget-object v2, v2, Ldefpackage/qp4;->c:Ljava/lang/Object;

    .line 636
    .line 637
    check-cast v2, Landroid/widget/FrameLayout;

    .line 638
    .line 639
    sget-object v4, Ldefpackage/qg4;->E:[I

    .line 640
    .line 641
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 642
    .line 643
    .line 644
    move-result-object v4

    .line 645
    const v6, 0x7f130401

    .line 646
    .line 647
    .line 648
    invoke-virtual {v4, v6}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    .line 649
    .line 650
    .line 651
    move-result-object v4

    .line 652
    invoke-static {v2, v4, v5}, Ldefpackage/qg4;->h(Landroid/view/View;Ljava/lang/CharSequence;I)Ldefpackage/qg4;

    .line 653
    .line 654
    .line 655
    move-result-object v2

    .line 656
    invoke-virtual {v1}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->u()Landroid/widget/FrameLayout;

    .line 657
    .line 658
    .line 659
    move-result-object v1

    .line 660
    invoke-virtual {v2, v1}, Ldefpackage/fr;->e(Landroid/widget/FrameLayout;)V

    .line 661
    .line 662
    .line 663
    new-instance v1, Ldefpackage/ul3;

    .line 664
    .line 665
    invoke-direct {v1, p0, v3, p1, v0}, Ldefpackage/ul3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;[ZILcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 666
    .line 667
    .line 668
    const p1, 0x7f130544

    .line 669
    .line 670
    .line 671
    invoke-virtual {v2, p1, v1}, Ldefpackage/qg4;->i(ILandroid/view/View$OnClickListener;)V

    .line 672
    .line 673
    .line 674
    iput-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->p0:Ldefpackage/qg4;

    .line 675
    .line 676
    invoke-virtual {v2}, Ldefpackage/qg4;->j()V

    .line 677
    .line 678
    .line 679
    :cond_b
    :goto_6
    return-void

    .line 680
    :pswitch_b
    check-cast p0, Ldefpackage/nl3;

    .line 681
    .line 682
    new-instance p1, Landroid/os/Bundle;

    .line 683
    .line 684
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 685
    .line 686
    .line 687
    iget-object v0, p0, Ldefpackage/nl3;->v:Ldefpackage/zd0;

    .line 688
    .line 689
    iget-object v1, v0, Ldefpackage/zd0;->r:Ljava/util/List;

    .line 690
    .line 691
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 692
    .line 693
    .line 694
    move-result p0

    .line 695
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object p0

    .line 699
    check-cast p0, Landroid/os/Parcelable;

    .line 700
    .line 701
    const-string v1, "PLAYLIST_OBJECT"

    .line 702
    .line 703
    invoke-virtual {p1, v1, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 704
    .line 705
    .line 706
    iget-object p0, v0, Ldefpackage/zd0;->s:Ljava/lang/Object;

    .line 707
    .line 708
    check-cast p0, Ldefpackage/fl3;

    .line 709
    .line 710
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onPlaylistClick(Landroid/os/Bundle;)V

    .line 711
    .line 712
    .line 713
    return-void

    .line 714
    :pswitch_c
    check-cast p0, Ldefpackage/xk3;

    .line 715
    .line 716
    new-instance p1, Landroid/os/Bundle;

    .line 717
    .line 718
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 719
    .line 720
    .line 721
    new-instance v0, Ljava/util/ArrayList;

    .line 722
    .line 723
    iget-object v1, p0, Ldefpackage/xk3;->v:Ldefpackage/yk3;

    .line 724
    .line 725
    iget-object v2, v1, Ldefpackage/yk3;->s:Ljava/util/List;

    .line 726
    .line 727
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 728
    .line 729
    .line 730
    const-string v2, "TRACKS_OBJECT"

    .line 731
    .line 732
    invoke-virtual {p1, v2, v0}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 733
    .line 734
    .line 735
    const-string v0, "ITEM_POSITION"

    .line 736
    .line 737
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 738
    .line 739
    .line 740
    move-result p0

    .line 741
    invoke-virtual {p1, v0, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 742
    .line 743
    .line 744
    iget-object p0, v1, Ldefpackage/yk3;->q:Ldefpackage/wk3;

    .line 745
    .line 746
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onMediaClick(Landroid/os/Bundle;)V

    .line 747
    .line 748
    .line 749
    return-void

    .line 750
    :pswitch_d
    check-cast p0, Ldefpackage/qj3;

    .line 751
    .line 752
    invoke-virtual {p0}, Ldefpackage/qj3;->g()V

    .line 753
    .line 754
    .line 755
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 756
    .line 757
    .line 758
    move-result v0

    .line 759
    const v1, 0x7f0a021f

    .line 760
    .line 761
    .line 762
    if-ne v0, v1, :cond_c

    .line 763
    .line 764
    iget-object p0, p0, Ldefpackage/qj3;->r:Landroid/animation/ValueAnimator;

    .line 765
    .line 766
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    .line 767
    .line 768
    .line 769
    goto :goto_7

    .line 770
    :cond_c
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 771
    .line 772
    .line 773
    move-result p1

    .line 774
    const v0, 0x7f0a021e

    .line 775
    .line 776
    .line 777
    if-ne p1, v0, :cond_d

    .line 778
    .line 779
    iget-object p0, p0, Ldefpackage/qj3;->s:Landroid/animation/ValueAnimator;

    .line 780
    .line 781
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    .line 782
    .line 783
    .line 784
    :cond_d
    :goto_7
    return-void

    .line 785
    :pswitch_e
    check-cast p0, Ldefpackage/cj3;

    .line 786
    .line 787
    iget-object p0, p0, Ldefpackage/cj3;->t:Landroidx/media3/ui/PlayerControlView;

    .line 788
    .line 789
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 790
    .line 791
    if-eqz p1, :cond_e

    .line 792
    .line 793
    invoke-interface {p1, v1}, Ldefpackage/qi3;->S0(I)Z

    .line 794
    .line 795
    .line 796
    move-result p1

    .line 797
    if-eqz p1, :cond_e

    .line 798
    .line 799
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 800
    .line 801
    invoke-interface {p1}, Ldefpackage/qi3;->E0()Ldefpackage/cw4;

    .line 802
    .line 803
    .line 804
    move-result-object p1

    .line 805
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 806
    .line 807
    invoke-virtual {p1}, Ldefpackage/cw4;->a()Ldefpackage/bw4;

    .line 808
    .line 809
    .line 810
    move-result-object p1

    .line 811
    const/4 v1, 0x3

    .line 812
    invoke-virtual {p1, v1}, Ldefpackage/bw4;->d(I)Ldefpackage/bw4;

    .line 813
    .line 814
    .line 815
    move-result-object p1

    .line 816
    invoke-virtual {p1}, Ldefpackage/bw4;->g()Ldefpackage/bw4;

    .line 817
    .line 818
    .line 819
    move-result-object p1

    .line 820
    invoke-virtual {p1}, Ldefpackage/bw4;->i()Ldefpackage/bw4;

    .line 821
    .line 822
    .line 823
    move-result-object p1

    .line 824
    invoke-virtual {p1}, Ldefpackage/bw4;->k()Ldefpackage/bw4;

    .line 825
    .line 826
    .line 827
    move-result-object p1

    .line 828
    invoke-virtual {p1}, Ldefpackage/bw4;->b()Ldefpackage/cw4;

    .line 829
    .line 830
    .line 831
    move-result-object p1

    .line 832
    invoke-interface {v0, p1}, Ldefpackage/qi3;->M(Ldefpackage/cw4;)V

    .line 833
    .line 834
    .line 835
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->E:Landroid/widget/PopupWindow;

    .line 836
    .line 837
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 838
    .line 839
    .line 840
    :cond_e
    return-void

    .line 841
    :pswitch_f
    check-cast p0, Ldefpackage/ij3;

    .line 842
    .line 843
    iget-object p1, p0, Ldefpackage/ij3;->x:Landroidx/media3/ui/PlayerControlView;

    .line 844
    .line 845
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 846
    .line 847
    .line 848
    move-result p0

    .line 849
    iget-object v0, p1, Landroidx/media3/ui/PlayerControlView;->T:Landroid/view/View;

    .line 850
    .line 851
    if-nez p0, :cond_f

    .line 852
    .line 853
    iget-object p0, p1, Landroidx/media3/ui/PlayerControlView;->A:Ldefpackage/gj3;

    .line 854
    .line 855
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 856
    .line 857
    .line 858
    invoke-virtual {p1, p0, v0}, Landroidx/media3/ui/PlayerControlView;->d(Ldefpackage/dw3;Landroid/view/View;)V

    .line 859
    .line 860
    .line 861
    goto :goto_8

    .line 862
    :cond_f
    if-ne p0, v4, :cond_10

    .line 863
    .line 864
    iget-object p0, p1, Landroidx/media3/ui/PlayerControlView;->C:Ldefpackage/cj3;

    .line 865
    .line 866
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 867
    .line 868
    .line 869
    invoke-virtual {p1, p0, v0}, Landroidx/media3/ui/PlayerControlView;->d(Ldefpackage/dw3;Landroid/view/View;)V

    .line 870
    .line 871
    .line 872
    goto :goto_8

    .line 873
    :cond_10
    iget-object p0, p1, Landroidx/media3/ui/PlayerControlView;->E:Landroid/widget/PopupWindow;

    .line 874
    .line 875
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 876
    .line 877
    .line 878
    :goto_8
    return-void

    .line 879
    :pswitch_10
    check-cast p0, Ldefpackage/cj3;

    .line 880
    .line 881
    iget-object p0, p0, Ldefpackage/cj3;->t:Landroidx/media3/ui/PlayerControlView;

    .line 882
    .line 883
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 884
    .line 885
    if-eqz p1, :cond_12

    .line 886
    .line 887
    invoke-interface {p1, v1}, Ldefpackage/qi3;->S0(I)Z

    .line 888
    .line 889
    .line 890
    move-result p1

    .line 891
    if-nez p1, :cond_11

    .line 892
    .line 893
    goto :goto_9

    .line 894
    :cond_11
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 895
    .line 896
    invoke-interface {p1}, Ldefpackage/qi3;->E0()Ldefpackage/cw4;

    .line 897
    .line 898
    .line 899
    move-result-object p1

    .line 900
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->D0:Ldefpackage/qi3;

    .line 901
    .line 902
    sget-object v1, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 903
    .line 904
    invoke-virtual {p1}, Ldefpackage/cw4;->a()Ldefpackage/bw4;

    .line 905
    .line 906
    .line 907
    move-result-object p1

    .line 908
    invoke-virtual {p1, v4}, Ldefpackage/bw4;->d(I)Ldefpackage/bw4;

    .line 909
    .line 910
    .line 911
    move-result-object p1

    .line 912
    invoke-virtual {p1, v4, v5}, Ldefpackage/bw4;->l(IZ)Ldefpackage/bw4;

    .line 913
    .line 914
    .line 915
    move-result-object p1

    .line 916
    invoke-virtual {p1}, Ldefpackage/bw4;->b()Ldefpackage/cw4;

    .line 917
    .line 918
    .line 919
    move-result-object p1

    .line 920
    invoke-interface {v0, p1}, Ldefpackage/qi3;->M(Ldefpackage/cw4;)V

    .line 921
    .line 922
    .line 923
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView;->z:Ldefpackage/jj3;

    .line 924
    .line 925
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    const v1, 0x7f130141

    .line 930
    .line 931
    .line 932
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 933
    .line 934
    .line 935
    move-result-object v0

    .line 936
    iget-object p1, p1, Ldefpackage/jj3;->r:[Ljava/lang/String;

    .line 937
    .line 938
    aput-object v0, p1, v4

    .line 939
    .line 940
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->E:Landroid/widget/PopupWindow;

    .line 941
    .line 942
    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 943
    .line 944
    .line 945
    :cond_12
    :goto_9
    return-void

    .line 946
    nop

    .line 947
    :pswitch_data_0
    .packed-switch 0x0
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
