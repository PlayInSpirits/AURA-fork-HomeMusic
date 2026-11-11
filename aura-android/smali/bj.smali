.class public Lbj;
.super Lhd;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final c:Lpa;

.field public final d:Ld34;

.field public final e:Lk03;

.field public f:Lk03;

.field public g:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;


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
    iput-object p1, p0, Lbj;->e:Lk03;

    .line 11
    .line 12
    new-instance p1, Lpa;

    .line 13
    .line 14
    const/16 v0, 0xc

    .line 15
    .line 16
    invoke-direct {p1, v0}, Lpa;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lbj;->c:Lpa;

    .line 20
    .line 21
    new-instance p1, Ld34;

    .line 22
    .line 23
    const/16 v0, 0x19

    .line 24
    .line 25
    invoke-direct {p1, v0}, Ld34;-><init>(I)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lbj;->d:Ld34;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final c()Lad2;
    .locals 5

    .line 1
    iget-object v0, p0, Lbj;->f:Lk03;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lbj;->g:Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->getId()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, Lbj;->c:Lpa;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v2, Lk03;

    .line 17
    .line 18
    invoke-direct {v2}, Lad2;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lxj;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-direct {v3, v2, v4}, Lxj;-><init>(Lk03;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, v0, v3}, Lpa;->w(Ljava/lang/String;Ldk;)V

    .line 28
    .line 29
    .line 30
    iput-object v2, p0, Lbj;->f:Lk03;

    .line 31
    .line 32
    :cond_0
    iget-object p0, p0, Lbj;->f:Lk03;

    .line 33
    .line 34
    return-object p0
.end method
