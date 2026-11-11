.class public final Lqw4;
.super Lp80;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final k:Lgn2;

.field public final l:Ljr3;

.field public final m:J

.field public n:Lkr3;

.field public o:I


# direct methods
.method public constructor <init>(Lgn2;Lkx;Ljr3;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lp80;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lqw4;->k:Lgn2;

    .line 8
    .line 9
    iput-object p3, p0, Lqw4;->l:Ljr3;

    .line 10
    .line 11
    const-wide p2, -0x7fffffffffffffffL    # -4.9E-324

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    iput-wide p2, p0, Lqw4;->m:J

    .line 17
    .line 18
    const/4 p2, 0x1

    .line 19
    iput p2, p0, Lqw4;->o:I

    .line 20
    .line 21
    iget-object p2, p1, Lgn2;->d:Ldo2;

    .line 22
    .line 23
    iget-object p2, p2, Ldo2;->I:Landroid/os/Bundle;

    .line 24
    .line 25
    iget-object p1, p1, Lgn2;->b:Lbn2;

    .line 26
    .line 27
    const/4 p3, 0x0

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    iget-object p1, p1, Lbn2;->a:Landroid/net/Uri;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object p1, p3

    .line 34
    :goto_0
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move-object v0, p3

    .line 42
    :goto_1
    const-string v1, "content"

    .line 43
    .line 44
    invoke-static {v0, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_4

    .line 49
    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p3

    .line 56
    :cond_2
    const-string p1, "file"

    .line 57
    .line 58
    invoke-static {p3, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    if-eqz p2, :cond_4

    .line 66
    .line 67
    const-string p1, "duration"

    .line 68
    .line 69
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result p3

    .line 73
    if-eqz p3, :cond_4

    .line 74
    .line 75
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-lez p1, :cond_4

    .line 80
    .line 81
    int-to-long p1, p1

    .line 82
    const-wide/16 v0, 0x3e8

    .line 83
    .line 84
    mul-long/2addr p1, v0

    .line 85
    invoke-static {p1, p2}, Lf35;->Q(J)J

    .line 86
    .line 87
    .line 88
    move-result-wide p1

    .line 89
    iput-wide p1, p0, Lqw4;->m:J

    .line 90
    .line 91
    :cond_4
    :goto_2
    return-void
.end method


# virtual methods
.method public final b(Lmt2;Ln9;J)Lno2;
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v3, p0, Lqw4;->n:Lkr3;

    .line 5
    .line 6
    if-eqz v3, :cond_0

    .line 7
    .line 8
    invoke-virtual {v3, p1, p2, p3, p4}, Lkr3;->b(Lmt2;Ln9;J)Lno2;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    new-instance v0, Lpw4;

    .line 13
    .line 14
    move-object v1, p0

    .line 15
    move-object v4, p1

    .line 16
    move-object v5, p2

    .line 17
    invoke-direct/range {v0 .. v5}, Lpw4;-><init>(Lqw4;Lno2;Lkr3;Lmt2;Ln9;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    const-string p0, "Source not ready"

    .line 22
    .line 23
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public final h()Lgn2;
    .locals 0

    .line 1
    iget-object p0, p0, Lqw4;->k:Lgn2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final l(Lrw4;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lp80;->j:Lrw4;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-static {p1}, Lf35;->p(Lnk2;)Landroid/os/Handler;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lp80;->i:Landroid/os/Handler;

    .line 9
    .line 10
    iget-object p1, p0, Lqw4;->l:Ljr3;

    .line 11
    .line 12
    iget-object v0, p0, Lqw4;->k:Lgn2;

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljr3;->f(Lgn2;)Lkr3;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lqw4;->n:Lkr3;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p0, v0, p1}, Lp80;->x(Ljava/lang/Integer;Lbq;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final n(Lno2;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p1, Lpw4;

    .line 5
    .line 6
    iget-object p0, p1, Lpw4;->o:Lbq;

    .line 7
    .line 8
    iget-object v0, p1, Lpw4;->n:Lno2;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lbq;->n(Lno2;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p1, Lpw4;->u:Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    iget-object v0, p1, Lpw4;->y:Lqw4;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {v0, p0}, Lp80;->y(Ljava/lang/Integer;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    const/4 p0, 0x0

    .line 31
    iput-object p0, p1, Lpw4;->u:Ljava/lang/Integer;

    .line 32
    .line 33
    return-void
.end method

.method public final p()V
    .locals 1

    .line 1
    invoke-super {p0}, Lp80;->p()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lqw4;->n:Lkr3;

    .line 6
    .line 7
    return-void
.end method

.method public final t(Ljava/lang/Object;Lmt2;)Lmt2;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-object p2
.end method

.method public final w(Ljava/lang/Object;Lbq;Lcu4;)V
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    :goto_0
    return-void

    .line 16
    :cond_1
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    iget-wide v0, p0, Lqw4;->m:J

    .line 22
    .line 23
    cmp-long p1, v0, p1

    .line 24
    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    new-instance p1, Lsv2;

    .line 28
    .line 29
    const/4 p2, 0x1

    .line 30
    invoke-direct {p1, p2, v0, v1, p3}, Lsv2;-><init>(IJLcu4;)V

    .line 31
    .line 32
    .line 33
    move-object p3, p1

    .line 34
    :cond_2
    invoke-virtual {p0, p3}, Lbq;->m(Lcu4;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
