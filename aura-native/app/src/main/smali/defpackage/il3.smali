.class public final synthetic Ldefpackage/il3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/if1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/ml3;

.field public final synthetic p:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/ml3;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Ldefpackage/il3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/il3;->o:Ldefpackage/ml3;

    .line 4
    .line 5
    iput-object p2, p0, Ldefpackage/il3;->p:Ljava/lang/String;

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
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ldefpackage/il3;->n:I

    .line 4
    .line 5
    const-string v2, "lastPlayed"

    .line 6
    .line 7
    const-string v3, "changed"

    .line 8
    .line 9
    const-string v4, "created"

    .line 10
    .line 11
    const-string v5, "songCount"

    .line 12
    .line 13
    const-string v6, "isUniversal"

    .line 14
    .line 15
    const-string v7, "owner"

    .line 16
    .line 17
    const-string v8, "comment"

    .line 18
    .line 19
    const-string v9, "coverArt"

    .line 20
    .line 21
    const-string v10, "duration"

    .line 22
    .line 23
    const-string v11, "name"

    .line 24
    .line 25
    const-string v12, "id"

    .line 26
    .line 27
    const/4 v14, 0x1

    .line 28
    const/16 v17, 0x0

    .line 29
    .line 30
    iget-object v15, v0, Ldefpackage/il3;->p:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v0, v0, Ldefpackage/il3;->o:Ldefpackage/ml3;

    .line 33
    .line 34
    packed-switch v1, :pswitch_data_0

    .line 35
    .line 36
    .line 37
    move-object/from16 v1, p1

    .line 38
    .line 39
    check-cast v1, Ldefpackage/x34;

    .line 40
    .line 41
    iget-object v13, v0, Ldefpackage/ml3;->c:Ljava/lang/Object;

    .line 42
    .line 43
    const-string v13, "SELECT p.*, (pp.playlistId IS NOT NULL) AS isPinned FROM playlist p LEFT JOIN pinned_playlist pp ON p.id = pp.playlistId ORDER BY CASE WHEN ? = \'ORDER_BY_RANDOM\' THEN RANDOM() END ASC, CASE WHEN ? = \'ORDER_BY_PINNED\' THEN pp.playlistId IS NOT NULL END DESC, CASE WHEN ? = \'ORDER_BY_NAME\' THEN p.name END ASC, CASE WHEN ? = \'ORDER_BY_DATE\' THEN p.created END DESC, CASE WHEN ? = \'ORDER_BY_SONGS\' THEN p.songCount END DESC, CASE WHEN ? = \'ORDER_BY_LAST_PLAYED\' THEN p.lastPlayed END DESC, CASE WHEN ? = \'ORDER_BY_LAST_UPDATED\' THEN p.changed END DESC, CASE WHEN ? = \'ORDER_BY_BOTH\' THEN MAX(p.lastPlayed, IFNULL(p.changed, 0)) END DESC"

    .line 44
    .line 45
    invoke-interface {v1, v13}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    if-nez v15, :cond_0

    .line 50
    .line 51
    :try_start_0
    invoke-interface {v1, v14}, Ldefpackage/z34;->e(I)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    goto/16 :goto_14

    .line 57
    .line 58
    :cond_0
    invoke-interface {v1, v14, v15}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    if-nez v15, :cond_1

    .line 62
    .line 63
    const/4 v13, 0x2

    .line 64
    invoke-interface {v1, v13}, Ldefpackage/z34;->e(I)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    const/4 v13, 0x2

    .line 69
    invoke-interface {v1, v13, v15}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 70
    .line 71
    .line 72
    :goto_1
    if-nez v15, :cond_2

    .line 73
    .line 74
    const/4 v13, 0x3

    .line 75
    invoke-interface {v1, v13}, Ldefpackage/z34;->e(I)V

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    const/4 v13, 0x3

    .line 80
    invoke-interface {v1, v13, v15}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :goto_2
    if-nez v15, :cond_3

    .line 84
    .line 85
    const/4 v13, 0x4

    .line 86
    invoke-interface {v1, v13}, Ldefpackage/z34;->e(I)V

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_3
    const/4 v13, 0x4

    .line 91
    invoke-interface {v1, v13, v15}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :goto_3
    if-nez v15, :cond_4

    .line 95
    .line 96
    const/4 v13, 0x5

    .line 97
    invoke-interface {v1, v13}, Ldefpackage/z34;->e(I)V

    .line 98
    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_4
    const/4 v13, 0x5

    .line 102
    invoke-interface {v1, v13, v15}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 103
    .line 104
    .line 105
    :goto_4
    if-nez v15, :cond_5

    .line 106
    .line 107
    const/4 v13, 0x6

    .line 108
    invoke-interface {v1, v13}, Ldefpackage/z34;->e(I)V

    .line 109
    .line 110
    .line 111
    goto :goto_5

    .line 112
    :cond_5
    const/4 v13, 0x6

    .line 113
    invoke-interface {v1, v13, v15}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :goto_5
    if-nez v15, :cond_6

    .line 117
    .line 118
    const/4 v13, 0x7

    .line 119
    invoke-interface {v1, v13}, Ldefpackage/z34;->e(I)V

    .line 120
    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_6
    const/4 v13, 0x7

    .line 124
    invoke-interface {v1, v13, v15}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 125
    .line 126
    .line 127
    :goto_6
    if-nez v15, :cond_7

    .line 128
    .line 129
    const/16 v13, 0x8

    .line 130
    .line 131
    invoke-interface {v1, v13}, Ldefpackage/z34;->e(I)V

    .line 132
    .line 133
    .line 134
    goto :goto_7

    .line 135
    :cond_7
    const/16 v13, 0x8

    .line 136
    .line 137
    invoke-interface {v1, v13, v15}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 138
    .line 139
    .line 140
    :goto_7
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    move-result v12

    .line 144
    invoke-static {v1, v11}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 145
    .line 146
    .line 147
    move-result v11

    .line 148
    invoke-static {v1, v10}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    invoke-static {v1, v9}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 153
    .line 154
    .line 155
    move-result v9

    .line 156
    invoke-static {v1, v8}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 157
    .line 158
    .line 159
    move-result v8

    .line 160
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 161
    .line 162
    .line 163
    move-result v7

    .line 164
    invoke-static {v1, v6}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    invoke-static {v1, v5}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    invoke-static {v1, v4}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    invoke-static {v1, v3}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    invoke-static {v1, v2}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    const-string v13, "allowedUsers"

    .line 185
    .line 186
    invoke-static {v1, v13}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 187
    .line 188
    .line 189
    move-result v13

    .line 190
    new-instance v15, Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 193
    .line 194
    .line 195
    :goto_8
    invoke-interface {v1}, Ldefpackage/z34;->O()Z

    .line 196
    .line 197
    .line 198
    move-result v16

    .line 199
    if-eqz v16, :cond_13

    .line 200
    .line 201
    invoke-interface {v1, v12}, Ldefpackage/z34;->isNull(I)Z

    .line 202
    .line 203
    .line 204
    move-result v16

    .line 205
    if-eqz v16, :cond_8

    .line 206
    .line 207
    move-object/from16 v19, v17

    .line 208
    .line 209
    goto :goto_9

    .line 210
    :cond_8
    invoke-interface {v1, v12}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v16

    .line 214
    move-object/from16 v19, v16

    .line 215
    .line 216
    :goto_9
    invoke-interface {v1, v11}, Ldefpackage/z34;->isNull(I)Z

    .line 217
    .line 218
    .line 219
    move-result v16

    .line 220
    if-eqz v16, :cond_9

    .line 221
    .line 222
    move-object/from16 v20, v17

    .line 223
    .line 224
    goto :goto_a

    .line 225
    :cond_9
    invoke-interface {v1, v11}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v16

    .line 229
    move-object/from16 v20, v16

    .line 230
    .line 231
    :goto_a
    invoke-interface {v1, v10}, Ldefpackage/z34;->getLong(I)J

    .line 232
    .line 233
    .line 234
    move-result-wide v21

    .line 235
    invoke-interface {v1, v9}, Ldefpackage/z34;->isNull(I)Z

    .line 236
    .line 237
    .line 238
    move-result v16

    .line 239
    if-eqz v16, :cond_a

    .line 240
    .line 241
    move-object/from16 v23, v17

    .line 242
    .line 243
    goto :goto_b

    .line 244
    :cond_a
    invoke-interface {v1, v9}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v16

    .line 248
    move-object/from16 v23, v16

    .line 249
    .line 250
    :goto_b
    new-instance v18, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 251
    .line 252
    invoke-direct/range {v18 .. v23}, Lcom/eddyizm/tempus/subsonic/models/Playlist;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 253
    .line 254
    .line 255
    move-object/from16 v14, v18

    .line 256
    .line 257
    invoke-interface {v1, v8}, Ldefpackage/z34;->isNull(I)Z

    .line 258
    .line 259
    .line 260
    move-result v16

    .line 261
    if-eqz v16, :cond_b

    .line 262
    .line 263
    move/from16 p0, v8

    .line 264
    .line 265
    move-object/from16 v8, v17

    .line 266
    .line 267
    goto :goto_c

    .line 268
    :cond_b
    invoke-interface {v1, v8}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v16

    .line 272
    move/from16 p0, v8

    .line 273
    .line 274
    move-object/from16 v8, v16

    .line 275
    .line 276
    :goto_c
    invoke-virtual {v14, v8}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setComment(Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    invoke-interface {v1, v7}, Ldefpackage/z34;->isNull(I)Z

    .line 280
    .line 281
    .line 282
    move-result v8

    .line 283
    if-eqz v8, :cond_c

    .line 284
    .line 285
    move-object/from16 v8, v17

    .line 286
    .line 287
    goto :goto_d

    .line 288
    :cond_c
    invoke-interface {v1, v7}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v8

    .line 292
    :goto_d
    invoke-virtual {v14, v8}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setOwner(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    invoke-interface {v1, v6}, Ldefpackage/z34;->isNull(I)Z

    .line 296
    .line 297
    .line 298
    move-result v8

    .line 299
    if-eqz v8, :cond_d

    .line 300
    .line 301
    move/from16 p1, v7

    .line 302
    .line 303
    move-object/from16 v7, v17

    .line 304
    .line 305
    goto :goto_e

    .line 306
    :cond_d
    move/from16 p1, v7

    .line 307
    .line 308
    invoke-interface {v1, v6}, Ldefpackage/z34;->getLong(I)J

    .line 309
    .line 310
    .line 311
    move-result-wide v7

    .line 312
    long-to-int v7, v7

    .line 313
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 314
    .line 315
    .line 316
    move-result-object v7

    .line 317
    :goto_e
    if-nez v7, :cond_e

    .line 318
    .line 319
    move-object/from16 v7, v17

    .line 320
    .line 321
    goto :goto_10

    .line 322
    :cond_e
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 323
    .line 324
    .line 325
    move-result v7

    .line 326
    if-eqz v7, :cond_f

    .line 327
    .line 328
    const/4 v7, 0x1

    .line 329
    goto :goto_f

    .line 330
    :cond_f
    const/4 v7, 0x0

    .line 331
    :goto_f
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 332
    .line 333
    .line 334
    move-result-object v7

    .line 335
    :goto_10
    invoke-virtual {v14, v7}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setUniversal(Ljava/lang/Boolean;)V

    .line 336
    .line 337
    .line 338
    invoke-interface {v1, v5}, Ldefpackage/z34;->getLong(I)J

    .line 339
    .line 340
    .line 341
    move-result-wide v7

    .line 342
    long-to-int v7, v7

    .line 343
    invoke-virtual {v14, v7}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setSongCount(I)V

    .line 344
    .line 345
    .line 346
    invoke-interface {v1, v4}, Ldefpackage/z34;->isNull(I)Z

    .line 347
    .line 348
    .line 349
    move-result v7

    .line 350
    if-eqz v7, :cond_10

    .line 351
    .line 352
    move-object/from16 v7, v17

    .line 353
    .line 354
    goto :goto_11

    .line 355
    :cond_10
    invoke-interface {v1, v4}, Ldefpackage/z34;->getLong(I)J

    .line 356
    .line 357
    .line 358
    move-result-wide v7

    .line 359
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 360
    .line 361
    .line 362
    move-result-object v7

    .line 363
    :goto_11
    invoke-static {v7}, Ldefpackage/i80;->B(Ljava/lang/Long;)Ljava/util/Date;

    .line 364
    .line 365
    .line 366
    move-result-object v7

    .line 367
    invoke-virtual {v14, v7}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setCreated(Ljava/util/Date;)V

    .line 368
    .line 369
    .line 370
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 371
    .line 372
    .line 373
    move-result v7

    .line 374
    if-eqz v7, :cond_11

    .line 375
    .line 376
    move-object/from16 v7, v17

    .line 377
    .line 378
    goto :goto_12

    .line 379
    :cond_11
    invoke-interface {v1, v3}, Ldefpackage/z34;->getLong(I)J

    .line 380
    .line 381
    .line 382
    move-result-wide v7

    .line 383
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 384
    .line 385
    .line 386
    move-result-object v7

    .line 387
    :goto_12
    invoke-static {v7}, Ldefpackage/i80;->B(Ljava/lang/Long;)Ljava/util/Date;

    .line 388
    .line 389
    .line 390
    move-result-object v7

    .line 391
    invoke-virtual {v14, v7}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setChanged(Ljava/util/Date;)V

    .line 392
    .line 393
    .line 394
    invoke-interface {v1, v2}, Ldefpackage/z34;->getLong(I)J

    .line 395
    .line 396
    .line 397
    move-result-wide v7

    .line 398
    invoke-virtual {v14, v7, v8}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setLastPlayed(J)V

    .line 399
    .line 400
    .line 401
    invoke-interface {v1, v13}, Ldefpackage/z34;->isNull(I)Z

    .line 402
    .line 403
    .line 404
    move-result v7

    .line 405
    if-eqz v7, :cond_12

    .line 406
    .line 407
    move-object/from16 v7, v17

    .line 408
    .line 409
    goto :goto_13

    .line 410
    :cond_12
    invoke-interface {v1, v13}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v7

    .line 414
    :goto_13
    iget-object v8, v0, Ldefpackage/ml3;->d:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v8, Ldefpackage/si1;

    .line 417
    .line 418
    invoke-virtual {v8, v7}, Ldefpackage/si1;->E(Ljava/lang/String;)Ljava/util/List;

    .line 419
    .line 420
    .line 421
    move-result-object v7

    .line 422
    invoke-virtual {v14, v7}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setAllowedUsers(Ljava/util/List;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v15, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 426
    .line 427
    .line 428
    move/from16 v8, p0

    .line 429
    .line 430
    move/from16 v7, p1

    .line 431
    .line 432
    const/4 v14, 0x1

    .line 433
    goto/16 :goto_8

    .line 434
    .line 435
    :cond_13
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 436
    .line 437
    .line 438
    return-object v15

    .line 439
    :goto_14
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 440
    .line 441
    .line 442
    throw v0

    .line 443
    :pswitch_0
    move-object/from16 v1, p1

    .line 444
    .line 445
    check-cast v1, Ldefpackage/x34;

    .line 446
    .line 447
    iget-object v13, v0, Ldefpackage/ml3;->c:Ljava/lang/Object;

    .line 448
    .line 449
    const-string v13, "SELECT p.*, (pp.playlistId IS NOT NULL) AS isPinned FROM playlist p LEFT JOIN pinned_playlist pp ON p.id = pp.playlistId ORDER BY CASE WHEN ? = \'ORDER_BY_RANDOM\' THEN RANDOM() END ASC, CASE WHEN ? = \'ORDER_BY_PINNED\' THEN pp.playlistId IS NOT NULL END DESC, CASE WHEN ? = \'ORDER_BY_NAME\' THEN p.name END ASC, CASE WHEN ? = \'ORDER_BY_DATE\' THEN p.created END DESC, CASE WHEN ? = \'ORDER_BY_SONGS\' THEN p.songCount END DESC, CASE WHEN ? = \'ORDER_BY_LAST_PLAYED\' THEN p.lastPlayed END DESC, CASE WHEN ? = \'ORDER_BY_LAST_UPDATED\' THEN p.changed END DESC, CASE WHEN ? = \'ORDER_BY_BOTH\' THEN MAX(p.lastPlayed, IFNULL(p.changed, 0)) END DESC LIMIT ?"

    .line 450
    .line 451
    invoke-interface {v1, v13}, Ldefpackage/x34;->U(Ljava/lang/String;)Ldefpackage/z34;

    .line 452
    .line 453
    .line 454
    move-result-object v1

    .line 455
    if-nez v15, :cond_14

    .line 456
    .line 457
    const/4 v13, 0x1

    .line 458
    :try_start_1
    invoke-interface {v1, v13}, Ldefpackage/z34;->e(I)V

    .line 459
    .line 460
    .line 461
    goto :goto_15

    .line 462
    :catchall_1
    move-exception v0

    .line 463
    goto/16 :goto_29

    .line 464
    .line 465
    :cond_14
    const/4 v13, 0x1

    .line 466
    invoke-interface {v1, v13, v15}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 467
    .line 468
    .line 469
    :goto_15
    if-nez v15, :cond_15

    .line 470
    .line 471
    const/4 v14, 0x2

    .line 472
    invoke-interface {v1, v14}, Ldefpackage/z34;->e(I)V

    .line 473
    .line 474
    .line 475
    goto :goto_16

    .line 476
    :cond_15
    const/4 v14, 0x2

    .line 477
    invoke-interface {v1, v14, v15}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 478
    .line 479
    .line 480
    :goto_16
    if-nez v15, :cond_16

    .line 481
    .line 482
    const/4 v14, 0x3

    .line 483
    invoke-interface {v1, v14}, Ldefpackage/z34;->e(I)V

    .line 484
    .line 485
    .line 486
    goto :goto_17

    .line 487
    :cond_16
    const/4 v14, 0x3

    .line 488
    invoke-interface {v1, v14, v15}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 489
    .line 490
    .line 491
    :goto_17
    if-nez v15, :cond_17

    .line 492
    .line 493
    const/4 v14, 0x4

    .line 494
    invoke-interface {v1, v14}, Ldefpackage/z34;->e(I)V

    .line 495
    .line 496
    .line 497
    goto :goto_18

    .line 498
    :cond_17
    const/4 v14, 0x4

    .line 499
    invoke-interface {v1, v14, v15}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 500
    .line 501
    .line 502
    :goto_18
    if-nez v15, :cond_18

    .line 503
    .line 504
    const/4 v14, 0x5

    .line 505
    invoke-interface {v1, v14}, Ldefpackage/z34;->e(I)V

    .line 506
    .line 507
    .line 508
    goto :goto_19

    .line 509
    :cond_18
    const/4 v14, 0x5

    .line 510
    invoke-interface {v1, v14, v15}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 511
    .line 512
    .line 513
    :goto_19
    if-nez v15, :cond_19

    .line 514
    .line 515
    const/4 v14, 0x6

    .line 516
    invoke-interface {v1, v14}, Ldefpackage/z34;->e(I)V

    .line 517
    .line 518
    .line 519
    goto :goto_1a

    .line 520
    :cond_19
    const/4 v14, 0x6

    .line 521
    invoke-interface {v1, v14, v15}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 522
    .line 523
    .line 524
    :goto_1a
    if-nez v15, :cond_1a

    .line 525
    .line 526
    const/4 v14, 0x7

    .line 527
    invoke-interface {v1, v14}, Ldefpackage/z34;->e(I)V

    .line 528
    .line 529
    .line 530
    goto :goto_1b

    .line 531
    :cond_1a
    const/4 v14, 0x7

    .line 532
    invoke-interface {v1, v14, v15}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 533
    .line 534
    .line 535
    :goto_1b
    if-nez v15, :cond_1b

    .line 536
    .line 537
    const/16 v14, 0x8

    .line 538
    .line 539
    invoke-interface {v1, v14}, Ldefpackage/z34;->e(I)V

    .line 540
    .line 541
    .line 542
    goto :goto_1c

    .line 543
    :cond_1b
    const/16 v14, 0x8

    .line 544
    .line 545
    invoke-interface {v1, v14, v15}, Ldefpackage/z34;->r(ILjava/lang/String;)V

    .line 546
    .line 547
    .line 548
    :goto_1c
    const/16 v14, 0x9

    .line 549
    .line 550
    move-object/from16 v16, v2

    .line 551
    .line 552
    move-object v15, v3

    .line 553
    const-wide/16 v2, 0x14

    .line 554
    .line 555
    invoke-interface {v1, v14, v2, v3}, Ldefpackage/z34;->c(IJ)V

    .line 556
    .line 557
    .line 558
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 559
    .line 560
    .line 561
    move-result v2

    .line 562
    invoke-static {v1, v11}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 563
    .line 564
    .line 565
    move-result v3

    .line 566
    invoke-static {v1, v10}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 567
    .line 568
    .line 569
    move-result v10

    .line 570
    invoke-static {v1, v9}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 571
    .line 572
    .line 573
    move-result v9

    .line 574
    invoke-static {v1, v8}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 575
    .line 576
    .line 577
    move-result v8

    .line 578
    invoke-static {v1, v7}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 579
    .line 580
    .line 581
    move-result v7

    .line 582
    invoke-static {v1, v6}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 583
    .line 584
    .line 585
    move-result v6

    .line 586
    invoke-static {v1, v5}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 587
    .line 588
    .line 589
    move-result v5

    .line 590
    invoke-static {v1, v4}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 591
    .line 592
    .line 593
    move-result v4

    .line 594
    invoke-static {v1, v15}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 595
    .line 596
    .line 597
    move-result v11

    .line 598
    move-object/from16 v12, v16

    .line 599
    .line 600
    invoke-static {v1, v12}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 601
    .line 602
    .line 603
    move-result v12

    .line 604
    const-string v14, "allowedUsers"

    .line 605
    .line 606
    invoke-static {v1, v14}, Ldefpackage/rr2;->E(Ldefpackage/z34;Ljava/lang/String;)I

    .line 607
    .line 608
    .line 609
    move-result v14

    .line 610
    new-instance v15, Ljava/util/ArrayList;

    .line 611
    .line 612
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 613
    .line 614
    .line 615
    :goto_1d
    invoke-interface {v1}, Ldefpackage/z34;->O()Z

    .line 616
    .line 617
    .line 618
    move-result v16

    .line 619
    if-eqz v16, :cond_27

    .line 620
    .line 621
    invoke-interface {v1, v2}, Ldefpackage/z34;->isNull(I)Z

    .line 622
    .line 623
    .line 624
    move-result v16

    .line 625
    if-eqz v16, :cond_1c

    .line 626
    .line 627
    move-object/from16 v19, v17

    .line 628
    .line 629
    goto :goto_1e

    .line 630
    :cond_1c
    invoke-interface {v1, v2}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 631
    .line 632
    .line 633
    move-result-object v16

    .line 634
    move-object/from16 v19, v16

    .line 635
    .line 636
    :goto_1e
    invoke-interface {v1, v3}, Ldefpackage/z34;->isNull(I)Z

    .line 637
    .line 638
    .line 639
    move-result v16

    .line 640
    if-eqz v16, :cond_1d

    .line 641
    .line 642
    move-object/from16 v20, v17

    .line 643
    .line 644
    goto :goto_1f

    .line 645
    :cond_1d
    invoke-interface {v1, v3}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v16

    .line 649
    move-object/from16 v20, v16

    .line 650
    .line 651
    :goto_1f
    invoke-interface {v1, v10}, Ldefpackage/z34;->getLong(I)J

    .line 652
    .line 653
    .line 654
    move-result-wide v21

    .line 655
    invoke-interface {v1, v9}, Ldefpackage/z34;->isNull(I)Z

    .line 656
    .line 657
    .line 658
    move-result v16

    .line 659
    if-eqz v16, :cond_1e

    .line 660
    .line 661
    move-object/from16 v23, v17

    .line 662
    .line 663
    goto :goto_20

    .line 664
    :cond_1e
    invoke-interface {v1, v9}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v16

    .line 668
    move-object/from16 v23, v16

    .line 669
    .line 670
    :goto_20
    new-instance v18, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 671
    .line 672
    invoke-direct/range {v18 .. v23}, Lcom/eddyizm/tempus/subsonic/models/Playlist;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 673
    .line 674
    .line 675
    move-object/from16 v13, v18

    .line 676
    .line 677
    invoke-interface {v1, v8}, Ldefpackage/z34;->isNull(I)Z

    .line 678
    .line 679
    .line 680
    move-result v16

    .line 681
    if-eqz v16, :cond_1f

    .line 682
    .line 683
    move/from16 p0, v2

    .line 684
    .line 685
    move-object/from16 v2, v17

    .line 686
    .line 687
    goto :goto_21

    .line 688
    :cond_1f
    invoke-interface {v1, v8}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 689
    .line 690
    .line 691
    move-result-object v16

    .line 692
    move/from16 p0, v2

    .line 693
    .line 694
    move-object/from16 v2, v16

    .line 695
    .line 696
    :goto_21
    invoke-virtual {v13, v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setComment(Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    invoke-interface {v1, v7}, Ldefpackage/z34;->isNull(I)Z

    .line 700
    .line 701
    .line 702
    move-result v2

    .line 703
    if-eqz v2, :cond_20

    .line 704
    .line 705
    move-object/from16 v2, v17

    .line 706
    .line 707
    goto :goto_22

    .line 708
    :cond_20
    invoke-interface {v1, v7}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 709
    .line 710
    .line 711
    move-result-object v2

    .line 712
    :goto_22
    invoke-virtual {v13, v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setOwner(Ljava/lang/String;)V

    .line 713
    .line 714
    .line 715
    invoke-interface {v1, v6}, Ldefpackage/z34;->isNull(I)Z

    .line 716
    .line 717
    .line 718
    move-result v2

    .line 719
    if-eqz v2, :cond_21

    .line 720
    .line 721
    move/from16 p1, v3

    .line 722
    .line 723
    move-object/from16 v2, v17

    .line 724
    .line 725
    goto :goto_23

    .line 726
    :cond_21
    move/from16 p1, v3

    .line 727
    .line 728
    invoke-interface {v1, v6}, Ldefpackage/z34;->getLong(I)J

    .line 729
    .line 730
    .line 731
    move-result-wide v2

    .line 732
    long-to-int v2, v2

    .line 733
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 734
    .line 735
    .line 736
    move-result-object v2

    .line 737
    :goto_23
    if-nez v2, :cond_22

    .line 738
    .line 739
    move-object/from16 v2, v17

    .line 740
    .line 741
    goto :goto_25

    .line 742
    :cond_22
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 743
    .line 744
    .line 745
    move-result v2

    .line 746
    if-eqz v2, :cond_23

    .line 747
    .line 748
    const/4 v2, 0x1

    .line 749
    goto :goto_24

    .line 750
    :cond_23
    const/4 v2, 0x0

    .line 751
    :goto_24
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 752
    .line 753
    .line 754
    move-result-object v2

    .line 755
    :goto_25
    invoke-virtual {v13, v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setUniversal(Ljava/lang/Boolean;)V

    .line 756
    .line 757
    .line 758
    invoke-interface {v1, v5}, Ldefpackage/z34;->getLong(I)J

    .line 759
    .line 760
    .line 761
    move-result-wide v2

    .line 762
    long-to-int v2, v2

    .line 763
    invoke-virtual {v13, v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setSongCount(I)V

    .line 764
    .line 765
    .line 766
    invoke-interface {v1, v4}, Ldefpackage/z34;->isNull(I)Z

    .line 767
    .line 768
    .line 769
    move-result v2

    .line 770
    if-eqz v2, :cond_24

    .line 771
    .line 772
    move-object/from16 v2, v17

    .line 773
    .line 774
    goto :goto_26

    .line 775
    :cond_24
    invoke-interface {v1, v4}, Ldefpackage/z34;->getLong(I)J

    .line 776
    .line 777
    .line 778
    move-result-wide v2

    .line 779
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 780
    .line 781
    .line 782
    move-result-object v2

    .line 783
    :goto_26
    invoke-static {v2}, Ldefpackage/i80;->B(Ljava/lang/Long;)Ljava/util/Date;

    .line 784
    .line 785
    .line 786
    move-result-object v2

    .line 787
    invoke-virtual {v13, v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setCreated(Ljava/util/Date;)V

    .line 788
    .line 789
    .line 790
    invoke-interface {v1, v11}, Ldefpackage/z34;->isNull(I)Z

    .line 791
    .line 792
    .line 793
    move-result v2

    .line 794
    if-eqz v2, :cond_25

    .line 795
    .line 796
    move-object/from16 v2, v17

    .line 797
    .line 798
    goto :goto_27

    .line 799
    :cond_25
    invoke-interface {v1, v11}, Ldefpackage/z34;->getLong(I)J

    .line 800
    .line 801
    .line 802
    move-result-wide v2

    .line 803
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 804
    .line 805
    .line 806
    move-result-object v2

    .line 807
    :goto_27
    invoke-static {v2}, Ldefpackage/i80;->B(Ljava/lang/Long;)Ljava/util/Date;

    .line 808
    .line 809
    .line 810
    move-result-object v2

    .line 811
    invoke-virtual {v13, v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setChanged(Ljava/util/Date;)V

    .line 812
    .line 813
    .line 814
    invoke-interface {v1, v12}, Ldefpackage/z34;->getLong(I)J

    .line 815
    .line 816
    .line 817
    move-result-wide v2

    .line 818
    invoke-virtual {v13, v2, v3}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setLastPlayed(J)V

    .line 819
    .line 820
    .line 821
    invoke-interface {v1, v14}, Ldefpackage/z34;->isNull(I)Z

    .line 822
    .line 823
    .line 824
    move-result v2

    .line 825
    if-eqz v2, :cond_26

    .line 826
    .line 827
    move-object/from16 v2, v17

    .line 828
    .line 829
    goto :goto_28

    .line 830
    :cond_26
    invoke-interface {v1, v14}, Ldefpackage/z34;->D(I)Ljava/lang/String;

    .line 831
    .line 832
    .line 833
    move-result-object v2

    .line 834
    :goto_28
    iget-object v3, v0, Ldefpackage/ml3;->d:Ljava/lang/Object;

    .line 835
    .line 836
    check-cast v3, Ldefpackage/si1;

    .line 837
    .line 838
    invoke-virtual {v3, v2}, Ldefpackage/si1;->E(Ljava/lang/String;)Ljava/util/List;

    .line 839
    .line 840
    .line 841
    move-result-object v2

    .line 842
    invoke-virtual {v13, v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setAllowedUsers(Ljava/util/List;)V

    .line 843
    .line 844
    .line 845
    invoke-virtual {v15, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 846
    .line 847
    .line 848
    move/from16 v2, p0

    .line 849
    .line 850
    move/from16 v3, p1

    .line 851
    .line 852
    const/4 v13, 0x1

    .line 853
    goto/16 :goto_1d

    .line 854
    .line 855
    :cond_27
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 856
    .line 857
    .line 858
    return-object v15

    .line 859
    :goto_29
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 860
    .line 861
    .line 862
    throw v0

    .line 863
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
