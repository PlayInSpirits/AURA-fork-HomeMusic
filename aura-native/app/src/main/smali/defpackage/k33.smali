.class public abstract Ldefpackage/k33;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/hv2;


# static fields
.field public static final T:[I

.field public static final U:Ldefpackage/tv1;

.field public static final V:Ldefpackage/j33;


# instance fields
.field public final A:Landroid/widget/ImageView;

.field public final B:Landroid/view/ViewGroup;

.field public final C:Landroid/widget/TextView;

.field public final D:Landroid/widget/TextView;

.field public E:I

.field public F:I

.field public G:Ldefpackage/tu2;

.field public H:Landroid/content/res/ColorStateList;

.field public I:Landroid/graphics/drawable/Drawable;

.field public J:Landroid/graphics/drawable/Drawable;

.field public K:Landroid/animation/ValueAnimator;

.field public L:Ldefpackage/tv1;

.field public M:F

.field public N:Z

.field public O:I

.field public P:I

.field public Q:Z

.field public R:I

.field public S:Ldefpackage/yo;

.field public n:Z

.field public o:Landroid/content/res/ColorStateList;

.field public p:Landroid/graphics/drawable/Drawable;

.field public q:I

.field public r:I

.field public s:I

.field public t:F

.field public u:F

.field public v:F

.field public w:I

.field public x:Z

.field public final y:Landroid/widget/FrameLayout;

.field public final z:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const v0, 0x10100a0

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Ldefpackage/k33;->T:[I

    .line 9
    .line 10
    new-instance v0, Ldefpackage/tv1;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    sput-object v0, Ldefpackage/k33;->U:Ldefpackage/tv1;

    .line 16
    .line 17
    new-instance v0, Ldefpackage/j33;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    sput-object v0, Ldefpackage/k33;->V:Ldefpackage/j33;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Ldefpackage/k33;->n:Z

    .line 6
    .line 7
    const/4 v1, -0x1

    .line 8
    iput v1, p0, Ldefpackage/k33;->E:I

    .line 9
    .line 10
    iput v0, p0, Ldefpackage/k33;->F:I

    .line 11
    .line 12
    sget-object v1, Ldefpackage/k33;->U:Ldefpackage/tv1;

    .line 13
    .line 14
    iput-object v1, p0, Ldefpackage/k33;->L:Ldefpackage/tv1;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    iput v1, p0, Ldefpackage/k33;->M:F

    .line 18
    .line 19
    iput-boolean v0, p0, Ldefpackage/k33;->N:Z

    .line 20
    .line 21
    iput v0, p0, Ldefpackage/k33;->O:I

    .line 22
    .line 23
    iput v0, p0, Ldefpackage/k33;->P:I

    .line 24
    .line 25
    iput-boolean v0, p0, Ldefpackage/k33;->Q:Z

    .line 26
    .line 27
    iput v0, p0, Ldefpackage/k33;->R:I

    .line 28
    .line 29
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0}, Ldefpackage/k33;->getItemLayoutResId()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-virtual {p1, v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    const p1, 0x7f0a0412

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Landroid/widget/FrameLayout;

    .line 49
    .line 50
    iput-object p1, p0, Ldefpackage/k33;->y:Landroid/widget/FrameLayout;

    .line 51
    .line 52
    const p1, 0x7f0a0411

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Ldefpackage/k33;->z:Landroid/view/View;

    .line 60
    .line 61
    const p1, 0x7f0a0413

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, Landroid/widget/ImageView;

    .line 69
    .line 70
    iput-object p1, p0, Ldefpackage/k33;->A:Landroid/widget/ImageView;

    .line 71
    .line 72
    const v0, 0x7f0a0414

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Landroid/view/ViewGroup;

    .line 80
    .line 81
    iput-object v0, p0, Ldefpackage/k33;->B:Landroid/view/ViewGroup;

    .line 82
    .line 83
    const v2, 0x7f0a0416

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Landroid/widget/TextView;

    .line 91
    .line 92
    iput-object v2, p0, Ldefpackage/k33;->C:Landroid/widget/TextView;

    .line 93
    .line 94
    const v3, 0x7f0a0415

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    check-cast v3, Landroid/widget/TextView;

    .line 102
    .line 103
    iput-object v3, p0, Ldefpackage/k33;->D:Landroid/widget/TextView;

    .line 104
    .line 105
    invoke-virtual {p0}, Ldefpackage/k33;->getItemBackgroundResId()I

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    invoke-virtual {p0, v4}, Landroid/view/View;->setBackgroundResource(I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-virtual {p0}, Ldefpackage/k33;->getItemDefaultMarginResId()I

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    iput v4, p0, Ldefpackage/k33;->q:I

    .line 125
    .line 126
    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    iput v0, p0, Ldefpackage/k33;->r:I

    .line 131
    .line 132
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    const v4, 0x7f07047e

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    iput v0, p0, Ldefpackage/k33;->s:I

    .line 144
    .line 145
    sget-object v0, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 146
    .line 147
    const/4 v0, 0x2

    .line 148
    invoke-virtual {v2, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v3, v0}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0, v1}, Landroid/view/View;->setFocusable(Z)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Landroid/widget/TextView;->getTextSize()F

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    invoke-virtual {v3}, Landroid/widget/TextView;->getTextSize()F

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    invoke-virtual {p0, v0, v2}, Ldefpackage/k33;->a(FF)V

    .line 166
    .line 167
    .line 168
    if-eqz p1, :cond_0

    .line 169
    .line 170
    new-instance v0, Ldefpackage/ot;

    .line 171
    .line 172
    check-cast p0, Ldefpackage/pt;

    .line 173
    .line 174
    invoke-direct {v0, v1, p0}, Ldefpackage/ot;-><init>(ILjava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 178
    .line 179
    .line 180
    :cond_0
    return-void
.end method

.method public static f(Landroid/widget/TextView;I)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextAppearance(I)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v2, Ldefpackage/ht3;->V:[I

    .line 13
    .line 14
    invoke-virtual {v0, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance v2, Landroid/util/TypedValue;

    .line 19
    .line 20
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 28
    .line 29
    .line 30
    if-nez v3, :cond_1

    .line 31
    .line 32
    :goto_0
    move p1, v1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-virtual {v2}, Landroid/util/TypedValue;->getComplexUnit()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iget v2, v2, Landroid/util/TypedValue;->data:I

    .line 39
    .line 40
    const/4 v3, 0x2

    .line 41
    if-ne p1, v3, :cond_2

    .line 42
    .line 43
    invoke-static {v2}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 56
    .line 57
    mul-float/2addr p1, v0

    .line 58
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-static {v2, p1}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    :goto_1
    if-eqz p1, :cond_3

    .line 76
    .line 77
    int-to-float p1, p1

    .line 78
    invoke-virtual {p0, v1, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 79
    .line 80
    .line 81
    :cond_3
    return-void
.end method

.method public static g(Landroid/view/View;FFI)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/View;->setScaleX(F)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p2}, Landroid/view/View;->setScaleY(F)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p3}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private getIconOrContainer()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/k33;->y:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object p0, p0, Ldefpackage/k33;->A:Landroid/widget/ImageView;

    .line 7
    .line 8
    return-object p0
.end method

.method private getItemVisiblePosition()I
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/view/ViewGroup;

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    const/4 v1, 0x0

    .line 12
    move v2, v1

    .line 13
    :goto_0
    if-ge v1, p0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    instance-of v4, v3, Ldefpackage/k33;

    .line 20
    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return v2
.end method

.method private getSuggestedIconHeight()I
    .locals 1

    .line 1
    invoke-direct {p0}, Ldefpackage/k33;->getIconOrContainer()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 10
    .line 11
    iget v0, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 12
    .line 13
    invoke-direct {p0}, Ldefpackage/k33;->getIconOrContainer()Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    add-int/2addr p0, v0

    .line 22
    return p0
.end method

.method private getSuggestedIconWidth()I
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/k33;->S:Ldefpackage/yo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getMinimumWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object v1, p0, Ldefpackage/k33;->S:Ldefpackage/yo;

    .line 12
    .line 13
    iget-object v1, v1, Ldefpackage/yo;->r:Ldefpackage/ap;

    .line 14
    .line 15
    iget-object v1, v1, Ldefpackage/ap;->b:Ldefpackage/zo;

    .line 16
    .line 17
    iget-object v1, v1, Ldefpackage/zo;->J:Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    sub-int/2addr v0, v1

    .line 24
    :goto_0
    invoke-direct {p0}, Ldefpackage/k33;->getIconOrContainer()Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 33
    .line 34
    iget v2, v1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 35
    .line 36
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    iget-object p0, p0, Ldefpackage/k33;->A:Landroid/widget/ImageView;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    add-int/2addr p0, v2

    .line 47
    iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 48
    .line 49
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    add-int/2addr v0, p0

    .line 54
    return v0
.end method

.method public static h(Landroid/view/View;II)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 6
    .line 7
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 8
    .line 9
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 10
    .line 11
    iput p2, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static j(Landroid/view/View;I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p0, v0, v1, v2, p1}, Landroid/view/View;->setPadding(IIII)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(FF)V
    .locals 2

    .line 1
    sub-float v0, p1, p2

    .line 2
    .line 3
    iput v0, p0, Ldefpackage/k33;->t:F

    .line 4
    .line 5
    const/high16 v0, 0x3f800000    # 1.0f

    .line 6
    .line 7
    mul-float v1, p2, v0

    .line 8
    .line 9
    div-float/2addr v1, p1

    .line 10
    iput v1, p0, Ldefpackage/k33;->u:F

    .line 11
    .line 12
    mul-float/2addr p1, v0

    .line 13
    div-float/2addr p1, p2

    .line 14
    iput p1, p0, Ldefpackage/k33;->v:F

    .line 15
    .line 16
    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/k33;->G:Ldefpackage/tu2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ldefpackage/tu2;->isChecked()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0, v0}, Ldefpackage/k33;->setChecked(Z)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public final c(Ldefpackage/tu2;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ldefpackage/k33;->G:Ldefpackage/tu2;

    .line 2
    .line 3
    invoke-virtual {p1}, Ldefpackage/tu2;->isCheckable()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0, v0}, Ldefpackage/k33;->setCheckable(Z)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ldefpackage/tu2;->isChecked()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0, v0}, Ldefpackage/k33;->setChecked(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ldefpackage/tu2;->isEnabled()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-virtual {p0, v0}, Ldefpackage/k33;->setEnabled(Z)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ldefpackage/tu2;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p0, v0}, Ldefpackage/k33;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p1, Ldefpackage/tu2;->e:Ljava/lang/CharSequence;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ldefpackage/k33;->setTitle(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    iget v0, p1, Ldefpackage/tu2;->a:I

    .line 37
    .line 38
    invoke-virtual {p0, v0}, Landroid/view/View;->setId(I)V

    .line 39
    .line 40
    .line 41
    iget-object v0, p1, Ldefpackage/tu2;->q:Ljava/lang/CharSequence;

    .line 42
    .line 43
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_0

    .line 48
    .line 49
    iget-object v0, p1, Ldefpackage/tu2;->q:Ljava/lang/CharSequence;

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    .line 54
    :cond_0
    iget-object v0, p1, Ldefpackage/tu2;->r:Ljava/lang/CharSequence;

    .line 55
    .line 56
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    iget-object v0, p1, Ldefpackage/tu2;->r:Ljava/lang/CharSequence;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    iget-object v0, p1, Ldefpackage/tu2;->e:Ljava/lang/CharSequence;

    .line 66
    .line 67
    :goto_0
    invoke-static {p0, v0}, Ldefpackage/e35;->S(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Ldefpackage/tu2;->isVisible()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_2

    .line 75
    .line 76
    const/4 p1, 0x0

    .line 77
    goto :goto_1

    .line 78
    :cond_2
    const/16 p1, 0x8

    .line 79
    .line 80
    :goto_1
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 81
    .line 82
    .line 83
    const/4 p1, 0x1

    .line 84
    iput-boolean p1, p0, Ldefpackage/k33;->n:Z

    .line 85
    .line 86
    return-void
.end method

.method public final d()V
    .locals 7

    .line 1
    iget-object v0, p0, Ldefpackage/k33;->p:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    iget-object v1, p0, Ldefpackage/k33;->o:Landroid/content/res/ColorStateList;

    .line 4
    .line 5
    iget-object v2, p0, Ldefpackage/k33;->y:Landroid/widget/FrameLayout;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Ldefpackage/k33;->getActiveIndicatorDrawable()Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-boolean v6, p0, Ldefpackage/k33;->N:Z

    .line 17
    .line 18
    if-eqz v6, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Ldefpackage/k33;->getActiveIndicatorDrawable()Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    if-eqz v6, :cond_0

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    new-instance v5, Landroid/graphics/drawable/RippleDrawable;

    .line 31
    .line 32
    iget-object v6, p0, Ldefpackage/k33;->o:Landroid/content/res/ColorStateList;

    .line 33
    .line 34
    invoke-static {v6}, Ldefpackage/l24;->c(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-direct {v5, v6, v4, v1}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 39
    .line 40
    .line 41
    move-object v4, v5

    .line 42
    move v5, v3

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    if-nez v0, :cond_1

    .line 45
    .line 46
    iget-object v0, p0, Ldefpackage/k33;->o:Landroid/content/res/ColorStateList;

    .line 47
    .line 48
    invoke-static {v0}, Ldefpackage/l24;->a(Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    new-instance v1, Landroid/graphics/drawable/RippleDrawable;

    .line 53
    .line 54
    invoke-direct {v1, v0, v4, v4}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 55
    .line 56
    .line 57
    move-object v0, v1

    .line 58
    :cond_1
    :goto_0
    if-eqz v2, :cond_2

    .line 59
    .line 60
    invoke-virtual {v2, v3, v3, v3, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v4}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    sget-object v1, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 67
    .line 68
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 69
    .line 70
    .line 71
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 72
    .line 73
    const/16 v1, 0x1a

    .line 74
    .line 75
    if-lt v0, v1, :cond_3

    .line 76
    .line 77
    invoke-static {p0, v5}, Ldefpackage/gm0;->o(Ldefpackage/k33;Z)V

    .line 78
    .line 79
    .line 80
    :cond_3
    return-void
.end method

.method public final dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Ldefpackage/k33;->y:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v1, p0, Ldefpackage/k33;->N:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method

.method public final e(FF)V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/k33;->z:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, Ldefpackage/k33;->L:Ldefpackage/tv1;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const v2, 0x3ecccccd    # 0.4f

    .line 11
    .line 12
    .line 13
    const/high16 v3, 0x3f800000    # 1.0f

    .line 14
    .line 15
    invoke-static {v2, v3, p1}, Ldefpackage/yd;->a(FFF)F

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-virtual {v0, v2}, Landroid/view/View;->setScaleX(F)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1, p2}, Ldefpackage/tv1;->q(FF)F

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {v0, v1}, Landroid/view/View;->setScaleY(F)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    cmpl-float p2, p2, v1

    .line 31
    .line 32
    if-nez p2, :cond_0

    .line 33
    .line 34
    const v2, 0x3f4ccccd    # 0.8f

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v2, v1

    .line 39
    :goto_0
    if-nez p2, :cond_1

    .line 40
    .line 41
    move p2, v3

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const p2, 0x3e4ccccd    # 0.2f

    .line 44
    .line 45
    .line 46
    :goto_1
    invoke-static {v1, v3, v2, p2, p1}, Ldefpackage/yd;->b(FFFFF)F

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    invoke-virtual {v0, p2}, Landroid/view/View;->setAlpha(F)V

    .line 51
    .line 52
    .line 53
    :cond_2
    iput p1, p0, Ldefpackage/k33;->M:F

    .line 54
    .line 55
    return-void
.end method

.method public getActiveIndicatorDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/k33;->z:Landroid/view/View;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getBadge()Ldefpackage/yo;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/k33;->S:Ldefpackage/yo;

    .line 2
    .line 3
    return-object p0
.end method

.method public getItemBackgroundResId()I
    .locals 0

    .line 1
    const p0, 0x7f0802ca

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public getItemData()Ldefpackage/tu2;
    .locals 0

    .line 1
    iget-object p0, p0, Ldefpackage/k33;->G:Ldefpackage/tu2;

    .line 2
    .line 3
    return-object p0
.end method

.method public getItemDefaultMarginResId()I
    .locals 0

    .line 1
    const p0, 0x7f070597

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public abstract getItemLayoutResId()I
.end method

.method public getItemPosition()I
    .locals 0

    .line 1
    iget p0, p0, Ldefpackage/k33;->E:I

    .line 2
    .line 3
    return p0
.end method

.method public getSuggestedMinimumHeight()I
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/k33;->B:Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 8
    .line 9
    invoke-direct {p0}, Ldefpackage/k33;->getSuggestedIconHeight()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    iget p0, p0, Ldefpackage/k33;->s:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    :goto_0
    add-int/2addr v2, p0

    .line 24
    iget p0, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 25
    .line 26
    add-int/2addr v2, p0

    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    add-int/2addr p0, v2

    .line 32
    iget v0, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 33
    .line 34
    add-int/2addr p0, v0

    .line 35
    return p0
.end method

.method public getSuggestedMinimumWidth()I
    .locals 3

    .line 1
    iget-object v0, p0, Ldefpackage/k33;->B:Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 8
    .line 9
    iget v2, v1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    add-int/2addr v0, v2

    .line 16
    iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 17
    .line 18
    add-int/2addr v0, v1

    .line 19
    invoke-direct {p0}, Ldefpackage/k33;->getSuggestedIconWidth()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p0, v0}, Ljava/lang/Math;->max(II)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0
.end method

.method public final i(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/k33;->z:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    if-gtz p1, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    iget v1, p0, Ldefpackage/k33;->O:I

    .line 9
    .line 10
    iget v2, p0, Ldefpackage/k33;->R:I

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    mul-int/2addr v2, v3

    .line 14
    sub-int/2addr p1, v2

    .line 15
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 24
    .line 25
    iget-boolean v2, p0, Ldefpackage/k33;->Q:Z

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    iget v2, p0, Ldefpackage/k33;->w:I

    .line 30
    .line 31
    if-ne v2, v3, :cond_1

    .line 32
    .line 33
    move p0, p1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget p0, p0, Ldefpackage/k33;->P:I

    .line 36
    .line 37
    :goto_0
    iput p0, v1, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 38
    .line 39
    iput p1, v1, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    :goto_1
    return-void
.end method

.method public final onCreateDrawableState(I)[I
    .locals 1

    .line 1
    add-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/View;->onCreateDrawableState(I)[I

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Ldefpackage/k33;->G:Ldefpackage/tu2;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Ldefpackage/tu2;->isCheckable()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    iget-object p0, p0, Ldefpackage/k33;->G:Ldefpackage/tu2;

    .line 18
    .line 19
    invoke-virtual {p0}, Ldefpackage/tu2;->isChecked()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    sget-object p0, Ldefpackage/k33;->T:[I

    .line 26
    .line 27
    invoke-static {p1, p0}, Landroid/view/View;->mergeDrawableStates([I[I)[I

    .line 28
    .line 29
    .line 30
    :cond_0
    return-object p1
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 7

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/k33;->S:Ldefpackage/yo;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v0, p0, Ldefpackage/k33;->G:Ldefpackage/tu2;

    .line 15
    .line 16
    iget-object v1, v0, Ldefpackage/tu2;->e:Ljava/lang/CharSequence;

    .line 17
    .line 18
    iget-object v0, v0, Ldefpackage/tu2;->q:Ljava/lang/CharSequence;

    .line 19
    .line 20
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Ldefpackage/k33;->G:Ldefpackage/tu2;

    .line 27
    .line 28
    iget-object v1, v0, Ldefpackage/tu2;->q:Ljava/lang/CharSequence;

    .line 29
    .line 30
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v1, ", "

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget-object v1, p0, Ldefpackage/k33;->S:Ldefpackage/yo;

    .line 44
    .line 45
    invoke-virtual {v1}, Ldefpackage/yo;->c()Ljava/lang/CharSequence;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-direct {p0}, Ldefpackage/k33;->getItemVisiblePosition()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    const/4 v5, 0x0

    .line 64
    invoke-virtual {p0}, Landroid/view/View;->isSelected()Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    const/4 v1, 0x0

    .line 69
    const/4 v2, 0x1

    .line 70
    const/4 v4, 0x1

    .line 71
    invoke-static/range {v1 .. v6}, Ldefpackage/u3;->a(IIIIZZ)Ldefpackage/u3;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iget-object v0, v0, Ldefpackage/u3;->a:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    .line 78
    .line 79
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionItemInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/view/View;->isSelected()Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_2

    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->setClickable(Z)V

    .line 90
    .line 91
    .line 92
    sget-object v0, Ldefpackage/o3;->g:Ldefpackage/o3;

    .line 93
    .line 94
    iget-object v0, v0, Ldefpackage/o3;->a:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;

    .line 97
    .line 98
    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->removeAction(Landroid/view/accessibility/AccessibilityNodeInfo$AccessibilityAction;)Z

    .line 99
    .line 100
    .line 101
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    const v0, 0x7f130268

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityNodeInfo;->getExtras()Landroid/os/Bundle;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    const-string v0, "AccessibilityNodeInfo.roleDescription"

    .line 117
    .line 118
    invoke-virtual {p1, v0, p0}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    new-instance p2, Ldefpackage/rq;

    .line 5
    .line 6
    const/4 p3, 0x4

    .line 7
    invoke-direct {p2, p1, p3, p0}, Ldefpackage/rq;-><init>(IILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public setActiveIndicatorDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/k33;->z:Landroid/view/View;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ldefpackage/k33;->d()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setActiveIndicatorEnabled(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Ldefpackage/k33;->N:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/k33;->d()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldefpackage/k33;->z:Landroid/view/View;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/16 p1, 0x8

    .line 15
    .line 16
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method

.method public setActiveIndicatorHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/k33;->P:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, Ldefpackage/k33;->i(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setActiveIndicatorLabelPadding(I)V
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/k33;->s:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Ldefpackage/k33;->s:I

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/k33;->b()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setActiveIndicatorMarginHorizontal(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/k33;->R:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, Ldefpackage/k33;->i(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setActiveIndicatorResizeable(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ldefpackage/k33;->Q:Z

    .line 2
    .line 3
    return-void
.end method

.method public setActiveIndicatorWidth(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/k33;->O:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, Ldefpackage/k33;->i(I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setBadge(Ldefpackage/yo;)V
    .locals 4

    .line 1
    iget-object v0, p0, Ldefpackage/k33;->S:Ldefpackage/yo;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    iget-object v2, p0, Ldefpackage/k33;->A:Landroid/widget/ImageView;

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    .line 11
    if-eqz v2, :cond_3

    .line 12
    .line 13
    const-string v0, "NavigationBar"

    .line 14
    .line 15
    const-string v3, "Multiple badges shouldn\'t be attached to one item."

    .line 16
    .line 17
    invoke-static {v0, v3}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Ldefpackage/k33;->S:Ldefpackage/yo;

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Ldefpackage/k33;->S:Ldefpackage/yo;

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-virtual {v0}, Ldefpackage/yo;->d()Landroid/widget/FrameLayout;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    invoke-virtual {v0}, Ldefpackage/yo;->d()Landroid/widget/FrameLayout;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0, v1}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->getOverlay()Landroid/view/ViewOverlay;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v3, v0}, Landroid/view/ViewOverlay;->remove(Landroid/graphics/drawable/Drawable;)V

    .line 55
    .line 56
    .line 57
    :goto_0
    iput-object v1, p0, Ldefpackage/k33;->S:Ldefpackage/yo;

    .line 58
    .line 59
    :cond_3
    iput-object p1, p0, Ldefpackage/k33;->S:Ldefpackage/yo;

    .line 60
    .line 61
    if-eqz v2, :cond_5

    .line 62
    .line 63
    if-eqz p1, :cond_5

    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 70
    .line 71
    .line 72
    iget-object p0, p0, Ldefpackage/k33;->S:Ldefpackage/yo;

    .line 73
    .line 74
    new-instance p1, Landroid/graphics/Rect;

    .line 75
    .line 76
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, p1}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v2, v1}, Ldefpackage/yo;->i(Landroid/view/View;Landroid/widget/FrameLayout;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Ldefpackage/yo;->d()Landroid/widget/FrameLayout;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    if-eqz p1, :cond_4

    .line 93
    .line 94
    invoke-virtual {p0}, Ldefpackage/yo;->d()Landroid/widget/FrameLayout;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p1, p0}, Landroid/view/View;->setForeground(Landroid/graphics/drawable/Drawable;)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_4
    invoke-virtual {v2}, Landroid/view/View;->getOverlay()Landroid/view/ViewOverlay;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p1, p0}, Landroid/view/ViewOverlay;->add(Landroid/graphics/drawable/Drawable;)V

    .line 107
    .line 108
    .line 109
    :cond_5
    :goto_1
    return-void
.end method

.method public setCheckable(Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setChecked(Z)V
    .locals 12

    .line 1
    iget-object v0, p0, Ldefpackage/k33;->D:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x2

    .line 8
    div-int/2addr v1, v2

    .line 9
    int-to-float v1, v1

    .line 10
    invoke-virtual {v0, v1}, Landroid/view/View;->setPivotX(F)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/widget/TextView;->getBaseline()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    int-to-float v1, v1

    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setPivotY(F)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Ldefpackage/k33;->C:Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    div-int/2addr v3, v2

    .line 28
    int-to-float v3, v3

    .line 29
    invoke-virtual {v1, v3}, Landroid/view/View;->setPivotX(F)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/widget/TextView;->getBaseline()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    int-to-float v3, v3

    .line 37
    invoke-virtual {v1, v3}, Landroid/view/View;->setPivotY(F)V

    .line 38
    .line 39
    .line 40
    const/high16 v3, 0x3f800000    # 1.0f

    .line 41
    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    move v4, v3

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 v4, 0x0

    .line 47
    :goto_0
    iget-boolean v5, p0, Ldefpackage/k33;->N:Z

    .line 48
    .line 49
    const/4 v6, 0x1

    .line 50
    const/4 v7, 0x0

    .line 51
    if-eqz v5, :cond_3

    .line 52
    .line 53
    iget-boolean v5, p0, Ldefpackage/k33;->n:Z

    .line 54
    .line 55
    if-eqz v5, :cond_3

    .line 56
    .line 57
    sget-object v5, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-nez v5, :cond_1

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    iget-object v5, p0, Ldefpackage/k33;->K:Landroid/animation/ValueAnimator;

    .line 67
    .line 68
    if-eqz v5, :cond_2

    .line 69
    .line 70
    invoke-virtual {v5}, Landroid/animation/ValueAnimator;->cancel()V

    .line 71
    .line 72
    .line 73
    const/4 v5, 0x0

    .line 74
    iput-object v5, p0, Ldefpackage/k33;->K:Landroid/animation/ValueAnimator;

    .line 75
    .line 76
    :cond_2
    iget v5, p0, Ldefpackage/k33;->M:F

    .line 77
    .line 78
    new-array v8, v2, [F

    .line 79
    .line 80
    aput v5, v8, v7

    .line 81
    .line 82
    aput v4, v8, v6

    .line 83
    .line 84
    invoke-static {v8}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    iput-object v5, p0, Ldefpackage/k33;->K:Landroid/animation/ValueAnimator;

    .line 89
    .line 90
    new-instance v8, Ldefpackage/i33;

    .line 91
    .line 92
    invoke-direct {v8, p0, v4}, Ldefpackage/i33;-><init>(Ldefpackage/k33;F)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v5, v8}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 96
    .line 97
    .line 98
    iget-object v4, p0, Ldefpackage/k33;->K:Landroid/animation/ValueAnimator;

    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    const v8, 0x7f04039f

    .line 105
    .line 106
    .line 107
    sget-object v9, Ldefpackage/yd;->b:Ldefpackage/a61;

    .line 108
    .line 109
    invoke-static {v5, v8, v9}, Ldefpackage/g12;->O(Landroid/content/Context;ILandroid/animation/TimeInterpolator;)Landroid/animation/TimeInterpolator;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    invoke-virtual {v4, v5}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 114
    .line 115
    .line 116
    iget-object v4, p0, Ldefpackage/k33;->K:Landroid/animation/ValueAnimator;

    .line 117
    .line 118
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    const v9, 0x7f0b002b

    .line 127
    .line 128
    .line 129
    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getInteger(I)I

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    const v9, 0x7f04038f

    .line 134
    .line 135
    .line 136
    invoke-static {v5, v9, v8}, Ldefpackage/g12;->N(Landroid/content/Context;II)I

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    int-to-long v8, v5

    .line 141
    invoke-virtual {v4, v8, v9}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 142
    .line 143
    .line 144
    iget-object v4, p0, Ldefpackage/k33;->K:Landroid/animation/ValueAnimator;

    .line 145
    .line 146
    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->start()V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_3
    :goto_1
    invoke-virtual {p0, v4, v4}, Ldefpackage/k33;->e(FF)V

    .line 151
    .line 152
    .line 153
    :goto_2
    iget v4, p0, Ldefpackage/k33;->w:I

    .line 154
    .line 155
    const/4 v5, -0x1

    .line 156
    const/16 v8, 0x11

    .line 157
    .line 158
    const/16 v9, 0x31

    .line 159
    .line 160
    iget-object v10, p0, Ldefpackage/k33;->B:Landroid/view/ViewGroup;

    .line 161
    .line 162
    const/4 v11, 0x4

    .line 163
    if-eq v4, v5, :cond_9

    .line 164
    .line 165
    if-eqz v4, :cond_7

    .line 166
    .line 167
    if-eq v4, v6, :cond_5

    .line 168
    .line 169
    if-eq v4, v2, :cond_4

    .line 170
    .line 171
    goto/16 :goto_5

    .line 172
    .line 173
    :cond_4
    invoke-direct {p0}, Ldefpackage/k33;->getIconOrContainer()Landroid/view/View;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    iget v3, p0, Ldefpackage/k33;->q:I

    .line 178
    .line 179
    invoke-static {v2, v3, v8}, Ldefpackage/k33;->h(Landroid/view/View;II)V

    .line 180
    .line 181
    .line 182
    const/16 v2, 0x8

    .line 183
    .line 184
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 188
    .line 189
    .line 190
    goto/16 :goto_5

    .line 191
    .line 192
    :cond_5
    iget v2, p0, Ldefpackage/k33;->r:I

    .line 193
    .line 194
    invoke-static {v10, v2}, Ldefpackage/k33;->j(Landroid/view/View;I)V

    .line 195
    .line 196
    .line 197
    if-eqz p1, :cond_6

    .line 198
    .line 199
    invoke-direct {p0}, Ldefpackage/k33;->getIconOrContainer()Landroid/view/View;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    iget v4, p0, Ldefpackage/k33;->q:I

    .line 204
    .line 205
    int-to-float v4, v4

    .line 206
    iget v5, p0, Ldefpackage/k33;->t:F

    .line 207
    .line 208
    add-float/2addr v4, v5

    .line 209
    float-to-int v4, v4

    .line 210
    invoke-static {v2, v4, v9}, Ldefpackage/k33;->h(Landroid/view/View;II)V

    .line 211
    .line 212
    .line 213
    invoke-static {v0, v3, v3, v7}, Ldefpackage/k33;->g(Landroid/view/View;FFI)V

    .line 214
    .line 215
    .line 216
    iget v0, p0, Ldefpackage/k33;->u:F

    .line 217
    .line 218
    invoke-static {v1, v0, v0, v11}, Ldefpackage/k33;->g(Landroid/view/View;FFI)V

    .line 219
    .line 220
    .line 221
    goto/16 :goto_5

    .line 222
    .line 223
    :cond_6
    invoke-direct {p0}, Ldefpackage/k33;->getIconOrContainer()Landroid/view/View;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    iget v4, p0, Ldefpackage/k33;->q:I

    .line 228
    .line 229
    invoke-static {v2, v4, v9}, Ldefpackage/k33;->h(Landroid/view/View;II)V

    .line 230
    .line 231
    .line 232
    iget v2, p0, Ldefpackage/k33;->v:F

    .line 233
    .line 234
    invoke-static {v0, v2, v2, v11}, Ldefpackage/k33;->g(Landroid/view/View;FFI)V

    .line 235
    .line 236
    .line 237
    invoke-static {v1, v3, v3, v7}, Ldefpackage/k33;->g(Landroid/view/View;FFI)V

    .line 238
    .line 239
    .line 240
    goto/16 :goto_5

    .line 241
    .line 242
    :cond_7
    if-eqz p1, :cond_8

    .line 243
    .line 244
    invoke-direct {p0}, Ldefpackage/k33;->getIconOrContainer()Landroid/view/View;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    iget v3, p0, Ldefpackage/k33;->q:I

    .line 249
    .line 250
    invoke-static {v2, v3, v9}, Ldefpackage/k33;->h(Landroid/view/View;II)V

    .line 251
    .line 252
    .line 253
    iget v2, p0, Ldefpackage/k33;->r:I

    .line 254
    .line 255
    invoke-static {v10, v2}, Ldefpackage/k33;->j(Landroid/view/View;I)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 259
    .line 260
    .line 261
    goto :goto_3

    .line 262
    :cond_8
    invoke-direct {p0}, Ldefpackage/k33;->getIconOrContainer()Landroid/view/View;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    iget v3, p0, Ldefpackage/k33;->q:I

    .line 267
    .line 268
    invoke-static {v2, v3, v8}, Ldefpackage/k33;->h(Landroid/view/View;II)V

    .line 269
    .line 270
    .line 271
    invoke-static {v10, v7}, Ldefpackage/k33;->j(Landroid/view/View;I)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    .line 275
    .line 276
    .line 277
    :goto_3
    invoke-virtual {v1, v11}, Landroid/view/View;->setVisibility(I)V

    .line 278
    .line 279
    .line 280
    goto :goto_5

    .line 281
    :cond_9
    iget-boolean v2, p0, Ldefpackage/k33;->x:Z

    .line 282
    .line 283
    if-eqz v2, :cond_b

    .line 284
    .line 285
    if-eqz p1, :cond_a

    .line 286
    .line 287
    invoke-direct {p0}, Ldefpackage/k33;->getIconOrContainer()Landroid/view/View;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    iget v3, p0, Ldefpackage/k33;->q:I

    .line 292
    .line 293
    invoke-static {v2, v3, v9}, Ldefpackage/k33;->h(Landroid/view/View;II)V

    .line 294
    .line 295
    .line 296
    iget v2, p0, Ldefpackage/k33;->r:I

    .line 297
    .line 298
    invoke-static {v10, v2}, Ldefpackage/k33;->j(Landroid/view/View;I)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 302
    .line 303
    .line 304
    goto :goto_4

    .line 305
    :cond_a
    invoke-direct {p0}, Ldefpackage/k33;->getIconOrContainer()Landroid/view/View;

    .line 306
    .line 307
    .line 308
    move-result-object v2

    .line 309
    iget v3, p0, Ldefpackage/k33;->q:I

    .line 310
    .line 311
    invoke-static {v2, v3, v8}, Ldefpackage/k33;->h(Landroid/view/View;II)V

    .line 312
    .line 313
    .line 314
    invoke-static {v10, v7}, Ldefpackage/k33;->j(Landroid/view/View;I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v0, v11}, Landroid/view/View;->setVisibility(I)V

    .line 318
    .line 319
    .line 320
    :goto_4
    invoke-virtual {v1, v11}, Landroid/view/View;->setVisibility(I)V

    .line 321
    .line 322
    .line 323
    goto :goto_5

    .line 324
    :cond_b
    iget v2, p0, Ldefpackage/k33;->r:I

    .line 325
    .line 326
    invoke-static {v10, v2}, Ldefpackage/k33;->j(Landroid/view/View;I)V

    .line 327
    .line 328
    .line 329
    if-eqz p1, :cond_c

    .line 330
    .line 331
    invoke-direct {p0}, Ldefpackage/k33;->getIconOrContainer()Landroid/view/View;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    iget v4, p0, Ldefpackage/k33;->q:I

    .line 336
    .line 337
    int-to-float v4, v4

    .line 338
    iget v5, p0, Ldefpackage/k33;->t:F

    .line 339
    .line 340
    add-float/2addr v4, v5

    .line 341
    float-to-int v4, v4

    .line 342
    invoke-static {v2, v4, v9}, Ldefpackage/k33;->h(Landroid/view/View;II)V

    .line 343
    .line 344
    .line 345
    invoke-static {v0, v3, v3, v7}, Ldefpackage/k33;->g(Landroid/view/View;FFI)V

    .line 346
    .line 347
    .line 348
    iget v0, p0, Ldefpackage/k33;->u:F

    .line 349
    .line 350
    invoke-static {v1, v0, v0, v11}, Ldefpackage/k33;->g(Landroid/view/View;FFI)V

    .line 351
    .line 352
    .line 353
    goto :goto_5

    .line 354
    :cond_c
    invoke-direct {p0}, Ldefpackage/k33;->getIconOrContainer()Landroid/view/View;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    iget v4, p0, Ldefpackage/k33;->q:I

    .line 359
    .line 360
    invoke-static {v2, v4, v9}, Ldefpackage/k33;->h(Landroid/view/View;II)V

    .line 361
    .line 362
    .line 363
    iget v2, p0, Ldefpackage/k33;->v:F

    .line 364
    .line 365
    invoke-static {v0, v2, v2, v11}, Ldefpackage/k33;->g(Landroid/view/View;FFI)V

    .line 366
    .line 367
    .line 368
    invoke-static {v1, v3, v3, v7}, Ldefpackage/k33;->g(Landroid/view/View;FFI)V

    .line 369
    .line 370
    .line 371
    :goto_5
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 372
    .line 373
    .line 374
    invoke-virtual {p0, p1}, Landroid/view/View;->setSelected(Z)V

    .line 375
    .line 376
    .line 377
    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ldefpackage/k33;->C:Landroid/widget/TextView;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Ldefpackage/k33;->D:Landroid/widget/TextView;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Ldefpackage/k33;->A:Landroid/widget/ImageView;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 17
    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/16 v0, 0x3ea

    .line 26
    .line 27
    invoke-static {p1, v0}, Landroid/view/PointerIcon;->getSystemIcon(Landroid/content/Context;I)Landroid/view/PointerIcon;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    sget-object v0, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 32
    .line 33
    invoke-static {p0, p1}, Ldefpackage/c65;->a(Landroid/view/View;Landroid/view/PointerIcon;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    sget-object p1, Ldefpackage/j65;->a:Ljava/util/WeakHashMap;

    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    invoke-static {p0, p1}, Ldefpackage/c65;->a(Landroid/view/View;Landroid/view/PointerIcon;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/k33;->I:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-object p1, p0, Ldefpackage/k33;->I:Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    if-eqz p1, :cond_2

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :goto_0
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Ldefpackage/k33;->J:Landroid/graphics/drawable/Drawable;

    .line 26
    .line 27
    iget-object v0, p0, Ldefpackage/k33;->H:Landroid/content/res/ColorStateList;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    iget-object p0, p0, Ldefpackage/k33;->A:Landroid/widget/ImageView;

    .line 35
    .line 36
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public setIconSize(I)V
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/k33;->A:Landroid/widget/ImageView;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 8
    .line 9
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 10
    .line 11
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setIconTintList(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ldefpackage/k33;->H:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/k33;->G:Ldefpackage/tu2;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Ldefpackage/k33;->J:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setTintList(Landroid/content/res/ColorStateList;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Ldefpackage/k33;->J:Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public setItemBackground(I)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 28
    invoke-virtual {v0, p1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 29
    :goto_0
    invoke-virtual {p0, p1}, Ldefpackage/k33;->setItemBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setItemBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    :cond_0
    iput-object p1, p0, Ldefpackage/k33;->p:Landroid/graphics/drawable/Drawable;

    .line 22
    .line 23
    invoke-virtual {p0}, Ldefpackage/k33;->d()V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public setItemPaddingBottom(I)V
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/k33;->r:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Ldefpackage/k33;->r:I

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/k33;->b()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setItemPaddingTop(I)V
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/k33;->q:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput p1, p0, Ldefpackage/k33;->q:I

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/k33;->b()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setItemPosition(I)V
    .locals 0

    .line 1
    iput p1, p0, Ldefpackage/k33;->E:I

    .line 2
    .line 3
    return-void
.end method

.method public setItemRippleColor(Landroid/content/res/ColorStateList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ldefpackage/k33;->o:Landroid/content/res/ColorStateList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldefpackage/k33;->d()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setLabelVisibilityMode(I)V
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/k33;->w:I

    .line 2
    .line 3
    if-eq v0, p1, :cond_1

    .line 4
    .line 5
    iput p1, p0, Ldefpackage/k33;->w:I

    .line 6
    .line 7
    iget-boolean v0, p0, Ldefpackage/k33;->Q:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    if-ne p1, v0, :cond_0

    .line 13
    .line 14
    sget-object p1, Ldefpackage/k33;->V:Ldefpackage/j33;

    .line 15
    .line 16
    iput-object p1, p0, Ldefpackage/k33;->L:Ldefpackage/tv1;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object p1, Ldefpackage/k33;->U:Ldefpackage/tv1;

    .line 20
    .line 21
    iput-object p1, p0, Ldefpackage/k33;->L:Ldefpackage/tv1;

    .line 22
    .line 23
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {p0, p1}, Ldefpackage/k33;->i(I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ldefpackage/k33;->b()V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public setShifting(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ldefpackage/k33;->x:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Ldefpackage/k33;->x:Z

    .line 6
    .line 7
    invoke-virtual {p0}, Ldefpackage/k33;->b()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public setTextAppearanceActive(I)V
    .locals 1

    .line 1
    iput p1, p0, Ldefpackage/k33;->F:I

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/k33;->D:Landroid/widget/TextView;

    .line 4
    .line 5
    invoke-static {v0, p1}, Ldefpackage/k33;->f(Landroid/widget/TextView;I)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Ldefpackage/k33;->C:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/widget/TextView;->getTextSize()F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-virtual {v0}, Landroid/widget/TextView;->getTextSize()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {p0, p1, v0}, Ldefpackage/k33;->a(FF)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public setTextAppearanceActiveBoldEnabled(Z)V
    .locals 1

    .line 1
    iget v0, p0, Ldefpackage/k33;->F:I

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ldefpackage/k33;->setTextAppearanceActive(I)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldefpackage/k33;->D:Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p0, v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setTextAppearanceInactive(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/k33;->C:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-static {v0, p1}, Ldefpackage/k33;->f(Landroid/widget/TextView;I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/widget/TextView;->getTextSize()F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iget-object v0, p0, Ldefpackage/k33;->D:Landroid/widget/TextView;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/widget/TextView;->getTextSize()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-virtual {p0, p1, v0}, Ldefpackage/k33;->a(FF)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public setTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Ldefpackage/k33;->C:Landroid/widget/TextView;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Ldefpackage/k33;->D:Landroid/widget/TextView;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldefpackage/k33;->C:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ldefpackage/k33;->D:Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Ldefpackage/k33;->G:Ldefpackage/tu2;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Ldefpackage/tu2;->q:Ljava/lang/CharSequence;

    .line 16
    .line 17
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v0, p0, Ldefpackage/k33;->G:Ldefpackage/tu2;

    .line 27
    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    iget-object v0, v0, Ldefpackage/tu2;->r:Ljava/lang/CharSequence;

    .line 31
    .line 32
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    iget-object p1, p0, Ldefpackage/k33;->G:Ldefpackage/tu2;

    .line 40
    .line 41
    iget-object p1, p1, Ldefpackage/tu2;->r:Ljava/lang/CharSequence;

    .line 42
    .line 43
    :cond_3
    :goto_0
    invoke-static {p0, p1}, Ldefpackage/e35;->S(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method
