.class public abstract Lvt0;
.super Landroid/app/Service;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final v:Ljava/util/HashMap;


# instance fields
.field public final n:Lla0;

.field public final o:Ljava/lang/String;

.field public final p:I

.field public q:Lut0;

.field public r:I

.field public s:Z

.field public t:Z

.field public u:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lvt0;->v:Ljava/util/HashMap;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lla0;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p0, v0, Lla0;->q:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v1, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, v0, Lla0;->p:Ljava/lang/Object;

    .line 21
    .line 22
    iput-object v0, p0, Lvt0;->n:Lla0;

    .line 23
    .line 24
    const-string v0, "download_channel"

    .line 25
    .line 26
    iput-object v0, p0, Lvt0;->o:Ljava/lang/String;

    .line 27
    .line 28
    const v0, 0x7f130134

    .line 29
    .line 30
    .line 31
    iput v0, p0, Lvt0;->p:I

    .line 32
    .line 33
    return-void
.end method

.method public static a(Lvt0;Ljava/util/List;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lvt0;->n:Lla0;

    .line 2
    .line 3
    if-eqz p0, :cond_2

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-ge v0, v1, :cond_2

    .line 11
    .line 12
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lns0;

    .line 17
    .line 18
    iget v1, v1, Lns0;->b:I

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    if-eq v1, v2, :cond_1

    .line 22
    .line 23
    const/4 v2, 0x5

    .line 24
    if-eq v1, v2, :cond_1

    .line 25
    .line 26
    const/4 v2, 0x7

    .line 27
    if-ne v1, v2, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    :goto_1
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, Lla0;->n:Z

    .line 35
    .line 36
    invoke-virtual {p0}, Lla0;->d()V

    .line 37
    .line 38
    .line 39
    :cond_2
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lvt0;->n:Lla0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-boolean v1, v0, Lla0;->n:Z

    .line 7
    .line 8
    iget-object v0, v0, Lla0;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/os/Handler;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lvt0;->q:Lut0;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lut0;->i()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 v1, 0x1c

    .line 31
    .line 32
    if-ge v0, v1, :cond_2

    .line 33
    .line 34
    iget-boolean v0, p0, Lvt0;->t:Z

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x1

    .line 42
    iput-boolean v0, p0, Lvt0;->u:Z

    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    iget-boolean v0, p0, Lvt0;->u:Z

    .line 46
    .line 47
    iget v1, p0, Lvt0;->r:I

    .line 48
    .line 49
    invoke-virtual {p0, v1}, Landroid/app/Service;->stopSelfResult(I)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    or-int/2addr v0, v1

    .line 54
    iput-boolean v0, p0, Lvt0;->u:Z

    .line 55
    .line 56
    return-void
.end method

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p0
.end method

.method public final onCreate()V
    .locals 11

    .line 1
    iget-object v0, p0, Lvt0;->o:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, Lvt0;->p:I

    .line 6
    .line 7
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 8
    .line 9
    const/16 v3, 0x1a

    .line 10
    .line 11
    if-lt v2, v3, :cond_0

    .line 12
    .line 13
    const-string v2, "notification"

    .line 14
    .line 15
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Landroid/app/NotificationManager;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lgm0;->n()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {v0, v1}, Lgm0;->d(Ljava/lang/String;Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v2, v0}, Lgm0;->q(Landroid/app/NotificationManager;Landroid/app/NotificationChannel;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    sget-object v0, Lvt0;->v:Ljava/util/HashMap;

    .line 43
    .line 44
    invoke-virtual {v0, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lut0;

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    const/4 v9, 0x0

    .line 52
    const/4 v10, 0x1

    .line 53
    if-nez v1, :cond_4

    .line 54
    .line 55
    iget-object v1, p0, Lvt0;->n:Lla0;

    .line 56
    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    move v6, v10

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    move v6, v9

    .line 62
    :goto_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 63
    .line 64
    const/16 v3, 0x1f

    .line 65
    .line 66
    if-ge v1, v3, :cond_2

    .line 67
    .line 68
    move v1, v10

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    move v1, v9

    .line 71
    :goto_1
    if-eqz v6, :cond_3

    .line 72
    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    move-object v1, p0

    .line 76
    check-cast v1, Lcom/eddyizm/tempus/service/DownloaderService;

    .line 77
    .line 78
    new-instance v3, Ldh3;

    .line 79
    .line 80
    invoke-direct {v3, v1}, Ldh3;-><init>(Lcom/eddyizm/tempus/service/DownloaderService;)V

    .line 81
    .line 82
    .line 83
    move-object v7, v3

    .line 84
    goto :goto_2

    .line 85
    :cond_3
    move-object v7, v2

    .line 86
    :goto_2
    move-object v1, p0

    .line 87
    check-cast v1, Lcom/eddyizm/tempus/service/DownloaderService;

    .line 88
    .line 89
    const-class v3, Lau0;

    .line 90
    .line 91
    monitor-enter v3

    .line 92
    :try_start_0
    invoke-static {v1}, Lau0;->m(Landroid/content/Context;)V

    .line 93
    .line 94
    .line 95
    sget-object v5, Lau0;->t:Llt0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    .line 97
    monitor-exit v3

    .line 98
    new-instance v3, Lfu0;

    .line 99
    .line 100
    invoke-direct {v3, v1}, Lfu0;-><init>(Lcom/eddyizm/tempus/service/DownloaderService;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v1, v5, Llt0;->e:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 107
    .line 108
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    invoke-virtual {v5, v9}, Llt0;->c(Z)V

    .line 112
    .line 113
    .line 114
    new-instance v3, Lut0;

    .line 115
    .line 116
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    invoke-direct/range {v3 .. v8}, Lut0;-><init>(Landroid/content/Context;Llt0;ZLdh3;Ljava/lang/Class;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v8, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-object v1, v3

    .line 127
    goto :goto_3

    .line 128
    :catchall_0
    move-exception v0

    .line 129
    move-object p0, v0

    .line 130
    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    throw p0

    .line 132
    :cond_4
    :goto_3
    iput-object v1, p0, Lvt0;->q:Lut0;

    .line 133
    .line 134
    iget-object v0, v1, Lut0;->f:Lvt0;

    .line 135
    .line 136
    if-nez v0, :cond_5

    .line 137
    .line 138
    move v9, v10

    .line 139
    :cond_5
    invoke-static {v9}, Lrr2;->w(Z)V

    .line 140
    .line 141
    .line 142
    iput-object p0, v1, Lut0;->f:Lvt0;

    .line 143
    .line 144
    iget-object v0, v1, Lut0;->b:Llt0;

    .line 145
    .line 146
    iget-boolean v0, v0, Llt0;->h:Z

    .line 147
    .line 148
    if-eqz v0, :cond_6

    .line 149
    .line 150
    invoke-static {v2}, Lf35;->q(Lgt0;)Landroid/os/Handler;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    new-instance v2, Lk6;

    .line 155
    .line 156
    const/16 v3, 0x16

    .line 157
    .line 158
    invoke-direct {v2, v3, v1, p0}, Lk6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v2}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    .line 162
    .line 163
    .line 164
    :cond_6
    return-void
.end method

.method public final onDestroy()V
    .locals 3

    .line 1
    iget-object v0, p0, Lvt0;->q:Lut0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lut0;->f:Lvt0;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-ne v1, p0, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v1, v2

    .line 14
    :goto_0
    invoke-static {v1}, Lrr2;->w(Z)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-object v1, v0, Lut0;->f:Lvt0;

    .line 19
    .line 20
    iget-object p0, p0, Lvt0;->n:Lla0;

    .line 21
    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    iput-boolean v2, p0, Lla0;->n:Z

    .line 25
    .line 26
    iget-object p0, p0, Lla0;->p:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Landroid/os/Handler;

    .line 29
    .line 30
    invoke-virtual {p0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 11

    .line 1
    iput p3, p0, Lvt0;->r:I

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    iput-boolean p2, p0, Lvt0;->t:Z

    .line 5
    .line 6
    const-string p3, "androidx.media3.exoplayer.downloadService.action.RESTART"

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    if-eqz p1, :cond_2

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "content_id"

    .line 16
    .line 17
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    iget-boolean v3, p0, Lvt0;->s:Z

    .line 22
    .line 23
    const-string v4, "foreground"

    .line 24
    .line 25
    invoke-virtual {p1, v4, p2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-nez v4, :cond_1

    .line 30
    .line 31
    invoke-virtual {p3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v4, p2

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    :goto_0
    move v4, v0

    .line 41
    :goto_1
    or-int/2addr v3, v4

    .line 42
    iput-boolean v3, p0, Lvt0;->s:Z

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/4 v1, 0x0

    .line 46
    move-object v2, v1

    .line 47
    :goto_2
    const-string v3, "androidx.media3.exoplayer.downloadService.action.INIT"

    .line 48
    .line 49
    if-nez v1, :cond_3

    .line 50
    .line 51
    move-object v1, v3

    .line 52
    :cond_3
    iget-object v4, p0, Lvt0;->q:Lut0;

    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget-object v4, v4, Lut0;->b:Llt0;

    .line 58
    .line 59
    iget-object v5, v4, Llt0;->c:Lit0;

    .line 60
    .line 61
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 62
    .line 63
    .line 64
    move-result v6

    .line 65
    const/16 v7, 0x8

    .line 66
    .line 67
    const/4 v8, 0x7

    .line 68
    const/4 v9, 0x4

    .line 69
    const/4 v10, -0x1

    .line 70
    sparse-switch v6, :sswitch_data_0

    .line 71
    .line 72
    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :sswitch_0
    const-string p3, "androidx.media3.exoplayer.downloadService.action.PAUSE_DOWNLOADS"

    .line 76
    .line 77
    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p3

    .line 81
    if-nez p3, :cond_4

    .line 82
    .line 83
    goto/16 :goto_3

    .line 84
    .line 85
    :cond_4
    move v10, v7

    .line 86
    goto/16 :goto_3

    .line 87
    .line 88
    :sswitch_1
    const-string p3, "androidx.media3.exoplayer.downloadService.action.SET_REQUIREMENTS"

    .line 89
    .line 90
    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p3

    .line 94
    if-nez p3, :cond_5

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_5
    move v10, v8

    .line 98
    goto :goto_3

    .line 99
    :sswitch_2
    const-string p3, "androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD"

    .line 100
    .line 101
    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result p3

    .line 105
    if-nez p3, :cond_6

    .line 106
    .line 107
    goto :goto_3

    .line 108
    :cond_6
    const/4 v10, 0x6

    .line 109
    goto :goto_3

    .line 110
    :sswitch_3
    const-string p3, "androidx.media3.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS"

    .line 111
    .line 112
    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p3

    .line 116
    if-nez p3, :cond_7

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_7
    const/4 v10, 0x5

    .line 120
    goto :goto_3

    .line 121
    :sswitch_4
    const-string p3, "androidx.media3.exoplayer.downloadService.action.RESUME_DOWNLOADS"

    .line 122
    .line 123
    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result p3

    .line 127
    if-nez p3, :cond_8

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_8
    move v10, v9

    .line 131
    goto :goto_3

    .line 132
    :sswitch_5
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p3

    .line 136
    if-nez p3, :cond_9

    .line 137
    .line 138
    goto :goto_3

    .line 139
    :cond_9
    const/4 v10, 0x3

    .line 140
    goto :goto_3

    .line 141
    :sswitch_6
    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result p3

    .line 145
    if-nez p3, :cond_a

    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_a
    const/4 v10, 0x2

    .line 149
    goto :goto_3

    .line 150
    :sswitch_7
    const-string p3, "androidx.media3.exoplayer.downloadService.action.REMOVE_DOWNLOAD"

    .line 151
    .line 152
    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result p3

    .line 156
    if-nez p3, :cond_b

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_b
    move v10, v0

    .line 160
    goto :goto_3

    .line 161
    :sswitch_8
    const-string p3, "androidx.media3.exoplayer.downloadService.action.SET_STOP_REASON"

    .line 162
    .line 163
    invoke-virtual {v1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result p3

    .line 167
    if-nez p3, :cond_c

    .line 168
    .line 169
    goto :goto_3

    .line 170
    :cond_c
    move v10, p2

    .line 171
    :goto_3
    const-string p3, "stop_reason"

    .line 172
    .line 173
    const-string v3, "DownloadService"

    .line 174
    .line 175
    packed-switch v10, :pswitch_data_0

    .line 176
    .line 177
    .line 178
    const-string p1, "Ignored unrecognized action: "

    .line 179
    .line 180
    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-static {v3, p1}, Ll93;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_4

    .line 188
    .line 189
    :pswitch_0
    invoke-virtual {v4, v0}, Llt0;->c(Z)V

    .line 190
    .line 191
    .line 192
    goto/16 :goto_4

    .line 193
    .line 194
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    const-string p3, "requirements"

    .line 198
    .line 199
    invoke-virtual {p1, p3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 200
    .line 201
    .line 202
    move-result-object p1

    .line 203
    check-cast p1, Lh04;

    .line 204
    .line 205
    if-nez p1, :cond_d

    .line 206
    .line 207
    const-string p1, "Ignored SET_REQUIREMENTS: Missing requirements extra"

    .line 208
    .line 209
    invoke-static {v3, p1}, Ll93;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    goto/16 :goto_4

    .line 213
    .line 214
    :cond_d
    invoke-virtual {v4, p1}, Llt0;->d(Lh04;)V

    .line 215
    .line 216
    .line 217
    goto :goto_4

    .line 218
    :pswitch_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    const-string v1, "download_request"

    .line 222
    .line 223
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    check-cast v1, Ltt0;

    .line 228
    .line 229
    if-nez v1, :cond_e

    .line 230
    .line 231
    const-string p1, "Ignored ADD_DOWNLOAD: Missing download_request extra"

    .line 232
    .line 233
    invoke-static {v3, p1}, Ll93;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    goto :goto_4

    .line 237
    :cond_e
    invoke-virtual {p1, p3, p2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 238
    .line 239
    .line 240
    move-result p1

    .line 241
    iget p3, v4, Llt0;->f:I

    .line 242
    .line 243
    add-int/2addr p3, v0

    .line 244
    iput p3, v4, Llt0;->f:I

    .line 245
    .line 246
    invoke-virtual {v5, v8, p1, p2, v1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 251
    .line 252
    .line 253
    goto :goto_4

    .line 254
    :pswitch_3
    iget p1, v4, Llt0;->f:I

    .line 255
    .line 256
    add-int/2addr p1, v0

    .line 257
    iput p1, v4, Llt0;->f:I

    .line 258
    .line 259
    const/16 p1, 0x9

    .line 260
    .line 261
    invoke-virtual {v5, p1}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 266
    .line 267
    .line 268
    goto :goto_4

    .line 269
    :pswitch_4
    invoke-virtual {v4, p2}, Llt0;->c(Z)V

    .line 270
    .line 271
    .line 272
    goto :goto_4

    .line 273
    :pswitch_5
    if-nez v2, :cond_f

    .line 274
    .line 275
    const-string p1, "Ignored REMOVE_DOWNLOAD: Missing content_id extra"

    .line 276
    .line 277
    invoke-static {v3, p1}, Ll93;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 278
    .line 279
    .line 280
    goto :goto_4

    .line 281
    :cond_f
    iget p1, v4, Llt0;->f:I

    .line 282
    .line 283
    add-int/2addr p1, v0

    .line 284
    iput p1, v4, Llt0;->f:I

    .line 285
    .line 286
    invoke-virtual {v5, v7, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 291
    .line 292
    .line 293
    goto :goto_4

    .line 294
    :pswitch_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    invoke-virtual {p1, p3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    if-nez v1, :cond_10

    .line 302
    .line 303
    const-string p1, "Ignored SET_STOP_REASON: Missing stop_reason extra"

    .line 304
    .line 305
    invoke-static {v3, p1}, Ll93;->F(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    goto :goto_4

    .line 309
    :cond_10
    invoke-virtual {p1, p3, p2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 310
    .line 311
    .line 312
    move-result p1

    .line 313
    iget p3, v4, Llt0;->f:I

    .line 314
    .line 315
    add-int/2addr p3, v0

    .line 316
    iput p3, v4, Llt0;->f:I

    .line 317
    .line 318
    invoke-virtual {v5, v9, p1, p2, v2}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 323
    .line 324
    .line 325
    :goto_4
    :pswitch_7
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 326
    .line 327
    const/16 p3, 0x1a

    .line 328
    .line 329
    if-lt p1, p3, :cond_11

    .line 330
    .line 331
    iget-boolean p1, p0, Lvt0;->s:Z

    .line 332
    .line 333
    if-eqz p1, :cond_11

    .line 334
    .line 335
    iget-object p1, p0, Lvt0;->n:Lla0;

    .line 336
    .line 337
    if-eqz p1, :cond_11

    .line 338
    .line 339
    iget-boolean p3, p1, Lla0;->o:Z

    .line 340
    .line 341
    if-nez p3, :cond_11

    .line 342
    .line 343
    invoke-virtual {p1}, Lla0;->d()V

    .line 344
    .line 345
    .line 346
    :cond_11
    iput-boolean p2, p0, Lvt0;->u:Z

    .line 347
    .line 348
    iget p1, v4, Llt0;->g:I

    .line 349
    .line 350
    if-nez p1, :cond_12

    .line 351
    .line 352
    iget p1, v4, Llt0;->f:I

    .line 353
    .line 354
    if-nez p1, :cond_12

    .line 355
    .line 356
    invoke-virtual {p0}, Lvt0;->b()V

    .line 357
    .line 358
    .line 359
    :cond_12
    return v0

    .line 360
    nop

    .line 361
    :sswitch_data_0
    .sparse-switch
        -0x7b47cdc8 -> :sswitch_8
        -0x47112489 -> :sswitch_7
        -0x274df87d -> :sswitch_6
        -0xe367804 -> :sswitch_5
        0x1f2a425 -> :sswitch_4
        0x1bab7dfe -> :sswitch_3
        0x3175ed72 -> :sswitch_2
        0x3267e259 -> :sswitch_1
        0x6815b736 -> :sswitch_0
    .end sparse-switch

    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_7
        :pswitch_7
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onTaskRemoved(Landroid/content/Intent;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lvt0;->t:Z

    .line 3
    .line 4
    return-void
.end method

.method public final onTimeout(II)V
    .locals 0

    .line 1
    const-string p1, "DownloadService"

    .line 2
    .line 3
    const-string p2, "onTimeout() called by system. Calling stopSelf() to terminate gracefully."

    .line 4
    .line 5
    invoke-static {p1, p2}, Ll93;->q0(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
