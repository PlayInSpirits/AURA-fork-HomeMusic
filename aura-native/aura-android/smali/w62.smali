.class public final Lw62;
.super Lf63;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final p0:Lgc;


# instance fields
.field public n0:Lu62;

.field public o0:Lv62;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, Lfh0;->b()Lgc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-wide v1, Lx40;->e:J

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lgc;->f(J)V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Lgc;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/graphics/Paint;

    .line 13
    .line 14
    const/high16 v2, 0x3f800000    # 1.0f

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-virtual {v0, v1}, Lgc;->h(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lw62;->p0:Lgc;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Lc72;Lu62;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lf63;-><init>(Lc72;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lw62;->n0:Lu62;

    .line 5
    .line 6
    iget-object p1, p1, Lc72;->u:Lc72;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Lv62;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Lv62;-><init>(Lw62;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p1, v0

    .line 18
    :goto_0
    iput-object p1, p0, Lw62;->o0:Lv62;

    .line 19
    .line 20
    check-cast p2, Lcx2;

    .line 21
    .line 22
    iget-object p0, p2, Lcx2;->n:Lcx2;

    .line 23
    .line 24
    iget p0, p0, Lcx2;->p:I

    .line 25
    .line 26
    and-int/lit16 p0, p0, 0x200

    .line 27
    .line 28
    if-nez p0, :cond_1

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-static {}, Lkf2;->k()V

    .line 32
    .line 33
    .line 34
    throw v0
.end method


# virtual methods
.method public final A0()Lcx2;
    .locals 0

    .line 1
    iget-object p0, p0, Lw62;->n0:Lu62;

    .line 2
    .line 3
    check-cast p0, Lcx2;

    .line 4
    .line 5
    iget-object p0, p0, Lcx2;->n:Lcx2;

    .line 6
    .line 7
    return-object p0
.end method

.method public final N(JFLif1;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3, p4}, Lf63;->S0(JFLif1;)V

    .line 2
    .line 3
    .line 4
    iget-boolean p1, p0, Lcf2;->A:Z

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {p0}, Lf63;->N0()V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Lf63;->I:Lf63;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-boolean p2, p1, Lcf2;->B:Z

    .line 18
    .line 19
    iget-boolean p3, p0, Lcf2;->B:Z

    .line 20
    .line 21
    iput-boolean p3, p1, Lcf2;->B:Z

    .line 22
    .line 23
    invoke-virtual {p0}, Lf63;->h0()Lvi2;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0}, Lvi2;->c()V

    .line 28
    .line 29
    .line 30
    iput-boolean p2, p1, Lcf2;->B:Z

    .line 31
    .line 32
    :goto_0
    return-void
.end method

.method public final R0(Ljz;Lsj1;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lf63;->I:Lf63;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, Lf63;->t0(Ljz;Lsj1;)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lf63;->H:Lc72;

    .line 10
    .line 11
    invoke-static {p2}, Lh12;->L(Lc72;)Lub3;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    check-cast p2, Lra;

    .line 16
    .line 17
    invoke-virtual {p2}, Lra;->getShowLayoutBounds()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_1

    .line 22
    .line 23
    iget-object p2, p0, Lf63;->I:Lf63;

    .line 24
    .line 25
    if-eqz p2, :cond_1

    .line 26
    .line 27
    iget-wide v0, p0, Ljg3;->p:J

    .line 28
    .line 29
    iget-wide v2, p2, Ljg3;->p:J

    .line 30
    .line 31
    invoke-static {v0, v1, v2, v3}, Ln02;->a(JJ)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    iget-wide v0, p2, Lf63;->S:J

    .line 38
    .line 39
    const-wide/16 v2, 0x0

    .line 40
    .line 41
    invoke-static {v0, v1, v2, v3}, Lg02;->a(JJ)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-nez p2, :cond_1

    .line 46
    .line 47
    :cond_0
    iget-wide v0, p0, Ljg3;->p:J

    .line 48
    .line 49
    const/16 p0, 0x20

    .line 50
    .line 51
    shr-long v2, v0, p0

    .line 52
    .line 53
    long-to-int p0, v2

    .line 54
    int-to-float p0, p0

    .line 55
    const/high16 p2, 0x3f000000    # 0.5f

    .line 56
    .line 57
    sub-float v5, p0, p2

    .line 58
    .line 59
    const-wide v2, 0xffffffffL

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    and-long/2addr v0, v2

    .line 65
    long-to-int p0, v0

    .line 66
    int-to-float p0, p0

    .line 67
    sub-float v6, p0, p2

    .line 68
    .line 69
    const/high16 v3, 0x3f000000    # 0.5f

    .line 70
    .line 71
    const/high16 v4, 0x3f000000    # 0.5f

    .line 72
    .line 73
    sget-object v7, Lw62;->p0:Lgc;

    .line 74
    .line 75
    move-object v2, p1

    .line 76
    invoke-interface/range {v2 .. v7}, Ljz;->g(FFFFLgc;)V

    .line 77
    .line 78
    .line 79
    :cond_1
    return-void
.end method

.method public final X(Lpp1;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lw62;->o0:Lv62;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object p0, v0, Lef2;->M:Lp03;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lp03;->d(Ljava/lang/Object;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-ltz p1, :cond_0

    .line 12
    .line 13
    iget-object p0, p0, Lp03;->c:[I

    .line 14
    .line 15
    aget p0, p0, p1

    .line 16
    .line 17
    return p0

    .line 18
    :cond_0
    const/high16 p0, -0x80000000

    .line 19
    .line 20
    return p0

    .line 21
    :cond_1
    invoke-static {p0, p1}, Lzz1;->a(Lcf2;Lpp1;)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0
.end method

.method public final b1(Lu62;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw62;->n0:Lu62;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    move-object v0, p1

    .line 10
    check-cast v0, Lcx2;

    .line 11
    .line 12
    iget-object v0, v0, Lcx2;->n:Lcx2;

    .line 13
    .line 14
    iget v0, v0, Lcx2;->p:I

    .line 15
    .line 16
    and-int/lit16 v0, v0, 0x200

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {}, Lkf2;->k()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    :goto_0
    iput-object p1, p0, Lw62;->n0:Lu62;

    .line 26
    .line 27
    return-void
.end method

.method public final r(J)Ljg3;
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Ljg3;->R(J)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lw62;->n0:Lu62;

    .line 5
    .line 6
    iget-object v1, p0, Lf63;->I:Lf63;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p0, v1, p1, p2}, Lu62;->r(Lcf2;Lpi2;J)Lvi2;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Lf63;->V0(Lvi2;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lf63;->M0()V

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public final v0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lw62;->o0:Lv62;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lv62;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lv62;-><init>(Lw62;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lw62;->o0:Lv62;

    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final y0()Lef2;
    .locals 0

    .line 1
    iget-object p0, p0, Lw62;->o0:Lv62;

    .line 2
    .line 3
    return-object p0
.end method
