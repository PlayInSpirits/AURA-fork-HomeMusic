.class public final synthetic Lkm4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lus0;

.field public final synthetic p:Lf9;


# direct methods
.method public synthetic constructor <init>(Lus0;Lf9;I)V
    .locals 0

    .line 1
    iput p3, p0, Lkm4;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lkm4;->o:Lus0;

    .line 4
    .line 5
    iput-object p2, p0, Lkm4;->p:Lf9;

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
    .locals 2

    .line 1
    iget p1, p0, Lkm4;->n:I

    .line 2
    .line 3
    iget-object v0, p0, Lkm4;->p:Lf9;

    .line 4
    .line 5
    iget-object p0, p0, Lkm4;->o:Lus0;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lud3;->G()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    invoke-static {p1}, Lud3;->B0(I)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lus0;->C0:Lcom/eddyizm/tempus/interfaces/DialogClickCallback;

    .line 21
    .line 22
    check-cast p0, Lub4;

    .line 23
    .line 24
    invoke-virtual {p0}, Lub4;->onNegativeClick()V

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-virtual {v0}, Ldg;->dismiss()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_0
    invoke-static {}, Lud3;->G()I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    const/4 v1, 0x1

    .line 36
    if-eq p1, v1, :cond_1

    .line 37
    .line 38
    invoke-static {v1}, Lud3;->B0(I)V

    .line 39
    .line 40
    .line 41
    iget-object p0, p0, Lus0;->C0:Lcom/eddyizm/tempus/interfaces/DialogClickCallback;

    .line 42
    .line 43
    check-cast p0, Lub4;

    .line 44
    .line 45
    invoke-virtual {p0}, Lub4;->onPositiveClick()V

    .line 46
    .line 47
    .line 48
    :cond_1
    invoke-virtual {v0}, Ldg;->dismiss()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
