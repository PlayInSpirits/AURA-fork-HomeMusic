.class public final Liz1;
.super Lf63;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final p0:Lgc;


# instance fields
.field public final n0:Lsq4;

.field public o0:Lhz1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Lfh0;->b()Lgc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-wide v1, Lx40;->d:J

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lgc;->f(J)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lgc;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/graphics/Paint;

    .line 13
    .line 14
    const/high16 v2, 0x3f800000    # 1.0f

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {v0, v1}, Lgc;->h(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Liz1;->p0:Lgc;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Lc72;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lf63;-><init>(Lc72;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lsq4;

    .line 5
    .line 6
    invoke-direct {v0}, Lcx2;-><init>()V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput v1, v0, Lcx2;->q:I

    .line 11
    .line 12
    iput-object v0, p0, Liz1;->n0:Lsq4;

    .line 13
    .line 14
    iput-object p0, v0, Lcx2;->u:Lf63;

    .line 15
    .line 16
    iget-object p1, p1, Lc72;->u:Lc72;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    new-instance p1, Lhz1;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Lef2;-><init>(Lf63;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    :goto_0
    iput-object p1, p0, Liz1;->o0:Lhz1;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final A0()Lcx2;
    .locals 0

    .line 1
    iget-object p0, p0, Liz1;->n0:Lsq4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final H0(Le63;JLfm1;IZ)V
    .locals 11

    .line 1
    iget-object v0, p0, Lf63;->H:Lc72;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Le63;->m(Lc72;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0, p2, p3}, Lf63;->a1(J)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    move/from16 v9, p5

    .line 18
    .line 19
    move/from16 v10, p6

    .line 20
    .line 21
    :goto_0
    move v3, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    move/from16 v9, p5

    .line 24
    .line 25
    if-ne v9, v2, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Lf63;->z0()J

    .line 28
    .line 29
    .line 30
    move-result-wide v4

    .line 31
    invoke-virtual {p0, p2, p3, v4, v5}, Lf63;->s0(JJ)F

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    const v1, 0x7fffffff

    .line 40
    .line 41
    .line 42
    and-int/2addr p0, v1

    .line 43
    const/high16 v1, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 44
    .line 45
    if-ge p0, v1, :cond_2

    .line 46
    .line 47
    move v10, v3

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move/from16 v9, p5

    .line 50
    .line 51
    :cond_2
    move/from16 v10, p6

    .line 52
    .line 53
    :goto_1
    if-eqz v3, :cond_5

    .line 54
    .line 55
    iget p0, p4, Lfm1;->p:I

    .line 56
    .line 57
    invoke-virtual {v0}, Lc72;->x()Lf13;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v1, v0, Lf13;->n:[Ljava/lang/Object;

    .line 62
    .line 63
    iget v0, v0, Lf13;->p:I

    .line 64
    .line 65
    sub-int/2addr v0, v2

    .line 66
    :goto_2
    if-ltz v0, :cond_4

    .line 67
    .line 68
    aget-object v2, v1, v0

    .line 69
    .line 70
    move-object v5, v2

    .line 71
    check-cast v5, Lc72;

    .line 72
    .line 73
    invoke-virtual {v5}, Lc72;->H()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_3

    .line 78
    .line 79
    move-object v4, p1

    .line 80
    move-wide v6, p2

    .line 81
    move-object v8, p4

    .line 82
    invoke-interface/range {v4 .. v10}, Le63;->i(Lc72;JLfm1;IZ)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p4}, Lfm1;->a()J

    .line 86
    .line 87
    .line 88
    move-result-wide v2

    .line 89
    invoke-static {v2, v3}, Lg12;->u(J)F

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    const/4 v7, 0x0

    .line 94
    cmpg-float v6, v6, v7

    .line 95
    .line 96
    if-gez v6, :cond_3

    .line 97
    .line 98
    invoke-static {v2, v3}, Lg12;->E(J)Z

    .line 99
    .line 100
    .line 101
    move-result v6

    .line 102
    if-eqz v6, :cond_3

    .line 103
    .line 104
    invoke-static {v2, v3}, Lg12;->D(J)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-nez v2, :cond_3

    .line 109
    .line 110
    invoke-interface {p1, p4, v5}, Le63;->k(Lfm1;Lc72;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_4

    .line 115
    .line 116
    :cond_3
    add-int/lit8 v0, v0, -0x1

    .line 117
    .line 118
    move/from16 v9, p5

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_4
    iput p0, p4, Lfm1;->p:I

    .line 122
    .line 123
    :cond_5
    return-void
.end method

.method public final N(JFLif1;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lf63;->S0(JFLif1;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lcf2;->A:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object p0, p0, Lf63;->H:Lc72;

    .line 10
    .line 11
    iget-object p0, p0, Lc72;->R:Lf72;

    .line 12
    .line 13
    iget-object p0, p0, Lf72;->p:Lti2;

    .line 14
    .line 15
    invoke-virtual {p0}, Lti2;->b0()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final R0(Ljz;Lsj1;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lf63;->H:Lc72;

    .line 2
    .line 3
    invoke-static {v0}, Lh12;->L(Lc72;)Lub3;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0}, Lc72;->x()Lf13;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v2, v0, Lf13;->n:[Ljava/lang/Object;

    .line 12
    .line 13
    iget v0, v0, Lf13;->p:I

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    :goto_0
    if-ge v3, v0, :cond_1

    .line 17
    .line 18
    aget-object v4, v2, v3

    .line 19
    .line 20
    check-cast v4, Lc72;

    .line 21
    .line 22
    invoke-virtual {v4}, Lc72;->H()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    invoke-virtual {v4, p1, p2}, Lc72;->i(Ljz;Lsj1;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    check-cast v1, Lra;

    .line 35
    .line 36
    invoke-virtual {v1}, Lra;->getShowLayoutBounds()Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_2

    .line 41
    .line 42
    iget-wide v0, p0, Ljg3;->p:J

    .line 43
    .line 44
    const/16 p0, 0x20

    .line 45
    .line 46
    shr-long v2, v0, p0

    .line 47
    .line 48
    long-to-int p0, v2

    .line 49
    int-to-float p0, p0

    .line 50
    const/high16 p2, 0x3f000000    # 0.5f

    .line 51
    .line 52
    sub-float v5, p0, p2

    .line 53
    .line 54
    const-wide v2, 0xffffffffL

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    and-long/2addr v0, v2

    .line 60
    long-to-int p0, v0

    .line 61
    int-to-float p0, p0

    .line 62
    sub-float v6, p0, p2

    .line 63
    .line 64
    const/high16 v3, 0x3f000000    # 0.5f

    .line 65
    .line 66
    const/high16 v4, 0x3f000000    # 0.5f

    .line 67
    .line 68
    sget-object v7, Liz1;->p0:Lgc;

    .line 69
    .line 70
    move-object v2, p1

    .line 71
    invoke-interface/range {v2 .. v7}, Ljz;->g(FFFFLgc;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    return-void
.end method

.method public final X(Lpp1;)I
    .locals 4

    .line 1
    iget-object v0, p0, Liz1;->o0:Lhz1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lhz1;->X(Lpp1;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    iget-object p0, p0, Lf63;->H:Lc72;

    .line 11
    .line 12
    iget-object p0, p0, Lc72;->R:Lf72;

    .line 13
    .line 14
    iget-object p0, p0, Lf72;->p:Lti2;

    .line 15
    .line 16
    iget-object v0, p0, Lti2;->s:Lf72;

    .line 17
    .line 18
    iget-object v0, v0, Lf72;->d:Ly62;

    .line 19
    .line 20
    iget-object v1, p0, Lti2;->H:Ld72;

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    sget-object v3, Ly62;->n:Ly62;

    .line 24
    .line 25
    if-ne v0, v3, :cond_1

    .line 26
    .line 27
    iput-boolean v2, v1, Ld72;->d:Z

    .line 28
    .line 29
    iget-boolean v0, v1, Ld72;->b:Z

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iput-boolean v2, p0, Lti2;->F:Z

    .line 34
    .line 35
    iput-boolean v2, p0, Lti2;->G:Z

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iput-boolean v2, v1, Ld72;->e:Z

    .line 39
    .line 40
    :cond_2
    :goto_0
    invoke-virtual {p0}, Lti2;->c()Liz1;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-boolean v3, v0, Lcf2;->B:Z

    .line 45
    .line 46
    iput-boolean v2, v0, Lcf2;->B:Z

    .line 47
    .line 48
    invoke-virtual {p0}, Lti2;->y()V

    .line 49
    .line 50
    .line 51
    iput-boolean v3, v0, Lcf2;->B:Z

    .line 52
    .line 53
    iget-object p0, v1, Ld72;->g:Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    check-cast p0, Ljava/lang/Integer;

    .line 60
    .line 61
    if-eqz p0, :cond_3

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    return p0

    .line 68
    :cond_3
    const/high16 p0, -0x80000000

    .line 69
    .line 70
    return p0
.end method

.method public final r(J)Ljg3;
    .locals 6

    .line 1
    invoke-virtual {p0, p1, p2}, Ljg3;->R(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lf63;->H:Lc72;

    .line 5
    .line 6
    invoke-virtual {v0}, Lc72;->y()Lf13;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v2, v1, Lf13;->n:[Ljava/lang/Object;

    .line 11
    .line 12
    iget v1, v1, Lf13;->p:I

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    :goto_0
    if-ge v3, v1, :cond_0

    .line 16
    .line 17
    aget-object v4, v2, v3

    .line 18
    .line 19
    check-cast v4, Lc72;

    .line 20
    .line 21
    iget-object v4, v4, Lc72;->R:Lf72;

    .line 22
    .line 23
    iget-object v4, v4, Lf72;->p:Lti2;

    .line 24
    .line 25
    sget-object v5, La72;->p:La72;

    .line 26
    .line 27
    iput-object v5, v4, Lti2;->y:La72;

    .line 28
    .line 29
    add-int/lit8 v3, v3, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object v1, v0, Lc72;->I:Lui2;

    .line 33
    .line 34
    iget-object v0, v0, Lc72;->R:Lf72;

    .line 35
    .line 36
    iget-object v0, v0, Lf72;->p:Lti2;

    .line 37
    .line 38
    invoke-virtual {v0}, Lti2;->S()Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v1, p0, v0, p1, p2}, Lui2;->a(Lcf2;Ljava/util/List;J)Lvi2;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p0, p1}, Lf63;->V0(Lvi2;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lf63;->M0()V

    .line 50
    .line 51
    .line 52
    return-object p0
.end method

.method public final v0()V
    .locals 1

    .line 1
    iget-object v0, p0, Liz1;->o0:Lhz1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lhz1;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lef2;-><init>(Lf63;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Liz1;->o0:Lhz1;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final y0()Lef2;
    .locals 0

    .line 1
    iget-object p0, p0, Liz1;->o0:Lhz1;

    .line 2
    .line 3
    return-object p0
.end method
