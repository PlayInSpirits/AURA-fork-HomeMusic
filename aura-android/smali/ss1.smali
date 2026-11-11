.class public final synthetic Lss1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lbp3;
.implements Lcp3;
.implements Lp5;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lvb4;


# direct methods
.method public synthetic constructor <init>(Lvb4;I)V
    .locals 0

    .line 1
    iput p2, p0, Lss1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lss1;->o:Lvb4;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public g(Landroidx/preference/Preference;Ljava/lang/Object;)Z
    .locals 5

    .line 1
    iget v0, p0, Lss1;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, Lss1;->o:Lvb4;

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    sparse-switch v0, :sswitch_data_0

    .line 10
    .line 11
    .line 12
    instance-of p1, p2, Ljava/lang/Boolean;

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const-string p2, "download_wifi_only"

    .line 23
    .line 24
    invoke-static {p2, p1}, Lxa3;->t(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    new-instance p1, Lh04;

    .line 30
    .line 31
    invoke-direct {p1, v2}, Lh04;-><init>(I)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance p1, Lh04;

    .line 36
    .line 37
    invoke-direct {p1, v3}, Lh04;-><init>(I)V

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    sget-object p2, Lvt0;->v:Ljava/util/HashMap;

    .line 45
    .line 46
    new-instance p2, Landroid/content/Intent;

    .line 47
    .line 48
    const-class v0, Lcom/eddyizm/tempus/service/DownloaderService;

    .line 49
    .line 50
    invoke-direct {p2, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 51
    .line 52
    .line 53
    const-string v0, "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS"

    .line 54
    .line 55
    invoke-virtual {p2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    const-string v0, "foreground"

    .line 60
    .line 61
    invoke-virtual {p2, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    const-string v0, "requirements"

    .line 66
    .line 67
    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p0, p1}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 72
    .line 73
    .line 74
    :cond_1
    return v4

    .line 75
    :sswitch_0
    const-string v0, "default"

    .line 76
    .line 77
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_2

    .line 82
    .line 83
    sget-object p2, Lwd2;->b:Lwd2;

    .line 84
    .line 85
    invoke-static {p2}, Lpf;->j(Lwd2;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    const p2, 0x7f130503

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-virtual {p1, p0}, Landroidx/preference/Preference;->x(Ljava/lang/CharSequence;)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    check-cast p2, Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {p2}, Lwd2;->a(Ljava/lang/String;)Lwd2;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p0}, Lpf;->j(Lwd2;)V

    .line 110
    .line 111
    .line 112
    invoke-static {p2}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    invoke-virtual {p0}, Ljava/util/Locale;->getDisplayName()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p1, p0}, Landroidx/preference/Preference;->x(Ljava/lang/CharSequence;)V

    .line 121
    .line 122
    .line 123
    :goto_1
    return v4

    .line 124
    :sswitch_1
    instance-of p1, p2, Ljava/lang/Integer;

    .line 125
    .line 126
    if-nez p1, :cond_3

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_3
    check-cast p2, Ljava/lang/Integer;

    .line 130
    .line 131
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    int-to-float p1, p1

    .line 136
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 137
    .line 138
    .line 139
    move-result-object p2

    .line 140
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 144
    .line 145
    .line 146
    move-result-object p2

    .line 147
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    const-string v0, "loudness_preamp"

    .line 152
    .line 153
    float-to-int p1, p1

    .line 154
    invoke-interface {p2, v0, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 159
    .line 160
    .line 161
    iget-boolean p1, p0, Lvb4;->y0:Z

    .line 162
    .line 163
    if-eqz p1, :cond_4

    .line 164
    .line 165
    iget-object p0, p0, Lvb4;->x0:Lxp;

    .line 166
    .line 167
    if-eqz p0, :cond_4

    .line 168
    .line 169
    iget-object p0, p0, Lxp;->e:Lcom/eddyizm/tempus/service/MediaService;

    .line 170
    .line 171
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->o()Landroidx/media3/exoplayer/ExoPlayer;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-static {p0}, Ljz3;->i(Lqi3;)V

    .line 176
    .line 177
    .line 178
    :cond_4
    :goto_2
    return v4

    .line 179
    :sswitch_2
    instance-of p1, p2, Ljava/lang/Boolean;

    .line 180
    .line 181
    if-eqz p1, :cond_6

    .line 182
    .line 183
    check-cast p2, Ljava/lang/Boolean;

    .line 184
    .line 185
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 186
    .line 187
    .line 188
    move-result p1

    .line 189
    iget-object p0, p0, Lvb4;->t0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 190
    .line 191
    const/16 p2, 0x80

    .line 192
    .line 193
    if-eqz p1, :cond_5

    .line 194
    .line 195
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    invoke-virtual {p0, p2}, Landroid/view/Window;->addFlags(I)V

    .line 200
    .line 201
    .line 202
    goto :goto_3

    .line 203
    :cond_5
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    invoke-virtual {p0, p2}, Landroid/view/Window;->clearFlags(I)V

    .line 208
    .line 209
    .line 210
    :cond_6
    :goto_3
    return v4

    .line 211
    :sswitch_3
    instance-of v0, p2, Ljava/lang/Boolean;

    .line 212
    .line 213
    if-eqz v0, :cond_7

    .line 214
    .line 215
    check-cast p2, Ljava/lang/Boolean;

    .line 216
    .line 217
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 218
    .line 219
    .line 220
    move-result p2

    .line 221
    if-eqz p2, :cond_7

    .line 222
    .line 223
    new-instance p2, Lzk4;

    .line 224
    .line 225
    new-instance v0, Lrb4;

    .line 226
    .line 227
    invoke-direct {v0, p1, v3}, Lrb4;-><init>(Landroidx/preference/Preference;I)V

    .line 228
    .line 229
    .line 230
    invoke-direct {p2, v4}, Lzk4;-><init>(I)V

    .line 231
    .line 232
    .line 233
    iput-object v0, p2, Lzk4;->D0:Ljava/lang/Runnable;

    .line 234
    .line 235
    iget-object p0, p0, Lvb4;->t0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 236
    .line 237
    invoke-virtual {p0}, Lnc1;->k()Lmd1;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    invoke-virtual {p2, p0, v1}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    :cond_7
    return v4

    .line 245
    :sswitch_4
    instance-of v0, p2, Ljava/lang/Boolean;

    .line 246
    .line 247
    if-eqz v0, :cond_8

    .line 248
    .line 249
    check-cast p2, Ljava/lang/Boolean;

    .line 250
    .line 251
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 252
    .line 253
    .line 254
    move-result p2

    .line 255
    if-eqz p2, :cond_8

    .line 256
    .line 257
    new-instance p2, Lzk4;

    .line 258
    .line 259
    new-instance v0, Lrb4;

    .line 260
    .line 261
    invoke-direct {v0, p1, v4}, Lrb4;-><init>(Landroidx/preference/Preference;I)V

    .line 262
    .line 263
    .line 264
    invoke-direct {p2, v3}, Lzk4;-><init>(I)V

    .line 265
    .line 266
    .line 267
    iput-object v0, p2, Lzk4;->D0:Ljava/lang/Runnable;

    .line 268
    .line 269
    iget-object p0, p0, Lvb4;->t0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 270
    .line 271
    invoke-virtual {p0}, Lnc1;->k()Lmd1;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    invoke-virtual {p2, p0, v1}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    :cond_8
    return v4

    .line 279
    :sswitch_5
    instance-of v0, p2, Ljava/lang/Boolean;

    .line 280
    .line 281
    if-eqz v0, :cond_9

    .line 282
    .line 283
    check-cast p2, Ljava/lang/Boolean;

    .line 284
    .line 285
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 286
    .line 287
    .line 288
    move-result p2

    .line 289
    if-eqz p2, :cond_9

    .line 290
    .line 291
    new-instance p2, Lzk4;

    .line 292
    .line 293
    new-instance v0, Lrb4;

    .line 294
    .line 295
    invoke-direct {v0, p1, v2}, Lrb4;-><init>(Landroidx/preference/Preference;I)V

    .line 296
    .line 297
    .line 298
    invoke-direct {p2, v2}, Lzk4;-><init>(I)V

    .line 299
    .line 300
    .line 301
    iput-object v0, p2, Lzk4;->D0:Ljava/lang/Runnable;

    .line 302
    .line 303
    iget-object p0, p0, Lvb4;->t0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 304
    .line 305
    invoke-virtual {p0}, Lnc1;->k()Lmd1;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    invoke-virtual {p2, p0, v1}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    :cond_9
    return v4

    .line 313
    :sswitch_6
    sget-object p1, Lio1;->b:Landroid/os/Handler;

    .line 314
    .line 315
    new-instance p2, Lqa1;

    .line 316
    .line 317
    const/16 v0, 0xe

    .line 318
    .line 319
    invoke-direct {p2, v0, p0}, Lqa1;-><init>(ILjava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 323
    .line 324
    .line 325
    return v4

    .line 326
    nop

    .line 327
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_6
        0x3 -> :sswitch_5
        0x6 -> :sswitch_4
        0x7 -> :sswitch_3
        0x8 -> :sswitch_2
        0x9 -> :sswitch_1
        0x10 -> :sswitch_0
    .end sparse-switch
.end method

.method public i(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Lo5;

    .line 2
    .line 3
    iget v0, p1, Lo5;->n:I

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object p1, p1, Lo5;->o:Landroid/content/Intent;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Lss1;->o:Lvb4;

    .line 19
    .line 20
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const/4 v1, 0x3

    .line 29
    invoke-virtual {v0, p1, v1}, Landroid/content/ContentResolver;->takePersistableUriPermission(Landroid/net/Uri;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-static {p1}, Lud3;->i0(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lg51;->i()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const v0, 0x7f1304a3

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0}, Lvb4;->m0()V

    .line 58
    .line 59
    .line 60
    :cond_0
    return-void
.end method

.method public j(Landroidx/preference/Preference;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lss1;->n:I

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    const-string v3, "SELECT_FRAGMENT"

    .line 7
    .line 8
    const-string v4, "HIDE_TOPAPPBAR_LAYOUT"

    .line 9
    .line 10
    const-string v5, "HIDE_TAB_LAYOUT"

    .line 11
    .line 12
    const-class v6, Lcom/eddyizm/tempus/ui/login/LoginActivity;

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v9, 0x0

    .line 17
    iget-object v0, v0, Lss1;->o:Lvb4;

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    :pswitch_0
    iget-object v1, v0, Lvb4;->u0:Lob4;

    .line 23
    .line 24
    new-instance v2, Lpz1;

    .line 25
    .line 26
    const/16 v3, 0x15

    .line 27
    .line 28
    invoke-direct {v2, v3, v0}, Lpz1;-><init>(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, v1, Lob4;->c:Lhh3;

    .line 32
    .line 33
    new-instance v1, Lmb4;

    .line 34
    .line 35
    invoke-direct {v1, v2}, Lmb4;-><init>(Lpz1;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {v8}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iget-object v2, v0, Lpn4;->k:Lrm3;

    .line 46
    .line 47
    if-nez v2, :cond_0

    .line 48
    .line 49
    new-instance v2, Lrm3;

    .line 50
    .line 51
    const/16 v4, 0xe

    .line 52
    .line 53
    invoke-direct {v2, v0, v4}, Lrm3;-><init>(Lpn4;I)V

    .line 54
    .line 55
    .line 56
    iput-object v2, v0, Lpn4;->k:Lrm3;

    .line 57
    .line 58
    :cond_0
    iget-object v0, v0, Lpn4;->k:Lrm3;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    const-string v2, "MediaLibraryScanningClient"

    .line 64
    .line 65
    const-string v4, "startScan()"

    .line 66
    .line 67
    invoke-static {v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 68
    .line 69
    .line 70
    iget-object v2, v0, Lrm3;->o:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Lin2;

    .line 73
    .line 74
    iget-object v0, v0, Lrm3;->n:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Lpn4;

    .line 77
    .line 78
    invoke-virtual {v0}, Lpn4;->f()Ljava/util/HashMap;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-interface {v2, v0}, Lin2;->a(Ljava/util/Map;)Lretrofit2/Call;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    new-instance v2, Lsi1;

    .line 87
    .line 88
    invoke-direct {v2, v3, v1}, Lsi1;-><init>(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {v0, v2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :pswitch_1
    new-instance v1, Ljo0;

    .line 96
    .line 97
    invoke-direct {v1}, Ljo0;-><init>()V

    .line 98
    .line 99
    .line 100
    iget-object v0, v0, Lvb4;->t0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 101
    .line 102
    invoke-virtual {v0}, Lnc1;->k()Lmd1;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v1, v0, v9}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :pswitch_2
    invoke-static {}, Lud3;->o()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    if-eqz v1, :cond_1

    .line 115
    .line 116
    invoke-static {v9}, Lud3;->i0(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-static {v8}, Lud3;->j0(I)V

    .line 120
    .line 121
    .line 122
    invoke-static {}, Lg51;->i()V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0}, Lkc1;->Z()Landroid/content/Context;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    const v2, 0x7f1304a2

    .line 130
    .line 131
    .line 132
    invoke-static {v1, v2, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Lvb4;->o0()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Lvb4;->m0()V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_1
    new-instance v1, Landroid/content/Intent;

    .line 147
    .line 148
    const-string v2, "android.intent.action.OPEN_DOCUMENT_TREE"

    .line 149
    .line 150
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    const/16 v2, 0x43

    .line 154
    .line 155
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 156
    .line 157
    .line 158
    iget-object v0, v0, Lvb4;->w0:Lr5;

    .line 159
    .line 160
    invoke-virtual {v0, v1}, Lr5;->a(Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    :goto_0
    return-void

    .line 164
    :pswitch_3
    new-instance v1, Landroid/content/Intent;

    .line 165
    .line 166
    invoke-virtual {v0}, Lkc1;->X()Lnc1;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    invoke-direct {v1, v9, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1, v5, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v1, v4, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v1}, Lkc1;->g0(Landroid/content/Intent;)V

    .line 183
    .line 184
    .line 185
    return-void

    .line 186
    :pswitch_4
    new-instance v1, Lus0;

    .line 187
    .line 188
    new-instance v2, Lrm2;

    .line 189
    .line 190
    const/16 v3, 0x11

    .line 191
    .line 192
    invoke-direct {v2, v3, v0}, Lrm2;-><init>(ILjava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    invoke-direct {v1, v2, v7}, Lus0;-><init>(Lcom/eddyizm/tempus/interfaces/DialogClickCallback;I)V

    .line 196
    .line 197
    .line 198
    iget-object v0, v0, Lvb4;->t0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 199
    .line 200
    invoke-virtual {v0}, Lnc1;->k()Lmd1;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {v1, v0, v9}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    :pswitch_5
    new-instance v1, Lus0;

    .line 209
    .line 210
    new-instance v3, Lub4;

    .line 211
    .line 212
    invoke-direct {v3, v0}, Lub4;-><init>(Lvb4;)V

    .line 213
    .line 214
    .line 215
    invoke-direct {v1, v3, v2}, Lus0;-><init>(Lcom/eddyizm/tempus/interfaces/DialogClickCallback;I)V

    .line 216
    .line 217
    .line 218
    iget-object v0, v0, Lvb4;->t0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 219
    .line 220
    invoke-virtual {v0}, Lnc1;->k()Lmd1;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    invoke-virtual {v1, v0, v9}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :pswitch_6
    iget-object v0, v0, Lvb4;->t0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 229
    .line 230
    invoke-virtual {v0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->H()V

    .line 231
    .line 232
    .line 233
    return-void

    .line 234
    :pswitch_7
    invoke-static {v0}, Lq05;->l(Lkc1;)Lv23;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    new-instance v10, Ly23;

    .line 239
    .line 240
    const/16 v18, -0x1

    .line 241
    .line 242
    const/16 v19, -0x1

    .line 243
    .line 244
    const/4 v11, 0x1

    .line 245
    const/4 v12, 0x0

    .line 246
    const v13, 0x7f0a01f9

    .line 247
    .line 248
    .line 249
    const/4 v14, 0x1

    .line 250
    const/4 v15, 0x0

    .line 251
    const/16 v16, -0x1

    .line 252
    .line 253
    move/from16 v17, v16

    .line 254
    .line 255
    invoke-direct/range {v10 .. v19}, Ly23;-><init>(ZZIZZIIII)V

    .line 256
    .line 257
    .line 258
    iget-object v2, v0, Lvb4;->t0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 259
    .line 260
    iget-object v2, v2, Lcom/eddyizm/tempus/ui/activity/MainActivity;->U:Lom1;

    .line 261
    .line 262
    invoke-virtual {v2, v11}, Lom1;->p(Z)V

    .line 263
    .line 264
    .line 265
    iget-object v0, v0, Lvb4;->t0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 266
    .line 267
    invoke-virtual {v0, v11}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->I(Z)V

    .line 268
    .line 269
    .line 270
    const v0, 0x7f0a01f9

    .line 271
    .line 272
    .line 273
    invoke-virtual {v1, v0, v9, v10}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 274
    .line 275
    .line 276
    return-void

    .line 277
    :pswitch_8
    new-instance v1, Landroid/content/Intent;

    .line 278
    .line 279
    invoke-virtual {v0}, Lkc1;->X()Lnc1;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    invoke-direct {v1, v2, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v1, v5, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1, v4, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v1, v3, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0, v1}, Lkc1;->g0(Landroid/content/Intent;)V

    .line 296
    .line 297
    .line 298
    return-void

    .line 299
    :pswitch_9
    invoke-virtual {v0}, Lkc1;->l()Lnc1;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    instance-of v1, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 304
    .line 305
    if-eqz v1, :cond_2

    .line 306
    .line 307
    move-object v9, v0

    .line 308
    check-cast v9, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 309
    .line 310
    :cond_2
    if-eqz v9, :cond_3

    .line 311
    .line 312
    const-string v0, "/admin"

    .line 313
    .line 314
    invoke-static {v9, v0}, Ljs1;->a(Lcom/eddyizm/tempus/ui/activity/MainActivity;Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    :cond_3
    return-void

    .line 318
    :pswitch_a
    invoke-virtual {v0}, Lkc1;->X()Lnc1;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-static {v0, v7}, Lcom/eddyizm/tempus/homemusic/HubUpdater;->check(Landroid/app/Activity;Z)V

    .line 323
    .line 324
    .line 325
    return-void

    .line 326
    nop

    .line 327
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
