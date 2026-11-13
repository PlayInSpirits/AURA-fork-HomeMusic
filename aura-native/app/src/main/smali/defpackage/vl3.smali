.class public final Ldefpackage/vl3;
.super Ldefpackage/e22;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic f:Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/vl3;->f:Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Ldefpackage/e22;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final h(Landroidx/recyclerview/widget/RecyclerView;Ldefpackage/cx3;Ldefpackage/cx3;)Z
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/vl3;->f:Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;

    .line 2
    .line 3
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->m0:Ldefpackage/wl3;

    .line 4
    .line 5
    iget-boolean p1, p1, Ldefpackage/wl3;->i:Z

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return p0

    .line 11
    :cond_0
    invoke-virtual {p2}, Ldefpackage/cx3;->c()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {p3}, Ldefpackage/cx3;->c()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    iget-object p3, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->n0:Ldefpackage/zd0;

    .line 20
    .line 21
    iget-object p3, p3, Ldefpackage/zd0;->r:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {p3, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 28
    .line 29
    invoke-interface {p3, p2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->n0:Ldefpackage/zd0;

    .line 33
    .line 34
    iget-object p0, p0, Ldefpackage/dw3;->n:Ldefpackage/ew3;

    .line 35
    .line 36
    invoke-virtual {p0, p1, p2}, Ldefpackage/ew3;->c(II)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    return p0
.end method

.method public final i(Ldefpackage/cx3;)V
    .locals 0

    .line 1
    return-void
.end method
