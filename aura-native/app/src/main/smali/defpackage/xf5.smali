.class public final Ldefpackage/xf5;
.super Ldefpackage/kf5;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final b:Ldefpackage/bk;

.field public final c:Ldefpackage/cr4;

.field public final d:Ldefpackage/pa;


# direct methods
.method public constructor <init>(ILdefpackage/bk;Ldefpackage/cr4;Ldefpackage/pa;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ldefpackage/cg5;-><init>(I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Ldefpackage/xf5;->c:Ldefpackage/cr4;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/xf5;->b:Ldefpackage/bk;

    .line 7
    .line 8
    iput-object p4, p0, Ldefpackage/xf5;->d:Ldefpackage/pa;

    .line 9
    .line 10
    const/4 p0, 0x2

    .line 11
    if-ne p1, p0, :cond_1

    .line 12
    .line 13
    iget-boolean p0, p2, Ldefpackage/bk;->p:Z

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const-string p0, "Best-effort write calls cannot pass methods that should auto-resolve missing features."

    .line 19
    .line 20
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    throw p0

    .line 25
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/xf5;->d:Ldefpackage/pa;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lcom/google/android/gms/common/api/Status;->p:Landroid/app/PendingIntent;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Lcom/google/android/gms/common/api/ResolvableApiException;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance v0, Lcom/google/android/gms/common/api/ApiException;

    .line 17
    .line 18
    invoke-direct {v0, p1}, Lcom/google/android/gms/common/api/ApiException;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    iget-object p0, p0, Ldefpackage/xf5;->c:Ldefpackage/cr4;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, Ldefpackage/cr4;->c(Ljava/lang/Exception;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final b(Ljava/lang/Exception;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/xf5;->c:Ldefpackage/cr4;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldefpackage/cr4;->c(Ljava/lang/Exception;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c(Ldefpackage/gf5;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/xf5;->c:Ldefpackage/cr4;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Ldefpackage/xf5;->b:Ldefpackage/bk;

    .line 4
    .line 5
    iget-object p1, p1, Ldefpackage/gf5;->f:Ldefpackage/me;

    .line 6
    .line 7
    iget-object v1, v1, Ldefpackage/bk;->r:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ldefpackage/bk;

    .line 10
    .line 11
    iget-object v1, v1, Ldefpackage/bk;->q:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Ldefpackage/zy3;

    .line 14
    .line 15
    invoke-interface {v1, p1, v0}, Ldefpackage/zy3;->accept(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catch_0
    move-exception p0

    .line 20
    goto :goto_0

    .line 21
    :catch_1
    move-exception p1

    .line 22
    goto :goto_1

    .line 23
    :goto_0
    invoke-virtual {v0, p0}, Ldefpackage/cr4;->c(Ljava/lang/Exception;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :goto_1
    invoke-static {p1}, Ldefpackage/cg5;->e(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1}, Ldefpackage/xf5;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catch_2
    move-exception p0

    .line 36
    throw p0
.end method

.method public final d(Ldefpackage/xc5;Z)V
    .locals 3

    .line 1
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p1, Ldefpackage/xc5;->p:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/Map;

    .line 8
    .line 9
    iget-object p0, p0, Ldefpackage/xf5;->c:Ldefpackage/cr4;

    .line 10
    .line 11
    invoke-interface {v0, p0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, Ldefpackage/cr4;->a:Ldefpackage/jw;

    .line 15
    .line 16
    new-instance v0, Ldefpackage/gp3;

    .line 17
    .line 18
    const/16 v1, 0x17

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v0, p1, p0, v2, v1}, Ldefpackage/gp3;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    sget-object p0, Ldefpackage/dr4;->a:Ldefpackage/vc5;

    .line 28
    .line 29
    new-instance p1, Ldefpackage/hk5;

    .line 30
    .line 31
    invoke-direct {p1, p0, v0}, Ldefpackage/hk5;-><init>(Ljava/util/concurrent/Executor;Ldefpackage/b93;)V

    .line 32
    .line 33
    .line 34
    iget-object p0, p2, Ldefpackage/jw;->p:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Ldefpackage/mf4;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, Ldefpackage/mf4;->i(Ldefpackage/hk5;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, Ldefpackage/jw;->v()V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final f(Ldefpackage/gf5;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/xf5;->b:Ldefpackage/bk;

    .line 2
    .line 3
    iget-boolean p0, p0, Ldefpackage/bk;->p:Z

    .line 4
    .line 5
    return p0
.end method

.method public final g(Ldefpackage/gf5;)[Ldefpackage/p61;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/xf5;->b:Ldefpackage/bk;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/bk;->q:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, [Ldefpackage/p61;

    .line 6
    .line 7
    return-object p0
.end method
