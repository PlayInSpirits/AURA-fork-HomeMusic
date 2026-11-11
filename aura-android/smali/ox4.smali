.class public final Lox4;
.super La13;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final o:La13;

.field public final p:Z

.field public final q:Z

.field public r:Lif1;

.field public s:Lif1;

.field public final t:J


# direct methods
.method public constructor <init>(La13;Lif1;Lif1;ZZ)V
    .locals 7

    .line 1
    sget-object v0, Ljh4;->a:Lo54;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, La13;->y()Lif1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :cond_0
    sget-object v0, Ljh4;->j:Lyi1;

    .line 12
    .line 13
    iget-object v0, v0, La13;->e:Lif1;

    .line 14
    .line 15
    :cond_1
    invoke-static {p2, v0, p4}, Ljh4;->k(Lif1;Lif1;Z)Lif1;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p1}, La13;->i()Lif1;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    if-nez p2, :cond_3

    .line 26
    .line 27
    :cond_2
    sget-object p2, Ljh4;->j:Lyi1;

    .line 28
    .line 29
    iget-object p2, p2, La13;->f:Lif1;

    .line 30
    .line 31
    :cond_3
    invoke-static {p3, p2}, Ljh4;->l(Lif1;Lif1;)Lif1;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    const-wide/16 v2, 0x0

    .line 36
    .line 37
    sget-object v4, Lgh4;->r:Lgh4;

    .line 38
    .line 39
    move-object v1, p0

    .line 40
    invoke-direct/range {v1 .. v6}, La13;-><init>(JLgh4;Lif1;Lif1;)V

    .line 41
    .line 42
    .line 43
    iput-object p1, v1, Lox4;->o:La13;

    .line 44
    .line 45
    iput-boolean p4, v1, Lox4;->p:Z

    .line 46
    .line 47
    iput-boolean p5, v1, Lox4;->q:Z

    .line 48
    .line 49
    iget-object p0, v1, La13;->e:Lif1;

    .line 50
    .line 51
    iput-object p0, v1, Lox4;->r:Lif1;

    .line 52
    .line 53
    iget-object p0, v1, La13;->f:Lif1;

    .line 54
    .line 55
    iput-object p0, v1, Lox4;->s:Lif1;

    .line 56
    .line 57
    invoke-static {}, Lte5;->m()J

    .line 58
    .line 59
    .line 60
    move-result-wide p0

    .line 61
    iput-wide p0, v1, Lox4;->t:J

    .line 62
    .line 63
    return-void
.end method


# virtual methods
.method public final B(Lx03;)V
    .locals 0

    .line 1
    invoke-static {}, Lte5;->Q()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final C(Lif1;Lif1;)La13;
    .locals 8

    .line 1
    iget-object v0, p0, Lox4;->r:Lif1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p1, v0, v1}, Ljh4;->k(Lif1;Lif1;Z)Lif1;

    .line 5
    .line 6
    .line 7
    move-result-object v4

    .line 8
    iget-object p1, p0, Lox4;->s:Lif1;

    .line 9
    .line 10
    invoke-static {p2, p1}, Ljh4;->l(Lif1;Lif1;)Lif1;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    iget-boolean p1, p0, Lox4;->p:Z

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lox4;->D()La13;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-virtual {p0, p1, v5}, La13;->C(Lif1;Lif1;)La13;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    new-instance v2, Lox4;

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    const/4 v7, 0x1

    .line 31
    invoke-direct/range {v2 .. v7}, Lox4;-><init>(La13;Lif1;Lif1;ZZ)V

    .line 32
    .line 33
    .line 34
    return-object v2

    .line 35
    :cond_0
    invoke-virtual {p0}, Lox4;->D()La13;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0, v4, v5}, La13;->C(Lif1;Lif1;)La13;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method

.method public final D()La13;
    .locals 0

    .line 1
    iget-object p0, p0, Lox4;->o:La13;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    sget-object p0, Ljh4;->j:Lyi1;

    .line 6
    .line 7
    :cond_0
    return-object p0
.end method

.method public final c()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lch4;->c:Z

    .line 3
    .line 4
    iget-boolean v0, p0, Lox4;->q:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Lox4;->o:La13;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, La13;->c()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final d()Lgh4;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lox4;->D()La13;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lch4;->d()Lgh4;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final e()Lif1;
    .locals 0

    .line 1
    iget-object p0, p0, Lox4;->r:Lif1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lox4;->D()La13;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La13;->f()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final g()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lox4;->D()La13;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lch4;->g()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public final h()I
    .locals 0

    .line 1
    invoke-virtual {p0}, Lox4;->D()La13;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La13;->h()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final i()Lif1;
    .locals 0

    .line 1
    iget-object p0, p0, Lox4;->s:Lif1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final k()V
    .locals 0

    .line 1
    invoke-static {}, Lte5;->Q()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final l()V
    .locals 0

    .line 1
    invoke-static {}, Lte5;->Q()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final m()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lox4;->D()La13;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La13;->m()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final n(Lrl4;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lox4;->D()La13;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, La13;->n(Lrl4;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final r(Lgh4;)V
    .locals 0

    .line 1
    invoke-static {}, Lte5;->Q()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final s(J)V
    .locals 0

    .line 1
    invoke-static {}, Lte5;->Q()V

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    throw p0
.end method

.method public final t(I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lox4;->D()La13;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1}, La13;->t(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final u(Lif1;)Lch4;
    .locals 2

    .line 1
    iget-object v0, p0, Lox4;->r:Lif1;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {p1, v0, v1}, Ljh4;->k(Lif1;Lif1;Z)Lif1;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-boolean v0, p0, Lox4;->p:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Lox4;->D()La13;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, v0}, La13;->u(Lif1;)Lch4;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0, p1, v1}, Ljh4;->g(Lch4;Lif1;Z)Lch4;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_0
    invoke-virtual {p0}, Lox4;->D()La13;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0, p1}, La13;->u(Lif1;)Lch4;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public final w()Ljz4;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lox4;->D()La13;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La13;->w()Ljz4;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final x()Lx03;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lox4;->D()La13;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La13;->x()Lx03;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final y()Lif1;
    .locals 0

    .line 1
    iget-object p0, p0, Lox4;->r:Lif1;

    .line 2
    .line 3
    return-object p0
.end method
