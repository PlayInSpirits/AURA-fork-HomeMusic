.class public final Lvs3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final b:Ljava/util/concurrent/ExecutorService;


# instance fields
.field public final a:Lns3;


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
    sput-object v0, Lvs3;->b:Ljava/util/concurrent/ExecutorService;

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lcom/eddyizm/tempus/database/AppDatabase;->y()Lcom/eddyizm/tempus/database/AppDatabase;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Lcom/eddyizm/tempus/database/AppDatabase;->E()Lns3;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lvs3;->a:Lns3;

    .line 13
    .line 14
    return-void
.end method

.method public static d(Ljava/util/List;Ljava/lang/String;J)V
    .locals 8

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Saving play queue to server - Items: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ", Current: "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v1, "QueueRepository"

    .line 28
    .line 29
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    invoke-static {v0}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Lpn4;->b()Lrm3;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    const-string v1, "BookmarksClient"

    .line 45
    .line 46
    const-string v2, "savePlayQueue()"

    .line 47
    .line 48
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    iget-object v1, v0, Lrm3;->o:Ljava/lang/Object;

    .line 52
    .line 53
    move-object v2, v1

    .line 54
    check-cast v2, Lmt;

    .line 55
    .line 56
    iget-object v0, v0, Lrm3;->n:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Lpn4;

    .line 59
    .line 60
    invoke-virtual {v0}, Lpn4;->f()Ljava/util/HashMap;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    move-object v4, p0

    .line 65
    move-object v5, p1

    .line 66
    move-wide v6, p2

    .line 67
    invoke-interface/range {v2 .. v7}, Lmt;->e(Ljava/util/Map;Ljava/util/List;Ljava/lang/String;J)Lretrofit2/Call;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    new-instance p1, Lhh3;

    .line 72
    .line 73
    const/16 p2, 0x8

    .line 74
    .line 75
    invoke-direct {p1, p2}, Lhh3;-><init>(I)V

    .line 76
    .line 77
    .line 78
    invoke-interface {p0, p1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method


# virtual methods
.method public final a()Lcom/eddyizm/tempus/model/Queue;
    .locals 2

    .line 1
    new-instance v0, Llg1;

    .line 2
    .line 3
    iget-object p0, p0, Lvs3;->a:Lns3;

    .line 4
    .line 5
    const/16 v1, 0x16

    .line 6
    .line 7
    invoke-direct {v0, v1, p0}, Llg1;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance p0, Ljava/lang/Thread;

    .line 11
    .line 12
    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Thread;->join()V

    .line 19
    .line 20
    .line 21
    iget-object p0, v0, Llg1;->p:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Lcom/eddyizm/tempus/model/Queue;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    return-object p0

    .line 26
    :catch_0
    move-exception p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    return-object p0
.end method

.method public final b()Ljava/util/List;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Llg1;

    .line 7
    .line 8
    iget-object p0, p0, Lvs3;->a:Lns3;

    .line 9
    .line 10
    const/16 v2, 0x17

    .line 11
    .line 12
    invoke-direct {v1, v2, p0}, Llg1;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    new-instance p0, Ljava/lang/Thread;

    .line 16
    .line 17
    invoke-direct {p0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 21
    .line 22
    .line 23
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Thread;->join()V

    .line 24
    .line 25
    .line 26
    iget-object p0, v1, Llg1;->p:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    new-instance v1, Lbi2;

    .line 35
    .line 36
    const/16 v2, 0x1d

    .line 37
    .line 38
    invoke-direct {v1, v2}, Lbi2;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p0, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-interface {p0, v1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    .line 55
    return-object p0

    .line 56
    :catch_0
    move-exception p0

    .line 57
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 58
    .line 59
    .line 60
    return-object v0
.end method

.method public final c(Ljava/util/List;ZI)V
    .locals 1

    .line 1
    new-instance v0, Lts3;

    .line 2
    .line 3
    invoke-direct {v0, p0, p3, p2, p1}, Lts3;-><init>(Lvs3;IZLjava/util/List;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Lvs3;->b:Ljava/util/concurrent/ExecutorService;

    .line 7
    .line 8
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
