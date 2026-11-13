.class public final synthetic Ldefpackage/e70;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/w92;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ldefpackage/nc1;


# direct methods
.method public synthetic constructor <init>(Ldefpackage/nc1;I)V
    .locals 0

    .line 1
    iput p2, p0, Ldefpackage/e70;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ldefpackage/e70;->o:Ldefpackage/nc1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ldefpackage/ba2;Ldefpackage/q92;)V
    .locals 0

    .line 1
    iget p1, p0, Ldefpackage/e70;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/e70;->o:Ldefpackage/nc1;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p1, Ldefpackage/q92;->ON_DESTROY:Ldefpackage/q92;

    .line 9
    .line 10
    if-ne p2, p1, :cond_1

    .line 11
    .line 12
    iget-object p1, p0, Ldefpackage/l70;->o:Ldefpackage/sd0;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    iput-object p2, p1, Ldefpackage/sd0;->o:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/app/Activity;->isChangingConfigurations()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Ldefpackage/l70;->d()Ldefpackage/e75;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ldefpackage/e75;->a()V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object p0, p0, Ldefpackage/l70;->s:Ldefpackage/i70;

    .line 31
    .line 32
    iget-object p1, p0, Ldefpackage/i70;->q:Ldefpackage/nc1;

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p2, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->removeOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    return-void

    .line 61
    :pswitch_0
    sget-object p1, Ldefpackage/q92;->ON_STOP:Ldefpackage/q92;

    .line 62
    .line 63
    if-ne p2, p1, :cond_2

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    if-eqz p0, :cond_2

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    if-eqz p0, :cond_2

    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/view/View;->cancelPendingInputEvents()V

    .line 78
    .line 79
    .line 80
    :cond_2
    return-void

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
