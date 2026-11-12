package defpackage;

import com.eddyizm.tempus.database.AppDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class uh extends qz0 {
    public final /* synthetic */ AppDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh(AppDatabase_Impl appDatabase_Impl) {
        super(23, "5cdfa08b646d6b874587abcc85831960", "dbbf5062c5703cfdc3ae63eb9f5ce268");
        this.d = appDatabase_Impl;
    }

    @Override // defpackage.qz0
    public final void a(x34 x34Var) {
        h12.n(x34Var, "CREATE TABLE IF NOT EXISTS `queue` (`id` TEXT NOT NULL, `track_order` INTEGER NOT NULL, `last_play` INTEGER NOT NULL, `playing_changed` INTEGER NOT NULL, `stream_id` TEXT, `parent_id` TEXT, `is_dir` INTEGER NOT NULL, `title` TEXT, `album` TEXT, `artist` TEXT, `track` INTEGER, `year` INTEGER, `genre` TEXT, `cover_art_id` TEXT, `size` INTEGER, `content_type` TEXT, `suffix` TEXT, `transcoding_content_type` TEXT, `transcoded_suffix` TEXT, `duration` INTEGER, `bitrate` INTEGER, `sampling_rate` INTEGER, `bit_depth` INTEGER, `path` TEXT, `is_video` INTEGER NOT NULL, `user_rating` INTEGER, `average_rating` REAL, `play_count` INTEGER, `disc_number` INTEGER, `created` INTEGER, `starred` INTEGER, `album_id` TEXT, `artist_id` TEXT, `type` TEXT, `bookmark_position` INTEGER, `original_width` INTEGER, `original_height` INTEGER, `album_artist` TEXT, `rg_track_gain` REAL, `rg_album_gain` REAL, `rg_track_peak` REAL, `rg_album_peak` REAL, `rg_base_gain` REAL, `rg_fallback_gain` REAL, PRIMARY KEY(`track_order`))");
        h12.n(x34Var, "CREATE TABLE IF NOT EXISTS `server` (`id` TEXT NOT NULL, `server_name` TEXT NOT NULL, `username` TEXT NOT NULL, `password` TEXT NOT NULL, `address` TEXT NOT NULL, `local_address` TEXT, `timestamp` INTEGER NOT NULL, `low_security` INTEGER NOT NULL DEFAULT false, `client_cert` TEXT, PRIMARY KEY(`id`))");
        h12.n(x34Var, "CREATE TABLE IF NOT EXISTS `recent_search` (`search` TEXT NOT NULL, `timestamp` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`search`))");
        h12.n(x34Var, "CREATE TABLE IF NOT EXISTS `download` (`id` TEXT NOT NULL, `playlist_id` TEXT, `playlist_name` TEXT, `download_state` INTEGER NOT NULL DEFAULT 1, `download_uri` TEXT DEFAULT '', `parent_id` TEXT, `is_dir` INTEGER NOT NULL, `title` TEXT, `album` TEXT, `artist` TEXT, `track` INTEGER, `year` INTEGER, `genre` TEXT, `cover_art_id` TEXT, `size` INTEGER, `content_type` TEXT, `suffix` TEXT, `transcoding_content_type` TEXT, `transcoded_suffix` TEXT, `duration` INTEGER, `bitrate` INTEGER, `sampling_rate` INTEGER, `bit_depth` INTEGER, `path` TEXT, `is_video` INTEGER NOT NULL, `user_rating` INTEGER, `average_rating` REAL, `play_count` INTEGER, `disc_number` INTEGER, `created` INTEGER, `starred` INTEGER, `album_id` TEXT, `artist_id` TEXT, `type` TEXT, `bookmark_position` INTEGER, `original_width` INTEGER, `original_height` INTEGER, `album_artist` TEXT, `rg_track_gain` REAL, `rg_album_gain` REAL, `rg_track_peak` REAL, `rg_album_peak` REAL, `rg_base_gain` REAL, `rg_fallback_gain` REAL, PRIMARY KEY(`id`))");
        h12.n(x34Var, "CREATE TABLE IF NOT EXISTS `chronology` (`id` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `server` TEXT, `parent_id` TEXT, `is_dir` INTEGER NOT NULL, `title` TEXT, `album` TEXT, `artist` TEXT, `track` INTEGER, `year` INTEGER, `genre` TEXT, `cover_art_id` TEXT, `size` INTEGER, `content_type` TEXT, `suffix` TEXT, `transcoding_content_type` TEXT, `transcoded_suffix` TEXT, `duration` INTEGER, `bitrate` INTEGER, `sampling_rate` INTEGER, `bit_depth` INTEGER, `path` TEXT, `is_video` INTEGER NOT NULL, `user_rating` INTEGER, `average_rating` REAL, `play_count` INTEGER, `disc_number` INTEGER, `created` INTEGER, `starred` INTEGER, `album_id` TEXT, `artist_id` TEXT, `type` TEXT, `bookmark_position` INTEGER, `original_width` INTEGER, `original_height` INTEGER, `album_artist` TEXT, `rg_track_gain` REAL, `rg_album_gain` REAL, `rg_track_peak` REAL, `rg_album_peak` REAL, `rg_base_gain` REAL, `rg_fallback_gain` REAL, PRIMARY KEY(`id`))");
        h12.n(x34Var, "CREATE TABLE IF NOT EXISTS `favorite` (`timestamp` INTEGER NOT NULL, `songId` TEXT, `albumId` TEXT, `artistId` TEXT, `toStar` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))");
        h12.n(x34Var, "CREATE TABLE IF NOT EXISTS `session_media_item` (`index` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `id` TEXT, `parent_id` TEXT, `is_dir` INTEGER NOT NULL, `title` TEXT, `album` TEXT, `artist` TEXT, `track` INTEGER, `year` INTEGER, `genre` TEXT, `cover_art_id` TEXT, `size` INTEGER, `content_type` TEXT, `suffix` TEXT, `transcoding_content_type` TEXT, `transcoded_suffix` TEXT, `duration` INTEGER, `bitrate` INTEGER, `path` TEXT, `is_video` INTEGER NOT NULL, `user_rating` INTEGER, `average_rating` REAL, `play_count` INTEGER, `disc_number` INTEGER, `created` INTEGER, `starred` INTEGER, `album_id` TEXT, `artist_id` TEXT, `type` TEXT, `bookmark_position` INTEGER, `original_width` INTEGER, `original_height` INTEGER, `stream_id` TEXT, `stream_url` TEXT, `timestamp` INTEGER, `rg_track_gain` REAL, `rg_album_gain` REAL, `rg_track_peak` REAL, `rg_album_peak` REAL, `rg_base_gain` REAL, `rg_fallback_gain` REAL)");
        h12.n(x34Var, "CREATE TABLE IF NOT EXISTS `playlist` (`id` TEXT NOT NULL, `name` TEXT, `duration` INTEGER NOT NULL, `coverArt` TEXT, `comment` TEXT, `owner` TEXT, `isUniversal` INTEGER, `songCount` INTEGER NOT NULL DEFAULT 0, `created` INTEGER, `changed` INTEGER, `lastPlayed` INTEGER NOT NULL DEFAULT 0, `allowedUsers` TEXT, PRIMARY KEY(`id`))");
        h12.n(x34Var, "CREATE TABLE IF NOT EXISTS `pinned_playlist` (`playlistId` TEXT NOT NULL, PRIMARY KEY(`playlistId`))");
        h12.n(x34Var, "CREATE TABLE IF NOT EXISTS `lyrics_cache` (`song_id` TEXT NOT NULL, `artist` TEXT, `title` TEXT, `lyrics` TEXT, `structured_lyrics` TEXT, `updated_at` INTEGER NOT NULL, PRIMARY KEY(`song_id`))");
        h12.n(x34Var, "CREATE TABLE IF NOT EXISTS `internet_radio_station_cache` (`id` TEXT NOT NULL, `name` TEXT, `stream_url` TEXT, `home_page_url` TEXT, `source` TEXT NOT NULL DEFAULT 'subsonic', `cover_art_url` TEXT, PRIMARY KEY(`id`))");
        h12.n(x34Var, "CREATE TABLE IF NOT EXISTS `playlist_song` (`playlist_id` TEXT NOT NULL, `id` TEXT NOT NULL, `title` TEXT, `artist` TEXT, `album` TEXT, `track` INTEGER, `cover_art_id` TEXT, `duration` INTEGER, `album_id` TEXT, `artist_id` TEXT, PRIMARY KEY(`playlist_id`, `id`), FOREIGN KEY(`playlist_id`) REFERENCES `playlist`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        h12.n(x34Var, "CREATE INDEX IF NOT EXISTS `index_playlist_song_playlist_id` ON `playlist_song` (`playlist_id`)");
        h12.n(x34Var, "CREATE TABLE IF NOT EXISTS `synced_playlist` (`playlistId` TEXT NOT NULL, `serverId` TEXT NOT NULL, PRIMARY KEY(`playlistId`, `serverId`))");
        h12.n(x34Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        h12.n(x34Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5cdfa08b646d6b874587abcc85831960')");
    }

    @Override // defpackage.qz0
    public final void c(x34 x34Var) {
        h12.n(x34Var, "DROP TABLE IF EXISTS `queue`");
        h12.n(x34Var, "DROP TABLE IF EXISTS `server`");
        h12.n(x34Var, "DROP TABLE IF EXISTS `recent_search`");
        h12.n(x34Var, "DROP TABLE IF EXISTS `download`");
        h12.n(x34Var, "DROP TABLE IF EXISTS `chronology`");
        h12.n(x34Var, "DROP TABLE IF EXISTS `favorite`");
        h12.n(x34Var, "DROP TABLE IF EXISTS `session_media_item`");
        h12.n(x34Var, "DROP TABLE IF EXISTS `playlist`");
        h12.n(x34Var, "DROP TABLE IF EXISTS `pinned_playlist`");
        h12.n(x34Var, "DROP TABLE IF EXISTS `lyrics_cache`");
        h12.n(x34Var, "DROP TABLE IF EXISTS `internet_radio_station_cache`");
        h12.n(x34Var, "DROP TABLE IF EXISTS `playlist_song`");
        h12.n(x34Var, "DROP TABLE IF EXISTS `synced_playlist`");
    }

    @Override // defpackage.qz0
    public final void r(x34 x34Var) {
    }

    @Override // defpackage.qz0
    public final void s(x34 x34Var) {
        h12.n(x34Var, "PRAGMA foreign_keys = ON");
        this.d.p(x34Var);
    }

    @Override // defpackage.qz0
    public final void t(x34 x34Var) {
    }

    @Override // defpackage.qz0
    public final void u(x34 x34Var) {
        xl.l(x34Var);
    }

    @Override // defpackage.qz0
    public final u24 v(x34 x34Var) {
        HashMap map = new HashMap(44);
        map.put("id", new oq4(0, 1, "id", "TEXT", null, true));
        map.put("track_order", new oq4(1, 1, "track_order", "INTEGER", null, true));
        map.put("last_play", new oq4(0, 1, "last_play", "INTEGER", null, true));
        map.put("playing_changed", new oq4(0, 1, "playing_changed", "INTEGER", null, true));
        map.put("stream_id", new oq4(0, 1, "stream_id", "TEXT", null, false));
        map.put("parent_id", new oq4(0, 1, "parent_id", "TEXT", null, false));
        map.put("is_dir", new oq4(0, 1, "is_dir", "INTEGER", null, true));
        map.put("title", new oq4(0, 1, "title", "TEXT", null, false));
        map.put("album", new oq4(0, 1, "album", "TEXT", null, false));
        map.put("artist", new oq4(0, 1, "artist", "TEXT", null, false));
        map.put("track", new oq4(0, 1, "track", "INTEGER", null, false));
        map.put("year", new oq4(0, 1, "year", "INTEGER", null, false));
        map.put("genre", new oq4(0, 1, "genre", "TEXT", null, false));
        map.put("cover_art_id", new oq4(0, 1, "cover_art_id", "TEXT", null, false));
        map.put("size", new oq4(0, 1, "size", "INTEGER", null, false));
        map.put("content_type", new oq4(0, 1, "content_type", "TEXT", null, false));
        map.put("suffix", new oq4(0, 1, "suffix", "TEXT", null, false));
        map.put("transcoding_content_type", new oq4(0, 1, "transcoding_content_type", "TEXT", null, false));
        map.put("transcoded_suffix", new oq4(0, 1, "transcoded_suffix", "TEXT", null, false));
        map.put("duration", new oq4(0, 1, "duration", "INTEGER", null, false));
        map.put("bitrate", new oq4(0, 1, "bitrate", "INTEGER", null, false));
        map.put("sampling_rate", new oq4(0, 1, "sampling_rate", "INTEGER", null, false));
        map.put("bit_depth", new oq4(0, 1, "bit_depth", "INTEGER", null, false));
        map.put("path", new oq4(0, 1, "path", "TEXT", null, false));
        map.put("is_video", new oq4(0, 1, "is_video", "INTEGER", null, true));
        map.put("user_rating", new oq4(0, 1, "user_rating", "INTEGER", null, false));
        map.put("average_rating", new oq4(0, 1, "average_rating", "REAL", null, false));
        map.put("play_count", new oq4(0, 1, "play_count", "INTEGER", null, false));
        map.put("disc_number", new oq4(0, 1, "disc_number", "INTEGER", null, false));
        map.put("created", new oq4(0, 1, "created", "INTEGER", null, false));
        map.put("starred", new oq4(0, 1, "starred", "INTEGER", null, false));
        map.put("album_id", new oq4(0, 1, "album_id", "TEXT", null, false));
        map.put("artist_id", new oq4(0, 1, "artist_id", "TEXT", null, false));
        map.put("type", new oq4(0, 1, "type", "TEXT", null, false));
        map.put("bookmark_position", new oq4(0, 1, "bookmark_position", "INTEGER", null, false));
        map.put("original_width", new oq4(0, 1, "original_width", "INTEGER", null, false));
        map.put("original_height", new oq4(0, 1, "original_height", "INTEGER", null, false));
        map.put("album_artist", new oq4(0, 1, "album_artist", "TEXT", null, false));
        map.put("rg_track_gain", new oq4(0, 1, "rg_track_gain", "REAL", null, false));
        map.put("rg_album_gain", new oq4(0, 1, "rg_album_gain", "REAL", null, false));
        map.put("rg_track_peak", new oq4(0, 1, "rg_track_peak", "REAL", null, false));
        map.put("rg_album_peak", new oq4(0, 1, "rg_album_peak", "REAL", null, false));
        map.put("rg_base_gain", new oq4(0, 1, "rg_base_gain", "REAL", null, false));
        rq4 rq4Var = new rq4("queue", map, f34.k(map, "rg_fallback_gain", new oq4(0, 1, "rg_fallback_gain", "REAL", null, false), 0), new HashSet(0));
        rq4 rq4VarB = rq4.b(x34Var, "queue");
        if (!rq4Var.equals(rq4VarB)) {
            return new u24(false, f34.g("queue(com.eddyizm.tempus.model.Queue).\n Expected:\n", rq4Var, "\n Found:\n", rq4VarB));
        }
        HashMap map2 = new HashMap(9);
        map2.put("id", new oq4(1, 1, "id", "TEXT", null, true));
        map2.put("server_name", new oq4(0, 1, "server_name", "TEXT", null, true));
        map2.put("username", new oq4(0, 1, "username", "TEXT", null, true));
        map2.put("password", new oq4(0, 1, "password", "TEXT", null, true));
        map2.put("address", new oq4(0, 1, "address", "TEXT", null, true));
        map2.put("local_address", new oq4(0, 1, "local_address", "TEXT", null, false));
        map2.put("timestamp", new oq4(0, 1, "timestamp", "INTEGER", null, true));
        map2.put("low_security", new oq4(0, 1, "low_security", "INTEGER", "false", true));
        rq4 rq4Var2 = new rq4("server", map2, f34.k(map2, "client_cert", new oq4(0, 1, "client_cert", "TEXT", null, false), 0), new HashSet(0));
        rq4 rq4VarB2 = rq4.b(x34Var, "server");
        if (!rq4Var2.equals(rq4VarB2)) {
            return new u24(false, f34.g("server(com.eddyizm.tempus.model.Server).\n Expected:\n", rq4Var2, "\n Found:\n", rq4VarB2));
        }
        HashMap map3 = new HashMap(2);
        map3.put("search", new oq4(1, 1, "search", "TEXT", null, true));
        rq4 rq4Var3 = new rq4("recent_search", map3, f34.k(map3, "timestamp", new oq4(0, 1, "timestamp", "INTEGER", "0", true), 0), new HashSet(0));
        rq4 rq4VarB3 = rq4.b(x34Var, "recent_search");
        if (!rq4Var3.equals(rq4VarB3)) {
            return new u24(false, f34.g("recent_search(com.eddyizm.tempus.model.RecentSearch).\n Expected:\n", rq4Var3, "\n Found:\n", rq4VarB3));
        }
        HashMap map4 = new HashMap(44);
        map4.put("id", new oq4(1, 1, "id", "TEXT", null, true));
        map4.put("playlist_id", new oq4(0, 1, "playlist_id", "TEXT", null, false));
        map4.put("playlist_name", new oq4(0, 1, "playlist_name", "TEXT", null, false));
        map4.put("download_state", new oq4(0, 1, "download_state", "INTEGER", "1", true));
        map4.put("download_uri", new oq4(0, 1, "download_uri", "TEXT", "''", false));
        map4.put("parent_id", new oq4(0, 1, "parent_id", "TEXT", null, false));
        map4.put("is_dir", new oq4(0, 1, "is_dir", "INTEGER", null, true));
        map4.put("title", new oq4(0, 1, "title", "TEXT", null, false));
        map4.put("album", new oq4(0, 1, "album", "TEXT", null, false));
        map4.put("artist", new oq4(0, 1, "artist", "TEXT", null, false));
        map4.put("track", new oq4(0, 1, "track", "INTEGER", null, false));
        map4.put("year", new oq4(0, 1, "year", "INTEGER", null, false));
        map4.put("genre", new oq4(0, 1, "genre", "TEXT", null, false));
        map4.put("cover_art_id", new oq4(0, 1, "cover_art_id", "TEXT", null, false));
        map4.put("size", new oq4(0, 1, "size", "INTEGER", null, false));
        map4.put("content_type", new oq4(0, 1, "content_type", "TEXT", null, false));
        map4.put("suffix", new oq4(0, 1, "suffix", "TEXT", null, false));
        map4.put("transcoding_content_type", new oq4(0, 1, "transcoding_content_type", "TEXT", null, false));
        map4.put("transcoded_suffix", new oq4(0, 1, "transcoded_suffix", "TEXT", null, false));
        map4.put("duration", new oq4(0, 1, "duration", "INTEGER", null, false));
        map4.put("bitrate", new oq4(0, 1, "bitrate", "INTEGER", null, false));
        map4.put("sampling_rate", new oq4(0, 1, "sampling_rate", "INTEGER", null, false));
        map4.put("bit_depth", new oq4(0, 1, "bit_depth", "INTEGER", null, false));
        map4.put("path", new oq4(0, 1, "path", "TEXT", null, false));
        map4.put("is_video", new oq4(0, 1, "is_video", "INTEGER", null, true));
        map4.put("user_rating", new oq4(0, 1, "user_rating", "INTEGER", null, false));
        map4.put("average_rating", new oq4(0, 1, "average_rating", "REAL", null, false));
        map4.put("play_count", new oq4(0, 1, "play_count", "INTEGER", null, false));
        map4.put("disc_number", new oq4(0, 1, "disc_number", "INTEGER", null, false));
        map4.put("created", new oq4(0, 1, "created", "INTEGER", null, false));
        map4.put("starred", new oq4(0, 1, "starred", "INTEGER", null, false));
        map4.put("album_id", new oq4(0, 1, "album_id", "TEXT", null, false));
        map4.put("artist_id", new oq4(0, 1, "artist_id", "TEXT", null, false));
        map4.put("type", new oq4(0, 1, "type", "TEXT", null, false));
        map4.put("bookmark_position", new oq4(0, 1, "bookmark_position", "INTEGER", null, false));
        map4.put("original_width", new oq4(0, 1, "original_width", "INTEGER", null, false));
        map4.put("original_height", new oq4(0, 1, "original_height", "INTEGER", null, false));
        map4.put("album_artist", new oq4(0, 1, "album_artist", "TEXT", null, false));
        map4.put("rg_track_gain", new oq4(0, 1, "rg_track_gain", "REAL", null, false));
        map4.put("rg_album_gain", new oq4(0, 1, "rg_album_gain", "REAL", null, false));
        map4.put("rg_track_peak", new oq4(0, 1, "rg_track_peak", "REAL", null, false));
        map4.put("rg_album_peak", new oq4(0, 1, "rg_album_peak", "REAL", null, false));
        map4.put("rg_base_gain", new oq4(0, 1, "rg_base_gain", "REAL", null, false));
        rq4 rq4Var4 = new rq4("download", map4, f34.k(map4, "rg_fallback_gain", new oq4(0, 1, "rg_fallback_gain", "REAL", null, false), 0), new HashSet(0));
        rq4 rq4VarB4 = rq4.b(x34Var, "download");
        if (!rq4Var4.equals(rq4VarB4)) {
            return new u24(false, f34.g("download(com.eddyizm.tempus.model.Download).\n Expected:\n", rq4Var4, "\n Found:\n", rq4VarB4));
        }
        HashMap map5 = new HashMap(42);
        map5.put("id", new oq4(1, 1, "id", "TEXT", null, true));
        map5.put("timestamp", new oq4(0, 1, "timestamp", "INTEGER", null, true));
        map5.put("server", new oq4(0, 1, "server", "TEXT", null, false));
        map5.put("parent_id", new oq4(0, 1, "parent_id", "TEXT", null, false));
        map5.put("is_dir", new oq4(0, 1, "is_dir", "INTEGER", null, true));
        map5.put("title", new oq4(0, 1, "title", "TEXT", null, false));
        map5.put("album", new oq4(0, 1, "album", "TEXT", null, false));
        map5.put("artist", new oq4(0, 1, "artist", "TEXT", null, false));
        map5.put("track", new oq4(0, 1, "track", "INTEGER", null, false));
        map5.put("year", new oq4(0, 1, "year", "INTEGER", null, false));
        map5.put("genre", new oq4(0, 1, "genre", "TEXT", null, false));
        map5.put("cover_art_id", new oq4(0, 1, "cover_art_id", "TEXT", null, false));
        map5.put("size", new oq4(0, 1, "size", "INTEGER", null, false));
        map5.put("content_type", new oq4(0, 1, "content_type", "TEXT", null, false));
        map5.put("suffix", new oq4(0, 1, "suffix", "TEXT", null, false));
        map5.put("transcoding_content_type", new oq4(0, 1, "transcoding_content_type", "TEXT", null, false));
        map5.put("transcoded_suffix", new oq4(0, 1, "transcoded_suffix", "TEXT", null, false));
        map5.put("duration", new oq4(0, 1, "duration", "INTEGER", null, false));
        map5.put("bitrate", new oq4(0, 1, "bitrate", "INTEGER", null, false));
        map5.put("sampling_rate", new oq4(0, 1, "sampling_rate", "INTEGER", null, false));
        map5.put("bit_depth", new oq4(0, 1, "bit_depth", "INTEGER", null, false));
        map5.put("path", new oq4(0, 1, "path", "TEXT", null, false));
        map5.put("is_video", new oq4(0, 1, "is_video", "INTEGER", null, true));
        map5.put("user_rating", new oq4(0, 1, "user_rating", "INTEGER", null, false));
        map5.put("average_rating", new oq4(0, 1, "average_rating", "REAL", null, false));
        map5.put("play_count", new oq4(0, 1, "play_count", "INTEGER", null, false));
        map5.put("disc_number", new oq4(0, 1, "disc_number", "INTEGER", null, false));
        map5.put("created", new oq4(0, 1, "created", "INTEGER", null, false));
        map5.put("starred", new oq4(0, 1, "starred", "INTEGER", null, false));
        map5.put("album_id", new oq4(0, 1, "album_id", "TEXT", null, false));
        map5.put("artist_id", new oq4(0, 1, "artist_id", "TEXT", null, false));
        map5.put("type", new oq4(0, 1, "type", "TEXT", null, false));
        map5.put("bookmark_position", new oq4(0, 1, "bookmark_position", "INTEGER", null, false));
        map5.put("original_width", new oq4(0, 1, "original_width", "INTEGER", null, false));
        map5.put("original_height", new oq4(0, 1, "original_height", "INTEGER", null, false));
        map5.put("album_artist", new oq4(0, 1, "album_artist", "TEXT", null, false));
        map5.put("rg_track_gain", new oq4(0, 1, "rg_track_gain", "REAL", null, false));
        map5.put("rg_album_gain", new oq4(0, 1, "rg_album_gain", "REAL", null, false));
        map5.put("rg_track_peak", new oq4(0, 1, "rg_track_peak", "REAL", null, false));
        map5.put("rg_album_peak", new oq4(0, 1, "rg_album_peak", "REAL", null, false));
        map5.put("rg_base_gain", new oq4(0, 1, "rg_base_gain", "REAL", null, false));
        rq4 rq4Var5 = new rq4("chronology", map5, f34.k(map5, "rg_fallback_gain", new oq4(0, 1, "rg_fallback_gain", "REAL", null, false), 0), new HashSet(0));
        rq4 rq4VarB5 = rq4.b(x34Var, "chronology");
        if (!rq4Var5.equals(rq4VarB5)) {
            return new u24(false, f34.g("chronology(com.eddyizm.tempus.model.Chronology).\n Expected:\n", rq4Var5, "\n Found:\n", rq4VarB5));
        }
        HashMap map6 = new HashMap(5);
        map6.put("timestamp", new oq4(1, 1, "timestamp", "INTEGER", null, true));
        map6.put("songId", new oq4(0, 1, "songId", "TEXT", null, false));
        map6.put("albumId", new oq4(0, 1, "albumId", "TEXT", null, false));
        map6.put("artistId", new oq4(0, 1, "artistId", "TEXT", null, false));
        rq4 rq4Var6 = new rq4("favorite", map6, f34.k(map6, "toStar", new oq4(0, 1, "toStar", "INTEGER", null, true), 0), new HashSet(0));
        rq4 rq4VarB6 = rq4.b(x34Var, "favorite");
        if (!rq4Var6.equals(rq4VarB6)) {
            return new u24(false, f34.g("favorite(com.eddyizm.tempus.model.Favorite).\n Expected:\n", rq4Var6, "\n Found:\n", rq4VarB6));
        }
        HashMap map7 = new HashMap(41);
        map7.put("index", new oq4(1, 1, "index", "INTEGER", null, true));
        map7.put("id", new oq4(0, 1, "id", "TEXT", null, false));
        map7.put("parent_id", new oq4(0, 1, "parent_id", "TEXT", null, false));
        map7.put("is_dir", new oq4(0, 1, "is_dir", "INTEGER", null, true));
        map7.put("title", new oq4(0, 1, "title", "TEXT", null, false));
        map7.put("album", new oq4(0, 1, "album", "TEXT", null, false));
        map7.put("artist", new oq4(0, 1, "artist", "TEXT", null, false));
        map7.put("track", new oq4(0, 1, "track", "INTEGER", null, false));
        map7.put("year", new oq4(0, 1, "year", "INTEGER", null, false));
        map7.put("genre", new oq4(0, 1, "genre", "TEXT", null, false));
        map7.put("cover_art_id", new oq4(0, 1, "cover_art_id", "TEXT", null, false));
        map7.put("size", new oq4(0, 1, "size", "INTEGER", null, false));
        map7.put("content_type", new oq4(0, 1, "content_type", "TEXT", null, false));
        map7.put("suffix", new oq4(0, 1, "suffix", "TEXT", null, false));
        map7.put("transcoding_content_type", new oq4(0, 1, "transcoding_content_type", "TEXT", null, false));
        map7.put("transcoded_suffix", new oq4(0, 1, "transcoded_suffix", "TEXT", null, false));
        map7.put("duration", new oq4(0, 1, "duration", "INTEGER", null, false));
        map7.put("bitrate", new oq4(0, 1, "bitrate", "INTEGER", null, false));
        map7.put("path", new oq4(0, 1, "path", "TEXT", null, false));
        map7.put("is_video", new oq4(0, 1, "is_video", "INTEGER", null, true));
        map7.put("user_rating", new oq4(0, 1, "user_rating", "INTEGER", null, false));
        map7.put("average_rating", new oq4(0, 1, "average_rating", "REAL", null, false));
        map7.put("play_count", new oq4(0, 1, "play_count", "INTEGER", null, false));
        map7.put("disc_number", new oq4(0, 1, "disc_number", "INTEGER", null, false));
        map7.put("created", new oq4(0, 1, "created", "INTEGER", null, false));
        map7.put("starred", new oq4(0, 1, "starred", "INTEGER", null, false));
        map7.put("album_id", new oq4(0, 1, "album_id", "TEXT", null, false));
        map7.put("artist_id", new oq4(0, 1, "artist_id", "TEXT", null, false));
        map7.put("type", new oq4(0, 1, "type", "TEXT", null, false));
        map7.put("bookmark_position", new oq4(0, 1, "bookmark_position", "INTEGER", null, false));
        map7.put("original_width", new oq4(0, 1, "original_width", "INTEGER", null, false));
        map7.put("original_height", new oq4(0, 1, "original_height", "INTEGER", null, false));
        map7.put("stream_id", new oq4(0, 1, "stream_id", "TEXT", null, false));
        map7.put("stream_url", new oq4(0, 1, "stream_url", "TEXT", null, false));
        map7.put("timestamp", new oq4(0, 1, "timestamp", "INTEGER", null, false));
        map7.put("rg_track_gain", new oq4(0, 1, "rg_track_gain", "REAL", null, false));
        map7.put("rg_album_gain", new oq4(0, 1, "rg_album_gain", "REAL", null, false));
        map7.put("rg_track_peak", new oq4(0, 1, "rg_track_peak", "REAL", null, false));
        map7.put("rg_album_peak", new oq4(0, 1, "rg_album_peak", "REAL", null, false));
        map7.put("rg_base_gain", new oq4(0, 1, "rg_base_gain", "REAL", null, false));
        rq4 rq4Var7 = new rq4("session_media_item", map7, f34.k(map7, "rg_fallback_gain", new oq4(0, 1, "rg_fallback_gain", "REAL", null, false), 0), new HashSet(0));
        rq4 rq4VarB7 = rq4.b(x34Var, "session_media_item");
        if (!rq4Var7.equals(rq4VarB7)) {
            return new u24(false, f34.g("session_media_item(com.eddyizm.tempus.model.SessionMediaItem).\n Expected:\n", rq4Var7, "\n Found:\n", rq4VarB7));
        }
        HashMap map8 = new HashMap(12);
        map8.put("id", new oq4(1, 1, "id", "TEXT", null, true));
        map8.put("name", new oq4(0, 1, "name", "TEXT", null, false));
        map8.put("duration", new oq4(0, 1, "duration", "INTEGER", null, true));
        map8.put("coverArt", new oq4(0, 1, "coverArt", "TEXT", null, false));
        map8.put("comment", new oq4(0, 1, "comment", "TEXT", null, false));
        map8.put("owner", new oq4(0, 1, "owner", "TEXT", null, false));
        map8.put("isUniversal", new oq4(0, 1, "isUniversal", "INTEGER", null, false));
        map8.put("songCount", new oq4(0, 1, "songCount", "INTEGER", "0", true));
        map8.put("created", new oq4(0, 1, "created", "INTEGER", null, false));
        map8.put("changed", new oq4(0, 1, "changed", "INTEGER", null, false));
        map8.put("lastPlayed", new oq4(0, 1, "lastPlayed", "INTEGER", "0", true));
        rq4 rq4Var8 = new rq4("playlist", map8, f34.k(map8, "allowedUsers", new oq4(0, 1, "allowedUsers", "TEXT", null, false), 0), new HashSet(0));
        rq4 rq4VarB8 = rq4.b(x34Var, "playlist");
        if (!rq4Var8.equals(rq4VarB8)) {
            return new u24(false, f34.g("playlist(com.eddyizm.tempus.subsonic.models.Playlist).\n Expected:\n", rq4Var8, "\n Found:\n", rq4VarB8));
        }
        HashMap map9 = new HashMap(1);
        rq4 rq4Var9 = new rq4("pinned_playlist", map9, f34.k(map9, "playlistId", new oq4(1, 1, "playlistId", "TEXT", null, true), 0), new HashSet(0));
        rq4 rq4VarB9 = rq4.b(x34Var, "pinned_playlist");
        if (!rq4Var9.equals(rq4VarB9)) {
            return new u24(false, f34.g("pinned_playlist(com.eddyizm.tempus.model.PinnedPlaylist).\n Expected:\n", rq4Var9, "\n Found:\n", rq4VarB9));
        }
        HashMap map10 = new HashMap(6);
        map10.put("song_id", new oq4(1, 1, "song_id", "TEXT", null, true));
        map10.put("artist", new oq4(0, 1, "artist", "TEXT", null, false));
        map10.put("title", new oq4(0, 1, "title", "TEXT", null, false));
        map10.put("lyrics", new oq4(0, 1, "lyrics", "TEXT", null, false));
        map10.put("structured_lyrics", new oq4(0, 1, "structured_lyrics", "TEXT", null, false));
        rq4 rq4Var10 = new rq4("lyrics_cache", map10, f34.k(map10, "updated_at", new oq4(0, 1, "updated_at", "INTEGER", null, true), 0), new HashSet(0));
        rq4 rq4VarB10 = rq4.b(x34Var, "lyrics_cache");
        if (!rq4Var10.equals(rq4VarB10)) {
            return new u24(false, f34.g("lyrics_cache(com.eddyizm.tempus.model.LyricsCache).\n Expected:\n", rq4Var10, "\n Found:\n", rq4VarB10));
        }
        HashMap map11 = new HashMap(6);
        map11.put("id", new oq4(1, 1, "id", "TEXT", null, true));
        map11.put("name", new oq4(0, 1, "name", "TEXT", null, false));
        map11.put("stream_url", new oq4(0, 1, "stream_url", "TEXT", null, false));
        map11.put("home_page_url", new oq4(0, 1, "home_page_url", "TEXT", null, false));
        map11.put("source", new oq4(0, 1, "source", "TEXT", "'subsonic'", true));
        rq4 rq4Var11 = new rq4("internet_radio_station_cache", map11, f34.k(map11, "cover_art_url", new oq4(0, 1, "cover_art_url", "TEXT", null, false), 0), new HashSet(0));
        rq4 rq4VarB11 = rq4.b(x34Var, "internet_radio_station_cache");
        if (!rq4Var11.equals(rq4VarB11)) {
            return new u24(false, f34.g("internet_radio_station_cache(com.eddyizm.tempus.model.InternetRadioStationCache).\n Expected:\n", rq4Var11, "\n Found:\n", rq4VarB11));
        }
        HashMap map12 = new HashMap(10);
        map12.put("playlist_id", new oq4(1, 1, "playlist_id", "TEXT", null, true));
        map12.put("id", new oq4(2, 1, "id", "TEXT", null, true));
        map12.put("title", new oq4(0, 1, "title", "TEXT", null, false));
        map12.put("artist", new oq4(0, 1, "artist", "TEXT", null, false));
        map12.put("album", new oq4(0, 1, "album", "TEXT", null, false));
        map12.put("track", new oq4(0, 1, "track", "INTEGER", null, false));
        map12.put("cover_art_id", new oq4(0, 1, "cover_art_id", "TEXT", null, false));
        map12.put("duration", new oq4(0, 1, "duration", "INTEGER", null, false));
        map12.put("album_id", new oq4(0, 1, "album_id", "TEXT", null, false));
        HashSet hashSetK = f34.k(map12, "artist_id", new oq4(0, 1, "artist_id", "TEXT", null, false), 1);
        hashSetK.add(new pq4("playlist", "NO ACTION", "NO ACTION", Arrays.asList("playlist_id"), Arrays.asList("id")));
        HashSet hashSet = new HashSet(1);
        hashSet.add(new qq4("index_playlist_song_playlist_id", false, Arrays.asList("playlist_id"), Arrays.asList("ASC")));
        rq4 rq4Var12 = new rq4("playlist_song", map12, hashSetK, hashSet);
        rq4 rq4VarB12 = rq4.b(x34Var, "playlist_song");
        if (!rq4Var12.equals(rq4VarB12)) {
            return new u24(false, f34.g("playlist_song(com.eddyizm.tempus.model.PlaylistSong).\n Expected:\n", rq4Var12, "\n Found:\n", rq4VarB12));
        }
        HashMap map13 = new HashMap(2);
        map13.put("playlistId", new oq4(1, 1, "playlistId", "TEXT", null, true));
        rq4 rq4Var13 = new rq4("synced_playlist", map13, f34.k(map13, "serverId", new oq4(2, 1, "serverId", "TEXT", null, true), 0), new HashSet(0));
        rq4 rq4VarB13 = rq4.b(x34Var, "synced_playlist");
        return !rq4Var13.equals(rq4VarB13) ? new u24(false, f34.g("synced_playlist(com.eddyizm.tempus.model.SyncedPlaylist).\n Expected:\n", rq4Var13, "\n Found:\n", rq4VarB13)) : new u24(true, (String) null);
    }
}
