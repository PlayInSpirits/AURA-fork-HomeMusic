.class public final Lcom/eddyizm/tempus/homemusic/HubMix;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private description:Ljava/lang/String;

.field private id:J

.field private ndPlaylistId:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "nd_playlist_id"
    .end annotation
.end field

.field private ready:I

.field private title:Ljava/lang/String;

.field private total:I

.field private tracks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/eddyizm/tempus/homemusic/WaveTrack;",
            ">;"
        }
    .end annotation
.end field


# direct methods
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
.method public final getDescription()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubMix;->description:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/eddyizm/tempus/homemusic/HubMix;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getNdPlaylistId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubMix;->ndPlaylistId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getReady()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/homemusic/HubMix;->ready:I

    .line 2
    .line 3
    return p0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubMix;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTotal()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/homemusic/HubMix;->total:I

    .line 2
    .line 3
    return p0
.end method

.method public final getTracks()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/homemusic/WaveTrack;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubMix;->tracks:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setDescription(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubMix;->description:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/eddyizm/tempus/homemusic/HubMix;->id:J

    .line 2
    .line 3
    return-void
.end method

.method public final setNdPlaylistId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubMix;->ndPlaylistId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setReady(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/eddyizm/tempus/homemusic/HubMix;->ready:I

    .line 2
    .line 3
    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubMix;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setTotal(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/eddyizm/tempus/homemusic/HubMix;->total:I

    .line 2
    .line 3
    return-void
.end method

.method public final setTracks(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/eddyizm/tempus/homemusic/WaveTrack;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubMix;->tracks:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method
