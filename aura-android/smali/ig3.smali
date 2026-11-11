.class public abstract Lig3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Loo0;


# instance fields
.field public n:Z


# direct methods
.method public static final a(Lig3;Ljg3;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Lyx2;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p1, Lyx2;

    .line 9
    .line 10
    iget-boolean p0, p0, Lig3;->n:Z

    .line 11
    .line 12
    invoke-interface {p1, p0}, Lyx2;->x(Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public static f(Lig3;Ljg3;II)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    int-to-long v0, p2

    .line 5
    const/16 p2, 0x20

    .line 6
    .line 7
    shl-long/2addr v0, p2

    .line 8
    int-to-long p2, p3

    .line 9
    const-wide v2, 0xffffffffL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    and-long/2addr p2, v2

    .line 15
    or-long/2addr p2, v0

    .line 16
    invoke-static {p0, p1}, Lig3;->a(Lig3;Ljg3;)V

    .line 17
    .line 18
    .line 19
    iget-wide v0, p1, Ljg3;->r:J

    .line 20
    .line 21
    invoke-static {p2, p3, v0, v1}, Lg02;->c(JJ)J

    .line 22
    .line 23
    .line 24
    move-result-wide p2

    .line 25
    const/4 p0, 0x0

    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-virtual {p1, p2, p3, p0, v0}, Ljg3;->N(JFLif1;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static j(Lig3;Ljg3;J)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, Lig3;->a(Lig3;Ljg3;)V

    .line 5
    .line 6
    .line 7
    iget-wide v0, p1, Ljg3;->r:J

    .line 8
    .line 9
    invoke-static {p2, p3, v0, v1}, Lg02;->c(JJ)J

    .line 10
    .line 11
    .line 12
    move-result-wide p2

    .line 13
    const/4 p0, 0x0

    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p1, p2, p3, p0, v0}, Ljg3;->N(JFLif1;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static k(Lig3;Ljg3;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lig3;->c()Lr62;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lr62;->n:Lr62;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Lig3;->e()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0}, Lig3;->e()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v1, p1, Ljg3;->n:I

    .line 23
    .line 24
    sub-int/2addr v0, v1

    .line 25
    int-to-long v0, v0

    .line 26
    const/16 v4, 0x20

    .line 27
    .line 28
    shl-long/2addr v0, v4

    .line 29
    invoke-static {p0, p1}, Lig3;->a(Lig3;Ljg3;)V

    .line 30
    .line 31
    .line 32
    iget-wide v4, p1, Ljg3;->r:J

    .line 33
    .line 34
    invoke-static {v0, v1, v4, v5}, Lg02;->c(JJ)J

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    invoke-virtual {p1, v0, v1, v2, v3}, Ljg3;->N(JFLif1;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    :goto_0
    invoke-static {p0, p1}, Lig3;->a(Lig3;Ljg3;)V

    .line 43
    .line 44
    .line 45
    iget-wide v0, p1, Ljg3;->r:J

    .line 46
    .line 47
    const-wide/16 v4, 0x0

    .line 48
    .line 49
    invoke-static {v4, v5, v0, v1}, Lg02;->c(JJ)J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    invoke-virtual {p1, v0, v1, v2, v3}, Ljg3;->N(JFLif1;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public static n(Lig3;Ljg3;)V
    .locals 6

    .line 1
    sget-object v0, Lkg3;->a:Lk52;

    .line 2
    .line 3
    invoke-virtual {p0}, Lig3;->c()Lr62;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Lr62;->n:Lr62;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eq v1, v2, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Lig3;->e()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Lig3;->e()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    iget v2, p1, Ljg3;->n:I

    .line 24
    .line 25
    sub-int/2addr v1, v2

    .line 26
    int-to-long v1, v1

    .line 27
    const/16 v4, 0x20

    .line 28
    .line 29
    shl-long/2addr v1, v4

    .line 30
    invoke-static {p0, p1}, Lig3;->a(Lig3;Ljg3;)V

    .line 31
    .line 32
    .line 33
    iget-wide v4, p1, Ljg3;->r:J

    .line 34
    .line 35
    invoke-static {v1, v2, v4, v5}, Lg02;->c(JJ)J

    .line 36
    .line 37
    .line 38
    move-result-wide v1

    .line 39
    invoke-virtual {p1, v1, v2, v3, v0}, Ljg3;->N(JFLif1;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    :goto_0
    invoke-static {p0, p1}, Lig3;->a(Lig3;Ljg3;)V

    .line 44
    .line 45
    .line 46
    iget-wide v1, p1, Ljg3;->r:J

    .line 47
    .line 48
    const-wide/16 v4, 0x0

    .line 49
    .line 50
    invoke-static {v4, v5, v1, v2}, Lg02;->c(JJ)J

    .line 51
    .line 52
    .line 53
    move-result-wide v1

    .line 54
    invoke-virtual {p1, v1, v2, v3, v0}, Ljg3;->N(JFLif1;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public static q(Lig3;Ljg3;Lif1;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1}, Lig3;->a(Lig3;Ljg3;)V

    .line 5
    .line 6
    .line 7
    iget-wide v0, p1, Ljg3;->r:J

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1}, Lg02;->c(JJ)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    const/4 p0, 0x0

    .line 16
    invoke-virtual {p1, v0, v1, p0, p2}, Ljg3;->N(JFLif1;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public b(Lrp1;)F
    .locals 0

    .line 1
    const/high16 p0, 0x7fc00000    # Float.NaN

    .line 2
    .line 3
    return p0
.end method

.method public abstract c()Lr62;
.end method

.method public abstract e()I
.end method
