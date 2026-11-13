.class public final Ldefpackage/jj;
.super Ldefpackage/cx3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Ldefpackage/x12;

.field public final synthetic v:Ldefpackage/b8;


# direct methods
.method public constructor <init>(Ldefpackage/b8;Ldefpackage/x12;)V
    .locals 3

    .line 1
    iput-object p1, p0, Ldefpackage/jj;->v:Ldefpackage/b8;

    .line 2
    .line 3
    iget-object p1, p2, Ldefpackage/x12;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ldefpackage/cx3;-><init>(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Ldefpackage/jj;->u:Ldefpackage/x12;

    .line 9
    .line 10
    iget-object v0, p2, Ldefpackage/x12;->e:Landroid/widget/TextView;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ldefpackage/ij;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v0, p0, v2}, Ldefpackage/ij;-><init>(Ldefpackage/jj;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Ldefpackage/q6;

    .line 26
    .line 27
    const/4 v2, 0x7

    .line 28
    invoke-direct {v0, v2, p0}, Ldefpackage/q6;-><init>(ILjava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p2, Ldefpackage/x12;->d:Landroid/widget/FrameLayout;

    .line 35
    .line 36
    new-instance p2, Ldefpackage/ij;

    .line 37
    .line 38
    invoke-direct {p2, p0, v1}, Ldefpackage/ij;-><init>(Ldefpackage/jj;I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public final s()Z
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ldefpackage/jj;->v:Ldefpackage/b8;

    .line 7
    .line 8
    iget-object v2, v1, Ldefpackage/b8;->t:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    invoke-interface {v2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/ArtistID3;->strippedForNav()Lcom/eddyizm/tempus/subsonic/models/ArtistID3;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string v2, "ARTIST_OBJECT"

    .line 25
    .line 26
    invoke-virtual {v0, v2, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, v1, Ldefpackage/b8;->r:Lcom/eddyizm/tempus/interfaces/ClickCallback;

    .line 30
    .line 31
    invoke-interface {p0, v0}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onArtistLongClick(Landroid/os/Bundle;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    return p0
.end method
