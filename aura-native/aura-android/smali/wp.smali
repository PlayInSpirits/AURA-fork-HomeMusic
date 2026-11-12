.class public final Lwp;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:I

.field public final synthetic b:Lcom/eddyizm/tempus/service/MediaService;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/service/MediaService;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lwp;->b:Lcom/eddyizm/tempus/service/MediaService;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Le03;->d()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, Lwp;->a:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onCapabilitiesChanged(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lwp;->b:Lcom/eddyizm/tempus/service/MediaService;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/eddyizm/tempus/service/MediaService;->B:Landroid/os/Handler;

    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {}, Ljp1;->a()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    sget-object v2, Ljp1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Ljp1;->a()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    sget-object v3, Le03;->a:Ljava/util/regex/Pattern;

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    invoke-virtual {p2, v3}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    const/4 v5, 0x0

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    move p2, v3

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {p2, v5}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    move p2, v5

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    const/4 p2, -0x2

    .line 46
    :goto_0
    iget v4, p0, Lwp;->a:I

    .line 47
    .line 48
    if-ne p2, v4, :cond_3

    .line 49
    .line 50
    if-eq v2, p1, :cond_2

    .line 51
    .line 52
    new-instance p0, Lsp;

    .line 53
    .line 54
    invoke-direct {p0, v0, v3}, Lsp;-><init>(Lcom/eddyizm/tempus/service/MediaService;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 58
    .line 59
    .line 60
    :cond_2
    return-void

    .line 61
    :cond_3
    iput p2, p0, Lwp;->a:I

    .line 62
    .line 63
    if-eq p2, v3, :cond_4

    .line 64
    .line 65
    if-nez p2, :cond_5

    .line 66
    .line 67
    :cond_4
    move v5, v3

    .line 68
    :cond_5
    if-eqz v5, :cond_6

    .line 69
    .line 70
    sget-object p0, Le03;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 71
    .line 72
    new-instance p1, Ld03;

    .line 73
    .line 74
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 75
    .line 76
    .line 77
    move-result-wide v6

    .line 78
    invoke-direct {p1, p2, v6, v7}, Ld03;-><init>(IJ)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_6
    new-instance p0, Lpm;

    .line 85
    .line 86
    invoke-direct {p0, v0, v5, v3}, Lpm;-><init>(Ljava/lang/Object;ZI)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 90
    .line 91
    .line 92
    return-void
.end method
