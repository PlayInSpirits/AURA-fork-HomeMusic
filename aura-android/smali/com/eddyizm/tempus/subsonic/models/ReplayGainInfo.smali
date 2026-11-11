.class public final Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final $stable:I = 0x8

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private albumGain:Ljava/lang/Float;

.field private albumPeak:Ljava/lang/Float;

.field private baseGain:Ljava/lang/Float;

.field private fallbackGain:Ljava/lang/Float;

.field private trackGain:Ljava/lang/Float;

.field private trackPeak:Ljava/lang/Float;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lb23;

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lb23;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 43
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;-><init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;ILxj0;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->trackGain:Ljava/lang/Float;

    .line 38
    iput-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->albumGain:Ljava/lang/Float;

    .line 39
    iput-object p3, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->trackPeak:Ljava/lang/Float;

    .line 40
    iput-object p4, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->albumPeak:Ljava/lang/Float;

    .line 41
    iput-object p5, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->baseGain:Ljava/lang/Float;

    .line 42
    iput-object p6, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->fallbackGain:Ljava/lang/Float;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;ILxj0;)V
    .locals 1

    .line 1
    and-int/lit8 p8, p7, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p8, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p8, p7, 0x2

    .line 8
    .line 9
    if-eqz p8, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    and-int/lit8 p8, p7, 0x4

    .line 13
    .line 14
    if-eqz p8, :cond_2

    .line 15
    .line 16
    move-object p3, v0

    .line 17
    :cond_2
    and-int/lit8 p8, p7, 0x8

    .line 18
    .line 19
    if-eqz p8, :cond_3

    .line 20
    .line 21
    move-object p4, v0

    .line 22
    :cond_3
    and-int/lit8 p8, p7, 0x10

    .line 23
    .line 24
    if-eqz p8, :cond_4

    .line 25
    .line 26
    move-object p5, v0

    .line 27
    :cond_4
    and-int/lit8 p7, p7, 0x20

    .line 28
    .line 29
    if-eqz p7, :cond_5

    .line 30
    .line 31
    move-object p6, v0

    .line 32
    :cond_5
    invoke-direct/range {p0 .. p6}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;-><init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public static synthetic copy$default(Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;ILjava/lang/Object;)Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;
    .locals 0

    .line 1
    and-int/lit8 p8, p7, 0x1

    .line 2
    .line 3
    if-eqz p8, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->trackGain:Ljava/lang/Float;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p8, p7, 0x2

    .line 8
    .line 9
    if-eqz p8, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->albumGain:Ljava/lang/Float;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p8, p7, 0x4

    .line 14
    .line 15
    if-eqz p8, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->trackPeak:Ljava/lang/Float;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p8, p7, 0x8

    .line 20
    .line 21
    if-eqz p8, :cond_3

    .line 22
    .line 23
    iget-object p4, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->albumPeak:Ljava/lang/Float;

    .line 24
    .line 25
    :cond_3
    and-int/lit8 p8, p7, 0x10

    .line 26
    .line 27
    if-eqz p8, :cond_4

    .line 28
    .line 29
    iget-object p5, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->baseGain:Ljava/lang/Float;

    .line 30
    .line 31
    :cond_4
    and-int/lit8 p7, p7, 0x20

    .line 32
    .line 33
    if-eqz p7, :cond_5

    .line 34
    .line 35
    iget-object p6, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->fallbackGain:Ljava/lang/Float;

    .line 36
    .line 37
    :cond_5
    move-object p7, p5

    .line 38
    move-object p8, p6

    .line 39
    move-object p5, p3

    .line 40
    move-object p6, p4

    .line 41
    move-object p3, p1

    .line 42
    move-object p4, p2

    .line 43
    move-object p2, p0

    .line 44
    invoke-virtual/range {p2 .. p8}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->copy(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Float;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->trackGain:Ljava/lang/Float;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component2()Ljava/lang/Float;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->albumGain:Ljava/lang/Float;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component3()Ljava/lang/Float;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->trackPeak:Ljava/lang/Float;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component4()Ljava/lang/Float;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->albumPeak:Ljava/lang/Float;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component5()Ljava/lang/Float;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->baseGain:Ljava/lang/Float;

    .line 2
    .line 3
    return-object p0
.end method

.method public final component6()Ljava/lang/Float;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->fallbackGain:Ljava/lang/Float;

    .line 2
    .line 3
    return-object p0
.end method

.method public final copy(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;
    .locals 0

    .line 1
    new-instance p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 2
    .line 3
    invoke-direct/range {p0 .. p6}, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;-><init>(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final describeContents()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->trackGain:Ljava/lang/Float;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->trackGain:Ljava/lang/Float;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->albumGain:Ljava/lang/Float;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->albumGain:Ljava/lang/Float;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->trackPeak:Ljava/lang/Float;

    .line 36
    .line 37
    iget-object v3, p1, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->trackPeak:Ljava/lang/Float;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->albumPeak:Ljava/lang/Float;

    .line 47
    .line 48
    iget-object v3, p1, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->albumPeak:Ljava/lang/Float;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->baseGain:Ljava/lang/Float;

    .line 58
    .line 59
    iget-object v3, p1, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->baseGain:Ljava/lang/Float;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->fallbackGain:Ljava/lang/Float;

    .line 69
    .line 70
    iget-object p1, p1, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->fallbackGain:Ljava/lang/Float;

    .line 71
    .line 72
    invoke-static {p0, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-nez p0, :cond_7

    .line 77
    .line 78
    return v2

    .line 79
    :cond_7
    return v0
.end method

.method public final getAlbumGain()Ljava/lang/Float;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->albumGain:Ljava/lang/Float;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAlbumPeak()Ljava/lang/Float;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->albumPeak:Ljava/lang/Float;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getBaseGain()Ljava/lang/Float;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->baseGain:Ljava/lang/Float;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getFallbackGain()Ljava/lang/Float;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->fallbackGain:Ljava/lang/Float;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTrackGain()Ljava/lang/Float;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->trackGain:Ljava/lang/Float;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTrackPeak()Ljava/lang/Float;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->trackPeak:Ljava/lang/Float;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hasAnyValue()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->trackGain:Ljava/lang/Float;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->albumGain:Ljava/lang/Float;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->trackPeak:Ljava/lang/Float;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->albumPeak:Ljava/lang/Float;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->baseGain:Ljava/lang/Float;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->fallbackGain:Ljava/lang/Float;

    .line 22
    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 29
    return p0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->trackGain:Ljava/lang/Float;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->albumGain:Ljava/lang/Float;

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    move v2, v1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    :goto_1
    add-int/2addr v0, v2

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v2, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->trackPeak:Ljava/lang/Float;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    move v2, v1

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    :goto_2
    add-int/2addr v0, v2

    .line 38
    mul-int/lit8 v0, v0, 0x1f

    .line 39
    .line 40
    iget-object v2, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->albumPeak:Ljava/lang/Float;

    .line 41
    .line 42
    if-nez v2, :cond_3

    .line 43
    .line 44
    move v2, v1

    .line 45
    goto :goto_3

    .line 46
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    :goto_3
    add-int/2addr v0, v2

    .line 51
    mul-int/lit8 v0, v0, 0x1f

    .line 52
    .line 53
    iget-object v2, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->baseGain:Ljava/lang/Float;

    .line 54
    .line 55
    if-nez v2, :cond_4

    .line 56
    .line 57
    move v2, v1

    .line 58
    goto :goto_4

    .line 59
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    :goto_4
    add-int/2addr v0, v2

    .line 64
    mul-int/lit8 v0, v0, 0x1f

    .line 65
    .line 66
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->fallbackGain:Ljava/lang/Float;

    .line 67
    .line 68
    if-nez p0, :cond_5

    .line 69
    .line 70
    goto :goto_5

    .line 71
    :cond_5
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    :goto_5
    add-int/2addr v0, v1

    .line 76
    return v0
.end method

.method public final setAlbumGain(Ljava/lang/Float;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->albumGain:Ljava/lang/Float;

    .line 2
    .line 3
    return-void
.end method

.method public final setAlbumPeak(Ljava/lang/Float;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->albumPeak:Ljava/lang/Float;

    .line 2
    .line 3
    return-void
.end method

.method public final setBaseGain(Ljava/lang/Float;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->baseGain:Ljava/lang/Float;

    .line 2
    .line 3
    return-void
.end method

.method public final setFallbackGain(Ljava/lang/Float;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->fallbackGain:Ljava/lang/Float;

    .line 2
    .line 3
    return-void
.end method

.method public final setTrackGain(Ljava/lang/Float;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->trackGain:Ljava/lang/Float;

    .line 2
    .line 3
    return-void
.end method

.method public final setTrackPeak(Ljava/lang/Float;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->trackPeak:Ljava/lang/Float;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->trackGain:Ljava/lang/Float;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->albumGain:Ljava/lang/Float;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->trackPeak:Ljava/lang/Float;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->albumPeak:Ljava/lang/Float;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->baseGain:Ljava/lang/Float;

    .line 10
    .line 11
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->fallbackGain:Ljava/lang/Float;

    .line 12
    .line 13
    new-instance v5, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v6, "ReplayGainInfo(trackGain="

    .line 16
    .line 17
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, ", albumGain="

    .line 24
    .line 25
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v0, ", trackPeak="

    .line 32
    .line 33
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v0, ", albumPeak="

    .line 40
    .line 41
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string v0, ", baseGain="

    .line 48
    .line 49
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v0, ", fallbackGain="

    .line 56
    .line 57
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p0, ")"

    .line 64
    .line 65
    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->trackGain:Ljava/lang/Float;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    .line 22
    .line 23
    .line 24
    :goto_0
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->albumGain:Ljava/lang/Float;

    .line 25
    .line 26
    if-nez p2, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 29
    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    .line 40
    .line 41
    .line 42
    :goto_1
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->trackPeak:Ljava/lang/Float;

    .line 43
    .line 44
    if-nez p2, :cond_2

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    .line 58
    .line 59
    .line 60
    :goto_2
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->albumPeak:Ljava/lang/Float;

    .line 61
    .line 62
    if-nez p2, :cond_3

    .line 63
    .line 64
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 65
    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_3
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    .line 76
    .line 77
    .line 78
    :goto_3
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->baseGain:Ljava/lang/Float;

    .line 79
    .line 80
    if-nez p2, :cond_4

    .line 81
    .line 82
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 83
    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_4
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeFloat(F)V

    .line 94
    .line 95
    .line 96
    :goto_4
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;->fallbackGain:Ljava/lang/Float;

    .line 97
    .line 98
    if-nez p0, :cond_5

    .line 99
    .line 100
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_5
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 108
    .line 109
    .line 110
    move-result p0

    .line 111
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeFloat(F)V

    .line 112
    .line 113
    .line 114
    return-void
.end method
