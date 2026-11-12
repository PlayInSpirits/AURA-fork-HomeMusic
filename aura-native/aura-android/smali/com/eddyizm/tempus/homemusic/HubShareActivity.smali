.class public final Lcom/eddyizm/tempus/homemusic/HubShareActivity;
.super Ldf;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final P:Lux3;


# instance fields
.field public N:Ljv3;

.field public O:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lux3;

    .line 2
    .line 3
    const-string v1, "https?://\\S+"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lux3;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/eddyizm/tempus/homemusic/HubShareActivity;->P:Lux3;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldf;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 14

    .line 1
    invoke-super {p0, p1}, Lnc1;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const v1, 0x7f0d001d

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const v1, 0x7f0a02f5

    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    check-cast v4, Lcom/google/android/material/button/MaterialButton;

    .line 25
    .line 26
    if-eqz v4, :cond_17

    .line 27
    .line 28
    const v1, 0x7f0a02f6

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    check-cast v5, Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    .line 36
    .line 37
    if-eqz v5, :cond_17

    .line 38
    .line 39
    const v1, 0x7f0a02f7

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    check-cast v6, Landroid/widget/TextView;

    .line 47
    .line 48
    if-eqz v6, :cond_17

    .line 49
    .line 50
    new-instance v1, Ljv3;

    .line 51
    .line 52
    check-cast v0, Landroid/widget/LinearLayout;

    .line 53
    .line 54
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v4, v1, Ljv3;->n:Ljava/lang/Object;

    .line 58
    .line 59
    iput-object v5, v1, Ljv3;->o:Ljava/lang/Object;

    .line 60
    .line 61
    iput-object v6, v1, Ljv3;->p:Ljava/lang/Object;

    .line 62
    .line 63
    iput-object v1, p0, Lcom/eddyizm/tempus/homemusic/HubShareActivity;->N:Ljv3;

    .line 64
    .line 65
    invoke-virtual {p0, v0}, Ldf;->setContentView(Landroid/view/View;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubShareActivity;->N:Ljv3;

    .line 69
    .line 70
    if-eqz v0, :cond_16

    .line 71
    .line 72
    iget-object v0, v0, Ljv3;->n:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 75
    .line 76
    new-instance v1, Lp6;

    .line 77
    .line 78
    const/16 v4, 0x14

    .line 79
    .line 80
    invoke-direct {v1, v4, p0}, Lp6;-><init>(ILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 84
    .line 85
    .line 86
    invoke-static {}, Lpt0;->c()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    const/4 v1, 0x1

    .line 91
    if-nez v0, :cond_0

    .line 92
    .line 93
    const p1, 0x7f13022c

    .line 94
    .line 95
    .line 96
    invoke-static {p0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 101
    .line 102
    .line 103
    new-instance p1, Landroid/content/Intent;

    .line 104
    .line 105
    const-class v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 106
    .line 107
    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 108
    .line 109
    .line 110
    const/high16 v0, 0x10000000

    .line 111
    .line 112
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_0
    if-nez p1, :cond_15

    .line 124
    .line 125
    iget-boolean p1, p0, Lcom/eddyizm/tempus/homemusic/HubShareActivity;->O:Z

    .line 126
    .line 127
    if-nez p1, :cond_15

    .line 128
    .line 129
    iput-boolean v1, p0, Lcom/eddyizm/tempus/homemusic/HubShareActivity;->O:Z

    .line 130
    .line 131
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    new-instance v0, Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    if-eqz v1, :cond_6

    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 150
    .line 151
    .line 152
    move-result v4

    .line 153
    const v5, -0x45ee9a33

    .line 154
    .line 155
    .line 156
    const/16 v6, 0x21

    .line 157
    .line 158
    const-string v7, "android.intent.extra.STREAM"

    .line 159
    .line 160
    if-eq v4, v5, :cond_4

    .line 161
    .line 162
    const v5, -0x37c67be

    .line 163
    .line 164
    .line 165
    if-eq v4, v5, :cond_1

    .line 166
    .line 167
    goto :goto_2

    .line 168
    :cond_1
    const-string v4, "android.intent.action.SEND_MULTIPLE"

    .line 169
    .line 170
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    if-nez v1, :cond_2

    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 178
    .line 179
    if-lt v1, v6, :cond_3

    .line 180
    .line 181
    invoke-static {p1}, Ln3;->q(Landroid/content/Intent;)Ljava/util/ArrayList;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    goto :goto_0

    .line 186
    :cond_3
    invoke-virtual {p1, v7}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    :goto_0
    if-eqz v1, :cond_6

    .line 191
    .line 192
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 193
    .line 194
    .line 195
    goto :goto_2

    .line 196
    :cond_4
    const-string v4, "android.intent.action.SEND"

    .line 197
    .line 198
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-eqz v1, :cond_6

    .line 203
    .line 204
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 205
    .line 206
    if-lt v1, v6, :cond_5

    .line 207
    .line 208
    invoke-static {p1}, Ln3;->o(Landroid/content/Intent;)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    check-cast v1, Landroid/os/Parcelable;

    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_5
    invoke-virtual {p1, v7}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    :goto_1
    check-cast v1, Landroid/net/Uri;

    .line 220
    .line 221
    if-eqz v1, :cond_6

    .line 222
    .line 223
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    :cond_6
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    if-eqz v1, :cond_8

    .line 231
    .line 232
    invoke-virtual {p1}, Landroid/content/Intent;->getClipData()Landroid/content/ClipData;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    if-eqz v1, :cond_8

    .line 237
    .line 238
    invoke-virtual {v1}, Landroid/content/ClipData;->getItemCount()I

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    move v5, v3

    .line 243
    :goto_3
    if-ge v5, v4, :cond_8

    .line 244
    .line 245
    invoke-virtual {v1, v5}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    invoke-virtual {v6}, Landroid/content/ClipData$Item;->getUri()Landroid/net/Uri;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    if-eqz v6, :cond_7

    .line 254
    .line 255
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    :cond_7
    add-int/lit8 v5, v5, 0x1

    .line 259
    .line 260
    goto :goto_3

    .line 261
    :cond_8
    invoke-static {v0}, Lq40;->t0(Ljava/util/ArrayList;)Ljava/util/List;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    new-instance v5, Ljava/util/ArrayList;

    .line 266
    .line 267
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 268
    .line 269
    .line 270
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 271
    .line 272
    .line 273
    move-result-object v1

    .line 274
    :cond_9
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 275
    .line 276
    .line 277
    move-result v4

    .line 278
    const-string v6, ""

    .line 279
    .line 280
    if-eqz v4, :cond_b

    .line 281
    .line 282
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v4

    .line 286
    move-object v7, v4

    .line 287
    check-cast v7, Landroid/net/Uri;

    .line 288
    .line 289
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 290
    .line 291
    .line 292
    move-result-object v8

    .line 293
    invoke-virtual {v8, v7}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v7

    .line 297
    if-nez v7, :cond_a

    .line 298
    .line 299
    invoke-virtual {p1}, Landroid/content/Intent;->getType()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v7

    .line 303
    if-nez v7, :cond_a

    .line 304
    .line 305
    goto :goto_5

    .line 306
    :cond_a
    move-object v6, v7

    .line 307
    :goto_5
    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 308
    .line 309
    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v6

    .line 313
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    const-string v7, "image/"

    .line 317
    .line 318
    invoke-static {v6, v7, v3}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 319
    .line 320
    .line 321
    move-result v6

    .line 322
    if-eqz v6, :cond_9

    .line 323
    .line 324
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    goto :goto_4

    .line 328
    :cond_b
    new-instance v7, Ljava/util/ArrayList;

    .line 329
    .line 330
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 331
    .line 332
    .line 333
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    :cond_c
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    if-eqz v1, :cond_f

    .line 342
    .line 343
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    move-object v4, v1

    .line 348
    check-cast v4, Landroid/net/Uri;

    .line 349
    .line 350
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 351
    .line 352
    .line 353
    move-result-object v8

    .line 354
    invoke-virtual {v8, v4}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 355
    .line 356
    .line 357
    move-result-object v4

    .line 358
    if-nez v4, :cond_d

    .line 359
    .line 360
    invoke-virtual {p1}, Landroid/content/Intent;->getType()Ljava/lang/String;

    .line 361
    .line 362
    .line 363
    move-result-object v4

    .line 364
    if-nez v4, :cond_d

    .line 365
    .line 366
    move-object v4, v6

    .line 367
    :cond_d
    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 368
    .line 369
    invoke-virtual {v4, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    const-string v8, "audio/"

    .line 377
    .line 378
    invoke-static {v4, v8, v3}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 379
    .line 380
    .line 381
    move-result v8

    .line 382
    if-nez v8, :cond_e

    .line 383
    .line 384
    const-string v8, "application/ogg"

    .line 385
    .line 386
    invoke-virtual {v4, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v4

    .line 390
    if-eqz v4, :cond_c

    .line 391
    .line 392
    :cond_e
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    goto :goto_6

    .line 396
    :cond_f
    const-string v0, "android.intent.extra.SUBJECT"

    .line 397
    .line 398
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    const-string v1, "android.intent.extra.TEXT"

    .line 403
    .line 404
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getCharSequenceExtra(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 405
    .line 406
    .line 407
    move-result-object p1

    .line 408
    if-eqz p1, :cond_10

    .line 409
    .line 410
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    :cond_10
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object p1

    .line 418
    invoke-static {p1}, Lti;->i0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 419
    .line 420
    .line 421
    move-result-object p1

    .line 422
    new-instance v0, Ljava/util/ArrayList;

    .line 423
    .line 424
    const/16 v1, 0xa

    .line 425
    .line 426
    invoke-static {p1, v1}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 427
    .line 428
    .line 429
    move-result v1

    .line 430
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 431
    .line 432
    .line 433
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 434
    .line 435
    .line 436
    move-result v1

    .line 437
    move v2, v3

    .line 438
    :goto_7
    if-ge v2, v1, :cond_11

    .line 439
    .line 440
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v4

    .line 444
    add-int/lit8 v2, v2, 0x1

    .line 445
    .line 446
    check-cast v4, Ljava/lang/String;

    .line 447
    .line 448
    invoke-static {v4}, Lqm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 449
    .line 450
    .line 451
    move-result-object v4

    .line 452
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v4

    .line 456
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    goto :goto_7

    .line 460
    :cond_11
    new-instance p1, Ljava/util/ArrayList;

    .line 461
    .line 462
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 466
    .line 467
    .line 468
    move-result v1

    .line 469
    :cond_12
    :goto_8
    if-ge v3, v1, :cond_13

    .line 470
    .line 471
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    add-int/lit8 v3, v3, 0x1

    .line 476
    .line 477
    move-object v4, v2

    .line 478
    check-cast v4, Ljava/lang/String;

    .line 479
    .line 480
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 481
    .line 482
    .line 483
    move-result v4

    .line 484
    if-lez v4, :cond_12

    .line 485
    .line 486
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    goto :goto_8

    .line 490
    :cond_13
    invoke-static {p1}, Lq40;->t0(Ljava/util/ArrayList;)Ljava/util/List;

    .line 491
    .line 492
    .line 493
    move-result-object v8

    .line 494
    const/4 v12, 0x0

    .line 495
    const/16 v13, 0x3e

    .line 496
    .line 497
    const-string v9, " "

    .line 498
    .line 499
    const/4 v10, 0x0

    .line 500
    const/4 v11, 0x0

    .line 501
    invoke-static/range {v8 .. v13}, Lq40;->B0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lif1;I)Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v8

    .line 505
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 506
    .line 507
    .line 508
    move-result p1

    .line 509
    if-eqz p1, :cond_14

    .line 510
    .line 511
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 512
    .line 513
    .line 514
    move-result p1

    .line 515
    if-eqz p1, :cond_14

    .line 516
    .line 517
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 518
    .line 519
    .line 520
    move-result p1

    .line 521
    if-nez p1, :cond_14

    .line 522
    .line 523
    const p1, 0x7f130230

    .line 524
    .line 525
    .line 526
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object p1

    .line 530
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 531
    .line 532
    .line 533
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/homemusic/HubShareActivity;->p(Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    return-void

    .line 537
    :cond_14
    const p1, 0x7f130228

    .line 538
    .line 539
    .line 540
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object p1

    .line 544
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 545
    .line 546
    .line 547
    sget-object v0, Lio1;->b:Landroid/os/Handler;

    .line 548
    .line 549
    new-instance v1, Lws1;

    .line 550
    .line 551
    const/4 v2, 0x2

    .line 552
    invoke-direct {v1, p0, p1, v2}, Lws1;-><init>(Ljava/lang/Object;Ljava/lang/String;I)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 556
    .line 557
    .line 558
    sget-object p1, Lio1;->a:Ljava/util/concurrent/ExecutorService;

    .line 559
    .line 560
    new-instance v4, Lt6;

    .line 561
    .line 562
    const/16 v9, 0x8

    .line 563
    .line 564
    move-object v6, p0

    .line 565
    invoke-direct/range {v4 .. v9}, Lt6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 566
    .line 567
    .line 568
    invoke-interface {p1, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 569
    .line 570
    .line 571
    :cond_15
    return-void

    .line 572
    :cond_16
    const-string p0, "bind"

    .line 573
    .line 574
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 575
    .line 576
    .line 577
    throw v2

    .line 578
    :cond_17
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 579
    .line 580
    .line 581
    move-result-object p0

    .line 582
    invoke-virtual {p0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 583
    .line 584
    .line 585
    move-result-object p0

    .line 586
    const-string p1, "Missing required view with ID: "

    .line 587
    .line 588
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object p0

    .line 592
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 593
    .line 594
    .line 595
    return-void
.end method

.method public final p(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubShareActivity;->N:Ljv3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "bind"

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-object v0, v0, Ljv3;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    .line 11
    .line 12
    const/16 v3, 0x8

    .line 13
    .line 14
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/eddyizm/tempus/homemusic/HubShareActivity;->N:Ljv3;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, v0, Ljv3;->p:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Landroid/widget/TextView;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubShareActivity;->N:Ljv3;

    .line 29
    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    iget-object p0, p0, Ljv3;->n:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Lcom/google/android/material/button/MaterialButton;

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    invoke-static {v2}, Lh12;->Q(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v1

    .line 45
    :cond_1
    invoke-static {v2}, Lh12;->Q(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v1

    .line 49
    :cond_2
    invoke-static {v2}, Lh12;->Q(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v1
.end method
