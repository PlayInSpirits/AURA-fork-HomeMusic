.class public final Lcom/eddyizm/tempus/subsonic/models/VideoInfo;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private audioTracks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/AudioTrack;",
            ">;"
        }
    .end annotation
.end field

.field private captions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/Captions;",
            ">;"
        }
    .end annotation
.end field

.field private conversions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/VideoConversion;",
            ">;"
        }
    .end annotation
.end field

.field private id:Ljava/lang/String;


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
.method public final getAudioTracks()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/AudioTrack;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/VideoInfo;->audioTracks:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCaptions()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/Captions;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/VideoInfo;->captions:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getConversions()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/VideoConversion;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/VideoInfo;->conversions:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/VideoInfo;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setAudioTracks(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/AudioTrack;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/VideoInfo;->audioTracks:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setCaptions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/Captions;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/VideoInfo;->captions:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setConversions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/VideoConversion;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/VideoInfo;->conversions:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/VideoInfo;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
