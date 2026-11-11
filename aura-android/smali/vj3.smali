.class public final synthetic Lvj3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lvj3;->a:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(F)V
    .locals 3

    .line 1
    iget-object p0, p0, Lvj3;->a:Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->v0:Landroid/widget/Button;

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const v2, 0x7f1303d6

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v2, v1}, Lkc1;->t(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lu52;->c()Lv52;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iget-boolean v0, v0, Lv52;->a:Z

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-static {p1}, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->l0(F)Lqh3;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    iget p0, p0, Lqh3;->b:F

    .line 36
    .line 37
    invoke-static {p1, p0}, Lu52;->j(FF)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;->M0:Lbl2;

    .line 42
    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    new-instance v1, Lxj3;

    .line 47
    .line 48
    invoke-direct {v1, p0, p1}, Lxj3;-><init>(Lcom/eddyizm/tempus/ui/fragment/PlayerControllerFragment;F)V

    .line 49
    .line 50
    .line 51
    sget-object p0, Lgq0;->n:Lgq0;

    .line 52
    .line 53
    invoke-virtual {v0, v1, p0}, Lu0;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method
