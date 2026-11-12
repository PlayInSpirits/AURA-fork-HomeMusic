.class public final synthetic Lnq0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lnq0;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lnq0;->o:Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;

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
    .locals 0

    .line 1
    iget p1, p0, Lnq0;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lnq0;->o:Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

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
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/DirectoryFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 17
    .line 18
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 19
    .line 20
    invoke-virtual {p0}, Lv23;->o()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
