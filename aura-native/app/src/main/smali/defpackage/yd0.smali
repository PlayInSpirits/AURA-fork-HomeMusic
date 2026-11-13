.class public final Ldefpackage/yd0;
.super Ldefpackage/cx3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Ldefpackage/z40;

.field public final synthetic v:Ldefpackage/zd0;


# direct methods
.method public constructor <init>(Ldefpackage/zd0;Ldefpackage/z40;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ldefpackage/yd0;->v:Ldefpackage/zd0;

    .line 2
    .line 3
    iget-object p1, p2, Ldefpackage/z40;->n:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    .line 7
    invoke-direct {p0, p1}, Ldefpackage/cx3;-><init>(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Ldefpackage/yd0;->u:Ldefpackage/z40;

    .line 11
    .line 12
    new-instance p2, Ldefpackage/p6;

    .line 13
    .line 14
    const/16 v0, 0xb

    .line 15
    .line 16
    invoke-direct {p2, v0, p0}, Ldefpackage/p6;-><init>(ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final s(Ldefpackage/sp3;)V
    .locals 4

    .line 1
    new-instance v0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 2
    .line 3
    iget-object v1, p1, Ldefpackage/sp3;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/eddyizm/tempus/subsonic/models/Child;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p1, Ldefpackage/sp3;->c:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->setTitle(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p1, Ldefpackage/sp3;->d:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbum(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p1, Ldefpackage/sp3;->e:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->setArtist(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p1, Ldefpackage/sp3;->f:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->setAlbumId(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p1, Ldefpackage/sp3;->g:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->setCoverArtId(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, p1, Ldefpackage/sp3;->h:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lcom/eddyizm/tempus/subsonic/models/Child;->setType(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Ldefpackage/yd0;->v:Ldefpackage/zd0;

    .line 39
    .line 40
    iget-object p0, p0, Ldefpackage/zd0;->s:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p0, Ldefpackage/bl2;

    .line 43
    .line 44
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const/4 v1, 0x0

    .line 49
    iget-wide v2, p1, Ldefpackage/sp3;->b:J

    .line 50
    .line 51
    invoke-static {p0, v0, v1, v2, v3}, Ldefpackage/bo2;->p(Ldefpackage/ic2;Ljava/util/List;IJ)V

    .line 52
    .line 53
    .line 54
    return-void
.end method
