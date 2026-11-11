.class public final synthetic Lts1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lvb4;

.field public final synthetic p:Landroidx/preference/Preference;


# direct methods
.method public synthetic constructor <init>(Lvb4;Landroidx/preference/Preference;I)V
    .locals 0

    .line 1
    iput p3, p0, Lts1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lts1;->o:Lvb4;

    .line 4
    .line 5
    iput-object p2, p0, Lts1;->p:Landroidx/preference/Preference;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget v0, p0, Lts1;->n:I

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x1

    .line 7
    iget-object v5, p0, Lts1;->p:Landroidx/preference/Preference;

    .line 8
    .line 9
    iget-object v6, p0, Lts1;->o:Lvb4;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    :try_start_0
    invoke-static {}, Lrr1;->h()Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/HubMe;->isAdmin()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    move-object p0, v0

    .line 29
    new-instance v0, Ls14;

    .line 30
    .line 31
    invoke-direct {v0, p0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    move-object p0, v0

    .line 35
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 36
    .line 37
    instance-of v1, p0, Ls14;

    .line 38
    .line 39
    if-eqz v1, :cond_0

    .line 40
    .line 41
    move-object p0, v0

    .line 42
    :cond_0
    check-cast p0, Ljava/lang/Boolean;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    sget-object v0, Lio1;->b:Landroid/os/Handler;

    .line 49
    .line 50
    new-instance v1, Lbs1;

    .line 51
    .line 52
    invoke-direct {v1, v6, p0, v5, v4}, Lbs1;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_0
    invoke-virtual {v6}, Lkc1;->Z()Landroid/content/Context;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {p0, v4}, Luc5;->Y(Landroid/content/Context;I)Lly4;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const/4 v4, 0x7

    .line 68
    invoke-static {p0, v4}, Luc5;->Y(Landroid/content/Context;I)Lly4;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    iget-object v7, v0, Lly4;->n:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v8, v0, Lly4;->o:Ljava/lang/Object;

    .line 75
    .line 76
    iget-object v9, v0, Lly4;->p:Ljava/io/Serializable;

    .line 77
    .line 78
    iget-object v10, v4, Lly4;->n:Ljava/lang/String;

    .line 79
    .line 80
    iget-object v11, v4, Lly4;->o:Ljava/lang/Object;

    .line 81
    .line 82
    iget-object v12, v4, Lly4;->p:Ljava/io/Serializable;

    .line 83
    .line 84
    filled-new-array/range {v7 .. v12}, [Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const v4, 0x7f130224

    .line 89
    .line 90
    .line 91
    invoke-virtual {p0, v4, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    sget-object v0, Llp1;->a:Llp1;

    .line 99
    .line 100
    :try_start_1
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    const-string v7, "netstats"

    .line 105
    .line 106
    invoke-virtual {v0, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-object v7, v0

    .line 114
    check-cast v7, Landroid/app/usage/NetworkStatsManager;

    .line 115
    .line 116
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 117
    .line 118
    .line 119
    move-result-wide v12

    .line 120
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {v0, v12, v13}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 125
    .line 126
    .line 127
    const/4 v8, 0x6

    .line 128
    const/4 v9, -0x6

    .line 129
    invoke-virtual {v0, v8, v9}, Ljava/util/Calendar;->add(II)V

    .line 130
    .line 131
    .line 132
    const/16 v8, 0xb

    .line 133
    .line 134
    invoke-virtual {v0, v8, v3}, Ljava/util/Calendar;->set(II)V

    .line 135
    .line 136
    .line 137
    const/16 v8, 0xc

    .line 138
    .line 139
    invoke-virtual {v0, v8, v3}, Ljava/util/Calendar;->set(II)V

    .line 140
    .line 141
    .line 142
    const/16 v8, 0xd

    .line 143
    .line 144
    invoke-virtual {v0, v8, v3}, Ljava/util/Calendar;->set(II)V

    .line 145
    .line 146
    .line 147
    const/16 v8, 0xe

    .line 148
    .line 149
    invoke-virtual {v0, v8, v3}, Ljava/util/Calendar;->set(II)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 153
    .line 154
    .line 155
    move-result-wide v10

    .line 156
    invoke-static {}, Landroid/os/Process;->myUid()I

    .line 157
    .line 158
    .line 159
    move-result v14

    .line 160
    const/4 v8, 0x0

    .line 161
    const/4 v9, 0x0

    .line 162
    invoke-virtual/range {v7 .. v14}, Landroid/app/usage/NetworkStatsManager;->queryDetailsForUid(ILjava/lang/String;JJI)Landroid/app/usage/NetworkStats;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    new-instance v3, Landroid/app/usage/NetworkStats$Bucket;

    .line 170
    .line 171
    invoke-direct {v3}, Landroid/app/usage/NetworkStats$Bucket;-><init>()V

    .line 172
    .line 173
    .line 174
    :goto_1
    invoke-virtual {v0}, Landroid/app/usage/NetworkStats;->hasNextBucket()Z

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    if-eqz v7, :cond_1

    .line 179
    .line 180
    invoke-virtual {v0, v3}, Landroid/app/usage/NetworkStats;->getNextBucket(Landroid/app/usage/NetworkStats$Bucket;)Z

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3}, Landroid/app/usage/NetworkStats$Bucket;->getRxBytes()J

    .line 184
    .line 185
    .line 186
    move-result-wide v7

    .line 187
    invoke-virtual {v3}, Landroid/app/usage/NetworkStats$Bucket;->getTxBytes()J

    .line 188
    .line 189
    .line 190
    move-result-wide v9

    .line 191
    add-long/2addr v7, v9

    .line 192
    add-long/2addr v1, v7

    .line 193
    goto :goto_1

    .line 194
    :catchall_1
    move-exception v0

    .line 195
    goto :goto_2

    .line 196
    :cond_1
    invoke-virtual {v0}, Landroid/app/usage/NetworkStats;->close()V

    .line 197
    .line 198
    .line 199
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 200
    .line 201
    .line 202
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 203
    goto :goto_3

    .line 204
    :goto_2
    new-instance v1, Ls14;

    .line 205
    .line 206
    invoke-direct {v1, v0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 207
    .line 208
    .line 209
    move-object v0, v1

    .line 210
    :goto_3
    invoke-static {v0}, Lbb3;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    if-eqz v1, :cond_2

    .line 215
    .line 216
    new-instance v2, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    const-string v3, "system statistics: "

    .line 219
    .line 220
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    const-string v2, "HomeTrafficStats"

    .line 231
    .line 232
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 233
    .line 234
    .line 235
    :cond_2
    instance-of v1, v0, Ls14;

    .line 236
    .line 237
    const/4 v2, 0x0

    .line 238
    if-eqz v1, :cond_3

    .line 239
    .line 240
    move-object v0, v2

    .line 241
    :cond_3
    check-cast v0, Ljava/lang/Long;

    .line 242
    .line 243
    if-eqz v0, :cond_5

    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 246
    .line 247
    .line 248
    move-result-wide v0

    .line 249
    const-wide/32 v2, 0x40000000

    .line 250
    .line 251
    .line 252
    cmp-long v2, v0, v2

    .line 253
    .line 254
    if-ltz v2, :cond_4

    .line 255
    .line 256
    long-to-double v0, v0

    .line 257
    const-wide/high16 v2, 0x41d0000000000000L    # 1.073741824E9

    .line 258
    .line 259
    div-double/2addr v0, v2

    .line 260
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    const v1, 0x7f130232

    .line 269
    .line 270
    .line 271
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    goto :goto_4

    .line 279
    :cond_4
    long-to-double v0, v0

    .line 280
    const-wide/high16 v2, 0x4130000000000000L    # 1048576.0

    .line 281
    .line 282
    div-double/2addr v0, v2

    .line 283
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 284
    .line 285
    .line 286
    move-result-object v0

    .line 287
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    const v1, 0x7f130233

    .line 292
    .line 293
    .line 294
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    :goto_4
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    const v1, 0x7f130225

    .line 306
    .line 307
    .line 308
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    :cond_5
    if-nez v2, :cond_6

    .line 313
    .line 314
    const-string v2, ""

    .line 315
    .line 316
    :cond_6
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    sget-object v0, Lio1;->b:Landroid/os/Handler;

    .line 321
    .line 322
    new-instance v1, Lv6;

    .line 323
    .line 324
    const/16 v2, 0xf

    .line 325
    .line 326
    invoke-direct {v1, v6, v5, p0, v2}, Lv6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 330
    .line 331
    .line 332
    return-void

    .line 333
    :pswitch_1
    :try_start_2
    invoke-static {}, Lgi1;->v()Lkd3;

    .line 334
    .line 335
    .line 336
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 337
    goto :goto_5

    .line 338
    :catchall_2
    move-exception v0

    .line 339
    new-instance v4, Ls14;

    .line 340
    .line 341
    invoke-direct {v4, v0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 342
    .line 343
    .line 344
    move-object v0, v4

    .line 345
    :goto_5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    new-instance v2, Lkd3;

    .line 354
    .line 355
    invoke-direct {v2, v3, v1}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    instance-of v1, v0, Ls14;

    .line 359
    .line 360
    if-eqz v1, :cond_7

    .line 361
    .line 362
    move-object v0, v2

    .line 363
    :cond_7
    check-cast v0, Lkd3;

    .line 364
    .line 365
    iget-object v1, v0, Lkd3;->n:Ljava/lang/Object;

    .line 366
    .line 367
    check-cast v1, Ljava/lang/Number;

    .line 368
    .line 369
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 370
    .line 371
    .line 372
    move-result v4

    .line 373
    iget-object v0, v0, Lkd3;->o:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v0, Ljava/lang/Number;

    .line 376
    .line 377
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 378
    .line 379
    .line 380
    move-result-wide v6

    .line 381
    sget-object v0, Lio1;->b:Landroid/os/Handler;

    .line 382
    .line 383
    new-instance v2, Lus1;

    .line 384
    .line 385
    iget-object v3, p0, Lts1;->o:Lvb4;

    .line 386
    .line 387
    iget-object v5, p0, Lts1;->p:Landroidx/preference/Preference;

    .line 388
    .line 389
    invoke-direct/range {v2 .. v7}, Lus1;-><init>(Lvb4;ILandroidx/preference/Preference;J)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 393
    .line 394
    .line 395
    return-void

    .line 396
    nop

    .line 397
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
