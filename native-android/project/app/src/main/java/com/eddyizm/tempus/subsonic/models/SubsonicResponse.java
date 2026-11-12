package com.eddyizm.tempus.subsonic.models;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class SubsonicResponse {
    public static final int $stable = 8;
    private AlbumWithSongsID3 album;
    private AlbumInfo albumInfo;
    private AlbumList albumList;
    private AlbumList2 albumList2;
    private ArtistWithAlbumsID3 artist;
    private ArtistInfo artistInfo;
    private ArtistInfo2 artistInfo2;
    private ArtistsID3 artists;
    private Bookmarks bookmarks;
    private ChatMessages chatMessages;
    private Directory directory;
    private Error error;
    private Genres genres;
    private Indexes indexes;
    private InternetRadioStations internetRadioStations;
    private JukeboxPlaylist jukeboxPlaylist;
    private JukeboxStatus jukeboxStatus;
    private License license;
    private Lyrics lyrics;
    private LyricsList lyricsList;
    private MusicFolders musicFolders;
    private NewestPodcasts newestPodcasts;
    private NowPlaying nowPlaying;
    private Boolean openSubsonic;
    private List<OpenSubsonicExtension> openSubsonicExtensions;
    private PlayQueue playQueue;
    private PlaylistWithSongs playlist;
    private Playlists playlists;
    private Podcasts podcasts;
    private Songs randomSongs;
    private ScanStatus scanStatus;
    private SearchResult searchResult;
    private SearchResult2 searchResult2;
    private SearchResult3 searchResult3;
    private String serverVersion;
    private Shares shares;
    private SimilarSongs similarSongs;
    private SimilarSongs2 similarSongs2;
    private Child song;
    private Songs songsByGenre;
    private Starred starred;
    private Starred2 starred2;
    private String status;
    private TopSongs topSongs;
    private String type;
    private User user;
    private Users users;
    private String version;
    private VideoInfo videoInfo;
    private Videos videos;

    public SubsonicResponse() {
    }

    public final AlbumWithSongsID3 getAlbum() {
        return this.album;
    }

    public final AlbumInfo getAlbumInfo() {
        return this.albumInfo;
    }

    public final AlbumList getAlbumList() {
        return this.albumList;
    }

    public final AlbumList2 getAlbumList2() {
        return this.albumList2;
    }

    public final ArtistWithAlbumsID3 getArtist() {
        return this.artist;
    }

    public final ArtistInfo getArtistInfo() {
        return this.artistInfo;
    }

    public final ArtistInfo2 getArtistInfo2() {
        return this.artistInfo2;
    }

    public final ArtistsID3 getArtists() {
        return this.artists;
    }

    public final Bookmarks getBookmarks() {
        return this.bookmarks;
    }

    public final ChatMessages getChatMessages() {
        return this.chatMessages;
    }

    public final Directory getDirectory() {
        return this.directory;
    }

    public final Error getError() {
        return this.error;
    }

    public final Genres getGenres() {
        return this.genres;
    }

    public final Indexes getIndexes() {
        return this.indexes;
    }

    public final InternetRadioStations getInternetRadioStations() {
        return this.internetRadioStations;
    }

    public final JukeboxPlaylist getJukeboxPlaylist() {
        return this.jukeboxPlaylist;
    }

    public final JukeboxStatus getJukeboxStatus() {
        return this.jukeboxStatus;
    }

    public final License getLicense() {
        return this.license;
    }

    public final Lyrics getLyrics() {
        return this.lyrics;
    }

    public final LyricsList getLyricsList() {
        return this.lyricsList;
    }

    public final MusicFolders getMusicFolders() {
        return this.musicFolders;
    }

    public final NewestPodcasts getNewestPodcasts() {
        return this.newestPodcasts;
    }

    public final NowPlaying getNowPlaying() {
        return this.nowPlaying;
    }

    public final Boolean getOpenSubsonic() {
        return this.openSubsonic;
    }

    public final List<OpenSubsonicExtension> getOpenSubsonicExtensions() {
        return this.openSubsonicExtensions;
    }

    public final PlayQueue getPlayQueue() {
        return this.playQueue;
    }

    public final PlaylistWithSongs getPlaylist() {
        return this.playlist;
    }

    public final Playlists getPlaylists() {
        return this.playlists;
    }

    public final Podcasts getPodcasts() {
        return this.podcasts;
    }

    public final Songs getRandomSongs() {
        return this.randomSongs;
    }

    public final ScanStatus getScanStatus() {
        return this.scanStatus;
    }

    public final SearchResult getSearchResult() {
        return this.searchResult;
    }

    public final SearchResult2 getSearchResult2() {
        return this.searchResult2;
    }

    public final SearchResult3 getSearchResult3() {
        return this.searchResult3;
    }

    public final String getServerVersion() {
        return this.serverVersion;
    }

    public final Shares getShares() {
        return this.shares;
    }

    public final SimilarSongs getSimilarSongs() {
        return this.similarSongs;
    }

    public final SimilarSongs2 getSimilarSongs2() {
        return this.similarSongs2;
    }

    public final Child getSong() {
        return this.song;
    }

    public final Songs getSongsByGenre() {
        return this.songsByGenre;
    }

    public final Starred getStarred() {
        return this.starred;
    }

    public final Starred2 getStarred2() {
        return this.starred2;
    }

    public final String getStatus() {
        return this.status;
    }

    public final TopSongs getTopSongs() {
        return this.topSongs;
    }

    public final String getType() {
        return this.type;
    }

    public final User getUser() {
        return this.user;
    }

    public final Users getUsers() {
        return this.users;
    }

    public final String getVersion() {
        return this.version;
    }

    public final VideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public final Videos getVideos() {
        return this.videos;
    }

    public final void setAlbum(AlbumWithSongsID3 r1) {
        this.album = r1;
    }

    public final void setAlbumInfo(AlbumInfo r1) {
        this.albumInfo = r1;
    }

    public final void setAlbumList(AlbumList r1) {
        this.albumList = r1;
    }

    public final void setAlbumList2(AlbumList2 r1) {
        this.albumList2 = r1;
    }

    public final void setArtist(ArtistWithAlbumsID3 r1) {
        this.artist = r1;
    }

    public final void setArtistInfo(ArtistInfo r1) {
        this.artistInfo = r1;
    }

    public final void setArtistInfo2(ArtistInfo2 r1) {
        this.artistInfo2 = r1;
    }

    public final void setArtists(ArtistsID3 r1) {
        this.artists = r1;
    }

    public final void setBookmarks(Bookmarks r1) {
        this.bookmarks = r1;
    }

    public final void setChatMessages(ChatMessages r1) {
        this.chatMessages = r1;
    }

    public final void setDirectory(Directory r1) {
        this.directory = r1;
    }

    public final void setError(Error r1) {
        this.error = r1;
    }

    public final void setGenres(Genres r1) {
        this.genres = r1;
    }

    public final void setIndexes(Indexes r1) {
        this.indexes = r1;
    }

    public final void setInternetRadioStations(InternetRadioStations r1) {
        this.internetRadioStations = r1;
    }

    public final void setJukeboxPlaylist(JukeboxPlaylist r1) {
        this.jukeboxPlaylist = r1;
    }

    public final void setJukeboxStatus(JukeboxStatus r1) {
        this.jukeboxStatus = r1;
    }

    public final void setLicense(License r1) {
        this.license = r1;
    }

    public final void setLyrics(Lyrics r1) {
        this.lyrics = r1;
    }

    public final void setLyricsList(LyricsList r1) {
        this.lyricsList = r1;
    }

    public final void setMusicFolders(MusicFolders r1) {
        this.musicFolders = r1;
    }

    public final void setNewestPodcasts(NewestPodcasts r1) {
        this.newestPodcasts = r1;
    }

    public final void setNowPlaying(NowPlaying r1) {
        this.nowPlaying = r1;
    }

    public final void setOpenSubsonic(Boolean r1) {
        this.openSubsonic = r1;
    }

    public final void setOpenSubsonicExtensions(List<OpenSubsonicExtension> r1) {
        this.openSubsonicExtensions = r1;
    }

    public final void setPlayQueue(PlayQueue r1) {
        this.playQueue = r1;
    }

    public final void setPlaylist(PlaylistWithSongs r1) {
        this.playlist = r1;
    }

    public final void setPlaylists(Playlists r1) {
        this.playlists = r1;
    }

    public final void setPodcasts(Podcasts r1) {
        this.podcasts = r1;
    }

    public final void setRandomSongs(Songs r1) {
        this.randomSongs = r1;
    }

    public final void setScanStatus(ScanStatus r1) {
        this.scanStatus = r1;
    }

    public final void setSearchResult(SearchResult r1) {
        this.searchResult = r1;
    }

    public final void setSearchResult2(SearchResult2 r1) {
        this.searchResult2 = r1;
    }

    public final void setSearchResult3(SearchResult3 r1) {
        this.searchResult3 = r1;
    }

    public final void setServerVersion(String r1) {
        this.serverVersion = r1;
    }

    public final void setShares(Shares r1) {
        this.shares = r1;
    }

    public final void setSimilarSongs(SimilarSongs r1) {
        this.similarSongs = r1;
    }

    public final void setSimilarSongs2(SimilarSongs2 r1) {
        this.similarSongs2 = r1;
    }

    public final void setSong(Child r1) {
        this.song = r1;
    }

    public final void setSongsByGenre(Songs r1) {
        this.songsByGenre = r1;
    }

    public final void setStarred(Starred r1) {
        this.starred = r1;
    }

    public final void setStarred2(Starred2 r1) {
        this.starred2 = r1;
    }

    public final void setStatus(String r1) {
        this.status = r1;
    }

    public final void setTopSongs(TopSongs r1) {
        this.topSongs = r1;
    }

    public final void setType(String r1) {
        this.type = r1;
    }

    public final void setUser(User r1) {
        this.user = r1;
    }

    public final void setUsers(Users r1) {
        this.users = r1;
    }

    public final void setVersion(String r1) {
        this.version = r1;
    }

    public final void setVideoInfo(VideoInfo r1) {
        this.videoInfo = r1;
    }

    public final void setVideos(Videos r1) {
        this.videos = r1;
    }
}
