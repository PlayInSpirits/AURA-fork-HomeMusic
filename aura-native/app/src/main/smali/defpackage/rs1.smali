.class public final Ldefpackage/rs1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ldefpackage/rs1;

.field public static final b:Ldefpackage/rp4;

.field public static final c:Ldefpackage/rp4;

.field public static final d:Ljava/util/concurrent/ScheduledExecutorService;

.field public static e:Ljava/util/concurrent/ScheduledFuture;

.field public static f:Ljava/util/concurrent/ScheduledFuture;

.field public static final g:Ldefpackage/rp4;

.field public static volatile h:Z

.field public static volatile i:J

.field public static volatile j:J

.field public static final k:Ldefpackage/rp4;

.field public static final l:Ljava/util/ArrayList;

.field public static volatile m:Ldefpackage/kd3;

.field public static volatile n:Ljava/util/Map;

.field public static volatile o:Ljava/util/Map;

.field public static p:Ljava/util/Map;

.field public static final q:Ljava/util/WeakHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/rs1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/rs1;->a:Ldefpackage/rs1;

    .line 7
    .line 8
    new-instance v0, Ldefpackage/e90;

    .line 9
    .line 10
    const/16 v1, 0xd

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ldefpackage/e90;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Ldefpackage/rp4;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Ldefpackage/rp4;-><init>(Ldefpackage/gf1;)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Ldefpackage/rs1;->b:Ldefpackage/rp4;

    .line 21
    .line 22
    new-instance v0, Ldefpackage/e90;

    .line 23
    .line 24
    const/16 v1, 0xe

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ldefpackage/e90;-><init>(I)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Ldefpackage/rp4;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Ldefpackage/rp4;-><init>(Ldefpackage/gf1;)V

    .line 32
    .line 33
    .line 34
    sput-object v1, Ldefpackage/rs1;->c:Ldefpackage/rp4;

    .line 35
    .line 36
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sput-object v0, Ldefpackage/rs1;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 41
    .line 42
    new-instance v0, Ldefpackage/e90;

    .line 43
    .line 44
    const/16 v1, 0xf

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ldefpackage/e90;-><init>(I)V

    .line 47
    .line 48
    .line 49
    new-instance v1, Ldefpackage/rp4;

    .line 50
    .line 51
    invoke-direct {v1, v0}, Ldefpackage/rp4;-><init>(Ldefpackage/gf1;)V

    .line 52
    .line 53
    .line 54
    sput-object v1, Ldefpackage/rs1;->g:Ldefpackage/rp4;

    .line 55
    .line 56
    const-wide/high16 v0, -0x8000000000000000L

    .line 57
    .line 58
    sput-wide v0, Ldefpackage/rs1;->i:J

    .line 59
    .line 60
    sput-wide v0, Ldefpackage/rs1;->j:J

    .line 61
    .line 62
    new-instance v0, Ldefpackage/e90;

    .line 63
    .line 64
    const/16 v1, 0x10

    .line 65
    .line 66
    invoke-direct {v0, v1}, Ldefpackage/e90;-><init>(I)V

    .line 67
    .line 68
    .line 69
    new-instance v1, Ldefpackage/rp4;

    .line 70
    .line 71
    invoke-direct {v1, v0}, Ldefpackage/rp4;-><init>(Ldefpackage/gf1;)V

    .line 72
    .line 73
    .line 74
    sput-object v1, Ldefpackage/rs1;->k:Ldefpackage/rp4;

    .line 75
    .line 76
    new-instance v0, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 79
    .line 80
    .line 81
    sput-object v0, Ldefpackage/rs1;->l:Ljava/util/ArrayList;

    .line 82
    .line 83
    sget-object v0, Ldefpackage/v01;->n:Ldefpackage/v01;

    .line 84
    .line 85
    sput-object v0, Ldefpackage/rs1;->n:Ljava/util/Map;

    .line 86
    .line 87
    sput-object v0, Ldefpackage/rs1;->o:Ljava/util/Map;

    .line 88
    .line 89
    sput-object v0, Ldefpackage/rs1;->p:Ljava/util/Map;

    .line 90
    .line 91
    new-instance v0, Ljava/util/WeakHashMap;

    .line 92
    .line 93
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 94
    .line 95
    .line 96
    sput-object v0, Ldefpackage/rs1;->q:Ljava/util/WeakHashMap;

    .line 97
    .line 98
    return-void
.end method

