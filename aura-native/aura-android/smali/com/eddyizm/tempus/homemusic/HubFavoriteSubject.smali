.class public final Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private aliases:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private liked:Z

.field private ndId:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "nd_id"
    .end annotation
.end field

.field private provenance:Ljava/lang/String;

.field private ref:Ljava/lang/String;

.field private targetType:Ljava/lang/String;
    .annotation runtime Lka4;
        value = "target_type"
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
.method public final getAliases()Ljava/util/List;
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
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;->aliases:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getLiked()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;->liked:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getNdId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;->ndId:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getProvenance()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;->provenance:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getRef()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;->ref:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getTargetType()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;->targetType:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setAliases(Ljava/util/List;)V
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
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;->aliases:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setLiked(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;->liked:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setNdId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;->ndId:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setProvenance(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;->provenance:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setRef(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;->ref:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setTargetType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubFavoriteSubject;->targetType:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
