.class public final Lcom/eddyizm/tempus/subsonic/models/User;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private avatarLastChanged:Ljava/util/Date;

.field private email:Ljava/lang/String;

.field private folders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private isAdminRole:Z

.field private isCommentRole:Z

.field private isCoverArtRole:Z

.field private isDownloadRole:Z

.field private isJukeboxRole:Z

.field private isPlaylistRole:Z

.field private isPodcastRole:Z

.field private isScrobblingEnabled:Z

.field private isSettingsRole:Z

.field private isShareRole:Z

.field private isStreamRole:Z

.field private isUploadRole:Z

.field private isVideoConversionRole:Z

.field private maxBitRate:Ljava/lang/Integer;

.field private username:Ljava/lang/String;


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
.method public final getAvatarLastChanged()Ljava/util/Date;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/User;->avatarLastChanged:Ljava/util/Date;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getEmail()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/User;->email:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getFolders()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/User;->folders:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getMaxBitRate()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/User;->maxBitRate:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getUsername()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/User;->username:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final isAdminRole()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isAdminRole:Z

    .line 2
    .line 3
    return p0
.end method

.method public final isCommentRole()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isCommentRole:Z

    .line 2
    .line 3
    return p0
.end method

.method public final isCoverArtRole()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isCoverArtRole:Z

    .line 2
    .line 3
    return p0
.end method

.method public final isDownloadRole()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isDownloadRole:Z

    .line 2
    .line 3
    return p0
.end method

.method public final isJukeboxRole()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isJukeboxRole:Z

    .line 2
    .line 3
    return p0
.end method

.method public final isPlaylistRole()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isPlaylistRole:Z

    .line 2
    .line 3
    return p0
.end method

.method public final isPodcastRole()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isPodcastRole:Z

    .line 2
    .line 3
    return p0
.end method

.method public final isScrobblingEnabled()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isScrobblingEnabled:Z

    .line 2
    .line 3
    return p0
.end method

.method public final isSettingsRole()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isSettingsRole:Z

    .line 2
    .line 3
    return p0
.end method

.method public final isShareRole()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isShareRole:Z

    .line 2
    .line 3
    return p0
.end method

.method public final isStreamRole()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isStreamRole:Z

    .line 2
    .line 3
    return p0
.end method

.method public final isUploadRole()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isUploadRole:Z

    .line 2
    .line 3
    return p0
.end method

.method public final isVideoConversionRole()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isVideoConversionRole:Z

    .line 2
    .line 3
    return p0
.end method

.method public final setAdminRole(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isAdminRole:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setAvatarLastChanged(Ljava/util/Date;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/User;->avatarLastChanged:Ljava/util/Date;

    .line 2
    .line 3
    return-void
.end method

.method public final setCommentRole(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isCommentRole:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setCoverArtRole(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isCoverArtRole:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setDownloadRole(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isDownloadRole:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setEmail(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/User;->email:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setFolders(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/User;->folders:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setJukeboxRole(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isJukeboxRole:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setMaxBitRate(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/User;->maxBitRate:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setPlaylistRole(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isPlaylistRole:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setPodcastRole(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isPodcastRole:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setScrobblingEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isScrobblingEnabled:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setSettingsRole(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isSettingsRole:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setShareRole(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isShareRole:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setStreamRole(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isStreamRole:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setUploadRole(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isUploadRole:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setUsername(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/User;->username:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setVideoConversionRole(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/subsonic/models/User;->isVideoConversionRole:Z

    .line 2
    .line 3
    return-void
.end method
