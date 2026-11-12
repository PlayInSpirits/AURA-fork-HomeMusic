.class public final Lcom/eddyizm/tempus/subsonic/models/ArtistsID3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private ignoredArticles:Ljava/lang/String;

.field private indices:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/IndexID3;",
            ">;"
        }
    .end annotation

    .annotation runtime Lka4;
        value = "index"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final getIgnoredArticles()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistsID3;->ignoredArticles:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getIndices()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/IndexID3;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistsID3;->indices:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setIgnoredArticles(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistsID3;->ignoredArticles:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setIndices(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/IndexID3;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/ArtistsID3;->indices:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method
