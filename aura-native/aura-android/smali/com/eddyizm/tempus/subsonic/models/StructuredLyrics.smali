.class public final Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private displayArtist:Ljava/lang/String;

.field private displayTitle:Ljava/lang/String;

.field private lang:Ljava/lang/String;

.field private line:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/Line;",
            ">;"
        }
    .end annotation
.end field

.field private offset:I

.field private synced:Z


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
.method public final getDisplayArtist()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;->displayArtist:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDisplayTitle()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;->displayTitle:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLang()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;->lang:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLine()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/Line;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;->line:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOffset()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;->offset:I

    .line 2
    .line 3
    return p0
.end method

.method public final getSynced()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;->synced:Z

    .line 2
    .line 3
    return p0
.end method

.method public final setDisplayArtist(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;->displayArtist:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setDisplayTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;->displayTitle:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setLang(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;->lang:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setLine(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/Line;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;->line:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setOffset(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;->offset:I

    .line 2
    .line 3
    return-void
.end method

.method public final setSynced(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/subsonic/models/StructuredLyrics;->synced:Z

    .line 2
    .line 3
    return-void
.end method
