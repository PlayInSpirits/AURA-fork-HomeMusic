.class public final synthetic Ldefpackage/c8;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/c8;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/c8;->o:Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;

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
    iget v0, p0, Ldefpackage/c8;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/c8;->o:Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Landroid/widget/PopupMenu;

    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

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
    const v2, 0x7f0f0013

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v2, v1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 29
    .line 30
    .line 31
    new-instance p1, Ldefpackage/v7;

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    invoke-direct {p1, v1, p0}, Ldefpackage/v7;-><init>(ILdefpackage/kc1;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Landroid/widget/PopupMenu;->setOnMenuItemClickListener(Landroid/widget/PopupMenu$OnMenuItemClickListener;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->show()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_0
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const-string v1, "input_method"

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const/4 v1, 0x0

    .line 61
    invoke-virtual {v0, p1, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 62
    .line 63
    .line 64
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/AlbumListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 65
    .line 66
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Ldefpackage/v23;

    .line 67
    .line 68
    invoke-virtual {p0}, Ldefpackage/v23;->o()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
