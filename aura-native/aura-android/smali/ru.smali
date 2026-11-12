.class public final Lru;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ll83;
.implements Lg45;


# instance fields
.field public n:J

.field public o:J

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(IJ)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lru;->p:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Lm9;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 14
    .line 15
    .line 16
    iput-wide p2, p0, Lru;->n:J

    .line 17
    .line 18
    int-to-long v0, p1

    .line 19
    add-long/2addr p2, v0

    .line 20
    iput-wide p2, p0, Lru;->o:J

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[BJJ)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lru;->p:Ljava/lang/Object;

    .line 25
    iput-object p2, p0, Lru;->q:Ljava/lang/Object;

    .line 26
    iput-wide p3, p0, Lru;->n:J

    .line 27
    iput-wide p5, p0, Lru;->o:J

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public b(Ll51;)J
    .locals 6

    .line 1
    iget-wide v0, p0, Lru;->o:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long p1, v0, v2

    .line 6
    .line 7
    const-wide/16 v2, -0x1

    .line 8
    .line 9
    if-ltz p1, :cond_0

    .line 10
    .line 11
    const-wide/16 v4, 0x2

    .line 12
    .line 13
    add-long/2addr v0, v4

    .line 14
    neg-long v0, v0

    .line 15
    iput-wide v2, p0, Lru;->o:J

    .line 16
    .line 17
    return-wide v0

    .line 18
    :cond_0
    return-wide v2
.end method

.method public c(J)J
    .locals 8

    .line 1
    iget-wide v0, p0, Lru;->o:J

    .line 2
    .line 3
    add-long v2, p1, v0

    .line 4
    .line 5
    const-wide/16 v4, 0x0

    .line 6
    .line 7
    cmp-long v2, v2, v4

    .line 8
    .line 9
    if-gtz v2, :cond_0

    .line 10
    .line 11
    return-wide v4

    .line 12
    :cond_0
    add-long/2addr p1, v0

    .line 13
    iget-wide v0, p0, Lru;->n:J

    .line 14
    .line 15
    div-long v2, p1, v0

    .line 16
    .line 17
    iget-object p0, p0, Lru;->q:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lhz3;

    .line 20
    .line 21
    sget-object v6, Lhz3;->n:Lhz3;

    .line 22
    .line 23
    if-eq p0, v6, :cond_2

    .line 24
    .line 25
    const-wide/16 v6, 0x2

    .line 26
    .line 27
    rem-long v6, v2, v6

    .line 28
    .line 29
    cmp-long p0, v6, v4

    .line 30
    .line 31
    if-nez p0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const-wide/16 v4, 0x1

    .line 35
    .line 36
    add-long/2addr v2, v4

    .line 37
    mul-long/2addr v2, v0

    .line 38
    sub-long/2addr v2, p1

    .line 39
    return-wide v2

    .line 40
    :cond_2
    :goto_0
    mul-long/2addr v2, v0

    .line 41
    sub-long/2addr p1, v2

    .line 42
    return-wide p1
.end method

.method public d(JLce;Lce;Lce;)Lce;
    .locals 7

    .line 1
    iget-object v0, p0, Lru;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx7;

    .line 4
    .line 5
    move-wide v2, p1

    .line 6
    invoke-virtual {p0, v2, v3}, Lru;->c(J)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    move-object v1, p0

    .line 11
    move-object v4, p3

    .line 12
    move-object v6, p4

    .line 13
    move-object v5, p5

    .line 14
    invoke-virtual/range {v1 .. v6}, Lru;->f(JLce;Lce;Lce;)Lce;

    .line 15
    .line 16
    .line 17
    move-result-object p5

    .line 18
    iget-object p0, v0, Lx7;->p:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lss0;

    .line 21
    .line 22
    invoke-virtual/range {p0 .. p5}, Lss0;->d(JLce;Lce;Lce;)Lce;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public e()Lm84;
    .locals 5

    .line 1
    iget-wide v0, p0, Lru;->n:J

    .line 2
    .line 3
    const-wide/16 v2, -0x1

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move v0, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    invoke-static {v0}, Lrr2;->w(Z)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lbo;

    .line 17
    .line 18
    iget-object v2, p0, Lru;->p:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Lv71;

    .line 21
    .line 22
    iget-wide v3, p0, Lru;->n:J

    .line 23
    .line 24
    invoke-direct {v0, v2, v3, v4, v1}, Lbo;-><init>(Ljava/lang/Object;JI)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public f(JLce;Lce;Lce;)Lce;
    .locals 10

    .line 1
    iget-wide v0, p0, Lru;->o:J

    .line 2
    .line 3
    add-long/2addr p1, v0

    .line 4
    iget-wide v2, p0, Lru;->n:J

    .line 5
    .line 6
    cmp-long p1, p1, v2

    .line 7
    .line 8
    if-lez p1, :cond_0

    .line 9
    .line 10
    iget-object p0, p0, Lru;->p:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lx7;

    .line 13
    .line 14
    sub-long v5, v2, v0

    .line 15
    .line 16
    iget-object p0, p0, Lx7;->p:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v4, p0

    .line 19
    check-cast v4, Lss0;

    .line 20
    .line 21
    move-object v7, p3

    .line 22
    move-object v9, p4

    .line 23
    move-object v8, p5

    .line 24
    invoke-virtual/range {v4 .. v9}, Lss0;->d(JLce;Lce;Lce;)Lce;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :cond_0
    move-object v9, p4

    .line 30
    return-object v9
.end method

.method public g(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lru;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lrm3;

    .line 4
    .line 5
    iget-object v0, v0, Lrm3;->n:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, [J

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-static {v0, p1, p2, v1}, Lf35;->f([JJZ)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    aget-wide p1, v0, p1

    .line 15
    .line 16
    iput-wide p1, p0, Lru;->o:J

    .line 17
    .line 18
    return-void
.end method

.method public k(JLce;Lce;Lce;)Lce;
    .locals 7

    .line 1
    iget-object v0, p0, Lru;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lx7;

    .line 4
    .line 5
    move-wide v2, p1

    .line 6
    invoke-virtual {p0, v2, v3}, Lru;->c(J)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    move-object v1, p0

    .line 11
    move-object v4, p3

    .line 12
    move-object v6, p4

    .line 13
    move-object v5, p5

    .line 14
    invoke-virtual/range {v1 .. v6}, Lru;->f(JLce;Lce;Lce;)Lce;

    .line 15
    .line 16
    .line 17
    move-result-object p5

    .line 18
    iget-object p0, v0, Lx7;->p:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lss0;

    .line 21
    .line 22
    invoke-virtual/range {p0 .. p5}, Lss0;->k(JLce;Lce;Lce;)Lce;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public m(Lce;Lce;Lce;)J
    .locals 0

    .line 1
    const-wide p0, 0x7fffffffffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide p0
.end method
