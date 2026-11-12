.class public final Lho;
.super Lcx2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public B:Lot4;

.field public final synthetic C:Lio;


# direct methods
.method public constructor <init>(Lio;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lho;->C:Lio;

    .line 2
    .line 3
    invoke-direct {p0}, Lcx2;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final i0()V
    .locals 9

    .line 1
    iget-object v0, p0, Lho;->C:Lio;

    .line 2
    .line 3
    iput-object p0, v0, Lio;->a:Lho;

    .line 4
    .line 5
    iget-object v1, v0, Lio;->b:Lx60;

    .line 6
    .line 7
    if-eqz v1, :cond_4

    .line 8
    .line 9
    new-instance v1, Lo;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-direct {v1, v2, p0, v0}, Lo;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Lj51;->O(Leo0;)Lc72;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iget v3, v0, Lc72;->o:I

    .line 20
    .line 21
    invoke-static {v0}, Lh12;->L(Lc72;)Lub3;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lra;

    .line 26
    .line 27
    invoke-virtual {v0}, Lra;->getRectManager()Lyv3;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object v4, v0, Lyv3;->d:Lpt4;

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object v5, v4, Lpt4;->a:Li03;

    .line 37
    .line 38
    new-instance v6, Lot4;

    .line 39
    .line 40
    invoke-direct {v6, v4, v3, p0, v1}, Lot4;-><init>(Lpt4;ILho;Lo;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v5, v3}, Le02;->b(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-nez v1, :cond_0

    .line 48
    .line 49
    invoke-virtual {v5, v3, v6}, Li03;->i(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object v1, v6

    .line 53
    :cond_0
    check-cast v1, Lot4;

    .line 54
    .line 55
    if-eq v1, v6, :cond_2

    .line 56
    .line 57
    :goto_0
    iget-object v3, v1, Lot4;->d:Lot4;

    .line 58
    .line 59
    if-eqz v3, :cond_1

    .line 60
    .line 61
    move-object v1, v3

    .line 62
    goto :goto_0

    .line 63
    :cond_1
    iput-object v6, v1, Lot4;->d:Lot4;

    .line 64
    .line 65
    :cond_2
    iget-object v1, p0, Lcx2;->n:Lcx2;

    .line 66
    .line 67
    invoke-static {v1}, Lj51;->O(Leo0;)Lc72;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-static {v1}, Lyv3;->d(Lc72;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_3

    .line 76
    .line 77
    iget-object v3, v0, Lyv3;->c:Lue1;

    .line 78
    .line 79
    invoke-virtual {v0, v1}, Lyv3;->e(Lc72;)I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    iget-object v3, v3, Lue1;->p:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v3, [J

    .line 86
    .line 87
    add-int/lit8 v1, v1, 0x2

    .line 88
    .line 89
    aget-wide v4, v3, v1

    .line 90
    .line 91
    const-wide v7, 0x6fffffffffffffffL    # 3.1050361846014175E231

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    and-long/2addr v4, v7

    .line 97
    const-wide/high16 v7, -0x7000000000000000L

    .line 98
    .line 99
    or-long/2addr v4, v7

    .line 100
    aput-wide v4, v3, v1

    .line 101
    .line 102
    :cond_3
    iput-boolean v2, v0, Lyv3;->f:Z

    .line 103
    .line 104
    invoke-virtual {v0}, Lyv3;->k()V

    .line 105
    .line 106
    .line 107
    iput-object v6, p0, Lho;->B:Lot4;

    .line 108
    .line 109
    :cond_4
    return-void
.end method

.method public final j0()V
    .locals 3

    .line 1
    iget-object v0, p0, Lho;->C:Lio;

    .line 2
    .line 3
    iget-object v1, v0, Lio;->a:Lho;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v1, p0, :cond_0

    .line 7
    .line 8
    iput-object v2, v0, Lio;->a:Lho;

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lho;->B:Lot4;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Lot4;->b()V

    .line 15
    .line 16
    .line 17
    :cond_1
    iput-object v2, p0, Lho;->B:Lot4;

    .line 18
    .line 19
    return-void
.end method
