.class public abstract Lt43;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Ld23;

.field public b:Z


# virtual methods
.method public abstract a()Lr23;
.end method

.method public final b()Ld23;
    .locals 0

    .line 1
    iget-object p0, p0, Lt43;->a:Ld23;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "You cannot access the Navigator\'s state until the Navigator is attached"

    .line 7
    .line 8
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public c(Lr23;Landroid/os/Bundle;Ly23;)Lr23;
    .locals 0

    .line 1
    return-object p1
.end method

.method public d(Ljava/util/List;Ly23;)V
    .locals 3

    .line 1
    new-instance v0, Lw40;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p1}, Lw40;-><init>(ILjava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Lbr0;

    .line 8
    .line 9
    const/4 v2, 0x2

    .line 10
    invoke-direct {p1, v2, p0, p2}, Lbr0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    new-instance p2, Ltq4;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {p2, v0, p1, v2}, Ltq4;-><init>(Ljava/lang/Object;Lif1;I)V

    .line 17
    .line 18
    .line 19
    new-instance p1, Lo54;

    .line 20
    .line 21
    const/16 v0, 0xd

    .line 22
    .line 23
    invoke-direct {p1, v0}, Lo54;-><init>(I)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Lh71;

    .line 27
    .line 28
    invoke-direct {v0, p2, v1, p1}, Lh71;-><init>(Laa4;ZLif1;)V

    .line 29
    .line 30
    .line 31
    new-instance p1, Lg71;

    .line 32
    .line 33
    invoke-direct {p1, v0}, Lg71;-><init>(Lh71;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-virtual {p1}, Lg71;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-eqz p2, :cond_0

    .line 41
    .line 42
    invoke-virtual {p1}, Lg71;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    check-cast p2, La23;

    .line 47
    .line 48
    invoke-virtual {p0}, Lt43;->b()Ld23;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0, p2}, Ld23;->g(La23;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-void
.end method

.method public e(Ld23;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt43;->a:Ld23;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lt43;->b:Z

    .line 5
    .line 6
    return-void
.end method

.method public f(La23;)V
    .locals 5

    .line 1
    iget-object v0, p1, La23;->o:Lr23;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    move-object v0, v1

    .line 8
    :goto_0
    if-nez v0, :cond_1

    .line 9
    .line 10
    return-void

    .line 11
    :cond_1
    new-instance v2, Lx23;

    .line 12
    .line 13
    invoke-direct {v2}, Lx23;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    iput-boolean v3, v2, Lx23;->a:Z

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    iput-boolean v3, v2, Lx23;->b:Z

    .line 21
    .line 22
    const/4 v4, -0x1

    .line 23
    iput v4, v2, Lx23;->c:I

    .line 24
    .line 25
    iput-boolean v3, v2, Lx23;->d:Z

    .line 26
    .line 27
    iput-boolean v3, v2, Lx23;->e:Z

    .line 28
    .line 29
    invoke-virtual {v2}, Lx23;->a()Ly23;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {p0, v0, v1, v2}, Lt43;->c(Lr23;Landroid/os/Bundle;Ly23;)Lr23;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lt43;->b()Ld23;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0, p1}, Ld23;->c(La23;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public g(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public h()Landroid/os/Bundle;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public i(La23;Z)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lt43;->b()Ld23;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, Ld23;->e:Lvu3;

    .line 9
    .line 10
    iget-object v0, v0, Lvu3;->n:Lnl4;

    .line 11
    .line 12
    invoke-virtual {v0}, Lnl4;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/util/List;

    .line 17
    .line 18
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-interface {v0, v1}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v0, 0x0

    .line 33
    :cond_0
    invoke-virtual {p0}, Lt43;->j()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, La23;

    .line 45
    .line 46
    invoke-static {v0, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    :goto_0
    if-eqz v0, :cond_2

    .line 53
    .line 54
    invoke-virtual {p0}, Lt43;->b()Ld23;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {p0, v0, p2}, Ld23;->d(La23;Z)V

    .line 59
    .line 60
    .line 61
    :cond_2
    return-void

    .line 62
    :cond_3
    const-string p0, "popBackStack was called with "

    .line 63
    .line 64
    const-string p2, " which does not exist in back stack "

    .line 65
    .line 66
    invoke-static {p0, p1, p2, v0}, Lnz2;->o(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public j()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
