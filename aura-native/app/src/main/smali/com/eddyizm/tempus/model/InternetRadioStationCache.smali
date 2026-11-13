.class public final Lcom/eddyizm/tempus/model/InternetRadioStationCache;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8

.field public static final Companion:Ldefpackage/a12;

.field public static final SOURCE_LOCAL:Ljava/lang/String; = "local"

.field public static final SOURCE_SUBSONIC:Ljava/lang/String; = "subsonic"


# instance fields
.field private coverArtUrl:Ljava/lang/String;

.field private homePageUrl:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private source:Ljava/lang/String;

.field private streamUrl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ldefpackage/a12;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->Companion:Ldefpackage/a12;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 59
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILdefpackage/xj0;)V

    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;)V
    .locals 8

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    move-object v2, v0

    .line 61
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getName()Ljava/lang/String;

    move-result-object v3

    .line 62
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getStreamUrl()Ljava/lang/String;

    move-result-object v4

    .line 63
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getHomePageUrl()Ljava/lang/String;

    move-result-object v5

    .line 64
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getSource()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "subsonic"

    :cond_1
    move-object v6, v0

    .line 65
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getCoverArt()Ljava/lang/String;

    move-result-object v7

    move-object v1, p0

    .line 66
    invoke-direct/range {v1 .. v7}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    iput-object p1, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->id:Ljava/lang/String;

    .line 54
    iput-object p2, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->name:Ljava/lang/String;

    .line 55
    iput-object p3, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->streamUrl:Ljava/lang/String;

    .line 56
    iput-object p4, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->homePageUrl:Ljava/lang/String;

    .line 57
    iput-object p5, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->source:Ljava/lang/String;

    .line 58
    iput-object p6, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->coverArtUrl:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILdefpackage/xj0;)V
    .locals 1

    .line 1
    and-int/lit8 p8, p7, 0x1

    .line 2
    .line 3
    if-eqz p8, :cond_0

    .line 4
    .line 5
    const-string p1, ""

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p8, p7, 0x2

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p8, :cond_1

    .line 11
    .line 12
    move-object p2, v0

    .line 13
    :cond_1
    and-int/lit8 p8, p7, 0x4

    .line 14
    .line 15
    if-eqz p8, :cond_2

    .line 16
    .line 17
    move-object p3, v0

    .line 18
    :cond_2
    and-int/lit8 p8, p7, 0x8

    .line 19
    .line 20
    if-eqz p8, :cond_3

    .line 21
    .line 22
    move-object p4, v0

    .line 23
    :cond_3
    and-int/lit8 p8, p7, 0x10

    .line 24
    .line 25
    if-eqz p8, :cond_4

    .line 26
    .line 27
    const-string p5, "subsonic"

    .line 28
    .line 29
    :cond_4
    and-int/lit8 p7, p7, 0x20

    .line 30
    .line 31
    if-eqz p7, :cond_5

    .line 32
    .line 33
    move-object p8, v0

    .line 34
    move-object p6, p4

    .line 35
    move-object p7, p5

    .line 36
    move-object p4, p2

    .line 37
    move-object p5, p3

    .line 38
    move-object p2, p0

    .line 39
    move-object p3, p1

    .line 40
    goto :goto_0

    .line 41
    :cond_5
    move-object p8, p6

    .line 42
    move-object p7, p5

    .line 43
    move-object p5, p3

    .line 44
    move-object p6, p4

    .line 45
    move-object p3, p1

    .line 46
    move-object p4, p2

    .line 47
    move-object p2, p0

    .line 48
    :goto_0
    invoke-direct/range {p2 .. p8}, Lcom/eddyizm/tempus/model/InternetRadioStationCache;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public final getCoverArtUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->coverArtUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getHomePageUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->homePageUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSource()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->source:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getStreamUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->streamUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setCoverArtUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->coverArtUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setHomePageUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->homePageUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setId(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->id:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public final setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setSource(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->source:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public final setStreamUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->streamUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final toInternetRadioStation()Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;
    .locals 7

    .line 1
    new-instance v0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->id:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->name:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->streamUrl:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->homePageUrl:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->coverArtUrl:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v6, p0, Lcom/eddyizm/tempus/model/InternetRadioStationCache;->source:Ljava/lang/String;

    .line 14
    .line 15
    invoke-direct/range {v0 .. v6}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
