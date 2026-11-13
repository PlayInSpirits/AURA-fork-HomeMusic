.class public final Lcom/eddyizm/tempus/homemusic/WaveOut;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private mode:Ljava/lang/String;

.field private pending:Z

.field private seed:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private sessionId:Ljava/lang/String;
    .annotation runtime Ldefpackage/ka4;
        value = "session_id"
    .end annotation
.end field

.field private title:Ljava/lang/String;

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
.method public final getMode()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/WaveOut;->mode:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPending()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/homemusic/WaveOut;->pending:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getSeed()Ljava/util/Map;
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
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/WaveOut;->seed:Ljava/util/Map;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSessionId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/WaveOut;->sessionId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/WaveOut;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
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
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/WaveOut;->tracks:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setMode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/WaveOut;->mode:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setPending(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/homemusic/WaveOut;->pending:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setSeed(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/WaveOut;->seed:Ljava/util/Map;

    .line 2
    .line 3
    return-void
.end method

.method public final setSessionId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/WaveOut;->sessionId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/WaveOut;->title:Ljava/lang/String;

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
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/WaveOut;->tracks:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method
