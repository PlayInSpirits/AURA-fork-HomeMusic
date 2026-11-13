.class public Ldefpackage/ah2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Landroid/window/OnBackInvokedCallback;


# virtual methods
.method public a(Ldefpackage/zg2;)Landroid/window/OnBackInvokedCallback;
    .locals 1

    .line 1
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    new-instance p0, Ldefpackage/vf;

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    invoke-direct {p0, v0, p1}, Ldefpackage/vf;-><init>(ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public b(Ldefpackage/zg2;Landroid/view/View;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/ah2;->a:Landroid/window/OnBackInvokedCallback;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-static {p2}, Ldefpackage/n3;->m(Landroid/view/View;)Landroid/window/OnBackInvokedDispatcher;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    if-nez p2, :cond_1

    .line 11
    .line 12
    :goto_0
    return-void

    .line 13
    :cond_1
    invoke-virtual {p0, p1}, Ldefpackage/ah2;->a(Ldefpackage/zg2;)Landroid/window/OnBackInvokedCallback;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Ldefpackage/ah2;->a:Landroid/window/OnBackInvokedCallback;

    .line 18
    .line 19
    if-eqz p3, :cond_2

    .line 20
    .line 21
    const p0, 0xf4240

    .line 22
    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    const/4 p0, 0x0

    .line 26
    :goto_1
    invoke-static {p2, p0, p1}, Ldefpackage/n3;->u(Landroid/window/OnBackInvokedDispatcher;ILandroid/window/OnBackInvokedCallback;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public c(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-static {p1}, Ldefpackage/n3;->m(Landroid/view/View;)Landroid/window/OnBackInvokedDispatcher;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Ldefpackage/ah2;->a:Landroid/window/OnBackInvokedCallback;

    .line 9
    .line 10
    invoke-static {p1, v0}, Ldefpackage/n3;->C(Landroid/window/OnBackInvokedDispatcher;Landroid/window/OnBackInvokedCallback;)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput-object p1, p0, Ldefpackage/ah2;->a:Landroid/window/OnBackInvokedCallback;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
