.class public final Lcom/eddyizm/tempus/homemusic/SmartSession;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/eddyizm/tempus/homemusic/SmartSession$Companion;
    }
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/eddyizm/tempus/homemusic/SmartSession$Companion;

.field public static final LOW_WATER:I = 0x1

.field public static final MAX_SONGS:I = 0x1388

.field private static final REACTIONS:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private again:Z

.field private final context:Ljava/lang/String;

.field private failures:I

.field private id:Ljava/lang/String;

.field private inFlight:Z

.field private final listed:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final original:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final ownIds:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private polls:I

.field private final recs:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final title:Ljava/lang/String;

.field private final unsent:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/eddyizm/tempus/homemusic/PlayEvent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/eddyizm/tempus/homemusic/SmartSession$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/eddyizm/tempus/homemusic/SmartSession$Companion;-><init>(Lxj0;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/eddyizm/tempus/homemusic/SmartSession;->Companion:Lcom/eddyizm/tempus/homemusic/SmartSession$Companion;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/eddyizm/tempus/homemusic/SmartSession;->$stable:I

    .line 12
    .line 13
    const-string v0, "like"

    .line 14
    .line 15
    const-string v1, "dislike"

    .line 16
    .line 17
    const-string v2, "skip"

    .line 18
    .line 19
    const-string v3, "finish"

    .line 20
    .line 21
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lti;->t0([Ljava/lang/Object;)Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lcom/eddyizm/tempus/homemusic/SmartSession;->REACTIONS:Ljava/util/Set;

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
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
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->context:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p3, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->title:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p4, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->original:Ljava/util/List;

    .line 18
    .line 19
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->id:Ljava/lang/String;

    .line 20
    .line 21
    new-instance p1, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->recs:Ljava/util/HashMap;

    .line 27
    .line 28
    new-instance p1, Ljava/util/HashSet;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result p3

    .line 41
    if-eqz p3, :cond_0

    .line 42
    .line 43
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    check-cast p3, Ljava/lang/String;

    .line 48
    .line 49
    sget-object p4, Lcom/eddyizm/tempus/homemusic/SmartContexts;->INSTANCE:Lcom/eddyizm/tempus/homemusic/SmartContexts;

    .line 50
    .line 51
    invoke-virtual {p4, p3}, Lcom/eddyizm/tempus/homemusic/SmartContexts;->mediaId(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    invoke-virtual {p1, p3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->listed:Ljava/util/HashSet;

    .line 60
    .line 61
    new-instance p2, Ljava/util/HashSet;

    .line 62
    .line 63
    invoke-direct {p2, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 64
    .line 65
    .line 66
    iput-object p2, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->ownIds:Ljava/util/HashSet;

    .line 67
    .line 68
    new-instance p1, Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 71
    .line 72
    .line 73
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->unsent:Ljava/util/ArrayList;

    .line 74
    .line 75
    return-void
.end method

.method public static synthetic a(Ljava/util/HashSet;Lcom/eddyizm/tempus/homemusic/PlayEvent;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/eddyizm/tempus/homemusic/SmartSession;->sent$lambda$1(Ljava/util/HashSet;Lcom/eddyizm/tempus/homemusic/PlayEvent;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final sent$lambda$1(Ljava/util/HashSet;Lcom/eddyizm/tempus/homemusic/PlayEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getEventId()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method


# virtual methods
.method public final accept(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->recs:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/lang/String;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v1, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->recs:Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->recs:Ljava/util/HashMap;

    .line 21
    .line 22
    const-string v2, "hub:"

    .line 23
    .line 24
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->ownIds:Ljava/util/HashSet;

    .line 32
    .line 33
    invoke-interface {p0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final expire()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->unsent:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getAgain()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->again:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getContext()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->context:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getFailures()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->failures:I

    .line 2
    .line 3
    return p0
.end method

.method public final getId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->id:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getInFlight()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->inFlight:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getOriginal()Ljava/util/List;
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
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->original:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPolls()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->polls:I

    .line 2
    .line 3
    return p0
.end method

.method public final getRecContext()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/eddyizm/tempus/homemusic/SmartContexts;->INSTANCE:Lcom/eddyizm/tempus/homemusic/SmartContexts;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->id:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/eddyizm/tempus/homemusic/SmartContexts;->recommendation(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->title:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final isListed(Ljava/lang/String;)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->listed:Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final isOwn(Ljava/lang/String;)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->ownIds:Ljava/util/HashSet;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final isRec(Ljava/lang/String;)Z
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->recs:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final onEvent(Lcom/eddyizm/tempus/homemusic/PlayEvent;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getContext()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p0}, Lcom/eddyizm/tempus/homemusic/SmartSession;->getRecContext()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v0, v1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getContext()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    iget-object v3, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->context:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v2, v3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_0

    .line 30
    .line 31
    return v1

    .line 32
    :cond_0
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->unsent:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-interface {p0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getKind()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const-string v2, "start"

    .line 44
    .line 45
    invoke-static {p0, v2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-nez p0, :cond_3

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    sget-object p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->REACTIONS:Ljava/util/Set;

    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getKind()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    return v1

    .line 67
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 68
    return p0
.end method

.method public final recIds()Ljava/util/Set;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->recs:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, Ljava/lang/Iterable;

    .line 11
    .line 12
    invoke-static {p0}, Lq40;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final refOf(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->recs:Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, Ljava/lang/String;

    .line 11
    .line 12
    return-object p0
.end method

.method public final register(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/homemusic/SmartRec;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_5

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Lcom/eddyizm/tempus/homemusic/SmartRec;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/WaveTrack;->getRef()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const/4 v3, 0x0

    .line 30
    if-eqz v2, :cond_4

    .line 31
    .line 32
    invoke-static {v2}, Lqm4;->u0(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-nez v4, :cond_1

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move-object v2, v3

    .line 40
    :goto_1
    if-nez v2, :cond_2

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/SmartRec;->getQueueId()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-nez v1, :cond_3

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_3
    iget-object v3, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->recs:Ljava/util/HashMap;

    .line 51
    .line 52
    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    iget-object v3, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->recs:Ljava/util/HashMap;

    .line 56
    .line 57
    const-string v4, "hub:"

    .line 58
    .line 59
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-object v3, v1

    .line 67
    :cond_4
    :goto_2
    if-eqz v3, :cond_0

    .line 68
    .line 69
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_5
    return-object v0
.end method

.method public final sent(Lcom/eddyizm/tempus/homemusic/SmartNextIn;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/SmartNextIn;->getPlayed()Ljava/util/List;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance v0, Ljava/util/HashSet;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 28
    .line 29
    invoke-virtual {v1}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getEventId()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->unsent:Ljava/util/ArrayList;

    .line 38
    .line 39
    new-instance p1, Lkh3;

    .line 40
    .line 41
    const/4 v1, 0x1

    .line 42
    invoke-direct {p1, v0, v1}, Lkh3;-><init>(Ljava/util/HashSet;I)V

    .line 43
    .line 44
    .line 45
    invoke-static {p0, p1}, Lv40;->p0(Ljava/util/List;Lif1;)Z

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final setAgain(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->again:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setFailures(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->failures:I

    .line 2
    .line 3
    return-void
.end method

.method public final setInFlight(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->inFlight:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setPolls(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->polls:I

    .line 2
    .line 3
    return-void
.end method

.method public final snapshot(Ljava/lang/String;)Lcom/eddyizm/tempus/homemusic/SmartNextIn;
    .locals 1

    .line 1
    new-instance v0, Lcom/eddyizm/tempus/homemusic/SmartNextIn;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/SmartSession;->unsent:Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-static {p0}, Lq40;->Q0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0, p1}, Lcom/eddyizm/tempus/homemusic/SmartNextIn;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
