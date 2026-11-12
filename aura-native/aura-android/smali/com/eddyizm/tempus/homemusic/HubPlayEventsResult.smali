.class public final Lcom/eddyizm/tempus/homemusic/HubPlayEventsResult;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private accepted:I

.field private duplicates:I

.field private rejected:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;"
        }
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
.method public final getAccepted()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/homemusic/HubPlayEventsResult;->accepted:I

    .line 2
    .line 3
    return p0
.end method

.method public final getDuplicates()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/homemusic/HubPlayEventsResult;->duplicates:I

    .line 2
    .line 3
    return p0
.end method

.method public final getRejected()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/HubPlayEventsResult;->rejected:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setAccepted(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/eddyizm/tempus/homemusic/HubPlayEventsResult;->accepted:I

    .line 2
    .line 3
    return-void
.end method

.method public final setDuplicates(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/eddyizm/tempus/homemusic/HubPlayEventsResult;->duplicates:I

    .line 2
    .line 3
    return-void
.end method

.method public final setRejected(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/HubPlayEventsResult;->rejected:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method
