.class public Lxr;
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
.method public final j0(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lkc1;->o()Landroid/view/LayoutInflater;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const v0, 0x7f0d003d

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
    const v0, 0x7f0a0109

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    check-cast v3, Landroid/widget/TextView;

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    const v0, 0x7f0a010a

    .line 26
    .line 27
    .line 28
    invoke-static {p1, v0}, Luo;->s(Landroid/view/View;I)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Landroid/widget/TextView;

    .line 33
    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    check-cast p1, Landroid/widget/LinearLayout;

    .line 37
    .line 38
    new-instance v0, Lvg2;

    .line 39
    .line 40
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-direct {v0, v3, v2}, Lvg2;-><init>(Landroid/content/Context;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1}, Lvg2;->q(Landroid/view/View;)Lvg2;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const v0, 0x7f130036

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v0}, Lvg2;->p(I)V

    .line 55
    .line 56
    .line 57
    new-instance v0, Lvr;

    .line 58
    .line 59
    invoke-direct {v0, v2, p0}, Lvr;-><init>(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    const p0, 0x7f13008a

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, p0, v0}, Lvg2;->l(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    new-instance p1, Lwr;

    .line 70
    .line 71
    invoke-direct {p1, v2}, Lwr;-><init>(I)V

    .line 72
    .line 73
    .line 74
    const v0, 0x7f130089

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, v0, p1}, Lvg2;->k(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 78
    .line 79
    .line 80
    const p1, 0x7f130088

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, p1, v1}, Lvg2;->j(ILandroid/content/DialogInterface$OnClickListener;)Lvg2;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p0}, Lvg2;->create()Lf9;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    return-object p0

    .line 92
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    const-string p1, "Missing required view with ID: "

    .line 101
    .line 102
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-static {p0}, Lnz2;->n(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-object v1
.end method
