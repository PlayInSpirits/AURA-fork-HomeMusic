.class public final Le45;
.super Lhd3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final e:Lzd3;

.field public final f:Lzd3;

.field public final g:Ln35;

.field public final h:Lzd3;

.field public i:F

.field public j:Ldt;


# direct methods
.method public constructor <init>(Lgk1;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lhd3;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lqf4;

    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, Lqf4;-><init>(J)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Luc5;->B(Ljava/lang/Object;)Lzd3;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Le45;->e:Lzd3;

    .line 16
    .line 17
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 18
    .line 19
    invoke-static {v0}, Luc5;->B(Ljava/lang/Object;)Lzd3;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Le45;->f:Lzd3;

    .line 24
    .line 25
    new-instance v0, Ln35;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Ln35;-><init>(Lgk1;)V

    .line 28
    .line 29
    .line 30
    new-instance p1, Le25;

    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-direct {p1, v1, p0}, Le25;-><init>(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, v0, Ln35;->f:Lgf1;

    .line 37
    .line 38
    iput-object v0, p0, Le45;->g:Ln35;

    .line 39
    .line 40
    sget-object p1, Lrv2;->s:Lrv2;

    .line 41
    .line 42
    new-instance v0, Lzd3;

    .line 43
    .line 44
    sget-object v1, Lj15;->a:Lj15;

    .line 45
    .line 46
    invoke-direct {v0, v1, p1}, Lzd3;-><init>(Ljava/lang/Object;Lrv2;)V

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Le45;->h:Lzd3;

    .line 50
    .line 51
    const/high16 p1, 0x3f800000    # 1.0f

    .line 52
    .line 53
    iput p1, p0, Le45;->i:F

    .line 54
    .line 55
    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 0

    .line 1
    iput p1, p0, Le45;->i:F

    .line 2
    .line 3
    return-void
.end method

.method public final b(Ldt;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le45;->j:Ldt;

    .line 2
    .line 3
    return-void
.end method

.method public final d()J
    .locals 2

    .line 1
    iget-object p0, p0, Le45;->e:Lzd3;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzd3;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lqf4;

    .line 8
    .line 9
    iget-wide v0, p0, Lqf4;->a:J

    .line 10
    .line 11
    return-wide v0
.end method

.method public final e(Le72;)V
    .locals 10

    .line 1
    iget-object v0, p1, Le72;->n:Lmz;

    .line 2
    .line 3
    iget-object v1, p0, Le45;->j:Ldt;

    .line 4
    .line 5
    iget-object v2, p0, Le45;->g:Ln35;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v1, v2, Ln35;->g:Lzd3;

    .line 10
    .line 11
    invoke-virtual {v1}, Lzd3;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ldt;

    .line 16
    .line 17
    :cond_0
    iget-object v3, p0, Le45;->f:Lzd3;

    .line 18
    .line 19
    invoke-virtual {v3}, Lzd3;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    invoke-virtual {p1}, Le72;->getLayoutDirection()Lr62;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    sget-object v4, Lr62;->o:Lr62;

    .line 36
    .line 37
    if-ne v3, v4, :cond_1

    .line 38
    .line 39
    invoke-interface {v0}, Lsv0;->W()J

    .line 40
    .line 41
    .line 42
    move-result-wide v3

    .line 43
    iget-object v0, v0, Lmz;->o:Li61;

    .line 44
    .line 45
    invoke-virtual {v0}, Li61;->j()J

    .line 46
    .line 47
    .line 48
    move-result-wide v5

    .line 49
    invoke-virtual {v0}, Li61;->g()Ljz;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    invoke-interface {v7}, Ljz;->e()V

    .line 54
    .line 55
    .line 56
    :try_start_0
    iget-object v7, v0, Li61;->o:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v7, Lzg5;

    .line 59
    .line 60
    const/high16 v8, -0x40800000    # -1.0f

    .line 61
    .line 62
    const/high16 v9, 0x3f800000    # 1.0f

    .line 63
    .line 64
    invoke-virtual {v7, v8, v9, v3, v4}, Lzg5;->B(FFJ)V

    .line 65
    .line 66
    .line 67
    iget v3, p0, Le45;->i:F

    .line 68
    .line 69
    invoke-virtual {v2, p1, v3, v1}, Ln35;->e(Lsv0;FLdt;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0}, Li61;->g()Ljz;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-interface {p1}, Ljz;->k()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v5, v6}, Li61;->t(J)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catchall_0
    move-exception p0

    .line 84
    invoke-virtual {v0}, Li61;->g()Ljz;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-interface {p1}, Ljz;->k()V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v5, v6}, Li61;->t(J)V

    .line 92
    .line 93
    .line 94
    throw p0

    .line 95
    :cond_1
    iget v0, p0, Le45;->i:F

    .line 96
    .line 97
    invoke-virtual {v2, p1, v0, v1}, Ln35;->e(Lsv0;FLdt;)V

    .line 98
    .line 99
    .line 100
    :goto_0
    iget-object p0, p0, Le45;->h:Lzd3;

    .line 101
    .line 102
    invoke-virtual {p0}, Lzd3;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    return-void
.end method
