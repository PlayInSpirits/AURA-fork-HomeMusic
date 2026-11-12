.class public final Lcom/eddyizm/tempus/model/SessionMediaItem;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private album:Ljava/lang/String;

.field private albumId:Ljava/lang/String;

.field private artist:Ljava/lang/String;

.field private artistId:Ljava/lang/String;

.field private averageRating:Ljava/lang/Double;

.field private bitrate:Ljava/lang/Integer;

.field private bookmarkPosition:Ljava/lang/Long;

.field private contentType:Ljava/lang/String;

.field private coverArtId:Ljava/lang/String;

.field private created:Ljava/util/Date;

.field private discNumber:Ljava/lang/Integer;

.field private duration:Ljava/lang/Integer;

.field private genre:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private index:I

.field private isDir:Z

.field private isVideo:Z

.field private originalHeight:Ljava/lang/Integer;

.field private originalWidth:Ljava/lang/Integer;

.field private parentId:Ljava/lang/String;

.field private path:Ljava/lang/String;

.field private playCount:Ljava/lang/Long;

.field private replayGain:Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

.field private size:Ljava/lang/Long;

.field private starred:Ljava/util/Date;

.field private streamId:Ljava/lang/String;

.field private streamUrl:Ljava/lang/String;

.field private suffix:Ljava/lang/String;

.field private timestamp:Ljava/lang/Long;

.field private title:Ljava/lang/String;

.field private track:Ljava/lang/Integer;

.field private transcodedContentType:Ljava/lang/String;

.field private transcodedSuffix:Ljava/lang/String;

.field private type:Ljava/lang/String;

.field private userRating:Ljava/lang/Integer;

