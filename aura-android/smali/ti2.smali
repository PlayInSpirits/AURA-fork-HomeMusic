.class public final Lti2;
.super Ljg3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lpi2;
.implements Lk9;
.implements Lyx2;


# instance fields
.field public A:Lif1;

.field public B:F

.field public C:Z

.field public D:Z

.field public E:Z

.field public F:Z

.field public G:Z

.field public final H:Ld72;

.field public final I:Lf13;

.field public J:Z

.field public K:Z

.field public L:J

.field public final M:Lsi2;

.field public final N:Lsi2;

.field public O:F

.field public P:Z

.field public Q:Lif1;

.field public R:J

.field public S:F

.field public final T:Lsi2;

.field public U:Z

.field public final s:Lf72;

.field public t:Z

.field public u:I

.field public v:I

.field public w:Z

.field public x:Z

.field public y:La72;

.field public z:J


# direct methods
.method public constructor <init>(Lf72;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljg3;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lti2;->s:Lf72;

    .line 5
    .line 6
    const p1, 0x7fffffff

    .line 7
    .line 8
    .line 9
    iput p1, p0, Lti2;->u:I

    .line 10
    .line 11
    iput p1, p0, Lti2;->v:I

    .line 12
    .line 13
    sget-object p1, La72;->p:La72;

    .line 14
    .line 15
    iput-object p1, p0, Lti2;->y:La72;

    .line 16
    .line 17
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    iput-wide v0, p0, Lti2;->z:J

    .line 20
    .line 21
    new-instance p1, Ld72;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-direct {p1, p0, v2}, Ld72;-><init>(Lk9;I)V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lti2;->H:Ld72;

    .line 28
    .line 29
    new-instance p1, Lf13;

    .line 30
    .line 31
    const/16 v3, 0x10

    .line 32
    .line 33
    new-array v3, v3, [Lti2;

    .line 34
    .line 35
    invoke-direct {p1, v3}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lti2;->I:Lf13;

    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    iput-boolean p1, p0, Lti2;->J:Z

    .line 42
    .line 43
    const/16 v3, 0xf

    .line 44
    .line 45
    invoke-static {v2, v2, v3}, Lqc0;->b(III)J

    .line 46
    .line 47
    .line 48
    move-result-wide v3

    .line 49
    iput-wide v3, p0, Lti2;->L:J

    .line 50
    .line 51
    new-instance v3, Lsi2;

    .line 52
    .line 53
    invoke-direct {v3, p0, v2}, Lsi2;-><init>(Lti2;I)V

    .line 54
    .line 55
    .line 56
    iput-object v3, p0, Lti2;->M:Lsi2;

    .line 57
    .line 58
    new-instance v2, Lsi2;

    .line 59
    .line 60
    invoke-direct {v2, p0, p1}, Lsi2;-><init>(Lti2;I)V

    .line 61
    .line 62
    .line 63
    iput-object v2, p0, Lti2;->N:Lsi2;

    .line 64
    .line 65
    iput-wide v0, p0, Lti2;->R:J

    .line 66
    .line 67
    new-instance p1, Lsi2;

    .line 68
    .line 69
    const/4 v0, 0x2

    .line 70
    invoke-direct {p1, p0, v0}, Lsi2;-><init>(Lti2;I)V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lti2;->T:Lsi2;

    .line 74
    .line 75
    return-void
.end method


# virtual methods
.method public final E()V
    .locals 2

    .line 1
    iget-object p0, p0, Lti2;->s:Lf72;

    .line 2
    .line 3
    iget-object p0, p0, Lf72;->a:Lc72;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x7

    .line 7
    invoke-static {p0, v0, v1}, Lc72;->W(Lc72;ZI)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final F()I
    .locals 0

    .line 1
    iget-object p0, p0, Lti2;->s:Lf72;

    .line 2
    .line 3
    invoke-virtual {p0}, Lf72;->a()Lf63;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljg3;->F()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final G()I
    .locals 0

    .line 1
    iget-object p0, p0, Lti2;->s:Lf72;

    .line 2
    .line 3
    invoke-virtual {p0}, Lf72;->a()Lf63;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljg3;->G()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final N(JFLif1;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lti2;->s:Lf72;

    .line 2
    .line 3
    iget-object v1, v0, Lf72;->a:Lc72;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    :try_start_0
    iput-boolean v2, p0, Lti2;->D:Z

    .line 7
    .line 8
    iget-wide v3, p0, Lti2;->z:J

    .line 9
    .line 10
    invoke-static {p1, p2, v3, v4}, Lg02;->a(JJ)Z

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    const/4 v4, 0x0

    .line 15
    if-eqz v3, :cond_0

    .line 16
    .line 17
    iget-object v3, p0, Lti2;->A:Lif1;

    .line 18
    .line 19
    if-ne p4, v3, :cond_0

    .line 20
    .line 21
    iget-boolean v3, p0, Lti2;->U:Z

    .line 22
    .line 23
    if-eqz v3, :cond_2

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception p0

    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :cond_0
    :goto_0
    iget-boolean v3, v0, Lf72;->k:Z

    .line 30
    .line 31
    if-nez v3, :cond_1

    .line 32
    .line 33
    iget-boolean v3, v0, Lf72;->j:Z

    .line 34
    .line 35
    if-nez v3, :cond_1

    .line 36
    .line 37
    iget-boolean v3, p0, Lti2;->U:Z

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    :cond_1
    iput-boolean v2, p0, Lti2;->F:Z

    .line 42
    .line 43
    iput-boolean v4, p0, Lti2;->U:Z

    .line 44
    .line 45
    :cond_2
    iget-object v3, v0, Lf72;->q:Lif2;

    .line 46
    .line 47
    if-eqz v3, :cond_4

    .line 48
    .line 49
    iget-object v5, v3, Lif2;->s:Lf72;

    .line 50
    .line 51
    iget-object v3, v3, Lif2;->C:Lhf2;

    .line 52
    .line 53
    sget-object v6, Lhf2;->p:Lhf2;

    .line 54
    .line 55
    if-ne v3, v6, :cond_4

    .line 56
    .line 57
    iget-object v3, v5, Lf72;->a:Lc72;

    .line 58
    .line 59
    invoke-static {v3}, Lh12;->A(Lc72;)Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_3

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    iput-boolean v2, v5, Lf72;->c:Z

    .line 67
    .line 68
    :cond_4
    :goto_1
    iget-object v3, v0, Lf72;->q:Lif2;

    .line 69
    .line 70
    if-eqz v3, :cond_8

    .line 71
    .line 72
    invoke-virtual {v3}, Lif2;->S()Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-ne v3, v2, :cond_8

    .line 77
    .line 78
    invoke-virtual {v0}, Lf72;->a()Lf63;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    iget-object v2, v2, Lf63;->J:Lf63;

    .line 83
    .line 84
    if-eqz v2, :cond_5

    .line 85
    .line 86
    iget-object v2, v2, Lcf2;->C:Ldf2;

    .line 87
    .line 88
    if-nez v2, :cond_6

    .line 89
    .line 90
    :cond_5
    invoke-static {v1}, Lh12;->L(Lc72;)Lub3;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    check-cast v2, Lra;

    .line 95
    .line 96
    invoke-virtual {v2}, Lra;->getPlacementScope()Lig3;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    :cond_6
    iget-object v3, v0, Lf72;->q:Lif2;

    .line 101
    .line 102
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Lc72;->t()Lc72;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    if-eqz v5, :cond_7

    .line 110
    .line 111
    iget-object v5, v5, Lc72;->R:Lf72;

    .line 112
    .line 113
    iput v4, v5, Lf72;->h:I

    .line 114
    .line 115
    :cond_7
    const v4, 0x7fffffff

    .line 116
    .line 117
    .line 118
    iput v4, v3, Lif2;->v:I

    .line 119
    .line 120
    const/16 v4, 0x20

    .line 121
    .line 122
    shr-long v4, p1, v4

    .line 123
    .line 124
    long-to-int v4, v4

    .line 125
    const-wide v5, 0xffffffffL

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    and-long/2addr v5, p1

    .line 131
    long-to-int v5, v5

    .line 132
    invoke-static {v2, v3, v4, v5}, Lig3;->f(Lig3;Ljg3;II)V

    .line 133
    .line 134
    .line 135
    :cond_8
    iget-object v0, v0, Lf72;->q:Lif2;

    .line 136
    .line 137
    if-eqz v0, :cond_9

    .line 138
    .line 139
    iget-boolean v0, v0, Lif2;->x:Z

    .line 140
    .line 141
    if-nez v0, :cond_9

    .line 142
    .line 143
    const-string v0, "Error: Placement happened before lookahead."

    .line 144
    .line 145
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    :cond_9
    invoke-virtual {p0, p1, p2, p3, p4}, Lti2;->c0(JFLif1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :goto_2
    invoke-virtual {v1, p0}, Lc72;->Z(Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    const/4 p0, 0x0

    .line 156
    throw p0
.end method

.method public final S()Ljava/util/List;
    .locals 9

    .line 1
    iget-object v0, p0, Lti2;->s:Lf72;

    .line 2
    .line 3
    iget-object v1, v0, Lf72;->a:Lc72;

    .line 4
    .line 5
    invoke-virtual {v1}, Lc72;->f0()V

    .line 6
    .line 7
    .line 8
    iget-boolean v1, p0, Lti2;->J:Z

    .line 9
    .line 10
    iget-object v2, p0, Lti2;->I:Lf13;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v2}, Lf13;->f()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    iget-object v0, v0, Lf72;->a:Lc72;

    .line 20
    .line 21
    invoke-virtual {v0}, Lc72;->y()Lf13;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v3, v1, Lf13;->n:[Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v1, Lf13;->p:I

    .line 28
    .line 29
    const/4 v4, 0x0

    .line 30
    move v5, v4

    .line 31
    :goto_0
    if-ge v5, v1, :cond_2

    .line 32
    .line 33
    aget-object v6, v3, v5

    .line 34
    .line 35
    check-cast v6, Lc72;

    .line 36
    .line 37
    iget v7, v2, Lf13;->p:I

    .line 38
    .line 39
    if-gt v7, v5, :cond_1

    .line 40
    .line 41
    iget-object v6, v6, Lc72;->R:Lf72;

    .line 42
    .line 43
    iget-object v6, v6, Lf72;->p:Lti2;

    .line 44
    .line 45
    invoke-virtual {v2, v6}, Lf13;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-object v6, v6, Lc72;->R:Lf72;

    .line 50
    .line 51
    iget-object v6, v6, Lf72;->p:Lti2;

    .line 52
    .line 53
    iget-object v7, v2, Lf13;->n:[Ljava/lang/Object;

    .line 54
    .line 55
    aget-object v8, v7, v5

    .line 56
    .line 57
    aput-object v6, v7, v5

    .line 58
    .line 59
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-virtual {v0}, Lc72;->n()Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Lc13;

    .line 67
    .line 68
    iget-object v0, v0, Lc13;->n:Lf13;

    .line 69
    .line 70
    iget v0, v0, Lf13;->p:I

    .line 71
    .line 72
    iget v1, v2, Lf13;->p:I

    .line 73
    .line 74
    invoke-virtual {v2, v0, v1}, Lf13;->l(II)V

    .line 75
    .line 76
    .line 77
    iput-boolean v4, p0, Lti2;->J:Z

    .line 78
    .line 79
    invoke-virtual {v2}, Lf13;->f()Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method

.method public final X()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lti2;->C:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iput-boolean v1, p0, Lti2;->C:Z

    .line 5
    .line 6
    iget-object p0, p0, Lti2;->s:Lf72;

    .line 7
    .line 8
    iget-object v2, p0, Lf72;->a:Lc72;

    .line 9
    .line 10
    iget-object v3, v2, Lc72;->Q:Lw12;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    iget-object v0, v3, Lw12;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Liz1;

    .line 17
    .line 18
    invoke-virtual {v0}, Lf63;->N0()V

    .line 19
    .line 20
    .line 21
    invoke-static {v2}, Lh12;->L(Lc72;)Lub3;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lra;

    .line 26
    .line 27
    invoke-virtual {v0}, Lra;->getRectManager()Lyv3;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object p0, p0, Lf72;->a:Lc72;

    .line 32
    .line 33
    invoke-virtual {v0, p0}, Lyv3;->h(Lc72;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Lc72;->q()Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    const/4 v0, 0x6

    .line 41
    if-eqz p0, :cond_0

    .line 42
    .line 43
    invoke-static {v2, v1, v0}, Lc72;->W(Lc72;ZI)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget-object p0, v2, Lc72;->R:Lf72;

    .line 48
    .line 49
    iget-boolean p0, p0, Lf72;->e:Z

    .line 50
    .line 51
    if-eqz p0, :cond_1

    .line 52
    .line 53
    invoke-static {v2, v1, v0}, Lc72;->U(Lc72;ZI)V

    .line 54
    .line 55
    .line 56
    :cond_1
    :goto_0
    iget-object p0, v3, Lw12;->e:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, Lf63;

    .line 59
    .line 60
    iget-object v0, v3, Lw12;->d:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Liz1;

    .line 63
    .line 64
    iget-object v0, v0, Lf63;->I:Lf63;

    .line 65
    .line 66
    :goto_1
    invoke-static {p0, v0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_3

    .line 71
    .line 72
    if-eqz p0, :cond_3

    .line 73
    .line 74
    iget-boolean v1, p0, Lf63;->f0:Z

    .line 75
    .line 76
    if-eqz v1, :cond_2

    .line 77
    .line 78
    invoke-virtual {p0}, Lf63;->I0()V

    .line 79
    .line 80
    .line 81
    :cond_2
    iget-object p0, p0, Lf63;->I:Lf63;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    invoke-virtual {v2}, Lc72;->y()Lf13;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    iget-object v0, p0, Lf13;->n:[Ljava/lang/Object;

    .line 89
    .line 90
    iget p0, p0, Lf13;->p:I

    .line 91
    .line 92
    const/4 v1, 0x0

    .line 93
    :goto_2
    if-ge v1, p0, :cond_5

    .line 94
    .line 95
    aget-object v2, v0, v1

    .line 96
    .line 97
    check-cast v2, Lc72;

    .line 98
    .line 99
    invoke-virtual {v2}, Lc72;->u()I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    const v4, 0x7fffffff

    .line 104
    .line 105
    .line 106
    if-eq v3, v4, :cond_4

    .line 107
    .line 108
    iget-object v3, v2, Lc72;->R:Lf72;

    .line 109
    .line 110
    iget-object v3, v3, Lf72;->p:Lti2;

    .line 111
    .line 112
    invoke-virtual {v3}, Lti2;->X()V

    .line 113
    .line 114
    .line 115
    invoke-static {v2}, Lc72;->X(Lc72;)V

    .line 116
    .line 117
    .line 118
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_5
    return-void
.end method

.method public final Z()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lti2;->C:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lti2;->C:Z

    .line 7
    .line 8
    iget-object p0, p0, Lti2;->s:Lf72;

    .line 9
    .line 10
    iget-object v1, p0, Lf72;->a:Lc72;

    .line 11
    .line 12
    iget-object p0, p0, Lf72;->a:Lc72;

    .line 13
    .line 14
    invoke-static {v1}, Lh12;->L(Lc72;)Lub3;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lra;

    .line 19
    .line 20
    invoke-virtual {v1}, Lra;->getRectManager()Lyv3;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v1, p0}, Lyv3;->i(Lc72;)V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lc72;->Q:Lw12;

    .line 28
    .line 29
    iget-object v2, v1, Lw12;->e:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Lf63;

    .line 32
    .line 33
    iget-object v1, v1, Lw12;->d:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, Liz1;

    .line 36
    .line 37
    iget-object v1, v1, Lf63;->I:Lf63;

    .line 38
    .line 39
    :goto_0
    invoke-static {v2, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-nez v3, :cond_0

    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-virtual {v2}, Lf63;->P0()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Lf63;->U0()V

    .line 51
    .line 52
    .line 53
    iget-object v2, v2, Lf63;->I:Lf63;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    invoke-virtual {p0}, Lc72;->y()Lf13;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    iget-object v1, p0, Lf13;->n:[Ljava/lang/Object;

    .line 61
    .line 62
    iget p0, p0, Lf13;->p:I

    .line 63
    .line 64
    :goto_1
    if-ge v0, p0, :cond_1

    .line 65
    .line 66
    aget-object v2, v1, v0

    .line 67
    .line 68
    check-cast v2, Lc72;

    .line 69
    .line 70
    iget-object v2, v2, Lc72;->R:Lf72;

    .line 71
    .line 72
    iget-object v2, v2, Lf72;->p:Lti2;

    .line 73
    .line 74
    invoke-virtual {v2}, Lti2;->Z()V

    .line 75
    .line 76
    .line 77
    add-int/lit8 v0, v0, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    return-void
.end method

.method public final a()Ld72;
    .locals 0

    .line 1
    iget-object p0, p0, Lti2;->H:Ld72;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b0()V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lti2;->P:Z

    .line 3
    .line 4
    iget-object v1, p0, Lti2;->s:Lf72;

    .line 5
    .line 6
    iget-object v2, v1, Lf72;->a:Lc72;

    .line 7
    .line 8
    invoke-virtual {v2}, Lc72;->t()Lc72;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {p0}, Lti2;->c()Liz1;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    iget v3, v3, Lf63;->T:F

    .line 17
    .line 18
    iget-object v1, v1, Lf72;->a:Lc72;

    .line 19
    .line 20
    iget-object v4, v1, Lc72;->Q:Lw12;

    .line 21
    .line 22
    iget-object v5, v4, Lw12;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v5, Lf63;

    .line 25
    .line 26
    iget-object v4, v4, Lw12;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v4, Liz1;

    .line 29
    .line 30
    :goto_0
    if-eq v5, v4, :cond_0

    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    check-cast v5, Lw62;

    .line 36
    .line 37
    iget v6, v5, Lf63;->T:F

    .line 38
    .line 39
    add-float/2addr v3, v6

    .line 40
    iget-object v5, v5, Lf63;->I:Lf63;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    iget v4, p0, Lti2;->O:F

    .line 44
    .line 45
    cmpg-float v4, v3, v4

    .line 46
    .line 47
    if-nez v4, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    iput v3, p0, Lti2;->O:F

    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    invoke-virtual {v2}, Lc72;->N()V

    .line 55
    .line 56
    .line 57
    :cond_2
    if-eqz v2, :cond_3

    .line 58
    .line 59
    invoke-virtual {v2}, Lc72;->B()V

    .line 60
    .line 61
    .line 62
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lti2;->c()Liz1;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    iget-boolean v3, v3, Lcf2;->B:Z

    .line 67
    .line 68
    const/4 v4, 0x0

    .line 69
    if-nez v3, :cond_8

    .line 70
    .line 71
    iget-boolean v3, p0, Lti2;->C:Z

    .line 72
    .line 73
    if-eqz v3, :cond_4

    .line 74
    .line 75
    iget-object v5, p0, Lti2;->H:Ld72;

    .line 76
    .line 77
    invoke-virtual {v5}, Ld72;->d()Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-eqz v5, :cond_5

    .line 82
    .line 83
    :cond_4
    invoke-virtual {p0}, Lti2;->X()V

    .line 84
    .line 85
    .line 86
    :cond_5
    if-nez v3, :cond_7

    .line 87
    .line 88
    if-eqz v2, :cond_6

    .line 89
    .line 90
    invoke-virtual {v2}, Lc72;->B()V

    .line 91
    .line 92
    .line 93
    :cond_6
    iget-boolean v1, p0, Lti2;->t:Z

    .line 94
    .line 95
    if-eqz v1, :cond_8

    .line 96
    .line 97
    if-eqz v2, :cond_8

    .line 98
    .line 99
    invoke-virtual {v2, v4}, Lc72;->V(Z)V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_7
    iget-object v1, v1, Lc72;->Q:Lw12;

    .line 104
    .line 105
    iget-object v1, v1, Lw12;->d:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v1, Liz1;

    .line 108
    .line 109
    invoke-virtual {v1}, Lf63;->N0()V

    .line 110
    .line 111
    .line 112
    :cond_8
    :goto_2
    if-eqz v2, :cond_a

    .line 113
    .line 114
    iget-object v1, v2, Lc72;->R:Lf72;

    .line 115
    .line 116
    iget-boolean v2, p0, Lti2;->t:Z

    .line 117
    .line 118
    if-nez v2, :cond_b

    .line 119
    .line 120
    iget-object v2, v1, Lf72;->d:Ly62;

    .line 121
    .line 122
    sget-object v3, Ly62;->p:Ly62;

    .line 123
    .line 124
    if-ne v2, v3, :cond_b

    .line 125
    .line 126
    iget v2, p0, Lti2;->v:I

    .line 127
    .line 128
    const v3, 0x7fffffff

    .line 129
    .line 130
    .line 131
    if-ne v2, v3, :cond_9

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_9
    const-string v2, "Place was called on a node which was placed already"

    .line 135
    .line 136
    invoke-static {v2}, Lcz1;->b(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    :goto_3
    iget v2, v1, Lf72;->i:I

    .line 140
    .line 141
    iput v2, p0, Lti2;->v:I

    .line 142
    .line 143
    add-int/2addr v2, v0

    .line 144
    iput v2, v1, Lf72;->i:I

    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_a
    iput v4, p0, Lti2;->v:I

    .line 148
    .line 149
    :cond_b
    :goto_4
    invoke-virtual {p0}, Lti2;->y()V

    .line 150
    .line 151
    .line 152
    return-void
.end method

.method public final c()Liz1;
    .locals 0

    .line 1
    iget-object p0, p0, Lti2;->s:Lf72;

    .line 2
    .line 3
    iget-object p0, p0, Lf72;->a:Lc72;

    .line 4
    .line 5
    iget-object p0, p0, Lc72;->Q:Lw12;

    .line 6
    .line 7
    iget-object p0, p0, Lw12;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Liz1;

    .line 10
    .line 11
    return-object p0
.end method

.method public final c0(JFLif1;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lti2;->s:Lf72;

    .line 2
    .line 3
    iget-object v1, v0, Lf72;->a:Lc72;

    .line 4
    .line 5
    iget-object v2, v0, Lf72;->a:Lc72;

    .line 6
    .line 7
    iget-boolean v1, v1, Lc72;->Z:Z

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-string v1, "place is called on a deactivated node"

    .line 12
    .line 13
    invoke-static {v1}, Lcz1;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    sget-object v1, Ly62;->p:Ly62;

    .line 17
    .line 18
    iput-object v1, v0, Lf72;->d:Ly62;

    .line 19
    .line 20
    iput-wide p1, p0, Lti2;->z:J

    .line 21
    .line 22
    iput p3, p0, Lti2;->B:F

    .line 23
    .line 24
    iput-object p4, p0, Lti2;->A:Lif1;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    iput-boolean v1, p0, Lti2;->P:Z

    .line 28
    .line 29
    invoke-static {v2}, Lh12;->L(Lc72;)Lub3;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-boolean v4, p0, Lti2;->F:Z

    .line 34
    .line 35
    if-nez v4, :cond_1

    .line 36
    .line 37
    iget-boolean v4, p0, Lti2;->C:Z

    .line 38
    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0}, Lf72;->a()Lf63;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-wide v2, v1, Ljg3;->r:J

    .line 46
    .line 47
    invoke-static {p1, p2, v2, v3}, Lg02;->c(JJ)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    invoke-virtual {v1, p1, p2, p3, p4}, Lf63;->S0(JFLif1;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lti2;->b0()V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    iget-object v4, p0, Lti2;->H:Ld72;

    .line 59
    .line 60
    iput-boolean v1, v4, Ld72;->e:Z

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Lf72;->f(Z)V

    .line 63
    .line 64
    .line 65
    iput-object p4, p0, Lti2;->Q:Lif1;

    .line 66
    .line 67
    iput-wide p1, p0, Lti2;->R:J

    .line 68
    .line 69
    iput p3, p0, Lti2;->S:F

    .line 70
    .line 71
    check-cast v3, Lra;

    .line 72
    .line 73
    invoke-virtual {v3}, Lra;->getSnapshotObserver()Lwb3;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iget-object p2, p1, Lwb3;->f:Lk52;

    .line 78
    .line 79
    iget-object p1, p1, Lwb3;->a:Lpp3;

    .line 80
    .line 81
    iget-object p3, p0, Lti2;->T:Lsi2;

    .line 82
    .line 83
    invoke-virtual {p1, v2, p2, p3}, Lpp3;->e(Ljava/lang/Object;Lif1;Lgf1;)V

    .line 84
    .line 85
    .line 86
    :goto_0
    sget-object p1, Ly62;->r:Ly62;

    .line 87
    .line 88
    iput-object p1, v0, Lf72;->d:Ly62;

    .line 89
    .line 90
    invoke-virtual {v0}, Lf72;->a()Lf63;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iget-boolean p1, p1, Lcf2;->B:Z

    .line 95
    .line 96
    if-eqz p1, :cond_3

    .line 97
    .line 98
    iget-boolean p1, v0, Lf72;->k:Z

    .line 99
    .line 100
    if-nez p1, :cond_2

    .line 101
    .line 102
    iget-boolean p1, v0, Lf72;->j:Z

    .line 103
    .line 104
    if-eqz p1, :cond_3

    .line 105
    .line 106
    :cond_2
    invoke-virtual {p0}, Lti2;->requestLayout()V

    .line 107
    .line 108
    .line 109
    :cond_3
    const/4 p1, 0x1

    .line 110
    iput-boolean p1, p0, Lti2;->x:Z

    .line 111
    .line 112
    return-void
.end method

.method public final d0(J)Z
    .locals 10

    .line 1
    iget-object v0, p0, Lti2;->s:Lf72;

    .line 2
    .line 3
    iget-object v1, v0, Lf72;->a:Lc72;

    .line 4
    .line 5
    iget-object v2, v0, Lf72;->a:Lc72;

    .line 6
    .line 7
    :try_start_0
    iget-boolean v3, v1, Lc72;->Z:Z

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    const-string v3, "measure is called on a deactivated node"

    .line 12
    .line 13
    invoke-static {v3}, Lcz1;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto/16 :goto_7

    .line 19
    .line 20
    :cond_0
    :goto_0
    invoke-static {v2}, Lh12;->L(Lc72;)Lub3;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-virtual {v2}, Lc72;->t()Lc72;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    iget-boolean v5, v2, Lc72;->P:Z

    .line 29
    .line 30
    const/4 v6, 0x1

    .line 31
    const/4 v7, 0x0

    .line 32
    if-nez v5, :cond_2

    .line 33
    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    iget-boolean v4, v4, Lc72;->P:Z

    .line 37
    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move v4, v7

    .line 42
    goto :goto_2

    .line 43
    :cond_2
    :goto_1
    move v4, v6

    .line 44
    :goto_2
    iput-boolean v4, v2, Lc72;->P:Z

    .line 45
    .line 46
    invoke-virtual {v2}, Lc72;->q()Z

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    if-nez v4, :cond_4

    .line 51
    .line 52
    iget-wide v4, p0, Ljg3;->q:J

    .line 53
    .line 54
    invoke-static {v4, v5, p1, p2}, Lnc0;->b(JJ)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-nez v4, :cond_3

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_3
    check-cast v3, Lra;

    .line 62
    .line 63
    invoke-virtual {v3, v2, v7}, Lra;->g(Lc72;Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Lc72;->Y()V

    .line 67
    .line 68
    .line 69
    return v7

    .line 70
    :cond_4
    :goto_3
    iget-object v3, p0, Lti2;->H:Ld72;

    .line 71
    .line 72
    iput-boolean v7, v3, Ld72;->d:Z

    .line 73
    .line 74
    invoke-virtual {v2}, Lc72;->y()Lf13;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    iget-object v4, v3, Lf13;->n:[Ljava/lang/Object;

    .line 79
    .line 80
    iget v3, v3, Lf13;->p:I

    .line 81
    .line 82
    move v5, v7

    .line 83
    :goto_4
    if-ge v5, v3, :cond_5

    .line 84
    .line 85
    aget-object v8, v4, v5

    .line 86
    .line 87
    check-cast v8, Lc72;

    .line 88
    .line 89
    iget-object v8, v8, Lc72;->R:Lf72;

    .line 90
    .line 91
    iget-object v8, v8, Lf72;->p:Lti2;

    .line 92
    .line 93
    iget-object v8, v8, Lti2;->H:Ld72;

    .line 94
    .line 95
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    add-int/lit8 v5, v5, 0x1

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_5
    iput-boolean v6, p0, Lti2;->w:Z

    .line 102
    .line 103
    invoke-virtual {v0}, Lf72;->a()Lf63;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    iget-wide v3, v3, Ljg3;->p:J

    .line 108
    .line 109
    invoke-virtual {p0, p1, p2}, Ljg3;->R(J)V

    .line 110
    .line 111
    .line 112
    iget-object v5, v0, Lf72;->d:Ly62;

    .line 113
    .line 114
    sget-object v8, Ly62;->r:Ly62;

    .line 115
    .line 116
    if-ne v5, v8, :cond_6

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_6
    const-string v5, "layout state is not idle before measure starts"

    .line 120
    .line 121
    invoke-static {v5}, Lcz1;->b(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    :goto_5
    iput-wide p1, p0, Lti2;->L:J

    .line 125
    .line 126
    sget-object p1, Ly62;->n:Ly62;

    .line 127
    .line 128
    iput-object p1, v0, Lf72;->d:Ly62;

    .line 129
    .line 130
    iput-boolean v7, p0, Lti2;->E:Z

    .line 131
    .line 132
    invoke-static {v2}, Lh12;->L(Lc72;)Lub3;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    check-cast p2, Lra;

    .line 137
    .line 138
    invoke-virtual {p2}, Lra;->getSnapshotObserver()Lwb3;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    iget-object v5, p0, Lti2;->M:Lsi2;

    .line 143
    .line 144
    iget-object v9, p2, Lwb3;->c:Lk52;

    .line 145
    .line 146
    iget-object p2, p2, Lwb3;->a:Lpp3;

    .line 147
    .line 148
    invoke-virtual {p2, v2, v9, v5}, Lpp3;->e(Ljava/lang/Object;Lif1;Lgf1;)V

    .line 149
    .line 150
    .line 151
    iget-object p2, v0, Lf72;->d:Ly62;

    .line 152
    .line 153
    if-ne p2, p1, :cond_7

    .line 154
    .line 155
    iput-boolean v6, p0, Lti2;->F:Z

    .line 156
    .line 157
    iput-boolean v6, p0, Lti2;->G:Z

    .line 158
    .line 159
    iput-object v8, v0, Lf72;->d:Ly62;

    .line 160
    .line 161
    :cond_7
    invoke-virtual {v0}, Lf72;->a()Lf63;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    iget-wide p1, p1, Ljg3;->p:J

    .line 166
    .line 167
    invoke-static {p1, p2, v3, v4}, Ln02;->a(JJ)Z

    .line 168
    .line 169
    .line 170
    move-result p1

    .line 171
    if-eqz p1, :cond_9

    .line 172
    .line 173
    invoke-virtual {v0}, Lf72;->a()Lf63;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    iget p1, p1, Ljg3;->n:I

    .line 178
    .line 179
    iget p2, p0, Ljg3;->n:I

    .line 180
    .line 181
    if-ne p1, p2, :cond_9

    .line 182
    .line 183
    invoke-virtual {v0}, Lf72;->a()Lf63;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    iget p1, p1, Ljg3;->o:I

    .line 188
    .line 189
    iget p2, p0, Ljg3;->o:I

    .line 190
    .line 191
    if-eq p1, p2, :cond_8

    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_8
    move v6, v7

    .line 195
    :cond_9
    :goto_6
    invoke-virtual {v0}, Lf72;->a()Lf63;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    iget p1, p1, Ljg3;->n:I

    .line 200
    .line 201
    invoke-virtual {v0}, Lf72;->a()Lf63;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    iget p2, p2, Ljg3;->o:I

    .line 206
    .line 207
    int-to-long v2, p1

    .line 208
    const/16 p1, 0x20

    .line 209
    .line 210
    shl-long/2addr v2, p1

    .line 211
    int-to-long p1, p2

    .line 212
    const-wide v4, 0xffffffffL

    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    and-long/2addr p1, v4

    .line 218
    or-long/2addr p1, v2

    .line 219
    invoke-virtual {p0, p1, p2}, Ljg3;->Q(J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 220
    .line 221
    .line 222
    return v6

    .line 223
    :goto_7
    invoke-virtual {v1, p0}, Lc72;->Z(Ljava/lang/Throwable;)V

    .line 224
    .line 225
    .line 226
    const/4 p0, 0x0

    .line 227
    throw p0
.end method

.method public final e()Lk9;
    .locals 0

    .line 1
    iget-object p0, p0, Lti2;->s:Lf72;

    .line 2
    .line 3
    iget-object p0, p0, Lf72;->a:Lc72;

    .line 4
    .line 5
    invoke-virtual {p0}, Lc72;->t()Lc72;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lc72;->R:Lf72;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lf72;->p:Lti2;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public final e0()V
    .locals 3

    .line 1
    iget-object p0, p0, Lti2;->s:Lf72;

    .line 2
    .line 3
    iget-object v0, p0, Lf72;->a:Lc72;

    .line 4
    .line 5
    iget-object v1, p0, Lf72;->a:Lc72;

    .line 6
    .line 7
    invoke-virtual {v0}, Lc72;->H()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    iget p0, p0, Lf72;->l:I

    .line 14
    .line 15
    if-lez p0, :cond_2

    .line 16
    .line 17
    iget-object p0, v1, Lc72;->R:Lf72;

    .line 18
    .line 19
    iget-boolean v0, p0, Lf72;->j:Z

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-nez v0, :cond_0

    .line 23
    .line 24
    iget-boolean v0, p0, Lf72;->k:Z

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    :cond_0
    iget-object p0, p0, Lf72;->p:Lti2;

    .line 29
    .line 30
    iget-boolean p0, p0, Lti2;->F:Z

    .line 31
    .line 32
    if-nez p0, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Lc72;->V(Z)V

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-virtual {v1}, Lc72;->y()Lf13;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    iget-object v0, p0, Lf13;->n:[Ljava/lang/Object;

    .line 42
    .line 43
    iget p0, p0, Lf13;->p:I

    .line 44
    .line 45
    :goto_0
    if-ge v2, p0, :cond_2

    .line 46
    .line 47
    aget-object v1, v0, v2

    .line 48
    .line 49
    check-cast v1, Lc72;

    .line 50
    .line 51
    iget-object v1, v1, Lc72;->R:Lf72;

    .line 52
    .line 53
    iget-object v1, v1, Lf72;->p:Lti2;

    .line 54
    .line 55
    invoke-virtual {v1}, Lti2;->e0()V

    .line 56
    .line 57
    .line 58
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_2
    return-void
.end method

.method public final n()I
    .locals 0

    .line 1
    iget p0, p0, Lti2;->v:I

    .line 2
    .line 3
    return p0
.end method

.method public final r(J)Ljg3;
    .locals 5

    .line 1
    iget-object v0, p0, Lti2;->s:Lf72;

    .line 2
    .line 3
    iget-object v1, v0, Lf72;->a:Lc72;

    .line 4
    .line 5
    iget-object v2, v0, Lf72;->a:Lc72;

    .line 6
    .line 7
    iget-object v3, v1, Lc72;->N:La72;

    .line 8
    .line 9
    sget-object v4, La72;->p:La72;

    .line 10
    .line 11
    if-ne v3, v4, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Lc72;->e()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {v2}, Lh12;->A(Lc72;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v0, v0, Lf72;->q:Lif2;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iput-object v4, v0, Lif2;->w:La72;

    .line 28
    .line 29
    invoke-virtual {v0, p1, p2}, Lif2;->r(J)Ljg3;

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {v2}, Lc72;->t()Lc72;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_6

    .line 37
    .line 38
    iget-object v0, v0, Lc72;->R:Lf72;

    .line 39
    .line 40
    iget-object v1, p0, Lti2;->y:La72;

    .line 41
    .line 42
    if-eq v1, v4, :cond_3

    .line 43
    .line 44
    iget-boolean v1, v2, Lc72;->P:Z

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const-string v1, "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"

    .line 50
    .line 51
    invoke-static {v1}, Lcz1;->b(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    :cond_3
    :goto_0
    iget-object v1, v0, Lf72;->d:Ly62;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_5

    .line 61
    .line 62
    const/4 v2, 0x2

    .line 63
    if-ne v1, v2, :cond_4

    .line 64
    .line 65
    sget-object v0, La72;->o:La72;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    iget-object p0, v0, Lf72;->d:Ly62;

    .line 69
    .line 70
    const-string p1, "Measurable could be only measured from the parent\'s measure or layout block. Parents state is "

    .line 71
    .line 72
    invoke-static {p0, p1}, Lnz2;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    return-object p0

    .line 77
    :cond_5
    sget-object v0, La72;->n:La72;

    .line 78
    .line 79
    :goto_1
    iput-object v0, p0, Lti2;->y:La72;

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_6
    iput-object v4, p0, Lti2;->y:La72;

    .line 83
    .line 84
    :goto_2
    invoke-virtual {p0, p1, p2}, Lti2;->d0(J)Z

    .line 85
    .line 86
    .line 87
    return-object p0
.end method

.method public final requestLayout()V
    .locals 1

    .line 1
    iget-object p0, p0, Lti2;->s:Lf72;

    .line 2
    .line 3
    iget-object p0, p0, Lf72;->a:Lc72;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Lc72;->V(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final s(Lx;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lti2;->s:Lf72;

    .line 2
    .line 3
    iget-object p0, p0, Lf72;->a:Lc72;

    .line 4
    .line 5
    invoke-virtual {p0}, Lc72;->y()Lf13;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget-object v0, p0, Lf13;->n:[Ljava/lang/Object;

    .line 10
    .line 11
    iget p0, p0, Lf13;->p:I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-ge v1, p0, :cond_0

    .line 15
    .line 16
    aget-object v2, v0, v1

    .line 17
    .line 18
    check-cast v2, Lc72;

    .line 19
    .line 20
    iget-object v2, v2, Lc72;->R:Lf72;

    .line 21
    .line 22
    iget-object v2, v2, Lf72;->p:Lti2;

    .line 23
    .line 24
    invoke-virtual {p1, v2}, Lx;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method public final t()Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final x(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lti2;->s:Lf72;

    .line 2
    .line 3
    invoke-virtual {v0}, Lf72;->a()Lf63;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-boolean v1, v1, Lcf2;->y:Z

    .line 8
    .line 9
    if-eq p1, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Lf72;->a()Lf63;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-boolean p1, v0, Lcf2;->y:Z

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lti2;->U:Z

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final y()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lti2;->K:Z

    .line 3
    .line 4
    iget-object v0, p0, Lti2;->H:Ld72;

    .line 5
    .line 6
    invoke-virtual {v0}, Ld72;->h()V

    .line 7
    .line 8
    .line 9
    iget-boolean v1, p0, Lti2;->F:Z

    .line 10
    .line 11
    iget-object v2, p0, Lti2;->s:Lf72;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-object v1, v2, Lf72;->a:Lc72;

    .line 17
    .line 18
    invoke-virtual {v1}, Lc72;->y()Lf13;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v4, v1, Lf13;->n:[Ljava/lang/Object;

    .line 23
    .line 24
    iget v1, v1, Lf13;->p:I

    .line 25
    .line 26
    move v5, v3

    .line 27
    :goto_0
    if-ge v5, v1, :cond_1

    .line 28
    .line 29
    aget-object v6, v4, v5

    .line 30
    .line 31
    check-cast v6, Lc72;

    .line 32
    .line 33
    invoke-virtual {v6}, Lc72;->q()Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    if-eqz v7, :cond_0

    .line 38
    .line 39
    invoke-virtual {v6}, Lc72;->r()La72;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    sget-object v8, La72;->n:La72;

    .line 44
    .line 45
    if-ne v7, v8, :cond_0

    .line 46
    .line 47
    invoke-static {v6}, Lc72;->P(Lc72;)Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eqz v6, :cond_0

    .line 52
    .line 53
    iget-object v6, v2, Lf72;->a:Lc72;

    .line 54
    .line 55
    const/4 v7, 0x7

    .line 56
    invoke-static {v6, v3, v7}, Lc72;->W(Lc72;ZI)V

    .line 57
    .line 58
    .line 59
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iget-boolean v1, p0, Lti2;->G:Z

    .line 63
    .line 64
    if-nez v1, :cond_2

    .line 65
    .line 66
    invoke-virtual {p0}, Lti2;->c()Liz1;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-boolean v1, v1, Lcf2;->B:Z

    .line 71
    .line 72
    if-nez v1, :cond_3

    .line 73
    .line 74
    iget-boolean v1, p0, Lti2;->F:Z

    .line 75
    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    :cond_2
    iput-boolean v3, p0, Lti2;->F:Z

    .line 79
    .line 80
    iget-object v1, v2, Lf72;->d:Ly62;

    .line 81
    .line 82
    sget-object v4, Ly62;->p:Ly62;

    .line 83
    .line 84
    iput-object v4, v2, Lf72;->d:Ly62;

    .line 85
    .line 86
    invoke-virtual {v2, v3}, Lf72;->g(Z)V

    .line 87
    .line 88
    .line 89
    iget-object v4, v2, Lf72;->a:Lc72;

    .line 90
    .line 91
    invoke-static {v4}, Lh12;->L(Lc72;)Lub3;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    check-cast v5, Lra;

    .line 96
    .line 97
    invoke-virtual {v5}, Lra;->getSnapshotObserver()Lwb3;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    iget-object v6, v5, Lwb3;->e:Lk52;

    .line 102
    .line 103
    iget-object v5, v5, Lwb3;->a:Lpp3;

    .line 104
    .line 105
    iget-object v7, p0, Lti2;->N:Lsi2;

    .line 106
    .line 107
    invoke-virtual {v5, v4, v6, v7}, Lpp3;->e(Ljava/lang/Object;Lif1;Lgf1;)V

    .line 108
    .line 109
    .line 110
    iput-object v1, v2, Lf72;->d:Ly62;

    .line 111
    .line 112
    iput-boolean v3, p0, Lti2;->G:Z

    .line 113
    .line 114
    :cond_3
    iget-boolean v1, v0, Ld72;->b:Z

    .line 115
    .line 116
    if-eqz v1, :cond_4

    .line 117
    .line 118
    invoke-virtual {v0}, Ld72;->e()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_4

    .line 123
    .line 124
    invoke-virtual {v0}, Ld72;->g()V

    .line 125
    .line 126
    .line 127
    :cond_4
    iput-boolean v3, p0, Lti2;->K:Z

    .line 128
    .line 129
    return-void
.end method
