.class public final Lij1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/os/Handler$Callback;


# static fields
.field public static final C:Lcom/google/android/gms/common/api/Status;

.field public static final D:Lcom/google/android/gms/common/api/Status;

.field public static final E:Ljava/lang/Object;

.field public static F:Lij1;


# instance fields
.field public final A:Lzw2;

.field public volatile B:Z

.field public n:J

.field public o:Z

.field public p:Lkr4;

.field public q:Lr61;

.field public final r:Landroid/content/Context;

.field public final s:Lej1;

.field public final t:Lhd5;

.field public final u:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final v:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final w:Ljava/util/concurrent/ConcurrentHashMap;

.field public x:Ldf5;

.field public final y:Lqi;

.field public final z:Lqi;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    const-string v2, "Sign-out occurred while this API call was in progress."

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lka0;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lij1;->C:Lcom/google/android/gms/common/api/Status;

    .line 11
    .line 12
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 13
    .line 14
    const-string v2, "The user must be signed in to make this API call."

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, v3, v3}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lka0;)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lij1;->D:Lcom/google/android/gms/common/api/Status;

    .line 20
    .line 21
    new-instance v0, Ljava/lang/Object;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    sput-object v0, Lij1;->E:Ljava/lang/Object;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;)V
    .locals 6

    .line 1
    sget-object v0, Lej1;->c:Lej1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, 0x2710

    .line 7
    .line 8
    iput-wide v1, p0, Lij1;->n:J

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-boolean v1, p0, Lij1;->o:Z

    .line 12
    .line 13
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object v2, p0, Lij1;->u:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 20
    .line 21
    new-instance v2, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 22
    .line 23
    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 24
    .line 25
    .line 26
    iput-object v2, p0, Lij1;->v:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 27
    .line 28
    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    const/4 v4, 0x5

    .line 31
    const/high16 v5, 0x3f400000    # 0.75f

    .line 32
    .line 33
    invoke-direct {v2, v4, v5, v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>(IFI)V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, Lij1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    iput-object v2, p0, Lij1;->x:Ldf5;

    .line 40
    .line 41
    new-instance v2, Lqi;

    .line 42
    .line 43
    invoke-direct {v2, v1}, Lqi;-><init>(I)V

    .line 44
    .line 45
    .line 46
    iput-object v2, p0, Lij1;->y:Lqi;

    .line 47
    .line 48
    new-instance v2, Lqi;

    .line 49
    .line 50
    invoke-direct {v2, v1}, Lqi;-><init>(I)V

    .line 51
    .line 52
    .line 53
    iput-object v2, p0, Lij1;->z:Lqi;

    .line 54
    .line 55
    iput-boolean v3, p0, Lij1;->B:Z

    .line 56
    .line 57
    iput-object p1, p0, Lij1;->r:Landroid/content/Context;

    .line 58
    .line 59
    new-instance v2, Lzw2;

    .line 60
    .line 61
    const/4 v4, 0x2

    .line 62
    invoke-direct {v2, p2, p0, v4}, Lzw2;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 66
    .line 67
    .line 68
    iput-object v2, p0, Lij1;->A:Lzw2;

    .line 69
    .line 70
    iput-object v0, p0, Lij1;->s:Lej1;

    .line 71
    .line 72
    new-instance p2, Lhd5;

    .line 73
    .line 74
    const/16 v0, 0x17

    .line 75
    .line 76
    invoke-direct {p2, v0}, Lhd5;-><init>(I)V

    .line 77
    .line 78
    .line 79
    iput-object p2, p0, Lij1;->t:Lhd5;

    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    sget-object p2, Lkb4;->h:Ljava/lang/Boolean;

    .line 86
    .line 87
    if-nez p2, :cond_1

    .line 88
    .line 89
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 90
    .line 91
    const/16 v0, 0x1a

    .line 92
    .line 93
    if-lt p2, v0, :cond_0

    .line 94
    .line 95
    const-string p2, "android.hardware.type.automotive"

    .line 96
    .line 97
    invoke-virtual {p1, p2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_0

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_0
    move v3, v1

    .line 105
    :goto_0
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    sput-object p1, Lkb4;->h:Ljava/lang/Boolean;

    .line 110
    .line 111
    :cond_1
    sget-object p1, Lkb4;->h:Ljava/lang/Boolean;

    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-eqz p1, :cond_2

    .line 118
    .line 119
    iput-boolean v1, p0, Lij1;->B:Z

    .line 120
    .line 121
    :cond_2
    const/4 p0, 0x6

    .line 122
    invoke-virtual {v2, p0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    invoke-virtual {v2, p0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 127
    .line 128
    .line 129
    return-void
.end method

.method public static d(Lve;Lka0;)Lcom/google/android/gms/common/api/Status;
    .locals 4

    .line 1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    iget-object p0, p0, Lve;->b:Lrf2;

    .line 4
    .line 5
    iget-object p0, p0, Lrf2;->o:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "API: "

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, " is not available on this device. Connection failed with: "

    .line 24
    .line 25
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const/16 v1, 0x11

    .line 36
    .line 37
    iget-object v2, p1, Lka0;->p:Landroid/app/PendingIntent;

    .line 38
    .line 39
    invoke-direct {v0, v1, p0, v2, p1}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lka0;)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method public static f(Landroid/content/Context;)Lij1;
    .locals 5

    .line 1
    sget-object v0, Lij1;->E:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lij1;->F:Lij1;

    .line 5
    .line 6
    if-nez v1, :cond_1

    .line 7
    .line 8
    sget-object v1, Ltk5;->g:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    :try_start_1
    sget-object v2, Ltk5;->i:Landroid/os/HandlerThread;

    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    monitor-exit v1

    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    new-instance v2, Landroid/os/HandlerThread;

    .line 20
    .line 21
    const-string v3, "GoogleApiHandler"

    .line 22
    .line 23
    const/16 v4, 0x9

    .line 24
    .line 25
    invoke-direct {v2, v3, v4}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    .line 26
    .line 27
    .line 28
    sput-object v2, Ltk5;->i:Landroid/os/HandlerThread;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Thread;->start()V

    .line 31
    .line 32
    .line 33
    sget-object v2, Ltk5;->i:Landroid/os/HandlerThread;

    .line 34
    .line 35
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    :goto_0
    :try_start_2
    invoke-virtual {v2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v2, Lij1;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    sget-object v3, Lej1;->b:Ljava/lang/Object;

    .line 47
    .line 48
    invoke-direct {v2, p0, v1}, Lij1;-><init>(Landroid/content/Context;Landroid/os/Looper;)V

    .line 49
    .line 50
    .line 51
    sput-object v2, Lij1;->F:Lij1;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :catchall_1
    move-exception p0

    .line 55
    goto :goto_3

    .line 56
    :goto_1
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 57
    :try_start_4
    throw p0

    .line 58
    :cond_1
    :goto_2
    sget-object p0, Lij1;->F:Lij1;

    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-object p0

    .line 62
    :goto_3
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 63
    throw p0
.end method


# virtual methods
.method public final a(Ldf5;)V
    .locals 2

    .line 1
    sget-object v0, Lij1;->E:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lij1;->x:Ldf5;

    .line 5
    .line 6
    if-eq v1, p1, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lij1;->x:Ldf5;

    .line 9
    .line 10
    iget-object v1, p0, Lij1;->y:Lqi;

    .line 11
    .line 12
    invoke-virtual {v1}, Lqi;->clear()V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    iget-object p0, p0, Lij1;->y:Lqi;

    .line 19
    .line 20
    iget-object p1, p1, Ldf5;->s:Lqi;

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lqi;->addAll(Ljava/util/Collection;)Z

    .line 23
    .line 24
    .line 25
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    throw p0
.end method

.method public final b()Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lij1;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Ld34;->E()Ld34;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget-object v0, v0, Ld34;->o:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Le34;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-boolean v0, v0, Le34;->o:Z

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    :cond_1
    iget-object p0, p0, Lij1;->t:Lhd5;

    .line 21
    .line 22
    iget-object p0, p0, Lhd5;->o:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, Landroid/util/SparseIntArray;

    .line 25
    .line 26
    const v0, 0xc1fa340

    .line 27
    .line 28
    .line 29
    const/4 v1, -0x1

    .line 30
    invoke-virtual {p0, v0, v1}, Landroid/util/SparseIntArray;->get(II)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eq p0, v1, :cond_3

    .line 35
    .line 36
    if-nez p0, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 40
    return p0

    .line 41
    :cond_3
    :goto_1
    const/4 p0, 0x1

    .line 42
    return p0
.end method

.method public final c(Lka0;I)Z
    .locals 8

    .line 1
    iget-object v0, p0, Lij1;->s:Lej1;

    .line 2
    .line 3
    iget-object p0, p0, Lij1;->r:Landroid/content/Context;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-class v1, Lzz1;

    .line 9
    .line 10
    monitor-enter v1

    .line 11
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    sget-object v3, Lzz1;->a:Landroid/content/Context;

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    sget-object v7, Lzz1;->b:Ljava/lang/Boolean;

    .line 23
    .line 24
    if-eqz v7, :cond_1

    .line 25
    .line 26
    if-eq v3, v2, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    monitor-exit v1

    .line 34
    goto :goto_3

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto/16 :goto_8

    .line 37
    .line 38
    :cond_1
    :goto_0
    :try_start_1
    sput-object v6, Lzz1;->b:Ljava/lang/Boolean;

    .line 39
    .line 40
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 41
    .line 42
    const/16 v7, 0x1a

    .line 43
    .line 44
    if-lt v3, v7, :cond_2

    .line 45
    .line 46
    move v3, v4

    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move v3, v5

    .line 49
    :goto_1
    if-eqz v3, :cond_3

    .line 50
    .line 51
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-static {v3}, Lgm0;->B(Landroid/content/pm/PackageManager;)Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    sput-object v3, Lzz1;->b:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    :try_start_2
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    const-string v7, "com.google.android.instantapps.supervisor.InstantAppsRuntime"

    .line 71
    .line 72
    invoke-virtual {v3, v7}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 76
    .line 77
    sput-object v3, Lzz1;->b:Ljava/lang/Boolean;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :catch_0
    :try_start_3
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 81
    .line 82
    sput-object v3, Lzz1;->b:Ljava/lang/Boolean;

    .line 83
    .line 84
    :goto_2
    sput-object v2, Lzz1;->a:Landroid/content/Context;

    .line 85
    .line 86
    sget-object v2, Lzz1;->b:Ljava/lang/Boolean;

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 89
    .line 90
    .line 91
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 92
    monitor-exit v1

    .line 93
    :goto_3
    if-eqz v2, :cond_4

    .line 94
    .line 95
    goto :goto_6

    .line 96
    :cond_4
    iget v1, p1, Lka0;->o:I

    .line 97
    .line 98
    if-eqz v1, :cond_5

    .line 99
    .line 100
    iget-object v2, p1, Lka0;->p:Landroid/app/PendingIntent;

    .line 101
    .line 102
    if-eqz v2, :cond_5

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_5
    invoke-virtual {v0, v1, p0, v6}, Lfj1;->a(ILandroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    if-nez v1, :cond_6

    .line 110
    .line 111
    goto :goto_4

    .line 112
    :cond_6
    const/high16 v2, 0xc000000

    .line 113
    .line 114
    invoke-static {p0, v5, v1, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    :goto_4
    move-object v2, v6

    .line 119
    :goto_5
    if-eqz v2, :cond_7

    .line 120
    .line 121
    iget p1, p1, Lka0;->o:I

    .line 122
    .line 123
    sget v1, Lcom/google/android/gms/common/api/GoogleApiActivity;->o:I

    .line 124
    .line 125
    const-class v1, Lcom/google/android/gms/common/api/GoogleApiActivity;

    .line 126
    .line 127
    new-instance v3, Landroid/content/Intent;

    .line 128
    .line 129
    invoke-direct {v3, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 130
    .line 131
    .line 132
    const-string v1, "pending_intent"

    .line 133
    .line 134
    invoke-virtual {v3, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 135
    .line 136
    .line 137
    const-string v1, "failing_client_id"

    .line 138
    .line 139
    invoke-virtual {v3, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 140
    .line 141
    .line 142
    const-string p2, "notify_manager"

    .line 143
    .line 144
    invoke-virtual {v3, p2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 145
    .line 146
    .line 147
    sget p2, Lgg5;->a:I

    .line 148
    .line 149
    const/high16 v1, 0x8000000

    .line 150
    .line 151
    or-int/2addr p2, v1

    .line 152
    invoke-static {p0, v5, v3, p2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    invoke-virtual {v0, p0, p1, p2}, Lej1;->f(Landroid/content/Context;ILandroid/app/PendingIntent;)V

    .line 157
    .line 158
    .line 159
    goto :goto_7

    .line 160
    :cond_7
    :goto_6
    move v4, v5

    .line 161
    :goto_7
    return v4

    .line 162
    :goto_8
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 163
    throw p0
.end method

.method public final e(Ldj1;)Lgf5;
    .locals 3

    .line 1
    iget-object v0, p1, Ldj1;->e:Lve;

    .line 2
    .line 3
    iget-object v1, p0, Lij1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    check-cast v2, Lgf5;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    new-instance v2, Lgf5;

    .line 14
    .line 15
    invoke-direct {v2, p0, p1}, Lgf5;-><init>(Lij1;Ldj1;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object p1, v2, Lgf5;->f:Lme;

    .line 22
    .line 23
    invoke-interface {p1}, Lme;->i0()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p0, p0, Lij1;->z:Lqi;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lqi;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {v2}, Lgf5;->j()V

    .line 35
    .line 36
    .line 37
    return-object v2
.end method

.method public final g(Lka0;I)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lij1;->c(Lka0;I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x5

    .line 8
    const/4 v1, 0x0

    .line 9
    iget-object p0, p0, Lij1;->A:Lzw2;

    .line 10
    .line 11
    invoke-virtual {p0, v0, p2, v1, p1}, Landroid/os/Handler;->obtainMessage(IIILjava/lang/Object;)Landroid/os/Message;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 14

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const-wide/32 v2, 0x493e0

    .line 5
    .line 6
    .line 7
    const/16 v4, 0x11

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v7, 0x1

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    new-instance p0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string p1, "Unknown message id: "

    .line 18
    .line 19
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string p1, "GoogleApiManager"

    .line 30
    .line 31
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 32
    .line 33
    .line 34
    return v5

    .line 35
    :pswitch_0
    iput-boolean v5, p0, Lij1;->o:Z

    .line 36
    .line 37
    return v7

    .line 38
    :pswitch_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Lof5;

    .line 41
    .line 42
    iget-wide v2, p1, Lof5;->c:J

    .line 43
    .line 44
    const-wide/16 v8, 0x0

    .line 45
    .line 46
    cmp-long v0, v2, v8

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    new-instance v0, Lkr4;

    .line 51
    .line 52
    iget v2, p1, Lof5;->b:I

    .line 53
    .line 54
    iget-object p1, p1, Lof5;->a:Liw2;

    .line 55
    .line 56
    filled-new-array {p1}, [Liw2;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-direct {v0, p1, v2}, Lkr4;-><init>(Ljava/util/List;I)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lij1;->q:Lr61;

    .line 68
    .line 69
    if-nez p1, :cond_0

    .line 70
    .line 71
    iget-object v9, p0, Lij1;->r:Landroid/content/Context;

    .line 72
    .line 73
    sget-object v12, Llr4;->n:Llr4;

    .line 74
    .line 75
    new-instance v8, Lr61;

    .line 76
    .line 77
    sget-object v11, Lr61;->m:Lrf2;

    .line 78
    .line 79
    sget-object v13, Lcj1;->c:Lcj1;

    .line 80
    .line 81
    const/4 v10, 0x0

    .line 82
    invoke-direct/range {v8 .. v13}, Ldj1;-><init>(Landroid/content/Context;Landroidx/credentials/playservices/HiddenActivity;Lrf2;Lle;Lcj1;)V

    .line 83
    .line 84
    .line 85
    iput-object v8, p0, Lij1;->q:Lr61;

    .line 86
    .line 87
    :cond_0
    iget-object p0, p0, Lij1;->q:Lr61;

    .line 88
    .line 89
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-static {}, Lbk;->b()Lbk;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    sget-object v2, Lhw;->e:Lp61;

    .line 97
    .line 98
    filled-new-array {v2}, [Lp61;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    iput-object v2, p1, Lbk;->r:Ljava/lang/Object;

    .line 103
    .line 104
    iput-boolean v5, p1, Lbk;->p:Z

    .line 105
    .line 106
    new-instance v2, Lh95;

    .line 107
    .line 108
    invoke-direct {v2, v0}, Lh95;-><init>(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    iput-object v2, p1, Lbk;->q:Ljava/lang/Object;

    .line 112
    .line 113
    invoke-virtual {p1}, Lbk;->a()Lbk;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p0, v1, p1}, Ldj1;->b(ILbk;)Ljw;

    .line 118
    .line 119
    .line 120
    return v7

    .line 121
    :cond_1
    iget-object v0, p0, Lij1;->p:Lkr4;

    .line 122
    .line 123
    if-eqz v0, :cond_8

    .line 124
    .line 125
    iget-object v2, v0, Lkr4;->o:Ljava/util/List;

    .line 126
    .line 127
    iget v0, v0, Lkr4;->n:I

    .line 128
    .line 129
    iget v3, p1, Lof5;->b:I

    .line 130
    .line 131
    if-ne v0, v3, :cond_4

    .line 132
    .line 133
    if-eqz v2, :cond_2

    .line 134
    .line 135
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    iget v2, p1, Lof5;->d:I

    .line 140
    .line 141
    if-lt v0, v2, :cond_2

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_2
    iget-object v0, p0, Lij1;->p:Lkr4;

    .line 145
    .line 146
    iget-object v1, p1, Lof5;->a:Liw2;

    .line 147
    .line 148
    iget-object v2, v0, Lkr4;->o:Ljava/util/List;

    .line 149
    .line 150
    if-nez v2, :cond_3

    .line 151
    .line 152
    new-instance v2, Ljava/util/ArrayList;

    .line 153
    .line 154
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 155
    .line 156
    .line 157
    iput-object v2, v0, Lkr4;->o:Ljava/util/List;

    .line 158
    .line 159
    :cond_3
    iget-object v0, v0, Lkr4;->o:Ljava/util/List;

    .line 160
    .line 161
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    goto :goto_1

    .line 165
    :cond_4
    :goto_0
    iget-object v0, p0, Lij1;->A:Lzw2;

    .line 166
    .line 167
    invoke-virtual {v0, v4}, Landroid/os/Handler;->removeMessages(I)V

    .line 168
    .line 169
    .line 170
    iget-object v0, p0, Lij1;->p:Lkr4;

    .line 171
    .line 172
    if-eqz v0, :cond_8

    .line 173
    .line 174
    iget v2, v0, Lkr4;->n:I

    .line 175
    .line 176
    if-gtz v2, :cond_5

    .line 177
    .line 178
    invoke-virtual {p0}, Lij1;->b()Z

    .line 179
    .line 180
    .line 181
    move-result v2

    .line 182
    if-eqz v2, :cond_7

    .line 183
    .line 184
    :cond_5
    iget-object v2, p0, Lij1;->q:Lr61;

    .line 185
    .line 186
    if-nez v2, :cond_6

    .line 187
    .line 188
    iget-object v9, p0, Lij1;->r:Landroid/content/Context;

    .line 189
    .line 190
    sget-object v12, Llr4;->n:Llr4;

    .line 191
    .line 192
    new-instance v8, Lr61;

    .line 193
    .line 194
    sget-object v11, Lr61;->m:Lrf2;

    .line 195
    .line 196
    sget-object v13, Lcj1;->c:Lcj1;

    .line 197
    .line 198
    const/4 v10, 0x0

    .line 199
    invoke-direct/range {v8 .. v13}, Ldj1;-><init>(Landroid/content/Context;Landroidx/credentials/playservices/HiddenActivity;Lrf2;Lle;Lcj1;)V

    .line 200
    .line 201
    .line 202
    iput-object v8, p0, Lij1;->q:Lr61;

    .line 203
    .line 204
    :cond_6
    iget-object v2, p0, Lij1;->q:Lr61;

    .line 205
    .line 206
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-static {}, Lbk;->b()Lbk;

    .line 210
    .line 211
    .line 212
    move-result-object v3

    .line 213
    sget-object v8, Lhw;->e:Lp61;

    .line 214
    .line 215
    filled-new-array {v8}, [Lp61;

    .line 216
    .line 217
    .line 218
    move-result-object v8

    .line 219
    iput-object v8, v3, Lbk;->r:Ljava/lang/Object;

    .line 220
    .line 221
    iput-boolean v5, v3, Lbk;->p:Z

    .line 222
    .line 223
    new-instance v5, Lh95;

    .line 224
    .line 225
    invoke-direct {v5, v0}, Lh95;-><init>(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    iput-object v5, v3, Lbk;->q:Ljava/lang/Object;

    .line 229
    .line 230
    invoke-virtual {v3}, Lbk;->a()Lbk;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    invoke-virtual {v2, v1, v0}, Ldj1;->b(ILbk;)Ljw;

    .line 235
    .line 236
    .line 237
    :cond_7
    iput-object v6, p0, Lij1;->p:Lkr4;

    .line 238
    .line 239
    :cond_8
    :goto_1
    iget-object v0, p0, Lij1;->p:Lkr4;

    .line 240
    .line 241
    if-nez v0, :cond_21

    .line 242
    .line 243
    new-instance v0, Ljava/util/ArrayList;

    .line 244
    .line 245
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 246
    .line 247
    .line 248
    iget-object v1, p1, Lof5;->a:Liw2;

    .line 249
    .line 250
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    new-instance v1, Lkr4;

    .line 254
    .line 255
    iget v2, p1, Lof5;->b:I

    .line 256
    .line 257
    invoke-direct {v1, v0, v2}, Lkr4;-><init>(Ljava/util/List;I)V

    .line 258
    .line 259
    .line 260
    iput-object v1, p0, Lij1;->p:Lkr4;

    .line 261
    .line 262
    iget-object p0, p0, Lij1;->A:Lzw2;

    .line 263
    .line 264
    invoke-virtual {p0, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    iget-wide v1, p1, Lof5;->c:J

    .line 269
    .line 270
    invoke-virtual {p0, v0, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 271
    .line 272
    .line 273
    return v7

    .line 274
    :pswitch_2
    iget-object p1, p0, Lij1;->p:Lkr4;

    .line 275
    .line 276
    if-eqz p1, :cond_21

    .line 277
    .line 278
    iget v0, p1, Lkr4;->n:I

    .line 279
    .line 280
    if-gtz v0, :cond_9

    .line 281
    .line 282
    invoke-virtual {p0}, Lij1;->b()Z

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-eqz v0, :cond_b

    .line 287
    .line 288
    :cond_9
    iget-object v0, p0, Lij1;->q:Lr61;

    .line 289
    .line 290
    if-nez v0, :cond_a

    .line 291
    .line 292
    iget-object v9, p0, Lij1;->r:Landroid/content/Context;

    .line 293
    .line 294
    sget-object v12, Llr4;->n:Llr4;

    .line 295
    .line 296
    new-instance v8, Lr61;

    .line 297
    .line 298
    sget-object v11, Lr61;->m:Lrf2;

    .line 299
    .line 300
    sget-object v13, Lcj1;->c:Lcj1;

    .line 301
    .line 302
    const/4 v10, 0x0

    .line 303
    invoke-direct/range {v8 .. v13}, Ldj1;-><init>(Landroid/content/Context;Landroidx/credentials/playservices/HiddenActivity;Lrf2;Lle;Lcj1;)V

    .line 304
    .line 305
    .line 306
    iput-object v8, p0, Lij1;->q:Lr61;

    .line 307
    .line 308
    :cond_a
    iget-object v0, p0, Lij1;->q:Lr61;

    .line 309
    .line 310
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    invoke-static {}, Lbk;->b()Lbk;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    sget-object v3, Lhw;->e:Lp61;

    .line 318
    .line 319
    filled-new-array {v3}, [Lp61;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    iput-object v3, v2, Lbk;->r:Ljava/lang/Object;

    .line 324
    .line 325
    iput-boolean v5, v2, Lbk;->p:Z

    .line 326
    .line 327
    new-instance v3, Lh95;

    .line 328
    .line 329
    invoke-direct {v3, p1}, Lh95;-><init>(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    iput-object v3, v2, Lbk;->q:Ljava/lang/Object;

    .line 333
    .line 334
    invoke-virtual {v2}, Lbk;->a()Lbk;

    .line 335
    .line 336
    .line 337
    move-result-object p1

    .line 338
    invoke-virtual {v0, v1, p1}, Ldj1;->b(ILbk;)Ljw;

    .line 339
    .line 340
    .line 341
    :cond_b
    iput-object v6, p0, Lij1;->p:Lkr4;

    .line 342
    .line 343
    return v7

    .line 344
    :pswitch_3
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast p1, Lhf5;

    .line 347
    .line 348
    iget-object v0, p0, Lij1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 349
    .line 350
    iget-object v1, p1, Lhf5;->a:Lve;

    .line 351
    .line 352
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-eqz v0, :cond_21

    .line 357
    .line 358
    iget-object p0, p0, Lij1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 359
    .line 360
    iget-object v0, p1, Lhf5;->a:Lve;

    .line 361
    .line 362
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    check-cast p0, Lgf5;

    .line 367
    .line 368
    iget-object v0, p0, Lgf5;->n:Ljava/util/ArrayList;

    .line 369
    .line 370
    iget-object v1, p0, Lgf5;->q:Lij1;

    .line 371
    .line 372
    iget-object v2, p0, Lgf5;->e:Ljava/util/LinkedList;

    .line 373
    .line 374
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v0

    .line 378
    if-eqz v0, :cond_21

    .line 379
    .line 380
    iget-object v0, v1, Lij1;->A:Lzw2;

    .line 381
    .line 382
    const/16 v3, 0xf

    .line 383
    .line 384
    invoke-virtual {v0, v3, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 385
    .line 386
    .line 387
    iget-object v0, v1, Lij1;->A:Lzw2;

    .line 388
    .line 389
    const/16 v1, 0x10

    .line 390
    .line 391
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    iget-object p1, p1, Lhf5;->b:Lp61;

    .line 395
    .line 396
    new-instance v0, Ljava/util/ArrayList;

    .line 397
    .line 398
    invoke-virtual {v2}, Ljava/util/LinkedList;->size()I

    .line 399
    .line 400
    .line 401
    move-result v1

    .line 402
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 403
    .line 404
    .line 405
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    :cond_c
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 410
    .line 411
    .line 412
    move-result v3

    .line 413
    if-eqz v3, :cond_e

    .line 414
    .line 415
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    check-cast v3, Lcg5;

    .line 420
    .line 421
    instance-of v4, v3, Lkf5;

    .line 422
    .line 423
    if-eqz v4, :cond_c

    .line 424
    .line 425
    move-object v4, v3

    .line 426
    check-cast v4, Lkf5;

    .line 427
    .line 428
    invoke-virtual {v4, p0}, Lkf5;->g(Lgf5;)[Lp61;

    .line 429
    .line 430
    .line 431
    move-result-object v4

    .line 432
    if-eqz v4, :cond_c

    .line 433
    .line 434
    array-length v6, v4

    .line 435
    move v8, v5

    .line 436
    :goto_3
    if-ge v8, v6, :cond_c

    .line 437
    .line 438
    aget-object v9, v4, v8

    .line 439
    .line 440
    invoke-static {v9, p1}, Lau0;->n(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v9

    .line 444
    if-eqz v9, :cond_d

    .line 445
    .line 446
    if-ltz v8, :cond_c

    .line 447
    .line 448
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    goto :goto_2

    .line 452
    :cond_d
    add-int/lit8 v8, v8, 0x1

    .line 453
    .line 454
    goto :goto_3

    .line 455
    :cond_e
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 456
    .line 457
    .line 458
    move-result p0

    .line 459
    :goto_4
    if-ge v5, p0, :cond_21

    .line 460
    .line 461
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 462
    .line 463
    .line 464
    move-result-object v1

    .line 465
    check-cast v1, Lcg5;

    .line 466
    .line 467
    invoke-virtual {v2, v1}, Ljava/util/LinkedList;->remove(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    new-instance v3, Lcom/google/android/gms/common/api/UnsupportedApiCallException;

    .line 471
    .line 472
    invoke-direct {v3, p1}, Lcom/google/android/gms/common/api/UnsupportedApiCallException;-><init>(Lp61;)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v1, v3}, Lcg5;->b(Ljava/lang/Exception;)V

    .line 476
    .line 477
    .line 478
    add-int/lit8 v5, v5, 0x1

    .line 479
    .line 480
    goto :goto_4

    .line 481
    :pswitch_4
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 482
    .line 483
    check-cast p1, Lhf5;

    .line 484
    .line 485
    iget-object v0, p0, Lij1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 486
    .line 487
    iget-object v1, p1, Lhf5;->a:Lve;

    .line 488
    .line 489
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v0

    .line 493
    if-eqz v0, :cond_21

    .line 494
    .line 495
    iget-object p0, p0, Lij1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 496
    .line 497
    iget-object v0, p1, Lhf5;->a:Lve;

    .line 498
    .line 499
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object p0

    .line 503
    check-cast p0, Lgf5;

    .line 504
    .line 505
    iget-object v0, p0, Lgf5;->n:Ljava/util/ArrayList;

    .line 506
    .line 507
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    move-result p1

    .line 511
    if-nez p1, :cond_f

    .line 512
    .line 513
    goto/16 :goto_e

    .line 514
    .line 515
    :cond_f
    iget-boolean p1, p0, Lgf5;->m:Z

    .line 516
    .line 517
    if-nez p1, :cond_21

    .line 518
    .line 519
    iget-object p1, p0, Lgf5;->f:Lme;

    .line 520
    .line 521
    invoke-interface {p1}, Lme;->Y()Z

    .line 522
    .line 523
    .line 524
    move-result p1

    .line 525
    if-nez p1, :cond_10

    .line 526
    .line 527
    invoke-virtual {p0}, Lgf5;->j()V

    .line 528
    .line 529
    .line 530
    return v7

    .line 531
    :cond_10
    invoke-virtual {p0}, Lgf5;->d()V

    .line 532
    .line 533
    .line 534
    return v7

    .line 535
    :pswitch_5
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 536
    .line 537
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 538
    .line 539
    .line 540
    invoke-static {}, Lkf2;->k()V

    .line 541
    .line 542
    .line 543
    return v5

    .line 544
    :pswitch_6
    iget-object v0, p0, Lij1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 545
    .line 546
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 547
    .line 548
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    if-eqz v0, :cond_21

    .line 553
    .line 554
    iget-object p0, p0, Lij1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 555
    .line 556
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 557
    .line 558
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object p0

    .line 562
    check-cast p0, Lgf5;

    .line 563
    .line 564
    iget-object p1, p0, Lgf5;->q:Lij1;

    .line 565
    .line 566
    iget-object p1, p1, Lij1;->A:Lzw2;

    .line 567
    .line 568
    invoke-static {p1}, Lji2;->j(Landroid/os/Handler;)V

    .line 569
    .line 570
    .line 571
    iget-object p1, p0, Lgf5;->f:Lme;

    .line 572
    .line 573
    invoke-interface {p1}, Lme;->Y()Z

    .line 574
    .line 575
    .line 576
    move-result v0

    .line 577
    if-eqz v0, :cond_13

    .line 578
    .line 579
    iget-object v0, p0, Lgf5;->j:Ljava/util/HashMap;

    .line 580
    .line 581
    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    .line 582
    .line 583
    .line 584
    move-result v0

    .line 585
    if-eqz v0, :cond_13

    .line 586
    .line 587
    iget-object v0, p0, Lgf5;->h:Lxc5;

    .line 588
    .line 589
    iget-object v1, v0, Lxc5;->o:Ljava/lang/Object;

    .line 590
    .line 591
    check-cast v1, Ljava/util/Map;

    .line 592
    .line 593
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 594
    .line 595
    .line 596
    move-result v1

    .line 597
    if-eqz v1, :cond_12

    .line 598
    .line 599
    iget-object v0, v0, Lxc5;->p:Ljava/lang/Object;

    .line 600
    .line 601
    check-cast v0, Ljava/util/Map;

    .line 602
    .line 603
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 604
    .line 605
    .line 606
    move-result v0

    .line 607
    if-nez v0, :cond_11

    .line 608
    .line 609
    goto :goto_5

    .line 610
    :cond_11
    const-string p0, "Timing out service connection."

    .line 611
    .line 612
    invoke-interface {p1, p0}, Lme;->a0(Ljava/lang/String;)V

    .line 613
    .line 614
    .line 615
    return v7

    .line 616
    :cond_12
    :goto_5
    invoke-virtual {p0}, Lgf5;->g()V

    .line 617
    .line 618
    .line 619
    :cond_13
    return v7

    .line 620
    :pswitch_7
    iget-object v0, p0, Lij1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 621
    .line 622
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 623
    .line 624
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 625
    .line 626
    .line 627
    move-result v0

    .line 628
    if-eqz v0, :cond_21

    .line 629
    .line 630
    iget-object p0, p0, Lij1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 631
    .line 632
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 633
    .line 634
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 635
    .line 636
    .line 637
    move-result-object p0

    .line 638
    check-cast p0, Lgf5;

    .line 639
    .line 640
    iget-object p1, p0, Lgf5;->q:Lij1;

    .line 641
    .line 642
    iget-object v0, p1, Lij1;->A:Lzw2;

    .line 643
    .line 644
    invoke-static {v0}, Lji2;->j(Landroid/os/Handler;)V

    .line 645
    .line 646
    .line 647
    iget-boolean v0, p0, Lgf5;->m:Z

    .line 648
    .line 649
    if-eqz v0, :cond_21

    .line 650
    .line 651
    iget-object v1, p0, Lgf5;->g:Lve;

    .line 652
    .line 653
    iget-object v2, p0, Lgf5;->q:Lij1;

    .line 654
    .line 655
    iget-object v2, v2, Lij1;->A:Lzw2;

    .line 656
    .line 657
    if-eqz v0, :cond_14

    .line 658
    .line 659
    const/16 v0, 0xb

    .line 660
    .line 661
    invoke-virtual {v2, v0, v1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 662
    .line 663
    .line 664
    const/16 v0, 0x9

    .line 665
    .line 666
    invoke-virtual {v2, v0, v1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 667
    .line 668
    .line 669
    iput-boolean v5, p0, Lgf5;->m:Z

    .line 670
    .line 671
    :cond_14
    iget-object v0, p1, Lij1;->s:Lej1;

    .line 672
    .line 673
    iget-object p1, p1, Lij1;->r:Landroid/content/Context;

    .line 674
    .line 675
    sget v1, Lfj1;->a:I

    .line 676
    .line 677
    invoke-virtual {v0, p1, v1}, Lfj1;->b(Landroid/content/Context;I)I

    .line 678
    .line 679
    .line 680
    move-result p1

    .line 681
    const/16 v0, 0x12

    .line 682
    .line 683
    if-ne p1, v0, :cond_15

    .line 684
    .line 685
    const-string p1, "Connection timed out waiting for Google Play services update to complete."

    .line 686
    .line 687
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 688
    .line 689
    const/16 v1, 0x15

    .line 690
    .line 691
    invoke-direct {v0, v1, p1, v6, v6}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lka0;)V

    .line 692
    .line 693
    .line 694
    goto :goto_6

    .line 695
    :cond_15
    const-string p1, "API failed to connect while resuming due to an unknown error."

    .line 696
    .line 697
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    .line 698
    .line 699
    const/16 v1, 0x16

    .line 700
    .line 701
    invoke-direct {v0, v1, p1, v6, v6}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lka0;)V

    .line 702
    .line 703
    .line 704
    :goto_6
    invoke-virtual {p0, v0}, Lgf5;->b(Lcom/google/android/gms/common/api/Status;)V

    .line 705
    .line 706
    .line 707
    iget-object p0, p0, Lgf5;->f:Lme;

    .line 708
    .line 709
    const-string p1, "Timing out connection while resuming."

    .line 710
    .line 711
    invoke-interface {p0, p1}, Lme;->a0(Ljava/lang/String;)V

    .line 712
    .line 713
    .line 714
    return v7

    .line 715
    :pswitch_8
    iget-object p1, p0, Lij1;->z:Lqi;

    .line 716
    .line 717
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 718
    .line 719
    .line 720
    new-instance v0, Lki;

    .line 721
    .line 722
    invoke-direct {v0, p1}, Lki;-><init>(Lqi;)V

    .line 723
    .line 724
    .line 725
    :cond_16
    :goto_7
    invoke-virtual {v0}, Lki;->hasNext()Z

    .line 726
    .line 727
    .line 728
    move-result p1

    .line 729
    if-eqz p1, :cond_17

    .line 730
    .line 731
    invoke-virtual {v0}, Lki;->next()Ljava/lang/Object;

    .line 732
    .line 733
    .line 734
    move-result-object p1

    .line 735
    check-cast p1, Lve;

    .line 736
    .line 737
    iget-object v1, p0, Lij1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 738
    .line 739
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object p1

    .line 743
    check-cast p1, Lgf5;

    .line 744
    .line 745
    if-eqz p1, :cond_16

    .line 746
    .line 747
    invoke-virtual {p1}, Lgf5;->o()V

    .line 748
    .line 749
    .line 750
    goto :goto_7

    .line 751
    :cond_17
    iget-object p0, p0, Lij1;->z:Lqi;

    .line 752
    .line 753
    invoke-virtual {p0}, Lqi;->clear()V

    .line 754
    .line 755
    .line 756
    return v7

    .line 757
    :pswitch_9
    iget-object v0, p0, Lij1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 758
    .line 759
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 760
    .line 761
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 762
    .line 763
    .line 764
    move-result v0

    .line 765
    if-eqz v0, :cond_21

    .line 766
    .line 767
    iget-object p0, p0, Lij1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 768
    .line 769
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 770
    .line 771
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object p0

    .line 775
    check-cast p0, Lgf5;

    .line 776
    .line 777
    iget-object p1, p0, Lgf5;->q:Lij1;

    .line 778
    .line 779
    iget-object p1, p1, Lij1;->A:Lzw2;

    .line 780
    .line 781
    invoke-static {p1}, Lji2;->j(Landroid/os/Handler;)V

    .line 782
    .line 783
    .line 784
    iget-boolean p1, p0, Lgf5;->m:Z

    .line 785
    .line 786
    if-eqz p1, :cond_21

    .line 787
    .line 788
    invoke-virtual {p0}, Lgf5;->j()V

    .line 789
    .line 790
    .line 791
    return v7

    .line 792
    :pswitch_a
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 793
    .line 794
    check-cast p1, Ldj1;

    .line 795
    .line 796
    invoke-virtual {p0, p1}, Lij1;->e(Ldj1;)Lgf5;

    .line 797
    .line 798
    .line 799
    return v7

    .line 800
    :pswitch_b
    iget-object p1, p0, Lij1;->r:Landroid/content/Context;

    .line 801
    .line 802
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 803
    .line 804
    .line 805
    move-result-object p1

    .line 806
    instance-of p1, p1, Landroid/app/Application;

    .line 807
    .line 808
    if-eqz p1, :cond_21

    .line 809
    .line 810
    iget-object p1, p0, Lij1;->r:Landroid/content/Context;

    .line 811
    .line 812
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 813
    .line 814
    .line 815
    move-result-object p1

    .line 816
    check-cast p1, Landroid/app/Application;

    .line 817
    .line 818
    sget-object v1, Lso;->r:Lso;

    .line 819
    .line 820
    monitor-enter v1

    .line 821
    :try_start_0
    iget-boolean v0, v1, Lso;->q:Z

    .line 822
    .line 823
    if-nez v0, :cond_18

    .line 824
    .line 825
    invoke-virtual {p1, v1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 826
    .line 827
    .line 828
    invoke-virtual {p1, v1}, Landroid/app/Application;->registerComponentCallbacks(Landroid/content/ComponentCallbacks;)V

    .line 829
    .line 830
    .line 831
    iput-boolean v7, v1, Lso;->q:Z

    .line 832
    .line 833
    goto :goto_8

    .line 834
    :catchall_0
    move-exception v0

    .line 835
    move-object p0, v0

    .line 836
    goto :goto_9

    .line 837
    :cond_18
    :goto_8
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 838
    new-instance p1, Lff5;

    .line 839
    .line 840
    invoke-direct {p1, p0}, Lff5;-><init>(Lij1;)V

    .line 841
    .line 842
    .line 843
    monitor-enter v1

    .line 844
    :try_start_1
    iget-object v0, v1, Lso;->p:Ljava/util/ArrayList;

    .line 845
    .line 846
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 847
    .line 848
    .line 849
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 850
    iget-object p1, v1, Lso;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 851
    .line 852
    iget-object v0, v1, Lso;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 853
    .line 854
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 855
    .line 856
    .line 857
    move-result v1

    .line 858
    if-nez v1, :cond_19

    .line 859
    .line 860
    new-instance v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 861
    .line 862
    invoke-direct {v1}, Landroid/app/ActivityManager$RunningAppProcessInfo;-><init>()V

    .line 863
    .line 864
    .line 865
    invoke-static {v1}, Landroid/app/ActivityManager;->getMyMemoryState(Landroid/app/ActivityManager$RunningAppProcessInfo;)V

    .line 866
    .line 867
    .line 868
    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 869
    .line 870
    .line 871
    move-result v0

    .line 872
    if-nez v0, :cond_19

    .line 873
    .line 874
    iget v0, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->importance:I

    .line 875
    .line 876
    const/16 v1, 0x64

    .line 877
    .line 878
    if-le v0, v1, :cond_19

    .line 879
    .line 880
    invoke-virtual {p1, v7}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 881
    .line 882
    .line 883
    :cond_19
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 884
    .line 885
    .line 886
    move-result p1

    .line 887
    if-nez p1, :cond_21

    .line 888
    .line 889
    iput-wide v2, p0, Lij1;->n:J

    .line 890
    .line 891
    return v7

    .line 892
    :catchall_1
    move-exception v0

    .line 893
    move-object p0, v0

    .line 894
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 895
    throw p0

    .line 896
    :goto_9
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 897
    throw p0

    .line 898
    :pswitch_c
    iget v0, p1, Landroid/os/Message;->arg1:I

    .line 899
    .line 900
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 901
    .line 902
    check-cast p1, Lka0;

    .line 903
    .line 904
    iget-object v1, p0, Lij1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 905
    .line 906
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 907
    .line 908
    .line 909
    move-result-object v1

    .line 910
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 911
    .line 912
    .line 913
    move-result-object v1

    .line 914
    :cond_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 915
    .line 916
    .line 917
    move-result v2

    .line 918
    if-eqz v2, :cond_1b

    .line 919
    .line 920
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 921
    .line 922
    .line 923
    move-result-object v2

    .line 924
    check-cast v2, Lgf5;

    .line 925
    .line 926
    iget v3, v2, Lgf5;->k:I

    .line 927
    .line 928
    if-ne v3, v0, :cond_1a

    .line 929
    .line 930
    goto :goto_a

    .line 931
    :cond_1b
    move-object v2, v6

    .line 932
    :goto_a
    if-eqz v2, :cond_1d

    .line 933
    .line 934
    iget v0, p1, Lka0;->o:I

    .line 935
    .line 936
    const/16 v1, 0xd

    .line 937
    .line 938
    if-ne v0, v1, :cond_1c

    .line 939
    .line 940
    iget-object p0, p0, Lij1;->s:Lej1;

    .line 941
    .line 942
    new-instance v1, Lcom/google/android/gms/common/api/Status;

    .line 943
    .line 944
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 945
    .line 946
    .line 947
    sget p0, Llj1;->e:I

    .line 948
    .line 949
    invoke-static {v0}, Lka0;->b(I)Ljava/lang/String;

    .line 950
    .line 951
    .line 952
    move-result-object p0

    .line 953
    iget-object p1, p1, Lka0;->q:Ljava/lang/String;

    .line 954
    .line 955
    new-instance v0, Ljava/lang/StringBuilder;

    .line 956
    .line 957
    const-string v3, "Error resolution was canceled by the user, original error message: "

    .line 958
    .line 959
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 960
    .line 961
    .line 962
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 963
    .line 964
    .line 965
    const-string p0, ": "

    .line 966
    .line 967
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 968
    .line 969
    .line 970
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 971
    .line 972
    .line 973
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 974
    .line 975
    .line 976
    move-result-object p0

    .line 977
    invoke-direct {v1, v4, p0, v6, v6}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;Lka0;)V

    .line 978
    .line 979
    .line 980
    invoke-virtual {v2, v1}, Lgf5;->b(Lcom/google/android/gms/common/api/Status;)V

    .line 981
    .line 982
    .line 983
    return v7

    .line 984
    :cond_1c
    iget-object p0, v2, Lgf5;->g:Lve;

    .line 985
    .line 986
    invoke-static {p0, p1}, Lij1;->d(Lve;Lka0;)Lcom/google/android/gms/common/api/Status;

    .line 987
    .line 988
    .line 989
    move-result-object p0

    .line 990
    invoke-virtual {v2, p0}, Lgf5;->b(Lcom/google/android/gms/common/api/Status;)V

    .line 991
    .line 992
    .line 993
    return v7

    .line 994
    :cond_1d
    const-string p0, "Could not find API instance "

    .line 995
    .line 996
    const-string p1, " while trying to fail enqueued calls."

    .line 997
    .line 998
    invoke-static {v0, p0, p1}, Lb11;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 999
    .line 1000
    .line 1001
    move-result-object p0

    .line 1002
    new-instance p1, Ljava/lang/Exception;

    .line 1003
    .line 1004
    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    .line 1005
    .line 1006
    .line 1007
    const-string v0, "GoogleApiManager"

    .line 1008
    .line 1009
    invoke-static {v0, p0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1010
    .line 1011
    .line 1012
    return v7

    .line 1013
    :pswitch_d
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1014
    .line 1015
    check-cast p1, Lpf5;

    .line 1016
    .line 1017
    iget-object v0, p0, Lij1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1018
    .line 1019
    iget-object v1, p1, Lpf5;->c:Ldj1;

    .line 1020
    .line 1021
    iget-object v1, v1, Ldj1;->e:Lve;

    .line 1022
    .line 1023
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v0

    .line 1027
    check-cast v0, Lgf5;

    .line 1028
    .line 1029
    if-nez v0, :cond_1e

    .line 1030
    .line 1031
    iget-object v0, p1, Lpf5;->c:Ldj1;

    .line 1032
    .line 1033
    invoke-virtual {p0, v0}, Lij1;->e(Ldj1;)Lgf5;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v0

    .line 1037
    :cond_1e
    iget-object v1, v0, Lgf5;->f:Lme;

    .line 1038
    .line 1039
    invoke-interface {v1}, Lme;->i0()Z

    .line 1040
    .line 1041
    .line 1042
    move-result v1

    .line 1043
    if-eqz v1, :cond_1f

    .line 1044
    .line 1045
    iget-object p0, p0, Lij1;->v:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1046
    .line 1047
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1048
    .line 1049
    .line 1050
    move-result p0

    .line 1051
    iget v1, p1, Lpf5;->b:I

    .line 1052
    .line 1053
    if-eq p0, v1, :cond_1f

    .line 1054
    .line 1055
    iget-object p0, p1, Lpf5;->a:Lcg5;

    .line 1056
    .line 1057
    sget-object p1, Lij1;->C:Lcom/google/android/gms/common/api/Status;

    .line 1058
    .line 1059
    invoke-virtual {p0, p1}, Lcg5;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v0}, Lgf5;->o()V

    .line 1063
    .line 1064
    .line 1065
    return v7

    .line 1066
    :cond_1f
    iget-object p0, p1, Lpf5;->a:Lcg5;

    .line 1067
    .line 1068
    invoke-virtual {v0, p0}, Lgf5;->k(Lcg5;)V

    .line 1069
    .line 1070
    .line 1071
    return v7

    .line 1072
    :pswitch_e
    iget-object p0, p0, Lij1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1073
    .line 1074
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 1075
    .line 1076
    .line 1077
    move-result-object p0

    .line 1078
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 1079
    .line 1080
    .line 1081
    move-result-object p0

    .line 1082
    :goto_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 1083
    .line 1084
    .line 1085
    move-result p1

    .line 1086
    if-eqz p1, :cond_21

    .line 1087
    .line 1088
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1089
    .line 1090
    .line 1091
    move-result-object p1

    .line 1092
    check-cast p1, Lgf5;

    .line 1093
    .line 1094
    iget-object v0, p1, Lgf5;->q:Lij1;

    .line 1095
    .line 1096
    iget-object v0, v0, Lij1;->A:Lzw2;

    .line 1097
    .line 1098
    invoke-static {v0}, Lji2;->j(Landroid/os/Handler;)V

    .line 1099
    .line 1100
    .line 1101
    iput-object v6, p1, Lgf5;->o:Lka0;

    .line 1102
    .line 1103
    invoke-virtual {p1}, Lgf5;->j()V

    .line 1104
    .line 1105
    .line 1106
    goto :goto_b

    .line 1107
    :pswitch_f
    iget-object p0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1108
    .line 1109
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1110
    .line 1111
    .line 1112
    invoke-static {}, Lkf2;->k()V

    .line 1113
    .line 1114
    .line 1115
    return v5

    .line 1116
    :pswitch_10
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1117
    .line 1118
    check-cast p1, Ljava/lang/Boolean;

    .line 1119
    .line 1120
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1121
    .line 1122
    .line 1123
    move-result p1

    .line 1124
    if-eq v7, p1, :cond_20

    .line 1125
    .line 1126
    goto :goto_c

    .line 1127
    :cond_20
    const-wide/16 v2, 0x2710

    .line 1128
    .line 1129
    :goto_c
    iput-wide v2, p0, Lij1;->n:J

    .line 1130
    .line 1131
    iget-object p1, p0, Lij1;->A:Lzw2;

    .line 1132
    .line 1133
    const/16 v0, 0xc

    .line 1134
    .line 1135
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    .line 1136
    .line 1137
    .line 1138
    iget-object p1, p0, Lij1;->w:Ljava/util/concurrent/ConcurrentHashMap;

    .line 1139
    .line 1140
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 1141
    .line 1142
    .line 1143
    move-result-object p1

    .line 1144
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1145
    .line 1146
    .line 1147
    move-result-object p1

    .line 1148
    :goto_d
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 1149
    .line 1150
    .line 1151
    move-result v1

    .line 1152
    if-eqz v1, :cond_21

    .line 1153
    .line 1154
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v1

    .line 1158
    check-cast v1, Lve;

    .line 1159
    .line 1160
    iget-object v2, p0, Lij1;->A:Lzw2;

    .line 1161
    .line 1162
    invoke-virtual {v2, v0, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v1

    .line 1166
    iget-wide v3, p0, Lij1;->n:J

    .line 1167
    .line 1168
    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1169
    .line 1170
    .line 1171
    goto :goto_d

    .line 1172
    :cond_21
    :goto_e
    return v7

    .line 1173
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_d
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_d
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
