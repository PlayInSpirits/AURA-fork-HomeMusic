.class public final Ldefpackage/oo2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ldefpackage/no2;

.field public final b:Ljava/lang/Object;

.field public final c:[Ldefpackage/q44;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Ldefpackage/po2;

.field public h:Z

.field public final i:[Z

.field public final j:[Ldefpackage/kq;

.field public final k:Ldefpackage/pn0;

.field public final l:Ldefpackage/fo1;

.field public m:Ldefpackage/oo2;

.field public n:Ldefpackage/tv4;

.field public o:Ldefpackage/ew4;

.field public p:J


# direct methods
.method public constructor <init>([Ldefpackage/kq;JLdefpackage/pn0;Ldefpackage/n9;Ldefpackage/fo1;Ldefpackage/po2;Ldefpackage/ew4;)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/oo2;->j:[Ldefpackage/kq;

    .line 5
    .line 6
    iput-wide p2, p0, Ldefpackage/oo2;->p:J

    .line 7
    .line 8
    iput-object p4, p0, Ldefpackage/oo2;->k:Ldefpackage/pn0;

    .line 9
    .line 10
    iput-object p6, p0, Ldefpackage/oo2;->l:Ldefpackage/fo1;

    .line 11
    .line 12
    iget-object p2, p7, Ldefpackage/po2;->a:Ldefpackage/mt2;

    .line 13
    .line 14
    iget-object p3, p2, Ldefpackage/mt2;->a:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p3, p0, Ldefpackage/oo2;->b:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p7, p0, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 19
    .line 20
    sget-object p3, Ldefpackage/tv4;->d:Ldefpackage/tv4;

    .line 21
    .line 22
    iput-object p3, p0, Ldefpackage/oo2;->n:Ldefpackage/tv4;

    .line 23
    .line 24
    iput-object p8, p0, Ldefpackage/oo2;->o:Ldefpackage/ew4;

    .line 25
    .line 26
    array-length p3, p1

    .line 27
    new-array p3, p3, [Ldefpackage/q44;

    .line 28
    .line 29
    iput-object p3, p0, Ldefpackage/oo2;->c:[Ldefpackage/q44;

    .line 30
    .line 31
    array-length p1, p1

    .line 32
    new-array p1, p1, [Z

    .line 33
    .line 34
    iput-object p1, p0, Ldefpackage/oo2;->i:[Z

    .line 35
    .line 36
    iget-wide p3, p7, Ldefpackage/po2;->b:J

    .line 37
    .line 38
    iget-wide v5, p7, Ldefpackage/po2;->d:J

    .line 39
    .line 40
    iget-boolean p1, p7, Ldefpackage/po2;->f:Z

    .line 41
    .line 42
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object p7, p2, Ldefpackage/mt2;->a:Ljava/lang/Object;

    .line 46
    .line 47
    sget p8, Ldefpackage/tm3;->n:I

    .line 48
    .line 49
    check-cast p7, Landroid/util/Pair;

    .line 50
    .line 51
    iget-object p8, p7, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 52
    .line 53
    iget-object p7, p7, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 54
    .line 55
    invoke-virtual {p2, p7}, Ldefpackage/mt2;->a(Ljava/lang/Object;)Ldefpackage/mt2;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    iget-object p7, p6, Ldefpackage/fo1;->e:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p7, Ljava/util/HashMap;

    .line 62
    .line 63
    invoke-virtual {p7, p8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p7

    .line 67
    check-cast p7, Ldefpackage/bu2;

    .line 68
    .line 69
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object p8, p6, Ldefpackage/fo1;->h:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p8, Ljava/util/HashSet;

    .line 75
    .line 76
    invoke-virtual {p8, p7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    iget-object p8, p6, Ldefpackage/fo1;->g:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p8, Ljava/util/HashMap;

    .line 82
    .line 83
    invoke-virtual {p8, p7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p8

    .line 87
    check-cast p8, Ldefpackage/au2;

    .line 88
    .line 89
    if-eqz p8, :cond_0

    .line 90
    .line 91
    iget-object v0, p8, Ldefpackage/au2;->a:Ldefpackage/bq;

    .line 92
    .line 93
    iget-object p8, p8, Ldefpackage/au2;->b:Ldefpackage/ut2;

    .line 94
    .line 95
    invoke-virtual {v0, p8}, Ldefpackage/bq;->e(Ldefpackage/nt2;)V

    .line 96
    .line 97
    .line 98
    :cond_0
    iget-object p8, p7, Ldefpackage/bu2;->c:Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-virtual {p8, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    iget-object p8, p7, Ldefpackage/bu2;->a:Ldefpackage/rg2;

    .line 104
    .line 105
    invoke-virtual {p8, p2, p5, p3, p4}, Ldefpackage/rg2;->D(Ldefpackage/mt2;Ldefpackage/n9;J)Ldefpackage/og2;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iget-object p2, p6, Ldefpackage/fo1;->d:Ljava/io/Serializable;

    .line 110
    .line 111
    check-cast p2, Ljava/util/IdentityHashMap;

    .line 112
    .line 113
    invoke-virtual {p2, v1, p7}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    invoke-virtual {p6}, Ldefpackage/fo1;->g()V

    .line 117
    .line 118
    .line 119
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    cmp-long p2, v5, p2

    .line 125
    .line 126
    if-eqz p2, :cond_1

    .line 127
    .line 128
    new-instance v0, Ldefpackage/b40;

    .line 129
    .line 130
    xor-int/lit8 v2, p1, 0x1

    .line 131
    .line 132
    const-wide/16 v3, 0x0

    .line 133
    .line 134
    invoke-direct/range {v0 .. v6}, Ldefpackage/b40;-><init>(Ldefpackage/no2;ZJJ)V

    .line 135
    .line 136
    .line 137
    move-object v1, v0

    .line 138
    :cond_1
    iput-object v1, p0, Ldefpackage/oo2;->a:Ldefpackage/no2;

    .line 139
    .line 140
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/ew4;JZ[Z)J
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    iget v4, v1, Ldefpackage/ew4;->o:I

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    if-ge v3, v4, :cond_1

    .line 11
    .line 12
    if-nez p4, :cond_0

    .line 13
    .line 14
    iget-object v4, v0, Ldefpackage/oo2;->o:Ldefpackage/ew4;

    .line 15
    .line 16
    invoke-virtual {v1, v4, v3}, Ldefpackage/ew4;->m(Ldefpackage/ew4;I)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    move v5, v2

    .line 24
    :goto_1
    iget-object v4, v0, Ldefpackage/oo2;->i:[Z

    .line 25
    .line 26
    aput-boolean v5, v4, v3

    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v3, v2

    .line 32
    :goto_2
    iget-object v4, v0, Ldefpackage/oo2;->j:[Ldefpackage/kq;

    .line 33
    .line 34
    array-length v6, v4

    .line 35
    const/4 v7, -0x2

    .line 36
    iget-object v8, v0, Ldefpackage/oo2;->c:[Ldefpackage/q44;

    .line 37
    .line 38
    if-ge v3, v6, :cond_3

    .line 39
    .line 40
    aget-object v4, v4, v3

    .line 41
    .line 42
    iget v4, v4, Ldefpackage/kq;->o:I

    .line 43
    .line 44
    if-ne v4, v7, :cond_2

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    aput-object v4, v8, v3

    .line 48
    .line 49
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_3
    invoke-virtual {v0}, Ldefpackage/oo2;->b()V

    .line 53
    .line 54
    .line 55
    iput-object v1, v0, Ldefpackage/oo2;->o:Ldefpackage/ew4;

    .line 56
    .line 57
    invoke-virtual {v0}, Ldefpackage/oo2;->c()V

    .line 58
    .line 59
    .line 60
    iget-object v3, v1, Ldefpackage/ew4;->q:Ljava/lang/Object;

    .line 61
    .line 62
    move-object v10, v3

    .line 63
    check-cast v10, [Ldefpackage/t41;

    .line 64
    .line 65
    iget-object v11, v0, Ldefpackage/oo2;->i:[Z

    .line 66
    .line 67
    iget-object v12, v0, Ldefpackage/oo2;->c:[Ldefpackage/q44;

    .line 68
    .line 69
    iget-object v9, v0, Ldefpackage/oo2;->a:Ldefpackage/no2;

    .line 70
    .line 71
    move-wide/from16 v14, p2

    .line 72
    .line 73
    move-object/from16 v13, p5

    .line 74
    .line 75
    invoke-interface/range {v9 .. v15}, Ldefpackage/no2;->c([Ldefpackage/t41;[Z[Ldefpackage/q44;[ZJ)J

    .line 76
    .line 77
    .line 78
    move-result-wide v9

    .line 79
    move v3, v2

    .line 80
    :goto_3
    array-length v6, v4

    .line 81
    if-ge v3, v6, :cond_5

    .line 82
    .line 83
    aget-object v6, v4, v3

    .line 84
    .line 85
    iget v6, v6, Ldefpackage/kq;->o:I

    .line 86
    .line 87
    if-ne v6, v7, :cond_4

    .line 88
    .line 89
    iget-object v6, v0, Ldefpackage/oo2;->o:Ldefpackage/ew4;

    .line 90
    .line 91
    invoke-virtual {v6, v3}, Ldefpackage/ew4;->n(I)Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_4

    .line 96
    .line 97
    new-instance v6, Ldefpackage/om0;

    .line 98
    .line 99
    const/16 v11, 0x18

    .line 100
    .line 101
    invoke-direct {v6, v11}, Ldefpackage/om0;-><init>(I)V

    .line 102
    .line 103
    .line 104
    aput-object v6, v8, v3

    .line 105
    .line 106
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_5
    iput-boolean v2, v0, Ldefpackage/oo2;->f:Z

    .line 110
    .line 111
    move v3, v2

    .line 112
    :goto_4
    array-length v6, v8

    .line 113
    if-ge v3, v6, :cond_9

    .line 114
    .line 115
    aget-object v6, v8, v3

    .line 116
    .line 117
    if-eqz v6, :cond_6

    .line 118
    .line 119
    invoke-virtual {v1, v3}, Ldefpackage/ew4;->n(I)Z

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    invoke-static {v6}, Ldefpackage/rr2;->w(Z)V

    .line 124
    .line 125
    .line 126
    aget-object v6, v4, v3

    .line 127
    .line 128
    iget v6, v6, Ldefpackage/kq;->o:I

    .line 129
    .line 130
    if-eq v6, v7, :cond_8

    .line 131
    .line 132
    iput-boolean v5, v0, Ldefpackage/oo2;->f:Z

    .line 133
    .line 134
    goto :goto_6

    .line 135
    :cond_6
    iget-object v6, v1, Ldefpackage/ew4;->q:Ljava/lang/Object;

    .line 136
    .line 137
    check-cast v6, [Ldefpackage/t41;

    .line 138
    .line 139
    aget-object v6, v6, v3

    .line 140
    .line 141
    if-nez v6, :cond_7

    .line 142
    .line 143
    move v6, v5

    .line 144
    goto :goto_5

    .line 145
    :cond_7
    move v6, v2

    .line 146
    :goto_5
    invoke-static {v6}, Ldefpackage/rr2;->w(Z)V

    .line 147
    .line 148
    .line 149
    :cond_8
    :goto_6
    add-int/lit8 v3, v3, 0x1

    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_9
    return-wide v9
.end method

.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/oo2;->m:Ldefpackage/oo2;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    iget-object v1, p0, Ldefpackage/oo2;->o:Ldefpackage/ew4;

    .line 7
    .line 8
    iget v2, v1, Ldefpackage/ew4;->o:I

    .line 9
    .line 10
    if-ge v0, v2, :cond_1

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ldefpackage/ew4;->n(I)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v2, p0, Ldefpackage/oo2;->o:Ldefpackage/ew4;

    .line 17
    .line 18
    iget-object v2, v2, Ldefpackage/ew4;->q:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, [Ldefpackage/t41;

    .line 21
    .line 22
    aget-object v2, v2, v0

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-interface {v2}, Ldefpackage/t41;->k()V

    .line 29
    .line 30
    .line 31
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/oo2;->m:Ldefpackage/oo2;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    iget-object v1, p0, Ldefpackage/oo2;->o:Ldefpackage/ew4;

    .line 7
    .line 8
    iget v2, v1, Ldefpackage/ew4;->o:I

    .line 9
    .line 10
    if-ge v0, v2, :cond_1

    .line 11
    .line 12
    invoke-virtual {v1, v0}, Ldefpackage/ew4;->n(I)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    iget-object v2, p0, Ldefpackage/oo2;->o:Ldefpackage/ew4;

    .line 17
    .line 18
    iget-object v2, v2, Ldefpackage/ew4;->q:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, [Ldefpackage/t41;

    .line 21
    .line 22
    aget-object v2, v2, v0

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    invoke-interface {v2}, Ldefpackage/t41;->h()V

    .line 29
    .line 30
    .line 31
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method

.method public final d()J
    .locals 5

    .line 1
    iget-boolean v0, p0, Ldefpackage/oo2;->e:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 6
    .line 7
    iget-wide v0, p0, Ldefpackage/po2;->b:J

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget-boolean v0, p0, Ldefpackage/oo2;->f:Z

    .line 11
    .line 12
    const-wide/high16 v1, -0x8000000000000000L

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Ldefpackage/oo2;->a:Ldefpackage/no2;

    .line 17
    .line 18
    invoke-interface {v0}, Ldefpackage/da4;->q()J

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    goto :goto_0

    .line 23
    :cond_1
    move-wide v3, v1

    .line 24
    :goto_0
    cmp-long v0, v3, v1

    .line 25
    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    iget-object p0, p0, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 29
    .line 30
    iget-wide v0, p0, Ldefpackage/po2;->e:J

    .line 31
    .line 32
    return-wide v0

    .line 33
    :cond_2
    return-wide v3
.end method

.method public final e()J
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 2
    .line 3
    iget-wide v0, v0, Ldefpackage/po2;->b:J

    .line 4
    .line 5
    iget-wide v2, p0, Ldefpackage/oo2;->p:J

    .line 6
    .line 7
    add-long/2addr v0, v2

    .line 8
    return-wide v0
.end method

.method public final f(FLdefpackage/cu4;Z)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/oo2;->e:Z

    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/oo2;->a:Ldefpackage/no2;

    .line 5
    .line 6
    invoke-interface {v0}, Ldefpackage/no2;->n()Ldefpackage/tv4;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Ldefpackage/oo2;->n:Ldefpackage/tv4;

    .line 11
    .line 12
    invoke-virtual {p0, p1, p2, p3}, Ldefpackage/oo2;->j(FLdefpackage/cu4;Z)Ldefpackage/ew4;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object p1, p0, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 17
    .line 18
    iget-wide p2, p1, Ldefpackage/po2;->b:J

    .line 19
    .line 20
    iget-wide v0, p1, Ldefpackage/po2;->e:J

    .line 21
    .line 22
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    cmp-long p1, v0, v3

    .line 28
    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    cmp-long p1, p2, v0

    .line 32
    .line 33
    if-ltz p1, :cond_0

    .line 34
    .line 35
    const-wide/16 p1, 0x1

    .line 36
    .line 37
    sub-long/2addr v0, p1

    .line 38
    const-wide/16 p1, 0x0

    .line 39
    .line 40
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide p2

    .line 44
    :cond_0
    move-wide v3, p2

    .line 45
    iget-object p1, p0, Ldefpackage/oo2;->j:[Ldefpackage/kq;

    .line 46
    .line 47
    array-length p1, p1

    .line 48
    new-array v6, p1, [Z

    .line 49
    .line 50
    const/4 v5, 0x0

    .line 51
    move-object v1, p0

    .line 52
    invoke-virtual/range {v1 .. v6}, Ldefpackage/oo2;->a(Ldefpackage/ew4;JZ[Z)J

    .line 53
    .line 54
    .line 55
    move-result-wide p0

    .line 56
    iget-wide p2, v1, Ldefpackage/oo2;->p:J

    .line 57
    .line 58
    iget-object v0, v1, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 59
    .line 60
    iget-wide v2, v0, Ldefpackage/po2;->b:J

    .line 61
    .line 62
    sub-long/2addr v2, p0

    .line 63
    add-long/2addr v2, p2

    .line 64
    iput-wide v2, v1, Ldefpackage/oo2;->p:J

    .line 65
    .line 66
    invoke-virtual {v0, p0, p1}, Ldefpackage/po2;->b(J)Ldefpackage/po2;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    iput-object p0, v1, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 71
    .line 72
    return-void
.end method

.method public final g()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Ldefpackage/oo2;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Ldefpackage/oo2;->f:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/oo2;->a:Ldefpackage/no2;

    .line 10
    .line 11
    invoke-interface {p0}, Ldefpackage/da4;->q()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    const-wide/high16 v2, -0x8000000000000000L

    .line 16
    .line 17
    cmp-long p0, v0, v2

    .line 18
    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    :cond_0
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final h()Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Ldefpackage/oo2;->e:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/oo2;->g()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ldefpackage/oo2;->d()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-object p0, p0, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 16
    .line 17
    iget-wide v2, p0, Ldefpackage/po2;->b:J

    .line 18
    .line 19
    sub-long/2addr v0, v2

    .line 20
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    cmp-long p0, v0, v2

    .line 26
    .line 27
    if-ltz p0, :cond_1

    .line 28
    .line 29
    :cond_0
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_1
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public final i()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/oo2;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/oo2;->a:Ldefpackage/no2;

    .line 5
    .line 6
    :try_start_0
    instance-of v1, v0, Ldefpackage/b40;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/oo2;->l:Ldefpackage/fo1;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    :try_start_1
    check-cast v0, Ldefpackage/b40;

    .line 13
    .line 14
    iget-object v0, v0, Ldefpackage/b40;->n:Ldefpackage/no2;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ldefpackage/fo1;->n(Ldefpackage/no2;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {p0, v0}, Ldefpackage/fo1;->n(Ldefpackage/no2;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    move-exception p0

    .line 25
    const-string v0, "MediaPeriodHolder"

    .line 26
    .line 27
    const-string v1, "Period release failed."

    .line 28
    .line 29
    invoke-static {v0, v1, p0}, Ldefpackage/l93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final j(FLdefpackage/cu4;Z)Ldefpackage/ew4;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/oo2;->k:Ldefpackage/pn0;

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/oo2;->j:[Ldefpackage/kq;

    .line 6
    .line 7
    iget-object v3, v0, Ldefpackage/oo2;->n:Ldefpackage/tv4;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    array-length v4, v2

    .line 13
    const/4 v5, 0x1

    .line 14
    add-int/2addr v4, v5

    .line 15
    new-array v4, v4, [I

    .line 16
    .line 17
    array-length v6, v2

    .line 18
    add-int/2addr v6, v5

    .line 19
    new-array v7, v6, [[Ldefpackage/sv4;

    .line 20
    .line 21
    array-length v8, v2

    .line 22
    add-int/2addr v8, v5

    .line 23
    new-array v13, v8, [[[I

    .line 24
    .line 25
    const/4 v9, 0x0

    .line 26
    :goto_0
    if-ge v9, v6, :cond_0

    .line 27
    .line 28
    iget v10, v3, Ldefpackage/tv4;->a:I

    .line 29
    .line 30
    new-array v11, v10, [Ldefpackage/sv4;

    .line 31
    .line 32
    aput-object v11, v7, v9

    .line 33
    .line 34
    new-array v10, v10, [[I

    .line 35
    .line 36
    aput-object v10, v13, v9

    .line 37
    .line 38
    add-int/lit8 v9, v9, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    array-length v6, v2

    .line 42
    new-array v12, v6, [I

    .line 43
    .line 44
    const/4 v9, 0x0

    .line 45
    :goto_1
    if-ge v9, v6, :cond_1

    .line 46
    .line 47
    aget-object v10, v2, v9

    .line 48
    .line 49
    invoke-virtual {v10}, Ldefpackage/kq;->F()I

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    aput v10, v12, v9

    .line 54
    .line 55
    add-int/lit8 v9, v9, 0x1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    const/4 v6, 0x0

    .line 59
    :goto_2
    iget v9, v3, Ldefpackage/tv4;->a:I

    .line 60
    .line 61
    const/4 v15, 0x5

    .line 62
    if-ge v6, v9, :cond_a

    .line 63
    .line 64
    invoke-virtual {v3, v6}, Ldefpackage/tv4;->a(I)Ldefpackage/sv4;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    iget v11, v9, Ldefpackage/sv4;->c:I

    .line 69
    .line 70
    if-ne v11, v15, :cond_2

    .line 71
    .line 72
    move v11, v5

    .line 73
    goto :goto_3

    .line 74
    :cond_2
    const/4 v11, 0x0

    .line 75
    :goto_3
    array-length v14, v2

    .line 76
    move/from16 v16, v5

    .line 77
    .line 78
    const/16 p2, 0x7

    .line 79
    .line 80
    const/4 v10, 0x0

    .line 81
    const/4 v15, 0x0

    .line 82
    const/16 v20, 0x0

    .line 83
    .line 84
    :goto_4
    array-length v8, v2

    .line 85
    if-ge v15, v8, :cond_7

    .line 86
    .line 87
    aget-object v8, v2, v15

    .line 88
    .line 89
    move-object/from16 v17, v3

    .line 90
    .line 91
    move-object/from16 v18, v4

    .line 92
    .line 93
    move/from16 v21, v5

    .line 94
    .line 95
    move/from16 v3, v20

    .line 96
    .line 97
    move v5, v3

    .line 98
    :goto_5
    iget v4, v9, Ldefpackage/sv4;->a:I

    .line 99
    .line 100
    if-ge v5, v4, :cond_3

    .line 101
    .line 102
    iget-object v4, v9, Ldefpackage/sv4;->d:[Ldefpackage/tb1;

    .line 103
    .line 104
    aget-object v4, v4, v5

    .line 105
    .line 106
    invoke-virtual {v8, v4}, Ldefpackage/kq;->E(Ldefpackage/tb1;)I

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    and-int/lit8 v4, v4, 0x7

    .line 111
    .line 112
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    add-int/lit8 v5, v5, 0x1

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_3
    aget v4, v18, v15

    .line 120
    .line 121
    if-nez v4, :cond_4

    .line 122
    .line 123
    move/from16 v4, v21

    .line 124
    .line 125
    goto :goto_6

    .line 126
    :cond_4
    move/from16 v4, v20

    .line 127
    .line 128
    :goto_6
    if-gt v3, v10, :cond_5

    .line 129
    .line 130
    if-ne v3, v10, :cond_6

    .line 131
    .line 132
    if-eqz v11, :cond_6

    .line 133
    .line 134
    if-nez v16, :cond_6

    .line 135
    .line 136
    if-eqz v4, :cond_6

    .line 137
    .line 138
    :cond_5
    move v10, v3

    .line 139
    move/from16 v16, v4

    .line 140
    .line 141
    move v14, v15

    .line 142
    :cond_6
    add-int/lit8 v15, v15, 0x1

    .line 143
    .line 144
    move-object/from16 v3, v17

    .line 145
    .line 146
    move-object/from16 v4, v18

    .line 147
    .line 148
    move/from16 v5, v21

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_7
    move-object/from16 v17, v3

    .line 152
    .line 153
    move-object/from16 v18, v4

    .line 154
    .line 155
    move/from16 v21, v5

    .line 156
    .line 157
    array-length v3, v2

    .line 158
    if-ne v14, v3, :cond_8

    .line 159
    .line 160
    iget v3, v9, Ldefpackage/sv4;->a:I

    .line 161
    .line 162
    new-array v3, v3, [I

    .line 163
    .line 164
    goto :goto_8

    .line 165
    :cond_8
    aget-object v3, v2, v14

    .line 166
    .line 167
    iget v4, v9, Ldefpackage/sv4;->a:I

    .line 168
    .line 169
    new-array v4, v4, [I

    .line 170
    .line 171
    move/from16 v5, v20

    .line 172
    .line 173
    :goto_7
    iget v8, v9, Ldefpackage/sv4;->a:I

    .line 174
    .line 175
    if-ge v5, v8, :cond_9

    .line 176
    .line 177
    iget-object v8, v9, Ldefpackage/sv4;->d:[Ldefpackage/tb1;

    .line 178
    .line 179
    aget-object v8, v8, v5

    .line 180
    .line 181
    invoke-virtual {v3, v8}, Ldefpackage/kq;->E(Ldefpackage/tb1;)I

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    aput v8, v4, v5

    .line 186
    .line 187
    add-int/lit8 v5, v5, 0x1

    .line 188
    .line 189
    goto :goto_7

    .line 190
    :cond_9
    move-object v3, v4

    .line 191
    :goto_8
    aget v4, v18, v14

    .line 192
    .line 193
    aget-object v5, v7, v14

    .line 194
    .line 195
    aput-object v9, v5, v4

    .line 196
    .line 197
    aget-object v5, v13, v14

    .line 198
    .line 199
    aput-object v3, v5, v4

    .line 200
    .line 201
    add-int/lit8 v4, v4, 0x1

    .line 202
    .line 203
    aput v4, v18, v14

    .line 204
    .line 205
    add-int/lit8 v6, v6, 0x1

    .line 206
    .line 207
    move-object/from16 v3, v17

    .line 208
    .line 209
    move-object/from16 v4, v18

    .line 210
    .line 211
    move/from16 v5, v21

    .line 212
    .line 213
    goto/16 :goto_2

    .line 214
    .line 215
    :cond_a
    move-object/from16 v18, v4

    .line 216
    .line 217
    move/from16 v21, v5

    .line 218
    .line 219
    const/16 p2, 0x7

    .line 220
    .line 221
    const/16 v20, 0x0

    .line 222
    .line 223
    array-length v3, v2

    .line 224
    new-array v11, v3, [Ldefpackage/tv4;

    .line 225
    .line 226
    array-length v3, v2

    .line 227
    new-array v3, v3, [Ljava/lang/String;

    .line 228
    .line 229
    array-length v4, v2

    .line 230
    new-array v10, v4, [I

    .line 231
    .line 232
    move/from16 v4, v20

    .line 233
    .line 234
    :goto_9
    array-length v5, v2

    .line 235
    if-ge v4, v5, :cond_b

    .line 236
    .line 237
    aget v5, v18, v4

    .line 238
    .line 239
    new-instance v6, Ldefpackage/tv4;

    .line 240
    .line 241
    aget-object v8, v7, v4

    .line 242
    .line 243
    invoke-static {v5, v8}, Ldefpackage/f35;->S(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v8

    .line 247
    check-cast v8, [Ldefpackage/sv4;

    .line 248
    .line 249
    invoke-direct {v6, v8}, Ldefpackage/tv4;-><init>([Ldefpackage/sv4;)V

    .line 250
    .line 251
    .line 252
    aput-object v6, v11, v4

    .line 253
    .line 254
    aget-object v6, v13, v4

    .line 255
    .line 256
    invoke-static {v5, v6}, Ldefpackage/f35;->S(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    check-cast v5, [[I

    .line 261
    .line 262
    aput-object v5, v13, v4

    .line 263
    .line 264
    aget-object v5, v2, v4

    .line 265
    .line 266
    invoke-virtual {v5}, Ldefpackage/kq;->h()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    aput-object v5, v3, v4

    .line 271
    .line 272
    aget-object v5, v2, v4

    .line 273
    .line 274
    iget v5, v5, Ldefpackage/kq;->o:I

    .line 275
    .line 276
    aput v5, v10, v4

    .line 277
    .line 278
    add-int/lit8 v4, v4, 0x1

    .line 279
    .line 280
    goto :goto_9

    .line 281
    :cond_b
    array-length v3, v2

    .line 282
    aget v3, v18, v3

    .line 283
    .line 284
    new-instance v14, Ldefpackage/tv4;

    .line 285
    .line 286
    array-length v2, v2

    .line 287
    aget-object v2, v7, v2

    .line 288
    .line 289
    invoke-static {v3, v2}, Ldefpackage/f35;->S(I[Ljava/lang/Object;)[Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    check-cast v2, [Ldefpackage/sv4;

    .line 294
    .line 295
    invoke-direct {v14, v2}, Ldefpackage/tv4;-><init>([Ldefpackage/sv4;)V

    .line 296
    .line 297
    .line 298
    new-instance v9, Ldefpackage/gg2;

    .line 299
    .line 300
    move/from16 v2, p2

    .line 301
    .line 302
    invoke-direct/range {v9 .. v14}, Ldefpackage/gg2;-><init>([I[Ldefpackage/tv4;[I[[[ILdefpackage/tv4;)V

    .line 303
    .line 304
    .line 305
    iget-object v3, v1, Ldefpackage/pn0;->c:Ljava/lang/Object;

    .line 306
    .line 307
    monitor-enter v3

    .line 308
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    iput-object v4, v1, Ldefpackage/pn0;->g:Ljava/lang/Thread;

    .line 313
    .line 314
    move v4, v15

    .line 315
    iget-object v15, v1, Ldefpackage/pn0;->f:Ldefpackage/jn0;

    .line 316
    .line 317
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 318
    iget-object v3, v1, Ldefpackage/pn0;->j:Ljava/lang/Boolean;

    .line 319
    .line 320
    if-nez v3, :cond_c

    .line 321
    .line 322
    iget-object v3, v1, Ldefpackage/pn0;->d:Landroid/content/Context;

    .line 323
    .line 324
    if-eqz v3, :cond_c

    .line 325
    .line 326
    invoke-static {v3}, Ldefpackage/f35;->O(Landroid/content/Context;)Z

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    iput-object v3, v1, Ldefpackage/pn0;->j:Ljava/lang/Boolean;

    .line 335
    .line 336
    :cond_c
    iget-boolean v3, v15, Ldefpackage/jn0;->A0:Z

    .line 337
    .line 338
    if-eqz v3, :cond_d

    .line 339
    .line 340
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 341
    .line 342
    const/16 v5, 0x20

    .line 343
    .line 344
    if-lt v3, v5, :cond_d

    .line 345
    .line 346
    iget-object v3, v1, Ldefpackage/pn0;->h:Ldefpackage/ll;

    .line 347
    .line 348
    if-nez v3, :cond_d

    .line 349
    .line 350
    new-instance v3, Ldefpackage/ll;

    .line 351
    .line 352
    iget-object v5, v1, Ldefpackage/pn0;->d:Landroid/content/Context;

    .line 353
    .line 354
    iget-object v6, v1, Ldefpackage/pn0;->j:Ljava/lang/Boolean;

    .line 355
    .line 356
    invoke-direct {v3, v5, v1, v6}, Ldefpackage/ll;-><init>(Landroid/content/Context;Ldefpackage/pn0;Ljava/lang/Boolean;)V

    .line 357
    .line 358
    .line 359
    iput-object v3, v1, Ldefpackage/pn0;->h:Ldefpackage/ll;

    .line 360
    .line 361
    :cond_d
    iget v3, v9, Ldefpackage/gg2;->a:I

    .line 362
    .line 363
    iget-object v5, v1, Ldefpackage/pn0;->d:Landroid/content/Context;

    .line 364
    .line 365
    new-array v6, v3, [Ldefpackage/r41;

    .line 366
    .line 367
    move/from16 v7, v20

    .line 368
    .line 369
    :goto_a
    iget v8, v9, Ldefpackage/gg2;->a:I

    .line 370
    .line 371
    const/4 v14, 0x2

    .line 372
    if-ge v7, v8, :cond_f

    .line 373
    .line 374
    aget v8, v10, v7

    .line 375
    .line 376
    if-ne v14, v8, :cond_e

    .line 377
    .line 378
    aget-object v8, v11, v7

    .line 379
    .line 380
    iget v8, v8, Ldefpackage/tv4;->a:I

    .line 381
    .line 382
    if-lez v8, :cond_e

    .line 383
    .line 384
    move/from16 v7, v21

    .line 385
    .line 386
    goto :goto_b

    .line 387
    :cond_e
    add-int/lit8 v7, v7, 0x1

    .line 388
    .line 389
    goto :goto_a

    .line 390
    :cond_f
    move/from16 v7, v20

    .line 391
    .line 392
    :goto_b
    new-instance v8, Ldefpackage/dn0;

    .line 393
    .line 394
    invoke-direct {v8, v1, v15, v7, v12}, Ldefpackage/dn0;-><init>(Ldefpackage/pn0;Ldefpackage/jn0;Z[I)V

    .line 395
    .line 396
    .line 397
    new-instance v7, Ldefpackage/n7;

    .line 398
    .line 399
    invoke-direct {v7, v2}, Ldefpackage/n7;-><init>(I)V

    .line 400
    .line 401
    .line 402
    move/from16 p2, v2

    .line 403
    .line 404
    move/from16 v2, v21

    .line 405
    .line 406
    invoke-static {v2, v9, v13, v8, v7}, Ldefpackage/pn0;->i(ILdefpackage/gg2;[[[ILdefpackage/mn0;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 407
    .line 408
    .line 409
    move-result-object v7

    .line 410
    if-eqz v7, :cond_10

    .line 411
    .line 412
    iget-object v2, v7, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 413
    .line 414
    check-cast v2, Ljava/lang/Integer;

    .line 415
    .line 416
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 417
    .line 418
    .line 419
    move-result v2

    .line 420
    iget-object v8, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v8, Ldefpackage/r41;

    .line 423
    .line 424
    aput-object v8, v6, v2

    .line 425
    .line 426
    :cond_10
    if-nez v7, :cond_11

    .line 427
    .line 428
    const/16 v16, 0x0

    .line 429
    .line 430
    goto :goto_c

    .line 431
    :cond_11
    iget-object v7, v7, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 432
    .line 433
    check-cast v7, Ldefpackage/r41;

    .line 434
    .line 435
    iget-object v8, v7, Ldefpackage/r41;->a:Ldefpackage/sv4;

    .line 436
    .line 437
    iget-object v7, v7, Ldefpackage/r41;->b:[I

    .line 438
    .line 439
    aget v7, v7, v20

    .line 440
    .line 441
    iget-object v8, v8, Ldefpackage/sv4;->d:[Ldefpackage/tb1;

    .line 442
    .line 443
    aget-object v7, v8, v7

    .line 444
    .line 445
    iget-object v7, v7, Ldefpackage/tb1;->d:Ljava/lang/String;

    .line 446
    .line 447
    move-object/from16 v16, v7

    .line 448
    .line 449
    :goto_c
    iget-object v7, v15, Ldefpackage/cw4;->w:Ldefpackage/aw4;

    .line 450
    .line 451
    iget v8, v7, Ldefpackage/aw4;->a:I

    .line 452
    .line 453
    const/16 v22, 0x0

    .line 454
    .line 455
    const/4 v2, 0x6

    .line 456
    if-ne v8, v14, :cond_12

    .line 457
    .line 458
    move v8, v14

    .line 459
    move-object/from16 v12, v16

    .line 460
    .line 461
    move-object/from16 v4, v22

    .line 462
    .line 463
    goto :goto_f

    .line 464
    :cond_12
    iget-boolean v8, v15, Ldefpackage/cw4;->k:Z

    .line 465
    .line 466
    if-eqz v8, :cond_13

    .line 467
    .line 468
    if-eqz v5, :cond_13

    .line 469
    .line 470
    invoke-static {v5}, Ldefpackage/f35;->w(Landroid/content/Context;)Landroid/graphics/Point;

    .line 471
    .line 472
    .line 473
    move-result-object v8

    .line 474
    move-object/from16 v18, v8

    .line 475
    .line 476
    :goto_d
    move v8, v14

    .line 477
    goto :goto_e

    .line 478
    :cond_13
    move-object/from16 v18, v22

    .line 479
    .line 480
    goto :goto_d

    .line 481
    :goto_e
    new-instance v14, Ldefpackage/dg0;

    .line 482
    .line 483
    const/16 v19, 0x2

    .line 484
    .line 485
    move-object/from16 v17, v12

    .line 486
    .line 487
    invoke-direct/range {v14 .. v19}, Ldefpackage/dg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 488
    .line 489
    .line 490
    move-object/from16 v12, v16

    .line 491
    .line 492
    new-instance v4, Ldefpackage/n7;

    .line 493
    .line 494
    invoke-direct {v4, v2}, Ldefpackage/n7;-><init>(I)V

    .line 495
    .line 496
    .line 497
    invoke-static {v8, v9, v13, v14, v4}, Ldefpackage/pn0;->i(ILdefpackage/gg2;[[[ILdefpackage/mn0;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 498
    .line 499
    .line 500
    move-result-object v4

    .line 501
    :goto_f
    iget-boolean v14, v15, Ldefpackage/cw4;->E:Z

    .line 502
    .line 503
    const/4 v2, 0x4

    .line 504
    if-nez v14, :cond_15

    .line 505
    .line 506
    if-nez v4, :cond_14

    .line 507
    .line 508
    goto :goto_11

    .line 509
    :cond_14
    :goto_10
    move-object/from16 v17, v10

    .line 510
    .line 511
    move-object/from16 v8, v22

    .line 512
    .line 513
    goto :goto_12

    .line 514
    :cond_15
    :goto_11
    iget v14, v7, Ldefpackage/aw4;->a:I

    .line 515
    .line 516
    if-ne v14, v8, :cond_16

    .line 517
    .line 518
    goto :goto_10

    .line 519
    :cond_16
    new-instance v14, Ldefpackage/cn;

    .line 520
    .line 521
    const/4 v8, 0x6

    .line 522
    invoke-direct {v14, v8, v15}, Ldefpackage/cn;-><init>(ILjava/lang/Object;)V

    .line 523
    .line 524
    .line 525
    new-instance v8, Ldefpackage/n7;

    .line 526
    .line 527
    move-object/from16 v17, v10

    .line 528
    .line 529
    const/4 v10, 0x5

    .line 530
    invoke-direct {v8, v10}, Ldefpackage/n7;-><init>(I)V

    .line 531
    .line 532
    .line 533
    invoke-static {v2, v9, v13, v14, v8}, Ldefpackage/pn0;->i(ILdefpackage/gg2;[[[ILdefpackage/mn0;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 534
    .line 535
    .line 536
    move-result-object v8

    .line 537
    :goto_12
    if-eqz v8, :cond_17

    .line 538
    .line 539
    iget-object v4, v8, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast v4, Ljava/lang/Integer;

    .line 542
    .line 543
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 544
    .line 545
    .line 546
    move-result v4

    .line 547
    iget-object v8, v8, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 548
    .line 549
    check-cast v8, Ldefpackage/r41;

    .line 550
    .line 551
    aput-object v8, v6, v4

    .line 552
    .line 553
    goto :goto_13

    .line 554
    :cond_17
    if-eqz v4, :cond_18

    .line 555
    .line 556
    iget-object v8, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 557
    .line 558
    check-cast v8, Ljava/lang/Integer;

    .line 559
    .line 560
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 561
    .line 562
    .line 563
    move-result v8

    .line 564
    iget-object v4, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 565
    .line 566
    check-cast v4, Ldefpackage/r41;

    .line 567
    .line 568
    aput-object v4, v6, v8

    .line 569
    .line 570
    :cond_18
    :goto_13
    iget v4, v7, Ldefpackage/aw4;->a:I

    .line 571
    .line 572
    const/4 v8, 0x3

    .line 573
    const/4 v10, 0x2

    .line 574
    if-ne v4, v10, :cond_19

    .line 575
    .line 576
    move-object/from16 v4, v22

    .line 577
    .line 578
    goto :goto_16

    .line 579
    :cond_19
    iget-boolean v4, v15, Ldefpackage/cw4;->B:Z

    .line 580
    .line 581
    if-eqz v4, :cond_1d

    .line 582
    .line 583
    if-nez v5, :cond_1a

    .line 584
    .line 585
    goto :goto_14

    .line 586
    :cond_1a
    const-string v4, "captioning"

    .line 587
    .line 588
    invoke-virtual {v5, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v4

    .line 592
    check-cast v4, Landroid/view/accessibility/CaptioningManager;

    .line 593
    .line 594
    if-eqz v4, :cond_1d

    .line 595
    .line 596
    invoke-virtual {v4}, Landroid/view/accessibility/CaptioningManager;->isEnabled()Z

    .line 597
    .line 598
    .line 599
    move-result v5

    .line 600
    if-nez v5, :cond_1b

    .line 601
    .line 602
    goto :goto_14

    .line 603
    :cond_1b
    invoke-virtual {v4}, Landroid/view/accessibility/CaptioningManager;->getLocale()Ljava/util/Locale;

    .line 604
    .line 605
    .line 606
    move-result-object v4

    .line 607
    if-nez v4, :cond_1c

    .line 608
    .line 609
    goto :goto_14

    .line 610
    :cond_1c
    sget-object v5, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 611
    .line 612
    invoke-virtual {v4}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v4

    .line 616
    goto :goto_15

    .line 617
    :cond_1d
    :goto_14
    move-object/from16 v4, v22

    .line 618
    .line 619
    :goto_15
    new-instance v5, Ldefpackage/eg0;

    .line 620
    .line 621
    const/4 v10, 0x1

    .line 622
    invoke-direct {v5, v15, v12, v4, v10}, Ldefpackage/eg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 623
    .line 624
    .line 625
    new-instance v4, Ldefpackage/n7;

    .line 626
    .line 627
    const/16 v10, 0x8

    .line 628
    .line 629
    invoke-direct {v4, v10}, Ldefpackage/n7;-><init>(I)V

    .line 630
    .line 631
    .line 632
    invoke-static {v8, v9, v13, v5, v4}, Ldefpackage/pn0;->i(ILdefpackage/gg2;[[[ILdefpackage/mn0;Ljava/util/Comparator;)Landroid/util/Pair;

    .line 633
    .line 634
    .line 635
    move-result-object v4

    .line 636
    :goto_16
    if-eqz v4, :cond_1e

    .line 637
    .line 638
    iget-object v5, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 639
    .line 640
    check-cast v5, Ljava/lang/Integer;

    .line 641
    .line 642
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 643
    .line 644
    .line 645
    move-result v5

    .line 646
    iget-object v4, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 647
    .line 648
    check-cast v4, Ldefpackage/r41;

    .line 649
    .line 650
    aput-object v4, v6, v5

    .line 651
    .line 652
    :cond_1e
    move/from16 v4, v20

    .line 653
    .line 654
    :goto_17
    if-ge v4, v3, :cond_27

    .line 655
    .line 656
    aget v5, v17, v4

    .line 657
    .line 658
    const/4 v10, 0x2

    .line 659
    if-eq v5, v10, :cond_26

    .line 660
    .line 661
    const/4 v12, 0x1

    .line 662
    if-eq v5, v12, :cond_26

    .line 663
    .line 664
    if-eq v5, v8, :cond_26

    .line 665
    .line 666
    if-eq v5, v2, :cond_26

    .line 667
    .line 668
    aget-object v5, v11, v4

    .line 669
    .line 670
    aget-object v12, v13, v4

    .line 671
    .line 672
    iget v14, v7, Ldefpackage/aw4;->a:I

    .line 673
    .line 674
    if-ne v14, v10, :cond_1f

    .line 675
    .line 676
    move/from16 v25, v4

    .line 677
    .line 678
    move-object/from16 v28, v7

    .line 679
    .line 680
    :goto_18
    move-object/from16 v2, v22

    .line 681
    .line 682
    goto/16 :goto_1c

    .line 683
    .line 684
    :cond_1f
    move/from16 v14, v20

    .line 685
    .line 686
    move/from16 v16, v14

    .line 687
    .line 688
    move-object/from16 v8, v22

    .line 689
    .line 690
    move-object/from16 v19, v8

    .line 691
    .line 692
    :goto_19
    iget v10, v5, Ldefpackage/tv4;->a:I

    .line 693
    .line 694
    if-ge v14, v10, :cond_24

    .line 695
    .line 696
    invoke-virtual {v5, v14}, Ldefpackage/tv4;->a(I)Ldefpackage/sv4;

    .line 697
    .line 698
    .line 699
    move-result-object v10

    .line 700
    aget-object v24, v12, v14

    .line 701
    .line 702
    move/from16 v25, v4

    .line 703
    .line 704
    move-object/from16 v26, v5

    .line 705
    .line 706
    move-object/from16 v2, v19

    .line 707
    .line 708
    move/from16 v4, v20

    .line 709
    .line 710
    :goto_1a
    iget v5, v10, Ldefpackage/sv4;->a:I

    .line 711
    .line 712
    if-ge v4, v5, :cond_23

    .line 713
    .line 714
    aget v5, v24, v4

    .line 715
    .line 716
    move/from16 v27, v4

    .line 717
    .line 718
    iget-boolean v4, v15, Ldefpackage/jn0;->B0:Z

    .line 719
    .line 720
    invoke-static {v5, v4}, Ldefpackage/kq;->n(IZ)Z

    .line 721
    .line 722
    .line 723
    move-result v4

    .line 724
    if-eqz v4, :cond_21

    .line 725
    .line 726
    iget-object v4, v10, Ldefpackage/sv4;->d:[Ldefpackage/tb1;

    .line 727
    .line 728
    aget-object v4, v4, v27

    .line 729
    .line 730
    new-instance v5, Ldefpackage/hn0;

    .line 731
    .line 732
    move-object/from16 v28, v7

    .line 733
    .line 734
    aget v7, v24, v27

    .line 735
    .line 736
    invoke-direct {v5, v4, v7}, Ldefpackage/hn0;-><init>(Ldefpackage/tb1;I)V

    .line 737
    .line 738
    .line 739
    if-eqz v2, :cond_20

    .line 740
    .line 741
    sget-object v4, Ldefpackage/v60;->a:Ldefpackage/t60;

    .line 742
    .line 743
    iget-boolean v7, v5, Ldefpackage/hn0;->o:Z

    .line 744
    .line 745
    move-object/from16 v29, v8

    .line 746
    .line 747
    iget-boolean v8, v2, Ldefpackage/hn0;->o:Z

    .line 748
    .line 749
    invoke-virtual {v4, v7, v8}, Ldefpackage/t60;->c(ZZ)Ldefpackage/v60;

    .line 750
    .line 751
    .line 752
    move-result-object v4

    .line 753
    iget-boolean v7, v5, Ldefpackage/hn0;->n:Z

    .line 754
    .line 755
    iget-boolean v8, v2, Ldefpackage/hn0;->n:Z

    .line 756
    .line 757
    invoke-virtual {v4, v7, v8}, Ldefpackage/v60;->c(ZZ)Ldefpackage/v60;

    .line 758
    .line 759
    .line 760
    move-result-object v4

    .line 761
    invoke-virtual {v4}, Ldefpackage/v60;->e()I

    .line 762
    .line 763
    .line 764
    move-result v4

    .line 765
    if-lez v4, :cond_22

    .line 766
    .line 767
    :cond_20
    move-object v2, v5

    .line 768
    move-object v8, v10

    .line 769
    move/from16 v16, v27

    .line 770
    .line 771
    goto :goto_1b

    .line 772
    :cond_21
    move-object/from16 v28, v7

    .line 773
    .line 774
    move-object/from16 v29, v8

    .line 775
    .line 776
    :cond_22
    move-object/from16 v8, v29

    .line 777
    .line 778
    :goto_1b
    add-int/lit8 v4, v27, 0x1

    .line 779
    .line 780
    move-object/from16 v7, v28

    .line 781
    .line 782
    goto :goto_1a

    .line 783
    :cond_23
    move-object/from16 v28, v7

    .line 784
    .line 785
    move-object/from16 v29, v8

    .line 786
    .line 787
    add-int/lit8 v14, v14, 0x1

    .line 788
    .line 789
    move-object/from16 v19, v2

    .line 790
    .line 791
    move/from16 v4, v25

    .line 792
    .line 793
    move-object/from16 v5, v26

    .line 794
    .line 795
    const/4 v2, 0x4

    .line 796
    goto :goto_19

    .line 797
    :cond_24
    move/from16 v25, v4

    .line 798
    .line 799
    move-object/from16 v28, v7

    .line 800
    .line 801
    if-nez v8, :cond_25

    .line 802
    .line 803
    goto :goto_18

    .line 804
    :cond_25
    new-instance v2, Ldefpackage/r41;

    .line 805
    .line 806
    filled-new-array/range {v16 .. v16}, [I

    .line 807
    .line 808
    .line 809
    move-result-object v4

    .line 810
    invoke-direct {v2, v8, v4}, Ldefpackage/r41;-><init>(Ldefpackage/sv4;[I)V

    .line 811
    .line 812
    .line 813
    :goto_1c
    aput-object v2, v6, v25

    .line 814
    .line 815
    goto :goto_1d

    .line 816
    :cond_26
    move/from16 v25, v4

    .line 817
    .line 818
    move-object/from16 v28, v7

    .line 819
    .line 820
    :goto_1d
    add-int/lit8 v4, v25, 0x1

    .line 821
    .line 822
    move-object/from16 v7, v28

    .line 823
    .line 824
    const/4 v2, 0x4

    .line 825
    const/4 v8, 0x3

    .line 826
    goto/16 :goto_17

    .line 827
    .line 828
    :cond_27
    iget v2, v9, Ldefpackage/gg2;->a:I

    .line 829
    .line 830
    iget-object v4, v9, Ldefpackage/gg2;->c:[Ldefpackage/tv4;

    .line 831
    .line 832
    new-instance v5, Ljava/util/HashMap;

    .line 833
    .line 834
    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 835
    .line 836
    .line 837
    move/from16 v7, v20

    .line 838
    .line 839
    :goto_1e
    if-ge v7, v2, :cond_28

    .line 840
    .line 841
    aget-object v8, v4, v7

    .line 842
    .line 843
    invoke-static {v8, v15, v5}, Ldefpackage/pn0;->b(Ldefpackage/tv4;Ldefpackage/jn0;Ljava/util/HashMap;)V

    .line 844
    .line 845
    .line 846
    add-int/lit8 v7, v7, 0x1

    .line 847
    .line 848
    goto :goto_1e

    .line 849
    :cond_28
    iget-object v7, v9, Ldefpackage/gg2;->f:Ldefpackage/tv4;

    .line 850
    .line 851
    invoke-static {v7, v15, v5}, Ldefpackage/pn0;->b(Ldefpackage/tv4;Ldefpackage/jn0;Ljava/util/HashMap;)V

    .line 852
    .line 853
    .line 854
    move/from16 v7, v20

    .line 855
    .line 856
    :goto_1f
    const/4 v8, -0x1

    .line 857
    if-ge v7, v2, :cond_2b

    .line 858
    .line 859
    iget-object v10, v9, Ldefpackage/gg2;->b:[I

    .line 860
    .line 861
    aget v10, v10, v7

    .line 862
    .line 863
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 864
    .line 865
    .line 866
    move-result-object v10

    .line 867
    invoke-virtual {v5, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 868
    .line 869
    .line 870
    move-result-object v10

    .line 871
    check-cast v10, Ldefpackage/yv4;

    .line 872
    .line 873
    if-nez v10, :cond_29

    .line 874
    .line 875
    goto :goto_21

    .line 876
    :cond_29
    iget-object v11, v10, Ldefpackage/yv4;->a:Ldefpackage/sv4;

    .line 877
    .line 878
    iget-object v10, v10, Ldefpackage/yv4;->b:Ldefpackage/yw1;

    .line 879
    .line 880
    invoke-virtual {v10}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 881
    .line 882
    .line 883
    move-result v12

    .line 884
    if-nez v12, :cond_2a

    .line 885
    .line 886
    aget-object v12, v4, v7

    .line 887
    .line 888
    invoke-virtual {v12, v11}, Ldefpackage/tv4;->b(Ldefpackage/sv4;)I

    .line 889
    .line 890
    .line 891
    move-result v12

    .line 892
    if-eq v12, v8, :cond_2a

    .line 893
    .line 894
    new-instance v8, Ldefpackage/r41;

    .line 895
    .line 896
    invoke-static {v10}, Ldefpackage/jz4;->N(Ljava/util/Collection;)[I

    .line 897
    .line 898
    .line 899
    move-result-object v10

    .line 900
    invoke-direct {v8, v11, v10}, Ldefpackage/r41;-><init>(Ldefpackage/sv4;[I)V

    .line 901
    .line 902
    .line 903
    goto :goto_20

    .line 904
    :cond_2a
    move-object/from16 v8, v22

    .line 905
    .line 906
    :goto_20
    aput-object v8, v6, v7

    .line 907
    .line 908
    :goto_21
    add-int/lit8 v7, v7, 0x1

    .line 909
    .line 910
    goto :goto_1f

    .line 911
    :cond_2b
    iget v2, v9, Ldefpackage/gg2;->a:I

    .line 912
    .line 913
    move/from16 v4, v20

    .line 914
    .line 915
    :goto_22
    if-ge v4, v2, :cond_2f

    .line 916
    .line 917
    iget-object v5, v9, Ldefpackage/gg2;->c:[Ldefpackage/tv4;

    .line 918
    .line 919
    aget-object v5, v5, v4

    .line 920
    .line 921
    iget-object v7, v15, Ldefpackage/jn0;->D0:Landroid/util/SparseArray;

    .line 922
    .line 923
    invoke-virtual {v7, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 924
    .line 925
    .line 926
    move-result-object v7

    .line 927
    check-cast v7, Ljava/util/Map;

    .line 928
    .line 929
    if-eqz v7, :cond_2e

    .line 930
    .line 931
    invoke-interface {v7, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 932
    .line 933
    .line 934
    move-result v7

    .line 935
    if-eqz v7, :cond_2e

    .line 936
    .line 937
    iget-object v7, v15, Ldefpackage/jn0;->D0:Landroid/util/SparseArray;

    .line 938
    .line 939
    invoke-virtual {v7, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 940
    .line 941
    .line 942
    move-result-object v7

    .line 943
    check-cast v7, Ljava/util/Map;

    .line 944
    .line 945
    if-eqz v7, :cond_2d

    .line 946
    .line 947
    invoke-interface {v7, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 948
    .line 949
    .line 950
    move-result-object v5

    .line 951
    if-nez v5, :cond_2c

    .line 952
    .line 953
    goto :goto_23

    .line 954
    :cond_2c
    invoke-static {}, Ldefpackage/kf2;->k()V

    .line 955
    .line 956
    .line 957
    return-object v22

    .line 958
    :cond_2d
    :goto_23
    aput-object v22, v6, v4

    .line 959
    .line 960
    :cond_2e
    add-int/lit8 v4, v4, 0x1

    .line 961
    .line 962
    goto :goto_22

    .line 963
    :cond_2f
    move/from16 v2, v20

    .line 964
    .line 965
    :goto_24
    if-ge v2, v3, :cond_32

    .line 966
    .line 967
    iget-object v4, v9, Ldefpackage/gg2;->b:[I

    .line 968
    .line 969
    aget v4, v4, v2

    .line 970
    .line 971
    iget-object v5, v15, Ldefpackage/jn0;->E0:Landroid/util/SparseBooleanArray;

    .line 972
    .line 973
    invoke-virtual {v5, v2}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 974
    .line 975
    .line 976
    move-result v5

    .line 977
    if-nez v5, :cond_30

    .line 978
    .line 979
    iget-object v5, v15, Ldefpackage/cw4;->I:Ldefpackage/jx1;

    .line 980
    .line 981
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 982
    .line 983
    .line 984
    move-result-object v4

    .line 985
    invoke-virtual {v5, v4}, Ldefpackage/rw1;->contains(Ljava/lang/Object;)Z

    .line 986
    .line 987
    .line 988
    move-result v4

    .line 989
    if-eqz v4, :cond_31

    .line 990
    .line 991
    :cond_30
    aput-object v22, v6, v2

    .line 992
    .line 993
    :cond_31
    add-int/lit8 v2, v2, 0x1

    .line 994
    .line 995
    goto :goto_24

    .line 996
    :cond_32
    iget-object v2, v1, Ldefpackage/pn0;->e:Ldefpackage/s41;

    .line 997
    .line 998
    iget-object v1, v1, Ldefpackage/pn0;->b:Ldefpackage/cp;

    .line 999
    .line 1000
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1001
    .line 1002
    .line 1003
    invoke-interface {v2, v6, v1}, Ldefpackage/s41;->k([Ldefpackage/r41;Ldefpackage/cp;)[Ldefpackage/t41;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v1

    .line 1007
    new-array v2, v3, [Ldefpackage/dz3;

    .line 1008
    .line 1009
    move/from16 v4, v20

    .line 1010
    .line 1011
    :goto_25
    const/4 v5, -0x2

    .line 1012
    if-ge v4, v3, :cond_36

    .line 1013
    .line 1014
    iget-object v6, v9, Ldefpackage/gg2;->b:[I

    .line 1015
    .line 1016
    aget v6, v6, v4

    .line 1017
    .line 1018
    iget-object v7, v15, Ldefpackage/jn0;->E0:Landroid/util/SparseBooleanArray;

    .line 1019
    .line 1020
    invoke-virtual {v7, v4}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 1021
    .line 1022
    .line 1023
    move-result v7

    .line 1024
    if-nez v7, :cond_35

    .line 1025
    .line 1026
    iget-object v7, v15, Ldefpackage/cw4;->I:Ldefpackage/jx1;

    .line 1027
    .line 1028
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v6

    .line 1032
    invoke-virtual {v7, v6}, Ldefpackage/rw1;->contains(Ljava/lang/Object;)Z

    .line 1033
    .line 1034
    .line 1035
    move-result v6

    .line 1036
    if-eqz v6, :cond_33

    .line 1037
    .line 1038
    goto :goto_26

    .line 1039
    :cond_33
    iget-object v6, v9, Ldefpackage/gg2;->b:[I

    .line 1040
    .line 1041
    aget v6, v6, v4

    .line 1042
    .line 1043
    if-eq v6, v5, :cond_34

    .line 1044
    .line 1045
    aget-object v5, v1, v4

    .line 1046
    .line 1047
    if-eqz v5, :cond_35

    .line 1048
    .line 1049
    :cond_34
    sget-object v5, Ldefpackage/dz3;->c:Ldefpackage/dz3;

    .line 1050
    .line 1051
    goto :goto_27

    .line 1052
    :cond_35
    :goto_26
    move-object/from16 v5, v22

    .line 1053
    .line 1054
    :goto_27
    aput-object v5, v2, v4

    .line 1055
    .line 1056
    add-int/lit8 v4, v4, 0x1

    .line 1057
    .line 1058
    goto :goto_25

    .line 1059
    :cond_36
    iget-object v3, v15, Ldefpackage/cw4;->w:Ldefpackage/aw4;

    .line 1060
    .line 1061
    iget v3, v3, Ldefpackage/aw4;->a:I

    .line 1062
    .line 1063
    if-eqz v3, :cond_3c

    .line 1064
    .line 1065
    move v6, v8

    .line 1066
    move/from16 v3, v20

    .line 1067
    .line 1068
    move v4, v3

    .line 1069
    :goto_28
    iget v7, v9, Ldefpackage/gg2;->a:I

    .line 1070
    .line 1071
    if-ge v3, v7, :cond_39

    .line 1072
    .line 1073
    iget-object v7, v9, Ldefpackage/gg2;->b:[I

    .line 1074
    .line 1075
    aget v7, v7, v3

    .line 1076
    .line 1077
    aget-object v10, v1, v3

    .line 1078
    .line 1079
    const/4 v12, 0x1

    .line 1080
    if-eq v7, v12, :cond_37

    .line 1081
    .line 1082
    if-eqz v10, :cond_37

    .line 1083
    .line 1084
    goto :goto_2b

    .line 1085
    :cond_37
    if-ne v7, v12, :cond_38

    .line 1086
    .line 1087
    if-eqz v10, :cond_38

    .line 1088
    .line 1089
    invoke-interface {v10}, Ldefpackage/t41;->length()I

    .line 1090
    .line 1091
    .line 1092
    move-result v7

    .line 1093
    if-ne v7, v12, :cond_38

    .line 1094
    .line 1095
    iget-object v7, v9, Ldefpackage/gg2;->c:[Ldefpackage/tv4;

    .line 1096
    .line 1097
    aget-object v7, v7, v3

    .line 1098
    .line 1099
    invoke-interface {v10}, Ldefpackage/t41;->c()Ldefpackage/sv4;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v11

    .line 1103
    invoke-virtual {v7, v11}, Ldefpackage/tv4;->b(Ldefpackage/sv4;)I

    .line 1104
    .line 1105
    .line 1106
    move-result v7

    .line 1107
    aget-object v11, v13, v3

    .line 1108
    .line 1109
    aget-object v7, v11, v7

    .line 1110
    .line 1111
    move/from16 v11, v20

    .line 1112
    .line 1113
    invoke-interface {v10, v11}, Ldefpackage/t41;->i(I)I

    .line 1114
    .line 1115
    .line 1116
    move-result v12

    .line 1117
    aget v7, v7, v12

    .line 1118
    .line 1119
    invoke-interface {v10}, Ldefpackage/t41;->m()Ldefpackage/tb1;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v10

    .line 1123
    invoke-static {v15, v7, v10}, Ldefpackage/pn0;->h(Ldefpackage/jn0;ILdefpackage/tb1;)Z

    .line 1124
    .line 1125
    .line 1126
    move-result v7

    .line 1127
    if-eqz v7, :cond_38

    .line 1128
    .line 1129
    add-int/lit8 v4, v4, 0x1

    .line 1130
    .line 1131
    move v6, v3

    .line 1132
    :cond_38
    add-int/lit8 v3, v3, 0x1

    .line 1133
    .line 1134
    const/16 v20, 0x0

    .line 1135
    .line 1136
    goto :goto_28

    .line 1137
    :cond_39
    const/4 v12, 0x1

    .line 1138
    if-ne v4, v12, :cond_3c

    .line 1139
    .line 1140
    new-instance v3, Ldefpackage/dz3;

    .line 1141
    .line 1142
    iget-object v4, v15, Ldefpackage/cw4;->w:Ldefpackage/aw4;

    .line 1143
    .line 1144
    iget-boolean v4, v4, Ldefpackage/aw4;->b:Z

    .line 1145
    .line 1146
    if-eqz v4, :cond_3a

    .line 1147
    .line 1148
    const/4 v14, 0x1

    .line 1149
    goto :goto_29

    .line 1150
    :cond_3a
    const/4 v14, 0x2

    .line 1151
    :goto_29
    aget-object v4, v2, v6

    .line 1152
    .line 1153
    if-eqz v4, :cond_3b

    .line 1154
    .line 1155
    iget-boolean v4, v4, Ldefpackage/dz3;->b:Z

    .line 1156
    .line 1157
    if-eqz v4, :cond_3b

    .line 1158
    .line 1159
    const/4 v4, 0x1

    .line 1160
    goto :goto_2a

    .line 1161
    :cond_3b
    const/4 v4, 0x0

    .line 1162
    :goto_2a
    invoke-direct {v3, v14, v4}, Ldefpackage/dz3;-><init>(IZ)V

    .line 1163
    .line 1164
    .line 1165
    aput-object v3, v2, v6

    .line 1166
    .line 1167
    :cond_3c
    :goto_2b
    invoke-static {v2, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v1

    .line 1171
    iget-object v2, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1172
    .line 1173
    check-cast v2, [Ldefpackage/t41;

    .line 1174
    .line 1175
    array-length v3, v2

    .line 1176
    new-array v3, v3, [Ljava/util/List;

    .line 1177
    .line 1178
    const/4 v11, 0x0

    .line 1179
    :goto_2c
    array-length v4, v2

    .line 1180
    if-ge v11, v4, :cond_3e

    .line 1181
    .line 1182
    aget-object v4, v2, v11

    .line 1183
    .line 1184
    if-eqz v4, :cond_3d

    .line 1185
    .line 1186
    invoke-static {v4}, Ldefpackage/yw1;->o(Ljava/lang/Object;)Ldefpackage/gy3;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v4

    .line 1190
    goto :goto_2d

    .line 1191
    :cond_3d
    sget-object v4, Ldefpackage/yw1;->o:Ldefpackage/vw1;

    .line 1192
    .line 1193
    sget-object v4, Ldefpackage/gy3;->r:Ldefpackage/gy3;

    .line 1194
    .line 1195
    :goto_2d
    aput-object v4, v3, v11

    .line 1196
    .line 1197
    add-int/lit8 v11, v11, 0x1

    .line 1198
    .line 1199
    goto :goto_2c

    .line 1200
    :cond_3e
    new-instance v2, Ldefpackage/uw1;

    .line 1201
    .line 1202
    const/4 v4, 0x4

    .line 1203
    invoke-direct {v2, v4}, Ldefpackage/pw1;-><init>(I)V

    .line 1204
    .line 1205
    .line 1206
    const/4 v11, 0x0

    .line 1207
    :goto_2e
    iget v4, v9, Ldefpackage/gg2;->a:I

    .line 1208
    .line 1209
    iget-object v6, v9, Ldefpackage/gg2;->c:[Ldefpackage/tv4;

    .line 1210
    .line 1211
    if-ge v11, v4, :cond_4a

    .line 1212
    .line 1213
    aget-object v4, v6, v11

    .line 1214
    .line 1215
    aget-object v7, v3, v11

    .line 1216
    .line 1217
    const/4 v10, 0x0

    .line 1218
    :goto_2f
    iget v12, v4, Ldefpackage/tv4;->a:I

    .line 1219
    .line 1220
    if-ge v10, v12, :cond_49

    .line 1221
    .line 1222
    invoke-virtual {v4, v10}, Ldefpackage/tv4;->a(I)Ldefpackage/sv4;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v12

    .line 1226
    aget-object v13, v6, v11

    .line 1227
    .line 1228
    invoke-virtual {v13, v10}, Ldefpackage/tv4;->a(I)Ldefpackage/sv4;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v13

    .line 1232
    iget v13, v13, Ldefpackage/sv4;->a:I

    .line 1233
    .line 1234
    new-array v14, v13, [I

    .line 1235
    .line 1236
    const/4 v5, 0x0

    .line 1237
    const/4 v15, 0x0

    .line 1238
    :goto_30
    if-ge v15, v13, :cond_40

    .line 1239
    .line 1240
    iget-object v8, v9, Ldefpackage/gg2;->e:[[[I

    .line 1241
    .line 1242
    aget-object v8, v8, v11

    .line 1243
    .line 1244
    aget-object v8, v8, v10

    .line 1245
    .line 1246
    aget v8, v8, v15

    .line 1247
    .line 1248
    and-int/lit8 v8, v8, 0x7

    .line 1249
    .line 1250
    move-object/from16 v18, v3

    .line 1251
    .line 1252
    const/4 v3, 0x4

    .line 1253
    if-eq v8, v3, :cond_3f

    .line 1254
    .line 1255
    goto :goto_31

    .line 1256
    :cond_3f
    add-int/lit8 v8, v5, 0x1

    .line 1257
    .line 1258
    aput v15, v14, v5

    .line 1259
    .line 1260
    move v5, v8

    .line 1261
    :goto_31
    add-int/lit8 v15, v15, 0x1

    .line 1262
    .line 1263
    move-object/from16 v3, v18

    .line 1264
    .line 1265
    const/4 v8, -0x1

    .line 1266
    goto :goto_30

    .line 1267
    :cond_40
    move-object/from16 v18, v3

    .line 1268
    .line 1269
    const/4 v3, 0x4

    .line 1270
    invoke-static {v14, v5}, Ljava/util/Arrays;->copyOf([II)[I

    .line 1271
    .line 1272
    .line 1273
    move-result-object v5

    .line 1274
    const/16 v8, 0x10

    .line 1275
    .line 1276
    move-object/from16 v23, v4

    .line 1277
    .line 1278
    move-object/from16 v3, v22

    .line 1279
    .line 1280
    const/4 v13, 0x0

    .line 1281
    const/4 v14, 0x0

    .line 1282
    const/4 v15, 0x0

    .line 1283
    :goto_32
    array-length v4, v5

    .line 1284
    if-ge v13, v4, :cond_42

    .line 1285
    .line 1286
    aget v4, v5, v13

    .line 1287
    .line 1288
    move/from16 v24, v4

    .line 1289
    .line 1290
    aget-object v4, v6, v11

    .line 1291
    .line 1292
    invoke-virtual {v4, v10}, Ldefpackage/tv4;->a(I)Ldefpackage/sv4;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v4

    .line 1296
    iget-object v4, v4, Ldefpackage/sv4;->d:[Ldefpackage/tb1;

    .line 1297
    .line 1298
    aget-object v4, v4, v24

    .line 1299
    .line 1300
    iget-object v4, v4, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 1301
    .line 1302
    add-int/lit8 v24, v15, 0x1

    .line 1303
    .line 1304
    if-nez v15, :cond_41

    .line 1305
    .line 1306
    move-object v3, v4

    .line 1307
    const/16 v21, 0x1

    .line 1308
    .line 1309
    goto :goto_33

    .line 1310
    :cond_41
    invoke-static {v3, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1311
    .line 1312
    .line 1313
    move-result v4

    .line 1314
    const/16 v21, 0x1

    .line 1315
    .line 1316
    xor-int/lit8 v4, v4, 0x1

    .line 1317
    .line 1318
    or-int/2addr v4, v14

    .line 1319
    move v14, v4

    .line 1320
    :goto_33
    iget-object v4, v9, Ldefpackage/gg2;->e:[[[I

    .line 1321
    .line 1322
    aget-object v4, v4, v11

    .line 1323
    .line 1324
    aget-object v4, v4, v10

    .line 1325
    .line 1326
    aget v4, v4, v13

    .line 1327
    .line 1328
    and-int/lit8 v4, v4, 0x18

    .line 1329
    .line 1330
    invoke-static {v8, v4}, Ljava/lang/Math;->min(II)I

    .line 1331
    .line 1332
    .line 1333
    move-result v8

    .line 1334
    add-int/lit8 v13, v13, 0x1

    .line 1335
    .line 1336
    move/from16 v15, v24

    .line 1337
    .line 1338
    goto :goto_32

    .line 1339
    :cond_42
    const/16 v21, 0x1

    .line 1340
    .line 1341
    if-eqz v14, :cond_43

    .line 1342
    .line 1343
    iget-object v3, v9, Ldefpackage/gg2;->d:[I

    .line 1344
    .line 1345
    aget v3, v3, v11

    .line 1346
    .line 1347
    invoke-static {v8, v3}, Ljava/lang/Math;->min(II)I

    .line 1348
    .line 1349
    .line 1350
    move-result v8

    .line 1351
    :cond_43
    if-eqz v8, :cond_44

    .line 1352
    .line 1353
    move/from16 v3, v21

    .line 1354
    .line 1355
    goto :goto_34

    .line 1356
    :cond_44
    const/4 v3, 0x0

    .line 1357
    :goto_34
    iget v4, v12, Ldefpackage/sv4;->a:I

    .line 1358
    .line 1359
    new-array v5, v4, [I

    .line 1360
    .line 1361
    new-array v4, v4, [Z

    .line 1362
    .line 1363
    const/4 v8, 0x0

    .line 1364
    :goto_35
    iget v13, v12, Ldefpackage/sv4;->a:I

    .line 1365
    .line 1366
    if-ge v8, v13, :cond_48

    .line 1367
    .line 1368
    iget-object v13, v9, Ldefpackage/gg2;->e:[[[I

    .line 1369
    .line 1370
    aget-object v13, v13, v11

    .line 1371
    .line 1372
    aget-object v13, v13, v10

    .line 1373
    .line 1374
    aget v13, v13, v8

    .line 1375
    .line 1376
    and-int/lit8 v13, v13, 0x7

    .line 1377
    .line 1378
    aput v13, v5, v8

    .line 1379
    .line 1380
    const/4 v13, 0x0

    .line 1381
    :goto_36
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 1382
    .line 1383
    .line 1384
    move-result v14

    .line 1385
    if-ge v13, v14, :cond_47

    .line 1386
    .line 1387
    invoke-interface {v7, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v14

    .line 1391
    check-cast v14, Ldefpackage/t41;

    .line 1392
    .line 1393
    invoke-interface {v14}, Ldefpackage/t41;->c()Ldefpackage/sv4;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v15

    .line 1397
    invoke-virtual {v15, v12}, Ldefpackage/sv4;->equals(Ljava/lang/Object;)Z

    .line 1398
    .line 1399
    .line 1400
    move-result v15

    .line 1401
    if-eqz v15, :cond_45

    .line 1402
    .line 1403
    invoke-interface {v14, v8}, Ldefpackage/t41;->t(I)I

    .line 1404
    .line 1405
    .line 1406
    move-result v14

    .line 1407
    const/4 v15, -0x1

    .line 1408
    if-eq v14, v15, :cond_46

    .line 1409
    .line 1410
    move/from16 v13, v21

    .line 1411
    .line 1412
    goto :goto_37

    .line 1413
    :cond_45
    const/4 v15, -0x1

    .line 1414
    :cond_46
    add-int/lit8 v13, v13, 0x1

    .line 1415
    .line 1416
    goto :goto_36

    .line 1417
    :cond_47
    const/4 v15, -0x1

    .line 1418
    const/4 v13, 0x0

    .line 1419
    :goto_37
    aput-boolean v13, v4, v8

    .line 1420
    .line 1421
    add-int/lit8 v8, v8, 0x1

    .line 1422
    .line 1423
    goto :goto_35

    .line 1424
    :cond_48
    const/4 v15, -0x1

    .line 1425
    new-instance v8, Ldefpackage/iw4;

    .line 1426
    .line 1427
    invoke-direct {v8, v12, v3, v5, v4}, Ldefpackage/iw4;-><init>(Ldefpackage/sv4;Z[I[Z)V

    .line 1428
    .line 1429
    .line 1430
    invoke-virtual {v2, v8}, Ldefpackage/pw1;->c(Ljava/lang/Object;)V

    .line 1431
    .line 1432
    .line 1433
    add-int/lit8 v10, v10, 0x1

    .line 1434
    .line 1435
    move v8, v15

    .line 1436
    move-object/from16 v3, v18

    .line 1437
    .line 1438
    move-object/from16 v4, v23

    .line 1439
    .line 1440
    const/4 v5, -0x2

    .line 1441
    goto/16 :goto_2f

    .line 1442
    .line 1443
    :cond_49
    move-object/from16 v18, v3

    .line 1444
    .line 1445
    move v15, v8

    .line 1446
    const/16 v21, 0x1

    .line 1447
    .line 1448
    add-int/lit8 v11, v11, 0x1

    .line 1449
    .line 1450
    const/4 v5, -0x2

    .line 1451
    goto/16 :goto_2e

    .line 1452
    .line 1453
    :cond_4a
    const/16 v21, 0x1

    .line 1454
    .line 1455
    iget-object v3, v9, Ldefpackage/gg2;->f:Ldefpackage/tv4;

    .line 1456
    .line 1457
    const/4 v11, 0x0

    .line 1458
    :goto_38
    iget v4, v3, Ldefpackage/tv4;->a:I

    .line 1459
    .line 1460
    if-ge v11, v4, :cond_4b

    .line 1461
    .line 1462
    invoke-virtual {v3, v11}, Ldefpackage/tv4;->a(I)Ldefpackage/sv4;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v4

    .line 1466
    iget v5, v4, Ldefpackage/sv4;->a:I

    .line 1467
    .line 1468
    new-array v5, v5, [I

    .line 1469
    .line 1470
    const/4 v6, 0x0

    .line 1471
    invoke-static {v5, v6}, Ljava/util/Arrays;->fill([II)V

    .line 1472
    .line 1473
    .line 1474
    iget v7, v4, Ldefpackage/sv4;->a:I

    .line 1475
    .line 1476
    new-array v7, v7, [Z

    .line 1477
    .line 1478
    new-instance v8, Ldefpackage/iw4;

    .line 1479
    .line 1480
    invoke-direct {v8, v4, v6, v5, v7}, Ldefpackage/iw4;-><init>(Ldefpackage/sv4;Z[I[Z)V

    .line 1481
    .line 1482
    .line 1483
    invoke-virtual {v2, v8}, Ldefpackage/pw1;->c(Ljava/lang/Object;)V

    .line 1484
    .line 1485
    .line 1486
    add-int/lit8 v11, v11, 0x1

    .line 1487
    .line 1488
    goto :goto_38

    .line 1489
    :cond_4b
    const/4 v6, 0x0

    .line 1490
    new-instance v3, Ldefpackage/jw4;

    .line 1491
    .line 1492
    invoke-virtual {v2}, Ldefpackage/uw1;->f()Ldefpackage/gy3;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v2

    .line 1496
    invoke-direct {v3, v2}, Ldefpackage/jw4;-><init>(Ljava/util/List;)V

    .line 1497
    .line 1498
    .line 1499
    new-instance v2, Ldefpackage/ew4;

    .line 1500
    .line 1501
    iget-object v4, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 1502
    .line 1503
    check-cast v4, [Ldefpackage/dz3;

    .line 1504
    .line 1505
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 1506
    .line 1507
    check-cast v1, [Ldefpackage/t41;

    .line 1508
    .line 1509
    invoke-direct {v2, v4, v1, v3, v9}, Ldefpackage/ew4;-><init>([Ldefpackage/dz3;[Ldefpackage/t41;Ldefpackage/jw4;Ljava/lang/Object;)V

    .line 1510
    .line 1511
    .line 1512
    move v11, v6

    .line 1513
    :goto_39
    iget v1, v2, Ldefpackage/ew4;->o:I

    .line 1514
    .line 1515
    if-ge v11, v1, :cond_50

    .line 1516
    .line 1517
    invoke-virtual {v2, v11}, Ldefpackage/ew4;->n(I)Z

    .line 1518
    .line 1519
    .line 1520
    move-result v1

    .line 1521
    iget-object v3, v2, Ldefpackage/ew4;->q:Ljava/lang/Object;

    .line 1522
    .line 1523
    check-cast v3, [Ldefpackage/t41;

    .line 1524
    .line 1525
    if-eqz v1, :cond_4e

    .line 1526
    .line 1527
    aget-object v1, v3, v11

    .line 1528
    .line 1529
    if-nez v1, :cond_4d

    .line 1530
    .line 1531
    iget-object v1, v0, Ldefpackage/oo2;->j:[Ldefpackage/kq;

    .line 1532
    .line 1533
    aget-object v1, v1, v11

    .line 1534
    .line 1535
    iget v1, v1, Ldefpackage/kq;->o:I

    .line 1536
    .line 1537
    const/4 v4, -0x2

    .line 1538
    if-ne v1, v4, :cond_4c

    .line 1539
    .line 1540
    goto :goto_3a

    .line 1541
    :cond_4c
    move v1, v6

    .line 1542
    goto :goto_3b

    .line 1543
    :cond_4d
    const/4 v4, -0x2

    .line 1544
    :goto_3a
    move/from16 v1, v21

    .line 1545
    .line 1546
    :goto_3b
    invoke-static {v1}, Ldefpackage/rr2;->w(Z)V

    .line 1547
    .line 1548
    .line 1549
    goto :goto_3d

    .line 1550
    :cond_4e
    const/4 v4, -0x2

    .line 1551
    aget-object v1, v3, v11

    .line 1552
    .line 1553
    if-nez v1, :cond_4f

    .line 1554
    .line 1555
    move/from16 v1, v21

    .line 1556
    .line 1557
    goto :goto_3c

    .line 1558
    :cond_4f
    move v1, v6

    .line 1559
    :goto_3c
    invoke-static {v1}, Ldefpackage/rr2;->w(Z)V

    .line 1560
    .line 1561
    .line 1562
    :goto_3d
    add-int/lit8 v11, v11, 0x1

    .line 1563
    .line 1564
    goto :goto_39

    .line 1565
    :cond_50
    iget-object v0, v2, Ldefpackage/ew4;->q:Ljava/lang/Object;

    .line 1566
    .line 1567
    check-cast v0, [Ldefpackage/t41;

    .line 1568
    .line 1569
    array-length v1, v0

    .line 1570
    move v8, v6

    .line 1571
    :goto_3e
    if-ge v8, v1, :cond_52

    .line 1572
    .line 1573
    aget-object v3, v0, v8

    .line 1574
    .line 1575
    move/from16 v4, p1

    .line 1576
    .line 1577
    if-eqz v3, :cond_51

    .line 1578
    .line 1579
    invoke-interface {v3, v4}, Ldefpackage/t41;->p(F)V

    .line 1580
    .line 1581
    .line 1582
    move/from16 v5, p3

    .line 1583
    .line 1584
    invoke-interface {v3, v5}, Ldefpackage/t41;->f(Z)V

    .line 1585
    .line 1586
    .line 1587
    goto :goto_3f

    .line 1588
    :cond_51
    move/from16 v5, p3

    .line 1589
    .line 1590
    :goto_3f
    add-int/lit8 v8, v8, 0x1

    .line 1591
    .line 1592
    goto :goto_3e

    .line 1593
    :cond_52
    return-object v2

    .line 1594
    :catchall_0
    move-exception v0

    .line 1595
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 1596
    throw v0
.end method

.method public final k()V
    .locals 5

    .line 1
    iget-object v0, p0, Ldefpackage/oo2;->a:Ldefpackage/no2;

    .line 2
    .line 3
    instance-of v1, v0, Ldefpackage/b40;

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/oo2;->g:Ldefpackage/po2;

    .line 8
    .line 9
    iget-wide v1, p0, Ldefpackage/po2;->d:J

    .line 10
    .line 11
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long p0, v1, v3

    .line 17
    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    const-wide/high16 v1, -0x8000000000000000L

    .line 21
    .line 22
    :cond_0
    check-cast v0, Ldefpackage/b40;

    .line 23
    .line 24
    const-wide/16 v3, 0x0

    .line 25
    .line 26
    iput-wide v3, v0, Ldefpackage/b40;->s:J

    .line 27
    .line 28
    iput-wide v1, v0, Ldefpackage/b40;->t:J

    .line 29
    .line 30
    :cond_1
    return-void
.end method
