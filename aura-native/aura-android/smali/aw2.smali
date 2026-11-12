.class public final Law2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final n:Lhw2;


# direct methods
.method public constructor <init>(Lhw2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Law2;->n:Lhw2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b()Ln0;
    .locals 6

    .line 1
    iget-object p0, p0, Law2;->n:Lhw2;

    .line 2
    .line 3
    iget-object v0, p0, Lhw2;->p:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-boolean v1, p0, Lhw2;->t:Z

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    const-string v1, "Retriever is released."

    .line 13
    .line 14
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v1, Llw1;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p0}, Lu0;->m(Ljava/lang/Throwable;)Z

    .line 23
    .line 24
    .line 25
    monitor-exit v0

    .line 26
    return-object v1

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p0}, Lhw2;->b()V

    .line 30
    .line 31
    .line 32
    new-instance v1, Llb4;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Lhw2;->q:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, Lhw2;->r:Llb4;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance v2, Lpz1;

    .line 48
    .line 49
    const/16 v3, 0x8

    .line 50
    .line 51
    invoke-direct {v2, v3, v1}, Lpz1;-><init>(ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    sget-object v3, Lgq0;->n:Lgq0;

    .line 55
    .line 56
    new-instance v4, Llg1;

    .line 57
    .line 58
    const/4 v5, 0x0

    .line 59
    invoke-direct {v4, v5, p0, v2}, Llg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v4, v3}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 63
    .line 64
    .line 65
    monitor-exit v0

    .line 66
    return-object v1

    .line 67
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    throw p0
.end method

.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Law2;->n:Lhw2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lhw2;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
