.class public final Ldefpackage/gj3;
.super Ldefpackage/dw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final q:[Ljava/lang/String;

.field public final r:[F

.field public s:I

.field public final synthetic t:Landroidx/media3/ui/PlayerControlView;


# direct methods
.method public constructor <init>(Landroidx/media3/ui/PlayerControlView;[Ljava/lang/String;[F)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/gj3;->t:Landroidx/media3/ui/PlayerControlView;

    .line 2
    .line 3
    invoke-direct {p0}, Ldefpackage/dw3;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Ldefpackage/gj3;->q:[Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Ldefpackage/gj3;->r:[F

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/gj3;->q:[Ljava/lang/String;

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    return p0
.end method

.method public final g(Ldefpackage/cx3;I)V
    .locals 4

    .line 1
    check-cast p1, Ldefpackage/kj3;

    .line 2
    .line 3
    iget-object v0, p1, Ldefpackage/kj3;->v:Landroid/view/View;

    .line 4
    .line 5
    iget-object v1, p1, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 6
    .line 7
    iget-object v2, p0, Ldefpackage/gj3;->q:[Ljava/lang/String;

    .line 8
    .line 9
    array-length v3, v2

    .line 10
    if-ge p2, v3, :cond_0

    .line 11
    .line 12
    iget-object p1, p1, Ldefpackage/kj3;->u:Landroid/widget/TextView;

    .line 13
    .line 14
    aget-object v2, v2, p2

    .line 15
    .line 16
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget p1, p0, Ldefpackage/gj3;->s:I

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-ne p2, p1, :cond_1

    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    invoke-virtual {v1, p1}, Landroid/view/View;->setSelected(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v1, v2}, Landroid/view/View;->setSelected(Z)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x4

    .line 36
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 37
    .line 38
    .line 39
    :goto_0
    new-instance p1, Ldefpackage/fj3;

    .line 40
    .line 41
    invoke-direct {p1, p0, p2}, Ldefpackage/fj3;-><init>(Ldefpackage/gj3;I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final i(Landroid/view/ViewGroup;I)Ldefpackage/cx3;
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/gj3;->t:Landroidx/media3/ui/PlayerControlView;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const p2, 0x7f0d005d

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p0, p2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance p1, Ldefpackage/kj3;

    .line 20
    .line 21
    invoke-direct {p1, p0}, Ldefpackage/kj3;-><init>(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    return-object p1
.end method
