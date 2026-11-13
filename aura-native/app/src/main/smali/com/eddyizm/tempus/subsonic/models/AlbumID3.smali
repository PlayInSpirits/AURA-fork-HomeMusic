.class public Lcom/eddyizm/tempus/subsonic/models/AlbumID3;
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
            "Lcom/eddyizm/tempus/subsonic/models/AlbumID3;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private artist:Ljava/lang/String;

.field private artistId:Ljava/lang/String;

.field private artists:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/eddyizm/tempus/subsonic/models/ArtistID3;",
            ">;"
        }
    .end annotation
.end field

.field private coverArtId:Ljava/lang/String;
    .annotation runtime Ldefpackage/ka4;
        value = "coverArt"
    .end annotation
.end field

.field private created:Ljava/util/Date;

.field private discTitles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/eddyizm/tempus/subsonic/models/DiscTitle;",
            ">;"
        }
    .end annotation
.end field

.field private displayArtist:Ljava/lang/String;

.field private duration:Ljava/lang/Integer;

.field private genre:Ljava/lang/String;

.field private genres:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/eddyizm/tempus/subsonic/models/ItemGenre;",
            ">;"
        }
    .end annotation
.end field

.field private id:Ljava/lang/String;

.field private isCompilation:Ljava/lang/Boolean;

.field private moods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private musicBrainzId:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private originalReleaseDate:Lcom/eddyizm/tempus/subsonic/models/ItemDate;

.field private playCount:Ljava/lang/Long;

.field private played:Ljava/util/Date;

.field private recordLabels:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/eddyizm/tempus/subsonic/models/RecordLabel;",
            ">;"
        }
    .end annotation
.end field

.field private releaseDate:Lcom/eddyizm/tempus/subsonic/models/ItemDate;

.field private releaseTypes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private songCount:Ljava/lang/Integer;

.field private sortName:Ljava/lang/String;

.field private starred:Ljava/util/Date;

.field private userRating:Ljava/lang/Integer;

