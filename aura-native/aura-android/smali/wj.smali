.class public Lwj;
.super Lhd;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final c:Lpa;

.field public final d:Ld34;

.field public e:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

.field public final f:Lk03;

.field public final g:Lk03;


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
    iput-object p1, p0, Lwj;->f:Lk03;

    .line 10
    .line 11
    new-instance p1, Lk03;

    .line 12
    .line 13
    invoke-direct {p1}, Lad2;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lwj;->g:Lk03;

    .line 17
    .line 18
    new-instance p1, Lpa;

    .line 19
    .line 20
    const/16 v0, 0xc

    .line 21
    .line 22
    invoke-direct {p1, v0}, Lpa;-><init>(I)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lwj;->c:Lpa;

    .line 26
    .line 27
    new-instance p1, Ld34;

    .line 28
    .line 29
    const/16 v0, 0x19

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ld34;-><init>(I)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lwj;->d:Ld34;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/String;)Lk03;
    .locals 3

    .line 1
    iget-object p0, p0, Lwj;->c:Lpa;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance p0, Lk03;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-direct {p0, v0}, Lad2;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {v0}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lpn4;->c()Lgp3;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const-string v1, "BrowsingClient"

    .line 25
    .line 26
    const-string v2, "getArtistInfo2()"

    .line 27
    .line 28
    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    iget-object v1, v0, Lgp3;->p:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Lov;

    .line 34
    .line 35
    iget-object v0, v0, Lgp3;->o:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Lpn4;

    .line 38
    .line 39
    invoke-virtual {v0}, Lpn4;->f()Ljava/util/HashMap;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v1, v0, p1}, Lov;->m(Ljava/util/Map;Ljava/lang/String;)Lretrofit2/Call;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance v0, Lq8;

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    invoke-direct {v0, p0, v1}, Lq8;-><init>(Lk03;I)V

    .line 51
    .line 52
    .line 53
    invoke-interface {p1, v0}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    .line 54
    .line 55
    .line 56
    return-object p0
.end method
