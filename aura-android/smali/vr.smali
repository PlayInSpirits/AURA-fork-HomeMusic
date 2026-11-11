.class public final synthetic Lvr;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lvr;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Lvr;->o:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 1
    iget p1, p0, Lvr;->n:I

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    const/4 v0, 0x0

    .line 5
    iget-object p0, p0, Lvr;->o:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lou3;

    .line 11
    .line 12
    iget-object p1, p0, Lou3;->C0:Lpu3;

    .line 13
    .line 14
    iget-object p0, p0, Lou3;->B0:Lwo0;

    .line 15
    .line 16
    iget-object p0, p0, Lwo0;->o:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Landroid/widget/RatingBar;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/widget/RatingBar;->getRating()F

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    float-to-int p0, p0

    .line 25
    invoke-virtual {p1, p0}, Lpu3;->c(I)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    check-cast p0, Leu3;

    .line 30
    .line 31
    iget-object p0, p0, Leu3;->C0:Lgu3;

    .line 32
    .line 33
    iget-object p1, p0, Lgu3;->d:Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;

    .line 34
    .line 35
    if-eqz p1, :cond_2

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getId()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    if-nez p1, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget-object p1, p0, Lgu3;->g:Lk03;

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Lad2;->k(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lgu3;->f:Lk03;

    .line 50
    .line 51
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Lad2;->k(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-boolean p1, p0, Lgu3;->e:Z

    .line 57
    .line 58
    iget-object p2, p0, Lgu3;->c:Lhh3;

    .line 59
    .line 60
    iget-object v1, p0, Lgu3;->d:Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;

    .line 61
    .line 62
    if-eqz p1, :cond_1

    .line 63
    .line 64
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getId()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    new-instance v1, Lfu3;

    .line 69
    .line 70
    invoke-direct {v1, p0, v0}, Lfu3;-><init>(Lgu3;I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    new-instance p0, Ljava/lang/Thread;

    .line 77
    .line 78
    new-instance p2, Lur2;

    .line 79
    .line 80
    const/16 v0, 0x10

    .line 81
    .line 82
    invoke-direct {p2, v0, p1, v1}, Lur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 89
    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getId()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-static {v0}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-virtual {p2}, Lpn4;->d()Lxc5;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    const-string v0, "InternetRadioClient"

    .line 111
    .line 112
    const-string v1, "deleteInternetRadioStation()"

    .line 113
    .line 114
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    iget-object v0, p2, Lxc5;->p:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, Lx02;

    .line 120
    .line 121
    iget-object p2, p2, Lxc5;->o:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p2, Lpn4;

    .line 124
    .line 125
    invoke-virtual {p2}, Lpn4;->f()Ljava/util/HashMap;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    invoke-interface {v0, p2, p1}, Lx02;->c(Ljava/util/Map;Ljava/lang/String;)Lretrofit2/Call;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    new-instance p2, Lsi1;

    .line 134
    .line 135
    const/16 v0, 0x13

    .line 136
    .line 137
    invoke-direct {p2, v0, p0}, Lsi1;-><init>(ILjava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 141
    .line 142
    .line 143
    :cond_2
    :goto_0
    return-void

    .line 144
    :pswitch_1
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;

    .line 145
    .line 146
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {p0}, Lzt;->h0()V

    .line 155
    .line 156
    .line 157
    iget-object p2, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->B0:Lmm3;

    .line 158
    .line 159
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistRowBottomSheetDialog;->C0:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 160
    .line 161
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    new-instance v1, Lvj;

    .line 166
    .line 167
    invoke-direct {v1, p1, v0}, Lvj;-><init>(Landroid/content/Context;B)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p2, p0, v1}, Lmm3;->b(Ljava/lang/String;Llm3;)V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :pswitch_2
    check-cast p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;

    .line 175
    .line 176
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->n0:Lim3;

    .line 177
    .line 178
    iget-object p1, p1, Lim3;->k:Lk03;

    .line 179
    .line 180
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 181
    .line 182
    invoke-virtual {p1, p2}, Lad2;->k(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Lkc1;->n()Landroid/content/Context;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    if-eqz p1, :cond_3

    .line 190
    .line 191
    invoke-virtual {p0}, Lkc1;->n()Landroid/content/Context;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    const p2, 0x7f130404

    .line 196
    .line 197
    .line 198
    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 203
    .line 204
    .line 205
    :cond_3
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 206
    .line 207
    if-eqz p0, :cond_4

    .line 208
    .line 209
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 210
    .line 211
    if-eqz p0, :cond_4

    .line 212
    .line 213
    invoke-virtual {p0}, Lv23;->o()V

    .line 214
    .line 215
    .line 216
    :cond_4
    return-void

    .line 217
    :pswitch_3
    check-cast p0, Lnc1;

    .line 218
    .line 219
    new-instance p1, Landroid/content/Intent;

    .line 220
    .line 221
    const-class p2, Lcom/eddyizm/tempus/lan/LanPlaybackActivity;

    .line 222
    .line 223
    invoke-direct {p1, p0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 227
    .line 228
    .line 229
    return-void

    .line 230
    :pswitch_4
    check-cast p0, Lvb4;

    .line 231
    .line 232
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    instance-of p1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 237
    .line 238
    if-eqz p1, :cond_5

    .line 239
    .line 240
    move-object p2, p0

    .line 241
    check-cast p2, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 242
    .line 243
    :cond_5
    if-eqz p2, :cond_6

    .line 244
    .line 245
    invoke-static {}, Lud3;->E()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    sget-object p1, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 250
    .line 251
    new-instance v1, Lws1;

    .line 252
    .line 253
    invoke-direct {v1, v0, p0, p2}, Lws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 257
    .line 258
    .line 259
    :cond_6
    return-void

    .line 260
    :pswitch_5
    check-cast p0, Lcat/ereza/customactivityoncrash/activity/DefaultErrorActivity;

    .line 261
    .line 262
    sget p1, Lcat/ereza/customactivityoncrash/activity/DefaultErrorActivity;->N:I

    .line 263
    .line 264
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 265
    .line 266
    .line 267
    move-result-object p1

    .line 268
    invoke-static {p0, p1}, Lsg0;->b(Landroid/content/Context;Landroid/content/Intent;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    const-string p2, "clipboard"

    .line 273
    .line 274
    invoke-virtual {p0, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object p2

    .line 278
    check-cast p2, Landroid/content/ClipboardManager;

    .line 279
    .line 280
    if-eqz p2, :cond_7

    .line 281
    .line 282
    const v1, 0x7f1300cd

    .line 283
    .line 284
    .line 285
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-static {v1, p1}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 290
    .line 291
    .line 292
    move-result-object p1

    .line 293
    invoke-virtual {p2, p1}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 294
    .line 295
    .line 296
    const p1, 0x7f1300cf

    .line 297
    .line 298
    .line 299
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 304
    .line 305
    .line 306
    :cond_7
    return-void

    .line 307
    :pswitch_6
    check-cast p0, Lxr;

    .line 308
    .line 309
    new-instance p1, Landroid/content/Intent;

    .line 310
    .line 311
    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 312
    .line 313
    .line 314
    const/high16 p2, 0x10000000

    .line 315
    .line 316
    invoke-virtual {p1, p2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 317
    .line 318
    .line 319
    const-string p2, "android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS"

    .line 320
    .line 321
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 322
    .line 323
    .line 324
    invoke-virtual {p0, p1}, Lkc1;->g0(Landroid/content/Intent;)V

    .line 325
    .line 326
    .line 327
    return-void

    .line 328
    nop

    .line 329
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
