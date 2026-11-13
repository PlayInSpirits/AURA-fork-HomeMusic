.class public abstract Ldefpackage/i51;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ljava/util/concurrent/ExecutorService;

.field public static final b:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sput-object v0, Ldefpackage/i51;->a:Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Ldefpackage/i51;->b:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 12
    .line 13
    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-static {p0, p1, v0, v0, v1}, Ldefpackage/i51;->b(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static b(Landroid/content/Context;Lcom/eddyizm/tempus/subsonic/models/Child;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 10

    .line 1
    if-eqz p0, :cond_6

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto/16 :goto_9

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {p1}, Ldefpackage/gi1;->G(Lcom/eddyizm/tempus/subsonic/models/Child;)Ldefpackage/gn2;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :goto_0
    move-object v3, p0

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    goto :goto_0

    .line 32
    :goto_1
    const/4 p0, 0x1

    .line 33
    if-eqz p4, :cond_2

    .line 34
    .line 35
    new-instance v0, Ldefpackage/nt0;

    .line 36
    .line 37
    const/4 v4, 0x0

    .line 38
    invoke-direct {v0, v4}, Ldefpackage/nt0;-><init>(Z)V

    .line 39
    .line 40
    .line 41
    :goto_2
    move-object v7, v0

    .line 42
    goto :goto_6

    .line 43
    :cond_2
    sget-object v0, Ldefpackage/nt0;->l:Ldefpackage/nt0;

    .line 44
    .line 45
    if-nez v0, :cond_4

    .line 46
    .line 47
    const-class v4, Ldefpackage/nt0;

    .line 48
    .line 49
    monitor-enter v4

    .line 50
    :try_start_0
    sget-object v0, Ldefpackage/nt0;->l:Ldefpackage/nt0;

    .line 51
    .line 52
    if-nez v0, :cond_3

    .line 53
    .line 54
    new-instance v0, Ldefpackage/nt0;

    .line 55
    .line 56
    invoke-direct {v0, p0}, Ldefpackage/nt0;-><init>(Z)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Ldefpackage/nt0;->l:Ldefpackage/nt0;

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    move-object p0, v0

    .line 64
    goto :goto_4

    .line 65
    :cond_3
    :goto_3
    monitor-exit v4

    .line 66
    goto :goto_5

    .line 67
    :goto_4
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    throw p0

    .line 69
    :cond_4
    :goto_5
    sget-object v0, Ldefpackage/nt0;->l:Ldefpackage/nt0;

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :goto_6
    iget-object v4, v7, Ldefpackage/nt0;->a:Ljava/lang/Object;

    .line 73
    .line 74
    monitor-enter v4

    .line 75
    :try_start_1
    iget v0, v7, Ldefpackage/nt0;->c:I

    .line 76
    .line 77
    add-int/2addr v0, p0

    .line 78
    iput v0, v7, Ldefpackage/nt0;->c:I

    .line 79
    .line 80
    iget-wide v5, v7, Ldefpackage/nt0;->g:J

    .line 81
    .line 82
    const-wide/16 v8, 0x0

    .line 83
    .line 84
    cmp-long p0, v5, v8

    .line 85
    .line 86
    if-nez p0, :cond_5

    .line 87
    .line 88
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 89
    .line 90
    .line 91
    move-result-wide v5

    .line 92
    iput-wide v5, v7, Ldefpackage/nt0;->g:J

    .line 93
    .line 94
    goto :goto_7

    .line 95
    :catchall_1
    move-exception v0

    .line 96
    move-object p0, v0

    .line 97
    goto :goto_8

    .line 98
    :cond_5
    :goto_7
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {v7, p0}, Ldefpackage/nt0;->d(Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 106
    sget-object p0, Ldefpackage/i51;->b:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 107
    .line 108
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    sget-object p0, Ldefpackage/i51;->a:Ljava/util/concurrent/ExecutorService;

    .line 116
    .line 117
    new-instance v0, Ldefpackage/h51;

    .line 118
    .line 119
    move-object v4, p1

    .line 120
    move-object v5, p2

    .line 121
    move-object v6, p3

    .line 122
    move v8, p4

    .line 123
    invoke-direct/range {v0 .. v8}, Ldefpackage/h51;-><init>(Landroid/content/Context;Ldefpackage/gn2;Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/Child;Ljava/lang/String;Ljava/lang/String;Ldefpackage/nt0;Z)V

    .line 124
    .line 125
    .line 126
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :goto_8
    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 131
    throw p0

    .line 132
    :cond_6
    :goto_9
    return-void
.end method

.method public static c(Ldefpackage/af4;Ljava/lang/String;)Ldefpackage/af4;
    .locals 4

    .line 1
    invoke-static {p1}, Ldefpackage/i51;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Ldefpackage/af4;->g()[Ldefpackage/af4;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    array-length v0, p0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_2

    .line 12
    .line 13
    aget-object v2, p0, v1

    .line 14
    .line 15
    invoke-virtual {v2}, Ldefpackage/af4;->e()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-virtual {v2}, Ldefpackage/af4;->c()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    invoke-static {v3}, Ldefpackage/i51;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_1

    .line 37
    .line 38
    return-object v2

    .line 39
    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const/4 p0, 0x0

    .line 43
    return-object p0
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {p0}, Ldefpackage/i51;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Ljava/text/Normalizer$Form;->NFKD:Ljava/text/Normalizer$Form;

    .line 6
    .line 7
    invoke-static {p0, v0}, Ljava/text/Normalizer;->normalize(Ljava/lang/CharSequence;Ljava/text/Normalizer$Form;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "\\p{InCombiningDiacriticalMarks}+"

    .line 12
    .line 13
    const-string v1, ""

    .line 14
    .line 15
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public static e(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/net/HttpURLConnection;Ljava/io/File;)Ljava/io/InputStream;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    sparse-switch v0, :sswitch_data_0

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :sswitch_0
    const-string v0, "content"

    .line 11
    .line 12
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x3

    .line 20
    goto :goto_0

    .line 21
    :sswitch_1
    const-string v0, "https"

    .line 22
    .line 23
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/4 v1, 0x2

    .line 31
    goto :goto_0

    .line 32
    :sswitch_2
    const-string v0, "http"

    .line 33
    .line 34
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_2

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_2
    const/4 v1, 0x1

    .line 42
    goto :goto_0

    .line 43
    :sswitch_3
    const-string v0, "file"

    .line 44
    .line 45
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_3

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    const/4 v1, 0x0

    .line 53
    :goto_0
    const/4 v0, 0x0

    .line 54
    packed-switch v1, :pswitch_data_0

    .line 55
    .line 56
    .line 57
    const-string p0, "Unsupported scheme "

    .line 58
    .line 59
    invoke-virtual {p0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :pswitch_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    if-eqz p0, :cond_4

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_4
    const-string p0, "Cannot open content stream"

    .line 79
    .line 80
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-object v0

    .line 84
    :pswitch_1
    if-eqz p3, :cond_5

    .line 85
    .line 86
    invoke-virtual {p3}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :cond_5
    const-string p0, "Connection not initialized"

    .line 92
    .line 93
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-object v0

    .line 97
    :pswitch_2
    if-eqz p4, :cond_6

    .line 98
    .line 99
    invoke-virtual {p4}, Ljava/io/File;->exists()Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-eqz p0, :cond_6

    .line 104
    .line 105
    new-instance p0, Ljava/io/FileInputStream;

    .line 106
    .line 107
    invoke-direct {p0, p4}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 108
    .line 109
    .line 110
    return-object p0

    .line 111
    :cond_6
    const-string p0, "Missing source file"

    .line 112
    .line 113
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-object v0

    .line 117
    :sswitch_data_0
    .sparse-switch
        0x2ff57c -> :sswitch_3
        0x310888 -> :sswitch_2
        0x5f008eb -> :sswitch_1
        0x38b73479 -> :sswitch_0
    .end sparse-switch

    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static f(Landroid/content/Context;Ldefpackage/gn2;Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/Child;Ljava/lang/String;Ljava/lang/String;Ldefpackage/nt0;Z)V
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p3

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    move-object/from16 v3, p5

    .line 8
    .line 9
    move-object/from16 v4, p6

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    if-eqz v5, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object/from16 v5, p2

    .line 23
    .line 24
    :goto_0
    iput-object v5, v4, Ldefpackage/nt0;->k:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v5, v4, Ldefpackage/nt0;->a:Ljava/lang/Object;

    .line 27
    .line 28
    monitor-enter v5

    .line 29
    const-wide/16 v6, 0x0

    .line 30
    .line 31
    :try_start_0
    iput-wide v6, v4, Ldefpackage/nt0;->h:J

    .line 32
    .line 33
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 34
    .line 35
    .line 36
    move-result-wide v8

    .line 37
    iput-wide v8, v4, Ldefpackage/nt0;->i:J

    .line 38
    .line 39
    const/4 v8, 0x0

    .line 40
    iput v8, v4, Ldefpackage/nt0;->j:F

    .line 41
    .line 42
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_11

    .line 43
    invoke-static {}, Ldefpackage/ud3;->o()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    const/16 v8, 0x10

    .line 48
    .line 49
    const v9, 0x1080078

    .line 50
    .line 51
    .line 52
    const/4 v10, 0x0

    .line 53
    const/4 v11, -0x1

    .line 54
    const/4 v12, 0x1

    .line 55
    const/4 v13, 0x0

    .line 56
    if-nez v5, :cond_2

    .line 57
    .line 58
    if-nez p7, :cond_1

    .line 59
    .line 60
    const-string v0, "notification"

    .line 61
    .line 62
    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Landroid/app/NotificationManager;

    .line 67
    .line 68
    new-instance v2, Landroid/content/Intent;

    .line 69
    .line 70
    const-string v3, "android.settings.APPLICATION_DETAILS_SETTINGS"

    .line 71
    .line 72
    const-string v5, "package"

    .line 73
    .line 74
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-static {v5, v6, v13}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-direct {v2, v3, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 83
    .line 84
    .line 85
    const/high16 v3, 0xc000000

    .line 86
    .line 87
    invoke-static {v1, v10, v2, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    new-instance v3, Ldefpackage/s63;

    .line 92
    .line 93
    const-string v5, "download_channel"

    .line 94
    .line 95
    invoke-direct {v3, v1, v5}, Ldefpackage/s63;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const-string v5, "No download folder set"

    .line 99
    .line 100
    invoke-static {v5}, Ldefpackage/s63;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    iput-object v5, v3, Ldefpackage/s63;->e:Ljava/lang/CharSequence;

    .line 105
    .line 106
    const-string v5, "Tap to set one in settings"

    .line 107
    .line 108
    invoke-static {v5}, Ldefpackage/s63;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    iput-object v5, v3, Ldefpackage/s63;->f:Ljava/lang/CharSequence;

    .line 113
    .line 114
    iget-object v5, v3, Ldefpackage/s63;->v:Landroid/app/Notification;

    .line 115
    .line 116
    iput v9, v5, Landroid/app/Notification;->icon:I

    .line 117
    .line 118
    iput v11, v3, Ldefpackage/s63;->i:I

    .line 119
    .line 120
    iput-boolean v12, v3, Ldefpackage/s63;->w:Z

    .line 121
    .line 122
    iput-object v2, v3, Ldefpackage/s63;->g:Landroid/app/PendingIntent;

    .line 123
    .line 124
    invoke-virtual {v3, v8, v12}, Ldefpackage/s63;->c(IZ)V

    .line 125
    .line 126
    .line 127
    const/16 v2, 0x3f2

    .line 128
    .line 129
    invoke-virtual {v3}, Ldefpackage/s63;->a()Landroid/app/Notification;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-virtual {v0, v2, v3}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 134
    .line 135
    .line 136
    :cond_1
    invoke-virtual {v4, v1}, Ldefpackage/nt0;->b(Landroid/content/Context;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_2
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    new-instance v14, Ldefpackage/af4;

    .line 145
    .line 146
    invoke-static {v5}, Landroid/provider/DocumentsContract;->getTreeDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v15

    .line 150
    invoke-static {v5, v15}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    invoke-direct {v14, v1, v5}, Ldefpackage/af4;-><init>(Landroid/content/Context;Landroid/net/Uri;)V

    .line 155
    .line 156
    .line 157
    const/4 v15, 0x2

    .line 158
    invoke-virtual {v1, v5, v15}, Landroid/content/Context;->checkCallingOrSelfUriPermission(Landroid/net/Uri;I)I

    .line 159
    .line 160
    .line 161
    move-result v16

    .line 162
    if-eqz v16, :cond_4

    .line 163
    .line 164
    :cond_3
    :goto_1
    move/from16 v22, v12

    .line 165
    .line 166
    goto/16 :goto_2c

    .line 167
    .line 168
    :cond_4
    const-string v13, "mime_type"

    .line 169
    .line 170
    invoke-static {v1, v5, v13}, Ldefpackage/h12;->K(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v13

    .line 174
    move/from16 v17, v15

    .line 175
    .line 176
    const-string v15, "flags"

    .line 177
    .line 178
    invoke-static {v1, v5, v15, v6, v7}, Ldefpackage/h12;->J(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;J)J

    .line 179
    .line 180
    .line 181
    move-result-wide v8

    .line 182
    long-to-int v8, v8

    .line 183
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 184
    .line 185
    .line 186
    move-result v9

    .line 187
    if-eqz v9, :cond_5

    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_5
    and-int/lit8 v9, v8, 0x4

    .line 191
    .line 192
    if-eqz v9, :cond_6

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_6
    const-string v9, "vnd.android.document/directory"

    .line 196
    .line 197
    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v9

    .line 201
    if-eqz v9, :cond_7

    .line 202
    .line 203
    and-int/lit8 v9, v8, 0x8

    .line 204
    .line 205
    if-eqz v9, :cond_7

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_7
    invoke-static {v13}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 209
    .line 210
    .line 211
    move-result v9

    .line 212
    if-nez v9, :cond_3

    .line 213
    .line 214
    and-int/lit8 v8, v8, 0x2

    .line 215
    .line 216
    if-eqz v8, :cond_3

    .line 217
    .line 218
    :goto_2
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v8

    .line 222
    if-eqz v8, :cond_8

    .line 223
    .line 224
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v8

    .line 228
    goto :goto_3

    .line 229
    :cond_8
    const-string v8, ""

    .line 230
    .line 231
    :goto_3
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v9

    .line 235
    if-eqz v9, :cond_9

    .line 236
    .line 237
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v9

    .line 241
    goto :goto_4

    .line 242
    :cond_9
    move-object/from16 v9, p2

    .line 243
    .line 244
    :goto_4
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v13

    .line 248
    if-eqz v13, :cond_a

    .line 249
    .line 250
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v13

    .line 254
    goto :goto_5

    .line 255
    :cond_a
    const-string v13, ""

    .line 256
    .line 257
    :goto_5
    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    .line 258
    .line 259
    .line 260
    move-result v15

    .line 261
    if-eqz v15, :cond_b

    .line 262
    .line 263
    goto :goto_6

    .line 264
    :cond_b
    const-string v15, " - "

    .line 265
    .line 266
    invoke-static {v8, v15, v9}, Ldefpackage/b11;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    :goto_6
    invoke-virtual {v13}, Ljava/lang/String;->isEmpty()Z

    .line 271
    .line 272
    .line 273
    move-result v8

    .line 274
    if-nez v8, :cond_c

    .line 275
    .line 276
    new-instance v8, Ljava/lang/StringBuilder;

    .line 277
    .line 278
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 282
    .line 283
    .line 284
    const-string v9, " ("

    .line 285
    .line 286
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v8, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 290
    .line 291
    .line 292
    const-string v9, ")"

    .line 293
    .line 294
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 295
    .line 296
    .line 297
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v9

    .line 301
    :cond_c
    invoke-virtual {v9}, Ljava/lang/String;->isEmpty()Z

    .line 302
    .line 303
    .line 304
    move-result v8

    .line 305
    if-eqz v8, :cond_e

    .line 306
    .line 307
    if-eqz p2, :cond_d

    .line 308
    .line 309
    move-object/from16 v9, p2

    .line 310
    .line 311
    goto :goto_7

    .line 312
    :cond_d
    const-string v8, "download"

    .line 313
    .line 314
    move-object v9, v8

    .line 315
    :cond_e
    :goto_7
    invoke-static {v9}, Ldefpackage/i51;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v8

    .line 319
    move-object/from16 v13, p1

    .line 320
    .line 321
    iget-object v13, v13, Ldefpackage/gn2;->f:Ldefpackage/cn2;

    .line 322
    .line 323
    if-eqz v13, :cond_f

    .line 324
    .line 325
    iget-object v13, v13, Ldefpackage/cn2;->a:Landroid/net/Uri;

    .line 326
    .line 327
    goto :goto_8

    .line 328
    :cond_f
    const/4 v13, 0x0

    .line 329
    :goto_8
    if-nez v13, :cond_10

    .line 330
    .line 331
    invoke-static {v8}, Ldefpackage/j51;->K(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v4, v1}, Ldefpackage/nt0;->b(Landroid/content/Context;)V

    .line 335
    .line 336
    .line 337
    return-void

    .line 338
    :cond_10
    invoke-virtual {v13}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v15

    .line 342
    if-eqz v15, :cond_11

    .line 343
    .line 344
    invoke-virtual {v13}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v15

    .line 348
    move-wide/from16 v20, v6

    .line 349
    .line 350
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 351
    .line 352
    invoke-virtual {v15, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v6

    .line 356
    goto :goto_9

    .line 357
    :cond_11
    move-wide/from16 v20, v6

    .line 358
    .line 359
    const-string v6, ""

    .line 360
    .line 361
    :goto_9
    :try_start_1
    const-string v7, "http"

    .line 362
    .line 363
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    move-result v7

    .line 367
    if-nez v7, :cond_12

    .line 368
    .line 369
    const-string v7, "https"

    .line 370
    .line 371
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result v7

    .line 375
    if-eqz v7, :cond_13

    .line 376
    .line 377
    :cond_12
    move/from16 v22, v12

    .line 378
    .line 379
    goto/16 :goto_d

    .line 380
    .line 381
    :cond_13
    const-string v7, "content"

    .line 382
    .line 383
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v7

    .line 387
    if-eqz v7, :cond_14

    .line 388
    .line 389
    new-instance v7, Ldefpackage/af4;

    .line 390
    .line 391
    invoke-direct {v7}, Ldefpackage/af4;-><init>()V

    .line 392
    .line 393
    .line 394
    iput-object v1, v7, Ldefpackage/af4;->b:Landroid/content/Context;

    .line 395
    .line 396
    iput-object v13, v7, Ldefpackage/af4;->c:Landroid/net/Uri;

    .line 397
    .line 398
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 399
    .line 400
    .line 401
    move-result-object v15

    .line 402
    invoke-virtual {v15, v13}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v15

    .line 406
    invoke-virtual {v7}, Ldefpackage/af4;->f()J

    .line 407
    .line 408
    .line 409
    move-result-wide v17

    .line 410
    move/from16 v22, v12

    .line 411
    .line 412
    move-wide/from16 v18, v17

    .line 413
    .line 414
    const/4 v10, 0x0

    .line 415
    const/4 v12, 0x0

    .line 416
    goto/16 :goto_e

    .line 417
    .line 418
    :catchall_0
    move-exception v0

    .line 419
    const/4 v13, 0x0

    .line 420
    goto/16 :goto_2b

    .line 421
    .line 422
    :catch_0
    const/4 v12, 0x0

    .line 423
    :catch_1
    :goto_a
    const/4 v13, 0x0

    .line 424
    goto/16 :goto_2a

    .line 425
    .line 426
    :cond_14
    const-string v7, "file"

    .line 427
    .line 428
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    move-result v7

    .line 432
    if-eqz v7, :cond_18

    .line 433
    .line 434
    invoke-virtual {v13}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v7

    .line 438
    const-wide/16 v17, -0x1

    .line 439
    .line 440
    if-eqz v7, :cond_15

    .line 441
    .line 442
    new-instance v15, Ljava/io/File;

    .line 443
    .line 444
    invoke-direct {v15, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v15}, Ljava/io/File;->exists()Z

    .line 448
    .line 449
    .line 450
    move-result v7

    .line 451
    if-eqz v7, :cond_16

    .line 452
    .line 453
    invoke-virtual {v15}, Ljava/io/File;->length()J

    .line 454
    .line 455
    .line 456
    move-result-wide v17

    .line 457
    goto :goto_b

    .line 458
    :cond_15
    const/4 v15, 0x0

    .line 459
    :cond_16
    :goto_b
    invoke-virtual {v13}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 460
    .line 461
    .line 462
    move-result-object v7

    .line 463
    invoke-static {v7}, Landroid/webkit/MimeTypeMap;->getFileExtensionFromUrl(Ljava/lang/String;)Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object v7

    .line 467
    if-eqz v7, :cond_17

    .line 468
    .line 469
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 470
    .line 471
    .line 472
    move-result v19

    .line 473
    if-nez v19, :cond_17

    .line 474
    .line 475
    move/from16 v22, v12

    .line 476
    .line 477
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 478
    .line 479
    .line 480
    move-result-object v12

    .line 481
    invoke-virtual {v12, v7}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v7

    .line 485
    goto :goto_c

    .line 486
    :cond_17
    move/from16 v22, v12

    .line 487
    .line 488
    const/4 v7, 0x0

    .line 489
    :goto_c
    move-object v10, v15

    .line 490
    move-wide/from16 v18, v17

    .line 491
    .line 492
    const/4 v12, 0x0

    .line 493
    move-object v15, v7

    .line 494
    const/4 v7, 0x0

    .line 495
    goto :goto_e

    .line 496
    :cond_18
    invoke-static {v8}, Ldefpackage/j51;->K(Ljava/lang/String;)V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v4, v1}, Ldefpackage/nt0;->b(Landroid/content/Context;)V

    .line 500
    .line 501
    .line 502
    return-void

    .line 503
    :goto_d
    new-instance v7, Ljava/net/URL;

    .line 504
    .line 505
    invoke-virtual {v13}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v12

    .line 509
    invoke-direct {v7, v12}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v7}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    .line 513
    .line 514
    .line 515
    move-result-object v7

    .line 516
    check-cast v7, Ljava/net/HttpURLConnection;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 517
    .line 518
    const/16 v12, 0x3a98

    .line 519
    .line 520
    :try_start_2
    invoke-virtual {v7, v12}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 521
    .line 522
    .line 523
    const v12, 0xea60

    .line 524
    .line 525
    .line 526
    invoke-virtual {v7, v12}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 527
    .line 528
    .line 529
    const-string v12, "Accept-Encoding"

    .line 530
    .line 531
    const-string v15, "identity"

    .line 532
    .line 533
    invoke-virtual {v7, v12, v15}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v7}, Ljava/net/URLConnection;->connect()V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->getResponseCode()I

    .line 540
    .line 541
    .line 542
    move-result v12

    .line 543
    const/16 v15, 0x190

    .line 544
    .line 545
    if-lt v12, v15, :cond_19

    .line 546
    .line 547
    invoke-static {v8}, Ldefpackage/j51;->K(Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v4, v1}, Ldefpackage/nt0;->b(Landroid/content/Context;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 551
    .line 552
    .line 553
    invoke-virtual {v7}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 554
    .line 555
    .line 556
    return-void

    .line 557
    :catchall_1
    move-exception v0

    .line 558
    move-object v13, v7

    .line 559
    goto/16 :goto_2b

    .line 560
    .line 561
    :catch_2
    move-object v12, v7

    .line 562
    goto/16 :goto_a

    .line 563
    .line 564
    :cond_19
    :try_start_3
    invoke-virtual {v7}, Ljava/net/URLConnection;->getContentType()Ljava/lang/String;

    .line 565
    .line 566
    .line 567
    move-result-object v15

    .line 568
    invoke-virtual {v7}, Ljava/net/URLConnection;->getContentLengthLong()J

    .line 569
    .line 570
    .line 571
    move-result-wide v17
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 572
    move-object v12, v7

    .line 573
    move-wide/from16 v18, v17

    .line 574
    .line 575
    const/4 v7, 0x0

    .line 576
    const/4 v10, 0x0

    .line 577
    :goto_e
    if-eqz v15, :cond_1a

    .line 578
    .line 579
    :try_start_4
    invoke-virtual {v15}, Ljava/lang/String;->isEmpty()Z

    .line 580
    .line 581
    .line 582
    move-result v23

    .line 583
    if-eqz v23, :cond_1b

    .line 584
    .line 585
    goto :goto_f

    .line 586
    :catchall_2
    move-exception v0

    .line 587
    move-object v13, v12

    .line 588
    goto/16 :goto_2b

    .line 589
    .line 590
    :cond_1a
    :goto_f
    const-string v15, "application/octet-stream"

    .line 591
    .line 592
    :cond_1b
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    .line 593
    .line 594
    .line 595
    move-result-object v11

    .line 596
    invoke-virtual {v11, v15}, Landroid/webkit/MimeTypeMap;->getExtensionFromMimeType(Ljava/lang/String;)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v11

    .line 600
    move-object/from16 p1, v7

    .line 601
    .line 602
    const/16 v7, 0x2e

    .line 603
    .line 604
    if-eqz v11, :cond_1d

    .line 605
    .line 606
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    .line 607
    .line 608
    .line 609
    move-result v24

    .line 610
    if-eqz v24, :cond_1c

    .line 611
    .line 612
    goto :goto_10

    .line 613
    :cond_1c
    move-object/from16 p7, v9

    .line 614
    .line 615
    move-object/from16 p1, v11

    .line 616
    .line 617
    goto :goto_11

    .line 618
    :cond_1d
    :goto_10
    if-eqz p1, :cond_1c

    .line 619
    .line 620
    invoke-virtual/range {p1 .. p1}, Ldefpackage/af4;->c()Ljava/lang/String;

    .line 621
    .line 622
    .line 623
    move-result-object v24

    .line 624
    if-eqz v24, :cond_1c

    .line 625
    .line 626
    move-object/from16 p7, v9

    .line 627
    .line 628
    invoke-virtual/range {p1 .. p1}, Ldefpackage/af4;->c()Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object v9

    .line 632
    move-object/from16 p1, v11

    .line 633
    .line 634
    invoke-virtual {v9, v7}, Ljava/lang/String;->lastIndexOf(I)I

    .line 635
    .line 636
    .line 637
    move-result v11

    .line 638
    if-ltz v11, :cond_1e

    .line 639
    .line 640
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 641
    .line 642
    .line 643
    move-result v24

    .line 644
    add-int/lit8 v7, v24, -0x1

    .line 645
    .line 646
    if-ge v11, v7, :cond_1e

    .line 647
    .line 648
    add-int/lit8 v11, v11, 0x1

    .line 649
    .line 650
    invoke-virtual {v9, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v11

    .line 654
    goto :goto_12

    .line 655
    :cond_1e
    :goto_11
    move-object/from16 v11, p1

    .line 656
    .line 657
    :goto_12
    if-eqz v11, :cond_20

    .line 658
    .line 659
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    .line 660
    .line 661
    .line 662
    move-result v7

    .line 663
    if-eqz v7, :cond_1f

    .line 664
    .line 665
    goto :goto_13

    .line 666
    :cond_1f
    move-object/from16 p1, v11

    .line 667
    .line 668
    goto :goto_14

    .line 669
    :cond_20
    :goto_13
    if-eqz v10, :cond_1f

    .line 670
    .line 671
    invoke-virtual {v10}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object v7

    .line 675
    const/16 v9, 0x2e

    .line 676
    .line 677
    invoke-virtual {v7, v9}, Ljava/lang/String;->lastIndexOf(I)I

    .line 678
    .line 679
    .line 680
    move-result v9

    .line 681
    if-ltz v9, :cond_1f

    .line 682
    .line 683
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 684
    .line 685
    .line 686
    move-result v24

    .line 687
    move-object/from16 p1, v11

    .line 688
    .line 689
    add-int/lit8 v11, v24, -0x1

    .line 690
    .line 691
    if-ge v9, v11, :cond_21

    .line 692
    .line 693
    add-int/lit8 v9, v9, 0x1

    .line 694
    .line 695
    invoke-virtual {v7, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 696
    .line 697
    .line 698
    move-result-object v11

    .line 699
    goto :goto_15

    .line 700
    :cond_21
    :goto_14
    move-object/from16 v11, p1

    .line 701
    .line 702
    :goto_15
    if-eqz v11, :cond_22

    .line 703
    .line 704
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    .line 705
    .line 706
    .line 707
    move-result v7

    .line 708
    if-eqz v7, :cond_24

    .line 709
    .line 710
    :cond_22
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSuffix()Ljava/lang/String;

    .line 711
    .line 712
    .line 713
    move-result-object v11

    .line 714
    if-eqz v11, :cond_23

    .line 715
    .line 716
    invoke-virtual {v11}, Ljava/lang/String;->isEmpty()Z

    .line 717
    .line 718
    .line 719
    move-result v7

    .line 720
    if-nez v7, :cond_23

    .line 721
    .line 722
    goto :goto_16

    .line 723
    :cond_23
    const-string v11, "bin"

    .line 724
    .line 725
    :cond_24
    :goto_16
    invoke-static/range {p7 .. p7}, Ldefpackage/i51;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v7

    .line 729
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 730
    .line 731
    .line 732
    move-result v9

    .line 733
    if-eqz v9, :cond_25

    .line 734
    .line 735
    invoke-static/range {p2 .. p2}, Ldefpackage/i51;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 736
    .line 737
    .line 738
    move-result-object v7

    .line 739
    :cond_25
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    .line 740
    .line 741
    .line 742
    move-result v9

    .line 743
    if-eqz v9, :cond_26

    .line 744
    .line 745
    const-string v7, "download"

    .line 746
    .line 747
    :cond_26
    new-instance v9, Ljava/lang/StringBuilder;

    .line 748
    .line 749
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 750
    .line 751
    .line 752
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 753
    .line 754
    .line 755
    const-string v7, "."

    .line 756
    .line 757
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 758
    .line 759
    .line 760
    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 761
    .line 762
    .line 763
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 764
    .line 765
    .line 766
    move-result-object v7

    .line 767
    invoke-static {v14, v7}, Ldefpackage/i51;->c(Ldefpackage/af4;Ljava/lang/String;)Ldefpackage/af4;

    .line 768
    .line 769
    .line 770
    move-result-object v9

    .line 771
    invoke-static {v8}, Ldefpackage/j51;->w(Ljava/lang/String;)Ljava/lang/Long;

    .line 772
    .line 773
    .line 774
    move-result-object v11

    .line 775
    if-eqz v9, :cond_29

    .line 776
    .line 777
    invoke-virtual {v9}, Ldefpackage/af4;->b()Z

    .line 778
    .line 779
    .line 780
    move-result v14

    .line 781
    if-eqz v14, :cond_29

    .line 782
    .line 783
    move-object/from16 p2, v9

    .line 784
    .line 785
    move-object/from16 p1, v10

    .line 786
    .line 787
    invoke-virtual/range {p2 .. p2}, Ldefpackage/af4;->f()J

    .line 788
    .line 789
    .line 790
    move-result-wide v9

    .line 791
    cmp-long v14, v18, v20

    .line 792
    .line 793
    if-lez v14, :cond_27

    .line 794
    .line 795
    cmp-long v24, v9, v18

    .line 796
    .line 797
    if-nez v24, :cond_27

    .line 798
    .line 799
    goto :goto_17

    .line 800
    :cond_27
    if-gtz v14, :cond_28

    .line 801
    .line 802
    if-eqz v11, :cond_28

    .line 803
    .line 804
    invoke-virtual {v11}, Ljava/lang/Long;->longValue()J

    .line 805
    .line 806
    .line 807
    move-result-wide v24

    .line 808
    cmp-long v11, v9, v24

    .line 809
    .line 810
    if-nez v11, :cond_28

    .line 811
    .line 812
    :goto_17
    invoke-static {v8, v9, v10}, Ldefpackage/j51;->J(Ljava/lang/String;J)V

    .line 813
    .line 814
    .line 815
    invoke-virtual/range {p2 .. p2}, Ldefpackage/af4;->d()Landroid/net/Uri;

    .line 816
    .line 817
    .line 818
    move-result-object v5

    .line 819
    invoke-static {v0, v5, v2, v3}, Ldefpackage/i51;->g(Lcom/eddyizm/tempus/subsonic/models/Child;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    .line 820
    .line 821
    .line 822
    invoke-static {}, Ldefpackage/g51;->i()V

    .line 823
    .line 824
    .line 825
    invoke-virtual {v4, v1}, Ldefpackage/nt0;->c(Landroid/content/Context;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 826
    .line 827
    .line 828
    if-eqz v12, :cond_38

    .line 829
    .line 830
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 831
    .line 832
    .line 833
    return-void

    .line 834
    :cond_28
    :try_start_5
    invoke-virtual/range {p2 .. p2}, Ldefpackage/af4;->a()Z

    .line 835
    .line 836
    .line 837
    invoke-static {v8}, Ldefpackage/j51;->K(Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 838
    .line 839
    .line 840
    goto :goto_18

    .line 841
    :cond_29
    move-object/from16 p1, v10

    .line 842
    .line 843
    :goto_18
    :try_start_6
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 844
    .line 845
    .line 846
    move-result-object v9

    .line 847
    invoke-static {v9, v5, v15, v7}, Landroid/provider/DocumentsContract;->createDocument(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    .line 848
    .line 849
    .line 850
    move-result-object v5
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 851
    goto :goto_19

    .line 852
    :catch_3
    const/4 v5, 0x0

    .line 853
    :goto_19
    if-eqz v5, :cond_2a

    .line 854
    .line 855
    :try_start_7
    new-instance v7, Ldefpackage/af4;

    .line 856
    .line 857
    invoke-direct {v7, v1, v5}, Ldefpackage/af4;-><init>(Landroid/content/Context;Landroid/net/Uri;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 858
    .line 859
    .line 860
    goto :goto_1a

    .line 861
    :cond_2a
    const/4 v7, 0x0

    .line 862
    :goto_1a
    if-nez v7, :cond_2b

    .line 863
    .line 864
    :try_start_8
    invoke-static {v8}, Ldefpackage/j51;->K(Ljava/lang/String;)V

    .line 865
    .line 866
    .line 867
    invoke-virtual {v4, v1}, Ldefpackage/nt0;->b(Landroid/content/Context;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 868
    .line 869
    .line 870
    if-eqz v12, :cond_38

    .line 871
    .line 872
    :goto_1b
    invoke-virtual {v12}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 873
    .line 874
    .line 875
    goto/16 :goto_2d

    .line 876
    .line 877
    :catch_4
    move-object v13, v7

    .line 878
    goto/16 :goto_2a

    .line 879
    .line 880
    :cond_2b
    :try_start_9
    iget-object v5, v7, Ldefpackage/af4;->c:Landroid/net/Uri;

    .line 881
    .line 882
    move-object/from16 v15, p1

    .line 883
    .line 884
    invoke-static {v1, v13, v6, v12, v15}, Ldefpackage/i51;->e(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;Ljava/net/HttpURLConnection;Ljava/io/File;)Ljava/io/InputStream;

    .line 885
    .line 886
    .line 887
    move-result-object v6
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 888
    :try_start_a
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 889
    .line 890
    .line 891
    move-result-object v9

    .line 892
    invoke-virtual {v9, v5}, Landroid/content/ContentResolver;->openOutputStream(Landroid/net/Uri;)Ljava/io/OutputStream;

    .line 893
    .line 894
    .line 895
    move-result-object v9
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_f

    .line 896
    if-nez v9, :cond_2e

    .line 897
    .line 898
    :try_start_b
    invoke-virtual {v7}, Ldefpackage/af4;->a()Z

    .line 899
    .line 900
    .line 901
    invoke-static {v8}, Ldefpackage/j51;->K(Ljava/lang/String;)V

    .line 902
    .line 903
    .line 904
    invoke-virtual {v4, v1}, Ldefpackage/nt0;->b(Landroid/content/Context;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 905
    .line 906
    .line 907
    if-eqz v9, :cond_2c

    .line 908
    .line 909
    :try_start_c
    invoke-virtual {v9}, Ljava/io/OutputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    .line 910
    .line 911
    .line 912
    goto :goto_1c

    .line 913
    :catchall_3
    move-exception v0

    .line 914
    move-object v2, v0

    .line 915
    move-object/from16 p1, v6

    .line 916
    .line 917
    move-object/from16 p2, v7

    .line 918
    .line 919
    goto/16 :goto_28

    .line 920
    .line 921
    :cond_2c
    :goto_1c
    if-eqz v6, :cond_2d

    .line 922
    .line 923
    :try_start_d
    invoke-virtual {v6}, Ljava/io/InputStream;->close()V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_4
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 924
    .line 925
    .line 926
    :cond_2d
    if-eqz v12, :cond_38

    .line 927
    .line 928
    goto :goto_1b

    .line 929
    :catchall_4
    move-exception v0

    .line 930
    move-object v2, v0

    .line 931
    move-object/from16 p1, v6

    .line 932
    .line 933
    move-object/from16 p2, v7

    .line 934
    .line 935
    move-object/from16 p7, v9

    .line 936
    .line 937
    goto/16 :goto_26

    .line 938
    .line 939
    :cond_2e
    const/16 v10, 0x2000

    .line 940
    .line 941
    :try_start_e
    new-array v10, v10, [B

    .line 942
    .line 943
    move-wide/from16 v13, v20

    .line 944
    .line 945
    move-wide v15, v13

    .line 946
    :goto_1d
    invoke-virtual {v6, v10}, Ljava/io/InputStream;->read([B)I

    .line 947
    .line 948
    .line 949
    move-result v11
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_d

    .line 950
    move-object/from16 p1, v6

    .line 951
    .line 952
    const/4 v6, -0x1

    .line 953
    if-eq v11, v6, :cond_31

    .line 954
    .line 955
    const/4 v6, 0x0

    .line 956
    :try_start_f
    invoke-virtual {v9, v10, v6, v11}, Ljava/io/OutputStream;->write([BII)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_9

    .line 957
    .line 958
    .line 959
    move-object/from16 p2, v7

    .line 960
    .line 961
    int-to-long v6, v11

    .line 962
    add-long/2addr v13, v6

    .line 963
    :try_start_10
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 964
    .line 965
    .line 966
    move-result-wide v6
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_8

    .line 967
    sub-long v24, v6, v15

    .line 968
    .line 969
    const-wide/16 v26, 0x1f4

    .line 970
    .line 971
    cmp-long v11, v24, v26

    .line 972
    .line 973
    if-lez v11, :cond_30

    .line 974
    .line 975
    :try_start_11
    iget-object v11, v4, Ldefpackage/nt0;->a:Ljava/lang/Object;

    .line 976
    .line 977
    monitor-enter v11
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_7

    .line 978
    move-wide/from16 v24, v6

    .line 979
    .line 980
    :try_start_12
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 981
    .line 982
    .line 983
    move-result-wide v6
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    .line 984
    move-object/from16 p7, v9

    .line 985
    .line 986
    move-object/from16 v28, v10

    .line 987
    .line 988
    :try_start_13
    iget-wide v9, v4, Ldefpackage/nt0;->i:J

    .line 989
    .line 990
    sub-long v9, v6, v9

    .line 991
    .line 992
    cmp-long v15, v9, v26

    .line 993
    .line 994
    if-ltz v15, :cond_2f

    .line 995
    .line 996
    iget-wide v2, v4, Ldefpackage/nt0;->h:J

    .line 997
    .line 998
    sub-long v2, v13, v2

    .line 999
    .line 1000
    long-to-float v2, v2

    .line 1001
    const/high16 v3, 0x447a0000    # 1000.0f

    .line 1002
    .line 1003
    mul-float/2addr v2, v3

    .line 1004
    long-to-float v3, v9

    .line 1005
    div-float/2addr v2, v3

    .line 1006
    iput v2, v4, Ldefpackage/nt0;->j:F

    .line 1007
    .line 1008
    goto :goto_1e

    .line 1009
    :catchall_5
    move-exception v0

    .line 1010
    goto :goto_1f

    .line 1011
    :cond_2f
    :goto_1e
    iput-wide v13, v4, Ldefpackage/nt0;->h:J

    .line 1012
    .line 1013
    iput-wide v6, v4, Ldefpackage/nt0;->i:J

    .line 1014
    .line 1015
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v2

    .line 1019
    invoke-virtual {v4, v2}, Ldefpackage/nt0;->d(Landroid/content/Context;)V

    .line 1020
    .line 1021
    .line 1022
    monitor-exit v11

    .line 1023
    move-wide/from16 v15, v24

    .line 1024
    .line 1025
    goto :goto_21

    .line 1026
    :catchall_6
    move-exception v0

    .line 1027
    move-object/from16 p7, v9

    .line 1028
    .line 1029
    :goto_1f
    monitor-exit v11
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_5

    .line 1030
    :try_start_14
    throw v0

    .line 1031
    :catchall_7
    move-exception v0

    .line 1032
    goto :goto_22

    .line 1033
    :goto_20
    move-object v2, v0

    .line 1034
    goto/16 :goto_26

    .line 1035
    .line 1036
    :cond_30
    move-object/from16 p7, v9

    .line 1037
    .line 1038
    move-object/from16 v28, v10

    .line 1039
    .line 1040
    :goto_21
    move-object/from16 v6, p1

    .line 1041
    .line 1042
    move-object/from16 v7, p2

    .line 1043
    .line 1044
    move-object/from16 v2, p4

    .line 1045
    .line 1046
    move-object/from16 v3, p5

    .line 1047
    .line 1048
    move-object/from16 v9, p7

    .line 1049
    .line 1050
    move-object/from16 v10, v28

    .line 1051
    .line 1052
    goto :goto_1d

    .line 1053
    :catchall_8
    move-exception v0

    .line 1054
    :goto_22
    move-object/from16 p7, v9

    .line 1055
    .line 1056
    goto :goto_20

    .line 1057
    :catchall_9
    move-exception v0

    .line 1058
    :goto_23
    move-object/from16 p2, v7

    .line 1059
    .line 1060
    goto :goto_22

    .line 1061
    :cond_31
    move-object/from16 p2, v7

    .line 1062
    .line 1063
    move-object/from16 p7, v9

    .line 1064
    .line 1065
    invoke-virtual/range {p7 .. p7}, Ljava/io/OutputStream;->flush()V

    .line 1066
    .line 1067
    .line 1068
    cmp-long v2, v13, v20

    .line 1069
    .line 1070
    if-gtz v2, :cond_32

    .line 1071
    .line 1072
    invoke-virtual/range {p2 .. p2}, Ldefpackage/af4;->a()Z

    .line 1073
    .line 1074
    .line 1075
    invoke-static {v8}, Ldefpackage/j51;->K(Ljava/lang/String;)V

    .line 1076
    .line 1077
    .line 1078
    invoke-virtual {v4, v1}, Ldefpackage/nt0;->b(Landroid/content/Context;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_b

    .line 1079
    .line 1080
    .line 1081
    :try_start_15
    invoke-virtual/range {p7 .. p7}, Ljava/io/OutputStream;->close()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    .line 1082
    .line 1083
    .line 1084
    :try_start_16
    invoke-virtual/range {p1 .. p1}, Ljava/io/InputStream;->close()V
    :try_end_16
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_16} :catch_5
    .catchall {:try_start_16 .. :try_end_16} :catchall_2

    .line 1085
    .line 1086
    .line 1087
    if-eqz v12, :cond_38

    .line 1088
    .line 1089
    goto/16 :goto_1b

    .line 1090
    .line 1091
    :catch_5
    :goto_24
    move-object/from16 v13, p2

    .line 1092
    .line 1093
    goto/16 :goto_2a

    .line 1094
    .line 1095
    :catchall_a
    move-exception v0

    .line 1096
    :goto_25
    move-object v2, v0

    .line 1097
    goto :goto_28

    .line 1098
    :catchall_b
    move-exception v0

    .line 1099
    goto :goto_20

    .line 1100
    :cond_32
    cmp-long v2, v18, v20

    .line 1101
    .line 1102
    if-lez v2, :cond_33

    .line 1103
    .line 1104
    cmp-long v2, v13, v18

    .line 1105
    .line 1106
    if-eqz v2, :cond_33

    .line 1107
    .line 1108
    :try_start_17
    invoke-virtual/range {p2 .. p2}, Ldefpackage/af4;->a()Z

    .line 1109
    .line 1110
    .line 1111
    invoke-static {v8}, Ldefpackage/j51;->K(Ljava/lang/String;)V

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual {v4, v1}, Ldefpackage/nt0;->b(Landroid/content/Context;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_b

    .line 1115
    .line 1116
    .line 1117
    :try_start_18
    invoke-virtual/range {p7 .. p7}, Ljava/io/OutputStream;->close()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_a

    .line 1118
    .line 1119
    .line 1120
    :try_start_19
    invoke-virtual/range {p1 .. p1}, Ljava/io/InputStream;->close()V
    :try_end_19
    .catch Ljava/lang/Exception; {:try_start_19 .. :try_end_19} :catch_5
    .catchall {:try_start_19 .. :try_end_19} :catchall_2

    .line 1121
    .line 1122
    .line 1123
    if-eqz v12, :cond_38

    .line 1124
    .line 1125
    goto/16 :goto_1b

    .line 1126
    .line 1127
    :cond_33
    :try_start_1a
    invoke-static {v8, v13, v14}, Ldefpackage/j51;->J(Ljava/lang/String;J)V

    .line 1128
    .line 1129
    .line 1130
    move-object/from16 v2, p4

    .line 1131
    .line 1132
    move-object/from16 v3, p5

    .line 1133
    .line 1134
    invoke-static {v0, v5, v2, v3}, Ldefpackage/i51;->g(Lcom/eddyizm/tempus/subsonic/models/Child;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    .line 1135
    .line 1136
    .line 1137
    iget-object v2, v4, Ldefpackage/nt0;->a:Ljava/lang/Object;

    .line 1138
    .line 1139
    monitor-enter v2
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_b

    .line 1140
    :try_start_1b
    iget v0, v4, Ldefpackage/nt0;->d:I

    .line 1141
    .line 1142
    add-int/lit8 v0, v0, 0x1

    .line 1143
    .line 1144
    iput v0, v4, Ldefpackage/nt0;->d:I

    .line 1145
    .line 1146
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v0

    .line 1150
    invoke-virtual {v4, v0}, Ldefpackage/nt0;->a(Landroid/content/Context;)V

    .line 1151
    .line 1152
    .line 1153
    monitor-exit v2
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_c

    .line 1154
    :try_start_1c
    invoke-static {}, Ldefpackage/g51;->i()V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_b

    .line 1155
    .line 1156
    .line 1157
    :try_start_1d
    invoke-virtual/range {p7 .. p7}, Ljava/io/OutputStream;->close()V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_a

    .line 1158
    .line 1159
    .line 1160
    :try_start_1e
    invoke-virtual/range {p1 .. p1}, Ljava/io/InputStream;->close()V
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_5
    .catchall {:try_start_1e .. :try_end_1e} :catchall_2

    .line 1161
    .line 1162
    .line 1163
    if-eqz v12, :cond_38

    .line 1164
    .line 1165
    goto/16 :goto_1b

    .line 1166
    .line 1167
    :catchall_c
    move-exception v0

    .line 1168
    :try_start_1f
    monitor-exit v2
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_c

    .line 1169
    :try_start_20
    throw v0
    :try_end_20
    .catchall {:try_start_20 .. :try_end_20} :catchall_b

    .line 1170
    :catchall_d
    move-exception v0

    .line 1171
    move-object/from16 p1, v6

    .line 1172
    .line 1173
    goto :goto_23

    .line 1174
    :goto_26
    if-eqz p7, :cond_34

    .line 1175
    .line 1176
    :try_start_21
    invoke-virtual/range {p7 .. p7}, Ljava/io/OutputStream;->close()V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_e

    .line 1177
    .line 1178
    .line 1179
    goto :goto_27

    .line 1180
    :catchall_e
    move-exception v0

    .line 1181
    :try_start_22
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1182
    .line 1183
    .line 1184
    :cond_34
    :goto_27
    throw v2
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_a

    .line 1185
    :catchall_f
    move-exception v0

    .line 1186
    move-object/from16 p1, v6

    .line 1187
    .line 1188
    move-object/from16 p2, v7

    .line 1189
    .line 1190
    goto :goto_25

    .line 1191
    :goto_28
    if-eqz p1, :cond_35

    .line 1192
    .line 1193
    :try_start_23
    invoke-virtual/range {p1 .. p1}, Ljava/io/InputStream;->close()V
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_10

    .line 1194
    .line 1195
    .line 1196
    goto :goto_29

    .line 1197
    :catchall_10
    move-exception v0

    .line 1198
    :try_start_24
    invoke-virtual {v2, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 1199
    .line 1200
    .line 1201
    :cond_35
    :goto_29
    throw v2
    :try_end_24
    .catch Ljava/lang/Exception; {:try_start_24 .. :try_end_24} :catch_5
    .catchall {:try_start_24 .. :try_end_24} :catchall_2

    .line 1202
    :catch_6
    move-object/from16 p2, v7

    .line 1203
    .line 1204
    goto :goto_24

    .line 1205
    :goto_2a
    if-eqz v13, :cond_36

    .line 1206
    .line 1207
    :try_start_25
    invoke-virtual {v13}, Ldefpackage/af4;->a()Z

    .line 1208
    .line 1209
    .line 1210
    :cond_36
    invoke-static {v8}, Ldefpackage/j51;->K(Ljava/lang/String;)V

    .line 1211
    .line 1212
    .line 1213
    invoke-virtual {v4, v1}, Ldefpackage/nt0;->b(Landroid/content/Context;)V
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_2

    .line 1214
    .line 1215
    .line 1216
    if-eqz v12, :cond_38

    .line 1217
    .line 1218
    goto/16 :goto_1b

    .line 1219
    .line 1220
    :goto_2b
    if-eqz v13, :cond_37

    .line 1221
    .line 1222
    invoke-virtual {v13}, Ljava/net/HttpURLConnection;->disconnect()V

    .line 1223
    .line 1224
    .line 1225
    :cond_37
    throw v0

    .line 1226
    :goto_2c
    invoke-virtual {v4, v1}, Ldefpackage/nt0;->b(Landroid/content/Context;)V

    .line 1227
    .line 1228
    .line 1229
    if-nez p7, :cond_38

    .line 1230
    .line 1231
    const-string v0, "notification"

    .line 1232
    .line 1233
    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v0

    .line 1237
    check-cast v0, Landroid/app/NotificationManager;

    .line 1238
    .line 1239
    new-instance v2, Ldefpackage/s63;

    .line 1240
    .line 1241
    const-string v3, "download_channel"

    .line 1242
    .line 1243
    invoke-direct {v2, v1, v3}, Ldefpackage/s63;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 1244
    .line 1245
    .line 1246
    const-string v1, "Download folder error"

    .line 1247
    .line 1248
    invoke-static {v1}, Ldefpackage/s63;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v1

    .line 1252
    iput-object v1, v2, Ldefpackage/s63;->e:Ljava/lang/CharSequence;

    .line 1253
    .line 1254
    const-string v1, "Cannot write to the selected folder"

    .line 1255
    .line 1256
    invoke-static {v1}, Ldefpackage/s63;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v1

    .line 1260
    iput-object v1, v2, Ldefpackage/s63;->f:Ljava/lang/CharSequence;

    .line 1261
    .line 1262
    iget-object v1, v2, Ldefpackage/s63;->v:Landroid/app/Notification;

    .line 1263
    .line 1264
    const v3, 0x1080078

    .line 1265
    .line 1266
    .line 1267
    iput v3, v1, Landroid/app/Notification;->icon:I

    .line 1268
    .line 1269
    const/4 v6, -0x1

    .line 1270
    iput v6, v2, Ldefpackage/s63;->i:I

    .line 1271
    .line 1272
    move/from16 v1, v22

    .line 1273
    .line 1274
    iput-boolean v1, v2, Ldefpackage/s63;->w:Z

    .line 1275
    .line 1276
    const/16 v3, 0x10

    .line 1277
    .line 1278
    invoke-virtual {v2, v3, v1}, Ldefpackage/s63;->c(IZ)V

    .line 1279
    .line 1280
    .line 1281
    const/16 v1, 0x3f1

    .line 1282
    .line 1283
    invoke-virtual {v2}, Ldefpackage/s63;->a()Landroid/app/Notification;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v2

    .line 1287
    invoke-virtual {v0, v1, v2}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 1288
    .line 1289
    .line 1290
    :cond_38
    :goto_2d
    return-void

    .line 1291
    :catchall_11
    move-exception v0

    .line 1292
    :try_start_26
    monitor-exit v5
    :try_end_26
    .catchall {:try_start_26 .. :try_end_26} :catchall_11

    .line 1293
    throw v0
.end method

.method public static g(Lcom/eddyizm/tempus/subsonic/models/Child;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Lcom/eddyizm/tempus/model/Download;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/eddyizm/tempus/model/Download;-><init>(Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Ldefpackage/e03;->a:Ljava/util/regex/Pattern;

    .line 10
    .line 11
    const-string p0, "audio_transcode_download"

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {p0, v1}, Ldefpackage/xa3;->u(Ljava/lang/String;Z)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_3

    .line 19
    .line 20
    const-string p0, "audio_transcode_download_priority"

    .line 21
    .line 22
    invoke-static {p0, v1}, Ldefpackage/xa3;->u(Ljava/lang/String;Z)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-eqz p0, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-static {}, Ldefpackage/e03;->l()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {}, Ldefpackage/e03;->l()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-string v2, "raw"

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const-string v2, "0"

    .line 44
    .line 45
    if-eqz v1, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    const-string v3, "max_bitrate_download"

    .line 60
    .line 61
    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    :goto_0
    invoke-static {v0, p0, v2}, Ldefpackage/e03;->a(Lcom/eddyizm/tempus/model/Download;Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 72
    invoke-virtual {v0, p0}, Lcom/eddyizm/tempus/model/Download;->setDownloadState(I)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, p2}, Lcom/eddyizm/tempus/model/Download;->setPlaylistId(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p3}, Lcom/eddyizm/tempus/model/Download;->setPlaylistName(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    if-eqz p1, :cond_4

    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {v0, p0}, Lcom/eddyizm/tempus/model/Download;->setDownloadUri(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :cond_4
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0}, Lcom/eddyizm/tempus/database/AppDatabase;->w()Ldefpackage/ss0;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    new-instance p1, Ldefpackage/lg1;

    .line 99
    .line 100
    const/16 p2, 0xb

    .line 101
    .line 102
    invoke-direct {p1, p2, p0, v0}, Ldefpackage/lg1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    new-instance p0, Ljava/lang/Thread;

    .line 106
    .line 107
    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public static h(Ljava/lang/String;)Ljava/lang/String;
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
    return-object p0
.end method
