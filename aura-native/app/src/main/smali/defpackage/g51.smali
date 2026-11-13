.class public abstract Ldefpackage/g51;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final b:Ljava/lang/Object;

.field public static final c:Ljava/util/concurrent/ExecutorService;

.field public static final d:Ldefpackage/k03;

.field public static volatile e:Ljava/lang/String;

.field public static volatile f:Z

.field public static volatile g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/g51;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    new-instance v0, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ldefpackage/g51;->b:Ljava/lang/Object;

    .line 14
    .line 15
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Ldefpackage/g51;->c:Ljava/util/concurrent/ExecutorService;

    .line 20
    .line 21
    new-instance v0, Ldefpackage/k03;

    .line 22
    .line 23
    invoke-direct {v0}, Ldefpackage/ad2;-><init>()V

    .line 24
    .line 25
    .line 26
    sput-object v0, Ldefpackage/g51;->d:Ldefpackage/k03;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    sput-boolean v0, Ldefpackage/g51;->f:Z

    .line 30
    .line 31
    sput-boolean v0, Ldefpackage/g51;->g:Z

    .line 32
    .line 33
    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, " - "

    .line 10
    .line 11
    invoke-static {p0, v0, p1}, Ldefpackage/b11;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :cond_0
    if-eqz p2, :cond_1

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    new-instance p0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p1, " ("

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p1, ")"

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :cond_1
    invoke-static {p1}, Ldefpackage/g51;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method public static b(Lcom/eddyizm/tempus/subsonic/models/Child;)V
    .locals 3

    .line 1
    invoke-static {}, Ldefpackage/g51;->c()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ldefpackage/g51;->e:Ljava/lang/String;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {v0, v1, p0}, Ldefpackage/g51;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object v0, Ldefpackage/g51;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ldefpackage/af4;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1}, Ldefpackage/af4;->b()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    invoke-virtual {v1}, Ldefpackage/af4;->a()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 v1, 0x0

    .line 47
    :goto_0
    if-eqz v1, :cond_2

    .line 48
    .line 49
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    invoke-static {p0}, Ldefpackage/j51;->K(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_1
    return-void
.end method

.method public static c()V
    .locals 4

    .line 1
    invoke-static {}, Ldefpackage/ud3;->o()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v1, Ldefpackage/g51;->b:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    sget-object v0, Ldefpackage/g51;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    sput-object v0, Ldefpackage/g51;->e:Ljava/lang/String;

    .line 17
    .line 18
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    invoke-static {}, Ldefpackage/j51;->o()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw v0

    .line 26
    :cond_0
    sget-object v1, Ldefpackage/g51;->e:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    sget-object v0, Ldefpackage/g51;->b:Ljava/lang/Object;

    .line 36
    .line 37
    monitor-enter v0

    .line 38
    :try_start_2
    sget-boolean v1, Ldefpackage/g51;->f:Z

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    monitor-exit v0

    .line 43
    return-void

    .line 44
    :catchall_1
    move-exception v1

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    const/4 v3, 0x1

    .line 55
    if-ne v1, v2, :cond_4

    .line 56
    .line 57
    sget-boolean v1, Ldefpackage/g51;->f:Z

    .line 58
    .line 59
    if-eqz v1, :cond_3

    .line 60
    .line 61
    sput-boolean v3, Ldefpackage/g51;->g:Z

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    sput-boolean v3, Ldefpackage/g51;->f:Z

    .line 65
    .line 66
    sget-object v1, Ldefpackage/g51;->c:Ljava/util/concurrent/ExecutorService;

    .line 67
    .line 68
    new-instance v2, Ldefpackage/u6;

    .line 69
    .line 70
    const/4 v3, 0x3

    .line 71
    invoke-direct {v2, v3}, Ldefpackage/u6;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 75
    .line 76
    .line 77
    :goto_0
    monitor-exit v0

    .line 78
    return-void

    .line 79
    :cond_4
    sput-boolean v3, Ldefpackage/g51;->f:Z

    .line 80
    .line 81
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 82
    :try_start_3
    invoke-static {}, Ldefpackage/g51;->h()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 83
    .line 84
    .line 85
    invoke-static {}, Ldefpackage/g51;->g()V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :catchall_2
    move-exception v0

    .line 90
    invoke-static {}, Ldefpackage/g51;->g()V

    .line 91
    .line 92
    .line 93
    throw v0

    .line 94
    :goto_1
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 95
    throw v1
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 1

    .line 1
    invoke-static {}, Ldefpackage/g51;->c()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ldefpackage/g51;->e:Ljava/lang/String;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v0, Ldefpackage/g51;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-static {p0, p1, p2}, Ldefpackage/g51;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Ldefpackage/af4;

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Ldefpackage/af4;->b()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Ldefpackage/af4;->d()Landroid/net/Uri;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method

.method public static e(Lcom/eddyizm/tempus/subsonic/models/Child;)Landroid/net/Uri;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {v0, v1, p0}, Ldefpackage/g51;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static f(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "[\\/:*?\\\"<>|]"

    .line 2
    .line 3
    const-string v1, "_"

    .line 4
    .line 5
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "\\s+"

    .line 10
    .line 11
    const-string v1, " "

    .line 12
    .line 13
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object v0, Ljava/text/Normalizer$Form;->NFKD:Ljava/text/Normalizer$Form;

    .line 22
    .line 23
    invoke-static {p0, v0}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string v0, "\\p{InCombiningDiacriticalMarks}+"

    .line 28
    .line 29
    const-string v1, ""

    .line 30
    .line 31
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public static g()V
    .locals 5

    .line 1
    sget-object v0, Ldefpackage/g51;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    sput-boolean v1, Ldefpackage/g51;->f:Z

    .line 6
    .line 7
    sget-boolean v2, Ldefpackage/g51;->g:Z

    .line 8
    .line 9
    sput-boolean v1, Ldefpackage/g51;->g:Z

    .line 10
    .line 11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 12
    sget-object v1, Ldefpackage/g51;->d:Ldefpackage/k03;

    .line 13
    .line 14
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 15
    .line 16
    .line 17
    move-result-wide v3

    .line 18
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v1, v3}, Ldefpackage/ad2;->i(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    monitor-enter v0

    .line 28
    :try_start_1
    sget-boolean v1, Ldefpackage/g51;->f:Z

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    sput-boolean v2, Ldefpackage/g51;->g:Z

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    sput-boolean v2, Ldefpackage/g51;->f:Z

    .line 37
    .line 38
    sget-object v1, Ldefpackage/g51;->c:Ljava/util/concurrent/ExecutorService;

    .line 39
    .line 40
    new-instance v2, Ldefpackage/u6;

    .line 41
    .line 42
    const/4 v3, 0x3

    .line 43
    invoke-direct {v2, v3}, Ldefpackage/u6;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    monitor-exit v0

    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception v1

    .line 52
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    throw v1

    .line 54
    :cond_1
    return-void

    .line 55
    :catchall_1
    move-exception v1

    .line 56
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 57
    throw v1
.end method

.method public static h()V
    .locals 16

    .line 1
    invoke-static {}, Ldefpackage/ud3;->o()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v1, Ldefpackage/g51;->b:Ljava/lang/Object;

    .line 8
    .line 9
    monitor-enter v1

    .line 10
    :try_start_0
    sget-object v0, Ldefpackage/g51;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    sput-object v0, Ldefpackage/g51;->e:Ljava/lang/String;

    .line 17
    .line 18
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    invoke-static {}, Ldefpackage/j51;->o()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw v0

    .line 26
    :cond_0
    invoke-static {}, Lcom/eddyizm/tempus/App;->a()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    new-instance v3, Ldefpackage/af4;

    .line 35
    .line 36
    invoke-static {v2}, Landroid/provider/DocumentsContract;->getTreeDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-static {v2, v4}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-direct {v3, v1, v2}, Ldefpackage/af4;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    .line 45
    .line 46
    .line 47
    const-class v1, Ldefpackage/j51;

    .line 48
    .line 49
    monitor-enter v1

    .line 50
    :try_start_2
    invoke-static {}, Ldefpackage/j51;->I()Lorg/json/JSONObject;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Lorg/json/JSONObject;->length()I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    const-wide/16 v5, 0x0

    .line 59
    .line 60
    if-nez v4, :cond_1

    .line 61
    .line 62
    sget-object v2, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 63
    .line 64
    monitor-exit v1

    .line 65
    goto :goto_1

    .line 66
    :catchall_1
    move-exception v0

    .line 67
    goto/16 :goto_7

    .line 68
    .line 69
    :cond_1
    :try_start_3
    new-instance v4, Ljava/util/HashMap;

    .line 70
    .line 71
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    :cond_2
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    if-eqz v8, :cond_3

    .line 83
    .line 84
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v8

    .line 88
    check-cast v8, Ljava/lang/String;

    .line 89
    .line 90
    const-wide/16 v9, -0x1

    .line 91
    .line 92
    invoke-virtual {v2, v8, v9, v10}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    .line 93
    .line 94
    .line 95
    move-result-wide v9

    .line 96
    cmp-long v11, v9, v5

    .line 97
    .line 98
    if-lez v11, :cond_2

    .line 99
    .line 100
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    invoke-virtual {v4, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_3
    monitor-exit v1

    .line 109
    move-object v2, v4

    .line 110
    :goto_1
    new-instance v1, Ljava/util/HashSet;

    .line 111
    .line 112
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 113
    .line 114
    .line 115
    new-instance v4, Ljava/util/HashMap;

    .line 116
    .line 117
    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 118
    .line 119
    .line 120
    iget-object v7, v3, Ldefpackage/af4;->b:Landroid/content/Context;

    .line 121
    .line 122
    iget-object v8, v3, Ldefpackage/af4;->c:Landroid/net/Uri;

    .line 123
    .line 124
    const/4 v9, 0x1

    .line 125
    invoke-virtual {v7, v8, v9}, Landroid/content/Context;->checkCallingOrSelfUriPermission(Landroid/net/Uri;I)I

    .line 126
    .line 127
    .line 128
    move-result v9

    .line 129
    if-eqz v9, :cond_4

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_4
    const-string v9, "mime_type"

    .line 133
    .line 134
    invoke-static {v7, v8, v9}, Ldefpackage/h12;->K(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 139
    .line 140
    .line 141
    move-result v7

    .line 142
    if-eqz v7, :cond_5

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_5
    invoke-virtual {v3}, Ldefpackage/af4;->g()[Ldefpackage/af4;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    array-length v7, v3

    .line 150
    const/4 v8, 0x0

    .line 151
    :goto_2
    if-ge v8, v7, :cond_a

    .line 152
    .line 153
    aget-object v9, v3, v8

    .line 154
    .line 155
    if-eqz v9, :cond_9

    .line 156
    .line 157
    invoke-virtual {v9}, Ldefpackage/af4;->e()Z

    .line 158
    .line 159
    .line 160
    move-result v10

    .line 161
    if-eqz v10, :cond_6

    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_6
    invoke-virtual {v9}, Ldefpackage/af4;->c()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v10

    .line 168
    if-nez v10, :cond_7

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_7
    const-string v11, "\\.[^\\.]+$"

    .line 172
    .line 173
    const-string v12, ""

    .line 174
    .line 175
    invoke-virtual {v10, v11, v12}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v10

    .line 179
    invoke-static {v10}, Ldefpackage/g51;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v10

    .line 183
    invoke-interface {v2, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v11

    .line 187
    check-cast v11, Ljava/lang/Long;

    .line 188
    .line 189
    invoke-virtual {v9}, Ldefpackage/af4;->f()J

    .line 190
    .line 191
    .line 192
    move-result-wide v12

    .line 193
    if-eqz v11, :cond_8

    .line 194
    .line 195
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 196
    .line 197
    .line 198
    move-result-wide v14

    .line 199
    cmp-long v14, v14, v5

    .line 200
    .line 201
    if-lez v14, :cond_8

    .line 202
    .line 203
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 204
    .line 205
    .line 206
    move-result-wide v14

    .line 207
    cmp-long v11, v12, v14

    .line 208
    .line 209
    if-nez v11, :cond_8

    .line 210
    .line 211
    invoke-virtual {v4, v10, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_8
    invoke-static {v10}, Ldefpackage/j51;->K(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    :cond_9
    :goto_3
    add-int/lit8 v8, v8, 0x1

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_a
    :goto_4
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 225
    .line 226
    .line 227
    move-result v3

    .line 228
    if-nez v3, :cond_d

    .line 229
    .line 230
    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    .line 231
    .line 232
    .line 233
    move-result v3

    .line 234
    if-eqz v3, :cond_b

    .line 235
    .line 236
    invoke-static {}, Ldefpackage/j51;->o()V

    .line 237
    .line 238
    .line 239
    goto :goto_6

    .line 240
    :cond_b
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    :cond_c
    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    if-eqz v3, :cond_d

    .line 253
    .line 254
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    check-cast v3, Ljava/lang/String;

    .line 259
    .line 260
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    if-nez v5, :cond_c

    .line 265
    .line 266
    invoke-static {v3}, Ldefpackage/j51;->K(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    goto :goto_5

    .line 270
    :cond_d
    :goto_6
    sget-object v2, Ldefpackage/g51;->b:Ljava/lang/Object;

    .line 271
    .line 272
    monitor-enter v2

    .line 273
    :try_start_4
    sget-object v1, Ldefpackage/g51;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 274
    .line 275
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v1, v4}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    .line 279
    .line 280
    .line 281
    sput-object v0, Ldefpackage/g51;->e:Ljava/lang/String;

    .line 282
    .line 283
    monitor-exit v2

    .line 284
    return-void

    .line 285
    :catchall_2
    move-exception v0

    .line 286
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 287
    throw v0

    .line 288
    :goto_7
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 289
    throw v0
.end method

.method public static i()V
    .locals 4

    .line 1
    sget-object v0, Ldefpackage/g51;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    sput-object v1, Ldefpackage/g51;->e:Ljava/lang/String;

    .line 6
    .line 7
    sget-object v1, Ldefpackage/g51;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 10
    .line 11
    .line 12
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    monitor-enter v0

    .line 14
    :try_start_1
    sget-boolean v1, Ldefpackage/g51;->f:Z

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    sput-boolean v2, Ldefpackage/g51;->g:Z

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    sput-boolean v2, Ldefpackage/g51;->f:Z

    .line 23
    .line 24
    sget-object v1, Ldefpackage/g51;->c:Ljava/util/concurrent/ExecutorService;

    .line 25
    .line 26
    new-instance v2, Ldefpackage/u6;

    .line 27
    .line 28
    const/4 v3, 0x3

    .line 29
    invoke-direct {v2, v3}, Ldefpackage/u6;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    :goto_0
    monitor-exit v0

    .line 36
    return-void

    .line 37
    :catchall_0
    move-exception v1

    .line 38
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw v1

    .line 40
    :catchall_1
    move-exception v1

    .line 41
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 42
    throw v1
.end method
