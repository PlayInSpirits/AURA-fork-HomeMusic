.class public abstract Lcx2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Leo0;


# instance fields
.field public A:Z

.field public n:Lcx2;

.field public o:Lwe0;

.field public p:I

.field public q:I

.field public r:Lcx2;

.field public s:Lcx2;

.field public t:Lc83;

.field public u:Lf63;

.field public v:Z

.field public w:Z

.field public x:Z

.field public y:Z

.field public z:Lfa;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p0, p0, Lcx2;->n:Lcx2;

    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    iput v0, p0, Lcx2;->q:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final e0()Lwe0;
    .locals 3

    .line 1
    iget-object v0, p0, Lcx2;->o:Lwe0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lj51;->P(Leo0;)Lub3;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lra;

    .line 10
    .line 11
    invoke-virtual {v0}, Lra;->getCoroutineContext()Lne0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {p0}, Lj51;->P(Leo0;)Lub3;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lra;

    .line 20
    .line 21
    invoke-virtual {v1}, Lra;->getCoroutineContext()Lne0;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    sget-object v2, Lfz0;->h0:Lfz0;

    .line 26
    .line 27
    invoke-interface {v1, v2}, Lne0;->K(Lme0;)Lle0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ls22;

    .line 32
    .line 33
    new-instance v2, Lt22;

    .line 34
    .line 35
    invoke-direct {v2, v1}, Lt22;-><init>(Ls22;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v2}, Lne0;->J(Lne0;)Lne0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lte5;->a(Lne0;)Ltd0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, Lcx2;->o:Lwe0;

    .line 47
    .line 48
    :cond_0
    return-object v0
.end method

.method public f0()Z
    .locals 0

    .line 1
    instance-of p0, p0, Lvo;

    .line 2
    .line 3
    xor-int/lit8 p0, p0, 0x1

    .line 4
    .line 5
    return p0
.end method

.method public g0()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcx2;->A:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "node attached multiple times"

    .line 6
    .line 7
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcx2;->u:Lf63;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const-string v0, "attach invoked on a node without a coordinator"

    .line 16
    .line 17
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Lcx2;->A:Z

    .line 22
    .line 23
    iput-boolean v0, p0, Lcx2;->x:Z

    .line 24
    .line 25
    return-void
.end method

.method public h0()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcx2;->A:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Cannot detach a node that is not attached"

    .line 6
    .line 7
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, Lcx2;->x:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    const-string v0, "Must run runAttachLifecycle() before markAsDetached()"

    .line 15
    .line 16
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    iget-boolean v0, p0, Lcx2;->y:Z

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    const-string v0, "Must run runDetachLifecycle() before markAsDetached()"

    .line 24
    .line 25
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    :cond_2
    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Lcx2;->A:Z

    .line 30
    .line 31
    iget-object v0, p0, Lcx2;->o:Lwe0;

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    new-instance v1, Landroidx/compose/ui/ModifierNodeDetachedCancellationException;

    .line 36
    .line 37
    invoke-direct {v1}, Landroidx/compose/ui/ModifierNodeDetachedCancellationException;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-static {v0, v1}, Lte5;->g(Lwe0;Landroidx/compose/ui/ModifierNodeDetachedCancellationException;)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    iput-object v0, p0, Lcx2;->o:Lwe0;

    .line 45
    .line 46
    :cond_3
    return-void
.end method

.method public i0()V
    .locals 0

    .line 1
    return-void
.end method

.method public j0()V
    .locals 0

    .line 1
    return-void
.end method

.method public k0()V
    .locals 0

    .line 1
    return-void
.end method

.method public l0()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcx2;->A:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "reset() called on an unattached node"

    .line 6
    .line 7
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lcx2;->k0()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public m0()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcx2;->A:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Must run markAsAttached() prior to runAttachLifecycle"

    .line 6
    .line 7
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-boolean v0, p0, Lcx2;->x:Z

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    const-string v0, "Must run runAttachLifecycle() only once after markAsAttached()"

    .line 15
    .line 16
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p0, Lcx2;->x:Z

    .line 21
    .line 22
    invoke-virtual {p0}, Lcx2;->i0()V

    .line 23
    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    iput-boolean v0, p0, Lcx2;->y:Z

    .line 27
    .line 28
    return-void
.end method

.method public n0()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcx2;->A:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "node detached multiple times"

    .line 6
    .line 7
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lcx2;->u:Lf63;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const-string v0, "detach invoked on a node without a coordinator"

    .line 16
    .line 17
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    iget-boolean v0, p0, Lcx2;->y:Z

    .line 21
    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    const-string v0, "Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()"

    .line 25
    .line 26
    invoke-static {v0}, Lcz1;->b(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    :cond_2
    const/4 v0, 0x0

    .line 30
    iput-boolean v0, p0, Lcx2;->y:Z

    .line 31
    .line 32
    iget-object v0, p0, Lcx2;->z:Lfa;

    .line 33
    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-virtual {v0}, Lfa;->invoke()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    :cond_3
    invoke-virtual {p0}, Lcx2;->j0()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public o0(Lcx2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcx2;->n:Lcx2;

    .line 2
    .line 3
    return-void
.end method

.method public p0(Lf63;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcx2;->u:Lf63;

    .line 2
    .line 3
    return-void
.end method
