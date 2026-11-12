.class public final Lf72;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Lc72;

.field public b:Z

.field public c:Z

.field public d:Ly62;

.field public e:Z

.field public f:Z

.field public g:Z

.field public h:I

.field public i:I

.field public j:Z

.field public k:Z

.field public l:I

.field public m:Z

.field public n:Z

.field public o:I

.field public final p:Lti2;

.field public q:Lif2;


# direct methods
.method public constructor <init>(Lc72;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf72;->a:Lc72;

    .line 5
    .line 6
    sget-object p1, Ly62;->r:Ly62;

    .line 7
    .line 8
    iput-object p1, p0, Lf72;->d:Ly62;

    .line 9
    .line 10
    new-instance p1, Lti2;

    .line 11
    .line 12
    invoke-direct {p1, p0}, Lti2;-><init>(Lf72;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lf72;->p:Lti2;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()Lf63;
    .locals 0

    .line 1
    iget-object p0, p0, Lf72;->a:Lc72;

    .line 2
    .line 3
    iget-object p0, p0, Lc72;->Q:Lw12;

    .line 4
    .line 5
    iget-object p0, p0, Lw12;->e:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lf63;

    .line 8
    .line 9
    return-object p0
.end method

.method public final b()V
    .locals 4

    .line 1
    iget-object v0, p0, Lf72;->a:Lc72;

    .line 2
    .line 3
    iget-object v0, v0, Lc72;->R:Lf72;

    .line 4
    .line 5
    iget-object v0, v0, Lf72;->d:Ly62;

    .line 6
    .line 7
    sget-object v1, Ly62;->p:Ly62;

    .line 8
    .line 9
    sget-object v2, Ly62;->q:Ly62;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    if-ne v0, v2, :cond_2

    .line 15
    .line 16
    :cond_0
    iget-object v1, p0, Lf72;->p:Lti2;

    .line 17
    .line 18
    iget-boolean v1, v1, Lti2;->K:Z

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, v3}, Lf72;->g(Z)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p0, v3}, Lf72;->f(Z)V

    .line 27
    .line 28
    .line 29
    :cond_2
    :goto_0
    if-ne v0, v2, :cond_4

    .line 30
    .line 31
    iget-object v0, p0, Lf72;->q:Lif2;

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    iget-boolean v0, v0, Lif2;->G:Z

    .line 36
    .line 37
    if-ne v0, v3, :cond_3

    .line 38
    .line 39
    invoke-virtual {p0, v3}, Lf72;->i(Z)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_3
    invoke-virtual {p0, v3}, Lf72;->h(Z)V

    .line 44
    .line 45
    .line 46
    :cond_4
    return-void
.end method

