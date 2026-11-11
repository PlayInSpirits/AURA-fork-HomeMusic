.class public final Lt24;
.super Lad2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final l:Ls24;

.field public final m:Lhd5;

.field public final n:Ly24;

.field public final o:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final p:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final q:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final r:Lne0;

.field public final s:Lif1;


# direct methods
.method public constructor <init>(Ls24;Lhd5;[Ljava/lang/String;Lif1;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lad2;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lt24;->l:Ls24;

    .line 8
    .line 9
    iput-object p2, p0, Lt24;->m:Lhd5;

    .line 10
    .line 11
    new-instance p2, Ly24;

    .line 12
    .line 13
    invoke-direct {p2, p3, p0}, Ly24;-><init>([Ljava/lang/String;Lt24;)V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, Lt24;->n:Ly24;

    .line 17
    .line 18
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    const/4 p3, 0x1

    .line 21
    invoke-direct {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Lt24;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 25
    .line 26
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 27
    .line 28
    const/4 p3, 0x0

    .line 29
    invoke-direct {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 30
    .line 31
    .line 32
    iput-object p2, p0, Lt24;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    .line 34
    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 35
    .line 36
    invoke-direct {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 37
    .line 38
    .line 39
    iput-object p2, p0, Lt24;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 40
    .line 41
    invoke-virtual {p1}, Ls24;->m()Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz p2, :cond_1

    .line 46
    .line 47
    iget-object p1, p1, Ls24;->a:Ltd0;

    .line 48
    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    iget-object p1, p1, Ltd0;->n:Lne0;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const-string p0, "coroutineScope"

    .line 55
    .line 56
    invoke-static {p0}, Lh12;->Q(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    const/4 p0, 0x0

    .line 60
    throw p0

    .line 61
    :cond_1
    sget-object p1, Lq01;->n:Lq01;

    .line 62
    .line 63
    :goto_0
    iput-object p1, p0, Lt24;->r:Lne0;

    .line 64
    .line 65
    iput-object p4, p0, Lt24;->s:Lif1;

    .line 66
    .line 67
    return-void
.end method

.method public static final l(Lt24;Lwd0;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p1, Lz24;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lz24;

    .line 7
    .line 8
    iget v1, v0, Lz24;->r:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lz24;->r:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lz24;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lz24;-><init>(Lt24;Lwd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lz24;->p:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lz24;->r:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v4, :cond_1

    .line 35
    .line 36
    iget p0, v0, Lz24;->o:I

    .line 37
    .line 38
    iget-object v1, v0, Lz24;->n:Lt24;

    .line 39
    .line 40
    :try_start_0
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    goto/16 :goto_5

    .line 44
    .line 45
    :catchall_0
    move-exception p0

    .line 46
    goto/16 :goto_7

    .line 47
    .line 48
    :catch_0
    move-exception p0

    .line 49
    goto/16 :goto_6

    .line 50
    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v2

    .line 57
    :cond_2
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p0, Lt24;->q:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 61
    .line 62
    invoke-virtual {p1, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_5

    .line 67
    .line 68
    iget-object p1, p0, Lt24;->l:Ls24;

    .line 69
    .line 70
    invoke-virtual {p1}, Ls24;->i()Ls12;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iget-object v1, p0, Lt24;->n:Ly24;

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    new-instance v5, Lf95;

    .line 80
    .line 81
    invoke-direct {v5, p1, v1}, Lf95;-><init>(Ls12;Ly24;)V

    .line 82
    .line 83
    .line 84
    iget-object v1, p1, Ls12;->c:Ljava/util/LinkedHashMap;

    .line 85
    .line 86
    iget-object v6, p1, Ls12;->b:Ljy4;

    .line 87
    .line 88
    iget-object v7, v5, Lq12;->a:[Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v6, v7}, Ljy4;->g([Ljava/lang/String;)Lkd3;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    iget-object v8, v7, Lkd3;->n:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v8, [Ljava/lang/String;

    .line 97
    .line 98
    iget-object v7, v7, Lkd3;->o:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v7, [I

    .line 101
    .line 102
    new-instance v9, Ld83;

    .line 103
    .line 104
    invoke-direct {v9, v5, v7, v8}, Ld83;-><init>(Lq12;[I[Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    iget-object v8, p1, Ls12;->d:Ljava/util/concurrent/locks/ReentrantLock;

    .line 108
    .line 109
    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 110
    .line 111
    .line 112
    :try_start_1
    invoke-interface {v1, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    if-eqz v10, :cond_3

    .line 117
    .line 118
    invoke-static {v5, v1}, Llg2;->V(Ljava/lang/Object;Ljava/util/HashMap;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    check-cast v1, Ld83;

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :catchall_1
    move-exception p0

    .line 126
    goto :goto_3

    .line 127
    :cond_3
    invoke-interface {v1, v5, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    check-cast v1, Ld83;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 132
    .line 133
    :goto_1
    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 134
    .line 135
    .line 136
    if-nez v1, :cond_4

    .line 137
    .line 138
    iget-object v1, v6, Ljy4;->h:Lll;

    .line 139
    .line 140
    invoke-virtual {v1, v7}, Lll;->j([I)Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_4

    .line 145
    .line 146
    move v1, v4

    .line 147
    goto :goto_2

    .line 148
    :cond_4
    move v1, v3

    .line 149
    :goto_2
    if-eqz v1, :cond_5

    .line 150
    .line 151
    new-instance v1, Lr12;

    .line 152
    .line 153
    invoke-direct {v1, p1, v2, v3}, Lr12;-><init>(Ls12;Lvd0;I)V

    .line 154
    .line 155
    .line 156
    invoke-static {v1}, Lg12;->Q(Lwf1;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :goto_3
    invoke-virtual {v8}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 161
    .line 162
    .line 163
    throw p0

    .line 164
    :cond_5
    :goto_4
    iget-object p1, p0, Lt24;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 165
    .line 166
    invoke-virtual {p1, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    move-object v1, p0

    .line 171
    if-eqz p1, :cond_9

    .line 172
    .line 173
    move-object p1, v2

    .line 174
    move p0, v3

    .line 175
    :goto_5
    :try_start_2
    iget-object v5, v1, Lt24;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 176
    .line 177
    invoke-virtual {v5, v4, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 178
    .line 179
    .line 180
    move-result v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 181
    if-eqz v5, :cond_7

    .line 182
    .line 183
    :try_start_3
    iput-object v1, v0, Lz24;->n:Lt24;

    .line 184
    .line 185
    iput v4, v0, Lz24;->o:I

    .line 186
    .line 187
    iput v4, v0, Lz24;->r:I

    .line 188
    .line 189
    iget-object p0, v1, Lt24;->l:Ls24;

    .line 190
    .line 191
    iget-object p1, v1, Lt24;->s:Lif1;

    .line 192
    .line 193
    invoke-static {p0, v4, p1, v0}, Lxl;->F(Ls24;ZLif1;Lwd0;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 197
    sget-object p0, Lxe0;->n:Lxe0;

    .line 198
    .line 199
    if-ne p1, p0, :cond_6

    .line 200
    .line 201
    return-object p0

    .line 202
    :cond_6
    move p0, v4

    .line 203
    goto :goto_5

    .line 204
    :goto_6
    :try_start_4
    new-instance p1, Ljava/lang/RuntimeException;

    .line 205
    .line 206
    const-string v0, "Exception while computing database live data."

    .line 207
    .line 208
    invoke-direct {p1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 209
    .line 210
    .line 211
    throw p1

    .line 212
    :cond_7
    if-eqz p0, :cond_8

    .line 213
    .line 214
    invoke-virtual {v1, p1}, Lad2;->i(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 215
    .line 216
    .line 217
    :cond_8
    iget-object p1, v1, Lt24;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 218
    .line 219
    invoke-virtual {p1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 220
    .line 221
    .line 222
    goto :goto_8

    .line 223
    :goto_7
    iget-object p1, v1, Lt24;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 224
    .line 225
    invoke-virtual {p1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 226
    .line 227
    .line 228
    throw p0

    .line 229
    :cond_9
    move p0, v3

    .line 230
    :goto_8
    if-eqz p0, :cond_b

    .line 231
    .line 232
    iget-object p0, v1, Lt24;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 233
    .line 234
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 235
    .line 236
    .line 237
    move-result p0

    .line 238
    if-nez p0, :cond_a

    .line 239
    .line 240
    goto :goto_9

    .line 241
    :cond_a
    move-object p0, v1

    .line 242
    goto :goto_4

    .line 243
    :cond_b
    :goto_9
    sget-object p0, Lj15;->a:Lj15;

    .line 244
    .line 245
    return-object p0
.end method


# virtual methods
.method public final g()V
    .locals 4

    .line 1
    iget-object v0, p0, Lt24;->m:Lhd5;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Lhd5;->p:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/Set;

    .line 9
    .line 10
    invoke-interface {v0, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lt24;->l:Ls24;

    .line 14
    .line 15
    invoke-virtual {v0}, Ls24;->h()Lwe0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lx24;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {v1, p0, v3, v2}, Lx24;-><init>(Lt24;Lvd0;I)V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    iget-object p0, p0, Lt24;->r:Lne0;

    .line 28
    .line 29
    invoke-static {v0, p0, v3, v1, v2}, Lfu;->G(Lwe0;Lne0;Lze0;Lwf1;I)Lsk4;

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt24;->m:Lhd5;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, v0, Lhd5;->p:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/Set;

    .line 9
    .line 10
    invoke-interface {v0, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method
