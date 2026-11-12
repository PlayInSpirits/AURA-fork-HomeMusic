.class public final synthetic Ldp1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lgp1;


# direct methods
.method public synthetic constructor <init>(Lgp1;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldp1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldp1;->o:Lgp1;

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
    .locals 2

    .line 1
    iget p1, p0, Ldp1;->n:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object p0, p0, Ldp1;->o:Lgp1;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lgp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 10
    .line 11
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 12
    .line 13
    const p1, 0x7f0a0062

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1, v0, v0}, Lv23;->m(ILandroid/os/Bundle;Ly23;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    new-instance p1, Lsl3;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-direct {p1, v1, p0}, Lsl3;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Lgp1;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 27
    .line 28
    invoke-virtual {p0}, Lnc1;->k()Lmd1;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p1, p0, v0}, Lpp0;->m0(Lld1;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
