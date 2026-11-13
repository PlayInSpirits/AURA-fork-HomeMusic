.class public final synthetic Ldefpackage/ls1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:Ljava/lang/Object;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Ljava/lang/Object;

.field public final synthetic s:Ljava/lang/Object;

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILcom/eddyizm/tempus/ui/activity/MainActivity;Lcom/eddyizm/tempus/subsonic/models/Child;Ljava/util/ArrayList;Ljava/util/List;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ldefpackage/ls1;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Ldefpackage/ls1;->o:I

    .line 8
    .line 9
    iput-object p2, p0, Ldefpackage/ls1;->p:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Ldefpackage/ls1;->q:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Ldefpackage/ls1;->r:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Ldefpackage/ls1;->s:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, Ldefpackage/ls1;->t:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Ldefpackage/kt2;Ldefpackage/fr2;Ldefpackage/va4;Ldefpackage/tn2;ILdefpackage/ju1;)V
    .locals 1

    .line 20
    const/4 v0, 0x1

    iput v0, p0, Ldefpackage/ls1;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/ls1;->p:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/ls1;->q:Ljava/lang/Object;

    iput-object p3, p0, Ldefpackage/ls1;->r:Ljava/lang/Object;

    iput-object p4, p0, Ldefpackage/ls1;->s:Ljava/lang/Object;

    iput p5, p0, Ldefpackage/ls1;->o:I

    iput-object p6, p0, Ldefpackage/ls1;->t:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ldefpackage/ls1;->n:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Ldefpackage/ls1;->p:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v4, v1

    .line 13
    check-cast v4, Ldefpackage/kt2;

    .line 14
    .line 15
    iget-object v1, v0, Ldefpackage/ls1;->q:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ldefpackage/fr2;

    .line 18
    .line 19
    iget-object v5, v0, Ldefpackage/ls1;->r:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v5, Ldefpackage/va4;

    .line 22
    .line 23
    iget-object v6, v5, Ldefpackage/va4;->b:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v7, v0, Ldefpackage/ls1;->s:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v7, Ldefpackage/tn2;

    .line 28
    .line 29
    iget v8, v0, Ldefpackage/ls1;->o:I

    .line 30
    .line 31
    iget-object v0, v0, Ldefpackage/ls1;->t:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ldefpackage/ju1;

    .line 34
    .line 35
    const-string v9, "MediaSessionStub"

    .line 36
    .line 37
    iget-object v10, v4, Ldefpackage/kt2;->f:Ldefpackage/na4;

    .line 38
    .line 39
    invoke-virtual {v10, v1}, Ldefpackage/na4;->F(Ldefpackage/fr2;)Z

    .line 40
    .line 41
    .line 42
    move-result v11

    .line 43
    if-nez v11, :cond_0

    .line 44
    .line 45
    goto/16 :goto_2

    .line 46
    .line 47
    :cond_0
    :try_start_0
    invoke-static {v5}, Ldefpackage/j60;->d(Ldefpackage/va4;)Ldefpackage/j60;

    .line 48
    .line 49
    .line 50
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    iget-object v11, v5, Ldefpackage/j60;->j:Ljava/lang/Object;

    .line 52
    .line 53
    iget v12, v5, Ldefpackage/j60;->b:I

    .line 54
    .line 55
    invoke-virtual {v5}, Ldefpackage/j60;->b()Z

    .line 56
    .line 57
    .line 58
    move-result v13

    .line 59
    if-nez v13, :cond_1

    .line 60
    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    const-string v2, "Can\'t execute predefined custom command: "

    .line 64
    .line 65
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v9, v0}, Ldefpackage/l93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    new-instance v0, Ldefpackage/ab4;

    .line 79
    .line 80
    const/4 v2, -0x6

    .line 81
    invoke-direct {v0, v2}, Ldefpackage/ab4;-><init>(I)V

    .line 82
    .line 83
    .line 84
    invoke-static {v7, v1, v8, v0}, Ldefpackage/kt2;->P0(Ldefpackage/tn2;Ldefpackage/fr2;ILdefpackage/ab4;)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_2

    .line 88
    .line 89
    :cond_1
    iget-object v6, v5, Ldefpackage/j60;->a:Ldefpackage/va4;

    .line 90
    .line 91
    if-eqz v6, :cond_3

    .line 92
    .line 93
    iget v1, v6, Ldefpackage/va4;->a:I

    .line 94
    .line 95
    const v6, 0x9c4a

    .line 96
    .line 97
    .line 98
    if-ne v1, v6, :cond_2

    .line 99
    .line 100
    move v2, v3

    .line 101
    :cond_2
    invoke-static {v2}, Ldefpackage/rr2;->w(Z)V

    .line 102
    .line 103
    .line 104
    new-instance v1, Ldefpackage/et2;

    .line 105
    .line 106
    invoke-direct {v1, v5}, Ldefpackage/et2;-><init>(Ldefpackage/j60;)V

    .line 107
    .line 108
    .line 109
    new-instance v9, Ldefpackage/at2;

    .line 110
    .line 111
    invoke-direct {v9, v1, v3}, Ldefpackage/at2;-><init>(Ldefpackage/it2;I)V

    .line 112
    .line 113
    .line 114
    const/4 v7, 0x0

    .line 115
    move v6, v8

    .line 116
    const v8, 0x9c4a

    .line 117
    .line 118
    .line 119
    move-object v5, v0

    .line 120
    invoke-virtual/range {v4 .. v9}, Ldefpackage/kt2;->U(Ldefpackage/ju1;ILdefpackage/va4;ILdefpackage/it2;)V

    .line 121
    .line 122
    .line 123
    goto/16 :goto_2

    .line 124
    .line 125
    :cond_3
    iget-object v0, v7, Ldefpackage/tn2;->s:Ldefpackage/al3;

    .line 126
    .line 127
    if-eq v12, v3, :cond_5

    .line 128
    .line 129
    :cond_4
    move v0, v2

    .line 130
    goto :goto_0

    .line 131
    :cond_5
    if-nez v11, :cond_6

    .line 132
    .line 133
    invoke-virtual {v0}, Ldefpackage/al3;->q()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-nez v0, :cond_4

    .line 138
    .line 139
    move v0, v3

    .line 140
    goto :goto_0

    .line 141
    :cond_6
    move-object v0, v11

    .line 142
    check-cast v0, Ljava/lang/Boolean;

    .line 143
    .line 144
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 145
    .line 146
    .line 147
    move-result v0

    .line 148
    :goto_0
    if-eqz v0, :cond_7

    .line 149
    .line 150
    invoke-virtual {v4, v1, v8}, Ldefpackage/kt2;->M0(Ldefpackage/fr2;I)V

    .line 151
    .line 152
    .line 153
    goto :goto_1

    .line 154
    :cond_7
    const/16 v0, 0x1f

    .line 155
    .line 156
    if-ne v12, v0, :cond_8

    .line 157
    .line 158
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    check-cast v11, Ldefpackage/gn2;

    .line 162
    .line 163
    new-instance v5, Ldefpackage/ts2;

    .line 164
    .line 165
    invoke-direct {v5, v11, v3, v2}, Ldefpackage/ts2;-><init>(Ljava/lang/Object;ZI)V

    .line 166
    .line 167
    .line 168
    new-instance v2, Ldefpackage/zr2;

    .line 169
    .line 170
    const/16 v6, 0x14

    .line 171
    .line 172
    invoke-direct {v2, v6}, Ldefpackage/zr2;-><init>(I)V

    .line 173
    .line 174
    .line 175
    new-instance v6, Ldefpackage/ef0;

    .line 176
    .line 177
    const/16 v7, 0x1d

    .line 178
    .line 179
    invoke-direct {v6, v7, v5, v2}, Ldefpackage/ef0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    new-instance v2, Ldefpackage/at2;

    .line 183
    .line 184
    invoke-direct {v2, v6, v3}, Ldefpackage/at2;-><init>(Ldefpackage/it2;I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4, v1, v8, v0, v2}, Ldefpackage/kt2;->O0(Ldefpackage/fr2;IILdefpackage/it2;)V

    .line 188
    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_8
    new-instance v0, Ldefpackage/et2;

    .line 192
    .line 193
    invoke-direct {v0, v5}, Ldefpackage/et2;-><init>(Ldefpackage/j60;)V

    .line 194
    .line 195
    .line 196
    invoke-static {v0}, Ldefpackage/kt2;->Q0(Ldefpackage/wc0;)Ldefpackage/ss2;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    invoke-virtual {v4, v1, v8, v12, v0}, Ldefpackage/kt2;->O0(Ldefpackage/fr2;IILdefpackage/it2;)V

    .line 201
    .line 202
    .line 203
    :goto_1
    invoke-virtual {v10, v1}, Ldefpackage/na4;->s(Ldefpackage/fr2;)V

    .line 204
    .line 205
    .line 206
    goto :goto_2

    .line 207
    :catch_0
    move-exception v0

    .line 208
    new-instance v2, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    const-string v3, "Failed to convert predefined custom command: "

    .line 211
    .line 212
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    invoke-static {v9, v2, v0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 223
    .line 224
    .line 225
    new-instance v0, Ldefpackage/ab4;

    .line 226
    .line 227
    const/4 v2, -0x3

    .line 228
    invoke-direct {v0, v2}, Ldefpackage/ab4;-><init>(I)V

    .line 229
    .line 230
    .line 231
    invoke-static {v7, v1, v8, v0}, Ldefpackage/kt2;->P0(Ldefpackage/tn2;Ldefpackage/fr2;ILdefpackage/ab4;)V

    .line 232
    .line 233
    .line 234
    :goto_2
    return-void

    .line 235
    :pswitch_0
    iget v1, v0, Ldefpackage/ls1;->o:I

    .line 236
    .line 237
    iget-object v4, v0, Ldefpackage/ls1;->p:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v4, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 240
    .line 241
    iget-object v5, v0, Ldefpackage/ls1;->q:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast v5, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 244
    .line 245
    iget-object v6, v0, Ldefpackage/ls1;->r:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v6, Ljava/util/ArrayList;

    .line 248
    .line 249
    iget-object v7, v0, Ldefpackage/ls1;->s:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v7, Ljava/util/List;

    .line 252
    .line 253
    iget-object v0, v0, Ldefpackage/ls1;->t:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v0, Ljava/lang/String;

    .line 256
    .line 257
    sget v8, Ldefpackage/ms1;->b:I

    .line 258
    .line 259
    if-ne v1, v8, :cond_1a

    .line 260
    .line 261
    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    if-nez v1, :cond_1a

    .line 266
    .line 267
    invoke-virtual {v4}, Landroid/app/Activity;->isDestroyed()Z

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    if-eqz v1, :cond_9

    .line 272
    .line 273
    goto/16 :goto_f

    .line 274
    .line 275
    :cond_9
    if-nez v5, :cond_a

    .line 276
    .line 277
    const v0, 0x7f1301f7

    .line 278
    .line 279
    .line 280
    invoke-static {v4, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 285
    .line 286
    .line 287
    goto/16 :goto_f

    .line 288
    .line 289
    :cond_a
    sget-object v1, Ldefpackage/rs1;->a:Ldefpackage/rs1;

    .line 290
    .line 291
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    new-instance v1, Ljava/util/ArrayList;

    .line 295
    .line 296
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 297
    .line 298
    .line 299
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 300
    .line 301
    .line 302
    move-result-object v8

    .line 303
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 304
    .line 305
    .line 306
    move-result v9

    .line 307
    const/16 v10, 0xa

    .line 308
    .line 309
    const-string v11, "hub:"

    .line 310
    .line 311
    if-eqz v9, :cond_11

    .line 312
    .line 313
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v9

    .line 317
    check-cast v9, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;

    .line 318
    .line 319
    invoke-virtual {v9}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->getContext()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object v13

    .line 323
    if-eqz v13, :cond_f

    .line 324
    .line 325
    invoke-static {v13}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 326
    .line 327
    .line 328
    move-result v14

    .line 329
    if-nez v14, :cond_b

    .line 330
    .line 331
    goto :goto_4

    .line 332
    :cond_b
    const/4 v13, 0x0

    .line 333
    :goto_4
    if-eqz v13, :cond_f

    .line 334
    .line 335
    const/16 v14, 0x80

    .line 336
    .line 337
    invoke-static {v14, v13}, Ldefpackage/qm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v13

    .line 341
    invoke-virtual {v9}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->getSongId()Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object v14

    .line 345
    if-eqz v14, :cond_c

    .line 346
    .line 347
    invoke-static {v14}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 348
    .line 349
    .line 350
    move-result v15

    .line 351
    if-nez v15, :cond_c

    .line 352
    .line 353
    goto :goto_5

    .line 354
    :cond_c
    const/4 v14, 0x0

    .line 355
    :goto_5
    invoke-virtual {v9}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->getRef()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v9

    .line 359
    if-eqz v9, :cond_e

    .line 360
    .line 361
    invoke-static {v9}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 362
    .line 363
    .line 364
    move-result v15

    .line 365
    if-nez v15, :cond_d

    .line 366
    .line 367
    goto :goto_6

    .line 368
    :cond_d
    const/4 v9, 0x0

    .line 369
    :goto_6
    if-eqz v9, :cond_e

    .line 370
    .line 371
    invoke-virtual {v11, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v12

    .line 375
    goto :goto_7

    .line 376
    :cond_e
    const/4 v12, 0x0

    .line 377
    :goto_7
    filled-new-array {v14, v12}, [Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v9

    .line 381
    invoke-static {v9}, Ldefpackage/ti;->i0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 382
    .line 383
    .line 384
    move-result-object v9

    .line 385
    new-instance v11, Ljava/util/ArrayList;

    .line 386
    .line 387
    invoke-static {v9, v10}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 388
    .line 389
    .line 390
    move-result v10

    .line 391
    invoke-direct {v11, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 395
    .line 396
    .line 397
    move-result v10

    .line 398
    move v12, v2

    .line 399
    :goto_8
    if-ge v12, v10, :cond_10

    .line 400
    .line 401
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v14

    .line 405
    add-int/lit8 v12, v12, 0x1

    .line 406
    .line 407
    check-cast v14, Ljava/lang/String;

    .line 408
    .line 409
    new-instance v15, Ldefpackage/kd3;

    .line 410
    .line 411
    invoke-direct {v15, v14, v13}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v11, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 415
    .line 416
    .line 417
    goto :goto_8

    .line 418
    :cond_f
    sget-object v11, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 419
    .line 420
    :cond_10
    invoke-static {v11, v1}, Ldefpackage/v40;->n0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 421
    .line 422
    .line 423
    goto :goto_3

    .line 424
    :cond_11
    invoke-static {v1}, Ldefpackage/lg2;->Z(Ljava/util/ArrayList;)Ljava/util/Map;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    new-instance v8, Ldefpackage/k62;

    .line 429
    .line 430
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 431
    .line 432
    .line 433
    move-result-object v9

    .line 434
    invoke-virtual {v9}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v9

    .line 438
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-static {v0}, Ldefpackage/gi1;->b0(Ljava/lang/String;)Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v13

    .line 445
    invoke-direct {v8, v9, v13}, Ldefpackage/k62;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 446
    .line 447
    .line 448
    new-instance v9, Ljava/util/ArrayList;

    .line 449
    .line 450
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 451
    .line 452
    .line 453
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 454
    .line 455
    .line 456
    move-result-object v7

    .line 457
    :goto_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 458
    .line 459
    .line 460
    move-result v13

    .line 461
    if-eqz v13, :cond_18

    .line 462
    .line 463
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v13

    .line 467
    check-cast v13, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;

    .line 468
    .line 469
    sget-object v14, Ldefpackage/k62;->c:Ldefpackage/ux3;

    .line 470
    .line 471
    invoke-virtual {v13}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->getLaunchId()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v14

    .line 475
    invoke-virtual {v13}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->getLaunchOrigin()Ljava/lang/String;

    .line 476
    .line 477
    .line 478
    move-result-object v15

    .line 479
    if-nez v15, :cond_12

    .line 480
    .line 481
    move-object v15, v0

    .line 482
    :cond_12
    invoke-static {v14, v15}, Ldefpackage/gi1;->P(Ljava/lang/String;Ljava/lang/String;)Ldefpackage/k62;

    .line 483
    .line 484
    .line 485
    move-result-object v14

    .line 486
    if-nez v14, :cond_13

    .line 487
    .line 488
    move-object v14, v8

    .line 489
    :cond_13
    invoke-virtual {v13}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->getSongId()Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v15

    .line 493
    if-eqz v15, :cond_14

    .line 494
    .line 495
    invoke-static {v15}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 496
    .line 497
    .line 498
    move-result v16

    .line 499
    if-nez v16, :cond_14

    .line 500
    .line 501
    goto :goto_a

    .line 502
    :cond_14
    const/4 v15, 0x0

    .line 503
    :goto_a
    invoke-virtual {v13}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->getRef()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v13

    .line 507
    if-eqz v13, :cond_16

    .line 508
    .line 509
    invoke-static {v13}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 510
    .line 511
    .line 512
    move-result v16

    .line 513
    if-nez v16, :cond_15

    .line 514
    .line 515
    goto :goto_b

    .line 516
    :cond_15
    const/4 v13, 0x0

    .line 517
    :goto_b
    if-eqz v13, :cond_16

    .line 518
    .line 519
    invoke-virtual {v11, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v13

    .line 523
    goto :goto_c

    .line 524
    :cond_16
    const/4 v13, 0x0

    .line 525
    :goto_c
    filled-new-array {v15, v13}, [Ljava/lang/String;

    .line 526
    .line 527
    .line 528
    move-result-object v13

    .line 529
    invoke-static {v13}, Ldefpackage/ti;->i0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 530
    .line 531
    .line 532
    move-result-object v13

    .line 533
    new-instance v15, Ljava/util/ArrayList;

    .line 534
    .line 535
    invoke-static {v13, v10}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 536
    .line 537
    .line 538
    move-result v2

    .line 539
    invoke-direct {v15, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 543
    .line 544
    .line 545
    move-result v2

    .line 546
    const/4 v10, 0x0

    .line 547
    :goto_d
    if-ge v10, v2, :cond_17

    .line 548
    .line 549
    invoke-virtual {v13, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v17

    .line 553
    add-int/lit8 v10, v10, 0x1

    .line 554
    .line 555
    move-object/from16 v12, v17

    .line 556
    .line 557
    check-cast v12, Ljava/lang/String;

    .line 558
    .line 559
    new-instance v3, Ldefpackage/kd3;

    .line 560
    .line 561
    invoke-direct {v3, v12, v14}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v15, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    const/4 v3, 0x1

    .line 568
    goto :goto_d

    .line 569
    :cond_17
    invoke-static {v15, v9}, Ldefpackage/v40;->n0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 570
    .line 571
    .line 572
    const/4 v2, 0x0

    .line 573
    const/4 v3, 0x1

    .line 574
    const/16 v10, 0xa

    .line 575
    .line 576
    goto :goto_9

    .line 577
    :cond_18
    invoke-static {v9}, Ldefpackage/lg2;->Z(Ljava/util/ArrayList;)Ljava/util/Map;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    new-instance v2, Ldefpackage/kd3;

    .line 582
    .line 583
    invoke-direct {v2, v6, v1}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 584
    .line 585
    .line 586
    sput-object v2, Ldefpackage/rs1;->m:Ldefpackage/kd3;

    .line 587
    .line 588
    sput-object v0, Ldefpackage/rs1;->p:Ljava/util/Map;

    .line 589
    .line 590
    iget-object v0, v4, Lcom/eddyizm/tempus/ui/activity/MainActivity;->P:Ldefpackage/bl2;

    .line 591
    .line 592
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 593
    .line 594
    .line 595
    move-result v1

    .line 596
    if-gez v1, :cond_19

    .line 597
    .line 598
    const/4 v2, 0x0

    .line 599
    goto :goto_e

    .line 600
    :cond_19
    move v2, v1

    .line 601
    :goto_e
    invoke-static {v0, v6, v2}, Ldefpackage/bo2;->o(Ldefpackage/ic2;Ljava/util/List;I)V

    .line 602
    .line 603
    .line 604
    iget-object v0, v4, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Ldefpackage/zg5;

    .line 605
    .line 606
    iget-object v0, v0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 607
    .line 608
    check-cast v0, Ldefpackage/au;

    .line 609
    .line 610
    const/4 v1, 0x1

    .line 611
    invoke-virtual {v0, v1}, Ldefpackage/au;->d(Z)V

    .line 612
    .line 613
    .line 614
    :cond_1a
    :goto_f
    return-void

    .line 615
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
