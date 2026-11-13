.class public final Ldefpackage/d43;
.super Ldefpackage/dw3;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final q:Ljava/util/ArrayList;

.field public r:Ldefpackage/tu2;

.field public s:Z

.field public final synthetic t:Ldefpackage/l43;


# direct methods
.method public constructor <init>(Ldefpackage/l43;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/d43;->t:Ldefpackage/l43;

    .line 2
    .line 3
    invoke-direct {p0}, Ldefpackage/dw3;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ldefpackage/d43;->q:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {p0}, Ldefpackage/d43;->p()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/d43;->q:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final b(I)J
    .locals 0

    .line 1
    int-to-long p0, p1

    .line 2
    return-wide p0
.end method

.method public final c(I)I
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/d43;->q:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldefpackage/f43;

    .line 8
    .line 9
    instance-of p1, p0, Ldefpackage/g43;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x2

    .line 14
    return p0

    .line 15
    :cond_0
    instance-of p1, p0, Ldefpackage/e43;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    const/4 p0, 0x3

    .line 20
    return p0

    .line 21
    :cond_1
    instance-of p1, p0, Ldefpackage/h43;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    if-eqz p1, :cond_3

    .line 25
    .line 26
    check-cast p0, Ldefpackage/h43;

    .line 27
    .line 28
    iget-object p0, p0, Ldefpackage/h43;->a:Ldefpackage/tu2;

    .line 29
    .line 30
    invoke-virtual {p0}, Ldefpackage/tu2;->hasSubMenu()Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_2

    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :cond_2
    return v0

    .line 39
    :cond_3
    const-string p0, "Unknown item type."

    .line 40
    .line 41
    invoke-static {p0}, Ldefpackage/tb4;->e(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return v0
.end method

.method public final g(Ldefpackage/cx3;I)V
    .locals 6

    .line 1
    check-cast p1, Ldefpackage/k43;

    .line 2
    .line 3
    iget-object p1, p1, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {p0, p2}, Ldefpackage/d43;->c(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Ldefpackage/d43;->q:Ljava/util/ArrayList;

    .line 10
    .line 11
    iget-object v2, p0, Ldefpackage/d43;->t:Ldefpackage/l43;

    .line 12
    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    if-eq v0, v3, :cond_1

    .line 17
    .line 18
    const/4 p0, 0x2

    .line 19
    if-eq v0, p0, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Ldefpackage/g43;

    .line 27
    .line 28
    iget p2, v2, Ldefpackage/l43;->F:I

    .line 29
    .line 30
    iget v0, p0, Ldefpackage/g43;->a:I

    .line 31
    .line 32
    iget v1, v2, Ldefpackage/l43;->G:I

    .line 33
    .line 34
    iget p0, p0, Ldefpackage/g43;->b:I

    .line 35
    .line 36
    invoke-virtual {p1, p2, v0, v1, p0}, Landroid/view/View;->setPadding(IIII)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    check-cast p1, Landroid/widget/TextView;

    .line 41
    .line 42
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, Ldefpackage/h43;

    .line 47
    .line 48
    iget-object v0, v0, Ldefpackage/h43;->a:Ldefpackage/tu2;

    .line 49
    .line 50
    iget-object v0, v0, Ldefpackage/tu2;->e:Ljava/lang/CharSequence;

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    .line 55
    iget v0, v2, Ldefpackage/l43;->t:I

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 58
    .line 59
    .line 60
    iget v0, v2, Ldefpackage/l43;->H:I

    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    iget v4, v2, Ldefpackage/l43;->I:I

    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    invoke-virtual {p1, v0, v1, v4, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 73
    .line 74
    .line 75
    iget-object v0, v2, Ldefpackage/l43;->u:Landroid/content/res/ColorStateList;

    .line 76
    .line 77
    if-eqz v0, :cond_2

    .line 78
    .line 79
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 80
    .line 81
    .line 82
    :cond_2
    new-instance v0, Ldefpackage/c43;

    .line 83
    .line 84
    invoke-direct {v0, p0, p2, v3}, Ldefpackage/c43;-><init>(Ldefpackage/d43;IZ)V

    .line 85
    .line 86
    .line 87
    invoke-static {p1, v0}, Ldefpackage/j65;->o(Landroid/view/View;Ldefpackage/z2;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_3
    check-cast p1, Lcom/google/android/material/internal/NavigationMenuItemView;

    .line 92
    .line 93
    iget-object v0, v2, Ldefpackage/l43;->y:Landroid/content/res/ColorStateList;

    .line 94
    .line 95
    invoke-virtual {p1, v0}, Lcom/google/android/material/internal/NavigationMenuItemView;->setIconTintList(Landroid/content/res/ColorStateList;)V

    .line 96
    .line 97
    .line 98
    iget v0, v2, Ldefpackage/l43;->v:I

    .line 99
    .line 100
    invoke-virtual {p1, v0}, Lcom/google/android/material/internal/NavigationMenuItemView;->setTextAppearance(I)V

    .line 101
    .line 102
    .line 103
    iget-object v0, v2, Ldefpackage/l43;->x:Landroid/content/res/ColorStateList;

    .line 104
    .line 105
    if-eqz v0, :cond_4

    .line 106
    .line 107
    invoke-virtual {p1, v0}, Lcom/google/android/material/internal/NavigationMenuItemView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 108
    .line 109
    .line 110
    :cond_4
    iget-object v0, v2, Ldefpackage/l43;->z:Landroid/graphics/drawable/Drawable;

    .line 111
    .line 112
    if-eqz v0, :cond_5

    .line 113
    .line 114
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    goto :goto_0

    .line 123
    :cond_5
    const/4 v0, 0x0

    .line 124
    :goto_0
    sget-object v3, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 125
    .line 126
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 127
    .line 128
    .line 129
    iget-object v0, v2, Ldefpackage/l43;->A:Landroid/graphics/drawable/RippleDrawable;

    .line 130
    .line 131
    if-eqz v0, :cond_6

    .line 132
    .line 133
    invoke-virtual {v0}, Landroid/graphics/drawable/RippleDrawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-virtual {p1, v0}, Ldefpackage/nb1;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 142
    .line 143
    .line 144
    :cond_6
    invoke-virtual {v1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, Ldefpackage/h43;

    .line 149
    .line 150
    iget-boolean v1, v0, Ldefpackage/h43;->b:Z

    .line 151
    .line 152
    invoke-virtual {p1, v1}, Lcom/google/android/material/internal/NavigationMenuItemView;->setNeedsEmptyIcon(Z)V

    .line 153
    .line 154
    .line 155
    iget v1, v2, Ldefpackage/l43;->B:I

    .line 156
    .line 157
    iget v3, v2, Ldefpackage/l43;->C:I

    .line 158
    .line 159
    invoke-virtual {p1, v1, v3, v1, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 160
    .line 161
    .line 162
    iget v1, v2, Ldefpackage/l43;->D:I

    .line 163
    .line 164
    invoke-virtual {p1, v1}, Lcom/google/android/material/internal/NavigationMenuItemView;->setIconPadding(I)V

    .line 165
    .line 166
    .line 167
    iget-boolean v1, v2, Ldefpackage/l43;->J:Z

    .line 168
    .line 169
    if-eqz v1, :cond_7

    .line 170
    .line 171
    iget v1, v2, Ldefpackage/l43;->E:I

    .line 172
    .line 173
    invoke-virtual {p1, v1}, Lcom/google/android/material/internal/NavigationMenuItemView;->setIconSize(I)V

    .line 174
    .line 175
    .line 176
    :cond_7
    iget v1, v2, Ldefpackage/l43;->L:I

    .line 177
    .line 178
    invoke-virtual {p1, v1}, Lcom/google/android/material/internal/NavigationMenuItemView;->setMaxLines(I)V

    .line 179
    .line 180
    .line 181
    iget-object v0, v0, Ldefpackage/h43;->a:Ldefpackage/tu2;

    .line 182
    .line 183
    iget-boolean v1, v2, Ldefpackage/l43;->w:Z

    .line 184
    .line 185
    iput-boolean v1, p1, Lcom/google/android/material/internal/NavigationMenuItemView;->L:Z

    .line 186
    .line 187
    invoke-virtual {p1, v0}, Lcom/google/android/material/internal/NavigationMenuItemView;->c(Ldefpackage/tu2;)V

    .line 188
    .line 189
    .line 190
    new-instance v0, Ldefpackage/c43;

    .line 191
    .line 192
    const/4 v1, 0x0

    .line 193
    invoke-direct {v0, p0, p2, v1}, Ldefpackage/c43;-><init>(Ldefpackage/d43;IZ)V

    .line 194
    .line 195
    .line 196
    invoke-static {p1, v0}, Ldefpackage/j65;->o(Landroid/view/View;Ldefpackage/z2;)V

    .line 197
    .line 198
    .line 199
    return-void
.end method

.method public final i(Landroid/view/ViewGroup;I)Ldefpackage/cx3;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object p0, p0, Ldefpackage/d43;->t:Ldefpackage/l43;

    .line 3
    .line 4
    if-eqz p2, :cond_3

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-eq p2, v1, :cond_2

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    if-eq p2, v1, :cond_1

    .line 11
    .line 12
    const/4 p1, 0x3

    .line 13
    if-eq p2, p1, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    :cond_0
    new-instance p1, Ldefpackage/b43;

    .line 18
    .line 19
    iget-object p0, p0, Ldefpackage/l43;->o:Landroid/widget/LinearLayout;

    .line 20
    .line 21
    invoke-direct {p1, p0}, Ldefpackage/cx3;-><init>(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_1
    new-instance p2, Ldefpackage/b43;

    .line 26
    .line 27
    iget-object p0, p0, Ldefpackage/l43;->s:Landroid/view/LayoutInflater;

    .line 28
    .line 29
    const v1, 0x7f0d0037

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-direct {p2, p0}, Ldefpackage/cx3;-><init>(Landroid/view/View;)V

    .line 37
    .line 38
    .line 39
    return-object p2

    .line 40
    :cond_2
    new-instance p2, Ldefpackage/b43;

    .line 41
    .line 42
    iget-object p0, p0, Ldefpackage/l43;->s:Landroid/view/LayoutInflater;

    .line 43
    .line 44
    const v1, 0x7f0d0038

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-direct {p2, p0}, Ldefpackage/cx3;-><init>(Landroid/view/View;)V

    .line 52
    .line 53
    .line 54
    return-object p2

    .line 55
    :cond_3
    new-instance p2, Ldefpackage/j43;

    .line 56
    .line 57
    iget-object v1, p0, Ldefpackage/l43;->s:Landroid/view/LayoutInflater;

    .line 58
    .line 59
    iget-object p0, p0, Ldefpackage/l43;->P:Ldefpackage/i4;

    .line 60
    .line 61
    const v2, 0x7f0d0035

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-direct {p2, p1}, Ldefpackage/cx3;-><init>(Landroid/view/View;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 72
    .line 73
    .line 74
    return-object p2
.end method

.method public final n(Ldefpackage/cx3;)V
    .locals 0

    .line 1
    check-cast p1, Ldefpackage/k43;

    .line 2
    .line 3
    instance-of p0, p1, Ldefpackage/j43;

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    iget-object p0, p1, Ldefpackage/cx3;->a:Landroid/view/View;

    .line 8
    .line 9
    check-cast p0, Lcom/google/android/material/internal/NavigationMenuItemView;

    .line 10
    .line 11
    iget-object p1, p0, Lcom/google/android/material/internal/NavigationMenuItemView;->N:Landroid/widget/FrameLayout;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object p0, p0, Lcom/google/android/material/internal/NavigationMenuItemView;->M:Landroid/widget/CheckedTextView;

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    invoke-virtual {p0, p1, p1, p1, p1}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public final p()V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Ldefpackage/d43;->s:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, v0, Ldefpackage/d43;->s:Z

    .line 10
    .line 11
    iget-object v2, v0, Ldefpackage/d43;->q:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 14
    .line 15
    .line 16
    new-instance v3, Ldefpackage/e43;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    iget-object v3, v0, Ldefpackage/d43;->t:Ldefpackage/l43;

    .line 25
    .line 26
    iget-object v4, v3, Ldefpackage/l43;->p:Ldefpackage/qu2;

    .line 27
    .line 28
    invoke-virtual {v4}, Ldefpackage/qu2;->l()Ljava/util/ArrayList;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v6, -0x1

    .line 38
    move v7, v5

    .line 39
    move v8, v7

    .line 40
    move v9, v8

    .line 41
    :goto_0
    if-ge v7, v4, :cond_f

    .line 42
    .line 43
    iget-object v10, v3, Ldefpackage/l43;->p:Ldefpackage/qu2;

    .line 44
    .line 45
    invoke-virtual {v10}, Ldefpackage/qu2;->l()Ljava/util/ArrayList;

    .line 46
    .line 47
    .line 48
    move-result-object v10

    .line 49
    invoke-virtual {v10, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v10

    .line 53
    check-cast v10, Ldefpackage/tu2;

    .line 54
    .line 55
    invoke-virtual {v10}, Ldefpackage/tu2;->isChecked()Z

    .line 56
    .line 57
    .line 58
    move-result v11

    .line 59
    if-eqz v11, :cond_1

    .line 60
    .line 61
    invoke-virtual {v0, v10}, Ldefpackage/d43;->q(Ldefpackage/tu2;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    invoke-virtual {v10}, Ldefpackage/tu2;->isCheckable()Z

    .line 65
    .line 66
    .line 67
    move-result v11

    .line 68
    if-eqz v11, :cond_2

    .line 69
    .line 70
    invoke-virtual {v10, v5}, Ldefpackage/tu2;->f(Z)V

    .line 71
    .line 72
    .line 73
    :cond_2
    invoke-virtual {v10}, Ldefpackage/tu2;->hasSubMenu()Z

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    if-eqz v11, :cond_a

    .line 78
    .line 79
    iget-object v11, v10, Ldefpackage/tu2;->o:Ldefpackage/en4;

    .line 80
    .line 81
    invoke-virtual {v11}, Ldefpackage/qu2;->hasVisibleItems()Z

    .line 82
    .line 83
    .line 84
    move-result v12

    .line 85
    if-eqz v12, :cond_9

    .line 86
    .line 87
    if-eqz v7, :cond_3

    .line 88
    .line 89
    new-instance v12, Ldefpackage/g43;

    .line 90
    .line 91
    iget v13, v3, Ldefpackage/l43;->N:I

    .line 92
    .line 93
    invoke-direct {v12, v13, v5}, Ldefpackage/g43;-><init>(II)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    :cond_3
    new-instance v12, Ldefpackage/h43;

    .line 100
    .line 101
    invoke-direct {v12, v10}, Ldefpackage/h43;-><init>(Ldefpackage/tu2;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 108
    .line 109
    .line 110
    move-result v12

    .line 111
    iget-object v13, v11, Ldefpackage/qu2;->f:Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 114
    .line 115
    .line 116
    move-result v13

    .line 117
    move v14, v5

    .line 118
    move v15, v14

    .line 119
    :goto_1
    if-ge v14, v13, :cond_8

    .line 120
    .line 121
    invoke-virtual {v11, v14}, Ldefpackage/qu2;->getItem(I)Landroid/view/MenuItem;

    .line 122
    .line 123
    .line 124
    move-result-object v16

    .line 125
    move-object/from16 v1, v16

    .line 126
    .line 127
    check-cast v1, Ldefpackage/tu2;

    .line 128
    .line 129
    invoke-virtual {v1}, Ldefpackage/tu2;->isVisible()Z

    .line 130
    .line 131
    .line 132
    move-result v16

    .line 133
    if-eqz v16, :cond_7

    .line 134
    .line 135
    if-nez v15, :cond_4

    .line 136
    .line 137
    invoke-virtual {v1}, Ldefpackage/tu2;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 138
    .line 139
    .line 140
    move-result-object v16

    .line 141
    if-eqz v16, :cond_4

    .line 142
    .line 143
    const/4 v15, 0x1

    .line 144
    :cond_4
    invoke-virtual {v1}, Ldefpackage/tu2;->isCheckable()Z

    .line 145
    .line 146
    .line 147
    move-result v16

    .line 148
    if-eqz v16, :cond_5

    .line 149
    .line 150
    invoke-virtual {v1, v5}, Ldefpackage/tu2;->f(Z)V

    .line 151
    .line 152
    .line 153
    :cond_5
    invoke-virtual {v10}, Ldefpackage/tu2;->isChecked()Z

    .line 154
    .line 155
    .line 156
    move-result v16

    .line 157
    if-eqz v16, :cond_6

    .line 158
    .line 159
    invoke-virtual {v0, v10}, Ldefpackage/d43;->q(Ldefpackage/tu2;)V

    .line 160
    .line 161
    .line 162
    :cond_6
    new-instance v5, Ldefpackage/h43;

    .line 163
    .line 164
    invoke-direct {v5, v1}, Ldefpackage/h43;-><init>(Ldefpackage/tu2;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    :cond_7
    add-int/lit8 v14, v14, 0x1

    .line 171
    .line 172
    const/4 v1, 0x1

    .line 173
    const/4 v5, 0x0

    .line 174
    goto :goto_1

    .line 175
    :cond_8
    if-eqz v15, :cond_9

    .line 176
    .line 177
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    :goto_2
    if-ge v12, v1, :cond_9

    .line 182
    .line 183
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    check-cast v5, Ldefpackage/h43;

    .line 188
    .line 189
    const/4 v10, 0x1

    .line 190
    iput-boolean v10, v5, Ldefpackage/h43;->b:Z

    .line 191
    .line 192
    add-int/lit8 v12, v12, 0x1

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_9
    const/4 v11, 0x1

    .line 196
    goto :goto_6

    .line 197
    :cond_a
    iget v1, v10, Ldefpackage/tu2;->b:I

    .line 198
    .line 199
    if-eq v1, v6, :cond_d

    .line 200
    .line 201
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 202
    .line 203
    .line 204
    move-result v9

    .line 205
    invoke-virtual {v10}, Ldefpackage/tu2;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    if-eqz v5, :cond_b

    .line 210
    .line 211
    const/4 v8, 0x1

    .line 212
    goto :goto_3

    .line 213
    :cond_b
    const/4 v8, 0x0

    .line 214
    :goto_3
    if-eqz v7, :cond_c

    .line 215
    .line 216
    add-int/lit8 v9, v9, 0x1

    .line 217
    .line 218
    new-instance v5, Ldefpackage/g43;

    .line 219
    .line 220
    iget v6, v3, Ldefpackage/l43;->N:I

    .line 221
    .line 222
    invoke-direct {v5, v6, v6}, Ldefpackage/g43;-><init>(II)V

    .line 223
    .line 224
    .line 225
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    :cond_c
    const/4 v11, 0x1

    .line 229
    goto :goto_5

    .line 230
    :cond_d
    if-nez v8, :cond_c

    .line 231
    .line 232
    invoke-virtual {v10}, Ldefpackage/tu2;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 233
    .line 234
    .line 235
    move-result-object v5

    .line 236
    if-eqz v5, :cond_c

    .line 237
    .line 238
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 239
    .line 240
    .line 241
    move-result v5

    .line 242
    move v6, v9

    .line 243
    :goto_4
    if-ge v6, v5, :cond_e

    .line 244
    .line 245
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v8

    .line 249
    check-cast v8, Ldefpackage/h43;

    .line 250
    .line 251
    const/4 v11, 0x1

    .line 252
    iput-boolean v11, v8, Ldefpackage/h43;->b:Z

    .line 253
    .line 254
    add-int/lit8 v6, v6, 0x1

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_e
    const/4 v11, 0x1

    .line 258
    move v8, v11

    .line 259
    :goto_5
    new-instance v5, Ldefpackage/h43;

    .line 260
    .line 261
    invoke-direct {v5, v10}, Ldefpackage/h43;-><init>(Ldefpackage/tu2;)V

    .line 262
    .line 263
    .line 264
    iput-boolean v8, v5, Ldefpackage/h43;->b:Z

    .line 265
    .line 266
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move v6, v1

    .line 270
    :goto_6
    add-int/lit8 v7, v7, 0x1

    .line 271
    .line 272
    move v1, v11

    .line 273
    const/4 v5, 0x0

    .line 274
    goto/16 :goto_0

    .line 275
    .line 276
    :cond_f
    move v1, v5

    .line 277
    iput-boolean v1, v0, Ldefpackage/d43;->s:Z

    .line 278
    .line 279
    return-void
.end method

.method public final q(Ldefpackage/tu2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/d43;->r:Ldefpackage/tu2;

    .line 2
    .line 3
    if-eq v0, p1, :cond_2

    .line 4
    .line 5
    invoke-virtual {p1}, Ldefpackage/tu2;->isCheckable()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Ldefpackage/d43;->r:Ldefpackage/tu2;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, v1}, Ldefpackage/tu2;->setChecked(Z)Landroid/view/MenuItem;

    .line 18
    .line 19
    .line 20
    :cond_1
    iput-object p1, p0, Ldefpackage/d43;->r:Ldefpackage/tu2;

    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    invoke-virtual {p1, p0}, Ldefpackage/tu2;->setChecked(Z)Landroid/view/MenuItem;

    .line 24
    .line 25
    .line 26
    :cond_2
    :goto_0
    return-void
.end method
