.class public final Lpb0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 16
    const/4 v0, 0x5

    iput v0, p0, Lpb0;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Intent;Landroid/content/Context;Landroid/content/BroadcastReceiver$PendingResult;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lpb0;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lpb0;->o:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lpb0;->p:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lpb0;->q:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 14
    iput p4, p0, Lpb0;->n:I

    iput-object p1, p0, Lpb0;->q:Ljava/lang/Object;

    iput-object p2, p0, Lpb0;->o:Ljava/lang/Object;

    iput-object p3, p0, Lpb0;->p:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;I)V
    .locals 0

    .line 15
    iput p3, p0, Lpb0;->n:I

    iput-object p1, p0, Lpb0;->o:Ljava/lang/Object;

    iput-object p2, p0, Lpb0;->p:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Lpb0;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lpb0;->q:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lyf4;

    .line 11
    .line 12
    iget-boolean v0, v0, Lyf4;->c:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lpb0;->o:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Lqi3;

    .line 19
    .line 20
    const/high16 v0, 0x3f800000    # 1.0f

    .line 21
    .line 22
    invoke-interface {p0, v0}, Lqi3;->R(F)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v0, p0, Lpb0;->p:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, [F

    .line 29
    .line 30
    aget v3, v0, v2

    .line 31
    .line 32
    const v4, 0x3ccccccd    # 0.025f

    .line 33
    .line 34
    .line 35
    sub-float/2addr v3, v4

    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-static {v4, v3}, Ljava/lang/Math;->max(FF)F

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    aput v3, v0, v2

    .line 42
    .line 43
    iget-object v0, p0, Lpb0;->o:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v0, Lqi3;

    .line 46
    .line 47
    iget-object v3, p0, Lpb0;->p:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v3, [F

    .line 50
    .line 51
    aget v3, v3, v2

    .line 52
    .line 53
    invoke-interface {v0, v3}, Lqi3;->R(F)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lpb0;->p:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, [F

    .line 59
    .line 60
    aget v0, v0, v2

    .line 61
    .line 62
    cmpl-float v0, v0, v4

    .line 63
    .line 64
    iget-object v2, p0, Lpb0;->q:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, Lyf4;

    .line 67
    .line 68
    if-lez v0, :cond_1

    .line 69
    .line 70
    iget-object v0, v2, Lyf4;->a:Landroid/os/Handler;

    .line 71
    .line 72
    const-wide/16 v1, 0xfa

    .line 73
    .line 74
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    invoke-virtual {v2, v1}, Lyf4;->a(Z)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Lpb0;->o:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Lqi3;

    .line 84
    .line 85
    invoke-interface {v0}, Lqi3;->c()V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Lpb0;->q:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, Lyf4;

    .line 91
    .line 92
    iget-object v0, v0, Lyf4;->a:Landroid/os/Handler;

    .line 93
    .line 94
    iget-object p0, p0, Lpb0;->o:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p0, Lqi3;

    .line 97
    .line 98
    new-instance v2, Lat1;

    .line 99
    .line 100
    invoke-direct {v2, p0, v1}, Lat1;-><init>(Lqi3;I)V

    .line 101
    .line 102
    .line 103
    const-wide/16 v3, 0x12c

    .line 104
    .line 105
    invoke-virtual {v0, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 106
    .line 107
    .line 108
    :goto_0
    return-void

    .line 109
    :pswitch_0
    :try_start_0
    iget-object v0, p0, Lpb0;->o:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v0, Lta1;

    .line 112
    .line 113
    invoke-virtual {v0}, Lta1;->call()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    goto :goto_1

    .line 118
    :catch_0
    const/4 v0, 0x0

    .line 119
    :goto_1
    iget-object v1, p0, Lpb0;->p:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v1, Lua1;

    .line 122
    .line 123
    iget-object p0, p0, Lpb0;->q:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast p0, Landroid/os/Handler;

    .line 126
    .line 127
    new-instance v2, Llg1;

    .line 128
    .line 129
    const/16 v3, 0x18

    .line 130
    .line 131
    invoke-direct {v2, v3, v1, v0}, Llg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :pswitch_1
    iget-object v0, p0, Lpb0;->q:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v0, Lbq4;

    .line 141
    .line 142
    iget-object v1, v0, Lbq4;->q:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v1, Lpn2;

    .line 145
    .line 146
    iget-object v2, v1, Lpn2;->r:Loi;

    .line 147
    .line 148
    invoke-virtual {v2}, Loi;->keySet()Ljava/util/Set;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    check-cast v2, Lli;

    .line 153
    .line 154
    invoke-virtual {v2}, Lli;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    :goto_2
    move-object v3, v2

    .line 159
    check-cast v3, Lki;

    .line 160
    .line 161
    invoke-virtual {v3}, Lki;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_2

    .line 166
    .line 167
    invoke-virtual {v3}, Lki;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    check-cast v3, Landroid/os/IBinder;

    .line 172
    .line 173
    iget-object v4, v1, Lpn2;->r:Loi;

    .line 174
    .line 175
    invoke-virtual {v4, v3}, Lyd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    check-cast v3, Loj2;

    .line 180
    .line 181
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    iget-object v4, p0, Lpb0;->o:Ljava/lang/Object;

    .line 185
    .line 186
    check-cast v4, Ljava/lang/String;

    .line 187
    .line 188
    iget-object v5, p0, Lpb0;->p:Ljava/lang/Object;

    .line 189
    .line 190
    check-cast v5, Landroid/os/Bundle;

    .line 191
    .line 192
    invoke-virtual {v0, v3, v4, v5}, Lbq4;->o(Loj2;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 193
    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_2
    return-void

    .line 197
    :pswitch_2
    iget-object v0, p0, Lpb0;->o:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v0, Lrf2;

    .line 200
    .line 201
    iget-object v3, p0, Lpb0;->p:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v3, Ljava/lang/String;

    .line 204
    .line 205
    iget-object v0, v0, Lrf2;->n:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v0, Ls24;

    .line 208
    .line 209
    new-instance v4, Lrs0;

    .line 210
    .line 211
    const/16 v5, 0xa

    .line 212
    .line 213
    invoke-direct {v4, v5, v3}, Lrs0;-><init>(ILjava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-static {v0, v1, v2, v4}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    check-cast v0, Lcom/eddyizm/tempus/model/LyricsCache;

    .line 221
    .line 222
    iput-object v0, p0, Lpb0;->q:Ljava/lang/Object;

    .line 223
    .line 224
    return-void

    .line 225
    :pswitch_3
    iget-object v0, p0, Lpb0;->o:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 228
    .line 229
    iget-object v1, p0, Lpb0;->q:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast v1, Lql1;

    .line 232
    .line 233
    iget-object v2, p0, Lpb0;->p:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v2, Landroid/view/View;

    .line 236
    .line 237
    if-eqz v2, :cond_4

    .line 238
    .line 239
    iget-object v3, v1, Lql1;->q:Landroid/widget/OverScroller;

    .line 240
    .line 241
    if-eqz v3, :cond_4

    .line 242
    .line 243
    invoke-virtual {v3}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    if-eqz v3, :cond_3

    .line 248
    .line 249
    iget-object v3, v1, Lql1;->q:Landroid/widget/OverScroller;

    .line 250
    .line 251
    invoke-virtual {v3}, Landroid/widget/OverScroller;->getCurrY()I

    .line 252
    .line 253
    .line 254
    move-result v3

    .line 255
    invoke-virtual {v1, v0, v2, v3}, Lql1;->A(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;I)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2, p0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 259
    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_3
    check-cast v1, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;

    .line 263
    .line 264
    check-cast v2, Lcom/google/android/material/appbar/AppBarLayout;

    .line 265
    .line 266
    invoke-virtual {v1, v0, v2}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->F(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Lcom/google/android/material/appbar/AppBarLayout;)V

    .line 267
    .line 268
    .line 269
    iget-boolean p0, v2, Lcom/google/android/material/appbar/AppBarLayout;->y:Z

    .line 270
    .line 271
    if-eqz p0, :cond_4

    .line 272
    .line 273
    invoke-static {v0}, Lcom/google/android/material/appbar/AppBarLayout$BaseBehavior;->C(Landroidx/coordinatorlayout/widget/CoordinatorLayout;)Landroid/view/View;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    invoke-virtual {v2, p0}, Lcom/google/android/material/appbar/AppBarLayout;->h(Landroid/view/View;)Z

    .line 278
    .line 279
    .line 280
    move-result p0

    .line 281
    invoke-virtual {v2, p0}, Lcom/google/android/material/appbar/AppBarLayout;->g(Z)Z

    .line 282
    .line 283
    .line 284
    :cond_4
    :goto_3
    return-void

    .line 285
    :pswitch_4
    iget-object v0, p0, Lpb0;->o:Ljava/lang/Object;

    .line 286
    .line 287
    check-cast v0, Lss0;

    .line 288
    .line 289
    iget-object v3, p0, Lpb0;->p:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v3, Ljava/lang/String;

    .line 292
    .line 293
    iget-object v4, v0, Lss0;->n:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v4, Ls24;

    .line 296
    .line 297
    new-instance v5, Lrs0;

    .line 298
    .line 299
    invoke-direct {v5, v0, v3}, Lrs0;-><init>(Lss0;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    invoke-static {v4, v1, v2, v5}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    check-cast v0, Lcom/eddyizm/tempus/model/Download;

    .line 307
    .line 308
    iput-object v0, p0, Lpb0;->q:Ljava/lang/Object;

    .line 309
    .line 310
    return-void

    .line 311
    :pswitch_5
    iget-object v0, p0, Lpb0;->q:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast v0, Landroid/content/BroadcastReceiver$PendingResult;

    .line 314
    .line 315
    iget-object v1, p0, Lpb0;->p:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v1, Landroid/content/Context;

    .line 318
    .line 319
    iget-object p0, p0, Lpb0;->o:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast p0, Landroid/content/Intent;

    .line 322
    .line 323
    const-string v3, "Updating proxies: (BatteryNotLowProxy ("

    .line 324
    .line 325
    :try_start_1
    const-string v4, "KEY_BATTERY_NOT_LOW_PROXY_ENABLED"

    .line 326
    .line 327
    invoke-virtual {p0, v4, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    const-string v5, "KEY_BATTERY_CHARGING_PROXY_ENABLED"

    .line 332
    .line 333
    invoke-virtual {p0, v5, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 334
    .line 335
    .line 336
    move-result v5

    .line 337
    const-string v6, "KEY_STORAGE_NOT_LOW_PROXY_ENABLED"

    .line 338
    .line 339
    invoke-virtual {p0, v6, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 340
    .line 341
    .line 342
    move-result v6

    .line 343
    const-string v7, "KEY_NETWORK_STATE_PROXY_ENABLED"

    .line 344
    .line 345
    invoke-virtual {p0, v7, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 346
    .line 347
    .line 348
    move-result p0

    .line 349
    new-instance v2, Ljava/lang/StringBuilder;

    .line 350
    .line 351
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 355
    .line 356
    .line 357
    const-string v3, "), BatteryChargingProxy ("

    .line 358
    .line 359
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 363
    .line 364
    .line 365
    const-string v3, "), StorageNotLowProxy ("

    .line 366
    .line 367
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 368
    .line 369
    .line 370
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    const-string v3, "), NetworkStateProxy ("

    .line 374
    .line 375
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    const-string v3, "), "

    .line 382
    .line 383
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    invoke-static {}, Lcx;->f()Lcx;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    sget-object v7, Landroidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver;->a:Ljava/lang/String;

    .line 395
    .line 396
    invoke-virtual {v3, v7, v2}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    const-class v2, Landroidx/work/impl/background/systemalarm/ConstraintProxy$BatteryNotLowProxy;

    .line 400
    .line 401
    invoke-static {v1, v2, v4}, Lyb3;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 402
    .line 403
    .line 404
    const-class v2, Landroidx/work/impl/background/systemalarm/ConstraintProxy$BatteryChargingProxy;

    .line 405
    .line 406
    invoke-static {v1, v2, v5}, Lyb3;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 407
    .line 408
    .line 409
    const-class v2, Landroidx/work/impl/background/systemalarm/ConstraintProxy$StorageNotLowProxy;

    .line 410
    .line 411
    invoke-static {v1, v2, v6}, Lyb3;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    .line 412
    .line 413
    .line 414
    const-class v2, Landroidx/work/impl/background/systemalarm/ConstraintProxy$NetworkStateProxy;

    .line 415
    .line 416
    invoke-static {v1, v2, p0}, Lyb3;->a(Landroid/content/Context;Ljava/lang/Class;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 417
    .line 418
    .line 419
    invoke-virtual {v0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 420
    .line 421
    .line 422
    return-void

    .line 423
    :catchall_0
    move-exception p0

    .line 424
    invoke-virtual {v0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    .line 425
    .line 426
    .line 427
    throw p0

    .line 428
    nop

    .line 429
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
