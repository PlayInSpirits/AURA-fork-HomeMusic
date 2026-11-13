.class public final Ldefpackage/wn3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:I

.field public final b:Ldefpackage/gf1;

.field public final c:Ljava/util/concurrent/locks/ReentrantLock;

.field public d:I

.field public e:Z

.field public final f:[Ldefpackage/sa0;

.field public final g:Ldefpackage/v94;

.field public final h:Ldefpackage/x20;


# direct methods
.method public constructor <init>(ILdefpackage/gf1;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ldefpackage/wn3;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/wn3;->b:Ldefpackage/gf1;

    .line 7
    .line 8
    new-instance p2, Ljava/util/concurrent/locks/ReentrantLock;

    .line 9
    .line 10
    invoke-direct {p2}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Ldefpackage/wn3;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 14
    .line 15
    new-array p2, p1, [Ldefpackage/sa0;

    .line 16
    .line 17
    iput-object p2, p0, Ldefpackage/wn3;->f:[Ldefpackage/sa0;

    .line 18
    .line 19
    sget p2, Ldefpackage/w94;->a:I

    .line 20
    .line 21
    new-instance p2, Ldefpackage/v94;

    .line 22
    .line 23
    invoke-direct {p2, p1}, Ldefpackage/u94;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object p2, p0, Ldefpackage/wn3;->g:Ldefpackage/v94;

    .line 27
    .line 28
    new-instance p2, Ldefpackage/x20;

    .line 29
    .line 30
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    const/4 v1, 0x1

    .line 35
    if-lt p1, v1, :cond_2

    .line 36
    .line 37
    const/high16 v2, 0x40000000    # 2.0f

    .line 38
    .line 39
    if-gt p1, v2, :cond_1

    .line 40
    .line 41
    invoke-static {p1}, Ljava/lang/Integer;->bitCount(I)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eq v0, v1, :cond_0

    .line 46
    .line 47
    add-int/lit8 p1, p1, -0x1

    .line 48
    .line 49
    invoke-static {p1}, Ljava/lang/Integer;->highestOneBit(I)I

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    shl-int/2addr p1, v1

    .line 54
    :cond_0
    add-int/lit8 v0, p1, -0x1

    .line 55
    .line 56
    iput v0, p2, Ldefpackage/x20;->c:I

    .line 57
    .line 58
    new-array p1, p1, [Ljava/lang/Object;

    .line 59
    .line 60
    iput-object p1, p2, Ldefpackage/x20;->d:Ljava/lang/Object;

    .line 61
    .line 62
    iput-object p2, p0, Ldefpackage/wn3;->h:Ldefpackage/x20;

    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    const-string p0, "capacity must be <= 2^30"

    .line 66
    .line 67
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v0

    .line 71
    :cond_2
    const-string p0, "capacity must be >= 1"

    .line 72
    .line 73
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v0
.end method


# virtual methods
.method public final a(Ldefpackage/wd0;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Ldefpackage/vn3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Ldefpackage/vn3;

    .line 7
    .line 8
    iget v1, v0, Ldefpackage/vn3;->q:I

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
    iput v1, v0, Ldefpackage/vn3;->q:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ldefpackage/vn3;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Ldefpackage/vn3;-><init>(Ldefpackage/wn3;Ldefpackage/wd0;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Ldefpackage/vn3;->o:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ldefpackage/vn3;->q:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    iget-object p0, v0, Ldefpackage/vn3;->n:Ldefpackage/wn3;

    .line 36
    .line 37
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_4

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v2

    .line 47
    :cond_2
    invoke-static {p1}, Ldefpackage/kb4;->X(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput-object p0, v0, Ldefpackage/vn3;->n:Ldefpackage/wn3;

    .line 51
    .line 52
    iput v3, v0, Ldefpackage/vn3;->q:I

    .line 53
    .line 54
    iget-object p1, p0, Ldefpackage/wn3;->g:Ldefpackage/v94;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget v1, p1, Ldefpackage/u94;->n:I

    .line 60
    .line 61
    :cond_3
    sget-object v4, Ldefpackage/u94;->t:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 62
    .line 63
    invoke-virtual {v4, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-gt v4, v1, :cond_3

    .line 68
    .line 69
    sget-object v5, Ldefpackage/j15;->a:Ldefpackage/j15;

    .line 70
    .line 71
    sget-object v6, Ldefpackage/xe0;->n:Ldefpackage/xe0;

    .line 72
    .line 73
    if-lez v4, :cond_4

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_4
    invoke-static {v0}, Ldefpackage/ya4;->x(Ldefpackage/vd0;)Ldefpackage/vd0;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0}, Ldefpackage/zz1;->s(Ldefpackage/vd0;)Ldefpackage/cz;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    :try_start_0
    invoke-virtual {p1, v0}, Ldefpackage/u94;->a(Ldefpackage/t85;)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-nez v4, :cond_7

    .line 89
    .line 90
    :cond_5
    sget-object v4, Ldefpackage/u94;->t:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 91
    .line 92
    invoke-virtual {v4, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->getAndDecrement(Ljava/lang/Object;)I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    if-gt v4, v1, :cond_5

    .line 97
    .line 98
    if-lez v4, :cond_6

    .line 99
    .line 100
    iget-object p1, p1, Ldefpackage/u94;->o:Ldefpackage/bz;

    .line 101
    .line 102
    invoke-virtual {v0, v5, p1}, Ldefpackage/cz;->k(Ljava/lang/Object;Ldefpackage/xf1;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_6
    invoke-virtual {p1, v0}, Ldefpackage/u94;->a(Ldefpackage/t85;)Z

    .line 107
    .line 108
    .line 109
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 110
    if-eqz v4, :cond_5

    .line 111
    .line 112
    :cond_7
    :goto_1
    invoke-virtual {v0}, Ldefpackage/cz;->q()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    if-ne p1, v6, :cond_8

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_8
    move-object p1, v5

    .line 120
    :goto_2
    if-ne p1, v6, :cond_9

    .line 121
    .line 122
    move-object v5, p1

    .line 123
    :cond_9
    :goto_3
    if-ne v5, v6, :cond_a

    .line 124
    .line 125
    return-object v6

    .line 126
    :cond_a
    :goto_4
    :try_start_1
    iget-object p1, p0, Ldefpackage/wn3;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 127
    .line 128
    iget-object v0, p0, Ldefpackage/wn3;->h:Ldefpackage/x20;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    .line 132
    .line 133
    :try_start_2
    iget-boolean v1, p0, Ldefpackage/wn3;->e:Z

    .line 134
    .line 135
    if-nez v1, :cond_e

    .line 136
    .line 137
    iget v1, v0, Ldefpackage/x20;->a:I

    .line 138
    .line 139
    iget v4, v0, Ldefpackage/x20;->b:I

    .line 140
    .line 141
    if-ne v1, v4, :cond_c

    .line 142
    .line 143
    iget v1, p0, Ldefpackage/wn3;->d:I

    .line 144
    .line 145
    iget v4, p0, Ldefpackage/wn3;->a:I

    .line 146
    .line 147
    if-lt v1, v4, :cond_b

    .line 148
    .line 149
    goto :goto_5

    .line 150
    :cond_b
    new-instance v1, Ldefpackage/sa0;

    .line 151
    .line 152
    iget-object v4, p0, Ldefpackage/wn3;->b:Ldefpackage/gf1;

    .line 153
    .line 154
    invoke-interface {v4}, Ldefpackage/gf1;->invoke()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    check-cast v4, Ldefpackage/x34;

    .line 159
    .line 160
    invoke-direct {v1, v4}, Ldefpackage/sa0;-><init>(Ldefpackage/x34;)V

    .line 161
    .line 162
    .line 163
    iget-object v4, p0, Ldefpackage/wn3;->f:[Ldefpackage/sa0;

    .line 164
    .line 165
    iget v5, p0, Ldefpackage/wn3;->d:I

    .line 166
    .line 167
    add-int/lit8 v6, v5, 0x1

    .line 168
    .line 169
    iput v6, p0, Ldefpackage/wn3;->d:I

    .line 170
    .line 171
    aput-object v1, v4, v5

    .line 172
    .line 173
    invoke-virtual {v0, v1}, Ldefpackage/x20;->a(Ldefpackage/sa0;)V

    .line 174
    .line 175
    .line 176
    :cond_c
    :goto_5
    iget v1, v0, Ldefpackage/x20;->a:I

    .line 177
    .line 178
    iget v4, v0, Ldefpackage/x20;->b:I

    .line 179
    .line 180
    if-eq v1, v4, :cond_d

    .line 181
    .line 182
    iget-object v4, v0, Ldefpackage/x20;->d:Ljava/lang/Object;

    .line 183
    .line 184
    check-cast v4, [Ljava/lang/Object;

    .line 185
    .line 186
    aget-object v5, v4, v1

    .line 187
    .line 188
    aput-object v2, v4, v1

    .line 189
    .line 190
    add-int/2addr v1, v3

    .line 191
    iget v2, v0, Ldefpackage/x20;->c:I

    .line 192
    .line 193
    and-int/2addr v1, v2

    .line 194
    iput v1, v0, Ldefpackage/x20;->a:I

    .line 195
    .line 196
    check-cast v5, Ldefpackage/sa0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 197
    .line 198
    :try_start_3
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 199
    .line 200
    .line 201
    return-object v5

    .line 202
    :catchall_0
    move-exception p1

    .line 203
    goto :goto_7

    .line 204
    :catchall_1
    move-exception v0

    .line 205
    goto :goto_6

    .line 206
    :cond_d
    :try_start_4
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 207
    .line 208
    invoke-direct {v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    .line 209
    .line 210
    .line 211
    throw v0

    .line 212
    :cond_e
    const-string v0, "Connection pool is closed"

    .line 213
    .line 214
    const/16 v1, 0x15

    .line 215
    .line 216
    invoke-static {v1, v0}, Ldefpackage/h12;->P(ILjava/lang/String;)V

    .line 217
    .line 218
    .line 219
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 220
    :goto_6
    :try_start_5
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 221
    .line 222
    .line 223
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 224
    :goto_7
    iget-object p0, p0, Ldefpackage/wn3;->g:Ldefpackage/v94;

    .line 225
    .line 226
    invoke-virtual {p0}, Ldefpackage/u94;->c()V

    .line 227
    .line 228
    .line 229
    throw p1

    .line 230
    :catchall_2
    move-exception p0

    .line 231
    invoke-virtual {v0}, Ldefpackage/cz;->B()V

    .line 232
    .line 233
    .line 234
    throw p0
.end method

.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/wn3;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    :try_start_0
    iput-boolean v1, p0, Ldefpackage/wn3;->e:Z

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/wn3;->f:[Ldefpackage/sa0;

    .line 10
    .line 11
    array-length v1, p0

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v1, :cond_1

    .line 14
    .line 15
    aget-object v3, p0, v2

    .line 16
    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {v3}, Ldefpackage/sa0;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_2

    .line 25
    :cond_0
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :goto_2
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 33
    .line 34
    .line 35
    throw p0
.end method

.method public final c(Ljava/lang/StringBuilder;)V
    .locals 12

    .line 1
    const-string v0, ", "

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/wn3;->h:Ldefpackage/x20;

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/wn3;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    invoke-static {}, Ldefpackage/gb;->r()Ldefpackage/qb2;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    iget v4, v1, Ldefpackage/x20;->b:I

    .line 15
    .line 16
    iget v5, v1, Ldefpackage/x20;->a:I

    .line 17
    .line 18
    sub-int/2addr v4, v5

    .line 19
    iget v5, v1, Ldefpackage/x20;->c:I

    .line 20
    .line 21
    and-int/2addr v4, v5

    .line 22
    const/4 v5, 0x0

    .line 23
    move v6, v5

    .line 24
    :goto_0
    if-ge v6, v4, :cond_1

    .line 25
    .line 26
    if-ltz v6, :cond_0

    .line 27
    .line 28
    iget v7, v1, Ldefpackage/x20;->b:I

    .line 29
    .line 30
    iget v8, v1, Ldefpackage/x20;->a:I

    .line 31
    .line 32
    sub-int/2addr v7, v8

    .line 33
    iget v9, v1, Ldefpackage/x20;->c:I

    .line 34
    .line 35
    and-int/2addr v7, v9

    .line 36
    if-ge v6, v7, :cond_0

    .line 37
    .line 38
    iget-object v7, v1, Ldefpackage/x20;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v7, [Ljava/lang/Object;

    .line 41
    .line 42
    add-int/2addr v8, v6

    .line 43
    and-int/2addr v8, v9

    .line 44
    aget-object v7, v7, v8

    .line 45
    .line 46
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v7}, Ldefpackage/qb2;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    add-int/lit8 v6, v6, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    move-object p0, v0

    .line 57
    goto/16 :goto_3

    .line 58
    .line 59
    :cond_0
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 60
    .line 61
    invoke-direct {p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    .line 62
    .line 63
    .line 64
    throw p0

    .line 65
    :cond_1
    invoke-static {v3}, Ldefpackage/gb;->f(Ldefpackage/qb2;)Ldefpackage/qb2;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    new-instance v1, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    const/16 v3, 0x9

    .line 75
    .line 76
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v3, " ("

    .line 87
    .line 88
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    new-instance v1, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v3, "capacity="

    .line 104
    .line 105
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    iget v3, p0, Ldefpackage/wn3;->a:I

    .line 109
    .line 110
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    new-instance v1, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string v3, "permits="

    .line 129
    .line 130
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    iget-object v3, p0, Ldefpackage/wn3;->g:Ldefpackage/v94;

    .line 134
    .line 135
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    sget-object v4, Ldefpackage/u94;->t:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 139
    .line 140
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->get(Ljava/lang/Object;)I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    const-string v1, "queue=(size="

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v6}, Ldefpackage/v1;->a()I

    .line 172
    .line 173
    .line 174
    move-result v1

    .line 175
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string v1, ")["

    .line 179
    .line 180
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    const/4 v10, 0x0

    .line 184
    const/16 v11, 0x3f

    .line 185
    .line 186
    const/4 v7, 0x0

    .line 187
    const/4 v8, 0x0

    .line 188
    const/4 v9, 0x0

    .line 189
    invoke-static/range {v6 .. v11}, Ldefpackage/q40;->B0(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldefpackage/if1;I)Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 194
    .line 195
    .line 196
    const-string v1, "], "

    .line 197
    .line 198
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    .line 207
    .line 208
    const-string v0, ")"

    .line 209
    .line 210
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const/16 v0, 0xa

    .line 214
    .line 215
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    iget-object p0, p0, Ldefpackage/wn3;->f:[Ldefpackage/sa0;

    .line 219
    .line 220
    array-length v1, p0

    .line 221
    move v3, v5

    .line 222
    :goto_1
    if-ge v5, v1, :cond_4

    .line 223
    .line 224
    aget-object v4, p0, v5

    .line 225
    .line 226
    add-int/lit8 v3, v3, 0x1

    .line 227
    .line 228
    new-instance v6, Ljava/lang/StringBuilder;

    .line 229
    .line 230
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 231
    .line 232
    .line 233
    const-string v7, "\t\t["

    .line 234
    .line 235
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    const-string v7, "] - "

    .line 242
    .line 243
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    if-eqz v4, :cond_2

    .line 247
    .line 248
    iget-object v7, v4, Ldefpackage/sa0;->n:Ldefpackage/x34;

    .line 249
    .line 250
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v7

    .line 254
    goto :goto_2

    .line 255
    :cond_2
    const/4 v7, 0x0

    .line 256
    :goto_2
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v6

    .line 263
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    if-eqz v4, :cond_3

    .line 270
    .line 271
    invoke-virtual {v4, p1}, Ldefpackage/sa0;->j(Ljava/lang/StringBuilder;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 272
    .line 273
    .line 274
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 275
    .line 276
    goto :goto_1

    .line 277
    :cond_4
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 278
    .line 279
    .line 280
    return-void

    .line 281
    :goto_3
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 282
    .line 283
    .line 284
    throw p0
.end method

.method public final d(Ldefpackage/sa0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/wn3;->c:Ljava/util/concurrent/locks/ReentrantLock;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 7
    .line 8
    .line 9
    :try_start_0
    iget-object v1, p0, Ldefpackage/wn3;->h:Ldefpackage/x20;

    .line 10
    .line 11
    invoke-virtual {v1, p1}, Ldefpackage/x20;->a(Ldefpackage/sa0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Ldefpackage/wn3;->g:Ldefpackage/v94;

    .line 18
    .line 19
    invoke-virtual {p0}, Ldefpackage/u94;->c()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 25
    .line 26
    .line 27
    throw p0
.end method
