.class public final Lfw2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final g:Lgw2;


# instance fields
.field public final a:Ldm0;

.field public final b:Lgn2;

.field public final c:Lyp4;

.field public final d:Lbw2;

.field public final e:Lbw2;

.field public f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lgw2;

    .line 2
    .line 3
    invoke-direct {v0}, Lgw2;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lfw2;->g:Lgw2;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ldm0;Lgn2;Lbw2;Lbw2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfw2;->a:Ldm0;

    .line 5
    .line 6
    iput-object p2, p0, Lfw2;->b:Lgn2;

    .line 7
    .line 8
    iput-object p3, p0, Lfw2;->d:Lbw2;

    .line 9
    .line 10
    iput-object p4, p0, Lfw2;->e:Lbw2;

    .line 11
    .line 12
    sget-object p1, Lfw2;->g:Lgw2;

    .line 13
    .line 14
    monitor-enter p1

    .line 15
    :try_start_0
    iget-object p2, p1, Lgw2;->b:Landroid/os/HandlerThread;

    .line 16
    .line 17
    const/4 p3, 0x1

    .line 18
    if-nez p2, :cond_1

    .line 19
    .line 20
    iget p2, p1, Lgw2;->c:I

    .line 21
    .line 22
    if-nez p2, :cond_0

    .line 23
    .line 24
    move p2, p3

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p2, 0x0

    .line 27
    :goto_0
    invoke-static {p2}, Lrr2;->w(Z)V

    .line 28
    .line 29
    .line 30
    new-instance p2, Landroid/os/HandlerThread;

    .line 31
    .line 32
    const-string p4, "ExoPlayer:MetadataRetriever"

    .line 33
    .line 34
    invoke-direct {p2, p4}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iput-object p2, p1, Lgw2;->b:Landroid/os/HandlerThread;

    .line 38
    .line 39
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    goto :goto_2

    .line 45
    :cond_1
    :goto_1
    iget p2, p1, Lgw2;->c:I

    .line 46
    .line 47
    add-int/2addr p2, p3

    .line 48
    iput p2, p1, Lgw2;->c:I

    .line 49
    .line 50
    iget-object p2, p1, Lgw2;->b:Landroid/os/HandlerThread;

    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 56
    .line 57
    .line 58
    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    monitor-exit p1

    .line 60
    new-instance p1, Lew2;

    .line 61
    .line 62
    invoke-direct {p1, p0}, Lew2;-><init>(Lfw2;)V

    .line 63
    .line 64
    .line 65
    new-instance p3, Lyp4;

    .line 66
    .line 67
    new-instance p4, Landroid/os/Handler;

    .line 68
    .line 69
    invoke-direct {p4, p2, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 70
    .line 71
    .line 72
    invoke-direct {p3, p4}, Lyp4;-><init>(Landroid/os/Handler;)V

    .line 73
    .line 74
    .line 75
    iput-object p3, p0, Lfw2;->c:Lyp4;

    .line 76
    .line 77
    return-void

    .line 78
    :goto_2
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 79
    throw p0
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lfw2;->f:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lfw2;->f:Z

    .line 8
    .line 9
    iget-object v0, p0, Lfw2;->c:Lyp4;

    .line 10
    .line 11
    const/4 v1, 0x4

    .line 12
    invoke-virtual {v0, v1}, Lyp4;->a(I)Lxp4;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lxp4;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 25
    throw v0
.end method
