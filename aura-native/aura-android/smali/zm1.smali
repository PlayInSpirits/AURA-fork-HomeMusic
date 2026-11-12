.class public final Lzm1;
.super Lbq;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final h:Lxk0;

.field public final i:Lzh0;

.field public final j:Li80;

.field public final k:Lww0;

.field public final l:Li80;

.field public final m:Z

.field public final n:I

.field public final o:Lal0;

.field public final p:J

.field public q:Lan2;

.field public r:Lrw4;

.field public s:Lgn2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "media3.exoplayer.hls"

    .line 2
    .line 3
    invoke-static {v0}, Lhn2;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Lgn2;Lzh0;Lxk0;Li80;Lww0;Li80;Lal0;JZI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lbq;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzm1;->s:Lgn2;

    .line 5
    .line 6
    iget-object p1, p1, Lgn2;->c:Lan2;

    .line 7
    .line 8
    iput-object p1, p0, Lzm1;->q:Lan2;

    .line 9
    .line 10
    iput-object p2, p0, Lzm1;->i:Lzh0;

    .line 11
    .line 12
    iput-object p3, p0, Lzm1;->h:Lxk0;

    .line 13
    .line 14
    iput-object p4, p0, Lzm1;->j:Li80;

    .line 15
    .line 16
    iput-object p5, p0, Lzm1;->k:Lww0;

    .line 17
    .line 18
    iput-object p6, p0, Lzm1;->l:Li80;

    .line 19
    .line 20
    iput-object p7, p0, Lzm1;->o:Lal0;

    .line 21
    .line 22
    iput-wide p8, p0, Lzm1;->p:J

    .line 23
    .line 24
    iput-boolean p10, p0, Lzm1;->m:Z

    .line 25
    .line 26
    iput p11, p0, Lzm1;->n:I

    .line 27
    .line 28
    return-void
.end method

.method public static t(JLjava/util/List;)Ltm1;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_2

    .line 8
    .line 9
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Ltm1;

    .line 14
    .line 15
    iget-wide v3, v2, Lwm1;->r:J

    .line 16
    .line 17
    cmp-long v5, v3, p0

    .line 18
    .line 19
    if-gtz v5, :cond_0

    .line 20
    .line 21
    iget-boolean v5, v2, Ltm1;->y:Z

    .line 22
    .line 23
    if-eqz v5, :cond_0

    .line 24
    .line 25
    move-object v0, v2

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    cmp-long v2, v3, p0

    .line 28
    .line 29
    if-lez v2, :cond_1

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    :goto_2
    return-object v0
.end method


