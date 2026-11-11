.class public final synthetic Ldl2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lxl2;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lbm2;

.field public final synthetic p:Lva4;

.field public final synthetic q:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lbm2;Lva4;Landroid/os/Bundle;I)V
    .locals 0

    .line 1
    iput p4, p0, Ldl2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldl2;->o:Lbm2;

    .line 4
    .line 5
    iput-object p2, p0, Ldl2;->p:Lva4;

    .line 6
    .line 7
    iput-object p3, p0, Ldl2;->q:Landroid/os/Bundle;

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
    .locals 8

    .line 1
    iget v0, p0, Ldl2;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Ldl2;->p:Lva4;

    .line 4
    .line 5
    iget-object v2, p0, Ldl2;->o:Lbm2;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, v2, Lbm2;->c:Lmm2;

    .line 11
    .line 12
    invoke-virtual {v1}, Lva4;->b()Landroid/os/Bundle;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object p0, p0, Ldl2;->q:Landroid/os/Bundle;

    .line 17
    .line 18
    invoke-interface {p1, v0, p2, v1, p0}, Lpu1;->t0(Lju1;ILandroid/os/Bundle;Landroid/os/Bundle;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object v3, v2, Lbm2;->c:Lmm2;

    .line 23
    .line 24
    invoke-virtual {v1}, Lva4;->b()Landroid/os/Bundle;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    const/4 v7, 0x0

    .line 29
    iget-object v6, p0, Ldl2;->q:Landroid/os/Bundle;

    .line 30
    .line 31
    move-object v2, p1

    .line 32
    move v4, p2

    .line 33
    invoke-interface/range {v2 .. v7}, Lpu1;->s(Lju1;ILandroid/os/Bundle;Landroid/os/Bundle;Z)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
