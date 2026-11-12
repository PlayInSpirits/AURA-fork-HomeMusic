.class public final Lcom/eddyizm/tempus/lan/LanPlaybackActivity;
.super Ldf;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final synthetic N:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ldf;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lz52;->a(Landroid/view/KeyEvent;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    invoke-super {p0, p1}, Ldf;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0

    .line 19
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 20
    return p0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-static {p0}, Ljz4;->r(Ldf;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p0}, Lkb4;->T(Ldf;)V

    .line 5
    .line 6
    .line 7
    invoke-super {p0, p1}, Lnc1;->onCreate(Landroid/os/Bundle;)V

    .line 8
    .line 9
    .line 10
    const v0, 0x7f0d0086

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Ldf;->setContentView(I)V

    .line 14
    .line 15
    .line 16
    const v0, 0x7f0a056f

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Ldf;->findViewById(I)Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 24
    .line 25
    const v1, 0x7f1302e7

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setTitle(I)V

    .line 29
    .line 30
    .line 31
    new-instance v1, Lp6;

    .line 32
    .line 33
    const/16 v2, 0x16

    .line 34
    .line 35
    invoke-direct {v1, v2, p0}, Lp6;-><init>(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    .line 40
    .line 41
    const v0, 0x1020002

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v0}, Ldf;->findViewById(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v1, Ler1;

    .line 49
    .line 50
    const/16 v2, 0xa

    .line 51
    .line 52
    invoke-direct {v1, v2}, Ler1;-><init>(I)V

    .line 53
    .line 54
    .line 55
    sget-object v2, Lj65;->a:Ljava/util/WeakHashMap;

    .line 56
    .line 57
    invoke-static {v0, v1}, La65;->c(Landroid/view/View;Lr83;)V

    .line 58
    .line 59
    .line 60
    if-nez p1, :cond_0

    .line 61
    .line 62
    invoke-virtual {p0}, Lnc1;->k()Lmd1;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    new-instance p1, Lpo;

    .line 70
    .line 71
    invoke-direct {p1, p0}, Lpo;-><init>(Lld1;)V

    .line 72
    .line 73
    .line 74
    new-instance p0, Lh62;

    .line 75
    .line 76
    invoke-direct {p0}, Lh62;-><init>()V

    .line 77
    .line 78
    .line 79
    const/4 v0, 0x0

    .line 80
    const v1, 0x7f0a056e

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v1, p0, v0}, Lpo;->j(ILkc1;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const/4 p0, 0x0

    .line 87
    invoke-virtual {p1, p0}, Lpo;->e(Z)I

    .line 88
    .line 89
    .line 90
    :cond_0
    return-void
.end method
