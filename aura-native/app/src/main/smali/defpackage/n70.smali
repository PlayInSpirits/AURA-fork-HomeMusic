.class public Ldefpackage/n70;
.super Landroid/app/Dialog;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/ba2;
.implements Ldefpackage/j54;


# instance fields
.field public n:Ldefpackage/ea2;

.field public final o:Ldefpackage/gp3;

.field public final p:Ldefpackage/rp4;

.field public final q:Ldefpackage/rp4;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 5
    .line 6
    .line 7
    new-instance p1, Ldefpackage/xm2;

    .line 8
    .line 9
    new-instance p2, Ldefpackage/wc;

    .line 10
    .line 11
    const/16 v0, 0x16

    .line 12
    .line 13
    invoke-direct {p2, v0, p0}, Ldefpackage/wc;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p1, p0, p2}, Ldefpackage/xm2;-><init>(Ldefpackage/j54;Ldefpackage/wc;)V

    .line 17
    .line 18
    .line 19
    new-instance p2, Ldefpackage/gp3;

    .line 20
    .line 21
    invoke-direct {p2, p1}, Ldefpackage/gp3;-><init>(Ldefpackage/xm2;)V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Ldefpackage/n70;->o:Ldefpackage/gp3;

    .line 25
    .line 26
    new-instance p1, Ldefpackage/m70;

    .line 27
    .line 28
    const/4 p2, 0x0

    .line 29
    invoke-direct {p1, p0, p2}, Ldefpackage/m70;-><init>(Ldefpackage/n70;I)V

    .line 30
    .line 31
    .line 32
    new-instance p2, Ldefpackage/rp4;

    .line 33
    .line 34
    invoke-direct {p2, p1}, Ldefpackage/rp4;-><init>(Ldefpackage/gf1;)V

    .line 35
    .line 36
    .line 37
    iput-object p2, p0, Ldefpackage/n70;->p:Ldefpackage/rp4;

    .line 38
    .line 39
    new-instance p1, Ldefpackage/m70;

    .line 40
    .line 41
    const/4 p2, 0x1

    .line 42
    invoke-direct {p1, p0, p2}, Ldefpackage/m70;-><init>(Ldefpackage/n70;I)V

    .line 43
    .line 44
    .line 45
    new-instance p2, Ldefpackage/rp4;

    .line 46
    .line 47
    invoke-direct {p2, p1}, Ldefpackage/rp4;-><init>(Ldefpackage/gf1;)V

    .line 48
    .line 49
    .line 50
    iput-object p2, p0, Ldefpackage/n70;->q:Ldefpackage/rp4;

    .line 51
    .line 52
    return-void
.end method

.method public static a(Ldefpackage/n70;)V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->onBackPressed()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/n70;->d()V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final b()Ldefpackage/ea2;
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/n70;->n:Ldefpackage/ea2;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ldefpackage/ea2;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p0, v1}, Ldefpackage/ea2;-><init>(Ldefpackage/ba2;Z)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Ldefpackage/n70;->n:Ldefpackage/ea2;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public final c()Ldefpackage/a93;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/n70;->q:Ldefpackage/rp4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/rp4;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/a93;

    .line 8
    .line 9
    return-object p0
.end method

.method public final d()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const v1, 0x7f0a0658

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    const v1, 0x7f0a065a

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const v1, 0x7f0a065b

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    const v1, 0x7f0a0659

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1, p0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final f()Ldefpackage/rm3;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/n70;->o:Ldefpackage/gp3;

    .line 2
    .line 3
    iget-object p0, p0, Ldefpackage/gp3;->p:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Ldefpackage/rm3;

    .line 6
    .line 7
    return-object p0
.end method

.method public final h()Ldefpackage/ea2;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ldefpackage/n70;->b()Ldefpackage/ea2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final onBackPressed()V
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/n70;->p:Ldefpackage/rp4;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/rp4;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/iq0;

    .line 8
    .line 9
    invoke-virtual {p0}, Ldefpackage/v33;->a()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 5
    .line 6
    const/16 v1, 0x21

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Ldefpackage/n70;->c()Ldefpackage/a93;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {p0}, Ldefpackage/n3;->k(Ldefpackage/n70;)Landroid/window/OnBackInvokedDispatcher;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ldefpackage/a93;->c(Landroid/window/OnBackInvokedDispatcher;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Ldefpackage/n70;->o:Ldefpackage/gp3;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ldefpackage/gp3;->s(Landroid/os/Bundle;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Ldefpackage/n70;->b()Ldefpackage/ea2;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    sget-object p1, Ldefpackage/q92;->ON_CREATE:Ldefpackage/q92;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Ldefpackage/ea2;->d(Ldefpackage/q92;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Bundle;
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/n70;->o:Ldefpackage/gp3;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ldefpackage/gp3;->t(Landroid/os/Bundle;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public onStart()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Dialog;->onStart()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/n70;->b()Ldefpackage/ea2;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, Ldefpackage/q92;->ON_RESUME:Ldefpackage/q92;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ldefpackage/ea2;->d(Ldefpackage/q92;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public onStop()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ldefpackage/n70;->b()Ldefpackage/ea2;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ldefpackage/q92;->ON_DESTROY:Ldefpackage/q92;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ldefpackage/ea2;->d(Ldefpackage/q92;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Ldefpackage/n70;->n:Ldefpackage/ea2;

    .line 12
    .line 13
    invoke-super {p0}, Landroid/app/Dialog;->onStop()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setContentView(I)V
    .locals 0

    .line 11
    invoke-virtual {p0}, Ldefpackage/n70;->d()V

    .line 12
    invoke-super {p0, p1}, Landroid/app/Dialog;->setContentView(I)V

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ldefpackage/n70;->d()V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    invoke-virtual {p0}, Ldefpackage/n70;->d()V

    .line 14
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method
