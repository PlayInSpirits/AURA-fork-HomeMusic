.class public final Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final $stable:I = 0x8

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private album:Ljava/lang/String;

.field private artist:Ljava/lang/String;

.field private artistId:Ljava/lang/String;

.field private bitrate:Ljava/lang/Integer;
    .annotation runtime Lka4;
        value = "bitRate"
    .end annotation
.end field

.field private channelId:Ljava/lang/String;

.field private contentType:Ljava/lang/String;

.field private coverArtId:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "coverArt"
    .end annotation
.end field

.field private created:Ljava/util/Date;

.field private description:Ljava/lang/String;

.field private duration:Ljava/lang/Integer;

.field private genre:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private isDir:Z

.field private isVideo:Z

.field private parentId:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "parent"
    .end annotation
.end field

.field private path:Ljava/lang/String;

.field private publishDate:Ljava/util/Date;

.field private size:Ljava/lang/Long;

.field private status:Ljava/lang/String;

.field private streamId:Ljava/lang/String;

.field private suffix:Ljava/lang/String;

.field private title:Ljava/lang/String;

.field private type:Ljava/lang/String;

.field private year:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lb23;

    .line 2
    .line 3
    const/16 v1, 0x11

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lb23;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>()V
    .locals 27

    .line 27
    const v25, 0xffffff

    const/16 v26, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v26}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;ILxj0;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->id:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->parentId:Ljava/lang/String;

    .line 5
    iput-boolean p3, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->isDir:Z

    .line 6
    iput-object p4, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->title:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->album:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->artist:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->year:Ljava/lang/Integer;

    .line 10
    iput-object p8, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->genre:Ljava/lang/String;

    .line 11
    iput-object p9, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->coverArtId:Ljava/lang/String;

    .line 12
    iput-object p10, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->size:Ljava/lang/Long;

    .line 13
    iput-object p11, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->contentType:Ljava/lang/String;

    .line 14
    iput-object p12, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->suffix:Ljava/lang/String;

    .line 15
    iput-object p13, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->duration:Ljava/lang/Integer;

    .line 16
    iput-object p14, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->bitrate:Ljava/lang/Integer;

    .line 17
    iput-object p15, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->path:Ljava/lang/String;

    move/from16 p1, p16

    .line 18
    iput-boolean p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->isVideo:Z

    move-object/from16 p1, p17

    .line 19
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->created:Ljava/util/Date;

    move-object/from16 p1, p18

    .line 20
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->artistId:Ljava/lang/String;

    move-object/from16 p1, p19

    .line 21
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->type:Ljava/lang/String;

    move-object/from16 p1, p20

    .line 22
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->streamId:Ljava/lang/String;

    move-object/from16 p1, p21

    .line 23
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->channelId:Ljava/lang/String;

    move-object/from16 p1, p22

    .line 24
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->description:Ljava/lang/String;

    move-object/from16 p1, p23

    .line 25
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->status:Ljava/lang/String;

    move-object/from16 p1, p24

    .line 26
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->publishDate:Ljava/util/Date;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;ILxj0;)V
    .locals 25

    move/from16 v0, p25

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    move-object/from16 v1, p1

    :goto_0
    and-int/lit8 v3, v0, 0x2

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v0, 0x4

    if-eqz v4, :cond_2

    const/4 v4, 0x0

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v6, v0, 0x8

    if-eqz v6, :cond_3

    const/4 v6, 0x0

    goto :goto_3

    :cond_3
    move-object/from16 v6, p4

    :goto_3
    and-int/lit8 v7, v0, 0x10

    if-eqz v7, :cond_4

    const/4 v7, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v7, p5

    :goto_4
    and-int/lit8 v8, v0, 0x20

    if-eqz v8, :cond_5

    const/4 v8, 0x0

    goto :goto_5

    :cond_5
    move-object/from16 v8, p6

    :goto_5
    and-int/lit8 v9, v0, 0x40

    if-eqz v9, :cond_6

    const/4 v9, 0x0

    goto :goto_6

    :cond_6
    move-object/from16 v9, p7

    :goto_6
    and-int/lit16 v10, v0, 0x80

    if-eqz v10, :cond_7

    const/4 v10, 0x0

    goto :goto_7

    :cond_7
    move-object/from16 v10, p8

    :goto_7
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_8

    const/4 v11, 0x0

    goto :goto_8

    :cond_8
    move-object/from16 v11, p9

    :goto_8
    and-int/lit16 v12, v0, 0x200

    if-eqz v12, :cond_9

    const/4 v12, 0x0

    goto :goto_9

    :cond_9
    move-object/from16 v12, p10

    :goto_9
    and-int/lit16 v13, v0, 0x400

    if-eqz v13, :cond_a

    const/4 v13, 0x0

    goto :goto_a

    :cond_a
    move-object/from16 v13, p11

    :goto_a
    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_b

    const/4 v14, 0x0

    goto :goto_b

    :cond_b
    move-object/from16 v14, p12

    :goto_b
    and-int/lit16 v15, v0, 0x1000

    if-eqz v15, :cond_c

    const/4 v15, 0x0

    goto :goto_c

    :cond_c
    move-object/from16 v15, p13

    :goto_c
    and-int/lit16 v2, v0, 0x2000

    if-eqz v2, :cond_d

    const/4 v2, 0x0

    goto :goto_d

    :cond_d
    move-object/from16 v2, p14

    :goto_d
    and-int/lit16 v5, v0, 0x4000

    if-eqz v5, :cond_e

    const/4 v5, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v5, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v0, v16

    if-eqz v16, :cond_f

    const/16 v16, 0x0

    goto :goto_f

    :cond_f
    move/from16 v16, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v17, v0, v17

    if-eqz v17, :cond_10

    const/16 v17, 0x0

    goto :goto_10

    :cond_10
    move-object/from16 v17, p17

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, v0, v18

    if-eqz v18, :cond_11

    const/16 v18, 0x0

    goto :goto_11

    :cond_11
    move-object/from16 v18, p18

    :goto_11
    const/high16 v19, 0x40000

    and-int v19, v0, v19

    if-eqz v19, :cond_12

    const/16 v19, 0x0

    goto :goto_12

    :cond_12
    move-object/from16 v19, p19

    :goto_12
    const/high16 v20, 0x80000

    and-int v20, v0, v20

    if-eqz v20, :cond_13

    const/16 v20, 0x0

    goto :goto_13

    :cond_13
    move-object/from16 v20, p20

    :goto_13
    const/high16 v21, 0x100000

    and-int v21, v0, v21

    if-eqz v21, :cond_14

    const/16 v21, 0x0

    goto :goto_14

    :cond_14
    move-object/from16 v21, p21

    :goto_14
    const/high16 v22, 0x200000

    and-int v22, v0, v22

    if-eqz v22, :cond_15

    const/16 v22, 0x0

    goto :goto_15

    :cond_15
    move-object/from16 v22, p22

    :goto_15
    const/high16 v23, 0x400000

    and-int v23, v0, v23

    if-eqz v23, :cond_16

    const/16 v23, 0x0

    goto :goto_16

    :cond_16
    move-object/from16 v23, p23

    :goto_16
    const/high16 v24, 0x800000

    and-int v0, v0, v24

    if-eqz v0, :cond_17

    const/16 p25, 0x0

    :goto_17
    move-object/from16 p1, p0

    move-object/from16 p2, v1

    move-object/from16 p15, v2

    move-object/from16 p3, v3

    move/from16 p4, v4

    move-object/from16 p16, v5

    move-object/from16 p5, v6

    move-object/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v12

    move-object/from16 p12, v13

    move-object/from16 p13, v14

    move-object/from16 p14, v15

    move/from16 p17, v16

    move-object/from16 p18, v17

    move-object/from16 p19, v18

    move-object/from16 p20, v19

    move-object/from16 p21, v20

    move-object/from16 p22, v21

    move-object/from16 p23, v22

    move-object/from16 p24, v23

    goto :goto_18

    :cond_17
    move-object/from16 p25, p24

    goto :goto_17

    .line 1
    :goto_18
    invoke-direct/range {p1 .. p25}, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;)V

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final getAlbum()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->album:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getArtist()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->artist:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getArtistId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->artistId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getBitrate()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->bitrate:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getChannelId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->channelId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getContentType()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->contentType:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCoverArtId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->coverArtId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCreated()Ljava/util/Date;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->created:Ljava/util/Date;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->description:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDuration()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->duration:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getGenre()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->genre:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getParentId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->parentId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPath()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->path:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPublishDate()Ljava/util/Date;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->publishDate:Ljava/util/Date;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSize()Ljava/lang/Long;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->size:Ljava/lang/Long;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getStatus()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->status:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getStreamId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->streamId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSuffix()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->suffix:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getType()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->type:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getYear()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->year:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final isDir()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->isDir:Z

    .line 2
    .line 3
    return p0
