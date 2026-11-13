.class public final Ldefpackage/vo0;
.super Ldefpackage/rx1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic d:I


# direct methods
.method public constructor <init>(Ldefpackage/s24;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ldefpackage/vo0;->d:I

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, Ldefpackage/rx1;-><init>(Ldefpackage/s24;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ldefpackage/s24;I)V
    .locals 0

    .line 11
    iput p2, p0, Ldefpackage/vo0;->d:I

    invoke-direct {p0, p1}, Ldefpackage/rx1;-><init>(Ldefpackage/s24;)V

    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/vo0;->d:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)"

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    const-string p0, "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    const-string p0, "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)"

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    const-string p0, "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)"

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    const-string p0, "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)"

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    const-string p0, "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)"

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    const-string p0, "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)"

    .line 25
    .line 26
    return-object p0

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

.method public final l(Ldefpackage/df1;Ljava/lang/Object;)V
    .locals 11

    .line 1
    iget p0, p0, Ldefpackage/vo0;->d:I

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    const/4 v1, 0x2

    .line 5
    const/4 v2, 0x1

    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p2, Ldefpackage/gd5;

    .line 10
    .line 11
    iget-object p0, p2, Ldefpackage/gd5;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-interface {p1, v2, p0}, Ldefpackage/vo4;->h(ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p2, Ldefpackage/gd5;->b:Ljava/lang/String;

    .line 17
    .line 18
    invoke-interface {p1, v1, p0}, Ldefpackage/vo4;->h(ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    check-cast p2, Ldefpackage/dd5;

    .line 23
    .line 24
    iget-object p0, p2, Ldefpackage/dd5;->a:Ljava/lang/String;

    .line 25
    .line 26
    invoke-interface {p1, v2, p0}, Ldefpackage/vo4;->h(ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget p0, p2, Ldefpackage/dd5;->b:I

    .line 30
    .line 31
    invoke-static {p0}, Ldefpackage/uc5;->X(I)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    int-to-long v3, p0

    .line 36
    invoke-interface {p1, v1, v3, v4}, Ldefpackage/vo4;->c(IJ)V

    .line 37
    .line 38
    .line 39
    iget-object p0, p2, Ldefpackage/dd5;->c:Ljava/lang/String;

    .line 40
    .line 41
    invoke-interface {p1, v0, p0}, Ldefpackage/vo4;->h(ILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object p0, p2, Ldefpackage/dd5;->d:Ljava/lang/String;

    .line 45
    .line 46
    const/4 v3, 0x4

    .line 47
    invoke-interface {p1, v3, p0}, Ldefpackage/vo4;->h(ILjava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p2, Ldefpackage/dd5;->e:Ldefpackage/oh0;

    .line 51
    .line 52
    sget-object v4, Ldefpackage/oh0;->b:Ldefpackage/oh0;

    .line 53
    .line 54
    invoke-static {p0}, Ldefpackage/bu;->E(Ldefpackage/oh0;)[B

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const/4 v4, 0x5

    .line 59
    invoke-interface {p1, v4, p0}, Ldefpackage/vo4;->x(I[B)V

    .line 60
    .line 61
    .line 62
    iget-object p0, p2, Ldefpackage/dd5;->f:Ldefpackage/oh0;

    .line 63
    .line 64
    invoke-static {p0}, Ldefpackage/bu;->E(Ldefpackage/oh0;)[B

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    const/4 v5, 0x6

    .line 69
    invoke-interface {p1, v5, p0}, Ldefpackage/vo4;->x(I[B)V

    .line 70
    .line 71
    .line 72
    iget-wide v6, p2, Ldefpackage/dd5;->g:J

    .line 73
    .line 74
    const/4 p0, 0x7

    .line 75
    invoke-interface {p1, p0, v6, v7}, Ldefpackage/vo4;->c(IJ)V

    .line 76
    .line 77
    .line 78
    iget-wide v6, p2, Ldefpackage/dd5;->h:J

    .line 79
    .line 80
    const/16 p0, 0x8

    .line 81
    .line 82
    invoke-interface {p1, p0, v6, v7}, Ldefpackage/vo4;->c(IJ)V

    .line 83
    .line 84
    .line 85
    iget-wide v6, p2, Ldefpackage/dd5;->i:J

    .line 86
    .line 87
    const/16 p0, 0x9

    .line 88
    .line 89
    invoke-interface {p1, p0, v6, v7}, Ldefpackage/vo4;->c(IJ)V

    .line 90
    .line 91
    .line 92
    iget v6, p2, Ldefpackage/dd5;->k:I

    .line 93
    .line 94
    int-to-long v6, v6

    .line 95
    const/16 v8, 0xa

    .line 96
    .line 97
    invoke-interface {p1, v8, v6, v7}, Ldefpackage/vo4;->c(IJ)V

    .line 98
    .line 99
    .line 100
    iget v6, p2, Ldefpackage/dd5;->l:I

    .line 101
    .line 102
    const/4 v7, 0x0

    .line 103
    if-eqz v6, :cond_19

    .line 104
    .line 105
    invoke-static {v6}, Ldefpackage/xa3;->w(I)I

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    const/4 v8, 0x0

    .line 110
    if-eqz v6, :cond_1

    .line 111
    .line 112
    if-ne v6, v2, :cond_0

    .line 113
    .line 114
    move v6, v2

    .line 115
    goto :goto_0

    .line 116
    :cond_0
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 117
    .line 118
    .line 119
    goto/16 :goto_d

    .line 120
    .line 121
    :cond_1
    move v6, v8

    .line 122
    :goto_0
    int-to-long v9, v6

    .line 123
    const/16 v6, 0xb

    .line 124
    .line 125
    invoke-interface {p1, v6, v9, v10}, Ldefpackage/vo4;->c(IJ)V

    .line 126
    .line 127
    .line 128
    iget-wide v9, p2, Ldefpackage/dd5;->m:J

    .line 129
    .line 130
    const/16 v6, 0xc

    .line 131
    .line 132
    invoke-interface {p1, v6, v9, v10}, Ldefpackage/vo4;->c(IJ)V

    .line 133
    .line 134
    .line 135
    iget-wide v9, p2, Ldefpackage/dd5;->n:J

    .line 136
    .line 137
    const/16 v6, 0xd

    .line 138
    .line 139
    invoke-interface {p1, v6, v9, v10}, Ldefpackage/vo4;->c(IJ)V

    .line 140
    .line 141
    .line 142
    iget-wide v9, p2, Ldefpackage/dd5;->o:J

    .line 143
    .line 144
    const/16 v6, 0xe

    .line 145
    .line 146
    invoke-interface {p1, v6, v9, v10}, Ldefpackage/vo4;->c(IJ)V

    .line 147
    .line 148
    .line 149
    iget-wide v9, p2, Ldefpackage/dd5;->p:J

    .line 150
    .line 151
    const/16 v6, 0xf

    .line 152
    .line 153
    invoke-interface {p1, v6, v9, v10}, Ldefpackage/vo4;->c(IJ)V

    .line 154
    .line 155
    .line 156
    iget-boolean v6, p2, Ldefpackage/dd5;->q:Z

    .line 157
    .line 158
    int-to-long v9, v6

    .line 159
    const/16 v6, 0x10

    .line 160
    .line 161
    invoke-interface {p1, v6, v9, v10}, Ldefpackage/vo4;->c(IJ)V

    .line 162
    .line 163
    .line 164
    iget v6, p2, Ldefpackage/dd5;->r:I

    .line 165
    .line 166
    if-eqz v6, :cond_18

    .line 167
    .line 168
    invoke-static {v6}, Ldefpackage/xa3;->w(I)I

    .line 169
    .line 170
    .line 171
    move-result v6

    .line 172
    if-eqz v6, :cond_3

    .line 173
    .line 174
    if-ne v6, v2, :cond_2

    .line 175
    .line 176
    move v6, v2

    .line 177
    goto :goto_1

    .line 178
    :cond_2
    invoke-static {}, Ldefpackage/er1;->n()V

    .line 179
    .line 180
    .line 181
    goto/16 :goto_d

    .line 182
    .line 183
    :cond_3
    move v6, v8

    .line 184
    :goto_1
    int-to-long v9, v6

    .line 185
    const/16 v6, 0x11

    .line 186
    .line 187
    invoke-interface {p1, v6, v9, v10}, Ldefpackage/vo4;->c(IJ)V

    .line 188
    .line 189
    .line 190
    iget v6, p2, Ldefpackage/dd5;->s:I

    .line 191
    .line 192
    int-to-long v9, v6

    .line 193
    const/16 v6, 0x12

    .line 194
    .line 195
    invoke-interface {p1, v6, v9, v10}, Ldefpackage/vo4;->c(IJ)V

    .line 196
    .line 197
    .line 198
    iget v6, p2, Ldefpackage/dd5;->t:I

    .line 199
    .line 200
    int-to-long v9, v6

    .line 201
    const/16 v6, 0x13

    .line 202
    .line 203
    invoke-interface {p1, v6, v9, v10}, Ldefpackage/vo4;->c(IJ)V

    .line 204
    .line 205
    .line 206
    const/16 v6, 0x14

    .line 207
    .line 208
    iget-wide v9, p2, Ldefpackage/dd5;->u:J

    .line 209
    .line 210
    invoke-interface {p1, v6, v9, v10}, Ldefpackage/vo4;->c(IJ)V

    .line 211
    .line 212
    .line 213
    iget v6, p2, Ldefpackage/dd5;->v:I

    .line 214
    .line 215
    int-to-long v9, v6

    .line 216
    const/16 v6, 0x15

    .line 217
    .line 218
    invoke-interface {p1, v6, v9, v10}, Ldefpackage/vo4;->c(IJ)V

    .line 219
    .line 220
    .line 221
    iget v6, p2, Ldefpackage/dd5;->w:I

    .line 222
    .line 223
    int-to-long v9, v6

    .line 224
    const/16 v6, 0x16

    .line 225
    .line 226
    invoke-interface {p1, v6, v9, v10}, Ldefpackage/vo4;->c(IJ)V

    .line 227
    .line 228
    .line 229
    iget-object v6, p2, Ldefpackage/dd5;->x:Ljava/lang/String;

    .line 230
    .line 231
    const/16 v9, 0x17

    .line 232
    .line 233
    if-nez v6, :cond_4

    .line 234
    .line 235
    invoke-interface {p1, v9}, Ldefpackage/vo4;->e(I)V

    .line 236
    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_4
    invoke-interface {p1, v9, v6}, Ldefpackage/vo4;->h(ILjava/lang/String;)V

    .line 240
    .line 241
    .line 242
    :goto_2
    iget-object p2, p2, Ldefpackage/dd5;->j:Ldefpackage/mc0;

    .line 243
    .line 244
    iget v6, p2, Ldefpackage/mc0;->a:I

    .line 245
    .line 246
    if-eqz v6, :cond_17

    .line 247
    .line 248
    invoke-static {v6}, Ldefpackage/xa3;->w(I)I

    .line 249
    .line 250
    .line 251
    move-result v7

    .line 252
    if-eqz v7, :cond_6

    .line 253
    .line 254
    if-eq v7, v2, :cond_9

    .line 255
    .line 256
    if-eq v7, v1, :cond_8

    .line 257
    .line 258
    if-eq v7, v0, :cond_a

    .line 259
    .line 260
    if-eq v7, v3, :cond_7

    .line 261
    .line 262
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 263
    .line 264
    const/16 v1, 0x1e

    .line 265
    .line 266
    if-lt v0, v1, :cond_5

    .line 267
    .line 268
    if-ne v6, v5, :cond_5

    .line 269
    .line 270
    move v0, v4

    .line 271
    goto :goto_3

    .line 272
    :cond_5
    invoke-static {v6}, Ldefpackage/b11;->y(I)Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    const-string v1, " to int"

    .line 277
    .line 278
    const-string v2, "Could not convert "

    .line 279
    .line 280
    invoke-static {v0, v1, v2}, Ldefpackage/nz2;->t(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    :cond_6
    move v0, v8

    .line 284
    goto :goto_3

    .line 285
    :cond_7
    move v0, v3

    .line 286
    goto :goto_3

    .line 287
    :cond_8
    move v0, v1

    .line 288
    goto :goto_3

    .line 289
    :cond_9
    move v0, v2

    .line 290
    :cond_a
    :goto_3
    const/16 v1, 0x18

    .line 291
    .line 292
    int-to-long v2, v0

    .line 293
    invoke-interface {p1, v1, v2, v3}, Ldefpackage/vo4;->c(IJ)V

    .line 294
    .line 295
    .line 296
    iget-object v0, p2, Ldefpackage/mc0;->b:Ldefpackage/o53;

    .line 297
    .line 298
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 302
    .line 303
    const/16 v2, 0x1c

    .line 304
    .line 305
    const/16 v3, 0x1d

    .line 306
    .line 307
    if-ge v1, v2, :cond_b

    .line 308
    .line 309
    new-array p0, v8, [B

    .line 310
    .line 311
    goto/16 :goto_a

    .line 312
    .line 313
    :cond_b
    iget-object v0, v0, Ldefpackage/o53;->a:Ljava/lang/Object;

    .line 314
    .line 315
    check-cast v0, Landroid/net/NetworkRequest;

    .line 316
    .line 317
    if-nez v0, :cond_c

    .line 318
    .line 319
    new-array p0, v8, [B

    .line 320
    .line 321
    goto/16 :goto_a

    .line 322
    .line 323
    :cond_c
    new-instance v2, Ljava/io/ByteArrayOutputStream;

    .line 324
    .line 325
    invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 326
    .line 327
    .line 328
    :try_start_0
    new-instance v4, Ljava/io/ObjectOutputStream;

    .line 329
    .line 330
    invoke-direct {v4, v2}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    .line 331
    .line 332
    .line 333
    const/16 v5, 0x1f

    .line 334
    .line 335
    if-lt v1, v5, :cond_d

    .line 336
    .line 337
    :try_start_1
    invoke-static {v0}, Ldefpackage/go2;->z(Landroid/net/NetworkRequest;)[I

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    goto :goto_5

    .line 345
    :cond_d
    new-array v1, p0, [I

    .line 346
    .line 347
    fill-array-data v1, :array_0

    .line 348
    .line 349
    .line 350
    new-instance v6, Ljava/util/ArrayList;

    .line 351
    .line 352
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 353
    .line 354
    .line 355
    move v7, v8

    .line 356
    :goto_4
    if-ge v7, p0, :cond_f

    .line 357
    .line 358
    aget v9, v1, v7

    .line 359
    .line 360
    invoke-static {v0, v9}, Ldefpackage/sr0;->s(Landroid/net/NetworkRequest;I)Z

    .line 361
    .line 362
    .line 363
    move-result v10

    .line 364
    if-eqz v10, :cond_e

    .line 365
    .line 366
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 367
    .line 368
    .line 369
    move-result-object v9

    .line 370
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    :cond_e
    add-int/lit8 v7, v7, 0x1

    .line 374
    .line 375
    goto :goto_4

    .line 376
    :cond_f
    invoke-static {v6}, Ldefpackage/q40;->P0(Ljava/util/List;)[I

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    :goto_5
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 381
    .line 382
    if-lt v1, v5, :cond_10

    .line 383
    .line 384
    invoke-static {v0}, Ldefpackage/go2;->D(Landroid/net/NetworkRequest;)[I

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    goto :goto_7

    .line 392
    :cond_10
    new-array v1, v3, [I

    .line 393
    .line 394
    fill-array-data v1, :array_1

    .line 395
    .line 396
    .line 397
    new-instance v5, Ljava/util/ArrayList;

    .line 398
    .line 399
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 400
    .line 401
    .line 402
    move v6, v8

    .line 403
    :goto_6
    if-ge v6, v3, :cond_12

    .line 404
    .line 405
    aget v7, v1, v6

    .line 406
    .line 407
    invoke-static {v0, v7}, Ldefpackage/sr0;->A(Landroid/net/NetworkRequest;I)Z

    .line 408
    .line 409
    .line 410
    move-result v9

    .line 411
    if-eqz v9, :cond_11

    .line 412
    .line 413
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 414
    .line 415
    .line 416
    move-result-object v7

    .line 417
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    :cond_11
    add-int/lit8 v6, v6, 0x1

    .line 421
    .line 422
    goto :goto_6

    .line 423
    :cond_12
    invoke-static {v5}, Ldefpackage/q40;->P0(Ljava/util/List;)[I

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    :goto_7
    array-length v1, p0

    .line 428
    invoke-virtual {v4, v1}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 429
    .line 430
    .line 431
    array-length v1, p0

    .line 432
    move v5, v8

    .line 433
    :goto_8
    if-ge v5, v1, :cond_13

    .line 434
    .line 435
    aget v6, p0, v5

    .line 436
    .line 437
    invoke-virtual {v4, v6}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 438
    .line 439
    .line 440
    add-int/lit8 v5, v5, 0x1

    .line 441
    .line 442
    goto :goto_8

    .line 443
    :catchall_0
    move-exception p0

    .line 444
    goto/16 :goto_10

    .line 445
    .line 446
    :cond_13
    array-length p0, v0

    .line 447
    invoke-virtual {v4, p0}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 448
    .line 449
    .line 450
    array-length p0, v0

    .line 451
    move v1, v8

    .line 452
    :goto_9
    if-ge v1, p0, :cond_14

    .line 453
    .line 454
    aget v5, v0, v1

    .line 455
    .line 456
    invoke-virtual {v4, v5}, Ljava/io/ObjectOutputStream;->writeInt(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 457
    .line 458
    .line 459
    add-int/lit8 v1, v1, 0x1

    .line 460
    .line 461
    goto :goto_9

    .line 462
    :cond_14
    :try_start_2
    invoke-virtual {v4}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    .line 463
    .line 464
    .line 465
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 469
    .line 470
    .line 471
    move-result-object p0

    .line 472
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    :goto_a
    const/16 v0, 0x19

    .line 476
    .line 477
    invoke-interface {p1, v0, p0}, Ldefpackage/vo4;->x(I[B)V

    .line 478
    .line 479
    .line 480
    iget-boolean p0, p2, Ldefpackage/mc0;->c:Z

    .line 481
    .line 482
    const/16 v0, 0x1a

    .line 483
    .line 484
    int-to-long v1, p0

    .line 485
    invoke-interface {p1, v0, v1, v2}, Ldefpackage/vo4;->c(IJ)V

    .line 486
    .line 487
    .line 488
    iget-boolean p0, p2, Ldefpackage/mc0;->d:Z

    .line 489
    .line 490
    const/16 v0, 0x1b

    .line 491
    .line 492
    int-to-long v1, p0

    .line 493
    invoke-interface {p1, v0, v1, v2}, Ldefpackage/vo4;->c(IJ)V

    .line 494
    .line 495
    .line 496
    iget-boolean p0, p2, Ldefpackage/mc0;->e:Z

    .line 497
    .line 498
    const/16 v0, 0x1c

    .line 499
    .line 500
    int-to-long v1, p0

    .line 501
    invoke-interface {p1, v0, v1, v2}, Ldefpackage/vo4;->c(IJ)V

    .line 502
    .line 503
    .line 504
    iget-boolean p0, p2, Ldefpackage/mc0;->f:Z

    .line 505
    .line 506
    int-to-long v0, p0

    .line 507
    invoke-interface {p1, v3, v0, v1}, Ldefpackage/vo4;->c(IJ)V

    .line 508
    .line 509
    .line 510
    const/16 p0, 0x1e

    .line 511
    .line 512
    iget-wide v0, p2, Ldefpackage/mc0;->g:J

    .line 513
    .line 514
    invoke-interface {p1, p0, v0, v1}, Ldefpackage/vo4;->c(IJ)V

    .line 515
    .line 516
    .line 517
    const/16 p0, 0x1f

    .line 518
    .line 519
    iget-wide v0, p2, Ldefpackage/mc0;->h:J

    .line 520
    .line 521
    invoke-interface {p1, p0, v0, v1}, Ldefpackage/vo4;->c(IJ)V

    .line 522
    .line 523
    .line 524
    iget-object p0, p2, Ldefpackage/mc0;->i:Ljava/util/Set;

    .line 525
    .line 526
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    .line 530
    .line 531
    .line 532
    move-result p2

    .line 533
    if-eqz p2, :cond_15

    .line 534
    .line 535
    new-array p0, v8, [B

    .line 536
    .line 537
    goto :goto_c

    .line 538
    :cond_15
    new-instance p2, Ljava/io/ByteArrayOutputStream;

    .line 539
    .line 540
    invoke-direct {p2}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 541
    .line 542
    .line 543
    :try_start_3
    new-instance v0, Ljava/io/ObjectOutputStream;

    .line 544
    .line 545
    invoke-direct {v0, p2}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 546
    .line 547
    .line 548
    :try_start_4
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 549
    .line 550
    .line 551
    move-result v1

    .line 552
    invoke-virtual {v0, v1}, Ljava/io/ObjectOutputStream;->writeInt(I)V

    .line 553
    .line 554
    .line 555
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 556
    .line 557
    .line 558
    move-result-object p0

    .line 559
    :goto_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 560
    .line 561
    .line 562
    move-result v1

    .line 563
    if-eqz v1, :cond_16

    .line 564
    .line 565
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v1

    .line 569
    check-cast v1, Ldefpackage/lc0;

    .line 570
    .line 571
    iget-object v2, v1, Ldefpackage/lc0;->a:Landroid/net/Uri;

    .line 572
    .line 573
    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 574
    .line 575
    .line 576
    move-result-object v2

    .line 577
    invoke-virtual {v0, v2}, Ljava/io/ObjectOutputStream;->writeUTF(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    iget-boolean v1, v1, Ldefpackage/lc0;->b:Z

    .line 581
    .line 582
    invoke-virtual {v0, v1}, Ljava/io/ObjectOutputStream;->writeBoolean(Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 583
    .line 584
    .line 585
    goto :goto_b

    .line 586
    :catchall_1
    move-exception p0

    .line 587
    goto :goto_e

    .line 588
    :cond_16
    :try_start_5
    invoke-virtual {v0}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 589
    .line 590
    .line 591
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 592
    .line 593
    .line 594
    invoke-virtual {p2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 595
    .line 596
    .line 597
    move-result-object p0

    .line 598
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 599
    .line 600
    .line 601
    :goto_c
    const/16 p2, 0x20

    .line 602
    .line 603
    invoke-interface {p1, p2, p0}, Ldefpackage/vo4;->x(I[B)V

    .line 604
    .line 605
    .line 606
    :goto_d
    return-void

    .line 607
    :catchall_2
    move-exception p0

    .line 608
    goto :goto_f

    .line 609
    :goto_e
    :try_start_6
    throw p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 610
    :catchall_3
    move-exception p1

    .line 611
    :try_start_7
    invoke-static {v0, p0}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 612
    .line 613
    .line 614
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 615
    :goto_f
    :try_start_8
    throw p0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 616
    :catchall_4
    move-exception p1

    .line 617
    invoke-static {p2, p0}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 618
    .line 619
    .line 620
    throw p1

    .line 621
    :catchall_5
    move-exception p0

    .line 622
    goto :goto_11

    .line 623
    :goto_10
    :try_start_9
    throw p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 624
    :catchall_6
    move-exception p1

    .line 625
    :try_start_a
    invoke-static {v4, p0}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 626
    .line 627
    .line 628
    throw p1
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    .line 629
    :goto_11
    :try_start_b
    throw p0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    .line 630
    :catchall_7
    move-exception p1

    .line 631
    invoke-static {v2, p0}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 632
    .line 633
    .line 634
    throw p1

    .line 635
    :cond_17
    throw v7

    .line 636
    :cond_18
    throw v7

    .line 637
    :cond_19
    throw v7

    .line 638
    :pswitch_1
    new-instance p0, Ljava/lang/ClassCastException;

    .line 639
    .line 640
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 641
    .line 642
    .line 643
    throw p0

    .line 644
    :pswitch_2
    check-cast p2, Ldefpackage/wc5;

    .line 645
    .line 646
    iget-object p0, p2, Ldefpackage/wc5;->a:Ljava/lang/String;

    .line 647
    .line 648
    invoke-interface {p1, v2, p0}, Ldefpackage/vo4;->h(ILjava/lang/String;)V

    .line 649
    .line 650
    .line 651
    iget-object p0, p2, Ldefpackage/wc5;->b:Ljava/lang/String;

    .line 652
    .line 653
    invoke-interface {p1, v1, p0}, Ldefpackage/vo4;->h(ILjava/lang/String;)V

    .line 654
    .line 655
    .line 656
    return-void

    .line 657
    :pswitch_3
    check-cast p2, Ldefpackage/zp4;

    .line 658
    .line 659
    iget-object p0, p2, Ldefpackage/zp4;->a:Ljava/lang/String;

    .line 660
    .line 661
    invoke-interface {p1, v2, p0}, Ldefpackage/vo4;->h(ILjava/lang/String;)V

    .line 662
    .line 663
    .line 664
    iget p0, p2, Ldefpackage/zp4;->b:I

    .line 665
    .line 666
    int-to-long v2, p0

    .line 667
    invoke-interface {p1, v1, v2, v3}, Ldefpackage/vo4;->c(IJ)V

    .line 668
    .line 669
    .line 670
    iget p0, p2, Ldefpackage/zp4;->c:I

    .line 671
    .line 672
    int-to-long v1, p0

    .line 673
    invoke-interface {p1, v0, v1, v2}, Ldefpackage/vo4;->c(IJ)V

    .line 674
    .line 675
    .line 676
    return-void

    .line 677
    :pswitch_4
    check-cast p2, Ldefpackage/fp3;

    .line 678
    .line 679
    iget-object p0, p2, Ldefpackage/fp3;->a:Ljava/lang/String;

    .line 680
    .line 681
    invoke-interface {p1, v2, p0}, Ldefpackage/vo4;->h(ILjava/lang/String;)V

    .line 682
    .line 683
    .line 684
    iget-object p0, p2, Ldefpackage/fp3;->b:Ljava/lang/Long;

    .line 685
    .line 686
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 687
    .line 688
    .line 689
    move-result-wide v2

    .line 690
    invoke-interface {p1, v1, v2, v3}, Ldefpackage/vo4;->c(IJ)V

    .line 691
    .line 692
    .line 693
    return-void

    .line 694
    :pswitch_5
    check-cast p2, Ldefpackage/to0;

    .line 695
    .line 696
    iget-object p0, p2, Ldefpackage/to0;->a:Ljava/lang/String;

    .line 697
    .line 698
    invoke-interface {p1, v2, p0}, Ldefpackage/vo4;->h(ILjava/lang/String;)V

    .line 699
    .line 700
    .line 701
    iget-object p0, p2, Ldefpackage/to0;->b:Ljava/lang/String;

    .line 702
    .line 703
    invoke-interface {p1, v1, p0}, Ldefpackage/vo4;->h(ILjava/lang/String;)V

    .line 704
    .line 705
    .line 706
    return-void

    .line 707
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :array_0
    .array-data 4
        0x2
        0x0
        0x3
        0x6
        0x9
        0x8
        0x4
        0x1
        0x5
    .end array-data

    :array_1
    .array-data 4
        0x11
        0x5
        0x2
        0xa
        0x1d
        0x13
        0x3
        0x20
        0x7
        0x4
        0xc
        0x17
        0x0
        0x21
        0x14
        0xb
        0xd
        0x12
        0x15
        0xf
        0x23
        0x22
        0x8
        0x1
        0x19
        0xe
        0x10
        0x6
        0x9
    .end array-data
.end method

.method public final m(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ldefpackage/rx1;->a()Ldefpackage/df1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :try_start_0
    invoke-virtual {p0, v0, p1}, Ldefpackage/vo0;->l(Ldefpackage/df1;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, v0, Ldefpackage/df1;->o:Landroid/database/sqlite/SQLiteStatement;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/database/sqlite/SQLiteStatement;->executeInsert()J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ldefpackage/rx1;->h(Ldefpackage/df1;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    invoke-virtual {p0, v0}, Ldefpackage/rx1;->h(Ldefpackage/df1;)V

    .line 19
    .line 20
    .line 21
    throw p1
.end method
