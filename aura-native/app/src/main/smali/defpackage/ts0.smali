.class public final synthetic Ldefpackage/ts0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/us0;

.field public final synthetic p:Ldefpackage/f9;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/us0;Ldefpackage/f9;I)V
    .locals 0

    .line 1
    iput p3, p0, Ldefpackage/ts0;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/ts0;->o:Ldefpackage/us0;

    .line 4
    .line 5
    iput-object p2, p0, Ldefpackage/ts0;->p:Ldefpackage/f9;

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
    .locals 1

    .line 1
    iget p1, p0, Ldefpackage/ts0;->n:I

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/ts0;->p:Ldefpackage/f9;

    .line 4
    .line 5
    iget-object p0, p0, Ldefpackage/ts0;->o:Ldefpackage/us0;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/us0;->C0:Lcom/eddyizm/tempus/interfaces/DialogClickCallback;

    .line 11
    .line 12
    check-cast p0, Ldefpackage/qq0;

    .line 13
    .line 14
    invoke-interface {p0}, Lcom/eddyizm/tempus/interfaces/DialogClickCallback;->onNegativeClick()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ldefpackage/dg;->dismiss()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    iget-object p0, p0, Ldefpackage/us0;->C0:Lcom/eddyizm/tempus/interfaces/DialogClickCallback;

    .line 22
    .line 23
    check-cast p0, Ldefpackage/qq0;

    .line 24
    .line 25
    invoke-virtual {p0}, Ldefpackage/qq0;->onPositiveClick()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ldefpackage/dg;->dismiss()V

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
