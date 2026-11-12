.class public Lwl3;
.super Lhd;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final c:Lmm3;

.field public final d:Lhh3;

.field public e:Ljava/util/ArrayList;

.field public f:Lcom/eddyizm/tempus/subsonic/models/Playlist;

.field public g:Lk03;

.field public final h:Lk03;

.field public i:Z

.field public j:Ljava/lang/Integer;

.field public k:Ld8;


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
    iput-object p1, p0, Lwl3;->g:Lk03;

    .line 10
    .line 11
    new-instance p1, Lk03;

    .line 12
    .line 13
    invoke-direct {p1}, Lad2;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lwl3;->h:Lk03;

    .line 17
    .line 18
    new-instance p1, Lmm3;

    .line 19
    .line 20
    invoke-direct {p1}, Lmm3;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lwl3;->c:Lmm3;

    .line 24
    .line 25
    new-instance p1, Lhh3;

    .line 26
    .line 27
    const/16 v0, 0x1b

    .line 28
    .line 29
    invoke-direct {p1, v0}, Lhh3;-><init>(I)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lwl3;->d:Lhh3;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lwl3;->k:Ld8;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Lwl3;->g:Lk03;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Lad2;->j(La83;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lwl3;->k:Ld8;

    .line 13
    .line 14
    return-void
.end method

.method public final c(Lcom/eddyizm/tempus/subsonic/models/Playlist;)V
    .locals 3

    .line 1
    iput-object p1, p0, Lwl3;->f:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 2
    .line 3
    iget-object v0, p0, Lwl3;->k:Ld8;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v2, p0, Lwl3;->g:Lk03;

    .line 10
    .line 11
    invoke-virtual {v2, v0}, Lad2;->j(La83;)V

    .line 12
    .line 13
    .line 14
    iput-object v1, p0, Lwl3;->k:Ld8;

    .line 15
    .line 16
    :goto_0
    iput-object v1, p0, Lwl3;->j:Ljava/lang/Integer;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    iget-object p1, p0, Lwl3;->f:Lcom/eddyizm/tempus/subsonic/models/Playlist;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Playlist;->getId()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/4 v0, 0x0

    .line 27
    iget-object v2, p0, Lwl3;->c:Lmm3;

    .line 28
    .line 29
    invoke-virtual {v2, p1, v0, v1}, Lmm3;->c(Ljava/lang/String;ZLjava/lang/Runnable;)Lk03;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lwl3;->g:Lk03;

    .line 34
    .line 35
    new-instance v0, Ld8;

    .line 36
    .line 37
    const/16 v1, 0x14

    .line 38
    .line 39
    invoke-direct {v0, v1, p0}, Ld8;-><init>(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, Lwl3;->k:Ld8;

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lad2;->f(La83;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_1
    new-instance p1, Lk03;

    .line 49
    .line 50
    invoke-direct {p1}, Lad2;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lwl3;->g:Lk03;

    .line 54
    .line 55
    return-void
.end method
