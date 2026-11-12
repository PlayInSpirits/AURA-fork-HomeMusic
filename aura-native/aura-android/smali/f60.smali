.class public final Lf60;
.super Le12;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final p:Lgq0;

.field public final synthetic q:Lg60;

.field public final r:Lzq0;

.field public final synthetic s:Lg60;


# direct methods
.method public constructor <init>(Lg60;Lzq0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf60;->s:Lg60;

    .line 2
    .line 3
    iput-object p1, p0, Lf60;->q:Lg60;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 6
    .line 7
    .line 8
    sget-object p1, Lgq0;->n:Lgq0;

    .line 9
    .line 10
    iput-object p1, p0, Lf60;->p:Lgq0;

    .line 11
    .line 12
    iput-object p2, p0, Lf60;->r:Lzq0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object p0, p0, Lf60;->q:Lg60;

    .line 3
    .line 4
    iput-object v0, p0, Lg60;->z:Lf60;

    .line 5
    .line 6
    instance-of v0, p1, Ljava/util/concurrent/ExecutionException;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p1, Ljava/util/concurrent/ExecutionException;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Lu0;->m(Ljava/lang/Throwable;)Z

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    const/4 p1, 0x0

    .line 25
    invoke-virtual {p0, p1}, Lu0;->cancel(Z)Z

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    invoke-virtual {p0, p1}, Lu0;->m(Ljava/lang/Throwable;)Z

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lf60;->q:Lg60;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, v0, Lg60;->z:Lf60;

    .line 5
    .line 6
    iget-object p0, p0, Lf60;->s:Lg60;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lu0;->l(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final d()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lf60;->q:Lg60;

    .line 2
    .line 3
    invoke-virtual {p0}, Lu0;->isDone()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final e()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lf60;->r:Lzq0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lzq0;->call()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return-object p0
.end method

.method public final f()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lf60;->r:Lzq0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
