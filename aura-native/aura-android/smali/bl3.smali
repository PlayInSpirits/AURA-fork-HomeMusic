.class public final synthetic Lbl3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistBottomSheetDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistBottomSheetDialog;I)V
    .locals 0

    .line 1
    iput p2, p0, Lbl3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lbl3;->o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistBottomSheetDialog;

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
    iget p1, p0, Lbl3;->n:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iget-object p0, p0, Lbl3;->o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistBottomSheetDialog;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistBottomSheetDialog;->C0:Lbl2;

    .line 10
    .line 11
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistBottomSheetDialog;->B0:Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;->getEntries()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-static {p1, v1, v2}, Lbo2;->e(Lic2;Ljava/util/List;Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 26
    .line 27
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 28
    .line 29
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Lau;

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lau;->d(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lzt;->h0()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_0
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistBottomSheetDialog;->C0:Lbl2;

    .line 41
    .line 42
    iget-object v1, p0, Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/PlaylistBottomSheetDialog;->B0:Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;

    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/eddyizm/tempus/subsonic/models/PlaylistWithSongs;->getEntries()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {p1, v1, v0}, Lbo2;->e(Lic2;Ljava/util/List;Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 56
    .line 57
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 58
    .line 59
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, Lau;

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Lau;->d(Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, Lzt;->h0()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
