.class public final synthetic Llj0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lqc2;
.implements Lxl2;
.implements Lgt2;
.implements Lit2;
.implements Lwc0;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:J

.field public final synthetic p:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/Object;I)V
    .locals 0

    .line 1
    iput-object p3, p0, Llj0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    iput p4, p0, Llj0;->n:I

    .line 4
    .line 5
    iput-wide p1, p0, Llj0;->o:J

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Lao4;JI)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llj0;->p:Ljava/lang/Object;

    iput-wide p2, p0, Llj0;->o:J

    iput p4, p0, Llj0;->n:I

    return-void
.end method

.method public synthetic constructor <init>(Lq9;IJJ)V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llj0;->p:Ljava/lang/Object;

    iput p2, p0, Llj0;->n:I

    iput-wide p3, p0, Llj0;->o:J

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Llj0;->p:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lao4;

    .line 6
    .line 7
    move-object/from16 v2, p1

    .line 8
    .line 9
    check-cast v2, Llg0;

    .line 10
    .line 11
    iget-object v3, v1, Lao4;->h:Ltb1;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v3, v2, Llg0;->a:Lyw1;

    .line 17
    .line 18
    iget-wide v4, v2, Llg0;->c:J

    .line 19
    .line 20
    invoke-static {v3, v4, v5}, Li80;->y(Lyw1;J)[B

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-object v4, v1, Lao4;->c:Lbe3;

    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    array-length v5, v3

    .line 30
    invoke-virtual {v4, v5, v3}, Lbe3;->L(I[B)V

    .line 31
    .line 32
    .line 33
    iget-object v5, v1, Lao4;->a:Lwv4;

    .line 34
    .line 35
    array-length v6, v3

    .line 36
    invoke-interface {v5, v6, v4}, Lwv4;->e(ILbe3;)V

    .line 37
    .line 38
    .line 39
    iget-wide v4, v2, Llg0;->b:J

    .line 40
    .line 41
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    cmp-long v2, v4, v6

    .line 47
    .line 48
    iget-object v6, v1, Lao4;->h:Ltb1;

    .line 49
    .line 50
    iget-wide v7, v0, Llj0;->o:J

    .line 51
    .line 52
    const/4 v9, 0x1

    .line 53
    const-wide v10, 0x7fffffffffffffffL

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    if-nez v2, :cond_1

    .line 59
    .line 60
    iget-wide v4, v6, Ltb1;->s:J

    .line 61
    .line 62
    cmp-long v2, v4, v10

    .line 63
    .line 64
    if-nez v2, :cond_0

    .line 65
    .line 66
    move v2, v9

    .line 67
    goto :goto_0

    .line 68
    :cond_0
    const/4 v2, 0x0

    .line 69
    :goto_0
    invoke-static {v2}, Lrr2;->w(Z)V

    .line 70
    .line 71
    .line 72
    :goto_1
    move-wide v11, v7

    .line 73
    goto :goto_2

    .line 74
    :cond_1
    iget-wide v12, v6, Ltb1;->s:J

    .line 75
    .line 76
    cmp-long v2, v12, v10

    .line 77
    .line 78
    if-nez v2, :cond_2

    .line 79
    .line 80
    add-long/2addr v7, v4

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    add-long v7, v4, v12

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :goto_2
    iget-object v10, v1, Lao4;->a:Lwv4;

    .line 86
    .line 87
    iget v0, v0, Llj0;->n:I

    .line 88
    .line 89
    or-int/lit8 v13, v0, 0x1

    .line 90
    .line 91
    array-length v14, v3

    .line 92
    const/4 v15, 0x0

    .line 93
    const/16 v16, 0x0

    .line 94
    .line 95
    invoke-interface/range {v10 .. v16}, Lwv4;->a(JIIILvv4;)V

    .line 96
    .line 97
    .line 98
    return-void
.end method

.method public d(Lpu1;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Llj0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lbm2;

    .line 4
    .line 5
    iget-wide v5, p0, Llj0;->o:J

    .line 6
    .line 7
    iget-object v2, v0, Lbm2;->c:Lmm2;

    .line 8
    .line 9
    iget v4, p0, Llj0;->n:I

    .line 10
    .line 11
    move-object v1, p1

    .line 12
    move v3, p2

    .line 13
    invoke-interface/range {v1 .. v6}, Lpu1;->S(Lju1;IIJ)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public e(Lal3;Lfr2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Llj0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lkt2;

    .line 4
    .line 5
    iget-wide v1, p0, Llj0;->o:J

    .line 6
    .line 7
    iget p0, p0, Llj0;->n:I

    .line 8
    .line 9
    invoke-virtual {v0, p2, p1, p0}, Lkt2;->L0(Lfr2;Lal3;I)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-virtual {p1, p0, v1, v2}, Lal3;->n(IJ)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public h(Ltn2;Lfr2;I)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object p3, p0, Llj0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v2, p3

    .line 4
    check-cast v2, Ljava/util/List;

    .line 5
    .line 6
    iget p3, p0, Llj0;->n:I

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    if-ne p3, v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p1, Ltn2;->s:Lal3;

    .line 12
    .line 13
    invoke-virtual {v1}, Lal3;->o0()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    move v3, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v3, p3

    .line 20
    :goto_0
    if-ne p3, v0, :cond_1

    .line 21
    .line 22
    iget-object p0, p1, Ltn2;->s:Lal3;

    .line 23
    .line 24
    invoke-virtual {p0}, Lal3;->M0()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    :goto_1
    move-wide v4, v0

    .line 29
    move-object v0, p1

    .line 30
    move-object v1, p2

    .line 31
    goto :goto_2

    .line 32
    :cond_1
    iget-wide v0, p0, Llj0;->o:J

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :goto_2
    invoke-virtual/range {v0 .. v5}, Ltn2;->x(Lfr2;Ljava/util/List;IJ)Llb4;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 10

    .line 1
    iget-object v0, p0, Llj0;->p:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq9;

    .line 4
    .line 5
    check-cast p1, Lho2;

    .line 6
    .line 7
    iget-object v1, p1, Lho2;->h:Ljava/util/HashMap;

    .line 8
    .line 9
    iget-object v2, p1, Lho2;->i:Ljava/util/HashMap;

    .line 10
    .line 11
    iget-object v3, v0, Lq9;->d:Lmt2;

    .line 12
    .line 13
    if-eqz v3, :cond_2

    .line 14
    .line 15
    iget-object p1, p1, Lho2;->c:Lnm0;

    .line 16
    .line 17
    iget-object v0, v0, Lq9;->b:Lcu4;

    .line 18
    .line 19
    invoke-virtual {p1, v0, v3}, Lnm0;->c(Lcu4;Lmt2;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Ljava/lang/Long;

    .line 28
    .line 29
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Ljava/lang/Long;

    .line 34
    .line 35
    const-wide/16 v4, 0x0

    .line 36
    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    move-wide v6, v4

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 42
    .line 43
    .line 44
    move-result-wide v6

    .line 45
    :goto_0
    iget-wide v8, p0, Llj0;->o:J

    .line 46
    .line 47
    add-long/2addr v6, v8

    .line 48
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    if-nez v3, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 59
    .line 60
    .line 61
    move-result-wide v4

    .line 62
    :goto_1
    iget p0, p0, Llj0;->n:I

    .line 63
    .line 64
    int-to-long v2, p0

    .line 65
    add-long/2addr v4, v2

    .line 66
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-virtual {v1, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    :cond_2
    return-void
.end method
