.class public final Lcom/eddyizm/tempus/homemusic/HubAppRelease;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private full:Lcom/eddyizm/tempus/homemusic/HubUpdateFile;

.field private notes:Ljava/lang/String;

.field private patches:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;",
            ">;"
        }
    .end annotation
.end field

.field private sha256:Ljava/lang/String;

.field private size:J

.field private url:Ljava/lang/String;

.field private versionCode:J

.field private versionName:Ljava/lang/String;


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
.method public final getFull()Lcom/eddyizm/tempus/homemusic/HubUpdateFile;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->full:Lcom/eddyizm/tempus/homemusic/HubUpdateFile;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getNotes()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->notes:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPatches()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->patches:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSha256()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->sha256:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSize()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->size:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->url:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getVersionCode()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->versionCode:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getVersionName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->versionName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setFull(Lcom/eddyizm/tempus/homemusic/HubUpdateFile;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->full:Lcom/eddyizm/tempus/homemusic/HubUpdateFile;

    .line 2
    .line 3
    return-void
.end method

.method public final setNotes(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->notes:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setPatches(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/homemusic/HubUpdatePatch;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->patches:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setSha256(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->sha256:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setSize(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->size:J

    .line 2
    .line 3
    return-void
.end method

.method public final setUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->url:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setVersionCode(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->versionCode:J

    .line 2
    .line 3
    return-void
.end method

.method public final setVersionName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubAppRelease;->versionName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
