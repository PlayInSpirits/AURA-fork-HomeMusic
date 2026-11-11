.class public final synthetic Lqg0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# instance fields
.field public final synthetic a:Ljava/lang/Thread$UncaughtExceptionHandler;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqg0;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 12

    .line 1
    sget-object v0, Lsg0;->a:Landroid/app/Application;

    .line 2
    .line 3
    const-string v0, "App has crashed, executing CustomActivityOnCrash\'s UncaughtExceptionHandler"

    .line 4
    .line 5
    const-string v1, "CustomActivityOnCrash"

    .line 6
    .line 7
    invoke-static {v1, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 8
    .line 9
    .line 10
    sget-object v0, Lsg0;->a:Landroid/app/Application;

    .line 11
    .line 12
    const-string v2, "custom_activity_on_crash"

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-wide/16 v4, -0x1

    .line 20
    .line 21
    const-string v6, "last_crash_timestamp"

    .line 22
    .line 23
    invoke-interface {v0, v6, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    new-instance v0, Ljava/util/Date;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 33
    .line 34
    .line 35
    move-result-wide v7

    .line 36
    cmp-long v0, v4, v7

    .line 37
    .line 38
    iget-object p0, p0, Lqg0;->a:Ljava/lang/Thread$UncaughtExceptionHandler;

    .line 39
    .line 40
    if-gtz v0, :cond_0

    .line 41
    .line 42
    sub-long/2addr v7, v4

    .line 43
    sget-object v0, Lsg0;->a:Landroid/app/Application;

    .line 44
    .line 45
    const-wide/16 v4, 0xbb8

    .line 46
    .line 47
    cmp-long v0, v7, v4

    .line 48
    .line 49
    if-gez v0, :cond_0

    .line 50
    .line 51
    const-string v0, "App already crashed recently, not starting custom error activity because we could enter a restart loop. Are you sure that your app does not crash directly on init?"

    .line 52
    .line 53
    invoke-static {v1, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 54
    .line 55
    .line 56
    if-eqz p0, :cond_c

    .line 57
    .line 58
    invoke-interface {p0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    sget-object v0, Lsg0;->a:Landroid/app/Application;

    .line 63
    .line 64
    new-instance v4, Ljava/util/Date;

    .line 65
    .line 66
    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4}, Ljava/util/Date;->getTime()J

    .line 70
    .line 71
    .line 72
    move-result-wide v4

    .line 73
    invoke-virtual {v0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-interface {v0, v6, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 86
    .line 87
    .line 88
    sget-object v0, Lsg0;->b:Loz;

    .line 89
    .line 90
    iget-object v0, v0, Loz;->o:Ljava/lang/Class;

    .line 91
    .line 92
    const/16 v2, 0x40

    .line 93
    .line 94
    const/4 v4, 0x0

    .line 95
    if-nez v0, :cond_2

    .line 96
    .line 97
    sget-object v0, Lsg0;->a:Landroid/app/Application;

    .line 98
    .line 99
    new-instance v5, Landroid/content/Intent;

    .line 100
    .line 101
    invoke-direct {v5}, Landroid/content/Intent;-><init>()V

    .line 102
    .line 103
    .line 104
    const-string v6, "cat.ereza.customactivityoncrash.ERROR"

    .line 105
    .line 106
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v0, v5, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 127
    .line 128
    .line 129
    move-result v5

    .line 130
    if-lez v5, :cond_1

    .line 131
    .line 132
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 137
    .line 138
    :try_start_0
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 139
    .line 140
    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 141
    .line 142
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 146
    goto :goto_0

    .line 147
    :catch_0
    move-exception v0

    .line 148
    const-string v5, "Failed when resolving the error activity class via intent filter, stack trace follows!"

    .line 149
    .line 150
    invoke-static {v1, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 151
    .line 152
    .line 153
    :cond_1
    move-object v0, v4

    .line 154
    :goto_0
    if-nez v0, :cond_2

    .line 155
    .line 156
    const-class v0, Lcat/ereza/customactivityoncrash/activity/DefaultErrorActivity;

    .line 157
    .line 158
    :cond_2
    :try_start_1
    new-instance v5, Ljava/io/BufferedReader;

    .line 159
    .line 160
    new-instance v6, Ljava/io/FileReader;

    .line 161
    .line 162
    const-string v7, "/proc/self/cmdline"

    .line 163
    .line 164
    invoke-direct {v6, v7}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-direct {v5, v6}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v5}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v6

    .line 178
    invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 179
    .line 180
    .line 181
    goto :goto_1

    .line 182
    :catch_1
    move-object v6, v4

    .line 183
    :goto_1
    if-eqz v6, :cond_3

    .line 184
    .line 185
    const-string v5, ":error_activity"

    .line 186
    .line 187
    invoke-virtual {v6, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    if-eqz v5, :cond_3

    .line 192
    .line 193
    goto :goto_3

    .line 194
    :cond_3
    move-object v5, p2

    .line 195
    :cond_4
    invoke-virtual {v5}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    array-length v7, v6

    .line 200
    move v8, v3

    .line 201
    :goto_2
    if-ge v8, v7, :cond_6

    .line 202
    .line 203
    aget-object v9, v6, v8

    .line 204
    .line 205
    invoke-virtual {v9}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v10

    .line 209
    const-string v11, "android.app.ActivityThread"

    .line 210
    .line 211
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v10

    .line 215
    if-eqz v10, :cond_5

    .line 216
    .line 217
    invoke-virtual {v9}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v9

    .line 221
    const-string v10, "handleBindApplication"

    .line 222
    .line 223
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v9

    .line 227
    if-eqz v9, :cond_5

    .line 228
    .line 229
    :goto_3
    const-string v0, "Your application class or your error activity have crashed, the custom activity will not be launched!"

    .line 230
    .line 231
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 232
    .line 233
    .line 234
    if-eqz p0, :cond_c

    .line 235
    .line 236
    invoke-interface {p0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    .line 237
    .line 238
    .line 239
    goto/16 :goto_6

    .line 240
    .line 241
    :cond_5
    add-int/lit8 v8, v8, 0x1

    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_6
    invoke-virtual {v5}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 245
    .line 246
    .line 247
    move-result-object v5

    .line 248
    if-nez v5, :cond_4

    .line 249
    .line 250
    sget-object p0, Lsg0;->a:Landroid/app/Application;

    .line 251
    .line 252
    new-instance p0, Landroid/content/Intent;

    .line 253
    .line 254
    sget-object p1, Lsg0;->a:Landroid/app/Application;

    .line 255
    .line 256
    invoke-direct {p0, p1, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 257
    .line 258
    .line 259
    new-instance p1, Ljava/io/StringWriter;

    .line 260
    .line 261
    invoke-direct {p1}, Ljava/io/StringWriter;-><init>()V

    .line 262
    .line 263
    .line 264
    new-instance v0, Ljava/io/PrintWriter;

    .line 265
    .line 266
    invoke-direct {v0, p1}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {p2, v0}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p1}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 277
    .line 278
    .line 279
    move-result p2

    .line 280
    const v0, 0x1ffff

    .line 281
    .line 282
    .line 283
    if-le p2, v0, :cond_7

    .line 284
    .line 285
    const p2, 0x1ffe7

    .line 286
    .line 287
    .line 288
    invoke-virtual {p1, v3, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object p1

    .line 292
    const-string p2, " [stack trace too large]"

    .line 293
    .line 294
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    :cond_7
    const-string p2, "cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE"

    .line 299
    .line 300
    invoke-virtual {p0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 301
    .line 302
    .line 303
    sget-object p1, Lsg0;->b:Loz;

    .line 304
    .line 305
    iget-object p2, p1, Loz;->p:Ljava/lang/Class;

    .line 306
    .line 307
    if-nez p2, :cond_b

    .line 308
    .line 309
    sget-object p2, Lsg0;->a:Landroid/app/Application;

    .line 310
    .line 311
    new-instance v0, Landroid/content/Intent;

    .line 312
    .line 313
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 314
    .line 315
    .line 316
    const-string v5, "cat.ereza.customactivityoncrash.RESTART"

    .line 317
    .line 318
    invoke-virtual {v0, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    invoke-virtual {v0, v5}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 331
    .line 332
    .line 333
    move-result-object v5

    .line 334
    invoke-virtual {v5, v0, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 339
    .line 340
    .line 341
    move-result v2

    .line 342
    if-lez v2, :cond_8

    .line 343
    .line 344
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 349
    .line 350
    :try_start_2
    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 351
    .line 352
    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 353
    .line 354
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    .line 358
    goto :goto_4

    .line 359
    :catch_2
    move-exception v0

    .line 360
    const-string v2, "Failed when resolving the restart activity class via intent filter, stack trace follows!"

    .line 361
    .line 362
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 363
    .line 364
    .line 365
    :cond_8
    move-object v0, v4

    .line 366
    :goto_4
    if-nez v0, :cond_a

    .line 367
    .line 368
    invoke-virtual {p2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 369
    .line 370
    .line 371
    move-result-object v0

    .line 372
    invoke-virtual {p2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 373
    .line 374
    .line 375
    move-result-object p2

    .line 376
    invoke-virtual {v0, p2}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 377
    .line 378
    .line 379
    move-result-object p2

    .line 380
    if-eqz p2, :cond_9

    .line 381
    .line 382
    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    if-eqz v0, :cond_9

    .line 387
    .line 388
    :try_start_3
    invoke-virtual {p2}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 389
    .line 390
    .line 391
    move-result-object p2

    .line 392
    invoke-virtual {p2}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object p2

    .line 396
    invoke-static {p2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    move-result-object v4
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_3

    .line 400
    goto :goto_5

    .line 401
    :catch_3
    move-exception p2

    .line 402
    const-string v0, "Failed when resolving the restart activity class via getLaunchIntentForPackage, stack trace follows!"

    .line 403
    .line 404
    invoke-static {v1, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 405
    .line 406
    .line 407
    :cond_9
    :goto_5
    move-object v0, v4

    .line 408
    :cond_a
    iput-object v0, p1, Loz;->p:Ljava/lang/Class;

    .line 409
    .line 410
    :cond_b
    const-string p1, "cat.ereza.customactivityoncrash.EXTRA_CONFIG"

    .line 411
    .line 412
    sget-object p2, Lsg0;->b:Loz;

    .line 413
    .line 414
    invoke-virtual {p0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 415
    .line 416
    .line 417
    const p1, 0x10008000

    .line 418
    .line 419
    .line 420
    invoke-virtual {p0, p1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 421
    .line 422
    .line 423
    sget-object p1, Lsg0;->a:Landroid/app/Application;

    .line 424
    .line 425
    sget-object p1, Lsg0;->a:Landroid/app/Application;

    .line 426
    .line 427
    invoke-virtual {p1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 428
    .line 429
    .line 430
    :cond_c
    sget-object p0, Lsg0;->c:Ljava/lang/ref/WeakReference;

    .line 431
    .line 432
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object p0

    .line 436
    check-cast p0, Landroid/app/Activity;

    .line 437
    .line 438
    if-eqz p0, :cond_d

    .line 439
    .line 440
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 441
    .line 442
    .line 443
    sget-object p0, Lsg0;->c:Ljava/lang/ref/WeakReference;

    .line 444
    .line 445
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->clear()V

    .line 446
    .line 447
    .line 448
    :cond_d
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 449
    .line 450
    .line 451
    move-result p0

    .line 452
    invoke-static {p0}, Landroid/os/Process;->killProcess(I)V

    .line 453
    .line 454
    .line 455
    const/16 p0, 0xa

    .line 456
    .line 457
    invoke-static {p0}, Ljava/lang/System;->exit(I)V

    .line 458
    .line 459
    .line 460
    :goto_6
    return-void
.end method
