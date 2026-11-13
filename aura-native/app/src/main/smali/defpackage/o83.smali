.class public final Ldefpackage/o83;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/fy;


# static fields
.field public static final F:Ljava/util/List;

.field public static final G:Ljava/util/List;


# instance fields
.field public final A:I

.field public final B:J

.field public final C:Ldefpackage/rm2;

.field public final D:Ldefpackage/gr4;

.field public final E:Ldefpackage/d34;

.field public final a:Ldefpackage/na4;

.field public final b:Ljava/util/List;

.field public final c:Ljava/util/List;

.field public final d:Ldefpackage/tb4;

.field public final e:Z

.field public final f:Z

.field public final g:Ldefpackage/fz0;

.field public final h:Z

.field public final i:Z

.field public final j:Ldefpackage/be0;

.field public final k:Ldefpackage/hx;

.field public final l:Ldefpackage/fz0;

.field public final m:Ljava/net/ProxySelector;

.field public final n:Ldefpackage/fz0;

.field public final o:Ljavax/net/SocketFactory;

.field public final p:Ljavax/net/ssl/SSLSocketFactory;

.field public final q:Ljavax/net/ssl/X509TrustManager;

.field public final r:Ljava/util/List;

.field public final s:Ljava/util/List;

.field public final t:Ldefpackage/m83;

.field public final u:Ldefpackage/o00;

.field public final v:Ldefpackage/rr2;

