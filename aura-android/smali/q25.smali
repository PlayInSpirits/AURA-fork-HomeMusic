.class public final Lq25;
.super Lqe4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final P:J = 0xfa0L

.field public static final Q:Ljava/util/Set;

.field public static final R:J

.field public static final S:J

.field public static final T:J

.field public static final U:Lmi3;


# instance fields
.field public volatile A:J

.field public volatile B:J

.field public volatile C:Z

.field public volatile D:Ljava/lang/String;

.field public volatile E:J

.field public volatile F:J

.field public final G:Ljava/util/concurrent/atomic/AtomicInteger;

.field public volatile H:Ljava/lang/Long;

.field public volatile I:Landroidx/media3/common/PlaybackException;

.field public volatile J:Z

.field public volatile K:I

.field public volatile L:J

.field public volatile M:Z

.field public N:J

.field public final O:Lwu4;

.field public final j:Lf25;

.field public final k:Lg25;

.field public final l:Lmx2;

.field public final m:Lif1;

.field public final n:Landroid/os/Handler;

.field public final o:Landroid/os/PowerManager$WakeLock;

.field public volatile p:Ljava/util/List;

.field public volatile q:I

.field public volatile r:Z

.field public volatile s:I

.field public volatile t:J

.field public volatile u:J

.field public volatile v:Z

.field public volatile w:Ljava/lang/String;

.field public volatile x:I

.field public volatile y:I

