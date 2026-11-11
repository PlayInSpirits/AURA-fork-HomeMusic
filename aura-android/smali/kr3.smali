.class public final Lkr3;
.super Lbq;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final h:Lbi0;

.field public final i:Lss2;

.field public final j:Lww0;

.field public final k:Li80;

.field public final l:I

.field public final m:Ltb1;

.field public n:Z

.field public o:J

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Lrw4;

.field public t:Lgn2;


# direct methods
.method public constructor <init>(Lgn2;Lbi0;Lss2;Lww0;Li80;ILtb1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lbq;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lkr3;->t:Lgn2;

    .line 5
    .line 6
    iput-object p2, p0, Lkr3;->h:Lbi0;

    .line 7
    .line 8
    iput-object p3, p0, Lkr3;->i:Lss2;

    .line 9
    .line 10
    iput-object p4, p0, Lkr3;->j:Lww0;

    .line 11
    .line 12
    iput-object p5, p0, Lkr3;->k:Li80;

    .line 13
    .line 14
    iput p6, p0, Lkr3;->l:I

    .line 15
    .line 16
    iput-object p7, p0, Lkr3;->m:Ltb1;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, Lkr3;->n:Z

    .line 20
    .line 21
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    iput-wide p1, p0, Lkr3;->o:J

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final a(Lgn2;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lkr3;->h()Lgn2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lgn2;->b:Lbn2;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object p1, p1, Lgn2;->b:Lbn2;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-object v0, p1, Lbn2;->a:Landroid/net/Uri;

    .line 15
    .line 16
    iget-object v1, p0, Lbn2;->a:Landroid/net/Uri;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-wide v0, p1, Lbn2;->h:J

    .line 25
    .line 26
    iget-wide v2, p0, Lbn2;->h:J

    .line 27
    .line 28
    cmp-long v0, v0, v2

    .line 29
    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    iget-object p1, p1, Lbn2;->f:Ljava/lang/String;

    .line 33
    .line 34
    iget-object p0, p0, Lbn2;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {p1, p0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_0

    .line 41
    .line 42
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :cond_0
    const/4 p0, 0x0

    .line 45
    return p0
.end method

.method public final b(Lmt2;Ln9;J)Lno2;
    .locals 16

    .line 1
    move-object/from16 v8, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v1, v8, Lkr3;->h:Lbi0;

    .line 6
    .line 7
    invoke-interface {v1}, Lbi0;->m()Lci0;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    iget-object v1, v8, Lkr3;->s:Lrw4;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v2, v1}, Lci0;->c(Lrw4;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-virtual {v8}, Lkr3;->h()Lgn2;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v1, v1, Lgn2;->b:Lbn2;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    new-instance v3, Lhr3;

    .line 28
    .line 29
    iget-object v4, v1, Lbn2;->a:Landroid/net/Uri;

    .line 30
    .line 31
    iget-object v5, v8, Lbq;->g:Lik3;

    .line 32
    .line 33
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object v5, v8, Lkr3;->i:Lss2;

    .line 37
    .line 38
    iget-object v5, v5, Lss2;->o:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v5, Ln51;

    .line 41
    .line 42
    move-object v6, v3

    .line 43
    new-instance v3, Lz05;

    .line 44
    .line 45
    invoke-direct {v3, v5}, Lz05;-><init>(Ln51;)V

    .line 46
    .line 47
    .line 48
    new-instance v5, Lsw0;

    .line 49
    .line 50
    iget-object v7, v8, Lbq;->d:Lsw0;

    .line 51
    .line 52
    iget-object v7, v7, Lsw0;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 53
    .line 54
    const/4 v9, 0x0

    .line 55
    invoke-direct {v5, v7, v9, v0}, Lsw0;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILmt2;)V

    .line 56
    .line 57
    .line 58
    new-instance v7, Lue1;

    .line 59
    .line 60
    iget-object v10, v8, Lbq;->c:Lue1;

    .line 61
    .line 62
    iget-object v10, v10, Lue1;->q:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v10, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 65
    .line 66
    const/16 v11, 0x8

    .line 67
    .line 68
    invoke-direct {v7, v10, v9, v0, v11}, Lue1;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 69
    .line 70
    .line 71
    iget-object v10, v1, Lbn2;->f:Ljava/lang/String;

    .line 72
    .line 73
    iget-wide v0, v1, Lbn2;->h:J

    .line 74
    .line 75
    invoke-static {v0, v1}, Lf35;->Q(J)J

    .line 76
    .line 77
    .line 78
    move-result-wide v13

    .line 79
    const/4 v15, 0x0

    .line 80
    move-object v1, v4

    .line 81
    iget-object v4, v8, Lkr3;->j:Lww0;

    .line 82
    .line 83
    move-object v0, v6

    .line 84
    iget-object v6, v8, Lkr3;->k:Li80;

    .line 85
    .line 86
    iget v11, v8, Lkr3;->l:I

    .line 87
    .line 88
    iget-object v12, v8, Lkr3;->m:Ltb1;

    .line 89
    .line 90
    move-object/from16 v9, p2

    .line 91
    .line 92
    invoke-direct/range {v0 .. v15}, Lhr3;-><init>(Landroid/net/Uri;Lci0;Lz05;Lww0;Lsw0;Li80;Lue1;Lkr3;Ln9;Ljava/lang/String;ILtb1;JLty3;)V

    .line 93
    .line 94
    .line 95
    return-object v0
.end method

.method public final declared-synchronized h()Lgn2;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lkr3;->t:Lgn2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public final j()V
    .locals 0

    .line 1
    return-void
.end method

.method public final l(Lrw4;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lkr3;->s:Lrw4;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lbq;->g:Lik3;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Lkr3;->j:Lww0;

    .line 16
    .line 17
    invoke-interface {v1, p1, v0}, Lww0;->e(Landroid/os/Looper;Lik3;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Lww0;->b()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lkr3;->t()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final n(Lno2;)V
    .locals 6

    .line 1
    check-cast p1, Lhr3;

    .line 2
    .line 3
    iget-boolean p0, p1, Lhr3;->L:Z

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    iget-object p0, p1, Lhr3;->I:[Lp44;

    .line 9
    .line 10
    array-length v1, p0

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_1

    .line 13
    .line 14
    aget-object v3, p0, v2

    .line 15
    .line 16
    invoke-virtual {v3}, Lp44;->j()V

    .line 17
    .line 18
    .line 19
    iget-object v4, v3, Lp44;->h:Lpw0;

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    iget-object v5, v3, Lp44;->e:Lsw0;

    .line 24
    .line 25
    invoke-interface {v4, v5}, Lpw0;->d(Lsw0;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, v3, Lp44;->h:Lpw0;

    .line 29
    .line 30
    iput-object v0, v3, Lp44;->g:Ltb1;

    .line 31
    .line 32
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object p0, p1, Lhr3;->z:Li61;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Li61;->p(Lkd2;)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p1, Lhr3;->E:Landroid/os/Handler;

    .line 41
    .line 42
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p1, Lhr3;->F:Lmo2;

    .line 46
    .line 47
    const/4 p0, 0x1

    .line 48
    iput-boolean p0, p1, Lhr3;->d0:Z

    .line 49
    .line 50
    return-void
.end method

.method public final p()V
    .locals 0

    .line 1
    iget-object p0, p0, Lkr3;->j:Lww0;

    .line 2
    .line 3
    invoke-interface {p0}, Lww0;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final declared-synchronized s(Lgn2;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Lkr3;->t:Lgn2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public final t()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lbf4;

    .line 4
    .line 5
    iget-wide v6, v0, Lkr3;->o:J

    .line 6
    .line 7
    iget-boolean v14, v0, Lkr3;->p:Z

    .line 8
    .line 9
    iget-boolean v2, v0, Lkr3;->q:Z

    .line 10
    .line 11
    invoke-virtual {v0}, Lkr3;->h()Lgn2;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object v2, v3, Lgn2;->c:Lan2;

    .line 18
    .line 19
    :goto_0
    move-object/from16 v19, v2

    .line 20
    .line 21
    move-object/from16 v18, v3

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const/4 v2, 0x0

    .line 25
    goto :goto_0

    .line 26
    :goto_1
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    const-wide/16 v10, 0x0

    .line 37
    .line 38
    const-wide/16 v12, 0x0

    .line 39
    .line 40
    const/4 v15, 0x0

    .line 41
    const/16 v16, 0x0

    .line 42
    .line 43
    const/16 v17, 0x0

    .line 44
    .line 45
    move-wide v8, v6

    .line 46
    invoke-direct/range {v1 .. v19}, Lbf4;-><init>(JJJJJJZZZLy41;Lgn2;Lan2;)V

    .line 47
    .line 48
    .line 49
    iget-boolean v2, v0, Lkr3;->n:Z

    .line 50
    .line 51
    if-eqz v2, :cond_1

    .line 52
    .line 53
    new-instance v2, Lir3;

    .line 54
    .line 55
    invoke-direct {v2, v1}, Lbc1;-><init>(Lcu4;)V

    .line 56
    .line 57
    .line 58
    move-object v1, v2

    .line 59
    :cond_1
    invoke-virtual {v0, v1}, Lbq;->m(Lcu4;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public final u(JLm84;Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lkr3;->r:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {p3}, Lm84;->d()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {p3}, Lm84;->d()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    xor-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    iput-boolean v0, p0, Lkr3;->r:Z

    .line 19
    .line 20
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    cmp-long v0, p1, v0

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    iget-wide p1, p0, Lkr3;->o:J

    .line 30
    .line 31
    :cond_1
    invoke-interface {p3}, Lm84;->b()Z

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    iget-boolean v0, p0, Lkr3;->n:Z

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    iget-wide v0, p0, Lkr3;->o:J

    .line 40
    .line 41
    cmp-long v0, v0, p1

    .line 42
    .line 43
    if-nez v0, :cond_2

    .line 44
    .line 45
    iget-boolean v0, p0, Lkr3;->p:Z

    .line 46
    .line 47
    if-ne v0, p3, :cond_2

    .line 48
    .line 49
    iget-boolean v0, p0, Lkr3;->q:Z

    .line 50
    .line 51
    if-ne v0, p4, :cond_2

    .line 52
    .line 53
    :goto_0
    return-void

    .line 54
    :cond_2
    iput-wide p1, p0, Lkr3;->o:J

    .line 55
    .line 56
    iput-boolean p3, p0, Lkr3;->p:Z

    .line 57
    .line 58
    iput-boolean p4, p0, Lkr3;->q:Z

    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    iput-boolean p1, p0, Lkr3;->n:Z

    .line 62
    .line 63
    invoke-virtual {p0}, Lkr3;->t()V

    .line 64
    .line 65
    .line 66
    return-void
.end method
