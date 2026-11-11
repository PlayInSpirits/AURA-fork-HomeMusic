.class public final Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private album:Lcom/eddyizm/tempus/subsonic/models/AlbumWithSongsID3;

.field private albumInfo:Lcom/eddyizm/tempus/subsonic/models/AlbumInfo;

.field private albumList:Lcom/eddyizm/tempus/subsonic/models/AlbumList;

.field private albumList2:Lcom/eddyizm/tempus/subsonic/models/AlbumList2;

.field private artist:Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;

.field private artistInfo:Lcom/eddyizm/tempus/subsonic/models/ArtistInfo;

.field private artistInfo2:Lcom/eddyizm/tempus/subsonic/models/ArtistInfo2;

.field private artists:Lcom/eddyizm/tempus/subsonic/models/ArtistsID3;

.field private bookmarks:Lcom/eddyizm/tempus/subsonic/models/Bookmarks;

.field private chatMessages:Lcom/eddyizm/tempus/subsonic/models/ChatMessages;

.field private directory:Lcom/eddyizm/tempus/subsonic/models/Directory;

.field private error:Lcom/eddyizm/tempus/subsonic/models/Error;

.field private genres:Lcom/eddyizm/tempus/subsonic/models/Genres;

.field private indexes:Lcom/eddyizm/tempus/subsonic/models/Indexes;

.field private internetRadioStations:Lcom/eddyizm/tempus/subsonic/models/InternetRadioStations;

.field private jukeboxPlaylist:Lcom/eddyizm/tempus/subsonic/models/JukeboxPlaylist;

.field private jukeboxStatus:Lcom/eddyizm/tempus/subsonic/models/JukeboxStatus;

.field private license:Lcom/eddyizm/tempus/subsonic/models/License;

.field private lyrics:Lcom/eddyizm/tempus/subsonic/models/Lyrics;

.field private lyricsList:Lcom/eddyizm/tempus/subsonic/models/LyricsList;

.field private musicFolders:Lcom/eddyizm/tempus/subsonic/models/MusicFolders;

.field private newestPodcasts:Lcom/eddyizm/tempus/subsonic/models/NewestPodcasts;

.field private nowPlaying:Lcom/eddyizm/tempus/subsonic/models/NowPlaying;

.field private openSubsonic:Ljava/lang/Boolean;

.field private openSubsonicExtensions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/OpenSubsonicExtension;",
            ">;"
        }
    .end annotation
.end field

.field private playQueue:Lcom/eddyizm/tempus/subsonic/models/PlayQueue;

.field private playlist:Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

.field private playlists:Lcom/eddyizm/tempus/subsonic/models/Playlists;

.field private podcasts:Lcom/eddyizm/tempus/subsonic/models/Podcasts;

.field private randomSongs:Lcom/eddyizm/tempus/subsonic/models/Songs;

.field private scanStatus:Lcom/eddyizm/tempus/subsonic/models/ScanStatus;

.field private searchResult:Lcom/eddyizm/tempus/subsonic/models/SearchResult;

.field private searchResult2:Lcom/eddyizm/tempus/subsonic/models/SearchResult2;

.field private searchResult3:Lcom/eddyizm/tempus/subsonic/models/SearchResult3;

.field private serverVersion:Ljava/lang/String;

.field private shares:Lcom/eddyizm/tempus/subsonic/models/Shares;

.field private similarSongs:Lcom/eddyizm/tempus/subsonic/models/SimilarSongs;

.field private similarSongs2:Lcom/eddyizm/tempus/subsonic/models/SimilarSongs2;

.field private song:Lcom/eddyizm/tempus/subsonic/models/Child;

.field private songsByGenre:Lcom/eddyizm/tempus/subsonic/models/Songs;

.field private starred:Lcom/eddyizm/tempus/subsonic/models/Starred;

.field private starred2:Lcom/eddyizm/tempus/subsonic/models/Starred2;

.field private status:Ljava/lang/String;

.field private topSongs:Lcom/eddyizm/tempus/subsonic/models/TopSongs;

.field private type:Ljava/lang/String;

.field private user:Lcom/eddyizm/tempus/subsonic/models/User;

.field private users:Lcom/eddyizm/tempus/subsonic/models/Users;

.field private version:Ljava/lang/String;

.field private videoInfo:Lcom/eddyizm/tempus/subsonic/models/VideoInfo;

