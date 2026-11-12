.class public Lcl4;
.super Lhd;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final c:Lpa;

.field public final d:Lk03;


# direct methods
.method public constructor <init>(Landroid/app/Application;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lhd;-><init>(Landroid/app/Application;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lk03;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p1, v0}, Lad2;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    new-instance p1, Lk03;

    .line 11
    .line 12
    invoke-direct {p1, v0}, Lad2;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lcl4;->d:Lk03;

    .line 16
    .line 17
    new-instance p1, Lpa;

    .line 18
    .line 19
    const/16 v0, 0xc

    .line 20
    .line 21
    invoke-direct {p1, v0}, Lpa;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcl4;->c:Lpa;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final c(Ljava/util/List;Lxj;)V
    .locals 7

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    :cond_0
    move-object v4, p2

    .line 10
    goto :goto_1

    .line 11
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    new-instance v3, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-direct {v3, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v1, Lr20;

    .line 46
    .line 47
    const/16 v6, 0xa

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    move-object v4, p2

    .line 51
    invoke-direct/range {v1 .. v6}, Lr20;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 52
    .line 53
    .line 54
    iget-object p2, p0, Lcl4;->c:Lpa;

    .line 55
    .line 56
    invoke-virtual {p2, v0, v1}, Lpa;->w(Ljava/lang/String;Ldk;)V

    .line 57
    .line 58
    .line 59
    move-object p2, v4

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    return-void

    .line 62
    :goto_1
    new-instance p0, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4, p0}, Lxj;->e(Ljava/util/ArrayList;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method
