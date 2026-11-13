.class public final synthetic Ldefpackage/ur2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/lang/Object;

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 14
    iput p1, p0, Ldefpackage/ur2;->n:I

    iput-object p2, p0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    iput-object p3, p0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ldefpackage/hh3;Ljava/util/List;Ldefpackage/k03;)V
    .locals 0

    .line 1
    const/16 p1, 0x11

    .line 2
    .line 3
    iput p1, p0, Ldefpackage/ur2;->n:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p3, p0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Runnable;Ldefpackage/ia4;)V
    .locals 1

    .line 15
    const/16 v0, 0x19

    iput v0, p0, Ldefpackage/ur2;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ldefpackage/tn2;Ldefpackage/fr2;Ljava/lang/Runnable;)V
    .locals 0

    .line 13
    const/4 p2, 0x0

    iput p2, p0, Ldefpackage/ur2;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    iput-object p3, p0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Ldefpackage/ur2;->n:I

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/4 v3, 0x4

    .line 7
    const/4 v4, 0x2

    .line 8
    const-wide/16 v5, 0x0

    .line 9
    .line 10
    const/4 v7, 0x3

    .line 11
    const/16 v8, 0x8

    .line 12
    .line 13
    const/4 v9, 0x1

    .line 14
    const/4 v10, 0x0

    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ldefpackage/rf2;

    .line 21
    .line 22
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/lang/String;

    .line 25
    .line 26
    iget-object v1, v1, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Ldefpackage/o55;

    .line 29
    .line 30
    sget-object v2, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 31
    .line 32
    invoke-interface {v1, v0}, Ldefpackage/o55;->c(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_0
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v1, Ldefpackage/rf2;

    .line 39
    .line 40
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ljava/lang/Exception;

    .line 43
    .line 44
    iget-object v1, v1, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, Ldefpackage/o55;

    .line 47
    .line 48
    sget-object v2, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 49
    .line 50
    invoke-interface {v1, v0}, Ldefpackage/o55;->t(Ljava/lang/Exception;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_1
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Ldefpackage/rf2;

    .line 57
    .line 58
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Ldefpackage/s55;

    .line 61
    .line 62
    iget-object v1, v1, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Ldefpackage/o55;

    .line 65
    .line 66
    sget-object v2, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 67
    .line 68
    invoke-interface {v1, v0}, Ldefpackage/o55;->a(Ldefpackage/s55;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_2
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, Ldefpackage/rf2;

    .line 75
    .line 76
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Ldefpackage/h40;

    .line 79
    .line 80
    iget-object v1, v1, Ldefpackage/rf2;->o:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, Ldefpackage/o55;

    .line 83
    .line 84
    sget-object v2, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 85
    .line 86
    invoke-interface {v1, v0}, Ldefpackage/o55;->r(Ldefpackage/h40;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :pswitch_3
    iget-object v1, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, Ljava/lang/Runnable;

    .line 93
    .line 94
    iget-object v0, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 95
    .line 96
    move-object v2, v0

    .line 97
    check-cast v2, Ldefpackage/ia4;

    .line 98
    .line 99
    :try_start_0
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2}, Ldefpackage/ia4;->a()V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :catchall_0
    move-exception v0

    .line 107
    invoke-virtual {v2}, Ldefpackage/ia4;->a()V

    .line 108
    .line 109
    .line 110
    throw v0

    .line 111
    :pswitch_4
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v1, Ldefpackage/na4;

    .line 114
    .line 115
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v0, Ldefpackage/gl4;

    .line 118
    .line 119
    iget-object v1, v1, Ldefpackage/na4;->o:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v1, Ldefpackage/rm3;

    .line 122
    .line 123
    invoke-virtual {v1, v0, v7}, Ldefpackage/rm3;->R(Ldefpackage/gl4;I)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :pswitch_5
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v1, Ldefpackage/ns3;

    .line 130
    .line 131
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v0, Landroid/net/Uri;

    .line 134
    .line 135
    iget-object v2, v1, Ldefpackage/ns3;->p:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v2, Landroid/util/LruCache;

    .line 138
    .line 139
    invoke-virtual {v2, v0}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    if-eqz v2, :cond_0

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_0
    :try_start_1
    iget-object v2, v1, Ldefpackage/ns3;->o:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v2, Landroid/content/Context;

    .line 149
    .line 150
    invoke-static {v2}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Ldefpackage/c04;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {v2}, Ldefpackage/c04;->g()Ldefpackage/vz3;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-virtual {v2, v0}, Ldefpackage/vz3;->N(Landroid/net/Uri;)Ldefpackage/vz3;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    const/16 v3, 0x200

    .line 163
    .line 164
    invoke-virtual {v2, v3, v3}, Ldefpackage/vz3;->R(II)Ldefpackage/yz3;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-virtual {v2}, Ldefpackage/yz3;->get()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    check-cast v2, Landroid/graphics/Bitmap;

    .line 173
    .line 174
    iget-object v1, v1, Ldefpackage/ns3;->p:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast v1, Landroid/util/LruCache;

    .line 177
    .line 178
    invoke-virtual {v1, v0, v2}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 179
    .line 180
    .line 181
    :catch_0
    :goto_0
    return-void

    .line 182
    :pswitch_6
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v1, Ldefpackage/sj4;

    .line 185
    .line 186
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v0, Landroid/graphics/SurfaceTexture;

    .line 189
    .line 190
    iget-object v2, v1, Ldefpackage/sj4;->t:Landroid/graphics/SurfaceTexture;

    .line 191
    .line 192
    iget-object v3, v1, Ldefpackage/sj4;->u:Landroid/view/Surface;

    .line 193
    .line 194
    new-instance v4, Landroid/view/Surface;

    .line 195
    .line 196
    invoke-direct {v4, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    .line 197
    .line 198
    .line 199
    iput-object v0, v1, Ldefpackage/sj4;->t:Landroid/graphics/SurfaceTexture;

    .line 200
    .line 201
    iput-object v4, v1, Ldefpackage/sj4;->u:Landroid/view/Surface;

    .line 202
    .line 203
    iget-object v0, v1, Ldefpackage/sj4;->n:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    if-eqz v1, :cond_1

    .line 214
    .line 215
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    check-cast v1, Ldefpackage/d41;

    .line 220
    .line 221
    iget-object v1, v1, Ldefpackage/d41;->n:Ldefpackage/i41;

    .line 222
    .line 223
    invoke-virtual {v1, v4}, Ldefpackage/i41;->t1(Landroid/view/Surface;)V

    .line 224
    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_1
    if-eqz v2, :cond_2

    .line 228
    .line 229
    invoke-virtual {v2}, Landroid/graphics/SurfaceTexture;->release()V

    .line 230
    .line 231
    .line 232
    :cond_2
    if-eqz v3, :cond_3

    .line 233
    .line 234
    invoke-virtual {v3}, Landroid/view/Surface;->release()V

    .line 235
    .line 236
    .line 237
    :cond_3
    return-void

    .line 238
    :pswitch_7
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast v1, Ldefpackage/qe4;

    .line 241
    .line 242
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v0, Ldefpackage/ic2;

    .line 245
    .line 246
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    sget-object v2, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 250
    .line 251
    iget-object v2, v1, Ldefpackage/qe4;->f:Ljava/util/HashSet;

    .line 252
    .line 253
    invoke-virtual {v2, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-eqz v0, :cond_4

    .line 261
    .line 262
    iget-boolean v0, v1, Ldefpackage/qe4;->i:Z

    .line 263
    .line 264
    if-nez v0, :cond_4

    .line 265
    .line 266
    invoke-virtual {v1}, Ldefpackage/qe4;->i1()Ldefpackage/pe4;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    invoke-virtual {v1, v0, v10, v10}, Ldefpackage/qe4;->D1(Ldefpackage/pe4;ZZ)V

    .line 271
    .line 272
    .line 273
    :cond_4
    return-void

    .line 274
    :pswitch_8
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 275
    .line 276
    move-object v12, v1

    .line 277
    check-cast v12, Ljava/lang/String;

    .line 278
    .line 279
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 280
    .line 281
    move-object v1, v0

    .line 282
    check-cast v1, Lcom/eddyizm/tempus/ui/fragment/SearchFragment;

    .line 283
    .line 284
    new-instance v2, Ljava/util/ArrayList;

    .line 285
    .line 286
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 287
    .line 288
    .line 289
    move v0, v9

    .line 290
    move v14, v10

    .line 291
    :goto_2
    if-eqz v0, :cond_7

    .line 292
    .line 293
    :try_start_2
    invoke-static {v10}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    iget-object v3, v0, Ldefpackage/pn4;->g:Ldefpackage/hd5;

    .line 298
    .line 299
    if-nez v3, :cond_5

    .line 300
    .line 301
    new-instance v3, Ldefpackage/hd5;

    .line 302
    .line 303
    invoke-direct {v3, v0}, Ldefpackage/hd5;-><init>(Ldefpackage/pn4;)V

    .line 304
    .line 305
    .line 306
    iput-object v3, v0, Ldefpackage/pn4;->g:Ldefpackage/hd5;

    .line 307
    .line 308
    :cond_5
    iget-object v11, v0, Ldefpackage/pn4;->g:Ldefpackage/hd5;

    .line 309
    .line 310
    const/4 v15, 0x0

    .line 311
    const/16 v16, 0x0

    .line 312
    .line 313
    const/16 v13, 0x3e8

    .line 314
    .line 315
    invoke-virtual/range {v11 .. v16}, Ldefpackage/hd5;->m(Ljava/lang/String;IIII)Lretrofit2/Call;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    invoke-interface {v0}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    invoke-virtual {v0}, Lretrofit2/Response;->isSuccessful()Z

    .line 324
    .line 325
    .line 326
    move-result v3

    .line 327
    if-eqz v3, :cond_6

    .line 328
    .line 329
    invoke-virtual {v0}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v3

    .line 333
    if-eqz v3, :cond_6

    .line 334
    .line 335
    invoke-virtual {v0}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    check-cast v0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 340
    .line 341
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getSearchResult3()Lcom/eddyizm/tempus/subsonic/models/SearchResult3;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    if-eqz v0, :cond_6

    .line 350
    .line 351
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SearchResult3;->getSongs()Ljava/util/List;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    if-eqz v3, :cond_6

    .line 356
    .line 357
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SearchResult3;->getSongs()Ljava/util/List;

    .line 358
    .line 359
    .line 360
    move-result-object v3

    .line 361
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    if-nez v3, :cond_6

    .line 366
    .line 367
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SearchResult3;->getSongs()Ljava/util/List;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 372
    .line 373
    .line 374
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 375
    .line 376
    .line 377
    move-result v3

    .line 378
    add-int/2addr v14, v3

    .line 379
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 380
    .line 381
    .line 382
    move-result v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 383
    if-ne v0, v13, :cond_6

    .line 384
    .line 385
    move v0, v9

    .line 386
    goto :goto_2

    .line 387
    :catch_1
    move-exception v0

    .line 388
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 389
    .line 390
    .line 391
    :cond_6
    move v0, v10

    .line 392
    goto :goto_2

    .line 393
    :cond_7
    new-instance v15, Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 394
    .line 395
    const-string v0, "allsongs"

    .line 396
    .line 397
    invoke-direct {v15, v0, v2}, Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    invoke-virtual {v15, v0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setSongCount(I)V

    .line 405
    .line 406
    .line 407
    new-instance v0, Ljava/util/ArrayList;

    .line 408
    .line 409
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 410
    .line 411
    .line 412
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 416
    .line 417
    .line 418
    move-result v3

    .line 419
    :cond_8
    :goto_3
    if-ge v10, v3, :cond_9

    .line 420
    .line 421
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v4

    .line 425
    add-int/lit8 v10, v10, 0x1

    .line 426
    .line 427
    check-cast v4, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 428
    .line 429
    if-eqz v4, :cond_8

    .line 430
    .line 431
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDuration()Ljava/lang/Integer;

    .line 432
    .line 433
    .line 434
    move-result-object v7

    .line 435
    if-eqz v7, :cond_8

    .line 436
    .line 437
    invoke-virtual {v4}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDuration()Ljava/lang/Integer;

    .line 438
    .line 439
    .line 440
    move-result-object v4

    .line 441
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 442
    .line 443
    .line 444
    move-result v4

    .line 445
    int-to-long v7, v4

    .line 446
    add-long/2addr v5, v7

    .line 447
    goto :goto_3

    .line 448
    :cond_9
    invoke-virtual {v15, v5, v6}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->setDuration(J)V

    .line 449
    .line 450
    .line 451
    new-instance v3, Landroid/os/Handler;

    .line 452
    .line 453
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 454
    .line 455
    .line 456
    move-result-object v4

    .line 457
    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 458
    .line 459
    .line 460
    new-instance v13, Ldefpackage/t6;

    .line 461
    .line 462
    const/16 v18, 0x1d

    .line 463
    .line 464
    move-object/from16 v17, v0

    .line 465
    .line 466
    move-object v14, v1

    .line 467
    move-object/from16 v16, v2

    .line 468
    .line 469
    invoke-direct/range {v13 .. v18}, Ldefpackage/t6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v3, v13}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 473
    .line 474
    .line 475
    return-void

    .line 476
    :pswitch_9
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 477
    .line 478
    check-cast v1, Ldefpackage/au0;

    .line 479
    .line 480
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 481
    .line 482
    check-cast v0, Landroid/graphics/Typeface;

    .line 483
    .line 484
    invoke-virtual {v1, v0}, Ldefpackage/au0;->N(Landroid/graphics/Typeface;)V

    .line 485
    .line 486
    .line 487
    return-void

    .line 488
    :pswitch_a
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 489
    .line 490
    check-cast v1, Ldefpackage/gn2;

    .line 491
    .line 492
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 493
    .line 494
    check-cast v0, Ljava/util/ArrayList;

    .line 495
    .line 496
    const-string v2, "Late prefetch for current track "

    .line 497
    .line 498
    const-string v3, "ReplayGainUtil"

    .line 499
    .line 500
    sget-object v4, Ldefpackage/jz3;->f:Ljava/lang/ref/WeakReference;

    .line 501
    .line 502
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v4

    .line 506
    check-cast v4, Ldefpackage/qi3;

    .line 507
    .line 508
    if-nez v4, :cond_a

    .line 509
    .line 510
    goto :goto_5

    .line 511
    :cond_a
    invoke-interface {v4}, Ldefpackage/qi3;->a()Ldefpackage/gn2;

    .line 512
    .line 513
    .line 514
    move-result-object v5

    .line 515
    if-eqz v5, :cond_c

    .line 516
    .line 517
    iget-object v6, v1, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 518
    .line 519
    iget-object v5, v5, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 520
    .line 521
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 522
    .line 523
    .line 524
    move-result v5

    .line 525
    if-eqz v5, :cond_c

    .line 526
    .line 527
    invoke-static {v4, v0}, Ldefpackage/jz3;->k(Ldefpackage/qi3;Ljava/util/List;)F

    .line 528
    .line 529
    .line 530
    move-result v5

    .line 531
    const/4 v6, 0x0

    .line 532
    cmpl-float v6, v5, v6

    .line 533
    .line 534
    if-eqz v6, :cond_b

    .line 535
    .line 536
    invoke-static {v4, v0}, Ldefpackage/jz3;->l(Ldefpackage/qi3;Ljava/util/List;)F

    .line 537
    .line 538
    .line 539
    move-result v0

    .line 540
    invoke-static {v5, v0}, Ldefpackage/jz3;->c(FF)F

    .line 541
    .line 542
    .line 543
    move-result v0

    .line 544
    new-instance v5, Ljava/lang/StringBuilder;

    .line 545
    .line 546
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    iget-object v1, v1, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 550
    .line 551
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    const-string v1, " \u2014 applying gain immediately totalGain="

    .line 555
    .line 556
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v1

    .line 566
    invoke-static {v3, v1}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 567
    .line 568
    .line 569
    sget-object v1, Ldefpackage/jz3;->e:Ldefpackage/iz3;

    .line 570
    .line 571
    invoke-virtual {v1, v0}, Ldefpackage/iz3;->n(F)V

    .line 572
    .line 573
    .line 574
    goto :goto_4

    .line 575
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    .line 576
    .line 577
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    iget-object v1, v1, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 581
    .line 582
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 583
    .line 584
    .line 585
    const-string v1, " \u2014 empty gains, skipping setGainImmediate"

    .line 586
    .line 587
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 588
    .line 589
    .line 590
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    invoke-static {v3, v0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 595
    .line 596
    .line 597
    :cond_c
    :goto_4
    invoke-static {v4}, Ldefpackage/jz3;->h(Ldefpackage/qi3;)V

    .line 598
    .line 599
    .line 600
    :goto_5
    return-void

    .line 601
    :pswitch_b
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 602
    .line 603
    check-cast v1, Ljava/util/List;

    .line 604
    .line 605
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 606
    .line 607
    check-cast v0, Ldefpackage/k03;

    .line 608
    .line 609
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 610
    .line 611
    .line 612
    move-result-object v2

    .line 613
    invoke-virtual {v2}, Lcom/eddyizm/tempus/database/AppDatabase;->z()Ldefpackage/c12;

    .line 614
    .line 615
    .line 616
    move-result-object v2

    .line 617
    iget-object v2, v2, Ldefpackage/c12;->o:Ljava/lang/Object;

    .line 618
    .line 619
    check-cast v2, Lcom/eddyizm/tempus/database/AppDatabase_Impl;

    .line 620
    .line 621
    new-instance v3, Ldefpackage/or1;

    .line 622
    .line 623
    const/16 v5, 0x1a

    .line 624
    .line 625
    invoke-direct {v3, v5}, Ldefpackage/or1;-><init>(I)V

    .line 626
    .line 627
    .line 628
    invoke-static {v2, v9, v10, v3}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v2

    .line 632
    check-cast v2, Ljava/util/List;

    .line 633
    .line 634
    invoke-interface {v2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 635
    .line 636
    .line 637
    move-result-object v2

    .line 638
    new-instance v3, Ldefpackage/hu3;

    .line 639
    .line 640
    invoke-direct {v3, v10}, Ldefpackage/hu3;-><init>(I)V

    .line 641
    .line 642
    .line 643
    invoke-interface {v2, v3}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 644
    .line 645
    .line 646
    move-result-object v2

    .line 647
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 648
    .line 649
    .line 650
    move-result-object v3

    .line 651
    invoke-interface {v2, v3}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v2

    .line 655
    check-cast v2, Ljava/util/List;

    .line 656
    .line 657
    new-instance v3, Ljava/util/ArrayList;

    .line 658
    .line 659
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 660
    .line 661
    .line 662
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 663
    .line 664
    .line 665
    new-instance v1, Ldefpackage/hu3;

    .line 666
    .line 667
    invoke-direct {v1, v4}, Ldefpackage/hu3;-><init>(I)V

    .line 668
    .line 669
    .line 670
    sget-object v2, Ljava/lang/String;->CASE_INSENSITIVE_ORDER:Ljava/util/Comparator;

    .line 671
    .line 672
    invoke-static {v1, v2}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 673
    .line 674
    .line 675
    move-result-object v1

    .line 676
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->sort(Ljava/util/Comparator;)V

    .line 677
    .line 678
    .line 679
    invoke-virtual {v0, v3}, Ldefpackage/ad2;->i(Ljava/lang/Object;)V

    .line 680
    .line 681
    .line 682
    return-void

    .line 683
    :pswitch_c
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 684
    .line 685
    check-cast v1, Ljava/lang/String;

    .line 686
    .line 687
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 688
    .line 689
    check-cast v0, Ldefpackage/fu3;

    .line 690
    .line 691
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 692
    .line 693
    .line 694
    move-result-object v2

    .line 695
    invoke-virtual {v2}, Lcom/eddyizm/tempus/database/AppDatabase;->z()Ldefpackage/c12;

    .line 696
    .line 697
    .line 698
    move-result-object v2

    .line 699
    iget-object v2, v2, Ldefpackage/c12;->o:Ljava/lang/Object;

    .line 700
    .line 701
    check-cast v2, Lcom/eddyizm/tempus/database/AppDatabase_Impl;

    .line 702
    .line 703
    new-instance v4, Ldefpackage/rs0;

    .line 704
    .line 705
    invoke-direct {v4, v8, v1}, Ldefpackage/rs0;-><init>(ILjava/lang/String;)V

    .line 706
    .line 707
    .line 708
    invoke-static {v2, v10, v9, v4}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    sget-object v2, Ldefpackage/xt3;->a:Ljava/util/concurrent/ExecutorService;

    .line 712
    .line 713
    new-instance v4, Ldefpackage/kt1;

    .line 714
    .line 715
    invoke-direct {v4, v3, v1}, Ldefpackage/kt1;-><init>(ILjava/lang/String;)V

    .line 716
    .line 717
    .line 718
    invoke-interface {v2, v4}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 719
    .line 720
    .line 721
    new-instance v1, Landroid/os/Handler;

    .line 722
    .line 723
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 724
    .line 725
    .line 726
    move-result-object v2

    .line 727
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 728
    .line 729
    .line 730
    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 731
    .line 732
    .line 733
    return-void

    .line 734
    :pswitch_d
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 735
    .line 736
    check-cast v1, Ljava/lang/String;

    .line 737
    .line 738
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 739
    .line 740
    check-cast v0, Ljava/lang/String;

    .line 741
    .line 742
    :try_start_3
    invoke-static {v1}, Ldefpackage/xt3;->e(Ljava/lang/String;)Ljava/io/File;

    .line 743
    .line 744
    .line 745
    move-result-object v2

    .line 746
    const-string v3, "http://"

    .line 747
    .line 748
    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 749
    .line 750
    .line 751
    move-result v3

    .line 752
    if-nez v3, :cond_e

    .line 753
    .line 754
    const-string v3, "https://"

    .line 755
    .line 756
    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 757
    .line 758
    .line 759
    move-result v3

    .line 760
    if-eqz v3, :cond_d

    .line 761
    .line 762
    goto :goto_6

    .line 763
    :cond_d
    invoke-static {}, Ldefpackage/ud3;->t()I

    .line 764
    .line 765
    .line 766
    move-result v3

    .line 767
    invoke-static {v3, v0}, Ldefpackage/wg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    :cond_e
    :goto_6
    const-string v3, "/rest/getCoverArt"

    .line 772
    .line 773
    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 774
    .line 775
    .line 776
    move-result v3

    .line 777
    if-eqz v3, :cond_f

    .line 778
    .line 779
    invoke-static {v2, v0}, Ldefpackage/xt3;->d(Ljava/io/File;Ljava/lang/String;)V

    .line 780
    .line 781
    .line 782
    goto :goto_8

    .line 783
    :catch_2
    move-exception v0

    .line 784
    goto :goto_7

    .line 785
    :cond_f
    invoke-static {v2, v0}, Ldefpackage/xt3;->c(Ljava/io/File;Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 786
    .line 787
    .line 788
    goto :goto_8

    .line 789
    :goto_7
    const-string v2, "RadioCoverArtDownloader"

    .line 790
    .line 791
    new-instance v3, Ljava/lang/StringBuilder;

    .line 792
    .line 793
    const-string v4, "Failed to download cover art for station "

    .line 794
    .line 795
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 796
    .line 797
    .line 798
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 799
    .line 800
    .line 801
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 802
    .line 803
    .line 804
    move-result-object v1

    .line 805
    invoke-static {v2, v1, v0}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 806
    .line 807
    .line 808
    :goto_8
    return-void

    .line 809
    :pswitch_e
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 810
    .line 811
    check-cast v1, Ldefpackage/vs3;

    .line 812
    .line 813
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 814
    .line 815
    check-cast v0, Ljava/lang/String;

    .line 816
    .line 817
    iget-object v1, v1, Ldefpackage/vs3;->a:Ldefpackage/ns3;

    .line 818
    .line 819
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 820
    .line 821
    .line 822
    move-result-wide v2

    .line 823
    iget-object v1, v1, Ldefpackage/ns3;->o:Ljava/lang/Object;

    .line 824
    .line 825
    check-cast v1, Ldefpackage/s24;

    .line 826
    .line 827
    new-instance v4, Ldefpackage/jl3;

    .line 828
    .line 829
    invoke-direct {v4, v9, v2, v3, v0}, Ldefpackage/jl3;-><init>(IJLjava/lang/String;)V

    .line 830
    .line 831
    .line 832
    invoke-static {v1, v10, v9, v4}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    return-void

    .line 836
    :pswitch_f
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 837
    .line 838
    check-cast v1, Ldefpackage/hr3;

    .line 839
    .line 840
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 841
    .line 842
    check-cast v0, Ldefpackage/m84;

    .line 843
    .line 844
    invoke-virtual {v1, v0}, Ldefpackage/hr3;->E(Ldefpackage/m84;)V

    .line 845
    .line 846
    .line 847
    return-void

    .line 848
    :pswitch_10
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 849
    .line 850
    check-cast v1, Ldefpackage/pq3;

    .line 851
    .line 852
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 853
    .line 854
    check-cast v0, Ldefpackage/rc5;

    .line 855
    .line 856
    iget-object v2, v1, Ldefpackage/pq3;->k:Ljava/lang/Object;

    .line 857
    .line 858
    monitor-enter v2

    .line 859
    :try_start_4
    iget-object v1, v1, Ldefpackage/pq3;->j:Ljava/util/ArrayList;

    .line 860
    .line 861
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 862
    .line 863
    .line 864
    move-result v3

    .line 865
    move v4, v10

    .line 866
    :goto_9
    if-ge v4, v3, :cond_10

    .line 867
    .line 868
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 869
    .line 870
    .line 871
    move-result-object v5

    .line 872
    add-int/lit8 v4, v4, 0x1

    .line 873
    .line 874
    check-cast v5, Ldefpackage/w21;

    .line 875
    .line 876
    invoke-interface {v5, v0, v10}, Ldefpackage/w21;->b(Ldefpackage/rc5;Z)V

    .line 877
    .line 878
    .line 879
    goto :goto_9

    .line 880
    :catchall_1
    move-exception v0

    .line 881
    goto :goto_a

    .line 882
    :cond_10
    monitor-exit v2

    .line 883
    return-void

    .line 884
    :goto_a
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 885
    throw v0

    .line 886
    :pswitch_11
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 887
    .line 888
    check-cast v1, Ldefpackage/mm3;

    .line 889
    .line 890
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 891
    .line 892
    check-cast v0, Ljava/util/List;

    .line 893
    .line 894
    const-string v2, "PlaylistRepository"

    .line 895
    .line 896
    iget-object v3, v1, Ldefpackage/mm3;->b:Ldefpackage/ml3;

    .line 897
    .line 898
    iget-object v4, v3, Ldefpackage/ml3;->a:Ljava/lang/Object;

    .line 899
    .line 900
    check-cast v4, Ldefpackage/s24;

    .line 901
    .line 902
    new-instance v5, Ldefpackage/kl3;

    .line 903
    .line 904
    invoke-direct {v5, v10, v3}, Ldefpackage/kl3;-><init>(ILjava/lang/Object;)V

    .line 905
    .line 906
    .line 907
    invoke-static {v4, v9, v10, v5}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    move-result-object v5

    .line 911
    check-cast v5, Ljava/util/List;

    .line 912
    .line 913
    if-eqz v5, :cond_14

    .line 914
    .line 915
    new-instance v6, Ljava/util/HashSet;

    .line 916
    .line 917
    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 918
    .line 919
    .line 920
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 921
    .line 922
    .line 923
    move-result-object v7

    .line 924
    :goto_b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 925
    .line 926
    .line 927
    move-result v8

    .line 928
    if-eqz v8, :cond_11

    .line 929
    .line 930
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 931
    .line 932
    .line 933
    move-result-object v8

    .line 934
    check-cast v8, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 935
    .line 936
    invoke-virtual {v8}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    move-result-object v8

    .line 940
    invoke-virtual {v6, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 941
    .line 942
    .line 943
    goto :goto_b

    .line 944
    :cond_11
    invoke-static {}, Ldefpackage/ud3;->D()Ljava/lang/String;

    .line 945
    .line 946
    .line 947
    move-result-object v7

    .line 948
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 949
    .line 950
    .line 951
    move-result-object v5

    .line 952
    :cond_12
    :goto_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 953
    .line 954
    .line 955
    move-result v8

    .line 956
    if-eqz v8, :cond_14

    .line 957
    .line 958
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    move-result-object v8

    .line 962
    check-cast v8, Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 963
    .line 964
    invoke-virtual {v8}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 965
    .line 966
    .line 967
    move-result-object v11

    .line 968
    invoke-virtual {v6, v11}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 969
    .line 970
    .line 971
    move-result v11

    .line 972
    if-nez v11, :cond_12

    .line 973
    .line 974
    iget-object v11, v1, Ldefpackage/mm3;->c:Ldefpackage/rm3;

    .line 975
    .line 976
    invoke-virtual {v8}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 977
    .line 978
    .line 979
    move-result-object v12

    .line 980
    invoke-virtual {v11, v12}, Ldefpackage/rm3;->B(Ljava/lang/String;)V

    .line 981
    .line 982
    .line 983
    iget-object v11, v1, Ldefpackage/mm3;->a:Ldefpackage/hg3;

    .line 984
    .line 985
    invoke-virtual {v8}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 986
    .line 987
    .line 988
    move-result-object v12

    .line 989
    iget-object v11, v11, Ldefpackage/hg3;->o:Ljava/lang/Object;

    .line 990
    .line 991
    check-cast v11, Ldefpackage/s24;

    .line 992
    .line 993
    new-instance v13, Ldefpackage/rs0;

    .line 994
    .line 995
    const/16 v14, 0xb

    .line 996
    .line 997
    invoke-direct {v13, v14, v12}, Ldefpackage/rs0;-><init>(ILjava/lang/String;)V

    .line 998
    .line 999
    .line 1000
    invoke-static {v11, v10, v9, v13}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 1001
    .line 1002
    .line 1003
    if-eqz v7, :cond_13

    .line 1004
    .line 1005
    iget-object v11, v1, Ldefpackage/mm3;->d:Ldefpackage/qp4;

    .line 1006
    .line 1007
    invoke-virtual {v8}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v12

    .line 1011
    invoke-virtual {v11, v12, v7}, Ldefpackage/qp4;->o(Ljava/lang/String;Ljava/lang/String;)V

    .line 1012
    .line 1013
    .line 1014
    :cond_13
    new-instance v11, Ldefpackage/hl3;

    .line 1015
    .line 1016
    invoke-direct {v11, v3, v8, v9}, Ldefpackage/hl3;-><init>(Ldefpackage/ml3;Lcom/eddyizm/tempus/subsonic/models/Playlist;I)V

    .line 1017
    .line 1018
    .line 1019
    invoke-static {v4, v10, v9, v11}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 1020
    .line 1021
    .line 1022
    new-instance v11, Ljava/lang/StringBuilder;

    .line 1023
    .line 1024
    const-string v12, "Removed orphaned playlist "

    .line 1025
    .line 1026
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual {v8}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v8

    .line 1033
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1034
    .line 1035
    .line 1036
    const-string v8, " from local DB."

    .line 1037
    .line 1038
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v8

    .line 1045
    invoke-static {v2, v8}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1046
    .line 1047
    .line 1048
    goto :goto_c

    .line 1049
    :cond_14
    new-instance v1, Ldefpackage/o;

    .line 1050
    .line 1051
    const/16 v5, 0x16

    .line 1052
    .line 1053
    invoke-direct {v1, v5, v3, v0}, Ldefpackage/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1054
    .line 1055
    .line 1056
    invoke-static {v4, v10, v9, v1}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 1057
    .line 1058
    .line 1059
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1060
    .line 1061
    const-string v3, "Cached "

    .line 1062
    .line 1063
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1064
    .line 1065
    .line 1066
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1067
    .line 1068
    .line 1069
    move-result v0

    .line 1070
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1071
    .line 1072
    .line 1073
    const-string v0, " playlists to local DB."

    .line 1074
    .line 1075
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1076
    .line 1077
    .line 1078
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v0

    .line 1082
    invoke-static {v2, v0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1083
    .line 1084
    .line 1085
    return-void

    .line 1086
    :pswitch_12
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 1087
    .line 1088
    check-cast v1, Ldefpackage/yk3;

    .line 1089
    .line 1090
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 1091
    .line 1092
    check-cast v0, Ldefpackage/xk3;

    .line 1093
    .line 1094
    :try_start_5
    iget-object v2, v1, Ldefpackage/yk3;->r:Ldefpackage/bl2;

    .line 1095
    .line 1096
    invoke-virtual {v2}, Ldefpackage/u0;->get()Ljava/lang/Object;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v2

    .line 1100
    check-cast v2, Ldefpackage/bj2;

    .line 1101
    .line 1102
    invoke-virtual {v0}, Ldefpackage/cx3;->c()I

    .line 1103
    .line 1104
    .line 1105
    move-result v0

    .line 1106
    iget-object v3, v1, Ldefpackage/yk3;->s:Ljava/util/List;

    .line 1107
    .line 1108
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v3

    .line 1112
    check-cast v3, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 1113
    .line 1114
    iget-object v4, v1, Ldefpackage/yk3;->t:Ljava/lang/String;

    .line 1115
    .line 1116
    if-eqz v4, :cond_16

    .line 1117
    .line 1118
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v3

    .line 1122
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1123
    .line 1124
    .line 1125
    move-result v3

    .line 1126
    if-eqz v3, :cond_16

    .line 1127
    .line 1128
    iget-boolean v0, v1, Ldefpackage/yk3;->u:Z

    .line 1129
    .line 1130
    if-eqz v0, :cond_15

    .line 1131
    .line 1132
    invoke-virtual {v2}, Ldefpackage/sk2;->c()V

    .line 1133
    .line 1134
    .line 1135
    goto :goto_d

    .line 1136
    :cond_15
    invoke-virtual {v2}, Ldefpackage/sk2;->m0()V

    .line 1137
    .line 1138
    .line 1139
    goto :goto_d

    .line 1140
    :cond_16
    invoke-virtual {v2, v0, v5, v6}, Ldefpackage/sk2;->n(IJ)V

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual {v2}, Ldefpackage/sk2;->m0()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    .line 1144
    .line 1145
    .line 1146
    goto :goto_d

    .line 1147
    :catch_3
    move-exception v0

    .line 1148
    const-string v1, "PlayerSongQueueAdapter"

    .line 1149
    .line 1150
    const-string v2, "Error obtaining MediaBrowser"

    .line 1151
    .line 1152
    invoke-static {v1, v2, v0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1153
    .line 1154
    .line 1155
    :goto_d
    return-void

    .line 1156
    :pswitch_13
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 1157
    .line 1158
    check-cast v1, Ldefpackage/bl2;

    .line 1159
    .line 1160
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 1161
    .line 1162
    check-cast v0, Ldefpackage/hk3;

    .line 1163
    .line 1164
    :try_start_6
    invoke-virtual {v1}, Ldefpackage/u0;->get()Ljava/lang/Object;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v1

    .line 1168
    check-cast v1, Ldefpackage/bj2;

    .line 1169
    .line 1170
    iput-object v1, v0, Ldefpackage/hk3;->o0:Ldefpackage/bj2;

    .line 1171
    .line 1172
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v1}, Ldefpackage/sk2;->K0()Ldefpackage/do2;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v2

    .line 1179
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1180
    .line 1181
    .line 1182
    invoke-virtual {v1}, Ldefpackage/sk2;->o0()I

    .line 1183
    .line 1184
    .line 1185
    move-result v3

    .line 1186
    invoke-virtual {v0, v2, v3}, Ldefpackage/hk3;->m0(Ldefpackage/do2;I)V

    .line 1187
    .line 1188
    .line 1189
    new-instance v2, Ldefpackage/gk3;

    .line 1190
    .line 1191
    invoke-direct {v2, v0, v1}, Ldefpackage/gk3;-><init>(Ldefpackage/hk3;Ldefpackage/bj2;)V

    .line 1192
    .line 1193
    .line 1194
    invoke-virtual {v1, v2}, Ldefpackage/sk2;->v(Ldefpackage/oi3;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    .line 1195
    .line 1196
    .line 1197
    goto :goto_e

    .line 1198
    :catch_4
    move-exception v0

    .line 1199
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1200
    .line 1201
    .line 1202
    :goto_e
    return-void

    .line 1203
    :pswitch_14
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 1204
    .line 1205
    check-cast v1, Ldefpackage/xi3;

    .line 1206
    .line 1207
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 1208
    .line 1209
    check-cast v0, Ldefpackage/bj2;

    .line 1210
    .line 1211
    invoke-virtual {v1, v0}, Ldefpackage/xi3;->n0(Ldefpackage/bj2;)V

    .line 1212
    .line 1213
    .line 1214
    iget-object v0, v1, Ldefpackage/xi3;->r0:Landroid/os/Handler;

    .line 1215
    .line 1216
    iget-object v1, v1, Ldefpackage/xi3;->s0:Ldefpackage/ur2;

    .line 1217
    .line 1218
    const-wide/16 v2, 0x3e8

    .line 1219
    .line 1220
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1221
    .line 1222
    .line 1223
    return-void

    .line 1224
    :pswitch_15
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 1225
    .line 1226
    check-cast v1, Ldefpackage/v9;

    .line 1227
    .line 1228
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 1229
    .line 1230
    check-cast v0, Landroid/content/Context;

    .line 1231
    .line 1232
    iget-object v1, v1, Ldefpackage/v9;->b:Ljava/lang/Object;

    .line 1233
    .line 1234
    check-cast v1, Ldefpackage/v53;

    .line 1235
    .line 1236
    const-string v2, "connectivity"

    .line 1237
    .line 1238
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v2

    .line 1242
    check-cast v2, Landroid/net/ConnectivityManager;

    .line 1243
    .line 1244
    const/4 v5, 0x5

    .line 1245
    if-nez v2, :cond_18

    .line 1246
    .line 1247
    :catch_5
    :cond_17
    move v3, v10

    .line 1248
    goto :goto_10

    .line 1249
    :cond_18
    :try_start_7
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v2
    :try_end_7
    .catch Ljava/lang/SecurityException; {:try_start_7 .. :try_end_7} :catch_5

    .line 1253
    if-eqz v2, :cond_1e

    .line 1254
    .line 1255
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 1256
    .line 1257
    .line 1258
    move-result v6

    .line 1259
    if-nez v6, :cond_19

    .line 1260
    .line 1261
    goto :goto_f

    .line 1262
    :cond_19
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getType()I

    .line 1263
    .line 1264
    .line 1265
    move-result v6

    .line 1266
    const/16 v11, 0x9

    .line 1267
    .line 1268
    const/4 v12, 0x6

    .line 1269
    if-eqz v6, :cond_1d

    .line 1270
    .line 1271
    if-eq v6, v9, :cond_1c

    .line 1272
    .line 1273
    if-eq v6, v3, :cond_1d

    .line 1274
    .line 1275
    if-eq v6, v5, :cond_1d

    .line 1276
    .line 1277
    if-eq v6, v12, :cond_1b

    .line 1278
    .line 1279
    if-eq v6, v11, :cond_1a

    .line 1280
    .line 1281
    move v3, v8

    .line 1282
    goto :goto_10

    .line 1283
    :cond_1a
    const/4 v3, 0x7

    .line 1284
    goto :goto_10

    .line 1285
    :cond_1b
    :pswitch_16
    move v3, v5

    .line 1286
    goto :goto_10

    .line 1287
    :cond_1c
    :pswitch_17
    move v3, v4

    .line 1288
    goto :goto_10

    .line 1289
    :cond_1d
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getSubtype()I

    .line 1290
    .line 1291
    .line 1292
    move-result v2

    .line 1293
    packed-switch v2, :pswitch_data_1

    .line 1294
    .line 1295
    .line 1296
    :pswitch_18
    move v3, v12

    .line 1297
    goto :goto_10

    .line 1298
    :pswitch_19
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1299
    .line 1300
    const/16 v3, 0x1d

    .line 1301
    .line 1302
    if-lt v2, v3, :cond_17

    .line 1303
    .line 1304
    move v3, v11

    .line 1305
    goto :goto_10

    .line 1306
    :pswitch_1a
    move v3, v7

    .line 1307
    goto :goto_10

    .line 1308
    :cond_1e
    :goto_f
    move v3, v9

    .line 1309
    :goto_10
    :pswitch_1b
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1310
    .line 1311
    const/16 v4, 0x1f

    .line 1312
    .line 1313
    if-lt v2, v4, :cond_1f

    .line 1314
    .line 1315
    if-ne v3, v5, :cond_1f

    .line 1316
    .line 1317
    :try_start_8
    const-string v2, "phone"

    .line 1318
    .line 1319
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1320
    .line 1321
    .line 1322
    move-result-object v0

    .line 1323
    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 1324
    .line 1325
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1326
    .line 1327
    .line 1328
    new-instance v2, Ldefpackage/t53;

    .line 1329
    .line 1330
    invoke-direct {v2, v1}, Ldefpackage/t53;-><init>(Ldefpackage/v53;)V

    .line 1331
    .line 1332
    .line 1333
    iget-object v3, v1, Ldefpackage/v53;->a:Ljava/util/concurrent/Executor;

    .line 1334
    .line 1335
    invoke-static {v0, v3, v2}, Ldefpackage/go2;->t(Landroid/telephony/TelephonyManager;Ljava/util/concurrent/Executor;Ldefpackage/t53;)V

    .line 1336
    .line 1337
    .line 1338
    invoke-static {v0, v2}, Ldefpackage/go2;->s(Landroid/telephony/TelephonyManager;Ldefpackage/t53;)V
    :try_end_8
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_6

    .line 1339
    .line 1340
    .line 1341
    goto :goto_11

    .line 1342
    :catch_6
    invoke-virtual {v1, v5}, Ldefpackage/v53;->c(I)V

    .line 1343
    .line 1344
    .line 1345
    goto :goto_11

    .line 1346
    :cond_1f
    invoke-virtual {v1, v3}, Ldefpackage/v53;->c(I)V

    .line 1347
    .line 1348
    .line 1349
    :goto_11
    return-void

    .line 1350
    :pswitch_1c
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 1351
    .line 1352
    check-cast v1, Ldefpackage/v53;

    .line 1353
    .line 1354
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 1355
    .line 1356
    check-cast v0, Landroid/content/Context;

    .line 1357
    .line 1358
    new-instance v2, Landroid/content/IntentFilter;

    .line 1359
    .line 1360
    invoke-direct {v2}, Landroid/content/IntentFilter;-><init>()V

    .line 1361
    .line 1362
    .line 1363
    const-string v3, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 1364
    .line 1365
    invoke-virtual {v2, v3}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 1366
    .line 1367
    .line 1368
    new-instance v3, Ldefpackage/v9;

    .line 1369
    .line 1370
    invoke-direct {v3, v8, v1}, Ldefpackage/v9;-><init>(ILjava/lang/Object;)V

    .line 1371
    .line 1372
    .line 1373
    invoke-virtual {v0, v3, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 1374
    .line 1375
    .line 1376
    return-void

    .line 1377
    :pswitch_1d
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 1378
    .line 1379
    check-cast v1, Ldefpackage/wc0;

    .line 1380
    .line 1381
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 1382
    .line 1383
    check-cast v0, Ldefpackage/st2;

    .line 1384
    .line 1385
    invoke-interface {v1, v0}, Ldefpackage/wc0;->accept(Ljava/lang/Object;)V

    .line 1386
    .line 1387
    .line 1388
    return-void

    .line 1389
    :pswitch_1e
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 1390
    .line 1391
    check-cast v1, Ldefpackage/kt2;

    .line 1392
    .line 1393
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 1394
    .line 1395
    check-cast v0, Ldefpackage/fr2;

    .line 1396
    .line 1397
    iget-object v1, v1, Ldefpackage/kt2;->f:Ldefpackage/na4;

    .line 1398
    .line 1399
    invoke-virtual {v1, v0}, Ldefpackage/na4;->s(Ldefpackage/fr2;)V

    .line 1400
    .line 1401
    .line 1402
    return-void

    .line 1403
    :pswitch_1f
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 1404
    .line 1405
    check-cast v1, Ldefpackage/kt2;

    .line 1406
    .line 1407
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 1408
    .line 1409
    check-cast v0, Ldefpackage/ju1;

    .line 1410
    .line 1411
    iget-object v1, v1, Ldefpackage/kt2;->f:Ldefpackage/na4;

    .line 1412
    .line 1413
    invoke-interface {v0}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v0

    .line 1417
    invoke-virtual {v1, v0}, Ldefpackage/na4;->w(Ljava/lang/Object;)Ldefpackage/fr2;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v0

    .line 1421
    if-eqz v0, :cond_20

    .line 1422
    .line 1423
    invoke-virtual {v1, v0}, Ldefpackage/na4;->N(Ldefpackage/fr2;)V

    .line 1424
    .line 1425
    .line 1426
    :cond_20
    return-void

    .line 1427
    :pswitch_20
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 1428
    .line 1429
    check-cast v1, Ldefpackage/tn2;

    .line 1430
    .line 1431
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 1432
    .line 1433
    check-cast v0, Landroid/content/Intent;

    .line 1434
    .line 1435
    sget v3, Landroidx/media3/session/MediaLibraryService;->t:I

    .line 1436
    .line 1437
    invoke-virtual {v1}, Ldefpackage/tn2;->g()Ldefpackage/fr2;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v3

    .line 1441
    if-nez v3, :cond_22

    .line 1442
    .line 1443
    invoke-virtual {v0}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v3

    .line 1447
    if-eqz v3, :cond_21

    .line 1448
    .line 1449
    invoke-virtual {v3}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v3

    .line 1453
    goto :goto_12

    .line 1454
    :cond_21
    const-string v3, "androidx.media3.session.MediaSessionService"

    .line 1455
    .line 1456
    :goto_12
    new-instance v4, Ldefpackage/fr2;

    .line 1457
    .line 1458
    new-instance v5, Ldefpackage/ms2;

    .line 1459
    .line 1460
    invoke-direct {v5, v3, v2, v2}, Ldefpackage/ms2;-><init>(Ljava/lang/String;II)V

    .line 1461
    .line 1462
    .line 1463
    const/4 v9, 0x0

    .line 1464
    sget-object v10, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 1465
    .line 1466
    const v6, 0x3c24273c

    .line 1467
    .line 1468
    .line 1469
    const/16 v7, 0x8

    .line 1470
    .line 1471
    const/4 v8, 0x0

    .line 1472
    invoke-direct/range {v4 .. v10}, Ldefpackage/fr2;-><init>(Ldefpackage/ms2;IIZLdefpackage/er2;Landroid/os/Bundle;)V

    .line 1473
    .line 1474
    .line 1475
    move-object v3, v4

    .line 1476
    :cond_22
    invoke-virtual {v1, v3, v0}, Ldefpackage/tn2;->t(Ldefpackage/fr2;Landroid/content/Intent;)Z

    .line 1477
    .line 1478
    .line 1479
    move-result v0

    .line 1480
    if-nez v0, :cond_23

    .line 1481
    .line 1482
    const-string v0, "MSessionService"

    .line 1483
    .line 1484
    const-string v1, "Ignored unrecognized media button intent."

    .line 1485
    .line 1486
    invoke-static {v0, v1}, Ldefpackage/l93;->A(Ljava/lang/String;Ljava/lang/String;)V

    .line 1487
    .line 1488
    .line 1489
    :cond_23
    return-void

    .line 1490
    :pswitch_21
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 1491
    .line 1492
    check-cast v1, Ldefpackage/ic2;

    .line 1493
    .line 1494
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 1495
    .line 1496
    move-object v3, v0

    .line 1497
    check-cast v3, Landroid/os/ResultReceiver;

    .line 1498
    .line 1499
    const-string v4, "MediaSessionLegacyStub"

    .line 1500
    .line 1501
    :try_start_9
    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v0

    .line 1505
    check-cast v0, Ldefpackage/ab4;

    .line 1506
    .line 1507
    const-string v1, "SessionResult must not be null"

    .line 1508
    .line 1509
    invoke-static {v0, v1}, Ldefpackage/rr2;->s(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_9
    .catch Ljava/util/concurrent/CancellationException; {:try_start_9 .. :try_end_9} :catch_9
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_9 .. :try_end_9} :catch_8
    .catch Ljava/lang/InterruptedException; {:try_start_9 .. :try_end_9} :catch_7

    .line 1510
    .line 1511
    .line 1512
    goto :goto_15

    .line 1513
    :catch_7
    move-exception v0

    .line 1514
    goto :goto_13

    .line 1515
    :catch_8
    move-exception v0

    .line 1516
    goto :goto_13

    .line 1517
    :catch_9
    move-exception v0

    .line 1518
    goto :goto_14

    .line 1519
    :goto_13
    const-string v1, "Custom command failed"

    .line 1520
    .line 1521
    invoke-static {v4, v1, v0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1522
    .line 1523
    .line 1524
    new-instance v0, Ldefpackage/ab4;

    .line 1525
    .line 1526
    invoke-direct {v0, v2}, Ldefpackage/ab4;-><init>(I)V

    .line 1527
    .line 1528
    .line 1529
    goto :goto_15

    .line 1530
    :goto_14
    const-string v1, "Custom command cancelled"

    .line 1531
    .line 1532
    invoke-static {v4, v1, v0}, Ldefpackage/l93;->r0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1533
    .line 1534
    .line 1535
    new-instance v0, Ldefpackage/ab4;

    .line 1536
    .line 1537
    invoke-direct {v0, v9}, Ldefpackage/ab4;-><init>(I)V

    .line 1538
    .line 1539
    .line 1540
    :goto_15
    iget v1, v0, Ldefpackage/ab4;->a:I

    .line 1541
    .line 1542
    iget-object v0, v0, Ldefpackage/ab4;->b:Landroid/os/Bundle;

    .line 1543
    .line 1544
    invoke-virtual {v3, v1, v0}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    .line 1545
    .line 1546
    .line 1547
    return-void

    .line 1548
    :pswitch_22
    iget-object v1, v0, Ldefpackage/ur2;->o:Ljava/lang/Object;

    .line 1549
    .line 1550
    check-cast v1, Ldefpackage/tn2;

    .line 1551
    .line 1552
    iget-object v0, v0, Ldefpackage/ur2;->p:Ljava/lang/Object;

    .line 1553
    .line 1554
    check-cast v0, Ljava/lang/Runnable;

    .line 1555
    .line 1556
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1557
    .line 1558
    .line 1559
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 1560
    .line 1561
    .line 1562
    return-void

    .line 1563
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
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

    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_1a
        :pswitch_1a
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_16
        :pswitch_1b
        :pswitch_1b
        :pswitch_18
        :pswitch_1b
        :pswitch_17
        :pswitch_18
        :pswitch_19
    .end packed-switch
.end method
