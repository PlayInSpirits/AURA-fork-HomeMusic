.class public final Ldefpackage/oy4;
.super Ldefpackage/e12;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final p:Ljava/util/concurrent/Callable;

.field public final synthetic q:Ldefpackage/py4;


# direct methods
.method public constructor <init>(Ldefpackage/py4;Ljava/util/concurrent/Callable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/oy4;->q:Ldefpackage/py4;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Ldefpackage/oy4;->p:Ljava/util/concurrent/Callable;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/oy4;->q:Ldefpackage/py4;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldefpackage/u0;->m(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/oy4;->q:Ldefpackage/py4;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldefpackage/u0;->l(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/oy4;->q:Ldefpackage/py4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/u0;->isDone()Z

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
    iget-object p0, p0, Ldefpackage/oy4;->p:Ljava/util/concurrent/Callable;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final f()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/oy4;->p:Ljava/util/concurrent/Callable;

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
