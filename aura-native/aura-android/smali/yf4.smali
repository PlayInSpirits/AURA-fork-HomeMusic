.class public final Lyf4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static j:Lyf4;


# instance fields
.field public final a:Landroid/os/Handler;

.field public b:Ljq3;

.field public volatile c:Z

.field public d:Lua4;

.field public e:J

.field public f:Z

.field public g:Z

.field public h:Lvj3;

.field public i:Lzh0;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lyf4;->a:Landroid/os/Handler;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lyf4;->c:Z

    .line 17
    .line 18
    const-wide/16 v1, 0x0

    .line 19
    .line 20
    iput-wide v1, p0, Lyf4;->e:J

    .line 21
    .line 22
    iput-boolean v0, p0, Lyf4;->f:Z

    .line 23
    .line 24
    iput-boolean v0, p0, Lyf4;->g:Z

    .line 25
    .line 26
    :try_start_0
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 34
    .line 35
    .line 36
    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    goto :goto_0

    .line 38
    :catch_0
    const/4 v3, 0x0

    .line 39
    :goto_0
    if-nez v3, :cond_0

    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    const-string v4, "sleep_timer_end_of_track"

    .line 43
    .line 44
    invoke-interface {v3, v4, v0}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    const-string v4, "sleep_timer_end_time_ms"

    .line 49
    .line 50
    invoke-interface {v3, v4, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 51
    .line 52
    .line 53
    move-result-wide v1

    .line 54
    const/4 v3, 0x1

    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    iput-boolean v3, p0, Lyf4;->g:Z

    .line 58
    .line 59
    iput-boolean v3, p0, Lyf4;->f:Z

    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 63
    .line 64
    .line 65
    move-result-wide v4

    .line 66
    cmp-long v0, v1, v4

    .line 67
    .line 68
    if-lez v0, :cond_2

    .line 69
    .line 70
    iput-wide v1, p0, Lyf4;->e:J

    .line 71
    .line 72
    iput-boolean v3, p0, Lyf4;->f:Z

    .line 73
    .line 74
    new-instance v0, Ljq3;

    .line 75
    .line 76
    const/16 v1, 0x8

    .line 77
    .line 78
    invoke-direct {v0, v1, p0}, Ljq3;-><init>(ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, Lyf4;->b:Ljq3;

    .line 82
    .line 83
    iget-object p0, p0, Lyf4;->a:Landroid/os/Handler;

    .line 84
    .line 85
    const-wide/16 v1, 0x3e8

    .line 86
    .line 87
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_2
    invoke-static {}, Lyf4;->b()V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public static b()V
    .locals 2

    .line 1
    :try_start_0
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 9
    .line 10
    .line 11
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    goto :goto_0

    .line 13
    :catch_0
    const/4 v0, 0x0

    .line 14
    :goto_0
    if-nez v0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "sleep_timer_end_time_ms"

    .line 22
    .line 23
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "sleep_timer_end_of_track"

    .line 28
    .line 29
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static c()Lyf4;
    .locals 1

    .line 1
    sget-object v0, Lyf4;->j:Lyf4;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lyf4;

    .line 6
    .line 7
    invoke-direct {v0}, Lyf4;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lyf4;->j:Lyf4;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lyf4;->j:Lyf4;

    .line 13
    .line 14
    return-object v0
.end method


# virtual methods
.method public final a(Z)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lyf4;->f:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lyf4;->g:Z

    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    iput-wide v0, p0, Lyf4;->e:J

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    iput-boolean v0, p0, Lyf4;->c:Z

    .line 12
    .line 13
    iget-object v0, p0, Lyf4;->b:Ljq3;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lyf4;->a:Landroid/os/Handler;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-object v0, p0, Lyf4;->b:Ljq3;

    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Lyf4;->f()V

    .line 26
    .line 27
    .line 28
    invoke-static {}, Lyf4;->b()V

    .line 29
    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    iget-object p0, p0, Lyf4;->h:Lvj3;

    .line 34
    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    iget-object p0, p0, Lvj3;->a:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->x0()V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 6

    .line 1
    iget-boolean v0, p0, Lyf4;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    iget-boolean v1, p0, Lyf4;->g:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-wide v0, p0, Lyf4;->e:J

    .line 18
    .line 19
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 20
    .line 21
    .line 22
    move-result-wide v4

    .line 23
    sub-long/2addr v0, v4

    .line 24
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 25
    .line 26
    .line 27
    move-result-wide v2

    .line 28
    :cond_2
    :goto_0
    const-wide/32 v0, 0xea60

    .line 29
    .line 30
    .line 31
    div-long v4, v2, v0

    .line 32
    .line 33
    rem-long/2addr v2, v0

    .line 34
    const-wide/16 v0, 0x3e8

    .line 35
    .line 36
    div-long/2addr v2, v0

    .line 37
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    filled-new-array {p0, v0}, [Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string v0, "%d:%02d"

    .line 50
    .line 51
    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :cond_3
    :goto_1
    const-string p0, ""

    .line 57
    .line 58
    return-object p0
.end method

.method public final e()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lyf4;->a(Z)V

    .line 3
    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iput-boolean v1, p0, Lyf4;->g:Z

    .line 7
    .line 8
    iput-boolean v1, p0, Lyf4;->f:Z

    .line 9
    .line 10
    const-wide/16 v1, 0x0

    .line 11
    .line 12
    iput-wide v1, p0, Lyf4;->e:J

    .line 13
    .line 14
    :try_start_0
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    goto :goto_0

    .line 26
    :catch_0
    const/4 v1, 0x0

    .line 27
    :goto_0
    if-nez v1, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    const-string v2, "sleep_timer_end_time_ms"

    .line 35
    .line 36
    iget-wide v3, p0, Lyf4;->e:J

    .line 37
    .line 38
    invoke-interface {v1, v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    const-string v2, "sleep_timer_end_of_track"

    .line 43
    .line 44
    iget-boolean v3, p0, Lyf4;->g:Z

    .line 45
    .line 46
    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 51
    .line 52
    .line 53
    :goto_1
    iget-object v1, p0, Lyf4;->h:Lvj3;

    .line 54
    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    iget-object v1, v1, Lvj3;->a:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 58
    .line 59
    invoke-virtual {v1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->x0()V

    .line 60
    .line 61
    .line 62
    :cond_1
    iget-object p0, p0, Lyf4;->i:Lzh0;

    .line 63
    .line 64
    if-eqz p0, :cond_2

    .line 65
    .line 66
    invoke-static {}, Lyf4;->c()Lyf4;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object p0, p0, Lzh0;->o:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast p0, Lcom/eddyizm/tempus/service/MediaService;

    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/eddyizm/tempus/service/MediaService;->p()Lkn2;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-virtual {p0}, Lkn2;->a()Lqi3;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {v1}, Lyf4;->f()V

    .line 83
    .line 84
    .line 85
    iput-boolean v0, v1, Lyf4;->c:Z

    .line 86
    .line 87
    new-instance v0, Lua4;

    .line 88
    .line 89
    invoke-direct {v0, v1, p0}, Lua4;-><init>(Lyf4;Lqi3;)V

    .line 90
    .line 91
    .line 92
    iput-object v0, v1, Lyf4;->d:Lua4;

    .line 93
    .line 94
    iget-object p0, v1, Lyf4;->a:Landroid/os/Handler;

    .line 95
    .line 96
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 97
    .line 98
    .line 99
    :cond_2
    return-void
.end method

.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lyf4;->d:Lua4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lyf4;->a:Landroid/os/Handler;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lyf4;->d:Lua4;

    .line 12
    .line 13
    :cond_0
    return-void
.end method
