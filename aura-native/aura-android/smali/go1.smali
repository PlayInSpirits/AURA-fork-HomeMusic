.class public final synthetic Lgo1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcp1;


# direct methods
.method public synthetic constructor <init>(Lcp1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lgo1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lgo1;->o:Lcp1;

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
    iget v0, p0, Lgo1;->n:I

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, -0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x5

    .line 7
    const/4 v5, 0x4

    .line 8
    const/16 v6, 0x8

    .line 9
    .line 10
    const v7, 0x7f0a005b

    .line 11
    .line 12
    .line 13
    const/4 v8, 0x0

    .line 14
    iget-object p0, p0, Lgo1;->o:Lcp1;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lcp1;->l0:Ltc1;

    .line 20
    .line 21
    iget-object p1, p1, Ltc1;->H:Lcom/google/android/material/card/MaterialCardView;

    .line 22
    .line 23
    invoke-virtual {p1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    new-instance v0, Lzo1;

    .line 37
    .line 38
    invoke-direct {v0, p0, v4}, Lzo1;-><init>(Lcp1;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void

    .line 45
    :pswitch_0
    iget-object p1, p0, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 46
    .line 47
    iget-object p1, p1, Lcom/eddyizm/tempus/viewmodel/b;->k:Lcl4;

    .line 48
    .line 49
    iget-object v0, p1, Lcl4;->c:Lpa;

    .line 50
    .line 51
    invoke-virtual {v0, v2, v3}, Lpa;->y(IZ)Lk03;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    new-instance v1, Lnp0;

    .line 56
    .line 57
    invoke-direct {v1, v4, p1}, Lnp0;-><init>(ILjava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v1}, Lad2;->f(La83;)V

    .line 61
    .line 62
    .line 63
    iget-object p1, p1, Lcl4;->d:Lk03;

    .line 64
    .line 65
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    new-instance v1, Lap1;

    .line 70
    .line 71
    invoke-direct {v1, p0, v5}, Lap1;-><init>(Lcp1;I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :pswitch_1
    iget-object p1, p0, Lcp1;->l0:Ltc1;

    .line 79
    .line 80
    iget-object p1, p1, Ltc1;->D:Lcom/google/android/material/card/MaterialCardView;

    .line 81
    .line 82
    invoke-virtual {p1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    if-eqz p1, :cond_1

    .line 90
    .line 91
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    new-instance v0, Lzo1;

    .line 96
    .line 97
    invoke-direct {v0, p0, v1}, Lzo1;-><init>(Lcp1;I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 101
    .line 102
    .line 103
    :cond_1
    return-void

    .line 104
    :pswitch_2
    new-instance p1, Lpo1;

    .line 105
    .line 106
    invoke-direct {p1}, Lpo1;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-virtual {p0}, Lnc1;->k()Lmd1;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {p1, p0, v8}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :pswitch_3
    iget-object p1, p0, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 122
    .line 123
    iget-object p1, p1, Lcom/eddyizm/tempus/viewmodel/b;->j:Lbl4;

    .line 124
    .line 125
    iget-object v0, p1, Lbl4;->c:Lrv2;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-static {v2, v3}, Lrv2;->o(IZ)Lk03;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    new-instance v1, Lnp0;

    .line 135
    .line 136
    invoke-direct {v1, v5, p1}, Lnp0;-><init>(ILjava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v1}, Lad2;->f(La83;)V

    .line 140
    .line 141
    .line 142
    iget-object p1, p1, Lbl4;->d:Lk03;

    .line 143
    .line 144
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    new-instance v1, Lap1;

    .line 149
    .line 150
    const/4 v2, 0x2

    .line 151
    invoke-direct {v1, p0, v2}, Lap1;-><init>(Lcp1;I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :pswitch_4
    iget-object p1, p0, Lcp1;->l0:Ltc1;

    .line 159
    .line 160
    iget-object p1, p1, Ltc1;->z:Lcom/google/android/material/card/MaterialCardView;

    .line 161
    .line 162
    invoke-virtual {p1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    if-eqz p1, :cond_2

    .line 170
    .line 171
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    new-instance v0, Lzo1;

    .line 176
    .line 177
    invoke-direct {v0, p0, v5}, Lzo1;-><init>(Lcp1;I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 181
    .line 182
    .line 183
    :cond_2
    return-void

    .line 184
    :pswitch_5
    const-string p1, "ALL"

    .line 185
    .line 186
    invoke-static {p1, p1}, Lb11;->h(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    iget-object p0, p0, Lcp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 191
    .line 192
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 193
    .line 194
    const v0, 0x7f0a0060

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0, v0, p1, v8}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :pswitch_6
    const-string p1, "ALBUM_RECENTLY_ADDED"

    .line 202
    .line 203
    invoke-static {p1, p1}, Lb11;->h(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    iget-object p0, p0, Lcp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 208
    .line 209
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 210
    .line 211
    invoke-virtual {p0, v7, p1, v8}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 212
    .line 213
    .line 214
    return-void

    .line 215
    :pswitch_7
    const-string p1, "ARTIST_STARRED"

    .line 216
    .line 217
    invoke-static {p1, p1}, Lb11;->h(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    iget-object p0, p0, Lcp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 222
    .line 223
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 224
    .line 225
    const v0, 0x7f0a005d

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0, v0, p1, v8}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :pswitch_8
    const-string p1, "ALBUM_STARRED"

    .line 233
    .line 234
    invoke-static {p1, p1}, Lb11;->h(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    iget-object p0, p0, Lcp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 239
    .line 240
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 241
    .line 242
    invoke-virtual {p0, v7, p1, v8}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 243
    .line 244
    .line 245
    return-void

    .line 246
    :pswitch_9
    const-string p1, "MEDIA_STARRED"

    .line 247
    .line 248
    invoke-static {p1, p1}, Lb11;->h(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    iget-object p0, p0, Lcp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 253
    .line 254
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 255
    .line 256
    const v0, 0x7f0a0065

    .line 257
    .line 258
    .line 259
    invoke-virtual {p0, v0, p1, v8}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 260
    .line 261
    .line 262
    return-void

    .line 263
    :pswitch_a
    iget-object p1, p0, Lcp1;->n0:Lcom/eddyizm/tempus/viewmodel/b;

    .line 264
    .line 265
    iget-object p1, p1, Lcom/eddyizm/tempus/viewmodel/b;->c:Lxi4;

    .line 266
    .line 267
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    const/16 p1, 0x64

    .line 271
    .line 272
    invoke-static {p1, v8, v8}, Lxi4;->q(ILjava/lang/Integer;Ljava/lang/Integer;)Lk03;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    new-instance v1, Lxo1;

    .line 281
    .line 282
    const/16 v2, 0x14

    .line 283
    .line 284
    invoke-direct {v1, p0, v2}, Lxo1;-><init>(Lcp1;I)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {p1, v0, v1}, Lad2;->e(Lba2;La83;)V

    .line 288
    .line 289
    .line 290
    return-void

    .line 291
    :pswitch_b
    new-instance v0, Landroid/widget/PopupMenu;

    .line 292
    .line 293
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    invoke-direct {v0, v2, p1}, Landroid/widget/PopupMenu;-><init>(Landroid/content/Context;Landroid/view/View;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->getMenuInflater()Landroid/view/MenuInflater;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    const v3, 0x7f0f0008

    .line 309
    .line 310
    .line 311
    invoke-virtual {p1, v3, v2}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 312
    .line 313
    .line 314
    new-instance p1, Lv7;

    .line 315
    .line 316
    invoke-direct {p1, v1, p0}, Lv7;-><init>(ILkc1;)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v0, p1}, Landroid/widget/PopupMenu;->setOnMenuItemClickListener(Landroid/widget/PopupMenu$OnMenuItemClickListener;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->show()V

    .line 323
    .line 324
    .line 325
    return-void

    .line 326
    :pswitch_c
    const-string p1, "ALBUM_MOST_PLAYED"

    .line 327
    .line 328
    invoke-static {p1, p1}, Lb11;->h(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 329
    .line 330
    .line 331
    move-result-object p1

    .line 332
    iget-object p0, p0, Lcp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 333
    .line 334
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 335
    .line 336
    invoke-virtual {p0, v7, p1, v8}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 337
    .line 338
    .line 339
    return-void

    .line 340
    :pswitch_d
    const-string p1, "ALBUM_RECENTLY_PLAYED"

    .line 341
    .line 342
    invoke-static {p1, p1}, Lb11;->h(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    .line 343
    .line 344
    .line 345
    move-result-object p1

    .line 346
    iget-object p0, p0, Lcp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 347
    .line 348
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 349
    .line 350
    invoke-virtual {p0, v7, p1, v8}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 351
    .line 352
    .line 353
    return-void

    .line 354
    :pswitch_e
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    instance-of p1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 359
    .line 360
    if-eqz p1, :cond_3

    .line 361
    .line 362
    check-cast p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 363
    .line 364
    goto :goto_0

    .line 365
    :cond_3
    move-object p0, v8

    .line 366
    :goto_0
    if-eqz p0, :cond_4

    .line 367
    .line 368
    const-string p1, "home_card"

    .line 369
    .line 370
    invoke-static {p0, v8, v8, p1}, Lcom/eddyizm/tempus/homemusic/b;->l(Lcom/eddyizm/tempus/ui/activity/MainActivity;Ljava/util/Map;Lk6;Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    :cond_4
    return-void

    .line 374
    nop

    .line 375
    :pswitch_data_0
    .packed-switch 0x0
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
