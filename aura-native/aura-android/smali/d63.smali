.class public final Ld63;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Le63;


# virtual methods
.method public final a(Lcx2;)Z
    .locals 6

    .line 1
    const/4 p0, 0x0

    .line 2
    move-object v0, p0

    .line 3
    :goto_0
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_7

    .line 5
    .line 6
    instance-of v2, p1, Lrn3;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    check-cast p1, Lrn3;

    .line 12
    .line 13
    invoke-interface {p1}, Lrn3;->z()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_6

    .line 18
    .line 19
    return v3

    .line 20
    :cond_0
    iget v2, p1, Lcx2;->p:I

    .line 21
    .line 22
    const/16 v4, 0x10

    .line 23
    .line 24
    and-int/2addr v2, v4

    .line 25
    if-eqz v2, :cond_6

    .line 26
    .line 27
    instance-of v2, p1, Lfo0;

    .line 28
    .line 29
    if-eqz v2, :cond_6

    .line 30
    .line 31
    move-object v2, p1

    .line 32
    check-cast v2, Lfo0;

    .line 33
    .line 34
    iget-object v2, v2, Lfo0;->C:Lcx2;

    .line 35
    .line 36
    :goto_1
    if-eqz v2, :cond_5

    .line 37
    .line 38
    iget v5, v2, Lcx2;->p:I

    .line 39
    .line 40
    and-int/2addr v5, v4

    .line 41
    if-eqz v5, :cond_4

    .line 42
    .line 43
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    if-ne v1, v3, :cond_1

    .line 46
    .line 47
    move-object p1, v2

    .line 48
    goto :goto_2

    .line 49
    :cond_1
    if-nez v0, :cond_2

    .line 50
    .line 51
    new-instance v0, Lf13;

    .line 52
    .line 53
    new-array v5, v4, [Lcx2;

    .line 54
    .line 55
    invoke-direct {v0, v5}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    :cond_2
    if-eqz p1, :cond_3

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Lf13;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object p1, p0

    .line 64
    :cond_3
    invoke-virtual {v0, v2}, Lf13;->b(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_4
    :goto_2
    iget-object v2, v2, Lcx2;->s:Lcx2;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_5
    if-ne v1, v3, :cond_6

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_6
    invoke-static {v0}, Lj51;->c(Lf13;)Lcx2;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    goto :goto_0

    .line 78
    :cond_7
    return v1
.end method

.method public final d()I
    .locals 0

    .line 1
    const/16 p0, 0x10

    .line 2
    .line 3
    return p0
.end method

.method public final i(Lc72;JLfm1;IZ)V
    .locals 0

    .line 1
    invoke-virtual/range {p1 .. p6}, Lc72;->z(JLfm1;IZ)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final k(Lfm1;Lc72;)Z
    .locals 8

    .line 1
    iget-object p0, p2, Lc72;->Q:Lw12;

    .line 2
    .line 3
    iget-object p0, p0, Lw12;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lf63;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/16 p2, 0x10

    .line 11
    .line 12
    invoke-static {p2}, Lg63;->f(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p0, v0}, Lf63;->D0(Z)Lcx2;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const/4 v0, 0x0

    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    goto/16 :goto_4

    .line 24
    .line 25
    :cond_0
    iget-boolean v1, p0, Lcx2;->A:Z

    .line 26
    .line 27
    if-eqz v1, :cond_a

    .line 28
    .line 29
    iget-object v1, p0, Lcx2;->n:Lcx2;

    .line 30
    .line 31
    iget-boolean v1, v1, Lcx2;->A:Z

    .line 32
    .line 33
    if-nez v1, :cond_1

    .line 34
    .line 35
    const-string v1, "visitLocalDescendants called on an unattached node"

    .line 36
    .line 37
    invoke-static {v1}, Lcz1;->b(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    iget-object p0, p0, Lcx2;->n:Lcx2;

    .line 41
    .line 42
    iget v1, p0, Lcx2;->q:I

    .line 43
    .line 44
    and-int/2addr v1, p2

    .line 45
    if-eqz v1, :cond_a

    .line 46
    .line 47
    :goto_0
    if-eqz p0, :cond_a

    .line 48
    .line 49
    iget v1, p0, Lcx2;->p:I

    .line 50
    .line 51
    and-int/2addr v1, p2

    .line 52
    if-eqz v1, :cond_9

    .line 53
    .line 54
    const/4 v1, 0x0

    .line 55
    move-object v2, p0

    .line 56
    move-object v3, v1

    .line 57
    :goto_1
    if-eqz v2, :cond_9

    .line 58
    .line 59
    instance-of v4, v2, Lrn3;

    .line 60
    .line 61
    const/4 v5, 0x1

    .line 62
    if-eqz v4, :cond_2

    .line 63
    .line 64
    check-cast v2, Lrn3;

    .line 65
    .line 66
    invoke-interface {v2}, Lrn3;->X()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_8

    .line 71
    .line 72
    iget-object p0, p1, Lfm1;->n:Lq03;

    .line 73
    .line 74
    iget p0, p0, Lq03;->b:I

    .line 75
    .line 76
    sub-int/2addr p0, v5

    .line 77
    iput p0, p1, Lfm1;->p:I

    .line 78
    .line 79
    return v5

    .line 80
    :cond_2
    iget v4, v2, Lcx2;->p:I

    .line 81
    .line 82
    and-int/2addr v4, p2

    .line 83
    if-eqz v4, :cond_8

    .line 84
    .line 85
    instance-of v4, v2, Lfo0;

    .line 86
    .line 87
    if-eqz v4, :cond_8

    .line 88
    .line 89
    move-object v4, v2

    .line 90
    check-cast v4, Lfo0;

    .line 91
    .line 92
    iget-object v4, v4, Lfo0;->C:Lcx2;

    .line 93
    .line 94
    move v6, v0

    .line 95
    :goto_2
    if-eqz v4, :cond_7

    .line 96
    .line 97
    iget v7, v4, Lcx2;->p:I

    .line 98
    .line 99
    and-int/2addr v7, p2

    .line 100
    if-eqz v7, :cond_6

    .line 101
    .line 102
    add-int/lit8 v6, v6, 0x1

    .line 103
    .line 104
    if-ne v6, v5, :cond_3

    .line 105
    .line 106
    move-object v2, v4

    .line 107
    goto :goto_3

    .line 108
    :cond_3
    if-nez v3, :cond_4

    .line 109
    .line 110
    new-instance v3, Lf13;

    .line 111
    .line 112
    new-array v7, p2, [Lcx2;

    .line 113
    .line 114
    invoke-direct {v3, v7}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    :cond_4
    if-eqz v2, :cond_5

    .line 118
    .line 119
    invoke-virtual {v3, v2}, Lf13;->b(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    move-object v2, v1

    .line 123
    :cond_5
    invoke-virtual {v3, v4}, Lf13;->b(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_6
    :goto_3
    iget-object v4, v4, Lcx2;->s:Lcx2;

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_7
    if-ne v6, v5, :cond_8

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_8
    invoke-static {v3}, Lj51;->c(Lf13;)Lcx2;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    goto :goto_1

    .line 137
    :cond_9
    iget-object p0, p0, Lcx2;->s:Lcx2;

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_a
    :goto_4
    return v0
.end method

.method public final m(Lc72;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
