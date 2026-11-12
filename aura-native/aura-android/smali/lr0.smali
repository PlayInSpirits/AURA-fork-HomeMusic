.class public final Llr0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwq0;
.implements Ls21;
.implements Lkg1;
.implements Ler2;


# instance fields
.field public n:J

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;

.field public r:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lr34;Lgr4;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Llr0;->o:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Llr0;->p:Ljava/lang/Object;

    .line 10
    .line 11
    const-wide/high16 p1, -0x8000000000000000L

    .line 12
    .line 13
    iput-wide p1, p0, Llr0;->n:J

    .line 14
    .line 15
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Llr0;->q:Ljava/lang/Object;

    .line 21
    .line 22
    new-instance p1, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Llr0;->r:Ljava/lang/Object;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public B(ILza4;ZZI)V
    .locals 0

    .line 1
    iget-object p0, p0, Llr0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lls2;

    .line 4
    .line 5
    iget-object p1, p0, Lls2;->g:Ltn2;

    .line 6
    .line 7
    iget-object p1, p1, Ltn2;->s:Lal3;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lls2;->P(Lal3;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public M(Lf42;Lns3;)V
    .locals 7

    .line 1
    const-string v0, "Had two simultaneous puts for: "

    .line 2
    .line 3
    const-string v1, "Put: Obtained: "

    .line 4
    .line 5
    iget-object v2, p0, Llr0;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lqr2;

    .line 8
    .line 9
    invoke-virtual {v2, p1}, Lqr2;->m(Lf42;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v3, p0, Llr0;->q:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Lrm3;

    .line 16
    .line 17
    monitor-enter v3

    .line 18
    :try_start_0
    iget-object v4, v3, Lrm3;->n:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    check-cast v4, Lyq0;

    .line 27
    .line 28
    if-nez v4, :cond_1

    .line 29
    .line 30
    iget-object v4, v3, Lrm3;->o:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v4, Lzg5;

    .line 33
    .line 34
    iget-object v5, v4, Lzg5;->n:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v5, Ljava/util/ArrayDeque;

    .line 37
    .line 38
    monitor-enter v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    :try_start_1
    iget-object v4, v4, Lzg5;->n:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v4, Ljava/util/ArrayDeque;

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Lyq0;

    .line 48
    .line 49
    monitor-exit v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 50
    if-nez v4, :cond_0

    .line 51
    .line 52
    :try_start_2
    new-instance v4, Lyq0;

    .line 53
    .line 54
    invoke-direct {v4}, Lyq0;-><init>()V

    .line 55
    .line 56
    .line 57
    :cond_0
    iget-object v5, v3, Lrm3;->n:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v5, Ljava/util/HashMap;

    .line 60
    .line 61
    invoke-virtual {v5, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catchall_0
    move-exception p0

    .line 66
    goto/16 :goto_5

    .line 67
    .line 68
    :catchall_1
    move-exception p0

    .line 69
    :try_start_3
    monitor-exit v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 70
    :try_start_4
    throw p0

    .line 71
    :cond_1
    :goto_0
    iget v5, v4, Lyq0;->b:I

    .line 72
    .line 73
    const/4 v6, 0x1

    .line 74
    add-int/2addr v5, v6

    .line 75
    iput v5, v4, Lyq0;->b:I

    .line 76
    .line 77
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 78
    iget-object v3, v4, Lyq0;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 81
    .line 82
    .line 83
    :try_start_5
    const-string v3, "DiskLruCacheWrapper"

    .line 84
    .line 85
    const/4 v4, 0x2

    .line 86
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_2

    .line 91
    .line 92
    const-string v3, "DiskLruCacheWrapper"

    .line 93
    .line 94
    new-instance v4, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v1, " for for Key: "

    .line 103
    .line 104
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-static {v3, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :catchall_2
    move-exception p1

    .line 119
    goto :goto_4

    .line 120
    :cond_2
    :goto_1
    :try_start_6
    invoke-virtual {p0}, Llr0;->f()Lkr0;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p1, v2}, Lkr0;->s(Ljava/lang/String;)Ld34;

    .line 125
    .line 126
    .line 127
    move-result-object v1
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 128
    if-eqz v1, :cond_4

    .line 129
    .line 130
    :catch_0
    :cond_3
    :goto_2
    iget-object p0, p0, Llr0;->q:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast p0, Lrm3;

    .line 133
    .line 134
    invoke-virtual {p0, v2}, Lrm3;->M(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_4
    :try_start_7
    invoke-virtual {p1, v2}, Lkr0;->n(Ljava/lang/String;)Lll;

    .line 139
    .line 140
    .line 141
    move-result-object p1
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 142
    if-eqz p1, :cond_7

    .line 143
    .line 144
    :try_start_8
    invoke-virtual {p1}, Lll;->g()Ljava/io/File;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iget-object v1, p2, Lns3;->o:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v1, Lc11;

    .line 151
    .line 152
    iget-object v3, p2, Lns3;->p:Ljava/lang/Object;

    .line 153
    .line 154
    iget-object p2, p2, Lns3;->q:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast p2, Ldb3;

    .line 157
    .line 158
    invoke-interface {v1, v3, v0, p2}, Lc11;->i(Ljava/lang/Object;Ljava/io/File;Ldb3;)Z

    .line 159
    .line 160
    .line 161
    move-result p2

    .line 162
    if-eqz p2, :cond_5

    .line 163
    .line 164
    iget-object p2, p1, Lll;->r:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast p2, Lkr0;

    .line 167
    .line 168
    invoke-static {p2, p1, v6}, Lkr0;->b(Lkr0;Lll;Z)V

    .line 169
    .line 170
    .line 171
    iput-boolean v6, p1, Lll;->o:Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 172
    .line 173
    :cond_5
    :try_start_9
    iget-boolean p2, p1, Lll;->o:Z
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 174
    .line 175
    if-nez p2, :cond_3

    .line 176
    .line 177
    :try_start_a
    invoke-virtual {p1}, Lll;->a()V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_0
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :catch_1
    move-exception p1

    .line 182
    goto :goto_3

    .line 183
    :catchall_3
    move-exception p2

    .line 184
    :try_start_b
    iget-boolean v0, p1, Lll;->o:Z
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_1
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    .line 185
    .line 186
    if-nez v0, :cond_6

    .line 187
    .line 188
    :try_start_c
    invoke-virtual {p1}, Lll;->a()V
    :try_end_c
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_c} :catch_2
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    .line 189
    .line 190
    .line 191
    :catch_2
    :cond_6
    :try_start_d
    throw p2

    .line 192
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 193
    .line 194
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p2

    .line 198
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    throw p1
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 202
    :goto_3
    :try_start_e
    const-string p2, "DiskLruCacheWrapper"

    .line 203
    .line 204
    const/4 v0, 0x5

    .line 205
    invoke-static {p2, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 206
    .line 207
    .line 208
    move-result p2

    .line 209
    if-eqz p2, :cond_3

    .line 210
    .line 211
    const-string p2, "DiskLruCacheWrapper"

    .line 212
    .line 213
    const-string v0, "Unable to put to disk cache"

    .line 214
    .line 215
    invoke-static {p2, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 216
    .line 217
    .line 218
    goto :goto_2

    .line 219
    :goto_4
    iget-object p0, p0, Llr0;->q:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast p0, Lrm3;

    .line 222
    .line 223
    invoke-virtual {p0, v2}, Lrm3;->M(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    throw p1

    .line 227
    :goto_5
    :try_start_f
    monitor-exit v3
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    .line 228
    throw p0
.end method

.method public a()Lcv3;
    .locals 10

    .line 1
    iget-object v0, p0, Llr0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr34;

    .line 4
    .line 5
    iget-object v1, p0, Llr0;->q:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    move-object v3, v2

    .line 11
    :cond_0
    :goto_0
    :try_start_0
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-eqz v4, :cond_2

    .line 16
    .line 17
    invoke-interface {v0, v2}, Lr34;->m(Lcv3;)Z

    .line 18
    .line 19
    .line 20
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-virtual {p0}, Llr0;->b()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    throw v3

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto/16 :goto_8

    .line 33
    .line 34
    :cond_2
    :goto_1
    :try_start_1
    invoke-interface {v0}, Lr34;->isCanceled()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-nez v4, :cond_f

    .line 39
    .line 40
    iget-object v4, p0, Llr0;->p:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v4, Lgr4;

    .line 43
    .line 44
    iget-object v4, v4, Lgr4;->a:Lrm2;

    .line 45
    .line 46
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 47
    .line 48
    .line 49
    move-result-wide v4

    .line 50
    iget-wide v6, p0, Llr0;->n:J

    .line 51
    .line 52
    sub-long/2addr v6, v4

    .line 53
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v8

    .line 57
    if-nez v8, :cond_4

    .line 58
    .line 59
    const-wide/16 v8, 0x0

    .line 60
    .line 61
    cmp-long v8, v6, v8

    .line 62
    .line 63
    if-gtz v8, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move-wide v7, v6

    .line 67
    move-object v6, v2

    .line 68
    goto :goto_3

    .line 69
    :cond_4
    :goto_2
    invoke-virtual {p0}, Llr0;->g()Lp34;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    const-wide/32 v7, 0xee6b280

    .line 74
    .line 75
    .line 76
    add-long/2addr v4, v7

    .line 77
    iput-wide v4, p0, Llr0;->n:J

    .line 78
    .line 79
    :goto_3
    if-nez v6, :cond_7

    .line 80
    .line 81
    sget-object v4, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_5

    .line 88
    .line 89
    :goto_4
    move-object v6, v2

    .line 90
    goto :goto_5

    .line 91
    :cond_5
    iget-object v5, p0, Llr0;->r:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v5, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 94
    .line 95
    invoke-virtual {v5, v7, v8, v4}, Ljava/util/concurrent/LinkedBlockingDeque;->poll(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    check-cast v4, Lp34;

    .line 100
    .line 101
    if-nez v4, :cond_6

    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_6
    iget-object v5, v4, Lp34;->a:Lq34;

    .line 105
    .line 106
    invoke-virtual {v1, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-object v6, v4

    .line 110
    :goto_5
    if-nez v6, :cond_7

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_7
    iget-object v4, v6, Lp34;->a:Lq34;

    .line 114
    .line 115
    iget-object v5, v6, Lp34;->b:Lq34;

    .line 116
    .line 117
    const/4 v7, 0x0

    .line 118
    const/4 v8, 0x1

    .line 119
    if-nez v5, :cond_8

    .line 120
    .line 121
    iget-object v5, v6, Lp34;->c:Ljava/lang/Throwable;

    .line 122
    .line 123
    if-nez v5, :cond_8

    .line 124
    .line 125
    move v5, v8

    .line 126
    goto :goto_6

    .line 127
    :cond_8
    move v5, v7

    .line 128
    :goto_6
    if-eqz v5, :cond_b

    .line 129
    .line 130
    invoke-virtual {p0}, Llr0;->b()V

    .line 131
    .line 132
    .line 133
    invoke-interface {v4}, Lq34;->c()Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-nez v5, :cond_9

    .line 138
    .line 139
    invoke-interface {v4}, Lq34;->g()Lp34;

    .line 140
    .line 141
    .line 142
    move-result-object v6

    .line 143
    :cond_9
    iget-object v4, v6, Lp34;->b:Lq34;

    .line 144
    .line 145
    if-nez v4, :cond_a

    .line 146
    .line 147
    iget-object v4, v6, Lp34;->c:Ljava/lang/Throwable;

    .line 148
    .line 149
    if-nez v4, :cond_a

    .line 150
    .line 151
    move v7, v8

    .line 152
    :cond_a
    if-eqz v7, :cond_b

    .line 153
    .line 154
    iget-object v0, v6, Lp34;->a:Lq34;

    .line 155
    .line 156
    invoke-interface {v0}, Lq34;->e()Lcv3;

    .line 157
    .line 158
    .line 159
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 160
    invoke-virtual {p0}, Llr0;->b()V

    .line 161
    .line 162
    .line 163
    return-object v0

    .line 164
    :cond_b
    :try_start_2
    iget-object v4, v6, Lp34;->c:Ljava/lang/Throwable;

    .line 165
    .line 166
    if-eqz v4, :cond_e

    .line 167
    .line 168
    instance-of v5, v4, Ljava/io/IOException;

    .line 169
    .line 170
    if-eqz v5, :cond_d

    .line 171
    .line 172
    if-nez v3, :cond_c

    .line 173
    .line 174
    check-cast v4, Ljava/io/IOException;

    .line 175
    .line 176
    move-object v3, v4

    .line 177
    goto :goto_7

    .line 178
    :cond_c
    invoke-static {v3, v4}, Lj51;->d(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 179
    .line 180
    .line 181
    goto :goto_7

    .line 182
    :cond_d
    throw v4

    .line 183
    :cond_e
    :goto_7
    iget-object v4, v6, Lp34;->b:Lq34;

    .line 184
    .line 185
    if-eqz v4, :cond_0

    .line 186
    .line 187
    invoke-interface {v0}, Lr34;->v()Lii;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    invoke-virtual {v5, v4}, Lii;->addFirst(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    goto/16 :goto_0

    .line 195
    .line 196
    :cond_f
    new-instance v0, Ljava/io/IOException;

    .line 197
    .line 198
    const-string v1, "Canceled"

    .line 199
    .line 200
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 204
    :goto_8
    invoke-virtual {p0}, Llr0;->b()V

    .line 205
    .line 206
    .line 207
    throw v0
.end method

.method public b()V
    .locals 4

    .line 1
    iget-object v0, p0, Llr0;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lq34;

    .line 20
    .line 21
    invoke-interface {v2}, Lq34;->cancel()V

    .line 22
    .line 23
    .line 24
    invoke-interface {v2}, Lq34;->d()Lq34;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-nez v2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget-object v3, p0, Llr0;->o:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, Lr34;

    .line 34
    .line 35
    invoke-interface {v3}, Lr34;->v()Lii;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3, v2}, Lii;->addLast(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public c()V
    .locals 0

    .line 1
    return-void
.end method

.method public d()Lr34;
    .locals 0

    .line 1
    iget-object p0, p0, Llr0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lr34;

    .line 4
    .line 5
    return-object p0
.end method

.method public declared-synchronized f()Lkr0;
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Llr0;->r:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Lkr0;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Llr0;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/io/File;

    .line 11
    .line 12
    iget-wide v1, p0, Llr0;->n:J

    .line 13
    .line 14
    invoke-static {v0, v1, v2}, Lkr0;->v(Ljava/io/File;J)Lkr0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iput-object v0, p0, Llr0;->r:Ljava/lang/Object;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    iget-object v0, p0, Llr0;->r:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Lkr0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    monitor-exit p0

    .line 28
    return-object v0

    .line 29
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw v0
.end method

.method public g()Lp34;
    .locals 7

    .line 1
    iget-object v0, p0, Llr0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lr34;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, v1}, Lr34;->m(Lcv3;)Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_2

    .line 11
    .line 12
    :try_start_0
    invoke-interface {v0}, Lr34;->w()Lq34;

    .line 13
    .line 14
    .line 15
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception v2

    .line 18
    new-instance v3, Lx51;

    .line 19
    .line 20
    invoke-direct {v3, v2}, Lx51;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    move-object v2, v3

    .line 24
    :goto_0
    invoke-interface {v2}, Lq34;->c()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    new-instance p0, Lp34;

    .line 31
    .line 32
    const/4 v0, 0x6

    .line 33
    invoke-direct {p0, v2, v1, v0}, Lp34;-><init>(Lq34;Ljava/lang/Throwable;I)V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_0
    instance-of v3, v2, Lx51;

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    check-cast v2, Lx51;

    .line 42
    .line 43
    iget-object p0, v2, Lx51;->a:Lp34;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_1
    iget-object v3, p0, Llr0;->q:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 49
    .line 50
    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    new-instance v3, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    sget-object v4, Lze5;->c:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v4, " connect "

    .line 64
    .line 65
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-interface {v0}, Lr34;->n()Lf6;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iget-object v0, v0, Lf6;->h:Lgr1;

    .line 73
    .line 74
    invoke-virtual {v0}, Lgr1;->i()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    iget-object v3, p0, Llr0;->p:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v3, Lgr4;

    .line 88
    .line 89
    invoke-virtual {v3}, Lgr4;->e()Lfr4;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    new-instance v4, Lz51;

    .line 94
    .line 95
    invoke-direct {v4, v0, v2, p0}, Lz51;-><init>(Ljava/lang/String;Lq34;Llr0;)V

    .line 96
    .line 97
    .line 98
    const-wide/16 v5, 0x0

    .line 99
    .line 100
    invoke-virtual {v3, v4, v5, v6}, Lfr4;->d(Lar4;J)V

    .line 101
    .line 102
    .line 103
    :cond_2
    return-object v1
.end method

.method public h(Ljava/lang/Object;)V
    .locals 7

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, Landroid/graphics/Bitmap;

    .line 3
    .line 4
    iget-object p1, p0, Llr0;->r:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, Llr0;

    .line 7
    .line 8
    iget-object p1, p1, Llr0;->r:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lls2;

    .line 11
    .line 12
    iget-object v0, p1, Lls2;->s:Llr0;

    .line 13
    .line 14
    if-eq p0, v0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iget-object v6, p1, Lls2;->m:Lqr2;

    .line 18
    .line 19
    iget-object v0, p0, Llr0;->o:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ldo2;

    .line 22
    .line 23
    iget-object v1, p0, Llr0;->p:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Ljava/lang/String;

    .line 26
    .line 27
    iget-object v2, p0, Llr0;->q:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, Landroid/net/Uri;

    .line 30
    .line 31
    iget-wide v3, p0, Llr0;->n:J

    .line 32
    .line 33
    invoke-static/range {v0 .. v5}, Lf92;->n(Ldo2;Ljava/lang/String;Landroid/net/Uri;JLandroid/graphics/Bitmap;)Leo2;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {v6, p0}, Lls2;->F(Lqr2;Leo2;)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p1, Lls2;->g:Ltn2;

    .line 41
    .line 42
    iget-object p1, p0, Ltn2;->o:Landroid/os/Handler;

    .line 43
    .line 44
    new-instance v0, Lsr2;

    .line 45
    .line 46
    const/4 v1, 0x1

    .line 47
    invoke-direct {v0, p0, v1}, Lsr2;-><init>(Ltn2;I)V

    .line 48
    .line 49
    .line 50
    invoke-static {p1, v0}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public j()V
    .locals 8

    .line 1
    iget-object p0, p0, Llr0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lls2;

    .line 4
    .line 5
    iget-object v0, p0, Lls2;->g:Ltn2;

    .line 6
    .line 7
    iget-object v7, v0, Ltn2;->s:Lal3;

    .line 8
    .line 9
    invoke-virtual {v7}, Lal3;->F()Lhp0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget v0, v0, Lhp0;->a:I

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    invoke-virtual {v7}, Lal3;->o()Lmi3;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const/16 v1, 0x1a

    .line 24
    .line 25
    const/16 v2, 0x22

    .line 26
    .line 27
    filled-new-array {v1, v2}, [I

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v2, v0, Lmi3;->a:Lw71;

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Lw71;->a([I)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    const/4 v2, 0x0

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    const/16 v1, 0x19

    .line 41
    .line 42
    const/16 v3, 0x21

    .line 43
    .line 44
    filled-new-array {v1, v3}, [I

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object v0, v0, Lmi3;->a:Lw71;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lw71;->a([I)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    const/4 v0, 0x2

    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const/4 v0, 0x1

    .line 59
    goto :goto_0

    .line 60
    :cond_2
    move v0, v2

    .line 61
    :goto_0
    new-instance v6, Landroid/os/Handler;

    .line 62
    .line 63
    iget-object v1, v7, Lal3;->b:Lqi3;

    .line 64
    .line 65
    invoke-interface {v1}, Lqi3;->U0()Landroid/os/Looper;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-direct {v6, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 70
    .line 71
    .line 72
    const/16 v1, 0x17

    .line 73
    .line 74
    invoke-virtual {v7, v1}, Lal3;->S0(I)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    invoke-virtual {v7}, Lal3;->j()I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    :cond_3
    move v4, v2

    .line 85
    invoke-virtual {v7}, Lal3;->F()Lhp0;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    move-object v2, v1

    .line 90
    new-instance v1, Lis2;

    .line 91
    .line 92
    iget v3, v2, Lhp0;->c:I

    .line 93
    .line 94
    iget-object v5, v2, Lhp0;->d:Ljava/lang/String;

    .line 95
    .line 96
    move v2, v0

    .line 97
    invoke-direct/range {v1 .. v7}, Lis2;-><init>(IIILjava/lang/String;Landroid/os/Handler;Lal3;)V

    .line 98
    .line 99
    .line 100
    move-object v0, v1

    .line 101
    :goto_1
    iput-object v0, p0, Lls2;->p:Lis2;

    .line 102
    .line 103
    iget-object p0, p0, Lls2;->m:Lqr2;

    .line 104
    .line 105
    if-nez v0, :cond_5

    .line 106
    .line 107
    const/16 v0, 0x15

    .line 108
    .line 109
    invoke-virtual {v7, v0}, Lal3;->S0(I)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_4

    .line 114
    .line 115
    invoke-virtual {v7}, Lal3;->D()Lil;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    goto :goto_2

    .line 120
    :cond_4
    sget-object v0, Lil;->i:Lil;

    .line 121
    .line 122
    :goto_2
    iget-object p0, p0, Lqr2;->o:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast p0, Lkr2;

    .line 125
    .line 126
    iget-object p0, p0, Lkr2;->a:Landroid/media/session/MediaSession;

    .line 127
    .line 128
    invoke-virtual {v0}, Lil;->c()Landroid/media/AudioAttributes;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-virtual {p0, v0}, Landroid/media/session/MediaSession;->setPlaybackToLocal(Landroid/media/AudioAttributes;)V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_5
    iget-object p0, p0, Lqr2;->o:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast p0, Lkr2;

    .line 139
    .line 140
    iget-object p0, p0, Lkr2;->a:Landroid/media/session/MediaSession;

    .line 141
    .line 142
    invoke-virtual {v0}, Lis2;->a()Landroid/media/VolumeProvider;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {p0, v0}, Landroid/media/session/MediaSession;->setPlaybackToRemote(Landroid/media/VolumeProvider;)V

    .line 147
    .line 148
    .line 149
    return-void
.end method

.method public k(Ljava/util/List;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Llr0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lls2;

    .line 4
    .line 5
    iget-object p1, p0, Lls2;->g:Ltn2;

    .line 6
    .line 7
    iget-object p1, p1, Ltn2;->s:Lal3;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lls2;->P(Lal3;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public l(ILva4;)V
    .locals 2

    .line 1
    sget-object p1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p2, Lva4;->c:Landroid/os/Bundle;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    move-object p1, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-virtual {v1}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    new-instance v0, Landroid/os/Bundle;

    .line 21
    .line 22
    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 26
    .line 27
    .line 28
    move-object p1, v0

    .line 29
    :goto_0
    iget-object p0, p0, Llr0;->r:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Lls2;

    .line 32
    .line 33
    iget-object p0, p0, Lls2;->m:Lqr2;

    .line 34
    .line 35
    iget-object p2, p2, Lva4;->b:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_2

    .line 45
    .line 46
    iget-object p0, p0, Lqr2;->o:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Lkr2;

    .line 49
    .line 50
    iget-object p0, p0, Lkr2;->a:Landroid/media/session/MediaSession;

    .line 51
    .line 52
    invoke-virtual {p0, p2, p1}, Landroid/media/session/MediaSession;->sendSessionEvent(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    const-string p0, "event cannot be null or empty"

    .line 57
    .line 58
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public m(Lf42;)Ljava/io/File;
    .locals 4

    .line 1
    iget-object v0, p0, Llr0;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lqr2;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lqr2;->m(Lf42;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x2

    .line 10
    const-string v2, "DiskLruCacheWrapper"

    .line 11
    .line 12
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    const-string v3, "Get: Obtained: "

    .line 21
    .line 22
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    const-string v3, " for for Key: "

    .line 29
    .line 30
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-static {v2, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Llr0;->f()Lkr0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0, v0}, Lkr0;->s(Ljava/lang/String;)Ld34;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-eqz p0, :cond_1

    .line 52
    .line 53
    iget-object p0, p0, Ld34;->o:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, [Ljava/io/File;

    .line 56
    .line 57
    const/4 p1, 0x0

    .line 58
    aget-object p0, p0, p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    return-object p0

    .line 61
    :catch_0
    move-exception p0

    .line 62
    const/4 p1, 0x5

    .line 63
    invoke-static {v2, p1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-eqz p1, :cond_1

    .line 68
    .line 69
    const-string p1, "Unable to get from disk cache"

    .line 70
    .line 71
    invoke-static {v2, p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 72
    .line 73
    .line 74
    :cond_1
    const/4 p0, 0x0

    .line 75
    return-object p0
.end method

.method public n(Lgn2;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Llr0;->x()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Llr0;->r:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p0, Lls2;

    .line 7
    .line 8
    iget-object v0, p0, Lls2;->m:Lqr2;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    iget-object p1, v0, Lqr2;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Lkr2;

    .line 15
    .line 16
    iget-object p1, p1, Lkr2;->a:Landroid/media/session/MediaSession;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p1, v0}, Landroid/media/session/MediaSession;->setRatingType(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object p1, p1, Lgn2;->d:Ldo2;

    .line 24
    .line 25
    iget-object p1, p1, Ldo2;->i:Llu3;

    .line 26
    .line 27
    invoke-static {p1}, Lf92;->w(Llu3;)I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    iget-object v0, v0, Lqr2;->o:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Lkr2;

    .line 34
    .line 35
    iget-object v0, v0, Lkr2;->a:Landroid/media/session/MediaSession;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Landroid/media/session/MediaSession;->setRatingType(I)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iget-object p1, p0, Lls2;->g:Ltn2;

    .line 41
    .line 42
    iget-object p1, p1, Ltn2;->s:Lal3;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, Lls2;->P(Lal3;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public o(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Llr0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Llr0;

    .line 4
    .line 5
    iget-object v0, v0, Llr0;->r:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lls2;

    .line 8
    .line 9
    iget-object v0, v0, Lls2;->s:Llr0;

    .line 10
    .line 11
    if-eq p0, v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v0, "Failed to load bitmap: "

    .line 17
    .line 18
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string p1, "MediaSessionLegacyStub"

    .line 33
    .line 34
    invoke-static {p1, p0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public p(ILal3;Lal3;)V
    .locals 2

    .line 1
    iget-object p1, p0, Llr0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lls2;

    .line 4
    .line 5
    invoke-virtual {p3}, Lal3;->Z0()Lcu4;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, Lal3;->Z0()Lcu4;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0, v0}, Llr0;->w(Lcu4;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    const/16 v0, 0x12

    .line 25
    .line 26
    invoke-virtual {p3, v0}, Lal3;->S0(I)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    invoke-virtual {p3}, Lal3;->g0()Ldo2;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    sget-object v1, Ldo2;->K:Ldo2;

    .line 38
    .line 39
    :goto_0
    if-eqz p2, :cond_4

    .line 40
    .line 41
    invoke-virtual {p2, v0}, Lal3;->S0(I)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    invoke-virtual {p2}, Lal3;->g0()Ldo2;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    goto :goto_1

    .line 52
    :cond_3
    sget-object v0, Ldo2;->K:Ldo2;

    .line 53
    .line 54
    :goto_1
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_5

    .line 59
    .line 60
    :cond_4
    invoke-virtual {p0, v1}, Llr0;->q(Ldo2;)V

    .line 61
    .line 62
    .line 63
    :cond_5
    invoke-virtual {p3}, Lal3;->a1()Ldo2;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    if-eqz p2, :cond_6

    .line 68
    .line 69
    invoke-virtual {p2}, Lal3;->a1()Ldo2;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_7

    .line 78
    .line 79
    :cond_6
    invoke-virtual {p0}, Llr0;->x()V

    .line 80
    .line 81
    .line 82
    :cond_7
    if-eqz p2, :cond_8

    .line 83
    .line 84
    invoke-virtual {p2}, Lal3;->D0()Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    invoke-virtual {p3}, Lal3;->D0()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eq v0, v1, :cond_9

    .line 93
    .line 94
    :cond_8
    invoke-virtual {p3}, Lal3;->D0()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-virtual {p0, v0}, Llr0;->u(Z)V

    .line 99
    .line 100
    .line 101
    :cond_9
    if-eqz p2, :cond_a

    .line 102
    .line 103
    invoke-virtual {p2}, Lal3;->h()I

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    invoke-virtual {p3}, Lal3;->h()I

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eq v0, v1, :cond_b

    .line 112
    .line 113
    :cond_a
    invoke-virtual {p3}, Lal3;->h()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    invoke-virtual {p0, v0}, Llr0;->s(I)V

    .line 118
    .line 119
    .line 120
    :cond_b
    invoke-virtual {p3}, Lal3;->F()Lhp0;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0}, Llr0;->j()V

    .line 124
    .line 125
    .line 126
    const/16 v0, 0x14

    .line 127
    .line 128
    invoke-virtual {p3, v0}, Lal3;->S0(I)Z

    .line 129
    .line 130
    .line 131
    move-result v0

    .line 132
    if-eqz v0, :cond_c

    .line 133
    .line 134
    const/4 v0, 0x4

    .line 135
    goto :goto_2

    .line 136
    :cond_c
    const/4 v0, 0x0

    .line 137
    :goto_2
    iget v1, p1, Lls2;->t:I

    .line 138
    .line 139
    if-eq v1, v0, :cond_d

    .line 140
    .line 141
    iput v0, p1, Lls2;->t:I

    .line 142
    .line 143
    iget-object v1, p1, Lls2;->m:Lqr2;

    .line 144
    .line 145
    iget-object v1, v1, Lqr2;->o:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v1, Lkr2;

    .line 148
    .line 149
    iget-object v1, v1, Lkr2;->a:Landroid/media/session/MediaSession;

    .line 150
    .line 151
    or-int/lit8 v0, v0, 0x3

    .line 152
    .line 153
    invoke-virtual {v1, v0}, Landroid/media/session/MediaSession;->setFlags(I)V

    .line 154
    .line 155
    .line 156
    :cond_d
    invoke-virtual {p3}, Lal3;->Y0()Lgn2;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    if-eqz p2, :cond_f

    .line 161
    .line 162
    invoke-virtual {p2}, Lal3;->Y0()Lgn2;

    .line 163
    .line 164
    .line 165
    move-result-object p2

    .line 166
    invoke-static {p2, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result p2

    .line 170
    if-nez p2, :cond_e

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_e
    invoke-virtual {p1, p3}, Lls2;->P(Lal3;)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :cond_f
    :goto_3
    invoke-virtual {p0, v0}, Llr0;->n(Lgn2;)V

    .line 178
    .line 179
    .line 180
    return-void
.end method

.method public q(Ldo2;)V
    .locals 3

    .line 1
    iget-object p0, p0, Llr0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lls2;

    .line 4
    .line 5
    iget-object v0, p0, Lls2;->m:Lqr2;

    .line 6
    .line 7
    iget-object v1, v0, Lqr2;->p:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Lwo0;

    .line 10
    .line 11
    iget-object v1, v1, Lwo0;->n:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lxk2;

    .line 14
    .line 15
    iget-object v1, v1, Lxk2;->a:Landroid/media/session/MediaController;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/media/session/MediaController;->getQueueTitle()Ljava/lang/CharSequence;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object p1, p1, Ldo2;->a:Ljava/lang/CharSequence;

    .line 22
    .line 23
    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    iget-object v1, p0, Lls2;->g:Ltn2;

    .line 30
    .line 31
    iget-object v1, v1, Ltn2;->s:Lal3;

    .line 32
    .line 33
    iget-object p0, p0, Lls2;->z:Lmi3;

    .line 34
    .line 35
    const/16 v2, 0x11

    .line 36
    .line 37
    invoke-virtual {p0, v2}, Lmi3;->a(I)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_0

    .line 42
    .line 43
    invoke-virtual {v1}, Lal3;->o()Lmi3;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0, v2}, Lmi3;->a(I)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const/4 p1, 0x0

    .line 55
    :goto_0
    iget-object p0, v0, Lqr2;->o:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p0, Lkr2;

    .line 58
    .line 59
    iget-object p0, p0, Lkr2;->a:Landroid/media/session/MediaSession;

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Landroid/media/session/MediaSession;->setQueueTitle(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    return-void
.end method

.method public s(I)V
    .locals 5

    .line 1
    iget-object p0, p0, Llr0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lls2;

    .line 4
    .line 5
    iget-object p0, p0, Lls2;->m:Lqr2;

    .line 6
    .line 7
    invoke-static {p1}, Lf92;->p(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    iget-object p0, p0, Lqr2;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lkr2;

    .line 14
    .line 15
    iget v0, p0, Lkr2;->j:I

    .line 16
    .line 17
    if-eq v0, p1, :cond_1

    .line 18
    .line 19
    iput p1, p0, Lkr2;->j:I

    .line 20
    .line 21
    iget-object v0, p0, Lkr2;->d:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-enter v0

    .line 24
    :try_start_0
    iget-object v1, p0, Lkr2;->f:Landroid/os/RemoteCallbackList;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    .line 27
    .line 28
    .line 29
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    add-int/lit8 v1, v1, -0x1

    .line 31
    .line 32
    :goto_0
    iget-object v2, p0, Lkr2;->f:Landroid/os/RemoteCallbackList;

    .line 33
    .line 34
    if-ltz v1, :cond_0

    .line 35
    .line 36
    :try_start_1
    invoke-virtual {v2, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, Llu1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    .line 42
    :try_start_2
    invoke-interface {v2, p1}, Llu1;->f(I)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto :goto_3

    .line 48
    :catch_0
    move-exception v2

    .line 49
    goto :goto_1

    .line 50
    :catch_1
    move-exception v2

    .line 51
    :goto_1
    :try_start_3
    const-string v3, "MediaSessionCompat"

    .line 52
    .line 53
    const-string v4, "Dead object in setRepeatMode."

    .line 54
    .line 55
    invoke-static {v3, v4, v2}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    :goto_2
    add-int/lit8 v1, v1, -0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {v2}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 62
    .line 63
    .line 64
    monitor-exit v0

    .line 65
    goto :goto_4

    .line 66
    :goto_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 67
    throw p0

    .line 68
    :cond_1
    :goto_4
    return-void
.end method

.method public t(ILmi3;)V
    .locals 1

    .line 1
    iget-object p0, p0, Llr0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lls2;

    .line 4
    .line 5
    iget-object p1, p0, Lls2;->g:Ltn2;

    .line 6
    .line 7
    iget-object p1, p1, Ltn2;->s:Lal3;

    .line 8
    .line 9
    const/16 p2, 0x14

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Lal3;->S0(I)Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    const/4 p2, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p2, 0x0

    .line 20
    :goto_0
    iget v0, p0, Lls2;->t:I

    .line 21
    .line 22
    if-eq v0, p2, :cond_1

    .line 23
    .line 24
    iput p2, p0, Lls2;->t:I

    .line 25
    .line 26
    iget-object v0, p0, Lls2;->m:Lqr2;

    .line 27
    .line 28
    iget-object v0, v0, Lqr2;->o:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Lkr2;

    .line 31
    .line 32
    iget-object v0, v0, Lkr2;->a:Landroid/media/session/MediaSession;

    .line 33
    .line 34
    or-int/lit8 p2, p2, 0x3

    .line 35
    .line 36
    invoke-virtual {v0, p2}, Landroid/media/session/MediaSession;->setFlags(I)V

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0, p1}, Lls2;->P(Lal3;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public u(Z)V
    .locals 5

    .line 1
    iget-object p0, p0, Llr0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lls2;

    .line 4
    .line 5
    iget-object p0, p0, Lls2;->m:Lqr2;

    .line 6
    .line 7
    sget-object v0, Lf92;->a:Ljx1;

    .line 8
    .line 9
    iget-object p0, p0, Lqr2;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lkr2;

    .line 12
    .line 13
    iget v0, p0, Lkr2;->k:I

    .line 14
    .line 15
    if-eq v0, p1, :cond_1

    .line 16
    .line 17
    iput p1, p0, Lkr2;->k:I

    .line 18
    .line 19
    iget-object v0, p0, Lkr2;->d:Ljava/lang/Object;

    .line 20
    .line 21
    monitor-enter v0

    .line 22
    :try_start_0
    iget-object v1, p0, Lkr2;->f:Landroid/os/RemoteCallbackList;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    .line 25
    .line 26
    .line 27
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    add-int/lit8 v1, v1, -0x1

    .line 29
    .line 30
    :goto_0
    iget-object v2, p0, Lkr2;->f:Landroid/os/RemoteCallbackList;

    .line 31
    .line 32
    if-ltz v1, :cond_0

    .line 33
    .line 34
    :try_start_1
    invoke-virtual {v2, v1}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Llu1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    .line 40
    :try_start_2
    invoke-interface {v2, p1}, Llu1;->c0(I)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    goto :goto_3

    .line 46
    :catch_0
    move-exception v2

    .line 47
    goto :goto_1

    .line 48
    :catch_1
    move-exception v2

    .line 49
    :goto_1
    :try_start_3
    const-string v3, "MediaSessionCompat"

    .line 50
    .line 51
    const-string v4, "Dead object in setShuffleMode."

    .line 52
    .line 53
    invoke-static {v3, v4, v2}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    :goto_2
    add-int/lit8 v1, v1, -0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    invoke-virtual {v2}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 60
    .line 61
    .line 62
    monitor-exit v0

    .line 63
    goto :goto_4

    .line 64
    :goto_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 65
    throw p0

    .line 66
    :cond_1
    :goto_4
    return-void
.end method

.method public w(Lcu4;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Llr0;->y(Lcu4;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Llr0;->x()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public x()V
    .locals 12

    .line 1
    iget-object v0, p0, Llr0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Lls2;

    .line 5
    .line 6
    iget-object v0, v1, Lls2;->g:Ltn2;

    .line 7
    .line 8
    iget-object v2, v0, Ltn2;->s:Lal3;

    .line 9
    .line 10
    invoke-virtual {v2}, Lal3;->Y0()Lgn2;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v2}, Lal3;->a1()Ldo2;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const/16 v5, 0x10

    .line 19
    .line 20
    invoke-virtual {v2, v5}, Lal3;->S0(I)Z

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    if-eqz v6, :cond_0

    .line 30
    .line 31
    invoke-virtual {v2}, Lal3;->V0()Z

    .line 32
    .line 33
    .line 34
    move-result v6

    .line 35
    if-eqz v6, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-virtual {v2, v5}, Lal3;->S0(I)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    invoke-virtual {v2}, Lal3;->getDuration()J

    .line 45
    .line 46
    .line 47
    move-result-wide v7

    .line 48
    :cond_1
    :goto_0
    if-eqz v3, :cond_2

    .line 49
    .line 50
    iget-object v2, v3, Lgn2;->a:Ljava/lang/String;

    .line 51
    .line 52
    :goto_1
    move-object v5, v2

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    const-string v2, ""

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :goto_2
    const/4 v2, 0x0

    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    iget-object v3, v3, Lgn2;->f:Lcn2;

    .line 61
    .line 62
    iget-object v3, v3, Lcn2;->a:Landroid/net/Uri;

    .line 63
    .line 64
    if-eqz v3, :cond_3

    .line 65
    .line 66
    move-object v6, v3

    .line 67
    goto :goto_3

    .line 68
    :cond_3
    move-object v6, v2

    .line 69
    :goto_3
    iget-object v3, p0, Llr0;->o:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v3, Ldo2;

    .line 72
    .line 73
    invoke-static {v3, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v3, :cond_4

    .line 78
    .line 79
    iget-object v3, p0, Llr0;->p:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v3, Ljava/lang/String;

    .line 82
    .line 83
    invoke-static {v3, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eqz v3, :cond_4

    .line 88
    .line 89
    iget-object v3, p0, Llr0;->q:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v3, Landroid/net/Uri;

    .line 92
    .line 93
    invoke-static {v3, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_4

    .line 98
    .line 99
    iget-wide v9, p0, Llr0;->n:J

    .line 100
    .line 101
    cmp-long v3, v9, v7

    .line 102
    .line 103
    if-nez v3, :cond_4

    .line 104
    .line 105
    return-void

    .line 106
    :cond_4
    iput-object v5, p0, Llr0;->p:Ljava/lang/Object;

    .line 107
    .line 108
    iput-object v6, p0, Llr0;->q:Ljava/lang/Object;

    .line 109
    .line 110
    iput-object v4, p0, Llr0;->o:Ljava/lang/Object;

    .line 111
    .line 112
    iput-wide v7, p0, Llr0;->n:J

    .line 113
    .line 114
    iget-object v3, v0, Ltn2;->m:Lx7;

    .line 115
    .line 116
    invoke-virtual {v3, v4}, Lx7;->i(Ldo2;)Lic2;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    if-eqz v3, :cond_6

    .line 121
    .line 122
    iput-object v2, v1, Lls2;->s:Llr0;

    .line 123
    .line 124
    move-object v9, v3

    .line 125
    check-cast v9, Lk91;

    .line 126
    .line 127
    invoke-virtual {v9}, Lu0;->isDone()Z

    .line 128
    .line 129
    .line 130
    move-result v10

    .line 131
    if-eqz v10, :cond_5

    .line 132
    .line 133
    :try_start_0
    invoke-static {v3}, Lhw;->j(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    check-cast p0, Landroid/graphics/Bitmap;
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 138
    .line 139
    move-object v9, p0

    .line 140
    goto :goto_7

    .line 141
    :catch_0
    move-exception v0

    .line 142
    :goto_4
    move-object p0, v0

    .line 143
    goto :goto_5

    .line 144
    :catch_1
    move-exception v0

    .line 145
    goto :goto_4

    .line 146
    :goto_5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    const-string v3, "Failed to load bitmap: "

    .line 149
    .line 150
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    const-string v0, "MediaSessionLegacyStub"

    .line 165
    .line 166
    invoke-static {v0, p0}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    goto :goto_6

    .line 170
    :cond_5
    new-instance v10, Llr0;

    .line 171
    .line 172
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 173
    .line 174
    .line 175
    iput-object p0, v10, Llr0;->r:Ljava/lang/Object;

    .line 176
    .line 177
    iput-object v4, v10, Llr0;->o:Ljava/lang/Object;

    .line 178
    .line 179
    iput-object v5, v10, Llr0;->p:Ljava/lang/Object;

    .line 180
    .line 181
    iput-object v6, v10, Llr0;->q:Ljava/lang/Object;

    .line 182
    .line 183
    iput-wide v7, v10, Llr0;->n:J

    .line 184
    .line 185
    iput-object v10, v1, Lls2;->s:Llr0;

    .line 186
    .line 187
    iget-object p0, v0, Ltn2;->l:Landroid/os/Handler;

    .line 188
    .line 189
    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    new-instance v0, Lym;

    .line 193
    .line 194
    const/4 v11, 0x1

    .line 195
    invoke-direct {v0, p0, v11}, Lym;-><init>(Landroid/os/Handler;I)V

    .line 196
    .line 197
    .line 198
    new-instance p0, Llg1;

    .line 199
    .line 200
    const/4 v11, 0x0

    .line 201
    invoke-direct {p0, v11, v3, v10}, Llg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v9, p0, v0}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 205
    .line 206
    .line 207
    :cond_6
    :goto_6
    move-object v9, v2

    .line 208
    :goto_7
    iget-object p0, v1, Lls2;->m:Lqr2;

    .line 209
    .line 210
    invoke-static/range {v4 .. v9}, Lf92;->n(Ldo2;Ljava/lang/String;Landroid/net/Uri;JLandroid/graphics/Bitmap;)Leo2;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-static {p0, v0}, Lls2;->F(Lqr2;Leo2;)V

    .line 215
    .line 216
    .line 217
    return-void
.end method

.method public y(Lcu4;)V
    .locals 12

    .line 1
    iget-object v0, p0, Llr0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lls2;

    .line 4
    .line 5
    iget-object v1, v0, Lls2;->g:Ltn2;

    .line 6
    .line 7
    iget-object v2, v1, Ltn2;->s:Lal3;

    .line 8
    .line 9
    iget-object v3, v0, Lls2;->z:Lmi3;

    .line 10
    .line 11
    const/16 v4, 0x11

    .line 12
    .line 13
    invoke-virtual {v3, v4}, Lmi3;->a(I)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v5, 0x0

    .line 18
    if-eqz v3, :cond_4

    .line 19
    .line 20
    invoke-virtual {v2}, Lal3;->o()Lmi3;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2, v4}, Lmi3;->a(I)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_4

    .line 29
    .line 30
    invoke-virtual {p1}, Lcu4;->p()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_0

    .line 35
    .line 36
    goto :goto_3

    .line 37
    :cond_0
    sget-object v0, Lf92;->a:Ljx1;

    .line 38
    .line 39
    new-instance v9, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    new-instance v0, Lbu4;

    .line 45
    .line 46
    invoke-direct {v0}, Lbu4;-><init>()V

    .line 47
    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    move v3, v2

    .line 51
    :goto_0
    invoke-virtual {p1}, Lcu4;->o()I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-ge v3, v4, :cond_1

    .line 56
    .line 57
    const-wide/16 v6, 0x0

    .line 58
    .line 59
    invoke-virtual {p1, v3, v0, v6, v7}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    iget-object v4, v4, Lbu4;->b:Lgn2;

    .line 64
    .line 65
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    add-int/lit8 v3, v3, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    new-instance v10, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    new-instance v8, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 77
    .line 78
    invoke-direct {v8, v2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 79
    .line 80
    .line 81
    new-instance v6, Lt6;

    .line 82
    .line 83
    const/16 v11, 0x15

    .line 84
    .line 85
    move-object v7, p0

    .line 86
    invoke-direct/range {v6 .. v11}, Lt6;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 87
    .line 88
    .line 89
    :goto_1
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    if-ge v2, p0, :cond_3

    .line 94
    .line 95
    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, Lgn2;

    .line 100
    .line 101
    iget-object p0, p0, Lgn2;->d:Ldo2;

    .line 102
    .line 103
    iget-object p0, p0, Ldo2;->k:[B

    .line 104
    .line 105
    if-nez p0, :cond_2

    .line 106
    .line 107
    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    invoke-virtual {v6}, Lt6;->run()V

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_2
    iget-object p1, v1, Ltn2;->m:Lx7;

    .line 115
    .line 116
    invoke-virtual {p1, p0}, Lx7;->j([B)Lic2;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {v10, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    iget-object p1, v1, Ltn2;->l:Landroid/os/Handler;

    .line 124
    .line 125
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    new-instance v0, Lym;

    .line 129
    .line 130
    const/4 v3, 0x1

    .line 131
    invoke-direct {v0, p1, v3}, Lym;-><init>(Landroid/os/Handler;I)V

    .line 132
    .line 133
    .line 134
    check-cast p0, Lk91;

    .line 135
    .line 136
    invoke-virtual {p0, v6, v0}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 137
    .line 138
    .line 139
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_3
    return-void

    .line 143
    :cond_4
    :goto_3
    iget-object p0, v0, Lls2;->m:Lqr2;

    .line 144
    .line 145
    invoke-static {p0, v5}, Lls2;->E(Lqr2;Ljava/util/ArrayList;)V

    .line 146
    .line 147
    .line 148
    return-void
.end method
