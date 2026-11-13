.class public final Ldefpackage/i11;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final h:Z


# instance fields
.field public final a:Ldefpackage/gp3;

.field public final b:Ldefpackage/om0;

.field public final c:Ldefpackage/pf2;

.field public final d:Ldefpackage/lv4;

.field public final e:Ldefpackage/xk0;

.field public final f:Ldefpackage/ue1;

.field public final g:Ldefpackage/ns3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "Engine"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Landroid/util/Ldefpackage/og;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    sput-boolean v0, Ldefpackage/i11;->h:Z

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ldefpackage/pf2;Ldefpackage/e20;Ldefpackage/li1;Ldefpackage/li1;Ldefpackage/li1;Ldefpackage/li1;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/i11;->c:Ldefpackage/pf2;

    .line 5
    .line 6
    new-instance v0, Ldefpackage/sd0;

    .line 7
    .line 8
    invoke-direct {v0, p2}, Ldefpackage/sd0;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance p2, Ldefpackage/ns3;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {p2, v1}, Ldefpackage/ns3;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Ldefpackage/i11;->g:Ldefpackage/ns3;

    .line 18
    .line 19
    monitor-enter p0

    .line 20
    :try_start_0
    monitor-enter p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    :try_start_1
    iput-object p0, p2, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 22
    .line 23
    monitor-exit p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 24
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 25
    new-instance p2, Ldefpackage/om0;

    .line 26
    .line 27
    const/16 v1, 0x1a

    .line 28
    .line 29
    invoke-direct {p2, v1}, Ldefpackage/om0;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iput-object p2, p0, Ldefpackage/i11;->b:Ldefpackage/om0;

    .line 33
    .line 34
    new-instance p2, Ldefpackage/gp3;

    .line 35
    .line 36
    const/16 v1, 0xc

    .line 37
    .line 38
    invoke-direct {p2, v1}, Ldefpackage/gp3;-><init>(I)V

    .line 39
    .line 40
    .line 41
    iput-object p2, p0, Ldefpackage/i11;->a:Ldefpackage/gp3;

    .line 42
    .line 43
    new-instance v2, Ldefpackage/lv4;

    .line 44
    .line 45
    move-object v8, p0

    .line 46
    move-object v7, p0

    .line 47
    move-object v3, p3

    .line 48
    move-object v4, p4

    .line 49
    move-object v5, p5

    .line 50
    move-object v6, p6

    .line 51
    invoke-direct/range {v2 .. v8}, Ldefpackage/lv4;-><init>(Ldefpackage/li1;Ldefpackage/li1;Ldefpackage/li1;Ldefpackage/li1;Ldefpackage/i11;Ldefpackage/i11;)V

    .line 52
    .line 53
    .line 54
    iput-object v2, v7, Ldefpackage/i11;->d:Ldefpackage/lv4;

    .line 55
    .line 56
    new-instance p0, Ldefpackage/ue1;

    .line 57
    .line 58
    invoke-direct {p0, v0}, Ldefpackage/ue1;-><init>(Ldefpackage/sd0;)V

    .line 59
    .line 60
    .line 61
    iput-object p0, v7, Ldefpackage/i11;->f:Ldefpackage/ue1;

    .line 62
    .line 63
    new-instance p0, Ldefpackage/xk0;

    .line 64
    .line 65
    const/4 p2, 0x6

    .line 66
    invoke-direct {p0, p2}, Ldefpackage/xk0;-><init>(I)V

    .line 67
    .line 68
    .line 69
    iput-object p0, v7, Ldefpackage/i11;->e:Ldefpackage/xk0;

    .line 70
    .line 71
    iput-object v7, p1, Ldefpackage/pf2;->d:Ldefpackage/i11;

    .line 72
    .line 73
    return-void

    .line 74
    :catchall_0
    move-exception v0

    .line 75
    move-object v7, p0

    .line 76
    :goto_0
    move-object p0, v0

    .line 77
    goto :goto_2

    .line 78
    :catchall_1
    move-exception v0

    .line 79
    move-object v7, p0

    .line 80
    :goto_1
    move-object p0, v0

    .line 81
    :try_start_3
    monitor-exit p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 82
    :try_start_4
    throw p0

    .line 83
    :catchall_2
    move-exception v0

    .line 84
    goto :goto_0

    .line 85
    :catchall_3
    move-exception v0

    .line 86
    goto :goto_1

    .line 87
    :goto_2
    monitor-exit v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 88
    throw p0
