.class public final Lcv3;
.super Lkq1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lq21;


# instance fields
.field public final b:Lgr4;

.field public final c:Ldv3;

.field public final d:Lo34;

.field public final e:Ljava/net/Socket;

.field public final f:Ljava/net/Socket;

.field public final g:Ljl1;

.field public final h:Lpr3;

.field public final i:Lfw;

.field public final j:Lew;

.field public final k:Lfz0;

.field public l:Lrq1;

.field public m:Z

.field public n:Z

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public final s:Ljava/util/ArrayList;

.field public t:J


# direct methods
.method public constructor <init>(Lgr4;Ldv3;Lo34;Ljava/net/Socket;Ljava/net/Socket;Ljl1;Lpr3;Lxu3;Lwu3;Lfz0;)V
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
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcv3;->b:Lgr4;

    .line 14
    .line 15
    iput-object p2, p0, Lcv3;->c:Ldv3;

    .line 16
    .line 17
    iput-object p3, p0, Lcv3;->d:Lo34;

    .line 18
    .line 19
    iput-object p4, p0, Lcv3;->e:Ljava/net/Socket;

    .line 20
    .line 21
    iput-object p5, p0, Lcv3;->f:Ljava/net/Socket;

    .line 22
    .line 23
    iput-object p6, p0, Lcv3;->g:Ljl1;

    .line 24
    .line 25
    iput-object p7, p0, Lcv3;->h:Lpr3;

    .line 26
    .line 27
    iput-object p8, p0, Lcv3;->i:Lfw;

    .line 28
    .line 29
    iput-object p9, p0, Lcv3;->j:Lew;

    .line 30
    .line 31
    iput-object p10, p0, Lcv3;->k:Lfz0;

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    iput p1, p0, Lcv3;->r:I

    .line 35
    .line 36
    new-instance p1, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lcv3;->s:Ljava/util/ArrayList;

    .line 42
    .line 43
    const-wide p1, 0x7fffffffffffffffL

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    iput-wide p1, p0, Lcv3;->t:J

    .line 49
    .line 50
    return-void
.end method

