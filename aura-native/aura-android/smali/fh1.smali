.class public final synthetic Lfh1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lfh1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lfh1;->o:Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;

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
    iget v0, p0, Lfh1;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lfh1;->o:Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->h0(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

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
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/GenreCatalogueFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 20
    .line 21
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 22
    .line 23
    const p1, 0x7f0a0059

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-virtual {p0, p1, v0, v0}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_1
    new-instance v0, Landroid/widget/PopupMenu;

    .line 32
    .line 33
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-direct {v0, v1, p1}, Landroid/widget/PopupMenu;-><init>(Landroid/content/Context;Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->getMenuInflater()Landroid/view/MenuInflater;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    const v2, 0x7f0f0012

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v2, v1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 52
    .line 53
    .line 54
    new-instance p1, Lv7;

    .line 55
    .line 56
    const/4 v1, 0x5

    .line 57
    invoke-direct {p1, v1, p0}, Lv7;-><init>(ILkc1;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p1}, Landroid/widget/PopupMenu;->setOnMenuItemClickListener(Landroid/widget/PopupMenu$OnMenuItemClickListener;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->show()V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
