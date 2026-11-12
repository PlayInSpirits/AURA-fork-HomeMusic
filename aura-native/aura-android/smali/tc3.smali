.class public final Ltc3;
.super Ldb2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic q:I

.field public final synthetic r:Lxg0;


# direct methods
.method public synthetic constructor <init>(Lxg0;Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p3, p0, Ltc3;->q:I

    .line 2
    .line 3
    iput-object p1, p0, Ltc3;->r:Lxg0;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Ldb2;-><init>(Landroid/content/Context;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final d(Landroid/util/DisplayMetrics;)F
    .locals 1

    .line 1
    iget p0, p0, Ltc3;->q:I

    .line 2
    .line 3
    const/high16 v0, 0x42c80000    # 100.0f

    .line 4
    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget p0, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 9
    .line 10
    :goto_0
    int-to-float p0, p0

    .line 11
    div-float/2addr v0, p0

    .line 12
    return v0

    .line 13
    :pswitch_0
    iget p0, p1, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 14
    .line 15
    goto :goto_0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e(I)I
    .locals 1

    .line 1
    iget v0, p0, Ltc3;->q:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Ldb2;->e(I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    const/16 v0, 0x64

    .line 12
    .line 13
    invoke-super {p0, p1}, Ldb2;->e(I)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Landroid/view/View;Lww3;)V
    .locals 7

    .line 1
    iget v0, p0, Ltc3;->q:I

    .line 2
    .line 3
    iget-object v1, p0, Ldb2;->j:Landroid/view/animation/DecelerateInterpolator;

    .line 4
    .line 5
    const-wide v2, 0x3fd57a786c22680aL    # 0.3356

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    iget-object v5, p0, Ltc3;->r:Lxg0;

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    iget-object v0, v5, Lxg0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lmw3;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v5, v0, p1}, Lxg0;->b(Lmw3;Landroid/view/View;)[I

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    aget v0, p1, v4

    .line 31
    .line 32
    aget p1, p1, v6

    .line 33
    .line 34
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    invoke-virtual {p0, v4}, Ldb2;->e(I)I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    int-to-double v4, p0

    .line 51
    div-double/2addr v4, v2

    .line 52
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 53
    .line 54
    .line 55
    move-result-wide v2

    .line 56
    double-to-int p0, v2

    .line 57
    if-lez p0, :cond_1

    .line 58
    .line 59
    iput v0, p2, Lww3;->a:I

    .line 60
    .line 61
    iput p1, p2, Lww3;->b:I

    .line 62
    .line 63
    iput p0, p2, Lww3;->c:I

    .line 64
    .line 65
    iput-object v1, p2, Lww3;->e:Landroid/view/animation/Interpolator;

    .line 66
    .line 67
    iput-boolean v6, p2, Lww3;->f:Z

    .line 68
    .line 69
    :cond_1
    :goto_0
    return-void

    .line 70
    :pswitch_0
    iget-object v0, v5, Lxg0;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 71
    .line 72
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Lmw3;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v5, v0, p1}, Lxg0;->b(Lmw3;Landroid/view/View;)[I

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    aget v0, p1, v4

    .line 81
    .line 82
    aget p1, p1, v6

    .line 83
    .line 84
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 89
    .line 90
    .line 91
    move-result v5

    .line 92
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    invoke-virtual {p0, v4}, Ltc3;->e(I)I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    int-to-double v4, p0

    .line 101
    div-double/2addr v4, v2

    .line 102
    invoke-static {v4, v5}, Ljava/lang/Math;->ceil(D)D

    .line 103
    .line 104
    .line 105
    move-result-wide v2

    .line 106
    double-to-int p0, v2

    .line 107
    if-lez p0, :cond_2

    .line 108
    .line 109
    iput v0, p2, Lww3;->a:I

    .line 110
    .line 111
    iput p1, p2, Lww3;->b:I

    .line 112
    .line 113
    iput p0, p2, Lww3;->c:I

    .line 114
    .line 115
    iput-object v1, p2, Lww3;->e:Landroid/view/animation/Interpolator;

    .line 116
    .line 117
    iput-boolean v6, p2, Lww3;->f:Z

    .line 118
    .line 119
    :cond_2
    return-void

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
