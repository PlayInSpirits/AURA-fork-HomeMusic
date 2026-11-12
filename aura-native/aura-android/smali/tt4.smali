.class public final Ltt4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwz3;
.implements Lpz3;


# instance fields
.field public final a:Lwz3;

.field public final b:Ljava/lang/Object;

.field public volatile c:Lcf4;

.field public volatile d:Lpz3;

.field public e:I

.field public f:I

.field public g:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lwz3;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    iput v0, p0, Ltt4;->e:I

    .line 6
    .line 7
    iput v0, p0, Ltt4;->f:I

    .line 8
    .line 9
    iput-object p1, p0, Ltt4;->b:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p2, p0, Ltt4;->a:Lwz3;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ltt4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ltt4;->d:Lpz3;

    .line 5
    .line 6
    invoke-interface {v1}, Lpz3;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Ltt4;->c:Lcf4;

    .line 13
    .line 14
    invoke-virtual {p0}, Lcf4;->a()Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 26
    :goto_1
    monitor-exit v0

    .line 27
    return p0

    .line 28
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    throw p0
.end method

.method public final b(Lpz3;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ltt4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ltt4;->c:Lcf4;

    .line 5
    .line 6
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 v1, 0x5

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iput v1, p0, Ltt4;->f:I

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iput v1, p0, Ltt4;->e:I

    .line 20
    .line 21
    iget-object p1, p0, Ltt4;->a:Lwz3;

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-interface {p1, p0}, Lwz3;->b(Lpz3;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    monitor-exit v0

    .line 29
    return-void

    .line 30
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    throw p0
.end method

.method public final c()V
    .locals 3

    .line 1
    iget-object v0, p0, Ltt4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget v1, p0, Ltt4;->f:I

    .line 5
    .line 6
    invoke-static {v1}, Lb11;->c(I)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x2

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    iput v2, p0, Ltt4;->f:I

    .line 14
    .line 15
    iget-object v1, p0, Ltt4;->d:Lpz3;

    .line 16
    .line 17
    invoke-interface {v1}, Lpz3;->c()V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    iget v1, p0, Ltt4;->e:I

    .line 24
    .line 25
    invoke-static {v1}, Lb11;->c(I)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    iput v2, p0, Ltt4;->e:I

    .line 32
    .line 33
    iget-object p0, p0, Ltt4;->c:Lcf4;

    .line 34
    .line 35
    invoke-virtual {p0}, Lcf4;->c()V

    .line 36
    .line 37
    .line 38
    :cond_1
    monitor-exit v0

    .line 39
    return-void

    .line 40
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    throw p0
.end method

.method public final clear()V
    .locals 2

    .line 1
    iget-object v0, p0, Ltt4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iput-boolean v1, p0, Ltt4;->g:Z

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    iput v1, p0, Ltt4;->e:I

    .line 9
    .line 10
    iput v1, p0, Ltt4;->f:I

    .line 11
    .line 12
    iget-object v1, p0, Ltt4;->d:Lpz3;

    .line 13
    .line 14
    invoke-interface {v1}, Lpz3;->clear()V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Ltt4;->c:Lcf4;

    .line 18
    .line 19
    invoke-virtual {p0}, Lcf4;->clear()V

    .line 20
    .line 21
    .line 22
    monitor-exit v0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw p0
.end method

.method public final d()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ltt4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget p0, p0, Ltt4;->e:I

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    if-ne p0, v1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    :goto_0
    monitor-exit v0

    .line 13
    return p0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p0
.end method

.method public final e(Lpz3;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Ltt4;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p1, Ltt4;

    .line 6
    .line 7
    iget-object v0, p0, Ltt4;->c:Lcf4;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p1, Ltt4;->c:Lcf4;

    .line 12
    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, Ltt4;->c:Lcf4;

    .line 17
    .line 18
    iget-object v1, p1, Ltt4;->c:Lcf4;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcf4;->e(Lpz3;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    :goto_0
    iget-object v0, p0, Ltt4;->d:Lpz3;

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    iget-object p0, p1, Ltt4;->d:Lpz3;

    .line 31
    .line 32
    if-nez p0, :cond_2

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object p0, p0, Ltt4;->d:Lpz3;

    .line 36
    .line 37
    iget-object p1, p1, Ltt4;->d:Lpz3;

    .line 38
    .line 39
    invoke-interface {p0, p1}, Lpz3;->e(Lpz3;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_2

    .line 44
    .line 45
    :goto_1
    const/4 p0, 0x1

    .line 46
    return p0

    .line 47
    :cond_2
    const/4 p0, 0x0

    .line 48
    return p0
.end method

.method public final f(Lpz3;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ltt4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ltt4;->d:Lpz3;

    .line 5
    .line 6
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const/4 v1, 0x4

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iput v1, p0, Ltt4;->f:I

    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iput v1, p0, Ltt4;->e:I

    .line 20
    .line 21
    iget-object p1, p0, Ltt4;->a:Lwz3;

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-interface {p1, p0}, Lwz3;->f(Lpz3;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget p1, p0, Ltt4;->f:I

    .line 29
    .line 30
    invoke-static {p1}, Lb11;->c(I)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-nez p1, :cond_2

    .line 35
    .line 36
    iget-object p0, p0, Ltt4;->d:Lpz3;

    .line 37
    .line 38
    invoke-interface {p0}, Lpz3;->clear()V

    .line 39
    .line 40
    .line 41
    :cond_2
    monitor-exit v0

    .line 42
    return-void

    .line 43
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    throw p0
.end method

.method public final g(Lpz3;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Ltt4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ltt4;->a:Lwz3;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-interface {v1, p0}, Lwz3;->g(Lpz3;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, Ltt4;->c:Lcf4;

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    iget p0, p0, Ltt4;->e:I

    .line 23
    .line 24
    const/4 p1, 0x2

    .line 25
    if-eq p0, p1, :cond_1

    .line 26
    .line 27
    const/4 p0, 0x1

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception p0

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const/4 p0, 0x0

    .line 32
    :goto_0
    monitor-exit v0

    .line 33
    return p0

    .line 34
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    throw p0
.end method

.method public final getRoot()Lwz3;
    .locals 2

    .line 1
    iget-object v0, p0, Ltt4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ltt4;->a:Lwz3;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-interface {v1}, Lwz3;->getRoot()Lwz3;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    :goto_0
    monitor-exit v0

    .line 16
    return-object p0

    .line 17
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw p0
.end method

.method public final h(Lpz3;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Ltt4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ltt4;->a:Lwz3;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-interface {v1, p0}, Lwz3;->h(Lpz3;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, Ltt4;->c:Lcf4;

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Ltt4;->a()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_1

    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/4 p0, 0x0

    .line 33
    :goto_0
    monitor-exit v0

    .line 34
    return p0

    .line 35
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    throw p0
.end method

.method public final i(Lpz3;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Ltt4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Ltt4;->a:Lwz3;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-interface {v1, p0}, Lwz3;->i(Lpz3;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    :cond_0
    iget-object v1, p0, Ltt4;->c:Lcf4;

    .line 15
    .line 16
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_2

    .line 21
    .line 22
    iget p0, p0, Ltt4;->e:I

    .line 23
    .line 24
    const/4 p1, 0x4

    .line 25
    if-eq p0, p1, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_2

    .line 32
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 33
    :goto_1
    monitor-exit v0

    .line 34
    return p0

    .line 35
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    throw p0
.end method

.method public final isRunning()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ltt4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget p0, p0, Ltt4;->e:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-ne p0, v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    monitor-exit v0

    .line 12
    return v1

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw p0
.end method

.method public final j()Z
    .locals 2

    .line 1
    iget-object v0, p0, Ltt4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget p0, p0, Ltt4;->e:I

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    if-ne p0, v1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    :goto_0
    monitor-exit v0

    .line 13
    return p0

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    throw p0
.end method

.method public final k()V
    .locals 5

    .line 1
    iget-object v0, p0, Ltt4;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Ltt4;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    :try_start_1
    iget v3, p0, Ltt4;->e:I

    .line 9
    .line 10
    const/4 v4, 0x4

    .line 11
    if-eq v3, v4, :cond_0

    .line 12
    .line 13
    iget v3, p0, Ltt4;->f:I

    .line 14
    .line 15
    if-eq v3, v1, :cond_0

    .line 16
    .line 17
    iput v1, p0, Ltt4;->f:I

    .line 18
    .line 19
    iget-object v3, p0, Ltt4;->d:Lpz3;

    .line 20
    .line 21
    invoke-interface {v3}, Lpz3;->k()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v1

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    :goto_0
    iget-boolean v3, p0, Ltt4;->g:Z

    .line 28
    .line 29
    if-eqz v3, :cond_1

    .line 30
    .line 31
    iget v3, p0, Ltt4;->e:I

    .line 32
    .line 33
    if-eq v3, v1, :cond_1

    .line 34
    .line 35
    iput v1, p0, Ltt4;->e:I

    .line 36
    .line 37
    iget-object v1, p0, Ltt4;->c:Lcf4;

    .line 38
    .line 39
    invoke-virtual {v1}, Lcf4;->k()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    .line 41
    .line 42
    :cond_1
    :try_start_2
    iput-boolean v2, p0, Ltt4;->g:Z

    .line 43
    .line 44
    monitor-exit v0

    .line 45
    return-void

    .line 46
    :catchall_1
    move-exception p0

    .line 47
    goto :goto_2

    .line 48
    :goto_1
    iput-boolean v2, p0, Ltt4;->g:Z

    .line 49
    .line 50
    throw v1

    .line 51
    :goto_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    throw p0
.end method