.field private year:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/w4;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Ldefpackage/w4;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 29

    .line 32
    const v27, 0x3ffffff

    const/16 v28, 0x0

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

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v28}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Date;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/ItemDate;Lcom/eddyizm/tempus/subsonic/models/ItemDate;Ljava/lang/Boolean;Ljava/util/List;ILdefpackage/xj0;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Date;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/ItemDate;Lcom/eddyizm/tempus/subsonic/models/ItemDate;Ljava/lang/Boolean;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Long;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "I",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "+",
            "Lcom/eddyizm/tempus/subsonic/models/RecordLabel;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/eddyizm/tempus/subsonic/models/ItemGenre;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/eddyizm/tempus/subsonic/models/ArtistID3;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/eddyizm/tempus/subsonic/models/ItemDate;",
            "Lcom/eddyizm/tempus/subsonic/models/ItemDate;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "+",
            "Lcom/eddyizm/tempus/subsonic/models/DiscTitle;",
            ">;)V"
        }
    .end annotation

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->id:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->name:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->artist:Ljava/lang/String;

    .line 9
    iput-object p4, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->artistId:Ljava/lang/String;

    .line 10
    iput-object p5, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->coverArtId:Ljava/lang/String;

    .line 11
    iput-object p6, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->songCount:Ljava/lang/Integer;

    .line 12
    iput-object p7, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->duration:Ljava/lang/Integer;

    .line 13
    iput-object p8, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->playCount:Ljava/lang/Long;

    .line 14
    iput-object p9, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->created:Ljava/util/Date;

    .line 15
    iput-object p10, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->starred:Ljava/util/Date;

    .line 16
    iput p11, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->year:I

    .line 17
    iput-object p12, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->genre:Ljava/lang/String;

    .line 18
    iput-object p13, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->played:Ljava/util/Date;

    .line 19
    iput-object p14, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->userRating:Ljava/lang/Integer;

    .line 20
    iput-object p15, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->recordLabels:Ljava/util/List;

    move-object/from16 p1, p16

    .line 21
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->musicBrainzId:Ljava/lang/String;

    move-object/from16 p1, p17

    .line 22
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->genres:Ljava/util/List;

    move-object/from16 p1, p18

    .line 23
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->artists:Ljava/util/List;

    move-object/from16 p1, p19

    .line 24
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->displayArtist:Ljava/lang/String;

    move-object/from16 p1, p20

    .line 25
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->releaseTypes:Ljava/util/List;

    move-object/from16 p1, p21

    .line 26
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->moods:Ljava/util/List;

    move-object/from16 p1, p22

    .line 27
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->sortName:Ljava/lang/String;

    move-object/from16 p1, p23

    .line 28
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->originalReleaseDate:Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    move-object/from16 p1, p24

    .line 29
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->releaseDate:Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    move-object/from16 p1, p25

    .line 30
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->isCompilation:Ljava/lang/Boolean;

    move-object/from16 p1, p26

    .line 31
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->discTitles:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Date;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/ItemDate;Lcom/eddyizm/tempus/subsonic/models/ItemDate;Ljava/lang/Boolean;Ljava/util/List;ILdefpackage/xj0;)V
    .locals 26

    move/from16 v0, p27

    const/4 v1, 0x0

    .line 1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    and-int/lit8 v3, v0, 0x1

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    and-int/lit8 v5, v0, 0x2

    if-eqz v5, :cond_1

    const/4 v5, 0x0

    goto :goto_1

    :cond_1
    move-object/from16 v5, p2

    :goto_1
    and-int/lit8 v6, v0, 0x4

    if-eqz v6, :cond_2

    const/4 v6, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v6, p3

    :goto_2
    and-int/lit8 v7, v0, 0x8

    if-eqz v7, :cond_3

    const/4 v7, 0x0

    goto :goto_3

    :cond_3
    move-object/from16 v7, p4

    :goto_3
    and-int/lit8 v8, v0, 0x10

    if-eqz v8, :cond_4

    const/4 v8, 0x0

    goto :goto_4

    :cond_4
    move-object/from16 v8, p5

    :goto_4
    and-int/lit8 v9, v0, 0x20

    if-eqz v9, :cond_5

    move-object v9, v2

    goto :goto_5

    :cond_5
    move-object/from16 v9, p6

    :goto_5
    and-int/lit8 v10, v0, 0x40

    if-eqz v10, :cond_6

    move-object v10, v2

    goto :goto_6

    :cond_6
    move-object/from16 v10, p7

    :goto_6
    and-int/lit16 v11, v0, 0x80

    const-wide/16 v12, 0x0

    if-eqz v11, :cond_7

    .line 2
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    goto :goto_7

    :cond_7
    move-object/from16 v11, p8

    :goto_7
    and-int/lit16 v14, v0, 0x100

    if-eqz v14, :cond_8

    const/4 v14, 0x0

    goto :goto_8

    :cond_8
    move-object/from16 v14, p9

    :goto_8
    and-int/lit16 v15, v0, 0x200

    if-eqz v15, :cond_9

    const/4 v15, 0x0

    goto :goto_9

    :cond_9
    move-object/from16 v15, p10

    :goto_9
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_a

    const/4 v1, 0x0

    goto :goto_a

    :cond_a
    move/from16 v1, p11

    :goto_a
    and-int/lit16 v4, v0, 0x800

    if-eqz v4, :cond_b

    const/4 v4, 0x0

    goto :goto_b

    :cond_b
    move-object/from16 v4, p12

    :goto_b
    and-int/lit16 v12, v0, 0x1000

    if-eqz v12, :cond_c

    .line 3
    new-instance v12, Ljava/util/Date;

    move/from16 p3, v1

    move-object v13, v2

    const-wide/16 v1, 0x0

    invoke-direct {v12, v1, v2}, Ljava/util/Date;-><init>(J)V

    goto :goto_c

    :cond_c
    move/from16 p3, v1

    move-object v13, v2

    move-object/from16 v12, p13

    :goto_c
    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_d

    goto :goto_d

    :cond_d
    move-object/from16 v13, p14

    :goto_d
    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_e

    const/4 v1, 0x0

    goto :goto_e

    :cond_e
    move-object/from16 v1, p15

    :goto_e
    const v2, 0x8000

    and-int/2addr v2, v0

    if-eqz v2, :cond_f

    const/4 v2, 0x0

    goto :goto_f

    :cond_f
    move-object/from16 v2, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, v0, v16

    if-eqz v16, :cond_10

    const/16 v16, 0x0

    goto :goto_10

    :cond_10
    move-object/from16 v16, p17

    :goto_10
    const/high16 v17, 0x20000

    and-int v17, v0, v17

    if-eqz v17, :cond_11

    const/16 v17, 0x0

    goto :goto_11

    :cond_11
    move-object/from16 v17, p18

    :goto_11
    const/high16 v18, 0x40000

    and-int v18, v0, v18

    if-eqz v18, :cond_12

    const/16 v18, 0x0

    goto :goto_12

    :cond_12
    move-object/from16 v18, p19

    :goto_12
    const/high16 v19, 0x80000

    and-int v19, v0, v19

    if-eqz v19, :cond_13

    const/16 v19, 0x0

    goto :goto_13

    :cond_13
    move-object/from16 v19, p20

    :goto_13
    const/high16 v20, 0x100000

    and-int v20, v0, v20

    if-eqz v20, :cond_14

    const/16 v20, 0x0

    goto :goto_14

    :cond_14
    move-object/from16 v20, p21

    :goto_14
    const/high16 v21, 0x200000

    and-int v21, v0, v21

    if-eqz v21, :cond_15

    const/16 v21, 0x0

    goto :goto_15

    :cond_15
    move-object/from16 v21, p22

    :goto_15
    const/high16 v22, 0x400000

    and-int v22, v0, v22

    if-eqz v22, :cond_16

    const/16 v22, 0x0

    goto :goto_16

    :cond_16
    move-object/from16 v22, p23

    :goto_16
    const/high16 v23, 0x800000

    and-int v23, v0, v23

    if-eqz v23, :cond_17

    const/16 v23, 0x0

    goto :goto_17

    :cond_17
    move-object/from16 v23, p24

    :goto_17
    const/high16 v24, 0x1000000

    and-int v24, v0, v24

    if-eqz v24, :cond_18

    const/16 v24, 0x0

    goto :goto_18

    :cond_18
    move-object/from16 v24, p25

    :goto_18
    const/high16 v25, 0x2000000

    and-int v0, v0, v25

    if-eqz v0, :cond_19

    const/16 p27, 0x0

    :goto_19
    move-object/from16 p1, p0

    move/from16 p12, p3

    move-object/from16 p16, v1

    move-object/from16 p17, v2

    move-object/from16 p2, v3

    move-object/from16 p13, v4

    move-object/from16 p3, v5

    move-object/from16 p4, v6

    move-object/from16 p5, v7

    move-object/from16 p6, v8

    move-object/from16 p7, v9

    move-object/from16 p8, v10

    move-object/from16 p9, v11

    move-object/from16 p14, v12

    move-object/from16 p15, v13

    move-object/from16 p10, v14

    move-object/from16 p11, v15

    move-object/from16 p18, v16

    move-object/from16 p19, v17

    move-object/from16 p20, v18

    move-object/from16 p21, v19

    move-object/from16 p22, v20

    move-object/from16 p23, v21

    move-object/from16 p24, v22

    move-object/from16 p25, v23

    move-object/from16 p26, v24

    goto :goto_1a

    :cond_19
    move-object/from16 p27, p26

    goto :goto_19

    .line 4
    :goto_1a
    invoke-direct/range {p1 .. p27}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Date;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/ItemDate;Lcom/eddyizm/tempus/subsonic/models/ItemDate;Ljava/lang/Boolean;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final getArtist()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->artist:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getArtistId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->artistId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getArtists()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/ArtistID3;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->artists:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCoverArtId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->coverArtId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCreated()Ljava/util/Date;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->created:Ljava/util/Date;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDiscTitles()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/DiscTitle;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->discTitles:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDisplayArtist()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->displayArtist:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDuration()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->duration:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getGenre()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->genre:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getGenres()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/ItemGenre;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->genres:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getMoods()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->moods:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getMusicBrainzId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->musicBrainzId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOriginalReleaseDate()Lcom/eddyizm/tempus/subsonic/models/ItemDate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->originalReleaseDate:Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPlayCount()Ljava/lang/Long;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->playCount:Ljava/lang/Long;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPlayed()Ljava/util/Date;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->played:Ljava/util/Date;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getRecordLabels()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/RecordLabel;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->recordLabels:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getReleaseDate()Lcom/eddyizm/tempus/subsonic/models/ItemDate;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->releaseDate:Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getReleaseTypes()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->releaseTypes:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSongCount()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->songCount:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSortName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->sortName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getStarred()Ljava/util/Date;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->starred:Ljava/util/Date;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getUserRating()Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->userRating:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getYear()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->year:I

    .line 2
    .line 3
    return p0
