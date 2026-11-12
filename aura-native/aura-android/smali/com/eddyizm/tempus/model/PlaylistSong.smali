.class public Lcom/eddyizm/tempus/model/PlaylistSong;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field private album:Ljava/lang/String;

.field private albumId:Ljava/lang/String;

.field private artist:Ljava/lang/String;

.field private artistId:Ljava/lang/String;

.field private coverArtId:Ljava/lang/String;

.field private duration:Ljava/lang/Integer;

.field private id:Ljava/lang/String;

.field private playlistId:Ljava/lang/String;

.field private title:Ljava/lang/String;

.field private track:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/Child;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->playlistId:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->id:Ljava/lang/String;

    .line 11
    .line 12
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->title:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->artist:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->album:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTrack()Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iput-object p1, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->track:Ljava/lang/Integer;

    .line 35
    .line 36
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->coverArtId:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDuration()Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iput-object p1, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->duration:Ljava/lang/Integer;

    .line 47
    .line 48
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->albumId:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {p2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->artistId:Ljava/lang/String;

    .line 59
    .line 60
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->playlistId:Ljava/lang/String;

    .line 63
    iput-object p2, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->id:Ljava/lang/String;

    .line 64
    iput-object p3, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->title:Ljava/lang/String;

    .line 65
    iput-object p4, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->artist:Ljava/lang/String;

    .line 66
    iput-object p5, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->album:Ljava/lang/String;

    .line 67
    iput-object p6, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->track:Ljava/lang/Integer;

    .line 68
    iput-object p7, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->coverArtId:Ljava/lang/String;

    .line 69
    iput-object p8, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->duration:Ljava/lang/Integer;

    .line 70
    iput-object p9, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->albumId:Ljava/lang/String;

    .line 71
    iput-object p10, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->artistId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAlbum()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->album:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getAlbumId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->albumId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getArtist()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->artist:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getArtistId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->artistId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCoverArtId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->coverArtId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDuration()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->duration:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public getId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getPlaylistId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->playlistId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTrack()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->track:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public setAlbum(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->album:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setAlbumId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->albumId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setArtist(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->artist:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setArtistId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->artistId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setCoverArtId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->coverArtId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setDuration(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->duration:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setPlaylistId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->playlistId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public setTrack(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/PlaylistSong;->track:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method
