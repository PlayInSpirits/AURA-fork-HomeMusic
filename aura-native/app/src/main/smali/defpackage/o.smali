.class public final synthetic Ldefpackage/o;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/if1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/o;->n:I

    .line 2
    .line 3
    iput-object p2, p0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 57

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Ldefpackage/o;->n:I

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v5, 0x1

    .line 9
    packed-switch v2, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ldefpackage/qp4;

    .line 15
    .line 16
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ljava/lang/String;

    .line 19
    .line 20
    check-cast v1, Ldefpackage/x34;

    .line 21
    .line 22
    iget-object v3, v2, Ldefpackage/qp4;->b:Ljava/lang/Object;

    .line 23
    .line 24
    const-string v3, "SELECT p.* FROM playlist p JOIN synced_playlist s ON p.id = s.playlistId WHERE s.serverId = ?"

    .line 25
    .line 26
    invoke-interface {v1, v3}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    :try_start_0
    invoke-interface {v1, v5, v0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string v0, "id"

    .line 34
    .line 35
    invoke-static {v1, v0}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const-string v3, "name"

    .line 40
    .line 41
    invoke-static {v1, v3}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    const-string v7, "duration"

    .line 46
    .line 47
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    const-string v8, "coverArt"

    .line 52
    .line 53
    invoke-static {v1, v8}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    const-string v9, "comment"

    .line 58
    .line 59
    invoke-static {v1, v9}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    const-string v10, "owner"

    .line 64
    .line 65
    invoke-static {v1, v10}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v10

    .line 69
    const-string v11, "isUniversal"

    .line 70
    .line 71
    invoke-static {v1, v11}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    const-string v12, "songCount"

    .line 76
    .line 77
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v12

    .line 81
    const-string v13, "created"

    .line 82
    .line 83
    invoke-static {v1, v13}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v13

    .line 87
    const-string v14, "changed"

    .line 88
    .line 89
    invoke-static {v1, v14}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 90
    .line 91
    .line 92
    move-result v14

    .line 93
    const-string v15, "lastPlayed"

    .line 94
    .line 95
    invoke-static {v1, v15}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 96
    .line 97
    .line 98
    move-result v15

    .line 99
    const-string v4, "allowedUsers"

    .line 100
    .line 101
    invoke-static {v1, v4}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    new-instance v6, Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 108
    .line 109
    .line 110
    :goto_0
    invoke-interface {v1}, Ldefpackage/z34;->O()Z

    .line 111
    .line 112
    .line 113
    move-result v18

    .line 114
    if-eqz v18, :cond_b

    .line 115
    .line 116
    invoke-interface {v1, v0}, Ldefpackage/z34;->isNull(I)Z

    .line 117
    .line 118
    .line 119
    move-result v18

    .line 120
    if-eqz v18, :cond_0

    .line 121
    .line 122
    const/16 v20, 0x0

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_0
    invoke-interface {v1, v0}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v18

    .line 129
    move-object/from16 v20, v18

    .line 130
    .line 131
    :goto_1
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 132
    .line 133
    .line 134
    move-result v18

    .line 135
    if-eqz v18, :cond_1

    .line 136
    .line 137
    const/16 v21, 0x0

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_1
    invoke-interface {v1, v3}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v18

    .line 144
    move-object/from16 v21, v18

    .line 145
    .line 146
    :goto_2
    invoke-interface {v1, v7}, Ldefpackage/z34;->getLong(I)J

    .line 147
    .line 148
    .line 149
    move-result-wide v22

    .line 150
    invoke-interface {v1, v8}, Ldefpackage/z34;->isNull(I)Z

    .line 151
    .line 152
    .line 153
    move-result v18

    .line 154
    if-eqz v18, :cond_2

    .line 155
    .line 156
    const/16 v24, 0x0

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_2
    invoke-interface {v1, v8}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v18

    .line 163
    move-object/from16 v24, v18

    .line 164
    .line 165
    :goto_3
    new-instance v19, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 166
    .line 167
    invoke-direct/range {v19 .. v24}, Lcom/eddyizm/tempus/subsonic/models/Playlist;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 168
    .line 169
    .line 170
    move-object/from16 v5, v19

    .line 171
    .line 172
    invoke-interface {v1, v9}, Ldefpackage/z34;->isNull(I)Z

    .line 173
    .line 174
    .line 175
    move-result v19

    .line 176
    if-eqz v19, :cond_3

    .line 177
    .line 178
    move/from16 p0, v0

    .line 179
    .line 180
    const/4 v0, 0x0

    .line 181
    goto :goto_4

    .line 182
    :cond_3
    invoke-interface {v1, v9}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v19

    .line 186
    move/from16 p0, v0

    .line 187
    .line 188
    move-object/from16 v0, v19

    .line 189
    .line 190
    :goto_4
    invoke-virtual {v5, v0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setComment(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-interface {v1, v10}, Ldefpackage/z34;->isNull(I)Z

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    if-eqz v0, :cond_4

    .line 198
    .line 199
    const/4 v0, 0x0

    .line 200
    goto :goto_5

    .line 201
    :cond_4
    invoke-interface {v1, v10}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    :goto_5
    invoke-virtual {v5, v0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setOwner(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    invoke-interface {v1, v11}, Ldefpackage/z34;->isNull(I)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-eqz v0, :cond_5

    .line 213
    .line 214
    move/from16 p1, v7

    .line 215
    .line 216
    move v0, v8

    .line 217
    const/4 v7, 0x0

    .line 218
    goto :goto_6

    .line 219
    :cond_5
    move/from16 p1, v7

    .line 220
    .line 221
    move v0, v8

    .line 222
    invoke-interface {v1, v11}, Ldefpackage/z34;->getLong(I)J

    .line 223
    .line 224
    .line 225
    move-result-wide v7

    .line 226
    long-to-int v7, v7

    .line 227
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    :goto_6
    if-nez v7, :cond_6

    .line 232
    .line 233
    const/4 v7, 0x0

    .line 234
    goto :goto_8

    .line 235
    :cond_6
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 236
    .line 237
    .line 238
    move-result v7

    .line 239
    if-eqz v7, :cond_7

    .line 240
    .line 241
    const/4 v7, 0x1

    .line 242
    goto :goto_7

    .line 243
    :cond_7
    const/4 v7, 0x0

    .line 244
    :goto_7
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 245
    .line 246
    .line 247
    move-result-object v7

    .line 248
    :goto_8
    invoke-virtual {v5, v7}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setUniversal(Ljava/lang/Boolean;)V

    .line 249
    .line 250
    .line 251
    invoke-interface {v1, v12}, Ldefpackage/z34;->getLong(I)J

    .line 252
    .line 253
    .line 254
    move-result-wide v7

    .line 255
    long-to-int v7, v7

    .line 256
    invoke-virtual {v5, v7}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setSongCount(I)V

    .line 257
    .line 258
    .line 259
    invoke-interface {v1, v13}, Ldefpackage/z34;->isNull(I)Z

    .line 260
    .line 261
    .line 262
    move-result v7

    .line 263
    if-eqz v7, :cond_8

    .line 264
    .line 265
    const/4 v7, 0x0

    .line 266
    goto :goto_9

    .line 267
    :cond_8
    invoke-interface {v1, v13}, Ldefpackage/z34;->getLong(I)J

    .line 268
    .line 269
    .line 270
    move-result-wide v7

    .line 271
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 272
    .line 273
    .line 274
    move-result-object v7

    .line 275
    :goto_9
    invoke-static {v7}, Ldefpackage/i80;->B(Ljava/lang/Long;)Ljava/util/Date;

    .line 276
    .line 277
    .line 278
    move-result-object v7

    .line 279
    invoke-virtual {v5, v7}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setCreated(Ljava/util/Date;)V

    .line 280
    .line 281
    .line 282
    invoke-interface {v1, v14}, Ldefpackage/z34;->isNull(I)Z

    .line 283
    .line 284
    .line 285
    move-result v7

    .line 286
    if-eqz v7, :cond_9

    .line 287
    .line 288
    const/4 v7, 0x0

    .line 289
    goto :goto_a

    .line 290
    :cond_9
    invoke-interface {v1, v14}, Ldefpackage/z34;->getLong(I)J

    .line 291
    .line 292
    .line 293
    move-result-wide v7

    .line 294
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 295
    .line 296
    .line 297
    move-result-object v7

    .line 298
    :goto_a
    invoke-static {v7}, Ldefpackage/i80;->B(Ljava/lang/Long;)Ljava/util/Date;

    .line 299
    .line 300
    .line 301
    move-result-object v7

    .line 302
    invoke-virtual {v5, v7}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setChanged(Ljava/util/Date;)V

    .line 303
    .line 304
    .line 305
    invoke-interface {v1, v15}, Ldefpackage/z34;->getLong(I)J

    .line 306
    .line 307
    .line 308
    move-result-wide v7

    .line 309
    invoke-virtual {v5, v7, v8}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setLastPlayed(J)V

    .line 310
    .line 311
    .line 312
    invoke-interface {v1, v4}, Ldefpackage/z34;->isNull(I)Z

    .line 313
    .line 314
    .line 315
    move-result v7

    .line 316
    if-eqz v7, :cond_a

    .line 317
    .line 318
    const/4 v7, 0x0

    .line 319
    goto :goto_b

    .line 320
    :cond_a
    invoke-interface {v1, v4}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v7

    .line 324
    :goto_b
    iget-object v8, v2, Ldefpackage/qp4;->c:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v8, Ldefpackage/si1;

    .line 327
    .line 328
    invoke-virtual {v8, v7}, Ldefpackage/si1;->E(Ljava/lang/String;)Ljava/util/List;

    .line 329
    .line 330
    .line 331
    move-result-object v7

    .line 332
    invoke-virtual {v5, v7}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setAllowedUsers(Ljava/util/List;)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 336
    .line 337
    .line 338
    move/from16 v7, p1

    .line 339
    .line 340
    move v8, v0

    .line 341
    const/4 v5, 0x1

    .line 342
    move/from16 v0, p0

    .line 343
    .line 344
    goto/16 :goto_0

    .line 345
    .line 346
    :catchall_0
    move-exception v0

    .line 347
    goto :goto_c

    .line 348
    :cond_b
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 349
    .line 350
    .line 351
    return-object v6

    .line 352
    :goto_c
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 353
    .line 354
    .line 355
    throw v0

    .line 356
    :pswitch_0
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v2, Ldefpackage/jg3;

    .line 359
    .line 360
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v0, Ldefpackage/we4;

    .line 363
    .line 364
    check-cast v1, Ldefpackage/ig3;

    .line 365
    .line 366
    iget-object v0, v0, Ldefpackage/we4;->M:Ldefpackage/kl3;

    .line 367
    .line 368
    invoke-static {v1, v2, v0}, Ldefpackage/ig3;->q(Ldefpackage/ig3;Ldefpackage/jg3;Ldefpackage/if1;)V

    .line 369
    .line 370
    .line 371
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 372
    .line 373
    return-object v0

    .line 374
    :pswitch_1
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 375
    .line 376
    check-cast v2, Ldefpackage/e74;

    .line 377
    .line 378
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v0, Ldefpackage/g74;

    .line 381
    .line 382
    check-cast v1, Ldefpackage/xu0;

    .line 383
    .line 384
    iget-boolean v4, v1, Ldefpackage/xu0;->b:Z

    .line 385
    .line 386
    if-eqz v4, :cond_c

    .line 387
    .line 388
    const/high16 v4, -0x40800000    # -1.0f

    .line 389
    .line 390
    goto :goto_d

    .line 391
    :cond_c
    const/high16 v4, 0x3f800000    # 1.0f

    .line 392
    .line 393
    :goto_d
    iget-wide v5, v1, Ldefpackage/xu0;->a:J

    .line 394
    .line 395
    iget-object v0, v0, Ldefpackage/g74;->d:Ldefpackage/hb3;

    .line 396
    .line 397
    sget-object v1, Ldefpackage/hb3;->o:Ldefpackage/hb3;

    .line 398
    .line 399
    if-ne v0, v1, :cond_d

    .line 400
    .line 401
    const/4 v0, 0x1

    .line 402
    invoke-static {v0, v5, v6}, Ldefpackage/g83;->a(IJ)J

    .line 403
    .line 404
    .line 405
    move-result-wide v5

    .line 406
    goto :goto_e

    .line 407
    :cond_d
    const/4 v0, 0x1

    .line 408
    invoke-static {v3, v5, v6}, Ldefpackage/g83;->a(IJ)J

    .line 409
    .line 410
    .line 411
    move-result-wide v5

    .line 412
    :goto_e
    invoke-static {v5, v6, v4}, Ldefpackage/g83;->f(JF)J

    .line 413
    .line 414
    .line 415
    move-result-wide v3

    .line 416
    invoke-virtual {v2, v0, v3, v4}, Ldefpackage/e74;->a(IJ)J

    .line 417
    .line 418
    .line 419
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 420
    .line 421
    return-object v0

    .line 422
    :pswitch_2
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 423
    .line 424
    check-cast v2, Ldefpackage/tv3;

    .line 425
    .line 426
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 427
    .line 428
    check-cast v0, Ljava/lang/Throwable;

    .line 429
    .line 430
    check-cast v1, Ljava/lang/Throwable;

    .line 431
    .line 432
    iget-object v3, v2, Ldefpackage/tv3;->c:Ljava/lang/Object;

    .line 433
    .line 434
    monitor-enter v3

    .line 435
    if-eqz v0, :cond_f

    .line 436
    .line 437
    if-eqz v1, :cond_10

    .line 438
    .line 439
    :try_start_1
    instance-of v4, v1, Ljava/util/concurrent/CancellationException;

    .line 440
    .line 441
    if-nez v4, :cond_e

    .line 442
    .line 443
    goto :goto_f

    .line 444
    :cond_e
    const/4 v1, 0x0

    .line 445
    :goto_f
    if-eqz v1, :cond_10

    .line 446
    .line 447
    invoke-static {v0, v1}, Ldefpackage/j51;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 448
    .line 449
    .line 450
    goto :goto_10

    .line 451
    :catchall_1
    move-exception v0

    .line 452
    goto :goto_11

    .line 453
    :cond_f
    const/4 v0, 0x0

    .line 454
    :cond_10
    :goto_10
    iput-object v0, v2, Ldefpackage/tv3;->e:Ljava/lang/Throwable;

    .line 455
    .line 456
    iget-object v0, v2, Ldefpackage/tv3;->u:Ldefpackage/nl4;

    .line 457
    .line 458
    sget-object v1, Ldefpackage/ov3;->n:Ldefpackage/ov3;

    .line 459
    .line 460
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    const/4 v2, 0x0

    .line 464
    invoke-virtual {v0, v2, v1}, Ldefpackage/nl4;->j(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 465
    .line 466
    .line 467
    monitor-exit v3

    .line 468
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 469
    .line 470
    return-object v0

    .line 471
    :goto_11
    monitor-exit v3

    .line 472
    throw v0

    .line 473
    :pswitch_3
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 474
    .line 475
    check-cast v2, Ldefpackage/z80;

    .line 476
    .line 477
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 478
    .line 479
    check-cast v0, Ldefpackage/x03;

    .line 480
    .line 481
    invoke-virtual {v2, v1}, Ldefpackage/z80;->z(Ljava/lang/Object;)V

    .line 482
    .line 483
    .line 484
    if-eqz v0, :cond_11

    .line 485
    .line 486
    invoke-virtual {v0, v1}, Ldefpackage/x03;->a(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    :cond_11
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 490
    .line 491
    return-object v0

    .line 492
    :pswitch_4
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v2, Ldefpackage/rm3;

    .line 495
    .line 496
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 497
    .line 498
    check-cast v0, Ljava/util/ArrayList;

    .line 499
    .line 500
    check-cast v1, Ldefpackage/x34;

    .line 501
    .line 502
    iget-object v2, v2, Ldefpackage/rm3;->o:Ljava/lang/Object;

    .line 503
    .line 504
    check-cast v2, Ldefpackage/q20;

    .line 505
    .line 506
    invoke-virtual {v2, v1, v0}, Ldefpackage/au0;->H(Ldefpackage/x34;Ljava/lang/Iterable;)V

    .line 507
    .line 508
    .line 509
    const/16 v17, 0x0

    .line 510
    .line 511
    return-object v17

    .line 512
    :pswitch_5
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 513
    .line 514
    check-cast v2, Ljava/lang/Boolean;

    .line 515
    .line 516
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 517
    .line 518
    check-cast v0, Ljava/lang/String;

    .line 519
    .line 520
    check-cast v1, Ldefpackage/x34;

    .line 521
    .line 522
    const-string v4, "UPDATE playlist SET isUniversal = ? WHERE id = ?"

    .line 523
    .line 524
    invoke-interface {v1, v4}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    if-nez v2, :cond_12

    .line 529
    .line 530
    const/4 v2, 0x0

    .line 531
    goto :goto_12

    .line 532
    :cond_12
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 533
    .line 534
    .line 535
    move-result v2

    .line 536
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    :goto_12
    if-nez v2, :cond_13

    .line 541
    .line 542
    const/4 v4, 0x1

    .line 543
    invoke-interface {v1, v4}, Ldefpackage/z34;->e(I)V

    .line 544
    .line 545
    .line 546
    goto :goto_13

    .line 547
    :catchall_2
    move-exception v0

    .line 548
    goto :goto_15

    .line 549
    :cond_13
    const/4 v4, 0x1

    .line 550
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 551
    .line 552
    .line 553
    move-result v2

    .line 554
    int-to-long v5, v2

    .line 555
    invoke-interface {v1, v4, v5, v6}, Ldefpackage/z34;->c(IJ)V

    .line 556
    .line 557
    .line 558
    :goto_13
    if-nez v0, :cond_14

    .line 559
    .line 560
    invoke-interface {v1, v3}, Ldefpackage/z34;->e(I)V

    .line 561
    .line 562
    .line 563
    goto :goto_14

    .line 564
    :cond_14
    invoke-interface {v1, v3, v0}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 565
    .line 566
    .line 567
    :goto_14
    invoke-interface {v1}, Ldefpackage/z34;->O()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 568
    .line 569
    .line 570
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 571
    .line 572
    .line 573
    const/16 v17, 0x0

    .line 574
    .line 575
    return-object v17

    .line 576
    :goto_15
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 577
    .line 578
    .line 579
    throw v0

    .line 580
    :pswitch_6
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 581
    .line 582
    check-cast v2, Ldefpackage/ml3;

    .line 583
    .line 584
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 585
    .line 586
    check-cast v0, Ljava/util/List;

    .line 587
    .line 588
    check-cast v1, Ldefpackage/x34;

    .line 589
    .line 590
    iget-object v2, v2, Ldefpackage/ml3;->b:Ljava/lang/Object;

    .line 591
    .line 592
    check-cast v2, Ldefpackage/ll3;

    .line 593
    .line 594
    invoke-virtual {v2, v1, v0}, Ldefpackage/au0;->H(Ldefpackage/x34;Ljava/lang/Iterable;)V

    .line 595
    .line 596
    .line 597
    const/16 v17, 0x0

    .line 598
    .line 599
    return-object v17

    .line 600
    :pswitch_7
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 601
    .line 602
    check-cast v2, Ldefpackage/b13;

    .line 603
    .line 604
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 605
    .line 606
    check-cast v0, Ljava/util/ArrayList;

    .line 607
    .line 608
    check-cast v1, Ldefpackage/ig3;

    .line 609
    .line 610
    new-instance v3, Ldefpackage/oc3;

    .line 611
    .line 612
    const/4 v4, 0x0

    .line 613
    invoke-direct {v3, v4, v0}, Ldefpackage/oc3;-><init>(ILjava/util/ArrayList;)V

    .line 614
    .line 615
    .line 616
    const/4 v0, 0x1

    .line 617
    iput-boolean v0, v1, Ldefpackage/ig3;->n:Z

    .line 618
    .line 619
    invoke-virtual {v3, v1}, Ldefpackage/oc3;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    iput-boolean v4, v1, Ldefpackage/ig3;->n:Z

    .line 623
    .line 624
    invoke-interface {v2}, Ldefpackage/kl4;->getValue()Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 628
    .line 629
    return-object v0

    .line 630
    :pswitch_8
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 631
    .line 632
    check-cast v2, Ldefpackage/wf1;

    .line 633
    .line 634
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v0, Ldefpackage/qp4;

    .line 637
    .line 638
    check-cast v1, Ldefpackage/vp3;

    .line 639
    .line 640
    iget v1, v1, Ldefpackage/vp3;->a:I

    .line 641
    .line 642
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    invoke-virtual {v0}, Ldefpackage/qp4;->e()Ldefpackage/qc3;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    iget v0, v0, Ldefpackage/qc3;->b:I

    .line 651
    .line 652
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 653
    .line 654
    .line 655
    move-result-object v0

    .line 656
    invoke-interface {v2, v1, v0}, Ldefpackage/wf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 660
    .line 661
    return-object v0

    .line 662
    :pswitch_9
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 663
    .line 664
    check-cast v2, Ldefpackage/kz2;

    .line 665
    .line 666
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 667
    .line 668
    check-cast v0, Ldefpackage/y94;

    .line 669
    .line 670
    iget-object v2, v2, Ldefpackage/kz2;->c:Ljava/util/ArrayList;

    .line 671
    .line 672
    new-instance v3, Ldefpackage/hz2;

    .line 673
    .line 674
    invoke-direct {v3, v1, v0}, Ldefpackage/hz2;-><init>(Ljava/lang/Object;Ldefpackage/y94;)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 678
    .line 679
    .line 680
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 681
    .line 682
    return-object v0

    .line 683
    :pswitch_a
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 684
    .line 685
    check-cast v2, Ldefpackage/rf2;

    .line 686
    .line 687
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 688
    .line 689
    check-cast v0, Lcom/eddyizm/tempus/model/LyricsCache;

    .line 690
    .line 691
    check-cast v1, Ldefpackage/x34;

    .line 692
    .line 693
    iget-object v2, v2, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 694
    .line 695
    check-cast v2, Ldefpackage/q20;

    .line 696
    .line 697
    invoke-virtual {v2, v1, v0}, Ldefpackage/au0;->I(Ldefpackage/x34;Ljava/lang/Object;)V

    .line 698
    .line 699
    .line 700
    const/16 v17, 0x0

    .line 701
    .line 702
    return-object v17

    .line 703
    :pswitch_b
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v2, Ldefpackage/oe2;

    .line 706
    .line 707
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 708
    .line 709
    check-cast v0, Lcom/eddyizm/tempus/model/Server;

    .line 710
    .line 711
    check-cast v1, Ljava/util/List;

    .line 712
    .line 713
    const-string v3, "serverList"

    .line 714
    .line 715
    invoke-static {v0}, Ldefpackage/gb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 716
    .line 717
    .line 718
    move-result-object v0

    .line 719
    const/16 v4, 0xa

    .line 720
    .line 721
    if-eqz v1, :cond_15

    .line 722
    .line 723
    new-instance v5, Ljava/util/ArrayList;

    .line 724
    .line 725
    invoke-static {v1, v4}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 726
    .line 727
    .line 728
    move-result v6

    .line 729
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 730
    .line 731
    .line 732
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 733
    .line 734
    .line 735
    move-result-object v1

    .line 736
    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 737
    .line 738
    .line 739
    move-result v6

    .line 740
    if-eqz v6, :cond_16

    .line 741
    .line 742
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v6

    .line 746
    check-cast v6, Lcom/eddyizm/tempus/model/Server;

    .line 747
    .line 748
    new-instance v19, Lcom/eddyizm/tempus/model/Server;

    .line 749
    .line 750
    invoke-virtual {v6}, Lcom/eddyizm/tempus/model/Server;->getServerId()Ljava/lang/String;

    .line 751
    .line 752
    .line 753
    move-result-object v20

    .line 754
    invoke-virtual {v6}, Lcom/eddyizm/tempus/model/Server;->getServerName()Ljava/lang/String;

    .line 755
    .line 756
    .line 757
    move-result-object v21

    .line 758
    invoke-virtual {v6}, Lcom/eddyizm/tempus/model/Server;->getUsername()Ljava/lang/String;

    .line 759
    .line 760
    .line 761
    move-result-object v22

    .line 762
    invoke-virtual {v6}, Lcom/eddyizm/tempus/model/Server;->getPassword()Ljava/lang/String;

    .line 763
    .line 764
    .line 765
    move-result-object v23

    .line 766
    invoke-virtual {v6}, Lcom/eddyizm/tempus/model/Server;->getAddress()Ljava/lang/String;

    .line 767
    .line 768
    .line 769
    move-result-object v24

    .line 770
    invoke-virtual {v6}, Lcom/eddyizm/tempus/model/Server;->getLocalAddress()Ljava/lang/String;

    .line 771
    .line 772
    .line 773
    move-result-object v25

    .line 774
    invoke-virtual {v6}, Lcom/eddyizm/tempus/model/Server;->getTimestamp()J

    .line 775
    .line 776
    .line 777
    move-result-wide v26

    .line 778
    invoke-virtual {v6}, Lcom/eddyizm/tempus/model/Server;->isLowSecurity()Z

    .line 779
    .line 780
    .line 781
    move-result v28

    .line 782
    invoke-virtual {v6}, Lcom/eddyizm/tempus/model/Server;->getClientCert()Ljava/lang/String;

    .line 783
    .line 784
    .line 785
    move-result-object v29

    .line 786
    invoke-direct/range {v19 .. v29}, Lcom/eddyizm/tempus/model/Server;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;)V

    .line 787
    .line 788
    .line 789
    move-object/from16 v6, v19

    .line 790
    .line 791
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 792
    .line 793
    .line 794
    goto :goto_16

    .line 795
    :cond_15
    sget-object v5, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 796
    .line 797
    :cond_16
    invoke-static {v0, v5}, Ldefpackage/q40;->G0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    iput-object v0, v2, Ldefpackage/oe2;->n0:Ljava/util/ArrayList;

    .line 802
    .line 803
    invoke-virtual {v2}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    iget-object v1, v2, Ldefpackage/oe2;->n0:Ljava/util/ArrayList;

    .line 808
    .line 809
    if-eqz v1, :cond_1b

    .line 810
    .line 811
    new-instance v5, Ljava/util/ArrayList;

    .line 812
    .line 813
    invoke-static {v1, v4}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 814
    .line 815
    .line 816
    move-result v4

    .line 817
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 818
    .line 819
    .line 820
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 821
    .line 822
    .line 823
    move-result v4

    .line 824
    const/4 v6, 0x0

    .line 825
    :goto_17
    if-ge v6, v4, :cond_17

    .line 826
    .line 827
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v7

    .line 831
    add-int/lit8 v6, v6, 0x1

    .line 832
    .line 833
    check-cast v7, Lcom/eddyizm/tempus/model/Server;

    .line 834
    .line 835
    invoke-virtual {v7}, Lcom/eddyizm/tempus/model/Server;->getServerName()Ljava/lang/String;

    .line 836
    .line 837
    .line 838
    move-result-object v7

    .line 839
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 840
    .line 841
    .line 842
    goto :goto_17

    .line 843
    :cond_17
    const/4 v6, 0x0

    .line 844
    new-array v1, v6, [Ljava/lang/String;

    .line 845
    .line 846
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 847
    .line 848
    .line 849
    move-result-object v1

    .line 850
    new-instance v4, Landroid/widget/ArrayAdapter;

    .line 851
    .line 852
    const v5, 0x7f0d00b4

    .line 853
    .line 854
    .line 855
    invoke-direct {v4, v0, v5, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;I[Ljava/lang/Object;)V

    .line 856
    .line 857
    .line 858
    invoke-virtual {v4, v5}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 859
    .line 860
    .line 861
    iget-object v0, v2, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 862
    .line 863
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 864
    .line 865
    .line 866
    iget-object v0, v0, Ldefpackage/pc1;->p:Landroid/view/View;

    .line 867
    .line 868
    check-cast v0, Landroid/widget/AutoCompleteTextView;

    .line 869
    .line 870
    invoke-virtual {v0, v4}, Landroid/widget/AutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 871
    .line 872
    .line 873
    iget-boolean v0, v2, Ldefpackage/oe2;->p0:Z

    .line 874
    .line 875
    if-nez v0, :cond_1a

    .line 876
    .line 877
    iget-object v0, v2, Ldefpackage/oe2;->n0:Ljava/util/ArrayList;

    .line 878
    .line 879
    if-eqz v0, :cond_19

    .line 880
    .line 881
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 882
    .line 883
    .line 884
    move-result v0

    .line 885
    if-nez v0, :cond_1a

    .line 886
    .line 887
    iget-object v0, v2, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 888
    .line 889
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 890
    .line 891
    .line 892
    iget-object v0, v0, Ldefpackage/pc1;->p:Landroid/view/View;

    .line 893
    .line 894
    check-cast v0, Landroid/widget/AutoCompleteTextView;

    .line 895
    .line 896
    iget-object v1, v2, Ldefpackage/oe2;->n0:Ljava/util/ArrayList;

    .line 897
    .line 898
    if-eqz v1, :cond_18

    .line 899
    .line 900
    const/4 v4, 0x0

    .line 901
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 902
    .line 903
    .line 904
    move-result-object v1

    .line 905
    check-cast v1, Lcom/eddyizm/tempus/model/Server;

    .line 906
    .line 907
    invoke-virtual {v1}, Lcom/eddyizm/tempus/model/Server;->getServerName()Ljava/lang/String;

    .line 908
    .line 909
    .line 910
    move-result-object v1

    .line 911
    invoke-virtual {v0, v1, v4}, Landroid/widget/AutoCompleteTextView;->setText(Ljava/lang/CharSequence;Z)V

    .line 912
    .line 913
    .line 914
    iget-object v0, v2, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 915
    .line 916
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 917
    .line 918
    .line 919
    iget-object v0, v0, Ldefpackage/pc1;->c:Landroid/widget/TextView;

    .line 920
    .line 921
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 922
    .line 923
    const v1, 0x7f13027b

    .line 924
    .line 925
    .line 926
    invoke-virtual {v2, v1}, Ldefpackage/kc1;->s(I)Ljava/lang/String;

    .line 927
    .line 928
    .line 929
    move-result-object v1

    .line 930
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 931
    .line 932
    .line 933
    iget-object v0, v2, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 934
    .line 935
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 936
    .line 937
    .line 938
    iget-object v0, v0, Ldefpackage/pc1;->d:Landroid/widget/TextView;

    .line 939
    .line 940
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 941
    .line 942
    const/4 v4, 0x0

    .line 943
    invoke-virtual {v0, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 944
    .line 945
    .line 946
    iget-object v0, v2, Ldefpackage/oe2;->l0:Ldefpackage/pc1;

    .line 947
    .line 948
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 949
    .line 950
    .line 951
    iget-object v0, v0, Ldefpackage/pc1;->q:Landroid/view/View;

    .line 952
    .line 953
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 954
    .line 955
    invoke-virtual {v0, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 956
    .line 957
    .line 958
    const/4 v0, 0x1

    .line 959
    iput-boolean v0, v2, Ldefpackage/oe2;->p0:Z

    .line 960
    .line 961
    goto :goto_18

    .line 962
    :cond_18
    invoke-static {v3}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 963
    .line 964
    .line 965
    const/16 v17, 0x0

    .line 966
    .line 967
    throw v17

    .line 968
    :cond_19
    const/16 v17, 0x0

    .line 969
    .line 970
    invoke-static {v3}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 971
    .line 972
    .line 973
    throw v17

    .line 974
    :cond_1a
    :goto_18
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 975
    .line 976
    return-object v0

    .line 977
    :cond_1b
    const/16 v17, 0x0

    .line 978
    .line 979
    invoke-static {v3}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 980
    .line 981
    .line 982
    throw v17

    .line 983
    :pswitch_c
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 984
    .line 985
    check-cast v2, Ldefpackage/x44;

    .line 986
    .line 987
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 988
    .line 989
    check-cast v0, Ldefpackage/w44;

    .line 990
    .line 991
    check-cast v1, Ljava/util/Map;

    .line 992
    .line 993
    new-instance v3, Ldefpackage/z82;

    .line 994
    .line 995
    invoke-direct {v3, v2, v1, v0}, Ldefpackage/z82;-><init>(Ldefpackage/x44;Ljava/util/Map;Ldefpackage/w44;)V

    .line 996
    .line 997
    .line 998
    return-object v3

    .line 999
    :pswitch_d
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 1000
    .line 1001
    check-cast v2, Ldefpackage/z82;

    .line 1002
    .line 1003
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 1004
    .line 1005
    check-cast v1, Ldefpackage/yr0;

    .line 1006
    .line 1007
    iget-object v1, v2, Ldefpackage/z82;->p:Ldefpackage/x03;

    .line 1008
    .line 1009
    invoke-virtual {v1, v0}, Ldefpackage/x03;->i(Ljava/lang/Object;)V

    .line 1010
    .line 1011
    .line 1012
    new-instance v1, Ldefpackage/vy1;

    .line 1013
    .line 1014
    const/4 v4, 0x1

    .line 1015
    invoke-direct {v1, v4, v2, v0}, Ldefpackage/vy1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1016
    .line 1017
    .line 1018
    return-object v1

    .line 1019
    :pswitch_e
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 1020
    .line 1021
    check-cast v2, Ldefpackage/jx3;

    .line 1022
    .line 1023
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 1024
    .line 1025
    check-cast v0, Ljava/util/ArrayList;

    .line 1026
    .line 1027
    check-cast v1, Lorg/json/JSONObject;

    .line 1028
    .line 1029
    const-string v3, "revision"

    .line 1030
    .line 1031
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1032
    .line 1033
    .line 1034
    iget-object v4, v2, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 1035
    .line 1036
    if-eqz v4, :cond_1c

    .line 1037
    .line 1038
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v5

    .line 1042
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1043
    .line 1044
    .line 1045
    move-result v4

    .line 1046
    if-nez v4, :cond_1c

    .line 1047
    .line 1048
    sget-object v0, Ldefpackage/u52;->b:Ldefpackage/k03;

    .line 1049
    .line 1050
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v1

    .line 1054
    const v2, 0x7f1302d3

    .line 1055
    .line 1056
    .line 1057
    const v3, 0x1ffdffff

    .line 1058
    .line 1059
    .line 1060
    const/4 v4, 0x0

    .line 1061
    invoke-static {v1, v4, v4, v2, v3}, Ldefpackage/v52;->a(Ldefpackage/v52;IIII)Ldefpackage/v52;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v1

    .line 1065
    invoke-virtual {v0, v1}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 1066
    .line 1067
    .line 1068
    sput-boolean v4, Ldefpackage/u52;->e:Z

    .line 1069
    .line 1070
    goto/16 :goto_1d

    .line 1071
    .line 1072
    :cond_1c
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v3

    .line 1076
    iput-object v3, v2, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 1077
    .line 1078
    const-string v3, "items"

    .line 1079
    .line 1080
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v3

    .line 1084
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 1085
    .line 1086
    .line 1087
    move-result v4

    .line 1088
    const/4 v5, 0x0

    .line 1089
    :goto_19
    if-ge v5, v4, :cond_20

    .line 1090
    .line 1091
    invoke-virtual {v3, v5}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v6

    .line 1095
    const-string v7, "id"

    .line 1096
    .line 1097
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v19

    .line 1101
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1102
    .line 1103
    .line 1104
    const-string v7, "title"

    .line 1105
    .line 1106
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v22

    .line 1110
    const-string v7, "artist"

    .line 1111
    .line 1112
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v24

    .line 1116
    const-string v7, "album"

    .line 1117
    .line 1118
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v23

    .line 1122
    const-string v7, "cover"

    .line 1123
    .line 1124
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v28

    .line 1128
    const-string v7, "duration"

    .line 1129
    .line 1130
    invoke-virtual {v6, v7}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 1131
    .line 1132
    .line 1133
    move-result v7

    .line 1134
    const-string v8, "albumId"

    .line 1135
    .line 1136
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v8

    .line 1140
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1141
    .line 1142
    .line 1143
    invoke-static {v8}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 1144
    .line 1145
    .line 1146
    move-result v9

    .line 1147
    if-nez v9, :cond_1d

    .line 1148
    .line 1149
    move-object/from16 v46, v8

    .line 1150
    .line 1151
    goto :goto_1a

    .line 1152
    :cond_1d
    const/16 v46, 0x0

    .line 1153
    .line 1154
    :goto_1a
    const-string v8, "artistId"

    .line 1155
    .line 1156
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v8

    .line 1160
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1161
    .line 1162
    .line 1163
    invoke-static {v8}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 1164
    .line 1165
    .line 1166
    move-result v9

    .line 1167
    if-nez v9, :cond_1e

    .line 1168
    .line 1169
    move-object/from16 v47, v8

    .line 1170
    .line 1171
    goto :goto_1b

    .line 1172
    :cond_1e
    const/16 v47, 0x0

    .line 1173
    .line 1174
    :goto_1b
    const-string v8, "suffix"

    .line 1175
    .line 1176
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v8

    .line 1180
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1181
    .line 1182
    .line 1183
    invoke-static {v8}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 1184
    .line 1185
    .line 1186
    move-result v9

    .line 1187
    if-nez v9, :cond_1f

    .line 1188
    .line 1189
    move-object/from16 v31, v8

    .line 1190
    .line 1191
    goto :goto_1c

    .line 1192
    :cond_1f
    const/16 v31, 0x0

    .line 1193
    .line 1194
    :goto_1c
    const-string v8, "bitrate"

    .line 1195
    .line 1196
    invoke-virtual {v6, v8}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 1197
    .line 1198
    .line 1199
    move-result v6

    .line 1200
    new-instance v18, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 1201
    .line 1202
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v34

    .line 1206
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v35

    .line 1210
    const/16 v55, 0x7

    .line 1211
    .line 1212
    const/16 v56, 0x0

    .line 1213
    .line 1214
    const/16 v20, 0x0

    .line 1215
    .line 1216
    const/16 v21, 0x0

    .line 1217
    .line 1218
    const/16 v25, 0x0

    .line 1219
    .line 1220
    const/16 v26, 0x0

    .line 1221
    .line 1222
    const/16 v27, 0x0

    .line 1223
    .line 1224
    const/16 v29, 0x0

    .line 1225
    .line 1226
    const/16 v30, 0x0

    .line 1227
    .line 1228
    const/16 v32, 0x0

    .line 1229
    .line 1230
    const/16 v33, 0x0

    .line 1231
    .line 1232
    const/16 v36, 0x0

    .line 1233
    .line 1234
    const/16 v37, 0x0

    .line 1235
    .line 1236
    const/16 v38, 0x0

    .line 1237
    .line 1238
    const/16 v39, 0x0

    .line 1239
    .line 1240
    const/16 v40, 0x0

    .line 1241
    .line 1242
    const/16 v41, 0x0

    .line 1243
    .line 1244
    const/16 v42, 0x0

    .line 1245
    .line 1246
    const/16 v43, 0x0

    .line 1247
    .line 1248
    const/16 v44, 0x0

    .line 1249
    .line 1250
    const/16 v45, 0x0

    .line 1251
    .line 1252
    const/16 v48, 0x0

    .line 1253
    .line 1254
    const/16 v49, 0x0

    .line 1255
    .line 1256
    const/16 v50, 0x0

    .line 1257
    .line 1258
    const/16 v51, 0x0

    .line 1259
    .line 1260
    const/16 v52, 0x0

    .line 1261
    .line 1262
    const/16 v53, 0x0

    .line 1263
    .line 1264
    const v54, -0x1801923a

    .line 1265
    .line 1266
    .line 1267
    invoke-direct/range {v18 .. v56}, Lcom/eddyizm/tempus/subsonic/models/Child;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;Ljava/lang/String;IILdefpackage/xj0;)V

    .line 1268
    .line 1269
    .line 1270
    move-object/from16 v6, v18

    .line 1271
    .line 1272
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1273
    .line 1274
    .line 1275
    add-int/lit8 v5, v5, 0x1

    .line 1276
    .line 1277
    goto/16 :goto_19

    .line 1278
    .line 1279
    :cond_20
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 1280
    .line 1281
    .line 1282
    move-result v3

    .line 1283
    if-lez v3, :cond_21

    .line 1284
    .line 1285
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1286
    .line 1287
    .line 1288
    move-result v3

    .line 1289
    const-string v4, "count"

    .line 1290
    .line 1291
    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 1292
    .line 1293
    .line 1294
    move-result v1

    .line 1295
    const/16 v4, 0x1f4

    .line 1296
    .line 1297
    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    .line 1298
    .line 1299
    .line 1300
    move-result v1

    .line 1301
    if-ge v3, v1, :cond_21

    .line 1302
    .line 1303
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1304
    .line 1305
    .line 1306
    move-result v1

    .line 1307
    invoke-static {v2, v0, v1}, Ldefpackage/u52;->n(Ldefpackage/jx3;Ljava/util/ArrayList;I)V

    .line 1308
    .line 1309
    .line 1310
    goto :goto_1d

    .line 1311
    :cond_21
    const/16 v16, 0x0

    .line 1312
    .line 1313
    sput-boolean v16, Ldefpackage/u52;->e:Z

    .line 1314
    .line 1315
    invoke-static {}, Ldefpackage/u52;->c()Ldefpackage/v52;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v1

    .line 1319
    iget-object v1, v1, Ldefpackage/v52;->s:Ljava/lang/String;

    .line 1320
    .line 1321
    iget-object v3, v2, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 1322
    .line 1323
    invoke-static {v1, v3}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1324
    .line 1325
    .line 1326
    move-result v1

    .line 1327
    if-eqz v1, :cond_22

    .line 1328
    .line 1329
    iget-object v1, v2, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 1330
    .line 1331
    check-cast v1, Ljava/lang/String;

    .line 1332
    .line 1333
    sput-object v1, Ldefpackage/u52;->d:Ljava/lang/String;

    .line 1334
    .line 1335
    sget-object v1, Ldefpackage/u52;->c:Ldefpackage/k03;

    .line 1336
    .line 1337
    invoke-static {v0}, Ldefpackage/q40;->Q0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v0

    .line 1341
    invoke-virtual {v1, v0}, Ldefpackage/ad2;->k(Ljava/lang/Object;)V

    .line 1342
    .line 1343
    .line 1344
    :cond_22
    :goto_1d
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 1345
    .line 1346
    return-object v0

    .line 1347
    :pswitch_f
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 1348
    .line 1349
    check-cast v2, Ldefpackage/c12;

    .line 1350
    .line 1351
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 1352
    .line 1353
    check-cast v0, Ljava/util/List;

    .line 1354
    .line 1355
    check-cast v1, Ldefpackage/x34;

    .line 1356
    .line 1357
    iget-object v2, v2, Ldefpackage/c12;->p:Ljava/lang/Object;

    .line 1358
    .line 1359
    check-cast v2, Ldefpackage/q20;

    .line 1360
    .line 1361
    invoke-virtual {v2, v1, v0}, Ldefpackage/au0;->H(Ldefpackage/x34;Ljava/lang/Iterable;)V

    .line 1362
    .line 1363
    .line 1364
    const/16 v17, 0x0

    .line 1365
    .line 1366
    return-object v17

    .line 1367
    :pswitch_10
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 1368
    .line 1369
    check-cast v2, Ldefpackage/ty1;

    .line 1370
    .line 1371
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 1372
    .line 1373
    check-cast v0, Ldefpackage/qy1;

    .line 1374
    .line 1375
    check-cast v1, Ldefpackage/yr0;

    .line 1376
    .line 1377
    iget-object v1, v2, Ldefpackage/ty1;->a:Ldefpackage/f13;

    .line 1378
    .line 1379
    invoke-virtual {v1, v0}, Ldefpackage/f13;->b(Ljava/lang/Object;)V

    .line 1380
    .line 1381
    .line 1382
    iget-object v1, v2, Ldefpackage/ty1;->b:Ldefpackage/zd3;

    .line 1383
    .line 1384
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1385
    .line 1386
    invoke-virtual {v1, v3}, Ldefpackage/zd3;->setValue(Ljava/lang/Object;)V

    .line 1387
    .line 1388
    .line 1389
    new-instance v1, Ldefpackage/vy1;

    .line 1390
    .line 1391
    const/4 v6, 0x0

    .line 1392
    invoke-direct {v1, v6, v2, v0}, Ldefpackage/vy1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1393
    .line 1394
    .line 1395
    return-object v1

    .line 1396
    :pswitch_11
    const/4 v6, 0x0

    .line 1397
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 1398
    .line 1399
    check-cast v2, Ldefpackage/fx3;

    .line 1400
    .line 1401
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 1402
    .line 1403
    check-cast v0, Ljava/lang/Runnable;

    .line 1404
    .line 1405
    check-cast v1, Ljava/util/List;

    .line 1406
    .line 1407
    iget-boolean v1, v2, Ldefpackage/fx3;->n:Z

    .line 1408
    .line 1409
    if-eqz v1, :cond_23

    .line 1410
    .line 1411
    iput-boolean v6, v2, Ldefpackage/fx3;->n:Z

    .line 1412
    .line 1413
    goto :goto_1e

    .line 1414
    :cond_23
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 1415
    .line 1416
    .line 1417
    :goto_1e
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 1418
    .line 1419
    return-object v0

    .line 1420
    :pswitch_12
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 1421
    .line 1422
    check-cast v2, Ldefpackage/jx3;

    .line 1423
    .line 1424
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 1425
    .line 1426
    check-cast v0, Ldefpackage/si4;

    .line 1427
    .line 1428
    check-cast v1, Ljava/lang/Long;

    .line 1429
    .line 1430
    iget-object v3, v2, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 1431
    .line 1432
    invoke-static {v1, v3}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1433
    .line 1434
    .line 1435
    move-result v3

    .line 1436
    if-nez v3, :cond_24

    .line 1437
    .line 1438
    iput-object v1, v2, Ldefpackage/jx3;->n:Ljava/lang/Object;

    .line 1439
    .line 1440
    invoke-virtual {v0}, Ldefpackage/si4;->run()V

    .line 1441
    .line 1442
    .line 1443
    :cond_24
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 1444
    .line 1445
    return-object v0

    .line 1446
    :pswitch_13
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 1447
    .line 1448
    check-cast v2, Ldefpackage/fl1;

    .line 1449
    .line 1450
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 1451
    .line 1452
    check-cast v0, Ldefpackage/lg1;

    .line 1453
    .line 1454
    check-cast v1, Ljava/lang/Throwable;

    .line 1455
    .line 1456
    iget-object v1, v2, Ldefpackage/fl1;->p:Landroid/os/Handler;

    .line 1457
    .line 1458
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1459
    .line 1460
    .line 1461
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 1462
    .line 1463
    return-object v0

    .line 1464
    :pswitch_14
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 1465
    .line 1466
    check-cast v2, Ldefpackage/rm2;

    .line 1467
    .line 1468
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 1469
    .line 1470
    check-cast v0, Ldefpackage/q02;

    .line 1471
    .line 1472
    check-cast v1, Ljava/lang/Throwable;

    .line 1473
    .line 1474
    invoke-virtual {v2, v0}, Ldefpackage/rm2;->l(Ldefpackage/q02;)V

    .line 1475
    .line 1476
    .line 1477
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 1478
    .line 1479
    return-object v0

    .line 1480
    :pswitch_15
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 1481
    .line 1482
    check-cast v2, Ldefpackage/ss0;

    .line 1483
    .line 1484
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 1485
    .line 1486
    check-cast v0, Ljava/util/ArrayList;

    .line 1487
    .line 1488
    check-cast v1, Ldefpackage/x34;

    .line 1489
    .line 1490
    iget-object v2, v2, Ldefpackage/ss0;->q:Ljava/lang/Object;

    .line 1491
    .line 1492
    check-cast v2, Ldefpackage/q20;

    .line 1493
    .line 1494
    invoke-virtual {v2, v1, v0}, Ldefpackage/au0;->H(Ldefpackage/x34;Ljava/lang/Iterable;)V

    .line 1495
    .line 1496
    .line 1497
    const/16 v17, 0x0

    .line 1498
    .line 1499
    return-object v17

    .line 1500
    :pswitch_16
    move v4, v5

    .line 1501
    const/4 v6, 0x0

    .line 1502
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 1503
    .line 1504
    check-cast v2, Ljava/lang/String;

    .line 1505
    .line 1506
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 1507
    .line 1508
    check-cast v0, Ljava/util/ArrayList;

    .line 1509
    .line 1510
    check-cast v1, Ldefpackage/x34;

    .line 1511
    .line 1512
    invoke-interface {v1, v2}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v1

    .line 1516
    :try_start_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1517
    .line 1518
    .line 1519
    move-result v2

    .line 1520
    move v5, v4

    .line 1521
    move v4, v6

    .line 1522
    :goto_1f
    if-ge v4, v2, :cond_26

    .line 1523
    .line 1524
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v3

    .line 1528
    add-int/lit8 v4, v4, 0x1

    .line 1529
    .line 1530
    check-cast v3, Ljava/lang/String;

    .line 1531
    .line 1532
    if-nez v3, :cond_25

    .line 1533
    .line 1534
    invoke-interface {v1, v5}, Ldefpackage/z34;->e(I)V

    .line 1535
    .line 1536
    .line 1537
    goto :goto_20

    .line 1538
    :catchall_3
    move-exception v0

    .line 1539
    goto :goto_21

    .line 1540
    :cond_25
    invoke-interface {v1, v5, v3}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 1541
    .line 1542
    .line 1543
    :goto_20
    add-int/lit8 v5, v5, 0x1

    .line 1544
    .line 1545
    goto :goto_1f

    .line 1546
    :cond_26
    invoke-interface {v1}, Ldefpackage/z34;->O()Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1547
    .line 1548
    .line 1549
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1550
    .line 1551
    .line 1552
    const/16 v17, 0x0

    .line 1553
    .line 1554
    return-object v17

    .line 1555
    :goto_21
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1556
    .line 1557
    .line 1558
    throw v0

    .line 1559
    :pswitch_17
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 1560
    .line 1561
    check-cast v2, Ldefpackage/ss0;

    .line 1562
    .line 1563
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 1564
    .line 1565
    check-cast v0, Lcom/eddyizm/tempus/model/Download;

    .line 1566
    .line 1567
    check-cast v1, Ldefpackage/x34;

    .line 1568
    .line 1569
    iget-object v2, v2, Ldefpackage/ss0;->o:Ljava/lang/Object;

    .line 1570
    .line 1571
    check-cast v2, Ldefpackage/q20;

    .line 1572
    .line 1573
    invoke-virtual {v2, v1, v0}, Ldefpackage/au0;->I(Ldefpackage/x34;Ljava/lang/Object;)V

    .line 1574
    .line 1575
    .line 1576
    const/16 v17, 0x0

    .line 1577
    .line 1578
    return-object v17

    .line 1579
    :pswitch_18
    const/16 v17, 0x0

    .line 1580
    .line 1581
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 1582
    .line 1583
    check-cast v2, Ldefpackage/r20;

    .line 1584
    .line 1585
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 1586
    .line 1587
    check-cast v0, Lcom/eddyizm/tempus/model/Chronology;

    .line 1588
    .line 1589
    check-cast v1, Ldefpackage/x34;

    .line 1590
    .line 1591
    iget-object v2, v2, Ldefpackage/r20;->p:Ljava/lang/Object;

    .line 1592
    .line 1593
    check-cast v2, Ldefpackage/q20;

    .line 1594
    .line 1595
    invoke-virtual {v2, v1, v0}, Ldefpackage/au0;->I(Ldefpackage/x34;Ljava/lang/Object;)V

    .line 1596
    .line 1597
    .line 1598
    return-object v17

    .line 1599
    :pswitch_19
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 1600
    .line 1601
    check-cast v2, Ldefpackage/zg5;

    .line 1602
    .line 1603
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 1604
    .line 1605
    check-cast v0, Ldefpackage/cd0;

    .line 1606
    .line 1607
    check-cast v1, Ljava/lang/Throwable;

    .line 1608
    .line 1609
    iget-object v1, v2, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 1610
    .line 1611
    check-cast v1, Ldefpackage/f13;

    .line 1612
    .line 1613
    invoke-virtual {v1, v0}, Ldefpackage/f13;->j(Ljava/lang/Object;)Z

    .line 1614
    .line 1615
    .line 1616
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 1617
    .line 1618
    return-object v0

    .line 1619
    :pswitch_1a
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 1620
    .line 1621
    check-cast v2, Ldefpackage/jg3;

    .line 1622
    .line 1623
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 1624
    .line 1625
    check-cast v0, Ldefpackage/ft;

    .line 1626
    .line 1627
    check-cast v1, Ldefpackage/ig3;

    .line 1628
    .line 1629
    iget-object v0, v0, Ldefpackage/ft;->B:Ldefpackage/if1;

    .line 1630
    .line 1631
    invoke-static {v1, v2, v0}, Ldefpackage/ig3;->q(Ldefpackage/ig3;Ldefpackage/jg3;Ldefpackage/if1;)V

    .line 1632
    .line 1633
    .line 1634
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 1635
    .line 1636
    return-object v0

    .line 1637
    :pswitch_1b
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 1638
    .line 1639
    check-cast v2, Ldefpackage/ho;

    .line 1640
    .line 1641
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 1642
    .line 1643
    check-cast v0, Ldefpackage/io;

    .line 1644
    .line 1645
    check-cast v1, Ldefpackage/qy3;

    .line 1646
    .line 1647
    sget-object v1, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 1648
    .line 1649
    iget-object v3, v2, Ldefpackage/ho;->B:Ldefpackage/ot4;

    .line 1650
    .line 1651
    if-eqz v3, :cond_27

    .line 1652
    .line 1653
    invoke-virtual {v3}, Ldefpackage/ot4;->b()V

    .line 1654
    .line 1655
    .line 1656
    :cond_27
    const/4 v3, 0x0

    .line 1657
    iput-object v3, v2, Ldefpackage/ho;->B:Ldefpackage/ot4;

    .line 1658
    .line 1659
    iget-object v2, v0, Ldefpackage/io;->b:Ldefpackage/x60;

    .line 1660
    .line 1661
    if-eqz v2, :cond_28

    .line 1662
    .line 1663
    invoke-virtual {v2, v1}, Ldefpackage/a32;->Q(Ljava/lang/Object;)Z

    .line 1664
    .line 1665
    .line 1666
    :cond_28
    iput-object v3, v0, Ldefpackage/io;->b:Ldefpackage/x60;

    .line 1667
    .line 1668
    return-object v1

    .line 1669
    :pswitch_1c
    iget-object v2, v0, Ldefpackage/o;->o:Ljava/lang/Object;

    .line 1670
    .line 1671
    check-cast v2, Ldefpackage/rm2;

    .line 1672
    .line 1673
    iget-object v0, v0, Ldefpackage/o;->p:Ljava/lang/Object;

    .line 1674
    .line 1675
    check-cast v0, Ldefpackage/aq3;

    .line 1676
    .line 1677
    check-cast v1, Ljava/lang/Throwable;

    .line 1678
    .line 1679
    invoke-virtual {v2, v0}, Ldefpackage/rm2;->l(Ldefpackage/q02;)V

    .line 1680
    .line 1681
    .line 1682
    sget-object v0, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 1683
    .line 1684
    return-object v0

    .line 1685
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
