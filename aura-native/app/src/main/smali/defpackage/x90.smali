.class public final Ldefpackage/x90;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/q34;
.implements Ldefpackage/q21;


# instance fields
.field public final a:Ldefpackage/gr4;

.field public final b:Ldefpackage/dv3;

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:Z

.field public final h:Ldefpackage/hy;

.field public final i:Ldefpackage/gv3;

.field public final j:Ldefpackage/o34;

.field public final k:Ljava/util/List;

.field public final l:Ldefpackage/oz3;

.field public final m:I

.field public final n:Z

.field public volatile o:Z

.field public p:Ljava/net/Socket;

.field public q:Ljava/net/Socket;

.field public r:Ldefpackage/jl1;

.field public s:Ldefpackage/pr3;

.field public t:Ldefpackage/xu3;

.field public u:Ldefpackage/wu3;

.field public v:Ldefpackage/cv3;


# direct methods
.method public constructor <init>(Ldefpackage/gr4;Ldefpackage/dv3;IIIIZLdefpackage/hy;Ldefpackage/gv3;Ldefpackage/o34;Ljava/util/List;Ldefpackage/oz3;IZ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Ldefpackage/x90;->a:Ldefpackage/gr4;

    .line 17
    .line 18
    iput-object p2, p0, Ldefpackage/x90;->b:Ldefpackage/dv3;

    .line 19
    .line 20
    iput p3, p0, Ldefpackage/x90;->c:I

    .line 21
    .line 22
    iput p4, p0, Ldefpackage/x90;->d:I

    .line 23
    .line 24
    iput p5, p0, Ldefpackage/x90;->e:I

    .line 25
    .line 26
    iput p6, p0, Ldefpackage/x90;->f:I

    .line 27
    .line 28
    iput-boolean p7, p0, Ldefpackage/x90;->g:Z

    .line 29
    .line 30
    iput-object p8, p0, Ldefpackage/x90;->h:Ldefpackage/hy;

    .line 31
    .line 32
    iput-object p9, p0, Ldefpackage/x90;->i:Ldefpackage/gv3;

    .line 33
    .line 34
    iput-object p10, p0, Ldefpackage/x90;->j:Ldefpackage/o34;

    .line 35
    .line 36
    iput-object p11, p0, Ldefpackage/x90;->k:Ljava/util/List;

    .line 37
    .line 38
    iput-object p12, p0, Ldefpackage/x90;->l:Ldefpackage/oz3;

    .line 39
    .line 40
    iput p13, p0, Ldefpackage/x90;->m:I

    .line 41
    .line 42
    iput-boolean p14, p0, Ldefpackage/x90;->n:Z

    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    return-void
.end method

.method public final b(Ldefpackage/bv3;Ljava/io/IOException;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/x90;->s:Ldefpackage/pr3;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final cancel()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Ldefpackage/x90;->o:Z

    .line 3
    .line 4
    iget-object p0, p0, Ldefpackage/x90;->p:Ljava/net/Socket;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-static {p0}, Ldefpackage/ze5;->c(Ljava/net/Socket;)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final d()Ldefpackage/q34;
    .locals 15

    .line 1
    new-instance v0, Ldefpackage/x90;

    .line 2
    .line 3
    iget v13, p0, Ldefpackage/x90;->m:I

    .line 4
    .line 5
    iget-boolean v14, p0, Ldefpackage/x90;->n:Z

    .line 6
    .line 7
    iget-object v1, p0, Ldefpackage/x90;->a:Ldefpackage/gr4;

    .line 8
    .line 9
    iget-object v2, p0, Ldefpackage/x90;->b:Ldefpackage/dv3;

    .line 10
    .line 11
    iget v3, p0, Ldefpackage/x90;->c:I

    .line 12
    .line 13
    iget v4, p0, Ldefpackage/x90;->d:I

    .line 14
    .line 15
    iget v5, p0, Ldefpackage/x90;->e:I

    .line 16
    .line 17
    iget v6, p0, Ldefpackage/x90;->f:I

    .line 18
    .line 19
    iget-boolean v7, p0, Ldefpackage/x90;->g:Z

    .line 20
    .line 21
    iget-object v8, p0, Ldefpackage/x90;->h:Ldefpackage/hy;

    .line 22
    .line 23
    iget-object v9, p0, Ldefpackage/x90;->i:Ldefpackage/gv3;

    .line 24
    .line 25
    iget-object v10, p0, Ldefpackage/x90;->j:Ldefpackage/o34;

    .line 26
    .line 27
    iget-object v11, p0, Ldefpackage/x90;->k:Ljava/util/List;

    .line 28
    .line 29
    iget-object v12, p0, Ldefpackage/x90;->l:Ldefpackage/oz3;

    .line 30
    .line 31
    invoke-direct/range {v0 .. v14}, Ldefpackage/x90;-><init>(Ldefpackage/gr4;Ldefpackage/dv3;IIIIZLdefpackage/hy;Ldefpackage/gv3;Ldefpackage/o34;Ljava/util/List;Ldefpackage/oz3;IZ)V

    .line 32
    .line 33
    .line 34
    return-object v0
.end method

.method public final e()Ldefpackage/cv3;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/x90;->h:Ldefpackage/hy;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/x90;->j:Ldefpackage/o34;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Ldefpackage/hy;->a:Ldefpackage/bv3;

    .line 12
    .line 13
    iget-object v0, v0, Ldefpackage/bv3;->n:Ldefpackage/o83;

    .line 14
    .line 15
    iget-object v0, v0, Ldefpackage/o83;->C:Ldefpackage/rm2;

    .line 16
    .line 17
    monitor-enter v0

    .line 18
    :try_start_0
    iget-object v2, v0, Ldefpackage/rm2;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v2, Ljava/util/LinkedHashSet;

    .line 21
    .line 22
    invoke-interface {v2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 23
    .line 24
    .line 25
    monitor-exit v0

    .line 26
    iget-object v0, p0, Ldefpackage/x90;->v:Ldefpackage/cv3;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Ldefpackage/x90;->h:Ldefpackage/hy;

    .line 32
    .line 33
    iget-object v2, p0, Ldefpackage/x90;->j:Ldefpackage/o34;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Ldefpackage/x90;->i:Ldefpackage/gv3;

    .line 45
    .line 46
    iget-object v2, p0, Ldefpackage/x90;->k:Ljava/util/List;

    .line 47
    .line 48
    invoke-virtual {v1, p0, v2}, Ldefpackage/gv3;->c(Ldefpackage/x90;Ljava/util/List;)Ldefpackage/c24;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    iget-object p0, v1, Ldefpackage/c24;->a:Ldefpackage/cv3;

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_0
    monitor-enter v0

    .line 58
    :try_start_1
    iget-object v1, p0, Ldefpackage/x90;->b:Ldefpackage/dv3;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    sget-object v2, Ldefpackage/ze5;->a:Ldefpackage/tl1;

    .line 64
    .line 65
    iget-object v2, v1, Ldefpackage/dv3;->f:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 66
    .line 67
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    iget-object v2, v1, Ldefpackage/dv3;->d:Ldefpackage/fr4;

    .line 71
    .line 72
    iget-object v1, v1, Ldefpackage/dv3;->e:Ldefpackage/gr0;

    .line 73
    .line 74
    invoke-static {v2, v1}, Ldefpackage/fr4;->e(Ldefpackage/fr4;Ldefpackage/ar4;)V

    .line 75
    .line 76
    .line 77
    iget-object v1, p0, Ldefpackage/x90;->h:Ldefpackage/hy;

    .line 78
    .line 79
    invoke-virtual {v1, v0}, Ldefpackage/hy;->a(Ldefpackage/cv3;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    .line 81
    .line 82
    monitor-exit v0

    .line 83
    iget-object v1, p0, Ldefpackage/x90;->h:Ldefpackage/hy;

    .line 84
    .line 85
    invoke-virtual {v1, v0}, Ldefpackage/hy;->e(Ldefpackage/cv3;)V

    .line 86
    .line 87
    .line 88
    iget-object p0, p0, Ldefpackage/x90;->h:Ldefpackage/hy;

    .line 89
    .line 90
    invoke-virtual {p0, v0}, Ldefpackage/hy;->f(Ldefpackage/cv3;)V

    .line 91
    .line 92
    .line 93
    return-object v0

    .line 94
    :catchall_0
    move-exception p0

    .line 95
    monitor-exit v0

    .line 96
    throw p0

    .line 97
    :catchall_1
    move-exception p0

    .line 98
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 99
    throw p0
.end method

.method public final f()Ldefpackage/p34;
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/x90;->j:Ldefpackage/o34;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/x90;->p:Ljava/net/Socket;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez v1, :cond_2

    .line 7
    .line 8
    iget-object v1, p0, Ldefpackage/x90;->h:Ldefpackage/hy;

    .line 9
    .line 10
    invoke-virtual {v1, p0}, Ldefpackage/hy;->b(Ldefpackage/x90;)V

    .line 11
    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v4, v0, Ldefpackage/o34;->c:Ljava/net/InetSocketAddress;

    .line 18
    .line 19
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ldefpackage/x90;->i()V

    .line 23
    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    new-instance v4, Ldefpackage/p34;

    .line 27
    .line 28
    const/4 v5, 0x6

    .line 29
    invoke-direct {v4, p0, v2, v5}, Ldefpackage/p34;-><init>(Ldefpackage/q34;Ljava/lang/Throwable;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p0}, Ldefpackage/hy;->p(Ldefpackage/x90;)V

    .line 33
    .line 34
    .line 35
    return-object v4

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    goto :goto_0

    .line 38
    :catch_0
    move-exception v2

    .line 39
    :try_start_1
    invoke-virtual {v1, v0, v2}, Ldefpackage/hy;->d(Ldefpackage/o34;Ljava/io/IOException;)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Ldefpackage/p34;

    .line 43
    .line 44
    const/4 v4, 0x2

    .line 45
    invoke-direct {v0, p0, v2, v4}, Ldefpackage/p34;-><init>(Ldefpackage/q34;Ljava/lang/Throwable;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, p0}, Ldefpackage/hy;->p(Ldefpackage/x90;)V

    .line 49
    .line 50
    .line 51
    if-nez v3, :cond_0

    .line 52
    .line 53
    iget-object p0, p0, Ldefpackage/x90;->p:Ljava/net/Socket;

    .line 54
    .line 55
    if-eqz p0, :cond_0

    .line 56
    .line 57
    invoke-static {p0}, Ldefpackage/ze5;->c(Ljava/net/Socket;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    return-object v0

    .line 61
    :goto_0
    invoke-virtual {v1, p0}, Ldefpackage/hy;->p(Ldefpackage/x90;)V

    .line 62
    .line 63
    .line 64
    if-nez v3, :cond_1

    .line 65
    .line 66
    iget-object p0, p0, Ldefpackage/x90;->p:Ljava/net/Socket;

    .line 67
    .line 68
    if-eqz p0, :cond_1

    .line 69
    .line 70
    invoke-static {p0}, Ldefpackage/ze5;->c(Ljava/net/Socket;)V

    .line 71
    .line 72
    .line 73
    :cond_1
    throw v0

    .line 74
    :cond_2
    const-string p0, "TCP already connected"

    .line 75
    .line 76
    invoke-static {p0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    return-object v2
.end method

.method public final g()Ldefpackage/p34;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Ldefpackage/x90;->p:Ljava/net/Socket;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_12

    .line 7
    .line 8
    invoke-virtual {v1}, Ldefpackage/x90;->c()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_11

    .line 13
    .line 14
    iget-object v3, v1, Ldefpackage/x90;->j:Ldefpackage/o34;

    .line 15
    .line 16
    iget-object v0, v3, Ldefpackage/o34;->a:Ldefpackage/f6;

    .line 17
    .line 18
    iget-object v4, v3, Ldefpackage/o34;->a:Ldefpackage/f6;

    .line 19
    .line 20
    iget-object v0, v0, Ldefpackage/f6;->j:Ljava/util/List;

    .line 21
    .line 22
    iget-object v5, v1, Ldefpackage/x90;->h:Ldefpackage/hy;

    .line 23
    .line 24
    invoke-virtual {v5, v1}, Ldefpackage/hy;->b(Ldefpackage/x90;)V

    .line 25
    .line 26
    .line 27
    :try_start_0
    iget-object v7, v1, Ldefpackage/x90;->l:Ldefpackage/oz3;

    .line 28
    .line 29
    if-eqz v7, :cond_2

    .line 30
    .line 31
    invoke-virtual {v1}, Ldefpackage/x90;->k()Ldefpackage/p34;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    iget-object v8, v7, Ldefpackage/p34;->c:Ljava/lang/Throwable;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    if-eqz v8, :cond_2

    .line 38
    .line 39
    invoke-virtual {v5, v1}, Ldefpackage/hy;->p(Ldefpackage/x90;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, v1, Ldefpackage/x90;->q:Ljava/net/Socket;

    .line 43
    .line 44
    if-eqz v0, :cond_0

    .line 45
    .line 46
    invoke-static {v0}, Ldefpackage/ze5;->c(Ljava/net/Socket;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    iget-object v0, v1, Ldefpackage/x90;->p:Ljava/net/Socket;

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    invoke-static {v0}, Ldefpackage/ze5;->c(Ljava/net/Socket;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    return-object v7

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    const/4 v6, 0x0

    .line 59
    goto/16 :goto_6

    .line 60
    .line 61
    :catch_0
    move-exception v0

    .line 62
    move-object v10, v2

    .line 63
    :goto_0
    const/4 v6, 0x0

    .line 64
    goto/16 :goto_4

    .line 65
    .line 66
    :cond_2
    :try_start_1
    iget-object v7, v4, Ldefpackage/f6;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 67
    .line 68
    const/4 v8, 0x1

    .line 69
    if-eqz v7, :cond_6

    .line 70
    .line 71
    iget-object v7, v1, Ldefpackage/x90;->t:Ldefpackage/xu3;

    .line 72
    .line 73
    if-eqz v7, :cond_3

    .line 74
    .line 75
    iget-object v7, v7, Ldefpackage/xu3;->o:Ldefpackage/tv;

    .line 76
    .line 77
    invoke-virtual {v7}, Ldefpackage/tv;->l()Z

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    if-eqz v7, :cond_4

    .line 82
    .line 83
    :cond_3
    iget-object v7, v1, Ldefpackage/x90;->u:Ldefpackage/wu3;

    .line 84
    .line 85
    if-eqz v7, :cond_5

    .line 86
    .line 87
    iget-object v7, v7, Ldefpackage/wu3;->o:Ldefpackage/tv;

    .line 88
    .line 89
    invoke-virtual {v7}, Ldefpackage/tv;->l()Z

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    if-eqz v7, :cond_4

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_4
    new-instance v0, Ljava/io/IOException;

    .line 97
    .line 98
    const-string v4, "TLS tunnel buffered too many bytes!"

    .line 99
    .line 100
    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v0

    .line 104
    :cond_5
    :goto_1
    iget-object v7, v4, Ldefpackage/f6;->c:Ljavax/net/ssl/SSLSocketFactory;

    .line 105
    .line 106
    iget-object v9, v1, Ldefpackage/x90;->p:Ljava/net/Socket;

    .line 107
    .line 108
    iget-object v4, v4, Ldefpackage/f6;->h:Ldefpackage/gr1;

    .line 109
    .line 110
    iget-object v10, v4, Ldefpackage/gr1;->d:Ljava/lang/String;

    .line 111
    .line 112
    iget v4, v4, Ldefpackage/gr1;->e:I

    .line 113
    .line 114
    invoke-virtual {v7, v9, v10, v4, v8}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    check-cast v4, Ljavax/net/ssl/SSLSocket;

    .line 122
    .line 123
    invoke-virtual {v1, v0, v4}, Ldefpackage/x90;->m(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Ldefpackage/x90;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    iget v9, v7, Ldefpackage/x90;->m:I

    .line 128
    .line 129
    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    check-cast v9, Ldefpackage/ma0;

    .line 134
    .line 135
    invoke-virtual {v7, v0, v4}, Ldefpackage/x90;->l(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Ldefpackage/x90;

    .line 136
    .line 137
    .line 138
    move-result-object v10
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 139
    :try_start_2
    iget-boolean v0, v7, Ldefpackage/x90;->n:Z

    .line 140
    .line 141
    invoke-virtual {v9, v4, v0}, Ldefpackage/ma0;->a(Ljavax/net/ssl/SSLSocket;Z)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1, v4, v9}, Ldefpackage/x90;->j(Ljavax/net/ssl/SSLSocket;Ldefpackage/ma0;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :catch_1
    move-exception v0

    .line 149
    goto :goto_0

    .line 150
    :cond_6
    :try_start_3
    iget-object v0, v1, Ldefpackage/x90;->p:Ljava/net/Socket;

    .line 151
    .line 152
    iput-object v0, v1, Ldefpackage/x90;->q:Ljava/net/Socket;

    .line 153
    .line 154
    iget-object v0, v4, Ldefpackage/f6;->i:Ljava/util/List;

    .line 155
    .line 156
    sget-object v4, Ldefpackage/pr3;->t:Ldefpackage/pr3;

    .line 157
    .line 158
    invoke-interface {v0, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_7

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_7
    sget-object v4, Ldefpackage/pr3;->q:Ldefpackage/pr3;

    .line 166
    .line 167
    :goto_2
    iput-object v4, v1, Ldefpackage/x90;->s:Ldefpackage/pr3;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 168
    .line 169
    move-object v10, v2

    .line 170
    :goto_3
    :try_start_4
    new-instance v11, Ldefpackage/cv3;

    .line 171
    .line 172
    iget-object v12, v1, Ldefpackage/x90;->a:Ldefpackage/gr4;

    .line 173
    .line 174
    iget-object v13, v1, Ldefpackage/x90;->b:Ldefpackage/dv3;

    .line 175
    .line 176
    iget-object v14, v1, Ldefpackage/x90;->j:Ldefpackage/o34;

    .line 177
    .line 178
    iget-object v15, v1, Ldefpackage/x90;->p:Ljava/net/Socket;

    .line 179
    .line 180
    iget-object v0, v1, Ldefpackage/x90;->q:Ljava/net/Socket;

    .line 181
    .line 182
    iget-object v4, v1, Ldefpackage/x90;->r:Ldefpackage/jl1;

    .line 183
    .line 184
    iget-object v7, v1, Ldefpackage/x90;->s:Ldefpackage/pr3;

    .line 185
    .line 186
    iget-object v9, v1, Ldefpackage/x90;->t:Ldefpackage/xu3;

    .line 187
    .line 188
    iget-object v6, v1, Ldefpackage/x90;->u:Ldefpackage/wu3;

    .line 189
    .line 190
    iget-object v8, v13, Ldefpackage/dv3;->a:Ldefpackage/fz0;

    .line 191
    .line 192
    move-object/from16 v16, v0

    .line 193
    .line 194
    move-object/from16 v17, v4

    .line 195
    .line 196
    move-object/from16 v20, v6

    .line 197
    .line 198
    move-object/from16 v18, v7

    .line 199
    .line 200
    move-object/from16 v21, v8

    .line 201
    .line 202
    move-object/from16 v19, v9

    .line 203
    .line 204
    invoke-direct/range {v11 .. v21}, Ldefpackage/cv3;-><init>(Ldefpackage/gr4;Ldefpackage/dv3;Ldefpackage/o34;Ljava/net/Socket;Ljava/net/Socket;Ldefpackage/jl1;Ldefpackage/pr3;Ldefpackage/xu3;Ldefpackage/wu3;Ldefpackage/fz0;)V

    .line 205
    .line 206
    .line 207
    iput-object v11, v1, Ldefpackage/x90;->v:Ldefpackage/cv3;

    .line 208
    .line 209
    invoke-virtual {v11}, Ldefpackage/cv3;->i()V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    iget-object v0, v3, Ldefpackage/o34;->c:Ljava/net/InetSocketAddress;

    .line 216
    .line 217
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 218
    .line 219
    .line 220
    :try_start_5
    new-instance v0, Ldefpackage/p34;

    .line 221
    .line 222
    const/4 v4, 0x6

    .line 223
    invoke-direct {v0, v1, v2, v4}, Ldefpackage/p34;-><init>(Ldefpackage/q34;Ljava/lang/Throwable;I)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 224
    .line 225
    .line 226
    invoke-virtual {v5, v1}, Ldefpackage/hy;->p(Ldefpackage/x90;)V

    .line 227
    .line 228
    .line 229
    return-object v0

    .line 230
    :catchall_1
    move-exception v0

    .line 231
    const/4 v6, 0x1

    .line 232
    goto :goto_6

    .line 233
    :catch_2
    move-exception v0

    .line 234
    const/4 v6, 0x1

    .line 235
    :goto_4
    :try_start_6
    invoke-virtual {v5, v3, v0}, Ldefpackage/hy;->d(Ldefpackage/o34;Ljava/io/IOException;)V

    .line 236
    .line 237
    .line 238
    iget-boolean v3, v1, Ldefpackage/x90;->g:Z

    .line 239
    .line 240
    if-eqz v3, :cond_c

    .line 241
    .line 242
    instance-of v3, v0, Ljava/net/ProtocolException;

    .line 243
    .line 244
    if-eqz v3, :cond_8

    .line 245
    .line 246
    goto :goto_5

    .line 247
    :cond_8
    instance-of v3, v0, Ljava/io/InterruptedIOException;

    .line 248
    .line 249
    if-eqz v3, :cond_9

    .line 250
    .line 251
    goto :goto_5

    .line 252
    :cond_9
    instance-of v3, v0, Ljavax/net/ssl/SSLHandshakeException;

    .line 253
    .line 254
    if-eqz v3, :cond_a

    .line 255
    .line 256
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    instance-of v3, v3, Ljava/security/cert/CertificateException;

    .line 261
    .line 262
    if-eqz v3, :cond_a

    .line 263
    .line 264
    goto :goto_5

    .line 265
    :cond_a
    instance-of v3, v0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 266
    .line 267
    if-eqz v3, :cond_b

    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_b
    instance-of v3, v0, Ljavax/net/ssl/SSLException;

    .line 271
    .line 272
    if-eqz v3, :cond_c

    .line 273
    .line 274
    move-object v2, v10

    .line 275
    :cond_c
    :goto_5
    new-instance v3, Ldefpackage/p34;

    .line 276
    .line 277
    invoke-direct {v3, v1, v2, v0}, Ldefpackage/p34;-><init>(Ldefpackage/q34;Ldefpackage/x90;Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 278
    .line 279
    .line 280
    invoke-virtual {v5, v1}, Ldefpackage/hy;->p(Ldefpackage/x90;)V

    .line 281
    .line 282
    .line 283
    if-nez v6, :cond_e

    .line 284
    .line 285
    iget-object v0, v1, Ldefpackage/x90;->q:Ljava/net/Socket;

    .line 286
    .line 287
    if-eqz v0, :cond_d

    .line 288
    .line 289
    invoke-static {v0}, Ldefpackage/ze5;->c(Ljava/net/Socket;)V

    .line 290
    .line 291
    .line 292
    :cond_d
    iget-object v0, v1, Ldefpackage/x90;->p:Ljava/net/Socket;

    .line 293
    .line 294
    if-eqz v0, :cond_e

    .line 295
    .line 296
    invoke-static {v0}, Ldefpackage/ze5;->c(Ljava/net/Socket;)V

    .line 297
    .line 298
    .line 299
    :cond_e
    return-object v3

    .line 300
    :catchall_2
    move-exception v0

    .line 301
    :goto_6
    invoke-virtual {v5, v1}, Ldefpackage/hy;->p(Ldefpackage/x90;)V

    .line 302
    .line 303
    .line 304
    if-nez v6, :cond_10

    .line 305
    .line 306
    iget-object v2, v1, Ldefpackage/x90;->q:Ljava/net/Socket;

    .line 307
    .line 308
    if-eqz v2, :cond_f

    .line 309
    .line 310
    invoke-static {v2}, Ldefpackage/ze5;->c(Ljava/net/Socket;)V

    .line 311
    .line 312
    .line 313
    :cond_f
    iget-object v1, v1, Ldefpackage/x90;->p:Ljava/net/Socket;

    .line 314
    .line 315
    if-eqz v1, :cond_10

    .line 316
    .line 317
    invoke-static {v1}, Ldefpackage/ze5;->c(Ljava/net/Socket;)V

    .line 318
    .line 319
    .line 320
    :cond_10
    throw v0

    .line 321
    :cond_11
    const-string v0, "already connected"

    .line 322
    .line 323
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    return-object v2

    .line 327
    :cond_12
    const-string v0, "TCP not connected"

    .line 328
    .line 329
    invoke-static {v0}, Ldefpackage/kf2;->o(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    return-object v2
.end method

.method public final h()Ldefpackage/o34;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/x90;->j:Ldefpackage/o34;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i()V
    .locals 6

    .line 1
    iget-object v0, p0, Ldefpackage/x90;->j:Ldefpackage/o34;

    .line 2
    .line 3
    iget-object v0, v0, Ldefpackage/o34;->b:Ljava/net/Proxy;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v1, Ldefpackage/v90;->a:[I

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    aget v0, v1, v0

    .line 20
    .line 21
    :goto_0
    const/4 v1, 0x1

    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    if-eq v0, v2, :cond_1

    .line 26
    .line 27
    new-instance v0, Ljava/net/Socket;

    .line 28
    .line 29
    iget-object v2, p0, Ldefpackage/x90;->j:Ldefpackage/o34;

    .line 30
    .line 31
    iget-object v2, v2, Ldefpackage/o34;->b:Ljava/net/Proxy;

    .line 32
    .line 33
    invoke-direct {v0, v2}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    iget-object v0, p0, Ldefpackage/x90;->j:Ldefpackage/o34;

    .line 38
    .line 39
    iget-object v0, v0, Ldefpackage/o34;->a:Ldefpackage/f6;

    .line 40
    .line 41
    iget-object v0, v0, Ldefpackage/f6;->b:Ljavax/net/SocketFactory;

    .line 42
    .line 43
    invoke-virtual {v0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    :goto_1
    iput-object v0, p0, Ldefpackage/x90;->p:Ljava/net/Socket;

    .line 51
    .line 52
    iget-boolean v2, p0, Ldefpackage/x90;->o:Z

    .line 53
    .line 54
    if-nez v2, :cond_3

    .line 55
    .line 56
    iget v2, p0, Ldefpackage/x90;->f:I

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 59
    .line 60
    .line 61
    :try_start_0
    sget-object v2, Ldefpackage/qg3;->a:Ldefpackage/qg3;

    .line 62
    .line 63
    sget-object v2, Ldefpackage/qg3;->a:Ldefpackage/qg3;

    .line 64
    .line 65
    iget-object v3, p0, Ldefpackage/x90;->j:Ldefpackage/o34;

    .line 66
    .line 67
    iget-object v3, v3, Ldefpackage/o34;->c:Ljava/net/InetSocketAddress;

    .line 68
    .line 69
    iget v4, p0, Ldefpackage/x90;->e:I

    .line 70
    .line 71
    invoke-virtual {v2, v0, v3, v4}, Ldefpackage/qg3;->e(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    .line 72
    .line 73
    .line 74
    :try_start_1
    sget-object v2, Ldefpackage/p83;->a:Ljava/util/logging/Logger;

    .line 75
    .line 76
    new-instance v2, Ldefpackage/vh4;

    .line 77
    .line 78
    invoke-direct {v2, v0}, Ldefpackage/vh4;-><init>(Ljava/net/Socket;)V

    .line 79
    .line 80
    .line 81
    new-instance v3, Ldefpackage/tk;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-direct {v3, v1, v4, v2}, Ldefpackage/tk;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    new-instance v4, Ldefpackage/tk;

    .line 94
    .line 95
    const/4 v5, 0x0

    .line 96
    invoke-direct {v4, v5, v2, v3}, Ldefpackage/tk;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    new-instance v2, Ldefpackage/xu3;

    .line 100
    .line 101
    invoke-direct {v2, v4}, Ldefpackage/xu3;-><init>(Ldefpackage/ej4;)V

    .line 102
    .line 103
    .line 104
    iput-object v2, p0, Ldefpackage/x90;->t:Ldefpackage/xu3;

    .line 105
    .line 106
    new-instance v2, Ldefpackage/vh4;

    .line 107
    .line 108
    invoke-direct {v2, v0}, Ldefpackage/vh4;-><init>(Ljava/net/Socket;)V

    .line 109
    .line 110
    .line 111
    new-instance v3, Ldefpackage/sk;

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-direct {v3, v1, v0, v2}, Ldefpackage/sk;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    new-instance v0, Ldefpackage/sk;

    .line 124
    .line 125
    invoke-direct {v0, v5, v2, v3}, Ldefpackage/sk;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    new-instance v1, Ldefpackage/wu3;

    .line 129
    .line 130
    invoke-direct {v1, v0}, Ldefpackage/wu3;-><init>(Ldefpackage/of4;)V

    .line 131
    .line 132
    .line 133
    iput-object v1, p0, Ldefpackage/x90;->u:Ldefpackage/wu3;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 134
    .line 135
    return-void

    .line 136
    :catch_0
    move-exception p0

    .line 137
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    const-string v1, "throw with null exception"

    .line 142
    .line 143
    invoke-static {v0, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-nez v0, :cond_2

    .line 148
    .line 149
    return-void

    .line 150
    :cond_2
    new-instance v0, Ljava/io/IOException;

    .line 151
    .line 152
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    throw v0

    .line 156
    :catch_1
    move-exception v0

    .line 157
    new-instance v1, Ljava/net/ConnectException;

    .line 158
    .line 159
    new-instance v2, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    const-string v3, "Failed to connect to "

    .line 162
    .line 163
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    iget-object p0, p0, Ldefpackage/x90;->j:Ldefpackage/o34;

    .line 167
    .line 168
    iget-object p0, p0, Ldefpackage/o34;->c:Ljava/net/InetSocketAddress;

    .line 169
    .line 170
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-direct {v1, p0}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 181
    .line 182
    .line 183
    throw v1

    .line 184
    :cond_3
    const-string p0, "canceled"

    .line 185
    .line 186
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    return-void
.end method

.method public final j(Ljavax/net/ssl/SSLSocket;Ldefpackage/ma0;)V
    .locals 9

    .line 1
    const-string v0, "Hostname "

    .line 2
    .line 3
    const-string v1, "\n            |Hostname "

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/x90;->j:Ldefpackage/o34;

    .line 6
    .line 7
    iget-object v2, v2, Ldefpackage/o34;->a:Ldefpackage/f6;

    .line 8
    .line 9
    :try_start_0
    iget-boolean v3, p2, Ldefpackage/ma0;->b:Z

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    sget-object v3, Ldefpackage/qg3;->a:Ldefpackage/qg3;

    .line 14
    .line 15
    sget-object v3, Ldefpackage/qg3;->a:Ldefpackage/qg3;

    .line 16
    .line 17
    iget-object v4, v2, Ldefpackage/f6;->h:Ldefpackage/gr1;

    .line 18
    .line 19
    iget-object v4, v4, Ldefpackage/gr1;->d:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v5, v2, Ldefpackage/f6;->i:Ljava/util/List;

    .line 22
    .line 23
    invoke-virtual {v3, p1, v4, v5}, Ldefpackage/qg3;->d(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto/16 :goto_3

    .line 29
    .line 30
    :cond_0
    :goto_0
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {v3}, Ldefpackage/zz1;->q(Ljavax/net/ssl/SSLSession;)Ldefpackage/jl1;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    iget-object v5, v2, Ldefpackage/f6;->d:Ljavax/net/ssl/HostnameVerifier;

    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object v6, v2, Ldefpackage/f6;->h:Ldefpackage/gr1;

    .line 50
    .line 51
    iget-object v6, v6, Ldefpackage/gr1;->d:Ljava/lang/String;

    .line 52
    .line 53
    invoke-interface {v5, v6, v3}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    const/4 v5, 0x0

    .line 58
    if-nez v3, :cond_2

    .line 59
    .line 60
    invoke-virtual {v4}, Ldefpackage/jl1;->a()Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-nez p2, :cond_1

    .line 69
    .line 70
    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    check-cast p0, Ljava/security/cert/X509Certificate;

    .line 78
    .line 79
    new-instance p2, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 80
    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iget-object v1, v2, Ldefpackage/f6;->h:Ldefpackage/gr1;

    .line 87
    .line 88
    iget-object v1, v1, Ldefpackage/gr1;->d:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v1, " not verified:\n            |    certificate: "

    .line 94
    .line 95
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    sget-object v1, Ldefpackage/o00;->c:Ldefpackage/o00;

    .line 99
    .line 100
    new-instance v1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v2, "sha256/"

    .line 103
    .line 104
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    sget-object v2, Ldefpackage/yw;->q:Ldefpackage/yw;

    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-interface {v2}, Ljava/security/Key;->getEncoded()[B

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-static {v2}, Ldefpackage/pa;->A([B)Ldefpackage/yw;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    const-string v3, "SHA-256"

    .line 125
    .line 126
    invoke-virtual {v2, v3}, Ldefpackage/yw;->c(Ljava/lang/String;)Ldefpackage/yw;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-virtual {v2}, Ldefpackage/yw;->a()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string v1, "\n            |    DN: "

    .line 145
    .line 146
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-interface {v1}, Ljava/security/Principal;->getName()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    const-string v1, "\n            |    subjectAltNames: "

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    const/4 v1, 0x7

    .line 166
    invoke-static {p0, v1}, Ldefpackage/m83;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    const/4 v2, 0x2

    .line 171
    invoke-static {p0, v2}, Ldefpackage/m83;->a(Ljava/security/cert/X509Certificate;I)Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-static {v1, p0}, Ldefpackage/q40;->G0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    const-string p0, "\n            "

    .line 183
    .line 184
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    invoke-static {p0}, Ldefpackage/rm4;->d0(Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    invoke-direct {p2, p0}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    throw p2

    .line 199
    :cond_1
    new-instance p0, Ljavax/net/ssl/SSLPeerUnverifiedException;

    .line 200
    .line 201
    new-instance p2, Ljava/lang/StringBuilder;

    .line 202
    .line 203
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    iget-object v0, v2, Ldefpackage/f6;->h:Ldefpackage/gr1;

    .line 207
    .line 208
    iget-object v0, v0, Ldefpackage/gr1;->d:Ljava/lang/String;

    .line 209
    .line 210
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    const-string v0, " not verified (no certificates)"

    .line 214
    .line 215
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p2

    .line 222
    invoke-direct {p0, p2}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    throw p0

    .line 226
    :cond_2
    iget-object v0, v2, Ldefpackage/f6;->e:Ldefpackage/o00;

    .line 227
    .line 228
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    new-instance v1, Ldefpackage/jl1;

    .line 232
    .line 233
    iget-object v3, v4, Ldefpackage/jl1;->a:Ldefpackage/mu4;

    .line 234
    .line 235
    iget-object v6, v4, Ldefpackage/jl1;->b:Ldefpackage/v20;

    .line 236
    .line 237
    iget-object v7, v4, Ldefpackage/jl1;->c:Ljava/util/List;

    .line 238
    .line 239
    new-instance v8, Ldefpackage/w90;

    .line 240
    .line 241
    invoke-direct {v8, v0, v4, v2, v5}, Ldefpackage/w90;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 242
    .line 243
    .line 244
    invoke-direct {v1, v3, v6, v7, v8}, Ldefpackage/jl1;-><init>(Ldefpackage/mu4;Ldefpackage/v20;Ljava/util/List;Ldefpackage/gf1;)V

    .line 245
    .line 246
    .line 247
    iput-object v1, p0, Ldefpackage/x90;->r:Ldefpackage/jl1;

    .line 248
    .line 249
    iget-object v1, v2, Ldefpackage/f6;->h:Ldefpackage/gr1;

    .line 250
    .line 251
    iget-object v1, v1, Ldefpackage/gr1;->d:Ljava/lang/String;

    .line 252
    .line 253
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    iget-object v0, v0, Ldefpackage/o00;->a:Ljava/util/Set;

    .line 257
    .line 258
    check-cast v0, Ljava/lang/Iterable;

    .line 259
    .line 260
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    if-nez v1, :cond_5

    .line 269
    .line 270
    iget-boolean p2, p2, Ldefpackage/ma0;->b:Z

    .line 271
    .line 272
    if-eqz p2, :cond_3

    .line 273
    .line 274
    sget-object p2, Ldefpackage/qg3;->a:Ldefpackage/qg3;

    .line 275
    .line 276
    sget-object p2, Ldefpackage/qg3;->a:Ldefpackage/qg3;

    .line 277
    .line 278
    invoke-virtual {p2, p1}, Ldefpackage/qg3;->f(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object p2

    .line 282
    goto :goto_1

    .line 283
    :cond_3
    const/4 p2, 0x0

    .line 284
    :goto_1
    iput-object p1, p0, Ldefpackage/x90;->q:Ljava/net/Socket;

    .line 285
    .line 286
    sget-object v0, Ldefpackage/p83;->a:Ljava/util/logging/Logger;

    .line 287
    .line 288
    new-instance v0, Ldefpackage/vh4;

    .line 289
    .line 290
    invoke-direct {v0, p1}, Ldefpackage/vh4;-><init>(Ljava/net/Socket;)V

    .line 291
    .line 292
    .line 293
    new-instance v1, Ldefpackage/tk;

    .line 294
    .line 295
    invoke-virtual {p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    .line 296
    .line 297
    .line 298
    move-result-object v2

    .line 299
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    const/4 v3, 0x1

    .line 303
    invoke-direct {v1, v3, v2, v0}, Ldefpackage/tk;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    new-instance v2, Ldefpackage/tk;

    .line 307
    .line 308
    invoke-direct {v2, v5, v0, v1}, Ldefpackage/tk;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    new-instance v0, Ldefpackage/xu3;

    .line 312
    .line 313
    invoke-direct {v0, v2}, Ldefpackage/xu3;-><init>(Ldefpackage/ej4;)V

    .line 314
    .line 315
    .line 316
    iput-object v0, p0, Ldefpackage/x90;->t:Ldefpackage/xu3;

    .line 317
    .line 318
    new-instance v0, Ldefpackage/vh4;

    .line 319
    .line 320
    invoke-direct {v0, p1}, Ldefpackage/vh4;-><init>(Ljava/net/Socket;)V

    .line 321
    .line 322
    .line 323
    new-instance v1, Ldefpackage/sk;

    .line 324
    .line 325
    invoke-virtual {p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    invoke-direct {v1, v3, v2, v0}, Ldefpackage/sk;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 333
    .line 334
    .line 335
    new-instance v2, Ldefpackage/sk;

    .line 336
    .line 337
    invoke-direct {v2, v5, v0, v1}, Ldefpackage/sk;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 338
    .line 339
    .line 340
    new-instance v0, Ldefpackage/wu3;

    .line 341
    .line 342
    invoke-direct {v0, v2}, Ldefpackage/wu3;-><init>(Ldefpackage/of4;)V

    .line 343
    .line 344
    .line 345
    iput-object v0, p0, Ldefpackage/x90;->u:Ldefpackage/wu3;

    .line 346
    .line 347
    if-eqz p2, :cond_4

    .line 348
    .line 349
    sget-object v0, Ldefpackage/pr3;->o:Ldefpackage/hh3;

    .line 350
    .line 351
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    invoke-static {p2}, Ldefpackage/hh3;->i(Ljava/lang/String;)Ldefpackage/pr3;

    .line 355
    .line 356
    .line 357
    move-result-object p2

    .line 358
    goto :goto_2

    .line 359
    :cond_4
    sget-object p2, Ldefpackage/pr3;->q:Ldefpackage/pr3;

    .line 360
    .line 361
    :goto_2
    iput-object p2, p0, Ldefpackage/x90;->s:Ldefpackage/pr3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 362
    .line 363
    sget-object p0, Ldefpackage/qg3;->a:Ldefpackage/qg3;

    .line 364
    .line 365
    sget-object p0, Ldefpackage/qg3;->a:Ldefpackage/qg3;

    .line 366
    .line 367
    invoke-virtual {p0, p1}, Ldefpackage/qg3;->a(Ljavax/net/ssl/SSLSocket;)V

    .line 368
    .line 369
    .line 370
    return-void

    .line 371
    :cond_5
    :try_start_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    move-result-object p0

    .line 375
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    new-instance p0, Ljava/lang/ClassCastException;

    .line 379
    .line 380
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 381
    .line 382
    .line 383
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 384
    :goto_3
    sget-object p2, Ldefpackage/qg3;->a:Ldefpackage/qg3;

    .line 385
    .line 386
    sget-object p2, Ldefpackage/qg3;->a:Ldefpackage/qg3;

    .line 387
    .line 388
    invoke-virtual {p2, p1}, Ldefpackage/qg3;->a(Ljavax/net/ssl/SSLSocket;)V

    .line 389
    .line 390
    .line 391
    invoke-static {p1}, Ldefpackage/ze5;->c(Ljava/net/Socket;)V

    .line 392
    .line 393
    .line 394
    throw p0
.end method

.method public final k()Ldefpackage/p34;
    .locals 10

    .line 1
    iget-object v0, p0, Ldefpackage/x90;->l:Ldefpackage/oz3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ldefpackage/x90;->j:Ldefpackage/o34;

    .line 7
    .line 8
    iget-object v2, v1, Ldefpackage/o34;->a:Ldefpackage/f6;

    .line 9
    .line 10
    iget-object v2, v2, Ldefpackage/f6;->h:Ldefpackage/gr1;

    .line 11
    .line 12
    new-instance v3, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v4, "CONNECT "

    .line 15
    .line 16
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    invoke-static {v2, v4}, Ldefpackage/ze5;->j(Ldefpackage/gr1;Z)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v2, " HTTP/1.1"

    .line 28
    .line 29
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    iget-object v3, p0, Ldefpackage/x90;->t:Ldefpackage/xu3;

    .line 37
    .line 38
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v4, p0, Ldefpackage/x90;->u:Ldefpackage/wu3;

    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    new-instance v5, Ldefpackage/hq1;

    .line 47
    .line 48
    const/4 v6, 0x0

    .line 49
    invoke-direct {v5, v6, p0, v3, v4}, Ldefpackage/hq1;-><init>(Ldefpackage/o83;Ldefpackage/q21;Ldefpackage/fw;Ldefpackage/ew;)V

    .line 50
    .line 51
    .line 52
    iget-object v3, v3, Ldefpackage/xu3;->n:Ldefpackage/ej4;

    .line 53
    .line 54
    invoke-interface {v3}, Ldefpackage/ej4;->timeout()Ldefpackage/fu4;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    iget v7, p0, Ldefpackage/x90;->c:I

    .line 59
    .line 60
    int-to-long v7, v7

    .line 61
    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 62
    .line 63
    invoke-virtual {v3, v7, v8, v9}, Ldefpackage/fu4;->g(JLjava/util/concurrent/TimeUnit;)Ldefpackage/fu4;

    .line 64
    .line 65
    .line 66
    iget-object v3, v4, Ldefpackage/wu3;->n:Ldefpackage/of4;

    .line 67
    .line 68
    invoke-interface {v3}, Ldefpackage/of4;->timeout()Ldefpackage/fu4;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    iget v4, p0, Ldefpackage/x90;->d:I

    .line 73
    .line 74
    int-to-long v7, v4

    .line 75
    invoke-virtual {v3, v7, v8, v9}, Ldefpackage/fu4;->g(JLjava/util/concurrent/TimeUnit;)Ldefpackage/fu4;

    .line 76
    .line 77
    .line 78
    iget-object v3, v0, Ldefpackage/oz3;->c:Ldefpackage/tl1;

    .line 79
    .line 80
    invoke-virtual {v5, v3, v2}, Ldefpackage/hq1;->n(Ldefpackage/tl1;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v5}, Ldefpackage/hq1;->c()V

    .line 84
    .line 85
    .line 86
    const/4 v2, 0x0

    .line 87
    invoke-virtual {v5, v2}, Ldefpackage/hq1;->f(Z)Ldefpackage/j14;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    iput-object v0, v2, Ldefpackage/j14;->a:Ldefpackage/oz3;

    .line 95
    .line 96
    invoke-virtual {v2}, Ldefpackage/j14;->a()Ldefpackage/k14;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    iget v2, v0, Ldefpackage/k14;->q:I

    .line 101
    .line 102
    invoke-static {v0}, Ldefpackage/ze5;->e(Ldefpackage/k14;)J

    .line 103
    .line 104
    .line 105
    move-result-wide v3

    .line 106
    const-wide/16 v7, -0x1

    .line 107
    .line 108
    cmp-long v0, v3, v7

    .line 109
    .line 110
    if-nez v0, :cond_0

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_0
    invoke-virtual {v5, v3, v4}, Ldefpackage/hq1;->k(J)Ldefpackage/eq1;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    const v3, 0x7fffffff

    .line 118
    .line 119
    .line 120
    invoke-static {v0, v3}, Ldefpackage/ze5;->h(Ldefpackage/ej4;I)Z

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Ldefpackage/eq1;->close()V

    .line 124
    .line 125
    .line 126
    :goto_0
    const/16 v0, 0xc8

    .line 127
    .line 128
    if-eq v2, v0, :cond_2

    .line 129
    .line 130
    const/16 p0, 0x197

    .line 131
    .line 132
    if-ne v2, p0, :cond_1

    .line 133
    .line 134
    iget-object p0, v1, Ldefpackage/o34;->a:Ldefpackage/f6;

    .line 135
    .line 136
    iget-object p0, p0, Ldefpackage/f6;->f:Ldefpackage/fz0;

    .line 137
    .line 138
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    const-string p0, "Failed to authenticate with proxy"

    .line 142
    .line 143
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    return-object v6

    .line 147
    :cond_1
    const-string p0, "Unexpected response code for CONNECT: "

    .line 148
    .line 149
    invoke-static {v2, p0}, Ldefpackage/f34;->f(ILjava/lang/String;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    return-object v6

    .line 157
    :cond_2
    new-instance v0, Ldefpackage/p34;

    .line 158
    .line 159
    const/4 v1, 0x6

    .line 160
    invoke-direct {v0, p0, v6, v1}, Ldefpackage/p34;-><init>(Ldefpackage/q34;Ljava/lang/Throwable;I)V

    .line 161
    .line 162
    .line 163
    return-object v0
.end method

.method public final l(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Ldefpackage/x90;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget v1, v0, Ldefpackage/x90;->m:I

    .line 7
    .line 8
    add-int/lit8 v2, v1, 0x1

    .line 9
    .line 10
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 11
    .line 12
    .line 13
    move-result v3

    .line 14
    :goto_0
    if-ge v2, v3, :cond_4

    .line 15
    .line 16
    move-object/from16 v4, p1

    .line 17
    .line 18
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    check-cast v5, Ldefpackage/ma0;

    .line 23
    .line 24
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-boolean v6, v5, Ldefpackage/ma0;->a:Z

    .line 28
    .line 29
    if-nez v6, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    iget-object v6, v5, Ldefpackage/ma0;->d:[Ljava/lang/String;

    .line 33
    .line 34
    if-eqz v6, :cond_1

    .line 35
    .line 36
    invoke-virtual/range {p2 .. p2}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    sget-object v8, Ldefpackage/w13;->o:Ldefpackage/w13;

    .line 41
    .line 42
    invoke-static {v6, v7, v8}, Ldefpackage/xe5;->g([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-nez v6, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    iget-object v5, v5, Ldefpackage/ma0;->c:[Ljava/lang/String;

    .line 50
    .line 51
    if-eqz v5, :cond_2

    .line 52
    .line 53
    invoke-virtual/range {p2 .. p2}, Ljavax/net/ssl/SSLSocket;->getEnabledCipherSuites()[Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    sget-object v7, Ldefpackage/v20;->c:Ldefpackage/ca1;

    .line 58
    .line 59
    invoke-static {v5, v6, v7}, Ldefpackage/xe5;->g([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-nez v5, :cond_2

    .line 64
    .line 65
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    const/4 v3, -0x1

    .line 69
    if-eq v1, v3, :cond_3

    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    :goto_2
    move/from16 v18, v1

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_3
    const/4 v1, 0x0

    .line 76
    goto :goto_2

    .line 77
    :goto_3
    new-instance v4, Ldefpackage/x90;

    .line 78
    .line 79
    iget-object v14, v0, Ldefpackage/x90;->j:Ldefpackage/o34;

    .line 80
    .line 81
    iget-object v15, v0, Ldefpackage/x90;->k:Ljava/util/List;

    .line 82
    .line 83
    iget-object v5, v0, Ldefpackage/x90;->a:Ldefpackage/gr4;

    .line 84
    .line 85
    iget-object v6, v0, Ldefpackage/x90;->b:Ldefpackage/dv3;

    .line 86
    .line 87
    iget v7, v0, Ldefpackage/x90;->c:I

    .line 88
    .line 89
    iget v8, v0, Ldefpackage/x90;->d:I

    .line 90
    .line 91
    iget v9, v0, Ldefpackage/x90;->e:I

    .line 92
    .line 93
    iget v10, v0, Ldefpackage/x90;->f:I

    .line 94
    .line 95
    iget-boolean v11, v0, Ldefpackage/x90;->g:Z

    .line 96
    .line 97
    iget-object v12, v0, Ldefpackage/x90;->h:Ldefpackage/hy;

    .line 98
    .line 99
    iget-object v13, v0, Ldefpackage/x90;->i:Ldefpackage/gv3;

    .line 100
    .line 101
    iget-object v0, v0, Ldefpackage/x90;->l:Ldefpackage/oz3;

    .line 102
    .line 103
    move-object/from16 v16, v0

    .line 104
    .line 105
    move/from16 v17, v2

    .line 106
    .line 107
    invoke-direct/range {v4 .. v18}, Ldefpackage/x90;-><init>(Ldefpackage/gr4;Ldefpackage/dv3;IIIIZLdefpackage/hy;Ldefpackage/gv3;Ldefpackage/o34;Ljava/util/List;Ldefpackage/oz3;IZ)V

    .line 108
    .line 109
    .line 110
    return-object v4

    .line 111
    :cond_4
    const/4 v0, 0x0

    .line 112
    return-object v0
.end method

.method public final m(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Ldefpackage/x90;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Ldefpackage/x90;->m:I

    .line 5
    .line 6
    const/4 v1, -0x1

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-virtual {p0, p1, p2}, Ldefpackage/x90;->l(Ljava/util/List;Ljavax/net/ssl/SSLSocket;)Ldefpackage/x90;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_1
    new-instance v0, Ljava/net/UnknownServiceException;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v2, "Unable to find acceptable protocols. isFallback="

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-boolean p0, p0, Ldefpackage/x90;->n:Z

    .line 27
    .line 28
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p0, ", modes="

    .line 32
    .line 33
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2}, Ljavax/net/ssl/SSLSocket;->getEnabledProtocols()[Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {p0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    const-string p1, ", supported protocols="

    .line 54
    .line 55
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-direct {v0, p0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v0
.end method
