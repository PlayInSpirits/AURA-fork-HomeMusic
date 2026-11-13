.class public final Ldefpackage/ns3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/xs;


# instance fields
.field public final synthetic n:I

.field public o:Ljava/lang/Object;

.field public p:Ljava/lang/Object;

.field public q:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    iput p1, p0, Ldefpackage/ns3;->n:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Ldefpackage/h5;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p1, v0}, Ldefpackage/h5;-><init>(I)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    new-instance v0, Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Ldefpackage/ns3;->o:Ljava/lang/Object;

    .line 25
    .line 26
    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Ldefpackage/ns3;->p:Ljava/lang/Object;

    .line 32
    .line 33
    new-instance v0, Ldefpackage/g5;

    .line 34
    .line 35
    const/4 v1, 0x1

    .line 36
    invoke-direct {v0, v1, p0}, Ldefpackage/g5;-><init>(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_1
    sget-object p1, Ldefpackage/kf2;->o:Ldefpackage/kf2;

    .line 48
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    new-instance v0, Ljava/util/HashSet;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Ldefpackage/ns3;->o:Ljava/lang/Object;

    .line 58
    .line 59
    iput-object p1, p0, Ldefpackage/ns3;->p:Ljava/lang/Object;

    .line 60
    .line 61
    return-void

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Ldefpackage/ns3;->n:I

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, Ldefpackage/ns3;->o:Ljava/lang/Object;

    .line 68
    new-instance p1, Landroid/util/LruCache;

    const/16 v0, 0x14

    invoke-direct {p1, v0}, Landroid/util/LruCache;-><init>(I)V

    iput-object p1, p0, Ldefpackage/ns3;->p:Ljava/lang/Object;

    const/4 p1, 0x2

    .line 69
    invoke-static {p1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/database/AppDatabase;)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Ldefpackage/ns3;->n:I

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    new-instance v0, Ldefpackage/i80;

    const/16 v1, 0x16

    .line 73
    invoke-direct {v0, v1}, Ldefpackage/i80;-><init>(I)V

    .line 74
    iput-object v0, p0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 75
    iput-object p1, p0, Ldefpackage/ns3;->o:Ljava/lang/Object;

    .line 76
    new-instance p1, Ldefpackage/q20;

    const/4 v0, 0x7

    invoke-direct {p1, v0, p0}, Ldefpackage/q20;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Ldefpackage/ns3;->p:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 70
    iput p4, p0, Ldefpackage/ns3;->n:I

    iput-object p1, p0, Ldefpackage/ns3;->o:Ljava/lang/Object;

    iput-object p2, p0, Ldefpackage/ns3;->p:Ljava/lang/Object;

    iput-object p3, p0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    const/16 v0, 0x9

    iput v0, p0, Ldefpackage/ns3;->n:I

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ldefpackage/c12;

    const/16 v1, 0xb

    .line 64
    invoke-direct {v0, v1}, Ldefpackage/c12;-><init>(I)V

    .line 65
    iput-object v0, p0, Ldefpackage/ns3;->p:Ljava/lang/Object;

    iput-object v0, p0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    iput-object p1, p0, Ldefpackage/ns3;->o:Ljava/lang/Object;

    return-void
.end method

.method public static d()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedClassVersionError;

    .line 9
    .line 10
    const-string v1, "This function can only be used for API Level < 29."

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedClassVersionError;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v0
.end method


# virtual methods
.method public declared-synchronized a(Ldefpackage/f42;Ldefpackage/o11;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ldefpackage/i5;

    .line 3
    .line 4
    iget-object v1, p0, Ldefpackage/ns3;->p:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v1, Ljava/lang/ref/ReferenceQueue;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2, v1}, Ldefpackage/i5;-><init>(Ldefpackage/f42;Ldefpackage/o11;Ljava/lang/ref/ReferenceQueue;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Ldefpackage/ns3;->o:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p2, Ljava/util/HashMap;

    .line 14
    .line 15
    invoke-virtual {p2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Ldefpackage/i5;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    const/4 p2, 0x0

    .line 24
    iput-object p2, p1, Ldefpackage/i5;->c:Ldefpackage/q04;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    :cond_0
    monitor-exit p0

    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw p1
.end method

.method public b(Ldefpackage/i5;)V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ldefpackage/ns3;->o:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/HashMap;

    .line 5
    .line 6
    iget-object v1, p1, Ldefpackage/i5;->a:Ldefpackage/f42;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p1, Ldefpackage/i5;->b:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v2, p1, Ldefpackage/i5;->c:Ldefpackage/q04;

    .line 16
    .line 17
    if-nez v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    new-instance v1, Ldefpackage/o11;

    .line 22
    .line 23
    iget-object v5, p1, Ldefpackage/i5;->a:Ldefpackage/f42;

    .line 24
    .line 25
    iget-object v0, p0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 26
    .line 27
    move-object v6, v0

    .line 28
    check-cast v6, Ldefpackage/i11;

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-direct/range {v1 .. v6}, Ldefpackage/o11;-><init>(Ldefpackage/q04;ZZLdefpackage/f42;Ldefpackage/i11;)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Ldefpackage/i11;

    .line 38
    .line 39
    iget-object p1, p1, Ldefpackage/i5;->a:Ldefpackage/f42;

    .line 40
    .line 41
    invoke-virtual {p0, p1, v1}, Ldefpackage/i11;->e(Ldefpackage/f42;Ldefpackage/o11;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catchall_0
    move-exception v0

    .line 46
    move-object p1, v0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    :goto_0
    :try_start_1
    monitor-exit p0

    .line 49
    return-void

    .line 50
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    throw p1
.end method

.method public c()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/ns3;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ldefpackage/s24;

    .line 4
    .line 5
    new-instance v1, Ldefpackage/ms3;

    .line 6
    .line 7
    invoke-direct {v1, p0}, Ldefpackage/ms3;-><init>(Ldefpackage/ns3;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static {v0, p0, v2, v1}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ljava/util/List;

    .line 17
    .line 18
    return-object p0
.end method

.method public e(Landroid/media/MediaCodec;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/ns3;->o:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Landroid/media/LoudnessCodecController;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-static {p0, p1}, Ldefpackage/vk;->f(Landroid/media/LoudnessCodecController;Landroid/media/MediaCodec;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public f(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/media/LoudnessCodecController;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0}, Ldefpackage/vk;->e(Landroid/media/LoudnessCodecController;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    new-instance v0, Ldefpackage/jf2;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Ldefpackage/jf2;-><init>(Ldefpackage/ns3;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0}, Ldefpackage/vk;->a(ILdefpackage/jf2;)Landroid/media/LoudnessCodecController;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object p0, p0, Ldefpackage/ns3;->o:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Ljava/util/HashSet;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Landroid/media/MediaCodec;

    .line 43
    .line 44
    invoke-static {p1, v0}, Ldefpackage/vk;->i(Landroid/media/LoudnessCodecController;Landroid/media/MediaCodec;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    return-void
.end method

.method public g(Landroid/net/Uri;)Ldefpackage/ic2;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/ns3;->p:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroid/util/LruCache;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroid/graphics/Bitmap;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    new-instance p0, Ldefpackage/mw1;

    .line 17
    .line 18
    invoke-direct {p0, v0}, Ldefpackage/mw1;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    new-instance v0, Ldefpackage/lb4;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Ljava/util/concurrent/ExecutorService;

    .line 30
    .line 31
    new-instance v2, Ldefpackage/qo2;

    .line 32
    .line 33
    const/16 v3, 0x10

    .line 34
    .line 35
    invoke-direct {v2, p0, p1, v0, v3}, Ldefpackage/qo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 39
    .line 40
    .line 41
    return-object v0
.end method

.method public h(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/c12;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldefpackage/c12;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ldefpackage/c12;

    .line 11
    .line 12
    iput-object v0, v1, Ldefpackage/c12;->q:Ljava/lang/Object;

    .line 13
    .line 14
    iput-object v0, p0, Ldefpackage/ns3;->q:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object p1, v0, Ldefpackage/c12;->p:Ljava/lang/Object;

    .line 17
    .line 18
    iput-object p2, v0, Ldefpackage/c12;->o:Ljava/lang/Object;

    .line 19
    .line 20
    return-void
.end method

.method public j([B)Ldefpackage/ic2;
    .locals 2

    .line 1
    const-string p0, "BitmapFactory returned null for "

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    :try_start_0
    array-length v0, p1

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-static {p1, v1, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Ljava/io/IOException;

    .line 15
    .line 16
    array-length p1, p1

    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p0, "B"

    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    new-instance p0, Ldefpackage/lw1;

    .line 38
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, Ldefpackage/u0;->m(Ljava/lang/Throwable;)Z

    .line 43
    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_0
    new-instance p0, Ldefpackage/mw1;

    .line 47
    .line 48
    invoke-direct {p0, v0}, Ldefpackage/mw1;-><init>(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    return-object p0

    .line 52
    :catch_0
    move-exception p0

    .line 53
    const-string p1, "SyncBitmapLoader"

    .line 54
    .line 55
    const-string v0, "decodeBitmap failed"

    .line 56
    .line 57
    invoke-static {p1, v0, p0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 58
    .line 59
    .line 60
    new-instance p1, Ldefpackage/lw1;

    .line 61
    .line 62
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, p0}, Ldefpackage/u0;->m(Ljava/lang/Throwable;)Z

    .line 66
    .line 67
    .line 68
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget v0, p0, Ldefpackage/ns3;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const/16 v1, 0x20

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Ldefpackage/ns3;->o:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 v1, 0x7b

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Ldefpackage/ns3;->p:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Ldefpackage/c12;

    .line 33
    .line 34
    iget-object p0, p0, Ldefpackage/c12;->q:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Ldefpackage/c12;

    .line 37
    .line 38
    const-string v1, ""

    .line 39
    .line 40
    :goto_0
    if-eqz p0, :cond_2

    .line 41
    .line 42
    iget-object v2, p0, Ldefpackage/c12;->p:Ljava/lang/Object;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, Ldefpackage/c12;->o:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v1, Ljava/lang/String;

    .line 50
    .line 51
    if-eqz v1, :cond_0

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const/16 v1, 0x3d

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    :cond_0
    if-eqz v2, :cond_1

    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_1

    .line 72
    .line 73
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {v1}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    add-int/lit8 v2, v2, -0x1

    .line 86
    .line 87
    const/4 v3, 0x1

    .line 88
    invoke-virtual {v0, v1, v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    :goto_1
    iget-object p0, p0, Ldefpackage/c12;->q:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p0, Ldefpackage/c12;

    .line 98
    .line 99
    const-string v1, ", "

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    const/16 p0, 0x7d

    .line 103
    .line 104
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method
