.class public final Lu52;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Landroid/os/Handler;

.field public static final b:Lk03;

.field public static final c:Lk03;

.field public static d:Ljava/lang/String;

.field public static e:Z

.field public static f:Landroid/content/Context;

.field public static final g:Ljava/util/concurrent/ExecutorService;

.field public static final h:Ljava/util/concurrent/ExecutorService;

.field public static volatile i:J

.field public static volatile j:Landroid/net/nsd/NsdServiceInfo;

.field public static volatile k:Ljava/lang/String;

.field public static volatile l:Ljava/lang/String;

.field public static volatile m:Ljavax/net/ssl/SSLSocket;

.field public static volatile n:Ljavax/net/ssl/SSLSocket;

.field public static o:Ljava/util/concurrent/Future;


# direct methods
.method static constructor <clinit>()V
    .locals 32

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lu52;->a:Landroid/os/Handler;

    .line 11
    .line 12
    new-instance v0, Lk03;

    .line 13
    .line 14
    new-instance v1, Lv52;

    .line 15
    .line 16
    const/16 v30, 0x0

    .line 17
    .line 18
    const v31, 0x1fffffff

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, 0x0

    .line 26
    const-wide/16 v7, 0x0

    .line 27
    .line 28
    const-wide/16 v9, 0x0

    .line 29
    .line 30
    const/4 v11, 0x0

    .line 31
    const/4 v12, 0x0

    .line 32
    const/4 v13, 0x0

    .line 33
    const/4 v14, 0x0

    .line 34
    const/4 v15, 0x0

    .line 35
    const/16 v16, 0x0

    .line 36
    .line 37
    const/16 v17, 0x0

    .line 38
    .line 39
    const-wide/16 v18, 0x0

    .line 40
    .line 41
    const/16 v20, 0x0

    .line 42
    .line 43
    const/16 v21, 0x0

    .line 44
    .line 45
    const/16 v22, 0x0

    .line 46
    .line 47
    const/16 v23, 0x0

    .line 48
    .line 49
    const/16 v24, 0x0

    .line 50
    .line 51
    const/16 v25, 0x0

    .line 52
    .line 53
    const/16 v26, 0x0

    .line 54
    .line 55
    const/16 v27, 0x0

    .line 56
    .line 57
    const/16 v28, 0x0

    .line 58
    .line 59
    const/16 v29, 0x0

    .line 60
    .line 61
    invoke-direct/range {v1 .. v31}, Lv52;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZZFIIIIJLjava/lang/String;ZIZZLjava/lang/String;FFZZLjava/lang/String;I)V

    .line 62
    .line 63
    .line 64
    invoke-direct {v0, v1}, Lad2;-><init>(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    sput-object v0, Lu52;->b:Lk03;

    .line 68
    .line 69
    new-instance v0, Lk03;

    .line 70
    .line 71
    sget-object v1, Lu01;->n:Lu01;

    .line 72
    .line 73
    invoke-direct {v0, v1}, Lad2;-><init>(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    sput-object v0, Lu52;->c:Lk03;

    .line 77
    .line 78
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    sput-object v0, Lu52;->g:Ljava/util/concurrent/ExecutorService;

    .line 83
    .line 84
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    sput-object v0, Lu52;->h:Ljava/util/concurrent/ExecutorService;

    .line 89
    .line 90
    return-void
.end method

.method public static final a(Ljava/lang/String;J)V
    .locals 8

    .line 1
    invoke-static {}, Lu52;->c()Lv52;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lv52;->b:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    .line 11
    .line 12
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "command"

    .line 16
    .line 17
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "seek"

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    const-string v1, "position"

    .line 30
    .line 31
    invoke-virtual {v0, v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    :cond_1
    const-string v1, "volume"

    .line 35
    .line 36
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    const-wide/16 v4, 0x0

    .line 43
    .line 44
    const-wide/16 v6, 0x64

    .line 45
    .line 46
    move-wide v2, p1

    .line 47
    invoke-static/range {v2 .. v7}, Lgb;->n(JJJ)J

    .line 48
    .line 49
    .line 50
    move-result-wide p1

    .line 51
    move-wide v1, v2

    .line 52
    long-to-double p1, p1

    .line 53
    const-wide/high16 v3, 0x4059000000000000L    # 100.0

    .line 54
    .line 55
    div-double/2addr p1, v3

    .line 56
    const-string v3, "value"

    .line 57
    .line 58
    invoke-virtual {v0, v3, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    move-wide v1, p1

    .line 63
    :goto_0
    const-string p1, "shuffle"

    .line 64
    .line 65
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_4

    .line 70
    .line 71
    const-wide/16 p1, 0x0

    .line 72
    .line 73
    cmp-long p1, v1, p1

    .line 74
    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    const/4 p1, 0x1

    .line 78
    goto :goto_1

    .line 79
    :cond_3
    const/4 p1, 0x0

    .line 80
    :goto_1
    const-string p2, "enabled"

    .line 81
    .line 82
    invoke-virtual {v0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 83
    .line 84
    .line 85
    :cond_4
    const-string p1, "repeat"

    .line 86
    .line 87
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-eqz p0, :cond_5

    .line 92
    .line 93
    const-wide/16 v3, 0x0

    .line 94
    .line 95
    const-wide/16 v5, 0x2

    .line 96
    .line 97
    invoke-static/range {v1 .. v6}, Lgb;->n(JJJ)J

    .line 98
    .line 99
    .line 100
    move-result-wide p0

    .line 101
    const-string p2, "mode"

    .line 102
    .line 103
    invoke-virtual {v0, p2, p0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 104
    .line 105
    .line 106
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    new-instance p0, Lk52;

    .line 110
    .line 111
    const/4 p1, 0x5

    .line 112
    invoke-direct {p0, p1}, Lk52;-><init>(I)V

    .line 113
    .line 114
    .line 115
    invoke-static {v0, p0}, Lu52;->p(Lorg/json/JSONObject;Lif1;)V

    .line 116
    .line 117
    .line 118
    return-void
.end method

.method public static final b(Landroid/content/Context;Landroid/net/nsd/NsdServiceInfo;Ljava/lang/String;)V
    .locals 38

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lu52;->f()V

    .line 5
    .line 6
    .line 7
    sget-wide v2, Lu52;->i:J

    .line 8
    .line 9
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    sput-object v6, Lu52;->f:Landroid/content/Context;

    .line 14
    .line 15
    invoke-static {}, Lud3;->D()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    if-nez v4, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    sput-object v4, Lu52;->l:Ljava/lang/String;

    .line 23
    .line 24
    sput-object p1, Lu52;->j:Landroid/net/nsd/NsdServiceInfo;

    .line 25
    .line 26
    sget-object v0, Lu52;->b:Lk03;

    .line 27
    .line 28
    new-instance v7, Lv52;

    .line 29
    .line 30
    invoke-virtual/range {p1 .. p1}, Landroid/net/nsd/NsdServiceInfo;->getServiceName()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v8

    .line 34
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    const/16 v36, 0x0

    .line 38
    .line 39
    const v37, 0x1ffffffa

    .line 40
    .line 41
    .line 42
    const/4 v9, 0x0

    .line 43
    const/4 v10, 0x0

    .line 44
    const/4 v11, 0x0

    .line 45
    const/4 v12, 0x0

    .line 46
    const-wide/16 v13, 0x0

    .line 47
    .line 48
    const-wide/16 v15, 0x0

    .line 49
    .line 50
    const/16 v17, 0x0

    .line 51
    .line 52
    const/16 v18, 0x0

    .line 53
    .line 54
    const/16 v19, 0x0

    .line 55
    .line 56
    const/16 v20, 0x0

    .line 57
    .line 58
    const/16 v21, 0x0

    .line 59
    .line 60
    const/16 v22, 0x0

    .line 61
    .line 62
    const/16 v23, 0x0

    .line 63
    .line 64
    const-wide/16 v24, 0x0

    .line 65
    .line 66
    const/16 v26, 0x0

    .line 67
    .line 68
    const/16 v27, 0x0

    .line 69
    .line 70
    const/16 v28, 0x0

    .line 71
    .line 72
    const/16 v29, 0x0

    .line 73
    .line 74
    const/16 v30, 0x0

    .line 75
    .line 76
    const/16 v31, 0x0

    .line 77
    .line 78
    const/16 v32, 0x0

    .line 79
    .line 80
    const/16 v33, 0x0

    .line 81
    .line 82
    const/16 v34, 0x0

    .line 83
    .line 84
    const/16 v35, 0x0

    .line 85
    .line 86
    invoke-direct/range {v7 .. v37}, Lv52;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZZFIIIIJLjava/lang/String;ZIZZLjava/lang/String;FFZZLjava/lang/String;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v7}, Lad2;->k(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    sget-object v7, Lu52;->g:Ljava/util/concurrent/ExecutorService;

    .line 93
    .line 94
    new-instance v0, Ll52;

    .line 95
    .line 96
    move-object/from16 v5, p1

    .line 97
    .line 98
    move-object/from16 v1, p2

    .line 99
    .line 100
    invoke-direct/range {v0 .. v6}, Ll52;-><init>(Ljava/lang/String;JLjava/lang/String;Landroid/net/nsd/NsdServiceInfo;Landroid/content/Context;)V

    .line 101
    .line 102
    .line 103
    invoke-interface {v7, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sput-object v0, Lu52;->o:Ljava/util/concurrent/Future;

    .line 108
    .line 109
    return-void
.end method

.method public static final c()Lv52;
    .locals 32

    .line 1
    sget-object v0, Lu52;->b:Lk03;

    .line 2
    .line 3
    invoke-virtual {v0}, Lad2;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lv52;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v1, Lv52;

    .line 12
    .line 13
    const/16 v30, 0x0

    .line 14
    .line 15
    const v31, 0x1fffffff

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v6, 0x0

    .line 23
    const-wide/16 v7, 0x0

    .line 24
    .line 25
    const-wide/16 v9, 0x0

    .line 26
    .line 27
    const/4 v11, 0x0

    .line 28
    const/4 v12, 0x0

    .line 29
    const/4 v13, 0x0

    .line 30
    const/4 v14, 0x0

    .line 31
    const/4 v15, 0x0

    .line 32
    const/16 v16, 0x0

    .line 33
    .line 34
    const/16 v17, 0x0

    .line 35
    .line 36
    const-wide/16 v18, 0x0

    .line 37
    .line 38
    const/16 v20, 0x0

    .line 39
    .line 40
    const/16 v21, 0x0

    .line 41
    .line 42
    const/16 v22, 0x0

    .line 43
    .line 44
    const/16 v23, 0x0

    .line 45
    .line 46
    const/16 v24, 0x0

    .line 47
    .line 48
    const/16 v25, 0x0

    .line 49
    .line 50
    const/16 v26, 0x0

    .line 51
    .line 52
    const/16 v27, 0x0

    .line 53
    .line 54
    const/16 v28, 0x0

    .line 55
    .line 56
    const/16 v29, 0x0

    .line 57
    .line 58
    invoke-direct/range {v1 .. v31}, Lv52;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZZFIIIIJLjava/lang/String;ZIZZLjava/lang/String;FFZZLjava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    :cond_0
    return-object v0
.end method

.method public static final d()Lcom/eddyizm/tempus/subsonic/models/Child;
    .locals 40

    .line 1
    invoke-static {}, Lu52;->c()Lv52;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lu52;->l()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {}, Lu52;->k()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget v3, v0, Lv52;->o:I

    .line 20
    .line 21
    if-ltz v3, :cond_0

    .line 22
    .line 23
    if-ge v3, v2, :cond_0

    .line 24
    .line 25
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_0
    iget-object v2, v0, Lv52;->x:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v5, v0, Lv52;->d:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v7, v0, Lv52;->e:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v6, v0, Lv52;->f:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v11, v0, Lv52;->g:Ljava/lang/String;

    .line 41
    .line 42
    iget-wide v0, v0, Lv52;->i:J

    .line 43
    .line 44
    const-wide/16 v3, 0x3e8

    .line 45
    .line 46
    div-long/2addr v0, v3

    .line 47
    long-to-int v0, v0

    .line 48
    new-instance v1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 49
    .line 50
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v17

    .line 54
    const/16 v38, 0x7

    .line 55
    .line 56
    const/16 v39, 0x0

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    const/4 v4, 0x0

    .line 60
    const/4 v8, 0x0

    .line 61
    const/4 v9, 0x0

    .line 62
    const/4 v10, 0x0

    .line 63
    const/4 v12, 0x0

    .line 64
    const/4 v13, 0x0

    .line 65
    const/4 v14, 0x0

    .line 66
    const/4 v15, 0x0

    .line 67
    const/16 v16, 0x0

    .line 68
    .line 69
    const/16 v18, 0x0

    .line 70
    .line 71
    const/16 v19, 0x0

    .line 72
    .line 73
    const/16 v20, 0x0

    .line 74
    .line 75
    const/16 v21, 0x0

    .line 76
    .line 77
    const/16 v22, 0x0

    .line 78
    .line 79
    const/16 v23, 0x0

    .line 80
    .line 81
    const/16 v24, 0x0

    .line 82
    .line 83
    const/16 v25, 0x0

    .line 84
    .line 85
    const/16 v26, 0x0

    .line 86
    .line 87
    const/16 v27, 0x0

    .line 88
    .line 89
    const/16 v28, 0x0

    .line 90
    .line 91
    const/16 v29, 0x0

    .line 92
    .line 93
    const/16 v30, 0x0

    .line 94
    .line 95
    const/16 v31, 0x0

    .line 96
    .line 97
    const/16 v32, 0x0

    .line 98
    .line 99
    const/16 v33, 0x0

    .line 100
    .line 101
    const/16 v34, 0x0

    .line 102
    .line 103
    const/16 v35, 0x0

    .line 104
    .line 105
    const/16 v36, 0x0

    .line 106
    .line 107
    const v37, -0x823a

    .line 108
    .line 109
    .line 110
    invoke-direct/range {v1 .. v39}, Lcom/eddyizm/tempus/subsonic/models/Child;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;Ljava/lang/String;IILxj0;)V

    .line 111
    .line 112
    .line 113
    return-object v1
.end method

.method public static e(Lorg/json/JSONObject;)Lv52;
    .locals 33

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "name"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-string v1, "title"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const-string v1, "artist"

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const-string v1, "album"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v6

    .line 36
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    const-string v1, "cover"

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v7

    .line 45
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const-string v1, "position"

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 51
    .line 52
    .line 53
    move-result-wide v1

    .line 54
    const-wide/16 v8, 0x0

    .line 55
    .line 56
    cmp-long v10, v1, v8

    .line 57
    .line 58
    if-gez v10, :cond_0

    .line 59
    .line 60
    move-wide v1, v8

    .line 61
    :cond_0
    const-string v10, "duration"

    .line 62
    .line 63
    invoke-virtual {v0, v10}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 64
    .line 65
    .line 66
    move-result-wide v10

    .line 67
    cmp-long v12, v10, v8

    .line 68
    .line 69
    if-gez v12, :cond_1

    .line 70
    .line 71
    move-wide v10, v8

    .line 72
    :cond_1
    const-string v8, "playing"

    .line 73
    .line 74
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v12

    .line 78
    const-string v8, "playWhenReady"

    .line 79
    .line 80
    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 81
    .line 82
    .line 83
    move-result v13

    .line 84
    const-string v8, "volume"

    .line 85
    .line 86
    const-wide/high16 v14, 0x3ff0000000000000L    # 1.0

    .line 87
    .line 88
    invoke-virtual {v0, v8, v14, v15}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 89
    .line 90
    .line 91
    move-result-wide v8

    .line 92
    double-to-float v8, v8

    .line 93
    const/4 v9, 0x0

    .line 94
    const/high16 v14, 0x3f800000    # 1.0f

    .line 95
    .line 96
    invoke-static {v8, v9, v14}, Lgb;->l(FFF)F

    .line 97
    .line 98
    .line 99
    move-result v14

    .line 100
    const-string v8, "index"

    .line 101
    .line 102
    const/4 v9, -0x1

    .line 103
    invoke-virtual {v0, v8, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    const-string v9, "deviceVolume"

    .line 108
    .line 109
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 110
    .line 111
    .line 112
    move-result v15

    .line 113
    const-string v9, "deviceVolumeMax"

    .line 114
    .line 115
    invoke-virtual {v0, v9}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    move-result v9

    .line 119
    move-wide/from16 v18, v1

    .line 120
    .line 121
    const-string v1, "count"

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    move/from16 v17, v8

    .line 128
    .line 129
    move/from16 v16, v9

    .line 130
    .line 131
    move-wide/from16 v8, v18

    .line 132
    .line 133
    const-wide/high16 v21, 0x3ff0000000000000L    # 1.0

    .line 134
    .line 135
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 136
    .line 137
    .line 138
    move-result-wide v19

    .line 139
    const-string v2, "revision"

    .line 140
    .line 141
    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    move/from16 v18, v1

    .line 149
    .line 150
    const-string v1, "shuffle"

    .line 151
    .line 152
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    move/from16 v23, v1

    .line 157
    .line 158
    const-string v1, "repeat"

    .line 159
    .line 160
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    move/from16 v24, v1

    .line 165
    .line 166
    const-string v1, "next"

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 169
    .line 170
    .line 171
    move-result v1

    .line 172
    move/from16 v25, v1

    .line 173
    .line 174
    const-string v1, "previous"

    .line 175
    .line 176
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    move/from16 v26, v1

    .line 181
    .line 182
    const-string v1, "id"

    .line 183
    .line 184
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    move-object/from16 v27, v1

    .line 192
    .line 193
    const-string v1, "speed"

    .line 194
    .line 195
    move-object/from16 v29, v2

    .line 196
    .line 197
    move-object/from16 v28, v3

    .line 198
    .line 199
    move-wide/from16 v2, v21

    .line 200
    .line 201
    move-object/from16 v21, v4

    .line 202
    .line 203
    move-object/from16 v22, v5

    .line 204
    .line 205
    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 206
    .line 207
    .line 208
    move-result-wide v4

    .line 209
    double-to-float v1, v4

    .line 210
    const-string v4, "pitch"

    .line 211
    .line 212
    invoke-virtual {v0, v4, v2, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    .line 213
    .line 214
    .line 215
    move-result-wide v2

    .line 216
    double-to-float v2, v2

    .line 217
    const-string v3, "timerActive"

    .line 218
    .line 219
    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    const-string v4, "timerEnd"

    .line 224
    .line 225
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    .line 226
    .line 227
    .line 228
    move-result v30

    .line 229
    const-string v4, "timerRemaining"

    .line 230
    .line 231
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v31

    .line 235
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    move-object/from16 v4, v21

    .line 239
    .line 240
    move-object/from16 v21, v29

    .line 241
    .line 242
    move/from16 v29, v3

    .line 243
    .line 244
    move-object/from16 v3, v28

    .line 245
    .line 246
    move/from16 v28, v2

    .line 247
    .line 248
    new-instance v2, Lv52;

    .line 249
    .line 250
    const/high16 v32, 0x20000

    .line 251
    .line 252
    move-object/from16 v5, v22

    .line 253
    .line 254
    move/from16 v22, v23

    .line 255
    .line 256
    move/from16 v23, v24

    .line 257
    .line 258
    move/from16 v24, v25

    .line 259
    .line 260
    move/from16 v25, v26

    .line 261
    .line 262
    move-object/from16 v26, v27

    .line 263
    .line 264
    move/from16 v27, v1

    .line 265
    .line 266
    invoke-direct/range {v2 .. v32}, Lv52;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZZFIIIIJLjava/lang/String;ZIZZLjava/lang/String;FFZZLjava/lang/String;I)V

    .line 267
    .line 268
    .line 269
    return-object v2
.end method

.method public static final f()V
    .locals 33

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    invoke-static {}, Lz52;->b()V

    .line 16
    .line 17
    .line 18
    sget-wide v0, Lu52;->i:J

    .line 19
    .line 20
    const-wide/16 v2, 0x1

    .line 21
    .line 22
    add-long/2addr v0, v2

    .line 23
    sput-wide v0, Lu52;->i:J

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    sput-object v0, Lu52;->j:Landroid/net/nsd/NsdServiceInfo;

    .line 27
    .line 28
    sput-object v0, Lu52;->k:Ljava/lang/String;

    .line 29
    .line 30
    :try_start_0
    sget-object v1, Lu52;->m:Ljavax/net/ssl/SSLSocket;

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/net/Socket;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    :catchall_0
    :cond_0
    sput-object v0, Lu52;->m:Ljavax/net/ssl/SSLSocket;

    .line 38
    .line 39
    :try_start_1
    sget-object v1, Lu52;->n:Ljavax/net/ssl/SSLSocket;

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/net/Socket;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 44
    .line 45
    .line 46
    :catchall_1
    :cond_1
    sput-object v0, Lu52;->n:Ljavax/net/ssl/SSLSocket;

    .line 47
    .line 48
    sget-object v1, Lu52;->o:Ljava/util/concurrent/Future;

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    const/4 v2, 0x1

    .line 53
    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 54
    .line 55
    .line 56
    :cond_2
    sput-object v0, Lu52;->o:Ljava/util/concurrent/Future;

    .line 57
    .line 58
    sget-object v1, Lu52;->b:Lk03;

    .line 59
    .line 60
    new-instance v2, Lv52;

    .line 61
    .line 62
    const/16 v31, 0x0

    .line 63
    .line 64
    const v32, 0x1fffffff

    .line 65
    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    const/4 v4, 0x0

    .line 69
    const/4 v5, 0x0

    .line 70
    const/4 v6, 0x0

    .line 71
    const/4 v7, 0x0

    .line 72
    const-wide/16 v8, 0x0

    .line 73
    .line 74
    const-wide/16 v10, 0x0

    .line 75
    .line 76
    const/4 v12, 0x0

    .line 77
    const/4 v13, 0x0

    .line 78
    const/4 v14, 0x0

    .line 79
    const/4 v15, 0x0

    .line 80
    const/16 v16, 0x0

    .line 81
    .line 82
    const/16 v17, 0x0

    .line 83
    .line 84
    const/16 v18, 0x0

    .line 85
    .line 86
    const-wide/16 v19, 0x0

    .line 87
    .line 88
    const/16 v21, 0x0

    .line 89
    .line 90
    const/16 v22, 0x0

    .line 91
    .line 92
    const/16 v23, 0x0

    .line 93
    .line 94
    const/16 v24, 0x0

    .line 95
    .line 96
    const/16 v25, 0x0

    .line 97
    .line 98
    const/16 v26, 0x0

    .line 99
    .line 100
    const/16 v27, 0x0

    .line 101
    .line 102
    const/16 v28, 0x0

    .line 103
    .line 104
    const/16 v29, 0x0

    .line 105
    .line 106
    const/16 v30, 0x0

    .line 107
    .line 108
    invoke-direct/range {v2 .. v32}, Lv52;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZZFIIIIJLjava/lang/String;ZIZZLjava/lang/String;FFZZLjava/lang/String;I)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1, v2}, Lad2;->k(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    sget-object v1, Lu52;->c:Lk03;

    .line 115
    .line 116
    sget-object v2, Lu01;->n:Lu01;

    .line 117
    .line 118
    invoke-virtual {v1, v2}, Lad2;->k(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    sput-object v0, Lu52;->d:Ljava/lang/String;

    .line 122
    .line 123
    const/4 v0, 0x0

    .line 124
    sput-boolean v0, Lu52;->e:Z

    .line 125
    .line 126
    sget-object v0, Lw42;->a:Lw42;

    .line 127
    .line 128
    const-string v0, "Controller released remote playback; no stop command sent"

    .line 129
    .line 130
    invoke-static {v0}, Lw42;->b(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_3
    const-string v0, "Check failed."

    .line 135
    .line 136
    invoke-static {v0}, Lkf2;->o(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method public static g(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 9

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "command"

    .line 7
    .line 8
    const-string v2, "edit"

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "action"

    .line 15
    .line 16
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    sget-object v0, Lu52;->l:Ljava/lang/String;

    .line 21
    .line 22
    const-string v1, ""

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    move-object v0, v1

    .line 27
    :cond_0
    const/4 v2, 0x1

    .line 28
    new-array v3, v2, [C

    .line 29
    .line 30
    const/16 v4, 0x2f

    .line 31
    .line 32
    const/4 v5, 0x0

    .line 33
    aput-char v4, v3, v5

    .line 34
    .line 35
    invoke-static {v0, v3}, Lqm4;->L0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sget-object v3, Lw10;->a:Ljava/nio/charset/Charset;

    .line 40
    .line 41
    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const-string v3, "SHA-256"

    .line 49
    .line 50
    invoke-static {v3}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v3, v0}, Ljava/security/MessageDigest;->digest([B)[B

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    new-instance v3, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 67
    .line 68
    .line 69
    array-length v4, v0

    .line 70
    move v6, v5

    .line 71
    :goto_0
    if-ge v5, v4, :cond_2

    .line 72
    .line 73
    aget-byte v7, v0, v5

    .line 74
    .line 75
    add-int/2addr v6, v2

    .line 76
    if-le v6, v2, :cond_1

    .line 77
    .line 78
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 79
    .line 80
    .line 81
    :cond_1
    invoke-static {v7}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    invoke-static {v7, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    const-string v8, "%02x"

    .line 94
    .line 95
    invoke-static {v8, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 100
    .line 101
    .line 102
    add-int/lit8 v5, v5, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_2
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    const-string v1, "server"

    .line 113
    .line 114
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    sget-object v0, Lu52;->d:Ljava/lang/String;

    .line 119
    .line 120
    if-nez v0, :cond_3

    .line 121
    .line 122
    invoke-static {}, Lu52;->c()Lv52;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iget-object v0, v0, Lv52;->s:Ljava/lang/String;

    .line 127
    .line 128
    :cond_3
    const-string v1, "revision"

    .line 129
    .line 130
    invoke-virtual {p0, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    return-object p0
.end method

.method public static h(I)V
    .locals 1

    .line 1
    new-instance v0, Ln52;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ln52;-><init>(I)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lu52;->a:Landroid/os/Handler;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static i(Ljavax/net/ssl/SSLContext;Landroid/net/nsd/NsdServiceInfo;JZ)Ljavax/net/ssl/SSLSocket;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    check-cast p0, Ljavax/net/ssl/SSLSocket;

    .line 13
    .line 14
    if-eqz p4, :cond_0

    .line 15
    .line 16
    sput-object p0, Lu52;->m:Ljavax/net/ssl/SSLSocket;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sput-object p0, Lu52;->n:Ljavax/net/ssl/SSLSocket;

    .line 20
    .line 21
    :goto_0
    :try_start_0
    sget-wide v0, Lu52;->i:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    cmp-long p4, v0, p2

    .line 24
    .line 25
    const-string v0, "Check failed."

    .line 26
    .line 27
    if-nez p4, :cond_2

    .line 28
    .line 29
    const/16 p4, 0x1388

    .line 30
    .line 31
    :try_start_1
    invoke-virtual {p0, p4}, Ljava/net/Socket;->setSoTimeout(I)V

    .line 32
    .line 33
    .line 34
    new-instance v1, Ljava/net/InetSocketAddress;

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/net/nsd/NsdServiceInfo;->getHost()Ljava/net/InetAddress;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {p1}, Landroid/net/nsd/NsdServiceInfo;->getPort()I

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    invoke-direct {v1, v2, p1}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v1, p4}, Ljava/net/Socket;->connect(Ljava/net/SocketAddress;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    .line 51
    .line 52
    .line 53
    sget-wide v1, Lu52;->i:J

    .line 54
    .line 55
    cmp-long p1, v1, p2

    .line 56
    .line 57
    if-nez p1, :cond_1

    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :catch_0
    move-exception p1

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 69
    .line 70
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 74
    :goto_1
    invoke-virtual {p0}, Ljava/net/Socket;->close()V

    .line 75
    .line 76
    .line 77
    throw p1
.end method

.method public static final j(FF)V
    .locals 3

    .line 1
    invoke-static {}, Lu52;->c()Lv52;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lv52;->b:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    .line 11
    .line 12
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "command"

    .line 16
    .line 17
    const-string v2, "speed"

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {v0, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const-string v0, "pitch"

    .line 32
    .line 33
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    new-instance p1, Lk52;

    .line 45
    .line 46
    const/4 v0, 0x6

    .line 47
    invoke-direct {p1, v0}, Lk52;-><init>(I)V

    .line 48
    .line 49
    .line 50
    invoke-static {p0, p1}, Lu52;->p(Lorg/json/JSONObject;Lif1;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public static final k()Z
    .locals 2

    .line 1
    sget-object v0, Lu52;->d:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {}, Lu52;->c()Lv52;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v1, v1, Lv52;->s:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public static final l()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lu52;->c:Lk03;

    .line 2
    .line 3
    invoke-virtual {v0}, Lad2;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object v0, Lu01;->n:Lu01;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public static m()V
    .locals 3

    .line 1
    invoke-static {}, Lu52;->c()Lv52;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lv52;->b:Z

    .line 6
    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    sget-boolean v0, Lu52;->e:Z

    .line 10
    .line 11
    if-nez v0, :cond_3

    .line 12
    .line 13
    invoke-static {}, Lu52;->c()Lv52;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v0, v0, Lv52;->s:Ljava/lang/String;

    .line 18
    .line 19
    sget-object v1, Lu52;->d:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v0, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {}, Lu52;->c()Lv52;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget v0, v0, Lv52;->p:I

    .line 33
    .line 34
    const/16 v1, 0x1f4

    .line 35
    .line 36
    if-le v0, v1, :cond_2

    .line 37
    .line 38
    sget-object v0, Lu52;->d:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {}, Lu52;->c()Lv52;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-object v1, v1, Lv52;->s:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v0, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    const v0, 0x7f1302d4

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, Lu52;->h(I)V

    .line 56
    .line 57
    .line 58
    :cond_1
    invoke-static {}, Lu52;->c()Lv52;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v0, v0, Lv52;->s:Ljava/lang/String;

    .line 63
    .line 64
    sput-object v0, Lu52;->d:Ljava/lang/String;

    .line 65
    .line 66
    sget-object v0, Lu52;->c:Lk03;

    .line 67
    .line 68
    sget-object v1, Lu01;->n:Lu01;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Lad2;->k(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_2
    const/4 v0, 0x1

    .line 75
    sput-boolean v0, Lu52;->e:Z

    .line 76
    .line 77
    new-instance v0, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    new-instance v1, Ljx3;

    .line 83
    .line 84
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 85
    .line 86
    .line 87
    const/4 v2, 0x0

    .line 88
    invoke-static {v1, v0, v2}, Lu52;->n(Ljx3;Ljava/util/ArrayList;I)V

    .line 89
    .line 90
    .line 91
    :cond_3
    :goto_0
    return-void
.end method

.method public static final n(Ljx3;Ljava/util/ArrayList;I)V
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "command"

    .line 7
    .line 8
    const-string v2, "queue_state"

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "offset"

    .line 15
    .line 16
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v0, Le90;

    .line 24
    .line 25
    const/16 v1, 0x1b

    .line 26
    .line 27
    invoke-direct {v0, v1}, Le90;-><init>(I)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Lo;

    .line 31
    .line 32
    const/16 v2, 0xe

    .line 33
    .line 34
    invoke-direct {v1, v2, p0, p1}, Lo;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p2, v0, v1}, Lu52;->o(Lorg/json/JSONObject;Lgf1;Lif1;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public static o(Lorg/json/JSONObject;Lgf1;Lif1;)V
    .locals 9

    .line 1
    sget-wide v1, Lu52;->i:J

    .line 2
    .line 3
    sget-object v3, Lu52;->j:Landroid/net/nsd/NsdServiceInfo;

    .line 4
    .line 5
    if-nez v3, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v5, Lu52;->k:Ljava/lang/String;

    .line 9
    .line 10
    if-nez v5, :cond_1

    .line 11
    .line 12
    :goto_0
    return-void

    .line 13
    :cond_1
    sget-object v8, Lu52;->h:Ljava/util/concurrent/ExecutorService;

    .line 14
    .line 15
    new-instance v0, Lo52;

    .line 16
    .line 17
    move-object v4, p0

    .line 18
    move-object v7, p1

    .line 19
    move-object v6, p2

    .line 20
    invoke-direct/range {v0 .. v7}, Lo52;-><init>(JLandroid/net/nsd/NsdServiceInfo;Lorg/json/JSONObject;Ljava/lang/String;Lif1;Lgf1;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v8, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public static synthetic p(Lorg/json/JSONObject;Lif1;)V
    .locals 2

    .line 1
    new-instance v0, Le90;

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    invoke-direct {v0, v1}, Le90;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0, p1}, Lu52;->o(Lorg/json/JSONObject;Lgf1;Lif1;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static final q(Ljava/lang/String;II)Z
    .locals 4

    .line 1
    invoke-static {}, Lu52;->c()Lv52;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lv52;->a:Z

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    invoke-static {}, Lu52;->c()Lv52;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-boolean v0, v0, Lv52;->b:Z

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    const p0, 0x7f1302d8

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, Lu52;->h(I)V

    .line 24
    .line 25
    .line 26
    return v2

    .line 27
    :cond_1
    const-string v0, "clear"

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    sget-object v0, Lu52;->d:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {}, Lu52;->c()Lv52;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    iget-object v3, v3, Lv52;->s:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v0, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    const p0, 0x7f1302d3

    .line 50
    .line 51
    .line 52
    invoke-static {p0}, Lu52;->h(I)V

    .line 53
    .line 54
    .line 55
    invoke-static {}, Lu52;->l()Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {p0}, Lq40;->Q0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    sget-object p1, Lu52;->c:Lk03;

    .line 64
    .line 65
    invoke-virtual {p1, p0}, Lad2;->k(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return v2

    .line 69
    :cond_2
    invoke-static {p0}, Lu52;->g(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    const-string v0, "from"

    .line 74
    .line 75
    invoke-virtual {p0, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    const-string v0, "to"

    .line 80
    .line 81
    invoke-virtual {p0, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    const-string p2, "index"

    .line 86
    .line 87
    invoke-virtual {p0, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    new-instance p1, Le90;

    .line 95
    .line 96
    const/16 p2, 0x1a

    .line 97
    .line 98
    invoke-direct {p1, p2}, Le90;-><init>(I)V

    .line 99
    .line 100
    .line 101
    new-instance p2, Lk52;

    .line 102
    .line 103
    invoke-direct {p2, v1}, Lk52;-><init>(I)V

    .line 104
    .line 105
    .line 106
    invoke-static {p0, p1, p2}, Lu52;->o(Lorg/json/JSONObject;Lgf1;Lif1;)V

    .line 107
    .line 108
    .line 109
    return v2
.end method

.method public static final r(Ljava/util/List;Ljava/lang/String;IJ)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lu52;->c()Lv52;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-boolean v0, v0, Lv52;->a:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_0
    invoke-static {}, Lu52;->c()Lv52;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-boolean v0, v0, Lv52;->b:Z

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    const p0, 0x7f1302d8

    .line 24
    .line 25
    .line 26
    invoke-static {p0}, Lu52;->h(I)V

    .line 27
    .line 28
    .line 29
    return v1

    .line 30
    :cond_1
    const-string v0, "reorder"

    .line 31
    .line 32
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    sget-object v0, Lu52;->d:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {}, Lu52;->c()Lv52;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iget-object v2, v2, Lv52;->s:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v0, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    const p0, 0x7f1302d3

    .line 53
    .line 54
    .line 55
    invoke-static {p0}, Lu52;->h(I)V

    .line 56
    .line 57
    .line 58
    invoke-static {}, Lu52;->l()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {p0}, Lq40;->Q0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    sget-object p1, Lu52;->c:Lk03;

    .line 67
    .line 68
    invoke-virtual {p1, p0}, Lad2;->k(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return v1

    .line 72
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    .line 73
    .line 74
    const/16 v2, 0xa

    .line 75
    .line 76
    invoke-static {p0, v2}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_3

    .line 92
    .line 93
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 98
    .line 99
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_3
    :try_start_0
    invoke-static {v0}, Lj51;->T(Ljava/util/ArrayList;)V

    .line 108
    .line 109
    .line 110
    sget-object p0, Lj15;->a:Lj15;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 112
    goto :goto_1

    .line 113
    :catchall_0
    move-exception p0

    .line 114
    new-instance v2, Ls14;

    .line 115
    .line 116
    invoke-direct {v2, p0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    move-object p0, v2

    .line 120
    :goto_1
    instance-of p0, p0, Ls14;

    .line 121
    .line 122
    const v2, 0x7f1302d4

    .line 123
    .line 124
    .line 125
    if-nez p0, :cond_9

    .line 126
    .line 127
    const-string p0, "replace"

    .line 128
    .line 129
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-eqz v3, :cond_4

    .line 134
    .line 135
    if-ltz p2, :cond_9

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-ge p2, v3, :cond_9

    .line 142
    .line 143
    :cond_4
    invoke-static {p1}, Lu52;->g(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    new-instance v4, Lorg/json/JSONArray;

    .line 148
    .line 149
    invoke-direct {v4, v0}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 150
    .line 151
    .line 152
    const-string v0, "ids"

    .line 153
    .line 154
    invoke-virtual {v3, v0, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    const-string v3, "index"

    .line 159
    .line 160
    invoke-virtual {v0, v3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 161
    .line 162
    .line 163
    move-result-object p2

    .line 164
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-eqz v0, :cond_6

    .line 169
    .line 170
    const-wide/16 v3, 0x0

    .line 171
    .line 172
    cmp-long v0, p3, v3

    .line 173
    .line 174
    if-gez v0, :cond_5

    .line 175
    .line 176
    move-wide p3, v3

    .line 177
    :cond_5
    const-string v0, "position"

    .line 178
    .line 179
    invoke-virtual {p2, v0, p3, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 180
    .line 181
    .line 182
    :cond_6
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p3

    .line 186
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    sget-object p4, Lw10;->a:Ljava/nio/charset/Charset;

    .line 190
    .line 191
    invoke-virtual {p3, p4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 192
    .line 193
    .line 194
    move-result-object p3

    .line 195
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    array-length p3, p3

    .line 199
    const/high16 p4, 0x20000

    .line 200
    .line 201
    if-le p3, p4, :cond_7

    .line 202
    .line 203
    invoke-static {v2}, Lu52;->h(I)V

    .line 204
    .line 205
    .line 206
    return v1

    .line 207
    :cond_7
    const-string p3, "append"

    .line 208
    .line 209
    const-string p4, "next"

    .line 210
    .line 211
    filled-new-array {p0, p3, p4}, [Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    invoke-static {p0}, Lti;->t0([Ljava/lang/Object;)Ljava/util/Set;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    if-eqz p0, :cond_8

    .line 224
    .line 225
    const p0, 0x7f1302e9

    .line 226
    .line 227
    .line 228
    invoke-static {p0}, Lu52;->h(I)V

    .line 229
    .line 230
    .line 231
    :cond_8
    new-instance p0, Le90;

    .line 232
    .line 233
    const/16 p1, 0x18

    .line 234
    .line 235
    invoke-direct {p0, p1}, Le90;-><init>(I)V

    .line 236
    .line 237
    .line 238
    new-instance p1, Lk52;

    .line 239
    .line 240
    const/4 p3, 0x2

    .line 241
    invoke-direct {p1, p3}, Lk52;-><init>(I)V

    .line 242
    .line 243
    .line 244
    invoke-static {p2, p0, p1}, Lu52;->o(Lorg/json/JSONObject;Lgf1;Lif1;)V

    .line 245
    .line 246
    .line 247
    return v1

    .line 248
    :cond_9
    invoke-static {v2}, Lu52;->h(I)V

    .line 249
    .line 250
    .line 251
    return v1
.end method

.method public static final s(ILjava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Lu52;->c()Lv52;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lv52;->b:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Lorg/json/JSONObject;

    .line 11
    .line 12
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "command"

    .line 16
    .line 17
    const-string v2, "timer"

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "mode"

    .line 24
    .line 25
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const-string v0, "minutes"

    .line 30
    .line 31
    invoke-virtual {p1, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance p1, Lk52;

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    invoke-direct {p1, v0}, Lk52;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0, p1}, Lu52;->p(Lorg/json/JSONObject;Lif1;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method
