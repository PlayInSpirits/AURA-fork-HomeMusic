.class public final Lhz1;
.super Lef2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# virtual methods
.method public final X(Lpp1;)I
    .locals 6

    .line 1
    iget-object v0, p0, Lef2;->H:Lf63;

    .line 2
    .line 3
    iget-object v0, v0, Lf63;->H:Lc72;

    .line 4
    .line 5
    iget-object v0, v0, Lc72;->R:Lf72;

    .line 6
    .line 7
    iget-object v0, v0, Lf72;->q:Lif2;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v1, v0, Lif2;->s:Lf72;

    .line 13
    .line 14
    iget-object v2, v1, Lf72;->d:Ly62;

    .line 15
    .line 16
    iget-object v3, v0, Lif2;->D:Ld72;

    .line 17
    .line 18
    const/4 v4, 0x1

    .line 19
    sget-object v5, Ly62;->o:Ly62;

    .line 20
    .line 21
    if-ne v2, v5, :cond_0

    .line 22
    .line 23
    iput-boolean v4, v3, Ld72;->d:Z

    .line 24
    .line 25
    iget-boolean v2, v3, Ld72;->b:Z

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    iput-boolean v4, v1, Lf72;->f:Z

    .line 30
    .line 31
    iput-boolean v4, v1, Lf72;->g:Z

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iput-boolean v4, v3, Ld72;->e:Z

    .line 35
    .line 36
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lif2;->c()Liz1;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iget-object v1, v1, Liz1;->o0:Lhz1;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    iget-boolean v1, v1, Lcf2;->B:Z

    .line 45
    .line 46
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    const/4 v1, 0x0

    .line 52
    :goto_1
    invoke-virtual {v0}, Lif2;->c()Liz1;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget-object v2, v2, Liz1;->o0:Lhz1;

    .line 57
    .line 58
    if-eqz v2, :cond_3

    .line 59
    .line 60
    iput-boolean v4, v2, Lcf2;->B:Z

    .line 61
    .line 62
    :cond_3
    invoke-virtual {v0}, Lif2;->y()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lif2;->c()Liz1;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-object v0, v0, Liz1;->o0:Lhz1;

    .line 70
    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    if-eqz v1, :cond_4

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    goto :goto_2

    .line 80
    :cond_4
    const/4 v1, 0x0

    .line 81
    :goto_2
    iput-boolean v1, v0, Lcf2;->B:Z

    .line 82
    .line 83
    :cond_5
    iget-object v0, v3, Ld72;->g:Ljava/util/HashMap;

    .line 84
    .line 85
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Ljava/lang/Integer;

    .line 90
    .line 91
    if-eqz v0, :cond_6

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    goto :goto_3

    .line 98
    :cond_6
    const/high16 v0, -0x80000000

    .line 99
    .line 100
    :goto_3
    iget-object p0, p0, Lef2;->M:Lp03;

    .line 101
    .line 102
    invoke-virtual {p0, v0, p1}, Lp03;->g(ILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    return v0
.end method

.method public final q0()V
    .locals 0

    .line 1
    iget-object p0, p0, Lef2;->H:Lf63;

    .line 2
    .line 3
    iget-object p0, p0, Lf63;->H:Lc72;

    .line 4
    .line 5
    iget-object p0, p0, Lc72;->R:Lf72;

    .line 6
    .line 7
    iget-object p0, p0, Lf72;->q:Lif2;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lif2;->c0()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final r(J)Ljg3;
    .locals 6

    .line 1
    invoke-virtual {p0, p1, p2}, Ljg3;->R(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lef2;->H:Lf63;

    .line 5
    .line 6
    iget-object v1, v0, Lf63;->H:Lc72;

    .line 7
    .line 8
    invoke-virtual {v1}, Lc72;->y()Lf13;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, v1, Lf13;->n:[Ljava/lang/Object;

    .line 13
    .line 14
    iget v1, v1, Lf13;->p:I

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    :goto_0
    if-ge v3, v1, :cond_0

    .line 18
    .line 19
    aget-object v4, v2, v3

    .line 20
    .line 21
    check-cast v4, Lc72;

    .line 22
    .line 23
    iget-object v4, v4, Lc72;->R:Lf72;

    .line 24
    .line 25
    iget-object v4, v4, Lf72;->q:Lif2;

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    sget-object v5, La72;->p:La72;

    .line 31
    .line 32
    iput-object v5, v4, Lif2;->w:La72;

    .line 33
    .line 34
    add-int/lit8 v3, v3, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v0, v0, Lf63;->H:Lc72;

    .line 38
    .line 39
    iget-object v1, v0, Lc72;->I:Lui2;

    .line 40
    .line 41
    invoke-virtual {v0}, Lc72;->m()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v1, p0, v0, p1, p2}, Lui2;->a(Lcf2;Ljava/util/List;J)Lvi2;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p0, p1}, Lef2;->p0(Lef2;Lvi2;)V

    .line 50
    .line 51
    .line 52
    return-object p0
.end method
