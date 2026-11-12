.class public final Ll4;
.super Landroid/animation/AnimatorListenerAdapter;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Ll4;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Ll4;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 3

    .line 1
    iget v0, p0, Ll4;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Ll4;->b:Ljava/lang/Object;

    .line 5
    .line 6
    sparse-switch v0, :sswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :sswitch_0
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    .line 14
    .line 15
    .line 16
    check-cast v2, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;

    .line 17
    .line 18
    iget-object p0, v2, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->n:Landroid/widget/TextView;

    .line 19
    .line 20
    const/4 p1, 0x4

    .line 21
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    iput-object v1, v2, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->r:Landroid/animation/ObjectAnimator;

    .line 25
    .line 26
    return-void

    .line 27
    :sswitch_1
    check-cast v2, Ldq;

    .line 28
    .line 29
    invoke-virtual {v2}, Ldq;->d()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :sswitch_2
    check-cast v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 34
    .line 35
    iput-object v1, v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;->J:Landroid/view/ViewPropertyAnimator;

    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    iput-boolean p0, v2, Landroidx/appcompat/widget/ActionBarOverlayLayout;->w:Z

    .line 39
    .line 40
    return-void

    .line 41
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_2
        0x6 -> :sswitch_1
        0x7 -> :sswitch_0
    .end sparse-switch
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 5

    .line 1
    iget v0, p0, Ll4;->a:I

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object v4, p0, Ll4;->b:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    :pswitch_0
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_1
    check-cast v4, Ldx4;

    .line 16
    .line 17
    invoke-virtual {v4}, Ldx4;->l()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_2
    check-cast v4, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 25
    .line 26
    invoke-virtual {v4, v1}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->x(I)V

    .line 27
    .line 28
    .line 29
    iget-object p0, v4, Lcom/google/android/material/sidesheet/SideSheetBehavior;->C:Ljava/lang/ref/WeakReference;

    .line 30
    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    iget-object p0, v4, Lcom/google/android/material/sidesheet/SideSheetBehavior;->C:Ljava/lang/ref/WeakReference;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, Landroid/view/View;

    .line 46
    .line 47
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 48
    .line 49
    .line 50
    :cond_0
    return-void

    .line 51
    :pswitch_3
    check-cast v4, Landroid/view/View;

    .line 52
    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void

    .line 59
    :pswitch_4
    check-cast v4, Ldh2;

    .line 60
    .line 61
    iget-object p0, v4, Lyg2;->b:Landroid/view/View;

    .line 62
    .line 63
    const/4 p1, 0x0

    .line 64
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4, p1}, Ldh2;->c(F)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_5
    check-cast v4, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;

    .line 72
    .line 73
    iput-object v3, v4, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->u:Landroid/view/ViewPropertyAnimator;

    .line 74
    .line 75
    return-void

    .line 76
    :pswitch_6
    check-cast v4, Lm81;

    .line 77
    .line 78
    iput v2, v4, Lm81;->q:I

    .line 79
    .line 80
    iput-object v3, v4, Lm81;->l:Landroid/animation/Animator;

    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_7
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 84
    .line 85
    .line 86
    check-cast v4, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;

    .line 87
    .line 88
    iget-object p0, v4, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->n:Landroid/widget/TextView;

    .line 89
    .line 90
    const/4 p1, 0x4

    .line 91
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 92
    .line 93
    .line 94
    iput-object v3, v4, Lcom/eddyizm/tempus/helper/recyclerview/FastScrollbar;->r:Landroid/animation/ObjectAnimator;

    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_8
    check-cast v4, Ldq;

    .line 98
    .line 99
    invoke-virtual {v4}, Ldq;->e()V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :pswitch_9
    check-cast v4, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;

    .line 104
    .line 105
    iput-object v3, v4, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;->o:Landroid/animation/AnimatorSet;

    .line 106
    .line 107
    return-void

    .line 108
    :pswitch_a
    check-cast v4, Lix0;

    .line 109
    .line 110
    invoke-virtual {v4}, Lh11;->p()V

    .line 111
    .line 112
    .line 113
    iget-object p0, v4, Lix0;->r:Landroid/animation/ValueAnimator;

    .line 114
    .line 115
    invoke-virtual {p0}, Landroid/animation/ValueAnimator;->start()V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :pswitch_b
    check-cast v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 120
    .line 121
    invoke-virtual {v4, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K(I)V

    .line 122
    .line 123
    .line 124
    iget-object p0, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->h0:Ljava/lang/ref/WeakReference;

    .line 125
    .line 126
    if-eqz p0, :cond_2

    .line 127
    .line 128
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    if-eqz p0, :cond_2

    .line 133
    .line 134
    iget-object p0, v4, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->h0:Ljava/lang/ref/WeakReference;

    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    check-cast p0, Landroid/view/View;

    .line 141
    .line 142
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 143
    .line 144
    .line 145
    :cond_2
    return-void

    .line 146
    :pswitch_c
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 147
    .line 148
    .line 149
    check-cast v4, Luq;

    .line 150
    .line 151
    invoke-static {v4}, Lvr1;->s(Landroid/view/View;)Landroid/view/ViewGroup;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    if-nez p0, :cond_3

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_3
    new-instance v3, Lc05;

    .line 159
    .line 160
    invoke-direct {v3, p0}, Lc05;-><init>(Landroid/view/ViewGroup;)V

    .line 161
    .line 162
    .line 163
    :goto_0
    iget-object p0, v4, Luq;->x:Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    :goto_1
    if-ge v2, p1, :cond_4

    .line 170
    .line 171
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    add-int/lit8 v2, v2, 0x1

    .line 176
    .line 177
    check-cast v0, Lkv4;

    .line 178
    .line 179
    iget-object v1, v3, Lc05;->n:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast v1, Landroid/view/ViewOverlay;

    .line 182
    .line 183
    invoke-virtual {v1, v0}, Landroid/view/ViewOverlay;->remove(Landroid/graphics/drawable/Drawable;)V

    .line 184
    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_4
    return-void

    .line 188
    :pswitch_d
    new-instance p0, Ljava/util/ArrayList;

    .line 189
    .line 190
    check-cast v4, Lqd;

    .line 191
    .line 192
    iget-object p1, v4, Lqd;->r:Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 198
    .line 199
    .line 200
    move-result p1

    .line 201
    :goto_2
    if-ge v2, p1, :cond_5

    .line 202
    .line 203
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    check-cast v0, Lhq;

    .line 208
    .line 209
    invoke-virtual {v0, v4}, Lhq;->a(Landroid/graphics/drawable/Drawable;)V

    .line 210
    .line 211
    .line 212
    add-int/lit8 v2, v2, 0x1

    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_5
    return-void

    .line 216
    :pswitch_e
    check-cast v4, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 217
    .line 218
    iput-object v3, v4, Landroidx/appcompat/widget/ActionBarOverlayLayout;->J:Landroid/view/ViewPropertyAnimator;

    .line 219
    .line 220
    iput-boolean v2, v4, Landroidx/appcompat/widget/ActionBarOverlayLayout;->w:Z

    .line 221
    .line 222
    return-void

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 2

    .line 1
    iget v0, p0, Ll4;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationRepeat(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationRepeat(Landroid/animation/Animator;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Ll4;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lva2;

    .line 16
    .line 17
    iget p1, p0, Lva2;->g:I

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    add-int/2addr p1, v0

    .line 21
    iget-object v1, p0, Lva2;->f:Lcb2;

    .line 22
    .line 23
    iget-object v1, v1, Ljq;->c:[I

    .line 24
    .line 25
    array-length v1, v1

    .line 26
    rem-int/2addr p1, v1

    .line 27
    iput p1, p0, Lva2;->g:I

    .line 28
    .line 29
    iput-boolean v0, p0, Lva2;->h:Z

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
    .end packed-switch
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 3

    .line 1
    iget v0, p0, Ll4;->a:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Ll4;->b:Ljava/lang/Object;

    .line 5
    .line 6
    sparse-switch v0, :sswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :sswitch_0
    check-cast v2, Lm81;

    .line 14
    .line 15
    iget-object p0, v2, Lm81;->r:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 16
    .line 17
    invoke-virtual {p0, v1, v1}, Lm85;->a(IZ)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x2

    .line 21
    iput p0, v2, Lm81;->q:I

    .line 22
    .line 23
    iput-object p1, v2, Lm81;->l:Landroid/animation/Animator;

    .line 24
    .line 25
    return-void

    .line 26
    :sswitch_1
    check-cast v2, Ldq;

    .line 27
    .line 28
    invoke-virtual {v2, p1}, Ldq;->f(Landroid/animation/Animator;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :sswitch_2
    new-instance p0, Ljava/util/ArrayList;

    .line 33
    .line 34
    check-cast v2, Lqd;

    .line 35
    .line 36
    iget-object p1, v2, Lqd;->r:Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    :goto_0
    if-ge v1, p1, :cond_0

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Lhq;

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Lhq;->b(Landroid/graphics/drawable/Drawable;)V

    .line 54
    .line 55
    .line 56
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    return-void

    .line 60
    nop

    .line 61
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_2
        0x6 -> :sswitch_1
        0x8 -> :sswitch_0
    .end sparse-switch
.end method