.end method

.method public static c(Ljava/lang/String;JLdefpackage/n11;)V
    .locals 1

    .line 1
    const-string v0, " in "

    .line 2
    .line 3
    invoke-static {p0, v0}, Ldefpackage/b11;->s(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p1, p2}, Ldefpackage/ee2;->a(J)D

    .line 8
    .line 9
    .line 10
    move-result-wide p1

    .line 11
    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p1, "ms, key: "

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string p1, "Engine"

    .line 27
    .line 28
    invoke-static {p1, p0}, Landroid/util/Ldefpackage/og;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static f(Ldefpackage/q04;)V
    .locals 1

    .line 1
    instance-of v0, p0, Ldefpackage/o11;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ldefpackage/o11;

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/o11;->c()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p0, "Cannot release anything but an EngineResource"

    .line 12
    .line 13
    invoke-static {p0}, Ldefpackage/kf2;->n(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/ii1;Ljava/lang/Object;Ldefpackage/f42;IILjava/lang/Class;Ljava/lang/Class;Ldefpackage/eq3;Ldefpackage/xq0;Ldefpackage/yx;ZZLdefpackage/db3;ZZZLdefpackage/cf4;Ljava/util/concurrent/Executor;)Ldefpackage/z05;
    .locals 24

    .line 1
    move-object/from16 v2, p0

    .line 2
    .line 3
    sget-boolean v0, Ldefpackage/i11;->h:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    sget v0, Ldefpackage/ee2;->b:I

    .line 8
    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    :goto_0
    iget-object v3, v2, Ldefpackage/i11;->b:Ldefpackage/om0;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v4, Ldefpackage/n11;

    .line 22
    .line 23
    move-object/from16 v5, p2

    .line 24
    .line 25
    move-object/from16 v6, p3

    .line 26
    .line 27
    move/from16 v7, p4

    .line 28
    .line 29
    move/from16 v8, p5

    .line 30
    .line 31
    move-object/from16 v10, p6

    .line 32
    .line 33
    move-object/from16 v11, p7

    .line 34
    .line 35
    move-object/from16 v9, p10

    .line 36
    .line 37
    move-object/from16 v12, p13

    .line 38
    .line 39
    invoke-direct/range {v4 .. v12}, Ldefpackage/n11;-><init>(Ljava/lang/Object;Ldefpackage/f42;IILjava/util/Map;Ljava/lang/Class;Ljava/lang/Class;Ldefpackage/db3;)V

    .line 40
    .line 41
    .line 42
    monitor-enter p0

    .line 43
    move/from16 v3, p14

    .line 44
    .line 45
    :try_start_0
    invoke-virtual {v2, v4, v3, v0, v1}, Ldefpackage/i11;->b(Ldefpackage/n11;ZJ)Ldefpackage/o11;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    if-nez v5, :cond_1

    .line 50
    .line 51
    move-object/from16 v5, p3

    .line 52
    .line 53
    move/from16 v6, p4

    .line 54
    .line 55
    move/from16 v7, p5

    .line 56
    .line 57
    move-object/from16 v8, p6

    .line 58
    .line 59
    move-object/from16 v9, p7

    .line 60
    .line 61
    move-object/from16 v10, p8

    .line 62
    .line 63
    move-object/from16 v11, p9

    .line 64
    .line 65
    move-object/from16 v12, p10

    .line 66
    .line 67
    move/from16 v13, p11

    .line 68
    .line 69
    move/from16 v14, p12

    .line 70
    .line 71
    move-object/from16 v15, p13

    .line 72
    .line 73
    move/from16 v17, p15

    .line 74
    .line 75
    move/from16 v18, p16

    .line 76
    .line 77
    move-object/from16 v19, p17

    .line 78
    .line 79
    move-object/from16 v20, p18

    .line 80
    .line 81
    move-wide/from16 v22, v0

    .line 82
    .line 83
    move/from16 v16, v3

    .line 84
    .line 85
    move-object/from16 v21, v4

    .line 86
    .line 87
    move-object/from16 v3, p1

    .line 88
    .line 89
    move-object/from16 v4, p2

    .line 90
    .line 91
    invoke-virtual/range {v2 .. v23}, Ldefpackage/i11;->g(Ldefpackage/ii1;Ljava/lang/Object;Ldefpackage/f42;IILjava/lang/Class;Ljava/lang/Class;Ldefpackage/eq3;Ldefpackage/xq0;Ljava/util/Map;ZZLdefpackage/db3;ZZZLdefpackage/cf4;Ljava/util/concurrent/Executor;Ldefpackage/n11;J)Ldefpackage/z05;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    monitor-exit p0

    .line 96
    return-object v0

    .line 97
    :catchall_0
    move-exception v0

    .line 98
    goto :goto_1

    .line 99
    :cond_1
    move-object v0, v5

    .line 100
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    const/4 v1, 0x5

    .line 102
    move-object/from16 v2, p17

    .line 103
    .line 104
    invoke-virtual {v2, v0, v1}, Ldefpackage/cf4;->i(Ldefpackage/q04;I)V

    .line 105
    .line 106
    .line 107
    const/4 v0, 0x0

    .line 108
    return-object v0

    .line 109
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    throw v0
.end method