.end method

.method public final isVideo()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->isVideo:Z

    .line 2
    .line 3
    return p0
.end method

.method public final setAlbum(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->album:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setArtist(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->artist:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setArtistId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->artistId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setBitrate(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->bitrate:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setChannelId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->channelId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setContentType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->contentType:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setCoverArtId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->coverArtId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setCreated(Ljava/util/Date;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->created:Ljava/util/Date;

    .line 2
    .line 3
    return-void
.end method

.method public final setDescription(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->description:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setDir(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->isDir:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setDuration(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->duration:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setGenre(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->genre:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setParentId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->parentId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setPath(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->path:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setPublishDate(Ljava/util/Date;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->publishDate:Ljava/util/Date;

    .line 2
    .line 3
    return-void
.end method

.method public final setSize(Ljava/lang/Long;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->size:Ljava/lang/Long;

    .line 2
    .line 3
    return-void
.end method

.method public final setStatus(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->status:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setStreamId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->streamId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setSuffix(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->suffix:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->type:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setVideo(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->isVideo:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setYear(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->year:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->id:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->parentId:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-boolean p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->isDir:Z

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 17
    .line 18
    .line 19
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->title:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->album:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->artist:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->year:Ljava/lang/Integer;

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    const/4 v1, 0x0

    .line 38
    if-nez p2, :cond_0

    .line 39
    .line 40
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-static {p1, v0, p2}, Lxa3;->q(Landroid/os/Parcel;ILjava/lang/Integer;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->genre:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->coverArtId:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->size:Ljava/lang/Long;

    .line 58
    .line 59
    if-nez p2, :cond_1

    .line 60
    .line 61
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 69
    .line 70
    .line 71
    move-result-wide v2

    .line 72
    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    .line 73
    .line 74
    .line 75
    :goto_1
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->contentType:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->suffix:Ljava/lang/String;

    .line 81
    .line 82
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->duration:Ljava/lang/Integer;

    .line 86
    .line 87
    if-nez p2, :cond_2

    .line 88
    .line 89
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_2
    invoke-static {p1, v0, p2}, Lxa3;->q(Landroid/os/Parcel;ILjava/lang/Integer;)V

    .line 94
    .line 95
    .line 96
    :goto_2
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->bitrate:Ljava/lang/Integer;

    .line 97
    .line 98
    if-nez p2, :cond_3

    .line 99
    .line 100
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_3
    invoke-static {p1, v0, p2}, Lxa3;->q(Landroid/os/Parcel;ILjava/lang/Integer;)V

    .line 105
    .line 106
    .line 107
    :goto_3
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->path:Ljava/lang/String;

    .line 108
    .line 109
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    iget-boolean p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->isVideo:Z

    .line 113
    .line 114
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 115
    .line 116
    .line 117
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->created:Ljava/util/Date;

    .line 118
    .line 119
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 120
    .line 121
    .line 122
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->artistId:Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->type:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->streamId:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->channelId:Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->description:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->status:Ljava/lang/String;

    .line 148
    .line 149
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PodcastEpisode;->publishDate:Ljava/util/Date;

    .line 153
    .line 154
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 155
    .line 156
    .line 157
    return-void
.end method
