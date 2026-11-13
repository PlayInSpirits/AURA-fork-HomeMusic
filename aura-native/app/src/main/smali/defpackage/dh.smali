.class public final Ldefpackage/dh;
.super Ldefpackage/au0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic G:I

.field public final synthetic H:I

.field public final synthetic I:Ljava/lang/ref/WeakReference;

.field public final synthetic J:Ldefpackage/ih;


# direct methods
.method public constructor <init>(Ldefpackage/ih;IILjava/lang/ref/WeakReference;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/dh;->J:Ldefpackage/ih;

    .line 5
    .line 6
    iput p2, p0, Ldefpackage/dh;->G:I

    .line 7
    .line 8
    iput p3, p0, Ldefpackage/dh;->H:I

    .line 9
    .line 10
    iput-object p4, p0, Ldefpackage/dh;->I:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final M(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final N(Landroid/graphics/Typeface;)V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_1

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    iget v1, p0, Ldefpackage/dh;->G:I

    .line 10
    .line 11
    if-eq v1, v0, :cond_1

    .line 12
    .line 13
    iget v0, p0, Ldefpackage/dh;->H:I

    .line 14
    .line 15
    and-int/lit8 v0, v0, 0x2

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move v0, v2

    .line 22
    :goto_0
    invoke-static {p1, v1, v0}, Ldefpackage/hh;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :cond_1
    iget-object v0, p0, Ldefpackage/dh;->J:Ldefpackage/ih;

    .line 27
    .line 28
    iget-boolean v1, v0, Ldefpackage/ih;->m:Z

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    iput-object p1, v0, Ldefpackage/ih;->l:Landroid/graphics/Typeface;

    .line 33
    .line 34
    iget-object p0, p0, Ldefpackage/dh;->I:Ljava/lang/ref/WeakReference;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Landroid/widget/TextView;

    .line 41
    .line 42
    if-eqz p0, :cond_3

    .line 43
    .line 44
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    iget v0, v0, Ldefpackage/ih;->j:I

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    new-instance v1, Ldefpackage/eh;

    .line 53
    .line 54
    invoke-direct {v1, p0, p1, v0, v2}, Ldefpackage/eh;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    invoke-virtual {p0, p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 62
    .line 63
    .line 64
    :cond_3
    return-void
.end method
