.class public final synthetic Lz6;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Landroid/view/KeyEvent$Callback;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/activity/MainActivity;Lk03;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lz6;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lz6;->c:Landroid/view/KeyEvent$Callback;

    .line 8
    .line 9
    iput-object p2, p0, Lz6;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lz6;->b:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lzt;Ljava/lang/Object;Landroid/view/KeyEvent$Callback;I)V
    .locals 0

    .line 14
    iput p4, p0, Lz6;->a:I

    iput-object p1, p0, Lz6;->d:Ljava/lang/Object;

    iput-object p2, p0, Lz6;->b:Ljava/lang/Object;

    iput-object p3, p0, Lz6;->c:Landroid/view/KeyEvent$Callback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 5

    .line 1
    iget v0, p0, Lz6;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Lz6;->c:Landroid/view/KeyEvent$Callback;

    .line 6
    .line 7
    iget-object v4, p0, Lz6;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, Lz6;->d:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;

    .line 15
    .line 16
    check-cast v4, Lic2;

    .line 17
    .line 18
    check-cast v3, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 19
    .line 20
    check-cast p1, Ljava/util/List;

    .line 21
    .line 22
    if-eqz p1, :cond_4

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-static {p1}, Le03;->o(Ljava/util/List;)V

    .line 39
    .line 40
    .line 41
    iget-boolean v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->N0:Z

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    iput-boolean v2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->N0:Z

    .line 46
    .line 47
    invoke-static {v4, p1, v2}, Lbo2;->o(Lic2;Ljava/util/List;I)V

    .line 48
    .line 49
    .line 50
    iget-boolean p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;->E0:Z

    .line 51
    .line 52
    if-nez p1, :cond_2

    .line 53
    .line 54
    iget-object p1, v3, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 55
    .line 56
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p1, Lau;

    .line 59
    .line 60
    invoke-virtual {p1, v1}, Lau;->d(Z)V

    .line 61
    .line 62
    .line 63
    :cond_2
    invoke-virtual {p0}, Lkc1;->y()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_4

    .line 68
    .line 69
    invoke-virtual {p0}, Lzt;->h0()V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    invoke-static {v4, p1, v1}, Lbo2;->e(Lic2;Ljava/util/List;Z)V

    .line 74
    .line 75
    .line 76
    :cond_4
    :goto_0
    return-void

    .line 77
    :pswitch_0
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;

    .line 78
    .line 79
    check-cast v4, Landroid/view/View;

    .line 80
    .line 81
    check-cast v3, Landroid/view/View;

    .line 82
    .line 83
    check-cast p1, Ljava/util/List;

    .line 84
    .line 85
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    new-instance v0, Ltj;

    .line 90
    .line 91
    const/4 v1, 0x5

    .line 92
    invoke-direct {v0, v1, p0}, Ltj;-><init>(ILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->anyMatch(Ljava/util/function/Predicate;)Z

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    const/16 p1, 0x8

    .line 100
    .line 101
    if-eqz p0, :cond_5

    .line 102
    .line 103
    move v0, p1

    .line 104
    goto :goto_1

    .line 105
    :cond_5
    move v0, v2

    .line 106
    :goto_1
    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 107
    .line 108
    .line 109
    if-eqz p0, :cond_6

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_6
    move v2, p1

    .line 113
    :goto_2
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :pswitch_1
    check-cast v3, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 118
    .line 119
    check-cast p0, Lk03;

    .line 120
    .line 121
    check-cast v4, Ljava/lang/String;

    .line 122
    .line 123
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 124
    .line 125
    iget-object v0, v3, Lcom/eddyizm/tempus/ui/activity/MainActivity;->Q:Lk03;

    .line 126
    .line 127
    if-ne p0, v0, :cond_7

    .line 128
    .line 129
    move v2, v1

    .line 130
    :cond_7
    const/4 p0, 0x0

    .line 131
    if-eqz v2, :cond_8

    .line 132
    .line 133
    iput-object p0, v3, Lcom/eddyizm/tempus/ui/activity/MainActivity;->Q:Lk03;

    .line 134
    .line 135
    :cond_8
    if-eqz v2, :cond_a

    .line 136
    .line 137
    if-eqz p1, :cond_a

    .line 138
    .line 139
    invoke-static {}, Lud3;->v()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-nez v0, :cond_9

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_9
    invoke-static {v4}, Lud3;->m0(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-static {}, Lcom/eddyizm/tempus/App;->d()Lpn4;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    sput-object p1, Lcom/eddyizm/tempus/App;->p:Lpn4;

    .line 158
    .line 159
    invoke-static {}, Lra0;->a()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v3}, Ll70;->d()Le75;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-virtual {p1}, Le75;->a()V

    .line 167
    .line 168
    .line 169
    iget-object p1, v3, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Lom1;

    .line 170
    .line 171
    iget-object p1, p1, Lom1;->o:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast p1, Lss0;

    .line 174
    .line 175
    iget-object p1, p1, Lss0;->q:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast p1, Lv23;

    .line 178
    .line 179
    invoke-virtual {p1}, Lv23;->g()Lr23;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    iget v0, v0, Lr23;->u:I

    .line 184
    .line 185
    invoke-virtual {p1, v0, v1}, Lv23;->p(IZ)Z

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1, v0, p0, p0}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 189
    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_a
    :goto_3
    invoke-static {}, Lra0;->a()V

    .line 193
    .line 194
    .line 195
    if-eqz v2, :cond_b

    .line 196
    .line 197
    if-nez p1, :cond_b

    .line 198
    .line 199
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 200
    .line 201
    .line 202
    move-result-object p0

    .line 203
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    const-string p1, "next_server_switch"

    .line 215
    .line 216
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 217
    .line 218
    .line 219
    move-result-wide v0

    .line 220
    invoke-interface {p0, p1, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v3}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->G()V

    .line 228
    .line 229
    .line 230
    :cond_b
    :goto_4
    return-void

    .line 231
    :pswitch_2
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;

    .line 232
    .line 233
    check-cast v4, Lic2;

    .line 234
    .line 235
    check-cast v3, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 236
    .line 237
    check-cast p1, Ljava/util/List;

    .line 238
    .line 239
    if-eqz p1, :cond_f

    .line 240
    .line 241
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    if-eqz v0, :cond_c

    .line 246
    .line 247
    goto :goto_5

    .line 248
    :cond_c
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    if-nez v0, :cond_d

    .line 253
    .line 254
    goto :goto_5

    .line 255
    :cond_d
    invoke-static {p1}, Le03;->o(Ljava/util/List;)V

    .line 256
    .line 257
    .line 258
    iget-boolean v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->E0:Z

    .line 259
    .line 260
    if-eqz v0, :cond_e

    .line 261
    .line 262
    iput-boolean v2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->E0:Z

    .line 263
    .line 264
    const-string v0, "artist"

    .line 265
    .line 266
    invoke-static {v4, p1, v2, v0}, Lbo2;->q(Lic2;Ljava/util/List;ILjava/lang/String;)V

    .line 267
    .line 268
    .line 269
    iget-object p1, v3, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 270
    .line 271
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast p1, Lau;

    .line 274
    .line 275
    invoke-virtual {p1, v1}, Lau;->d(Z)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p0}, Lkc1;->y()Z

    .line 279
    .line 280
    .line 281
    move-result p1

    .line 282
    if-eqz p1, :cond_f

    .line 283
    .line 284
    invoke-virtual {p0}, Lzt;->h0()V

    .line 285
    .line 286
    .line 287
    goto :goto_5

    .line 288
    :cond_e
    invoke-static {v4, p1, v1}, Lbo2;->e(Lic2;Ljava/util/List;Z)V

    .line 289
    .line 290
    .line 291
    :cond_f
    :goto_5
    return-void

    .line 292
    :pswitch_3
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;

    .line 293
    .line 294
    check-cast v4, Lic2;

    .line 295
    .line 296
    check-cast v3, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 297
    .line 298
    check-cast p1, Ljava/util/List;

    .line 299
    .line 300
    if-eqz p1, :cond_13

    .line 301
    .line 302
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 303
    .line 304
    .line 305
    move-result v0

    .line 306
    if-eqz v0, :cond_10

    .line 307
    .line 308
    goto :goto_6

    .line 309
    :cond_10
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    if-nez v0, :cond_11

    .line 314
    .line 315
    goto :goto_6

    .line 316
    :cond_11
    invoke-static {p1}, Le03;->o(Ljava/util/List;)V

    .line 317
    .line 318
    .line 319
    iget-boolean v0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->H0:Z

    .line 320
    .line 321
    if-eqz v0, :cond_12

    .line 322
    .line 323
    iput-boolean v2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/AlbumBottomSheetDialog;->H0:Z

    .line 324
    .line 325
    const-string v0, "album"

    .line 326
    .line 327
    invoke-static {v4, p1, v2, v0}, Lbo2;->q(Lic2;Ljava/util/List;ILjava/lang/String;)V

    .line 328
    .line 329
    .line 330
    iget-object p1, v3, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 331
    .line 332
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 333
    .line 334
    check-cast p1, Lau;

    .line 335
    .line 336
    invoke-virtual {p1, v1}, Lau;->d(Z)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {p0}, Lkc1;->y()Z

    .line 340
    .line 341
    .line 342
    move-result p1

    .line 343
    if-eqz p1, :cond_13

    .line 344
    .line 345
    invoke-virtual {p0}, Lzt;->h0()V

    .line 346
    .line 347
    .line 348
    goto :goto_6

    .line 349
    :cond_12
    invoke-static {v4, p1, v1}, Lbo2;->e(Lic2;Ljava/util/List;Z)V

    .line 350
    .line 351
    .line 352
    :cond_13
    :goto_6
    return-void

    .line 353
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
