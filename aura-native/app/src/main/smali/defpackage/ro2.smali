.class public final Ldefpackage/ro2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ldefpackage/zt4;

.field public final b:Ldefpackage/bu4;

.field public final c:Ldefpackage/nj0;

.field public final d:Ldefpackage/yp4;

.field public final e:Ldefpackage/cn;

.field public f:J

.field public g:I

.field public h:Z

.field public i:Ldefpackage/oo2;

.field public j:Ldefpackage/oo2;

.field public k:Ldefpackage/oo2;

.field public l:Ldefpackage/oo2;

.field public m:Ldefpackage/oo2;

.field public n:I

.field public o:Ljava/lang/Object;

.field public p:J

.field public q:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ldefpackage/nj0;Ldefpackage/yp4;Ldefpackage/cn;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/ro2;->c:Ldefpackage/nj0;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/ro2;->d:Ldefpackage/yp4;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/ro2;->e:Ldefpackage/cn;

    .line 9
    .line 10
    new-instance p1, Ldefpackage/zt4;

    .line 11
    .line 12
    invoke-direct {p1}, Ldefpackage/zt4;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ldefpackage/ro2;->a:Ldefpackage/zt4;

    .line 16
    .line 17
    new-instance p1, Ldefpackage/bu4;

    .line 18
    .line 19
    invoke-direct {p1}, Ldefpackage/bu4;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Ldefpackage/ro2;->b:Ldefpackage/bu4;

    .line 23
    .line 24
    new-instance p1, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Ldefpackage/ro2;->q:Ljava/util/ArrayList;

    .line 30
    .line 31
    return-void
.end method

