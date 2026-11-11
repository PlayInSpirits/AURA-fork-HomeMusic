.class public final Ltv2;
.super Lbe5;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final l:J


# direct methods
.method public constructor <init>(Lkr3;)V
    .locals 4

    .line 1
    invoke-direct {p0, p1}, Lbe5;-><init>(Lbq;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lkr3;->h()Lgn2;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object p1, p1, Lgn2;->d:Ldo2;

    .line 9
    .line 10
    iget-object p1, p1, Ldo2;->I:Landroid/os/Bundle;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const-string v1, "duration"

    .line 16
    .line 17
    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    :cond_0
    if-lez v0, :cond_1

    .line 22
    .line 23
    int-to-long v0, v0

    .line 24
    const-wide/16 v2, 0x3e8

    .line 25
    .line 26
    mul-long/2addr v0, v2

    .line 27
    invoke-static {v0, v1}, Lf35;->Q(J)J

    .line 28
    .line 29
    .line 30
    move-result-wide v0

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    :goto_0
    iput-wide v0, p0, Ltv2;->l:J

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final A(Lcu4;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcu4;->o()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lbq;->m(Lcu4;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v0, Lbu4;

    .line 15
    .line 16
    invoke-direct {v0}, Lbu4;-><init>()V

    .line 17
    .line 18
    .line 19
    const-wide/16 v1, 0x0

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-virtual {p1, v3, v0, v1, v2}, Lcu4;->m(ILbu4;J)Lbu4;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-wide v1, v0, Lbu4;->l:J

    .line 30
    .line 31
    iget-boolean v0, v0, Lbu4;->j:Z

    .line 32
    .line 33
    iget-wide v4, p0, Ltv2;->l:J

    .line 34
    .line 35
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    cmp-long v8, v4, v6

    .line 41
    .line 42
    if-eqz v8, :cond_1

    .line 43
    .line 44
    cmp-long v1, v1, v6

    .line 45
    .line 46
    if-nez v1, :cond_1

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    new-instance v0, Lsv2;

    .line 51
    .line 52
    invoke-direct {v0, v3, v4, v5, p1}, Lsv2;-><init>(IJLcu4;)V

    .line 53
    .line 54
    .line 55
    move-object p1, v0

    .line 56
    :cond_1
    invoke-virtual {p0, p1}, Lbq;->m(Lcu4;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method