.field private videos:Lcom/eddyizm/tempus/subsonic/models/Videos;


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
.method public final getAlbum()Lcom/eddyizm/tempus/subsonic/models/AlbumWithSongsID3;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->album:Lcom/eddyizm/tempus/subsonic/models/AlbumWithSongsID3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAlbumInfo()Lcom/eddyizm/tempus/subsonic/models/AlbumInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->albumInfo:Lcom/eddyizm/tempus/subsonic/models/AlbumInfo;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAlbumList()Lcom/eddyizm/tempus/subsonic/models/AlbumList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->albumList:Lcom/eddyizm/tempus/subsonic/models/AlbumList;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAlbumList2()Lcom/eddyizm/tempus/subsonic/models/AlbumList2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->albumList2:Lcom/eddyizm/tempus/subsonic/models/AlbumList2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getArtist()Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->artist:Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getArtistInfo()Lcom/eddyizm/tempus/subsonic/models/ArtistInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->artistInfo:Lcom/eddyizm/tempus/subsonic/models/ArtistInfo;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getArtistInfo2()Lcom/eddyizm/tempus/subsonic/models/ArtistInfo2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->artistInfo2:Lcom/eddyizm/tempus/subsonic/models/ArtistInfo2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getArtists()Lcom/eddyizm/tempus/subsonic/models/ArtistsID3;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->artists:Lcom/eddyizm/tempus/subsonic/models/ArtistsID3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getBookmarks()Lcom/eddyizm/tempus/subsonic/models/Bookmarks;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->bookmarks:Lcom/eddyizm/tempus/subsonic/models/Bookmarks;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getChatMessages()Lcom/eddyizm/tempus/subsonic/models/ChatMessages;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->chatMessages:Lcom/eddyizm/tempus/subsonic/models/ChatMessages;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDirectory()Lcom/eddyizm/tempus/subsonic/models/Directory;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->directory:Lcom/eddyizm/tempus/subsonic/models/Directory;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getError()Lcom/eddyizm/tempus/subsonic/models/Error;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->error:Lcom/eddyizm/tempus/subsonic/models/Error;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getGenres()Lcom/eddyizm/tempus/subsonic/models/Genres;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->genres:Lcom/eddyizm/tempus/subsonic/models/Genres;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getIndexes()Lcom/eddyizm/tempus/subsonic/models/Indexes;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->indexes:Lcom/eddyizm/tempus/subsonic/models/Indexes;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getInternetRadioStations()Lcom/eddyizm/tempus/subsonic/models/InternetRadioStations;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->internetRadioStations:Lcom/eddyizm/tempus/subsonic/models/InternetRadioStations;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getJukeboxPlaylist()Lcom/eddyizm/tempus/subsonic/models/JukeboxPlaylist;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->jukeboxPlaylist:Lcom/eddyizm/tempus/subsonic/models/JukeboxPlaylist;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getJukeboxStatus()Lcom/eddyizm/tempus/subsonic/models/JukeboxStatus;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->jukeboxStatus:Lcom/eddyizm/tempus/subsonic/models/JukeboxStatus;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLicense()Lcom/eddyizm/tempus/subsonic/models/License;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->license:Lcom/eddyizm/tempus/subsonic/models/License;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLyrics()Lcom/eddyizm/tempus/subsonic/models/Lyrics;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->lyrics:Lcom/eddyizm/tempus/subsonic/models/Lyrics;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLyricsList()Lcom/eddyizm/tempus/subsonic/models/LyricsList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->lyricsList:Lcom/eddyizm/tempus/subsonic/models/LyricsList;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getMusicFolders()Lcom/eddyizm/tempus/subsonic/models/MusicFolders;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->musicFolders:Lcom/eddyizm/tempus/subsonic/models/MusicFolders;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getNewestPodcasts()Lcom/eddyizm/tempus/subsonic/models/NewestPodcasts;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->newestPodcasts:Lcom/eddyizm/tempus/subsonic/models/NewestPodcasts;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getNowPlaying()Lcom/eddyizm/tempus/subsonic/models/NowPlaying;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->nowPlaying:Lcom/eddyizm/tempus/subsonic/models/NowPlaying;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOpenSubsonic()Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->openSubsonic:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOpenSubsonicExtensions()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/OpenSubsonicExtension;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->openSubsonicExtensions:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPlayQueue()Lcom/eddyizm/tempus/subsonic/models/PlayQueue;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->playQueue:Lcom/eddyizm/tempus/subsonic/models/PlayQueue;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPlaylist()Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->playlist:Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPlaylists()Lcom/eddyizm/tempus/subsonic/models/Playlists;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->playlists:Lcom/eddyizm/tempus/subsonic/models/Playlists;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPodcasts()Lcom/eddyizm/tempus/subsonic/models/Podcasts;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->podcasts:Lcom/eddyizm/tempus/subsonic/models/Podcasts;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getRandomSongs()Lcom/eddyizm/tempus/subsonic/models/Songs;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->randomSongs:Lcom/eddyizm/tempus/subsonic/models/Songs;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getScanStatus()Lcom/eddyizm/tempus/subsonic/models/ScanStatus;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->scanStatus:Lcom/eddyizm/tempus/subsonic/models/ScanStatus;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSearchResult()Lcom/eddyizm/tempus/subsonic/models/SearchResult;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->searchResult:Lcom/eddyizm/tempus/subsonic/models/SearchResult;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSearchResult2()Lcom/eddyizm/tempus/subsonic/models/SearchResult2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->searchResult2:Lcom/eddyizm/tempus/subsonic/models/SearchResult2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSearchResult3()Lcom/eddyizm/tempus/subsonic/models/SearchResult3;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->searchResult3:Lcom/eddyizm/tempus/subsonic/models/SearchResult3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getServerVersion()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->serverVersion:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getShares()Lcom/eddyizm/tempus/subsonic/models/Shares;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->shares:Lcom/eddyizm/tempus/subsonic/models/Shares;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSimilarSongs()Lcom/eddyizm/tempus/subsonic/models/SimilarSongs;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->similarSongs:Lcom/eddyizm/tempus/subsonic/models/SimilarSongs;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSimilarSongs2()Lcom/eddyizm/tempus/subsonic/models/SimilarSongs2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->similarSongs2:Lcom/eddyizm/tempus/subsonic/models/SimilarSongs2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSong()Lcom/eddyizm/tempus/subsonic/models/Child;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->song:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSongsByGenre()Lcom/eddyizm/tempus/subsonic/models/Songs;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->songsByGenre:Lcom/eddyizm/tempus/subsonic/models/Songs;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getStarred()Lcom/eddyizm/tempus/subsonic/models/Starred;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->starred:Lcom/eddyizm/tempus/subsonic/models/Starred;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getStarred2()Lcom/eddyizm/tempus/subsonic/models/Starred2;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->starred2:Lcom/eddyizm/tempus/subsonic/models/Starred2;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getStatus()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->status:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTopSongs()Lcom/eddyizm/tempus/subsonic/models/TopSongs;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->topSongs:Lcom/eddyizm/tempus/subsonic/models/TopSongs;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getType()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->type:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getUser()Lcom/eddyizm/tempus/subsonic/models/User;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->user:Lcom/eddyizm/tempus/subsonic/models/User;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getUsers()Lcom/eddyizm/tempus/subsonic/models/Users;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->users:Lcom/eddyizm/tempus/subsonic/models/Users;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getVersion()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->version:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getVideoInfo()Lcom/eddyizm/tempus/subsonic/models/VideoInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->videoInfo:Lcom/eddyizm/tempus/subsonic/models/VideoInfo;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getVideos()Lcom/eddyizm/tempus/subsonic/models/Videos;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->videos:Lcom/eddyizm/tempus/subsonic/models/Videos;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setAlbum(Lcom/eddyizm/tempus/subsonic/models/AlbumWithSongsID3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->album:Lcom/eddyizm/tempus/subsonic/models/AlbumWithSongsID3;

    .line 2
    .line 3
    return-void
.end method

.method public final setAlbumInfo(Lcom/eddyizm/tempus/subsonic/models/AlbumInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->albumInfo:Lcom/eddyizm/tempus/subsonic/models/AlbumInfo;

    .line 2
    .line 3
    return-void
.end method

.method public final setAlbumList(Lcom/eddyizm/tempus/subsonic/models/AlbumList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->albumList:Lcom/eddyizm/tempus/subsonic/models/AlbumList;

    .line 2
    .line 3
    return-void
.end method

.method public final setAlbumList2(Lcom/eddyizm/tempus/subsonic/models/AlbumList2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->albumList2:Lcom/eddyizm/tempus/subsonic/models/AlbumList2;

    .line 2
    .line 3
    return-void
.end method

.method public final setArtist(Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->artist:Lcom/eddyizm/tempus/subsonic/models/ArtistWithAlbumsID3;

    .line 2
    .line 3
    return-void
.end method

.method public final setArtistInfo(Lcom/eddyizm/tempus/subsonic/models/ArtistInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->artistInfo:Lcom/eddyizm/tempus/subsonic/models/ArtistInfo;

    .line 2
    .line 3
    return-void
.end method

.method public final setArtistInfo2(Lcom/eddyizm/tempus/subsonic/models/ArtistInfo2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->artistInfo2:Lcom/eddyizm/tempus/subsonic/models/ArtistInfo2;

    .line 2
    .line 3
    return-void
.end method

.method public final setArtists(Lcom/eddyizm/tempus/subsonic/models/ArtistsID3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->artists:Lcom/eddyizm/tempus/subsonic/models/ArtistsID3;

    .line 2
    .line 3
    return-void
.end method

.method public final setBookmarks(Lcom/eddyizm/tempus/subsonic/models/Bookmarks;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->bookmarks:Lcom/eddyizm/tempus/subsonic/models/Bookmarks;

    .line 2
    .line 3
    return-void
.end method

.method public final setChatMessages(Lcom/eddyizm/tempus/subsonic/models/ChatMessages;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->chatMessages:Lcom/eddyizm/tempus/subsonic/models/ChatMessages;

    .line 2
    .line 3
    return-void
.end method

.method public final setDirectory(Lcom/eddyizm/tempus/subsonic/models/Directory;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->directory:Lcom/eddyizm/tempus/subsonic/models/Directory;

    .line 2
    .line 3
    return-void
.end method

.method public final setError(Lcom/eddyizm/tempus/subsonic/models/Error;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->error:Lcom/eddyizm/tempus/subsonic/models/Error;

    .line 2
    .line 3
    return-void
.end method

.method public final setGenres(Lcom/eddyizm/tempus/subsonic/models/Genres;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->genres:Lcom/eddyizm/tempus/subsonic/models/Genres;

    .line 2
    .line 3
    return-void
.end method

.method public final setIndexes(Lcom/eddyizm/tempus/subsonic/models/Indexes;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->indexes:Lcom/eddyizm/tempus/subsonic/models/Indexes;

    .line 2
    .line 3
    return-void
.end method

.method public final setInternetRadioStations(Lcom/eddyizm/tempus/subsonic/models/InternetRadioStations;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->internetRadioStations:Lcom/eddyizm/tempus/subsonic/models/InternetRadioStations;

    .line 2
    .line 3
    return-void
.end method

.method public final setJukeboxPlaylist(Lcom/eddyizm/tempus/subsonic/models/JukeboxPlaylist;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->jukeboxPlaylist:Lcom/eddyizm/tempus/subsonic/models/JukeboxPlaylist;

    .line 2
    .line 3
    return-void
.end method

.method public final setJukeboxStatus(Lcom/eddyizm/tempus/subsonic/models/JukeboxStatus;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->jukeboxStatus:Lcom/eddyizm/tempus/subsonic/models/JukeboxStatus;

    .line 2
    .line 3
    return-void
.end method

.method public final setLicense(Lcom/eddyizm/tempus/subsonic/models/License;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->license:Lcom/eddyizm/tempus/subsonic/models/License;

    .line 2
    .line 3
    return-void
.end method

.method public final setLyrics(Lcom/eddyizm/tempus/subsonic/models/Lyrics;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->lyrics:Lcom/eddyizm/tempus/subsonic/models/Lyrics;

    .line 2
    .line 3
    return-void
.end method

.method public final setLyricsList(Lcom/eddyizm/tempus/subsonic/models/LyricsList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->lyricsList:Lcom/eddyizm/tempus/subsonic/models/LyricsList;

    .line 2
    .line 3
    return-void
.end method

.method public final setMusicFolders(Lcom/eddyizm/tempus/subsonic/models/MusicFolders;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->musicFolders:Lcom/eddyizm/tempus/subsonic/models/MusicFolders;

    .line 2
    .line 3
    return-void
.end method

.method public final setNewestPodcasts(Lcom/eddyizm/tempus/subsonic/models/NewestPodcasts;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->newestPodcasts:Lcom/eddyizm/tempus/subsonic/models/NewestPodcasts;

    .line 2
    .line 3
    return-void
.end method

.method public final setNowPlaying(Lcom/eddyizm/tempus/subsonic/models/NowPlaying;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->nowPlaying:Lcom/eddyizm/tempus/subsonic/models/NowPlaying;

    .line 2
    .line 3
    return-void
.end method

.method public final setOpenSubsonic(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->openSubsonic:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-void
.end method

.method public final setOpenSubsonicExtensions(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/OpenSubsonicExtension;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->openSubsonicExtensions:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setPlayQueue(Lcom/eddyizm/tempus/subsonic/models/PlayQueue;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->playQueue:Lcom/eddyizm/tempus/subsonic/models/PlayQueue;

    .line 2
    .line 3
    return-void
.end method

.method public final setPlaylist(Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->playlist:Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 2
    .line 3
    return-void
.end method

.method public final setPlaylists(Lcom/eddyizm/tempus/subsonic/models/Playlists;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->playlists:Lcom/eddyizm/tempus/subsonic/models/Playlists;

    .line 2
    .line 3
    return-void
.end method

.method public final setPodcasts(Lcom/eddyizm/tempus/subsonic/models/Podcasts;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->podcasts:Lcom/eddyizm/tempus/subsonic/models/Podcasts;

    .line 2
    .line 3
    return-void
.end method

.method public final setRandomSongs(Lcom/eddyizm/tempus/subsonic/models/Songs;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->randomSongs:Lcom/eddyizm/tempus/subsonic/models/Songs;

    .line 2
    .line 3
    return-void
.end method

.method public final setScanStatus(Lcom/eddyizm/tempus/subsonic/models/ScanStatus;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->scanStatus:Lcom/eddyizm/tempus/subsonic/models/ScanStatus;

    .line 2
    .line 3
    return-void
.end method

.method public final setSearchResult(Lcom/eddyizm/tempus/subsonic/models/SearchResult;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->searchResult:Lcom/eddyizm/tempus/subsonic/models/SearchResult;

    .line 2
    .line 3
    return-void
.end method

.method public final setSearchResult2(Lcom/eddyizm/tempus/subsonic/models/SearchResult2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->searchResult2:Lcom/eddyizm/tempus/subsonic/models/SearchResult2;

    .line 2
    .line 3
    return-void
.end method

.method public final setSearchResult3(Lcom/eddyizm/tempus/subsonic/models/SearchResult3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->searchResult3:Lcom/eddyizm/tempus/subsonic/models/SearchResult3;

    .line 2
    .line 3
    return-void
.end method

.method public final setServerVersion(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->serverVersion:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setShares(Lcom/eddyizm/tempus/subsonic/models/Shares;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->shares:Lcom/eddyizm/tempus/subsonic/models/Shares;

    .line 2
    .line 3
    return-void
.end method

.method public final setSimilarSongs(Lcom/eddyizm/tempus/subsonic/models/SimilarSongs;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->similarSongs:Lcom/eddyizm/tempus/subsonic/models/SimilarSongs;

    .line 2
    .line 3
    return-void
.end method

.method public final setSimilarSongs2(Lcom/eddyizm/tempus/subsonic/models/SimilarSongs2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->similarSongs2:Lcom/eddyizm/tempus/subsonic/models/SimilarSongs2;

    .line 2
    .line 3
    return-void
.end method

.method public final setSong(Lcom/eddyizm/tempus/subsonic/models/Child;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->song:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 2
    .line 3
    return-void
.end method

.method public final setSongsByGenre(Lcom/eddyizm/tempus/subsonic/models/Songs;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->songsByGenre:Lcom/eddyizm/tempus/subsonic/models/Songs;

    .line 2
    .line 3
    return-void
.end method

.method public final setStarred(Lcom/eddyizm/tempus/subsonic/models/Starred;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->starred:Lcom/eddyizm/tempus/subsonic/models/Starred;

    .line 2
    .line 3
    return-void
.end method

.method public final setStarred2(Lcom/eddyizm/tempus/subsonic/models/Starred2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->starred2:Lcom/eddyizm/tempus/subsonic/models/Starred2;

    .line 2
    .line 3
    return-void
.end method

.method public final setStatus(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->status:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setTopSongs(Lcom/eddyizm/tempus/subsonic/models/TopSongs;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->topSongs:Lcom/eddyizm/tempus/subsonic/models/TopSongs;

    .line 2
    .line 3
    return-void
.end method

.method public final setType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->type:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setUser(Lcom/eddyizm/tempus/subsonic/models/User;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->user:Lcom/eddyizm/tempus/subsonic/models/User;

    .line 2
    .line 3
    return-void
.end method

.method public final setUsers(Lcom/eddyizm/tempus/subsonic/models/Users;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->users:Lcom/eddyizm/tempus/subsonic/models/Users;

    .line 2
    .line 3
    return-void
.end method

.method public final setVersion(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->version:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setVideoInfo(Lcom/eddyizm/tempus/subsonic/models/VideoInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->videoInfo:Lcom/eddyizm/tempus/subsonic/models/VideoInfo;

    .line 2
    .line 3
    return-void
.end method

.method public final setVideos(Lcom/eddyizm/tempus/subsonic/models/Videos;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/SubsonicResponse;->videos:Lcom/eddyizm/tempus/subsonic/models/Videos;

    .line 2
    .line 3
    return-void
.end method