.method public final b(Ldefpackage/n11;ZJ)Ldefpackage/o11;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    goto/16 :goto_4

    .line 5
    .line 6
    :cond_0
    iget-object p2, p0, Ldefpackage/i11;->g:Ldefpackage/ns3;

    .line 7
    .line 8
    monitor-enter p2

    .line 9
    :try_start_0
    iget-object v1, p2, Ldefpackage/ns3;->o:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ldefpackage/i5;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    monitor-exit p2

    .line 22
    move-object v2, v0

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Ldefpackage/o11;

    .line 29
    .line 30
    if-nez v2, :cond_2

    .line 31
    .line 32
    invoke-virtual {p2, v1}, Ldefpackage/ns3;->b(Ldefpackage/i5;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception v0

    .line 37
    move-object p0, v0

    .line 38
    goto/16 :goto_5

    .line 39
    .line 40
    :cond_2
    :goto_0
    monitor-exit p2

    .line 41
    :goto_1
    if-eqz v2, :cond_3

    .line 42
    .line 43
    invoke-virtual {v2}, Ldefpackage/o11;->a()V

    .line 44
    .line 45
    .line 46
    :cond_3
    if-eqz v2, :cond_5

    .line 47
    .line 48
    sget-boolean p0, Ldefpackage/i11;->h:Z

    .line 49
    .line 50
    if-eqz p0, :cond_4

    .line 51
    .line 52
    const-string p0, "Loaded resource from active resources"

    .line 53
    .line 54
    invoke-static {p0, p3, p4, p1}, Ldefpackage/i11;->c(Ljava/lang/String;JLdefpackage/n11;)V

    .line 55
    .line 56
    .line 57
    :cond_4
    return-object v2

    .line 58
    :cond_5
    iget-object v1, p0, Ldefpackage/i11;->c:Ldefpackage/pf2;

    .line 59
    .line 60
    monitor-enter v1

    .line 61
    :try_start_2
    iget-object p2, v1, Ldefpackage/sj0;->c:Ljava/io/Serializable;

    .line 62
    .line 63
    check-cast p2, Ljava/util/LinkedHashMap;

    .line 64
    .line 65
    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    check-cast p2, Ldefpackage/of2;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 70
    .line 71
    if-nez p2, :cond_6

    .line 72
    .line 73
    monitor-exit v1

    .line 74
    move-object p2, v0

    .line 75
    goto :goto_2

    .line 76
    :cond_6
    :try_start_3
    iget-wide v2, v1, Ldefpackage/sj0;->b:J

    .line 77
    .line 78
    iget v4, p2, Ldefpackage/of2;->b:I

    .line 79
    .line 80
    int-to-long v4, v4

    .line 81
    sub-long/2addr v2, v4

    .line 82
    iput-wide v2, v1, Ldefpackage/sj0;->b:J

    .line 83
    .line 84
    iget-object p2, p2, Ldefpackage/of2;->a:Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 85
    .line 86
    monitor-exit v1

    .line 87
    :goto_2
    move-object v2, p2

    .line 88
    check-cast v2, Ldefpackage/q04;

    .line 89
    .line 90
    if-nez v2, :cond_7

    .line 91
    .line 92
    move-object v6, p0

    .line 93
    move-object v5, p1

    .line 94
    move-object v2, v0

    .line 95
    goto :goto_3

    .line 96
    :cond_7
    instance-of p2, v2, Ldefpackage/o11;

    .line 97
    .line 98
    if-eqz p2, :cond_8

    .line 99
    .line 100
    check-cast v2, Ldefpackage/o11;

    .line 101
    .line 102
    move-object v6, p0

    .line 103
    move-object v5, p1

    .line 104
    goto :goto_3

    .line 105
    :cond_8
    new-instance v1, Ldefpackage/o11;

    .line 106
    .line 107
    const/4 v3, 0x1

    .line 108
    const/4 v4, 0x1

    .line 109
    move-object v6, p0

    .line 110
    move-object v5, p1

    .line 111
    invoke-direct/range {v1 .. v6}, Ldefpackage/o11;-><init>(Ldefpackage/q04;ZZLdefpackage/f42;Ldefpackage/i11;)V

    .line 112
    .line 113
    .line 114
    move-object v2, v1

    .line 115
    :goto_3
    if-eqz v2, :cond_9

    .line 116
    .line 117
    invoke-virtual {v2}, Ldefpackage/o11;->a()V

    .line 118
    .line 119
    .line 120
    iget-object p0, v6, Ldefpackage/i11;->g:Ldefpackage/ns3;

    .line 121
    .line 122
    invoke-virtual {p0, v5, v2}, Ldefpackage/ns3;->a(Ldefpackage/f42;Ldefpackage/o11;)V

    .line 123
    .line 124
    .line 125
    :cond_9
    if-eqz v2, :cond_b

    .line 126
    .line 127
    sget-boolean p0, Ldefpackage/i11;->h:Z

    .line 128
    .line 129
    if-eqz p0, :cond_a

    .line 130
    .line 131
    const-string p0, "Loaded resource from cache"

    .line 132
    .line 133
    invoke-static {p0, p3, p4, v5}, Ldefpackage/i11;->c(Ljava/lang/String;JLdefpackage/n11;)V

    .line 134
    .line 135
    .line 136
    :cond_a
    return-object v2

    .line 137
    :cond_b
    :goto_4
    return-object v0

    .line 138
    :catchall_1
    move-exception v0

    .line 139
    move-object p0, v0

    .line 140
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 141
    throw p0

    .line 142
    :goto_5
    :try_start_5
    monitor-exit p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 143
    throw p0
.end method

.method public final declared-synchronized d(Ldefpackage/m11;Ldefpackage/n11;Ldefpackage/o11;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    :try_start_0
    iget-boolean v0, p3, Ldefpackage/o11;->n:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Ldefpackage/i11;->g:Ldefpackage/ns3;

    .line 9
    .line 10
    invoke-virtual {v0, p2, p3}, Ldefpackage/ns3;->a(Ldefpackage/f42;Ldefpackage/o11;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    goto :goto_4

    .line 16
    :cond_0
    :goto_0
    iget-object p3, p0, Ldefpackage/i11;->a:Ldefpackage/gp3;

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-boolean v0, p1, Ldefpackage/m11;->A:Z

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object p3, p3, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 26
    .line 27
    :goto_1
    check-cast p3, Ljava/util/HashMap;

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_1
    iget-object p3, p3, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :goto_2
    invoke-virtual {p3, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    if-eq p1, v0, :cond_2

    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_2
    invoke-virtual {p3, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    :goto_3
    monitor-exit p0

    .line 44
    return-void

    .line 45
    :goto_4
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    throw p1
.end method

.method public final e(Ldefpackage/f42;Ldefpackage/o11;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/i11;->g:Ldefpackage/ns3;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, v0, Ldefpackage/ns3;->o:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, Ldefpackage/i5;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    iput-object v2, v1, Ldefpackage/i5;->c:Ldefpackage/q04;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    :cond_0
    monitor-exit v0

    .line 23
    iget-boolean v0, p2, Ldefpackage/o11;->n:Z

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object p0, p0, Ldefpackage/i11;->c:Ldefpackage/pf2;

    .line 28
    .line 29
    invoke-virtual {p0, p1, p2}, Ldefpackage/sj0;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Ldefpackage/q04;

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    iget-object p0, p0, Ldefpackage/i11;->e:Ldefpackage/xk0;

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    invoke-virtual {p0, p2, p1}, Ldefpackage/xk0;->k(Ldefpackage/q04;Z)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    throw p0
.end method

.method public final g(Ldefpackage/ii1;Ljava/lang/Object;Ldefpackage/f42;IILjava/lang/Class;Ljava/lang/Class;Ldefpackage/eq3;Ldefpackage/xq0;Ljava/util/Map;ZZLdefpackage/db3;ZZZLdefpackage/cf4;Ljava/util/concurrent/Executor;Ldefpackage/n11;J)Ldefpackage/z05;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    move/from16 v5, p5

    .line 12
    .line 13
    move-object/from16 v6, p8

    .line 14
    .line 15
    move-object/from16 v7, p9

    .line 16
    .line 17
    move-object/from16 v8, p13

    .line 18
    .line 19
    move/from16 v9, p16

    .line 20
    .line 21
    move-object/from16 v10, p17

    .line 22
    .line 23
    move-object/from16 v11, p18

    .line 24
    .line 25
    move-object/from16 v12, p19

    .line 26
    .line 27
    move-wide/from16 v13, p20

    .line 28
    .line 29
    iget-object v15, v0, Ldefpackage/i11;->a:Ldefpackage/gp3;

    .line 30
    .line 31
    if-eqz v9, :cond_0

    .line 32
    .line 33
    iget-object v15, v15, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 34
    .line 35
    :goto_0
    check-cast v15, Ljava/util/HashMap;

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_0
    iget-object v15, v15, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :goto_1
    invoke-virtual {v15, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v15

    .line 45
    check-cast v15, Ldefpackage/m11;

    .line 46
    .line 47
    if-eqz v15, :cond_2

    .line 48
    .line 49
    invoke-virtual {v15, v10, v11}, Ldefpackage/m11;->a(Ldefpackage/cf4;Ljava/util/concurrent/Executor;)V

    .line 50
    .line 51
    .line 52
    sget-boolean v1, Ldefpackage/i11;->h:Z

    .line 53
    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    const-string v1, "Added to existing load"

    .line 57
    .line 58
    invoke-static {v1, v13, v14, v12}, Ldefpackage/i11;->c(Ljava/lang/String;JLdefpackage/n11;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    new-instance v1, Ldefpackage/z05;

    .line 62
    .line 63
    invoke-direct {v1, v0, v10, v15}, Ldefpackage/z05;-><init>(Ldefpackage/i11;Ldefpackage/cf4;Ldefpackage/m11;)V

    .line 64
    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_2
    iget-object v15, v0, Ldefpackage/i11;->d:Ldefpackage/lv4;

    .line 68
    .line 69
    iget-object v15, v15, Ldefpackage/lv4;->t:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v15, Ldefpackage/i61;

    .line 72
    .line 73
    invoke-virtual {v15}, Ldefpackage/i61;->b()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v15

    .line 77
    check-cast v15, Ldefpackage/m11;

    .line 78
    .line 79
    monitor-enter v15

    .line 80
    :try_start_0
    iput-object v12, v15, Ldefpackage/m11;->x:Ldefpackage/n11;

    .line 81
    .line 82
    move/from16 v13, p14

    .line 83
    .line 84
    iput-boolean v13, v15, Ldefpackage/m11;->y:Z

    .line 85
    .line 86
    move/from16 v13, p15

    .line 87
    .line 88
    iput-boolean v13, v15, Ldefpackage/m11;->z:Z

    .line 89
    .line 90
    iput-boolean v9, v15, Ldefpackage/m11;->A:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 91
    .line 92
    monitor-exit v15

    .line 93
    iget-object v13, v0, Ldefpackage/i11;->f:Ldefpackage/ue1;

    .line 94
    .line 95
    iget-object v14, v13, Ldefpackage/ue1;->q:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v14, Ldefpackage/i61;

    .line 98
    .line 99
    invoke-virtual {v14}, Ldefpackage/i61;->b()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v14

    .line 103
    check-cast v14, Ldefpackage/xi0;

    .line 104
    .line 105
    iget v10, v13, Ldefpackage/ue1;->o:I

    .line 106
    .line 107
    add-int/lit8 v11, v10, 0x1

    .line 108
    .line 109
    iput v11, v13, Ldefpackage/ue1;->o:I

    .line 110
    .line 111
    iget-object v11, v14, Ldefpackage/xi0;->n:Ldefpackage/wi0;

    .line 112
    .line 113
    iget-object v13, v14, Ldefpackage/xi0;->q:Ldefpackage/sd0;

    .line 114
    .line 115
    iput-object v1, v11, Ldefpackage/wi0;->c:Ldefpackage/ii1;

    .line 116
    .line 117
    iput-object v2, v11, Ldefpackage/wi0;->d:Ljava/lang/Object;

    .line 118
    .line 119
    iput-object v3, v11, Ldefpackage/wi0;->n:Ldefpackage/f42;

    .line 120
    .line 121
    iput v4, v11, Ldefpackage/wi0;->e:I

    .line 122
    .line 123
    iput v5, v11, Ldefpackage/wi0;->f:I

    .line 124
    .line 125
    iput-object v7, v11, Ldefpackage/wi0;->p:Ldefpackage/xq0;

    .line 126
    .line 127
    move-object/from16 v0, p6

    .line 128
    .line 129
    iput-object v0, v11, Ldefpackage/wi0;->g:Ljava/lang/Class;

    .line 130
    .line 131
    iput-object v13, v11, Ldefpackage/wi0;->h:Ldefpackage/sd0;

    .line 132
    .line 133
    move-object/from16 v0, p7

    .line 134
    .line 135
    iput-object v0, v11, Ldefpackage/wi0;->k:Ljava/lang/Class;

    .line 136
    .line 137
    iput-object v6, v11, Ldefpackage/wi0;->o:Ldefpackage/eq3;

    .line 138
    .line 139
    iput-object v8, v11, Ldefpackage/wi0;->i:Ldefpackage/db3;

    .line 140
    .line 141
    move-object/from16 v0, p10

    .line 142
    .line 143
    iput-object v0, v11, Ldefpackage/wi0;->j:Ljava/util/Map;

    .line 144
    .line 145
    move/from16 v0, p11

    .line 146
    .line 147
    iput-boolean v0, v11, Ldefpackage/wi0;->q:Z

    .line 148
    .line 149
    move/from16 v0, p12

    .line 150
    .line 151
    iput-boolean v0, v11, Ldefpackage/wi0;->r:Z

    .line 152
    .line 153
    iput-object v1, v14, Ldefpackage/xi0;->u:Ldefpackage/ii1;

    .line 154
    .line 155
    iput-object v3, v14, Ldefpackage/xi0;->v:Ldefpackage/f42;

    .line 156
    .line 157
    iput-object v6, v14, Ldefpackage/xi0;->w:Ldefpackage/eq3;

    .line 158
    .line 159
    iput-object v12, v14, Ldefpackage/xi0;->x:Ldefpackage/n11;

    .line 160
    .line 161
    iput v4, v14, Ldefpackage/xi0;->y:I

    .line 162
    .line 163
    iput v5, v14, Ldefpackage/xi0;->z:I

    .line 164
    .line 165
    iput-object v7, v14, Ldefpackage/xi0;->A:Ldefpackage/xq0;

    .line 166
    .line 167
    iput-boolean v9, v14, Ldefpackage/xi0;->F:Z

    .line 168
    .line 169
    iput-object v8, v14, Ldefpackage/xi0;->B:Ldefpackage/db3;

    .line 170
    .line 171
    iput-object v15, v14, Ldefpackage/xi0;->C:Ldefpackage/m11;

    .line 172
    .line 173
    iput v10, v14, Ldefpackage/xi0;->D:I

    .line 174
    .line 175
    const/4 v0, 0x1

    .line 176
    iput v0, v14, Ldefpackage/xi0;->R:I

    .line 177
    .line 178
    iput-object v2, v14, Ldefpackage/xi0;->G:Ljava/lang/Object;

    .line 179
    .line 180
    move-object/from16 v1, p0

    .line 181
    .line 182
    iget-object v2, v1, Ldefpackage/i11;->a:Ldefpackage/gp3;

    .line 183
    .line 184
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    iget-boolean v3, v15, Ldefpackage/m11;->A:Z

    .line 188
    .line 189
    if-eqz v3, :cond_3

    .line 190
    .line 191
    iget-object v2, v2, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 192
    .line 193
    :goto_2
    check-cast v2, Ljava/util/HashMap;

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_3
    iget-object v2, v2, Ldefpackage/gp3;->o:Ljava/lang/Object;

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :goto_3
    invoke-virtual {v2, v12, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-object/from16 v10, p17

    .line 203
    .line 204
    move-object/from16 v11, p18

    .line 205
    .line 206
    invoke-virtual {v15, v10, v11}, Ldefpackage/m11;->a(Ldefpackage/cf4;Ljava/util/concurrent/Executor;)V

    .line 207
    .line 208
    .line 209
    monitor-enter v15

    .line 210
    :try_start_1
    iput-object v14, v15, Ldefpackage/m11;->H:Ldefpackage/xi0;

    .line 211
    .line 212
    invoke-virtual {v14, v0}, Ldefpackage/xi0;->h(I)I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    const/4 v2, 0x2

    .line 217
    if-eq v0, v2, :cond_6

    .line 218
    .line 219
    const/4 v2, 0x3

    .line 220
    if-ne v0, v2, :cond_4

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_4
    iget-boolean v0, v15, Ldefpackage/m11;->z:Z

    .line 224
    .line 225
    if-eqz v0, :cond_5

    .line 226
    .line 227
    iget-object v0, v15, Ldefpackage/m11;->v:Ldefpackage/li1;

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_5
    iget-object v0, v15, Ldefpackage/m11;->u:Ldefpackage/li1;

    .line 231
    .line 232
    goto :goto_5

    .line 233
    :cond_6
    :goto_4
    iget-object v0, v15, Ldefpackage/m11;->t:Ldefpackage/li1;

    .line 234
    .line 235
    :goto_5
    invoke-virtual {v0, v14}, Ldefpackage/li1;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 236
    .line 237
    .line 238
    monitor-exit v15

    .line 239
    sget-boolean v0, Ldefpackage/i11;->h:Z

    .line 240
    .line 241
    if-eqz v0, :cond_7

    .line 242
    .line 243
    const-string v0, "Started new load"

    .line 244
    .line 245
    move-wide/from16 v13, p20

    .line 246
    .line 247
    invoke-static {v0, v13, v14, v12}, Ldefpackage/i11;->c(Ljava/lang/String;JLdefpackage/n11;)V

    .line 248
    .line 249
    .line 250
    :cond_7
    new-instance v0, Ldefpackage/z05;

    .line 251
    .line 252
    invoke-direct {v0, v1, v10, v15}, Ldefpackage/z05;-><init>(Ldefpackage/i11;Ldefpackage/cf4;Ldefpackage/m11;)V

    .line 253
    .line 254
    .line 255
    return-object v0

    .line 256
    :catchall_0
    move-exception v0

    .line 257
    :try_start_2
    monitor-exit v15
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 258
    throw v0

    .line 259
    :catchall_1
    move-exception v0

    .line 260
    :try_start_3
    monitor-exit v15
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 261
    throw v0
.end method
