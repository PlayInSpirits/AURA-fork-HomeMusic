.class public final Lcom/eddyizm/tempus/homemusic/PlayEvent;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8

.field public static final Companion:Ldefpackage/ih3;

.field public static final DISLIKE:Ljava/lang/String; = "dislike"

.field public static final FINISH:Ljava/lang/String; = "finish"

.field public static final LIKE:Ljava/lang/String; = "like"

.field public static final SKIP:Ljava/lang/String; = "skip"

.field public static final START:Ljava/lang/String; = "start"

.field public static final UNDISLIKE:Ljava/lang/String; = "undislike"

.field public static final UNLIKE:Ljava/lang/String; = "unlike"


# instance fields
.field private final account:Ljava/lang/String;
    .annotation runtime Ldefpackage/ka4;
        value = "_account"
    .end annotation
.end field

.field private final client:Ljava/lang/String;

.field private final compensationChain:Z
    .annotation runtime Ldefpackage/ka4;
        value = "_compensation_chain"
    .end annotation
.end field

.field private final context:Ljava/lang/String;

.field private final deviceId:Ljava/lang/String;
    .annotation runtime Ldefpackage/ka4;
        value = "device_id"
    .end annotation
.end field

.field private final durationS:Ljava/lang/Double;
    .annotation runtime Ldefpackage/ka4;
        value = "duration_s"
    .end annotation
.end field

.field private final eventId:Ljava/lang/String;
    .annotation runtime Ldefpackage/ka4;
        value = "event_id"
    .end annotation
.end field

.field private final kind:Ljava/lang/String;

.field private final launchId:Ljava/lang/String;
    .annotation runtime Ldefpackage/ka4;
        value = "launch_id"
    .end annotation
.end field

.field private final launchOrigin:Ljava/lang/String;
    .annotation runtime Ldefpackage/ka4;
        value = "launch_origin"
    .end annotation
.end field

.field private final listenedMs:Ljava/lang/Long;
    .annotation runtime Ldefpackage/ka4;
        value = "listened_ms"
    .end annotation
.end field

.field private final ndAlbumId:Ljava/lang/String;
    .annotation runtime Ldefpackage/ka4;
        value = "nd_album_id"
    .end annotation
.end field

.field private final ndArtistId:Ljava/lang/String;
    .annotation runtime Ldefpackage/ka4;
        value = "nd_artist_id"
    .end annotation
.end field

.field private final ndSongId:Ljava/lang/String;
    .annotation runtime Ldefpackage/ka4;
        value = "nd_song_id"
    .end annotation
.end field

.field private final playbackId:Ljava/lang/String;
    .annotation runtime Ldefpackage/ka4;
        value = "playback_id"
    .end annotation
.end field

.field private final positionS:Ljava/lang/Double;
    .annotation runtime Ldefpackage/ka4;
        value = "position_s"
    .end annotation
.end field

.field private final ref:Ljava/lang/String;

.field private rejected:Ljava/lang/String;
    .annotation runtime Ldefpackage/ka4;
        value = "_rejected"
    .end annotation
.end field

.field private final revertsEventId:Ljava/lang/String;
    .annotation runtime Ldefpackage/ka4;
        value = "reverts_event_id"
    .end annotation
.end field

.field private final targetData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ldefpackage/ka4;
        value = "target_data"
    .end annotation
.end field

.field private final targetType:Ljava/lang/String;
    .annotation runtime Ldefpackage/ka4;
        value = "target_type"
    .end annotation
.end field

.field private final trackMetadata:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation runtime Ldefpackage/ka4;
        value = "track_metadata"
    .end annotation
.end field

