.class public final Lcom/eddyizm/tempus/subsonic/models/PlayQueue;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private changed:Ljava/util/Date;

.field private changedBy:Ljava/lang/String;

.field private current:Ljava/lang/String;

.field private entries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/eddyizm/tempus/subsonic/models/Child;",
            ">;"
        }
    .end annotation

    .annotation runtime Lka4;
        value = "entry"
    .end annotation
.end field

.field private position:Ljava/lang/Long;

.field private username:Ljava/lang/String;


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
.method public final getChanged()Ljava/util/Date;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->changed:Ljava/util/Date;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getChangedBy()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->changedBy:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getCurrent()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->current:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getEntries()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/subsonic/models/Child;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->entries:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPosition()Ljava/lang/Long;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->position:Ljava/lang/Long;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getUsername()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->username:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final setChanged(Ljava/util/Date;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->changed:Ljava/util/Date;

    .line 2
    .line 3
    return-void
.end method

.method public final setChangedBy(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->changedBy:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setCurrent(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->current:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setEntries(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/eddyizm/tempus/subsonic/models/Child;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->entries:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method public final setPosition(Ljava/lang/Long;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->position:Ljava/lang/Long;

    .line 2
    .line 3
    return-void
.end method

.method public final setUsername(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->username:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
