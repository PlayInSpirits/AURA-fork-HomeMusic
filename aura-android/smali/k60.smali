.class public final Lk60;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lw21;


# static fields
.field public static final s:Ljava/lang/String;


# instance fields
.field public final n:Landroid/content/Context;

.field public final o:Ljava/util/HashMap;

.field public final p:Ljava/lang/Object;

.field public final q:Lxi4;

.field public final r:Lqr2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "CommandHandler"

    .line 2
    .line 3
    invoke-static {v0}, Lcx;->i(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lk60;->s:Ljava/lang/String;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lxi4;Lqr2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk60;->n:Landroid/content/Context;

    .line 5
    .line 6
    iput-object p2, p0, Lk60;->q:Lxi4;

    .line 7
    .line 8
    iput-object p3, p0, Lk60;->r:Lqr2;

    .line 9
    .line 10
    new-instance p1, Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lk60;->o:Ljava/util/HashMap;

    .line 16
    .line 17
    new-instance p1, Ljava/lang/Object;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lk60;->p:Ljava/lang/Object;

    .line 23
    .line 24
    return-void
.end method

.method public static c(Landroid/content/Intent;)Lrc5;
    .locals 4

    .line 1
    new-instance v0, Lrc5;

    .line 2
    .line 3
    const-string v1, "KEY_WORKSPEC_ID"

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "KEY_WORKSPEC_GENERATION"

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {p0, v2, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-direct {v0, p0, v1}, Lrc5;-><init>(ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public static d(Landroid/content/Intent;Lrc5;)V
    .locals 2

    .line 1
    const-string v0, "KEY_WORKSPEC_ID"

    .line 2
    .line 3
    iget-object v1, p1, Lrc5;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 6
    .line 7
    .line 8
    const-string v0, "KEY_WORKSPEC_GENERATION"

    .line 9
    .line 10
    iget p1, p1, Lrc5;->b:I

    .line 11
    .line 12
    invoke-virtual {p0, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Intent;ILtp4;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "ACTION_CONSTRAINTS_CHANGED"

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x3

    .line 12
    const/4 v3, 0x1

    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v1, :cond_6

    .line 15
    .line 16
    invoke-static {}, Lcx;->f()Lcx;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget-object v1, Lk60;->s:Ljava/lang/String;

    .line 21
    .line 22
    new-instance v5, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v6, "Handling constraints changed "

    .line 25
    .line 26
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {v0, v1, p1}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    new-instance p1, Lpc0;

    .line 40
    .line 41
    iget-object v0, p0, Lk60;->n:Landroid/content/Context;

    .line 42
    .line 43
    iget-object p0, p0, Lk60;->q:Lxi4;

    .line 44
    .line 45
    invoke-direct {p1, v0, p0, p2, p3}, Lpc0;-><init>(Landroid/content/Context;Lxi4;ILtp4;)V

    .line 46
    .line 47
    .line 48
    iget-object p0, p3, Ltp4;->r:Lsc5;

    .line 49
    .line 50
    iget-object p0, p0, Lsc5;->c:Landroidx/work/impl/WorkDatabase;

    .line 51
    .line 52
    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->A()Lfd5;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p0}, Lfd5;->f()Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    sget-object p2, Lob0;->a:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    move v1, v4

    .line 67
    move v5, v1

    .line 68
    move v6, v5

    .line 69
    move v7, v6

    .line 70
    move v8, v7

    .line 71
    :cond_0
    if-ge v8, p2, :cond_2

    .line 72
    .line 73
    invoke-virtual {p0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v9

    .line 77
    add-int/lit8 v8, v8, 0x1

    .line 78
    .line 79
    check-cast v9, Ldd5;

    .line 80
    .line 81
    iget-object v9, v9, Ldd5;->j:Lmc0;

    .line 82
    .line 83
    iget-boolean v10, v9, Lmc0;->e:Z

    .line 84
    .line 85
    or-int/2addr v1, v10

    .line 86
    iget-boolean v10, v9, Lmc0;->c:Z

    .line 87
    .line 88
    or-int/2addr v5, v10

    .line 89
    iget-boolean v10, v9, Lmc0;->f:Z

    .line 90
    .line 91
    or-int/2addr v6, v10

    .line 92
    iget v9, v9, Lmc0;->a:I

    .line 93
    .line 94
    if-eq v9, v3, :cond_1

    .line 95
    .line 96
    move v9, v3

    .line 97
    goto :goto_0

    .line 98
    :cond_1
    move v9, v4

    .line 99
    :goto_0
    or-int/2addr v7, v9

    .line 100
    if-eqz v1, :cond_0

    .line 101
    .line 102
    if-eqz v5, :cond_0

    .line 103
    .line 104
    if-eqz v6, :cond_0

    .line 105
    .line 106
    if-eqz v7, :cond_0

    .line 107
    .line 108
    :cond_2
    sget-object p2, Landroidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver;->a:Ljava/lang/String;

    .line 109
    .line 110
    new-instance p2, Landroid/content/Intent;

    .line 111
    .line 112
    const-string v3, "androidx.work.impl.background.systemalarm.UpdateProxies"

    .line 113
    .line 114
    invoke-direct {p2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    new-instance v3, Landroid/content/ComponentName;

    .line 118
    .line 119
    const-class v8, Landroidx/work/impl/background/systemalarm/ConstraintProxyUpdateReceiver;

    .line 120
    .line 121
    invoke-direct {v3, v0, v8}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 125
    .line 126
    .line 127
    const-string v3, "KEY_BATTERY_NOT_LOW_PROXY_ENABLED"

    .line 128
    .line 129
    invoke-virtual {p2, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    const-string v3, "KEY_BATTERY_CHARGING_PROXY_ENABLED"

    .line 134
    .line 135
    invoke-virtual {v1, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    const-string v3, "KEY_STORAGE_NOT_LOW_PROXY_ENABLED"

    .line 140
    .line 141
    invoke-virtual {v1, v3, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    const-string v3, "KEY_NETWORK_STATE_PROXY_ENABLED"

    .line 146
    .line 147
    invoke-virtual {v1, v3, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, p2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 151
    .line 152
    .line 153
    new-instance p2, Ljava/util/ArrayList;

    .line 154
    .line 155
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 160
    .line 161
    .line 162
    iget-object v1, p1, Lpc0;->a:Lxi4;

    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 168
    .line 169
    .line 170
    move-result-wide v5

    .line 171
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    move v3, v4

    .line 176
    :cond_3
    :goto_1
    if-ge v3, v1, :cond_5

    .line 177
    .line 178
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v7

    .line 182
    add-int/lit8 v3, v3, 0x1

    .line 183
    .line 184
    check-cast v7, Ldd5;

    .line 185
    .line 186
    invoke-virtual {v7}, Ldd5;->a()J

    .line 187
    .line 188
    .line 189
    move-result-wide v8

    .line 190
    cmp-long v8, v5, v8

    .line 191
    .line 192
    if-ltz v8, :cond_3

    .line 193
    .line 194
    invoke-virtual {v7}, Ldd5;->c()Z

    .line 195
    .line 196
    .line 197
    move-result v8

    .line 198
    if-eqz v8, :cond_4

    .line 199
    .line 200
    iget-object v8, p1, Lpc0;->c:Lc52;

    .line 201
    .line 202
    invoke-virtual {v8, v7}, Lc52;->c(Ldd5;)Z

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    if-eqz v8, :cond_3

    .line 207
    .line 208
    :cond_4
    invoke-virtual {p2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_5
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 213
    .line 214
    .line 215
    move-result p0

    .line 216
    :goto_2
    if-ge v4, p0, :cond_13

    .line 217
    .line 218
    invoke-virtual {p2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    add-int/lit8 v4, v4, 0x1

    .line 223
    .line 224
    check-cast v1, Ldd5;

    .line 225
    .line 226
    iget-object v3, v1, Ldd5;->a:Ljava/lang/String;

    .line 227
    .line 228
    invoke-static {v1}, Lq05;->m(Ldd5;)Lrc5;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    new-instance v5, Landroid/content/Intent;

    .line 233
    .line 234
    const-class v6, Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    .line 235
    .line 236
    invoke-direct {v5, v0, v6}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 237
    .line 238
    .line 239
    const-string v6, "ACTION_DELAY_MET"

    .line 240
    .line 241
    invoke-virtual {v5, v6}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 242
    .line 243
    .line 244
    invoke-static {v5, v1}, Lk60;->d(Landroid/content/Intent;Lrc5;)V

    .line 245
    .line 246
    .line 247
    invoke-static {}, Lcx;->f()Lcx;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    sget-object v6, Lpc0;->d:Ljava/lang/String;

    .line 252
    .line 253
    new-instance v7, Ljava/lang/StringBuilder;

    .line 254
    .line 255
    const-string v8, "Creating a delay_met command for workSpec with id ("

    .line 256
    .line 257
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    const-string v3, ")"

    .line 264
    .line 265
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    invoke-virtual {v1, v6, v3}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    iget-object v1, p3, Ltp4;->o:Lbq4;

    .line 276
    .line 277
    iget-object v1, v1, Lbq4;->q:Ljava/lang/Object;

    .line 278
    .line 279
    check-cast v1, Lvc5;

    .line 280
    .line 281
    new-instance v3, Leh;

    .line 282
    .line 283
    iget v6, p1, Lpc0;->b:I

    .line 284
    .line 285
    invoke-direct {v3, p3, v5, v6, v2}, Leh;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1, v3}, Lvc5;->execute(Ljava/lang/Runnable;)V

    .line 289
    .line 290
    .line 291
    goto :goto_2

    .line 292
    :cond_6
    const-string v1, "ACTION_RESCHEDULE"

    .line 293
    .line 294
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v1

    .line 298
    if-eqz v1, :cond_7

    .line 299
    .line 300
    invoke-static {}, Lcx;->f()Lcx;

    .line 301
    .line 302
    .line 303
    move-result-object p0

    .line 304
    sget-object v0, Lk60;->s:Ljava/lang/String;

    .line 305
    .line 306
    new-instance v1, Ljava/lang/StringBuilder;

    .line 307
    .line 308
    const-string v2, "Handling reschedule "

    .line 309
    .line 310
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    const-string p1, ", "

    .line 317
    .line 318
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object p1

    .line 328
    invoke-virtual {p0, v0, p1}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    iget-object p0, p3, Ltp4;->r:Lsc5;

    .line 332
    .line 333
    invoke-virtual {p0}, Lsc5;->d()V

    .line 334
    .line 335
    .line 336
    return-void

    .line 337
    :cond_7
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    const-string v5, "KEY_WORKSPEC_ID"

    .line 342
    .line 343
    filled-new-array {v5}, [Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v5

    .line 347
    if-eqz v1, :cond_16

    .line 348
    .line 349
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 350
    .line 351
    .line 352
    move-result v6

    .line 353
    if-eqz v6, :cond_8

    .line 354
    .line 355
    goto/16 :goto_b

    .line 356
    .line 357
    :cond_8
    aget-object v5, v5, v4

    .line 358
    .line 359
    invoke-virtual {v1, v5}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    if-nez v1, :cond_9

    .line 364
    .line 365
    goto/16 :goto_b

    .line 366
    .line 367
    :cond_9
    const-string v1, "ACTION_SCHEDULE_WORK"

    .line 368
    .line 369
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    if-eqz v1, :cond_d

    .line 374
    .line 375
    const-string v0, "at "

    .line 376
    .line 377
    iget-object p0, p0, Lk60;->n:Landroid/content/Context;

    .line 378
    .line 379
    const-string v1, "Opportunistically setting an alarm for "

    .line 380
    .line 381
    const-string v3, "Setting up Alarms for "

    .line 382
    .line 383
    const-string v4, "Skipping scheduling "

    .line 384
    .line 385
    invoke-static {p1}, Lk60;->c(Landroid/content/Intent;)Lrc5;

    .line 386
    .line 387
    .line 388
    move-result-object p1

    .line 389
    invoke-static {}, Lcx;->f()Lcx;

    .line 390
    .line 391
    .line 392
    move-result-object v5

    .line 393
    sget-object v6, Lk60;->s:Ljava/lang/String;

    .line 394
    .line 395
    new-instance v7, Ljava/lang/StringBuilder;

    .line 396
    .line 397
    const-string v8, "Handling schedule work for "

    .line 398
    .line 399
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v7

    .line 409
    invoke-virtual {v5, v6, v7}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 410
    .line 411
    .line 412
    iget-object v5, p3, Ltp4;->r:Lsc5;

    .line 413
    .line 414
    iget-object v5, v5, Lsc5;->c:Landroidx/work/impl/WorkDatabase;

    .line 415
    .line 416
    invoke-virtual {v5}, Ls24;->c()V

    .line 417
    .line 418
    .line 419
    :try_start_0
    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->A()Lfd5;

    .line 420
    .line 421
    .line 422
    move-result-object v7

    .line 423
    iget-object v8, p1, Lrc5;->a:Ljava/lang/String;

    .line 424
    .line 425
    invoke-virtual {v7, v8}, Lfd5;->h(Ljava/lang/String;)Ldd5;

    .line 426
    .line 427
    .line 428
    move-result-object v7

    .line 429
    if-nez v7, :cond_a

    .line 430
    .line 431
    invoke-static {}, Lcx;->f()Lcx;

    .line 432
    .line 433
    .line 434
    move-result-object p0

    .line 435
    new-instance p2, Ljava/lang/StringBuilder;

    .line 436
    .line 437
    invoke-direct {p2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 441
    .line 442
    .line 443
    const-string p1, " because it\'s no longer in the DB"

    .line 444
    .line 445
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 446
    .line 447
    .line 448
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 449
    .line 450
    .line 451
    move-result-object p1

    .line 452
    invoke-virtual {p0, v6, p1}, Lcx;->k(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 453
    .line 454
    .line 455
    invoke-virtual {v5}, Ls24;->o()V

    .line 456
    .line 457
    .line 458
    return-void

    .line 459
    :catchall_0
    move-exception p0

    .line 460
    goto/16 :goto_4

    .line 461
    .line 462
    :cond_a
    :try_start_1
    iget v8, v7, Ldd5;->b:I

    .line 463
    .line 464
    invoke-static {v8}, Lf34;->c(I)Z

    .line 465
    .line 466
    .line 467
    move-result v8

    .line 468
    if-eqz v8, :cond_b

    .line 469
    .line 470
    invoke-static {}, Lcx;->f()Lcx;

    .line 471
    .line 472
    .line 473
    move-result-object p0

    .line 474
    new-instance p2, Ljava/lang/StringBuilder;

    .line 475
    .line 476
    invoke-direct {p2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 480
    .line 481
    .line 482
    const-string p1, "because it is finished."

    .line 483
    .line 484
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 485
    .line 486
    .line 487
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object p1

    .line 491
    invoke-virtual {p0, v6, p1}, Lcx;->k(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 492
    .line 493
    .line 494
    invoke-virtual {v5}, Ls24;->o()V

    .line 495
    .line 496
    .line 497
    return-void

    .line 498
    :cond_b
    :try_start_2
    invoke-virtual {v7}, Ldd5;->a()J

    .line 499
    .line 500
    .line 501
    move-result-wide v8

    .line 502
    invoke-virtual {v7}, Ldd5;->c()Z

    .line 503
    .line 504
    .line 505
    move-result v4

    .line 506
    if-nez v4, :cond_c

    .line 507
    .line 508
    invoke-static {}, Lcx;->f()Lcx;

    .line 509
    .line 510
    .line 511
    move-result-object p2

    .line 512
    new-instance p3, Ljava/lang/StringBuilder;

    .line 513
    .line 514
    invoke-direct {p3, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    invoke-virtual {p3, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 524
    .line 525
    .line 526
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object p3

    .line 530
    invoke-virtual {p2, v6, p3}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 531
    .line 532
    .line 533
    invoke-static {p0, v5, p1, v8, v9}, Lo6;->b(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Lrc5;J)V

    .line 534
    .line 535
    .line 536
    goto :goto_3

    .line 537
    :cond_c
    invoke-static {}, Lcx;->f()Lcx;

    .line 538
    .line 539
    .line 540
    move-result-object v3

    .line 541
    new-instance v4, Ljava/lang/StringBuilder;

    .line 542
    .line 543
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 550
    .line 551
    .line 552
    invoke-virtual {v4, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    invoke-virtual {v3, v6, v0}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    invoke-static {p0, v5, p1, v8, v9}, Lo6;->b(Landroid/content/Context;Landroidx/work/impl/WorkDatabase;Lrc5;J)V

    .line 563
    .line 564
    .line 565
    new-instance p1, Landroid/content/Intent;

    .line 566
    .line 567
    const-class v0, Landroidx/work/impl/background/systemalarm/SystemAlarmService;

    .line 568
    .line 569
    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 570
    .line 571
    .line 572
    const-string p0, "ACTION_CONSTRAINTS_CHANGED"

    .line 573
    .line 574
    invoke-virtual {p1, p0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 575
    .line 576
    .line 577
    iget-object p0, p3, Ltp4;->o:Lbq4;

    .line 578
    .line 579
    iget-object p0, p0, Lbq4;->q:Ljava/lang/Object;

    .line 580
    .line 581
    check-cast p0, Lvc5;

    .line 582
    .line 583
    new-instance v0, Leh;

    .line 584
    .line 585
    invoke-direct {v0, p3, p1, p2, v2}, Leh;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 586
    .line 587
    .line 588
    invoke-virtual {p0, v0}, Lvc5;->execute(Ljava/lang/Runnable;)V

    .line 589
    .line 590
    .line 591
    :goto_3
    invoke-virtual {v5}, Ls24;->t()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 592
    .line 593
    .line 594
    invoke-virtual {v5}, Ls24;->o()V

    .line 595
    .line 596
    .line 597
    return-void

    .line 598
    :goto_4
    invoke-virtual {v5}, Ls24;->o()V

    .line 599
    .line 600
    .line 601
    throw p0

    .line 602
    :cond_d
    const-string v1, "ACTION_DELAY_MET"

    .line 603
    .line 604
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 605
    .line 606
    .line 607
    move-result v1

    .line 608
    if-eqz v1, :cond_f

    .line 609
    .line 610
    const-string v0, "WorkSpec "

    .line 611
    .line 612
    const-string v1, "Handing delay met for "

    .line 613
    .line 614
    iget-object v2, p0, Lk60;->p:Ljava/lang/Object;

    .line 615
    .line 616
    monitor-enter v2

    .line 617
    :try_start_3
    invoke-static {p1}, Lk60;->c(Landroid/content/Intent;)Lrc5;

    .line 618
    .line 619
    .line 620
    move-result-object p1

    .line 621
    invoke-static {}, Lcx;->f()Lcx;

    .line 622
    .line 623
    .line 624
    move-result-object v3

    .line 625
    sget-object v4, Lk60;->s:Ljava/lang/String;

    .line 626
    .line 627
    new-instance v5, Ljava/lang/StringBuilder;

    .line 628
    .line 629
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 630
    .line 631
    .line 632
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 633
    .line 634
    .line 635
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 636
    .line 637
    .line 638
    move-result-object v1

    .line 639
    invoke-virtual {v3, v4, v1}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 640
    .line 641
    .line 642
    iget-object v1, p0, Lk60;->o:Ljava/util/HashMap;

    .line 643
    .line 644
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 645
    .line 646
    .line 647
    move-result v1

    .line 648
    if-nez v1, :cond_e

    .line 649
    .line 650
    new-instance v0, Lco0;

    .line 651
    .line 652
    iget-object v1, p0, Lk60;->n:Landroid/content/Context;

    .line 653
    .line 654
    iget-object v3, p0, Lk60;->r:Lqr2;

    .line 655
    .line 656
    invoke-virtual {v3, p1}, Lqr2;->w(Lrc5;)Lgl4;

    .line 657
    .line 658
    .line 659
    move-result-object v3

    .line 660
    invoke-direct {v0, v1, p2, p3, v3}, Lco0;-><init>(Landroid/content/Context;ILtp4;Lgl4;)V

    .line 661
    .line 662
    .line 663
    iget-object p0, p0, Lk60;->o:Ljava/util/HashMap;

    .line 664
    .line 665
    invoke-virtual {p0, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 666
    .line 667
    .line 668
    invoke-virtual {v0}, Lco0;->e()V

    .line 669
    .line 670
    .line 671
    goto :goto_5

    .line 672
    :catchall_1
    move-exception p0

    .line 673
    goto :goto_6

    .line 674
    :cond_e
    invoke-static {}, Lcx;->f()Lcx;

    .line 675
    .line 676
    .line 677
    move-result-object p0

    .line 678
    new-instance p2, Ljava/lang/StringBuilder;

    .line 679
    .line 680
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 684
    .line 685
    .line 686
    const-string p1, " is is already being handled for ACTION_DELAY_MET"

    .line 687
    .line 688
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 689
    .line 690
    .line 691
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object p1

    .line 695
    invoke-virtual {p0, v4, p1}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 696
    .line 697
    .line 698
    :goto_5
    monitor-exit v2

    .line 699
    return-void

    .line 700
    :goto_6
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 701
    throw p0

    .line 702
    :cond_f
    const-string v1, "ACTION_STOP_WORK"

    .line 703
    .line 704
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 705
    .line 706
    .line 707
    move-result v1

    .line 708
    if-eqz v1, :cond_14

    .line 709
    .line 710
    iget-object p2, p0, Lk60;->r:Lqr2;

    .line 711
    .line 712
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 713
    .line 714
    .line 715
    move-result-object p1

    .line 716
    const-string v0, "KEY_WORKSPEC_ID"

    .line 717
    .line 718
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    const-string v1, "KEY_WORKSPEC_GENERATION"

    .line 723
    .line 724
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 725
    .line 726
    .line 727
    move-result v2

    .line 728
    if-eqz v2, :cond_10

    .line 729
    .line 730
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 731
    .line 732
    .line 733
    move-result p1

    .line 734
    new-instance v1, Ljava/util/ArrayList;

    .line 735
    .line 736
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 737
    .line 738
    .line 739
    new-instance v2, Lrc5;

    .line 740
    .line 741
    invoke-direct {v2, p1, v0}, Lrc5;-><init>(ILjava/lang/String;)V

    .line 742
    .line 743
    .line 744
    invoke-virtual {p2, v2}, Lqr2;->s(Lrc5;)Lgl4;

    .line 745
    .line 746
    .line 747
    move-result-object p1

    .line 748
    if-eqz p1, :cond_11

    .line 749
    .line 750
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 751
    .line 752
    .line 753
    goto :goto_7

    .line 754
    :cond_10
    invoke-virtual {p2, v0}, Lqr2;->t(Ljava/lang/String;)Ljava/util/List;

    .line 755
    .line 756
    .line 757
    move-result-object v1

    .line 758
    :cond_11
    :goto_7
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 759
    .line 760
    .line 761
    move-result-object p1

    .line 762
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 763
    .line 764
    .line 765
    move-result p2

    .line 766
    if-eqz p2, :cond_13

    .line 767
    .line 768
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 769
    .line 770
    .line 771
    move-result-object p2

    .line 772
    check-cast p2, Lgl4;

    .line 773
    .line 774
    invoke-static {}, Lcx;->f()Lcx;

    .line 775
    .line 776
    .line 777
    move-result-object v1

    .line 778
    sget-object v2, Lk60;->s:Ljava/lang/String;

    .line 779
    .line 780
    new-instance v5, Ljava/lang/StringBuilder;

    .line 781
    .line 782
    const-string v6, "Handing stopWork work for "

    .line 783
    .line 784
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 785
    .line 786
    .line 787
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 788
    .line 789
    .line 790
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 791
    .line 792
    .line 793
    move-result-object v5

    .line 794
    invoke-virtual {v1, v2, v5}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 795
    .line 796
    .line 797
    iget-object v1, p3, Ltp4;->w:Lrm3;

    .line 798
    .line 799
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 800
    .line 801
    .line 802
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 803
    .line 804
    .line 805
    const/16 v2, -0x200

    .line 806
    .line 807
    invoke-virtual {v1, p2, v2}, Lrm3;->R(Lgl4;I)V

    .line 808
    .line 809
    .line 810
    iget-object p2, p2, Lgl4;->a:Lrc5;

    .line 811
    .line 812
    iget-object v1, p0, Lk60;->n:Landroid/content/Context;

    .line 813
    .line 814
    iget-object v2, p3, Ltp4;->r:Lsc5;

    .line 815
    .line 816
    iget-object v2, v2, Lsc5;->c:Landroidx/work/impl/WorkDatabase;

    .line 817
    .line 818
    sget-object v5, Lo6;->a:Ljava/lang/String;

    .line 819
    .line 820
    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->x()Lbq4;

    .line 821
    .line 822
    .line 823
    move-result-object v2

    .line 824
    invoke-virtual {v2, p2}, Lbq4;->k(Lrc5;)Lzp4;

    .line 825
    .line 826
    .line 827
    move-result-object v5

    .line 828
    if-eqz v5, :cond_12

    .line 829
    .line 830
    iget v5, v5, Lzp4;->c:I

    .line 831
    .line 832
    invoke-static {v1, p2, v5}, Lo6;->a(Landroid/content/Context;Lrc5;I)V

    .line 833
    .line 834
    .line 835
    invoke-static {}, Lcx;->f()Lcx;

    .line 836
    .line 837
    .line 838
    move-result-object v1

    .line 839
    sget-object v5, Lo6;->a:Ljava/lang/String;

    .line 840
    .line 841
    new-instance v6, Ljava/lang/StringBuilder;

    .line 842
    .line 843
    const-string v7, "Removing SystemIdInfo for workSpecId ("

    .line 844
    .line 845
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 846
    .line 847
    .line 848
    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 849
    .line 850
    .line 851
    const-string v7, ")"

    .line 852
    .line 853
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 854
    .line 855
    .line 856
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 857
    .line 858
    .line 859
    move-result-object v6

    .line 860
    invoke-virtual {v1, v5, v6}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 861
    .line 862
    .line 863
    iget-object v1, p2, Lrc5;->a:Ljava/lang/String;

    .line 864
    .line 865
    iget v5, p2, Lrc5;->b:I

    .line 866
    .line 867
    iget-object v6, v2, Lbq4;->n:Ljava/lang/Object;

    .line 868
    .line 869
    check-cast v6, Landroidx/work/impl/WorkDatabase_Impl;

    .line 870
    .line 871
    invoke-virtual {v6}, Ls24;->b()V

    .line 872
    .line 873
    .line 874
    iget-object v2, v2, Lbq4;->p:Ljava/lang/Object;

    .line 875
    .line 876
    check-cast v2, Laq4;

    .line 877
    .line 878
    invoke-virtual {v2}, Lrx1;->a()Ldf1;

    .line 879
    .line 880
    .line 881
    move-result-object v7

    .line 882
    invoke-interface {v7, v3, v1}, Lvo4;->h(ILjava/lang/String;)V

    .line 883
    .line 884
    .line 885
    const/4 v1, 0x2

    .line 886
    int-to-long v8, v5

    .line 887
    invoke-interface {v7, v1, v8, v9}, Lvo4;->c(IJ)V

    .line 888
    .line 889
    .line 890
    :try_start_4
    invoke-virtual {v6}, Ls24;->c()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 891
    .line 892
    .line 893
    :try_start_5
    invoke-virtual {v7}, Ldf1;->b()I

    .line 894
    .line 895
    .line 896
    invoke-virtual {v6}, Ls24;->t()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 897
    .line 898
    .line 899
    :try_start_6
    invoke-virtual {v6}, Ls24;->o()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 900
    .line 901
    .line 902
    invoke-virtual {v2, v7}, Lrx1;->h(Ldf1;)V

    .line 903
    .line 904
    .line 905
    goto :goto_a

    .line 906
    :catchall_2
    move-exception p0

    .line 907
    goto :goto_9

    .line 908
    :catchall_3
    move-exception p0

    .line 909
    :try_start_7
    invoke-virtual {v6}, Ls24;->o()V

    .line 910
    .line 911
    .line 912
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 913
    :goto_9
    invoke-virtual {v2, v7}, Lrx1;->h(Ldf1;)V

    .line 914
    .line 915
    .line 916
    throw p0

    .line 917
    :cond_12
    :goto_a
    invoke-virtual {p3, p2, v4}, Ltp4;->b(Lrc5;Z)V

    .line 918
    .line 919
    .line 920
    goto/16 :goto_8

    .line 921
    .line 922
    :cond_13
    return-void

    .line 923
    :cond_14
    const-string p3, "ACTION_EXECUTION_COMPLETED"

    .line 924
    .line 925
    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 926
    .line 927
    .line 928
    move-result p3

    .line 929
    if-eqz p3, :cond_15

    .line 930
    .line 931
    invoke-static {p1}, Lk60;->c(Landroid/content/Intent;)Lrc5;

    .line 932
    .line 933
    .line 934
    move-result-object p3

    .line 935
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 936
    .line 937
    .line 938
    move-result-object v0

    .line 939
    const-string v1, "KEY_NEEDS_RESCHEDULE"

    .line 940
    .line 941
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 942
    .line 943
    .line 944
    move-result v0

    .line 945
    invoke-static {}, Lcx;->f()Lcx;

    .line 946
    .line 947
    .line 948
    move-result-object v1

    .line 949
    sget-object v2, Lk60;->s:Ljava/lang/String;

    .line 950
    .line 951
    new-instance v3, Ljava/lang/StringBuilder;

    .line 952
    .line 953
    const-string v4, "Handling onExecutionCompleted "

    .line 954
    .line 955
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 956
    .line 957
    .line 958
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 959
    .line 960
    .line 961
    const-string p1, ", "

    .line 962
    .line 963
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 964
    .line 965
    .line 966
    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 967
    .line 968
    .line 969
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 970
    .line 971
    .line 972
    move-result-object p1

    .line 973
    invoke-virtual {v1, v2, p1}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 974
    .line 975
    .line 976
    invoke-virtual {p0, p3, v0}, Lk60;->b(Lrc5;Z)V

    .line 977
    .line 978
    .line 979
    return-void

    .line 980
    :cond_15
    invoke-static {}, Lcx;->f()Lcx;

    .line 981
    .line 982
    .line 983
    move-result-object p0

    .line 984
    sget-object p2, Lk60;->s:Ljava/lang/String;

    .line 985
    .line 986
    new-instance p3, Ljava/lang/StringBuilder;

    .line 987
    .line 988
    const-string v0, "Ignoring intent "

    .line 989
    .line 990
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 991
    .line 992
    .line 993
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 994
    .line 995
    .line 996
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 997
    .line 998
    .line 999
    move-result-object p1

    .line 1000
    invoke-virtual {p0, p2, p1}, Lcx;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 1001
    .line 1002
    .line 1003
    return-void

    .line 1004
    :cond_16
    :goto_b
    invoke-static {}, Lcx;->f()Lcx;

    .line 1005
    .line 1006
    .line 1007
    move-result-object p0

    .line 1008
    sget-object p1, Lk60;->s:Ljava/lang/String;

    .line 1009
    .line 1010
    new-instance p2, Ljava/lang/StringBuilder;

    .line 1011
    .line 1012
    const-string p3, "Invalid request for "

    .line 1013
    .line 1014
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1018
    .line 1019
    .line 1020
    const-string p3, " , requires KEY_WORKSPEC_ID ."

    .line 1021
    .line 1022
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1023
    .line 1024
    .line 1025
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1026
    .line 1027
    .line 1028
    move-result-object p2

    .line 1029
    invoke-virtual {p0, p1, p2}, Lcx;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1030
    .line 1031
    .line 1032
    return-void
.end method

.method public final b(Lrc5;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk60;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lk60;->o:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    check-cast v1, Lco0;

    .line 11
    .line 12
    iget-object p0, p0, Lk60;->r:Lqr2;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lqr2;->s(Lrc5;)Lgl4;

    .line 15
    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {v1, p2}, Lco0;->f(Z)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    :goto_0
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw p0
.end method
