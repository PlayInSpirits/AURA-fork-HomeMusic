.class public final synthetic Ldefpackage/p6;
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
    iput p1, p0, Ldefpackage/p6;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/p6;->o:Ljava/lang/Object;

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
    .locals 9

    .line 1
    iget v0, p0, Ldefpackage/p6;->n:I

    .line 2
    .line 3
    const-string v1, "MEDIA_MIX"

    .line 4
    .line 5
    const-string v2, "GENRE_OBJECT"

    .line 6
    .line 7
    const-string v3, "MEDIA_BY_GENRE"

    .line 8
    .line 9
    const-string v4, "ALBUM_OBJECT"

    .line 10
    .line 11
    const-string v5, "ARTIST_OBJECT"

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    const/4 v8, 0x1

    .line 16
    iget-object p0, p0, Ldefpackage/p6;->o:Ljava/lang/Object;

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    check-cast p0, Landroidx/media3/ui/PlayerControlView;

    .line 22
    .line 23
    iget-object p1, p0, Landroidx/media3/ui/PlayerControlView;->C0:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->A0:Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    iget-object v1, p0, Landroidx/media3/ui/PlayerControlView;->B0:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v2, p0, Landroidx/media3/ui/PlayerControlView;->z0:Landroid/graphics/drawable/Drawable;

    .line 30
    .line 31
    iget-boolean v3, p0, Landroidx/media3/ui/PlayerControlView;->E0:Z

    .line 32
    .line 33
    xor-int/lit8 v4, v3, 0x1

    .line 34
    .line 35
    if-ne v3, v4, :cond_0

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    iput-boolean v4, p0, Landroidx/media3/ui/PlayerControlView;->E0:Z

    .line 39
    .line 40
    iget-object v4, p0, Landroidx/media3/ui/PlayerControlView;->R:Landroid/widget/ImageView;

    .line 41
    .line 42
    if-nez v4, :cond_1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    if-nez v3, :cond_2

    .line 46
    .line 47
    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    invoke-virtual {v4, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->S:Landroid/widget/ImageView;

    .line 61
    .line 62
    if-nez p0, :cond_3

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    if-nez v3, :cond_4

    .line 66
    .line 67
    invoke-virtual {p0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_4
    invoke-virtual {p0, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 78
    .line 79
    .line 80
    :goto_1
    return-void

    .line 81
    :pswitch_0
    check-cast p0, Ldefpackage/ee3;

    .line 82
    .line 83
    iget-object p1, p0, Ldefpackage/ee3;->f:Landroid/widget/EditText;

    .line 84
    .line 85
    if-nez p1, :cond_5

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    invoke-virtual {p1}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    iget-object v0, p0, Ldefpackage/ee3;->f:Landroid/widget/EditText;

    .line 93
    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    invoke-virtual {v0}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    instance-of v0, v0, Landroid/text/method/PasswordTransformationMethod;

    .line 101
    .line 102
    if-eqz v0, :cond_6

    .line 103
    .line 104
    move v7, v8

    .line 105
    :cond_6
    iget-object v0, p0, Ldefpackage/ee3;->f:Landroid/widget/EditText;

    .line 106
    .line 107
    if-eqz v7, :cond_7

    .line 108
    .line 109
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_7
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 118
    .line 119
    .line 120
    :goto_2
    if-ltz p1, :cond_8

    .line 121
    .line 122
    iget-object v0, p0, Ldefpackage/ee3;->f:Landroid/widget/EditText;

    .line 123
    .line 124
    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setSelection(I)V

    .line 125
    .line 126
    .line 127
    :cond_8
    invoke-virtual {p0}, Ldefpackage/h11;->p()V

    .line 128
    .line 129
    .line 130
    :goto_3
    return-void

    .line 131
    :pswitch_1
    check-cast p0, Ldefpackage/ep2;

    .line 132
    .line 133
    invoke-virtual {p0}, Ldefpackage/ep2;->dismiss()V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :pswitch_2
    check-cast p0, Ldefpackage/xh2;

    .line 138
    .line 139
    iget-object p1, p0, Ldefpackage/xh2;->W0:Landroid/widget/Button;

    .line 140
    .line 141
    invoke-virtual {p0}, Ldefpackage/xh2;->n0()Ldefpackage/ze4;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    iget-object v0, v0, Ldefpackage/ze4;->n:Ljava/lang/Long;

    .line 146
    .line 147
    if-eqz v0, :cond_9

    .line 148
    .line 149
    move v0, v8

    .line 150
    goto :goto_4

    .line 151
    :cond_9
    move v0, v7

    .line 152
    :goto_4
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 153
    .line 154
    .line 155
    iget-object p1, p0, Ldefpackage/xh2;->U0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 156
    .line 157
    invoke-virtual {p1}, Lcom/google/android/material/internal/CheckableImageButton;->toggle()V

    .line 158
    .line 159
    .line 160
    iget p1, p0, Ldefpackage/xh2;->N0:I

    .line 161
    .line 162
    if-ne p1, v8, :cond_a

    .line 163
    .line 164
    goto :goto_5

    .line 165
    :cond_a
    move v7, v8

    .line 166
    :goto_5
    iput v7, p0, Ldefpackage/xh2;->N0:I

    .line 167
    .line 168
    iget-object p1, p0, Ldefpackage/xh2;->U0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 169
    .line 170
    if-ne v7, v8, :cond_b

    .line 171
    .line 172
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    const v0, 0x7f1303a4

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    goto :goto_6

    .line 184
    :cond_b
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    const v0, 0x7f1303a6

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    :goto_6
    iget-object v0, p0, Ldefpackage/xh2;->U0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 196
    .line 197
    invoke-virtual {v0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {p0}, Ldefpackage/xh2;->r0()V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :pswitch_3
    check-cast p0, Ldefpackage/fa;

    .line 205
    .line 206
    invoke-virtual {p0}, Ldefpackage/fa;->invoke()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    :pswitch_4
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;

    .line 211
    .line 212
    new-instance p1, Landroid/content/Intent;

    .line 213
    .line 214
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    const-class v1, Lcom/eddyizm/tempus/ui/login/LoginActivity;

    .line 219
    .line 220
    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 221
    .line 222
    .line 223
    const-string v0, "HIDE_TAB_LAYOUT"

    .line 224
    .line 225
    invoke-virtual {p1, v0, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 226
    .line 227
    .line 228
    const-string v0, "HIDE_TOPAPPBAR_LAYOUT"

    .line 229
    .line 230
    invoke-virtual {p1, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 231
    .line 232
    .line 233
    const-string v0, "SELECT_FRAGMENT"

    .line 234
    .line 235
    const/4 v1, 0x3

    .line 236
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 237
    .line 238
    .line 239
    invoke-virtual {p0, p1}, Ldefpackage/kc1;->g0(Landroid/content/Intent;)V

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :pswitch_5
    check-cast p0, Lcom/eddyizm/tempus/ui/login/LoginActivity;

    .line 244
    .line 245
    sget p1, Lcom/eddyizm/tempus/ui/login/LoginActivity;->R:I

    .line 246
    .line 247
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :pswitch_6
    check-cast p0, Lcom/eddyizm/tempus/lan/LanPlaybackActivity;

    .line 252
    .line 253
    sget p1, Lcom/eddyizm/tempus/lan/LanPlaybackActivity;->N:I

    .line 254
    .line 255
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :pswitch_7
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;

    .line 260
    .line 261
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/IndexFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 262
    .line 263
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Ldefpackage/v23;

    .line 264
    .line 265
    invoke-virtual {p0}, Ldefpackage/v23;->o()V

    .line 266
    .line 267
    .line 268
    return-void

    .line 269
    :pswitch_8
    check-cast p0, Lcom/eddyizm/tempus/homemusic/HubShareActivity;

    .line 270
    .line 271
    sget-object p1, Lcom/eddyizm/tempus/homemusic/HubShareActivity;->P:Ldefpackage/ux3;

    .line 272
    .line 273
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 274
    .line 275
    .line 276
    return-void

    .line 277
    :pswitch_9
    check-cast p0, Ldefpackage/hp1;

    .line 278
    .line 279
    new-instance p1, Ldefpackage/eu3;

    .line 280
    .line 281
    invoke-direct {p1, p0}, Ldefpackage/eu3;-><init>(Lcom/eddyizm/tempus/interfaces/RadioCallback;)V

    .line 282
    .line 283
    .line 284
    iget-object p0, p0, Ldefpackage/hp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

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
    :pswitch_a
    check-cast p0, Ldefpackage/rm3;

    .line 295
    .line 296
    invoke-virtual {p0}, Ldefpackage/rm3;->z()V

    .line 297
    .line 298
    .line 299
    return-void

    .line 300
    :pswitch_b
    check-cast p0, Ldefpackage/l92;

    .line 301
    .line 302
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 310
    .line 311
    .line 312
    move-result-object p1

    .line 313
    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 314
    .line 315
    .line 316
    move-result-object p1

    .line 317
    const-string v0, "music_directory_section_visibility"

    .line 318
    .line 319
    invoke-interface {p1, v0, v8}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 324
    .line 325
    .line 326
    invoke-virtual {p0}, Ldefpackage/l92;->run()V

    .line 327
    .line 328
    .line 329
    return-void

    .line 330
    :pswitch_c
    check-cast p0, Ldefpackage/eh1;

    .line 331
    .line 332
    invoke-static {v3, v3}, Ldefpackage/b11;->h(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    iget-object v0, p0, Ldefpackage/eh1;->v:Ldefpackage/ej;

    .line 337
    .line 338
    iget-object v1, v0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 339
    .line 340
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 341
    .line 342
    .line 343
    move-result p0

    .line 344
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object p0

    .line 348
    check-cast p0, Landroid/os/Parcelable;

    .line 349
    .line 350
    invoke-virtual {p1, v2, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 351
    .line 352
    .line 353
    iget-object p0, v0, Ldefpackage/ej;->t:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 354
    .line 355
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;

    .line 356
    .line 357
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onGenreClick(Landroid/os/Bundle;)V

    .line 358
    .line 359
    .line 360
    return-void

    .line 361
    :pswitch_d
    check-cast p0, Ldefpackage/dh1;

    .line 362
    .line 363
    invoke-static {v3, v3}, Ldefpackage/b11;->h(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 364
    .line 365
    .line 366
    move-result-object p1

    .line 367
    iget-object v0, p0, Ldefpackage/dh1;->v:Ldefpackage/zd0;

    .line 368
    .line 369
    iget-object v1, v0, Ldefpackage/zd0;->r:Ljava/util/List;

    .line 370
    .line 371
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 372
    .line 373
    .line 374
    move-result p0

    .line 375
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object p0

    .line 379
    check-cast p0, Landroid/os/Parcelable;

    .line 380
    .line 381
    invoke-virtual {p1, v2, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 382
    .line 383
    .line 384
    iget-object p0, v0, Ldefpackage/zd0;->s:Ljava/lang/Object;

    .line 385
    .line 386
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;

    .line 387
    .line 388
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onGenreClick(Landroid/os/Bundle;)V

    .line 389
    .line 390
    .line 391
    return-void

    .line 392
    :pswitch_e
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;

    .line 393
    .line 394
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/FilterFragment;->l0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 395
    .line 396
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Ldefpackage/v23;

    .line 397
    .line 398
    invoke-virtual {p0}, Ldefpackage/v23;->o()V

    .line 399
    .line 400
    .line 401
    return-void

    .line 402
    :pswitch_f
    check-cast p0, Ldefpackage/ix0;

    .line 403
    .line 404
    invoke-virtual {p0}, Ldefpackage/ix0;->t()V

    .line 405
    .line 406
    .line 407
    return-void

    .line 408
    :pswitch_10
    check-cast p0, Ldefpackage/uq0;

    .line 409
    .line 410
    new-instance p1, Landroid/os/Bundle;

    .line 411
    .line 412
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 413
    .line 414
    .line 415
    iget-object v0, p0, Ldefpackage/uq0;->v:Ldefpackage/vq0;

    .line 416
    .line 417
    iget-object v2, v0, Ldefpackage/vq0;->r:Ljava/util/List;

    .line 418
    .line 419
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 420
    .line 421
    .line 422
    move-result p0

    .line 423
    invoke-interface {v2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object p0

    .line 427
    check-cast p0, Landroid/os/Parcelable;

    .line 428
    .line 429
    const-string v2, "TRACK_OBJECT"

    .line 430
    .line 431
    invoke-virtual {p1, v2, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {p1, v1, v8}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 435
    .line 436
    .line 437
    iget-object p0, v0, Ldefpackage/vq0;->q:Ldefpackage/cp1;

    .line 438
    .line 439
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onMediaClick(Landroid/os/Bundle;)V

    .line 440
    .line 441
    .line 442
    return-void

    .line 443
    :pswitch_11
    check-cast p0, Ldefpackage/yd0;

    .line 444
    .line 445
    iget-object p1, p0, Ldefpackage/yd0;->v:Ldefpackage/zd0;

    .line 446
    .line 447
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 448
    .line 449
    .line 450
    move-result v0

    .line 451
    if-ltz v0, :cond_f

    .line 452
    .line 453
    iget-object v1, p1, Ldefpackage/zd0;->r:Ljava/util/List;

    .line 454
    .line 455
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 456
    .line 457
    .line 458
    move-result v1

    .line 459
    if-lt v0, v1, :cond_c

    .line 460
    .line 461
    goto :goto_7

    .line 462
    :cond_c
    iget-object v1, p1, Ldefpackage/zd0;->r:Ljava/util/List;

    .line 463
    .line 464
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    check-cast v0, Ldefpackage/sp3;

    .line 469
    .line 470
    iget-object p1, p1, Ldefpackage/zd0;->s:Ljava/lang/Object;

    .line 471
    .line 472
    check-cast p1, Ldefpackage/bl2;

    .line 473
    .line 474
    if-nez p1, :cond_d

    .line 475
    .line 476
    goto :goto_7

    .line 477
    :cond_d
    iget-object p1, v0, Ldefpackage/sp3;->f:Ljava/lang/String;

    .line 478
    .line 479
    if-nez p1, :cond_e

    .line 480
    .line 481
    invoke-virtual {p0, v0}, Ldefpackage/yd0;->s(Ldefpackage/sp3;)V

    .line 482
    .line 483
    .line 484
    goto :goto_7

    .line 485
    :cond_e
    new-instance v1, Ldefpackage/xd0;

    .line 486
    .line 487
    invoke-direct {v1, v7, p0, v0}, Ldefpackage/xd0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    invoke-static {v7}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 491
    .line 492
    .line 493
    move-result-object p0

    .line 494
    invoke-virtual {p0}, Ldefpackage/pn4;->c()Ldefpackage/gp3;

    .line 495
    .line 496
    .line 497
    move-result-object p0

    .line 498
    invoke-virtual {p0, p1}, Ldefpackage/gp3;->e(Ljava/lang/String;)Lretrofit2/Call;

    .line 499
    .line 500
    .line 501
    move-result-object p0

    .line 502
    new-instance v0, Ldefpackage/gp3;

    .line 503
    .line 504
    invoke-direct {v0, v8, v1, p1}, Ldefpackage/gp3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 505
    .line 506
    .line 507
    invoke-interface {p0, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 508
    .line 509
    .line 510
    :cond_f
    :goto_7
    return-void

    .line 511
    :pswitch_12
    check-cast p0, Ldefpackage/ca0;

    .line 512
    .line 513
    const-string p1, "data_saving_mode"

    .line 514
    .line 515
    invoke-static {p1, v8}, Ldefpackage/xa3;->t(Ljava/lang/String;Z)V

    .line 516
    .line 517
    .line 518
    iget-object p0, p0, Ldefpackage/pp0;->w0:Landroid/app/Dialog;

    .line 519
    .line 520
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 524
    .line 525
    .line 526
    return-void

    .line 527
    :pswitch_13
    check-cast p0, Ldefpackage/f50;

    .line 528
    .line 529
    invoke-virtual {p0, v7, v7}, Ldefpackage/pp0;->i0(ZZ)V

    .line 530
    .line 531
    .line 532
    return-void

    .line 533
    :pswitch_14
    check-cast p0, Lcom/eddyizm/tempus/util/ClickablePreferenceCategory;

    .line 534
    .line 535
    iget-object p1, p0, Lcom/eddyizm/tempus/util/ClickablePreferenceCategory;->j0:Ldefpackage/ss1;

    .line 536
    .line 537
    if-eqz p1, :cond_12

    .line 538
    .line 539
    iget-object p1, p1, Ldefpackage/ss1;->o:Ldefpackage/vb4;

    .line 540
    .line 541
    iget-object v0, p1, Ldefpackage/vb4;->A0:Ljava/util/HashSet;

    .line 542
    .line 543
    iget-object p0, p0, Landroidx/preference/Preference;->y:Ljava/lang/String;

    .line 544
    .line 545
    const-string v1, "lan_playback"

    .line 546
    .line 547
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 548
    .line 549
    .line 550
    move-result v1

    .line 551
    if-eqz v1, :cond_10

    .line 552
    .line 553
    new-instance p0, Landroid/content/Intent;

    .line 554
    .line 555
    invoke-virtual {p1}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    const-class v1, Lcom/eddyizm/tempus/lan/LanPlaybackActivity;

    .line 560
    .line 561
    invoke-direct {p0, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {p1, p0}, Ldefpackage/kc1;->g0(Landroid/content/Intent;)V

    .line 565
    .line 566
    .line 567
    goto :goto_9

    .line 568
    :cond_10
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 569
    .line 570
    .line 571
    move-result v1

    .line 572
    if-eqz v1, :cond_11

    .line 573
    .line 574
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 575
    .line 576
    .line 577
    goto :goto_8

    .line 578
    :cond_11
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 579
    .line 580
    .line 581
    :goto_8
    invoke-virtual {p1}, Ldefpackage/vb4;->l0()V

    .line 582
    .line 583
    .line 584
    :cond_12
    :goto_9
    return-void

    .line 585
    :pswitch_15
    check-cast p0, Ldefpackage/s30;

    .line 586
    .line 587
    iget-object p1, p0, Ldefpackage/s30;->i:Landroid/widget/EditText;

    .line 588
    .line 589
    if-nez p1, :cond_13

    .line 590
    .line 591
    goto :goto_a

    .line 592
    :cond_13
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 593
    .line 594
    .line 595
    move-result-object p1

    .line 596
    if-eqz p1, :cond_14

    .line 597
    .line 598
    invoke-interface {p1}, Landroid/text/Editable;->clear()V

    .line 599
    .line 600
    .line 601
    :cond_14
    invoke-virtual {p0}, Ldefpackage/h11;->p()V

    .line 602
    .line 603
    .line 604
    :goto_a
    return-void

    .line 605
    :pswitch_16
    check-cast p0, Ldefpackage/dj;

    .line 606
    .line 607
    new-instance p1, Landroid/os/Bundle;

    .line 608
    .line 609
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 610
    .line 611
    .line 612
    iget-object v0, p0, Ldefpackage/dj;->v:Ldefpackage/ej;

    .line 613
    .line 614
    iget-object v1, v0, Ldefpackage/ej;->r:Ljava/util/List;

    .line 615
    .line 616
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 617
    .line 618
    .line 619
    move-result p0

    .line 620
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    move-result-object p0

    .line 624
    check-cast p0, Landroid/os/Parcelable;

    .line 625
    .line 626
    invoke-virtual {p1, v5, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 627
    .line 628
    .line 629
    iget-object p0, v0, Ldefpackage/ej;->t:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 630
    .line 631
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;

    .line 632
    .line 633
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onArtistClick(Landroid/os/Bundle;)V

    .line 634
    .line 635
    .line 636
    return-void

    .line 637
    :pswitch_17
    check-cast p0, Ldefpackage/cj;

    .line 638
    .line 639
    new-instance p1, Landroid/os/Bundle;

    .line 640
    .line 641
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 642
    .line 643
    .line 644
    iget-object v0, p0, Ldefpackage/cj;->v:Ldefpackage/s6;

    .line 645
    .line 646
    iget-object v1, v0, Ldefpackage/s6;->r:Ljava/util/List;

    .line 647
    .line 648
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 649
    .line 650
    .line 651
    move-result p0

    .line 652
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object p0

    .line 656
    check-cast p0, Landroid/os/Parcelable;

    .line 657
    .line 658
    invoke-virtual {p1, v5, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 659
    .line 660
    .line 661
    iget-object p0, v0, Ldefpackage/s6;->t:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 662
    .line 663
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;

    .line 664
    .line 665
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onArtistClick(Landroid/os/Bundle;)V

    .line 666
    .line 667
    .line 668
    return-void

    .line 669
    :pswitch_18
    check-cast p0, Ldefpackage/ui;

    .line 670
    .line 671
    new-instance p1, Landroid/os/Bundle;

    .line 672
    .line 673
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 674
    .line 675
    .line 676
    iget-object v0, p0, Ldefpackage/ui;->v:Ldefpackage/vi;

    .line 677
    .line 678
    iget-object v2, v0, Ldefpackage/vi;->u:Ljava/util/List;

    .line 679
    .line 680
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 681
    .line 682
    .line 683
    move-result p0

    .line 684
    invoke-interface {v2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object p0

    .line 688
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 689
    .line 690
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->strippedForNav()Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 691
    .line 692
    .line 693
    move-result-object p0

    .line 694
    invoke-virtual {p1, v5, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 695
    .line 696
    .line 697
    iget-boolean p0, v0, Ldefpackage/vi;->r:Z

    .line 698
    .line 699
    invoke-virtual {p1, v1, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 700
    .line 701
    .line 702
    const-string p0, "MEDIA_BEST_OF"

    .line 703
    .line 704
    iget-boolean v1, v0, Ldefpackage/vi;->s:Z

    .line 705
    .line 706
    invoke-virtual {p1, p0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 707
    .line 708
    .line 709
    iget-object p0, v0, Ldefpackage/vi;->q:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 710
    .line 711
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onArtistClick(Landroid/os/Bundle;)V

    .line 712
    .line 713
    .line 714
    return-void

    .line 715
    :pswitch_19
    check-cast p0, Ldefpackage/u8;

    .line 716
    .line 717
    new-instance v0, Landroid/os/Bundle;

    .line 718
    .line 719
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 720
    .line 721
    .line 722
    iget-object v1, p0, Ldefpackage/u8;->u:Ldefpackage/ss0;

    .line 723
    .line 724
    iget-object v2, v1, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 725
    .line 726
    check-cast v2, Landroid/widget/TextView;

    .line 727
    .line 728
    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 729
    .line 730
    .line 731
    move-result-object v2

    .line 732
    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 733
    .line 734
    .line 735
    move-result-object v2

    .line 736
    const-string v3, "ALBUM_LIST_TITLE"

    .line 737
    .line 738
    invoke-virtual {v0, v3, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 739
    .line 740
    .line 741
    iget-object v1, v1, Ldefpackage/ss0;->p:Ljava/lang/Object;

    .line 742
    .line 743
    check-cast v1, Landroid/widget/TextView;

    .line 744
    .line 745
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v1

    .line 749
    check-cast v1, Ljava/lang/String;

    .line 750
    .line 751
    iget-object p0, p0, Ldefpackage/u8;->v:Ldefpackage/v8;

    .line 752
    .line 753
    iget-object p0, p0, Ldefpackage/v8;->s:Ljava/util/Map;

    .line 754
    .line 755
    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 756
    .line 757
    invoke-interface {p0, v1, v2}, Ljava/util/Map;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object p0

    .line 761
    check-cast p0, Ljava/util/List;

    .line 762
    .line 763
    new-instance v1, Ljava/util/ArrayList;

    .line 764
    .line 765
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 766
    .line 767
    .line 768
    const-string p0, "ALBUMS_OBJECT"

    .line 769
    .line 770
    invoke-virtual {v0, p0, v1}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 771
    .line 772
    .line 773
    invoke-static {p1}, Ldefpackage/gb;->x(Landroid/view/View;)Ldefpackage/v23;

    .line 774
    .line 775
    .line 776
    move-result-object p0

    .line 777
    const p1, 0x7f0a009d

    .line 778
    .line 779
    .line 780
    invoke-virtual {p0, p1, v0, v6}, Ldefpackage/v23;->m(ILandroid/os/Bundle;Ldefpackage/y23;)V

    .line 781
    .line 782
    .line 783
    return-void

    .line 784
    :pswitch_1a
    check-cast p0, Ldefpackage/p7;

    .line 785
    .line 786
    new-instance p1, Landroid/os/Bundle;

    .line 787
    .line 788
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 789
    .line 790
    .line 791
    iget-object v0, p0, Ldefpackage/p7;->v:Ldefpackage/q7;

    .line 792
    .line 793
    iget-object v1, v0, Ldefpackage/q7;->s:Ljava/util/List;

    .line 794
    .line 795
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 796
    .line 797
    .line 798
    move-result p0

    .line 799
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object p0

    .line 803
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 804
    .line 805
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->strippedForNav()Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 806
    .line 807
    .line 808
    move-result-object p0

    .line 809
    invoke-virtual {p1, v4, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 810
    .line 811
    .line 812
    iget-object p0, v0, Ldefpackage/q7;->u:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 813
    .line 814
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;

    .line 815
    .line 816
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onAlbumClick(Landroid/os/Bundle;)V

    .line 817
    .line 818
    .line 819
    return-void

    .line 820
    :pswitch_1b
    check-cast p0, Ldefpackage/k7;

    .line 821
    .line 822
    new-instance p1, Landroid/os/Bundle;

    .line 823
    .line 824
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 825
    .line 826
    .line 827
    iget-object v0, p0, Ldefpackage/k7;->v:Ldefpackage/l7;

    .line 828
    .line 829
    iget-object v1, v0, Ldefpackage/l7;->r:Ljava/util/List;

    .line 830
    .line 831
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 832
    .line 833
    .line 834
    move-result p0

    .line 835
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object p0

    .line 839
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 840
    .line 841
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->strippedForNav()Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 842
    .line 843
    .line 844
    move-result-object p0

    .line 845
    invoke-virtual {p1, v4, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 846
    .line 847
    .line 848
    iget-object p0, v0, Ldefpackage/l7;->q:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 849
    .line 850
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onAlbumClick(Landroid/os/Bundle;)V

    .line 851
    .line 852
    .line 853
    return-void

    .line 854
    :pswitch_1c
    check-cast p0, Ldefpackage/r6;

    .line 855
    .line 856
    new-instance p1, Landroid/os/Bundle;

    .line 857
    .line 858
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 859
    .line 860
    .line 861
    iget-object v0, p0, Ldefpackage/r6;->v:Ldefpackage/s6;

    .line 862
    .line 863
    iget-object v1, v0, Ldefpackage/s6;->r:Ljava/util/List;

    .line 864
    .line 865
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 866
    .line 867
    .line 868
    move-result p0

    .line 869
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object p0

    .line 873
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 874
    .line 875
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->strippedForNav()Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 876
    .line 877
    .line 878
    move-result-object p0

    .line 879
    invoke-virtual {p1, v4, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 880
    .line 881
    .line 882
    iget-object p0, v0, Ldefpackage/s6;->t:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 883
    .line 884
    invoke-interface {p0, p1}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onAlbumClick(Landroid/os/Bundle;)V

    .line 885
    .line 886
    .line 887
    return-void

    .line 888
    nop

    .line 889
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
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
