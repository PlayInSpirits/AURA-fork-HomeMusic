.class public final Lhw2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final n:Lgn2;

.field public final o:Ldm0;

.field public final p:Ljava/lang/Object;

.field public final q:Ljava/util/ArrayList;

.field public r:Llb4;

.field public s:Lfw2;

.field public t:Z


# direct methods
.method public constructor <init>(Lgn2;Ldm0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhw2;->n:Lgn2;

    .line 5
    .line 6
    iput-object p2, p0, Lhw2;->o:Ldm0;

    .line 7
    .line 8
    new-instance p1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lhw2;->p:Ljava/lang/Object;

    .line 14
    .line 15
    new-instance p1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lhw2;->q:Ljava/util/ArrayList;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 5

    .line 1
    iget-object v0, p0, Lhw2;->r:Llb4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Llb4;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lhw2;->r:Llb4;

    .line 11
    .line 12
    new-instance v0, Lfw2;

    .line 13
    .line 14
    iget-object v1, p0, Lhw2;->o:Ldm0;

    .line 15
    .line 16
    iget-object v2, p0, Lhw2;->n:Lgn2;

    .line 17
    .line 18
    new-instance v3, Lbw2;

    .line 19
    .line 20
    invoke-direct {v3, p0}, Lbw2;-><init>(Lhw2;)V

    .line 21
    .line 22
    .line 23
    new-instance v4, Lbw2;

    .line 24
    .line 25
    invoke-direct {v4, p0}, Lbw2;-><init>(Lhw2;)V

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1, v2, v3, v4}, Lfw2;-><init>(Ldm0;Lgn2;Lbw2;Lbw2;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lhw2;->s:Lfw2;

    .line 32
    .line 33
    sget-object p0, Lfw2;->g:Lgw2;

    .line 34
    .line 35
    monitor-enter p0

    .line 36
    :try_start_0
    iget-object v1, p0, Lgw2;->a:Ljava/util/ArrayDeque;

    .line 37
    .line 38
    invoke-virtual {v1, v0}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lgw2;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    monitor-exit p0

    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    throw v0

    .line 49
    :cond_0
    return-void
.end method

.method public final close()V
    .locals 5

    .line 1
    iget-object v0, p0, Lhw2;->p:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lhw2;->t:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-void

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x1

    .line 13
    iput-boolean v1, p0, Lhw2;->t:Z

    .line 14
    .line 15
    iget-object v2, p0, Lhw2;->q:Ljava/util/ArrayList;

    .line 16
    .line 17
    sget-object v3, Lyw1;->o:Lvw1;

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, Lyw1;->k(Ljava/util/Collection;)Lyw1;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    new-instance v3, Lqa1;

    .line 27
    .line 28
    const/16 v4, 0x16

    .line 29
    .line 30
    invoke-direct {v3, v4, p0}, Lqa1;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    new-instance p0, Lzq0;

    .line 34
    .line 35
    invoke-direct {p0, v1, v3}, Lzq0;-><init>(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    new-instance v1, Lg60;

    .line 39
    .line 40
    invoke-direct {v1, v2, p0}, Lg60;-><init>(Lyw1;Lzq0;)V

    .line 41
    .line 42
    .line 43
    monitor-exit v0

    .line 44
    return-void

    .line 45
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    throw p0
.end method
