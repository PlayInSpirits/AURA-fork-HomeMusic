.class public final Le6;
.super Lvq;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final g:Lcp;

.field public final h:J

.field public final i:J

.field public final j:J

.field public final k:I

.field public final l:I

.field public final m:F

.field public final n:F

.field public final o:Lyw1;

.field public final p:Lvp4;

.field public q:F

.field public r:I

.field public s:I

.field public t:J

.field public u:Lnm1;


# direct methods
.method public constructor <init>(Lsv4;[ILcp;Lyw1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0, p1, p2}, Lvq;-><init>(ILsv4;[I)V

    .line 3
    .line 4
    .line 5
    iput-object p3, p0, Le6;->g:Lcp;

    .line 6
    .line 7
    const-wide/32 p1, 0x989680

    .line 8
    .line 9
    .line 10
    iput-wide p1, p0, Le6;->h:J

    .line 11
    .line 12
    const-wide/32 p1, 0x17d7840

    .line 13
    .line 14
    .line 15
    iput-wide p1, p0, Le6;->i:J

    .line 16
    .line 17
    iput-wide p1, p0, Le6;->j:J

    .line 18
    .line 19
    const/16 p1, 0x4ff

    .line 20
    .line 21
    iput p1, p0, Le6;->k:I

    .line 22
    .line 23
    const/16 p1, 0x2cf

    .line 24
    .line 25
    iput p1, p0, Le6;->l:I

    .line 26
    .line 27
    const p1, 0x3f333333    # 0.7f

    .line 28
    .line 29
    .line 30
    iput p1, p0, Le6;->m:F

    .line 31
    .line 32
    const/high16 p1, 0x3f400000    # 0.75f

    .line 33
    .line 34
    iput p1, p0, Le6;->n:F

    .line 35
    .line 36
    invoke-static {p4}, Lyw1;->k(Ljava/util/Collection;)Lyw1;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Le6;->o:Lyw1;

    .line 41
    .line 42
    sget-object p1, Lvp4;->a:Lvp4;

    .line 43
    .line 44
    iput-object p1, p0, Le6;->p:Lvp4;

    .line 45
    .line 46
    const/high16 p1, 0x3f800000    # 1.0f

    .line 47
    .line 48
    iput p1, p0, Le6;->q:F

    .line 49
    .line 50
    iput v0, p0, Le6;->s:I

    .line 51
    .line 52
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    iput-wide p1, p0, Le6;->t:J

    .line 58
    .line 59
    return-void
.end method

.method public static u(Ljava/util/ArrayList;[J)V
    .locals 7

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const/4 v2, 0x0

    .line 4
    move v3, v2

    .line 5
    :goto_0
    array-length v4, p1

    .line 6
    if-ge v3, v4, :cond_0

    .line 7
    .line 8
    aget-wide v4, p1, v3

    .line 9
    .line 10
    add-long/2addr v0, v4

    .line 11
    add-int/lit8 v3, v3, 0x1

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    :goto_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    if-ge v2, v3, :cond_2

    .line 19
    .line 20
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Luw1;

    .line 25
    .line 26
    if-nez v3, :cond_1

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_1
    new-instance v4, Ld6;

    .line 30
    .line 31
    aget-wide v5, p1, v2

    .line 32
    .line 33
    invoke-direct {v4, v0, v1, v5, v6}, Ld6;-><init>(JJ)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, v4}, Lpw1;->c(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    return-void
.end method

.method public static w(Ljava/util/List;)J
    .locals 7

    .line 1
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    invoke-static {p0}, Lte5;->w(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Lnm1;

    .line 18
    .line 19
    iget-wide v3, p0, Ls20;->g:J

    .line 20
    .line 21
    cmp-long v0, v3, v1

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-wide v5, p0, Ls20;->h:J

    .line 26
    .line 27
    cmp-long p0, v5, v1

    .line 28
    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    sub-long/2addr v5, v3

    .line 32
    return-wide v5

    .line 33
    :cond_1
    :goto_0
    return-wide v1
.end method


# virtual methods
.method public final b(JJJLjava/util/List;[Lxj2;)V
    .locals 10

    .line 1
    move-object/from16 p1, p8

    .line 2
    .line 3
    iget-object p2, p0, Le6;->p:Lvp4;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    iget p2, p0, Le6;->r:I

    .line 13
    .line 14
    array-length v2, p1

    .line 15
    const/4 v3, 0x0

    .line 16
    if-ge p2, v2, :cond_0

    .line 17
    .line 18
    aget-object p2, p1, p2

    .line 19
    .line 20
    invoke-interface {p2}, Lxj2;->next()Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    iget p2, p0, Le6;->r:I

    .line 27
    .line 28
    aget-object p1, p1, p2

    .line 29
    .line 30
    invoke-interface {p1}, Lxj2;->n()J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    invoke-interface {p1}, Lxj2;->j()J

    .line 35
    .line 36
    .line 37
    move-result-wide p1

    .line 38
    sub-long/2addr v4, p1

    .line 39
    goto :goto_1

    .line 40
    :cond_0
    array-length p2, p1

    .line 41
    move v2, v3

    .line 42
    :goto_0
    if-ge v2, p2, :cond_2

    .line 43
    .line 44
    aget-object v4, p1, v2

    .line 45
    .line 46
    invoke-interface {v4}, Lxj2;->next()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_1

    .line 51
    .line 52
    invoke-interface {v4}, Lxj2;->n()J

    .line 53
    .line 54
    .line 55
    move-result-wide p1

    .line 56
    invoke-interface {v4}, Lxj2;->j()J

    .line 57
    .line 58
    .line 59
    move-result-wide v4

    .line 60
    sub-long v4, p1, v4

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    invoke-static/range {p7 .. p7}, Le6;->w(Ljava/util/List;)J

    .line 67
    .line 68
    .line 69
    move-result-wide v4

    .line 70
    :goto_1
    iget p1, p0, Le6;->s:I

    .line 71
    .line 72
    if-nez p1, :cond_3

    .line 73
    .line 74
    const/4 p1, 0x1

    .line 75
    iput p1, p0, Le6;->s:I

    .line 76
    .line 77
    invoke-virtual {p0, v0, v1}, Le6;->v(J)I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    iput p1, p0, Le6;->r:I

    .line 82
    .line 83
    return-void

    .line 84
    :cond_3
    iget p2, p0, Le6;->r:I

    .line 85
    .line 86
    invoke-interface/range {p7 .. p7}, Ljava/util/List;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    iget-object v6, p0, Lvq;->d:[Ltb1;

    .line 91
    .line 92
    const/4 v7, -0x1

    .line 93
    if-eqz v2, :cond_5

    .line 94
    .line 95
    :cond_4
    move v3, v7

    .line 96
    goto :goto_3

    .line 97
    :cond_5
    invoke-static/range {p7 .. p7}, Lte5;->w(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    check-cast v2, Lnm1;

    .line 102
    .line 103
    iget-object v2, v2, Ls20;->d:Ltb1;

    .line 104
    .line 105
    :goto_2
    iget v8, p0, Lvq;->b:I

    .line 106
    .line 107
    if-ge v3, v8, :cond_4

    .line 108
    .line 109
    aget-object v8, v6, v3

    .line 110
    .line 111
    if-ne v8, v2, :cond_6

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :goto_3
    if-eq v3, v7, :cond_7

    .line 118
    .line 119
    invoke-static/range {p7 .. p7}, Lte5;->w(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    check-cast p1, Lnm1;

    .line 124
    .line 125
    iget p1, p1, Ls20;->e:I

    .line 126
    .line 127
    move p2, v3

    .line 128
    :cond_7
    invoke-virtual {p0, v0, v1}, Le6;->v(J)I

    .line 129
    .line 130
    .line 131
    move-result v2

    .line 132
    if-eq v2, p2, :cond_b

    .line 133
    .line 134
    invoke-virtual {p0, p2, v0, v1}, Lvq;->a(IJ)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    if-nez v0, :cond_b

    .line 139
    .line 140
    aget-object v0, v6, p2

    .line 141
    .line 142
    aget-object v1, v6, v2

    .line 143
    .line 144
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    cmp-long v3, p5, v6

    .line 150
    .line 151
    iget-wide v8, p0, Le6;->h:J

    .line 152
    .line 153
    if-nez v3, :cond_8

    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_8
    cmp-long v3, v4, v6

    .line 157
    .line 158
    if-eqz v3, :cond_9

    .line 159
    .line 160
    sub-long v3, p5, v4

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_9
    move-wide v3, p5

    .line 164
    :goto_4
    long-to-float v3, v3

    .line 165
    iget v4, p0, Le6;->n:F

    .line 166
    .line 167
    mul-float/2addr v3, v4

    .line 168
    float-to-long v3, v3

    .line 169
    invoke-static {v3, v4, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 170
    .line 171
    .line 172
    move-result-wide v8

    .line 173
    :goto_5
    iget v1, v1, Ltb1;->j:I

    .line 174
    .line 175
    iget v0, v0, Ltb1;->j:I

    .line 176
    .line 177
    if-le v1, v0, :cond_a

    .line 178
    .line 179
    cmp-long v3, p3, v8

    .line 180
    .line 181
    if-gez v3, :cond_a

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_a
    if-ge v1, v0, :cond_b

    .line 185
    .line 186
    iget-wide v0, p0, Le6;->i:J

    .line 187
    .line 188
    cmp-long v0, p3, v0

    .line 189
    .line 190
    if-ltz v0, :cond_b

    .line 191
    .line 192
    :goto_6
    move v2, p2

    .line 193
    :cond_b
    if-ne v2, p2, :cond_c

    .line 194
    .line 195
    goto :goto_7

    .line 196
    :cond_c
    const/4 p1, 0x3

    .line 197
    :goto_7
    iput p1, p0, Le6;->s:I

    .line 198
    .line 199
    iput v2, p0, Le6;->r:I

    .line 200
    .line 201
    return-void
.end method

.method public final d()I
    .locals 0

    .line 1
    iget p0, p0, Le6;->r:I

    .line 2
    .line 3
    return p0
.end method

.method public final h()V
    .locals 2

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Le6;->t:J

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Le6;->u:Lnm1;

    .line 10
    .line 11
    return-void
.end method

.method public final j(JLjava/util/List;)I
    .locals 10

    .line 1
    iget-object v0, p0, Le6;->p:Lvp4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iget-wide v2, p0, Le6;->t:J

    .line 11
    .line 12
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    cmp-long v4, v2, v4

    .line 18
    .line 19
    if-eqz v4, :cond_1

    .line 20
    .line 21
    sub-long v2, v0, v2

    .line 22
    .line 23
    const-wide/16 v4, 0x3e8

    .line 24
    .line 25
    cmp-long v2, v2, v4

    .line 26
    .line 27
    if-gez v2, :cond_1

    .line 28
    .line 29
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    invoke-static {p3}, Lte5;->w(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lnm1;

    .line 40
    .line 41
    iget-object v3, p0, Le6;->u:Lnm1;

    .line 42
    .line 43
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    return p0

    .line 55
    :cond_1
    :goto_0
    iput-wide v0, p0, Le6;->t:J

    .line 56
    .line 57
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    if-eqz v2, :cond_2

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    invoke-static {p3}, Lte5;->w(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    check-cast v2, Lnm1;

    .line 70
    .line 71
    :goto_1
    iput-object v2, p0, Le6;->u:Lnm1;

    .line 72
    .line 73
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    const/4 v3, 0x0

    .line 78
    if-eqz v2, :cond_3

    .line 79
    .line 80
    return v3

    .line 81
    :cond_3
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    add-int/lit8 v4, v2, -0x1

    .line 86
    .line 87
    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    check-cast v4, Lnm1;

    .line 92
    .line 93
    iget-wide v4, v4, Ls20;->g:J

    .line 94
    .line 95
    sub-long/2addr v4, p1

    .line 96
    iget v6, p0, Le6;->q:F

    .line 97
    .line 98
    invoke-static {v4, v5, v6}, Lf35;->E(JF)J

    .line 99
    .line 100
    .line 101
    move-result-wide v4

    .line 102
    iget-wide v6, p0, Le6;->j:J

    .line 103
    .line 104
    cmp-long v4, v4, v6

    .line 105
    .line 106
    if-gez v4, :cond_4

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_4
    invoke-static {p3}, Le6;->w(Ljava/util/List;)J

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0, v0, v1}, Le6;->v(J)I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    iget-object v1, p0, Lvq;->d:[Ltb1;

    .line 117
    .line 118
    aget-object v0, v1, v0

    .line 119
    .line 120
    :goto_2
    if-ge v3, v2, :cond_6

    .line 121
    .line 122
    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    check-cast v1, Lnm1;

    .line 127
    .line 128
    iget-object v4, v1, Ls20;->d:Ltb1;

    .line 129
    .line 130
    iget-wide v8, v1, Ls20;->g:J

    .line 131
    .line 132
    sub-long/2addr v8, p1

    .line 133
    iget v1, p0, Le6;->q:F

    .line 134
    .line 135
    invoke-static {v8, v9, v1}, Lf35;->E(JF)J

    .line 136
    .line 137
    .line 138
    move-result-wide v8

    .line 139
    cmp-long v1, v8, v6

    .line 140
    .line 141
    if-ltz v1, :cond_5

    .line 142
    .line 143
    iget v1, v4, Ltb1;->j:I

    .line 144
    .line 145
    iget v5, v0, Ltb1;->j:I

    .line 146
    .line 147
    if-ge v1, v5, :cond_5

    .line 148
    .line 149
    iget v1, v4, Ltb1;->v:I

    .line 150
    .line 151
    const/4 v5, -0x1

    .line 152
    if-eq v1, v5, :cond_5

    .line 153
    .line 154
    iget v8, p0, Le6;->l:I

    .line 155
    .line 156
    if-gt v1, v8, :cond_5

    .line 157
    .line 158
    iget v4, v4, Ltb1;->u:I

    .line 159
    .line 160
    if-eq v4, v5, :cond_5

    .line 161
    .line 162
    iget v5, p0, Le6;->k:I

    .line 163
    .line 164
    if-gt v4, v5, :cond_5

    .line 165
    .line 166
    iget v4, v0, Ltb1;->v:I

    .line 167
    .line 168
    if-ge v1, v4, :cond_5

    .line 169
    .line 170
    return v3

    .line 171
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_6
    :goto_3
    return v2
.end method

.method public final k()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Le6;->u:Lnm1;

    .line 3
    .line 4
    return-void
.end method

.method public final n()I
    .locals 0

    .line 1
    iget p0, p0, Le6;->s:I

    .line 2
    .line 3
    return p0
.end method

.method public final p(F)V
    .locals 0

    .line 1
    iput p1, p0, Le6;->q:F

    .line 2
    .line 3
    return-void
.end method

.method public final q()Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final v(J)I
    .locals 8

    .line 1
    iget-object v0, p0, Le6;->g:Lcp;

    .line 2
    .line 3
    invoke-interface {v0}, Lcp;->J()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    long-to-float v0, v0

    .line 8
    iget v1, p0, Le6;->m:F

    .line 9
    .line 10
    mul-float/2addr v0, v1

    .line 11
    float-to-long v0, v0

    .line 12
    long-to-float v0, v0

    .line 13
    iget v1, p0, Le6;->q:F

    .line 14
    .line 15
    div-float/2addr v0, v1

    .line 16
    float-to-long v0, v0

    .line 17
    iget-object v2, p0, Le6;->o:Lyw1;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_0
    const/4 v3, 0x1

    .line 27
    move v4, v3

    .line 28
    :goto_0
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    sub-int/2addr v5, v3

    .line 33
    if-ge v4, v5, :cond_1

    .line 34
    .line 35
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    check-cast v5, Ld6;

    .line 40
    .line 41
    iget-wide v5, v5, Ld6;->a:J

    .line 42
    .line 43
    cmp-long v5, v5, v0

    .line 44
    .line 45
    if-gez v5, :cond_1

    .line 46
    .line 47
    add-int/lit8 v4, v4, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    add-int/lit8 v3, v4, -0x1

    .line 51
    .line 52
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Ld6;

    .line 57
    .line 58
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    check-cast v2, Ld6;

    .line 63
    .line 64
    iget-wide v4, v3, Ld6;->a:J

    .line 65
    .line 66
    sub-long/2addr v0, v4

    .line 67
    long-to-float v0, v0

    .line 68
    iget-wide v6, v2, Ld6;->a:J

    .line 69
    .line 70
    sub-long/2addr v6, v4

    .line 71
    long-to-float v1, v6

    .line 72
    div-float/2addr v0, v1

    .line 73
    iget-wide v3, v3, Ld6;->b:J

    .line 74
    .line 75
    iget-wide v1, v2, Ld6;->b:J

    .line 76
    .line 77
    sub-long/2addr v1, v3

    .line 78
    long-to-float v1, v1

    .line 79
    mul-float/2addr v0, v1

    .line 80
    float-to-long v0, v0

    .line 81
    add-long/2addr v0, v3

    .line 82
    :goto_1
    const/4 v2, 0x0

    .line 83
    move v3, v2

    .line 84
    :goto_2
    iget v4, p0, Lvq;->b:I

    .line 85
    .line 86
    if-ge v2, v4, :cond_5

    .line 87
    .line 88
    const-wide/high16 v4, -0x8000000000000000L

    .line 89
    .line 90
    cmp-long v4, p1, v4

    .line 91
    .line 92
    if-eqz v4, :cond_2

    .line 93
    .line 94
    invoke-virtual {p0, v2, p1, p2}, Lvq;->a(IJ)Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-nez v4, :cond_4

    .line 99
    .line 100
    :cond_2
    iget-object v3, p0, Lvq;->d:[Ltb1;

    .line 101
    .line 102
    aget-object v3, v3, v2

    .line 103
    .line 104
    iget v3, v3, Ltb1;->j:I

    .line 105
    .line 106
    int-to-long v3, v3

    .line 107
    cmp-long v3, v3, v0

    .line 108
    .line 109
    if-gtz v3, :cond_3

    .line 110
    .line 111
    return v2

    .line 112
    :cond_3
    move v3, v2

    .line 113
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_5
    return v3
.end method
