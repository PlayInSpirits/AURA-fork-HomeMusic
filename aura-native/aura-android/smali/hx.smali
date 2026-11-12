.class public final Lhx;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# instance fields
.field public final n:Ljr0;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 3

    .line 1
    sget-object v0, Lb71;->a:Ls32;

    .line 2
    .line 3
    sget-object v1, Lge3;->o:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {p1}, Ltv1;->A(Ljava/io/File;)Lge3;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    sget-object v1, Lgr4;->l:Lgr4;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v2, Ljr0;

    .line 21
    .line 22
    invoke-direct {v2, v0, p1, v1}, Ljr0;-><init>(Lb71;Lge3;Lgr4;)V

    .line 23
    .line 24
    .line 25
    iput-object v2, p0, Lhx;->n:Ljr0;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final b(Loz3;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lhx;->n:Ljr0;

    .line 5
    .line 6
    iget-object p1, p1, Loz3;->a:Lgr1;

    .line 7
    .line 8
    invoke-static {p1}, Lsi0;->D(Lgr1;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    monitor-enter p0

    .line 13
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Ljr0;->q()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ljr0;->b()V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Ljr0;->R(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Ljr0;->v:Ljava/util/LinkedHashMap;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Ldr0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    monitor-exit p0

    .line 36
    return-void

    .line 37
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1}, Ljr0;->K(Ldr0;)V

    .line 38
    .line 39
    .line 40
    iget-wide v0, p0, Ljr0;->t:J

    .line 41
    .line 42
    iget-wide v2, p0, Ljr0;->p:J

    .line 43
    .line 44
    cmp-long p1, v0, v2

    .line 45
    .line 46
    if-gtz p1, :cond_1

    .line 47
    .line 48
    const/4 p1, 0x0

    .line 49
    iput-boolean p1, p0, Ljr0;->B:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto :goto_1

    .line 54
    :cond_1
    :goto_0
    monitor-exit p0

    .line 55
    return-void

    .line 56
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 57
    throw p1
.end method

.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lhx;->n:Ljr0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljr0;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final flush()V
    .locals 0

    .line 1
    iget-object p0, p0, Lhx;->n:Ljr0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljr0;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