.field public final w:I

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Ldefpackage/pr3;->s:Ldefpackage/pr3;

    .line 2
    .line 3
    sget-object v1, Ldefpackage/pr3;->q:Ldefpackage/pr3;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ldefpackage/pr3;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Ldefpackage/ze5;->f([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Ldefpackage/o83;->F:Ljava/util/List;

    .line 14
    .line 15
    sget-object v0, Ldefpackage/ma0;->e:Ldefpackage/ma0;

    .line 16
    .line 17
    sget-object v1, Ldefpackage/ma0;->f:Ldefpackage/ma0;

    .line 18
    .line 19
    filled-new-array {v0, v1}, [Ldefpackage/ma0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Ldefpackage/ze5;->f([Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Ldefpackage/o83;->G:Ljava/util/List;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Ldefpackage/n83;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Ldefpackage/n83;->a:Ldefpackage/na4;

    .line 5
    .line 6
    iput-object v0, p0, Ldefpackage/o83;->a:Ldefpackage/na4;

    .line 7
    .line 8
    iget-object v0, p1, Ldefpackage/n83;->c:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-static {v0}, Ldefpackage/ze5;->k(Ljava/util/List;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Ldefpackage/o83;->b:Ljava/util/List;

    .line 15
    .line 16
    iget-object v0, p1, Ldefpackage/n83;->d:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-static {v0}, Ldefpackage/ze5;->k(Ljava/util/List;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Ldefpackage/o83;->c:Ljava/util/List;

    .line 23
    .line 24
    iget-object v0, p1, Ldefpackage/n83;->e:Ldefpackage/tb4;

    .line 25
    .line 26
    iput-object v0, p0, Ldefpackage/o83;->d:Ldefpackage/tb4;

    .line 27
    .line 28
    iget-boolean v6, p1, Ldefpackage/n83;->f:Z

    .line 29
    .line 30
    iput-boolean v6, p0, Ldefpackage/o83;->e:Z

    .line 31
    .line 32
    iget-boolean v7, p1, Ldefpackage/n83;->g:Z

    .line 33
    .line 34
    iput-boolean v7, p0, Ldefpackage/o83;->f:Z

    .line 35
    .line 36
    iget-object v0, p1, Ldefpackage/n83;->h:Ldefpackage/fz0;

    .line 37
    .line 38
    iput-object v0, p0, Ldefpackage/o83;->g:Ldefpackage/fz0;

    .line 39
    .line 40
    iget-boolean v0, p1, Ldefpackage/n83;->i:Z

    .line 41
    .line 42
    iput-boolean v0, p0, Ldefpackage/o83;->h:Z

    .line 43
    .line 44
    iget-boolean v0, p1, Ldefpackage/n83;->j:Z

    .line 45
    .line 46
    iput-boolean v0, p0, Ldefpackage/o83;->i:Z

    .line 47
    .line 48
    iget-object v0, p1, Ldefpackage/n83;->k:Ldefpackage/be0;

    .line 49
    .line 50
    iput-object v0, p0, Ldefpackage/o83;->j:Ldefpackage/be0;

    .line 51
    .line 52
    iget-object v0, p1, Ldefpackage/n83;->l:Ldefpackage/hx;

    .line 53
    .line 54
    iput-object v0, p0, Ldefpackage/o83;->k:Ldefpackage/hx;

    .line 55
    .line 56
    iget-object v0, p1, Ldefpackage/n83;->m:Ldefpackage/fz0;

    .line 57
    .line 58
    iput-object v0, p0, Ldefpackage/o83;->l:Ldefpackage/fz0;

    .line 59
    .line 60
    iget-object v0, p1, Ldefpackage/n83;->n:Ljava/net/ProxySelector;

    .line 61
    .line 62
    if-nez v0, :cond_0

    .line 63
    .line 64
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :cond_0
    if-nez v0, :cond_1

    .line 69
    .line 70
    sget-object v0, Ldefpackage/l73;->a:Ldefpackage/l73;

    .line 71
    .line 72
    :cond_1
    iput-object v0, p0, Ldefpackage/o83;->m:Ljava/net/ProxySelector;

    .line 73
    .line 74
    iget-object v0, p1, Ldefpackage/n83;->o:Ldefpackage/fz0;

    .line 75
    .line 76
    iput-object v0, p0, Ldefpackage/o83;->n:Ldefpackage/fz0;

    .line 77
    .line 78
    iget-object v0, p1, Ldefpackage/n83;->p:Ljavax/net/SocketFactory;

    .line 79
    .line 80
    iput-object v0, p0, Ldefpackage/o83;->o:Ljavax/net/SocketFactory;

    .line 81
    .line 82
    iget-object v0, p1, Ldefpackage/n83;->s:Ljava/util/List;

    .line 83
    .line 84
    iput-object v0, p0, Ldefpackage/o83;->r:Ljava/util/List;

    .line 85
    .line 86
    iget-object v1, p1, Ldefpackage/n83;->t:Ljava/util/List;

    .line 87
    .line 88
    iput-object v1, p0, Ldefpackage/o83;->s:Ljava/util/List;

    .line 89
    .line 90
    iget-object v1, p1, Ldefpackage/n83;->u:Ldefpackage/m83;

    .line 91
    .line 92
    iput-object v1, p0, Ldefpackage/o83;->t:Ldefpackage/m83;

    .line 93
    .line 94
    iget v1, p1, Ldefpackage/n83;->x:I

    .line 95
    .line 96
    iput v1, p0, Ldefpackage/o83;->w:I

    .line 97
    .line 98
    iget v4, p1, Ldefpackage/n83;->y:I

    .line 99
    .line 100
    iput v4, p0, Ldefpackage/o83;->x:I

    .line 101
    .line 102
    iget v2, p1, Ldefpackage/n83;->z:I

    .line 103
    .line 104
    iput v2, p0, Ldefpackage/o83;->y:I

    .line 105
    .line 106
    iget v3, p1, Ldefpackage/n83;->A:I

    .line 107
    .line 108
    iput v3, p0, Ldefpackage/o83;->z:I

    .line 109
    .line 110
    iget v1, p1, Ldefpackage/n83;->B:I

    .line 111
    .line 112
    iput v1, p0, Ldefpackage/o83;->A:I

    .line 113
    .line 114
    iget-wide v8, p1, Ldefpackage/n83;->C:J

    .line 115
    .line 116
    iput-wide v8, p0, Ldefpackage/o83;->B:J

    .line 117
    .line 118
    iget-object v1, p1, Ldefpackage/n83;->D:Ldefpackage/rm2;

    .line 119
    .line 120
    if-nez v1, :cond_2

    .line 121
    .line 122
    new-instance v1, Ldefpackage/rm2;

    .line 123
    .line 124
    const/16 v5, 0xe

    .line 125
    .line 126
    invoke-direct {v1, v5}, Ldefpackage/rm2;-><init>(I)V

    .line 127
    .line 128
    .line 129
    :cond_2
    move-object v8, v1

    .line 130
    iput-object v8, p0, Ldefpackage/o83;->C:Ldefpackage/rm2;

    .line 131
    .line 132
    iget-object v1, p1, Ldefpackage/n83;->E:Ldefpackage/gr4;

    .line 133
    .line 134
    if-nez v1, :cond_3

    .line 135
    .line 136
    sget-object v1, Ldefpackage/gr4;->l:Ldefpackage/gr4;

    .line 137
    .line 138
    :cond_3
    iput-object v1, p0, Ldefpackage/o83;->D:Ldefpackage/gr4;

    .line 139
    .line 140
    iget-object v1, p1, Ldefpackage/n83;->b:Ldefpackage/d34;

    .line 141
    .line 142
    if-nez v1, :cond_4

    .line 143
    .line 144
    new-instance v1, Ldefpackage/d34;

    .line 145
    .line 146
    move v5, v2

    .line 147
    invoke-direct/range {v1 .. v8}, Ldefpackage/d34;-><init>(IIIIZZLdefpackage/rm2;)V

    .line 148
    .line 149
    .line 150
    iput-object v1, p1, Ldefpackage/n83;->b:Ldefpackage/d34;

    .line 151
    .line 152
    :cond_4
    iput-object v1, p0, Ldefpackage/o83;->E:Ldefpackage/d34;

    .line 153
    .line 154
    const/4 v1, 0x0

    .line 155
    if-eqz v0, :cond_5

    .line 156
    .line 157
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eqz v2, :cond_5

    .line 162
    .line 163
    goto/16 :goto_2

    .line 164
    .line 165
    :cond_5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-eqz v2, :cond_a

    .line 174
    .line 175
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    check-cast v2, Ldefpackage/ma0;

    .line 180
    .line 181
    iget-boolean v2, v2, Ldefpackage/ma0;->a:Z

    .line 182
    .line 183
    if-eqz v2, :cond_6

    .line 184
    .line 185
    iget-object v0, p1, Ldefpackage/n83;->q:Ljavax/net/ssl/SSLSocketFactory;

    .line 186
    .line 187
    if-eqz v0, :cond_8

    .line 188
    .line 189
    iput-object v0, p0, Ldefpackage/o83;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 190
    .line 191
    iget-object v0, p1, Ldefpackage/n83;->w:Ldefpackage/rr2;

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    iput-object v0, p0, Ldefpackage/o83;->v:Ldefpackage/rr2;

    .line 197
    .line 198
    iget-object v2, p1, Ldefpackage/n83;->r:Ljavax/net/ssl/X509TrustManager;

    .line 199
    .line 200
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    iput-object v2, p0, Ldefpackage/o83;->q:Ljavax/net/ssl/X509TrustManager;

    .line 204
    .line 205
    iget-object p1, p1, Ldefpackage/n83;->v:Ldefpackage/o00;

    .line 206
    .line 207
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    iget-object v2, p1, Ldefpackage/o00;->b:Ldefpackage/rr2;

    .line 211
    .line 212
    invoke-static {v2, v0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-eqz v2, :cond_7

    .line 217
    .line 218
    goto :goto_0

    .line 219
    :cond_7
    new-instance v2, Ldefpackage/o00;

    .line 220
    .line 221
    iget-object p1, p1, Ldefpackage/o00;->a:Ljava/util/Set;

    .line 222
    .line 223
    invoke-direct {v2, p1, v0}, Ldefpackage/o00;-><init>(Ljava/util/Set;Ldefpackage/rr2;)V

    .line 224
    .line 225
    .line 226
    move-object p1, v2

    .line 227
    :goto_0
    iput-object p1, p0, Ldefpackage/o83;->u:Ldefpackage/o00;

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_8
    sget-object v0, Ldefpackage/qg3;->a:Ldefpackage/qg3;

    .line 231
    .line 232
    sget-object v0, Ldefpackage/qg3;->a:Ldefpackage/qg3;

    .line 233
    .line 234
    invoke-virtual {v0}, Ldefpackage/qg3;->m()Ljavax/net/ssl/X509TrustManager;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    iput-object v0, p0, Ldefpackage/o83;->q:Ljavax/net/ssl/X509TrustManager;

    .line 239
    .line 240
    sget-object v2, Ldefpackage/qg3;->a:Ldefpackage/qg3;

    .line 241
    .line 242
    invoke-virtual {v2, v0}, Ldefpackage/qg3;->l(Ljavax/net/ssl/X509TrustManager;)Ljavax/net/ssl/SSLSocketFactory;

    .line 243
    .line 244
    .line 245
    move-result-object v2

    .line 246
    iput-object v2, p0, Ldefpackage/o83;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 247
    .line 248
    sget-object v2, Ldefpackage/qg3;->a:Ldefpackage/qg3;

    .line 249
    .line 250
    invoke-virtual {v2, v0}, Ldefpackage/qg3;->b(Ljavax/net/ssl/X509TrustManager;)Ldefpackage/rr2;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    iput-object v0, p0, Ldefpackage/o83;->v:Ldefpackage/rr2;

    .line 255
    .line 256
    iget-object p1, p1, Ldefpackage/n83;->v:Ldefpackage/o00;

    .line 257
    .line 258
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    iget-object v2, p1, Ldefpackage/o00;->b:Ldefpackage/rr2;

    .line 262
    .line 263
    invoke-static {v2, v0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 264
    .line 265
    .line 266
    move-result v2

    .line 267
    if-eqz v2, :cond_9

    .line 268
    .line 269
    goto :goto_1

    .line 270
    :cond_9
    new-instance v2, Ldefpackage/o00;

    .line 271
    .line 272
    iget-object p1, p1, Ldefpackage/o00;->a:Ljava/util/Set;

    .line 273
    .line 274
    invoke-direct {v2, p1, v0}, Ldefpackage/o00;-><init>(Ljava/util/Set;Ldefpackage/rr2;)V

    .line 275
    .line 276
    .line 277
    move-object p1, v2

    .line 278
    :goto_1
    iput-object p1, p0, Ldefpackage/o83;->u:Ldefpackage/o00;

    .line 279
    .line 280
    goto :goto_3

    .line 281
    :cond_a
    :goto_2
    iput-object v1, p0, Ldefpackage/o83;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 282
    .line 283
    iput-object v1, p0, Ldefpackage/o83;->v:Ldefpackage/rr2;

    .line 284
    .line 285
    iput-object v1, p0, Ldefpackage/o83;->q:Ljavax/net/ssl/X509TrustManager;

    .line 286
    .line 287
    sget-object p1, Ldefpackage/o00;->c:Ldefpackage/o00;

    .line 288
    .line 289
    iput-object p1, p0, Ldefpackage/o83;->u:Ldefpackage/o00;

    .line 290
    .line 291
    :goto_3
    iget-object p1, p0, Ldefpackage/o83;->q:Ljavax/net/ssl/X509TrustManager;

    .line 292
    .line 293
    iget-object v0, p0, Ldefpackage/o83;->v:Ldefpackage/rr2;

    .line 294
    .line 295
    iget-object v2, p0, Ldefpackage/o83;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 296
    .line 297
    iget-object v3, p0, Ldefpackage/o83;->c:Ljava/util/List;

    .line 298
    .line 299
    iget-object v4, p0, Ldefpackage/o83;->b:Ljava/util/List;

    .line 300
    .line 301
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    invoke-interface {v4, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v5

    .line 308
    if-nez v5, :cond_16

    .line 309
    .line 310
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    invoke-interface {v3, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    if-nez v4, :cond_15

    .line 318
    .line 319
    iget-object v3, p0, Ldefpackage/o83;->r:Ljava/util/List;

    .line 320
    .line 321
    if-eqz v3, :cond_b

    .line 322
    .line 323
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 324
    .line 325
    .line 326
    move-result v4

    .line 327
    if-eqz v4, :cond_b

    .line 328
    .line 329
    goto :goto_4

    .line 330
    :cond_b
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    :cond_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 335
    .line 336
    .line 337
    move-result v4

    .line 338
    if-eqz v4, :cond_10

    .line 339
    .line 340
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v4

    .line 344
    check-cast v4, Ldefpackage/ma0;

    .line 345
    .line 346
    iget-boolean v4, v4, Ldefpackage/ma0;->a:Z

    .line 347
    .line 348
    if-eqz v4, :cond_c

    .line 349
    .line 350
    if-eqz v2, :cond_f

    .line 351
    .line 352
    if-eqz v0, :cond_e

    .line 353
    .line 354
    if-eqz p1, :cond_d

    .line 355
    .line 356
    goto :goto_5

    .line 357
    :cond_d
    const-string p0, "x509TrustManager == null"

    .line 358
    .line 359
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    throw v1

    .line 363
    :cond_e
    const-string p0, "certificateChainCleaner == null"

    .line 364
    .line 365
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    throw v1

    .line 369
    :cond_f
    const-string p0, "sslSocketFactory == null"

    .line 370
    .line 371
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    throw v1

    .line 375
    :cond_10
    :goto_4
    const-string v3, "Check failed."

    .line 376
    .line 377
    if-nez v2, :cond_14

    .line 378
    .line 379
    if-nez v0, :cond_13

    .line 380
    .line 381
    if-nez p1, :cond_12

    .line 382
    .line 383
    iget-object p0, p0, Ldefpackage/o83;->u:Ldefpackage/o00;

    .line 384
    .line 385
    sget-object p1, Ldefpackage/o00;->c:Ldefpackage/o00;

    .line 386
    .line 387
    invoke-static {p0, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result p0

    .line 391
    if-eqz p0, :cond_11

    .line 392
    .line 393
    :goto_5
    return-void

    .line 394
    :cond_11
    invoke-static {v3}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 395
    .line 396
    .line 397
    throw v1

    .line 398
    :cond_12
    invoke-static {v3}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    throw v1

    .line 402
    :cond_13
    invoke-static {v3}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    throw v1

    .line 406
    :cond_14
    invoke-static {v3}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    throw v1

    .line 410
    :cond_15
    const-string p0, "Null network interceptor: "

    .line 411
    .line 412
    invoke-static {v3, p0}, Ldefpackage/nz2;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    throw v1

    .line 416
    :cond_16
    const-string p0, "Null interceptor: "

    .line 417
    .line 418
    invoke-static {v4, p0}, Ldefpackage/nz2;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 419
    .line 420
    .line 421
    throw v1
.end method


# virtual methods
.method public final a()Ldefpackage/n83;
    .locals 3

    .line 1
    new-instance v0, Ldefpackage/n83;

    .line 2
    .line 3
    invoke-direct {v0}, Ldefpackage/n83;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ldefpackage/o83;->a:Ldefpackage/na4;

    .line 7
    .line 8
    iput-object v1, v0, Ldefpackage/n83;->a:Ldefpackage/na4;

    .line 9
    .line 10
    iget-object v1, p0, Ldefpackage/o83;->E:Ldefpackage/d34;

    .line 11
    .line 12
    iput-object v1, v0, Ldefpackage/n83;->b:Ldefpackage/d34;

    .line 13
    .line 14
    iget-object v1, v0, Ldefpackage/n83;->c:Ljava/util/ArrayList;

    .line 15
    .line 16
    iget-object v2, p0, Ldefpackage/o83;->b:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {v2, v1}, Ldefpackage/v40;->n0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, v0, Ldefpackage/n83;->d:Ljava/util/ArrayList;

    .line 22
    .line 23
    iget-object v2, p0, Ldefpackage/o83;->c:Ljava/util/List;

    .line 24
    .line 25
    invoke-static {v2, v1}, Ldefpackage/v40;->n0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Ldefpackage/o83;->d:Ldefpackage/tb4;

    .line 29
    .line 30
    iput-object v1, v0, Ldefpackage/n83;->e:Ldefpackage/tb4;

    .line 31
    .line 32
    iget-boolean v1, p0, Ldefpackage/o83;->e:Z

    .line 33
    .line 34
    iput-boolean v1, v0, Ldefpackage/n83;->f:Z

    .line 35
    .line 36
    iget-boolean v1, p0, Ldefpackage/o83;->f:Z

    .line 37
    .line 38
    iput-boolean v1, v0, Ldefpackage/n83;->g:Z

    .line 39
    .line 40
    iget-object v1, p0, Ldefpackage/o83;->g:Ldefpackage/fz0;

    .line 41
    .line 42
    iput-object v1, v0, Ldefpackage/n83;->h:Ldefpackage/fz0;

    .line 43
    .line 44
    iget-boolean v1, p0, Ldefpackage/o83;->h:Z

    .line 45
    .line 46
    iput-boolean v1, v0, Ldefpackage/n83;->i:Z

    .line 47
    .line 48
    iget-boolean v1, p0, Ldefpackage/o83;->i:Z

    .line 49
    .line 50
    iput-boolean v1, v0, Ldefpackage/n83;->j:Z

    .line 51
    .line 52
    iget-object v1, p0, Ldefpackage/o83;->j:Ldefpackage/be0;

    .line 53
    .line 54
    iput-object v1, v0, Ldefpackage/n83;->k:Ldefpackage/be0;

    .line 55
    .line 56
    iget-object v1, p0, Ldefpackage/o83;->k:Ldefpackage/hx;

    .line 57
    .line 58
    iput-object v1, v0, Ldefpackage/n83;->l:Ldefpackage/hx;

    .line 59
    .line 60
    iget-object v1, p0, Ldefpackage/o83;->l:Ldefpackage/fz0;

    .line 61
    .line 62
    iput-object v1, v0, Ldefpackage/n83;->m:Ldefpackage/fz0;

    .line 63
    .line 64
    iget-object v1, p0, Ldefpackage/o83;->m:Ljava/net/ProxySelector;

    .line 65
    .line 66
    iput-object v1, v0, Ldefpackage/n83;->n:Ljava/net/ProxySelector;

    .line 67
    .line 68
    iget-object v1, p0, Ldefpackage/o83;->n:Ldefpackage/fz0;

    .line 69
    .line 70
    iput-object v1, v0, Ldefpackage/n83;->o:Ldefpackage/fz0;

    .line 71
    .line 72
    iget-object v1, p0, Ldefpackage/o83;->o:Ljavax/net/SocketFactory;

    .line 73
    .line 74
    iput-object v1, v0, Ldefpackage/n83;->p:Ljavax/net/SocketFactory;

    .line 75
    .line 76
    iget-object v1, p0, Ldefpackage/o83;->p:Ljavax/net/ssl/SSLSocketFactory;

    .line 77
    .line 78
    iput-object v1, v0, Ldefpackage/n83;->q:Ljavax/net/ssl/SSLSocketFactory;

    .line 79
    .line 80
    iget-object v1, p0, Ldefpackage/o83;->q:Ljavax/net/ssl/X509TrustManager;

    .line 81
    .line 82
    iput-object v1, v0, Ldefpackage/n83;->r:Ljavax/net/ssl/X509TrustManager;

    .line 83
    .line 84
    iget-object v1, p0, Ldefpackage/o83;->r:Ljava/util/List;

    .line 85
    .line 86
    iput-object v1, v0, Ldefpackage/n83;->s:Ljava/util/List;

    .line 87
    .line 88
    iget-object v1, p0, Ldefpackage/o83;->s:Ljava/util/List;

    .line 89
    .line 90
    iput-object v1, v0, Ldefpackage/n83;->t:Ljava/util/List;

    .line 91
    .line 92
    iget-object v1, p0, Ldefpackage/o83;->t:Ldefpackage/m83;

    .line 93
    .line 94
    iput-object v1, v0, Ldefpackage/n83;->u:Ldefpackage/m83;

    .line 95
    .line 96
    iget-object v1, p0, Ldefpackage/o83;->u:Ldefpackage/o00;

    .line 97
    .line 98
    iput-object v1, v0, Ldefpackage/n83;->v:Ldefpackage/o00;

    .line 99
    .line 100
    iget-object v1, p0, Ldefpackage/o83;->v:Ldefpackage/rr2;

    .line 101
    .line 102
    iput-object v1, v0, Ldefpackage/n83;->w:Ldefpackage/rr2;

    .line 103
    .line 104
    iget v1, p0, Ldefpackage/o83;->w:I

    .line 105
    .line 106
    iput v1, v0, Ldefpackage/n83;->x:I

    .line 107
    .line 108
    iget v1, p0, Ldefpackage/o83;->x:I

    .line 109
    .line 110
    iput v1, v0, Ldefpackage/n83;->y:I

    .line 111
    .line 112
    iget v1, p0, Ldefpackage/o83;->y:I

    .line 113
    .line 114
    iput v1, v0, Ldefpackage/n83;->z:I

    .line 115
    .line 116
    iget v1, p0, Ldefpackage/o83;->z:I

    .line 117
    .line 118
    iput v1, v0, Ldefpackage/n83;->A:I

    .line 119
    .line 120
    iget v1, p0, Ldefpackage/o83;->A:I

    .line 121
    .line 122
    iput v1, v0, Ldefpackage/n83;->B:I

    .line 123
    .line 124
    iget-wide v1, p0, Ldefpackage/o83;->B:J

    .line 125
    .line 126
    iput-wide v1, v0, Ldefpackage/n83;->C:J

    .line 127
    .line 128
    iget-object v1, p0, Ldefpackage/o83;->C:Ldefpackage/rm2;

    .line 129
    .line 130
    iput-object v1, v0, Ldefpackage/n83;->D:Ldefpackage/rm2;

    .line 131
    .line 132
    iget-object p0, p0, Ldefpackage/o83;->D:Ldefpackage/gr4;

    .line 133
    .line 134
    iput-object p0, v0, Ldefpackage/n83;->E:Ldefpackage/gr4;

    .line 135
    .line 136
    return-object v0
.end method