.field public volatile z:J


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    const-string v0, "STOPPED"

    .line 2
    .line 3
    const-string v1, "NO_MEDIA_PRESENT"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lti;->t0([Ljava/lang/Object;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lq25;->Q:Ljava/util/Set;

    .line 14
    .line 15
    const-wide/16 v0, 0x2710

    .line 16
    .line 17
    sput-wide v0, Lq25;->R:J

    .line 18
    .line 19
    const-wide/16 v0, 0x7530

    .line 20
    .line 21
    sput-wide v0, Lq25;->S:J

    .line 22
    .line 23
    const-wide/16 v0, 0x1388

    .line 24
    .line 25
    sput-wide v0, Lq25;->T:J

    .line 26
    .line 27
    new-instance v0, Landroid/util/SparseBooleanArray;

    .line 28
    .line 29
    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 30
    .line 31
    .line 32
    const/16 v1, 0x11

    .line 33
    .line 34
    new-array v1, v1, [I

    .line 35
    .line 36
    fill-array-data v1, :array_0

    .line 37
    .line 38
    .line 39
    array-length v2, v1

    .line 40
    const/4 v3, 0x0

    .line 41
    move v4, v3

    .line 42
    :goto_0
    const/4 v5, 0x1

    .line 43
    if-ge v4, v2, :cond_0

    .line 44
    .line 45
    aget v6, v1, v4

    .line 46
    .line 47
    const/4 v7, 0x0

    .line 48
    xor-int/2addr v7, v5

    .line 49
    invoke-static {v7}, Lrr2;->w(Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v6, v5}, Landroid/util/SparseBooleanArray;->append(IZ)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v4, v4, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    new-instance v1, Lmi3;

    .line 59
    .line 60
    xor-int/lit8 v2, v3, 0x1

    .line 61
    .line 62
    invoke-static {v2}, Lrr2;->w(Z)V

    .line 63
    .line 64
    .line 65
    new-instance v2, Lw71;

    .line 66
    .line 67
    invoke-direct {v2, v0}, Lw71;-><init>(Landroid/util/SparseBooleanArray;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v1, v2}, Lmi3;-><init>(Lw71;)V

    .line 71
    .line 72
    .line 73
    sput-object v1, Lq25;->U:Lmi3;

    .line 74
    .line 75
    return-void

    .line 76
    nop

    .line 77
    :array_0
    .array-data 4
        0x1
        0x2
        0x3
        0x4
        0x5
        0x9
        0x8
        0x7
        0x6
        0xa
        0x1f
        0x14
        0x11
        0x10
        0x12
        0x1e
        0x20
    .end array-data
.end method

.method public constructor <init>(Lf25;Lg25;Landroid/os/Looper;Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lwr1;->M(Ljava/util/concurrent/ExecutorService;)Lmx2;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lo54;

    .line 10
    .line 11
    const/16 v2, 0x17

    .line 12
    .line 13
    invoke-direct {v1, v2}, Lo54;-><init>(I)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p3}, Lqe4;-><init>(Landroid/os/Looper;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lq25;->j:Lf25;

    .line 20
    .line 21
    iput-object p2, p0, Lq25;->k:Lg25;

    .line 22
    .line 23
    iput-object v0, p0, Lq25;->l:Lmx2;

    .line 24
    .line 25
    iput-object v1, p0, Lq25;->m:Lif1;

    .line 26
    .line 27
    new-instance p1, Landroid/os/Handler;

    .line 28
    .line 29
    invoke-direct {p1, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lq25;->n:Landroid/os/Handler;

    .line 33
    .line 34
    const-string p1, "power"

    .line 35
    .line 36
    invoke-virtual {p4, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    instance-of p2, p1, Landroid/os/PowerManager;

    .line 41
    .line 42
    const/4 p3, 0x0

    .line 43
    if-eqz p2, :cond_0

    .line 44
    .line 45
    check-cast p1, Landroid/os/PowerManager;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    move-object p1, p3

    .line 49
    :goto_0
    const/4 p2, 0x1

    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    const-string p4, "tempus:UpnpPlayer"

    .line 53
    .line 54
    invoke-virtual {p1, p2, p4}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    const/4 p3, 0x0

    .line 61
    invoke-virtual {p1, p3}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 62
    .line 63
    .line 64
    move-object p3, p1

    .line 65
    :cond_1
    iput-object p3, p0, Lq25;->o:Landroid/os/PowerManager$WakeLock;

    .line 66
    .line 67
    sget-object p1, Lu01;->n:Lu01;

    .line 68
    .line 69
    iput-object p1, p0, Lq25;->p:Ljava/util/List;

    .line 70
    .line 71
    iput p2, p0, Lq25;->s:I

    .line 72
    .line 73
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    iput-wide p1, p0, Lq25;->B:J

    .line 79
    .line 80
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 81
    .line 82
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object p1, p0, Lq25;->G:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 86
    .line 87
    new-instance p1, Lwu4;

    .line 88
    .line 89
    const/4 p2, 0x2

    .line 90
    invoke-direct {p1, p2, p0}, Lwu4;-><init>(ILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iput-object p1, p0, Lq25;->O:Lwu4;

    .line 94
    .line 95
    return-void
.end method

.method public static R1(Lgn2;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    iget-object p0, p0, Lgn2;->d:Ldo2;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lf25;->c:Ljava/util/List;

    .line 7
    .line 8
    iget-object v0, p0, Ldo2;->a:Ljava/lang/CharSequence;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v0, v1

    .line 19
    :goto_0
    const-string v2, ""

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    move-object v0, v2

    .line 24
    :cond_1
    iget-object v3, p0, Ldo2;->b:Ljava/lang/CharSequence;

    .line 25
    .line 26
    if-eqz v3, :cond_2

    .line 27
    .line 28
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    move-object v3, v1

    .line 34
    :goto_1
    if-nez v3, :cond_3

    .line 35
    .line 36
    move-object v3, v2

    .line 37
    :cond_3
    iget-object p0, p0, Ldo2;->c:Ljava/lang/CharSequence;

    .line 38
    .line 39
    if-eqz p0, :cond_4

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :cond_4
    if-nez v1, :cond_5

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_5
    move-object v2, v1

    .line 49
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Lud3;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {v3}, Lud3;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v2}, Lud3;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const-string v2, "*"

    .line 65
    .line 66
    invoke-static {v2}, Lud3;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-static {p1}, Lud3;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    const-string v3, "</dc:title><upnp:artist>"

    .line 75
    .line 76
    const-string v4, "</upnp:artist><upnp:album>"

    .line 77
    .line 78
    const-string v5, "<DIDL-Lite xmlns=\"urn:schemas-upnp-org:metadata-1-0/DIDL-Lite/\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\" xmlns:upnp=\"urn:schemas-upnp-org:metadata-1-0/upnp/\"><item id=\"1\" parentID=\"0\" restricted=\"1\"><dc:title>"

    .line 79
    .line 80
    invoke-static {v5, p0, v3, v0, v4}, Lb11;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    const-string v0, "</upnp:album><upnp:class>object.item.audioItem.musicTrack</upnp:class><res protocolInfo=\"http-get:*:"

    .line 85
    .line 86
    const-string v3, ":DLNA.ORG_OP=01;DLNA.ORG_FLAGS=01700000000000000000000000000000\">"

    .line 87
    .line 88
    invoke-static {p0, v1, v0, v2, v3}, Lf34;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    const-string v0, "</res></item></DIDL-Lite>"

    .line 92
    .line 93
    invoke-static {p0, p1, v0}, Lb11;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0
.end method


# virtual methods
.method public final G1(Ljava/lang/Exception;)Landroidx/media3/common/PlaybackException;
    .locals 3

    .line 1
    new-instance v0, Landroidx/media3/common/PlaybackException;

    .line 2
    .line 3
    iget-object p0, p0, Lq25;->k:Lg25;

    .line 4
    .line 5
    iget-object p0, p0, Lg25;->b:Ljava/lang/String;

    .line 6
    .line 7
    const-string v1, "Lost contact with "

    .line 8
    .line 9
    const-string v2, "."

    .line 10
    .line 11
    invoke-static {v1, p0, v2}, Lxa3;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const/16 v1, 0x3e9

    .line 16
    .line 17
    invoke-direct {v0, p0, p1, v1}, Landroidx/media3/common/PlaybackException;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method public final H1(Lp25;Ljava/lang/Exception;)Landroidx/media3/common/PlaybackException;
    .locals 2

    .line 1
    iget-object p1, p1, Lp25;->c:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    :cond_0
    const-string p1, "the music server"

    .line 18
    .line 19
    :cond_1
    new-instance v0, Landroidx/media3/common/PlaybackException;

    .line 20
    .line 21
    iget-object p0, p0, Lq25;->k:Lg25;

    .line 22
    .line 23
    iget-object p0, p0, Lg25;->b:Ljava/lang/String;

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string p0, " could not play the track from "

    .line 34
    .line 35
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string p0, ". A renderer fetches the stream from the music server itself, so the server address has to be one the renderer can reach, not a VPN or loopback address only this phone can use."

    .line 42
    .line 43
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const/16 p1, 0x7d5

    .line 51
    .line 52
    invoke-direct {v0, p0, p2, p1}, Landroidx/media3/common/PlaybackException;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 53
    .line 54
    .line 55
    return-object v0
.end method

.method public final I1(Lp25;Ljava/lang/Exception;)Landroidx/media3/common/PlaybackException;
    .locals 3

    .line 1
    instance-of v0, p2, Lcom/eddyizm/tempus/upnp/UpnpException;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lcom/eddyizm/tempus/upnp/UpnpException;

    .line 7
    .line 8
    iget v1, v0, Lcom/eddyizm/tempus/upnp/UpnpException;->n:I

    .line 9
    .line 10
    const/16 v2, 0x2cc

    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, p1, p2}, Lq25;->H1(Lp25;Ljava/lang/Exception;)Landroidx/media3/common/PlaybackException;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    new-instance p1, Landroidx/media3/common/PlaybackException;

    .line 22
    .line 23
    iget-object p0, p0, Lq25;->k:Lg25;

    .line 24
    .line 25
    iget-object p0, p0, Lg25;->b:Ljava/lang/String;

    .line 26
    .line 27
    new-instance p2, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p0, " refused the track (UPnP error "

    .line 36
    .line 37
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string p0, ")."

    .line 44
    .line 45
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const/16 p2, 0x3e9

    .line 53
    .line 54
    invoke-direct {p1, p0, v0, p2}, Landroidx/media3/common/PlaybackException;-><init>(Ljava/lang/String;Ljava/lang/Exception;I)V

    .line 55
    .line 56
    .line 57
    return-object p1

    .line 58
    :cond_1
    invoke-virtual {p0, p2}, Lq25;->G1(Ljava/lang/Exception;)Landroidx/media3/common/PlaybackException;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method

.method public final J1()Lp25;
    .locals 1

    .line 1
    iget-object v0, p0, Lq25;->p:Ljava/util/List;

    .line 2
    .line 3
    iget p0, p0, Lq25;->q:I

    .line 4
    .line 5
    invoke-static {v0, p0}, Lq40;->y0(Ljava/util/List;I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lp25;

    .line 10
    .line 11
    return-object p0
.end method

.method public final K1(Lif1;)Lic2;
    .locals 12

    .line 1
    invoke-virtual {p0}, Lq25;->J1()Lp25;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-wide v2, v0, Lp25;->a:J

    .line 9
    .line 10
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    iget-object v2, p0, Lq25;->p:Ljava/util/List;

    .line 17
    .line 18
    iget v3, p0, Lq25;->q:I

    .line 19
    .line 20
    const/4 v4, 0x1

    .line 21
    add-int/2addr v3, v4

    .line 22
    invoke-static {v2, v3}, Lq40;->y0(Ljava/util/List;I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lp25;

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    iget-object v2, v2, Lp25;->c:Ljava/lang/String;

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move-object v2, v1

    .line 34
    :goto_1
    iget-object v3, p0, Lq25;->p:Ljava/util/List;

    .line 35
    .line 36
    invoke-static {v3}, Lq40;->R0(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-interface {p1, v3}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    iput-object v3, p0, Lq25;->p:Ljava/util/List;

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    const/4 v5, 0x0

    .line 50
    move v6, v5

    .line 51
    move v7, v6

    .line 52
    :goto_2
    if-ge v7, p1, :cond_4

    .line 53
    .line 54
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    add-int/lit8 v7, v7, 0x1

    .line 59
    .line 60
    check-cast v8, Lp25;

    .line 61
    .line 62
    iget-wide v8, v8, Lp25;->a:J

    .line 63
    .line 64
    if-nez v0, :cond_2

    .line 65
    .line 66
    goto :goto_3

    .line 67
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 68
    .line 69
    .line 70
    move-result-wide v10

    .line 71
    cmp-long v8, v8, v10

    .line 72
    .line 73
    if-nez v8, :cond_3

    .line 74
    .line 75
    goto :goto_4

    .line 76
    :cond_3
    :goto_3
    add-int/lit8 v6, v6, 0x1

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    const/4 v6, -0x1

    .line 80
    :goto_4
    if-eqz v0, :cond_5

    .line 81
    .line 82
    if-gez v6, :cond_5

    .line 83
    .line 84
    move p1, v4

    .line 85
    goto :goto_5

    .line 86
    :cond_5
    move p1, v5

    .line 87
    :goto_5
    if-ltz v6, :cond_6

    .line 88
    .line 89
    goto :goto_6

    .line 90
    :cond_6
    iget v0, p0, Lq25;->q:I

    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    sub-int/2addr v6, v4

    .line 97
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    invoke-static {v0, v5, v6}, Lgb;->m(III)I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    :goto_6
    iput v6, p0, Lq25;->q:I

    .line 106
    .line 107
    invoke-virtual {p0}, Lq25;->O1()V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_7

    .line 115
    .line 116
    iget-object p1, p0, Lq25;->l:Lmx2;

    .line 117
    .line 118
    new-instance v0, Ll25;

    .line 119
    .line 120
    invoke-direct {v0, p0, v5}, Ll25;-><init>(Lq25;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v0}, Lmx2;->b(Ljava/util/concurrent/Callable;)Lic2;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    return-object p0

    .line 131
    :cond_7
    if-eqz p1, :cond_8

    .line 132
    .line 133
    const-wide/16 v0, 0x0

    .line 134
    .line 135
    invoke-virtual {p0, v0, v1}, Lq25;->Y1(J)V

    .line 136
    .line 137
    .line 138
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    iput-wide v2, p0, Lq25;->B:J

    .line 144
    .line 145
    invoke-virtual {p0, v0, v1}, Lq25;->Q1(J)Lic2;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    return-object p0

    .line 150
    :cond_8
    iget p1, p0, Lq25;->q:I

    .line 151
    .line 152
    add-int/2addr p1, v4

    .line 153
    invoke-static {v3, p1}, Lq40;->y0(Ljava/util/List;I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    check-cast p1, Lp25;

    .line 158
    .line 159
    if-eqz p1, :cond_9

    .line 160
    .line 161
    iget-object v1, p1, Lp25;->c:Ljava/lang/String;

    .line 162
    .line 163
    :cond_9
    invoke-static {v1, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    if-nez p1, :cond_a

    .line 168
    .line 169
    iget-object p1, p0, Lq25;->l:Lmx2;

    .line 170
    .line 171
    new-instance v0, Ll25;

    .line 172
    .line 173
    invoke-direct {v0, p0, v4}, Ll25;-><init>(Lq25;I)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1, v0}, Lmx2;->b(Ljava/util/concurrent/Callable;)Lic2;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    return-object p0

    .line 184
    :cond_a
    sget-object p0, Lmw1;->o:Lmw1;

    .line 185
    .line 186
    return-object p0
.end method

.method public final L1(Landroidx/media3/common/PlaybackException;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lq25;->I:Landroidx/media3/common/PlaybackException;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lq25;->r:Z

    .line 5
    .line 6
    invoke-virtual {p0}, Lq25;->c2()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lq25;->Z1()V

    .line 10
    .line 11
    .line 12
    const-string v0, "after a refusal"

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lq25;->a2(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lq25;->O1()V

    .line 18
    .line 19
    .line 20
    const-string p0, "UpnpPlayer"

    .line 21
    .line 22
    const-string v0, "playback on the renderer stopped"

    .line 23
    .line 24
    invoke-static {p0, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final M1(Z)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lq25;->r:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    iput v1, p0, Lq25;->y:I

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget v0, p0, Lq25;->y:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, 0x1

    .line 12
    .line 13
    iput v0, p0, Lq25;->y:I

    .line 14
    .line 15
    iget v0, p0, Lq25;->y:I

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    if-ge v0, v2, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iput v1, p0, Lq25;->y:I

    .line 22
    .line 23
    if-nez p1, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0}, Lq25;->U1()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    invoke-virtual {p0, v0, v1}, Lq25;->Y1(J)V

    .line 30
    .line 31
    .line 32
    :cond_2
    iput-boolean p1, p0, Lq25;->r:Z

    .line 33
    .line 34
    invoke-virtual {p0}, Lq25;->c2()V

    .line 35
    .line 36
    .line 37
    if-nez p1, :cond_3

    .line 38
    .line 39
    :goto_0
    return-void

    .line 40
    :cond_3
    iget-object p1, p0, Lq25;->H:Ljava/lang/Long;

    .line 41
    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    const/4 p1, 0x0

    .line 49
    iput-object p1, p0, Lq25;->H:Ljava/lang/Long;

    .line 50
    .line 51
    invoke-virtual {p0, v0, v1}, Lq25;->W1(J)Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_4

    .line 56
    .line 57
    invoke-virtual {p0, v0, v1}, Lq25;->Y1(J)V

    .line 58
    .line 59
    .line 60
    iput-wide v0, p0, Lq25;->A:J

    .line 61
    .line 62
    :cond_4
    invoke-virtual {p0}, Lq25;->X1()V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public final N1(JJLjava/lang/String;)Z
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p5, :cond_d

    .line 3
    .line 4
    invoke-static {p5}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto/16 :goto_7

    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Lq25;->J1()Lp25;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const/4 v2, 0x0

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-object v1, v1, Lp25;->c:Ljava/lang/String;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move-object v1, v2

    .line 23
    :goto_0
    invoke-virtual {p5, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    goto/16 :goto_7

    .line 30
    .line 31
    :cond_2
    iget v1, p0, Lq25;->q:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    add-int/2addr v1, v3

    .line 35
    iget-object v4, p0, Lq25;->p:Ljava/util/List;

    .line 36
    .line 37
    invoke-static {v4, v1}, Lq40;->y0(Ljava/util/List;I)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Lp25;

    .line 42
    .line 43
    if-eqz v4, :cond_3

    .line 44
    .line 45
    iget-object v4, v4, Lp25;->c:Ljava/lang/String;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_3
    move-object v4, v2

    .line 49
    :goto_1
    invoke-static {v4, p5}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_4

    .line 54
    .line 55
    goto :goto_4

    .line 56
    :cond_4
    iget-object v1, p0, Lq25;->p:Ljava/util/List;

    .line 57
    .line 58
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    move v4, v0

    .line 63
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_7

    .line 68
    .line 69
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    check-cast v5, Lp25;

    .line 74
    .line 75
    if-eqz v5, :cond_5

    .line 76
    .line 77
    iget-object v5, v5, Lp25;->c:Ljava/lang/String;

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_5
    move-object v5, v2

    .line 81
    :goto_3
    invoke-static {v5, p5}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_6

    .line 86
    .line 87
    move v1, v4

    .line 88
    goto :goto_4

    .line 89
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_7
    const/4 v1, -0x1

    .line 93
    :goto_4
    const-wide/16 v4, 0x0

    .line 94
    .line 95
    if-ltz v1, :cond_b

    .line 96
    .line 97
    cmp-long p5, p3, v4

    .line 98
    .line 99
    if-lez p5, :cond_a

    .line 100
    .line 101
    const-wide/16 v6, 0x7d0

    .line 102
    .line 103
    sub-long v6, p3, v6

    .line 104
    .line 105
    cmp-long p5, p1, v6

    .line 106
    .line 107
    if-gez p5, :cond_9

    .line 108
    .line 109
    sget-object p5, Lbo2;->a:Ljava/lang/ref/WeakReference;

    .line 110
    .line 111
    const-wide/16 v6, 0x7530

    .line 112
    .line 113
    cmp-long p5, p3, v6

    .line 114
    .line 115
    if-gtz p5, :cond_8

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :cond_8
    const-wide/16 v6, 0x2

    .line 119
    .line 120
    div-long/2addr p3, v6

    .line 121
    const-wide/32 v6, 0x3a980

    .line 122
    .line 123
    .line 124
    invoke-static {p3, p4, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 125
    .line 126
    .line 127
    move-result-wide p3

    .line 128
    cmp-long p1, p1, p3

    .line 129
    .line 130
    if-ltz p1, :cond_a

    .line 131
    .line 132
    :cond_9
    move p1, v3

    .line 133
    goto :goto_6

    .line 134
    :cond_a
    :goto_5
    move p1, v0

    .line 135
    :goto_6
    iput-boolean p1, p0, Lq25;->v:Z

    .line 136
    .line 137
    iput v1, p0, Lq25;->q:I

    .line 138
    .line 139
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    iput-wide p1, p0, Lq25;->B:J

    .line 145
    .line 146
    iput-boolean v0, p0, Lq25;->J:Z

    .line 147
    .line 148
    iput v0, p0, Lq25;->K:I

    .line 149
    .line 150
    iput v0, p0, Lq25;->x:I

    .line 151
    .line 152
    iput-wide v4, p0, Lq25;->A:J

    .line 153
    .line 154
    invoke-virtual {p0, v4, v5}, Lq25;->Y1(J)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p0}, Lq25;->O1()V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0}, Lq25;->X1()V

    .line 161
    .line 162
    .line 163
    return v3

    .line 164
    :cond_b
    iget-boolean p1, p0, Lq25;->r:Z

    .line 165
    .line 166
    if-nez p1, :cond_c

    .line 167
    .line 168
    goto :goto_7

    .line 169
    :cond_c
    const-string p1, "UpnpPlayer"

    .line 170
    .line 171
    const-string p2, "renderer is on a track that is not in the queue, loading ours again"

    .line 172
    .line 173
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0, v4, v5}, Lq25;->P1(J)V

    .line 177
    .line 178
    .line 179
    return v3

    .line 180
    :cond_d
    :goto_7
    return v0
.end method

.method public final O1()V
    .locals 2

    .line 1
    new-instance v0, Lo25;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, p0, v1}, Lo25;-><init>(Lq25;I)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lq25;->n:Landroid/os/Handler;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final P1(J)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lq25;->J1()Lp25;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v1, v0, Lp25;->c:Ljava/lang/String;

    .line 9
    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    const-string p0, "UpnpPlayer"

    .line 13
    .line 14
    const-string p1, "queue item has no uri, nothing to hand the renderer"

    .line 15
    .line 16
    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    const/4 v2, 0x0

    .line 21
    iput-object v2, p0, Lq25;->I:Landroidx/media3/common/PlaybackException;

    .line 22
    .line 23
    iput-object v2, p0, Lq25;->H:Ljava/lang/Long;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    iput v3, p0, Lq25;->x:I

    .line 27
    .line 28
    iput-object v2, p0, Lq25;->w:Ljava/lang/String;

    .line 29
    .line 30
    iput-boolean v3, p0, Lq25;->J:Z

    .line 31
    .line 32
    iput v3, p0, Lq25;->K:I

    .line 33
    .line 34
    const-wide/16 v4, 0x0

    .line 35
    .line 36
    iput-wide v4, p0, Lq25;->A:J

    .line 37
    .line 38
    const/4 v6, 0x2

    .line 39
    iput v6, p0, Lq25;->s:I

    .line 40
    .line 41
    invoke-virtual {p0}, Lq25;->O1()V

    .line 42
    .line 43
    .line 44
    iget-object v6, p0, Lq25;->D:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-eqz v6, :cond_3

    .line 51
    .line 52
    :try_start_0
    iget-boolean v1, p0, Lq25;->r:Z

    .line 53
    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    iput-object v2, p0, Lq25;->H:Ljava/lang/Long;

    .line 57
    .line 58
    invoke-virtual {p0, p1, p2}, Lq25;->W1(J)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iput-object v1, p0, Lq25;->H:Ljava/lang/Long;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    iget-object v7, p0, Lq25;->j:Lf25;

    .line 70
    .line 71
    iget-object v8, p0, Lq25;->k:Lg25;

    .line 72
    .line 73
    iget-object v9, v0, Lp25;->b:Lgn2;

    .line 74
    .line 75
    invoke-static {v9, v1}, Lq25;->R1(Lgn2;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    invoke-virtual {v7, v8, v1, v9}, Lf25;->f(Lg25;Ljava/lang/String;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iput-object v1, p0, Lq25;->D:Ljava/lang/String;

    .line 83
    .line 84
    :goto_0
    iget-boolean v1, p0, Lq25;->r:Z

    .line 85
    .line 86
    if-eqz v1, :cond_4

    .line 87
    .line 88
    iget-object v1, p0, Lq25;->j:Lf25;

    .line 89
    .line 90
    iget-object v7, p0, Lq25;->k:Lg25;

    .line 91
    .line 92
    invoke-virtual {v1, v7}, Lf25;->b(Lg25;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :catch_0
    move-exception p1

    .line 97
    goto :goto_3

    .line 98
    :cond_4
    :goto_1
    if-nez v6, :cond_6

    .line 99
    .line 100
    cmp-long v0, p1, v4

    .line 101
    .line 102
    if-lez v0, :cond_6

    .line 103
    .line 104
    iget-boolean v0, p0, Lq25;->r:Z

    .line 105
    .line 106
    if-eqz v0, :cond_5

    .line 107
    .line 108
    iput-object v2, p0, Lq25;->H:Ljava/lang/Long;

    .line 109
    .line 110
    invoke-virtual {p0, p1, p2}, Lq25;->V1(J)Z

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_5
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    iput-object p1, p0, Lq25;->H:Ljava/lang/Long;

    .line 119
    .line 120
    :cond_6
    :goto_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 121
    .line 122
    .line 123
    move-result-wide p1

    .line 124
    iput-wide p1, p0, Lq25;->u:J

    .line 125
    .line 126
    invoke-virtual {p0}, Lq25;->X1()V

    .line 127
    .line 128
    .line 129
    iget-boolean p1, p0, Lq25;->r:Z

    .line 130
    .line 131
    if-nez p1, :cond_7

    .line 132
    .line 133
    const/4 p1, 0x3

    .line 134
    iput p1, p0, Lq25;->s:I

    .line 135
    .line 136
    :cond_7
    iget-object p1, p0, Lq25;->n:Landroid/os/Handler;

    .line 137
    .line 138
    new-instance p2, Lo25;

    .line 139
    .line 140
    invoke-direct {p2, p0, v3}, Lo25;-><init>(Lq25;I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Lq25;->O1()V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :goto_3
    invoke-virtual {p0, v0, p1}, Lq25;->I1(Lp25;Ljava/lang/Exception;)Landroidx/media3/common/PlaybackException;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-virtual {p0, p1}, Lq25;->L1(Landroidx/media3/common/PlaybackException;)V

    .line 155
    .line 156
    .line 157
    return-void
.end method

.method public final Q1(J)Lic2;
    .locals 8

    .line 1
    iget-wide v0, p0, Lq25;->E:J

    .line 2
    .line 3
    const-wide/16 v2, 0x1

    .line 4
    .line 5
    add-long/2addr v0, v2

    .line 6
    iput-wide v0, p0, Lq25;->E:J

    .line 7
    .line 8
    iget-wide v3, p0, Lq25;->E:J

    .line 9
    .line 10
    iget-object v0, p0, Lq25;->G:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lq25;->l:Lmx2;

    .line 16
    .line 17
    new-instance v2, Li25;

    .line 18
    .line 19
    move-object v5, p0

    .line 20
    move-wide v6, p1

    .line 21
    invoke-direct/range {v2 .. v7}, Li25;-><init>(JLq25;J)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v2}, Lmx2;->b(Ljava/util/concurrent/Callable;)Lic2;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    return-object p0
.end method

.method public final S1(JJJJ)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lq25;->r:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iput-object v1, p0, Lq25;->D:Ljava/lang/String;

    .line 8
    .line 9
    iput v2, p0, Lq25;->s:I

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0}, Lq25;->J1()Lp25;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_2

    .line 17
    .line 18
    iget-boolean v3, p0, Lq25;->J:Z

    .line 19
    .line 20
    if-nez v3, :cond_2

    .line 21
    .line 22
    iget p1, p0, Lq25;->K:I

    .line 23
    .line 24
    add-int/2addr p1, v2

    .line 25
    iput p1, p0, Lq25;->K:I

    .line 26
    .line 27
    iget p1, p0, Lq25;->K:I

    .line 28
    .line 29
    const/4 p2, 0x5

    .line 30
    if-le p1, p2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, v0, v1}, Lq25;->H1(Lp25;Ljava/lang/Exception;)Landroidx/media3/common/PlaybackException;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p0, p1}, Lq25;->L1(Landroidx/media3/common/PlaybackException;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void

    .line 40
    :cond_2
    iput-object v1, p0, Lq25;->D:Ljava/lang/String;

    .line 41
    .line 42
    const-wide/16 v0, 0x0

    .line 43
    .line 44
    cmp-long v3, p5, v0

    .line 45
    .line 46
    const/4 v4, 0x0

    .line 47
    if-lez v3, :cond_3

    .line 48
    .line 49
    sget-wide v5, Lq25;->R:J

    .line 50
    .line 51
    sub-long/2addr p5, v5

    .line 52
    cmp-long p5, p1, p5

    .line 53
    .line 54
    if-gez p5, :cond_3

    .line 55
    .line 56
    invoke-virtual {p0, p7, p8}, Lq25;->Y1(J)V

    .line 57
    .line 58
    .line 59
    iput-boolean v4, p0, Lq25;->r:Z

    .line 60
    .line 61
    invoke-virtual {p0}, Lq25;->c2()V

    .line 62
    .line 63
    .line 64
    iput v2, p0, Lq25;->s:I

    .line 65
    .line 66
    invoke-virtual {p0}, Lq25;->Z1()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_3
    iget-object p5, p0, Lq25;->p:Ljava/util/List;

    .line 71
    .line 72
    iget p6, p0, Lq25;->q:I

    .line 73
    .line 74
    add-int/2addr p6, v2

    .line 75
    invoke-static {p5, p6}, Lq40;->y0(Ljava/util/List;I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p5

    .line 79
    check-cast p5, Lp25;

    .line 80
    .line 81
    if-eqz p5, :cond_4

    .line 82
    .line 83
    iget-object p6, p0, Lq25;->w:Ljava/lang/String;

    .line 84
    .line 85
    iget-object p5, p5, Lp25;->c:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {p6, p5}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result p5

    .line 91
    if-eqz p5, :cond_4

    .line 92
    .line 93
    iget p5, p0, Lq25;->x:I

    .line 94
    .line 95
    const/4 p6, 0x3

    .line 96
    if-ge p5, p6, :cond_4

    .line 97
    .line 98
    iget p1, p0, Lq25;->x:I

    .line 99
    .line 100
    add-int/2addr p1, v2

    .line 101
    iput p1, p0, Lq25;->x:I

    .line 102
    .line 103
    return-void

    .line 104
    :cond_4
    iput v4, p0, Lq25;->x:I

    .line 105
    .line 106
    cmp-long p5, p3, v0

    .line 107
    .line 108
    if-lez p5, :cond_7

    .line 109
    .line 110
    const-wide/16 p5, 0x7d0

    .line 111
    .line 112
    sub-long p5, p3, p5

    .line 113
    .line 114
    cmp-long p5, p1, p5

    .line 115
    .line 116
    if-gez p5, :cond_6

    .line 117
    .line 118
    sget-object p5, Lbo2;->a:Ljava/lang/ref/WeakReference;

    .line 119
    .line 120
    const-wide/16 p5, 0x7530

    .line 121
    .line 122
    cmp-long p5, p3, p5

    .line 123
    .line 124
    if-gtz p5, :cond_5

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_5
    const-wide/16 p5, 0x2

    .line 128
    .line 129
    div-long/2addr p3, p5

    .line 130
    const-wide/32 p5, 0x3a980

    .line 131
    .line 132
    .line 133
    invoke-static {p3, p4, p5, p6}, Ljava/lang/Math;->min(JJ)J

    .line 134
    .line 135
    .line 136
    move-result-wide p3

    .line 137
    cmp-long p1, p1, p3

    .line 138
    .line 139
    if-ltz p1, :cond_7

    .line 140
    .line 141
    :cond_6
    move p1, v2

    .line 142
    goto :goto_1

    .line 143
    :cond_7
    :goto_0
    move p1, v4

    .line 144
    :goto_1
    iget p2, p0, Lq25;->q:I

    .line 145
    .line 146
    add-int/2addr p2, v2

    .line 147
    iget-object p3, p0, Lq25;->p:Ljava/util/List;

    .line 148
    .line 149
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 150
    .line 151
    .line 152
    move-result p3

    .line 153
    if-ge p2, p3, :cond_8

    .line 154
    .line 155
    iput-boolean p1, p0, Lq25;->v:Z

    .line 156
    .line 157
    iget p1, p0, Lq25;->q:I

    .line 158
    .line 159
    add-int/2addr p1, v2

    .line 160
    iput p1, p0, Lq25;->q:I

    .line 161
    .line 162
    invoke-virtual {p0, v0, v1}, Lq25;->Y1(J)V

    .line 163
    .line 164
    .line 165
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    iput-wide p1, p0, Lq25;->B:J

    .line 171
    .line 172
    iput-boolean v4, p0, Lq25;->J:Z

    .line 173
    .line 174
    iput v4, p0, Lq25;->K:I

    .line 175
    .line 176
    iput-wide v0, p0, Lq25;->A:J

    .line 177
    .line 178
    invoke-virtual {p0, v0, v1}, Lq25;->P1(J)V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :cond_8
    iput-boolean v4, p0, Lq25;->r:Z

    .line 183
    .line 184
    invoke-virtual {p0}, Lq25;->c2()V

    .line 185
    .line 186
    .line 187
    if-eqz p1, :cond_9

    .line 188
    .line 189
    const/4 v2, 0x4

    .line 190
    :cond_9
    iput v2, p0, Lq25;->s:I

    .line 191
    .line 192
    invoke-virtual {p0}, Lq25;->Z1()V

    .line 193
    .line 194
    .line 195
    return-void
.end method

.method public final T1()V
    .locals 11

    .line 1
    const-string v0, "0"

    .line 2
    .line 3
    const-string v1, "InstanceID"

    .line 4
    .line 5
    iget-object v2, p0, Lq25;->j:Lf25;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object v3, Lz01;->n:Lz01;

    .line 11
    .line 12
    iget-object p0, p0, Lq25;->k:Lg25;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    :try_start_0
    invoke-static {p0}, Lf25;->d(Lg25;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    const-string v6, "GetCurrentTransportActions"

    .line 23
    .line 24
    new-instance v7, Lkd3;

    .line 25
    .line 26
    invoke-direct {v7, v1, v0}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v7}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    invoke-virtual {v2, v5, v6, v7}, Lf25;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    const-string v6, "Actions"

    .line 38
    .line 39
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    check-cast v5, Ljava/lang/String;

    .line 44
    .line 45
    if-eqz v5, :cond_3

    .line 46
    .line 47
    new-array v6, v4, [C

    .line 48
    .line 49
    const/4 v7, 0x0

    .line 50
    const/16 v8, 0x2c

    .line 51
    .line 52
    aput-char v8, v6, v7

    .line 53
    .line 54
    invoke-static {v5, v6}, Lqm4;->D0(Ljava/lang/String;[C)Ljava/util/List;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    new-instance v6, Ljava/util/ArrayList;

    .line 59
    .line 60
    const/16 v8, 0xa

    .line 61
    .line 62
    invoke-static {v5, v8}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 67
    .line 68
    .line 69
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-eqz v8, :cond_0

    .line 78
    .line 79
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v8

    .line 83
    check-cast v8, Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {v8}, Lqm4;->K0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 86
    .line 87
    .line 88
    move-result-object v8

    .line 89
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_0
    new-instance v5, Ljava/util/ArrayList;

    .line 98
    .line 99
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    :cond_1
    :goto_1
    if-ge v7, v8, :cond_2

    .line 107
    .line 108
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    add-int/lit8 v7, v7, 0x1

    .line 113
    .line 114
    move-object v10, v9

    .line 115
    check-cast v10, Ljava/lang/String;

    .line 116
    .line 117
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 118
    .line 119
    .line 120
    move-result v10

    .line 121
    if-lez v10, :cond_1

    .line 122
    .line 123
    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_2
    invoke-static {v5}, Lq40;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 128
    .line 129
    .line 130
    move-result-object v5
    :try_end_0
    .catch Lcom/eddyizm/tempus/upnp/UpnpException; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    goto :goto_2

    .line 132
    :cond_3
    const/4 v5, 0x0

    .line 133
    :goto_2
    if-nez v5, :cond_4

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_4
    move-object v3, v5

    .line 137
    :catch_0
    :goto_3
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    const-string v6, "Pause"

    .line 142
    .line 143
    if-nez v5, :cond_7

    .line 144
    .line 145
    check-cast v3, Ljava/lang/Iterable;

    .line 146
    .line 147
    instance-of v5, v3, Ljava/util/Collection;

    .line 148
    .line 149
    if-eqz v5, :cond_5

    .line 150
    .line 151
    move-object v5, v3

    .line 152
    check-cast v5, Ljava/util/Collection;

    .line 153
    .line 154
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 155
    .line 156
    .line 157
    move-result v5

    .line 158
    if-eqz v5, :cond_5

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_5
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 166
    .line 167
    .line 168
    move-result v5

    .line 169
    if-eqz v5, :cond_8

    .line 170
    .line 171
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    check-cast v5, Ljava/lang/String;

    .line 176
    .line 177
    invoke-static {v5, v6, v4}, Lxm4;->f0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    if-eqz v5, :cond_6

    .line 182
    .line 183
    :cond_7
    :try_start_1
    invoke-static {p0}, Lf25;->d(Lg25;)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    new-instance v4, Lkd3;

    .line 188
    .line 189
    invoke-direct {v4, v1, v0}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    invoke-static {v4}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 193
    .line 194
    .line 195
    move-result-object v4

    .line 196
    invoke-virtual {v2, v3, v6, v4}, Lf25;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;
    :try_end_1
    .catch Lcom/eddyizm/tempus/upnp/UpnpException; {:try_start_1 .. :try_end_1} :catch_1

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :catch_1
    move-exception v3

    .line 201
    iget v4, v3, Lcom/eddyizm/tempus/upnp/UpnpException;->n:I

    .line 202
    .line 203
    const/16 v5, 0x2bd

    .line 204
    .line 205
    if-ne v4, v5, :cond_9

    .line 206
    .line 207
    const-string v3, "UpnpPlayer"

    .line 208
    .line 209
    const-string v4, "renderer refused a pause, stopping instead"

    .line 210
    .line 211
    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 212
    .line 213
    .line 214
    :cond_8
    :goto_4
    invoke-static {p0}, Lf25;->d(Lg25;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    new-instance v3, Lkd3;

    .line 219
    .line 220
    invoke-direct {v3, v1, v0}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v3}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    const-string v1, "Stop"

    .line 228
    .line 229
    invoke-virtual {v2, p0, v1, v0}, Lf25;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;

    .line 230
    .line 231
    .line 232
    return-void

    .line 233
    :cond_9
    throw v3
.end method

.method public final U1()J
    .locals 8

    .line 1
    iget v0, p0, Lq25;->s:I

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-boolean v0, p0, Lq25;->r:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-wide v0, p0, Lq25;->u:J

    .line 13
    .line 14
    cmp-long v0, v0, v2

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    iget-wide v4, p0, Lq25;->t:J

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    iget-wide v6, p0, Lq25;->u:J

    .line 30
    .line 31
    sub-long/2addr v0, v6

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move-wide v0, v2

    .line 34
    :goto_1
    add-long/2addr v4, v0

    .line 35
    iget-wide v0, p0, Lq25;->B:J

    .line 36
    .line 37
    cmp-long v0, v0, v2

    .line 38
    .line 39
    if-gtz v0, :cond_2

    .line 40
    .line 41
    const-wide v0, 0x7fffffffffffffffL

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    iget-wide v0, p0, Lq25;->B:J

    .line 48
    .line 49
    const-wide/16 v2, 0x3e8

    .line 50
    .line 51
    div-long/2addr v0, v2

    .line 52
    const-wide/16 v2, 0x1

    .line 53
    .line 54
    sub-long/2addr v0, v2

    .line 55
    :goto_2
    cmp-long p0, v4, v0

    .line 56
    .line 57
    if-lez p0, :cond_3

    .line 58
    .line 59
    return-wide v0

    .line 60
    :cond_3
    return-wide v4
.end method

.method public final V1(J)Z
    .locals 10

    .line 1
    iget-wide v0, p0, Lq25;->E:J

    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v2

    .line 7
    sget-wide v4, Lq25;->T:J

    .line 8
    .line 9
    add-long/2addr v2, v4

    .line 10
    :goto_0
    iget-wide v4, p0, Lq25;->E:J

    .line 11
    .line 12
    cmp-long v4, v0, v4

    .line 13
    .line 14
    if-nez v4, :cond_0

    .line 15
    .line 16
    iget-boolean v4, p0, Lq25;->C:Z

    .line 17
    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 21
    .line 22
    .line 23
    move-result-wide v4

    .line 24
    cmp-long v4, v4, v2

    .line 25
    .line 26
    if-gez v4, :cond_0

    .line 27
    .line 28
    :try_start_0
    iget-object v4, p0, Lq25;->j:Lf25;

    .line 29
    .line 30
    iget-object v5, p0, Lq25;->k:Lg25;

    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {v5}, Lf25;->d(Lg25;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    const-string v6, "GetTransportInfo"

    .line 43
    .line 44
    const-string v7, "InstanceID"

    .line 45
    .line 46
    const-string v8, "0"

    .line 47
    .line 48
    new-instance v9, Lkd3;

    .line 49
    .line 50
    invoke-direct {v9, v7, v8}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v9}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    invoke-virtual {v4, v5, v6, v7}, Lf25;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    const-string v5, "CurrentTransportState"

    .line 62
    .line 63
    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    .line 69
    const-string v5, "PLAYING"

    .line 70
    .line 71
    invoke-static {v4, v5}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-nez v4, :cond_0

    .line 76
    .line 77
    const-wide/16 v4, 0xc8

    .line 78
    .line 79
    invoke-static {v4, v5}, Landroid/os/SystemClock;->sleep(J)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :catch_0
    :cond_0
    iget-wide v2, p0, Lq25;->E:J

    .line 84
    .line 85
    cmp-long v0, v0, v2

    .line 86
    .line 87
    if-nez v0, :cond_1

    .line 88
    .line 89
    iget-boolean v0, p0, Lq25;->C:Z

    .line 90
    .line 91
    if-nez v0, :cond_1

    .line 92
    .line 93
    invoke-virtual {p0, p1, p2}, Lq25;->W1(J)Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    if-eqz p0, :cond_1

    .line 98
    .line 99
    const/4 p0, 0x1

    .line 100
    goto :goto_1

    .line 101
    :cond_1
    const/4 p0, 0x0

    .line 102
    :goto_1
    return p0
.end method

.method public final W1(J)Z
    .locals 7

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, Lq25;->z:J

    .line 6
    .line 7
    :try_start_0
    iget-object v0, p0, Lq25;->j:Lf25;

    .line 8
    .line 9
    iget-object p0, p0, Lq25;->k:Lg25;

    .line 10
    .line 11
    const-wide/16 v1, 0x3e8

    .line 12
    .line 13
    div-long/2addr p1, v1

    .line 14
    const-wide/16 v1, 0x0

    .line 15
    .line 16
    cmp-long v3, p1, v1

    .line 17
    .line 18
    if-gez v3, :cond_0

    .line 19
    .line 20
    move-wide p1, v1

    .line 21
    :cond_0
    const-string v1, "%02d:%02d:%02d"

    .line 22
    .line 23
    const-wide/16 v2, 0xe10

    .line 24
    .line 25
    div-long v2, p1, v2

    .line 26
    .line 27
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-wide/16 v3, 0x3c

    .line 32
    .line 33
    div-long v5, p1, v3

    .line 34
    .line 35
    rem-long/2addr v5, v3

    .line 36
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    rem-long/2addr p1, v3

    .line 41
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    filled-new-array {v2, v5, p1}, [Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const/4 p2, 0x3

    .line 50
    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v0, p0, p1}, Lf25;->e(Lg25;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 59
    .line 60
    .line 61
    const/4 p0, 0x1

    .line 62
    return p0

    .line 63
    :catch_0
    move-exception p0

    .line 64
    const-string p1, "UpnpPlayer"

    .line 65
    .line 66
    const-string p2, "renderer did not take the seek target, it keeps playing from where it is"

    .line 67
    .line 68
    invoke-static {p1, p2, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x0

    .line 72
    return p0
.end method

.method public final X1()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lq25;->r:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, Lq25;->p:Ljava/util/List;

    .line 7
    .line 8
    iget v1, p0, Lq25;->q:I

    .line 9
    .line 10
    add-int/lit8 v1, v1, 0x1

    .line 11
    .line 12
    invoke-static {v0, v1}, Lq40;->y0(Ljava/util/List;I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lp25;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object v1, v0, Lp25;->c:Ljava/lang/String;

    .line 22
    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    :goto_0
    return-void

    .line 26
    :cond_2
    :try_start_0
    iget-object v2, p0, Lq25;->j:Lf25;

    .line 27
    .line 28
    iget-object v3, p0, Lq25;->k:Lg25;

    .line 29
    .line 30
    iget-object v0, v0, Lp25;->b:Lgn2;

    .line 31
    .line 32
    invoke-static {v0, v1}, Lq25;->R1(Lgn2;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v2, v3, v1, v0}, Lf25;->g(Lg25;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, Lq25;->w:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    return-void

    .line 42
    :catch_0
    move-exception v0

    .line 43
    const/4 v1, 0x0

    .line 44
    iput-object v1, p0, Lq25;->w:Ljava/lang/String;

    .line 45
    .line 46
    const-string p0, "UpnpPlayer"

    .line 47
    .line 48
    const-string v1, "renderer did not take a next track, queue will gap"

    .line 49
    .line 50
    invoke-static {p0, v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final Y1(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lq25;->t:J

    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    iput-wide p1, p0, Lq25;->u:J

    .line 8
    .line 9
    return-void
.end method

.method public final Z1()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lq25;->M:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lq25;->c2()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lq25;->n:Landroid/os/Handler;

    .line 8
    .line 9
    new-instance v1, Lo25;

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    invoke-direct {v1, p0, v2}, Lo25;-><init>(Lq25;I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final a2(Ljava/lang/String;)V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lq25;->j:Lf25;

    .line 2
    .line 3
    iget-object v1, p0, Lq25;->k:Lg25;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Lf25;->d(Lg25;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "Stop"

    .line 16
    .line 17
    const-string v3, "InstanceID"

    .line 18
    .line 19
    const-string v4, "0"

    .line 20
    .line 21
    new-instance v5, Lkd3;

    .line 22
    .line 23
    invoke-direct {v5, v3, v4}, Lkd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v5}, Lgb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v0, v1, v2, v3}, Lf25;->h(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/Map;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catch_0
    move-exception v0

    .line 35
    const-string v1, "renderer did not acknowledge the stop "

    .line 36
    .line 37
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string v1, "UpnpPlayer"

    .line 42
    .line 43
    invoke-static {v1, p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 44
    .line 45
    .line 46
    :goto_0
    const/4 p1, 0x0

    .line 47
    iput-object p1, p0, Lq25;->D:Ljava/lang/String;

    .line 48
    .line 49
    return-void
.end method

.method public final b2(JJJ)V
    .locals 6

    .line 1
    iget-wide v0, p0, Lq25;->B:J

    .line 2
    .line 3
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    cmp-long v0, v0, v2

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    const-wide v0, 0x7fffffffffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-wide v0, p0, Lq25;->B:J

    .line 19
    .line 20
    const-wide/16 v2, 0x3e8

    .line 21
    .line 22
    div-long/2addr v0, v2

    .line 23
    :goto_0
    cmp-long v0, p1, v0

    .line 24
    .line 25
    if-ltz v0, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    iget-wide v0, p0, Lq25;->z:J

    .line 29
    .line 30
    sub-long v0, p3, v0

    .line 31
    .line 32
    const-wide/16 v2, 0x7d0

    .line 33
    .line 34
    cmp-long v0, v0, v2

    .line 35
    .line 36
    if-gez v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0}, Lq25;->U1()J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    sub-long v0, p1, v0

    .line 43
    .line 44
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    .line 45
    .line 46
    .line 47
    move-result-wide v0

    .line 48
    cmp-long v0, v0, v2

    .line 49
    .line 50
    if-ltz v0, :cond_2

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    iget v0, p0, Lq25;->s:I

    .line 54
    .line 55
    const/4 v1, 0x3

    .line 56
    if-ne v0, v1, :cond_6

    .line 57
    .line 58
    iget-boolean v0, p0, Lq25;->r:Z

    .line 59
    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    sub-long v0, p5, p3

    .line 64
    .line 65
    sget-wide v4, Lq25;->P:J

    .line 66
    .line 67
    cmp-long v0, v0, v4

    .line 68
    .line 69
    if-lez v0, :cond_4

    .line 70
    .line 71
    :goto_1
    return-void

    .line 72
    :cond_4
    invoke-virtual {p0}, Lq25;->U1()J

    .line 73
    .line 74
    .line 75
    move-result-wide v0

    .line 76
    sub-long v4, p1, v0

    .line 77
    .line 78
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(J)J

    .line 79
    .line 80
    .line 81
    move-result-wide v4

    .line 82
    cmp-long v2, v4, v2

    .line 83
    .line 84
    if-gez v2, :cond_5

    .line 85
    .line 86
    invoke-virtual {p0, v0, v1}, Lq25;->Y1(J)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_5
    invoke-virtual {p0, p1, p2}, Lq25;->Y1(J)V

    .line 91
    .line 92
    .line 93
    add-long/2addr p3, p5

    .line 94
    const-wide/16 p1, 0x2

    .line 95
    .line 96
    div-long/2addr p3, p1

    .line 97
    iput-wide p3, p0, Lq25;->u:J

    .line 98
    .line 99
    return-void

    .line 100
    :cond_6
    :goto_2
    invoke-virtual {p0, p1, p2}, Lq25;->Y1(J)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public final c2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lq25;->o:Landroid/os/PowerManager$WakeLock;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget-boolean v1, p0, Lq25;->M:Z

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    iget-boolean v1, p0, Lq25;->r:Z

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    iget-boolean p0, p0, Lq25;->C:Z

    .line 15
    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p0, 0x0

    .line 21
    :goto_0
    if-eqz p0, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_2
    if-nez p0, :cond_3

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-eqz p0, :cond_3

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 42
    .line 43
    .line 44
    :cond_3
    :goto_1
    return-void
.end method

.method public final f1(Lpe4;)Lpe4;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p1, Lpe4;->d:I

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p1, Lpe4;->b:Z

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lqe4;->q()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-boolean p0, p0, Lq25;->J:Z

    .line 20
    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p1}, Lpe4;->a()Loe4;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const/4 p1, 0x2

    .line 29
    iput p1, p0, Loe4;->d:I

    .line 30
    .line 31
    new-instance p1, Lpe4;

    .line 32
    .line 33
    invoke-direct {p1, p0}, Lpe4;-><init>(Loe4;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-object p1
.end method

.method public final i1()Lpe4;
    .locals 15

    .line 1
    invoke-virtual {p0}, Lq25;->J1()Lp25;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-wide v2, v0, Lp25;->a:J

    .line 9
    .line 10
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    iget-object v2, p0, Lq25;->p:Ljava/util/List;

    .line 17
    .line 18
    new-instance v3, Ljava/util/ArrayList;

    .line 19
    .line 20
    const/16 v4, 0xa

    .line 21
    .line 22
    invoke-static {v2, v4}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    const/4 v5, 0x1

    .line 38
    if-eqz v4, :cond_3

    .line 39
    .line 40
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    check-cast v4, Lp25;

    .line 45
    .line 46
    new-instance v6, Lge4;

    .line 47
    .line 48
    iget-wide v7, v4, Lp25;->a:J

    .line 49
    .line 50
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-direct {v6, v7}, Lge4;-><init>(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object v7, v4, Lp25;->b:Lgn2;

    .line 58
    .line 59
    iput-object v7, v6, Lge4;->c:Lgn2;

    .line 60
    .line 61
    iput-boolean v5, v6, Lge4;->j:Z

    .line 62
    .line 63
    iget-wide v7, v4, Lp25;->a:J

    .line 64
    .line 65
    if-nez v0, :cond_1

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 69
    .line 70
    .line 71
    move-result-wide v9

    .line 72
    cmp-long v5, v7, v9

    .line 73
    .line 74
    if-nez v5, :cond_2

    .line 75
    .line 76
    iget-wide v7, p0, Lq25;->B:J

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_2
    :goto_2
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    :goto_3
    invoke-virtual {v6, v7, v8}, Lge4;->a(J)V

    .line 85
    .line 86
    .line 87
    iget-object v4, v4, Lp25;->d:Ljw4;

    .line 88
    .line 89
    iput-object v4, v6, Lge4;->b:Ljw4;

    .line 90
    .line 91
    new-instance v4, Lhe4;

    .line 92
    .line 93
    invoke-direct {v4, v6}, Lhe4;-><init>(Lge4;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    iget v0, p0, Lq25;->s:I

    .line 101
    .line 102
    const/4 v2, 0x3

    .line 103
    if-ne v0, v2, :cond_5

    .line 104
    .line 105
    iget-boolean v0, p0, Lq25;->r:Z

    .line 106
    .line 107
    if-eqz v0, :cond_5

    .line 108
    .line 109
    invoke-virtual {p0}, Lq25;->U1()J

    .line 110
    .line 111
    .line 112
    move-result-wide v7

    .line 113
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 114
    .line 115
    .line 116
    move-result-wide v9

    .line 117
    iget-wide v11, p0, Lq25;->B:J

    .line 118
    .line 119
    const-wide/16 v13, 0x0

    .line 120
    .line 121
    cmp-long v0, v11, v13

    .line 122
    .line 123
    if-gtz v0, :cond_4

    .line 124
    .line 125
    const-wide v11, 0x7fffffffffffffffL

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_4
    iget-wide v11, p0, Lq25;->B:J

    .line 132
    .line 133
    const-wide/16 v13, 0x3e8

    .line 134
    .line 135
    div-long/2addr v11, v13

    .line 136
    const-wide/16 v13, 0x1

    .line 137
    .line 138
    sub-long/2addr v11, v13

    .line 139
    :goto_4
    new-instance v6, Lm25;

    .line 140
    .line 141
    invoke-direct/range {v6 .. v12}, Lm25;-><init>(JJJ)V

    .line 142
    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_5
    iget-wide v6, p0, Lq25;->t:J

    .line 146
    .line 147
    new-instance v0, Lxm;

    .line 148
    .line 149
    invoke-direct {v0, v6, v7}, Lxm;-><init>(J)V

    .line 150
    .line 151
    .line 152
    move-object v6, v0

    .line 153
    :goto_5
    new-instance v0, Loe4;

    .line 154
    .line 155
    invoke-direct {v0}, Loe4;-><init>()V

    .line 156
    .line 157
    .line 158
    sget-object v2, Lq25;->U:Lmi3;

    .line 159
    .line 160
    iput-object v2, v0, Loe4;->a:Lmi3;

    .line 161
    .line 162
    iget-object v2, p0, Lq25;->I:Landroidx/media3/common/PlaybackException;

    .line 163
    .line 164
    iput-object v2, v0, Loe4;->f:Landroidx/media3/common/PlaybackException;

    .line 165
    .line 166
    iget-object v2, p0, Lq25;->I:Landroidx/media3/common/PlaybackException;

    .line 167
    .line 168
    if-eqz v2, :cond_6

    .line 169
    .line 170
    move v2, v5

    .line 171
    goto :goto_6

    .line 172
    :cond_6
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-eqz v2, :cond_7

    .line 177
    .line 178
    iget v2, p0, Lq25;->s:I

    .line 179
    .line 180
    if-eq v2, v5, :cond_7

    .line 181
    .line 182
    const/4 v2, 0x4

    .line 183
    goto :goto_6

    .line 184
    :cond_7
    iget v2, p0, Lq25;->s:I

    .line 185
    .line 186
    :goto_6
    iput v2, v0, Loe4;->d:I

    .line 187
    .line 188
    iget-boolean v2, p0, Lq25;->r:Z

    .line 189
    .line 190
    iput-boolean v2, v0, Loe4;->b:Z

    .line 191
    .line 192
    iput v5, v0, Loe4;->c:I

    .line 193
    .line 194
    invoke-virtual {v0, v3}, Loe4;->b(Ljava/util/ArrayList;)V

    .line 195
    .line 196
    .line 197
    iget v2, p0, Lq25;->q:I

    .line 198
    .line 199
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    sub-int/2addr v3, v5

    .line 204
    const/4 v4, 0x0

    .line 205
    invoke-static {v4, v3}, Ljava/lang/Math;->max(II)I

    .line 206
    .line 207
    .line 208
    move-result v3

    .line 209
    invoke-static {v2, v4, v3}, Lgb;->m(III)I

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    iput v2, v0, Loe4;->B:I

    .line 214
    .line 215
    iput-object v1, v0, Loe4;->E:Ljava/lang/Long;

    .line 216
    .line 217
    iput-object v6, v0, Loe4;->F:Lne4;

    .line 218
    .line 219
    iget-boolean v1, p0, Lq25;->v:Z

    .line 220
    .line 221
    if-eqz v1, :cond_8

    .line 222
    .line 223
    iput-boolean v4, p0, Lq25;->v:Z

    .line 224
    .line 225
    iget-wide v1, p0, Lq25;->t:J

    .line 226
    .line 227
    iput-boolean v5, v0, Loe4;->K:Z

    .line 228
    .line 229
    iput v4, v0, Loe4;->L:I

    .line 230
    .line 231
    iput-wide v1, v0, Loe4;->M:J

    .line 232
    .line 233
    :cond_8
    new-instance p0, Lpe4;

    .line 234
    .line 235
    invoke-direct {p0, v0}, Lpe4;-><init>(Loe4;)V

    .line 236
    .line 237
    .line 238
    return-object p0
.end method

.method public final l1(Ljava/util/List;I)Lic2;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lkv3;

    .line 5
    .line 6
    invoke-direct {v0, p2, p1, p0}, Lkv3;-><init>(ILjava/util/List;Lq25;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lq25;->K1(Lif1;)Lic2;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final m1(III)Lic2;
    .locals 1

    .line 1
    new-instance v0, Lh25;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, Lh25;-><init>(III)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lq25;->K1(Lif1;)Lic2;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final n1()Lic2;
    .locals 2

    .line 1
    iget-object v0, p0, Lq25;->I:Landroidx/media3/common/PlaybackException;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-wide v0, p0, Lq25;->t:J

    .line 6
    .line 7
    invoke-virtual {p0, v0, v1}, Lq25;->Q1(J)Lic2;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    iget-object v0, p0, Lq25;->G:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-lez v0, :cond_1

    .line 19
    .line 20
    sget-object p0, Lmw1;->o:Lmw1;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    iget-object v0, p0, Lq25;->D:Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v0, :cond_3

    .line 26
    .line 27
    iget-object v0, p0, Lq25;->D:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {p0}, Lq25;->J1()Lp25;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    iget-object v1, v1, Lp25;->c:Ljava/lang/String;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    const/4 v1, 0x0

    .line 39
    :goto_0
    invoke-static {v0, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    sget-object p0, Lmw1;->o:Lmw1;

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_3
    iget-wide v0, p0, Lq25;->t:J

    .line 49
    .line 50
    invoke-virtual {p0, v0, v1}, Lq25;->Q1(J)Lic2;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method

.method public final o1()Lic2;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lq25;->C:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lq25;->Z1()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lq25;->c2()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lq25;->l:Lmx2;

    .line 11
    .line 12
    new-instance v1, Ll25;

    .line 13
    .line 14
    const/4 v2, 0x3

    .line 15
    invoke-direct {v1, p0, v2}, Ll25;-><init>(Lq25;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lmx2;->b(Ljava/util/concurrent/Callable;)Lic2;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    return-object p0
.end method

.method public final p1(II)Lic2;
    .locals 1

    .line 1
    new-instance v0, Lj25;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lj25;-><init>(II)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lq25;->K1(Lif1;)Lic2;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public final q1(IILjava/util/List;)Lic2;
    .locals 1

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lk25;

    .line 5
    .line 6
    invoke-direct {v0, p1, p2, p3, p0}, Lk25;-><init>(IILjava/util/List;Lq25;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lq25;->K1(Lif1;)Lic2;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public final r1(IIJ)Lic2;
    .locals 8

    .line 1
    const/4 p2, -0x1

    .line 2
    if-eq p1, p2, :cond_1

    .line 3
    .line 4
    if-ltz p1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lq25;->p:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-ge p1, v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string p2, "seek to index "

    .line 18
    .line 19
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p1, " is outside the queue, ignoring it"

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const-string p1, "UpnpPlayer"

    .line 35
    .line 36
    invoke-static {p1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    sget-object p0, Lmw1;->o:Lmw1;

    .line 40
    .line 41
    return-object p0

    .line 42
    :cond_1
    :goto_0
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    cmp-long v2, p3, v0

    .line 48
    .line 49
    if-nez v2, :cond_2

    .line 50
    .line 51
    const-wide/16 p3, 0x0

    .line 52
    .line 53
    :cond_2
    move-wide v4, p3

    .line 54
    if-eq p1, p2, :cond_3

    .line 55
    .line 56
    iget p3, p0, Lq25;->q:I

    .line 57
    .line 58
    if-eq p1, p3, :cond_3

    .line 59
    .line 60
    const/4 p3, 0x1

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    const/4 p3, 0x0

    .line 63
    :goto_1
    if-eq p1, p2, :cond_4

    .line 64
    .line 65
    iput p1, p0, Lq25;->q:I

    .line 66
    .line 67
    :cond_4
    if-nez p3, :cond_5

    .line 68
    .line 69
    iget-object p1, p0, Lq25;->D:Ljava/lang/String;

    .line 70
    .line 71
    if-nez p1, :cond_6

    .line 72
    .line 73
    :cond_5
    move-object v3, p0

    .line 74
    goto :goto_2

    .line 75
    :cond_6
    iget-wide p1, p0, Lq25;->F:J

    .line 76
    .line 77
    iget-wide p3, p0, Lq25;->E:J

    .line 78
    .line 79
    cmp-long p1, p1, p3

    .line 80
    .line 81
    iget-wide p2, p0, Lq25;->E:J

    .line 82
    .line 83
    if-nez p1, :cond_7

    .line 84
    .line 85
    const-wide/16 v0, 0x1

    .line 86
    .line 87
    add-long/2addr p2, v0

    .line 88
    iput-wide p2, p0, Lq25;->E:J

    .line 89
    .line 90
    iget-wide p2, p0, Lq25;->E:J

    .line 91
    .line 92
    :cond_7
    move-wide v6, p2

    .line 93
    iget-object p1, p0, Lq25;->l:Lmx2;

    .line 94
    .line 95
    new-instance v2, Li25;

    .line 96
    .line 97
    move-object v3, p0

    .line 98
    invoke-direct/range {v2 .. v7}, Li25;-><init>(Lq25;JJ)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1, v2}, Lmx2;->b(Ljava/util/concurrent/Callable;)Lic2;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    return-object p0

    .line 109
    :goto_2
    invoke-virtual {v3, v4, v5}, Lq25;->Y1(J)V

    .line 110
    .line 111
    .line 112
    iput-wide v0, v3, Lq25;->B:J

    .line 113
    .line 114
    invoke-virtual {v3, v4, v5}, Lq25;->Q1(J)Lic2;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0
.end method

.method public final s1(Ljava/util/List;IJ)Lic2;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    invoke-static {p1, v1}, Lr40;->k0(Ljava/lang/Iterable;I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lgn2;

    .line 30
    .line 31
    new-instance v2, Lp25;

    .line 32
    .line 33
    iget-wide v3, p0, Lq25;->N:J

    .line 34
    .line 35
    const-wide/16 v5, 0x1

    .line 36
    .line 37
    add-long/2addr v5, v3

    .line 38
    iput-wide v5, p0, Lq25;->N:J

    .line 39
    .line 40
    iget-object v5, p0, Lq25;->m:Lif1;

    .line 41
    .line 42
    invoke-interface {v5, v1}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, Ljava/lang/String;

    .line 47
    .line 48
    invoke-direct {v2, v3, v4, v1, v5}, Lp25;-><init>(JLgn2;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    iput-object v0, p0, Lq25;->p:Ljava/util/List;

    .line 56
    .line 57
    const/4 p1, -0x1

    .line 58
    if-ne p2, p1, :cond_1

    .line 59
    .line 60
    const/4 p2, 0x0

    .line 61
    :cond_1
    iput p2, p0, Lq25;->q:I

    .line 62
    .line 63
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    cmp-long v0, p3, p1

    .line 69
    .line 70
    if-nez v0, :cond_2

    .line 71
    .line 72
    const-wide/16 p3, 0x0

    .line 73
    .line 74
    :cond_2
    invoke-virtual {p0, p3, p4}, Lq25;->Y1(J)V

    .line 75
    .line 76
    .line 77
    iput-wide p1, p0, Lq25;->B:J

    .line 78
    .line 79
    iget-wide p1, p0, Lq25;->t:J

    .line 80
    .line 81
    invoke-virtual {p0, p1, p2}, Lq25;->Q1(J)Lic2;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0
.end method

.method public final t1(Z)Lic2;
    .locals 1

    .line 1
    new-instance v0, Ln25;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, Ln25;-><init>(ZLq25;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lq25;->l:Lmx2;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lmx2;->b(Ljava/util/concurrent/Callable;)Lic2;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final y1()Lic2;
    .locals 2

    .line 1
    new-instance v0, Ll25;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, p0, v1}, Ll25;-><init>(Lq25;I)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lq25;->l:Lmx2;

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Lmx2;->b(Ljava/util/concurrent/Callable;)Lic2;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    return-object p0
.end method