.method public static final a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 9

    .line 1
    sget-object v0, Ldefpackage/rs1;->a:Ldefpackage/rs1;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Ldefpackage/rs1;->l:Ljava/util/ArrayList;

    .line 5
    .line 6
    new-instance v2, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    const/4 v4, 0x0

    .line 16
    move v5, v4

    .line 17
    :cond_0
    :goto_0
    if-ge v5, v3, :cond_3

    .line 18
    .line 19
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    add-int/lit8 v5, v5, 0x1

    .line 24
    .line 25
    move-object v7, v6

    .line 26
    check-cast v7, Ldefpackage/kd3;

    .line 27
    .line 28
    iget-object v7, v7, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v7, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 31
    .line 32
    invoke-virtual {v7}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getAccount()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    invoke-static {v8, p0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    if-eqz v8, :cond_0

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-virtual {v7}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getRef()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    if-eqz v8, :cond_1

    .line 49
    .line 50
    const-string v7, "hub:"

    .line 51
    .line 52
    invoke-virtual {v7, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {v7}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getNdSongId()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v7

    .line 61
    :goto_1
    invoke-static {v7, p1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-nez v7, :cond_0

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    goto :goto_4

    .line 70
    :cond_2
    :goto_2
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_3
    sget-object p0, Ldefpackage/rs1;->l:Ljava/util/ArrayList;

    .line 75
    .line 76
    invoke-static {v2}, Ldefpackage/q40;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, Ljava/util/Collection;

    .line 81
    .line 82
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    :goto_3
    if-ge v4, p0, :cond_4

    .line 90
    .line 91
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    add-int/lit8 v4, v4, 0x1

    .line 96
    .line 97
    check-cast p1, Ldefpackage/kd3;

    .line 98
    .line 99
    iget-object p1, p1, Ldefpackage/kd3;->o:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast p1, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 102
    .line 103
    invoke-static {p1}, Ldefpackage/rs1;->d(Lcom/eddyizm/tempus/homemusic/PlayEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_4
    monitor-exit v0

    .line 108
    return-void

    .line 109
    :goto_4
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 110
    throw p0
.end method

.method public static b(Ljava/util/LinkedHashMap;Ljava/util/Map;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ldefpackage/rs1;->n:Ljava/util/Map;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p0}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Ldefpackage/rs1;->n:Ljava/util/Map;

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    sget-object p0, Ldefpackage/rs1;->o:Ljava/util/Map;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    invoke-direct {v0, p0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 36
    .line 37
    .line 38
    sput-object v0, Ldefpackage/rs1;->o:Ljava/util/Map;

    .line 39
    .line 40
    :cond_0
    return-void
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ldefpackage/rs1;->n:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ljava/lang/String;

    .line 11
    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    const-string p0, "other"

    .line 15
    .line 16
    :cond_0
    return-object p0
.end method

.method public static d(Lcom/eddyizm/tempus/homemusic/PlayEvent;)V
    .locals 16

    .line 1
    invoke-virtual/range {p0 .. p0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getRef()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v1, "hub:"

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :goto_0
    move-object v2, v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getNdSongId()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :goto_1
    if-nez v2, :cond_1

    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    sget-object v0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->Companion:Ldefpackage/ih3;

    .line 24
    .line 25
    invoke-static {}, Ldefpackage/rs1;->f()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 30
    .line 31
    .line 32
    move-result-wide v4

    .line 33
    invoke-virtual/range {p0 .. p0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getPositionS()Ljava/lang/Double;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const/4 v6, 0x0

    .line 38
    const-wide v7, 0x408f400000000000L    # 1000.0

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 46
    .line 47
    .line 48
    move-result-wide v9

    .line 49
    mul-double/2addr v9, v7

    .line 50
    double-to-long v9, v9

    .line 51
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    move-object v1, v6

    .line 57
    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getDurationS()Ljava/lang/Double;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    if-eqz v9, :cond_3

    .line 62
    .line 63
    invoke-virtual {v9}, Ljava/lang/Number;->doubleValue()D

    .line 64
    .line 65
    .line 66
    move-result-wide v9

    .line 67
    mul-double/2addr v9, v7

    .line 68
    double-to-long v6, v9

    .line 69
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    :cond_3
    move-object v7, v6

    .line 74
    invoke-virtual/range {p0 .. p0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getContext()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-virtual/range {p0 .. p0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getPlaybackId()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-virtual/range {p0 .. p0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getDeviceId()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    invoke-virtual/range {p0 .. p0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getListenedMs()Ljava/lang/Long;

    .line 87
    .line 88
    .line 89
    move-result-object v11

    .line 90
    invoke-virtual/range {p0 .. p0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getAccount()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v12

    .line 94
    invoke-virtual/range {p0 .. p0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getTrackMetadata()Ljava/util/Map;

    .line 95
    .line 96
    .line 97
    move-result-object v13

    .line 98
    invoke-virtual/range {p0 .. p0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getLaunchId()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v14

    .line 102
    invoke-virtual/range {p0 .. p0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getLaunchOrigin()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v15

    .line 106
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-object v6, v1

    .line 110
    const-string v1, "interrupted"

    .line 111
    .line 112
    invoke-static/range {v1 .. v15}, Ldefpackage/ih3;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {v0}, Ldefpackage/rs1;->j(Lcom/eddyizm/tempus/homemusic/PlayEvent;)V

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public static e()V
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Ldefpackage/rs1;->c:Ldefpackage/rp4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/rp4;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldefpackage/nh3;

    .line 8
    .line 9
    invoke-virtual {v0}, Ldefpackage/nh3;->a()Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    goto :goto_0

    .line 14
    :catch_0
    move-exception v0

    .line 15
    const-string v1, "HubPlays"

    .line 16
    .line 17
    const-string v2, "flush"

    .line 18
    .line 19
    invoke-static {v1, v2, v0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 20
    .line 21
    .line 22
    const-wide/16 v0, 0x7530

    .line 23
    .line 24
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    invoke-static {v0, v1}, Ldefpackage/rs1;->k(J)V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method public static final f()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "app/1.14.7"

    .line 2
    .line 3
    const/16 v1, 0x20

    .line 4
    .line 5
    invoke-static {v1, v0}, Ldefpackage/qm4;->J0(ILjava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static final g()V
    .locals 9

    .line 1
    sget-boolean v0, Ldefpackage/rs1;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    sput-boolean v0, Ldefpackage/rs1;->h:Z

    .line 8
    .line 9
    new-instance v0, Ldefpackage/er1;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {v0, v1}, Ldefpackage/er1;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Ldefpackage/n61;->g:Ldefpackage/er1;

    .line 16
    .line 17
    new-instance v0, Ljava/io/File;

    .line 18
    .line 19
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "homemusic-open-plays"

    .line 28
    .line 29
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/4 v1, 0x0

    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    new-array v0, v1, [Ljava/io/File;

    .line 40
    .line 41
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    array-length v3, v0

    .line 47
    move v4, v1

    .line 48
    :goto_0
    if-ge v4, v3, :cond_3

    .line 49
    .line 50
    aget-object v5, v0, v4

    .line 51
    .line 52
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    const/16 v7, 0x2e

    .line 63
    .line 64
    const-string v8, ""

    .line 65
    .line 66
    invoke-static {v6, v7, v8}, Ldefpackage/qm4;->G0(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    const-string v7, "json"

    .line 71
    .line 72
    invoke-virtual {v6, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_2

    .line 77
    .line 78
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    :cond_4
    :goto_1
    if-ge v1, v0, :cond_5

    .line 89
    .line 90
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    add-int/lit8 v1, v1, 0x1

    .line 95
    .line 96
    check-cast v3, Ljava/io/File;

    .line 97
    .line 98
    :try_start_0
    sget-object v4, Ldefpackage/rr1;->c:Ldefpackage/nk1;

    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-static {v3}, Ldefpackage/ji2;->H(Ljava/io/File;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    const-class v6, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 108
    .line 109
    invoke-virtual {v4, v6, v5}, Ldefpackage/nk1;->d(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    check-cast v4, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 114
    .line 115
    invoke-virtual {v4}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getPlaybackId()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    if-eqz v5, :cond_4

    .line 120
    .line 121
    invoke-virtual {v4}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getDeviceId()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    if-eqz v5, :cond_4

    .line 126
    .line 127
    invoke-virtual {v4}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getListenedMs()Ljava/lang/Long;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    if-eqz v5, :cond_4

    .line 132
    .line 133
    sget-object v5, Ldefpackage/rs1;->l:Ljava/util/ArrayList;

    .line 134
    .line 135
    new-instance v6, Ldefpackage/kd3;

    .line 136
    .line 137
    invoke-direct {v6, v3, v4}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :catch_0
    move-exception v3

    .line 145
    const-string v4, "HubPlays"

    .line 146
    .line 147
    const-string v5, "read listening checkpoint"

    .line 148
    .line 149
    invoke-static {v4, v5, v3}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 150
    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_5
    sget-object v0, Ldefpackage/rs1;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 154
    .line 155
    new-instance v1, Ldefpackage/u6;

    .line 156
    .line 157
    const/16 v2, 0x8

    .line 158
    .line 159
    invoke-direct {v1, v2}, Ldefpackage/u6;-><init>(I)V

    .line 160
    .line 161
    .line 162
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 163
    .line 164
    .line 165
    return-void
.end method

.method public static h()V
    .locals 5

    .line 1
    sget-object v0, Ldefpackage/rs1;->f:Ljava/util/concurrent/ScheduledFuture;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 7
    .line 8
    .line 9
    :cond_0
    sget-object v0, Ldefpackage/rs1;->g:Ldefpackage/rp4;

    .line 10
    .line 11
    invoke-virtual {v0}, Ldefpackage/rp4;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ldefpackage/lx0;

    .line 16
    .line 17
    iget-object v1, v0, Ldefpackage/lx0;->b:Ldefpackage/ii;

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v1}, Ldefpackage/ii;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_1

    .line 24
    .line 25
    :try_start_0
    iget-object v2, v0, Ldefpackage/lx0;->a:Ldefpackage/or1;

    .line 26
    .line 27
    invoke-virtual {v1}, Ldefpackage/ii;->first()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v2, v3}, Ldefpackage/or1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ldefpackage/ii;->removeFirst()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catch_0
    const-string v0, "HubPlays"

    .line 39
    .line 40
    const-string v1, "Could not persist listening event; retrying"

    .line 41
    .line 42
    invoke-static {v0, v1}, Landroid/util/Ldefpackage/og;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 43
    .line 44
    .line 45
    new-instance v0, Ldefpackage/u6;

    .line 46
    .line 47
    const/16 v1, 0x9

    .line 48
    .line 49
    invoke-direct {v0, v1}, Ldefpackage/u6;-><init>(I)V

    .line 50
    .line 51
    .line 52
    const-wide/16 v1, 0x1e

    .line 53
    .line 54
    sget-object v3, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 55
    .line 56
    sget-object v4, Ldefpackage/rs1;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 57
    .line 58
    invoke-interface {v4, v0, v1, v2, v3}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, Ldefpackage/rs1;->f:Ljava/util/concurrent/ScheduledFuture;

    .line 63
    .line 64
    return-void

    .line 65
    :cond_1
    const/4 v0, 0x0

    .line 66
    sput-object v0, Ldefpackage/rs1;->f:Ljava/util/concurrent/ScheduledFuture;

    .line 67
    .line 68
    const-wide/16 v0, 0x1388

    .line 69
    .line 70
    invoke-static {v0, v1}, Ldefpackage/rs1;->k(J)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public static final i(Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xa

    .line 5
    .line 6
    invoke-static {p0, v0}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Ldefpackage/lg2;->W(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v1, 0x10

    .line 15
    .line 16
    if-ge v0, v1, :cond_0

    .line 17
    .line 18
    move v0, v1

    .line 19
    :cond_0
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 22
    .line 23
    .line 24
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v2, "queue"

    .line 45
    .line 46
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    sget-object p0, Ldefpackage/v01;->n:Ldefpackage/v01;

    .line 51
    .line 52
    invoke-static {v1, p0}, Ldefpackage/rs1;->b(Ljava/util/LinkedHashMap;Ljava/util/Map;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public static final j(Lcom/eddyizm/tempus/homemusic/PlayEvent;)V
    .locals 3

    .line 1
    const-string v0, "interrupted"

    .line 2
    .line 3
    const-string v1, "error"

    .line 4
    .line 5
    const-string v2, "progress"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ldefpackage/ti;->t0([Ljava/lang/Object;)Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getKind()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    sget-object v0, Lcom/eddyizm/tempus/homemusic/b;->a:Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    sget-object v0, Ldefpackage/io1;->b:Landroid/os/Handler;

    .line 28
    .line 29
    new-instance v1, Ldefpackage/os1;

    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    invoke-direct {v1, p0, v2}, Ldefpackage/os1;-><init>(Lcom/eddyizm/tempus/homemusic/PlayEvent;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 36
    .line 37
    .line 38
    sget-object v1, Lcom/eddyizm/tempus/homemusic/a;->a:Ljava/lang/ref/WeakReference;

    .line 39
    .line 40
    new-instance v1, Ldefpackage/os1;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    invoke-direct {v1, p0, v2}, Ldefpackage/os1;-><init>(Lcom/eddyizm/tempus/homemusic/PlayEvent;I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 47
    .line 48
    .line 49
    :cond_0
    new-instance v0, Ldefpackage/os1;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-direct {v0, p0, v1}, Ldefpackage/os1;-><init>(Lcom/eddyizm/tempus/homemusic/PlayEvent;I)V

    .line 53
    .line 54
    .line 55
    sget-object p0, Ldefpackage/rs1;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 56
    .line 57
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public static k(J)V
    .locals 3

    .line 1
    sget-object v0, Ldefpackage/rs1;->e:Ljava/util/concurrent/ScheduledFuture;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 7
    .line 8
    .line 9
    :cond_0
    new-instance v0, Ldefpackage/u6;

    .line 10
    .line 11
    const/16 v1, 0xa

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ldefpackage/u6;-><init>(I)V

    .line 14
    .line 15
    .line 16
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 17
    .line 18
    sget-object v2, Ldefpackage/rs1;->d:Ljava/util/concurrent/ScheduledExecutorService;

    .line 19
    .line 20
    invoke-interface {v2, v0, p0, p1, v1}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    sput-object p0, Ldefpackage/rs1;->e:Ljava/util/concurrent/ScheduledFuture;

    .line 25
    .line 26
    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
