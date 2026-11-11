.class public final Lcom/eddyizm/tempus/homemusic/WaveNextIn;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final played:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/homemusic/PlayEvent;",
            ">;"
        }
    .end annotation
.end field

.field private final queued:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/homemusic/PlayEvent;",
            ">;",
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/eddyizm/tempus/homemusic/WaveNextIn;->played:Ljava/util/List;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/eddyizm/tempus/homemusic/WaveNextIn;->queued:Ljava/util/List;

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic compatible$default(Lcom/eddyizm/tempus/homemusic/WaveNextIn;ZZLjava/lang/String;ILjava/lang/Object;)Lcom/eddyizm/tempus/homemusic/WaveNextIn;
    .locals 0

    .line 1
    and-int/lit8 p5, p4, 0x2

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    move p2, p1

    .line 6
    :cond_0
    and-int/lit8 p4, p4, 0x4

    .line 7
    .line 8
    if-eqz p4, :cond_1

    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/eddyizm/tempus/homemusic/WaveNextIn;->compatible(ZZLjava/lang/String;)Lcom/eddyizm/tempus/homemusic/WaveNextIn;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method


# virtual methods
.method public final compatible(ZZLjava/lang/String;)Lcom/eddyizm/tempus/homemusic/WaveNextIn;
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/eddyizm/tempus/homemusic/WaveNextIn;->played:Ljava/util/List;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_2

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    move-object v3, v2

    .line 23
    check-cast v3, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 24
    .line 25
    const/4 v7, 0x4

    .line 26
    const/4 v8, 0x0

    .line 27
    const/4 v6, 0x0

    .line 28
    move v4, p1

    .line 29
    move v5, p2

    .line 30
    invoke-static/range {v3 .. v8}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->supported$default(Lcom/eddyizm/tempus/homemusic/PlayEvent;ZZZILjava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v3}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getAccount()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    invoke-virtual {v3}, Lcom/eddyizm/tempus/homemusic/PlayEvent;->getAccount()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1, p3}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_1

    .line 51
    .line 52
    :cond_0
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    :cond_1
    move p1, v4

    .line 56
    move p2, v5

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    const/16 p1, 0x1f4

    .line 59
    .line 60
    invoke-static {v1, p1}, Lq40;->L0(Ljava/util/List;I)Ljava/util/List;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/WaveNextIn;->queued:Ljava/util/List;

    .line 65
    .line 66
    new-instance p2, Lcom/eddyizm/tempus/homemusic/WaveNextIn;

    .line 67
    .line 68
    invoke-direct {p2, p1, p0}, Lcom/eddyizm/tempus/homemusic/WaveNextIn;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    return-object p2
.end method

.method public final getPlayed()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/eddyizm/tempus/homemusic/PlayEvent;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/WaveNextIn;->played:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getQueued()Ljava/util/List;
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
    iget-object p0, p0, Lcom/eddyizm/tempus/homemusic/WaveNextIn;->queued:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method
