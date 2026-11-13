.class public final Lcom/eddyizm/tempus/lan/LanReceiverService;
.super Landroid/app/Service;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static volatile A:J

.field public static final B:Ljava/util/concurrent/ConcurrentHashMap;

.field public static volatile y:Z

.field public static volatile z:Ljava/lang/String;


# instance fields
.field public final n:Landroid/os/Handler;

.field public volatile o:Z

.field public final p:Ljava/util/concurrent/ThreadPoolExecutor;

.field public final q:Ljava/util/concurrent/Semaphore;

.field public r:Ljavax/net/ssl/SSLServerSocket;

.field public final s:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public t:Landroid/net/nsd/NsdManager;

.field public u:Z

.field public v:Ldefpackage/bl2;

.field public w:Ljava/lang/String;

.field public final x:Ldefpackage/i52;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->B:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->n:Landroid/os/Handler;

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->o:Z

    .line 17
    .line 18
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 19
    .line 20
    new-instance v7, Ljava/util/concurrent/ArrayBlockingQueue;

    .line 21
    .line 22
    const/4 v0, 0x4

    .line 23
    invoke-direct {v7, v0}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    const/4 v3, 0x4

    .line 28
    const-wide/16 v4, 0x0

    .line 29
    .line 30
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 31
    .line 32
    invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    .line 33
    .line 34
    .line 35
    iput-object v1, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->p:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 36
    .line 37
    new-instance v0, Ljava/util/concurrent/Semaphore;

    .line 38
    .line 39
    const/4 v1, 0x2

    .line 40
    invoke-direct {v0, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->q:Ljava/util/concurrent/Semaphore;

    .line 44
    .line 45
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->s:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 50
    .line 51
    new-instance v0, Ldefpackage/i52;

    .line 52
    .line 53
    invoke-direct {v0, p0}, Ldefpackage/i52;-><init>(Lcom/eddyizm/tempus/lan/LanReceiverService;)V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->x:Ldefpackage/i52;

    .line 57
    .line 58
    return-void
.end method

.method public static a(Lcom/eddyizm/tempus/lan/LanReceiverService;Ldefpackage/j52;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->v:Ldefpackage/bl2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "browserFuture"

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-virtual {v0}, Ldefpackage/u0;->isDone()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    :try_start_0
    iget-object p0, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->v:Ldefpackage/bl2;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ldefpackage/u0;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ldefpackage/bj2;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ldefpackage/sk2;->r0(Ldefpackage/oi3;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-static {v2}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    :catchall_0
    :cond_1
    return-void

    .line 33
    :cond_2
    invoke-static {v2}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw v1
.end method

.method public static e(Ldefpackage/qi3;)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-interface {p0}, Ldefpackage/qi3;->Q0()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v1, v0}, Ldefpackage/gb;->g0(II)Ldefpackage/j02;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    new-instance v6, Ldefpackage/x;

    .line 11
    .line 12
    const/16 v0, 0x13

    .line 13
    .line 14
    invoke-direct {v6, v0, p0}, Ldefpackage/x;-><init>(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const/16 v7, 0x1e

    .line 18
    .line 19
    const-string v3, "\u0000"

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    invoke-static/range {v2 .. v7}, Ldefpackage/q40;->B0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldefpackage/if1;I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    sget-object v0, Ldefpackage/w10;->a:Ljava/nio/charset/Charset;

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const-string v0, "SHA-256"

    .line 37
    .line 38
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    const-string v2, ""

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 57
    .line 58
    .line 59
    array-length v3, p0

    .line 60
    move v4, v1

    .line 61
    :goto_0
    if-ge v1, v3, :cond_1

    .line 62
    .line 63
    aget-byte v5, p0, v1

    .line 64
    .line 65
    const/4 v6, 0x1

    .line 66
    add-int/2addr v4, v6

    .line 67
    if-le v4, v6, :cond_0

    .line 68
    .line 69
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 70
    .line 71
    .line 72
    :cond_0
    invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    const-string v6, "%02x"

    .line 85
    .line 86
    invoke-static {v6, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 91
    .line 92
    .line 93
    add-int/lit8 v1, v1, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0
.end method


# virtual methods
.method public final declared-synchronized b(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 16

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    const-string v0, "server"

    .line 7
    .line 8
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, v2, Lcom/eddyizm/tempus/lan/LanReceiverService;->w:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    new-array v5, v3, [C

    .line 19
    .line 20
    const/4 v6, 0x0

    .line 21
    const/16 v7, 0x2f

    .line 22
    .line 23
    aput-char v7, v5, v6

    .line 24
    .line 25
    invoke-static {v1, v5}, Ldefpackage/qm4;->L0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    sget-object v5, Ldefpackage/w10;->a:Ljava/nio/charset/Charset;

    .line 30
    .line 31
    invoke-virtual {v1, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const-string v5, "SHA-256"

    .line 39
    .line 40
    invoke-static {v5}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-virtual {v5, v1}, Ljava/security/MessageDigest;->digest([B)[B

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    const-string v5, ""

    .line 52
    .line 53
    new-instance v7, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 59
    .line 60
    .line 61
    array-length v8, v1

    .line 62
    move v9, v6

    .line 63
    move v10, v9

    .line 64
    :goto_0
    if-ge v9, v8, :cond_1

    .line 65
    .line 66
    aget-byte v11, v1, v9

    .line 67
    .line 68
    add-int/2addr v10, v3

    .line 69
    if-le v10, v3, :cond_0

    .line 70
    .line 71
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 72
    .line 73
    .line 74
    :cond_0
    invoke-static {v11}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 75
    .line 76
    .line 77
    move-result-object v11

    .line 78
    const-string v12, "%02x"

    .line 79
    .line 80
    filled-new-array {v11}, [Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    invoke-static {v11, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    invoke-static {v12, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 93
    .line 94
    .line 95
    add-int/lit8 v9, v9, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_1
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-static {v0, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_c

    .line 110
    .line 111
    const-string v0, "action"

    .line 112
    .line 113
    invoke-virtual {v4, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    new-instance v1, Ldefpackage/g52;

    .line 118
    .line 119
    move-object/from16 v5, p2

    .line 120
    .line 121
    invoke-direct {v1, v2, v5, v3}, Ldefpackage/g52;-><init>(Lcom/eddyizm/tempus/lan/LanReceiverService;Ljava/lang/String;I)V

    .line 122
    .line 123
    .line 124
    const-string v3, "replace"

    .line 125
    .line 126
    const-string v5, "append"

    .line 127
    .line 128
    const-string v7, "next"

    .line 129
    .line 130
    filled-new-array {v3, v5, v7}, [Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    invoke-static {v3}, Ldefpackage/ti;->t0([Ljava/lang/Object;)Ljava/util/Set;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    if-eqz v3, :cond_b

    .line 143
    .line 144
    const-string v3, "ids"

    .line 145
    .line 146
    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    invoke-static {v6, v5}, Ldefpackage/gb;->g0(II)Ldefpackage/j02;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    new-instance v7, Ljava/util/ArrayList;

    .line 159
    .line 160
    const/16 v8, 0xa

    .line 161
    .line 162
    invoke-static {v5, v8}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v5}, Ldefpackage/h02;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    :goto_1
    move-object v9, v5

    .line 174
    check-cast v9, Ldefpackage/i02;

    .line 175
    .line 176
    iget-boolean v9, v9, Ldefpackage/i02;->p:Z

    .line 177
    .line 178
    if-eqz v9, :cond_2

    .line 179
    .line 180
    move-object v9, v5

    .line 181
    check-cast v9, Ldefpackage/b02;

    .line 182
    .line 183
    invoke-virtual {v9}, Ldefpackage/b02;->nextInt()I

    .line 184
    .line 185
    .line 186
    move-result v9

    .line 187
    invoke-virtual {v3, v9}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    goto :goto_1

    .line 195
    :catchall_0
    move-exception v0

    .line 196
    goto/16 :goto_8

    .line 197
    .line 198
    :cond_2
    invoke-static {v7}, Ldefpackage/j51;->T(Ljava/util/ArrayList;)V

    .line 199
    .line 200
    .line 201
    const-string v3, "replace"

    .line 202
    .line 203
    invoke-static {v0, v3}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    if-eqz v3, :cond_4

    .line 208
    .line 209
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    const-string v5, "index"

    .line 214
    .line 215
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    if-ltz v5, :cond_3

    .line 220
    .line 221
    if-ge v5, v3, :cond_3

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_3
    const-string v0, "Failed requirement."

    .line 225
    .line 226
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 227
    .line 228
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    throw v1

    .line 232
    :cond_4
    :goto_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 233
    .line 234
    .line 235
    move-result-wide v9

    .line 236
    const-wide/32 v11, 0x15f90

    .line 237
    .line 238
    .line 239
    add-long/2addr v9, v11

    .line 240
    new-instance v3, Ljava/util/ArrayList;

    .line 241
    .line 242
    invoke-static {v7, v8}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 243
    .line 244
    .line 245
    move-result v5

    .line 246
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    move v11, v6

    .line 254
    :goto_3
    if-ge v11, v5, :cond_9

    .line 255
    .line 256
    invoke-virtual {v7, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v12

    .line 260
    add-int/lit8 v11, v11, 0x1

    .line 261
    .line 262
    check-cast v12, Ljava/lang/String;

    .line 263
    .line 264
    invoke-virtual {v1}, Ldefpackage/g52;->invoke()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 268
    .line 269
    .line 270
    move-result-object v13

    .line 271
    invoke-virtual {v13}, Ljava/lang/Thread;->isInterrupted()Z

    .line 272
    .line 273
    .line 274
    move-result v13

    .line 275
    if-nez v13, :cond_8

    .line 276
    .line 277
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 278
    .line 279
    .line 280
    move-result-wide v13

    .line 281
    cmp-long v13, v13, v9

    .line 282
    .line 283
    if-gez v13, :cond_8

    .line 284
    .line 285
    invoke-static {v6}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 286
    .line 287
    .line 288
    move-result-object v13

    .line 289
    invoke-virtual {v13}, Ldefpackage/pn4;->c()Ldefpackage/gp3;

    .line 290
    .line 291
    .line 292
    move-result-object v13

    .line 293
    invoke-virtual {v13, v12}, Ldefpackage/gp3;->m(Ljava/lang/String;)Lretrofit2/Call;

    .line 294
    .line 295
    .line 296
    move-result-object v12

    .line 297
    invoke-interface {v12}, Lretrofit2/Call;->timeout()Ldefpackage/fu4;

    .line 298
    .line 299
    .line 300
    move-result-object v13

    .line 301
    sget-object v14, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 302
    .line 303
    move-object/from16 p2, v7

    .line 304
    .line 305
    const-wide/16 v6, 0xa

    .line 306
    .line 307
    invoke-virtual {v13, v6, v7, v14}, Ldefpackage/fu4;->g(JLjava/util/concurrent/TimeUnit;)Ldefpackage/fu4;

    .line 308
    .line 309
    .line 310
    invoke-interface {v12}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    .line 311
    .line 312
    .line 313
    move-result-object v6

    .line 314
    invoke-virtual {v6}, Lretrofit2/Response;->isSuccessful()Z

    .line 315
    .line 316
    .line 317
    move-result v7

    .line 318
    if-eqz v7, :cond_7

    .line 319
    .line 320
    invoke-virtual {v6}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v6

    .line 324
    check-cast v6, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 325
    .line 326
    if-eqz v6, :cond_5

    .line 327
    .line 328
    invoke-virtual {v6}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 329
    .line 330
    .line 331
    move-result-object v6

    .line 332
    if-eqz v6, :cond_5

    .line 333
    .line 334
    invoke-virtual {v6}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getSong()Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 335
    .line 336
    .line 337
    move-result-object v6

    .line 338
    goto :goto_4

    .line 339
    :cond_5
    const/4 v6, 0x0

    .line 340
    :goto_4
    if-eqz v6, :cond_6

    .line 341
    .line 342
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-object/from16 v7, p2

    .line 346
    .line 347
    const/4 v6, 0x0

    .line 348
    goto :goto_3

    .line 349
    :cond_6
    const-string v0, "Required value was null."

    .line 350
    .line 351
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 352
    .line 353
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 354
    .line 355
    .line 356
    throw v1

    .line 357
    :cond_7
    const-string v0, "Failed requirement."

    .line 358
    .line 359
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 360
    .line 361
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 362
    .line 363
    .line 364
    throw v1

    .line 365
    :cond_8
    const-string v0, "Failed requirement."

    .line 366
    .line 367
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 368
    .line 369
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    throw v1

    .line 373
    :cond_9
    new-instance v5, Ljava/util/ArrayList;

    .line 374
    .line 375
    invoke-static {v3, v8}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 376
    .line 377
    .line 378
    move-result v6

    .line 379
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 383
    .line 384
    .line 385
    move-result v6

    .line 386
    const/4 v15, 0x0

    .line 387
    :goto_5
    if-ge v15, v6, :cond_a

    .line 388
    .line 389
    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v7

    .line 393
    add-int/lit8 v15, v15, 0x1

    .line 394
    .line 395
    check-cast v7, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 396
    .line 397
    invoke-static {v7}, Ldefpackage/gi1;->K(Lcom/eddyizm/tempus/subsonic/models/Child;)Ldefpackage/gn2;

    .line 398
    .line 399
    .line 400
    move-result-object v7

    .line 401
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    goto :goto_5

    .line 405
    :cond_a
    :goto_6
    move-object v3, v0

    .line 406
    goto :goto_7

    .line 407
    :cond_b
    sget-object v5, Ldefpackage/u01;->n:Ldefpackage/u01;

    .line 408
    .line 409
    goto :goto_6

    .line 410
    :goto_7
    new-instance v0, Ldefpackage/d52;

    .line 411
    .line 412
    invoke-direct/range {v0 .. v5}, Ldefpackage/d52;-><init>(Ldefpackage/g52;Lcom/eddyizm/tempus/lan/LanReceiverService;Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/List;)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {v2, v0}, Lcom/eddyizm/tempus/lan/LanReceiverService;->d(Ldefpackage/gf1;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    check-cast v0, Lorg/json/JSONObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 420
    .line 421
    monitor-exit p0

    .line 422
    return-object v0

    .line 423
    :cond_c
    :try_start_1
    const-string v0, "Failed requirement."

    .line 424
    .line 425
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 426
    .line 427
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    throw v1

    .line 431
    :goto_8
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 432
    throw v0
.end method

.method public final declared-synchronized c(Lorg/json/JSONObject;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    const-string v2, "server"

    .line 7
    .line 8
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iget-object v3, v1, Lcom/eddyizm/tempus/lan/LanReceiverService;->w:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/4 v7, 0x1

    .line 18
    new-array v4, v7, [C

    .line 19
    .line 20
    const/4 v8, 0x0

    .line 21
    const/16 v5, 0x2f

    .line 22
    .line 23
    aput-char v5, v4, v8

    .line 24
    .line 25
    invoke-static {v3, v4}, Ldefpackage/qm4;->L0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    sget-object v4, Ldefpackage/w10;->a:Ljava/nio/charset/Charset;

    .line 30
    .line 31
    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    const-string v4, "SHA-256"

    .line 39
    .line 40
    invoke-static {v4}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v4, v3}, Ljava/security/MessageDigest;->digest([B)[B

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    const-string v4, ""

    .line 52
    .line 53
    new-instance v5, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 59
    .line 60
    .line 61
    array-length v6, v3

    .line 62
    move v9, v8

    .line 63
    move v10, v9

    .line 64
    :goto_0
    if-ge v9, v6, :cond_1

    .line 65
    .line 66
    aget-byte v11, v3, v9

    .line 67
    .line 68
    add-int/2addr v10, v7

    .line 69
    if-le v10, v7, :cond_0

    .line 70
    .line 71
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 72
    .line 73
    .line 74
    :cond_0
    invoke-static {v11}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 75
    .line 76
    .line 77
    move-result-object v11

    .line 78
    const-string v12, "%02x"

    .line 79
    .line 80
    filled-new-array {v11}, [Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v11

    .line 84
    invoke-static {v11, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    invoke-static {v12, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v11

    .line 92
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 93
    .line 94
    .line 95
    add-int/lit8 v9, v9, 0x1

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_1
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-static {v2, v3}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_e

    .line 110
    .line 111
    const-string v2, "ids"

    .line 112
    .line 113
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-gt v7, v3, :cond_d

    .line 122
    .line 123
    const/16 v4, 0x1f5

    .line 124
    .line 125
    if-ge v3, v4, :cond_d

    .line 126
    .line 127
    const-string v3, "index"

    .line 128
    .line 129
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-ltz v4, :cond_c

    .line 134
    .line 135
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-ge v4, v3, :cond_c

    .line 140
    .line 141
    const-string v3, "position"

    .line 142
    .line 143
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 144
    .line 145
    .line 146
    move-result-wide v5

    .line 147
    const-wide/16 v9, 0x0

    .line 148
    .line 149
    cmp-long v0, v5, v9

    .line 150
    .line 151
    if-gez v0, :cond_2

    .line 152
    .line 153
    move-wide v5, v9

    .line 154
    :cond_2
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    invoke-static {v8, v0}, Ldefpackage/gb;->g0(II)Ldefpackage/j02;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    new-instance v3, Ljava/util/ArrayList;

    .line 163
    .line 164
    const/16 v9, 0xa

    .line 165
    .line 166
    invoke-static {v0, v9}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 167
    .line 168
    .line 169
    move-result v10

    .line 170
    invoke-direct {v3, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0}, Ldefpackage/h02;->iterator()Ljava/util/Iterator;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    :goto_1
    move-object v10, v0

    .line 178
    check-cast v10, Ldefpackage/i02;

    .line 179
    .line 180
    iget-boolean v10, v10, Ldefpackage/i02;->p:Z

    .line 181
    .line 182
    if-eqz v10, :cond_3

    .line 183
    .line 184
    move-object v10, v0

    .line 185
    check-cast v10, Ldefpackage/b02;

    .line 186
    .line 187
    invoke-virtual {v10}, Ldefpackage/b02;->nextInt()I

    .line 188
    .line 189
    .line 190
    move-result v10

    .line 191
    invoke-virtual {v2, v10}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v10

    .line 195
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    goto :goto_1

    .line 199
    :catchall_0
    move-exception v0

    .line 200
    goto/16 :goto_5

    .line 201
    .line 202
    :cond_3
    invoke-static {v3, v4, v5, v6}, Ldefpackage/au0;->U(Ljava/util/ArrayList;IJ)V

    .line 203
    .line 204
    .line 205
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 206
    .line 207
    .line 208
    move-result-wide v10

    .line 209
    const-wide/32 v12, 0x15f90

    .line 210
    .line 211
    .line 212
    add-long/2addr v10, v12

    .line 213
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    invoke-static {v8, v0}, Ldefpackage/gb;->g0(II)Ldefpackage/j02;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    new-instance v12, Ljava/util/ArrayList;

    .line 222
    .line 223
    invoke-static {v0, v9}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    invoke-direct {v12, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0}, Ldefpackage/h02;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    :goto_2
    move-object v3, v0

    .line 235
    check-cast v3, Ldefpackage/i02;

    .line 236
    .line 237
    iget-boolean v3, v3, Ldefpackage/i02;->p:Z

    .line 238
    .line 239
    if-eqz v3, :cond_a

    .line 240
    .line 241
    move-object v3, v0

    .line 242
    check-cast v3, Ldefpackage/b02;

    .line 243
    .line 244
    invoke-virtual {v3}, Ldefpackage/b02;->nextInt()I

    .line 245
    .line 246
    .line 247
    move-result v3

    .line 248
    iget-boolean v13, v1, Lcom/eddyizm/tempus/lan/LanReceiverService;->o:Z

    .line 249
    .line 250
    if-eqz v13, :cond_9

    .line 251
    .line 252
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 253
    .line 254
    .line 255
    move-result-object v13

    .line 256
    invoke-virtual {v13}, Ljava/lang/Thread;->isInterrupted()Z

    .line 257
    .line 258
    .line 259
    move-result v13

    .line 260
    if-nez v13, :cond_9

    .line 261
    .line 262
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 263
    .line 264
    .line 265
    move-result-wide v13

    .line 266
    cmp-long v13, v13, v10

    .line 267
    .line 268
    if-gez v13, :cond_9

    .line 269
    .line 270
    invoke-static {v1}, Ldefpackage/kb4;->a0(Landroid/content/Context;)Ljava/util/Set;

    .line 271
    .line 272
    .line 273
    move-result-object v13

    .line 274
    move-object/from16 v14, p2

    .line 275
    .line 276
    invoke-interface {v13, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v13

    .line 280
    if-eqz v13, :cond_8

    .line 281
    .line 282
    invoke-static {}, Ldefpackage/ud3;->D()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v13

    .line 286
    iget-object v15, v1, Lcom/eddyizm/tempus/lan/LanReceiverService;->w:Ljava/lang/String;

    .line 287
    .line 288
    invoke-static {v13, v15}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v13

    .line 292
    if-eqz v13, :cond_8

    .line 293
    .line 294
    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v3

    .line 298
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 299
    .line 300
    .line 301
    move-result v13

    .line 302
    if-gt v7, v13, :cond_7

    .line 303
    .line 304
    const/16 v15, 0x201

    .line 305
    .line 306
    if-ge v13, v15, :cond_7

    .line 307
    .line 308
    invoke-static {v8}, Lcom/eddyizm/tempus/App;->f(Z)Ldefpackage/pn4;

    .line 309
    .line 310
    .line 311
    move-result-object v13

    .line 312
    invoke-virtual {v13}, Ldefpackage/pn4;->c()Ldefpackage/gp3;

    .line 313
    .line 314
    .line 315
    move-result-object v13

    .line 316
    invoke-virtual {v13, v3}, Ldefpackage/gp3;->m(Ljava/lang/String;)Lretrofit2/Call;

    .line 317
    .line 318
    .line 319
    move-result-object v3

    .line 320
    invoke-interface {v3}, Lretrofit2/Call;->timeout()Ldefpackage/fu4;

    .line 321
    .line 322
    .line 323
    move-result-object v13

    .line 324
    sget-object v15, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 325
    .line 326
    const-wide/16 v7, 0xa

    .line 327
    .line 328
    invoke-virtual {v13, v7, v8, v15}, Ldefpackage/fu4;->g(JLjava/util/concurrent/TimeUnit;)Ldefpackage/fu4;

    .line 329
    .line 330
    .line 331
    invoke-interface {v3}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    invoke-virtual {v3}, Lretrofit2/Response;->isSuccessful()Z

    .line 336
    .line 337
    .line 338
    move-result v7

    .line 339
    if-eqz v7, :cond_6

    .line 340
    .line 341
    invoke-virtual {v3}, Lretrofit2/Response;->body()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    check-cast v3, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;

    .line 346
    .line 347
    if-eqz v3, :cond_4

    .line 348
    .line 349
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/base/ApiResponse;->getSubsonicResponse()Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;

    .line 350
    .line 351
    .line 352
    move-result-object v3

    .line 353
    if-eqz v3, :cond_4

    .line 354
    .line 355
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->getSong()Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    goto :goto_3

    .line 360
    :cond_4
    const/4 v3, 0x0

    .line 361
    :goto_3
    if-eqz v3, :cond_5

    .line 362
    .line 363
    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    const/4 v7, 0x1

    .line 367
    const/4 v8, 0x0

    .line 368
    goto/16 :goto_2

    .line 369
    .line 370
    :cond_5
    const-string v0, "Required value was null."

    .line 371
    .line 372
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 373
    .line 374
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    throw v2

    .line 378
    :cond_6
    const-string v0, "Failed requirement."

    .line 379
    .line 380
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 381
    .line 382
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    throw v2

    .line 386
    :cond_7
    const-string v0, "Failed requirement."

    .line 387
    .line 388
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 389
    .line 390
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    throw v2

    .line 394
    :cond_8
    const-string v0, "Failed requirement."

    .line 395
    .line 396
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 397
    .line 398
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    throw v2

    .line 402
    :cond_9
    const-string v0, "Failed requirement."

    .line 403
    .line 404
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 405
    .line 406
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 407
    .line 408
    .line 409
    throw v2

    .line 410
    :cond_a
    move-object/from16 v14, p2

    .line 411
    .line 412
    new-instance v3, Ljava/util/ArrayList;

    .line 413
    .line 414
    invoke-static {v12, v9}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 415
    .line 416
    .line 417
    move-result v0

    .line 418
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 422
    .line 423
    .line 424
    move-result v0

    .line 425
    const/4 v2, 0x0

    .line 426
    :goto_4
    if-ge v2, v0, :cond_b

    .line 427
    .line 428
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v7

    .line 432
    add-int/lit8 v2, v2, 0x1

    .line 433
    .line 434
    check-cast v7, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 435
    .line 436
    invoke-static {v7}, Ldefpackage/gi1;->K(Lcom/eddyizm/tempus/subsonic/models/Child;)Ldefpackage/gn2;

    .line 437
    .line 438
    .line 439
    move-result-object v7

    .line 440
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    goto :goto_4

    .line 444
    :cond_b
    new-instance v0, Ldefpackage/e52;

    .line 445
    .line 446
    move-object v2, v14

    .line 447
    invoke-direct/range {v0 .. v6}, Ldefpackage/e52;-><init>(Lcom/eddyizm/tempus/lan/LanReceiverService;Ljava/lang/String;Ljava/util/ArrayList;IJ)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v1, v0}, Lcom/eddyizm/tempus/lan/LanReceiverService;->d(Ldefpackage/gf1;)Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    new-instance v0, Ldefpackage/vs3;

    .line 454
    .line 455
    invoke-direct {v0}, Ldefpackage/vs3;-><init>()V

    .line 456
    .line 457
    .line 458
    const/4 v2, 0x0

    .line 459
    const/4 v3, 0x1

    .line 460
    invoke-virtual {v0, v12, v3, v2}, Ldefpackage/vs3;->c(Ljava/util/List;ZI)V

    .line 461
    .line 462
    .line 463
    new-instance v0, Lorg/json/JSONObject;

    .line 464
    .line 465
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 466
    .line 467
    .line 468
    const-string v2, "ok"

    .line 469
    .line 470
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 475
    .line 476
    .line 477
    monitor-exit p0

    .line 478
    return-object v0

    .line 479
    :cond_c
    :try_start_1
    const-string v0, "Failed requirement."

    .line 480
    .line 481
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 482
    .line 483
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 484
    .line 485
    .line 486
    throw v2

    .line 487
    :cond_d
    const-string v0, "Failed requirement."

    .line 488
    .line 489
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 490
    .line 491
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    throw v2

    .line 495
    :cond_e
    const-string v0, "Failed requirement."

    .line 496
    .line 497
    new-instance v2, Ljava/lang/IllegalArgumentException;

    .line 498
    .line 499
    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    throw v2

    .line 503
    :goto_5
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 504
    throw v0
.end method

.method public final d(Ldefpackage/gf1;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->v:Ldefpackage/bl2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {v0}, Ldefpackage/u0;->isDone()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/FutureTask;

    .line 13
    .line 14
    new-instance v1, Ldefpackage/tp;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    invoke-direct {v1, v2, p1}, Ldefpackage/tp;-><init>(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V

    .line 21
    .line 22
    .line 23
    iget-object p0, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->n:Landroid/os/Handler;

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 26
    .line 27
    .line 28
    :try_start_0
    sget-object p0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 29
    .line 30
    const-wide/16 v1, 0x5

    .line 31
    .line 32
    invoke-virtual {v0, v1, v2, p0}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 36
    return-object p0

    .line 37
    :catch_0
    move-exception p0

    .line 38
    const/4 p1, 0x0

    .line 39
    invoke-virtual {v0, p1}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z

    .line 40
    .line 41
    .line 42
    throw p0

    .line 43
    :cond_0
    const-string p0, "Failed requirement."

    .line 44
    .line 45
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v1

    .line 49
    :cond_1
    const-string p0, "browserFuture"

    .line 50
    .line 51
    invoke-static {p0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v1
.end method

.method public final f(Ldefpackage/qi3;)Lorg/json/JSONObject;
    .locals 12

    .line 1
    invoke-interface {p1}, Ldefpackage/qi3;->K0()Ldefpackage/do2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-class v1, Landroid/media/AudioManager;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Landroid/media/AudioManager;

    .line 15
    .line 16
    new-instance v2, Lorg/json/JSONObject;

    .line 17
    .line 18
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v3, "ok"

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    invoke-virtual {v2, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v3, "remoteVersion"

    .line 29
    .line 30
    const/4 v5, 0x4

    .line 31
    invoke-virtual {v2, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-object v3, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->w:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-array v5, v4, [C

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    const/16 v7, 0x2f

    .line 44
    .line 45
    aput-char v7, v5, v6

    .line 46
    .line 47
    invoke-static {v3, v5}, Ldefpackage/qm4;->L0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    sget-object v5, Ldefpackage/w10;->a:Ljava/nio/charset/Charset;

    .line 52
    .line 53
    invoke-virtual {v3, v5}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    const-string v5, "SHA-256"

    .line 61
    .line 62
    invoke-static {v5}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    invoke-virtual {v5, v3}, Ljava/security/MessageDigest;->digest([B)[B

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    new-instance v5, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 76
    .line 77
    .line 78
    const-string v7, ""

    .line 79
    .line 80
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 81
    .line 82
    .line 83
    array-length v8, v3

    .line 84
    move v9, v6

    .line 85
    :goto_0
    if-ge v6, v8, :cond_1

    .line 86
    .line 87
    aget-byte v10, v3, v6

    .line 88
    .line 89
    add-int/2addr v9, v4

    .line 90
    if-le v9, v4, :cond_0

    .line 91
    .line 92
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 93
    .line 94
    .line 95
    :cond_0
    invoke-static {v10}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    filled-new-array {v10}, [Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    invoke-static {v10, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    const-string v11, "%02x"

    .line 108
    .line 109
    invoke-static {v11, v10}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 114
    .line 115
    .line 116
    add-int/lit8 v6, v6, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_1
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    const-string v4, "server"

    .line 127
    .line 128
    invoke-virtual {v2, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    const-string v3, "name"

    .line 133
    .line 134
    invoke-static {p0}, Ldefpackage/kb4;->M(Landroid/content/Context;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p0

    .line 138
    invoke-virtual {v2, v3, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    iget-object v2, v0, Ldefpackage/do2;->a:Ljava/lang/CharSequence;

    .line 143
    .line 144
    const/16 v3, 0x100

    .line 145
    .line 146
    if-eqz v2, :cond_2

    .line 147
    .line 148
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    if-eqz v2, :cond_2

    .line 153
    .line 154
    invoke-static {v3, v2}, Ldefpackage/qm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    goto :goto_1

    .line 159
    :cond_2
    move-object v2, v7

    .line 160
    :goto_1
    const-string v4, "title"

    .line 161
    .line 162
    invoke-virtual {p0, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    iget-object v2, v0, Ldefpackage/do2;->b:Ljava/lang/CharSequence;

    .line 167
    .line 168
    if-eqz v2, :cond_3

    .line 169
    .line 170
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    if-eqz v2, :cond_3

    .line 175
    .line 176
    invoke-static {v3, v2}, Ldefpackage/qm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    goto :goto_2

    .line 181
    :cond_3
    move-object v2, v7

    .line 182
    :goto_2
    const-string v4, "artist"

    .line 183
    .line 184
    invoke-virtual {p0, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    iget-object v2, v0, Ldefpackage/do2;->c:Ljava/lang/CharSequence;

    .line 189
    .line 190
    if-eqz v2, :cond_4

    .line 191
    .line 192
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    if-eqz v2, :cond_4

    .line 197
    .line 198
    invoke-static {v3, v2}, Ldefpackage/qm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    goto :goto_3

    .line 203
    :cond_4
    move-object v2, v7

    .line 204
    :goto_3
    const-string v3, "album"

    .line 205
    .line 206
    invoke-virtual {p0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    iget-object v0, v0, Ldefpackage/do2;->I:Landroid/os/Bundle;

    .line 211
    .line 212
    if-eqz v0, :cond_5

    .line 213
    .line 214
    const-string v2, "coverArtId"

    .line 215
    .line 216
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    if-eqz v0, :cond_5

    .line 221
    .line 222
    const/16 v2, 0x200

    .line 223
    .line 224
    invoke-static {v2, v0}, Ldefpackage/qm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    goto :goto_4

    .line 229
    :cond_5
    move-object v0, v7

    .line 230
    :goto_4
    const-string v2, "cover"

    .line 231
    .line 232
    invoke-virtual {p0, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    invoke-interface {p1}, Ldefpackage/qi3;->M0()J

    .line 237
    .line 238
    .line 239
    move-result-wide v2

    .line 240
    const-wide/16 v4, 0x0

    .line 241
    .line 242
    cmp-long v0, v2, v4

    .line 243
    .line 244
    if-gez v0, :cond_6

    .line 245
    .line 246
    move-wide v2, v4

    .line 247
    :cond_6
    const-string v0, "position"

    .line 248
    .line 249
    invoke-virtual {p0, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    invoke-interface {p1}, Ldefpackage/qi3;->getDuration()J

    .line 254
    .line 255
    .line 256
    move-result-wide v2

    .line 257
    cmp-long v0, v2, v4

    .line 258
    .line 259
    if-gez v0, :cond_7

    .line 260
    .line 261
    goto :goto_5

    .line 262
    :cond_7
    move-wide v4, v2

    .line 263
    :goto_5
    const-string v0, "duration"

    .line 264
    .line 265
    invoke-virtual {p0, v0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    const-string v0, "playing"

    .line 270
    .line 271
    invoke-interface {p1}, Ldefpackage/qi3;->h0()Z

    .line 272
    .line 273
    .line 274
    move-result v2

    .line 275
    invoke-virtual {p0, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    const-string v0, "playWhenReady"

    .line 280
    .line 281
    invoke-interface {p1}, Ldefpackage/qi3;->q()Z

    .line 282
    .line 283
    .line 284
    move-result v2

    .line 285
    invoke-virtual {p0, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    invoke-interface {p1}, Ldefpackage/qi3;->B()F

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    const-string v2, "volume"

    .line 298
    .line 299
    invoke-virtual {p0, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    const-string v0, "index"

    .line 304
    .line 305
    invoke-interface {p1}, Ldefpackage/qi3;->o0()I

    .line 306
    .line 307
    .line 308
    move-result v2

    .line 309
    invoke-virtual {p0, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 310
    .line 311
    .line 312
    move-result-object p0

    .line 313
    const-string v0, "deviceVolume"

    .line 314
    .line 315
    const/4 v2, 0x3

    .line 316
    invoke-virtual {v1, v2}, Landroid/media/AudioManager;->getStreamVolume(I)I

    .line 317
    .line 318
    .line 319
    move-result v3

    .line 320
    invoke-virtual {p0, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    const-string v0, "deviceVolumeMax"

    .line 325
    .line 326
    invoke-virtual {v1, v2}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 331
    .line 332
    .line 333
    move-result-object p0

    .line 334
    const-string v0, "shuffle"

    .line 335
    .line 336
    invoke-interface {p1}, Ldefpackage/qi3;->D0()Z

    .line 337
    .line 338
    .line 339
    move-result v1

    .line 340
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 341
    .line 342
    .line 343
    move-result-object p0

    .line 344
    const-string v0, "repeat"

    .line 345
    .line 346
    invoke-interface {p1}, Ldefpackage/qi3;->h()I

    .line 347
    .line 348
    .line 349
    move-result v1

    .line 350
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    invoke-interface {p1}, Ldefpackage/qi3;->a()Ldefpackage/gn2;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    if-eqz v0, :cond_9

    .line 359
    .line 360
    iget-object v0, v0, Ldefpackage/gn2;->a:Ljava/lang/String;

    .line 361
    .line 362
    if-nez v0, :cond_8

    .line 363
    .line 364
    goto :goto_6

    .line 365
    :cond_8
    move-object v7, v0

    .line 366
    :cond_9
    :goto_6
    const-string v0, "id"

    .line 367
    .line 368
    invoke-virtual {p0, v0, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 369
    .line 370
    .line 371
    move-result-object p0

    .line 372
    invoke-interface {p1}, Ldefpackage/qi3;->i()Ldefpackage/qh3;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    iget v0, v0, Ldefpackage/qh3;->a:F

    .line 377
    .line 378
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    const-string v1, "speed"

    .line 383
    .line 384
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 385
    .line 386
    .line 387
    move-result-object p0

    .line 388
    invoke-interface {p1}, Ldefpackage/qi3;->i()Ldefpackage/qh3;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    iget v0, v0, Ldefpackage/qh3;->b:F

    .line 393
    .line 394
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    const-string v1, "pitch"

    .line 399
    .line 400
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 401
    .line 402
    .line 403
    move-result-object p0

    .line 404
    invoke-static {}, Ldefpackage/yf4;->c()Ldefpackage/yf4;

    .line 405
    .line 406
    .line 407
    move-result-object v0

    .line 408
    iget-boolean v0, v0, Ldefpackage/yf4;->f:Z

    .line 409
    .line 410
    const-string v1, "timerActive"

    .line 411
    .line 412
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 413
    .line 414
    .line 415
    move-result-object p0

    .line 416
    invoke-static {}, Ldefpackage/yf4;->c()Ldefpackage/yf4;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    iget-boolean v0, v0, Ldefpackage/yf4;->g:Z

    .line 421
    .line 422
    const-string v1, "timerEnd"

    .line 423
    .line 424
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 425
    .line 426
    .line 427
    move-result-object p0

    .line 428
    invoke-static {}, Ldefpackage/yf4;->c()Ldefpackage/yf4;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    invoke-virtual {v0}, Ldefpackage/yf4;->d()Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    const-string v1, "timerRemaining"

    .line 437
    .line 438
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 439
    .line 440
    .line 441
    move-result-object p0

    .line 442
    const-string v0, "next"

    .line 443
    .line 444
    invoke-interface {p1}, Ldefpackage/qi3;->f0()Z

    .line 445
    .line 446
    .line 447
    move-result v1

    .line 448
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 449
    .line 450
    .line 451
    move-result-object p0

    .line 452
    const-string v0, "previous"

    .line 453
    .line 454
    invoke-interface {p1}, Ldefpackage/qi3;->I()Z

    .line 455
    .line 456
    .line 457
    move-result v1

    .line 458
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 459
    .line 460
    .line 461
    move-result-object p0

    .line 462
    const-string v0, "count"

    .line 463
    .line 464
    invoke-interface {p1}, Ldefpackage/qi3;->Q0()I

    .line 465
    .line 466
    .line 467
    move-result v1

    .line 468
    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 469
    .line 470
    .line 471
    move-result-object p0

    .line 472
    const-string v0, "revision"

    .line 473
    .line 474
    invoke-static {p1}, Lcom/eddyizm/tempus/lan/LanReceiverService;->e(Ldefpackage/qi3;)Ljava/lang/String;

    .line 475
    .line 476
    .line 477
    move-result-object p1

    .line 478
    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 479
    .line 480
    .line 481
    move-result-object p0

    .line 482
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    return-object p0
.end method

.method public final g(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;)V
    .locals 9

    .line 1
    const-string v0, "Receiver live updates stopped"

    .line 2
    .line 3
    new-instance v1, Ljava/util/concurrent/ArrayBlockingQueue;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, v2}, Ljava/util/concurrent/ArrayBlockingQueue;-><init>(I)V

    .line 7
    .line 8
    .line 9
    new-instance v3, Ldefpackage/j52;

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-direct {v3, v4, v1}, Ldefpackage/j52;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance v5, Ldefpackage/fa;

    .line 16
    .line 17
    const/16 v6, 0x9

    .line 18
    .line 19
    invoke-direct {v5, v6, p0, v3}, Ldefpackage/fa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v5}, Lcom/eddyizm/tempus/lan/LanReceiverService;->d(Ldefpackage/gf1;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    sget-object v5, Ldefpackage/w42;->a:Ldefpackage/w42;

    .line 26
    .line 27
    const-string v5, "Receiver live updates started"

    .line 28
    .line 29
    invoke-static {v5}, Ldefpackage/w42;->b(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    :try_start_0
    iget-boolean v5, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->o:Z

    .line 33
    .line 34
    if-eqz v5, :cond_1

    .line 35
    .line 36
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v5}, Ljava/lang/Thread;->isInterrupted()Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-nez v5, :cond_1

    .line 45
    .line 46
    new-instance v5, Ldefpackage/g52;

    .line 47
    .line 48
    invoke-direct {v5, p0, p2, v4}, Ldefpackage/g52;-><init>(Lcom/eddyizm/tempus/lan/LanReceiverService;Ljava/lang/String;I)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v5}, Lcom/eddyizm/tempus/lan/LanReceiverService;->d(Ldefpackage/gf1;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    check-cast v5, Lorg/json/JSONObject;

    .line 56
    .line 57
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    sget-object v7, Ldefpackage/w10;->a:Ljava/nio/charset/Charset;

    .line 68
    .line 69
    invoke-virtual {v5, v7}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    array-length v7, v5

    .line 77
    if-gt v2, v7, :cond_0

    .line 78
    .line 79
    const v8, 0x20001

    .line 80
    .line 81
    .line 82
    if-ge v7, v8, :cond_0

    .line 83
    .line 84
    new-instance v7, Ljava/io/DataOutputStream;

    .line 85
    .line 86
    invoke-virtual {p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    .line 87
    .line 88
    .line 89
    move-result-object v8

    .line 90
    invoke-direct {v7, v8}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 91
    .line 92
    .line 93
    array-length v8, v5

    .line 94
    invoke-virtual {v7, v8}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v7, v5}, Ljava/io/OutputStream;->write([B)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v7}, Ljava/io/DataOutputStream;->flush()V

    .line 101
    .line 102
    .line 103
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 104
    .line 105
    const-wide/16 v7, 0x1

    .line 106
    .line 107
    invoke-virtual {v1, v7, v8, v5}, Ljava/util/concurrent/ArrayBlockingQueue;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :catchall_0
    move-exception p1

    .line 112
    goto :goto_1

    .line 113
    :cond_0
    const-string p1, "Failed requirement."

    .line 114
    .line 115
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 116
    .line 117
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 121
    :cond_1
    iget-object p1, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->n:Landroid/os/Handler;

    .line 122
    .line 123
    new-instance p2, Ldefpackage/ws1;

    .line 124
    .line 125
    invoke-direct {p2, v6, p0, v3}, Ldefpackage/ws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 129
    .line 130
    .line 131
    sget-object p0, Ldefpackage/w42;->a:Ldefpackage/w42;

    .line 132
    .line 133
    invoke-static {v0}, Ldefpackage/w42;->b(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :goto_1
    iget-object p2, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->n:Landroid/os/Handler;

    .line 138
    .line 139
    new-instance v1, Ldefpackage/ws1;

    .line 140
    .line 141
    invoke-direct {v1, v6, p0, v3}, Ldefpackage/ws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 145
    .line 146
    .line 147
    sget-object p0, Ldefpackage/w42;->a:Ldefpackage/w42;

    .line 148
    .line 149
    invoke-static {v0}, Ldefpackage/w42;->b(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw p1
.end method

.method public final bridge synthetic onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final onCreate()V
    .locals 14

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    sput-object v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->z:Ljava/lang/String;

    .line 6
    .line 7
    sget-object v1, Ldefpackage/w42;->a:Ldefpackage/w42;

    .line 8
    .line 9
    const-string v1, "Receiver starting"

    .line 10
    .line 11
    invoke-static {v1}, Ldefpackage/w42;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {}, Ldefpackage/ud3;->D()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iput-object v1, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->w:Ljava/lang/String;

    .line 19
    .line 20
    const-class v1, Landroid/app/NotificationManager;

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Landroid/app/NotificationManager;

    .line 27
    .line 28
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 v3, 0x1a

    .line 31
    .line 32
    if-lt v2, v3, :cond_0

    .line 33
    .line 34
    invoke-static {}, Ldefpackage/gm0;->n()V

    .line 35
    .line 36
    .line 37
    const v2, 0x7f1302e7

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {v2}, Ldefpackage/gm0;->C(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {v1, v2}, Ldefpackage/tn;->p(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    new-instance v1, Landroid/content/Intent;

    .line 52
    .line 53
    const-class v2, Lcom/eddyizm/tempus/lan/LanPlaybackActivity;

    .line 54
    .line 55
    invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 56
    .line 57
    .line 58
    const/4 v2, 0x0

    .line 59
    const/high16 v3, 0x4000000

    .line 60
    .line 61
    invoke-static {p0, v2, v1, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    new-instance v4, Landroid/content/Intent;

    .line 66
    .line 67
    const-class v5, Lcom/eddyizm/tempus/lan/LanReceiverService;

    .line 68
    .line 69
    invoke-direct {v4, p0, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 70
    .line 71
    .line 72
    const-string v5, "stop"

    .line 73
    .line 74
    invoke-virtual {v4, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    const/4 v5, 0x1

    .line 79
    invoke-static {p0, v5, v4, v3}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    new-instance v4, Ldefpackage/s63;

    .line 84
    .line 85
    const-string v6, "lan_receiver"

    .line 86
    .line 87
    invoke-direct {v4, p0, v6}, Ldefpackage/s63;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const v6, 0x7f080211

    .line 91
    .line 92
    .line 93
    iget-object v7, v4, Ldefpackage/s63;->v:Landroid/app/Notification;

    .line 94
    .line 95
    iput v6, v7, Landroid/app/Notification;->icon:I

    .line 96
    .line 97
    const v6, 0x7f1302ac

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-static {v6}, Ldefpackage/s63;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    iput-object v6, v4, Ldefpackage/s63;->e:Ljava/lang/CharSequence;

    .line 109
    .line 110
    invoke-static {p0}, Ldefpackage/kb4;->M(Landroid/content/Context;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-static {v6}, Ldefpackage/s63;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    iput-object v6, v4, Ldefpackage/s63;->f:Ljava/lang/CharSequence;

    .line 119
    .line 120
    iput-object v1, v4, Ldefpackage/s63;->g:Landroid/app/PendingIntent;

    .line 121
    .line 122
    const/4 v1, 0x2

    .line 123
    invoke-virtual {v4, v1, v5}, Ldefpackage/s63;->c(IZ)V

    .line 124
    .line 125
    .line 126
    const v1, 0x7f1302b9

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    iget-object v6, v4, Ldefpackage/s63;->b:Ljava/util/ArrayList;

    .line 134
    .line 135
    new-instance v7, Ldefpackage/q63;

    .line 136
    .line 137
    invoke-direct {v7, v0, v1, v3}, Ldefpackage/q63;-><init>(Landroidx/core/graphics/drawable/IconCompat;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    invoke-virtual {v4}, Ldefpackage/s63;->a()Landroid/app/Notification;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    const/16 v3, 0x1c85

    .line 148
    .line 149
    invoke-virtual {p0, v3, v1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 150
    .line 151
    .line 152
    const-class v1, Landroid/net/nsd/NsdManager;

    .line 153
    .line 154
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    check-cast v1, Landroid/net/nsd/NsdManager;

    .line 162
    .line 163
    iput-object v1, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->t:Landroid/net/nsd/NsdManager;

    .line 164
    .line 165
    new-instance v8, Ldefpackage/cb4;

    .line 166
    .line 167
    new-instance v1, Landroid/content/ComponentName;

    .line 168
    .line 169
    const-class v3, Lcom/eddyizm/tempus/service/MediaService;

    .line 170
    .line 171
    invoke-direct {v1, p0, v3}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 172
    .line 173
    .line 174
    invoke-direct {v8, p0, v1}, Ldefpackage/cb4;-><init>(Landroid/content/Context;Landroid/content/ComponentName;)V

    .line 175
    .line 176
    .line 177
    sget-object v9, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 178
    .line 179
    new-instance v10, Ldefpackage/aj2;

    .line 180
    .line 181
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-static {}, Ldefpackage/f35;->x()Landroid/os/Looper;

    .line 185
    .line 186
    .line 187
    move-result-object v11

    .line 188
    new-instance v12, Ldefpackage/bl2;

    .line 189
    .line 190
    invoke-direct {v12, v11}, Ldefpackage/bl2;-><init>(Landroid/os/Looper;)V

    .line 191
    .line 192
    .line 193
    iget-object v1, v8, Ldefpackage/cb4;->a:Ldefpackage/bb4;

    .line 194
    .line 195
    invoke-interface {v1}, Ldefpackage/bb4;->e()Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-eqz v1, :cond_1

    .line 200
    .line 201
    new-instance v0, Ldefpackage/xc5;

    .line 202
    .line 203
    new-instance v1, Ldefpackage/x7;

    .line 204
    .line 205
    invoke-direct {v1, p0}, Ldefpackage/x7;-><init>(Landroid/content/Context;)V

    .line 206
    .line 207
    .line 208
    new-instance v3, Ldefpackage/fi0;

    .line 209
    .line 210
    invoke-direct {v3, v1}, Ldefpackage/fi0;-><init>(Ldefpackage/x7;)V

    .line 211
    .line 212
    .line 213
    const/4 v1, 0x4

    .line 214
    invoke-direct {v0, v1, v3}, Ldefpackage/xc5;-><init>(ILjava/lang/Object;)V

    .line 215
    .line 216
    .line 217
    :cond_1
    move-object v13, v0

    .line 218
    new-instance v6, Ldefpackage/bj2;

    .line 219
    .line 220
    move-object v7, p0

    .line 221
    invoke-direct/range {v6 .. v13}, Ldefpackage/sk2;-><init>(Landroid/content/Context;Ldefpackage/cb4;Landroid/os/Bundle;Ldefpackage/qk2;Landroid/os/Looper;Ldefpackage/bl2;Ldefpackage/xc5;)V

    .line 222
    .line 223
    .line 224
    new-instance p0, Landroid/os/Handler;

    .line 225
    .line 226
    invoke-direct {p0, v11}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 227
    .line 228
    .line 229
    invoke-static {v12, v6, p0}, Ldefpackage/b11;->w(Ldefpackage/bl2;Ldefpackage/bj2;Landroid/os/Handler;)V

    .line 230
    .line 231
    .line 232
    iput-object v12, v7, Lcom/eddyizm/tempus/lan/LanReceiverService;->v:Ldefpackage/bl2;

    .line 233
    .line 234
    sput-boolean v5, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 235
    .line 236
    new-instance p0, Ljava/lang/Thread;

    .line 237
    .line 238
    new-instance v0, Ldefpackage/f52;

    .line 239
    .line 240
    invoke-direct {v0, v7, v2}, Ldefpackage/f52;-><init>(Lcom/eddyizm/tempus/lan/LanReceiverService;I)V

    .line 241
    .line 242
    .line 243
    const-string v1, "tempus-lan-listener"

    .line 244
    .line 245
    invoke-direct {p0, v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 249
    .line 250
    .line 251
    return-void
.end method

.method public final onDestroy()V
    .locals 3

    .line 1
    sget-object v0, Ldefpackage/w42;->a:Ldefpackage/w42;

    .line 2
    .line 3
    const-string v0, "Receiver stopping"

    .line 4
    .line 5
    invoke-static {v0}, Ldefpackage/w42;->b(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->o:Z

    .line 10
    .line 11
    sput-boolean v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->y:Z

    .line 12
    .line 13
    const-wide/16 v0, 0x0

    .line 14
    .line 15
    sput-wide v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->A:J

    .line 16
    .line 17
    sget-object v0, Lcom/eddyizm/tempus/lan/LanReceiverService;->B:Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 20
    .line 21
    .line 22
    :try_start_0
    iget-object v0, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->r:Ljavax/net/ssl/SSLServerSocket;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/net/ServerSocket;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    :catchall_0
    :cond_0
    iget-object v0, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->s:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :catchall_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Ljava/net/Socket;

    .line 49
    .line 50
    :try_start_1
    invoke-virtual {v1}, Ljava/net/Socket;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    iget-object v0, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->p:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdownNow()Ljava/util/List;

    .line 57
    .line 58
    .line 59
    iget-boolean v0, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->u:Z

    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    if-eqz v0, :cond_3

    .line 63
    .line 64
    :try_start_2
    iget-object v0, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->t:Landroid/net/nsd/NsdManager;

    .line 65
    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    iget-object v2, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->x:Ldefpackage/i52;

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Landroid/net/nsd/NsdManager;->unregisterService(Landroid/net/nsd/NsdManager$RegistrationListener;)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    const-string v0, "nsd"

    .line 75
    .line 76
    invoke-static {v0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 80
    :catchall_2
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/eddyizm/tempus/lan/LanReceiverService;->v:Ldefpackage/bl2;

    .line 81
    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    invoke-static {v0}, Ldefpackage/sk2;->Z0(Ljava/util/concurrent/Future;)V

    .line 85
    .line 86
    .line 87
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_4
    const-string p0, "browserFuture"

    .line 92
    .line 93
    invoke-static {p0}, Ldefpackage/h12;->Q(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw v1
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    const-string p2, "stop"

    .line 10
    .line 11
    invoke-static {p1, p2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 18
    .line 19
    .line 20
    :cond_1
    const/4 p0, 0x2

    .line 21
    return p0
.end method
