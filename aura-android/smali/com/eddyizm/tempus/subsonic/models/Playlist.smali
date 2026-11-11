.class public Lcom/eddyizm/tempus/subsonic/models/Playlist;
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
            "Lcom/eddyizm/tempus/subsonic/models/Playlist;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private allowedUsers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private changed:Ljava/util/Date;

.field private comment:Ljava/lang/String;

.field private coverArtId:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "coverArt"
    .end annotation
.end field

.field private created:Ljava/util/Date;

.field private duration:J

.field private id:Ljava/lang/String;

.field private isUniversal:Ljava/lang/Boolean;
    .annotation runtime Lka4;
        value = "public"
    .end annotation
.end field

.field private lastPlayed:J

.field private name:Ljava/lang/String;

.field private owner:Ljava/lang/String;

.field private songCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lb23;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lb23;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->id:Ljava/lang/String;

    .line 39
    iput-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->name:Ljava/lang/String;

    .line 40
    iput-wide p3, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->duration:J

    .line 41
    iput-object p5, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->coverArtId:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILxj0;)V
    .locals 1

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_1

    const-wide/16 p3, 0x0

    :cond_1
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_2

    move-object p5, v0

    .line 36
    :cond_2
    invoke-direct/range {p0 .. p5}, Lcom/eddyizm/tempus/subsonic/models/Playlist;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;IJLjava/util/Date;Ljava/util/Date;Ljava/lang/String;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            "IJ",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-object v0, p0

    .line 5
    move-object v1, p1

    .line 6
    move-object v2, p2

    .line 7
    move-wide v3, p7

    .line 8
    move-object/from16 v5, p11

    .line 9
    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/eddyizm/tempus/subsonic/models/Playlist;-><init>(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object p3, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->comment:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p4, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->owner:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p5, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->isUniversal:Ljava/lang/Boolean;

    .line 18
    .line 19
    iput p6, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->songCount:I

    .line 20
    .line 21
    iput-object p9, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->created:Ljava/util/Date;

    .line 22
    .line 23
    move-object/from16 p1, p10

    .line 24
    .line 25
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->changed:Ljava/util/Date;

    .line 26
    .line 27
    const-wide/16 p1, 0x0

    .line 28
    .line 29
    iput-wide p1, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->lastPlayed:J

    .line 30
    .line 31
    move-object/from16 p1, p12

    .line 32
    .line 33
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->allowedUsers:Ljava/util/List;

    .line 34
    .line 35
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

.method public final getAllowedUsers()Ljava/util/List;
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
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->allowedUsers:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getChanged()Ljava/util/Date;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->changed:Ljava/util/Date;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getComment()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->comment:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCoverArtId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->coverArtId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCreated()Ljava/util/Date;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->created:Ljava/util/Date;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDuration()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->duration:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLastPlayed()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->lastPlayed:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOwner()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->owner:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSongCount()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->songCount:I

    .line 2
    .line 3
    return p0
.end method

.method public final isUniversal()Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->isUniversal:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setAllowedUsers(Ljava/util/List;)V
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
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->allowedUsers:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setChanged(Ljava/util/Date;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->changed:Ljava/util/Date;

    .line 2
    .line 3
    return-void
.end method

.method public final setComment(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->comment:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setCoverArtId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->coverArtId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setCreated(Ljava/util/Date;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->created:Ljava/util/Date;

    .line 2
    .line 3
    return-void
.end method

.method public final setDuration(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->duration:J

    .line 2
    .line 3
    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->id:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public final setLastPlayed(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->lastPlayed:J

    .line 2
    .line 3
    return-void
.end method

.method public final setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setOwner(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->owner:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setSongCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->songCount:I

    .line 2
    .line 3
    return-void
.end method

.method public final setUniversal(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->isUniversal:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->id:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->name:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-wide v0, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->duration:J

    .line 15
    .line 16
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 17
    .line 18
    .line 19
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/Playlist;->coverArtId:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
