.class public final synthetic Ldefpackage/r7;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/a83;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/r7;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/r7;->b:Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/r7;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/r7;->b:Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/util/List;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->s0:Ljava/util/List;

    .line 11
    .line 12
    const-string p1, "album_sort_order"

    .line 13
    .line 14
    const-string v0, "ALBUM_ORDER_BY_NAME"

    .line 15
    .line 16
    invoke-static {p1, v0}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v0, p1

    .line 24
    :goto_0
    iput-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->r0:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->h0(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->j0()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->l0:Ldefpackage/lv4;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    iget-object p1, v0, Ldefpackage/lv4;->r:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p1, Landroid/widget/Button;

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->l0:Ldefpackage/lv4;

    .line 52
    .line 53
    iget-object p0, p0, Ldefpackage/lv4;->q:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Landroid/widget/ProgressBar;

    .line 56
    .line 57
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    iget-object p1, v0, Ldefpackage/lv4;->r:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, Landroid/widget/Button;

    .line 64
    .line 65
    const/4 v0, 0x1

    .line 66
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 67
    .line 68
    .line 69
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumCatalogueFragment;->l0:Ldefpackage/lv4;

    .line 70
    .line 71
    iget-object p0, p0, Ldefpackage/lv4;->q:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p0, Landroid/widget/ProgressBar;

    .line 74
    .line 75
    const/16 p1, 0x8

    .line 76
    .line 77
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    :goto_1
    return-void

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
