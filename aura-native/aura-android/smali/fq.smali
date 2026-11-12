.class public abstract Lfq;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lqi3;


# instance fields
.field public final b:Lbu4;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lbu4;

    .line 5
    .line 6
    invoke-direct {v0}, Lbu4;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lfq;->b:Lbu4;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final A()V
    .locals 1

    .line 1
    const/4 v0, 0x6

    .line 2
    invoke-virtual {p0, v0}, Lfq;->Y0(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final B0(Lgn2;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Lqi3;->L0(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final C()V
    .locals 6

    .line 1
    invoke-interface {p0}, Lqi3;->o0()I

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/4 v2, 0x4

    .line 12
    move-object v0, p0

    .line 13
    invoke-virtual/range {v0 .. v5}, Lfq;->X0(IIJZ)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final H0()V
    .locals 7

    .line 1
    invoke-interface {p0}, Lqi3;->x0()Lcu4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/16 v3, 0x9

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Lqi3;->k()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    :cond_0
    move-object v1, p0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {p0}, Lfq;->f0()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_4

    .line 26
    .line 27
    invoke-virtual {p0}, Lfq;->j0()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    const/4 v0, -0x1

    .line 32
    if-ne v2, v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, v3}, Lfq;->W0(I)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    invoke-interface {p0}, Lqi3;->o0()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-ne v2, v0, :cond_3

    .line 43
    .line 44
    invoke-interface {p0}, Lqi3;->o0()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    const/4 v6, 0x1

    .line 54
    move-object v1, p0

    .line 55
    invoke-virtual/range {v1 .. v6}, Lfq;->X0(IIJZ)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_3
    move-object v1, p0

    .line 60
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    const/4 v6, 0x0

    .line 66
    invoke-virtual/range {v1 .. v6}, Lfq;->X0(IIJZ)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_4
    move-object v1, p0

    .line 71
    invoke-virtual {v1}, Lfq;->V0()Z

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-eqz p0, :cond_5

    .line 76
    .line 77
    invoke-virtual {v1}, Lfq;->T0()Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_5

    .line 82
    .line 83
    invoke-interface {v1}, Lqi3;->o0()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    const/4 v6, 0x0

    .line 93
    invoke-virtual/range {v1 .. v6}, Lfq;->X0(IIJZ)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_5
    invoke-virtual {v1, v3}, Lfq;->W0(I)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :goto_0
    invoke-virtual {v1, v3}, Lfq;->W0(I)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public final I()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lfq;->w()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, -0x1

    .line 6
    if-eq p0, v0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public final I0()V
    .locals 10

    .line 1
    invoke-interface {p0}, Lqi3;->X()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-interface {p0}, Lqi3;->M0()J

    .line 6
    .line 7
    .line 8
    move-result-wide v2

    .line 9
    add-long/2addr v2, v0

    .line 10
    invoke-interface {p0}, Lqi3;->getDuration()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    cmp-long v4, v0, v4

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 24
    .line 25
    .line 26
    move-result-wide v2

    .line 27
    :cond_0
    const-wide/16 v0, 0x0

    .line 28
    .line 29
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 30
    .line 31
    .line 32
    move-result-wide v7

    .line 33
    invoke-interface {p0}, Lqi3;->o0()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    const/4 v9, 0x0

    .line 38
    const/16 v6, 0xc

    .line 39
    .line 40
    move-object v4, p0

    .line 41
    invoke-virtual/range {v4 .. v9}, Lfq;->X0(IIJZ)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final J0()V
    .locals 10

    .line 1
    invoke-interface {p0}, Lqi3;->O0()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    neg-long v0, v0

    .line 6
    invoke-interface {p0}, Lqi3;->M0()J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    add-long/2addr v2, v0

    .line 11
    invoke-interface {p0}, Lqi3;->getDuration()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmp-long v4, v0, v4

    .line 21
    .line 22
    if-eqz v4, :cond_0

    .line 23
    .line 24
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    :cond_0
    const-wide/16 v0, 0x0

    .line 29
    .line 30
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 31
    .line 32
    .line 33
    move-result-wide v7

    .line 34
    invoke-interface {p0}, Lqi3;->o0()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    const/4 v9, 0x0

    .line 39
    const/16 v6, 0xb

    .line 40
    .line 41
    move-object v4, p0

    .line 42
    invoke-virtual/range {v4 .. v9}, Lfq;->X0(IIJZ)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final N(I)V
    .locals 1

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-interface {p0, p1, v0}, Lqi3;->P(II)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final O(J)V
    .locals 6

    .line 1
    invoke-interface {p0}, Lqi3;->o0()I

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v2, 0x5

    .line 7
    move-object v0, p0

    .line 8
    move-wide v3, p1

    .line 9
    invoke-virtual/range {v0 .. v5}, Lfq;->X0(IIJZ)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final P0()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final Q0()I
    .locals 0

    .line 1
    invoke-interface {p0}, Lqi3;->x0()Lcu4;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lcu4;->o()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final R0()Z
    .locals 4

    .line 1
    invoke-interface {p0}, Lqi3;->x0()Lcu4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Lqi3;->o0()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object p0, p0, Lfq;->b:Lbu4;

    .line 16
    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    invoke-virtual {v0, v1, p0, v2, v3}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget-boolean p0, p0, Lbu4;->g:Z

    .line 24
    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public final S()V
    .locals 7

    .line 1
    invoke-interface {p0}, Lqi3;->x0()Lcu4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v3, 0x7

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p0}, Lqi3;->k()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    :cond_0
    move-object v1, p0

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {p0}, Lfq;->I()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p0}, Lfq;->V0()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    invoke-virtual {p0}, Lfq;->R0()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0, v3}, Lfq;->Y0(I)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    invoke-virtual {p0, v3}, Lfq;->W0(I)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :cond_3
    if-eqz v0, :cond_4

    .line 47
    .line 48
    invoke-interface {p0}, Lqi3;->M0()J

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    invoke-interface {p0}, Lqi3;->u()J

    .line 53
    .line 54
    .line 55
    move-result-wide v4

    .line 56
    cmp-long v0, v0, v4

    .line 57
    .line 58
    if-gtz v0, :cond_4

    .line 59
    .line 60
    invoke-virtual {p0, v3}, Lfq;->Y0(I)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_4
    invoke-interface {p0}, Lqi3;->o0()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    const/4 v6, 0x0

    .line 69
    const-wide/16 v4, 0x0

    .line 70
    .line 71
    move-object v1, p0

    .line 72
    invoke-virtual/range {v1 .. v6}, Lfq;->X0(IIJZ)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :goto_0
    invoke-virtual {v1, v3}, Lfq;->W0(I)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final S0(I)Z
    .locals 0

    .line 1
    invoke-interface {p0}, Lqi3;->o()Lmi3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, Lmi3;->a(I)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final T0()Z
    .locals 4

    .line 1
    invoke-interface {p0}, Lqi3;->x0()Lcu4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Lqi3;->o0()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object p0, p0, Lfq;->b:Lbu4;

    .line 16
    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    invoke-virtual {v0, v1, p0, v2, v3}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iget-boolean p0, p0, Lbu4;->h:Z

    .line 24
    .line 25
    if-eqz p0, :cond_0

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    return p0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    return p0
.end method

