.class public final Ll62;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lvy3;
.implements Lqe0;


# instance fields
.field public final n:Lne0;

.field public final o:Lwf1;

.field public final p:Lwe0;

.field public q:Lsk4;


# direct methods
.method public constructor <init>(Lne0;Lwf1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ll62;->n:Lne0;

    .line 5
    .line 6
    iput-object p2, p0, Ll62;->o:Lwf1;

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lne0;->J(Lne0;)Lne0;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {p1}, Lte5;->a(Lne0;)Ltd0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Ll62;->p:Lwe0;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final J(Lne0;)Lne0;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lya4;->F(Lle0;Lne0;)Lne0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final K(Lme0;)Lle0;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lya4;->r(Lle0;Lme0;)Lle0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Ll62;->q:Lsk4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lpb1;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v2}, Lpb1;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, La32;->p(Ljava/util/concurrent/CancellationException;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Ll62;->q:Lsk4;

    .line 16
    .line 17
    return-void
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Ll62;->q:Lsk4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lpb1;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v2}, Lpb1;-><init>(I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, La32;->p(Ljava/util/concurrent/CancellationException;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    iput-object v0, p0, Ll62;->q:Lsk4;

    .line 16
    .line 17
    return-void
.end method

.method public final d()V
    .locals 4

    .line 1
    iget-object v0, p0, Ll62;->q:Lsk4;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v2, Ljava/util/concurrent/CancellationException;

    .line 7
    .line 8
    const-string v3, "Old job was still running!"

    .line 9
    .line 10
    invoke-direct {v2, v3}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2}, La32;->f(Ljava/util/concurrent/CancellationException;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object v0, p0, Ll62;->o:Lwf1;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    iget-object v3, p0, Ll62;->p:Lwe0;

    .line 23
    .line 24
    invoke-static {v3, v1, v1, v0, v2}, Lfu;->G(Lwe0;Lne0;Lze0;Lwf1;I)Lsk4;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, Ll62;->q:Lsk4;

    .line 29
    .line 30
    return-void
.end method

.method public final getKey()Lme0;
    .locals 0

    .line 1
    sget-object p0, Lfz0;->S:Lfz0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n(Lne0;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    sget-object v0, Lx80;->o:Li80;

    .line 2
    .line 3
    invoke-interface {p1, v0}, Lne0;->K(Lme0;)Lle0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lx80;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v1, Lfa;

    .line 12
    .line 13
    const/4 v2, 0x4

    .line 14
    invoke-direct {v1, v2, v0, p0}, Lfa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-static {p2, v1}, Lsi0;->T(Ljava/lang/Throwable;Lgf1;)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object p0, p0, Ll62;->n:Lne0;

    .line 21
    .line 22
    sget-object v0, Lfz0;->S:Lfz0;

    .line 23
    .line 24
    invoke-interface {p0, v0}, Lne0;->K(Lme0;)Lle0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, Lqe0;

    .line 29
    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    invoke-interface {p0, p1, p2}, Lqe0;->n(Lne0;Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    throw p2
.end method

.method public final s(Lwf1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p2, p0}, Lwf1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final u(Lme0;)Lne0;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lya4;->C(Lle0;Lme0;)Lne0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
