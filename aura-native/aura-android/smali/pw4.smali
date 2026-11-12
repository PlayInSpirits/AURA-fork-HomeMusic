.class public final Lpw4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lno2;
.implements Lmo2;


# instance fields
.field public n:Lno2;

.field public o:Lbq;

.field public final p:Lmt2;

.field public final q:Ln9;

.field public r:Lmo2;

.field public s:J

.field public t:Z

.field public u:Ljava/lang/Integer;

.field public v:[Lt41;

.field public w:[Z

.field public x:[Low4;

.field public final synthetic y:Lqw4;


# direct methods
.method public constructor <init>(Lqw4;Lno2;Lkr3;Lmt2;Ln9;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lpw4;->y:Lqw4;

    .line 11
    .line 12
    iput-object p2, p0, Lpw4;->n:Lno2;

    .line 13
    .line 14
    iput-object p3, p0, Lpw4;->o:Lbq;

    .line 15
    .line 16
    iput-object p4, p0, Lpw4;->p:Lmt2;

    .line 17
    .line 18
    iput-object p5, p0, Lpw4;->q:Ln9;

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    new-array p1, p1, [Low4;

    .line 22
    .line 23
    iput-object p1, p0, Lpw4;->x:[Low4;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final b(Lno2;)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lpw4;->t:Z

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iget-object v0, p0, Lpw4;->n:Lno2;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_7

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput-boolean p1, p0, Lpw4;->t:Z

    .line 15
    .line 16
    iget-object v0, p0, Lpw4;->v:[Lt41;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto/16 :goto_4

    .line 21
    .line 22
    :cond_0
    iget-object v1, p0, Lpw4;->w:[Z

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    goto :goto_4

    .line 27
    :cond_1
    array-length v2, v0

    .line 28
    iget-object v3, p0, Lpw4;->x:[Low4;

    .line 29
    .line 30
    array-length v3, v3

    .line 31
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_2

    .line 36
    .line 37
    goto :goto_4

    .line 38
    :cond_2
    new-array v6, v2, [Lq44;

    .line 39
    .line 40
    new-array v7, v2, [Z

    .line 41
    .line 42
    invoke-static {p1, v2}, Lgb;->g0(II)Lj02;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3}, Lj02;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_3

    .line 54
    .line 55
    invoke-static {v0, p1, p1}, Lti;->e0([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    iget v4, v3, Lh02;->n:I

    .line 61
    .line 62
    iget v3, v3, Lh02;->o:I

    .line 63
    .line 64
    add-int/lit8 v3, v3, 0x1

    .line 65
    .line 66
    invoke-static {v0, v4, v3}, Lti;->e0([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    :goto_0
    move-object v4, v0

    .line 71
    check-cast v4, [Lt41;

    .line 72
    .line 73
    invoke-static {p1, v2}, Lgb;->g0(II)Lj02;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0}, Lj02;->isEmpty()Z

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    if-eqz v3, :cond_4

    .line 85
    .line 86
    new-array v0, p1, [Z

    .line 87
    .line 88
    :goto_1
    move-object v5, v0

    .line 89
    goto :goto_2

    .line 90
    :cond_4
    iget v3, v0, Lh02;->n:I

    .line 91
    .line 92
    iget v0, v0, Lh02;->o:I

    .line 93
    .line 94
    add-int/lit8 v0, v0, 0x1

    .line 95
    .line 96
    array-length v5, v1

    .line 97
    invoke-static {v0, v5}, Lji2;->u(II)V

    .line 98
    .line 99
    .line 100
    invoke-static {v1, v3, v0}, Ljava/util/Arrays;->copyOfRange([ZII)[Z

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :goto_2
    iget-object v3, p0, Lpw4;->n:Lno2;

    .line 109
    .line 110
    const-wide/16 v8, 0x0

    .line 111
    .line 112
    invoke-interface/range {v3 .. v9}, Lno2;->c([Lt41;[Z[Lq44;[ZJ)J

    .line 113
    .line 114
    .line 115
    :goto_3
    if-ge p1, v2, :cond_6

    .line 116
    .line 117
    iget-object v0, p0, Lpw4;->x:[Low4;

    .line 118
    .line 119
    aget-object v0, v0, p1

    .line 120
    .line 121
    if-eqz v0, :cond_5

    .line 122
    .line 123
    aget-object v1, v6, p1

    .line 124
    .line 125
    iput-object v1, v0, Low4;->n:Lq44;

    .line 126
    .line 127
    :cond_5
    add-int/lit8 p1, p1, 0x1

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_6
    :goto_4
    iget-object p1, p0, Lpw4;->r:Lmo2;

    .line 131
    .line 132
    if-eqz p1, :cond_8

    .line 133
    .line 134
    invoke-interface {p1, p0}, Lca4;->j(Lda4;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_7
    iget-object p1, p0, Lpw4;->r:Lmo2;

    .line 139
    .line 140
    if-eqz p1, :cond_8

    .line 141
    .line 142
    invoke-interface {p1, p0}, Lmo2;->b(Lno2;)V

    .line 143
    .line 144
    .line 145
    :cond_8
    return-void
.end method

.method public final c([Lt41;[Z[Lq44;[ZJ)J
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lpw4;->v:[Lt41;

    .line 11
    .line 12
    iput-object p2, p0, Lpw4;->w:[Z

    .line 13
    .line 14
    array-length v1, p3

    .line 15
    new-array v5, v1, [Lq44;

    .line 16
    .line 17
    array-length v1, p3

    .line 18
    const/4 v9, 0x0

    .line 19
    move v2, v9

    .line 20
    move v3, v2

    .line 21
    :goto_0
    const/4 v10, 0x0

    .line 22
    if-ge v2, v1, :cond_2

    .line 23
    .line 24
    aget-object v4, p3, v2

    .line 25
    .line 26
    add-int/lit8 v6, v3, 0x1

    .line 27
    .line 28
    instance-of v7, v4, Low4;

    .line 29
    .line 30
    if-eqz v7, :cond_0

    .line 31
    .line 32
    check-cast v4, Low4;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    move-object v4, v10

    .line 36
    :goto_1
    if-eqz v4, :cond_1

    .line 37
    .line 38
    iget-object v10, v4, Low4;->n:Lq44;

    .line 39
    .line 40
    :cond_1
    aput-object v10, v5, v3

    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    move v3, v6

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    iget-object v2, p0, Lpw4;->n:Lno2;

    .line 47
    .line 48
    iget-wide v3, p0, Lpw4;->s:J

    .line 49
    .line 50
    sub-long v7, p5, v3

    .line 51
    .line 52
    move-object v3, p1

    .line 53
    move-object v4, p2

    .line 54
    move-object v6, p4

    .line 55
    invoke-interface/range {v2 .. v8}, Lno2;->c([Lt41;[Z[Lq44;[ZJ)J

    .line 56
    .line 57
    .line 58
    move-result-wide p1

    .line 59
    array-length v1, p3

    .line 60
    new-array v1, v1, [Low4;

    .line 61
    .line 62
    array-length v2, p3

    .line 63
    :goto_2
    if-ge v9, v2, :cond_6

    .line 64
    .line 65
    aget-object v3, v5, v9

    .line 66
    .line 67
    if-nez v3, :cond_3

    .line 68
    .line 69
    aput-object v10, p3, v9

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_3
    aget-object v4, p3, v9

    .line 73
    .line 74
    instance-of v6, v4, Low4;

    .line 75
    .line 76
    if-eqz v6, :cond_4

    .line 77
    .line 78
    check-cast v4, Low4;

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_4
    move-object v4, v10

    .line 82
    :goto_3
    if-eqz v4, :cond_5

    .line 83
    .line 84
    iget-object v6, v4, Low4;->n:Lq44;

    .line 85
    .line 86
    if-ne v6, v3, :cond_5

    .line 87
    .line 88
    aput-object v4, v1, v9

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_5
    new-instance v4, Low4;

    .line 92
    .line 93
    invoke-direct {v4, p0, v3}, Low4;-><init>(Lpw4;Lq44;)V

    .line 94
    .line 95
    .line 96
    aput-object v4, v1, v9

    .line 97
    .line 98
    aput-object v4, p3, v9

    .line 99
    .line 100
    :goto_4
    add-int/lit8 v9, v9, 0x1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_6
    iput-object v1, p0, Lpw4;->x:[Low4;

    .line 104
    .line 105
    iget-wide v0, p0, Lpw4;->s:J

    .line 106
    .line 107
    add-long/2addr p1, v0

    .line 108
    return-wide p1
.end method

.method public final d()J
    .locals 7

    .line 1
    iget-boolean v0, p0, Lpw4;->t:Z

    .line 2
    .line 3
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lpw4;->n:Lno2;

    .line 12
    .line 13
    invoke-interface {v0}, Lda4;->d()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    const-wide/high16 v5, -0x8000000000000000L

    .line 18
    .line 19
    cmp-long v0, v3, v5

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    return-wide v5

    .line 24
    :cond_1
    cmp-long v0, v3, v1

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    :goto_0
    return-wide v1

    .line 29
    :cond_2
    iget-wide v0, p0, Lpw4;->s:J

    .line 30
    .line 31
    add-long/2addr v3, v0

    .line 32
    return-wide v3
.end method

.method public final e(JLn84;)J
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-wide p1
.end method

.method public final f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lpw4;->t:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object p0, p0, Lpw4;->n:Lno2;

    .line 6
    .line 7
    invoke-interface {p0}, Lda4;->f()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lpw4;->t:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lpw4;->n:Lno2;

    .line 6
    .line 7
    invoke-interface {p0}, Lno2;->h()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final i(J)J
    .locals 9

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    iget-wide v2, p0, Lpw4;->s:J

    .line 8
    .line 9
    cmp-long v2, v2, v0

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lpw4;->n:Lno2;

    .line 14
    .line 15
    invoke-interface {p0, p1, p2}, Lno2;->i(J)J

    .line 16
    .line 17
    .line 18
    move-result-wide p0

    .line 19
    return-wide p0

    .line 20
    :cond_0
    iget-object v2, p0, Lpw4;->n:Lno2;

    .line 21
    .line 22
    sget-object v3, Ln84;->d:Ln84;

    .line 23
    .line 24
    invoke-interface {v2, p1, p2, v3}, Lno2;->e(JLn84;)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    cmp-long v2, v2, v0

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    iget-object p0, p0, Lpw4;->n:Lno2;

    .line 33
    .line 34
    invoke-interface {p0, p1, p2}, Lno2;->i(J)J

    .line 35
    .line 36
    .line 37
    move-result-wide p0

    .line 38
    return-wide p0

    .line 39
    :cond_1
    iget-object v2, p0, Lpw4;->y:Lqw4;

    .line 40
    .line 41
    iget-object v3, v2, Lqw4;->k:Lgn2;

    .line 42
    .line 43
    const/4 v4, 0x1

    .line 44
    iput-boolean v4, p0, Lpw4;->t:Z

    .line 45
    .line 46
    iput-wide p1, p0, Lpw4;->s:J

    .line 47
    .line 48
    iget-object v4, p0, Lpw4;->x:[Low4;

    .line 49
    .line 50
    array-length v5, v4

    .line 51
    const/4 v6, 0x0

    .line 52
    :goto_0
    if-ge v6, v5, :cond_3

    .line 53
    .line 54
    aget-object v7, v4, v6

    .line 55
    .line 56
    if-eqz v7, :cond_2

    .line 57
    .line 58
    const/4 v8, 0x0

    .line 59
    iput-object v8, v7, Low4;->n:Lq44;

    .line 60
    .line 61
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    iget-object v4, p0, Lpw4;->o:Lbq;

    .line 65
    .line 66
    iget-object v5, p0, Lpw4;->n:Lno2;

    .line 67
    .line 68
    invoke-virtual {v4, v5}, Lbq;->n(Lno2;)V

    .line 69
    .line 70
    .line 71
    iget-object v4, p0, Lpw4;->u:Ljava/lang/Integer;

    .line 72
    .line 73
    if-eqz v4, :cond_4

    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {v2, v4}, Lp80;->y(Ljava/lang/Integer;)V

    .line 84
    .line 85
    .line 86
    :cond_4
    invoke-static {p1, p2}, Lf35;->i0(J)J

    .line 87
    .line 88
    .line 89
    move-result-wide v4

    .line 90
    const-wide/16 v6, 0x3e8

    .line 91
    .line 92
    div-long/2addr v4, v6

    .line 93
    iget-object v6, v3, Lgn2;->a:Ljava/lang/String;

    .line 94
    .line 95
    long-to-int v4, v4

    .line 96
    invoke-static {v4, v6}, Le03;->j(ILjava/lang/String;)Landroid/net/Uri;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-virtual {v3}, Lgn2;->a()Ltm2;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    iput-object v4, v3, Ltm2;->b:Landroid/net/Uri;

    .line 105
    .line 106
    invoke-virtual {v3}, Ltm2;->a()Lgn2;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    iget-object v4, v2, Lqw4;->l:Ljr3;

    .line 111
    .line 112
    invoke-virtual {v4, v3}, Ljr3;->f(Lgn2;)Lkr3;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    iget v4, v2, Lqw4;->o:I

    .line 117
    .line 118
    add-int/lit8 v5, v4, 0x1

    .line 119
    .line 120
    iput v5, v2, Lqw4;->o:I

    .line 121
    .line 122
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    iput-object v5, p0, Lpw4;->u:Ljava/lang/Integer;

    .line 127
    .line 128
    iput-object v3, p0, Lpw4;->o:Lbq;

    .line 129
    .line 130
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    invoke-virtual {v2, v4, v3}, Lp80;->x(Ljava/lang/Integer;Lbq;)V

    .line 135
    .line 136
    .line 137
    iget-object v2, p0, Lpw4;->p:Lmt2;

    .line 138
    .line 139
    iget-object v4, p0, Lpw4;->q:Ln9;

    .line 140
    .line 141
    invoke-virtual {v3, v2, v4, v0, v1}, Lkr3;->b(Lmt2;Ln9;J)Lno2;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    iput-object v2, p0, Lpw4;->n:Lno2;

    .line 146
    .line 147
    check-cast v2, Lhr3;

    .line 148
    .line 149
    invoke-virtual {v2, p0, v0, v1}, Lhr3;->m(Lmo2;J)V

    .line 150
    .line 151
    .line 152
    return-wide p1
.end method

.method public final j(Lda4;)V
    .locals 0

    .line 1
    check-cast p1, Lno2;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, Lpw4;->t:Z

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lpw4;->r:Lmo2;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-interface {p1, p0}, Lca4;->j(Lda4;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final k(ZJ)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lpw4;->t:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lpw4;->n:Lno2;

    .line 6
    .line 7
    iget-wide v1, p0, Lpw4;->s:J

    .line 8
    .line 9
    sub-long/2addr p2, v1

    .line 10
    invoke-interface {v0, p1, p2, p3}, Lno2;->k(ZJ)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public final l()J
    .locals 5

    .line 1
    iget-boolean v0, p0, Lpw4;->t:Z

    .line 2
    .line 3
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Lpw4;->n:Lno2;

    .line 12
    .line 13
    invoke-interface {v0}, Lno2;->l()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    cmp-long v0, v3, v1

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    :goto_0
    return-wide v1

    .line 22
    :cond_1
    iget-wide v0, p0, Lpw4;->s:J

    .line 23
    .line 24
    add-long/2addr v3, v0

    .line 25
    return-wide v3
.end method

.method public final m(Lmo2;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lpw4;->r:Lmo2;

    .line 2
    .line 3
    iget-object p1, p0, Lpw4;->n:Lno2;

    .line 4
    .line 5
    invoke-interface {p1, p0, p2, p3}, Lno2;->m(Lmo2;J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final n()Ltv4;
    .locals 0

    .line 1
    iget-object p0, p0, Lpw4;->n:Lno2;

    .line 2
    .line 3
    invoke-interface {p0}, Lno2;->n()Ltv4;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public final o(Lpd2;)Z
    .locals 5

    .line 1
    iget-boolean v0, p0, Lpw4;->t:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    new-instance v0, Lod2;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iget-wide v1, p1, Lpd2;->a:J

    .line 13
    .line 14
    iget v3, p1, Lpd2;->b:F

    .line 15
    .line 16
    iput v3, v0, Lod2;->b:F

    .line 17
    .line 18
    iget-wide v3, p1, Lpd2;->c:J

    .line 19
    .line 20
    iput-wide v3, v0, Lod2;->c:J

    .line 21
    .line 22
    iget-wide v3, p0, Lpw4;->s:J

    .line 23
    .line 24
    sub-long/2addr v1, v3

    .line 25
    iput-wide v1, v0, Lod2;->a:J

    .line 26
    .line 27
    iget-object p0, p0, Lpw4;->n:Lno2;

    .line 28
    .line 29
    new-instance p1, Lpd2;

    .line 30
    .line 31
    invoke-direct {p1, v0}, Lpd2;-><init>(Lod2;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {p0, p1}, Lda4;->o(Lpd2;)Z

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    return p0
.end method

.method public final q()J
    .locals 5

    .line 1
    iget-boolean v0, p0, Lpw4;->t:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, Lpw4;->s:J

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    iget-object v0, p0, Lpw4;->n:Lno2;

    .line 9
    .line 10
    invoke-interface {v0}, Lda4;->q()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    const-wide/high16 v2, -0x8000000000000000L

    .line 15
    .line 16
    cmp-long v4, v0, v2

    .line 17
    .line 18
    if-nez v4, :cond_1

    .line 19
    .line 20
    return-wide v2

    .line 21
    :cond_1
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    cmp-long v4, v0, v2

    .line 27
    .line 28
    if-nez v4, :cond_2

    .line 29
    .line 30
    return-wide v2

    .line 31
    :cond_2
    iget-wide v2, p0, Lpw4;->s:J

    .line 32
    .line 33
    add-long/2addr v0, v2

    .line 34
    return-wide v0
.end method

.method public final u(J)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lpw4;->t:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lpw4;->n:Lno2;

    .line 6
    .line 7
    iget-wide v1, p0, Lpw4;->s:J

    .line 8
    .line 9
    sub-long/2addr p1, v1

    .line 10
    invoke-interface {v0, p1, p2}, Lda4;->u(J)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method
