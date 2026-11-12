.class public Lrp2;
.super Lpp0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final B0:Z

.field public C0:Ldg;

.field public D0:Lrq2;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lpp0;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lrp2;->B0:Z

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lpp0;->r0:Z

    .line 9
    .line 10
    iget-object p0, p0, Lpp0;->w0:Landroid/app/Dialog;

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
.method public final S()V
    .locals 1

    .line 1
    invoke-super {p0}, Lpp0;->S()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lrp2;->C0:Ldg;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-boolean p0, p0, Lrp2;->B0:Z

    .line 9
    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    check-cast v0, Lqp2;

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    invoke-virtual {v0, p0}, Lqp2;->m(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final j0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 1

    .line 1
    iget-boolean p1, p0, Lrp2;->B0:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lkc1;->n()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance v0, Llq2;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Llq2;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lrp2;->C0:Ldg;

    .line 15
    .line 16
    iget-object p1, p0, Lrp2;->D0:Lrq2;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Llq2;->l(Lrq2;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0}, Lkc1;->n()Landroid/content/Context;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance v0, Lqp2;

    .line 27
    .line 28
    invoke-direct {v0, p1}, Lqp2;-><init>(Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lrp2;->C0:Ldg;

    .line 32
    .line 33
    :goto_0
    iget-object p0, p0, Lrp2;->C0:Ldg;

    .line 34
    .line 35
    return-object p0
.end method

.method public final onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lkc1;->R:Z

    .line 3
    .line 4
    iget-object p1, p0, Lrp2;->C0:Ldg;

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    iget-boolean p0, p0, Lrp2;->B0:Z

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    check-cast p1, Llq2;

    .line 13
    .line 14
    invoke-virtual {p1}, Llq2;->m()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    check-cast p1, Lqp2;

    .line 19
    .line 20
    invoke-virtual {p1}, Lqp2;->v()V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
.end method