.method public static p(Ldefpackage/cu4;Ljava/lang/Object;JJLdefpackage/bu4;Ldefpackage/zt4;)Ldefpackage/mt2;
    .locals 14

    .line 1
    move-wide/from16 v0, p2

    .line 2
    .line 3
    move-object/from16 v2, p6

    .line 4
    .line 5
    move-object/from16 v4, p7

    .line 6
    .line 7
    invoke-virtual {p0, p1, v4}, Ldefpackage/cu4;->g(Ljava/lang/Object;Ldefpackage/zt4;)Ldefpackage/zt4;

    .line 8
    .line 9
    .line 10
    iget v5, v4, Ldefpackage/zt4;->c:I

    .line 11
    .line 12
    invoke-virtual {p0, v5, v2}, Ldefpackage/cu4;->n(ILdefpackage/bu4;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual/range {p0 .. p1}, Ldefpackage/cu4;->b(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    move-object v7, p1

    .line 20
    :goto_0
    iget-object v3, v4, Ldefpackage/zt4;->g:Ldefpackage/z5;

    .line 21
    .line 22
    iget v3, v3, Ldefpackage/z5;->a:I

    .line 23
    .line 24
    const/4 v6, -0x1

    .line 25
    if-eqz v3, :cond_5

    .line 26
    .line 27
    const/4 v8, 0x1

    .line 28
    const/4 v9, 0x0

    .line 29
    if-ne v3, v8, :cond_0

    .line 30
    .line 31
    invoke-virtual {v4, v9}, Ldefpackage/zt4;->g(I)Z

    .line 32
    .line 33
    .line 34
    move-result v10

    .line 35
    if-nez v10, :cond_5

    .line 36
    .line 37
    :cond_0
    iget-object v10, v4, Ldefpackage/zt4;->g:Ldefpackage/z5;

    .line 38
    .line 39
    iget v10, v10, Ldefpackage/z5;->d:I

    .line 40
    .line 41
    invoke-virtual {v4, v10}, Ldefpackage/zt4;->h(I)Z

    .line 42
    .line 43
    .line 44
    move-result v10

    .line 45
    if-eqz v10, :cond_5

    .line 46
    .line 47
    const-wide/16 v10, 0x0

    .line 48
    .line 49
    invoke-virtual {v4, v10, v11}, Ldefpackage/zt4;->c(J)I

    .line 50
    .line 51
    .line 52
    move-result v12

    .line 53
    if-eq v12, v6, :cond_1

    .line 54
    .line 55
    goto :goto_4

    .line 56
    :cond_1
    iget-wide v12, v4, Ldefpackage/zt4;->d:J

    .line 57
    .line 58
    cmp-long v12, v12, v10

    .line 59
    .line 60
    if-nez v12, :cond_2

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_2
    add-int/lit8 v12, v3, -0x1

    .line 64
    .line 65
    invoke-virtual {v4, v12}, Ldefpackage/zt4;->g(I)Z

    .line 66
    .line 67
    .line 68
    move-result v12

    .line 69
    if-eqz v12, :cond_3

    .line 70
    .line 71
    const/4 v12, 0x2

    .line 72
    goto :goto_1

    .line 73
    :cond_3
    move v12, v8

    .line 74
    :goto_1
    sub-int/2addr v3, v12

    .line 75
    :goto_2
    if-gt v9, v3, :cond_4

    .line 76
    .line 77
    iget-object v12, v4, Ldefpackage/zt4;->g:Ldefpackage/z5;

    .line 78
    .line 79
    invoke-virtual {v12, v9}, Ldefpackage/z5;->a(I)Ldefpackage/x5;

    .line 80
    .line 81
    .line 82
    move-result-object v12

    .line 83
    iget-wide v12, v12, Ldefpackage/x5;->j:J

    .line 84
    .line 85
    add-long/2addr v10, v12

    .line 86
    add-int/lit8 v9, v9, 0x1

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_4
    iget-wide v12, v4, Ldefpackage/zt4;->d:J

    .line 90
    .line 91
    cmp-long v3, v12, v10

    .line 92
    .line 93
    if-gtz v3, :cond_5

    .line 94
    .line 95
    :goto_3
    iget v3, v2, Ldefpackage/bu4;->n:I

    .line 96
    .line 97
    if-gt v5, v3, :cond_5

    .line 98
    .line 99
    invoke-virtual {p0, v5, v4, v8}, Ldefpackage/cu4;->f(ILdefpackage/zt4;Z)Ldefpackage/zt4;

    .line 100
    .line 101
    .line 102
    iget-object v7, v4, Ldefpackage/zt4;->b:Ljava/lang/Object;

    .line 103
    .line 104
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    add-int/lit8 v5, v5, 0x1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_5
    :goto_4
    invoke-virtual {p0, v7, v4}, Ldefpackage/cu4;->g(Ljava/lang/Object;Ldefpackage/zt4;)Ldefpackage/zt4;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4, v0, v1}, Ldefpackage/zt4;->c(J)I

    .line 114
    .line 115
    .line 116
    move-result v8

    .line 117
    if-ne v8, v6, :cond_6

    .line 118
    .line 119
    invoke-virtual {v4, v0, v1}, Ldefpackage/zt4;->b(J)I

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    new-instance v0, Ldefpackage/mt2;

    .line 124
    .line 125
    move-wide/from16 v10, p4

    .line 126
    .line 127
    invoke-direct {v0, v7, v10, v11, p0}, Ldefpackage/mt2;-><init>(Ljava/lang/Object;JI)V

    .line 128
    .line 129
    .line 130
    return-object v0

    .line 131
    :cond_6
    move-wide/from16 v10, p4

    .line 132
    .line 133
    invoke-virtual {v4, v8}, Ldefpackage/zt4;->f(I)I

    .line 134
    .line 135
    .line 136
    move-result v9

    .line 137
    new-instance v6, Ldefpackage/mt2;

    .line 138
    .line 139
    const/4 v12, -0x1

    .line 140
    invoke-direct/range {v6 .. v12}, Ldefpackage/mt2;-><init>(Ljava/lang/Object;IIJI)V

    .line 141
    .line 142
    .line 143
    return-object v6
.end method


# virtual methods
.method public final a()Ldefpackage/oo2;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/ro2;->i:Ldefpackage/oo2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    iget-object v2, p0, Ldefpackage/ro2;->j:Ldefpackage/oo2;

    .line 8
    .line 9
    if-ne v0, v2, :cond_1

    .line 10
    .line 11
    iget-object v2, v0, Ldefpackage/oo2;->m:Ldefpackage/oo2;

    .line 12
    .line 13
    iput-object v2, p0, Ldefpackage/ro2;->j:Ldefpackage/oo2;

    .line 14
    .line 15
    :cond_1
    iget-object v2, p0, Ldefpackage/ro2;->k:Ldefpackage/oo2;

    .line 16
    .line 17
    if-ne v0, v2, :cond_2

    .line 18
    .line 19
    iget-object v2, v0, Ldefpackage/oo2;->m:Ldefpackage/oo2;

    .line 20
    .line 21
    iput-object v2, p0, Ldefpackage/ro2;->k:Ldefpackage/oo2;

    .line 22
    .line 23
    :cond_2
    invoke-virtual {v0}, Ldefpackage/oo2;->i()V

    .line 24
    .line 25
    .line 26
    iget v0, p0, Ldefpackage/ro2;->n:I

    .line 27
    .line 28
    add-int/lit8 v0, v0, -0x1

    .line 29
    .line 30
    iput v0, p0, Ldefpackage/ro2;->n:I

    .line 31
    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    iput-object v1, p0, Ldefpackage/ro2;->l:Ldefpackage/oo2;

    .line 35
    .line 36
    iget-object v0, p0, Ldefpackage/ro2;->i:Ldefpackage/oo2;

    .line 37
    .line 38
    iget-object v1, v0, Ldefpackage/oo2;->b:Ljava/lang/Object;

    .line 39
    .line 40
    iput-object v1, p0, Ldefpackage/ro2;->o:Ljava/lang/Object;

    .line 41
    .line 42
    iget-object v0, v0, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 43
    .line 44
    iget-object v0, v0, Ldefpackage/po2;->a:Ldefpackage/mt2;

    .line 45
    .line 46
    iget-wide v0, v0, Ldefpackage/mt2;->d:J

    .line 47
    .line 48
    iput-wide v0, p0, Ldefpackage/ro2;->p:J

    .line 49
    .line 50
    :cond_3
    iget-object v0, p0, Ldefpackage/ro2;->i:Ldefpackage/oo2;

    .line 51
    .line 52
    iget-object v0, v0, Ldefpackage/oo2;->m:Ldefpackage/oo2;

    .line 53
    .line 54
    iput-object v0, p0, Ldefpackage/ro2;->i:Ldefpackage/oo2;

    .line 55
    .line 56
    invoke-virtual {p0}, Ldefpackage/ro2;->m()V

    .line 57
    .line 58
    .line 59
    iget-object p0, p0, Ldefpackage/ro2;->i:Ldefpackage/oo2;

    .line 60
    .line 61
    return-object p0
.end method

.method public final b()V
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/ro2;->n:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Ldefpackage/ro2;->i:Ldefpackage/oo2;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v1, v0, Ldefpackage/oo2;->b:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object v1, p0, Ldefpackage/ro2;->o:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v1, v0, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 16
    .line 17
    iget-object v1, v1, Ldefpackage/po2;->a:Ldefpackage/mt2;

    .line 18
    .line 19
    iget-wide v1, v1, Ldefpackage/mt2;->d:J

    .line 20
    .line 21
    iput-wide v1, p0, Ldefpackage/ro2;->p:J

    .line 22
    .line 23
    :goto_0
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Ldefpackage/oo2;->i()V

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, Ldefpackage/oo2;->m:Ldefpackage/oo2;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Ldefpackage/ro2;->i:Ldefpackage/oo2;

    .line 33
    .line 34
    iput-object v0, p0, Ldefpackage/ro2;->l:Ldefpackage/oo2;

    .line 35
    .line 36
    iput-object v0, p0, Ldefpackage/ro2;->j:Ldefpackage/oo2;

    .line 37
    .line 38
    iput-object v0, p0, Ldefpackage/ro2;->k:Ldefpackage/oo2;

    .line 39
    .line 40
    const/4 v0, 0x0

    .line 41
    iput v0, p0, Ldefpackage/ro2;->n:I

    .line 42
    .line 43
    invoke-virtual {p0}, Ldefpackage/ro2;->m()V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final c(Ldefpackage/cu4;Ldefpackage/oo2;J)Ldefpackage/po2;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v9, p2

    .line 6
    .line 7
    iget-object v2, v9, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 8
    .line 9
    iget-object v10, v2, Ldefpackage/po2;->a:Ldefpackage/mt2;

    .line 10
    .line 11
    iget-wide v11, v2, Ldefpackage/po2;->c:J

    .line 12
    .line 13
    iget-object v2, v10, Ldefpackage/mt2;->a:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ldefpackage/cu4;->b(Ljava/lang/Object;)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget v5, v0, Ldefpackage/ro2;->g:I

    .line 20
    .line 21
    iget-boolean v6, v0, Ldefpackage/ro2;->h:Z

    .line 22
    .line 23
    iget-object v3, v0, Ldefpackage/ro2;->a:Ldefpackage/zt4;

    .line 24
    .line 25
    iget-object v4, v0, Ldefpackage/ro2;->b:Ldefpackage/bu4;

    .line 26
    .line 27
    invoke-virtual/range {v1 .. v6}, Ldefpackage/cu4;->d(ILdefpackage/zt4;Ldefpackage/bu4;IZ)I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/4 v3, -0x1

    .line 32
    if-ne v2, v3, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-object v13, v0, Ldefpackage/ro2;->a:Ldefpackage/zt4;

    .line 36
    .line 37
    const/4 v14, 0x1

    .line 38
    invoke-virtual {v1, v2, v13, v14}, Ldefpackage/cu4;->f(ILdefpackage/zt4;Z)Ldefpackage/zt4;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    iget v4, v3, Ldefpackage/zt4;->c:I

    .line 43
    .line 44
    iget-object v3, v13, Ldefpackage/zt4;->b:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-wide v5, v10, Ldefpackage/mt2;->d:J

    .line 50
    .line 51
    iget-object v7, v0, Ldefpackage/ro2;->b:Ldefpackage/bu4;

    .line 52
    .line 53
    const-wide/16 v14, 0x0

    .line 54
    .line 55
    invoke-virtual {v1, v4, v7, v14, v15}, Ldefpackage/cu4;->m(ILdefpackage/bu4;J)Ldefpackage/bu4;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    iget v7, v7, Ldefpackage/bu4;->m:I

    .line 60
    .line 61
    const-wide v16, -0x7fffffffffffffffL    # -4.9E-324

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    if-ne v7, v2, :cond_4

    .line 67
    .line 68
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    move-wide/from16 v2, p3

    .line 74
    .line 75
    invoke-static {v14, v15, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 76
    .line 77
    .line 78
    move-result-wide v7

    .line 79
    iget-object v2, v0, Ldefpackage/ro2;->b:Ldefpackage/bu4;

    .line 80
    .line 81
    iget-object v3, v0, Ldefpackage/ro2;->a:Ldefpackage/zt4;

    .line 82
    .line 83
    invoke-virtual/range {v1 .. v8}, Ldefpackage/cu4;->j(Ldefpackage/bu4;Ldefpackage/zt4;IJJ)Landroid/util/Pair;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    if-nez v2, :cond_1

    .line 88
    .line 89
    :goto_0
    const/4 v0, 0x0

    .line 90
    return-object v0

    .line 91
    :cond_1
    iget-object v3, v2, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 92
    .line 93
    iget-object v1, v2, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v1, Ljava/lang/Long;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 98
    .line 99
    .line 100
    move-result-wide v14

    .line 101
    iget-object v1, v9, Ldefpackage/oo2;->m:Ldefpackage/oo2;

    .line 102
    .line 103
    if-eqz v1, :cond_2

    .line 104
    .line 105
    iget-object v2, v1, Ldefpackage/oo2;->b:Ljava/lang/Object;

    .line 106
    .line 107
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-eqz v2, :cond_2

    .line 112
    .line 113
    iget-object v1, v1, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 114
    .line 115
    iget-object v1, v1, Ldefpackage/po2;->a:Ldefpackage/mt2;

    .line 116
    .line 117
    iget-wide v5, v1, Ldefpackage/mt2;->d:J

    .line 118
    .line 119
    :goto_1
    move-object v2, v3

    .line 120
    move-wide v3, v14

    .line 121
    move-wide/from16 v14, v16

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_2
    invoke-virtual {v0, v3}, Ldefpackage/ro2;->r(Ljava/lang/Object;)J

    .line 125
    .line 126
    .line 127
    move-result-wide v1

    .line 128
    const-wide/16 v4, -0x1

    .line 129
    .line 130
    cmp-long v4, v1, v4

    .line 131
    .line 132
    if-nez v4, :cond_3

    .line 133
    .line 134
    iget-wide v1, v0, Ldefpackage/ro2;->f:J

    .line 135
    .line 136
    const-wide/16 v4, 0x1

    .line 137
    .line 138
    add-long/2addr v4, v1

    .line 139
    iput-wide v4, v0, Ldefpackage/ro2;->f:J

    .line 140
    .line 141
    :cond_3
    move-wide v5, v1

    .line 142
    goto :goto_1

    .line 143
    :cond_4
    move-object v2, v3

    .line 144
    move-wide v3, v14

    .line 145
    :goto_2
    iget-object v7, v0, Ldefpackage/ro2;->b:Ldefpackage/bu4;

    .line 146
    .line 147
    iget-object v8, v0, Ldefpackage/ro2;->a:Ldefpackage/zt4;

    .line 148
    .line 149
    move-object/from16 v1, p1

    .line 150
    .line 151
    invoke-static/range {v1 .. v8}, Ldefpackage/ro2;->p(Ldefpackage/cu4;Ljava/lang/Object;JJLdefpackage/bu4;Ldefpackage/zt4;)Ldefpackage/mt2;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    cmp-long v5, v14, v16

    .line 156
    .line 157
    if-eqz v5, :cond_8

    .line 158
    .line 159
    cmp-long v5, v11, v16

    .line 160
    .line 161
    if-eqz v5, :cond_8

    .line 162
    .line 163
    iget-object v5, v10, Ldefpackage/mt2;->a:Ljava/lang/Object;

    .line 164
    .line 165
    invoke-virtual {v1, v5, v13}, Ldefpackage/cu4;->g(Ljava/lang/Object;Ldefpackage/zt4;)Ldefpackage/zt4;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    iget-object v5, v5, Ldefpackage/zt4;->g:Ldefpackage/z5;

    .line 170
    .line 171
    iget v5, v5, Ldefpackage/z5;->a:I

    .line 172
    .line 173
    iget-object v6, v13, Ldefpackage/zt4;->g:Ldefpackage/z5;

    .line 174
    .line 175
    iget v6, v6, Ldefpackage/z5;->d:I

    .line 176
    .line 177
    if-lez v5, :cond_6

    .line 178
    .line 179
    invoke-virtual {v13, v6}, Ldefpackage/zt4;->h(I)Z

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    if-eqz v7, :cond_6

    .line 184
    .line 185
    const/4 v7, 0x1

    .line 186
    if-gt v5, v7, :cond_5

    .line 187
    .line 188
    invoke-virtual {v13, v6}, Ldefpackage/zt4;->d(I)J

    .line 189
    .line 190
    .line 191
    move-result-wide v5

    .line 192
    const-wide/high16 v8, -0x8000000000000000L

    .line 193
    .line 194
    cmp-long v5, v5, v8

    .line 195
    .line 196
    if-eqz v5, :cond_6

    .line 197
    .line 198
    :cond_5
    move v5, v7

    .line 199
    goto :goto_3

    .line 200
    :cond_6
    const/4 v5, 0x0

    .line 201
    :goto_3
    invoke-virtual {v2}, Ldefpackage/mt2;->b()Z

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    if-eqz v6, :cond_7

    .line 206
    .line 207
    if-eqz v5, :cond_7

    .line 208
    .line 209
    move-wide v5, v3

    .line 210
    move-wide v3, v11

    .line 211
    goto :goto_5

    .line 212
    :cond_7
    if-eqz v5, :cond_8

    .line 213
    .line 214
    move-wide v5, v11

    .line 215
    :goto_4
    move-wide v3, v14

    .line 216
    goto :goto_5

    .line 217
    :cond_8
    move-wide v5, v3

    .line 218
    goto :goto_4

    .line 219
    :goto_5
    invoke-virtual/range {v0 .. v6}, Ldefpackage/ro2;->e(Ldefpackage/cu4;Ldefpackage/mt2;JJ)Ldefpackage/po2;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    return-object v0
.end method

.method public final d(Ldefpackage/cu4;Ldefpackage/oo2;J)Ldefpackage/po2;
    .locals 15

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    iget-object v8, v2, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 6
    .line 7
    iget-wide v3, v2, Ldefpackage/oo2;->p:J

    .line 8
    .line 9
    iget-wide v5, v8, Ldefpackage/po2;->e:J

    .line 10
    .line 11
    add-long/2addr v3, v5

    .line 12
    sub-long v3, v3, p3

    .line 13
    .line 14
    iget-boolean v5, v8, Ldefpackage/po2;->h:Z

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0, v1, v2, v3, v4}, Ldefpackage/ro2;->c(Ldefpackage/cu4;Ldefpackage/oo2;J)Ldefpackage/po2;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0

    .line 23
    :cond_0
    iget-object v9, v8, Ldefpackage/po2;->a:Ldefpackage/mt2;

    .line 24
    .line 25
    iget-object v10, v9, Ldefpackage/mt2;->a:Ljava/lang/Object;

    .line 26
    .line 27
    iget v5, v9, Ldefpackage/mt2;->e:I

    .line 28
    .line 29
    move-object v6, v2

    .line 30
    iget-object v2, p0, Ldefpackage/ro2;->a:Ldefpackage/zt4;

    .line 31
    .line 32
    invoke-virtual {v1, v10, v2}, Ldefpackage/cu4;->g(Ljava/lang/Object;Ldefpackage/zt4;)Ldefpackage/zt4;

    .line 33
    .line 34
    .line 35
    iget-boolean v7, v8, Ldefpackage/po2;->g:Z

    .line 36
    .line 37
    invoke-virtual {v9}, Ldefpackage/mt2;->b()Z

    .line 38
    .line 39
    .line 40
    move-result v11

    .line 41
    const/4 v14, -0x1

    .line 42
    if-eqz v11, :cond_6

    .line 43
    .line 44
    move-wide v12, v3

    .line 45
    const-wide/high16 p3, -0x8000000000000000L

    .line 46
    .line 47
    iget v3, v9, Ldefpackage/mt2;->b:I

    .line 48
    .line 49
    iget-object v4, v2, Ldefpackage/zt4;->g:Ldefpackage/z5;

    .line 50
    .line 51
    invoke-virtual {v4, v3}, Ldefpackage/z5;->a(I)Ldefpackage/x5;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    iget v4, v4, Ldefpackage/x5;->b:I

    .line 56
    .line 57
    if-ne v4, v14, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    iget v5, v9, Ldefpackage/mt2;->c:I

    .line 61
    .line 62
    iget-object v6, v2, Ldefpackage/zt4;->g:Ldefpackage/z5;

    .line 63
    .line 64
    invoke-virtual {v6, v3}, Ldefpackage/z5;->a(I)Ldefpackage/x5;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-virtual {v6, v5}, Ldefpackage/x5;->a(I)I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-ge v5, v4, :cond_2

    .line 73
    .line 74
    iget-object v2, v9, Ldefpackage/mt2;->a:Ljava/lang/Object;

    .line 75
    .line 76
    move v4, v5

    .line 77
    iget-wide v5, v8, Ldefpackage/po2;->c:J

    .line 78
    .line 79
    move v10, v7

    .line 80
    iget-wide v7, v9, Ldefpackage/mt2;->d:J

    .line 81
    .line 82
    move-object v0, p0

    .line 83
    move v9, v10

    .line 84
    invoke-virtual/range {v0 .. v9}, Ldefpackage/ro2;->f(Ldefpackage/cu4;Ljava/lang/Object;IIJJZ)Ldefpackage/po2;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    return-object v0

    .line 89
    :cond_2
    move v14, v7

    .line 90
    iget-wide v0, v8, Ldefpackage/po2;->c:J

    .line 91
    .line 92
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    cmp-long v3, v0, v3

    .line 98
    .line 99
    if-nez v3, :cond_4

    .line 100
    .line 101
    iget v3, v2, Ldefpackage/zt4;->c:I

    .line 102
    .line 103
    const-wide/16 v0, 0x0

    .line 104
    .line 105
    invoke-static {v0, v1, v12, v13}, Ljava/lang/Math;->max(JJ)J

    .line 106
    .line 107
    .line 108
    move-result-wide v6

    .line 109
    iget-object v1, p0, Ldefpackage/ro2;->b:Ldefpackage/bu4;

    .line 110
    .line 111
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    move-object/from16 v0, p1

    .line 117
    .line 118
    invoke-virtual/range {v0 .. v7}, Ldefpackage/cu4;->j(Ldefpackage/bu4;Ldefpackage/zt4;IJJ)Landroid/util/Pair;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    move-object v3, v2

    .line 123
    move-object v2, v0

    .line 124
    if-nez v1, :cond_3

    .line 125
    .line 126
    :goto_0
    const/4 v0, 0x0

    .line 127
    return-object v0

    .line 128
    :cond_3
    iget-object v0, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v0, Ljava/lang/Long;

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 133
    .line 134
    .line 135
    move-result-wide v0

    .line 136
    goto :goto_1

    .line 137
    :cond_4
    move-object v3, v2

    .line 138
    move-object/from16 v2, p1

    .line 139
    .line 140
    :goto_1
    iget v4, v9, Ldefpackage/mt2;->b:I

    .line 141
    .line 142
    invoke-virtual {v2, v10, v3}, Ldefpackage/cu4;->g(Ljava/lang/Object;Ldefpackage/zt4;)Ldefpackage/zt4;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3, v4}, Ldefpackage/zt4;->d(I)J

    .line 146
    .line 147
    .line 148
    move-result-wide v5

    .line 149
    cmp-long v7, v5, p3

    .line 150
    .line 151
    if-nez v7, :cond_5

    .line 152
    .line 153
    iget-wide v3, v3, Ldefpackage/zt4;->d:J

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_5
    iget-object v3, v3, Ldefpackage/zt4;->g:Ldefpackage/z5;

    .line 157
    .line 158
    invoke-virtual {v3, v4}, Ldefpackage/z5;->a(I)Ldefpackage/x5;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    iget-wide v3, v3, Ldefpackage/x5;->j:J

    .line 163
    .line 164
    add-long/2addr v3, v5

    .line 165
    :goto_2
    iget-object v2, v9, Ldefpackage/mt2;->a:Ljava/lang/Object;

    .line 166
    .line 167
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 168
    .line 169
    .line 170
    move-result-wide v3

    .line 171
    iget-wide v5, v8, Ldefpackage/po2;->c:J

    .line 172
    .line 173
    iget-wide v7, v9, Ldefpackage/mt2;->d:J

    .line 174
    .line 175
    move-object v0, p0

    .line 176
    move-object/from16 v1, p1

    .line 177
    .line 178
    move v9, v14

    .line 179
    invoke-virtual/range {v0 .. v9}, Ldefpackage/ro2;->g(Ldefpackage/cu4;Ljava/lang/Object;JJJZ)Ldefpackage/po2;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    return-object v0

    .line 184
    :cond_6
    move-wide v12, v3

    .line 185
    const-wide/high16 p3, -0x8000000000000000L

    .line 186
    .line 187
    move-object v3, v2

    .line 188
    move v2, v7

    .line 189
    if-eq v5, v14, :cond_7

    .line 190
    .line 191
    invoke-virtual {v3, v5}, Ldefpackage/zt4;->g(I)Z

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    if-eqz v4, :cond_7

    .line 196
    .line 197
    invoke-virtual {p0, v1, v6, v12, v13}, Ldefpackage/ro2;->c(Ldefpackage/cu4;Ldefpackage/oo2;J)Ldefpackage/po2;

    .line 198
    .line 199
    .line 200
    move-result-object v0

    .line 201
    return-object v0

    .line 202
    :cond_7
    invoke-virtual {v3, v5}, Ldefpackage/zt4;->f(I)I

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    invoke-virtual {v3, v5}, Ldefpackage/zt4;->h(I)Z

    .line 207
    .line 208
    .line 209
    move-result v6

    .line 210
    if-eqz v6, :cond_8

    .line 211
    .line 212
    invoke-virtual {v3, v5, v4}, Ldefpackage/zt4;->e(II)I

    .line 213
    .line 214
    .line 215
    move-result v6

    .line 216
    const/4 v7, 0x3

    .line 217
    if-ne v6, v7, :cond_8

    .line 218
    .line 219
    const/4 v6, 0x1

    .line 220
    goto :goto_3

    .line 221
    :cond_8
    const/4 v6, 0x0

    .line 222
    :goto_3
    iget-object v7, v3, Ldefpackage/zt4;->g:Ldefpackage/z5;

    .line 223
    .line 224
    invoke-virtual {v7, v5}, Ldefpackage/z5;->a(I)Ldefpackage/x5;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    iget v7, v7, Ldefpackage/x5;->b:I

    .line 229
    .line 230
    if-eq v4, v7, :cond_a

    .line 231
    .line 232
    if-eqz v6, :cond_9

    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_9
    move v14, v2

    .line 236
    iget-object v2, v9, Ldefpackage/mt2;->a:Ljava/lang/Object;

    .line 237
    .line 238
    iget v3, v9, Ldefpackage/mt2;->e:I

    .line 239
    .line 240
    iget-wide v5, v8, Ldefpackage/po2;->e:J

    .line 241
    .line 242
    iget-wide v7, v9, Ldefpackage/mt2;->d:J

    .line 243
    .line 244
    move-object v0, p0

    .line 245
    move v9, v14

    .line 246
    invoke-virtual/range {v0 .. v9}, Ldefpackage/ro2;->f(Ldefpackage/cu4;Ljava/lang/Object;IIJJZ)Ldefpackage/po2;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    return-object v0

    .line 251
    :cond_a
    :goto_4
    invoke-virtual {v1, v10, v3}, Ldefpackage/cu4;->g(Ljava/lang/Object;Ldefpackage/zt4;)Ldefpackage/zt4;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v3, v5}, Ldefpackage/zt4;->d(I)J

    .line 255
    .line 256
    .line 257
    move-result-wide v6

    .line 258
    cmp-long v0, v6, p3

    .line 259
    .line 260
    if-nez v0, :cond_b

    .line 261
    .line 262
    iget-wide v2, v3, Ldefpackage/zt4;->d:J

    .line 263
    .line 264
    :goto_5
    move-wide v3, v2

    .line 265
    goto :goto_6

    .line 266
    :cond_b
    iget-object v0, v3, Ldefpackage/zt4;->g:Ldefpackage/z5;

    .line 267
    .line 268
    invoke-virtual {v0, v5}, Ldefpackage/z5;->a(I)Ldefpackage/x5;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    iget-wide v2, v0, Ldefpackage/x5;->j:J

    .line 273
    .line 274
    add-long/2addr v2, v6

    .line 275
    goto :goto_5

    .line 276
    :goto_6
    iget-object v2, v9, Ldefpackage/mt2;->a:Ljava/lang/Object;

    .line 277
    .line 278
    iget-wide v5, v8, Ldefpackage/po2;->e:J

    .line 279
    .line 280
    iget-wide v7, v9, Ldefpackage/mt2;->d:J

    .line 281
    .line 282
    const/4 v9, 0x0

    .line 283
    move-object v0, p0

    .line 284
    invoke-virtual/range {v0 .. v9}, Ldefpackage/ro2;->g(Ldefpackage/cu4;Ljava/lang/Object;JJJZ)Ldefpackage/po2;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    return-object v0