.field private year:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 198
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/subsonic/models/Child;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/eddyizm/tempus/model/SessionMediaItem;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->id:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getParentId()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->parentId:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->isDir()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput-boolean v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->isDir:Z

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTitle()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->title:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbum()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->album:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->artist:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTrack()Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->track:Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getYear()Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->year:Ljava/lang/Integer;

    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getGenre()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->genre:Ljava/lang/String;

    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCoverArtId()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->coverArtId:Ljava/lang/String;

    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSize()Ljava/lang/Long;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->size:Ljava/lang/Long;

    .line 72
    .line 73
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getContentType()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->contentType:Ljava/lang/String;

    .line 78
    .line 79
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getSuffix()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->suffix:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTranscodedContentType()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->transcodedContentType:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getTranscodedSuffix()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->transcodedSuffix:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDuration()Ljava/lang/Integer;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->duration:Ljava/lang/Integer;

    .line 102
    .line 103
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBitrate()Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->bitrate:Ljava/lang/Integer;

    .line 108
    .line 109
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getPath()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->path:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->isVideo()Z

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    iput-boolean v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->isVideo:Z

    .line 120
    .line 121
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getUserRating()Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->userRating:Ljava/lang/Integer;

    .line 126
    .line 127
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAverageRating()Ljava/lang/Double;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->averageRating:Ljava/lang/Double;

    .line 132
    .line 133
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getPlayCount()Ljava/lang/Long;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->playCount:Ljava/lang/Long;

    .line 138
    .line 139
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getDiscNumber()Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->discNumber:Ljava/lang/Integer;

    .line 144
    .line 145
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getCreated()Ljava/util/Date;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->created:Ljava/util/Date;

    .line 150
    .line 151
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getStarred()Ljava/util/Date;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->starred:Ljava/util/Date;

    .line 156
    .line 157
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumId()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->albumId:Ljava/lang/String;

    .line 162
    .line 163
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->artistId:Ljava/lang/String;

    .line 168
    .line 169
    const-string v0, "music"

    .line 170
    .line 171
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->type:Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getBookmarkPosition()Ljava/lang/Long;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->bookmarkPosition:Ljava/lang/Long;

    .line 178
    .line 179
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getOriginalWidth()Ljava/lang/Integer;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->originalWidth:Ljava/lang/Integer;

    .line 184
    .line 185
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getOriginalHeight()Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->originalHeight:Ljava/lang/Integer;

    .line 190
    .line 191
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getReplayGain()Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->replayGain:Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 196
    .line 197
    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    invoke-direct {p0}, Lcom/eddyizm/tempus/model/SessionMediaItem;-><init>()V

    .line 221
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->id:Ljava/lang/String;

    .line 222
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->title:Ljava/lang/String;

    .line 223
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getStreamUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->streamUrl:Ljava/lang/String;

    .line 224
    const-string v0, "radio"

    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->type:Ljava/lang/String;

    .line 225
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->getHomePageUrl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 226
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {p1}, Le03;->n(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 227
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0xa

    .line 228
    invoke-static {p1, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1

    .line 229
    const-string v0, "ir_"

    .line 230
    invoke-static {v0, p1}, Lxa3;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 231
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->coverArtId:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public constructor <init>(Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    invoke-direct {p0}, Lcom/eddyizm/tempus/model/SessionMediaItem;-><init>()V

    .line 200
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->id:Ljava/lang/String;

    .line 201
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getParentId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->parentId:Ljava/lang/String;

    .line 202
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->isDir()Z

    move-result v0

    iput-boolean v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->isDir:Z

    .line 203
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getTitle()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->title:Ljava/lang/String;

    .line 204
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getAlbum()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->album:Ljava/lang/String;

    .line 205
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getArtist()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->artist:Ljava/lang/String;

    .line 206
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getYear()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->year:Ljava/lang/Integer;

    .line 207
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getGenre()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->genre:Ljava/lang/String;

    .line 208
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getCoverArtId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->coverArtId:Ljava/lang/String;

    .line 209
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getSize()Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->size:Ljava/lang/Long;

    .line 210
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getContentType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->contentType:Ljava/lang/String;

    .line 211
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getSuffix()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->suffix:Ljava/lang/String;

    .line 212
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getDuration()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->duration:Ljava/lang/Integer;

    .line 213
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getBitrate()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->bitrate:Ljava/lang/Integer;

    .line 214
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getPath()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->path:Ljava/lang/String;

    .line 215
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->isVideo()Z

    move-result v0

    iput-boolean v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->isVideo:Z

    .line 216
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getCreated()Ljava/util/Date;

    move-result-object v0

    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->created:Ljava/util/Date;

    .line 217
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getArtistId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->artistId:Ljava/lang/String;

    .line 218
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->getStreamId()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->streamId:Ljava/lang/String;

    .line 219
    const-string p1, "podcast"

    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->type:Ljava/lang/String;

    return-void
.end method

.method private final getStreamUri()Landroid/net/Uri;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->type:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_6

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const v3, -0x182c7cfc

    .line 11
    .line 12
    .line 13
    if-eq v2, v3, :cond_4

    .line 14
    .line 15
    const v3, 0x636ee25

    .line 16
    .line 17
    .line 18
    if-eq v2, v3, :cond_2

    .line 19
    .line 20
    const v3, 0x67413fb

    .line 21
    .line 22
    .line 23
    if-eq v2, v3, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v2, "radio"

    .line 27
    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->streamUrl:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_2
    const-string v2, "music"

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_3

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_3
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->id:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v1, p0}, Le03;->j(ILjava/lang/String;)Landroid/net/Uri;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    return-object p0

    .line 64
    :cond_4
    const-string v2, "podcast"

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_5

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_5
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->streamId:Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v1, p0}, Le03;->j(ILjava/lang/String;)Landroid/net/Uri;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_6
    :goto_0
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->id:Ljava/lang/String;

    .line 84
    .line 85
    invoke-static {v1, p0}, Le03;->j(ILjava/lang/String;)Landroid/net/Uri;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    return-object p0
.end method


# virtual methods
.method public final getAlbum()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->album:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAlbumId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->albumId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getArtist()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->artist:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getArtistId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->artistId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getAverageRating()Ljava/lang/Double;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->averageRating:Ljava/lang/Double;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getBitrate()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->bitrate:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getBookmarkPosition()Ljava/lang/Long;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->bookmarkPosition:Ljava/lang/Long;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getContentType()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->contentType:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCoverArtId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->coverArtId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCreated()Ljava/util/Date;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->created:Ljava/util/Date;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDiscNumber()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->discNumber:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDuration()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->duration:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getGenre()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->genre:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getIndex()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->index:I

    .line 2
    .line 3
    return p0
.end method

.method public final getMediaItem()Lgn2;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/eddyizm/tempus/model/SessionMediaItem;->getStreamUri()Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->coverArtId:Ljava/lang/String;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-static {v2}, Lcom/eddyizm/tempus/provider/AlbumArtContentProvider;->a(Ljava/lang/String;)Landroid/net/Uri;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v2, v3

    .line 18
    :goto_0
    new-instance v4, Landroid/os/Bundle;

    .line 19
    .line 20
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v5, "id"

    .line 24
    .line 25
    iget-object v6, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->id:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v4, v5, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const-string v5, "parentId"

    .line 31
    .line 32
    iget-object v6, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->parentId:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {v4, v5, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v5, "isDir"

    .line 38
    .line 39
    iget-boolean v6, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->isDir:Z

    .line 40
    .line 41
    invoke-virtual {v4, v5, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    const-string v5, "title"

    .line 45
    .line 46
    iget-object v6, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->title:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v4, v5, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v5, "album"

    .line 52
    .line 53
    iget-object v6, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->album:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v4, v5, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const-string v5, "artist"

    .line 59
    .line 60
    iget-object v6, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->artist:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v4, v5, v6}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iget-object v5, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->track:Ljava/lang/Integer;

    .line 66
    .line 67
    const/4 v6, 0x0

    .line 68
    if-eqz v5, :cond_1

    .line 69
    .line 70
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    goto :goto_1

    .line 75
    :cond_1
    move v5, v6

    .line 76
    :goto_1
    const-string v7, "track"

    .line 77
    .line 78
    invoke-virtual {v4, v7, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 79
    .line 80
    .line 81
    iget-object v5, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->year:Ljava/lang/Integer;

    .line 82
    .line 83
    if-eqz v5, :cond_2

    .line 84
    .line 85
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    goto :goto_2

    .line 90
    :cond_2
    move v5, v6

    .line 91
    :goto_2
    const-string v7, "year"

    .line 92
    .line 93
    invoke-virtual {v4, v7, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 94
    .line 95
    .line 96
    const-string v5, "genre"

    .line 97
    .line 98
    iget-object v7, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->genre:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {v4, v5, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const-string v5, "coverArtId"

    .line 104
    .line 105
    iget-object v7, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->coverArtId:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v4, v5, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget-object v5, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->size:Ljava/lang/Long;

    .line 111
    .line 112
    const-wide/16 v7, 0x0

    .line 113
    .line 114
    if-eqz v5, :cond_3

    .line 115
    .line 116
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 117
    .line 118
    .line 119
    move-result-wide v9

    .line 120
    goto :goto_3

    .line 121
    :cond_3
    move-wide v9, v7

    .line 122
    :goto_3
    const-string v5, "size"

    .line 123
    .line 124
    invoke-virtual {v4, v5, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 125
    .line 126
    .line 127
    const-string v5, "contentType"

    .line 128
    .line 129
    iget-object v9, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->contentType:Ljava/lang/String;

    .line 130
    .line 131
    invoke-virtual {v4, v5, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    const-string v5, "suffix"

    .line 135
    .line 136
    iget-object v9, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->suffix:Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {v4, v5, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    const-string v5, "transcodedContentType"

    .line 142
    .line 143
    iget-object v9, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->transcodedContentType:Ljava/lang/String;

    .line 144
    .line 145
    invoke-virtual {v4, v5, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    const-string v5, "transcodedSuffix"

    .line 149
    .line 150
    iget-object v9, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->transcodedSuffix:Ljava/lang/String;

    .line 151
    .line 152
    invoke-virtual {v4, v5, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    iget-object v5, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->duration:Ljava/lang/Integer;

    .line 156
    .line 157
    if-eqz v5, :cond_4

    .line 158
    .line 159
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 160
    .line 161
    .line 162
    move-result v5

    .line 163
    goto :goto_4

    .line 164
    :cond_4
    move v5, v6

    .line 165
    :goto_4
    const-string v9, "duration"

    .line 166
    .line 167
    invoke-virtual {v4, v9, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 168
    .line 169
    .line 170
    iget-object v5, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->bitrate:Ljava/lang/Integer;

    .line 171
    .line 172
    if-eqz v5, :cond_5

    .line 173
    .line 174
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    goto :goto_5

    .line 179
    :cond_5
    move v5, v6

    .line 180
    :goto_5
    const-string v9, "bitrate"

    .line 181
    .line 182
    invoke-virtual {v4, v9, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 183
    .line 184
    .line 185
    const-string v5, "path"

    .line 186
    .line 187
    iget-object v9, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->path:Ljava/lang/String;

    .line 188
    .line 189
    invoke-virtual {v4, v5, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    const-string v5, "isVideo"

    .line 193
    .line 194
    iget-boolean v9, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->isVideo:Z

    .line 195
    .line 196
    invoke-virtual {v4, v5, v9}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 197
    .line 198
    .line 199
    iget-object v5, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->userRating:Ljava/lang/Integer;

    .line 200
    .line 201
    if-eqz v5, :cond_6

    .line 202
    .line 203
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    goto :goto_6

    .line 208
    :cond_6
    move v5, v6

    .line 209
    :goto_6
    const-string v9, "userRating"

    .line 210
    .line 211
    invoke-virtual {v4, v9, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 212
    .line 213
    .line 214
    iget-object v5, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->averageRating:Ljava/lang/Double;

    .line 215
    .line 216
    if-eqz v5, :cond_7

    .line 217
    .line 218
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 219
    .line 220
    .line 221
    move-result-wide v9

    .line 222
    goto :goto_7

    .line 223
    :cond_7
    const-wide/16 v9, 0x0

    .line 224
    .line 225
    :goto_7
    const-string v5, "averageRating"

    .line 226
    .line 227
    invoke-virtual {v4, v5, v9, v10}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 228
    .line 229
    .line 230
    iget-object v5, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->playCount:Ljava/lang/Long;

    .line 231
    .line 232
    if-eqz v5, :cond_8

    .line 233
    .line 234
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 235
    .line 236
    .line 237
    move-result-wide v9

    .line 238
    goto :goto_8

    .line 239
    :cond_8
    move-wide v9, v7

    .line 240
    :goto_8
    const-string v5, "playCount"

    .line 241
    .line 242
    invoke-virtual {v4, v5, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 243
    .line 244
    .line 245
    iget-object v5, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->discNumber:Ljava/lang/Integer;

    .line 246
    .line 247
    if-eqz v5, :cond_9

    .line 248
    .line 249
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 250
    .line 251
    .line 252
    move-result v5

    .line 253
    goto :goto_9

    .line 254
    :cond_9
    move v5, v6

    .line 255
    :goto_9
    const-string v9, "discNumber"

    .line 256
    .line 257
    invoke-virtual {v4, v9, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 258
    .line 259
    .line 260
    iget-object v5, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->created:Ljava/util/Date;

    .line 261
    .line 262
    if-eqz v5, :cond_a

    .line 263
    .line 264
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    .line 265
    .line 266
    .line 267
    move-result-wide v9

    .line 268
    goto :goto_a

    .line 269
    :cond_a
    move-wide v9, v7

    .line 270
    :goto_a
    const-string v5, "created"

    .line 271
    .line 272
    invoke-virtual {v4, v5, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 273
    .line 274
    .line 275
    iget-object v5, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->starred:Ljava/util/Date;

    .line 276
    .line 277
    if-eqz v5, :cond_b

    .line 278
    .line 279
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    .line 280
    .line 281
    .line 282
    move-result-wide v9

    .line 283
    goto :goto_b

    .line 284
    :cond_b
    move-wide v9, v7

    .line 285
    :goto_b
    const-string v5, "starred"

    .line 286
    .line 287
    invoke-virtual {v4, v5, v9, v10}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 288
    .line 289
    .line 290
    const-string v5, "albumId"

    .line 291
    .line 292
    iget-object v9, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->albumId:Ljava/lang/String;

    .line 293
    .line 294
    invoke-virtual {v4, v5, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    const-string v5, "artistId"

    .line 298
    .line 299
    iget-object v9, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->artistId:Ljava/lang/String;

    .line 300
    .line 301
    invoke-virtual {v4, v5, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    const-string v5, "type"

    .line 305
    .line 306
    iget-object v9, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->type:Ljava/lang/String;

    .line 307
    .line 308
    invoke-virtual {v4, v5, v9}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 309
    .line 310
    .line 311
    iget-object v5, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->bookmarkPosition:Ljava/lang/Long;

    .line 312
    .line 313
    if-eqz v5, :cond_c

    .line 314
    .line 315
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 316
    .line 317
    .line 318
    move-result-wide v7

    .line 319
    :cond_c
    const-string v5, "bookmarkPosition"

    .line 320
    .line 321
    invoke-virtual {v4, v5, v7, v8}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 322
    .line 323
    .line 324
    iget-object v5, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->originalWidth:Ljava/lang/Integer;

    .line 325
    .line 326
    if-eqz v5, :cond_d

    .line 327
    .line 328
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 329
    .line 330
    .line 331
    move-result v5

    .line 332
    goto :goto_c

    .line 333
    :cond_d
    move v5, v6

    .line 334
    :goto_c
    const-string v7, "originalWidth"

    .line 335
    .line 336
    invoke-virtual {v4, v7, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 337
    .line 338
    .line 339
    iget-object v5, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->originalHeight:Ljava/lang/Integer;

    .line 340
    .line 341
    if-eqz v5, :cond_e

    .line 342
    .line 343
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 344
    .line 345
    .line 346
    move-result v5

    .line 347
    goto :goto_d

    .line 348
    :cond_e
    move v5, v6

    .line 349
    :goto_d
    const-string v7, "originalHeight"

    .line 350
    .line 351
    invoke-virtual {v4, v7, v5}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 352
    .line 353
    .line 354
    const-string v5, "uri"

    .line 355
    .line 356
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v7

    .line 360
    invoke-virtual {v4, v5, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    iget-object v5, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->replayGain:Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 364
    .line 365
    invoke-static {v4, v5}, Lsi0;->Z(Landroid/os/Bundle;Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;)V

    .line 366
    .line 367
    .line 368
    new-instance v10, Lum2;

    .line 369
    .line 370
    invoke-direct {v10}, Lum2;-><init>()V

    .line 371
    .line 372
    .line 373
    new-instance v5, Lxm2;

    .line 374
    .line 375
    invoke-direct {v5}, Lxm2;-><init>()V

    .line 376
    .line 377
    .line 378
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 379
    .line 380
    move-object v8, v7

    .line 381
    sget-object v7, Lgy3;->r:Lgy3;

    .line 382
    .line 383
    new-instance v11, Lzm2;

    .line 384
    .line 385
    invoke-direct {v11}, Lzm2;-><init>()V

    .line 386
    .line 387
    .line 388
    sget-object v9, Lcn2;->d:Lcn2;

    .line 389
    .line 390
    iget-object v13, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->id:Ljava/lang/String;

    .line 391
    .line 392
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    new-instance v9, Lco2;

    .line 396
    .line 397
    invoke-direct {v9}, Lco2;-><init>()V

    .line 398
    .line 399
    .line 400
    iget-object v12, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->title:Ljava/lang/String;

    .line 401
    .line 402
    iput-object v12, v9, Lco2;->a:Ljava/lang/CharSequence;

    .line 403
    .line 404
    iget-object v12, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->track:Ljava/lang/Integer;

    .line 405
    .line 406
    if-eqz v12, :cond_f

    .line 407
    .line 408
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 409
    .line 410
    .line 411
    move-result v12

    .line 412
    goto :goto_e

    .line 413
    :cond_f
    move v12, v6

    .line 414
    :goto_e
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 415
    .line 416
    .line 417
    move-result-object v12

    .line 418
    iput-object v12, v9, Lco2;->n:Ljava/lang/Integer;

    .line 419
    .line 420
    iget-object v12, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->discNumber:Ljava/lang/Integer;

    .line 421
    .line 422
    if-eqz v12, :cond_10

    .line 423
    .line 424
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 425
    .line 426
    .line 427
    move-result v12

    .line 428
    goto :goto_f

    .line 429
    :cond_10
    move v12, v6

    .line 430
    :goto_f
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 431
    .line 432
    .line 433
    move-result-object v12

    .line 434
    iput-object v12, v9, Lco2;->B:Ljava/lang/Integer;

    .line 435
    .line 436
    iget-object v12, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->year:Ljava/lang/Integer;

    .line 437
    .line 438
    if-eqz v12, :cond_11

    .line 439
    .line 440
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 441
    .line 442
    .line 443
    move-result v12

    .line 444
    goto :goto_10

    .line 445
    :cond_11
    move v12, v6

    .line 446
    :goto_10
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 447
    .line 448
    .line 449
    move-result-object v12

    .line 450
    iput-object v12, v9, Lco2;->v:Ljava/lang/Integer;

    .line 451
    .line 452
    iget-object v12, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->album:Ljava/lang/String;

    .line 453
    .line 454
    iput-object v12, v9, Lco2;->c:Ljava/lang/CharSequence;

    .line 455
    .line 456
    iget-object v12, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->artist:Ljava/lang/String;

    .line 457
    .line 458
    iput-object v12, v9, Lco2;->b:Ljava/lang/CharSequence;

    .line 459
    .line 460
    iput-object v2, v9, Lco2;->m:Landroid/net/Uri;

    .line 461
    .line 462
    new-instance v2, Lvl1;

    .line 463
    .line 464
    iget-object v12, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->type:Ljava/lang/String;

    .line 465
    .line 466
    const-string v14, "music"

    .line 467
    .line 468
    invoke-static {v12, v14}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result v12

    .line 472
    const/4 v14, 0x1

    .line 473
    if-eqz v12, :cond_13

    .line 474
    .line 475
    iget-object v12, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->id:Ljava/lang/String;

    .line 476
    .line 477
    iget-object v0, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->starred:Ljava/util/Date;

    .line 478
    .line 479
    if-eqz v0, :cond_12

    .line 480
    .line 481
    move v0, v14

    .line 482
    goto :goto_11

    .line 483
    :cond_12
    move v0, v6

    .line 484
    :goto_11
    invoke-static {v14, v12, v0}, Ln61;->f(ILjava/lang/String;Z)Z

    .line 485
    .line 486
    .line 487
    move-result v0

    .line 488
    goto :goto_12

    .line 489
    :cond_13
    iget-object v0, v0, Lcom/eddyizm/tempus/model/SessionMediaItem;->starred:Ljava/util/Date;

    .line 490
    .line 491
    if-eqz v0, :cond_14

    .line 492
    .line 493
    move v0, v14

    .line 494
    goto :goto_12

    .line 495
    :cond_14
    move v0, v6

    .line 496
    :goto_12
    invoke-direct {v2, v0}, Lvl1;-><init>(Z)V

    .line 497
    .line 498
    .line 499
    iput-object v2, v9, Lco2;->i:Llu3;

    .line 500
    .line 501
    const-string v0, "android.media3.session.demo.HEART_ON"

    .line 502
    .line 503
    const-string v2, "android.media3.session.demo.HEART_OFF"

    .line 504
    .line 505
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    invoke-static {v0}, Lgb;->P([Ljava/lang/Object;)Ljava/util/List;

    .line 510
    .line 511
    .line 512
    move-result-object v0

    .line 513
    invoke-static {v0}, Lyw1;->k(Ljava/util/Collection;)Lyw1;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    iput-object v0, v9, Lco2;->I:Lyw1;

    .line 518
    .line 519
    iput-object v4, v9, Lco2;->H:Landroid/os/Bundle;

    .line 520
    .line 521
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 522
    .line 523
    iput-object v0, v9, Lco2;->q:Ljava/lang/Boolean;

    .line 524
    .line 525
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 526
    .line 527
    iput-object v0, v9, Lco2;->r:Ljava/lang/Boolean;

    .line 528
    .line 529
    new-instance v12, Ldo2;

    .line 530
    .line 531
    invoke-direct {v12, v9}, Ldo2;-><init>(Lco2;)V

    .line 532
    .line 533
    .line 534
    new-instance v0, Lyc5;

    .line 535
    .line 536
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 537
    .line 538
    .line 539
    iput-object v1, v0, Lyc5;->n:Ljava/lang/Object;

    .line 540
    .line 541
    iput-object v4, v0, Lyc5;->p:Ljava/lang/Object;

    .line 542
    .line 543
    new-instance v15, Lcn2;

    .line 544
    .line 545
    invoke-direct {v15, v0}, Lcn2;-><init>(Lyc5;)V

    .line 546
    .line 547
    .line 548
    iget-object v0, v5, Lxm2;->e:Ljava/lang/Object;

    .line 549
    .line 550
    check-cast v0, Landroid/net/Uri;

    .line 551
    .line 552
    if-eqz v0, :cond_15

    .line 553
    .line 554
    iget-object v0, v5, Lxm2;->d:Ljava/lang/Object;

    .line 555
    .line 556
    check-cast v0, Ljava/util/UUID;

    .line 557
    .line 558
    if-eqz v0, :cond_16

    .line 559
    .line 560
    :cond_15
    move v6, v14

    .line 561
    :cond_16
    invoke-static {v6}, Lrr2;->w(Z)V

    .line 562
    .line 563
    .line 564
    new-instance v0, Lbn2;

    .line 565
    .line 566
    iget-object v2, v5, Lxm2;->d:Ljava/lang/Object;

    .line 567
    .line 568
    check-cast v2, Ljava/util/UUID;

    .line 569
    .line 570
    if-eqz v2, :cond_17

    .line 571
    .line 572
    new-instance v3, Lym2;

    .line 573
    .line 574
    invoke-direct {v3, v5}, Lym2;-><init>(Lxm2;)V

    .line 575
    .line 576
    .line 577
    :cond_17
    const-string v2, "audio"

    .line 578
    .line 579
    const/4 v4, 0x0

    .line 580
    const/4 v6, 0x0

    .line 581
    move-object v5, v8

    .line 582
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    invoke-direct/range {v0 .. v9}, Lbn2;-><init>(Landroid/net/Uri;Ljava/lang/String;Lym2;Lsm2;Ljava/util/List;Ljava/lang/String;Lyw1;J)V

    .line 588
    .line 589
    .line 590
    move-object/from16 v17, v12

    .line 591
    .line 592
    new-instance v12, Lgn2;

    .line 593
    .line 594
    new-instance v14, Lwm2;

    .line 595
    .line 596
    invoke-direct {v14, v10}, Lvm2;-><init>(Lum2;)V

    .line 597
    .line 598
    .line 599
    new-instance v1, Lan2;

    .line 600
    .line 601
    invoke-direct {v1, v11}, Lan2;-><init>(Lzm2;)V

    .line 602
    .line 603
    .line 604
    move-object/from16 v16, v1

    .line 605
    .line 606
    move-object/from16 v18, v15

    .line 607
    .line 608
    move-object v15, v0

    .line 609
    invoke-direct/range {v12 .. v18}, Lgn2;-><init>(Ljava/lang/String;Lwm2;Lbn2;Lan2;Ldo2;Lcn2;)V

    .line 610
    .line 611
    .line 612
    return-object v12
.end method

.method public final getOriginalHeight()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->originalHeight:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOriginalWidth()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->originalWidth:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getParentId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->parentId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->path:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPlayCount()Ljava/lang/Long;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->playCount:Ljava/lang/Long;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getReplayGain()Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->replayGain:Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSize()Ljava/lang/Long;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->size:Ljava/lang/Long;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getStarred()Ljava/util/Date;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->starred:Ljava/util/Date;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getStreamId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->streamId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getStreamUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->streamUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSuffix()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->suffix:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTimestamp()Ljava/lang/Long;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->timestamp:Ljava/lang/Long;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTrack()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->track:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTranscodedContentType()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->transcodedContentType:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTranscodedSuffix()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->transcodedSuffix:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getType()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->type:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getUserRating()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->userRating:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getYear()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->year:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final isDir()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->isDir:Z

    .line 2
    .line 3
    return p0
.end method

.method public final isVideo()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->isVideo:Z

    .line 2
    .line 3
    return p0
.end method

.method public final setAlbum(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->album:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setAlbumId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->albumId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setArtist(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->artist:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setArtistId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->artistId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setAverageRating(Ljava/lang/Double;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->averageRating:Ljava/lang/Double;

    .line 2
    .line 3
    return-void
.end method

.method public final setBitrate(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->bitrate:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setBookmarkPosition(Ljava/lang/Long;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->bookmarkPosition:Ljava/lang/Long;

    .line 2
    .line 3
    return-void
.end method

.method public final setContentType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->contentType:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setCoverArtId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->coverArtId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setCreated(Ljava/util/Date;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->created:Ljava/util/Date;

    .line 2
    .line 3
    return-void
.end method

.method public final setDir(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->isDir:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setDiscNumber(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->discNumber:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setDuration(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->duration:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setGenre(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->genre:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setIndex(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->index:I

    .line 2
    .line 3
    return-void
.end method

.method public final setOriginalHeight(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->originalHeight:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setOriginalWidth(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->originalWidth:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setParentId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->parentId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setPath(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->path:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setPlayCount(Ljava/lang/Long;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->playCount:Ljava/lang/Long;

    .line 2
    .line 3
    return-void
.end method

.method public final setReplayGain(Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->replayGain:Lcom/eddyizm/tempus/subsonic/models/ReplayGainInfo;

    .line 2
    .line 3
    return-void
.end method

.method public final setSize(Ljava/lang/Long;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->size:Ljava/lang/Long;

    .line 2
    .line 3
    return-void
.end method

.method public final setStarred(Ljava/util/Date;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->starred:Ljava/util/Date;

    .line 2
    .line 3
    return-void
.end method

.method public final setStreamId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->streamId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setStreamUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->streamUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setSuffix(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->suffix:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setTimestamp(Ljava/lang/Long;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->timestamp:Ljava/lang/Long;

    .line 2
    .line 3
    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setTrack(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->track:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setTranscodedContentType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->transcodedContentType:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setTranscodedSuffix(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->transcodedSuffix:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->type:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setUserRating(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->userRating:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setVideo(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->isVideo:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setYear(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/model/SessionMediaItem;->year:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method