# virtual methods
.method public final a(Lgn2;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Lzm1;->h()Lgn2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object v0, p0, Lgn2;->b:Lbn2;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v1, p1, Lgn2;->b:Lbn2;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v2, v1, Lbn2;->a:Landroid/net/Uri;

    .line 15
    .line 16
    iget-object v3, v0, Lbn2;->a:Landroid/net/Uri;

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    iget-object v2, v1, Lbn2;->e:Ljava/util/List;

    .line 25
    .line 26
    iget-object v3, v0, Lbn2;->e:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v2, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_0

    .line 33
    .line 34
    iget-object v1, v1, Lbn2;->c:Lym2;

    .line 35
    .line 36
    iget-object v0, v0, Lbn2;->c:Lym2;

    .line 37
    .line 38
    invoke-static {v1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    iget-object p0, p0, Lgn2;->c:Lan2;

    .line 45
    .line 46
    iget-object p1, p1, Lgn2;->c:Lan2;

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Lan2;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_0

    .line 53
    .line 54
    const/4 p0, 0x1

    .line 55
    return p0

    .line 56
    :cond_0
    const/4 p0, 0x0

    .line 57
    return p0
.end method

.method public final b(Lmt2;Ln9;J)Lno2;
    .locals 14

    .line 1
    new-instance v8, Lue1;

    .line 2
    .line 3
    iget-object v0, p0, Lbq;->c:Lue1;

    .line 4
    .line 5
    iget-object v0, v0, Lue1;->q:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-direct {v8, v0, v2, p1, v1}, Lue1;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 13
    .line 14
    .line 15
    new-instance v6, Lsw0;

    .line 16
    .line 17
    iget-object v0, p0, Lbq;->d:Lsw0;

    .line 18
    .line 19
    iget-object v0, v0, Lsw0;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 20
    .line 21
    invoke-direct {v6, v0, v2, p1}, Lsw0;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILmt2;)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Lpm1;

    .line 25
    .line 26
    iget-object v4, p0, Lzm1;->r:Lrw4;

    .line 27
    .line 28
    iget-object v13, p0, Lbq;->g:Lik3;

    .line 29
    .line 30
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lzm1;->h:Lxk0;

    .line 34
    .line 35
    iget-object v2, p0, Lzm1;->o:Lal0;

    .line 36
    .line 37
    iget-object v3, p0, Lzm1;->i:Lzh0;

    .line 38
    .line 39
    iget-object v5, p0, Lzm1;->k:Lww0;

    .line 40
    .line 41
    iget-object v7, p0, Lzm1;->l:Li80;

    .line 42
    .line 43
    iget-object v10, p0, Lzm1;->j:Li80;

    .line 44
    .line 45
    iget-boolean v11, p0, Lzm1;->m:Z

    .line 46
    .line 47
    iget v12, p0, Lzm1;->n:I

    .line 48
    .line 49
    move-object/from16 v9, p2

    .line 50
    .line 51
    invoke-direct/range {v0 .. v13}, Lpm1;-><init>(Lxk0;Lal0;Lzh0;Lrw4;Lww0;Lsw0;Li80;Lue1;Ln9;Li80;ZILik3;)V

    .line 52
    .line 53
    .line 54
    return-object v0
.end method

.method public final declared-synchronized h()Lgn2;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lzm1;->s:Lgn2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-object v0

    .line 6
    :catchall_0
    move-exception v0

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw v0
.end method

.method public final j()V
    .locals 3

    .line 1
    iget-object p0, p0, Lzm1;->o:Lal0;

    .line 2
    .line 3
    iget-object v0, p0, Lal0;->t:Li61;

    .line 4
    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    iget-object v1, v0, Li61;->q:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/io/IOException;

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lid2;

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    iget v1, v0, Lid2;->n:I

    .line 20
    .line 21
    iget-object v2, v0, Lid2;->r:Ljava/io/IOException;

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    iget v0, v0, Lid2;->s:I

    .line 26
    .line 27
    if-gt v0, v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    throw v2

    .line 31
    :cond_1
    throw v1

    .line 32
    :cond_2
    :goto_0
    iget-object v0, p0, Lal0;->x:Landroid/net/Uri;

    .line 33
    .line 34
    if-eqz v0, :cond_7

    .line 35
    .line 36
    iget-object p0, p0, Lal0;->q:Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    check-cast p0, Lzk0;

    .line 43
    .line 44
    iget-object v0, p0, Lzk0;->o:Li61;

    .line 45
    .line 46
    iget-object v1, v0, Li61;->q:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v1, Ljava/io/IOException;

    .line 49
    .line 50
    if-nez v1, :cond_6

    .line 51
    .line 52
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Lid2;

    .line 55
    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    iget v1, v0, Lid2;->n:I

    .line 59
    .line 60
    iget-object v2, v0, Lid2;->r:Ljava/io/IOException;

    .line 61
    .line 62
    if-eqz v2, :cond_4

    .line 63
    .line 64
    iget v0, v0, Lid2;->s:I

    .line 65
    .line 66
    if-gt v0, v1, :cond_3

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    throw v2

    .line 70
    :cond_4
    :goto_1
    iget-object p0, p0, Lzk0;->w:Ljava/io/IOException;

    .line 71
    .line 72
    if-nez p0, :cond_5

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_5
    throw p0

    .line 76
    :cond_6
    throw v1

    .line 77
    :cond_7
    :goto_2
    return-void
.end method

.method public final l(Lrw4;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iput-object v1, v0, Lzm1;->r:Lrw4;

    .line 6
    .line 7
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v2, v0, Lbq;->g:Lik3;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v3, v0, Lzm1;->k:Lww0;

    .line 20
    .line 21
    invoke-interface {v3, v1, v2}, Lww0;->e(Landroid/os/Looper;Lik3;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v3}, Lww0;->b()V

    .line 25
    .line 26
    .line 27
    new-instance v1, Lue1;

    .line 28
    .line 29
    iget-object v2, v0, Lbq;->c:Lue1;

    .line 30
    .line 31
    iget-object v2, v2, Lue1;->q:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 34
    .line 35
    const/16 v3, 0x8

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    invoke-direct {v1, v2, v4, v5, v3}, Lue1;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lzm1;->h()Lgn2;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    iget-object v2, v2, Lgn2;->b:Lbn2;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object v7, v2, Lbn2;->a:Landroid/net/Uri;

    .line 52
    .line 53
    iget-object v2, v0, Lzm1;->o:Lal0;

    .line 54
    .line 55
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-static {v5}, Lf35;->p(Lnk2;)Landroid/os/Handler;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    iput-object v3, v2, Lal0;->u:Landroid/os/Handler;

    .line 63
    .line 64
    iput-object v1, v2, Lal0;->s:Lue1;

    .line 65
    .line 66
    iput-object v0, v2, Lal0;->v:Lzm1;

    .line 67
    .line 68
    sget-object v12, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 69
    .line 70
    const-string v0, "The uri must be set."

    .line 71
    .line 72
    invoke-static {v7, v0}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    new-instance v6, Lii0;

    .line 76
    .line 77
    const-wide/16 v8, 0x0

    .line 78
    .line 79
    const/4 v10, 0x1

    .line 80
    const/4 v11, 0x0

    .line 81
    const-wide/16 v13, 0x0

    .line 82
    .line 83
    const-wide/16 v15, -0x1

    .line 84
    .line 85
    const/16 v17, 0x0

    .line 86
    .line 87
    const/16 v18, 0x1

    .line 88
    .line 89
    invoke-direct/range {v6 .. v18}, Lii0;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;I)V

    .line 90
    .line 91
    .line 92
    new-instance v0, Lde3;

    .line 93
    .line 94
    iget-object v1, v2, Lal0;->n:Lzh0;

    .line 95
    .line 96
    iget-object v1, v1, Lzh0;->o:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v1, Lbi0;

    .line 99
    .line 100
    invoke-interface {v1}, Lbi0;->m()Lci0;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iget-object v3, v2, Lal0;->o:Lfn1;

    .line 105
    .line 106
    invoke-interface {v3}, Lfn1;->g()Lce3;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-direct {v0, v1, v6, v3}, Lde3;-><init>(Lci0;Lii0;Lce3;)V

    .line 111
    .line 112
    .line 113
    iget-object v1, v2, Lal0;->t:Li61;

    .line 114
    .line 115
    if-nez v1, :cond_0

    .line 116
    .line 117
    const/4 v4, 0x1

    .line 118
    :cond_0
    invoke-static {v4}, Lrr2;->w(Z)V

    .line 119
    .line 120
    .line 121
    new-instance v1, Li61;

    .line 122
    .line 123
    const-string v3, "DefaultHlsPlaylistTracker:MultivariantPlaylist"

    .line 124
    .line 125
    invoke-direct {v1, v3}, Li61;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    iput-object v1, v2, Lal0;->t:Li61;

    .line 129
    .line 130
    iget-object v3, v2, Lal0;->p:Li80;

    .line 131
    .line 132
    iget v4, v0, Lde3;->c:I

    .line 133
    .line 134
    invoke-virtual {v3, v4}, Li80;->D(I)I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    invoke-virtual {v1, v0, v2, v3}, Li61;->u(Ljd2;Lhd2;I)V

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method public final n(Lno2;)V
    .locals 11

    .line 1
    check-cast p1, Lpm1;

    .line 2
    .line 3
    iget-object p0, p1, Lpm1;->o:Lal0;

    .line 4
    .line 5
    iget-object p0, p0, Lal0;->r:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    iget-object p0, p1, Lpm1;->G:[Lln1;

    .line 11
    .line 12
    array-length v0, p0

    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    :goto_0
    const/4 v3, 0x0

    .line 16
    if-ge v2, v0, :cond_3

    .line 17
    .line 18
    aget-object v4, p0, v2

    .line 19
    .line 20
    iget-boolean v5, v4, Lln1;->Q:Z

    .line 21
    .line 22
    if-eqz v5, :cond_1

    .line 23
    .line 24
    iget-object v5, v4, Lln1;->I:[Lkn1;

    .line 25
    .line 26
    array-length v6, v5

    .line 27
    move v7, v1

    .line 28
    :goto_1
    if-ge v7, v6, :cond_1

    .line 29
    .line 30
    aget-object v8, v5, v7

    .line 31
    .line 32
    invoke-virtual {v8}, Lp44;->j()V

    .line 33
    .line 34
    .line 35
    iget-object v9, v8, Lp44;->h:Lpw0;

    .line 36
    .line 37
    if-eqz v9, :cond_0

    .line 38
    .line 39
    iget-object v10, v8, Lp44;->e:Lsw0;

    .line 40
    .line 41
    invoke-interface {v9, v10}, Lpw0;->d(Lsw0;)V

    .line 42
    .line 43
    .line 44
    iput-object v3, v8, Lp44;->h:Lpw0;

    .line 45
    .line 46
    iput-object v3, v8, Lp44;->g:Ltb1;

    .line 47
    .line 48
    :cond_0
    add-int/lit8 v7, v7, 0x1

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    iget-object v5, v4, Lln1;->q:Lkm1;

    .line 52
    .line 53
    iget-object v6, v5, Lkm1;->r:Lt41;

    .line 54
    .line 55
    invoke-interface {v6}, Lt41;->l()I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    iget-object v7, v5, Lkm1;->g:Lal0;

    .line 60
    .line 61
    iget-object v8, v5, Lkm1;->e:[Landroid/net/Uri;

    .line 62
    .line 63
    aget-object v6, v8, v6

    .line 64
    .line 65
    iget-object v7, v7, Lal0;->q:Ljava/util/HashMap;

    .line 66
    .line 67
    invoke-virtual {v7, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    check-cast v6, Lzk0;

    .line 72
    .line 73
    if-eqz v6, :cond_2

    .line 74
    .line 75
    iput-boolean v1, v6, Lzk0;->x:Z

    .line 76
    .line 77
    :cond_2
    iput-object v3, v5, Lkm1;->n:Landroidx/media3/exoplayer/source/BehindLiveWindowException;

    .line 78
    .line 79
    iget-object v5, v4, Lln1;->w:Li61;

    .line 80
    .line 81
    invoke-virtual {v5, v4}, Li61;->p(Lkd2;)V

    .line 82
    .line 83
    .line 84
    iget-object v5, v4, Lln1;->E:Landroid/os/Handler;

    .line 85
    .line 86
    invoke-virtual {v5, v3}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    const/4 v3, 0x1

    .line 90
    iput-boolean v3, v4, Lln1;->U:Z

    .line 91
    .line 92
    iget-object v3, v4, Lln1;->F:Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 95
    .line 96
    .line 97
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_3
    iput-object v3, p1, Lpm1;->D:Lmo2;

    .line 101
    .line 102
    return-void
.end method

.method public final p()V
    .locals 5

    .line 1
    iget-object v0, p0, Lzm1;->o:Lal0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iput-object v1, v0, Lal0;->x:Landroid/net/Uri;

    .line 5
    .line 6
    iput-object v1, v0, Lal0;->y:Lym1;

    .line 7
    .line 8
    iput-object v1, v0, Lal0;->w:Lcn1;

    .line 9
    .line 10
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    iput-wide v2, v0, Lal0;->A:J

    .line 16
    .line 17
    iget-object v2, v0, Lal0;->t:Li61;

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Li61;->p(Lkd2;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, v0, Lal0;->t:Li61;

    .line 23
    .line 24
    iget-object v2, v0, Lal0;->q:Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_0

    .line 39
    .line 40
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    check-cast v4, Lzk0;

    .line 45
    .line 46
    iget-object v4, v4, Lzk0;->o:Li61;

    .line 47
    .line 48
    invoke-virtual {v4, v1}, Li61;->p(Lkd2;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    iget-object v3, v0, Lal0;->u:Landroid/os/Handler;

    .line 53
    .line 54
    invoke-virtual {v3, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iput-object v1, v0, Lal0;->u:Landroid/os/Handler;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/util/HashMap;->clear()V

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, Lzm1;->k:Lww0;

    .line 63
    .line 64
    invoke-interface {p0}, Lww0;->a()V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public final declared-synchronized s(Lgn2;)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-object p1, p0, Lzm1;->s:Lgn2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public final u(Lym1;)V
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-boolean v2, v1, Lym1;->p:Z

    .line 6
    .line 7
    iget-boolean v3, v1, Lym1;->g:Z

    .line 8
    .line 9
    iget-object v4, v1, Lym1;->r:Lyw1;

    .line 10
    .line 11
    iget-wide v5, v1, Lym1;->u:J

    .line 12
    .line 13
    iget-wide v7, v1, Lym1;->e:J

    .line 14
    .line 15
    iget v9, v1, Lym1;->d:I

    .line 16
    .line 17
    iget-wide v10, v1, Lym1;->h:J

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-static {v10, v11}, Lf35;->i0(J)J

    .line 22
    .line 23
    .line 24
    move-result-wide v14

    .line 25
    move-wide/from16 v19, v14

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-wide v19, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    :goto_0
    const/4 v2, 0x1

    .line 34
    const/4 v14, 0x2

    .line 35
    if-eq v9, v14, :cond_2

    .line 36
    .line 37
    if-ne v9, v2, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    :goto_1
    move-wide/from16 v17, v19

    .line 47
    .line 48
    :goto_2
    new-instance v15, Ly41;

    .line 49
    .line 50
    const-wide v21, -0x7fffffffffffffffL    # -4.9E-324

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    iget-object v12, v0, Lzm1;->o:Lal0;

    .line 56
    .line 57
    iget-object v13, v12, Lal0;->w:Lcn1;

    .line 58
    .line 59
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    const/16 v13, 0x1a

    .line 63
    .line 64
    invoke-direct {v15, v13}, Ly41;-><init>(I)V

    .line 65
    .line 66
    .line 67
    iget-boolean v13, v12, Lal0;->z:Z

    .line 68
    .line 69
    const-wide/16 v23, 0x0

    .line 70
    .line 71
    if-eqz v13, :cond_12

    .line 72
    .line 73
    iget-object v13, v1, Lym1;->v:Lxm1;

    .line 74
    .line 75
    move-object/from16 v32, v15

    .line 76
    .line 77
    iget-wide v14, v12, Lal0;->A:J

    .line 78
    .line 79
    sub-long v25, v10, v14

    .line 80
    .line 81
    iget-boolean v12, v1, Lym1;->o:Z

    .line 82
    .line 83
    if-eqz v12, :cond_3

    .line 84
    .line 85
    add-long v14, v25, v5

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_3
    move-wide/from16 v14, v21

    .line 89
    .line 90
    :goto_3
    iget-boolean v2, v1, Lym1;->p:Z

    .line 91
    .line 92
    move/from16 v28, v3

    .line 93
    .line 94
    if-eqz v2, :cond_4

    .line 95
    .line 96
    iget-wide v2, v0, Lzm1;->p:J

    .line 97
    .line 98
    invoke-static {v2, v3}, Lf35;->B(J)J

    .line 99
    .line 100
    .line 101
    move-result-wide v2

    .line 102
    invoke-static {v2, v3}, Lf35;->Q(J)J

    .line 103
    .line 104
    .line 105
    move-result-wide v2

    .line 106
    add-long/2addr v10, v5

    .line 107
    sub-long/2addr v2, v10

    .line 108
    move-wide/from16 v35, v2

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_4
    move-wide/from16 v35, v23

    .line 112
    .line 113
    :goto_4
    iget-object v2, v0, Lzm1;->q:Lan2;

    .line 114
    .line 115
    iget-wide v2, v2, Lan2;->a:J

    .line 116
    .line 117
    cmp-long v10, v2, v21

    .line 118
    .line 119
    if-eqz v10, :cond_5

    .line 120
    .line 121
    invoke-static {v2, v3}, Lf35;->Q(J)J

    .line 122
    .line 123
    .line 124
    move-result-wide v2

    .line 125
    :goto_5
    move-wide/from16 v33, v2

    .line 126
    .line 127
    goto :goto_7

    .line 128
    :cond_5
    cmp-long v2, v7, v21

    .line 129
    .line 130
    if-eqz v2, :cond_6

    .line 131
    .line 132
    sub-long v2, v5, v7

    .line 133
    .line 134
    goto :goto_6

    .line 135
    :cond_6
    iget-wide v2, v13, Lxm1;->d:J

    .line 136
    .line 137
    cmp-long v10, v2, v21

    .line 138
    .line 139
    if-eqz v10, :cond_7

    .line 140
    .line 141
    iget-wide v10, v1, Lym1;->n:J

    .line 142
    .line 143
    cmp-long v10, v10, v21

    .line 144
    .line 145
    if-eqz v10, :cond_7

    .line 146
    .line 147
    goto :goto_6

    .line 148
    :cond_7
    iget-wide v2, v13, Lxm1;->c:J

    .line 149
    .line 150
    cmp-long v10, v2, v21

    .line 151
    .line 152
    if-eqz v10, :cond_8

    .line 153
    .line 154
    goto :goto_6

    .line 155
    :cond_8
    const-wide/16 v2, 0x3

    .line 156
    .line 157
    iget-wide v10, v1, Lym1;->m:J

    .line 158
    .line 159
    mul-long/2addr v2, v10

    .line 160
    :goto_6
    add-long v2, v2, v35

    .line 161
    .line 162
    goto :goto_5

    .line 163
    :goto_7
    add-long v37, v5, v35

    .line 164
    .line 165
    invoke-static/range {v33 .. v38}, Lf35;->k(JJJ)J

    .line 166
    .line 167
    .line 168
    move-result-wide v2

    .line 169
    invoke-virtual {v0}, Lzm1;->h()Lgn2;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    iget-object v5, v5, Lgn2;->c:Lan2;

    .line 174
    .line 175
    iget v6, v5, Lan2;->d:F

    .line 176
    .line 177
    const v10, -0x800001

    .line 178
    .line 179
    .line 180
    cmpl-float v6, v6, v10

    .line 181
    .line 182
    const/4 v11, 0x0

    .line 183
    if-nez v6, :cond_9

    .line 184
    .line 185
    iget v5, v5, Lan2;->e:F

    .line 186
    .line 187
    cmpl-float v5, v5, v10

    .line 188
    .line 189
    if-nez v5, :cond_9

    .line 190
    .line 191
    iget-wide v5, v13, Lxm1;->c:J

    .line 192
    .line 193
    cmp-long v5, v5, v21

    .line 194
    .line 195
    if-nez v5, :cond_9

    .line 196
    .line 197
    iget-wide v5, v13, Lxm1;->d:J

    .line 198
    .line 199
    cmp-long v5, v5, v21

    .line 200
    .line 201
    if-nez v5, :cond_9

    .line 202
    .line 203
    const/4 v5, 0x1

    .line 204
    goto :goto_8

    .line 205
    :cond_9
    move v5, v11

    .line 206
    :goto_8
    iget-object v6, v0, Lzm1;->q:Lan2;

    .line 207
    .line 208
    invoke-virtual {v6}, Lan2;->a()Lzm2;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    invoke-static {v2, v3}, Lf35;->i0(J)J

    .line 213
    .line 214
    .line 215
    move-result-wide v2

    .line 216
    iput-wide v2, v6, Lzm2;->a:J

    .line 217
    .line 218
    const/high16 v2, 0x3f800000    # 1.0f

    .line 219
    .line 220
    if-eqz v5, :cond_a

    .line 221
    .line 222
    move v3, v2

    .line 223
    goto :goto_9

    .line 224
    :cond_a
    iget-object v3, v0, Lzm1;->q:Lan2;

    .line 225
    .line 226
    iget v3, v3, Lan2;->d:F

    .line 227
    .line 228
    :goto_9
    iput v3, v6, Lzm2;->d:F

    .line 229
    .line 230
    if-eqz v5, :cond_b

    .line 231
    .line 232
    goto :goto_a

    .line 233
    :cond_b
    iget-object v2, v0, Lzm1;->q:Lan2;

    .line 234
    .line 235
    iget v2, v2, Lan2;->e:F

    .line 236
    .line 237
    :goto_a
    iput v2, v6, Lzm2;->e:F

    .line 238
    .line 239
    new-instance v2, Lan2;

    .line 240
    .line 241
    invoke-direct {v2, v6}, Lan2;-><init>(Lzm2;)V

    .line 242
    .line 243
    .line 244
    iput-object v2, v0, Lzm1;->q:Lan2;

    .line 245
    .line 246
    cmp-long v3, v7, v21

    .line 247
    .line 248
    if-eqz v3, :cond_c

    .line 249
    .line 250
    goto :goto_b

    .line 251
    :cond_c
    iget-wide v2, v2, Lan2;->a:J

    .line 252
    .line 253
    invoke-static {v2, v3}, Lf35;->Q(J)J

    .line 254
    .line 255
    .line 256
    move-result-wide v2

    .line 257
    sub-long v7, v37, v2

    .line 258
    .line 259
    :goto_b
    if-eqz v28, :cond_d

    .line 260
    .line 261
    move-wide/from16 v23, v7

    .line 262
    .line 263
    :goto_c
    const/4 v2, 0x2

    .line 264
    goto :goto_e

    .line 265
    :cond_d
    iget-object v2, v1, Lym1;->s:Lyw1;

    .line 266
    .line 267
    invoke-static {v7, v8, v2}, Lzm1;->t(JLjava/util/List;)Ltm1;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    if-eqz v2, :cond_e

    .line 272
    .line 273
    iget-wide v2, v2, Lwm1;->r:J

    .line 274
    .line 275
    :goto_d
    move-wide/from16 v23, v2

    .line 276
    .line 277
    goto :goto_c

    .line 278
    :cond_e
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    if-eqz v2, :cond_f

    .line 283
    .line 284
    goto :goto_c

    .line 285
    :cond_f
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    const/4 v3, 0x1

    .line 290
    invoke-static {v4, v2, v3}, Lf35;->d(Ljava/util/List;Ljava/lang/Long;Z)I

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    check-cast v2, Lvm1;

    .line 299
    .line 300
    iget-object v3, v2, Lvm1;->z:Lyw1;

    .line 301
    .line 302
    invoke-static {v7, v8, v3}, Lzm1;->t(JLjava/util/List;)Ltm1;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    if-eqz v3, :cond_10

    .line 307
    .line 308
    iget-wide v2, v3, Lwm1;->r:J

    .line 309
    .line 310
    goto :goto_d

    .line 311
    :cond_10
    iget-wide v2, v2, Lwm1;->r:J

    .line 312
    .line 313
    goto :goto_d

    .line 314
    :goto_e
    if-ne v9, v2, :cond_11

    .line 315
    .line 316
    iget-boolean v2, v1, Lym1;->f:Z

    .line 317
    .line 318
    if-eqz v2, :cond_11

    .line 319
    .line 320
    const/16 v31, 0x1

    .line 321
    .line 322
    goto :goto_f

    .line 323
    :cond_11
    move/from16 v31, v11

    .line 324
    .line 325
    :goto_f
    new-instance v16, Lbf4;

    .line 326
    .line 327
    iget-wide v1, v1, Lym1;->u:J

    .line 328
    .line 329
    const/16 v27, 0x1

    .line 330
    .line 331
    xor-int/lit8 v30, v12, 0x1

    .line 332
    .line 333
    invoke-virtual {v0}, Lzm1;->h()Lgn2;

    .line 334
    .line 335
    .line 336
    move-result-object v33

    .line 337
    iget-object v3, v0, Lzm1;->q:Lan2;

    .line 338
    .line 339
    const/16 v29, 0x1

    .line 340
    .line 341
    move-object/from16 v34, v3

    .line 342
    .line 343
    move-wide/from16 v21, v14

    .line 344
    .line 345
    move-wide/from16 v27, v23

    .line 346
    .line 347
    move-wide/from16 v23, v1

    .line 348
    .line 349
    invoke-direct/range {v16 .. v34}, Lbf4;-><init>(JJJJJJZZZLy41;Lgn2;Lan2;)V

    .line 350
    .line 351
    .line 352
    :goto_10
    move-object/from16 v1, v16

    .line 353
    .line 354
    goto :goto_14

    .line 355
    :cond_12
    move/from16 v28, v3

    .line 356
    .line 357
    move-object/from16 v32, v15

    .line 358
    .line 359
    cmp-long v2, v7, v21

    .line 360
    .line 361
    if-eqz v2, :cond_16

    .line 362
    .line 363
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    if-eqz v2, :cond_13

    .line 368
    .line 369
    goto :goto_12

    .line 370
    :cond_13
    if-nez v28, :cond_15

    .line 371
    .line 372
    cmp-long v2, v7, v5

    .line 373
    .line 374
    if-nez v2, :cond_14

    .line 375
    .line 376
    goto :goto_11

    .line 377
    :cond_14
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    const/4 v3, 0x1

    .line 382
    invoke-static {v4, v2, v3}, Lf35;->d(Ljava/util/List;Ljava/lang/Long;Z)I

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    check-cast v2, Lvm1;

    .line 391
    .line 392
    iget-wide v7, v2, Lwm1;->r:J

    .line 393
    .line 394
    :cond_15
    :goto_11
    move-wide/from16 v27, v7

    .line 395
    .line 396
    goto :goto_13

    .line 397
    :cond_16
    :goto_12
    move-wide/from16 v27, v23

    .line 398
    .line 399
    :goto_13
    new-instance v16, Lbf4;

    .line 400
    .line 401
    iget-wide v1, v1, Lym1;->u:J

    .line 402
    .line 403
    invoke-virtual {v0}, Lzm1;->h()Lgn2;

    .line 404
    .line 405
    .line 406
    move-result-object v33

    .line 407
    const/16 v34, 0x0

    .line 408
    .line 409
    const-wide/16 v25, 0x0

    .line 410
    .line 411
    const/16 v29, 0x1

    .line 412
    .line 413
    const/16 v30, 0x0

    .line 414
    .line 415
    const/16 v31, 0x1

    .line 416
    .line 417
    move-wide/from16 v23, v1

    .line 418
    .line 419
    move-wide/from16 v21, v1

    .line 420
    .line 421
    invoke-direct/range {v16 .. v34}, Lbf4;-><init>(JJJJJJZZZLy41;Lgn2;Lan2;)V

    .line 422
    .line 423
    .line 424
    goto :goto_10

    .line 425
    :goto_14
    invoke-virtual {v0, v1}, Lbq;->m(Lcu4;)V

    .line 426
    .line 427
    .line 428
    return-void
.end method
