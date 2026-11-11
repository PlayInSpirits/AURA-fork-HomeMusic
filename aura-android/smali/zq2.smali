.class public final Lzq2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lyj2;


# instance fields
.field public n:J

.field public o:J

.field public p:Z

.field public final q:Ljava/lang/Object;

.field public r:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Llc;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzq2;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lqa1;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lzq2;->q:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p1, p0, Lzq2;->r:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lvp4;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lzq2;->q:Ljava/lang/Object;

    .line 20
    sget-object p1, Lqh3;->d:Lqh3;

    iput-object p1, p0, Lzq2;->r:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lzq2;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lzq2;->r:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Loh3;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-wide v1, v0, Loh3;->g:J

    .line 12
    .line 13
    iget-wide v3, p0, Lzq2;->o:J

    .line 14
    .line 15
    sub-long v3, p1, v3

    .line 16
    .line 17
    const-wide/16 v5, 0x0

    .line 18
    .line 19
    cmp-long v7, v3, v5

    .line 20
    .line 21
    if-gez v7, :cond_0

    .line 22
    .line 23
    move-wide v3, v5

    .line 24
    :cond_0
    add-long/2addr v1, v3

    .line 25
    iput-wide v1, v0, Loh3;->g:J

    .line 26
    .line 27
    :cond_1
    iput-wide p1, p0, Lzq2;->o:J

    .line 28
    .line 29
    return-void
.end method