.method public final V0()Z
    .locals 4

    .line 1
    invoke-interface {p0}, Lqi3;->x0()Lcu4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Lqi3;->o0()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    iget-object p0, p0, Lfq;->b:Lbu4;

    .line 16
    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    invoke-virtual {v0, v1, p0, v2, v3}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0}, Lbu4;->a()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public final W(I)V
    .locals 6

    .line 1
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const/4 v5, 0x0

    .line 7
    const/16 v2, 0xa

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    move v1, p1

    .line 11
    invoke-virtual/range {v0 .. v5}, Lfq;->X0(IIJZ)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final W0(I)V
    .locals 6

    .line 1
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const/4 v5, 0x0

    .line 7
    const/4 v1, -0x1

    .line 8
    move-object v0, p0

    .line 9
    move v2, p1

    .line 10
    invoke-virtual/range {v0 .. v5}, Lfq;->X0(IIJZ)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public abstract X0(IIJZ)V
.end method

.method public final Y(I)Lgn2;
    .locals 3

    .line 1
    invoke-interface {p0}, Lqi3;->x0()Lcu4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object p0, p0, Lfq;->b:Lbu4;

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    invoke-virtual {v0, p1, p0, v1, v2}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object p0, p0, Lbu4;->b:Lgn2;

    .line 14
    .line 15
    return-object p0
