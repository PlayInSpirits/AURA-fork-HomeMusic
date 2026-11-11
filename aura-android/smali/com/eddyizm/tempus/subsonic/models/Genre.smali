.class public final Lcom/eddyizm/tempus/subsonic/models/Genre;
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
            "Lcom/eddyizm/tempus/subsonic/models/Genre;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private albumCount:I

.field private genre:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "value"
    .end annotation
.end field

.field private songCount:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lhz0;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Lhz0;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/eddyizm/tempus/subsonic/models/Genre;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 25
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/eddyizm/tempus/subsonic/models/Genre;-><init>(Ljava/lang/String;IIILxj0;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/Genre;->genre:Ljava/lang/String;

    .line 23
    iput p2, p0, Lcom/eddyizm/tempus/subsonic/models/Genre;->songCount:I

    .line 24
    iput p3, p0, Lcom/eddyizm/tempus/subsonic/models/Genre;->albumCount:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IIILxj0;)V
    .locals 1

    .line 1
    and-int/lit8 p5, p4, 0x1

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    and-int/lit8 p5, p4, 0x2

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-eqz p5, :cond_1

    .line 10
    .line 11
    move p2, v0

    .line 12
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 13
    .line 14
    if-eqz p4, :cond_2

    .line 15
    .line 16
    move p3, v0

    .line 17
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/eddyizm/tempus/subsonic/models/Genre;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
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

.method public final getAlbumCount()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/subsonic/models/Genre;->albumCount:I

    .line 2
    .line 3
    return p0
.end method

.method public final getGenre()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/Genre;->genre:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSongCount()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/subsonic/models/Genre;->songCount:I

    .line 2
    .line 3
    return p0
.end method

.method public final setAlbumCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/eddyizm/tempus/subsonic/models/Genre;->albumCount:I

    .line 2
    .line 3
    return-void
.end method

.method public final setGenre(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/Genre;->genre:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setSongCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/eddyizm/tempus/subsonic/models/Genre;->songCount:I

    .line 2
    .line 3
    return-void
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/Genre;->genre:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget p2, p0, Lcom/eddyizm/tempus/subsonic/models/Genre;->songCount:I

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 12
    .line 13
    .line 14
    iget p0, p0, Lcom/eddyizm/tempus/subsonic/models/Genre;->albumCount:I

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeInt(I)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