.end method

.method public final e(Ldefpackage/cu4;Ldefpackage/mt2;JJ)Ldefpackage/po2;
    .locals 11

    .line 1
    iget-object v0, p2, Ldefpackage/mt2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/ro2;->a:Ldefpackage/zt4;

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Ldefpackage/cu4;->g(Ljava/lang/Object;Ldefpackage/zt4;)Ldefpackage/zt4;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Ldefpackage/mt2;->b()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v3, p2, Ldefpackage/mt2;->a:Ljava/lang/Object;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget v4, p2, Ldefpackage/mt2;->b:I

    .line 17
    .line 18
    iget v5, p2, Ldefpackage/mt2;->c:I

    .line 19
    .line 20
    iget-wide v8, p2, Ldefpackage/mt2;->d:J

    .line 21
    .line 22
    const/4 v10, 0x0

    .line 23
    move-object v1, p0

    .line 24
    move-object v2, p1

    .line 25
    move-wide v6, p3

    .line 26
    invoke-virtual/range {v1 .. v10}, Ldefpackage/ro2;->f(Ldefpackage/cu4;Ljava/lang/Object;IIJJZ)Ldefpackage/po2;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :cond_0
    iget-wide v8, p2, Ldefpackage/mt2;->d:J

    .line 32
    .line 33
    const/4 v10, 0x0

    .line 34
    move-object v1, p0

    .line 35
    move-object v2, p1

    .line 36
    move-wide v6, p3

    .line 37
    move-wide/from16 v4, p5

    .line 38
    .line 39
    invoke-virtual/range {v1 .. v10}, Ldefpackage/ro2;->g(Ldefpackage/cu4;Ljava/lang/Object;JJJZ)Ldefpackage/po2;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public final f(Ldefpackage/cu4;Ljava/lang/Object;IIJJZ)Ldefpackage/po2;
    .locals 15

    .line 1
    new-instance v0, Ldefpackage/mt2;

    .line 2
    .line 3
    const/4 v6, -0x1

    .line 4
    move-object/from16 v1, p2

    .line 5
    .line 6
    move/from16 v2, p3

    .line 7
    .line 8
    move/from16 v3, p4

    .line 9
    .line 10
    move-wide/from16 v4, p7

    .line 11
    .line 12
    invoke-direct/range {v0 .. v6}, Ldefpackage/mt2;-><init>(Ljava/lang/Object;IIJI)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Ldefpackage/ro2;->a:Ldefpackage/zt4;

    .line 16
    .line 17
    move-object/from16 v1, p1

    .line 18
    .line 19
    move-object/from16 v4, p2

    .line 20
    .line 21
    invoke-virtual {v1, v4, p0}, Ldefpackage/cu4;->g(Ljava/lang/Object;Ldefpackage/zt4;)Ldefpackage/zt4;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1, v2, v3}, Ldefpackage/zt4;->a(II)J

    .line 26
    .line 27
    .line 28
    move-result-wide v8

    .line 29
    invoke-virtual {p0, v2}, Ldefpackage/zt4;->f(I)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const-wide/16 v4, 0x0

    .line 34
    .line 35
    if-ne v3, v1, :cond_0

    .line 36
    .line 37
    iget-object v1, p0, Ldefpackage/zt4;->g:Ldefpackage/z5;

    .line 38
    .line 39
    iget-wide v6, v1, Ldefpackage/z5;->b:J

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-wide v6, v4

    .line 43
    :goto_0
    invoke-virtual {p0, v2}, Ldefpackage/zt4;->h(I)Z

    .line 44
    .line 45
    .line 46
    move-result v11

    .line 47
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    cmp-long p0, v8, v1

    .line 53
    .line 54
    if-eqz p0, :cond_1

    .line 55
    .line 56
    cmp-long p0, v6, v8

    .line 57
    .line 58
    if-ltz p0, :cond_1

    .line 59
    .line 60
    const-wide/16 v1, 0x1

    .line 61
    .line 62
    sub-long v1, v8, v1

    .line 63
    .line 64
    invoke-static {v4, v5, v1, v2}, Ljava/lang/Math;->max(JJ)J

    .line 65
    .line 66
    .line 67
    move-result-wide v6

    .line 68
    :cond_1
    move-object v1, v0

    .line 69
    move-wide v2, v6

    .line 70
    new-instance v0, Ldefpackage/po2;

    .line 71
    .line 72
    const/4 v13, 0x0

    .line 73
    const/4 v14, 0x0

    .line 74
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    const/4 v12, 0x0

    .line 80
    move-wide/from16 v4, p5

    .line 81
    .line 82
    move/from16 v10, p9

    .line 83
    .line 84
    invoke-direct/range {v0 .. v14}, Ldefpackage/po2;-><init>(Ldefpackage/mt2;JJJJZZZZZ)V

    .line 85
    .line 86
    .line 87
    return-object v0
