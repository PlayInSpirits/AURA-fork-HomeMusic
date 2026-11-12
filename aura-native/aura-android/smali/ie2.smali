.class public final Lie2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lcom/eddyizm/tempus/interfaces/SystemCallback;


# instance fields
.field public final synthetic n:Lcom/eddyizm/tempus/ui/fragment/LoginFragment;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/ui/fragment/LoginFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lie2;->n:Lcom/eddyizm/tempus/ui/fragment/LoginFragment;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onError(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    invoke-static {}, Lud3;->H0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-static {v0}, Lud3;->w0(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lud3;->v0(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lud3;->D0(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lud3;->q0(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lud3;->C0(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lud3;->u0(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-static {v1}, Lud3;->o0(Z)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lud3;->h0(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    invoke-static {v0}, Lcom/eddyizm/tempus/App;->f(Z)Lpn4;

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lie2;->n:Lcom/eddyizm/tempus/ui/fragment/LoginFragment;

    .line 35
    .line 36
    invoke-virtual {p0}, Lkc1;->n()Landroid/content/Context;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {p0}, Lkc1;->y()Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_0

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {v0, p0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 57
    .line 58
    .line 59
    :cond_0
    return-void
.end method

.method public final onSuccess(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    new-instance p1, Lmm3;

    .line 2
    .line 3
    invoke-direct {p1}, Lmm3;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lmm3;->h()V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lie2;->n:Lcom/eddyizm/tempus/ui/fragment/LoginFragment;

    .line 10
    .line 11
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/LoginFragment;->m0:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->v()V

    .line 14
    .line 15
    .line 16
    return-void
.end method
