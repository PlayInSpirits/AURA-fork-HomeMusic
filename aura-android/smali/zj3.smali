.class public final Lzj3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Loi3;


# instance fields
.field public final synthetic n:Lbj2;

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;Lbj2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzj3;->o:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 5
    .line 6
    iput-object p2, p0, Lzj3;->n:Lbj2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final A(Ljw4;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lzj3;->o:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->o0()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final B(Lqi3;Lni3;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lzj3;->o:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0:Li61;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, Li61;->o:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Landroid/widget/LinearLayout;

    .line 10
    .line 11
    invoke-static {p0, p1}, Lfu;->K(Landroid/view/View;Lqi3;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final F(Ldo2;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lzj3;->n:Lbj2;

    .line 2
    .line 3
    iget-object p0, p0, Lzj3;->o:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->n0(Lbj2;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->q0(Ldo2;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->p0(Ldo2;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final f(I)V
    .locals 0

    .line 1
    invoke-static {p1}, Lud3;->t0(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final v(I)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    iget-object p0, p0, Lzj3;->o:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->o0()V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public final x(Z)V
    .locals 0

    .line 1
    invoke-static {p1}, Lud3;->x0(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
