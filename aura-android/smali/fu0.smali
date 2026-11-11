.class public final Lfu0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljt0;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final c:Ljava/util/concurrent/atomic/AtomicInteger;

.field public d:J

.field public e:J

.field public f:F


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/service/DownloaderService;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lfu0;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lfu0;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 18
    .line 19
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    iput-wide v0, p0, Lfu0;->d:J

    .line 22
    .line 23
    iput-wide v0, p0, Lfu0;->e:J

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    iput v0, p0, Lfu0;->f:F

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Lfu0;->a:Landroid/content/Context;

    .line 33
    .line 34
    return-void
.end method

.method public static h(Lns0;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lns0;->a:Ltt0;

    .line 2
    .line 3
    iget-object p0, p0, Ltt0;->n:Ljava/lang/String;

    .line 4
    .line 5
    sget-object v0, Lcom/eddyizm/tempus/service/DownloaderService;->z:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    sget-object v0, Leu0;->c:[B

    .line 14
    .line 15
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Lcom/eddyizm/tempus/database/AppDatabase;->w()Lss0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, Lpb0;

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    invoke-direct {v1, v0, p0, v2}, Lpb0;-><init>(Ljava/lang/Object;Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    new-instance v0, Ljava/lang/Thread;

    .line 30
    .line 31
    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 35
    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Thread;->join()V

    .line 39
    .line 40
    .line 41
    iget-object v0, v1, Lpb0;->q:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lcom/eddyizm/tempus/model/Download;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catch_0
    move-exception v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 48
    .line 49
    .line 50
    move-object v0, v2

    .line 51
    :goto_0
    if-eqz v0, :cond_0

    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    :cond_0
    if-eqz v2, :cond_1

    .line 58
    .line 59
    sget-object v0, Lcom/eddyizm/tempus/service/DownloaderService;->z:Ljava/util/concurrent/ConcurrentHashMap;

    .line 60
    .line 61
    invoke-virtual {v0, p0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :cond_1
    return-void
.end method


# virtual methods
.method public final b(Llt0;Lns0;)V
    .locals 6

    .line 1
    iget-object v0, p2, Lns0;->a:Ltt0;

    .line 2
    .line 3
    iget-object v0, v0, Ltt0;->t:[B

    .line 4
    .line 5
    sget-object v1, Leu0;->c:[B

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v1, p2, Lns0;->b:I

    .line 12
    .line 13
    const/4 v2, 0x4

    .line 14
    const/4 v3, 0x3

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    if-ne v1, v3, :cond_0

    .line 18
    .line 19
    invoke-static {p2}, Leu0;->h(Lns0;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    if-ne v1, v2, :cond_6

    .line 24
    .line 25
    sget-object p0, Leu0;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 26
    .line 27
    iget-object p1, p2, Lns0;->a:Ltt0;

    .line 28
    .line 29
    iget-object p1, p1, Ltt0;->n:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    if-eqz v1, :cond_8

    .line 36
    .line 37
    const/4 v0, 0x2

    .line 38
    if-eq v1, v0, :cond_7

    .line 39
    .line 40
    if-eq v1, v3, :cond_3

    .line 41
    .line 42
    if-eq v1, v2, :cond_2

    .line 43
    .line 44
    goto/16 :goto_2

    .line 45
    .line 46
    :cond_2
    sget-object v1, Leu0;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 47
    .line 48
    iget-object p2, p2, Lns0;->a:Ltt0;

    .line 49
    .line 50
    iget-object p2, p2, Ltt0;->n:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v1, p2}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    iget-object p2, p0, Lfu0;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 58
    .line 59
    .line 60
    iget-object p2, p0, Lfu0;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 63
    .line 64
    .line 65
    move-result p2

    .line 66
    iget-object v1, p0, Lfu0;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    add-int/2addr v1, p2

    .line 73
    sput v1, Lcom/eddyizm/tempus/service/DownloaderService;->y:I

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    iget-object v1, p0, Lfu0;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, Lfu0;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    sput v1, Lcom/eddyizm/tempus/service/DownloaderService;->y:I

    .line 88
    .line 89
    invoke-static {p2}, Leu0;->h(Lns0;)V

    .line 90
    .line 91
    .line 92
    :goto_0
    iget-object p1, p1, Llt0;->l:Ljava/util/List;

    .line 93
    .line 94
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    new-instance p2, Lc7;

    .line 99
    .line 100
    const/16 v1, 0xc

    .line 101
    .line 102
    invoke-direct {p2, v1}, Lc7;-><init>(I)V

    .line 103
    .line 104
    .line 105
    invoke-interface {p1, p2}, Ljava/util/stream/Stream;->noneMatch(Ljava/util/function/Predicate;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_6

    .line 110
    .line 111
    iget-object p1, p0, Lfu0;->a:Landroid/content/Context;

    .line 112
    .line 113
    iget-object p2, p0, Lfu0;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 114
    .line 115
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 116
    .line 117
    .line 118
    move-result p2

    .line 119
    iget-object v1, p0, Lfu0;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    const v2, 0x7f080118

    .line 126
    .line 127
    .line 128
    const v3, 0x7f1303bf

    .line 129
    .line 130
    .line 131
    if-lez p2, :cond_4

    .line 132
    .line 133
    if-nez v1, :cond_4

    .line 134
    .line 135
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    const v5, 0x7f12000c

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1, v5, p2, v4}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    invoke-virtual {p1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {p0, v2, v1, p2}, Lfu0;->g(ILjava/lang/String;Ljava/lang/String;)Landroid/app/Notification;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    goto :goto_1

    .line 163
    :cond_4
    if-lez p2, :cond_5

    .line 164
    .line 165
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    filled-new-array {p2, v1}, [Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p2

    .line 177
    const v1, 0x7f1303b9

    .line 178
    .line 179
    .line 180
    invoke-virtual {p1, v1, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    invoke-virtual {p1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-virtual {p0, v2, v1, p2}, Lfu0;->g(ILjava/lang/String;Ljava/lang/String;)Landroid/app/Notification;

    .line 189
    .line 190
    .line 191
    move-result-object p2

    .line 192
    goto :goto_1

    .line 193
    :cond_5
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 194
    .line 195
    .line 196
    move-result-object p2

    .line 197
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    const v3, 0x7f12000d

    .line 206
    .line 207
    .line 208
    invoke-virtual {p2, v3, v1, v2}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p2

    .line 212
    const v1, 0x7f1303b8

    .line 213
    .line 214
    .line 215
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    const v2, 0x7f080124

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0, v2, v1, p2}, Lfu0;->g(ILjava/lang/String;Ljava/lang/String;)Landroid/app/Notification;

    .line 223
    .line 224
    .line 225
    move-result-object p2

    .line 226
    :goto_1
    const-string v1, "notification"

    .line 227
    .line 228
    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    check-cast p1, Landroid/app/NotificationManager;

    .line 233
    .line 234
    invoke-virtual {p1, v0, p2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 235
    .line 236
    .line 237
    iget-object p1, p0, Lfu0;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 238
    .line 239
    const/4 p2, 0x0

    .line 240
    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 241
    .line 242
    .line 243
    iget-object p1, p0, Lfu0;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 244
    .line 245
    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 246
    .line 247
    .line 248
    const/4 p1, 0x0

    .line 249
    iput p1, p0, Lfu0;->f:F

    .line 250
    .line 251
    sput p1, Lcom/eddyizm/tempus/service/DownloaderService;->w:F

    .line 252
    .line 253
    sput p2, Lcom/eddyizm/tempus/service/DownloaderService;->x:I

    .line 254
    .line 255
    sput p2, Lcom/eddyizm/tempus/service/DownloaderService;->y:I

    .line 256
    .line 257
    sget-object p1, Lcom/eddyizm/tempus/service/DownloaderService;->z:Ljava/util/concurrent/ConcurrentHashMap;

    .line 258
    .line 259
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 260
    .line 261
    .line 262
    const-wide/16 p1, 0x0

    .line 263
    .line 264
    iput-wide p1, p0, Lfu0;->d:J

    .line 265
    .line 266
    iput-wide p1, p0, Lfu0;->e:J

    .line 267
    .line 268
    :cond_6
    :goto_2
    return-void

    .line 269
    :cond_7
    invoke-virtual {p0, p1}, Lfu0;->i(Llt0;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0, p1}, Lfu0;->j(Llt0;)V

    .line 273
    .line 274
    .line 275
    invoke-static {p2}, Lfu0;->h(Lns0;)V

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :cond_8
    invoke-virtual {p0, p1}, Lfu0;->i(Llt0;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {p0, p1}, Lfu0;->j(Llt0;)V

    .line 283
    .line 284
    .line 285
    invoke-static {p2}, Lfu0;->h(Lns0;)V

    .line 286
    .line 287
    .line 288
    return-void
.end method

.method public final d(Lns0;)V
    .locals 3

    .line 1
    sget-object p0, Leu0;->c:[B

    .line 2
    .line 3
    iget-object p0, p1, Lns0;->a:Ltt0;

    .line 4
    .line 5
    iget-object p0, p0, Ltt0;->n:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lcom/eddyizm/tempus/database/AppDatabase;->w()Lss0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, Lqt0;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v1, v0, p0, v2}, Lqt0;-><init>(Lss0;Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    new-instance p0, Ljava/lang/Thread;

    .line 22
    .line 23
    invoke-direct {p0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 27
    .line 28
    .line 29
    sget-object p0, Leu0;->d:Ljava/util/HashMap;

    .line 30
    .line 31
    iget-object p1, p1, Lns0;->a:Ltt0;

    .line 32
    .line 33
    iget-object v0, p1, Ltt0;->n:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    sget-object p0, Leu0;->e:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 39
    .line 40
    iget-object p1, p1, Ltt0;->n:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final g(ILjava/lang/String;Ljava/lang/String;)Landroid/app/Notification;
    .locals 2

    .line 1
    new-instance v0, Ls63;

    .line 2
    .line 3
    iget-object p0, p0, Lfu0;->a:Landroid/content/Context;

    .line 4
    .line 5
    const-string v1, "download_channel"

    .line 6
    .line 7
    invoke-direct {v0, p0, v1}, Ls63;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p2}, Ls63;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iput-object p0, v0, Ls63;->e:Ljava/lang/CharSequence;

    .line 15
    .line 16
    invoke-static {p3}, Ls63;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iput-object p0, v0, Ls63;->f:Ljava/lang/CharSequence;

    .line 21
    .line 22
    iget-object p0, v0, Ls63;->v:Landroid/app/Notification;

    .line 23
    .line 24
    iput p1, p0, Landroid/app/Notification;->icon:I

    .line 25
    .line 26
    const/4 p0, 0x2

    .line 27
    const/4 p1, 0x0

    .line 28
    invoke-virtual {v0, p0, p1}, Ls63;->c(IZ)V

    .line 29
    .line 30
    .line 31
    const/16 p0, 0x10

    .line 32
    .line 33
    invoke-virtual {v0, p0, p1}, Ls63;->c(IZ)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    iput-boolean p0, v0, Ls63;->w:Z

    .line 38
    .line 39
    iput p1, v0, Ls63;->i:I

    .line 40
    .line 41
    const/16 p1, 0x8

    .line 42
    .line 43
    invoke-virtual {v0, p1, p0}, Ls63;->c(IZ)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Ls63;->a()Landroid/app/Notification;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public final i(Llt0;)V
    .locals 2

    .line 1
    iget-object p1, p1, Llt0;->l:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    new-instance v0, Lc7;

    .line 8
    .line 9
    const/16 v1, 0xd

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lc7;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1, v0}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {p1}, Ljava/util/stream/Stream;->count()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    long-to-int p1, v0

    .line 23
    sget v0, Lcom/eddyizm/tempus/service/DownloaderService;->x:I

    .line 24
    .line 25
    if-le p1, v0, :cond_0

    .line 26
    .line 27
    sput p1, Lcom/eddyizm/tempus/service/DownloaderService;->x:I

    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    sget v0, Lcom/eddyizm/tempus/service/DownloaderService;->x:I

    .line 31
    .line 32
    if-lez v0, :cond_1

    .line 33
    .line 34
    sget v0, Lcom/eddyizm/tempus/service/DownloaderService;->y:I

    .line 35
    .line 36
    sget v1, Lcom/eddyizm/tempus/service/DownloaderService;->x:I

    .line 37
    .line 38
    if-lt v0, v1, :cond_1

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    if-ne p1, v0, :cond_1

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    sput p1, Lcom/eddyizm/tempus/service/DownloaderService;->x:I

    .line 45
    .line 46
    sput p1, Lcom/eddyizm/tempus/service/DownloaderService;->y:I

    .line 47
    .line 48
    iget-object v0, p0, Lfu0;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, Lfu0;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 56
    .line 57
    .line 58
    sget-object p0, Lcom/eddyizm/tempus/service/DownloaderService;->z:Ljava/util/concurrent/ConcurrentHashMap;

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void
.end method

.method public final j(Llt0;)V
    .locals 9

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object p1, p1, Llt0;->l:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    move-wide v4, v2

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v6

    .line 18
    if-eqz v6, :cond_1

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    check-cast v6, Lns0;

    .line 25
    .line 26
    iget-object v7, v6, Lns0;->a:Ltt0;

    .line 27
    .line 28
    iget-object v7, v7, Ltt0;->t:[B

    .line 29
    .line 30
    sget-object v8, Leu0;->c:[B

    .line 31
    .line 32
    invoke-static {v7, v8}, Ljava/util/Arrays;->equals([B[B)Z

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    if-nez v7, :cond_0

    .line 37
    .line 38
    iget-object v6, v6, Lns0;->h:Lmt0;

    .line 39
    .line 40
    iget-wide v6, v6, Lmt0;->a:J

    .line 41
    .line 42
    add-long/2addr v4, v6

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    iget-wide v6, p0, Lfu0;->e:J

    .line 45
    .line 46
    cmp-long p1, v6, v2

    .line 47
    .line 48
    if-lez p1, :cond_2

    .line 49
    .line 50
    sub-long v2, v0, v6

    .line 51
    .line 52
    const-wide/16 v6, 0x1f4

    .line 53
    .line 54
    cmp-long p1, v2, v6

    .line 55
    .line 56
    if-lez p1, :cond_3

    .line 57
    .line 58
    iget-wide v6, p0, Lfu0;->d:J

    .line 59
    .line 60
    sub-long v6, v4, v6

    .line 61
    .line 62
    long-to-float p1, v6

    .line 63
    const/high16 v6, 0x447a0000    # 1000.0f

    .line 64
    .line 65
    mul-float/2addr p1, v6

    .line 66
    long-to-float v2, v2

    .line 67
    div-float/2addr p1, v2

    .line 68
    iput p1, p0, Lfu0;->f:F

    .line 69
    .line 70
    iput-wide v4, p0, Lfu0;->d:J

    .line 71
    .line 72
    iput-wide v0, p0, Lfu0;->e:J

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    iput-wide v4, p0, Lfu0;->d:J

    .line 76
    .line 77
    iput-wide v0, p0, Lfu0;->e:J

    .line 78
    .line 79
    :cond_3
    :goto_1
    iget p0, p0, Lfu0;->f:F

    .line 80
    .line 81
    sput p0, Lcom/eddyizm/tempus/service/DownloaderService;->w:F

    .line 82
    .line 83
    return-void
.end method