.method public b(JJZ)V
    .locals 3

    .line 1
    invoke-virtual {p0, p3, p4}, Lzq2;->a(J)V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long v2, p1, v0

    .line 7
    .line 8
    if-gez v2, :cond_0

    .line 9
    .line 10
    move-wide p1, v0

    .line 11
    :cond_0
    iput-wide p1, p0, Lzq2;->n:J

    .line 12
    .line 13
    iput-wide p3, p0, Lzq2;->o:J

    .line 14
    .line 15
    iput-boolean p5, p0, Lzq2;->p:Z

    .line 16
    .line 17
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/Long;JZLjava/lang/String;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p3

    .line 4
    .line 5
    iget-object v3, v0, Lzq2;->r:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v3, Loh3;

    .line 8
    .line 9
    if-nez v3, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    if-eqz p2, :cond_1

    .line 13
    .line 14
    iget-object v4, v3, Loh3;->a:Ljava/lang/String;

    .line 15
    .line 16
    move-object/from16 v5, p1

    .line 17
    .line 18
    invoke-static {v5, v4}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    if-eqz v4, :cond_1

    .line 23
    .line 24
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Long;->longValue()J

    .line 25
    .line 26
    .line 27
    move-result-wide v4

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {v0, v1, v2}, Lzq2;->e(J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v4

    .line 33
    :goto_0
    invoke-virtual {v0, v1, v2}, Lzq2;->a(J)V

    .line 34
    .line 35
    .line 36
    iget-wide v6, v3, Loh3;->b:J

    .line 37
    .line 38
    const/4 v8, 0x0

    .line 39
    const-wide/16 v9, 0x0

    .line 40
    .line 41
    if-nez p5, :cond_3

    .line 42
    .line 43
    cmp-long v11, v6, v9

    .line 44
    .line 45
    if-lez v11, :cond_2

    .line 46
    .line 47
    long-to-double v11, v4

    .line 48
    long-to-double v13, v6

    .line 49
    const-wide v15, 0x3feccccccccccccdL    # 0.9

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    mul-double/2addr v13, v15

    .line 55
    cmpl-double v11, v11, v13

    .line 56
    .line 57
    if-ltz v11, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move v11, v8

    .line 61
    goto :goto_2

    .line 62
    :cond_3
    :goto_1
    const/4 v11, 0x1

    .line 63
    :goto_2
    if-eqz p5, :cond_4

    .line 64
    .line 65
    cmp-long v9, v6, v9

    .line 66
    .line 67
    if-lez v9, :cond_4

    .line 68
    .line 69
    move-wide v4, v6

    .line 70
    :cond_4
    const/4 v6, 0x0

    .line 71
    iput-object v6, v0, Lzq2;->r:Ljava/lang/Object;

    .line 72
    .line 73
    iput-boolean v8, v0, Lzq2;->p:Z

    .line 74
    .line 75
    iget-object v0, v0, Lzq2;->q:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Llc;

    .line 78
    .line 79
    if-nez p6, :cond_6

    .line 80
    .line 81
    if-eqz v11, :cond_5

    .line 82
    .line 83
    const-string v6, "finish"

    .line 84
    .line 85
    goto :goto_3

    .line 86
    :cond_5
    const-string v6, "skip"

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :cond_6
    move-object/from16 v6, p6

    .line 90
    .line 91
    :goto_3
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v0, v6, v3, v4, v1}, Llc;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public d(Lqh3;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lzq2;->p:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lzq2;->j()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-virtual {p0, v0, v1}, Lzq2;->f(J)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iput-object p1, p0, Lzq2;->r:Ljava/lang/Object;

    .line 13
    .line 14
    return-void
.end method

.method public e(J)J
    .locals 5

    .line 1
    iget-boolean v0, p0, Lzq2;->p:Z

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-wide v3, p0, Lzq2;->o:J

    .line 8
    .line 9
    sub-long/2addr p1, v3

    .line 10
    cmp-long v0, p1, v1

    .line 11
    .line 12
    if-gez v0, :cond_1

    .line 13
    .line 14
    :cond_0
    move-wide p1, v1

    .line 15
    :cond_1
    iget-wide v3, p0, Lzq2;->n:J

    .line 16
    .line 17
    add-long/2addr v3, p1

    .line 18
    iget-object p0, p0, Lzq2;->r:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Loh3;

    .line 21
    .line 22
    if-eqz p0, :cond_2

    .line 23
    .line 24
    iget-wide p0, p0, Loh3;->b:J

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    move-wide p0, v1

    .line 28
    :goto_0
    cmp-long p2, p0, v1

    .line 29
    .line 30
    if-lez p2, :cond_3

    .line 31
    .line 32
    cmp-long p2, v3, p0

    .line 33
    .line 34
    if-lez p2, :cond_3

    .line 35
    .line 36
    return-wide p0

    .line 37
    :cond_3
    return-wide v3
.end method

.method public f(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lzq2;->n:J

    .line 2
    .line 3
    iget-boolean p1, p0, Lzq2;->p:Z

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lzq2;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Lvp4;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 15
    .line 16
    .line 17
    move-result-wide p1

    .line 18
    iput-wide p1, p0, Lzq2;->o:J

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public g()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lzq2;->p:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lzq2;->q:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lvp4;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    iput-wide v0, p0, Lzq2;->o:J

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lzq2;->p:Z

    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public i()Lqh3;
    .locals 0

    .line 1
    iget-object p0, p0, Lzq2;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lqh3;

    .line 4
    .line 5
    return-object p0
.end method

.method public j()J
    .locals 6

    .line 1
    iget-wide v0, p0, Lzq2;->n:J

    .line 2
    .line 3
    iget-boolean v2, p0, Lzq2;->p:Z

    .line 4
    .line 5
    if-eqz v2, :cond_1

    .line 6
    .line 7
    iget-object v2, p0, Lzq2;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Lvp4;

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 15
    .line 16
    .line 17
    move-result-wide v2

    .line 18
    iget-wide v4, p0, Lzq2;->o:J

    .line 19
    .line 20
    sub-long/2addr v2, v4

    .line 21
    iget-object p0, p0, Lzq2;->r:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Lqh3;

    .line 24
    .line 25
    iget v4, p0, Lqh3;->a:F

    .line 26
    .line 27
    const/high16 v5, 0x3f800000    # 1.0f

    .line 28
    .line 29
    cmpl-float v4, v4, v5

    .line 30
    .line 31
    if-nez v4, :cond_0

    .line 32
    .line 33
    invoke-static {v2, v3}, Lf35;->Q(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    :goto_0
    add-long/2addr v2, v0

    .line 38
    return-wide v2

    .line 39
    :cond_0
    iget p0, p0, Lqh3;->c:I

    .line 40
    .line 41
    int-to-long v4, p0

    .line 42
    mul-long/2addr v2, v4

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    return-wide v0
.end method
