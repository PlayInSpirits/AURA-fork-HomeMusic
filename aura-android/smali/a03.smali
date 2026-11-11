.class public final La03;
.super Lcx3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final u:Lz12;

.field public final synthetic v:Lb03;


# direct methods
.method public constructor <init>(Lb03;Lz12;)V
    .locals 3

    .line 1
    iput-object p1, p0, La03;->v:Lb03;

    .line 2
    .line 3
    iget-object p1, p2, Lz12;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcx3;-><init>(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, La03;->u:Lz12;

    .line 9
    .line 10
    iget-object v0, p2, Lz12;->e:Landroid/widget/TextView;

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lzz2;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v0, p0, v2}, Lzz2;-><init>(La03;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p2, Lz12;->c:Landroid/widget/ImageView;

    .line 26
    .line 27
    new-instance v0, Lzz2;

    .line 28
    .line 29
    invoke-direct {v0, p0, v1}, Lzz2;-><init>(La03;I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p2, Lz12;->d:Landroid/widget/ImageView;

    .line 36
    .line 37
    new-instance p2, Lzz2;

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    invoke-direct {p2, p0, v0}, Lzz2;-><init>(La03;I)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final s()V
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, La03;->v:Lb03;

    .line 7
    .line 8
    iget-object v2, v1, Lb03;->r:Ljava/util/List;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcx3;->c()I

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
    check-cast p0, Lcom/eddyizm/tempus/subsonic/models/Artist;

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/eddyizm/tempus/subsonic/models/Artist;->getId()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-string v2, "MUSIC_DIRECTORY_ID"

    .line 25
    .line 26
    invoke-virtual {v0, v2, p0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, v1, Lb03;->q:Lcom/eddyizm/tempus/ui/fragment/IndexFragment;

    .line 30
    .line 31
    invoke-interface {p0, v0}, Lcom/eddyizm/tempus/interfaces/ClickCallback;->onMusicIndexClick(Landroid/os/Bundle;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
