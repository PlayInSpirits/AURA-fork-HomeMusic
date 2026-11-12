.class public final Lhd5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lz30;
.implements Lretrofit2/Callback;
.implements Le01;
.implements Lin4;
.implements Lwa3;


# instance fields
.field public final synthetic n:I

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Lhd5;->n:I

    packed-switch p1, :pswitch_data_0

    .line 365
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 366
    new-instance p1, Ljk1;

    const/4 v0, 0x0

    .line 367
    invoke-direct {p1, v0}, Ljk1;-><init>(Lxn3;)V

    .line 368
    iput-object p1, p0, Lhd5;->o:Ljava/lang/Object;

    .line 369
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lhd5;->p:Ljava/lang/Object;

    return-void

    .line 370
    :pswitch_1
    sget-object p1, Lej1;->c:Lej1;

    .line 371
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    iput-object v0, p0, Lhd5;->o:Ljava/lang/Object;

    .line 372
    iput-object p1, p0, Lhd5;->p:Ljava/lang/Object;

    return-void

    .line 373
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 374
    new-instance p1, Lf13;

    const/16 v0, 0x10

    new-array v0, v0, [Ljava/lang/ref/Reference;

    invoke-direct {p1, v0}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 375
    iput-object p1, p0, Lhd5;->o:Ljava/lang/Object;

    .line 376
    new-instance p1, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {p1}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object p1, p0, Lhd5;->p:Ljava/lang/Object;

    return-void

    .line 377
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 378
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lhd5;->o:Ljava/lang/Object;

    .line 379
    new-instance p1, Lpl4;

    .line 380
    invoke-direct {p1}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 381
    iput-object p1, p0, Lhd5;->p:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 364
    iput p1, p0, Lhd5;->n:I

    iput-object p2, p0, Lhd5;->o:Ljava/lang/Object;

    iput-object p3, p0, Lhd5;->p:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lhd5;->n:I

    .line 391
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 392
    iput-object p1, p0, Lhd5;->o:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/media/MediaCodec$CryptoInfo;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lhd5;->n:I

    .line 393
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 394
    iput-object p1, p0, Lhd5;->o:Ljava/lang/Object;

    .line 395
    new-instance p1, Landroid/media/MediaCodec$CryptoInfo$Pattern;

    const/4 v0, 0x0

    invoke-direct {p1, v0, v0}, Landroid/media/MediaCodec$CryptoInfo$Pattern;-><init>(II)V

    iput-object p1, p0, Lhd5;->p:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lhd5;->n:I

    .line 382
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 383
    iput-object p1, p0, Lhd5;->o:Ljava/lang/Object;

    .line 384
    new-instance v0, Lvo0;

    const/4 v1, 0x6

    .line 385
    invoke-direct {v0, p1, v1}, Lvo0;-><init>(Ls24;I)V

    .line 386
    iput-object v0, p0, Lhd5;->p:Ljava/lang/Object;

    .line 387
    new-instance p0, Laq4;

    const/16 v0, 0x14

    .line 388
    invoke-direct {p0, p1, v0}, Laq4;-><init>(Ls24;I)V

    return-void
.end method

.method public constructor <init>(Lgy3;[I)V
    .locals 1

    const/16 v0, 0xf

    iput v0, p0, Lhd5;->n:I

    .line 396
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 397
    invoke-static {p1}, Lyw1;->k(Ljava/util/Collection;)Lyw1;

    move-result-object p1

    iput-object p1, p0, Lhd5;->o:Ljava/lang/Object;

    .line 398
    iput-object p2, p0, Lhd5;->p:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V
    .locals 0

    .line 363
    iput p4, p0, Lhd5;->n:I

    iput-object p1, p0, Lhd5;->p:Ljava/lang/Object;

    iput-object p2, p0, Lhd5;->o:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, Lhd5;->n:I

    .line 399
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    .line 400
    iput-object p1, p0, Lhd5;->o:Ljava/lang/Object;

    .line 401
    iput-object p2, p0, Lhd5;->p:Ljava/lang/Object;

    return-void

    .line 402
    :cond_0
    const-string p0, "The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead"

    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Lpn4;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    iput v1, v0, Lhd5;->n:I

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    iput-object v1, v0, Lhd5;->o:Ljava/lang/Object;

    .line 13
    .line 14
    new-instance v2, Lok1;

    .line 15
    .line 16
    invoke-direct {v2}, Lok1;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v3, Lr01;

    .line 20
    .line 21
    invoke-direct {v3}, Lr01;-><init>()V

    .line 22
    .line 23
    .line 24
    const-class v4, Ljava/util/Date;

    .line 25
    .line 26
    invoke-virtual {v2, v4, v3}, Lok1;->a(Ljava/lang/Class;Lg32;)V

    .line 27
    .line 28
    .line 29
    new-instance v3, Llt;

    .line 30
    .line 31
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    const-class v4, Lcom/eddyizm/tempus/subsonic/models/Bookmarks;

    .line 35
    .line 36
    invoke-virtual {v2, v4, v3}, Lok1;->a(Ljava/lang/Class;Lg32;)V

    .line 37
    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    iput-boolean v3, v2, Lok1;->j:Z

    .line 41
    .line 42
    new-instance v12, Ljava/util/ArrayList;

    .line 43
    .line 44
    iget-object v3, v2, Lok1;->e:Ljava/util/ArrayList;

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    iget-object v5, v2, Lok1;->f:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    add-int/2addr v6, v4

    .line 57
    add-int/lit8 v6, v6, 0x3

    .line 58
    .line 59
    invoke-direct {v12, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 63
    .line 64
    .line 65
    invoke-static {v12}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 66
    .line 67
    .line 68
    new-instance v4, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v4}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 77
    .line 78
    .line 79
    iget v4, v2, Lok1;->g:I

    .line 80
    .line 81
    iget v6, v2, Lok1;->h:I

    .line 82
    .line 83
    sget-object v7, Lbk0;->b:Lak0;

    .line 84
    .line 85
    sget-boolean v8, Lgk4;->a:Z

    .line 86
    .line 87
    const/4 v9, 0x2

    .line 88
    const/4 v10, 0x0

    .line 89
    if-eq v4, v9, :cond_1

    .line 90
    .line 91
    if-eq v6, v9, :cond_1

    .line 92
    .line 93
    invoke-virtual {v7, v4, v6}, Lbk0;->a(II)Ldz4;

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    if-eqz v8, :cond_0

    .line 98
    .line 99
    sget-object v9, Lgk4;->c:Lfk4;

    .line 100
    .line 101
    invoke-virtual {v9, v4, v6}, Lbk0;->a(II)Ldz4;

    .line 102
    .line 103
    .line 104
    move-result-object v9

    .line 105
    sget-object v11, Lgk4;->b:Lfk4;

    .line 106
    .line 107
    invoke-virtual {v11, v4, v6}, Lbk0;->a(II)Ldz4;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    goto :goto_0

    .line 112
    :cond_0
    move-object v4, v10

    .line 113
    move-object v9, v4

    .line 114
    :goto_0
    invoke-virtual {v12, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    if-eqz v8, :cond_1

    .line 118
    .line 119
    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    .line 124
    .line 125
    :cond_1
    new-instance v4, Lnk1;

    .line 126
    .line 127
    iget-object v6, v2, Lok1;->a:Lu21;

    .line 128
    .line 129
    move-object v7, v6

    .line 130
    iget v6, v2, Lok1;->c:I

    .line 131
    .line 132
    move-object v8, v7

    .line 133
    new-instance v7, Ljava/util/HashMap;

    .line 134
    .line 135
    iget-object v9, v2, Lok1;->d:Ljava/util/HashMap;

    .line 136
    .line 137
    invoke-direct {v7, v9}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 138
    .line 139
    .line 140
    move-object v9, v8

    .line 141
    iget-boolean v8, v2, Lok1;->i:Z

    .line 142
    .line 143
    move-object v11, v9

    .line 144
    iget-boolean v9, v2, Lok1;->j:Z

    .line 145
    .line 146
    move-object v13, v10

    .line 147
    iget-boolean v10, v2, Lok1;->k:Z

    .line 148
    .line 149
    move-object v14, v11

    .line 150
    iget v11, v2, Lok1;->b:I

    .line 151
    .line 152
    new-instance v15, Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-direct {v15, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 155
    .line 156
    .line 157
    new-instance v3, Ljava/util/ArrayList;

    .line 158
    .line 159
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 160
    .line 161
    .line 162
    move-object v3, v13

    .line 163
    iget v13, v2, Lok1;->l:I

    .line 164
    .line 165
    move-object v5, v14

    .line 166
    iget v14, v2, Lok1;->m:I

    .line 167
    .line 168
    new-instance v15, Ljava/util/ArrayList;

    .line 169
    .line 170
    iget-object v2, v2, Lok1;->n:Ljava/util/LinkedList;

    .line 171
    .line 172
    invoke-direct {v15, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 173
    .line 174
    .line 175
    invoke-direct/range {v4 .. v15}, Lnk1;-><init>(Lu21;ILjava/util/Map;ZZZILjava/util/List;IILjava/util/List;)V

    .line 176
    .line 177
    .line 178
    new-instance v2, Lretrofit2/Retrofit$Builder;

    .line 179
    .line 180
    invoke-direct {v2}, Lretrofit2/Retrofit$Builder;-><init>()V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v1}, Lpn4;->j()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v1

    .line 187
    if-eqz v1, :cond_2

    .line 188
    .line 189
    invoke-static {v1}, Lqm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v10

    .line 197
    goto :goto_1

    .line 198
    :cond_2
    move-object v10, v3

    .line 199
    :goto_1
    if-nez v10, :cond_3

    .line 200
    .line 201
    const-string v10, ""

    .line 202
    .line 203
    :cond_3
    :try_start_0
    new-instance v1, Lfr1;

    .line 204
    .line 205
    invoke-direct {v1}, Lfr1;-><init>()V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1, v3, v10}, Lfr1;->e(Lgr1;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1}, Lfr1;->b()Lgr1;

    .line 212
    .line 213
    .line 214
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 215
    goto :goto_2

    .line 216
    :catch_0
    move-object v1, v3

    .line 217
    :goto_2
    if-eqz v1, :cond_4

    .line 218
    .line 219
    iget-object v1, v1, Lgr1;->d:Ljava/lang/String;

    .line 220
    .line 221
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 222
    .line 223
    .line 224
    move-result v1

    .line 225
    if-lez v1, :cond_4

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_4
    const-string v10, "https://localhost/rest/"

    .line 229
    .line 230
    :goto_3
    invoke-virtual {v2, v10}, Lretrofit2/Retrofit$Builder;->baseUrl(Ljava/lang/String;)Lretrofit2/Retrofit$Builder;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-static {v4}, Lretrofit2/converter/gson/GsonConverterFactory;->create(Lnk1;)Lretrofit2/converter/gson/GsonConverterFactory;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit$Builder;->addConverterFactory(Lretrofit2/Converter$Factory;)Lretrofit2/Retrofit$Builder;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    new-instance v2, Lcx;

    .line 243
    .line 244
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 245
    .line 246
    .line 247
    new-instance v3, Lrx;

    .line 248
    .line 249
    invoke-direct {v3, v2}, Lrx;-><init>(Lcx;)V

    .line 250
    .line 251
    .line 252
    const v4, 0x278d00

    .line 253
    .line 254
    .line 255
    iput v4, v2, Lcx;->a:I

    .line 256
    .line 257
    new-instance v2, Ln83;

    .line 258
    .line 259
    invoke-direct {v2}, Ln83;-><init>()V

    .line 260
    .line 261
    .line 262
    const-wide/16 v4, 0x2

    .line 263
    .line 264
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 265
    .line 266
    invoke-virtual {v2, v4, v5, v6}, Ln83;->a(JLjava/util/concurrent/TimeUnit;)V

    .line 267
    .line 268
    .line 269
    const-wide/16 v4, 0x14

    .line 270
    .line 271
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 272
    .line 273
    invoke-virtual {v2, v4, v5, v6}, Ln83;->b(JLjava/util/concurrent/TimeUnit;)V

    .line 274
    .line 275
    .line 276
    const-wide/16 v4, 0x1e

    .line 277
    .line 278
    invoke-static {v4, v5, v6}, Lze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 279
    .line 280
    .line 281
    move-result v7

    .line 282
    iput v7, v2, Ln83;->z:I

    .line 283
    .line 284
    invoke-static {v4, v5, v6}, Lze5;->b(JLjava/util/concurrent/TimeUnit;)I

    .line 285
    .line 286
    .line 287
    move-result v4

    .line 288
    iput v4, v2, Ln83;->A:I

    .line 289
    .line 290
    new-instance v4, Ldr1;

    .line 291
    .line 292
    invoke-direct {v4}, Ldr1;-><init>()V

    .line 293
    .line 294
    .line 295
    sget-object v5, Lcr1;->n:Lcr1;

    .line 296
    .line 297
    iput-object v5, v4, Ldr1;->b:Lcr1;

    .line 298
    .line 299
    iget-object v5, v2, Ln83;->c:Ljava/util/ArrayList;

    .line 300
    .line 301
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    iget-object v4, v2, Ln83;->c:Ljava/util/ArrayList;

    .line 305
    .line 306
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    new-instance v3, Lhx;

    .line 310
    .line 311
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    invoke-virtual {v4}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 316
    .line 317
    .line 318
    move-result-object v4

    .line 319
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    invoke-direct {v3, v4}, Lhx;-><init>(Ljava/io/File;)V

    .line 323
    .line 324
    .line 325
    iput-object v3, v2, Ln83;->l:Lhx;

    .line 326
    .line 327
    sget-object v3, Lx30;->b:Ljavax/net/ssl/SSLSocketFactory;

    .line 328
    .line 329
    if-eqz v3, :cond_5

    .line 330
    .line 331
    sget-object v4, Lx30;->a:Ljavax/net/ssl/X509TrustManager;

    .line 332
    .line 333
    invoke-virtual {v2, v3, v4}, Ln83;->c(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)V

    .line 334
    .line 335
    .line 336
    :cond_5
    new-instance v3, Lo83;

    .line 337
    .line 338
    invoke-direct {v3, v2}, Lo83;-><init>(Ln83;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v1, v3}, Lretrofit2/Retrofit$Builder;->client(Lo83;)Lretrofit2/Retrofit$Builder;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    invoke-virtual {v1}, Lretrofit2/Retrofit$Builder;->build()Lretrofit2/Retrofit;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    const-class v2, Lf84;

    .line 353
    .line 354
    invoke-virtual {v1, v2}, Lretrofit2/Retrofit;->create(Ljava/lang/Class;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    check-cast v1, Lf84;

    .line 359
    .line 360
    iput-object v1, v0, Lhd5;->p:Ljava/lang/Object;

    .line 361
    .line 362
    return-void
.end method

.method public constructor <init>(Ls24;)V
    .locals 1

    const/16 v0, 0xb

    iput v0, p0, Lhd5;->n:I

    .line 389
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhd5;->o:Ljava/lang/Object;

    .line 390
    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lhd5;->p:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lhd5;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lq15;

    .line 4
    .line 5
    return-object p0
.end method

.method public apply()Ljn4;
    .locals 3

    .line 1
    iget-object v0, p0, Lhd5;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo72;

    .line 4
    .line 5
    invoke-virtual {p0}, Lhd5;->i()Lh72;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, v1, v2}, Lo72;->d(Lh72;Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object p0, p0, Lhd5;->p:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lo72;->f(Ljava/lang/Object;)Ljn4;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public b(Ljava/lang/CharSequence;IILk05;)Z
    .locals 3

    .line 1
    iget v0, p4, Lk05;->c:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-lez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    iget-object v0, p0, Lhd5;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lq15;

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    new-instance v0, Lq15;

    .line 16
    .line 17
    instance-of v2, p1, Landroid/text/Spannable;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    check-cast p1, Landroid/text/Spannable;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    new-instance v2, Landroid/text/SpannableString;

    .line 25
    .line 26
    invoke-direct {v2, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    move-object p1, v2

    .line 30
    :goto_0
    invoke-direct {v0, p1}, Lq15;-><init>(Landroid/text/Spannable;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lhd5;->o:Ljava/lang/Object;

    .line 34
    .line 35
    :cond_2
    iget-object p1, p0, Lhd5;->p:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lom0;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    new-instance p1, Ll05;

    .line 43
    .line 44
    invoke-direct {p1, p4}, Ll05;-><init>(Lk05;)V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, Lhd5;->o:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p0, Lq15;

    .line 50
    .line 51
    const/16 p4, 0x21

    .line 52
    .line 53
    invoke-virtual {p0, p1, p2, p3, p4}, Lq15;->setSpan(Ljava/lang/Object;III)V

    .line 54
    .line 55
    .line 56
    return v1
.end method

.method public c(Ljava/lang/Integer;)Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Lhd5;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lwa3;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, v1}, Lwa3;->c(Ljava/lang/Integer;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object p0, p0, Lhd5;->p:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Llg4;

    .line 13
    .line 14
    iget v1, p0, Llg4;->v:I

    .line 15
    .line 16
    if-gez v1, :cond_0

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    iget-object v2, p0, Llg4;->b:[I

    .line 20
    .line 21
    invoke-virtual {p0, v2, v1}, Llg4;->E([II)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {p0, p1, v1, v2}, Lgh0;->d(Llg4;Ljava/lang/Integer;ILjava/lang/Integer;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0, v0}, Lq40;->G0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public cancel()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lhd5;->i()Lh72;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, v0, Lh72;->f:Lef3;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lhd5;->o:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lo72;

    .line 16
    .line 17
    iget-object p0, p0, Lhd5;->p:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {v0, p0}, Lo72;->c(Lo72;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public d()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lhd5;->i()Lh72;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Lh72;->f:Lef3;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lef3;->c()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public e(Lbt2;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lhd5;->i()Lh72;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Lh72;->f:Lef3;

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v1, v0

    .line 12
    :goto_0
    if-eqz v1, :cond_2

    .line 13
    .line 14
    invoke-virtual {v1}, Lef3;->c()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_2

    .line 19
    .line 20
    invoke-static {}, Lya4;->t()Lch4;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-virtual {v2}, Lch4;->e()Lif1;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_1
    invoke-static {v2}, Lya4;->z(Lch4;)Lch4;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    :try_start_0
    invoke-virtual {v1, p1}, Lef3;->e(Lmd4;)Z

    .line 35
    .line 36
    .line 37
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    invoke-static {v2, v3, v0}, Lya4;->H(Lch4;Lch4;Lif1;)V

    .line 39
    .line 40
    .line 41
    return p0

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 47
    :catchall_1
    move-exception p0

    .line 48
    invoke-static {v2, v3, v0}, Lya4;->H(Lch4;Lch4;Lif1;)V

    .line 49
    .line 50
    .line 51
    throw p0

    .line 52
    :cond_2
    const/4 p0, 0x1

    .line 53
    return p0
.end method

.method public f(Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 1
    new-instance v0, Lxi4;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lxi4;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lhd5;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lpl4;

    .line 11
    .line 12
    invoke-virtual {p1, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lhd5;->o:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public g()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lhd5;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lwa3;

    .line 4
    .line 5
    invoke-interface {p0}, Lwa3;->g()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public h(Lxn3;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lhd5;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljk1;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Ljk1;

    .line 14
    .line 15
    invoke-direct {v1, p1}, Ljk1;-><init>(Lxn3;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-interface {p1}, Lxn3;->a()V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v1, Ljk1;->d:Ljk1;

    .line 26
    .line 27
    iget-object v0, v1, Ljk1;->c:Ljk1;

    .line 28
    .line 29
    iput-object v0, p1, Ljk1;->c:Ljk1;

    .line 30
    .line 31
    iget-object v0, v1, Ljk1;->c:Ljk1;

    .line 32
    .line 33
    iput-object p1, v0, Ljk1;->d:Ljk1;

    .line 34
    .line 35
    iget-object p0, p0, Lhd5;->o:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Ljk1;

    .line 38
    .line 39
    iput-object p0, v1, Ljk1;->d:Ljk1;

    .line 40
    .line 41
    iget-object p0, p0, Ljk1;->c:Ljk1;

    .line 42
    .line 43
    iput-object p0, v1, Ljk1;->c:Ljk1;

    .line 44
    .line 45
    iput-object v1, p0, Ljk1;->d:Ljk1;

    .line 46
    .line 47
    iget-object p0, v1, Ljk1;->d:Ljk1;

    .line 48
    .line 49
    iput-object v1, p0, Ljk1;->c:Ljk1;

    .line 50
    .line 51
    iget-object p0, v1, Ljk1;->b:Ljava/util/ArrayList;

    .line 52
    .line 53
    if-eqz p0, :cond_1

    .line 54
    .line 55
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    const/4 p0, 0x0

    .line 61
    :goto_1
    if-lez p0, :cond_2

    .line 62
    .line 63
    iget-object p1, v1, Ljk1;->b:Ljava/util/ArrayList;

    .line 64
    .line 65
    add-int/lit8 p0, p0, -0x1

    .line 66
    .line 67
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_2
    const/4 p0, 0x0

    .line 73
    return-object p0
.end method

.method public i()Lh72;
    .locals 2

    .line 1
    iget-object v0, p0, Lhd5;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo72;

    .line 4
    .line 5
    iget-object v1, v0, Lo72;->w:Lw03;

    .line 6
    .line 7
    iget-object p0, p0, Lhd5;->p:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {v1, p0}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Lc72;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    iget-object v0, v0, Lo72;->s:Lw03;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Lw03;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Lh72;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public j(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    const-string v1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?"

    .line 3
    .line 4
    invoke-static {v0, v1}, Lw24;->b(ILjava/lang/String;)Lw24;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1, v0, p1}, Lw24;->h(ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lhd5;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Landroidx/work/impl/WorkDatabase_Impl;

    .line 14
    .line 15
    invoke-virtual {p0}, Ls24;->b()V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v1}, Lxl;->H(Ls24;Lwo4;)Landroid/database/Cursor;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    :try_start_0
    new-instance p1, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-interface {p0}, Landroid/database/Cursor;->getCount()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-interface {p0}, Landroid/database/Cursor;->moveToNext()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Lw24;->j()V

    .line 52
    .line 53
    .line 54
    return-object p1

    .line 55
    :goto_1
    invoke-interface {p0}, Landroid/database/Cursor;->close()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Lw24;->j()V

    .line 59
    .line 60
    .line 61
    throw p1
.end method

.method public k(Lxn3;Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lhd5;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljk1;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Ljk1;

    .line 14
    .line 15
    invoke-direct {v1, p1}, Ljk1;-><init>(Lxn3;)V

    .line 16
    .line 17
    .line 18
    iput-object v1, v1, Ljk1;->d:Ljk1;

    .line 19
    .line 20
    iget-object p0, p0, Lhd5;->o:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Ljk1;

    .line 23
    .line 24
    iget-object v2, p0, Ljk1;->d:Ljk1;

    .line 25
    .line 26
    iput-object v2, v1, Ljk1;->d:Ljk1;

    .line 27
    .line 28
    iput-object p0, v1, Ljk1;->c:Ljk1;

    .line 29
    .line 30
    iput-object v1, p0, Ljk1;->d:Ljk1;

    .line 31
    .line 32
    iget-object p0, v1, Ljk1;->d:Ljk1;

    .line 33
    .line 34
    iput-object v1, p0, Ljk1;->c:Ljk1;

    .line 35
    .line 36
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-interface {p1}, Lxn3;->a()V

    .line 41
    .line 42
    .line 43
    :goto_0
    iget-object p0, v1, Ljk1;->b:Ljava/util/ArrayList;

    .line 44
    .line 45
    if-nez p0, :cond_1

    .line 46
    .line 47
    new-instance p0, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p0, v1, Ljk1;->b:Ljava/util/ArrayList;

    .line 53
    .line 54
    :cond_1
    iget-object p0, v1, Ljk1;->b:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public l()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lhd5;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljk1;

    .line 4
    .line 5
    iget-object v1, v0, Ljk1;->d:Ljk1;

    .line 6
    .line 7
    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget-object v3, v1, Ljk1;->a:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-nez v2, :cond_3

    .line 15
    .line 16
    iget-object v2, v1, Ljk1;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const/4 v2, 0x0

    .line 26
    :goto_1
    if-lez v2, :cond_1

    .line 27
    .line 28
    iget-object v4, v1, Ljk1;->b:Ljava/util/ArrayList;

    .line 29
    .line 30
    add-int/lit8 v2, v2, -0x1

    .line 31
    .line 32
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    :cond_1
    if-eqz v4, :cond_2

    .line 37
    .line 38
    return-object v4

    .line 39
    :cond_2
    iget-object v2, v1, Ljk1;->d:Ljk1;

    .line 40
    .line 41
    iget-object v4, v1, Ljk1;->c:Ljk1;

    .line 42
    .line 43
    iput-object v4, v2, Ljk1;->c:Ljk1;

    .line 44
    .line 45
    iget-object v4, v1, Ljk1;->c:Ljk1;

    .line 46
    .line 47
    iput-object v2, v4, Ljk1;->d:Ljk1;

    .line 48
    .line 49
    iget-object v2, p0, Lhd5;->p:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    check-cast v3, Lxn3;

    .line 57
    .line 58
    invoke-interface {v3}, Lxn3;->a()V

    .line 59
    .line 60
    .line 61
    iget-object v1, v1, Ljk1;->d:Ljk1;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    return-object v4
.end method

.method public m(Ljava/lang/String;IIII)Lretrofit2/Call;
    .locals 11

    .line 1
    const-string v0, "BrowsingClient"

    .line 2
    .line 3
    const-string v1, "search3()"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lhd5;->p:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v1, v0

    .line 11
    check-cast v1, Lf84;

    .line 12
    .line 13
    iget-object p0, p0, Lhd5;->o:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lpn4;

    .line 16
    .line 17
    invoke-virtual {p0}, Lpn4;->f()Ljava/util/HashMap;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-static {}, Lud3;->k()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v10

    .line 25
    const/4 v7, 0x0

    .line 26
    const/4 v9, 0x0

    .line 27
    move-object v3, p1

    .line 28
    move v4, p2

    .line 29
    move v5, p3

    .line 30
    move v6, p4

    .line 31
    move/from16 v8, p5

    .line 32
    .line 33
    invoke-interface/range {v1 .. v10}, Lf84;->a(Ljava/util/Map;Ljava/lang/String;IIIIIILjava/lang/String;)Lretrofit2/Call;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public onFailure(Lretrofit2/Call;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget p1, p0, Lhd5;->n:I

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lhd5;->p:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lhh3;

    .line 9
    .line 10
    iget-object p0, p0, Lhd5;->o:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lk03;

    .line 13
    .line 14
    new-instance p2, Ljava/lang/Thread;

    .line 15
    .line 16
    new-instance v0, Ljq3;

    .line 17
    .line 18
    invoke-direct {v0, p1, p0}, Ljq3;-><init>(Lhh3;Lk03;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p2, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :sswitch_0
    iget-object p0, p0, Lhd5;->o:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Llm3;

    .line 31
    .line 32
    invoke-interface {p0}, Llm3;->g()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :sswitch_1
    iget-object p1, p0, Lhd5;->o:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast p1, Ll61;

    .line 39
    .line 40
    iget-object p0, p0, Lhd5;->p:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Lcom/eddyizm/tempus/interfaces/StarCallback;

    .line 43
    .line 44
    invoke-static {p1, p0}, Ld34;->r(Ll61;Lcom/eddyizm/tempus/interfaces/StarCallback;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :sswitch_2
    iget-object p1, p0, Lhd5;->o:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Ljava/lang/String;

    .line 51
    .line 52
    const/4 p2, 0x0

    .line 53
    invoke-static {p1, p2}, Lkb4;->g(Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;)Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-eqz p1, :cond_0

    .line 58
    .line 59
    iget-object p0, p0, Lhd5;->p:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p0, Lk03;

    .line 62
    .line 63
    invoke-virtual {p0, p1}, Lad2;->k(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    return-void

    .line 67
    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_2
        0x8 -> :sswitch_1
        0x11 -> :sswitch_0
    .end sparse-switch
.end method

.method public onResponse(Lretrofit2/Call;Lretrofit2/Response;)V
    .locals 3

    .line 1
    iget p1, p0, Lhd5;->n:I

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lhd5;->o:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lk03;

    .line 9
    .line 10
    iget-object p0, p0, Lhd5;->p:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lhh3;

    .line 13
    .line 14
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getInternetRadioStations()Lcom/eddyizm/tempus/subsonic/models/InternetRadioStations;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getInternetRadioStations()Lcom/eddyizm/tempus/subsonic/models/InternetRadioStations;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStations;->getInternetRadioStations()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    check-cast p2, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 67
    .line 68
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getInternetRadioStations()Lcom/eddyizm/tempus/subsonic/models/InternetRadioStations;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStations;->getInternetRadioStations()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    new-instance v0, Ljava/lang/Thread;

    .line 81
    .line 82
    new-instance v1, Ljq3;

    .line 83
    .line 84
    const/4 v2, 0x3

    .line 85
    invoke-direct {v1, v2, p2}, Ljq3;-><init>(ILjava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 92
    .line 93
    .line 94
    new-instance v0, Ljava/lang/Thread;

    .line 95
    .line 96
    new-instance v1, Lur2;

    .line 97
    .line 98
    invoke-direct {v1, p0, p2, p1}, Lur2;-><init>(Lhh3;Ljava/util/List;Lk03;)V

    .line 99
    .line 100
    .line 101
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_0
    new-instance p2, Ljava/lang/Thread;

    .line 109
    .line 110
    new-instance v0, Ljq3;

    .line 111
    .line 112
    invoke-direct {v0, p0, p1}, Ljq3;-><init>(Lhh3;Lk03;)V

    .line 113
    .line 114
    .line 115
    invoke-direct {p2, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 119
    .line 120
    .line 121
    :goto_0
    return-void

    .line 122
    :sswitch_0
    iget-object p1, p0, Lhd5;->o:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast p1, Llm3;

    .line 125
    .line 126
    invoke-static {p2}, Lmm3;->f(Lretrofit2/Response;)Z

    .line 127
    .line 128
    .line 129
    move-result p2

    .line 130
    if-eqz p2, :cond_1

    .line 131
    .line 132
    iget-object p0, p0, Lhd5;->p:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast p0, Lmm3;

    .line 135
    .line 136
    invoke-virtual {p0}, Lmm3;->g()V

    .line 137
    .line 138
    .line 139
    invoke-interface {p1}, Llm3;->onSuccess()V

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_1
    invoke-interface {p1}, Llm3;->g()V

    .line 144
    .line 145
    .line 146
    :goto_1
    return-void

    .line 147
    :sswitch_1
    iget-object p1, p0, Lhd5;->o:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast p1, Ll61;

    .line 150
    .line 151
    iget-object p0, p0, Lhd5;->p:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast p0, Lcom/eddyizm/tempus/interfaces/StarCallback;

    .line 154
    .line 155
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_2

    .line 160
    .line 161
    invoke-static {p2}, Ld34;->w(Lretrofit2/Response;)Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-nez v0, :cond_2

    .line 166
    .line 167
    invoke-static {p1}, Ln61;->a(Ll61;)V

    .line 168
    .line 169
    .line 170
    invoke-interface {p0}, Lcom/eddyizm/tempus/interfaces/StarCallback;->onSuccess()V

    .line 171
    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_2
    invoke-static {p2}, Ld34;->w(Lretrofit2/Response;)Z

    .line 175
    .line 176
    .line 177
    move-result p2

    .line 178
    if-eqz p2, :cond_3

    .line 179
    .line 180
    invoke-static {p1}, Ln61;->j(Ll61;)V

    .line 181
    .line 182
    .line 183
    invoke-interface {p0}, Lcom/eddyizm/tempus/interfaces/StarCallback;->onRefused()V

    .line 184
    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_3
    invoke-static {p1, p0}, Ld34;->r(Ll61;Lcom/eddyizm/tempus/interfaces/StarCallback;)V

    .line 188
    .line 189
    .line 190
    :goto_2
    return-void

    .line 191
    :sswitch_2
    iget-object p1, p0, Lhd5;->o:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast p1, Ljava/lang/String;

    .line 194
    .line 195
    invoke-virtual {p2}, Lretrofit2/Response;->isSuccessful()Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    if-eqz v0, :cond_4

    .line 200
    .line 201
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    if-eqz v0, :cond_4

    .line 206
    .line 207
    invoke-virtual {p2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object p2

    .line 211
    check-cast p2, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 212
    .line 213
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getArtist()Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    goto :goto_3

    .line 222
    :cond_4
    const/4 p2, 0x0

    .line 223
    :goto_3
    invoke-static {p1, p2}, Lkb4;->g(Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;)Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    if-eqz p1, :cond_5

    .line 228
    .line 229
    iget-object p0, p0, Lhd5;->p:Ljava/lang/Object;

    .line 230
    .line 231
    check-cast p0, Lk03;

    .line 232
    .line 233
    invoke-virtual {p0, p1}, Lad2;->k(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    :cond_5
    return-void

    .line 237
    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_2
        0x8 -> :sswitch_1
        0x11 -> :sswitch_0
    .end sparse-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget v0, p0, Lhd5;->n:I

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
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "GroupedLinkedMap( "

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lhd5;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Ljk1;

    .line 21
    .line 22
    iget-object v1, p0, Ljk1;->c:Ljk1;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    move v3, v2

    .line 26
    :goto_0
    invoke-virtual {v1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-nez v4, :cond_1

    .line 31
    .line 32
    const/16 v3, 0x7b

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget-object v3, v1, Ljk1;->a:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const/16 v3, 0x3a

    .line 43
    .line 44
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object v3, v1, Ljk1;->b:Ljava/util/ArrayList;

    .line 48
    .line 49
    if-eqz v3, :cond_0

    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    move v3, v2

    .line 57
    :goto_1
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v3, "}, "

    .line 61
    .line 62
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-object v1, v1, Ljk1;->c:Ljk1;

    .line 66
    .line 67
    const/4 v3, 0x1

    .line 68
    goto :goto_0

    .line 69
    :cond_1
    if-eqz v3, :cond_2

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    add-int/lit8 p0, p0, -0x2

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-virtual {v0, p0, v1}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    :cond_2
    const-string p0, " )"

    .line 85
    .line 86
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method