.method public final c(J)V
    .locals 3

    .line 1
    iget-object p0, p0, Lf72;->q:Lif2;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lif2;->s:Lf72;

    .line 6
    .line 7
    sget-object v1, Ly62;->o:Ly62;

    .line 8
    .line 9
    iput-object v1, v0, Lf72;->d:Ly62;

    .line 10
    .line 11
    iget-object v1, v0, Lf72;->a:Lc72;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    iput-boolean v2, v0, Lf72;->e:Z

    .line 15
    .line 16
    iput-wide p1, p0, Lif2;->I:J

    .line 17
    .line 18
    invoke-static {v1}, Lh12;->L(Lc72;)Lub3;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lra;

    .line 23
    .line 24
    invoke-virtual {p1}, Lra;->getSnapshotObserver()Lwb3;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iget-object p0, p0, Lif2;->J:Lgf2;

    .line 29
    .line 30
    iget-object p2, p1, Lwb3;->b:Lk52;

    .line 31
    .line 32
    iget-object p1, p1, Lwb3;->a:Lpp3;

    .line 33
    .line 34
    invoke-virtual {p1, v1, p2, p0}, Lpp3;->e(Ljava/lang/Object;Lif1;Lgf1;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    iput-boolean p0, v0, Lf72;->f:Z

    .line 39
    .line 40
    iput-boolean p0, v0, Lf72;->g:Z

    .line 41
    .line 42
    invoke-static {v1}, Lh12;->A(Lc72;)Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    iget-object p2, v0, Lf72;->p:Lti2;

    .line 47
    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    iput-boolean p0, p2, Lti2;->F:Z

    .line 51
    .line 52
    iput-boolean p0, p2, Lti2;->G:Z

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iput-boolean p0, p2, Lti2;->E:Z

    .line 56
    .line 57
    :goto_0
    sget-object p0, Ly62;->r:Ly62;

    .line 58
    .line 59
    iput-object p0, v0, Lf72;->d:Ly62;

    .line 60
    .line 61
    :cond_1
    return-void
.end method

.method public final d(I)V
    .locals 3

    .line 1
    iget v0, p0, Lf72;->l:I

    .line 2
    .line 3
    iput p1, p0, Lf72;->l:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    move v0, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    if-nez p1, :cond_1

    .line 13
    .line 14
    move v1, v2

    .line 15
    :cond_1
    if-eq v0, v1, :cond_4

    .line 16
    .line 17
    iget-object p0, p0, Lf72;->a:Lc72;

    .line 18
    .line 19
    invoke-virtual {p0}, Lc72;->t()Lc72;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    iget-object p0, p0, Lc72;->R:Lf72;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    const/4 p0, 0x0

    .line 29
    :goto_1
    if-eqz p0, :cond_4

    .line 30
    .line 31
    iget v0, p0, Lf72;->l:I

    .line 32
    .line 33
    if-nez p1, :cond_3

    .line 34
    .line 35
    add-int/lit8 v0, v0, -0x1

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lf72;->d(I)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_3
    add-int/2addr v0, v2

    .line 42
    invoke-virtual {p0, v0}, Lf72;->d(I)V

    .line 43
    .line 44
    .line 45
    :cond_4
    return-void
.end method

.method public final e(I)V
    .locals 3

    .line 1
    iget v0, p0, Lf72;->o:I

    .line 2
    .line 3
    iput p1, p0, Lf72;->o:I

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    move v0, v2

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v0, v1

    .line 12
    :goto_0
    if-nez p1, :cond_1

    .line 13
    .line 14
    move v1, v2

    .line 15
    :cond_1
    if-eq v0, v1, :cond_4

    .line 16
    .line 17
    iget-object p0, p0, Lf72;->a:Lc72;

    .line 18
    .line 19
    invoke-virtual {p0}, Lc72;->t()Lc72;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_2

    .line 24
    .line 25
    iget-object p0, p0, Lc72;->R:Lf72;

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    const/4 p0, 0x0

    .line 29
    :goto_1
    if-eqz p0, :cond_4

    .line 30
    .line 31
    iget v0, p0, Lf72;->o:I

    .line 32
    .line 33
    if-nez p1, :cond_3

    .line 34
    .line 35
    add-int/lit8 v0, v0, -0x1

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Lf72;->e(I)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_3
    add-int/2addr v0, v2

    .line 42
    invoke-virtual {p0, v0}, Lf72;->e(I)V

    .line 43
    .line 44
    .line 45
    :cond_4
    return-void
.end method

.method public final f(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf72;->k:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-boolean p1, p0, Lf72;->k:Z

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Lf72;->j:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget p1, p0, Lf72;->l:I

    .line 14
    .line 15
    add-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lf72;->d(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    if-nez p1, :cond_1

    .line 22
    .line 23
    iget-boolean p1, p0, Lf72;->j:Z

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    iget p1, p0, Lf72;->l:I

    .line 28
    .line 29
    add-int/lit8 p1, p1, -0x1

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lf72;->d(I)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final g(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf72;->j:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-boolean p1, p0, Lf72;->j:Z

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Lf72;->k:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget p1, p0, Lf72;->l:I

    .line 14
    .line 15
    add-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lf72;->d(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    if-nez p1, :cond_1

    .line 22
    .line 23
    iget-boolean p1, p0, Lf72;->k:Z

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    iget p1, p0, Lf72;->l:I

    .line 28
    .line 29
    add-int/lit8 p1, p1, -0x1

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lf72;->d(I)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final h(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf72;->n:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-boolean p1, p0, Lf72;->n:Z

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Lf72;->m:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget p1, p0, Lf72;->o:I

    .line 14
    .line 15
    add-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lf72;->e(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    if-nez p1, :cond_1

    .line 22
    .line 23
    iget-boolean p1, p0, Lf72;->m:Z

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    iget p1, p0, Lf72;->o:I

    .line 28
    .line 29
    add-int/lit8 p1, p1, -0x1

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lf72;->e(I)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final i(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf72;->m:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput-boolean p1, p0, Lf72;->m:Z

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Lf72;->n:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget p1, p0, Lf72;->o:I

    .line 14
    .line 15
    add-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lf72;->e(I)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    if-nez p1, :cond_1

    .line 22
    .line 23
    iget-boolean p1, p0, Lf72;->n:Z

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    iget p1, p0, Lf72;->o:I

    .line 28
    .line 29
    add-int/lit8 p1, p1, -0x1

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lf72;->e(I)V

    .line 32
    .line 33
    .line 34
    :cond_1
    return-void
.end method

.method public final j()V
    .locals 1

    .line 1
    iget-object v0, p0, Lf72;->p:Lti2;

    .line 2
    .line 3
    iget-object v0, v0, Lti2;->s:Lf72;

    .line 4
    .line 5
    invoke-virtual {v0}, Lf72;->a()Lf63;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Lf63;->t()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lf72;->q:Lif2;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lif2;->s:Lf72;

    .line 17
    .line 18
    invoke-virtual {p0}, Lf72;->a()Lf63;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Lf63;->y0()Lef2;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lef2;->t()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method
