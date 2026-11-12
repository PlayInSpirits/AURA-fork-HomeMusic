.class public abstract Landroidx/media3/session/MediaLibraryService;
.super Landroid/app/Service;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final synthetic t:I


# instance fields
.field public final n:Ljava/lang/Object;

.field public final o:Landroid/os/Handler;

.field public p:Lqs2;

.field public q:Llo2;

.field public r:Lx7;

.field public final s:Loi;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/media3/session/MediaLibraryService;->n:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Landroid/os/Handler;

    .line 12
    .line 13
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Landroidx/media3/session/MediaLibraryService;->o:Landroid/os/Handler;

    .line 21
    .line 22
    new-instance v0, Loi;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, v1}, Lyd4;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Landroidx/media3/session/MediaLibraryService;->s:Loi;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final c(Lkn2;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lkn2;->a:Ltn2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ltn2;->l()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    xor-int/2addr v0, v1

    .line 9
    const-string v2, "session is already released"

    .line 10
    .line 11
    invoke-static {v2, v0}, Lrr2;->k(Ljava/lang/String;Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Landroidx/media3/session/MediaLibraryService;->n:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v0

    .line 17
    :try_start_0
    iget-object v2, p0, Landroidx/media3/session/MediaLibraryService;->s:Loi;

    .line 18
    .line 19
    iget-object v3, p1, Lkn2;->a:Ltn2;

    .line 20
    .line 21
    iget-object v3, v3, Ltn2;->i:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Lyd4;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lkn2;

    .line 28
    .line 29
    const/4 v3, 0x0

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    if-ne v2, p1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v1, v3

    .line 36
    :cond_1
    :goto_0
    const-string v4, "Session ID should be unique"

    .line 37
    .line 38
    invoke-static {v4, v1}, Lrr2;->k(Ljava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Landroidx/media3/session/MediaLibraryService;->s:Loi;

    .line 42
    .line 43
    iget-object v4, p1, Lkn2;->a:Ltn2;

    .line 44
    .line 45
    iget-object v4, v4, Ltn2;->i:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v1, v4, p1}, Lyd4;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    if-nez v2, :cond_2

    .line 52
    .line 53
    iget-object v0, p0, Landroidx/media3/session/MediaLibraryService;->o:Landroid/os/Handler;

    .line 54
    .line 55
    new-instance v1, Lps2;

    .line 56
    .line 57
    invoke-direct {v1, p0, p1, v3}, Lps2;-><init>(Landroidx/media3/session/MediaLibraryService;Lkn2;I)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    return-void

    .line 64
    :catchall_0
    move-exception p0

    .line 65
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    throw p0
.end method

.method public final d()Llo2;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/session/MediaLibraryService;->q:Llo2;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "Accessing service context before onCreate()"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lrr2;->s(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance v0, Lbk;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {v0, v1}, Lbk;-><init>(Landroid/content/Context;)V

    .line 21
    .line 22
    .line 23
    iget-boolean v1, v0, Lbk;->p:Z

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    xor-int/2addr v1, v2

    .line 27
    invoke-static {v1}, Lrr2;->w(Z)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Lyl0;

    .line 31
    .line 32
    invoke-direct {v1, v0}, Lyl0;-><init>(Lbk;)V

    .line 33
    .line 34
    .line 35
    iput-boolean v2, v0, Lbk;->p:Z

    .line 36
    .line 37
    new-instance v0, Llo2;

    .line 38
    .line 39
    iget-object v2, p0, Landroidx/media3/session/MediaLibraryService;->r:Lx7;

    .line 40
    .line 41
    if-nez v2, :cond_0

    .line 42
    .line 43
    new-instance v2, Lx7;

    .line 44
    .line 45
    invoke-direct {v2, p0}, Lx7;-><init>(Landroidx/media3/session/MediaLibraryService;)V

    .line 46
    .line 47
    .line 48
    iput-object v2, p0, Landroidx/media3/session/MediaLibraryService;->r:Lx7;

    .line 49
    .line 50
    :cond_0
    iget-object v2, p0, Landroidx/media3/session/MediaLibraryService;->r:Lx7;

    .line 51
    .line 52
    invoke-direct {v0, p0, v1, v2}, Llo2;-><init>(Landroidx/media3/session/MediaLibraryService;Lyl0;Lx7;)V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, Landroidx/media3/session/MediaLibraryService;->q:Llo2;

    .line 56
    .line 57
    :cond_1
    iget-object p0, p0, Landroidx/media3/session/MediaLibraryService;->q:Llo2;

    .line 58
    .line 59
    return-object p0
.end method

.method public final e()Ljava/util/ArrayList;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/media3/session/MediaLibraryService;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    iget-object p0, p0, Landroidx/media3/session/MediaLibraryService;->s:Loi;

    .line 7
    .line 8
    invoke-virtual {p0}, Loi;->values()Ljava/util/Collection;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    monitor-exit v0

    .line 16
    return-object v1

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    throw p0
.end method

.method public final f(Lkn2;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/media3/session/MediaLibraryService;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object p0, p0, Landroidx/media3/session/MediaLibraryService;->s:Loi;

    .line 5
    .line 6
    iget-object p1, p1, Lkn2;->a:Ltn2;

    .line 7
    .line 8
    iget-object p1, p1, Ltn2;->i:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lyd4;->containsKey(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    monitor-exit v0

    .line 15
    return p0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    throw p0
.end method

.method public final g(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 7

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-nez p1, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const-string v0, "androidx.media3.session.MediaSessionService"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_5

    .line 18
    .line 19
    const-string v0, "android.media.browse.MediaBrowserService"

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    new-instance v1, Lms2;

    .line 29
    .line 30
    const-string p1, "android.media.session.MediaController"

    .line 31
    .line 32
    const/4 v0, -0x1

    .line 33
    invoke-direct {v1, p1, v0, v0}, Lms2;-><init>(Ljava/lang/String;II)V

    .line 34
    .line 35
    .line 36
    new-instance v0, Lfr2;

    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    sget-object v6, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    const/4 v3, 0x0

    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-direct/range {v0 .. v6}, Lfr2;-><init>(Lms2;IIZLer2;Landroid/os/Bundle;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0}, Landroidx/media3/session/MediaLibraryService;->i(Lfr2;)Lkn2;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    if-nez p1, :cond_3

    .line 52
    .line 53
    :goto_0
    const/4 p0, 0x0

    .line 54
    return-object p0

    .line 55
    :cond_3
    invoke-virtual {p0, p1}, Landroidx/media3/session/MediaLibraryService;->c(Lkn2;)V

    .line 56
    .line 57
    .line 58
    iget-object p0, p1, Lkn2;->a:Ltn2;

    .line 59
    .line 60
    iget-object p1, p0, Ltn2;->a:Ljava/lang/Object;

    .line 61
    .line 62
    monitor-enter p1

    .line 63
    :try_start_0
    iget-object v0, p0, Ltn2;->w:Lpn2;

    .line 64
    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    iget-object v0, p0, Ltn2;->h:Lls2;

    .line 68
    .line 69
    iget-object v0, v0, Lls2;->m:Lqr2;

    .line 70
    .line 71
    iget-object v0, v0, Lqr2;->o:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Lkr2;

    .line 74
    .line 75
    iget-object v0, v0, Lkr2;->c:Lpr2;

    .line 76
    .line 77
    new-instance v1, Lpn2;

    .line 78
    .line 79
    invoke-direct {v1, p0}, Lpn2;-><init>(Ltn2;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, v0}, Lpn2;->c(Lpr2;)V

    .line 83
    .line 84
    .line 85
    iput-object v1, p0, Ltn2;->w:Lpn2;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    move-object p0, v0

    .line 90
    goto :goto_2

    .line 91
    :cond_4
    :goto_1
    iget-object p0, p0, Ltn2;->w:Lpn2;

    .line 92
    .line 93
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    new-instance p1, Landroid/content/Intent;

    .line 95
    .line 96
    const-string v0, "android.media.browse.MediaBrowserService"

    .line 97
    .line 98
    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, p1}, Lpn2;->onBind(Landroid/content/Intent;)Landroid/os/IBinder;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    return-object p0

    .line 106
    :goto_2
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    throw p0

    .line 108
    :cond_5
    iget-object p0, p0, Landroidx/media3/session/MediaLibraryService;->p:Lqs2;

    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    return-object p0
.end method

.method public abstract h(Lfr2;)Lkn2;
.end method

.method public bridge i(Lfr2;)Lkn2;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/session/MediaLibraryService;->h(Lfr2;)Lkn2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final j(Lkn2;Z)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroidx/media3/session/MediaLibraryService;->d()Llo2;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    iget-object p0, v1, Llo2;->n:Landroidx/media3/session/MediaLibraryService;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroidx/media3/session/MediaLibraryService;->f(Lkn2;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/4 v0, 0x1

    .line 12
    if-eqz p0, :cond_2

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Llo2;->d(Lkn2;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    iget p0, v1, Llo2;->v:I

    .line 22
    .line 23
    add-int/2addr p0, v0

    .line 24
    iput p0, v1, Llo2;->v:I

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Llo2;->b(Lkn2;)Lsk2;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lsk2;->c1()V

    .line 34
    .line 35
    .line 36
    iget-object v0, v0, Lsk2;->d:Lrk2;

    .line 37
    .line 38
    invoke-interface {v0}, Lrk2;->Y()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    invoke-interface {v0}, Lrk2;->Q0()Lyw1;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :goto_0
    move-object v3, v0

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    sget-object v0, Lyw1;->o:Lvw1;

    .line 51
    .line 52
    sget-object v0, Lgy3;->r:Lgy3;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :goto_1
    new-instance v4, Lvl2;

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    invoke-direct {v4, v1, p0, p1, v0}, Lvl2;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 59
    .line 60
    .line 61
    new-instance p0, Landroid/os/Handler;

    .line 62
    .line 63
    invoke-virtual {p1}, Lkn2;->a()Lqi3;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-interface {v0}, Lqi3;->U0()Landroid/os/Looper;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 72
    .line 73
    .line 74
    new-instance v0, Lio2;

    .line 75
    .line 76
    const/4 v6, 0x0

    .line 77
    move-object v2, p1

    .line 78
    move v5, p2

    .line 79
    invoke-direct/range {v0 .. v6}, Lio2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 80
    .line 81
    .line 82
    invoke-static {p0, v0}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :cond_2
    :goto_2
    iget-object p0, v1, Llo2;->n:Landroidx/media3/session/MediaLibraryService;

    .line 87
    .line 88
    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(I)V

    .line 89
    .line 90
    .line 91
    const/4 p0, 0x0

    .line 92
    iput-boolean p0, v1, Llo2;->x:Z

    .line 93
    .line 94
    iget-object p0, v1, Llo2;->w:Lrm2;

    .line 95
    .line 96
    if-eqz p0, :cond_3

    .line 97
    .line 98
    iget-object p0, v1, Llo2;->p:Lx63;

    .line 99
    .line 100
    const/16 p1, 0x3e9

    .line 101
    .line 102
    iget-object p0, p0, Lx63;->b:Landroid/app/NotificationManager;

    .line 103
    .line 104
    const/4 p2, 0x0

    .line 105
    invoke-virtual {p0, p2, p1}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    .line 106
    .line 107
    .line 108
    iget p0, v1, Llo2;->v:I

    .line 109
    .line 110
    add-int/2addr p0, v0

    .line 111
    iput p0, v1, Llo2;->v:I

    .line 112
    .line 113
    iput-object p2, v1, Llo2;->w:Lrm2;

    .line 114
    .line 115
    :cond_3
    return-void
.end method

.method public final k(Lkn2;Z)Z
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroidx/media3/session/MediaLibraryService;->d()Llo2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p2}, Llo2;->c(Z)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p0, p1, p2}, Landroidx/media3/session/MediaLibraryService;->j(Lkn2;Z)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :catch_0
    move-exception p1

    .line 15
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 v0, 0x1f

    .line 18
    .line 19
    if-lt p2, v0, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, Lgo2;->y(Ljava/lang/IllegalStateException;)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_0

    .line 26
    .line 27
    const-string p2, "MSessionService"

    .line 28
    .line 29
    const-string v0, "Failed to start foreground"

    .line 30
    .line 31
    invoke-static {p2, v0, p1}, Ll93;->G(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    new-instance p1, Lqa1;

    .line 35
    .line 36
    const/16 p2, 0x15

    .line 37
    .line 38
    invoke-direct {p1, p2, p0}, Lqa1;-><init>(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, Landroidx/media3/session/MediaLibraryService;->o:Landroid/os/Handler;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    return p0

    .line 48
    :cond_0
    throw p1
.end method

.method public final l(Lkn2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/media3/session/MediaLibraryService;->n:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Landroidx/media3/session/MediaLibraryService;->s:Loi;

    .line 5
    .line 6
    iget-object v2, p1, Lkn2;->a:Ltn2;

    .line 7
    .line 8
    iget-object v2, v2, Ltn2;->i:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Lyd4;->containsKey(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const-string v2, "session not found"

    .line 15
    .line 16
    invoke-static {v2, v1}, Lrr2;->k(Ljava/lang/String;Z)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Landroidx/media3/session/MediaLibraryService;->s:Loi;

    .line 20
    .line 21
    iget-object v2, p1, Lkn2;->a:Ltn2;

    .line 22
    .line 23
    iget-object v2, v2, Ltn2;->i:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lyd4;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    iget-object v0, p0, Landroidx/media3/session/MediaLibraryService;->o:Landroid/os/Handler;

    .line 30
    .line 31
    new-instance v1, Lps2;

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-direct {v1, p0, p1, v2}, Lps2;-><init>(Landroidx/media3/session/MediaLibraryService;Lkn2;I)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 43
    throw p0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    const-string v0, "androidx.media3.session.MediaLibraryService"

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, Landroidx/media3/session/MediaLibraryService;->p:Lqs2;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-virtual {p0, p1}, Landroidx/media3/session/MediaLibraryService;->g(Landroid/content/Intent;)Landroid/os/IBinder;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lqs2;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lqs2;-><init>(Landroidx/media3/session/MediaLibraryService;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/media3/session/MediaLibraryService;->p:Lqs2;

    .line 10
    .line 11
    return-void
.end method

.method public onDestroy()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media3/session/MediaLibraryService;->q:Llo2;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Llo2;->a()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Landroidx/media3/session/MediaLibraryService;->p:Lqs2;

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    iget-object v1, v0, Lqs2;->e:Ljava/lang/ref/WeakReference;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->clear()V

    .line 18
    .line 19
    .line 20
    iget-object v1, v0, Lqs2;->f:Landroid/os/Handler;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, v0, Lqs2;->g:Ljava/util/Set;

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    check-cast v3, Lju1;

    .line 43
    .line 44
    invoke-static {v3}, Lau0;->k(Lju1;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 49
    .line 50
    .line 51
    iput-object v2, p0, Landroidx/media3/session/MediaLibraryService;->p:Lqs2;

    .line 52
    .line 53
    :cond_2
    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_7

    .line 9
    .line 10
    :cond_0
    iget-object v3, v0, Landroidx/media3/session/MediaLibraryService;->r:Lx7;

    .line 11
    .line 12
    if-nez v3, :cond_1

    .line 13
    .line 14
    new-instance v3, Lx7;

    .line 15
    .line 16
    invoke-direct {v3, v0}, Lx7;-><init>(Landroidx/media3/session/MediaLibraryService;)V

    .line 17
    .line 18
    .line 19
    iput-object v3, v0, Landroidx/media3/session/MediaLibraryService;->r:Lx7;

    .line 20
    .line 21
    :cond_1
    iget-object v3, v0, Landroidx/media3/session/MediaLibraryService;->r:Lx7;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    const/4 v5, 0x0

    .line 28
    if-eqz v4, :cond_4

    .line 29
    .line 30
    sget-object v6, Lkn2;->b:Ljava/lang/Object;

    .line 31
    .line 32
    monitor-enter v6

    .line 33
    :try_start_0
    sget-object v7, Lkn2;->c:Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {v7}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    invoke-interface {v7}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v7

    .line 43
    :cond_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    if-eqz v8, :cond_3

    .line 48
    .line 49
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    check-cast v8, Lkn2;

    .line 54
    .line 55
    iget-object v9, v8, Lkn2;->a:Ltn2;

    .line 56
    .line 57
    iget-object v9, v9, Ltn2;->b:Landroid/net/Uri;

    .line 58
    .line 59
    invoke-static {v9, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    if-eqz v9, :cond_2

    .line 64
    .line 65
    monitor-exit v6

    .line 66
    goto :goto_0

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    goto :goto_1

    .line 69
    :cond_3
    monitor-exit v6

    .line 70
    move-object v8, v5

    .line 71
    :goto_0
    move-object v9, v8

    .line 72
    goto :goto_2

    .line 73
    :goto_1
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    throw v0

    .line 75
    :cond_4
    move-object v9, v5

    .line 76
    :goto_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    const-string v3, "android.intent.action.MEDIA_BUTTON"

    .line 80
    .line 81
    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_7

    .line 90
    .line 91
    if-nez v9, :cond_6

    .line 92
    .line 93
    new-instance v11, Lms2;

    .line 94
    .line 95
    const-string v3, "android.media.session.MediaController"

    .line 96
    .line 97
    const/4 v4, -0x1

    .line 98
    invoke-direct {v11, v3, v4, v4}, Lms2;-><init>(Ljava/lang/String;II)V

    .line 99
    .line 100
    .line 101
    new-instance v10, Lfr2;

    .line 102
    .line 103
    const/4 v15, 0x0

    .line 104
    sget-object v16, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 105
    .line 106
    const/4 v12, 0x0

    .line 107
    const/4 v13, 0x0

    .line 108
    const/4 v14, 0x0

    .line 109
    invoke-direct/range {v10 .. v16}, Lfr2;-><init>(Lms2;IIZLer2;Landroid/os/Bundle;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v10}, Landroidx/media3/session/MediaLibraryService;->i(Lfr2;)Lkn2;

    .line 113
    .line 114
    .line 115
    move-result-object v9

    .line 116
    if-nez v9, :cond_5

    .line 117
    .line 118
    goto/16 :goto_7

    .line 119
    .line 120
    :cond_5
    invoke-virtual {v0, v9}, Landroidx/media3/session/MediaLibraryService;->c(Lkn2;)V

    .line 121
    .line 122
    .line 123
    :cond_6
    iget-object v0, v9, Lkn2;->a:Ltn2;

    .line 124
    .line 125
    iget-object v3, v0, Ltn2;->l:Landroid/os/Handler;

    .line 126
    .line 127
    new-instance v4, Lur2;

    .line 128
    .line 129
    const/4 v5, 0x2

    .line 130
    invoke-direct {v4, v5, v0, v1}, Lur2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 134
    .line 135
    .line 136
    return v2

    .line 137
    :cond_7
    if-eqz v9, :cond_e

    .line 138
    .line 139
    const-string v3, "androidx.media3.session.CUSTOM_NOTIFICATION_ACTION"

    .line 140
    .line 141
    invoke-virtual {v1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v3

    .line 149
    if-eqz v3, :cond_e

    .line 150
    .line 151
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 152
    .line 153
    .line 154
    move-result-object v3

    .line 155
    if-eqz v3, :cond_8

    .line 156
    .line 157
    const-string v4, "androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION"

    .line 158
    .line 159
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    goto :goto_3

    .line 164
    :cond_8
    move-object v3, v5

    .line 165
    :goto_3
    instance-of v4, v3, Ljava/lang/String;

    .line 166
    .line 167
    if-eqz v4, :cond_9

    .line 168
    .line 169
    check-cast v3, Ljava/lang/String;

    .line 170
    .line 171
    move-object v10, v3

    .line 172
    goto :goto_4

    .line 173
    :cond_9
    move-object v10, v5

    .line 174
    :goto_4
    if-nez v10, :cond_a

    .line 175
    .line 176
    goto :goto_7

    .line 177
    :cond_a
    invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    if-eqz v1, :cond_b

    .line 182
    .line 183
    const-string v3, "androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS"

    .line 184
    .line 185
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    :cond_b
    instance-of v1, v5, Landroid/os/Bundle;

    .line 190
    .line 191
    if-eqz v1, :cond_c

    .line 192
    .line 193
    check-cast v5, Landroid/os/Bundle;

    .line 194
    .line 195
    :goto_5
    move-object v11, v5

    .line 196
    goto :goto_6

    .line 197
    :cond_c
    sget-object v5, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :goto_6
    invoke-virtual {v0}, Landroidx/media3/session/MediaLibraryService;->d()Llo2;

    .line 201
    .line 202
    .line 203
    move-result-object v8

    .line 204
    invoke-virtual {v8, v9}, Llo2;->b(Lkn2;)Lsk2;

    .line 205
    .line 206
    .line 207
    move-result-object v12

    .line 208
    if-nez v12, :cond_d

    .line 209
    .line 210
    goto :goto_7

    .line 211
    :cond_d
    new-instance v0, Landroid/os/Handler;

    .line 212
    .line 213
    invoke-virtual {v9}, Lkn2;->a()Lqi3;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    invoke-interface {v1}, Lqi3;->U0()Landroid/os/Looper;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 222
    .line 223
    .line 224
    new-instance v7, Lt6;

    .line 225
    .line 226
    invoke-direct/range {v7 .. v12}, Lt6;-><init>(Llo2;Lkn2;Ljava/lang/String;Landroid/os/Bundle;Lsk2;)V

    .line 227
    .line 228
    .line 229
    invoke-static {v0, v7}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 230
    .line 231
    .line 232
    :cond_e
    :goto_7
    return v2
.end method

.method public onTaskRemoved(Landroid/content/Intent;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/media3/session/MediaLibraryService;->d()Llo2;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-boolean p1, p1, Llo2;->x:Z

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/media3/session/MediaLibraryService;->e()Ljava/util/ArrayList;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    move v1, v0

    .line 15
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-ge v1, v2, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Lkn2;

    .line 26
    .line 27
    invoke-virtual {v2}, Lkn2;->a()Lqi3;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-interface {v2}, Lqi3;->h0()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-virtual {p0}, Landroidx/media3/session/MediaLibraryService;->d()Llo2;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Llo2;->a()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Landroidx/media3/session/MediaLibraryService;->e()Ljava/util/ArrayList;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    move v1, v0

    .line 53
    :goto_1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-ge v1, v2, :cond_2

    .line 58
    .line 59
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Lkn2;

    .line 64
    .line 65
    invoke-virtual {v2}, Lkn2;->a()Lqi3;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-interface {v2, v0}, Lqi3;->V(Z)V

    .line 70
    .line 71
    .line 72
    add-int/lit8 v1, v1, 0x1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    .line 76
    .line 77
    .line 78
    return-void
.end method
