.class public final synthetic Ljl2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lxl2;
.implements Lqc2;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lbm2;

.field public final synthetic p:Z


# direct methods
.method public synthetic constructor <init>(Lbm2;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Ljl2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ljl2;->o:Lbm2;

    .line 4
    .line 5
    iput-boolean p2, p0, Ljl2;->p:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public d(Lpu1;I)V
    .locals 2

    .line 1
    iget v0, p0, Ljl2;->n:I

    .line 2
    .line 3
    iget-boolean v1, p0, Ljl2;->p:Z

    .line 4
    .line 5
    iget-object p0, p0, Ljl2;->o:Lbm2;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    :pswitch_0
    iget-object p0, p0, Lbm2;->c:Lmm2;

    .line 11
    .line 12
    invoke-interface {p1, p0, p2, v1}, Lpu1;->B0(Lju1;IZ)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    iget-object p0, p0, Lbm2;->c:Lmm2;

    .line 17
    .line 18
    invoke-interface {p1, p0, p2, v1}, Lpu1;->H0(Lju1;IZ)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_2
    iget-object p0, p0, Lbm2;->c:Lmm2;

    .line 23
    .line 24
    invoke-interface {p1, p0, p2, v1}, Lpu1;->h0(Lju1;IZ)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Ljl2;->n:I

    .line 2
    .line 3
    iget-boolean v1, p0, Ljl2;->p:Z

    .line 4
    .line 5
    iget-object p0, p0, Ljl2;->o:Lbm2;

    .line 6
    .line 7
    check-cast p1, Loi3;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 13
    .line 14
    iget p0, p0, Llk3;->t:I

    .line 15
    .line 16
    invoke-interface {p1, p0, v1}, Loi3;->C(IZ)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object p0, p0, Lbm2;->q:Llk3;

    .line 21
    .line 22
    iget p0, p0, Llk3;->t:I

    .line 23
    .line 24
    invoke-interface {p1, p0, v1}, Loi3;->C(IZ)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
