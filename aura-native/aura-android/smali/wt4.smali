.class public final Lwt4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lno2;
.implements Lmo2;


# instance fields
.field public final n:Lno2;

.field public final o:J

.field public p:Lmo2;


# direct methods
.method public constructor <init>(Lno2;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwt4;->n:Lno2;

    .line 5
    .line 6
    iput-wide p2, p0, Lwt4;->o:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Lno2;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lwt4;->p:Lmo2;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p0}, Lmo2;->b(Lno2;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final c([Lt41;[Z[Lq44;[ZJ)J
    .locals 11

    .line 1
    array-length v0, p3

    .line 2
    new-array v4, v0, [Lq44;

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    move v1, v0

    .line 6
    :goto_0
    array-length v2, p3

    .line 7
    const/4 v8, 0x0

    .line 8
    if-ge v1, v2, :cond_1

    .line 9
    .line 10
    aget-object v2, p3, v1

    .line 11
    .line 12
    check-cast v2, Lvt4;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-object v8, v2, Lvt4;->n:Lq44;

    .line 17
    .line 18
    :cond_0
    aput-object v8, v4, v1

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    iget-object v1, p0, Lwt4;->n:Lno2;

    .line 24
    .line 25
    iget-wide v9, p0, Lwt4;->o:J

    .line 26
    .line 27
    sub-long v6, p5, v9

    .line 28
    .line 29
    move-object v2, p1

    .line 30
    move-object v3, p2

    .line 31
    move-object v5, p4

    .line 32
    invoke-interface/range {v1 .. v7}, Lno2;->c([Lt41;[Z[Lq44;[ZJ)J

    .line 33
    .line 34
    .line 35
    move-result-wide p0

    .line 36
    :goto_1
    array-length p2, p3

    .line 37
    if-ge v0, p2, :cond_5

    .line 38
    .line 39
    aget-object p2, v4, v0

    .line 40
    .line 41
    if-nez p2, :cond_2

    .line 42
    .line 43
    aput-object v8, p3, v0

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    aget-object v1, p3, v0

    .line 47
    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    check-cast v1, Lvt4;

    .line 51
    .line 52
    iget-object v1, v1, Lvt4;->n:Lq44;

    .line 53
    .line 54
    if-eq v1, p2, :cond_4

    .line 55
    .line 56
    :cond_3
    new-instance v1, Lvt4;

    .line 57
    .line 58
    invoke-direct {v1, p2, v9, v10}, Lvt4;-><init>(Lq44;J)V

    .line 59
    .line 60
    .line 61
    aput-object v1, p3, v0

    .line 62
    .line 63
    :cond_4
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_5
    add-long/2addr p0, v9

    .line 67
    return-wide p0
.end method

.method public final d()J
    .locals 5

    .line 1
    iget-object v0, p0, Lwt4;->n:Lno2;

    .line 2
    .line 3
    invoke-interface {v0}, Lda4;->d()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/high16 v2, -0x8000000000000000L

    .line 8
    .line 9
    cmp-long v4, v0, v2

    .line 10
    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    return-wide v2

    .line 14
    :cond_0
    iget-wide v2, p0, Lwt4;->o:J

    .line 15
    .line 16
    add-long/2addr v0, v2

    .line 17
    return-wide v0
.end method

.method public final e(JLn84;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lwt4;->o:J

    .line 2
    .line 3
    sub-long/2addr p1, v0

    .line 4
    iget-object p0, p0, Lwt4;->n:Lno2;

    .line 5
    .line 6
    invoke-interface {p0, p1, p2, p3}, Lno2;->e(JLn84;)J

    .line 7
    .line 8
    .line 9
    move-result-wide p0

    .line 10
    add-long/2addr p0, v0

    .line 11
    return-wide p0
.end method

.method public final f()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lwt4;->n:Lno2;

    .line 2
    .line 3
    invoke-interface {p0}, Lda4;->f()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final h()V
    .locals 0

    .line 1
    iget-object p0, p0, Lwt4;->n:Lno2;

    .line 2
    .line 3
    invoke-interface {p0}, Lno2;->h()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final i(J)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lwt4;->o:J

    .line 2
    .line 3
    sub-long/2addr p1, v0

    .line 4
    iget-object p0, p0, Lwt4;->n:Lno2;

    .line 5
    .line 6
    invoke-interface {p0, p1, p2}, Lno2;->i(J)J

    .line 7
    .line 8
    .line 9
    move-result-wide p0

    .line 10
    add-long/2addr p0, v0

    .line 11
    return-wide p0
.end method

.method public final j(Lda4;)V
    .locals 0

    .line 1
    check-cast p1, Lno2;

    .line 2
    .line 3
    iget-object p1, p0, Lwt4;->p:Lmo2;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {p1, p0}, Lca4;->j(Lda4;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final k(ZJ)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lwt4;->o:J

    .line 2
    .line 3
    sub-long/2addr p2, v0

    .line 4
    iget-object p0, p0, Lwt4;->n:Lno2;

    .line 5
    .line 6
    invoke-interface {p0, p1, p2, p3}, Lno2;->k(ZJ)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final l()J
    .locals 5

    .line 1
    iget-object v0, p0, Lwt4;->n:Lno2;

    .line 2
    .line 3
    invoke-interface {v0}, Lno2;->l()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long v4, v0, v2

    .line 13
    .line 14
    if-nez v4, :cond_0

    .line 15
    .line 16
    return-wide v2

    .line 17
    :cond_0
    iget-wide v2, p0, Lwt4;->o:J

    .line 18
    .line 19
    add-long/2addr v0, v2

    .line 20
    return-wide v0
.end method

.method public final m(Lmo2;J)V
    .locals 2

    .line 1
    iput-object p1, p0, Lwt4;->p:Lmo2;

    .line 2
    .line 3
    iget-wide v0, p0, Lwt4;->o:J

    .line 4
    .line 5
    sub-long/2addr p2, v0

    .line 6
    iget-object p1, p0, Lwt4;->n:Lno2;

    .line 7
    .line 8
    invoke-interface {p1, p0, p2, p3}, Lno2;->m(Lmo2;J)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final n()Ltv4;
    .locals 0

    .line 1
    iget-object p0, p0, Lwt4;->n:Lno2;

    .line 2
    .line 3
    invoke-interface {p0}, Lno2;->n()Ltv4;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final o(Lpd2;)Z
    .locals 5

    .line 1
    new-instance v0, Lod2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-wide v1, p1, Lpd2;->a:J

    .line 7
    .line 8
    iget v3, p1, Lpd2;->b:F

    .line 9
    .line 10
    iput v3, v0, Lod2;->b:F

    .line 11
    .line 12
    iget-wide v3, p1, Lpd2;->c:J

    .line 13
    .line 14
    iput-wide v3, v0, Lod2;->c:J

    .line 15
    .line 16
    iget-wide v3, p0, Lwt4;->o:J

    .line 17
    .line 18
    sub-long/2addr v1, v3

    .line 19
    iput-wide v1, v0, Lod2;->a:J

    .line 20
    .line 21
    new-instance p1, Lpd2;

    .line 22
    .line 23
    invoke-direct {p1, v0}, Lpd2;-><init>(Lod2;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Lwt4;->n:Lno2;

    .line 27
    .line 28
    invoke-interface {p0, p1}, Lda4;->o(Lpd2;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    return p0
.end method

.method public final q()J
    .locals 5

    .line 1
    iget-object v0, p0, Lwt4;->n:Lno2;

    .line 2
    .line 3
    invoke-interface {v0}, Lda4;->q()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide/high16 v2, -0x8000000000000000L

    .line 8
    .line 9
    cmp-long v4, v0, v2

    .line 10
    .line 11
    if-nez v4, :cond_0

    .line 12
    .line 13
    return-wide v2

    .line 14
    :cond_0
    iget-wide v2, p0, Lwt4;->o:J

    .line 15
    .line 16
    add-long/2addr v0, v2

    .line 17
    return-wide v0
.end method

.method public final u(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lwt4;->o:J

    .line 2
    .line 3
    sub-long/2addr p1, v0

    .line 4
    iget-object p0, p0, Lwt4;->n:Lno2;

    .line 5
    .line 6
    invoke-interface {p0, p1, p2}, Lda4;->u(J)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
