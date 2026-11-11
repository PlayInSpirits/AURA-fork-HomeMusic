.class public final Lv9;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 10
    iput p1, p0, Lv9;->a:I

    iput-object p2, p0, Lv9;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/ui/activity/MainActivity;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput v0, p0, Lv9;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lv9;->b:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 1
    iget v0, p0, Lv9;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lv9;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->isInitialStickyBroadcast()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    check-cast v1, Lhq1;

    .line 15
    .line 16
    invoke-virtual {v1}, Lhq1;->j()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void

    .line 20
    :pswitch_0
    check-cast v1, Lip0;

    .line 21
    .line 22
    invoke-virtual {v1}, Lip0;->c()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    check-cast v1, Lv53;

    .line 27
    .line 28
    iget-object p2, v1, Lv53;->a:Ljava/util/concurrent/Executor;

    .line 29
    .line 30
    new-instance v0, Lur2;

    .line 31
    .line 32
    const/4 v1, 0x7

    .line 33
    invoke-direct {v0, v1, p0, p1}, Lur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_2
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string p1, "android.intent.action.MEDIA_BUTTON"

    .line 45
    .line 46
    invoke-static {p0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-nez p0, :cond_1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const-string p0, "android.intent.extra.KEY_EVENT"

    .line 54
    .line 55
    invoke-virtual {p2, p0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Landroid/view/KeyEvent;

    .line 60
    .line 61
    if-nez p0, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    check-cast v1, Lls2;

    .line 65
    .line 66
    iget-object p1, v1, Lls2;->m:Lqr2;

    .line 67
    .line 68
    iget-object p1, p1, Lqr2;->p:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p1, Lwo0;

    .line 71
    .line 72
    iget-object p1, p1, Lwo0;->n:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p1, Lxk2;

    .line 75
    .line 76
    iget-object p1, p1, Lxk2;->a:Landroid/media/session/MediaController;

    .line 77
    .line 78
    invoke-virtual {p1, p0}, Landroid/media/session/MediaController;->dispatchMediaButtonEvent(Landroid/view/KeyEvent;)Z

    .line 79
    .line 80
    .line 81
    :goto_0
    return-void

    .line 82
    :pswitch_3
    const-string p0, "android.intent.action.SCREEN_OFF"

    .line 83
    .line 84
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-eqz p0, :cond_3

    .line 93
    .line 94
    check-cast v1, Lep2;

    .line 95
    .line 96
    invoke-virtual {v1}, Lep2;->dismiss()V

    .line 97
    .line 98
    .line 99
    :cond_3
    return-void

    .line 100
    :pswitch_4
    check-cast v1, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;

    .line 101
    .line 102
    if-eqz p2, :cond_4

    .line 103
    .line 104
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    goto :goto_1

    .line 109
    :cond_4
    const/4 p0, 0x0

    .line 110
    :goto_1
    const-string p1, "com.eddyizm.tempus.service.EQUALIZER_UPDATED"

    .line 111
    .line 112
    invoke-static {p0, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    if-eqz p0, :cond_5

    .line 117
    .line 118
    invoke-static {v1}, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->h0(Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v1}, Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;->i0(Lcom/eddyizm/tempus/ui/fragment/EqualizerFragment;)V

    .line 122
    .line 123
    .line 124
    :cond_5
    return-void

    .line 125
    :pswitch_5
    const-string p0, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 126
    .line 127
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result p0

    .line 135
    if-eqz p0, :cond_7

    .line 136
    .line 137
    const-string p0, "noConnectivity"

    .line 138
    .line 139
    const/4 p1, 0x0

    .line 140
    invoke-virtual {p2, p0, p1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    check-cast v1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 145
    .line 146
    if-eqz p0, :cond_6

    .line 147
    .line 148
    iget-object p0, v1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->R:Lqp4;

    .line 149
    .line 150
    iget-object p0, p0, Lqp4;->b:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast p0, Landroid/widget/TextView;

    .line 153
    .line 154
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_6
    iget-object p0, v1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->R:Lqp4;

    .line 159
    .line 160
    iget-object p0, p0, Lqp4;->b:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast p0, Landroid/widget/TextView;

    .line 163
    .line 164
    const/16 p1, 0x8

    .line 165
    .line 166
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 167
    .line 168
    .line 169
    :cond_7
    :goto_2
    return-void

    .line 170
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    check-cast v1, Lsr;

    .line 177
    .line 178
    iget p0, v1, Lsr;->g:I

    .line 179
    .line 180
    const-string p1, "Received "

    .line 181
    .line 182
    packed-switch p0, :pswitch_data_1

    .line 183
    .line 184
    .line 185
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    if-nez p0, :cond_8

    .line 190
    .line 191
    goto/16 :goto_3

    .line 192
    .line 193
    :cond_8
    invoke-static {}, Lcx;->f()Lcx;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    sget-object v0, Lcm4;->a:Ljava/lang/String;

    .line 198
    .line 199
    new-instance v2, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    invoke-direct {v2, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    invoke-virtual {p0, v0, p1}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    if-eqz p0, :cond_17

    .line 223
    .line 224
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 225
    .line 226
    .line 227
    move-result p1

    .line 228
    const p2, -0x46671f94

    .line 229
    .line 230
    .line 231
    if-eq p1, p2, :cond_b

    .line 232
    .line 233
    const p2, -0x2b8fb65c

    .line 234
    .line 235
    .line 236
    if-eq p1, p2, :cond_9

    .line 237
    .line 238
    goto/16 :goto_3

    .line 239
    .line 240
    :cond_9
    const-string p1, "android.intent.action.DEVICE_STORAGE_OK"

    .line 241
    .line 242
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result p0

    .line 246
    if-nez p0, :cond_a

    .line 247
    .line 248
    goto/16 :goto_3

    .line 249
    .line 250
    :cond_a
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 251
    .line 252
    invoke-virtual {v1, p0}, Lxb0;->b(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    goto/16 :goto_3

    .line 256
    .line 257
    :cond_b
    const-string p1, "android.intent.action.DEVICE_STORAGE_LOW"

    .line 258
    .line 259
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result p0

    .line 263
    if-nez p0, :cond_c

    .line 264
    .line 265
    goto/16 :goto_3

    .line 266
    .line 267
    :cond_c
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 268
    .line 269
    invoke-virtual {v1, p0}, Lxb0;->b(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    goto/16 :goto_3

    .line 273
    .line 274
    :pswitch_7
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object p0

    .line 278
    if-nez p0, :cond_d

    .line 279
    .line 280
    goto/16 :goto_3

    .line 281
    .line 282
    :cond_d
    invoke-static {}, Lcx;->f()Lcx;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    sget-object v0, Lur;->a:Ljava/lang/String;

    .line 287
    .line 288
    new-instance v2, Ljava/lang/StringBuilder;

    .line 289
    .line 290
    invoke-direct {v2, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object p1

    .line 297
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    invoke-virtual {p0, v0, p1}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    if-eqz p0, :cond_17

    .line 312
    .line 313
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 314
    .line 315
    .line 316
    move-result p1

    .line 317
    const p2, -0x7606c095    # -6.0004207E-33f

    .line 318
    .line 319
    .line 320
    if-eq p1, p2, :cond_10

    .line 321
    .line 322
    const p2, 0x1d398bfd

    .line 323
    .line 324
    .line 325
    if-eq p1, p2, :cond_e

    .line 326
    .line 327
    goto/16 :goto_3

    .line 328
    .line 329
    :cond_e
    const-string p1, "android.intent.action.BATTERY_LOW"

    .line 330
    .line 331
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result p0

    .line 335
    if-nez p0, :cond_f

    .line 336
    .line 337
    goto/16 :goto_3

    .line 338
    .line 339
    :cond_f
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 340
    .line 341
    invoke-virtual {v1, p0}, Lxb0;->b(Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    goto/16 :goto_3

    .line 345
    .line 346
    :cond_10
    const-string p1, "android.intent.action.BATTERY_OKAY"

    .line 347
    .line 348
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result p0

    .line 352
    if-nez p0, :cond_11

    .line 353
    .line 354
    goto :goto_3

    .line 355
    :cond_11
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 356
    .line 357
    invoke-virtual {v1, p0}, Lxb0;->b(Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    goto :goto_3

    .line 361
    :pswitch_8
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object p0

    .line 365
    if-nez p0, :cond_12

    .line 366
    .line 367
    goto :goto_3

    .line 368
    :cond_12
    invoke-static {}, Lcx;->f()Lcx;

    .line 369
    .line 370
    .line 371
    move-result-object p2

    .line 372
    sget-object v0, Ltr;->a:Ljava/lang/String;

    .line 373
    .line 374
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object p1

    .line 378
    invoke-virtual {p2, v0, p1}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 382
    .line 383
    .line 384
    move-result p1

    .line 385
    sparse-switch p1, :sswitch_data_0

    .line 386
    .line 387
    .line 388
    goto :goto_3

    .line 389
    :sswitch_0
    const-string p1, "android.intent.action.ACTION_POWER_CONNECTED"

    .line 390
    .line 391
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result p0

    .line 395
    if-nez p0, :cond_13

    .line 396
    .line 397
    goto :goto_3

    .line 398
    :cond_13
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 399
    .line 400
    invoke-virtual {v1, p0}, Lxb0;->b(Ljava/lang/Object;)V

    .line 401
    .line 402
    .line 403
    goto :goto_3

    .line 404
    :sswitch_1
    const-string p1, "android.os.action.CHARGING"

    .line 405
    .line 406
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move-result p0

    .line 410
    if-nez p0, :cond_14

    .line 411
    .line 412
    goto :goto_3

    .line 413
    :cond_14
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 414
    .line 415
    invoke-virtual {v1, p0}, Lxb0;->b(Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    goto :goto_3

    .line 419
    :sswitch_2
    const-string p1, "android.os.action.DISCHARGING"

    .line 420
    .line 421
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result p0

    .line 425
    if-nez p0, :cond_15

    .line 426
    .line 427
    goto :goto_3

    .line 428
    :cond_15
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 429
    .line 430
    invoke-virtual {v1, p0}, Lxb0;->b(Ljava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    goto :goto_3

    .line 434
    :sswitch_3
    const-string p1, "android.intent.action.ACTION_POWER_DISCONNECTED"

    .line 435
    .line 436
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result p0

    .line 440
    if-nez p0, :cond_16

    .line 441
    .line 442
    goto :goto_3

    .line 443
    :cond_16
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 444
    .line 445
    invoke-virtual {v1, p0}, Lxb0;->b(Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    :cond_17
    :goto_3
    return-void

    .line 449
    :pswitch_9
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->isInitialStickyBroadcast()Z

    .line 450
    .line 451
    .line 452
    move-result p0

    .line 453
    if-nez p0, :cond_18

    .line 454
    .line 455
    check-cast v1, Lql;

    .line 456
    .line 457
    iget-object p0, v1, Lql;->i:Lil;

    .line 458
    .line 459
    iget-object v0, v1, Lql;->h:Landroid/media/AudioDeviceInfo;

    .line 460
    .line 461
    invoke-static {p1, p2, p0, v0}, Lnl;->c(Landroid/content/Context;Landroid/content/Intent;Lil;Landroid/media/AudioDeviceInfo;)Lnl;

    .line 462
    .line 463
    .line 464
    move-result-object p0

    .line 465
    invoke-virtual {v1, p0}, Lql;->a(Lnl;)V

    .line 466
    .line 467
    .line 468
    :cond_18
    return-void

    .line 469
    :pswitch_a
    check-cast v1, Lb3;

    .line 470
    .line 471
    invoke-virtual {v1}, Lb3;->l()V

    .line 472
    .line 473
    .line 474
    return-void

    .line 475
    :pswitch_b
    check-cast v1, Lw9;

    .line 476
    .line 477
    iget-object p0, v1, Lw9;->c:Ljava/util/concurrent/Executor;

    .line 478
    .line 479
    new-instance p1, Lu9;

    .line 480
    .line 481
    const/4 p2, 0x2

    .line 482
    invoke-direct {p1, v1, p2}, Lu9;-><init>(Lw9;I)V

    .line 483
    .line 484
    .line 485
    invoke-interface {p0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 486
    .line 487
    .line 488
    return-void

    .line 489
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
    .end packed-switch

    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    :sswitch_data_0
    .sparse-switch
        -0x7073f927 -> :sswitch_3
        -0x3465cce -> :sswitch_2
        0x388694fe -> :sswitch_1
        0x3cbf870b -> :sswitch_0
    .end sparse-switch
.end method