.end method

.method public final g(Ldefpackage/cu4;Ljava/lang/Object;JJJZ)Ldefpackage/po2;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-wide/from16 v3, p3

    .line 8
    .line 9
    iget-object v5, v0, Ldefpackage/ro2;->a:Ldefpackage/zt4;

    .line 10
    .line 11
    invoke-virtual {v1, v2, v5}, Ldefpackage/cu4;->g(Ljava/lang/Object;Ldefpackage/zt4;)Ldefpackage/zt4;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v5, v3, v4}, Ldefpackage/zt4;->b(J)I

    .line 15
    .line 16
    .line 17
    move-result v6

    .line 18
    const/4 v7, 0x1

    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v9, -0x1

    .line 21
    if-ne v6, v9, :cond_0

    .line 22
    .line 23
    iget-object v10, v5, Ldefpackage/zt4;->g:Ldefpackage/z5;

    .line 24
    .line 25
    iget v11, v10, Ldefpackage/z5;->a:I

    .line 26
    .line 27
    if-lez v11, :cond_5

    .line 28
    .line 29
    iget v10, v10, Ldefpackage/z5;->d:I

    .line 30
    .line 31
    invoke-virtual {v5, v10}, Ldefpackage/zt4;->h(I)Z

    .line 32
    .line 33
    .line 34
    move-result v10

    .line 35
    if-eqz v10, :cond_5

    .line 36
    .line 37
    move v10, v7

    .line 38
    goto :goto_3

    .line 39
    :cond_0
    invoke-virtual {v5, v6}, Ldefpackage/zt4;->h(I)Z

    .line 40
    .line 41
    .line 42
    move-result v10

    .line 43
    if-eqz v10, :cond_5

    .line 44
    .line 45
    invoke-virtual {v5, v6}, Ldefpackage/zt4;->d(I)J

    .line 46
    .line 47
    .line 48
    move-result-wide v10

    .line 49
    iget-wide v12, v5, Ldefpackage/zt4;->d:J

    .line 50
    .line 51
    cmp-long v10, v10, v12

    .line 52
    .line 53
    if-nez v10, :cond_5

    .line 54
    .line 55
    iget-object v10, v5, Ldefpackage/zt4;->g:Ldefpackage/z5;

    .line 56
    .line 57
    invoke-virtual {v10, v6}, Ldefpackage/z5;->a(I)Ldefpackage/x5;

    .line 58
    .line 59
    .line 60
    move-result-object v10

    .line 61
    iget v11, v10, Ldefpackage/x5;->b:I

    .line 62
    .line 63
    if-ne v11, v9, :cond_2

    .line 64
    .line 65
    :cond_1
    :goto_0
    move v10, v7

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    move v12, v8

    .line 68
    :goto_1
    if-ge v12, v11, :cond_4

    .line 69
    .line 70
    iget-object v13, v10, Ldefpackage/x5;->f:[I

    .line 71
    .line 72
    aget v13, v13, v12

    .line 73
    .line 74
    if-eqz v13, :cond_1

    .line 75
    .line 76
    if-ne v13, v7, :cond_3

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_3
    add-int/lit8 v12, v12, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_4
    move v10, v8

    .line 83
    :goto_2
    if-nez v10, :cond_5

    .line 84
    .line 85
    move v10, v7

    .line 86
    move v6, v9

    .line 87
    goto :goto_3

    .line 88
    :cond_5
    move v10, v8

    .line 89
    :goto_3
    new-instance v12, Ldefpackage/mt2;

    .line 90
    .line 91
    move-wide/from16 v13, p7

    .line 92
    .line 93
    invoke-direct {v12, v2, v13, v14, v6}, Ldefpackage/mt2;-><init>(Ljava/lang/Object;JI)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v12}, Ldefpackage/mt2;->b()Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-nez v2, :cond_6

    .line 101
    .line 102
    if-ne v6, v9, :cond_6

    .line 103
    .line 104
    move v2, v7

    .line 105
    goto :goto_4

    .line 106
    :cond_6
    move v2, v8

    .line 107
    :goto_4
    invoke-virtual {v0, v1, v12}, Ldefpackage/ro2;->k(Ldefpackage/cu4;Ldefpackage/mt2;)Z

    .line 108
    .line 109
    .line 110
    move-result v24

    .line 111
    invoke-virtual {v0, v1, v12, v2}, Ldefpackage/ro2;->j(Ldefpackage/cu4;Ldefpackage/mt2;Z)Z

    .line 112
    .line 113
    .line 114
    move-result v25

    .line 115
    if-eq v6, v9, :cond_7

    .line 116
    .line 117
    invoke-virtual {v5, v6}, Ldefpackage/zt4;->h(I)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_7

    .line 122
    .line 123
    invoke-virtual {v5, v6}, Ldefpackage/zt4;->g(I)Z

    .line 124
    .line 125
    .line 126
    move-result v0

    .line 127
    if-nez v0, :cond_7

    .line 128
    .line 129
    move/from16 v22, v7

    .line 130
    .line 131
    goto :goto_5

    .line 132
    :cond_7
    move/from16 v22, v8

    .line 133
    .line 134
    :goto_5
    if-eq v6, v9, :cond_8

    .line 135
    .line 136
    invoke-virtual {v5, v6}, Ldefpackage/zt4;->g(I)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_8

    .line 141
    .line 142
    invoke-virtual {v5, v6}, Ldefpackage/zt4;->h(I)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_8

    .line 147
    .line 148
    move v0, v7

    .line 149
    goto :goto_6

    .line 150
    :cond_8
    move v0, v8

    .line 151
    :goto_6
    const-wide v13, -0x7fffffffffffffffL    # -4.9E-324

    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    if-eq v6, v9, :cond_9

    .line 157
    .line 158
    if-nez v0, :cond_9

    .line 159
    .line 160
    invoke-virtual {v5, v6}, Ldefpackage/zt4;->d(I)J

    .line 161
    .line 162
    .line 163
    move-result-wide v0

    .line 164
    :goto_7
    move-wide/from16 v17, v0

    .line 165
    .line 166
    goto :goto_8

    .line 167
    :cond_9
    if-eqz v10, :cond_a

    .line 168
    .line 169
    iget-wide v0, v5, Ldefpackage/zt4;->d:J

    .line 170
    .line 171
    goto :goto_7

    .line 172
    :cond_a
    move-wide/from16 v17, v13

    .line 173
    .line 174
    :goto_8
    cmp-long v0, v17, v13

    .line 175
    .line 176
    if-eqz v0, :cond_c

    .line 177
    .line 178
    const-wide/high16 v0, -0x8000000000000000L

    .line 179
    .line 180
    cmp-long v0, v17, v0

    .line 181
    .line 182
    if-nez v0, :cond_b

    .line 183
    .line 184
    goto :goto_9

    .line 185
    :cond_b
    move-wide/from16 v19, v17

    .line 186
    .line 187
    goto :goto_a

    .line 188
    :cond_c
    :goto_9
    iget-wide v0, v5, Ldefpackage/zt4;->d:J

    .line 189
    .line 190
    move-wide/from16 v19, v0

    .line 191
    .line 192
    :goto_a
    cmp-long v0, v19, v13

    .line 193
    .line 194
    if-eqz v0, :cond_f

    .line 195
    .line 196
    cmp-long v0, v3, v19

    .line 197
    .line 198
    if-ltz v0, :cond_f

    .line 199
    .line 200
    if-nez v25, :cond_e

    .line 201
    .line 202
    if-nez v10, :cond_d

    .line 203
    .line 204
    goto :goto_b

    .line 205
    :cond_d
    move v7, v8

    .line 206
    :cond_e
    :goto_b
    int-to-long v0, v7

    .line 207
    sub-long v0, v19, v0

    .line 208
    .line 209
    const-wide/16 v3, 0x0

    .line 210
    .line 211
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 212
    .line 213
    .line 214
    move-result-wide v0

    .line 215
    move-wide v13, v0

    .line 216
    goto :goto_c

    .line 217
    :cond_f
    move-wide v13, v3

    .line 218
    :goto_c
    new-instance v11, Ldefpackage/po2;

    .line 219
    .line 220
    move-wide/from16 v15, p5

    .line 221
    .line 222
    move/from16 v21, p9

    .line 223
    .line 224
    move/from16 v23, v2

    .line 225
    .line 226
    invoke-direct/range {v11 .. v25}, Ldefpackage/po2;-><init>(Ldefpackage/mt2;JJJJZZZZZ)V

    .line 227
    .line 228
    .line 229
    return-object v11
