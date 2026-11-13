.class public final Ldefpackage/ls2;
.super Ldefpackage/ir2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final A:I


# instance fields
.field public final f:Ldefpackage/na4;

.field public final g:Ldefpackage/tn2;

.field public final h:Ldefpackage/hg3;

.field public final i:Ldefpackage/lr0;

.field public final j:Ldefpackage/zk;

.field public final k:Z

.field public final l:Ldefpackage/w9;

.field public final m:Ldefpackage/qr2;

.field public final n:Ldefpackage/v9;

.field public final o:Landroid/content/ComponentName;

.field public p:Ldefpackage/is2;

.field public final q:Z

.field public volatile r:J

.field public s:Ldefpackage/lr0;

.field public t:I

.field public u:Ldefpackage/bk;

.field public final v:Landroid/os/Bundle;

.field public w:Ldefpackage/yw1;

.field public x:Ldefpackage/yw1;

.field public y:Ldefpackage/wa4;

.field public z:Ldefpackage/mi3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    const/high16 v0, 0x2000000

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    sput v0, Ldefpackage/ls2;->A:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ldefpackage/tn2;Landroid/net/Uri;Landroid/os/Handler;Landroid/os/Bundle;Ldefpackage/yw1;Ldefpackage/yw1;Ldefpackage/wa4;Ldefpackage/mi3;Landroid/os/Bundle;)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    invoke-direct {v1}, Ldefpackage/ir2;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v2, v1, Ldefpackage/ls2;->g:Ldefpackage/tn2;

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    iput-boolean v3, v1, Ldefpackage/ls2;->q:Z

    .line 12
    .line 13
    move-object/from16 v0, p5

    .line 14
    .line 15
    iput-object v0, v1, Ldefpackage/ls2;->w:Ldefpackage/yw1;

    .line 16
    .line 17
    move-object/from16 v0, p6

    .line 18
    .line 19
    iput-object v0, v1, Ldefpackage/ls2;->x:Ldefpackage/yw1;

    .line 20
    .line 21
    move-object/from16 v4, p7

    .line 22
    .line 23
    iput-object v4, v1, Ldefpackage/ls2;->y:Ldefpackage/wa4;

    .line 24
    .line 25
    move-object/from16 v4, p8

    .line 26
    .line 27
    iput-object v4, v1, Ldefpackage/ls2;->z:Ldefpackage/mi3;

    .line 28
    .line 29
    new-instance v4, Landroid/os/Bundle;

    .line 30
    .line 31
    move-object/from16 v5, p9

    .line 32
    .line 33
    invoke-direct {v4, v5}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 34
    .line 35
    .line 36
    iput-object v4, v1, Ldefpackage/ls2;->v:Landroid/os/Bundle;

    .line 37
    .line 38
    iget-object v6, v2, Ldefpackage/tn2;->f:Lcom/eddyizm/tempus/service/MediaService;

    .line 39
    .line 40
    invoke-static {v6}, Ldefpackage/hg3;->E(Landroid/content/Context;)Ldefpackage/hg3;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    iput-object v4, v1, Ldefpackage/ls2;->h:Ldefpackage/hg3;

    .line 45
    .line 46
    new-instance v4, Ldefpackage/lr0;

    .line 47
    .line 48
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v1, v4, Ldefpackage/lr0;->r:Ljava/lang/Object;

    .line 52
    .line 53
    sget-object v5, Ldefpackage/do2;->K:Ldefpackage/do2;

    .line 54
    .line 55
    iput-object v5, v4, Ldefpackage/lr0;->o:Ljava/lang/Object;

    .line 56
    .line 57
    const-string v5, ""

    .line 58
    .line 59
    iput-object v5, v4, Ldefpackage/lr0;->p:Ljava/lang/Object;

    .line 60
    .line 61
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    iput-wide v7, v4, Ldefpackage/lr0;->n:J

    .line 67
    .line 68
    iput-object v4, v1, Ldefpackage/ls2;->i:Ldefpackage/lr0;

    .line 69
    .line 70
    new-instance v4, Ldefpackage/na4;

    .line 71
    .line 72
    invoke-direct {v4, v2}, Ldefpackage/na4;-><init>(Ldefpackage/tn2;)V

    .line 73
    .line 74
    .line 75
    iput-object v4, v1, Ldefpackage/ls2;->f:Ldefpackage/na4;

    .line 76
    .line 77
    const-wide/32 v7, 0x493e0

    .line 78
    .line 79
    .line 80
    iput-wide v7, v1, Ldefpackage/ls2;->r:J

    .line 81
    .line 82
    new-instance v5, Ldefpackage/zk;

    .line 83
    .line 84
    iget-object v7, v2, Ldefpackage/tn2;->l:Landroid/os/Handler;

    .line 85
    .line 86
    invoke-virtual {v7}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-direct {v5, v7, v4}, Ldefpackage/zk;-><init>(Landroid/os/Looper;Ldefpackage/na4;)V

    .line 91
    .line 92
    .line 93
    iput-object v5, v1, Ldefpackage/ls2;->j:Ldefpackage/zk;

    .line 94
    .line 95
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 96
    .line 97
    const-string v11, "motorola"

    .line 98
    .line 99
    const/4 v5, 0x0

    .line 100
    const/16 v7, 0x21

    .line 101
    .line 102
    if-ge v4, v7, :cond_1

    .line 103
    .line 104
    :cond_0
    :goto_0
    move v8, v5

    .line 105
    goto :goto_1

    .line 106
    :cond_1
    sget-object v8, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 107
    .line 108
    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    const-string v9, "android.hardware.type.automotive"

    .line 113
    .line 114
    invoke-virtual {v8, v9}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    if-eqz v8, :cond_2

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_2
    sget-object v8, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 122
    .line 123
    const-string v9, "Google"

    .line 124
    .line 125
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    if-nez v9, :cond_3

    .line 130
    .line 131
    invoke-virtual {v8, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v9

    .line 135
    if-nez v9, :cond_3

    .line 136
    .line 137
    const-string v9, "vivo"

    .line 138
    .line 139
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v9

    .line 143
    if-nez v9, :cond_3

    .line 144
    .line 145
    const-string v9, "Sony"

    .line 146
    .line 147
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v9

    .line 151
    if-nez v9, :cond_3

    .line 152
    .line 153
    const-string v9, "Nothing"

    .line 154
    .line 155
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v9

    .line 159
    if-nez v9, :cond_3

    .line 160
    .line 161
    const-string v9, "unknown"

    .line 162
    .line 163
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v8

    .line 167
    if-eqz v8, :cond_0

    .line 168
    .line 169
    :cond_3
    move v8, v3

    .line 170
    :goto_1
    iput-boolean v8, v1, Ldefpackage/ls2;->k:Z

    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-nez v0, :cond_4

    .line 177
    .line 178
    invoke-virtual {v1}, Ldefpackage/ls2;->N()V

    .line 179
    .line 180
    .line 181
    :cond_4
    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    new-instance v8, Landroid/content/Intent;

    .line 186
    .line 187
    const-string v9, "android.intent.action.MEDIA_BUTTON"

    .line 188
    .line 189
    invoke-direct {v8, v9}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    invoke-virtual {v8, v10}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v8, v5}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 204
    .line 205
    .line 206
    move-result v8

    .line 207
    const/4 v12, 0x0

    .line 208
    if-ne v8, v3, :cond_5

    .line 209
    .line 210
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 215
    .line 216
    new-instance v8, Landroid/content/ComponentName;

    .line 217
    .line 218
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 219
    .line 220
    iget-object v10, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 221
    .line 222
    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 223
    .line 224
    invoke-direct {v8, v10, v0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    move-object v0, v8

    .line 228
    goto :goto_2

    .line 229
    :cond_5
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 230
    .line 231
    .line 232
    move-result v8

    .line 233
    if-eqz v8, :cond_14

    .line 234
    .line 235
    move-object v0, v12

    .line 236
    :goto_2
    iput-object v0, v1, Ldefpackage/ls2;->o:Landroid/content/ComponentName;

    .line 237
    .line 238
    const/16 v13, 0x1f

    .line 239
    .line 240
    if-eqz v0, :cond_8

    .line 241
    .line 242
    if-ge v4, v13, :cond_6

    .line 243
    .line 244
    goto :goto_3

    .line 245
    :cond_6
    move-object v8, v0

    .line 246
    :cond_7
    move v10, v5

    .line 247
    goto :goto_4

    .line 248
    :cond_8
    :goto_3
    const-string v8, "androidx.media3.session.MediaLibraryService"

    .line 249
    .line 250
    invoke-static {v6, v8}, Ldefpackage/ls2;->K(Lcom/eddyizm/tempus/service/MediaService;Ljava/lang/String;)Landroid/content/ComponentName;

    .line 251
    .line 252
    .line 253
    move-result-object v8

    .line 254
    if-nez v8, :cond_9

    .line 255
    .line 256
    const-string v8, "androidx.media3.session.MediaSessionService"

    .line 257
    .line 258
    invoke-static {v6, v8}, Ldefpackage/ls2;->K(Lcom/eddyizm/tempus/service/MediaService;Ljava/lang/String;)Landroid/content/ComponentName;

    .line 259
    .line 260
    .line 261
    move-result-object v8

    .line 262
    :cond_9
    if-eqz v8, :cond_7

    .line 263
    .line 264
    invoke-virtual {v8, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v10

    .line 268
    if-nez v10, :cond_7

    .line 269
    .line 270
    move v10, v3

    .line 271
    :goto_4
    new-instance v14, Landroid/content/Intent;

    .line 272
    .line 273
    move-object/from16 v15, p2

    .line 274
    .line 275
    invoke-direct {v14, v9, v15}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 276
    .line 277
    .line 278
    if-nez v8, :cond_b

    .line 279
    .line 280
    new-instance v8, Ldefpackage/v9;

    .line 281
    .line 282
    const/4 v10, 0x7

    .line 283
    invoke-direct {v8, v10, v1}, Ldefpackage/v9;-><init>(ILjava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    iput-object v8, v1, Ldefpackage/ls2;->n:Ldefpackage/v9;

    .line 287
    .line 288
    new-instance v10, Landroid/content/IntentFilter;

    .line 289
    .line 290
    invoke-direct {v10, v9}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v15}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v9

    .line 297
    sget-object v15, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 298
    .line 299
    invoke-virtual {v10, v9}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    if-ge v4, v7, :cond_a

    .line 303
    .line 304
    invoke-virtual {v6, v8, v10}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 305
    .line 306
    .line 307
    goto :goto_5

    .line 308
    :cond_a
    invoke-static {v6, v8, v10}, Ldefpackage/rg3;->c(Lcom/eddyizm/tempus/service/MediaService;Ldefpackage/v9;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 309
    .line 310
    .line 311
    :goto_5
    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v7

    .line 315
    invoke-virtual {v14, v7}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 316
    .line 317
    .line 318
    sget v7, Ldefpackage/ls2;->A:I

    .line 319
    .line 320
    invoke-static {v6, v5, v14, v7}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 321
    .line 322
    .line 323
    move-result-object v5

    .line 324
    new-instance v8, Landroid/content/ComponentName;

    .line 325
    .line 326
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    move-result-object v7

    .line 330
    invoke-direct {v8, v6, v7}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 331
    .line 332
    .line 333
    goto :goto_7

    .line 334
    :cond_b
    invoke-virtual {v14, v8}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 335
    .line 336
    .line 337
    if-eqz v10, :cond_d

    .line 338
    .line 339
    const/16 v7, 0x1a

    .line 340
    .line 341
    if-lt v4, v7, :cond_c

    .line 342
    .line 343
    sget v5, Ldefpackage/ls2;->A:I

    .line 344
    .line 345
    invoke-static {v6, v14, v5}, Ldefpackage/gm0;->e(Lcom/eddyizm/tempus/service/MediaService;Landroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 346
    .line 347
    .line 348
    move-result-object v5

    .line 349
    goto :goto_6

    .line 350
    :cond_c
    sget v7, Ldefpackage/ls2;->A:I

    .line 351
    .line 352
    invoke-static {v6, v5, v14, v7}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    goto :goto_6

    .line 357
    :cond_d
    sget v7, Ldefpackage/ls2;->A:I

    .line 358
    .line 359
    invoke-static {v6, v5, v14, v7}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    :goto_6
    iput-object v12, v1, Ldefpackage/ls2;->n:Ldefpackage/v9;

    .line 364
    .line 365
    :goto_7
    const-string v7, "androidx.media3.session.id"

    .line 366
    .line 367
    iget-object v9, v2, Ldefpackage/tn2;->i:Ljava/lang/String;

    .line 368
    .line 369
    filled-new-array {v7, v9}, [Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v7

    .line 373
    const-string v9, "."

    .line 374
    .line 375
    invoke-static {v9, v7}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v7

    .line 379
    move-object v9, v5

    .line 380
    new-instance v5, Ldefpackage/qr2;

    .line 381
    .line 382
    if-ge v4, v13, :cond_e

    .line 383
    .line 384
    goto :goto_8

    .line 385
    :cond_e
    move-object v8, v12

    .line 386
    :goto_8
    if-ge v4, v13, :cond_f

    .line 387
    .line 388
    :goto_9
    move-object/from16 v10, p4

    .line 389
    .line 390
    goto :goto_a

    .line 391
    :cond_f
    move-object v9, v12

    .line 392
    goto :goto_9

    .line 393
    :goto_a
    invoke-direct/range {v5 .. v10}, Ldefpackage/qr2;-><init>(Lcom/eddyizm/tempus/service/MediaService;Ljava/lang/String;Landroid/content/ComponentName;Landroid/app/PendingIntent;Landroid/os/Bundle;)V

    .line 394
    .line 395
    .line 396
    iput-object v5, v1, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 397
    .line 398
    if-lt v4, v13, :cond_11

    .line 399
    .line 400
    if-eqz v0, :cond_11

    .line 401
    .line 402
    :try_start_0
    iget-object v4, v5, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 403
    .line 404
    check-cast v4, Ldefpackage/kr2;

    .line 405
    .line 406
    iget-object v4, v4, Ldefpackage/kr2;->a:Landroid/media/session/MediaSession;

    .line 407
    .line 408
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    invoke-static {v4, v0}, Ldefpackage/go2;->r(Landroid/media/session/MediaSession;Landroid/content/ComponentName;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 412
    .line 413
    .line 414
    goto :goto_b

    .line 415
    :catch_0
    move-exception v0

    .line 416
    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 417
    .line 418
    invoke-virtual {v4, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    move-result v4

    .line 422
    if-eqz v4, :cond_10

    .line 423
    .line 424
    const-string v4, "MediaSessionLegacyStub"

    .line 425
    .line 426
    const-string v5, "caught IllegalArgumentException on a motorola device when attempting to set the media button broadcast receiver. See https://github.com/androidx/media/issues/1730 for details."

    .line 427
    .line 428
    invoke-static {v4, v5, v0}, Ldefpackage/l93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 429
    .line 430
    .line 431
    goto :goto_b

    .line 432
    :cond_10
    throw v0

    .line 433
    :cond_11
    :goto_b
    iget-object v0, v2, Ldefpackage/tn2;->t:Landroid/app/PendingIntent;

    .line 434
    .line 435
    if-eqz v0, :cond_12

    .line 436
    .line 437
    iget-object v2, v1, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 438
    .line 439
    iget-object v2, v2, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 440
    .line 441
    check-cast v2, Ldefpackage/kr2;

    .line 442
    .line 443
    iget-object v2, v2, Ldefpackage/kr2;->a:Landroid/media/session/MediaSession;

    .line 444
    .line 445
    invoke-virtual {v2, v0}, Landroid/media/session/MediaSession;->setSessionActivity(Landroid/app/PendingIntent;)V

    .line 446
    .line 447
    .line 448
    :cond_12
    iget-object v0, v1, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 449
    .line 450
    move-object/from16 v2, p3

    .line 451
    .line 452
    invoke-virtual {v0, v1, v2}, Ldefpackage/qr2;->u(Ldefpackage/ir2;Landroid/os/Handler;)V

    .line 453
    .line 454
    .line 455
    iget-boolean v0, v1, Ldefpackage/ls2;->k:Z

    .line 456
    .line 457
    if-eqz v0, :cond_13

    .line 458
    .line 459
    new-instance v12, Ldefpackage/w9;

    .line 460
    .line 461
    new-instance v0, Ldefpackage/es2;

    .line 462
    .line 463
    invoke-direct {v0, v1, v3}, Ldefpackage/es2;-><init>(Ldefpackage/ls2;I)V

    .line 464
    .line 465
    .line 466
    invoke-direct {v12, v6, v0}, Ldefpackage/w9;-><init>(Lcom/eddyizm/tempus/service/MediaService;Ldefpackage/es2;)V

    .line 467
    .line 468
    .line 469
    :cond_13
    iput-object v12, v1, Ldefpackage/ls2;->l:Ldefpackage/w9;

    .line 470
    .line 471
    return-void

    .line 472
    :cond_14
    const-string v1, "Expected 1 broadcast receiver that handles android.intent.action.MEDIA_BUTTON, found "

    .line 473
    .line 474
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 475
    .line 476
    .line 477
    move-result v0

    .line 478
    invoke-static {v0, v1}, Ldefpackage/zr2;->c(ILjava/lang/String;)V

    .line 479
    .line 480
    .line 481
    throw v12
.end method

.method public static E(Ldefpackage/qr2;Ljava/util/ArrayList;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v1, Ljava/util/HashSet;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    move v3, v0

    .line 17
    :goto_0
    if-ge v3, v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    check-cast v4, Ldefpackage/or2;

    .line 26
    .line 27
    iget-wide v4, v4, Ldefpackage/or2;->o:J

    .line 28
    .line 29
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    invoke-virtual {v1, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_0

    .line 38
    .line 39
    const-string v6, "Found duplicate queue id: "

    .line 40
    .line 41
    invoke-static {v6, v4, v5}, Ldefpackage/b11;->k(Ljava/lang/String;J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    new-instance v7, Ljava/lang/IllegalArgumentException;

    .line 46
    .line 47
    const-string v8, "id of each queue item should be unique"

    .line 48
    .line 49
    invoke-direct {v7, v8}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-string v8, "MediaSessionCompat"

    .line 53
    .line 54
    invoke-static {v8, v6, v7}, Ldefpackage/l93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {v1, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    iget-object p0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast p0, Ldefpackage/kr2;

    .line 68
    .line 69
    iget-object v1, p0, Ldefpackage/kr2;->a:Landroid/media/session/MediaSession;

    .line 70
    .line 71
    iput-object p1, p0, Ldefpackage/kr2;->h:Ljava/util/List;

    .line 72
    .line 73
    if-nez p1, :cond_2

    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    invoke-virtual {v1, p0}, Landroid/media/session/MediaSession;->setQueue(Ljava/util/List;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_2
    new-instance p0, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    invoke-direct {p0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    :goto_1
    if-ge v0, v2, :cond_4

    .line 94
    .line 95
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    add-int/lit8 v0, v0, 0x1

    .line 100
    .line 101
    check-cast v3, Ldefpackage/or2;

    .line 102
    .line 103
    iget-object v4, v3, Ldefpackage/or2;->p:Landroid/media/session/MediaSession$QueueItem;

    .line 104
    .line 105
    if-eqz v4, :cond_3

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_3
    iget-object v4, v3, Ldefpackage/or2;->n:Ldefpackage/pm2;

    .line 109
    .line 110
    invoke-virtual {v4}, Ldefpackage/pm2;->b()Landroid/media/MediaDescription;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    new-instance v5, Landroid/media/session/MediaSession$QueueItem;

    .line 115
    .line 116
    iget-wide v6, v3, Ldefpackage/or2;->o:J

    .line 117
    .line 118
    invoke-direct {v5, v4, v6, v7}, Landroid/media/session/MediaSession$QueueItem;-><init>(Landroid/media/MediaDescription;J)V

    .line 119
    .line 120
    .line 121
    iput-object v5, v3, Ldefpackage/or2;->p:Landroid/media/session/MediaSession$QueueItem;

    .line 122
    .line 123
    move-object v4, v5

    .line 124
    :goto_2
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_4
    invoke-virtual {v1, p0}, Landroid/media/session/MediaSession;->setQueue(Ljava/util/List;)V

    .line 129
    .line 130
    .line 131
    return-void
.end method

.method public static F(Ldefpackage/qr2;Ldefpackage/eo2;)V
    .locals 6

    .line 1
    iget-object p0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldefpackage/kr2;

    .line 4
    .line 5
    iput-object p1, p0, Ldefpackage/kr2;->i:Ldefpackage/eo2;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/kr2;->a:Landroid/media/session/MediaSession;

    .line 8
    .line 9
    iget-object v0, p1, Ldefpackage/eo2;->n:Landroid/os/Bundle;

    .line 10
    .line 11
    iget-object v1, p1, Ldefpackage/eo2;->o:Landroid/media/MediaMetadata;

    .line 12
    .line 13
    if-nez v1, :cond_9

    .line 14
    .line 15
    new-instance v1, Landroid/media/MediaMetadata$Builder;

    .line 16
    .line 17
    invoke-direct {v1}, Landroid/media/MediaMetadata$Builder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_8

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Ljava/lang/String;

    .line 39
    .line 40
    sget-object v4, Ldefpackage/eo2;->q:Ldefpackage/oi;

    .line 41
    .line 42
    invoke-virtual {v4, v3}, Ldefpackage/yd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    check-cast v4, Ljava/lang/Integer;

    .line 47
    .line 48
    if-nez v4, :cond_1

    .line 49
    .line 50
    const/4 v4, -0x1

    .line 51
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    :cond_1
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_7

    .line 60
    .line 61
    const/4 v5, 0x1

    .line 62
    if-eq v4, v5, :cond_6

    .line 63
    .line 64
    const/4 v5, 0x2

    .line 65
    if-eq v4, v5, :cond_5

    .line 66
    .line 67
    const/4 v5, 0x3

    .line 68
    if-eq v4, v5, :cond_4

    .line 69
    .line 70
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    if-eqz v4, :cond_3

    .line 75
    .line 76
    instance-of v5, v4, Ljava/lang/CharSequence;

    .line 77
    .line 78
    if-eqz v5, :cond_2

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    instance-of v5, v4, Ljava/lang/Long;

    .line 82
    .line 83
    if-eqz v5, :cond_0

    .line 84
    .line 85
    check-cast v4, Ljava/lang/Long;

    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 88
    .line 89
    .line 90
    move-result-wide v4

    .line 91
    invoke-virtual {v1, v3, v4, v5}, Landroid/media/MediaMetadata$Builder;->putLong(Ljava/lang/String;J)Landroid/media/MediaMetadata$Builder;

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    :goto_1
    check-cast v4, Ljava/lang/CharSequence;

    .line 96
    .line 97
    invoke-virtual {v1, v3, v4}, Landroid/media/MediaMetadata$Builder;->putText(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/media/MediaMetadata$Builder;

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_4
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    check-cast v4, Landroid/media/Rating;

    .line 106
    .line 107
    invoke-virtual {v1, v3, v4}, Landroid/media/MediaMetadata$Builder;->putRating(Ljava/lang/String;Landroid/media/Rating;)Landroid/media/MediaMetadata$Builder;

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_5
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    check-cast v4, Landroid/graphics/Bitmap;

    .line 116
    .line 117
    invoke-virtual {v1, v3, v4}, Landroid/media/MediaMetadata$Builder;->putBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/media/MediaMetadata$Builder;

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_6
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-virtual {v1, v3, v4}, Landroid/media/MediaMetadata$Builder;->putText(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/media/MediaMetadata$Builder;

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :cond_7
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 130
    .line 131
    .line 132
    move-result-wide v4

    .line 133
    invoke-virtual {v1, v3, v4, v5}, Landroid/media/MediaMetadata$Builder;->putLong(Ljava/lang/String;J)Landroid/media/MediaMetadata$Builder;

    .line 134
    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_8
    invoke-virtual {v1}, Landroid/media/MediaMetadata$Builder;->build()Landroid/media/MediaMetadata;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    iput-object v0, p1, Ldefpackage/eo2;->o:Landroid/media/MediaMetadata;

    .line 142
    .line 143
    :cond_9
    iget-object p1, p1, Ldefpackage/eo2;->o:Landroid/media/MediaMetadata;

    .line 144
    .line 145
    invoke-virtual {p0, p1}, Landroid/media/session/MediaSession;->setMetadata(Landroid/media/MediaMetadata;)V

    .line 146
    .line 147
    .line 148
    return-void
.end method

.method public static G(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Ldefpackage/gn2;
    .locals 9

    .line 1
    new-instance v0, Ldefpackage/um2;

    .line 2
    .line 3
    invoke-direct {v0}, Ldefpackage/um2;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ldefpackage/yw1;->o:Ldefpackage/vw1;

    .line 7
    .line 8
    sget-object v1, Ldefpackage/gy3;->r:Ldefpackage/gy3;

    .line 9
    .line 10
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 11
    .line 12
    sget-object v1, Ldefpackage/gy3;->r:Ldefpackage/gy3;

    .line 13
    .line 14
    new-instance v1, Ldefpackage/zm2;

    .line 15
    .line 16
    invoke-direct {v1}, Ldefpackage/zm2;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v2, Ldefpackage/cn2;->d:Ldefpackage/cn2;

    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    const-string p0, ""

    .line 24
    .line 25
    :cond_0
    move-object v3, p0

    .line 26
    new-instance p0, Ldefpackage/yc5;

    .line 27
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Ldefpackage/yc5;->n:Ljava/lang/Object;

    .line 32
    .line 33
    iput-object p2, p0, Ldefpackage/yc5;->o:Ljava/lang/Object;

    .line 34
    .line 35
    iput-object p3, p0, Ldefpackage/yc5;->p:Ljava/lang/Object;

    .line 36
    .line 37
    new-instance v8, Ldefpackage/cn2;

    .line 38
    .line 39
    invoke-direct {v8, p0}, Ldefpackage/cn2;-><init>(Ldefpackage/yc5;)V

    .line 40
    .line 41
    .line 42
    new-instance v2, Ldefpackage/gn2;

    .line 43
    .line 44
    new-instance v4, Ldefpackage/wm2;

    .line 45
    .line 46
    invoke-direct {v4, v0}, Ldefpackage/vm2;-><init>(Ldefpackage/um2;)V

    .line 47
    .line 48
    .line 49
    new-instance v6, Ldefpackage/an2;

    .line 50
    .line 51
    invoke-direct {v6, v1}, Ldefpackage/an2;-><init>(Ldefpackage/zm2;)V

    .line 52
    .line 53
    .line 54
    sget-object v7, Ldefpackage/do2;->K:Ldefpackage/do2;

    .line 55
    .line 56
    const/4 v5, 0x0

    .line 57
    invoke-direct/range {v2 .. v8}, Ldefpackage/gn2;-><init>(Ljava/lang/String;Ldefpackage/wm2;Ldefpackage/bn2;Ldefpackage/an2;Ldefpackage/do2;Ldefpackage/cn2;)V

    .line 58
    .line 59
    .line 60
    return-object v2
.end method

.method public static K(Lcom/eddyizm/tempus/service/MediaService;Ljava/lang/String;)Landroid/content/ComponentName;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroid/content/Intent;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {v1, p0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    invoke-virtual {v0, v1, p0}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_1

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
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    check-cast p0, Landroid/content/pm/ResolveInfo;

    .line 36
    .line 37
    new-instance p1, Landroid/content/ComponentName;

    .line 38
    .line 39
    iget-object p0, p0, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    .line 40
    .line 41
    iget-object v0, p0, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    .line 42
    .line 43
    iget-object p0, p0, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    .line 44
    .line 45
    invoke-direct {p1, v0, p0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object p1

    .line 49
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 50
    return-object p0
.end method


# virtual methods
.method public final A()V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/ls2;->g:Ldefpackage/tn2;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/tn2;->s:Ldefpackage/al3;

    .line 4
    .line 5
    const/4 v1, 0x7

    .line 6
    invoke-virtual {v0, v1}, Ldefpackage/al3;->S0(I)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v2, 0x1

    .line 11
    iget-object v3, p0, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Ldefpackage/bs2;

    .line 16
    .line 17
    const/4 v4, 0x2

    .line 18
    invoke-direct {v0, p0, v4}, Ldefpackage/bs2;-><init>(Ldefpackage/ls2;I)V

    .line 19
    .line 20
    .line 21
    iget-object v3, v3, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Ldefpackage/kr2;

    .line 24
    .line 25
    invoke-virtual {v3}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {p0, v1, v0, v3, v2}, Ldefpackage/ls2;->I(ILdefpackage/ks2;Ldefpackage/ms2;Z)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    new-instance v0, Ldefpackage/bs2;

    .line 34
    .line 35
    const/4 v1, 0x3

    .line 36
    invoke-direct {v0, p0, v1}, Ldefpackage/bs2;-><init>(Ldefpackage/ls2;I)V

    .line 37
    .line 38
    .line 39
    iget-object v1, v3, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Ldefpackage/kr2;

    .line 42
    .line 43
    invoke-virtual {v1}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const/4 v3, 0x6

    .line 48
    invoke-virtual {p0, v3, v0, v1, v2}, Ldefpackage/ls2;->I(ILdefpackage/ks2;Ldefpackage/ms2;Z)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final B(J)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ldefpackage/cs2;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, p0, p1, p2, v1}, Ldefpackage/cs2;-><init>(Ldefpackage/ls2;JI)V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 15
    .line 16
    iget-object p1, p1, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p1, Ldefpackage/kr2;

    .line 19
    .line 20
    invoke-virtual {p1}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/4 p2, 0x1

    .line 25
    const/16 v1, 0xa

    .line 26
    .line 27
    invoke-virtual {p0, v1, v0, p1, p2}, Ldefpackage/ls2;->I(ILdefpackage/ks2;Ldefpackage/ms2;Z)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final C()V
    .locals 4

    .line 1
    new-instance v0, Ldefpackage/bs2;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, p0, v1}, Ldefpackage/bs2;-><init>(Ldefpackage/ls2;I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 8
    .line 9
    iget-object v1, v1, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ldefpackage/kr2;

    .line 12
    .line 13
    invoke-virtual {v1}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x1

    .line 18
    const/4 v3, 0x3

    .line 19
    invoke-virtual {p0, v3, v0, v1, v2}, Ldefpackage/ls2;->I(ILdefpackage/ks2;Ldefpackage/ms2;Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final H(Ldefpackage/al3;)Ldefpackage/ei3;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/ls2;->u:Ldefpackage/bk;

    .line 6
    .line 7
    iget-object v3, v0, Ldefpackage/ls2;->v:Landroid/os/Bundle;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    iget-boolean v4, v2, Ldefpackage/bk;->p:Z

    .line 12
    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    new-instance v0, Landroid/os/Bundle;

    .line 16
    .line 17
    iget-object v1, v2, Ldefpackage/bk;->r:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Landroid/os/Bundle;

    .line 20
    .line 21
    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v3}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 25
    .line 26
    .line 27
    new-instance v17, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-direct/range {v17 .. v17}, Ljava/util/ArrayList;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 33
    .line 34
    .line 35
    move-result-wide v15

    .line 36
    iget v13, v2, Ldefpackage/bk;->o:I

    .line 37
    .line 38
    iget-object v0, v2, Ldefpackage/bk;->q:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v14, v0

    .line 41
    check-cast v14, Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-object v0, v2, Ldefpackage/bk;->r:Ljava/lang/Object;

    .line 47
    .line 48
    move-object/from16 v20, v0

    .line 49
    .line 50
    check-cast v20, Landroid/os/Bundle;

    .line 51
    .line 52
    new-instance v4, Ldefpackage/ei3;

    .line 53
    .line 54
    const/4 v5, 0x7

    .line 55
    const-wide/16 v6, -0x1

    .line 56
    .line 57
    const-wide/16 v8, 0x0

    .line 58
    .line 59
    const/4 v10, 0x0

    .line 60
    const-wide/16 v11, 0x0

    .line 61
    .line 62
    const-wide/16 v18, -0x1

    .line 63
    .line 64
    invoke-direct/range {v4 .. v20}, Ldefpackage/ei3;-><init>(IJJFJILjava/lang/CharSequence;JLjava/util/ArrayList;JLandroid/os/Bundle;)V

    .line 65
    .line 66
    .line 67
    return-object v4

    .line 68
    :cond_0
    invoke-virtual {v1}, Ldefpackage/al3;->U()Landroidx/media3/common/PlaybackException;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    const/16 v5, 0x10

    .line 73
    .line 74
    invoke-virtual {v1, v5}, Ldefpackage/al3;->S0(I)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    const/4 v7, 0x1

    .line 79
    if-eqz v5, :cond_1

    .line 80
    .line 81
    invoke-virtual {v1}, Ldefpackage/al3;->V0()Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-nez v5, :cond_1

    .line 86
    .line 87
    move v5, v7

    .line 88
    goto :goto_0

    .line 89
    :cond_1
    const/4 v5, 0x0

    .line 90
    :goto_0
    if-nez v4, :cond_3

    .line 91
    .line 92
    iget-boolean v8, v0, Ldefpackage/ls2;->q:Z

    .line 93
    .line 94
    invoke-static {v1, v8}, Ldefpackage/f35;->d0(Ldefpackage/qi3;Z)Z

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    if-eqz v8, :cond_2

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    const/4 v8, 0x0

    .line 102
    goto :goto_2

    .line 103
    :cond_3
    :goto_1
    move v8, v7

    .line 104
    :goto_2
    const/4 v9, 0x0

    .line 105
    const/4 v10, 0x7

    .line 106
    const/4 v11, 0x2

    .line 107
    const/4 v12, 0x3

    .line 108
    if-eqz v4, :cond_4

    .line 109
    .line 110
    :goto_3
    move v14, v10

    .line 111
    goto :goto_5

    .line 112
    :cond_4
    sget-object v13, Ldefpackage/f92;->a:Ldefpackage/jx1;

    .line 113
    .line 114
    invoke-virtual {v1}, Ldefpackage/al3;->U()Landroidx/media3/common/PlaybackException;

    .line 115
    .line 116
    .line 117
    move-result-object v13

    .line 118
    if-eqz v13, :cond_5

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_5
    invoke-virtual {v1}, Ldefpackage/al3;->g()I

    .line 122
    .line 123
    .line 124
    move-result v10

    .line 125
    if-eq v10, v7, :cond_b

    .line 126
    .line 127
    if-eq v10, v11, :cond_9

    .line 128
    .line 129
    if-eq v10, v12, :cond_7

    .line 130
    .line 131
    const/4 v13, 0x4

    .line 132
    if-ne v10, v13, :cond_6

    .line 133
    .line 134
    move v10, v7

    .line 135
    goto :goto_3

    .line 136
    :cond_6
    const-string v0, "Unrecognized State: "

    .line 137
    .line 138
    invoke-static {v10, v0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-object v9

    .line 146
    :cond_7
    if-eqz v8, :cond_8

    .line 147
    .line 148
    :goto_4
    move v10, v11

    .line 149
    goto :goto_3

    .line 150
    :cond_8
    move v10, v12

    .line 151
    goto :goto_3

    .line 152
    :cond_9
    if-eqz v8, :cond_a

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_a
    const/4 v10, 0x6

    .line 156
    goto :goto_3

    .line 157
    :cond_b
    const/4 v10, 0x0

    .line 158
    goto :goto_3

    .line 159
    :goto_5
    invoke-virtual {v1}, Ldefpackage/al3;->o()Ldefpackage/mi3;

    .line 160
    .line 161
    .line 162
    move-result-object v10

    .line 163
    iget-object v13, v0, Ldefpackage/ls2;->z:Ldefpackage/mi3;

    .line 164
    .line 165
    invoke-static {v13, v10}, Ldefpackage/ju2;->d(Ldefpackage/mi3;Ldefpackage/mi3;)Ldefpackage/mi3;

    .line 166
    .line 167
    .line 168
    move-result-object v10

    .line 169
    const-wide/16 v15, 0x80

    .line 170
    .line 171
    const/4 v13, 0x0

    .line 172
    :goto_6
    iget-object v6, v10, Ldefpackage/mi3;->a:Ldefpackage/w71;

    .line 173
    .line 174
    iget-object v6, v6, Ldefpackage/w71;->a:Landroid/util/SparseBooleanArray;

    .line 175
    .line 176
    invoke-virtual {v6}, Landroid/util/SparseBooleanArray;->size()I

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    if-ge v13, v6, :cond_11

    .line 181
    .line 182
    iget-object v6, v10, Ldefpackage/mi3;->a:Ldefpackage/w71;

    .line 183
    .line 184
    invoke-virtual {v6, v13}, Ldefpackage/w71;->b(I)I

    .line 185
    .line 186
    .line 187
    move-result v6

    .line 188
    if-eq v6, v7, :cond_f

    .line 189
    .line 190
    if-eq v6, v11, :cond_e

    .line 191
    .line 192
    if-eq v6, v12, :cond_d

    .line 193
    .line 194
    const/16 v7, 0x1f

    .line 195
    .line 196
    if-eq v6, v7, :cond_c

    .line 197
    .line 198
    packed-switch v6, :pswitch_data_0

    .line 199
    .line 200
    .line 201
    const-wide/16 v6, 0x0

    .line 202
    .line 203
    goto :goto_7

    .line 204
    :pswitch_0
    const-wide/32 v6, 0x40000

    .line 205
    .line 206
    .line 207
    goto :goto_7

    .line 208
    :pswitch_1
    const-wide/32 v6, 0x280000

    .line 209
    .line 210
    .line 211
    goto :goto_7

    .line 212
    :pswitch_2
    const-wide/32 v6, 0x400000

    .line 213
    .line 214
    .line 215
    goto :goto_7

    .line 216
    :pswitch_3
    const-wide/16 v6, 0x40

    .line 217
    .line 218
    goto :goto_7

    .line 219
    :pswitch_4
    const-wide/16 v6, 0x8

    .line 220
    .line 221
    goto :goto_7

    .line 222
    :pswitch_5
    const-wide/16 v6, 0x1000

    .line 223
    .line 224
    goto :goto_7

    .line 225
    :pswitch_6
    const-wide/16 v6, 0x20

    .line 226
    .line 227
    goto :goto_7

    .line 228
    :pswitch_7
    const-wide/16 v6, 0x10

    .line 229
    .line 230
    goto :goto_7

    .line 231
    :pswitch_8
    const-wide/16 v6, 0x100

    .line 232
    .line 233
    goto :goto_7

    .line 234
    :cond_c
    const-wide/32 v6, 0x3ac00

    .line 235
    .line 236
    .line 237
    goto :goto_7

    .line 238
    :cond_d
    const-wide/16 v6, 0x1

    .line 239
    .line 240
    goto :goto_7

    .line 241
    :cond_e
    const-wide/16 v6, 0x4000

    .line 242
    .line 243
    goto :goto_7

    .line 244
    :cond_f
    if-eqz v8, :cond_10

    .line 245
    .line 246
    const-wide/16 v6, 0x204

    .line 247
    .line 248
    goto :goto_7

    .line 249
    :cond_10
    const-wide/16 v6, 0x202

    .line 250
    .line 251
    :goto_7
    or-long/2addr v15, v6

    .line 252
    add-int/lit8 v13, v13, 0x1

    .line 253
    .line 254
    const/4 v7, 0x1

    .line 255
    goto :goto_6

    .line 256
    :cond_11
    iget-object v6, v0, Ldefpackage/ls2;->x:Ldefpackage/yw1;

    .line 257
    .line 258
    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    if-nez v6, :cond_12

    .line 263
    .line 264
    iget-object v6, v0, Ldefpackage/ls2;->w:Ldefpackage/yw1;

    .line 265
    .line 266
    invoke-static {v6, v11}, Ldefpackage/j60;->c(Ljava/util/List;I)Z

    .line 267
    .line 268
    .line 269
    move-result v6

    .line 270
    if-eqz v6, :cond_12

    .line 271
    .line 272
    const-wide/16 v6, -0x11

    .line 273
    .line 274
    and-long/2addr v15, v6

    .line 275
    :cond_12
    iget-object v6, v0, Ldefpackage/ls2;->x:Ldefpackage/yw1;

    .line 276
    .line 277
    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 278
    .line 279
    .line 280
    move-result v6

    .line 281
    if-nez v6, :cond_13

    .line 282
    .line 283
    iget-object v6, v0, Ldefpackage/ls2;->w:Ldefpackage/yw1;

    .line 284
    .line 285
    invoke-static {v6, v12}, Ldefpackage/j60;->c(Ljava/util/List;I)Z

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    if-eqz v6, :cond_13

    .line 290
    .line 291
    const-wide/16 v6, -0x21

    .line 292
    .line 293
    and-long/2addr v15, v6

    .line 294
    :cond_13
    if-nez v5, :cond_14

    .line 295
    .line 296
    const-wide/16 v6, -0x101

    .line 297
    .line 298
    and-long/2addr v15, v6

    .line 299
    :cond_14
    move-wide/from16 v20, v15

    .line 300
    .line 301
    const/16 v6, 0x11

    .line 302
    .line 303
    invoke-virtual {v1, v6}, Ldefpackage/al3;->S0(I)Z

    .line 304
    .line 305
    .line 306
    move-result v6

    .line 307
    const/4 v7, -0x1

    .line 308
    if-eqz v6, :cond_16

    .line 309
    .line 310
    invoke-virtual {v1}, Ldefpackage/al3;->o0()I

    .line 311
    .line 312
    .line 313
    move-result v6

    .line 314
    sget-object v8, Ldefpackage/f92;->a:Ldefpackage/jx1;

    .line 315
    .line 316
    if-ne v6, v7, :cond_15

    .line 317
    .line 318
    const-wide/16 v11, -0x1

    .line 319
    .line 320
    goto :goto_8

    .line 321
    :cond_15
    int-to-long v11, v6

    .line 322
    :goto_8
    move-wide/from16 v27, v11

    .line 323
    .line 324
    goto :goto_9

    .line 325
    :cond_16
    const-wide/16 v27, -0x1

    .line 326
    .line 327
    :goto_9
    invoke-virtual {v1}, Ldefpackage/al3;->i()Ldefpackage/qh3;

    .line 328
    .line 329
    .line 330
    move-result-object v6

    .line 331
    iget v6, v6, Ldefpackage/qh3;->a:F

    .line 332
    .line 333
    invoke-virtual {v1}, Ldefpackage/al3;->h0()Z

    .line 334
    .line 335
    .line 336
    move-result v8

    .line 337
    if-eqz v8, :cond_17

    .line 338
    .line 339
    if-eqz v5, :cond_17

    .line 340
    .line 341
    move/from16 v19, v6

    .line 342
    .line 343
    goto :goto_a

    .line 344
    :cond_17
    const/4 v8, 0x0

    .line 345
    move/from16 v19, v8

    .line 346
    .line 347
    :goto_a
    new-instance v8, Landroid/os/Bundle;

    .line 348
    .line 349
    if-eqz v4, :cond_18

    .line 350
    .line 351
    iget-object v11, v4, Landroidx/media3/common/PlaybackException;->p:Landroid/os/Bundle;

    .line 352
    .line 353
    invoke-direct {v8, v11}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 354
    .line 355
    .line 356
    goto :goto_b

    .line 357
    :cond_18
    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 358
    .line 359
    .line 360
    :goto_b
    if-nez v4, :cond_19

    .line 361
    .line 362
    if-eqz v2, :cond_19

    .line 363
    .line 364
    iget-object v11, v2, Ldefpackage/bk;->r:Ljava/lang/Object;

    .line 365
    .line 366
    check-cast v11, Landroid/os/Bundle;

    .line 367
    .line 368
    invoke-virtual {v8, v11}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 369
    .line 370
    .line 371
    :cond_19
    invoke-virtual {v8, v3}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 372
    .line 373
    .line 374
    const-string v3, "EXO_SPEED"

    .line 375
    .line 376
    invoke-virtual {v8, v3, v6}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v1}, Ldefpackage/al3;->Y0()Ldefpackage/gn2;

    .line 380
    .line 381
    .line 382
    move-result-object v3

    .line 383
    if-eqz v3, :cond_1a

    .line 384
    .line 385
    iget-object v3, v3, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 386
    .line 387
    const-string v6, ""

    .line 388
    .line 389
    invoke-virtual {v6, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v6

    .line 393
    if-nez v6, :cond_1a

    .line 394
    .line 395
    const-string v6, "androidx.media.PlaybackStateCompat.Extras.KEY_MEDIA_ID"

    .line 396
    .line 397
    invoke-virtual {v8, v6, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 398
    .line 399
    .line 400
    :cond_1a
    if-eqz v5, :cond_1b

    .line 401
    .line 402
    invoke-virtual {v1}, Ldefpackage/al3;->M0()J

    .line 403
    .line 404
    .line 405
    move-result-wide v11

    .line 406
    goto :goto_c

    .line 407
    :cond_1b
    const-wide/16 v11, -0x1

    .line 408
    .line 409
    :goto_c
    if-eqz v5, :cond_1c

    .line 410
    .line 411
    invoke-virtual {v1}, Ldefpackage/al3;->b0()J

    .line 412
    .line 413
    .line 414
    move-result-wide v5

    .line 415
    move-wide v15, v5

    .line 416
    goto :goto_d

    .line 417
    :cond_1c
    const-wide/16 v15, -0x1

    .line 418
    .line 419
    :goto_d
    new-instance v1, Ljava/util/ArrayList;

    .line 420
    .line 421
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 422
    .line 423
    .line 424
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 425
    .line 426
    .line 427
    move-result-wide v24

    .line 428
    const/4 v3, 0x0

    .line 429
    :goto_e
    iget-object v5, v0, Ldefpackage/ls2;->w:Ldefpackage/yw1;

    .line 430
    .line 431
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->size()I

    .line 432
    .line 433
    .line 434
    move-result v5

    .line 435
    if-ge v3, v5, :cond_2c

    .line 436
    .line 437
    iget-object v5, v0, Ldefpackage/ls2;->w:Ldefpackage/yw1;

    .line 438
    .line 439
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v5

    .line 443
    check-cast v5, Ldefpackage/j60;

    .line 444
    .line 445
    iget-object v6, v5, Ldefpackage/j60;->a:Ldefpackage/va4;

    .line 446
    .line 447
    iget-object v13, v5, Ldefpackage/j60;->e:Landroid/net/Uri;

    .line 448
    .line 449
    move-object/from16 v22, v9

    .line 450
    .line 451
    iget v9, v5, Ldefpackage/j60;->c:I

    .line 452
    .line 453
    iget-object v7, v5, Ldefpackage/j60;->g:Landroid/os/Bundle;

    .line 454
    .line 455
    move/from16 v26, v3

    .line 456
    .line 457
    if-eqz v6, :cond_2a

    .line 458
    .line 459
    iget-object v3, v6, Ldefpackage/va4;->c:Landroid/os/Bundle;

    .line 460
    .line 461
    move-object/from16 v29, v8

    .line 462
    .line 463
    iget-object v8, v6, Ldefpackage/va4;->b:Ljava/lang/String;

    .line 464
    .line 465
    move-wide/from16 v30, v11

    .line 466
    .line 467
    iget-boolean v11, v5, Ldefpackage/j60;->i:Z

    .line 468
    .line 469
    if-eqz v11, :cond_2b

    .line 470
    .line 471
    iget v11, v6, Ldefpackage/va4;->a:I

    .line 472
    .line 473
    if-nez v11, :cond_2b

    .line 474
    .line 475
    iget-object v11, v0, Ldefpackage/ls2;->y:Ldefpackage/wa4;

    .line 476
    .line 477
    if-eqz v6, :cond_1e

    .line 478
    .line 479
    iget-object v11, v11, Ldefpackage/wa4;->a:Ldefpackage/jx1;

    .line 480
    .line 481
    invoke-virtual {v11, v6}, Ldefpackage/rw1;->contains(Ljava/lang/Object;)Z

    .line 482
    .line 483
    .line 484
    move-result v6

    .line 485
    if-nez v6, :cond_1d

    .line 486
    .line 487
    goto :goto_f

    .line 488
    :cond_1d
    const/4 v11, -0x1

    .line 489
    goto :goto_10

    .line 490
    :cond_1e
    :goto_f
    iget v6, v5, Ldefpackage/j60;->b:I

    .line 491
    .line 492
    const/4 v11, -0x1

    .line 493
    if-eq v6, v11, :cond_1f

    .line 494
    .line 495
    invoke-virtual {v10, v6}, Ldefpackage/mi3;->a(I)Z

    .line 496
    .line 497
    .line 498
    move-result v6

    .line 499
    if-eqz v6, :cond_1f

    .line 500
    .line 501
    goto :goto_10

    .line 502
    :cond_1f
    invoke-static {v8}, Ldefpackage/j60;->n(Ljava/lang/String;)Z

    .line 503
    .line 504
    .line 505
    move-result v6

    .line 506
    if-eqz v6, :cond_2b

    .line 507
    .line 508
    :goto_10
    if-eqz v9, :cond_20

    .line 509
    .line 510
    const/4 v6, 0x1

    .line 511
    goto :goto_11

    .line 512
    :cond_20
    const/4 v6, 0x0

    .line 513
    :goto_11
    if-eqz v13, :cond_21

    .line 514
    .line 515
    const/4 v12, 0x1

    .line 516
    goto :goto_12

    .line 517
    :cond_21
    const/4 v12, 0x0

    .line 518
    :goto_12
    if-nez v6, :cond_22

    .line 519
    .line 520
    if-nez v12, :cond_22

    .line 521
    .line 522
    invoke-virtual {v7}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 523
    .line 524
    .line 525
    move-result v23

    .line 526
    if-nez v23, :cond_23

    .line 527
    .line 528
    :cond_22
    new-instance v11, Landroid/os/Bundle;

    .line 529
    .line 530
    invoke-direct {v11, v3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 531
    .line 532
    .line 533
    move-object v3, v11

    .line 534
    :cond_23
    invoke-virtual {v7}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 535
    .line 536
    .line 537
    move-result v11

    .line 538
    if-nez v11, :cond_24

    .line 539
    .line 540
    invoke-virtual {v3, v7}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 541
    .line 542
    .line 543
    :cond_24
    if-eqz v6, :cond_25

    .line 544
    .line 545
    const-string v6, "androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT"

    .line 546
    .line 547
    invoke-virtual {v3, v6, v9}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 548
    .line 549
    .line 550
    :cond_25
    if-eqz v12, :cond_26

    .line 551
    .line 552
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v13}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v6

    .line 559
    const-string v7, "androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT"

    .line 560
    .line 561
    invoke-virtual {v3, v7, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 562
    .line 563
    .line 564
    :cond_26
    iget-object v6, v5, Ldefpackage/j60;->f:Ljava/lang/CharSequence;

    .line 565
    .line 566
    iget v5, v5, Ldefpackage/j60;->d:I

    .line 567
    .line 568
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 569
    .line 570
    .line 571
    move-result v7

    .line 572
    if-nez v7, :cond_29

    .line 573
    .line 574
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 575
    .line 576
    .line 577
    move-result v7

    .line 578
    if-nez v7, :cond_28

    .line 579
    .line 580
    if-eqz v5, :cond_27

    .line 581
    .line 582
    new-instance v7, Ldefpackage/di3;

    .line 583
    .line 584
    invoke-direct {v7, v8, v6, v5, v3}, Ldefpackage/di3;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;ILandroid/os/Bundle;)V

    .line 585
    .line 586
    .line 587
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    goto :goto_13

    .line 591
    :cond_27
    const-string v0, "You must specify an icon resource id to build a CustomAction"

    .line 592
    .line 593
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 594
    .line 595
    .line 596
    return-object v22

    .line 597
    :cond_28
    const-string v0, "You must specify a name to build a CustomAction"

    .line 598
    .line 599
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    return-object v22

    .line 603
    :cond_29
    const-string v0, "You must specify an action to build a CustomAction"

    .line 604
    .line 605
    invoke-static {v0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 606
    .line 607
    .line 608
    return-object v22

    .line 609
    :cond_2a
    move-object/from16 v29, v8

    .line 610
    .line 611
    move-wide/from16 v30, v11

    .line 612
    .line 613
    :cond_2b
    :goto_13
    add-int/lit8 v3, v26, 0x1

    .line 614
    .line 615
    move-object/from16 v9, v22

    .line 616
    .line 617
    move-object/from16 v8, v29

    .line 618
    .line 619
    move-wide/from16 v11, v30

    .line 620
    .line 621
    const/4 v7, -0x1

    .line 622
    goto/16 :goto_e

    .line 623
    .line 624
    :cond_2c
    move-object/from16 v29, v8

    .line 625
    .line 626
    move-object/from16 v22, v9

    .line 627
    .line 628
    move-wide/from16 v30, v11

    .line 629
    .line 630
    if-eqz v4, :cond_2d

    .line 631
    .line 632
    sget-object v0, Ldefpackage/f92;->a:Ldefpackage/jx1;

    .line 633
    .line 634
    iget v0, v4, Landroidx/media3/common/PlaybackException;->n:I

    .line 635
    .line 636
    invoke-static {v0}, Ldefpackage/f92;->g(I)I

    .line 637
    .line 638
    .line 639
    move-result v6

    .line 640
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v9

    .line 644
    :goto_14
    move/from16 v22, v6

    .line 645
    .line 646
    move-object/from16 v23, v9

    .line 647
    .line 648
    goto :goto_15

    .line 649
    :cond_2d
    if-eqz v2, :cond_2e

    .line 650
    .line 651
    iget v6, v2, Ldefpackage/bk;->o:I

    .line 652
    .line 653
    iget-object v0, v2, Ldefpackage/bk;->q:Ljava/lang/Object;

    .line 654
    .line 655
    move-object v9, v0

    .line 656
    check-cast v9, Ljava/lang/String;

    .line 657
    .line 658
    goto :goto_14

    .line 659
    :cond_2e
    move-object/from16 v23, v22

    .line 660
    .line 661
    const/16 v22, 0x0

    .line 662
    .line 663
    :goto_15
    new-instance v13, Ldefpackage/ei3;

    .line 664
    .line 665
    move-object/from16 v26, v1

    .line 666
    .line 667
    move-wide/from16 v17, v15

    .line 668
    .line 669
    move-wide/from16 v15, v30

    .line 670
    .line 671
    invoke-direct/range {v13 .. v29}, Ldefpackage/ei3;-><init>(IJJFJILjava/lang/CharSequence;JLjava/util/ArrayList;JLandroid/os/Bundle;)V

    .line 672
    .line 673
    .line 674
    return-object v13

    .line 675
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final I(ILdefpackage/ks2;Ldefpackage/ms2;Z)V
    .locals 7

    .line 1
    iget-object v0, p0, Ldefpackage/ls2;->g:Ldefpackage/tn2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/tn2;->l()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    if-nez p3, :cond_1

    .line 11
    .line 12
    new-instance p0, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string p2, "RemoteUserInfo is null, ignoring command="

    .line 15
    .line 16
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string p1, "MediaSessionLegacyStub"

    .line 27
    .line 28
    invoke-static {p1, p0}, Ldefpackage/l93;->A(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    iget-object v0, v0, Ldefpackage/tn2;->l:Landroid/os/Handler;

    .line 33
    .line 34
    new-instance v1, Ldefpackage/as2;

    .line 35
    .line 36
    move-object v2, p0

    .line 37
    move v3, p1

    .line 38
    move-object v5, p2

    .line 39
    move-object v4, p3

    .line 40
    move v6, p4

    .line 41
    invoke-direct/range {v1 .. v6}, Ldefpackage/as2;-><init>(Ldefpackage/ls2;ILdefpackage/ms2;Ldefpackage/ks2;Z)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v1}, Ldefpackage/f35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final J(Ldefpackage/va4;ILdefpackage/ks2;Ldefpackage/ms2;)V
    .locals 7

    .line 1
    if-nez p4, :cond_1

    .line 2
    .line 3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string p3, "RemoteUserInfo is null, ignoring command="

    .line 6
    .line 7
    invoke-direct {p0, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string p1, "MediaSessionLegacyStub"

    .line 24
    .line 25
    invoke-static {p1, p0}, Ldefpackage/l93;->A(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    iget-object v0, p0, Ldefpackage/ls2;->g:Ldefpackage/tn2;

    .line 30
    .line 31
    iget-object v0, v0, Ldefpackage/tn2;->l:Landroid/os/Handler;

    .line 32
    .line 33
    new-instance v1, Ldefpackage/fm2;

    .line 34
    .line 35
    move-object v2, p0

    .line 36
    move-object v3, p1

    .line 37
    move v4, p2

    .line 38
    move-object v6, p3

    .line 39
    move-object v5, p4

    .line 40
    invoke-direct/range {v1 .. v6}, Ldefpackage/fm2;-><init>(Ldefpackage/ls2;Ldefpackage/va4;ILdefpackage/ms2;Ldefpackage/ks2;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1}, Ldefpackage/f35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final L(Ldefpackage/gn2;ZZ)V
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/tr2;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, Ldefpackage/tr2;-><init>(Ldefpackage/ls2;Ldefpackage/gn2;ZZ)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 7
    .line 8
    iget-object p1, p1, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Ldefpackage/kr2;

    .line 11
    .line 12
    invoke-virtual {p1}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const/4 p2, 0x0

    .line 17
    const/16 p3, 0x1f

    .line 18
    .line 19
    invoke-virtual {p0, p3, v0, p1, p2}, Ldefpackage/ls2;->I(ILdefpackage/ks2;Ldefpackage/ms2;Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final M(Ldefpackage/ms2;)Ldefpackage/fr2;
    .locals 8

    .line 1
    iget-object v0, p0, Ldefpackage/ls2;->f:Ldefpackage/na4;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ldefpackage/na4;->w(Ljava/lang/Object;)Ldefpackage/fr2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    new-instance v6, Ldefpackage/js2;

    .line 10
    .line 11
    invoke-direct {v6, p1}, Ldefpackage/js2;-><init>(Ldefpackage/ms2;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Ldefpackage/fr2;

    .line 15
    .line 16
    iget-object v0, p0, Ldefpackage/ls2;->h:Ldefpackage/hg3;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ldefpackage/hg3;->G(Ldefpackage/ms2;)Z

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    sget-object v7, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    const/4 v4, 0x0

    .line 26
    move-object v2, p1

    .line 27
    invoke-direct/range {v1 .. v7}, Ldefpackage/fr2;-><init>(Ldefpackage/ms2;IIZLdefpackage/er2;Landroid/os/Bundle;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Ldefpackage/ls2;->g:Ldefpackage/tn2;

    .line 31
    .line 32
    invoke-virtual {p1, v1}, Ldefpackage/tn2;->p(Ldefpackage/fr2;)Ldefpackage/dr2;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object v0, p0, Ldefpackage/ls2;->f:Ldefpackage/na4;

    .line 37
    .line 38
    iget-object v3, p1, Ldefpackage/dr2;->a:Ldefpackage/wa4;

    .line 39
    .line 40
    iget-object p1, p1, Ldefpackage/dr2;->b:Ldefpackage/mi3;

    .line 41
    .line 42
    invoke-virtual {v0, v2, v1, v3, p1}, Ldefpackage/na4;->a(Ljava/lang/Object;Ldefpackage/fr2;Ldefpackage/wa4;Ldefpackage/mi3;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Ldefpackage/ls2;->g:Ldefpackage/tn2;

    .line 46
    .line 47
    iget-boolean v0, p1, Ldefpackage/tn2;->y:Z

    .line 48
    .line 49
    if-eqz v0, :cond_0

    .line 50
    .line 51
    invoke-static {v1}, Ldefpackage/tn2;->m(Ldefpackage/fr2;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    iget-object p1, p1, Ldefpackage/tn2;->e:Ldefpackage/pq;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    :goto_0
    move-object v0, v1

    .line 64
    :cond_1
    iget-object p1, p0, Ldefpackage/ls2;->j:Ldefpackage/zk;

    .line 65
    .line 66
    iget-wide v1, p0, Ldefpackage/ls2;->r:J

    .line 67
    .line 68
    const/16 p0, 0x3e9

    .line 69
    .line 70
    invoke-virtual {p1, p0, v0}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, p0, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p1, p0, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 78
    .line 79
    .line 80
    return-object v0
.end method

.method public final N()V
    .locals 7

    .line 1
    iget-object v0, p0, Ldefpackage/ls2;->x:Ldefpackage/yw1;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/ls2;->y:Ldefpackage/wa4;

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/ls2;->z:Ldefpackage/mi3;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Ldefpackage/j60;->g(Ljava/util/List;Ldefpackage/wa4;Ldefpackage/mi3;)Ldefpackage/gy3;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-static {v0, v1, v1}, Ldefpackage/j60;->j(Ljava/util/List;ZZ)Ldefpackage/gy3;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Ldefpackage/ls2;->w:Ldefpackage/yw1;

    .line 17
    .line 18
    iget-boolean v0, p0, Ldefpackage/ls2;->k:Z

    .line 19
    .line 20
    const-string v2, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT"

    .line 21
    .line 22
    const-string v3, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS"

    .line 23
    .line 24
    const/4 v4, 0x2

    .line 25
    iget-object v5, p0, Ldefpackage/ls2;->v:Landroid/os/Bundle;

    .line 26
    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v0, p0, Ldefpackage/ls2;->l:Ldefpackage/w9;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v0, v0, Ldefpackage/w9;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    :goto_0
    iget-object v0, p0, Ldefpackage/ls2;->w:Ldefpackage/yw1;

    .line 44
    .line 45
    invoke-static {v0, v4}, Ldefpackage/j60;->c(Ljava/util/List;I)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    xor-int/2addr v0, v1

    .line 50
    invoke-virtual {v5, v3, v0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, Ldefpackage/ls2;->w:Ldefpackage/yw1;

    .line 54
    .line 55
    const/4 v0, 0x3

    .line 56
    invoke-static {p0, v0}, Ldefpackage/j60;->c(Ljava/util/List;I)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    xor-int/2addr p0, v1

    .line 61
    invoke-virtual {v5, v2, p0}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_2
    :goto_1
    iget-object v0, p0, Ldefpackage/ls2;->w:Ldefpackage/yw1;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const/4 v6, 0x0

    .line 72
    if-nez v0, :cond_3

    .line 73
    .line 74
    iget-object p0, p0, Ldefpackage/ls2;->w:Ldefpackage/yw1;

    .line 75
    .line 76
    invoke-static {p0, v4}, Ldefpackage/j60;->c(Ljava/util/List;I)Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-nez p0, :cond_3

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    move v1, v6

    .line 84
    :goto_2
    invoke-virtual {v5, v3, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v5, v2, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public final O()V
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/ls2;->v:Landroid/os/Bundle;

    .line 2
    .line 3
    const-string v1, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    const-string v4, "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT"

    .line 11
    .line 12
    invoke-virtual {v0, v4, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result v5

    .line 16
    invoke-virtual {p0}, Ldefpackage/ls2;->N()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-ne v1, v3, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0, v4, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eq v1, v5, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void

    .line 33
    :cond_1
    :goto_0
    iget-object p0, p0, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 34
    .line 35
    iget-object p0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Ldefpackage/kr2;

    .line 38
    .line 39
    iget-object p0, p0, Ldefpackage/kr2;->a:Landroid/media/session/MediaSession;

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Landroid/media/session/MediaSession;->setExtras(Landroid/os/Bundle;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final P(Ldefpackage/al3;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/ls2;->g:Ldefpackage/tn2;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/tn2;->l:Landroid/os/Handler;

    .line 4
    .line 5
    new-instance v1, Ldefpackage/ds2;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, p0, p1, v2}, Ldefpackage/ds2;-><init>(Ldefpackage/ls2;Ldefpackage/al3;I)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Ldefpackage/f35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final c(Ldefpackage/pm2;)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Ldefpackage/vl2;

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    const/4 v2, -0x1

    .line 7
    invoke-direct {v0, p0, p1, v2, v1}, Ldefpackage/vl2;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 11
    .line 12
    iget-object p1, p1, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Ldefpackage/kr2;

    .line 15
    .line 16
    invoke-virtual {p1}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/4 v1, 0x0

    .line 21
    const/16 v2, 0x14

    .line 22
    .line 23
    invoke-virtual {p0, v2, v0, p1, v1}, Ldefpackage/ls2;->I(ILdefpackage/ks2;Ldefpackage/ms2;Z)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public final d(Ldefpackage/pm2;I)V
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    if-eq p2, v0, :cond_0

    .line 5
    .line 6
    if-gez p2, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v0, Ldefpackage/vl2;

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    invoke-direct {v0, p0, p1, p2, v1}, Ldefpackage/vl2;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 16
    .line 17
    iget-object p1, p1, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p1, Ldefpackage/kr2;

    .line 20
    .line 21
    invoke-virtual {p1}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 p2, 0x0

    .line 26
    const/16 v1, 0x14

    .line 27
    .line 28
    invoke-virtual {p0, v1, v0, p1, p2}, Ldefpackage/ls2;->I(ILdefpackage/ks2;Ldefpackage/ms2;Z)V

    .line 29
    .line 30
    .line 31
    :cond_1
    :goto_0
    return-void
.end method

.method public final e(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V
    .locals 8

    .line 1
    const-string v0, "androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    const-string v0, "androidx.media3.session.SESSION_COMMAND_REQUEST_SESSION3_TOKEN"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    if-eqz p3, :cond_1

    .line 20
    .line 21
    iget-object p0, p0, Ldefpackage/ls2;->g:Ldefpackage/tn2;

    .line 22
    .line 23
    iget-object p0, p0, Ldefpackage/tn2;->j:Ldefpackage/cb4;

    .line 24
    .line 25
    invoke-virtual {p0}, Ldefpackage/cb4;->b()Landroid/os/Bundle;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p3, v1, p0}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    new-instance v4, Ldefpackage/va4;

    .line 34
    .line 35
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 36
    .line 37
    invoke-direct {v4, p1, v0}, Ldefpackage/va4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 38
    .line 39
    .line 40
    new-instance v2, Ldefpackage/dg0;

    .line 41
    .line 42
    const/4 v7, 0x6

    .line 43
    move-object v3, p0

    .line 44
    move-object v5, p2

    .line 45
    move-object v6, p3

    .line 46
    invoke-direct/range {v2 .. v7}, Ldefpackage/dg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    iget-object p0, v3, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 50
    .line 51
    iget-object p0, p0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, Ldefpackage/kr2;

    .line 54
    .line 55
    invoke-virtual {p0}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {v3, v4, v1, v2, p0}, Ldefpackage/ls2;->J(Ldefpackage/va4;ILdefpackage/ks2;Ldefpackage/ms2;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final f(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 6

    .line 1
    const-string v0, "androidx.media3.session.SESSION_COMMAND_MEDIA3_PLAY_REQUEST"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    if-eqz p2, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    sget-object p2, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 14
    .line 15
    :goto_0
    new-instance v0, Ldefpackage/va4;

    .line 16
    .line 17
    invoke-direct {v0, p1, p2}, Ldefpackage/va4;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Ldefpackage/j60;->n(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iget-object v2, p0, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    if-eqz v1, :cond_a

    .line 28
    .line 29
    const-string p2, "MediaSessionLegacyStub"

    .line 30
    .line 31
    :try_start_0
    invoke-static {v0}, Ldefpackage/j60;->d(Ldefpackage/va4;)Ldefpackage/j60;

    .line 32
    .line 33
    .line 34
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    iget v1, v0, Ldefpackage/j60;->b:I

    .line 36
    .line 37
    iget-object v4, v0, Ldefpackage/j60;->j:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-virtual {v0}, Ldefpackage/j60;->b()Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-nez v5, :cond_2

    .line 44
    .line 45
    const-string p0, "Can\'t execute predefined custom command: "

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {p2, p0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_2
    iget-object p1, v0, Ldefpackage/j60;->a:Ldefpackage/va4;

    .line 56
    .line 57
    const/4 p2, 0x1

    .line 58
    if-eqz p1, :cond_4

    .line 59
    .line 60
    iget p1, p1, Ldefpackage/va4;->a:I

    .line 61
    .line 62
    const v0, 0x9c4a

    .line 63
    .line 64
    .line 65
    if-ne p1, v0, :cond_3

    .line 66
    .line 67
    move v3, p2

    .line 68
    :cond_3
    invoke-static {v3}, Ldefpackage/rr2;->w(Z)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    check-cast v4, Ldefpackage/lu3;

    .line 75
    .line 76
    new-instance p1, Ldefpackage/ef0;

    .line 77
    .line 78
    const/16 p2, 0x14

    .line 79
    .line 80
    invoke-direct {p1, p2, p0, v4}, Ldefpackage/ef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget-object p2, v2, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p2, Ldefpackage/kr2;

    .line 86
    .line 87
    invoke-virtual {p2}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    const/4 v1, 0x0

    .line 92
    invoke-virtual {p0, v1, v0, p1, p2}, Ldefpackage/ls2;->J(Ldefpackage/va4;ILdefpackage/ks2;Ldefpackage/ms2;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :cond_4
    iget-object p1, p0, Ldefpackage/ls2;->g:Ldefpackage/tn2;

    .line 97
    .line 98
    iget-object p1, p1, Ldefpackage/tn2;->s:Ldefpackage/al3;

    .line 99
    .line 100
    if-eq v1, p2, :cond_6

    .line 101
    .line 102
    :cond_5
    move p1, v3

    .line 103
    goto :goto_1

    .line 104
    :cond_6
    if-nez v4, :cond_7

    .line 105
    .line 106
    invoke-virtual {p1}, Ldefpackage/al3;->q()Z

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-nez p1, :cond_5

    .line 111
    .line 112
    move p1, p2

    .line 113
    goto :goto_1

    .line 114
    :cond_7
    move-object p1, v4

    .line 115
    check-cast p1, Ljava/lang/Boolean;

    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 118
    .line 119
    .line 120
    move-result p1

    .line 121
    :goto_1
    if-eqz p1, :cond_8

    .line 122
    .line 123
    new-instance p1, Ldefpackage/bs2;

    .line 124
    .line 125
    const/4 v0, 0x5

    .line 126
    invoke-direct {p1, p0, v0}, Ldefpackage/bs2;-><init>(Ldefpackage/ls2;I)V

    .line 127
    .line 128
    .line 129
    iget-object v0, v2, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, Ldefpackage/kr2;

    .line 132
    .line 133
    invoke-virtual {v0}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {p0, p2, p1, v0, v3}, Ldefpackage/ls2;->I(ILdefpackage/ks2;Ldefpackage/ms2;Z)V

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :cond_8
    const/16 p1, 0x1f

    .line 142
    .line 143
    if-ne v1, p1, :cond_9

    .line 144
    .line 145
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    check-cast v4, Ldefpackage/gn2;

    .line 149
    .line 150
    invoke-virtual {p0, v4, v3, v3}, Ldefpackage/ls2;->L(Ldefpackage/gn2;ZZ)V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :cond_9
    new-instance p1, Ldefpackage/ef0;

    .line 155
    .line 156
    const/16 v3, 0x15

    .line 157
    .line 158
    invoke-direct {p1, v3, p0, v0}, Ldefpackage/ef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    iget-object v0, v2, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 162
    .line 163
    check-cast v0, Ldefpackage/kr2;

    .line 164
    .line 165
    invoke-virtual {v0}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {p0, v1, p1, v0, p2}, Ldefpackage/ls2;->I(ILdefpackage/ks2;Ldefpackage/ms2;Z)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :catch_0
    move-exception p0

    .line 174
    new-instance p1, Ljava/lang/StringBuilder;

    .line 175
    .line 176
    const-string v1, "Failed to convert predefined custom command: "

    .line 177
    .line 178
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    iget-object v0, v0, Ldefpackage/va4;->b:Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p1

    .line 190
    invoke-static {p2, p1, p0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :cond_a
    new-instance p1, Ldefpackage/eg0;

    .line 195
    .line 196
    const/4 v1, 0x7

    .line 197
    invoke-direct {p1, p0, v0, p2, v1}, Ldefpackage/eg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 198
    .line 199
    .line 200
    iget-object p2, v2, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast p2, Ldefpackage/kr2;

    .line 203
    .line 204
    invoke-virtual {p2}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 205
    .line 206
    .line 207
    move-result-object p2

    .line 208
    invoke-virtual {p0, v0, v3, p1, p2}, Ldefpackage/ls2;->J(Ldefpackage/va4;ILdefpackage/ks2;Ldefpackage/ms2;)V

    .line 209
    .line 210
    .line 211
    return-void
.end method

.method public final g()V
    .locals 4

    .line 1
    new-instance v0, Ldefpackage/bs2;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Ldefpackage/bs2;-><init>(Ldefpackage/ls2;I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 9
    .line 10
    iget-object v1, v1, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Ldefpackage/kr2;

    .line 13
    .line 14
    invoke-virtual {v1}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const/4 v2, 0x1

    .line 19
    const/16 v3, 0xc

    .line 20
    .line 21
    invoke-virtual {p0, v3, v0, v1, v2}, Ldefpackage/ls2;->I(ILdefpackage/ks2;Ldefpackage/ms2;Z)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final h(Landroid/content/Intent;)Z
    .locals 7

    .line 1
    new-instance v0, Ldefpackage/fr2;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 4
    .line 5
    iget-object v1, v1, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ldefpackage/kr2;

    .line 8
    .line 9
    invoke-virtual {v1}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    sget-object v6, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct/range {v0 .. v6}, Ldefpackage/fr2;-><init>(Ldefpackage/ms2;IIZLdefpackage/er2;Landroid/os/Bundle;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Ldefpackage/ls2;->g:Ldefpackage/tn2;

    .line 26
    .line 27
    invoke-virtual {p0, v0, p1}, Ldefpackage/tn2;->t(Ldefpackage/fr2;Landroid/content/Intent;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    return p0
.end method

.method public final i()V
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/bs2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Ldefpackage/bs2;-><init>(Ldefpackage/ls2;I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 8
    .line 9
    iget-object v1, v1, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ldefpackage/kr2;

    .line 12
    .line 13
    invoke-virtual {v1}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {p0, v2, v0, v1, v2}, Ldefpackage/ls2;->I(ILdefpackage/ks2;Ldefpackage/ms2;Z)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final j()V
    .locals 4

    .line 1
    new-instance v0, Ldefpackage/bs2;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, p0, v1}, Ldefpackage/bs2;-><init>(Ldefpackage/ls2;I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 8
    .line 9
    iget-object v1, v1, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ldefpackage/kr2;

    .line 12
    .line 13
    invoke-virtual {v1}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    invoke-virtual {p0, v3, v0, v1, v2}, Ldefpackage/ls2;->I(ILdefpackage/ks2;Ldefpackage/ms2;Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final k(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0, v0, p2}, Ldefpackage/ls2;->G(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Ldefpackage/gn2;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    const/4 p2, 0x1

    .line 7
    invoke-virtual {p0, p1, p2, p2}, Ldefpackage/ls2;->L(Ldefpackage/gn2;ZZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final l(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, v0, p1, p2}, Ldefpackage/ls2;->G(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Ldefpackage/gn2;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    const/4 p2, 0x1

    .line 7
    invoke-virtual {p0, p1, p2, p2}, Ldefpackage/ls2;->L(Ldefpackage/gn2;ZZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final m(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p1, v0, p2}, Ldefpackage/ls2;->G(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Ldefpackage/gn2;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    const/4 p2, 0x1

    .line 7
    invoke-virtual {p0, p1, p2, p2}, Ldefpackage/ls2;->L(Ldefpackage/gn2;ZZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final n()V
    .locals 4

    .line 1
    new-instance v0, Ldefpackage/bs2;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, p0, v1}, Ldefpackage/bs2;-><init>(Ldefpackage/ls2;I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 8
    .line 9
    iget-object v1, v1, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ldefpackage/kr2;

    .line 12
    .line 13
    invoke-virtual {v1}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x1

    .line 18
    const/4 v3, 0x2

    .line 19
    invoke-virtual {p0, v3, v0, v1, v2}, Ldefpackage/ls2;->I(ILdefpackage/ks2;Ldefpackage/ms2;Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final o(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0, v0, p2}, Ldefpackage/ls2;->G(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Ldefpackage/gn2;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    const/4 p2, 0x0

    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, p1, v0, p2}, Ldefpackage/ls2;->L(Ldefpackage/gn2;ZZ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final p(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, v0, p1, p2}, Ldefpackage/ls2;->G(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Ldefpackage/gn2;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    const/4 p2, 0x0

    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, p1, v0, p2}, Ldefpackage/ls2;->L(Ldefpackage/gn2;ZZ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final q(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p1, v0, p2}, Ldefpackage/ls2;->G(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Ldefpackage/gn2;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    const/4 p2, 0x0

    .line 7
    const/4 v0, 0x1

    .line 8
    invoke-virtual {p0, p1, v0, p2}, Ldefpackage/ls2;->L(Ldefpackage/gn2;ZZ)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final r(Ldefpackage/pm2;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Ldefpackage/ef0;

    .line 5
    .line 6
    const/16 v1, 0x16

    .line 7
    .line 8
    invoke-direct {v0, v1, p0, p1}, Ldefpackage/ef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 12
    .line 13
    iget-object p1, p1, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Ldefpackage/kr2;

    .line 16
    .line 17
    invoke-virtual {p1}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const/4 v1, 0x1

    .line 22
    const/16 v2, 0x14

    .line 23
    .line 24
    invoke-virtual {p0, v2, v0, p1, v1}, Ldefpackage/ls2;->I(ILdefpackage/ks2;Ldefpackage/ms2;Z)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final s()V
    .locals 4

    .line 1
    new-instance v0, Ldefpackage/bs2;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, p0, v1}, Ldefpackage/bs2;-><init>(Ldefpackage/ls2;I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 8
    .line 9
    iget-object v1, v1, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ldefpackage/kr2;

    .line 12
    .line 13
    invoke-virtual {v1}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x1

    .line 18
    const/16 v3, 0xb

    .line 19
    .line 20
    invoke-virtual {p0, v3, v0, v1, v2}, Ldefpackage/ls2;->I(ILdefpackage/ks2;Ldefpackage/ms2;Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final t(J)V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/cs2;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, p1, p2, v1}, Ldefpackage/cs2;-><init>(Ldefpackage/ls2;JI)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 8
    .line 9
    iget-object p1, p1, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Ldefpackage/kr2;

    .line 12
    .line 13
    invoke-virtual {p1}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 p2, 0x1

    .line 18
    const/4 v1, 0x5

    .line 19
    invoke-virtual {p0, v1, v0, p1, p2}, Ldefpackage/ls2;->I(ILdefpackage/ks2;Ldefpackage/ms2;Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final u(F)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpl-float v0, p1, v0

    .line 3
    .line 4
    if-gtz v0, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    new-instance v0, Ldefpackage/rl2;

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    invoke-direct {v0, p0, p1, v1}, Ldefpackage/rl2;-><init>(Ljava/lang/Object;FI)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 14
    .line 15
    iget-object p1, p1, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Ldefpackage/kr2;

    .line 18
    .line 19
    invoke-virtual {p1}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    const/4 v1, 0x1

    .line 24
    const/16 v2, 0xd

    .line 25
    .line 26
    invoke-virtual {p0, v2, v0, p1, v1}, Ldefpackage/ls2;->I(ILdefpackage/ks2;Ldefpackage/ms2;Z)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final v(Ldefpackage/mu3;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ldefpackage/ls2;->w(Ldefpackage/mu3;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final w(Ldefpackage/mu3;)V
    .locals 3

    .line 1
    invoke-static {p1}, Ldefpackage/f92;->q(Ldefpackage/mu3;)Ldefpackage/lu3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance p0, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v0, "Ignoring invalid RatingCompat "

    .line 10
    .line 11
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "MediaSessionLegacyStub"

    .line 22
    .line 23
    invoke-static {p1, p0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    new-instance p1, Ldefpackage/ef0;

    .line 28
    .line 29
    const/16 v1, 0x14

    .line 30
    .line 31
    invoke-direct {p1, v1, p0, v0}, Ldefpackage/ef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 35
    .line 36
    iget-object v0, v0, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, Ldefpackage/kr2;

    .line 39
    .line 40
    invoke-virtual {v0}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/4 v1, 0x0

    .line 45
    const v2, 0x9c4a

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v1, v2, p1, v0}, Ldefpackage/ls2;->J(Ldefpackage/va4;ILdefpackage/ks2;Ldefpackage/ms2;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final x(I)V
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/fs2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, Ldefpackage/fs2;-><init>(Ldefpackage/ls2;II)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 8
    .line 9
    iget-object p1, p1, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Ldefpackage/kr2;

    .line 12
    .line 13
    invoke-virtual {p1}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v1, 0x1

    .line 18
    const/16 v2, 0xf

    .line 19
    .line 20
    invoke-virtual {p0, v2, v0, p1, v1}, Ldefpackage/ls2;->I(ILdefpackage/ks2;Ldefpackage/ms2;Z)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final y(I)V
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/fs2;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, p0, p1, v1}, Ldefpackage/fs2;-><init>(Ldefpackage/ls2;II)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 8
    .line 9
    iget-object p1, p1, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p1, Ldefpackage/kr2;

    .line 12
    .line 13
    invoke-virtual {p1}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/16 v2, 0xe

    .line 18
    .line 19
    invoke-virtual {p0, v2, v0, p1, v1}, Ldefpackage/ls2;->I(ILdefpackage/ks2;Ldefpackage/ms2;Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final z()V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/ls2;->g:Ldefpackage/tn2;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/tn2;->s:Ldefpackage/al3;

    .line 4
    .line 5
    const/16 v1, 0x9

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ldefpackage/al3;->S0(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v2, 0x1

    .line 12
    iget-object v3, p0, Ldefpackage/ls2;->m:Ldefpackage/qr2;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    new-instance v0, Ldefpackage/bs2;

    .line 17
    .line 18
    const/16 v4, 0x8

    .line 19
    .line 20
    invoke-direct {v0, p0, v4}, Ldefpackage/bs2;-><init>(Ldefpackage/ls2;I)V

    .line 21
    .line 22
    .line 23
    iget-object v3, v3, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Ldefpackage/kr2;

    .line 26
    .line 27
    invoke-virtual {v3}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {p0, v1, v0, v3, v2}, Ldefpackage/ls2;->I(ILdefpackage/ks2;Ldefpackage/ms2;Z)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    new-instance v0, Ldefpackage/bs2;

    .line 36
    .line 37
    const/16 v1, 0x9

    .line 38
    .line 39
    invoke-direct {v0, p0, v1}, Ldefpackage/bs2;-><init>(Ldefpackage/ls2;I)V

    .line 40
    .line 41
    .line 42
    iget-object v1, v3, Ldefpackage/qr2;->o:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v1, Ldefpackage/kr2;

    .line 45
    .line 46
    invoke-virtual {v1}, Ldefpackage/kr2;->b()Ldefpackage/ms2;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const/16 v3, 0x8

    .line 51
    .line 52
    invoke-virtual {p0, v3, v0, v1, v2}, Ldefpackage/ls2;->I(ILdefpackage/ks2;Ldefpackage/ms2;Z)V

    .line 53
    .line 54
    .line 55
    return-void
.end method
