.class public Lcom/eddyizm/tempus/subsonic/models/ArtistID3;
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
            "Lcom/eddyizm/tempus/subsonic/models/ArtistID3;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private albumCount:I

.field private coverArtId:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "coverArt"
    .end annotation
.end field

.field private id:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private starred:Ljava/util/Date;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lw4;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, Lw4;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 37
    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;ILxj0;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->id:Ljava/lang/String;

    .line 33
    iput-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->name:Ljava/lang/String;

    .line 34
    iput-object p3, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->coverArtId:Ljava/lang/String;

    .line 35
    iput p4, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->albumCount:I

    .line 36
    iput-object p5, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->starred:Ljava/util/Date;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;ILxj0;)V
    .locals 1

    .line 1
    and-int/lit8 p7, p6, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p7, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p7, p6, 0x2

    .line 8
    .line 9
    if-eqz p7, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    and-int/lit8 p7, p6, 0x4

    .line 13
    .line 14
    if-eqz p7, :cond_2

    .line 15
    .line 16
    move-object p3, v0

    .line 17
    :cond_2
    and-int/lit8 p7, p6, 0x8

    .line 18
    .line 19
    if-eqz p7, :cond_3

    .line 20
    .line 21
    const/4 p4, 0x0

    .line 22
    :cond_3
    and-int/lit8 p6, p6, 0x10

    .line 23
    .line 24
    if-eqz p6, :cond_4

    .line 25
    .line 26
    move-object p5, v0

    .line 27
    :cond_4
    invoke-direct/range {p0 .. p5}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;)V

    .line 28
    .line 29
    .line 30
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

.method public final getAlbumCount()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->albumCount:I

    .line 2
    .line 3
    return p0
.end method

.method public final getCoverArtId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->coverArtId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getStarred()Ljava/util/Date;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->starred:Ljava/util/Date;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setAlbumCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->albumCount:I

    .line 2
    .line 3
    return-void
.end method

.method public final setCoverArtId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->coverArtId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setStarred(Ljava/util/Date;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->starred:Ljava/util/Date;

    .line 2
    .line 3
    return-void
.end method

.method public final strippedForNav()Lcom/eddyizm/tempus/subsonic/models/ArtistID3;
    .locals 6

    .line 1
    new-instance v0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->id:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->name:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->coverArtId:Ljava/lang/String;

    .line 8
    .line 9
    iget v4, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->albumCount:I

    .line 10
    .line 11
    iget-object v5, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->starred:Ljava/util/Date;

    .line 12
    .line 13
    invoke-direct/range {v0 .. v5}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/Date;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->id:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->name:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->coverArtId:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget p2, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->albumCount:I

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->starred:Ljava/util/Date;

    .line 25
    .line 26
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeSerializable(Ljava/io/Serializable;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
