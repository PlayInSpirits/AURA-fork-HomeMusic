.class public Ldefpackage/kx4;
.super Ldefpackage/dx4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public K:Ljava/util/ArrayList;

.field public L:Z

.field public M:I

.field public N:Z

.field public O:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldefpackage/dx4;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Ldefpackage/kx4;->L:Z

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, p0, Ldefpackage/kx4;->N:Z

    .line 16
    .line 17
    iput v0, p0, Ldefpackage/kx4;->O:I

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final A(Ldefpackage/xi4;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Ldefpackage/dx4;->A(Ldefpackage/xi4;)V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Ldefpackage/kx4;->O:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x4

    .line 7
    .line 8
    iput v0, p0, Ldefpackage/kx4;->O:I

    .line 9
    .line 10
    iget-object v0, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    :goto_0
    iget-object v1, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-ge v0, v1, :cond_0

    .line 22
    .line 23
    iget-object v1, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ldefpackage/dx4;

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ldefpackage/dx4;->A(Ldefpackage/xi4;)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 v0, v0, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void
.end method

.method public final B(Ldefpackage/cx;)V
    .locals 3

    .line 1
    iput-object p1, p0, Ldefpackage/dx4;->F:Ldefpackage/cx;

    .line 2
    .line 3
    iget v0, p0, Ldefpackage/kx4;->O:I

    .line 4
    .line 5
    or-int/lit8 v0, v0, 0x2

    .line 6
    .line 7
    iput v0, p0, Ldefpackage/kx4;->O:I

    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, v0, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ldefpackage/dx4;

    .line 25
    .line 26
    invoke-virtual {v2, p1}, Ldefpackage/dx4;->B(Ldefpackage/cx;)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
.end method

.method public final C(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Ldefpackage/dx4;->o:J

    .line 2
    .line 3
    return-void
.end method

.method public final E(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-super {p0, p1}, Ldefpackage/dx4;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    iget-object v2, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-ge v1, v2, :cond_0

    .line 13
    .line 14
    const-string v2, "\n"

    .line 15
    .line 16
    invoke-static {v0, v2}, Ldefpackage/b11;->s(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v2, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ldefpackage/dx4;

    .line 27
    .line 28
    const-string v3, "  "

    .line 29
    .line 30
    invoke-virtual {p1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v2, v3}, Ldefpackage/dx4;->E(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    add-int/lit8 v1, v1, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    return-object v0
.end method

.method public final F(Ldefpackage/dx4;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iput-object p0, p1, Ldefpackage/dx4;->v:Ldefpackage/kx4;

    .line 7
    .line 8
    iget-wide v0, p0, Ldefpackage/dx4;->p:J

    .line 9
    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v2, v0, v2

    .line 13
    .line 14
    if-ltz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1, v0, v1}, Ldefpackage/dx4;->x(J)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget v0, p0, Ldefpackage/kx4;->O:I

    .line 20
    .line 21
    and-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Ldefpackage/dx4;->q:Landroid/animation/TimeInterpolator;

    .line 26
    .line 27
    invoke-virtual {p1, v0}, Ldefpackage/dx4;->z(Landroid/animation/TimeInterpolator;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget v0, p0, Ldefpackage/kx4;->O:I

    .line 31
    .line 32
    and-int/lit8 v0, v0, 0x2

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget-object v0, p0, Ldefpackage/dx4;->F:Ldefpackage/cx;

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Ldefpackage/dx4;->B(Ldefpackage/cx;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    iget v0, p0, Ldefpackage/kx4;->O:I

    .line 42
    .line 43
    and-int/lit8 v0, v0, 0x4

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    iget-object v0, p0, Ldefpackage/dx4;->G:Ldefpackage/xi4;

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Ldefpackage/dx4;->A(Ldefpackage/xi4;)V

    .line 50
    .line 51
    .line 52
    :cond_3
    iget p0, p0, Ldefpackage/kx4;->O:I

    .line 53
    .line 54
    and-int/lit8 p0, p0, 0x8

    .line 55
    .line 56
    if-eqz p0, :cond_4

    .line 57
    .line 58
    const/4 p0, 0x0

    .line 59
    invoke-virtual {p1, p0}, Ldefpackage/dx4;->y(Ldefpackage/hw;)V

    .line 60
    .line 61
    .line 62
    :cond_4
    return-void
.end method

.method public final G(J)V
    .locals 3

    .line 1
    iput-wide p1, p0, Ldefpackage/dx4;->p:J

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    cmp-long v0, p1, v0

    .line 6
    .line 7
    if-ltz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    if-ge v1, v0, :cond_0

    .line 19
    .line 20
    iget-object v2, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ldefpackage/dx4;

    .line 27
    .line 28
    invoke-virtual {v2, p1, p2}, Ldefpackage/dx4;->x(J)V

    .line 29
    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method

.method public final H(Landroid/animation/TimeInterpolator;)V
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/kx4;->O:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Ldefpackage/kx4;->O:I

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-ge v1, v0, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ldefpackage/dx4;

    .line 25
    .line 26
    invoke-virtual {v2, p1}, Ldefpackage/dx4;->z(Landroid/animation/TimeInterpolator;)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v1, v1, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iput-object p1, p0, Ldefpackage/dx4;->q:Landroid/animation/TimeInterpolator;

    .line 33
    .line 34
    return-void
.end method

.method public final I(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Ldefpackage/kx4;->L:Z

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance p0, Landroid/util/AndroidRuntimeException;

    .line 11
    .line 12
    const-string v0, "Invalid parameter for TransitionSet ordering: "

    .line 13
    .line 14
    invoke-static {p1, v0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-direct {p0, p1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0

    .line 22
    :cond_1
    iput-boolean v0, p0, Ldefpackage/kx4;->L:Z

    .line 23
    .line 24
    return-void
.end method

.method public final c(Ldefpackage/mx4;)V
    .locals 5

    .line 1
    iget-object v0, p1, Ldefpackage/mx4;->b:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ldefpackage/dx4;->r(Landroid/view/View;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    :cond_0
    :goto_0
    if-ge v2, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    check-cast v3, Ldefpackage/dx4;

    .line 25
    .line 26
    invoke-virtual {v3, v0}, Ldefpackage/dx4;->r(Landroid/view/View;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    invoke-virtual {v3, p1}, Ldefpackage/dx4;->c(Ldefpackage/mx4;)V

    .line 33
    .line 34
    .line 35
    iget-object v4, p1, Ldefpackage/mx4;->c:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void
.end method

.method public final cancel()V
    .locals 3

    .line 1
    invoke-super {p0}, Ldefpackage/dx4;->cancel()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Ldefpackage/dx4;

    .line 20
    .line 21
    invoke-virtual {v2}, Ldefpackage/dx4;->cancel()V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/kx4;->i()Ldefpackage/dx4;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final e(Ldefpackage/mx4;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Ldefpackage/dx4;->e(Ldefpackage/mx4;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Ldefpackage/dx4;

    .line 20
    .line 21
    invoke-virtual {v2, p1}, Ldefpackage/dx4;->e(Ldefpackage/mx4;)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public final f(Ldefpackage/mx4;)V
    .locals 5

    .line 1
    iget-object v0, p1, Ldefpackage/mx4;->b:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ldefpackage/dx4;->r(Landroid/view/View;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x0

    .line 16
    :cond_0
    :goto_0
    if-ge v2, v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    check-cast v3, Ldefpackage/dx4;

    .line 25
    .line 26
    invoke-virtual {v3, v0}, Ldefpackage/dx4;->r(Landroid/view/View;)Z

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-eqz v4, :cond_0

    .line 31
    .line 32
    invoke-virtual {v3, p1}, Ldefpackage/dx4;->f(Ldefpackage/mx4;)V

    .line 33
    .line 34
    .line 35
    iget-object v4, p1, Ldefpackage/mx4;->c:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void
.end method

.method public final i()Ldefpackage/dx4;
    .locals 5

    .line 1
    invoke-super {p0}, Ldefpackage/dx4;->i()Ldefpackage/dx4;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ldefpackage/kx4;

    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v1, v0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 13
    .line 14
    iget-object v1, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_0
    if-ge v2, v1, :cond_0

    .line 22
    .line 23
    iget-object v3, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    check-cast v3, Ldefpackage/dx4;

    .line 30
    .line 31
    invoke-virtual {v3}, Ldefpackage/dx4;->i()Ldefpackage/dx4;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget-object v4, v0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    iput-object v0, v3, Ldefpackage/dx4;->v:Ldefpackage/kx4;

    .line 41
    .line 42
    add-int/lit8 v2, v2, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-object v0
.end method

.method public final k(Landroid/view/ViewGroup;Ldefpackage/bq4;Ldefpackage/bq4;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 11

    .line 1
    iget-wide v0, p0, Ldefpackage/dx4;->o:J

    .line 2
    .line 3
    iget-object v2, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    :goto_0
    if-ge v3, v2, :cond_3

    .line 11
    .line 12
    iget-object v4, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    move-object v5, v4

    .line 19
    check-cast v5, Ldefpackage/dx4;

    .line 20
    .line 21
    const-wide/16 v6, 0x0

    .line 22
    .line 23
    cmp-long v4, v0, v6

    .line 24
    .line 25
    if-lez v4, :cond_0

    .line 26
    .line 27
    iget-boolean v4, p0, Ldefpackage/kx4;->L:Z

    .line 28
    .line 29
    if-nez v4, :cond_1

    .line 30
    .line 31
    if-nez v3, :cond_0

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_0
    :goto_1
    move-object v6, p1

    .line 35
    move-object v7, p2

    .line 36
    move-object v8, p3

    .line 37
    move-object v9, p4

    .line 38
    move-object/from16 v10, p5

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_1
    :goto_2
    iget-wide v8, v5, Ldefpackage/dx4;->o:J

    .line 42
    .line 43
    cmp-long v4, v8, v6

    .line 44
    .line 45
    if-lez v4, :cond_2

    .line 46
    .line 47
    add-long/2addr v8, v0

    .line 48
    invoke-virtual {v5, v8, v9}, Ldefpackage/dx4;->C(J)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    invoke-virtual {v5, v0, v1}, Ldefpackage/dx4;->C(J)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :goto_3
    invoke-virtual/range {v5 .. v10}, Ldefpackage/dx4;->k(Landroid/view/ViewGroup;Ldefpackage/bq4;Ldefpackage/bq4;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 57
    .line 58
    .line 59
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    return-void
.end method

.method public final t(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Ldefpackage/dx4;->t(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Ldefpackage/dx4;

    .line 20
    .line 21
    invoke-virtual {v2, p1}, Ldefpackage/dx4;->t(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public final v(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Ldefpackage/dx4;->v(Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_0

    .line 12
    .line 13
    iget-object v2, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Ldefpackage/dx4;

    .line 20
    .line 21
    invoke-virtual {v2, p1}, Ldefpackage/dx4;->v(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public final w()V
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Ldefpackage/dx4;->D()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ldefpackage/dx4;->l()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    new-instance v0, Ldefpackage/t51;

    .line 17
    .line 18
    invoke-direct {v0}, Ldefpackage/t51;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p0, v0, Ldefpackage/t51;->b:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v1, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x0

    .line 30
    move v4, v3

    .line 31
    :goto_0
    if-ge v4, v2, :cond_1

    .line 32
    .line 33
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    add-int/lit8 v4, v4, 0x1

    .line 38
    .line 39
    check-cast v5, Ldefpackage/dx4;

    .line 40
    .line 41
    invoke-virtual {v5, v0}, Ldefpackage/dx4;->a(Ldefpackage/bx4;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iget-object v0, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    iput v0, p0, Ldefpackage/kx4;->M:I

    .line 52
    .line 53
    iget-boolean v0, p0, Ldefpackage/kx4;->L:Z

    .line 54
    .line 55
    if-nez v0, :cond_3

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    move v1, v0

    .line 59
    :goto_1
    iget-object v2, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    iget-object v4, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 66
    .line 67
    if-ge v1, v2, :cond_2

    .line 68
    .line 69
    add-int/lit8 v2, v1, -0x1

    .line 70
    .line 71
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    check-cast v2, Ldefpackage/dx4;

    .line 76
    .line 77
    iget-object v4, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    check-cast v4, Ldefpackage/dx4;

    .line 84
    .line 85
    new-instance v5, Ldefpackage/t51;

    .line 86
    .line 87
    invoke-direct {v5, v0, v4}, Ldefpackage/t51;-><init>(ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v5}, Ldefpackage/dx4;->a(Ldefpackage/bx4;)V

    .line 91
    .line 92
    .line 93
    add-int/lit8 v1, v1, 0x1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    check-cast p0, Ldefpackage/dx4;

    .line 101
    .line 102
    if-eqz p0, :cond_4

    .line 103
    .line 104
    invoke-virtual {p0}, Ldefpackage/dx4;->w()V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_3
    iget-object p0, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    :goto_2
    if-ge v3, v0, :cond_4

    .line 115
    .line 116
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    add-int/lit8 v3, v3, 0x1

    .line 121
    .line 122
    check-cast v1, Ldefpackage/dx4;

    .line 123
    .line 124
    invoke-virtual {v1}, Ldefpackage/dx4;->w()V

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_4
    return-void
.end method

.method public final bridge synthetic x(J)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ldefpackage/kx4;->G(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final y(Ldefpackage/hw;)V
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/kx4;->O:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x8

    .line 4
    .line 5
    iput v0, p0, Ldefpackage/kx4;->O:I

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-ge v1, v0, :cond_0

    .line 15
    .line 16
    iget-object v2, p0, Ldefpackage/kx4;->K:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ldefpackage/dx4;

    .line 23
    .line 24
    invoke-virtual {v2, p1}, Ldefpackage/dx4;->y(Ldefpackage/hw;)V

    .line 25
    .line 26
    .line 27
    add-int/lit8 v1, v1, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    return-void
.end method

.method public final bridge synthetic z(Landroid/animation/TimeInterpolator;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ldefpackage/kx4;->H(Landroid/animation/TimeInterpolator;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
