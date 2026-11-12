.class public final Lb40;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lno2;
.implements Lmo2;


# instance fields
.field public final n:Lno2;

.field public o:Lmo2;

.field public p:[La40;

.field public q:J

.field public r:J

.field public s:J

.field public t:J

.field public u:Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;


# direct methods
.method public constructor <init>(Lno2;ZJJ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lb40;->n:Lno2;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    new-array p1, p1, [La40;

    .line 8
    .line 9
    iput-object p1, p0, Lb40;->p:[La40;

    .line 10
    .line 11
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    move-wide p1, p3

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-wide p1, v0

    .line 21
    :goto_0
    iput-wide p1, p0, Lb40;->q:J

    .line 22
    .line 23
    iput-wide v0, p0, Lb40;->r:J

    .line 24
    .line 25
    iput-wide p3, p0, Lb40;->s:J

    .line 26
    .line 27
    iput-wide p5, p0, Lb40;->t:J

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lb40;->q:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long p0, v0, v2

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method public final b(Lno2;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lb40;->u:Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p1, p0, Lb40;->o:Lmo2;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, p0}, Lmo2;->b(Lno2;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final c([Lt41;[Z[Lq44;[ZJ)J
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v8, p3

    .line 4
    .line 5
    array-length v1, v8

    .line 6
    new-array v1, v1, [La40;

    .line 7
    .line 8
    iput-object v1, v0, Lb40;->p:[La40;

    .line 9
    .line 10
    array-length v1, v8

    .line 11
    new-array v4, v1, [Lq44;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    array-length v2, v8

    .line 15
    if-ge v1, v2, :cond_1

    .line 16
    .line 17
    iget-object v2, v0, Lb40;->p:[La40;

    .line 18
    .line 19
    aget-object v3, v8, v1

    .line 20
    .line 21
    check-cast v3, La40;

    .line 22
    .line 23
    aput-object v3, v2, v1

    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    iget-object v10, v3, La40;->n:Lq44;

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    const/4 v10, 0x0

    .line 31
    :goto_1
    aput-object v10, v4, v1

    .line 32
    .line 33
    add-int/lit8 v1, v1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    iget-object v1, v0, Lb40;->n:Lno2;

    .line 37
    .line 38
    move-object/from16 v2, p1

    .line 39
    .line 40
    move-object/from16 v3, p2

    .line 41
    .line 42
    move-object/from16 v5, p4

    .line 43
    .line 44
    move-wide/from16 v6, p5

    .line 45
    .line 46
    invoke-interface/range {v1 .. v7}, Lno2;->c([Lt41;[Z[Lq44;[ZJ)J

    .line 47
    .line 48
    .line 49
    move-result-wide v11

    .line 50
    iget-wide v13, v0, Lb40;->t:J

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    invoke-static {v11, v12, v6, v7}, Ljava/lang/Math;->max(JJ)J

    .line 54
    .line 55
    .line 56
    move-result-wide v9

    .line 57
    const-wide/high16 v15, -0x8000000000000000L

    .line 58
    .line 59
    cmp-long v5, v13, v15

    .line 60
    .line 61
    if-eqz v5, :cond_2

    .line 62
    .line 63
    invoke-static {v9, v10, v13, v14}, Ljava/lang/Math;->min(JJ)J

    .line 64
    .line 65
    .line 66
    move-result-wide v9

    .line 67
    :cond_2
    invoke-virtual {v0}, Lb40;->a()Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_5

    .line 72
    .line 73
    cmp-long v5, v11, v6

    .line 74
    .line 75
    if-gez v5, :cond_3

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_3
    const-wide/16 v5, 0x0

    .line 79
    .line 80
    cmp-long v5, v11, v5

    .line 81
    .line 82
    if-eqz v5, :cond_5

    .line 83
    .line 84
    array-length v5, v2

    .line 85
    const/4 v6, 0x0

    .line 86
    :goto_2
    if-ge v6, v5, :cond_5

    .line 87
    .line 88
    aget-object v7, v2, v6

    .line 89
    .line 90
    if-eqz v7, :cond_4

    .line 91
    .line 92
    invoke-interface {v7}, Lt41;->m()Ltb1;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    iget-object v11, v7, Ltb1;->n:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v7, v7, Ltb1;->k:Ljava/lang/String;

    .line 99
    .line 100
    invoke-static {v11, v7}, Llw2;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 101
    .line 102
    .line 103
    move-result v7

    .line 104
    if-nez v7, :cond_4

    .line 105
    .line 106
    :goto_3
    move-wide v5, v9

    .line 107
    goto :goto_4

    .line 108
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_5
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    :goto_4
    iput-wide v5, v0, Lb40;->q:J

    .line 117
    .line 118
    const/4 v1, 0x0

    .line 119
    :goto_5
    array-length v2, v8

    .line 120
    if-ge v1, v2, :cond_9

    .line 121
    .line 122
    aget-object v2, v4, v1

    .line 123
    .line 124
    iget-object v5, v0, Lb40;->p:[La40;

    .line 125
    .line 126
    if-nez v2, :cond_6

    .line 127
    .line 128
    aput-object v3, v5, v1

    .line 129
    .line 130
    goto :goto_6

    .line 131
    :cond_6
    aget-object v6, v5, v1

    .line 132
    .line 133
    if-eqz v6, :cond_7

    .line 134
    .line 135
    iget-object v6, v6, La40;->n:Lq44;

    .line 136
    .line 137
    if-eq v6, v2, :cond_8

    .line 138
    .line 139
    :cond_7
    new-instance v6, La40;

    .line 140
    .line 141
    invoke-direct {v6, v0, v2}, La40;-><init>(Lb40;Lq44;)V

    .line 142
    .line 143
    .line 144
    aput-object v6, v5, v1

    .line 145
    .line 146
    :cond_8
    :goto_6
    aget-object v2, v5, v1

    .line 147
    .line 148
    aput-object v2, v8, v1

    .line 149
    .line 150
    add-int/lit8 v1, v1, 0x1

    .line 151
    .line 152
    goto :goto_5

    .line 153
    :cond_9
    return-wide v9
.end method

.method public final d()J
    .locals 6

    .line 1
    iget-object v0, p0, Lb40;->n:Lno2;

    .line 2
    .line 3
    invoke-interface {v0}, Lda4;->d()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/high16 v2, -0x8000000000000000L

    .line 8
    .line 9
    cmp-long v4, v0, v2

    .line 10
    .line 11
    if-eqz v4, :cond_1

    .line 12
    .line 13
    iget-wide v4, p0, Lb40;->t:J

    .line 14
    .line 15
    cmp-long p0, v4, v2

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    cmp-long p0, v0, v4

    .line 20
    .line 21
    if-ltz p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-wide v0

    .line 25
    :cond_1
    :goto_0
    return-wide v2
.end method

.method public final e(JLn84;)J
    .locals 9

    .line 1
    iget-wide v0, p0, Lb40;->s:J

    .line 2
    .line 3
    cmp-long v2, p1, v0

    .line 4
    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_0
    iget-wide v3, p3, Ln84;->a:J

    .line 9
    .line 10
    const-wide/16 v5, 0x0

    .line 11
    .line 12
    sub-long v7, p1, v0

    .line 13
    .line 14
    invoke-static/range {v3 .. v8}, Lf35;->k(JJJ)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    iget-wide v2, p3, Ln84;->b:J

    .line 19
    .line 20
    iget-wide v4, p0, Lb40;->t:J

    .line 21
    .line 22
    const-wide/high16 v6, -0x8000000000000000L

    .line 23
    .line 24
    cmp-long v6, v4, v6

    .line 25
    .line 26
    if-nez v6, :cond_1

    .line 27
    .line 28
    const-wide v4, 0x7fffffffffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    :goto_0
    move-wide v6, v4

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    sub-long/2addr v4, p1

    .line 36
    goto :goto_0

    .line 37
    :goto_1
    const-wide/16 v4, 0x0

    .line 38
    .line 39
    invoke-static/range {v2 .. v7}, Lf35;->k(JJJ)J

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    iget-wide v4, p3, Ln84;->a:J

    .line 44
    .line 45
    cmp-long v4, v0, v4

    .line 46
    .line 47
    if-nez v4, :cond_2

    .line 48
    .line 49
    iget-wide v4, p3, Ln84;->b:J

    .line 50
    .line 51
    cmp-long v4, v2, v4

    .line 52
    .line 53
    if-nez v4, :cond_2

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    new-instance p3, Ln84;

    .line 57
    .line 58
    invoke-direct {p3, v0, v1, v2, v3}, Ln84;-><init>(JJ)V

    .line 59
    .line 60
    .line 61
    :goto_2
    iget-object p0, p0, Lb40;->n:Lno2;

    .line 62
    .line 63
    invoke-interface {p0, p1, p2, p3}, Lno2;->e(JLn84;)J

    .line 64
    .line 65
    .line 66
    move-result-wide p0

    .line 67
    return-wide p0
.end method

.method public final f()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lb40;->n:Lno2;

    .line 2
    .line 3
    invoke-interface {p0}, Lda4;->f()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-object v0, p0, Lb40;->u:Landroidx/media3/exoplayer/source/ClippingMediaSource$IllegalClippingException;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lb40;->n:Lno2;

    .line 6
    .line 7
    invoke-interface {p0}, Lno2;->h()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    throw v0
.end method

.method public final i(J)J
    .locals 5

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    iput-wide v0, p0, Lb40;->q:J

    .line 7
    .line 8
    iget-object v0, p0, Lb40;->p:[La40;

    .line 9
    .line 10
    array-length v1, v0

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :goto_0
    if-ge v3, v1, :cond_1

    .line 14
    .line 15
    aget-object v4, v0, v3

    .line 16
    .line 17
    if-eqz v4, :cond_0

    .line 18
    .line 19
    iput-boolean v2, v4, La40;->o:Z

    .line 20
    .line 21
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v0, p0, Lb40;->n:Lno2;

    .line 25
    .line 26
    invoke-interface {v0, p1, p2}, Lno2;->i(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    iget-wide v0, p0, Lb40;->s:J

    .line 31
    .line 32
    iget-wide v2, p0, Lb40;->t:J

    .line 33
    .line 34
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 35
    .line 36
    .line 37
    move-result-wide p0

    .line 38
    const-wide/high16 v0, -0x8000000000000000L

    .line 39
    .line 40
    cmp-long p2, v2, v0

    .line 41
    .line 42
    if-eqz p2, :cond_2

    .line 43
    .line 44
    invoke-static {p0, p1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 45
    .line 46
    .line 47
    move-result-wide p0

    .line 48
    :cond_2
    return-wide p0
.end method

.method public final j(Lda4;)V
    .locals 0

    .line 1
    check-cast p1, Lno2;

    .line 2
    .line 3
    iget-object p1, p0, Lb40;->o:Lmo2;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, p0}, Lca4;->j(Lda4;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final k(ZJ)V
    .locals 0

    .line 1
    iget-object p0, p0, Lb40;->n:Lno2;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2, p3}, Lno2;->k(ZJ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final l()J
    .locals 9

    .line 1
    invoke-virtual {p0}, Lb40;->a()Z

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
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-wide v3, p0, Lb40;->q:J

    .line 13
    .line 14
    iput-wide v1, p0, Lb40;->q:J

    .line 15
    .line 16
    iput-wide v3, p0, Lb40;->r:J

    .line 17
    .line 18
    invoke-virtual {p0}, Lb40;->l()J

    .line 19
    .line 20
    .line 21
    move-result-wide v5

    .line 22
    cmp-long p0, v5, v1

    .line 23
    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    return-wide v5

    .line 27
    :cond_0
    return-wide v3

    .line 28
    :cond_1
    iget-object v0, p0, Lb40;->n:Lno2;

    .line 29
    .line 30
    invoke-interface {v0}, Lno2;->l()J

    .line 31
    .line 32
    .line 33
    move-result-wide v3

    .line 34
    cmp-long v0, v3, v1

    .line 35
    .line 36
    if-nez v0, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    iget-wide v5, p0, Lb40;->s:J

    .line 40
    .line 41
    iget-wide v7, p0, Lb40;->t:J

    .line 42
    .line 43
    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    const-wide/high16 v5, -0x8000000000000000L

    .line 48
    .line 49
    cmp-long v0, v7, v5

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->min(JJ)J

    .line 54
    .line 55
    .line 56
    move-result-wide v3

    .line 57
    :cond_3
    iget-wide v5, p0, Lb40;->r:J

    .line 58
    .line 59
    cmp-long v0, v3, v5

    .line 60
    .line 61
    if-nez v0, :cond_4

    .line 62
    .line 63
    :goto_0
    return-wide v1

    .line 64
    :cond_4
    iput-wide v3, p0, Lb40;->r:J

    .line 65
    .line 66
    return-wide v3
.end method

.method public final m(Lmo2;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb40;->o:Lmo2;

    .line 2
    .line 3
    iget-object p1, p0, Lb40;->n:Lno2;

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
    iget-object p0, p0, Lb40;->n:Lno2;

    .line 2
    .line 3
    invoke-interface {p0}, Lno2;->n()Ltv4;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final o(Lpd2;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lb40;->n:Lno2;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lda4;->o(Lpd2;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final q()J
    .locals 6

    .line 1
    iget-object v0, p0, Lb40;->n:Lno2;

    .line 2
    .line 3
    invoke-interface {v0}, Lda4;->q()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/high16 v2, -0x8000000000000000L

    .line 8
    .line 9
    cmp-long v4, v0, v2

    .line 10
    .line 11
    if-eqz v4, :cond_1

    .line 12
    .line 13
    iget-wide v4, p0, Lb40;->t:J

    .line 14
    .line 15
    cmp-long p0, v4, v2

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    cmp-long p0, v0, v4

    .line 20
    .line 21
    if-ltz p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    return-wide v0

    .line 25
    :cond_1
    :goto_0
    return-wide v2
.end method

.method public final u(J)V
    .locals 0

    .line 1
    iget-object p0, p0, Lb40;->n:Lno2;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Lda4;->u(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
