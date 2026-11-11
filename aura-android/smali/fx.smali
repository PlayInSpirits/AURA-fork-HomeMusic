.class public final Lfx;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final k:Ljava/lang/String;

.field public static final l:Ljava/lang/String;


# instance fields
.field public final a:Lgr1;

.field public final b:Ltl1;

.field public final c:Ljava/lang/String;

.field public final d:Lpr3;

.field public final e:I

.field public final f:Ljava/lang/String;

.field public final g:Ltl1;

.field public final h:Ljl1;

.field public final i:J

.field public final j:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lqg3;->a:Lqg3;

    .line 2
    .line 3
    sget-object v0, Lqg3;->a:Lqg3;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v0, "OkHttp-Sent-Millis"

    .line 9
    .line 10
    sput-object v0, Lfx;->k:Ljava/lang/String;

    .line 11
    .line 12
    sget-object v0, Lqg3;->a:Lqg3;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-string v0, "OkHttp-Received-Millis"

    .line 18
    .line 19
    sput-object v0, Lfx;->l:Ljava/lang/String;

    .line 20
    .line 21
    return-void
.end method

.method public constructor <init>(Lej4;)V
    .locals 12

    .line 1
    const-string v0, "Cache corruption for "

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    :try_start_0
    new-instance v1, Lxu3;

    .line 10
    .line 11
    invoke-direct {v1, p1}, Lxu3;-><init>(Lej4;)V

    .line 12
    .line 13
    .line 14
    const-wide v2, 0x7fffffffffffffffL

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2, v3}, Lxu3;->t(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    const/4 v5, 0x0

    .line 24
    :try_start_1
    new-instance v6, Lfr1;

    .line 25
    .line 26
    invoke-direct {v6}, Lfr1;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v6, v5, v4}, Lfr1;->e(Lgr1;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v6}, Lfr1;->b()Lgr1;

    .line 33
    .line 34
    .line 35
    move-result-object v6
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    goto :goto_0

    .line 37
    :catch_0
    move-object v6, v5

    .line 38
    :goto_0
    if-eqz v6, :cond_7

    .line 39
    .line 40
    :try_start_2
    iput-object v6, p0, Lfx;->a:Lgr1;

    .line 41
    .line 42
    invoke-virtual {v1, v2, v3}, Lxu3;->t(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lfx;->c:Ljava/lang/String;

    .line 47
    .line 48
    new-instance v0, Lsl1;

    .line 49
    .line 50
    invoke-direct {v0}, Lsl1;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-static {v1}, Lsi0;->H(Lxu3;)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    const/4 v6, 0x0

    .line 58
    move v7, v6

    .line 59
    :goto_1
    if-ge v7, v4, :cond_0

    .line 60
    .line 61
    invoke-virtual {v1, v2, v3}, Lxu3;->t(J)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    invoke-virtual {v0, v8}, Lsl1;->b(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    add-int/lit8 v7, v7, 0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :catchall_0
    move-exception p0

    .line 72
    goto/16 :goto_6

    .line 73
    .line 74
    :cond_0
    invoke-virtual {v0}, Lsl1;->c()Ltl1;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iput-object v0, p0, Lfx;->b:Ltl1;

    .line 79
    .line 80
    invoke-virtual {v1, v2, v3}, Lxu3;->t(J)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v0}, Lhw;->C(Ljava/lang/String;)Lue1;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iget-object v4, v0, Lue1;->p:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v4, Lpr3;

    .line 91
    .line 92
    iput-object v4, p0, Lfx;->d:Lpr3;

    .line 93
    .line 94
    iget v4, v0, Lue1;->o:I

    .line 95
    .line 96
    iput v4, p0, Lfx;->e:I

    .line 97
    .line 98
    iget-object v0, v0, Lue1;->q:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Ljava/lang/String;

    .line 101
    .line 102
    iput-object v0, p0, Lfx;->f:Ljava/lang/String;

    .line 103
    .line 104
    new-instance v0, Lsl1;

    .line 105
    .line 106
    invoke-direct {v0}, Lsl1;-><init>()V

    .line 107
    .line 108
    .line 109
    invoke-static {v1}, Lsi0;->H(Lxu3;)I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    move v7, v6

    .line 114
    :goto_2
    if-ge v7, v4, :cond_1

    .line 115
    .line 116
    invoke-virtual {v1, v2, v3}, Lxu3;->t(J)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    invoke-virtual {v0, v8}, Lsl1;->b(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    add-int/lit8 v7, v7, 0x1

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_1
    sget-object v4, Lfx;->k:Ljava/lang/String;

    .line 127
    .line 128
    invoke-virtual {v0, v4}, Lsl1;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v7

    .line 132
    sget-object v8, Lfx;->l:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v0, v8}, Lsl1;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    invoke-virtual {v0, v4}, Lsl1;->e(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v8}, Lsl1;->e(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    const-wide/16 v10, 0x0

    .line 145
    .line 146
    if-eqz v7, :cond_2

    .line 147
    .line 148
    invoke-static {v7}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 149
    .line 150
    .line 151
    move-result-wide v7

    .line 152
    goto :goto_3

    .line 153
    :cond_2
    move-wide v7, v10

    .line 154
    :goto_3
    iput-wide v7, p0, Lfx;->i:J

    .line 155
    .line 156
    if-eqz v9, :cond_3

    .line 157
    .line 158
    invoke-static {v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 159
    .line 160
    .line 161
    move-result-wide v10

    .line 162
    :cond_3
    iput-wide v10, p0, Lfx;->j:J

    .line 163
    .line 164
    invoke-virtual {v0}, Lsl1;->c()Ltl1;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    iput-object v0, p0, Lfx;->g:Ltl1;

    .line 169
    .line 170
    iget-object v0, p0, Lfx;->a:Lgr1;

    .line 171
    .line 172
    invoke-virtual {v0}, Lgr1;->f()Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_6

    .line 177
    .line 178
    invoke-virtual {v1, v2, v3}, Lxu3;->t(J)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-gtz v4, :cond_5

    .line 187
    .line 188
    invoke-virtual {v1, v2, v3}, Lxu3;->t(J)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    sget-object v4, Lv20;->b:Lpa;

    .line 193
    .line 194
    invoke-virtual {v4, v0}, Lpa;->u(Ljava/lang/String;)Lv20;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    invoke-static {v1}, Lfx;->a(Lxu3;)Ljava/util/List;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-static {v1}, Lfx;->a(Lxu3;)Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object v5

    .line 206
    invoke-virtual {v1}, Lxu3;->l()Z

    .line 207
    .line 208
    .line 209
    move-result v7

    .line 210
    if-nez v7, :cond_4

    .line 211
    .line 212
    sget-object v7, Lmu4;->o:Lxi4;

    .line 213
    .line 214
    invoke-virtual {v1, v2, v3}, Lxu3;->t(J)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-static {v1}, Lxi4;->m(Ljava/lang/String;)Lmu4;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    goto :goto_4

    .line 226
    :cond_4
    sget-object v1, Lmu4;->t:Lmu4;

    .line 227
    .line 228
    :goto_4
    invoke-static {v4}, Lze5;->k(Ljava/util/List;)Ljava/util/List;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    new-instance v3, Ljl1;

    .line 233
    .line 234
    invoke-static {v5}, Lze5;->k(Ljava/util/List;)Ljava/util/List;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    new-instance v5, Lhl1;

    .line 239
    .line 240
    invoke-direct {v5, v2, v6}, Lhl1;-><init>(Ljava/util/List;I)V

    .line 241
    .line 242
    .line 243
    invoke-direct {v3, v1, v0, v4, v5}, Ljl1;-><init>(Lmu4;Lv20;Ljava/util/List;Lgf1;)V

    .line 244
    .line 245
    .line 246
    iput-object v3, p0, Lfx;->h:Ljl1;

    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_5
    new-instance p0, Ljava/io/IOException;

    .line 250
    .line 251
    new-instance v1, Ljava/lang/StringBuilder;

    .line 252
    .line 253
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 254
    .line 255
    .line 256
    const-string v2, "expected \"\" but was \""

    .line 257
    .line 258
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    const/16 v0, 0x22

    .line 265
    .line 266
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    throw p0

    .line 277
    :cond_6
    iput-object v5, p0, Lfx;->h:Ljl1;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 278
    .line 279
    :goto_5
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    .line 280
    .line 281
    .line 282
    return-void

    .line 283
    :cond_7
    :try_start_3
    new-instance p0, Ljava/io/IOException;

    .line 284
    .line 285
    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    sget-object v0, Lqg3;->a:Lqg3;

    .line 293
    .line 294
    sget-object v0, Lqg3;->a:Lqg3;

    .line 295
    .line 296
    const-string v1, "cache corruption"

    .line 297
    .line 298
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    const/4 v0, 0x5

    .line 302
    invoke-static {v1, v0, p0}, Lqg3;->i(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 303
    .line 304
    .line 305
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 306
    :goto_6
    :try_start_4
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 307
    :catchall_1
    move-exception v0

    .line 308
    invoke-static {p1, p0}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 309
    .line 310
    .line 311
    throw v0
.end method

.method public constructor <init>(Lk14;)V
    .locals 9

    .line 312
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 313
    iget-object v0, p1, Lk14;->n:Loz3;

    .line 314
    iget-object v1, v0, Loz3;->a:Lgr1;

    .line 315
    iput-object v1, p0, Lfx;->a:Lgr1;

    .line 316
    iget-object v1, p1, Lk14;->u:Lk14;

    .line 317
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    iget-object v1, v1, Lk14;->n:Loz3;

    .line 319
    iget-object v1, v1, Loz3;->c:Ltl1;

    .line 320
    iget-object v2, p1, Lk14;->s:Ltl1;

    .line 321
    invoke-static {v2}, Lsi0;->U(Ltl1;)Ljava/util/Set;

    move-result-object v3

    .line 322
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v1, Lze5;->a:Ltl1;

    goto :goto_1

    .line 323
    :cond_0
    new-instance v4, Lsl1;

    invoke-direct {v4}, Lsl1;-><init>()V

    .line 324
    invoke-virtual {v1}, Ltl1;->size()I

    move-result v5

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_2

    .line 325
    invoke-virtual {v1, v6}, Ltl1;->b(I)Ljava/lang/String;

    move-result-object v7

    .line 326
    invoke-interface {v3, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 327
    invoke-virtual {v1, v6}, Ltl1;->e(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v7, v8}, Lsl1;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 328
    :cond_2
    invoke-virtual {v4}, Lsl1;->c()Ltl1;

    move-result-object v1

    .line 329
    :goto_1
    iput-object v1, p0, Lfx;->b:Ltl1;

    .line 330
    iget-object v0, v0, Loz3;->b:Ljava/lang/String;

    .line 331
    iput-object v0, p0, Lfx;->c:Ljava/lang/String;

    .line 332
    iget-object v0, p1, Lk14;->o:Lpr3;

    .line 333
    iput-object v0, p0, Lfx;->d:Lpr3;

    .line 334
    iget v0, p1, Lk14;->q:I

    .line 335
    iput v0, p0, Lfx;->e:I

    .line 336
    iget-object v0, p1, Lk14;->p:Ljava/lang/String;

    .line 337
    iput-object v0, p0, Lfx;->f:Ljava/lang/String;

    .line 338
    iput-object v2, p0, Lfx;->g:Ltl1;

    .line 339
    iget-object v0, p1, Lk14;->r:Ljl1;

    .line 340
    iput-object v0, p0, Lfx;->h:Ljl1;

    .line 341
    iget-wide v0, p1, Lk14;->x:J

    .line 342
    iput-wide v0, p0, Lfx;->i:J

    .line 343
    iget-wide v0, p1, Lk14;->y:J

    .line 344
    iput-wide v0, p0, Lfx;->j:J

    return-void
.end method

.method public static a(Lxu3;)Ljava/util/List;
    .locals 8

    .line 1
    invoke-static {p0}, Lsi0;->H(Lxu3;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    sget-object p0, Lu01;->n:Lu01;

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    :try_start_0
    const-string v1, "X.509"

    .line 12
    .line 13
    invoke-static {v1}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    new-instance v2, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x0

    .line 23
    move v4, v3

    .line 24
    :goto_0
    if-ge v4, v0, :cond_2

    .line 25
    .line 26
    const-wide v5, 0x7fffffffffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v5, v6}, Lxu3;->t(J)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    new-instance v6, Ltv;

    .line 36
    .line 37
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    sget-object v7, Lyw;->q:Lyw;

    .line 41
    .line 42
    invoke-static {v5}, Lpa;->r(Ljava/lang/String;)Lyw;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    if-eqz v5, :cond_1

    .line 47
    .line 48
    invoke-virtual {v6, v5}, Ltv;->X(Lyw;)V

    .line 49
    .line 50
    .line 51
    new-instance v5, Lrv;

    .line 52
    .line 53
    invoke-direct {v5, v6, v3}, Lrv;-><init>(Lfw;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v5}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    add-int/lit8 v4, v4, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    new-instance p0, Ljava/io/IOException;

    .line 67
    .line 68
    const-string v0, "Corrupt certificate in cache entry"

    .line 69
    .line 70
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p0
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    :cond_2
    return-object v2

    .line 75
    :catch_0
    move-exception p0

    .line 76
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, Lmj0;->i(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const/4 p0, 0x0

    .line 84
    return-object p0
.end method

.method public static b(Lwu3;Ljava/util/List;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    invoke-virtual {p0, v0, v1}, Lwu3;->Q(J)Lew;

    .line 7
    .line 8
    .line 9
    const/16 v0, 0xa

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lwu3;->writeByte(I)Lew;

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/security/cert/Certificate;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/security/cert/Certificate;->getEncoded()[B

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget-object v2, Lyw;->q:Lyw;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-static {v1}, Lpa;->A([B)Lyw;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Lyw;->a()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {p0, v1}, Lwu3;->y(Ljava/lang/String;)Lew;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lwu3;->writeByte(I)Lew;
    :try_end_0
    .catch Ljava/security/cert/CertificateEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    return-void

    .line 55
    :catch_0
    move-exception p0

    .line 56
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {p0}, Lmj0;->i(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final c(Lll;)V
    .locals 11

    .line 1
    iget-object v0, p0, Lfx;->a:Lgr1;

    .line 2
    .line 3
    iget-object v1, p0, Lfx;->h:Ljl1;

    .line 4
    .line 5
    iget-object v2, p0, Lfx;->g:Ltl1;

    .line 6
    .line 7
    iget-object v3, p0, Lfx;->b:Ltl1;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-virtual {p1, v4}, Lll;->i(I)Lof4;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    new-instance v5, Lwu3;

    .line 15
    .line 16
    invoke-direct {v5, p1}, Lwu3;-><init>(Lof4;)V

    .line 17
    .line 18
    .line 19
    :try_start_0
    iget-object p1, v0, Lgr1;->i:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v5, p1}, Lwu3;->y(Ljava/lang/String;)Lew;

    .line 22
    .line 23
    .line 24
    const/16 p1, 0xa

    .line 25
    .line 26
    invoke-virtual {v5, p1}, Lwu3;->writeByte(I)Lew;

    .line 27
    .line 28
    .line 29
    iget-object v6, p0, Lfx;->c:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v5, v6}, Lwu3;->y(Ljava/lang/String;)Lew;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v5, p1}, Lwu3;->writeByte(I)Lew;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Ltl1;->size()I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    int-to-long v6, v6

    .line 42
    invoke-virtual {v5, v6, v7}, Lwu3;->Q(J)Lew;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v5, p1}, Lwu3;->writeByte(I)Lew;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Ltl1;->size()I

    .line 49
    .line 50
    .line 51
    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    move v7, v4

    .line 53
    :goto_0
    const-string v8, ": "

    .line 54
    .line 55
    if-ge v7, v6, :cond_0

    .line 56
    .line 57
    :try_start_1
    invoke-virtual {v3, v7}, Ltl1;->b(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    invoke-virtual {v5, v9}, Lwu3;->y(Ljava/lang/String;)Lew;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5, v8}, Lwu3;->y(Ljava/lang/String;)Lew;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3, v7}, Ltl1;->e(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    invoke-interface {v5, v8}, Lew;->y(Ljava/lang/String;)Lew;

    .line 72
    .line 73
    .line 74
    invoke-interface {v5, p1}, Lew;->writeByte(I)Lew;

    .line 75
    .line 76
    .line 77
    add-int/lit8 v7, v7, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catchall_0
    move-exception p0

    .line 81
    goto/16 :goto_3

    .line 82
    .line 83
    :cond_0
    iget-object v3, p0, Lfx;->d:Lpr3;

    .line 84
    .line 85
    iget v6, p0, Lfx;->e:I

    .line 86
    .line 87
    iget-object v7, p0, Lfx;->f:Ljava/lang/String;

    .line 88
    .line 89
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    new-instance v9, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    sget-object v10, Lpr3;->p:Lpr3;

    .line 101
    .line 102
    if-ne v3, v10, :cond_1

    .line 103
    .line 104
    const-string v3, "HTTP/1.0"

    .line 105
    .line 106
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_1
    const-string v3, "HTTP/1.1"

    .line 111
    .line 112
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    :goto_1
    const/16 v3, 0x20

    .line 116
    .line 117
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-virtual {v5, v3}, Lwu3;->y(Ljava/lang/String;)Lew;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v5, p1}, Lwu3;->writeByte(I)Lew;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Ltl1;->size()I

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    add-int/lit8 v3, v3, 0x2

    .line 144
    .line 145
    int-to-long v6, v3

    .line 146
    invoke-virtual {v5, v6, v7}, Lwu3;->Q(J)Lew;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5, p1}, Lwu3;->writeByte(I)Lew;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2}, Ltl1;->size()I

    .line 153
    .line 154
    .line 155
    move-result v3

    .line 156
    :goto_2
    if-ge v4, v3, :cond_2

    .line 157
    .line 158
    invoke-virtual {v2, v4}, Ltl1;->b(I)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-virtual {v5, v6}, Lwu3;->y(Ljava/lang/String;)Lew;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v5, v8}, Lwu3;->y(Ljava/lang/String;)Lew;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2, v4}, Ltl1;->e(I)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    invoke-interface {v5, v6}, Lew;->y(Ljava/lang/String;)Lew;

    .line 173
    .line 174
    .line 175
    invoke-interface {v5, p1}, Lew;->writeByte(I)Lew;

    .line 176
    .line 177
    .line 178
    add-int/lit8 v4, v4, 0x1

    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_2
    sget-object v2, Lfx;->k:Ljava/lang/String;

    .line 182
    .line 183
    invoke-virtual {v5, v2}, Lwu3;->y(Ljava/lang/String;)Lew;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v5, v8}, Lwu3;->y(Ljava/lang/String;)Lew;

    .line 187
    .line 188
    .line 189
    iget-wide v2, p0, Lfx;->i:J

    .line 190
    .line 191
    invoke-interface {v5, v2, v3}, Lew;->Q(J)Lew;

    .line 192
    .line 193
    .line 194
    invoke-interface {v5, p1}, Lew;->writeByte(I)Lew;

    .line 195
    .line 196
    .line 197
    sget-object v2, Lfx;->l:Ljava/lang/String;

    .line 198
    .line 199
    invoke-virtual {v5, v2}, Lwu3;->y(Ljava/lang/String;)Lew;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v5, v8}, Lwu3;->y(Ljava/lang/String;)Lew;

    .line 203
    .line 204
    .line 205
    iget-wide v2, p0, Lfx;->j:J

    .line 206
    .line 207
    invoke-interface {v5, v2, v3}, Lew;->Q(J)Lew;

    .line 208
    .line 209
    .line 210
    invoke-interface {v5, p1}, Lew;->writeByte(I)Lew;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Lgr1;->f()Z

    .line 214
    .line 215
    .line 216
    move-result p0

    .line 217
    if-eqz p0, :cond_3

    .line 218
    .line 219
    invoke-virtual {v5, p1}, Lwu3;->writeByte(I)Lew;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    iget-object p0, v1, Ljl1;->b:Lv20;

    .line 226
    .line 227
    iget-object p0, p0, Lv20;->a:Ljava/lang/String;

    .line 228
    .line 229
    invoke-virtual {v5, p0}, Lwu3;->y(Ljava/lang/String;)Lew;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v5, p1}, Lwu3;->writeByte(I)Lew;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1}, Ljl1;->a()Ljava/util/List;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-static {v5, p0}, Lfx;->b(Lwu3;Ljava/util/List;)V

    .line 240
    .line 241
    .line 242
    iget-object p0, v1, Ljl1;->c:Ljava/util/List;

    .line 243
    .line 244
    invoke-static {v5, p0}, Lfx;->b(Lwu3;Ljava/util/List;)V

    .line 245
    .line 246
    .line 247
    iget-object p0, v1, Ljl1;->a:Lmu4;

    .line 248
    .line 249
    iget-object p0, p0, Lmu4;->n:Ljava/lang/String;

    .line 250
    .line 251
    invoke-virtual {v5, p0}, Lwu3;->y(Ljava/lang/String;)Lew;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v5, p1}, Lwu3;->writeByte(I)Lew;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 255
    .line 256
    .line 257
    :cond_3
    invoke-virtual {v5}, Lwu3;->close()V

    .line 258
    .line 259
    .line 260
    return-void

    .line 261
    :goto_3
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 262
    :catchall_1
    move-exception p1

    .line 263
    invoke-static {v5, p0}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 264
    .line 265
    .line 266
    throw p1
.end method
