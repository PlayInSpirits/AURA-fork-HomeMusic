.class public final synthetic Lwi4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:Lxi4;

.field public final synthetic b:Lk03;

.field public final synthetic c:Ljava/util/HashSet;

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lxi4;Lk03;Ljava/util/HashSet;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwi4;->a:Lxi4;

    .line 5
    .line 6
    iput-object p2, p0, Lwi4;->b:Lk03;

    .line 7
    .line 8
    iput-object p3, p0, Lwi4;->c:Ljava/util/HashSet;

    .line 9
    .line 10
    iput p4, p0, Lwi4;->d:I

    .line 11
    .line 12
    iput-object p5, p0, Lwi4;->e:Ljava/lang/String;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lwi4;->b:Lk03;

    .line 2
    .line 3
    invoke-virtual {v0}, Lad2;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/util/List;

    .line 8
    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    iget-object v3, p0, Lwi4;->c:Ljava/util/HashSet;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 28
    .line 29
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-virtual {v3, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    if-nez v4, :cond_0

    .line 38
    .line 39
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    iget v2, p0, Lwi4;->d:I

    .line 55
    .line 56
    div-int/lit8 v4, v2, 0x2

    .line 57
    .line 58
    if-ge p1, v4, :cond_2

    .line 59
    .line 60
    new-instance p1, Leg0;

    .line 61
    .line 62
    const/16 v4, 0xb

    .line 63
    .line 64
    invoke-direct {p1, v3, v1, v0, v4}, Leg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 65
    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    invoke-static {v0}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Lpn4;->c()Lgp3;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    const-string v1, "BrowsingClient"

    .line 80
    .line 81
    const-string v3, "getSimilarSongs()"

    .line 82
    .line 83
    invoke-static {v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    iget-object v1, v0, Lgp3;->p:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v1, Lov;

    .line 89
    .line 90
    iget-object v0, v0, Lgp3;->o:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, Lpn4;

    .line 93
    .line 94
    invoke-virtual {v0}, Lpn4;->f()Ljava/util/HashMap;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    iget-object v3, p0, Lwi4;->e:Ljava/lang/String;

    .line 99
    .line 100
    invoke-interface {v1, v0, v3, v2}, Lov;->g(Ljava/util/Map;Ljava/lang/String;I)Lretrofit2/Call;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    new-instance v1, Lue1;

    .line 105
    .line 106
    const/16 v3, 0xe

    .line 107
    .line 108
    iget-object p0, p0, Lwi4;->a:Lxi4;

    .line 109
    .line 110
    invoke-direct {v1, p0, v2, p1, v3}, Lue1;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v0, v1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_2
    invoke-virtual {v0, v1}, Lad2;->i(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_3
    return-void
.end method
