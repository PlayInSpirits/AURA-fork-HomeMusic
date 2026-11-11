.class public final synthetic Lfi4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;

.field public final synthetic p:Lik;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;Lik;I)V
    .locals 0

    .line 1
    iput p3, p0, Lfi4;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lfi4;->o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;

    .line 4
    .line 5
    iput-object p2, p0, Lfi4;->p:Lik;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget p1, p0, Lfi4;->n:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iget-object v1, p0, Lfi4;->p:Lik;

    .line 5
    .line 6
    iget-object p0, p0, Lfi4;->o:Lcom/eddyizm/tempus/ui/fragment/bottomsheetdialog/SongBottomSheetDialog;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 16
    .line 17
    invoke-virtual {p0, v1, v0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->F(Lik;Z)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    invoke-virtual {p0}, Lkc1;->X()Lnc1;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 26
    .line 27
    const-string p1, "song"

    .line 28
    .line 29
    iget-object v2, v1, Lik;->c:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    xor-int/2addr p1, v0

    .line 36
    invoke-virtual {p0, v1, p1}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->F(Lik;Z)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
