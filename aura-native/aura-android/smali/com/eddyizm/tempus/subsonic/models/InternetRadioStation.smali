.class public final Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;
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
            "Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private coverArt:Ljava/lang/String;

.field private homePageUrl:Ljava/lang/String;
    .annotation runtime Lka4;
        alternate = {
            "homepageUrl"
        }
        value = "homePageUrl"
    .end annotation
.end field

.field private id:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private source:Ljava/lang/String;

.field private streamUrl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lhz0;

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lhz0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>()V
    .locals 9

    .line 43
    const/16 v7, 0x3f

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILxj0;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->id:Ljava/lang/String;

    .line 38
    iput-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->name:Ljava/lang/String;

    .line 39
    iput-object p3, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->streamUrl:Ljava/lang/String;

    .line 40
    iput-object p4, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->homePageUrl:Ljava/lang/String;

    .line 41
    iput-object p5, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->coverArt:Ljava/lang/String;

    .line 42
    iput-object p6, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->source:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILxj0;)V
    .locals 1

    .line 1
    and-int/lit8 p8, p7, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p8, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p8, p7, 0x2

    .line 8
    .line 9
    if-eqz p8, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    and-int/lit8 p8, p7, 0x4

    .line 13
    .line 14
    if-eqz p8, :cond_2

    .line 15
    .line 16
    move-object p3, v0

    .line 17
    :cond_2
    and-int/lit8 p8, p7, 0x8

    .line 18
    .line 19
    if-eqz p8, :cond_3

    .line 20
    .line 21
    move-object p4, v0

    .line 22
    :cond_3
    and-int/lit8 p8, p7, 0x10

    .line 23
    .line 24
    if-eqz p8, :cond_4

    .line 25
    .line 26
    move-object p5, v0

    .line 27
    :cond_4
    and-int/lit8 p7, p7, 0x20

    .line 28
    .line 29
    if-eqz p7, :cond_5

    .line 30
    .line 31
    move-object p6, v0

    .line 32
    :cond_5
    invoke-direct/range {p0 .. p6}, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
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

.method public final getCoverArt()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->coverArt:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getHomePageUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->homePageUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSource()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->source:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getStreamUrl()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->streamUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setCoverArt(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->coverArt:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setHomePageUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->homePageUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setSource(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->source:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setStreamUrl(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->streamUrl:Ljava/lang/String;

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
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->id:Ljava/lang/String;

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->name:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->streamUrl:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->homePageUrl:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object p2, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->coverArt:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/InternetRadioStation;->source:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
