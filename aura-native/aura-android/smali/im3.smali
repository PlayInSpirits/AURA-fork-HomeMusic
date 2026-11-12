.class public Lim3;
.super Lhd;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final c:Lmm3;

.field public final d:Ld8;

.field public e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:I

.field public i:I

.field public final j:Lk03;

.field public final k:Lk03;


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
    invoke-direct {p1}, Lad2;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lim3;->j:Lk03;

    .line 10
    .line 11
    new-instance p1, Lk03;

    .line 12
    .line 13
    invoke-direct {p1}, Lad2;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lim3;->k:Lk03;

    .line 17
    .line 18
    new-instance p1, Lmm3;

    .line 19
    .line 20
    invoke-direct {p1}, Lmm3;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lim3;->c:Lmm3;

    .line 24
    .line 25
    new-instance p1, Ld8;

    .line 26
    .line 27
    const/16 v0, 0x15

    .line 28
    .line 29
    invoke-direct {p1, v0, p0}, Ld8;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lim3;->d:Ld8;

    .line 33
    .line 34
    sget-object p0, Lmm3;->e:Lk03;

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Lad2;->f(La83;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public static c(Lim3;Ljava/lang/String;Z)V
    .locals 9

    .line 1
    iget-object v0, p0, Lim3;->c:Lmm3;

    .line 2
    .line 3
    new-instance v1, Lem3;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, p0, p1, v2}, Lem3;-><init>(Lim3;Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {v0, p1, v2, v1}, Lmm3;->c(Ljava/lang/String;ZLjava/lang/Runnable;)Lk03;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    iget v8, p0, Lim3;->h:I

    .line 15
    .line 16
    new-instance v3, Lhm3;

    .line 17
    .line 18
    move-object v4, p0

    .line 19
    move-object v7, p1

    .line 20
    move v6, p2

    .line 21
    invoke-direct/range {v3 .. v8}, Lhm3;-><init>(Lim3;Lk03;ZLjava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v5, v3}, Lad2;->f(La83;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lim3;->c:Lmm3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lmm3;->e:Lk03;

    .line 7
    .line 8
    iget-object p0, p0, Lim3;->d:Ld8;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Lad2;->j(La83;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final d()Lad2;
    .locals 2

    .line 1
    iget-object v0, p0, Lim3;->j:Lk03;

    .line 2
    .line 3
    invoke-virtual {v0}, Lad2;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lim3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, Lim3;->h()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-object v0
.end method

.method public final e(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lim3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget p1, p0, Lim3;->h:I

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    add-int/2addr p1, v0

    .line 20
    iput p1, p0, Lim3;->h:I

    .line 21
    .line 22
    return v0

    .line 23
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final f()Lad2;
    .locals 5

    .line 1
    iget-object v0, p0, Lim3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance p0, Lk03;

    .line 6
    .line 7
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-direct {p0, v0}, Lad2;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object p0, p0, Lim3;->c:Lmm3;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lud3;->D()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    new-instance p0, Lk03;

    .line 29
    .line 30
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-direct {p0, v0}, Lad2;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_1
    iget-object p0, p0, Lmm3;->d:Lqp4;

    .line 37
    .line 38
    iget-object p0, p0, Lqp4;->a:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Ls24;

    .line 41
    .line 42
    invoke-virtual {p0}, Ls24;->i()Ls12;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const-string v2, "synced_playlist"

    .line 47
    .line 48
    filled-new-array {v2}, [Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    new-instance v3, Lps0;

    .line 53
    .line 54
    const/4 v4, 0x2

    .line 55
    invoke-direct {v3, v4, v0, v1}, Lps0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v2, v3}, Ls12;->a([Ljava/lang/String;Lif1;)Lt24;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method

.method public final g(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lim3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lim3;->g:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    iput-object p1, p0, Lim3;->g:Ljava/lang/String;

    .line 24
    .line 25
    iget-object p0, p0, Lim3;->k:Lk03;

    .line 26
    .line 27
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lad2;->k(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method

.method public final h()V
    .locals 5

    .line 1
    iget-object v0, p0, Lim3;->e:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget v1, p0, Lim3;->h:I

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    add-int/2addr v1, v2

    .line 10
    iput v1, p0, Lim3;->h:I

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v3, Lem3;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    invoke-direct {v3, p0, v0, v4}, Lem3;-><init>(Lim3;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    iget-object v4, p0, Lim3;->c:Lmm3;

    .line 23
    .line 24
    invoke-virtual {v4, v0, v2, v3}, Lmm3;->c(Ljava/lang/String;ZLjava/lang/Runnable;)Lk03;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    new-instance v3, Lfm3;

    .line 29
    .line 30
    invoke-direct {v3, p0, v2, v0, v1}, Lfm3;-><init>(Lim3;Lk03;Ljava/lang/String;I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v3}, Lad2;->f(La83;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method
