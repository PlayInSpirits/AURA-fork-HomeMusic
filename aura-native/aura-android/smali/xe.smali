.class public final synthetic Lxe;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lxe;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lxe;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lxe;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 4

    .line 1
    iget v0, p0, Lxe;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lxe;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lxe;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Loz4;

    .line 11
    .line 12
    iget-object p0, p0, Loz4;->n:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lia5;

    .line 15
    .line 16
    iget-object p0, p0, Lia5;->g:Landroidx/appcompat/widget/ActionBarContainer;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    check-cast p0, Lcom/google/android/material/appbar/AppBarLayout;

    .line 29
    .line 30
    check-cast v1, Lfi2;

    .line 31
    .line 32
    sget v0, Lcom/google/android/material/appbar/AppBarLayout;->L:I

    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    check-cast p1, Ljava/lang/Float;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    float-to-int p1, p1

    .line 45
    invoke-virtual {v1, p1}, Lfi2;->setAlpha(I)V

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Lcom/google/android/material/appbar/AppBarLayout;->E:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v2, 0x0

    .line 55
    :goto_0
    if-ge v2, v0, :cond_2

    .line 56
    .line 57
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    if-nez v3, :cond_1

    .line 64
    .line 65
    iget-object v3, v1, Lfi2;->n:Lei2;

    .line 66
    .line 67
    iget-object v3, v3, Lei2;->c:Landroid/content/res/ColorStateList;

    .line 68
    .line 69
    if-nez v3, :cond_0

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    invoke-virtual {v3, p1}, Landroid/content/res/ColorStateList;->withAlpha(I)Landroid/content/res/ColorStateList;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 77
    .line 78
    .line 79
    const/4 p0, 0x0

    .line 80
    throw p0

    .line 81
    :cond_1
    invoke-static {}, Lkf2;->k()V

    .line 82
    .line 83
    .line 84
    :cond_2
    return-void

    .line 85
    :pswitch_1
    check-cast p0, Lcom/google/android/material/appbar/AppBarLayout;

    .line 86
    .line 87
    check-cast v1, Lfi2;

    .line 88
    .line 89
    sget v0, Lcom/google/android/material/appbar/AppBarLayout;->L:I

    .line 90
    .line 91
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    check-cast p1, Ljava/lang/Float;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    invoke-virtual {v1, p1}, Lfi2;->l(F)V

    .line 102
    .line 103
    .line 104
    iget-object v0, p0, Lcom/google/android/material/appbar/AppBarLayout;->I:Landroid/graphics/drawable/Drawable;

    .line 105
    .line 106
    instance-of v1, v0, Lfi2;

    .line 107
    .line 108
    if-eqz v1, :cond_3

    .line 109
    .line 110
    check-cast v0, Lfi2;

    .line 111
    .line 112
    invoke-virtual {v0, p1}, Lfi2;->l(F)V

    .line 113
    .line 114
    .line 115
    :cond_3
    iget-object p0, p0, Lcom/google/android/material/appbar/AppBarLayout;->E:Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-nez p1, :cond_4

    .line 126
    .line 127
    return-void

    .line 128
    :cond_4
    invoke-static {p0}, Lxa3;->d(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    throw p0

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
