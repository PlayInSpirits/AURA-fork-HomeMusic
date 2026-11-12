.class public final Lgm3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:Lk03;

.field public final synthetic b:Lpz1;

.field public final synthetic c:I

.field public final synthetic d:Lcom/eddyizm/tempus/subsonic/models/Child;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lim3;


# direct methods
.method public constructor <init>(Lim3;Lk03;Lpz1;ILcom/eddyizm/tempus/subsonic/models/Child;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lgm3;->f:Lim3;

    .line 5
    .line 6
    iput-object p2, p0, Lgm3;->a:Lk03;

    .line 7
    .line 8
    iput-object p3, p0, Lgm3;->b:Lpz1;

    .line 9
    .line 10
    iput p4, p0, Lgm3;->c:I

    .line 11
    .line 12
    iput-object p5, p0, Lgm3;->d:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 13
    .line 14
    iput-object p6, p0, Lgm3;->e:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 8

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, Lgm3;->a:Lk03;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lad2;->j(La83;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iget-object v1, p0, Lgm3;->f:Lim3;

    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iput-object v0, v1, Lim3;->f:Ljava/lang/String;

    .line 14
    .line 15
    iget-object p0, p0, Lgm3;->b:Lpz1;

    .line 16
    .line 17
    invoke-virtual {p0}, Lpz1;->g()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 24
    .line 25
    .line 26
    iget p1, p0, Lgm3;->c:I

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-static {p1, v3}, Ljava/lang/Math;->min(II)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iget-object v3, p0, Lgm3;->d:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 37
    .line 38
    invoke-virtual {v2, p1, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    new-instance p1, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    invoke-direct {p1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    const/4 v4, 0x0

    .line 55
    move v5, v4

    .line 56
    :goto_0
    if-ge v5, v3, :cond_1

    .line 57
    .line 58
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    add-int/lit8 v5, v5, 0x1

    .line 63
    .line 64
    check-cast v6, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 65
    .line 66
    invoke-virtual {v6}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v6

    .line 70
    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_1
    iget-object v1, v1, Lim3;->c:Lmm3;

    .line 75
    .line 76
    new-instance v3, Lgp3;

    .line 77
    .line 78
    const/16 v5, 0x11

    .line 79
    .line 80
    invoke-direct {v3, p0, v2, v4, v5}, Lgp3;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-static {v4}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v2}, Lpn4;->g()Lrm3;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    const-string v6, "BrowsingClient"

    .line 98
    .line 99
    const-string v7, "createPlaylist()"

    .line 100
    .line 101
    invoke-static {v6, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    iget-object v6, v2, Lrm3;->o:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v6, Lqm3;

    .line 107
    .line 108
    iget-object v2, v2, Lrm3;->n:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v2, Lpn4;

    .line 111
    .line 112
    invoke-virtual {v2}, Lpn4;->f()Ljava/util/HashMap;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    iget-object p0, p0, Lgm3;->e:Ljava/lang/String;

    .line 117
    .line 118
    invoke-interface {v6, v2, p0, v0, p1}, Lqm3;->a(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)Lretrofit2/Call;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    new-instance p1, Lhd5;

    .line 123
    .line 124
    invoke-direct {p1, v1, v3, v4, v5}, Lhd5;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    .line 125
    .line 126
    .line 127
    invoke-interface {p0, p1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 128
    .line 129
    .line 130
    return-void
.end method
