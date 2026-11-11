.class public final synthetic Lgl2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lxl2;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lbm2;

.field public final synthetic p:Lgn2;


# direct methods
.method public synthetic constructor <init>(Lbm2;Lgn2;I)V
    .locals 0

    .line 1
    iput p3, p0, Lgl2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lgl2;->o:Lbm2;

    .line 4
    .line 5
    iput-object p2, p0, Lgl2;->p:Lgn2;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d(Lpu1;I)V
    .locals 3

    .line 1
    iget v0, p0, Lgl2;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lgl2;->p:Lgn2;

    .line 5
    .line 6
    iget-object p0, p0, Lgl2;->o:Lbm2;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lbm2;->c:Lmm2;

    .line 12
    .line 13
    invoke-virtual {v2, v1}, Lgn2;->c(Z)Landroid/os/Bundle;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {p1, p0, p2, v0}, Lpu1;->G(Lju1;ILandroid/os/Bundle;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    iget-object p0, p0, Lbm2;->c:Lmm2;

    .line 22
    .line 23
    invoke-virtual {v2, v1}, Lgn2;->c(Z)Landroid/os/Bundle;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {p1, p0, p2, v0}, Lpu1;->i0(Lju1;ILandroid/os/Bundle;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_1
    iget-object p0, p0, Lbm2;->c:Lmm2;

    .line 32
    .line 33
    invoke-virtual {v2, v1}, Lgn2;->c(Z)Landroid/os/Bundle;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {p1, p0, p2, v0, v1}, Lpu1;->o0(Lju1;ILandroid/os/Bundle;Z)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
