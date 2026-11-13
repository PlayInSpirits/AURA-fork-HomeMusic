.class public final Ldefpackage/xl0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/yj2;


# instance fields
.field public final n:Ldefpackage/zq2;

.field public final o:Ldefpackage/q41;

.field public p:Ldefpackage/kq;

.field public q:Ldefpackage/yj2;

.field public r:Z

.field public s:Z


# direct methods
.method public constructor <init>(Ldefpackage/q41;Ldefpackage/vp4;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/xl0;->o:Ldefpackage/q41;

    .line 5
    .line 6
    new-instance p1, Ldefpackage/zq2;

    .line 7
    .line 8
    invoke-direct {p1, p2}, Ldefpackage/zq2;-><init>(Ldefpackage/vp4;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ldefpackage/xl0;->n:Ldefpackage/zq2;

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    iput-boolean p1, p0, Ldefpackage/xl0;->r:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/kq;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ldefpackage/kq;->g()Ldefpackage/yj2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/xl0;->q:Ldefpackage/yj2;

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iput-object v0, p0, Ldefpackage/xl0;->q:Ldefpackage/yj2;

    .line 14
    .line 15
    iput-object p1, p0, Ldefpackage/xl0;->p:Ldefpackage/kq;

    .line 16
    .line 17
    iget-object p0, p0, Ldefpackage/xl0;->n:Ldefpackage/zq2;

    .line 18
    .line 19
    iget-object p0, p0, Ldefpackage/zq2;->r:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Ldefpackage/qh3;

    .line 22
    .line 23
    invoke-interface {v0, p0}, Ldefpackage/yj2;->d(Ldefpackage/qh3;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string p1, "Multiple renderer media clocks enabled."

    .line 30
    .line 31
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    new-instance p1, Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 35
    .line 36
    const/4 v0, 0x2

    .line 37
    const/16 v1, 0x3e8

    .line 38
    .line 39
    invoke-direct {p1, v0, p0, v1}, Landroidx/media3/exoplayer/ExoPlaybackException;-><init>(ILjava/lang/Exception;I)V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :cond_1
    return-void
.end method

.method public final d(Ldefpackage/qh3;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/xl0;->q:Ldefpackage/yj2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ldefpackage/yj2;->d(Ldefpackage/qh3;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Ldefpackage/xl0;->q:Ldefpackage/yj2;

    .line 9
    .line 10
    invoke-interface {p1}, Ldefpackage/yj2;->i()Ldefpackage/qh3;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :cond_0
    iget-object p0, p0, Ldefpackage/xl0;->n:Ldefpackage/zq2;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ldefpackage/zq2;->d(Ldefpackage/qh3;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final i()Ldefpackage/qh3;
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/xl0;->q:Ldefpackage/yj2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ldefpackage/yj2;->i()Ldefpackage/qh3;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object p0, p0, Ldefpackage/xl0;->n:Ldefpackage/zq2;

    .line 11
    .line 12
    iget-object p0, p0, Ldefpackage/zq2;->r:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Ldefpackage/qh3;

    .line 15
    .line 16
    return-object p0
.end method

.method public final j()J
    .locals 2

    .line 1
    iget-boolean v0, p0, Ldefpackage/xl0;->r:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/xl0;->n:Ldefpackage/zq2;

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/zq2;->j()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0

    .line 12
    :cond_0
    iget-object p0, p0, Ldefpackage/xl0;->q:Ldefpackage/yj2;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-interface {p0}, Ldefpackage/yj2;->j()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    return-wide v0
.end method

.method public final k()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldefpackage/xl0;->r:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/xl0;->n:Ldefpackage/zq2;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_0
    iget-object p0, p0, Ldefpackage/xl0;->q:Ldefpackage/yj2;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-interface {p0}, Ldefpackage/yj2;->k()Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method
