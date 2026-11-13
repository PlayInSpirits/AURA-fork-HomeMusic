.class public final Ldefpackage/tn0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/r55;


# instance fields
.field public final a:Ldefpackage/e55;

.field public final b:Ldefpackage/f55;

.field public final c:Ldefpackage/l55;

.field public final d:Ljava/util/ArrayDeque;

.field public e:Landroid/view/Surface;

.field public f:Ldefpackage/tb1;

.field public g:J

.field public h:Ldefpackage/q55;

.field public i:Ljava/util/concurrent/Executor;

.field public j:Ldefpackage/c55;


# direct methods
.method public constructor <init>(Ldefpackage/e55;Ldefpackage/f55;Ldefpackage/vp4;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/tn0;->a:Ldefpackage/e55;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/tn0;->b:Ldefpackage/f55;

    .line 7
    .line 8
    iput-object p3, p1, Ldefpackage/e55;->l:Ldefpackage/vp4;

    .line 9
    .line 10
    new-instance p3, Ldefpackage/l55;

    .line 11
    .line 12
    new-instance v0, Ldefpackage/gp3;

    .line 13
    .line 14
    const/4 v1, 0x6

    .line 15
    invoke-direct {v0, v1, p0}, Ldefpackage/gp3;-><init>(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p3, v0, p1, p2}, Ldefpackage/l55;-><init>(Ldefpackage/gp3;Ldefpackage/e55;Ldefpackage/f55;)V

    .line 19
    .line 20
    .line 21
    iput-object p3, p0, Ldefpackage/tn0;->c:Ldefpackage/l55;

    .line 22
    .line 23
    new-instance p1, Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Ldefpackage/tn0;->d:Ljava/util/ArrayDeque;

    .line 29
    .line 30
    new-instance p1, Ldefpackage/sb1;

    .line 31
    .line 32
    invoke-direct {p1}, Ldefpackage/sb1;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance p2, Ldefpackage/tb1;

    .line 36
    .line 37
    invoke-direct {p2, p1}, Ldefpackage/tb1;-><init>(Ldefpackage/sb1;)V

    .line 38
    .line 39
    .line 40
    iput-object p2, p0, Ldefpackage/tn0;->f:Ldefpackage/tb1;

    .line 41
    .line 42
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    iput-wide p1, p0, Ldefpackage/tn0;->g:J

    .line 48
    .line 49
    sget-object p1, Ldefpackage/q55;->a:Ldefpackage/p55;

    .line 50
    .line 51
    iput-object p1, p0, Ldefpackage/tn0;->h:Ldefpackage/q55;

    .line 52
    .line 53
    new-instance p1, Ldefpackage/di;

    .line 54
    .line 55
    const/4 p2, 0x1

    .line 56
    invoke-direct {p1, p2}, Ldefpackage/di;-><init>(I)V

    .line 57
    .line 58
    .line 59
    iput-object p1, p0, Ldefpackage/tn0;->i:Ljava/util/concurrent/Executor;

    .line 60
    .line 61
    new-instance p1, Ldefpackage/rn0;

    .line 62
    .line 63
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    iput-object p1, p0, Ldefpackage/tn0;->j:Ldefpackage/c55;

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final b()Landroid/view/Surface;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/tn0;->e:Landroid/view/Surface;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final c()Z
    .locals 4

    .line 1
    iget-object p0, p0, Ldefpackage/tn0;->c:Ldefpackage/l55;

    .line 2
    .line 3
    iget-wide v0, p0, Ldefpackage/l55;->j:J

    .line 4
    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v2, v0, v2

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    iget-wide v2, p0, Ldefpackage/l55;->i:J

    .line 15
    .line 16
    cmp-long p0, v2, v0

    .line 17
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

.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/tn0;->b:Ldefpackage/f55;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/f55;->b()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/tn0;->a:Ldefpackage/e55;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Ldefpackage/e55;->d:Z

    .line 10
    .line 11
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    iput-wide v1, p0, Ldefpackage/e55;->i:J

    .line 17
    .line 18
    iget-object p0, p0, Ldefpackage/e55;->b:Ldefpackage/k55;

    .line 19
    .line 20
    iput-boolean v0, p0, Ldefpackage/k55;->d:Z

    .line 21
    .line 22
    iget-object v0, p0, Ldefpackage/k55;->c:Ldefpackage/g55;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0}, Ldefpackage/g55;->b()V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {p0}, Ldefpackage/k55;->a()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final e(F)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/tn0;->a:Ldefpackage/e55;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldefpackage/e55;->h(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/tn0;->b:Ldefpackage/f55;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/f55;->b()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/tn0;->a:Ldefpackage/e55;

    .line 7
    .line 8
    invoke-virtual {p0}, Ldefpackage/e55;->d()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final g(Ldefpackage/tb1;JILjava/util/List;)V
    .locals 10

    .line 1
    invoke-interface {p5}, Ljava/util/List;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result p5

    .line 5
    invoke-static {p5}, Ldefpackage/rr2;->w(Z)V

    .line 6
    .line 7
    .line 8
    iget p5, p1, Ldefpackage/tb1;->u:I

    .line 9
    .line 10
    iget v0, p1, Ldefpackage/tb1;->v:I

    .line 11
    .line 12
    iget-object v1, p0, Ldefpackage/tn0;->f:Ldefpackage/tb1;

    .line 13
    .line 14
    iget v2, v1, Ldefpackage/tb1;->u:I

    .line 15
    .line 16
    const-wide/16 v3, 0x1

    .line 17
    .line 18
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    iget-object v7, p0, Ldefpackage/tn0;->c:Ldefpackage/l55;

    .line 24
    .line 25
    if-ne p5, v2, :cond_0

    .line 26
    .line 27
    iget v1, v1, Ldefpackage/tb1;->v:I

    .line 28
    .line 29
    if-eq v0, v1, :cond_2

    .line 30
    .line 31
    :cond_0
    iget-object v1, v7, Ldefpackage/l55;->d:Ldefpackage/tu;

    .line 32
    .line 33
    iget-wide v8, v7, Ldefpackage/l55;->h:J

    .line 34
    .line 35
    cmp-long v2, v8, v5

    .line 36
    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    const-wide/16 v8, 0x0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    add-long/2addr v8, v3

    .line 43
    :goto_0
    new-instance v2, Ldefpackage/s55;

    .line 44
    .line 45
    invoke-direct {v2, p5, v0}, Ldefpackage/s55;-><init>(II)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v8, v9, v2}, Ldefpackage/tu;->a(JLjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    iget p5, p1, Ldefpackage/tb1;->y:F

    .line 52
    .line 53
    iget-object v0, p0, Ldefpackage/tn0;->f:Ldefpackage/tb1;

    .line 54
    .line 55
    iget v0, v0, Ldefpackage/tb1;->y:F

    .line 56
    .line 57
    cmpl-float v0, p5, v0

    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    iget-object v0, p0, Ldefpackage/tn0;->a:Ldefpackage/e55;

    .line 62
    .line 63
    invoke-virtual {v0, p5}, Ldefpackage/e55;->f(F)V

    .line 64
    .line 65
    .line 66
    :cond_3
    iput-object p1, p0, Ldefpackage/tn0;->f:Ldefpackage/tb1;

    .line 67
    .line 68
    iget-wide v0, p0, Ldefpackage/tn0;->g:J

    .line 69
    .line 70
    cmp-long p1, p2, v0

    .line 71
    .line 72
    if-eqz p1, :cond_6

    .line 73
    .line 74
    iget-object p1, v7, Ldefpackage/l55;->f:Ldefpackage/uu;

    .line 75
    .line 76
    iget p1, p1, Ldefpackage/uu;->p:I

    .line 77
    .line 78
    if-nez p1, :cond_4

    .line 79
    .line 80
    iget-object p1, v7, Ldefpackage/l55;->b:Ldefpackage/e55;

    .line 81
    .line 82
    invoke-virtual {p1, p4}, Ldefpackage/e55;->e(I)V

    .line 83
    .line 84
    .line 85
    iput-wide p2, v7, Ldefpackage/l55;->l:J

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    iget-object p1, v7, Ldefpackage/l55;->e:Ldefpackage/tu;

    .line 89
    .line 90
    iget-wide p4, v7, Ldefpackage/l55;->h:J

    .line 91
    .line 92
    cmp-long v0, p4, v5

    .line 93
    .line 94
    if-nez v0, :cond_5

    .line 95
    .line 96
    const-wide/high16 p4, -0x4000000000000000L    # -2.0

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    add-long/2addr p4, v3

    .line 100
    :goto_1
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {p1, p4, p5, v0}, Ldefpackage/tu;->a(JLjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    :goto_2
    iput-wide p2, p0, Ldefpackage/tn0;->g:J

    .line 108
    .line 109
    :cond_6
    return-void
.end method

.method public final h(J)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public final i()V
    .locals 4

    .line 1
    iget-object p0, p0, Ldefpackage/tn0;->c:Ldefpackage/l55;

    .line 2
    .line 3
    iget-wide v0, p0, Ldefpackage/l55;->h:J

    .line 4
    .line 5
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const-wide/high16 v0, -0x8000000000000000L

    .line 15
    .line 16
    iput-wide v0, p0, Ldefpackage/l55;->h:J

    .line 17
    .line 18
    iput-wide v0, p0, Ldefpackage/l55;->i:J

    .line 19
    .line 20
    :cond_0
    iget-wide v0, p0, Ldefpackage/l55;->h:J

    .line 21
    .line 22
    iput-wide v0, p0, Ldefpackage/l55;->j:J

    .line 23
    .line 24
    return-void
.end method

.method public final j(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/tn0;->a:Ldefpackage/e55;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/e55;->b:Ldefpackage/k55;

    .line 4
    .line 5
    iget v0, p0, Ldefpackage/k55;->j:I

    .line 6
    .line 7
    if-ne v0, p1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iput p1, p0, Ldefpackage/k55;->j:I

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    invoke-virtual {p0, p1}, Ldefpackage/k55;->d(Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final k()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ldefpackage/tn0;->e:Landroid/view/Surface;

    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/tn0;->a:Ldefpackage/e55;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Ldefpackage/e55;->g(Landroid/view/Surface;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final l(Ldefpackage/kk2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/tn0;->h:Ldefpackage/q55;

    .line 2
    .line 3
    sget-object p1, Ldefpackage/gq0;->n:Ldefpackage/gq0;

    .line 4
    .line 5
    iput-object p1, p0, Ldefpackage/tn0;->i:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    return-void
.end method

.method public final m(JLdefpackage/lk2;)Z
    .locals 8

    .line 1
    iget-object v0, p0, Ldefpackage/tn0;->d:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    invoke-virtual {v0, p3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object p3, p0, Ldefpackage/tn0;->c:Ldefpackage/l55;

    .line 7
    .line 8
    iget-object v0, p3, Ldefpackage/l55;->f:Ldefpackage/uu;

    .line 9
    .line 10
    iget v1, v0, Ldefpackage/uu;->p:I

    .line 11
    .line 12
    iget-object v2, v0, Ldefpackage/uu;->r:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, [J

    .line 15
    .line 16
    array-length v3, v2

    .line 17
    const/4 v4, 0x1

    .line 18
    if-ne v1, v3, :cond_1

    .line 19
    .line 20
    array-length v1, v2

    .line 21
    shl-int/2addr v1, v4

    .line 22
    const/4 v3, 0x0

    .line 23
    if-ltz v1, :cond_0

    .line 24
    .line 25
    new-array v5, v1, [J

    .line 26
    .line 27
    array-length v6, v2

    .line 28
    iget v7, v0, Ldefpackage/uu;->n:I

    .line 29
    .line 30
    sub-int/2addr v6, v7

    .line 31
    invoke-static {v2, v7, v5, v3, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 32
    .line 33
    .line 34
    iget-object v2, v0, Ldefpackage/uu;->r:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, [J

    .line 37
    .line 38
    invoke-static {v2, v3, v5, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 39
    .line 40
    .line 41
    iput v3, v0, Ldefpackage/uu;->n:I

    .line 42
    .line 43
    iget v2, v0, Ldefpackage/uu;->p:I

    .line 44
    .line 45
    sub-int/2addr v2, v4

    .line 46
    iput v2, v0, Ldefpackage/uu;->o:I

    .line 47
    .line 48
    iput-object v5, v0, Ldefpackage/uu;->r:Ljava/lang/Object;

    .line 49
    .line 50
    sub-int/2addr v1, v4

    .line 51
    iput v1, v0, Ldefpackage/uu;->q:I

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-static {}, Ldefpackage/tb4;->a()V

    .line 55
    .line 56
    .line 57
    return v3

    .line 58
    :cond_1
    :goto_0
    iget v1, v0, Ldefpackage/uu;->o:I

    .line 59
    .line 60
    add-int/2addr v1, v4

    .line 61
    iget v2, v0, Ldefpackage/uu;->q:I

    .line 62
    .line 63
    and-int/2addr v1, v2

    .line 64
    iput v1, v0, Ldefpackage/uu;->o:I

    .line 65
    .line 66
    iget-object v2, v0, Ldefpackage/uu;->r:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v2, [J

    .line 69
    .line 70
    aput-wide p1, v2, v1

    .line 71
    .line 72
    iget v1, v0, Ldefpackage/uu;->p:I

    .line 73
    .line 74
    add-int/2addr v1, v4

    .line 75
    iput v1, v0, Ldefpackage/uu;->p:I

    .line 76
    .line 77
    iput-wide p1, p3, Ldefpackage/l55;->h:J

    .line 78
    .line 79
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    iput-wide p1, p3, Ldefpackage/l55;->j:J

    .line 85
    .line 86
    iget-object p1, p0, Ldefpackage/tn0;->i:Ljava/util/concurrent/Executor;

    .line 87
    .line 88
    new-instance p2, Ldefpackage/a0;

    .line 89
    .line 90
    const/16 p3, 0x15

    .line 91
    .line 92
    invoke-direct {p2, p3, p0}, Ldefpackage/a0;-><init>(ILjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 96
    .line 97
    .line 98
    return v4
.end method

.method public final n(Ldefpackage/tb1;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final o(Z)V
    .locals 7

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Ldefpackage/tn0;->a:Ldefpackage/e55;

    .line 10
    .line 11
    iget-object v3, p1, Ldefpackage/e55;->b:Ldefpackage/k55;

    .line 12
    .line 13
    invoke-virtual {v3}, Ldefpackage/k55;->b()V

    .line 14
    .line 15
    .line 16
    iput-wide v0, p1, Ldefpackage/e55;->h:J

    .line 17
    .line 18
    iput-wide v0, p1, Ldefpackage/e55;->f:J

    .line 19
    .line 20
    iget v3, p1, Ldefpackage/e55;->e:I

    .line 21
    .line 22
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    iput v3, p1, Ldefpackage/e55;->e:I

    .line 27
    .line 28
    iput-wide v0, p1, Ldefpackage/e55;->i:J

    .line 29
    .line 30
    :cond_0
    iget-object p1, p0, Ldefpackage/tn0;->b:Ldefpackage/f55;

    .line 31
    .line 32
    invoke-virtual {p1}, Ldefpackage/f55;->b()V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Ldefpackage/tn0;->c:Ldefpackage/l55;

    .line 36
    .line 37
    iget-object v3, p1, Ldefpackage/l55;->d:Ldefpackage/tu;

    .line 38
    .line 39
    iget-object v4, p1, Ldefpackage/l55;->f:Ldefpackage/uu;

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    iput v5, v4, Ldefpackage/uu;->n:I

    .line 43
    .line 44
    const/4 v6, -0x1

    .line 45
    iput v6, v4, Ldefpackage/uu;->o:I

    .line 46
    .line 47
    iput v5, v4, Ldefpackage/uu;->p:I

    .line 48
    .line 49
    iput-wide v0, p1, Ldefpackage/l55;->h:J

    .line 50
    .line 51
    iput-wide v0, p1, Ldefpackage/l55;->i:J

    .line 52
    .line 53
    iput-wide v0, p1, Ldefpackage/l55;->j:J

    .line 54
    .line 55
    iget-object v0, p1, Ldefpackage/l55;->e:Ldefpackage/tu;

    .line 56
    .line 57
    invoke-virtual {v0}, Ldefpackage/tu;->h()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-lez v1, :cond_3

    .line 62
    .line 63
    invoke-virtual {v0}, Ldefpackage/tu;->h()I

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-lez v1, :cond_1

    .line 68
    .line 69
    move v1, v2

    .line 70
    goto :goto_0

    .line 71
    :cond_1
    move v1, v5

    .line 72
    :goto_0
    invoke-static {v1}, Ldefpackage/rr2;->l(Z)V

    .line 73
    .line 74
    .line 75
    :goto_1
    invoke-virtual {v0}, Ldefpackage/tu;->h()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-le v1, v2, :cond_2

    .line 80
    .line 81
    invoke-virtual {v0}, Ldefpackage/tu;->e()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    invoke-virtual {v0}, Ldefpackage/tu;->e()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    check-cast v0, Ljava/lang/Long;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 95
    .line 96
    .line 97
    move-result-wide v0

    .line 98
    iput-wide v0, p1, Ldefpackage/l55;->l:J

    .line 99
    .line 100
    :cond_3
    invoke-virtual {v3}, Ldefpackage/tu;->h()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-lez p1, :cond_6

    .line 105
    .line 106
    invoke-virtual {v3}, Ldefpackage/tu;->h()I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-lez p1, :cond_4

    .line 111
    .line 112
    move v5, v2

    .line 113
    :cond_4
    invoke-static {v5}, Ldefpackage/rr2;->l(Z)V

    .line 114
    .line 115
    .line 116
    :goto_2
    invoke-virtual {v3}, Ldefpackage/tu;->h()I

    .line 117
    .line 118
    .line 119
    move-result p1

    .line 120
    if-le p1, v2, :cond_5

    .line 121
    .line 122
    invoke-virtual {v3}, Ldefpackage/tu;->e()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_5
    invoke-virtual {v3}, Ldefpackage/tu;->e()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    check-cast p1, Ldefpackage/s55;

    .line 134
    .line 135
    const-wide/16 v0, 0x0

    .line 136
    .line 137
    invoke-virtual {v3, v0, v1, p1}, Ldefpackage/tu;->a(JLjava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    :cond_6
    iget-object p0, p0, Ldefpackage/tn0;->d:Ljava/util/ArrayDeque;

    .line 141
    .line 142
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->clear()V

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method public final p(Ljava/util/List;)V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public final q(JJ)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Ldefpackage/tn0;->c:Ldefpackage/l55;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Ldefpackage/l55;->a(JJ)V
    :try_end_0
    .catch Landroidx/media3/exoplayer/ExoPlaybackException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception p1

    .line 8
    new-instance p2, Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException;

    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/tn0;->f:Ldefpackage/tb1;

    .line 11
    .line 12
    invoke-direct {p2, p1, p0}, Landroidx/media3/exoplayer/video/VideoSink$VideoSinkException;-><init>(Ljava/lang/Exception;Ldefpackage/tb1;)V

    .line 13
    .line 14
    .line 15
    throw p2
.end method

.method public final r(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/tn0;->a:Ldefpackage/e55;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldefpackage/e55;->c(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final s(Z)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/tn0;->a:Ldefpackage/e55;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldefpackage/e55;->b(Z)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final t(Ldefpackage/c55;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/tn0;->j:Ldefpackage/c55;

    .line 2
    .line 3
    return-void
.end method

.method public final u()V
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public final v(Landroid/view/Surface;Ldefpackage/pf4;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/tn0;->e:Landroid/view/Surface;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/tn0;->a:Ldefpackage/e55;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ldefpackage/e55;->g(Landroid/view/Surface;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final w()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final x()V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/tn0;->a:Ldefpackage/e55;

    .line 2
    .line 3
    iget v0, p0, Ldefpackage/e55;->e:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput v0, p0, Ldefpackage/e55;->e:I

    .line 9
    .line 10
    :cond_0
    return-void
.end method
