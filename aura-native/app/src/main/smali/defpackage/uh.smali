.class public final Ldefpackage/uh;
.super Ldefpackage/qz0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic d:Lcom/eddyizm/tempus/database/AppDatabase_Impl;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/database/AppDatabase_Impl;)V
    .locals 2

    .line 1
    iput-object p1, p0, Ldefpackage/uh;->d:Lcom/eddyizm/tempus/database/AppDatabase_Impl;

    .line 2
    .line 3
    const/16 p1, 0x17

    .line 4
    .line 5
    const-string v0, "5cdfa08b646d6b874587abcc85831960"

    .line 6
    .line 7
    const-string v1, "dbbf5062c5703cfdc3ae63eb9f5ce268"

    .line 8
    .line 9
    invoke-direct {p0, p1, v0, v1}, Ldefpackage/qz0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/x34;)V
    .locals 0

    .line 1
    const-string p0, "CREATE TABLE IF NOT EXISTS `queue` (`id` TEXT NOT NULL, `track_order` INTEGER NOT NULL, `last_play` INTEGER NOT NULL, `playing_changed` INTEGER NOT NULL, `stream_id` TEXT, `parent_id` TEXT, `is_dir` INTEGER NOT NULL, `title` TEXT, `album` TEXT, `artist` TEXT, `track` INTEGER, `year` INTEGER, `genre` TEXT, `cover_art_id` TEXT, `size` INTEGER, `content_type` TEXT, `suffix` TEXT, `transcoding_content_type` TEXT, `transcoded_suffix` TEXT, `duration` INTEGER, `bitrate` INTEGER, `sampling_rate` INTEGER, `bit_depth` INTEGER, `path` TEXT, `is_video` INTEGER NOT NULL, `user_rating` INTEGER, `average_rating` REAL, `play_count` INTEGER, `disc_number` INTEGER, `created` INTEGER, `starred` INTEGER, `album_id` TEXT, `artist_id` TEXT, `type` TEXT, `bookmark_position` INTEGER, `original_width` INTEGER, `original_height` INTEGER, `album_artist` TEXT, `rg_track_gain` REAL, `rg_album_gain` REAL, `rg_track_peak` REAL, `rg_album_peak` REAL, `rg_base_gain` REAL, `rg_fallback_gain` REAL, PRIMARY KEY(`track_order`))"

    .line 2
    .line 3
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p0, "CREATE TABLE IF NOT EXISTS `server` (`id` TEXT NOT NULL, `server_name` TEXT NOT NULL, `username` TEXT NOT NULL, `password` TEXT NOT NULL, `address` TEXT NOT NULL, `local_address` TEXT, `timestamp` INTEGER NOT NULL, `low_security` INTEGER NOT NULL DEFAULT false, `client_cert` TEXT, PRIMARY KEY(`id`))"

    .line 7
    .line 8
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p0, "CREATE TABLE IF NOT EXISTS `recent_search` (`search` TEXT NOT NULL, `timestamp` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`search`))"

    .line 12
    .line 13
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p0, "CREATE TABLE IF NOT EXISTS `download` (`id` TEXT NOT NULL, `playlist_id` TEXT, `playlist_name` TEXT, `download_state` INTEGER NOT NULL DEFAULT 1, `download_uri` TEXT DEFAULT \'\', `parent_id` TEXT, `is_dir` INTEGER NOT NULL, `title` TEXT, `album` TEXT, `artist` TEXT, `track` INTEGER, `year` INTEGER, `genre` TEXT, `cover_art_id` TEXT, `size` INTEGER, `content_type` TEXT, `suffix` TEXT, `transcoding_content_type` TEXT, `transcoded_suffix` TEXT, `duration` INTEGER, `bitrate` INTEGER, `sampling_rate` INTEGER, `bit_depth` INTEGER, `path` TEXT, `is_video` INTEGER NOT NULL, `user_rating` INTEGER, `average_rating` REAL, `play_count` INTEGER, `disc_number` INTEGER, `created` INTEGER, `starred` INTEGER, `album_id` TEXT, `artist_id` TEXT, `type` TEXT, `bookmark_position` INTEGER, `original_width` INTEGER, `original_height` INTEGER, `album_artist` TEXT, `rg_track_gain` REAL, `rg_album_gain` REAL, `rg_track_peak` REAL, `rg_album_peak` REAL, `rg_base_gain` REAL, `rg_fallback_gain` REAL, PRIMARY KEY(`id`))"

    .line 17
    .line 18
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string p0, "CREATE TABLE IF NOT EXISTS `chronology` (`id` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `server` TEXT, `parent_id` TEXT, `is_dir` INTEGER NOT NULL, `title` TEXT, `album` TEXT, `artist` TEXT, `track` INTEGER, `year` INTEGER, `genre` TEXT, `cover_art_id` TEXT, `size` INTEGER, `content_type` TEXT, `suffix` TEXT, `transcoding_content_type` TEXT, `transcoded_suffix` TEXT, `duration` INTEGER, `bitrate` INTEGER, `sampling_rate` INTEGER, `bit_depth` INTEGER, `path` TEXT, `is_video` INTEGER NOT NULL, `user_rating` INTEGER, `average_rating` REAL, `play_count` INTEGER, `disc_number` INTEGER, `created` INTEGER, `starred` INTEGER, `album_id` TEXT, `artist_id` TEXT, `type` TEXT, `bookmark_position` INTEGER, `original_width` INTEGER, `original_height` INTEGER, `album_artist` TEXT, `rg_track_gain` REAL, `rg_album_gain` REAL, `rg_track_peak` REAL, `rg_album_peak` REAL, `rg_base_gain` REAL, `rg_fallback_gain` REAL, PRIMARY KEY(`id`))"

    .line 22
    .line 23
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string p0, "CREATE TABLE IF NOT EXISTS `favorite` (`timestamp` INTEGER NOT NULL, `songId` TEXT, `albumId` TEXT, `artistId` TEXT, `toStar` INTEGER NOT NULL, PRIMARY KEY(`timestamp`))"

    .line 27
    .line 28
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string p0, "CREATE TABLE IF NOT EXISTS `session_media_item` (`index` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `id` TEXT, `parent_id` TEXT, `is_dir` INTEGER NOT NULL, `title` TEXT, `album` TEXT, `artist` TEXT, `track` INTEGER, `year` INTEGER, `genre` TEXT, `cover_art_id` TEXT, `size` INTEGER, `content_type` TEXT, `suffix` TEXT, `transcoding_content_type` TEXT, `transcoded_suffix` TEXT, `duration` INTEGER, `bitrate` INTEGER, `path` TEXT, `is_video` INTEGER NOT NULL, `user_rating` INTEGER, `average_rating` REAL, `play_count` INTEGER, `disc_number` INTEGER, `created` INTEGER, `starred` INTEGER, `album_id` TEXT, `artist_id` TEXT, `type` TEXT, `bookmark_position` INTEGER, `original_width` INTEGER, `original_height` INTEGER, `stream_id` TEXT, `stream_url` TEXT, `timestamp` INTEGER, `rg_track_gain` REAL, `rg_album_gain` REAL, `rg_track_peak` REAL, `rg_album_peak` REAL, `rg_base_gain` REAL, `rg_fallback_gain` REAL)"

    .line 32
    .line 33
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string p0, "CREATE TABLE IF NOT EXISTS `playlist` (`id` TEXT NOT NULL, `name` TEXT, `duration` INTEGER NOT NULL, `coverArt` TEXT, `comment` TEXT, `owner` TEXT, `isUniversal` INTEGER, `songCount` INTEGER NOT NULL DEFAULT 0, `created` INTEGER, `changed` INTEGER, `lastPlayed` INTEGER NOT NULL DEFAULT 0, `allowedUsers` TEXT, PRIMARY KEY(`id`))"

    .line 37
    .line 38
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string p0, "CREATE TABLE IF NOT EXISTS `pinned_playlist` (`playlistId` TEXT NOT NULL, PRIMARY KEY(`playlistId`))"

    .line 42
    .line 43
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string p0, "CREATE TABLE IF NOT EXISTS `lyrics_cache` (`song_id` TEXT NOT NULL, `artist` TEXT, `title` TEXT, `lyrics` TEXT, `structured_lyrics` TEXT, `updated_at` INTEGER NOT NULL, PRIMARY KEY(`song_id`))"

    .line 47
    .line 48
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string p0, "CREATE TABLE IF NOT EXISTS `internet_radio_station_cache` (`id` TEXT NOT NULL, `name` TEXT, `stream_url` TEXT, `home_page_url` TEXT, `source` TEXT NOT NULL DEFAULT \'subsonic\', `cover_art_url` TEXT, PRIMARY KEY(`id`))"

    .line 52
    .line 53
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string p0, "CREATE TABLE IF NOT EXISTS `playlist_song` (`playlist_id` TEXT NOT NULL, `id` TEXT NOT NULL, `title` TEXT, `artist` TEXT, `album` TEXT, `track` INTEGER, `cover_art_id` TEXT, `duration` INTEGER, `album_id` TEXT, `artist_id` TEXT, PRIMARY KEY(`playlist_id`, `id`), FOREIGN KEY(`playlist_id`) REFERENCES `playlist`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )"

    .line 57
    .line 58
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string p0, "CREATE INDEX IF NOT EXISTS `index_playlist_song_playlist_id` ON `playlist_song` (`playlist_id`)"

    .line 62
    .line 63
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string p0, "CREATE TABLE IF NOT EXISTS `synced_playlist` (`playlistId` TEXT NOT NULL, `serverId` TEXT NOT NULL, PRIMARY KEY(`playlistId`, `serverId`))"

    .line 67
    .line 68
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string p0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    .line 72
    .line 73
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string p0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'5cdfa08b646d6b874587abcc85831960\')"

    .line 77
    .line 78
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final c(Ldefpackage/x34;)V
    .locals 0

    .line 1
    const-string p0, "DROP TABLE IF EXISTS `queue`"

    .line 2
    .line 3
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p0, "DROP TABLE IF EXISTS `server`"

    .line 7
    .line 8
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p0, "DROP TABLE IF EXISTS `recent_search`"

    .line 12
    .line 13
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p0, "DROP TABLE IF EXISTS `download`"

    .line 17
    .line 18
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string p0, "DROP TABLE IF EXISTS `chronology`"

    .line 22
    .line 23
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string p0, "DROP TABLE IF EXISTS `favorite`"

    .line 27
    .line 28
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string p0, "DROP TABLE IF EXISTS `session_media_item`"

    .line 32
    .line 33
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string p0, "DROP TABLE IF EXISTS `playlist`"

    .line 37
    .line 38
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string p0, "DROP TABLE IF EXISTS `pinned_playlist`"

    .line 42
    .line 43
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string p0, "DROP TABLE IF EXISTS `lyrics_cache`"

    .line 47
    .line 48
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string p0, "DROP TABLE IF EXISTS `internet_radio_station_cache`"

    .line 52
    .line 53
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string p0, "DROP TABLE IF EXISTS `playlist_song`"

    .line 57
    .line 58
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const-string p0, "DROP TABLE IF EXISTS `synced_playlist`"

    .line 62
    .line 63
    invoke-static {p1, p0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final r(Ldefpackage/x34;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final s(Ldefpackage/x34;)V
    .locals 1

    .line 1
    const-string v0, "PRAGMA foreign_keys = ON"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ldefpackage/h12;->n(Ldefpackage/x34;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/uh;->d:Lcom/eddyizm/tempus/database/AppDatabase_Impl;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Ldefpackage/s24;->p(Ldefpackage/x34;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final t(Ldefpackage/x34;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final u(Ldefpackage/x34;)V
    .locals 0

    .line 1
    invoke-static {p1}, Ldefpackage/xl;->l(Ldefpackage/x34;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final v(Ldefpackage/x34;)Ldefpackage/u24;
    .locals 59

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    new-instance v1, Ljava/util/HashMap;

    .line 4
    .line 5
    const/16 v2, 0x2c

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 8
    .line 9
    .line 10
    new-instance v3, Ldefpackage/oq4;

    .line 11
    .line 12
    const/4 v8, 0x0

    .line 13
    const/4 v5, 0x1

    .line 14
    const/4 v4, 0x0

    .line 15
    const-string v6, "id"

    .line 16
    .line 17
    const-string v7, "TEXT"

    .line 18
    .line 19
    const/4 v9, 0x1

    .line 20
    invoke-direct/range {v3 .. v9}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    const-string v4, "id"

    .line 24
    .line 25
    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    new-instance v5, Ldefpackage/oq4;

    .line 29
    .line 30
    const/4 v10, 0x0

    .line 31
    const/4 v7, 0x1

    .line 32
    const/4 v6, 0x1

    .line 33
    const-string v8, "track_order"

    .line 34
    .line 35
    const-string v9, "INTEGER"

    .line 36
    .line 37
    const/4 v11, 0x1

    .line 38
    invoke-direct/range {v5 .. v11}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    const-string v3, "track_order"

    .line 42
    .line 43
    invoke-virtual {v1, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    new-instance v6, Ldefpackage/oq4;

    .line 47
    .line 48
    const/4 v11, 0x0

    .line 49
    const/4 v8, 0x1

    .line 50
    const/4 v7, 0x0

    .line 51
    const-string v9, "last_play"

    .line 52
    .line 53
    const-string v10, "INTEGER"

    .line 54
    .line 55
    const/4 v12, 0x1

    .line 56
    invoke-direct/range {v6 .. v12}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    const-string v3, "last_play"

    .line 60
    .line 61
    invoke-virtual {v1, v3, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    new-instance v7, Ldefpackage/oq4;

    .line 65
    .line 66
    const/4 v12, 0x0

    .line 67
    const/4 v9, 0x1

    .line 68
    const/4 v8, 0x0

    .line 69
    const-string v10, "playing_changed"

    .line 70
    .line 71
    const-string v11, "INTEGER"

    .line 72
    .line 73
    const/4 v13, 0x1

    .line 74
    invoke-direct/range {v7 .. v13}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 75
    .line 76
    .line 77
    const-string v3, "playing_changed"

    .line 78
    .line 79
    invoke-virtual {v1, v3, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    new-instance v8, Ldefpackage/oq4;

    .line 83
    .line 84
    const/4 v13, 0x0

    .line 85
    const/4 v10, 0x1

    .line 86
    const/4 v9, 0x0

    .line 87
    const-string v11, "stream_id"

    .line 88
    .line 89
    const-string v12, "TEXT"

    .line 90
    .line 91
    const/4 v14, 0x0

    .line 92
    invoke-direct/range {v8 .. v14}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 93
    .line 94
    .line 95
    const-string v3, "stream_id"

    .line 96
    .line 97
    invoke-virtual {v1, v3, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    new-instance v9, Ldefpackage/oq4;

    .line 101
    .line 102
    const/4 v14, 0x0

    .line 103
    const/4 v11, 0x1

    .line 104
    const/4 v10, 0x0

    .line 105
    const-string v12, "parent_id"

    .line 106
    .line 107
    const-string v13, "TEXT"

    .line 108
    .line 109
    const/4 v15, 0x0

    .line 110
    invoke-direct/range {v9 .. v15}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 111
    .line 112
    .line 113
    const-string v5, "parent_id"

    .line 114
    .line 115
    invoke-virtual {v1, v5, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    new-instance v10, Ldefpackage/oq4;

    .line 119
    .line 120
    const/4 v15, 0x0

    .line 121
    const/4 v12, 0x1

    .line 122
    const/4 v11, 0x0

    .line 123
    const-string v13, "is_dir"

    .line 124
    .line 125
    const-string v14, "INTEGER"

    .line 126
    .line 127
    const/16 v16, 0x1

    .line 128
    .line 129
    invoke-direct/range {v10 .. v16}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 130
    .line 131
    .line 132
    const-string v6, "is_dir"

    .line 133
    .line 134
    invoke-virtual {v1, v6, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    new-instance v11, Ldefpackage/oq4;

    .line 138
    .line 139
    const/16 v16, 0x0

    .line 140
    .line 141
    const/4 v13, 0x1

    .line 142
    const/4 v12, 0x0

    .line 143
    const-string v14, "title"

    .line 144
    .line 145
    const-string v15, "TEXT"

    .line 146
    .line 147
    const/16 v17, 0x0

    .line 148
    .line 149
    invoke-direct/range {v11 .. v17}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 150
    .line 151
    .line 152
    const-string v7, "title"

    .line 153
    .line 154
    invoke-virtual {v1, v7, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    new-instance v12, Ldefpackage/oq4;

    .line 158
    .line 159
    const/16 v17, 0x0

    .line 160
    .line 161
    const/4 v14, 0x1

    .line 162
    const/4 v13, 0x0

    .line 163
    const-string v15, "album"

    .line 164
    .line 165
    const-string v16, "TEXT"

    .line 166
    .line 167
    const/16 v18, 0x0

    .line 168
    .line 169
    invoke-direct/range {v12 .. v18}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 170
    .line 171
    .line 172
    const-string v8, "album"

    .line 173
    .line 174
    invoke-virtual {v1, v8, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    new-instance v13, Ldefpackage/oq4;

    .line 178
    .line 179
    const/16 v18, 0x0

    .line 180
    .line 181
    const/4 v15, 0x1

    .line 182
    const/4 v14, 0x0

    .line 183
    const-string v16, "artist"

    .line 184
    .line 185
    const-string v17, "TEXT"

    .line 186
    .line 187
    const/16 v19, 0x0

    .line 188
    .line 189
    invoke-direct/range {v13 .. v19}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 190
    .line 191
    .line 192
    const-string v9, "artist"

    .line 193
    .line 194
    invoke-virtual {v1, v9, v13}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    new-instance v14, Ldefpackage/oq4;

    .line 198
    .line 199
    const/16 v19, 0x0

    .line 200
    .line 201
    const/16 v16, 0x1

    .line 202
    .line 203
    const/4 v15, 0x0

    .line 204
    const-string v17, "track"

    .line 205
    .line 206
    const-string v18, "INTEGER"

    .line 207
    .line 208
    const/16 v20, 0x0

    .line 209
    .line 210
    invoke-direct/range {v14 .. v20}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 211
    .line 212
    .line 213
    const-string v10, "track"

    .line 214
    .line 215
    invoke-virtual {v1, v10, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    new-instance v15, Ldefpackage/oq4;

    .line 219
    .line 220
    const/16 v20, 0x0

    .line 221
    .line 222
    const/16 v17, 0x1

    .line 223
    .line 224
    const/16 v16, 0x0

    .line 225
    .line 226
    const-string v18, "year"

    .line 227
    .line 228
    const-string v19, "INTEGER"

    .line 229
    .line 230
    const/16 v21, 0x0

    .line 231
    .line 232
    invoke-direct/range {v15 .. v21}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 233
    .line 234
    .line 235
    const-string v11, "year"

    .line 236
    .line 237
    invoke-virtual {v1, v11, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    new-instance v16, Ldefpackage/oq4;

    .line 241
    .line 242
    const/16 v21, 0x0

    .line 243
    .line 244
    const/16 v18, 0x1

    .line 245
    .line 246
    const/16 v17, 0x0

    .line 247
    .line 248
    const-string v19, "genre"

    .line 249
    .line 250
    const-string v20, "TEXT"

    .line 251
    .line 252
    const/16 v22, 0x0

    .line 253
    .line 254
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 255
    .line 256
    .line 257
    move-object/from16 v12, v16

    .line 258
    .line 259
    const-string v13, "genre"

    .line 260
    .line 261
    invoke-virtual {v1, v13, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    new-instance v14, Ldefpackage/oq4;

    .line 265
    .line 266
    const/16 v19, 0x0

    .line 267
    .line 268
    const/16 v16, 0x1

    .line 269
    .line 270
    const/4 v15, 0x0

    .line 271
    const-string v17, "cover_art_id"

    .line 272
    .line 273
    const-string v18, "TEXT"

    .line 274
    .line 275
    const/16 v20, 0x0

    .line 276
    .line 277
    invoke-direct/range {v14 .. v20}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 278
    .line 279
    .line 280
    const-string v12, "cover_art_id"

    .line 281
    .line 282
    invoke-virtual {v1, v12, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    new-instance v15, Ldefpackage/oq4;

    .line 286
    .line 287
    const/16 v20, 0x0

    .line 288
    .line 289
    const/16 v17, 0x1

    .line 290
    .line 291
    const/16 v16, 0x0

    .line 292
    .line 293
    const-string v18, "size"

    .line 294
    .line 295
    const-string v19, "INTEGER"

    .line 296
    .line 297
    const/16 v21, 0x0

    .line 298
    .line 299
    invoke-direct/range {v15 .. v21}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 300
    .line 301
    .line 302
    const-string v14, "size"

    .line 303
    .line 304
    invoke-virtual {v1, v14, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    new-instance v16, Ldefpackage/oq4;

    .line 308
    .line 309
    const/16 v21, 0x0

    .line 310
    .line 311
    const/16 v18, 0x1

    .line 312
    .line 313
    const/16 v17, 0x0

    .line 314
    .line 315
    const-string v19, "content_type"

    .line 316
    .line 317
    const-string v20, "TEXT"

    .line 318
    .line 319
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 320
    .line 321
    .line 322
    move-object/from16 v15, v16

    .line 323
    .line 324
    const-string v2, "content_type"

    .line 325
    .line 326
    invoke-virtual {v1, v2, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    new-instance v16, Ldefpackage/oq4;

    .line 330
    .line 331
    const-string v19, "suffix"

    .line 332
    .line 333
    const-string v20, "TEXT"

    .line 334
    .line 335
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 336
    .line 337
    .line 338
    move-object/from16 v15, v16

    .line 339
    .line 340
    move-object/from16 v16, v3

    .line 341
    .line 342
    const-string v3, "suffix"

    .line 343
    .line 344
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    new-instance v17, Ldefpackage/oq4;

    .line 348
    .line 349
    const/16 v22, 0x0

    .line 350
    .line 351
    const/16 v19, 0x1

    .line 352
    .line 353
    const/16 v18, 0x0

    .line 354
    .line 355
    const-string v20, "transcoding_content_type"

    .line 356
    .line 357
    const-string v21, "TEXT"

    .line 358
    .line 359
    const/16 v23, 0x0

    .line 360
    .line 361
    invoke-direct/range {v17 .. v23}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 362
    .line 363
    .line 364
    move-object/from16 v15, v17

    .line 365
    .line 366
    move-object/from16 v17, v3

    .line 367
    .line 368
    const-string v3, "transcoding_content_type"

    .line 369
    .line 370
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    new-instance v18, Ldefpackage/oq4;

    .line 374
    .line 375
    const/16 v23, 0x0

    .line 376
    .line 377
    const/16 v20, 0x1

    .line 378
    .line 379
    const/16 v19, 0x0

    .line 380
    .line 381
    const-string v21, "transcoded_suffix"

    .line 382
    .line 383
    const-string v22, "TEXT"

    .line 384
    .line 385
    const/16 v24, 0x0

    .line 386
    .line 387
    invoke-direct/range {v18 .. v24}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 388
    .line 389
    .line 390
    move-object/from16 v15, v18

    .line 391
    .line 392
    move-object/from16 v18, v3

    .line 393
    .line 394
    const-string v3, "transcoded_suffix"

    .line 395
    .line 396
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    new-instance v19, Ldefpackage/oq4;

    .line 400
    .line 401
    const/16 v24, 0x0

    .line 402
    .line 403
    const/16 v21, 0x1

    .line 404
    .line 405
    const/16 v20, 0x0

    .line 406
    .line 407
    const-string v22, "duration"

    .line 408
    .line 409
    const-string v23, "INTEGER"

    .line 410
    .line 411
    const/16 v25, 0x0

    .line 412
    .line 413
    invoke-direct/range {v19 .. v25}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 414
    .line 415
    .line 416
    move-object/from16 v15, v19

    .line 417
    .line 418
    move-object/from16 v19, v3

    .line 419
    .line 420
    const-string v3, "duration"

    .line 421
    .line 422
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    new-instance v20, Ldefpackage/oq4;

    .line 426
    .line 427
    const/16 v25, 0x0

    .line 428
    .line 429
    const/16 v22, 0x1

    .line 430
    .line 431
    const/16 v21, 0x0

    .line 432
    .line 433
    const-string v23, "bitrate"

    .line 434
    .line 435
    const-string v24, "INTEGER"

    .line 436
    .line 437
    const/16 v26, 0x0

    .line 438
    .line 439
    invoke-direct/range {v20 .. v26}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 440
    .line 441
    .line 442
    move-object/from16 v15, v20

    .line 443
    .line 444
    move-object/from16 v20, v3

    .line 445
    .line 446
    const-string v3, "bitrate"

    .line 447
    .line 448
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    new-instance v21, Ldefpackage/oq4;

    .line 452
    .line 453
    const/16 v26, 0x0

    .line 454
    .line 455
    const/16 v23, 0x1

    .line 456
    .line 457
    const/16 v22, 0x0

    .line 458
    .line 459
    const-string v24, "sampling_rate"

    .line 460
    .line 461
    const-string v25, "INTEGER"

    .line 462
    .line 463
    const/16 v27, 0x0

    .line 464
    .line 465
    invoke-direct/range {v21 .. v27}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 466
    .line 467
    .line 468
    move-object/from16 v15, v21

    .line 469
    .line 470
    move-object/from16 v21, v3

    .line 471
    .line 472
    const-string v3, "sampling_rate"

    .line 473
    .line 474
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    new-instance v22, Ldefpackage/oq4;

    .line 478
    .line 479
    const/16 v27, 0x0

    .line 480
    .line 481
    const/16 v24, 0x1

    .line 482
    .line 483
    const/16 v23, 0x0

    .line 484
    .line 485
    const-string v25, "bit_depth"

    .line 486
    .line 487
    const-string v26, "INTEGER"

    .line 488
    .line 489
    const/16 v28, 0x0

    .line 490
    .line 491
    invoke-direct/range {v22 .. v28}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 492
    .line 493
    .line 494
    move-object/from16 v15, v22

    .line 495
    .line 496
    move-object/from16 v22, v3

    .line 497
    .line 498
    const-string v3, "bit_depth"

    .line 499
    .line 500
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    new-instance v23, Ldefpackage/oq4;

    .line 504
    .line 505
    const/16 v28, 0x0

    .line 506
    .line 507
    const/16 v25, 0x1

    .line 508
    .line 509
    const/16 v24, 0x0

    .line 510
    .line 511
    const-string v26, "path"

    .line 512
    .line 513
    const-string v27, "TEXT"

    .line 514
    .line 515
    const/16 v29, 0x0

    .line 516
    .line 517
    invoke-direct/range {v23 .. v29}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 518
    .line 519
    .line 520
    move-object/from16 v15, v23

    .line 521
    .line 522
    move-object/from16 v23, v3

    .line 523
    .line 524
    const-string v3, "path"

    .line 525
    .line 526
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 527
    .line 528
    .line 529
    new-instance v24, Ldefpackage/oq4;

    .line 530
    .line 531
    const/16 v29, 0x0

    .line 532
    .line 533
    const/16 v26, 0x1

    .line 534
    .line 535
    const/16 v25, 0x0

    .line 536
    .line 537
    const-string v27, "is_video"

    .line 538
    .line 539
    const-string v28, "INTEGER"

    .line 540
    .line 541
    const/16 v30, 0x1

    .line 542
    .line 543
    invoke-direct/range {v24 .. v30}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 544
    .line 545
    .line 546
    move-object/from16 v15, v24

    .line 547
    .line 548
    move-object/from16 v24, v3

    .line 549
    .line 550
    const-string v3, "is_video"

    .line 551
    .line 552
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 553
    .line 554
    .line 555
    new-instance v25, Ldefpackage/oq4;

    .line 556
    .line 557
    const/16 v30, 0x0

    .line 558
    .line 559
    const/16 v27, 0x1

    .line 560
    .line 561
    const/16 v26, 0x0

    .line 562
    .line 563
    const-string v28, "user_rating"

    .line 564
    .line 565
    const-string v29, "INTEGER"

    .line 566
    .line 567
    const/16 v31, 0x0

    .line 568
    .line 569
    invoke-direct/range {v25 .. v31}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 570
    .line 571
    .line 572
    move-object/from16 v15, v25

    .line 573
    .line 574
    move-object/from16 v25, v3

    .line 575
    .line 576
    const-string v3, "user_rating"

    .line 577
    .line 578
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    new-instance v26, Ldefpackage/oq4;

    .line 582
    .line 583
    const/16 v31, 0x0

    .line 584
    .line 585
    const/16 v28, 0x1

    .line 586
    .line 587
    const/16 v27, 0x0

    .line 588
    .line 589
    const-string v29, "average_rating"

    .line 590
    .line 591
    const-string v30, "REAL"

    .line 592
    .line 593
    const/16 v32, 0x0

    .line 594
    .line 595
    invoke-direct/range {v26 .. v32}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 596
    .line 597
    .line 598
    move-object/from16 v15, v26

    .line 599
    .line 600
    move-object/from16 v26, v3

    .line 601
    .line 602
    const-string v3, "average_rating"

    .line 603
    .line 604
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 605
    .line 606
    .line 607
    new-instance v27, Ldefpackage/oq4;

    .line 608
    .line 609
    const/16 v32, 0x0

    .line 610
    .line 611
    const/16 v29, 0x1

    .line 612
    .line 613
    const/16 v28, 0x0

    .line 614
    .line 615
    const-string v30, "play_count"

    .line 616
    .line 617
    const-string v31, "INTEGER"

    .line 618
    .line 619
    const/16 v33, 0x0

    .line 620
    .line 621
    invoke-direct/range {v27 .. v33}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 622
    .line 623
    .line 624
    move-object/from16 v15, v27

    .line 625
    .line 626
    move-object/from16 v27, v3

    .line 627
    .line 628
    const-string v3, "play_count"

    .line 629
    .line 630
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    new-instance v28, Ldefpackage/oq4;

    .line 634
    .line 635
    const/16 v33, 0x0

    .line 636
    .line 637
    const/16 v30, 0x1

    .line 638
    .line 639
    const/16 v29, 0x0

    .line 640
    .line 641
    const-string v31, "disc_number"

    .line 642
    .line 643
    const-string v32, "INTEGER"

    .line 644
    .line 645
    const/16 v34, 0x0

    .line 646
    .line 647
    invoke-direct/range {v28 .. v34}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 648
    .line 649
    .line 650
    move-object/from16 v15, v28

    .line 651
    .line 652
    move-object/from16 v28, v3

    .line 653
    .line 654
    const-string v3, "disc_number"

    .line 655
    .line 656
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 657
    .line 658
    .line 659
    new-instance v29, Ldefpackage/oq4;

    .line 660
    .line 661
    const/16 v34, 0x0

    .line 662
    .line 663
    const/16 v31, 0x1

    .line 664
    .line 665
    const/16 v30, 0x0

    .line 666
    .line 667
    const-string v32, "created"

    .line 668
    .line 669
    const-string v33, "INTEGER"

    .line 670
    .line 671
    const/16 v35, 0x0

    .line 672
    .line 673
    invoke-direct/range {v29 .. v35}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 674
    .line 675
    .line 676
    move-object/from16 v15, v29

    .line 677
    .line 678
    move-object/from16 v29, v3

    .line 679
    .line 680
    const-string v3, "created"

    .line 681
    .line 682
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    new-instance v30, Ldefpackage/oq4;

    .line 686
    .line 687
    const/16 v35, 0x0

    .line 688
    .line 689
    const/16 v32, 0x1

    .line 690
    .line 691
    const/16 v31, 0x0

    .line 692
    .line 693
    const-string v33, "starred"

    .line 694
    .line 695
    const-string v34, "INTEGER"

    .line 696
    .line 697
    const/16 v36, 0x0

    .line 698
    .line 699
    invoke-direct/range {v30 .. v36}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 700
    .line 701
    .line 702
    move-object/from16 v15, v30

    .line 703
    .line 704
    move-object/from16 v30, v3

    .line 705
    .line 706
    const-string v3, "starred"

    .line 707
    .line 708
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    new-instance v31, Ldefpackage/oq4;

    .line 712
    .line 713
    const/16 v36, 0x0

    .line 714
    .line 715
    const/16 v33, 0x1

    .line 716
    .line 717
    const/16 v32, 0x0

    .line 718
    .line 719
    const-string v34, "album_id"

    .line 720
    .line 721
    const-string v35, "TEXT"

    .line 722
    .line 723
    const/16 v37, 0x0

    .line 724
    .line 725
    invoke-direct/range {v31 .. v37}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 726
    .line 727
    .line 728
    move-object/from16 v15, v31

    .line 729
    .line 730
    move-object/from16 v31, v3

    .line 731
    .line 732
    const-string v3, "album_id"

    .line 733
    .line 734
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    new-instance v32, Ldefpackage/oq4;

    .line 738
    .line 739
    const/16 v37, 0x0

    .line 740
    .line 741
    const/16 v34, 0x1

    .line 742
    .line 743
    const/16 v33, 0x0

    .line 744
    .line 745
    const-string v35, "artist_id"

    .line 746
    .line 747
    const-string v36, "TEXT"

    .line 748
    .line 749
    const/16 v38, 0x0

    .line 750
    .line 751
    invoke-direct/range {v32 .. v38}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 752
    .line 753
    .line 754
    move-object/from16 v15, v32

    .line 755
    .line 756
    move-object/from16 v32, v3

    .line 757
    .line 758
    const-string v3, "artist_id"

    .line 759
    .line 760
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    new-instance v33, Ldefpackage/oq4;

    .line 764
    .line 765
    const/16 v38, 0x0

    .line 766
    .line 767
    const/16 v35, 0x1

    .line 768
    .line 769
    const/16 v34, 0x0

    .line 770
    .line 771
    const-string v36, "type"

    .line 772
    .line 773
    const-string v37, "TEXT"

    .line 774
    .line 775
    const/16 v39, 0x0

    .line 776
    .line 777
    invoke-direct/range {v33 .. v39}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 778
    .line 779
    .line 780
    move-object/from16 v15, v33

    .line 781
    .line 782
    move-object/from16 v33, v3

    .line 783
    .line 784
    const-string v3, "type"

    .line 785
    .line 786
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    new-instance v34, Ldefpackage/oq4;

    .line 790
    .line 791
    const/16 v39, 0x0

    .line 792
    .line 793
    const/16 v36, 0x1

    .line 794
    .line 795
    const/16 v35, 0x0

    .line 796
    .line 797
    const-string v37, "bookmark_position"

    .line 798
    .line 799
    const-string v38, "INTEGER"

    .line 800
    .line 801
    const/16 v40, 0x0

    .line 802
    .line 803
    invoke-direct/range {v34 .. v40}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 804
    .line 805
    .line 806
    move-object/from16 v15, v34

    .line 807
    .line 808
    move-object/from16 v34, v3

    .line 809
    .line 810
    const-string v3, "bookmark_position"

    .line 811
    .line 812
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    new-instance v35, Ldefpackage/oq4;

    .line 816
    .line 817
    const/16 v40, 0x0

    .line 818
    .line 819
    const/16 v37, 0x1

    .line 820
    .line 821
    const/16 v36, 0x0

    .line 822
    .line 823
    const-string v38, "original_width"

    .line 824
    .line 825
    const-string v39, "INTEGER"

    .line 826
    .line 827
    const/16 v41, 0x0

    .line 828
    .line 829
    invoke-direct/range {v35 .. v41}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 830
    .line 831
    .line 832
    move-object/from16 v15, v35

    .line 833
    .line 834
    move-object/from16 v35, v3

    .line 835
    .line 836
    const-string v3, "original_width"

    .line 837
    .line 838
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    new-instance v36, Ldefpackage/oq4;

    .line 842
    .line 843
    const/16 v41, 0x0

    .line 844
    .line 845
    const/16 v38, 0x1

    .line 846
    .line 847
    const/16 v37, 0x0

    .line 848
    .line 849
    const-string v39, "original_height"

    .line 850
    .line 851
    const-string v40, "INTEGER"

    .line 852
    .line 853
    const/16 v42, 0x0

    .line 854
    .line 855
    invoke-direct/range {v36 .. v42}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 856
    .line 857
    .line 858
    move-object/from16 v15, v36

    .line 859
    .line 860
    move-object/from16 v36, v3

    .line 861
    .line 862
    const-string v3, "original_height"

    .line 863
    .line 864
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 865
    .line 866
    .line 867
    new-instance v37, Ldefpackage/oq4;

    .line 868
    .line 869
    const/16 v42, 0x0

    .line 870
    .line 871
    const/16 v39, 0x1

    .line 872
    .line 873
    const/16 v38, 0x0

    .line 874
    .line 875
    const-string v40, "album_artist"

    .line 876
    .line 877
    const-string v41, "TEXT"

    .line 878
    .line 879
    const/16 v43, 0x0

    .line 880
    .line 881
    invoke-direct/range {v37 .. v43}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 882
    .line 883
    .line 884
    move-object/from16 v15, v37

    .line 885
    .line 886
    move-object/from16 v37, v3

    .line 887
    .line 888
    const-string v3, "album_artist"

    .line 889
    .line 890
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    new-instance v38, Ldefpackage/oq4;

    .line 894
    .line 895
    const/16 v43, 0x0

    .line 896
    .line 897
    const/16 v40, 0x1

    .line 898
    .line 899
    const/16 v39, 0x0

    .line 900
    .line 901
    const-string v41, "rg_track_gain"

    .line 902
    .line 903
    const-string v42, "REAL"

    .line 904
    .line 905
    const/16 v44, 0x0

    .line 906
    .line 907
    invoke-direct/range {v38 .. v44}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 908
    .line 909
    .line 910
    move-object/from16 v15, v38

    .line 911
    .line 912
    move-object/from16 v38, v3

    .line 913
    .line 914
    const-string v3, "rg_track_gain"

    .line 915
    .line 916
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 917
    .line 918
    .line 919
    new-instance v39, Ldefpackage/oq4;

    .line 920
    .line 921
    const/16 v44, 0x0

    .line 922
    .line 923
    const/16 v41, 0x1

    .line 924
    .line 925
    const/16 v40, 0x0

    .line 926
    .line 927
    const-string v42, "rg_album_gain"

    .line 928
    .line 929
    const-string v43, "REAL"

    .line 930
    .line 931
    const/16 v45, 0x0

    .line 932
    .line 933
    invoke-direct/range {v39 .. v45}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 934
    .line 935
    .line 936
    move-object/from16 v15, v39

    .line 937
    .line 938
    move-object/from16 v39, v3

    .line 939
    .line 940
    const-string v3, "rg_album_gain"

    .line 941
    .line 942
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 943
    .line 944
    .line 945
    new-instance v40, Ldefpackage/oq4;

    .line 946
    .line 947
    const/16 v45, 0x0

    .line 948
    .line 949
    const/16 v42, 0x1

    .line 950
    .line 951
    const/16 v41, 0x0

    .line 952
    .line 953
    const-string v43, "rg_track_peak"

    .line 954
    .line 955
    const-string v44, "REAL"

    .line 956
    .line 957
    const/16 v46, 0x0

    .line 958
    .line 959
    invoke-direct/range {v40 .. v46}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 960
    .line 961
    .line 962
    move-object/from16 v15, v40

    .line 963
    .line 964
    move-object/from16 v40, v3

    .line 965
    .line 966
    const-string v3, "rg_track_peak"

    .line 967
    .line 968
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 969
    .line 970
    .line 971
    new-instance v41, Ldefpackage/oq4;

    .line 972
    .line 973
    const/16 v46, 0x0

    .line 974
    .line 975
    const/16 v43, 0x1

    .line 976
    .line 977
    const/16 v42, 0x0

    .line 978
    .line 979
    const-string v44, "rg_album_peak"

    .line 980
    .line 981
    const-string v45, "REAL"

    .line 982
    .line 983
    const/16 v47, 0x0

    .line 984
    .line 985
    invoke-direct/range {v41 .. v47}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 986
    .line 987
    .line 988
    move-object/from16 v15, v41

    .line 989
    .line 990
    move-object/from16 v41, v3

    .line 991
    .line 992
    const-string v3, "rg_album_peak"

    .line 993
    .line 994
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 995
    .line 996
    .line 997
    new-instance v42, Ldefpackage/oq4;

    .line 998
    .line 999
    const/16 v47, 0x0

    .line 1000
    .line 1001
    const/16 v44, 0x1

    .line 1002
    .line 1003
    const/16 v43, 0x0

    .line 1004
    .line 1005
    const-string v45, "rg_base_gain"

    .line 1006
    .line 1007
    const-string v46, "REAL"

    .line 1008
    .line 1009
    const/16 v48, 0x0

    .line 1010
    .line 1011
    invoke-direct/range {v42 .. v48}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1012
    .line 1013
    .line 1014
    move-object/from16 v15, v42

    .line 1015
    .line 1016
    move-object/from16 v42, v3

    .line 1017
    .line 1018
    const-string v3, "rg_base_gain"

    .line 1019
    .line 1020
    invoke-virtual {v1, v3, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1021
    .line 1022
    .line 1023
    new-instance v43, Ldefpackage/oq4;

    .line 1024
    .line 1025
    const/16 v48, 0x0

    .line 1026
    .line 1027
    const/16 v45, 0x1

    .line 1028
    .line 1029
    const/16 v44, 0x0

    .line 1030
    .line 1031
    const-string v46, "rg_fallback_gain"

    .line 1032
    .line 1033
    const-string v47, "REAL"

    .line 1034
    .line 1035
    const/16 v49, 0x0

    .line 1036
    .line 1037
    invoke-direct/range {v43 .. v49}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1038
    .line 1039
    .line 1040
    move-object/from16 v15, v43

    .line 1041
    .line 1042
    move-object/from16 v43, v3

    .line 1043
    .line 1044
    const-string v3, "rg_fallback_gain"

    .line 1045
    .line 1046
    move-object/from16 v44, v2

    .line 1047
    .line 1048
    const/4 v2, 0x0

    .line 1049
    invoke-static {v1, v3, v15, v2}, Ldefpackage/f34;->k(Ljava/util/HashMap;Ljava/lang/String;Ldefpackage/oq4;I)Ljava/util/HashSet;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v15

    .line 1053
    move-object/from16 v45, v3

    .line 1054
    .line 1055
    new-instance v3, Ljava/util/HashSet;

    .line 1056
    .line 1057
    invoke-direct {v3, v2}, Ljava/util/HashSet;-><init>(I)V

    .line 1058
    .line 1059
    .line 1060
    new-instance v2, Ldefpackage/rq4;

    .line 1061
    .line 1062
    move-object/from16 v47, v14

    .line 1063
    .line 1064
    const-string v14, "queue"

    .line 1065
    .line 1066
    invoke-direct {v2, v14, v1, v15, v3}, Ldefpackage/rq4;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    .line 1067
    .line 1068
    .line 1069
    invoke-static {v0, v14}, Ldefpackage/rq4;->b(Ldefpackage/x34;Ljava/lang/String;)Ldefpackage/rq4;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v1

    .line 1073
    invoke-virtual {v2, v1}, Ldefpackage/rq4;->equals(Ljava/lang/Object;)Z

    .line 1074
    .line 1075
    .line 1076
    move-result v3

    .line 1077
    const-string v14, "\n Found:\n"

    .line 1078
    .line 1079
    if-nez v3, :cond_0

    .line 1080
    .line 1081
    new-instance v0, Ldefpackage/u24;

    .line 1082
    .line 1083
    const-string v3, "queue(com.eddyizm.tempus.model.Queue).\n Expected:\n"

    .line 1084
    .line 1085
    invoke-static {v3, v2, v14, v1}, Ldefpackage/f34;->g(Ljava/lang/String;Ldefpackage/rq4;Ljava/lang/String;Ldefpackage/rq4;)Ljava/lang/String;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v1

    .line 1089
    const/4 v2, 0x0

    .line 1090
    invoke-direct {v0, v2, v1}, Ldefpackage/u24;-><init>(ZLjava/lang/String;)V

    .line 1091
    .line 1092
    .line 1093
    return-object v0

    .line 1094
    :cond_0
    new-instance v1, Ljava/util/HashMap;

    .line 1095
    .line 1096
    const/16 v2, 0x9

    .line 1097
    .line 1098
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 1099
    .line 1100
    .line 1101
    new-instance v48, Ldefpackage/oq4;

    .line 1102
    .line 1103
    const/16 v53, 0x0

    .line 1104
    .line 1105
    const/16 v50, 0x1

    .line 1106
    .line 1107
    const/16 v49, 0x1

    .line 1108
    .line 1109
    const-string v51, "id"

    .line 1110
    .line 1111
    const-string v52, "TEXT"

    .line 1112
    .line 1113
    const/16 v54, 0x1

    .line 1114
    .line 1115
    invoke-direct/range {v48 .. v54}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1116
    .line 1117
    .line 1118
    move-object/from16 v2, v48

    .line 1119
    .line 1120
    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1121
    .line 1122
    .line 1123
    new-instance v48, Ldefpackage/oq4;

    .line 1124
    .line 1125
    const/16 v49, 0x0

    .line 1126
    .line 1127
    const-string v51, "server_name"

    .line 1128
    .line 1129
    const-string v52, "TEXT"

    .line 1130
    .line 1131
    invoke-direct/range {v48 .. v54}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1132
    .line 1133
    .line 1134
    move-object/from16 v2, v48

    .line 1135
    .line 1136
    const-string v3, "server_name"

    .line 1137
    .line 1138
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1139
    .line 1140
    .line 1141
    new-instance v48, Ldefpackage/oq4;

    .line 1142
    .line 1143
    const-string v51, "username"

    .line 1144
    .line 1145
    const-string v52, "TEXT"

    .line 1146
    .line 1147
    invoke-direct/range {v48 .. v54}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1148
    .line 1149
    .line 1150
    move-object/from16 v2, v48

    .line 1151
    .line 1152
    const-string v3, "username"

    .line 1153
    .line 1154
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1155
    .line 1156
    .line 1157
    new-instance v48, Ldefpackage/oq4;

    .line 1158
    .line 1159
    const-string v51, "password"

    .line 1160
    .line 1161
    const-string v52, "TEXT"

    .line 1162
    .line 1163
    invoke-direct/range {v48 .. v54}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1164
    .line 1165
    .line 1166
    move-object/from16 v2, v48

    .line 1167
    .line 1168
    const-string v3, "password"

    .line 1169
    .line 1170
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1171
    .line 1172
    .line 1173
    new-instance v48, Ldefpackage/oq4;

    .line 1174
    .line 1175
    const-string v51, "address"

    .line 1176
    .line 1177
    const-string v52, "TEXT"

    .line 1178
    .line 1179
    invoke-direct/range {v48 .. v54}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1180
    .line 1181
    .line 1182
    move-object/from16 v2, v48

    .line 1183
    .line 1184
    const-string v3, "address"

    .line 1185
    .line 1186
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    new-instance v48, Ldefpackage/oq4;

    .line 1190
    .line 1191
    const-string v51, "local_address"

    .line 1192
    .line 1193
    const-string v52, "TEXT"

    .line 1194
    .line 1195
    const/16 v54, 0x0

    .line 1196
    .line 1197
    invoke-direct/range {v48 .. v54}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1198
    .line 1199
    .line 1200
    move-object/from16 v2, v48

    .line 1201
    .line 1202
    const-string v3, "local_address"

    .line 1203
    .line 1204
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1205
    .line 1206
    .line 1207
    new-instance v48, Ldefpackage/oq4;

    .line 1208
    .line 1209
    const-string v51, "timestamp"

    .line 1210
    .line 1211
    const-string v52, "INTEGER"

    .line 1212
    .line 1213
    const/16 v54, 0x1

    .line 1214
    .line 1215
    invoke-direct/range {v48 .. v54}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1216
    .line 1217
    .line 1218
    move-object/from16 v2, v48

    .line 1219
    .line 1220
    const-string v3, "timestamp"

    .line 1221
    .line 1222
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1223
    .line 1224
    .line 1225
    new-instance v48, Ldefpackage/oq4;

    .line 1226
    .line 1227
    const-string v53, "false"

    .line 1228
    .line 1229
    const-string v51, "low_security"

    .line 1230
    .line 1231
    const-string v52, "INTEGER"

    .line 1232
    .line 1233
    invoke-direct/range {v48 .. v54}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1234
    .line 1235
    .line 1236
    move-object/from16 v2, v48

    .line 1237
    .line 1238
    const-string v15, "low_security"

    .line 1239
    .line 1240
    invoke-virtual {v1, v15, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1241
    .line 1242
    .line 1243
    new-instance v48, Ldefpackage/oq4;

    .line 1244
    .line 1245
    const/16 v53, 0x0

    .line 1246
    .line 1247
    const-string v51, "client_cert"

    .line 1248
    .line 1249
    const-string v52, "TEXT"

    .line 1250
    .line 1251
    const/16 v54, 0x0

    .line 1252
    .line 1253
    invoke-direct/range {v48 .. v54}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1254
    .line 1255
    .line 1256
    move-object/from16 v2, v48

    .line 1257
    .line 1258
    const-string v15, "client_cert"

    .line 1259
    .line 1260
    move-object/from16 v48, v12

    .line 1261
    .line 1262
    const/4 v12, 0x0

    .line 1263
    invoke-static {v1, v15, v2, v12}, Ldefpackage/f34;->k(Ljava/util/HashMap;Ljava/lang/String;Ldefpackage/oq4;I)Ljava/util/HashSet;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v2

    .line 1267
    new-instance v15, Ljava/util/HashSet;

    .line 1268
    .line 1269
    invoke-direct {v15, v12}, Ljava/util/HashSet;-><init>(I)V

    .line 1270
    .line 1271
    .line 1272
    new-instance v12, Ldefpackage/rq4;

    .line 1273
    .line 1274
    move-object/from16 v49, v13

    .line 1275
    .line 1276
    const-string v13, "server"

    .line 1277
    .line 1278
    invoke-direct {v12, v13, v1, v2, v15}, Ldefpackage/rq4;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    .line 1279
    .line 1280
    .line 1281
    invoke-static {v0, v13}, Ldefpackage/rq4;->b(Ldefpackage/x34;Ljava/lang/String;)Ldefpackage/rq4;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v1

    .line 1285
    invoke-virtual {v12, v1}, Ldefpackage/rq4;->equals(Ljava/lang/Object;)Z

    .line 1286
    .line 1287
    .line 1288
    move-result v2

    .line 1289
    if-nez v2, :cond_1

    .line 1290
    .line 1291
    new-instance v0, Ldefpackage/u24;

    .line 1292
    .line 1293
    const-string v2, "server(com.eddyizm.tempus.model.Server).\n Expected:\n"

    .line 1294
    .line 1295
    invoke-static {v2, v12, v14, v1}, Ldefpackage/f34;->g(Ljava/lang/String;Ldefpackage/rq4;Ljava/lang/String;Ldefpackage/rq4;)Ljava/lang/String;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v1

    .line 1299
    const/4 v2, 0x0

    .line 1300
    invoke-direct {v0, v2, v1}, Ldefpackage/u24;-><init>(ZLjava/lang/String;)V

    .line 1301
    .line 1302
    .line 1303
    return-object v0

    .line 1304
    :cond_1
    new-instance v1, Ljava/util/HashMap;

    .line 1305
    .line 1306
    const/4 v2, 0x2

    .line 1307
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 1308
    .line 1309
    .line 1310
    new-instance v50, Ldefpackage/oq4;

    .line 1311
    .line 1312
    const/16 v55, 0x0

    .line 1313
    .line 1314
    const/16 v52, 0x1

    .line 1315
    .line 1316
    const/16 v51, 0x1

    .line 1317
    .line 1318
    const-string v53, "search"

    .line 1319
    .line 1320
    const-string v54, "TEXT"

    .line 1321
    .line 1322
    const/16 v56, 0x1

    .line 1323
    .line 1324
    invoke-direct/range {v50 .. v56}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1325
    .line 1326
    .line 1327
    move-object/from16 v12, v50

    .line 1328
    .line 1329
    const-string v15, "search"

    .line 1330
    .line 1331
    invoke-virtual {v1, v15, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1332
    .line 1333
    .line 1334
    new-instance v50, Ldefpackage/oq4;

    .line 1335
    .line 1336
    const-string v55, "0"

    .line 1337
    .line 1338
    const/16 v51, 0x0

    .line 1339
    .line 1340
    const-string v53, "timestamp"

    .line 1341
    .line 1342
    const-string v54, "INTEGER"

    .line 1343
    .line 1344
    invoke-direct/range {v50 .. v56}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1345
    .line 1346
    .line 1347
    move-object/from16 v12, v50

    .line 1348
    .line 1349
    const/4 v15, 0x0

    .line 1350
    invoke-static {v1, v3, v12, v15}, Ldefpackage/f34;->k(Ljava/util/HashMap;Ljava/lang/String;Ldefpackage/oq4;I)Ljava/util/HashSet;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v12

    .line 1354
    new-instance v2, Ljava/util/HashSet;

    .line 1355
    .line 1356
    invoke-direct {v2, v15}, Ljava/util/HashSet;-><init>(I)V

    .line 1357
    .line 1358
    .line 1359
    new-instance v15, Ldefpackage/rq4;

    .line 1360
    .line 1361
    move-object/from16 v51, v13

    .line 1362
    .line 1363
    const-string v13, "recent_search"

    .line 1364
    .line 1365
    invoke-direct {v15, v13, v1, v12, v2}, Ldefpackage/rq4;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    .line 1366
    .line 1367
    .line 1368
    invoke-static {v0, v13}, Ldefpackage/rq4;->b(Ldefpackage/x34;Ljava/lang/String;)Ldefpackage/rq4;

    .line 1369
    .line 1370
    .line 1371
    move-result-object v1

    .line 1372
    invoke-virtual {v15, v1}, Ldefpackage/rq4;->equals(Ljava/lang/Object;)Z

    .line 1373
    .line 1374
    .line 1375
    move-result v2

    .line 1376
    if-nez v2, :cond_2

    .line 1377
    .line 1378
    new-instance v0, Ldefpackage/u24;

    .line 1379
    .line 1380
    const-string v2, "recent_search(com.eddyizm.tempus.model.RecentSearch).\n Expected:\n"

    .line 1381
    .line 1382
    invoke-static {v2, v15, v14, v1}, Ldefpackage/f34;->g(Ljava/lang/String;Ldefpackage/rq4;Ljava/lang/String;Ldefpackage/rq4;)Ljava/lang/String;

    .line 1383
    .line 1384
    .line 1385
    move-result-object v1

    .line 1386
    const/4 v2, 0x0

    .line 1387
    invoke-direct {v0, v2, v1}, Ldefpackage/u24;-><init>(ZLjava/lang/String;)V

    .line 1388
    .line 1389
    .line 1390
    return-object v0

    .line 1391
    :cond_2
    new-instance v1, Ljava/util/HashMap;

    .line 1392
    .line 1393
    const/16 v2, 0x2c

    .line 1394
    .line 1395
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 1396
    .line 1397
    .line 1398
    new-instance v52, Ldefpackage/oq4;

    .line 1399
    .line 1400
    const/16 v57, 0x0

    .line 1401
    .line 1402
    const/16 v54, 0x1

    .line 1403
    .line 1404
    const/16 v58, 0x1

    .line 1405
    .line 1406
    const/16 v53, 0x1

    .line 1407
    .line 1408
    const-string v55, "id"

    .line 1409
    .line 1410
    const-string v56, "TEXT"

    .line 1411
    .line 1412
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1413
    .line 1414
    .line 1415
    move-object/from16 v2, v52

    .line 1416
    .line 1417
    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1418
    .line 1419
    .line 1420
    new-instance v52, Ldefpackage/oq4;

    .line 1421
    .line 1422
    const/16 v58, 0x0

    .line 1423
    .line 1424
    const/16 v53, 0x0

    .line 1425
    .line 1426
    const-string v55, "playlist_id"

    .line 1427
    .line 1428
    const-string v56, "TEXT"

    .line 1429
    .line 1430
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1431
    .line 1432
    .line 1433
    move-object/from16 v2, v52

    .line 1434
    .line 1435
    const-string v12, "playlist_id"

    .line 1436
    .line 1437
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1438
    .line 1439
    .line 1440
    new-instance v52, Ldefpackage/oq4;

    .line 1441
    .line 1442
    const-string v55, "playlist_name"

    .line 1443
    .line 1444
    const-string v56, "TEXT"

    .line 1445
    .line 1446
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1447
    .line 1448
    .line 1449
    move-object/from16 v2, v52

    .line 1450
    .line 1451
    const-string v13, "playlist_name"

    .line 1452
    .line 1453
    invoke-virtual {v1, v13, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1454
    .line 1455
    .line 1456
    new-instance v52, Ldefpackage/oq4;

    .line 1457
    .line 1458
    const-string v57, "1"

    .line 1459
    .line 1460
    const/16 v58, 0x1

    .line 1461
    .line 1462
    const-string v55, "download_state"

    .line 1463
    .line 1464
    const-string v56, "INTEGER"

    .line 1465
    .line 1466
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1467
    .line 1468
    .line 1469
    move-object/from16 v2, v52

    .line 1470
    .line 1471
    const-string v13, "download_state"

    .line 1472
    .line 1473
    invoke-virtual {v1, v13, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1474
    .line 1475
    .line 1476
    new-instance v52, Ldefpackage/oq4;

    .line 1477
    .line 1478
    const-string v57, "\'\'"

    .line 1479
    .line 1480
    const/16 v58, 0x0

    .line 1481
    .line 1482
    const-string v55, "download_uri"

    .line 1483
    .line 1484
    const-string v56, "TEXT"

    .line 1485
    .line 1486
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1487
    .line 1488
    .line 1489
    move-object/from16 v2, v52

    .line 1490
    .line 1491
    const-string v13, "download_uri"

    .line 1492
    .line 1493
    invoke-virtual {v1, v13, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1494
    .line 1495
    .line 1496
    new-instance v52, Ldefpackage/oq4;

    .line 1497
    .line 1498
    const/16 v57, 0x0

    .line 1499
    .line 1500
    const-string v55, "parent_id"

    .line 1501
    .line 1502
    const-string v56, "TEXT"

    .line 1503
    .line 1504
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1505
    .line 1506
    .line 1507
    move-object/from16 v2, v52

    .line 1508
    .line 1509
    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1510
    .line 1511
    .line 1512
    new-instance v52, Ldefpackage/oq4;

    .line 1513
    .line 1514
    const/16 v58, 0x1

    .line 1515
    .line 1516
    const-string v55, "is_dir"

    .line 1517
    .line 1518
    const-string v56, "INTEGER"

    .line 1519
    .line 1520
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1521
    .line 1522
    .line 1523
    move-object/from16 v2, v52

    .line 1524
    .line 1525
    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1526
    .line 1527
    .line 1528
    new-instance v52, Ldefpackage/oq4;

    .line 1529
    .line 1530
    const/16 v58, 0x0

    .line 1531
    .line 1532
    const-string v55, "title"

    .line 1533
    .line 1534
    const-string v56, "TEXT"

    .line 1535
    .line 1536
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1537
    .line 1538
    .line 1539
    move-object/from16 v2, v52

    .line 1540
    .line 1541
    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1542
    .line 1543
    .line 1544
    new-instance v52, Ldefpackage/oq4;

    .line 1545
    .line 1546
    const-string v55, "album"

    .line 1547
    .line 1548
    const-string v56, "TEXT"

    .line 1549
    .line 1550
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1551
    .line 1552
    .line 1553
    move-object/from16 v2, v52

    .line 1554
    .line 1555
    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1556
    .line 1557
    .line 1558
    new-instance v52, Ldefpackage/oq4;

    .line 1559
    .line 1560
    const-string v55, "artist"

    .line 1561
    .line 1562
    const-string v56, "TEXT"

    .line 1563
    .line 1564
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1565
    .line 1566
    .line 1567
    move-object/from16 v2, v52

    .line 1568
    .line 1569
    invoke-virtual {v1, v9, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1570
    .line 1571
    .line 1572
    new-instance v52, Ldefpackage/oq4;

    .line 1573
    .line 1574
    const-string v55, "track"

    .line 1575
    .line 1576
    const-string v56, "INTEGER"

    .line 1577
    .line 1578
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1579
    .line 1580
    .line 1581
    move-object/from16 v2, v52

    .line 1582
    .line 1583
    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1584
    .line 1585
    .line 1586
    new-instance v52, Ldefpackage/oq4;

    .line 1587
    .line 1588
    const-string v55, "year"

    .line 1589
    .line 1590
    const-string v56, "INTEGER"

    .line 1591
    .line 1592
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1593
    .line 1594
    .line 1595
    move-object/from16 v2, v52

    .line 1596
    .line 1597
    invoke-virtual {v1, v11, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1598
    .line 1599
    .line 1600
    new-instance v52, Ldefpackage/oq4;

    .line 1601
    .line 1602
    const-string v55, "genre"

    .line 1603
    .line 1604
    const-string v56, "TEXT"

    .line 1605
    .line 1606
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1607
    .line 1608
    .line 1609
    move-object/from16 v13, v49

    .line 1610
    .line 1611
    move-object/from16 v2, v52

    .line 1612
    .line 1613
    invoke-virtual {v1, v13, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1614
    .line 1615
    .line 1616
    new-instance v52, Ldefpackage/oq4;

    .line 1617
    .line 1618
    const-string v55, "cover_art_id"

    .line 1619
    .line 1620
    const-string v56, "TEXT"

    .line 1621
    .line 1622
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1623
    .line 1624
    .line 1625
    move-object/from16 v15, v48

    .line 1626
    .line 1627
    move-object/from16 v2, v52

    .line 1628
    .line 1629
    invoke-virtual {v1, v15, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1630
    .line 1631
    .line 1632
    new-instance v52, Ldefpackage/oq4;

    .line 1633
    .line 1634
    const-string v55, "size"

    .line 1635
    .line 1636
    const-string v56, "INTEGER"

    .line 1637
    .line 1638
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1639
    .line 1640
    .line 1641
    move-object/from16 p0, v12

    .line 1642
    .line 1643
    move-object/from16 v12, v47

    .line 1644
    .line 1645
    move-object/from16 v2, v52

    .line 1646
    .line 1647
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1648
    .line 1649
    .line 1650
    new-instance v52, Ldefpackage/oq4;

    .line 1651
    .line 1652
    const-string v55, "content_type"

    .line 1653
    .line 1654
    const-string v56, "TEXT"

    .line 1655
    .line 1656
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1657
    .line 1658
    .line 1659
    move-object/from16 v12, v44

    .line 1660
    .line 1661
    move-object/from16 v2, v52

    .line 1662
    .line 1663
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1664
    .line 1665
    .line 1666
    new-instance v52, Ldefpackage/oq4;

    .line 1667
    .line 1668
    const-string v55, "suffix"

    .line 1669
    .line 1670
    const-string v56, "TEXT"

    .line 1671
    .line 1672
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1673
    .line 1674
    .line 1675
    move-object/from16 v12, v17

    .line 1676
    .line 1677
    move-object/from16 v2, v52

    .line 1678
    .line 1679
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1680
    .line 1681
    .line 1682
    new-instance v52, Ldefpackage/oq4;

    .line 1683
    .line 1684
    const-string v55, "transcoding_content_type"

    .line 1685
    .line 1686
    const-string v56, "TEXT"

    .line 1687
    .line 1688
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1689
    .line 1690
    .line 1691
    move-object/from16 v12, v18

    .line 1692
    .line 1693
    move-object/from16 v2, v52

    .line 1694
    .line 1695
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1696
    .line 1697
    .line 1698
    new-instance v52, Ldefpackage/oq4;

    .line 1699
    .line 1700
    const-string v55, "transcoded_suffix"

    .line 1701
    .line 1702
    const-string v56, "TEXT"

    .line 1703
    .line 1704
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1705
    .line 1706
    .line 1707
    move-object/from16 v12, v19

    .line 1708
    .line 1709
    move-object/from16 v2, v52

    .line 1710
    .line 1711
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1712
    .line 1713
    .line 1714
    new-instance v52, Ldefpackage/oq4;

    .line 1715
    .line 1716
    const-string v55, "duration"

    .line 1717
    .line 1718
    const-string v56, "INTEGER"

    .line 1719
    .line 1720
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1721
    .line 1722
    .line 1723
    move-object/from16 v12, v20

    .line 1724
    .line 1725
    move-object/from16 v2, v52

    .line 1726
    .line 1727
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1728
    .line 1729
    .line 1730
    new-instance v52, Ldefpackage/oq4;

    .line 1731
    .line 1732
    const-string v55, "bitrate"

    .line 1733
    .line 1734
    const-string v56, "INTEGER"

    .line 1735
    .line 1736
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1737
    .line 1738
    .line 1739
    move-object/from16 v12, v21

    .line 1740
    .line 1741
    move-object/from16 v2, v52

    .line 1742
    .line 1743
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1744
    .line 1745
    .line 1746
    new-instance v52, Ldefpackage/oq4;

    .line 1747
    .line 1748
    const-string v55, "sampling_rate"

    .line 1749
    .line 1750
    const-string v56, "INTEGER"

    .line 1751
    .line 1752
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1753
    .line 1754
    .line 1755
    move-object/from16 v12, v22

    .line 1756
    .line 1757
    move-object/from16 v2, v52

    .line 1758
    .line 1759
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1760
    .line 1761
    .line 1762
    new-instance v52, Ldefpackage/oq4;

    .line 1763
    .line 1764
    const-string v55, "bit_depth"

    .line 1765
    .line 1766
    const-string v56, "INTEGER"

    .line 1767
    .line 1768
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1769
    .line 1770
    .line 1771
    move-object/from16 v12, v23

    .line 1772
    .line 1773
    move-object/from16 v2, v52

    .line 1774
    .line 1775
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1776
    .line 1777
    .line 1778
    new-instance v52, Ldefpackage/oq4;

    .line 1779
    .line 1780
    const-string v55, "path"

    .line 1781
    .line 1782
    const-string v56, "TEXT"

    .line 1783
    .line 1784
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1785
    .line 1786
    .line 1787
    move-object/from16 v12, v24

    .line 1788
    .line 1789
    move-object/from16 v2, v52

    .line 1790
    .line 1791
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1792
    .line 1793
    .line 1794
    new-instance v52, Ldefpackage/oq4;

    .line 1795
    .line 1796
    const/16 v58, 0x1

    .line 1797
    .line 1798
    const-string v55, "is_video"

    .line 1799
    .line 1800
    const-string v56, "INTEGER"

    .line 1801
    .line 1802
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1803
    .line 1804
    .line 1805
    move-object/from16 v12, v25

    .line 1806
    .line 1807
    move-object/from16 v2, v52

    .line 1808
    .line 1809
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1810
    .line 1811
    .line 1812
    new-instance v52, Ldefpackage/oq4;

    .line 1813
    .line 1814
    const/16 v58, 0x0

    .line 1815
    .line 1816
    const-string v55, "user_rating"

    .line 1817
    .line 1818
    const-string v56, "INTEGER"

    .line 1819
    .line 1820
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1821
    .line 1822
    .line 1823
    move-object/from16 v12, v26

    .line 1824
    .line 1825
    move-object/from16 v2, v52

    .line 1826
    .line 1827
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1828
    .line 1829
    .line 1830
    new-instance v52, Ldefpackage/oq4;

    .line 1831
    .line 1832
    const-string v55, "average_rating"

    .line 1833
    .line 1834
    const-string v56, "REAL"

    .line 1835
    .line 1836
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1837
    .line 1838
    .line 1839
    move-object/from16 v12, v27

    .line 1840
    .line 1841
    move-object/from16 v2, v52

    .line 1842
    .line 1843
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1844
    .line 1845
    .line 1846
    new-instance v52, Ldefpackage/oq4;

    .line 1847
    .line 1848
    const-string v55, "play_count"

    .line 1849
    .line 1850
    const-string v56, "INTEGER"

    .line 1851
    .line 1852
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1853
    .line 1854
    .line 1855
    move-object/from16 v12, v28

    .line 1856
    .line 1857
    move-object/from16 v2, v52

    .line 1858
    .line 1859
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1860
    .line 1861
    .line 1862
    new-instance v52, Ldefpackage/oq4;

    .line 1863
    .line 1864
    const-string v55, "disc_number"

    .line 1865
    .line 1866
    const-string v56, "INTEGER"

    .line 1867
    .line 1868
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1869
    .line 1870
    .line 1871
    move-object/from16 v12, v29

    .line 1872
    .line 1873
    move-object/from16 v2, v52

    .line 1874
    .line 1875
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1876
    .line 1877
    .line 1878
    new-instance v52, Ldefpackage/oq4;

    .line 1879
    .line 1880
    const-string v55, "created"

    .line 1881
    .line 1882
    const-string v56, "INTEGER"

    .line 1883
    .line 1884
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1885
    .line 1886
    .line 1887
    move-object/from16 v12, v30

    .line 1888
    .line 1889
    move-object/from16 v2, v52

    .line 1890
    .line 1891
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1892
    .line 1893
    .line 1894
    new-instance v52, Ldefpackage/oq4;

    .line 1895
    .line 1896
    const-string v55, "starred"

    .line 1897
    .line 1898
    const-string v56, "INTEGER"

    .line 1899
    .line 1900
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1901
    .line 1902
    .line 1903
    move-object/from16 v12, v31

    .line 1904
    .line 1905
    move-object/from16 v2, v52

    .line 1906
    .line 1907
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1908
    .line 1909
    .line 1910
    new-instance v52, Ldefpackage/oq4;

    .line 1911
    .line 1912
    const-string v55, "album_id"

    .line 1913
    .line 1914
    const-string v56, "TEXT"

    .line 1915
    .line 1916
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1917
    .line 1918
    .line 1919
    move-object/from16 v12, v32

    .line 1920
    .line 1921
    move-object/from16 v2, v52

    .line 1922
    .line 1923
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1924
    .line 1925
    .line 1926
    new-instance v52, Ldefpackage/oq4;

    .line 1927
    .line 1928
    const-string v55, "artist_id"

    .line 1929
    .line 1930
    const-string v56, "TEXT"

    .line 1931
    .line 1932
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1933
    .line 1934
    .line 1935
    move-object/from16 v12, v33

    .line 1936
    .line 1937
    move-object/from16 v2, v52

    .line 1938
    .line 1939
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1940
    .line 1941
    .line 1942
    new-instance v52, Ldefpackage/oq4;

    .line 1943
    .line 1944
    const-string v55, "type"

    .line 1945
    .line 1946
    const-string v56, "TEXT"

    .line 1947
    .line 1948
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1949
    .line 1950
    .line 1951
    move-object/from16 v12, v34

    .line 1952
    .line 1953
    move-object/from16 v2, v52

    .line 1954
    .line 1955
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1956
    .line 1957
    .line 1958
    new-instance v52, Ldefpackage/oq4;

    .line 1959
    .line 1960
    const-string v55, "bookmark_position"

    .line 1961
    .line 1962
    const-string v56, "INTEGER"

    .line 1963
    .line 1964
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1965
    .line 1966
    .line 1967
    move-object/from16 v12, v35

    .line 1968
    .line 1969
    move-object/from16 v2, v52

    .line 1970
    .line 1971
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1972
    .line 1973
    .line 1974
    new-instance v52, Ldefpackage/oq4;

    .line 1975
    .line 1976
    const-string v55, "original_width"

    .line 1977
    .line 1978
    const-string v56, "INTEGER"

    .line 1979
    .line 1980
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1981
    .line 1982
    .line 1983
    move-object/from16 v12, v36

    .line 1984
    .line 1985
    move-object/from16 v2, v52

    .line 1986
    .line 1987
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1988
    .line 1989
    .line 1990
    new-instance v52, Ldefpackage/oq4;

    .line 1991
    .line 1992
    const-string v55, "original_height"

    .line 1993
    .line 1994
    const-string v56, "INTEGER"

    .line 1995
    .line 1996
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1997
    .line 1998
    .line 1999
    move-object/from16 v12, v37

    .line 2000
    .line 2001
    move-object/from16 v2, v52

    .line 2002
    .line 2003
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2004
    .line 2005
    .line 2006
    new-instance v52, Ldefpackage/oq4;

    .line 2007
    .line 2008
    const-string v55, "album_artist"

    .line 2009
    .line 2010
    const-string v56, "TEXT"

    .line 2011
    .line 2012
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2013
    .line 2014
    .line 2015
    move-object/from16 v12, v38

    .line 2016
    .line 2017
    move-object/from16 v2, v52

    .line 2018
    .line 2019
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2020
    .line 2021
    .line 2022
    new-instance v52, Ldefpackage/oq4;

    .line 2023
    .line 2024
    const-string v55, "rg_track_gain"

    .line 2025
    .line 2026
    const-string v56, "REAL"

    .line 2027
    .line 2028
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2029
    .line 2030
    .line 2031
    move-object/from16 v12, v39

    .line 2032
    .line 2033
    move-object/from16 v2, v52

    .line 2034
    .line 2035
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2036
    .line 2037
    .line 2038
    new-instance v52, Ldefpackage/oq4;

    .line 2039
    .line 2040
    const-string v55, "rg_album_gain"

    .line 2041
    .line 2042
    const-string v56, "REAL"

    .line 2043
    .line 2044
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2045
    .line 2046
    .line 2047
    move-object/from16 v12, v40

    .line 2048
    .line 2049
    move-object/from16 v2, v52

    .line 2050
    .line 2051
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2052
    .line 2053
    .line 2054
    new-instance v52, Ldefpackage/oq4;

    .line 2055
    .line 2056
    const-string v55, "rg_track_peak"

    .line 2057
    .line 2058
    const-string v56, "REAL"

    .line 2059
    .line 2060
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2061
    .line 2062
    .line 2063
    move-object/from16 v12, v41

    .line 2064
    .line 2065
    move-object/from16 v2, v52

    .line 2066
    .line 2067
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2068
    .line 2069
    .line 2070
    new-instance v52, Ldefpackage/oq4;

    .line 2071
    .line 2072
    const-string v55, "rg_album_peak"

    .line 2073
    .line 2074
    const-string v56, "REAL"

    .line 2075
    .line 2076
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2077
    .line 2078
    .line 2079
    move-object/from16 v12, v42

    .line 2080
    .line 2081
    move-object/from16 v2, v52

    .line 2082
    .line 2083
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2084
    .line 2085
    .line 2086
    new-instance v52, Ldefpackage/oq4;

    .line 2087
    .line 2088
    const-string v55, "rg_base_gain"

    .line 2089
    .line 2090
    const-string v56, "REAL"

    .line 2091
    .line 2092
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2093
    .line 2094
    .line 2095
    move-object/from16 v12, v43

    .line 2096
    .line 2097
    move-object/from16 v2, v52

    .line 2098
    .line 2099
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2100
    .line 2101
    .line 2102
    new-instance v52, Ldefpackage/oq4;

    .line 2103
    .line 2104
    const-string v55, "rg_fallback_gain"

    .line 2105
    .line 2106
    const-string v56, "REAL"

    .line 2107
    .line 2108
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2109
    .line 2110
    .line 2111
    move-object/from16 v12, v45

    .line 2112
    .line 2113
    move-object/from16 v2, v52

    .line 2114
    .line 2115
    const/4 v15, 0x0

    .line 2116
    invoke-static {v1, v12, v2, v15}, Ldefpackage/f34;->k(Ljava/util/HashMap;Ljava/lang/String;Ldefpackage/oq4;I)Ljava/util/HashSet;

    .line 2117
    .line 2118
    .line 2119
    move-result-object v2

    .line 2120
    new-instance v12, Ljava/util/HashSet;

    .line 2121
    .line 2122
    invoke-direct {v12, v15}, Ljava/util/HashSet;-><init>(I)V

    .line 2123
    .line 2124
    .line 2125
    new-instance v15, Ldefpackage/rq4;

    .line 2126
    .line 2127
    const-string v13, "download"

    .line 2128
    .line 2129
    invoke-direct {v15, v13, v1, v2, v12}, Ldefpackage/rq4;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    .line 2130
    .line 2131
    .line 2132
    invoke-static {v0, v13}, Ldefpackage/rq4;->b(Ldefpackage/x34;Ljava/lang/String;)Ldefpackage/rq4;

    .line 2133
    .line 2134
    .line 2135
    move-result-object v1

    .line 2136
    invoke-virtual {v15, v1}, Ldefpackage/rq4;->equals(Ljava/lang/Object;)Z

    .line 2137
    .line 2138
    .line 2139
    move-result v2

    .line 2140
    if-nez v2, :cond_3

    .line 2141
    .line 2142
    new-instance v0, Ldefpackage/u24;

    .line 2143
    .line 2144
    const-string v2, "download(com.eddyizm.tempus.model.Download).\n Expected:\n"

    .line 2145
    .line 2146
    invoke-static {v2, v15, v14, v1}, Ldefpackage/f34;->g(Ljava/lang/String;Ldefpackage/rq4;Ljava/lang/String;Ldefpackage/rq4;)Ljava/lang/String;

    .line 2147
    .line 2148
    .line 2149
    move-result-object v1

    .line 2150
    const/4 v2, 0x0

    .line 2151
    invoke-direct {v0, v2, v1}, Ldefpackage/u24;-><init>(ZLjava/lang/String;)V

    .line 2152
    .line 2153
    .line 2154
    return-object v0

    .line 2155
    :cond_3
    new-instance v1, Ljava/util/HashMap;

    .line 2156
    .line 2157
    const/16 v2, 0x2a

    .line 2158
    .line 2159
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 2160
    .line 2161
    .line 2162
    new-instance v52, Ldefpackage/oq4;

    .line 2163
    .line 2164
    const/16 v57, 0x0

    .line 2165
    .line 2166
    const/16 v54, 0x1

    .line 2167
    .line 2168
    const/16 v58, 0x1

    .line 2169
    .line 2170
    const/16 v53, 0x1

    .line 2171
    .line 2172
    const-string v55, "id"

    .line 2173
    .line 2174
    const-string v56, "TEXT"

    .line 2175
    .line 2176
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2177
    .line 2178
    .line 2179
    move-object/from16 v2, v52

    .line 2180
    .line 2181
    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2182
    .line 2183
    .line 2184
    new-instance v52, Ldefpackage/oq4;

    .line 2185
    .line 2186
    const/16 v53, 0x0

    .line 2187
    .line 2188
    const-string v55, "timestamp"

    .line 2189
    .line 2190
    const-string v56, "INTEGER"

    .line 2191
    .line 2192
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2193
    .line 2194
    .line 2195
    move-object/from16 v2, v52

    .line 2196
    .line 2197
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2198
    .line 2199
    .line 2200
    new-instance v52, Ldefpackage/oq4;

    .line 2201
    .line 2202
    const/16 v58, 0x0

    .line 2203
    .line 2204
    const-string v55, "server"

    .line 2205
    .line 2206
    const-string v56, "TEXT"

    .line 2207
    .line 2208
    invoke-direct/range {v52 .. v58}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2209
    .line 2210
    .line 2211
    move-object/from16 v12, v51

    .line 2212
    .line 2213
    move-object/from16 v2, v52

    .line 2214
    .line 2215
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2216
    .line 2217
    .line 2218
    new-instance v51, Ldefpackage/oq4;

    .line 2219
    .line 2220
    const/16 v56, 0x0

    .line 2221
    .line 2222
    const/16 v53, 0x1

    .line 2223
    .line 2224
    const/16 v57, 0x0

    .line 2225
    .line 2226
    const/16 v52, 0x0

    .line 2227
    .line 2228
    const-string v54, "parent_id"

    .line 2229
    .line 2230
    const-string v55, "TEXT"

    .line 2231
    .line 2232
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2233
    .line 2234
    .line 2235
    move-object/from16 v2, v51

    .line 2236
    .line 2237
    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2238
    .line 2239
    .line 2240
    new-instance v51, Ldefpackage/oq4;

    .line 2241
    .line 2242
    const/16 v57, 0x1

    .line 2243
    .line 2244
    const-string v54, "is_dir"

    .line 2245
    .line 2246
    const-string v55, "INTEGER"

    .line 2247
    .line 2248
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2249
    .line 2250
    .line 2251
    move-object/from16 v2, v51

    .line 2252
    .line 2253
    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2254
    .line 2255
    .line 2256
    new-instance v51, Ldefpackage/oq4;

    .line 2257
    .line 2258
    const/16 v57, 0x0

    .line 2259
    .line 2260
    const-string v54, "title"

    .line 2261
    .line 2262
    const-string v55, "TEXT"

    .line 2263
    .line 2264
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2265
    .line 2266
    .line 2267
    move-object/from16 v2, v51

    .line 2268
    .line 2269
    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2270
    .line 2271
    .line 2272
    new-instance v51, Ldefpackage/oq4;

    .line 2273
    .line 2274
    const-string v54, "album"

    .line 2275
    .line 2276
    const-string v55, "TEXT"

    .line 2277
    .line 2278
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2279
    .line 2280
    .line 2281
    move-object/from16 v2, v51

    .line 2282
    .line 2283
    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2284
    .line 2285
    .line 2286
    new-instance v51, Ldefpackage/oq4;

    .line 2287
    .line 2288
    const-string v54, "artist"

    .line 2289
    .line 2290
    const-string v55, "TEXT"

    .line 2291
    .line 2292
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2293
    .line 2294
    .line 2295
    move-object/from16 v2, v51

    .line 2296
    .line 2297
    invoke-virtual {v1, v9, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2298
    .line 2299
    .line 2300
    new-instance v51, Ldefpackage/oq4;

    .line 2301
    .line 2302
    const-string v54, "track"

    .line 2303
    .line 2304
    const-string v55, "INTEGER"

    .line 2305
    .line 2306
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2307
    .line 2308
    .line 2309
    move-object/from16 v2, v51

    .line 2310
    .line 2311
    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2312
    .line 2313
    .line 2314
    new-instance v51, Ldefpackage/oq4;

    .line 2315
    .line 2316
    const-string v54, "year"

    .line 2317
    .line 2318
    const-string v55, "INTEGER"

    .line 2319
    .line 2320
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2321
    .line 2322
    .line 2323
    move-object/from16 v2, v51

    .line 2324
    .line 2325
    invoke-virtual {v1, v11, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2326
    .line 2327
    .line 2328
    new-instance v51, Ldefpackage/oq4;

    .line 2329
    .line 2330
    const-string v54, "genre"

    .line 2331
    .line 2332
    const-string v55, "TEXT"

    .line 2333
    .line 2334
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2335
    .line 2336
    .line 2337
    move-object/from16 v13, v49

    .line 2338
    .line 2339
    move-object/from16 v2, v51

    .line 2340
    .line 2341
    invoke-virtual {v1, v13, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2342
    .line 2343
    .line 2344
    new-instance v51, Ldefpackage/oq4;

    .line 2345
    .line 2346
    const-string v54, "cover_art_id"

    .line 2347
    .line 2348
    const-string v55, "TEXT"

    .line 2349
    .line 2350
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2351
    .line 2352
    .line 2353
    move-object/from16 v15, v48

    .line 2354
    .line 2355
    move-object/from16 v2, v51

    .line 2356
    .line 2357
    invoke-virtual {v1, v15, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2358
    .line 2359
    .line 2360
    new-instance v51, Ldefpackage/oq4;

    .line 2361
    .line 2362
    const-string v54, "size"

    .line 2363
    .line 2364
    const-string v55, "INTEGER"

    .line 2365
    .line 2366
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2367
    .line 2368
    .line 2369
    move-object/from16 v12, v47

    .line 2370
    .line 2371
    move-object/from16 v2, v51

    .line 2372
    .line 2373
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2374
    .line 2375
    .line 2376
    new-instance v51, Ldefpackage/oq4;

    .line 2377
    .line 2378
    const-string v54, "content_type"

    .line 2379
    .line 2380
    const-string v55, "TEXT"

    .line 2381
    .line 2382
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2383
    .line 2384
    .line 2385
    move-object/from16 v12, v44

    .line 2386
    .line 2387
    move-object/from16 v2, v51

    .line 2388
    .line 2389
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2390
    .line 2391
    .line 2392
    new-instance v51, Ldefpackage/oq4;

    .line 2393
    .line 2394
    const-string v54, "suffix"

    .line 2395
    .line 2396
    const-string v55, "TEXT"

    .line 2397
    .line 2398
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2399
    .line 2400
    .line 2401
    move-object/from16 v12, v17

    .line 2402
    .line 2403
    move-object/from16 v2, v51

    .line 2404
    .line 2405
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2406
    .line 2407
    .line 2408
    new-instance v51, Ldefpackage/oq4;

    .line 2409
    .line 2410
    const-string v54, "transcoding_content_type"

    .line 2411
    .line 2412
    const-string v55, "TEXT"

    .line 2413
    .line 2414
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2415
    .line 2416
    .line 2417
    move-object/from16 v12, v18

    .line 2418
    .line 2419
    move-object/from16 v2, v51

    .line 2420
    .line 2421
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2422
    .line 2423
    .line 2424
    new-instance v51, Ldefpackage/oq4;

    .line 2425
    .line 2426
    const-string v54, "transcoded_suffix"

    .line 2427
    .line 2428
    const-string v55, "TEXT"

    .line 2429
    .line 2430
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2431
    .line 2432
    .line 2433
    move-object/from16 v12, v19

    .line 2434
    .line 2435
    move-object/from16 v2, v51

    .line 2436
    .line 2437
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2438
    .line 2439
    .line 2440
    new-instance v51, Ldefpackage/oq4;

    .line 2441
    .line 2442
    const-string v54, "duration"

    .line 2443
    .line 2444
    const-string v55, "INTEGER"

    .line 2445
    .line 2446
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2447
    .line 2448
    .line 2449
    move-object/from16 v12, v20

    .line 2450
    .line 2451
    move-object/from16 v2, v51

    .line 2452
    .line 2453
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2454
    .line 2455
    .line 2456
    new-instance v51, Ldefpackage/oq4;

    .line 2457
    .line 2458
    const-string v54, "bitrate"

    .line 2459
    .line 2460
    const-string v55, "INTEGER"

    .line 2461
    .line 2462
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2463
    .line 2464
    .line 2465
    move-object/from16 v12, v21

    .line 2466
    .line 2467
    move-object/from16 v2, v51

    .line 2468
    .line 2469
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2470
    .line 2471
    .line 2472
    new-instance v51, Ldefpackage/oq4;

    .line 2473
    .line 2474
    const-string v54, "sampling_rate"

    .line 2475
    .line 2476
    const-string v55, "INTEGER"

    .line 2477
    .line 2478
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2479
    .line 2480
    .line 2481
    move-object/from16 v12, v22

    .line 2482
    .line 2483
    move-object/from16 v2, v51

    .line 2484
    .line 2485
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2486
    .line 2487
    .line 2488
    new-instance v51, Ldefpackage/oq4;

    .line 2489
    .line 2490
    const-string v54, "bit_depth"

    .line 2491
    .line 2492
    const-string v55, "INTEGER"

    .line 2493
    .line 2494
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2495
    .line 2496
    .line 2497
    move-object/from16 v12, v23

    .line 2498
    .line 2499
    move-object/from16 v2, v51

    .line 2500
    .line 2501
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2502
    .line 2503
    .line 2504
    new-instance v51, Ldefpackage/oq4;

    .line 2505
    .line 2506
    const-string v54, "path"

    .line 2507
    .line 2508
    const-string v55, "TEXT"

    .line 2509
    .line 2510
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2511
    .line 2512
    .line 2513
    move-object/from16 v12, v24

    .line 2514
    .line 2515
    move-object/from16 v2, v51

    .line 2516
    .line 2517
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2518
    .line 2519
    .line 2520
    new-instance v51, Ldefpackage/oq4;

    .line 2521
    .line 2522
    const/16 v57, 0x1

    .line 2523
    .line 2524
    const-string v54, "is_video"

    .line 2525
    .line 2526
    const-string v55, "INTEGER"

    .line 2527
    .line 2528
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2529
    .line 2530
    .line 2531
    move-object/from16 v12, v25

    .line 2532
    .line 2533
    move-object/from16 v2, v51

    .line 2534
    .line 2535
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2536
    .line 2537
    .line 2538
    new-instance v51, Ldefpackage/oq4;

    .line 2539
    .line 2540
    const/16 v57, 0x0

    .line 2541
    .line 2542
    const-string v54, "user_rating"

    .line 2543
    .line 2544
    const-string v55, "INTEGER"

    .line 2545
    .line 2546
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2547
    .line 2548
    .line 2549
    move-object/from16 v12, v26

    .line 2550
    .line 2551
    move-object/from16 v2, v51

    .line 2552
    .line 2553
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2554
    .line 2555
    .line 2556
    new-instance v51, Ldefpackage/oq4;

    .line 2557
    .line 2558
    const-string v54, "average_rating"

    .line 2559
    .line 2560
    const-string v55, "REAL"

    .line 2561
    .line 2562
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2563
    .line 2564
    .line 2565
    move-object/from16 v12, v27

    .line 2566
    .line 2567
    move-object/from16 v2, v51

    .line 2568
    .line 2569
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2570
    .line 2571
    .line 2572
    new-instance v51, Ldefpackage/oq4;

    .line 2573
    .line 2574
    const-string v54, "play_count"

    .line 2575
    .line 2576
    const-string v55, "INTEGER"

    .line 2577
    .line 2578
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2579
    .line 2580
    .line 2581
    move-object/from16 v12, v28

    .line 2582
    .line 2583
    move-object/from16 v2, v51

    .line 2584
    .line 2585
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2586
    .line 2587
    .line 2588
    new-instance v51, Ldefpackage/oq4;

    .line 2589
    .line 2590
    const-string v54, "disc_number"

    .line 2591
    .line 2592
    const-string v55, "INTEGER"

    .line 2593
    .line 2594
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2595
    .line 2596
    .line 2597
    move-object/from16 v12, v29

    .line 2598
    .line 2599
    move-object/from16 v2, v51

    .line 2600
    .line 2601
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2602
    .line 2603
    .line 2604
    new-instance v51, Ldefpackage/oq4;

    .line 2605
    .line 2606
    const-string v54, "created"

    .line 2607
    .line 2608
    const-string v55, "INTEGER"

    .line 2609
    .line 2610
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2611
    .line 2612
    .line 2613
    move-object/from16 v12, v30

    .line 2614
    .line 2615
    move-object/from16 v2, v51

    .line 2616
    .line 2617
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2618
    .line 2619
    .line 2620
    new-instance v51, Ldefpackage/oq4;

    .line 2621
    .line 2622
    const-string v54, "starred"

    .line 2623
    .line 2624
    const-string v55, "INTEGER"

    .line 2625
    .line 2626
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2627
    .line 2628
    .line 2629
    move-object/from16 v12, v31

    .line 2630
    .line 2631
    move-object/from16 v2, v51

    .line 2632
    .line 2633
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2634
    .line 2635
    .line 2636
    new-instance v51, Ldefpackage/oq4;

    .line 2637
    .line 2638
    const-string v54, "album_id"

    .line 2639
    .line 2640
    const-string v55, "TEXT"

    .line 2641
    .line 2642
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2643
    .line 2644
    .line 2645
    move-object/from16 v12, v32

    .line 2646
    .line 2647
    move-object/from16 v2, v51

    .line 2648
    .line 2649
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2650
    .line 2651
    .line 2652
    new-instance v51, Ldefpackage/oq4;

    .line 2653
    .line 2654
    const-string v54, "artist_id"

    .line 2655
    .line 2656
    const-string v55, "TEXT"

    .line 2657
    .line 2658
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2659
    .line 2660
    .line 2661
    move-object/from16 v12, v33

    .line 2662
    .line 2663
    move-object/from16 v2, v51

    .line 2664
    .line 2665
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2666
    .line 2667
    .line 2668
    new-instance v51, Ldefpackage/oq4;

    .line 2669
    .line 2670
    const-string v54, "type"

    .line 2671
    .line 2672
    const-string v55, "TEXT"

    .line 2673
    .line 2674
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2675
    .line 2676
    .line 2677
    move-object/from16 v12, v34

    .line 2678
    .line 2679
    move-object/from16 v2, v51

    .line 2680
    .line 2681
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2682
    .line 2683
    .line 2684
    new-instance v51, Ldefpackage/oq4;

    .line 2685
    .line 2686
    const-string v54, "bookmark_position"

    .line 2687
    .line 2688
    const-string v55, "INTEGER"

    .line 2689
    .line 2690
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2691
    .line 2692
    .line 2693
    move-object/from16 v12, v35

    .line 2694
    .line 2695
    move-object/from16 v2, v51

    .line 2696
    .line 2697
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2698
    .line 2699
    .line 2700
    new-instance v51, Ldefpackage/oq4;

    .line 2701
    .line 2702
    const-string v54, "original_width"

    .line 2703
    .line 2704
    const-string v55, "INTEGER"

    .line 2705
    .line 2706
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2707
    .line 2708
    .line 2709
    move-object/from16 v12, v36

    .line 2710
    .line 2711
    move-object/from16 v2, v51

    .line 2712
    .line 2713
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2714
    .line 2715
    .line 2716
    new-instance v51, Ldefpackage/oq4;

    .line 2717
    .line 2718
    const-string v54, "original_height"

    .line 2719
    .line 2720
    const-string v55, "INTEGER"

    .line 2721
    .line 2722
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2723
    .line 2724
    .line 2725
    move-object/from16 v12, v37

    .line 2726
    .line 2727
    move-object/from16 v2, v51

    .line 2728
    .line 2729
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2730
    .line 2731
    .line 2732
    new-instance v51, Ldefpackage/oq4;

    .line 2733
    .line 2734
    const-string v54, "album_artist"

    .line 2735
    .line 2736
    const-string v55, "TEXT"

    .line 2737
    .line 2738
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2739
    .line 2740
    .line 2741
    move-object/from16 v12, v38

    .line 2742
    .line 2743
    move-object/from16 v2, v51

    .line 2744
    .line 2745
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2746
    .line 2747
    .line 2748
    new-instance v51, Ldefpackage/oq4;

    .line 2749
    .line 2750
    const-string v54, "rg_track_gain"

    .line 2751
    .line 2752
    const-string v55, "REAL"

    .line 2753
    .line 2754
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2755
    .line 2756
    .line 2757
    move-object/from16 v12, v39

    .line 2758
    .line 2759
    move-object/from16 v2, v51

    .line 2760
    .line 2761
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2762
    .line 2763
    .line 2764
    new-instance v51, Ldefpackage/oq4;

    .line 2765
    .line 2766
    const-string v54, "rg_album_gain"

    .line 2767
    .line 2768
    const-string v55, "REAL"

    .line 2769
    .line 2770
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2771
    .line 2772
    .line 2773
    move-object/from16 v12, v40

    .line 2774
    .line 2775
    move-object/from16 v2, v51

    .line 2776
    .line 2777
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2778
    .line 2779
    .line 2780
    new-instance v51, Ldefpackage/oq4;

    .line 2781
    .line 2782
    const-string v54, "rg_track_peak"

    .line 2783
    .line 2784
    const-string v55, "REAL"

    .line 2785
    .line 2786
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2787
    .line 2788
    .line 2789
    move-object/from16 v12, v41

    .line 2790
    .line 2791
    move-object/from16 v2, v51

    .line 2792
    .line 2793
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2794
    .line 2795
    .line 2796
    new-instance v51, Ldefpackage/oq4;

    .line 2797
    .line 2798
    const-string v54, "rg_album_peak"

    .line 2799
    .line 2800
    const-string v55, "REAL"

    .line 2801
    .line 2802
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2803
    .line 2804
    .line 2805
    move-object/from16 v12, v42

    .line 2806
    .line 2807
    move-object/from16 v2, v51

    .line 2808
    .line 2809
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2810
    .line 2811
    .line 2812
    new-instance v51, Ldefpackage/oq4;

    .line 2813
    .line 2814
    const-string v54, "rg_base_gain"

    .line 2815
    .line 2816
    const-string v55, "REAL"

    .line 2817
    .line 2818
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2819
    .line 2820
    .line 2821
    move-object/from16 v12, v43

    .line 2822
    .line 2823
    move-object/from16 v2, v51

    .line 2824
    .line 2825
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2826
    .line 2827
    .line 2828
    new-instance v51, Ldefpackage/oq4;

    .line 2829
    .line 2830
    const-string v54, "rg_fallback_gain"

    .line 2831
    .line 2832
    const-string v55, "REAL"

    .line 2833
    .line 2834
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2835
    .line 2836
    .line 2837
    move-object/from16 v12, v45

    .line 2838
    .line 2839
    move-object/from16 v2, v51

    .line 2840
    .line 2841
    const/4 v15, 0x0

    .line 2842
    invoke-static {v1, v12, v2, v15}, Ldefpackage/f34;->k(Ljava/util/HashMap;Ljava/lang/String;Ldefpackage/oq4;I)Ljava/util/HashSet;

    .line 2843
    .line 2844
    .line 2845
    move-result-object v2

    .line 2846
    new-instance v12, Ljava/util/HashSet;

    .line 2847
    .line 2848
    invoke-direct {v12, v15}, Ljava/util/HashSet;-><init>(I)V

    .line 2849
    .line 2850
    .line 2851
    new-instance v15, Ldefpackage/rq4;

    .line 2852
    .line 2853
    const-string v13, "chronology"

    .line 2854
    .line 2855
    invoke-direct {v15, v13, v1, v2, v12}, Ldefpackage/rq4;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    .line 2856
    .line 2857
    .line 2858
    invoke-static {v0, v13}, Ldefpackage/rq4;->b(Ldefpackage/x34;Ljava/lang/String;)Ldefpackage/rq4;

    .line 2859
    .line 2860
    .line 2861
    move-result-object v1

    .line 2862
    invoke-virtual {v15, v1}, Ldefpackage/rq4;->equals(Ljava/lang/Object;)Z

    .line 2863
    .line 2864
    .line 2865
    move-result v2

    .line 2866
    if-nez v2, :cond_4

    .line 2867
    .line 2868
    new-instance v0, Ldefpackage/u24;

    .line 2869
    .line 2870
    const-string v2, "chronology(com.eddyizm.tempus.model.Chronology).\n Expected:\n"

    .line 2871
    .line 2872
    invoke-static {v2, v15, v14, v1}, Ldefpackage/f34;->g(Ljava/lang/String;Ldefpackage/rq4;Ljava/lang/String;Ldefpackage/rq4;)Ljava/lang/String;

    .line 2873
    .line 2874
    .line 2875
    move-result-object v1

    .line 2876
    const/4 v2, 0x0

    .line 2877
    invoke-direct {v0, v2, v1}, Ldefpackage/u24;-><init>(ZLjava/lang/String;)V

    .line 2878
    .line 2879
    .line 2880
    return-object v0

    .line 2881
    :cond_4
    new-instance v1, Ljava/util/HashMap;

    .line 2882
    .line 2883
    const/4 v2, 0x5

    .line 2884
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 2885
    .line 2886
    .line 2887
    new-instance v51, Ldefpackage/oq4;

    .line 2888
    .line 2889
    const/16 v56, 0x0

    .line 2890
    .line 2891
    const/16 v53, 0x1

    .line 2892
    .line 2893
    const/16 v52, 0x1

    .line 2894
    .line 2895
    const-string v54, "timestamp"

    .line 2896
    .line 2897
    const-string v55, "INTEGER"

    .line 2898
    .line 2899
    const/16 v57, 0x1

    .line 2900
    .line 2901
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2902
    .line 2903
    .line 2904
    move-object/from16 v2, v51

    .line 2905
    .line 2906
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2907
    .line 2908
    .line 2909
    new-instance v51, Ldefpackage/oq4;

    .line 2910
    .line 2911
    const/16 v52, 0x0

    .line 2912
    .line 2913
    const-string v54, "songId"

    .line 2914
    .line 2915
    const-string v55, "TEXT"

    .line 2916
    .line 2917
    const/16 v57, 0x0

    .line 2918
    .line 2919
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2920
    .line 2921
    .line 2922
    move-object/from16 v2, v51

    .line 2923
    .line 2924
    const-string v12, "songId"

    .line 2925
    .line 2926
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2927
    .line 2928
    .line 2929
    new-instance v51, Ldefpackage/oq4;

    .line 2930
    .line 2931
    const-string v54, "albumId"

    .line 2932
    .line 2933
    const-string v55, "TEXT"

    .line 2934
    .line 2935
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2936
    .line 2937
    .line 2938
    move-object/from16 v2, v51

    .line 2939
    .line 2940
    const-string v12, "albumId"

    .line 2941
    .line 2942
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2943
    .line 2944
    .line 2945
    new-instance v51, Ldefpackage/oq4;

    .line 2946
    .line 2947
    const-string v54, "artistId"

    .line 2948
    .line 2949
    const-string v55, "TEXT"

    .line 2950
    .line 2951
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2952
    .line 2953
    .line 2954
    move-object/from16 v2, v51

    .line 2955
    .line 2956
    const-string v12, "artistId"

    .line 2957
    .line 2958
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2959
    .line 2960
    .line 2961
    new-instance v51, Ldefpackage/oq4;

    .line 2962
    .line 2963
    const-string v54, "toStar"

    .line 2964
    .line 2965
    const-string v55, "INTEGER"

    .line 2966
    .line 2967
    const/16 v57, 0x1

    .line 2968
    .line 2969
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 2970
    .line 2971
    .line 2972
    move-object/from16 v2, v51

    .line 2973
    .line 2974
    const-string v12, "toStar"

    .line 2975
    .line 2976
    const/4 v15, 0x0

    .line 2977
    invoke-static {v1, v12, v2, v15}, Ldefpackage/f34;->k(Ljava/util/HashMap;Ljava/lang/String;Ldefpackage/oq4;I)Ljava/util/HashSet;

    .line 2978
    .line 2979
    .line 2980
    move-result-object v2

    .line 2981
    new-instance v12, Ljava/util/HashSet;

    .line 2982
    .line 2983
    invoke-direct {v12, v15}, Ljava/util/HashSet;-><init>(I)V

    .line 2984
    .line 2985
    .line 2986
    new-instance v13, Ldefpackage/rq4;

    .line 2987
    .line 2988
    const-string v15, "favorite"

    .line 2989
    .line 2990
    invoke-direct {v13, v15, v1, v2, v12}, Ldefpackage/rq4;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    .line 2991
    .line 2992
    .line 2993
    invoke-static {v0, v15}, Ldefpackage/rq4;->b(Ldefpackage/x34;Ljava/lang/String;)Ldefpackage/rq4;

    .line 2994
    .line 2995
    .line 2996
    move-result-object v1

    .line 2997
    invoke-virtual {v13, v1}, Ldefpackage/rq4;->equals(Ljava/lang/Object;)Z

    .line 2998
    .line 2999
    .line 3000
    move-result v2

    .line 3001
    if-nez v2, :cond_5

    .line 3002
    .line 3003
    new-instance v0, Ldefpackage/u24;

    .line 3004
    .line 3005
    const-string v2, "favorite(com.eddyizm.tempus.model.Favorite).\n Expected:\n"

    .line 3006
    .line 3007
    invoke-static {v2, v13, v14, v1}, Ldefpackage/f34;->g(Ljava/lang/String;Ldefpackage/rq4;Ljava/lang/String;Ldefpackage/rq4;)Ljava/lang/String;

    .line 3008
    .line 3009
    .line 3010
    move-result-object v1

    .line 3011
    const/4 v2, 0x0

    .line 3012
    invoke-direct {v0, v2, v1}, Ldefpackage/u24;-><init>(ZLjava/lang/String;)V

    .line 3013
    .line 3014
    .line 3015
    return-object v0

    .line 3016
    :cond_5
    new-instance v1, Ljava/util/HashMap;

    .line 3017
    .line 3018
    const/16 v2, 0x29

    .line 3019
    .line 3020
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 3021
    .line 3022
    .line 3023
    new-instance v51, Ldefpackage/oq4;

    .line 3024
    .line 3025
    const/16 v56, 0x0

    .line 3026
    .line 3027
    const/16 v53, 0x1

    .line 3028
    .line 3029
    const/16 v57, 0x1

    .line 3030
    .line 3031
    const/16 v52, 0x1

    .line 3032
    .line 3033
    const-string v54, "index"

    .line 3034
    .line 3035
    const-string v55, "INTEGER"

    .line 3036
    .line 3037
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3038
    .line 3039
    .line 3040
    move-object/from16 v2, v51

    .line 3041
    .line 3042
    const-string v12, "index"

    .line 3043
    .line 3044
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3045
    .line 3046
    .line 3047
    new-instance v51, Ldefpackage/oq4;

    .line 3048
    .line 3049
    const/16 v57, 0x0

    .line 3050
    .line 3051
    const/16 v52, 0x0

    .line 3052
    .line 3053
    const-string v54, "id"

    .line 3054
    .line 3055
    const-string v55, "TEXT"

    .line 3056
    .line 3057
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3058
    .line 3059
    .line 3060
    move-object/from16 v2, v51

    .line 3061
    .line 3062
    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3063
    .line 3064
    .line 3065
    new-instance v51, Ldefpackage/oq4;

    .line 3066
    .line 3067
    const-string v54, "parent_id"

    .line 3068
    .line 3069
    const-string v55, "TEXT"

    .line 3070
    .line 3071
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3072
    .line 3073
    .line 3074
    move-object/from16 v2, v51

    .line 3075
    .line 3076
    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3077
    .line 3078
    .line 3079
    new-instance v51, Ldefpackage/oq4;

    .line 3080
    .line 3081
    const/16 v57, 0x1

    .line 3082
    .line 3083
    const-string v54, "is_dir"

    .line 3084
    .line 3085
    const-string v55, "INTEGER"

    .line 3086
    .line 3087
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3088
    .line 3089
    .line 3090
    move-object/from16 v2, v51

    .line 3091
    .line 3092
    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3093
    .line 3094
    .line 3095
    new-instance v51, Ldefpackage/oq4;

    .line 3096
    .line 3097
    const/16 v57, 0x0

    .line 3098
    .line 3099
    const-string v54, "title"

    .line 3100
    .line 3101
    const-string v55, "TEXT"

    .line 3102
    .line 3103
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3104
    .line 3105
    .line 3106
    move-object/from16 v2, v51

    .line 3107
    .line 3108
    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3109
    .line 3110
    .line 3111
    new-instance v51, Ldefpackage/oq4;

    .line 3112
    .line 3113
    const-string v54, "album"

    .line 3114
    .line 3115
    const-string v55, "TEXT"

    .line 3116
    .line 3117
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3118
    .line 3119
    .line 3120
    move-object/from16 v2, v51

    .line 3121
    .line 3122
    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3123
    .line 3124
    .line 3125
    new-instance v51, Ldefpackage/oq4;

    .line 3126
    .line 3127
    const-string v54, "artist"

    .line 3128
    .line 3129
    const-string v55, "TEXT"

    .line 3130
    .line 3131
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3132
    .line 3133
    .line 3134
    move-object/from16 v2, v51

    .line 3135
    .line 3136
    invoke-virtual {v1, v9, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3137
    .line 3138
    .line 3139
    new-instance v51, Ldefpackage/oq4;

    .line 3140
    .line 3141
    const-string v54, "track"

    .line 3142
    .line 3143
    const-string v55, "INTEGER"

    .line 3144
    .line 3145
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3146
    .line 3147
    .line 3148
    move-object/from16 v2, v51

    .line 3149
    .line 3150
    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3151
    .line 3152
    .line 3153
    new-instance v51, Ldefpackage/oq4;

    .line 3154
    .line 3155
    const-string v54, "year"

    .line 3156
    .line 3157
    const-string v55, "INTEGER"

    .line 3158
    .line 3159
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3160
    .line 3161
    .line 3162
    move-object/from16 v2, v51

    .line 3163
    .line 3164
    invoke-virtual {v1, v11, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3165
    .line 3166
    .line 3167
    new-instance v51, Ldefpackage/oq4;

    .line 3168
    .line 3169
    const-string v54, "genre"

    .line 3170
    .line 3171
    const-string v55, "TEXT"

    .line 3172
    .line 3173
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3174
    .line 3175
    .line 3176
    move-object/from16 v13, v49

    .line 3177
    .line 3178
    move-object/from16 v2, v51

    .line 3179
    .line 3180
    invoke-virtual {v1, v13, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3181
    .line 3182
    .line 3183
    new-instance v51, Ldefpackage/oq4;

    .line 3184
    .line 3185
    const-string v54, "cover_art_id"

    .line 3186
    .line 3187
    const-string v55, "TEXT"

    .line 3188
    .line 3189
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3190
    .line 3191
    .line 3192
    move-object/from16 v15, v48

    .line 3193
    .line 3194
    move-object/from16 v2, v51

    .line 3195
    .line 3196
    invoke-virtual {v1, v15, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3197
    .line 3198
    .line 3199
    new-instance v51, Ldefpackage/oq4;

    .line 3200
    .line 3201
    const-string v54, "size"

    .line 3202
    .line 3203
    const-string v55, "INTEGER"

    .line 3204
    .line 3205
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3206
    .line 3207
    .line 3208
    move-object/from16 v12, v47

    .line 3209
    .line 3210
    move-object/from16 v2, v51

    .line 3211
    .line 3212
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3213
    .line 3214
    .line 3215
    new-instance v51, Ldefpackage/oq4;

    .line 3216
    .line 3217
    const-string v54, "content_type"

    .line 3218
    .line 3219
    const-string v55, "TEXT"

    .line 3220
    .line 3221
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3222
    .line 3223
    .line 3224
    move-object/from16 v12, v44

    .line 3225
    .line 3226
    move-object/from16 v2, v51

    .line 3227
    .line 3228
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3229
    .line 3230
    .line 3231
    new-instance v51, Ldefpackage/oq4;

    .line 3232
    .line 3233
    const-string v54, "suffix"

    .line 3234
    .line 3235
    const-string v55, "TEXT"

    .line 3236
    .line 3237
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3238
    .line 3239
    .line 3240
    move-object/from16 v12, v17

    .line 3241
    .line 3242
    move-object/from16 v2, v51

    .line 3243
    .line 3244
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3245
    .line 3246
    .line 3247
    new-instance v51, Ldefpackage/oq4;

    .line 3248
    .line 3249
    const-string v54, "transcoding_content_type"

    .line 3250
    .line 3251
    const-string v55, "TEXT"

    .line 3252
    .line 3253
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3254
    .line 3255
    .line 3256
    move-object/from16 v12, v18

    .line 3257
    .line 3258
    move-object/from16 v2, v51

    .line 3259
    .line 3260
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3261
    .line 3262
    .line 3263
    new-instance v51, Ldefpackage/oq4;

    .line 3264
    .line 3265
    const-string v54, "transcoded_suffix"

    .line 3266
    .line 3267
    const-string v55, "TEXT"

    .line 3268
    .line 3269
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3270
    .line 3271
    .line 3272
    move-object/from16 v12, v19

    .line 3273
    .line 3274
    move-object/from16 v2, v51

    .line 3275
    .line 3276
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3277
    .line 3278
    .line 3279
    new-instance v51, Ldefpackage/oq4;

    .line 3280
    .line 3281
    const-string v54, "duration"

    .line 3282
    .line 3283
    const-string v55, "INTEGER"

    .line 3284
    .line 3285
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3286
    .line 3287
    .line 3288
    move-object/from16 v12, v20

    .line 3289
    .line 3290
    move-object/from16 v2, v51

    .line 3291
    .line 3292
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3293
    .line 3294
    .line 3295
    new-instance v51, Ldefpackage/oq4;

    .line 3296
    .line 3297
    const-string v54, "bitrate"

    .line 3298
    .line 3299
    const-string v55, "INTEGER"

    .line 3300
    .line 3301
    invoke-direct/range {v51 .. v57}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3302
    .line 3303
    .line 3304
    move-object/from16 v5, v21

    .line 3305
    .line 3306
    move-object/from16 v2, v51

    .line 3307
    .line 3308
    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3309
    .line 3310
    .line 3311
    new-instance v17, Ldefpackage/oq4;

    .line 3312
    .line 3313
    const/16 v22, 0x0

    .line 3314
    .line 3315
    const/16 v19, 0x1

    .line 3316
    .line 3317
    const/16 v23, 0x0

    .line 3318
    .line 3319
    const/16 v18, 0x0

    .line 3320
    .line 3321
    const-string v20, "path"

    .line 3322
    .line 3323
    const-string v21, "TEXT"

    .line 3324
    .line 3325
    invoke-direct/range {v17 .. v23}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3326
    .line 3327
    .line 3328
    move-object/from16 v2, v17

    .line 3329
    .line 3330
    move-object/from16 v5, v24

    .line 3331
    .line 3332
    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3333
    .line 3334
    .line 3335
    new-instance v17, Ldefpackage/oq4;

    .line 3336
    .line 3337
    const/16 v23, 0x1

    .line 3338
    .line 3339
    const-string v20, "is_video"

    .line 3340
    .line 3341
    const-string v21, "INTEGER"

    .line 3342
    .line 3343
    invoke-direct/range {v17 .. v23}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3344
    .line 3345
    .line 3346
    move-object/from16 v2, v17

    .line 3347
    .line 3348
    move-object/from16 v5, v25

    .line 3349
    .line 3350
    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3351
    .line 3352
    .line 3353
    new-instance v17, Ldefpackage/oq4;

    .line 3354
    .line 3355
    const/16 v23, 0x0

    .line 3356
    .line 3357
    const-string v20, "user_rating"

    .line 3358
    .line 3359
    const-string v21, "INTEGER"

    .line 3360
    .line 3361
    invoke-direct/range {v17 .. v23}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3362
    .line 3363
    .line 3364
    move-object/from16 v2, v17

    .line 3365
    .line 3366
    move-object/from16 v5, v26

    .line 3367
    .line 3368
    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3369
    .line 3370
    .line 3371
    new-instance v17, Ldefpackage/oq4;

    .line 3372
    .line 3373
    const-string v20, "average_rating"

    .line 3374
    .line 3375
    const-string v21, "REAL"

    .line 3376
    .line 3377
    invoke-direct/range {v17 .. v23}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3378
    .line 3379
    .line 3380
    move-object/from16 v2, v17

    .line 3381
    .line 3382
    move-object/from16 v5, v27

    .line 3383
    .line 3384
    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3385
    .line 3386
    .line 3387
    new-instance v17, Ldefpackage/oq4;

    .line 3388
    .line 3389
    const-string v20, "play_count"

    .line 3390
    .line 3391
    const-string v21, "INTEGER"

    .line 3392
    .line 3393
    invoke-direct/range {v17 .. v23}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3394
    .line 3395
    .line 3396
    move-object/from16 v2, v17

    .line 3397
    .line 3398
    move-object/from16 v5, v28

    .line 3399
    .line 3400
    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3401
    .line 3402
    .line 3403
    new-instance v17, Ldefpackage/oq4;

    .line 3404
    .line 3405
    const-string v20, "disc_number"

    .line 3406
    .line 3407
    const-string v21, "INTEGER"

    .line 3408
    .line 3409
    invoke-direct/range {v17 .. v23}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3410
    .line 3411
    .line 3412
    move-object/from16 v2, v17

    .line 3413
    .line 3414
    move-object/from16 v5, v29

    .line 3415
    .line 3416
    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3417
    .line 3418
    .line 3419
    new-instance v17, Ldefpackage/oq4;

    .line 3420
    .line 3421
    const-string v20, "created"

    .line 3422
    .line 3423
    const-string v21, "INTEGER"

    .line 3424
    .line 3425
    invoke-direct/range {v17 .. v23}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3426
    .line 3427
    .line 3428
    move-object/from16 v2, v17

    .line 3429
    .line 3430
    move-object/from16 v5, v30

    .line 3431
    .line 3432
    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3433
    .line 3434
    .line 3435
    new-instance v17, Ldefpackage/oq4;

    .line 3436
    .line 3437
    const-string v20, "starred"

    .line 3438
    .line 3439
    const-string v21, "INTEGER"

    .line 3440
    .line 3441
    invoke-direct/range {v17 .. v23}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3442
    .line 3443
    .line 3444
    move-object/from16 v2, v17

    .line 3445
    .line 3446
    move-object/from16 v6, v31

    .line 3447
    .line 3448
    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3449
    .line 3450
    .line 3451
    new-instance v17, Ldefpackage/oq4;

    .line 3452
    .line 3453
    const-string v20, "album_id"

    .line 3454
    .line 3455
    const-string v21, "TEXT"

    .line 3456
    .line 3457
    invoke-direct/range {v17 .. v23}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3458
    .line 3459
    .line 3460
    move-object/from16 v2, v17

    .line 3461
    .line 3462
    move-object/from16 v6, v32

    .line 3463
    .line 3464
    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3465
    .line 3466
    .line 3467
    new-instance v17, Ldefpackage/oq4;

    .line 3468
    .line 3469
    const-string v20, "artist_id"

    .line 3470
    .line 3471
    const-string v21, "TEXT"

    .line 3472
    .line 3473
    invoke-direct/range {v17 .. v23}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3474
    .line 3475
    .line 3476
    move-object/from16 v2, v17

    .line 3477
    .line 3478
    move-object/from16 v11, v33

    .line 3479
    .line 3480
    invoke-virtual {v1, v11, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3481
    .line 3482
    .line 3483
    new-instance v17, Ldefpackage/oq4;

    .line 3484
    .line 3485
    const-string v20, "type"

    .line 3486
    .line 3487
    const-string v21, "TEXT"

    .line 3488
    .line 3489
    invoke-direct/range {v17 .. v23}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3490
    .line 3491
    .line 3492
    move-object/from16 v2, v17

    .line 3493
    .line 3494
    move-object/from16 v13, v34

    .line 3495
    .line 3496
    invoke-virtual {v1, v13, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3497
    .line 3498
    .line 3499
    new-instance v17, Ldefpackage/oq4;

    .line 3500
    .line 3501
    const-string v20, "bookmark_position"

    .line 3502
    .line 3503
    const-string v21, "INTEGER"

    .line 3504
    .line 3505
    invoke-direct/range {v17 .. v23}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3506
    .line 3507
    .line 3508
    move-object/from16 v2, v17

    .line 3509
    .line 3510
    move-object/from16 v13, v35

    .line 3511
    .line 3512
    invoke-virtual {v1, v13, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3513
    .line 3514
    .line 3515
    new-instance v17, Ldefpackage/oq4;

    .line 3516
    .line 3517
    const-string v20, "original_width"

    .line 3518
    .line 3519
    const-string v21, "INTEGER"

    .line 3520
    .line 3521
    invoke-direct/range {v17 .. v23}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3522
    .line 3523
    .line 3524
    move-object/from16 v2, v17

    .line 3525
    .line 3526
    move-object/from16 v13, v36

    .line 3527
    .line 3528
    invoke-virtual {v1, v13, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3529
    .line 3530
    .line 3531
    new-instance v17, Ldefpackage/oq4;

    .line 3532
    .line 3533
    const-string v20, "original_height"

    .line 3534
    .line 3535
    const-string v21, "INTEGER"

    .line 3536
    .line 3537
    invoke-direct/range {v17 .. v23}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3538
    .line 3539
    .line 3540
    move-object/from16 v2, v17

    .line 3541
    .line 3542
    move-object/from16 v13, v37

    .line 3543
    .line 3544
    invoke-virtual {v1, v13, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3545
    .line 3546
    .line 3547
    new-instance v17, Ldefpackage/oq4;

    .line 3548
    .line 3549
    const-string v20, "stream_id"

    .line 3550
    .line 3551
    const-string v21, "TEXT"

    .line 3552
    .line 3553
    invoke-direct/range {v17 .. v23}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3554
    .line 3555
    .line 3556
    move-object/from16 v13, v16

    .line 3557
    .line 3558
    move-object/from16 v2, v17

    .line 3559
    .line 3560
    invoke-virtual {v1, v13, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3561
    .line 3562
    .line 3563
    new-instance v16, Ldefpackage/oq4;

    .line 3564
    .line 3565
    const/16 v21, 0x0

    .line 3566
    .line 3567
    const/16 v18, 0x1

    .line 3568
    .line 3569
    const/16 v22, 0x0

    .line 3570
    .line 3571
    const/16 v17, 0x0

    .line 3572
    .line 3573
    const-string v19, "stream_url"

    .line 3574
    .line 3575
    const-string v20, "TEXT"

    .line 3576
    .line 3577
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3578
    .line 3579
    .line 3580
    move-object/from16 v2, v16

    .line 3581
    .line 3582
    const-string v13, "stream_url"

    .line 3583
    .line 3584
    invoke-virtual {v1, v13, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3585
    .line 3586
    .line 3587
    new-instance v16, Ldefpackage/oq4;

    .line 3588
    .line 3589
    const-string v19, "timestamp"

    .line 3590
    .line 3591
    const-string v20, "INTEGER"

    .line 3592
    .line 3593
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3594
    .line 3595
    .line 3596
    move-object/from16 v2, v16

    .line 3597
    .line 3598
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3599
    .line 3600
    .line 3601
    new-instance v16, Ldefpackage/oq4;

    .line 3602
    .line 3603
    const-string v19, "rg_track_gain"

    .line 3604
    .line 3605
    const-string v20, "REAL"

    .line 3606
    .line 3607
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3608
    .line 3609
    .line 3610
    move-object/from16 v2, v16

    .line 3611
    .line 3612
    move-object/from16 v3, v39

    .line 3613
    .line 3614
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3615
    .line 3616
    .line 3617
    new-instance v16, Ldefpackage/oq4;

    .line 3618
    .line 3619
    const-string v19, "rg_album_gain"

    .line 3620
    .line 3621
    const-string v20, "REAL"

    .line 3622
    .line 3623
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3624
    .line 3625
    .line 3626
    move-object/from16 v2, v16

    .line 3627
    .line 3628
    move-object/from16 v3, v40

    .line 3629
    .line 3630
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3631
    .line 3632
    .line 3633
    new-instance v16, Ldefpackage/oq4;

    .line 3634
    .line 3635
    const-string v19, "rg_track_peak"

    .line 3636
    .line 3637
    const-string v20, "REAL"

    .line 3638
    .line 3639
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3640
    .line 3641
    .line 3642
    move-object/from16 v2, v16

    .line 3643
    .line 3644
    move-object/from16 v3, v41

    .line 3645
    .line 3646
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3647
    .line 3648
    .line 3649
    new-instance v16, Ldefpackage/oq4;

    .line 3650
    .line 3651
    const-string v19, "rg_album_peak"

    .line 3652
    .line 3653
    const-string v20, "REAL"

    .line 3654
    .line 3655
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3656
    .line 3657
    .line 3658
    move-object/from16 v2, v16

    .line 3659
    .line 3660
    move-object/from16 v3, v42

    .line 3661
    .line 3662
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3663
    .line 3664
    .line 3665
    new-instance v16, Ldefpackage/oq4;

    .line 3666
    .line 3667
    const-string v19, "rg_base_gain"

    .line 3668
    .line 3669
    const-string v20, "REAL"

    .line 3670
    .line 3671
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3672
    .line 3673
    .line 3674
    move-object/from16 v2, v16

    .line 3675
    .line 3676
    move-object/from16 v3, v43

    .line 3677
    .line 3678
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3679
    .line 3680
    .line 3681
    new-instance v16, Ldefpackage/oq4;

    .line 3682
    .line 3683
    const-string v19, "rg_fallback_gain"

    .line 3684
    .line 3685
    const-string v20, "REAL"

    .line 3686
    .line 3687
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3688
    .line 3689
    .line 3690
    move-object/from16 v2, v16

    .line 3691
    .line 3692
    move-object/from16 v3, v45

    .line 3693
    .line 3694
    const/4 v11, 0x0

    .line 3695
    invoke-static {v1, v3, v2, v11}, Ldefpackage/f34;->k(Ljava/util/HashMap;Ljava/lang/String;Ldefpackage/oq4;I)Ljava/util/HashSet;

    .line 3696
    .line 3697
    .line 3698
    move-result-object v2

    .line 3699
    new-instance v3, Ljava/util/HashSet;

    .line 3700
    .line 3701
    invoke-direct {v3, v11}, Ljava/util/HashSet;-><init>(I)V

    .line 3702
    .line 3703
    .line 3704
    new-instance v11, Ldefpackage/rq4;

    .line 3705
    .line 3706
    const-string v6, "session_media_item"

    .line 3707
    .line 3708
    invoke-direct {v11, v6, v1, v2, v3}, Ldefpackage/rq4;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    .line 3709
    .line 3710
    .line 3711
    invoke-static {v0, v6}, Ldefpackage/rq4;->b(Ldefpackage/x34;Ljava/lang/String;)Ldefpackage/rq4;

    .line 3712
    .line 3713
    .line 3714
    move-result-object v1

    .line 3715
    invoke-virtual {v11, v1}, Ldefpackage/rq4;->equals(Ljava/lang/Object;)Z

    .line 3716
    .line 3717
    .line 3718
    move-result v2

    .line 3719
    if-nez v2, :cond_6

    .line 3720
    .line 3721
    new-instance v0, Ldefpackage/u24;

    .line 3722
    .line 3723
    const-string v2, "session_media_item(com.eddyizm.tempus.model.SessionMediaItem).\n Expected:\n"

    .line 3724
    .line 3725
    invoke-static {v2, v11, v14, v1}, Ldefpackage/f34;->g(Ljava/lang/String;Ldefpackage/rq4;Ljava/lang/String;Ldefpackage/rq4;)Ljava/lang/String;

    .line 3726
    .line 3727
    .line 3728
    move-result-object v1

    .line 3729
    const/4 v2, 0x0

    .line 3730
    invoke-direct {v0, v2, v1}, Ldefpackage/u24;-><init>(ZLjava/lang/String;)V

    .line 3731
    .line 3732
    .line 3733
    return-object v0

    .line 3734
    :cond_6
    new-instance v1, Ljava/util/HashMap;

    .line 3735
    .line 3736
    const/16 v2, 0xc

    .line 3737
    .line 3738
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 3739
    .line 3740
    .line 3741
    new-instance v16, Ldefpackage/oq4;

    .line 3742
    .line 3743
    const/16 v21, 0x0

    .line 3744
    .line 3745
    const/16 v18, 0x1

    .line 3746
    .line 3747
    const/16 v22, 0x1

    .line 3748
    .line 3749
    const/16 v17, 0x1

    .line 3750
    .line 3751
    const-string v19, "id"

    .line 3752
    .line 3753
    const-string v20, "TEXT"

    .line 3754
    .line 3755
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3756
    .line 3757
    .line 3758
    move-object/from16 v2, v16

    .line 3759
    .line 3760
    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3761
    .line 3762
    .line 3763
    new-instance v16, Ldefpackage/oq4;

    .line 3764
    .line 3765
    const/16 v22, 0x0

    .line 3766
    .line 3767
    const/16 v17, 0x0

    .line 3768
    .line 3769
    const-string v19, "name"

    .line 3770
    .line 3771
    const-string v20, "TEXT"

    .line 3772
    .line 3773
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3774
    .line 3775
    .line 3776
    move-object/from16 v2, v16

    .line 3777
    .line 3778
    const-string v3, "name"

    .line 3779
    .line 3780
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3781
    .line 3782
    .line 3783
    new-instance v16, Ldefpackage/oq4;

    .line 3784
    .line 3785
    const/16 v22, 0x1

    .line 3786
    .line 3787
    const-string v19, "duration"

    .line 3788
    .line 3789
    const-string v20, "INTEGER"

    .line 3790
    .line 3791
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3792
    .line 3793
    .line 3794
    move-object/from16 v2, v16

    .line 3795
    .line 3796
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3797
    .line 3798
    .line 3799
    new-instance v16, Ldefpackage/oq4;

    .line 3800
    .line 3801
    const/16 v22, 0x0

    .line 3802
    .line 3803
    const-string v19, "coverArt"

    .line 3804
    .line 3805
    const-string v20, "TEXT"

    .line 3806
    .line 3807
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3808
    .line 3809
    .line 3810
    move-object/from16 v2, v16

    .line 3811
    .line 3812
    const-string v6, "coverArt"

    .line 3813
    .line 3814
    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3815
    .line 3816
    .line 3817
    new-instance v16, Ldefpackage/oq4;

    .line 3818
    .line 3819
    const-string v19, "comment"

    .line 3820
    .line 3821
    const-string v20, "TEXT"

    .line 3822
    .line 3823
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3824
    .line 3825
    .line 3826
    move-object/from16 v2, v16

    .line 3827
    .line 3828
    const-string v6, "comment"

    .line 3829
    .line 3830
    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3831
    .line 3832
    .line 3833
    new-instance v16, Ldefpackage/oq4;

    .line 3834
    .line 3835
    const-string v19, "owner"

    .line 3836
    .line 3837
    const-string v20, "TEXT"

    .line 3838
    .line 3839
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3840
    .line 3841
    .line 3842
    move-object/from16 v2, v16

    .line 3843
    .line 3844
    const-string v6, "owner"

    .line 3845
    .line 3846
    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3847
    .line 3848
    .line 3849
    new-instance v16, Ldefpackage/oq4;

    .line 3850
    .line 3851
    const-string v19, "isUniversal"

    .line 3852
    .line 3853
    const-string v20, "INTEGER"

    .line 3854
    .line 3855
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3856
    .line 3857
    .line 3858
    move-object/from16 v2, v16

    .line 3859
    .line 3860
    const-string v6, "isUniversal"

    .line 3861
    .line 3862
    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3863
    .line 3864
    .line 3865
    new-instance v16, Ldefpackage/oq4;

    .line 3866
    .line 3867
    const-string v21, "0"

    .line 3868
    .line 3869
    const/16 v22, 0x1

    .line 3870
    .line 3871
    const-string v19, "songCount"

    .line 3872
    .line 3873
    const-string v20, "INTEGER"

    .line 3874
    .line 3875
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3876
    .line 3877
    .line 3878
    move-object/from16 v2, v16

    .line 3879
    .line 3880
    const-string v6, "songCount"

    .line 3881
    .line 3882
    invoke-virtual {v1, v6, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3883
    .line 3884
    .line 3885
    new-instance v16, Ldefpackage/oq4;

    .line 3886
    .line 3887
    const/16 v21, 0x0

    .line 3888
    .line 3889
    const/16 v22, 0x0

    .line 3890
    .line 3891
    const-string v19, "created"

    .line 3892
    .line 3893
    const-string v20, "INTEGER"

    .line 3894
    .line 3895
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3896
    .line 3897
    .line 3898
    move-object/from16 v2, v16

    .line 3899
    .line 3900
    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3901
    .line 3902
    .line 3903
    new-instance v16, Ldefpackage/oq4;

    .line 3904
    .line 3905
    const-string v19, "changed"

    .line 3906
    .line 3907
    const-string v20, "INTEGER"

    .line 3908
    .line 3909
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3910
    .line 3911
    .line 3912
    move-object/from16 v2, v16

    .line 3913
    .line 3914
    const-string v5, "changed"

    .line 3915
    .line 3916
    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3917
    .line 3918
    .line 3919
    new-instance v16, Ldefpackage/oq4;

    .line 3920
    .line 3921
    const-string v21, "0"

    .line 3922
    .line 3923
    const/16 v22, 0x1

    .line 3924
    .line 3925
    const-string v19, "lastPlayed"

    .line 3926
    .line 3927
    const-string v20, "INTEGER"

    .line 3928
    .line 3929
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3930
    .line 3931
    .line 3932
    move-object/from16 v2, v16

    .line 3933
    .line 3934
    const-string v5, "lastPlayed"

    .line 3935
    .line 3936
    invoke-virtual {v1, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3937
    .line 3938
    .line 3939
    new-instance v16, Ldefpackage/oq4;

    .line 3940
    .line 3941
    const/16 v21, 0x0

    .line 3942
    .line 3943
    const/16 v22, 0x0

    .line 3944
    .line 3945
    const-string v19, "allowedUsers"

    .line 3946
    .line 3947
    const-string v20, "TEXT"

    .line 3948
    .line 3949
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 3950
    .line 3951
    .line 3952
    move-object/from16 v2, v16

    .line 3953
    .line 3954
    const-string v5, "allowedUsers"

    .line 3955
    .line 3956
    const/4 v11, 0x0

    .line 3957
    invoke-static {v1, v5, v2, v11}, Ldefpackage/f34;->k(Ljava/util/HashMap;Ljava/lang/String;Ldefpackage/oq4;I)Ljava/util/HashSet;

    .line 3958
    .line 3959
    .line 3960
    move-result-object v2

    .line 3961
    new-instance v5, Ljava/util/HashSet;

    .line 3962
    .line 3963
    invoke-direct {v5, v11}, Ljava/util/HashSet;-><init>(I)V

    .line 3964
    .line 3965
    .line 3966
    new-instance v6, Ldefpackage/rq4;

    .line 3967
    .line 3968
    const-string v11, "playlist"

    .line 3969
    .line 3970
    invoke-direct {v6, v11, v1, v2, v5}, Ldefpackage/rq4;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    .line 3971
    .line 3972
    .line 3973
    invoke-static {v0, v11}, Ldefpackage/rq4;->b(Ldefpackage/x34;Ljava/lang/String;)Ldefpackage/rq4;

    .line 3974
    .line 3975
    .line 3976
    move-result-object v1

    .line 3977
    invoke-virtual {v6, v1}, Ldefpackage/rq4;->equals(Ljava/lang/Object;)Z

    .line 3978
    .line 3979
    .line 3980
    move-result v2

    .line 3981
    if-nez v2, :cond_7

    .line 3982
    .line 3983
    new-instance v0, Ldefpackage/u24;

    .line 3984
    .line 3985
    const-string v2, "playlist(com.eddyizm.tempus.subsonic.models.Playlist).\n Expected:\n"

    .line 3986
    .line 3987
    invoke-static {v2, v6, v14, v1}, Ldefpackage/f34;->g(Ljava/lang/String;Ldefpackage/rq4;Ljava/lang/String;Ldefpackage/rq4;)Ljava/lang/String;

    .line 3988
    .line 3989
    .line 3990
    move-result-object v1

    .line 3991
    const/4 v2, 0x0

    .line 3992
    invoke-direct {v0, v2, v1}, Ldefpackage/u24;-><init>(ZLjava/lang/String;)V

    .line 3993
    .line 3994
    .line 3995
    return-object v0

    .line 3996
    :cond_7
    new-instance v1, Ljava/util/HashMap;

    .line 3997
    .line 3998
    const/4 v2, 0x1

    .line 3999
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 4000
    .line 4001
    .line 4002
    new-instance v16, Ldefpackage/oq4;

    .line 4003
    .line 4004
    const/16 v21, 0x0

    .line 4005
    .line 4006
    const/16 v18, 0x1

    .line 4007
    .line 4008
    const/16 v17, 0x1

    .line 4009
    .line 4010
    const-string v19, "playlistId"

    .line 4011
    .line 4012
    const-string v20, "TEXT"

    .line 4013
    .line 4014
    const/16 v22, 0x1

    .line 4015
    .line 4016
    invoke-direct/range {v16 .. v22}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4017
    .line 4018
    .line 4019
    move-object/from16 v5, v16

    .line 4020
    .line 4021
    const-string v6, "playlistId"

    .line 4022
    .line 4023
    const/4 v11, 0x0

    .line 4024
    invoke-static {v1, v6, v5, v11}, Ldefpackage/f34;->k(Ljava/util/HashMap;Ljava/lang/String;Ldefpackage/oq4;I)Ljava/util/HashSet;

    .line 4025
    .line 4026
    .line 4027
    move-result-object v5

    .line 4028
    new-instance v2, Ljava/util/HashSet;

    .line 4029
    .line 4030
    invoke-direct {v2, v11}, Ljava/util/HashSet;-><init>(I)V

    .line 4031
    .line 4032
    .line 4033
    new-instance v11, Ldefpackage/rq4;

    .line 4034
    .line 4035
    move-object/from16 v17, v6

    .line 4036
    .line 4037
    const-string v6, "pinned_playlist"

    .line 4038
    .line 4039
    invoke-direct {v11, v6, v1, v5, v2}, Ldefpackage/rq4;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    .line 4040
    .line 4041
    .line 4042
    invoke-static {v0, v6}, Ldefpackage/rq4;->b(Ldefpackage/x34;Ljava/lang/String;)Ldefpackage/rq4;

    .line 4043
    .line 4044
    .line 4045
    move-result-object v1

    .line 4046
    invoke-virtual {v11, v1}, Ldefpackage/rq4;->equals(Ljava/lang/Object;)Z

    .line 4047
    .line 4048
    .line 4049
    move-result v2

    .line 4050
    if-nez v2, :cond_8

    .line 4051
    .line 4052
    new-instance v0, Ldefpackage/u24;

    .line 4053
    .line 4054
    const-string v2, "pinned_playlist(com.eddyizm.tempus.model.PinnedPlaylist).\n Expected:\n"

    .line 4055
    .line 4056
    invoke-static {v2, v11, v14, v1}, Ldefpackage/f34;->g(Ljava/lang/String;Ldefpackage/rq4;Ljava/lang/String;Ldefpackage/rq4;)Ljava/lang/String;

    .line 4057
    .line 4058
    .line 4059
    move-result-object v1

    .line 4060
    const/4 v2, 0x0

    .line 4061
    invoke-direct {v0, v2, v1}, Ldefpackage/u24;-><init>(ZLjava/lang/String;)V

    .line 4062
    .line 4063
    .line 4064
    return-object v0

    .line 4065
    :cond_8
    new-instance v1, Ljava/util/HashMap;

    .line 4066
    .line 4067
    const/4 v2, 0x6

    .line 4068
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 4069
    .line 4070
    .line 4071
    new-instance v18, Ldefpackage/oq4;

    .line 4072
    .line 4073
    const/16 v23, 0x0

    .line 4074
    .line 4075
    const/16 v20, 0x1

    .line 4076
    .line 4077
    const/16 v19, 0x1

    .line 4078
    .line 4079
    const-string v21, "song_id"

    .line 4080
    .line 4081
    const-string v22, "TEXT"

    .line 4082
    .line 4083
    const/16 v24, 0x1

    .line 4084
    .line 4085
    invoke-direct/range {v18 .. v24}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4086
    .line 4087
    .line 4088
    move-object/from16 v5, v18

    .line 4089
    .line 4090
    const-string v6, "song_id"

    .line 4091
    .line 4092
    invoke-virtual {v1, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4093
    .line 4094
    .line 4095
    new-instance v18, Ldefpackage/oq4;

    .line 4096
    .line 4097
    const/16 v19, 0x0

    .line 4098
    .line 4099
    const-string v21, "artist"

    .line 4100
    .line 4101
    const-string v22, "TEXT"

    .line 4102
    .line 4103
    const/16 v24, 0x0

    .line 4104
    .line 4105
    invoke-direct/range {v18 .. v24}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4106
    .line 4107
    .line 4108
    move-object/from16 v5, v18

    .line 4109
    .line 4110
    invoke-virtual {v1, v9, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4111
    .line 4112
    .line 4113
    new-instance v18, Ldefpackage/oq4;

    .line 4114
    .line 4115
    const-string v21, "title"

    .line 4116
    .line 4117
    const-string v22, "TEXT"

    .line 4118
    .line 4119
    invoke-direct/range {v18 .. v24}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4120
    .line 4121
    .line 4122
    move-object/from16 v5, v18

    .line 4123
    .line 4124
    invoke-virtual {v1, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4125
    .line 4126
    .line 4127
    new-instance v18, Ldefpackage/oq4;

    .line 4128
    .line 4129
    const-string v21, "lyrics"

    .line 4130
    .line 4131
    const-string v22, "TEXT"

    .line 4132
    .line 4133
    invoke-direct/range {v18 .. v24}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4134
    .line 4135
    .line 4136
    move-object/from16 v5, v18

    .line 4137
    .line 4138
    const-string v6, "lyrics"

    .line 4139
    .line 4140
    invoke-virtual {v1, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4141
    .line 4142
    .line 4143
    new-instance v18, Ldefpackage/oq4;

    .line 4144
    .line 4145
    const-string v21, "structured_lyrics"

    .line 4146
    .line 4147
    const-string v22, "TEXT"

    .line 4148
    .line 4149
    invoke-direct/range {v18 .. v24}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4150
    .line 4151
    .line 4152
    move-object/from16 v5, v18

    .line 4153
    .line 4154
    const-string v6, "structured_lyrics"

    .line 4155
    .line 4156
    invoke-virtual {v1, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4157
    .line 4158
    .line 4159
    new-instance v18, Ldefpackage/oq4;

    .line 4160
    .line 4161
    const-string v21, "updated_at"

    .line 4162
    .line 4163
    const-string v22, "INTEGER"

    .line 4164
    .line 4165
    const/16 v24, 0x1

    .line 4166
    .line 4167
    invoke-direct/range {v18 .. v24}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4168
    .line 4169
    .line 4170
    move-object/from16 v5, v18

    .line 4171
    .line 4172
    const-string v6, "updated_at"

    .line 4173
    .line 4174
    const/4 v11, 0x0

    .line 4175
    invoke-static {v1, v6, v5, v11}, Ldefpackage/f34;->k(Ljava/util/HashMap;Ljava/lang/String;Ldefpackage/oq4;I)Ljava/util/HashSet;

    .line 4176
    .line 4177
    .line 4178
    move-result-object v5

    .line 4179
    new-instance v6, Ljava/util/HashSet;

    .line 4180
    .line 4181
    invoke-direct {v6, v11}, Ljava/util/HashSet;-><init>(I)V

    .line 4182
    .line 4183
    .line 4184
    new-instance v2, Ldefpackage/rq4;

    .line 4185
    .line 4186
    const-string v11, "lyrics_cache"

    .line 4187
    .line 4188
    invoke-direct {v2, v11, v1, v5, v6}, Ldefpackage/rq4;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    .line 4189
    .line 4190
    .line 4191
    invoke-static {v0, v11}, Ldefpackage/rq4;->b(Ldefpackage/x34;Ljava/lang/String;)Ldefpackage/rq4;

    .line 4192
    .line 4193
    .line 4194
    move-result-object v1

    .line 4195
    invoke-virtual {v2, v1}, Ldefpackage/rq4;->equals(Ljava/lang/Object;)Z

    .line 4196
    .line 4197
    .line 4198
    move-result v5

    .line 4199
    if-nez v5, :cond_9

    .line 4200
    .line 4201
    new-instance v0, Ldefpackage/u24;

    .line 4202
    .line 4203
    const-string v3, "lyrics_cache(com.eddyizm.tempus.model.LyricsCache).\n Expected:\n"

    .line 4204
    .line 4205
    invoke-static {v3, v2, v14, v1}, Ldefpackage/f34;->g(Ljava/lang/String;Ldefpackage/rq4;Ljava/lang/String;Ldefpackage/rq4;)Ljava/lang/String;

    .line 4206
    .line 4207
    .line 4208
    move-result-object v1

    .line 4209
    const/4 v2, 0x0

    .line 4210
    invoke-direct {v0, v2, v1}, Ldefpackage/u24;-><init>(ZLjava/lang/String;)V

    .line 4211
    .line 4212
    .line 4213
    return-object v0

    .line 4214
    :cond_9
    new-instance v1, Ljava/util/HashMap;

    .line 4215
    .line 4216
    const/4 v2, 0x6

    .line 4217
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 4218
    .line 4219
    .line 4220
    new-instance v18, Ldefpackage/oq4;

    .line 4221
    .line 4222
    const/16 v23, 0x0

    .line 4223
    .line 4224
    const/16 v20, 0x1

    .line 4225
    .line 4226
    const/16 v19, 0x1

    .line 4227
    .line 4228
    const-string v21, "id"

    .line 4229
    .line 4230
    const-string v22, "TEXT"

    .line 4231
    .line 4232
    const/16 v24, 0x1

    .line 4233
    .line 4234
    invoke-direct/range {v18 .. v24}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4235
    .line 4236
    .line 4237
    move-object/from16 v2, v18

    .line 4238
    .line 4239
    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4240
    .line 4241
    .line 4242
    new-instance v18, Ldefpackage/oq4;

    .line 4243
    .line 4244
    const/16 v19, 0x0

    .line 4245
    .line 4246
    const-string v21, "name"

    .line 4247
    .line 4248
    const-string v22, "TEXT"

    .line 4249
    .line 4250
    const/16 v24, 0x0

    .line 4251
    .line 4252
    invoke-direct/range {v18 .. v24}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4253
    .line 4254
    .line 4255
    move-object/from16 v2, v18

    .line 4256
    .line 4257
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4258
    .line 4259
    .line 4260
    new-instance v18, Ldefpackage/oq4;

    .line 4261
    .line 4262
    const-string v21, "stream_url"

    .line 4263
    .line 4264
    const-string v22, "TEXT"

    .line 4265
    .line 4266
    invoke-direct/range {v18 .. v24}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4267
    .line 4268
    .line 4269
    move-object/from16 v2, v18

    .line 4270
    .line 4271
    invoke-virtual {v1, v13, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4272
    .line 4273
    .line 4274
    new-instance v18, Ldefpackage/oq4;

    .line 4275
    .line 4276
    const-string v21, "home_page_url"

    .line 4277
    .line 4278
    const-string v22, "TEXT"

    .line 4279
    .line 4280
    invoke-direct/range {v18 .. v24}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4281
    .line 4282
    .line 4283
    move-object/from16 v2, v18

    .line 4284
    .line 4285
    const-string v3, "home_page_url"

    .line 4286
    .line 4287
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4288
    .line 4289
    .line 4290
    new-instance v18, Ldefpackage/oq4;

    .line 4291
    .line 4292
    const-string v23, "\'subsonic\'"

    .line 4293
    .line 4294
    const-string v21, "source"

    .line 4295
    .line 4296
    const-string v22, "TEXT"

    .line 4297
    .line 4298
    const/16 v24, 0x1

    .line 4299
    .line 4300
    invoke-direct/range {v18 .. v24}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4301
    .line 4302
    .line 4303
    move-object/from16 v2, v18

    .line 4304
    .line 4305
    const-string v3, "source"

    .line 4306
    .line 4307
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4308
    .line 4309
    .line 4310
    new-instance v18, Ldefpackage/oq4;

    .line 4311
    .line 4312
    const/16 v23, 0x0

    .line 4313
    .line 4314
    const-string v21, "cover_art_url"

    .line 4315
    .line 4316
    const-string v22, "TEXT"

    .line 4317
    .line 4318
    const/16 v24, 0x0

    .line 4319
    .line 4320
    invoke-direct/range {v18 .. v24}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4321
    .line 4322
    .line 4323
    move-object/from16 v2, v18

    .line 4324
    .line 4325
    const-string v3, "cover_art_url"

    .line 4326
    .line 4327
    const/4 v11, 0x0

    .line 4328
    invoke-static {v1, v3, v2, v11}, Ldefpackage/f34;->k(Ljava/util/HashMap;Ljava/lang/String;Ldefpackage/oq4;I)Ljava/util/HashSet;

    .line 4329
    .line 4330
    .line 4331
    move-result-object v2

    .line 4332
    new-instance v3, Ljava/util/HashSet;

    .line 4333
    .line 4334
    invoke-direct {v3, v11}, Ljava/util/HashSet;-><init>(I)V

    .line 4335
    .line 4336
    .line 4337
    new-instance v5, Ldefpackage/rq4;

    .line 4338
    .line 4339
    const-string v6, "internet_radio_station_cache"

    .line 4340
    .line 4341
    invoke-direct {v5, v6, v1, v2, v3}, Ldefpackage/rq4;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    .line 4342
    .line 4343
    .line 4344
    invoke-static {v0, v6}, Ldefpackage/rq4;->b(Ldefpackage/x34;Ljava/lang/String;)Ldefpackage/rq4;

    .line 4345
    .line 4346
    .line 4347
    move-result-object v1

    .line 4348
    invoke-virtual {v5, v1}, Ldefpackage/rq4;->equals(Ljava/lang/Object;)Z

    .line 4349
    .line 4350
    .line 4351
    move-result v2

    .line 4352
    if-nez v2, :cond_a

    .line 4353
    .line 4354
    new-instance v0, Ldefpackage/u24;

    .line 4355
    .line 4356
    const-string v2, "internet_radio_station_cache(com.eddyizm.tempus.model.InternetRadioStationCache).\n Expected:\n"

    .line 4357
    .line 4358
    invoke-static {v2, v5, v14, v1}, Ldefpackage/f34;->g(Ljava/lang/String;Ldefpackage/rq4;Ljava/lang/String;Ldefpackage/rq4;)Ljava/lang/String;

    .line 4359
    .line 4360
    .line 4361
    move-result-object v1

    .line 4362
    invoke-direct {v0, v11, v1}, Ldefpackage/u24;-><init>(ZLjava/lang/String;)V

    .line 4363
    .line 4364
    .line 4365
    return-object v0

    .line 4366
    :cond_a
    new-instance v1, Ljava/util/HashMap;

    .line 4367
    .line 4368
    const/16 v2, 0xa

    .line 4369
    .line 4370
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 4371
    .line 4372
    .line 4373
    new-instance v18, Ldefpackage/oq4;

    .line 4374
    .line 4375
    const/16 v23, 0x0

    .line 4376
    .line 4377
    const/16 v20, 0x1

    .line 4378
    .line 4379
    const/16 v19, 0x1

    .line 4380
    .line 4381
    const-string v21, "playlist_id"

    .line 4382
    .line 4383
    const-string v22, "TEXT"

    .line 4384
    .line 4385
    const/16 v24, 0x1

    .line 4386
    .line 4387
    invoke-direct/range {v18 .. v24}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4388
    .line 4389
    .line 4390
    move-object/from16 v3, p0

    .line 4391
    .line 4392
    move-object/from16 v2, v18

    .line 4393
    .line 4394
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4395
    .line 4396
    .line 4397
    new-instance v18, Ldefpackage/oq4;

    .line 4398
    .line 4399
    const/16 v19, 0x2

    .line 4400
    .line 4401
    const-string v21, "id"

    .line 4402
    .line 4403
    const-string v22, "TEXT"

    .line 4404
    .line 4405
    invoke-direct/range {v18 .. v24}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4406
    .line 4407
    .line 4408
    move-object/from16 v2, v18

    .line 4409
    .line 4410
    invoke-virtual {v1, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4411
    .line 4412
    .line 4413
    new-instance v18, Ldefpackage/oq4;

    .line 4414
    .line 4415
    const/16 v19, 0x0

    .line 4416
    .line 4417
    const-string v21, "title"

    .line 4418
    .line 4419
    const-string v22, "TEXT"

    .line 4420
    .line 4421
    const/16 v24, 0x0

    .line 4422
    .line 4423
    invoke-direct/range {v18 .. v24}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4424
    .line 4425
    .line 4426
    move-object/from16 v2, v18

    .line 4427
    .line 4428
    invoke-virtual {v1, v7, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4429
    .line 4430
    .line 4431
    new-instance v18, Ldefpackage/oq4;

    .line 4432
    .line 4433
    const-string v21, "artist"

    .line 4434
    .line 4435
    const-string v22, "TEXT"

    .line 4436
    .line 4437
    invoke-direct/range {v18 .. v24}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4438
    .line 4439
    .line 4440
    move-object/from16 v2, v18

    .line 4441
    .line 4442
    invoke-virtual {v1, v9, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4443
    .line 4444
    .line 4445
    new-instance v18, Ldefpackage/oq4;

    .line 4446
    .line 4447
    const-string v21, "album"

    .line 4448
    .line 4449
    const-string v22, "TEXT"

    .line 4450
    .line 4451
    invoke-direct/range {v18 .. v24}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4452
    .line 4453
    .line 4454
    move-object/from16 v2, v18

    .line 4455
    .line 4456
    invoke-virtual {v1, v8, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4457
    .line 4458
    .line 4459
    new-instance v18, Ldefpackage/oq4;

    .line 4460
    .line 4461
    const-string v21, "track"

    .line 4462
    .line 4463
    const-string v22, "INTEGER"

    .line 4464
    .line 4465
    invoke-direct/range {v18 .. v24}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4466
    .line 4467
    .line 4468
    move-object/from16 v2, v18

    .line 4469
    .line 4470
    invoke-virtual {v1, v10, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4471
    .line 4472
    .line 4473
    new-instance v18, Ldefpackage/oq4;

    .line 4474
    .line 4475
    const-string v21, "cover_art_id"

    .line 4476
    .line 4477
    const-string v22, "TEXT"

    .line 4478
    .line 4479
    invoke-direct/range {v18 .. v24}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4480
    .line 4481
    .line 4482
    move-object/from16 v2, v18

    .line 4483
    .line 4484
    invoke-virtual {v1, v15, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4485
    .line 4486
    .line 4487
    new-instance v5, Ldefpackage/oq4;

    .line 4488
    .line 4489
    const/4 v10, 0x0

    .line 4490
    const/4 v7, 0x1

    .line 4491
    const/4 v6, 0x0

    .line 4492
    const-string v8, "duration"

    .line 4493
    .line 4494
    const-string v9, "INTEGER"

    .line 4495
    .line 4496
    const/4 v11, 0x0

    .line 4497
    invoke-direct/range {v5 .. v11}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4498
    .line 4499
    .line 4500
    invoke-virtual {v1, v12, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4501
    .line 4502
    .line 4503
    new-instance v18, Ldefpackage/oq4;

    .line 4504
    .line 4505
    const-string v21, "album_id"

    .line 4506
    .line 4507
    const-string v22, "TEXT"

    .line 4508
    .line 4509
    invoke-direct/range {v18 .. v24}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4510
    .line 4511
    .line 4512
    move-object/from16 v2, v18

    .line 4513
    .line 4514
    move-object/from16 v12, v32

    .line 4515
    .line 4516
    invoke-virtual {v1, v12, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4517
    .line 4518
    .line 4519
    new-instance v5, Ldefpackage/oq4;

    .line 4520
    .line 4521
    const-string v8, "artist_id"

    .line 4522
    .line 4523
    const-string v9, "TEXT"

    .line 4524
    .line 4525
    invoke-direct/range {v5 .. v11}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4526
    .line 4527
    .line 4528
    move-object/from16 v12, v33

    .line 4529
    .line 4530
    const/4 v2, 0x1

    .line 4531
    invoke-static {v1, v12, v5, v2}, Ldefpackage/f34;->k(Ljava/util/HashMap;Ljava/lang/String;Ldefpackage/oq4;I)Ljava/util/HashSet;

    .line 4532
    .line 4533
    .line 4534
    move-result-object v5

    .line 4535
    new-instance v6, Ldefpackage/pq4;

    .line 4536
    .line 4537
    filled-new-array {v3}, [Ljava/lang/String;

    .line 4538
    .line 4539
    .line 4540
    move-result-object v2

    .line 4541
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 4542
    .line 4543
    .line 4544
    move-result-object v10

    .line 4545
    filled-new-array {v4}, [Ljava/lang/String;

    .line 4546
    .line 4547
    .line 4548
    move-result-object v2

    .line 4549
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 4550
    .line 4551
    .line 4552
    move-result-object v11

    .line 4553
    const-string v7, "playlist"

    .line 4554
    .line 4555
    const-string v8, "NO ACTION"

    .line 4556
    .line 4557
    const-string v9, "NO ACTION"

    .line 4558
    .line 4559
    invoke-direct/range {v6 .. v11}, Ldefpackage/pq4;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 4560
    .line 4561
    .line 4562
    invoke-virtual {v5, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 4563
    .line 4564
    .line 4565
    new-instance v2, Ljava/util/HashSet;

    .line 4566
    .line 4567
    const/4 v4, 0x1

    .line 4568
    invoke-direct {v2, v4}, Ljava/util/HashSet;-><init>(I)V

    .line 4569
    .line 4570
    .line 4571
    new-instance v4, Ldefpackage/qq4;

    .line 4572
    .line 4573
    filled-new-array {v3}, [Ljava/lang/String;

    .line 4574
    .line 4575
    .line 4576
    move-result-object v3

    .line 4577
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 4578
    .line 4579
    .line 4580
    move-result-object v3

    .line 4581
    const-string v6, "ASC"

    .line 4582
    .line 4583
    filled-new-array {v6}, [Ljava/lang/String;

    .line 4584
    .line 4585
    .line 4586
    move-result-object v6

    .line 4587
    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 4588
    .line 4589
    .line 4590
    move-result-object v6

    .line 4591
    const-string v7, "index_playlist_song_playlist_id"

    .line 4592
    .line 4593
    const/4 v11, 0x0

    .line 4594
    invoke-direct {v4, v7, v11, v3, v6}, Ldefpackage/qq4;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    .line 4595
    .line 4596
    .line 4597
    invoke-virtual {v2, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 4598
    .line 4599
    .line 4600
    new-instance v3, Ldefpackage/rq4;

    .line 4601
    .line 4602
    const-string v4, "playlist_song"

    .line 4603
    .line 4604
    invoke-direct {v3, v4, v1, v5, v2}, Ldefpackage/rq4;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    .line 4605
    .line 4606
    .line 4607
    invoke-static {v0, v4}, Ldefpackage/rq4;->b(Ldefpackage/x34;Ljava/lang/String;)Ldefpackage/rq4;

    .line 4608
    .line 4609
    .line 4610
    move-result-object v1

    .line 4611
    invoke-virtual {v3, v1}, Ldefpackage/rq4;->equals(Ljava/lang/Object;)Z

    .line 4612
    .line 4613
    .line 4614
    move-result v2

    .line 4615
    if-nez v2, :cond_b

    .line 4616
    .line 4617
    new-instance v0, Ldefpackage/u24;

    .line 4618
    .line 4619
    const-string v2, "playlist_song(com.eddyizm.tempus.model.PlaylistSong).\n Expected:\n"

    .line 4620
    .line 4621
    invoke-static {v2, v3, v14, v1}, Ldefpackage/f34;->g(Ljava/lang/String;Ldefpackage/rq4;Ljava/lang/String;Ldefpackage/rq4;)Ljava/lang/String;

    .line 4622
    .line 4623
    .line 4624
    move-result-object v1

    .line 4625
    invoke-direct {v0, v11, v1}, Ldefpackage/u24;-><init>(ZLjava/lang/String;)V

    .line 4626
    .line 4627
    .line 4628
    return-object v0

    .line 4629
    :cond_b
    new-instance v1, Ljava/util/HashMap;

    .line 4630
    .line 4631
    const/4 v2, 0x2

    .line 4632
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 4633
    .line 4634
    .line 4635
    new-instance v3, Ldefpackage/oq4;

    .line 4636
    .line 4637
    const/4 v8, 0x0

    .line 4638
    const/4 v5, 0x1

    .line 4639
    const/4 v4, 0x1

    .line 4640
    const-string v6, "playlistId"

    .line 4641
    .line 4642
    const-string v7, "TEXT"

    .line 4643
    .line 4644
    const/4 v9, 0x1

    .line 4645
    invoke-direct/range {v3 .. v9}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4646
    .line 4647
    .line 4648
    move-object/from16 v2, v17

    .line 4649
    .line 4650
    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4651
    .line 4652
    .line 4653
    new-instance v4, Ldefpackage/oq4;

    .line 4654
    .line 4655
    const/4 v9, 0x0

    .line 4656
    const/4 v6, 0x1

    .line 4657
    const/4 v5, 0x2

    .line 4658
    const-string v7, "serverId"

    .line 4659
    .line 4660
    const-string v8, "TEXT"

    .line 4661
    .line 4662
    const/4 v10, 0x1

    .line 4663
    invoke-direct/range {v4 .. v10}, Ldefpackage/oq4;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 4664
    .line 4665
    .line 4666
    const-string v2, "serverId"

    .line 4667
    .line 4668
    const/4 v11, 0x0

    .line 4669
    invoke-static {v1, v2, v4, v11}, Ldefpackage/f34;->k(Ljava/util/HashMap;Ljava/lang/String;Ldefpackage/oq4;I)Ljava/util/HashSet;

    .line 4670
    .line 4671
    .line 4672
    move-result-object v2

    .line 4673
    new-instance v3, Ljava/util/HashSet;

    .line 4674
    .line 4675
    invoke-direct {v3, v11}, Ljava/util/HashSet;-><init>(I)V

    .line 4676
    .line 4677
    .line 4678
    new-instance v4, Ldefpackage/rq4;

    .line 4679
    .line 4680
    const-string v5, "synced_playlist"

    .line 4681
    .line 4682
    invoke-direct {v4, v5, v1, v2, v3}, Ldefpackage/rq4;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/AbstractSet;Ljava/util/AbstractSet;)V

    .line 4683
    .line 4684
    .line 4685
    invoke-static {v0, v5}, Ldefpackage/rq4;->b(Ldefpackage/x34;Ljava/lang/String;)Ldefpackage/rq4;

    .line 4686
    .line 4687
    .line 4688
    move-result-object v0

    .line 4689
    invoke-virtual {v4, v0}, Ldefpackage/rq4;->equals(Ljava/lang/Object;)Z

    .line 4690
    .line 4691
    .line 4692
    move-result v1

    .line 4693
    if-nez v1, :cond_c

    .line 4694
    .line 4695
    new-instance v1, Ldefpackage/u24;

    .line 4696
    .line 4697
    const-string v2, "synced_playlist(com.eddyizm.tempus.model.SyncedPlaylist).\n Expected:\n"

    .line 4698
    .line 4699
    invoke-static {v2, v4, v14, v0}, Ldefpackage/f34;->g(Ljava/lang/String;Ldefpackage/rq4;Ljava/lang/String;Ldefpackage/rq4;)Ljava/lang/String;

    .line 4700
    .line 4701
    .line 4702
    move-result-object v0

    .line 4703
    invoke-direct {v1, v11, v0}, Ldefpackage/u24;-><init>(ZLjava/lang/String;)V

    .line 4704
    .line 4705
    .line 4706
    return-object v1

    .line 4707
    :cond_c
    new-instance v0, Ldefpackage/u24;

    .line 4708
    .line 4709
    const/4 v1, 0x0

    .line 4710
    const/4 v2, 0x1

    .line 4711
    invoke-direct {v0, v2, v1}, Ldefpackage/u24;-><init>(ZLjava/lang/String;)V

    .line 4712
    .line 4713
    .line 4714
    return-object v0
.end method
