.class public final synthetic Ltj3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

.field public final synthetic p:Lik;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;Lik;I)V
    .locals 0

    .line 1
    iput p3, p0, Ltj3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ltj3;->o:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 4
    .line 5
    iput-object p2, p0, Ltj3;->p:Lik;

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
    iget p1, p0, Ltj3;->n:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iget-object v1, p0, Ltj3;->p:Lik;

    .line 5
    .line 6
    iget-object p0, p0, Ltj3;->o:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 7
    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->K0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 12
    .line 13
    invoke-virtual {p0, v1, v0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->F(Lik;Z)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    const-string p1, "song"

    .line 18
    .line 19
    iget-object v2, v1, Lik;->c:Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    xor-int/2addr p1, v0

    .line 26
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->K0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 27
    .line 28
    invoke-virtual {p0, v1, p1}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->F(Lik;Z)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
