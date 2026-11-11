.class public final Lhp4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Loo0;
.implements Lvd0;


# instance fields
.field public final synthetic n:Lip4;

.field public final o:Lcz;

.field public p:Lcz;

.field public q:Lln3;

.field public final r:Lq01;

.field public final synthetic s:Lip4;


# direct methods
.method public constructor <init>(Lip4;Lcz;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhp4;->s:Lip4;

    .line 5
    .line 6
    iput-object p1, p0, Lhp4;->n:Lip4;

    .line 7
    .line 8
    iput-object p2, p0, Lhp4;->o:Lcz;

    .line 9
    .line 10
    sget-object p1, Lln3;->o:Lln3;

    .line 11
    .line 12
    iput-object p1, p0, Lhp4;->q:Lln3;

    .line 13
    .line 14
    sget-object p1, Lq01;->n:Lq01;

    .line 15
    .line 16
    iput-object p1, p0, Lhp4;->r:Lq01;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final D(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Lhp4;->n:Lip4;

    .line 2
    .line 3
    invoke-virtual {p0}, Lip4;->g()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    div-float/2addr p1, p0

    .line 8
    return p1
.end method

.method public final J()F
    .locals 0

    .line 1
    iget-object p0, p0, Lhp4;->n:Lip4;

    .line 2
    .line 3
    invoke-virtual {p0}, Lip4;->J()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final M(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Lhp4;->n:Lip4;

    .line 2
    .line 3
    invoke-virtual {p0}, Lip4;->g()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-float/2addr p0, p1

    .line 8
    return p0
.end method

.method public final V(F)I
    .locals 0

    .line 1
    iget-object p0, p0, Lhp4;->n:Lip4;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Loo0;->V(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final Y(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Lhp4;->n:Lip4;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Loo0;->Y(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final a(Lln3;Ljp;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lcz;

    .line 2
    .line 3
    invoke-static {p2}, Lya4;->x(Lvd0;)Lvd0;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, v1, p2}, Lcz;-><init>(ILvd0;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcz;->u()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lhp4;->q:Lln3;

    .line 15
    .line 16
    iput-object v0, p0, Lhp4;->p:Lcz;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcz;->q()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final a0(J)F
    .locals 0

    .line 1
    iget-object p0, p0, Lhp4;->n:Lip4;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Loo0;->a0(J)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final g()F
    .locals 0

    .line 1
    iget-object p0, p0, Lhp4;->n:Lip4;

    .line 2
    .line 3
    invoke-virtual {p0}, Lip4;->g()F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final getContext()Lne0;
    .locals 0

    .line 1
    iget-object p0, p0, Lhp4;->r:Lq01;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(F)J
    .locals 0

    .line 1
    iget-object p0, p0, Lhp4;->n:Lip4;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Loo0;->h(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final i(J)J
    .locals 0

    .line 1
    iget-object p0, p0, Lhp4;->n:Lip4;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Loo0;->i(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final o(J)F
    .locals 0

    .line 1
    iget-object p0, p0, Lhp4;->n:Lip4;

    .line 2
    .line 3
    invoke-interface {p0, p1, p2}, Loo0;->o(J)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lhp4;->s:Lip4;

    .line 2
    .line 3
    iget-object v1, v0, Lip4;->H:Lf13;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    :try_start_0
    iget-object v0, v0, Lip4;->G:Lf13;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lf13;->j(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    monitor-exit v1

    .line 12
    iget-object p0, p0, Lhp4;->o:Lcz;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lcz;->resumeWith(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    monitor-exit v1

    .line 20
    throw p0
.end method

.method public final w(F)J
    .locals 0

    .line 1
    iget-object p0, p0, Lhp4;->n:Lip4;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Loo0;->w(F)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method
