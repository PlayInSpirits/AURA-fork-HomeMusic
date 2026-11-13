.class public final synthetic Ldefpackage/ts3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ldefpackage/vs3;

.field public final synthetic o:I

.field public final synthetic p:Z

.field public final synthetic q:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/vs3;IZLjava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/ts3;->n:Ldefpackage/vs3;

    .line 5
    .line 6
    iput p2, p0, Ldefpackage/ts3;->o:I

    .line 7
    .line 8
    iput-boolean p3, p0, Ldefpackage/ts3;->p:Z

    .line 9
    .line 10
    iput-object p4, p0, Ldefpackage/ts3;->q:Ljava/util/List;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-object v0, p0, Ldefpackage/ts3;->n:Ldefpackage/vs3;

    .line 2
    .line 3
    iget-object v1, v0, Ldefpackage/vs3;->a:Ldefpackage/ns3;

    .line 4
    .line 5
    new-instance v2, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iget-boolean v3, p0, Ldefpackage/ts3;->p:Z

    .line 11
    .line 12
    const/4 v4, 0x0

    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    invoke-virtual {v1}, Ldefpackage/ns3;->c()Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget v3, p0, Ldefpackage/ts3;->o:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v3, v4

    .line 23
    :goto_0
    if-gez v3, :cond_1

    .line 24
    .line 25
    move v3, v4

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-le v3, v5, :cond_2

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    :cond_2
    :goto_1
    new-instance v5, Ljava/util/ArrayList;

    .line 38
    .line 39
    iget-object p0, p0, Ldefpackage/ts3;->q:Ljava/util/List;

    .line 40
    .line 41
    invoke-direct {v5, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v5}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    new-instance v5, Ldefpackage/tj;

    .line 49
    .line 50
    invoke-direct {v5, v0, v2}, Ldefpackage/tj;-><init>(Ldefpackage/vs3;Ljava/util/List;)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p0, v5}, Ljava/util/stream/Stream;->filter(Ljava/util/function/Predicate;)Ljava/util/stream/Stream;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, Ljava/util/List;

    .line 66
    .line 67
    move v0, v4

    .line 68
    :goto_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-ge v0, v5, :cond_3

    .line 73
    .line 74
    add-int v5, v3, v0

    .line 75
    .line 76
    new-instance v6, Lcom/eddyizm/tempus/model/Queue;

    .line 77
    .line 78
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    check-cast v7, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 83
    .line 84
    invoke-direct {v6, v7}, Lcom/eddyizm/tempus/model/Queue;-><init>(Lcom/eddyizm/tempus/subsonic/models/Child;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v2, v5, v6}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    add-int/lit8 v0, v0, 0x1

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    move p0, v4

    .line 94
    :goto_3
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-ge p0, v0, :cond_4

    .line 99
    .line 100
    invoke-interface {v2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    check-cast v0, Lcom/eddyizm/tempus/model/Queue;

    .line 105
    .line 106
    invoke-virtual {v0, p0}, Lcom/eddyizm/tempus/model/Queue;->setTrackOrder(I)V

    .line 107
    .line 108
    .line 109
    add-int/lit8 p0, p0, 0x1

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_4
    iget-object p0, v1, Ldefpackage/ns3;->o:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p0, Ldefpackage/s24;

    .line 115
    .line 116
    new-instance v0, Ldefpackage/ls3;

    .line 117
    .line 118
    invoke-direct {v0, v1, v2, v4}, Ldefpackage/ls3;-><init>(Ldefpackage/ns3;Ljava/util/List;I)V

    .line 119
    .line 120
    .line 121
    const/4 v1, 0x1

    .line 122
    invoke-static {p0, v4, v1, v0}, Ldefpackage/xl;->E(Ldefpackage/s24;ZZLdefpackage/if1;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    return-void
.end method
