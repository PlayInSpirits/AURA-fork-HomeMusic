.class public final Lot;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lot;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lot;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    iget p2, p0, Lot;->a:I

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    const/4 p4, 0x0

    .line 5
    iget-object p0, p0, Lot;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p2, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lkv4;

    .line 11
    .line 12
    const/4 p2, 0x2

    .line 13
    new-array p2, p2, [I

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 16
    .line 17
    .line 18
    aget p2, p2, p4

    .line 19
    .line 20
    iput p2, p0, Lkv4;->V:I

    .line 21
    .line 22
    iget-object p0, p0, Lkv4;->P:Landroid/graphics/Rect;

    .line 23
    .line 24
    invoke-virtual {p1, p0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    check-cast p0, Landroidx/appcompat/widget/SearchView;

    .line 29
    .line 30
    iget-object p1, p0, Landroidx/appcompat/widget/SearchView;->C:Landroidx/appcompat/widget/SearchView$SearchAutoComplete;

    .line 31
    .line 32
    iget-object p2, p0, Landroidx/appcompat/widget/SearchView;->K:Landroid/view/View;

    .line 33
    .line 34
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    const/4 p5, 0x1

    .line 39
    if-le p3, p5, :cond_3

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object p3

    .line 45
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    iget-object p6, p0, Landroidx/appcompat/widget/SearchView;->E:Landroid/view/View;

    .line 50
    .line 51
    invoke-virtual {p6}, Landroid/view/View;->getPaddingLeft()I

    .line 52
    .line 53
    .line 54
    move-result p6

    .line 55
    new-instance p7, Landroid/graphics/Rect;

    .line 56
    .line 57
    invoke-direct {p7}, Landroid/graphics/Rect;-><init>()V

    .line 58
    .line 59
    .line 60
    sget-boolean p8, Le85;->a:Z

    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 63
    .line 64
    .line 65
    move-result p8

    .line 66
    if-ne p8, p5, :cond_0

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    move p5, p4

    .line 70
    :goto_0
    iget-boolean p0, p0, Landroidx/appcompat/widget/SearchView;->d0:Z

    .line 71
    .line 72
    if-eqz p0, :cond_1

    .line 73
    .line 74
    const p0, 0x7f0702bd

    .line 75
    .line 76
    .line 77
    invoke-virtual {p3, p0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    const p4, 0x7f0702be

    .line 82
    .line 83
    .line 84
    invoke-virtual {p3, p4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 85
    .line 86
    .line 87
    move-result p3

    .line 88
    add-int p4, p3, p0

    .line 89
    .line 90
    :cond_1
    invoke-virtual {p1}, Landroid/widget/AutoCompleteTextView;->getDropDownBackground()Landroid/graphics/drawable/Drawable;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0, p7}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 95
    .line 96
    .line 97
    iget p0, p7, Landroid/graphics/Rect;->left:I

    .line 98
    .line 99
    if-eqz p5, :cond_2

    .line 100
    .line 101
    neg-int p0, p0

    .line 102
    goto :goto_1

    .line 103
    :cond_2
    add-int/2addr p0, p4

    .line 104
    sub-int p0, p6, p0

    .line 105
    .line 106
    :goto_1
    invoke-virtual {p1, p0}, Landroid/widget/AutoCompleteTextView;->setDropDownHorizontalOffset(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    iget p2, p7, Landroid/graphics/Rect;->left:I

    .line 114
    .line 115
    add-int/2addr p0, p2

    .line 116
    iget p2, p7, Landroid/graphics/Rect;->right:I

    .line 117
    .line 118
    add-int/2addr p0, p2

    .line 119
    add-int/2addr p0, p4

    .line 120
    sub-int/2addr p0, p6

    .line 121
    invoke-virtual {p1, p0}, Landroid/widget/AutoCompleteTextView;->setDropDownWidth(I)V

    .line 122
    .line 123
    .line 124
    :cond_3
    return-void

    .line 125
    :pswitch_1
    check-cast p0, Lpt;

    .line 126
    .line 127
    iget-object p1, p0, Lk33;->A:Landroid/widget/ImageView;

    .line 128
    .line 129
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 130
    .line 131
    .line 132
    move-result p2

    .line 133
    if-nez p2, :cond_4

    .line 134
    .line 135
    iget-object p0, p0, Lk33;->S:Lyo;

    .line 136
    .line 137
    if-eqz p0, :cond_4

    .line 138
    .line 139
    new-instance p2, Landroid/graphics/Rect;

    .line 140
    .line 141
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1, p2}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, p2}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0, p1, p3}, Lyo;->i(Landroid/view/View;Landroid/widget/FrameLayout;)V

    .line 151
    .line 152
    .line 153
    :cond_4
    return-void

    .line 154
    :pswitch_2
    throw p3

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
