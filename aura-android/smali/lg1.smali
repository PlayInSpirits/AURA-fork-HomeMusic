.class public final Llg1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 20
    iput p1, p0, Llg1;->n:I

    iput-object p2, p0, Llg1;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 18
    iput p1, p0, Llg1;->n:I

    iput-object p2, p0, Llg1;->o:Ljava/lang/Object;

    iput-object p3, p0, Llg1;->p:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lf22;Lb22;I)V
    .locals 0

    const/16 p3, 0x10

    iput p3, p0, Llg1;->n:I

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llg1;->p:Ljava/lang/Object;

    iput-object p2, p0, Llg1;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Li61;)V
    .locals 1

    .line 1
    const/16 v0, 0xc

    .line 2
    .line 3
    iput v0, p0, Llg1;->n:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Llg1;->p:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p1, p0, Llg1;->o:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V
    .locals 0

    .line 19
    iput p4, p0, Llg1;->n:I

    iput-object p1, p0, Llg1;->p:Ljava/lang/Object;

    iput-object p2, p0, Llg1;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljv3;)V
    .locals 1

    const/16 v0, 0x1a

    iput v0, p0, Llg1;->n:I

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Llg1;->p:Ljava/lang/Object;

    .line 23
    iput-object p1, p0, Llg1;->o:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Llg1;->n:I

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    const/4 v6, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lka0;

    .line 16
    .line 17
    iget-object v1, v1, Llg1;->p:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, Lnq;

    .line 20
    .line 21
    iget-object v2, v1, Lnq;->o:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lme;

    .line 24
    .line 25
    iget-object v3, v1, Lnq;->s:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v3, Lij1;

    .line 28
    .line 29
    iget-object v3, v3, Lij1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 30
    .line 31
    iget-object v6, v1, Lnq;->p:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v6, Lve;

    .line 34
    .line 35
    invoke-virtual {v3, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lgf5;

    .line 40
    .line 41
    if-nez v3, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    iget v6, v0, Lka0;->o:I

    .line 45
    .line 46
    if-nez v6, :cond_2

    .line 47
    .line 48
    iput-boolean v5, v1, Lnq;->n:Z

    .line 49
    .line 50
    invoke-interface {v2}, Lme;->i0()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    iget-boolean v0, v1, Lnq;->n:Z

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    iget-object v0, v1, Lnq;->q:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Leu1;

    .line 63
    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    iget-object v1, v1, Lnq;->r:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v1, Ljava/util/Set;

    .line 69
    .line 70
    invoke-interface {v2, v0, v1}, Lme;->j0(Leu1;Ljava/util/Set;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    :try_start_0
    invoke-interface {v2}, Lme;->Z()Ljava/util/Set;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-interface {v2, v4, v0}, Lme;->j0(Leu1;Ljava/util/Set;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :catch_0
    move-exception v0

    .line 83
    const-string v1, "GoogleApiManager"

    .line 84
    .line 85
    const-string v5, "Failed to get service from broker. "

    .line 86
    .line 87
    invoke-static {v1, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 88
    .line 89
    .line 90
    const-string v0, "Failed to get service from broker."

    .line 91
    .line 92
    invoke-interface {v2, v0}, Lme;->a0(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    new-instance v0, Lka0;

    .line 96
    .line 97
    const/16 v1, 0xa

    .line 98
    .line 99
    invoke-direct {v0, v1}, Lka0;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, v0, v4}, Lgf5;->l(Lka0;Ljava/lang/RuntimeException;)V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_2
    invoke-virtual {v3, v0, v4}, Lgf5;->l(Lka0;Ljava/lang/RuntimeException;)V

    .line 107
    .line 108
    .line 109
    :cond_3
    :goto_0
    return-void

    .line 110
    :pswitch_0
    iget-object v0, v1, Llg1;->p:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Lwp4;

    .line 113
    .line 114
    iget-object v0, v0, Lwp4;->n:Lsc5;

    .line 115
    .line 116
    iget-object v0, v0, Lsc5;->f:Lpq3;

    .line 117
    .line 118
    iget-object v2, v1, Llg1;->o:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v2, Ljava/lang/String;

    .line 121
    .line 122
    iget-object v3, v0, Lpq3;->k:Ljava/lang/Object;

    .line 123
    .line 124
    monitor-enter v3

    .line 125
    :try_start_1
    invoke-virtual {v0, v2}, Lpq3;->c(Ljava/lang/String;)Ltd5;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    if-eqz v0, :cond_4

    .line 130
    .line 131
    iget-object v4, v0, Ltd5;->a:Ldd5;

    .line 132
    .line 133
    monitor-exit v3

    .line 134
    goto :goto_1

    .line 135
    :catchall_0
    move-exception v0

    .line 136
    goto :goto_3

    .line 137
    :cond_4
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 138
    :goto_1
    if-eqz v4, :cond_5

    .line 139
    .line 140
    invoke-virtual {v4}, Ldd5;->c()Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-eqz v0, :cond_5

    .line 145
    .line 146
    iget-object v0, v1, Llg1;->p:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v0, Lwp4;

    .line 149
    .line 150
    iget-object v2, v0, Lwp4;->p:Ljava/lang/Object;

    .line 151
    .line 152
    monitor-enter v2

    .line 153
    :try_start_2
    iget-object v0, v1, Llg1;->p:Ljava/lang/Object;

    .line 154
    .line 155
    check-cast v0, Lwp4;

    .line 156
    .line 157
    iget-object v0, v0, Lwp4;->s:Ljava/util/HashMap;

    .line 158
    .line 159
    invoke-static {v4}, Lq05;->m(Ldd5;)Lrc5;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    iget-object v0, v1, Llg1;->p:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, Lwp4;

    .line 169
    .line 170
    iget-object v3, v0, Lwp4;->u:Lc52;

    .line 171
    .line 172
    iget-object v5, v0, Lwp4;->o:Lbq4;

    .line 173
    .line 174
    iget-object v5, v5, Lbq4;->o:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v5, Lpe0;

    .line 177
    .line 178
    invoke-static {v3, v4, v5, v0}, Llc5;->a(Lc52;Ldd5;Lpe0;Lc93;)Lsk4;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    iget-object v1, v1, Llg1;->p:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v1, Lwp4;

    .line 185
    .line 186
    iget-object v1, v1, Lwp4;->t:Ljava/util/HashMap;

    .line 187
    .line 188
    invoke-static {v4}, Lq05;->m(Ldd5;)Lrc5;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-virtual {v1, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    monitor-exit v2

    .line 196
    goto :goto_2

    .line 197
    :catchall_1
    move-exception v0

    .line 198
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 199
    throw v0

    .line 200
    :cond_5
    :goto_2
    return-void

    .line 201
    :goto_3
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 202
    throw v0

    .line 203
    :pswitch_1
    :try_start_4
    iget-object v0, v1, Llg1;->p:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v0, Ljava/lang/Runnable;

    .line 206
    .line 207
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 208
    .line 209
    .line 210
    iget-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v0, Lia4;

    .line 213
    .line 214
    iget-object v2, v0, Lia4;->r:Ljava/lang/Object;

    .line 215
    .line 216
    monitor-enter v2

    .line 217
    :try_start_5
    iget-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v0, Lia4;

    .line 220
    .line 221
    invoke-virtual {v0}, Lia4;->a()V

    .line 222
    .line 223
    .line 224
    monitor-exit v2

    .line 225
    return-void

    .line 226
    :catchall_2
    move-exception v0

    .line 227
    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 228
    throw v0

    .line 229
    :catchall_3
    move-exception v0

    .line 230
    iget-object v2, v1, Llg1;->o:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast v2, Lia4;

    .line 233
    .line 234
    iget-object v2, v2, Lia4;->r:Ljava/lang/Object;

    .line 235
    .line 236
    monitor-enter v2

    .line 237
    :try_start_6
    iget-object v1, v1, Llg1;->o:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v1, Lia4;

    .line 240
    .line 241
    invoke-virtual {v1}, Lia4;->a()V

    .line 242
    .line 243
    .line 244
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 245
    throw v0

    .line 246
    :catchall_4
    move-exception v0

    .line 247
    :try_start_7
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 248
    throw v0

    .line 249
    :pswitch_2
    const-string v0, "sort_search_chronologically"

    .line 250
    .line 251
    invoke-static {v0, v6}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    iget-object v2, v1, Llg1;->o:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v2, Ljv3;

    .line 258
    .line 259
    if-eqz v0, :cond_6

    .line 260
    .line 261
    iget-object v0, v2, Ljv3;->n:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast v0, Ls24;

    .line 264
    .line 265
    new-instance v2, Lms3;

    .line 266
    .line 267
    invoke-direct {v2, v3}, Lms3;-><init>(I)V

    .line 268
    .line 269
    .line 270
    invoke-static {v0, v5, v6, v2}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    check-cast v0, Ljava/util/List;

    .line 275
    .line 276
    iput-object v0, v1, Llg1;->p:Ljava/lang/Object;

    .line 277
    .line 278
    goto :goto_4

    .line 279
    :cond_6
    iget-object v0, v2, Ljv3;->n:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v0, Ls24;

    .line 282
    .line 283
    new-instance v2, Lms3;

    .line 284
    .line 285
    invoke-direct {v2, v5}, Lms3;-><init>(I)V

    .line 286
    .line 287
    .line 288
    invoke-static {v0, v5, v6, v2}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    check-cast v0, Ljava/util/List;

    .line 293
    .line 294
    iput-object v0, v1, Llg1;->p:Ljava/lang/Object;

    .line 295
    .line 296
    :goto_4
    return-void

    .line 297
    :pswitch_3
    iget-object v0, v1, Llg1;->p:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v0, Lcz;

    .line 300
    .line 301
    iget-object v1, v1, Llg1;->o:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v1, Ly21;

    .line 304
    .line 305
    invoke-virtual {v0, v1}, Lcz;->E(Lpe0;)V

    .line 306
    .line 307
    .line 308
    return-void

    .line 309
    :pswitch_4
    iget-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 310
    .line 311
    check-cast v0, Lua1;

    .line 312
    .line 313
    iget-object v1, v1, Llg1;->p:Ljava/lang/Object;

    .line 314
    .line 315
    invoke-virtual {v0, v1}, Lua1;->accept(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    return-void

    .line 319
    :pswitch_5
    iget-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v0, Lns3;

    .line 322
    .line 323
    invoke-virtual {v0}, Lns3;->c()Ljava/util/List;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    iput-object v0, v1, Llg1;->p:Ljava/lang/Object;

    .line 328
    .line 329
    return-void

    .line 330
    :pswitch_6
    iget-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 331
    .line 332
    check-cast v0, Lns3;

    .line 333
    .line 334
    iget-object v2, v0, Lns3;->o:Ljava/lang/Object;

    .line 335
    .line 336
    check-cast v2, Ls24;

    .line 337
    .line 338
    new-instance v3, Lks3;

    .line 339
    .line 340
    invoke-direct {v3, v0, v6}, Lks3;-><init>(Lns3;I)V

    .line 341
    .line 342
    .line 343
    invoke-static {v2, v5, v6, v3}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    check-cast v0, Lcom/eddyizm/tempus/model/Queue;

    .line 348
    .line 349
    iput-object v0, v1, Llg1;->p:Ljava/lang/Object;

    .line 350
    .line 351
    return-void

    .line 352
    :pswitch_7
    iget-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 353
    .line 354
    check-cast v0, Lml3;

    .line 355
    .line 356
    iget-object v1, v1, Llg1;->p:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v1, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 359
    .line 360
    iget-object v2, v0, Lml3;->a:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v2, Ls24;

    .line 363
    .line 364
    new-instance v3, Lhl3;

    .line 365
    .line 366
    invoke-direct {v3, v0, v1, v6}, Lhl3;-><init>(Lml3;Lcom/eddyizm/tempus/subsonic/models/Playlist;I)V

    .line 367
    .line 368
    .line 369
    invoke-static {v2, v6, v5, v3}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    return-void

    .line 373
    :pswitch_8
    iget-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 374
    .line 375
    check-cast v0, Lhg3;

    .line 376
    .line 377
    iget-object v0, v0, Lhg3;->o:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v0, Landroid/os/Messenger;

    .line 380
    .line 381
    invoke-virtual {v0}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    iget-object v1, v1, Llg1;->p:Ljava/lang/Object;

    .line 386
    .line 387
    check-cast v1, Lpz1;

    .line 388
    .line 389
    iget-object v1, v1, Lpz1;->o:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v1, Lpn2;

    .line 392
    .line 393
    iget-object v1, v1, Lpn2;->r:Loi;

    .line 394
    .line 395
    invoke-virtual {v1, v0}, Lyd4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    check-cast v1, Loj2;

    .line 400
    .line 401
    if-eqz v1, :cond_7

    .line 402
    .line 403
    invoke-interface {v0, v1, v6}, Landroid/os/IBinder;->unlinkToDeath(Landroid/os/IBinder$DeathRecipient;I)Z

    .line 404
    .line 405
    .line 406
    :cond_7
    return-void

    .line 407
    :pswitch_9
    iget-object v0, v1, Llg1;->p:Ljava/lang/Object;

    .line 408
    .line 409
    check-cast v0, Lbq4;

    .line 410
    .line 411
    iget-object v1, v1, Llg1;->o:Ljava/lang/Object;

    .line 412
    .line 413
    check-cast v1, Lpr2;

    .line 414
    .line 415
    iget-object v2, v0, Lbq4;->n:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v2, Ljava/util/ArrayList;

    .line 418
    .line 419
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    if-nez v3, :cond_9

    .line 424
    .line 425
    invoke-virtual {v1}, Lpr2;->a()Lqu1;

    .line 426
    .line 427
    .line 428
    move-result-object v3

    .line 429
    if-eqz v3, :cond_8

    .line 430
    .line 431
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 432
    .line 433
    .line 434
    move-result v4

    .line 435
    :goto_5
    if-ge v6, v4, :cond_8

    .line 436
    .line 437
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 438
    .line 439
    .line 440
    move-result-object v5

    .line 441
    add-int/lit8 v6, v6, 0x1

    .line 442
    .line 443
    check-cast v5, Landroid/os/Bundle;

    .line 444
    .line 445
    const-string v7, "extra_session_binder"

    .line 446
    .line 447
    invoke-interface {v3}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 448
    .line 449
    .line 450
    move-result-object v8

    .line 451
    invoke-virtual {v5, v7, v8}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 452
    .line 453
    .line 454
    goto :goto_5

    .line 455
    :cond_8
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 456
    .line 457
    .line 458
    :cond_9
    iget-object v0, v0, Lbq4;->o:Ljava/lang/Object;

    .line 459
    .line 460
    check-cast v0, Lqj2;

    .line 461
    .line 462
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    iget-object v1, v1, Lpr2;->o:Landroid/media/session/MediaSession$Token;

    .line 466
    .line 467
    invoke-virtual {v0, v1}, Landroid/service/media/MediaBrowserService;->setSessionToken(Landroid/media/session/MediaSession$Token;)V

    .line 468
    .line 469
    .line 470
    return-void

    .line 471
    :pswitch_a
    iget-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 472
    .line 473
    check-cast v0, Lrf2;

    .line 474
    .line 475
    iget-object v1, v1, Llg1;->p:Ljava/lang/Object;

    .line 476
    .line 477
    check-cast v1, Lcom/eddyizm/tempus/model/LyricsCache;

    .line 478
    .line 479
    iget-object v2, v0, Lrf2;->n:Ljava/lang/Object;

    .line 480
    .line 481
    check-cast v2, Ls24;

    .line 482
    .line 483
    new-instance v3, Lo;

    .line 484
    .line 485
    const/16 v4, 0x12

    .line 486
    .line 487
    invoke-direct {v3, v4, v0, v1}, Lo;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    invoke-static {v2, v6, v5, v3}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    return-void

    .line 494
    :pswitch_b
    iget-object v0, v1, Llg1;->p:Ljava/lang/Object;

    .line 495
    .line 496
    move-object v2, v0

    .line 497
    check-cast v2, Lla2;

    .line 498
    .line 499
    iget-object v3, v2, Lla2;->q:Lpe0;

    .line 500
    .line 501
    :cond_a
    :try_start_8
    iget-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v0, Ljava/lang/Runnable;

    .line 504
    .line 505
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 506
    .line 507
    .line 508
    goto :goto_6

    .line 509
    :catchall_5
    move-exception v0

    .line 510
    sget-object v4, Lq01;->n:Lq01;

    .line 511
    .line 512
    invoke-static {v4, v0}, Luc5;->s(Lne0;Ljava/lang/Throwable;)V

    .line 513
    .line 514
    .line 515
    :goto_6
    invoke-virtual {v2}, Lla2;->a0()Ljava/lang/Runnable;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    if-nez v0, :cond_b

    .line 520
    .line 521
    goto :goto_7

    .line 522
    :cond_b
    iput-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 523
    .line 524
    add-int/2addr v6, v5

    .line 525
    const/16 v0, 0x10

    .line 526
    .line 527
    if-lt v6, v0, :cond_a

    .line 528
    .line 529
    invoke-virtual {v3, v2}, Lpe0;->Y(Lne0;)Z

    .line 530
    .line 531
    .line 532
    move-result v0

    .line 533
    if-eqz v0, :cond_a

    .line 534
    .line 535
    invoke-virtual {v3, v2, v1}, Lpe0;->W(Lne0;Ljava/lang/Runnable;)V

    .line 536
    .line 537
    .line 538
    :goto_7
    return-void

    .line 539
    :pswitch_c
    iget-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast v0, Lb22;

    .line 542
    .line 543
    iget-object v2, v0, Lb22;->e:Lcx3;

    .line 544
    .line 545
    iget-object v3, v1, Llg1;->p:Ljava/lang/Object;

    .line 546
    .line 547
    check-cast v3, Lf22;

    .line 548
    .line 549
    iget-object v4, v3, Lf22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 550
    .line 551
    if-eqz v4, :cond_10

    .line 552
    .line 553
    iget-boolean v4, v4, Landroidx/recyclerview/widget/RecyclerView;->F:Z

    .line 554
    .line 555
    if-eqz v4, :cond_10

    .line 556
    .line 557
    iget-boolean v0, v0, Lb22;->k:Z

    .line 558
    .line 559
    if-nez v0, :cond_10

    .line 560
    .line 561
    invoke-virtual {v2}, Lcx3;->b()I

    .line 562
    .line 563
    .line 564
    move-result v0

    .line 565
    const/4 v4, -0x1

    .line 566
    if-eq v0, v4, :cond_10

    .line 567
    .line 568
    iget-object v0, v3, Lf22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 569
    .line 570
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Ljw3;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    if-eqz v0, :cond_c

    .line 575
    .line 576
    invoke-virtual {v0}, Ljw3;->f()Z

    .line 577
    .line 578
    .line 579
    move-result v0

    .line 580
    if-nez v0, :cond_d

    .line 581
    .line 582
    :cond_c
    iget-object v0, v3, Lf22;->p:Ljava/util/ArrayList;

    .line 583
    .line 584
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 585
    .line 586
    .line 587
    move-result v4

    .line 588
    :goto_8
    if-ge v6, v4, :cond_f

    .line 589
    .line 590
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v5

    .line 594
    check-cast v5, Lb22;

    .line 595
    .line 596
    iget-boolean v5, v5, Lb22;->l:Z

    .line 597
    .line 598
    if-nez v5, :cond_e

    .line 599
    .line 600
    :cond_d
    iget-object v0, v3, Lf22;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 601
    .line 602
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 603
    .line 604
    .line 605
    goto :goto_9

    .line 606
    :cond_e
    add-int/lit8 v6, v6, 0x1

    .line 607
    .line 608
    goto :goto_8

    .line 609
    :cond_f
    iget-object v0, v3, Lf22;->m:Le22;

    .line 610
    .line 611
    invoke-virtual {v0, v2}, Le22;->i(Lcx3;)V

    .line 612
    .line 613
    .line 614
    :cond_10
    :goto_9
    return-void

    .line 615
    :pswitch_d
    iget-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 616
    .line 617
    check-cast v0, Lcz;

    .line 618
    .line 619
    iget-object v1, v1, Llg1;->p:Ljava/lang/Object;

    .line 620
    .line 621
    check-cast v1, Lfl1;

    .line 622
    .line 623
    invoke-virtual {v0, v1}, Lcz;->E(Lpe0;)V

    .line 624
    .line 625
    .line 626
    return-void

    .line 627
    :pswitch_e
    iget-object v0, v1, Llg1;->p:Ljava/lang/Object;

    .line 628
    .line 629
    move-object v3, v0

    .line 630
    check-cast v3, Lki1;

    .line 631
    .line 632
    iget-boolean v0, v3, Lki1;->d:Z

    .line 633
    .line 634
    if-eqz v0, :cond_11

    .line 635
    .line 636
    new-instance v0, Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 637
    .line 638
    invoke-direct {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;-><init>()V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->detectNetwork()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->penaltyDeath()Landroid/os/StrictMode$ThreadPolicy$Builder;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    invoke-virtual {v0}, Landroid/os/StrictMode$ThreadPolicy$Builder;->build()Landroid/os/StrictMode$ThreadPolicy;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    invoke-static {v0}, Landroid/os/StrictMode;->setThreadPolicy(Landroid/os/StrictMode$ThreadPolicy;)V

    .line 654
    .line 655
    .line 656
    :cond_11
    :try_start_9
    iget-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 657
    .line 658
    check-cast v0, Ljava/lang/Runnable;

    .line 659
    .line 660
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 661
    .line 662
    .line 663
    goto :goto_a

    .line 664
    :catchall_6
    move-exception v0

    .line 665
    iget-object v1, v3, Lki1;->c:Lfz0;

    .line 666
    .line 667
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 668
    .line 669
    .line 670
    const-string v1, "GlideExecutor"

    .line 671
    .line 672
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 673
    .line 674
    .line 675
    move-result v2

    .line 676
    if-eqz v2, :cond_12

    .line 677
    .line 678
    const-string v2, "Request threw uncaught throwable"

    .line 679
    .line 680
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 681
    .line 682
    .line 683
    :cond_12
    :goto_a
    return-void

    .line 684
    :pswitch_f
    invoke-static {}, Lll1;->a()Lll1;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 689
    .line 690
    .line 691
    invoke-static {}, Le35;->m()V

    .line 692
    .line 693
    .line 694
    iget-object v0, v0, Lll1;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 695
    .line 696
    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 697
    .line 698
    .line 699
    iget-object v0, v1, Llg1;->p:Ljava/lang/Object;

    .line 700
    .line 701
    check-cast v0, Li71;

    .line 702
    .line 703
    iget-object v0, v0, Li71;->o:Lj71;

    .line 704
    .line 705
    iput-boolean v5, v0, Lj71;->o:Z

    .line 706
    .line 707
    iget-object v0, v1, Llg1;->p:Ljava/lang/Object;

    .line 708
    .line 709
    check-cast v0, Li71;

    .line 710
    .line 711
    iget-object v0, v0, Li71;->n:Landroid/view/View;

    .line 712
    .line 713
    iget-object v2, v1, Llg1;->o:Ljava/lang/Object;

    .line 714
    .line 715
    check-cast v2, Li71;

    .line 716
    .line 717
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 718
    .line 719
    .line 720
    move-result-object v0

    .line 721
    invoke-virtual {v0, v2}, Landroid/view/ViewTreeObserver;->removeOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    .line 722
    .line 723
    .line 724
    iget-object v0, v1, Llg1;->p:Ljava/lang/Object;

    .line 725
    .line 726
    check-cast v0, Li71;

    .line 727
    .line 728
    iget-object v0, v0, Li71;->o:Lj71;

    .line 729
    .line 730
    iget-object v0, v0, Lj71;->n:Ljava/util/Set;

    .line 731
    .line 732
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 733
    .line 734
    .line 735
    return-void

    .line 736
    :pswitch_10
    iget-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 737
    .line 738
    check-cast v0, Li61;

    .line 739
    .line 740
    iget-object v0, v0, Li61;->o:Ljava/lang/Object;

    .line 741
    .line 742
    check-cast v0, Ls24;

    .line 743
    .line 744
    new-instance v2, Lk2;

    .line 745
    .line 746
    const/16 v3, 0x11

    .line 747
    .line 748
    invoke-direct {v2, v3, v6}, Lk2;-><init>(IB)V

    .line 749
    .line 750
    .line 751
    invoke-static {v0, v5, v6, v2}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    move-result-object v0

    .line 755
    check-cast v0, Ljava/util/List;

    .line 756
    .line 757
    iput-object v0, v1, Llg1;->p:Ljava/lang/Object;

    .line 758
    .line 759
    return-void

    .line 760
    :pswitch_11
    iget-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 761
    .line 762
    check-cast v0, Lss0;

    .line 763
    .line 764
    iget-object v1, v1, Llg1;->p:Ljava/lang/Object;

    .line 765
    .line 766
    check-cast v1, Lcom/eddyizm/tempus/model/Download;

    .line 767
    .line 768
    iget-object v2, v0, Lss0;->n:Ljava/lang/Object;

    .line 769
    .line 770
    check-cast v2, Ls24;

    .line 771
    .line 772
    new-instance v3, Lo;

    .line 773
    .line 774
    const/4 v4, 0x5

    .line 775
    invoke-direct {v3, v4, v0, v1}, Lo;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 776
    .line 777
    .line 778
    invoke-static {v2, v6, v5, v3}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    return-void

    .line 782
    :pswitch_12
    iget-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 783
    .line 784
    check-cast v0, Lss0;

    .line 785
    .line 786
    iget-object v2, v0, Lss0;->n:Ljava/lang/Object;

    .line 787
    .line 788
    check-cast v2, Ls24;

    .line 789
    .line 790
    new-instance v3, Los0;

    .line 791
    .line 792
    invoke-direct {v3, v0, v6}, Los0;-><init>(Lss0;I)V

    .line 793
    .line 794
    .line 795
    invoke-static {v2, v5, v6, v3}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    check-cast v0, Ljava/util/List;

    .line 800
    .line 801
    iput-object v0, v1, Llg1;->p:Ljava/lang/Object;

    .line 802
    .line 803
    return-void

    .line 804
    :pswitch_13
    iget-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 805
    .line 806
    check-cast v0, Lss0;

    .line 807
    .line 808
    iget-object v1, v1, Llg1;->p:Ljava/lang/Object;

    .line 809
    .line 810
    check-cast v1, Ljava/util/ArrayList;

    .line 811
    .line 812
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 813
    .line 814
    .line 815
    new-instance v3, Ljava/lang/StringBuilder;

    .line 816
    .line 817
    const-string v4, "DELETE FROM download WHERE id IN ("

    .line 818
    .line 819
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 820
    .line 821
    .line 822
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 823
    .line 824
    .line 825
    move-result v4

    .line 826
    move v7, v6

    .line 827
    :goto_b
    if-ge v7, v4, :cond_14

    .line 828
    .line 829
    const-string v8, "?"

    .line 830
    .line 831
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 832
    .line 833
    .line 834
    add-int/lit8 v8, v4, -0x1

    .line 835
    .line 836
    if-ge v7, v8, :cond_13

    .line 837
    .line 838
    const-string v8, ","

    .line 839
    .line 840
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 841
    .line 842
    .line 843
    :cond_13
    add-int/lit8 v7, v7, 0x1

    .line 844
    .line 845
    goto :goto_b

    .line 846
    :cond_14
    const-string v4, ")"

    .line 847
    .line 848
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 849
    .line 850
    .line 851
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 852
    .line 853
    .line 854
    move-result-object v3

    .line 855
    iget-object v0, v0, Lss0;->n:Ljava/lang/Object;

    .line 856
    .line 857
    check-cast v0, Ls24;

    .line 858
    .line 859
    new-instance v4, Lo;

    .line 860
    .line 861
    invoke-direct {v4, v2, v3, v1}, Lo;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 862
    .line 863
    .line 864
    invoke-static {v0, v6, v5, v4}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 865
    .line 866
    .line 867
    return-void

    .line 868
    :pswitch_14
    invoke-static {}, Lcx;->f()Lcx;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    sget-object v2, Ldo0;->e:Ljava/lang/String;

    .line 873
    .line 874
    new-instance v3, Ljava/lang/StringBuilder;

    .line 875
    .line 876
    const-string v4, "Scheduling work "

    .line 877
    .line 878
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 879
    .line 880
    .line 881
    iget-object v4, v1, Llg1;->o:Ljava/lang/Object;

    .line 882
    .line 883
    check-cast v4, Ldd5;

    .line 884
    .line 885
    iget-object v5, v4, Ldd5;->a:Ljava/lang/String;

    .line 886
    .line 887
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 888
    .line 889
    .line 890
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 891
    .line 892
    .line 893
    move-result-object v3

    .line 894
    invoke-virtual {v0, v2, v3}, Lcx;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 895
    .line 896
    .line 897
    iget-object v0, v1, Llg1;->p:Ljava/lang/Object;

    .line 898
    .line 899
    check-cast v0, Ldo0;

    .line 900
    .line 901
    iget-object v0, v0, Ldo0;->a:Ldk1;

    .line 902
    .line 903
    filled-new-array {v4}, [Ldd5;

    .line 904
    .line 905
    .line 906
    move-result-object v1

    .line 907
    invoke-virtual {v0, v1}, Ldk1;->e([Ldd5;)V

    .line 908
    .line 909
    .line 910
    return-void

    .line 911
    :pswitch_15
    iget-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 912
    .line 913
    check-cast v0, Lr20;

    .line 914
    .line 915
    iget-object v1, v1, Llg1;->p:Ljava/lang/Object;

    .line 916
    .line 917
    check-cast v1, Lcom/eddyizm/tempus/model/Chronology;

    .line 918
    .line 919
    iget-object v2, v0, Lr20;->o:Ljava/lang/Object;

    .line 920
    .line 921
    check-cast v2, Ls24;

    .line 922
    .line 923
    new-instance v3, Lo;

    .line 924
    .line 925
    const/4 v4, 0x4

    .line 926
    invoke-direct {v3, v4, v0, v1}, Lo;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 927
    .line 928
    .line 929
    invoke-static {v2, v6, v5, v3}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 930
    .line 931
    .line 932
    return-void

    .line 933
    :pswitch_16
    iget-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 934
    .line 935
    check-cast v0, Lc05;

    .line 936
    .line 937
    iget-object v1, v1, Llg1;->p:Ljava/lang/Object;

    .line 938
    .line 939
    check-cast v1, Landroid/graphics/Typeface;

    .line 940
    .line 941
    iget-object v0, v0, Lc05;->n:Ljava/lang/Object;

    .line 942
    .line 943
    check-cast v0, Lau0;

    .line 944
    .line 945
    if-eqz v0, :cond_15

    .line 946
    .line 947
    invoke-virtual {v0, v1}, Lau0;->N(Landroid/graphics/Typeface;)V

    .line 948
    .line 949
    .line 950
    :cond_15
    return-void

    .line 951
    :pswitch_17
    iget-object v0, v1, Llg1;->p:Ljava/lang/Object;

    .line 952
    .line 953
    check-cast v0, Lnk;

    .line 954
    .line 955
    iget-object v2, v0, Lnk;->r:Lpk;

    .line 956
    .line 957
    iget v7, v2, Lpk;->g:I

    .line 958
    .line 959
    iget v8, v0, Lnk;->p:I

    .line 960
    .line 961
    if-ne v7, v8, :cond_21

    .line 962
    .line 963
    iget-object v7, v0, Lnk;->o:Ljava/util/List;

    .line 964
    .line 965
    iget-object v1, v1, Llg1;->o:Ljava/lang/Object;

    .line 966
    .line 967
    check-cast v1, Lxp0;

    .line 968
    .line 969
    iget-object v0, v0, Lnk;->q:Ljava/lang/Runnable;

    .line 970
    .line 971
    iput-object v7, v2, Lpk;->e:Ljava/util/List;

    .line 972
    .line 973
    invoke-static {v7}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 974
    .line 975
    .line 976
    move-result-object v7

    .line 977
    iput-object v7, v2, Lpk;->f:Ljava/util/List;

    .line 978
    .line 979
    iget-object v7, v2, Lpk;->a:Lhg3;

    .line 980
    .line 981
    iget-object v8, v1, Lxp0;->b:[I

    .line 982
    .line 983
    iget-object v9, v1, Lxp0;->a:Ljava/util/ArrayList;

    .line 984
    .line 985
    iget v10, v1, Lxp0;->e:I

    .line 986
    .line 987
    iget-object v11, v1, Lxp0;->d:Lzg5;

    .line 988
    .line 989
    new-instance v12, Lqr;

    .line 990
    .line 991
    invoke-direct {v12, v7}, Lqr;-><init>(Lfc2;)V

    .line 992
    .line 993
    .line 994
    new-instance v7, Ljava/util/ArrayDeque;

    .line 995
    .line 996
    invoke-direct {v7}, Ljava/util/ArrayDeque;-><init>()V

    .line 997
    .line 998
    .line 999
    iget v13, v1, Lxp0;->f:I

    .line 1000
    .line 1001
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 1002
    .line 1003
    .line 1004
    move-result v14

    .line 1005
    sub-int/2addr v14, v5

    .line 1006
    move v15, v14

    .line 1007
    move v14, v13

    .line 1008
    move v13, v10

    .line 1009
    :goto_c
    if-ltz v15, :cond_20

    .line 1010
    .line 1011
    invoke-virtual {v9, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v16

    .line 1015
    move-object/from16 v3, v16

    .line 1016
    .line 1017
    check-cast v3, Lwp0;

    .line 1018
    .line 1019
    iget v4, v3, Lwp0;->a:I

    .line 1020
    .line 1021
    move/from16 v17, v5

    .line 1022
    .line 1023
    iget v5, v3, Lwp0;->c:I

    .line 1024
    .line 1025
    add-int v6, v4, v5

    .line 1026
    .line 1027
    iget v3, v3, Lwp0;->b:I

    .line 1028
    .line 1029
    move/from16 p0, v3

    .line 1030
    .line 1031
    add-int v3, p0, v5

    .line 1032
    .line 1033
    :goto_d
    if-le v13, v6, :cond_19

    .line 1034
    .line 1035
    add-int/lit8 v13, v13, -0x1

    .line 1036
    .line 1037
    aget v18, v8, v13

    .line 1038
    .line 1039
    and-int/lit8 v19, v18, 0xc

    .line 1040
    .line 1041
    if-eqz v19, :cond_18

    .line 1042
    .line 1043
    move/from16 v19, v4

    .line 1044
    .line 1045
    shr-int/lit8 v4, v18, 0x4

    .line 1046
    .line 1047
    move/from16 v20, v6

    .line 1048
    .line 1049
    move-object/from16 v21, v8

    .line 1050
    .line 1051
    const/4 v6, 0x0

    .line 1052
    invoke-static {v7, v4, v6}, Lxp0;->a(Ljava/util/ArrayDeque;IZ)Lyp0;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v8

    .line 1056
    if-eqz v8, :cond_17

    .line 1057
    .line 1058
    iget v6, v8, Lyp0;->b:I

    .line 1059
    .line 1060
    sub-int v6, v10, v6

    .line 1061
    .line 1062
    add-int/lit8 v6, v6, -0x1

    .line 1063
    .line 1064
    invoke-virtual {v12, v13, v6}, Lqr;->a(II)V

    .line 1065
    .line 1066
    .line 1067
    and-int/lit8 v8, v18, 0x4

    .line 1068
    .line 1069
    if-eqz v8, :cond_16

    .line 1070
    .line 1071
    invoke-virtual {v11, v13, v4}, Lzg5;->s(II)V

    .line 1072
    .line 1073
    .line 1074
    move/from16 v8, v17

    .line 1075
    .line 1076
    const/4 v4, 0x0

    .line 1077
    invoke-virtual {v12, v6, v8, v4}, Lqr;->y(IILjava/lang/Object;)V

    .line 1078
    .line 1079
    .line 1080
    goto :goto_e

    .line 1081
    :cond_16
    move/from16 v8, v17

    .line 1082
    .line 1083
    goto :goto_e

    .line 1084
    :cond_17
    move/from16 v8, v17

    .line 1085
    .line 1086
    new-instance v4, Lyp0;

    .line 1087
    .line 1088
    sub-int v6, v10, v13

    .line 1089
    .line 1090
    sub-int/2addr v6, v8

    .line 1091
    invoke-direct {v4, v13, v6, v8}, Lyp0;-><init>(IIZ)V

    .line 1092
    .line 1093
    .line 1094
    invoke-virtual {v7, v4}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 1095
    .line 1096
    .line 1097
    goto :goto_e

    .line 1098
    :cond_18
    move/from16 v19, v4

    .line 1099
    .line 1100
    move/from16 v20, v6

    .line 1101
    .line 1102
    move-object/from16 v21, v8

    .line 1103
    .line 1104
    move/from16 v8, v17

    .line 1105
    .line 1106
    invoke-virtual {v12, v13, v8}, Lqr;->r(II)V

    .line 1107
    .line 1108
    .line 1109
    add-int/lit8 v10, v10, -0x1

    .line 1110
    .line 1111
    :goto_e
    move/from16 v4, v19

    .line 1112
    .line 1113
    move/from16 v6, v20

    .line 1114
    .line 1115
    move-object/from16 v8, v21

    .line 1116
    .line 1117
    const/16 v17, 0x1

    .line 1118
    .line 1119
    goto :goto_d

    .line 1120
    :cond_19
    move/from16 v19, v4

    .line 1121
    .line 1122
    move-object/from16 v21, v8

    .line 1123
    .line 1124
    :goto_f
    if-le v14, v3, :cond_1d

    .line 1125
    .line 1126
    add-int/lit8 v14, v14, -0x1

    .line 1127
    .line 1128
    iget-object v4, v1, Lxp0;->c:[I

    .line 1129
    .line 1130
    aget v4, v4, v14

    .line 1131
    .line 1132
    and-int/lit8 v6, v4, 0xc

    .line 1133
    .line 1134
    if-eqz v6, :cond_1b

    .line 1135
    .line 1136
    shr-int/lit8 v6, v4, 0x4

    .line 1137
    .line 1138
    move-object/from16 v18, v1

    .line 1139
    .line 1140
    const/4 v8, 0x1

    .line 1141
    invoke-static {v7, v6, v8}, Lxp0;->a(Ljava/util/ArrayDeque;IZ)Lyp0;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v1

    .line 1145
    if-nez v1, :cond_1a

    .line 1146
    .line 1147
    new-instance v1, Lyp0;

    .line 1148
    .line 1149
    sub-int v4, v10, v13

    .line 1150
    .line 1151
    const/4 v6, 0x0

    .line 1152
    invoke-direct {v1, v14, v4, v6}, Lyp0;-><init>(IIZ)V

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual {v7, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 1156
    .line 1157
    .line 1158
    goto :goto_10

    .line 1159
    :cond_1a
    iget v1, v1, Lyp0;->b:I

    .line 1160
    .line 1161
    sub-int v1, v10, v1

    .line 1162
    .line 1163
    sub-int/2addr v1, v8

    .line 1164
    invoke-virtual {v12, v1, v13}, Lqr;->a(II)V

    .line 1165
    .line 1166
    .line 1167
    and-int/lit8 v1, v4, 0x4

    .line 1168
    .line 1169
    if-eqz v1, :cond_1c

    .line 1170
    .line 1171
    invoke-virtual {v11, v6, v14}, Lzg5;->s(II)V

    .line 1172
    .line 1173
    .line 1174
    const/4 v4, 0x0

    .line 1175
    invoke-virtual {v12, v13, v8, v4}, Lqr;->y(IILjava/lang/Object;)V

    .line 1176
    .line 1177
    .line 1178
    goto :goto_10

    .line 1179
    :cond_1b
    move-object/from16 v18, v1

    .line 1180
    .line 1181
    const/4 v8, 0x1

    .line 1182
    invoke-virtual {v12, v13, v8}, Lqr;->k(II)V

    .line 1183
    .line 1184
    .line 1185
    add-int/lit8 v10, v10, 0x1

    .line 1186
    .line 1187
    :cond_1c
    :goto_10
    move-object/from16 v1, v18

    .line 1188
    .line 1189
    goto :goto_f

    .line 1190
    :cond_1d
    move-object/from16 v18, v1

    .line 1191
    .line 1192
    move/from16 v3, p0

    .line 1193
    .line 1194
    move/from16 v1, v19

    .line 1195
    .line 1196
    const/4 v6, 0x0

    .line 1197
    :goto_11
    if-ge v6, v5, :cond_1f

    .line 1198
    .line 1199
    aget v4, v21, v1

    .line 1200
    .line 1201
    and-int/lit8 v4, v4, 0xf

    .line 1202
    .line 1203
    const/4 v8, 0x2

    .line 1204
    if-ne v4, v8, :cond_1e

    .line 1205
    .line 1206
    invoke-virtual {v11, v1, v3}, Lzg5;->s(II)V

    .line 1207
    .line 1208
    .line 1209
    const/4 v4, 0x0

    .line 1210
    const/4 v13, 0x1

    .line 1211
    invoke-virtual {v12, v1, v13, v4}, Lqr;->y(IILjava/lang/Object;)V

    .line 1212
    .line 1213
    .line 1214
    goto :goto_12

    .line 1215
    :cond_1e
    const/4 v13, 0x1

    .line 1216
    :goto_12
    add-int/lit8 v1, v1, 0x1

    .line 1217
    .line 1218
    add-int/lit8 v3, v3, 0x1

    .line 1219
    .line 1220
    add-int/lit8 v6, v6, 0x1

    .line 1221
    .line 1222
    goto :goto_11

    .line 1223
    :cond_1f
    const/4 v8, 0x2

    .line 1224
    const/4 v13, 0x1

    .line 1225
    add-int/lit8 v15, v15, -0x1

    .line 1226
    .line 1227
    move/from16 v14, p0

    .line 1228
    .line 1229
    move v3, v8

    .line 1230
    move v5, v13

    .line 1231
    move-object/from16 v1, v18

    .line 1232
    .line 1233
    move/from16 v13, v19

    .line 1234
    .line 1235
    move-object/from16 v8, v21

    .line 1236
    .line 1237
    const/4 v4, 0x0

    .line 1238
    const/4 v6, 0x0

    .line 1239
    goto/16 :goto_c

    .line 1240
    .line 1241
    :cond_20
    invoke-virtual {v12}, Lqr;->b()V

    .line 1242
    .line 1243
    .line 1244
    invoke-virtual {v2, v0}, Lpk;->a(Ljava/lang/Runnable;)V

    .line 1245
    .line 1246
    .line 1247
    :cond_21
    return-void

    .line 1248
    :pswitch_18
    iget-object v0, v1, Llg1;->p:Ljava/lang/Object;

    .line 1249
    .line 1250
    iget-object v1, v1, Llg1;->o:Ljava/lang/Object;

    .line 1251
    .line 1252
    :try_start_a
    sget-object v2, Ln5;->d:Ljava/lang/reflect/Method;

    .line 1253
    .line 1254
    if-eqz v2, :cond_22

    .line 1255
    .line 1256
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1257
    .line 1258
    const-string v4, "AppCompat recreation"

    .line 1259
    .line 1260
    filled-new-array {v0, v3, v4}, [Ljava/lang/Object;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v0

    .line 1264
    invoke-virtual {v2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1265
    .line 1266
    .line 1267
    goto :goto_13

    .line 1268
    :cond_22
    sget-object v2, Ln5;->e:Ljava/lang/reflect/Method;

    .line 1269
    .line 1270
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1271
    .line 1272
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v0

    .line 1276
    invoke-virtual {v2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_a
    .catch Ljava/lang/RuntimeException; {:try_start_a .. :try_end_a} :catch_1
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    .line 1277
    .line 1278
    .line 1279
    goto :goto_13

    .line 1280
    :catchall_7
    move-exception v0

    .line 1281
    const-string v1, "ActivityRecreator"

    .line 1282
    .line 1283
    const-string v2, "Exception while invoking performStopActivity"

    .line 1284
    .line 1285
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1286
    .line 1287
    .line 1288
    goto :goto_13

    .line 1289
    :catch_1
    move-exception v0

    .line 1290
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v1

    .line 1294
    const-class v2, Ljava/lang/RuntimeException;

    .line 1295
    .line 1296
    if-ne v1, v2, :cond_24

    .line 1297
    .line 1298
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1299
    .line 1300
    .line 1301
    move-result-object v1

    .line 1302
    if-eqz v1, :cond_24

    .line 1303
    .line 1304
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v1

    .line 1308
    const-string v2, "Unable to stop"

    .line 1309
    .line 1310
    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1311
    .line 1312
    .line 1313
    move-result v1

    .line 1314
    if-nez v1, :cond_23

    .line 1315
    .line 1316
    goto :goto_13

    .line 1317
    :cond_23
    throw v0

    .line 1318
    :cond_24
    :goto_13
    return-void

    .line 1319
    :pswitch_19
    iget-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 1320
    .line 1321
    check-cast v0, Landroid/app/Application;

    .line 1322
    .line 1323
    iget-object v1, v1, Llg1;->p:Ljava/lang/Object;

    .line 1324
    .line 1325
    check-cast v1, Lm5;

    .line 1326
    .line 1327
    invoke-virtual {v0, v1}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 1328
    .line 1329
    .line 1330
    return-void

    .line 1331
    :pswitch_1a
    iget-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 1332
    .line 1333
    check-cast v0, Lm5;

    .line 1334
    .line 1335
    iget-object v1, v1, Llg1;->p:Ljava/lang/Object;

    .line 1336
    .line 1337
    iput-object v1, v0, Lm5;->n:Ljava/lang/Object;

    .line 1338
    .line 1339
    return-void

    .line 1340
    :pswitch_1b
    iget-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 1341
    .line 1342
    check-cast v0, Lt4;

    .line 1343
    .line 1344
    iget-object v1, v1, Llg1;->p:Ljava/lang/Object;

    .line 1345
    .line 1346
    check-cast v1, Ly4;

    .line 1347
    .line 1348
    iget-object v2, v1, Ly4;->p:Lqu2;

    .line 1349
    .line 1350
    if-eqz v2, :cond_25

    .line 1351
    .line 1352
    iget-object v3, v2, Lqu2;->e:Lou2;

    .line 1353
    .line 1354
    if-eqz v3, :cond_25

    .line 1355
    .line 1356
    invoke-interface {v3, v2}, Lou2;->y(Lqu2;)V

    .line 1357
    .line 1358
    .line 1359
    :cond_25
    iget-object v2, v1, Ly4;->u:Liv2;

    .line 1360
    .line 1361
    check-cast v2, Landroid/view/View;

    .line 1362
    .line 1363
    if-eqz v2, :cond_27

    .line 1364
    .line 1365
    invoke-virtual {v2}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v2

    .line 1369
    if-eqz v2, :cond_27

    .line 1370
    .line 1371
    invoke-virtual {v0}, Lav2;->b()Z

    .line 1372
    .line 1373
    .line 1374
    move-result v2

    .line 1375
    if-eqz v2, :cond_26

    .line 1376
    .line 1377
    goto :goto_15

    .line 1378
    :cond_26
    iget-object v2, v0, Lav2;->e:Landroid/view/View;

    .line 1379
    .line 1380
    if-nez v2, :cond_28

    .line 1381
    .line 1382
    :cond_27
    :goto_14
    const/4 v4, 0x0

    .line 1383
    goto :goto_16

    .line 1384
    :cond_28
    const/4 v6, 0x0

    .line 1385
    invoke-virtual {v0, v6, v6, v6, v6}, Lav2;->d(IIZZ)V

    .line 1386
    .line 1387
    .line 1388
    :goto_15
    iput-object v0, v1, Ly4;->G:Lt4;

    .line 1389
    .line 1390
    goto :goto_14

    .line 1391
    :goto_16
    iput-object v4, v1, Ly4;->I:Llg1;

    .line 1392
    .line 1393
    return-void

    .line 1394
    :pswitch_1c
    iget-object v0, v1, Llg1;->p:Ljava/lang/Object;

    .line 1395
    .line 1396
    move-object v2, v0

    .line 1397
    check-cast v2, Lkg1;

    .line 1398
    .line 1399
    iget-object v0, v1, Llg1;->o:Ljava/lang/Object;

    .line 1400
    .line 1401
    check-cast v0, Ljava/util/concurrent/Future;

    .line 1402
    .line 1403
    instance-of v1, v0, Lu0;

    .line 1404
    .line 1405
    if-eqz v1, :cond_29

    .line 1406
    .line 1407
    move-object v1, v0

    .line 1408
    check-cast v1, Lu0;

    .line 1409
    .line 1410
    invoke-virtual {v1}, Lu0;->o()Ljava/lang/Throwable;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v1

    .line 1414
    if-eqz v1, :cond_29

    .line 1415
    .line 1416
    invoke-interface {v2, v1}, Lkg1;->o(Ljava/lang/Throwable;)V

    .line 1417
    .line 1418
    .line 1419
    goto :goto_17

    .line 1420
    :cond_29
    :try_start_b
    invoke-static {v0}, Lhw;->j(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v0
    :try_end_b
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_8

    .line 1424
    invoke-interface {v2, v0}, Lkg1;->h(Ljava/lang/Object;)V

    .line 1425
    .line 1426
    .line 1427
    goto :goto_17

    .line 1428
    :catchall_8
    move-exception v0

    .line 1429
    invoke-interface {v2, v0}, Lkg1;->o(Ljava/lang/Throwable;)V

    .line 1430
    .line 1431
    .line 1432
    goto :goto_17

    .line 1433
    :catch_2
    move-exception v0

    .line 1434
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 1435
    .line 1436
    .line 1437
    move-result-object v0

    .line 1438
    invoke-interface {v2, v0}, Lkg1;->o(Ljava/lang/Throwable;)V

    .line 1439
    .line 1440
    .line 1441
    :goto_17
    return-void

    .line 1442
    nop

    .line 1443
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

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Llg1;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Lc12;

    .line 12
    .line 13
    const-class v1, Llg1;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-direct {v0, v1}, Lc12;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Llg1;->p:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Lkg1;

    .line 25
    .line 26
    new-instance v1, Lrm3;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iget-object v2, v0, Lc12;->q:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Lrm3;

    .line 34
    .line 35
    iput-object v1, v2, Lrm3;->o:Ljava/lang/Object;

    .line 36
    .line 37
    iput-object v1, v0, Lc12;->q:Ljava/lang/Object;

    .line 38
    .line 39
    iput-object p0, v1, Lrm3;->n:Ljava/lang/Object;

    .line 40
    .line 41
    invoke-virtual {v0}, Lc12;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