.end method

.method public final isCompilation()Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->isCompilation:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setArtist(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->artist:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setArtistId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->artistId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setArtists(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/eddyizm/tempus/subsonic/models/ArtistID3;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->artists:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setCompilation(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->isCompilation:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-void
.end method

.method public final setCoverArtId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->coverArtId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setCreated(Ljava/util/Date;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->created:Ljava/util/Date;

    .line 2
    .line 3
    return-void
.end method

.method public final setDiscTitles(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/eddyizm/tempus/subsonic/models/DiscTitle;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->discTitles:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setDisplayArtist(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->displayArtist:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setDuration(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->duration:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setGenre(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->genre:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setGenres(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/eddyizm/tempus/subsonic/models/ItemGenre;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->genres:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setMoods(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->moods:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setMusicBrainzId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->musicBrainzId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setOriginalReleaseDate(Lcom/eddyizm/tempus/subsonic/models/ItemDate;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->originalReleaseDate:Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 2
    .line 3
    return-void
.end method

.method public final setPlayCount(Ljava/lang/Long;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->playCount:Ljava/lang/Long;

    .line 2
    .line 3
    return-void
.end method

.method public final setPlayed(Ljava/util/Date;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->played:Ljava/util/Date;

    .line 2
    .line 3
    return-void
.end method

.method public final setRecordLabels(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/eddyizm/tempus/subsonic/models/RecordLabel;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->recordLabels:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setReleaseDate(Lcom/eddyizm/tempus/subsonic/models/ItemDate;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->releaseDate:Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 2
    .line 3
    return-void
.end method

.method public final setReleaseTypes(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->releaseTypes:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setSongCount(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->songCount:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setSortName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->sortName:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setStarred(Ljava/util/Date;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->starred:Ljava/util/Date;

    .line 2
    .line 3
    return-void
.end method

.method public final setUserRating(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->userRating:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setYear(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->year:I

    .line 2
    .line 3
    return-void
.end method

.method public final strippedForNav()Lcom/eddyizm/tempus/subsonic/models/AlbumID3;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 4
    .line 5
    move-object v2, v1

    .line 6
    iget-object v1, v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->id:Ljava/lang/String;

    .line 7
    .line 8
    move-object v3, v2

    .line 9
    iget-object v2, v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->name:Ljava/lang/String;

    .line 10
    .line 11
    move-object v4, v3

    .line 12
    iget-object v3, v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->artist:Ljava/lang/String;

    .line 13
    .line 14
    move-object v5, v4

    .line 15
    iget-object v4, v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->artistId:Ljava/lang/String;

    .line 16
    .line 17
    move-object v6, v5

    .line 18
    iget-object v5, v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->coverArtId:Ljava/lang/String;

    .line 19
    .line 20
    move-object v7, v6

    .line 21
    iget-object v6, v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->songCount:Ljava/lang/Integer;

    .line 22
    .line 23
    move-object v8, v7

    .line 24
    iget-object v7, v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->duration:Ljava/lang/Integer;

    .line 25
    .line 26
    move-object v9, v8

    .line 27
    iget-object v8, v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->playCount:Ljava/lang/Long;

    .line 28
    .line 29
    move-object v10, v9

    .line 30
    iget-object v9, v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->created:Ljava/util/Date;

    .line 31
    .line 32
    move-object v11, v10

    .line 33
    iget-object v10, v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->starred:Ljava/util/Date;

    .line 34
    .line 35
    move-object v12, v11

    .line 36
    iget v11, v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->year:I

    .line 37
    .line 38
    move-object v13, v12

    .line 39
    iget-object v12, v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->genre:Ljava/lang/String;

    .line 40
    .line 41
    move-object v14, v13

    .line 42
    iget-object v13, v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->played:Ljava/util/Date;

    .line 43
    .line 44
    move-object v15, v14

    .line 45
    iget-object v14, v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->userRating:Ljava/lang/Integer;

    .line 46
    .line 47
    move-object/from16 v16, v1

    .line 48
    .line 49
    iget-object v1, v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->musicBrainzId:Ljava/lang/String;

    .line 50
    .line 51
    move-object/from16 v17, v1

    .line 52
    .line 53
    iget-object v1, v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->displayArtist:Ljava/lang/String;

    .line 54
    .line 55
    move-object/from16 v19, v1

    .line 56
    .line 57
    iget-object v1, v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->sortName:Ljava/lang/String;

    .line 58
    .line 59
    move-object/from16 v22, v1

    .line 60
    .line 61
    iget-object v1, v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->originalReleaseDate:Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 62
    .line 63
    move-object/from16 v23, v1

    .line 64
    .line 65
    iget-object v1, v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->releaseDate:Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 66
    .line 67
    move-object/from16 v24, v1

    .line 68
    .line 69
    iget-object v1, v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->isCompilation:Ljava/lang/Boolean;

    .line 70
    .line 71
    iget-object v0, v0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->discTitles:Ljava/util/List;

    .line 72
    .line 73
    const v27, 0x1b4000

    .line 74
    .line 75
    .line 76
    const/16 v28, 0x0

    .line 77
    .line 78
    move-object/from16 v26, v0

    .line 79
    .line 80
    move-object v0, v15

    .line 81
    const/4 v15, 0x0

    .line 82
    move-object/from16 v25, v1

    .line 83
    .line 84
    move-object/from16 v1, v16

    .line 85
    .line 86
    move-object/from16 v16, v17

    .line 87
    .line 88
    const/16 v17, 0x0

    .line 89
    .line 90
    const/16 v18, 0x0

    .line 91
    .line 92
    const/16 v20, 0x0

    .line 93
    .line 94
    const/16 v21, 0x0

    .line 95
    .line 96
    invoke-direct/range {v0 .. v28}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/util/Date;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/eddyizm/tempus/subsonic/models/ItemDate;Lcom/eddyizm/tempus/subsonic/models/ItemDate;Ljava/lang/Boolean;Ljava/util/List;ILdefpackage/xj0;)V

    .line 97
    .line 98
    .line 99
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->id:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->name:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->artist:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->artistId:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->coverArtId:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->songCount:Ljava/lang/Integer;

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    const/4 v2, 0x0

    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-static {p1, v1, v0}, Ldefpackage/xa3;->q(Landroid/os/Parcel;ILjava/lang/Integer;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->duration:Ljava/lang/Integer;

    .line 43
    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-static {p1, v1, v0}, Ldefpackage/xa3;->q(Landroid/os/Parcel;ILjava/lang/Integer;)V

    .line 51
    .line 52
    .line 53
    :goto_1
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->playCount:Ljava/lang/Long;

    .line 54
    .line 55
    if-nez v0, :cond_2

    .line 56
    .line 57
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 58
    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 65
    .line 66
    .line 67
    move-result-wide v3

    .line 68
    invoke-virtual {p1, v3, v4}, Landroid/os/Parcel;->writeLong(J)V

    .line 69
    .line 70
    .line 71
    :goto_2
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->created:Ljava/util/Date;

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->starred:Ljava/util/Date;

    .line 77
    .line 78
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 79
    .line 80
    .line 81
    iget v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->year:I

    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->genre:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->played:Ljava/util/Date;

    .line 92
    .line 93
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->userRating:Ljava/lang/Integer;

    .line 97
    .line 98
    if-nez v0, :cond_3

    .line 99
    .line 100
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_3
    invoke-static {p1, v1, v0}, Ldefpackage/xa3;->q(Landroid/os/Parcel;ILjava/lang/Integer;)V

    .line 105
    .line 106
    .line 107
    :goto_3
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->recordLabels:Ljava/util/List;

    .line 108
    .line 109
    if-nez v0, :cond_4

    .line 110
    .line 111
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 112
    .line 113
    .line 114
    goto :goto_5

    .line 115
    :cond_4
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 116
    .line 117
    .line 118
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 123
    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-eqz v3, :cond_5

    .line 134
    .line 135
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v3

    .line 139
    check-cast v3, Landroid/os/Parcelable;

    .line 140
    .line 141
    invoke-virtual {p1, v3, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_5
    :goto_5
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->musicBrainzId:Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->genres:Ljava/util/List;

    .line 151
    .line 152
    if-nez v0, :cond_6

    .line 153
    .line 154
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 155
    .line 156
    .line 157
    goto :goto_7

    .line 158
    :cond_6
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 159
    .line 160
    .line 161
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 166
    .line 167
    .line 168
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-eqz v3, :cond_7

    .line 177
    .line 178
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    check-cast v3, Landroid/os/Parcelable;

    .line 183
    .line 184
    invoke-virtual {p1, v3, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 185
    .line 186
    .line 187
    goto :goto_6

    .line 188
    :cond_7
    :goto_7
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->artists:Ljava/util/List;

    .line 189
    .line 190
    if-nez v0, :cond_8

    .line 191
    .line 192
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 193
    .line 194
    .line 195
    goto :goto_9

    .line 196
    :cond_8
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 197
    .line 198
    .line 199
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    invoke-virtual {p1, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 204
    .line 205
    .line 206
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result v3

    .line 214
    if-eqz v3, :cond_9

    .line 215
    .line 216
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object v3

    .line 220
    check-cast v3, Landroid/os/Parcelable;

    .line 221
    .line 222
    invoke-virtual {p1, v3, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 223
    .line 224
    .line 225
    goto :goto_8

    .line 226
    :cond_9
    :goto_9
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->displayArtist:Ljava/lang/String;

    .line 227
    .line 228
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->releaseTypes:Ljava/util/List;

    .line 232
    .line 233
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 234
    .line 235
    .line 236
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->moods:Ljava/util/List;

    .line 237
    .line 238
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 239
    .line 240
    .line 241
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->sortName:Ljava/lang/String;

    .line 242
    .line 243
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->originalReleaseDate:Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 247
    .line 248
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 249
    .line 250
    .line 251
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->releaseDate:Lcom/eddyizm/tempus/subsonic/models/ItemDate;

    .line 252
    .line 253
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 254
    .line 255
    .line 256
    iget-object v0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->isCompilation:Ljava/lang/Boolean;

    .line 257
    .line 258
    if-nez v0, :cond_a

    .line 259
    .line 260
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 261
    .line 262
    .line 263
    goto :goto_a

    .line 264
    :cond_a
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 272
    .line 273
    .line 274
    :goto_a
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->discTitles:Ljava/util/List;

    .line 275
    .line 276
    if-nez p0, :cond_b

    .line 277
    .line 278
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :cond_b
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 283
    .line 284
    .line 285
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 290
    .line 291
    .line 292
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 293
    .line 294
    .line 295
    move-result-object p0

    .line 296
    :goto_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    if-eqz v0, :cond_c

    .line 301
    .line 302
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    check-cast v0, Landroid/os/Parcelable;

    .line 307
    .line 308
    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 309
    .line 310
    .line 311
    goto :goto_b

    .line 312
    :cond_c
    return-void
.end method
