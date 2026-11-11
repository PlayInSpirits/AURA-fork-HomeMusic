.class public final Lkn2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final b:Ljava/lang/Object;

.field public static final c:Ljava/util/HashMap;


# instance fields
.field public final a:Ltn2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lkn2;->b:Ljava/lang/Object;

    .line 7
    .line 8
    new-instance v0, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lkn2;->c:Ljava/util/HashMap;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/service/MediaService;Landroidx/media3/exoplayer/ExoPlayer;Landroid/app/PendingIntent;Lyw1;Lyw1;Lyw1;Lpq;Landroid/os/Bundle;Landroid/os/Bundle;Lx7;)V
    .locals 12

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v2, Lkn2;->b:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v2

    .line 9
    :try_start_0
    sget-object v3, Lkn2;->c:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-nez v4, :cond_0

    .line 16
    .line 17
    invoke-virtual {v3, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    new-instance v0, Ltn2;

    .line 22
    .line 23
    move-object v1, p0

    .line 24
    move-object v2, p1

    .line 25
    move-object v3, p2

    .line 26
    move-object v4, p3

    .line 27
    move-object/from16 v5, p4

    .line 28
    .line 29
    move-object/from16 v6, p5

    .line 30
    .line 31
    move-object/from16 v7, p6

    .line 32
    .line 33
    move-object/from16 v8, p7

    .line 34
    .line 35
    move-object/from16 v9, p8

    .line 36
    .line 37
    move-object/from16 v10, p9

    .line 38
    .line 39
    move-object/from16 v11, p10

    .line 40
    .line 41
    invoke-direct/range {v0 .. v11}, Ltn2;-><init>(Lkn2;Lcom/eddyizm/tempus/service/MediaService;Landroidx/media3/exoplayer/ExoPlayer;Landroid/app/PendingIntent;Lyw1;Lyw1;Lyw1;Lpq;Landroid/os/Bundle;Landroid/os/Bundle;Lx7;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lkn2;->a:Ltn2;

    .line 45
    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 50
    .line 51
    const-string v1, "Session ID must be unique. ID="

    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :goto_0
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    throw v0
.end method


# virtual methods
.method public final a()Lqi3;
    .locals 0

    .line 1
    iget-object p0, p0, Lkn2;->a:Ltn2;

    .line 2
    .line 3
    iget-object p0, p0, Ltn2;->s:Lal3;

    .line 4
    .line 5
    iget-object p0, p0, Lal3;->b:Lqi3;

    .line 6
    .line 7
    return-object p0
.end method

.method public final b(Lfr2;)Z
    .locals 1

    .line 1
    iget-object p0, p0, Lkn2;->a:Ltn2;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p1, Lfr2;->a:Lms2;

    .line 7
    .line 8
    iget-object p1, p0, Lms2;->a:Los2;

    .line 9
    .line 10
    iget-object p1, p1, Los2;->a:Ljava/lang/String;

    .line 11
    .line 12
    const-string v0, "com.android.car.media"

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    iget-object p0, p0, Lms2;->a:Los2;

    .line 21
    .line 22
    iget-object p0, p0, Los2;->a:Ljava/lang/String;

    .line 23
    .line 24
    const-string p1, "com.android.car.carlauncher"

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    return p0

    .line 35
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 36
    return p0
.end method
