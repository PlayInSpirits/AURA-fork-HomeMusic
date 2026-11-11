.class public abstract Lf63;
.super Lcf2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lpi2;
.implements Lq62;


# static fields
.field public static final h0:Lk52;

.field public static final i0:Lk52;

.field public static final j0:Lb24;

.field public static final k0:Ln62;

.field public static final l0:Ld63;

.field public static final m0:Ltv1;


# instance fields
.field public final H:Lc72;

.field public I:Lf63;

.field public J:Lf63;

.field public K:Z

.field public L:Z

.field public M:Lif1;

.field public N:Loo0;

.field public O:Lr62;

.field public P:F

.field public Q:Lvi2;

.field public R:Lp03;

.field public S:J

.field public T:F

.field public U:Lv03;

.field public V:Ln62;

.field public W:Lac4;

.field public X:Lwv3;

.field public Y:Lwv3;

.field public Z:Z

.field public a0:Z

.field public b0:Lsj1;

.field public c0:Ljz;

.field public d0:Lib;

.field public final e0:Lc63;

.field public f0:Z

.field public g0:Ltb3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lk52;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lk52;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lf63;->h0:Lk52;

    .line 9
    .line 10
    new-instance v0, Lk52;

    .line 11
    .line 12
    const/16 v1, 0xe

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lk52;-><init>(I)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lf63;->i0:Lk52;

    .line 18
    .line 19
    new-instance v0, Lb24;

    .line 20
    .line 21
    invoke-direct {v0}, Lb24;-><init>()V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lf63;->j0:Lb24;

    .line 25
    .line 26
    new-instance v0, Ln62;

    .line 27
    .line 28
    invoke-direct {v0}, Ln62;-><init>()V

    .line 29
    .line 30
    .line 31
    sput-object v0, Lf63;->k0:Ln62;

    .line 32
    .line 33
    new-instance v0, Ld63;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lf63;->l0:Ld63;

    .line 39
    .line 40
    new-instance v0, Ltv1;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lf63;->m0:Ltv1;

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>(Lc72;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcf2;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf63;->H:Lc72;

    .line 5
    .line 6
    iget-object v0, p1, Lc72;->J:Loo0;

    .line 7
    .line 8
    iput-object v0, p0, Lf63;->N:Loo0;

    .line 9
    .line 10
    iget-object p1, p1, Lc72;->K:Lr62;

    .line 11
    .line 12
    iput-object p1, p0, Lf63;->O:Lr62;

    .line 13
    .line 14
    const p1, 0x3f4ccccd    # 0.8f

    .line 15
    .line 16
    .line 17
    iput p1, p0, Lf63;->P:F

    .line 18
    .line 19
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    iput-wide v0, p0, Lf63;->S:J

    .line 22
    .line 23
    sget-object p1, Lkb4;->b:Lsp1;

    .line 24
    .line 25
    iput-object p1, p0, Lf63;->W:Lac4;

    .line 26
    .line 27
    sget-object p1, Lwv3;->e:Lwv3;

    .line 28
    .line 29
    iput-object p1, p0, Lf63;->X:Lwv3;

    .line 30
    .line 31
    iput-object p1, p0, Lf63;->Y:Lwv3;

    .line 32
    .line 33
    new-instance p1, Lc63;

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    invoke-direct {p1, p0, v0}, Lc63;-><init>(Lf63;I)V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lf63;->e0:Lc63;

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final A(Lq62;J)J
    .locals 3

    .line 1
    instance-of v0, p1, Lff2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lff2;

    .line 6
    .line 7
    iget-object v0, p1, Lff2;->n:Lef2;

    .line 8
    .line 9
    iget-object v0, v0, Lef2;->H:Lf63;

    .line 10
    .line 11
    invoke-virtual {v0}, Lf63;->L0()V

    .line 12
    .line 13
    .line 14
    const-wide v0, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    xor-long/2addr p2, v0

    .line 20
    invoke-virtual {p1, p0, p2, p3}, Lff2;->A(Lq62;J)J

    .line 21
    .line 22
    .line 23
    move-result-wide p0

    .line 24
    xor-long/2addr p0, v0

    .line 25
    return-wide p0

    .line 26
    :cond_0
    if-eqz v0, :cond_1

    .line 27
    .line 28
    move-object v0, p1

    .line 29
    check-cast v0, Lff2;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v0, 0x0

    .line 33
    :goto_0
    if-eqz v0, :cond_2

    .line 34
    .line 35
    iget-object v0, v0, Lff2;->n:Lef2;

    .line 36
    .line 37
    iget-object v0, v0, Lef2;->H:Lf63;

    .line 38
    .line 39
    if-nez v0, :cond_3

    .line 40
    .line 41
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-object v0, p1

    .line 45
    check-cast v0, Lf63;

    .line 46
    .line 47
    :cond_3
    invoke-virtual {v0}, Lf63;->L0()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lf63;->w0(Lf63;)Lf63;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    :goto_1
    if-eq v0, p1, :cond_6

    .line 55
    .line 56
    iget-object v1, v0, Lf63;->g0:Ltb3;

    .line 57
    .line 58
    if-eqz v1, :cond_5

    .line 59
    .line 60
    check-cast v1, Lvj1;

    .line 61
    .line 62
    invoke-virtual {v1}, Lvj1;->b()[F

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    iget-boolean v1, v1, Lvj1;->F:Z

    .line 67
    .line 68
    if-eqz v1, :cond_4

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_4
    invoke-static {p2, p3, v2}, Lya4;->A(J[F)J

    .line 72
    .line 73
    .line 74
    move-result-wide p2

    .line 75
    :cond_5
    :goto_2
    iget-wide v1, v0, Lf63;->S:J

    .line 76
    .line 77
    invoke-static {p2, p3, v1, v2}, Lji2;->z(JJ)J

    .line 78
    .line 79
    .line 80
    move-result-wide p2

    .line 81
    iget-object v0, v0, Lf63;->J:Lf63;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_6
    invoke-virtual {p0, p1, p2, p3}, Lf63;->q0(Lf63;J)J

    .line 88
    .line 89
    .line 90
    move-result-wide p0

    .line 91
    return-wide p0
.end method

.method public abstract A0()Lcx2;
.end method

.method public final B0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf63;->Z:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lf63;->X:Lwv3;

    .line 6
    .line 7
    invoke-virtual {p0}, Lwv3;->d()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public final C(Lq62;Z)Lwv3;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lf63;->A0()Lcx2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lcx2;->A:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-interface {p1}, Lq62;->f()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v1, "LayoutCoordinates "

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, " is not attached!"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    instance-of v0, p1, Lff2;

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    move-object v0, p1

    .line 47
    check-cast v0, Lff2;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 v0, 0x0

    .line 51
    :goto_0
    if-eqz v0, :cond_3

    .line 52
    .line 53
    iget-object v0, v0, Lff2;->n:Lef2;

    .line 54
    .line 55
    iget-object v0, v0, Lef2;->H:Lf63;

    .line 56
    .line 57
    if-nez v0, :cond_4

    .line 58
    .line 59
    :cond_3
    move-object v0, p1

    .line 60
    check-cast v0, Lf63;

    .line 61
    .line 62
    :cond_4
    invoke-virtual {v0}, Lf63;->L0()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0, v0}, Lf63;->w0(Lf63;)Lf63;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget-object v2, p0, Lf63;->U:Lv03;

    .line 70
    .line 71
    if-nez v2, :cond_5

    .line 72
    .line 73
    new-instance v2, Lv03;

    .line 74
    .line 75
    invoke-direct {v2}, Lv03;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object v2, p0, Lf63;->U:Lv03;

    .line 79
    .line 80
    :cond_5
    const/4 v3, 0x0

    .line 81
    iput v3, v2, Lv03;->b:F

    .line 82
    .line 83
    iput v3, v2, Lv03;->c:F

    .line 84
    .line 85
    invoke-interface {p1}, Lq62;->k()J

    .line 86
    .line 87
    .line 88
    move-result-wide v3

    .line 89
    const/16 v5, 0x20

    .line 90
    .line 91
    shr-long/2addr v3, v5

    .line 92
    long-to-int v3, v3

    .line 93
    int-to-float v3, v3

    .line 94
    iput v3, v2, Lv03;->d:F

    .line 95
    .line 96
    invoke-interface {p1}, Lq62;->k()J

    .line 97
    .line 98
    .line 99
    move-result-wide v3

    .line 100
    const-wide v5, 0xffffffffL

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    and-long/2addr v3, v5

    .line 106
    long-to-int p1, v3

    .line 107
    int-to-float p1, p1

    .line 108
    iput p1, v2, Lv03;->e:F

    .line 109
    .line 110
    :goto_1
    if-eq v0, v1, :cond_7

    .line 111
    .line 112
    const/4 p1, 0x0

    .line 113
    invoke-virtual {v0, v2, p2, p1}, Lf63;->T0(Lv03;ZZ)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, Lv03;->c()Z

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-eqz p1, :cond_6

    .line 121
    .line 122
    sget-object p0, Lwv3;->e:Lwv3;

    .line 123
    .line 124
    return-object p0

    .line 125
    :cond_6
    iget-object v0, v0, Lf63;->J:Lf63;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    goto :goto_1

    .line 131
    :cond_7
    invoke-virtual {p0, v1, v2, p2}, Lf63;->p0(Lf63;Lv03;Z)V

    .line 132
    .line 133
    .line 134
    new-instance p0, Lwv3;

    .line 135
    .line 136
    iget p1, v2, Lv03;->b:F

    .line 137
    .line 138
    iget p2, v2, Lv03;->c:F

    .line 139
    .line 140
    iget v0, v2, Lv03;->d:F

    .line 141
    .line 142
    iget v1, v2, Lv03;->e:F

    .line 143
    .line 144
    invoke-direct {p0, p1, p2, v0, v1}, Lwv3;-><init>(FFFF)V

    .line 145
    .line 146
    .line 147
    return-object p0
.end method

.method public final C0(I)Lcx2;
    .locals 2

    .line 1
    invoke-static {p1}, Lg63;->f(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lf63;->A0()Lcx2;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v1, v1, Lcx2;->r:Lcx2;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_1
    :goto_0
    invoke-virtual {p0, v0}, Lf63;->D0(Z)Lcx2;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :goto_1
    if-eqz p0, :cond_3

    .line 22
    .line 23
    iget v0, p0, Lcx2;->q:I

    .line 24
    .line 25
    and-int/2addr v0, p1

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    iget v0, p0, Lcx2;->p:I

    .line 29
    .line 30
    and-int/2addr v0, p1

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    if-eq p0, v1, :cond_3

    .line 35
    .line 36
    iget-object p0, p0, Lcx2;->s:Lcx2;

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_3
    :goto_2
    const/4 p0, 0x0

    .line 40
    return-object p0
.end method

.method public final D0(Z)Lcx2;
    .locals 2

    .line 1
    iget-object v0, p0, Lf63;->H:Lc72;

    .line 2
    .line 3
    iget-object v0, v0, Lc72;->Q:Lw12;

    .line 4
    .line 5
    iget-object v1, v0, Lw12;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lf63;

    .line 8
    .line 9
    if-ne v1, p0, :cond_0

    .line 10
    .line 11
    iget-object p0, v0, Lw12;->g:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lcx2;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    iget-object p0, p0, Lf63;->J:Lf63;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0}, Lf63;->A0()Lcx2;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_2

    .line 27
    .line 28
    iget-object p0, p0, Lcx2;->s:Lcx2;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    if-eqz p0, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Lf63;->A0()Lcx2;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    :cond_2
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public final E0(Lcx2;Le63;JLfm1;IZ)V
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-wide v2, p3

    .line 6
    move-object v4, p5

    .line 7
    move v5, p6

    .line 8
    move v6, p7

    .line 9
    invoke-virtual/range {v0 .. v6}, Lf63;->H0(Le63;JLfm1;IZ)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-interface {p2, p1}, Le63;->f(Lcx2;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-interface {p2}, Le63;->d()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-static {p1, v0}, Lfh0;->c(Leo0;I)Lcx2;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual/range {p0 .. p7}, Lf63;->E0(Lcx2;Le63;JLfm1;IZ)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    iget v0, p5, Lfm1;->p:I

    .line 32
    .line 33
    iget-object v1, p5, Lfm1;->n:Lq03;

    .line 34
    .line 35
    add-int/lit8 v2, v0, 0x1

    .line 36
    .line 37
    iget v3, v1, Lq03;->b:I

    .line 38
    .line 39
    invoke-virtual {p5, v2, v3}, Lfm1;->b(II)V

    .line 40
    .line 41
    .line 42
    iget v2, p5, Lfm1;->p:I

    .line 43
    .line 44
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    iput v2, p5, Lfm1;->p:I

    .line 47
    .line 48
    invoke-virtual {v1, p1}, Lq03;->a(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p5, Lfm1;->o:Ll03;

    .line 52
    .line 53
    const/high16 v2, -0x40800000    # -1.0f

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    invoke-static {v2, p7, v3}, Lrr2;->c(FZZ)J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    invoke-virtual {v1, v2, v3}, Ll03;->a(J)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p2}, Le63;->d()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-static {p1, v1}, Lfh0;->c(Leo0;I)Lcx2;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual/range {p0 .. p7}, Lf63;->E0(Lcx2;Le63;JLfm1;IZ)V

    .line 72
    .line 73
    .line 74
    iput v0, p5, Lfm1;->p:I

    .line 75
    .line 76
    return-void
.end method

.method public final F0(Lcx2;Le63;JLfm1;IZF)V
    .locals 11

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    move-object v1, p2

    .line 5
    move-wide v2, p3

    .line 6
    move-object/from16 v4, p5

    .line 7
    .line 8
    move/from16 v5, p6

    .line 9
    .line 10
    move/from16 v6, p7

    .line 11
    .line 12
    invoke-virtual/range {v0 .. v6}, Lf63;->H0(Le63;JLfm1;IZ)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-interface {p2, p1}, Le63;->f(Lcx2;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p2}, Le63;->d()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-static {p1, v0}, Lfh0;->c(Leo0;I)Lcx2;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    move-object v0, p0

    .line 31
    move-object v2, p2

    .line 32
    move-wide v3, p3

    .line 33
    move-object/from16 v5, p5

    .line 34
    .line 35
    move/from16 v6, p6

    .line 36
    .line 37
    move/from16 v7, p7

    .line 38
    .line 39
    move/from16 v8, p8

    .line 40
    .line 41
    invoke-virtual/range {v0 .. v8}, Lf63;->F0(Lcx2;Le63;JLfm1;IZF)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    move-object/from16 v5, p5

    .line 46
    .line 47
    iget v10, v5, Lfm1;->p:I

    .line 48
    .line 49
    iget-object v0, v5, Lfm1;->n:Lq03;

    .line 50
    .line 51
    add-int/lit8 v1, v10, 0x1

    .line 52
    .line 53
    iget v2, v0, Lq03;->b:I

    .line 54
    .line 55
    invoke-virtual {v5, v1, v2}, Lfm1;->b(II)V

    .line 56
    .line 57
    .line 58
    iget v1, v5, Lfm1;->p:I

    .line 59
    .line 60
    add-int/lit8 v1, v1, 0x1

    .line 61
    .line 62
    iput v1, v5, Lfm1;->p:I

    .line 63
    .line 64
    invoke-virtual {v0, p1}, Lq03;->a(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object v0, v5, Lfm1;->o:Ll03;

    .line 68
    .line 69
    const/4 v1, 0x0

    .line 70
    move/from16 v7, p7

    .line 71
    .line 72
    move/from16 v8, p8

    .line 73
    .line 74
    invoke-static {v8, v7, v1}, Lrr2;->c(FZZ)J

    .line 75
    .line 76
    .line 77
    move-result-wide v1

    .line 78
    invoke-virtual {v0, v1, v2}, Ll03;->a(J)V

    .line 79
    .line 80
    .line 81
    invoke-interface {p2}, Le63;->d()I

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    invoke-static {p1, v0}, Lfh0;->c(Leo0;I)Lcx2;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    const/4 v9, 0x1

    .line 90
    move-object v0, p0

    .line 91
    move-object v2, p2

    .line 92
    move-wide v3, p3

    .line 93
    move/from16 v6, p6

    .line 94
    .line 95
    invoke-virtual/range {v0 .. v9}, Lf63;->Q0(Lcx2;Le63;JLfm1;IZFZ)V

    .line 96
    .line 97
    .line 98
    iput v10, v5, Lfm1;->p:I

    .line 99
    .line 100
    return-void
.end method

.method public final G0(Le63;JLfm1;IZ)V
    .locals 14

    .line 1
    move-wide/from16 v3, p2

    .line 2
    .line 3
    move-object/from16 v5, p4

    .line 4
    .line 5
    move/from16 v6, p5

    .line 6
    .line 7
    invoke-interface {p1}, Le63;->d()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0, v0}, Lf63;->C0(I)Lcx2;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0, v3, v4}, Lf63;->a1(J)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v8, 0x0

    .line 20
    const/high16 v9, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 21
    .line 22
    const v10, 0x7fffffff

    .line 23
    .line 24
    .line 25
    const/4 v11, 0x1

    .line 26
    if-nez v0, :cond_2

    .line 27
    .line 28
    if-ne v6, v11, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Lf63;->z0()J

    .line 31
    .line 32
    .line 33
    move-result-wide v12

    .line 34
    invoke-virtual {p0, v3, v4, v12, v13}, Lf63;->s0(JJ)F

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    and-int/2addr v2, v10

    .line 43
    if-ge v2, v9, :cond_1

    .line 44
    .line 45
    iget v2, v5, Lfm1;->p:I

    .line 46
    .line 47
    iget-object v7, v5, Lfm1;->n:Lq03;

    .line 48
    .line 49
    iget v7, v7, Lq03;->b:I

    .line 50
    .line 51
    sub-int/2addr v7, v11

    .line 52
    if-ne v2, v7, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-static {v0, v8, v8}, Lrr2;->c(FZZ)J

    .line 56
    .line 57
    .line 58
    move-result-wide v7

    .line 59
    invoke-virtual {v5}, Lfm1;->a()J

    .line 60
    .line 61
    .line 62
    move-result-wide v9

    .line 63
    invoke-static {v9, v10, v7, v8}, Lg12;->k(JJ)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-lez v2, :cond_1

    .line 68
    .line 69
    :goto_0
    const/4 v7, 0x0

    .line 70
    move-object v2, p1

    .line 71
    move v8, v0

    .line 72
    move-object v0, p0

    .line 73
    invoke-virtual/range {v0 .. v8}, Lf63;->F0(Lcx2;Le63;JLfm1;IZF)V

    .line 74
    .line 75
    .line 76
    :cond_1
    return-void

    .line 77
    :cond_2
    if-nez v1, :cond_3

    .line 78
    .line 79
    invoke-virtual/range {p0 .. p6}, Lf63;->H0(Le63;JLfm1;IZ)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_3
    const/16 v0, 0x20

    .line 84
    .line 85
    shr-long v2, p2, v0

    .line 86
    .line 87
    long-to-int v0, v2

    .line 88
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    const-wide v2, 0xffffffffL

    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    and-long v2, p2, v2

    .line 98
    .line 99
    long-to-int v2, v2

    .line 100
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    const/4 v3, 0x0

    .line 105
    cmpl-float v4, v0, v3

    .line 106
    .line 107
    if-ltz v4, :cond_4

    .line 108
    .line 109
    cmpl-float v3, v2, v3

    .line 110
    .line 111
    if-ltz v3, :cond_4

    .line 112
    .line 113
    invoke-virtual {p0}, Ljg3;->G()I

    .line 114
    .line 115
    .line 116
    move-result v3

    .line 117
    int-to-float v3, v3

    .line 118
    cmpg-float v0, v0, v3

    .line 119
    .line 120
    if-gez v0, :cond_4

    .line 121
    .line 122
    invoke-virtual {p0}, Ljg3;->F()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    int-to-float v0, v0

    .line 127
    cmpg-float v0, v2, v0

    .line 128
    .line 129
    if-gez v0, :cond_4

    .line 130
    .line 131
    move-object v0, p0

    .line 132
    move-object v2, p1

    .line 133
    move-wide/from16 v3, p2

    .line 134
    .line 135
    move-object/from16 v5, p4

    .line 136
    .line 137
    move/from16 v6, p5

    .line 138
    .line 139
    move/from16 v7, p6

    .line 140
    .line 141
    invoke-virtual/range {v0 .. v7}, Lf63;->E0(Lcx2;Le63;JLfm1;IZ)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_4
    move-wide/from16 v3, p2

    .line 146
    .line 147
    move-object/from16 v5, p4

    .line 148
    .line 149
    move/from16 v6, p5

    .line 150
    .line 151
    if-ne v6, v11, :cond_5

    .line 152
    .line 153
    invoke-virtual {p0}, Lf63;->z0()J

    .line 154
    .line 155
    .line 156
    move-result-wide v12

    .line 157
    invoke-virtual {p0, v3, v4, v12, v13}, Lf63;->s0(JJ)F

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    goto :goto_1

    .line 162
    :cond_5
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 163
    .line 164
    :goto_1
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 165
    .line 166
    .line 167
    move-result v7

    .line 168
    and-int/2addr v7, v10

    .line 169
    if-ge v7, v9, :cond_7

    .line 170
    .line 171
    iget v7, v5, Lfm1;->p:I

    .line 172
    .line 173
    iget-object v9, v5, Lfm1;->n:Lq03;

    .line 174
    .line 175
    iget v9, v9, Lq03;->b:I

    .line 176
    .line 177
    sub-int/2addr v9, v11

    .line 178
    if-ne v7, v9, :cond_6

    .line 179
    .line 180
    move/from16 v7, p6

    .line 181
    .line 182
    goto :goto_2

    .line 183
    :cond_6
    move/from16 v7, p6

    .line 184
    .line 185
    invoke-static {v2, v7, v8}, Lrr2;->c(FZZ)J

    .line 186
    .line 187
    .line 188
    move-result-wide v9

    .line 189
    invoke-virtual {v5}, Lfm1;->a()J

    .line 190
    .line 191
    .line 192
    move-result-wide v12

    .line 193
    invoke-static {v12, v13, v9, v10}, Lg12;->k(JJ)I

    .line 194
    .line 195
    .line 196
    move-result v9

    .line 197
    if-lez v9, :cond_8

    .line 198
    .line 199
    :goto_2
    move v9, v11

    .line 200
    :goto_3
    move-object v0, p0

    .line 201
    move v8, v2

    .line 202
    move-object v2, p1

    .line 203
    goto :goto_4

    .line 204
    :cond_7
    move/from16 v7, p6

    .line 205
    .line 206
    :cond_8
    move v9, v8

    .line 207
    goto :goto_3

    .line 208
    :goto_4
    invoke-virtual/range {v0 .. v9}, Lf63;->Q0(Lcx2;Le63;JLfm1;IZFZ)V

    .line 209
    .line 210
    .line 211
    return-void
.end method

.method public H0(Le63;JLfm1;IZ)V
    .locals 0

    .line 1
    iget-object p0, p0, Lf63;->I:Lf63;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p2, p3}, Lf63;->x0(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide p2

    .line 9
    invoke-virtual/range {p0 .. p6}, Lf63;->G0(Le63;JLfm1;IZ)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final I0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lf63;->g0:Ltb3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast v0, Lvj1;

    .line 6
    .line 7
    invoke-virtual {v0}, Lvj1;->c()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object p0, p0, Lf63;->J:Lf63;

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lf63;->I0()V

    .line 16
    .line 17
    .line 18
    :cond_1
    return-void
.end method

.method public final J()F
    .locals 0

    .line 1
    iget-object p0, p0, Lf63;->H:Lc72;

    .line 2
    .line 3
    iget-object p0, p0, Lc72;->J:Loo0;

    .line 4
    .line 5
    invoke-interface {p0}, Loo0;->J()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final J0()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lf63;->g0:Ltb3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lf63;->P:F

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    cmpg-float v0, v0, v1

    .line 9
    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    iget-object p0, p0, Lf63;->J:Lf63;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Lf63;->J0()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :cond_1
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final K0(J)J
    .locals 4

    .line 1
    invoke-virtual {p0}, Lf63;->A0()Lcx2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lcx2;->A:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lf63;->L0()V

    .line 15
    .line 16
    .line 17
    :goto_0
    if-eqz p0, :cond_4

    .line 18
    .line 19
    iget-object v0, p0, Lf63;->H:Lc72;

    .line 20
    .line 21
    iget-object v1, v0, Lc72;->Q:Lw12;

    .line 22
    .line 23
    iget-object v1, v1, Lw12;->e:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lf63;

    .line 26
    .line 27
    if-ne p0, v1, :cond_1

    .line 28
    .line 29
    iget-boolean v1, v0, Lc72;->p:Z

    .line 30
    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    invoke-static {v0}, Lh12;->L(Lc72;)Lub3;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Lra;

    .line 38
    .line 39
    invoke-virtual {v1}, Lra;->getRectManager()Lyv3;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1, v0}, Lyv3;->b(Lc72;)J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    const-wide v2, 0x7fffffff7fffffffL

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1, v2, v3}, Lg02;->a(JJ)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_1

    .line 57
    .line 58
    invoke-static {p1, p2, v0, v1}, Lji2;->z(JJ)J

    .line 59
    .line 60
    .line 61
    move-result-wide p0

    .line 62
    return-wide p0

    .line 63
    :cond_1
    iget-object v0, p0, Lf63;->g0:Ltb3;

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    check-cast v0, Lvj1;

    .line 68
    .line 69
    invoke-virtual {v0}, Lvj1;->b()[F

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget-boolean v0, v0, Lvj1;->F:Z

    .line 74
    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_2
    invoke-static {p1, p2, v1}, Lya4;->A(J[F)J

    .line 79
    .line 80
    .line 81
    move-result-wide p1

    .line 82
    :cond_3
    :goto_1
    iget-wide v0, p0, Lf63;->S:J

    .line 83
    .line 84
    invoke-static {p1, p2, v0, v1}, Lji2;->z(JJ)J

    .line 85
    .line 86
    .line 87
    move-result-wide p1

    .line 88
    iget-object p0, p0, Lf63;->J:Lf63;

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    return-wide p1
.end method

.method public final L0()V
    .locals 0

    .line 1
    iget-object p0, p0, Lf63;->H:Lc72;

    .line 2
    .line 3
    iget-object p0, p0, Lc72;->R:Lf72;

    .line 4
    .line 5
    invoke-virtual {p0}, Lf72;->b()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final M0()V
    .locals 13

    .line 1
    const/16 v0, 0x80

    .line 2
    .line 3
    invoke-static {v0}, Lg63;->f(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0, v1}, Lf63;->D0(Z)Lcx2;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_c

    .line 12
    .line 13
    iget-object v2, v2, Lcx2;->n:Lcx2;

    .line 14
    .line 15
    iget v2, v2, Lcx2;->q:I

    .line 16
    .line 17
    and-int/2addr v2, v0

    .line 18
    if-eqz v2, :cond_c

    .line 19
    .line 20
    invoke-static {}, Lya4;->t()Lch4;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v2}, Lch4;->e()Lif1;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object v4, v3

    .line 33
    :goto_0
    invoke-static {v2}, Lya4;->z(Lch4;)Lch4;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    :try_start_0
    invoke-virtual {p0}, Lf63;->A0()Lcx2;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    goto/16 :goto_8

    .line 46
    .line 47
    :cond_1
    invoke-virtual {p0}, Lf63;->A0()Lcx2;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    iget-object v6, v6, Lcx2;->r:Lcx2;

    .line 52
    .line 53
    if-nez v6, :cond_2

    .line 54
    .line 55
    goto/16 :goto_7

    .line 56
    .line 57
    :cond_2
    :goto_1
    invoke-virtual {p0, v1}, Lf63;->D0(Z)Lcx2;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    :goto_2
    if-eqz v1, :cond_b

    .line 62
    .line 63
    iget v7, v1, Lcx2;->q:I

    .line 64
    .line 65
    and-int/2addr v7, v0

    .line 66
    if-eqz v7, :cond_b

    .line 67
    .line 68
    iget v7, v1, Lcx2;->p:I

    .line 69
    .line 70
    and-int/2addr v7, v0

    .line 71
    if-eqz v7, :cond_a

    .line 72
    .line 73
    move-object v7, v1

    .line 74
    move-object v8, v3

    .line 75
    :goto_3
    if-eqz v7, :cond_a

    .line 76
    .line 77
    instance-of v9, v7, Lyi2;

    .line 78
    .line 79
    if-eqz v9, :cond_3

    .line 80
    .line 81
    check-cast v7, Lyi2;

    .line 82
    .line 83
    iget-wide v9, p0, Ljg3;->p:J

    .line 84
    .line 85
    invoke-interface {v7, v9, v10}, Lyi2;->a(J)V

    .line 86
    .line 87
    .line 88
    goto :goto_6

    .line 89
    :cond_3
    iget v9, v7, Lcx2;->p:I

    .line 90
    .line 91
    and-int/2addr v9, v0

    .line 92
    if-eqz v9, :cond_9

    .line 93
    .line 94
    instance-of v9, v7, Lfo0;

    .line 95
    .line 96
    if-eqz v9, :cond_9

    .line 97
    .line 98
    move-object v9, v7

    .line 99
    check-cast v9, Lfo0;

    .line 100
    .line 101
    iget-object v9, v9, Lfo0;->C:Lcx2;

    .line 102
    .line 103
    const/4 v10, 0x0

    .line 104
    :goto_4
    const/4 v11, 0x1

    .line 105
    if-eqz v9, :cond_8

    .line 106
    .line 107
    iget v12, v9, Lcx2;->p:I

    .line 108
    .line 109
    and-int/2addr v12, v0

    .line 110
    if-eqz v12, :cond_7

    .line 111
    .line 112
    add-int/lit8 v10, v10, 0x1

    .line 113
    .line 114
    if-ne v10, v11, :cond_4

    .line 115
    .line 116
    move-object v7, v9

    .line 117
    goto :goto_5

    .line 118
    :cond_4
    if-nez v8, :cond_5

    .line 119
    .line 120
    new-instance v8, Lf13;

    .line 121
    .line 122
    const/16 v11, 0x10

    .line 123
    .line 124
    new-array v11, v11, [Lcx2;

    .line 125
    .line 126
    invoke-direct {v8, v11}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_5
    if-eqz v7, :cond_6

    .line 130
    .line 131
    invoke-virtual {v8, v7}, Lf13;->b(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    move-object v7, v3

    .line 135
    :cond_6
    invoke-virtual {v8, v9}, Lf13;->b(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_7
    :goto_5
    iget-object v9, v9, Lcx2;->s:Lcx2;

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_8
    if-ne v10, v11, :cond_9

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_9
    :goto_6
    invoke-static {v8}, Lj51;->c(Lf13;)Lcx2;

    .line 145
    .line 146
    .line 147
    move-result-object v7

    .line 148
    goto :goto_3

    .line 149
    :cond_a
    if-eq v1, v6, :cond_b

    .line 150
    .line 151
    iget-object v1, v1, Lcx2;->s:Lcx2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_b
    :goto_7
    invoke-static {v2, v5, v4}, Lya4;->H(Lch4;Lch4;Lif1;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :goto_8
    invoke-static {v2, v5, v4}, Lya4;->H(Lch4;Lch4;Lif1;)V

    .line 159
    .line 160
    .line 161
    throw p0

    .line 162
    :cond_c
    return-void
.end method

.method public final N0()V
    .locals 10

    .line 1
    const/high16 v0, 0x400000

    .line 2
    .line 3
    invoke-static {v0}, Lg63;->f(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Lf63;->A0()Lcx2;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v2, v2, Lcx2;->r:Lcx2;

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    goto/16 :goto_6

    .line 19
    .line 20
    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Lf63;->D0(Z)Lcx2;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    :goto_1
    if-eqz v1, :cond_a

    .line 25
    .line 26
    iget v3, v1, Lcx2;->q:I

    .line 27
    .line 28
    and-int/2addr v3, v0

    .line 29
    if-eqz v3, :cond_a

    .line 30
    .line 31
    iget v3, v1, Lcx2;->p:I

    .line 32
    .line 33
    and-int/2addr v3, v0

    .line 34
    if-eqz v3, :cond_9

    .line 35
    .line 36
    const/4 v3, 0x0

    .line 37
    move-object v4, v1

    .line 38
    move-object v5, v3

    .line 39
    :goto_2
    if-eqz v4, :cond_9

    .line 40
    .line 41
    instance-of v6, v4, Lo62;

    .line 42
    .line 43
    if-eqz v6, :cond_2

    .line 44
    .line 45
    check-cast v4, Lo62;

    .line 46
    .line 47
    invoke-interface {v4, p0}, Lo62;->e(Lq62;)V

    .line 48
    .line 49
    .line 50
    goto :goto_5

    .line 51
    :cond_2
    iget v6, v4, Lcx2;->p:I

    .line 52
    .line 53
    and-int/2addr v6, v0

    .line 54
    if-eqz v6, :cond_8

    .line 55
    .line 56
    instance-of v6, v4, Lfo0;

    .line 57
    .line 58
    if-eqz v6, :cond_8

    .line 59
    .line 60
    move-object v6, v4

    .line 61
    check-cast v6, Lfo0;

    .line 62
    .line 63
    iget-object v6, v6, Lfo0;->C:Lcx2;

    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    :goto_3
    const/4 v8, 0x1

    .line 67
    if-eqz v6, :cond_7

    .line 68
    .line 69
    iget v9, v6, Lcx2;->p:I

    .line 70
    .line 71
    and-int/2addr v9, v0

    .line 72
    if-eqz v9, :cond_6

    .line 73
    .line 74
    add-int/lit8 v7, v7, 0x1

    .line 75
    .line 76
    if-ne v7, v8, :cond_3

    .line 77
    .line 78
    move-object v4, v6

    .line 79
    goto :goto_4

    .line 80
    :cond_3
    if-nez v5, :cond_4

    .line 81
    .line 82
    new-instance v5, Lf13;

    .line 83
    .line 84
    const/16 v8, 0x10

    .line 85
    .line 86
    new-array v8, v8, [Lcx2;

    .line 87
    .line 88
    invoke-direct {v5, v8}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    if-eqz v4, :cond_5

    .line 92
    .line 93
    invoke-virtual {v5, v4}, Lf13;->b(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    move-object v4, v3

    .line 97
    :cond_5
    invoke-virtual {v5, v6}, Lf13;->b(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_6
    :goto_4
    iget-object v6, v6, Lcx2;->s:Lcx2;

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_7
    if-ne v7, v8, :cond_8

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_8
    :goto_5
    invoke-static {v5}, Lj51;->c(Lf13;)Lcx2;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    goto :goto_2

    .line 111
    :cond_9
    if-eq v1, v2, :cond_a

    .line 112
    .line 113
    iget-object v1, v1, Lcx2;->s:Lcx2;

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_a
    :goto_6
    return-void
.end method

.method public final O0()V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lf63;->K:Z

    .line 3
    .line 4
    iget-object v0, p0, Lf63;->e0:Lc63;

    .line 5
    .line 6
    invoke-virtual {v0}, Lc63;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lf63;->U0()V

    .line 10
    .line 11
    .line 12
    iget-wide v0, p0, Lf63;->S:J

    .line 13
    .line 14
    const-wide/16 v2, 0x0

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, Lg02;->a(JJ)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lf63;->H:Lc72;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Lc72;->M(Lf63;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final P0()V
    .locals 9

    .line 1
    const/high16 v0, 0x100000

    .line 2
    .line 3
    invoke-static {v0}, Lg63;->f(I)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0, v1}, Lf63;->D0(Z)Lcx2;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-eqz v2, :cond_a

    .line 12
    .line 13
    iget-object v2, v2, Lcx2;->n:Lcx2;

    .line 14
    .line 15
    iget v2, v2, Lcx2;->q:I

    .line 16
    .line 17
    and-int/2addr v2, v0

    .line 18
    if-eqz v2, :cond_a

    .line 19
    .line 20
    invoke-virtual {p0}, Lf63;->A0()Lcx2;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    iget-object v2, v2, Lcx2;->r:Lcx2;

    .line 28
    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    goto/16 :goto_6

    .line 32
    .line 33
    :cond_1
    :goto_0
    invoke-virtual {p0, v1}, Lf63;->D0(Z)Lcx2;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :goto_1
    if-eqz p0, :cond_a

    .line 38
    .line 39
    iget v1, p0, Lcx2;->q:I

    .line 40
    .line 41
    and-int/2addr v1, v0

    .line 42
    if-eqz v1, :cond_a

    .line 43
    .line 44
    iget v1, p0, Lcx2;->p:I

    .line 45
    .line 46
    and-int/2addr v1, v0

    .line 47
    if-eqz v1, :cond_9

    .line 48
    .line 49
    const/4 v1, 0x0

    .line 50
    move-object v3, p0

    .line 51
    move-object v4, v1

    .line 52
    :goto_2
    if-eqz v3, :cond_9

    .line 53
    .line 54
    instance-of v5, v3, Lba1;

    .line 55
    .line 56
    if-eqz v5, :cond_2

    .line 57
    .line 58
    check-cast v3, Lba1;

    .line 59
    .line 60
    goto :goto_5

    .line 61
    :cond_2
    iget v5, v3, Lcx2;->p:I

    .line 62
    .line 63
    and-int/2addr v5, v0

    .line 64
    if-eqz v5, :cond_8

    .line 65
    .line 66
    instance-of v5, v3, Lfo0;

    .line 67
    .line 68
    if-eqz v5, :cond_8

    .line 69
    .line 70
    move-object v5, v3

    .line 71
    check-cast v5, Lfo0;

    .line 72
    .line 73
    iget-object v5, v5, Lfo0;->C:Lcx2;

    .line 74
    .line 75
    const/4 v6, 0x0

    .line 76
    :goto_3
    const/4 v7, 0x1

    .line 77
    if-eqz v5, :cond_7

    .line 78
    .line 79
    iget v8, v5, Lcx2;->p:I

    .line 80
    .line 81
    and-int/2addr v8, v0

    .line 82
    if-eqz v8, :cond_6

    .line 83
    .line 84
    add-int/lit8 v6, v6, 0x1

    .line 85
    .line 86
    if-ne v6, v7, :cond_3

    .line 87
    .line 88
    move-object v3, v5

    .line 89
    goto :goto_4

    .line 90
    :cond_3
    if-nez v4, :cond_4

    .line 91
    .line 92
    new-instance v4, Lf13;

    .line 93
    .line 94
    const/16 v7, 0x10

    .line 95
    .line 96
    new-array v7, v7, [Lcx2;

    .line 97
    .line 98
    invoke-direct {v4, v7}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    :cond_4
    if-eqz v3, :cond_5

    .line 102
    .line 103
    invoke-virtual {v4, v3}, Lf13;->b(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    move-object v3, v1

    .line 107
    :cond_5
    invoke-virtual {v4, v5}, Lf13;->b(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    :cond_6
    :goto_4
    iget-object v5, v5, Lcx2;->s:Lcx2;

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_7
    if-ne v6, v7, :cond_8

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_8
    :goto_5
    invoke-static {v4}, Lj51;->c(Lf13;)Lcx2;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    goto :goto_2

    .line 121
    :cond_9
    if-eq p0, v2, :cond_a

    .line 122
    .line 123
    iget-object p0, p0, Lcx2;->s:Lcx2;

    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_a
    :goto_6
    return-void
.end method

.method public final Q0(Lcx2;Le63;JLfm1;IZFZ)V
    .locals 18

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    move-object/from16 v1, p0

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    move-wide/from16 v3, p3

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    move/from16 v6, p6

    .line 14
    .line 15
    move/from16 v7, p7

    .line 16
    .line 17
    invoke-virtual/range {v1 .. v7}, Lf63;->H0(Le63;JLfm1;IZ)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    move-object/from16 v2, p2

    .line 22
    .line 23
    invoke-interface {v2, v0}, Le63;->f(Lcx2;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    invoke-interface {v2}, Le63;->d()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {v0, v1}, Lfh0;->c(Leo0;I)Lcx2;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    move-object/from16 v0, p0

    .line 38
    .line 39
    move-wide/from16 v3, p3

    .line 40
    .line 41
    move-object/from16 v5, p5

    .line 42
    .line 43
    move/from16 v6, p6

    .line 44
    .line 45
    move/from16 v7, p7

    .line 46
    .line 47
    move/from16 v8, p8

    .line 48
    .line 49
    move/from16 v9, p9

    .line 50
    .line 51
    invoke-virtual/range {v0 .. v9}, Lf63;->Q0(Lcx2;Le63;JLfm1;IZFZ)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    move-object/from16 v5, p5

    .line 56
    .line 57
    move/from16 v6, p6

    .line 58
    .line 59
    move/from16 v7, p7

    .line 60
    .line 61
    const/4 v1, 0x3

    .line 62
    if-ne v6, v1, :cond_2

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    const/4 v2, 0x4

    .line 66
    if-ne v6, v2, :cond_12

    .line 67
    .line 68
    :goto_0
    const/4 v2, 0x0

    .line 69
    move-object v3, v0

    .line 70
    move-object v4, v2

    .line 71
    :goto_1
    if-eqz v3, :cond_12

    .line 72
    .line 73
    instance-of v8, v3, Lrn3;

    .line 74
    .line 75
    const/4 v9, 0x0

    .line 76
    const/4 v10, 0x1

    .line 77
    if-eqz v8, :cond_b

    .line 78
    .line 79
    check-cast v3, Lrn3;

    .line 80
    .line 81
    sget v2, Le35;->o:I

    .line 82
    .line 83
    sget-wide v2, Le35;->n:J

    .line 84
    .line 85
    const/16 v2, 0x20

    .line 86
    .line 87
    shr-long v2, p3, v2

    .line 88
    .line 89
    long-to-int v2, v2

    .line 90
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    move-object/from16 v4, p0

    .line 95
    .line 96
    iget-object v8, v4, Lf63;->H:Lc72;

    .line 97
    .line 98
    iget-object v11, v8, Lc72;->K:Lr62;

    .line 99
    .line 100
    const-wide/high16 v12, -0x8000000000000000L

    .line 101
    .line 102
    and-long v14, v12, v12

    .line 103
    .line 104
    const-wide/16 v16, 0x0

    .line 105
    .line 106
    cmp-long v14, v14, v16

    .line 107
    .line 108
    const/4 v15, 0x2

    .line 109
    sget-object v1, Lr62;->n:Lr62;

    .line 110
    .line 111
    if-eqz v14, :cond_4

    .line 112
    .line 113
    if-ne v11, v1, :cond_3

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_3
    invoke-static {v15, v12, v13}, Lxi4;->i(IJ)I

    .line 117
    .line 118
    .line 119
    move-result v11

    .line 120
    goto :goto_3

    .line 121
    :cond_4
    :goto_2
    invoke-static {v9, v12, v13}, Lxi4;->i(IJ)I

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    :goto_3
    neg-int v11, v11

    .line 126
    int-to-float v11, v11

    .line 127
    cmpl-float v3, v3, v11

    .line 128
    .line 129
    if-ltz v3, :cond_12

    .line 130
    .line 131
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    invoke-virtual {v4}, Ljg3;->G()I

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    iget-object v8, v8, Lc72;->K:Lr62;

    .line 140
    .line 141
    if-eqz v14, :cond_6

    .line 142
    .line 143
    if-ne v8, v1, :cond_5

    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_5
    invoke-static {v9, v12, v13}, Lxi4;->i(IJ)I

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    goto :goto_5

    .line 151
    :cond_6
    :goto_4
    invoke-static {v15, v12, v13}, Lxi4;->i(IJ)I

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    :goto_5
    add-int/2addr v3, v1

    .line 156
    int-to-float v1, v3

    .line 157
    cmpg-float v1, v2, v1

    .line 158
    .line 159
    if-gez v1, :cond_12

    .line 160
    .line 161
    const-wide v1, 0xffffffffL

    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    and-long v1, p3, v1

    .line 167
    .line 168
    long-to-int v1, v1

    .line 169
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    invoke-static {v10, v12, v13}, Lxi4;->i(IJ)I

    .line 174
    .line 175
    .line 176
    move-result v3

    .line 177
    neg-int v3, v3

    .line 178
    int-to-float v3, v3

    .line 179
    cmpl-float v2, v2, v3

    .line 180
    .line 181
    if-ltz v2, :cond_12

    .line 182
    .line 183
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    invoke-virtual {v4}, Ljg3;->F()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    const/4 v8, 0x3

    .line 192
    invoke-static {v8, v12, v13}, Lxi4;->i(IJ)I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    add-int/2addr v3, v2

    .line 197
    int-to-float v2, v3

    .line 198
    cmpg-float v1, v1, v2

    .line 199
    .line 200
    if-gez v1, :cond_12

    .line 201
    .line 202
    iget-object v1, v5, Lfm1;->o:Ll03;

    .line 203
    .line 204
    iget-object v2, v5, Lfm1;->n:Lq03;

    .line 205
    .line 206
    iget v11, v5, Lfm1;->p:I

    .line 207
    .line 208
    iget v3, v2, Lq03;->b:I

    .line 209
    .line 210
    add-int/lit8 v8, v3, -0x1

    .line 211
    .line 212
    const/4 v12, 0x0

    .line 213
    if-ne v11, v8, :cond_7

    .line 214
    .line 215
    add-int/lit8 v8, v11, 0x1

    .line 216
    .line 217
    invoke-virtual {v5, v8, v3}, Lfm1;->b(II)V

    .line 218
    .line 219
    .line 220
    iget v3, v5, Lfm1;->p:I

    .line 221
    .line 222
    add-int/2addr v3, v10

    .line 223
    iput v3, v5, Lfm1;->p:I

    .line 224
    .line 225
    invoke-virtual {v2, v0}, Lq03;->a(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    invoke-static {v12, v7, v10}, Lrr2;->c(FZZ)J

    .line 229
    .line 230
    .line 231
    move-result-wide v2

    .line 232
    invoke-virtual {v1, v2, v3}, Ll03;->a(J)V

    .line 233
    .line 234
    .line 235
    invoke-interface/range {p2 .. p2}, Le63;->d()I

    .line 236
    .line 237
    .line 238
    move-result v1

    .line 239
    invoke-static {v0, v1}, Lfh0;->c(Leo0;I)Lcx2;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    move-object/from16 v2, p2

    .line 244
    .line 245
    move/from16 v8, p8

    .line 246
    .line 247
    move/from16 v9, p9

    .line 248
    .line 249
    move-object v0, v4

    .line 250
    move-wide/from16 v3, p3

    .line 251
    .line 252
    invoke-virtual/range {v0 .. v9}, Lf63;->Q0(Lcx2;Le63;JLfm1;IZFZ)V

    .line 253
    .line 254
    .line 255
    iput v11, v5, Lfm1;->p:I

    .line 256
    .line 257
    return-void

    .line 258
    :cond_7
    invoke-virtual {v5}, Lfm1;->a()J

    .line 259
    .line 260
    .line 261
    move-result-wide v3

    .line 262
    iget v11, v5, Lfm1;->p:I

    .line 263
    .line 264
    invoke-static {v3, v4}, Lg12;->D(J)Z

    .line 265
    .line 266
    .line 267
    move-result v6

    .line 268
    if-eqz v6, :cond_9

    .line 269
    .line 270
    iget v3, v2, Lq03;->b:I

    .line 271
    .line 272
    add-int/lit8 v13, v3, -0x1

    .line 273
    .line 274
    iput v13, v5, Lfm1;->p:I

    .line 275
    .line 276
    iget v4, v2, Lq03;->b:I

    .line 277
    .line 278
    invoke-virtual {v5, v3, v4}, Lfm1;->b(II)V

    .line 279
    .line 280
    .line 281
    iget v3, v5, Lfm1;->p:I

    .line 282
    .line 283
    add-int/2addr v3, v10

    .line 284
    iput v3, v5, Lfm1;->p:I

    .line 285
    .line 286
    invoke-virtual {v2, v0}, Lq03;->a(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    invoke-static {v12, v7, v10}, Lrr2;->c(FZZ)J

    .line 290
    .line 291
    .line 292
    move-result-wide v2

    .line 293
    invoke-virtual {v1, v2, v3}, Ll03;->a(J)V

    .line 294
    .line 295
    .line 296
    invoke-interface/range {p2 .. p2}, Le63;->d()I

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    invoke-static {v0, v1}, Lfh0;->c(Leo0;I)Lcx2;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    move-object/from16 v0, p0

    .line 305
    .line 306
    move-object/from16 v2, p2

    .line 307
    .line 308
    move-wide/from16 v3, p3

    .line 309
    .line 310
    move/from16 v6, p6

    .line 311
    .line 312
    move/from16 v8, p8

    .line 313
    .line 314
    move/from16 v9, p9

    .line 315
    .line 316
    invoke-virtual/range {v0 .. v9}, Lf63;->Q0(Lcx2;Le63;JLfm1;IZFZ)V

    .line 317
    .line 318
    .line 319
    iput v13, v5, Lfm1;->p:I

    .line 320
    .line 321
    invoke-virtual {v5}, Lfm1;->a()J

    .line 322
    .line 323
    .line 324
    move-result-wide v0

    .line 325
    invoke-static {v0, v1}, Lg12;->u(J)F

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    cmpg-float v0, v0, v12

    .line 330
    .line 331
    if-gez v0, :cond_8

    .line 332
    .line 333
    add-int/lit8 v0, v11, 0x1

    .line 334
    .line 335
    iget v1, v5, Lfm1;->p:I

    .line 336
    .line 337
    add-int/2addr v1, v10

    .line 338
    invoke-virtual {v5, v0, v1}, Lfm1;->b(II)V

    .line 339
    .line 340
    .line 341
    :cond_8
    iput v11, v5, Lfm1;->p:I

    .line 342
    .line 343
    return-void

    .line 344
    :cond_9
    invoke-static {v3, v4}, Lg12;->u(J)F

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    cmpl-float v3, v3, v12

    .line 349
    .line 350
    if-lez v3, :cond_a

    .line 351
    .line 352
    iget v11, v5, Lfm1;->p:I

    .line 353
    .line 354
    add-int/lit8 v3, v11, 0x1

    .line 355
    .line 356
    iget v4, v2, Lq03;->b:I

    .line 357
    .line 358
    invoke-virtual {v5, v3, v4}, Lfm1;->b(II)V

    .line 359
    .line 360
    .line 361
    iget v3, v5, Lfm1;->p:I

    .line 362
    .line 363
    add-int/2addr v3, v10

    .line 364
    iput v3, v5, Lfm1;->p:I

    .line 365
    .line 366
    invoke-virtual {v2, v0}, Lq03;->a(Ljava/lang/Object;)V

    .line 367
    .line 368
    .line 369
    invoke-static {v12, v7, v10}, Lrr2;->c(FZZ)J

    .line 370
    .line 371
    .line 372
    move-result-wide v2

    .line 373
    invoke-virtual {v1, v2, v3}, Ll03;->a(J)V

    .line 374
    .line 375
    .line 376
    invoke-interface/range {p2 .. p2}, Le63;->d()I

    .line 377
    .line 378
    .line 379
    move-result v1

    .line 380
    invoke-static {v0, v1}, Lfh0;->c(Leo0;I)Lcx2;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    move-object/from16 v0, p0

    .line 385
    .line 386
    move-object/from16 v2, p2

    .line 387
    .line 388
    move-wide/from16 v3, p3

    .line 389
    .line 390
    move/from16 v6, p6

    .line 391
    .line 392
    move/from16 v8, p8

    .line 393
    .line 394
    move/from16 v9, p9

    .line 395
    .line 396
    invoke-virtual/range {v0 .. v9}, Lf63;->Q0(Lcx2;Le63;JLfm1;IZFZ)V

    .line 397
    .line 398
    .line 399
    iput v11, v5, Lfm1;->p:I

    .line 400
    .line 401
    :cond_a
    return-void

    .line 402
    :cond_b
    move v8, v1

    .line 403
    iget v1, v3, Lcx2;->p:I

    .line 404
    .line 405
    const/16 v6, 0x10

    .line 406
    .line 407
    and-int/2addr v1, v6

    .line 408
    if-eqz v1, :cond_11

    .line 409
    .line 410
    instance-of v1, v3, Lfo0;

    .line 411
    .line 412
    if-eqz v1, :cond_11

    .line 413
    .line 414
    move-object v1, v3

    .line 415
    check-cast v1, Lfo0;

    .line 416
    .line 417
    iget-object v1, v1, Lfo0;->C:Lcx2;

    .line 418
    .line 419
    :goto_6
    if-eqz v1, :cond_10

    .line 420
    .line 421
    iget v7, v1, Lcx2;->p:I

    .line 422
    .line 423
    and-int/2addr v7, v6

    .line 424
    if-eqz v7, :cond_f

    .line 425
    .line 426
    add-int/lit8 v9, v9, 0x1

    .line 427
    .line 428
    if-ne v9, v10, :cond_c

    .line 429
    .line 430
    move-object v3, v1

    .line 431
    goto :goto_7

    .line 432
    :cond_c
    if-nez v4, :cond_d

    .line 433
    .line 434
    new-instance v4, Lf13;

    .line 435
    .line 436
    new-array v7, v6, [Lcx2;

    .line 437
    .line 438
    invoke-direct {v4, v7}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 439
    .line 440
    .line 441
    :cond_d
    if-eqz v3, :cond_e

    .line 442
    .line 443
    invoke-virtual {v4, v3}, Lf13;->b(Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    move-object v3, v2

    .line 447
    :cond_e
    invoke-virtual {v4, v1}, Lf13;->b(Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    :cond_f
    :goto_7
    iget-object v1, v1, Lcx2;->s:Lcx2;

    .line 451
    .line 452
    goto :goto_6

    .line 453
    :cond_10
    if-ne v9, v10, :cond_11

    .line 454
    .line 455
    :goto_8
    move/from16 v6, p6

    .line 456
    .line 457
    move/from16 v7, p7

    .line 458
    .line 459
    move v1, v8

    .line 460
    goto/16 :goto_1

    .line 461
    .line 462
    :cond_11
    invoke-static {v4}, Lj51;->c(Lf13;)Lcx2;

    .line 463
    .line 464
    .line 465
    move-result-object v3

    .line 466
    goto :goto_8

    .line 467
    :cond_12
    if-eqz p9, :cond_13

    .line 468
    .line 469
    invoke-virtual/range {p0 .. p8}, Lf63;->F0(Lcx2;Le63;JLfm1;IZF)V

    .line 470
    .line 471
    .line 472
    return-void

    .line 473
    :cond_13
    invoke-virtual/range {p0 .. p8}, Lf63;->W0(Lcx2;Le63;JLfm1;IZF)V

    .line 474
    .line 475
    .line 476
    return-void
.end method

.method public abstract R0(Ljz;Lsj1;)V
.end method

.method public final S0(JFLif1;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p4, v0}, Lf63;->Y0(Lif1;Z)V

    .line 3
    .line 4
    .line 5
    iget-wide v0, p0, Lf63;->S:J

    .line 6
    .line 7
    invoke-static {v0, v1, p1, p2}, Lg02;->a(JJ)Z

    .line 8
    .line 9
    .line 10
    move-result p4

    .line 11
    iget-object v0, p0, Lf63;->H:Lc72;

    .line 12
    .line 13
    if-nez p4, :cond_2

    .line 14
    .line 15
    invoke-static {v0}, Lh12;->L(Lc72;)Lub3;

    .line 16
    .line 17
    .line 18
    move-result-object p4

    .line 19
    const/high16 v1, -0x3f800000    # -4.0f

    .line 20
    .line 21
    check-cast p4, Lra;

    .line 22
    .line 23
    invoke-virtual {p4, v1}, Lra;->J(F)V

    .line 24
    .line 25
    .line 26
    iput-wide p1, p0, Lf63;->S:J

    .line 27
    .line 28
    iget-object p4, p0, Lf63;->g0:Ltb3;

    .line 29
    .line 30
    if-eqz p4, :cond_0

    .line 31
    .line 32
    check-cast p4, Lvj1;

    .line 33
    .line 34
    invoke-virtual {p4, p1, p2}, Lvj1;->d(J)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object p1, p0, Lf63;->J:Lf63;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    invoke-virtual {p1}, Lf63;->I0()V

    .line 43
    .line 44
    .line 45
    :cond_1
    :goto_0
    invoke-virtual {v0, p0}, Lc72;->M(Lf63;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p0}, Lcf2;->l0(Lf63;)V

    .line 49
    .line 50
    .line 51
    iget-object p1, v0, Lc72;->A:Lub3;

    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    check-cast p1, Lra;

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Lra;->t(Lc72;)V

    .line 58
    .line 59
    .line 60
    :cond_2
    iput p3, p0, Lf63;->T:F

    .line 61
    .line 62
    iget-object p1, v0, Lc72;->Q:Lw12;

    .line 63
    .line 64
    iget-object p1, p1, Lw12;->e:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p1, Lf63;

    .line 67
    .line 68
    if-ne p0, p1, :cond_3

    .line 69
    .line 70
    invoke-static {v0}, Lh12;->L(Lc72;)Lub3;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Lra;

    .line 75
    .line 76
    invoke-virtual {p1}, Lra;->getRectManager()Lyv3;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1, v0}, Lyv3;->h(Lc72;)V

    .line 81
    .line 82
    .line 83
    :cond_3
    iget-boolean p1, p0, Lcf2;->B:Z

    .line 84
    .line 85
    if-nez p1, :cond_4

    .line 86
    .line 87
    invoke-virtual {p0}, Lf63;->h0()Lvi2;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {p0, p1}, Lcf2;->b0(Lvi2;)V

    .line 92
    .line 93
    .line 94
    :cond_4
    return-void
.end method

.method public final T0(Lv03;ZZ)V
    .locals 12

    .line 1
    iget-object v0, p0, Lf63;->g0:Ltb3;

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    const-wide v2, 0xffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    if-eqz v0, :cond_a

    .line 11
    .line 12
    iget-boolean v4, p0, Lf63;->L:Z

    .line 13
    .line 14
    const/4 v5, 0x0

    .line 15
    if-eqz v4, :cond_8

    .line 16
    .line 17
    if-eqz p3, :cond_6

    .line 18
    .line 19
    invoke-virtual {p0}, Lf63;->z0()J

    .line 20
    .line 21
    .line 22
    move-result-wide p2

    .line 23
    iget v4, p1, Lv03;->b:F

    .line 24
    .line 25
    iget v6, p1, Lv03;->c:F

    .line 26
    .line 27
    iget v7, p1, Lv03;->d:F

    .line 28
    .line 29
    cmpg-float v7, v7, v5

    .line 30
    .line 31
    if-ltz v7, :cond_5

    .line 32
    .line 33
    iget-wide v7, p0, Ljg3;->p:J

    .line 34
    .line 35
    shr-long v9, v7, v1

    .line 36
    .line 37
    long-to-int v9, v9

    .line 38
    int-to-float v9, v9

    .line 39
    cmpl-float v9, v4, v9

    .line 40
    .line 41
    if-gtz v9, :cond_5

    .line 42
    .line 43
    iget v9, p1, Lv03;->e:F

    .line 44
    .line 45
    cmpg-float v9, v9, v5

    .line 46
    .line 47
    if-ltz v9, :cond_5

    .line 48
    .line 49
    and-long/2addr v7, v2

    .line 50
    long-to-int v7, v7

    .line 51
    int-to-float v7, v7

    .line 52
    cmpl-float v7, v6, v7

    .line 53
    .line 54
    if-lez v7, :cond_0

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_0
    shr-long v7, p2, v1

    .line 58
    .line 59
    long-to-int v7, v7

    .line 60
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 61
    .line 62
    .line 63
    move-result v7

    .line 64
    and-long v8, p2, v2

    .line 65
    .line 66
    long-to-int v8, v8

    .line 67
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    iget v9, p1, Lv03;->d:F

    .line 72
    .line 73
    iget v10, p1, Lv03;->b:F

    .line 74
    .line 75
    sub-float/2addr v9, v10

    .line 76
    sub-float v9, v7, v9

    .line 77
    .line 78
    const/high16 v10, 0x40000000    # 2.0f

    .line 79
    .line 80
    div-float/2addr v9, v10

    .line 81
    cmpl-float v11, v9, v5

    .line 82
    .line 83
    if-lez v11, :cond_1

    .line 84
    .line 85
    sub-float/2addr v4, v9

    .line 86
    goto :goto_0

    .line 87
    :cond_1
    neg-float v7, v7

    .line 88
    div-float/2addr v7, v10

    .line 89
    cmpg-float v9, v4, v7

    .line 90
    .line 91
    if-gez v9, :cond_2

    .line 92
    .line 93
    move v4, v7

    .line 94
    :cond_2
    :goto_0
    iget v7, p1, Lv03;->e:F

    .line 95
    .line 96
    iget v9, p1, Lv03;->c:F

    .line 97
    .line 98
    sub-float/2addr v7, v9

    .line 99
    sub-float v7, v8, v7

    .line 100
    .line 101
    div-float/2addr v7, v10

    .line 102
    cmpl-float v9, v7, v5

    .line 103
    .line 104
    if-lez v9, :cond_3

    .line 105
    .line 106
    sub-float/2addr v6, v7

    .line 107
    goto :goto_1

    .line 108
    :cond_3
    neg-float v7, v8

    .line 109
    div-float/2addr v7, v10

    .line 110
    cmpg-float v8, v6, v7

    .line 111
    .line 112
    if-gez v8, :cond_4

    .line 113
    .line 114
    move v6, v7

    .line 115
    :cond_4
    :goto_1
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 116
    .line 117
    .line 118
    move-result v4

    .line 119
    int-to-long v7, v4

    .line 120
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    int-to-long v9, v4

    .line 125
    shl-long v6, v7, v1

    .line 126
    .line 127
    and-long v8, v9, v2

    .line 128
    .line 129
    or-long/2addr v6, v8

    .line 130
    goto :goto_3

    .line 131
    :cond_5
    :goto_2
    const-wide/16 v6, 0x0

    .line 132
    .line 133
    :goto_3
    shr-long v8, v6, v1

    .line 134
    .line 135
    long-to-int v4, v8

    .line 136
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 137
    .line 138
    .line 139
    move-result v4

    .line 140
    and-long/2addr v6, v2

    .line 141
    long-to-int v6, v6

    .line 142
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 143
    .line 144
    .line 145
    move-result v6

    .line 146
    iget-wide v7, p0, Ljg3;->p:J

    .line 147
    .line 148
    shr-long v9, v7, v1

    .line 149
    .line 150
    long-to-int v9, v9

    .line 151
    and-long/2addr v7, v2

    .line 152
    long-to-int v7, v7

    .line 153
    int-to-float v8, v9

    .line 154
    shr-long v9, p2, v1

    .line 155
    .line 156
    long-to-int v9, v9

    .line 157
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 158
    .line 159
    .line 160
    move-result v10

    .line 161
    add-float/2addr v10, v8

    .line 162
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 163
    .line 164
    .line 165
    move-result v9

    .line 166
    add-float/2addr v9, v4

    .line 167
    invoke-static {v8, v9}, Ljava/lang/Math;->max(FF)F

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    invoke-static {v10, v8}, Ljava/lang/Math;->min(FF)F

    .line 172
    .line 173
    .line 174
    move-result v8

    .line 175
    int-to-float v7, v7

    .line 176
    and-long/2addr p2, v2

    .line 177
    long-to-int p2, p2

    .line 178
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 179
    .line 180
    .line 181
    move-result p3

    .line 182
    add-float/2addr p3, v7

    .line 183
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 184
    .line 185
    .line 186
    move-result p2

    .line 187
    add-float/2addr p2, v6

    .line 188
    invoke-static {v7, p2}, Ljava/lang/Math;->max(FF)F

    .line 189
    .line 190
    .line 191
    move-result p2

    .line 192
    invoke-static {p3, p2}, Ljava/lang/Math;->min(FF)F

    .line 193
    .line 194
    .line 195
    move-result p2

    .line 196
    invoke-virtual {p1, v4, v6, v8, p2}, Lv03;->b(FFFF)V

    .line 197
    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_6
    if-eqz p2, :cond_7

    .line 201
    .line 202
    iget-wide p2, p0, Ljg3;->p:J

    .line 203
    .line 204
    shr-long v6, p2, v1

    .line 205
    .line 206
    long-to-int v4, v6

    .line 207
    int-to-float v4, v4

    .line 208
    and-long/2addr p2, v2

    .line 209
    long-to-int p2, p2

    .line 210
    int-to-float p2, p2

    .line 211
    invoke-virtual {p1, v5, v5, v4, p2}, Lv03;->b(FFFF)V

    .line 212
    .line 213
    .line 214
    :cond_7
    :goto_4
    invoke-virtual {p1}, Lv03;->c()Z

    .line 215
    .line 216
    .line 217
    move-result p2

    .line 218
    if-eqz p2, :cond_8

    .line 219
    .line 220
    return-void

    .line 221
    :cond_8
    check-cast v0, Lvj1;

    .line 222
    .line 223
    invoke-virtual {v0}, Lvj1;->b()[F

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    iget-boolean p3, v0, Lvj1;->F:Z

    .line 228
    .line 229
    if-nez p3, :cond_a

    .line 230
    .line 231
    if-nez p2, :cond_9

    .line 232
    .line 233
    iput v5, p1, Lv03;->b:F

    .line 234
    .line 235
    iput v5, p1, Lv03;->c:F

    .line 236
    .line 237
    iput v5, p1, Lv03;->d:F

    .line 238
    .line 239
    iput v5, p1, Lv03;->e:F

    .line 240
    .line 241
    goto :goto_5

    .line 242
    :cond_9
    invoke-static {p2, p1}, Lya4;->B([FLv03;)V

    .line 243
    .line 244
    .line 245
    :cond_a
    :goto_5
    iget-wide p2, p0, Lf63;->S:J

    .line 246
    .line 247
    shr-long v0, p2, v1

    .line 248
    .line 249
    long-to-int p0, v0

    .line 250
    iget v0, p1, Lv03;->b:F

    .line 251
    .line 252
    int-to-float p0, p0

    .line 253
    add-float/2addr v0, p0

    .line 254
    iput v0, p1, Lv03;->b:F

    .line 255
    .line 256
    iget v0, p1, Lv03;->d:F

    .line 257
    .line 258
    add-float/2addr v0, p0

    .line 259
    iput v0, p1, Lv03;->d:F

    .line 260
    .line 261
    and-long/2addr p2, v2

    .line 262
    long-to-int p0, p2

    .line 263
    iget p2, p1, Lv03;->c:F

    .line 264
    .line 265
    int-to-float p0, p0

    .line 266
    add-float/2addr p2, p0

    .line 267
    iput p2, p1, Lv03;->c:F

    .line 268
    .line 269
    iget p2, p1, Lv03;->e:F

    .line 270
    .line 271
    add-float/2addr p2, p0

    .line 272
    iput p2, p1, Lv03;->e:F

    .line 273
    .line 274
    return-void
.end method

.method public final U0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lf63;->g0:Ltb3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {p0, v0, v1}, Lf63;->Y0(Lif1;Z)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lf63;->H:Lc72;

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lc72;->V(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final V0(Lvi2;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lf63;->Q:Lvi2;

    .line 6
    .line 7
    if-eq v1, v2, :cond_19

    .line 8
    .line 9
    iput-object v1, v0, Lf63;->Q:Lvi2;

    .line 10
    .line 11
    iget-object v3, v0, Lf63;->H:Lc72;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-interface {v1}, Lvi2;->d()I

    .line 17
    .line 18
    .line 19
    move-result v5

    .line 20
    invoke-interface {v2}, Lvi2;->d()I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    if-ne v5, v6, :cond_0

    .line 25
    .line 26
    invoke-interface {v1}, Lvi2;->b()I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    invoke-interface {v2}, Lvi2;->b()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eq v5, v2, :cond_10

    .line 35
    .line 36
    :cond_0
    invoke-interface {v1}, Lvi2;->d()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    invoke-interface {v1}, Lvi2;->b()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    iget-object v6, v0, Lf63;->g0:Ltb3;

    .line 45
    .line 46
    const-wide v7, 0xffffffffL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    const/16 v9, 0x20

    .line 52
    .line 53
    if-eqz v6, :cond_1

    .line 54
    .line 55
    int-to-long v10, v2

    .line 56
    shl-long/2addr v10, v9

    .line 57
    int-to-long v12, v5

    .line 58
    and-long/2addr v12, v7

    .line 59
    or-long/2addr v10, v12

    .line 60
    check-cast v6, Lvj1;

    .line 61
    .line 62
    invoke-virtual {v6, v10, v11}, Lvj1;->e(J)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {v3}, Lc72;->H()Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_2

    .line 71
    .line 72
    iget-object v6, v0, Lf63;->J:Lf63;

    .line 73
    .line 74
    if-eqz v6, :cond_2

    .line 75
    .line 76
    invoke-virtual {v6}, Lf63;->I0()V

    .line 77
    .line 78
    .line 79
    :cond_2
    :goto_0
    int-to-long v10, v2

    .line 80
    shl-long v9, v10, v9

    .line 81
    .line 82
    int-to-long v5, v5

    .line 83
    and-long/2addr v5, v7

    .line 84
    or-long/2addr v5, v9

    .line 85
    invoke-virtual {v0, v5, v6}, Ljg3;->Q(J)V

    .line 86
    .line 87
    .line 88
    iget-object v2, v0, Lf63;->M:Lif1;

    .line 89
    .line 90
    if-eqz v2, :cond_3

    .line 91
    .line 92
    invoke-virtual {v0, v4}, Lf63;->Z0(Z)V

    .line 93
    .line 94
    .line 95
    :cond_3
    const/4 v2, 0x4

    .line 96
    invoke-static {v2}, Lg63;->f(I)Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    invoke-virtual {v0}, Lf63;->A0()Lcx2;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    if-eqz v5, :cond_4

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_4
    iget-object v6, v6, Lcx2;->r:Lcx2;

    .line 108
    .line 109
    if-nez v6, :cond_5

    .line 110
    .line 111
    goto/16 :goto_7

    .line 112
    .line 113
    :cond_5
    :goto_1
    invoke-virtual {v0, v5}, Lf63;->D0(Z)Lcx2;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    :goto_2
    if-eqz v5, :cond_e

    .line 118
    .line 119
    iget v7, v5, Lcx2;->q:I

    .line 120
    .line 121
    and-int/2addr v7, v2

    .line 122
    if-eqz v7, :cond_e

    .line 123
    .line 124
    iget v7, v5, Lcx2;->p:I

    .line 125
    .line 126
    and-int/2addr v7, v2

    .line 127
    if-eqz v7, :cond_d

    .line 128
    .line 129
    const/4 v7, 0x0

    .line 130
    move-object v8, v5

    .line 131
    move-object v9, v7

    .line 132
    :goto_3
    if-eqz v8, :cond_d

    .line 133
    .line 134
    instance-of v10, v8, Lrv0;

    .line 135
    .line 136
    if-eqz v10, :cond_6

    .line 137
    .line 138
    check-cast v8, Lrv0;

    .line 139
    .line 140
    invoke-interface {v8}, Lrv0;->y()V

    .line 141
    .line 142
    .line 143
    goto :goto_6

    .line 144
    :cond_6
    iget v10, v8, Lcx2;->p:I

    .line 145
    .line 146
    and-int/2addr v10, v2

    .line 147
    if-eqz v10, :cond_c

    .line 148
    .line 149
    instance-of v10, v8, Lfo0;

    .line 150
    .line 151
    if-eqz v10, :cond_c

    .line 152
    .line 153
    move-object v10, v8

    .line 154
    check-cast v10, Lfo0;

    .line 155
    .line 156
    iget-object v10, v10, Lfo0;->C:Lcx2;

    .line 157
    .line 158
    move v11, v4

    .line 159
    :goto_4
    const/4 v12, 0x1

    .line 160
    if-eqz v10, :cond_b

    .line 161
    .line 162
    iget v13, v10, Lcx2;->p:I

    .line 163
    .line 164
    and-int/2addr v13, v2

    .line 165
    if-eqz v13, :cond_a

    .line 166
    .line 167
    add-int/lit8 v11, v11, 0x1

    .line 168
    .line 169
    if-ne v11, v12, :cond_7

    .line 170
    .line 171
    move-object v8, v10

    .line 172
    goto :goto_5

    .line 173
    :cond_7
    if-nez v9, :cond_8

    .line 174
    .line 175
    new-instance v9, Lf13;

    .line 176
    .line 177
    const/16 v12, 0x10

    .line 178
    .line 179
    new-array v12, v12, [Lcx2;

    .line 180
    .line 181
    invoke-direct {v9, v12}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :cond_8
    if-eqz v8, :cond_9

    .line 185
    .line 186
    invoke-virtual {v9, v8}, Lf13;->b(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    move-object v8, v7

    .line 190
    :cond_9
    invoke-virtual {v9, v10}, Lf13;->b(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    :cond_a
    :goto_5
    iget-object v10, v10, Lcx2;->s:Lcx2;

    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_b
    if-ne v11, v12, :cond_c

    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_c
    :goto_6
    invoke-static {v9}, Lj51;->c(Lf13;)Lcx2;

    .line 200
    .line 201
    .line 202
    move-result-object v8

    .line 203
    goto :goto_3

    .line 204
    :cond_d
    if-eq v5, v6, :cond_e

    .line 205
    .line 206
    iget-object v5, v5, Lcx2;->s:Lcx2;

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_e
    :goto_7
    iget-object v2, v3, Lc72;->A:Lub3;

    .line 210
    .line 211
    if-eqz v2, :cond_f

    .line 212
    .line 213
    check-cast v2, Lra;

    .line 214
    .line 215
    invoke-virtual {v2, v3}, Lra;->t(Lc72;)V

    .line 216
    .line 217
    .line 218
    :cond_f
    invoke-virtual {v3, v0}, Lc72;->M(Lf63;)V

    .line 219
    .line 220
    .line 221
    :cond_10
    iget-object v2, v0, Lf63;->R:Lp03;

    .line 222
    .line 223
    if-eqz v2, :cond_11

    .line 224
    .line 225
    iget v2, v2, Lp03;->e:I

    .line 226
    .line 227
    if-eqz v2, :cond_11

    .line 228
    .line 229
    goto :goto_8

    .line 230
    :cond_11
    invoke-interface {v1}, Lvi2;->a()Ljava/util/Map;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 235
    .line 236
    .line 237
    move-result v2

    .line 238
    if-nez v2, :cond_19

    .line 239
    .line 240
    :goto_8
    iget-object v2, v0, Lf63;->R:Lp03;

    .line 241
    .line 242
    invoke-interface {v1}, Lvi2;->a()Ljava/util/Map;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    if-nez v2, :cond_12

    .line 247
    .line 248
    goto :goto_b

    .line 249
    :cond_12
    iget v6, v2, Lp03;->e:I

    .line 250
    .line 251
    invoke-interface {v5}, Ljava/util/Map;->size()I

    .line 252
    .line 253
    .line 254
    move-result v7

    .line 255
    if-eq v6, v7, :cond_13

    .line 256
    .line 257
    goto :goto_b

    .line 258
    :cond_13
    iget-object v6, v2, Lp03;->b:[Ljava/lang/Object;

    .line 259
    .line 260
    iget-object v7, v2, Lp03;->c:[I

    .line 261
    .line 262
    iget-object v2, v2, Lp03;->a:[J

    .line 263
    .line 264
    array-length v8, v2

    .line 265
    add-int/lit8 v8, v8, -0x2

    .line 266
    .line 267
    if-ltz v8, :cond_19

    .line 268
    .line 269
    move v9, v4

    .line 270
    :goto_9
    aget-wide v10, v2, v9

    .line 271
    .line 272
    not-long v12, v10

    .line 273
    const/4 v14, 0x7

    .line 274
    shl-long/2addr v12, v14

    .line 275
    and-long/2addr v12, v10

    .line 276
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    and-long/2addr v12, v14

    .line 282
    cmp-long v12, v12, v14

    .line 283
    .line 284
    if-eqz v12, :cond_18

    .line 285
    .line 286
    sub-int v12, v9, v8

    .line 287
    .line 288
    not-int v12, v12

    .line 289
    ushr-int/lit8 v12, v12, 0x1f

    .line 290
    .line 291
    const/16 v13, 0x8

    .line 292
    .line 293
    rsub-int/lit8 v12, v12, 0x8

    .line 294
    .line 295
    move v14, v4

    .line 296
    :goto_a
    if-ge v14, v12, :cond_17

    .line 297
    .line 298
    const-wide/16 v15, 0xff

    .line 299
    .line 300
    and-long/2addr v15, v10

    .line 301
    const-wide/16 v17, 0x80

    .line 302
    .line 303
    cmp-long v15, v15, v17

    .line 304
    .line 305
    if-gez v15, :cond_16

    .line 306
    .line 307
    shl-int/lit8 v15, v9, 0x3

    .line 308
    .line 309
    add-int/2addr v15, v14

    .line 310
    aget-object v16, v6, v15

    .line 311
    .line 312
    aget v15, v7, v15

    .line 313
    .line 314
    move-object/from16 v4, v16

    .line 315
    .line 316
    check-cast v4, Lpp1;

    .line 317
    .line 318
    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v4

    .line 322
    check-cast v4, Ljava/lang/Integer;

    .line 323
    .line 324
    if-nez v4, :cond_14

    .line 325
    .line 326
    goto :goto_b

    .line 327
    :cond_14
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    if-eq v4, v15, :cond_16

    .line 332
    .line 333
    :goto_b
    iget-object v2, v3, Lc72;->R:Lf72;

    .line 334
    .line 335
    iget-object v2, v2, Lf72;->p:Lti2;

    .line 336
    .line 337
    iget-object v2, v2, Lti2;->H:Ld72;

    .line 338
    .line 339
    invoke-virtual {v2}, Ld72;->f()V

    .line 340
    .line 341
    .line 342
    iget-object v2, v0, Lf63;->R:Lp03;

    .line 343
    .line 344
    if-nez v2, :cond_15

    .line 345
    .line 346
    sget-object v2, Lr73;->a:Lp03;

    .line 347
    .line 348
    new-instance v2, Lp03;

    .line 349
    .line 350
    invoke-direct {v2}, Lp03;-><init>()V

    .line 351
    .line 352
    .line 353
    iput-object v2, v0, Lf63;->R:Lp03;

    .line 354
    .line 355
    :cond_15
    invoke-virtual {v2}, Lp03;->a()V

    .line 356
    .line 357
    .line 358
    invoke-interface {v1}, Lvi2;->a()Ljava/util/Map;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 371
    .line 372
    .line 373
    move-result v1

    .line 374
    if-eqz v1, :cond_19

    .line 375
    .line 376
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    check-cast v1, Ljava/util/Map$Entry;

    .line 381
    .line 382
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v3

    .line 386
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    check-cast v1, Ljava/lang/Number;

    .line 391
    .line 392
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 393
    .line 394
    .line 395
    move-result v1

    .line 396
    invoke-virtual {v2, v1, v3}, Lp03;->g(ILjava/lang/Object;)V

    .line 397
    .line 398
    .line 399
    goto :goto_c

    .line 400
    :cond_16
    shr-long/2addr v10, v13

    .line 401
    add-int/lit8 v14, v14, 0x1

    .line 402
    .line 403
    const/4 v4, 0x0

    .line 404
    goto :goto_a

    .line 405
    :cond_17
    if-ne v12, v13, :cond_19

    .line 406
    .line 407
    :cond_18
    if-eq v9, v8, :cond_19

    .line 408
    .line 409
    add-int/lit8 v9, v9, 0x1

    .line 410
    .line 411
    const/4 v4, 0x0

    .line 412
    goto/16 :goto_9

    .line 413
    .line 414
    :cond_19
    return-void
.end method

.method public final W0(Lcx2;Le63;JLfm1;IZF)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    move-object/from16 v1, p0

    .line 6
    .line 7
    move-object/from16 v2, p2

    .line 8
    .line 9
    move-wide/from16 v3, p3

    .line 10
    .line 11
    move-object/from16 v5, p5

    .line 12
    .line 13
    move/from16 v6, p6

    .line 14
    .line 15
    move/from16 v7, p7

    .line 16
    .line 17
    invoke-virtual/range {v1 .. v7}, Lf63;->H0(Le63;JLfm1;IZ)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    move-object/from16 v2, p2

    .line 22
    .line 23
    invoke-interface {v2, v0}, Le63;->f(Lcx2;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    invoke-interface {v2}, Le63;->d()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-static {v0, v1}, Lfh0;->c(Leo0;I)Lcx2;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    move-object/from16 v0, p0

    .line 38
    .line 39
    move-wide/from16 v3, p3

    .line 40
    .line 41
    move-object/from16 v5, p5

    .line 42
    .line 43
    move/from16 v6, p6

    .line 44
    .line 45
    move/from16 v7, p7

    .line 46
    .line 47
    move/from16 v8, p8

    .line 48
    .line 49
    invoke-virtual/range {v0 .. v8}, Lf63;->W0(Lcx2;Le63;JLfm1;IZF)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    move-object/from16 v5, p5

    .line 54
    .line 55
    move/from16 v7, p7

    .line 56
    .line 57
    move/from16 v8, p8

    .line 58
    .line 59
    invoke-interface {v2, v0}, Le63;->a(Lcx2;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_9

    .line 64
    .line 65
    iget-object v10, v5, Lfm1;->o:Ll03;

    .line 66
    .line 67
    iget-object v11, v5, Lfm1;->n:Lq03;

    .line 68
    .line 69
    iget v12, v5, Lfm1;->p:I

    .line 70
    .line 71
    iget v1, v11, Lq03;->b:I

    .line 72
    .line 73
    add-int/lit8 v3, v1, -0x1

    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    if-ne v12, v3, :cond_6

    .line 77
    .line 78
    add-int/lit8 v13, v12, 0x1

    .line 79
    .line 80
    invoke-virtual {v5, v13, v1}, Lfm1;->b(II)V

    .line 81
    .line 82
    .line 83
    iget v1, v5, Lfm1;->p:I

    .line 84
    .line 85
    add-int/lit8 v1, v1, 0x1

    .line 86
    .line 87
    iput v1, v5, Lfm1;->p:I

    .line 88
    .line 89
    invoke-virtual {v11, v0}, Lq03;->a(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v8, v7, v4}, Lrr2;->c(FZZ)J

    .line 93
    .line 94
    .line 95
    move-result-wide v3

    .line 96
    invoke-virtual {v10, v3, v4}, Ll03;->a(J)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v2}, Le63;->d()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    invoke-static {v0, v1}, Lfh0;->c(Leo0;I)Lcx2;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    const/4 v9, 0x0

    .line 108
    move-object/from16 v0, p0

    .line 109
    .line 110
    move-wide/from16 v3, p3

    .line 111
    .line 112
    move/from16 v6, p6

    .line 113
    .line 114
    invoke-virtual/range {v0 .. v9}, Lf63;->Q0(Lcx2;Le63;JLfm1;IZFZ)V

    .line 115
    .line 116
    .line 117
    iput v12, v5, Lfm1;->p:I

    .line 118
    .line 119
    iget v0, v11, Lq03;->b:I

    .line 120
    .line 121
    add-int/lit8 v0, v0, -0x1

    .line 122
    .line 123
    if-eq v13, v0, :cond_3

    .line 124
    .line 125
    invoke-virtual {v5}, Lfm1;->a()J

    .line 126
    .line 127
    .line 128
    move-result-wide v0

    .line 129
    invoke-static {v0, v1}, Lg12;->D(J)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_2

    .line 134
    .line 135
    goto :goto_0

    .line 136
    :cond_2
    return-void

    .line 137
    :cond_3
    :goto_0
    iget v0, v5, Lfm1;->p:I

    .line 138
    .line 139
    add-int/lit8 v1, v0, 0x1

    .line 140
    .line 141
    invoke-virtual {v11, v1}, Lq03;->k(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    if-ltz v1, :cond_5

    .line 145
    .line 146
    iget v2, v10, Ll03;->b:I

    .line 147
    .line 148
    if-ge v1, v2, :cond_5

    .line 149
    .line 150
    iget-object v3, v10, Ll03;->a:[J

    .line 151
    .line 152
    aget-wide v4, v3, v1

    .line 153
    .line 154
    add-int/lit8 v4, v2, -0x1

    .line 155
    .line 156
    if-eq v1, v4, :cond_4

    .line 157
    .line 158
    add-int/lit8 v0, v0, 0x2

    .line 159
    .line 160
    invoke-static {v3, v3, v1, v0, v2}, Lti;->a0([J[JIII)V

    .line 161
    .line 162
    .line 163
    :cond_4
    iget v0, v10, Ll03;->b:I

    .line 164
    .line 165
    add-int/lit8 v0, v0, -0x1

    .line 166
    .line 167
    iput v0, v10, Ll03;->b:I

    .line 168
    .line 169
    return-void

    .line 170
    :cond_5
    const-string v0, "Index must be between 0 and size"

    .line 171
    .line 172
    invoke-static {v0}, Lkf2;->h(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    return-void

    .line 176
    :cond_6
    invoke-virtual {v5}, Lfm1;->a()J

    .line 177
    .line 178
    .line 179
    move-result-wide v12

    .line 180
    iget v14, v5, Lfm1;->p:I

    .line 181
    .line 182
    iget v1, v11, Lq03;->b:I

    .line 183
    .line 184
    add-int/lit8 v15, v1, -0x1

    .line 185
    .line 186
    iput v15, v5, Lfm1;->p:I

    .line 187
    .line 188
    iget v2, v11, Lq03;->b:I

    .line 189
    .line 190
    invoke-virtual {v5, v1, v2}, Lfm1;->b(II)V

    .line 191
    .line 192
    .line 193
    iget v1, v5, Lfm1;->p:I

    .line 194
    .line 195
    add-int/lit8 v1, v1, 0x1

    .line 196
    .line 197
    iput v1, v5, Lfm1;->p:I

    .line 198
    .line 199
    invoke-virtual {v11, v0}, Lq03;->a(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    invoke-static {v8, v7, v4}, Lrr2;->c(FZZ)J

    .line 203
    .line 204
    .line 205
    move-result-wide v1

    .line 206
    invoke-virtual {v10, v1, v2}, Ll03;->a(J)V

    .line 207
    .line 208
    .line 209
    invoke-interface/range {p2 .. p2}, Le63;->d()I

    .line 210
    .line 211
    .line 212
    move-result v1

    .line 213
    invoke-static {v0, v1}, Lfh0;->c(Leo0;I)Lcx2;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    const/4 v9, 0x0

    .line 218
    move-object/from16 v0, p0

    .line 219
    .line 220
    move-object/from16 v2, p2

    .line 221
    .line 222
    move-wide/from16 v3, p3

    .line 223
    .line 224
    move/from16 v6, p6

    .line 225
    .line 226
    invoke-virtual/range {v0 .. v9}, Lf63;->Q0(Lcx2;Le63;JLfm1;IZFZ)V

    .line 227
    .line 228
    .line 229
    iput v15, v5, Lfm1;->p:I

    .line 230
    .line 231
    invoke-virtual {v5}, Lfm1;->a()J

    .line 232
    .line 233
    .line 234
    move-result-wide v0

    .line 235
    iget v2, v5, Lfm1;->p:I

    .line 236
    .line 237
    add-int/lit8 v2, v2, 0x1

    .line 238
    .line 239
    iget v3, v11, Lq03;->b:I

    .line 240
    .line 241
    add-int/lit8 v3, v3, -0x1

    .line 242
    .line 243
    if-ge v2, v3, :cond_8

    .line 244
    .line 245
    invoke-static {v12, v13, v0, v1}, Lg12;->k(JJ)I

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    if-lez v2, :cond_8

    .line 250
    .line 251
    add-int/lit8 v2, v14, 0x1

    .line 252
    .line 253
    invoke-static {v0, v1}, Lg12;->D(J)Z

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    iget v1, v5, Lfm1;->p:I

    .line 258
    .line 259
    if-eqz v0, :cond_7

    .line 260
    .line 261
    add-int/lit8 v1, v1, 0x2

    .line 262
    .line 263
    goto :goto_1

    .line 264
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 265
    .line 266
    :goto_1
    invoke-virtual {v5, v2, v1}, Lfm1;->b(II)V

    .line 267
    .line 268
    .line 269
    goto :goto_2

    .line 270
    :cond_8
    iget v0, v5, Lfm1;->p:I

    .line 271
    .line 272
    add-int/lit8 v0, v0, 0x1

    .line 273
    .line 274
    iget v1, v11, Lq03;->b:I

    .line 275
    .line 276
    invoke-virtual {v5, v0, v1}, Lfm1;->b(II)V

    .line 277
    .line 278
    .line 279
    :goto_2
    iput v14, v5, Lfm1;->p:I

    .line 280
    .line 281
    return-void

    .line 282
    :cond_9
    invoke-interface/range {p2 .. p2}, Le63;->d()I

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    invoke-static {v0, v1}, Lfh0;->c(Leo0;I)Lcx2;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    const/4 v9, 0x0

    .line 291
    move-object/from16 v0, p0

    .line 292
    .line 293
    move-object/from16 v2, p2

    .line 294
    .line 295
    move-wide/from16 v3, p3

    .line 296
    .line 297
    move/from16 v6, p6

    .line 298
    .line 299
    move/from16 v7, p7

    .line 300
    .line 301
    move/from16 v8, p8

    .line 302
    .line 303
    invoke-virtual/range {v0 .. v9}, Lf63;->Q0(Lcx2;Le63;JLfm1;IZFZ)V

    .line 304
    .line 305
    .line 306
    return-void
.end method

.method public final X0()Lwv3;
    .locals 11

    .line 1
    invoke-virtual {p0}, Lf63;->A0()Lcx2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lcx2;->A:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_4

    .line 10
    .line 11
    :cond_0
    invoke-static {p0}, Lwr1;->n(Lq62;)Lq62;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lf63;->U:Lv03;

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    new-instance v1, Lv03;

    .line 20
    .line 21
    invoke-direct {v1}, Lv03;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v1, p0, Lf63;->U:Lv03;

    .line 25
    .line 26
    :cond_1
    invoke-virtual {p0}, Lf63;->z0()J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    invoke-virtual {p0, v2, v3}, Lf63;->r0(J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    invoke-virtual {p0}, Lf63;->B0()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const/4 v5, 0x0

    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    iget-object v4, p0, Lf63;->X:Lwv3;

    .line 42
    .line 43
    iget v4, v4, Lwv3;->a:F

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    move v4, v5

    .line 47
    :goto_0
    invoke-virtual {p0}, Lf63;->B0()Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-eqz v6, :cond_3

    .line 52
    .line 53
    iget-object v5, p0, Lf63;->X:Lwv3;

    .line 54
    .line 55
    iget v5, v5, Lwv3;->b:F

    .line 56
    .line 57
    :cond_3
    invoke-virtual {p0}, Lf63;->B0()Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-eqz v6, :cond_4

    .line 62
    .line 63
    iget-object v6, p0, Lf63;->X:Lwv3;

    .line 64
    .line 65
    iget v6, v6, Lwv3;->c:F

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    invoke-virtual {p0}, Ljg3;->G()I

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    int-to-float v6, v6

    .line 73
    :goto_1
    invoke-virtual {p0}, Lf63;->B0()Z

    .line 74
    .line 75
    .line 76
    move-result v7

    .line 77
    if-eqz v7, :cond_5

    .line 78
    .line 79
    iget-object v7, p0, Lf63;->X:Lwv3;

    .line 80
    .line 81
    iget v7, v7, Lwv3;->d:F

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    invoke-virtual {p0}, Ljg3;->F()I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    int-to-float v7, v7

    .line 89
    :goto_2
    const/16 v8, 0x20

    .line 90
    .line 91
    shr-long v8, v2, v8

    .line 92
    .line 93
    long-to-int v8, v8

    .line 94
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    sub-float/2addr v4, v9

    .line 99
    iput v4, v1, Lv03;->b:F

    .line 100
    .line 101
    const-wide v9, 0xffffffffL

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    and-long/2addr v2, v9

    .line 107
    long-to-int v2, v2

    .line 108
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    sub-float/2addr v5, v3

    .line 113
    iput v5, v1, Lv03;->c:F

    .line 114
    .line 115
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    add-float/2addr v3, v6

    .line 120
    iput v3, v1, Lv03;->d:F

    .line 121
    .line 122
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    add-float/2addr v2, v7

    .line 127
    iput v2, v1, Lv03;->e:F

    .line 128
    .line 129
    :goto_3
    if-eq p0, v0, :cond_7

    .line 130
    .line 131
    const/4 v2, 0x0

    .line 132
    const/4 v3, 0x1

    .line 133
    invoke-virtual {p0, v1, v2, v3}, Lf63;->T0(Lv03;ZZ)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1}, Lv03;->c()Z

    .line 137
    .line 138
    .line 139
    move-result v2

    .line 140
    if-eqz v2, :cond_6

    .line 141
    .line 142
    :goto_4
    sget-object p0, Lwv3;->e:Lwv3;

    .line 143
    .line 144
    return-object p0

    .line 145
    :cond_6
    iget-object p0, p0, Lf63;->J:Lf63;

    .line 146
    .line 147
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_7
    new-instance p0, Lwv3;

    .line 152
    .line 153
    iget v0, v1, Lv03;->b:F

    .line 154
    .line 155
    iget v2, v1, Lv03;->c:F

    .line 156
    .line 157
    iget v3, v1, Lv03;->d:F

    .line 158
    .line 159
    iget v1, v1, Lv03;->e:F

    .line 160
    .line 161
    invoke-direct {p0, v0, v2, v3, v1}, Lwv3;-><init>(FFFF)V

    .line 162
    .line 163
    .line 164
    return-object p0
.end method

.method public final Y0(Lif1;Z)V
    .locals 12

    .line 1
    iget-object v0, p0, Lf63;->H:Lc72;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez p2, :cond_1

    .line 6
    .line 7
    iget-object p2, p0, Lf63;->M:Lif1;

    .line 8
    .line 9
    if-ne p2, p1, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lf63;->N:Loo0;

    .line 12
    .line 13
    iget-object v3, v0, Lc72;->J:Loo0;

    .line 14
    .line 15
    invoke-static {p2, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    iget-object p2, p0, Lf63;->O:Lr62;

    .line 22
    .line 23
    iget-object v3, v0, Lc72;->K:Lr62;

    .line 24
    .line 25
    if-eq p2, v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move p2, v1

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    :goto_0
    move p2, v2

    .line 31
    :goto_1
    iget-object v3, v0, Lc72;->J:Loo0;

    .line 32
    .line 33
    iput-object v3, p0, Lf63;->N:Loo0;

    .line 34
    .line 35
    iget-object v3, v0, Lc72;->K:Lr62;

    .line 36
    .line 37
    iput-object v3, p0, Lf63;->O:Lr62;

    .line 38
    .line 39
    invoke-virtual {v0}, Lc72;->G()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    const/4 v4, 0x0

    .line 44
    if-eqz v3, :cond_d

    .line 45
    .line 46
    if-eqz p1, :cond_d

    .line 47
    .line 48
    iput-object p1, p0, Lf63;->M:Lif1;

    .line 49
    .line 50
    iget-object p1, p0, Lf63;->g0:Ltb3;

    .line 51
    .line 52
    if-nez p1, :cond_b

    .line 53
    .line 54
    invoke-static {v0}, Lh12;->L(Lc72;)Lub3;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iget-object p2, p0, Lf63;->d0:Lib;

    .line 59
    .line 60
    if-nez p2, :cond_2

    .line 61
    .line 62
    new-instance p2, Lc63;

    .line 63
    .line 64
    invoke-direct {p2, p0, v1}, Lc63;-><init>(Lf63;I)V

    .line 65
    .line 66
    .line 67
    new-instance v3, Lib;

    .line 68
    .line 69
    const/4 v5, 0x6

    .line 70
    invoke-direct {v3, v5, p0, p2}, Lib;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    iput-object v3, p0, Lf63;->d0:Lib;

    .line 74
    .line 75
    move-object v10, v3

    .line 76
    goto :goto_2

    .line 77
    :cond_2
    move-object v10, p2

    .line 78
    :goto_2
    iget-object v11, p0, Lf63;->e0:Lc63;

    .line 79
    .line 80
    move-object v9, p1

    .line 81
    check-cast v9, Lra;

    .line 82
    .line 83
    iget-object p1, v9, Lra;->B0:Lhd5;

    .line 84
    .line 85
    :cond_3
    iget-object p2, p1, Lhd5;->p:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast p2, Ljava/lang/ref/ReferenceQueue;

    .line 88
    .line 89
    iget-object v3, p1, Lhd5;->o:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v3, Lf13;

    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    if-eqz p2, :cond_4

    .line 98
    .line 99
    invoke-virtual {v3, p2}, Lf13;->j(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    :cond_4
    if-nez p2, :cond_3

    .line 103
    .line 104
    :cond_5
    iget p1, v3, Lf13;->p:I

    .line 105
    .line 106
    if-eqz p1, :cond_6

    .line 107
    .line 108
    add-int/lit8 p1, p1, -0x1

    .line 109
    .line 110
    invoke-virtual {v3, p1}, Lf13;->k(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, Ljava/lang/ref/Reference;

    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-eqz p1, :cond_5

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_6
    move-object p1, v4

    .line 124
    :goto_3
    check-cast p1, Ltb3;

    .line 125
    .line 126
    if-eqz p1, :cond_a

    .line 127
    .line 128
    move-object p2, p1

    .line 129
    check-cast p2, Lvj1;

    .line 130
    .line 131
    iget-object v3, p2, Lvj1;->o:Lrj1;

    .line 132
    .line 133
    if-eqz v3, :cond_9

    .line 134
    .line 135
    iget-object v5, p2, Lvj1;->n:Lsj1;

    .line 136
    .line 137
    iget-boolean v5, v5, Lsj1;->s:Z

    .line 138
    .line 139
    if-nez v5, :cond_7

    .line 140
    .line 141
    const-string v5, "layer should have been released before reuse"

    .line 142
    .line 143
    invoke-static {v5}, Lcz1;->a(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    :cond_7
    check-cast v3, Ljw;

    .line 147
    .line 148
    invoke-virtual {v3}, Ljw;->m()Lsj1;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    iput-object v3, p2, Lvj1;->n:Lsj1;

    .line 153
    .line 154
    iput-boolean v1, p2, Lvj1;->t:Z

    .line 155
    .line 156
    iput-object v10, p2, Lvj1;->q:Lwf1;

    .line 157
    .line 158
    iput-object v11, p2, Lvj1;->r:Lgf1;

    .line 159
    .line 160
    iput-boolean v1, p2, Lvj1;->D:Z

    .line 161
    .line 162
    iput-boolean v1, p2, Lvj1;->E:Z

    .line 163
    .line 164
    iput-boolean v2, p2, Lvj1;->F:Z

    .line 165
    .line 166
    iget-object v3, p2, Lvj1;->u:[F

    .line 167
    .line 168
    invoke-static {v3}, Lya4;->G([F)V

    .line 169
    .line 170
    .line 171
    iget-object v3, p2, Lvj1;->v:[F

    .line 172
    .line 173
    if-eqz v3, :cond_8

    .line 174
    .line 175
    invoke-static {v3}, Lya4;->G([F)V

    .line 176
    .line 177
    .line 178
    :cond_8
    sget-wide v5, Ltw4;->a:J

    .line 179
    .line 180
    iput-wide v5, p2, Lvj1;->B:J

    .line 181
    .line 182
    const-wide v5, 0x7fffffff7fffffffL

    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    iput-wide v5, p2, Lvj1;->s:J

    .line 188
    .line 189
    iput-object v4, p2, Lvj1;->C:Lya4;

    .line 190
    .line 191
    iput v1, p2, Lvj1;->A:I

    .line 192
    .line 193
    goto :goto_4

    .line 194
    :cond_9
    const-string p0, "currently reuse is only supported when we manage the layer lifecycle"

    .line 195
    .line 196
    invoke-static {p0}, Lxa3;->l(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    throw p0

    .line 201
    :cond_a
    new-instance v6, Lvj1;

    .line 202
    .line 203
    invoke-virtual {v9}, Lra;->getGraphicsContext()Lrj1;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    check-cast p1, Ljw;

    .line 208
    .line 209
    invoke-virtual {p1}, Ljw;->m()Lsj1;

    .line 210
    .line 211
    .line 212
    move-result-object v7

    .line 213
    invoke-virtual {v9}, Lra;->getGraphicsContext()Lrj1;

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    invoke-direct/range {v6 .. v11}, Lvj1;-><init>(Lsj1;Lrj1;Lra;Lwf1;Lgf1;)V

    .line 218
    .line 219
    .line 220
    move-object p1, v6

    .line 221
    :goto_4
    iget-wide v3, p0, Ljg3;->p:J

    .line 222
    .line 223
    move-object p2, p1

    .line 224
    check-cast p2, Lvj1;

    .line 225
    .line 226
    invoke-virtual {p2, v3, v4}, Lvj1;->e(J)V

    .line 227
    .line 228
    .line 229
    iget-wide v3, p0, Lf63;->S:J

    .line 230
    .line 231
    invoke-virtual {p2, v3, v4}, Lvj1;->d(J)V

    .line 232
    .line 233
    .line 234
    iput-object p1, p0, Lf63;->g0:Ltb3;

    .line 235
    .line 236
    invoke-virtual {p0, v2}, Lf63;->Z0(Z)V

    .line 237
    .line 238
    .line 239
    iput-boolean v2, v0, Lc72;->U:Z

    .line 240
    .line 241
    iget-object p0, p0, Lf63;->e0:Lc63;

    .line 242
    .line 243
    invoke-virtual {p0}, Lc63;->invoke()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    return-void

    .line 247
    :cond_b
    if-eqz p2, :cond_c

    .line 248
    .line 249
    invoke-virtual {p0, v2}, Lf63;->Z0(Z)V

    .line 250
    .line 251
    .line 252
    :cond_c
    return-void

    .line 253
    :cond_d
    iput-object v4, p0, Lf63;->M:Lif1;

    .line 254
    .line 255
    iget-object p1, p0, Lf63;->g0:Ltb3;

    .line 256
    .line 257
    if-eqz p1, :cond_13

    .line 258
    .line 259
    check-cast p1, Lvj1;

    .line 260
    .line 261
    invoke-virtual {p1}, Lvj1;->b()[F

    .line 262
    .line 263
    .line 264
    move-result-object p2

    .line 265
    invoke-static {p2}, Ljz4;->B([F)Z

    .line 266
    .line 267
    .line 268
    move-result p2

    .line 269
    if-nez p2, :cond_e

    .line 270
    .line 271
    invoke-virtual {v0, p0}, Lc72;->M(Lf63;)V

    .line 272
    .line 273
    .line 274
    :cond_e
    iput-object v4, p1, Lvj1;->q:Lwf1;

    .line 275
    .line 276
    iput-object v4, p1, Lvj1;->r:Lgf1;

    .line 277
    .line 278
    iput-boolean v2, p1, Lvj1;->t:Z

    .line 279
    .line 280
    invoke-virtual {p1, v1}, Lvj1;->f(Z)V

    .line 281
    .line 282
    .line 283
    iget-object p2, p1, Lvj1;->o:Lrj1;

    .line 284
    .line 285
    if-eqz p2, :cond_12

    .line 286
    .line 287
    iget-object v3, p1, Lvj1;->n:Lsj1;

    .line 288
    .line 289
    check-cast p2, Ljw;

    .line 290
    .line 291
    iget-object p2, p2, Ljw;->p:Ljava/lang/Object;

    .line 292
    .line 293
    monitor-enter p2

    .line 294
    :try_start_0
    iget-boolean v5, v3, Lsj1;->s:Z

    .line 295
    .line 296
    if-nez v5, :cond_f

    .line 297
    .line 298
    iput-boolean v2, v3, Lsj1;->s:Z

    .line 299
    .line 300
    invoke-virtual {v3}, Lsj1;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 301
    .line 302
    .line 303
    :cond_f
    monitor-exit p2

    .line 304
    iget-object v3, p1, Lvj1;->p:Lra;

    .line 305
    .line 306
    iget-object v5, v3, Lra;->B0:Lhd5;

    .line 307
    .line 308
    :cond_10
    iget-object p2, v5, Lhd5;->p:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast p2, Ljava/lang/ref/ReferenceQueue;

    .line 311
    .line 312
    invoke-virtual {p2}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 313
    .line 314
    .line 315
    move-result-object p2

    .line 316
    if-eqz p2, :cond_11

    .line 317
    .line 318
    iget-object v6, v5, Lhd5;->o:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v6, Lf13;

    .line 321
    .line 322
    invoke-virtual {v6, p2}, Lf13;->j(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    :cond_11
    if-nez p2, :cond_10

    .line 326
    .line 327
    iget-object p2, v5, Lhd5;->o:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast p2, Lf13;

    .line 330
    .line 331
    new-instance v6, Ljava/lang/ref/WeakReference;

    .line 332
    .line 333
    iget-object v5, v5, Lhd5;->p:Ljava/lang/Object;

    .line 334
    .line 335
    check-cast v5, Ljava/lang/ref/ReferenceQueue;

    .line 336
    .line 337
    invoke-direct {v6, p1, v5}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {p2, v6}, Lf13;->b(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    iget-object p2, v3, Lra;->N:Lq03;

    .line 344
    .line 345
    invoke-virtual {p2, p1}, Lq03;->j(Ljava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    goto :goto_5

    .line 349
    :catchall_0
    move-exception v0

    .line 350
    move-object p0, v0

    .line 351
    monitor-exit p2

    .line 352
    throw p0

    .line 353
    :cond_12
    :goto_5
    iput-object v4, p0, Lf63;->g0:Ltb3;

    .line 354
    .line 355
    iput-boolean v2, v0, Lc72;->U:Z

    .line 356
    .line 357
    iget-object p1, p0, Lf63;->e0:Lc63;

    .line 358
    .line 359
    invoke-virtual {p1}, Lc63;->invoke()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    invoke-virtual {p0}, Lf63;->A0()Lcx2;

    .line 363
    .line 364
    .line 365
    move-result-object p1

    .line 366
    iget-boolean p1, p1, Lcx2;->A:Z

    .line 367
    .line 368
    if-eqz p1, :cond_13

    .line 369
    .line 370
    invoke-virtual {v0}, Lc72;->H()Z

    .line 371
    .line 372
    .line 373
    move-result p1

    .line 374
    if-eqz p1, :cond_13

    .line 375
    .line 376
    iget-object p1, v0, Lc72;->A:Lub3;

    .line 377
    .line 378
    if-eqz p1, :cond_13

    .line 379
    .line 380
    check-cast p1, Lra;

    .line 381
    .line 382
    invoke-virtual {p1, v0}, Lra;->t(Lc72;)V

    .line 383
    .line 384
    .line 385
    :cond_13
    iput-boolean v1, p0, Lf63;->f0:Z

    .line 386
    .line 387
    return-void
.end method

.method public final Z0(Z)V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lf63;->g0:Ltb3;

    .line 4
    .line 5
    iget-object v2, v0, Lf63;->M:Lif1;

    .line 6
    .line 7
    if-eqz v1, :cond_37

    .line 8
    .line 9
    if-eqz v2, :cond_36

    .line 10
    .line 11
    sget-object v3, Lf63;->j0:Lb24;

    .line 12
    .line 13
    invoke-virtual {v3}, Lb24;->a()V

    .line 14
    .line 15
    .line 16
    iget-object v4, v0, Lf63;->H:Lc72;

    .line 17
    .line 18
    iget-object v5, v4, Lc72;->J:Loo0;

    .line 19
    .line 20
    iput-object v5, v3, Lb24;->z:Loo0;

    .line 21
    .line 22
    iget-object v5, v4, Lc72;->K:Lr62;

    .line 23
    .line 24
    iput-object v5, v3, Lb24;->A:Lr62;

    .line 25
    .line 26
    iget-wide v5, v0, Ljg3;->p:J

    .line 27
    .line 28
    invoke-static {v5, v6}, Ll93;->o0(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v5

    .line 32
    iput-wide v5, v3, Lb24;->x:J

    .line 33
    .line 34
    new-instance v5, Lfx3;

    .line 35
    .line 36
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    invoke-static {v4}, Lh12;->L(Lc72;)Lub3;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    check-cast v6, Lra;

    .line 44
    .line 45
    invoke-virtual {v6}, Lra;->getSnapshotObserver()Lwb3;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    new-instance v7, Ljo;

    .line 50
    .line 51
    const/4 v8, 0x7

    .line 52
    invoke-direct {v7, v2, v0, v5, v8}, Ljo;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    iget-object v2, v6, Lwb3;->a:Lpp3;

    .line 56
    .line 57
    sget-object v6, Lf63;->h0:Lk52;

    .line 58
    .line 59
    invoke-virtual {v2, v0, v6, v7}, Lpp3;->e(Ljava/lang/Object;Lif1;Lgf1;)V

    .line 60
    .line 61
    .line 62
    iget-object v2, v0, Lf63;->V:Ln62;

    .line 63
    .line 64
    if-nez v2, :cond_0

    .line 65
    .line 66
    new-instance v2, Ln62;

    .line 67
    .line 68
    invoke-direct {v2}, Ln62;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object v2, v0, Lf63;->V:Ln62;

    .line 72
    .line 73
    :cond_0
    sget-object v6, Lf63;->k0:Ln62;

    .line 74
    .line 75
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    iget v7, v2, Ln62;->a:F

    .line 79
    .line 80
    iput v7, v6, Ln62;->a:F

    .line 81
    .line 82
    iget v7, v2, Ln62;->b:F

    .line 83
    .line 84
    iput v7, v6, Ln62;->b:F

    .line 85
    .line 86
    iget v7, v2, Ln62;->c:F

    .line 87
    .line 88
    iput v7, v6, Ln62;->c:F

    .line 89
    .line 90
    iget-wide v7, v2, Ln62;->d:J

    .line 91
    .line 92
    iput-wide v7, v6, Ln62;->d:J

    .line 93
    .line 94
    iget v7, v3, Lb24;->o:F

    .line 95
    .line 96
    iput v7, v2, Ln62;->a:F

    .line 97
    .line 98
    iget v7, v3, Lb24;->p:F

    .line 99
    .line 100
    iput v7, v2, Ln62;->b:F

    .line 101
    .line 102
    iget v7, v3, Lb24;->t:F

    .line 103
    .line 104
    iput v7, v2, Ln62;->c:F

    .line 105
    .line 106
    iget-wide v7, v3, Lb24;->u:J

    .line 107
    .line 108
    iput-wide v7, v2, Ln62;->d:J

    .line 109
    .line 110
    check-cast v1, Lvj1;

    .line 111
    .line 112
    iget-object v7, v1, Lvj1;->p:Lra;

    .line 113
    .line 114
    iget v8, v3, Lb24;->n:I

    .line 115
    .line 116
    iget v9, v1, Lvj1;->A:I

    .line 117
    .line 118
    or-int/2addr v8, v9

    .line 119
    iget-object v9, v3, Lb24;->A:Lr62;

    .line 120
    .line 121
    iput-object v9, v1, Lvj1;->y:Lr62;

    .line 122
    .line 123
    iget-object v9, v3, Lb24;->z:Loo0;

    .line 124
    .line 125
    iput-object v9, v1, Lvj1;->x:Loo0;

    .line 126
    .line 127
    const/high16 v10, 0x100000

    .line 128
    .line 129
    and-int/2addr v10, v8

    .line 130
    const/4 v11, 0x0

    .line 131
    if-eqz v10, :cond_1

    .line 132
    .line 133
    iget-object v10, v1, Lvj1;->n:Lsj1;

    .line 134
    .line 135
    iget-object v12, v3, Lb24;->y:Lm62;

    .line 136
    .line 137
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-interface {v9, v11}, Loo0;->V(F)I

    .line 141
    .line 142
    .line 143
    move-result v12

    .line 144
    iget-object v13, v3, Lb24;->y:Lm62;

    .line 145
    .line 146
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-interface {v9, v11}, Loo0;->V(F)I

    .line 150
    .line 151
    .line 152
    move-result v13

    .line 153
    iget-object v14, v3, Lb24;->y:Lm62;

    .line 154
    .line 155
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-interface {v9, v11}, Loo0;->V(F)I

    .line 159
    .line 160
    .line 161
    move-result v14

    .line 162
    iget-object v15, v3, Lb24;->y:Lm62;

    .line 163
    .line 164
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-interface {v9, v11}, Loo0;->V(F)I

    .line 168
    .line 169
    .line 170
    move-result v9

    .line 171
    iput v12, v10, Lsj1;->v:I

    .line 172
    .line 173
    iput v13, v10, Lsj1;->w:I

    .line 174
    .line 175
    iput v14, v10, Lsj1;->x:I

    .line 176
    .line 177
    iput v9, v10, Lsj1;->y:I

    .line 178
    .line 179
    iget-object v10, v10, Lsj1;->a:Luj1;

    .line 180
    .line 181
    invoke-interface {v10, v12, v13, v14, v9}, Luj1;->t(IIII)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1}, Lvj1;->c()V

    .line 185
    .line 186
    .line 187
    :cond_1
    and-int/lit16 v9, v8, 0x1000

    .line 188
    .line 189
    if-eqz v9, :cond_2

    .line 190
    .line 191
    iget-wide v12, v3, Lb24;->u:J

    .line 192
    .line 193
    iput-wide v12, v1, Lvj1;->B:J

    .line 194
    .line 195
    :cond_2
    and-int/lit8 v10, v8, 0x1

    .line 196
    .line 197
    if-eqz v10, :cond_4

    .line 198
    .line 199
    iget-object v10, v1, Lvj1;->n:Lsj1;

    .line 200
    .line 201
    iget v12, v3, Lb24;->o:F

    .line 202
    .line 203
    iget-object v10, v10, Lsj1;->a:Luj1;

    .line 204
    .line 205
    invoke-interface {v10}, Luj1;->c()F

    .line 206
    .line 207
    .line 208
    move-result v13

    .line 209
    cmpg-float v13, v13, v12

    .line 210
    .line 211
    if-nez v13, :cond_3

    .line 212
    .line 213
    goto :goto_0

    .line 214
    :cond_3
    invoke-interface {v10, v12}, Luj1;->A(F)V

    .line 215
    .line 216
    .line 217
    :cond_4
    :goto_0
    and-int/lit8 v10, v8, 0x2

    .line 218
    .line 219
    if-eqz v10, :cond_6

    .line 220
    .line 221
    iget-object v10, v1, Lvj1;->n:Lsj1;

    .line 222
    .line 223
    iget v12, v3, Lb24;->p:F

    .line 224
    .line 225
    iget-object v10, v10, Lsj1;->a:Luj1;

    .line 226
    .line 227
    invoke-interface {v10}, Luj1;->N()F

    .line 228
    .line 229
    .line 230
    move-result v13

    .line 231
    cmpg-float v13, v13, v12

    .line 232
    .line 233
    if-nez v13, :cond_5

    .line 234
    .line 235
    goto :goto_1

    .line 236
    :cond_5
    invoke-interface {v10, v12}, Luj1;->j(F)V

    .line 237
    .line 238
    .line 239
    :cond_6
    :goto_1
    and-int/lit8 v10, v8, 0x4

    .line 240
    .line 241
    if-eqz v10, :cond_8

    .line 242
    .line 243
    iget-object v10, v1, Lvj1;->n:Lsj1;

    .line 244
    .line 245
    iget v12, v3, Lb24;->q:F

    .line 246
    .line 247
    iget-object v10, v10, Lsj1;->a:Luj1;

    .line 248
    .line 249
    invoke-interface {v10}, Luj1;->b()F

    .line 250
    .line 251
    .line 252
    move-result v13

    .line 253
    cmpg-float v13, v13, v12

    .line 254
    .line 255
    if-nez v13, :cond_7

    .line 256
    .line 257
    goto :goto_2

    .line 258
    :cond_7
    invoke-interface {v10, v12}, Luj1;->s(F)V

    .line 259
    .line 260
    .line 261
    :cond_8
    :goto_2
    and-int/lit8 v10, v8, 0x8

    .line 262
    .line 263
    if-eqz v10, :cond_a

    .line 264
    .line 265
    iget-object v10, v1, Lvj1;->n:Lsj1;

    .line 266
    .line 267
    iget-object v10, v10, Lsj1;->a:Luj1;

    .line 268
    .line 269
    invoke-interface {v10}, Luj1;->D()F

    .line 270
    .line 271
    .line 272
    move-result v12

    .line 273
    cmpg-float v12, v12, v11

    .line 274
    .line 275
    if-nez v12, :cond_9

    .line 276
    .line 277
    goto :goto_3

    .line 278
    :cond_9
    invoke-interface {v10}, Luj1;->E()V

    .line 279
    .line 280
    .line 281
    :cond_a
    :goto_3
    and-int/lit8 v10, v8, 0x10

    .line 282
    .line 283
    if-eqz v10, :cond_c

    .line 284
    .line 285
    iget-object v10, v1, Lvj1;->n:Lsj1;

    .line 286
    .line 287
    iget-object v10, v10, Lsj1;->a:Luj1;

    .line 288
    .line 289
    invoke-interface {v10}, Luj1;->u()F

    .line 290
    .line 291
    .line 292
    move-result v12

    .line 293
    cmpg-float v12, v12, v11

    .line 294
    .line 295
    if-nez v12, :cond_b

    .line 296
    .line 297
    goto :goto_4

    .line 298
    :cond_b
    invoke-interface {v10}, Luj1;->v()V

    .line 299
    .line 300
    .line 301
    :cond_c
    :goto_4
    and-int/lit8 v10, v8, 0x20

    .line 302
    .line 303
    const/4 v12, 0x1

    .line 304
    if-eqz v10, :cond_e

    .line 305
    .line 306
    iget-object v10, v1, Lvj1;->n:Lsj1;

    .line 307
    .line 308
    iget-object v13, v10, Lsj1;->a:Luj1;

    .line 309
    .line 310
    invoke-interface {v13}, Luj1;->M()F

    .line 311
    .line 312
    .line 313
    move-result v14

    .line 314
    cmpg-float v14, v14, v11

    .line 315
    .line 316
    if-nez v14, :cond_d

    .line 317
    .line 318
    goto :goto_5

    .line 319
    :cond_d
    invoke-interface {v13}, Luj1;->C()V

    .line 320
    .line 321
    .line 322
    iput-boolean v12, v10, Lsj1;->g:Z

    .line 323
    .line 324
    invoke-virtual {v10}, Lsj1;->a()V

    .line 325
    .line 326
    .line 327
    :cond_e
    :goto_5
    and-int/lit8 v10, v8, 0x40

    .line 328
    .line 329
    if-eqz v10, :cond_f

    .line 330
    .line 331
    iget-object v10, v1, Lvj1;->n:Lsj1;

    .line 332
    .line 333
    iget-wide v13, v3, Lb24;->r:J

    .line 334
    .line 335
    iget-object v10, v10, Lsj1;->a:Luj1;

    .line 336
    .line 337
    move v15, v11

    .line 338
    invoke-interface {v10}, Luj1;->p()J

    .line 339
    .line 340
    .line 341
    move-result-wide v11

    .line 342
    invoke-static {v13, v14, v11, v12}, Lx40;->c(JJ)Z

    .line 343
    .line 344
    .line 345
    move-result v11

    .line 346
    if-nez v11, :cond_10

    .line 347
    .line 348
    invoke-interface {v10, v13, v14}, Luj1;->y(J)V

    .line 349
    .line 350
    .line 351
    goto :goto_6

    .line 352
    :cond_f
    move v15, v11

    .line 353
    :cond_10
    :goto_6
    and-int/lit16 v10, v8, 0x80

    .line 354
    .line 355
    if-eqz v10, :cond_11

    .line 356
    .line 357
    iget-object v10, v1, Lvj1;->n:Lsj1;

    .line 358
    .line 359
    iget-wide v11, v3, Lb24;->s:J

    .line 360
    .line 361
    iget-object v10, v10, Lsj1;->a:Luj1;

    .line 362
    .line 363
    invoke-interface {v10}, Luj1;->x()J

    .line 364
    .line 365
    .line 366
    move-result-wide v13

    .line 367
    invoke-static {v11, v12, v13, v14}, Lx40;->c(JJ)Z

    .line 368
    .line 369
    .line 370
    move-result v13

    .line 371
    if-nez v13, :cond_11

    .line 372
    .line 373
    invoke-interface {v10, v11, v12}, Luj1;->J(J)V

    .line 374
    .line 375
    .line 376
    :cond_11
    and-int/lit16 v10, v8, 0x400

    .line 377
    .line 378
    if-eqz v10, :cond_13

    .line 379
    .line 380
    iget-object v10, v1, Lvj1;->n:Lsj1;

    .line 381
    .line 382
    iget-object v10, v10, Lsj1;->a:Luj1;

    .line 383
    .line 384
    invoke-interface {v10}, Luj1;->n()F

    .line 385
    .line 386
    .line 387
    move-result v11

    .line 388
    cmpg-float v11, v11, v15

    .line 389
    .line 390
    if-nez v11, :cond_12

    .line 391
    .line 392
    goto :goto_7

    .line 393
    :cond_12
    invoke-interface {v10}, Luj1;->I()V

    .line 394
    .line 395
    .line 396
    :cond_13
    :goto_7
    and-int/lit16 v10, v8, 0x100

    .line 397
    .line 398
    if-eqz v10, :cond_15

    .line 399
    .line 400
    iget-object v10, v1, Lvj1;->n:Lsj1;

    .line 401
    .line 402
    iget-object v10, v10, Lsj1;->a:Luj1;

    .line 403
    .line 404
    invoke-interface {v10}, Luj1;->G()F

    .line 405
    .line 406
    .line 407
    move-result v11

    .line 408
    cmpg-float v11, v11, v15

    .line 409
    .line 410
    if-nez v11, :cond_14

    .line 411
    .line 412
    goto :goto_8

    .line 413
    :cond_14
    invoke-interface {v10}, Luj1;->r()V

    .line 414
    .line 415
    .line 416
    :cond_15
    :goto_8
    and-int/lit16 v10, v8, 0x200

    .line 417
    .line 418
    if-eqz v10, :cond_17

    .line 419
    .line 420
    iget-object v10, v1, Lvj1;->n:Lsj1;

    .line 421
    .line 422
    iget-object v10, v10, Lsj1;->a:Luj1;

    .line 423
    .line 424
    invoke-interface {v10}, Luj1;->l()F

    .line 425
    .line 426
    .line 427
    move-result v11

    .line 428
    cmpg-float v11, v11, v15

    .line 429
    .line 430
    if-nez v11, :cond_16

    .line 431
    .line 432
    goto :goto_9

    .line 433
    :cond_16
    invoke-interface {v10}, Luj1;->w()V

    .line 434
    .line 435
    .line 436
    :cond_17
    :goto_9
    and-int/lit16 v10, v8, 0x800

    .line 437
    .line 438
    if-eqz v10, :cond_19

    .line 439
    .line 440
    iget-object v10, v1, Lvj1;->n:Lsj1;

    .line 441
    .line 442
    iget v11, v3, Lb24;->t:F

    .line 443
    .line 444
    iget-object v10, v10, Lsj1;->a:Luj1;

    .line 445
    .line 446
    invoke-interface {v10}, Luj1;->B()F

    .line 447
    .line 448
    .line 449
    move-result v12

    .line 450
    cmpg-float v12, v12, v11

    .line 451
    .line 452
    if-nez v12, :cond_18

    .line 453
    .line 454
    goto :goto_a

    .line 455
    :cond_18
    invoke-interface {v10, v11}, Luj1;->L(F)V

    .line 456
    .line 457
    .line 458
    :cond_19
    :goto_a
    const-wide v13, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    const/16 v16, 0x20

    .line 464
    .line 465
    const-wide v17, 0xffffffffL

    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    if-eqz v9, :cond_1c

    .line 471
    .line 472
    iget-wide v11, v1, Lvj1;->B:J

    .line 473
    .line 474
    sget-wide v19, Ltw4;->a:J

    .line 475
    .line 476
    cmp-long v9, v11, v19

    .line 477
    .line 478
    if-nez v9, :cond_1a

    .line 479
    .line 480
    const/4 v9, 0x1

    .line 481
    goto :goto_b

    .line 482
    :cond_1a
    const/4 v9, 0x0

    .line 483
    :goto_b
    iget-object v15, v1, Lvj1;->n:Lsj1;

    .line 484
    .line 485
    if-eqz v9, :cond_1b

    .line 486
    .line 487
    iget-wide v11, v15, Lsj1;->z:J

    .line 488
    .line 489
    invoke-static {v11, v12, v13, v14}, Lg83;->b(JJ)Z

    .line 490
    .line 491
    .line 492
    move-result v9

    .line 493
    if-nez v9, :cond_1c

    .line 494
    .line 495
    iput-wide v13, v15, Lsj1;->z:J

    .line 496
    .line 497
    iget-object v9, v15, Lsj1;->a:Luj1;

    .line 498
    .line 499
    invoke-interface {v9, v13, v14}, Luj1;->o(J)V

    .line 500
    .line 501
    .line 502
    goto :goto_c

    .line 503
    :cond_1b
    shr-long v11, v11, v16

    .line 504
    .line 505
    long-to-int v9, v11

    .line 506
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 507
    .line 508
    .line 509
    move-result v9

    .line 510
    iget-wide v11, v1, Lvj1;->s:J

    .line 511
    .line 512
    shr-long v11, v11, v16

    .line 513
    .line 514
    long-to-int v11, v11

    .line 515
    int-to-float v11, v11

    .line 516
    mul-float/2addr v9, v11

    .line 517
    iget-wide v11, v1, Lvj1;->B:J

    .line 518
    .line 519
    and-long v11, v11, v17

    .line 520
    .line 521
    long-to-int v11, v11

    .line 522
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 523
    .line 524
    .line 525
    move-result v11

    .line 526
    iget-wide v13, v1, Lvj1;->s:J

    .line 527
    .line 528
    and-long v12, v13, v17

    .line 529
    .line 530
    long-to-int v12, v12

    .line 531
    int-to-float v12, v12

    .line 532
    mul-float/2addr v11, v12

    .line 533
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 534
    .line 535
    .line 536
    move-result v9

    .line 537
    int-to-long v12, v9

    .line 538
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 539
    .line 540
    .line 541
    move-result v9

    .line 542
    int-to-long v10, v9

    .line 543
    shl-long v12, v12, v16

    .line 544
    .line 545
    and-long v9, v10, v17

    .line 546
    .line 547
    or-long/2addr v9, v12

    .line 548
    iget-wide v11, v15, Lsj1;->z:J

    .line 549
    .line 550
    invoke-static {v11, v12, v9, v10}, Lg83;->b(JJ)Z

    .line 551
    .line 552
    .line 553
    move-result v11

    .line 554
    if-nez v11, :cond_1c

    .line 555
    .line 556
    iput-wide v9, v15, Lsj1;->z:J

    .line 557
    .line 558
    iget-object v11, v15, Lsj1;->a:Luj1;

    .line 559
    .line 560
    invoke-interface {v11, v9, v10}, Luj1;->o(J)V

    .line 561
    .line 562
    .line 563
    :cond_1c
    :goto_c
    and-int/lit16 v9, v8, 0x4000

    .line 564
    .line 565
    if-eqz v9, :cond_1d

    .line 566
    .line 567
    iget-object v9, v1, Lvj1;->n:Lsj1;

    .line 568
    .line 569
    iget-boolean v10, v3, Lb24;->w:Z

    .line 570
    .line 571
    iget-boolean v11, v9, Lsj1;->A:Z

    .line 572
    .line 573
    if-eq v11, v10, :cond_1d

    .line 574
    .line 575
    iput-boolean v10, v9, Lsj1;->A:Z

    .line 576
    .line 577
    const/4 v10, 0x1

    .line 578
    iput-boolean v10, v9, Lsj1;->g:Z

    .line 579
    .line 580
    invoke-virtual {v9}, Lsj1;->a()V

    .line 581
    .line 582
    .line 583
    :cond_1d
    const/high16 v9, 0x20000

    .line 584
    .line 585
    and-int/2addr v9, v8

    .line 586
    if-eqz v9, :cond_1e

    .line 587
    .line 588
    iget-object v9, v1, Lvj1;->n:Lsj1;

    .line 589
    .line 590
    iget-object v9, v9, Lsj1;->a:Luj1;

    .line 591
    .line 592
    :cond_1e
    const/high16 v9, 0x40000

    .line 593
    .line 594
    and-int/2addr v9, v8

    .line 595
    const/4 v10, 0x0

    .line 596
    if-eqz v9, :cond_1f

    .line 597
    .line 598
    iget-object v9, v1, Lvj1;->n:Lsj1;

    .line 599
    .line 600
    iget-object v9, v9, Lsj1;->a:Luj1;

    .line 601
    .line 602
    invoke-interface {v9}, Luj1;->i()Ldt;

    .line 603
    .line 604
    .line 605
    move-result-object v11

    .line 606
    invoke-static {v11, v10}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 607
    .line 608
    .line 609
    move-result v11

    .line 610
    if-nez v11, :cond_1f

    .line 611
    .line 612
    invoke-interface {v9}, Luj1;->z()V

    .line 613
    .line 614
    .line 615
    :cond_1f
    const/high16 v9, 0x80000

    .line 616
    .line 617
    and-int/2addr v9, v8

    .line 618
    if-eqz v9, :cond_21

    .line 619
    .line 620
    iget-object v9, v1, Lvj1;->n:Lsj1;

    .line 621
    .line 622
    iget v11, v3, Lb24;->B:I

    .line 623
    .line 624
    iget-object v9, v9, Lsj1;->a:Luj1;

    .line 625
    .line 626
    invoke-interface {v9}, Luj1;->O()I

    .line 627
    .line 628
    .line 629
    move-result v12

    .line 630
    if-ne v12, v11, :cond_20

    .line 631
    .line 632
    goto :goto_d

    .line 633
    :cond_20
    invoke-interface {v9, v11}, Luj1;->e(I)V

    .line 634
    .line 635
    .line 636
    :cond_21
    :goto_d
    const v9, 0x8000

    .line 637
    .line 638
    .line 639
    and-int/2addr v9, v8

    .line 640
    if-eqz v9, :cond_23

    .line 641
    .line 642
    iget-object v9, v1, Lvj1;->n:Lsj1;

    .line 643
    .line 644
    iget-object v9, v9, Lsj1;->a:Luj1;

    .line 645
    .line 646
    invoke-interface {v9}, Luj1;->h()I

    .line 647
    .line 648
    .line 649
    move-result v11

    .line 650
    if-nez v11, :cond_22

    .line 651
    .line 652
    goto :goto_e

    .line 653
    :cond_22
    const/4 v14, 0x0

    .line 654
    invoke-interface {v9, v14}, Luj1;->H(I)V

    .line 655
    .line 656
    .line 657
    :cond_23
    :goto_e
    and-int/lit16 v9, v8, 0x1f1b

    .line 658
    .line 659
    if-eqz v9, :cond_24

    .line 660
    .line 661
    const/4 v9, 0x1

    .line 662
    iput-boolean v9, v1, Lvj1;->D:Z

    .line 663
    .line 664
    iput-boolean v9, v1, Lvj1;->E:Z

    .line 665
    .line 666
    :cond_24
    iget-object v9, v1, Lvj1;->C:Lya4;

    .line 667
    .line 668
    iget-object v11, v3, Lb24;->C:Lya4;

    .line 669
    .line 670
    invoke-static {v9, v11}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 671
    .line 672
    .line 673
    move-result v9

    .line 674
    if-nez v9, :cond_2c

    .line 675
    .line 676
    iget-object v9, v3, Lb24;->C:Lya4;

    .line 677
    .line 678
    iput-object v9, v1, Lvj1;->C:Lya4;

    .line 679
    .line 680
    if-nez v9, :cond_25

    .line 681
    .line 682
    move-object/from16 v28, v4

    .line 683
    .line 684
    move-object/from16 v29, v5

    .line 685
    .line 686
    goto/16 :goto_11

    .line 687
    .line 688
    :cond_25
    iget-object v11, v1, Lvj1;->n:Lsj1;

    .line 689
    .line 690
    instance-of v12, v9, Lnb3;

    .line 691
    .line 692
    if-eqz v12, :cond_26

    .line 693
    .line 694
    move-object v12, v9

    .line 695
    check-cast v12, Lnb3;

    .line 696
    .line 697
    iget-object v12, v12, Lnb3;->f:Lwv3;

    .line 698
    .line 699
    iget v13, v12, Lwv3;->a:F

    .line 700
    .line 701
    iget v15, v12, Lwv3;->b:F

    .line 702
    .line 703
    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 704
    .line 705
    .line 706
    move-result v14

    .line 707
    move-object/from16 v22, v11

    .line 708
    .line 709
    int-to-long v10, v14

    .line 710
    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 711
    .line 712
    .line 713
    move-result v14

    .line 714
    move-wide/from16 v20, v10

    .line 715
    .line 716
    int-to-long v10, v14

    .line 717
    shl-long v20, v20, v16

    .line 718
    .line 719
    and-long v10, v10, v17

    .line 720
    .line 721
    or-long v23, v20, v10

    .line 722
    .line 723
    iget v10, v12, Lwv3;->c:F

    .line 724
    .line 725
    sub-float/2addr v10, v13

    .line 726
    iget v11, v12, Lwv3;->d:F

    .line 727
    .line 728
    sub-float/2addr v11, v15

    .line 729
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 730
    .line 731
    .line 732
    move-result v10

    .line 733
    int-to-long v12, v10

    .line 734
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 735
    .line 736
    .line 737
    move-result v10

    .line 738
    int-to-long v10, v10

    .line 739
    shl-long v12, v12, v16

    .line 740
    .line 741
    and-long v10, v10, v17

    .line 742
    .line 743
    or-long v25, v12, v10

    .line 744
    .line 745
    const/16 v27, 0x0

    .line 746
    .line 747
    invoke-virtual/range {v22 .. v27}, Lsj1;->f(JJF)V

    .line 748
    .line 749
    .line 750
    :goto_f
    move-object/from16 v28, v4

    .line 751
    .line 752
    move-object/from16 v29, v5

    .line 753
    .line 754
    goto/16 :goto_10

    .line 755
    .line 756
    :cond_26
    move-object v10, v11

    .line 757
    instance-of v11, v9, Lmb3;

    .line 758
    .line 759
    const-wide/16 v12, 0x0

    .line 760
    .line 761
    if-eqz v11, :cond_27

    .line 762
    .line 763
    move-object v11, v9

    .line 764
    check-cast v11, Lmb3;

    .line 765
    .line 766
    iget-object v11, v11, Lmb3;->f:Lnc;

    .line 767
    .line 768
    const/4 v14, 0x0

    .line 769
    iput-object v14, v10, Lsj1;->k:Lya4;

    .line 770
    .line 771
    const-wide v14, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    iput-wide v14, v10, Lsj1;->i:J

    .line 777
    .line 778
    iput-wide v12, v10, Lsj1;->h:J

    .line 779
    .line 780
    const/4 v15, 0x0

    .line 781
    iput v15, v10, Lsj1;->j:F

    .line 782
    .line 783
    const/4 v12, 0x1

    .line 784
    iput-boolean v12, v10, Lsj1;->g:Z

    .line 785
    .line 786
    const/4 v14, 0x0

    .line 787
    iput-boolean v14, v10, Lsj1;->n:Z

    .line 788
    .line 789
    iput-object v11, v10, Lsj1;->l:Lnc;

    .line 790
    .line 791
    invoke-virtual {v10}, Lsj1;->a()V

    .line 792
    .line 793
    .line 794
    goto :goto_f

    .line 795
    :cond_27
    instance-of v11, v9, Lob3;

    .line 796
    .line 797
    if-eqz v11, :cond_2b

    .line 798
    .line 799
    move-object v11, v9

    .line 800
    check-cast v11, Lob3;

    .line 801
    .line 802
    iget-object v14, v11, Lob3;->g:Lnc;

    .line 803
    .line 804
    if-eqz v14, :cond_28

    .line 805
    .line 806
    const/4 v15, 0x0

    .line 807
    iput-object v15, v10, Lsj1;->k:Lya4;

    .line 808
    .line 809
    move-object/from16 v28, v4

    .line 810
    .line 811
    move-object/from16 v29, v5

    .line 812
    .line 813
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    iput-wide v4, v10, Lsj1;->i:J

    .line 819
    .line 820
    iput-wide v12, v10, Lsj1;->h:J

    .line 821
    .line 822
    const/4 v15, 0x0

    .line 823
    iput v15, v10, Lsj1;->j:F

    .line 824
    .line 825
    const/4 v12, 0x1

    .line 826
    iput-boolean v12, v10, Lsj1;->g:Z

    .line 827
    .line 828
    const/4 v4, 0x0

    .line 829
    iput-boolean v4, v10, Lsj1;->n:Z

    .line 830
    .line 831
    iput-object v14, v10, Lsj1;->l:Lnc;

    .line 832
    .line 833
    invoke-virtual {v10}, Lsj1;->a()V

    .line 834
    .line 835
    .line 836
    goto :goto_10

    .line 837
    :cond_28
    move-object/from16 v28, v4

    .line 838
    .line 839
    move-object/from16 v29, v5

    .line 840
    .line 841
    const/4 v4, 0x0

    .line 842
    iget-object v5, v11, Lob3;->f:Lg34;

    .line 843
    .line 844
    iget v11, v5, Lg34;->b:F

    .line 845
    .line 846
    iget v12, v5, Lg34;->a:F

    .line 847
    .line 848
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 849
    .line 850
    .line 851
    move-result v13

    .line 852
    int-to-long v13, v13

    .line 853
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 854
    .line 855
    .line 856
    move-result v4

    .line 857
    move-object/from16 v22, v10

    .line 858
    .line 859
    move/from16 v19, v11

    .line 860
    .line 861
    int-to-long v10, v4

    .line 862
    shl-long v13, v13, v16

    .line 863
    .line 864
    and-long v10, v10, v17

    .line 865
    .line 866
    or-long v23, v13, v10

    .line 867
    .line 868
    iget v4, v5, Lg34;->c:F

    .line 869
    .line 870
    sub-float/2addr v4, v12

    .line 871
    iget v10, v5, Lg34;->d:F

    .line 872
    .line 873
    sub-float v10, v10, v19

    .line 874
    .line 875
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 876
    .line 877
    .line 878
    move-result v4

    .line 879
    int-to-long v11, v4

    .line 880
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 881
    .line 882
    .line 883
    move-result v4

    .line 884
    int-to-long v13, v4

    .line 885
    shl-long v10, v11, v16

    .line 886
    .line 887
    and-long v12, v13, v17

    .line 888
    .line 889
    or-long v25, v10, v12

    .line 890
    .line 891
    iget-wide v4, v5, Lg34;->h:J

    .line 892
    .line 893
    shr-long v4, v4, v16

    .line 894
    .line 895
    long-to-int v4, v4

    .line 896
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 897
    .line 898
    .line 899
    move-result v27

    .line 900
    invoke-virtual/range {v22 .. v27}, Lsj1;->f(JJF)V

    .line 901
    .line 902
    .line 903
    :goto_10
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 904
    .line 905
    const/16 v5, 0x21

    .line 906
    .line 907
    if-ge v4, v5, :cond_2a

    .line 908
    .line 909
    instance-of v4, v9, Lmb3;

    .line 910
    .line 911
    if-nez v4, :cond_29

    .line 912
    .line 913
    instance-of v4, v9, Lob3;

    .line 914
    .line 915
    if-eqz v4, :cond_2a

    .line 916
    .line 917
    check-cast v9, Lob3;

    .line 918
    .line 919
    iget-object v4, v9, Lob3;->f:Lg34;

    .line 920
    .line 921
    invoke-static {v4}, Lwr1;->K(Lg34;)Z

    .line 922
    .line 923
    .line 924
    move-result v4

    .line 925
    if-nez v4, :cond_2a

    .line 926
    .line 927
    :cond_29
    iget-object v4, v1, Lvj1;->r:Lgf1;

    .line 928
    .line 929
    if-eqz v4, :cond_2a

    .line 930
    .line 931
    invoke-interface {v4}, Lgf1;->invoke()Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    :cond_2a
    :goto_11
    const/4 v10, 0x1

    .line 935
    goto :goto_12

    .line 936
    :cond_2b
    invoke-static {}, Ler1;->n()V

    .line 937
    .line 938
    .line 939
    return-void

    .line 940
    :cond_2c
    move-object/from16 v28, v4

    .line 941
    .line 942
    move-object/from16 v29, v5

    .line 943
    .line 944
    const/4 v10, 0x0

    .line 945
    :goto_12
    iget v4, v3, Lb24;->n:I

    .line 946
    .line 947
    iput v4, v1, Lvj1;->A:I

    .line 948
    .line 949
    if-nez v8, :cond_2d

    .line 950
    .line 951
    if-eqz v10, :cond_30

    .line 952
    .line 953
    :cond_2d
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 954
    .line 955
    const/16 v4, 0x1a

    .line 956
    .line 957
    if-lt v1, v4, :cond_2e

    .line 958
    .line 959
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 960
    .line 961
    .line 962
    move-result-object v1

    .line 963
    if-eqz v1, :cond_2f

    .line 964
    .line 965
    invoke-static {v1, v7, v7}, Lrg3;->k(Landroid/view/ViewParent;Landroid/view/View;Landroid/view/View;)V

    .line 966
    .line 967
    .line 968
    goto :goto_13

    .line 969
    :cond_2e
    invoke-virtual {v7}, Landroid/view/View;->invalidate()V

    .line 970
    .line 971
    .line 972
    :cond_2f
    :goto_13
    invoke-static {}, Lra;->l()Z

    .line 973
    .line 974
    .line 975
    move-result v1

    .line 976
    if-eqz v1, :cond_30

    .line 977
    .line 978
    const/4 v15, 0x0

    .line 979
    invoke-virtual {v7, v15}, Lra;->J(F)V

    .line 980
    .line 981
    .line 982
    :cond_30
    iget-boolean v1, v0, Lf63;->L:Z

    .line 983
    .line 984
    iget-boolean v4, v3, Lb24;->w:Z

    .line 985
    .line 986
    iput-boolean v4, v0, Lf63;->L:Z

    .line 987
    .line 988
    iget v3, v3, Lb24;->q:F

    .line 989
    .line 990
    iput v3, v0, Lf63;->P:F

    .line 991
    .line 992
    iget v3, v6, Ln62;->a:F

    .line 993
    .line 994
    iget v5, v2, Ln62;->a:F

    .line 995
    .line 996
    cmpg-float v3, v3, v5

    .line 997
    .line 998
    if-nez v3, :cond_31

    .line 999
    .line 1000
    iget v3, v6, Ln62;->b:F

    .line 1001
    .line 1002
    iget v5, v2, Ln62;->b:F

    .line 1003
    .line 1004
    cmpg-float v3, v3, v5

    .line 1005
    .line 1006
    if-nez v3, :cond_31

    .line 1007
    .line 1008
    iget v3, v6, Ln62;->c:F

    .line 1009
    .line 1010
    iget v5, v2, Ln62;->c:F

    .line 1011
    .line 1012
    cmpg-float v3, v3, v5

    .line 1013
    .line 1014
    if-nez v3, :cond_31

    .line 1015
    .line 1016
    iget-wide v5, v6, Ln62;->d:J

    .line 1017
    .line 1018
    iget-wide v2, v2, Ln62;->d:J

    .line 1019
    .line 1020
    cmp-long v2, v5, v2

    .line 1021
    .line 1022
    if-nez v2, :cond_31

    .line 1023
    .line 1024
    const/4 v10, 0x1

    .line 1025
    goto :goto_14

    .line 1026
    :cond_31
    const/4 v10, 0x0

    .line 1027
    :goto_14
    if-eqz p1, :cond_33

    .line 1028
    .line 1029
    if-eqz v10, :cond_32

    .line 1030
    .line 1031
    if-ne v1, v4, :cond_32

    .line 1032
    .line 1033
    move-object/from16 v1, v29

    .line 1034
    .line 1035
    iget-boolean v1, v1, Lfx3;->n:Z

    .line 1036
    .line 1037
    if-eqz v1, :cond_33

    .line 1038
    .line 1039
    :cond_32
    move-object/from16 v1, v28

    .line 1040
    .line 1041
    goto :goto_15

    .line 1042
    :cond_33
    move-object/from16 v1, v28

    .line 1043
    .line 1044
    goto :goto_16

    .line 1045
    :goto_15
    iget-object v2, v1, Lc72;->A:Lub3;

    .line 1046
    .line 1047
    if-eqz v2, :cond_34

    .line 1048
    .line 1049
    check-cast v2, Lra;

    .line 1050
    .line 1051
    invoke-virtual {v2, v1}, Lra;->t(Lc72;)V

    .line 1052
    .line 1053
    .line 1054
    :cond_34
    :goto_16
    if-nez v10, :cond_38

    .line 1055
    .line 1056
    invoke-virtual {v1, v0}, Lc72;->M(Lf63;)V

    .line 1057
    .line 1058
    .line 1059
    iget v0, v1, Lc72;->Y:I

    .line 1060
    .line 1061
    if-lez v0, :cond_38

    .line 1062
    .line 1063
    invoke-static {v1}, Lh12;->L(Lc72;)Lub3;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v0

    .line 1067
    check-cast v0, Lra;

    .line 1068
    .line 1069
    iget-object v2, v0, Lra;->f0:Lri2;

    .line 1070
    .line 1071
    iget-object v2, v2, Lri2;->e:Lrm3;

    .line 1072
    .line 1073
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1074
    .line 1075
    .line 1076
    iget v3, v1, Lc72;->Y:I

    .line 1077
    .line 1078
    if-lez v3, :cond_35

    .line 1079
    .line 1080
    iget-object v2, v2, Lrm3;->n:Ljava/lang/Object;

    .line 1081
    .line 1082
    check-cast v2, Lf13;

    .line 1083
    .line 1084
    invoke-virtual {v2, v1}, Lf13;->b(Ljava/lang/Object;)V

    .line 1085
    .line 1086
    .line 1087
    const/4 v12, 0x1

    .line 1088
    iput-boolean v12, v1, Lc72;->X:Z

    .line 1089
    .line 1090
    :cond_35
    const/4 v14, 0x0

    .line 1091
    invoke-virtual {v0, v14}, Lra;->D(Lc72;)V

    .line 1092
    .line 1093
    .line 1094
    return-void

    .line 1095
    :cond_36
    const-string v0, "updateLayerParameters requires a non-null layerBlock"

    .line 1096
    .line 1097
    invoke-static {v0}, Lxa3;->l(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v0

    .line 1101
    throw v0

    .line 1102
    :cond_37
    if-nez v2, :cond_39

    .line 1103
    .line 1104
    :cond_38
    return-void

    .line 1105
    :cond_39
    const-string v0, "null layer with a non-null layerBlock"

    .line 1106
    .line 1107
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 1108
    .line 1109
    .line 1110
    return-void
.end method

.method public final a1(J)Z
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-wide v1, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    and-long v3, p1, v1

    .line 9
    .line 10
    xor-long/2addr v1, v3

    .line 11
    const-wide v3, 0x100000001L

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    sub-long/2addr v1, v3

    .line 17
    const-wide v3, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr v1, v3

    .line 23
    const-wide/16 v3, 0x0

    .line 24
    .line 25
    cmp-long v1, v1, v3

    .line 26
    .line 27
    if-nez v1, :cond_d

    .line 28
    .line 29
    iget-object v1, v0, Lf63;->g0:Ltb3;

    .line 30
    .line 31
    if-eqz v1, :cond_c

    .line 32
    .line 33
    iget-boolean v0, v0, Lf63;->L:Z

    .line 34
    .line 35
    if-eqz v0, :cond_c

    .line 36
    .line 37
    check-cast v1, Lvj1;

    .line 38
    .line 39
    const/16 v0, 0x20

    .line 40
    .line 41
    shr-long v4, p1, v0

    .line 42
    .line 43
    long-to-int v4, v4

    .line 44
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    const-wide v6, 0xffffffffL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    and-long v8, p1, v6

    .line 54
    .line 55
    long-to-int v4, v8

    .line 56
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    iget-object v1, v1, Lvj1;->n:Lsj1;

    .line 61
    .line 62
    iget-boolean v8, v1, Lsj1;->A:Z

    .line 63
    .line 64
    if-eqz v8, :cond_b

    .line 65
    .line 66
    invoke-virtual {v1}, Lsj1;->d()Lya4;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    instance-of v8, v1, Lnb3;

    .line 71
    .line 72
    if-eqz v8, :cond_1

    .line 73
    .line 74
    check-cast v1, Lnb3;

    .line 75
    .line 76
    iget-object v0, v1, Lnb3;->f:Lwv3;

    .line 77
    .line 78
    iget v1, v0, Lwv3;->a:F

    .line 79
    .line 80
    cmpg-float v1, v1, v5

    .line 81
    .line 82
    if-gtz v1, :cond_0

    .line 83
    .line 84
    iget v1, v0, Lwv3;->c:F

    .line 85
    .line 86
    cmpg-float v1, v5, v1

    .line 87
    .line 88
    if-gez v1, :cond_0

    .line 89
    .line 90
    iget v1, v0, Lwv3;->b:F

    .line 91
    .line 92
    cmpg-float v1, v1, v4

    .line 93
    .line 94
    if-gtz v1, :cond_0

    .line 95
    .line 96
    iget v0, v0, Lwv3;->d:F

    .line 97
    .line 98
    cmpg-float v0, v4, v0

    .line 99
    .line 100
    if-gez v0, :cond_0

    .line 101
    .line 102
    goto/16 :goto_2

    .line 103
    .line 104
    :cond_0
    const/16 v16, 0x0

    .line 105
    .line 106
    const/16 v17, 0x1

    .line 107
    .line 108
    goto/16 :goto_1

    .line 109
    .line 110
    :cond_1
    instance-of v8, v1, Lob3;

    .line 111
    .line 112
    if-eqz v8, :cond_9

    .line 113
    .line 114
    check-cast v1, Lob3;

    .line 115
    .line 116
    iget-object v1, v1, Lob3;->f:Lg34;

    .line 117
    .line 118
    iget v8, v1, Lg34;->c:F

    .line 119
    .line 120
    iget v9, v1, Lg34;->b:F

    .line 121
    .line 122
    iget v10, v1, Lg34;->d:F

    .line 123
    .line 124
    iget v11, v1, Lg34;->a:F

    .line 125
    .line 126
    iget-wide v12, v1, Lg34;->f:J

    .line 127
    .line 128
    iget-wide v14, v1, Lg34;->h:J

    .line 129
    .line 130
    const/16 v16, 0x0

    .line 131
    .line 132
    const/16 v17, 0x1

    .line 133
    .line 134
    iget-wide v2, v1, Lg34;->g:J

    .line 135
    .line 136
    move-wide/from16 v18, v6

    .line 137
    .line 138
    iget-wide v6, v1, Lg34;->e:J

    .line 139
    .line 140
    cmpg-float v20, v5, v11

    .line 141
    .line 142
    if-ltz v20, :cond_8

    .line 143
    .line 144
    cmpl-float v20, v5, v8

    .line 145
    .line 146
    if-gez v20, :cond_8

    .line 147
    .line 148
    cmpg-float v20, v4, v9

    .line 149
    .line 150
    if-ltz v20, :cond_8

    .line 151
    .line 152
    cmpl-float v20, v4, v10

    .line 153
    .line 154
    if-ltz v20, :cond_2

    .line 155
    .line 156
    goto/16 :goto_1

    .line 157
    .line 158
    :cond_2
    move/from16 p0, v0

    .line 159
    .line 160
    move-object/from16 v20, v1

    .line 161
    .line 162
    shr-long v0, v6, p0

    .line 163
    .line 164
    long-to-int v0, v0

    .line 165
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    move/from16 p1, v0

    .line 170
    .line 171
    move/from16 p2, v1

    .line 172
    .line 173
    shr-long v0, v12, p0

    .line 174
    .line 175
    long-to-int v0, v0

    .line 176
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    add-float v1, v1, p2

    .line 181
    .line 182
    sub-float v21, v8, v11

    .line 183
    .line 184
    cmpg-float v1, v1, v21

    .line 185
    .line 186
    if-gtz v1, :cond_7

    .line 187
    .line 188
    move/from16 v21, v0

    .line 189
    .line 190
    shr-long v0, v14, p0

    .line 191
    .line 192
    long-to-int v0, v0

    .line 193
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    move/from16 p2, v0

    .line 198
    .line 199
    move/from16 v22, v1

    .line 200
    .line 201
    shr-long v0, v2, p0

    .line 202
    .line 203
    long-to-int v0, v0

    .line 204
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    add-float v1, v1, v22

    .line 209
    .line 210
    sub-float v22, v8, v11

    .line 211
    .line 212
    cmpg-float v1, v1, v22

    .line 213
    .line 214
    if-gtz v1, :cond_7

    .line 215
    .line 216
    and-long v6, v6, v18

    .line 217
    .line 218
    long-to-int v1, v6

    .line 219
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 220
    .line 221
    .line 222
    move-result v6

    .line 223
    and-long v14, v14, v18

    .line 224
    .line 225
    long-to-int v7, v14

    .line 226
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 227
    .line 228
    .line 229
    move-result v14

    .line 230
    add-float/2addr v14, v6

    .line 231
    sub-float v6, v10, v9

    .line 232
    .line 233
    cmpg-float v6, v14, v6

    .line 234
    .line 235
    if-gtz v6, :cond_7

    .line 236
    .line 237
    and-long v12, v12, v18

    .line 238
    .line 239
    long-to-int v6, v12

    .line 240
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 241
    .line 242
    .line 243
    move-result v12

    .line 244
    and-long v2, v2, v18

    .line 245
    .line 246
    long-to-int v2, v2

    .line 247
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    add-float/2addr v3, v12

    .line 252
    sub-float v12, v10, v9

    .line 253
    .line 254
    cmpg-float v3, v3, v12

    .line 255
    .line 256
    if-gtz v3, :cond_7

    .line 257
    .line 258
    invoke-static/range {p1 .. p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 259
    .line 260
    .line 261
    move-result v3

    .line 262
    add-float/2addr v3, v11

    .line 263
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    add-float/2addr v1, v9

    .line 268
    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 269
    .line 270
    .line 271
    move-result v12

    .line 272
    sub-float v12, v8, v12

    .line 273
    .line 274
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 275
    .line 276
    .line 277
    move-result v6

    .line 278
    add-float/2addr v6, v9

    .line 279
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    sub-float/2addr v8, v0

    .line 284
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 285
    .line 286
    .line 287
    move-result v0

    .line 288
    sub-float v0, v10, v0

    .line 289
    .line 290
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    sub-float/2addr v10, v2

    .line 295
    invoke-static/range {p2 .. p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 296
    .line 297
    .line 298
    move-result v2

    .line 299
    add-float v7, v2, v11

    .line 300
    .line 301
    cmpg-float v2, v5, v3

    .line 302
    .line 303
    if-gez v2, :cond_3

    .line 304
    .line 305
    cmpg-float v2, v4, v1

    .line 306
    .line 307
    if-gez v2, :cond_3

    .line 308
    .line 309
    move-object/from16 v2, v20

    .line 310
    .line 311
    iget-wide v9, v2, Lg34;->e:J

    .line 312
    .line 313
    move v8, v1

    .line 314
    move v7, v3

    .line 315
    move v6, v4

    .line 316
    invoke-static/range {v5 .. v10}, Lgi1;->C(FFFFJ)Z

    .line 317
    .line 318
    .line 319
    move-result v0

    .line 320
    goto/16 :goto_3

    .line 321
    .line 322
    :cond_3
    move v1, v7

    .line 323
    move v7, v8

    .line 324
    move-object/from16 v2, v20

    .line 325
    .line 326
    move v8, v6

    .line 327
    move v6, v4

    .line 328
    cmpg-float v3, v5, v1

    .line 329
    .line 330
    if-gez v3, :cond_4

    .line 331
    .line 332
    cmpl-float v3, v6, v10

    .line 333
    .line 334
    if-lez v3, :cond_4

    .line 335
    .line 336
    move v8, v10

    .line 337
    iget-wide v9, v2, Lg34;->h:J

    .line 338
    .line 339
    move v7, v1

    .line 340
    invoke-static/range {v5 .. v10}, Lgi1;->C(FFFFJ)Z

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    goto :goto_3

    .line 345
    :cond_4
    move v3, v8

    .line 346
    cmpl-float v1, v5, v12

    .line 347
    .line 348
    if-lez v1, :cond_5

    .line 349
    .line 350
    cmpg-float v1, v6, v3

    .line 351
    .line 352
    if-gez v1, :cond_5

    .line 353
    .line 354
    iget-wide v9, v2, Lg34;->f:J

    .line 355
    .line 356
    move v8, v3

    .line 357
    move v7, v12

    .line 358
    invoke-static/range {v5 .. v10}, Lgi1;->C(FFFFJ)Z

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    goto :goto_3

    .line 363
    :cond_5
    cmpl-float v1, v5, v7

    .line 364
    .line 365
    if-lez v1, :cond_6

    .line 366
    .line 367
    cmpl-float v1, v6, v0

    .line 368
    .line 369
    if-lez v1, :cond_6

    .line 370
    .line 371
    iget-wide v9, v2, Lg34;->g:J

    .line 372
    .line 373
    move v8, v0

    .line 374
    invoke-static/range {v5 .. v10}, Lgi1;->C(FFFFJ)Z

    .line 375
    .line 376
    .line 377
    move-result v0

    .line 378
    goto :goto_3

    .line 379
    :cond_6
    :goto_0
    move/from16 v0, v17

    .line 380
    .line 381
    goto :goto_3

    .line 382
    :cond_7
    move v6, v4

    .line 383
    move-object/from16 v2, v20

    .line 384
    .line 385
    invoke-static {}, Lpc;->a()Lnc;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-static {v0, v2}, Lnc;->b(Lnc;Lg34;)V

    .line 390
    .line 391
    .line 392
    invoke-static {v5, v6, v0}, Lgi1;->y(FFLnc;)Z

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    goto :goto_3

    .line 397
    :cond_8
    :goto_1
    move/from16 v0, v16

    .line 398
    .line 399
    goto :goto_3

    .line 400
    :cond_9
    move v6, v4

    .line 401
    const/16 v16, 0x0

    .line 402
    .line 403
    const/16 v17, 0x1

    .line 404
    .line 405
    instance-of v0, v1, Lmb3;

    .line 406
    .line 407
    if-eqz v0, :cond_a

    .line 408
    .line 409
    check-cast v1, Lmb3;

    .line 410
    .line 411
    iget-object v0, v1, Lmb3;->f:Lnc;

    .line 412
    .line 413
    invoke-static {v5, v6, v0}, Lgi1;->y(FFLnc;)Z

    .line 414
    .line 415
    .line 416
    move-result v0

    .line 417
    goto :goto_3

    .line 418
    :cond_a
    invoke-static {}, Ler1;->n()V

    .line 419
    .line 420
    .line 421
    return v16

    .line 422
    :cond_b
    :goto_2
    const/16 v16, 0x0

    .line 423
    .line 424
    const/16 v17, 0x1

    .line 425
    .line 426
    goto :goto_0

    .line 427
    :goto_3
    if-eqz v0, :cond_e

    .line 428
    .line 429
    goto :goto_4

    .line 430
    :cond_c
    const/16 v17, 0x1

    .line 431
    .line 432
    :goto_4
    return v17

    .line 433
    :cond_d
    const/16 v16, 0x0

    .line 434
    .line 435
    :cond_e
    return v16
.end method

.method public final b(J)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lf63;->K0(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1

    .line 5
    iget-object p0, p0, Lf63;->H:Lc72;

    .line 6
    .line 7
    invoke-static {p0}, Lh12;->L(Lc72;)Lub3;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lra;

    .line 12
    .line 13
    invoke-virtual {p0}, Lra;->y()V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, Lra;->k0:[F

    .line 17
    .line 18
    invoke-static {p1, p2, p0}, Lya4;->A(J[F)J

    .line 19
    .line 20
    .line 21
    move-result-wide p0

    .line 22
    return-wide p0
.end method

.method public final d0()Lcf2;
    .locals 0

    .line 1
    iget-object p0, p0, Lf63;->I:Lf63;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e0()Lq62;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final f()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lf63;->A0()Lcx2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-boolean p0, p0, Lcx2;->A:Z

    .line 6
    .line 7
    return p0
.end method

.method public final f0()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lf63;->Q:Lvi2;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final g()F
    .locals 0

    .line 1
    iget-object p0, p0, Lf63;->H:Lc72;

    .line 2
    .line 3
    iget-object p0, p0, Lc72;->J:Loo0;

    .line 4
    .line 5
    invoke-interface {p0}, Loo0;->g()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final g0()Lc72;
    .locals 0

    .line 1
    iget-object p0, p0, Lf63;->H:Lc72;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLayoutDirection()Lr62;
    .locals 0

    .line 1
    iget-object p0, p0, Lf63;->H:Lc72;

    .line 2
    .line 3
    iget-object p0, p0, Lc72;->K:Lr62;

    .line 4
    .line 5
    return-object p0
.end method

.method public final h0()Lvi2;
    .locals 0

    .line 1
    iget-object p0, p0, Lf63;->Q:Lvi2;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "Asking for measurement result of unmeasured layout modifier"

    .line 7
    .line 8
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final i0()Lcf2;
    .locals 0

    .line 1
    iget-object p0, p0, Lf63;->J:Lf63;

    .line 2
    .line 3
    return-object p0
.end method

.method public final j()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lf63;->g0:Ltb3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Lf63;->K:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lf63;->H:Lc72;

    .line 10
    .line 11
    invoke-virtual {p0}, Lc72;->G()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final j0()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lf63;->S:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final k()J
    .locals 2

    .line 1
    iget-wide v0, p0, Ljg3;->p:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final n0()V
    .locals 4

    .line 1
    iget-wide v0, p0, Lf63;->S:J

    .line 2
    .line 3
    iget v2, p0, Lf63;->T:F

    .line 4
    .line 5
    iget-object v3, p0, Lf63;->M:Lif1;

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1, v2, v3}, Ljg3;->N(JFLif1;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final p0(Lf63;Lv03;Z)V
    .locals 5

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, Lf63;->J:Lf63;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lf63;->p0(Lf63;Lv03;Z)V

    .line 9
    .line 10
    .line 11
    :cond_1
    iget-wide v0, p0, Lf63;->S:J

    .line 12
    .line 13
    const/16 p1, 0x20

    .line 14
    .line 15
    shr-long v2, v0, p1

    .line 16
    .line 17
    long-to-int v2, v2

    .line 18
    iget v3, p2, Lv03;->b:F

    .line 19
    .line 20
    int-to-float v2, v2

    .line 21
    sub-float/2addr v3, v2

    .line 22
    iput v3, p2, Lv03;->b:F

    .line 23
    .line 24
    iget v3, p2, Lv03;->d:F

    .line 25
    .line 26
    sub-float/2addr v3, v2

    .line 27
    iput v3, p2, Lv03;->d:F

    .line 28
    .line 29
    const-wide v2, 0xffffffffL

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    and-long/2addr v0, v2

    .line 35
    long-to-int v0, v0

    .line 36
    iget v1, p2, Lv03;->c:F

    .line 37
    .line 38
    int-to-float v0, v0

    .line 39
    sub-float/2addr v1, v0

    .line 40
    iput v1, p2, Lv03;->c:F

    .line 41
    .line 42
    iget v1, p2, Lv03;->e:F

    .line 43
    .line 44
    sub-float/2addr v1, v0

    .line 45
    iput v1, p2, Lv03;->e:F

    .line 46
    .line 47
    iget-object v0, p0, Lf63;->g0:Ltb3;

    .line 48
    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    check-cast v0, Lvj1;

    .line 52
    .line 53
    invoke-virtual {v0}, Lvj1;->a()[F

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    iget-boolean v0, v0, Lvj1;->F:Z

    .line 58
    .line 59
    const/4 v4, 0x0

    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    if-nez v1, :cond_2

    .line 63
    .line 64
    iput v4, p2, Lv03;->b:F

    .line 65
    .line 66
    iput v4, p2, Lv03;->c:F

    .line 67
    .line 68
    iput v4, p2, Lv03;->d:F

    .line 69
    .line 70
    iput v4, p2, Lv03;->e:F

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_2
    invoke-static {v1, p2}, Lya4;->B([FLv03;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    :goto_0
    iget-boolean v0, p0, Lf63;->L:Z

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    if-eqz p3, :cond_4

    .line 81
    .line 82
    iget-wide v0, p0, Ljg3;->p:J

    .line 83
    .line 84
    shr-long p0, v0, p1

    .line 85
    .line 86
    long-to-int p0, p0

    .line 87
    int-to-float p0, p0

    .line 88
    and-long/2addr v0, v2

    .line 89
    long-to-int p1, v0

    .line 90
    int-to-float p1, p1

    .line 91
    invoke-virtual {p2, v4, v4, p0, p1}, Lv03;->b(FFFF)V

    .line 92
    .line 93
    .line 94
    :cond_4
    :goto_1
    return-void
.end method

.method public final q(J)J
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf63;->A0()Lcx2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lcx2;->A:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 10
    .line 11
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0, p1, p2}, Lf63;->K0(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    iget-object p0, p0, Lf63;->H:Lc72;

    .line 19
    .line 20
    invoke-static {p0}, Lh12;->L(Lc72;)Lub3;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Lra;

    .line 25
    .line 26
    invoke-virtual {p0, p1, p2}, Lra;->p(J)J

    .line 27
    .line 28
    .line 29
    move-result-wide p0

    .line 30
    return-wide p0
.end method

.method public final q0(Lf63;J)J
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    return-wide p2

    .line 4
    :cond_0
    iget-object v0, p0, Lf63;->J:Lf63;

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1, v0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {v0, p1, p2, p3}, Lf63;->q0(Lf63;J)J

    .line 16
    .line 17
    .line 18
    move-result-wide p1

    .line 19
    invoke-virtual {p0, p1, p2}, Lf63;->x0(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    return-wide p0

    .line 24
    :cond_2
    :goto_0
    invoke-virtual {p0, p2, p3}, Lf63;->x0(J)J

    .line 25
    .line 26
    .line 27
    move-result-wide p0

    .line 28
    return-wide p0
.end method

.method public final r0(J)J
    .locals 5

    .line 1
    invoke-virtual {p0}, Lf63;->B0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lf63;->X:Lwv3;

    .line 8
    .line 9
    iget v1, v0, Lwv3;->c:F

    .line 10
    .line 11
    iget v0, v0, Lwv3;->a:F

    .line 12
    .line 13
    sub-float/2addr v1, v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p0}, Ljg3;->G()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    int-to-float v1, v0

    .line 20
    :goto_0
    invoke-virtual {p0}, Lf63;->B0()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object p0, p0, Lf63;->X:Lwv3;

    .line 27
    .line 28
    iget v0, p0, Lwv3;->d:F

    .line 29
    .line 30
    iget p0, p0, Lwv3;->b:F

    .line 31
    .line 32
    sub-float/2addr v0, p0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-virtual {p0}, Ljg3;->F()I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    int-to-float v0, p0

    .line 39
    :goto_1
    const/16 p0, 0x20

    .line 40
    .line 41
    shr-long v2, p1, p0

    .line 42
    .line 43
    long-to-int v2, v2

    .line 44
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    sub-float/2addr v2, v1

    .line 49
    const-wide v3, 0xffffffffL

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    and-long/2addr p1, v3

    .line 55
    long-to-int p1, p1

    .line 56
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    sub-float/2addr p1, v0

    .line 61
    const/high16 p2, 0x40000000    # 2.0f

    .line 62
    .line 63
    div-float/2addr v2, p2

    .line 64
    const/4 v0, 0x0

    .line 65
    invoke-static {v0, v2}, Ljava/lang/Math;->max(FF)F

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    div-float/2addr p1, p2

    .line 70
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 75
    .line 76
    .line 77
    move-result p2

    .line 78
    int-to-long v0, p2

    .line 79
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    int-to-long p1, p1

    .line 84
    shl-long/2addr v0, p0

    .line 85
    and-long p0, p1, v3

    .line 86
    .line 87
    or-long/2addr p0, v0

    .line 88
    return-wide p0
.end method

.method public final s0(JJ)F
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljg3;->G()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    const/16 v1, 0x20

    .line 7
    .line 8
    shr-long v2, p3, v1

    .line 9
    .line 10
    long-to-int v2, v2

    .line 11
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    cmpl-float v0, v0, v2

    .line 16
    .line 17
    const/high16 v2, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 18
    .line 19
    const-wide v3, 0xffffffffL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    if-ltz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p0}, Ljg3;->F()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    int-to-float v0, v0

    .line 31
    and-long v5, p3, v3

    .line 32
    .line 33
    long-to-int v5, v5

    .line 34
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    cmpl-float v0, v0, v5

    .line 39
    .line 40
    if-ltz v0, :cond_0

    .line 41
    .line 42
    return v2

    .line 43
    :cond_0
    invoke-virtual {p0, p3, p4}, Lf63;->r0(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide p3

    .line 47
    shr-long v5, p3, v1

    .line 48
    .line 49
    long-to-int v0, v5

    .line 50
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    and-long/2addr p3, v3

    .line 55
    long-to-int p3, p3

    .line 56
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    shr-long v5, p1, v1

    .line 61
    .line 62
    long-to-int p4, v5

    .line 63
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 64
    .line 65
    .line 66
    move-result p4

    .line 67
    const/4 v5, 0x0

    .line 68
    cmpg-float v6, p4, v5

    .line 69
    .line 70
    if-gez v6, :cond_1

    .line 71
    .line 72
    neg-float p4, p4

    .line 73
    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {p0}, Ljg3;->G()I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    int-to-float v6, v6

    .line 79
    sub-float/2addr p4, v6

    .line 80
    :goto_0
    invoke-static {v5, p4}, Ljava/lang/Math;->max(FF)F

    .line 81
    .line 82
    .line 83
    move-result p4

    .line 84
    and-long/2addr p1, v3

    .line 85
    long-to-int p1, p1

    .line 86
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    cmpg-float p2, p1, v5

    .line 91
    .line 92
    if-gez p2, :cond_2

    .line 93
    .line 94
    neg-float p0, p1

    .line 95
    goto :goto_1

    .line 96
    :cond_2
    invoke-virtual {p0}, Ljg3;->F()I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    int-to-float p0, p0

    .line 101
    sub-float p0, p1, p0

    .line 102
    .line 103
    :goto_1
    invoke-static {v5, p0}, Ljava/lang/Math;->max(FF)F

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    invoke-static {p4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    int-to-long p1, p1

    .line 112
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 113
    .line 114
    .line 115
    move-result p0

    .line 116
    int-to-long v6, p0

    .line 117
    shl-long p0, p1, v1

    .line 118
    .line 119
    and-long/2addr v6, v3

    .line 120
    or-long/2addr p0, v6

    .line 121
    cmpl-float p2, v0, v5

    .line 122
    .line 123
    if-gtz p2, :cond_3

    .line 124
    .line 125
    cmpl-float p2, p3, v5

    .line 126
    .line 127
    if-lez p2, :cond_4

    .line 128
    .line 129
    :cond_3
    shr-long v5, p0, v1

    .line 130
    .line 131
    long-to-int p2, v5

    .line 132
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 133
    .line 134
    .line 135
    move-result p4

    .line 136
    cmpg-float p4, p4, v0

    .line 137
    .line 138
    if-gtz p4, :cond_4

    .line 139
    .line 140
    and-long/2addr p0, v3

    .line 141
    long-to-int p0, p0

    .line 142
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    cmpg-float p1, p1, p3

    .line 147
    .line 148
    if-gtz p1, :cond_4

    .line 149
    .line 150
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    mul-float/2addr p1, p1

    .line 159
    mul-float/2addr p0, p0

    .line 160
    add-float/2addr p0, p1

    .line 161
    return p0

    .line 162
    :cond_4
    return v2
.end method

.method public final t()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lf63;->H:Lc72;

    .line 2
    .line 3
    iget-object v1, v0, Lc72;->Q:Lw12;

    .line 4
    .line 5
    const/16 v2, 0x40

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lw12;->d(I)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v1, :cond_8

    .line 13
    .line 14
    invoke-virtual {p0}, Lf63;->A0()Lcx2;

    .line 15
    .line 16
    .line 17
    iget-object p0, v0, Lc72;->Q:Lw12;

    .line 18
    .line 19
    iget-object p0, p0, Lw12;->f:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Lsq4;

    .line 22
    .line 23
    :goto_0
    if-eqz p0, :cond_8

    .line 24
    .line 25
    iget v0, p0, Lcx2;->p:I

    .line 26
    .line 27
    and-int/2addr v0, v2

    .line 28
    if-eqz v0, :cond_7

    .line 29
    .line 30
    move-object v0, p0

    .line 31
    move-object v1, v3

    .line 32
    :goto_1
    if-eqz v0, :cond_7

    .line 33
    .line 34
    instance-of v4, v0, Lxo;

    .line 35
    .line 36
    if-nez v4, :cond_6

    .line 37
    .line 38
    iget v4, v0, Lcx2;->p:I

    .line 39
    .line 40
    and-int/2addr v4, v2

    .line 41
    if-eqz v4, :cond_5

    .line 42
    .line 43
    instance-of v4, v0, Lfo0;

    .line 44
    .line 45
    if-eqz v4, :cond_5

    .line 46
    .line 47
    move-object v4, v0

    .line 48
    check-cast v4, Lfo0;

    .line 49
    .line 50
    iget-object v4, v4, Lfo0;->C:Lcx2;

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    :goto_2
    const/4 v6, 0x1

    .line 54
    if-eqz v4, :cond_4

    .line 55
    .line 56
    iget v7, v4, Lcx2;->p:I

    .line 57
    .line 58
    and-int/2addr v7, v2

    .line 59
    if-eqz v7, :cond_3

    .line 60
    .line 61
    add-int/lit8 v5, v5, 0x1

    .line 62
    .line 63
    if-ne v5, v6, :cond_0

    .line 64
    .line 65
    move-object v0, v4

    .line 66
    goto :goto_3

    .line 67
    :cond_0
    if-nez v1, :cond_1

    .line 68
    .line 69
    new-instance v1, Lf13;

    .line 70
    .line 71
    const/16 v6, 0x10

    .line 72
    .line 73
    new-array v6, v6, [Lcx2;

    .line 74
    .line 75
    invoke-direct {v1, v6}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_1
    if-eqz v0, :cond_2

    .line 79
    .line 80
    invoke-virtual {v1, v0}, Lf13;->b(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move-object v0, v3

    .line 84
    :cond_2
    invoke-virtual {v1, v4}, Lf13;->b(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_3
    :goto_3
    iget-object v4, v4, Lcx2;->s:Lcx2;

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    if-ne v5, v6, :cond_5

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_5
    invoke-static {v1}, Lj51;->c(Lf13;)Lcx2;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    goto :goto_1

    .line 98
    :cond_6
    check-cast v0, Lxo;

    .line 99
    .line 100
    iget-object p0, v0, Lxo;->B:Lbx2;

    .line 101
    .line 102
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-static {}, Lkf2;->k()V

    .line 106
    .line 107
    .line 108
    return-object v3

    .line 109
    :cond_7
    iget-object p0, p0, Lcx2;->r:Lcx2;

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_8
    return-object v3
.end method

.method public final t0(Ljz;Lsj1;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lf63;->g0:Ltb3;

    .line 6
    .line 7
    const/16 v3, 0x20

    .line 8
    .line 9
    const-wide v4, 0xffffffffL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    if-eqz v2, :cond_19

    .line 15
    .line 16
    check-cast v2, Lvj1;

    .line 17
    .line 18
    iget-object v0, v2, Lvj1;->z:Lmz;

    .line 19
    .line 20
    invoke-virtual {v2}, Lvj1;->g()V

    .line 21
    .line 22
    .line 23
    iget-object v6, v2, Lvj1;->n:Lsj1;

    .line 24
    .line 25
    iget-object v6, v6, Lsj1;->a:Luj1;

    .line 26
    .line 27
    invoke-interface {v6}, Luj1;->M()F

    .line 28
    .line 29
    .line 30
    iget-object v6, v0, Lmz;->o:Li61;

    .line 31
    .line 32
    iget-object v0, v0, Lmz;->o:Li61;

    .line 33
    .line 34
    invoke-virtual {v6, v1}, Li61;->q(Ljz;)V

    .line 35
    .line 36
    .line 37
    move-object/from16 v7, p2

    .line 38
    .line 39
    iput-object v7, v6, Li61;->p:Ljava/lang/Object;

    .line 40
    .line 41
    iget-object v1, v2, Lvj1;->n:Lsj1;

    .line 42
    .line 43
    invoke-virtual {v0}, Li61;->g()Ljz;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lsj1;

    .line 50
    .line 51
    iget-object v6, v1, Lsj1;->a:Luj1;

    .line 52
    .line 53
    iget-boolean v7, v1, Lsj1;->s:Z

    .line 54
    .line 55
    if-eqz v7, :cond_0

    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    iget-wide v7, v1, Lsj1;->h:J

    .line 59
    .line 60
    invoke-static {v2}, Lba;->a(Ljz;)Landroid/graphics/Canvas;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    invoke-virtual {v9}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    .line 65
    .line 66
    .line 67
    move-result v15

    .line 68
    if-nez v15, :cond_4

    .line 69
    .line 70
    iget-wide v11, v1, Lsj1;->t:J

    .line 71
    .line 72
    shr-long v13, v11, v3

    .line 73
    .line 74
    long-to-int v13, v13

    .line 75
    int-to-float v13, v13

    .line 76
    iget v14, v1, Lsj1;->v:I

    .line 77
    .line 78
    int-to-float v14, v14

    .line 79
    sub-float v14, v13, v14

    .line 80
    .line 81
    and-long/2addr v11, v4

    .line 82
    long-to-int v11, v11

    .line 83
    int-to-float v11, v11

    .line 84
    iget v12, v1, Lsj1;->w:I

    .line 85
    .line 86
    int-to-float v12, v12

    .line 87
    sub-float v12, v11, v12

    .line 88
    .line 89
    move/from16 v16, v3

    .line 90
    .line 91
    move-wide/from16 v17, v4

    .line 92
    .line 93
    iget-wide v3, v1, Lsj1;->u:J

    .line 94
    .line 95
    move v5, v11

    .line 96
    shr-long v10, v3, v16

    .line 97
    .line 98
    long-to-int v10, v10

    .line 99
    int-to-float v10, v10

    .line 100
    add-float/2addr v13, v10

    .line 101
    iget v10, v1, Lsj1;->x:I

    .line 102
    .line 103
    int-to-float v10, v10

    .line 104
    add-float/2addr v13, v10

    .line 105
    and-long v3, v3, v17

    .line 106
    .line 107
    long-to-int v3, v3

    .line 108
    int-to-float v3, v3

    .line 109
    add-float v11, v5, v3

    .line 110
    .line 111
    iget v3, v1, Lsj1;->y:I

    .line 112
    .line 113
    int-to-float v3, v3

    .line 114
    add-float/2addr v11, v3

    .line 115
    invoke-interface {v6}, Luj1;->b()F

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    invoke-interface {v6}, Luj1;->i()Ldt;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    invoke-interface {v6}, Luj1;->O()I

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    const/high16 v10, 0x3f800000    # 1.0f

    .line 128
    .line 129
    cmpg-float v10, v3, v10

    .line 130
    .line 131
    if-ltz v10, :cond_2

    .line 132
    .line 133
    const/4 v10, 0x3

    .line 134
    if-ne v5, v10, :cond_2

    .line 135
    .line 136
    if-nez v4, :cond_2

    .line 137
    .line 138
    invoke-interface {v6}, Luj1;->h()I

    .line 139
    .line 140
    .line 141
    move-result v10

    .line 142
    move-object/from16 p1, v9

    .line 143
    .line 144
    const/4 v9, 0x1

    .line 145
    if-ne v10, v9, :cond_1

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_1
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I

    .line 149
    .line 150
    .line 151
    move v3, v9

    .line 152
    move v11, v12

    .line 153
    move v10, v14

    .line 154
    move-object/from16 v9, p1

    .line 155
    .line 156
    goto :goto_1

    .line 157
    :cond_2
    move-object/from16 p1, v9

    .line 158
    .line 159
    const/4 v9, 0x1

    .line 160
    :goto_0
    iget-object v10, v1, Lsj1;->p:Lgc;

    .line 161
    .line 162
    if-nez v10, :cond_3

    .line 163
    .line 164
    invoke-static {}, Lfh0;->b()Lgc;

    .line 165
    .line 166
    .line 167
    move-result-object v10

    .line 168
    iput-object v10, v1, Lsj1;->p:Lgc;

    .line 169
    .line 170
    :cond_3
    invoke-virtual {v10, v3}, Lgc;->d(F)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v10, v5}, Lgc;->e(I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v10, v4}, Lgc;->g(Ldt;)V

    .line 177
    .line 178
    .line 179
    iget-object v3, v10, Lgc;->b:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v3, Landroid/graphics/Paint;

    .line 182
    .line 183
    move v10, v13

    .line 184
    move v13, v11

    .line 185
    move v11, v12

    .line 186
    move v12, v10

    .line 187
    move v10, v14

    .line 188
    move-object v14, v3

    .line 189
    move v3, v9

    .line 190
    move-object/from16 v9, p1

    .line 191
    .line 192
    invoke-virtual/range {v9 .. v14}, Landroid/graphics/Canvas;->saveLayer(FFFFLandroid/graphics/Paint;)I

    .line 193
    .line 194
    .line 195
    :goto_1
    invoke-virtual {v9, v10, v11}, Landroid/graphics/Canvas;->translate(FF)V

    .line 196
    .line 197
    .line 198
    invoke-interface {v6}, Luj1;->K()Landroid/graphics/Matrix;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    iget v5, v1, Lsj1;->v:I

    .line 203
    .line 204
    int-to-float v5, v5

    .line 205
    iget v10, v1, Lsj1;->w:I

    .line 206
    .line 207
    int-to-float v10, v10

    .line 208
    invoke-virtual {v4, v5, v10}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 209
    .line 210
    .line 211
    invoke-virtual {v9, v4}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 212
    .line 213
    .line 214
    iget-wide v4, v1, Lsj1;->h:J

    .line 215
    .line 216
    iget v10, v1, Lsj1;->v:I

    .line 217
    .line 218
    int-to-float v10, v10

    .line 219
    iget v11, v1, Lsj1;->w:I

    .line 220
    .line 221
    int-to-float v11, v11

    .line 222
    invoke-static {v10}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 223
    .line 224
    .line 225
    move-result v10

    .line 226
    int-to-long v12, v10

    .line 227
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 228
    .line 229
    .line 230
    move-result v10

    .line 231
    int-to-long v10, v10

    .line 232
    shl-long v12, v12, v16

    .line 233
    .line 234
    and-long v10, v10, v17

    .line 235
    .line 236
    or-long/2addr v10, v12

    .line 237
    invoke-static {v4, v5, v10, v11}, Lg83;->d(JJ)J

    .line 238
    .line 239
    .line 240
    move-result-wide v4

    .line 241
    iput-wide v4, v1, Lsj1;->h:J

    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_4
    const/4 v3, 0x1

    .line 245
    :goto_2
    invoke-virtual {v1}, Lsj1;->a()V

    .line 246
    .line 247
    .line 248
    invoke-interface {v6}, Luj1;->m()Z

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    if-nez v4, :cond_5

    .line 253
    .line 254
    :try_start_0
    iget-object v4, v1, Lsj1;->a:Luj1;

    .line 255
    .line 256
    iget-object v5, v1, Lsj1;->b:Loo0;

    .line 257
    .line 258
    iget-object v10, v1, Lsj1;->c:Lr62;

    .line 259
    .line 260
    iget-object v11, v1, Lsj1;->e:Lir0;

    .line 261
    .line 262
    invoke-interface {v4, v5, v10, v1, v11}, Luj1;->q(Loo0;Lr62;Lsj1;Lir0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 263
    .line 264
    .line 265
    :catchall_0
    :cond_5
    invoke-interface {v6}, Luj1;->M()F

    .line 266
    .line 267
    .line 268
    move-result v4

    .line 269
    const/4 v5, 0x0

    .line 270
    cmpl-float v4, v4, v5

    .line 271
    .line 272
    const/4 v10, 0x0

    .line 273
    if-lez v4, :cond_6

    .line 274
    .line 275
    move v4, v3

    .line 276
    goto :goto_3

    .line 277
    :cond_6
    move v4, v10

    .line 278
    :goto_3
    if-eqz v4, :cond_7

    .line 279
    .line 280
    invoke-interface {v2}, Ljz;->n()V

    .line 281
    .line 282
    .line 283
    :cond_7
    if-nez v15, :cond_8

    .line 284
    .line 285
    iget-boolean v5, v1, Lsj1;->A:Z

    .line 286
    .line 287
    if-eqz v5, :cond_8

    .line 288
    .line 289
    move v5, v3

    .line 290
    goto :goto_4

    .line 291
    :cond_8
    move v5, v10

    .line 292
    :goto_4
    if-eqz v5, :cond_d

    .line 293
    .line 294
    invoke-interface {v2}, Ljz;->e()V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v1}, Lsj1;->d()Lya4;

    .line 298
    .line 299
    .line 300
    move-result-object v11

    .line 301
    instance-of v12, v11, Lnb3;

    .line 302
    .line 303
    if-eqz v12, :cond_9

    .line 304
    .line 305
    check-cast v11, Lnb3;

    .line 306
    .line 307
    iget-object v11, v11, Lnb3;->f:Lwv3;

    .line 308
    .line 309
    iget v12, v11, Lwv3;->a:F

    .line 310
    .line 311
    iget v13, v11, Lwv3;->b:F

    .line 312
    .line 313
    iget v14, v11, Lwv3;->c:F

    .line 314
    .line 315
    iget v11, v11, Lwv3;->d:F

    .line 316
    .line 317
    invoke-interface {v2, v12, v13, v14, v11}, Ljz;->m(FFFF)V

    .line 318
    .line 319
    .line 320
    goto :goto_6

    .line 321
    :cond_9
    instance-of v12, v11, Lob3;

    .line 322
    .line 323
    if-eqz v12, :cond_b

    .line 324
    .line 325
    iget-object v12, v1, Lsj1;->m:Lnc;

    .line 326
    .line 327
    if-eqz v12, :cond_a

    .line 328
    .line 329
    iget-object v13, v12, Lnc;->a:Landroid/graphics/Path;

    .line 330
    .line 331
    invoke-virtual {v13}, Landroid/graphics/Path;->rewind()V

    .line 332
    .line 333
    .line 334
    goto :goto_5

    .line 335
    :cond_a
    invoke-static {}, Lpc;->a()Lnc;

    .line 336
    .line 337
    .line 338
    move-result-object v12

    .line 339
    iput-object v12, v1, Lsj1;->m:Lnc;

    .line 340
    .line 341
    :goto_5
    check-cast v11, Lob3;

    .line 342
    .line 343
    iget-object v11, v11, Lob3;->f:Lg34;

    .line 344
    .line 345
    invoke-static {v12, v11}, Lnc;->b(Lnc;Lg34;)V

    .line 346
    .line 347
    .line 348
    invoke-interface {v2, v12}, Ljz;->i(Lnc;)V

    .line 349
    .line 350
    .line 351
    goto :goto_6

    .line 352
    :cond_b
    instance-of v12, v11, Lmb3;

    .line 353
    .line 354
    if-eqz v12, :cond_c

    .line 355
    .line 356
    check-cast v11, Lmb3;

    .line 357
    .line 358
    iget-object v11, v11, Lmb3;->f:Lnc;

    .line 359
    .line 360
    invoke-interface {v2, v11}, Ljz;->i(Lnc;)V

    .line 361
    .line 362
    .line 363
    goto :goto_6

    .line 364
    :cond_c
    invoke-static {}, Ler1;->n()V

    .line 365
    .line 366
    .line 367
    return-void

    .line 368
    :cond_d
    :goto_6
    if-eqz v0, :cond_13

    .line 369
    .line 370
    iget-object v0, v0, Lsj1;->r:Ljw;

    .line 371
    .line 372
    iget-boolean v11, v0, Ljw;->n:Z

    .line 373
    .line 374
    if-nez v11, :cond_e

    .line 375
    .line 376
    const-string v11, "Only add dependencies during a tracking"

    .line 377
    .line 378
    invoke-static {v11}, Lbz1;->a(Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    :cond_e
    iget-object v11, v0, Ljw;->q:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v11, Lx03;

    .line 384
    .line 385
    const/4 v12, 0x0

    .line 386
    if-eqz v11, :cond_f

    .line 387
    .line 388
    invoke-virtual {v11, v1}, Lx03;->a(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    goto :goto_7

    .line 392
    :cond_f
    iget-object v11, v0, Ljw;->o:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast v11, Lsj1;

    .line 395
    .line 396
    if-eqz v11, :cond_10

    .line 397
    .line 398
    sget-object v11, Lw54;->a:Lx03;

    .line 399
    .line 400
    new-instance v11, Lx03;

    .line 401
    .line 402
    invoke-direct {v11}, Lx03;-><init>()V

    .line 403
    .line 404
    .line 405
    iget-object v13, v0, Ljw;->o:Ljava/lang/Object;

    .line 406
    .line 407
    check-cast v13, Lsj1;

    .line 408
    .line 409
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    invoke-virtual {v11, v13}, Lx03;->a(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    invoke-virtual {v11, v1}, Lx03;->a(Ljava/lang/Object;)Z

    .line 416
    .line 417
    .line 418
    iput-object v11, v0, Ljw;->q:Ljava/lang/Object;

    .line 419
    .line 420
    iput-object v12, v0, Ljw;->o:Ljava/lang/Object;

    .line 421
    .line 422
    goto :goto_7

    .line 423
    :cond_10
    iput-object v1, v0, Ljw;->o:Ljava/lang/Object;

    .line 424
    .line 425
    :goto_7
    iget-object v11, v0, Ljw;->r:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v11, Lx03;

    .line 428
    .line 429
    if-eqz v11, :cond_11

    .line 430
    .line 431
    invoke-virtual {v11, v1}, Lx03;->l(Ljava/lang/Object;)Z

    .line 432
    .line 433
    .line 434
    move-result v0

    .line 435
    xor-int/lit8 v10, v0, 0x1

    .line 436
    .line 437
    goto :goto_8

    .line 438
    :cond_11
    iget-object v11, v0, Ljw;->p:Ljava/lang/Object;

    .line 439
    .line 440
    check-cast v11, Lsj1;

    .line 441
    .line 442
    if-eq v11, v1, :cond_12

    .line 443
    .line 444
    move v10, v3

    .line 445
    goto :goto_8

    .line 446
    :cond_12
    iput-object v12, v0, Ljw;->p:Ljava/lang/Object;

    .line 447
    .line 448
    :goto_8
    if-eqz v10, :cond_13

    .line 449
    .line 450
    iget v0, v1, Lsj1;->q:I

    .line 451
    .line 452
    add-int/2addr v0, v3

    .line 453
    iput v0, v1, Lsj1;->q:I

    .line 454
    .line 455
    :cond_13
    move-object v0, v2

    .line 456
    check-cast v0, Laa;

    .line 457
    .line 458
    iget-object v0, v0, Laa;->a:Landroid/graphics/Canvas;

    .line 459
    .line 460
    invoke-virtual {v0}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    .line 461
    .line 462
    .line 463
    move-result v0

    .line 464
    if-nez v0, :cond_15

    .line 465
    .line 466
    iget-object v0, v1, Lsj1;->o:Lmz;

    .line 467
    .line 468
    if-nez v0, :cond_14

    .line 469
    .line 470
    new-instance v0, Lmz;

    .line 471
    .line 472
    invoke-direct {v0}, Lmz;-><init>()V

    .line 473
    .line 474
    .line 475
    iput-object v0, v1, Lsj1;->o:Lmz;

    .line 476
    .line 477
    :cond_14
    iget-object v3, v0, Lmz;->o:Li61;

    .line 478
    .line 479
    iget-object v6, v1, Lsj1;->b:Loo0;

    .line 480
    .line 481
    iget-object v10, v1, Lsj1;->c:Lr62;

    .line 482
    .line 483
    iget-wide v11, v1, Lsj1;->u:J

    .line 484
    .line 485
    invoke-static {v11, v12}, Ll93;->o0(J)J

    .line 486
    .line 487
    .line 488
    move-result-wide v11

    .line 489
    invoke-virtual {v3}, Li61;->h()Loo0;

    .line 490
    .line 491
    .line 492
    move-result-object v13

    .line 493
    invoke-virtual {v3}, Li61;->i()Lr62;

    .line 494
    .line 495
    .line 496
    move-result-object v14

    .line 497
    move/from16 p0, v4

    .line 498
    .line 499
    invoke-virtual {v3}, Li61;->g()Ljz;

    .line 500
    .line 501
    .line 502
    move-result-object v4

    .line 503
    move-wide/from16 p1, v7

    .line 504
    .line 505
    invoke-virtual {v3}, Li61;->j()J

    .line 506
    .line 507
    .line 508
    move-result-wide v7

    .line 509
    move/from16 v16, v5

    .line 510
    .line 511
    iget-object v5, v3, Li61;->p:Ljava/lang/Object;

    .line 512
    .line 513
    check-cast v5, Lsj1;

    .line 514
    .line 515
    invoke-virtual {v3, v6}, Li61;->r(Loo0;)V

    .line 516
    .line 517
    .line 518
    invoke-virtual {v3, v10}, Li61;->s(Lr62;)V

    .line 519
    .line 520
    .line 521
    invoke-virtual {v3, v2}, Li61;->q(Ljz;)V

    .line 522
    .line 523
    .line 524
    invoke-virtual {v3, v11, v12}, Li61;->t(J)V

    .line 525
    .line 526
    .line 527
    iput-object v1, v3, Li61;->p:Ljava/lang/Object;

    .line 528
    .line 529
    invoke-interface {v2}, Ljz;->e()V

    .line 530
    .line 531
    .line 532
    :try_start_1
    invoke-virtual {v1, v0}, Lsj1;->c(Lsv0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 533
    .line 534
    .line 535
    invoke-interface {v2}, Ljz;->k()V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v3, v13}, Li61;->r(Loo0;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v3, v14}, Li61;->s(Lr62;)V

    .line 542
    .line 543
    .line 544
    invoke-virtual {v3, v4}, Li61;->q(Ljz;)V

    .line 545
    .line 546
    .line 547
    invoke-virtual {v3, v7, v8}, Li61;->t(J)V

    .line 548
    .line 549
    .line 550
    iput-object v5, v3, Li61;->p:Ljava/lang/Object;

    .line 551
    .line 552
    goto :goto_9

    .line 553
    :catchall_1
    move-exception v0

    .line 554
    invoke-interface {v2}, Ljz;->k()V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v3, v13}, Li61;->r(Loo0;)V

    .line 558
    .line 559
    .line 560
    invoke-virtual {v3, v14}, Li61;->s(Lr62;)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v3, v4}, Li61;->q(Ljz;)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v3, v7, v8}, Li61;->t(J)V

    .line 567
    .line 568
    .line 569
    iput-object v5, v3, Li61;->p:Ljava/lang/Object;

    .line 570
    .line 571
    throw v0

    .line 572
    :cond_15
    move/from16 p0, v4

    .line 573
    .line 574
    move/from16 v16, v5

    .line 575
    .line 576
    move-wide/from16 p1, v7

    .line 577
    .line 578
    invoke-interface {v6, v2}, Luj1;->g(Ljz;)V

    .line 579
    .line 580
    .line 581
    :goto_9
    if-eqz v16, :cond_16

    .line 582
    .line 583
    invoke-interface {v2}, Ljz;->k()V

    .line 584
    .line 585
    .line 586
    :cond_16
    if-eqz p0, :cond_17

    .line 587
    .line 588
    invoke-interface {v2}, Ljz;->f()V

    .line 589
    .line 590
    .line 591
    :cond_17
    if-nez v15, :cond_18

    .line 592
    .line 593
    invoke-virtual {v9}, Landroid/graphics/Canvas;->restore()V

    .line 594
    .line 595
    .line 596
    :cond_18
    move-wide/from16 v2, p1

    .line 597
    .line 598
    iput-wide v2, v1, Lsj1;->h:J

    .line 599
    .line 600
    return-void

    .line 601
    :cond_19
    move-object/from16 v7, p2

    .line 602
    .line 603
    move/from16 v16, v3

    .line 604
    .line 605
    move-wide/from16 v17, v4

    .line 606
    .line 607
    iget-wide v2, v0, Lf63;->S:J

    .line 608
    .line 609
    shr-long v4, v2, v16

    .line 610
    .line 611
    long-to-int v4, v4

    .line 612
    int-to-float v4, v4

    .line 613
    and-long v2, v2, v17

    .line 614
    .line 615
    long-to-int v2, v2

    .line 616
    int-to-float v2, v2

    .line 617
    invoke-interface {v1, v4, v2}, Ljz;->j(FF)V

    .line 618
    .line 619
    .line 620
    invoke-virtual/range {p0 .. p2}, Lf63;->u0(Ljz;Lsj1;)V

    .line 621
    .line 622
    .line 623
    neg-float v0, v4

    .line 624
    neg-float v2, v2

    .line 625
    invoke-interface {v1, v0, v2}, Ljz;->j(FF)V

    .line 626
    .line 627
    .line 628
    return-void
.end method

.method public final u()Lq62;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lf63;->A0()Lcx2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lcx2;->A:Z

    .line 6
    .line 7
    iget-object v1, p0, Lf63;->H:Lc72;

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v2, "LayoutCoordinate operations are only valid when isAttached is true"

    .line 14
    .line 15
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    move-object v2, v1

    .line 19
    :goto_0
    if-eqz v2, :cond_0

    .line 20
    .line 21
    const-string v3, "\n|"

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v3, " isAttached="

    .line 30
    .line 31
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lc72;->G()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v3, " modifier="

    .line 42
    .line 43
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object v3, v2, Lc72;->V:Ldx2;

    .line 47
    .line 48
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v3, " tail="

    .line 52
    .line 53
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lf63;->A0()Lcx2;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Lc72;->t()Lc72;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_1
    invoke-virtual {p0}, Lf63;->L0()V

    .line 76
    .line 77
    .line 78
    iget-object p0, v1, Lc72;->Q:Lw12;

    .line 79
    .line 80
    iget-object p0, p0, Lw12;->e:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p0, Lf63;

    .line 83
    .line 84
    iget-object p0, p0, Lf63;->J:Lf63;

    .line 85
    .line 86
    return-object p0
.end method

.method public final u0(Ljz;Lsj1;)V
    .locals 11

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-virtual {p0, v0}, Lf63;->C0(I)Lcx2;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, Lf63;->R0(Ljz;Lsj1;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget-object v2, p0, Lf63;->H:Lc72;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, Lh12;->L(Lc72;)Lub3;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lra;

    .line 22
    .line 23
    invoke-virtual {v2}, Lra;->getSharedDrawScope()Le72;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    iget-wide v4, p0, Ljg3;->p:J

    .line 28
    .line 29
    invoke-static {v4, v5}, Ll93;->o0(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v5

    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const/4 v2, 0x0

    .line 37
    move-object v10, v2

    .line 38
    :goto_0
    if-eqz v1, :cond_8

    .line 39
    .line 40
    instance-of v4, v1, Lrv0;

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    .line 44
    move-object v8, v1

    .line 45
    check-cast v8, Lrv0;

    .line 46
    .line 47
    move-object v7, p0

    .line 48
    move-object v4, p1

    .line 49
    move-object v9, p2

    .line 50
    invoke-virtual/range {v3 .. v9}, Le72;->b(Ljz;JLf63;Lrv0;Lsj1;)V

    .line 51
    .line 52
    .line 53
    goto :goto_4

    .line 54
    :cond_1
    move-object v7, p0

    .line 55
    move-object v4, p1

    .line 56
    move-object v9, p2

    .line 57
    iget p0, v1, Lcx2;->p:I

    .line 58
    .line 59
    and-int/2addr p0, v0

    .line 60
    if-eqz p0, :cond_7

    .line 61
    .line 62
    instance-of p0, v1, Lfo0;

    .line 63
    .line 64
    if-eqz p0, :cond_7

    .line 65
    .line 66
    move-object p0, v1

    .line 67
    check-cast p0, Lfo0;

    .line 68
    .line 69
    iget-object p0, p0, Lfo0;->C:Lcx2;

    .line 70
    .line 71
    const/4 p1, 0x0

    .line 72
    :goto_1
    const/4 p2, 0x1

    .line 73
    if-eqz p0, :cond_6

    .line 74
    .line 75
    iget v8, p0, Lcx2;->p:I

    .line 76
    .line 77
    and-int/2addr v8, v0

    .line 78
    if-eqz v8, :cond_5

    .line 79
    .line 80
    add-int/lit8 p1, p1, 0x1

    .line 81
    .line 82
    if-ne p1, p2, :cond_2

    .line 83
    .line 84
    move-object v1, p0

    .line 85
    goto :goto_2

    .line 86
    :cond_2
    if-nez v10, :cond_3

    .line 87
    .line 88
    new-instance v10, Lf13;

    .line 89
    .line 90
    const/16 p2, 0x10

    .line 91
    .line 92
    new-array p2, p2, [Lcx2;

    .line 93
    .line 94
    invoke-direct {v10, p2}, Lf13;-><init>([Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_3
    if-eqz v1, :cond_4

    .line 98
    .line 99
    invoke-virtual {v10, v1}, Lf13;->b(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    move-object v1, v2

    .line 103
    :cond_4
    invoke-virtual {v10, p0}, Lf13;->b(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_5
    :goto_2
    iget-object p0, p0, Lcx2;->s:Lcx2;

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_6
    if-ne p1, p2, :cond_7

    .line 110
    .line 111
    :goto_3
    move-object p1, v4

    .line 112
    move-object p0, v7

    .line 113
    move-object p2, v9

    .line 114
    goto :goto_0

    .line 115
    :cond_7
    :goto_4
    invoke-static {v10}, Lj51;->c(Lf13;)Lcx2;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    goto :goto_3

    .line 120
    :cond_8
    return-void
.end method

.method public abstract v0()V
.end method

.method public final w0(Lf63;)Lf63;
    .locals 5

    .line 1
    iget-object v0, p1, Lf63;->H:Lc72;

    .line 2
    .line 3
    iget-object v1, p0, Lf63;->H:Lc72;

    .line 4
    .line 5
    if-ne v0, v1, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Lf63;->A0()Lcx2;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, Lf63;->A0()Lcx2;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, v1, Lcx2;->n:Lcx2;

    .line 16
    .line 17
    iget-boolean v2, v2, Lcx2;->A:Z

    .line 18
    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    const-string v2, "visitLocalAncestors called on an unattached node"

    .line 22
    .line 23
    invoke-static {v2}, Lcz1;->b(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget-object v1, v1, Lcx2;->n:Lcx2;

    .line 27
    .line 28
    iget-object v1, v1, Lcx2;->r:Lcx2;

    .line 29
    .line 30
    :goto_0
    if-eqz v1, :cond_7

    .line 31
    .line 32
    iget v2, v1, Lcx2;->p:I

    .line 33
    .line 34
    and-int/lit8 v2, v2, 0x2

    .line 35
    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    if-ne v1, v0, :cond_1

    .line 39
    .line 40
    goto :goto_4

    .line 41
    :cond_1
    iget-object v1, v1, Lcx2;->r:Lcx2;

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    :goto_1
    iget v2, v0, Lc72;->B:I

    .line 45
    .line 46
    iget v3, v1, Lc72;->B:I

    .line 47
    .line 48
    if-le v2, v3, :cond_3

    .line 49
    .line 50
    invoke-virtual {v0}, Lc72;->t()Lc72;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    move-object v2, v1

    .line 59
    :goto_2
    iget v3, v2, Lc72;->B:I

    .line 60
    .line 61
    iget v4, v0, Lc72;->B:I

    .line 62
    .line 63
    if-le v3, v4, :cond_4

    .line 64
    .line 65
    invoke-virtual {v2}, Lc72;->t()Lc72;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    :goto_3
    if-eq v0, v2, :cond_6

    .line 74
    .line 75
    invoke-virtual {v0}, Lc72;->t()Lc72;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {v2}, Lc72;->t()Lc72;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-eqz v0, :cond_5

    .line 84
    .line 85
    if-eqz v2, :cond_5

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    const-string p0, "layouts are not part of the same hierarchy"

    .line 89
    .line 90
    invoke-static {p0}, Lkf2;->n(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const/4 p0, 0x0

    .line 94
    return-object p0

    .line 95
    :cond_6
    if-ne v2, v1, :cond_8

    .line 96
    .line 97
    :cond_7
    return-object p0

    .line 98
    :cond_8
    iget-object p0, p1, Lf63;->H:Lc72;

    .line 99
    .line 100
    if-ne v0, p0, :cond_9

    .line 101
    .line 102
    :goto_4
    return-object p1

    .line 103
    :cond_9
    iget-object p0, v0, Lc72;->Q:Lw12;

    .line 104
    .line 105
    iget-object p0, p0, Lw12;->d:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p0, Liz1;

    .line 108
    .line 109
    return-object p0
.end method

.method public final x0(J)J
    .locals 6

    .line 1
    iget-wide v0, p0, Lf63;->S:J

    .line 2
    .line 3
    const/16 v2, 0x20

    .line 4
    .line 5
    shr-long v3, p1, v2

    .line 6
    .line 7
    long-to-int v3, v3

    .line 8
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    shr-long v4, v0, v2

    .line 13
    .line 14
    long-to-int v4, v4

    .line 15
    int-to-float v4, v4

    .line 16
    sub-float/2addr v3, v4

    .line 17
    const-wide v4, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr p1, v4

    .line 23
    long-to-int p1, p1

    .line 24
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    and-long/2addr v0, v4

    .line 29
    long-to-int p2, v0

    .line 30
    int-to-float p2, p2

    .line 31
    sub-float/2addr p1, p2

    .line 32
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    int-to-long v0, p2

    .line 37
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    int-to-long p1, p1

    .line 42
    shl-long/2addr v0, v2

    .line 43
    and-long/2addr p1, v4

    .line 44
    or-long/2addr p1, v0

    .line 45
    iget-object p0, p0, Lf63;->g0:Ltb3;

    .line 46
    .line 47
    if-eqz p0, :cond_2

    .line 48
    .line 49
    check-cast p0, Lvj1;

    .line 50
    .line 51
    invoke-virtual {p0}, Lvj1;->a()[F

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    if-nez v0, :cond_0

    .line 56
    .line 57
    const-wide p0, 0x7f8000007f800000L    # 1.404448428688076E306

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    return-wide p0

    .line 63
    :cond_0
    iget-boolean p0, p0, Lvj1;->F:Z

    .line 64
    .line 65
    if-eqz p0, :cond_1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    invoke-static {p1, p2, v0}, Lya4;->A(J[F)J

    .line 69
    .line 70
    .line 71
    move-result-wide p0

    .line 72
    return-wide p0

    .line 73
    :cond_2
    :goto_0
    return-wide p1
.end method

.method public abstract y0()Lef2;
.end method

.method public final z(Lq62;J)J
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lf63;->A(Lq62;J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public final z0()J
    .locals 3

    .line 1
    iget-object v0, p0, Lf63;->N:Loo0;

    .line 2
    .line 3
    iget-object p0, p0, Lf63;->H:Lc72;

    .line 4
    .line 5
    iget-object p0, p0, Lc72;->L:Lm65;

    .line 6
    .line 7
    invoke-interface {p0}, Lm65;->a()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    invoke-interface {v0, v1, v2}, Loo0;->Y(J)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0
.end method
