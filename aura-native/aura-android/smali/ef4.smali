.class public final Lef4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lq44;


# instance fields
.field public n:I

.field public o:Z

.field public final synthetic p:Lgf4;


# direct methods
.method public constructor <init>(Lgf4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lef4;->p:Lgf4;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 13

    .line 1
    iget-boolean v0, p0, Lef4;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lef4;->p:Lgf4;

    .line 6
    .line 7
    iget-object v1, v0, Lgf4;->r:Lue1;

    .line 8
    .line 9
    iget-object v2, v0, Lgf4;->w:Ltb1;

    .line 10
    .line 11
    iget-object v2, v2, Ltb1;->n:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v2}, Llw2;->h(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    iget-object v6, v0, Lgf4;->w:Ltb1;

    .line 18
    .line 19
    new-instance v3, Lun2;

    .line 20
    .line 21
    const-wide/16 v7, 0x0

    .line 22
    .line 23
    invoke-static {v7, v8}, Lf35;->i0(J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v9

    .line 27
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    const/4 v4, 0x1

    .line 33
    const/4 v7, 0x0

    .line 34
    const/4 v8, 0x0

    .line 35
    invoke-direct/range {v3 .. v12}, Lun2;-><init>(IILtb1;ILjava/lang/Object;JJ)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Lbt2;

    .line 39
    .line 40
    invoke-direct {v0, v1, v3}, Lbt2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, v0}, Lue1;->i(Lwc0;)V

    .line 44
    .line 45
    .line 46
    const/4 v0, 0x1

    .line 47
    iput-boolean v0, p0, Lef4;->o:Z

    .line 48
    .line 49
    :cond_0
    return-void
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lef4;->p:Lgf4;

    .line 2
    .line 3
    iget-boolean p0, p0, Lgf4;->y:Z

    .line 4
    .line 5
    return p0
.end method

.method public final s()V
    .locals 2

    .line 1
    iget-object p0, p0, Lef4;->p:Lgf4;

    .line 2
    .line 3
    iget-boolean v0, p0, Lgf4;->x:Z

    .line 4
    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget-object p0, p0, Lgf4;->v:Li61;

    .line 8
    .line 9
    iget-object v0, p0, Li61;->q:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Ljava/io/IOException;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    iget-object p0, p0, Li61;->p:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lid2;

    .line 18
    .line 19
    if-eqz p0, :cond_2

    .line 20
    .line 21
    iget v0, p0, Lid2;->n:I

    .line 22
    .line 23
    iget-object v1, p0, Lid2;->r:Ljava/io/IOException;

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    iget p0, p0, Lid2;->s:I

    .line 28
    .line 29
    if-gt p0, v0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    throw v1

    .line 33
    :cond_1
    throw v0

    .line 34
    :cond_2
    :goto_0
    return-void
.end method

.method public final t(Lgp3;Lcj0;I)I
    .locals 9

    .line 1
    invoke-virtual {p0}, Lef4;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lef4;->p:Lgf4;

    .line 5
    .line 6
    iget-boolean v1, v0, Lgf4;->y:Z

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v3, v0, Lgf4;->z:[B

    .line 12
    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    iput v2, p0, Lef4;->n:I

    .line 16
    .line 17
    :cond_0
    iget v3, p0, Lef4;->n:I

    .line 18
    .line 19
    const/4 v4, -0x4

    .line 20
    if-ne v3, v2, :cond_1

    .line 21
    .line 22
    const/4 p0, 0x4

    .line 23
    invoke-virtual {p2, p0}, Luv;->a(I)V

    .line 24
    .line 25
    .line 26
    return v4

    .line 27
    :cond_1
    and-int/lit8 v5, p3, 0x2

    .line 28
    .line 29
    const/4 v6, 0x1

    .line 30
    if-nez v5, :cond_6

    .line 31
    .line 32
    if-nez v3, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    if-nez v1, :cond_3

    .line 36
    .line 37
    const/4 p0, -0x3

    .line 38
    return p0

    .line 39
    :cond_3
    iget-object p1, v0, Lgf4;->z:[B

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, v6}, Luv;->a(I)V

    .line 45
    .line 46
    .line 47
    const-wide/16 v7, 0x0

    .line 48
    .line 49
    iput-wide v7, p2, Lcj0;->t:J

    .line 50
    .line 51
    and-int/lit8 p1, p3, 0x4

    .line 52
    .line 53
    if-nez p1, :cond_4

    .line 54
    .line 55
    iget p1, v0, Lgf4;->A:I

    .line 56
    .line 57
    invoke-virtual {p2, p1}, Lcj0;->t(I)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p2, Lcj0;->r:Ljava/nio/ByteBuffer;

    .line 61
    .line 62
    iget-object p2, v0, Lgf4;->z:[B

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    iget v0, v0, Lgf4;->A:I

    .line 66
    .line 67
    invoke-virtual {p1, p2, v1, v0}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 68
    .line 69
    .line 70
    :cond_4
    and-int/lit8 p1, p3, 0x1

    .line 71
    .line 72
    if-nez p1, :cond_5

    .line 73
    .line 74
    iput v2, p0, Lef4;->n:I

    .line 75
    .line 76
    :cond_5
    return v4

    .line 77
    :cond_6
    :goto_0
    iget-object p2, v0, Lgf4;->w:Ltb1;

    .line 78
    .line 79
    iput-object p2, p1, Lgp3;->p:Ljava/lang/Object;

    .line 80
    .line 81
    iput v6, p0, Lef4;->n:I

    .line 82
    .line 83
    const/4 p0, -0x5

    .line 84
    return p0
.end method

.method public final u(J)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lef4;->a()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long p1, p1, v0

    .line 7
    .line 8
    if-lez p1, :cond_0

    .line 9
    .line 10
    iget p1, p0, Lef4;->n:I

    .line 11
    .line 12
    const/4 p2, 0x2

    .line 13
    if-eq p1, p2, :cond_0

    .line 14
    .line 15
    iput p2, p0, Lef4;->n:I

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method
