.class public final synthetic Lpi4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lpi4;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lpi4;->o:Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

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
    iget v0, p0, Lpi4;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lpi4;->o:Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Landroid/widget/PopupMenu;

    .line 9
    .line 10
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1, p1}, Landroid/widget/PopupMenu;-><init>(Landroid/content/Context;Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->getMenuInflater()Landroid/view/MenuInflater;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const v2, 0x7f0f0016

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v2, v1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 29
    .line 30
    .line 31
    new-instance p1, Lv7;

    .line 32
    .line 33
    const/16 v1, 0x9

    .line 34
    .line 35
    invoke-direct {p1, v1, p0}, Lv7;-><init>(ILkc1;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Landroid/widget/PopupMenu;->setOnMenuItemClickListener(Landroid/widget/PopupMenu$OnMenuItemClickListener;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->show()V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_0
    new-instance p1, Ljava/util/ArrayList;

    .line 46
    .line 47
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->p0:Lni4;

    .line 48
    .line 49
    iget-object v0, v0, Lni4;->u:Ljava/util/List;

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 55
    .line 56
    iget-object v0, v0, Lui4;->e:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v0}, Lv13;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    new-instance v1, Lqo2;

    .line 63
    .line 64
    const/16 v2, 0xf

    .line 65
    .line 66
    invoke-direct {v1, p0, p1, v0, v2}, Lqo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->n0:Lui4;

    .line 70
    .line 71
    iget-object v0, v0, Lui4;->e:Ljava/lang/String;

    .line 72
    .line 73
    const-string v2, "MEDIA_STARRED"

    .line 74
    .line 75
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-eqz v0, :cond_0

    .line 80
    .line 81
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 82
    .line 83
    const-string v0, "liked"

    .line 84
    .line 85
    const/4 v2, 0x0

    .line 86
    invoke-static {p0, v0, v2, p1, v1}, Lcom/eddyizm/tempus/homemusic/a;->m(Lcom/eddyizm/tempus/ui/activity/MainActivity;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Runnable;)V

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    invoke-virtual {v1}, Lqo2;->run()V

    .line 91
    .line 92
    .line 93
    :goto_0
    return-void

    .line 94
    :pswitch_1
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->h0(Landroid/view/View;)V

    .line 95
    .line 96
    .line 97
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/SongListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 98
    .line 99
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 100
    .line 101
    invoke-virtual {p0}, Lv23;->o()V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
