.class public final synthetic Lxj3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

.field public final synthetic o:F


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxj3;->n:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 5
    .line 6
    iput p2, p0, Lxj3;->o:F

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lxj3;->n:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 2
    .line 3
    iget p0, p0, Lxj3;->o:F

    .line 4
    .line 5
    :try_start_0
    iget-object v0, v0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->M0:Lbl2;

    .line 6
    .line 7
    invoke-virtual {v0}, Lu0;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lbj2;

    .line 12
    .line 13
    invoke-static {p0}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0(F)Lqh3;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {v0, p0}, Lsk2;->d(Lqh3;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_0
    move-exception p0

    .line 22
    const-string v0, "PlayerCoverFragment"

    .line 23
    .line 24
    const-string v1, "Error applying playback speed"

    .line 25
    .line 26
    invoke-static {v0, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 27
    .line 28
    .line 29
    return-void
.end method
