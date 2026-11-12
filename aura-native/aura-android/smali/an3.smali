.class public final synthetic Lan3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lan3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lan3;->o:Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;

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
    iget v0, p0, Lan3;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lan3;->o:Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PodcastChannelPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 9
    .line 10
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 11
    .line 12
    invoke-virtual {p0}, Lv23;->o()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    new-instance v0, Landroid/widget/PopupMenu;

    .line 17
    .line 18
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {v0, v1, p1}, Landroid/widget/PopupMenu;-><init>(Landroid/content/Context;Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->getMenuInflater()Landroid/view/MenuInflater;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const v2, 0x7f0f0007

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v2, v1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 37
    .line 38
    .line 39
    new-instance p1, Lv7;

    .line 40
    .line 41
    const/16 v1, 0x8

    .line 42
    .line 43
    invoke-direct {p1, v1, p0}, Lv7;-><init>(ILkc1;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1}, Landroid/widget/PopupMenu;->setOnMenuItemClickListener(Landroid/widget/PopupMenu$OnMenuItemClickListener;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->show()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
