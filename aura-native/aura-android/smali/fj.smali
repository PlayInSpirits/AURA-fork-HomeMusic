.class public final synthetic Lfj;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lfj;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lfj;->o:Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget v0, p0, Lfj;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lfj;->o:Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->i0(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 12
    .line 13
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 14
    .line 15
    invoke-virtual {p0}, Lv23;->o()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    new-instance v0, Landroid/widget/PopupMenu;

    .line 20
    .line 21
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-direct {v0, v1, p1}, Landroid/widget/PopupMenu;-><init>(Landroid/content/Context;Landroid/view/View;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->getMenuInflater()Landroid/view/MenuInflater;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const v2, 0x7f0f0011

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1, v2, v1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 40
    .line 41
    .line 42
    new-instance p1, Lv7;

    .line 43
    .line 44
    const/4 v1, 0x2

    .line 45
    invoke-direct {p1, v1, p0}, Lv7;-><init>(ILkc1;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p1}, Landroid/widget/PopupMenu;->setOnMenuItemClickListener(Landroid/widget/PopupMenu$OnMenuItemClickListener;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->show()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
