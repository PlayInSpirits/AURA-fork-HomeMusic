.class public final Lg60;
.super Ln6;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final A:Ly82;


# instance fields
.field public y:Lrw1;

.field public z:Lf60;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ly82;

    .line 2
    .line 3
    const-class v1, Lg60;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ly82;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lg60;->A:Ly82;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lyw1;Lzq0;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    iput-object v1, p0, Ln6;->u:Ljava/util/Set;

    .line 10
    .line 11
    iput v0, p0, Ln6;->v:I

    .line 12
    .line 13
    iput-object p1, p0, Lg60;->y:Lrw1;

    .line 14
    .line 15
    new-instance p1, Lf60;

    .line 16
    .line 17
    invoke-direct {p1, p0, p2}, Lf60;-><init>(Lg60;Lzq0;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lg60;->z:Lf60;

    .line 21
    .line 22
    sget-object p1, Lgq0;->n:Lgq0;

    .line 23
    .line 24
    iget-object p2, p0, Lg60;->y:Lrw1;

    .line 25
    .line 26
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    iget-object p2, p0, Lg60;->y:Lrw1;

    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    iget-object p0, p0, Lg60;->z:Lf60;

    .line 38
    .line 39
    if-eqz p0, :cond_2

    .line 40
    .line 41
    :try_start_0
    iget-object p1, p0, Lf60;->p:Lgq0;

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Le12;->run()V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :catch_0
    move-exception p1

    .line 51
    iget-object p0, p0, Lf60;->q:Lg60;

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lu0;->m(Ljava/lang/Throwable;)Z

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_0
    new-instance p2, Lk6;

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    invoke-direct {p2, v0, p0, v1}, Lk6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lg60;->y:Lrw1;

    .line 64
    .line 65
    invoke-virtual {v0}, Lrw1;->h()Lo15;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_2

    .line 74
    .line 75
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Lic2;

    .line 80
    .line 81
    invoke-interface {v2}, Ljava/util/concurrent/Future;->isDone()Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_1

    .line 86
    .line 87
    invoke-virtual {p0, v1}, Lg60;->q(Lrw1;)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_1
    invoke-interface {v2, p2, p1}, Lic2;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_2
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lg60;->y:Lrw1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, p0, Lg60;->y:Lrw1;

    .line 5
    .line 6
    iput-object v1, p0, Lg60;->z:Lf60;

    .line 7
    .line 8
    iget-object v1, p0, Lu0;->n:Ljava/lang/Object;

    .line 9
    .line 10
    instance-of v1, v1, Lf0;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v2, 0x0

    .line 17
    :goto_0
    and-int/2addr v1, v2

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0}, Lu0;->p()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    invoke-virtual {v0}, Lrw1;->h()Lo15;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/util/concurrent/Future;

    .line 39
    .line 40
    invoke-interface {v1, p0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    return-void
.end method

.method public final i()V
    .locals 0

    .line 1
    iget-object p0, p0, Lg60;->z:Lf60;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Le12;->c()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final j()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lg60;->y:Lrw1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance p0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "futures="

    .line 8
    .line 9
    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    invoke-super {p0}, Lu0;->j()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final q(Lrw1;)V
    .locals 5

    .line 1
    sget-object v0, Ln6;->w:Lya4;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lya4;->l(Lg60;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-ltz v0, :cond_0

    .line 10
    .line 11
    move v3, v2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v3, v1

    .line 14
    :goto_0
    const-string v4, "Less than 0 remaining futures"

    .line 15
    .line 16
    invoke-static {v4, v3}, Lrr2;->v(Ljava/lang/String;Z)V

    .line 17
    .line 18
    .line 19
    if-nez v0, :cond_5

    .line 20
    .line 21
    if-eqz p1, :cond_3

    .line 22
    .line 23
    invoke-virtual {p1}, Lrw1;->h()Lo15;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/util/concurrent/Future;

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-nez v3, :cond_1

    .line 44
    .line 45
    move v3, v1

    .line 46
    :goto_2
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 47
    .line 48
    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catchall_0
    move-exception v0

    .line 60
    goto :goto_3

    .line 61
    :catch_0
    move-exception v0

    .line 62
    goto :goto_4

    .line 63
    :catchall_1
    move-exception v0

    .line 64
    if-eqz v3, :cond_2

    .line 65
    .line 66
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V

    .line 71
    .line 72
    .line 73
    :cond_2
    throw v0
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    :goto_3
    invoke-virtual {p0, v0}, Lg60;->r(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :goto_4
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {p0, v0}, Lg60;->r(Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :catch_1
    move v3, v2

    .line 87
    goto :goto_2

    .line 88
    :cond_3
    const/4 p1, 0x0

    .line 89
    iput-object p1, p0, Ln6;->u:Ljava/util/Set;

    .line 90
    .line 91
    iget-object v0, p0, Lg60;->z:Lf60;

    .line 92
    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    :try_start_2
    iget-object v1, v0, Lf60;->p:Lgq0;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Le12;->run()V
    :try_end_2
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_2 .. :try_end_2} :catch_2

    .line 101
    .line 102
    .line 103
    goto :goto_5

    .line 104
    :catch_2
    move-exception v1

    .line 105
    iget-object v0, v0, Lf60;->q:Lg60;

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Lu0;->m(Ljava/lang/Throwable;)Z

    .line 108
    .line 109
    .line 110
    :cond_4
    :goto_5
    iput-object p1, p0, Lg60;->y:Lrw1;

    .line 111
    .line 112
    :cond_5
    return-void
.end method

.method public final r(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of p0, p1, Ljava/lang/Error;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    sget-object p0, Lg60;->A:Ly82;

    .line 9
    .line 10
    invoke-virtual {p0}, Ly82;->a()Ljava/util/logging/Logger;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v0, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    .line 15
    .line 16
    const-string v1, "Input Future failed with Error"

    .line 17
    .line 18
    invoke-virtual {p0, v0, v1, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method
