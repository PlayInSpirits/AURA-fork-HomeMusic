.class public Lif0;
.super Lkc1;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public l0:Loz;

.field public m0:Landroid/widget/Button;

.field public n0:Landroid/widget/Button;

.field public o0:Landroid/widget/TextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lkc1;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final H(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    .line 1
    const p3, 0x7f0d0068

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const p2, 0x7f0a017f

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    check-cast p2, Landroid/widget/Button;

    .line 17
    .line 18
    iput-object p2, p0, Lif0;->m0:Landroid/widget/Button;

    .line 19
    .line 20
    const p2, 0x7f0a0180

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    check-cast p2, Landroid/widget/Button;

    .line 28
    .line 29
    iput-object p2, p0, Lif0;->n0:Landroid/widget/Button;

    .line 30
    .line 31
    const p2, 0x7f0a0181

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    check-cast p2, Landroid/widget/TextView;

    .line 39
    .line 40
    iput-object p2, p0, Lif0;->o0:Landroid/widget/TextView;

    .line 41
    .line 42
    return-object p1
.end method

.method public final T(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkc1;->l()Lnc1;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/eddyizm/tempus/ui/crash/CrashActivity;

    .line 6
    .line 7
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/crash/CrashActivity;->O:Loz;

    .line 8
    .line 9
    iput-object p1, p0, Lif0;->l0:Loz;

    .line 10
    .line 11
    iget-object p1, p0, Lif0;->m0:Landroid/widget/Button;

    .line 12
    .line 13
    new-instance p2, Lhf0;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {p2, p0, v0}, Lhf0;-><init>(Lif0;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lif0;->n0:Landroid/widget/Button;

    .line 23
    .line 24
    new-instance p2, Lhf0;

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    invoke-direct {p2, p0, v0}, Lhf0;-><init>(Lif0;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lif0;->o0:Landroid/widget/TextView;

    .line 34
    .line 35
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-static {p2}, Lbu;->m(Landroid/content/Context;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    iget-object p1, p0, Lif0;->o0:Landroid/widget/TextView;

    .line 47
    .line 48
    sget-object p2, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    .line 49
    .line 50
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 51
    .line 52
    .line 53
    iget-object p0, p0, Lif0;->o0:Landroid/widget/TextView;

    .line 54
    .line 55
    new-instance p1, Landroid/text/method/ScrollingMovementMethod;

    .line 56
    .line 57
    invoke-direct {p1}, Landroid/text/method/ScrollingMovementMethod;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method
