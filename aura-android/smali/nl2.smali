.class public final synthetic Lnl2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lxl2;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lbm2;

.field public final synthetic p:I

.field public final synthetic q:I


# direct methods
.method public synthetic constructor <init>(Lbm2;III)V
    .locals 0

    .line 1
    iput p4, p0, Lnl2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lnl2;->o:Lbm2;

    .line 4
    .line 5
    iput p2, p0, Lnl2;->p:I

    .line 6
    .line 7
    iput p3, p0, Lnl2;->q:I

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final d(Lpu1;I)V
    .locals 3

    .line 1
    iget v0, p0, Lnl2;->n:I

    .line 2
    .line 3
    iget v1, p0, Lnl2;->q:I

    .line 4
    .line 5
    iget v2, p0, Lnl2;->p:I

    .line 6
    .line 7
    iget-object p0, p0, Lnl2;->o:Lbm2;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lbm2;->c:Lmm2;

    .line 13
    .line 14
    invoke-interface {p1, p0, p2, v2, v1}, Lpu1;->F0(Lju1;III)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object p0, p0, Lbm2;->c:Lmm2;

    .line 19
    .line 20
    invoke-interface {p1, p0, p2, v2, v1}, Lpu1;->t(Lju1;III)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    iget-object p0, p0, Lbm2;->c:Lmm2;

    .line 25
    .line 26
    invoke-interface {p1, p0, p2, v2, v1}, Lpu1;->M(Lju1;III)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
