.class public final Lm11;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lr51;


# static fields
.field public static final J:Lom0;


# instance fields
.field public A:Z

.field public B:Lq04;

.field public C:I

.field public D:Z

.field public E:Lcom/bumptech/glide/load/engine/GlideException;

.field public F:Z

.field public G:Lo11;

.field public H:Lxi0;

.field public volatile I:Z

.field public final n:Ll11;

.field public final o:Lul4;

.field public final p:Li11;

.field public final q:Lio3;

.field public final r:Lom0;

.field public final s:Li11;

.field public final t:Lli1;

.field public final u:Lli1;

.field public final v:Lli1;

.field public final w:Ljava/util/concurrent/atomic/AtomicInteger;

.field public x:Ln11;

.field public y:Z

.field public z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lom0;

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lom0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lm11;->J:Lom0;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lli1;Lli1;Lli1;Lli1;Li11;Li11;Li61;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p3, Ll11;

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p3, v0}, Ll11;-><init>(Ljava/util/ArrayList;)V

    .line 13
    .line 14
    .line 15
    iput-object p3, p0, Lm11;->n:Ll11;

    .line 16
    .line 17
    new-instance p3, Lul4;

    .line 18
    .line 19
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p3, p0, Lm11;->o:Lul4;

    .line 23
    .line 24
    new-instance p3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 25
    .line 26
    invoke-direct {p3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p3, p0, Lm11;->w:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 30
    .line 31
    iput-object p1, p0, Lm11;->t:Lli1;

    .line 32
    .line 33
    iput-object p2, p0, Lm11;->u:Lli1;

    .line 34
    .line 35
    iput-object p4, p0, Lm11;->v:Lli1;

    .line 36
    .line 37
    iput-object p5, p0, Lm11;->s:Li11;

    .line 38
    .line 39
    iput-object p6, p0, Lm11;->p:Li11;

    .line 40
    .line 41
    iput-object p7, p0, Lm11;->q:Lio3;

    .line 42
    .line 43
    sget-object p1, Lm11;->J:Lom0;

    .line 44
    .line 45
    iput-object p1, p0, Lm11;->r:Lom0;

    .line 46
    .line 47
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Lcf4;Ljava/util/concurrent/Executor;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lm11;->o:Lul4;

    .line 3
    .line 4
    invoke-virtual {v0}, Lul4;->a()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lm11;->n:Ll11;

    .line 8
    .line 9
    iget-object v0, v0, Ll11;->n:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v1, Lk11;

    .line 12
    .line 13
    invoke-direct {v1, p1, p2}, Lk11;-><init>(Lcf4;Ljava/util/concurrent/Executor;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    iget-boolean v0, p0, Lm11;->D:Z

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Lm11;->d(I)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Lj11;

    .line 28
    .line 29
    invoke-direct {v0, p0, p1, v1}, Lj11;-><init>(Lm11;Lcf4;I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p1

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    iget-boolean v0, p0, Lm11;->F:Z

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    invoke-virtual {p0, v1}, Lm11;->d(I)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Lj11;

    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-direct {v0, p0, p1, v1}, Lj11;-><init>(Lm11;Lcf4;I)V

    .line 49
    .line 50
    .line 51
    invoke-interface {p2, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    iget-boolean p1, p0, Lm11;->I:Z

    .line 56
    .line 57
    xor-int/2addr p1, v1

    .line 58
    const-string p2, "Cannot add callbacks to a cancelled EngineJob"

    .line 59
    .line 60
    invoke-static {p2, p1}, Lh12;->d(Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    .line 63
    :goto_0
    monitor-exit p0

    .line 64
    return-void

    .line 65
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    throw p1
.end method

.method public final b()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lm11;->o:Lul4;

    .line 3
    .line 4
    invoke-virtual {v0}, Lul4;->a()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lm11;->e()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const-string v1, "Not yet complete!"

    .line 12
    .line 13
    invoke-static {v1, v0}, Lh12;->d(Ljava/lang/String;Z)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lm11;->w:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-ltz v0, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v1, 0x0

    .line 27
    :goto_0
    const-string v2, "Can\'t decrement below 0"

    .line 28
    .line 29
    invoke-static {v2, v1}, Lh12;->d(Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    iget-object v0, p0, Lm11;->G:Lo11;

    .line 35
    .line 36
    invoke-virtual {p0}, Lm11;->f()V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    goto :goto_2

    .line 42
    :cond_1
    const/4 v0, 0x0

    .line 43
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0}, Lo11;->c()V

    .line 47
    .line 48
    .line 49
    :cond_2
    return-void

    .line 50
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    throw v0
.end method

.method public final c()Lul4;
    .locals 0

    .line 1
    iget-object p0, p0, Lm11;->o:Lul4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final declared-synchronized d(I)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p0}, Lm11;->e()Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    const-string v1, "Not yet complete!"

    .line 7
    .line 8
    invoke-static {v1, v0}, Lh12;->d(Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lm11;->w:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndAdd(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lm11;->G:Lo11;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Lo11;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    monitor-exit p0

    .line 30
    return-void

    .line 31
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw p1
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm11;->F:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Lm11;->D:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean p0, p0, Lm11;->I:Z

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public final declared-synchronized f()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lm11;->x:Ln11;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lm11;->n:Ll11;

    .line 7
    .line 8
    iget-object v0, v0, Ll11;->n:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lm11;->x:Ln11;

    .line 15
    .line 16
    iput-object v0, p0, Lm11;->G:Lo11;

    .line 17
    .line 18
    iput-object v0, p0, Lm11;->B:Lq04;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    iput-boolean v1, p0, Lm11;->F:Z

    .line 22
    .line 23
    iput-boolean v1, p0, Lm11;->I:Z

    .line 24
    .line 25
    iput-boolean v1, p0, Lm11;->D:Z

    .line 26
    .line 27
    iget-object v2, p0, Lm11;->H:Lxi0;

    .line 28
    .line 29
    iget-object v3, v2, Lxi0;->t:Lyl;

    .line 30
    .line 31
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    const/4 v4, 0x1

    .line 33
    :try_start_1
    iput-boolean v4, v3, Lyl;->a:Z

    .line 34
    .line 35
    invoke-virtual {v3}, Lyl;->b()Z

    .line 36
    .line 37
    .line 38
    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 39
    :try_start_2
    monitor-exit v3

    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    invoke-virtual {v2}, Lxi0;->k()V

    .line 43
    .line 44
    .line 45
    :cond_0
    iput-object v0, p0, Lm11;->H:Lxi0;

    .line 46
    .line 47
    iput-object v0, p0, Lm11;->E:Lcom/bumptech/glide/load/engine/GlideException;

    .line 48
    .line 49
    iput v1, p0, Lm11;->C:I

    .line 50
    .line 51
    iget-object v0, p0, Lm11;->q:Lio3;

    .line 52
    .line 53
    invoke-interface {v0, p0}, Lio3;->a(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 54
    .line 55
    .line 56
    monitor-exit p0

    .line 57
    return-void

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    goto :goto_0

    .line 60
    :catchall_1
    move-exception v0

    .line 61
    :try_start_3
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 62
    :try_start_4
    throw v0

    .line 63
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 64
    .line 65
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :goto_0
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 70
    throw v0
.end method

.method public final declared-synchronized g(Lcf4;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lm11;->o:Lul4;

    .line 3
    .line 4
    invoke-virtual {v0}, Lul4;->a()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lm11;->n:Ll11;

    .line 8
    .line 9
    iget-object v0, v0, Ll11;->n:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v1, Lk11;

    .line 12
    .line 13
    sget-object v2, Lfh0;->h:Lof;

    .line 14
    .line 15
    invoke-direct {v1, p1, v2}, Lk11;-><init>(Lcf4;Ljava/util/concurrent/Executor;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lm11;->n:Ll11;

    .line 22
    .line 23
    iget-object p1, p1, Ll11;->n:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_5

    .line 30
    .line 31
    invoke-virtual {p0}, Lm11;->e()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_0
    const/4 p1, 0x1

    .line 39
    iput-boolean p1, p0, Lm11;->I:Z

    .line 40
    .line 41
    iget-object v0, p0, Lm11;->H:Lxi0;

    .line 42
    .line 43
    iput-boolean p1, v0, Lxi0;->O:Z

    .line 44
    .line 45
    iget-object p1, v0, Lxi0;->M:Luh0;

    .line 46
    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    invoke-interface {p1}, Luh0;->cancel()V

    .line 50
    .line 51
    .line 52
    :cond_1
    iget-object p1, p0, Lm11;->s:Li11;

    .line 53
    .line 54
    iget-object v0, p0, Lm11;->x:Ln11;

    .line 55
    .line 56
    monitor-enter p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    :try_start_1
    iget-object v1, p1, Li11;->a:Lgp3;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-boolean v2, p0, Lm11;->A:Z

    .line 63
    .line 64
    if-eqz v2, :cond_2

    .line 65
    .line 66
    iget-object v1, v1, Lgp3;->p:Ljava/lang/Object;

    .line 67
    .line 68
    :goto_0
    check-cast v1, Ljava/util/HashMap;

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    iget-object v1, v1, Lgp3;->o:Ljava/lang/Object;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :goto_1
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    if-eq p0, v2, :cond_3

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 82
    .line 83
    .line 84
    :goto_2
    :try_start_2
    monitor-exit p1

    .line 85
    :goto_3
    iget-boolean p1, p0, Lm11;->D:Z

    .line 86
    .line 87
    if-nez p1, :cond_4

    .line 88
    .line 89
    iget-boolean p1, p0, Lm11;->F:Z

    .line 90
    .line 91
    if-eqz p1, :cond_5

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :catchall_0
    move-exception p1

    .line 95
    goto :goto_6

    .line 96
    :cond_4
    :goto_4
    iget-object p1, p0, Lm11;->w:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-nez p1, :cond_5

    .line 103
    .line 104
    invoke-virtual {p0}, Lm11;->f()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 105
    .line 106
    .line 107
    goto :goto_5

    .line 108
    :catchall_1
    move-exception v0

    .line 109
    :try_start_3
    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 110
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 111
    :cond_5
    :goto_5
    monitor-exit p0

    .line 112
    return-void

    .line 113
    :goto_6
    :try_start_5
    monitor-exit p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 114
    throw p1
.end method
