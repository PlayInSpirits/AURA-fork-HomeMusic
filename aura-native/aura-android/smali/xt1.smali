.class public final Lxt1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Lxt1;

.field public static volatile b:Lyr1;

.field public static volatile c:Les1;

.field public static volatile d:Les1;

.field public static volatile e:Lzr1;

.field public static volatile f:Lyr1;

.field public static volatile g:Lzr1;

.field public static volatile h:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lxt1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxt1;->a:Lxt1;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final appVersion()Ljava/lang/String;
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string p0, "1.14.7"

    .line 2
    .line 3
    return-object p0
.end method

.method public final isEmbedded()Z
    .locals 0
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final onUnauthorized()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    sget-object p0, Lio1;->b:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v0, Lu6;

    .line 4
    .line 5
    const/16 v1, 0x10

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lu6;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final pauseNative()V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    sget-object p0, Lio1;->b:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v0, Lu6;

    .line 4
    .line 5
    const/16 v1, 0xf

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lu6;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final play(Ljava/lang/String;I)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const/4 p0, 0x0

    .line 2
    :try_start_0
    sget-object v0, Lrr1;->c:Lnk1;

    .line 3
    .line 4
    const-class v1, [Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {v0, v1, p1}, Lnk1;->d(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [Ljava/lang/String;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, Lti;->r0([Ljava/lang/Object;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    goto :goto_1

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object p1, p0

    .line 22
    goto :goto_1

    .line 23
    :goto_0
    new-instance v0, Ls14;

    .line 24
    .line 25
    invoke-direct {v0, p1}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object p1, v0

    .line 29
    :goto_1
    nop

    .line 30
    instance-of v0, p1, Ls14;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    move-object p0, p1

    .line 36
    :goto_2
    check-cast p0, Ljava/util/List;

    .line 37
    .line 38
    if-eqz p0, :cond_3

    .line 39
    .line 40
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_2
    sget-object p1, Lio1;->b:Landroid/os/Handler;

    .line 48
    .line 49
    new-instance v0, Lvt1;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-direct {v0, p2, v1, p0}, Lvt1;-><init>(IILjava/util/List;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 56
    .line 57
    .line 58
    :cond_3
    :goto_3
    return-void
.end method

.method public final playQueue(Ljava/lang/String;I)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const/4 p0, 0x0

    .line 2
    :try_start_0
    sget-object v0, Lrr1;->c:Lnk1;

    .line 3
    .line 4
    const-class v1, [Lcom/eddyizm/tempus/homemusic/HubTracks$Item;

    .line 5
    .line 6
    invoke-virtual {v0, v1, p1}, Lnk1;->d(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    check-cast p1, [Lcom/eddyizm/tempus/homemusic/HubTracks$Item;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-static {p1}, Lti;->r0([Ljava/lang/Object;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    goto :goto_1

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object p1, p0

    .line 22
    goto :goto_1

    .line 23
    :goto_0
    new-instance v0, Ls14;

    .line 24
    .line 25
    invoke-direct {v0, p1}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 26
    .line 27
    .line 28
    move-object p1, v0

    .line 29
    :goto_1
    nop

    .line 30
    instance-of v0, p1, Ls14;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    move-object p0, p1

    .line 36
    :goto_2
    check-cast p0, Ljava/util/List;

    .line 37
    .line 38
    if-eqz p0, :cond_3

    .line 39
    .line 40
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    goto :goto_3

    .line 47
    :cond_2
    sget-object p1, Lio1;->b:Landroid/os/Handler;

    .line 48
    .line 49
    new-instance v0, Lvt1;

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    invoke-direct {v0, p2, v1, p0}, Lvt1;-><init>(IILjava/util/List;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 56
    .line 57
    .line 58
    :cond_3
    :goto_3
    return-void
.end method

.method public final playWave(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    :try_start_0
    sget-object p0, Lrr1;->c:Lnk1;

    .line 2
    .line 3
    const-class v0, Lcom/eddyizm/tempus/homemusic/WaveOut;

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Lnk1;->d(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lcom/eddyizm/tempus/homemusic/WaveOut;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    new-instance p1, Ls14;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Ls14;-><init>(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    move-object p0, p1

    .line 19
    :goto_0
    nop

    .line 20
    instance-of p1, p0, Ls14;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    :cond_0
    check-cast p0, Lcom/eddyizm/tempus/homemusic/WaveOut;

    .line 26
    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    sget-object p1, Lio1;->b:Landroid/os/Handler;

    .line 31
    .line 32
    new-instance v0, Lqa1;

    .line 33
    .line 34
    const/16 v1, 0xf

    .line 35
    .line 36
    invoke-direct {v0, v1, p0}, Lqa1;-><init>(ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final shareText(Ljava/lang/String;)V
    .locals 2
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-static {p1}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object p0, Lio1;->b:Landroid/os/Handler;

    .line 11
    .line 12
    new-instance v0, Lkt1;

    .line 13
    .line 14
    const/4 v1, 0x3

    .line 15
    invoke-direct {v0, v1, p1}, Lkt1;-><init>(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    :cond_1
    :goto_0
    return-void
.end method

.method public final webPlayer(Z)V
    .locals 1
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    sget-object p0, Lio1;->b:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v0, Lwt1;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Lwt1;-><init>(Z)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method