.field private final ts:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/ih3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->Companion:Ldefpackage/ih3;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            "Ljava/lang/Double;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->eventId:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->ts:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->kind:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->ref:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->ndSongId:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->positionS:Ljava/lang/Double;

    .line 9
    iput-object p7, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->durationS:Ljava/lang/Double;

    .line 10
    iput-object p8, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->context:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->client:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->targetType:Ljava/lang/String;

    .line 13
    iput-object p11, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->ndAlbumId:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->ndArtistId:Ljava/lang/String;

    .line 15
    iput-object p13, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->targetData:Ljava/util/Map;

    .line 16
    iput-object p14, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->revertsEventId:Ljava/lang/String;

    .line 17
    iput-boolean p15, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->compensationChain:Z

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->account:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->playbackId:Ljava/lang/String;

    move-object/from16 p1, p18

    .line 20
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->deviceId:Ljava/lang/String;

    move-object/from16 p1, p19

    .line 21
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->listenedMs:Ljava/lang/Long;

    move-object/from16 p1, p20

    .line 22
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->trackMetadata:Ljava/util/Map;

    move-object/from16 p1, p21

    .line 23
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->rejected:Ljava/lang/String;

    move-object/from16 p1, p22

    .line 24
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->launchId:Ljava/lang/String;

    move-object/from16 p1, p23

    .line 25
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->launchOrigin:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILdefpackage/xj0;)V
    .locals 27

    move/from16 v0, p24

    and-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v7, v2

    goto :goto_0

    :cond_0
    move-object/from16 v7, p4

    :goto_0
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_1

    move-object v8, v2

    goto :goto_1

    :cond_1
    move-object/from16 v8, p5

    :goto_1
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_2

    move-object v9, v2

    goto :goto_2

    :cond_2
    move-object/from16 v9, p6

    :goto_2
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_3

    move-object v10, v2

    goto :goto_3

    :cond_3
    move-object/from16 v10, p7

    :goto_3
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_4

    move-object v11, v2

    goto :goto_4

    :cond_4
    move-object/from16 v11, p8

    :goto_4
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_5

    move-object v13, v2

    goto :goto_5

    :cond_5
    move-object/from16 v13, p10

    :goto_5
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_6

    move-object v14, v2

    goto :goto_6

    :cond_6
    move-object/from16 v14, p11

    :goto_6
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_7

    move-object v15, v2

    goto :goto_7

    :cond_7
    move-object/from16 v15, p12

    :goto_7
    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_8

    move-object/from16 v16, v2

    goto :goto_8

    :cond_8
    move-object/from16 v16, p13

    :goto_8
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_9

    move-object/from16 v17, v2

    goto :goto_9

    :cond_9
    move-object/from16 v17, p14

    :goto_9
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_a

    const/4 v1, 0x0

    move/from16 v18, v1

    goto :goto_a

    :cond_a
    move/from16 v18, p15

    :goto_a
    const v1, 0x8000

    and-int/2addr v1, v0

    if-eqz v1, :cond_b

    move-object/from16 v19, v2

    goto :goto_b

    :cond_b
    move-object/from16 v19, p16

    :goto_b
    const/high16 v1, 0x10000

    and-int/2addr v1, v0

    if-eqz v1, :cond_c

    move-object/from16 v20, v2

    goto :goto_c

    :cond_c
    move-object/from16 v20, p17

    :goto_c
    const/high16 v1, 0x20000

    and-int/2addr v1, v0

    if-eqz v1, :cond_d

    move-object/from16 v21, v2

    goto :goto_d

    :cond_d
    move-object/from16 v21, p18

    :goto_d
    const/high16 v1, 0x40000

    and-int/2addr v1, v0

    if-eqz v1, :cond_e

    move-object/from16 v22, v2

    goto :goto_e

    :cond_e
    move-object/from16 v22, p19

    :goto_e
    const/high16 v1, 0x80000

    and-int/2addr v1, v0

    if-eqz v1, :cond_f

    move-object/from16 v23, v2

    goto :goto_f

    :cond_f
    move-object/from16 v23, p20

    :goto_f
    const/high16 v1, 0x100000

    and-int/2addr v1, v0

    if-eqz v1, :cond_10

    move-object/from16 v24, v2

    goto :goto_10

    :cond_10
    move-object/from16 v24, p21

    :goto_10
    const/high16 v1, 0x200000

    and-int/2addr v1, v0

    if-eqz v1, :cond_11

    move-object/from16 v25, v2

    goto :goto_11

    :cond_11
    move-object/from16 v25, p22

    :goto_11
    const/high16 v1, 0x400000

    and-int/2addr v0, v1

    if-eqz v0, :cond_12

    move-object/from16 v26, v2

    :goto_12
    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move-object/from16 v5, p2

    move-object/from16 v6, p3

    move-object/from16 v12, p9

    goto :goto_13

    :cond_12
    move-object/from16 v26, p23

    goto :goto_12

    .line 1
    :goto_13
    invoke-direct/range {v3 .. v26}, Lcom/eddyizm/tempus/homemusic/PlayEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic supported$default(Lcom/eddyizm/tempus/homemusic/PlayEvent;ZZZILjava/lang/Object;)Z
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    move p2, p1

    .line 6
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 7
    .line 8
    if-eqz p4, :cond_1

    .line 9
    .line 10
    const/4 p3, 0x1

    .line 11
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->supported(ZZZ)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method


# virtual methods
.method public final getAccount()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->account:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getClient()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->client:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCompensationChain()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->compensationChain:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getContext()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->context:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDeviceId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->deviceId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDurationS()Ljava/lang/Double;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->durationS:Ljava/lang/Double;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getEventId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->eventId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getKind()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->kind:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLaunchId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->launchId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLaunchOrigin()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->launchOrigin:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getListenedMs()Ljava/lang/Long;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->listenedMs:Ljava/lang/Long;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getNdAlbumId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->ndAlbumId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getNdArtistId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->ndArtistId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getNdSongId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->ndSongId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPlaybackId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->playbackId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPositionS()Ljava/lang/Double;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->positionS:Ljava/lang/Double;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getRef()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->ref:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getRejected()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->rejected:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getRevertsEventId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->revertsEventId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTargetData()Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->targetData:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTargetType()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->targetType:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTrackMetadata()Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->trackMetadata:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTs()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->ts:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setRejected(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->rejected:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final supported(ZZZ)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->kind:Ljava/lang/String;

    .line 2
    .line 3
    const-string v1, "progress"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->kind:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "interrupted"

    .line 14
    .line 15
    invoke-static {v0, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->kind:Ljava/lang/String;

    .line 22
    .line 23
    const-string v1, "error"

    .line 24
    .line 25
    invoke-static {v0, v1}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    :cond_0
    if-eqz p3, :cond_5

    .line 32
    .line 33
    :cond_1
    iget-boolean p3, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->compensationChain:Z

    .line 34
    .line 35
    if-eqz p3, :cond_2

    .line 36
    .line 37
    if-eqz p2, :cond_5

    .line 38
    .line 39
    :cond_2
    if-nez p1, :cond_4

    .line 40
    .line 41
    iget-object p1, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->targetType:Ljava/lang/String;

    .line 42
    .line 43
    if-eqz p1, :cond_3

    .line 44
    .line 45
    const-string p2, "track"

    .line 46
    .line 47
    invoke-static {p1, p2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    if-eqz p1, :cond_5

    .line 52
    .line 53
    :cond_3
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/PlayEvent;->revertsEventId:Ljava/lang/String;

    .line 54
    .line 55
    if-nez p0, :cond_5

    .line 56
    .line 57
    :cond_4
    const/4 p0, 0x1

    .line 58
    return p0

    .line 59
    :cond_5
    const/4 p0, 0x0

    .line 60
    return p0
.end method
