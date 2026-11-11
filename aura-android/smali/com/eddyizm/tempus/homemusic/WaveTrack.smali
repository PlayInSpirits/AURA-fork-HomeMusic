.class public Lcom/eddyizm/tempus/homemusic/WaveTrack;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/eddyizm/tempus/homemusic/WaveTrack$Companion;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/eddyizm/tempus/homemusic/WaveTrack$Companion;

.field public static final SEED:Ljava/lang/String; = "seed"


# instance fields
.field private album:Ljava/lang/String;

.field private artist:Ljava/lang/String;

.field private coverUrl:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "cover_url"
    .end annotation
.end field

.field private durationS:Ljava/lang/Double;
    .annotation runtime Lka4;
        value = "duration_s"
    .end annotation
.end field

.field private generator:Ljava/lang/String;

.field private ndSongId:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "nd_song_id"
    .end annotation
.end field

.field private owned:Z

.field private ref:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/eddyizm/tempus/homemusic/WaveTrack$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/eddyizm/tempus/homemusic/WaveTrack$Companion;-><init>(Lxj0;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->Companion:Lcom/eddyizm/tempus/homemusic/WaveTrack$Companion;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->$stable:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getAlbum()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->album:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getArtist()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->artist:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCoverUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->coverUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDurationS()Ljava/lang/Double;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->durationS:Ljava/lang/Double;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getGenerator()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->generator:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getNdSongId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->ndSongId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOwned()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->owned:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getRef()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->ref:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSongId()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->ndSongId:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-boolean p0, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->owned:Z

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-static {v0}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    return-object v1
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final item(Ljava/lang/String;)Lcom/eddyizm/tempus/homemusic/HubTracks$Item;
    .locals 2

    .line 1
    new-instance v0, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/WaveTrack;->getSongId()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->setSongId(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->ref:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->setRef(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->title:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->setTitle(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->artist:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->setArtist(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->album:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->setAlbum(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->coverUrl:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->setCoverUrl(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->durationS:Ljava/lang/Double;

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->setDurationS(Ljava/lang/Double;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p1}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->setContext(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    const-string p0, "wave:"

    .line 49
    .line 50
    const/4 v1, 0x0

    .line 51
    invoke-static {p1, p0, v1}, Lxm4;->k0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    const/4 v1, 0x1

    .line 56
    if-ne p0, v1, :cond_0

    .line 57
    .line 58
    invoke-virtual {v0, p1}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->setLaunchId(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string p0, "wave"

    .line 62
    .line 63
    invoke-virtual {v0, p0}, Lcom/eddyizm/tempus/homemusic/HubTracks$Item;->setLaunchOrigin(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_0
    return-object v0
.end method

.method public final setAlbum(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->album:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setArtist(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->artist:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setCoverUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->coverUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setDurationS(Ljava/lang/Double;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->durationS:Ljava/lang/Double;

    .line 2
    .line 3
    return-void
.end method

.method public final setGenerator(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->generator:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setNdSongId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->ndSongId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setOwned(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->owned:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setRef(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->ref:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/WaveTrack;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
