.class public final Ldefpackage/yz2;
.super Ldefpackage/cx3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Ldefpackage/z12;

.field public final synthetic v:Ldefpackage/zd0;


# direct methods
.method public constructor <init>(Ldefpackage/zd0;Ldefpackage/z12;)V
    .locals 3

    .line 1
    iput-object p1, p0, Ldefpackage/yz2;->v:Ldefpackage/zd0;

    .line 2
    .line 3
    iget-object p1, p2, Ldefpackage/z12;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ldefpackage/cx3;-><init>(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Ldefpackage/yz2;->u:Ldefpackage/z12;

    .line 9
    .line 10
    iget-object v0, p2, Ldefpackage/z12;->e:Landroid/widget/TextView;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Ldefpackage/xz2;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v0, p0, v2}, Ldefpackage/xz2;-><init>(Ldefpackage/yz2;I)V

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
    const/16 v2, 0xd

    .line 28
    .line 29
    invoke-direct {v0, v2, p0}, Ldefpackage/q6;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p2, Ldefpackage/z12;->c:Landroid/widget/ImageView;

    .line 36
    .line 37
    new-instance v0, Ldefpackage/xz2;

    .line 38
    .line 39
    invoke-direct {v0, p0, v1}, Ldefpackage/xz2;-><init>(Ldefpackage/yz2;I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p2, Ldefpackage/z12;->d:Landroid/widget/ImageView;

    .line 46
    .line 47
    new-instance p2, Ldefpackage/xz2;

    .line 48
    .line 49
    const/4 v0, 0x2

    .line 50
    invoke-direct {p2, p0, v0}, Ldefpackage/xz2;-><init>(Ldefpackage/yz2;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final s()V
    .locals 5

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ldefpackage/yz2;->v:Ldefpackage/zd0;

    .line 7
    .line 8
    iget-object v2, v1, Ldefpackage/zd0;->s:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;

    .line 11
    .line 12
    iget-object v3, v1, Ldefpackage/zd0;->r:Ljava/util/List;

    .line 13
    .line 14
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 23
    .line 24
    invoke-virtual {v3}, Lcom/eddyizm/tempus/subsonic/models/Child;->isDir()Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    iget-object v1, v1, Ldefpackage/zd0;->r:Ljava/util/List;

    .line 31
    .line 32
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-interface {v1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Child;->getId()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const-string v1, "MUSIC_DIRECTORY_ID"

    .line 47
    .line 48
    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-interface {v2, v0}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onMusicDirectoryClick(Landroid/os/Bundle;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 56
    .line 57
    iget-object v1, v1, Ldefpackage/zd0;->r:Ljava/util/List;

    .line 58
    .line 59
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 60
    .line 61
    .line 62
    const-string v1, "TRACKS_OBJECT"

    .line 63
    .line 64
    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 65
    .line 66
    .line 67
    const-string v1, "ITEM_POSITION"

    .line 68
    .line 69
    invoke-virtual {p0}, Ldefpackage/cx3;->c()I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v2, v0}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onMediaClick(Landroid/os/Bundle;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method
