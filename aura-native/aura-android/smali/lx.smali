.class public final Llx;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lci0;


# instance fields
.field public A:J

.field public B:J

.field public C:Lte4;

.field public D:Z

.field public E:Z

.field public F:J

.field public final n:Lse4;

.field public final o:Lci0;

.field public final p:Ljr4;

.field public final q:Lci0;

.field public final r:Lpx;

.field public final s:Z

.field public final t:Z

.field public final u:Z

.field public v:Landroid/net/Uri;

.field public w:Lii0;

.field public x:Lii0;

.field public y:Lci0;

.field public z:J


# direct methods
.method public constructor <init>(Lse4;Lci0;Lci0;Ljx;Lpx;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Llx;->n:Lse4;

    .line 5
    .line 6
    iput-object p3, p0, Llx;->o:Lci0;

    .line 7
    .line 8
    iput-object p5, p0, Llx;->r:Lpx;

    .line 9
    .line 10
    and-int/lit8 p1, p6, 0x1

    .line 11
    .line 12
    const/4 p3, 0x0

    .line 13
    const/4 p5, 0x1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    move p1, p5

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move p1, p3

    .line 19
    :goto_0
    iput-boolean p1, p0, Llx;->s:Z

    .line 20
    .line 21
    and-int/lit8 p1, p6, 0x2

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    move p1, p5

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move p1, p3

    .line 28
    :goto_1
    iput-boolean p1, p0, Llx;->t:Z

    .line 29
    .line 30
    and-int/lit8 p1, p6, 0x4

    .line 31
    .line 32
    if-eqz p1, :cond_2

    .line 33
    .line 34
    move p3, p5

    .line 35
    :cond_2
    iput-boolean p3, p0, Llx;->u:Z

    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    if-eqz p2, :cond_4

    .line 39
    .line 40
    iput-object p2, p0, Llx;->q:Lci0;

    .line 41
    .line 42
    if-eqz p4, :cond_3

    .line 43
    .line 44
    new-instance p1, Ljr4;

    .line 45
    .line 46
    invoke-direct {p1, p2, p4}, Ljr4;-><init>(Lci0;Ljx;)V

    .line 47
    .line 48
    .line 49
    :cond_3
    iput-object p1, p0, Llx;->p:Ljr4;

    .line 50
    .line 51
    return-void

    .line 52
    :cond_4
    sget-object p2, Lmg3;->n:Lmg3;

    .line 53
    .line 54
    iput-object p2, p0, Llx;->q:Lci0;

    .line 55
    .line 56
    iput-object p1, p0, Llx;->p:Ljr4;

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final b(Lii0;)J
    .locals 13

    .line 1
    iget-object v0, p0, Llx;->n:Lse4;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    :try_start_0
    iget-object v2, p0, Llx;->r:Lpx;

    .line 5
    .line 6
    invoke-interface {v2, p1}, Lpx;->d(Lii0;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {p1}, Lii0;->a()Lhi0;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    iget-wide v4, p1, Lii0;->f:J

    .line 15
    .line 16
    iget-wide v6, p1, Lii0;->g:J

    .line 17
    .line 18
    iput-object v2, v3, Lhi0;->h:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v3}, Lhi0;->a()Lii0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Llx;->w:Lii0;

    .line 25
    .line 26
    iget-object v3, p1, Lii0;->a:Landroid/net/Uri;

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Lse4;->i(Ljava/lang/String;)Lyj0;

    .line 29
    .line 30
    .line 31
    move-result-object v8

    .line 32
    const-string v9, "exo_redir"

    .line 33
    .line 34
    iget-object v8, v8, Lyj0;->b:Ljava/util/Map;

    .line 35
    .line 36
    invoke-interface {v8, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    check-cast v8, [B

    .line 41
    .line 42
    const/4 v9, 0x0

    .line 43
    if-eqz v8, :cond_0

    .line 44
    .line 45
    new-instance v10, Ljava/lang/String;

    .line 46
    .line 47
    sget-object v11, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 48
    .line 49
    invoke-direct {v10, v8, v11}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    move-object v10, v9

    .line 54
    :goto_0
    if-nez v10, :cond_1

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-static {v10}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    :goto_1
    if-eqz v9, :cond_2

    .line 62
    .line 63
    move-object v3, v9

    .line 64
    :cond_2
    iput-object v3, p0, Llx;->v:Landroid/net/Uri;

    .line 65
    .line 66
    iput-wide v4, p0, Llx;->A:J

    .line 67
    .line 68
    iget-boolean v3, p0, Llx;->t:Z

    .line 69
    .line 70
    const/4 v8, 0x0

    .line 71
    const-wide/16 v9, -0x1

    .line 72
    .line 73
    if-eqz v3, :cond_3

    .line 74
    .line 75
    iget-boolean v3, p0, Llx;->D:Z

    .line 76
    .line 77
    if-eqz v3, :cond_3

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_3
    iget-boolean v3, p0, Llx;->u:Z

    .line 81
    .line 82
    if-eqz v3, :cond_4

    .line 83
    .line 84
    cmp-long v3, v6, v9

    .line 85
    .line 86
    if-nez v3, :cond_4

    .line 87
    .line 88
    :goto_2
    move v3, v1

    .line 89
    goto :goto_3

    .line 90
    :cond_4
    move v3, v8

    .line 91
    :goto_3
    iput-boolean v3, p0, Llx;->E:Z

    .line 92
    .line 93
    const-wide/16 v11, 0x0

    .line 94
    .line 95
    if-eqz v3, :cond_5

    .line 96
    .line 97
    iput-wide v9, p0, Llx;->B:J

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :catchall_0
    move-exception p1

    .line 101
    goto :goto_6

    .line 102
    :cond_5
    invoke-virtual {v0, v2}, Lse4;->i(Ljava/lang/String;)Lyj0;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {v0}, Lnd0;->a(Lnd0;)J

    .line 107
    .line 108
    .line 109
    move-result-wide v2

    .line 110
    iput-wide v2, p0, Llx;->B:J

    .line 111
    .line 112
    cmp-long v0, v2, v9

    .line 113
    .line 114
    if-eqz v0, :cond_7

    .line 115
    .line 116
    sub-long/2addr v2, v4

    .line 117
    iput-wide v2, p0, Llx;->B:J

    .line 118
    .line 119
    cmp-long v0, v2, v11

    .line 120
    .line 121
    if-ltz v0, :cond_6

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_6
    new-instance p1, Landroidx/media3/datasource/DataSourceException;

    .line 125
    .line 126
    const/16 v0, 0x7d8

    .line 127
    .line 128
    invoke-direct {p1, v0}, Landroidx/media3/datasource/DataSourceException;-><init>(I)V

    .line 129
    .line 130
    .line 131
    throw p1

    .line 132
    :cond_7
    :goto_4
    cmp-long v0, v6, v9

    .line 133
    .line 134
    if-eqz v0, :cond_9

    .line 135
    .line 136
    iget-wide v2, p0, Llx;->B:J

    .line 137
    .line 138
    cmp-long v4, v2, v9

    .line 139
    .line 140
    if-nez v4, :cond_8

    .line 141
    .line 142
    move-wide v2, v6

    .line 143
    goto :goto_5

    .line 144
    :cond_8
    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 145
    .line 146
    .line 147
    move-result-wide v2

    .line 148
    :goto_5
    iput-wide v2, p0, Llx;->B:J

    .line 149
    .line 150
    :cond_9
    iget-wide v2, p0, Llx;->B:J

    .line 151
    .line 152
    cmp-long v4, v2, v11

    .line 153
    .line 154
    if-gtz v4, :cond_a

    .line 155
    .line 156
    cmp-long v2, v2, v9

    .line 157
    .line 158
    if-nez v2, :cond_b

    .line 159
    .line 160
    :cond_a
    invoke-virtual {p0, p1, v8}, Llx;->p(Lii0;Z)V

    .line 161
    .line 162
    .line 163
    :cond_b
    if-eqz v0, :cond_c

    .line 164
    .line 165
    return-wide v6

    .line 166
    :cond_c
    iget-wide p0, p0, Llx;->B:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    .line 168
    return-wide p0

    .line 169
    :goto_6
    iget-object v0, p0, Llx;->y:Lci0;

    .line 170
    .line 171
    iget-object v2, p0, Llx;->o:Lci0;

    .line 172
    .line 173
    if-eq v0, v2, :cond_d

    .line 174
    .line 175
    instance-of v0, p1, Landroidx/media3/datasource/cache/Cache$CacheException;

    .line 176
    .line 177
    if-eqz v0, :cond_e

    .line 178
    .line 179
    :cond_d
    iput-boolean v1, p0, Llx;->D:Z

    .line 180
    .line 181
    :cond_e
    throw p1
.end method

.method public final c(Lrw4;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Llx;->o:Lci0;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Lci0;->c(Lrw4;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Llx;->q:Lci0;

    .line 10
    .line 11
    invoke-interface {p0, p1}, Lci0;->c(Lrw4;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final close()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Llx;->w:Lii0;

    .line 3
    .line 4
    iput-object v0, p0, Llx;->v:Landroid/net/Uri;

    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    iput-wide v0, p0, Llx;->A:J

    .line 9
    .line 10
    :try_start_0
    invoke-virtual {p0}, Llx;->o()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception v0

    .line 15
    iget-object v1, p0, Llx;->y:Lci0;

    .line 16
    .line 17
    iget-object v2, p0, Llx;->o:Lci0;

    .line 18
    .line 19
    if-eq v1, v2, :cond_0

    .line 20
    .line 21
    instance-of v1, v0, Landroidx/media3/datasource/cache/Cache$CacheException;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    :cond_0
    const/4 v1, 0x1

    .line 26
    iput-boolean v1, p0, Llx;->D:Z

    .line 27
    .line 28
    :cond_1
    throw v0
.end method

.method public final j()Ljava/util/Map;
    .locals 2

    .line 1
    iget-object v0, p0, Llx;->y:Lci0;

    .line 2
    .line 3
    iget-object v1, p0, Llx;->o:Lci0;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-nez v0, :cond_1

    .line 11
    .line 12
    iget-object p0, p0, Llx;->q:Lci0;

    .line 13
    .line 14
    invoke-interface {p0}, Lci0;->j()Ljava/util/Map;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_1
    sget-object p0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 20
    .line 21
    return-object p0
.end method

.method public final m()Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, Llx;->v:Landroid/net/Uri;

    .line 2
    .line 3
    return-object p0
.end method

.method public final o()V
    .locals 4

    .line 1
    iget-object v0, p0, Llx;->n:Lse4;

    .line 2
    .line 3
    iget-object v1, p0, Llx;->y:Lci0;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v2, 0x0

    .line 9
    :try_start_0
    invoke-interface {v1}, Lci0;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    iput-object v2, p0, Llx;->x:Lii0;

    .line 13
    .line 14
    iput-object v2, p0, Llx;->y:Lci0;

    .line 15
    .line 16
    iget-object v1, p0, Llx;->C:Lte4;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lse4;->l(Lte4;)V

    .line 21
    .line 22
    .line 23
    iput-object v2, p0, Llx;->C:Lte4;

    .line 24
    .line 25
    :cond_1
    :goto_0
    return-void

    .line 26
    :catchall_0
    move-exception v1

    .line 27
    iput-object v2, p0, Llx;->x:Lii0;

    .line 28
    .line 29
    iput-object v2, p0, Llx;->y:Lci0;

    .line 30
    .line 31
    iget-object v3, p0, Llx;->C:Lte4;

    .line 32
    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0, v3}, Lse4;->l(Lte4;)V

    .line 36
    .line 37
    .line 38
    iput-object v2, p0, Llx;->C:Lte4;

    .line 39
    .line 40
    :cond_2
    throw v1
.end method

.method public final p(Lii0;Z)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v7, v0, Lii0;->h:Ljava/lang/String;

    .line 6
    .line 7
    sget-object v2, Lf35;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-boolean v2, v1, Llx;->E:Z

    .line 10
    .line 11
    const/4 v8, 0x0

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    move-object v9, v8

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    iget-boolean v2, v1, Llx;->s:Z

    .line 17
    .line 18
    move v3, v2

    .line 19
    iget-object v2, v1, Llx;->n:Lse4;

    .line 20
    .line 21
    move v5, v3

    .line 22
    iget-wide v3, v1, Llx;->A:J

    .line 23
    .line 24
    if-eqz v5, :cond_2

    .line 25
    .line 26
    :try_start_0
    iget-wide v5, v1, Llx;->B:J

    .line 27
    .line 28
    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    :try_start_1
    invoke-virtual {v2}, Lse4;->d()V

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-virtual/range {v2 .. v7}, Lse4;->p(JJLjava/lang/String;)Lte4;

    .line 33
    .line 34
    .line 35
    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    if-eqz v9, :cond_1

    .line 37
    .line 38
    :try_start_2
    monitor-exit v2
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :try_start_3
    invoke-virtual {v2}, Ljava/lang/Object;->wait()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 46
    :try_start_4
    throw v0
    :try_end_4
    .catch Ljava/lang/InterruptedException; {:try_start_4 .. :try_end_4} :catch_0

    .line 47
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 52
    .line 53
    .line 54
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 57
    .line 58
    .line 59
    throw v0

    .line 60
    :cond_2
    iget-wide v5, v1, Llx;->B:J

    .line 61
    .line 62
    invoke-virtual/range {v2 .. v7}, Lse4;->p(JJLjava/lang/String;)Lte4;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    :goto_1
    const-wide/16 v2, -0x1

    .line 67
    .line 68
    if-nez v9, :cond_3

    .line 69
    .line 70
    iget-object v4, v1, Llx;->q:Lci0;

    .line 71
    .line 72
    invoke-virtual {v0}, Lii0;->a()Lhi0;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    iget-wide v10, v1, Llx;->A:J

    .line 77
    .line 78
    iput-wide v10, v5, Lhi0;->f:J

    .line 79
    .line 80
    iget-wide v10, v1, Llx;->B:J

    .line 81
    .line 82
    iput-wide v10, v5, Lhi0;->g:J

    .line 83
    .line 84
    invoke-virtual {v5}, Lhi0;->a()Lii0;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    goto :goto_3

    .line 89
    :cond_3
    iget-boolean v4, v9, Lte4;->q:Z

    .line 90
    .line 91
    if-eqz v4, :cond_5

    .line 92
    .line 93
    iget-object v4, v9, Lte4;->r:Ljava/io/File;

    .line 94
    .line 95
    invoke-static {v4}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    iget-wide v5, v9, Lte4;->o:J

    .line 100
    .line 101
    iget-wide v10, v1, Llx;->A:J

    .line 102
    .line 103
    sub-long/2addr v10, v5

    .line 104
    iget-wide v12, v9, Lte4;->p:J

    .line 105
    .line 106
    sub-long/2addr v12, v10

    .line 107
    iget-wide v14, v1, Llx;->B:J

    .line 108
    .line 109
    cmp-long v16, v14, v2

    .line 110
    .line 111
    if-eqz v16, :cond_4

    .line 112
    .line 113
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->min(JJ)J

    .line 114
    .line 115
    .line 116
    move-result-wide v12

    .line 117
    :cond_4
    invoke-virtual {v0}, Lii0;->a()Lhi0;

    .line 118
    .line 119
    .line 120
    move-result-object v14

    .line 121
    iput-object v4, v14, Lhi0;->a:Landroid/net/Uri;

    .line 122
    .line 123
    iput-wide v5, v14, Lhi0;->b:J

    .line 124
    .line 125
    iput-wide v10, v14, Lhi0;->f:J

    .line 126
    .line 127
    iput-wide v12, v14, Lhi0;->g:J

    .line 128
    .line 129
    invoke-virtual {v14}, Lhi0;->a()Lii0;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    iget-object v4, v1, Llx;->o:Lci0;

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_5
    iget-wide v4, v9, Lte4;->p:J

    .line 137
    .line 138
    cmp-long v6, v4, v2

    .line 139
    .line 140
    iget-wide v10, v1, Llx;->B:J

    .line 141
    .line 142
    if-nez v6, :cond_6

    .line 143
    .line 144
    move-wide v4, v10

    .line 145
    goto :goto_2

    .line 146
    :cond_6
    cmp-long v6, v10, v2

    .line 147
    .line 148
    if-eqz v6, :cond_7

    .line 149
    .line 150
    invoke-static {v4, v5, v10, v11}, Ljava/lang/Math;->min(JJ)J

    .line 151
    .line 152
    .line 153
    move-result-wide v4

    .line 154
    :cond_7
    :goto_2
    invoke-virtual {v0}, Lii0;->a()Lhi0;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    iget-wide v10, v1, Llx;->A:J

    .line 159
    .line 160
    iput-wide v10, v6, Lhi0;->f:J

    .line 161
    .line 162
    iput-wide v4, v6, Lhi0;->g:J

    .line 163
    .line 164
    invoke-virtual {v6}, Lhi0;->a()Lii0;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    iget-object v4, v1, Llx;->p:Ljr4;

    .line 169
    .line 170
    if-eqz v4, :cond_8

    .line 171
    .line 172
    goto :goto_3

    .line 173
    :cond_8
    iget-object v4, v1, Llx;->q:Lci0;

    .line 174
    .line 175
    iget-object v6, v1, Llx;->n:Lse4;

    .line 176
    .line 177
    invoke-virtual {v6, v9}, Lse4;->l(Lte4;)V

    .line 178
    .line 179
    .line 180
    move-object v9, v8

    .line 181
    :goto_3
    iget-boolean v6, v1, Llx;->E:Z

    .line 182
    .line 183
    if-nez v6, :cond_9

    .line 184
    .line 185
    iget-object v6, v1, Llx;->q:Lci0;

    .line 186
    .line 187
    if-ne v4, v6, :cond_9

    .line 188
    .line 189
    iget-wide v10, v1, Llx;->A:J

    .line 190
    .line 191
    const-wide/32 v12, 0x19000

    .line 192
    .line 193
    .line 194
    add-long/2addr v10, v12

    .line 195
    goto :goto_4

    .line 196
    :cond_9
    const-wide v10, 0x7fffffffffffffffL

    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    :goto_4
    iput-wide v10, v1, Llx;->F:J

    .line 202
    .line 203
    const/4 v6, 0x0

    .line 204
    const/4 v10, 0x1

    .line 205
    if-eqz p2, :cond_d

    .line 206
    .line 207
    iget-object v11, v1, Llx;->y:Lci0;

    .line 208
    .line 209
    iget-object v12, v1, Llx;->q:Lci0;

    .line 210
    .line 211
    if-ne v11, v12, :cond_a

    .line 212
    .line 213
    move v11, v10

    .line 214
    goto :goto_5

    .line 215
    :cond_a
    move v11, v6

    .line 216
    :goto_5
    invoke-static {v11}, Lrr2;->w(Z)V

    .line 217
    .line 218
    .line 219
    iget-object v11, v1, Llx;->q:Lci0;

    .line 220
    .line 221
    if-ne v4, v11, :cond_b

    .line 222
    .line 223
    return-void

    .line 224
    :cond_b
    :try_start_5
    invoke-virtual {v1}, Llx;->o()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 225
    .line 226
    .line 227
    goto :goto_6

    .line 228
    :catchall_1
    move-exception v0

    .line 229
    iget-boolean v2, v9, Lte4;->q:Z

    .line 230
    .line 231
    if-nez v2, :cond_c

    .line 232
    .line 233
    iget-object v1, v1, Llx;->n:Lse4;

    .line 234
    .line 235
    invoke-virtual {v1, v9}, Lse4;->l(Lte4;)V

    .line 236
    .line 237
    .line 238
    :cond_c
    throw v0

    .line 239
    :cond_d
    :goto_6
    if-eqz v9, :cond_e

    .line 240
    .line 241
    iget-boolean v11, v9, Lte4;->q:Z

    .line 242
    .line 243
    if-nez v11, :cond_e

    .line 244
    .line 245
    iput-object v9, v1, Llx;->C:Lte4;

    .line 246
    .line 247
    :cond_e
    iput-object v4, v1, Llx;->y:Lci0;

    .line 248
    .line 249
    iput-object v5, v1, Llx;->x:Lii0;

    .line 250
    .line 251
    const-wide/16 v11, 0x0

    .line 252
    .line 253
    iput-wide v11, v1, Llx;->z:J

    .line 254
    .line 255
    invoke-interface {v4, v5}, Lci0;->b(Lii0;)J

    .line 256
    .line 257
    .line 258
    move-result-wide v11

    .line 259
    new-instance v9, Lxc5;

    .line 260
    .line 261
    const/4 v13, 0x5

    .line 262
    invoke-direct {v9, v13}, Lxc5;-><init>(I)V

    .line 263
    .line 264
    .line 265
    iget-wide v13, v5, Lii0;->g:J

    .line 266
    .line 267
    cmp-long v5, v13, v2

    .line 268
    .line 269
    if-nez v5, :cond_f

    .line 270
    .line 271
    cmp-long v2, v11, v2

    .line 272
    .line 273
    if-eqz v2, :cond_f

    .line 274
    .line 275
    iput-wide v11, v1, Llx;->B:J

    .line 276
    .line 277
    iget-wide v2, v1, Llx;->A:J

    .line 278
    .line 279
    add-long/2addr v2, v11

    .line 280
    const-string v5, "exo_len"

    .line 281
    .line 282
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    invoke-virtual {v9, v2, v5}, Lxc5;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    :cond_f
    iget-object v2, v1, Llx;->y:Lci0;

    .line 290
    .line 291
    iget-object v3, v1, Llx;->o:Lci0;

    .line 292
    .line 293
    if-ne v2, v3, :cond_10

    .line 294
    .line 295
    move v6, v10

    .line 296
    :cond_10
    if-nez v6, :cond_13

    .line 297
    .line 298
    invoke-interface {v4}, Lci0;->m()Landroid/net/Uri;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    iput-object v2, v1, Llx;->v:Landroid/net/Uri;

    .line 303
    .line 304
    iget-object v0, v0, Lii0;->a:Landroid/net/Uri;

    .line 305
    .line 306
    invoke-virtual {v0, v2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result v0

    .line 310
    if-nez v0, :cond_11

    .line 311
    .line 312
    iget-object v8, v1, Llx;->v:Landroid/net/Uri;

    .line 313
    .line 314
    :cond_11
    const-string v0, "exo_redir"

    .line 315
    .line 316
    if-nez v8, :cond_12

    .line 317
    .line 318
    iget-object v2, v9, Lxc5;->p:Ljava/lang/Object;

    .line 319
    .line 320
    check-cast v2, Ljava/util/ArrayList;

    .line 321
    .line 322
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 323
    .line 324
    .line 325
    iget-object v2, v9, Lxc5;->o:Ljava/lang/Object;

    .line 326
    .line 327
    check-cast v2, Ljava/util/HashMap;

    .line 328
    .line 329
    invoke-virtual {v2, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    goto :goto_7

    .line 333
    :cond_12
    invoke-virtual {v8}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    invoke-virtual {v9, v2, v0}, Lxc5;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 338
    .line 339
    .line 340
    :cond_13
    :goto_7
    iget-object v0, v1, Llx;->y:Lci0;

    .line 341
    .line 342
    iget-object v2, v1, Llx;->p:Ljr4;

    .line 343
    .line 344
    if-ne v0, v2, :cond_14

    .line 345
    .line 346
    iget-object v0, v1, Llx;->n:Lse4;

    .line 347
    .line 348
    invoke-virtual {v0, v7, v9}, Lse4;->c(Ljava/lang/String;Lxc5;)V

    .line 349
    .line 350
    .line 351
    :cond_14
    return-void
.end method

.method public final read([BII)I
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p3

    .line 4
    .line 5
    iget-object v2, v1, Llx;->o:Lci0;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v3

    .line 11
    :cond_0
    iget-wide v4, v1, Llx;->B:J

    .line 12
    .line 13
    const-wide/16 v6, 0x0

    .line 14
    .line 15
    cmp-long v4, v4, v6

    .line 16
    .line 17
    const/4 v5, -0x1

    .line 18
    if-nez v4, :cond_1

    .line 19
    .line 20
    return v5

    .line 21
    :cond_1
    iget-object v4, v1, Llx;->w:Lii0;

    .line 22
    .line 23
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v8, v1, Llx;->x:Lii0;

    .line 27
    .line 28
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/4 v9, 0x1

    .line 32
    :try_start_0
    iget-wide v10, v1, Llx;->A:J

    .line 33
    .line 34
    iget-wide v12, v1, Llx;->F:J

    .line 35
    .line 36
    cmp-long v10, v10, v12

    .line 37
    .line 38
    if-ltz v10, :cond_2

    .line 39
    .line 40
    invoke-virtual {v1, v4, v9}, Llx;->p(Lii0;Z)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :catchall_0
    move-exception v0

    .line 45
    goto/16 :goto_5

    .line 46
    .line 47
    :cond_2
    :goto_0
    iget-object v10, v1, Llx;->y:Lci0;

    .line 48
    .line 49
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-object/from16 v11, p1

    .line 53
    .line 54
    move/from16 v12, p2

    .line 55
    .line 56
    invoke-interface {v10, v11, v12, v0}, Lwh0;->read([BII)I

    .line 57
    .line 58
    .line 59
    move-result v10
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    iget-object v13, v1, Llx;->y:Lci0;

    .line 61
    .line 62
    const-wide/16 v14, -0x1

    .line 63
    .line 64
    if-eq v10, v5, :cond_4

    .line 65
    .line 66
    :try_start_1
    iget-wide v3, v1, Llx;->A:J

    .line 67
    .line 68
    int-to-long v5, v10

    .line 69
    add-long/2addr v3, v5

    .line 70
    iput-wide v3, v1, Llx;->A:J

    .line 71
    .line 72
    iget-wide v3, v1, Llx;->z:J

    .line 73
    .line 74
    add-long/2addr v3, v5

    .line 75
    iput-wide v3, v1, Llx;->z:J

    .line 76
    .line 77
    iget-wide v3, v1, Llx;->B:J

    .line 78
    .line 79
    cmp-long v0, v3, v14

    .line 80
    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    sub-long/2addr v3, v5

    .line 84
    iput-wide v3, v1, Llx;->B:J

    .line 85
    .line 86
    return v10

    .line 87
    :cond_3
    move v8, v10

    .line 88
    goto :goto_3

    .line 89
    :cond_4
    if-ne v13, v2, :cond_5

    .line 90
    .line 91
    move v5, v9

    .line 92
    goto :goto_1

    .line 93
    :cond_5
    move v5, v3

    .line 94
    :goto_1
    if-nez v5, :cond_8

    .line 95
    .line 96
    move-wide/from16 v16, v14

    .line 97
    .line 98
    iget-wide v14, v8, Lii0;->g:J

    .line 99
    .line 100
    cmp-long v5, v14, v16

    .line 101
    .line 102
    if-eqz v5, :cond_6

    .line 103
    .line 104
    move v8, v10

    .line 105
    iget-wide v9, v1, Llx;->z:J

    .line 106
    .line 107
    cmp-long v9, v9, v14

    .line 108
    .line 109
    if-gez v9, :cond_9

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_6
    move v8, v10

    .line 113
    :goto_2
    iget-object v0, v4, Lii0;->h:Ljava/lang/String;

    .line 114
    .line 115
    sget-object v4, Lf35;->a:Ljava/lang/String;

    .line 116
    .line 117
    iput-wide v6, v1, Llx;->B:J

    .line 118
    .line 119
    iget-object v4, v1, Llx;->p:Ljr4;

    .line 120
    .line 121
    if-ne v13, v4, :cond_7

    .line 122
    .line 123
    const/4 v3, 0x1

    .line 124
    :cond_7
    if-eqz v3, :cond_a

    .line 125
    .line 126
    new-instance v3, Lxc5;

    .line 127
    .line 128
    const/4 v4, 0x5

    .line 129
    invoke-direct {v3, v4}, Lxc5;-><init>(I)V

    .line 130
    .line 131
    .line 132
    iget-wide v6, v1, Llx;->A:J

    .line 133
    .line 134
    const-string v4, "exo_len"

    .line 135
    .line 136
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    invoke-virtual {v3, v6, v4}, Lxc5;->m(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iget-object v4, v1, Llx;->n:Lse4;

    .line 144
    .line 145
    invoke-virtual {v4, v0, v3}, Lse4;->c(Ljava/lang/String;Lxc5;)V

    .line 146
    .line 147
    .line 148
    return v8

    .line 149
    :cond_8
    move v8, v10

    .line 150
    move-wide/from16 v16, v14

    .line 151
    .line 152
    :cond_9
    iget-wide v9, v1, Llx;->B:J

    .line 153
    .line 154
    cmp-long v6, v9, v6

    .line 155
    .line 156
    if-gtz v6, :cond_b

    .line 157
    .line 158
    cmp-long v6, v9, v16

    .line 159
    .line 160
    if-nez v6, :cond_a

    .line 161
    .line 162
    goto :goto_4

    .line 163
    :cond_a
    :goto_3
    return v8

    .line 164
    :cond_b
    :goto_4
    invoke-virtual {v1}, Llx;->o()V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, v4, v3}, Llx;->p(Lii0;Z)V

    .line 168
    .line 169
    .line 170
    invoke-virtual/range {p0 .. p3}, Llx;->read([BII)I

    .line 171
    .line 172
    .line 173
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 174
    return v0

    .line 175
    :goto_5
    iget-object v3, v1, Llx;->y:Lci0;

    .line 176
    .line 177
    if-eq v3, v2, :cond_c

    .line 178
    .line 179
    instance-of v2, v0, Landroidx/media3/datasource/cache/Cache$CacheException;

    .line 180
    .line 181
    if-eqz v2, :cond_d

    .line 182
    .line 183
    :cond_c
    const/4 v5, 0x1

    .line 184
    iput-boolean v5, v1, Llx;->D:Z

    .line 185
    .line 186
    :cond_d
    throw v0
.end method
