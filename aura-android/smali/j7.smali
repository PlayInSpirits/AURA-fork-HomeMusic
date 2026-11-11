.class public Lj7;
.super Lhd;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final c:Lrv2;

.field public final d:Lpa;

.field public final e:Ld34;

.field public final f:Lhh3;

.field public g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

.field public final h:Lk03;


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
    iput-object p1, p0, Lj7;->h:Lk03;

    .line 11
    .line 12
    new-instance p1, Lrv2;

    .line 13
    .line 14
    const/16 v0, 0x1b

    .line 15
    .line 16
    invoke-direct {p1, v0}, Lrv2;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lj7;->c:Lrv2;

    .line 20
    .line 21
    new-instance p1, Lpa;

    .line 22
    .line 23
    const/16 v0, 0xc

    .line 24
    .line 25
    invoke-direct {p1, v0}, Lpa;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lj7;->d:Lpa;

    .line 29
    .line 30
    new-instance p1, Ld34;

    .line 31
    .line 32
    const/16 v0, 0x19

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ld34;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lj7;->e:Ld34;

    .line 38
    .line 39
    new-instance p1, Lhh3;

    .line 40
    .line 41
    const/16 v0, 0x1b

    .line 42
    .line 43
    invoke-direct {p1, v0}, Lhh3;-><init>(I)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lj7;->f:Lhh3;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final c()Lk03;
    .locals 1

    .line 1
    iget-object v0, p0, Lj7;->g:Lcom/eddyizm/tempus/subsonic/models/AlbumID3;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/AlbumID3;->getId()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p0, p0, Lj7;->c:Lrv2;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Lrv2;->l(Ljava/lang/String;)Lk03;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
