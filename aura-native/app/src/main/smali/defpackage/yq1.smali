.class public final Ldefpackage/yq1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:I

.field public final b:Ldefpackage/rq1;

.field public final c:Ldefpackage/os;

.field public d:J

.field public e:J

.field public final f:Ljava/util/ArrayDeque;

.field public g:Z

.field public final h:Ldefpackage/wq1;

.field public final i:Ldefpackage/vq1;

.field public final j:Ldefpackage/xq1;

.field public final k:Ldefpackage/xq1;

.field public l:Ldefpackage/b21;

.field public m:Ljava/io/IOException;


# direct methods
.method public constructor <init>(ILdefpackage/rq1;ZZLdefpackage/tl1;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Ldefpackage/yq1;->a:I

    .line 8
    .line 9
    iput-object p2, p0, Ldefpackage/yq1;->b:Ldefpackage/rq1;

    .line 10
    .line 11
    new-instance v0, Ldefpackage/os;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Ldefpackage/os;-><init>(I)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Ldefpackage/yq1;->c:Ldefpackage/os;

    .line 17
    .line 18
    iget-object p1, p2, Ldefpackage/rq1;->E:Ldefpackage/pb4;

    .line 19
    .line 20
    invoke-virtual {p1}, Ldefpackage/pb4;->a()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    int-to-long v0, p1

    .line 25
    iput-wide v0, p0, Ldefpackage/yq1;->e:J

    .line 26
    .line 27
    new-instance p1, Ljava/util/ArrayDeque;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Ldefpackage/yq1;->f:Ljava/util/ArrayDeque;

    .line 33
    .line 34
    new-instance v0, Ldefpackage/wq1;

    .line 35
    .line 36
    iget-object p2, p2, Ldefpackage/rq1;->D:Ldefpackage/pb4;

    .line 37
    .line 38
    invoke-virtual {p2}, Ldefpackage/pb4;->a()I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    int-to-long v1, p2

    .line 43
    invoke-direct {v0, p0, v1, v2, p4}, Ldefpackage/wq1;-><init>(Ldefpackage/yq1;JZ)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, Ldefpackage/yq1;->h:Ldefpackage/wq1;

    .line 47
    .line 48
    new-instance p2, Ldefpackage/vq1;

    .line 49
    .line 50
    invoke-direct {p2, p0, p3}, Ldefpackage/vq1;-><init>(Ldefpackage/yq1;Z)V

    .line 51
    .line 52
    .line 53
    iput-object p2, p0, Ldefpackage/yq1;->i:Ldefpackage/vq1;

    .line 54
    .line 55
    new-instance p2, Ldefpackage/xq1;

    .line 56
    .line 57
    invoke-direct {p2, p0}, Ldefpackage/xq1;-><init>(Ldefpackage/yq1;)V

    .line 58
    .line 59
    .line 60
    iput-object p2, p0, Ldefpackage/yq1;->j:Ldefpackage/xq1;

    .line 61
    .line 62
    new-instance p2, Ldefpackage/xq1;

    .line 63
    .line 64
    invoke-direct {p2, p0}, Ldefpackage/xq1;-><init>(Ldefpackage/yq1;)V

    .line 65
    .line 66
    .line 67
    iput-object p2, p0, Ldefpackage/yq1;->k:Ldefpackage/xq1;

    .line 68
    .line 69
    const/4 p2, 0x0

    .line 70
    if-eqz p5, :cond_1

    .line 71
    .line 72
    invoke-virtual {p0}, Ldefpackage/yq1;->g()Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-nez p0, :cond_0

    .line 77
    .line 78
    invoke-virtual {p1, p5}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_0
    const-string p0, "locally-initiated streams shouldn\'t have headers yet"

    .line 83
    .line 84
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p2

    .line 88
    :cond_1
    invoke-virtual {p0}, Ldefpackage/yq1;->g()Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    if-eqz p0, :cond_2

    .line 93
    .line 94
    return-void

    .line 95
    :cond_2
    const-string p0, "remotely-initiated streams should have headers"

    .line 96
    .line 97
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p2
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    sget-object v0, Ldefpackage/ze5;->a:Ldefpackage/tl1;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v0, p0, Ldefpackage/yq1;->h:Ldefpackage/wq1;

    .line 5
    .line 6
    iget-boolean v1, v0, Ldefpackage/wq1;->o:Z

    .line 7
    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    iget-boolean v0, v0, Ldefpackage/wq1;->s:Z

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Ldefpackage/yq1;->i:Ldefpackage/vq1;

    .line 15
    .line 16
    iget-boolean v1, v0, Ldefpackage/vq1;->n:Z

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    iget-boolean v0, v0, Ldefpackage/vq1;->p:Z

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto :goto_2

    .line 27
    :cond_0
    :goto_0
    const/4 v0, 0x1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/4 v0, 0x0

    .line 30
    :goto_1
    invoke-virtual {p0}, Ldefpackage/yq1;->h()Z

    .line 31
    .line 32
    .line 33
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    monitor-exit p0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    sget-object v0, Ldefpackage/b21;->u:Ldefpackage/b21;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-virtual {p0, v0, v1}, Ldefpackage/yq1;->c(Ldefpackage/b21;Ljava/io/IOException;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    if-nez v1, :cond_3

    .line 45
    .line 46
    iget-object v0, p0, Ldefpackage/yq1;->b:Ldefpackage/rq1;

    .line 47
    .line 48
    iget p0, p0, Ldefpackage/yq1;->a:I

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ldefpackage/rq1;->n(I)Ldefpackage/yq1;

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void

    .line 54
    :goto_2
    monitor-exit p0

    .line 55
    throw v0
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/yq1;->i:Ldefpackage/vq1;

    .line 2
    .line 3
    iget-boolean v1, v0, Ldefpackage/vq1;->p:Z

    .line 4
    .line 5
    if-nez v1, :cond_3

    .line 6
    .line 7
    iget-boolean v0, v0, Ldefpackage/vq1;->n:Z

    .line 8
    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, Ldefpackage/yq1;->l:Ldefpackage/b21;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object p0, p0, Ldefpackage/yq1;->m:Ljava/io/IOException;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p0, Lokhttp3/internal/http2/StreamResetException;

    .line 21
    .line 22
    invoke-direct {p0, v0}, Lokhttp3/internal/http2/StreamResetException;-><init>(Ldefpackage/b21;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    throw p0

    .line 26
    :cond_1
    return-void

    .line 27
    :cond_2
    const-string p0, "stream finished"

    .line 28
    .line 29
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_3
    const-string p0, "stream closed"

    .line 34
    .line 35
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final c(Ldefpackage/b21;Ljava/io/IOException;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ldefpackage/yq1;->d(Ldefpackage/b21;Ljava/io/IOException;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object p2, p0, Ldefpackage/yq1;->b:Ldefpackage/rq1;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object p2, p2, Ldefpackage/rq1;->J:Ldefpackage/zq1;

    .line 14
    .line 15
    iget p0, p0, Ldefpackage/yq1;->a:I

    .line 16
    .line 17
    invoke-virtual {p2, p0, p1}, Ldefpackage/zq1;->u(ILdefpackage/b21;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final d(Ldefpackage/b21;Ljava/io/IOException;)Z
    .locals 2

    .line 1
    sget-object v0, Ldefpackage/ze5;->a:Ldefpackage/tl1;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    iget-object v0, p0, Ldefpackage/yq1;->l:Ldefpackage/b21;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    monitor-exit p0

    .line 10
    return v1

    .line 11
    :cond_0
    :try_start_1
    iput-object p1, p0, Ldefpackage/yq1;->l:Ldefpackage/b21;

    .line 12
    .line 13
    iput-object p2, p0, Ldefpackage/yq1;->m:Ljava/io/IOException;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Ldefpackage/yq1;->h:Ldefpackage/wq1;

    .line 19
    .line 20
    iget-boolean p1, p1, Ldefpackage/wq1;->o:Z

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, Ldefpackage/yq1;->i:Ldefpackage/vq1;

    .line 25
    .line 26
    iget-boolean p1, p1, Ldefpackage/vq1;->n:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    monitor-exit p0

    .line 31
    return v1

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    monitor-exit p0

    .line 35
    iget-object p1, p0, Ldefpackage/yq1;->b:Ldefpackage/rq1;

    .line 36
    .line 37
    iget p0, p0, Ldefpackage/yq1;->a:I

    .line 38
    .line 39
    invoke-virtual {p1, p0}, Ldefpackage/rq1;->n(I)Ldefpackage/yq1;

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x1

    .line 43
    return p0

    .line 44
    :goto_0
    monitor-exit p0

    .line 45
    throw p1
.end method

.method public final e(Ldefpackage/b21;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Ldefpackage/yq1;->d(Ldefpackage/b21;Ljava/io/IOException;)Z

    .line 3
    .line 4
    .line 5
    move-result v0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Ldefpackage/yq1;->b:Ldefpackage/rq1;

    .line 10
    .line 11
    iget p0, p0, Ldefpackage/yq1;->a:I

    .line 12
    .line 13
    invoke-virtual {v0, p0, p1}, Ldefpackage/rq1;->v(ILdefpackage/b21;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final f()Ldefpackage/vq1;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Ldefpackage/yq1;->g:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {p0}, Ldefpackage/yq1;->g()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const-string v0, "reply before requesting the sink"

    .line 14
    .line 15
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    monitor-exit p0

    .line 24
    iget-object p0, p0, Ldefpackage/yq1;->i:Ldefpackage/vq1;

    .line 25
    .line 26
    return-object p0

    .line 27
    :goto_1
    monitor-exit p0

    .line 28
    throw v0
.end method

.method public final g()Z
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/yq1;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    move v0, v1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v2

    .line 11
    :goto_0
    iget-object p0, p0, Ldefpackage/yq1;->b:Ldefpackage/rq1;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    if-ne v1, v0, :cond_1

    .line 17
    .line 18
    return v1

    .line 19
    :cond_1
    return v2
.end method

.method public final declared-synchronized h()Z
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ldefpackage/yq1;->l:Ldefpackage/b21;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return v1

    .line 9
    :cond_0
    :try_start_1
    iget-object v0, p0, Ldefpackage/yq1;->h:Ldefpackage/wq1;

    .line 10
    .line 11
    iget-boolean v2, v0, Ldefpackage/wq1;->o:Z

    .line 12
    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    iget-boolean v0, v0, Ldefpackage/wq1;->s:Z

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :goto_0
    iget-object v0, p0, Ldefpackage/yq1;->i:Ldefpackage/vq1;

    .line 23
    .line 24
    iget-boolean v2, v0, Ldefpackage/vq1;->n:Z

    .line 25
    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    iget-boolean v0, v0, Ldefpackage/vq1;->p:Z

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    :cond_2
    iget-boolean v0, p0, Ldefpackage/yq1;->g:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    monitor-exit p0

    .line 37
    return v1

    .line 38
    :cond_3
    monitor-exit p0

    .line 39
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 42
    throw v0
.end method

.method public final i(Ldefpackage/tl1;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ldefpackage/ze5;->a:Ldefpackage/tl1;

    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-boolean v0, p0, Ldefpackage/yq1;->g:Z

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const-string v0, ":status"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ldefpackage/tl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    const-string v0, ":method"

    .line 21
    .line 22
    invoke-virtual {p1, v0}, Ldefpackage/tl1;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, p0, Ldefpackage/yq1;->h:Ldefpackage/wq1;

    .line 30
    .line 31
    iput-object p1, v0, Ldefpackage/wq1;->r:Ldefpackage/tl1;

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :catchall_0
    move-exception p1

    .line 35
    goto :goto_2

    .line 36
    :cond_1
    :goto_0
    iput-boolean v1, p0, Ldefpackage/yq1;->g:Z

    .line 37
    .line 38
    iget-object v0, p0, Ldefpackage/yq1;->f:Ljava/util/ArrayDeque;

    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :goto_1
    if-eqz p2, :cond_2

    .line 44
    .line 45
    iget-object p1, p0, Ldefpackage/yq1;->h:Ldefpackage/wq1;

    .line 46
    .line 47
    iput-boolean v1, p1, Ldefpackage/wq1;->o:Z

    .line 48
    .line 49
    :cond_2
    invoke-virtual {p0}, Ldefpackage/yq1;->h()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    monitor-exit p0

    .line 57
    if-nez p1, :cond_3

    .line 58
    .line 59
    iget-object p1, p0, Ldefpackage/yq1;->b:Ldefpackage/rq1;

    .line 60
    .line 61
    iget p0, p0, Ldefpackage/yq1;->a:I

    .line 62
    .line 63
    invoke-virtual {p1, p0}, Ldefpackage/rq1;->n(I)Ldefpackage/yq1;

    .line 64
    .line 65
    .line 66
    :cond_3
    return-void

    .line 67
    :goto_2
    monitor-exit p0

    .line 68
    throw p1
.end method
