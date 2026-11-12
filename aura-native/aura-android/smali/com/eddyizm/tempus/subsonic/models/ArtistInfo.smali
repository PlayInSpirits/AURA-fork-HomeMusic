.class public final Lcom/eddyizm/tempus/subsonic/models/ArtistInfo;
.super Lcom/eddyizm/tempus/subsonic/models/ArtistInfoBase;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private similarArtists:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/Artist;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/eddyizm/tempus/subsonic/models/ArtistInfoBase;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getSimilarArtists()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/Artist;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistInfo;->similarArtists:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setSimilarArtists(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/Artist;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistInfo;->similarArtists:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method
