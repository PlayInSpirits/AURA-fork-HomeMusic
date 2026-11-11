.class public final Lla0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lkg1;


# instance fields
.field public n:Z

.field public o:Z

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lla0;->n:Z

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public a()Lma0;
    .locals 4

    .line 1
    new-instance v0, Lma0;

    .line 2
    .line 3
    iget-boolean v1, p0, Lla0;->n:Z

    .line 4
    .line 5
    iget-boolean v2, p0, Lla0;->o:Z

    .line 6
    .line 7
    iget-object v3, p0, Lla0;->p:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, [Ljava/lang/String;

    .line 10
    .line 11
    iget-object p0, p0, Lla0;->q:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, [Ljava/lang/String;

    .line 14
    .line 15
    invoke-direct {v0, v1, v2, v3, p0}, Lma0;-><init>(ZZ[Ljava/lang/String;[Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public varargs b([Lv20;)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lla0;->n:Z

    .line 2
    .line 3
    const-string v1, "no cipher suites for cleartext connections"

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    array-length v2, p1

    .line 10
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    .line 12
    .line 13
    array-length v2, p1

    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    if-ge v4, v2, :cond_0

    .line 17
    .line 18
    aget-object v5, p1, v4

    .line 19
    .line 20
    iget-object v5, v5, Lv20;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    add-int/lit8 v4, v4, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-array p1, v3, [Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, [Ljava/lang/String;

    .line 35
    .line 36
    array-length v0, p1

    .line 37
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, [Ljava/lang/String;

    .line 42
    .line 43
    iget-boolean v0, p0, Lla0;->n:Z

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    array-length v0, p1

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    array-length v0, p1

    .line 51
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, [Ljava/lang/String;

    .line 56
    .line 57
    iput-object p1, p0, Lla0;->p:Ljava/lang/Object;

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    const-string p0, "At least one cipher suite is required"

    .line 61
    .line 62
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    invoke-static {v1}, Lkf2;->n(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :goto_1
    return-void

    .line 70
    :cond_3
    invoke-static {v1}, Lkf2;->n(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public varargs c([Lmu4;)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lla0;->n:Z

    .line 2
    .line 3
    const-string v1, "no TLS versions for cleartext connections"

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    array-length v2, p1

    .line 10
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 11
    .line 12
    .line 13
    array-length v2, p1

    .line 14
    const/4 v3, 0x0

    .line 15
    move v4, v3

    .line 16
    :goto_0
    if-ge v4, v2, :cond_0

    .line 17
    .line 18
    aget-object v5, p1, v4

    .line 19
    .line 20
    iget-object v5, v5, Lmu4;->n:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    add-int/lit8 v4, v4, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-array p1, v3, [Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, [Ljava/lang/String;

    .line 35
    .line 36
    array-length v0, p1

    .line 37
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    check-cast p1, [Ljava/lang/String;

    .line 42
    .line 43
    iget-boolean v0, p0, Lla0;->n:Z

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    array-length v0, p1

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    array-length v0, p1

    .line 51
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, [Ljava/lang/String;

    .line 56
    .line 57
    iput-object p1, p0, Lla0;->q:Ljava/lang/Object;

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    const-string p0, "At least one TLS version is required"

    .line 61
    .line 62
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    invoke-static {v1}, Lkf2;->n(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    :goto_1
    return-void

    .line 70
    :cond_3
    invoke-static {v1}, Lkf2;->n(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public d()V
    .locals 15

    .line 1
    iget-object v0, p0, Lla0;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lvt0;

    .line 4
    .line 5
    iget-object v0, v0, Lvt0;->q:Lut0;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, v0, Lut0;->b:Llt0;

    .line 11
    .line 12
    iget-object v0, v0, Llt0;->l:Ljava/util/List;

    .line 13
    .line 14
    iget-object v1, p0, Lla0;->q:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lvt0;

    .line 17
    .line 18
    check-cast v1, Lcom/eddyizm/tempus/service/DownloaderService;

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v2, Lc7;

    .line 25
    .line 26
    const/16 v3, 0xb

    .line 27
    .line 28
    invoke-direct {v2, v3}, Lc7;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v2}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-interface {v0, v2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    const/4 v3, 0x0

    .line 50
    const/4 v4, -0x1

    .line 51
    const v5, 0x7f080121

    .line 52
    .line 53
    .line 54
    const-string v6, "download_channel"

    .line 55
    .line 56
    const/4 v7, 0x2

    .line 57
    const/4 v8, 0x1

    .line 58
    if-eqz v2, :cond_0

    .line 59
    .line 60
    new-instance v0, Ls63;

    .line 61
    .line 62
    invoke-direct {v0, v1, v6}, Ls63;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    const v2, 0x7f1301f3

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {v1}, Ls63;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iput-object v1, v0, Ls63;->e:Ljava/lang/CharSequence;

    .line 77
    .line 78
    iget-object v1, v0, Ls63;->v:Landroid/app/Notification;

    .line 79
    .line 80
    iput v5, v1, Landroid/app/Notification;->icon:I

    .line 81
    .line 82
    invoke-virtual {v0, v7, v8}, Ls63;->c(IZ)V

    .line 83
    .line 84
    .line 85
    iput-boolean v8, v0, Ls63;->w:Z

    .line 86
    .line 87
    iput v4, v0, Ls63;->i:I

    .line 88
    .line 89
    invoke-virtual {v0}, Ls63;->a()Landroid/app/Notification;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    goto/16 :goto_5

    .line 94
    .line 95
    :cond_0
    sget v2, Lcom/eddyizm/tempus/service/DownloaderService;->x:I

    .line 96
    .line 97
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 98
    .line 99
    .line 100
    move-result v9

    .line 101
    invoke-static {v2, v9}, Ljava/lang/Math;->max(II)I

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    sget v9, Lcom/eddyizm/tempus/service/DownloaderService;->y:I

    .line 106
    .line 107
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v10

    .line 111
    :cond_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    if-eqz v11, :cond_2

    .line 116
    .line 117
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    check-cast v11, Lns0;

    .line 122
    .line 123
    iget v12, v11, Lns0;->b:I

    .line 124
    .line 125
    if-ne v12, v7, :cond_1

    .line 126
    .line 127
    sget-object v10, Lcom/eddyizm/tempus/service/DownloaderService;->z:Ljava/util/concurrent/ConcurrentHashMap;

    .line 128
    .line 129
    iget-object v11, v11, Lns0;->a:Ltt0;

    .line 130
    .line 131
    iget-object v11, v11, Ltt0;->n:Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {v10, v11}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    check-cast v10, Ljava/lang/String;

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_2
    move-object v10, v3

    .line 141
    :goto_0
    if-nez v10, :cond_4

    .line 142
    .line 143
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v11

    .line 151
    if-eqz v11, :cond_4

    .line 152
    .line 153
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v11

    .line 157
    check-cast v11, Lns0;

    .line 158
    .line 159
    iget v12, v11, Lns0;->b:I

    .line 160
    .line 161
    const/4 v13, 0x3

    .line 162
    if-eq v12, v13, :cond_3

    .line 163
    .line 164
    sget-object v10, Lcom/eddyizm/tempus/service/DownloaderService;->z:Ljava/util/concurrent/ConcurrentHashMap;

    .line 165
    .line 166
    iget-object v11, v11, Lns0;->a:Ltt0;

    .line 167
    .line 168
    iget-object v11, v11, Ltt0;->n:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v10, v11}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v10

    .line 174
    check-cast v10, Ljava/lang/String;

    .line 175
    .line 176
    if-eqz v10, :cond_3

    .line 177
    .line 178
    :cond_4
    if-eqz v10, :cond_5

    .line 179
    .line 180
    const v0, 0x7f1303be

    .line 181
    .line 182
    .line 183
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    invoke-virtual {v1, v0, v10}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    goto :goto_1

    .line 192
    :cond_5
    const v0, 0x7f1303bc

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    :goto_1
    if-lez v2, :cond_9

    .line 200
    .line 201
    add-int/lit8 v10, v9, 0x1

    .line 202
    .line 203
    invoke-static {v10, v2}, Ljava/lang/Math;->min(II)I

    .line 204
    .line 205
    .line 206
    move-result v10

    .line 207
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 208
    .line 209
    .line 210
    move-result-object v10

    .line 211
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 212
    .line 213
    .line 214
    move-result-object v11

    .line 215
    filled-new-array {v10, v11}, [Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v10

    .line 219
    const v11, 0x7f1303bb

    .line 220
    .line 221
    .line 222
    invoke-virtual {v1, v11, v10}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v10

    .line 226
    invoke-static {v10}, Lxa3;->i(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    sget v11, Lcom/eddyizm/tempus/service/DownloaderService;->w:F

    .line 231
    .line 232
    const/4 v12, 0x0

    .line 233
    cmpl-float v11, v11, v12

    .line 234
    .line 235
    if-lez v11, :cond_8

    .line 236
    .line 237
    new-instance v11, Ljava/lang/StringBuilder;

    .line 238
    .line 239
    const-string v12, " \u2022 "

    .line 240
    .line 241
    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    sget v12, Lcom/eddyizm/tempus/service/DownloaderService;->w:F

    .line 245
    .line 246
    const v13, 0x49742400    # 1000000.0f

    .line 247
    .line 248
    .line 249
    cmpl-float v14, v12, v13

    .line 250
    .line 251
    if-ltz v14, :cond_6

    .line 252
    .line 253
    sget-object v14, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 254
    .line 255
    div-float/2addr v12, v13

    .line 256
    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 257
    .line 258
    .line 259
    move-result-object v12

    .line 260
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v12

    .line 264
    const-string v13, "%.1f MB/s"

    .line 265
    .line 266
    invoke-static {v14, v13, v12}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v12

    .line 270
    goto :goto_2

    .line 271
    :cond_6
    const/high16 v13, 0x447a0000    # 1000.0f

    .line 272
    .line 273
    cmpl-float v14, v12, v13

    .line 274
    .line 275
    if-ltz v14, :cond_7

    .line 276
    .line 277
    sget-object v14, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 278
    .line 279
    div-float/2addr v12, v13

    .line 280
    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 281
    .line 282
    .line 283
    move-result-object v12

    .line 284
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v12

    .line 288
    const-string v13, "%.0f KB/s"

    .line 289
    .line 290
    invoke-static {v14, v13, v12}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    move-result-object v12

    .line 294
    goto :goto_2

    .line 295
    :cond_7
    sget-object v13, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 296
    .line 297
    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 298
    .line 299
    .line 300
    move-result-object v12

    .line 301
    filled-new-array {v12}, [Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v12

    .line 305
    const-string v14, "%.0f B/s"

    .line 306
    .line 307
    invoke-static {v13, v14, v12}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v12

    .line 311
    :goto_2
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 315
    .line 316
    .line 317
    move-result-object v11

    .line 318
    goto :goto_3

    .line 319
    :cond_8
    const-string v11, " \u2022 ? KB/s"

    .line 320
    .line 321
    :goto_3
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v10

    .line 328
    goto :goto_4

    .line 329
    :cond_9
    const v10, 0x7f1303bd

    .line 330
    .line 331
    .line 332
    invoke-virtual {v1, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object v10

    .line 336
    :goto_4
    new-instance v11, Ls63;

    .line 337
    .line 338
    invoke-direct {v11, v1, v6}, Ls63;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    invoke-static {v0}, Ls63;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    iput-object v0, v11, Ls63;->e:Ljava/lang/CharSequence;

    .line 346
    .line 347
    invoke-static {v10}, Ls63;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    iput-object v0, v11, Ls63;->f:Ljava/lang/CharSequence;

    .line 352
    .line 353
    iget-object v0, v11, Ls63;->v:Landroid/app/Notification;

    .line 354
    .line 355
    iput v5, v0, Landroid/app/Notification;->icon:I

    .line 356
    .line 357
    iput v2, v11, Ls63;->m:I

    .line 358
    .line 359
    iput v9, v11, Ls63;->n:I

    .line 360
    .line 361
    invoke-virtual {v11, v7, v8}, Ls63;->c(IZ)V

    .line 362
    .line 363
    .line 364
    iput-boolean v8, v11, Ls63;->w:Z

    .line 365
    .line 366
    iput v4, v11, Ls63;->i:I

    .line 367
    .line 368
    const/16 v0, 0x8

    .line 369
    .line 370
    invoke-virtual {v11, v0, v8}, Ls63;->c(IZ)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v11}, Ls63;->a()Landroid/app/Notification;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    :goto_5
    iget-boolean v1, p0, Lla0;->o:Z

    .line 378
    .line 379
    iget-object v2, p0, Lla0;->q:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v2, Lvt0;

    .line 382
    .line 383
    if-nez v1, :cond_a

    .line 384
    .line 385
    const-string v1, "dataSync"

    .line 386
    .line 387
    invoke-static {v2, v8, v0, v8, v1}, Lf35;->c0(Landroid/app/Service;ILandroid/app/Notification;ILjava/lang/String;)V

    .line 388
    .line 389
    .line 390
    iput-boolean v8, p0, Lla0;->o:Z

    .line 391
    .line 392
    goto :goto_6

    .line 393
    :cond_a
    const-string v1, "notification"

    .line 394
    .line 395
    invoke-virtual {v2, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    check-cast v1, Landroid/app/NotificationManager;

    .line 400
    .line 401
    invoke-virtual {v1, v8, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 402
    .line 403
    .line 404
    :goto_6
    iget-boolean v0, p0, Lla0;->n:Z

    .line 405
    .line 406
    if-eqz v0, :cond_b

    .line 407
    .line 408
    iget-object v0, p0, Lla0;->p:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast v0, Landroid/os/Handler;

    .line 411
    .line 412
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 413
    .line 414
    .line 415
    iget-object v0, p0, Lla0;->p:Ljava/lang/Object;

    .line 416
    .line 417
    check-cast v0, Landroid/os/Handler;

    .line 418
    .line 419
    new-instance v1, La0;

    .line 420
    .line 421
    const/16 v2, 0x18

    .line 422
    .line 423
    invoke-direct {v1, v2, p0}, La0;-><init>(ILjava/lang/Object;)V

    .line 424
    .line 425
    .line 426
    const-wide/16 v2, 0x3e8

    .line 427
    .line 428
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 429
    .line 430
    .line 431
    :cond_b
    return-void
.end method

.method public h(Ljava/lang/Object;)V
    .locals 7

    .line 1
    move-object v2, p1

    .line 2
    check-cast v2, Lgr2;

    .line 3
    .line 4
    iget-object p1, p0, Lla0;->q:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, Lls2;

    .line 7
    .line 8
    iget-object p1, p1, Lls2;->g:Ltn2;

    .line 9
    .line 10
    iget-object v6, p1, Ltn2;->l:Landroid/os/Handler;

    .line 11
    .line 12
    iget-object v0, p0, Lla0;->p:Ljava/lang/Object;

    .line 13
    .line 14
    move-object v5, v0

    .line 15
    check-cast v5, Lfr2;

    .line 16
    .line 17
    iget-boolean v3, p0, Lla0;->n:Z

    .line 18
    .line 19
    iget-boolean v4, p0, Lla0;->o:Z

    .line 20
    .line 21
    new-instance v0, Lgs2;

    .line 22
    .line 23
    move-object v1, p0

    .line 24
    invoke-direct/range {v0 .. v5}, Lgs2;-><init>(Lla0;Lgr2;ZZLfr2;)V

    .line 25
    .line 26
    .line 27
    new-instance p0, Lur2;

    .line 28
    .line 29
    invoke-direct {p0, p1, v5, v0}, Lur2;-><init>(Ltn2;Lfr2;Ljava/lang/Runnable;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v6, p0}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public o(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    return-void
.end method
