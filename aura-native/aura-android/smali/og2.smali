.class public final Log2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lno2;
.implements Lmo2;


# instance fields
.field public final n:Lmt2;

.field public final o:J

.field public final p:Ln9;

.field public q:Lbq;

.field public r:Lno2;

.field public s:Lmo2;

.field public t:J


# direct methods
.method public constructor <init>(Lmt2;Ln9;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Log2;->n:Lmt2;

    .line 5
    .line 6
    iput-object p2, p0, Log2;->p:Ln9;

    .line 7
    .line 8
    iput-wide p3, p0, Log2;->o:J

    .line 9
    .line 10
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide p1, p0, Log2;->t:J

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(Lmt2;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Log2;->t:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v2, v0, v2

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-wide v0, p0, Log2;->o:J

    .line 14
    .line 15
    :goto_0
    iget-object v2, p0, Log2;->q:Lbq;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object v3, p0, Log2;->p:Ln9;

    .line 21
    .line 22
    invoke-virtual {v2, p1, v3, v0, v1}, Lbq;->b(Lmt2;Ln9;J)Lno2;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Log2;->r:Lno2;

    .line 27
    .line 28
    iget-object v2, p0, Log2;->s:Lmo2;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-interface {p1, p0, v0, v1}, Lno2;->m(Lmo2;J)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method

.method public final b(Lno2;)V
    .locals 1

    .line 1
    iget-object p1, p0, Log2;->s:Lmo2;

    .line 2
    .line 3
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {p1, p0}, Lmo2;->b(Lno2;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final c([Lt41;[Z[Lq44;[ZJ)J
    .locals 6

    .line 1
    iget-wide v0, p0, Log2;->t:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v4, v0, v2

    .line 9
    .line 10
    if-eqz v4, :cond_0

    .line 11
    .line 12
    iget-wide v4, p0, Log2;->o:J

    .line 13
    .line 14
    cmp-long v4, p5, v4

    .line 15
    .line 16
    if-nez v4, :cond_0

    .line 17
    .line 18
    move-wide p5, v0

    .line 19
    :cond_0
    iput-wide v2, p0, Log2;->t:J

    .line 20
    .line 21
    iget-object p0, p0, Log2;->r:Lno2;

    .line 22
    .line 23
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-interface/range {p0 .. p6}, Lno2;->c([Lt41;[Z[Lq44;[ZJ)J

    .line 26
    .line 27
    .line 28
    move-result-wide p0

    .line 29
    return-wide p0
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-object p0, p0, Log2;->r:Lno2;

    .line 2
    .line 3
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {p0}, Lda4;->d()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final e(JLn84;)J
    .locals 1

    .line 1
    iget-object p0, p0, Log2;->r:Lno2;

    .line 2
    .line 3
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2, p3}, Lno2;->e(JLn84;)J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    return-wide p0
.end method

.method public final f()Z
    .locals 0

    .line 1
    iget-object p0, p0, Log2;->r:Lno2;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Lda4;->f()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final h()V
    .locals 1

    .line 1
    iget-object v0, p0, Log2;->r:Lno2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lno2;->h()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object p0, p0, Log2;->q:Lbq;

    .line 10
    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lbq;->j()V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final i(J)J
    .locals 1

    .line 1
    iget-object p0, p0, Log2;->r:Lno2;

    .line 2
    .line 3
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2}, Lno2;->i(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    return-wide p0
.end method

.method public final j(Lda4;)V
    .locals 1

    .line 1
    check-cast p1, Lno2;

    .line 2
    .line 3
    iget-object p1, p0, Log2;->s:Lmo2;

    .line 4
    .line 5
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 6
    .line 7
    invoke-interface {p1, p0}, Lca4;->j(Lda4;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final k(ZJ)V
    .locals 1

    .line 1
    iget-object p0, p0, Log2;->r:Lno2;

    .line 2
    .line 3
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2, p3}, Lno2;->k(ZJ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final l()J
    .locals 2

    .line 1
    iget-object p0, p0, Log2;->r:Lno2;

    .line 2
    .line 3
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {p0}, Lno2;->l()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final m(Lmo2;J)V
    .locals 2

    .line 1
    iput-object p1, p0, Log2;->s:Lmo2;

    .line 2
    .line 3
    iget-object p1, p0, Log2;->r:Lno2;

    .line 4
    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    iget-wide p2, p0, Log2;->t:J

    .line 8
    .line 9
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    cmp-long v0, p2, v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-wide p2, p0, Log2;->o:J

    .line 20
    .line 21
    :goto_0
    invoke-interface {p1, p0, p2, p3}, Lno2;->m(Lmo2;J)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public final n()Ltv4;
    .locals 1

    .line 1
    iget-object p0, p0, Log2;->r:Lno2;

    .line 2
    .line 3
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {p0}, Lno2;->n()Ltv4;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final o(Lpd2;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Log2;->r:Lno2;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p1}, Lda4;->o(Lpd2;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final q()J
    .locals 2

    .line 1
    iget-object p0, p0, Log2;->r:Lno2;

    .line 2
    .line 3
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {p0}, Lda4;->q()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final u(J)V
    .locals 1

    .line 1
    iget-object p0, p0, Log2;->r:Lno2;

    .line 2
    .line 3
    sget-object v0, Lf35;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-interface {p0, p1, p2}, Lda4;->u(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
