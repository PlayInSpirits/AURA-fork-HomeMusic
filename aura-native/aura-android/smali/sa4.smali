.class public Lsa4;
.super Lpp0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lpp0;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final R()V
    .locals 4

    .line 1
    invoke-super {p0}, Lpp0;->R()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lpp0;->w0:Landroid/app/Dialog;

    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    check-cast v0, Lf9;

    .line 10
    .line 11
    const/4 v1, -0x3

    .line 12
    invoke-virtual {v0, v1}, Lf9;->i(I)Landroid/widget/Button;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, Lj8;

    .line 17
    .line 18
    const/16 v3, 0x16

    .line 19
    .line 20
    invoke-direct {v2, v3, p0, v0}, Lj8;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, -0x1

    .line 27
    invoke-virtual {v0, p0}, Lf9;->i(I)Landroid/widget/Button;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    new-instance v1, Lio0;

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-direct {v1, v0, v2}, Lio0;-><init>(Lf9;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final j0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lkc1;->o()Landroid/view/LayoutInflater;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const v0, 0x7f0d004d

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    check-cast p1, Landroid/widget/LinearLayout;

    .line 17
    .line 18
    new-instance v0, Lvg2;

    .line 19
    .line 20
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-direct {v0, p0, v2}, Lvg2;-><init>(Landroid/content/Context;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lvg2;->q(Landroid/view/View;)Lvg2;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const p1, 0x7f130468

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lvg2;->p(I)V

    .line 35
    .line 36
    .line 37
    const p1, 0x7f130466

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1, v1}, Lvg2;->l(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const p1, 0x7f130465

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1, v1}, Lvg2;->k(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 48
    .line 49
    .line 50
    new-instance p1, Lwr;

    .line 51
    .line 52
    const/16 v0, 0xc

    .line 53
    .line 54
    invoke-direct {p1, v0}, Lwr;-><init>(I)V

    .line 55
    .line 56
    .line 57
    const v0, 0x7f130464

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v0, p1}, Lvg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {p0}, Lvg2;->create()Lf9;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-virtual {p0, v2}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v2}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 72
    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_0
    const-string p0, "rootView"

    .line 76
    .line 77
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    return-object v1
.end method
