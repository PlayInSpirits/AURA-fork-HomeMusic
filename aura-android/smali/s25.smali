.class public final Ls25;
.super Lqq2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final E:Landroid/content/IntentFilter;

.field public static final F:J

.field public static final G:J


# instance fields
.field public volatile A:Z

.field public volatile B:Z

.field public volatile C:Z

.field public final D:Lwu4;

.field public final v:Lf25;

.field public w:Lhd5;

.field public final x:Ljava/util/concurrent/ExecutorService;

.field public final y:Landroid/os/Handler;

.field public volatile z:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/IntentFilter;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "com.eddyizm.tempus.UPNP"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addCategory(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Ls25;->E:Landroid/content/IntentFilter;

    .line 12
    .line 13
    const-wide/16 v0, 0x2710

    .line 14
    .line 15
    sput-wide v0, Ls25;->F:J

    .line 16
    .line 17
    const-wide/32 v0, 0x1d4c0

    .line 18
    .line 19
    .line 20
    sput-wide v0, Ls25;->G:J

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/service/MediaService;Lf25;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lqq2;-><init>(Landroid/content/Context;Lom1;)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Ls25;->v:Lf25;

    .line 6
    .line 7
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Ls25;->x:Ljava/util/concurrent/ExecutorService;

    .line 12
    .line 13
    new-instance p1, Landroid/os/Handler;

    .line 14
    .line 15
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Ls25;->y:Landroid/os/Handler;

    .line 23
    .line 24
    sget-object p1, Lv01;->n:Lv01;

    .line 25
    .line 26
    iput-object p1, p0, Ls25;->z:Ljava/util/Map;

    .line 27
    .line 28
    new-instance p1, Lwu4;

    .line 29
    .line 30
    const/4 p2, 0x3

    .line 31
    invoke-direct {p1, p2, p0}, Lwu4;-><init>(ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Ls25;->D:Lwu4;

    .line 35
    .line 36
    return-void
.end method

.method public static final h(Ls25;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    const/4 v2, 0x3

    .line 4
    if-ge v1, v2, :cond_5

    .line 5
    .line 6
    iget-boolean v2, p0, Ls25;->A:Z

    .line 7
    .line 8
    if-nez v2, :cond_0

    .line 9
    .line 10
    goto :goto_2

    .line 11
    :cond_0
    :try_start_0
    iget-object v2, p0, Ls25;->v:Lf25;

    .line 12
    .line 13
    invoke-static {v2}, Lf25;->a(Lf25;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_3

    .line 22
    .line 23
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    iget-object v4, p0, Ls25;->z:Ljava/util/Map;

    .line 26
    .line 27
    invoke-direct {v3, v4}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    check-cast v4, Lg25;

    .line 45
    .line 46
    iget-object v5, v4, Lg25;->a:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v5}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-eqz v6, :cond_1

    .line 53
    .line 54
    iget-object v5, v4, Lg25;->f:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v6, v4, Lg25;->b:Ljava/lang/String;

    .line 57
    .line 58
    const-string v7, "|"

    .line 59
    .line 60
    invoke-static {v5, v7, v6}, Lb11;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    :cond_1
    invoke-virtual {v3, v5, v4}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    iput-object v3, p0, Ls25;->z:Ljava/util/Map;

    .line 69
    .line 70
    :cond_3
    iget-object v2, p0, Ls25;->z:Ljava/util/Map;

    .line 71
    .line 72
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-nez v2, :cond_4

    .line 77
    .line 78
    iget-object v2, p0, Ls25;->y:Landroid/os/Handler;

    .line 79
    .line 80
    new-instance v3, Lr25;

    .line 81
    .line 82
    invoke-direct {v3, p0, v0}, Lr25;-><init>(Ls25;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 86
    .line 87
    .line 88
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :catch_0
    move-exception p0

    .line 92
    const-string v0, "UpnpRouteProvider"

    .line 93
    .line 94
    const-string v1, "discovery failed"

    .line 95
    .line 96
    invoke-static {v0, v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 97
    .line 98
    .line 99
    :cond_5
    :goto_2
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Loq2;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ls25;->z:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, Lg25;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return-object p0

    .line 16
    :cond_0
    new-instance v0, Lwo2;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, v1, p0, p1}, Lwo2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public final e(Lup2;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    invoke-virtual {p1}, Lup2;->a()V

    .line 6
    .line 7
    .line 8
    iget-object v2, p1, Lup2;->b:Lrq2;

    .line 9
    .line 10
    if-eqz v2, :cond_1

    .line 11
    .line 12
    invoke-virtual {v2}, Lrq2;->a()V

    .line 13
    .line 14
    .line 15
    iget-object v3, v2, Lrq2;->b:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    move v4, v0

    .line 22
    :goto_0
    if-ge v4, v3, :cond_1

    .line 23
    .line 24
    iget-object v5, v2, Lrq2;->b:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    check-cast v5, Ljava/lang/String;

    .line 31
    .line 32
    const-string v6, "com.eddyizm.tempus.UPNP"

    .line 33
    .line 34
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_0

    .line 39
    .line 40
    move v2, v1

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move v2, v0

    .line 46
    :goto_1
    if-eqz v2, :cond_2

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    invoke-virtual {p1}, Lup2;->b()Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-ne p1, v1, :cond_2

    .line 55
    .line 56
    move v0, v1

    .line 57
    :cond_2
    iget-boolean p1, p0, Ls25;->A:Z

    .line 58
    .line 59
    if-ne v2, p1, :cond_3

    .line 60
    .line 61
    iget-boolean p1, p0, Ls25;->B:Z

    .line 62
    .line 63
    if-ne v0, p1, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    iput-boolean v2, p0, Ls25;->A:Z

    .line 67
    .line 68
    iput-boolean v0, p0, Ls25;->B:Z

    .line 69
    .line 70
    iget-object p1, p0, Ls25;->y:Landroid/os/Handler;

    .line 71
    .line 72
    iget-object v0, p0, Ls25;->D:Lwu4;

    .line 73
    .line 74
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 75
    .line 76
    .line 77
    if-eqz v2, :cond_4

    .line 78
    .line 79
    iget-object p1, p0, Ls25;->y:Landroid/os/Handler;

    .line 80
    .line 81
    iget-object p0, p0, Ls25;->D:Lwu4;

    .line 82
    .line 83
    invoke-virtual {p1, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 84
    .line 85
    .line 86
    :cond_4
    :goto_2
    return-void
.end method
