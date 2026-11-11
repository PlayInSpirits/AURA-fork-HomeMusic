.class public final Lhm3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements La83;


# instance fields
.field public final synthetic a:Lk03;

.field public final synthetic b:Z

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:I

.field public final synthetic e:Lim3;


# direct methods
.method public constructor <init>(Lim3;Lk03;ZLjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhm3;->e:Lim3;

    .line 5
    .line 6
    iput-object p2, p0, Lhm3;->a:Lk03;

    .line 7
    .line 8
    iput-boolean p3, p0, Lhm3;->b:Z

    .line 9
    .line 10
    iput-object p4, p0, Lhm3;->c:Ljava/lang/String;

    .line 11
    .line 12
    iput p5, p0, Lhm3;->d:I

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    iget-object v0, p0, Lhm3;->a:Lk03;

    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lad2;->j(La83;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lhm3;->c:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, p0, Lhm3;->e:Lim3;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    iget-boolean v2, p0, Lhm3;->b:Z

    .line 15
    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    iget-object v2, v1, Lim3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v2}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    invoke-static {v1, v0, p0}, Lim3;->c(Lim3;Ljava/lang/String;Z)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    const/4 v2, 0x0

    .line 38
    iput-object v2, v1, Lim3;->f:Ljava/lang/String;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    iget v2, v1, Lim3;->i:I

    .line 43
    .line 44
    iget p0, p0, Lhm3;->d:I

    .line 45
    .line 46
    if-gt v2, p0, :cond_1

    .line 47
    .line 48
    invoke-virtual {v1, v0}, Lim3;->e(Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_1

    .line 53
    .line 54
    iget p0, v1, Lim3;->h:I

    .line 55
    .line 56
    iput p0, v1, Lim3;->i:I

    .line 57
    .line 58
    iget-object p0, v1, Lim3;->j:Lk03;

    .line 59
    .line 60
    invoke-virtual {p0, p1}, Lad2;->k(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void
.end method
