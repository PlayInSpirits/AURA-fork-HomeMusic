.class public final Lokhttp3/internal/publicsuffix/b;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final g:Lge3;

.field public static final h:[B

.field public static final i:Ljava/util/List;

.field public static final j:Lokhttp3/internal/publicsuffix/b;


# instance fields
.field public final a:Lge3;

.field public final b:Lb71;

.field public final c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final d:Ljava/util/concurrent/CountDownLatch;

.field public e:[B

.field public f:[B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Lge3;->o:Ljava/lang/String;

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v1, "/okhttp3/internal/publicsuffix/"

    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-class v1, Lokhttp3/internal/publicsuffix/b;

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, ".gz"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {v0}, Ltv1;->z(Ljava/lang/String;)Lge3;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Lokhttp3/internal/publicsuffix/b;->g:Lge3;

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    new-array v0, v0, [B

    .line 36
    .line 37
    const/16 v1, 0x2a

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    aput-byte v1, v0, v2

    .line 41
    .line 42
    sput-object v0, Lokhttp3/internal/publicsuffix/b;->h:[B

    .line 43
    .line 44
    const-string v0, "*"

    .line 45
    .line 46
    invoke-static {v0}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sput-object v0, Lokhttp3/internal/publicsuffix/b;->i:Ljava/util/List;

    .line 51
    .line 52
    new-instance v0, Lokhttp3/internal/publicsuffix/b;

    .line 53
    .line 54
    invoke-direct {v0}, Lokhttp3/internal/publicsuffix/b;-><init>()V

    .line 55
    .line 56
    .line 57
    sput-object v0, Lokhttp3/internal/publicsuffix/b;->j:Lokhttp3/internal/publicsuffix/b;

    .line 58
    .line 59
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    sget-object v0, Lb71;->b:Ly04;

    .line 2
    .line 3
    sget-object v1, Lokhttp3/internal/publicsuffix/b;->g:Lge3;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lokhttp3/internal/publicsuffix/b;->a:Lge3;

    .line 15
    .line 16
    iput-object v0, p0, Lokhttp3/internal/publicsuffix/b;->b:Lb71;

    .line 17
    .line 18
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lokhttp3/internal/publicsuffix/b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    .line 26
    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lokhttp3/internal/publicsuffix/b;->d:Ljava/util/concurrent/CountDownLatch;

    .line 33
    .line 34
    return-void
.end method

.method public static c(Ljava/lang/String;)Ljava/util/List;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    new-array v1, v0, [C

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const/16 v3, 0x2e

    .line 6
    .line 7
    aput-char v3, v1, v2

    .line 8
    .line 9
    invoke-static {p0, v1}, Lqm4;->D0(Ljava/lang/String;[C)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {p0}, Lq40;->C0(Ljava/util/List;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const-string v3, ""

    .line 18
    .line 19
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    sub-int/2addr v1, v0

    .line 30
    if-gez v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v2, v1

    .line 34
    :goto_0
    invoke-static {p0, v2}, Lq40;->L0(Ljava/util/List;I)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    :cond_1
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 13

    .line 1
    invoke-static {p1}, Ljava/net/IDN;->toUnicode(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lokhttp3/internal/publicsuffix/b;->c(Ljava/lang/String;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Lu01;->n:Lu01;

    .line 13
    .line 14
    iget-object v2, p0, Lokhttp3/internal/publicsuffix/b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x1

    .line 22
    if-nez v2, :cond_1

    .line 23
    .line 24
    iget-object v2, p0, Lokhttp3/internal/publicsuffix/b;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    .line 26
    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    move v2, v3

    .line 33
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lokhttp3/internal/publicsuffix/b;->b()V
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 43
    .line 44
    .line 45
    goto :goto_3

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto :goto_2

    .line 48
    :catch_0
    move-exception v5

    .line 49
    :try_start_1
    sget-object v6, Lqg3;->a:Lqg3;

    .line 50
    .line 51
    sget-object v6, Lqg3;->a:Lqg3;

    .line 52
    .line 53
    const-string v7, "Failed to read public suffix list"

    .line 54
    .line 55
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    const/4 v6, 0x5

    .line 59
    invoke-static {v7, v6, v5}, Lqg3;->i(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    if-eqz v2, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :catch_1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    .line 68
    move v2, v4

    .line 69
    goto :goto_0

    .line 70
    :goto_2
    if-eqz v2, :cond_0

    .line 71
    .line 72
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 77
    .line 78
    .line 79
    :cond_0
    throw p0

    .line 80
    :cond_1
    :try_start_2
    iget-object v2, p0, Lokhttp3/internal/publicsuffix/b;->d:Ljava/util/concurrent/CountDownLatch;

    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_2

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :catch_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v2}, Ljava/lang/Thread;->interrupt()V

    .line 91
    .line 92
    .line 93
    :cond_2
    :goto_3
    iget-object v2, p0, Lokhttp3/internal/publicsuffix/b;->e:[B

    .line 94
    .line 95
    const/4 v5, 0x0

    .line 96
    if-eqz v2, :cond_17

    .line 97
    .line 98
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    new-array v6, v2, [[B

    .line 103
    .line 104
    move v7, v3

    .line 105
    :goto_4
    if-ge v7, v2, :cond_3

    .line 106
    .line 107
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    check-cast v8, Ljava/lang/String;

    .line 112
    .line 113
    sget-object v9, Lw10;->a:Ljava/nio/charset/Charset;

    .line 114
    .line 115
    invoke-virtual {v8, v9}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 116
    .line 117
    .line 118
    move-result-object v8

    .line 119
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    aput-object v8, v6, v7

    .line 123
    .line 124
    add-int/lit8 v7, v7, 0x1

    .line 125
    .line 126
    goto :goto_4

    .line 127
    :cond_3
    move v7, v3

    .line 128
    :goto_5
    const-string v8, "publicSuffixListBytes"

    .line 129
    .line 130
    if-ge v7, v2, :cond_6

    .line 131
    .line 132
    iget-object v9, p0, Lokhttp3/internal/publicsuffix/b;->e:[B

    .line 133
    .line 134
    if-eqz v9, :cond_5

    .line 135
    .line 136
    invoke-static {v9, v6, v7}, Lokhttp3/internal/publicsuffix/a;->a([B[[BI)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v9

    .line 140
    if-eqz v9, :cond_4

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_5
    invoke-static {v8}, Lh12;->Q(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    throw v5

    .line 150
    :cond_6
    move-object v9, v5

    .line 151
    :goto_6
    if-le v2, v4, :cond_9

    .line 152
    .line 153
    invoke-virtual {v6}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    check-cast v7, [[B

    .line 158
    .line 159
    array-length v10, v7

    .line 160
    sub-int/2addr v10, v4

    .line 161
    move v11, v3

    .line 162
    :goto_7
    if-ge v11, v10, :cond_9

    .line 163
    .line 164
    sget-object v12, Lokhttp3/internal/publicsuffix/b;->h:[B

    .line 165
    .line 166
    aput-object v12, v7, v11

    .line 167
    .line 168
    iget-object v12, p0, Lokhttp3/internal/publicsuffix/b;->e:[B

    .line 169
    .line 170
    if-eqz v12, :cond_8

    .line 171
    .line 172
    invoke-static {v12, v7, v11}, Lokhttp3/internal/publicsuffix/a;->a([B[[BI)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v12

    .line 176
    if-eqz v12, :cond_7

    .line 177
    .line 178
    goto :goto_8

    .line 179
    :cond_7
    add-int/lit8 v11, v11, 0x1

    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_8
    invoke-static {v8}, Lh12;->Q(Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    throw v5

    .line 186
    :cond_9
    move-object v12, v5

    .line 187
    :goto_8
    if-eqz v12, :cond_c

    .line 188
    .line 189
    sub-int/2addr v2, v4

    .line 190
    move v7, v3

    .line 191
    :goto_9
    if-ge v7, v2, :cond_c

    .line 192
    .line 193
    iget-object v8, p0, Lokhttp3/internal/publicsuffix/b;->f:[B

    .line 194
    .line 195
    if-eqz v8, :cond_b

    .line 196
    .line 197
    invoke-static {v8, v6, v7}, Lokhttp3/internal/publicsuffix/a;->a([B[[BI)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v8

    .line 201
    if-eqz v8, :cond_a

    .line 202
    .line 203
    goto :goto_a

    .line 204
    :cond_a
    add-int/lit8 v7, v7, 0x1

    .line 205
    .line 206
    goto :goto_9

    .line 207
    :cond_b
    const-string p0, "publicSuffixExceptionListBytes"

    .line 208
    .line 209
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    throw v5

    .line 213
    :cond_c
    move-object v8, v5

    .line 214
    :goto_a
    const/16 p0, 0x2e

    .line 215
    .line 216
    if-eqz v8, :cond_d

    .line 217
    .line 218
    const-string v1, "!"

    .line 219
    .line 220
    invoke-virtual {v1, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    new-array v2, v4, [C

    .line 225
    .line 226
    aput-char p0, v2, v3

    .line 227
    .line 228
    invoke-static {v1, v2}, Lqm4;->D0(Ljava/lang/String;[C)Ljava/util/List;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    goto :goto_c

    .line 233
    :cond_d
    if-nez v9, :cond_e

    .line 234
    .line 235
    if-nez v12, :cond_e

    .line 236
    .line 237
    sget-object p0, Lokhttp3/internal/publicsuffix/b;->i:Ljava/util/List;

    .line 238
    .line 239
    goto :goto_c

    .line 240
    :cond_e
    if-eqz v9, :cond_f

    .line 241
    .line 242
    new-array v2, v4, [C

    .line 243
    .line 244
    aput-char p0, v2, v3

    .line 245
    .line 246
    invoke-static {v9, v2}, Lqm4;->D0(Ljava/lang/String;[C)Ljava/util/List;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    goto :goto_b

    .line 251
    :cond_f
    move-object v2, v1

    .line 252
    :goto_b
    if-eqz v12, :cond_10

    .line 253
    .line 254
    new-array v1, v4, [C

    .line 255
    .line 256
    aput-char p0, v1, v3

    .line 257
    .line 258
    invoke-static {v12, v1}, Lqm4;->D0(Ljava/lang/String;[C)Ljava/util/List;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    :cond_10
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 263
    .line 264
    .line 265
    move-result p0

    .line 266
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 267
    .line 268
    .line 269
    move-result v6

    .line 270
    if-le p0, v6, :cond_11

    .line 271
    .line 272
    move-object p0, v2

    .line 273
    goto :goto_c

    .line 274
    :cond_11
    move-object p0, v1

    .line 275
    :goto_c
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 280
    .line 281
    .line 282
    move-result v2

    .line 283
    const/16 v6, 0x21

    .line 284
    .line 285
    if-ne v1, v2, :cond_12

    .line 286
    .line 287
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v1

    .line 291
    check-cast v1, Ljava/lang/String;

    .line 292
    .line 293
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 294
    .line 295
    .line 296
    move-result v1

    .line 297
    if-eq v1, v6, :cond_12

    .line 298
    .line 299
    return-object v5

    .line 300
    :cond_12
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    check-cast v1, Ljava/lang/String;

    .line 305
    .line 306
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 307
    .line 308
    .line 309
    move-result v1

    .line 310
    if-ne v1, v6, :cond_13

    .line 311
    .line 312
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 317
    .line 318
    .line 319
    move-result p0

    .line 320
    :goto_d
    sub-int/2addr v0, p0

    .line 321
    goto :goto_e

    .line 322
    :cond_13
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 323
    .line 324
    .line 325
    move-result v0

    .line 326
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 327
    .line 328
    .line 329
    move-result p0

    .line 330
    add-int/2addr p0, v4

    .line 331
    goto :goto_d

    .line 332
    :goto_e
    invoke-static {p1}, Lokhttp3/internal/publicsuffix/b;->c(Ljava/lang/String;)Ljava/util/List;

    .line 333
    .line 334
    .line 335
    move-result-object p0

    .line 336
    new-instance p1, Lw40;

    .line 337
    .line 338
    invoke-direct {p1, v3, p0}, Lw40;-><init>(ILjava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    if-ltz v0, :cond_16

    .line 342
    .line 343
    if-nez v0, :cond_14

    .line 344
    .line 345
    goto :goto_f

    .line 346
    :cond_14
    instance-of p0, p1, Lgx0;

    .line 347
    .line 348
    if-eqz p0, :cond_15

    .line 349
    .line 350
    check-cast p1, Lgx0;

    .line 351
    .line 352
    invoke-interface {p1, v0}, Lgx0;->b(I)Laa4;

    .line 353
    .line 354
    .line 355
    move-result-object p1

    .line 356
    goto :goto_f

    .line 357
    :cond_15
    new-instance p0, Lfx0;

    .line 358
    .line 359
    invoke-direct {p0, p1, v0, v3}, Lfx0;-><init>(Laa4;II)V

    .line 360
    .line 361
    .line 362
    move-object p1, p0

    .line 363
    :goto_f
    const-string p0, "."

    .line 364
    .line 365
    const/16 v0, 0x3e

    .line 366
    .line 367
    invoke-static {p1, p0, v5, v0}, Lfa4;->d0(Laa4;Ljava/lang/String;Lor1;I)Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object p0

    .line 371
    return-object p0

    .line 372
    :cond_16
    const-string p0, "Requested element count "

    .line 373
    .line 374
    const-string p1, " is less than zero."

    .line 375
    .line 376
    invoke-static {v0, p0, p1}, Lb11;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    invoke-static {p0}, Lkf2;->e(Ljava/lang/Object;)V

    .line 381
    .line 382
    .line 383
    return-object v5

    .line 384
    :cond_17
    sget-object p0, Lokhttp3/internal/publicsuffix/b;->g:Lge3;

    .line 385
    .line 386
    const-string p1, " resource from the classpath."

    .line 387
    .line 388
    const-string v0, "Unable to load "

    .line 389
    .line 390
    invoke-static {p0, p1, v0}, Lnz2;->z(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    return-object v5
.end method

.method public final b()V
    .locals 5

    .line 1
    :try_start_0
    new-instance v0, Ltk1;

    .line 2
    .line 3
    iget-object v1, p0, Lokhttp3/internal/publicsuffix/b;->b:Lb71;

    .line 4
    .line 5
    iget-object v2, p0, Lokhttp3/internal/publicsuffix/b;->a:Lge3;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lb71;->k(Lge3;)Lej4;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Ltk1;-><init>(Lej4;)V

    .line 12
    .line 13
    .line 14
    new-instance v1, Lxu3;

    .line 15
    .line 16
    invoke-direct {v1, v0}, Lxu3;-><init>(Lej4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    :try_start_1
    invoke-virtual {v1}, Lxu3;->readInt()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    int-to-long v2, v0

    .line 24
    invoke-virtual {v1, v2, v3}, Lxu3;->P(J)V

    .line 25
    .line 26
    .line 27
    iget-object v0, v1, Lxu3;->o:Ltv;

    .line 28
    .line 29
    invoke-virtual {v0, v2, v3}, Ltv;->F(J)[B

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v1}, Lxu3;->readInt()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    int-to-long v2, v2

    .line 38
    invoke-virtual {v1, v2, v3}, Lxu3;->P(J)V

    .line 39
    .line 40
    .line 41
    iget-object v4, v1, Lxu3;->o:Ltv;

    .line 42
    .line 43
    invoke-virtual {v4, v2, v3}, Ltv;->F(J)[B

    .line 44
    .line 45
    .line 46
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 47
    :try_start_2
    invoke-virtual {v1}, Lxu3;->close()V

    .line 48
    .line 49
    .line 50
    monitor-enter p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    :try_start_3
    iput-object v0, p0, Lokhttp3/internal/publicsuffix/b;->e:[B

    .line 52
    .line 53
    iput-object v2, p0, Lokhttp3/internal/publicsuffix/b;->f:[B
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 54
    .line 55
    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 56
    iget-object p0, p0, Lokhttp3/internal/publicsuffix/b;->d:Ljava/util/concurrent/CountDownLatch;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    goto :goto_0

    .line 64
    :catchall_1
    move-exception v0

    .line 65
    :try_start_5
    monitor-exit p0

    .line 66
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 67
    :catchall_2
    move-exception v0

    .line 68
    :try_start_6
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 69
    :catchall_3
    move-exception v2

    .line 70
    :try_start_7
    invoke-static {v1, v0}, Lq05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    throw v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 74
    :goto_0
    iget-object p0, p0, Lokhttp3/internal/publicsuffix/b;->d:Ljava/util/concurrent/CountDownLatch;

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 77
    .line 78
    .line 79
    throw v0
.end method
