.class public final Ldefpackage/if2;
.super Ldefpackage/jg3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/pi2;
.implements Ldefpackage/k9;
.implements Ldefpackage/yx2;


# instance fields
.field public A:J

.field public B:Ldefpackage/if1;

.field public C:Ldefpackage/hf2;

.field public final D:Ldefpackage/d72;

.field public final E:Ldefpackage/f13;

.field public F:Z

.field public G:Z

.field public final H:Ldefpackage/gf2;

.field public I:J

.field public final J:Ldefpackage/gf2;

.field public final K:Ldefpackage/gf2;

.field public L:Z

.field public final s:Ldefpackage/f72;

.field public t:Z

.field public u:I

.field public v:I

.field public w:Ldefpackage/a72;

.field public x:Z

.field public y:Z

.field public z:Ldefpackage/nc0;


# direct methods
.method public constructor <init>(Ldefpackage/f72;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ldefpackage/jg3;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/if2;->s:Ldefpackage/f72;

    .line 5
    .line 6
    const v0, 0x7fffffff

    .line 7
    .line 8
    .line 9
    iput v0, p0, Ldefpackage/if2;->u:I

    .line 10
    .line 11
    iput v0, p0, Ldefpackage/if2;->v:I

    .line 12
    .line 13
    sget-object v0, Ldefpackage/a72;->p:Ldefpackage/a72;

    .line 14
    .line 15
    iput-object v0, p0, Ldefpackage/if2;->w:Ldefpackage/a72;

    .line 16
    .line 17
    const-wide/16 v0, 0x0

    .line 18
    .line 19
    iput-wide v0, p0, Ldefpackage/if2;->A:J

    .line 20
    .line 21
    sget-object v0, Ldefpackage/hf2;->p:Ldefpackage/hf2;

    .line 22
    .line 23
    iput-object v0, p0, Ldefpackage/if2;->C:Ldefpackage/hf2;

    .line 24
    .line 25
    new-instance v0, Ldefpackage/d72;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-direct {v0, p0, v1}, Ldefpackage/d72;-><init>(Ldefpackage/k9;I)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Ldefpackage/if2;->D:Ldefpackage/d72;

    .line 32
    .line 33
    new-instance v0, Ldefpackage/f13;

    .line 34
    .line 35
    const/16 v2, 0x10

    .line 36
    .line 37
    new-array v2, v2, [Ldefpackage/if2;

    .line 38
    .line 39
    invoke-direct {v0, v2}, Ldefpackage/f13;-><init>([Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Ldefpackage/if2;->E:Ldefpackage/f13;

    .line 43
    .line 44
    iput-boolean v1, p0, Ldefpackage/if2;->F:Z

    .line 45
    .line 46
    new-instance v0, Ldefpackage/gf2;

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-direct {v0, p0, v2}, Ldefpackage/gf2;-><init>(Ldefpackage/if2;I)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Ldefpackage/if2;->H:Ldefpackage/gf2;

    .line 53
    .line 54
    iget-object p1, p1, Ldefpackage/f72;->p:Ldefpackage/ti2;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    const/16 p1, 0xf

    .line 60
    .line 61
    invoke-static {v2, v2, p1}, Ldefpackage/qc0;->b(III)J

    .line 62
    .line 63
    .line 64
    move-result-wide v2

    .line 65
    iput-wide v2, p0, Ldefpackage/if2;->I:J

    .line 66
    .line 67
    new-instance p1, Ldefpackage/gf2;

    .line 68
    .line 69
    invoke-direct {p1, p0, v1}, Ldefpackage/gf2;-><init>(Ldefpackage/if2;I)V

    .line 70
    .line 71
    .line 72
    iput-object p1, p0, Ldefpackage/if2;->J:Ldefpackage/gf2;

    .line 73
    .line 74
    new-instance p1, Ldefpackage/gf2;

    .line 75
    .line 76
    const/4 v0, 0x2

    .line 77
    invoke-direct {p1, p0, v0}, Ldefpackage/gf2;-><init>(Ldefpackage/if2;I)V

    .line 78
    .line 79
    .line 80
    iput-object p1, p0, Ldefpackage/if2;->K:Ldefpackage/gf2;

    .line 81
    .line 82
    return-void
.end method


# virtual methods
.method public final E()V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/if2;->s:Ldefpackage/f72;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x7

    .line 7
    invoke-static {p0, v0, v1}, Ldefpackage/c72;->U(Ldefpackage/c72;ZI)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final N(JFLdefpackage/if1;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p4}, Ldefpackage/if2;->d0(JLdefpackage/if1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final S()Z
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/if2;->s:Ldefpackage/f72;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 4
    .line 5
    invoke-static {v0}, Ldefpackage/h12;->A(Ldefpackage/c72;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-boolean p0, p0, Ldefpackage/f72;->c:Z

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method public final X(Z)V
    .locals 3

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/if2;->S()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    :cond_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Ldefpackage/if2;->S()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    sget-object p1, Ldefpackage/hf2;->p:Ldefpackage/hf2;

    .line 19
    .line 20
    iput-object p1, p0, Ldefpackage/if2;->C:Ldefpackage/hf2;

    .line 21
    .line 22
    iget-object p0, p0, Ldefpackage/if2;->s:Ldefpackage/f72;

    .line 23
    .line 24
    iget-object p0, p0, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 25
    .line 26
    invoke-virtual {p0}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    iget-object p1, p0, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 31
    .line 32
    iget p0, p0, Ldefpackage/f13;->p:I

    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    :goto_0
    if-ge v0, p0, :cond_2

    .line 36
    .line 37
    aget-object v1, p1, v0

    .line 38
    .line 39
    check-cast v1, Ldefpackage/c72;

    .line 40
    .line 41
    iget-object v1, v1, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 42
    .line 43
    iget-object v1, v1, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const/4 v2, 0x1

    .line 49
    invoke-virtual {v1, v2}, Ldefpackage/if2;->X(Z)V

    .line 50
    .line 51
    .line 52
    add-int/lit8 v0, v0, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    :goto_1
    return-void
.end method

.method public final Z()V
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/if2;->C:Ldefpackage/hf2;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/if2;->s:Ldefpackage/f72;

    .line 4
    .line 5
    iget-boolean v2, v1, Ldefpackage/f72;->c:Z

    .line 6
    .line 7
    iget-object v3, v1, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 8
    .line 9
    sget-object v4, Ldefpackage/hf2;->n:Ldefpackage/hf2;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    sget-object v2, Ldefpackage/hf2;->o:Ldefpackage/hf2;

    .line 14
    .line 15
    iput-object v2, p0, Ldefpackage/if2;->C:Ldefpackage/hf2;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iput-object v4, p0, Ldefpackage/if2;->C:Ldefpackage/hf2;

    .line 19
    .line 20
    :goto_0
    if-eq v0, v4, :cond_1

    .line 21
    .line 22
    iget-boolean p0, v1, Ldefpackage/f72;->e:Z

    .line 23
    .line 24
    if-eqz p0, :cond_1

    .line 25
    .line 26
    const/4 p0, 0x6

    .line 27
    const/4 v0, 0x1

    .line 28
    invoke-static {v3, v0, p0}, Ldefpackage/c72;->U(Ldefpackage/c72;ZI)V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {v3}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    iget-object v0, p0, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 36
    .line 37
    iget p0, p0, Ldefpackage/f13;->p:I

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    :goto_1
    if-ge v1, p0, :cond_4

    .line 41
    .line 42
    aget-object v2, v0, v1

    .line 43
    .line 44
    check-cast v2, Ldefpackage/c72;

    .line 45
    .line 46
    iget-object v3, v2, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 47
    .line 48
    iget-object v3, v3, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 49
    .line 50
    if-eqz v3, :cond_3

    .line 51
    .line 52
    iget v4, v3, Ldefpackage/if2;->v:I

    .line 53
    .line 54
    const v5, 0x7fffffff

    .line 55
    .line 56
    .line 57
    if-eq v4, v5, :cond_2

    .line 58
    .line 59
    invoke-virtual {v3}, Ldefpackage/if2;->Z()V

    .line 60
    .line 61
    .line 62
    invoke-static {v2}, Ldefpackage/c72;->X(Ldefpackage/c72;)V

    .line 63
    .line 64
    .line 65
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    const-string p0, "Error: Child node\'s lookahead pass delegate cannot be null when in a lookahead scope."

    .line 69
    .line 70
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :cond_4
    return-void
.end method

.method public final a()Ldefpackage/d72;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/if2;->D:Ldefpackage/d72;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b0()V
    .locals 6

    .line 1
    iget-object p0, p0, Ldefpackage/if2;->s:Ldefpackage/f72;

    .line 2
    .line 3
    iget v0, p0, Ldefpackage/f72;->o:I

    .line 4
    .line 5
    if-lez v0, :cond_3

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 8
    .line 9
    invoke-virtual {p0}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object v0, p0, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 14
    .line 15
    iget p0, p0, Ldefpackage/f13;->p:I

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    move v2, v1

    .line 19
    :goto_0
    if-ge v2, p0, :cond_3

    .line 20
    .line 21
    aget-object v3, v0, v2

    .line 22
    .line 23
    check-cast v3, Ldefpackage/c72;

    .line 24
    .line 25
    iget-object v4, v3, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 26
    .line 27
    iget-boolean v5, v4, Ldefpackage/f72;->m:Z

    .line 28
    .line 29
    if-nez v5, :cond_0

    .line 30
    .line 31
    iget-boolean v5, v4, Ldefpackage/f72;->n:Z

    .line 32
    .line 33
    if-eqz v5, :cond_1

    .line 34
    .line 35
    :cond_0
    iget-boolean v5, v4, Ldefpackage/f72;->f:Z

    .line 36
    .line 37
    if-nez v5, :cond_1

    .line 38
    .line 39
    invoke-virtual {v3, v1}, Ldefpackage/c72;->T(Z)V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object v3, v4, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 43
    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    invoke-virtual {v3}, Ldefpackage/if2;->b0()V

    .line 47
    .line 48
    .line 49
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    return-void
.end method

.method public final c()Ldefpackage/iz1;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/if2;->s:Ldefpackage/f72;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/c72;->Q:Ldefpackage/w12;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/w12;->d:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ldefpackage/iz1;

    .line 10
    .line 11
    return-object p0
.end method

.method public final c0()V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/if2;->L:Z

    .line 3
    .line 4
    iget-object v1, p0, Ldefpackage/if2;->s:Ldefpackage/f72;

    .line 5
    .line 6
    iget-object v2, v1, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 7
    .line 8
    invoke-virtual {v2}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    iget-object v3, p0, Ldefpackage/if2;->C:Ldefpackage/hf2;

    .line 13
    .line 14
    sget-object v4, Ldefpackage/hf2;->n:Ldefpackage/hf2;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    if-eq v3, v4, :cond_0

    .line 18
    .line 19
    iget-boolean v4, v1, Ldefpackage/f72;->c:Z

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    :cond_0
    sget-object v4, Ldefpackage/hf2;->o:Ldefpackage/hf2;

    .line 24
    .line 25
    if-eq v3, v4, :cond_2

    .line 26
    .line 27
    iget-boolean v1, v1, Ldefpackage/f72;->c:Z

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    :cond_1
    invoke-virtual {p0}, Ldefpackage/if2;->Z()V

    .line 32
    .line 33
    .line 34
    iget-boolean v1, p0, Ldefpackage/if2;->t:Z

    .line 35
    .line 36
    if-eqz v1, :cond_2

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    invoke-virtual {v2, v5}, Ldefpackage/c72;->T(Z)V

    .line 41
    .line 42
    .line 43
    :cond_2
    if-eqz v2, :cond_5

    .line 44
    .line 45
    iget-object v1, v2, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 46
    .line 47
    iget-boolean v2, p0, Ldefpackage/if2;->t:Z

    .line 48
    .line 49
    if-nez v2, :cond_6

    .line 50
    .line 51
    iget-object v2, v1, Ldefpackage/f72;->d:Ldefpackage/y62;

    .line 52
    .line 53
    sget-object v3, Ldefpackage/y62;->p:Ldefpackage/y62;

    .line 54
    .line 55
    if-eq v2, v3, :cond_3

    .line 56
    .line 57
    sget-object v3, Ldefpackage/y62;->q:Ldefpackage/y62;

    .line 58
    .line 59
    if-ne v2, v3, :cond_6

    .line 60
    .line 61
    :cond_3
    iget v2, p0, Ldefpackage/if2;->v:I

    .line 62
    .line 63
    const v3, 0x7fffffff

    .line 64
    .line 65
    .line 66
    if-ne v2, v3, :cond_4

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    const-string v2, "Place was called on a node which was placed already"

    .line 70
    .line 71
    invoke-static {v2}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :goto_0
    iget v2, v1, Ldefpackage/f72;->h:I

    .line 75
    .line 76
    iput v2, p0, Ldefpackage/if2;->v:I

    .line 77
    .line 78
    add-int/2addr v2, v0

    .line 79
    iput v2, v1, Ldefpackage/f72;->h:I

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_5
    iput v5, p0, Ldefpackage/if2;->v:I

    .line 83
    .line 84
    :cond_6
    :goto_1
    invoke-virtual {p0}, Ldefpackage/if2;->y()V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final d0(JLdefpackage/if1;)V
    .locals 9

    .line 1
    iget-object v0, p0, Ldefpackage/if2;->s:Ldefpackage/f72;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :try_start_0
    invoke-virtual {v1}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 9
    .line 10
    .line 11
    move-result-object v4

    .line 12
    if-eqz v4, :cond_0

    .line 13
    .line 14
    iget-object v4, v4, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 15
    .line 16
    iget-object v4, v4, Ldefpackage/f72;->d:Ldefpackage/y62;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v4, v3

    .line 20
    :goto_0
    sget-object v5, Ldefpackage/y62;->q:Ldefpackage/y62;

    .line 21
    .line 22
    const/4 v6, 0x0

    .line 23
    if-ne v4, v5, :cond_1

    .line 24
    .line 25
    iput-boolean v6, v0, Ldefpackage/f72;->c:Z

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    goto :goto_4

    .line 30
    :cond_1
    :goto_1
    iget-boolean v4, v2, Ldefpackage/c72;->Z:Z

    .line 31
    .line 32
    if-eqz v4, :cond_2

    .line 33
    .line 34
    const-string v4, "place is called on a deactivated node"

    .line 35
    .line 36
    invoke-static {v4}, Ldefpackage/cz1;->a(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :cond_2
    iput-object v5, v0, Ldefpackage/f72;->d:Ldefpackage/y62;

    .line 40
    .line 41
    const/4 v4, 0x1

    .line 42
    iput-boolean v4, p0, Ldefpackage/if2;->x:Z

    .line 43
    .line 44
    iput-boolean v6, p0, Ldefpackage/if2;->L:Z

    .line 45
    .line 46
    iget-wide v7, p0, Ldefpackage/if2;->A:J

    .line 47
    .line 48
    invoke-static {p1, p2, v7, v8}, Ldefpackage/g02;->a(JJ)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-nez v5, :cond_5

    .line 53
    .line 54
    iget-boolean v5, v0, Ldefpackage/f72;->n:Z

    .line 55
    .line 56
    if-nez v5, :cond_3

    .line 57
    .line 58
    iget-boolean v5, v0, Ldefpackage/f72;->m:Z

    .line 59
    .line 60
    if-eqz v5, :cond_4

    .line 61
    .line 62
    :cond_3
    iput-boolean v4, v0, Ldefpackage/f72;->f:Z

    .line 63
    .line 64
    :cond_4
    invoke-virtual {p0}, Ldefpackage/if2;->b0()V

    .line 65
    .line 66
    .line 67
    :cond_5
    invoke-static {v2}, Ldefpackage/h12;->L(Ldefpackage/c72;)Ldefpackage/ub3;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    iput-wide p1, p0, Ldefpackage/if2;->A:J

    .line 72
    .line 73
    iget-boolean v7, v0, Ldefpackage/f72;->f:Z

    .line 74
    .line 75
    if-nez v7, :cond_7

    .line 76
    .line 77
    iget-object v7, p0, Ldefpackage/if2;->C:Ldefpackage/hf2;

    .line 78
    .line 79
    sget-object v8, Ldefpackage/hf2;->p:Ldefpackage/hf2;

    .line 80
    .line 81
    if-eq v7, v8, :cond_6

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_6
    move v4, v6

    .line 85
    :goto_2
    if-eqz v4, :cond_7

    .line 86
    .line 87
    invoke-virtual {v0}, Ldefpackage/f72;->a()Ldefpackage/f63;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v2}, Ldefpackage/f63;->y0()Ldefpackage/ef2;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    iget-wide v4, v2, Ldefpackage/jg3;->r:J

    .line 99
    .line 100
    invoke-static {p1, p2, v4, v5}, Ldefpackage/g02;->c(JJ)J

    .line 101
    .line 102
    .line 103
    move-result-wide p1

    .line 104
    invoke-virtual {v2, p1, p2}, Ldefpackage/ef2;->r0(J)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Ldefpackage/if2;->c0()V

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_7
    invoke-virtual {v0, v6}, Ldefpackage/f72;->h(Z)V

    .line 112
    .line 113
    .line 114
    iget-object p1, p0, Ldefpackage/if2;->D:Ldefpackage/d72;

    .line 115
    .line 116
    iput-boolean v6, p1, Ldefpackage/d72;->e:Z

    .line 117
    .line 118
    check-cast v5, Ldefpackage/ra;

    .line 119
    .line 120
    invoke-virtual {v5}, Ldefpackage/ra;->getSnapshotObserver()Ldefpackage/wb3;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    iget-object p2, p0, Ldefpackage/if2;->K:Ldefpackage/gf2;

    .line 125
    .line 126
    iget-object v4, p1, Ldefpackage/wb3;->g:Ldefpackage/k52;

    .line 127
    .line 128
    iget-object p1, p1, Ldefpackage/wb3;->a:Ldefpackage/pp3;

    .line 129
    .line 130
    invoke-virtual {p1, v2, v4, p2}, Ldefpackage/pp3;->e(Ljava/lang/Object;Ldefpackage/if1;Ldefpackage/gf1;)V

    .line 131
    .line 132
    .line 133
    :goto_3
    iput-object p3, p0, Ldefpackage/if2;->B:Ldefpackage/if1;

    .line 134
    .line 135
    sget-object p0, Ldefpackage/y62;->r:Ldefpackage/y62;

    .line 136
    .line 137
    iput-object p0, v0, Ldefpackage/f72;->d:Ldefpackage/y62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    .line 139
    return-void

    .line 140
    :goto_4
    invoke-virtual {v1, p0}, Ldefpackage/c72;->Z(Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    throw v3
.end method

.method public final e()Ldefpackage/k9;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/if2;->s:Ldefpackage/f72;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method public final e0(J)Z
    .locals 13

    .line 1
    iget-object v0, p0, Ldefpackage/if2;->s:Ldefpackage/f72;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 6
    .line 7
    :try_start_0
    iget-boolean v3, v1, Ldefpackage/c72;->Z:Z

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    const-string v3, "measure is called on a deactivated node"

    .line 12
    .line 13
    invoke-static {v3}, Ldefpackage/cz1;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto/16 :goto_9

    .line 19
    .line 20
    :cond_0
    :goto_0
    invoke-virtual {v2}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-boolean v4, v2, Ldefpackage/c72;->P:Z

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    const/4 v6, 0x0

    .line 28
    if-nez v4, :cond_2

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    iget-boolean v3, v3, Ldefpackage/c72;->P:Z

    .line 33
    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v3, v6

    .line 38
    goto :goto_2

    .line 39
    :cond_2
    :goto_1
    move v3, v5

    .line 40
    :goto_2
    iput-boolean v3, v2, Ldefpackage/c72;->P:Z

    .line 41
    .line 42
    iget-object v3, v2, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 43
    .line 44
    iget-boolean v3, v3, Ldefpackage/f72;->e:Z

    .line 45
    .line 46
    if-nez v3, :cond_6

    .line 47
    .line 48
    iget-object v3, p0, Ldefpackage/if2;->z:Ldefpackage/nc0;

    .line 49
    .line 50
    if-nez v3, :cond_3

    .line 51
    .line 52
    move v3, v6

    .line 53
    goto :goto_3

    .line 54
    :cond_3
    iget-wide v3, v3, Ldefpackage/nc0;->a:J

    .line 55
    .line 56
    invoke-static {v3, v4, p1, p2}, Ldefpackage/nc0;->b(JJ)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    :goto_3
    if-nez v3, :cond_4

    .line 61
    .line 62
    goto :goto_4

    .line 63
    :cond_4
    iget-object p0, v2, Ldefpackage/c72;->A:Ldefpackage/ub3;

    .line 64
    .line 65
    if-eqz p0, :cond_5

    .line 66
    .line 67
    check-cast p0, Ldefpackage/ra;

    .line 68
    .line 69
    invoke-virtual {p0, v2, v5}, Ldefpackage/ra;->g(Ldefpackage/c72;Z)V

    .line 70
    .line 71
    .line 72
    :cond_5
    invoke-virtual {v2}, Ldefpackage/c72;->Y()V

    .line 73
    .line 74
    .line 75
    return v6

    .line 76
    :cond_6
    :goto_4
    new-instance v3, Ldefpackage/nc0;

    .line 77
    .line 78
    invoke-direct {v3, p1, p2}, Ldefpackage/nc0;-><init>(J)V

    .line 79
    .line 80
    .line 81
    iput-object v3, p0, Ldefpackage/if2;->z:Ldefpackage/nc0;

    .line 82
    .line 83
    invoke-virtual {p0, p1, p2}, Ldefpackage/jg3;->R(J)V

    .line 84
    .line 85
    .line 86
    iget-object v3, p0, Ldefpackage/if2;->D:Ldefpackage/d72;

    .line 87
    .line 88
    iput-boolean v6, v3, Ldefpackage/d72;->d:Z

    .line 89
    .line 90
    invoke-virtual {v2}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    iget-object v3, v2, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 95
    .line 96
    iget v2, v2, Ldefpackage/f13;->p:I

    .line 97
    .line 98
    move v4, v6

    .line 99
    :goto_5
    if-ge v4, v2, :cond_7

    .line 100
    .line 101
    aget-object v7, v3, v4

    .line 102
    .line 103
    check-cast v7, Ldefpackage/c72;

    .line 104
    .line 105
    iget-object v7, v7, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 106
    .line 107
    iget-object v7, v7, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 108
    .line 109
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-object v7, v7, Ldefpackage/if2;->D:Ldefpackage/d72;

    .line 113
    .line 114
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    add-int/lit8 v4, v4, 0x1

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_7
    iget-boolean v2, p0, Ldefpackage/if2;->y:Z

    .line 121
    .line 122
    if-eqz v2, :cond_8

    .line 123
    .line 124
    iget-wide v2, p0, Ldefpackage/jg3;->p:J

    .line 125
    .line 126
    goto :goto_6

    .line 127
    :cond_8
    const-wide v2, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    :goto_6
    iput-boolean v5, p0, Ldefpackage/if2;->y:Z

    .line 133
    .line 134
    invoke-virtual {v0}, Ldefpackage/f72;->a()Ldefpackage/f63;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-virtual {v4}, Ldefpackage/f63;->y0()Ldefpackage/ef2;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    if-eqz v4, :cond_9

    .line 143
    .line 144
    goto :goto_7

    .line 145
    :cond_9
    const-string v7, "Lookahead result from lookaheadRemeasure cannot be null"

    .line 146
    .line 147
    invoke-static {v7}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    :goto_7
    invoke-virtual {v0, p1, p2}, Ldefpackage/f72;->c(J)V

    .line 151
    .line 152
    .line 153
    iget p1, v4, Ldefpackage/jg3;->n:I

    .line 154
    .line 155
    iget p2, v4, Ldefpackage/jg3;->o:I

    .line 156
    .line 157
    int-to-long v7, p1

    .line 158
    const/16 p1, 0x20

    .line 159
    .line 160
    shl-long/2addr v7, p1

    .line 161
    int-to-long v9, p2

    .line 162
    const-wide v11, 0xffffffffL

    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    and-long/2addr v9, v11

    .line 168
    or-long/2addr v7, v9

    .line 169
    invoke-virtual {p0, v7, v8}, Ldefpackage/jg3;->Q(J)V

    .line 170
    .line 171
    .line 172
    shr-long p0, v2, p1

    .line 173
    .line 174
    long-to-int p0, p0

    .line 175
    iget p1, v4, Ldefpackage/jg3;->n:I

    .line 176
    .line 177
    if-ne p0, p1, :cond_b

    .line 178
    .line 179
    and-long p0, v2, v11

    .line 180
    .line 181
    long-to-int p0, p0

    .line 182
    iget p1, v4, Ldefpackage/jg3;->o:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 183
    .line 184
    if-eq p0, p1, :cond_a

    .line 185
    .line 186
    goto :goto_8

    .line 187
    :cond_a
    return v6

    .line 188
    :cond_b
    :goto_8
    return v5

    .line 189
    :goto_9
    invoke-virtual {v1, p0}, Ldefpackage/c72;->Z(Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    const/4 p0, 0x0

    .line 193
    throw p0
.end method

.method public final n()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/if2;->v:I

    .line 2
    .line 3
    return p0
.end method

.method public final r(J)Ldefpackage/jg3;
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/if2;->s:Ldefpackage/f72;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 4
    .line 5
    iget-object v2, v0, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 6
    .line 7
    invoke-virtual {v1}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v3, 0x0

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v1, v1, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 15
    .line 16
    iget-object v1, v1, Ldefpackage/f72;->d:Ldefpackage/y62;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v1, v3

    .line 20
    :goto_0
    sget-object v4, Ldefpackage/y62;->o:Ldefpackage/y62;

    .line 21
    .line 22
    if-eq v1, v4, :cond_2

    .line 23
    .line 24
    invoke-virtual {v2}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    iget-object v1, v1, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 31
    .line 32
    iget-object v1, v1, Ldefpackage/f72;->d:Ldefpackage/y62;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move-object v1, v3

    .line 36
    :goto_1
    sget-object v4, Ldefpackage/y62;->q:Ldefpackage/y62;

    .line 37
    .line 38
    if-ne v1, v4, :cond_3

    .line 39
    .line 40
    :cond_2
    const/4 v1, 0x0

    .line 41
    iput-boolean v1, v0, Ldefpackage/f72;->b:Z

    .line 42
    .line 43
    :cond_3
    invoke-virtual {v2}, Ldefpackage/c72;->t()Ldefpackage/c72;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sget-object v1, Ldefpackage/a72;->p:Ldefpackage/a72;

    .line 48
    .line 49
    if-eqz v0, :cond_9

    .line 50
    .line 51
    iget-object v0, v0, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 52
    .line 53
    iget-object v4, p0, Ldefpackage/if2;->w:Ldefpackage/a72;

    .line 54
    .line 55
    if-eq v4, v1, :cond_5

    .line 56
    .line 57
    iget-boolean v4, v2, Ldefpackage/c72;->P:Z

    .line 58
    .line 59
    if-eqz v4, :cond_4

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_4
    const-string v4, "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()"

    .line 63
    .line 64
    invoke-static {v4}, Ldefpackage/cz1;->b(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    :cond_5
    :goto_2
    iget-object v4, v0, Ldefpackage/f72;->d:Ldefpackage/y62;

    .line 68
    .line 69
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_8

    .line 74
    .line 75
    const/4 v5, 0x1

    .line 76
    if-eq v4, v5, :cond_8

    .line 77
    .line 78
    const/4 v5, 0x2

    .line 79
    if-eq v4, v5, :cond_7

    .line 80
    .line 81
    const/4 v5, 0x3

    .line 82
    if-ne v4, v5, :cond_6

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_6
    iget-object p0, v0, Ldefpackage/f72;->d:Ldefpackage/y62;

    .line 86
    .line 87
    const-string p1, "Measurable could be only measured from the parent\'s measure or layout block. Parents state is "

    .line 88
    .line 89
    invoke-static {p0, p1}, Ldefpackage/nz2;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    return-object v3

    .line 93
    :cond_7
    :goto_3
    sget-object v0, Ldefpackage/a72;->o:Ldefpackage/a72;

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_8
    sget-object v0, Ldefpackage/a72;->n:Ldefpackage/a72;

    .line 97
    .line 98
    :goto_4
    iput-object v0, p0, Ldefpackage/if2;->w:Ldefpackage/a72;

    .line 99
    .line 100
    goto :goto_5

    .line 101
    :cond_9
    iput-object v1, p0, Ldefpackage/if2;->w:Ldefpackage/a72;

    .line 102
    .line 103
    :goto_5
    iget-object v0, v2, Ldefpackage/c72;->N:Ldefpackage/a72;

    .line 104
    .line 105
    if-ne v0, v1, :cond_a

    .line 106
    .line 107
    invoke-virtual {v2}, Ldefpackage/c72;->e()V

    .line 108
    .line 109
    .line 110
    :cond_a
    invoke-virtual {p0, p1, p2}, Ldefpackage/if2;->e0(J)Z

    .line 111
    .line 112
    .line 113
    return-object p0
.end method

.method public final requestLayout()V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/if2;->s:Ldefpackage/f72;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Ldefpackage/c72;->T(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final s(Ldefpackage/x;)V
    .locals 3

    .line 1
    iget-object p0, p0, Ldefpackage/if2;->s:Ldefpackage/f72;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget-object v0, p0, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 10
    .line 11
    iget p0, p0, Ldefpackage/f13;->p:I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-ge v1, p0, :cond_0

    .line 15
    .line 16
    aget-object v2, v0, v1

    .line 17
    .line 18
    check-cast v2, Ldefpackage/c72;

    .line 19
    .line 20
    iget-object v2, v2, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 21
    .line 22
    iget-object v2, v2, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, v2}, Ldefpackage/x;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-void
.end method

.method public final t()Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final x(Z)V
    .locals 2

    .line 1
    iget-object p0, p0, Ldefpackage/if2;->s:Ldefpackage/f72;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/f72;->a()Ldefpackage/f63;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ldefpackage/f63;->y0()Ldefpackage/ef2;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-boolean v0, v0, Ldefpackage/cf2;->y:Z

    .line 14
    .line 15
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {p0}, Ldefpackage/f72;->a()Ldefpackage/f63;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Ldefpackage/f63;->y0()Ldefpackage/ef2;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    iput-boolean p1, p0, Ldefpackage/cf2;->y:Z

    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public final y()V
    .locals 10

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/if2;->G:Z

    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/if2;->D:Ldefpackage/d72;

    .line 5
    .line 6
    invoke-virtual {v0}, Ldefpackage/d72;->h()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Ldefpackage/if2;->s:Ldefpackage/f72;

    .line 10
    .line 11
    iget-boolean v2, v1, Ldefpackage/f72;->f:Z

    .line 12
    .line 13
    iget-object v3, v1, Ldefpackage/f72;->a:Ldefpackage/c72;

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-virtual {v3}, Ldefpackage/c72;->y()Ldefpackage/f13;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    iget-object v5, v2, Ldefpackage/f13;->n:[Ljava/lang/Object;

    .line 23
    .line 24
    iget v2, v2, Ldefpackage/f13;->p:I

    .line 25
    .line 26
    move v6, v4

    .line 27
    :goto_0
    if-ge v6, v2, :cond_2

    .line 28
    .line 29
    aget-object v7, v5, v6

    .line 30
    .line 31
    check-cast v7, Ldefpackage/c72;

    .line 32
    .line 33
    iget-object v8, v7, Ldefpackage/c72;->R:Ldefpackage/f72;

    .line 34
    .line 35
    iget-boolean v9, v8, Ldefpackage/f72;->e:Z

    .line 36
    .line 37
    if-eqz v9, :cond_1

    .line 38
    .line 39
    invoke-virtual {v7}, Ldefpackage/c72;->s()Ldefpackage/a72;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    sget-object v9, Ldefpackage/a72;->n:Ldefpackage/a72;

    .line 44
    .line 45
    if-ne v7, v9, :cond_1

    .line 46
    .line 47
    iget-object v7, v8, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 48
    .line 49
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v8, v8, Ldefpackage/f72;->q:Ldefpackage/if2;

    .line 53
    .line 54
    if-eqz v8, :cond_0

    .line 55
    .line 56
    iget-object v8, v8, Ldefpackage/if2;->z:Ldefpackage/nc0;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_0
    const/4 v8, 0x0

    .line 60
    :goto_1
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-wide v8, v8, Ldefpackage/nc0;->a:J

    .line 64
    .line 65
    invoke-virtual {v7, v8, v9}, Ldefpackage/if2;->e0(J)Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-eqz v7, :cond_1

    .line 70
    .line 71
    const/4 v7, 0x7

    .line 72
    invoke-static {v3, v4, v7}, Ldefpackage/c72;->U(Ldefpackage/c72;ZI)V

    .line 73
    .line 74
    .line 75
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    invoke-virtual {p0}, Ldefpackage/if2;->c()Ldefpackage/iz1;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    iget-object v2, v2, Ldefpackage/iz1;->o0:Ldefpackage/hz1;

    .line 83
    .line 84
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-boolean v5, v1, Ldefpackage/f72;->g:Z

    .line 88
    .line 89
    if-nez v5, :cond_3

    .line 90
    .line 91
    iget-boolean v5, v2, Ldefpackage/cf2;->B:Z

    .line 92
    .line 93
    if-nez v5, :cond_5

    .line 94
    .line 95
    iget-boolean v5, v1, Ldefpackage/f72;->f:Z

    .line 96
    .line 97
    if-eqz v5, :cond_5

    .line 98
    .line 99
    :cond_3
    iput-boolean v4, v1, Ldefpackage/f72;->f:Z

    .line 100
    .line 101
    iget-object v5, v1, Ldefpackage/f72;->d:Ldefpackage/y62;

    .line 102
    .line 103
    sget-object v6, Ldefpackage/y62;->q:Ldefpackage/y62;

    .line 104
    .line 105
    iput-object v6, v1, Ldefpackage/f72;->d:Ldefpackage/y62;

    .line 106
    .line 107
    invoke-virtual {v1, v4}, Ldefpackage/f72;->i(Z)V

    .line 108
    .line 109
    .line 110
    invoke-static {v3}, Ldefpackage/h12;->L(Ldefpackage/c72;)Ldefpackage/ub3;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    check-cast v6, Ldefpackage/ra;

    .line 115
    .line 116
    invoke-virtual {v6}, Ldefpackage/ra;->getSnapshotObserver()Ldefpackage/wb3;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    iget-object v7, v6, Ldefpackage/wb3;->h:Ldefpackage/k52;

    .line 121
    .line 122
    iget-object v6, v6, Ldefpackage/wb3;->a:Ldefpackage/pp3;

    .line 123
    .line 124
    iget-object v8, p0, Ldefpackage/if2;->H:Ldefpackage/gf2;

    .line 125
    .line 126
    invoke-virtual {v6, v3, v7, v8}, Ldefpackage/pp3;->e(Ljava/lang/Object;Ldefpackage/if1;Ldefpackage/gf1;)V

    .line 127
    .line 128
    .line 129
    iput-object v5, v1, Ldefpackage/f72;->d:Ldefpackage/y62;

    .line 130
    .line 131
    iget-boolean v3, v1, Ldefpackage/f72;->m:Z

    .line 132
    .line 133
    if-eqz v3, :cond_4

    .line 134
    .line 135
    iget-boolean v2, v2, Ldefpackage/cf2;->B:Z

    .line 136
    .line 137
    if-eqz v2, :cond_4

    .line 138
    .line 139
    invoke-virtual {p0}, Ldefpackage/if2;->requestLayout()V

    .line 140
    .line 141
    .line 142
    :cond_4
    iput-boolean v4, v1, Ldefpackage/f72;->g:Z

    .line 143
    .line 144
    :cond_5
    iget-boolean v1, v0, Ldefpackage/d72;->b:Z

    .line 145
    .line 146
    if-eqz v1, :cond_6

    .line 147
    .line 148
    invoke-virtual {v0}, Ldefpackage/d72;->e()Z

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-eqz v1, :cond_6

    .line 153
    .line 154
    invoke-virtual {v0}, Ldefpackage/d72;->g()V

    .line 155
    .line 156
    .line 157
    :cond_6
    iput-boolean v4, p0, Ldefpackage/if2;->G:Z

    .line 158
    .line 159
    return-void
.end method
