.class public final synthetic Lws0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lws0;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lws0;->o:Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;

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
    iget v0, p0, Lws0;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Lws0;->o:Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->p0:Lft0;

    .line 10
    .line 11
    iget-object p1, p1, Lft0;->v:Ljava/util/List;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->q0:Lbl2;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-static {v0, p1, v2}, Lbo2;->o(Lic2;Ljava/util/List;I)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 31
    .line 32
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 33
    .line 34
    iget-object p0, p0, Lzg5;->n:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Lau;

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Lau;->d(Z)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void

    .line 42
    :pswitch_0
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->o0:Lbu0;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance p1, Ljava/lang/Thread;

    .line 48
    .line 49
    new-instance v0, La0;

    .line 50
    .line 51
    const/16 v1, 0x19

    .line 52
    .line 53
    invoke-direct {v0, v1, p0}, La0;-><init>(ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_1
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/DownloadFragment;->o0:Lbu0;

    .line 64
    .line 65
    iget-object p0, p0, Lbu0;->e:Lk03;

    .line 66
    .line 67
    invoke-virtual {p0}, Lad2;->d()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, Ljava/util/ArrayList;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    sub-int/2addr v0, v1

    .line 78
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, p1}, Lad2;->k(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :pswitch_2
    new-instance v0, Landroid/widget/PopupMenu;

    .line 86
    .line 87
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-direct {v0, v1, p1}, Landroid/widget/PopupMenu;-><init>(Landroid/content/Context;Landroid/view/View;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->getMenuInflater()Landroid/view/MenuInflater;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    const v2, 0x7f0f0006

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v2, v1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 106
    .line 107
    .line 108
    new-instance p1, Lv7;

    .line 109
    .line 110
    const/4 v1, 0x4

    .line 111
    invoke-direct {p1, v1, p0}, Lv7;-><init>(ILkc1;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, p1}, Landroid/widget/PopupMenu;->setOnMenuItemClickListener(Landroid/widget/PopupMenu$OnMenuItemClickListener;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->show()V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
