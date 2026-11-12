.class public final Ln80;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lst2;
.implements Ltw0;


# instance fields
.field public final n:Ljava/lang/Object;

.field public o:Lue1;

.field public p:Lsw0;

.field public final synthetic q:Lp80;


# direct methods
.method public constructor <init>(Lp80;Ljava/lang/Object;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln80;->q:Lp80;

    .line 5
    .line 6
    iget-object v0, p1, Lbq;->c:Lue1;

    .line 7
    .line 8
    new-instance v1, Lue1;

    .line 9
    .line 10
    iget-object v0, v0, Lue1;->q:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 13
    .line 14
    const/16 v2, 0x8

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    invoke-direct {v1, v0, v3, v4, v2}, Lue1;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Ln80;->o:Lue1;

    .line 22
    .line 23
    iget-object p1, p1, Lbq;->d:Lsw0;

    .line 24
    .line 25
    new-instance v0, Lsw0;

    .line 26
    .line 27
    iget-object p1, p1, Lsw0;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 28
    .line 29
    invoke-direct {v0, p1, v3, v4}, Lsw0;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILmt2;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Ln80;->p:Lsw0;

    .line 33
    .line 34
    iput-object p2, p0, Ln80;->n:Ljava/lang/Object;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final D(ILmt2;Ltv1;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ln80;->a(ILmt2;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Ln80;->p:Lsw0;

    .line 8
    .line 9
    invoke-virtual {p0, p3}, Lsw0;->a(Ltv1;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final M(ILmt2;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ln80;->a(ILmt2;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Ln80;->p:Lsw0;

    .line 8
    .line 9
    invoke-virtual {p0}, Lsw0;->e()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final U(ILmt2;Led2;Lun2;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ln80;->a(ILmt2;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Ln80;->o:Lue1;

    .line 8
    .line 9
    invoke-virtual {p0, p4, p2}, Ln80;->b(Lun2;Lmt2;)Lun2;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance p2, Lot2;

    .line 17
    .line 18
    invoke-direct {p2, p1, p3, p0, p5}, Lot2;-><init>(Lue1;Led2;Lun2;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2}, Lue1;->i(Lwc0;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final a(ILmt2;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Ln80;->n:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Ln80;->q:Lp80;

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1, v0, p2}, Lp80;->t(Ljava/lang/Object;Lmt2;)Lmt2;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-nez p2, :cond_1

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p2, 0x0

    .line 16
    :cond_1
    invoke-virtual {v1, p1, v0}, Lp80;->v(ILjava/lang/Object;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iget-object v0, p0, Ln80;->o:Lue1;

    .line 21
    .line 22
    iget v2, v0, Lue1;->o:I

    .line 23
    .line 24
    if-ne v2, p1, :cond_2

    .line 25
    .line 26
    iget-object v0, v0, Lue1;->p:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lmt2;

    .line 29
    .line 30
    invoke-static {v0, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_3

    .line 35
    .line 36
    :cond_2
    iget-object v0, v1, Lbq;->c:Lue1;

    .line 37
    .line 38
    new-instance v2, Lue1;

    .line 39
    .line 40
    iget-object v0, v0, Lue1;->q:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 43
    .line 44
    const/16 v3, 0x8

    .line 45
    .line 46
    invoke-direct {v2, v0, p1, p2, v3}, Lue1;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 47
    .line 48
    .line 49
    iput-object v2, p0, Ln80;->o:Lue1;

    .line 50
    .line 51
    :cond_3
    iget-object v0, p0, Ln80;->p:Lsw0;

    .line 52
    .line 53
    iget v2, v0, Lsw0;->a:I

    .line 54
    .line 55
    if-ne v2, p1, :cond_4

    .line 56
    .line 57
    iget-object v0, v0, Lsw0;->b:Lmt2;

    .line 58
    .line 59
    invoke-static {v0, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_5

    .line 64
    .line 65
    :cond_4
    iget-object v0, v1, Lbq;->d:Lsw0;

    .line 66
    .line 67
    new-instance v1, Lsw0;

    .line 68
    .line 69
    iget-object v0, v0, Lsw0;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 70
    .line 71
    invoke-direct {v1, v0, p1, p2}, Lsw0;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILmt2;)V

    .line 72
    .line 73
    .line 74
    iput-object v1, p0, Ln80;->p:Lsw0;

    .line 75
    .line 76
    :cond_5
    const/4 p0, 0x1

    .line 77
    return p0
.end method

.method public final b(Lun2;Lmt2;)Lun2;
    .locals 12

    .line 1
    iget-wide v0, p1, Lun2;->f:J

    .line 2
    .line 3
    iget-object p2, p0, Ln80;->q:Lp80;

    .line 4
    .line 5
    iget-object p0, p0, Ln80;->n:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {p2, v0, v1, p0}, Lp80;->u(JLjava/lang/Object;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    iget-wide v2, p1, Lun2;->g:J

    .line 12
    .line 13
    invoke-virtual {p2, v2, v3, p0}, Lp80;->u(JLjava/lang/Object;)J

    .line 14
    .line 15
    .line 16
    move-result-wide v10

    .line 17
    cmp-long p0, v8, v0

    .line 18
    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    cmp-long p0, v10, v2

    .line 22
    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    new-instance v2, Lun2;

    .line 27
    .line 28
    iget v3, p1, Lun2;->a:I

    .line 29
    .line 30
    iget v4, p1, Lun2;->b:I

    .line 31
    .line 32
    iget-object v5, p1, Lun2;->c:Ltb1;

    .line 33
    .line 34
    iget v6, p1, Lun2;->d:I

    .line 35
    .line 36
    iget-object v7, p1, Lun2;->e:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-direct/range {v2 .. v11}, Lun2;-><init>(IILtb1;ILjava/lang/Object;JJ)V

    .line 39
    .line 40
    .line 41
    return-object v2
.end method

.method public final c(ILmt2;Ljava/lang/Exception;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ln80;->a(ILmt2;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Ln80;->p:Lsw0;

    .line 8
    .line 9
    invoke-virtual {p0, p3}, Lsw0;->d(Ljava/lang/Exception;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final l(ILmt2;Lun2;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ln80;->a(ILmt2;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Ln80;->o:Lue1;

    .line 8
    .line 9
    invoke-virtual {p0, p3, p2}, Ln80;->b(Lun2;Lmt2;)Lun2;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance p2, Lbt2;

    .line 17
    .line 18
    invoke-direct {p2, p1, p0}, Lbt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2}, Lue1;->i(Lwc0;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final m(ILmt2;Lun2;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, Ln80;->a(ILmt2;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Ln80;->o:Lue1;

    .line 8
    .line 9
    invoke-virtual {p0, p3, p2}, Ln80;->b(Lun2;Lmt2;)Lun2;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object p2, p1, Lue1;->p:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p2, Lmt2;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance p3, Leg0;

    .line 21
    .line 22
    const/16 v0, 0xa

    .line 23
    .line 24
    invoke-direct {p3, p1, p2, p0, v0}, Leg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p3}, Lue1;->i(Lwc0;)V

    .line 28
    .line 29
    .line 30
    :cond_0
    return-void
.end method

.method public final p(ILmt2;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ln80;->a(ILmt2;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Ln80;->p:Lsw0;

    .line 8
    .line 9
    invoke-virtual {p0, p3}, Lsw0;->c(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final u(ILmt2;Led2;Lun2;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ln80;->a(ILmt2;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Ln80;->o:Lue1;

    .line 8
    .line 9
    invoke-virtual {p0, p4, p2}, Ln80;->b(Lun2;Lmt2;)Lun2;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance p2, Lpt2;

    .line 17
    .line 18
    const/4 p4, 0x1

    .line 19
    invoke-direct {p2, p1, p3, p0, p4}, Lpt2;-><init>(Lue1;Led2;Lun2;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lue1;->i(Lwc0;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final w(ILmt2;Led2;Lun2;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ln80;->a(ILmt2;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Ln80;->o:Lue1;

    .line 8
    .line 9
    invoke-virtual {p0, p4, p2}, Ln80;->b(Lun2;Lmt2;)Lun2;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance p2, Lpt2;

    .line 17
    .line 18
    const/4 p4, 0x0

    .line 19
    invoke-direct {p2, p1, p3, p0, p4}, Lpt2;-><init>(Lue1;Led2;Lun2;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p2}, Lue1;->i(Lwc0;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method public final y(ILmt2;Led2;Lun2;Ljava/io/IOException;Z)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1, p2}, Ln80;->a(ILmt2;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Ln80;->o:Lue1;

    .line 8
    .line 9
    invoke-virtual {p0, p4, p2}, Ln80;->b(Lun2;Lmt2;)Lun2;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v0, Lqt2;

    .line 17
    .line 18
    move-object v2, p3

    .line 19
    move-object v4, p5

    .line 20
    move v5, p6

    .line 21
    invoke-direct/range {v0 .. v5}, Lqt2;-><init>(Lue1;Led2;Lun2;Ljava/io/IOException;Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lue1;->i(Lwc0;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public final z(ILmt2;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ln80;->a(ILmt2;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Ln80;->p:Lsw0;

    .line 8
    .line 9
    invoke-virtual {p0}, Lsw0;->b()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
