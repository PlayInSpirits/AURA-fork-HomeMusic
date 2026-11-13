.class public final Ldefpackage/gj0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/n9;


# instance fields
.field public final n:Z

.field public final o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:[Ldefpackage/m9;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Ldefpackage/gj0;->n:Z

    .line 6
    .line 7
    const/high16 v0, 0x10000

    .line 8
    .line 9
    iput v0, p0, Ldefpackage/gj0;->o:I

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Ldefpackage/gj0;->r:I

    .line 13
    .line 14
    const/16 v0, 0x64

    .line 15
    .line 16
    new-array v0, v0, [Ldefpackage/m9;

    .line 17
    .line 18
    iput-object v0, p0, Ldefpackage/gj0;->s:[Ldefpackage/m9;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Ldefpackage/ru;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :cond_0
    :goto_0
    if-eqz p1, :cond_2

    .line 3
    .line 4
    :try_start_0
    iget-object v0, p0, Ldefpackage/gj0;->s:[Ldefpackage/m9;

    .line 5
    .line 6
    iget v1, p0, Ldefpackage/gj0;->r:I

    .line 7
    .line 8
    add-int/lit8 v2, v1, 0x1

    .line 9
    .line 10
    iput v2, p0, Ldefpackage/gj0;->r:I

    .line 11
    .line 12
    iget-object v2, p1, Ldefpackage/ru;->p:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, Ldefpackage/m9;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    aput-object v2, v0, v1

    .line 20
    .line 21
    iget v0, p0, Ldefpackage/gj0;->q:I

    .line 22
    .line 23
    add-int/lit8 v0, v0, -0x1

    .line 24
    .line 25
    iput v0, p0, Ldefpackage/gj0;->q:I

    .line 26
    .line 27
    iget-object p1, p1, Ldefpackage/ru;->q:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast p1, Ldefpackage/ru;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iget-object v0, p1, Ldefpackage/ru;->p:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v0, Ldefpackage/m9;

    .line 36
    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    :cond_1
    const/4 p1, 0x0

    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    goto :goto_1

    .line 43
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    monitor-exit p0

    .line 47
    return-void

    .line 48
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    throw p1
.end method

.method public final declared-synchronized b(I)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Ldefpackage/gj0;->p:I

    .line 3
    .line 4
    if-ge p1, v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    iput p1, p0, Ldefpackage/gj0;->p:I

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Ldefpackage/gj0;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    goto :goto_1

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_2

    .line 19
    :cond_1
    :goto_1
    monitor-exit p0

    .line 20
    return-void

    .line 21
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    throw p1
.end method

.method public final declared-synchronized f(Ldefpackage/m9;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ldefpackage/gj0;->s:[Ldefpackage/m9;

    .line 3
    .line 4
    iget v1, p0, Ldefpackage/gj0;->r:I

    .line 5
    .line 6
    add-int/lit8 v2, v1, 0x1

    .line 7
    .line 8
    iput v2, p0, Ldefpackage/gj0;->r:I

    .line 9
    .line 10
    aput-object p1, v0, v1

    .line 11
    .line 12
    iget p1, p0, Ldefpackage/gj0;->q:I

    .line 13
    .line 14
    add-int/lit8 p1, p1, -0x1

    .line 15
    .line 16
    iput p1, p0, Ldefpackage/gj0;->q:I

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    monitor-exit p0

    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw p1
.end method

.method public final declared-synchronized g()Ldefpackage/m9;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Ldefpackage/gj0;->q:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x1

    .line 5
    .line 6
    iput v0, p0, Ldefpackage/gj0;->q:I

    .line 7
    .line 8
    iget v1, p0, Ldefpackage/gj0;->r:I

    .line 9
    .line 10
    if-lez v1, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Ldefpackage/gj0;->s:[Ldefpackage/m9;

    .line 13
    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    iput v1, p0, Ldefpackage/gj0;->r:I

    .line 17
    .line 18
    aget-object v0, v0, v1

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Ldefpackage/gj0;->s:[Ldefpackage/m9;

    .line 24
    .line 25
    iget v2, p0, Ldefpackage/gj0;->r:I

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    aput-object v3, v1, v2

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v0

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    new-instance v1, Ldefpackage/m9;

    .line 34
    .line 35
    iget v2, p0, Ldefpackage/gj0;->o:I

    .line 36
    .line 37
    new-array v2, v2, [B

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-direct {v1, v3, v2}, Ldefpackage/m9;-><init>(I[B)V

    .line 41
    .line 42
    .line 43
    iget-object v2, p0, Ldefpackage/gj0;->s:[Ldefpackage/m9;

    .line 44
    .line 45
    array-length v3, v2

    .line 46
    if-le v0, v3, :cond_1

    .line 47
    .line 48
    array-length v0, v2

    .line 49
    mul-int/lit8 v0, v0, 0x2

    .line 50
    .line 51
    invoke-static {v2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, [Ldefpackage/m9;

    .line 56
    .line 57
    iput-object v0, p0, Ldefpackage/gj0;->s:[Ldefpackage/m9;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    :cond_1
    move-object v0, v1

    .line 60
    :goto_0
    monitor-exit p0

    .line 61
    return-object v0

    .line 62
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    throw v0
.end method

.method public final declared-synchronized h()V
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget v0, p0, Ldefpackage/gj0;->p:I

    .line 3
    .line 4
    iget v1, p0, Ldefpackage/gj0;->o:I

    .line 5
    .line 6
    invoke-static {v0, v1}, Ldefpackage/f35;->g(II)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget v1, p0, Ldefpackage/gj0;->q:I

    .line 11
    .line 12
    sub-int/2addr v0, v1

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget v1, p0, Ldefpackage/gj0;->r:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    if-lt v0, v1, :cond_0

    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :cond_0
    :try_start_1
    iget-object v2, p0, Ldefpackage/gj0;->s:[Ldefpackage/m9;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    invoke-static {v2, v0, v1, v3}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iput v0, p0, Ldefpackage/gj0;->r:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 31
    .line 32
    monitor-exit p0

    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 36
    throw v0
.end method

.method public final m()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/gj0;->o:I

    .line 2
    .line 3
    return p0
.end method
