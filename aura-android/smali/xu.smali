.class public final Lxu;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lr02;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 13
    iput p1, p0, Lxu;->a:I

    iput-object p2, p0, Lxu;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lbe0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lxu;->a:I

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lxu;->b:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lo83;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lxu;->a:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxu;->b:Ljava/lang/Object;

    return-void
.end method

.method public static d(Lk14;I)I
    .locals 1

    .line 1
    iget-object p0, p0, Lk14;->s:Ltl1;

    .line 2
    .line 3
    const-string v0, "Retry-After"

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    :cond_0
    if-nez p0, :cond_1

    .line 13
    .line 14
    return p1

    .line 15
    :cond_1
    const-string p1, "\\d+"

    .line 16
    .line 17
    invoke-static {p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    :cond_2
    const p0, 0x7fffffff

    .line 47
    .line 48
    .line 49
    return p0
.end method


# virtual methods
.method public final a(Lev3;)Lk14;
    .locals 44

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    iget v0, v1, Lxu;->a:I

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v2, Lev3;->e:Loz3;

    .line 11
    .line 12
    iget-object v7, v2, Lev3;->a:Lbv3;

    .line 13
    .line 14
    sget-object v8, Lu01;->n:Lu01;

    .line 15
    .line 16
    move-object v9, v8

    .line 17
    const/4 v10, 0x0

    .line 18
    const/4 v11, 0x0

    .line 19
    move-object v8, v0

    .line 20
    :goto_0
    const/4 v0, 0x1

    .line 21
    :goto_1
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v12, v7, Lbv3;->w:Ly10;

    .line 25
    .line 26
    if-nez v12, :cond_f

    .line 27
    .line 28
    monitor-enter v7

    .line 29
    :try_start_0
    iget-boolean v12, v7, Lbv3;->y:Z

    .line 30
    .line 31
    if-nez v12, :cond_e

    .line 32
    .line 33
    iget-boolean v12, v7, Lbv3;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 34
    .line 35
    if-nez v12, :cond_d

    .line 36
    .line 37
    monitor-exit v7

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    iget-object v0, v7, Lbv3;->n:Lo83;

    .line 41
    .line 42
    iget-object v13, v0, Lo83;->D:Lgr4;

    .line 43
    .line 44
    iget-object v14, v7, Lbv3;->p:Ldv3;

    .line 45
    .line 46
    iget v15, v0, Lo83;->y:I

    .line 47
    .line 48
    iget v12, v0, Lo83;->z:I

    .line 49
    .line 50
    iget v6, v2, Lev3;->f:I

    .line 51
    .line 52
    iget v3, v2, Lev3;->g:I

    .line 53
    .line 54
    iget-boolean v4, v0, Lo83;->e:Z

    .line 55
    .line 56
    iget-boolean v5, v0, Lo83;->f:Z

    .line 57
    .line 58
    move/from16 v18, v3

    .line 59
    .line 60
    iget-object v3, v8, Loz3;->a:Lgr1;

    .line 61
    .line 62
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Lgr1;->f()Z

    .line 66
    .line 67
    .line 68
    move-result v16

    .line 69
    move/from16 v19, v4

    .line 70
    .line 71
    if-eqz v16, :cond_1

    .line 72
    .line 73
    iget-object v4, v0, Lo83;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 74
    .line 75
    if-eqz v4, :cond_0

    .line 76
    .line 77
    move-object/from16 v16, v4

    .line 78
    .line 79
    iget-object v4, v0, Lo83;->t:Lm83;

    .line 80
    .line 81
    move-object/from16 v17, v4

    .line 82
    .line 83
    iget-object v4, v0, Lo83;->u:Lo00;

    .line 84
    .line 85
    move-object/from16 v33, v4

    .line 86
    .line 87
    move-object/from16 v31, v16

    .line 88
    .line 89
    move-object/from16 v32, v17

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_0
    const-string v0, "CLEARTEXT-only client"

    .line 93
    .line 94
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :goto_2
    const/4 v6, 0x0

    .line 98
    goto/16 :goto_a

    .line 99
    .line 100
    :cond_1
    const/16 v31, 0x0

    .line 101
    .line 102
    const/16 v32, 0x0

    .line 103
    .line 104
    const/16 v33, 0x0

    .line 105
    .line 106
    :goto_3
    new-instance v21, Lf6;

    .line 107
    .line 108
    iget-object v4, v3, Lgr1;->d:Ljava/lang/String;

    .line 109
    .line 110
    iget v3, v3, Lgr1;->e:I

    .line 111
    .line 112
    move/from16 v28, v3

    .line 113
    .line 114
    iget-object v3, v0, Lo83;->l:Lfz0;

    .line 115
    .line 116
    move-object/from16 v29, v3

    .line 117
    .line 118
    iget-object v3, v0, Lo83;->o:Ljavax/net/SocketFactory;

    .line 119
    .line 120
    move-object/from16 v30, v3

    .line 121
    .line 122
    iget-object v3, v0, Lo83;->n:Lfz0;

    .line 123
    .line 124
    move-object/from16 v34, v3

    .line 125
    .line 126
    iget-object v3, v0, Lo83;->s:Ljava/util/List;

    .line 127
    .line 128
    move-object/from16 v35, v3

    .line 129
    .line 130
    iget-object v3, v0, Lo83;->r:Ljava/util/List;

    .line 131
    .line 132
    iget-object v0, v0, Lo83;->m:Ljava/net/ProxySelector;

    .line 133
    .line 134
    move-object/from16 v37, v0

    .line 135
    .line 136
    move-object/from16 v36, v3

    .line 137
    .line 138
    move-object/from16 v27, v4

    .line 139
    .line 140
    move-object/from16 v26, v21

    .line 141
    .line 142
    invoke-direct/range {v26 .. v37}, Lf6;-><init>(Ljava/lang/String;ILfz0;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lo00;Lfz0;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    .line 143
    .line 144
    .line 145
    new-instance v0, Lhy;

    .line 146
    .line 147
    iget-object v3, v7, Lbv3;->p:Ldv3;

    .line 148
    .line 149
    iget-object v3, v3, Ldv3;->a:Lfz0;

    .line 150
    .line 151
    invoke-direct {v0, v7, v3, v2}, Lhy;-><init>(Lbv3;Lfz0;Lev3;)V

    .line 152
    .line 153
    .line 154
    iget-object v3, v7, Lbv3;->n:Lo83;

    .line 155
    .line 156
    iget-object v3, v3, Lo83;->C:Lrm2;

    .line 157
    .line 158
    move/from16 v16, v12

    .line 159
    .line 160
    new-instance v12, Lgv3;

    .line 161
    .line 162
    move-object/from16 v23, v0

    .line 163
    .line 164
    move-object/from16 v22, v3

    .line 165
    .line 166
    move/from16 v20, v5

    .line 167
    .line 168
    move/from16 v17, v6

    .line 169
    .line 170
    invoke-direct/range {v12 .. v23}, Lgv3;-><init>(Lgr4;Ldv3;IIIIZZLf6;Lrm2;Lhy;)V

    .line 171
    .line 172
    .line 173
    iget-object v0, v7, Lbv3;->n:Lo83;

    .line 174
    .line 175
    iget-boolean v3, v0, Lo83;->f:Z

    .line 176
    .line 177
    if-eqz v3, :cond_2

    .line 178
    .line 179
    new-instance v3, Llr0;

    .line 180
    .line 181
    iget-object v0, v0, Lo83;->D:Lgr4;

    .line 182
    .line 183
    invoke-direct {v3, v12, v0}, Llr0;-><init>(Lr34;Lgr4;)V

    .line 184
    .line 185
    .line 186
    goto :goto_4

    .line 187
    :cond_2
    new-instance v3, Lom1;

    .line 188
    .line 189
    const/16 v0, 0x17

    .line 190
    .line 191
    invoke-direct {v3, v0, v12}, Lom1;-><init>(ILjava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    :goto_4
    iput-object v3, v7, Lbv3;->t:Ls21;

    .line 195
    .line 196
    :cond_3
    :try_start_1
    iget-boolean v0, v7, Lbv3;->A:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 197
    .line 198
    if-nez v0, :cond_c

    .line 199
    .line 200
    :try_start_2
    invoke-virtual {v2, v8}, Lev3;->b(Loz3;)Lk14;

    .line 201
    .line 202
    .line 203
    move-result-object v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 204
    :try_start_3
    invoke-virtual {v0}, Lk14;->f()Lj14;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    iput-object v8, v0, Lj14;->a:Loz3;

    .line 209
    .line 210
    if-eqz v10, :cond_4

    .line 211
    .line 212
    invoke-static {v10}, Lxl;->M(Lk14;)Lk14;

    .line 213
    .line 214
    .line 215
    move-result-object v3

    .line 216
    goto :goto_5

    .line 217
    :catchall_0
    move-exception v0

    .line 218
    const/4 v3, 0x1

    .line 219
    goto/16 :goto_8

    .line 220
    .line 221
    :cond_4
    const/4 v3, 0x0

    .line 222
    :goto_5
    iput-object v3, v0, Lj14;->j:Lk14;

    .line 223
    .line 224
    invoke-virtual {v0}, Lj14;->a()Lk14;

    .line 225
    .line 226
    .line 227
    move-result-object v10

    .line 228
    iget-object v0, v7, Lbv3;->w:Ly10;

    .line 229
    .line 230
    invoke-virtual {v1, v10, v0}, Lxu;->b(Lk14;Ly10;)Loz3;

    .line 231
    .line 232
    .line 233
    move-result-object v8

    .line 234
    if-nez v8, :cond_7

    .line 235
    .line 236
    if-eqz v0, :cond_5

    .line 237
    .line 238
    iget-boolean v0, v0, Ly10;->b:Z

    .line 239
    .line 240
    if-eqz v0, :cond_5

    .line 241
    .line 242
    iget-boolean v0, v7, Lbv3;->v:Z

    .line 243
    .line 244
    if-nez v0, :cond_6

    .line 245
    .line 246
    const/4 v1, 0x1

    .line 247
    iput-boolean v1, v7, Lbv3;->v:Z

    .line 248
    .line 249
    iget-object v0, v7, Lbv3;->q:Lav3;

    .line 250
    .line 251
    invoke-virtual {v0}, Luk;->i()Z

    .line 252
    .line 253
    .line 254
    :cond_5
    const/4 v3, 0x0

    .line 255
    goto :goto_6

    .line 256
    :cond_6
    const-string v0, "Check failed."

    .line 257
    .line 258
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 259
    .line 260
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 264
    :goto_6
    invoke-virtual {v7, v3}, Lbv3;->d(Z)V

    .line 265
    .line 266
    .line 267
    move-object v6, v10

    .line 268
    goto/16 :goto_a

    .line 269
    .line 270
    :cond_7
    const/4 v3, 0x0

    .line 271
    :try_start_4
    iget-object v0, v8, Loz3;->d:Ltz3;

    .line 272
    .line 273
    if-eqz v0, :cond_8

    .line 274
    .line 275
    invoke-virtual {v0}, Ltz3;->isOneShot()Z

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-eqz v0, :cond_8

    .line 280
    .line 281
    goto :goto_6

    .line 282
    :cond_8
    iget-object v0, v10, Lk14;->t:Ln14;

    .line 283
    .line 284
    invoke-static {v0}, Lxe5;->b(Ljava/io/Closeable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 285
    .line 286
    .line 287
    add-int/lit8 v11, v11, 0x1

    .line 288
    .line 289
    const/16 v3, 0x14

    .line 290
    .line 291
    if-gt v11, v3, :cond_9

    .line 292
    .line 293
    const/4 v3, 0x1

    .line 294
    invoke-virtual {v7, v3}, Lbv3;->d(Z)V

    .line 295
    .line 296
    .line 297
    goto/16 :goto_0

    .line 298
    .line 299
    :cond_9
    :try_start_5
    new-instance v0, Ljava/net/ProtocolException;

    .line 300
    .line 301
    new-instance v1, Ljava/lang/StringBuilder;

    .line 302
    .line 303
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 304
    .line 305
    .line 306
    const-string v2, "Too many follow-up requests: "

    .line 307
    .line 308
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    throw v0

    .line 322
    :catch_0
    move-exception v0

    .line 323
    instance-of v3, v0, Lokhttp3/internal/http2/ConnectionShutdownException;

    .line 324
    .line 325
    const/16 v25, 0x1

    .line 326
    .line 327
    xor-int/lit8 v3, v3, 0x1

    .line 328
    .line 329
    invoke-virtual {v1, v0, v7, v8, v3}, Lxu;->c(Ljava/io/IOException;Lbv3;Loz3;Z)Z

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    if-nez v3, :cond_b

    .line 334
    .line 335
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 336
    .line 337
    .line 338
    move-result-object v1

    .line 339
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    if-eqz v2, :cond_a

    .line 344
    .line 345
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v2

    .line 349
    check-cast v2, Ljava/lang/Exception;

    .line 350
    .line 351
    invoke-static {v0, v2}, Lj51;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 352
    .line 353
    .line 354
    goto :goto_7

    .line 355
    :cond_a
    throw v0

    .line 356
    :cond_b
    invoke-static {v0, v9}, Lq40;->F0(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 357
    .line 358
    .line 359
    move-result-object v9
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 360
    const/4 v3, 0x1

    .line 361
    invoke-virtual {v7, v3}, Lbv3;->d(Z)V

    .line 362
    .line 363
    .line 364
    const/4 v0, 0x0

    .line 365
    goto/16 :goto_1

    .line 366
    .line 367
    :cond_c
    :try_start_6
    new-instance v0, Ljava/io/IOException;

    .line 368
    .line 369
    const-string v1, "Canceled"

    .line 370
    .line 371
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 375
    :goto_8
    invoke-virtual {v7, v3}, Lbv3;->d(Z)V

    .line 376
    .line 377
    .line 378
    throw v0

    .line 379
    :cond_d
    :try_start_7
    const-string v0, "Check failed."

    .line 380
    .line 381
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 382
    .line 383
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 384
    .line 385
    .line 386
    throw v1

    .line 387
    :catchall_1
    move-exception v0

    .line 388
    goto :goto_9

    .line 389
    :cond_e
    const-string v0, "cannot make a new request because the previous response is still open: please call response.close()"

    .line 390
    .line 391
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 392
    .line 393
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 394
    .line 395
    .line 396
    throw v1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 397
    :goto_9
    monitor-exit v7

    .line 398
    throw v0

    .line 399
    :cond_f
    const-string v0, "Check failed."

    .line 400
    .line 401
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    goto/16 :goto_2

    .line 405
    .line 406
    :goto_a
    return-object v6

    .line 407
    :pswitch_0
    iget-object v3, v2, Lev3;->e:Loz3;

    .line 408
    .line 409
    iget-object v0, v1, Lxu;->b:Ljava/lang/Object;

    .line 410
    .line 411
    move-object v1, v0

    .line 412
    check-cast v1, Ljava/util/ArrayList;

    .line 413
    .line 414
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 415
    .line 416
    .line 417
    move-result v4

    .line 418
    const/4 v0, 0x0

    .line 419
    const/4 v6, 0x0

    .line 420
    :goto_b
    if-ge v0, v4, :cond_10

    .line 421
    .line 422
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v5

    .line 426
    add-int/lit8 v6, v0, 0x1

    .line 427
    .line 428
    check-cast v5, Ljava/lang/String;

    .line 429
    .line 430
    invoke-virtual {v3}, Loz3;->a()Lnz3;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    iget-object v7, v3, Loz3;->a:Lgr1;

    .line 435
    .line 436
    invoke-virtual {v7}, Lgr1;->g()Lfr1;

    .line 437
    .line 438
    .line 439
    move-result-object v7

    .line 440
    invoke-virtual {v7, v5}, Lfr1;->d(Ljava/lang/String;)V

    .line 441
    .line 442
    .line 443
    invoke-virtual {v7}, Lfr1;->b()Lgr1;

    .line 444
    .line 445
    .line 446
    move-result-object v7

    .line 447
    iput-object v7, v0, Lnz3;->a:Lgr1;

    .line 448
    .line 449
    new-instance v7, Loz3;

    .line 450
    .line 451
    invoke-direct {v7, v0}, Loz3;-><init>(Lnz3;)V

    .line 452
    .line 453
    .line 454
    :try_start_8
    invoke-virtual {v2, v7}, Lev3;->b(Loz3;)Lk14;

    .line 455
    .line 456
    .line 457
    move-result-object v0
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_1

    .line 458
    return-object v0

    .line 459
    :catch_1
    move-exception v0

    .line 460
    const-string v7, "RadioBrowserClient"

    .line 461
    .line 462
    const-string v8, "Mirror "

    .line 463
    .line 464
    const-string v9, " failed: "

    .line 465
    .line 466
    invoke-static {v8, v5, v9}, Lxa3;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    move-result-object v5

    .line 470
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v8

    .line 474
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v5

    .line 481
    invoke-static {v7, v5}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 482
    .line 483
    .line 484
    move/from16 v43, v6

    .line 485
    .line 486
    move-object v6, v0

    .line 487
    move/from16 v0, v43

    .line 488
    .line 489
    goto :goto_b

    .line 490
    :cond_10
    if-eqz v6, :cond_11

    .line 491
    .line 492
    goto :goto_c

    .line 493
    :cond_11
    new-instance v6, Ljava/io/IOException;

    .line 494
    .line 495
    const-string v0, "All radio-browser mirrors failed"

    .line 496
    .line 497
    invoke-direct {v6, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 498
    .line 499
    .line 500
    :goto_c
    throw v6

    .line 501
    :pswitch_1
    iget-object v0, v1, Lxu;->b:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v0, Lhx;

    .line 504
    .line 505
    if-eqz v0, :cond_19

    .line 506
    .line 507
    iget-object v3, v2, Lev3;->e:Loz3;

    .line 508
    .line 509
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 510
    .line 511
    .line 512
    iget-object v4, v3, Loz3;->a:Lgr1;

    .line 513
    .line 514
    invoke-static {v4}, Lsi0;->D(Lgr1;)Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v5

    .line 518
    :try_start_9
    iget-object v0, v0, Lhx;->n:Ljr0;

    .line 519
    .line 520
    invoke-virtual {v0, v5}, Ljr0;->n(Ljava/lang/String;)Lfr0;

    .line 521
    .line 522
    .line 523
    move-result-object v0
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_2

    .line 524
    if-nez v0, :cond_12

    .line 525
    .line 526
    :catch_2
    :goto_d
    const/4 v0, 0x0

    .line 527
    goto/16 :goto_10

    .line 528
    .line 529
    :cond_12
    :try_start_a
    new-instance v5, Lfx;

    .line 530
    .line 531
    iget-object v6, v0, Lfr0;->p:Ljava/util/ArrayList;

    .line 532
    .line 533
    const/4 v7, 0x0

    .line 534
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v6

    .line 538
    check-cast v6, Lej4;

    .line 539
    .line 540
    invoke-direct {v5, v6}, Lfx;-><init>(Lej4;)V

    .line 541
    .line 542
    .line 543
    iget-object v6, v5, Lfx;->c:Ljava/lang/String;

    .line 544
    .line 545
    iget-object v7, v5, Lfx;->b:Ltl1;

    .line 546
    .line 547
    iget-object v8, v5, Lfx;->a:Lgr1;
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_3

    .line 548
    .line 549
    iget-object v9, v5, Lfx;->g:Ltl1;

    .line 550
    .line 551
    const-string v10, "Content-Type"

    .line 552
    .line 553
    invoke-virtual {v9, v10}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 554
    .line 555
    .line 556
    move-result-object v10

    .line 557
    const-string v11, "Content-Length"

    .line 558
    .line 559
    invoke-virtual {v9, v11}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 560
    .line 561
    .line 562
    move-result-object v11

    .line 563
    new-instance v12, Loz3;

    .line 564
    .line 565
    const-string v13, "\u0000"

    .line 566
    .line 567
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 571
    .line 572
    .line 573
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    new-instance v14, Lnz3;

    .line 577
    .line 578
    invoke-direct {v14}, Lnz3;-><init>()V

    .line 579
    .line 580
    .line 581
    iput-object v8, v14, Lnz3;->a:Lgr1;

    .line 582
    .line 583
    invoke-virtual {v7}, Ltl1;->d()Lsl1;

    .line 584
    .line 585
    .line 586
    move-result-object v15

    .line 587
    iput-object v15, v14, Lnz3;->c:Lsl1;

    .line 588
    .line 589
    invoke-virtual {v6, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 590
    .line 591
    .line 592
    move-result v13

    .line 593
    if-nez v13, :cond_13

    .line 594
    .line 595
    move-object v13, v6

    .line 596
    :goto_e
    const/4 v15, 0x0

    .line 597
    goto :goto_f

    .line 598
    :cond_13
    const-string v13, "GET"

    .line 599
    .line 600
    goto :goto_e

    .line 601
    :goto_f
    invoke-virtual {v14, v13, v15}, Lnz3;->b(Ljava/lang/String;Ltz3;)V

    .line 602
    .line 603
    .line 604
    invoke-direct {v12, v14}, Loz3;-><init>(Lnz3;)V

    .line 605
    .line 606
    .line 607
    sget-object v13, Lxe5;->a:[B

    .line 608
    .line 609
    sget-object v42, Lgq1;->q:Lgq1;

    .line 610
    .line 611
    new-instance v13, Ljava/util/ArrayList;

    .line 612
    .line 613
    const/16 v14, 0x14

    .line 614
    .line 615
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 616
    .line 617
    .line 618
    iget-object v13, v5, Lfx;->d:Lpr3;

    .line 619
    .line 620
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 621
    .line 622
    .line 623
    iget v14, v5, Lfx;->e:I

    .line 624
    .line 625
    iget-object v15, v5, Lfx;->f:Ljava/lang/String;

    .line 626
    .line 627
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 628
    .line 629
    .line 630
    invoke-virtual {v9}, Ltl1;->d()Lsl1;

    .line 631
    .line 632
    .line 633
    move-result-object v9

    .line 634
    move-object/from16 v16, v9

    .line 635
    .line 636
    new-instance v9, Lex;

    .line 637
    .line 638
    invoke-direct {v9, v0, v10, v11}, Lex;-><init>(Lfr0;Ljava/lang/String;Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    iget-object v0, v5, Lfx;->h:Ljl1;

    .line 642
    .line 643
    iget-wide v10, v5, Lfx;->i:J

    .line 644
    .line 645
    move-object/from16 v33, v9

    .line 646
    .line 647
    move-wide/from16 v37, v10

    .line 648
    .line 649
    iget-wide v9, v5, Lfx;->j:J

    .line 650
    .line 651
    if-ltz v14, :cond_17

    .line 652
    .line 653
    invoke-virtual/range {v16 .. v16}, Lsl1;->c()Ltl1;

    .line 654
    .line 655
    .line 656
    move-result-object v32

    .line 657
    new-instance v26, Lk14;

    .line 658
    .line 659
    const/16 v34, 0x0

    .line 660
    .line 661
    const/16 v35, 0x0

    .line 662
    .line 663
    const/16 v36, 0x0

    .line 664
    .line 665
    const/16 v41, 0x0

    .line 666
    .line 667
    move-object/from16 v31, v0

    .line 668
    .line 669
    move-wide/from16 v39, v9

    .line 670
    .line 671
    move-object/from16 v27, v12

    .line 672
    .line 673
    move-object/from16 v28, v13

    .line 674
    .line 675
    move/from16 v30, v14

    .line 676
    .line 677
    move-object/from16 v29, v15

    .line 678
    .line 679
    invoke-direct/range {v26 .. v42}, Lk14;-><init>(Loz3;Lpr3;Ljava/lang/String;ILjl1;Ltl1;Ln14;Lk14;Lk14;Lk14;JJLy10;Lgf1;)V

    .line 680
    .line 681
    .line 682
    move-object/from16 v0, v26

    .line 683
    .line 684
    invoke-virtual {v8, v4}, Lgr1;->equals(Ljava/lang/Object;)Z

    .line 685
    .line 686
    .line 687
    move-result v4

    .line 688
    if-eqz v4, :cond_16

    .line 689
    .line 690
    iget-object v4, v3, Loz3;->b:Ljava/lang/String;

    .line 691
    .line 692
    invoke-virtual {v6, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 693
    .line 694
    .line 695
    move-result v4

    .line 696
    if-eqz v4, :cond_16

    .line 697
    .line 698
    invoke-static/range {v32 .. v32}, Lsi0;->U(Ltl1;)Ljava/util/Set;

    .line 699
    .line 700
    .line 701
    move-result-object v4

    .line 702
    check-cast v4, Ljava/lang/Iterable;

    .line 703
    .line 704
    instance-of v5, v4, Ljava/util/Collection;

    .line 705
    .line 706
    if-eqz v5, :cond_14

    .line 707
    .line 708
    move-object v5, v4

    .line 709
    check-cast v5, Ljava/util/Collection;

    .line 710
    .line 711
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 712
    .line 713
    .line 714
    move-result v5

    .line 715
    if-eqz v5, :cond_14

    .line 716
    .line 717
    goto :goto_10

    .line 718
    :cond_14
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 719
    .line 720
    .line 721
    move-result-object v4

    .line 722
    :cond_15
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 723
    .line 724
    .line 725
    move-result v5

    .line 726
    if-eqz v5, :cond_18

    .line 727
    .line 728
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v5

    .line 732
    check-cast v5, Ljava/lang/String;

    .line 733
    .line 734
    invoke-virtual {v7, v5}, Ltl1;->f(Ljava/lang/String;)Ljava/util/List;

    .line 735
    .line 736
    .line 737
    move-result-object v6

    .line 738
    iget-object v8, v3, Loz3;->c:Ltl1;

    .line 739
    .line 740
    invoke-virtual {v8, v5}, Ltl1;->f(Ljava/lang/String;)Ljava/util/List;

    .line 741
    .line 742
    .line 743
    move-result-object v5

    .line 744
    invoke-virtual {v6, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 745
    .line 746
    .line 747
    move-result v5

    .line 748
    if-nez v5, :cond_15

    .line 749
    .line 750
    :cond_16
    iget-object v0, v0, Lk14;->t:Ln14;

    .line 751
    .line 752
    invoke-static {v0}, Lxe5;->b(Ljava/io/Closeable;)V

    .line 753
    .line 754
    .line 755
    goto/16 :goto_d

    .line 756
    .line 757
    :cond_17
    move v0, v14

    .line 758
    const-string v1, "code < 0: "

    .line 759
    .line 760
    invoke-static {v0, v1}, Lf34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    invoke-static {v0}, Lnz2;->f(Ljava/lang/Object;)V

    .line 765
    .line 766
    .line 767
    const/4 v6, 0x0

    .line 768
    goto/16 :goto_2d

    .line 769
    .line 770
    :catch_3
    invoke-static {v0}, Lxe5;->b(Ljava/io/Closeable;)V

    .line 771
    .line 772
    .line 773
    goto/16 :goto_d

    .line 774
    .line 775
    :cond_18
    :goto_10
    move-object v15, v0

    .line 776
    goto :goto_11

    .line 777
    :cond_19
    const/4 v15, 0x0

    .line 778
    :goto_11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 779
    .line 780
    .line 781
    move-result-wide v3

    .line 782
    iget-object v0, v2, Lev3;->e:Loz3;

    .line 783
    .line 784
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 785
    .line 786
    .line 787
    if-eqz v15, :cond_20

    .line 788
    .line 789
    iget-wide v8, v15, Lk14;->x:J

    .line 790
    .line 791
    iget-wide v10, v15, Lk14;->y:J

    .line 792
    .line 793
    iget-object v12, v15, Lk14;->s:Ltl1;

    .line 794
    .line 795
    invoke-virtual {v12}, Ltl1;->size()I

    .line 796
    .line 797
    .line 798
    move-result v13

    .line 799
    const/4 v6, 0x0

    .line 800
    const/4 v7, -0x1

    .line 801
    const/4 v14, 0x0

    .line 802
    const/16 v16, 0x0

    .line 803
    .line 804
    const/16 v17, 0x0

    .line 805
    .line 806
    const/16 v18, 0x0

    .line 807
    .line 808
    const/16 v19, 0x0

    .line 809
    .line 810
    const/16 v20, 0x0

    .line 811
    .line 812
    :goto_12
    if-ge v6, v13, :cond_1f

    .line 813
    .line 814
    invoke-virtual {v12, v6}, Ltl1;->b(I)Ljava/lang/String;

    .line 815
    .line 816
    .line 817
    move-result-object v5

    .line 818
    move-wide/from16 v26, v3

    .line 819
    .line 820
    invoke-virtual {v12, v6}, Ltl1;->e(I)Ljava/lang/String;

    .line 821
    .line 822
    .line 823
    move-result-object v3

    .line 824
    const-string v4, "Date"

    .line 825
    .line 826
    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 827
    .line 828
    .line 829
    move-result v4

    .line 830
    if-eqz v4, :cond_1a

    .line 831
    .line 832
    invoke-static {v3}, Lmi0;->a(Ljava/lang/String;)Ljava/util/Date;

    .line 833
    .line 834
    .line 835
    move-result-object v4

    .line 836
    move-object/from16 v20, v3

    .line 837
    .line 838
    move-object/from16 v17, v4

    .line 839
    .line 840
    goto :goto_13

    .line 841
    :cond_1a
    const-string v4, "Expires"

    .line 842
    .line 843
    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 844
    .line 845
    .line 846
    move-result v4

    .line 847
    if-eqz v4, :cond_1b

    .line 848
    .line 849
    invoke-static {v3}, Lmi0;->a(Ljava/lang/String;)Ljava/util/Date;

    .line 850
    .line 851
    .line 852
    move-result-object v3

    .line 853
    move-object v14, v3

    .line 854
    goto :goto_13

    .line 855
    :cond_1b
    const-string v4, "Last-Modified"

    .line 856
    .line 857
    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 858
    .line 859
    .line 860
    move-result v4

    .line 861
    if-eqz v4, :cond_1c

    .line 862
    .line 863
    invoke-static {v3}, Lmi0;->a(Ljava/lang/String;)Ljava/util/Date;

    .line 864
    .line 865
    .line 866
    move-result-object v4

    .line 867
    move-object/from16 v19, v3

    .line 868
    .line 869
    move-object/from16 v16, v4

    .line 870
    .line 871
    goto :goto_13

    .line 872
    :cond_1c
    const-string v4, "ETag"

    .line 873
    .line 874
    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 875
    .line 876
    .line 877
    move-result v4

    .line 878
    if-eqz v4, :cond_1d

    .line 879
    .line 880
    move-object/from16 v18, v3

    .line 881
    .line 882
    goto :goto_13

    .line 883
    :cond_1d
    const-string v4, "Age"

    .line 884
    .line 885
    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 886
    .line 887
    .line 888
    move-result v4

    .line 889
    if-eqz v4, :cond_1e

    .line 890
    .line 891
    const/4 v4, -0x1

    .line 892
    invoke-static {v4, v3}, Lxe5;->o(ILjava/lang/String;)I

    .line 893
    .line 894
    .line 895
    move-result v7

    .line 896
    :cond_1e
    :goto_13
    add-int/lit8 v6, v6, 0x1

    .line 897
    .line 898
    move-wide/from16 v3, v26

    .line 899
    .line 900
    goto :goto_12

    .line 901
    :cond_1f
    :goto_14
    move-wide/from16 v26, v3

    .line 902
    .line 903
    goto :goto_15

    .line 904
    :cond_20
    const/4 v7, -0x1

    .line 905
    const-wide/16 v8, 0x0

    .line 906
    .line 907
    const-wide/16 v10, 0x0

    .line 908
    .line 909
    const/4 v14, 0x0

    .line 910
    const/16 v16, 0x0

    .line 911
    .line 912
    const/16 v17, 0x0

    .line 913
    .line 914
    const/16 v18, 0x0

    .line 915
    .line 916
    const/16 v19, 0x0

    .line 917
    .line 918
    const/16 v20, 0x0

    .line 919
    .line 920
    goto :goto_14

    .line 921
    :goto_15
    const-string v3, "If-None-Match"

    .line 922
    .line 923
    const-string v4, "If-Modified-Since"

    .line 924
    .line 925
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 926
    .line 927
    const/4 v6, 0x4

    .line 928
    if-nez v15, :cond_21

    .line 929
    .line 930
    new-instance v3, Lhd5;

    .line 931
    .line 932
    const/4 v12, 0x0

    .line 933
    invoke-direct {v3, v6, v0, v12}, Lhd5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 934
    .line 935
    .line 936
    goto/16 :goto_21

    .line 937
    .line 938
    :cond_21
    const/4 v12, 0x0

    .line 939
    iget-object v13, v0, Loz3;->a:Lgr1;

    .line 940
    .line 941
    iget-object v6, v0, Loz3;->c:Ltl1;

    .line 942
    .line 943
    invoke-virtual {v13}, Lgr1;->f()Z

    .line 944
    .line 945
    .line 946
    move-result v13

    .line 947
    if-eqz v13, :cond_22

    .line 948
    .line 949
    iget-object v13, v15, Lk14;->r:Ljl1;

    .line 950
    .line 951
    if-nez v13, :cond_22

    .line 952
    .line 953
    new-instance v3, Lhd5;

    .line 954
    .line 955
    const/4 v13, 0x4

    .line 956
    invoke-direct {v3, v13, v0, v12}, Lhd5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 957
    .line 958
    .line 959
    goto/16 :goto_21

    .line 960
    .line 961
    :cond_22
    const/4 v13, 0x4

    .line 962
    invoke-static {v15, v0}, Lkb4;->I(Lk14;Loz3;)Z

    .line 963
    .line 964
    .line 965
    move-result v24

    .line 966
    if-nez v24, :cond_23

    .line 967
    .line 968
    new-instance v3, Lhd5;

    .line 969
    .line 970
    invoke-direct {v3, v13, v0, v12}, Lhd5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 971
    .line 972
    .line 973
    goto/16 :goto_21

    .line 974
    .line 975
    :cond_23
    iget-object v12, v0, Loz3;->f:Lix;

    .line 976
    .line 977
    if-nez v12, :cond_24

    .line 978
    .line 979
    sget v12, Lix;->n:I

    .line 980
    .line 981
    iget-object v12, v0, Loz3;->c:Ltl1;

    .line 982
    .line 983
    invoke-static {v12}, Lau0;->O(Ltl1;)Lix;

    .line 984
    .line 985
    .line 986
    move-result-object v12

    .line 987
    iput-object v12, v0, Loz3;->f:Lix;

    .line 988
    .line 989
    :cond_24
    iget-boolean v13, v12, Lix;->a:Z

    .line 990
    .line 991
    if-nez v13, :cond_39

    .line 992
    .line 993
    invoke-virtual {v6, v4}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 994
    .line 995
    .line 996
    move-result-object v13

    .line 997
    if-nez v13, :cond_39

    .line 998
    .line 999
    invoke-virtual {v6, v3}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v13

    .line 1003
    if-eqz v13, :cond_25

    .line 1004
    .line 1005
    goto/16 :goto_20

    .line 1006
    .line 1007
    :cond_25
    invoke-virtual {v15}, Lk14;->b()Lix;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v13

    .line 1011
    if-eqz v17, :cond_26

    .line 1012
    .line 1013
    invoke-virtual/range {v17 .. v17}, Ljava/util/Date;->getTime()J

    .line 1014
    .line 1015
    .line 1016
    move-result-wide v29

    .line 1017
    move-object/from16 v31, v3

    .line 1018
    .line 1019
    move-object/from16 v32, v4

    .line 1020
    .line 1021
    sub-long v3, v10, v29

    .line 1022
    .line 1023
    move-wide/from16 v29, v8

    .line 1024
    .line 1025
    const-wide/16 v8, 0x0

    .line 1026
    .line 1027
    invoke-static {v8, v9, v3, v4}, Ljava/lang/Math;->max(JJ)J

    .line 1028
    .line 1029
    .line 1030
    move-result-wide v21

    .line 1031
    move-wide/from16 v3, v21

    .line 1032
    .line 1033
    :goto_16
    const/4 v8, -0x1

    .line 1034
    goto :goto_17

    .line 1035
    :cond_26
    move-object/from16 v31, v3

    .line 1036
    .line 1037
    move-object/from16 v32, v4

    .line 1038
    .line 1039
    move-wide/from16 v29, v8

    .line 1040
    .line 1041
    const-wide/16 v8, 0x0

    .line 1042
    .line 1043
    move-wide v3, v8

    .line 1044
    goto :goto_16

    .line 1045
    :goto_17
    if-eq v7, v8, :cond_27

    .line 1046
    .line 1047
    int-to-long v7, v7

    .line 1048
    invoke-virtual {v5, v7, v8}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 1049
    .line 1050
    .line 1051
    move-result-wide v7

    .line 1052
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 1053
    .line 1054
    .line 1055
    move-result-wide v3

    .line 1056
    :cond_27
    sub-long v7, v10, v29

    .line 1057
    .line 1058
    move-wide/from16 v33, v3

    .line 1059
    .line 1060
    const-wide/16 v3, 0x0

    .line 1061
    .line 1062
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    .line 1063
    .line 1064
    .line 1065
    move-result-wide v7

    .line 1066
    move-object v9, v6

    .line 1067
    move-wide/from16 v35, v7

    .line 1068
    .line 1069
    sub-long v6, v26, v10

    .line 1070
    .line 1071
    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 1072
    .line 1073
    .line 1074
    move-result-wide v6

    .line 1075
    add-long v3, v33, v35

    .line 1076
    .line 1077
    add-long/2addr v3, v6

    .line 1078
    invoke-virtual {v15}, Lk14;->b()Lix;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v6

    .line 1082
    iget v6, v6, Lix;->c:I

    .line 1083
    .line 1084
    const/4 v8, -0x1

    .line 1085
    if-eq v6, v8, :cond_28

    .line 1086
    .line 1087
    int-to-long v6, v6

    .line 1088
    invoke-virtual {v5, v6, v7}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 1089
    .line 1090
    .line 1091
    move-result-wide v6

    .line 1092
    :goto_18
    const-wide/16 v21, 0x0

    .line 1093
    .line 1094
    goto :goto_1b

    .line 1095
    :cond_28
    if-eqz v14, :cond_2b

    .line 1096
    .line 1097
    if-eqz v17, :cond_29

    .line 1098
    .line 1099
    invoke-virtual/range {v17 .. v17}, Ljava/util/Date;->getTime()J

    .line 1100
    .line 1101
    .line 1102
    move-result-wide v10

    .line 1103
    :cond_29
    invoke-virtual {v14}, Ljava/util/Date;->getTime()J

    .line 1104
    .line 1105
    .line 1106
    move-result-wide v6

    .line 1107
    sub-long/2addr v6, v10

    .line 1108
    const-wide/16 v21, 0x0

    .line 1109
    .line 1110
    cmp-long v8, v6, v21

    .line 1111
    .line 1112
    if-lez v8, :cond_2a

    .line 1113
    .line 1114
    goto :goto_18

    .line 1115
    :cond_2a
    const-wide/16 v6, 0x0

    .line 1116
    .line 1117
    goto :goto_18

    .line 1118
    :cond_2b
    if-eqz v16, :cond_2f

    .line 1119
    .line 1120
    iget-object v6, v15, Lk14;->n:Loz3;

    .line 1121
    .line 1122
    iget-object v6, v6, Loz3;->a:Lgr1;

    .line 1123
    .line 1124
    iget-object v6, v6, Lgr1;->g:Ljava/util/List;

    .line 1125
    .line 1126
    if-nez v6, :cond_2c

    .line 1127
    .line 1128
    const/4 v6, 0x0

    .line 1129
    goto :goto_19

    .line 1130
    :cond_2c
    new-instance v7, Ljava/lang/StringBuilder;

    .line 1131
    .line 1132
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 1133
    .line 1134
    .line 1135
    invoke-static {v6, v7}, Ly41;->h(Ljava/util/List;Ljava/lang/StringBuilder;)V

    .line 1136
    .line 1137
    .line 1138
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1139
    .line 1140
    .line 1141
    move-result-object v6

    .line 1142
    :goto_19
    if-nez v6, :cond_2f

    .line 1143
    .line 1144
    if-eqz v17, :cond_2d

    .line 1145
    .line 1146
    invoke-virtual/range {v17 .. v17}, Ljava/util/Date;->getTime()J

    .line 1147
    .line 1148
    .line 1149
    move-result-wide v6

    .line 1150
    move-wide/from16 v29, v6

    .line 1151
    .line 1152
    :cond_2d
    invoke-virtual/range {v16 .. v16}, Ljava/util/Date;->getTime()J

    .line 1153
    .line 1154
    .line 1155
    move-result-wide v6

    .line 1156
    sub-long v29, v29, v6

    .line 1157
    .line 1158
    const-wide/16 v21, 0x0

    .line 1159
    .line 1160
    cmp-long v6, v29, v21

    .line 1161
    .line 1162
    if-lez v6, :cond_2e

    .line 1163
    .line 1164
    const-wide/16 v6, 0xa

    .line 1165
    .line 1166
    div-long v6, v29, v6

    .line 1167
    .line 1168
    goto :goto_1b

    .line 1169
    :cond_2e
    :goto_1a
    move-wide/from16 v6, v21

    .line 1170
    .line 1171
    goto :goto_1b

    .line 1172
    :cond_2f
    const-wide/16 v21, 0x0

    .line 1173
    .line 1174
    goto :goto_1a

    .line 1175
    :goto_1b
    iget v8, v12, Lix;->c:I

    .line 1176
    .line 1177
    const/4 v10, -0x1

    .line 1178
    if-eq v8, v10, :cond_30

    .line 1179
    .line 1180
    int-to-long v10, v8

    .line 1181
    invoke-virtual {v5, v10, v11}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 1182
    .line 1183
    .line 1184
    move-result-wide v10

    .line 1185
    invoke-static {v6, v7, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 1186
    .line 1187
    .line 1188
    move-result-wide v6

    .line 1189
    :cond_30
    iget v8, v12, Lix;->i:I

    .line 1190
    .line 1191
    const/4 v10, -0x1

    .line 1192
    if-eq v8, v10, :cond_31

    .line 1193
    .line 1194
    int-to-long v10, v8

    .line 1195
    invoke-virtual {v5, v10, v11}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 1196
    .line 1197
    .line 1198
    move-result-wide v10

    .line 1199
    goto :goto_1c

    .line 1200
    :cond_31
    move-wide/from16 v10, v21

    .line 1201
    .line 1202
    :goto_1c
    iget-boolean v8, v13, Lix;->g:Z

    .line 1203
    .line 1204
    if-nez v8, :cond_32

    .line 1205
    .line 1206
    iget v8, v12, Lix;->h:I

    .line 1207
    .line 1208
    const/4 v12, -0x1

    .line 1209
    if-eq v8, v12, :cond_32

    .line 1210
    .line 1211
    move-wide/from16 v26, v3

    .line 1212
    .line 1213
    int-to-long v3, v8

    .line 1214
    invoke-virtual {v5, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 1215
    .line 1216
    .line 1217
    move-result-wide v3

    .line 1218
    goto :goto_1d

    .line 1219
    :cond_32
    move-wide/from16 v26, v3

    .line 1220
    .line 1221
    move-wide/from16 v3, v21

    .line 1222
    .line 1223
    :goto_1d
    iget-boolean v5, v13, Lix;->a:Z

    .line 1224
    .line 1225
    if-nez v5, :cond_35

    .line 1226
    .line 1227
    add-long v10, v26, v10

    .line 1228
    .line 1229
    add-long/2addr v3, v6

    .line 1230
    cmp-long v3, v10, v3

    .line 1231
    .line 1232
    if-gez v3, :cond_35

    .line 1233
    .line 1234
    invoke-virtual {v15}, Lk14;->f()Lj14;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v3

    .line 1238
    cmp-long v4, v10, v6

    .line 1239
    .line 1240
    if-ltz v4, :cond_33

    .line 1241
    .line 1242
    const-string v4, "110 HttpURLConnection \"Response is stale\""

    .line 1243
    .line 1244
    const-string v5, "Warning"

    .line 1245
    .line 1246
    iget-object v6, v3, Lj14;->f:Lsl1;

    .line 1247
    .line 1248
    invoke-virtual {v6, v5, v4}, Lsl1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1249
    .line 1250
    .line 1251
    :cond_33
    const-wide/32 v4, 0x5265c00

    .line 1252
    .line 1253
    .line 1254
    cmp-long v4, v26, v4

    .line 1255
    .line 1256
    if-lez v4, :cond_34

    .line 1257
    .line 1258
    invoke-virtual {v15}, Lk14;->b()Lix;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v4

    .line 1262
    iget v4, v4, Lix;->c:I

    .line 1263
    .line 1264
    const/4 v8, -0x1

    .line 1265
    if-ne v4, v8, :cond_34

    .line 1266
    .line 1267
    if-nez v14, :cond_34

    .line 1268
    .line 1269
    const-string v4, "113 HttpURLConnection \"Heuristic expiration\""

    .line 1270
    .line 1271
    const-string v5, "Warning"

    .line 1272
    .line 1273
    iget-object v6, v3, Lj14;->f:Lsl1;

    .line 1274
    .line 1275
    invoke-virtual {v6, v5, v4}, Lsl1;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1276
    .line 1277
    .line 1278
    :cond_34
    new-instance v4, Lhd5;

    .line 1279
    .line 1280
    invoke-virtual {v3}, Lj14;->a()Lk14;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v3

    .line 1284
    const/4 v12, 0x0

    .line 1285
    const/4 v13, 0x4

    .line 1286
    invoke-direct {v4, v13, v12, v3}, Lhd5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1287
    .line 1288
    .line 1289
    move-object v3, v4

    .line 1290
    goto :goto_21

    .line 1291
    :cond_35
    if-eqz v18, :cond_36

    .line 1292
    .line 1293
    move-object/from16 v4, v18

    .line 1294
    .line 1295
    move-object/from16 v3, v31

    .line 1296
    .line 1297
    goto :goto_1f

    .line 1298
    :cond_36
    if-eqz v16, :cond_37

    .line 1299
    .line 1300
    move-object/from16 v4, v19

    .line 1301
    .line 1302
    :goto_1e
    move-object/from16 v3, v32

    .line 1303
    .line 1304
    goto :goto_1f

    .line 1305
    :cond_37
    if-eqz v17, :cond_38

    .line 1306
    .line 1307
    move-object/from16 v4, v20

    .line 1308
    .line 1309
    goto :goto_1e

    .line 1310
    :goto_1f
    invoke-virtual {v9}, Ltl1;->d()Lsl1;

    .line 1311
    .line 1312
    .line 1313
    move-result-object v5

    .line 1314
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1315
    .line 1316
    .line 1317
    invoke-static {v5, v3, v4}, Le35;->p(Lsl1;Ljava/lang/String;Ljava/lang/String;)V

    .line 1318
    .line 1319
    .line 1320
    invoke-virtual {v0}, Loz3;->a()Lnz3;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v3

    .line 1324
    invoke-virtual {v5}, Lsl1;->c()Ltl1;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v4

    .line 1328
    invoke-virtual {v4}, Ltl1;->d()Lsl1;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v4

    .line 1332
    iput-object v4, v3, Lnz3;->c:Lsl1;

    .line 1333
    .line 1334
    new-instance v4, Loz3;

    .line 1335
    .line 1336
    invoke-direct {v4, v3}, Loz3;-><init>(Lnz3;)V

    .line 1337
    .line 1338
    .line 1339
    new-instance v3, Lhd5;

    .line 1340
    .line 1341
    const/4 v13, 0x4

    .line 1342
    invoke-direct {v3, v13, v4, v15}, Lhd5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1343
    .line 1344
    .line 1345
    goto :goto_21

    .line 1346
    :cond_38
    const/4 v13, 0x4

    .line 1347
    new-instance v3, Lhd5;

    .line 1348
    .line 1349
    const/4 v12, 0x0

    .line 1350
    invoke-direct {v3, v13, v0, v12}, Lhd5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1351
    .line 1352
    .line 1353
    goto :goto_21

    .line 1354
    :cond_39
    :goto_20
    const/4 v12, 0x0

    .line 1355
    const/4 v13, 0x4

    .line 1356
    new-instance v3, Lhd5;

    .line 1357
    .line 1358
    invoke-direct {v3, v13, v0, v12}, Lhd5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1359
    .line 1360
    .line 1361
    :goto_21
    iget-object v4, v3, Lhd5;->o:Ljava/lang/Object;

    .line 1362
    .line 1363
    check-cast v4, Loz3;

    .line 1364
    .line 1365
    if-eqz v4, :cond_3b

    .line 1366
    .line 1367
    iget-object v4, v0, Loz3;->f:Lix;

    .line 1368
    .line 1369
    if-nez v4, :cond_3a

    .line 1370
    .line 1371
    sget v4, Lix;->n:I

    .line 1372
    .line 1373
    iget-object v4, v0, Loz3;->c:Ltl1;

    .line 1374
    .line 1375
    invoke-static {v4}, Lau0;->O(Ltl1;)Lix;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v4

    .line 1379
    iput-object v4, v0, Loz3;->f:Lix;

    .line 1380
    .line 1381
    :cond_3a
    iget-boolean v0, v4, Lix;->j:Z

    .line 1382
    .line 1383
    if-eqz v0, :cond_3b

    .line 1384
    .line 1385
    new-instance v3, Lhd5;

    .line 1386
    .line 1387
    const/4 v12, 0x0

    .line 1388
    const/4 v13, 0x4

    .line 1389
    invoke-direct {v3, v13, v12, v12}, Lhd5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1390
    .line 1391
    .line 1392
    :cond_3b
    iget-object v0, v3, Lhd5;->o:Ljava/lang/Object;

    .line 1393
    .line 1394
    check-cast v0, Loz3;

    .line 1395
    .line 1396
    iget-object v3, v3, Lhd5;->p:Ljava/lang/Object;

    .line 1397
    .line 1398
    check-cast v3, Lk14;

    .line 1399
    .line 1400
    iget-object v4, v1, Lxu;->b:Ljava/lang/Object;

    .line 1401
    .line 1402
    check-cast v4, Lhx;

    .line 1403
    .line 1404
    if-eqz v4, :cond_3c

    .line 1405
    .line 1406
    monitor-enter v4

    .line 1407
    monitor-exit v4

    .line 1408
    :cond_3c
    if-eqz v15, :cond_3d

    .line 1409
    .line 1410
    if-nez v3, :cond_3d

    .line 1411
    .line 1412
    iget-object v4, v15, Lk14;->t:Ln14;

    .line 1413
    .line 1414
    invoke-static {v4}, Lxe5;->b(Ljava/io/Closeable;)V

    .line 1415
    .line 1416
    .line 1417
    :cond_3d
    if-nez v0, :cond_3e

    .line 1418
    .line 1419
    if-nez v3, :cond_3e

    .line 1420
    .line 1421
    sget-object v33, Lxe5;->e:Lfv3;

    .line 1422
    .line 1423
    sget-object v42, Lgq1;->q:Lgq1;

    .line 1424
    .line 1425
    new-instance v0, Ljava/util/ArrayList;

    .line 1426
    .line 1427
    const/16 v14, 0x14

    .line 1428
    .line 1429
    invoke-direct {v0, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 1430
    .line 1431
    .line 1432
    iget-object v1, v2, Lev3;->e:Loz3;

    .line 1433
    .line 1434
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1435
    .line 1436
    .line 1437
    sget-object v28, Lpr3;->q:Lpr3;

    .line 1438
    .line 1439
    const-string v29, "Unsatisfiable Request (only-if-cached)"

    .line 1440
    .line 1441
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1442
    .line 1443
    .line 1444
    move-result-wide v39

    .line 1445
    new-instance v2, Ltl1;

    .line 1446
    .line 1447
    const/4 v3, 0x0

    .line 1448
    new-array v3, v3, [Ljava/lang/String;

    .line 1449
    .line 1450
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1451
    .line 1452
    .line 1453
    move-result-object v0

    .line 1454
    check-cast v0, [Ljava/lang/String;

    .line 1455
    .line 1456
    invoke-direct {v2, v0}, Ltl1;-><init>([Ljava/lang/String;)V

    .line 1457
    .line 1458
    .line 1459
    new-instance v26, Lk14;

    .line 1460
    .line 1461
    const/16 v30, 0x1f8

    .line 1462
    .line 1463
    const/16 v31, 0x0

    .line 1464
    .line 1465
    const/16 v34, 0x0

    .line 1466
    .line 1467
    const/16 v35, 0x0

    .line 1468
    .line 1469
    const/16 v36, 0x0

    .line 1470
    .line 1471
    const-wide/16 v37, -0x1

    .line 1472
    .line 1473
    const/16 v41, 0x0

    .line 1474
    .line 1475
    move-object/from16 v27, v1

    .line 1476
    .line 1477
    move-object/from16 v32, v2

    .line 1478
    .line 1479
    invoke-direct/range {v26 .. v42}, Lk14;-><init>(Loz3;Lpr3;Ljava/lang/String;ILjl1;Ltl1;Ln14;Lk14;Lk14;Lk14;JJLy10;Lgf1;)V

    .line 1480
    .line 1481
    .line 1482
    move-object/from16 v6, v26

    .line 1483
    .line 1484
    goto/16 :goto_2d

    .line 1485
    .line 1486
    :cond_3e
    if-nez v0, :cond_3f

    .line 1487
    .line 1488
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1489
    .line 1490
    .line 1491
    invoke-virtual {v3}, Lk14;->f()Lj14;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v0

    .line 1495
    invoke-static {v3}, Lxl;->M(Lk14;)Lk14;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v1

    .line 1499
    const-string v2, "cacheResponse"

    .line 1500
    .line 1501
    invoke-static {v2, v1}, Lxl;->i(Ljava/lang/String;Lk14;)V

    .line 1502
    .line 1503
    .line 1504
    iput-object v1, v0, Lj14;->i:Lk14;

    .line 1505
    .line 1506
    invoke-virtual {v0}, Lj14;->a()Lk14;

    .line 1507
    .line 1508
    .line 1509
    move-result-object v6

    .line 1510
    goto/16 :goto_2d

    .line 1511
    .line 1512
    :cond_3f
    :try_start_b
    invoke-virtual {v2, v0}, Lev3;->b(Loz3;)Lk14;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 1516
    if-eqz v3, :cond_4b

    .line 1517
    .line 1518
    iget v4, v2, Lk14;->q:I

    .line 1519
    .line 1520
    const/16 v5, 0x130

    .line 1521
    .line 1522
    if-ne v4, v5, :cond_4a

    .line 1523
    .line 1524
    invoke-virtual {v3}, Lk14;->f()Lj14;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v0

    .line 1528
    iget-object v4, v3, Lk14;->s:Ltl1;

    .line 1529
    .line 1530
    iget-object v5, v2, Lk14;->s:Ltl1;

    .line 1531
    .line 1532
    new-instance v6, Ljava/util/ArrayList;

    .line 1533
    .line 1534
    const/16 v14, 0x14

    .line 1535
    .line 1536
    invoke-direct {v6, v14}, Ljava/util/ArrayList;-><init>(I)V

    .line 1537
    .line 1538
    .line 1539
    invoke-virtual {v4}, Ltl1;->size()I

    .line 1540
    .line 1541
    .line 1542
    move-result v7

    .line 1543
    const/4 v8, 0x0

    .line 1544
    :goto_22
    if-ge v8, v7, :cond_44

    .line 1545
    .line 1546
    invoke-virtual {v4, v8}, Ltl1;->b(I)Ljava/lang/String;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v9

    .line 1550
    invoke-virtual {v4, v8}, Ltl1;->e(I)Ljava/lang/String;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v10

    .line 1554
    const-string v11, "Warning"

    .line 1555
    .line 1556
    invoke-virtual {v11, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1557
    .line 1558
    .line 1559
    move-result v11

    .line 1560
    if-eqz v11, :cond_40

    .line 1561
    .line 1562
    const-string v11, "1"

    .line 1563
    .line 1564
    const/4 v12, 0x0

    .line 1565
    invoke-static {v10, v11, v12}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1566
    .line 1567
    .line 1568
    move-result v11

    .line 1569
    if-eqz v11, :cond_40

    .line 1570
    .line 1571
    goto :goto_24

    .line 1572
    :cond_40
    const-string v11, "Content-Length"

    .line 1573
    .line 1574
    invoke-virtual {v11, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1575
    .line 1576
    .line 1577
    move-result v11

    .line 1578
    if-nez v11, :cond_42

    .line 1579
    .line 1580
    const-string v11, "Content-Encoding"

    .line 1581
    .line 1582
    invoke-virtual {v11, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1583
    .line 1584
    .line 1585
    move-result v11

    .line 1586
    if-nez v11, :cond_42

    .line 1587
    .line 1588
    const-string v11, "Content-Type"

    .line 1589
    .line 1590
    invoke-virtual {v11, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1591
    .line 1592
    .line 1593
    move-result v11

    .line 1594
    if-eqz v11, :cond_41

    .line 1595
    .line 1596
    goto :goto_23

    .line 1597
    :cond_41
    invoke-static {v9}, Lj51;->C(Ljava/lang/String;)Z

    .line 1598
    .line 1599
    .line 1600
    move-result v11

    .line 1601
    if-eqz v11, :cond_42

    .line 1602
    .line 1603
    invoke-virtual {v5, v9}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1604
    .line 1605
    .line 1606
    move-result-object v11

    .line 1607
    if-nez v11, :cond_43

    .line 1608
    .line 1609
    :cond_42
    :goto_23
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1610
    .line 1611
    .line 1612
    invoke-static {v10}, Lqm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1613
    .line 1614
    .line 1615
    move-result-object v9

    .line 1616
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v9

    .line 1620
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1621
    .line 1622
    .line 1623
    :cond_43
    :goto_24
    add-int/lit8 v8, v8, 0x1

    .line 1624
    .line 1625
    goto :goto_22

    .line 1626
    :cond_44
    invoke-virtual {v5}, Ltl1;->size()I

    .line 1627
    .line 1628
    .line 1629
    move-result v4

    .line 1630
    const/4 v7, 0x0

    .line 1631
    :goto_25
    if-ge v7, v4, :cond_47

    .line 1632
    .line 1633
    invoke-virtual {v5, v7}, Ltl1;->b(I)Ljava/lang/String;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v8

    .line 1637
    const-string v9, "Content-Length"

    .line 1638
    .line 1639
    invoke-virtual {v9, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1640
    .line 1641
    .line 1642
    move-result v9

    .line 1643
    if-nez v9, :cond_46

    .line 1644
    .line 1645
    const-string v9, "Content-Encoding"

    .line 1646
    .line 1647
    invoke-virtual {v9, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1648
    .line 1649
    .line 1650
    move-result v9

    .line 1651
    if-nez v9, :cond_46

    .line 1652
    .line 1653
    const-string v9, "Content-Type"

    .line 1654
    .line 1655
    invoke-virtual {v9, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 1656
    .line 1657
    .line 1658
    move-result v9

    .line 1659
    if-eqz v9, :cond_45

    .line 1660
    .line 1661
    goto :goto_26

    .line 1662
    :cond_45
    invoke-static {v8}, Lj51;->C(Ljava/lang/String;)Z

    .line 1663
    .line 1664
    .line 1665
    move-result v9

    .line 1666
    if-eqz v9, :cond_46

    .line 1667
    .line 1668
    invoke-virtual {v5, v7}, Ltl1;->e(I)Ljava/lang/String;

    .line 1669
    .line 1670
    .line 1671
    move-result-object v9

    .line 1672
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1673
    .line 1674
    .line 1675
    invoke-static {v9}, Lqm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v8

    .line 1679
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1680
    .line 1681
    .line 1682
    move-result-object v8

    .line 1683
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1684
    .line 1685
    .line 1686
    :cond_46
    :goto_26
    add-int/lit8 v7, v7, 0x1

    .line 1687
    .line 1688
    goto :goto_25

    .line 1689
    :cond_47
    const/4 v7, 0x0

    .line 1690
    new-array v4, v7, [Ljava/lang/String;

    .line 1691
    .line 1692
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v4

    .line 1696
    check-cast v4, [Ljava/lang/String;

    .line 1697
    .line 1698
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1699
    .line 1700
    .line 1701
    new-instance v5, Lsl1;

    .line 1702
    .line 1703
    invoke-direct {v5}, Lsl1;-><init>()V

    .line 1704
    .line 1705
    .line 1706
    iget-object v6, v5, Lsl1;->a:Ljava/util/ArrayList;

    .line 1707
    .line 1708
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1709
    .line 1710
    .line 1711
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v4

    .line 1715
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1716
    .line 1717
    .line 1718
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1719
    .line 1720
    .line 1721
    iput-object v5, v0, Lj14;->f:Lsl1;

    .line 1722
    .line 1723
    iget-wide v4, v2, Lk14;->x:J

    .line 1724
    .line 1725
    iput-wide v4, v0, Lj14;->k:J

    .line 1726
    .line 1727
    iget-wide v4, v2, Lk14;->y:J

    .line 1728
    .line 1729
    iput-wide v4, v0, Lj14;->l:J

    .line 1730
    .line 1731
    invoke-static {v3}, Lxl;->M(Lk14;)Lk14;

    .line 1732
    .line 1733
    .line 1734
    move-result-object v4

    .line 1735
    const-string v5, "cacheResponse"

    .line 1736
    .line 1737
    invoke-static {v5, v4}, Lxl;->i(Ljava/lang/String;Lk14;)V

    .line 1738
    .line 1739
    .line 1740
    iput-object v4, v0, Lj14;->i:Lk14;

    .line 1741
    .line 1742
    invoke-static {v2}, Lxl;->M(Lk14;)Lk14;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v4

    .line 1746
    const-string v5, "networkResponse"

    .line 1747
    .line 1748
    invoke-static {v5, v4}, Lxl;->i(Ljava/lang/String;Lk14;)V

    .line 1749
    .line 1750
    .line 1751
    iput-object v4, v0, Lj14;->h:Lk14;

    .line 1752
    .line 1753
    invoke-virtual {v0}, Lj14;->a()Lk14;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v0

    .line 1757
    iget-object v2, v2, Lk14;->t:Ln14;

    .line 1758
    .line 1759
    invoke-virtual {v2}, Ln14;->close()V

    .line 1760
    .line 1761
    .line 1762
    iget-object v2, v1, Lxu;->b:Ljava/lang/Object;

    .line 1763
    .line 1764
    check-cast v2, Lhx;

    .line 1765
    .line 1766
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1767
    .line 1768
    .line 1769
    monitor-enter v2

    .line 1770
    monitor-exit v2

    .line 1771
    iget-object v1, v1, Lxu;->b:Ljava/lang/Object;

    .line 1772
    .line 1773
    check-cast v1, Lhx;

    .line 1774
    .line 1775
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1776
    .line 1777
    .line 1778
    new-instance v1, Lfx;

    .line 1779
    .line 1780
    invoke-direct {v1, v0}, Lfx;-><init>(Lk14;)V

    .line 1781
    .line 1782
    .line 1783
    iget-object v2, v3, Lk14;->t:Ln14;

    .line 1784
    .line 1785
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1786
    .line 1787
    .line 1788
    check-cast v2, Lex;

    .line 1789
    .line 1790
    iget-object v2, v2, Lex;->n:Lfr0;

    .line 1791
    .line 1792
    :try_start_c
    iget-object v3, v2, Lfr0;->q:Ljr0;

    .line 1793
    .line 1794
    iget-object v4, v2, Lfr0;->n:Ljava/lang/String;

    .line 1795
    .line 1796
    iget-wide v5, v2, Lfr0;->o:J

    .line 1797
    .line 1798
    invoke-virtual {v3, v4, v5, v6}, Ljr0;->j(Ljava/lang/String;J)Lll;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v6
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_4

    .line 1802
    if-nez v6, :cond_48

    .line 1803
    .line 1804
    goto :goto_27

    .line 1805
    :cond_48
    :try_start_d
    invoke-virtual {v1, v6}, Lfx;->c(Lll;)V

    .line 1806
    .line 1807
    .line 1808
    invoke-virtual {v6}, Lll;->b()V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_5

    .line 1809
    .line 1810
    .line 1811
    goto :goto_27

    .line 1812
    :catch_4
    const/4 v6, 0x0

    .line 1813
    :catch_5
    if-eqz v6, :cond_49

    .line 1814
    .line 1815
    :try_start_e
    invoke-virtual {v6}, Lll;->a()V
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_6

    .line 1816
    .line 1817
    .line 1818
    :catch_6
    :cond_49
    :goto_27
    move-object v6, v0

    .line 1819
    goto/16 :goto_2d

    .line 1820
    .line 1821
    :cond_4a
    iget-object v4, v3, Lk14;->t:Ln14;

    .line 1822
    .line 1823
    invoke-static {v4}, Lxe5;->b(Ljava/io/Closeable;)V

    .line 1824
    .line 1825
    .line 1826
    :cond_4b
    invoke-virtual {v2}, Lk14;->f()Lj14;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v4

    .line 1830
    if-eqz v3, :cond_4c

    .line 1831
    .line 1832
    invoke-static {v3}, Lxl;->M(Lk14;)Lk14;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v15

    .line 1836
    goto :goto_28

    .line 1837
    :cond_4c
    const/4 v15, 0x0

    .line 1838
    :goto_28
    const-string v3, "cacheResponse"

    .line 1839
    .line 1840
    invoke-static {v3, v15}, Lxl;->i(Ljava/lang/String;Lk14;)V

    .line 1841
    .line 1842
    .line 1843
    iput-object v15, v4, Lj14;->i:Lk14;

    .line 1844
    .line 1845
    invoke-static {v2}, Lxl;->M(Lk14;)Lk14;

    .line 1846
    .line 1847
    .line 1848
    move-result-object v2

    .line 1849
    const-string v3, "networkResponse"

    .line 1850
    .line 1851
    invoke-static {v3, v2}, Lxl;->i(Ljava/lang/String;Lk14;)V

    .line 1852
    .line 1853
    .line 1854
    iput-object v2, v4, Lj14;->h:Lk14;

    .line 1855
    .line 1856
    invoke-virtual {v4}, Lj14;->a()Lk14;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v2

    .line 1860
    iget-object v3, v1, Lxu;->b:Ljava/lang/Object;

    .line 1861
    .line 1862
    check-cast v3, Lhx;

    .line 1863
    .line 1864
    if-eqz v3, :cond_55

    .line 1865
    .line 1866
    invoke-static {v2}, Lbr1;->a(Lk14;)Z

    .line 1867
    .line 1868
    .line 1869
    move-result v3

    .line 1870
    if-eqz v3, :cond_54

    .line 1871
    .line 1872
    invoke-static {v2, v0}, Lkb4;->I(Lk14;Loz3;)Z

    .line 1873
    .line 1874
    .line 1875
    move-result v3

    .line 1876
    if-eqz v3, :cond_54

    .line 1877
    .line 1878
    iget-object v1, v1, Lxu;->b:Ljava/lang/Object;

    .line 1879
    .line 1880
    check-cast v1, Lhx;

    .line 1881
    .line 1882
    invoke-virtual {v2}, Lk14;->f()Lj14;

    .line 1883
    .line 1884
    .line 1885
    move-result-object v3

    .line 1886
    iput-object v0, v3, Lj14;->a:Loz3;

    .line 1887
    .line 1888
    invoke-virtual {v3}, Lj14;->a()Lk14;

    .line 1889
    .line 1890
    .line 1891
    move-result-object v0

    .line 1892
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1893
    .line 1894
    .line 1895
    iget-object v3, v0, Lk14;->n:Loz3;

    .line 1896
    .line 1897
    iget-object v4, v3, Loz3;->b:Ljava/lang/String;

    .line 1898
    .line 1899
    invoke-static {v4}, Lgb;->J(Ljava/lang/String;)Z

    .line 1900
    .line 1901
    .line 1902
    move-result v5

    .line 1903
    if-eqz v5, :cond_4e

    .line 1904
    .line 1905
    :try_start_f
    invoke-virtual {v1, v3}, Lhx;->b(Loz3;)V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_7

    .line 1906
    .line 1907
    .line 1908
    :catch_7
    :cond_4d
    :goto_29
    const/4 v15, 0x0

    .line 1909
    goto :goto_2a

    .line 1910
    :cond_4e
    const-string v5, "GET"

    .line 1911
    .line 1912
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1913
    .line 1914
    .line 1915
    move-result v4

    .line 1916
    if-nez v4, :cond_4f

    .line 1917
    .line 1918
    goto :goto_29

    .line 1919
    :cond_4f
    iget-object v4, v0, Lk14;->s:Ltl1;

    .line 1920
    .line 1921
    invoke-static {v4}, Lsi0;->U(Ltl1;)Ljava/util/Set;

    .line 1922
    .line 1923
    .line 1924
    move-result-object v4

    .line 1925
    const-string v5, "*"

    .line 1926
    .line 1927
    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1928
    .line 1929
    .line 1930
    move-result v4

    .line 1931
    if-eqz v4, :cond_50

    .line 1932
    .line 1933
    goto :goto_29

    .line 1934
    :cond_50
    new-instance v4, Lfx;

    .line 1935
    .line 1936
    invoke-direct {v4, v0}, Lfx;-><init>(Lk14;)V

    .line 1937
    .line 1938
    .line 1939
    :try_start_10
    iget-object v0, v1, Lhx;->n:Ljr0;

    .line 1940
    .line 1941
    iget-object v3, v3, Loz3;->a:Lgr1;

    .line 1942
    .line 1943
    invoke-static {v3}, Lsi0;->D(Lgr1;)Ljava/lang/String;

    .line 1944
    .line 1945
    .line 1946
    move-result-object v3

    .line 1947
    sget-object v5, Ljr0;->G:Lux3;

    .line 1948
    .line 1949
    const-wide/16 v5, -0x1

    .line 1950
    .line 1951
    invoke-virtual {v0, v3, v5, v6}, Ljr0;->j(Ljava/lang/String;J)Lll;

    .line 1952
    .line 1953
    .line 1954
    move-result-object v15
    :try_end_10
    .catch Ljava/io/IOException; {:try_start_10 .. :try_end_10} :catch_8

    .line 1955
    if-nez v15, :cond_51

    .line 1956
    .line 1957
    goto :goto_29

    .line 1958
    :cond_51
    :try_start_11
    invoke-virtual {v4, v15}, Lfx;->c(Lll;)V

    .line 1959
    .line 1960
    .line 1961
    new-instance v0, Ljw;

    .line 1962
    .line 1963
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1964
    .line 1965
    .line 1966
    iput-object v1, v0, Ljw;->r:Ljava/lang/Object;

    .line 1967
    .line 1968
    iput-object v15, v0, Ljw;->o:Ljava/lang/Object;

    .line 1969
    .line 1970
    const/4 v3, 0x1

    .line 1971
    invoke-virtual {v15, v3}, Lll;->i(I)Lof4;

    .line 1972
    .line 1973
    .line 1974
    move-result-object v3

    .line 1975
    iput-object v3, v0, Ljw;->p:Ljava/lang/Object;

    .line 1976
    .line 1977
    new-instance v4, Lgx;

    .line 1978
    .line 1979
    invoke-direct {v4, v1, v0, v3}, Lgx;-><init>(Lhx;Ljw;Lof4;)V

    .line 1980
    .line 1981
    .line 1982
    iput-object v4, v0, Ljw;->q:Ljava/lang/Object;
    :try_end_11
    .catch Ljava/io/IOException; {:try_start_11 .. :try_end_11} :catch_9

    .line 1983
    .line 1984
    move-object v15, v0

    .line 1985
    goto :goto_2a

    .line 1986
    :catch_8
    const/4 v15, 0x0

    .line 1987
    :catch_9
    if-eqz v15, :cond_4d

    .line 1988
    .line 1989
    :try_start_12
    invoke-virtual {v15}, Lll;->a()V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_7

    .line 1990
    .line 1991
    .line 1992
    goto :goto_29

    .line 1993
    :goto_2a
    if-nez v15, :cond_52

    .line 1994
    .line 1995
    goto :goto_2c

    .line 1996
    :cond_52
    iget-object v0, v15, Ljw;->q:Ljava/lang/Object;

    .line 1997
    .line 1998
    check-cast v0, Lgx;

    .line 1999
    .line 2000
    iget-object v1, v2, Lk14;->t:Ln14;

    .line 2001
    .line 2002
    invoke-virtual {v1}, Ln14;->source()Lfw;

    .line 2003
    .line 2004
    .line 2005
    move-result-object v1

    .line 2006
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2007
    .line 2008
    .line 2009
    new-instance v3, Lwu3;

    .line 2010
    .line 2011
    invoke-direct {v3, v0}, Lwu3;-><init>(Lof4;)V

    .line 2012
    .line 2013
    .line 2014
    new-instance v0, Lox;

    .line 2015
    .line 2016
    invoke-direct {v0, v1, v15, v3}, Lox;-><init>(Lfw;Ljw;Lwu3;)V

    .line 2017
    .line 2018
    .line 2019
    const-string v1, "Content-Type"

    .line 2020
    .line 2021
    iget-object v3, v2, Lk14;->s:Ltl1;

    .line 2022
    .line 2023
    invoke-virtual {v3, v1}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 2024
    .line 2025
    .line 2026
    move-result-object v1

    .line 2027
    if-nez v1, :cond_53

    .line 2028
    .line 2029
    const/4 v4, 0x0

    .line 2030
    goto :goto_2b

    .line 2031
    :cond_53
    move-object v4, v1

    .line 2032
    :goto_2b
    iget-object v1, v2, Lk14;->t:Ln14;

    .line 2033
    .line 2034
    invoke-virtual {v1}, Ln14;->contentLength()J

    .line 2035
    .line 2036
    .line 2037
    move-result-wide v5

    .line 2038
    invoke-virtual {v2}, Lk14;->f()Lj14;

    .line 2039
    .line 2040
    .line 2041
    move-result-object v1

    .line 2042
    new-instance v3, Lfv3;

    .line 2043
    .line 2044
    new-instance v7, Lxu3;

    .line 2045
    .line 2046
    invoke-direct {v7, v0}, Lxu3;-><init>(Lej4;)V

    .line 2047
    .line 2048
    .line 2049
    const/4 v8, 0x0

    .line 2050
    invoke-direct/range {v3 .. v8}, Lfv3;-><init>(Ljava/lang/Object;JLfw;I)V

    .line 2051
    .line 2052
    .line 2053
    iput-object v3, v1, Lj14;->g:Ln14;

    .line 2054
    .line 2055
    invoke-virtual {v1}, Lj14;->a()Lk14;

    .line 2056
    .line 2057
    .line 2058
    move-result-object v0

    .line 2059
    goto/16 :goto_27

    .line 2060
    .line 2061
    :cond_54
    iget-object v3, v0, Loz3;->b:Ljava/lang/String;

    .line 2062
    .line 2063
    invoke-static {v3}, Lgb;->J(Ljava/lang/String;)Z

    .line 2064
    .line 2065
    .line 2066
    move-result v3

    .line 2067
    if-eqz v3, :cond_55

    .line 2068
    .line 2069
    :try_start_13
    iget-object v1, v1, Lxu;->b:Ljava/lang/Object;

    .line 2070
    .line 2071
    check-cast v1, Lhx;

    .line 2072
    .line 2073
    invoke-virtual {v1, v0}, Lhx;->b(Loz3;)V
    :try_end_13
    .catch Ljava/io/IOException; {:try_start_13 .. :try_end_13} :catch_a

    .line 2074
    .line 2075
    .line 2076
    :catch_a
    :cond_55
    :goto_2c
    move-object v6, v2

    .line 2077
    :goto_2d
    return-object v6

    .line 2078
    :catchall_2
    move-exception v0

    .line 2079
    if-eqz v15, :cond_56

    .line 2080
    .line 2081
    iget-object v1, v15, Lk14;->t:Ln14;

    .line 2082
    .line 2083
    invoke-static {v1}, Lxe5;->b(Ljava/io/Closeable;)V

    .line 2084
    .line 2085
    .line 2086
    :cond_56
    throw v0

    .line 2087
    :pswitch_2
    const/4 v3, 0x1

    .line 2088
    const-string v0, "Content-Encoding"

    .line 2089
    .line 2090
    const-string v4, "User-Agent"

    .line 2091
    .line 2092
    iget-object v1, v1, Lxu;->b:Ljava/lang/Object;

    .line 2093
    .line 2094
    check-cast v1, Lbe0;

    .line 2095
    .line 2096
    const-string v5, "gzip"

    .line 2097
    .line 2098
    const-string v6, "Accept-Encoding"

    .line 2099
    .line 2100
    const-string v7, "Connection"

    .line 2101
    .line 2102
    const-string v8, "Host"

    .line 2103
    .line 2104
    const-string v9, "Transfer-Encoding"

    .line 2105
    .line 2106
    const-string v10, "Content-Type"

    .line 2107
    .line 2108
    const-string v11, "Content-Length"

    .line 2109
    .line 2110
    iget-object v12, v2, Lev3;->e:Loz3;

    .line 2111
    .line 2112
    invoke-virtual {v12}, Loz3;->a()Lnz3;

    .line 2113
    .line 2114
    .line 2115
    move-result-object v13

    .line 2116
    iget-object v14, v12, Loz3;->a:Lgr1;

    .line 2117
    .line 2118
    iget-object v15, v12, Loz3;->c:Ltl1;

    .line 2119
    .line 2120
    iget-object v12, v12, Loz3;->d:Ltz3;

    .line 2121
    .line 2122
    const-wide/16 v18, -0x1

    .line 2123
    .line 2124
    if-eqz v12, :cond_59

    .line 2125
    .line 2126
    invoke-virtual {v12}, Ltz3;->contentType()Lhu2;

    .line 2127
    .line 2128
    .line 2129
    move-result-object v3

    .line 2130
    if-eqz v3, :cond_57

    .line 2131
    .line 2132
    iget-object v3, v3, Lhu2;->a:Ljava/lang/String;

    .line 2133
    .line 2134
    invoke-virtual {v13, v10, v3}, Lnz3;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2135
    .line 2136
    .line 2137
    :cond_57
    invoke-virtual {v12}, Ltz3;->contentLength()J

    .line 2138
    .line 2139
    .line 2140
    move-result-wide v16

    .line 2141
    cmp-long v3, v16, v18

    .line 2142
    .line 2143
    if-eqz v3, :cond_58

    .line 2144
    .line 2145
    invoke-static/range {v16 .. v17}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 2146
    .line 2147
    .line 2148
    move-result-object v3

    .line 2149
    invoke-virtual {v13, v11, v3}, Lnz3;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2150
    .line 2151
    .line 2152
    iget-object v3, v13, Lnz3;->c:Lsl1;

    .line 2153
    .line 2154
    invoke-virtual {v3, v9}, Lsl1;->e(Ljava/lang/String;)V

    .line 2155
    .line 2156
    .line 2157
    goto :goto_2e

    .line 2158
    :cond_58
    const-string v3, "chunked"

    .line 2159
    .line 2160
    invoke-virtual {v13, v9, v3}, Lnz3;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2161
    .line 2162
    .line 2163
    iget-object v3, v13, Lnz3;->c:Lsl1;

    .line 2164
    .line 2165
    invoke-virtual {v3, v11}, Lsl1;->e(Ljava/lang/String;)V

    .line 2166
    .line 2167
    .line 2168
    :cond_59
    :goto_2e
    invoke-virtual {v15, v8}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 2169
    .line 2170
    .line 2171
    move-result-object v3

    .line 2172
    if-nez v3, :cond_5a

    .line 2173
    .line 2174
    const/4 v3, 0x0

    .line 2175
    invoke-static {v14, v3}, Lze5;->j(Lgr1;Z)Ljava/lang/String;

    .line 2176
    .line 2177
    .line 2178
    move-result-object v9

    .line 2179
    invoke-virtual {v13, v8, v9}, Lnz3;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2180
    .line 2181
    .line 2182
    goto :goto_2f

    .line 2183
    :cond_5a
    const/4 v3, 0x0

    .line 2184
    :goto_2f
    invoke-virtual {v15, v7}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 2185
    .line 2186
    .line 2187
    move-result-object v8

    .line 2188
    if-nez v8, :cond_5b

    .line 2189
    .line 2190
    const-string v8, "Keep-Alive"

    .line 2191
    .line 2192
    invoke-virtual {v13, v7, v8}, Lnz3;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2193
    .line 2194
    .line 2195
    :cond_5b
    invoke-virtual {v15, v6}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 2196
    .line 2197
    .line 2198
    move-result-object v7

    .line 2199
    if-nez v7, :cond_5c

    .line 2200
    .line 2201
    const-string v7, "Range"

    .line 2202
    .line 2203
    invoke-virtual {v15, v7}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 2204
    .line 2205
    .line 2206
    move-result-object v7

    .line 2207
    if-nez v7, :cond_5c

    .line 2208
    .line 2209
    invoke-virtual {v13, v6, v5}, Lnz3;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2210
    .line 2211
    .line 2212
    const/16 v25, 0x1

    .line 2213
    .line 2214
    goto :goto_30

    .line 2215
    :cond_5c
    move/from16 v25, v3

    .line 2216
    .line 2217
    :goto_30
    invoke-interface {v1, v14}, Lbe0;->w(Lgr1;)Ljava/util/List;

    .line 2218
    .line 2219
    .line 2220
    move-result-object v6

    .line 2221
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 2222
    .line 2223
    .line 2224
    move-result v7

    .line 2225
    if-nez v7, :cond_60

    .line 2226
    .line 2227
    const-string v7, "Cookie"

    .line 2228
    .line 2229
    new-instance v8, Ljava/lang/StringBuilder;

    .line 2230
    .line 2231
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 2232
    .line 2233
    .line 2234
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2235
    .line 2236
    .line 2237
    move-result-object v6

    .line 2238
    :goto_31
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 2239
    .line 2240
    .line 2241
    move-result v9

    .line 2242
    if-eqz v9, :cond_5f

    .line 2243
    .line 2244
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2245
    .line 2246
    .line 2247
    move-result-object v9

    .line 2248
    add-int/lit8 v12, v3, 0x1

    .line 2249
    .line 2250
    if-ltz v3, :cond_5e

    .line 2251
    .line 2252
    check-cast v9, Lae0;

    .line 2253
    .line 2254
    if-lez v3, :cond_5d

    .line 2255
    .line 2256
    const-string v3, "; "

    .line 2257
    .line 2258
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2259
    .line 2260
    .line 2261
    :cond_5d
    iget-object v3, v9, Lae0;->a:Ljava/lang/String;

    .line 2262
    .line 2263
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2264
    .line 2265
    .line 2266
    const/16 v3, 0x3d

    .line 2267
    .line 2268
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2269
    .line 2270
    .line 2271
    iget-object v3, v9, Lae0;->b:Ljava/lang/String;

    .line 2272
    .line 2273
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2274
    .line 2275
    .line 2276
    move v3, v12

    .line 2277
    goto :goto_31

    .line 2278
    :cond_5e
    invoke-static {}, Lgb;->c0()V

    .line 2279
    .line 2280
    .line 2281
    const/16 v24, 0x0

    .line 2282
    .line 2283
    throw v24

    .line 2284
    :cond_5f
    const/16 v24, 0x0

    .line 2285
    .line 2286
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2287
    .line 2288
    .line 2289
    move-result-object v3

    .line 2290
    invoke-virtual {v13, v7, v3}, Lnz3;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2291
    .line 2292
    .line 2293
    goto :goto_32

    .line 2294
    :cond_60
    const/16 v24, 0x0

    .line 2295
    .line 2296
    :goto_32
    invoke-virtual {v15, v4}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 2297
    .line 2298
    .line 2299
    move-result-object v3

    .line 2300
    if-nez v3, :cond_61

    .line 2301
    .line 2302
    const-string v3, "okhttp/5.0.0-alpha.14"

    .line 2303
    .line 2304
    invoke-virtual {v13, v4, v3}, Lnz3;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2305
    .line 2306
    .line 2307
    :cond_61
    new-instance v3, Loz3;

    .line 2308
    .line 2309
    invoke-direct {v3, v13}, Loz3;-><init>(Lnz3;)V

    .line 2310
    .line 2311
    .line 2312
    invoke-virtual {v2, v3}, Lev3;->b(Loz3;)Lk14;

    .line 2313
    .line 2314
    .line 2315
    move-result-object v2

    .line 2316
    iget-object v4, v2, Lk14;->s:Ltl1;

    .line 2317
    .line 2318
    iget-object v6, v3, Loz3;->a:Lgr1;

    .line 2319
    .line 2320
    invoke-static {v1, v6, v4}, Lbr1;->b(Lbe0;Lgr1;Ltl1;)V

    .line 2321
    .line 2322
    .line 2323
    invoke-virtual {v2}, Lk14;->f()Lj14;

    .line 2324
    .line 2325
    .line 2326
    move-result-object v1

    .line 2327
    iput-object v3, v1, Lj14;->a:Loz3;

    .line 2328
    .line 2329
    if-eqz v25, :cond_64

    .line 2330
    .line 2331
    invoke-virtual {v4, v0}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 2332
    .line 2333
    .line 2334
    move-result-object v15

    .line 2335
    if-nez v15, :cond_62

    .line 2336
    .line 2337
    move-object/from16 v15, v24

    .line 2338
    .line 2339
    :cond_62
    invoke-virtual {v5, v15}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 2340
    .line 2341
    .line 2342
    move-result v3

    .line 2343
    if-eqz v3, :cond_64

    .line 2344
    .line 2345
    invoke-static {v2}, Lbr1;->a(Lk14;)Z

    .line 2346
    .line 2347
    .line 2348
    move-result v3

    .line 2349
    if-eqz v3, :cond_64

    .line 2350
    .line 2351
    iget-object v2, v2, Lk14;->t:Ln14;

    .line 2352
    .line 2353
    if-eqz v2, :cond_64

    .line 2354
    .line 2355
    new-instance v3, Ltk1;

    .line 2356
    .line 2357
    invoke-virtual {v2}, Ln14;->source()Lfw;

    .line 2358
    .line 2359
    .line 2360
    move-result-object v2

    .line 2361
    invoke-direct {v3, v2}, Ltk1;-><init>(Lej4;)V

    .line 2362
    .line 2363
    .line 2364
    invoke-virtual {v4}, Ltl1;->d()Lsl1;

    .line 2365
    .line 2366
    .line 2367
    move-result-object v2

    .line 2368
    invoke-virtual {v2, v0}, Lsl1;->e(Ljava/lang/String;)V

    .line 2369
    .line 2370
    .line 2371
    invoke-virtual {v2, v11}, Lsl1;->e(Ljava/lang/String;)V

    .line 2372
    .line 2373
    .line 2374
    invoke-virtual {v2}, Lsl1;->c()Ltl1;

    .line 2375
    .line 2376
    .line 2377
    move-result-object v0

    .line 2378
    invoke-virtual {v0}, Ltl1;->d()Lsl1;

    .line 2379
    .line 2380
    .line 2381
    move-result-object v0

    .line 2382
    iput-object v0, v1, Lj14;->f:Lsl1;

    .line 2383
    .line 2384
    invoke-virtual {v4, v10}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 2385
    .line 2386
    .line 2387
    move-result-object v0

    .line 2388
    if-nez v0, :cond_63

    .line 2389
    .line 2390
    move-object/from16 v17, v24

    .line 2391
    .line 2392
    goto :goto_33

    .line 2393
    :cond_63
    move-object/from16 v17, v0

    .line 2394
    .line 2395
    :goto_33
    new-instance v16, Lfv3;

    .line 2396
    .line 2397
    new-instance v0, Lxu3;

    .line 2398
    .line 2399
    invoke-direct {v0, v3}, Lxu3;-><init>(Lej4;)V

    .line 2400
    .line 2401
    .line 2402
    const/16 v21, 0x0

    .line 2403
    .line 2404
    move-object/from16 v20, v0

    .line 2405
    .line 2406
    invoke-direct/range {v16 .. v21}, Lfv3;-><init>(Ljava/lang/Object;JLfw;I)V

    .line 2407
    .line 2408
    .line 2409
    move-object/from16 v0, v16

    .line 2410
    .line 2411
    iput-object v0, v1, Lj14;->g:Ln14;

    .line 2412
    .line 2413
    :cond_64
    invoke-virtual {v1}, Lj14;->a()Lk14;

    .line 2414
    .line 2415
    .line 2416
    move-result-object v0

    .line 2417
    return-object v0

    .line 2418
    nop

    .line 2419
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lk14;Ly10;)Loz3;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    invoke-virtual {p2}, Ly10;->e()Lcv3;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    iget-object v1, v1, Lcv3;->d:Lo34;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v1, v0

    .line 12
    :goto_0
    iget v2, p1, Lk14;->q:I

    .line 13
    .line 14
    iget-object v3, p1, Lk14;->n:Loz3;

    .line 15
    .line 16
    iget-object v4, v3, Loz3;->b:Ljava/lang/String;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x1

    .line 20
    const/16 v7, 0x134

    .line 21
    .line 22
    const/16 v8, 0x133

    .line 23
    .line 24
    if-eq v2, v8, :cond_e

    .line 25
    .line 26
    if-eq v2, v7, :cond_e

    .line 27
    .line 28
    const/16 v9, 0x191

    .line 29
    .line 30
    if-eq v2, v9, :cond_d

    .line 31
    .line 32
    const/16 v9, 0x1a5

    .line 33
    .line 34
    if-eq v2, v9, :cond_a

    .line 35
    .line 36
    const/16 p2, 0x1f7

    .line 37
    .line 38
    if-eq v2, p2, :cond_8

    .line 39
    .line 40
    const/16 p2, 0x197

    .line 41
    .line 42
    if-eq v2, p2, :cond_6

    .line 43
    .line 44
    const/16 p2, 0x198

    .line 45
    .line 46
    if-eq v2, p2, :cond_1

    .line 47
    .line 48
    packed-switch v2, :pswitch_data_0

    .line 49
    .line 50
    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :cond_1
    iget-object p0, p0, Lxu;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Lo83;

    .line 56
    .line 57
    iget-boolean p0, p0, Lo83;->e:Z

    .line 58
    .line 59
    if-nez p0, :cond_2

    .line 60
    .line 61
    goto/16 :goto_3

    .line 62
    .line 63
    :cond_2
    iget-object p0, v3, Loz3;->d:Ltz3;

    .line 64
    .line 65
    if-eqz p0, :cond_3

    .line 66
    .line 67
    invoke-virtual {p0}, Ltz3;->isOneShot()Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-eqz p0, :cond_3

    .line 72
    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :cond_3
    iget-object p0, p1, Lk14;->w:Lk14;

    .line 76
    .line 77
    if-eqz p0, :cond_4

    .line 78
    .line 79
    iget p0, p0, Lk14;->q:I

    .line 80
    .line 81
    if-ne p0, p2, :cond_4

    .line 82
    .line 83
    goto/16 :goto_3

    .line 84
    .line 85
    :cond_4
    invoke-static {p1, v5}, Lxu;->d(Lk14;I)I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    if-lez p0, :cond_5

    .line 90
    .line 91
    goto/16 :goto_3

    .line 92
    .line 93
    :cond_5
    iget-object p0, p1, Lk14;->n:Loz3;

    .line 94
    .line 95
    return-object p0

    .line 96
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object p1, v1, Lo34;->b:Ljava/net/Proxy;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    sget-object p2, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    .line 106
    .line 107
    if-ne p1, p2, :cond_7

    .line 108
    .line 109
    iget-object p0, p0, Lxu;->b:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast p0, Lo83;

    .line 112
    .line 113
    iget-object p0, p0, Lo83;->n:Lfz0;

    .line 114
    .line 115
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    return-object v0

    .line 119
    :cond_7
    new-instance p0, Ljava/net/ProtocolException;

    .line 120
    .line 121
    const-string p1, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    .line 122
    .line 123
    invoke-direct {p0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p0

    .line 127
    :cond_8
    iget-object p0, p1, Lk14;->w:Lk14;

    .line 128
    .line 129
    if-eqz p0, :cond_9

    .line 130
    .line 131
    iget p0, p0, Lk14;->q:I

    .line 132
    .line 133
    if-ne p0, p2, :cond_9

    .line 134
    .line 135
    goto/16 :goto_3

    .line 136
    .line 137
    :cond_9
    const p0, 0x7fffffff

    .line 138
    .line 139
    .line 140
    invoke-static {p1, p0}, Lxu;->d(Lk14;I)I

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    if-nez p0, :cond_14

    .line 145
    .line 146
    iget-object p0, p1, Lk14;->n:Loz3;

    .line 147
    .line 148
    return-object p0

    .line 149
    :cond_a
    iget-object p0, v3, Loz3;->d:Ltz3;

    .line 150
    .line 151
    if-eqz p0, :cond_b

    .line 152
    .line 153
    invoke-virtual {p0}, Ltz3;->isOneShot()Z

    .line 154
    .line 155
    .line 156
    move-result p0

    .line 157
    if-eqz p0, :cond_b

    .line 158
    .line 159
    goto/16 :goto_3

    .line 160
    .line 161
    :cond_b
    if-eqz p2, :cond_14

    .line 162
    .line 163
    iget-object p0, p2, Ly10;->e:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast p0, Ls21;

    .line 166
    .line 167
    invoke-interface {p0}, Ls21;->d()Lr34;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-interface {p0}, Lr34;->n()Lf6;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    iget-object p0, p0, Lf6;->h:Lgr1;

    .line 176
    .line 177
    iget-object p0, p0, Lgr1;->d:Ljava/lang/String;

    .line 178
    .line 179
    iget-object v1, p2, Ly10;->f:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v1, Lr21;

    .line 182
    .line 183
    invoke-interface {v1}, Lr21;->h()Lq21;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    invoke-interface {v1}, Lq21;->h()Lo34;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    iget-object v1, v1, Lo34;->a:Lf6;

    .line 192
    .line 193
    iget-object v1, v1, Lf6;->h:Lgr1;

    .line 194
    .line 195
    iget-object v1, v1, Lgr1;->d:Ljava/lang/String;

    .line 196
    .line 197
    invoke-static {p0, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result p0

    .line 201
    if-eqz p0, :cond_c

    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_c
    invoke-virtual {p2}, Ly10;->e()Lcv3;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    monitor-enter p0

    .line 209
    :try_start_0
    iput-boolean v6, p0, Lcv3;->n:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 210
    .line 211
    monitor-exit p0

    .line 212
    iget-object p0, p1, Lk14;->n:Loz3;

    .line 213
    .line 214
    return-object p0

    .line 215
    :catchall_0
    move-exception p1

    .line 216
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 217
    throw p1

    .line 218
    :cond_d
    iget-object p0, p0, Lxu;->b:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast p0, Lo83;

    .line 221
    .line 222
    iget-object p0, p0, Lo83;->g:Lfz0;

    .line 223
    .line 224
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    return-object v0

    .line 228
    :cond_e
    :pswitch_0
    const-string p2, "PROPFIND"

    .line 229
    .line 230
    iget-object p0, p0, Lxu;->b:Ljava/lang/Object;

    .line 231
    .line 232
    check-cast p0, Lo83;

    .line 233
    .line 234
    iget-boolean v1, p0, Lo83;->h:Z

    .line 235
    .line 236
    if-nez v1, :cond_f

    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_f
    const-string v1, "Location"

    .line 240
    .line 241
    iget-object v2, p1, Lk14;->s:Ltl1;

    .line 242
    .line 243
    invoke-virtual {v2, v1}, Ltl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    if-nez v1, :cond_10

    .line 248
    .line 249
    move-object v1, v0

    .line 250
    :cond_10
    iget-object v2, p1, Lk14;->n:Loz3;

    .line 251
    .line 252
    if-nez v1, :cond_11

    .line 253
    .line 254
    goto :goto_3

    .line 255
    :cond_11
    iget-object v3, v2, Loz3;->a:Lgr1;

    .line 256
    .line 257
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    :try_start_2
    new-instance v9, Lfr1;

    .line 261
    .line 262
    invoke-direct {v9}, Lfr1;-><init>()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v9, v3, v1}, Lfr1;->e(Lgr1;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    .line 266
    .line 267
    .line 268
    goto :goto_1

    .line 269
    :catch_0
    move-object v9, v0

    .line 270
    :goto_1
    if-eqz v9, :cond_12

    .line 271
    .line 272
    invoke-virtual {v9}, Lfr1;->b()Lgr1;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    goto :goto_2

    .line 277
    :cond_12
    move-object v1, v0

    .line 278
    :goto_2
    if-nez v1, :cond_13

    .line 279
    .line 280
    goto :goto_3

    .line 281
    :cond_13
    iget-object v3, v1, Lgr1;->a:Ljava/lang/String;

    .line 282
    .line 283
    iget-object v9, v2, Loz3;->a:Lgr1;

    .line 284
    .line 285
    iget-object v9, v9, Lgr1;->a:Ljava/lang/String;

    .line 286
    .line 287
    invoke-static {v3, v9}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    if-nez v3, :cond_15

    .line 292
    .line 293
    iget-boolean p0, p0, Lo83;->i:Z

    .line 294
    .line 295
    if-nez p0, :cond_15

    .line 296
    .line 297
    :cond_14
    :goto_3
    return-object v0

    .line 298
    :cond_15
    invoke-virtual {v2}, Loz3;->a()Lnz3;

    .line 299
    .line 300
    .line 301
    move-result-object p0

    .line 302
    invoke-static {v4}, Lgb;->T(Ljava/lang/String;)Z

    .line 303
    .line 304
    .line 305
    move-result v3

    .line 306
    if-eqz v3, :cond_1a

    .line 307
    .line 308
    iget p1, p1, Lk14;->q:I

    .line 309
    .line 310
    invoke-virtual {v4, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    if-nez v3, :cond_16

    .line 315
    .line 316
    if-eq p1, v7, :cond_16

    .line 317
    .line 318
    if-ne p1, v8, :cond_17

    .line 319
    .line 320
    :cond_16
    move v5, v6

    .line 321
    :cond_17
    invoke-virtual {v4, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result p2

    .line 325
    if-nez p2, :cond_18

    .line 326
    .line 327
    if-eq p1, v7, :cond_18

    .line 328
    .line 329
    if-eq p1, v8, :cond_18

    .line 330
    .line 331
    const-string p1, "GET"

    .line 332
    .line 333
    invoke-virtual {p0, p1, v0}, Lnz3;->b(Ljava/lang/String;Ltz3;)V

    .line 334
    .line 335
    .line 336
    goto :goto_4

    .line 337
    :cond_18
    if-eqz v5, :cond_19

    .line 338
    .line 339
    iget-object v0, v2, Loz3;->d:Ltz3;

    .line 340
    .line 341
    :cond_19
    invoke-virtual {p0, v4, v0}, Lnz3;->b(Ljava/lang/String;Ltz3;)V

    .line 342
    .line 343
    .line 344
    :goto_4
    if-nez v5, :cond_1a

    .line 345
    .line 346
    const-string p1, "Transfer-Encoding"

    .line 347
    .line 348
    iget-object p2, p0, Lnz3;->c:Lsl1;

    .line 349
    .line 350
    invoke-virtual {p2, p1}, Lsl1;->e(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    const-string p1, "Content-Length"

    .line 354
    .line 355
    iget-object p2, p0, Lnz3;->c:Lsl1;

    .line 356
    .line 357
    invoke-virtual {p2, p1}, Lsl1;->e(Ljava/lang/String;)V

    .line 358
    .line 359
    .line 360
    const-string p1, "Content-Type"

    .line 361
    .line 362
    iget-object p2, p0, Lnz3;->c:Lsl1;

    .line 363
    .line 364
    invoke-virtual {p2, p1}, Lsl1;->e(Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    :cond_1a
    iget-object p1, v2, Loz3;->a:Lgr1;

    .line 368
    .line 369
    invoke-static {p1, v1}, Lze5;->a(Lgr1;Lgr1;)Z

    .line 370
    .line 371
    .line 372
    move-result p1

    .line 373
    if-nez p1, :cond_1b

    .line 374
    .line 375
    const-string p1, "Authorization"

    .line 376
    .line 377
    iget-object p2, p0, Lnz3;->c:Lsl1;

    .line 378
    .line 379
    invoke-virtual {p2, p1}, Lsl1;->e(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    :cond_1b
    iput-object v1, p0, Lnz3;->a:Lgr1;

    .line 383
    .line 384
    new-instance p1, Loz3;

    .line 385
    .line 386
    invoke-direct {p1, p0}, Loz3;-><init>(Lnz3;)V

    .line 387
    .line 388
    .line 389
    return-object p1

    .line 390
    nop

    .line 391
    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public c(Ljava/io/IOException;Lbv3;Loz3;Z)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxu;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lo83;

    .line 4
    .line 5
    iget-boolean p0, p0, Lo83;->e:Z

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    if-eqz p4, :cond_2

    .line 11
    .line 12
    iget-object p0, p3, Loz3;->d:Ltz3;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0}, Ltz3;->isOneShot()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-nez p0, :cond_8

    .line 21
    .line 22
    :cond_1
    instance-of p0, p1, Ljava/io/FileNotFoundException;

    .line 23
    .line 24
    if-eqz p0, :cond_2

    .line 25
    .line 26
    goto :goto_2

    .line 27
    :cond_2
    instance-of p0, p1, Ljava/net/ProtocolException;

    .line 28
    .line 29
    if-eqz p0, :cond_3

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_3
    instance-of p0, p1, Ljava/io/InterruptedIOException;

    .line 33
    .line 34
    if-eqz p0, :cond_4

    .line 35
    .line 36
    instance-of p0, p1, Ljava/net/SocketTimeoutException;

    .line 37
    .line 38
    if-eqz p0, :cond_8

    .line 39
    .line 40
    if-nez p4, :cond_8

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    instance-of p0, p1, Ljavax/net/ssl/SSLHandshakeException;

    .line 44
    .line 45
    if-eqz p0, :cond_5

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    instance-of p0, p0, Ljava/security/cert/CertificateException;

    .line 52
    .line 53
    if-eqz p0, :cond_5

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_5
    instance-of p0, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 57
    .line 58
    if-eqz p0, :cond_6

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_6
    :goto_0
    iget-object p0, p2, Lbv3;->B:Ly10;

    .line 62
    .line 63
    if-eqz p0, :cond_8

    .line 64
    .line 65
    iget-boolean p0, p0, Ly10;->c:Z

    .line 66
    .line 67
    const/4 p1, 0x1

    .line 68
    if-ne p0, p1, :cond_8

    .line 69
    .line 70
    iget-object p0, p2, Lbv3;->t:Ls21;

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-interface {p0}, Ls21;->d()Lr34;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    iget-object p2, p2, Lbv3;->B:Ly10;

    .line 80
    .line 81
    if-eqz p2, :cond_7

    .line 82
    .line 83
    invoke-virtual {p2}, Ly10;->e()Lcv3;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    goto :goto_1

    .line 88
    :cond_7
    const/4 p2, 0x0

    .line 89
    :goto_1
    invoke-interface {p0, p2}, Lr34;->m(Lcv3;)Z

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    if-eqz p0, :cond_8

    .line 94
    .line 95
    return p1

    .line 96
    :cond_8
    :goto_2
    const/4 p0, 0x0

    .line 97
    return p0
.end method
