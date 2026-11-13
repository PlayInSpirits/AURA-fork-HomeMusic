.class public final Ldefpackage/jo1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/List;

.field public final c:Lcom/eddyizm/tempus/subsonic/models/Child;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/jo1;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/jo1;->b:Ljava/util/List;

    .line 7
    .line 8
    invoke-static {p2}, Ldefpackage/q40;->w0(Ljava/util/List;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 13
    .line 14
    iput-object p1, p0, Ldefpackage/jo1;->c:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtistId()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iput-object p2, p0, Ldefpackage/jo1;->d:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getAlbumArtist()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    if-eqz p2, :cond_1

    .line 27
    .line 28
    invoke-static {p2}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 p2, 0x0

    .line 36
    :goto_0
    if-nez p2, :cond_2

    .line 37
    .line 38
    :cond_1
    invoke-virtual {p1}, Lcom/eddyizm/tempus/subsonic/models/Child;->getArtist()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    :cond_2
    iput-object p2, p0, Ldefpackage/jo1;->e:Ljava/lang/String;

    .line 43
    .line 44
    return-void
.end method
