.class public final synthetic Lpj;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lpj;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lpj;->o:Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;

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
    iget p1, p0, Lpj;->n:I

    .line 2
    .line 3
    const-string v0, "ARTIST_OBJECT"

    .line 4
    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    iget-object p0, p0, Lpj;->o:Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;

    .line 12
    .line 13
    packed-switch p1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->n0:Lwj;

    .line 17
    .line 18
    iget-object v0, p1, Lwj;->c:Lpa;

    .line 19
    .line 20
    iget-object p1, p1, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    new-instance v0, Lxi4;

    .line 26
    .line 27
    invoke-direct {v0, v2}, Lxi4;-><init>(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    sget-object v1, Lfb0;->n:Lfb0;

    .line 35
    .line 36
    const/16 v2, 0x1e

    .line 37
    .line 38
    invoke-virtual {v0, p1, v1, v2}, Lxi4;->o(Ljava/lang/String;Lfb0;I)Lk03;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    new-instance v1, Lsj;

    .line 47
    .line 48
    invoke-direct {v1, p0, v4}, Lsj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_0
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->n0:Lwj;

    .line 56
    .line 57
    iget-object v0, p1, Lwj;->c:Lpa;

    .line 58
    .line 59
    iget-object p1, p1, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    new-instance v1, Lk03;

    .line 65
    .line 66
    invoke-direct {v1}, Lad2;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-static {v5}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v3}, Lpn4;->c()Lgp3;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v3, v4}, Lgp3;->i(Ljava/lang/String;)Lretrofit2/Call;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    new-instance v4, Lr20;

    .line 86
    .line 87
    invoke-direct {v4, v0, p1, v1, v2}, Lr20;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v3, v4}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    new-instance v0, Lsj;

    .line 98
    .line 99
    invoke-direct {v0, p0, v5}, Lsj;-><init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, p1, v0}, Lad2;->e(Lba2;La83;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_1
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 107
    .line 108
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 109
    .line 110
    invoke-virtual {p0}, Lv23;->o()V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :pswitch_2
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 115
    .line 116
    if-eqz p1, :cond_1

    .line 117
    .line 118
    const-string p1, "artist_display_biography"

    .line 119
    .line 120
    invoke-static {p1, v4}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    xor-int/lit8 v2, v0, 0x1

    .line 125
    .line 126
    invoke-static {p1, v2}, Lxa3;->t(Ljava/lang/String;Z)V

    .line 127
    .line 128
    .line 129
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 130
    .line 131
    iget-object p0, p0, Lsc1;->h:Landroid/widget/LinearLayout;

    .line 132
    .line 133
    if-eqz v0, :cond_0

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_0
    move v1, v5

    .line 137
    :goto_0
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 138
    .line 139
    .line 140
    :cond_1
    return-void

    .line 141
    :pswitch_3
    new-instance p1, Landroid/os/Bundle;

    .line 142
    .line 143
    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 144
    .line 145
    .line 146
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->n0:Lwj;

    .line 147
    .line 148
    iget-object v1, v1, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 149
    .line 150
    if-eqz v1, :cond_2

    .line 151
    .line 152
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->strippedForNav()Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    goto :goto_1

    .line 157
    :cond_2
    move-object v1, v3

    .line 158
    :goto_1
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Lkc1;->a0()Landroid/view/View;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-static {p0}, Lgb;->x(Landroid/view/View;)Lv23;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    const v0, 0x7f0a00df

    .line 170
    .line 171
    .line 172
    invoke-virtual {p0, v0, p1, v3}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :pswitch_4
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    const p1, 0x7f130066

    .line 181
    .line 182
    .line 183
    invoke-static {p0, p1, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 188
    .line 189
    .line 190
    return-void

    .line 191
    :pswitch_5
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->n0:Lwj;

    .line 192
    .line 193
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    iget-object v0, p1, Lwj;->d:Ld34;

    .line 198
    .line 199
    iget-object v1, p1, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 200
    .line 201
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    iget-object v2, p1, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 206
    .line 207
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getStarred()Ljava/util/Date;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    if-eqz v2, :cond_3

    .line 212
    .line 213
    move v2, v4

    .line 214
    goto :goto_2

    .line 215
    :cond_3
    move v2, v5

    .line 216
    :goto_2
    const/4 v6, 0x3

    .line 217
    invoke-static {v6, v1, v2}, Ln61;->f(ILjava/lang/String;Z)Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-eqz v1, :cond_5

    .line 222
    .line 223
    invoke-static {}, Lhw;->t()Z

    .line 224
    .line 225
    .line 226
    move-result p0

    .line 227
    iget-object v1, p1, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 228
    .line 229
    if-eqz p0, :cond_4

    .line 230
    .line 231
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    invoke-virtual {v0, v3, v3, v5, p0}, Ld34;->J(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 236
    .line 237
    .line 238
    iget-object p0, p1, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 239
    .line 240
    invoke-virtual {p0, v3}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->setStarred(Ljava/util/Date;)V

    .line 241
    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_4
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    new-instance v1, Luj;

    .line 249
    .line 250
    invoke-direct {v1, p1, v5}, Luj;-><init>(Lwj;I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-static {v3, v3, p0, v1}, Ld34;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/interfaces/StarCallback;)V

    .line 257
    .line 258
    .line 259
    iget-object p0, p1, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 260
    .line 261
    invoke-virtual {p0, v3}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->setStarred(Ljava/util/Date;)V

    .line 262
    .line 263
    .line 264
    goto :goto_3

    .line 265
    :cond_5
    invoke-static {}, Lhw;->t()Z

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    iget-object v2, p1, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 270
    .line 271
    if-eqz v1, :cond_6

    .line 272
    .line 273
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    invoke-virtual {v0, v3, v3, v4, p0}, Ld34;->J(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 278
    .line 279
    .line 280
    iget-object p0, p1, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 281
    .line 282
    new-instance p1, Ljava/util/Date;

    .line 283
    .line 284
    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    .line 285
    .line 286
    .line 287
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->setStarred(Ljava/util/Date;)V

    .line 288
    .line 289
    .line 290
    goto :goto_3

    .line 291
    :cond_6
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    new-instance v2, Luj;

    .line 296
    .line 297
    invoke-direct {v2, p1, v4}, Luj;-><init>(Lwj;I)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-static {v3, v3, v1, v2}, Ld34;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/interfaces/StarCallback;)V

    .line 304
    .line 305
    .line 306
    iget-object v0, p1, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 307
    .line 308
    new-instance v1, Ljava/util/Date;

    .line 309
    .line 310
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->setStarred(Ljava/util/Date;)V

    .line 314
    .line 315
    .line 316
    invoke-static {}, Lud3;->W()Z

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    if-eqz v0, :cond_7

    .line 321
    .line 322
    iget-object v0, p1, Lwj;->c:Lpa;

    .line 323
    .line 324
    iget-object p1, p1, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 325
    .line 326
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    new-instance v1, Lvj;

    .line 331
    .line 332
    invoke-direct {v1, p0, v5}, Lvj;-><init>(Landroid/content/Context;B)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0, p1, v1}, Lpa;->w(Ljava/lang/String;Ldk;)V

    .line 336
    .line 337
    .line 338
    goto :goto_3

    .line 339
    :cond_7
    const-string p0, "ArtistSync"

    .line 340
    .line 341
    const-string p1, "Artist sync preference is disabled"

    .line 342
    .line 343
    invoke-static {p0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 344
    .line 345
    .line 346
    :goto_3
    return-void

    .line 347
    :pswitch_6
    const-string p1, "MEDIA_BY_ARTIST"

    .line 348
    .line 349
    invoke-static {p1, p1}, Lb11;->h(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 350
    .line 351
    .line 352
    move-result-object p1

    .line 353
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->n0:Lwj;

    .line 354
    .line 355
    iget-object v1, v1, Lwj;->e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 356
    .line 357
    if-eqz v1, :cond_8

    .line 358
    .line 359
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->strippedForNav()Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    goto :goto_4

    .line 364
    :cond_8
    move-object v1, v3

    .line 365
    :goto_4
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 366
    .line 367
    .line 368
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 369
    .line 370
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 371
    .line 372
    const v0, 0x7f0a003f

    .line 373
    .line 374
    .line 375
    invoke-virtual {p0, v0, p1, v3}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 376
    .line 377
    .line 378
    return-void

    .line 379
    :pswitch_7
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 380
    .line 381
    iget-object p0, p0, Lsc1;->k:Landroid/widget/LinearLayout;

    .line 382
    .line 383
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 384
    .line 385
    .line 386
    return-void

    .line 387
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
