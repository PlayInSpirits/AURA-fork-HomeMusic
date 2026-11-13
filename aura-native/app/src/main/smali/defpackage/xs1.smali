.class public final synthetic Ldefpackage/xs1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/activity/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/activity/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/xs1;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/xs1;->o:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Ldefpackage/xs1;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/xs1;->o:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget v0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->e0:I

    .line 9
    .line 10
    :try_start_0
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->P:Ldefpackage/bl2;

    .line 11
    .line 12
    invoke-virtual {v0}, Ldefpackage/u0;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ldefpackage/bj2;

    .line 17
    .line 18
    new-instance v1, Ldefpackage/tf2;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Ldefpackage/tf2;-><init>(Lcom/eddyizm/tempus/ui/activity/MainActivity;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ldefpackage/sk2;->v(Ldefpackage/oi3;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->P:Ldefpackage/bl2;

    .line 27
    .line 28
    invoke-virtual {v0}, Ldefpackage/u0;->get()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ldefpackage/bj2;

    .line 33
    .line 34
    invoke-virtual {v0}, Ldefpackage/sk2;->a()Ldefpackage/gn2;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->W:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 41
    .line 42
    iget v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:I
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    .line 43
    .line 44
    const/4 v1, 0x5

    .line 45
    if-ne v0, v1, :cond_0

    .line 46
    .line 47
    :try_start_1
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Ldefpackage/zg5;

    .line 48
    .line 49
    iget-object p0, p0, Ldefpackage/zg5;->n:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p0, Ldefpackage/au;

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    invoke-virtual {p0, v0}, Ldefpackage/au;->d(Z)V
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :catch_0
    move-exception p0

    .line 59
    goto :goto_0

    .line 60
    :catch_1
    move-exception p0

    .line 61
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 62
    .line 63
    .line 64
    :cond_0
    :goto_1
    return-void

    .line 65
    :pswitch_0
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->t()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_1

    .line 74
    .line 75
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_1

    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->H()V

    .line 82
    .line 83
    .line 84
    :cond_1
    return-void

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
