.class public final synthetic Ldefpackage/kj;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/kj;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/kj;->o:Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;

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
    iget v0, p0, Ldefpackage/kj;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/kj;->o:Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ldefpackage/kc1;->X()Ldefpackage/nc1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "input_method"

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-virtual {v0, p1, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistListPageFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 29
    .line 30
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Ldefpackage/v23;

    .line 31
    .line 32
    invoke-virtual {p0}, Ldefpackage/v23;->o()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_0
    new-instance v0, Landroid/widget/PopupMenu;

    .line 37
    .line 38
    invoke-virtual {p0}, Ldefpackage/kc1;->Z()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-direct {v0, v1, p1}, Landroid/widget/PopupMenu;-><init>(Landroid/content/Context;Landroid/view/View;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->getMenuInflater()Landroid/view/MenuInflater;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->getMenu()Landroid/view/Menu;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const v2, 0x7f0f0014

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v2, v1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 57
    .line 58
    .line 59
    new-instance p1, Ldefpackage/v7;

    .line 60
    .line 61
    const/4 v1, 0x3

    .line 62
    invoke-direct {p1, v1, p0}, Ldefpackage/v7;-><init>(ILdefpackage/kc1;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, p1}, Landroid/widget/PopupMenu;->setOnMenuItemClickListener(Landroid/widget/PopupMenu$OnMenuItemClickListener;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/widget/PopupMenu;->show()V

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
