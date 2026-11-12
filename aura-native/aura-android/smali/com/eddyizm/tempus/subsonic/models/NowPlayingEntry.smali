.class public final Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;
.super Lcom/eddyizm/tempus/subsonic/models/Child;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final id:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "_id"
    .end annotation
.end field

.field private minutesAgo:I

.field private playerId:I

.field private playerName:Ljava/lang/String;

.field private username:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lb23;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lb23;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V
    .locals 39

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v37, 0x7

    .line 5
    .line 6
    const/16 v38, 0x0

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v9, 0x0

    .line 16
    const/4 v10, 0x0

    .line 17
    const/4 v11, 0x0

    .line 18
    const/4 v12, 0x0

    .line 19
    const/4 v13, 0x0

    .line 20
    const/4 v14, 0x0

    .line 21
    const/4 v15, 0x0

    .line 22
    const/16 v16, 0x0

    .line 23
    .line 24
    const/16 v17, 0x0

    .line 25
    .line 26
    const/16 v18, 0x0

    .line 27
    .line 28
    const/16 v19, 0x0

    .line 29
    .line 30
    const/16 v20, 0x0

    .line 31
    .line 32
    const/16 v21, 0x0

    .line 33
    .line 34
    const/16 v22, 0x0

    .line 35
    .line 36
    const/16 v23, 0x0

    .line 37
    .line 38
    const/16 v24, 0x0

    .line 39
    .line 40
    const/16 v25, 0x0

    .line 41
    .line 42
    const/16 v26, 0x0

    .line 43
    .line 44
    const/16 v27, 0x0

    .line 45
    .line 46
    const/16 v28, 0x0

    .line 47
    .line 48
    const/16 v29, 0x0

    .line 49
    .line 50
    const/16 v30, 0x0

    .line 51
    .line 52
    const/16 v31, 0x0

    .line 53
    .line 54
    const/16 v32, 0x0

    .line 55
    .line 56
    const/16 v33, 0x0

    .line 57
    .line 58
    const/16 v34, 0x0

    .line 59
    .line 60
    const/16 v35, 0x0

    .line 61
    .line 62
    const/16 v36, -0x2

    .line 63
    .line 64
    move-object/from16 v0, p0

    .line 65
    .line 66
    move-object/from16 v1, p1

    .line 67
    .line 68
    invoke-direct/range {v0 .. v38}, Lcom/eddyizm/tempus/subsonic/models/Child;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Integer;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;Ljava/lang/String;IILxj0;)V

    .line 69
    .line 70
    .line 71
    iput-object v1, v0, Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;->id:Ljava/lang/String;

    .line 72
    .line 73
    move-object/from16 v1, p2

    .line 74
    .line 75
    iput-object v1, v0, Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;->username:Ljava/lang/String;

    .line 76
    .line 77
    move/from16 v1, p3

    .line 78
    .line 79
    iput v1, v0, Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;->minutesAgo:I

    .line 80
    .line 81
    move/from16 v1, p4

    .line 82
    .line 83
    iput v1, v0, Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;->playerId:I

    .line 84
    .line 85
    move-object/from16 v1, p5

    .line 86
    .line 87
    iput-object v1, v0, Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;->playerName:Ljava/lang/String;

    .line 88
    .line 89
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILxj0;)V
    .locals 2

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    const/4 v1, 0x0

    if-eqz p7, :cond_1

    move p3, v1

    :cond_1
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_2

    move p4, v1

    :cond_2
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_3

    move-object p5, v0

    .line 90
    :cond_3
    invoke-direct/range {p0 .. p5}, Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;-><init>(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public getId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getMinutesAgo()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;->minutesAgo:I

    .line 2
    .line 3
    return p0
.end method

.method public final getPlayerId()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;->playerId:I

    .line 2
    .line 3
    return p0
.end method

.method public final getPlayerName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;->playerName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getUsername()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;->username:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setMinutesAgo(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;->minutesAgo:I

    .line 2
    .line 3
    return-void
.end method

.method public final setPlayerId(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;->playerId:I

    .line 2
    .line 3
    return-void
.end method

.method public final setPlayerName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;->playerName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setUsername(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;->username:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;->id:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;->username:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget p2, p0, Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;->minutesAgo:I

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 17
    .line 18
    .line 19
    iget p2, p0, Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;->playerId:I

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/NowPlayingEntry;->playerName:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