.method public static e(Lo83;Lo34;Ljava/io/IOException;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p1, Lo34;->b:Ljava/net/Proxy;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 17
    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    iget-object v0, p1, Lo34;->a:Lf6;

    .line 21
    .line 22
    iget-object v1, v0, Lf6;->g:Ljava/net/ProxySelector;

    .line 23
    .line 24
    iget-object v0, v0, Lf6;->h:Lgr1;

    .line 25
    .line 26
    invoke-virtual {v0}, Lgr1;->j()Ljava/net/URI;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iget-object v2, p1, Lo34;->b:Ljava/net/Proxy;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    invoke-virtual {v1, v0, v2, p2}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object p0, p0, Lo83;->C:Lrm2;

    .line 40
    .line 41
    monitor-enter p0

    .line 42
    :try_start_0
    iget-object p2, p0, Lrm2;->o:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p2, Ljava/util/LinkedHashSet;

    .line 45
    .line 46
    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    monitor-exit p0

    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception p1

    .line 52
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    throw p1
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_0
    iput-boolean v0, p0, Lcv3;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    monitor-exit p0

    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception v0

    .line 8
    monitor-exit p0

    .line 9
    throw v0
.end method

.method public final b(Lbv3;Ljava/io/IOException;)V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    instance-of v0, p2, Lokhttp3/internal/http2/StreamResetException;

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    move-object v0, p2

    .line 8
    check-cast v0, Lokhttp3/internal/http2/StreamResetException;

    .line 9
    .line 10
    iget-object v0, v0, Lokhttp3/internal/http2/StreamResetException;->n:Lb21;

    .line 11
    .line 12
    sget-object v2, Lb21;->t:Lb21;

    .line 13
    .line 14
    if-ne v0, v2, :cond_0

    .line 15
    .line 16
    iget p1, p0, Lcv3;->q:I

    .line 17
    .line 18
    add-int/2addr p1, v1

    .line 19
    iput p1, p0, Lcv3;->q:I

    .line 20
    .line 21
    if-le p1, v1, :cond_6

    .line 22
    .line 23
    iput-boolean v1, p0, Lcv3;->m:Z

    .line 24
    .line 25
    iget p1, p0, Lcv3;->o:I

    .line 26
    .line 27
    add-int/2addr p1, v1

    .line 28
    iput p1, p0, Lcv3;->o:I

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_2

    .line 33
    :cond_0
    check-cast p2, Lokhttp3/internal/http2/StreamResetException;

    .line 34
    .line 35
    iget-object p2, p2, Lokhttp3/internal/http2/StreamResetException;->n:Lb21;

    .line 36
    .line 37
    sget-object v0, Lb21;->u:Lb21;

    .line 38
    .line 39
    if-ne p2, v0, :cond_1

    .line 40
    .line 41
    iget-boolean p1, p1, Lbv3;->A:Z

    .line 42
    .line 43
    if-nez p1, :cond_6

    .line 44
    .line 45
    :cond_1
    iput-boolean v1, p0, Lcv3;->m:Z

    .line 46
    .line 47
    iget p1, p0, Lcv3;->o:I

    .line 48
    .line 49
    add-int/2addr p1, v1

    .line 50
    iput p1, p0, Lcv3;->o:I

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    iget-object v0, p0, Lcv3;->l:Lrq1;

    .line 54
    .line 55
    if-eqz v0, :cond_3

    .line 56
    .line 57
    move v0, v1

    .line 58
    goto :goto_0

    .line 59
    :cond_3
    const/4 v0, 0x0

    .line 60
    :goto_0
    if-eqz v0, :cond_4

    .line 61
    .line 62
    instance-of v0, p2, Lokhttp3/internal/http2/ConnectionShutdownException;

    .line 63
    .line 64
    if-eqz v0, :cond_6

    .line 65
    .line 66
    :cond_4
    iput-boolean v1, p0, Lcv3;->m:Z

    .line 67
    .line 68
    iget v0, p0, Lcv3;->p:I

    .line 69
    .line 70
    if-nez v0, :cond_6

    .line 71
    .line 72
    if-eqz p2, :cond_5

    .line 73
    .line 74
    iget-object p1, p1, Lbv3;->n:Lo83;

    .line 75
    .line 76
    iget-object v0, p0, Lcv3;->d:Lo34;

    .line 77
    .line 78
    invoke-static {p1, v0, p2}, Lcv3;->e(Lo83;Lo34;Ljava/io/IOException;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    iget p1, p0, Lcv3;->o:I

    .line 82
    .line 83
    add-int/2addr p1, v1

    .line 84
    iput p1, p0, Lcv3;->o:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    :cond_6
    :goto_1
    monitor-exit p0

    .line 87
    return-void

    .line 88
    :goto_2
    monitor-exit p0

    .line 89
    throw p1
.end method

.method public final declared-synchronized c(Lrq1;Lpb4;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    iget p1, p0, Lcv3;->r:I

    .line 6
    .line 7
    iget v0, p2, Lpb4;->a:I

    .line 8
    .line 9
    and-int/lit8 v0, v0, 0x10

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object p2, p2, Lpb4;->b:[I

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    aget p2, p2, v0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const p2, 0x7fffffff

    .line 20
    .line 21
    .line 22
    :goto_0
    iput p2, p0, Lcv3;->r:I

    .line 23
    .line 24
    if-ge p2, p1, :cond_2

    .line 25
    .line 26
    iget-object p1, p0, Lcv3;->c:Ldv3;

    .line 27
    .line 28
    iget-object p2, p0, Lcv3;->d:Lo34;

    .line 29
    .line 30
    iget-object p2, p2, Lo34;->a:Lf6;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object p1, p1, Ldv3;->c:Ljava/util/Map;

    .line 39
    .line 40
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    if-nez p1, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    if-le p2, p1, :cond_3

    .line 56
    .line 57
    iget-object p1, p0, Lcv3;->c:Ldv3;

    .line 58
    .line 59
    iget-object p2, p1, Ldv3;->d:Lfr4;

    .line 60
    .line 61
    iget-object p1, p1, Ldv3;->e:Lgr0;

    .line 62
    .line 63
    invoke-static {p2, p1}, Lfr4;->e(Lfr4;Lar4;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    :cond_3
    :goto_1
    monitor-exit p0

    .line 67
    return-void

    .line 68
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    throw p1
.end method

.method public final cancel()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcv3;->e:Ljava/net/Socket;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Lze5;->c(Ljava/net/Socket;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final d(Lyq1;)V
    .locals 1

    .line 1
    sget-object p0, Lb21;->t:Lb21;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p1, p0, v0}, Lyq1;->c(Lb21;Ljava/io/IOException;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final f(Lf6;Ljava/util/List;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lf6;->h:Lgr1;

    .line 5
    .line 6
    sget-object v1, Lze5;->a:Ltl1;

    .line 7
    .line 8
    iget-object v1, p0, Lcv3;->s:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    iget v2, p0, Lcv3;->r:I

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-ge v1, v2, :cond_a

    .line 18
    .line 19
    iget-boolean v1, p0, Lcv3;->m:Z

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto/16 :goto_2

    .line 24
    .line 25
    :cond_0
    iget-object v1, p0, Lcv3;->d:Lo34;

    .line 26
    .line 27
    iget-object v2, v1, Lo34;->a:Lf6;

    .line 28
    .line 29
    iget-object v4, v1, Lo34;->a:Lf6;

    .line 30
    .line 31
    invoke-virtual {v2, p1}, Lf6;->a(Lf6;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    goto/16 :goto_2

    .line 38
    .line 39
    :cond_1
    iget-object v2, v0, Lgr1;->d:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v5, v0, Lgr1;->d:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v6, v4, Lf6;->h:Lgr1;

    .line 44
    .line 45
    iget-object v6, v6, Lgr1;->d:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {v2, v6}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    goto/16 :goto_1

    .line 54
    .line 55
    :cond_2
    iget-object v2, p0, Lcv3;->l:Lrq1;

    .line 56
    .line 57
    if-nez v2, :cond_3

    .line 58
    .line 59
    goto/16 :goto_2

    .line 60
    .line 61
    :cond_3
    if-eqz p2, :cond_a

    .line 62
    .line 63
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_4

    .line 68
    .line 69
    goto/16 :goto_2

    .line 70
    .line 71
    :cond_4
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-eqz v2, :cond_a

    .line 80
    .line 81
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    check-cast v2, Lo34;

    .line 86
    .line 87
    iget-object v6, v2, Lo34;->b:Ljava/net/Proxy;

    .line 88
    .line 89
    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 90
    .line 91
    .line 92
    move-result-object v6

    .line 93
    sget-object v7, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    .line 94
    .line 95
    if-ne v6, v7, :cond_5

    .line 96
    .line 97
    iget-object v6, v1, Lo34;->b:Ljava/net/Proxy;

    .line 98
    .line 99
    invoke-virtual {v6}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    if-ne v6, v7, :cond_5

    .line 104
    .line 105
    iget-object v6, v1, Lo34;->c:Ljava/net/InetSocketAddress;

    .line 106
    .line 107
    iget-object v2, v2, Lo34;->c:Ljava/net/InetSocketAddress;

    .line 108
    .line 109
    invoke-static {v6, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-eqz v2, :cond_5

    .line 114
    .line 115
    iget-object p2, p1, Lf6;->d:Ljavax/net/ssl/HostnameVerifier;

    .line 116
    .line 117
    sget-object v1, Lm83;->a:Lm83;

    .line 118
    .line 119
    if-eq p2, v1, :cond_6

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_6
    sget-object p2, Lze5;->a:Ltl1;

    .line 123
    .line 124
    iget-object p2, v4, Lf6;->h:Lgr1;

    .line 125
    .line 126
    iget v0, v0, Lgr1;->e:I

    .line 127
    .line 128
    iget v1, p2, Lgr1;->e:I

    .line 129
    .line 130
    if-eq v0, v1, :cond_7

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_7
    iget-object p2, p2, Lgr1;->d:Ljava/lang/String;

    .line 134
    .line 135
    invoke-static {v5, p2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result p2

    .line 139
    iget-object v0, p0, Lcv3;->g:Ljl1;

    .line 140
    .line 141
    if-eqz p2, :cond_8

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_8
    iget-boolean p0, p0, Lcv3;->n:Z

    .line 145
    .line 146
    if-nez p0, :cond_a

    .line 147
    .line 148
    if-eqz v0, :cond_a

    .line 149
    .line 150
    invoke-virtual {v0}, Ljl1;->a()Ljava/util/List;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    if-nez p2, :cond_a

    .line 159
    .line 160
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    check-cast p0, Ljava/security/cert/X509Certificate;

    .line 168
    .line 169
    invoke-static {v5, p0}, Lm83;->c(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    .line 170
    .line 171
    .line 172
    move-result p0

    .line 173
    if-eqz p0, :cond_a

    .line 174
    .line 175
    :goto_0
    :try_start_0
    iget-object p0, p1, Lf6;->e:Lo00;

    .line 176
    .line 177
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0}, Ljl1;->a()Ljava/util/List;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    iget-object p0, p0, Lo00;->a:Ljava/util/Set;

    .line 194
    .line 195
    check-cast p0, Ljava/lang/Iterable;

    .line 196
    .line 197
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    if-nez p1, :cond_9

    .line 206
    .line 207
    :goto_1
    const/4 p0, 0x1

    .line 208
    return p0

    .line 209
    :cond_9
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    new-instance p0, Ljava/lang/ClassCastException;

    .line 217
    .line 218
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 219
    .line 220
    .line 221
    throw p0
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 222
    :catch_0
    :cond_a
    :goto_2
    return v3
.end method

.method public final g(Z)Z
    .locals 9

    .line 1
    sget-object v0, Lze5;->a:Ltl1;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object v2, p0, Lcv3;->e:Ljava/net/Socket;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v3, p0, Lcv3;->f:Ljava/net/Socket;

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v4, p0, Lcv3;->i:Lfw;

    .line 18
    .line 19
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/net/Socket;->isClosed()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const/4 v5, 0x0

    .line 27
    if-nez v2, :cond_5

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/net/Socket;->isClosed()Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_5

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/net/Socket;->isInputShutdown()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_5

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/net/Socket;->isOutputShutdown()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_0
    iget-object v2, p0, Lcv3;->l:Lrq1;

    .line 49
    .line 50
    const/4 v6, 0x1

    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    monitor-enter v2

    .line 54
    :try_start_0
    iget-boolean p0, v2, Lrq1;->s:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    if-eqz p0, :cond_1

    .line 57
    .line 58
    monitor-exit v2

    .line 59
    return v5

    .line 60
    :cond_1
    :try_start_1
    iget-wide p0, v2, Lrq1;->A:J

    .line 61
    .line 62
    iget-wide v3, v2, Lrq1;->z:J

    .line 63
    .line 64
    cmp-long p0, p0, v3

    .line 65
    .line 66
    if-gez p0, :cond_2

    .line 67
    .line 68
    iget-wide p0, v2, Lrq1;->B:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    .line 70
    cmp-long p0, v0, p0

    .line 71
    .line 72
    if-ltz p0, :cond_2

    .line 73
    .line 74
    monitor-exit v2

    .line 75
    return v5

    .line 76
    :catchall_0
    move-exception p0

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    monitor-exit v2

    .line 79
    return v6

    .line 80
    :goto_0
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 81
    throw p0

    .line 82
    :cond_3
    monitor-enter p0

    .line 83
    :try_start_3
    iget-wide v7, p0, Lcv3;->t:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 84
    .line 85
    sub-long/2addr v0, v7

    .line 86
    monitor-exit p0

    .line 87
    const-wide v7, 0x2540be400L

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    cmp-long p0, v0, v7

    .line 93
    .line 94
    if-ltz p0, :cond_4

    .line 95
    .line 96
    if-eqz p1, :cond_4

    .line 97
    .line 98
    :try_start_4
    invoke-virtual {v3}, Ljava/net/Socket;->getSoTimeout()I

    .line 99
    .line 100
    .line 101
    move-result p0
    :try_end_4
    .catch Ljava/net/SocketTimeoutException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 102
    :try_start_5
    invoke-virtual {v3, v6}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v4}, Lfw;->l()Z

    .line 106
    .line 107
    .line 108
    move-result p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 109
    xor-int/2addr p1, v6

    .line 110
    :try_start_6
    invoke-virtual {v3, p0}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 111
    .line 112
    .line 113
    return p1

    .line 114
    :catchall_1
    move-exception p1

    .line 115
    invoke-virtual {v3, p0}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 116
    .line 117
    .line 118
    throw p1
    :try_end_6
    .catch Ljava/net/SocketTimeoutException; {:try_start_6 .. :try_end_6} :catch_0
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_1

    .line 119
    :catch_0
    move v5, v6

    .line 120
    :catch_1
    return v5

    .line 121
    :cond_4
    return v6

    .line 122
    :catchall_2
    move-exception p1

    .line 123
    monitor-exit p0

    .line 124
    throw p1

    .line 125
    :cond_5
    :goto_1
    return v5
.end method

.method public final h()Lo34;
    .locals 0

    .line 1
    iget-object p0, p0, Lcv3;->d:Lo34;

    .line 2
    .line 3
    return-object p0
.end method

.method public final i()V
    .locals 8

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lcv3;->t:J

    .line 6
    .line 7
    iget-object v0, p0, Lcv3;->h:Lpr3;

    .line 8
    .line 9
    sget-object v1, Lpr3;->s:Lpr3;

    .line 10
    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    sget-object v1, Lpr3;->t:Lpr3;

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-void

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, Lcv3;->f:Ljava/net/Socket;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, Lcv3;->i:Lfw;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lcv3;->j:Lew;

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 36
    .line 37
    .line 38
    sget-object v4, Lr81;->a:Lr81;

    .line 39
    .line 40
    new-instance v5, Llv4;

    .line 41
    .line 42
    iget-object v6, p0, Lcv3;->b:Lgr4;

    .line 43
    .line 44
    invoke-direct {v5, v6}, Llv4;-><init>(Lgr4;)V

    .line 45
    .line 46
    .line 47
    iget-object v6, p0, Lcv3;->d:Lo34;

    .line 48
    .line 49
    iget-object v6, v6, Lo34;->a:Lf6;

    .line 50
    .line 51
    iget-object v6, v6, Lf6;->h:Lgr1;

    .line 52
    .line 53
    iget-object v6, v6, Lgr1;->d:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iput-object v0, v5, Llv4;->o:Ljava/lang/Object;

    .line 59
    .line 60
    new-instance v0, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 63
    .line 64
    .line 65
    sget-object v7, Lze5;->c:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const/16 v7, 0x20

    .line 71
    .line 72
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, v5, Llv4;->p:Ljava/lang/Object;

    .line 83
    .line 84
    iput-object v1, v5, Llv4;->q:Ljava/lang/Object;

    .line 85
    .line 86
    iput-object v2, v5, Llv4;->r:Ljava/lang/Object;

    .line 87
    .line 88
    iput-object p0, v5, Llv4;->s:Ljava/lang/Object;

    .line 89
    .line 90
    iput-object v4, v5, Llv4;->t:Ljava/lang/Object;

    .line 91
    .line 92
    new-instance v0, Lrq1;

    .line 93
    .line 94
    invoke-direct {v0, v5}, Lrq1;-><init>(Llv4;)V

    .line 95
    .line 96
    .line 97
    iput-object v0, p0, Lcv3;->l:Lrq1;

    .line 98
    .line 99
    sget-object v1, Lrq1;->M:Lpb4;

    .line 100
    .line 101
    iget v2, v1, Lpb4;->a:I

    .line 102
    .line 103
    and-int/lit8 v2, v2, 0x10

    .line 104
    .line 105
    const/4 v4, 0x4

    .line 106
    if-eqz v2, :cond_2

    .line 107
    .line 108
    iget-object v1, v1, Lpb4;->b:[I

    .line 109
    .line 110
    aget v1, v1, v4

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_2
    const v1, 0x7fffffff

    .line 114
    .line 115
    .line 116
    :goto_1
    iput v1, p0, Lcv3;->r:I

    .line 117
    .line 118
    iget-object p0, v0, Lrq1;->J:Lzq1;

    .line 119
    .line 120
    const-string v1, ">> CONNECTION "

    .line 121
    .line 122
    monitor-enter p0

    .line 123
    :try_start_0
    iget-boolean v2, p0, Lzq1;->q:Z

    .line 124
    .line 125
    if-nez v2, :cond_b

    .line 126
    .line 127
    sget-object v2, Lzq1;->s:Ljava/util/logging/Logger;

    .line 128
    .line 129
    sget-object v5, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 130
    .line 131
    invoke-virtual {v2, v5}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    if-eqz v5, :cond_3

    .line 136
    .line 137
    new-instance v5, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v5, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    sget-object v1, Liq1;->a:Lyw;

    .line 143
    .line 144
    invoke-virtual {v1}, Lyw;->e()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    new-array v5, v3, [Ljava/lang/Object;

    .line 156
    .line 157
    invoke-static {v1, v5}, Lze5;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {v2, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :catchall_0
    move-exception v0

    .line 166
    goto/16 :goto_8

    .line 167
    .line 168
    :cond_3
    :goto_2
    iget-object v1, p0, Lzq1;->n:Lew;

    .line 169
    .line 170
    sget-object v2, Liq1;->a:Lyw;

    .line 171
    .line 172
    invoke-interface {v1, v2}, Lew;->A(Lyw;)Lew;

    .line 173
    .line 174
    .line 175
    iget-object v1, p0, Lzq1;->n:Lew;

    .line 176
    .line 177
    invoke-interface {v1}, Lew;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 178
    .line 179
    .line 180
    monitor-exit p0

    .line 181
    iget-object v1, v0, Lrq1;->J:Lzq1;

    .line 182
    .line 183
    iget-object p0, v0, Lrq1;->D:Lpb4;

    .line 184
    .line 185
    monitor-enter v1

    .line 186
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    iget-boolean v2, v1, Lzq1;->q:Z

    .line 190
    .line 191
    if-nez v2, :cond_a

    .line 192
    .line 193
    iget v2, p0, Lpb4;->a:I

    .line 194
    .line 195
    invoke-static {v2}, Ljava/lang/Integer;->bitCount(I)I

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    mul-int/lit8 v2, v2, 0x6

    .line 200
    .line 201
    invoke-virtual {v1, v3, v2, v4, v3}, Lzq1;->j(IIII)V

    .line 202
    .line 203
    .line 204
    move v2, v3

    .line 205
    :goto_3
    const/16 v5, 0xa

    .line 206
    .line 207
    if-ge v2, v5, :cond_8

    .line 208
    .line 209
    const/4 v5, 0x1

    .line 210
    shl-int v6, v5, v2

    .line 211
    .line 212
    iget v7, p0, Lpb4;->a:I

    .line 213
    .line 214
    and-int/2addr v6, v7

    .line 215
    if-eqz v6, :cond_4

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_4
    move v5, v3

    .line 219
    :goto_4
    if-eqz v5, :cond_7

    .line 220
    .line 221
    if-eq v2, v4, :cond_6

    .line 222
    .line 223
    const/4 v5, 0x7

    .line 224
    if-eq v2, v5, :cond_5

    .line 225
    .line 226
    move v5, v2

    .line 227
    goto :goto_5

    .line 228
    :cond_5
    move v5, v4

    .line 229
    goto :goto_5

    .line 230
    :cond_6
    const/4 v5, 0x3

    .line 231
    :goto_5
    iget-object v6, v1, Lzq1;->n:Lew;

    .line 232
    .line 233
    invoke-interface {v6, v5}, Lew;->writeShort(I)Lew;

    .line 234
    .line 235
    .line 236
    iget-object v5, v1, Lzq1;->n:Lew;

    .line 237
    .line 238
    iget-object v6, p0, Lpb4;->b:[I

    .line 239
    .line 240
    aget v6, v6, v2

    .line 241
    .line 242
    invoke-interface {v5, v6}, Lew;->writeInt(I)Lew;

    .line 243
    .line 244
    .line 245
    goto :goto_6

    .line 246
    :catchall_1
    move-exception p0

    .line 247
    goto :goto_7

    .line 248
    :cond_7
    :goto_6
    add-int/lit8 v2, v2, 0x1

    .line 249
    .line 250
    goto :goto_3

    .line 251
    :cond_8
    iget-object p0, v1, Lzq1;->n:Lew;

    .line 252
    .line 253
    invoke-interface {p0}, Lew;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 254
    .line 255
    .line 256
    monitor-exit v1

    .line 257
    iget-object p0, v0, Lrq1;->D:Lpb4;

    .line 258
    .line 259
    invoke-virtual {p0}, Lpb4;->a()I

    .line 260
    .line 261
    .line 262
    move-result p0

    .line 263
    const v1, 0xffff

    .line 264
    .line 265
    .line 266
    if-eq p0, v1, :cond_9

    .line 267
    .line 268
    iget-object v2, v0, Lrq1;->J:Lzq1;

    .line 269
    .line 270
    sub-int/2addr p0, v1

    .line 271
    int-to-long v4, p0

    .line 272
    invoke-virtual {v2, v3, v4, v5}, Lzq1;->v(IJ)V

    .line 273
    .line 274
    .line 275
    :cond_9
    iget-object p0, v0, Lrq1;->t:Lgr4;

    .line 276
    .line 277
    invoke-virtual {p0}, Lgr4;->e()Lfr4;

    .line 278
    .line 279
    .line 280
    move-result-object p0

    .line 281
    iget-object v1, v0, Lrq1;->p:Ljava/lang/String;

    .line 282
    .line 283
    iget-object v0, v0, Lrq1;->K:Lmq1;

    .line 284
    .line 285
    invoke-static {p0, v1, v0}, Lfr4;->c(Lfr4;Ljava/lang/String;Lgf1;)V

    .line 286
    .line 287
    .line 288
    return-void

    .line 289
    :cond_a
    :try_start_2
    new-instance p0, Ljava/io/IOException;

    .line 290
    .line 291
    const-string v0, "closed"

    .line 292
    .line 293
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    throw p0

    .line 297
    :goto_7
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 298
    throw p0

    .line 299
    :cond_b
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    .line 300
    .line 301
    const-string v1, "closed"

    .line 302
    .line 303
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    throw v0

    .line 307
    :goto_8
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 308
    throw v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Connection{"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcv3;->d:Lo34;

    .line 9
    .line 10
    iget-object v2, v1, Lo34;->a:Lf6;

    .line 11
    .line 12
    iget-object v2, v2, Lf6;->h:Lgr1;

    .line 13
    .line 14
    iget-object v2, v2, Lgr1;->d:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const/16 v2, 0x3a

    .line 20
    .line 21
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v2, v1, Lo34;->a:Lf6;

    .line 25
    .line 26
    iget-object v2, v2, Lf6;->h:Lgr1;

    .line 27
    .line 28
    iget v2, v2, Lgr1;->e:I

    .line 29
    .line 30
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v2, ", proxy="

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v2, v1, Lo34;->b:Ljava/net/Proxy;

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v2, " hostAddress="

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v1, v1, Lo34;->c:Ljava/net/InetSocketAddress;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, " cipherSuite="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lcv3;->g:Ljl1;

    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    iget-object v1, v1, Ljl1;->b:Lv20;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    const-string v1, "none"

    .line 66
    .line 67
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, " protocol="

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-object p0, p0, Lcv3;->h:Lpr3;

    .line 76
    .line 77
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const/16 p0, 0x7d

    .line 81
    .line 82
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0
.end method
