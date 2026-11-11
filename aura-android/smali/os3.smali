.class public final Los3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcd2;


# instance fields
.field public final a:Lwl0;


# direct methods
.method public constructor <init>(Lwl0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Los3;->a:Lwl0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lik3;Lcu4;Lmt2;J)Z
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Los3;->a:Lwl0;

    .line 8
    .line 9
    invoke-virtual/range {p0 .. p5}, Lwl0;->a(Lik3;Lcu4;Lmt2;J)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final b(Lik3;)V
    .locals 0

    .line 1
    iget-object p0, p0, Los3;->a:Lwl0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lwl0;->b(Lik3;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c(Lik3;)V
    .locals 0

    .line 1
    iget-object p0, p0, Los3;->a:Lwl0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lwl0;->m(Lik3;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Lik3;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final e(Lik3;)V
    .locals 0

    .line 1
    iget-object p0, p0, Los3;->a:Lwl0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lwl0;->e(Lik3;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f(Lbd2;Ltv4;[Lt41;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Los3;->a:Lwl0;

    .line 8
    .line 9
    invoke-virtual {p0, p1, p2, p3}, Lwl0;->f(Lbd2;Ltv4;[Lt41;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final g(Lik3;)Lr20;
    .locals 1

    .line 1
    new-instance v0, Lr20;

    .line 2
    .line 3
    iget-object p0, p0, Los3;->a:Lwl0;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lr20;-><init>(Lwl0;Lik3;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public final h(Lbd2;)Z
    .locals 7

    .line 1
    iget-wide v0, p1, Lbd2;->d:J

    .line 2
    .line 3
    iget-wide v2, p1, Lbd2;->e:J

    .line 4
    .line 5
    invoke-static {}, Ljp1;->a()Z

    .line 6
    .line 7
    .line 8
    move-result v4

    .line 9
    const-wide/32 v5, -0x1312d00

    .line 10
    .line 11
    .line 12
    cmp-long v5, v0, v5

    .line 13
    .line 14
    if-gez v5, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    if-eqz v4, :cond_1

    .line 18
    .line 19
    const-wide/32 v4, 0x1c9c380

    .line 20
    .line 21
    .line 22
    cmp-long v0, v0, v4

    .line 23
    .line 24
    if-gez v0, :cond_1

    .line 25
    .line 26
    const-wide/32 v0, 0x2625a00

    .line 27
    .line 28
    .line 29
    cmp-long v0, v2, v0

    .line 30
    .line 31
    if-gez v0, :cond_2

    .line 32
    .line 33
    :cond_1
    iget-object p0, p0, Los3;->a:Lwl0;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lwl0;->h(Lbd2;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_2

    .line 40
    .line 41
    const/4 p0, 0x1

    .line 42
    return p0

    .line 43
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 44
    return p0
.end method

.method public final i(Lik3;)J
    .locals 0

    .line 1
    iget-object p0, p0, Los3;->a:Lwl0;

    .line 2
    .line 3
    iget-wide p0, p0, Lwl0;->n:J

    .line 4
    .line 5
    return-wide p0
.end method

.method public final j(Lbd2;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Los3;->a:Lwl0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lwl0;->j(Lbd2;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
