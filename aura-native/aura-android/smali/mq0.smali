.class public final synthetic Lmq0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;

.field public final synthetic p:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;Ljava/util/ArrayList;I)V
    .locals 0

    .line 1
    iput p3, p0, Lmq0;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lmq0;->o:Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;

    .line 4
    .line 5
    iput-object p2, p0, Lmq0;->p:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lmq0;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lmq0;->p:Ljava/util/ArrayList;

    .line 5
    .line 6
    iget-object p0, p0, Lmq0;->o:Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->p0:Lbl2;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-static {v0, v2, v3}, Lbo2;->o(Lic2;Ljava/util/List;I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 20
    .line 21
    iget-object v0, v0, Lzg5;->n:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v0, Lau;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lau;->d(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    const v2, 0x7f13015c

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v2, v1}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-static {v0, p0, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :pswitch_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget-object v3, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 64
    .line 65
    if-nez v0, :cond_0

    .line 66
    .line 67
    new-instance v0, Lmq0;

    .line 68
    .line 69
    invoke-direct {v0, p0, v2, v1}, Lmq0;-><init>(Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;Ljava/util/ArrayList;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    new-instance v0, La0;

    .line 77
    .line 78
    const/16 v1, 0x16

    .line 79
    .line 80
    invoke-direct {v0, v1, p0}, La0;-><init>(ILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v3, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 84
    .line 85
    .line 86
    :goto_0
    return-void

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
