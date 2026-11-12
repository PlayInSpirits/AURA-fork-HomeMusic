.class public final synthetic Lvi3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/function/IntPredicate;


# instance fields
.field public final synthetic a:Lcom/eddyizm/tempus/subsonic/models/PlayQueue;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/subsonic/models/PlayQueue;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvi3;->a:Lcom/eddyizm/tempus/subsonic/models/PlayQueue;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final test(I)Z
    .locals 1

    .line 1
    iget-object p0, p0, Lvi3;->a:Lcom/eddyizm/tempus/subsonic/models/PlayQueue;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->getEntries()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/PlayQueue;->getCurrent()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0
.end method