.end method

.method public final h()Ldefpackage/oo2;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/ro2;->k:Ldefpackage/oo2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i(Ldefpackage/cu4;Ldefpackage/po2;)Ldefpackage/po2;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v2, Ldefpackage/po2;->a:Ldefpackage/mt2;

    .line 8
    .line 9
    invoke-virtual {v3}, Ldefpackage/mt2;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    iget v5, v3, Ldefpackage/mt2;->e:I

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    const/4 v7, 0x1

    .line 17
    const/4 v8, -0x1

    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    if-ne v5, v8, :cond_0

    .line 21
    .line 22
    move v12, v7

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v12, v6

    .line 25
    :goto_0
    iget v4, v3, Ldefpackage/mt2;->b:I

    .line 26
    .line 27
    invoke-virtual {v0, v1, v3}, Ldefpackage/ro2;->k(Ldefpackage/cu4;Ldefpackage/mt2;)Z

    .line 28
    .line 29
    .line 30
    move-result v13

    .line 31
    invoke-virtual {v0, v1, v3, v12}, Ldefpackage/ro2;->j(Ldefpackage/cu4;Ldefpackage/mt2;Z)Z

    .line 32
    .line 33
    .line 34
    move-result v14

    .line 35
    iget-object v9, v3, Ldefpackage/mt2;->a:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v0, v0, Ldefpackage/ro2;->a:Ldefpackage/zt4;

    .line 38
    .line 39
    invoke-virtual {v1, v9, v0}, Ldefpackage/cu4;->g(Ljava/lang/Object;Ldefpackage/zt4;)Ldefpackage/zt4;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3}, Ldefpackage/mt2;->b()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    if-nez v1, :cond_2

    .line 52
    .line 53
    if-ne v5, v8, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-virtual {v0, v5}, Ldefpackage/zt4;->d(I)J

    .line 57
    .line 58
    .line 59
    move-result-wide v15

    .line 60
    goto :goto_2

    .line 61
    :cond_2
    :goto_1
    move-wide v15, v9

    .line 62
    :goto_2
    invoke-virtual {v3}, Ldefpackage/mt2;->b()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    iget v1, v3, Ldefpackage/mt2;->c:I

    .line 69
    .line 70
    invoke-virtual {v0, v4, v1}, Ldefpackage/zt4;->a(II)J

    .line 71
    .line 72
    .line 73
    move-result-wide v9

    .line 74
    goto :goto_4

    .line 75
    :cond_3
    cmp-long v1, v15, v9

    .line 76
    .line 77
    if-eqz v1, :cond_5

    .line 78
    .line 79
    const-wide/high16 v9, -0x8000000000000000L

    .line 80
    .line 81
    cmp-long v1, v15, v9

    .line 82
    .line 83
    if-nez v1, :cond_4

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_4
    move-wide v9, v15

    .line 87
    goto :goto_4

    .line 88
    :cond_5
    :goto_3
    iget-wide v9, v0, Ldefpackage/zt4;->d:J

    .line 89
    .line 90
    :goto_4
    invoke-virtual {v3}, Ldefpackage/mt2;->b()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_7

    .line 95
    .line 96
    invoke-virtual {v0, v4}, Ldefpackage/zt4;->h(I)Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    :cond_6
    move v11, v6

    .line 101
    goto :goto_5

    .line 102
    :cond_7
    if-eq v5, v8, :cond_6

    .line 103
    .line 104
    invoke-virtual {v0, v5}, Ldefpackage/zt4;->h(I)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-eqz v0, :cond_6

    .line 109
    .line 110
    move v11, v7

    .line 111
    :goto_5
    new-instance v0, Ldefpackage/po2;

    .line 112
    .line 113
    iget-wide v4, v2, Ldefpackage/po2;->b:J

    .line 114
    .line 115
    move-wide v6, v4

    .line 116
    iget-wide v4, v2, Ldefpackage/po2;->c:J

    .line 117
    .line 118
    iget-boolean v1, v2, Ldefpackage/po2;->f:Z

    .line 119
    .line 120
    move-wide v8, v9

    .line 121
    move v10, v1

    .line 122
    move-object v1, v3

    .line 123
    move-wide v2, v6

    .line 124
    move-wide v6, v15

    .line 125
    invoke-direct/range {v0 .. v14}, Ldefpackage/po2;-><init>(Ldefpackage/mt2;JJJJZZZZZ)V

    .line 126
    .line 127
    .line 128
    return-object v0
