.class public abstract Ldefpackage/kq;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/rk3;


# instance fields
.field public A:Z

.field public B:Z

.field public C:Ldefpackage/cu4;

.field public D:Ldefpackage/mt2;

.field public E:Ldefpackage/pn0;

.field public final n:Ljava/lang/Object;

.field public final o:I

.field public final p:Ldefpackage/gp3;

.field public q:Ldefpackage/dz3;

.field public r:I

.field public s:Ldefpackage/ik3;

.field public t:Ldefpackage/vp4;

.field public u:I

.field public v:Ldefpackage/q44;

.field public w:[Ldefpackage/tb1;

.field public x:J

.field public y:J

.field public z:J


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ldefpackage/kq;->n:Ljava/lang/Object;

    .line 10
    .line 11
    iput p1, p0, Ldefpackage/kq;->o:I

    .line 12
    .line 13
    new-instance p1, Ldefpackage/gp3;

    .line 14
    .line 15
    const/16 v0, 0x9

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {p1, v0, v1}, Ldefpackage/gp3;-><init>(IZ)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Ldefpackage/kq;->p:Ldefpackage/gp3;

    .line 22
    .line 23
    const-wide/high16 v0, -0x8000000000000000L

    .line 24
    .line 25
    iput-wide v0, p0, Ldefpackage/kq;->z:J

    .line 26
    .line 27
    sget-object p1, Ldefpackage/cu4;->a:Ldefpackage/yt4;

    .line 28
    .line 29
    iput-object p1, p0, Ldefpackage/kq;->C:Ldefpackage/cu4;

    .line 30
    .line 31
    return-void
.end method

.method public static a(IIII)I
    .locals 0

    .line 1
    or-int/2addr p0, p1

    .line 2
    or-int/2addr p0, p2

    .line 3
    or-int/lit16 p0, p0, 0x80

    .line 4
    .line 5
    or-int/2addr p0, p3

    .line 6
    return p0
.end method

.method public static n(IZ)Z
    .locals 1

    .line 1
    and-int/lit8 p0, p0, 0x7

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    const/4 p1, 0x3

    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 15
    return p0
.end method


# virtual methods
.method public abstract A(JJ)V
.end method

.method public final B([Ldefpackage/tb1;Ldefpackage/q44;JJLdefpackage/mt2;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Ldefpackage/kq;->A:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Ldefpackage/rr2;->w(Z)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Ldefpackage/kq;->v:Ldefpackage/q44;

    .line 9
    .line 10
    iput-object p7, p0, Ldefpackage/kq;->D:Ldefpackage/mt2;

    .line 11
    .line 12
    iget-wide v0, p0, Ldefpackage/kq;->z:J

    .line 13
    .line 14
    const-wide/high16 v2, -0x8000000000000000L

    .line 15
    .line 16
    cmp-long p2, v0, v2

    .line 17
    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    iput-wide p3, p0, Ldefpackage/kq;->z:J

    .line 21
    .line 22
    :cond_0
    iput-object p1, p0, Ldefpackage/kq;->w:[Ldefpackage/tb1;

    .line 23
    .line 24
    iput-wide p5, p0, Ldefpackage/kq;->x:J

    .line 25
    .line 26
    move-object v0, p0

    .line 27
    move-object v1, p1

    .line 28
    move-wide v2, p3

    .line 29
    move-wide v4, p5

    .line 30
    move-object v6, p7

    .line 31
    invoke-virtual/range {v0 .. v6}, Ldefpackage/kq;->x([Ldefpackage/tb1;JJLdefpackage/mt2;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final C(JZZ)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Ldefpackage/kq;->A:Z

    .line 3
    .line 4
    iput-wide p1, p0, Ldefpackage/kq;->y:J

    .line 5
    .line 6
    iput-wide p1, p0, Ldefpackage/kq;->z:J

    .line 7
    .line 8
    if-nez p4, :cond_1

    .line 9
    .line 10
    iget-object p4, p0, Ldefpackage/kq;->v:Ldefpackage/q44;

    .line 11
    .line 12
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-wide v1, p0, Ldefpackage/kq;->x:J

    .line 16
    .line 17
    sub-long v1, p1, v1

    .line 18
    .line 19
    invoke-interface {p4, v1, v2}, Ldefpackage/q44;->u(J)I

    .line 20
    .line 21
    .line 22
    move-result p4

    .line 23
    if-eqz p4, :cond_0

    .line 24
    .line 25
    const/4 p4, 0x1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move p4, v0

    .line 28
    :cond_1
    :goto_0
    invoke-virtual {p0, p1, p2, p3, p4}, Ldefpackage/kq;->r(JZZ)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public D(FF)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract E(Ldefpackage/tb1;)I
.end method

.method public F()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public G(J)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final b(Ljava/lang/Throwable;Ldefpackage/tb1;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;
    .locals 10

    .line 1
    const/4 v0, 0x4

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    iget-boolean v2, p0, Ldefpackage/kq;->B:Z

    .line 5
    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    iput-boolean v2, p0, Ldefpackage/kq;->B:Z

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    :try_start_0
    invoke-virtual {p0, p2}, Ldefpackage/kq;->E(Ldefpackage/tb1;)I

    .line 13
    .line 14
    .line 15
    move-result v3
    :try_end_0
    .catch Landroidx/media3/exoplayer/ExoPlaybackException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    and-int/lit8 v3, v3, 0x7

    .line 17
    .line 18
    iput-boolean v2, p0, Ldefpackage/kq;->B:Z

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    iput-boolean v2, p0, Ldefpackage/kq;->B:Z

    .line 23
    .line 24
    throw v0

    .line 25
    :catch_0
    iput-boolean v2, p0, Ldefpackage/kq;->B:Z

    .line 26
    .line 27
    :cond_0
    move v3, v0

    .line 28
    :goto_0
    invoke-virtual {p0}, Ldefpackage/kq;->h()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    iget v5, p0, Ldefpackage/kq;->r:I

    .line 33
    .line 34
    iget-object v8, p0, Ldefpackage/kq;->D:Ldefpackage/mt2;

    .line 35
    .line 36
    move v1, v0

    .line 37
    new-instance v0, Landroidx/media3/exoplayer/ExoPlaybackException;

    .line 38
    .line 39
    if-nez p2, :cond_1

    .line 40
    .line 41
    move v7, v1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v7, v3

    .line 44
    :goto_1
    const/4 v1, 0x1

    .line 45
    move-object v2, p1

    .line 46
    move-object v6, p2

    .line 47
    move v9, p3

    .line 48
    move v3, p4

    .line 49
    invoke-direct/range {v0 .. v9}, Landroidx/media3/exoplayer/ExoPlaybackException;-><init>(ILjava/lang/Throwable;ILjava/lang/String;ILdefpackage/tb1;ILdefpackage/mt2;Z)V

    .line 50
    .line 51
    .line 52
    return-object v0
.end method

.method public c(ILjava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public e()V
    .locals 0

    .line 1
    return-void
.end method

.method public f(JJ)J
    .locals 0

    .line 1
    iget p1, p0, Ldefpackage/kq;->u:I

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    if-ne p1, p2, :cond_1

    .line 5
    .line 6
    invoke-virtual {p0}, Ldefpackage/kq;->o()Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ldefpackage/kq;->m()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    :cond_0
    const-wide/32 p0, 0xf4240

    .line 19
    .line 20
    .line 21
    return-wide p0

    .line 22
    :cond_1
    const-wide/16 p0, 0x2710

    .line 23
    .line 24
    return-wide p0
.end method

.method public g()Ldefpackage/yj2;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public abstract h()Ljava/lang/String;
.end method

.method public final l()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Ldefpackage/kq;->z:J

    .line 2
    .line 3
    const-wide/high16 v2, -0x8000000000000000L

    .line 4
    .line 5
    cmp-long p0, v0, v2

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public abstract m()Z
.end method

.method public abstract o()Z
.end method

.method public abstract p()V
.end method

.method public q(ZZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract r(JZZ)V
.end method

.method public s()V
    .locals 0

    .line 1
    return-void
.end method

.method public final t()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/kq;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Ldefpackage/kq;->E:Ldefpackage/pn0;

    .line 5
    .line 6
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/pn0;->c:Ljava/lang/Object;

    .line 10
    .line 11
    monitor-enter v0

    .line 12
    :try_start_1
    iget-object p0, p0, Ldefpackage/pn0;->f:Ldefpackage/jn0;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    return-void

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p0

    .line 22
    :cond_0
    return-void

    .line 23
    :catchall_1
    move-exception p0

    .line 24
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 25
    throw p0
.end method

.method public u()V
    .locals 0

    .line 1
    return-void
.end method

.method public v()V
    .locals 0

    .line 1
    return-void
.end method

.method public w()V
    .locals 0

    .line 1
    return-void
.end method

.method public x([Ldefpackage/tb1;JJLdefpackage/mt2;)V
    .locals 0

    .line 1
    return-void
.end method

.method public y()V
    .locals 0

    .line 1
    return-void
.end method

.method public final z(Ldefpackage/gp3;Ldefpackage/cj0;I)I
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/kq;->v:Ldefpackage/q44;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p1, p2, p3}, Ldefpackage/q44;->t(Ldefpackage/gp3;Ldefpackage/cj0;I)I

    .line 7
    .line 8
    .line 9
    move-result p3

    .line 10
    const/4 v0, -0x4

    .line 11
    if-ne p3, v0, :cond_2

    .line 12
    .line 13
    const/4 p1, 0x4

    .line 14
    invoke-virtual {p2, p1}, Ldefpackage/uv;->d(I)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const-wide/high16 p1, -0x8000000000000000L

    .line 21
    .line 22
    iput-wide p1, p0, Ldefpackage/kq;->z:J

    .line 23
    .line 24
    iget-boolean p0, p0, Ldefpackage/kq;->A:Z

    .line 25
    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    return v0

    .line 29
    :cond_0
    const/4 p0, -0x3

    .line 30
    return p0

    .line 31
    :cond_1
    iget-wide v0, p2, Ldefpackage/cj0;->t:J

    .line 32
    .line 33
    iget-wide v2, p0, Ldefpackage/kq;->x:J

    .line 34
    .line 35
    add-long/2addr v0, v2

    .line 36
    iput-wide v0, p2, Ldefpackage/cj0;->t:J

    .line 37
    .line 38
    iget-wide p1, p0, Ldefpackage/kq;->z:J

    .line 39
    .line 40
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 41
    .line 42
    .line 43
    move-result-wide p1

    .line 44
    iput-wide p1, p0, Ldefpackage/kq;->z:J

    .line 45
    .line 46
    return p3

    .line 47
    :cond_2
    const/4 p2, -0x5

    .line 48
    if-ne p3, p2, :cond_3

    .line 49
    .line 50
    iget-object p2, p1, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p2, Ldefpackage/tb1;

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget-wide v0, p2, Ldefpackage/tb1;->s:J

    .line 58
    .line 59
    const-wide v2, 0x7fffffffffffffffL

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    cmp-long v2, v0, v2

    .line 65
    .line 66
    if-eqz v2, :cond_3

    .line 67
    .line 68
    invoke-virtual {p2}, Ldefpackage/tb1;->a()Ldefpackage/sb1;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    iget-wide v2, p0, Ldefpackage/kq;->x:J

    .line 73
    .line 74
    add-long/2addr v0, v2

    .line 75
    iput-wide v0, p2, Ldefpackage/sb1;->r:J

    .line 76
    .line 77
    new-instance p0, Ldefpackage/tb1;

    .line 78
    .line 79
    invoke-direct {p0, p2}, Ldefpackage/tb1;-><init>(Ldefpackage/sb1;)V

    .line 80
    .line 81
    .line 82
    iput-object p0, p1, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 83
    .line 84
    :cond_3
    return p3
.end method