.end method

.method public final Y0(I)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lfq;->w()I

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    const/4 v0, -0x1

    .line 6
    if-ne v1, v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lfq;->W0(I)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-interface {p0}, Lqi3;->o0()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-ne v1, v0, :cond_1

    .line 17
    .line 18
    invoke-interface {p0}, Lqi3;->o0()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    const/4 v7, 0x1

    .line 28
    move-object v2, p0

    .line 29
    move v4, p1

    .line 30
    invoke-virtual/range {v2 .. v7}, Lfq;->X0(IIJZ)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    move-object v0, p0

    .line 35
    move v2, p1

    .line 36
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    invoke-virtual/range {v0 .. v5}, Lfq;->X0(IIJZ)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final a()Lgn2;
    .locals 4

    .line 1
    invoke-interface {p0}, Lqi3;->x0()Lcu4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-interface {p0}, Lqi3;->o0()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object p0, p0, Lfq;->b:Lbu4;

    .line 18
    .line 19
    const-wide/16 v2, 0x0

    .line 20
    .line 21
    invoke-virtual {v0, v1, p0, v2, v3}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    iget-object p0, p0, Lbu4;->b:Lgn2;

    .line 26
    .line 27
    return-object p0
.end method

.method public final c()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p0, v0}, Lqi3;->V(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final c0()V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lfq;->j0()I

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    const/4 v0, -0x1

    .line 6
    const/16 v2, 0x8

    .line 7
    .line 8
    if-ne v1, v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, v2}, Lfq;->W0(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-interface {p0}, Lqi3;->o0()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-ne v1, v0, :cond_1

    .line 19
    .line 20
    invoke-interface {p0}, Lqi3;->o0()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    const/4 v7, 0x1

    .line 30
    move v4, v2

    .line 31
    move-object v2, p0

    .line 32
    invoke-virtual/range {v2 .. v7}, Lfq;->X0(IIJZ)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    move-object v0, p0

    .line 37
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    const/4 v5, 0x0

    .line 43
    invoke-virtual/range {v0 .. v5}, Lfq;->X0(IIJZ)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final e(F)V
    .locals 2

    .line 1
    invoke-interface {p0}, Lqi3;->i()Lqh3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lqh3;

    .line 6
    .line 7
    iget v0, v0, Lqh3;->b:F

    .line 8
    .line 9
    invoke-direct {v1, p1, v0}, Lqh3;-><init>(FF)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0, v1}, Lqi3;->d(Lqh3;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final f0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lfq;->j0()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, -0x1

    .line 6
    if-eq p0, v0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public final h0()Z
    .locals 2

    .line 1
    invoke-interface {p0}, Lqi3;->g()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x3

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-interface {p0}, Lqi3;->q()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-interface {p0}, Lqi3;->v0()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final j0()I
    .locals 4

    .line 1
    invoke-interface {p0}, Lqi3;->x0()Lcu4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 p0, -0x1

    .line 12
    return p0

    .line 13
    :cond_0
    invoke-interface {p0}, Lqi3;->o0()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-interface {p0}, Lqi3;->h()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x1

    .line 22
    if-ne v2, v3, :cond_1

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    :cond_1
    invoke-interface {p0}, Lqi3;->D0()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-virtual {v0, v1, v2, p0}, Lcu4;->e(IIZ)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0
.end method

.method public final l()J
    .locals 7

    .line 1
    invoke-interface {p0}, Lqi3;->x0()Lcu4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    return-wide v2

    .line 17
    :cond_0
    invoke-interface {p0}, Lqi3;->o0()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const-wide/16 v4, 0x0

    .line 22
    .line 23
    iget-object v6, p0, Lfq;->b:Lbu4;

    .line 24
    .line 25
    invoke-virtual {v0, v1, v6, v4, v5}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-wide v0, v0, Lbu4;->e:J

    .line 30
    .line 31
    cmp-long v0, v0, v2

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    return-wide v2

    .line 36
    :cond_1
    iget-wide v0, v6, Lbu4;->f:J

    .line 37
    .line 38
    invoke-static {v0, v1}, Lf35;->B(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    iget-wide v2, v6, Lbu4;->e:J

    .line 43
    .line 44
    sub-long/2addr v0, v2

    .line 45
    invoke-interface {p0}, Lqi3;->Z()J

    .line 46
    .line 47
    .line 48
    move-result-wide v2

    .line 49
    sub-long/2addr v0, v2

    .line 50
    return-wide v0
.end method

.method public final m0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-interface {p0, v0}, Lqi3;->V(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final n(IJ)V
    .locals 6

    .line 1
    const/16 v2, 0xa

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v0, p0

    .line 5
    move v1, p1

    .line 6
    move-wide v3, p2

    .line 7
    invoke-virtual/range {v0 .. v5}, Lfq;->X0(IIJZ)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final p(Lgn2;J)V
    .locals 1

    .line 1
    invoke-static {p1}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-interface {p0, p1, v0, p2, p3}, Lqi3;->T(Ljava/util/List;IJ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final r()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const v1, 0x7fffffff

    .line 3
    .line 4
    .line 5
    invoke-interface {p0, v0, v1}, Lqi3;->P(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final s0(Lgn2;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p0, p1}, Lqi3;->L0(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final t()I
    .locals 8

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lfq;->S0(I)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-interface {p0}, Lqi3;->b0()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    invoke-interface {p0}, Lqi3;->getDuration()J

    .line 16
    .line 17
    .line 18
    move-result-wide v4

    .line 19
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    cmp-long p0, v2, v6

    .line 25
    .line 26
    if-eqz p0, :cond_3

    .line 27
    .line 28
    cmp-long p0, v4, v6

    .line 29
    .line 30
    if-nez p0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const-wide/16 v6, 0x0

    .line 34
    .line 35
    cmp-long p0, v4, v6

    .line 36
    .line 37
    const/16 v0, 0x64

    .line 38
    .line 39
    if-nez p0, :cond_2

    .line 40
    .line 41
    return v0

    .line 42
    :cond_2
    invoke-static {v2, v3, v4, v5}, Lf35;->V(JJ)I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-static {p0, v1, v0}, Lf35;->j(III)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    return p0

    .line 51
    :cond_3
    :goto_0
    return v1
.end method

.method public final t0(II)V
    .locals 1

    .line 1
    if-eq p1, p2, :cond_0

    .line 2
    .line 3
    add-int/lit8 v0, p1, 0x1

    .line 4
    .line 5
    invoke-interface {p0, p1, v0, p2}, Lqi3;->u0(III)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final w()I
    .locals 4

    .line 1
    invoke-interface {p0}, Lqi3;->x0()Lcu4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 p0, -0x1

    .line 12
    return p0

    .line 13
    :cond_0
    invoke-interface {p0}, Lqi3;->o0()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-interface {p0}, Lqi3;->h()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x1

    .line 22
    if-ne v2, v3, :cond_1

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    :cond_1
    invoke-interface {p0}, Lqi3;->D0()Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-virtual {v0, v1, v2, p0}, Lcu4;->k(IIZ)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0
.end method

.method public final w0(Ljava/util/List;)V
    .locals 1

    .line 1
    const v0, 0x7fffffff

    .line 2
    .line 3
    .line 4
    invoke-interface {p0, p1, v0}, Lqi3;->N0(Ljava/util/List;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final x()J
    .locals 4

    .line 1
    invoke-interface {p0}, Lqi3;->x0()Lcu4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcu4;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    return-wide v0

    .line 17
    :cond_0
    invoke-interface {p0}, Lqi3;->o0()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object p0, p0, Lfq;->b:Lbu4;

    .line 22
    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    invoke-virtual {v0, v1, p0, v2, v3}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    iget-wide v0, p0, Lbu4;->l:J

    .line 30
    .line 31
    invoke-static {v0, v1}, Lf35;->i0(J)J

    .line 32
    .line 33
    .line 34
    move-result-wide v0

    .line 35
    return-wide v0
.end method

.method public final z0(ILgn2;)V
    .locals 1

    .line 1
    add-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    invoke-static {p2}, Lyw1;->o(Ljava/lang/Object;)Lgy3;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-interface {p0, p1, v0, p2}, Lqi3;->L(IILjava/util/List;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