.end method

.method public final j(Ldefpackage/cu4;Ldefpackage/mt2;Z)Z
    .locals 7

    .line 1
    iget-object p2, p2, Ldefpackage/mt2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Ldefpackage/cu4;->b(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object p2, p0, Ldefpackage/ro2;->a:Ldefpackage/zt4;

    .line 8
    .line 9
    const/4 v6, 0x0

    .line 10
    invoke-virtual {p1, v1, p2, v6}, Ldefpackage/cu4;->f(ILdefpackage/zt4;Z)Ldefpackage/zt4;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iget p2, p2, Ldefpackage/zt4;->c:I

    .line 15
    .line 16
    iget-object v0, p0, Ldefpackage/ro2;->b:Ldefpackage/bu4;

    .line 17
    .line 18
    const-wide/16 v2, 0x0

    .line 19
    .line 20
    invoke-virtual {p1, p2, v0, v2, v3}, Ldefpackage/cu4;->m(ILdefpackage/bu4;J)Ldefpackage/bu4;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iget-boolean p2, p2, Ldefpackage/bu4;->h:Z

    .line 25
    .line 26
    if-nez p2, :cond_0

    .line 27
    .line 28
    iget v4, p0, Ldefpackage/ro2;->g:I

    .line 29
    .line 30
    iget-boolean v5, p0, Ldefpackage/ro2;->h:Z

    .line 31
    .line 32
    iget-object v2, p0, Ldefpackage/ro2;->a:Ldefpackage/zt4;

    .line 33
    .line 34
    iget-object v3, p0, Ldefpackage/ro2;->b:Ldefpackage/bu4;

    .line 35
    .line 36
    move-object v0, p1

    .line 37
    invoke-virtual/range {v0 .. v5}, Ldefpackage/cu4;->d(ILdefpackage/zt4;Ldefpackage/bu4;IZ)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    const/4 p1, -0x1

    .line 42
    if-ne p0, p1, :cond_0

    .line 43
    .line 44
    if-eqz p3, :cond_0

    .line 45
    .line 46
    const/4 p0, 0x1

    .line 47
    return p0

    .line 48
    :cond_0
    return v6
.end method

.method public final k(Ldefpackage/cu4;Ldefpackage/mt2;)Z
    .locals 5

    .line 1
    invoke-virtual {p2}, Ldefpackage/mt2;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget v0, p2, Ldefpackage/mt2;->e:I

    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    if-ne v0, v3, :cond_0

    .line 13
    .line 14
    move v0, v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v2

    .line 17
    :goto_0
    iget-object p2, p2, Ldefpackage/mt2;->a:Ljava/lang/Object;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    iget-object v0, p0, Ldefpackage/ro2;->a:Ldefpackage/zt4;

    .line 23
    .line 24
    invoke-virtual {p1, p2, v0}, Ldefpackage/cu4;->g(Ljava/lang/Object;Ldefpackage/zt4;)Ldefpackage/zt4;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget v0, v0, Ldefpackage/zt4;->c:I

    .line 29
    .line 30
    invoke-virtual {p1, p2}, Ldefpackage/cu4;->b(Ljava/lang/Object;)I

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    iget-object p0, p0, Ldefpackage/ro2;->b:Ldefpackage/bu4;

    .line 35
    .line 36
    const-wide/16 v3, 0x0

    .line 37
    .line 38
    invoke-virtual {p1, v0, p0, v3, v4}, Ldefpackage/cu4;->m(ILdefpackage/bu4;J)Ldefpackage/bu4;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    iget p0, p0, Ldefpackage/bu4;->n:I

    .line 43
    .line 44
    if-ne p0, p2, :cond_2

    .line 45
    .line 46
    return v1

    .line 47
    :cond_2
    :goto_1
    return v2
.end method

.method public final l()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/ro2;->m:Ldefpackage/oo2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ldefpackage/oo2;->h()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    iput-object v0, p0, Ldefpackage/ro2;->m:Ldefpackage/oo2;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    :goto_0
    iget-object v1, p0, Ldefpackage/ro2;->q:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-ge v0, v1, :cond_2

    .line 23
    .line 24
    iget-object v1, p0, Ldefpackage/ro2;->q:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ldefpackage/oo2;

    .line 31
    .line 32
    invoke-virtual {v1}, Ldefpackage/oo2;->h()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    iput-object v1, p0, Ldefpackage/ro2;->m:Ldefpackage/oo2;

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    return-void
.end method

.method public final m()V
    .locals 4

    .line 1
    invoke-static {}, Ldefpackage/yw1;->j()Ldefpackage/uw1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ldefpackage/ro2;->i:Ldefpackage/oo2;

    .line 6
    .line 7
    :goto_0
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v2, v1, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 10
    .line 11
    iget-object v2, v2, Ldefpackage/po2;->a:Ldefpackage/mt2;

    .line 12
    .line 13
    invoke-virtual {v0, v2}, Ldefpackage/pw1;->c(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, v1, Ldefpackage/oo2;->m:Ldefpackage/oo2;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object v1, p0, Ldefpackage/ro2;->j:Ldefpackage/oo2;

    .line 20
    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    iget-object v1, v1, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 26
    .line 27
    iget-object v1, v1, Ldefpackage/po2;->a:Ldefpackage/mt2;

    .line 28
    .line 29
    :goto_1
    new-instance v2, Ldefpackage/qo2;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-direct {v2, p0, v0, v1, v3}, Ldefpackage/qo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Ldefpackage/ro2;->d:Ldefpackage/yp4;

    .line 36
    .line 37
    invoke-virtual {p0, v2}, Ldefpackage/yp4;->d(Ljava/lang/Runnable;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final n(J)V
    .locals 3

    .line 1
    iget-object p0, p0, Ldefpackage/ro2;->l:Ldefpackage/oo2;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/oo2;->m:Ldefpackage/oo2;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    invoke-static {v0}, Ldefpackage/rr2;->w(Z)V

    .line 13
    .line 14
    .line 15
    iget-boolean v0, p0, Ldefpackage/oo2;->e:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Ldefpackage/oo2;->a:Ldefpackage/no2;

    .line 20
    .line 21
    iget-wide v1, p0, Ldefpackage/oo2;->p:J

    .line 22
    .line 23
    sub-long/2addr p1, v1

    .line 24
    invoke-interface {v0, p1, p2}, Ldefpackage/da4;->u(J)V

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public final o(Ldefpackage/oo2;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/ro2;->l:Ldefpackage/oo2;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eq p1, v0, :cond_4

    .line 8
    .line 9
    iput-object p1, p0, Ldefpackage/ro2;->l:Ldefpackage/oo2;

    .line 10
    .line 11
    :goto_0
    iget-object p1, p1, Ldefpackage/oo2;->m:Ldefpackage/oo2;

    .line 12
    .line 13
    if-eqz p1, :cond_2

    .line 14
    .line 15
    iget-object v0, p0, Ldefpackage/ro2;->j:Ldefpackage/oo2;

    .line 16
    .line 17
    if-ne p1, v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, Ldefpackage/ro2;->i:Ldefpackage/oo2;

    .line 20
    .line 21
    iput-object v0, p0, Ldefpackage/ro2;->j:Ldefpackage/oo2;

    .line 22
    .line 23
    iput-object v0, p0, Ldefpackage/ro2;->k:Ldefpackage/oo2;

    .line 24
    .line 25
    const/4 v1, 0x3

    .line 26
    :cond_0
    iget-object v0, p0, Ldefpackage/ro2;->k:Ldefpackage/oo2;

    .line 27
    .line 28
    if-ne p1, v0, :cond_1

    .line 29
    .line 30
    iget-object v0, p0, Ldefpackage/ro2;->j:Ldefpackage/oo2;

    .line 31
    .line 32
    iput-object v0, p0, Ldefpackage/ro2;->k:Ldefpackage/oo2;

    .line 33
    .line 34
    or-int/lit8 v0, v1, 0x2

    .line 35
    .line 36
    move v1, v0

    .line 37
    :cond_1
    invoke-virtual {p1}, Ldefpackage/oo2;->i()V

    .line 38
    .line 39
    .line 40
    iget v0, p0, Ldefpackage/ro2;->n:I

    .line 41
    .line 42
    add-int/lit8 v0, v0, -0x1

    .line 43
    .line 44
    iput v0, p0, Ldefpackage/ro2;->n:I

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    iget-object p1, p0, Ldefpackage/ro2;->l:Ldefpackage/oo2;

    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v0, p1, Ldefpackage/oo2;->m:Ldefpackage/oo2;

    .line 53
    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-virtual {p1}, Ldefpackage/oo2;->b()V

    .line 58
    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    iput-object v0, p1, Ldefpackage/oo2;->m:Ldefpackage/oo2;

    .line 62
    .line 63
    invoke-virtual {p1}, Ldefpackage/oo2;->c()V

    .line 64
    .line 65
    .line 66
    :goto_1
    invoke-virtual {p0}, Ldefpackage/ro2;->m()V

    .line 67
    .line 68
    .line 69
    :cond_4
    return v1
.end method

.method public final q(Ldefpackage/cu4;Ljava/lang/Object;J)Ldefpackage/mt2;
    .locals 14

    .line 1
    move-object/from16 v1, p2

    .line 2
    .line 3
    iget-object v2, p0, Ldefpackage/ro2;->a:Ldefpackage/zt4;

    .line 4
    .line 5
    invoke-virtual {p1, v1, v2}, Ldefpackage/cu4;->g(Ljava/lang/Object;Ldefpackage/zt4;)Ldefpackage/zt4;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    iget v3, v3, Ldefpackage/zt4;->c:I

    .line 10
    .line 11
    iget-object v4, p0, Ldefpackage/ro2;->o:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, -0x1

    .line 15
    if-eqz v4, :cond_0

    .line 16
    .line 17
    invoke-virtual {p1, v4}, Ldefpackage/cu4;->b(Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eq v4, v6, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1, v4, v2, v5}, Ldefpackage/cu4;->f(ILdefpackage/zt4;Z)Ldefpackage/zt4;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    iget v4, v4, Ldefpackage/zt4;->c:I

    .line 28
    .line 29
    if-ne v4, v3, :cond_0

    .line 30
    .line 31
    iget-wide v3, p0, Ldefpackage/ro2;->p:J

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_0
    iget-object v4, p0, Ldefpackage/ro2;->i:Ldefpackage/oo2;

    .line 35
    .line 36
    :goto_0
    if-eqz v4, :cond_2

    .line 37
    .line 38
    iget-object v7, v4, Ldefpackage/oo2;->b:Ljava/lang/Object;

    .line 39
    .line 40
    invoke-virtual {v7, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-eqz v7, :cond_1

    .line 45
    .line 46
    iget-object v3, v4, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 47
    .line 48
    iget-object v3, v3, Ldefpackage/po2;->a:Ldefpackage/mt2;

    .line 49
    .line 50
    iget-wide v3, v3, Ldefpackage/mt2;->d:J

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_1
    iget-object v4, v4, Ldefpackage/oo2;->m:Ldefpackage/oo2;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    iget-object v4, p0, Ldefpackage/ro2;->i:Ldefpackage/oo2;

    .line 57
    .line 58
    :goto_1
    if-eqz v4, :cond_4

    .line 59
    .line 60
    iget-object v7, v4, Ldefpackage/oo2;->b:Ljava/lang/Object;

    .line 61
    .line 62
    invoke-virtual {p1, v7}, Ldefpackage/cu4;->b(Ljava/lang/Object;)I

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-eq v7, v6, :cond_3

    .line 67
    .line 68
    invoke-virtual {p1, v7, v2, v5}, Ldefpackage/cu4;->f(ILdefpackage/zt4;Z)Ldefpackage/zt4;

    .line 69
    .line 70
    .line 71
    move-result-object v7

    .line 72
    iget v7, v7, Ldefpackage/zt4;->c:I

    .line 73
    .line 74
    if-ne v7, v3, :cond_3

    .line 75
    .line 76
    iget-object v3, v4, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 77
    .line 78
    iget-object v3, v3, Ldefpackage/po2;->a:Ldefpackage/mt2;

    .line 79
    .line 80
    iget-wide v3, v3, Ldefpackage/mt2;->d:J

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_3
    iget-object v4, v4, Ldefpackage/oo2;->m:Ldefpackage/oo2;

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_4
    invoke-virtual {p0, v1}, Ldefpackage/ro2;->r(Ljava/lang/Object;)J

    .line 87
    .line 88
    .line 89
    move-result-wide v3

    .line 90
    const-wide/16 v7, -0x1

    .line 91
    .line 92
    cmp-long v7, v3, v7

    .line 93
    .line 94
    if-eqz v7, :cond_5

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    iget-wide v3, p0, Ldefpackage/ro2;->f:J

    .line 98
    .line 99
    const-wide/16 v7, 0x1

    .line 100
    .line 101
    add-long/2addr v7, v3

    .line 102
    iput-wide v7, p0, Ldefpackage/ro2;->f:J

    .line 103
    .line 104
    iget-object v7, p0, Ldefpackage/ro2;->i:Ldefpackage/oo2;

    .line 105
    .line 106
    if-nez v7, :cond_6

    .line 107
    .line 108
    iput-object v1, p0, Ldefpackage/ro2;->o:Ljava/lang/Object;

    .line 109
    .line 110
    iput-wide v3, p0, Ldefpackage/ro2;->p:J

    .line 111
    .line 112
    :cond_6
    :goto_2
    invoke-virtual {p1, v1, v2}, Ldefpackage/cu4;->g(Ljava/lang/Object;Ldefpackage/zt4;)Ldefpackage/zt4;

    .line 113
    .line 114
    .line 115
    iget v7, v2, Ldefpackage/zt4;->c:I

    .line 116
    .line 117
    iget-object v8, p0, Ldefpackage/ro2;->b:Ldefpackage/bu4;

    .line 118
    .line 119
    invoke-virtual {p1, v7, v8}, Ldefpackage/cu4;->n(ILdefpackage/bu4;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {p1 .. p2}, Ldefpackage/cu4;->b(Ljava/lang/Object;)I

    .line 123
    .line 124
    .line 125
    move-result v7

    .line 126
    move v9, v5

    .line 127
    :goto_3
    iget v10, v8, Ldefpackage/bu4;->m:I

    .line 128
    .line 129
    if-lt v7, v10, :cond_a

    .line 130
    .line 131
    const/4 v10, 0x1

    .line 132
    invoke-virtual {p1, v7, v2, v10}, Ldefpackage/cu4;->f(ILdefpackage/zt4;Z)Ldefpackage/zt4;

    .line 133
    .line 134
    .line 135
    iget-object v11, v2, Ldefpackage/zt4;->g:Ldefpackage/z5;

    .line 136
    .line 137
    iget v11, v11, Ldefpackage/z5;->a:I

    .line 138
    .line 139
    if-lez v11, :cond_7

    .line 140
    .line 141
    goto :goto_4

    .line 142
    :cond_7
    move v10, v5

    .line 143
    :goto_4
    or-int/2addr v9, v10

    .line 144
    iget-wide v11, v2, Ldefpackage/zt4;->d:J

    .line 145
    .line 146
    invoke-virtual {v2, v11, v12}, Ldefpackage/zt4;->c(J)I

    .line 147
    .line 148
    .line 149
    move-result v11

    .line 150
    if-eq v11, v6, :cond_8

    .line 151
    .line 152
    iget-object v1, v2, Ldefpackage/zt4;->b:Ljava/lang/Object;

    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    :cond_8
    if-eqz v9, :cond_9

    .line 158
    .line 159
    if-eqz v10, :cond_a

    .line 160
    .line 161
    iget-wide v10, v2, Ldefpackage/zt4;->d:J

    .line 162
    .line 163
    const-wide/16 v12, 0x0

    .line 164
    .line 165
    cmp-long v10, v10, v12

    .line 166
    .line 167
    if-eqz v10, :cond_9

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_9
    add-int/lit8 v7, v7, -0x1

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_a
    :goto_5
    iget-object v6, p0, Ldefpackage/ro2;->b:Ldefpackage/bu4;

    .line 174
    .line 175
    iget-object v7, p0, Ldefpackage/ro2;->a:Ldefpackage/zt4;

    .line 176
    .line 177
    move-object v0, p1

    .line 178
    move-wide v4, v3

    .line 179
    move-wide/from16 v2, p3

    .line 180
    .line 181
    invoke-static/range {v0 .. v7}, Ldefpackage/ro2;->p(Ldefpackage/cu4;Ljava/lang/Object;JJLdefpackage/bu4;Ldefpackage/zt4;)Ldefpackage/mt2;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    return-object p0
.end method

.method public final r(Ljava/lang/Object;)J
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Ldefpackage/ro2;->q:Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-ge v0, v1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Ldefpackage/ro2;->q:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Ldefpackage/oo2;

    .line 17
    .line 18
    iget-object v2, v1, Ldefpackage/oo2;->b:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    iget-object p0, v1, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 27
    .line 28
    iget-object p0, p0, Ldefpackage/po2;->a:Ldefpackage/mt2;

    .line 29
    .line 30
    iget-wide p0, p0, Ldefpackage/mt2;->d:J

    .line 31
    .line 32
    return-wide p0

    .line 33
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const-wide/16 p0, -0x1

    .line 37
    .line 38
    return-wide p0
.end method

.method public final s(Ldefpackage/cu4;)I
    .locals 7

    .line 1
    iget-object v0, p0, Ldefpackage/ro2;->i:Ldefpackage/oo2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return p0

    .line 7
    :cond_0
    iget-object v1, v0, Ldefpackage/oo2;->b:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p1, v1}, Ldefpackage/cu4;->b(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    move v2, v1

    .line 14
    :goto_0
    iget v5, p0, Ldefpackage/ro2;->g:I

    .line 15
    .line 16
    iget-boolean v6, p0, Ldefpackage/ro2;->h:Z

    .line 17
    .line 18
    iget-object v3, p0, Ldefpackage/ro2;->a:Ldefpackage/zt4;

    .line 19
    .line 20
    iget-object v4, p0, Ldefpackage/ro2;->b:Ldefpackage/bu4;

    .line 21
    .line 22
    move-object v1, p1

    .line 23
    invoke-virtual/range {v1 .. v6}, Ldefpackage/cu4;->d(ILdefpackage/zt4;Ldefpackage/bu4;IZ)I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    :goto_1
    iget-object p1, v0, Ldefpackage/oo2;->m:Ldefpackage/oo2;

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    iget-object v3, v0, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 32
    .line 33
    iget-boolean v3, v3, Ldefpackage/po2;->h:Z

    .line 34
    .line 35
    if-nez v3, :cond_1

    .line 36
    .line 37
    move-object v0, p1

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/4 v3, -0x1

    .line 40
    if-eq v2, v3, :cond_4

    .line 41
    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    iget-object v3, p1, Ldefpackage/oo2;->b:Ljava/lang/Object;

    .line 46
    .line 47
    invoke-virtual {v1, v3}, Ldefpackage/cu4;->b(Ljava/lang/Object;)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    if-eq v3, v2, :cond_3

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    move-object v0, p1

    .line 55
    move-object p1, v1

    .line 56
    goto :goto_0

    .line 57
    :cond_4
    :goto_2
    invoke-virtual {p0, v0}, Ldefpackage/ro2;->o(Ldefpackage/oo2;)I

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    iget-object v2, v0, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 62
    .line 63
    invoke-virtual {p0, v1, v2}, Ldefpackage/ro2;->i(Ldefpackage/cu4;Ldefpackage/po2;)Ldefpackage/po2;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    iput-object p0, v0, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 68
    .line 69
    return p1
.end method

.method public final t(Ldefpackage/cu4;JJJ)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/ro2;->i:Ldefpackage/oo2;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :goto_0
    const/4 v4, 0x0

    .line 9
    if-eqz v2, :cond_d

    .line 10
    .line 11
    iget-object v5, v2, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0, v1, v5}, Ldefpackage/ro2;->i(Ldefpackage/cu4;Ldefpackage/po2;)Ldefpackage/po2;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    move-wide/from16 v6, p2

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    move-wide/from16 v6, p2

    .line 23
    .line 24
    invoke-virtual {v0, v1, v3, v6, v7}, Ldefpackage/ro2;->d(Ldefpackage/cu4;Ldefpackage/oo2;J)Ldefpackage/po2;

    .line 25
    .line 26
    .line 27
    move-result-object v8

    .line 28
    if-eqz v8, :cond_c

    .line 29
    .line 30
    iget-wide v9, v5, Ldefpackage/po2;->b:J

    .line 31
    .line 32
    iget-wide v11, v8, Ldefpackage/po2;->b:J

    .line 33
    .line 34
    cmp-long v9, v9, v11

    .line 35
    .line 36
    if-nez v9, :cond_c

    .line 37
    .line 38
    iget-object v9, v5, Ldefpackage/po2;->a:Ldefpackage/mt2;

    .line 39
    .line 40
    iget-object v10, v8, Ldefpackage/po2;->a:Ldefpackage/mt2;

    .line 41
    .line 42
    invoke-virtual {v9, v10}, Ldefpackage/mt2;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    if-eqz v9, :cond_c

    .line 47
    .line 48
    move-object v3, v8

    .line 49
    :goto_1
    iget-wide v8, v3, Ldefpackage/po2;->e:J

    .line 50
    .line 51
    iget-wide v10, v5, Ldefpackage/po2;->c:J

    .line 52
    .line 53
    iget-wide v12, v5, Ldefpackage/po2;->e:J

    .line 54
    .line 55
    invoke-virtual {v3, v10, v11}, Ldefpackage/po2;->a(J)Ldefpackage/po2;

    .line 56
    .line 57
    .line 58
    move-result-object v10

    .line 59
    iput-object v10, v2, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 60
    .line 61
    cmp-long v10, v12, v8

    .line 62
    .line 63
    if-eqz v10, :cond_b

    .line 64
    .line 65
    invoke-virtual {v2}, Ldefpackage/oo2;->k()V

    .line 66
    .line 67
    .line 68
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    cmp-long v1, v8, v6

    .line 74
    .line 75
    if-nez v1, :cond_1

    .line 76
    .line 77
    const-wide v8, 0x7fffffffffffffffL

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_1
    iget-wide v10, v2, Ldefpackage/oo2;->p:J

    .line 84
    .line 85
    add-long/2addr v8, v10

    .line 86
    :goto_2
    iget-object v1, v0, Ldefpackage/ro2;->j:Ldefpackage/oo2;

    .line 87
    .line 88
    const/4 v10, 0x1

    .line 89
    const-wide/high16 v14, -0x8000000000000000L

    .line 90
    .line 91
    if-ne v2, v1, :cond_3

    .line 92
    .line 93
    iget-object v1, v2, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 94
    .line 95
    iget-boolean v1, v1, Ldefpackage/po2;->g:Z

    .line 96
    .line 97
    if-nez v1, :cond_3

    .line 98
    .line 99
    cmp-long v1, p4, v14

    .line 100
    .line 101
    if-eqz v1, :cond_2

    .line 102
    .line 103
    cmp-long v1, p4, v8

    .line 104
    .line 105
    if-ltz v1, :cond_3

    .line 106
    .line 107
    :cond_2
    move v1, v10

    .line 108
    goto :goto_3

    .line 109
    :cond_3
    move v1, v4

    .line 110
    :goto_3
    iget-object v11, v0, Ldefpackage/ro2;->k:Ldefpackage/oo2;

    .line 111
    .line 112
    if-ne v2, v11, :cond_5

    .line 113
    .line 114
    cmp-long v11, p6, v14

    .line 115
    .line 116
    if-eqz v11, :cond_4

    .line 117
    .line 118
    cmp-long v8, p6, v8

    .line 119
    .line 120
    if-ltz v8, :cond_5

    .line 121
    .line 122
    :cond_4
    move v8, v10

    .line 123
    goto :goto_4

    .line 124
    :cond_5
    move v8, v4

    .line 125
    :goto_4
    invoke-virtual {v0, v2}, Ldefpackage/ro2;->o(Ldefpackage/oo2;)I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eqz v0, :cond_6

    .line 130
    .line 131
    return v0

    .line 132
    :cond_6
    cmp-long v0, v12, v6

    .line 133
    .line 134
    if-nez v0, :cond_7

    .line 135
    .line 136
    iget-wide v11, v5, Ldefpackage/po2;->d:J

    .line 137
    .line 138
    cmp-long v2, v11, v14

    .line 139
    .line 140
    if-nez v2, :cond_7

    .line 141
    .line 142
    iget-wide v2, v3, Ldefpackage/po2;->d:J

    .line 143
    .line 144
    cmp-long v5, v2, v6

    .line 145
    .line 146
    if-eqz v5, :cond_7

    .line 147
    .line 148
    cmp-long v2, v2, v14

    .line 149
    .line 150
    if-eqz v2, :cond_7

    .line 151
    .line 152
    move v2, v10

    .line 153
    goto :goto_5

    .line 154
    :cond_7
    move v2, v4

    .line 155
    :goto_5
    if-eqz v1, :cond_9

    .line 156
    .line 157
    if-nez v0, :cond_8

    .line 158
    .line 159
    if-eqz v2, :cond_9

    .line 160
    .line 161
    :cond_8
    move v4, v10

    .line 162
    :cond_9
    if-eqz v8, :cond_a

    .line 163
    .line 164
    or-int/lit8 v0, v4, 0x2

    .line 165
    .line 166
    return v0

    .line 167
    :cond_a
    return v4

    .line 168
    :cond_b
    iget-object v3, v2, Ldefpackage/oo2;->m:Ldefpackage/oo2;

    .line 169
    .line 170
    move-object/from16 v16, v3

    .line 171
    .line 172
    move-object v3, v2

    .line 173
    move-object/from16 v2, v16

    .line 174
    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_c
    invoke-virtual {v0, v3}, Ldefpackage/ro2;->o(Ldefpackage/oo2;)I

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    return v0

    .line 182
    :cond_d
    return v4
.end method
