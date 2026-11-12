package defpackage;

import com.eddyizm.tempus.database.AppDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uh extends qz0 {
    public final /* synthetic */ AppDatabase_Impl d;

    public uh(AppDatabase_Impl r3) {
        this.d = r3;
        super(23, "5cdfa08b646d6b874587abcc85831960", "dbbf5062c5703cfdc3ae63eb9f5ce268");
    }

    @Override // defpackage.qz0
    public final void a(x34 r1) {
        h12.n(r1, "CREATE TABLE IF NOT EXISTS `queue` (`id` TEXT NOT NULL, `track_order` INTEGER NOT NULL, `last_play` INTEGER NOT NULL, `playing_changed` INTEGER NOT NULL, `stream_id` TEXT, `parent_id` TEXT, `is_dir` INTEGER NOT NULL, `title` TEXT, `album` TEXT, `artist` TEXT, `track` INTEGER, `year` INTEGER, `genre` TEXT, `cover_art_id` TEXT, `size` INTEGER, `content_type` TEXT, `suffix` TEXT, `transcoding_content_type` TEXT, `transcoded_suffix` TEXT, `duration` INTEGER, `bitrate` INTEGER, `sampling_rate` INTEGER, `bit_depth` INTEGER, `path` TEXT, `is_video` INTEGER NOT NULL, `user_rating` INTEGER, `average_rating` REAL, `play_count` INTEGER, `disc_number` INTEGER, `created` INTEGER, `starred` INTEGER, `album_id` TEXT, `artist_id` TEXT, `type` TEXT, `bookmark_position` INTEGER, `original_width` INTEGER, `original_height` INTEGER, `album_artist` TEXT, `rg_track_gain` REAL, `rg_album_gain` REAL, `rg_track_peak` REAL, `rg_album_peak` REAL, `rg_base_gain` REAL, `rg_fallback_gain` REAL, PRIMARY KEY(`track_order`))");
        h12.n(r1, "CREATE TABLE IF NOT EXISTS `server` (`id` TEXT NOT NULL, `server_name` TEXT NOT NULL, `username` TEXT NOT NULL, `password` TEXT NOT NULL, `address` TEXT NOT NULL, `local_address` TEXT, `timestamp` INTEGER NOT NULL, `low_security` INTEGER NOT NULL DEFAULT false, `client_cert` TEXT, PRIMARY KEY(`id`))");
        h12.n(r1, "CREATE TABLE IF NOT EXISTS `recent_search` (`search` TEXT NOT NULL, `timestamp` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`search`))");
        h12.n(r1, "CREATE TABLE IF NOT EXISTS `download` (`id` TEXT NOT NULL, `playlist_id` TEXT, `playlist_name` TEXT, `download_state` INTEGER NOT NULL DEFAULT 1, `download_uri` TEXT DEFAULT '', `parent_id` TEXT, `is_dir` INTEGER NOT NULL, `title` TEXT, `album` TEXT, `artist` TEXT, `track` INTEGER, `year` INTEGER, `genre` TEXT, `cover_art_id` TEXT, `size` INTEGER, `content_type` TEXT, `suffix` TEXT, `transcoding_content_type` TEXT, `transcoded_suffix` TEXT, `duration` INTEGER, `bitrate` INTEGER, `sampling_rate` INTEGER, `bit_depth` INTEGER, `path` TEXT, `is_video` INTEGER NOT NULL, `user_rating` INTEGER, `average_rating` REAL, `play_count` INTEGER, `disc_number` INTEGER, `created` INTEGER, `starred` INTEGER, `album_id` TEXT, `artist_id` TEXT, `type` TEXT, `bookmark_position` INTEGER, `original_width` INTEGER, `original_height` INTEGER, `album_artist` TEXT, `rg_track_gain` REAL, `rg_album_gain` REAL, `rg_track_peak` REAL, `rg_album_peak` REAL, `rg_base_gain` REAL, `rg_fallback_gain` REAL, PRIMARY KEY(`id`))");
        h12.n(r1, "CREATE TABLE IF NOT EXISTS `chronology` (`id` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `server` TEXT, `parent_id` TEXT, `is_dir` INTEGER NOT NULL, `title` TEXT, `album` TEXT, `artist` TEXT, `track` INTEGER, `year` INTEGER, `genre` TEXT, `cover_art_id` TEXT, `size` INTEGER, `content_type` TEXT, `suffix` TEXT, `transcoding_content_type` TEXT, `transcoded_suffix` TEXT, `duration` INTEGER, `bitrate` INTEGER, `sampling_rate` INTEGER, `bit_depth` INTEGER, `path` TEXT, `is_video` INTEGER NOT NULL, `user_rating` INTEGER, `average_rating` REAL, `play_count` INTEGER, `disc_number` INTEGER, `created` INTEGER, `starred` INTEGER, `album_id` TEXT, `artist_id` TEXT, `type` TEXT, `bookmark_position` INTEGER, `original_width` INTEGER, `original_height` INTEGER, `album_artist` TEXT, `rg_track_gain` REAL, `rg_album_gain` REAL, `rg_track_peak` REAL, `rg_album_peak` REAL, `rg_base_gain` REAL, `rg_fallback_gain` REAL, PRIMARY KEY(`id`))");
        h12.n(r1, "CREATE TABLE IF NOT EXISTS `favorite` (`timestamp` INTEGER NOT NULL, `songId` TEXT, `albumId` TEXT, `artistId` TEXT, `toStar` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))");
        h12.n(r1, "CREATE TABLE IF NOT EXISTS `session_media_item` (`index` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `id` TEXT, `parent_id` TEXT, `is_dir` INTEGER NOT NULL, `title` TEXT, `album` TEXT, `artist` TEXT, `track` INTEGER, `year` INTEGER, `genre` TEXT, `cover_art_id` TEXT, `size` INTEGER, `content_type` TEXT, `suffix` TEXT, `transcoding_content_type` TEXT, `transcoded_suffix` TEXT, `duration` INTEGER, `bitrate` INTEGER, `path` TEXT, `is_video` INTEGER NOT NULL, `user_rating` INTEGER, `average_rating` REAL, `play_count` INTEGER, `disc_number` INTEGER, `created` INTEGER, `starred` INTEGER, `album_id` TEXT, `artist_id` TEXT, `type` TEXT, `bookmark_position` INTEGER, `original_width` INTEGER, `original_height` INTEGER, `stream_id` TEXT, `stream_url` TEXT, `timestamp` INTEGER, `rg_track_gain` REAL, `rg_album_gain` REAL, `rg_track_peak` REAL, `rg_album_peak` REAL, `rg_base_gain` REAL, `rg_fallback_gain` REAL)");
        h12.n(r1, "CREATE TABLE IF NOT EXISTS `playlist` (`id` TEXT NOT NULL, `name` TEXT, `duration` INTEGER NOT NULL, `coverArt` TEXT, `comment` TEXT, `owner` TEXT, `isUniversal` INTEGER, `songCount` INTEGER NOT NULL DEFAULT 0, `created` INTEGER, `changed` INTEGER, `lastPlayed` INTEGER NOT NULL DEFAULT 0, `allowedUsers` TEXT, PRIMARY KEY(`id`))");
        h12.n(r1, "CREATE TABLE IF NOT EXISTS `pinned_playlist` (`playlistId` TEXT NOT NULL, PRIMARY KEY(`playlistId`))");
        h12.n(r1, "CREATE TABLE IF NOT EXISTS `lyrics_cache` (`song_id` TEXT NOT NULL, `artist` TEXT, `title` TEXT, `lyrics` TEXT, `structured_lyrics` TEXT, `updated_at` INTEGER NOT NULL, PRIMARY KEY(`song_id`))");
        h12.n(r1, "CREATE TABLE IF NOT EXISTS `internet_radio_station_cache` (`id` TEXT NOT NULL, `name` TEXT, `stream_url` TEXT, `home_page_url` TEXT, `source` TEXT NOT NULL DEFAULT 'subsonic', `cover_art_url` TEXT, PRIMARY KEY(`id`))");
        h12.n(r1, "CREATE TABLE IF NOT EXISTS `playlist_song` (`playlist_id` TEXT NOT NULL, `id` TEXT NOT NULL, `title` TEXT, `artist` TEXT, `album` TEXT, `track` INTEGER, `cover_art_id` TEXT, `duration` INTEGER, `album_id` TEXT, `artist_id` TEXT, PRIMARY KEY(`playlist_id`, `id`), FOREIGN KEY(`playlist_id`) REFERENCES `playlist`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        h12.n(r1, "CREATE INDEX IF NOT EXISTS `index_playlist_song_playlist_id` ON `playlist_song` (`playlist_id`)");
        h12.n(r1, "CREATE TABLE IF NOT EXISTS `synced_playlist` (`playlistId` TEXT NOT NULL, `serverId` TEXT NOT NULL, PRIMARY KEY(`playlistId`, `serverId`))");
        h12.n(r1, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        h12.n(r1, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5cdfa08b646d6b874587abcc85831960')");
    }

    @Override // defpackage.qz0
    public final void c(x34 r1) {
        h12.n(r1, "DROP TABLE IF EXISTS `queue`");
        h12.n(r1, "DROP TABLE IF EXISTS `server`");
        h12.n(r1, "DROP TABLE IF EXISTS `recent_search`");
        h12.n(r1, "DROP TABLE IF EXISTS `download`");
        h12.n(r1, "DROP TABLE IF EXISTS `chronology`");
        h12.n(r1, "DROP TABLE IF EXISTS `favorite`");
        h12.n(r1, "DROP TABLE IF EXISTS `session_media_item`");
        h12.n(r1, "DROP TABLE IF EXISTS `playlist`");
        h12.n(r1, "DROP TABLE IF EXISTS `pinned_playlist`");
        h12.n(r1, "DROP TABLE IF EXISTS `lyrics_cache`");
        h12.n(r1, "DROP TABLE IF EXISTS `internet_radio_station_cache`");
        h12.n(r1, "DROP TABLE IF EXISTS `playlist_song`");
        h12.n(r1, "DROP TABLE IF EXISTS `synced_playlist`");
    }

    @Override // defpackage.qz0
    public final void r(x34 r1) {
    }

    @Override // defpackage.qz0
    public final void s(x34 r2) {
        h12.n(r2, "PRAGMA foreign_keys = ON");
        this.d.p(r2);
    }

    @Override // defpackage.qz0
    public final void t(x34 r1) {
    }

    @Override // defpackage.qz0
    public final void u(x34 r1) {
        xl.l(r1);
    }

    @Override // defpackage.qz0
    public final u24 v(x34 r60) {
        HashMap r1 = new HashMap(44);
        r1.put("id", new oq4(0, 1, "id", "TEXT", null, true));
        r1.put("track_order", new oq4(1, 1, "track_order", "INTEGER", null, true));
        r1.put("last_play", new oq4(0, 1, "last_play", "INTEGER", null, true));
        r1.put("playing_changed", new oq4(0, 1, "playing_changed", "INTEGER", null, true));
        r1.put("stream_id", new oq4(0, 1, "stream_id", "TEXT", null, false));
        r1.put("parent_id", new oq4(0, 1, "parent_id", "TEXT", null, false));
        r1.put("is_dir", new oq4(0, 1, "is_dir", "INTEGER", null, true));
        r1.put("title", new oq4(0, 1, "title", "TEXT", null, false));
        r1.put("album", new oq4(0, 1, "album", "TEXT", null, false));
        r1.put("artist", new oq4(0, 1, "artist", "TEXT", null, false));
        r1.put("track", new oq4(0, 1, "track", "INTEGER", null, false));
        r1.put("year", new oq4(0, 1, "year", "INTEGER", null, false));
        r1.put("genre", new oq4(0, 1, "genre", "TEXT", null, false));
        r1.put("cover_art_id", new oq4(0, 1, "cover_art_id", "TEXT", null, false));
        r1.put("size", new oq4(0, 1, "size", "INTEGER", null, false));
        r1.put("content_type", new oq4(0, 1, "content_type", "TEXT", null, false));
        r1.put("suffix", new oq4(0, 1, "suffix", "TEXT", null, false));
        r1.put("transcoding_content_type", new oq4(0, 1, "transcoding_content_type", "TEXT", null, false));
        r1.put("transcoded_suffix", new oq4(0, 1, "transcoded_suffix", "TEXT", null, false));
        r1.put("duration", new oq4(0, 1, "duration", "INTEGER", null, false));
        r1.put("bitrate", new oq4(0, 1, "bitrate", "INTEGER", null, false));
        r1.put("sampling_rate", new oq4(0, 1, "sampling_rate", "INTEGER", null, false));
        r1.put("bit_depth", new oq4(0, 1, "bit_depth", "INTEGER", null, false));
        r1.put("path", new oq4(0, 1, "path", "TEXT", null, false));
        r1.put("is_video", new oq4(0, 1, "is_video", "INTEGER", null, true));
        r1.put("user_rating", new oq4(0, 1, "user_rating", "INTEGER", null, false));
        r1.put("average_rating", new oq4(0, 1, "average_rating", "REAL", null, false));
        r1.put("play_count", new oq4(0, 1, "play_count", "INTEGER", null, false));
        r1.put("disc_number", new oq4(0, 1, "disc_number", "INTEGER", null, false));
        r1.put("created", new oq4(0, 1, "created", "INTEGER", null, false));
        r1.put("starred", new oq4(0, 1, "starred", "INTEGER", null, false));
        r1.put("album_id", new oq4(0, 1, "album_id", "TEXT", null, false));
        r1.put("artist_id", new oq4(0, 1, "artist_id", "TEXT", null, false));
        r1.put("type", new oq4(0, 1, "type", "TEXT", null, false));
        r1.put("bookmark_position", new oq4(0, 1, "bookmark_position", "INTEGER", null, false));
        r1.put("original_width", new oq4(0, 1, "original_width", "INTEGER", null, false));
        r1.put("original_height", new oq4(0, 1, "original_height", "INTEGER", null, false));
        r1.put("album_artist", new oq4(0, 1, "album_artist", "TEXT", null, false));
        r1.put("rg_track_gain", new oq4(0, 1, "rg_track_gain", "REAL", null, false));
        r1.put("rg_album_gain", new oq4(0, 1, "rg_album_gain", "REAL", null, false));
        r1.put("rg_track_peak", new oq4(0, 1, "rg_track_peak", "REAL", null, false));
        r1.put("rg_album_peak", new oq4(0, 1, "rg_album_peak", "REAL", null, false));
        r1.put("rg_base_gain", new oq4(0, 1, "rg_base_gain", "REAL", null, false));
        rq4 r2 = new rq4("queue", r1, f34.k(r1, "rg_fallback_gain", new oq4(0, 1, "rg_fallback_gain", "REAL", null, false), 0), new HashSet(0));
        rq4 r3 = rq4.b(r60, "queue");
        if (r2.equals(r3) == false) goto L5;
        HashMap r4 = new HashMap(9);
        r4.put("id", new oq4(1, 1, "id", "TEXT", null, true));
        r4.put("server_name", new oq4(0, 1, "server_name", "TEXT", null, true));
        r4.put("username", new oq4(0, 1, "username", "TEXT", null, true));
        r4.put("password", new oq4(0, 1, "password", "TEXT", null, true));
        r4.put("address", new oq4(0, 1, "address", "TEXT", null, true));
        r4.put("local_address", new oq4(0, 1, "local_address", "TEXT", null, false));
        r4.put("timestamp", new oq4(0, 1, "timestamp", "INTEGER", null, true));
        r4.put("low_security", new oq4(0, 1, "low_security", "INTEGER", "false", true));
        rq4 r12 = new rq4("server", r4, f34.k(r4, "client_cert", new oq4(0, 1, "client_cert", "TEXT", null, false), 0), new HashSet(0));
        rq4 r5 = rq4.b(r60, "server");
        if (r12.equals(r5) == false) goto L9;
        HashMap r6 = new HashMap(2);
        r6.put("search", new oq4(1, 1, "search", "TEXT", null, true));
        rq4 r15 = new rq4("recent_search", r6, f34.k(r6, "timestamp", new oq4(0, 1, "timestamp", "INTEGER", "0", true), 0), new HashSet(0));
        rq4 r7 = rq4.b(r60, "recent_search");
        if (r15.equals(r7) == false) goto L13;
        HashMap r8 = new HashMap(44);
        r8.put("id", new oq4(1, 1, "id", "TEXT", null, true));
        r8.put("playlist_id", new oq4(0, 1, "playlist_id", "TEXT", null, false));
        r8.put("playlist_name", new oq4(0, 1, "playlist_name", "TEXT", null, false));
        r8.put("download_state", new oq4(0, 1, "download_state", "INTEGER", "1", true));
        r8.put("download_uri", new oq4(0, 1, "download_uri", "TEXT", "''", false));
        r8.put("parent_id", new oq4(0, 1, "parent_id", "TEXT", null, false));
        r8.put("is_dir", new oq4(0, 1, "is_dir", "INTEGER", null, true));
        r8.put("title", new oq4(0, 1, "title", "TEXT", null, false));
        r8.put("album", new oq4(0, 1, "album", "TEXT", null, false));
        r8.put("artist", new oq4(0, 1, "artist", "TEXT", null, false));
        r8.put("track", new oq4(0, 1, "track", "INTEGER", null, false));
        r8.put("year", new oq4(0, 1, "year", "INTEGER", null, false));
        r8.put("genre", new oq4(0, 1, "genre", "TEXT", null, false));
        r8.put("cover_art_id", new oq4(0, 1, "cover_art_id", "TEXT", null, false));
        r8.put("size", new oq4(0, 1, "size", "INTEGER", null, false));
        r8.put("content_type", new oq4(0, 1, "content_type", "TEXT", null, false));
        r8.put("suffix", new oq4(0, 1, "suffix", "TEXT", null, false));
        r8.put("transcoding_content_type", new oq4(0, 1, "transcoding_content_type", "TEXT", null, false));
        r8.put("transcoded_suffix", new oq4(0, 1, "transcoded_suffix", "TEXT", null, false));
        r8.put("duration", new oq4(0, 1, "duration", "INTEGER", null, false));
        r8.put("bitrate", new oq4(0, 1, "bitrate", "INTEGER", null, false));
        r8.put("sampling_rate", new oq4(0, 1, "sampling_rate", "INTEGER", null, false));
        r8.put("bit_depth", new oq4(0, 1, "bit_depth", "INTEGER", null, false));
        r8.put("path", new oq4(0, 1, "path", "TEXT", null, false));
        r8.put("is_video", new oq4(0, 1, "is_video", "INTEGER", null, true));
        r8.put("user_rating", new oq4(0, 1, "user_rating", "INTEGER", null, false));
        r8.put("average_rating", new oq4(0, 1, "average_rating", "REAL", null, false));
        r8.put("play_count", new oq4(0, 1, "play_count", "INTEGER", null, false));
        r8.put("disc_number", new oq4(0, 1, "disc_number", "INTEGER", null, false));
        r8.put("created", new oq4(0, 1, "created", "INTEGER", null, false));
        r8.put("starred", new oq4(0, 1, "starred", "INTEGER", null, false));
        r8.put("album_id", new oq4(0, 1, "album_id", "TEXT", null, false));
        r8.put("artist_id", new oq4(0, 1, "artist_id", "TEXT", null, false));
        r8.put("type", new oq4(0, 1, "type", "TEXT", null, false));
        r8.put("bookmark_position", new oq4(0, 1, "bookmark_position", "INTEGER", null, false));
        r8.put("original_width", new oq4(0, 1, "original_width", "INTEGER", null, false));
        r8.put("original_height", new oq4(0, 1, "original_height", "INTEGER", null, false));
        r8.put("album_artist", new oq4(0, 1, "album_artist", "TEXT", null, false));
        r8.put("rg_track_gain", new oq4(0, 1, "rg_track_gain", "REAL", null, false));
        r8.put("rg_album_gain", new oq4(0, 1, "rg_album_gain", "REAL", null, false));
        r8.put("rg_track_peak", new oq4(0, 1, "rg_track_peak", "REAL", null, false));
        r8.put("rg_album_peak", new oq4(0, 1, "rg_album_peak", "REAL", null, false));
        r8.put("rg_base_gain", new oq4(0, 1, "rg_base_gain", "REAL", null, false));
        rq4 r16 = new rq4("download", r8, f34.k(r8, "rg_fallback_gain", new oq4(0, 1, "rg_fallback_gain", "REAL", null, false), 0), new HashSet(0));
        rq4 r9 = rq4.b(r60, "download");
        if (r16.equals(r9) == false) goto L17;
        HashMap r10 = new HashMap(42);
        r10.put("id", new oq4(1, 1, "id", "TEXT", null, true));
        r10.put("timestamp", new oq4(0, 1, "timestamp", "INTEGER", null, true));
        r10.put("server", new oq4(0, 1, "server", "TEXT", null, false));
        r10.put("parent_id", new oq4(0, 1, "parent_id", "TEXT", null, false));
        r10.put("is_dir", new oq4(0, 1, "is_dir", "INTEGER", null, true));
        r10.put("title", new oq4(0, 1, "title", "TEXT", null, false));
        r10.put("album", new oq4(0, 1, "album", "TEXT", null, false));
        r10.put("artist", new oq4(0, 1, "artist", "TEXT", null, false));
        r10.put("track", new oq4(0, 1, "track", "INTEGER", null, false));
        r10.put("year", new oq4(0, 1, "year", "INTEGER", null, false));
        r10.put("genre", new oq4(0, 1, "genre", "TEXT", null, false));
        r10.put("cover_art_id", new oq4(0, 1, "cover_art_id", "TEXT", null, false));
        r10.put("size", new oq4(0, 1, "size", "INTEGER", null, false));
        r10.put("content_type", new oq4(0, 1, "content_type", "TEXT", null, false));
        r10.put("suffix", new oq4(0, 1, "suffix", "TEXT", null, false));
        r10.put("transcoding_content_type", new oq4(0, 1, "transcoding_content_type", "TEXT", null, false));
        r10.put("transcoded_suffix", new oq4(0, 1, "transcoded_suffix", "TEXT", null, false));
        r10.put("duration", new oq4(0, 1, "duration", "INTEGER", null, false));
        r10.put("bitrate", new oq4(0, 1, "bitrate", "INTEGER", null, false));
        r10.put("sampling_rate", new oq4(0, 1, "sampling_rate", "INTEGER", null, false));
        r10.put("bit_depth", new oq4(0, 1, "bit_depth", "INTEGER", null, false));
        r10.put("path", new oq4(0, 1, "path", "TEXT", null, false));
        r10.put("is_video", new oq4(0, 1, "is_video", "INTEGER", null, true));
        r10.put("user_rating", new oq4(0, 1, "user_rating", "INTEGER", null, false));
        r10.put("average_rating", new oq4(0, 1, "average_rating", "REAL", null, false));
        r10.put("play_count", new oq4(0, 1, "play_count", "INTEGER", null, false));
        r10.put("disc_number", new oq4(0, 1, "disc_number", "INTEGER", null, false));
        r10.put("created", new oq4(0, 1, "created", "INTEGER", null, false));
        r10.put("starred", new oq4(0, 1, "starred", "INTEGER", null, false));
        r10.put("album_id", new oq4(0, 1, "album_id", "TEXT", null, false));
        r10.put("artist_id", new oq4(0, 1, "artist_id", "TEXT", null, false));
        r10.put("type", new oq4(0, 1, "type", "TEXT", null, false));
        r10.put("bookmark_position", new oq4(0, 1, "bookmark_position", "INTEGER", null, false));
        r10.put("original_width", new oq4(0, 1, "original_width", "INTEGER", null, false));
        r10.put("original_height", new oq4(0, 1, "original_height", "INTEGER", null, false));
        r10.put("album_artist", new oq4(0, 1, "album_artist", "TEXT", null, false));
        r10.put("rg_track_gain", new oq4(0, 1, "rg_track_gain", "REAL", null, false));
        r10.put("rg_album_gain", new oq4(0, 1, "rg_album_gain", "REAL", null, false));
        r10.put("rg_track_peak", new oq4(0, 1, "rg_track_peak", "REAL", null, false));
        r10.put("rg_album_peak", new oq4(0, 1, "rg_album_peak", "REAL", null, false));
        r10.put("rg_base_gain", new oq4(0, 1, "rg_base_gain", "REAL", null, false));
        rq4 r17 = new rq4("chronology", r10, f34.k(r10, "rg_fallback_gain", new oq4(0, 1, "rg_fallback_gain", "REAL", null, false), 0), new HashSet(0));
        rq4 r11 = rq4.b(r60, "chronology");
        if (r17.equals(r11) == false) goto L21;
        HashMap r13 = new HashMap(5);
        r13.put("timestamp", new oq4(1, 1, "timestamp", "INTEGER", null, true));
        r13.put("songId", new oq4(0, 1, "songId", "TEXT", null, false));
        r13.put("albumId", new oq4(0, 1, "albumId", "TEXT", null, false));
        r13.put("artistId", new oq4(0, 1, "artistId", "TEXT", null, false));
        rq4 r14 = new rq4("favorite", r13, f34.k(r13, "toStar", new oq4(0, 1, "toStar", "INTEGER", null, true), 0), new HashSet(0));
        rq4 r18 = rq4.b(r60, "favorite");
        if (r14.equals(r18) == false) goto L25;
        HashMap r19 = new HashMap(41);
        r19.put("index", new oq4(1, 1, "index", "INTEGER", null, true));
        r19.put("id", new oq4(0, 1, "id", "TEXT", null, false));
        r19.put("parent_id", new oq4(0, 1, "parent_id", "TEXT", null, false));
        r19.put("is_dir", new oq4(0, 1, "is_dir", "INTEGER", null, true));
        r19.put("title", new oq4(0, 1, "title", "TEXT", null, false));
        r19.put("album", new oq4(0, 1, "album", "TEXT", null, false));
        r19.put("artist", new oq4(0, 1, "artist", "TEXT", null, false));
        r19.put("track", new oq4(0, 1, "track", "INTEGER", null, false));
        r19.put("year", new oq4(0, 1, "year", "INTEGER", null, false));
        r19.put("genre", new oq4(0, 1, "genre", "TEXT", null, false));
        r19.put("cover_art_id", new oq4(0, 1, "cover_art_id", "TEXT", null, false));
        r19.put("size", new oq4(0, 1, "size", "INTEGER", null, false));
        r19.put("content_type", new oq4(0, 1, "content_type", "TEXT", null, false));
        r19.put("suffix", new oq4(0, 1, "suffix", "TEXT", null, false));
        r19.put("transcoding_content_type", new oq4(0, 1, "transcoding_content_type", "TEXT", null, false));
        r19.put("transcoded_suffix", new oq4(0, 1, "transcoded_suffix", "TEXT", null, false));
        r19.put("duration", new oq4(0, 1, "duration", "INTEGER", null, false));
        r19.put("bitrate", new oq4(0, 1, "bitrate", "INTEGER", null, false));
        r19.put("path", new oq4(0, 1, "path", "TEXT", null, false));
        r19.put("is_video", new oq4(0, 1, "is_video", "INTEGER", null, true));
        r19.put("user_rating", new oq4(0, 1, "user_rating", "INTEGER", null, false));
        r19.put("average_rating", new oq4(0, 1, "average_rating", "REAL", null, false));
        r19.put("play_count", new oq4(0, 1, "play_count", "INTEGER", null, false));
        r19.put("disc_number", new oq4(0, 1, "disc_number", "INTEGER", null, false));
        r19.put("created", new oq4(0, 1, "created", "INTEGER", null, false));
        r19.put("starred", new oq4(0, 1, "starred", "INTEGER", null, false));
        r19.put("album_id", new oq4(0, 1, "album_id", "TEXT", null, false));
        r19.put("artist_id", new oq4(0, 1, "artist_id", "TEXT", null, false));
        r19.put("type", new oq4(0, 1, "type", "TEXT", null, false));
        r19.put("bookmark_position", new oq4(0, 1, "bookmark_position", "INTEGER", null, false));
        r19.put("original_width", new oq4(0, 1, "original_width", "INTEGER", null, false));
        r19.put("original_height", new oq4(0, 1, "original_height", "INTEGER", null, false));
        r19.put("stream_id", new oq4(0, 1, "stream_id", "TEXT", null, false));
        r19.put("stream_url", new oq4(0, 1, "stream_url", "TEXT", null, false));
        r19.put("timestamp", new oq4(0, 1, "timestamp", "INTEGER", null, false));
        r19.put("rg_track_gain", new oq4(0, 1, "rg_track_gain", "REAL", null, false));
        r19.put("rg_album_gain", new oq4(0, 1, "rg_album_gain", "REAL", null, false));
        r19.put("rg_track_peak", new oq4(0, 1, "rg_track_peak", "REAL", null, false));
        r19.put("rg_album_peak", new oq4(0, 1, "rg_album_peak", "REAL", null, false));
        r19.put("rg_base_gain", new oq4(0, 1, "rg_base_gain", "REAL", null, false));
        rq4 r110 = new rq4("session_media_item", r19, f34.k(r19, "rg_fallback_gain", new oq4(0, 1, "rg_fallback_gain", "REAL", null, false), 0), new HashSet(0));
        rq4 r20 = rq4.b(r60, "session_media_item");
        if (r110.equals(r20) == false) goto L29;
        HashMap r21 = new HashMap(12);
        r21.put("id", new oq4(1, 1, "id", "TEXT", null, true));
        r21.put("name", new oq4(0, 1, "name", "TEXT", null, false));
        r21.put("duration", new oq4(0, 1, "duration", "INTEGER", null, true));
        r21.put("coverArt", new oq4(0, 1, "coverArt", "TEXT", null, false));
        r21.put("comment", new oq4(0, 1, "comment", "TEXT", null, false));
        r21.put("owner", new oq4(0, 1, "owner", "TEXT", null, false));
        r21.put("isUniversal", new oq4(0, 1, "isUniversal", "INTEGER", null, false));
        r21.put("songCount", new oq4(0, 1, "songCount", "INTEGER", "0", true));
        r21.put("created", new oq4(0, 1, "created", "INTEGER", null, false));
        r21.put("changed", new oq4(0, 1, "changed", "INTEGER", null, false));
        r21.put("lastPlayed", new oq4(0, 1, "lastPlayed", "INTEGER", "0", true));
        rq4 r22 = new rq4("playlist", r21, f34.k(r21, "allowedUsers", new oq4(0, 1, "allowedUsers", "TEXT", null, false), 0), new HashSet(0));
        rq4 r23 = rq4.b(r60, "playlist");
        if (r22.equals(r23) == false) goto L33;
        HashMap r24 = new HashMap(1);
        rq4 r111 = new rq4("pinned_playlist", r24, f34.k(r24, "playlistId", new oq4(1, 1, "playlistId", "TEXT", null, true), 0), new HashSet(0));
        rq4 r25 = rq4.b(r60, "pinned_playlist");
        if (r111.equals(r25) == false) goto L37;
        HashMap r26 = new HashMap(6);
        r26.put("song_id", new oq4(1, 1, "song_id", "TEXT", null, true));
        r26.put("artist", new oq4(0, 1, "artist", "TEXT", null, false));
        r26.put("title", new oq4(0, 1, "title", "TEXT", null, false));
        r26.put("lyrics", new oq4(0, 1, "lyrics", "TEXT", null, false));
        r26.put("structured_lyrics", new oq4(0, 1, "structured_lyrics", "TEXT", null, false));
        rq4 r27 = new rq4("lyrics_cache", r26, f34.k(r26, "updated_at", new oq4(0, 1, "updated_at", "INTEGER", null, true), 0), new HashSet(0));
        rq4 r28 = rq4.b(r60, "lyrics_cache");
        if (r27.equals(r28) == false) goto L41;
        HashMap r29 = new HashMap(6);
        r29.put("id", new oq4(1, 1, "id", "TEXT", null, true));
        r29.put("name", new oq4(0, 1, "name", "TEXT", null, false));
        r29.put("stream_url", new oq4(0, 1, "stream_url", "TEXT", null, false));
        r29.put("home_page_url", new oq4(0, 1, "home_page_url", "TEXT", null, false));
        r29.put("source", new oq4(0, 1, "source", "TEXT", "'subsonic'", true));
        rq4 r30 = new rq4("internet_radio_station_cache", r29, f34.k(r29, "cover_art_url", new oq4(0, 1, "cover_art_url", "TEXT", null, false), 0), new HashSet(0));
        rq4 r31 = rq4.b(r60, "internet_radio_station_cache");
        if (r30.equals(r31) == false) goto L45;
        HashMap r32 = new HashMap(10);
        r32.put("playlist_id", new oq4(1, 1, "playlist_id", "TEXT", null, true));
        r32.put("id", new oq4(2, 1, "id", "TEXT", null, true));
        r32.put("title", new oq4(0, 1, "title", "TEXT", null, false));
        r32.put("artist", new oq4(0, 1, "artist", "TEXT", null, false));
        r32.put("album", new oq4(0, 1, "album", "TEXT", null, false));
        r32.put("track", new oq4(0, 1, "track", "INTEGER", null, false));
        r32.put("cover_art_id", new oq4(0, 1, "cover_art_id", "TEXT", null, false));
        r32.put("duration", new oq4(0, 1, "duration", "INTEGER", null, false));
        r32.put("album_id", new oq4(0, 1, "album_id", "TEXT", null, false));
        HashSet r33 = f34.k(r32, "artist_id", new oq4(0, 1, "artist_id", "TEXT", null, false), 1);
        r33.add(new pq4("playlist", "NO ACTION", "NO ACTION", Arrays.asList(new String[]{"playlist_id"}), Arrays.asList(new String[]{"id"})));
        HashSet r34 = new HashSet(1);
        r34.add(new qq4("index_playlist_song_playlist_id", false, Arrays.asList(new String[]{"playlist_id"}), Arrays.asList(new String[]{"ASC"})));
        rq4 r35 = new rq4("playlist_song", r32, r33, r34);
        rq4 r36 = rq4.b(r60, "playlist_song");
        if (r35.equals(r36) == false) goto L49;
        HashMap r37 = new HashMap(2);
        r37.put("playlistId", new oq4(1, 1, "playlistId", "TEXT", null, true));
        rq4 r38 = new rq4("synced_playlist", r37, f34.k(r37, "serverId", new oq4(2, 1, "serverId", "TEXT", null, true), 0), new HashSet(0));
        rq4 r0 = rq4.b(r60, "synced_playlist");
        if (r38.equals(r0) == true) goto L55;
        return new u24(false, f34.g("synced_playlist(com.eddyizm.tempus.model.SyncedPlaylist).\n Expected:\n", r38, "\n Found:\n", r0));
    L55:
        return new u24(true, null);
    L49:
        return new u24(false, f34.g("playlist_song(com.eddyizm.tempus.model.PlaylistSong).\n Expected:\n", r35, "\n Found:\n", r36));
    L45:
        return new u24(false, f34.g("internet_radio_station_cache(com.eddyizm.tempus.model.InternetRadioStationCache).\n Expected:\n", r30, "\n Found:\n", r31));
    L41:
        return new u24(false, f34.g("lyrics_cache(com.eddyizm.tempus.model.LyricsCache).\n Expected:\n", r27, "\n Found:\n", r28));
    L37:
        return new u24(false, f34.g("pinned_playlist(com.eddyizm.tempus.model.PinnedPlaylist).\n Expected:\n", r111, "\n Found:\n", r25));
    L33:
        return new u24(false, f34.g("playlist(com.eddyizm.tempus.subsonic.models.Playlist).\n Expected:\n", r22, "\n Found:\n", r23));
    L29:
        return new u24(false, f34.g("session_media_item(com.eddyizm.tempus.model.SessionMediaItem).\n Expected:\n", r110, "\n Found:\n", r20));
    L25:
        return new u24(false, f34.g("favorite(com.eddyizm.tempus.model.Favorite).\n Expected:\n", r14, "\n Found:\n", r18));
    L21:
        return new u24(false, f34.g("chronology(com.eddyizm.tempus.model.Chronology).\n Expected:\n", r17, "\n Found:\n", r11));
    L17:
        return new u24(false, f34.g("download(com.eddyizm.tempus.model.Download).\n Expected:\n", r16, "\n Found:\n", r9));
    L13:
        return new u24(false, f34.g("recent_search(com.eddyizm.tempus.model.RecentSearch).\n Expected:\n", r15, "\n Found:\n", r7));
    L9:
        return new u24(false, f34.g("server(com.eddyizm.tempus.model.Server).\n Expected:\n", r12, "\n Found:\n", r5));
    L5:
        return new u24(false, f34.g("queue(com.eddyizm.tempus.model.Queue).\n Expected:\n", r2, "\n Found:\n", r3));
    }
}
