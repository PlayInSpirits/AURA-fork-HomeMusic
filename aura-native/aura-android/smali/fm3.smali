.class public final Lfm3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:Lk03;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:I

.field public final synthetic d:Lim3;


# direct methods
.method public constructor <init>(Lim3;Lk03;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfm3;->d:Lim3;

    .line 5
    .line 6
    iput-object p2, p0, Lfm3;->a:Lk03;

    .line 7
    .line 8
    iput-object p3, p0, Lfm3;->b:Ljava/lang/String;

    .line 9
    .line 10
    iput p4, p0, Lfm3;->c:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, Lfm3;->a:Lk03;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lad2;->j(La83;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lfm3;->d:Lim3;

    .line 9
    .line 10
    iget-object v1, v0, Lim3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 11
    .line 12
    iget-object v2, v0, Lim3;->j:Lk03;

    .line 13
    .line 14
    if-eqz v1, :cond_5

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v3, p0, Lfm3;->b:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    iget-object v1, v0, Lim3;->f:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iget p0, p0, Lfm3;->c:I

    .line 36
    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    iget v1, v0, Lim3;->h:I

    .line 40
    .line 41
    if-eq p0, v1, :cond_1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v1, 0x0

    .line 45
    goto :goto_1

    .line 46
    :cond_2
    :goto_0
    const/4 v1, 0x1

    .line 47
    :goto_1
    if-nez p1, :cond_3

    .line 48
    .line 49
    if-nez v1, :cond_5

    .line 50
    .line 51
    invoke-virtual {v2}, Lad2;->d()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-nez p0, :cond_5

    .line 56
    .line 57
    invoke-virtual {v0, v3}, Lim3;->g(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_3
    if-eqz v1, :cond_4

    .line 62
    .line 63
    invoke-virtual {v2}, Lad2;->d()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    if-eqz v1, :cond_4

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_4
    iput p0, v0, Lim3;->i:I

    .line 71
    .line 72
    invoke-virtual {v2, p1}, Lad2;->k(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_5
    :goto_2
    return-void
.end method
