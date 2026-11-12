.class public final synthetic Lwi;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwi;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lwi;->o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;

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
    .locals 8

    .line 1
    iget p1, p0, Lwi;->n:I

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    const/4 v1, 0x2

    .line 5
    iget-object p0, p0, Lwi;->o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch p1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance p1, Lpa;

    .line 13
    .line 14
    const/16 v2, 0xc

    .line 15
    .line 16
    invoke-direct {p1, v2}, Lpa;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 20
    .line 21
    new-instance v4, Lk03;

    .line 22
    .line 23
    invoke-direct {v4}, Lad2;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-static {v3}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Lpn4;->c()Lgp3;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v3, v5}, Lgp3;->i(Ljava/lang/String;)Lretrofit2/Call;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    new-instance v5, Lr20;

    .line 43
    .line 44
    invoke-direct {v5, p1, v2, v4, v1}, Lr20;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v3, v5}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance v1, Ld8;

    .line 55
    .line 56
    invoke-direct {v1, v0, p0}, Ld8;-><init>(ILjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, p1, v1}, Lad2;->e(Lba2;La83;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_0
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 68
    .line 69
    if-nez p1, :cond_0

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    iget-object v0, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->P:Lbl2;

    .line 73
    .line 74
    if-nez v0, :cond_1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    iput-boolean v2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->E0:Z

    .line 78
    .line 79
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    const v5, 0x7f13008c

    .line 84
    .line 85
    .line 86
    invoke-static {v4, v5, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v4}, Landroid/widget/Toast;->show()V

    .line 91
    .line 92
    .line 93
    iget-object v4, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->B0:Lbj;

    .line 94
    .line 95
    iget-object v5, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 96
    .line 97
    iget-object v6, v4, Lbj;->e:Lk03;

    .line 98
    .line 99
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 100
    .line 101
    invoke-virtual {v6, v7}, Lad2;->k(Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    iget-object v4, v4, Lbj;->c:Lpa;

    .line 105
    .line 106
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    new-instance v4, Lxi4;

    .line 110
    .line 111
    invoke-direct {v4, v1}, Lxi4;-><init>(I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    sget-object v5, Lfb0;->n:Lfb0;

    .line 119
    .line 120
    const/16 v7, 0x1e

    .line 121
    .line 122
    invoke-virtual {v4, v1, v5, v7}, Lxi4;->o(Ljava/lang/String;Lfb0;I)Lk03;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    new-instance v4, Lg7;

    .line 127
    .line 128
    invoke-direct {v4, v6, v3}, Lg7;-><init>(Lk03;I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1, p1, v4}, Lad2;->e(Lba2;La83;)V

    .line 132
    .line 133
    .line 134
    new-instance v1, Lz6;

    .line 135
    .line 136
    invoke-direct {v1, p0, v0, p1, v2}, Lz6;-><init>(Lzt;Ljava/lang/Object;Landroid/view/KeyEvent$Callback;I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6, p1, v1}, Lad2;->e(Lba2;La83;)V

    .line 140
    .line 141
    .line 142
    :goto_0
    return-void

    .line 143
    :pswitch_1
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/ArtistBottomSheetDialog;->B0:Lbj;

    .line 144
    .line 145
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    iget-object v1, p1, Lbj;->d:Ld34;

    .line 150
    .line 151
    iget-object v4, p1, Lbj;->g:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 152
    .line 153
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    iget-object v5, p1, Lbj;->g:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 158
    .line 159
    invoke-virtual {v5}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getStarred()Ljava/util/Date;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    if-eqz v5, :cond_2

    .line 164
    .line 165
    move v5, v2

    .line 166
    goto :goto_1

    .line 167
    :cond_2
    move v5, v3

    .line 168
    :goto_1
    invoke-static {v0, v4, v5}, Ln61;->f(ILjava/lang/String;Z)Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    const/4 v4, 0x0

    .line 173
    if-eqz v0, :cond_4

    .line 174
    .line 175
    invoke-static {}, Lhw;->t()Z

    .line 176
    .line 177
    .line 178
    move-result p0

    .line 179
    iget-object v0, p1, Lbj;->g:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 180
    .line 181
    if-eqz p0, :cond_3

    .line 182
    .line 183
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-virtual {v1, v4, v4, v3, p0}, Ld34;->J(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 188
    .line 189
    .line 190
    iget-object p0, p1, Lbj;->g:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 191
    .line 192
    invoke-virtual {p0, v4}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->setStarred(Ljava/util/Date;)V

    .line 193
    .line 194
    .line 195
    goto/16 :goto_2

    .line 196
    .line 197
    :cond_3
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    new-instance v0, Lzi;

    .line 202
    .line 203
    invoke-direct {v0, p1, v3}, Lzi;-><init>(Lbj;I)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-static {v4, v4, p0, v0}, Ld34;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/interfaces/StarCallback;)V

    .line 210
    .line 211
    .line 212
    iget-object p0, p1, Lbj;->g:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 213
    .line 214
    invoke-virtual {p0, v4}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->setStarred(Ljava/util/Date;)V

    .line 215
    .line 216
    .line 217
    goto/16 :goto_2

    .line 218
    .line 219
    :cond_4
    invoke-static {}, Lhw;->t()Z

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    iget-object v3, p1, Lbj;->g:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 224
    .line 225
    if-eqz v0, :cond_5

    .line 226
    .line 227
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    invoke-virtual {v1, v4, v4, v2, p0}, Ld34;->J(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 232
    .line 233
    .line 234
    iget-object p0, p1, Lbj;->g:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 235
    .line 236
    new-instance p1, Ljava/util/Date;

    .line 237
    .line 238
    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->setStarred(Ljava/util/Date;)V

    .line 242
    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_5
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    new-instance v3, Lzi;

    .line 250
    .line 251
    invoke-direct {v3, p1, v2}, Lzi;-><init>(Lbj;I)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    invoke-static {v4, v4, v0, v3}, Ld34;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/eddyizm/tempus/interfaces/StarCallback;)V

    .line 258
    .line 259
    .line 260
    iget-object v0, p1, Lbj;->g:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 261
    .line 262
    new-instance v1, Ljava/util/Date;

    .line 263
    .line 264
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->setStarred(Ljava/util/Date;)V

    .line 268
    .line 269
    .line 270
    new-instance v0, Ljava/lang/StringBuilder;

    .line 271
    .line 272
    const-string v1, "Checking preference: "

    .line 273
    .line 274
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 275
    .line 276
    .line 277
    invoke-static {}, Lud3;->W()Z

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    const-string v1, "ArtistSync"

    .line 289
    .line 290
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 291
    .line 292
    .line 293
    invoke-static {}, Lud3;->W()Z

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    if-eqz v0, :cond_6

    .line 298
    .line 299
    new-instance v0, Ljava/lang/StringBuilder;

    .line 300
    .line 301
    const-string v2, "Starting artist sync for: "

    .line 302
    .line 303
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    iget-object v2, p1, Lbj;->g:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 307
    .line 308
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getName()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 320
    .line 321
    .line 322
    iget-object v0, p1, Lbj;->c:Lpa;

    .line 323
    .line 324
    iget-object p1, p1, Lbj;->g:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 325
    .line 326
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object p1

    .line 330
    new-instance v1, Laj;

    .line 331
    .line 332
    invoke-direct {v1, p0}, Laj;-><init>(Landroid/content/Context;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0, p1, v1}, Lpa;->w(Ljava/lang/String;Ldk;)V

    .line 336
    .line 337
    .line 338
    goto :goto_2

    .line 339
    :cond_6
    const-string p0, "Artist sync preference is disabled"

    .line 340
    .line 341
    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 342
    .line 343
    .line 344
    :goto_2
    return-void

    .line 345
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
