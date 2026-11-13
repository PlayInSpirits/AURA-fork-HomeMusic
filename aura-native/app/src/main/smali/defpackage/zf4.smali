.class public final Ldefpackage/zf4;
.super Ldefpackage/ji2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/zf4;->c:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Landroid/view/ViewGroup;Landroid/view/View;)F
    .locals 1

    .line 1
    iget p0, p0, Ldefpackage/zf4;->c:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    sget-object p0, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-ne p0, v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    int-to-float p1, p1

    .line 24
    sub-float/2addr p0, p1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    int-to-float p1, p1

    .line 35
    add-float/2addr p0, p1

    .line 36
    :goto_0
    return p0

    .line 37
    :pswitch_0
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    int-to-float p1, p1

    .line 46
    add-float/2addr p0, p1

    .line 47
    return p0

    .line 48
    :pswitch_1
    sget-object p0, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 49
    .line 50
    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-ne p0, v0, :cond_1

    .line 55
    .line 56
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    int-to-float p1, p1

    .line 65
    add-float/2addr p0, p1

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    int-to-float p1, p1

    .line 76
    sub-float/2addr p0, p1

    .line 77
    :goto_1
    return p0

    .line 78
    :pswitch_2
    invoke-virtual {p2}, Landroid/view/View;->getTranslationX()F

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    int-to-float p1, p1

    .line 87
    sub-float/2addr p0, p1

    .line 88
    return p0

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
