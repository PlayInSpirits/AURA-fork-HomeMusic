.class public Ldefpackage/fp2;
.super Ldefpackage/pp0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final B0:Z

.field public C0:Ldefpackage/dg;

.field public D0:Ldefpackage/rq2;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ldefpackage/pp0;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Ldefpackage/fp2;->B0:Z

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Ldefpackage/pp0;->r0:Z

    .line 9
    .line 10
    iget-object p0, p0, Ldefpackage/pp0;->w0:Landroid/app/Dialog;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method


# virtual methods
.method public final j0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 1

    .line 1
    iget-boolean p1, p0, Ldefpackage/fp2;->B0:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/kc1;->n()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, Ldefpackage/aq2;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ldefpackage/aq2;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Ldefpackage/fp2;->C0:Ldefpackage/dg;

    .line 15
    .line 16
    invoke-virtual {p0}, Ldefpackage/fp2;->n0()V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Ldefpackage/fp2;->D0:Ldefpackage/rq2;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ldefpackage/aq2;->j(Ldefpackage/rq2;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, Ldefpackage/kc1;->n()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    new-instance v0, Ldefpackage/ep2;

    .line 30
    .line 31
    invoke-direct {v0, p1}, Ldefpackage/ep2;-><init>(Landroid/content/Context;)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, Ldefpackage/fp2;->C0:Ldefpackage/dg;

    .line 35
    .line 36
    invoke-virtual {p0}, Ldefpackage/fp2;->n0()V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Ldefpackage/fp2;->D0:Ldefpackage/rq2;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Ldefpackage/ep2;->k(Ldefpackage/rq2;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    iget-object p0, p0, Ldefpackage/fp2;->C0:Ldefpackage/dg;

    .line 45
    .line 46
    return-object p0
.end method

.method public final n0()V
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/fp2;->D0:Ldefpackage/rq2;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Ldefpackage/kc1;->s:Landroid/os/Bundle;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    const-string v1, "selector"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    new-instance v2, Ldefpackage/rq2;

    .line 19
    .line 20
    invoke-direct {v2, v0, v1}, Ldefpackage/rq2;-><init>(Landroid/os/Bundle;Ljava/util/ArrayList;)V

    .line 21
    .line 22
    .line 23
    move-object v1, v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object v0, Ldefpackage/rq2;->c:Ldefpackage/rq2;

    .line 26
    .line 27
    :goto_0
    iput-object v1, p0, Ldefpackage/fp2;->D0:Ldefpackage/rq2;

    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Ldefpackage/fp2;->D0:Ldefpackage/rq2;

    .line 30
    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    sget-object v0, Ldefpackage/rq2;->c:Ldefpackage/rq2;

    .line 34
    .line 35
    iput-object v0, p0, Ldefpackage/fp2;->D0:Ldefpackage/rq2;

    .line 36
    .line 37
    :cond_2
    return-void
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 4

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Ldefpackage/kc1;->R:Z

    .line 3
    .line 4
    iget-object p1, p0, Ldefpackage/fp2;->C0:Ldefpackage/dg;

    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-boolean p0, p0, Ldefpackage/fp2;->B0:Z

    .line 10
    .line 11
    const/4 v0, -0x2

    .line 12
    if-eqz p0, :cond_3

    .line 13
    .line 14
    check-cast p1, Ldefpackage/aq2;

    .line 15
    .line 16
    iget-object p0, p1, Ldefpackage/aq2;->v:Landroid/content/Context;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const v2, 0x7f050006

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    const/4 v3, -0x1

    .line 30
    if-nez v1, :cond_1

    .line 31
    .line 32
    move v1, v3

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-static {p0}, Ldefpackage/xl;->p(Landroid/content/Context;)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0, v2}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-nez p0, :cond_2

    .line 47
    .line 48
    move v0, v3

    .line 49
    :cond_2
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0, v1, v0}, Landroid/view/Window;->setLayout(II)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_3
    check-cast p1, Ldefpackage/ep2;

    .line 58
    .line 59
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {p1}, Ldefpackage/xl;->p(Landroid/content/Context;)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-virtual {p0, p1, v0}, Landroid/view/Window;->setLayout(II)V

    .line 72
    .line 73
    .line 74
    return-void
.end method
