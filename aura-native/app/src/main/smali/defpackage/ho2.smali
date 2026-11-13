.class public final Ldefpackage/ho2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public A:I

.field public B:Z

.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Ldefpackage/nm0;

.field public final d:Landroid/media/metrics/PlaybackSession;

.field public final e:J

.field public final f:Ldefpackage/bu4;

.field public final g:Ldefpackage/zt4;

.field public final h:Ljava/util/HashMap;

.field public final i:Ljava/util/HashMap;

.field public j:Ljava/lang/String;

.field public k:Landroid/media/metrics/PlaybackMetrics$Builder;

.field public l:I

.field public m:I

.field public n:I

.field public o:Landroidx/media3/common/PlaybackException;

.field public p:Ldefpackage/ue1;

.field public q:Ldefpackage/ue1;

.field public r:Ldefpackage/ue1;

.field public s:Ldefpackage/tb1;

.field public t:Ldefpackage/tb1;

.field public u:Ldefpackage/tb1;

.field public v:Z

.field public w:I

.field public x:Z

.field public y:I

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/media/metrics/PlaybackSession;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Ldefpackage/ho2;->a:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Ldefpackage/ho2;->d:Landroid/media/metrics/PlaybackSession;

    .line 11
    .line 12
    invoke-static {}, Ldefpackage/uo;->t()Ljava/util/concurrent/Executor;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Ldefpackage/ho2;->b:Ljava/util/concurrent/Executor;

    .line 17
    .line 18
    new-instance p1, Ldefpackage/bu4;

    .line 19
    .line 20
    invoke-direct {p1}, Ldefpackage/bu4;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Ldefpackage/ho2;->f:Ldefpackage/bu4;

    .line 24
    .line 25
    new-instance p1, Ldefpackage/zt4;

    .line 26
    .line 27
    invoke-direct {p1}, Ldefpackage/zt4;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Ldefpackage/ho2;->g:Ldefpackage/zt4;

    .line 31
    .line 32
    new-instance p1, Ljava/util/HashMap;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Ldefpackage/ho2;->i:Ljava/util/HashMap;

    .line 38
    .line 39
    new-instance p1, Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Ldefpackage/ho2;->h:Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 47
    .line 48
    .line 49
    move-result-wide p1

    .line 50
    iput-wide p1, p0, Ldefpackage/ho2;->e:J

    .line 51
    .line 52
    const/4 p1, 0x0

    .line 53
    iput p1, p0, Ldefpackage/ho2;->m:I

    .line 54
    .line 55
    iput p1, p0, Ldefpackage/ho2;->n:I

    .line 56
    .line 57
    new-instance p1, Ldefpackage/nm0;

    .line 58
    .line 59
    invoke-direct {p1}, Ldefpackage/nm0;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, Ldefpackage/ho2;->c:Ldefpackage/nm0;

    .line 63
    .line 64
    iput-object p0, p1, Ldefpackage/nm0;->d:Ldefpackage/ho2;

    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/ue1;)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p1, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Ldefpackage/ho2;->c:Ldefpackage/nm0;

    .line 8
    .line 9
    monitor-enter p0

    .line 10
    :try_start_0
    iget-object v0, p0, Ldefpackage/nm0;->f:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    monitor-exit p0

    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p1

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public final b()V
    .locals 7

    .line 1
    iget-object v0, p0, Ldefpackage/ho2;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    iget-boolean v2, p0, Ldefpackage/ho2;->B:Z

    .line 7
    .line 8
    if-eqz v2, :cond_3

    .line 9
    .line 10
    iget v2, p0, Ldefpackage/ho2;->A:I

    .line 11
    .line 12
    invoke-static {v0, v2}, Ldefpackage/fo2;->w(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Ldefpackage/ho2;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 16
    .line 17
    iget v2, p0, Ldefpackage/ho2;->y:I

    .line 18
    .line 19
    invoke-static {v0, v2}, Ldefpackage/fo2;->y(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Ldefpackage/ho2;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 23
    .line 24
    iget v2, p0, Ldefpackage/ho2;->z:I

    .line 25
    .line 26
    invoke-static {v0, v2}, Ldefpackage/fo2;->A(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Ldefpackage/ho2;->h:Ljava/util/HashMap;

    .line 30
    .line 31
    iget-object v2, p0, Ldefpackage/ho2;->j:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/lang/Long;

    .line 38
    .line 39
    iget-object v2, p0, Ldefpackage/ho2;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 40
    .line 41
    const-wide/16 v3, 0x0

    .line 42
    .line 43
    if-nez v0, :cond_0

    .line 44
    .line 45
    move-wide v5, v3

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v5

    .line 51
    :goto_0
    invoke-static {v2, v5, v6}, Ldefpackage/fo2;->p(Landroid/media/metrics/PlaybackMetrics$Builder;J)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Ldefpackage/ho2;->i:Ljava/util/HashMap;

    .line 55
    .line 56
    iget-object v2, p0, Ldefpackage/ho2;->j:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ljava/lang/Long;

    .line 63
    .line 64
    iget-object v2, p0, Ldefpackage/ho2;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 65
    .line 66
    if-nez v0, :cond_1

    .line 67
    .line 68
    move-wide v5, v3

    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 71
    .line 72
    .line 73
    move-result-wide v5

    .line 74
    :goto_1
    invoke-static {v2, v5, v6}, Ldefpackage/fo2;->x(Landroid/media/metrics/PlaybackMetrics$Builder;J)V

    .line 75
    .line 76
    .line 77
    iget-object v2, p0, Ldefpackage/ho2;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 78
    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 82
    .line 83
    .line 84
    move-result-wide v5

    .line 85
    cmp-long v0, v5, v3

    .line 86
    .line 87
    if-lez v0, :cond_2

    .line 88
    .line 89
    const/4 v0, 0x1

    .line 90
    goto :goto_2

    .line 91
    :cond_2
    move v0, v1

    .line 92
    :goto_2
    invoke-static {v2, v0}, Ldefpackage/fo2;->B(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Ldefpackage/ho2;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 96
    .line 97
    invoke-static {v0}, Ldefpackage/fo2;->i(Landroid/media/metrics/PlaybackMetrics$Builder;)Landroid/media/metrics/PlaybackMetrics;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    new-instance v2, Ldefpackage/ws1;

    .line 102
    .line 103
    const/16 v3, 0x1a

    .line 104
    .line 105
    invoke-direct {v2, v3, p0, v0}, Ldefpackage/ws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iget-object v0, p0, Ldefpackage/ho2;->b:Ljava/util/concurrent/Executor;

    .line 109
    .line 110
    invoke-interface {v0, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    const/4 v0, 0x0

    .line 114
    iput-object v0, p0, Ldefpackage/ho2;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 115
    .line 116
    iput-object v0, p0, Ldefpackage/ho2;->j:Ljava/lang/String;

    .line 117
    .line 118
    iput v1, p0, Ldefpackage/ho2;->A:I

    .line 119
    .line 120
    iput v1, p0, Ldefpackage/ho2;->y:I

    .line 121
    .line 122
    iput v1, p0, Ldefpackage/ho2;->z:I

    .line 123
    .line 124
    iput-object v0, p0, Ldefpackage/ho2;->s:Ldefpackage/tb1;

    .line 125
    .line 126
    iput-object v0, p0, Ldefpackage/ho2;->t:Ldefpackage/tb1;

    .line 127
    .line 128
    iput-object v0, p0, Ldefpackage/ho2;->u:Ldefpackage/tb1;

    .line 129
    .line 130
    iput-boolean v1, p0, Ldefpackage/ho2;->B:Z

    .line 131
    .line 132
    return-void
.end method

.method public final c(Ldefpackage/cu4;Ldefpackage/mt2;)V
    .locals 8

    .line 1
    iget-object v0, p0, Ldefpackage/ho2;->k:Landroid/media/metrics/PlaybackMetrics$Builder;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object p2, p2, Ldefpackage/mt2;->a:Ljava/lang/Object;

    .line 7
    .line 8
    invoke-virtual {p1, p2}, Ldefpackage/cu4;->b(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    const/4 v1, -0x1

    .line 13
    if-ne p2, v1, :cond_1

    .line 14
    .line 15
    :goto_0
    return-void

    .line 16
    :cond_1
    iget-object v1, p0, Ldefpackage/ho2;->g:Ldefpackage/zt4;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-virtual {p1, p2, v1, v2}, Ldefpackage/cu4;->f(ILdefpackage/zt4;Z)Ldefpackage/zt4;

    .line 20
    .line 21
    .line 22
    iget p2, v1, Ldefpackage/zt4;->c:I

    .line 23
    .line 24
    iget-object v1, p0, Ldefpackage/ho2;->f:Ldefpackage/bu4;

    .line 25
    .line 26
    invoke-virtual {p1, p2, v1}, Ldefpackage/cu4;->n(ILdefpackage/bu4;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, v1, Ldefpackage/bu4;->b:Ldefpackage/gn2;

    .line 30
    .line 31
    iget-object p1, p1, Ldefpackage/gn2;->b:Ldefpackage/bn2;

    .line 32
    .line 33
    const/4 p2, 0x2

    .line 34
    const/4 v3, 0x1

    .line 35
    if-nez p1, :cond_2

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_2
    iget-object v2, p1, Ldefpackage/bn2;->a:Landroid/net/Uri;

    .line 39
    .line 40
    iget-object p1, p1, Ldefpackage/bn2;->b:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v2, p1}, Ldefpackage/f35;->J(Landroid/net/Uri;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_5

    .line 47
    .line 48
    if-eq p1, v3, :cond_4

    .line 49
    .line 50
    if-eq p1, p2, :cond_3

    .line 51
    .line 52
    move v2, v3

    .line 53
    goto :goto_1

    .line 54
    :cond_3
    const/4 v2, 0x4

    .line 55
    goto :goto_1

    .line 56
    :cond_4
    const/4 v2, 0x5

    .line 57
    goto :goto_1

    .line 58
    :cond_5
    const/4 v2, 0x3

    .line 59
    :goto_1
    invoke-static {v0, v2}, Ldefpackage/fo2;->C(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 60
    .line 61
    .line 62
    iget-wide v4, v1, Ldefpackage/bu4;->l:J

    .line 63
    .line 64
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    cmp-long p1, v4, v6

    .line 70
    .line 71
    if-eqz p1, :cond_6

    .line 72
    .line 73
    iget-boolean p1, v1, Ldefpackage/bu4;->j:Z

    .line 74
    .line 75
    if-nez p1, :cond_6

    .line 76
    .line 77
    iget-boolean p1, v1, Ldefpackage/bu4;->h:Z

    .line 78
    .line 79
    if-nez p1, :cond_6

    .line 80
    .line 81
    invoke-virtual {v1}, Ldefpackage/bu4;->a()Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-nez p1, :cond_6

    .line 86
    .line 87
    iget-wide v4, v1, Ldefpackage/bu4;->l:J

    .line 88
    .line 89
    invoke-static {v4, v5}, Ldefpackage/f35;->i0(J)J

    .line 90
    .line 91
    .line 92
    move-result-wide v4

    .line 93
    invoke-static {v0, v4, v5}, Ldefpackage/fo2;->z(Landroid/media/metrics/PlaybackMetrics$Builder;J)V

    .line 94
    .line 95
    .line 96
    :cond_6
    invoke-virtual {v1}, Ldefpackage/bu4;->a()Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_7

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_7
    move p2, v3

    .line 104
    :goto_2
    invoke-static {v0, p2}, Ldefpackage/fo2;->D(Landroid/media/metrics/PlaybackMetrics$Builder;I)V

    .line 105
    .line 106
    .line 107
    iput-boolean v3, p0, Ldefpackage/ho2;->B:Z

    .line 108
    .line 109
    return-void
.end method

.method public final d(Ldefpackage/q9;Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p1, p1, Ldefpackage/q9;->d:Ldefpackage/mt2;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Ldefpackage/mt2;->b()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-nez p1, :cond_2

    .line 10
    .line 11
    :cond_0
    iget-object p1, p0, Ldefpackage/ho2;->j:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {p0}, Ldefpackage/ho2;->b()V

    .line 21
    .line 22
    .line 23
    :cond_2
    :goto_0
    iget-object p1, p0, Ldefpackage/ho2;->h:Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Ldefpackage/ho2;->i:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-virtual {p0, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final e(IJLdefpackage/tb1;I)V
    .locals 2

    .line 1
    invoke-static {p1}, Ldefpackage/go2;->g(I)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-wide v0, p0, Ldefpackage/ho2;->e:J

    .line 6
    .line 7
    sub-long/2addr p2, v0

    .line 8
    invoke-static {p1, p2, p3}, Ldefpackage/fo2;->n(Landroid/media/metrics/TrackChangeEvent$Builder;J)Landroid/media/metrics/TrackChangeEvent$Builder;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 p2, 0x1

    .line 13
    if-eqz p4, :cond_d

    .line 14
    .line 15
    invoke-static {p1}, Ldefpackage/hd0;->r(Landroid/media/metrics/TrackChangeEvent$Builder;)V

    .line 16
    .line 17
    .line 18
    const/4 p3, 0x2

    .line 19
    if-eq p5, p2, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x3

    .line 22
    if-eq p5, p3, :cond_2

    .line 23
    .line 24
    if-eq p5, v0, :cond_0

    .line 25
    .line 26
    move v0, p2

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move v0, p3

    .line 31
    :cond_2
    :goto_0
    invoke-static {p1, v0}, Ldefpackage/hd0;->s(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 32
    .line 33
    .line 34
    iget-object p5, p4, Ldefpackage/tb1;->m:Ljava/lang/String;

    .line 35
    .line 36
    if-eqz p5, :cond_3

    .line 37
    .line 38
    invoke-static {p1, p5}, Ldefpackage/hd0;->t(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    :cond_3
    iget-object p5, p4, Ldefpackage/tb1;->n:Ljava/lang/String;

    .line 42
    .line 43
    if-eqz p5, :cond_4

    .line 44
    .line 45
    invoke-static {p1, p5}, Ldefpackage/hd0;->z(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    :cond_4
    iget-object p5, p4, Ldefpackage/tb1;->k:Ljava/lang/String;

    .line 49
    .line 50
    if-eqz p5, :cond_5

    .line 51
    .line 52
    invoke-static {p1, p5}, Ldefpackage/hd0;->B(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_5
    iget p5, p4, Ldefpackage/tb1;->j:I

    .line 56
    .line 57
    const/4 v0, -0x1

    .line 58
    if-eq p5, v0, :cond_6

    .line 59
    .line 60
    invoke-static {p1, p5}, Ldefpackage/hd0;->y(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 61
    .line 62
    .line 63
    :cond_6
    iget p5, p4, Ldefpackage/tb1;->u:I

    .line 64
    .line 65
    if-eq p5, v0, :cond_7

    .line 66
    .line 67
    invoke-static {p1, p5}, Ldefpackage/hd0;->A(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 68
    .line 69
    .line 70
    :cond_7
    iget p5, p4, Ldefpackage/tb1;->v:I

    .line 71
    .line 72
    if-eq p5, v0, :cond_8

    .line 73
    .line 74
    invoke-static {p1, p5}, Ldefpackage/hd0;->C(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 75
    .line 76
    .line 77
    :cond_8
    iget p5, p4, Ldefpackage/tb1;->F:I

    .line 78
    .line 79
    if-eq p5, v0, :cond_9

    .line 80
    .line 81
    invoke-static {p1, p5}, Ldefpackage/hd0;->D(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 82
    .line 83
    .line 84
    :cond_9
    iget p5, p4, Ldefpackage/tb1;->G:I

    .line 85
    .line 86
    if-eq p5, v0, :cond_a

    .line 87
    .line 88
    invoke-static {p1, p5}, Ldefpackage/go2;->p(Landroid/media/metrics/TrackChangeEvent$Builder;I)V

    .line 89
    .line 90
    .line 91
    :cond_a
    iget-object p5, p4, Ldefpackage/tb1;->d:Ljava/lang/String;

    .line 92
    .line 93
    if-eqz p5, :cond_c

    .line 94
    .line 95
    sget-object v1, Ldefpackage/f35;->a:Ljava/lang/String;

    .line 96
    .line 97
    const-string v1, "-"

    .line 98
    .line 99
    invoke-virtual {p5, v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p5

    .line 103
    const/4 v0, 0x0

    .line 104
    aget-object v0, p5, v0

    .line 105
    .line 106
    array-length v1, p5

    .line 107
    if-lt v1, p3, :cond_b

    .line 108
    .line 109
    aget-object p3, p5, p2

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_b
    const/4 p3, 0x0

    .line 113
    :goto_1
    invoke-static {v0, p3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 114
    .line 115
    .line 116
    move-result-object p3

    .line 117
    iget-object p5, p3, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p5, Ljava/lang/String;

    .line 120
    .line 121
    invoke-static {p1, p5}, Ldefpackage/go2;->q(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    iget-object p3, p3, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 125
    .line 126
    if-eqz p3, :cond_c

    .line 127
    .line 128
    check-cast p3, Ljava/lang/String;

    .line 129
    .line 130
    invoke-static {p1, p3}, Ldefpackage/go2;->C(Landroid/media/metrics/TrackChangeEvent$Builder;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_c
    iget p3, p4, Ldefpackage/tb1;->y:F

    .line 134
    .line 135
    const/high16 p4, -0x40800000    # -1.0f

    .line 136
    .line 137
    cmpl-float p4, p3, p4

    .line 138
    .line 139
    if-eqz p4, :cond_e

    .line 140
    .line 141
    invoke-static {p1, p3}, Ldefpackage/go2;->o(Landroid/media/metrics/TrackChangeEvent$Builder;F)V

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_d
    invoke-static {p1}, Ldefpackage/go2;->n(Landroid/media/metrics/TrackChangeEvent$Builder;)V

    .line 146
    .line 147
    .line 148
    :cond_e
    :goto_2
    iput-boolean p2, p0, Ldefpackage/ho2;->B:Z

    .line 149
    .line 150
    invoke-static {p1}, Ldefpackage/hd0;->l(Landroid/media/metrics/TrackChangeEvent$Builder;)Landroid/media/metrics/TrackChangeEvent;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    new-instance p2, Ldefpackage/ws1;

    .line 155
    .line 156
    const/16 p3, 0x17

    .line 157
    .line 158
    invoke-direct {p2, p3, p0, p1}, Ldefpackage/ws1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    iget-object p0, p0, Ldefpackage/ho2;->b:Ljava/util/concurrent/Executor;

    .line 162
    .line 163
    invoke-interface {p0, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 164
    .line 165
    .line 166
    return-void
.end method
